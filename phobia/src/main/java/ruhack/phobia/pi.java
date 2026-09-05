/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.sun.jna.Library
 *  com.sun.jna.Native
 */
package ruhack.phobia;

import com.sun.jna.Library;
import com.sun.jna.Native;
import ruhack.phobia.pg;
import ruhack.phobia.pj;

public interface pi
extends Library {
    public static final pi INSTANCE = (pi)Native.loadLibrary((String)"discord-rpc", pi.class);

    public void Discord_RegisterSteamGame(String var1, String var2);

    public void Discord_Shutdown();

    public void Discord_Initialize(String var1, pg var2, boolean var3, String var4);

    public void Discord_UpdatePresence(pj var1);

    public void Discord_UpdateHandlers(pg var1);

    public void Discord_ClearPresence();

    public void Discord_RunCallbacks();

    public void Discord_Register(String var1, String var2);

    public void Discord_Respond(String var1, int var2);

    public void Discord_UpdateConnection();
}

