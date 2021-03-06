/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean;

import entityclass.Territories;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Le Thi Minh Loan
 */
@Local
public interface TerritoriesFacadeLocal {

    void create(Territories territories);

    void edit(Territories territories);

    void remove(Territories territories);

    Territories find(Object id);

    List<Territories> findAll();

    List<Territories> findRange(int[] range);

    int count();
    
}
