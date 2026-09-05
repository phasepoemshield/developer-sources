/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.context.ContextChain
 *  minecraft.class01734
 *  minecraft.class01744
 *  minecraft.class03126
 *  minecraft.class06808
 *  minecraft.class07701
 */
package minecraft;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.context.ContextChain;
import java.util.List;
import java.util.function.IntPredicate;
import minecraft.class01568;
import minecraft.class01577;
import minecraft.class01734;
import minecraft.class01744;
import minecraft.class03126;
import minecraft.class06808;
import minecraft.class07701;

class class01546
implements class01734<class07701> {
    private final IntPredicate N;

    class01546(boolean bl) {
        this.N = bl ? n -> n != 0 : n -> n == 0;
    }

    public void N(class07701 class077012, List<class07701> list, ContextChain<class07701> contextChain, class03126 class031262, class01744<class07701> class017442) {
        class01577.N(class077012, list, class01568::N, this.N, contextChain, null, class017442, commandContext -> class06808.N((CommandContext)commandContext, (String)"name"), class031262);
    }
}

