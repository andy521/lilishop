package cn.lili.modules.order.cart.entity.enums;

/**
 * 购物车渲染枚举
 */
public enum RenderStepEnums {

    CHECK_DATA("校验商品"),
    CART_SN("交易编号创建"),
    COUPON("优惠券价格渲染"),
    SKU_FREIGHT("运费计算"),
    SKU_PROMOTION("商品促销计算"),
    CART_PRICE("购物车金额计算"),
    DISTRIBUTION("分销佣金计算"),
    FULL_DISCOUNT("满减计算");

    private String distribution;

    RenderStepEnums(String distribution) {
        this.distribution = distribution;
    }
}
