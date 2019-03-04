package jdemf.example.p01012;

public class P01012_W01012B_FormParent {

    private P01012_W01012B fs_P01012_W01012B = new P01012_W01012B();

    public P01012_W01012B_FormParent() {
        super();
    }

    public void setFs_P01012_W01012B(P01012_W01012B fs_P01012_W01012B) {
        this.fs_P01012_W01012B = fs_P01012_W01012B;
    }

    public P01012_W01012B getFs_P01012_W01012B() {
        return fs_P01012_W01012B;
    }

    public int getRowIndexForRow(int rowNum) {
        return getFs_P01012_W01012B().getData().getGridData().getRowset()[rowNum].getRowIndex();
    }

    public boolean getMOExistForRow(int rowNum) {
        return getFs_P01012_W01012B().getData().getGridData().getRowset()[rowNum].getMOExist();
    }

    public String getZ_AN8_19ForRow(int rowNum) {
        return getFs_P01012_W01012B().getData().getGridData().getRowset()[rowNum].getZ_AN8_19().getValue();
    }

    public String getZ_ALPH_20ForRow(int rowNum) {
        return getFs_P01012_W01012B().getData().getGridData().getRowset()[rowNum].getZ_ALPH_20().getValue();
    }

    public String getZ_ALKY_48ForRow(int rowNum) {
        return getFs_P01012_W01012B().getData().getGridData().getRowset()[rowNum].getZ_ALKY_48().getValue();
    }

    public String getZ_SIC_49ForRow(int rowNum) {
        return getFs_P01012_W01012B().getData().getGridData().getRowset()[rowNum].getZ_SIC_49().getValue();
    }

    public String getZ_AT1_50ForRow(int rowNum) {
        return getFs_P01012_W01012B().getData().getGridData().getRowset()[rowNum].getZ_AT1_50().getValue();
    }
}
