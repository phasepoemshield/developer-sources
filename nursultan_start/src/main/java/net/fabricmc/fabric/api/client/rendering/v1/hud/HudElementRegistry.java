/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.impl.client.rendering.hud.HudElementRegistryImpl
 */
package net.fabricmc.fabric.api.client.rendering.v1.hud;

import java.util.Objects;
import java.util.function.Function;
import minecraft.class01894;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.hud.HudElement;
import net.fabricmc.fabric.impl.client.rendering.hud.HudElementRegistryImpl;

@Environment(value=EnvType.CLIENT)
public interface HudElementRegistry {
    public static void addFirst(class01894 class018942, HudElement hudElement) {
        Objects.requireNonNull(class018942, "identifier");
        Objects.requireNonNull(hudElement, "hudElement");
        HudElementRegistryImpl.addFirst((class01894)class018942, (HudElement)hudElement);
    }

    public static void addLast(class01894 class018942, HudElement hudElement) {
        Objects.requireNonNull(class018942, "identifier");
        Objects.requireNonNull(hudElement, "hudElement");
        HudElementRegistryImpl.addLast((class01894)class018942, (HudElement)hudElement);
    }

    public static void attachElementAfter(class01894 class018942, class01894 class018943, HudElement hudElement) {
        Objects.requireNonNull(class018942, "afterThis");
        Objects.requireNonNull(class018943, "identifier");
        Objects.requireNonNull(hudElement, "hudElement");
        HudElementRegistryImpl.attachElementAfter((class01894)class018942, (class01894)class018943, (HudElement)hudElement);
    }

    public static void removeElement(class01894 class018942) {
        Objects.requireNonNull(class018942, "identifier");
        HudElementRegistryImpl.removeElement((class01894)class018942);
    }

    public static void attachElementBefore(class01894 class018942, class01894 class018943, HudElement hudElement) {
        Objects.requireNonNull(class018942, "beforeThis");
        Objects.requireNonNull(class018943, "identifier");
        Objects.requireNonNull(hudElement, "hudElement");
        HudElementRegistryImpl.attachElementBefore((class01894)class018942, (class01894)class018943, (HudElement)hudElement);
    }

    public static void replaceElement(class01894 class018942, Function<HudElement, HudElement> function) {
        Objects.requireNonNull(class018942, "identifier");
        Objects.requireNonNull(function, "replacer");
        HudElementRegistryImpl.replaceElement((class01894)class018942, function);
    }
}

