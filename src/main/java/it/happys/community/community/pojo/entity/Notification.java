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
@ApiModel(value="Notification对象", description="")
public class Notification implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private Long notifier;

    private Long receiver;

    private Long outerid;

    @ApiModelProperty(value = "1回问，2回评，3收藏，4点赞")
    private Integer type;

    private Long gmtCreate;

    @ApiModelProperty(value = "0未读，1已读")
    private Integer status;

    private String notifierName;

    private String outerTitle;


}
