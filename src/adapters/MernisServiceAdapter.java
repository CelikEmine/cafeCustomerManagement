package adapters;

import abstracts.PersonCheckService;
import entities.Customer;

public class MernisServiceAdapter implements PersonCheckService {


    @Override
    public boolean checkIfRealPerson(Customer customer) {

        System.out.println("mernis ile doğrulama yapıldı");
        return false;
    }
}
