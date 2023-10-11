public class Iron extends Pribor{


    int temp;
    String functions;

    public Integer getTemp() {
        return temp;
    }
    public String getFunctions(){return functions;}


    public Iron(Integer P,String name,int temp,String functions) {
        super(P, name);

    }



    @Override
    public void on(){
        System.out.println("Утюг включен в розетку"+' '+Iron.this.getName());

    }
}

