
package com.codvio.common.controller;

import com.codvio.common.dto.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public final class PingController extends BaseController {



    //~ --- [STATIC FIELDS/INITIALIZERS] -------------------------------------------------------------------------------

    private static final Logger LOG = LoggerFactory.getLogger(PingController.class);



    //~ --- [METHODS] --------------------------------------------------------------------------------------------------

    @RequestMapping(value = { "/ping", "/ping/" }, method = RequestMethod.GET)
    public ResponseEntity<Message> ping() {

        LOG.debug("Ping action requested.");

        final String  data    = "pong";
        final Message message = msg.success("f830d1cfb8b5", "operationSucceeded", data);

        return new ResponseEntity<>(message, HttpStatus.OK);
    }
}
