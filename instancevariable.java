class instancevariable
{
    int num1=100;
    public void show()
    {
        System.out.println("From show method");
        System.out.println("The value of num1:"+num1);
    }
    public void display()
    {
        System.out.println("From display method");
        System.out.println("The value of num1:"+num1);
    }
    public static void main(String arg[])
    {
        instancevariable obj1 = new instancevariable();
        obj1.show();
        obj1.display(); 
    }
}