/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00570
 *  minecraft.class00753
 *  minecraft.class00891
 *  minecraft.class01296
 *  minecraft.class01325
 *  minecraft.class01624
 *  minecraft.class04782
 *  minecraft.class04995
 *  minecraft.class05474
 *  minecraft.class06069
 *  minecraft.class06889
 *  minecraft.class07074
 *  minecraft.class07078
 *  minecraft.class07080
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07218
 *  minecraft.class07282
 *  minecraft.class07290
 *  minecraft.class07305
 *  minecraft.class07321
 *  minecraft.class07322
 *  minecraft.class07529
 *  minecraft.class07830
 *  minecraft.class07878
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Supplier;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00570;
import minecraft.class00753;
import minecraft.class00891;
import minecraft.class01296;
import minecraft.class01325;
import minecraft.class01624;
import minecraft.class04782;
import minecraft.class04995;
import minecraft.class05474;
import minecraft.class06069;
import minecraft.class06889;
import minecraft.class07074;
import minecraft.class07078;
import minecraft.class07080;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07218;
import minecraft.class07282;
import minecraft.class07290;
import minecraft.class07305;
import minecraft.class07321;
import minecraft.class07322;
import minecraft.class07529;
import minecraft.class07830;
import minecraft.class07878;
import org.jspecify.annotations.Nullable;

public class class05960 {
    private static final class01325 N = class07078.Ly.E();
    private static final int y = 1024;
    private final class04782 L;
    private final class07209 u;
    private final int i;
    private final int R;
    private final int M;
    private final int B;
    private int Z;
    private final CompletableFuture<class06889> z = new CompletableFuture();

    private class05960(class04782 class047822, class07209 class072092, int n) {
        this.L = class047822;
        this.u = class072092;
        this.i = n;
        long l = (long)n * 2L + 1L;
        this.R = (int)Math.min(1024L, l * l);
        this.M = class05960.N(this.R);
        this.B = class06069.u().y(this.R);
    }

    private static boolean y(class07322 class073222, class07209 class072092) {
        return class073222.N(null, N.N(class072092.method_61082()), true);
    }

    public static @Nullable class07209 N(class04782 class047822, class07321 class073212) {
        if (class07529.N((class07321)class073212)) {
            return null;
        }
        for (int i = class073212.i(); i <= class073212.M(); ++i) {
            for (int j = class073212.R(); j <= class073212.B(); ++j) {
                class07209 class072092 = class05960.N(class047822, i, j);
                if (class072092 == null) continue;
                return class072092;
            }
        }
        return null;
    }

    public static CompletableFuture<class06889> N(class04782 class047822, class07209 class072092) {
        if (!class047822.method_8597().i() || class047822.method_8503().yn().z() == class07282.field_9216) {
            return CompletableFuture.completedFuture(class05960.N((class07322)class047822, class072092));
        }
        int n = Math.max(0, (Integer)class047822.method_64395().N(class07305.p));
        int n2 = class04995.N((double)class047822.method_8621().y((double)class072092.method_10263(), (double)class072092.method_10260()));
        if (n2 < n) {
            n = n2;
        }
        if (n2 <= 1) {
            n = 1;
        }
        class05960 class059602 = new class05960(class047822, class072092, n);
        class059602.N();
        return class059602.z;
    }

    private static class06889 N(class07322 class073222, class07209 class072092) {
        class07218 class072182 = class072092.method_25503();
        while (!class05960.y(class073222, (class07209)class072182) && class072182.method_10264() < class073222.method_31600()) {
            class072182.N(class07211.field_11036);
        }
        class072182.N(class07211.field_11033);
        while (class05960.y(class073222, (class07209)class072182) && class072182.method_10264() > class073222.method_31607()) {
            class072182.N(class07211.field_11033);
        }
        class072182.N(class07211.field_11036);
        return class06889.L((class00753)class072182);
    }

    private static int N(int n) {
        return n <= 16 ? n - 1 : 17;
    }

    private void N(int n, int n2, int n3, Supplier<Optional<class06889>> supplier) {
        if (this.z.isDone()) {
            return;
        }
        int n4 = class01296.N((int)n);
        int n5 = class01296.N((int)n2);
        this.L.method_14178().N(class01624.B, new class07321(n4, n5), 0).whenCompleteAsync((object, throwable) -> {
            Optional optional;
            if (throwable == null) {
                try {
                    optional = (Optional)supplier.get();
                    if (optional.isPresent()) {
                        this.z.complete((class06889)optional.get());
                    } else {
                        this.N();
                    }
                }
                catch (Throwable throwable2) {
                    throwable = throwable2;
                }
            }
            if (throwable != null) {
                optional = class07080.N((Throwable)throwable, (String)"Searching for spawn");
                class07074 class070742 = optional.N("Spawn Lookup");
                class070742.N("Origin", () -> ((class07209)this.u).toString());
                class070742.N("Radius", () -> Integer.toString(this.i));
                class070742.N("Candidate", () -> "[" + n + "," + n2 + "]");
                class070742.N("Progress", () -> n3 + " out of " + this.R);
                this.z.completeExceptionally((Throwable)new class07878((class07080)optional));
            }
        }, (Executor)this.L.method_8503());
    }

    protected static @Nullable class07209 N(class04782 class047822, int n, int n2) {
        int n3;
        boolean bl = class047822.method_8597().R();
        class00570 class005702 = class047822.method_8497(class01296.N((int)n), class01296.N((int)n2));
        int n4 = n3 = bl ? class047822.method_14178().U().N((class05474)class047822) : class005702.N(class07830.field_13197, n & 0xF, n2 & 0xF);
        if (n3 < class047822.method_31607()) {
            return null;
        }
        int n5 = class005702.N(class07830.field_13202, n & 0xF, n2 & 0xF);
        if (n5 <= n3 && n5 > class005702.N(class07830.field_13200, n & 0xF, n2 & 0xF)) {
            return null;
        }
        class07218 class072182 = new class07218();
        for (int i = n3 + 1; i >= class047822.method_31607(); --i) {
            class072182.N(n, i, n2);
            class00500 class005002 = class047822.method_8320((class07209)class072182);
            if (!class005002.Y().W()) break;
            if (!class00891.N((class00494)class005002.M((class07290)class047822, (class07209)class072182), (class07211)class07211.field_11036)) continue;
            return class072182.method_10084().method_10062();
        }
        return null;
    }

    private void N() {
        int n;
        if ((n = this.Z++) < this.R) {
            int n2 = (this.B + this.M * n) % this.R;
            int n3 = n2 % (this.i * 2 + 1);
            int n4 = n2 / (this.i * 2 + 1);
            int n5 = this.u.method_10263() + n3 - this.i;
            int n6 = this.u.method_10260() + n4 - this.i;
            this.N(n5, n6, n, () -> {
                class07209 class072092 = class05960.N(this.L, n5, n6);
                if (class072092 != null && class05960.y((class07322)this.L, class072092)) {
                    return Optional.of(class06889.L((class00753)class072092));
                }
                return Optional.empty();
            });
        } else {
            this.N(this.u.method_10263(), this.u.method_10260(), n, () -> Optional.of(class05960.N((class07322)this.L, this.u)));
        }
    }
}

