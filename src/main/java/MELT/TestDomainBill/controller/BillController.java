package MELT.TestDomainBill.controller;

/**
 * Created by melodist
 * User: MELT
 * Date: 2021-10-03 003
 * Time: 오후 3:43
 */

import MELT.TestDomainBill.service.BillService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bill")
@RequiredArgsConstructor
public class BillController {

    private final BillService billService;

    @PutMapping("/createBill")
    public ResponseEntity<String> createBill() {
        if (billService.createBill()) {
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    /**
     * 상품 ID에 따라 다른 결제 결과를 반환한다.
     * @param id : 상품 ID
     * @return : ResponseEntity
     */
    @GetMapping("/createBill/{id}")
    public ResponseEntity<String> createBillV2(@PathVariable Long id) {
        if (billService.createBillV2(id)) {
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
