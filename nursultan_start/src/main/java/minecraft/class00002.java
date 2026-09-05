/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00124
 *  minecraft.class01894
 *  minecraft.class03069
 *  minecraft.class03621
 *  minecraft.class06069
 *  minecraft.class09038
 */
package minecraft;

import minecraft.class00022;
import minecraft.class00124;
import minecraft.class01894;
import minecraft.class03069;
import minecraft.class03621;
import minecraft.class06069;
import minecraft.class09038;

public class class00002
implements class00124<class00002> {
    public static final class03069 N = new class03069("sounds", ".ogg");
    private final class01894 y;
    private final class03621 L;
    private final class03621 u;
    private final int i;
    private final class00022 R;
    private final boolean M;
    private final boolean B;
    private final int Z;

    public class03621 L() {
        return this.L;
    }

    public boolean M() {
        return this.M;
    }

    public class00002(class01894 class018942, class03621 class036212, class03621 class036213, int n, class00022 class000222, boolean bl, boolean bl2, int n2) {
        this.y = class018942;
        this.L = class036212;
        this.u = class036213;
        this.i = n;
        this.R = class000222;
        this.M = bl;
        this.B = bl2;
        this.Z = n2;
    }

    public String toString() {
        return "Sound[" + String.valueOf(this.y) + "]";
    }

    public boolean B() {
        return this.B;
    }

    public int Z() {
        return this.Z;
    }

    public int i() {
        return this.i;
    }

    public class03621 u() {
        return this.u;
    }

    public class01894 y() {
        return N.N(this.y);
    }

    public void N(class09038 class090382) {
        if (this.B) {
            class090382.N(this);
        }
    }

    public class01894 N() {
        return this.y;
    }

    public class00002 y(class06069 class060692) {
        return this;
    }

    public class00022 R() {
        return this.R;
    }
}

