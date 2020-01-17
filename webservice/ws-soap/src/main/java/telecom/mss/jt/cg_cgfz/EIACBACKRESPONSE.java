
package telecom.mss.jt.cg_cgfz;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>EIAC_BACK_RESPONSE complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="EIAC_BACK_RESPONSE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BASEINFO" type="{urn:telecom:mss:jt:cgfz}EIAC_BACK_BASEINFO" minOccurs="0"/&gt;
 *         &lt;element name="ITEMSTATUS" type="{urn:telecom:mss:jt:cgfz}itemStatus" minOccurs="0"/&gt;
 *         &lt;element name="MESSAGE" type="{urn:telecom:mss:jt:cgfz}cgfzIfResponse" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EIAC_BACK_RESPONSE", propOrder = {
    "baseinfo",
    "itemstatus",
    "message"
})
public class EIACBACKRESPONSE {

    @XmlElement(name = "BASEINFO")
    protected EIACBACKBASEINFO baseinfo;
    @XmlElement(name = "ITEMSTATUS")
    protected ItemStatus itemstatus;
    @XmlElement(name = "MESSAGE")
    protected CgfzIfResponse message;

    /**
     * 获取baseinfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EIACBACKBASEINFO }
     *     
     */
    public EIACBACKBASEINFO getBASEINFO() {
        return baseinfo;
    }

    /**
     * 设置baseinfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EIACBACKBASEINFO }
     *     
     */
    public void setBASEINFO(EIACBACKBASEINFO value) {
        this.baseinfo = value;
    }

    /**
     * 获取itemstatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ItemStatus }
     *     
     */
    public ItemStatus getITEMSTATUS() {
        return itemstatus;
    }

    /**
     * 设置itemstatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ItemStatus }
     *     
     */
    public void setITEMSTATUS(ItemStatus value) {
        this.itemstatus = value;
    }

    /**
     * 获取message属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CgfzIfResponse }
     *     
     */
    public CgfzIfResponse getMESSAGE() {
        return message;
    }

    /**
     * 设置message属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CgfzIfResponse }
     *     
     */
    public void setMESSAGE(CgfzIfResponse value) {
        this.message = value;
    }

}
