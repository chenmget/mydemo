
package telecom.mss.jt.cg_cgfz;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PURHCASE_ORDER_BACK_REQUEST complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PURHCASE_ORDER_BACK_REQUEST"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BASEINFO" type="{urn:telecom:mss:jt:cgfz}COST_CENTER_BASEINFO" minOccurs="0"/&gt;
 *         &lt;element name="MESSAGE" type="{urn:telecom:mss:jt:cgfz}PURHCASE_ORDER_BACK_MESSAGE" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PURHCASE_ORDER_BACK_REQUEST", propOrder = {
    "baseinfo",
    "message"
})
public class PURHCASEORDERBACKREQUEST {

    @XmlElement(name = "BASEINFO")
    protected COSTCENTERBASEINFO baseinfo;
    @XmlElement(name = "MESSAGE")
    protected PURHCASEORDERBACKMESSAGE message;

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
     *     {@link PURHCASEORDERBACKMESSAGE }
     *     
     */
    public PURHCASEORDERBACKMESSAGE getMESSAGE() {
        return message;
    }

    /**
     * 设置message属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PURHCASEORDERBACKMESSAGE }
     *     
     */
    public void setMESSAGE(PURHCASEORDERBACKMESSAGE value) {
        this.message = value;
    }

}
