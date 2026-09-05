/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01603
 *  minecraft.class01894
 *  minecraft.class01929
 *  net.fabricmc.fabric.impl.resource.ResourceLoaderImpl
 *  net.fabricmc.fabric.impl.resource.loader.ResourceManagerHelperImpl
 *  net.fabricmc.loader.api.ModContainer
 */
package net.fabricmc.fabric.api.resource;

import java.util.function.Function;
import minecraft.class00392;
import minecraft.class01603;
import minecraft.class01894;
import minecraft.class01929;
import net.fabricmc.fabric.api.resource.IdentifiableResourceReloadListener;
import net.fabricmc.fabric.api.resource.ResourcePackActivationType;
import net.fabricmc.fabric.api.resource.v1.ResourceLoader;
import net.fabricmc.fabric.api.resource.v1.pack.PackActivationType;
import net.fabricmc.fabric.impl.resource.ResourceLoaderImpl;
import net.fabricmc.fabric.impl.resource.loader.ResourceManagerHelperImpl;
import net.fabricmc.loader.api.ModContainer;

@Deprecated
public interface ResourceManagerHelper {
    @Deprecated
    default public void addReloadListener(IdentifiableResourceReloadListener identifiableResourceReloadListener) {
        this.registerReloadListener(identifiableResourceReloadListener);
    }

    public static ResourceManagerHelper get(class01603 class016032) {
        return ResourceManagerHelperImpl.get((class01603)class016032);
    }

    @Deprecated
    public static boolean registerBuiltinResourcePack(class01894 class018942, ModContainer modContainer, class00392 class003922, ResourcePackActivationType resourcePackActivationType) {
        return ResourceLoader.registerBuiltinPack(class018942, modContainer, class003922, resourcePackActivationType.replacement);
    }

    @Deprecated
    public static boolean registerBuiltinResourcePack(class01894 class018942, ModContainer modContainer, String string, ResourcePackActivationType resourcePackActivationType) {
        return ResourceLoader.registerBuiltinPack(class018942, modContainer, (class00392)class00392.y((String)string), resourcePackActivationType.replacement);
    }

    @Deprecated
    public static boolean registerBuiltinResourcePack(class01894 class018942, String string, ModContainer modContainer, boolean bl) {
        return ResourceLoaderImpl.registerBuiltinPack((class01894)class018942, (String)string, (ModContainer)modContainer, (class00392)class00392.y((String)(class018942.y() + "/" + class018942.N())), (PackActivationType)(bl ? PackActivationType.DEFAULT_ENABLED : PackActivationType.NORMAL));
    }

    @Deprecated
    public static boolean registerBuiltinResourcePack(class01894 class018942, ModContainer modContainer, ResourcePackActivationType resourcePackActivationType) {
        return ResourceLoader.registerBuiltinPack(class018942, modContainer, resourcePackActivationType.replacement);
    }

    @Deprecated
    public void registerReloadListener(class01894 var1, Function<class01929, IdentifiableResourceReloadListener> var2);

    @Deprecated
    public void registerReloadListener(IdentifiableResourceReloadListener var1);
}

