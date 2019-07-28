package com.kuring.project.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Copyright ©2019 Kuring personal. All rights reserved.
 * Author: Kuring
 * Date: 2019-07-28
 * Description:
 */
public class Log {

    public static Logger getLogger(Class clazz){
        return LoggerFactory.getLogger(clazz);
    }

}
