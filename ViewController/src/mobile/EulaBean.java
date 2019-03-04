package mobile;

import com.oracle.e1.jdemf.JDEmfUtilities;

import oracle.adfmf.amx.event.ActionEvent;

public class EulaBean {
    public EulaBean() {
    }

    public void doneEULA(ActionEvent actionEvent) {
        JDEmfUtilities.goToDefaultFeature();
    }
}
