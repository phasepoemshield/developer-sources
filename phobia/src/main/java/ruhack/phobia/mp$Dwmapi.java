/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.sun.jna.Native
 *  com.sun.jna.Pointer
 *  com.sun.jna.platform.win32.WinDef$HWND
 *  com.sun.jna.platform.win32.WinNT$HRESULT
 *  com.sun.jna.win32.StdCallLibrary
 */
package ruhack.phobia;

import com.sun.jna.Native;
import com.sun.jna.Pointer;
import com.sun.jna.platform.win32.WinDef;
import com.sun.jna.platform.win32.WinNT;
import com.sun.jna.win32.StdCallLibrary;

interface mp$Dwmapi
extends StdCallLibrary {
    public static final mp$Dwmapi INSTANCE = (mp$Dwmapi)Native.load((String)"dwmapi", mp$Dwmapi.class);

    public WinNT.HRESULT DwmSetWindowAttribute(WinDef.HWND var1, int var2, Pointer var3, int var4);
}

