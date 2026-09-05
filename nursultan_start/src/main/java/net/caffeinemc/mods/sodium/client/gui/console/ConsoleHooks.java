/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01054
 *  net.caffeinemc.mods.sodium.client.console.Console
 */
package net.caffeinemc.mods.sodium.client.gui.console;

import minecraft.class01054;
import net.caffeinemc.mods.sodium.client.console.Console;
import net.caffeinemc.mods.sodium.client.gui.console.ConsoleRenderer;

public class ConsoleHooks {
    public static void render(class01054 class010542, double d) {
        ConsoleRenderer.INSTANCE.update(Console.INSTANCE, d);
        ConsoleRenderer.INSTANCE.draw(class010542);
    }
}

