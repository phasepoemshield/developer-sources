/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  me.shedaniel.autoconfig.AutoConfigClient
 *  me.shedaniel.autoconfig.example.ExampleConfig
 *  me.shedaniel.clothconfig2.ClothConfigDemo
 *  me.shedaniel.clothconfig2.api.Modifier
 *  minecraft.class05096
 *  net.fabricmc.loader.api.ModContainer
 */
package me.shedaniel.clothconfig2.fabric;

import com.mojang.blaze3d.systems.RenderSystem;
import me.shedaniel.autoconfig.AutoConfigClient;
import me.shedaniel.autoconfig.example.ExampleConfig;
import me.shedaniel.clothconfig2.ClothConfigDemo;
import me.shedaniel.clothconfig2.api.Modifier;
import minecraft.class05096;
import net.fabricmc.loader.api.ModContainer;

public class ClothConfigCatalogueDemo {
    public static class05096 createConfigScreen(class05096 class050962, ModContainer modContainer) {
        if (RenderSystem.isOnRenderThread() && Modifier.current().hasShift()) {
            return (class05096)AutoConfigClient.getConfigScreen(ExampleConfig.class, (class05096)class050962).get();
        }
        return ClothConfigDemo.getConfigBuilderWithDemo().setParentScreen(class050962).build();
    }
}

