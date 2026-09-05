/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.context.CommandContext
 *  minecraft.class07111
 *  minecraft.class07701
 */
package minecraft;

import com.mojang.brigadier.context.CommandContext;
import minecraft.class03940;
import minecraft.class07111;
import minecraft.class07701;

public class class03966
extends class03940<class07111> {
    private class03966() {
        super(class07111.field_39311, class07111::values);
    }

    public static class03940<class07111> N() {
        return new class03966();
    }

    public static class07111 N(CommandContext<class07701> commandContext, String string) {
        return (class07111)commandContext.getArgument(string, class07111.class);
    }
}

