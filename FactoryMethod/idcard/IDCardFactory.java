package idcard;
import framework.Factory;
import framework.Product;
import java.util.*;

/**
 * This class express a ID card factory.
 * 
 * @author Yuto Saito
 * @version 08/09/2024
 */
public class IDCardFactory extends Factory
{
    private List<String> owners = new ArrayList<String>();
    
    /**
     * Create ID cart product.
     */
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }
    
    /**
     * Register ID cart product.
     */
    protected void registerProduct(Product product) {
        IDCard card = (IDCard)product;
        this.owners.add(card.getOwner());
    }
    
    /**
     * Get owner of ID card.
     */
    public List<String> getOwners() {
        return this.owners;
    }
}
