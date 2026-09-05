/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  minecraft.class07001
 *  minecraft.class07701
 *  minecraft.class07709
 *  minecraft.class07793
 */
package minecraft;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.List;
import minecraft.class07001;
import minecraft.class07701;
import minecraft.class07709;
import minecraft.class07793;

@FunctionalInterface
public interface class05593 {
    public int modify(CommandContext<class07701> var1, class07001 var2, class07793 var3, List<class07709> var4) throws CommandSyntaxException;
}

