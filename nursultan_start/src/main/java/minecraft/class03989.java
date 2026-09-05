/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class03063
 *  minecraft.class03448
 *  minecraft.class03770
 *  minecraft.class05846
 *  minecraft.class05848
 *  minecraft.class05885
 *  minecraft.class06202
 *  minecraft.class07105
 *  minecraft.class07209
 *  minecraft.class07295
 *  minecraft.class08388
 *  minecraft.class08626
 *  minecraft.class08743
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.particle.v1.ParticleRenderEvents
 *  net.fabricmc.fabric.api.client.particle.v1.ParticleRenderEvents$AllowBlockDustTint
 *  net.irisshaders.iris.fantastic.IrisParticleRenderTypes
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import minecraft.class00500;
import minecraft.class00869;
import minecraft.class03063;
import minecraft.class03448;
import minecraft.class03770;
import minecraft.class05846;
import minecraft.class05848;
import minecraft.class05885;
import minecraft.class06202;
import minecraft.class07105;
import minecraft.class07209;
import minecraft.class07295;
import minecraft.class08388;
import minecraft.class08626;
import minecraft.class08743;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.particle.v1.ParticleRenderEvents;
import net.irisshaders.iris.fantastic.IrisParticleRenderTypes;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(value=EnvType.CLIENT)
public class class03989
extends class05848 {
    private final class05846 N;
    private final class07209 y;
    private final float L;
    private final float u;
    private boolean i;

    public class03989(class03448 class034482, double d, double d2, double d3, double d4, double d5, double d6, class00500 class005002) {
        this(class034482, d, d2, d3, d4, d5, d6, class005002, class07209.method_49637((double)d, (double)d2, (double)d3));
    }

    public class03989(class03448 class034482, double d, double d2, double d3, double d4, double d5, double d6, class00500 class005002, class07209 class072092) {
        super(class034482, d, d2, d3, d4, d5, d6, class03989.N(class06202.Nq().yU().N(), class005002, class034482, d, d2, d3, d4, d5, d6, class005002, class072092));
        this.y = class072092;
        this.field_3844 = 1.0f;
        this.field_62633 = 0.6f;
        this.field_62634 = 0.6f;
        this.field_62635 = 0.6f;
        class005002 = this.N(class005002, class034482, class072092);
        if (!class005002.N(class00869.Z)) {
            int n = class06202.Nq().d().N(class005002, (class07295)class034482, class072092, 0);
            this.field_62633 *= (float)(n >> 16 & 0xFF) / 255.0f;
            this.field_62634 *= (float)(n >> 8 & 0xFF) / 255.0f;
            this.field_62635 *= (float)(n & 0xFF) / 255.0f;
        }
        this.field_17867 /= 2.0f;
        this.L = this.field_3840.z() * 3.0f;
        this.u = this.field_3840.z() * 3.0f;
        this.N = this.field_62632.method_45852().equals((Object)class08626.N) ? class05846.N : class05846.y;
        this.N(class034482, d, d2, d3, d4, d5, d6, class005002, class072092, null);
    }

    static @Nullable class03989 N(class07105 class071052, class03448 class034482, double d, double d2, double d3, double d4, double d5, double d6) {
        class00500 class005002 = class071052.N();
        if (class005002.P() || class005002.N(class00869.LN) || !class005002.g()) {
            return null;
        }
        class03989 class039892 = class03989.N(class034482, d, d2, d3, d4, d5, d6, class005002, class071052, class034482, d, d2, d3, d4, d5, d6);
        if (class039892 == null) {
            throw new NullPointerException("@Redirect constructor handler net/minecraft/class_727::constructBlockDustParticle returned null for net.minecraft.class_727");
        }
        return class039892;
    }

    private class00500 N(class00500 class005002, class03448 class034482, class07209 class072092) {
        if (!((ParticleRenderEvents.AllowBlockDustTint)ParticleRenderEvents.ALLOW_BLOCK_DUST_TINT.invoker()).allowBlockDustTint(class005002, class034482, class072092)) {
            return class00869.Z.W();
        }
        return class005002;
    }

    private void N(CallbackInfoReturnable callbackInfoReturnable) {
        if (this.i && callbackInfoReturnable.getReturnValue() == class05846.N) {
            callbackInfoReturnable.setReturnValue((Object)IrisParticleRenderTypes.TERRAIN_OPAQUE);
        }
    }

    private static class03989 N(class03448 class034482, double d, double d2, double d3, double d4, double d5, double d6, class00500 class005002, class07105 class071052, class03448 class034483, double d7, double d8, double d9, double d10, double d11, double d12) {
        class07209 class072092 = class071052.getBlockPos();
        if (class072092 != null) {
            return new class03989(class034482, d, d2, d3, d4, d5, d6, class005002, class072092);
        }
        return new class03989(class034482, d, d2, d3, d4, d5, d6, class005002);
    }

    private static class08388 N(class03770 class037702, class00500 class005002, class03448 class034482, double d, double d2, double d3, double d4, double d5, double d6, class00500 class005003, class07209 class072092) {
        return class037702.getModelParticleSprite(class005002, (class07295)class034482, class072092);
    }

    private void N(class03448 class034482, double d, double d2, double d3, double d4, double d5, double d6, class00500 class005002, class07209 class072092, CallbackInfo callbackInfo) {
        class08743 class087432 = class05885.N((class00500)class005002);
        if (class087432 == class08743.field_60923 || class087432 == class08743.field_60925) {
            this.i = true;
        }
    }

    public class05846 method_74255() {
        class05846 class058462 = this.N;
        class05846 class058463 = class058462;
        class058463 = new CallbackInfoReturnable("", true, (Object)class058463);
        this.N((CallbackInfoReturnable)class058463);
        if (class058463.isCancelled()) {
            return (class05846)class058463.getReturnValue();
        }
        return class058462;
    }

    protected float method_18133() {
        return this.field_62632.method_4580((this.L + 1.0f) / 4.0f);
    }

    protected float method_18134() {
        return this.field_62632.method_4580(this.L / 4.0f);
    }

    protected float method_18136() {
        return this.field_62632.method_4570((this.u + 1.0f) / 4.0f);
    }

    public int method_3068(float f) {
        int n = super.method_3068(f);
        if (n == 0 && this.field_3851.E(this.y)) {
            return class03063.N((class07295)this.field_3851, (class07209)this.y);
        }
        return n;
    }

    protected float method_18135() {
        return this.field_62632.method_4570(this.u / 4.0f);
    }
}

