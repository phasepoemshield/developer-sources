/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.gui.image.YACLImageReloadListener
 *  minecraft.class01603
 *  net.fabricmc.api.ClientModInitializer
 *  net.fabricmc.fabric.api.resource.IdentifiableResourceReloadListener
 *  net.fabricmc.fabric.api.resource.ResourceManagerHelper
 */
package dev.isxander.yacl3.platform;

import dev.isxander.yacl3.gui.image.YACLImageReloadListener;
import dev.isxander.yacl3.platform.YACLConfig;
import minecraft.class01603;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.resource.IdentifiableResourceReloadListener;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;

public class PlatformEntrypoint
implements ClientModInitializer {
    public void onInitializeClient() {
        YACLConfig.HANDLER.load();
        ResourceManagerHelper.get((class01603)class01603.field_14188).registerReloadListener((IdentifiableResourceReloadListener)new YACLImageReloadListener());
    }
}

