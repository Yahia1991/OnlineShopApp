import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author yahia
 */
public class ShoppingCart {
    private Map<String, Item> items;

    public ShoppingCart() {
        this.items = new HashMap<>();
    }
    
    public void add(String product, int price) {
        if(!this.items.containsKey(product)){
        this.items.put(product, new Item(product, 0, price));
        }
        if(this.items.containsKey(product)){
        this.items.get(product).increaseQuantity();
        }
    }
    
    public int price(){
        int totalPrice = 0;
        for(Item item : this.items.values()){
            totalPrice += item.price();
        }
        return totalPrice;
    }
    
    public void print(){
        for(Item item : this.items.values()){
            System.out.println(item.toString());
        }
    }
    
    
}
