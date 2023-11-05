import lombok.*;


@Getter
@Setter
@EqualsAndHashCode(of = {"brand"})
@ToString
@RequiredArgsConstructor
public class CarWithLombok {
    @NonNull
    private String model;
    @NonNull
    private String brand;
    @NonNull
    private int year;
    @NonNull
    private int price;
    @NonNull
    private String color;
    @NonNull
   @ToString.Exclude private int quantity;

    public void delivery(int amount){
        this.quantity += amount;
    }
    public void sell(int sold){
        this.quantity -= sold;
    }
}

