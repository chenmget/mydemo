
package telecom.mss.jt.cg_cgfz;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PROVIDER complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PROVIDER"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BASEINFO" type="{urn:telecom:mss:jt:cgfz}COST_CENTER_BASEINFO" minOccurs="0"/&gt;
 *         &lt;element name="MESSAGE" type="{urn:telecom:mss:jt:cgfz}PROVIDER_FEEDBACK_MODEL" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PROVIDER", propOrder = {
    "baseinfo",
    "message"
})
public class PROVIDER {

    @XmlElement(name = "BASEINFO")
    protected COSTCENTERBASEINFO baseinfo;
    @XmlElement(name = "MESSAGE")
    protected PROVIDERFEEDBACKMODEL message;

    /**
     * 获取baseinfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link COSTCENTERBASEINFO }
     *     
     */
    public COSTCENTERBASEINFO getBASEINFO() {
        return baseinfo;
    }

    /**
     * 设置baseinfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link COSTCENTERBASEINFO }
     *     
     */
    public void setBASEINFO(COSTCENTERBASEINFO value) {
        this.baseinfo = value;
    }

    /**
     * 获取message属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PROVIDERFEEDBACKMODEL }
     *     
     */
    public PROVIDERFEEDBACKMODEL getMESSAGE() {
        return message;
    }

    /**
     * 设置message属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PROVIDERFEEDBACKMODEL }
     *     
     */
    public void setMESSAGE(PROVIDERFEEDBACKMODEL value) {
        this.message = value;
    }

}
