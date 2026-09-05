/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00994
 *  minecraft.class01383
 *  minecraft.class03869
 *  minecraft.class04410
 *  minecraft.class05363
 */
package minecraft;

import minecraft.class00962;
import minecraft.class00972;
import minecraft.class00983;
import minecraft.class00994;
import minecraft.class01383;
import minecraft.class03869;
import minecraft.class04410;
import minecraft.class05363;

public class class00961
extends class00962<class03869> {
    public class00961(class04410 class044102) {
        super(class044102);
    }

    @Override
    public class00972 N(class01383 class013832, class05363 class053632, float f) {
        return new class00983(this.y.stream().map(class038692 -> class00994.N((class03869)class038692, (class05363)class053632, (float)f)).toList());
    }
}

