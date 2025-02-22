package cn.lili.modules.promotion.entity.vos.kanjia;

import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 砍价活动搜索参数
 *
 * @author Bulbasaur
 * @date: 2021/7/13 2:41 下午
 */
@Data
public class KanjiaActivitySearchParams {

    @ApiModelProperty(value = "砍价活动ID")
    private String id;

    @ApiModelProperty(value = "砍价商品SkuID")
    private String kanjiaActivityGoodsId;

    @ApiModelProperty(value = "会员ID" ,hidden = true)
    private String memberId;

    @ApiModelProperty(value = "状态")
    private String status;

    @ApiModelProperty(value = "邀请活动ID，有值说明是被邀请人")
    private String kanjiaActivityId;


    public <T> QueryWrapper<T> wrapper() {
        QueryWrapper<T> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq(StrUtil.isNotEmpty(id), "id", id);
        queryWrapper.eq(StrUtil.isNotEmpty(kanjiaActivityId), "id", kanjiaActivityId);
        queryWrapper.eq(StrUtil.isNotEmpty(kanjiaActivityGoodsId), "kanjia_activity_goods_id", kanjiaActivityGoodsId);
        queryWrapper.eq(StrUtil.isNotEmpty(memberId), "member_id", memberId);
        queryWrapper.eq(StrUtil.isNotEmpty(status), "status", status);
        return queryWrapper;
    }
}
