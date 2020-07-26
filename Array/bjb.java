package Array;

class Parent
{
    int value = 1000;
}

class Child extends Parent
{
    int value = 10;
}

// Driver class
class Test
{
    public static void main(String[] args)
    {

        Parent cobj = new Child();
       // Parent par = cobj;
        Parent p= new Parent();
        Child c= new Child();

        // Using instanceof to make sure that par
        // is a valid reference before typecasting
        if (cobj instanceof Child)
        {
            System.out.println(((Child) cobj).value);
            System.out.println(c.value);
            System.out.println(p.value);

//            System.out.println("Value accessed through " +
//                    "parent reference with typecasting is " +
//                    ((Child)par).value);
        }
    }
}