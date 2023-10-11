public class Fridge extends Pribor {


    int v;

    public Integer getV(){
        return v;
    }

    public Fridge(Integer P,String name,int V) {
        super(P,name);
    }


    @Override
        public void on(){
        System.out.println("Холодос включен в розетку"+' '+Fridge.this.getName());

    }

}
