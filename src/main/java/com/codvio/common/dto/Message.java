
package com.codvio.common.dto;

import java.io.Serializable;



public class Message implements Serializable {



    //~ --- [STATIC FIELDS/INITIALIZERS] -------------------------------------------------------------------------------

    /** Use serialVersionUID for interoperability. */
    private static final long serialVersionUID = 1L;



    //~ --- [INSTANCE FIELDS] ------------------------------------------------------------------------------------------

    private Object data;
    private String msgId;
    private String msgUid;
    private String text;
    private String type;



    //~ --- [METHODS] --------------------------------------------------------------------------------------------------

    public Object getData() {

        return data;
    }



    //~ ----------------------------------------------------------------------------------------------------------------

    public String getMsgId() {

        return msgId;
    }



    //~ ----------------------------------------------------------------------------------------------------------------

    public String getMsgUid() {

        return msgUid;
    }



    //~ ----------------------------------------------------------------------------------------------------------------

    public String getText() {

        return text;
    }



    //~ ----------------------------------------------------------------------------------------------------------------

    public String getType() {

        return type;
    }



    //~ ----------------------------------------------------------------------------------------------------------------

    public void setData(final Object data) {

        this.data = data;
    }



    //~ ----------------------------------------------------------------------------------------------------------------

    public void setMsgId(final String msgId) {

        this.msgId = msgId;
    }



    //~ ----------------------------------------------------------------------------------------------------------------

    public void setMsgUid(final String msgUid) {

        this.msgUid = msgUid;
    }



    //~ ----------------------------------------------------------------------------------------------------------------

    public void setText(final String text) {

        this.text = text;
    }



    //~ ----------------------------------------------------------------------------------------------------------------

    public void setType(final String type) {

        this.type = type;
    }



    //~ ----------------------------------------------------------------------------------------------------------------

    @Override
    public String toString() {

        return text + " #" + msgUid;
    }
}
