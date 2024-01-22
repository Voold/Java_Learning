package firstStep;


public class ClassConstructTransport {
    
    protected float speed;
    protected int weight;
    protected String color;
    protected byte[] coord;

    public ClassConstructTransport(){

        // Конструктор по - умолчанию;

    }


    public ClassConstructTransport(float speed, int weight, String color, byte[] coord){
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
        setValues(speed, weight, "NONE", new byte[] {0,0,0});

        // this.speed = speed;
        // this.weight = weight;
        // this.color = color;
        // this.coord = coord;

        System.out.println("Object created!");
        System.out.println(this.getValues());
    }

    protected void setValues(float speed, int weight, String color, byte[] coord) {
        this.speed = speed;
        this.weight = weight;
        this.color = color;
        this.coord = coord;
        // System.out.println(this.getValues());
        // System.out.println("MT");
    }

    protected String getValues(){
        String infCoord = "\nCoordinates: \n";
        for (Byte el: coord) infCoord+=el+" ";
        String info = "speed: " + speed + ".\nWeight: "+ weight + ".\nColor: "+ color+ infCoord+"\n";
        return info;
    }

}
