package it.happys.community.community.service.impl;

import it.happys.community.community.pojo.entity.UserAccount;
import it.happys.community.community.mapper.UserAccountMapper;
import it.happys.community.community.service.UserAccountService;
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
public class UserAccountServiceImpl extends ServiceImpl<UserAccountMapper, UserAccount> implements UserAccountService {

}
