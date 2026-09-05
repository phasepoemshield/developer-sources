/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.sun.jna.Library
 *  com.sun.jna.Native
 *  com.sun.jna.NativeLong
 *  com.sun.jna.Pointer
 */
package de.maxhenkel.voicechat.macos.avfoundation;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.NativeLong;
import com.sun.jna.Pointer;

public interface AVFoundation
extends Library {
    public static final AVFoundation INSTANCE = (AVFoundation)Native.load((String)"AVFoundation", AVFoundation.class);

    public NativeLong objc_msgSend(Pointer var1, Pointer var2, NativeLong var3);

    public NativeLong objc_msgSend(Pointer var1, Pointer var2, NativeLong var3, Pointer var4);

    public Pointer objc_getClass(String var1);

    public Pointer sel_registerName(String var1);
}

