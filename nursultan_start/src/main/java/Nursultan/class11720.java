/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.NoDelay
 *  Nursultan.class11380
 *  Nursultan.class11504
 *  Nursultan.class11512
 *  Nursultan.class11524
 *  minecraft.class03443
 *  minecraft.class03448
 *  minecraft.class06183
 *  minecraft.class06202
 *  minecraft.class07089
 */
package Nursultan;

import Nursultan.NoDelay;
import Nursultan.class11380;
import Nursultan.class11504;
import Nursultan.class11512;
import Nursultan.class11524;
import Nursultan.class11704;
import Nursultan.class11798;
import Nursultan.class11801;
import minecraft.class03443;
import minecraft.class03448;
import minecraft.class06183;
import minecraft.class06202;
import minecraft.class07089;

public class class11720
extends class11704
implements class11801<NoDelay> {
    public Object y_0;

    public class11720(NoDelay noDelay, String string, boolean bl) {
        super(noDelay, string, bl);
        this.u();
    }

    static {
        class11720.N();
    }

    private void u() {
    }

    public void y(Object object) {
        this.u();
        if (object instanceof class11380 && (class03448)((class06202)((class11798)((Object)this)).N_0).T_3 != null) {
            ((class03443)((class06202)((class11798)((Object)this)).N_0).T_2).y = 0;
            if (((class03443)((class06202)((class11798)((Object)this)).N_0).T_2).L && (class07089)((class06202)((class11798)((Object)this)).N_0).M_3 instanceof class06183 && ((class03443)((class06202)((class11798)((Object)this)).N_0).T_2).N > 1.1f - ((Float)((class11504)this.y_0).i()).floatValue()) {
                ((class03443)((class06202)((class11798)((Object)this)).N_0).T_2).N = 1.0f;
            }
        }
    }

    @Override
    public void N(NoDelay noDelay) {
        this.u();
        this.y_0 = (class11504)class11524.N((class11512)noDelay, (String)"break-delay", (float)0.5f, (float)0.1f, (float)1.0f, (float)0.1f).N(class115362 -> this.U());
    }

    private static void N() {
    }
}

