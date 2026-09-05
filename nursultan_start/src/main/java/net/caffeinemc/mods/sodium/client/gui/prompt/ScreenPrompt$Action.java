/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00392
 */
package net.caffeinemc.mods.sodium.client.gui.prompt;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00392;

public final class ScreenPrompt$Action
extends Record {
    final class00392 label;
    final Runnable runnable;

    public ScreenPrompt$Action(class00392 class003922, Runnable runnable) {
        this.label = class003922;
        this.runnable = runnable;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ScreenPrompt$Action.class, "label;runnable", "label", "runnable"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ScreenPrompt$Action.class, "label;runnable", "label", "runnable"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ScreenPrompt$Action.class, "label;runnable", "label", "runnable"}, this);
    }

    public Runnable runnable() {
        return this.runnable;
    }

    public class00392 label() {
        return this.label;
    }
}

