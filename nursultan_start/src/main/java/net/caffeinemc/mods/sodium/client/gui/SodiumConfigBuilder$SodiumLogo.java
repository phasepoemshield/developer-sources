/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01089
 *  minecraft.class06846
 *  minecraft.class08280
 *  minecraft.class08354
 *  minecraft.class08361
 *  minecraft.class08500
 */
package net.caffeinemc.mods.sodium.client.gui;

import java.io.IOException;
import java.io.InputStream;
import minecraft.class01089;
import minecraft.class06846;
import minecraft.class08280;
import minecraft.class08354;
import minecraft.class08361;
import minecraft.class08500;
import net.caffeinemc.mods.sodium.client.gui.SodiumConfigBuilder;

class SodiumConfigBuilder$SodiumLogo
extends class08361 {
    public SodiumConfigBuilder$SodiumLogo() {
        super(SodiumConfigBuilder.SODIUM_ICON);
    }

    public class08354 method_65809(class01089 class010892) throws IOException {
        try (InputStream inputStream = SodiumConfigBuilder.class.getResourceAsStream("/config-icon.png");){
            class08354 class083542 = new class08354(class08280.N((InputStream)inputStream), new class08500(false, false, class06846.field_64076, 0.1f));
            return class083542;
        }
    }
}

