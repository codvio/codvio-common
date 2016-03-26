
package com.codvio.common.controller;

import com.codvio.common.util.MessageFactory;
import org.springframework.beans.factory.annotation.Autowired;



public abstract class BaseController {



    //~ --- [INSTANCE FIELDS] ------------------------------------------------------------------------------------------

    @Autowired
    protected MessageFactory msg;
}
