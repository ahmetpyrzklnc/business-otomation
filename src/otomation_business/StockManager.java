package otomation_business;

public class StockManager {

    private int id;
    private String stock_amount_name;
    private String stock_amount_model;
    private int stock_amount_price;
    private int stock_amount_stock;

    public StockManager(int id, String stock_amount_name, String stock_amount_model, int stock_amount_price, int stock_amount_stock) {
        this.id = id;
        this.stock_amount_name = stock_amount_name;
        this.stock_amount_model = stock_amount_model;
        this.stock_amount_price = stock_amount_price;
        this.stock_amount_stock = stock_amount_stock;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStock_amount_name() {
        return stock_amount_name;
    }

    public void setStock_amount_name(String stock_amount_name) {
        this.stock_amount_name = stock_amount_name;
    }

    public String getStock_amount_model() {
        return stock_amount_model;
    }

    public void setStock_amount_model(String stock_amount_model) {
        this.stock_amount_model = stock_amount_model;
    }

    public int getStock_amount_price() {
        return stock_amount_price;
    }

    public void setStock_amount_price(int stock_amount_price) {
        this.stock_amount_price = stock_amount_price;
    }

    public int getStock_amount_stock() {
        return stock_amount_stock;
    }

    public void setStock_amount_stock(int stock_amount_stock) {
        this.stock_amount_stock = stock_amount_stock;
    }
}
