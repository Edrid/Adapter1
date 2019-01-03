public class FrameworkAdapter implements Delegate {
    ShopDatabase db = new ShopDatabase();
    public float getTotalValue(){
        float totalValue = 0;
        for (float price:db.productsPrices)
            totalValue+=price;
        return totalValue;
    }

    public String getCustomerList(){
        String allCustomers="";
        for (String customer:db.customers)
            allCustomers = allCustomers+"---"+customer;
        return allCustomers;
    }
}
