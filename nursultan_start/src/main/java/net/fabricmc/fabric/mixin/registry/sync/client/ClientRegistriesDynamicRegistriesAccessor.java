/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00751
 *  minecraft.class02017
 *  minecraft.class05946
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package net.fabricmc.fabric.mixin.registry.sync.client;

import java.util.List;
import java.util.Map;
import minecraft.class00751;
import minecraft.class02017;
import minecraft.class05946;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(value=EnvType.CLIENT)
public interface ClientRegistriesDynamicRegistriesAccessor {
    public Map<class05946<? extends class00751<?>>, List<class02017>> getDynamicRegistries();
}

