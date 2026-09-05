/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.arguments.IntegerArgumentType
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.context.ContextChain
 *  minecraft.class01711
 *  minecraft.class01743
 *  minecraft.class01744
 *  minecraft.class03099
 *  minecraft.class03126
 */
package minecraft;

import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.context.ContextChain;
import minecraft.class01711;
import minecraft.class01743;
import minecraft.class01744;
import minecraft.class03099;
import minecraft.class03126;

public class class03478<T extends class01711<T>>
implements class01743<T> {
    public void N(T t, ContextChain<T> contextChain, class03126 class031262, class01744<T> class017442) {
        int n = IntegerArgumentType.getInteger((CommandContext)contextChain.getTopContext(), (String)"value");
        t.T().N(n);
        class03099 class030992 = class017442.y();
        class030992.N(n);
        class030992.y();
    }
}

