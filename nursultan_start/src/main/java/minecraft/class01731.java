/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.context.ContextChain
 *  minecraft.class03099
 *  minecraft.class03126
 */
package minecraft;

import com.mojang.brigadier.context.ContextChain;
import java.util.List;
import minecraft.class01711;
import minecraft.class01716;
import minecraft.class01736;
import minecraft.class01752;
import minecraft.class03099;
import minecraft.class03126;

public class class01731<T extends class01711<T>>
extends class01736<T>
implements class01716<T> {
    public class01731(String string, ContextChain<T> contextChain) {
        super(string, contextChain);
    }

    @Override
    public void N(T t, class01752<T> class017522, class03099 class030992) {
        this.N(class017522, class030992);
        this.N(t, List.of(t), class017522, class030992, class03126.N);
    }
}

