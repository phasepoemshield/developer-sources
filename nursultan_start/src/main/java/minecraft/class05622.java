/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.builder.ArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  minecraft.class07701
 */
package minecraft;

import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.function.Function;
import minecraft.class05598;
import minecraft.class07701;

public interface class05622 {
    public class05598 N(CommandContext<class07701> var1) throws CommandSyntaxException;

    public ArgumentBuilder<class07701, ?> N(ArgumentBuilder<class07701, ?> var1, Function<ArgumentBuilder<class07701, ?>, ArgumentBuilder<class07701, ?>> var2);
}

