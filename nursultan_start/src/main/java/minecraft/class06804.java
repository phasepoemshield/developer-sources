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
import java.util.Collections;
import minecraft.class01894;
import minecraft.class06792;
import minecraft.class06808;
import minecraft.class07684;
import minecraft.class07701;

class class06804
implements class06792 {
    final /* synthetic */ class01894 N;

    @Override
    public Pair<class01894, Collection<class07684<class07701>>> L(CommandContext<class07701> commandContext) throws CommandSyntaxException {
        return Pair.of((Object)this.N, Collections.singleton(class06808.N(commandContext, this.N)));
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    class06804(class06808 class068082, class01894 class018942) {
        this.N = class018942;
    }

    @Override
    public Pair<class01894, Either<class07684<class07701>, Collection<class07684<class07701>>>> y(CommandContext<class07701> commandContext) throws CommandSyntaxException {
        return Pair.of((Object)this.N, (Object)Either.left(class06808.N(commandContext, this.N)));
    }

    @Override
    public Collection<class07684<class07701>> N(CommandContext<class07701> commandContext) throws CommandSyntaxException {
        return Collections.singleton(class06808.N(commandContext, this.N));
    }
}

