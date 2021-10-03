package MELT.TestDomainBill.repository;

import MELT.TestDomainBill.domain.Bill;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

/**
 * 결제 Repository
 *
 * Created by melodist
 * User: MELT
 * Date: 2021-10-03 003
 * Time: 오후 3:43
 */
@Repository
@RequiredArgsConstructor
public class BillRepository {

    private final EntityManager em;

    public void save(Bill bill) {
        em.persist(bill);
    }
}
