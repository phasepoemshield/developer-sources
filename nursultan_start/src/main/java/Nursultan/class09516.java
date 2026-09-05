/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.context.ContextChain
 *  minecraft.class01711
 *  minecraft.class01736
 *  minecraft.class01742
 *  minecraft.class01752
 *  minecraft.class03099
 *  minecraft.class03126
 */
package Nursultan;

import com.mojang.brigadier.context.ContextChain;
import java.util.List;
import minecraft.class01711;
import minecraft.class01736;
import minecraft.class01742;
import minecraft.class01752;
import minecraft.class03099;
import minecraft.class03126;

public class class09516<T extends class01711<T>>
extends class01736<T>
implements class01742<T> {
    private final T y;

    public class09516(String string, ContextChain<T> contextChain, T t) {
        super(string, contextChain);
        this.y = t;
    }

    public void execute(class01752<T> class017522, class03099 class030992) {
        this.N(class017522, class030992);
        this.N((class01711)this.y, List.of(this.y), (class01752)class017522, class030992, class03126.N);
    }
}

