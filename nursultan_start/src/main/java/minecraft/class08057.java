/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10869
 *  Nursultan.class10871
 *  com.google.common.collect.Lists
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime
 *  com.mojang.serialization.Codec
 *  minecraft.class00494
 *  minecraft.class00734
 *  minecraft.class00737
 *  minecraft.class04995
 *  minecraft.class05715
 *  minecraft.class06555
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07209
 *  minecraft.class07321
 *  minecraft.class08067
 *  minecraft.class08072
 *  minecraft.class08074
 *  minecraft.class08413
 *  net.caffeinemc.mods.lithium.common.world.listeners.WorldBorderListenerOnce
 *  net.caffeinemc.mods.lithium.common.world.listeners.WorldBorderPositionListenerMulti
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import Nursultan.class10869;
import Nursultan.class10871;
import com.google.common.collect.Lists;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.mojang.serialization.Codec;
import java.util.Iterator;
import java.util.List;
import minecraft.class00494;
import minecraft.class00734;
import minecraft.class00737;
import minecraft.class04995;
import minecraft.class05715;
import minecraft.class06555;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07209;
import minecraft.class07321;
import minecraft.class08055;
import minecraft.class08067;
import minecraft.class08072;
import minecraft.class08074;
import minecraft.class08413;
import net.caffeinemc.mods.lithium.common.world.listeners.WorldBorderListenerOnce;
import net.caffeinemc.mods.lithium.common.world.listeners.WorldBorderPositionListenerMulti;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class08057
extends class06555 {
    public static final double N = 5.9999968E7;
    public static final double y = 2.9999984E7;
    public static final Codec<class08057> L = class08074.y.xmap(class08057::new, class08074::new);
    public static final class08413<class08057> u = new class08413("world_border", class08057::new, L, class05715.field_62507);
    private final class08074 W;
    private boolean m;
    private final List<class08055> P;
    double i = 0.2;
    double R = 5.0;
    int M = 15;
    int B = 5;
    double Z;
    double z;
    public int U = 29999984;
    class08067 E;
    private final WorldBorderPositionListenerMulti s = new WorldBorderPositionListenerMulti();

    public void L(double d) {
        this.i = d;
        this.method_80();
        Iterator<class08055> var3 = this.E().iterator();
        while (var3.hasNext()) {
            var3.next().method_11929(this, d);
        }
    }

    public class06889 L(double d, double d2, double d3) {
        return new class06889(class04995.N((double)d, (double)this.L(), (double)(this.i() - (double)1.0E-5f)), d2, class04995.N((double)d3, (double)this.u(), (double)(this.R() - (double)1.0E-5f)));
    }

    public double L(float f) {
        return this.E.y(f);
    }

    public double L() {
        return this.N(0.0f);
    }

    public class06889 L(class06889 class068892) {
        return this.L(class068892.M, class068892.B, class068892.Z);
    }

    public void L(int n) {
        this.B = n;
        this.method_80();
        Iterator<class08055> var2 = this.E().iterator();
        while (var2.hasNext()) {
            var2.next().method_11933(this, n);
        }
    }

    public void L(double d, double d2) {
        this.Z = d;
        this.z = d2;
        this.E.M();
        this.method_80();
        Iterator<class08055> var5 = this.E().iterator();
        while (var5.hasNext()) {
            var5.next().method_11930(this, d, d2);
        }
    }

    public double M() {
        return this.Z;
    }

    public double P() {
        return this.i;
    }

    public int T() {
        return this.M;
    }

    public class08057() {
        this(class08074.N);
        this.N((CallbackInfo)null);
    }

    public class08057(class08074 class080742) {
        this.P = Lists.newArrayList();
        this.E = new class10869(this, 5.9999968E7);
        this.W = class080742;
    }

    public double B() {
        return this.z;
    }

    public double Z() {
        return this.E.N();
    }

    public double i() {
        return this.L(0.0f);
    }

    public int b() {
        return this.B;
    }

    public double s() {
        return this.E.y();
    }

    public double m() {
        return this.R;
    }

    public void j() {
        class08067 class080672 = this.E;
        this.E = this.N(class080672, objectArray -> {
            WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)1, (String)"[net.minecraft.class_2784$class_2785]");
            return ((class08067)objectArray[0]).B();
        });
    }

    public double U() {
        return this.E.u();
    }

    public long z() {
        return this.E.L();
    }

    public double u(float f) {
        return this.E.u(f);
    }

    public double u() {
        return this.y(0.0f);
    }

    public void y(int n) {
        this.M = n;
        this.method_80();
        Iterator<class08055> var2 = this.E().iterator();
        while (var2.hasNext()) {
            var2.next().method_11932(this, n);
        }
    }

    public class07209 y(class07209 class072092) {
        return this.y(class072092.method_10263(), class072092.method_10264(), class072092.method_10260());
    }

    public void y(class08055 class080552) {
        this.P.remove(class080552);
    }

    public void y(double d) {
        this.R = d;
        this.method_80();
        Iterator<class08055> var3 = this.E().iterator();
        while (var3.hasNext()) {
            var3.next().method_11935(this, d);
        }
    }

    public double y(float f) {
        return this.E.L(f);
    }

    public class07209 y(double d, double d2, double d3) {
        return class07209.method_49638((class00737)this.L(d, d2, d3));
    }

    public class08072 y() {
        return this.E.i();
    }

    public double y(double d, double d2) {
        double d3 = d2 - this.u();
        double d4 = this.R() - d2;
        double d5 = d - this.L();
        double d6 = this.i() - d;
        double d7 = Math.min(d5, d6);
        d7 = Math.min(d7, d3);
        return Math.min(d7, d4);
    }

    public class07209 y(class06889 class068892) {
        return this.y(class068892.N(), class068892.y(), class068892.L());
    }

    protected List<class08055> E() {
        return Lists.newArrayList(this.P);
    }

    public boolean N(class00734 class007342) {
        return this.N(class007342.N, class007342.L, class007342.u - (double)1.0E-5f, class007342.R - (double)1.0E-5f);
    }

    public boolean N(class07321 class073212) {
        return this.N(class073212.i(), class073212.R()) && this.N(class073212.M(), class073212.B());
    }

    private void N(CallbackInfo callbackInfo) {
        this.N((class08055)this.s);
    }

    private void N(class08055 class080552, CallbackInfo callbackInfo) {
        if (class080552 instanceof WorldBorderListenerOnce) {
            WorldBorderListenerOnce worldBorderListenerOnce = (WorldBorderListenerOnce)class080552;
            callbackInfo.cancel();
            this.s.add(worldBorderListenerOnce);
        }
    }

    public class08067 N(class08067 class080672, Operation operation) {
        class08067 class080673 = this.E;
        class08067 class080674 = (class08067)operation.call(new Object[]{class080672});
        if (class080674 != class080673) {
            this.s.onAreaReplaced(this);
        }
        return class080674;
    }

    public boolean N(class07209 class072092) {
        return this.N(class072092.method_10263(), class072092.method_10260());
    }

    public void N(long l) {
        if (!this.m) {
            this.L(this.W.N(), this.W.y());
            this.L(this.W.L());
            this.y(this.W.u());
            this.L(this.W.i());
            this.y(this.W.R());
            if (this.W.B() > 0L) {
                this.N(this.W.M(), this.W.Z(), this.W.B(), l);
            } else {
                this.N(this.W.M());
            }
            this.m = true;
        }
    }

    public boolean N(class06889 class068892) {
        return this.N(class068892.M, class068892.Z);
    }

    public void N(double d) {
        this.E = new class10869(this, d);
        this.method_80();
        Iterator<class08055> var3 = this.E().iterator();
        while (var3.hasNext()) {
            var3.next().method_11934(this, d);
        }
    }

    public boolean N(double d, double d2) {
        return this.N(d, d2, 0.0);
    }

    public boolean N(double d, double d2, double d3) {
        return d >= this.L() - d3 && d < this.i() + d3 && d2 >= this.u() - d3 && d2 < this.R() + d3;
    }

    public double N(float f) {
        return this.E.N(f);
    }

    public boolean N(class07049 class070492, class00734 class007342) {
        double d = Math.max(class04995.N((double)class007342.y(), (double)class007342.u()), 1.0);
        return this.N(class070492) < d * 2.0 && this.N(class070492.method_23317(), class070492.method_23321(), d);
    }

    public class00494 N() {
        return this.E.Z();
    }

    public void N(int n) {
        this.U = n;
        this.E.R();
    }

    private boolean N(double d, double d2, double d3, double d4) {
        return this.N(d, d2) && this.N(d3, d4);
    }

    public void N(class08055 class080552) {
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        this.N(class080552, callbackInfo);
        if (callbackInfo.isCancelled()) {
            return;
        }
        this.P.add(class080552);
    }

    public double N(class07049 class070492) {
        return this.y(class070492.method_23317(), class070492.method_23321());
    }

    public void N(double d, double d2, long l, long l2) {
        this.E = d == d2 ? new class10869(this, d2) : new class10871(this, d, d2, l, l2);
        this.method_80();
        Iterator<class08055> var9 = this.E().iterator();
        while (var9.hasNext()) {
            var9.next().method_11931(this, d, d2, l, l2);
        }
    }

    public int W() {
        return this.U;
    }

    public double R() {
        return this.u(0.0f);
    }
}

