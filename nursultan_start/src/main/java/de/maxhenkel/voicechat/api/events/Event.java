/*
 * Decompiled with CFR 0.152.
 */
package de.maxhenkel.voicechat.api.events;

public interface Event {
    public boolean isCancelled();

    public boolean cancel();

    public boolean isCancellable();
}

