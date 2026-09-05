/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04453
 *  minecraft.class06584
 *  minecraft.class07085
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package com.armorhud.armor;

import com.armorhud.armor.ArmorAccessor;
import minecraft.class04453;
import minecraft.class06584;
import minecraft.class07085;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(value=EnvType.CLIENT)
public class VanillaArmorAccessor
implements ArmorAccessor {
    @Override
    public class06584 getArmorPiece(class04453 class044532, class07085 class070852) {
        if (!class070852.i()) {
            throw new IllegalArgumentException("Invalid slot type: " + String.valueOf(class070852));
        }
        return class044532.method_6118(class070852);
    }
}

