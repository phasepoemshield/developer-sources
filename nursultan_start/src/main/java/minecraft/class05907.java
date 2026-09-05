/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01463
 *  minecraft.class01894
 *  minecraft.class04995
 *  minecraft.class07482
 *  minecraft.class07489
 *  minecraft.class08044
 *  minecraft.class08394
 */
package minecraft;

import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01463;
import minecraft.class01894;
import minecraft.class04995;
import minecraft.class05936;
import minecraft.class07482;
import minecraft.class07489;
import minecraft.class08044;
import minecraft.class08394;

public class class05907
extends class01463<class07489> {
    private static final class01894 N = class01894.y((String)"container/brewing_stand/fuel_length");
    private static final class01894 y = class01894.y((String)"container/brewing_stand/brew_progress");
    private static final class01894 L = class01894.y((String)"container/brewing_stand/bubbles");
    private static final class01894 u = class01894.y((String)"textures/gui/container/brewing_stand.png");
    private static final int[] n = new int[]{29, 24, 20, 16, 11, 6, 0};

    public class05907(class07489 class074892, class08044 class080442, class00392 class003922) {
        super((class07482)class074892, class080442, class003922);
    }

    protected void N(class01054 class010542, float f, int n, int n2) {
        int n3;
        int n4 = (this.field_22789 - this.B) / 2;
        int n5 = (this.field_22790 - this.Z) / 2;
        class010542.N(class08394.Na, u, n4, n5, 0.0f, 0.0f, this.B, this.Z, 256, 256);
        int n6 = ((class07489)this.m).E();
        int n7 = class04995.N((int)((18 * n6 + 20 - 1) / 20), (int)0, (int)18);
        if (n7 > 0) {
            class010542.N(class08394.Na, N, 18, 4, 0, 0, n4 + 60, n5 + 44, n7, 4);
        }
        if ((n3 = ((class07489)this.m).W()) > 0) {
            int n8 = (int)(28.0f * (1.0f - (float)n3 / 400.0f));
            if (n8 > 0) {
                class010542.N(class08394.Na, y, 9, 28, 0, 0, n4 + 97, n5 + 16, 9, n8);
            }
            if ((n8 = class05907.n[n3 / 2 % 7]) > 0) {
                class010542.N(class08394.Na, L, 12, 29, 0, 29 - n8, n4 + 63, n5 + 14 + 29 - n8, 12, n8);
            }
        }
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

