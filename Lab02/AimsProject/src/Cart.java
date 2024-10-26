public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered = 0;

    public void addDigitalVideoDisc(DigitalVideoDisc disc){
        if(qtyOrdered < MAX_NUMBERS_ORDERED){
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("Nguyen Phuc Anh - 20225784 - Added " + disc.getTitle() + " to cart");
        } else {
            System.out.println("Nguyen Phuc Anh - 20225784 - Your cart is full");
        }
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc){
        for (int i = 0; i < itemsOrdered.length; i++) {
            if(itemsOrdered[i] != null && itemsOrdered[i].equals(disc)){
                for(int j = i; j < qtyOrdered - 1; j++){
                    itemsOrdered[i] = itemsOrdered[i + 1];
                }
                itemsOrdered[qtyOrdered - 1] = null;
                qtyOrdered--;
                System.out.println("Nguyen Phuc Anh - 20225784 - Removed " + disc.getTitle() + " from cart");
                return;
            }
        }
        System.out.println("Nguyen Phuc Anh - 20225784 - " + disc.getTitle() + " not found in cart");
    }

    public float totalCost() {
        float total = 0;
        for (int i = 0; i < itemsOrdered.length; i++) {
            if (itemsOrdered[i] != null) total += itemsOrdered[i].getCost();
        }
        return total;
    }
}
