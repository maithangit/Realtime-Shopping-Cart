package tm.pusher.model;
import java.io.Serializable;

public class ItemRequest implements Serializable {

    /**
     * UID for serialization
     */
    private static final long serialVersionUID = 7720978167137384733L;

    /** Id of the item */
    private Long id;

    /** Quantity of the item to be added to the shopping cart */
    private Integer quantity;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
