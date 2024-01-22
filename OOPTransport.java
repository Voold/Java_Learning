package firstStep;

public class OOPTransport {

    //public - доступна отосвсюду
    //protected - доступен только внутри самого этого класса и классов наследников
    //private - закрыто. Виден только в пределах самого класса

    public float speed;
    public int weight;
    public String color;
    public Byte[] coord;

    public void setValues(float _speed, int _weight, String _color, Byte[] _coord) {
        speed = _speed;
        weight = _weight;
        color = _color;
        coord = _coord;
    }

    public String getValues(){
        String infCoord = "\nCoordinates: \n";
        for (Byte el: coord) infCoord+=el+", ";
        String info = "\nObject\nspeed: " + speed + ".\nWeight: "+ weight + ".\nColor: "+ color+ infCoord;
        return info;
    }
}
