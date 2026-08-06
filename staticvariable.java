class staticvariable
{
    static int num1=100;
    static int num2=200;
    public void show()
    {
        System.out.println("From show method");
        System.out.println("The value of num1:"+num1);
        num1+=num2;
    }
    public void display()
    {
        System.out.println("From display method");
        System.out.println("The value of num1:"+num1);
        System.out.println("The value of num2:"+num2);
        System.out.println("The value of num1:"+num1);
    }
    public static void main (String arg[])
    {
        staticvariable obj1= new staticvariable();
        obj1.show();
        obj1.display();
    }
}