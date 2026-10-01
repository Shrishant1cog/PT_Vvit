public class inheritance {
    public static void main(String[] args) {
    InheritClass example = new InheritClass();
    example.printSomething();
    }
    
}
interface InterfaceDemo
{
    public void printSomething();
}
interface InterfaceDemo2{
    public void printSomething();
}
class ParentParent{


}
class InheritClass extends ParentParent implements InterfaceDemo, InterfaceDemo2 {
    
    @Override
    public void printSomething()
    {
        System.out.println("Printing Something");
    }


    


    




}


