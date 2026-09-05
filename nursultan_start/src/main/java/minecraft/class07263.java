/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.builder.ArgumentBuilder
 *  minecraft.class01894
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.builder.ArgumentBuilder;
import minecraft.class01894;
import org.jspecify.annotations.Nullable;

public interface class07263<S> {
    public ArgumentBuilder<S, ?> N(String var1);

    public ArgumentBuilder<S, ?> N(String var1, ArgumentType<?> var2, @Nullable class01894 var3);

    public ArgumentBuilder<S, ?> N(ArgumentBuilder<S, ?> var1, boolean var2, boolean var3);
}

