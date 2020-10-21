package com.macro.mall.tiny.modules.lms.entity;

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
 * @since 2020-10-21
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("lms_record_course_detail")
@ApiModel(value="LmsRecordCourseDetail对象", description="")
public class LmsRecordCourseDetail implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "录播课id")
    private Long recordCourseId;

    @ApiModelProperty(value = "单元")
    private Integer unit;

    @ApiModelProperty(value = "课时名称")
    private String name;

    @ApiModelProperty(value = "上传资料url")
    private String resourceUrl;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "更新时间")
    private Date updateTime;


}
