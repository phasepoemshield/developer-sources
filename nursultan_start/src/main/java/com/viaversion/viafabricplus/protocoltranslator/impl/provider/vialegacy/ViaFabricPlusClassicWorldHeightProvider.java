/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  net.raphimc.vialegacy.protocol.classic.c0_28_30toa1_0_15.provider.ClassicWorldHeightProvider
 */
package com.viaversion.viafabricplus.protocoltranslator.impl.provider.vialegacy;

import com.viaversion.viaversion.api.connection.UserConnection;
import net.raphimc.vialegacy.protocol.classic.c0_28_30toa1_0_15.provider.ClassicWorldHeightProvider;

public final class ViaFabricPlusClassicWorldHeightProvider
extends ClassicWorldHeightProvider {
    public short getMaxChunkSectionCount(UserConnection userConnection) {
        return 64;
    }
}

