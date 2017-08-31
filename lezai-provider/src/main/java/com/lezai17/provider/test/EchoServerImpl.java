package com.lezai17.provider.test;

import com.alibaba.dubbo.config.annotation.Service;
import com.lezai17.api.test.EchoService;
import com.lezai17.model.test.User;

/**
 * @author xiaofei.wxf(teaey)
 * @since 0.0.0
 */
@Service(version = "1.0.0")
public class EchoServerImpl implements EchoService {

    public String echo(String str) {
        System.out.println(str);
        return str;
    }

    @Override
    public Boolean insertUser(User user) {
        return user==null?false:true;
    }
}
