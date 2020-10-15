package com.macro.mall.tiny.modules.ums.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
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
 * @since 2020-10-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("ums_teacher")
@ApiModel(value="UmsTeacher对象", description="")
public class UmsTeacher implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "用户表id")
    private Long userId;

    @ApiModelProperty(value = "老师名字")
    private String name;


}
