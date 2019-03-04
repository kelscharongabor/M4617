package jdemf.example.p01012;

import jdemf.example.GridDataMobile;
import java.util.ArrayList;

public class P01012_W01012B_GridData extends GridDataMobile {

    private P01012_W01012B_GridColumnTitles titles = new P01012_W01012B_GridColumnTitles();

    public P01012_W01012B_GridData() {
        super();
    }

    public void setTitles(P01012_W01012B_GridColumnTitles titles) {
        this.titles = titles;
    }

    public P01012_W01012B_GridColumnTitles getTitles() {
        return titles;
    }

    public void setRowset(P01012_W01012B_GridRow[] rowset) {
        this.rowset = new ArrayList();

        for (int i = 0; i < rowset.length; i++){
            this.rowset.add(rowset[i]);
        }

        providerChangeSupport.fireProviderRefresh("rowset");
    }

    public P01012_W01012B_GridRow[] getRowset() {
        return (P01012_W01012B_GridRow[]) rowset.toArray(new P01012_W01012B_GridRow[rowset.size()]);
    }

    public void addRow(P01012_W01012B_GridRow row) {
        rowset.add(row);
    }

    /* Stub for delete row.  If you need delete row functionality, you will need
     * to modify this method to reflect which grid column represents the row id.
     * For example, for P01012_W01012B, you would use mnAddressNumber.  */
    // public void deleteRowId(String id) {
    //     for (int i = 0; i < rowset.size(); i++) {
    //         P01012_W01012B_GridRow current = (P01012_W01012B_GridRow) rowset.get(i);
    // 
    //         if (current.<ID_FIELD>.getValue().equals(id)){
    //             rowset.remove(i);
    //         }
    //     }
    //
    //     summary.setRecords(rowset.size());
    // }
}
