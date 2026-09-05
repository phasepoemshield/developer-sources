/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04690
 *  minecraft.class05237
 *  minecraft.class05247
 *  minecraft.class05272
 */
package com.viaversion.viafabricplus.features.font;

import com.viaversion.viafabricplus.features.font.BuiltinEmptyGlyph1_12_2$1;
import minecraft.class04690;
import minecraft.class05237;
import minecraft.class05247;
import minecraft.class05272;

public enum BuiltinEmptyGlyph1_12_2 implements class05247
{
    INSTANCE;

    private static final int WIDTH = 0;
    private static final int HEIGHT = 8;

    public float getAdvance() {
        return 0.0f;
    }

    public class05272 bake(class04690 class046902) {
        return class046902.N((class05247)this, (class05237)new BuiltinEmptyGlyph1_12_2$1(this));
    }
}

