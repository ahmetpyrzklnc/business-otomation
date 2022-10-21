
package otomation_business;


public class CustomerManager {
    private int customer_id;
    private String customer_name;
    private String customer_lastname;

    public CustomerManager(int customer_id, String customer_name, String customer_lastname) {
        this.customer_id = customer_id;
        this.customer_name = customer_name;
        this.customer_lastname = customer_lastname;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getCustomer_lastname() {
        return customer_lastname;
    }

    public void setCustomer_lastname(String customer_lastname) {
        this.customer_lastname = customer_lastname;
    }
}
