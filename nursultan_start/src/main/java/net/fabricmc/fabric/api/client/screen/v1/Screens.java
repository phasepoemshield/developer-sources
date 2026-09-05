/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01590
 *  minecraft.class05096
 *  minecraft.class06202
 *  minecraft.class06478
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.impl.client.screen.ScreenExtensions
 *  net.fabricmc.fabric.mixin.screen.ScreenAccessor
 */
package net.fabricmc.fabric.api.client.screen.v1;

import java.util.List;
import java.util.Objects;
import minecraft.class01590;
import minecraft.class05096;
import minecraft.class06202;
import minecraft.class06478;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.impl.client.screen.ScreenExtensions;
import net.fabricmc.fabric.mixin.screen.ScreenAccessor;

@Environment(value=EnvType.CLIENT)
public final class Screens {
    private Screens() {
    }

    @Deprecated
    public static class01590 getTextRenderer(class05096 class050962) {
        Objects.requireNonNull(class050962, "Screen cannot be null");
        return class050962.method_64506();
    }

    public static class06202 getClient(class05096 class050962) {
        Objects.requireNonNull(class050962, "Screen cannot be null");
        return ((ScreenAccessor)class050962).getClient();
    }

    public static List<class06478> getButtons(class05096 class050962) {
        Objects.requireNonNull(class050962, "Screen cannot be null");
        return ScreenExtensions.getExtensions((class05096)class050962).fabric_getButtons();
    }
}

