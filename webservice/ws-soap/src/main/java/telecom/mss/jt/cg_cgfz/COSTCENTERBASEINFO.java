
package telecom.mss.jt.cg_cgfz;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>COST_CENTER_BASEINFO complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="COST_CENTER_BASEINFO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MSGID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PSGID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SENDTIME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="S_PROVINCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="S_SYSTEM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SERVICENAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="T_PROVINCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="T_SYSTEM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RETRY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COST_CENTER_BASEINFO", propOrder = {
    "msgid",
    "psgid",
    "sendtime",
    "sprovince",
    "ssystem",
    "servicename",
    "tprovince",
    "tsystem",
    "retry"
})
public class COSTCENTERBASEINFO {

    @XmlElement(name = "MSGID")
    protected String msgid;
    @XmlElement(name = "PSGID")
    protected String psgid;
    @XmlElement(name = "SENDTIME")
    protected String sendtime;
    @XmlElement(name = "S_PROVINCE")
    protected String sprovince;
    @XmlElement(name = "S_SYSTEM")
    protected String ssystem;
    @XmlElement(name = "SERVICENAME")
    protected String servicename;
    @XmlElement(name = "T_PROVINCE")
    protected String tprovince;
    @XmlElement(name = "T_SYSTEM")
    protected String tsystem;
    @XmlElement(name = "RETRY")
    protected String retry;

    /**
     * 获取msgid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMSGID() {
        return msgid;
    }

    /**
     * 设置msgid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMSGID(String value) {
        this.msgid = value;
    }

    /**
     * 获取psgid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPSGID() {
        return psgid;
    }

    /**
     * 设置psgid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPSGID(String value) {
        this.psgid = value;
    }

    /**
     * 获取sendtime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSENDTIME() {
        return sendtime;
    }

    /**
     * 设置sendtime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSENDTIME(String value) {
        this.sendtime = value;
    }

    /**
     * 获取sprovince属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPROVINCE() {
        return sprovince;
    }

    /**
     * 设置sprovince属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPROVINCE(String value) {
        this.sprovince = value;
    }

    /**
     * 获取ssystem属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSYSTEM() {
        return ssystem;
    }

    /**
     * 设置ssystem属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSYSTEM(String value) {
        this.ssystem = value;
    }

    /**
     * 获取servicename属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSERVICENAME() {
        return servicename;
    }

    /**
     * 设置servicename属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSERVICENAME(String value) {
        this.servicename = value;
    }

    /**
     * 获取tprovince属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTPROVINCE() {
        return tprovince;
    }

    /**
     * 设置tprovince属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTPROVINCE(String value) {
        this.tprovince = value;
    }

    /**
     * 获取tsystem属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSYSTEM() {
        return tsystem;
    }

    /**
     * 设置tsystem属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSYSTEM(String value) {
        this.tsystem = value;
    }

    /**
     * 获取retry属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRETRY() {
        return retry;
    }

    /**
     * 设置retry属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRETRY(String value) {
        this.retry = value;
    }

}
