/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.util.concurrent.RateLimiter
 *  minecraft.class00064
 *  minecraft.class00072
 *  minecraft.class00246
 *  minecraft.class00276
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class02102
 *  minecraft.class03686
 *  minecraft.class04654
 *  minecraft.class04701
 *  minecraft.class04980
 *  minecraft.class05092
 *  minecraft.class05096
 *  minecraft.class05113
 *  minecraft.class05129
 *  minecraft.class05153
 *  minecraft.class05220
 *  minecraft.class05362
 *  minecraft.class05407
 *  minecraft.class05685
 *  minecraft.class05936
 *  minecraft.class06434
 *  minecraft.class06478
 *  minecraft.class06601
 *  minecraft.class07312
 *  minecraft.class08688
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.Lists;
import com.google.common.util.concurrent.RateLimiter;
import java.io.File;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CompletionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import minecraft.class00064;
import minecraft.class00072;
import minecraft.class00246;
import minecraft.class00276;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class02102;
import minecraft.class03686;
import minecraft.class04654;
import minecraft.class04701;
import minecraft.class04705;
import minecraft.class04708;
import minecraft.class04724;
import minecraft.class04734;
import minecraft.class04736;
import minecraft.class04980;
import minecraft.class05092;
import minecraft.class05096;
import minecraft.class05113;
import minecraft.class05129;
import minecraft.class05153;
import minecraft.class05220;
import minecraft.class05362;
import minecraft.class05407;
import minecraft.class05685;
import minecraft.class05936;
import minecraft.class06434;
import minecraft.class06478;
import minecraft.class06601;
import minecraft.class07312;
import minecraft.class08688;
import org.jspecify.annotations.Nullable;

