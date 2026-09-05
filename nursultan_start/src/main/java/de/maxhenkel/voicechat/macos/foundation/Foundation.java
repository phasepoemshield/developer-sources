/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.sun.jna.Library
 *  com.sun.jna.Native
 *  com.sun.jna.NativeLong
 *  com.sun.jna.Pointer
 */
package de.maxhenkel.voicechat.macos.foundation;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.NativeLong;
import com.sun.jna.Pointer;

public interface Foundation
extends Library {
    public static final Foundation INSTANCE = (Foundation)Native.load((String)"Foundation", Foundation.class);

    public NativeLong objc_msgSend(NativeLong var1, Pointer var2);

    public NativeLong objc_msgSend(Pointer var1, Pointer var2, String var3);

    public Pointer objc_getClass(String var1);

    public Pointer sel_registerName(String var1);
}

