
package telecom.mss.jt.cg_cgfz;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>XXX_MT_PURCHASE_ORDER_BACK complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="XXX_MT_PURCHASE_ORDER_BACK"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="I_REQUEST" type="{urn:telecom:mss:jt:cgfz}PURHCASE_ORDER_BACK_REQUEST" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XXX_MT_PURCHASE_ORDER_BACK", propOrder = {
    "irequest"
})
public class XXXMTPURCHASEORDERBACK {

    @XmlElement(name = "I_REQUEST")
    protected PURHCASEORDERBACKREQUEST irequest;

    /**
     * ��ȡirequest���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link PURHCASEORDERBACKREQUEST }
     *     
     */
    public PURHCASEORDERBACKREQUEST getIREQUEST() {
        return irequest;
    }

    /**
     * ����irequest���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link PURHCASEORDERBACKREQUEST }
     *     
     */
    public void setIREQUEST(PURHCASEORDERBACKREQUEST value) {
        this.irequest = value;
    }

}