public class class04733
extends class05407
implements class00276 {
    private static final int y = 200;
    private static final int L = 80;
    private static final int u = 95;
    private static final int i = 1;
    private static final String[] R = new String[]{"", ".", ". .", ". . ."};
    private static final class00392 M = class00392.L((String)"mco.upload.verifying");
    private final class04736 B;
    private final class06434 Z;
    private final @Nullable class04734 z;
    private final long U;
    private final int E;
    final AtomicReference<@Nullable class00246> N = new AtomicReference();
    private final class05113 W;
    private final RateLimiter m;
    private volatile class00392 @Nullable [] P;
    private volatile class00392 s = class00392.L((String)"mco.upload.preparing");
    private volatile @Nullable String T;
    private volatile boolean b;
    private volatile boolean j;
    private volatile boolean v = true;
    private volatile boolean n;
    private @Nullable class05362 t;
    private @Nullable class05362 e;
    private int H;
    private final class03686 c = new class03686((class05096)this);

    public class04733(@Nullable class04734 class047342, long l, int n, class04736 class047362, class06434 class064342) {
        super(class05153.N);
        this.z = class047342;
        this.U = l;
        this.E = n;
        this.B = class047362;
        this.Z = class064342;
        this.W = new class05113();
        this.m = RateLimiter.create((double)0.1f);
    }

    private void Z() {
        class04980 class049802;
        class00072 class000722;
        Path path = ((File)this.field_22787.l_1).toPath().resolve("saves").resolve(this.Z.N());
        class00246 class002462 = new class00246(path, class000722 = new class00072(this.E, class049802 = class04980.N((class07312)this.Z.M(), (String)this.Z.E().L()), List.of(class00064.N((boolean)this.Z.M().L()))), this.field_22787.Ny(), this.U, (class00276)this);
        if (!this.N.compareAndSet(null, class002462)) {
            throw new IllegalStateException("Tried to start uploading but was already uploading");
        }
        class002462.N().handleAsync((object, throwable) -> {
            if (throwable != null) {
                CompletionException completionException;
                if (throwable instanceof CompletionException) {
                    completionException = (CompletionException)throwable;
                    throwable = completionException.getCause();
                }
                if (throwable instanceof class08688) {
                    completionException = (class08688)throwable;
                    if (completionException.N() != null) {
                        this.s = completionException.N();
                    }
                    this.N(completionException.y());
                } else {
                    this.s = class00392.N((String)"mco.upload.failed", (Object[])new Object[]{throwable.getMessage()});
                }
            } else {
                this.s = class00392.L((String)"mco.upload.done");
                if (this.t != null) {
                    this.t.method_25355(class05220.u);
                }
            }
            this.j = true;
            this.v = false;
            if (this.t != null) {
                this.t.field_22764 = true;
            }
            if (this.e != null) {
                this.e.field_22764 = false;
            }
            this.N.set(null);
            return null;
        }, (Executor)this.field_22787);
    }

    private void i() {
        this.b = true;
        class00246 class002462 = this.N.get();
        if (class002462 != null) {
            class002462.y();
        } else {
            this.field_22787.N((class05096)this.B);
        }
    }

    private void u() {
        this.field_22787.N((class05096)new class05092(new class05685((class05096)new class04705()), this.U));
    }

    private void y(class01054 class010542) {
        this.N(class010542, this.W.B());
    }

    public void y() {
        this.s = class00392.N((String)"mco.upload.uploading", (Object[])new Object[]{this.Z.y()});
    }

    private void N(class00392 ... class00392Array) {
        this.P = class00392Array;
    }

    public class05113 N() {
        return this.W;
    }

    private void N(class01054 class010542, long l) {
        String string = this.T;
        if (l > 0L && string != null) {
            int n = this.field_22793.y(string);
            String string2 = "(" + class04701.y((long)l) + "/s)";
            class010542.y(this.field_22793, string2, this.field_22789 / 2 + n / 2 + 15, 84, -1);
        }
    }

    private void N(class01054 class010542) {
        double d = this.W.R();
        this.T = String.format(Locale.ROOT, "%.1f", d * 100.0);
        int n = (this.field_22789 - 200) / 2;
        int n2 = n + (int)Math.round(200.0 * d);
        class010542.N(n - 1, 79, n2 + 1, 96, -1);
        class010542.N(n, 80, n2, 95, -8355712);
        class010542.N(this.field_22793, (class00392)class00392.N((String)"mco.upload.percent", (Object[])new Object[]{this.T}), this.field_22789 / 2, 84, -1);
    }

    public void method_25426() {
        this.t = (class05362)this.c.y((class02102)class05362.method_46430((class00392)class05220.U, class053622 -> this.u()).N());
        this.t.field_22764 = false;
        this.e = (class05362)this.c.y((class02102)class05362.method_46430((class00392)class05220.i, class053622 -> this.i()).N());
        if (!this.n) {
            if (this.B.M == -1) {
                this.n = true;
                this.Z();
            } else {
                ArrayList<class05129> arrayList = new ArrayList<class05129>();
                if (this.z != null) {
                    arrayList.add(this.z);
                }
                arrayList.add(new class04724(this.U, this.B.M, () -> {
                    if (!this.n) {
                        this.n = true;
                        this.field_22787.execute(() -> {
                            this.field_22787.N((class05096)this);
                            this.Z();
                        });
                    }
                }));
                this.field_22787.N((class05096)new class04708((class05096)this.B, arrayList.toArray(new class05129[0])));
            }
        }
        this.c.method_48206(class046542 -> {
            class06478 cfr_ignored_0 = (class06478)this.method_37063((class04654)class046542);
        });
        this.method_48640();
    }

    public boolean method_25404(class06601 class066012) {
        if (class066012.v() == 256) {
            if (this.v) {
                this.i();
            } else {
                this.u();
            }
            return true;
        }
        return super.method_25404(class066012);
    }

    public void method_48640() {
        this.c.N();
    }

    public void method_25393() {
        super.method_25393();
        ++this.H;
        this.W.M();
        if (this.m.tryAcquire(1)) {
            class00392 class003922 = this.R();
            this.field_22787.NT().u(class003922);
        }
    }

    public void method_25394(class01054 class010542, int n, int n2, float f) {
        class00392[] class00392Array;
        super.method_25394(class010542, n, n2, f);
        if (!this.j && this.W.u() && this.W.i() && this.e != null) {
            this.s = M;
            this.e.field_22763 = false;
        }
        class010542.N(this.field_22793, this.s, this.field_22789 / 2, 50, -1);
        if (this.v) {
            class010542.y(this.field_22793, R[this.H / 10 % R.length], this.field_22789 / 2 + this.field_22793.N((class05936)this.s) / 2 + 5, 50, -1);
        }
        if (this.W.u() && !this.b) {
            this.N(class010542);
            this.y(class010542);
        }
        if ((class00392Array = this.P) != null) {
            for (int i = 0; i < class00392Array.length; ++i) {
                class010542.N(this.field_22793, class00392Array[i], this.field_22789 / 2, 110 + 12 * i, -65536);
            }
        }
    }

    private class00392 R() {
        class00392[] class00392Array;
        ArrayList arrayList = Lists.newArrayList();
        arrayList.add(this.s);
        if (this.T != null) {
            arrayList.add(class00392.N((String)"mco.upload.percent", (Object[])new Object[]{this.T}));
        }
        if ((class00392Array = this.P) != null) {
            arrayList.addAll(Arrays.asList(class00392Array));
        }
        return class05220.N((Collection)arrayList);
    }
}

