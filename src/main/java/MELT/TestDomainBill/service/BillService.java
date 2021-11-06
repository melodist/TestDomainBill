package MELT.TestDomainBill.service;

import MELT.TestDomainBill.repository.BillRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 결제 Service
 *
 * Created by melodist
 * User: MELT
 * Date: 2021-10-03 003
 * Time: 오후 3:43
 */
@Service
@RequiredArgsConstructor
@Transactional
public class BillService {

    private final BillRepository billRepository;

    /**
     * 결제를 성공하거나 실패한다.
     * @return
     */
    public boolean createBill() {
        if (Math.random() > 0.5) {
            return true;
        } else {
            return false;
        }
    }

    public boolean createBillV2(Long itemId) {
        if (itemId == 1) {
            return true;
        } else {
            return false;
        }
    }
}
