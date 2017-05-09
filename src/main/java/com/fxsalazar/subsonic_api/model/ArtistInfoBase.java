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

import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * <p>Java class for ArtistInfoBase complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="ArtistInfoBase">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="biography" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="musicBrainzId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastFmUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="smallImageUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mediumImageUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="largeImageUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@Default(DefaultType.FIELD)
@Order(elements = {
        "biography",
        "musicBrainzId",
        "lastFmUrl",
        "smallImageUrl",
        "mediumImageUrl",
        "largeImageUrl"
})
@XmlSeeAlso({
        ArtistInfo2.class,
        ArtistInfo.class
})
public class ArtistInfoBase {

    @Element(required = false)
    protected String biography;
    @Element(required = false)
    protected String musicBrainzId;
    @Element(required = false)
    protected String lastFmUrl;
    @Element(required = false)
    protected String smallImageUrl;
    @Element(required = false)
    protected String mediumImageUrl;
    @Element(required = false)
    protected String largeImageUrl;

    /**
     * Gets the value of the biography property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getBiography() {
        return biography;
    }

    /**
     * Sets the value of the biography property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setBiography(String value) {
        this.biography = value;
    }

    /**
     * Gets the value of the musicBrainzId property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getMusicBrainzId() {
        return musicBrainzId;
    }

    /**
     * Sets the value of the musicBrainzId property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMusicBrainzId(String value) {
        this.musicBrainzId = value;
    }

    /**
     * Gets the value of the lastFmUrl property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getLastFmUrl() {
        return lastFmUrl;
    }

    /**
     * Sets the value of the lastFmUrl property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLastFmUrl(String value) {
        this.lastFmUrl = value;
    }

    /**
     * Gets the value of the smallImageUrl property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSmallImageUrl() {
        return smallImageUrl;
    }

    /**
     * Sets the value of the smallImageUrl property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSmallImageUrl(String value) {
        this.smallImageUrl = value;
    }

    /**
     * Gets the value of the mediumImageUrl property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getMediumImageUrl() {
        return mediumImageUrl;
    }

    /**
     * Sets the value of the mediumImageUrl property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMediumImageUrl(String value) {
        this.mediumImageUrl = value;
    }

    /**
     * Gets the value of the largeImageUrl property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getLargeImageUrl() {
        return largeImageUrl;
    }

    /**
     * Sets the value of the largeImageUrl property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLargeImageUrl(String value) {
        this.largeImageUrl = value;
    }

}
