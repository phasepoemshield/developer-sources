/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01463
 *  minecraft.class01712
 *  minecraft.class01726
 *  minecraft.class01894
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class05936
 *  minecraft.class06584
 *  minecraft.class06608
 *  minecraft.class06937
 *  minecraft.class07482
 *  minecraft.class07510
 *  minecraft.class08036
 *  minecraft.class08044
 *  minecraft.class08394
 */
package minecraft;

import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01463;
import minecraft.class01712;
import minecraft.class01726;
import minecraft.class01894;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class05936;
import minecraft.class06584;
import minecraft.class06608;
import minecraft.class06937;
import minecraft.class07482;
import minecraft.class07510;
import minecraft.class08036;
import minecraft.class08044;
import minecraft.class08394;

public class class03133
extends class01463<class01712> {
    private static final class01894 N = class01894.y((String)"container/crafter/disabled_slot");
    private static final class01894 y = class01894.y((String)"container/crafter/powered_redstone");
    private static final class01894 L = class01894.y((String)"container/crafter/unpowered_redstone");
    private static final class01894 u = class01894.y((String)"textures/gui/container/crafter.png");
    private static final class00392 n = class00392.L((String)"gui.togglable_slot");
    private final class08036 t;

    public class03133(class01712 class017122, class08044 class080442, class00392 class003922) {
        super((class07482)class017122, class080442, class003922);
        this.t = class080442.z;
    }

    private void y(int n) {
        this.N(n, false);
    }

    private void y(class01054 class010542) {
        int n = this.field_22789 / 2 + 9;
        int n2 = this.field_22790 / 2 - 48;
        class01894 class018942 = ((class01712)this.m).E() ? y : L;
        class010542.N(class08394.Na, class018942, n, n2, 16, 16);
    }

    private void N(class01054 class010542, class01726 class017262) {
        class010542.N(class08394.Na, N, class017262.i - 1, class017262.R - 1, 18, 18);
    }

    public void N(class01054 class010542, class06937 class069372, int n, int n2) {
        if (class069372 instanceof class01726) {
            class01726 class017262 = (class01726)class069372;
            if (((class01712)this.m).N(class069372.u)) {
                this.N(class010542, class017262);
            } else {
                super.N(class010542, class069372, n, n2);
            }
            int n3 = this.T + class017262.i - 2;
            int n4 = this.b + class017262.R - 2;
            if (n > n3 && n2 > n4 && n < n3 + 19 && n2 < n4 + 19) {
                class010542.N(class06608.u);
            }
        } else {
            super.N(class010542, class069372, n, n2);
        }
    }

    protected void N(class01054 class010542, float f, int n, int n2) {
        int n3 = (this.field_22789 - this.B) / 2;
        int n4 = (this.field_22790 - this.Z) / 2;
        class010542.N(class08394.Na, u, n3, n4, 0.0f, 0.0f, this.B, this.Z, 256, 256);
    }

    private void N(int n) {
        this.N(n, true);
    }

    protected void N(class06937 class069372, int n, int n2, class07510 class075102) {
        if (class069372 instanceof class01726 && !class069372.R() && !this.t.method_7325()) {
            switch (class075102) {
                case field_7790: {
                    if (((class01712)this.m).N(n)) {
                        this.N(n);
                        break;
                    }
                    if (!((class01712)this.m).M().R()) break;
                    this.y(n);
                    break;
                }
                case field_7791: {
                    class06584 class065842 = this.t.method_31548().method_5438(n2);
                    if (!((class01712)this.m).N(n) || class065842.R()) break;
                    this.N(n);
                }
            }
        }
        super.N(class069372, n, n2, class075102);
    }

    private void N(int n, boolean bl) {
        ((class01712)this.m).N(n, bl);
        super.N(n, ((class01712)this.m).b, bl);
        float f = bl ? 1.0f : 0.75f;
        this.t.method_5783((class04891)class04909.OK.N(), 0.4f, f);
    }

    public void method_25426() {
        super.method_25426();
        this.z = (this.B - this.field_22793.N((class05936)this.field_22785)) / 2;
    }

    public void method_25394(class01054 class010542, int n, int n2, float f) {
        super.method_25394(class010542, n, n2, f);
        this.y(class010542);
        this.a_(class010542, n, n2);
        if (this.s instanceof class01726 && !((class01712)this.m).N(this.s.u) && ((class01712)this.m).M().R() && !this.s.R() && !this.t.method_7325()) {
            class010542.N(this.field_22793, class03133.n, n, n2);
        }
    }
}

