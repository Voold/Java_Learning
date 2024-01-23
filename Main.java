package firstStep;

import java.util.Scanner;

// import firstStep.DBfolder.DB; импорт класса из вложенного пакета

// import firstStep.Variable;

public class Main {

    public static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args){
        
        // System.out.print("Hello World!\n");
        // System.out.println("Hello World!");
        // Variable obj0 = new Variable();
        // obj0.variable();
        // Input obj1 = new Input();
        // obj1.input();
        // IfElse obj2 = new IfElse();
        // obj2.ifelse();
        // ForWhile obj3 = new ForWhile();
        // obj3.forwhile();
        // Arrays obj4 = new Arrays();
        // obj4.arrays();
        // CollectionMap.collectionmap(); //but it`s static //НАДО БУДЕТ УГЛУБИТЬСЯ
        // Functions.functions();
        // System.out.println("====================");
        // Functions.Method1("Bro");

        // OOPTransport bmw = new OOPTransport();
        // bmw.setValues(250.5f, 2500, "White", new Byte[] {0,0,0});
        // bmw.speed = 250.5f;
        // bmw.weight = 2500;
        // bmw.color = "White";
        // bmw.coord = new Byte[] {0,0,0};
        
        // OOPTransport truck = new OOPTransport();
        // truck.setValues(140.5f, 5600, "Red", new Byte[] {100,0,100});
        // truck.speed = 140.5f;
        // truck.weight = 5600;
        // truck.color = "Red";
        // truck.coord = new Byte[] {100,0,100};

        // System.out.println("Truck speed: "+ truck.speed);
        // System.out.println("BMW speed: "+ bmw.speed);

        // System.out.println(truck.getValues());
        // System.out.println(bmw.getValues());
        

        // ClassConstructTransport bmw = new ClassConstructTransport(250.5f, 2500, "White", new Byte[] {10,12,3});
        
        // ClassConstructTransport truck = new ClassConstructTransport(140.5f, 5600);
        
        // TransportCAR bmw = new TransportCAR();
        // TransportTRUCK truck = new TransportTRUCK(); // по умолчанию не загружен
        // truck.getLoaded();
        // truck.setLoaded(true);
        // truck.getLoaded();
        // truck.setValues(123.4f, 4567, "Red", new byte[] {0,0,0});
        // bmw.setValues(193.8f, 2232, "Blue", new byte[] {10,20,20});

        // DB

        // info();
        // info("Voold");

        // Person.count = 5;

        TransportCAR bmw = new TransportCAR();

        bmw.setLight(true);
        bmw.blinkLight();

        scan.close();
    }

    public static void info(){
        System.out.println("Hello");
    }

    public static void info(String UserName){
        System.out.println("Hello, "+UserName);
    }

}
