/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01885
 *  minecraft.class01894
 *  minecraft.class02071
 *  minecraft.class02072
 *  minecraft.class02077
 *  minecraft.class02102
 *  minecraft.class03255
 *  minecraft.class03608
 *  minecraft.class04654
 *  minecraft.class04708
 *  minecraft.class05096
 *  minecraft.class05129
 *  minecraft.class06478
 */
package minecraft;

import minecraft.class00073;
import minecraft.class00093;
import minecraft.class00392;
import minecraft.class01885;
import minecraft.class01894;
import minecraft.class02071;
import minecraft.class02072;
import minecraft.class02077;
import minecraft.class02102;
import minecraft.class03255;
import minecraft.class03608;
import minecraft.class04654;
import minecraft.class04708;
import minecraft.class05096;
import minecraft.class05129;
import minecraft.class06478;

public class class00109
extends class04708 {
    private final class05129 y;
    private final class00093 L;
    private final class01885 u = class01885.u();

    public class00109(class05096 class050962, class00093 class000932, class05129 class051292) {
        super(class050962, new class05129[]{class051292});
        this.y = class051292;
        this.L = class000932;
    }

    protected void N() {
        this.y.i();
        super.N();
    }

    public void method_25426() {
        super.method_25426();
        if (this.L.u() == null || this.L.u().N() == null) {
            return;
        }
        class01885 class018852 = class01885.i().N(10);
        class02071 class020712 = new class02071((class00392)class00392.N((String)"mco.connect.region", (Object[])new Object[]{class00392.L((String)this.L.u().N().field_60201)}), this.field_22793);
        class018852.N((class02102)class020712);
        class01894 class018942 = this.L.u().y() != null ? this.L.u().y().y() : class00073.field_60237.y();
        class018852.N((class02102)class03608.N((int)10, (int)8, (class01894)class018942), class02072::u);
        this.u.N((class02102)class018852, (T class020722) -> class020722.L(40));
        this.u.method_48206(class046542 -> {
            class06478 cfr_ignored_0 = (class06478)this.method_37063((class04654)class046542);
        });
        this.method_48640();
    }

    public void method_48640() {
        super.method_48640();
        int n = this.N.method_46427() + this.N.method_25364();
        class03255 class032552 = new class03255(0, n, this.field_22789, this.field_22790 - n);
        this.u.N();
        class02077.N((class02102)this.u, (class03255)class032552, (float)0.5f, (float)0.0f);
    }

    public void method_25393() {
        super.method_25393();
        this.y.L();
    }
}

