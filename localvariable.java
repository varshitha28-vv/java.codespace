class localvariable
{
    public void   show()
    {
        int num1=100;
        System.out.println("From show method");
        System.out.println("The value of num1:"+num1);
    }
    public void display()
    {
        int num2=200;
        System.out.println("From display method");
        System.out.println("The value of num2:"+num2);
    }
    public static void main(String arg[])
    {
        localvariable obj1=new localvariable();
        obj1.show();
        obj1.display();
    }
}