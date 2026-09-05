/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01028
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class01894
 *  minecraft.class04650
 *  minecraft.class04680
 *  minecraft.class04995
 *  minecraft.class05936
 *  minecraft.class08394
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.ArrayList;
import java.util.List;
import minecraft.class00392;
import minecraft.class01028;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class01894;
import minecraft.class04650;
import minecraft.class04680;
import minecraft.class04995;
import minecraft.class05936;
import minecraft.class06086;
import minecraft.class06090;
import minecraft.class08394;
import org.jspecify.annotations.Nullable;

public class class06128
implements class04680 {
    private static final class01894 B = class01894.y((String)"toast/tutorial");
    public static final int N = 154;
    public static final int i = 1;
    public static final int R = 3;
    public static final int M = 4;
    private static final int Z = 7;
    private static final int z = 3;
    private static final int U = 11;
    private static final int E = 30;
    private static final int W = 126;
    private final class06090 m;
    private final List<class01028> P;
    private class04650 s = class04650.field_2210;
    private long T;
    private float b;
    private float j;
    private final boolean v;
    private final int n;

    public class06128(class01590 class015902, class06090 class060902, class00392 class003922, @Nullable class00392 class003923, boolean bl, int n) {
        this.m = class060902;
        this.P = new ArrayList<class01028>(2);
        this.P.addAll(class015902.L((class05936)class003922.L().y(-11534256), 126));
        if (class003923 != null) {
            this.P.addAll(class015902.L((class05936)class003923, 126));
        }
        this.v = bl;
        this.n = n;
    }

    public class06128(class01590 class015902, class06090 class060902, class00392 class003922, @Nullable class00392 class003923, boolean bl) {
        this(class015902, class060902, class003922, class003923, bl, 0);
    }

    public void B() {
        this.s = class04650.field_2209;
    }

    private int Z() {
        return Math.max(this.P.size(), 2) * 11;
    }

    public class04650 i() {
        return this.s;
    }

    public int u() {
        return 7 + this.Z() + 3;
    }

    public void N(float f) {
        this.j = f;
    }

    public void N(class06086 class060862, long l) {
        if (this.n > 0) {
            this.b = this.j = Math.min((float)l / (float)this.n, 1.0f);
            this.T = l;
            if (l > (long)this.n) {
                this.B();
            }
        } else if (this.v) {
            this.b = class04995.y((float)((float)(l - this.T) / 100.0f), (float)this.b, (float)this.j);
            this.T = l;
        }
    }

    public void N(class01054 class010542, class01590 class015902, long l) {
        int n;
        int n2 = this.u();
        class010542.N(class08394.Na, B, 0, 0, this.L(), n2);
        this.m.N(class010542, 6, 6);
        int n3 = this.P.size() * 11;
        int n4 = 7 + (this.Z() - n3) / 2;
        for (n = 0; n < this.P.size(); ++n) {
            class010542.N(class015902, this.P.get(n), 30, n4 + n * 11, -16777216, false);
        }
        if (this.v) {
            n = n2 - 4;
            class010542.N(3, n, 157, n + 1, -1);
            int n5 = this.j >= this.b ? -16755456 : -11206656;
            class010542.N(3, n, (int)(3.0f + 154.0f * this.b), n + 1, n5);
        }
    }
}

