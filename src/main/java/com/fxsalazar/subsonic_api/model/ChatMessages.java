//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.05.07 at 04:18:52 PM CEST 
//


package com.fxsalazar.subsonic_api.model;

import org.simpleframework.xml.Default;
import org.simpleframework.xml.DefaultType;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;

import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for ChatMessages complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="ChatMessages">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="chatMessage" type="{http://subsonic.org/restapi}ChatMessage" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@Default(DefaultType.FIELD)
@Order(elements = {
        "chatMessage"
})
public class ChatMessages {

    @Element(required = false)
    protected List<ChatMessage> chatMessage;

    /**
     * Gets the value of the chatMessage property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chatMessage property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChatMessage().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChatMessage }
     */
    public List<ChatMessage> getChatMessage() {
        if (chatMessage == null) {
            chatMessage = new ArrayList<ChatMessage>();
        }
        return this.chatMessage;
    }

}
