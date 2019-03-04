package application;

import jdemf.example.p4617.P4617_W4617B_FormParent;

import com.oracle.e1.jdemf.FSREvent;
import com.oracle.e1.jdemf.FormRequest;
import com.oracle.e1.jdemf.JDERestServiceException;
import com.oracle.e1.jdemf.JDERestServiceProvider;

//import jdemf.example.FormErrorWarning;
//import jdemf.example.p01012.P01012_W01012A_FormParent;
//import jdemf.example.p01012.P01012_W01012B_FormParent;

import oracle.adf.model.datacontrols.device.Contact;
import oracle.adf.model.datacontrols.device.ContactAddresses;
import oracle.adf.model.datacontrols.device.ContactName;
import oracle.adf.model.datacontrols.device.DeviceManagerFactory;

import oracle.adfmf.framework.api.AdfmfContainerUtilities;
import oracle.adfmf.framework.api.JSONBeanSerializationHelper;
import oracle.adfmf.framework.exception.AdfException;
import oracle.adfmf.java.beans.PropertyChangeListener;
import oracle.adfmf.java.beans.PropertyChangeSupport;
import oracle.adfmf.java.beans.ProviderChangeListener;
import oracle.adfmf.java.beans.ProviderChangeSupport;
import oracle.adfmf.json.JSONObject;

public class P4617DC {
    
    P4617_W4617B_FormParent P4617_W4617B_FormParent = new P4617_W4617B_FormParent();
    
    public P4617DC() {
        super();
        getP4617List();
    }

    public void setP4617_W4617B_FormParent(P4617_W4617B_FormParent P4617_W4617B_FormParent) {
        this.P4617_W4617B_FormParent = P4617_W4617B_FormParent;
    }

    public P4617_W4617B_FormParent getP4617_W4617B_FormParent() {
        return P4617_W4617B_FormParent;
    }

    public void getP4617List(){
            
            FormRequest formRequest = new FormRequest();
            formRequest.setFormName("P4617_W4617B");
            formRequest.setVersion("LT0003");
            formRequest.setFormServiceAction("R");
            
            FSREvent w4617BFSREvent = new FSREvent();
            w4617BFSREvent.setFieldValue("29","340"); //set search type to customer
          //  w4617BFSREvent.setFieldValue("512","1"); //set search type to customer
            
            w4617BFSREvent.doControlAction("15");  // Trigger the Find Button
            formRequest.addFSREvent(w4617BFSREvent); //add the events to the form request
            
            
            try
            {
                //Serialize the form request to JSON String
                JSONObject jsonObject = (JSONObject)JSONBeanSerializationHelper.toJSON(formRequest);
                String postData = jsonObject.toString();
                
                // Call to JDERestServiceProvider with parameters JSON string
                String response = JDERestServiceProvider.jdeRestServiceCall(postData, JDERestServiceProvider.POST,JDERestServiceProvider.FORM_SERVICE_URI);
                
                //deserialize the response to the class for the W4617B form
                P4617_W4617B_FormParent = (P4617_W4617B_FormParent)JSONBeanSerializationHelper.fromJSON(P4617_W4617B_FormParent.class, response);
                
              
            }
            catch (JDERestServiceException e)
            {
                JDERestServiceProvider.handleServiceException(e);
            }        
            catch(Exception e)
            {
                throw new AdfException(e.getMessage(), AdfException.ERROR);    
            }   
        }



}
