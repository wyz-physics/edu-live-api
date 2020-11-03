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

    @ApiModelProperty(value = "教师资质")
    private String teacherQualification;

    @ApiModelProperty(value = "教学经历")
    private String teachingExperience;

    @ApiModelProperty(value = "教学成果")
    private String fruitOfTeaching;

    @ApiModelProperty(value = "教学特点")
    private String teachingCharacteristics;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "更新时间")
    private Date updateTime;


}
