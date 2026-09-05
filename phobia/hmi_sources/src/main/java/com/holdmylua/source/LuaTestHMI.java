/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.ModInitializer
 *  net.fabricmc.fabric.api.client.rendering.v1.hud.HudElementRegistry
 *  net.fabricmc.fabric.api.resource.IdentifiableResourceReloadListener
 *  net.fabricmc.fabric.api.resource.ResourceManagerHelper
 *  net.fabricmc.loader.api.FabricLoader
 *  net.minecraft.class_2960
 *  net.minecraft.class_310
 *  net.minecraft.class_3264
 *  org.joml.Matrix4f
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package com.holdmylua.source;

import com.holdmylua.source.global.GlobalsStorage;
import com.holdmylua.source.lua_runtime.resource_controller.LuaAnimationResourceLoader;
import java.util.concurrent.atomic.AtomicInteger;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.hud.HudElementRegistry;
import net.fabricmc.fabric.api.resource.IdentifiableResourceReloadListener;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_3264;
import org.joml.Matrix4f;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LuaTestHMI
implements ModInitializer {
    public static final String MOD_ID = "holdmyitems";
    public static Matrix4f matricesMain = new Matrix4f();
    public static Matrix4f matricesOff = new Matrix4f();
    public static float tickProgress = 0.0f;
    public static final Logger LOGGER = LoggerFactory.getLogger((String)"holdmyitems");
    public static class_310 client = class_310.method_1551();
    public static float prevTime = 0.0f;
    public static float deltaTime = 0.0f;

    public void onInitialize() {
        ClassLoader parentClassLoader = this.getClass().getClassLoader();
        System.out.println("Using parent class loader: " + String.valueOf(parentClassLoader));
        HudElementRegistry.addLast((class_2960)class_2960.method_60655((String)"example", (String)"hud"), (context, tickCounter) -> {
            AtomicInteger y = new AtomicInteger(10);
            GlobalsStorage.debugTextRenderer.get().forEach(str -> {
                context.method_25303(class_310.method_1551().field_1772, str, 10, y.get(), -1);
                y.addAndGet(10);
            });
            GlobalsStorage.debugTextRenderer.clear();
        });
        ResourceManagerHelper.get((class_3264)class_3264.field_14188).registerReloadListener((IdentifiableResourceReloadListener)new LuaAnimationResourceLoader());
        class_2960 packIdentifier = class_2960.method_60655((String)MOD_ID, (String)"pack_test");
        FabricLoader.getInstance().getModContainer(MOD_ID).ifPresent(modContainer -> {});
        LOGGER.info("What you staring at?");
    }
}

