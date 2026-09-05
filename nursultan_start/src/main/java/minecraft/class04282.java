/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09561
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class02112
 *  minecraft.class03255
 *  minecraft.class03428
 *  minecraft.class03673
 *  minecraft.class04141
 *  minecraft.class06202
 *  minecraft.class07536
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import Nursultan.class09561;
import java.time.Duration;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class02112;
import minecraft.class03255;
import minecraft.class03428;
import minecraft.class03673;
import minecraft.class04141;
import minecraft.class06202;
import minecraft.class07536;
import org.jspecify.annotations.Nullable;

public class class04282 {
    private @Nullable class04141 N;
    private Duration y = Duration.ZERO;
    private long L;
    private boolean u;

    public void N(class01054 class010542, int n, int n2, boolean bl, boolean bl2, class03255 class032552) {
        boolean bl3;
        if (this.N == null) {
            this.u = false;
            return;
        }
        class06202 class062022 = class06202.Nq();
        boolean bl4 = bl3 = bl || bl2 && class062022.Nc().y();
        if (bl3 != this.u) {
            if (bl3) {
                this.L = class07536.L();
            }
            this.u = bl3;
        }
        if (bl3 && class07536.L() - this.L > this.y.toMillis()) {
            class010542.N((class01590)class062022.i_3, this.N.N(class062022), this.N(class032552, bl, bl2), n, n2, bl2);
        }
    }

    private class02112 N(class03255 class032552, boolean bl, boolean bl2) {
        if (!bl && bl2 && class06202.Nq().Nc().y()) {
            return new class09561(class032552);
        }
        return new class03673(class032552);
    }

    public void N(class03428 class034282) {
        if (this.N != null) {
            this.N.method_37020(class034282);
        }
    }

    public @Nullable class04141 N() {
        return this.N;
    }

    public void N(@Nullable class04141 class041412) {
        this.N = class041412;
    }

    public void N(Duration duration) {
        this.y = duration;
    }
}

