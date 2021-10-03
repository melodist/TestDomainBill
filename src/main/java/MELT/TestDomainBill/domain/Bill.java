package MELT.TestDomainBill.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by melodist
 * User: MELT
 * Date: 2021-10-03 003
 * Time: 오후 3:43
 */
@Entity
public class Bill {

    @Id @GeneratedValue
    private Long id;

    private boolean succeed;

    protected Bill() {}

    public static Bill createBill() {
        return new Bill();
    }
}
