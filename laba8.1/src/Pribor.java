import java.io.Serializable;

 abstract  public class Pribor implements Serializable {
    //private  String name;

    private Integer P;
    private String name;

    public Pribor(Integer P, String name){
        this.P=P;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public Integer getP(){
        return P;
    }

    public void on(){}

}

