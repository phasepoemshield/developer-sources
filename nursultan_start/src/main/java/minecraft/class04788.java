/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02796
 */
package minecraft;

import java.util.Vector;
import javax.swing.JList;
import minecraft.class02796;
import minecraft.class04770;

public class class04788
extends JList<String> {
    private final class02796 N;
    private int y;

    public class04788(class02796 class027962) {
        this.N = class027962;
        class027962.Z(this::N);
    }

    public void N() {
        if (this.y++ % 20 == 0) {
            Vector<String> vector = new Vector<String>();
            for (int i = 0; i < this.N.Nm().v().size(); ++i) {
                vector.add(((class04770)((Object)this.N.Nm().v().get(i))).method_7334().name());
            }
            this.setListData(vector);
        }
    }
}

