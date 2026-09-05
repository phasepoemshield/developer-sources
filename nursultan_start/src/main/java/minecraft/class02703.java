/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.HashCommon
 *  minecraft.class04425
 *  minecraft.class07209
 *  minecraft.class07290
 *  minecraft.class07955
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import it.unimi.dsi.fastutil.HashCommon;
import minecraft.class04425;
import minecraft.class07209;
import minecraft.class07290;
import minecraft.class07955;
import org.jspecify.annotations.Nullable;

public class class02703 {
    private static final int N = 4096;
    private static final int y = 4095;
    private final long[] L = new long[4096];
    private final class04425[] u = new class04425[4096];

    private class04425 N(class07290 class072902, class07209 class072092, int n, long l) {
        class04425 class044252 = class07955.y((class07290)class072902, (class07209)class072092);
        this.L[n] = l;
        this.u[n] = class044252;
        return class044252;
    }

    public void N(class07209 class072092) {
        long l = class072092.method_10063();
        int n = class02703.N(l);
        if (this.L[n] == l) {
            this.u[n] = null;
        }
    }

    private static int N(long l) {
        return (int)HashCommon.mix((long)l) & 0xFFF;
    }

    private @Nullable class04425 N(int n, long l) {
        if (this.L[n] == l) {
            return this.u[n];
        }
        return null;
    }

    public class04425 N(class07290 class072902, class07209 class072092) {
        long l = class072092.method_10063();
        int n = class02703.N(l);
        class04425 class044252 = this.N(n, l);
        if (class044252 != null) {
            return class044252;
        }
        return this.N(class072902, class072092, n, l);
    }
}

