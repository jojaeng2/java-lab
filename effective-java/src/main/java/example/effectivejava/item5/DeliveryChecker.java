package example.effectivejava.item5;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class DeliveryChecker {
    private final List<Delivery> deliveryList;

    public DeliveryChecker(List<Delivery> deliveryList) {
        this.deliveryList = deliveryList;
    }

    public boolean isValid(Delivery delivery) {
        return deliveryList.contains(delivery);
    }

    public List<Delivery> findArea(String area) {
        return deliveryList.stream()
                .filter(delivery -> delivery.getArea().equals(area))
                .collect(toList());
    }
}
