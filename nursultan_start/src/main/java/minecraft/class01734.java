/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.RedirectModifier
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 */
package minecraft;

import com.mojang.brigadier.RedirectModifier;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Collection;
import minecraft.class01727;

public interface class01734<T>
extends class01727<T>,
RedirectModifier<T> {
    default public Collection<T> apply(CommandContext<T> commandContext) throws CommandSyntaxException {
        throw new UnsupportedOperationException("This function should not run");
    }
}

