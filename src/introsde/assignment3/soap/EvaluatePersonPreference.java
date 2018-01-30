
package introsde.assignment3.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per evaluatePersonPreference complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="evaluatePersonPreference">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="arg1" type="{http://soap.assignment3.introsde/}activity" minOccurs="0"/>
 *         &lt;element name="arg2" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "evaluatePersonPreference", propOrder = {
    "arg0",
    "arg1",
    "arg2"
})
public class EvaluatePersonPreference {

    protected Integer arg0;
    protected Activity arg1;
    protected Integer arg2;

    /**
     * Recupera il valore della proprietà arg0.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getArg0() {
        return arg0;
    }

    /**
     * Imposta il valore della proprietà arg0.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setArg0(Integer value) {
        this.arg0 = value;
    }

    /**
     * Recupera il valore della proprietà arg1.
     * 
     * @return
     *     possible object is
     *     {@link Activity }
     *     
     */
    public Activity getArg1() {
        return arg1;
    }

    /**
     * Imposta il valore della proprietà arg1.
     * 
     * @param value
     *     allowed object is
     *     {@link Activity }
     *     
     */
    public void setArg1(Activity value) {
        this.arg1 = value;
    }

    /**
     * Recupera il valore della proprietà arg2.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getArg2() {
        return arg2;
    }

    /**
     * Imposta il valore della proprietà arg2.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setArg2(Integer value) {
        this.arg2 = value;
    }

}
