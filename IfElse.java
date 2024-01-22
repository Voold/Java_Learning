package firstStep;

public class IfElse {
    public void ifelse(){
        System.out.println("-------IF_ELSE-------");
        System.out.print("Pls, enter the INT: ");
        int i = Integer.parseInt(Main.scan.nextLine());
        if (5>i){
            System.out.println("lol wtf");
            System.out.println("lol wtf");
        }
        else if(i>10) System.out.println("Понятно");
        else System.out.println("непонятно");

        System.out.print("Enter good: ");
        String question = Main.scan.nextLine();
        if (question.equals("good")) System.out.println("SO GOOD!!!");
        else System.out.println("not good...");

        System.out.println("1 - Понятно \n2 - Непонятно \n3 - Абалдеть");
        i = Integer.parseInt(Main.scan.nextLine());
        switch (i) {
            case 1:
                System.out.println("Понятно");
                break;      
            case 2:
                System.out.println("Непонятно");
                break;     
            case 3:
                System.out.println("Абалдеть");
                break;
        
            default:
                System.out.println("Ты дурак)");
                break;
        }
    }
}
