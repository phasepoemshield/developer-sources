/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.util.concurrent.RateLimiter
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.booleans.BooleanConsumer
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class02252
 *  minecraft.class04654
 *  minecraft.class04701
 *  minecraft.class04945
 *  minecraft.class05096
 *  minecraft.class05101
 *  minecraft.class05153
 *  minecraft.class05216
 *  minecraft.class05220
 *  minecraft.class05362
 *  minecraft.class05407
 *  minecraft.class05936
 *  minecraft.class07536
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.google.common.collect.Lists;
import com.google.common.util.concurrent.RateLimiter;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class02252;
import minecraft.class04654;
import minecraft.class04701;
import minecraft.class04741;
import minecraft.class04945;
import minecraft.class05096;
import minecraft.class05101;
import minecraft.class05153;
import minecraft.class05216;
import minecraft.class05220;
import minecraft.class05362;
import minecraft.class05407;
import minecraft.class05936;
import minecraft.class07536;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class04704
extends class05407 {
    private static final Logger N = LogUtils.getLogger();
    private static final ReentrantLock y = new ReentrantLock();
    private static final int L = 200;
    private static final int u = 80;
    private static final int i = 95;
    private static final int R = 1;
    private final class05096 M;
    private final class04945 B;
    private final class00392 Z;
    private final RateLimiter z;
    private class05362 U;
    private final String E;
    private final class04741 W;
    private volatile @Nullable class00392 m;
    private volatile class00392 P = class00392.L((String)"mco.download.preparing");
    private volatile @Nullable String s;
    private volatile boolean T;
    private volatile boolean b = true;
    private volatile boolean j;
    private volatile boolean v;
    private @Nullable Long n;
    private @Nullable Long t;
    private long e;
    private int H;
    private static final String[] c = new String[]{"", ".", ". .", ". . ."};
    private int X;
    private boolean a;
    private final BooleanConsumer p;

    private void L(class01054 class010542) {
        if (this.H % 20 == 0) {
            if (this.n != null) {
                long l = class07536.L() - this.t;
                if (l == 0L) {
                    l = 1L;
                }
                this.e = 1000L * (this.W.N - this.n) / l;
                this.N(class010542, this.e);
            }
            this.n = this.W.N;
            this.t = class07536.L();
        } else {
            this.N(class010542, this.e);
        }
    }

    private void L() {
        new Thread(() -> {
            try {
                if (!y.tryLock(1L, TimeUnit.SECONDS)) {
                    this.P = class00392.L((String)"mco.download.failed");
                    return;
                }
                if (this.T) {
                    this.u();
                    return;
                }
                this.P = class00392.N((String)"mco.download.downloading", (Object[])new Object[]{this.E});
                class05101 class051012 = new class05101();
                class051012.N(this.B, this.E, this.W, this.field_22787.NL());
                while (!class051012.y()) {
                    if (class051012.L()) {
                        class051012.N();
                        this.m = class00392.L((String)"mco.download.failed");
                        this.U.method_25355(class05220.u);
                        return;
                    }
                    if (class051012.u()) {
                        if (!this.v) {
                            this.P = class00392.L((String)"mco.download.extracting");
                        }
                        this.v = true;
                    }
                    if (this.T) {
                        class051012.N();
                        this.u();
                        return;
                    }
                    try {
                        Thread.sleep(500L);
                    }
                    catch (InterruptedException interruptedException) {
                        N.error("Failed to check Realms backup download status");
                    }
                }
                this.j = true;
                this.P = class00392.L((String)"mco.download.done");
                this.U.method_25355(class05220.u);
            }
            catch (InterruptedException interruptedException) {
                N.error("Could not acquire upload lock");
            }
            catch (Exception exception) {
                this.m = class00392.L((String)"mco.download.failed");
                N.info("Exception while downloading world", (Throwable)exception);
            }
            finally {
                if (!y.isHeldByCurrentThread()) {
                    return;
                }
                y.unlock();
                this.b = false;
                this.j = true;
            }
        }).start();
    }

    public class04704(class05096 class050962, class04945 class049452, String string, BooleanConsumer booleanConsumer) {
        super(class05153.N);
        this.p = booleanConsumer;
        this.M = class050962;
        this.E = string;
        this.B = class049452;
        this.W = new class04741();
        this.Z = class00392.L((String)"mco.download.title");
        this.z = RateLimiter.create((double)0.1f);
    }

    private void u() {
        this.P = class00392.L((String)"mco.download.cancelled");
    }

    private void y(class01054 class010542) {
        double d = Math.min((double)this.W.N / (double)this.W.y, 1.0);
        this.s = String.format(Locale.ROOT, "%.1f", d * 100.0);
        int n = (this.field_22789 - 200) / 2;
        int n2 = n + (int)Math.round(200.0 * d);
        class010542.N(n - 1, 79, n2 + 1, 96, -1);
        class010542.N(n, 80, n2, 95, -8355712);
        class010542.N(this.field_22793, (class00392)class00392.N((String)"mco.download.percent", (Object[])new Object[]{this.s}), this.field_22789 / 2, 84, -1);
    }

    private class00392 y() {
        ArrayList arrayList = Lists.newArrayList();
        arrayList.add(this.Z);
        arrayList.add(this.P);
        if (this.s != null) {
            arrayList.add(class00392.N((String)"mco.download.percent", (Object[])new Object[]{this.s}));
            arrayList.add(class00392.N((String)"mco.download.speed.narration", (Object[])new Object[]{class04701.y((long)this.e)}));
        }
        if (this.m != null) {
            arrayList.add(this.m);
        }
        return class05220.N((Collection)arrayList);
    }

    private void N(class01054 class010542, long l) {
        if (l > 0L) {
            int n = this.field_22793.y(this.s);
            class010542.y(this.field_22793, (class00392)class00392.N((String)"mco.download.speed", (Object[])new Object[]{class04701.y((long)l)}), this.field_22789 / 2 + n / 2 + 15, 84, -1);
        }
    }

    private void N(class01054 class010542) {
        int n = this.field_22793.N((class05936)this.P);
        if (this.H != 0 && this.H % 10 == 0) {
            ++this.X;
        }
        class010542.y(this.field_22793, c[this.X % c.length], this.field_22789 / 2 + n / 2 + 5, 50, -1);
    }

    private long N(String string) {
        return class05101.N((String)string).orElse(0L);
    }

    private void N() {
        if (this.j || this.a) {
            return;
        }
        this.a = true;
        if (this.N(this.B.N()) >= 0x140000000L) {
            class05216 class052162 = class00392.N((String)"mco.download.confirmation.oversized", (Object[])new Object[]{class04701.y((long)0x140000000L)});
            this.field_22787.N((class05096)class02252.L((class05096)this, (class00392)class052162, class037232 -> {
                this.field_22787.N((class05096)this);
                this.L();
            }));
        } else {
            this.L();
        }
    }

    public void method_25426() {
        this.U = (class05362)this.method_37063((class04654)class05362.method_46430((class00392)class05220.i, class053622 -> this.method_25419()).N((this.field_22789 - 200) / 2, this.field_22790 - 42, 200, 20).N());
        this.N();
    }

    public void method_25393() {
        super.method_25393();
        ++this.H;
        if (this.P != null && this.z.tryAcquire(1)) {
            class00392 class003922 = this.y();
            this.field_22787.NT().u(class003922);
        }
    }

    public void method_25394(class01054 class010542, int n, int n2, float f) {
        super.method_25394(class010542, n, n2, f);
        class010542.N(this.field_22793, this.Z, this.field_22789 / 2, 20, -1);
        class010542.N(this.field_22793, this.P, this.field_22789 / 2, 50, -1);
        if (this.b) {
            this.N(class010542);
        }
        if (this.W.N != 0L && !this.T) {
            this.y(class010542);
            this.L(class010542);
        }
        if (this.m != null) {
            class010542.N(this.field_22793, this.m, this.field_22789 / 2, 110, -65536);
        }
    }

    public void method_25419() {
        this.T = true;
        if (this.j && this.p != null && this.m == null) {
            this.p.accept(true);
        }
        this.field_22787.N(this.M);
    }
}

