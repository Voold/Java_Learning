package firstStep;

public class TransportCAR extends ClassConstructTransport {

    public TransportCAR(){

    }

    public TransportCAR(float speed, int weight, String color, byte[] coord){
        super(speed, weight, color, coord);
    }
    
    // @Override
    // public void setValues(float speed, int weight, String color, byte[] coord){
    //     super.setValues(speed,weight,color,coord);
    //     System.out.println(this.getValues());
    // }

}
