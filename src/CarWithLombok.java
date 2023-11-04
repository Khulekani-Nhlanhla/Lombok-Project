import lombok.*;


@Getter
@Setter
@EqualsAndHashCode
@ToString
@AllArgsConstructor
public class CarWithLombok {

    private String model;
    private String brand;
    private int year;
    private int price;
    private String color;
    private int quantity;

    public void delivery(int amount){
        this.quantity += amount;
    }
    public void sell(int sold){
        this.quantity -= sold;
    }
}
