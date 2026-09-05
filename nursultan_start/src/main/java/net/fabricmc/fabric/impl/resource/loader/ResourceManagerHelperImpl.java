/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01081
 *  minecraft.class01603
 *  minecraft.class01894
 *  minecraft.class01929
 *  net.fabricmc.fabric.api.resource.IdentifiableResourceReloadListener
 *  net.fabricmc.fabric.api.resource.ResourceManagerHelper
 *  net.fabricmc.fabric.api.resource.v1.ResourceLoader
 */
package net.fabricmc.fabric.impl.resource.loader;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import minecraft.class01081;
import minecraft.class01603;
import minecraft.class01894;
import minecraft.class01929;
import net.fabricmc.fabric.api.resource.IdentifiableResourceReloadListener;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.fabric.api.resource.v1.ResourceLoader;
import net.fabricmc.fabric.impl.resource.loader.ResourceManagerHelperImpl$1;

public class ResourceManagerHelperImpl
implements ResourceManagerHelper {
    private static final Map<class01603, ResourceManagerHelperImpl> registryMap = new HashMap<class01603, ResourceManagerHelperImpl>();
    private final ResourceLoader resourceLoader;

    private ResourceManagerHelperImpl(class01603 class016032) {
        this.resourceLoader = ResourceLoader.get((class01603)class016032);
    }

    public static ResourceManagerHelperImpl get(class01603 class016032) {
        return (ResourceManagerHelperImpl)registryMap.computeIfAbsent(class016032, ResourceManagerHelperImpl::new);
    }

    public void registerReloadListener(class01894 class018942, Function<class01929, IdentifiableResourceReloadListener> function) {
        this.resourceLoader.registerReloader(class018942, (class01081)new ResourceManagerHelperImpl$1(this, function));
    }

    public void registerReloadListener(IdentifiableResourceReloadListener identifiableResourceReloadListener) {
        this.resourceLoader.registerReloader(identifiableResourceReloadListener.getFabricId(), (class01081)identifiableResourceReloadListener);
        identifiableResourceReloadListener.getFabricDependencies().forEach(class018942 -> this.resourceLoader.addReloaderOrdering(class018942, identifiableResourceReloadListener.getFabricId()));
    }
}

