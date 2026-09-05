/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  minecraft.class00392
 *  minecraft.class00405
 *  minecraft.class01054
 *  minecraft.class03597
 *  minecraft.class04654
 *  minecraft.class04693
 *  minecraft.class04981
 *  minecraft.class05096
 *  minecraft.class05097
 *  minecraft.class05111
 *  minecraft.class05129
 *  minecraft.class05220
 *  minecraft.class05362
 *  minecraft.class05407
 *  minecraft.class05936
 *  minecraft.class06197
 *  minecraft.class06601
 *  minecraft.class06613
 *  minecraft.class07536
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.logging.LogUtils;
import java.util.Objects;
import minecraft.class00392;
import minecraft.class00405;
import minecraft.class01054;
import minecraft.class03597;
import minecraft.class04654;
import minecraft.class04693;
import minecraft.class04708;
import minecraft.class04981;
import minecraft.class05096;
import minecraft.class05097;
import minecraft.class05111;
import minecraft.class05129;
import minecraft.class05220;
import minecraft.class05362;
import minecraft.class05407;
import minecraft.class05936;
import minecraft.class06197;
import minecraft.class06601;
import minecraft.class06613;
import minecraft.class07536;
import org.slf4j.Logger;

public class class04731
extends class05407 {
    private static final Logger N = LogUtils.getLogger();
    private static final class00392 y = class00392.L((String)"mco.terms.title");
    private static final class00392 L = class00392.L((String)"mco.terms.sentence.1");
    private static final class00392 u = class05220.N().y((class00392)class00392.L((String)"mco.terms.sentence.2").L(class00405.N.L(Boolean.valueOf(true))));
    private final class05096 i;
    private final class04981 R;
    private boolean M;

    public class04731(class05096 class050962, class04981 class049812) {
        super(y);
        this.i = class050962;
        this.R = class049812;
    }

    private void N() {
        class05111 class051112 = class05111.N();
        try {
            class051112.E();
            this.field_22787.N((class05096)new class04708(this.i, new class05129[]{new class04693(this.i, this.R)}));
        }
        catch (class05097 class050972) {
            N.error("Couldn't agree to TOS", (Throwable)class050972);
        }
    }

    public void method_25426() {
        int n = this.field_22789 / 4 - 2;
        this.method_37063((class04654)class05362.method_46430((class00392)class00392.L((String)"mco.terms.buttons.agree"), class053622 -> this.N()).N(this.field_22789 / 4, class04731.N((int)12), n, 20).N());
        this.method_37063((class04654)class05362.method_46430((class00392)class00392.L((String)"mco.terms.buttons.disagree"), class053622 -> this.field_22787.N(this.i)).N(this.field_22789 / 2 + 4, class04731.N((int)12), n, 20).N());
    }

    public boolean method_25404(class06601 class066012) {
        if (class066012.v() == 256) {
            this.field_22787.N(this.i);
            return true;
        }
        return super.method_25404(class066012);
    }

    public void method_25394(class01054 class010542, int n, int n2, float f) {
        super.method_25394(class010542, n, n2, f);
        class010542.N(this.field_22793, this.field_22785, this.field_22789 / 2, 17, -1);
        class010542.y(this.field_22793, L, this.field_22789 / 2 - 120, class04731.N((int)5), -1);
        int n3 = this.field_22793.N((class05936)L);
        int n4 = this.field_22789 / 2 - 121 + n3;
        int n5 = class04731.N((int)5);
        int n6 = n4 + this.field_22793.N((class05936)u) + 1;
        Objects.requireNonNull(this.field_22793);
        int n7 = n5 + 1 + 9;
        this.M = n4 <= n && n <= n6 && n5 <= n2 && n2 <= n7;
        class010542.y(this.field_22793, u, this.field_22789 / 2 - 120 + n3, class04731.N((int)5), this.M ? -9670204 : -13408581);
    }

    public boolean method_25402(class06613 class066132, boolean bl) {
        if (this.M) {
            ((class06197)this.field_22787.L_3).N(class03597.j.toString());
            class07536.m().N(class03597.j);
            return true;
        }
        return super.method_25402(class066132, bl);
    }

    public class00392 method_25435() {
        return class05220.N((class00392[])new class00392[]{super.method_25435(), L}).y(class05220.l).y(u);
    }
}

