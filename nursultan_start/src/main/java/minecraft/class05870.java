/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01463
 *  minecraft.class01894
 *  minecraft.class02265
 *  minecraft.class02484
 *  minecraft.class03448
 *  minecraft.class06231
 *  minecraft.class06548
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class07299
 *  minecraft.class07482
 *  minecraft.class07769
 *  minecraft.class08044
 *  minecraft.class08270
 *  minecraft.class08394
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01463;
import minecraft.class01894;
import minecraft.class02265;
import minecraft.class02484;
import minecraft.class03448;
import minecraft.class06231;
import minecraft.class06548;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class07299;
import minecraft.class07482;
import minecraft.class07769;
import minecraft.class08044;
import minecraft.class08270;
import minecraft.class08394;
import org.jspecify.annotations.Nullable;

public class class05870
extends class01463<class06231> {
    private static final class01894 N = class01894.y((String)"container/cartography_table/error");
    private static final class01894 y = class01894.y((String)"container/cartography_table/scaled_map");
    private static final class01894 L = class01894.y((String)"container/cartography_table/duplicated_map");
    private static final class01894 u = class01894.y((String)"container/cartography_table/map");
    private static final class01894 n = class01894.y((String)"container/cartography_table/locked");
    private static final class01894 t = class01894.y((String)"textures/gui/container/cartography_table.png");
    private final class08270 G = new class08270();

    public class05870(class06231 class062312, class08044 class080442, class00392 class003922) {
        super((class07482)class062312, class080442, class003922);
        this.U -= 2;
    }

    private void N(class01054 class010542, @Nullable class02265 class022652, @Nullable class07769 class077692, boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        int n = this.T;
        int n2 = this.b;
        if (bl2 && !bl4) {
            class010542.N(class08394.Na, y, n + 67, n2 + 13, 66, 66);
            this.N(class010542, class022652, class077692, n + 85, n2 + 31, 0.226f);
        } else if (bl) {
            class010542.N(class08394.Na, L, n + 67 + 16, n2 + 13, 50, 66);
            this.N(class010542, class022652, class077692, n + 86, n2 + 16, 0.34f);
            class010542.L();
            class010542.N(class08394.Na, L, n + 67, n2 + 13 + 16, 50, 66);
            this.N(class010542, class022652, class077692, n + 70, n2 + 32, 0.34f);
        } else if (bl3) {
            class010542.N(class08394.Na, u, n + 67, n2 + 13, 66, 66);
            this.N(class010542, class022652, class077692, n + 71, n2 + 17, 0.45f);
            class010542.N(class08394.Na, class05870.n, n + 118, n2 + 60, 10, 14);
        } else {
            class010542.N(class08394.Na, u, n + 67, n2 + 13, 66, 66);
            this.N(class010542, class022652, class077692, n + 71, n2 + 17, 0.45f);
        }
    }

    private void N(class01054 class010542, @Nullable class02265 class022652, @Nullable class07769 class077692, int n, int n2, float f) {
        if (class022652 != null && class077692 != null) {
            class010542.i().pushMatrix();
            class010542.i().translate((float)n, (float)n2);
            class010542.i().scale(f, f);
            this.field_22787.yR().N(class022652, class077692, this.G);
            class010542.N(this.G);
            class010542.i().popMatrix();
        }
    }

    protected void N(class01054 class010542, float f, int n, int n2) {
        class07769 class077692;
        int n3 = this.T;
        int n4 = this.b;
        class010542.N(class08394.Na, t, n3, n4, 0.0f, 0.0f, this.B, this.Z, 256, 256);
        class06584 class065842 = ((class06231)this.m).L(1).i();
        boolean bl = class065842.N(class06570.Gt);
        boolean bl2 = class065842.N(class06570.jk);
        boolean bl3 = class065842.N(class06570.Mg);
        class02265 class022652 = (class02265)((class06231)this.m).L(0).i().method_58694(class02484.f);
        boolean bl4 = false;
        if (class022652 != null) {
            class077692 = class06548.N((class02265)class022652, (class07299)((class03448)this.field_22787.T_3));
            if (class077692 != null) {
                if (class077692.Z) {
                    bl4 = true;
                    if (bl2 || bl3) {
                        class010542.N(class08394.Na, N, n3 + 35, n4 + 31, 28, 21);
                    }
                }
                if (bl2 && class077692.M >= 4) {
                    bl4 = true;
                    class010542.N(class08394.Na, N, n3 + 35, n4 + 31, 28, 21);
                }
            }
        } else {
            class077692 = null;
        }
        this.N(class010542, class022652, class077692, bl, bl2, bl3, bl4);
    }

    public void method_25394(class01054 class010542, int n, int n2, float f) {
        super.method_25394(class010542, n, n2, f);
        this.a_(class010542, n, n2);
    }
}

