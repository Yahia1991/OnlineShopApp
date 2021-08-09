
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author yahia
 */
public class Warehouse {
   private Map<String, Integer> prices;
   private Map<String, Integer> stocks;

    public Warehouse() {
        this.prices = new HashMap<>();
        this.stocks = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock){
        this.prices.put(product, price);
        this.stocks.put(product, stock);
    }
    
    public int price(String product){
        if(!this.prices.containsKey(product)){
            return -99;
        }
        return this.prices.get(product);
    }
    
    public int stock(String product){
        if(!this.stocks.containsKey(product)){
            return 0;
        }
        return this.stocks.get(product);
    }
    
    public boolean take(String product){
        if(!this.stocks.containsKey(product)){
            return false;
        }
        
        if(this.stock(product) > 0 ){
            this.stocks.put(product, this.stock(product) - 1);
             return true;
        }
        
        return false;
    }
    
    public Set<String> products(){
        Set<String> names = this.prices.keySet();
        Collection<String> namesCollection = names;
        
        for(String name : namesCollection){
        }
        return names;
    }
   
}
