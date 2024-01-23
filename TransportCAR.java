package firstStep;

public class TransportCAR extends ClassConstructTransport implements ILights {


    private boolean isOn;

    public TransportCAR(){

    }

    public TransportCAR(float speed, int weight, String color, byte[] coord){
        super(speed, weight, color, coord);
    }

    @Override
    public void setLight(boolean set) {
        this.isOn = set;
    }

    @Override
    public void blinkLight() {
        System.out.println("Мы моргаем фарами");
    }
    
    // @Override
    // public void setValues(float speed, int weight, String color, byte[] coord){
    //     super.setValues(speed,weight,color,coord);
    //     System.out.println(this.getValues());
    // }

}
