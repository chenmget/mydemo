package telecom.mss.jt.cg_cgfz;

import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Component;

import javax.jws.WebService;

@WebService(targetNamespace = "urn:telecom:mss:jt:cg-cgfz", name = "SI_CGFZSVR_RETURN_MESSAGE_OUT_Syn")
@Component
public class SicgfzsvrreturnmessageoutsynImpl implements Sicgfzsvrreturnmessageoutsyn{

    @Override
    public EIACBACKRESPONSE xxxMTPROVIDERFEEDBACK(PROVIDER iREQUEST) {
        System.out.println("xxxMTPROVIDERFEEDBACK 进来了");
        return null;
    }

    @Override
    public EIACBACKRESPONSE xxxMTPURCHASEORDERBACK(PURHCASEORDERBACKREQUEST iREQUEST) {
        System.out.println("xxxMTPURCHASEORDERBACK 进来了");
        return null;
    }

    @Override
    public EIACBACKRESPONSE xxxMTMATERIALFEEDBACK(PROVIDER iREQUEST) {
        System.out.println("xxxMTMATERIALFEEDBACK 进来了");
        System.out.println("iREQUEST的值----"+JSON.toJSONString(iREQUEST));
        return null;
    }

    @Override
    public EIACBACKRESPONSE xxxMTMATCONFIGFEEDBACK(PROVIDER iREQUEST) {
        System.out.println("xxxMTMATCONFIGFEEDBACK 进来了");
        return null;
    }

    @Override
    public EIACBACKRESPONSE xxxMTCHANGEPURCHASEORDERBACK(PURHCASEORDERBACKREQUEST iREQUEST) {
        System.out.println("xxxMTCHANGEPURCHASEORDERBACK 进来了");
        return null;
    }
}