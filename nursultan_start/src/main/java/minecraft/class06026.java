/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11284
 *  Nursultan.class11305
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01463
 *  minecraft.class01894
 *  minecraft.class04654
 *  minecraft.class07482
 *  minecraft.class07490
 *  minecraft.class08044
 *  minecraft.class08394
 */
package minecraft;

import Nursultan.class11284;
import Nursultan.class11305;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01463;
import minecraft.class01894;
import minecraft.class04654;
import minecraft.class07482;
import minecraft.class07490;
import minecraft.class08044;
import minecraft.class08394;

public class class06026
extends class01463<class07490> {
    private static final class01894 N = class01894.y((String)"textures/gui/container/generic_54.png");
    private final int y;
    private class11284 L;
    private class11284 u;
    private class11284 n;

    public class06026(class07490 class074902, class08044 class080442, class00392 class003922) {
        super((class07482)class074902, class080442, class003922);
        int n = 222;
        int n2 = 114;
        this.y = class074902.W();
        this.Z = 114 + this.y * 18;
        this.W = this.Z - 94;
    }

    protected void u() {
        super.u();
        this.N();
    }

    private void N() {
        this.L.field_22763 = !class11305.N((class07490)((class07490)this.m));
        this.u.field_22763 = this.L.field_22763;
        this.n.field_22763 = !class11305.y((class07490)((class07490)this.m));
        this.L.N();
        this.u.N();
        this.n.N();
    }

    protected void N(class01054 class010542, float f, int n, int n2) {
        int n3 = (this.field_22789 - this.B) / 2;
        int n4 = (this.field_22790 - this.Z) / 2;
        class010542.N(class08394.Na, N, n3, n4, 0.0f, 0.0f, this.B, this.y * 18 + 17, 256, 256);
        class010542.N(class08394.Na, N, n3, n4 + this.y * 18 + 17, 0.0f, 126.0f, this.B, 96, 256, 256);
    }

    public void method_25426() {
        super.method_25426();
        this.L = class11305.L((class07490)((class07490)this.m), (int)this.field_22789, (int)this.field_22790, (int)this.B, (int)this.Z);
        this.method_37063((class04654)this.L);
        this.u = class11305.N((class07490)((class07490)this.m), (int)this.field_22789, (int)this.field_22790, (int)this.B, (int)this.Z);
        this.method_37063((class04654)this.u);
        this.n = class11305.y((class07490)((class07490)this.m), (int)this.field_22789, (int)this.field_22790, (int)this.B, (int)this.Z);
        this.method_37063((class04654)this.n);
        this.N();
    }

    public void method_25394(class01054 class010542, int n, int n2, float f) {
        super.method_25394(class010542, n, n2, f);
        this.a_(class010542, n, n2);
    }
}

