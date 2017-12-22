/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean;

import entityclass.CustomerDemographics;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Le Thi Minh Loan
 */
@Local
public interface CustomerDemographicsFacadeLocal {

    void create(CustomerDemographics customerDemographics);

    void edit(CustomerDemographics customerDemographics);

    void remove(CustomerDemographics customerDemographics);

    CustomerDemographics find(Object id);

    List<CustomerDemographics> findAll();

    List<CustomerDemographics> findRange(int[] range);

    int count();
    
}
