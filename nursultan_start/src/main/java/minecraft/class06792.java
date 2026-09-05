/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.datafixers.util.Either
 *  com.mojang.datafixers.util.Pair
 *  minecraft.class01894
 *  minecraft.class07684
 *  minecraft.class07701
 */
package minecraft;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import java.util.Collection;
import minecraft.class01894;
import minecraft.class07684;
import minecraft.class07701;

public interface class06792 {
    public Pair<class01894, Collection<class07684<class07701>>> L(CommandContext<class07701> var1) throws CommandSyntaxException;

    public Pair<class01894, Either<class07684<class07701>, Collection<class07684<class07701>>>> y(CommandContext<class07701> var1) throws CommandSyntaxException;

    public Collection<class07684<class07701>> N(CommandContext<class07701> var1) throws CommandSyntaxException;
}

