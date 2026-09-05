/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09518
 *  com.mojang.brigadier.context.ContextChain
 *  minecraft.class01711
 *  minecraft.class01734
 *  minecraft.class01742
 *  minecraft.class01744
 *  minecraft.class03126
 *  minecraft.class03144
 */
package minecraft;

import Nursultan.class09518;
import com.mojang.brigadier.context.ContextChain;
import java.util.List;
import minecraft.class01711;
import minecraft.class01734;
import minecraft.class01742;
import minecraft.class01744;
import minecraft.class03126;
import minecraft.class03144;

public class class03483<T extends class01711<T>>
implements class01734<T> {
    public void N(T t, List<T> list, ContextChain<T> contextChain, class03126 class031262, class01744<T> class017442) {
        if (list.isEmpty()) {
            if (class031262.L()) {
                class017442.N(class03144.N());
            }
            return;
        }
        class017442.y().y();
        ContextChain contextChain2 = contextChain.nextStage();
        String string = contextChain2.getTopContext().getInput();
        class017442.N((class01742)new class09518(string, contextChain2, class031262.u(), t, list));
    }
}

