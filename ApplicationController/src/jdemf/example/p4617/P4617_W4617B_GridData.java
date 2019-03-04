package jdemf.example.p4617;

import jdemf.example.GridDataMobile;
import java.util.ArrayList;

public class P4617_W4617B_GridData extends GridDataMobile {

    private P4617_W4617B_GridColumnTitles titles = new P4617_W4617B_GridColumnTitles();

    public P4617_W4617B_GridData() {
        super();
    }

    public void setTitles(P4617_W4617B_GridColumnTitles titles) {
        this.titles = titles;
    }

    public P4617_W4617B_GridColumnTitles getTitles() {
        return titles;
    }

    public void setRowset(P4617_W4617B_GridRow[] rowset) {
        this.rowset = new ArrayList();

        for (int i = 0; i < rowset.length; i++){
            this.rowset.add(rowset[i]);
        }

        providerChangeSupport.fireProviderRefresh("rowset");
    }

    public P4617_W4617B_GridRow[] getRowset() {
        return (P4617_W4617B_GridRow[]) rowset.toArray(new P4617_W4617B_GridRow[rowset.size()]);
    }

    public void addRow(P4617_W4617B_GridRow row) {
        rowset.add(row);
    }

    /* Stub for delete row.  If you need delete row functionality, you will need
     * to modify this method to reflect which grid column represents the row id.
     * For example, for P01012_W01012B, you would use mnAddressNumber.  */
    // public void deleteRowId(String id) {
    //     for (int i = 0; i < rowset.size(); i++) {
    //         P4617_W4617B_GridRow current = (P4617_W4617B_GridRow) rowset.get(i);
    // 
    //         if (current.<ID_FIELD>.getValue().equals(id)){
    //             rowset.remove(i);
    //         }
    //     }
    //
    //     summary.setRecords(rowset.size());
    // }
}
