public class test {
    public static void main(String[] args) {

     welcome("Shrishant", 19);

        
        
    }
    static void squaren(int a,int b){
       
        System.out.println((a*a)+(b*b)+(2*a*b));
    }
    static void breakcontinuee(){
                for(int i =0;1<10;i++)
        {
            if(i==3 || i == 5)
            {
                continue;

            }
            if(i==8)
            {
                break;
            }
            System.out.println(i);
        }

    }
    //parametarized method
    static int add(int a,int b) {
        return a+b;

        
    }

    static void welcome(String name,int age){
        System.out.println("Welcome "+name+","+"You are "+age+" Old");
        
    }
}
