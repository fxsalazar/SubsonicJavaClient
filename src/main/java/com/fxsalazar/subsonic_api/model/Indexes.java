//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.05.07 at 04:18:52 PM CEST 
//


package com.fxsalazar.subsonic_api.model;

import org.simpleframework.xml.*;

import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for Indexes complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="Indexes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="shortcut" type="{http://subsonic.org/restapi}Artist" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="index" type="{http://subsonic.org/restapi}Index" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="child" type="{http://subsonic.org/restapi}Child" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="lastModified" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="ignoredArticles" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@Default(DefaultType.FIELD)
@Order(elements = {
        "shortcut",
        "index",
        "child"
})
public class Indexes {

    @Element(required = false)
    protected List<Artist> shortcut;
    @Element(required = false)
    protected List<Index> index;
    @Element(required = false)
    protected List<Child> child;
    @Attribute(name = "lastModified", required = true)
    protected long lastModified;
    @Attribute(name = "ignoredArticles", required = true)
    protected String ignoredArticles;

    /**
     * Gets the value of the shortcut property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shortcut property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShortcut().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Artist }
     */
    public List<Artist> getShortcut() {
        if (shortcut == null) {
            shortcut = new ArrayList<Artist>();
        }
        return this.shortcut;
    }

    /**
     * Gets the value of the index property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the index property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndex().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Index }
     */
    public List<Index> getIndex() {
        if (index == null) {
            index = new ArrayList<Index>();
        }
        return this.index;
    }

    /**
     * Gets the value of the child property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the child property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChild().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Child }
     */
    public List<Child> getChild() {
        if (child == null) {
            child = new ArrayList<Child>();
        }
        return this.child;
    }

    /**
     * Gets the value of the lastModified property.
     */
    public long getLastModified() {
        return lastModified;
    }

    /**
     * Sets the value of the lastModified property.
     */
    public void setLastModified(long value) {
        this.lastModified = value;
    }

    /**
     * Gets the value of the ignoredArticles property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getIgnoredArticles() {
        return ignoredArticles;
    }

    /**
     * Sets the value of the ignoredArticles property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setIgnoredArticles(String value) {
        this.ignoredArticles = value;
    }

}
