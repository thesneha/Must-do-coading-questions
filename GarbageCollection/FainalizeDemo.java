package GarbageCollection;

public class FainalizeDemo {
    static  FainalizeDemo s;
    public  static void main(String[]args) throws Exception
    {
        FainalizeDemo f= new FainalizeDemo();
        System.out.println(f.hashCode());
        f=null;
        System.gc();
        Thread.sleep(5000);

        System.out.println(s.hashCode());
        s=null;
        System.gc();
        Thread.sleep(1000);
        System.out.println("Main ends");

    }

    public void finalize(){

        System.out.println("finalize method calles");
        s=this;
    }


}
