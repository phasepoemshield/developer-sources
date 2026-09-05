/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.platform.providers.Provider
 */
package net.raphimc.vialegacy.protocol.classic.c0_28_30toa1_0_15.provider;

import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.platform.providers.Provider;

public class ClassicWorldHeightProvider
implements Provider {
    public short getMaxChunkSectionCount(UserConnection user) {
        return 8;
    }
}

