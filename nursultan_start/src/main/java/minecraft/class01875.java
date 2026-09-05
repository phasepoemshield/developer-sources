/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09536
 *  minecraft.class00392
 *  minecraft.class05341
 *  minecraft.class05361
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import Nursultan.class09536;
import minecraft.class00392;
import minecraft.class01854;
import minecraft.class01858;
import minecraft.class01883;
import minecraft.class01894;
import minecraft.class05341;
import minecraft.class05361;
import org.jspecify.annotations.Nullable;

public class class01875 {
    private final class00392 N;
    private final class05361 y;
    private final boolean L;
    private int u = 150;
    private int i = 20;
    private @Nullable class01883 R;
    private int M;
    private int B;
    private @Nullable class00392 Z;
    private @Nullable class05341 z;

    public class01875(class00392 class003922, class05361 class053612, boolean bl) {
        this.N = class003922;
        this.y = class053612;
        this.L = bl;
    }

    public class01858 y() {
        if (this.R == null) {
            throw new IllegalStateException("Sprite not set");
        }
        if (this.L) {
            return new class01854(this.u, this.i, this.N, this.M, this.B, this.R, this.y, this.Z, this.z);
        }
        return new class09536(this.u, this.i, this.N, this.M, this.B, this.R, this.y, this.Z, this.z);
    }

    public class01875 N(class01883 class018832, int n, int n2) {
        this.R = class018832;
        this.M = n;
        this.B = n2;
        return this;
    }

    public class01875 N(class05341 class053412) {
        this.z = class053412;
        return this;
    }

    public class01875 N() {
        this.Z = this.N;
        return this;
    }

    public class01875 N(int n) {
        this.u = n;
        return this;
    }

    public class01875 N(class01894 class018942, int n, int n2) {
        this.R = new class01883(class018942);
        this.M = n;
        this.B = n2;
        return this;
    }

    public class01875 N(int n, int n2) {
        this.u = n;
        this.i = n2;
        return this;
    }
}

