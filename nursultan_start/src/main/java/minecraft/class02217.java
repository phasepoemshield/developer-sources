/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00549
 *  minecraft.class02818
 *  minecraft.class07321
 *  minecraft.class08050
 *  minecraft.class08694
 *  minecraft.class08700
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import minecraft.class00549;
import minecraft.class02209;
import minecraft.class02228;
import minecraft.class02236;
import minecraft.class02238;
import minecraft.class02248;
import minecraft.class02818;
import minecraft.class07321;
import minecraft.class08050;
import minecraft.class08694;
import minecraft.class08700;
import org.jspecify.annotations.Nullable;

public class class02217 {
    private final class02228 y;
    private final class07321 L;
    private @Nullable class00549 u = null;
    public final class00549 N;
    private volatile boolean i;
    private final List<CompletableFuture<class02818<class08050>>> R = new ArrayList<CompletableFuture<class02818<class08050>>>();
    private final class02248<class02236> M;
    private boolean B;

    public class02236 L() {
        return this.M.N(this.L.B, this.L.Z);
    }

    private @Nullable CompletableFuture<?> M() {
        while (!this.R.isEmpty()) {
            CompletableFuture var1 = (CompletableFuture)this.R.getLast();
            class02818 var2 = var1.getNow(null);
            if (var2 == null) {
                return var1;
            }
            this.R.removeLast();
            if (var2.N()) continue;
            this.y();
        }
        return null;
    }

    private class02217(class02228 class022282, class00549 class005492, class07321 class073212, class02248<class02236> class022482) {
        this.y = class022282;
        this.N = class005492;
        this.L = class073212;
        this.M = class022482;
    }

    private void i() {
        this.M.N(this.L.B, this.L.Z).N(this);
        this.M.N(this.y::N);
    }

    private void u() {
        class00549 class005492;
        if (this.u == null) {
            class005492 = class00549.L;
        } else if (!this.B && this.u == class00549.L && !this.R()) {
            this.B = true;
            class005492 = class00549.L;
        } else {
            class005492 = (class00549)class00549.N().get(this.u.y() + 1);
        }
        this.N(class005492, this.B);
        this.u = class005492;
    }

    private int y(class00549 class005492, boolean bl) {
        return (bl ? class02238.N : class02238.y).N(this.N).N(class005492);
    }

    public void y() {
        this.i = true;
    }

    private boolean N(class00549 class005492, boolean bl, class02236 class022362) {
        class02238 class022382;
        class00549 class005493 = class022362.T();
        boolean bl2 = class005493 != null && class005492.y(class005493);
        class02238 class022383 = class022382 = bl2 ? class02238.N : class02238.y;
        if (bl2 && !bl) {
            throw new IllegalStateException("Can't load chunk, but didn't expect to need to generate");
        }
        CompletableFuture<class02818<class08050>> var7 = class022362.N(class022382.N(class005492), this.y, this.M);
        class02818 var8 = var7.getNow(null);
        if (var8 == null) {
            this.R.add(var7);
            return true;
        }
        if (var8.N()) {
            return true;
        }
        this.y();
        return false;
    }

    private void N(class00549 class005492, boolean bl) {
        try (class08694 class086942 = class08700.N().i("scheduleLayer");){
            class086942.N(() -> ((class00549)class005492).R());
            int n = this.y(class005492, bl);
            for (int i = this.L.B - n; i <= this.L.B + n; ++i) {
                for (int j = this.L.Z - n; j <= this.L.Z + n; ++j) {
                    class02236 class022362 = this.M.N(i, j);
                    if (!this.i && this.N(class005492, bl, class022362)) continue;
                    return;
                }
            }
        }
    }

    public static class02217 N(class02228 class022282, class00549 class005492, class07321 class073212) {
        int n3 = class02238.N.N(class005492).N(class00549.L);
        class02248<class02236> class022482 = class02248.N(class073212.B, class073212.Z, n3, (n, n2) -> class022282.i(class07321.u((int)n, (int)n2)));
        return new class02217(class022282, class005492, class073212, class022482);
    }

    public @Nullable CompletableFuture<?> N() {
        CompletableFuture<?> var1;
        while ((var1 = this.M()) == null) {
            if (this.i || this.u == this.N) {
                this.i();
                return null;
            }
            this.u();
        }
        return var1;
    }

    private boolean R() {
        if (this.N == class00549.L) {
            return true;
        }
        class00549 class005492 = this.M.N(this.L.B, this.L.Z).T();
        if (class005492 == null || class005492.u(this.N)) {
            return false;
        }
        class02209 class022092 = class02238.y.N(this.N).L();
        int n = class022092.L();
        for (int i = this.L.B - n; i <= this.L.B + n; ++i) {
            for (int j = this.L.Z - n; j <= this.L.Z + n; ++j) {
                int n2 = this.L.R(i, j);
                class00549 class005493 = class022092.N(n2);
                class00549 class005494 = this.M.N(i, j).T();
                if (class005494 != null && !class005494.u(class005493)) continue;
                return false;
            }
        }
        return true;
    }
}

