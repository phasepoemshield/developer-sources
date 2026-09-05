/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.logging.LogUtils
 *  minecraft.class00269
 *  minecraft.class00381
 *  minecraft.class00477
 *  minecraft.class00492
 *  minecraft.class00505
 *  minecraft.class00679
 *  minecraft.class02265
 *  minecraft.class02484
 *  minecraft.class02582
 *  minecraft.class02607
 *  minecraft.class02655
 *  minecraft.class02726
 *  minecraft.class02769
 *  minecraft.class02998
 *  minecraft.class03284
 *  minecraft.class03289
 *  minecraft.class04465
 *  minecraft.class04770
 *  minecraft.class04782
 *  minecraft.class04995
 *  minecraft.class06548
 *  minecraft.class06584
 *  minecraft.class06635
 *  minecraft.class06644
 *  minecraft.class06652
 *  minecraft.class06658
 *  minecraft.class06660
 *  minecraft.class06682
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07085
 *  minecraft.class07280
 *  minecraft.class07299
 *  minecraft.class07438
 *  minecraft.class07504
 *  minecraft.class07769
 *  minecraft.class08007
 *  minecraft.class08036
 *  minecraft.class08039
 *  minecraft.class08056
 *  minecraft.class08079
 *  net.fabricmc.fabric.api.networking.v1.EntityTrackingEvents
 *  net.fabricmc.fabric.api.networking.v1.EntityTrackingEvents$StartTracking
 *  net.fabricmc.fabric.api.networking.v1.EntityTrackingEvents$StopTracking
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import minecraft.class00269;
import minecraft.class00381;
import minecraft.class00477;
import minecraft.class00492;
import minecraft.class00505;
import minecraft.class00679;
import minecraft.class01595;
import minecraft.class02265;
import minecraft.class02484;
import minecraft.class02582;
import minecraft.class02607;
import minecraft.class02655;
import minecraft.class02726;
import minecraft.class02769;
import minecraft.class02998;
import minecraft.class03284;
import minecraft.class03289;
import minecraft.class04465;
import minecraft.class04770;
import minecraft.class04782;
import minecraft.class04995;
import minecraft.class06548;
import minecraft.class06584;
import minecraft.class06635;
import minecraft.class06644;
import minecraft.class06652;
import minecraft.class06658;
import minecraft.class06660;
import minecraft.class06682;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07085;
import minecraft.class07280;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class07504;
import minecraft.class07769;
import minecraft.class08007;
import minecraft.class08036;
import minecraft.class08039;
import minecraft.class08056;
import minecraft.class08079;
import net.fabricmc.fabric.api.networking.v1.EntityTrackingEvents;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class01599 {
    private static final Logger y = LogUtils.getLogger();
    private static final int L = 1;
    private static final double u = 7.62939453125E-6;
    public static final int N = 60;
    private static final int i = 400;
    private final class04782 R;
    private final class07049 M;
    private final int B;
    private final boolean Z;
    private final class01595 z;
    private final class04465 U = new class04465();
    private byte E;
    private byte W;
    private byte m;
    private class06889 P;
    private int s;
    private int T;
    private List<class07049> b = Collections.emptyList();
    private boolean j;
    private boolean v;
    private @Nullable List<class02998<?>> n;

    public class06889 L() {
        return this.P;
    }

    private void M() {
        class03289 class032892 = this.M.method_5841();
        List var2 = class032892.y();
        if (var2 != null) {
            this.n = class032892.L();
            this.z.y((class00381<? super class07280>)new class06660(this.M.method_5628(), var2));
        }
        if (this.M instanceof class07438) {
            Set var3 = ((class07438)this.M).method_6127().N();
            if (!var3.isEmpty()) {
                this.z.y((class00381<? super class07280>)new class08056(this.M.method_5628(), (Collection)var3));
            }
            var3.clear();
        }
    }

    public class01599(class04782 class047822, class07049 class070492, int n, boolean bl, class01595 class015952) {
        this.R = class047822;
        this.z = class015952;
        this.M = class070492;
        this.B = n;
        this.Z = bl;
        this.U.i(class070492.method_43390());
        this.P = class070492.method_18798();
        this.E = class04995.i((float)class070492.method_36454());
        this.W = class04995.i((float)class070492.method_36455());
        this.m = class04995.i((float)class070492.method_5791());
        this.v = class070492.method_24828();
        this.n = class070492.method_5841().L();
    }

    public float i() {
        return class04995.N((byte)this.E);
    }

    public float u() {
        return class04995.N((byte)this.W);
    }

    private void y(class04770 class047702, CallbackInfo callbackInfo) {
        ((EntityTrackingEvents.StopTracking)EntityTrackingEvents.STOP_TRACKING.invoker()).onStopTracking(this.M, class047702);
    }

    public void y(class04770 class047702) {
        ArrayList arrayList = new ArrayList();
        this.N(class047702, arrayList::add);
        class047702.field_13987.method_14364((class00381)new class03284(arrayList));
        this.M.method_5837(class047702);
        this.N(class047702, (CallbackInfo)null);
    }

    public class06889 y() {
        return this.U.N();
    }

    public void N() {
        class07769 class077692;
        class07049 class070492;
        this.M.method_75725();
        List var1 = this.M.method_5685();
        if (!var1.equals(this.b)) {
            this.z.N((class00381<? super class07280>)new class08079(this.M), (class04770 class047702) -> var1.contains(class047702) == this.b.contains(class047702));
            this.b = var1;
        }
        if ((class070492 = this.M) instanceof class00679) {
            class00679 class006792 = (class00679)class070492;
            if (this.s % 10 == 0) {
                class02265 class022652;
                class070492 = class006792.Z();
                if (class070492.B() instanceof class06548 && (class077692 = class06548.N((class02265)(class022652 = (class02265)class070492.method_58694(class02484.f)), (class07299)this.R)) != null) {
                    for (class07049 class070493 : this.R.method_18456()) {
                        class077692.N((class08036)class070493, (class06584)class070492);
                        class00381 var8 = class077692.N(class022652, (class08036)class070493);
                        if (var8 == null) continue;
                        class070493.field_13987.method_14364(var8);
                    }
                }
                this.M();
            }
        }
        if (this.s % this.B == 0 || this.M.field_64356 || this.M.method_5841().N()) {
            boolean bl;
            byte by = class04995.i((float)this.M.method_36454());
            byte by2 = class04995.i((float)this.M.method_36455());
            boolean bl2 = bl = Math.abs(by - this.E) >= 1 || Math.abs(by2 - this.W) >= 1;
            if (this.M.method_5765()) {
                if (bl) {
                    this.z.N((class00381<? super class07280>)new class00492(this.M.method_5628(), by, by2, this.M.method_24828()));
                    this.E = by;
                    this.W = by2;
                }
                this.U.i(this.M.method_43390());
                this.M();
                this.j = true;
            } else {
                class07049 class070493;
                class070493 = this.M;
                if (class070493 instanceof class07504 && (class070493 = (class077692 = (class07504)class070493).N()) instanceof class02726) {
                    class02726 class027262 = (class02726)class070493;
                    this.N(class027262, by, by2, bl);
                } else {
                    class06889 class068892;
                    double d;
                    boolean bl3;
                    ++this.T;
                    class070493 = this.M.method_43390();
                    boolean bl4 = this.U.u((class06889)class070493).B() >= 7.62939453125E-6;
                    class00269 class002692 = null;
                    boolean bl5 = bl4 || this.s % 60 == 0;
                    boolean bl6 = false;
                    boolean bl7 = false;
                    long l = this.U.N((class06889)class070493);
                    long l2 = this.U.y((class06889)class070493);
                    long l3 = this.U.L((class06889)class070493);
                    boolean bl8 = bl3 = l < -32768L || l > 32767L || l2 < -32768L || l2 > 32767L || l3 < -32768L || l3 > 32767L;
                    if (this.M.method_70667() || bl3 || this.T > 400 || this.j || this.v != this.M.method_24828()) {
                        this.v = this.M.method_24828();
                        this.T = 0;
                        class002692 = class00269.N((class07049)this.M);
                        bl6 = true;
                        bl7 = true;
                    } else if (bl5 && bl || this.M instanceof class08007) {
                        class002692 = new class00477(this.M.method_5628(), (short)l, (short)l2, (short)l3, by, by2, this.M.method_24828());
                        bl6 = true;
                        bl7 = true;
                    } else if (bl5) {
                        class002692 = new class00505(this.M.method_5628(), (short)l, (short)l2, (short)l3, this.M.method_24828());
                        bl6 = true;
                    } else if (bl) {
                        class002692 = new class00492(this.M.method_5628(), by, by2, this.M.method_24828());
                        bl7 = true;
                    }
                    if ((this.M.field_64356 || this.Z || this.M instanceof class07438 && ((class07438)this.M).method_6128()) && ((d = (class068892 = this.M.method_18798()).M(this.P)) > 1.0E-7 || d > 0.0 && class068892.B() == 0.0)) {
                        this.P = class068892;
                        class07049 class070494 = this.M;
                        if (class070494 instanceof class08039) {
                            class08039 class080392 = (class08039)class070494;
                            this.z.N((class00381<? super class07280>)new class03284(List.of(new class06652(this.M.method_5628(), this.P), new class02655(class080392.method_5628(), class080392.L))));
                        } else {
                            this.z.N((class00381<? super class07280>)new class06652(this.M.method_5628(), this.P));
                        }
                    }
                    if (class002692 != null) {
                        this.z.N((class00381<? super class07280>)class002692);
                    }
                    this.M();
                    if (bl6) {
                        this.U.i((class06889)class070493);
                    }
                    if (bl7) {
                        this.E = by;
                        this.W = by2;
                    }
                    this.j = false;
                }
            }
            byte by3 = class04995.i((float)this.M.method_5791());
            if (Math.abs(by3 - this.m) >= 1) {
                this.z.N((class00381<? super class07280>)new class06644(this.M, by3));
                this.m = by3;
            }
            this.M.field_64356 = false;
        }
        ++this.s;
        if (this.M.field_6037) {
            this.M.field_6037 = false;
            this.z.y((class00381<? super class07280>)new class06652(this.M));
        }
    }

    private void N(class04770 class047702, CallbackInfo callbackInfo) {
        ((EntityTrackingEvents.StartTracking)EntityTrackingEvents.START_TRACKING.invoker()).onStartTracking(this.M, class047702);
    }

    private void N(class02726 class027262, byte by, byte by2, boolean bl) {
        this.M();
        if (class027262.i.isEmpty()) {
            double d = this.M.method_18798().M(this.P);
            class06889 class068892 = this.M.method_43390();
            if (this.U.u(class068892).B() >= 7.62939453125E-6 || this.s % 60 == 0 || bl || d > 1.0E-7) {
                this.z.N((class00381<? super class07280>)new class02582(this.M.method_5628(), List.of(new class02769(this.M.method_73189(), this.M.method_18798(), this.M.method_36454(), this.M.method_36455(), 1.0f))));
            }
        } else {
            this.z.N((class00381<? super class07280>)new class02582(this.M.method_5628(), List.copyOf(class027262.i)));
            class027262.i.clear();
        }
        this.E = by;
        this.W = by2;
        this.U.i(this.M.method_73189());
    }

    public void N(class04770 class047702) {
        this.y(class047702, null);
        this.M.method_5742(class047702);
        class047702.field_13987.method_14364((class00381)new class06658(new int[]{this.M.method_5628()}));
    }

    public void N(class04770 class047702, Consumer<class00381<class07280>> consumer) {
        class07438 class074382;
        Collection var5;
        Object object;
        this.M.method_75725();
        if (this.M.method_31481()) {
            y.warn("Fetching packet for removed entity {}", (Object)this.M);
        }
        class00381 var3 = this.M.method_18002(this);
        consumer.accept((class00381<class07280>)var3);
        if (this.n != null) {
            consumer.accept((class00381<class07280>)new class06660(this.M.method_5628(), this.n));
        }
        if ((object = this.M) instanceof class07438 && !(var5 = (class074382 = (class07438)object).method_6127().L()).isEmpty()) {
            consumer.accept((class00381<class07280>)new class08056(this.M.method_5628(), var5));
        }
        if ((object = this.M) instanceof class07438) {
            class074382 = (class07438)object;
            object = Lists.newArrayList();
            for (class07085 class070852 : class07085.field_54086) {
                class06584 class065842 = class074382.method_6118(class070852);
                if (class065842.R()) continue;
                object.add(Pair.of((Object)class070852, (Object)class065842.t()));
            }
            if (!object.isEmpty()) {
                consumer.accept((class00381<class07280>)new class06682(this.M.method_5628(), (List)object));
            }
        }
        if (!this.M.method_5685().isEmpty()) {
            consumer.accept((class00381<class07280>)new class08079(this.M));
        }
        if (this.M.method_5765()) {
            consumer.accept((class00381<class07280>)new class08079(this.M.method_5854()));
        }
        if ((object = this.M) instanceof class02607 && (class074382 = (class02607)object).g_()) {
            consumer.accept((class00381<class07280>)new class06635(this.M, class074382.yW()));
        }
    }

    public float R() {
        return class04995.N((byte)this.m);
    }
}

