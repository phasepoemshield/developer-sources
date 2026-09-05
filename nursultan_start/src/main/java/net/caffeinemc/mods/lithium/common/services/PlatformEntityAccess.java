/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00734
 *  minecraft.class07049
 *  minecraft.class07299
 */
package net.caffeinemc.mods.lithium.common.services;

import java.util.ArrayList;
import java.util.function.Predicate;
import minecraft.class00734;
import minecraft.class07049;
import minecraft.class07299;
import net.caffeinemc.mods.lithium.common.services.Services;

public interface PlatformEntityAccess {
    public static final PlatformEntityAccess INSTANCE = Services.load(PlatformEntityAccess.class);

    public void addEnderDragonParts(class07299 var1, class07049 var2, class00734 var3, Predicate<? super class07049> var4, ArrayList<class07049> var5);
}

