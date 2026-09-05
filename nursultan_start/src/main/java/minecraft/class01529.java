/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01463
 *  minecraft.class01894
 *  minecraft.class05936
 *  minecraft.class07482
 *  minecraft.class07502
 *  minecraft.class08044
 *  minecraft.class08394
 */
package minecraft;

import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01463;
import minecraft.class01894;
import minecraft.class05936;
import minecraft.class07482;
import minecraft.class07502;
import minecraft.class08044;
import minecraft.class08394;

public class class01529
extends class01463<class07502> {
    private static final class01894 N = class01894.y((String)"textures/gui/container/dispenser.png");

    public class01529(class07502 class075022, class08044 class080442, class00392 class003922) {
        super((class07482)class075022, class080442, class003922);
    }

    protected void N(class01054 class010542, float f, int n, int n2) {
        int n3 = (this.field_22789 - this.B) / 2;
        int n4 = (this.field_22790 - this.Z) / 2;
        class010542.N(class08394.Na, N, n3, n4, 0.0f, 0.0f, this.B, this.Z, 256, 256);
    }

    public void method_25426() {
        super.method_25426();
        this.z = (this.B - this.field_22793.N((class05936)this.field_22785)) / 2;
    }

    public void method_25394(class01054 class010542, int n, int n2, float f) {
        super.method_25394(class010542, n, n2, f);
        this.a_(class010542, n, n2);
    }
}

