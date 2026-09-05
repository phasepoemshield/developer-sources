/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  minecraft.class01762
 *  minecraft.class07701
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import minecraft.class01762;
import minecraft.class07701;
import org.jspecify.annotations.Nullable;

@FunctionalInterface
public interface class06199 {
    public int run(CommandContext<class07701> var1, @Nullable class01762 var2) throws CommandSyntaxException;
}

