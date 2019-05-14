package singleton;

public class SingletonImplementation {

	public static void main(String[] args) {
		BillPughSingleton.getInstance();
	}

}

class BillPughSingleton {

    private BillPughSingleton(){}
    
    private static class SingletonHelper{
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }
    
    public static BillPughSingleton getInstance(){
        return SingletonHelper.INSTANCE;
    }
}

