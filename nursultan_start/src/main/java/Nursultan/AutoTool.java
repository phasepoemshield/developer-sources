/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09343
 *  Nursultan.class09355
 *  Nursultan.class10992
 *  Nursultan.class11067
 *  Nursultan.class11072
 *  Nursultan.class11080
 *  Nursultan.class11106
 *  Nursultan.class11281
 *  Nursultan.class11297
 *  Nursultan.class11312
 *  Nursultan.class11322
 *  Nursultan.class11375
 *  Nursultan.class11382
 *  Nursultan.class11393
 *  Nursultan.class11399
 *  Nursultan.class11507
 *  Nursultan.class11512
 *  Nursultan.class11524
 *  Nursultan.class11782
 *  Nursultan.class11929
 *  Nursultan.class11938
 *  Nursultan.class12029
 *  minecraft.class00500
 *  minecraft.class03448
 *  minecraft.class04453
 *  minecraft.class05946
 *  minecraft.class06202
 *  minecraft.class06584
 *  minecraft.class07209
 *  minecraft.class07314
 *  minecraft.class07482
 *  minecraft.class07510
 */
package Nursultan;

import Nursultan.class09343;
import Nursultan.class09355;
import Nursultan.class10992;
import Nursultan.class11067;
import Nursultan.class11072;
import Nursultan.class11080;
import Nursultan.class11106;
import Nursultan.class11281;
import Nursultan.class11297;
import Nursultan.class11312;
import Nursultan.class11322;
import Nursultan.class11375;
import Nursultan.class11382;
import Nursultan.class11393;
import Nursultan.class11399;
import Nursultan.class11507;
import Nursultan.class11512;
import Nursultan.class11524;
import Nursultan.class11782;
import Nursultan.class11929;
import Nursultan.class11938;
import Nursultan.class12029;
import java.util.Comparator;
import java.util.Optional;
import minecraft.class00500;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class05946;
import minecraft.class06202;
import minecraft.class06584;
import minecraft.class07209;
import minecraft.class07314;
import minecraft.class07482;
import minecraft.class07510;

@class11080(L="AutoTool", y=class11072.PLAYER, N=class11106.AUTO)
public class AutoTool
extends class11067 {
    public Object L_0;
    public Object L_1;
    public Object L_2;
    public Object L_3;
    public Object L_4;
    public Object L_5;
    public boolean L_init;

    public AutoTool() {
        this.b();
        this.L_0 = new class11312();
        this.L_4 = -1;
        this.L_5 = class11524.N((class11512)this, (String)"hotbar-only", (boolean)false);
    }

    private void b() {
        if (!this.L_init) {
            this.L_init = true;
            this.L_1 = false;
            this.L_2 = false;
            this.L_3 = 0;
            this.L_4 = 0;
        }
    }

    private void s() {
        this.b();
        this.L_4 = class11938.j().y();
        this.N(class11938.j().y() - (Integer)this.L_3 > 0, (Boolean)this.L_1, false);
    }

    @class11782
    public void N(class11393 class113932) {
        this.s();
    }

    @class11782
    public void N(class11375 class113752) {
        this.s();
    }

    @class11782
    public void N(class10992 class109922) {
        this.b();
        this.N((Boolean)this.L_1, class11938.j().y() - (Integer)this.L_3 > 10, true);
    }

    private Optional<class11297> N(class07209 class072092) {
        class00500 class005002 = ((class03448)((class06202)this.y_0).T_3).method_8320(class072092);
        return class11281.L(class065842 -> this.N((class06584)class065842, class005002) > 1.0f).max(Comparator.comparingDouble(class112972 -> class112972.N().y(class005002) ? 1.0 : 0.0).thenComparing(class112972 -> Float.valueOf(this.N(class112972.N(), class005002))));
    }

    @class11782
    public void N(class11399 class113992) {
        this.b();
        if (((Boolean)this.L_1).booleanValue()) {
            class11322.M();
        }
    }

    private void N(boolean bl, boolean bl2, boolean bl3) {
        this.b();
        if (bl && bl2 && !((Boolean)this.L_2).booleanValue()) {
            if (!((class11312)this.L_0).y()) {
                if ((class07482)((class04453)((class06202)this.y_0).T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_3 != ((class04453)((class06202)this.y_0).T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_2 || class11938.m().u()) {
                    return;
                }
                class12029 class120292 = class11938.m();
                ((class11312)this.L_0).y(class112822 -> class120292.N(0, class112822.N(), class112822.y(), class07510.field_7791));
                class120292.y();
            }
            if (bl3) {
                class11322.i();
            } else {
                class11322.y();
            }
            this.L_1 = false;
        }
    }

    @class11782
    public void N(class09343 class093432) {
        this.b();
        ((class11312)this.L_0).y(class112822 -> {});
        this.L_1 = false;
        this.L_2 = false;
    }

    private float N(class06584 class065842, class00500 class005002) {
        float f = class065842.N(class005002);
        if (f > 1.0f) {
            f += (float)class11929.N((class06584)class065842, (class05946)class07314.n);
        }
        return f;
    }

    @class11782
    public void N(class09355 class093552) {
        this.b();
        if (((Integer)this.L_4).intValue() == class11938.j().y()) {
            return;
        }
        this.L_3 = class11938.j().y();
        if (((Boolean)this.L_2).booleanValue()) {
            class093552.N();
            return;
        }
        this.N(class093552.L()).ifPresent(class112972 -> {
            this.b();
            int n = class112972.y();
            int n2 = ((class04453)((class06202)this.y_0).T_4).method_31548().N();
            if (n == n2) {
                return;
            }
            if (class11281.u((int)n)) {
                class11322.u((int)n);
            } else if (!((Boolean)((class11507)this.L_5).i()).booleanValue()) {
                class093552.N();
                this.L_2 = true;
                ((class11312)this.L_0).N(n2, n);
                class06584 class065842 = class112972.N();
                class11938.m().N(0, n, n2, class07510.field_7791).y(class062022 -> {
                    this.b();
                    this.L_2 = false;
                    if (!class06584.L((class06584)((class04453)((class06202)this.y_0).T_4).method_31548().method_5438(n2), (class06584)class065842)) {
                        ((class11312)this.L_0).N();
                    }
                }).y();
            }
            this.L_1 = true;
        });
    }

    @class11782
    public void N(class11382 class113822) {
        this.s();
    }
}

