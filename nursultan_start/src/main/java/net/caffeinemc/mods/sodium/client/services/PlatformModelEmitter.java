/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class06069
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07295
 *  minecraft.class08887
 *  net.caffeinemc.mods.sodium.client.render.model.MutableQuadViewImpl
 *  net.caffeinemc.mods.sodium.client.services.DefaultModelEmitter
 */
package net.caffeinemc.mods.sodium.client.services;

import java.util.function.Predicate;
import minecraft.class00500;
import minecraft.class06069;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07295;
import minecraft.class08887;
import net.caffeinemc.mods.sodium.client.render.model.MutableQuadViewImpl;
import net.caffeinemc.mods.sodium.client.services.DefaultModelEmitter;
import net.caffeinemc.mods.sodium.client.services.PlatformModelEmitter$Bufferer;
import net.caffeinemc.mods.sodium.client.services.Services;

public interface PlatformModelEmitter {
    public static final PlatformModelEmitter INSTANCE = Services.loadOr(PlatformModelEmitter.class, DefaultModelEmitter::new);

    public static PlatformModelEmitter getInstance() {
        return INSTANCE;
    }

    public void emitModel(class08887 var1, Predicate<class07211> var2, MutableQuadViewImpl var3, class06069 var4, class07295 var5, class07209 var6, class00500 var7, PlatformModelEmitter$Bufferer var8);
}

