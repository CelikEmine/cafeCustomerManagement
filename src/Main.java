import abstracts.BaseCustomerManager;
import adapters.MernisServiceAdapter;
import concretes.NeroCustomerManager;
import concretes.StarbuckCustomerManager;
import entities.Customer;

public class Main {

    public static void main(String[] args) {

        Customer customer1=new Customer(1,"emine","çelik",1995,"3185698544");

        BaseCustomerManager baseCustomerManager=new NeroCustomerManager();
        baseCustomerManager.save(customer1);

        baseCustomerManager=new StarbuckCustomerManager(new MernisServiceAdapter());
        baseCustomerManager.save(customer1);


    }
}
