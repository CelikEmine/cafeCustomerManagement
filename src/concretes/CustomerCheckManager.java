package concretes;

import abstracts.PersonCheckService;
import entities.Customer;

public class CustomerCheckManager implements PersonCheckService {


    @Override
    public boolean checkIfRealPerson(Customer customer) {
        System.out.println("doğrulama yapıldı");
        return true;
    }
}
