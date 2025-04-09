public class GreenAndHeavyAppleSearchCriteria implements AppleSearchCriteria {

    private GreenAppleSearchCriteria greenApple = new GreenAppleSearchCriteria();
    private HeavyAppleSearchCriteria heavyApple = new HeavyAppleSearchCriteria();

    @Override
    public boolean test(Apple apple) {
        return (greenApple.test(apple) && heavyApple.test(apple));
    }
}
