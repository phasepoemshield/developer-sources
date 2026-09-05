/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.Command
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 */
package minecraft;

import com.mojang.brigadier.Command;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import minecraft.class01729;

public interface class01743<T>
extends class01729<T>,
Command<T> {
    default public int run(CommandContext<T> commandContext) throws CommandSyntaxException {
        throw new UnsupportedOperationException("This function should not run");
    }
}

