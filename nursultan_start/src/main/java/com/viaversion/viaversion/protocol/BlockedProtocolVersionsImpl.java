/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.protocol.version.BlockedProtocolVersions
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 */
package com.viaversion.viaversion.protocol;

import com.viaversion.viaversion.api.protocol.version.BlockedProtocolVersions;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.util.Set;

public record BlockedProtocolVersionsImpl(Set<ProtocolVersion> singleBlockedVersions, ProtocolVersion blocksBelow, ProtocolVersion blocksAbove) implements BlockedProtocolVersions
{
    public boolean contains(ProtocolVersion protocolVersion) {
        return this.blocksBelow.isKnown() && protocolVersion.olderThan(this.blocksBelow) || this.blocksAbove.isKnown() && protocolVersion.newerThan(this.blocksAbove) || this.singleBlockedVersions.contains(protocolVersion);
    }
}

