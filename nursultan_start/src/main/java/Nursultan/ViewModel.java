/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10949
 *  Nursultan.class11067
 *  Nursultan.class11072
 *  Nursultan.class11080
 *  Nursultan.class11106
 *  Nursultan.class11504
 *  Nursultan.class11512
 *  Nursultan.class11524
 *  Nursultan.class11536
 *  Nursultan.class11782
 */
package Nursultan;

import Nursultan.class10949;
import Nursultan.class11067;
import Nursultan.class11072;
import Nursultan.class11080;
import Nursultan.class11106;
import Nursultan.class11504;
import Nursultan.class11512;
import Nursultan.class11524;
import Nursultan.class11536;
import Nursultan.class11782;
import java.util.List;

@class11080(L="ViewModel", y=class11072.VISUAL, N=class11106.WORLD)
public class ViewModel
extends class11067 {
    public Object L_0;
    public Object L_1;
    public Object L_2;
    public Object L_3;
    public Object L_4;
    public Object L_5;
    public Object L_6;
    public Object L_7;

    public ViewModel() {
        this.b();
        this.L_0 = class11524.N((class11512)this, (String)"right-hand-x", (float)0.0f, (float)-1.0f, (float)1.0f, (float)0.05f);
        this.L_1 = class11524.N((class11512)this, (String)"right-hand-y", (float)0.0f, (float)-1.0f, (float)1.0f, (float)0.05f);
        this.L_2 = class11524.N((class11512)this, (String)"right-hand-z", (float)0.0f, (float)-1.0f, (float)1.0f, (float)0.05f);
        this.L_3 = class11524.N((class11512)this, (String)"right-scale", (float)1.0f, (float)0.1f, (float)2.0f, (float)0.05f);
        this.L_4 = class11524.N((class11512)this, (String)"left-hand-x", (float)0.0f, (float)-1.0f, (float)1.0f, (float)0.05f);
        this.L_5 = class11524.N((class11512)this, (String)"left-hand-y", (float)0.0f, (float)-1.0f, (float)1.0f, (float)0.05f);
        this.L_6 = class11524.N((class11512)this, (String)"left-hand-z", (float)0.0f, (float)-1.0f, (float)1.0f, (float)0.05f);
        this.L_7 = class11524.N((class11512)this, (String)"left-scale", (float)1.0f, (float)0.1f, (float)2.0f, (float)0.05f);
        class11524.N((class11512)this, (String)"reset", () -> {
            this.b();
            List.of((class11504)this.L_0, (class11504)this.L_1, (class11504)this.L_2, (class11504)this.L_3, (class11504)this.L_4, (class11504)this.L_5, (class11504)this.L_6, (class11504)this.L_7).forEach(class11536::s);
        });
    }

    private void b() {
    }

    @class11782
    public void N(class10949 class109492) {
        this.b();
        class109492.y().set(((Float)((class11504)this.L_0).i()).floatValue(), ((Float)((class11504)this.L_1).i()).floatValue(), ((Float)((class11504)this.L_2).i()).floatValue(), ((Float)((class11504)this.L_3).i()).floatValue());
        class109492.N().set(((Float)((class11504)this.L_4).i()).floatValue(), ((Float)((class11504)this.L_5).i()).floatValue(), ((Float)((class11504)this.L_6).i()).floatValue(), ((Float)((class11504)this.L_7).i()).floatValue());
    }
}

