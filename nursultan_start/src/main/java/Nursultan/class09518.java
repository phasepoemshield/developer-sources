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

public class class09518<T extends class01711<T>>
extends class01736<T>
implements class01742<T> {
    private final class03126 y;
    private final T L;
    private final List<T> u;

    public class09518(String string, ContextChain<T> contextChain, class03126 class031262, T t, List<T> list) {
        super(string, contextChain);
        this.L = t;
        this.u = list;
        this.y = class031262;
    }

    public void execute(class01752<T> class017522, class03099 class030992) {
        this.N((class01711)this.L, this.u, (class01752)class017522, class030992, this.y);
    }
}

