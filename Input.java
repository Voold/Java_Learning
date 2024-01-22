package firstStep;

public class Input {
    public void input(){
        System.out.println(  "-------INPUT!-------");
        System.out.print("Enter something: ");

        String username = Main.scan.nextLine();
        System.out.printf("Your name is: %s\n",username);
        
        // int num1 = Integer.parseInt(Main.scan.nextLine());
        // System.out.printf("Your number is: %d\n", num1);
        
        // byte b1 = Main.scan.nextByte();
        // boolean b2 = Main.scan.nextBoolean();
        
        
    }
}
