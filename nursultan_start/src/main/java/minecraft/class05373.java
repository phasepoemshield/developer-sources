/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class04141
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00392;
import minecraft.class04141;
import minecraft.class05341;
import minecraft.class05358;
import minecraft.class05361;
import minecraft.class05362;
import org.jspecify.annotations.Nullable;

public class class05373 {
    private final class00392 N;
    private final class05361 y;
    private @Nullable class04141 L;
    private int u;
    private int i;
    private int R = 150;
    private int M = 20;
    private class05341 B = class05362.field_40754;

    public class05373(class00392 class003922, class05361 class053612) {
        this.N = class003922;
        this.y = class053612;
    }

    public class05373 y(int n, int n2) {
        this.R = n;
        this.M = n2;
        return this;
    }

    public class05373 N(@Nullable class04141 class041412) {
        this.L = class041412;
        return this;
    }

    public class05373 N(class05341 class053412) {
        this.B = class053412;
        return this;
    }

    public class05362 N() {
        class05358 class053582 = new class05358(this.u, this.i, this.R, this.M, this.N, this.y, this.B);
        class053582.method_47400(this.L);
        return class053582;
    }

    public class05373 N(int n, int n2, int n3, int n4) {
        return this.N(n, n2).y(n3, n4);
    }

    public class05373 N(int n) {
        this.R = n;
        return this;
    }

    public class05373 N(int n, int n2) {
        this.u = n;
        this.i = n2;
        return this;
    }
}

