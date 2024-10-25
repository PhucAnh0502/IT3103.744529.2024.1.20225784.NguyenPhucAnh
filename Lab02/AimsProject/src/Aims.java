public class Aims {
    public static void main(String[] args){
        Cart anOrder = new Cart();

        DigitalVideoDisc dvd1 =
                new DigitalVideoDisc("The Lion King", "animation",
                        "Roger Allers", 87, 19.95f);
        anOrder.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 =
                new DigitalVideoDisc("Star wars", "Science Fiction",
                        "George Lucas", 87, 24.95f);
        anOrder.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 =
                new DigitalVideoDisc("Aladin", "animation", 18.99f);
        anOrder.addDigitalVideoDisc(dvd3);

        anOrder.removeDigitalVideoDisc(dvd3);

        System.out.print("Nguyen Phuc Anh - 20225784 - Total cost is: " + anOrder.totalCost());
    }
}
