/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import org.jspecify.annotations.Nullable;

@FunctionalInterface
interface class01555<T, R> {
    public @Nullable R apply(T var1) throws CommandSyntaxException;
}

