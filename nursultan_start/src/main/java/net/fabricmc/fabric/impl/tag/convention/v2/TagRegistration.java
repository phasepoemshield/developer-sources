/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00751
 *  minecraft.class00780
 *  minecraft.class00891
 *  minecraft.class01894
 *  minecraft.class03530
 *  minecraft.class04227
 *  minecraft.class04651
 *  minecraft.class04748
 *  minecraft.class05946
 *  minecraft.class06581
 *  minecraft.class07078
 *  minecraft.class07304
 */
package net.fabricmc.fabric.impl.tag.convention.v2;

import minecraft.class00751;
import minecraft.class00780;
import minecraft.class00891;
import minecraft.class01894;
import minecraft.class03530;
import minecraft.class04227;
import minecraft.class04651;
import minecraft.class04748;
import minecraft.class05946;
import minecraft.class06581;
import minecraft.class07078;
import minecraft.class07304;

public record TagRegistration<T>(class05946<class00751<T>> registryKey) {
    public static final TagRegistration<class06581> ITEM_TAG = new TagRegistration(class04227.F);
    public static final TagRegistration<class00891> BLOCK_TAG = new TagRegistration(class04227.Z);
    public static final TagRegistration<class00780> BIOME_TAG = new TagRegistration(class04227.NA);
    public static final TagRegistration<class04748> STRUCTURE_TAG = new TagRegistration(class04227.yj);
    public static final TagRegistration<class04651> FLUID_TAG = new TagRegistration(class04227.e);
    public static final TagRegistration<class07078<?>> ENTITY_TYPE_TAG = new TagRegistration(class04227.I);
    public static final TagRegistration<class07304> ENCHANTMENT_TAG = new TagRegistration(class04227.yR);

    public class03530<T> registerC(String string) {
        return class03530.N(this.registryKey, (class01894)class01894.N((String)"c", (String)string));
    }

    public class03530<T> registerFabric(String string) {
        return class03530.N(this.registryKey, (class01894)class01894.N((String)"fabric", (String)string));
    }
}

