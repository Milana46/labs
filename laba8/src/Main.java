
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) throws IOException {


        ArrayList<Pribor> pribors = new ArrayList<>();

        FileOutputStream file = new FileOutputStream("data.txt");//файловыйф объект
        ObjectOutputStream oos = new ObjectOutputStream(file);//поток;
        oos.writeObject(new Fridge(220, "Sumsung"));
        oos.writeObject(new TV(150, "LG"));
        oos.writeObject(new Iron(140, "Tefal"));


        FileInputStream fout = new FileInputStream("data.txt");
        ObjectInputStream in = new ObjectInputStream(fout);
        try {
            for (; ; ) {
                pribors.add((Pribor) in.readObject());
            }
        } catch (EOFException e) {

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        for (Pribor i : pribors) {
            i.on();
        }


        int finishPower = 0;

        for (Pribor i : pribors) {
            finishPower += i.getP();
        }

        System.out.println("Общая потребляемая мощность составляет:" + finishPower);
        MaxiSorter.getInstance().sort(pribors);

        System.out.println("Сортировка по мощности:");

        for (Pribor i : pribors) {
            System.out.println(i.getName() + ' ' + i.getP());
        }

        int MinP=100;
        int MaxP=200;

        for(Pribor i:pribors){
            if (i.getP()>=MinP && i.getP()<=MaxP) {
                System.out.println("В заданный диапазон мощ6ности входят:"+i.getP());
            }
        }

    }

}