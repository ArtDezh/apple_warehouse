import java.util.ArrayList;
import java.util.List;

class AppleWarehouse {
    private List<Apple> apples = getAllApples();

    private List<Apple> getAllApples() {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("red", 100));
        apples.add(new Apple("red", 135));
        apples.add(new Apple("red", 160));
        apples.add(new Apple("red", 200));
        apples.add(new Apple("green", 200));
        apples.add(new Apple("green", 90));
        apples.add(new Apple("green", 50));
        apples.add(new Apple("yellow", 50));
        apples.add(new Apple("yellow", 170));

        return apples;
    }

    /*
    List<Apple> getListOfGreenApples() {
        List<Apple> greenApples = new ArrayList<>();

        for (Apple apple: apples) {
            if (apple.getColor().equals("green")) greenApples.add(apple);
        }
        return greenApples;
    }

    List<Apple> getListOfRedApples() {
        List<Apple> redApples = new ArrayList<>();

        for (Apple apple: apples) {
            if (apple.getColor().equals("red")) redApples.add(apple);
        }
        return redApples;
    }
    */

    List<Apple> findApplesByColor(String color) {
        List<Apple> applesList = new ArrayList<>();

        for (Apple apple: apples) {
            if (apple.getColor().equals(color)) applesList.add(apple);
        }

        return applesList;
    }

    List<Apple> findHeavyApples(int weight) {
        List<Apple> applesList = new ArrayList<>();

        for (Apple apple: apples) {
            if (apple.getWeight() > weight) applesList.add(apple);
        }

        return applesList;
    }

    List<Apple> findApples(AppleSearchCriteria searchCriteria) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple: apples) {
            if (searchCriteria.test(apple)) {
                result.add(apple);
            }
        }

        return result;
    }
}
