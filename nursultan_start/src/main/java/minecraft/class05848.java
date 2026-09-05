/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00965
 *  minecraft.class02566
 *  minecraft.class03448
 *  minecraft.class04406
 *  minecraft.class04995
 *  minecraft.class05363
 *  minecraft.class06143
 *  minecraft.class06166
 *  minecraft.class06889
 *  minecraft.class08388
 *  net.caffeinemc.mods.sodium.api.texture.SpriteUtil
 *  org.joml.Quaternionf
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import minecraft.class00965;
import minecraft.class02566;
import minecraft.class03448;
import minecraft.class04406;
import minecraft.class04995;
import minecraft.class05363;
import minecraft.class05846;
import minecraft.class05863;
import minecraft.class06143;
import minecraft.class06166;
import minecraft.class06889;
import minecraft.class08388;
import net.caffeinemc.mods.sodium.api.texture.SpriteUtil;
import org.joml.Quaternionf;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public abstract class class05848
extends class04406 {
    protected float field_17867;
    protected float field_62633 = 1.0f;
    protected float field_62634 = 1.0f;
    protected float field_62635 = 1.0f;
    protected float field_62636 = 1.0f;
    protected float field_62637;
    protected float field_62638;
    protected class08388 field_62632;
    private boolean shouldTickSprite;

    public class05848(class03448 class034482, double d, double d2, double d3, class08388 class083882) {
        super(class034482, d, d2, d3);
        this.field_62632 = class083882;
        this.field_17867 = 0.1f * (this.field_3840.z() * 0.5f + 0.5f) * 2.0f;
    }

    protected class05848(class03448 class034482, double d, double d2, double d3, double d4, double d5, double d6, class08388 class083882) {
        super(class034482, d, d2, d3, d4, d5, d6);
        this.field_62632 = class083882;
        this.field_17867 = 0.1f * (this.field_3840.z() * 0.5f + 0.5f) * 2.0f;
    }

    public String toString() {
        return ((Object)((Object)this)).getClass().getSimpleName() + ", Pos (" + this.field_3874 + "," + this.field_3854 + "," + this.field_3871 + "), RGBA (" + this.field_62633 + "," + this.field_62634 + "," + this.field_62635 + "," + this.field_62636 + "), Age " + this.field_3866;
    }

    public class04406 method_3087(float f) {
        this.field_17867 *= f;
        return super.method_3087(f);
    }

    protected abstract class05846 method_74255();

    public void method_3074(class00965 class009652, class05363 class053632, float f) {
        Quaternionf quaternionf = new Quaternionf();
        this.method_55245().setRotation(quaternionf, class053632, f);
        if (this.field_62637 != 0.0f) {
            quaternionf.rotateZ(class04995.B((float)f, (float)this.field_62638, (float)this.field_62637));
        }
        this.method_60373(class009652, class053632, quaternionf, f);
    }

    protected void method_60375(class00965 class009652, Quaternionf quaternionf, float f, float f2, float f3, float f4) {
        this.handler$cml000$sodium$tickSprite(class009652, quaternionf, f, f2, f3, f4, null);
        class009652.N(this.method_74255(), f, f2, f3, quaternionf.x, quaternionf.y, quaternionf.z, quaternionf.w, this.method_18132(f4), this.method_18133(), this.method_18134(), this.method_18135(), this.method_18136(), class02566.N((float)this.field_62636, (float)this.field_62633, (float)this.field_62634, (float)this.field_62635), this.method_3068(f4));
    }

    protected float method_18133() {
        return this.field_62632.method_4594();
    }

    public class05863 method_55245() {
        return class05863.N;
    }

    protected float method_18134() {
        return this.field_62632.method_4577();
    }

    public void method_74306(class06143 class061432) {
        if (!this.field_3843) {
            this.method_74307(class061432.method_18138(this.field_3866, this.field_3847));
        }
    }

    protected void method_74307(class08388 class083882) {
        this.field_62632 = class083882;
        this.handler$cml000$sodium$afterSetSprite(class083882, null);
    }

    protected float method_18136() {
        return this.field_62632.method_4575();
    }

    public void method_74308(float f) {
        this.field_62636 = f;
    }

    public void method_60373(class00965 class009652, class05363 class053632, Quaternionf quaternionf, float f) {
        class06889 class068892 = class053632.y();
        float f2 = (float)(class04995.u((double)f, (double)this.field_3858, (double)this.field_3874) - class068892.N());
        float f3 = (float)(class04995.u((double)f, (double)this.field_3838, (double)this.field_3854) - class068892.y());
        float f4 = (float)(class04995.u((double)f, (double)this.field_3856, (double)this.field_3871) - class068892.L());
        this.method_60375(class009652, quaternionf, f2, f3, f4, f);
    }

    public void method_74305(float f, float f2, float f3) {
        this.field_62633 = f;
        this.field_62634 = f2;
        this.field_62635 = f3;
    }

    protected float method_18135() {
        return this.field_62632.method_4593();
    }

    public class06166 method_74274() {
        return class06166.N;
    }

    public float method_18132(float f) {
        return this.field_17867;
    }

    private void handler$cml000$sodium$afterSetSprite(class08388 class083882, CallbackInfo callbackInfo) {
        this.shouldTickSprite = class083882 != null && SpriteUtil.INSTANCE.hasAnimation(class083882);
    }

    private void handler$cml000$sodium$tickSprite(class00965 class009652, Quaternionf quaternionf, float f, float f2, float f3, float f4, CallbackInfo callbackInfo) {
        if (this.shouldTickSprite) {
            SpriteUtil.INSTANCE.markSpriteActive(this.field_62632);
        }
    }
}

