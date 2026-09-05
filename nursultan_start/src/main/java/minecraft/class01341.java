/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11031
 *  Nursultan.class11284
 *  Nursultan.class11305
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01463
 *  minecraft.class01894
 *  minecraft.class04654
 *  minecraft.class06922
 *  minecraft.class07482
 *  minecraft.class08044
 *  minecraft.class08394
 */
package minecraft;

import Nursultan.class11031;
import Nursultan.class11284;
import Nursultan.class11305;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01463;
import minecraft.class01894;
import minecraft.class04654;
import minecraft.class06922;
import minecraft.class07482;
import minecraft.class08044;
import minecraft.class08394;

public class class01341
extends class01463<class06922> {
    private static final class01894 N = class01894.y((String)"textures/gui/container/shulker_box.png");
    private class11284 y;
    private class11284 L;
    private class11284 u;

    public class01341(class06922 class069222, class08044 class080442, class00392 class003922) {
        super((class07482)class069222, class080442, class003922);
        ++this.Z;
    }

    protected void u() {
        super.u();
        this.N();
    }

    private void N() {
        this.y.field_22763 = !class11305.y((class06922)((class06922)this.m));
        this.L.field_22763 = this.y.field_22763;
        this.u.field_22763 = !class11305.N((class06922)((class06922)this.m));
        this.y.N();
        this.L.N();
        this.u.N();
    }

    protected void N(class01054 class010542, float f, int n, int n2) {
        int n3 = (this.field_22789 - this.B) / 2;
        int n4 = (this.field_22790 - this.Z) / 2;
        class010542.N(class08394.Na, N, n3, n4, 0.0f, 0.0f, this.B, this.Z, 256, 256);
    }

    public void method_25426() {
        super.method_25426();
        this.y = class11305.y((class06922)((class06922)this.m), (int)this.field_22789, (int)this.field_22790, (int)this.B, (int)this.Z);
        this.L = class11305.L((class06922)((class06922)this.m), (int)this.field_22789, (int)this.field_22790, (int)this.B, (int)this.Z);
        this.u = class11305.N((class06922)((class06922)this.m), (int)this.field_22789, (int)this.field_22790, (int)this.B, (int)this.Z);
        if (this instanceof class11031) {
            return;
        }
        this.method_37063((class04654)this.y);
        this.method_37063((class04654)this.L);
        this.method_37063((class04654)this.u);
        this.N();
    }

    public void method_25394(class01054 class010542, int n, int n2, float f) {
        super.method_25394(class010542, n, n2, f);
        this.a_(class010542, n, n2);
    }
}

