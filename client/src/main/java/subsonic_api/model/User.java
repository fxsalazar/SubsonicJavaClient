//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.05.07 at 04:18:52 PM CEST 
//


package subsonic_api.model;

import org.simpleframework.xml.*;

import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for User complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="User">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="folder" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="username" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="email" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="scrobblingEnabled" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="maxBitRate" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="adminRole" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="settingsRole" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="downloadRole" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="uploadRole" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="playlistRole" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="coverArtRole" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="commentRole" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="podcastRole" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="streamRole" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="jukeboxRole" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="shareRole" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="videoConversionRole" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="avatarLastChanged" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@Root(name = "user")
@Default(DefaultType.FIELD)
@Order(elements = {
        "folder"
})
public class User {

    @ElementList(inline = true, entry = "folder", required = false, type = Integer.class)
    protected List<Integer> folder;
    @Attribute(name = "username", required = true)
    protected String username;
    @Attribute(required = false, name = "email")
    protected String email;
    @Attribute(name = "scrobblingEnabled", required = true)
    protected boolean scrobblingEnabled;
    @Attribute(required = false, name = "maxBitRate")
    protected Integer maxBitRate;
    @Attribute(name = "adminRole", required = true)
    protected boolean adminRole;
    @Attribute(name = "settingsRole", required = true)
    protected boolean settingsRole;
    @Attribute(name = "downloadRole", required = true)
    protected boolean downloadRole;
    @Attribute(name = "uploadRole", required = true)
    protected boolean uploadRole;
    @Attribute(name = "playlistRole", required = true)
    protected boolean playlistRole;
    @Attribute(name = "coverArtRole", required = true)
    protected boolean coverArtRole;
    @Attribute(name = "commentRole", required = true)
    protected boolean commentRole;
    @Attribute(name = "podcastRole", required = true)
    protected boolean podcastRole;
    @Attribute(name = "streamRole", required = true)
    protected boolean streamRole;
    @Attribute(name = "jukeboxRole", required = true)
    protected boolean jukeboxRole;
    @Attribute(name = "shareRole", required = true)
    protected boolean shareRole;
    @Attribute(name = "videoConversionRole", required = true)
    protected boolean videoConversionRole;
    @Attribute(required = false, name = "avatarLastChanged")
    // TODO: 08/05/2017 change to date
    @XmlSchemaType(name = "dateTime")
    protected String avatarLastChanged;

    /**
     * Gets the value of the folder property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the folder property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFolder().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     */
    public List<Integer> getFolder() {
        if (folder == null) {
            folder = new ArrayList<Integer>();
        }
        return this.folder;
    }

    /**
     * Gets the value of the username property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setUsername(String value) {
        this.username = value;
    }

    /**
     * Gets the value of the email property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the scrobblingEnabled property.
     */
    public boolean isScrobblingEnabled() {
        return scrobblingEnabled;
    }

    /**
     * Sets the value of the scrobblingEnabled property.
     */
    public void setScrobblingEnabled(boolean value) {
        this.scrobblingEnabled = value;
    }

    /**
     * Gets the value of the maxBitRate property.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getMaxBitRate() {
        return maxBitRate;
    }

    /**
     * Sets the value of the maxBitRate property.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setMaxBitRate(Integer value) {
        this.maxBitRate = value;
    }

    /**
     * Gets the value of the adminRole property.
     */
    public boolean isAdminRole() {
        return adminRole;
    }

    /**
     * Sets the value of the adminRole property.
     */
    public void setAdminRole(boolean value) {
        this.adminRole = value;
    }

    /**
     * Gets the value of the settingsRole property.
     */
    public boolean isSettingsRole() {
        return settingsRole;
    }

    /**
     * Sets the value of the settingsRole property.
     */
    public void setSettingsRole(boolean value) {
        this.settingsRole = value;
    }

    /**
     * Gets the value of the downloadRole property.
     */
    public boolean isDownloadRole() {
        return downloadRole;
    }

    /**
     * Sets the value of the downloadRole property.
     */
    public void setDownloadRole(boolean value) {
        this.downloadRole = value;
    }

    /**
     * Gets the value of the uploadRole property.
     */
    public boolean isUploadRole() {
        return uploadRole;
    }

    /**
     * Sets the value of the uploadRole property.
     */
    public void setUploadRole(boolean value) {
        this.uploadRole = value;
    }

    /**
     * Gets the value of the playlistRole property.
     */
    public boolean isPlaylistRole() {
        return playlistRole;
    }

    /**
     * Sets the value of the playlistRole property.
     */
    public void setPlaylistRole(boolean value) {
        this.playlistRole = value;
    }

    /**
     * Gets the value of the coverArtRole property.
     */
    public boolean isCoverArtRole() {
        return coverArtRole;
    }

    /**
     * Sets the value of the coverArtRole property.
     */
    public void setCoverArtRole(boolean value) {
        this.coverArtRole = value;
    }

    /**
     * Gets the value of the commentRole property.
     */
    public boolean isCommentRole() {
        return commentRole;
    }

    /**
     * Sets the value of the commentRole property.
     */
    public void setCommentRole(boolean value) {
        this.commentRole = value;
    }

    /**
     * Gets the value of the podcastRole property.
     */
    public boolean isPodcastRole() {
        return podcastRole;
    }

    /**
     * Sets the value of the podcastRole property.
     */
    public void setPodcastRole(boolean value) {
        this.podcastRole = value;
    }

    /**
     * Gets the value of the streamRole property.
     */
    public boolean isStreamRole() {
        return streamRole;
    }

    /**
     * Sets the value of the streamRole property.
     */
    public void setStreamRole(boolean value) {
        this.streamRole = value;
    }

    /**
     * Gets the value of the jukeboxRole property.
     */
    public boolean isJukeboxRole() {
        return jukeboxRole;
    }

    /**
     * Sets the value of the jukeboxRole property.
     */
    public void setJukeboxRole(boolean value) {
        this.jukeboxRole = value;
    }

    /**
     * Gets the value of the shareRole property.
     */
    public boolean isShareRole() {
        return shareRole;
    }

    /**
     * Sets the value of the shareRole property.
     */
    public void setShareRole(boolean value) {
        this.shareRole = value;
    }

    /**
     * Gets the value of the videoConversionRole property.
     */
    public boolean isVideoConversionRole() {
        return videoConversionRole;
    }

    /**
     * Sets the value of the videoConversionRole property.
     */
    public void setVideoConversionRole(boolean value) {
        this.videoConversionRole = value;
    }

    /**
     * Gets the value of the avatarLastChanged property.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public String getAvatarLastChanged() {
        return avatarLastChanged;
    }

    /**
     * Sets the value of the avatarLastChanged property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setAvatarLastChanged(String value) {
        this.avatarLastChanged = value;
    }

    @Override
    public String toString() {
        return "User{" +
                "folder=" + folder +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", scrobblingEnabled=" + scrobblingEnabled +
                ", maxBitRate=" + maxBitRate +
                ", adminRole=" + adminRole +
                ", settingsRole=" + settingsRole +
                ", downloadRole=" + downloadRole +
                ", uploadRole=" + uploadRole +
                ", playlistRole=" + playlistRole +
                ", coverArtRole=" + coverArtRole +
                ", commentRole=" + commentRole +
                ", podcastRole=" + podcastRole +
                ", streamRole=" + streamRole +
                ", jukeboxRole=" + jukeboxRole +
                ", shareRole=" + shareRole +
                ", videoConversionRole=" + videoConversionRole +
                ", avatarLastChanged=" + avatarLastChanged +
                '}';
    }
}
