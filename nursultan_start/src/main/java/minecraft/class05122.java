/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.booleans.BooleanConsumer
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class04654
 *  minecraft.class05220
 *  minecraft.class05362
 *  minecraft.class05407
 */
package minecraft;

import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class04654;
import minecraft.class05153;
import minecraft.class05220;
import minecraft.class05362;
import minecraft.class05407;

public class class05122
extends class05407 {
    protected BooleanConsumer N;
    private final class00392 y;
    private final class00392 L;

    public class05122(BooleanConsumer booleanConsumer, class00392 class003922, class00392 class003923) {
        super(class05153.N);
        this.N = booleanConsumer;
        this.y = class003922;
        this.L = class003923;
    }

    public void method_25426() {
        this.method_37063((class04654)class05362.method_46430((class00392)class05220.R, class053622 -> this.N.accept(true)).N(this.field_22789 / 2 - 105, class05122.N((int)9), 100, 20).N());
        this.method_37063((class04654)class05362.method_46430((class00392)class05220.M, class053622 -> this.N.accept(false)).N(this.field_22789 / 2 + 5, class05122.N((int)9), 100, 20).N());
    }

    public void method_25394(class01054 class010542, int n, int n2, float f) {
        super.method_25394(class010542, n, n2, f);
        class010542.N(this.field_22793, this.y, this.field_22789 / 2, class05122.N((int)3), -1);
        class010542.N(this.field_22793, this.L, this.field_22789 / 2, class05122.N((int)5), -1);
    }
}

