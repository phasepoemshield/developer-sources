/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class00642
 *  minecraft.class02071
 *  minecraft.class02077
 *  minecraft.class02102
 *  minecraft.class03255
 *  minecraft.class04654
 *  minecraft.class05096
 *  minecraft.class05220
 *  minecraft.class05362
 *  minecraft.class05763
 *  minecraft.class06478
 */
package minecraft;

import minecraft.class00392;
import minecraft.class00642;
import minecraft.class01885;
import minecraft.class02071;
import minecraft.class02077;
import minecraft.class02102;
import minecraft.class03255;
import minecraft.class04654;
import minecraft.class05096;
import minecraft.class05220;
import minecraft.class05362;
import minecraft.class05763;
import minecraft.class06478;

public class class01871
extends class05096 {
    private static final int N = 600;
    private final class00642 y;
    private class05362 L;
    private int u;
    private final class01885 i = class01885.u();

    public class01871(class00392 class003922, class00642 class006422) {
        super(class003922);
        this.y = class006422;
    }

    public void method_25426() {
        this.i.L().y().N(10);
        this.i.N(new class02071(this.field_22785, this.field_22793));
        this.L = this.i.N(class05362.method_46430((class00392)class05220.T, class053622 -> this.y.method_10747(class05763.y)).N());
        this.L.field_22763 = false;
        this.i.N();
        this.i.method_48206(class046542 -> {
            class06478 cfr_ignored_0 = (class06478)this.method_37063((class04654)class046542);
        });
        this.method_48640();
    }

    public boolean method_25422() {
        return false;
    }

    public void method_48640() {
        class02077.N((class02102)this.i, (class03255)this.method_48202());
    }

    public void method_25393() {
        super.method_25393();
        ++this.u;
        if (this.u == 600) {
            this.L.field_22763 = true;
        }
        if (this.y.method_10758()) {
            this.y.method_10754();
        } else {
            this.y.method_10768();
        }
    }
}

