package concretes;

import abstracts.BaseCustomerManager;
import abstracts.PersonCheckService;
import entities.Customer;

public class StarbuckCustomerManager extends BaseCustomerManager {

    PersonCheckService personCheckService;

    public StarbuckCustomerManager(PersonCheckService personCheckService) {
        this.personCheckService = personCheckService;
    }

    @Override
    public void save(Customer customer) {
        if(personCheckService.checkIfRealPerson(customer)){
            System.out.println("starbucks cafe save");
        }
        else{
            System.out.println("starbucks cafe save başarısız.");
        }
    }



}
