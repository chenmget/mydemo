
package telecom.mss.jt.cg_cgfz;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>cgfzIfResponse complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="cgfzIfResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IF_RESULT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IF_RESULTINFO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cgfzIfResponse", propOrder = {
    "ifresult",
    "ifresultinfo"
})
public class CgfzIfResponse {

    @XmlElement(name = "IF_RESULT")
    protected String ifresult;
    @XmlElement(name = "IF_RESULTINFO")
    protected String ifresultinfo;

    /**
     * ��ȡifresult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIFRESULT() {
        return ifresult;
    }

    /**
     * ����ifresult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIFRESULT(String value) {
        this.ifresult = value;
    }

    /**
     * ��ȡifresultinfo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIFRESULTINFO() {
        return ifresultinfo;
    }

    /**
     * ����ifresultinfo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIFRESULTINFO(String value) {
        this.ifresultinfo = value;
    }

}