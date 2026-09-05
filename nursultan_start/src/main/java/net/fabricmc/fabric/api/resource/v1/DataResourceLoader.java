/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01081
 *  minecraft.class01092
 *  minecraft.class01894
 *  minecraft.class01929
 *  minecraft.class04478
 *  minecraft.class06482
 *  net.fabricmc.fabric.impl.resource.DataResourceLoaderImpl
 */
package net.fabricmc.fabric.api.resource.v1;

import java.util.function.Function;
import minecraft.class01081;
import minecraft.class01092;
import minecraft.class01894;
import minecraft.class01929;
import minecraft.class04478;
import minecraft.class06482;
import net.fabricmc.fabric.api.resource.v1.DataResourceStore$Mutable;
import net.fabricmc.fabric.api.resource.v1.ResourceLoader;
import net.fabricmc.fabric.impl.resource.DataResourceLoaderImpl;

public interface DataResourceLoader
extends ResourceLoader {
    public static final class01092<class06482> RECIPE_MANAGER_KEY = new class01092();
    public static final class01092<class04478> ADVANCEMENT_LOADER_KEY = new class01092();
    public static final class01092<DataResourceStore.Mutable> DATA_RESOURCE_STORE_KEY = new class01092();

    public static DataResourceLoader get() {
        return DataResourceLoaderImpl.INSTANCE;
    }

    public void registerReloader(class01894 var1, Function<class01929, class01081> var2);
}

