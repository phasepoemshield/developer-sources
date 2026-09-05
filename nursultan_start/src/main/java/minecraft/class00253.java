/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  minecraft.class00743
 *  minecraft.class01113
 *  minecraft.class01164
 *  minecraft.class01194
 *  minecraft.class01514
 *  minecraft.class03556
 *  minecraft.class03969
 *  minecraft.class03977
 *  minecraft.class04782
 *  minecraft.class04803
 *  minecraft.class05074
 *  minecraft.class05946
 *  minecraft.class06237
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class06695
 *  minecraft.class06704
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07050
 *  minecraft.class07062
 *  minecraft.class07072
 *  minecraft.class07078
 *  minecraft.class07082
 *  minecraft.class07299
 *  minecraft.class07482
 *  minecraft.class07490
 *  minecraft.class08036
 *  minecraft.class08044
 *  minecraft.class08299
 *  minecraft.class08329
 *  minecraft.class08978
 *  net.caffeinemc.mods.lithium.common.tracking.entity.ToggleableMovementTracker
 *  net.caffeinemc.mods.lithium.mixin.block.hopper.EntityAccessor
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.util.function.Supplier;
import minecraft.class00250;
import minecraft.class00743;
import minecraft.class01113;
import minecraft.class01164;
import minecraft.class01194;
import minecraft.class01514;
import minecraft.class03556;
import minecraft.class03969;
import minecraft.class03977;
import minecraft.class04782;
import minecraft.class04803;
import minecraft.class05074;
import minecraft.class05946;
import minecraft.class06237;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06695;
import minecraft.class06704;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07050;
import minecraft.class07062;
import minecraft.class07072;
import minecraft.class07078;
import minecraft.class07082;
import minecraft.class07299;
import minecraft.class07482;
import minecraft.class07490;
import minecraft.class08036;
import minecraft.class08044;
import minecraft.class08299;
import minecraft.class08329;
import minecraft.class08978;
import net.caffeinemc.mods.lithium.common.tracking.entity.ToggleableMovementTracker;
import net.caffeinemc.mods.lithium.mixin.block.hopper.EntityAccessor;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public abstract class class00253
extends class00250
implements class03969,
class03977 {
    private static final int B = 27;
    private class00743<class06584> Z = class00743.method_10213((int)27, (Object)class06584.E);
    private @Nullable class05946<class05074> W;
    private long m;

    public class04803 method_32318(int n) {
        return this.c_(n);
    }

    @Override
    public void method_5650(class07062 class070622) {
        if (!this.method_73183().method_8608() && class070622.N()) {
            class06704.N((class07299)this.method_73183(), (class07049)this, (class06695)this);
        }
        super.method_5650(class070622);
    }

    @Override
    protected void method_5652(class08329 class083292) {
        super.method_5652(class083292);
        this.N(class083292);
    }

    @Override
    public class07082 method_5688(class08036 class080362, class07050 class070502) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.N(class080362, class070502, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return (class07082)callbackInfoReturnable.getReturnValue();
        }
        class07082 class070822 = super.method_5688(class080362, class070502);
        if (class070822 != class07082.i) {
            return class070822;
        }
        if (!this.method_5818((class07049)class080362) || class080362.method_21823()) {
            class07299 class072992;
            class07082 class070823 = this.L(class080362);
            if (class070823.N() && (class072992 = class080362.method_73183()) instanceof class04782) {
                class04782 class047822 = (class04782)class072992;
                this.method_32875((class03556)class01194.U, (class07049)class080362);
                class01514.N((class04782)class047822, (class08036)class080362, (boolean)true);
            }
            return class070823;
        }
        return class07082.i;
    }

    @Override
    protected void method_5749(class08299 class082992) {
        super.method_5749(class082992);
        this.a_(class082992);
    }

    public void method_5842() {
        this.s();
    }

    public class00253(class07078<? extends class00253> class070782, class07299 class072992, Supplier<class06581> supplier) {
        super(class070782, class072992, supplier);
    }

    @Override
    protected float B() {
        return 0.15f;
    }

    @Override
    protected int Z() {
        return 1;
    }

    private void s() {
        class01113 class011132 = ((EntityAccessor)this).getChangeListener();
        if (class011132 instanceof ToggleableMovementTracker) {
            ToggleableMovementTracker toggleableMovementTracker = (ToggleableMovementTracker)class011132;
            class06889 class068892 = this.method_73189();
            int n = toggleableMovementTracker.lithium$setNotificationMask(0);
            super.method_5842();
            toggleableMovementTracker.lithium$setNotificationMask(n);
            if (!class068892.equals((Object)this.method_73189())) {
                class011132.N();
            }
        } else {
            super.method_5842();
        }
    }

    public void m() {
        this.Z = class00743.method_10213((int)this.method_5439(), (Object)class06584.E);
    }

    public @Nullable class05946<class05074> U() {
        return this.W;
    }

    public void y(@Nullable class08036 class080362) {
        this.u(class080362);
    }

    public long E() {
        return this.m;
    }

    public void N(class04782 class047822, class07072 class070722) {
        this.N(class047822, this.z());
        this.N(class070722, class047822, (class07049)this);
    }

    private void N(class08036 class080362, class07050 class070502, CallbackInfoReturnable callbackInfoReturnable) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_21_5) && class080362.method_21823()) {
            callbackInfoReturnable.setReturnValue((Object)this.L(class080362));
        }
    }

    public void N(long l) {
        this.m = l;
    }

    public void N(@Nullable class05946<class05074> class059462) {
        this.W = class059462;
    }

    public void N(class08036 class080362) {
        class080362.method_17355((class06237)this);
        class07299 class072992 = class080362.method_73183();
        if (class072992 instanceof class04782) {
            class04782 class047822 = (class04782)class072992;
            this.method_32875((class03556)class01194.U, (class07049)class080362);
            class01514.N((class04782)class047822, (class08036)class080362, (boolean)true);
        }
    }

    public boolean method_5443(class08036 class080362) {
        return this.i(class080362);
    }

    public void method_5432(class08978 class089782) {
        this.method_73183().method_32888((class03556)class01194.z, this.method_73189(), class01164.N((class07049)class089782.aB_()));
    }

    public void method_5448() {
        this.h_();
    }

    public void method_5447(int n, class06584 class065842) {
        this.N(n, class065842);
    }

    public void method_5431() {
    }

    public class06584 method_5434(int n, int n2) {
        return this.N(n, n2);
    }

    public class06584 method_5441(int n) {
        return this.a_(n);
    }

    public class00743<class06584> W() {
        return this.Z;
    }

    public @Nullable class07482 createMenu(int n, class08044 class080442, class08036 class080362) {
        if (this.W == null || !class080362.method_7325()) {
            this.y(class080442.z);
            return class07490.N((int)n, (class08044)class080442, (class06695)this);
        }
        return null;
    }

    public class06584 method_5438(int n) {
        return this.b_(n);
    }

    public int method_5439() {
        return 27;
    }
}

