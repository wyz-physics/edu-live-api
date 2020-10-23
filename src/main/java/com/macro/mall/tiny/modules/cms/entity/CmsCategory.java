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
 * @since 2020-10-23
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("cms_category")
@ApiModel(value="CmsCategory对象", description="")
public class CmsCategory implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "上级类目id")
    private Long pid;

    @ApiModelProperty(value = "类目名称")
    private String name;

    @ApiModelProperty(value = "几级分类")
    private Integer level;

    @ApiModelProperty(value = "类目图标")
    private String iconUrl;

    @ApiModelProperty(value = "类目图片")
    private String picUrl;

    @ApiModelProperty(value = "关键字")
    private String keyword;

    @ApiModelProperty(value = "类目简介")
    private String briefIntroduction;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "更新时间")
    private Date updateTime;


}
