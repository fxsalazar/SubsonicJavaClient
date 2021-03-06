//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.05.07 at 04:18:52 PM CEST 
//


package subsonic_api.model;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Default;
import org.simpleframework.xml.DefaultType;
import org.simpleframework.xml.Root;

import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ArtistID3 complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="ArtistID3">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="coverArt" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="albumCount" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="starred" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@Default(DefaultType.FIELD)
@Root(name = "ArtistID3", strict = false)
@XmlSeeAlso({
        ArtistWithAlbumsID3.class
})
public class ArtistID3 {

    @Attribute(name = "id", required = true)
    protected String id;
    @Attribute(name = "name", required = true)
    protected String name;
    @Attribute(required = false, name = "coverArt")
    protected String coverArt;
    @Attribute(name = "albumCount", required = true)
    protected int albumCount;
    // TODO: 08/05/2017 change to date
    @Attribute(required = false, name = "starred")
    @XmlSchemaType(name = "dateTime")
    protected String starred;

    /**
     * Gets the value of the id property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the coverArt property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCoverArt() {
        return coverArt;
    }

    /**
     * Sets the value of the coverArt property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCoverArt(String value) {
        this.coverArt = value;
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

    /**
     * Gets the value of the starred property.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public String getStarred() {
        return starred;
    }

    /**
     * Sets the value of the starred property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setStarred(String value) {
        this.starred = value;
    }

    @Override
    public String toString() {
        return "ArtistID3{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", coverArt='" + coverArt + '\'' +
                ", albumCount=" + albumCount +
                ", starred=" + starred +
                '}';
    }
}
