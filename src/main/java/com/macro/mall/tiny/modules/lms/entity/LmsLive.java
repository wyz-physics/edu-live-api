package com.macro.mall.tiny.modules.lms.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
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
 * @since 2020-10-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("lms_live")
@ApiModel(value="LmsLive对象", description="")
public class LmsLive implements Serializable {

    private static final long serialVersionUID=1L;

    private Long id;

    @ApiModelProperty(value = "讲师id")
    private Long lecturerId;

    @ApiModelProperty(value = "班主任id")
    private Long headTeacherId;

    @ApiModelProperty(value = "班级类型")
    private Integer classType;

    @ApiModelProperty(value = "直播开始时间")
    private Date startTime;

    @ApiModelProperty(value = "直播结束时间")
    private Date endTime;

    @ApiModelProperty(value = "学生人数")
    private Integer studentNum;

    @ApiModelProperty(value = "课程价格")
    private BigDecimal price;


}
