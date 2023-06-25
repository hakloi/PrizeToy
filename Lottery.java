public class Lottery {
    public static void main(String[] args) {
        Shop store = new Shop();

        Toy toy1 = new Toy(1, "Huggy Wuggy", 10, 20);
        Toy toy2 = new Toy(2, "Doll", 20, 40);
        Toy toy3 = new Toy(3, "LEGO", 30, 10);
        Toy toy4 = new Toy(3, "Teddy Bear", 40, 80);
        Toy toy5 = new Toy(3, "Cinema ticket", 50, 50);
        Toy toy6 = new Toy(3, "Magazine", 60, 60);
        Toy toy7 = new Toy(3, "Multi-pulti Buba", 80, 70);
        Toy toy8 = new Toy(3, "Blocks", 90, 90);
        Toy toy9 = new Toy(3, "Board game", 70, 30);


        store.addToy(toy1);
        store.addToy(toy2);
        store.addToy(toy3);
        store.addToy(toy4);
        store.addToy(toy5);
        store.addToy(toy6);
        store.addToy(toy7);
        store.addToy(toy8);
        store.addToy(toy9);


        store.changeToyFrequency(1, 30);

        store.organizeLottery();

        Toy prizeToy = store.getPrizeToy();
        if (prizeToy != null) {
            System.out.println("You won: " + prizeToy.getName());
        }
    }
}
