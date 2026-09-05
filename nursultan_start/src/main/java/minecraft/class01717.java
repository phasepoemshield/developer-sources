/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.context.ContextChain
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  minecraft.class03099
 *  minecraft.class03126
 */
package minecraft;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.context.ContextChain;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import minecraft.class01704;
import minecraft.class01711;
import minecraft.class01716;
import minecraft.class01752;
import minecraft.class03099;
import minecraft.class03126;

public class class01717<T extends class01711<T>>
implements class01716<T> {
    private final String N;
    private final class03126 y;
    private final CommandContext<T> L;

    public class01717(String string, class03126 class031262, CommandContext<T> commandContext) {
        this.N = string;
        this.y = class031262;
        this.L = commandContext;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void N(T t, class01752<T> class017522, class03099 class030992) {
        class017522.L().N(() -> "execute " + this.N);
        try {
            class017522.i();
            int n = ContextChain.runExecutable(this.L, t, class01711.k(), (boolean)this.y.N());
            class01704 class017042 = class017522.y();
            if (class017042 != null) {
                class017042.N(class030992.L(), this.N, n);
            }
        }
        catch (CommandSyntaxException commandSyntaxException) {
            t.N(commandSyntaxException, this.y.N(), class017522.y());
        }
        finally {
            class017522.L().L();
        }
    }
}

