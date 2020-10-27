package com.macro.mall.tiny.modules.cms.entity;

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
 * @since 2020-10-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("cms_keyword")
@ApiModel(value="CmsKeyword对象", description="")
public class CmsKeyword implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "关键词 名字")
    private String name;

    @ApiModelProperty(value = "跳转链接")
    private String source;

    @ApiModelProperty(value = "是否推荐，0：否，1：是")
    private Boolean isRecommended;

    @ApiModelProperty(value = "是否默认，0：否，1：是")
    private Boolean isDefault;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "更新时间")
    private Date updateTime;


}
