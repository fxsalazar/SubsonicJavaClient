//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.05.07 at 04:18:52 PM CEST 
//


package subsonic_api.model;

import org.simpleframework.xml.*;

import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for ArtistsID3 complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="ArtistsID3">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="index" type="{http://subsonic.org/restapi}IndexID3" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ignoredArticles" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@Root(name = "index")
@Default(DefaultType.FIELD)
@Order(elements = {
        "index"
})
public class ArtistsID3 {

    @ElementList(inline = true, required = false)
    protected List<IndexID3> index;
    @Attribute(name = "ignoredArticles", required = true)
    protected String ignoredArticles;

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
     * {@link IndexID3 }
     */
    public List<IndexID3> getIndex() {
        if (index == null) {
            index = new ArrayList<IndexID3>();
        }
        return this.index;
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

    @Override
    public String toString() {
        return "ArtistsID3{" +
                "index=" + index +
                ", ignoredArticles='" + ignoredArticles + '\'' +
                '}';
    }
}
