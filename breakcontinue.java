public class breakcontinue {
    public static void main(String[] args) {

        squaren(10,15);


        
        
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
}
