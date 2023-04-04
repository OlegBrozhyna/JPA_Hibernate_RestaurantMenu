package RestaurantMenu;

import javax.persistence.*;

@Entity
@Table(name = "Dishes")
public class Dish {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "weight", nullable = false)
    private double weight;
    @Column(name = "price", nullable = false)
    private double price;
    @Column(name = "discount", nullable = false)
    private double discount;
    @Column(name = "specification", nullable = false)
    private String specification;

    public Dish() {
    }

    public Dish(String name, double weight, double price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public Dish(String name, double weight, double price, double discount) {
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.discount = discount;
    }

    public Dish(long id, String name, double weight, double price, double discount, String specification) {
        this.id = id;
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.discount = discount;
        this.specification = specification;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", price=" + price +
                ", discount=" + discount +
                ", specification='" + specification + '\'' +
                '}';
    }
}

