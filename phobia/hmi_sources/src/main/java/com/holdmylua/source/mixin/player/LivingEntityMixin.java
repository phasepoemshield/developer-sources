/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_1268
 *  net.minecraft.class_1309
 *  net.minecraft.class_1799
 *  net.minecraft.class_310
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.Unique
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package com.holdmylua.source.mixin.player;

import com.holdmylua.source.access.LivingEntityAccessor;
import com.holdmylua.source.global.GlobalsStorage;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1268;
import net.minecraft.class_1309;
import net.minecraft.class_1799;
import net.minecraft.class_310;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(value=EnvType.CLIENT)
@Mixin(value={class_1309.class})
public abstract class LivingEntityMixin
implements LivingEntityAccessor {
    private boolean interactOffhand = false;
    private boolean interactMainHand = false;
    private boolean blockBreaking = false;
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
    private int mainSwingCount = 0;
    @Unique
    private boolean swingMHand = false;
    @Unique
    private boolean swingOHand = false;

    @Shadow
    protected abstract int method_6028();

    @Shadow
    public abstract class_1799 method_6047();

    @Shadow
    public abstract class_1799 method_6079();

    @Override
    public int hMI5_0$getSwingCount() {
        return this.mainSwingCount;
    }

    @Override
    public void hMI5_0$resetOffHandSwing(boolean interact) {
        this.offHandSwingTicks = 0;
        this.offHandSwinging = true;
        this.swingOHand = !this.swingOHand;
        this.interactOffhand = interact;
    }

    @Override
    public void hMI5_0$resetMainHandSwing(boolean interact) {
        this.mainHandSwingTicks = 0;
        this.mainHandSwinging = true;
        this.swingMHand = !this.swingMHand;
        ++this.mainSwingCount;
        this.interactMainHand = interact;
        if (class_310.method_1551().field_1761.method_2923()) {
            this.blockBreaking = true;
        }
    }

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
    public boolean hMI5_0$getMInteract() {
        return this.interactMainHand;
    }

    @Override
    public boolean hMI5_0$getOInteract() {
        return this.interactOffhand;
    }

    @Override
    public boolean hMI5_0$getBlockBreak() {
        return this.blockBreaking;
    }

    @Override
    public boolean hMI5_0$getMHandEvent() {
        return this.swingMHand;
    }

    @Override
    public boolean hMI5_0$getOHandEvent() {
        return this.swingOHand;
    }

    @Inject(method={"method_5670"}, at={@At(value="HEAD")})
    private void tick(CallbackInfo ci) {
        this.lastOffHandSwingProgress = this.offHandSwingProgress;
        this.lastMainHandSwingProgress = this.mainHandSwingProgress;
        int i = GlobalsStorage.itemSwingSpeed.getOrDefault(this.method_6047().method_7909().toString(), 10);
        if (this.mainHandSwinging) {
            ++this.mainHandSwingTicks;
            if (this.mainHandSwingTicks >= i) {
                this.mainHandSwingTicks = 0;
                this.mainHandSwinging = false;
            }
        } else {
            if (this.interactMainHand) {
                this.interactMainHand = false;
            }
            if (this.blockBreaking) {
                this.blockBreaking = false;
            }
            this.mainHandSwingTicks = 0;
        }
        this.mainHandSwingProgress = (float)this.mainHandSwingTicks / (float)i;
        int i2 = GlobalsStorage.itemSwingSpeed.getOrDefault(this.method_6079().method_7909().toString(), 10);
        if (this.offHandSwinging) {
            ++this.offHandSwingTicks;
            if (this.offHandSwingTicks >= i2) {
                this.offHandSwingTicks = 0;
                this.offHandSwinging = false;
            }
        } else {
            if (this.interactOffhand) {
                this.interactOffhand = false;
            }
            this.offHandSwingTicks = 0;
        }
        this.offHandSwingProgress = (float)this.offHandSwingTicks / (float)i2;
    }

    @Inject(method={"method_23667(Lnet/minecraft/class_1268;Z)V"}, at={@At(value="HEAD")})
    private void onSwingHand(class_1268 hand, boolean fromServerPlayer, CallbackInfo ci) {
        if (hand == class_1268.field_5810) {
            int duration = GlobalsStorage.itemSwingSpeed.getOrDefault(this.method_6079().method_7909().toString(), 10);
            if (!this.offHandSwinging || this.offHandSwingTicks >= duration / 2 || this.offHandSwingTicks < 0) {
                this.offHandSwingTicks = -1;
                this.offHandSwinging = true;
            }
        } else {
            int duration = GlobalsStorage.itemSwingSpeed.getOrDefault(this.method_6047().method_7909().toString(), 10);
            if (!this.mainHandSwinging || this.mainHandSwingTicks >= duration / 2 || this.mainHandSwingTicks < 0) {
                this.mainHandSwingTicks = -1;
                this.mainHandSwinging = true;
                if (class_310.method_1551().field_1761.method_2923()) {
                    this.blockBreaking = true;
                }
            }
        }
    }
}

