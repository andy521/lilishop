package cn.lili.modules.system.entity.dos;

import cn.lili.mybatis.BaseEntity;
import cn.lili.modules.system.entity.enums.VerificationSourceEnum;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 验证码资源维护
 * @author Chopper
 * @since 2021/1/30 4:13 下午
 */
@Data
@Entity
@Table(name = "li_verification_source")
@TableName("li_verification_source")
@ApiModel(value = "验证码资源维护")
public class VerificationSource extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "名称")
    private String name;

    @ApiModelProperty(value = "资源地址")
    private String resource;

    /**
     * @see VerificationSourceEnum
     */
    @ApiModelProperty(value = "验证码资源类型 SLIDER/SOURCE")
    private String type;
}