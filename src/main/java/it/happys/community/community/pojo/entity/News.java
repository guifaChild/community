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
@ApiModel(value="News对象", description="")
public class News implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
      @TableId(value = "news_id", type = IdType.AUTO)
    private Long newsId;

    private String id;

    private String title;

    private String description;

    private String html;

    private String source;

    private String link;

    private String pubDate;

    private String imageurl1;

    private String imageurl2;

    private String imageurl3;

    private String tag;

    private Integer viewCount;

    private Integer commentCount;

    private Integer likeCount;

    private Long gmtLatestComment;

    private Integer status;

    private Integer column2;

    private Long gmtCreate;

    private Long gmtModified;


}
