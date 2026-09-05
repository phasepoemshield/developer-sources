/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07211
 *  minecraft.class08877
 *  net.caffeinemc.mods.sodium.client.render.model.MutableQuadViewImpl
 */
package net.caffeinemc.mods.sodium.client.services;

import java.util.function.Consumer;
import java.util.function.Predicate;
import minecraft.class07211;
import minecraft.class08877;
import net.caffeinemc.mods.sodium.client.render.model.MutableQuadViewImpl;

@FunctionalInterface
public interface PlatformModelEmitter$Bufferer {
    public void emit(class08877 var1, Predicate<class07211> var2, Consumer<MutableQuadViewImpl> var3);
}

