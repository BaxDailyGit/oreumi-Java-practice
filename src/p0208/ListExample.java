package p0208;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {

        List<String> orderlist = new ArrayList<>();
        orderlist.add("햄버거");
        orderlist.add("감자튀김");
        orderlist.add("치킨너겟");
        orderlist.remove("치킨너겟");

        System.out.println("주문내역");
        for (int i = 0; i < orderlist.size(); i++) {
            System.out.println(orderlist.get(i));
        }
    }
}
