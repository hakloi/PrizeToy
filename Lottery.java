public class Lottery {
    public static void main(String[] args) {
        Shop store = new Shop();

        Toy toy1 = new Toy(1, "Huggy Wuggy", 100, 20);
        Toy toy2 = new Toy(2, "Doll", 100, 40);
        Toy toy3 = new Toy(3, "LEGO", 50, 10);
        Toy toy4 = new Toy(3, "Teddy Bear", 100, 80);
        Toy toy5 = new Toy(3, "Cinema ticket", 100, 50);
        Toy toy6 = new Toy(3, "Magazine", 80, 60);
        Toy toy7 = new Toy(3, "Multi-pulti Buba", 100, 70);
        Toy toy8 = new Toy(3, "Blocks", 100, 90);
        Toy toy9 = new Toy(3, "Board game", 100, 30);


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

        store.organizeRaffle();

        Toy prizeToy = store.getPrizeToy();
        if (prizeToy != null) {
            System.out.println("Выигрышная игрушка: " + prizeToy.getName());
        }
    }
}
