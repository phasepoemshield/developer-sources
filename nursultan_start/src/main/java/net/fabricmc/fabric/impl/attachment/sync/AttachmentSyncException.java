/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 */
package net.fabricmc.fabric.impl.attachment.sync;

import minecraft.class00392;

public class AttachmentSyncException
extends Exception {
    private final class00392 text;

    public class00392 getText() {
        return this.text;
    }

    public AttachmentSyncException(class00392 class003922) {
        super(class003922.getString());
        this.text = class003922;
    }
}

