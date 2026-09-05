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

import minecraft.class04453;
import minecraft.class06584;
import minecraft.class07085;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(value=EnvType.CLIENT)
public interface ArmorAccessor {
    default public void initialize(class04453 class044532) {
    }

    public class06584 getArmorPiece(class04453 var1, class07085 var2);
}

