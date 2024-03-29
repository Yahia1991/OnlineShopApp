/**
 *
 * @author yahia
 */
public class Item {
    private String product;
    private int quantity;
    private int unitPrice;

    public Item(String product, int quantity, int unitPrice) {
        this.product = product;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }
    
    public int price(){
        int totalPrice = this.quantity * this.unitPrice;
        return totalPrice;
    }
            
    public void increaseQuantity(){
        this.quantity++;
    }
    
    @Override
    public String toString(){
        return this.product + ": " + this.quantity;
    }
}
