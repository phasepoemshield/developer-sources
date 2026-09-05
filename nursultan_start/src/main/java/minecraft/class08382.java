/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10401
 *  Nursultan.class11824
 *  Nursultan.class11825
 *  minecraft.class04995
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07109
 *  minecraft.class08605
 *  org.joml.Vector3d
 *  org.joml.Vector3dc
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import Nursultan.class10401;
import Nursultan.class11824;
import Nursultan.class11825;
import java.util.Objects;
import java.util.function.Consumer;
import minecraft.class04995;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07109;
import minecraft.class08605;
import org.joml.Vector3d;
import org.joml.Vector3dc;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class08382 {
    public static final int field_55663 = 3;
    private final class07049 field_55664;
    private int field_55665;
    public final class08605 field_55666 = new class08605(0, class06889.L, 0.0f, 0.0f);
    private @Nullable class06889 field_55667;
    private @Nullable class07109 field_55668;
    private final @Nullable Consumer<class08382> field_55669;

    public boolean method_66270() {
        return this.field_55666.N > 0;
    }

    public float method_66268() {
        return this.field_55666.N > 0 ? this.field_55666.L : this.field_55664.method_36454();
    }

    public class06889 method_66265() {
        return this.field_55666.N > 0 ? this.field_55666.y : this.field_55664.method_73189();
    }

    public float method_66269() {
        return this.field_55666.N > 0 ? this.field_55666.u : this.field_55664.method_36455();
    }

    public void method_66267(class06889 class068892, float f, float f2) {
        this.handler$cfi000$nursultan$injectRefreshPositionAndAngles(class068892, f, f2, null);
        if (this.field_55665 == 0) {
            this.field_55664.method_60949(class068892, f, f2);
            this.method_66272();
            return;
        }
        if (this.method_66270() && Objects.equals(Float.valueOf(this.method_66268()), Float.valueOf(f)) && Objects.equals(Float.valueOf(this.method_66269()), Float.valueOf(f2)) && Objects.equals(this.method_66265(), class068892)) {
            return;
        }
        this.field_55666.N = this.field_55665;
        this.field_55666.y = class068892;
        this.field_55666.L = f;
        this.field_55666.u = f2;
        this.field_55667 = this.field_55664.method_73189();
        this.field_55668 = new class07109(this.field_55664.method_36455(), this.field_55664.method_36454());
        if (this.field_55669 != null) {
            this.field_55669.accept(this);
        }
    }

    public class08382(class07049 class070492) {
        this(class070492, 3, null);
    }

    public class08382(class07049 class070492, int n) {
        this(class070492, n, null);
    }

    public class08382(class07049 class070492, @Nullable Consumer<class08382> consumer) {
        this(class070492, 3, consumer);
    }

    public class08382(class07049 class070492, int n, @Nullable Consumer<class08382> consumer) {
        this.field_55665 = n;
        this.field_55664 = class070492;
        this.field_55669 = consumer;
    }

    public void method_66272() {
        this.field_55666.N = 0;
        this.field_55667 = null;
        this.field_55668 = null;
    }

    public void method_66271() {
        if (!this.method_66270()) {
            this.method_66272();
            return;
        }
        double d = 1.0 / (double)this.field_55666.N;
        if (this.field_55667 != null) {
            class06889 class068892 = this.field_55664.method_73189().u(this.field_55667);
            if (this.field_55664.method_73183().method_8587(this.field_55664, this.field_55664.method_65341(this.field_55666.y.i(class068892)))) {
                this.field_55666.N(class068892);
            }
        }
        if (this.field_55668 != null) {
            float f = this.field_55664.method_36454() - this.field_55668.U;
            float f2 = this.field_55664.method_36455() - this.field_55668.z;
            this.field_55666.N(f, f2);
        }
        double d2 = class04995.u((double)d, (double)this.field_55664.method_23317(), (double)this.field_55666.y.M);
        double d3 = class04995.u((double)d, (double)this.field_55664.method_23318(), (double)this.field_55666.y.B);
        double d4 = class04995.u((double)d, (double)this.field_55664.method_23321(), (double)this.field_55666.y.Z);
        class06889 class068893 = new class06889(d2, d3, d4);
        float f = (float)class04995.i((double)d, (double)this.field_55664.method_36454(), (double)this.field_55666.L);
        float f3 = (float)class04995.u((double)d, (double)this.field_55664.method_36455(), (double)this.field_55666.u);
        this.field_55664.method_33574(class068893);
        this.field_55664.method_5710(f, f3);
        this.field_55666.N();
        this.field_55667 = class068893;
        this.field_55668 = new class07109(this.field_55664.method_36455(), this.field_55664.method_36454());
    }

    public void method_66266(int n) {
        this.field_55665 = n;
    }

    public void handler$cfi000$nursultan$injectRefreshPositionAndAngles(class06889 class068892, float f, float f2, CallbackInfo callbackInfo) {
        class07049 class070492 = this.field_55664;
        if (class070492 instanceof class10401) {
            class070492 = (class11824)((class11825)((class10401)class070492)).dataManager();
            Vector3d vector3d = (Vector3d)class070492.N().N();
            ((Vector3d)class070492.u().N()).set((Vector3dc)vector3d);
            vector3d.set(class068892.M, class068892.B, class068892.Z);
        }
    }
}

