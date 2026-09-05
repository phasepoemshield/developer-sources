/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class04750
 */
package net.caffeinemc.mods.sodium.client.model.color;

import minecraft.class00500;
import minecraft.class04750;
import net.caffeinemc.mods.sodium.client.model.color.ColorProvider;
import net.caffeinemc.mods.sodium.client.model.color.DefaultColorProviders$VanillaAdapter;

public class DefaultColorProviders {
    public static ColorProvider<class00500> adapt(class04750 class047502) {
        return new DefaultColorProviders$VanillaAdapter(class047502);
    }
}

