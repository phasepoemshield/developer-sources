/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00667
 *  minecraft.class01659
 *  minecraft.class01666
 *  minecraft.class01668
 *  minecraft.class02362
 *  minecraft.class04247
 *  net.fabricmc.fabric.impl.networking.PayloadTypeRegistryImpl
 */
package net.fabricmc.fabric.api.networking.v1;

import minecraft.class00667;
import minecraft.class01659;
import minecraft.class01666;
import minecraft.class01668;
import minecraft.class02362;
import minecraft.class04247;
import net.fabricmc.fabric.impl.networking.PayloadTypeRegistryImpl;

public interface PayloadTypeRegistry<B extends class00667> {
    public <T extends class01659> class01668<? super B, T> register(class01666<T> var1, class02362<? super B, T> var2);

    public <T extends class01659> class01668<? super B, T> registerLarge(class01666<T> var1, class02362<? super B, T> var2, int var3);

    public static PayloadTypeRegistry<class00667> configurationS2C() {
        return PayloadTypeRegistryImpl.CONFIGURATION_S2C;
    }

    public static PayloadTypeRegistry<class00667> configurationC2S() {
        return PayloadTypeRegistryImpl.CONFIGURATION_C2S;
    }

    public static PayloadTypeRegistry<class04247> playC2S() {
        return PayloadTypeRegistryImpl.PLAY_C2S;
    }

    public static PayloadTypeRegistry<class04247> playS2C() {
        return PayloadTypeRegistryImpl.PLAY_S2C;
    }
}

