/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.ClickAction
 *  Nursultan.class11389
 *  Nursultan.class11512
 *  Nursultan.class11524
 *  Nursultan.class11527
 *  Nursultan.class12002
 *  minecraft.class06202
 */
package Nursultan;

import Nursultan.ClickAction;
import Nursultan.class11389;
import Nursultan.class11512;
import Nursultan.class11524;
import Nursultan.class11527;
import Nursultan.class12002;
import minecraft.class06202;

public abstract class class11142 {
    public Object N_0;
    public Object N_1;

    public class11142(ClickAction clickAction, String string) {
        this.N();
        this.N_0 = class06202.Nq();
        this.N_1 = class11524.N((class11512)clickAction, (String)string, (class12002)class12002.UNKNOWN);
    }

    public abstract void y(class11389 var1);

    private void N() {
    }

    public void N(class11389 class113892) {
        if (!((class11527)this.N_1).N(class113892)) {
            return;
        }
        this.y(class113892);
    }
}

