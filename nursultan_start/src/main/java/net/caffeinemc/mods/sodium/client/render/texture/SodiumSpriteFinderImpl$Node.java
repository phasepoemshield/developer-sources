/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class08388
 *  org.jspecify.annotations.Nullable
 */
package net.caffeinemc.mods.sodium.client.render.texture;

import minecraft.class08388;
import net.caffeinemc.mods.sodium.client.render.texture.SodiumSpriteFinderImpl;
import org.jspecify.annotations.Nullable;

class SodiumSpriteFinderImpl$Node {
    final float midU;
    final float midV;
    final float cellRadius;
    @Nullable Object lowLow = null;
    @Nullable Object lowHigh = null;
    @Nullable Object highLow = null;
    @Nullable Object highHigh = null;
    static final float EPS = 1.0E-5f;
    final /* synthetic */ SodiumSpriteFinderImpl this$0;

    SodiumSpriteFinderImpl$Node(SodiumSpriteFinderImpl sodiumSpriteFinderImpl, float f, float f2, float f3) {
        this.this$0 = sodiumSpriteFinderImpl;
        this.midU = f;
        this.midV = f2;
        this.cellRadius = f3;
    }

    void add(class08388 class083882) {
        boolean bl;
        if (class083882.method_4594() < -1.0E-5f || class083882.method_4577() > 1.00001f || class083882.method_4593() < -1.0E-5f || class083882.method_4575() > 1.00001f) {
            if (this.this$0.badSpriteCount++ < 5) {
                String string = "SpriteFinderImpl: Skipping sprite {} with broken bounds [{}, {}]x[{}, {}]. Sprite bounds should be between 0 and 1.";
                SodiumSpriteFinderImpl.LOGGER.error(string, new Object[]{class083882.method_45851().method_45816(), Float.valueOf(class083882.method_4594()), Float.valueOf(class083882.method_4577()), Float.valueOf(class083882.method_4593()), Float.valueOf(class083882.method_4575())});
            }
            return;
        }
        boolean bl2 = class083882.method_4594() < this.midU - 1.0E-5f;
        boolean bl3 = class083882.method_4577() > this.midU + 1.0E-5f;
        boolean bl4 = class083882.method_4593() < this.midV - 1.0E-5f;
        boolean bl5 = bl = class083882.method_4575() > this.midV + 1.0E-5f;
        if (bl2 && bl4) {
            this.lowLow = this.addInner(class083882, this.lowLow, -1, -1);
        }
        if (bl2 && bl) {
            this.lowHigh = this.addInner(class083882, this.lowHigh, -1, 1);
        }
        if (bl3 && bl4) {
            this.highLow = this.addInner(class083882, this.highLow, 1, -1);
        }
        if (bl3 && bl) {
            this.highHigh = this.addInner(class083882, this.highHigh, 1, 1);
        }
    }

    class08388 find(float f, float f2) {
        if (f < this.midU) {
            return f2 < this.midV ? this.findInner(this.lowLow, f, f2) : this.findInner(this.lowHigh, f, f2);
        }
        return f2 < this.midV ? this.findInner(this.highLow, f, f2) : this.findInner(this.highHigh, f, f2);
    }

    private Object addInner(class08388 class083882, @Nullable Object object, int n, int n2) {
        if (object == null) {
            return class083882;
        }
        if (object instanceof SodiumSpriteFinderImpl$Node) {
            SodiumSpriteFinderImpl$Node sodiumSpriteFinderImpl$Node = (SodiumSpriteFinderImpl$Node)object;
            sodiumSpriteFinderImpl$Node.add(class083882);
            return object;
        }
        SodiumSpriteFinderImpl$Node sodiumSpriteFinderImpl$Node = new SodiumSpriteFinderImpl$Node(this.this$0, this.midU + this.cellRadius * (float)n, this.midV + this.cellRadius * (float)n2, this.cellRadius * 0.5f);
        if (object instanceof class08388) {
            class08388 class083883 = (class08388)object;
            sodiumSpriteFinderImpl$Node.add(class083883);
        }
        sodiumSpriteFinderImpl$Node.add(class083882);
        return sodiumSpriteFinderImpl$Node;
    }

    private class08388 findInner(@Nullable Object object, float f, float f2) {
        if (object instanceof SodiumSpriteFinderImpl$Node) {
            SodiumSpriteFinderImpl$Node sodiumSpriteFinderImpl$Node = (SodiumSpriteFinderImpl$Node)object;
            return sodiumSpriteFinderImpl$Node.find(f, f2);
        }
        if (object instanceof class08388) {
            class08388 class083882 = (class08388)object;
            return class083882;
        }
        return this.this$0.missingSprite;
    }
}

