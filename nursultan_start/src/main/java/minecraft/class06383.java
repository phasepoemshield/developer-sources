/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  minecraft.class06411
 *  minecraft.class06584
 *  minecraft.class07701
 */
package minecraft;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.List;
import minecraft.class06411;
import minecraft.class06584;
import minecraft.class07701;

@FunctionalInterface
public interface class06383 {
    public int accept(CommandContext<class07701> var1, List<class06584> var2, class06411 var3) throws CommandSyntaxException;
}

