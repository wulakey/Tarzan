package com.tongbanjie.tarzan.client;

import com.tongbanjie.tarzan.common.exception.TarzanException;

/**
 * 客户端异常 <p>
 * 〈功能详细描述〉
 *
 * @author zixiao
 * @date 16/10/31
 */
public class ClientException extends TarzanException {

    private static final long serialVersionUID = 1327351036981753652L;

    public ClientException(String message) {
        super(message);
    }

    public ClientException(String message, Throwable cause) {
        super(message, cause);
    }

}
