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
@ApiModel(value="Thumb对象", description="")
public class Thumb implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "点赞目标问题/回复")
    private Long targetId;

    @ApiModelProperty(value = "目标类型")
    private Integer type;

    @ApiModelProperty(value = "点赞者")
    private Long liker;

    private Long gmtCreate;

    private Long gmtModified;


}
