
package telecom.mss.jt.cg_cgfz;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>XXX_MT_MATCONFIG_FEEDBACK complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="XXX_MT_MATCONFIG_FEEDBACK"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="I_REQUEST" type="{urn:telecom:mss:jt:cgfz}PROVIDER" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XXX_MT_MATCONFIG_FEEDBACK", propOrder = {
    "irequest"
})
public class XXXMTMATCONFIGFEEDBACK {

    @XmlElement(name = "I_REQUEST")
    protected PROVIDER irequest;

    /**
     * 获取irequest属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PROVIDER }
     *     
     */
    public PROVIDER getIREQUEST() {
        return irequest;
    }

    /**
     * 设置irequest属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PROVIDER }
     *     
     */
    public void setIREQUEST(PROVIDER value) {
        this.irequest = value;
    }

}
