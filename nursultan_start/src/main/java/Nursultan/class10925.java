/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.Flight
 *  Nursultan.class11385
 *  Nursultan.class11504
 *  Nursultan.class11512
 *  Nursultan.class11524
 *  Nursultan.class11798
 *  Nursultan.class11801
 *  Nursultan.class11807
 *  Nursultan.class11902
 *  minecraft.class04453
 *  minecraft.class04462
 *  minecraft.class06202
 *  minecraft.class06889
 */
package Nursultan;

import Nursultan.Flight;
import Nursultan.class11385;
import Nursultan.class11504;
import Nursultan.class11512;
import Nursultan.class11524;
import Nursultan.class11798;
import Nursultan.class11801;
import Nursultan.class11807;
import Nursultan.class11902;
import minecraft.class04453;
import minecraft.class04462;
import minecraft.class06202;
import minecraft.class06889;

public class class10925
extends class11807<Flight>
implements class11801<Flight> {
    public Object y_0;

    public class10925(Flight flight, String string, boolean bl) {
        super((Object)flight, string, bl);
        this.R();
    }

    static {
        class10925.N();
    }

    public void y(Object object) {
        this.R();
        if (object instanceof class11385) {
            float f;
            class11385 class113852 = (class11385)object;
            float f2 = class04462.N((boolean)class113852.i(), (boolean)class113852.M());
            float f3 = class04462.N((boolean)class113852.u(), (boolean)class113852.Z());
            if (f2 != 0.0f || f3 != 0.0f) {
                double d = Math.toRadians(class11902.N((float)((class04453)((class06202)((class11798)this).N_0).T_4).method_36454(), (float)f2, (float)f3));
                ((class04453)((class06202)((class11798)this).N_0).T_4).method_60491(new class06889(-Math.sin(d) * (double)((Float)((class11504)this.y_0).i()).floatValue(), 0.0, Math.cos(d) * (double)((Float)((class11504)this.y_0).i()).floatValue()));
            }
            if ((f = class04462.N((boolean)class113852.L(), (boolean)class113852.R())) != 0.0f) {
                ((class04453)((class06202)((class11798)this).N_0).T_4).method_60491(new class06889(0.0, (double)(f * ((Float)((class11504)this.y_0).i()).floatValue() / 2.0f), 0.0));
            }
        }
    }

    public void N(Flight flight) {
        this.R();
        this.y_0 = (class11504)class11524.N((class11512)flight, (String)"boost", (float)1.0f, (float)0.1f, (float)5.0f, (float)0.1f).N(class115362 -> this.U());
    }

    private static void N() {
    }

    private void R() {
    }
}

