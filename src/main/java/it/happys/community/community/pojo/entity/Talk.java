package it.happys.community.community.pojo.entity;

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
 * @author zhangguifa
 * @since 2022-05-08
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="Talk对象", description="")
public class Talk implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键id")
      @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "标题")
    private String title;

    @ApiModelProperty(value = "描述")
    private String description;

    @ApiModelProperty(value = "标签")
    private String tag;

    @ApiModelProperty(value = "图片地址")
    private String images;

    @ApiModelProperty(value = "视频地址")
    private String video;

    @ApiModelProperty(value = "类型")
    private Integer type;

    @ApiModelProperty(value = "状态")
    private Integer status;

    @ApiModelProperty(value = "权限")
    private Integer permission;

    @ApiModelProperty(value = "发布者")
    private Long creator;

    @ApiModelProperty(value = "浏览数")
    private Integer viewCount;

    @ApiModelProperty(value = "评论数")
    private Integer commentCount;

    @ApiModelProperty(value = "点赞数")
    private Integer likeCount;

    @ApiModelProperty(value = "最后评论时间")
    private Long gmtLatestComment;

    @ApiModelProperty(value = "创建时间")
    private Long gmtCreate;

    @ApiModelProperty(value = "修改时间")
    private Long gmtModified;


}
