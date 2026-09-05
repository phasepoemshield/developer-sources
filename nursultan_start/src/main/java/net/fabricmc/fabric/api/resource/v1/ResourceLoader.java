/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01081
 *  minecraft.class01092
 *  minecraft.class01603
 *  minecraft.class01894
 *  minecraft.class01929
 *  minecraft.class03767
 *  net.fabricmc.fabric.impl.resource.ResourceLoaderImpl
 *  net.fabricmc.loader.api.ModContainer
 */
package net.fabricmc.fabric.api.resource.v1;

import minecraft.class00392;
import minecraft.class01081;
import minecraft.class01092;
import minecraft.class01603;
import minecraft.class01894;
import minecraft.class01929;
import minecraft.class03767;
import net.fabricmc.fabric.api.resource.v1.pack.PackActivationType;
import net.fabricmc.fabric.impl.resource.ResourceLoaderImpl;
import net.fabricmc.loader.api.ModContainer;

public interface ResourceLoader {
    public static final class01092<class01929> RELOADER_REGISTRY_LOOKUP_KEY = new class01092();
    public static final class01092<class03767> RELOADER_FEATURE_SET_KEY = new class01092();

    public static ResourceLoader get(class01603 class016032) {
        return ResourceLoaderImpl.get((class01603)class016032);
    }

    public static boolean registerBuiltinPack(class01894 class018942, ModContainer modContainer, PackActivationType packActivationType) {
        return ResourceLoaderImpl.registerBuiltinPack((class01894)class018942, (String)("resourcepacks/" + class018942.N()), (ModContainer)modContainer, (PackActivationType)packActivationType);
    }

    public static boolean registerBuiltinPack(class01894 class018942, ModContainer modContainer, class00392 class003922, PackActivationType packActivationType) {
        return ResourceLoaderImpl.registerBuiltinPack((class01894)class018942, (String)("resourcepacks/" + class018942.N()), (ModContainer)modContainer, (class00392)class003922, (PackActivationType)packActivationType);
    }

    public void addReloaderOrdering(class01894 var1, class01894 var2);

    public void registerReloader(class01894 var1, class01081 var2);
}

