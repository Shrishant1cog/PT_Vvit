public class test {
    public static void main(String[] args) {

System.out.println(factorial(6));
        
        
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
    static void angs(){


        for(int i =1;i<10;i++)
        {
            for(int j= 0;j<10;j++)
            {
                for(int k =0;k<10;k++)
                {
                    if(i*i*i+j*j*j+k*k*k == i*100+j*10+k)
                    {
                        System.out.println(i*100+j*10+k);
                    }
                }
            }
        }
    }
    static void armgs(int a){
        int i = a%10;
        int j = a%100;
        int k = a%1000;
        if(i*i*i+j*j*j+k*k*k == i*100+j*10+k)
        {
           System.out.println("It is angstrom number");
        }
        else {
            System.out.println("It is not angstrom number ");
        }


        
    }
    static void SL1(int a){
        for(int i = 0;i<a;i++)
        {
            for(int j =0;j<a;j++)
            {
                System.out.println("*");
            }
            System.out.println();
        }
    }
    static void cal(char a,int b, int c)
    { 
        switch(a) {
            case 'a':
                System.out.println("Addition is "+(b+c));
                break;
        
            case 's':
                System.out.println("Subtraction is "+(b-c));
                break;
            case 'm':
                System.out.println("Multiplication is "+(b*c));
                break;
            case 'd':
                System.out.println("Division is "+b/c);
                break;
            
            default:
                System.out.println("Enter correctly like mentioned below \nAddition --->'a'\nSubtraction----> 's'\nMultiplication---->'m'\nDivision--->'d'");
                break;

        }

    }
    static void sa(){
        int num[]  = {1,2,3,4,5};
        int sum =0;
        
        for(int i = 0;i <num.length;i++)
        {
            sum += num[i];

        }
        System.out.println("Mean is "+(sum/(num.length))+"\n"+"Sum is "+sum+"\n");
        

    }
    static void  SL2(int a){
        int in = 0;
        for(int  i= 0;  i< a;i ++) {
            for(int j=0;j<a;j++)
            {
                in++;
                System.out.print(a+" ");
            }
            System.out.println("");
            
            
        }
        System.out.println(in);

    }
    static void SL3(int a){
        for(int  i= 0;  i< a;i ++) {
            for(int j=0;j<a;j++)
            {
                for(int k=0;k<a;k++)
                {
                System.out.print(a+" ");
                }
                System.out.println();
            }
            System.out.println("");
            
            
        }

    }
    static void TwoDarray(int n,int m){
        int a[][] = new int[n][m];
        int k =0;
        int sum =0;
        for(int i =0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                k++;
            
                a[i][j] = k;
                sum +=k;
                System.out.print(a[i][j]+" ");
                



            }
            System.out.println();
        }
        System.out.println("Sum ="+sum);


    }
    static void twosum(){
        int arr[] = {1,3,5,4,9,6};
        int target = 5;
        boolean isPresent = false;
        for(int i=0;i<arr.length;i++)
        {
          for(int j=0;j<arr.length;j++)
          {
            if(arr[i]+arr[j]==target)
            {
                System.out.println(arr[i]+" "+arr[j]+" in index "+i+","+j);
                isPresent = true;
            }
          }
        }
        if(isPresent)
        {
            System.out.println("Present");
        }
        else
        {
            System.out.println("Not present");
        }
        }
        static void stringb(){
            String city = "Benguluru";
            System.out.println(city.length());
            System.out.println(city.toUpperCase());
            System.out.println(city.equals("Bengaluru"));
            String first = "Java";
            String second = "Programming";
            String combined = first +" "+ second;
            String withNumber = "score: " + 95;
            System.out.println(combined);
            System.out.println(withNumber);
            String a = new String("Java");
            String b = new String("Java");

            System.out.println(a==b); //false
            System.out.println(a.equals(b));
     


        }
        static void vowelcounter(String s){
            char a ;
            int count = 0;
            for (int i = 0; i < s.length(); i++) {
                a =s.charAt(i);
                if(a=='a' | a=='e' |a=='i' |a =='o' | a=='u')
                {
                    count++;
                }
        
            }
            System.out.println("Total number of vowels: "+count);

        }
        static void recurtionn(int n){
            if(n==0)
            {
                return;
            }
            recurtionn(n-1);
            System.out.println(n);
            
        }
        static int factorial(int n){
            if(n==0 | n==1)
            
            {
                return 1;
            }
            return n*factorial(n-1);
            
        
            


            
           
           
            
  
        }

}
                                                                                





 
