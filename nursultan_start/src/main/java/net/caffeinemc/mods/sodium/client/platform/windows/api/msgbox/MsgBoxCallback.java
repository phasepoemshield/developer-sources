/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.system.Callback
 */
package net.caffeinemc.mods.sodium.client.platform.windows.api.msgbox;

import net.caffeinemc.mods.sodium.client.platform.windows.api.msgbox.MsgBoxCallback$Container;
import net.caffeinemc.mods.sodium.client.platform.windows.api.msgbox.MsgBoxCallbackI;
import org.lwjgl.system.Callback;

public abstract class MsgBoxCallback
extends Callback
implements MsgBoxCallbackI {
    public static MsgBoxCallback create(MsgBoxCallbackI msgBoxCallbackI) {
        if (msgBoxCallbackI instanceof MsgBoxCallback) {
            MsgBoxCallback msgBoxCallback = (MsgBoxCallback)msgBoxCallbackI;
            return msgBoxCallback;
        }
        return new MsgBoxCallback$Container(msgBoxCallbackI.address(), msgBoxCallbackI);
    }

    MsgBoxCallback(long l) {
        super(l);
    }
}

