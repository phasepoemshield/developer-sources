/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01028
 *  net.caffeinemc.mods.sodium.client.console.message.MessageLevel
 */
package net.caffeinemc.mods.sodium.client.gui.console;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import minecraft.class01028;
import net.caffeinemc.mods.sodium.client.console.message.MessageLevel;

final class ConsoleRenderer$MessageRender
extends Record {
    final int x;
    final int y;
    final int width;
    final int height;
    private final MessageLevel level;
    private final List<class01028> lines;
    private final double opacity;

    public int width() {
        return this.width;
    }

    ConsoleRenderer$MessageRender(int n, int n2, int n3, int n4, MessageLevel messageLevel, List<class01028> list, double d) {
        this.x = n;
        this.y = n2;
        this.width = n3;
        this.height = n4;
        this.level = messageLevel;
        this.lines = list;
        this.opacity = d;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ConsoleRenderer$MessageRender.class, "x;y;width;height;level;lines;opacity", "x", "y", "width", "height", "level", "lines", "opacity"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ConsoleRenderer$MessageRender.class, "x;y;width;height;level;lines;opacity", "x", "y", "width", "height", "level", "lines", "opacity"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ConsoleRenderer$MessageRender.class, "x;y;width;height;level;lines;opacity", "x", "y", "width", "height", "level", "lines", "opacity"}, this);
    }

    public List<class01028> lines() {
        return this.lines;
    }

    public int x() {
        return this.x;
    }

    public int y() {
        return this.y;
    }

    public MessageLevel level() {
        return this.level;
    }

    public double opacity() {
        return this.opacity;
    }

    public int height() {
        return this.height;
    }
}

