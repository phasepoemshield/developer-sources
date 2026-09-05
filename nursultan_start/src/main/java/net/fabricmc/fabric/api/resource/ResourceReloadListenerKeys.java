/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 */
package net.fabricmc.fabric.api.resource;

import minecraft.class01894;
import net.fabricmc.fabric.api.resource.v1.reloader.ResourceReloaderKeys$Client;
import net.fabricmc.fabric.api.resource.v1.reloader.ResourceReloaderKeys$Server;

@Deprecated
public final class ResourceReloadListenerKeys {
    public static final class01894 SOUNDS = ResourceReloaderKeys$Client.SOUNDS;
    public static final class01894 FONTS = ResourceReloaderKeys$Client.FONTS;
    public static final class01894 MODELS = ResourceReloaderKeys$Client.MODELS;
    public static final class01894 LANGUAGES = ResourceReloaderKeys$Client.LANGUAGES;
    public static final class01894 TEXTURES = ResourceReloaderKeys$Client.TEXTURES;
    public static final class01894 RECIPES = ResourceReloaderKeys$Server.RECIPES;
    public static final class01894 ADVANCEMENTS = ResourceReloaderKeys$Server.ADVANCEMENTS;
    public static final class01894 FUNCTIONS = ResourceReloaderKeys$Server.FUNCTIONS;

    private ResourceReloadListenerKeys() {
    }
}

