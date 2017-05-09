//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.05.07 at 04:18:52 PM CEST 
//


package com.fxsalazar.subsonic_api.model;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Default;
import org.simpleframework.xml.DefaultType;
import org.simpleframework.xml.Order;

import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for Genre complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="Genre">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="songCount" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="albumCount" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@Default(DefaultType.FIELD)
@Order(elements = {
        "content"
})
public class Genre {

    @XmlValue
    protected String content;
    @Attribute(name = "songCount", required = true)
    protected int songCount;
    @Attribute(name = "albumCount", required = true)
    protected int albumCount;

    /**
     * Gets the value of the content property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setContent(String value) {
        this.content = value;
    }

    /**
     * Gets the value of the songCount property.
     */
    public int getSongCount() {
        return songCount;
    }

    /**
     * Sets the value of the songCount property.
     */
    public void setSongCount(int value) {
        this.songCount = value;
    }

    /**
     * Gets the value of the albumCount property.
     */
    public int getAlbumCount() {
        return albumCount;
    }

    /**
     * Sets the value of the albumCount property.
     */
    public void setAlbumCount(int value) {
        this.albumCount = value;
    }

}
