public class GreenAndHeavyAppleSearchCriteria implements AppleSearchCriteria {
    @Override
    public boolean test(Apple apple) {
        return ("green".equals(apple.getColor()) && apple.getWeight() > 150);
    }
}
