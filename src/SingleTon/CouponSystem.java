package SingleTon;

import java.util.ArrayList;
import java.util.List;

public class CouponSystem {
    private List<Coupon> couponList = new ArrayList<>();
    private static CouponSystem system;

    private CouponSystem() {}

    public static CouponSystem createCoupon(){
        if (system == null){
            system = new CouponSystem();
        }
        return system;
    }

    public List<Coupon> getAllCoupons(){
        return couponList;
    }

    public void addCoupon(Coupon coupon){
        couponList.add(coupon);
    }
}
