/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.context.ContextChain
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.datafixers.util.Pair
 *  minecraft.class00390
 *  minecraft.class00392
 *  minecraft.class01723
 *  minecraft.class01743
 *  minecraft.class01744
 *  minecraft.class01894
 *  minecraft.class03126
 *  minecraft.class06808
 *  minecraft.class07001
 *  minecraft.class07684
 *  minecraft.class07701
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.context.ContextChain;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.util.Pair;
import java.util.Collection;
import minecraft.class00390;
import minecraft.class00392;
import minecraft.class01568;
import minecraft.class01723;
import minecraft.class01743;
import minecraft.class01744;
import minecraft.class01894;
import minecraft.class03126;
import minecraft.class06808;
import minecraft.class07001;
import minecraft.class07684;
import minecraft.class07701;
import org.jspecify.annotations.Nullable;

public abstract class class01578
extends class01723<class07701>
implements class01743<class07701> {
    protected abstract @Nullable class07001 N(CommandContext<class07701> var1) throws CommandSyntaxException;

    public void N(class07701 class077012, ContextChain<class07701> contextChain, class03126 class031262, class01744<class07701> class017442) throws CommandSyntaxException {
        CommandContext commandContext = contextChain.getTopContext().copyFor((Object)class077012);
        Pair var6 = class06808.L((CommandContext)commandContext, (String)"name");
        Collection var7 = (Collection)var6.getSecond();
        if (var7.isEmpty()) {
            throw class01568.N.create((Object)class00392.N((class01894)((class01894)var6.getFirst())));
        }
        class07001 class070012 = this.N((CommandContext<class07701>)commandContext);
        class07701 class077013 = class01568.N(class077012);
        if (var7.size() == 1) {
            class077012.N(() -> class00392.N((String)"commands.function.scheduled.single", (Object[])new Object[]{class00392.N((class01894)((class07684)var7.iterator().next()).N())}), true);
        } else {
            class077012.N(() -> class00392.N((String)"commands.function.scheduled.multiple", (Object[])new Object[]{class00390.y((Collection)var7.stream().map(class07684::N).toList(), class00392::N)}), true);
        }
        class01568.N(var7, class070012, class077012, class077013, class017442, class01568.u, class031262);
    }
}

