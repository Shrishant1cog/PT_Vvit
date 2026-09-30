public class trycatchdemo {
    public static void main(String[] args) {
        int n =2;
        try {
            int solution = n/0;
            
        } 
        catch (Exception e) {
            {
                System.out.println("cant divide by zero");
            }
            
        }
        finally {
            System.out.println("Cleanup code executed");
        }
    }
}
