/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.AutoLeave
 *  Nursultan.class11807
 *  Nursultan.class11815
 *  Nursultan.class11822
 *  minecraft.class04453
 *  minecraft.class06202
 */
package Nursultan;

import Nursultan.AutoLeave;
import Nursultan.class11796;
import Nursultan.class11798;
import Nursultan.class11807;
import Nursultan.class11815;
import Nursultan.class11822;
import minecraft.class04453;
import minecraft.class06202;

public class class11707
extends class11807<AutoLeave> {
    public Object y_0;
    public boolean y_init;

    public class11707(AutoLeave autoLeave, String string, boolean bl) {
        super((Object)autoLeave, string, bl);
        this.u();
    }

    private void u() {
        if (!this.y_init) {
            this.y_init = true;
            this.y_0 = false;
        }
    }

    public void y(Object object) {
        this.u();
        if (((class11815)((class11796)((Object)((class11822)((class04453)((class06202)((class11798)((Object)this)).N_0).T_4)).dataManager())).y().N()).N()) {
            this.y_0 = true;
            return;
        }
        if (((Boolean)this.y_0).booleanValue()) {
            this.y_0 = false;
            ((AutoLeave)((class11798)((Object)this)).N_1).m();
        }
    }
}

