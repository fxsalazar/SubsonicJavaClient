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

/**
 * <p>Java class for VideoConversion complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="VideoConversion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="bitRate" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="audioTrackId" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@Default(DefaultType.FIELD)
@Root(name = "VideoConversion", strict = false)
public class VideoConversion {

    @Attribute(name = "id", required = true)
    protected String id;
    @Attribute(required = false, name = "bitRate")
    protected Integer bitRate;
    @Attribute(required = false, name = "audioTrackId")
    protected Integer audioTrackId;

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
     * Gets the value of the bitRate property.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getBitRate() {
        return bitRate;
    }

    /**
     * Sets the value of the bitRate property.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setBitRate(Integer value) {
        this.bitRate = value;
    }

    /**
     * Gets the value of the audioTrackId property.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getAudioTrackId() {
        return audioTrackId;
    }

    /**
     * Sets the value of the audioTrackId property.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setAudioTrackId(Integer value) {
        this.audioTrackId = value;
    }

}