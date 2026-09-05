/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.AutoLeave
 *  Nursultan.class10957
 *  Nursultan.class11504
 *  Nursultan.class11512
 *  Nursultan.class11524
 *  Nursultan.class11807
 *  minecraft.class03448
 *  minecraft.class04453
 *  minecraft.class06202
 *  minecraft.class07049
 *  minecraft.class08036
 */
package Nursultan;

import Nursultan.AutoLeave;
import Nursultan.class10957;
import Nursultan.class11504;
import Nursultan.class11512;
import Nursultan.class11524;
import Nursultan.class11791;
import Nursultan.class11798;
import Nursultan.class11801;
import Nursultan.class11807;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class07049;
import minecraft.class08036;

public class class11719
extends class11807<AutoLeave>
implements class11801<AutoLeave> {
    public Object y_0;

    private void L() {
    }

    public class11719(AutoLeave autoLeave, String string, boolean bl) {
        super((Object)autoLeave, string, bl);
        this.L();
    }

    static {
        class11719.N();
    }

    public void y(Object object) {
        this.L();
        if (object instanceof class10957 && !((class03448)((class06202)((class11798)((Object)this)).N_0).T_3).N(class08036.class, ((class04453)((class06202)((class11798)((Object)this)).N_0).T_4).method_5829().M((double)((Float)((class11504)this.y_0).i()).floatValue()), this::N).isEmpty()) {
            ((AutoLeave)((class11798)((Object)this)).N_1).m();
        }
    }

    private boolean N(class08036 class080362) {
        if (class080362 == (class04453)((class06202)((class11798)((Object)this)).N_0).T_4) {
            return false;
        }
        return class080362.method_5805() && !class11791.u().test((class07049)class080362) && !class11791.Z().test((class07049)class080362);
    }

    private static void N() {
    }

    @Override
    public void N(AutoLeave autoLeave) {
        this.L();
        this.y_0 = (class11504)class11524.N((class11512)autoLeave, (String)"distance", (float)40.0f, (float)1.0f, (float)100.0f, (float)1.0f).N(class115362 -> this.U());
    }
}

