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
@ApiModel(value="UserInfo对象", description="")
public class UserInfo implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private Long userId;

    @ApiModelProperty(value = "真名")
    private String realname;

    @ApiModelProperty(value = "个人简介")
    private String userdetail;

    @ApiModelProperty(value = "生日")
    private String birthday;

    @ApiModelProperty(value = "婚姻")
    private String marriage;

    @ApiModelProperty(value = "性别")
    private String sex;

    @ApiModelProperty(value = "血型")
    private String blood;

    @ApiModelProperty(value = "体型")
    private String figure;

    @ApiModelProperty(value = "星座")
    private String constellation;

    @ApiModelProperty(value = "教育程度")
    private String education;

    private String trade;

    @ApiModelProperty(value = "工作")
    private String job;

    @ApiModelProperty(value = "位置")
    private String location;


}
