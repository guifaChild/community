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
@ApiModel(value="Comment对象", description="")
public class Comment implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "父类id")
    private Long parentId;

    @ApiModelProperty(value = "父类类型")
    private Integer type;

    @ApiModelProperty(value = "评论人id")
    private Long commentator;

    @ApiModelProperty(value = "创建时间")
    private Long gmtCreate;

    @ApiModelProperty(value = "更新时间")
    private Long gmtModified;

    @ApiModelProperty(value = "点赞数")
    private Long likeCount;

    private String content;

    private Integer commentCount;


}
