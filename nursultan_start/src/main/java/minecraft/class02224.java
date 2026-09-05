/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01032
 *  minecraft.class04782
 *  minecraft.class07049
 *  minecraft.class07209
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class01032;
import minecraft.class02234;
import minecraft.class02244;
import minecraft.class04782;
import minecraft.class07049;
import minecraft.class07209;
import org.jspecify.annotations.Nullable;

public class class02224 {
    private final class02234 N;
    private class07209 y;
    private int L;
    private boolean u;

    public class07209 L() {
        return this.y;
    }

    public class02224(class02234 class022342, class07209 class072092) {
        this.N = class022342;
        this.y = class072092;
        this.u = true;
    }

    public boolean i() {
        return this.u;
    }

    public int u() {
        return this.L;
    }

    public boolean y() {
        return this.L <= 0;
    }

    public void N(class07209 class072092) {
        this.y = class072092;
    }

    public boolean N(class02234 class022342) {
        return this.N == class022342;
    }

    public void N(boolean bl) {
        this.u = bl;
    }

    public @Nullable class01032 N(class04782 class047822, class07049 class070492) {
        return this.N.N(class047822, class070492, this.y);
    }

    public class02244 N() {
        return this.N.y();
    }

    public boolean N(class04782 class047822, class07049 class070492, boolean bl) {
        if (this.u) {
            this.u = false;
            return bl && this.L++ >= this.N.N(class047822, class070492);
        }
        this.R();
        return false;
    }

    private void R() {
        this.L = Math.max(this.L - 4, 0);
    }
}

