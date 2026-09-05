/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  com.terraformersmc.modmenu.api.ConfigScreenFactory
 *  com.terraformersmc.modmenu.api.ModMenuApi
 *  me.shedaniel.autoconfig.AutoConfigClient
 *  me.shedaniel.autoconfig.example.ExampleConfig
 *  me.shedaniel.clothconfig2.ClothConfigDemo
 *  me.shedaniel.clothconfig2.api.Modifier
 *  minecraft.class05096
 */
package me.shedaniel.clothconfig2.fabric;

import com.mojang.blaze3d.systems.RenderSystem;
import com.terraformersmc.modmenu.api.ConfigScreenFactory;
import com.terraformersmc.modmenu.api.ModMenuApi;
import me.shedaniel.autoconfig.AutoConfigClient;
import me.shedaniel.autoconfig.example.ExampleConfig;
import me.shedaniel.clothconfig2.ClothConfigDemo;
import me.shedaniel.clothconfig2.api.Modifier;
import minecraft.class05096;

public class ClothConfigModMenuDemo
implements ModMenuApi {
    public ConfigScreenFactory<?> getModConfigScreenFactory() {
        return class050962 -> {
            if (RenderSystem.isOnRenderThread() && Modifier.current().hasShift()) {
                return (class05096)AutoConfigClient.getConfigScreen(ExampleConfig.class, (class05096)class050962).get();
            }
            return ClothConfigDemo.getConfigBuilderWithDemo().setParentScreen(class050962).build();
        };
    }
}

