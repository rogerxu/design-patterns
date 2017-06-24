package demo.designpatterns.simplefactory;

/**
 * Created by Roger Xu on 2017/6/24.
 */
public class SimpleFactoryClient {
    public static void main(String[] args) {
        try {
            MobileFactory mobileFactory = new MobileFactory();
            Mobile mobile;
            mobile = mobileFactory.getMobile("nokia");
            mobile.call();

            mobile = mobileFactory.getMobile("motorola");
            mobile.call();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
