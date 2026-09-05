/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01054
 *  minecraft.class03255
 *  minecraft.class08669
 */
package dev.isxander.yacl3.gui.render;

import minecraft.class01054;
import minecraft.class03255;
import minecraft.class08669;

public interface GuiRenderStateSink {
    public static void submit(class01054 class010542, class08669 class086692) {
        ((GuiRenderStateSink)class010542).yacl$submit(class086692);
    }

    public static class03255 peekScissorStack(class01054 class010542) {
        return ((GuiRenderStateSink)class010542).yacl$peekScissorStack();
    }

    public void yacl$submit(class08669 var1);

    public class03255 yacl$peekScissorStack();
}

