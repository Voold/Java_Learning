package firstStep;

public class ClassInClass {  //КЛАСС ОПИСВАЕТ МАШИНУ
    //Описать двигатель в машине Класс машина -> класс двигатель

    // private float speed;
    // private int weight;
    // private String color;
    // private Byte[] coord;
    // private Engine Engine;

    // private Engine Engine = new Engine(true,100);


    public class Engine{

        private boolean isReady;
        private int km;

        //Можно как конструктор. а можно через метод
        // public Engine(boolean isReady, int km){
        //     this.isReady = isReady;
        //     this.km = km;
        // }

        public void setEngineValues(boolean isReady, int km){
            this.isReady = isReady;
            this.km = km;
        }

        public void info(){
            if(isReady) System.out.println("Он рабочий");
            else System.out.println("Он сломался, он проехал - "+ km);
        }

        //BMW.Engine.info();


    }
}
