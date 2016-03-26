
package com.codvio.common.util;


import com.codvio.common.dto.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;



@Component
public class MessageFactory {



    //~ --- [INSTANCE FIELDS] ------------------------------------------------------------------------------------------

    @Autowired
    private MessageSource messageSource;



    //~ --- [METHODS] --------------------------------------------------------------------------------------------------

    public Message createMessage(final String type, final String msgUid, final String msgId, final Object data) {

        final Message message = new Message();
        message.setType(type);
        message.setMsgUid(msgUid);
        message.setMsgId(msgId);
        message.setText(messageSource.getMessage(msgId, null, "", null));
        message.setData(data);

        return message;
    }



    //~ ----------------------------------------------------------------------------------------------------------------

    public Message error(final String msgUid, final String msgId) {

        return createMessage("ERROR", msgUid, msgId, null);
    }



    //~ ----------------------------------------------------------------------------------------------------------------

    public Message error(final String msgUid, final String msgId, final Object data) {

        return createMessage("ERROR", msgUid, msgId, data);
    }



    //~ ----------------------------------------------------------------------------------------------------------------

    public Message info(final String msgUid, final String msgId) {

        return createMessage("INFO", msgUid, msgId, null);
    }



    //~ ----------------------------------------------------------------------------------------------------------------

    public Message info(final String msgUid, final String msgId, final Object data) {

        return createMessage("INFO", msgUid, msgId, data);
    }



    //~ ----------------------------------------------------------------------------------------------------------------

    public Message success(final String msgUid, final String msgId) {

        return createMessage("SUCCESS", msgUid, msgId, null);
    }



    //~ ----------------------------------------------------------------------------------------------------------------

    public Message success(final String msgUid, final String msgId, final Object data) {

        return createMessage("SUCCESS", msgUid, msgId, data);
    }



    //~ ----------------------------------------------------------------------------------------------------------------

    public Message warning(final String msgUid, final String msgId) {

        return createMessage("WARNING", msgUid, msgId, null);
    }



    //~ ----------------------------------------------------------------------------------------------------------------

    public Message warning(final String msgUid, final String msgId, final Object data) {

        return createMessage("WARNING", msgUid, msgId, data);
    }
}
