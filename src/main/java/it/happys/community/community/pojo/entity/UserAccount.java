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
@ApiModel(value="UserAccount对象", description="")
public class UserAccount implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private Long userId;

    @ApiModelProperty(value = "用户组id")
    private Integer groupId;

    @ApiModelProperty(value = "vip等级")
    private Integer vipRank;

    @ApiModelProperty(value = "总积分")
    private Integer score;

    private Integer score1;

    private Integer score2;

    private Integer score3;


}
