package com.macro.mall.tiny.modules.cms.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author piao
 * @since 2020-10-23
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("cms_commodity")
@ApiModel(value="CmsCommodity对象", description="")
public class CmsCommodity implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "商品类型 0:直播课，1：录播课")
    private Integer type;

    @ApiModelProperty(value = "直播课/录播课id")
    private Long courseId;

    @ApiModelProperty(value = "市场价")
    private BigDecimal marketPrice;

    @ApiModelProperty(value = "实际价格")
    private BigDecimal actualPrice;

    @ApiModelProperty(value = "课程头图")
    private String headPicUrl;

    @ApiModelProperty(value = "课程详细介绍（富文本图片？）")
    private String detailedIntroduction;

    @ApiModelProperty(value = "是否已上架，0：未上架，1：已上架")
    private Boolean isOnSale;

    @ApiModelProperty(value = "库存")
    private Integer stocks;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "更新时间")
    private Date updateTime;


}
