package senlatask.fifth;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        apple apple = new apple(2, 2);
        bottle bottle = new bottle(4, 2);
        cube cube = new cube(10, 5);
        bottle bottle2 = new bottle(1, 5);
        Box box = new Box(20, 20);
        List<Common> items = new ArrayList<>();
        items.add(apple);
        items.add(bottle);
        items.add(cube);
        items.add(bottle2);
        items.add(box);
        items.add(ball2);
        
        Safe safe = new Safe(40);
        safe.addItems(items);
        safe.showItems();
        
    }
}
