/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10401
 *  Nursultan.class10996
 *  Nursultan.class11067
 *  Nursultan.class11072
 *  Nursultan.class11080
 *  Nursultan.class11106
 *  Nursultan.class11113
 *  Nursultan.class11131
 *  Nursultan.class11147
 *  Nursultan.class11223
 *  Nursultan.class11507
 *  Nursultan.class11512
 *  Nursultan.class11523
 *  Nursultan.class11524
 *  Nursultan.class11535
 *  Nursultan.class11782
 *  Nursultan.class11791
 *  Nursultan.class11907
 *  minecraft.class03448
 *  minecraft.class04477
 *  minecraft.class06145
 *  minecraft.class06202
 *  minecraft.class07050
 *  minecraft.class07089
 */
package Nursultan;

import Nursultan.class10401;
import Nursultan.class10996;
import Nursultan.class11067;
import Nursultan.class11072;
import Nursultan.class11080;
import Nursultan.class11106;
import Nursultan.class11113;
import Nursultan.class11131;
import Nursultan.class11147;
import Nursultan.class11223;
import Nursultan.class11507;
import Nursultan.class11512;
import Nursultan.class11523;
import Nursultan.class11524;
import Nursultan.class11535;
import Nursultan.class11782;
import Nursultan.class11791;
import Nursultan.class11907;
import java.util.List;
import minecraft.class03448;
import minecraft.class04477;
import minecraft.class06145;
import minecraft.class06202;
import minecraft.class07050;
import minecraft.class07089;

@class11080(L="ItemRelease", y=class11072.COMBAT, N=class11106.BASE)
public class ItemRelease
extends class11067 {
    public Object L_0;
    public Object L_1;

    private void T() {
    }

    public ItemRelease() {
        this.T();
        this.L_0 = class11524.y((class11512)this, (String)"items", (class11535[])new class11131[]{new class11147(this, "trident", true), new class11113(this, "crossbow", true)});
        this.L_1 = class11524.N((class11512)this, (String)"hit-only", (boolean)false);
    }

    private void b() {
        for (class04477 class044772 : ((class03448)((class06202)this.y_0).T_3).method_18456()) {
            if (!(class044772 instanceof class10401)) continue;
            class11907.N((class10401)((class10401)class044772));
        }
    }

    private void s() {
        for (class04477 class044772 : ((class03448)((class06202)this.y_0).T_3).method_18456()) {
            if (!(class044772 instanceof class10401)) continue;
            class11907.y((class10401)((class10401)class044772));
        }
    }

    @class11782
    public void N(class10996 class109962) {
        this.T();
        for (class11131 class111312 : (List)((class11523)this.L_0).i()) {
            for (class07050 class070502 : class07050.values()) {
                if (!class111312.test((Object)((class06202)this.y_0), (Object)class070502) || !this.N(class111312, class070502)) continue;
                class111312.y((class06202)this.y_0, class070502);
            }
        }
    }

    private boolean N(class11131 class111312, class07050 class070502) {
        this.T();
        if (!((Boolean)((class11507)this.L_1).i()).booleanValue()) {
            return true;
        }
        this.b();
        boolean bl = class111312.N((class06202)this.y_0, class070502, this::N);
        this.s();
        return bl;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean N(class11223 class112232) {
        class07089 class070892 = class112232.y();
        if (!(class070892 instanceof class06145)) return false;
        class06145 class061452 = (class06145)class070892;
        if (class11791.u().test(class061452.L())) return false;
        return true;
    }
}

