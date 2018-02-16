package main.enam;

/**
 * Created by Екатерина on 16.02.2018.
 */
public enum Note {
    C("до"),
    D("ре"),
    E("ми"),
    F("фа"),
    G("соль"),
    A("ля"),
    B("си");

    String note;
    Note(String note) {
        this.note = note;
    }
}
