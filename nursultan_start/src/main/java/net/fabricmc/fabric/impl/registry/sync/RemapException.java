/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.impl.registry.sync;

import minecraft.class00392;
import org.jspecify.annotations.Nullable;

public class RemapException
extends Exception {
    private final @Nullable class00392 text;

    public @Nullable class00392 getText() {
        return this.text;
    }

    public RemapException(class00392 class003922) {
        super(class003922.getString());
        this.text = class003922;
    }

    public RemapException(String string) {
        super(string);
        this.text = null;
    }
}

