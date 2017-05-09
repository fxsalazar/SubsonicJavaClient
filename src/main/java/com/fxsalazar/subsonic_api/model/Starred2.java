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
 * <p>Java class for Starred2 complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="Starred2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="artist" type="{http://subsonic.org/restapi}ArtistID3" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="album" type="{http://subsonic.org/restapi}AlbumID3" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="song" type="{http://subsonic.org/restapi}Child" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@Default(DefaultType.FIELD)
@Order(elements = {
        "artist",
        "album",
        "song"
})
public class Starred2 {

    @Element(required = false)
    protected List<ArtistID3> artist;
    @Element(required = false)
    protected List<AlbumID3> album;
    @Element(required = false)
    protected List<Child> song;

    /**
     * Gets the value of the artist property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the artist property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArtist().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArtistID3 }
     */
    public List<ArtistID3> getArtist() {
        if (artist == null) {
            artist = new ArrayList<ArtistID3>();
        }
        return this.artist;
    }

    /**
     * Gets the value of the album property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the album property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlbum().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AlbumID3 }
     */
    public List<AlbumID3> getAlbum() {
        if (album == null) {
            album = new ArrayList<AlbumID3>();
        }
        return this.album;
    }

    /**
     * Gets the value of the song property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the song property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSong().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Child }
     */
    public List<Child> getSong() {
        if (song == null) {
            song = new ArrayList<Child>();
        }
        return this.song;
    }

}
