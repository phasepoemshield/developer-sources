/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00277
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01894
 *  minecraft.class03283
 *  minecraft.class05306
 *  minecraft.class05322
 *  minecraft.class05936
 *  minecraft.class07476
 *  minecraft.class08044
 *  minecraft.class08394
 */
package minecraft;

import java.util.List;
import minecraft.class00277;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01894;
import minecraft.class03283;
import minecraft.class04995;
import minecraft.class05055;
import minecraft.class05306;
import minecraft.class05322;
import minecraft.class05936;
import minecraft.class07476;
import minecraft.class08044;
import minecraft.class08394;

public abstract class class04972<T extends class07476>
extends class00277<T> {
    private final class01894 N;
    private final class01894 y;
    private final class01894 L;

    public class04972(T t, class08044 class080442, class00392 class003922, class00392 class003923, class01894 class018942, class01894 class018943, class01894 class018944, List<class05322> list) {
        super(t, (class05306)new class05055((class07476)t, class003923, list), class080442, class003922);
        this.N = class018942;
        this.y = class018943;
        this.L = class018944;
    }

    protected void N(class01054 class010542, float f, int n, int n2) {
        int n3;
        int n4;
        int n5 = this.T;
        int n6 = this.b;
        class010542.N(class08394.Na, this.N, n5, n6, 0.0f, 0.0f, this.B, this.Z, 256, 256);
        if (((class07476)this.m).s()) {
            n4 = 14;
            n3 = class04995.u(((class07476)this.m).m() * 13.0f) + 1;
            class010542.N(class08394.Na, this.y, 14, 14, 0, 14 - n3, n5 + 56, n6 + 36 + 14 - n3, 14, n3);
        }
        n4 = 24;
        n3 = class04995.u(((class07476)this.m).W() * 24.0f);
        class010542.N(class08394.Na, this.L, 24, 16, 0, 0, n5 + 79, n6 + 34, n3, 16);
    }

    protected class03283 N() {
        return new class03283(this.T + 20, this.field_22790 / 2 - 49);
    }

    public void method_25426() {
        super.method_25426();
        this.z = (this.B - this.field_22793.N((class05936)this.field_22785)) / 2;
    }
}

