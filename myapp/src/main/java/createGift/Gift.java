package createGift;

import candy.*;

import java.util.*;

import org.apache.log4j.Logger;

public class Gift {
    private final static Logger log = Logger.getLogger(Gift.class);

    private final double volume = 50;
    private final int weight = 100;
    private List<Candy> candies = new ArrayList<Candy>();

    public double priceGift() {                             //get the final price of the gift
        double price = 0;
        for (int i = 0; i < candies.size(); i++) {
            price += candies.get(i).getCount() * candies.get(i).getPrice();
        }
        return price;
    }

    public double weightGift() {                            //get the final weight of the gift
        double weightNow = 0;
        for (int i = 0; i < candies.size(); i++) {
            weightNow += candies.get(i).getCount() * candies.get(i).getWeight();
        }
        return weightNow;
    }

    public int countOfGift() {                              //get the final count of candy in the gift
        int count = 0;
        for (int i = 0; i < candies.size(); i++) {
            count += candies.get(i).getCount();
        }
        return count;
    }

    public double volumeGift() {                            //get the final volume of candy in the gift
        double v = 0;
        for (int i = 0; i < candies.size(); i++) {
            v += candies.get(i).getV();
        }
        return v;
    }

    public void add(Candy candy) {                          //add candy in the gift
        try {
            if (volumeGift() + candy.getV() <= volume && weightGift() + candy.getWeight() <= weight) {      //checking whether the candy does not exceed the volume and weight of the gift itself
                candies.add(candy);
            } else {
                log.error("Unreal add candy " +candy.getName() + "!");
            }
        }catch (NullPointerException e){
            log.error("Something failed: " + e.getMessage());
        }
    }

    public int getSize() {                                  //get size of ArrayList "candies"
        return candies.size();
    }

    public Candy getObject(int i) {                         //get object in ArrayList by ID
        return candies.get(i);
    }

    public List<Candy> getCandies() {                       //get ArrayList object
        return candies;
    }

    @Override
    public String toString() {
        return "Gift\n{" +
                "price: " + priceGift() +
                ", weight: " + weightGift() +
                ", volume: " + volumeGift() +
                ", count candies in the gift: " + countOfGift() +
                "}"+candies.toString();
    }
}
