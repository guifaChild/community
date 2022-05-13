package it.happys.community.community.service.impl;

import it.happys.community.community.pojo.entity.Question;
import it.happys.community.community.mapper.QuestionMapper;
import it.happys.community.community.service.QuestionService;
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
public class QuestionServiceImpl extends ServiceImpl<QuestionMapper, Question> implements QuestionService {

}
