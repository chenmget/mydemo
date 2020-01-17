
package telecom.mss.jt.cg_cgfz;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>XXX_MT_MATCONFIG_FEEDBACKResponse complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="XXX_MT_MATCONFIG_FEEDBACKResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="E_RESPONSE" type="{urn:telecom:mss:jt:cgfz}EIAC_BACK_RESPONSE" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XXX_MT_MATCONFIG_FEEDBACKResponse", propOrder = {
    "eresponse"
})
public class XXXMTMATCONFIGFEEDBACKResponse {

    @XmlElement(name = "E_RESPONSE")
    protected EIACBACKRESPONSE eresponse;

    /**
     * 获取eresponse属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EIACBACKRESPONSE }
     *     
     */
    public EIACBACKRESPONSE getERESPONSE() {
        return eresponse;
    }

    /**
     * 设置eresponse属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EIACBACKRESPONSE }
     *     
     */
    public void setERESPONSE(EIACBACKRESPONSE value) {
        this.eresponse = value;
    }

}
