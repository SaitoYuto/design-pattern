package framework;


/**
 * This class express a factory.
 * All specific implementation is dependent on the subclass.
 * What this class knows is Product class and how to create the product.
 * 
 * @author Yuto Saito
 * @version 08/09/2024
 */
public abstract class Factory
{
    /**
     * Create product object 
     *
     * @param owner
     * @return product
     */
    public Product create(String owner) {
        Product p = createProduct(owner);
        registerProduct(p);
        return p;
    }
    
    /**
     * Create product 
     *
     * @param owner
     * @return product
     */
    protected abstract Product createProduct(String owner);
    
    /**
     * Register created product 
     *
     * @param product
     */
    protected abstract void registerProduct(Product product);
}
