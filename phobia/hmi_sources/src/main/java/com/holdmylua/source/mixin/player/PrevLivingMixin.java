/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_1268
 *  net.minecraft.class_1309
 *  net.minecraft.class_310
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.Unique
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Constant
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.ModifyConstant
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package com.holdmylua.source.mixin.player;

import com.holdmylua.source.access.LivingEntityAccessor;
import com.holdmylua.source.lua_runtime.LuaScriptCache;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1268;
import net.minecraft.class_1309;
import net.minecraft.class_310;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyConstant;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(value=EnvType.CLIENT)
@Mixin(value={class_1309.class})
public abstract class PrevLivingMixin
implements LivingEntityAccessor {
    @Shadow
    private int field_6279;
    @Shadow
    public float field_6251;
    @Shadow
    public float field_6229;
    @Shadow
    private boolean field_6252;
    @Shadow
    public class_1268 field_6266;
    @Unique
    private int offHandSwingTicks;
    @Unique
    private boolean offHandSwinging;
    @Unique
    public float offHandSwingProgress;
    @Unique
    public float lastOffHandSwingProgress;
    @Unique
    private int mainHandSwingTicks;
    @Unique
    private boolean mainHandSwinging;
    @Unique
    public float mainHandSwingProgress;
    @Unique
    public float lastMainHandSwingProgress;
    private boolean swingMHand = false;
    private boolean swingOHand = false;

    @Shadow
    protected abstract int method_6028();

    @Shadow
    public abstract void method_6104(class_1268 var1);

    @Override
    public float hMI5_0$getMainHandSwingProgress(float tickDelta) {
        float f = this.mainHandSwingProgress - this.lastMainHandSwingProgress;
        if (f < 0.0f) {
            f += 1.0f;
        }
        return this.lastMainHandSwingProgress + f * tickDelta;
    }

    @Override
    public float hMI5_0$getOffHandSwingProgress(float tickDelta) {
        float f = this.offHandSwingProgress - this.lastOffHandSwingProgress;
        if (f < 0.0f) {
            f += 1.0f;
        }
        return this.lastOffHandSwingProgress + f * tickDelta;
    }

    @Override
    public boolean hMI5_0$getMHandEvent() {
        return this.swingMHand;
    }

    @Override
    public boolean hMI5_0$getOHandEvent() {
        return this.swingOHand;
    }

    @Inject(method={"method_6104"}, at={@At(value="HEAD")}, cancellable=true)
    private void onSwingHand(class_1268 hand, CallbackInfo ci) {
        if (hand == class_1268.field_5810) {
            int duration = LuaScriptCache.swingSpeed;
            if (!this.offHandSwinging || this.offHandSwingTicks >= duration / 2) {
                this.offHandSwingTicks = 0;
                this.offHandSwinging = true;
                this.swingOHand = !this.swingOHand;
            }
        } else {
            int duration = LuaScriptCache.swingSpeed;
            if (!this.mainHandSwinging || this.mainHandSwingTicks >= duration / 2) {
                this.mainHandSwingTicks = 0;
                this.mainHandSwinging = true;
                this.swingMHand = !this.swingMHand;
            }
        }
    }

    @Inject(method={"method_6119"}, at={@At(value="HEAD")}, cancellable=true)
    private void onTickHandSwing(CallbackInfo ci) {
        this.lastOffHandSwingProgress = this.offHandSwingProgress;
        int offHandDuration = LuaScriptCache.swingSpeed;
        if (this.offHandSwinging) {
            ++this.offHandSwingTicks;
            if (this.offHandSwingTicks >= offHandDuration) {
                this.offHandSwinging = false;
                this.offHandSwingTicks = 0;
            }
        } else {
            this.offHandSwingTicks = 0;
        }
        this.offHandSwingProgress = (float)this.offHandSwingTicks / (float)offHandDuration;
        this.lastMainHandSwingProgress = this.mainHandSwingProgress;
        int mainHandDuration = LuaScriptCache.swingSpeed;
        if (this.mainHandSwinging) {
            ++this.mainHandSwingTicks;
            if (this.mainHandSwingTicks >= mainHandDuration) {
                this.mainHandSwinging = false;
                this.mainHandSwingTicks = 0;
            }
        } else {
            this.mainHandSwingTicks = 0;
        }
        this.mainHandSwingProgress = (float)this.mainHandSwingTicks / (float)mainHandDuration;
    }

    @ModifyConstant(method={"method_6028()I"}, constant={@Constant(intValue=6)})
    private int modifySwingDuration(int original) {
        if (this == class_310.method_1551().field_1724) {
            return LuaScriptCache.swingSpeed;
        }
        return original;
    }
}

