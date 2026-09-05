/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.context.ContextChain
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  minecraft.class03126
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.brigadier.context.ContextChain;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import minecraft.class01704;
import minecraft.class01711;
import minecraft.class01729;
import minecraft.class01744;
import minecraft.class03126;
import org.jspecify.annotations.Nullable;

public abstract class class01723<T extends class01711<T>>
implements class01729<T> {
    public final void y(T t, ContextChain<T> contextChain, class03126 class031262, class01744<T> class017442) {
        try {
            this.N(t, contextChain, class031262, class017442);
        }
        catch (CommandSyntaxException commandSyntaxException) {
            this.N(commandSyntaxException, t, class031262, class017442.N());
            t.T().N();
        }
    }

    @Override
    protected abstract void N(T var1, ContextChain<T> var2, class03126 var3, class01744<T> var4) throws CommandSyntaxException;

    protected void N(CommandSyntaxException commandSyntaxException, T t, class03126 class031262, @Nullable class01704 class017042) {
        t.N(commandSyntaxException, class031262.N(), class017042);
    }
}

