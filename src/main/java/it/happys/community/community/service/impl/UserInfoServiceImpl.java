package it.happys.community.community.service.impl;

import it.happys.community.community.pojo.entity.UserInfo;
import it.happys.community.community.mapper.UserInfoMapper;
import it.happys.community.community.service.UserInfoService;
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
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements UserInfoService {

}
