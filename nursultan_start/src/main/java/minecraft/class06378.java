/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01381
 *  minecraft.class05908
 */
package minecraft;

import minecraft.class01381;
import minecraft.class05908;
import minecraft.class06341;

public interface class06378
extends class01381 {
    public float y(class05908 var1);

    default public int N(class05908 class059082) {
        return Math.round(this.y(class059082));
    }

    public class06341 N();
}

