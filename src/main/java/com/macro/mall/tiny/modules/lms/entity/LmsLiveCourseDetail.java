package com.macro.mall.tiny.modules.lms.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
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
 * @since 2020-10-19
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("lms_live_course_detail")
@ApiModel(value="LmsLiveCourseDetail对象", description="")
public class LmsLiveCourseDetail implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "直播课主表id")
    private Long liveCourseId;

    @ApiModelProperty(value = "第几讲")
    @TableField("serialNo")
    private Integer serialNo;

    @ApiModelProperty(value = "直播开始时间")
    private Date startTime;

    @ApiModelProperty(value = "课件url")
    private String coursewareUrl;

    @ApiModelProperty(value = "直播结束时间")
    private Date endTime;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "更新时间")
    private Date updateTime;


}
