import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Cat> myCats = vvod(4);
        System.out.println(myCats);
        }

        public static ArrayList<Cat> vvod(int kolvo) {
            ArrayList<Cat> cats = new ArrayList<>();
            for (int i = 0; i < kolvo; i++) {
                System.out.println("Vvedite imj kota:");
                Scanner scanner1 = new Scanner(System.in);
                String name = scanner1.nextLine();
                System.out.println("Vvedite porody kota:");
                Scanner scanner2 = new Scanner(System.in);
                String poroda = scanner2.nextLine();
                if (poroda.equals(Porody.BRITGOLYBAY.toString()) || poroda.equals(Porody.MEINKYN.toString())
                        || poroda.equals(Porody.SIBIR.toString()) || poroda.equals(Porody.SCOTLAND.toString())
                        || poroda.equals(Porody.PERS.toString())) {
                    Cat cat = new Cat(name, Porody.valueOf(poroda));
                    cats.add(cat);
                }
                else {
                    Cat cat = new Cat(name, Porody.DVORJNIN);
                    cats.add(cat);
                }
            }
            return cats;
        }

    }


