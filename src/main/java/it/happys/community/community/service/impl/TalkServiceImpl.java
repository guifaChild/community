package it.happys.community.community.service.impl;

import it.happys.community.community.pojo.entity.Talk;
import it.happys.community.community.mapper.TalkMapper;
import it.happys.community.community.service.TalkService;
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
public class TalkServiceImpl extends ServiceImpl<TalkMapper, Talk> implements TalkService {

}
