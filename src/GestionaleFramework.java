public class GestionaleFramework {
    //this simulates an accounting framework.
    //Everything here is private, only the interfaces are accessable
    Delegate delegate;
    public GestionaleFramework(){
        this.delegate = new FrameworkAdapter();
    }

    public float getTotalValue(){
        return delegate.getTotalValue();
    }
    public String getCustomerList(){
        return delegate.getCustomerList();
    }
}
