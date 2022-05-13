package it.happys.community.community.service.impl;

import it.happys.community.community.pojo.entity.User;
import it.happys.community.community.mapper.UserMapper;
import it.happys.community.community.service.UserService;
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
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
