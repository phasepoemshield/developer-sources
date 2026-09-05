/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.AutoLeave
 *  minecraft.class06202
 */
package Nursultan;

import Nursultan.AutoLeave;
import Nursultan.class11708;
import Nursultan.class11798;
import minecraft.class06202;

public class class11710
extends class11798<AutoLeave>
implements class11708 {
    public Object y_0;

    public String L() {
        this.u();
        return (String)this.y_0;
    }

    public class11710(AutoLeave autoLeave, String string, String string2, boolean bl) {
        super(autoLeave, string2, bl);
        this.u();
        this.y_0 = string;
    }

    private void u() {
    }

    @Override
    public void N() {
        String string = this.L();
        if (string.isBlank()) {
            return;
        }
        ((class06202)this.N_0).NE().u(string);
    }
}

