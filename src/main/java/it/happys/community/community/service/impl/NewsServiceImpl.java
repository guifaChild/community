package it.happys.community.community.service.impl;

import it.happys.community.community.pojo.entity.News;
import it.happys.community.community.mapper.NewsMapper;
import it.happys.community.community.service.NewsService;
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
public class NewsServiceImpl extends ServiceImpl<NewsMapper, News> implements NewsService {

}
