/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01590
 *  minecraft.class04141
 *  minecraft.class04370
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00392;
import minecraft.class01590;
import minecraft.class04141;
import minecraft.class04370;
import minecraft.class05717;
import minecraft.class05725;
import org.jspecify.annotations.Nullable;

public class class05686 {
    private final class00392 N;
    private final class01590 y;
    private int L;
    private int u = 0;
    private int i = 0;
    private class05717 R = class05717.N;
    private boolean M = false;
    private @Nullable class04370<Boolean> B = null;
    private @Nullable class04141 Z = null;

    class05686(class00392 class003922, class01590 class015902) {
        this.N = class003922;
        this.y = class015902;
        this.L = class05725.N(class003922, class015902);
    }

    public class05686 N(class04141 class041412) {
        this.Z = class041412;
        return this;
    }

    public class05686 N(int n) {
        this.L = n;
        return this;
    }

    public class05725 N() {
        class05717 class057172 = this.B == null ? this.R : (class057252, bl) -> {
            this.B.method_41748((Object)bl);
            this.R.onValueChange(class057252, bl);
        };
        class05725 class057253 = new class05725(this.u, this.i, this.L, this.N, this.y, this.M, class057172);
        class057253.method_47400(this.Z);
        return class057253;
    }

    public class05686 N(int n, int n2) {
        this.u = n;
        this.i = n2;
        return this;
    }

    public class05686 N(class05717 class057172) {
        this.R = class057172;
        return this;
    }

    public class05686 N(boolean bl) {
        this.M = bl;
        this.B = null;
        return this;
    }

    public class05686 N(class04370<Boolean> class043702) {
        this.B = class043702;
        this.M = (Boolean)class043702.method_41753();
        return this;
    }
}

