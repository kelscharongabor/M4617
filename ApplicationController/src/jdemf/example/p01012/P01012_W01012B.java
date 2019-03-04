package jdemf.example.p01012;

import jdemf.example.FormMobile;

public class P01012_W01012B extends FormMobile {

    private P01012_W01012B_FormData data = new P01012_W01012B_FormData();

    public P01012_W01012B() {
        super();
    }

    public void setData(P01012_W01012B_FormData data) {
        this.data = data;
    }

    public P01012_W01012B_FormData getData() {
        return data;
    }
}
