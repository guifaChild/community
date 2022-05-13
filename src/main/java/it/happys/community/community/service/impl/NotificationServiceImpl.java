package it.happys.community.community.service.impl;

import it.happys.community.community.pojo.entity.Notification;
import it.happys.community.community.mapper.NotificationMapper;
import it.happys.community.community.service.NotificationService;
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
public class NotificationServiceImpl extends ServiceImpl<NotificationMapper, Notification> implements NotificationService {

}
