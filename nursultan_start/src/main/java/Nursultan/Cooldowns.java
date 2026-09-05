/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10621
 *  Nursultan.class10946
 *  Nursultan.class11067
 *  Nursultan.class11072
 *  Nursultan.class11080
 *  Nursultan.class11106
 *  Nursultan.class11507
 *  Nursultan.class11512
 *  Nursultan.class11524
 *  Nursultan.class11782
 *  Nursultan.class11938
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class01894
 *  minecraft.class04453
 *  minecraft.class04995
 *  minecraft.class06202
 *  minecraft.class06556
 *  minecraft.class06584
 */
package Nursultan;

import Nursultan.class10621;
import Nursultan.class10946;
import Nursultan.class11067;
import Nursultan.class11072;
import Nursultan.class11080;
import Nursultan.class11106;
import Nursultan.class11507;
import Nursultan.class11512;
import Nursultan.class11524;
import Nursultan.class11782;
import Nursultan.class11938;
import java.util.Objects;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class01894;
import minecraft.class04453;
import minecraft.class04995;
import minecraft.class06202;
import minecraft.class06556;
import minecraft.class06584;

@class11080(L="Cooldowns", y=class11072.VISUAL, N=class11106.INTERFACE)
public class Cooldowns
extends class11067 {
    public Object L_0;
    public Object L_1;

    private void P() {
    }

    public Cooldowns() {
        this.P();
        this.L_0 = class11524.N((class11512)this, (String)"render-on-items", (boolean)true);
        this.L_1 = class11524.N((class11512)this, (String)"inventory-only", (boolean)false);
    }

    public boolean Z() {
        class11938.i().N();
        return super.Z();
    }

    public boolean i() {
        class11938.i().N();
        return super.i();
    }

    public boolean m() {
        this.P();
        return (Boolean)((class11507)this.L_1).i();
    }

    @class11782
    public void N(class10946 class109462) {
        this.P();
        if (!((Boolean)((class11507)this.L_0).i()).booleanValue()) {
            return;
        }
        class04453 class044532 = (class04453)((class06202)this.y_0).T_4;
        if (class044532 == null) {
            return;
        }
        class06584 class065842 = class109462.u();
        class06556 class065562 = class044532.method_7357();
        class01894 class018942 = class065562.y(class065842);
        if (class018942 == null) {
            return;
        }
        class10621 class106212 = (class10621)class065562.N.get(class018942);
        if (class106212 == null) {
            return;
        }
        float f = ((class06202)this.y_0).NK().N(true);
        float f2 = (float)class106212.y() - ((float)class065562.y + f);
        if (f2 <= 0.0f) {
            return;
        }
        float f3 = f2 / 20.0f;
        String string = f3 > 99.0f ? "99+" : String.valueOf(Math.round(f3));
        float f4 = class065562.N(class065842, f);
        int n = class04995.M((float)((1.0f - f4) * 100.0f / 100.0f * 0.33333334f), (float)1.0f, (float)1.0f) | 0xFF000000;
        class01054 class010542 = class109462.N();
        int n2 = class109462.L();
        int n3 = class109462.y() + 8;
        Objects.requireNonNull((class01590)((class06202)this.y_0).i_3);
        int n4 = n3 - 4 - 3;
        class010542.y((class01590)((class06202)this.y_0).i_3, string, n2, n4, n);
    }
}

