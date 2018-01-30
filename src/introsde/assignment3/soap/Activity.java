
package introsde.assignment3.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per activity complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="activity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="place" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="type" type="{http://soap.assignment3.introsde/}activityType"/>
 *         &lt;element name="startdate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="preference" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "activity", propOrder = {
    "name",
    "description",
    "place",
    "type",
    "startdate",
    "preference"
})
public class Activity {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String description;
    @XmlElement(required = true)
    protected String place;
    @XmlElement(required = true)
    protected ActivityType type;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startdate;
    protected int preference;
    @XmlAttribute(name = "id", required = true)
    protected int id;

    /**
     * Recupera il valore della proprietà name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Imposta il valore della proprietà name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Recupera il valore della proprietà description.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Imposta il valore della proprietà description.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Recupera il valore della proprietà place.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlace() {
        return place;
    }

    /**
     * Imposta il valore della proprietà place.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlace(String value) {
        this.place = value;
    }

    /**
     * Recupera il valore della proprietà type.
     * 
     * @return
     *     possible object is
     *     {@link ActivityType }
     *     
     */
    public ActivityType getType() {
        return type;
    }

    /**
     * Imposta il valore della proprietà type.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivityType }
     *     
     */
    public void setType(ActivityType value) {
        this.type = value;
    }

    /**
     * Recupera il valore della proprietà startdate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartdate() {
        return startdate;
    }

    /**
     * Imposta il valore della proprietà startdate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartdate(XMLGregorianCalendar value) {
        this.startdate = value;
    }

    /**
     * Recupera il valore della proprietà preference.
     * 
     */
    public int getPreference() {
        return preference;
    }

    /**
     * Imposta il valore della proprietà preference.
     * 
     */
    public void setPreference(int value) {
        this.preference = value;
    }

    /**
     * Recupera il valore della proprietà id.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Imposta il valore della proprietà id.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

}
