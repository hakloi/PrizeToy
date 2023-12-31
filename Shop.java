import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Shop {
    private ArrayList<Toy> toys;
    private ArrayList<Toy> prizeToys;
    private String prizeFilePath;

    public Shop() {
        toys = new ArrayList<Toy>();
        prizeToys = new ArrayList<Toy>();
        prizeFilePath = "our_toys.txt";
    }

    public void addToy(Toy toy) {
        toys.add(toy);
    }

    public void changeToyFrequency(int toyId, double newFrequency) {
        for (Toy toy : toys) {
            if (toy.getId() == toyId) {
                toy.setFrequency(newFrequency);
            }
        }
    }

    public void organizeLottery() {
        // clear console
        System.out.print("\033[H\033[2J");  
        System.out.flush();  

        // code begins
        prizeToys.clear();

        for (Toy toy : toys) {
            double random = Math.random() * 100;
            if (random < toy.getFrequency()) {
                prizeToys.add(toy);
            }
        }
    }
    public Toy getPrizeToy() {
        if (!prizeToys.isEmpty()) {
            Toy prizeToy = prizeToys.remove(0);
            prizeToy.setCount(prizeToy.getCount() - 1);

            try {
                FileWriter writer = new FileWriter(prizeFilePath, true);
                writer.write(prizeToy.getName() + "\n");
                writer.close();
            } catch (IOException e) {
                System.out.println("Error!");
            }

            return prizeToy;
        } else {
            System.out.println("Our shop is empty! Return later!");
            return null;
        }
    }
}


  

