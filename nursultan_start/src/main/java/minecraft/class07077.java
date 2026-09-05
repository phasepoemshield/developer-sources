/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10714
 *  minecraft.class00250
 *  minecraft.class01001
 *  minecraft.class02131
 *  minecraft.class02154
 *  minecraft.class03289
 *  minecraft.class04293
 *  minecraft.class04383
 *  minecraft.class04782
 *  minecraft.class05340
 *  minecraft.class05378
 *  minecraft.class06113
 *  minecraft.class07107
 *  minecraft.class07126
 *  minecraft.class07299
 *  minecraft.class07438
 *  minecraft.class07446
 *  minecraft.class07475
 *  minecraft.class08299
 *  minecraft.class08329
 *  net.caffeinemc.mods.lithium.common.ai.brain.SensorHelper
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import Nursultan.class10714;
import java.util.Optional;
import minecraft.class00250;
import minecraft.class01001;
import minecraft.class02131;
import minecraft.class02154;
import minecraft.class03289;
import minecraft.class04293;
import minecraft.class04383;
import minecraft.class04782;
import minecraft.class05340;
import minecraft.class05378;
import minecraft.class06113;
import minecraft.class07049;
import minecraft.class07052;
import minecraft.class07078;
import minecraft.class07107;
import minecraft.class07126;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class07446;
import minecraft.class07475;
import minecraft.class08299;
import minecraft.class08329;
import net.caffeinemc.mods.lithium.common.ai.brain.SensorHelper;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public abstract class class07077
extends class07475 {
    private static final class02131<Boolean> N = class03289.N(class07077.class, (class04383)class02154.U);
    public static final int W = -24000;
    private static final int y = 40;
    protected static final int m = 0;
    protected static final int P = 0;
    protected int s = 0;
    protected int T = 0;
    protected int b;

    public void L(int n) {
        this.N(n, false);
    }

    protected void M() {
        class07049 class070492;
        if (!this.method_6109() && this.method_5765() && (class070492 = this.method_5854()) instanceof class00250 && !((class00250)class070492).N((class07049)((Object)this))) {
            this.method_5848();
        }
    }

    public int K() {
        if (this.method_73183().method_8608()) {
            return (Boolean)this.field_6011.N(N) != false ? -1 : 1;
        }
        return this.s;
    }

    public void method_5674(class02131<?> class021312) {
        if (N.equals(class021312)) {
            this.N(class021312, null);
            this.method_18382();
        }
        super.method_5674(class021312);
    }

    public void method_5693(class04293 class042932) {
        super.method_5693(class042932);
        class042932.N(N, (Object)false);
    }

    public void method_5652(class08329 class083292) {
        super.method_5652(class083292);
        class083292.N("Age", this.K());
        class083292.N("ForcedAge", this.T);
    }

    public boolean method_6109() {
        return this.K() < 0;
    }

    public void method_5749(class08299 class082992) {
        super.method_5749(class082992);
        this.u(class082992.N("Age", 0));
        this.T = class082992.N("ForcedAge", 0);
    }

    public class07077(class07078<? extends class07077> class070782, class07299 class072992) {
        super(class070782, class072992);
    }

    public int V() {
        return this.T;
    }

    public int e() {
        return this.b;
    }

    public static int i(int n) {
        return (int)((float)(n / 20) * 0.1f);
    }

    public boolean q() {
        return false;
    }

    public void u(int n) {
        int n2 = this.K();
        this.s = n;
        if (n2 < 0 && n >= 0 || n2 >= 0 && n < 0) {
            this.field_6011.N(N, (Object)(n < 0 ? 1 : 0));
            this.M();
        }
    }

    public void y(boolean bl) {
        this.u(bl ? -24000 : 0);
    }

    public abstract @Nullable class07077 y(class04782 var1, class07077 var2);

    public void N(int n, boolean bl) {
        int n2;
        int n3 = n2 = this.K();
        if ((n2 += n * 20) > 0) {
            n2 = 0;
        }
        int n4 = n2 - n3;
        this.u(n2);
        if (bl) {
            this.T += n4;
            if (this.b == 0) {
                this.b = 40;
            }
        }
        if (this.K() == 0) {
            this.u(this.T);
        }
    }

    private void N(class02131 class021312, CallbackInfo callbackInfo) {
        if (this.method_73183().method_8608()) {
            return;
        }
        if (this.method_6109()) {
            SensorHelper.enableSensor((class07438)this, (class05340)class05340.P, (boolean)true);
        } else {
            SensorHelper.disableSensor((class07438)this, (class05340)class05340.P);
            if (this.method_18868().N(class05378.e)) {
                this.method_18868().N(class05378.e, Optional.empty());
            }
        }
    }

    public @Nullable class07446 N(class01001 class010012, class07052 class070522, class06113 class061132, @Nullable class07446 class074462) {
        class10714 class107142;
        if (class074462 == null) {
            class074462 = new class10714(true);
        }
        if ((class107142 = (class10714)class074462).L() && class107142.N() > 0 && class010012.method_8409().z() <= class107142.u()) {
            this.u(-24000);
        }
        class107142.y();
        return super.N(class010012, class070522, class061132, class074462);
    }

    public void method_6007() {
        super.method_6007();
        if (this.method_73183().method_8608()) {
            if (this.b > 0) {
                if (this.b % 4 == 0) {
                    this.method_73183().method_8406((class07126)class07107.F, this.method_23322(1.0), this.method_23319() + 0.5, this.method_23325(1.0), 0.0, 0.0, 0.0);
                }
                --this.b;
            }
        } else if (this.method_5805()) {
            int n = this.K();
            if (n < 0) {
                this.u(++n);
            } else if (n > 0) {
                this.u(--n);
            }
        }
    }
}

