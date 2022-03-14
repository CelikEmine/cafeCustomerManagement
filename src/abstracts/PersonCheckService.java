package abstracts;

import entities.Customer;

public interface PersonCheckService {
    boolean checkIfRealPerson(Customer customer);
}
