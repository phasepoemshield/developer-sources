/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.Flight
 *  Nursultan.class11370
 *  Nursultan.class11504
 *  Nursultan.class11512
 *  Nursultan.class11524
 *  Nursultan.class11798
 *  Nursultan.class11801
 *  Nursultan.class11807
 *  Nursultan.class11902
 *  minecraft.class04453
 *  minecraft.class04462
 *  minecraft.class04474
 *  minecraft.class06202
 *  minecraft.class06889
 *  minecraft.class08687
 */
package Nursultan;

import Nursultan.Flight;
import Nursultan.class11370;
import Nursultan.class11504;
import Nursultan.class11512;
import Nursultan.class11524;
import Nursultan.class11798;
import Nursultan.class11801;
import Nursultan.class11807;
import Nursultan.class11902;
import minecraft.class04453;
import minecraft.class04462;
import minecraft.class04474;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class08687;

public class class10892
extends class11807<Flight>
implements class11801<Flight> {
    public Object y_0;

    public class10892(Flight flight, String string, boolean bl) {
        super((Object)flight, string, bl);
        this.R();
    }

    static {
        class10892.N();
    }

    public void y(Object object) {
        this.R();
        if (object instanceof class11370) {
            class11370 class113702 = (class11370)object;
            class08687 class086872 = ((class04474)((class04453)((class06202)((class11798)this).N_0).T_4).L_1).field_54155;
            float f = class04462.N((boolean)class086872.N(), (boolean)class086872.y());
            float f2 = class04462.N((boolean)class086872.L(), (boolean)class086872.u());
            class06889 class068892 = class06889.L;
            if (f != 0.0f || f2 != 0.0f) {
                double d = Math.toRadians(class11902.N((float)((class04453)((class06202)((class11798)this).N_0).T_4).method_36454(), (float)f, (float)f2));
                class068892 = class068892.y(-Math.sin(d) * (double)((Float)((class11504)this.y_0).i()).floatValue(), 0.0, Math.cos(d) * (double)((Float)((class11504)this.y_0).i()).floatValue());
            }
            float f3 = class04462.N((boolean)class086872.i(), (boolean)class086872.R());
            class068892 = class068892.y(0.0, (double)(f3 * ((Float)((class11504)this.y_0).i()).floatValue() / 2.0f), 0.0);
            class113702.N(class068892);
        }
    }

    private static void N() {
    }

    public void N(Flight flight) {
        this.R();
        this.y_0 = (class11504)class11524.N((class11512)flight, (String)"speed", (float)1.0f, (float)0.1f, (float)10.0f, (float)0.1f).N(class115362 -> this.U());
    }

    private void R() {
    }
}

