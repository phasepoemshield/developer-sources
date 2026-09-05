/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.sodium.client.platform.windows.api.msgbox;

import net.caffeinemc.mods.sodium.client.platform.windows.api.msgbox.MsgBoxCallback;
import net.caffeinemc.mods.sodium.client.platform.windows.api.msgbox.MsgBoxCallbackI;

final class MsgBoxCallback$Container
extends MsgBoxCallback {
    private final MsgBoxCallbackI delegate;

    @Override
    public void invoke(long l) {
        this.delegate.invoke(l);
    }

    MsgBoxCallback$Container(long l, MsgBoxCallbackI msgBoxCallbackI) {
        super(l);
        this.delegate = msgBoxCallbackI;
    }
}

