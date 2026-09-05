/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.AutoLeave
 *  Nursultan.class11512
 *  Nursultan.class11524
 *  Nursultan.class11533
 */
package Nursultan;

import Nursultan.AutoLeave;
import Nursultan.class11512;
import Nursultan.class11524;
import Nursultan.class11533;
import Nursultan.class11710;
import Nursultan.class11801;

public class class11716
extends class11710
implements class11801<AutoLeave> {
    public Object L_0;

    @Override
    public String L() {
        this.u();
        return ((class11533)this.L_0).i();
    }

    public class11716(AutoLeave autoLeave, String string, boolean bl) {
        super(autoLeave, null, string, bl);
        this.u();
    }

    private void u() {
    }

    @Override
    public void N(AutoLeave autoLeave) {
        this.u();
        this.L_0 = (class11533)class11524.N((class11512)autoLeave, (String)"custom-command", (String)"home home", null).N(class115362 -> this.U());
    }
}

