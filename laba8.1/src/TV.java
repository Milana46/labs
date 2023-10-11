public class TV extends Pribor{


    int dp;
    String Inet;

    public Integer getDp(){
        return dp;
    }
    public String getInet(){return Inet;}


    public TV(Integer P,String name,int dp,String Inet) {
        super(P, name);
    }




    @Override
    public void on(){
        System.out.println("Телек включен в розетку"+' '+TV.this.getName());

    }


}
