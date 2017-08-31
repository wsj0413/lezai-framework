package com.lezai17.api.test;

import com.lezai17.model.test.User;

/**
 * @author xiaofei.wxf(teaey)
 * @since 0.0.0
 */
public interface EchoService {
    String echo(String str);
    Boolean insertUser(User user);
}
