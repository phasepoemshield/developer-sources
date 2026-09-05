/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.impl.client.rendering.hud.HudStatusBarHeightRegistryImpl
 */
package net.fabricmc.fabric.api.client.rendering.v1.hud;

import java.util.Objects;
import minecraft.class01894;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.hud.StatusBarHeightProvider;
import net.fabricmc.fabric.impl.client.rendering.hud.HudStatusBarHeightRegistryImpl;

@Environment(value=EnvType.CLIENT)
public final class HudStatusBarHeightRegistry {
    private HudStatusBarHeightRegistry() {
    }

    public static void addRight(class01894 class018942, StatusBarHeightProvider statusBarHeightProvider) {
        Objects.requireNonNull(class018942, "id is null");
        Objects.requireNonNull(statusBarHeightProvider, "height provider is null");
        HudStatusBarHeightRegistryImpl.addRight((class01894)class018942, (StatusBarHeightProvider)statusBarHeightProvider);
    }

    public static void addLeft(class01894 class018942, StatusBarHeightProvider statusBarHeightProvider) {
        Objects.requireNonNull(class018942, "id is null");
        Objects.requireNonNull(statusBarHeightProvider, "height provider is null");
        HudStatusBarHeightRegistryImpl.addLeft((class01894)class018942, (StatusBarHeightProvider)statusBarHeightProvider);
    }

    public static int getHeight(class01894 class018942) {
        Objects.requireNonNull(class018942, "id is null");
        return HudStatusBarHeightRegistryImpl.getHeight((class01894)class018942);
    }
}

