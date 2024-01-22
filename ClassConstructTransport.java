package firstStep;


public class ClassConstructTransport {
    
    private float speed;
    private int weight;
    private String color;
    private Byte[] coord;

    // public ClassConstructTransport(){

        //Конструктор по - умолчанию;

    // }

    public ClassConstructTransport(float speed, int weight, String color, Byte[] coord){
        //Join DB
        setValues(speed, weight, color, coord);

        // this.speed = speed;
        // this.weight = weight;
        // this.color = color;
        // this.coord = coord;

        System.out.println("Object created!");
        System.out.println(this.getValues());
    }

    public ClassConstructTransport(float speed, int weight){
        //Join DB
        setValues(speed, weight, "NONE", new Byte[] {0,0,0});

        // this.speed = speed;
        // this.weight = weight;
        // this.color = color;
        // this.coord = coord;

        System.out.println("Object created!");
        System.out.println(this.getValues());
    }

    public void setValues(float speed, int weight, String color, Byte[] coord) {
        this.speed = speed;
        this.weight = weight;
        this.color = color;
        this.coord = coord;
    }

    public String getValues(){
        String infCoord = "\nCoordinates: \n";
        for (Byte el: coord) infCoord+=el+" ";
        String info = "speed: " + speed + ".\nWeight: "+ weight + ".\nColor: "+ color+ infCoord+"\n";
        return info;
    }

}
