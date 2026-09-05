/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01073
 *  minecraft.class01089
 *  minecraft.class01248
 *  minecraft.class01929
 *  minecraft.class03767
 *  minecraft.class06141
 *  net.fabricmc.fabric.api.resource.v1.DataResourceLoader
 */
package net.fabricmc.fabric.impl.resource;

import minecraft.class01073;
import minecraft.class01089;
import minecraft.class01248;
import minecraft.class01929;
import minecraft.class03767;
import minecraft.class06141;
import net.fabricmc.fabric.api.resource.v1.DataResourceLoader;
import net.fabricmc.fabric.impl.resource.FabricDataResourceStoreHolder;

public record SetupMarkerResourceReloader(class01248 dataPackContents, class01929 registries, class03767 featureSet) implements class06141
{
    public void method_14491(class01089 class010892) {
    }

    public void prepareSharedState(class01073 class010732) {
        class010732.N(DataResourceLoader.RELOADER_REGISTRY_LOOKUP_KEY, (Object)this.registries);
        class010732.N(DataResourceLoader.RELOADER_FEATURE_SET_KEY, (Object)this.featureSet);
        class010732.N(DataResourceLoader.ADVANCEMENT_LOADER_KEY, (Object)this.dataPackContents.i());
        class010732.N(DataResourceLoader.RECIPE_MANAGER_KEY, (Object)this.dataPackContents.L());
        class010732.N(DataResourceLoader.DATA_RESOURCE_STORE_KEY, (Object)((FabricDataResourceStoreHolder)this.dataPackContents).fabric$getDataResourceStore());
    }
}

