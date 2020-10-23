package com.macro.mall.tiny.modules.lms.entity;

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
@TableName("lms_live_course")
@ApiModel(value="LmsLiveCourse对象", description="")
public class LmsLiveCourse implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "课程名称")
    private String name;

    @ApiModelProperty(value = "课程简介")
    private String briefIntroduction;

    @ApiModelProperty(value = "讲师id")
    private Long lecturerId;

    @ApiModelProperty(value = "班主任id")
    private Long headTeacherId;

    @ApiModelProperty(value = "年级表id")
    private Long gradeId;

    @ApiModelProperty(value = "学科表id")
    private Long subjectId;

    @ApiModelProperty(value = "直播课程开始时间")
    private Date startTime;

    @ApiModelProperty(value = "直播课程结束时间")
    private Date endTime;

    @ApiModelProperty(value = "课程详细介绍（富文本图片？）")
    private String detailedIntroduction;

    @ApiModelProperty(value = "直播课班级容量")
    private Integer classSize;

    @ApiModelProperty(value = "直播课程市场价格")
    private BigDecimal marketPrice;

    @ApiModelProperty(value = "直播课程实际价格")
    private BigDecimal actualPrice;

    @ApiModelProperty(value = "是否已上架，0：未上架，1：已上架")
    private Boolean isOnSale;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "更新时间")
    private Date updateTime;


}
