package runner;


import objects.Car;

public class Main {
    public static void main(String[] args) {
//        CouponSystem instance = CouponSystem.createCoupon();
////        CouponSystem instance2 = CouponSystem.createCoupon();
////        instance.addCoupon(new Coupon(23));
////        instance2.addCoupon(new Coupon(44));
////        System.out.println(instance.getAllCoupons());
////        System.out.println(instance2.getAllCoupons());

        Thread car1 = new Thread(new Car("MqQueen", 2, 3));
        Thread car2 = new Thread(new Car("free", 2, 3));
        Thread car3 = new Thread(new Car("blabla", 2, 3));

        Thread thread = new Thread(() -> {

                System.out.println("implementation");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

        });

        thread.start();
    }
}
