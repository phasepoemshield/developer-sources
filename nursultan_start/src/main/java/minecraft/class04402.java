/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00390
 *  minecraft.class00392
 *  minecraft.class00405
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class04995
 *  minecraft.class05361
 *  minecraft.class05362
 */
package minecraft;

import minecraft.class00390;
import minecraft.class00392;
import minecraft.class00405;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class04995;
import minecraft.class05361;
import minecraft.class05362;

public class class04402
extends class05362 {
    private final class01590 N;
    private final class00392 y;
    private final class00392 L;

    public class04402(int n, int n2, int n3, int n4, class00392 class003922, class05361 class053612, class01590 class015902) {
        super(n, n2, n3, n4, class003922, class053612, field_40754);
        this.N = class015902;
        this.y = class003922;
        this.L = class00390.N((class00392)class003922, (class00405)class00405.N.L(Boolean.valueOf(true)));
    }

    public void method_75752(class01054 class010542, int n, int n2, float f) {
        class00392 class003922 = this.method_25367() ? this.L : this.y;
        class010542.y(this.N, class003922, this.method_46426(), this.method_46427(), 0xFFFFFF | class04995.u((float)(this.field_22765 * 255.0f)) << 24);
    }
}

