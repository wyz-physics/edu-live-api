package com.macro.mall.tiny.modules.ums.entity;

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
 * @since 2020-11-02
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("ums_student")
@ApiModel(value="UmsStudent对象", description="")
public class UmsStudent implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "用户id")
    private Long userId;

    @ApiModelProperty(value = "用户昵称")
    private String userNickName;

    @ApiModelProperty(value = "用户头像")
    private String userIcon;

    @ApiModelProperty(value = "积分")
    private Integer points;

    @ApiModelProperty(value = "年级")
    private Integer grade;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "更新时间")
    private Date updateTime;


}
