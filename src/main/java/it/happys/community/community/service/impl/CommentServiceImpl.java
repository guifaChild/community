package it.happys.community.community.service.impl;

import it.happys.community.community.pojo.entity.Comment;
import it.happys.community.community.mapper.CommentMapper;
import it.happys.community.community.service.CommentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhangguifa
 * @since 2022-05-08
 */
@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements CommentService {

}
