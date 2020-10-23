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
 * @since 2020-10-23
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("lms_record_course")
@ApiModel(value="LmsRecordCourse对象", description="")
public class LmsRecordCourse implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "课程名称")
    private String name;

    @ApiModelProperty(value = "课程简介")
    private String briefIntroduction;

    @ApiModelProperty(value = "年级id")
    private Long gradeId;

    @ApiModelProperty(value = "科目id")
    private Long subjectId;

    @ApiModelProperty(value = "讲师id")
    private Long lecturerId;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "更新时间")
    private Date updateTime;


}
