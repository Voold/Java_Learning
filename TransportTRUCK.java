package firstStep;

public class TransportTRUCK extends ClassConstructTransport {

    public TransportTRUCK(){

    }
    
    private boolean isLoaded; // Загружен ли грузовик?

    public TransportTRUCK(float speed, int weight){
        super(speed, weight); //Передаем в класс родитель 2 параметра, которе примет конструктор на 2 параметра.
    }

    public TransportTRUCK(float speed, int weight, boolean isLoaded){
        super(speed, weight); //Передаем в класс родитель 2 параметра, которе примет конструктор на 2 параметра.
        this.isLoaded = isLoaded;
    }

    //polymorphism

    // @Override

    // public void setValues(float speed, int weight, String color, byte[] coord){
    //     super.setValues(speed,weight,color,coord);
    //     System.out.println(this.getValues());
    //     System.out.println("++Дополнительный функционал!");
    // } 
    
    public void setValues(float speed, int weight, String color, byte[] coord, boolean isLoaded){
        super.setValues(speed,weight,color,coord);
        this.isLoaded = isLoaded;
        System.out.println(this.getValues());
        System.out.println("exT");
    }

    @Override
    public String getValues(){
        return super.getValues() + "is Loaded: " + isLoaded;
    }

    public void setLoaded(boolean loaded){
        isLoaded = loaded;
    }

    public void getLoaded(){
        if(isLoaded) System.out.println("Грузовик загружен");
        else System.out.println("Грузовик не загружен");
    }
}
