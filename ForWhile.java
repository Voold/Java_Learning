package firstStep;

public class ForWhile {
    public void forwhile(){
        System.out.println("-------FOR_WHILE-------");

        int i = 0;
        for(;;){
            System.out.printf(" i is: %d\n",i);
            i++;
            if (i==5) break;
        }

        while (i<11){
            i++;
            if(i%2 == 0) continue;
            System.out.printf("I is: %d\n",i);
        }

        do{
            System.out.println("Do-While");
        }while(i<5);
    }
}
