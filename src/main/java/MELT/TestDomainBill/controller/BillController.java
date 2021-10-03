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
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bill")
@RequiredArgsConstructor
public class BillController {

    private final BillService billService;

    @PutMapping("/createBill")
    public ResponseEntity<Boolean> createBill() {
        if (billService.createBill()) {
            return new ResponseEntity<Boolean>(HttpStatus.OK);
        } else {
            return new ResponseEntity<Boolean>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
