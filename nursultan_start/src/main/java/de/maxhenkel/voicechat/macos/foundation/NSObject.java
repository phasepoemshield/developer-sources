/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.sun.jna.NativeLong
 *  com.sun.jna.Pointer
 */
package de.maxhenkel.voicechat.macos.foundation;

import com.sun.jna.NativeLong;
import com.sun.jna.Pointer;
import de.maxhenkel.voicechat.macos.foundation.Foundation;

public class NSObject {
    private static final NativeLong nullPointer = new NativeLong(0L);
    private static final Pointer releaseSelector = Foundation.INSTANCE.sel_registerName("release");
    protected final NativeLong id;

    public boolean isNull() {
        return this.id.equals((Object)nullPointer);
    }

    public NSObject(NativeLong nativeLong) {
        this.id = nativeLong;
    }

    public final NativeLong getId() {
        return this.id;
    }

    public void release() {
        Foundation.INSTANCE.objc_msgSend(this.id, releaseSelector);
    }
}

