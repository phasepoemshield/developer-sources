/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01463
 *  minecraft.class01894
 *  minecraft.class07478
 *  minecraft.class07482
 *  minecraft.class08044
 *  minecraft.class08394
 */
package minecraft;

import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01463;
import minecraft.class01894;
import minecraft.class07478;
import minecraft.class07482;
import minecraft.class08044;
import minecraft.class08394;

public class class04963
extends class01463<class07478> {
    private static final class01894 N = class01894.y((String)"textures/gui/container/hopper.png");

    public class04963(class07478 class074782, class08044 class080442, class00392 class003922) {
        super((class07482)class074782, class080442, class003922);
        this.Z = 133;
        this.W = this.Z - 94;
    }

    protected void N(class01054 class010542, float f, int n, int n2) {
        int n3 = (this.field_22789 - this.B) / 2;
        int n4 = (this.field_22790 - this.Z) / 2;
        class010542.N(class08394.Na, N, n3, n4, 0.0f, 0.0f, this.B, this.Z, 256, 256);
    }

    public void method_25394(class01054 class010542, int n, int n2, float f) {
        super.method_25394(class010542, n, n2, f);
        this.a_(class010542, n, n2);
    }
}

