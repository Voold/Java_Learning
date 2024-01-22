package firstStep;

public class Functions {
    public static void functions(){
        System.out.println("-------Methods------");

        Method1("Voold");

        System.out.print("Enter a number: ");
        short a = Short.parseShort(Main.scan.nextLine());
        int res = Sum(a, (short)6);
        System.out.printf("Result is: %d\n",res);
        Method1(String.valueOf(res));
    } 

    public static void Method1(String UserName){
        System.out.println("Hello, " + UserName);
    }

    public static int Sum(short a, short b){
        System.out.println("a + b ???");    
        return a+b;
    }
}
