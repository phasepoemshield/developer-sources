/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  com.viaversion.viaversion.api.protocol.version.ServerProtocolVersion
 *  com.viaversion.viaversion.libs.fastutil.objects.ObjectLinkedOpenHashSet
 */
package com.viaversion.viaversion.protocol;

import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import com.viaversion.viaversion.api.protocol.version.ServerProtocolVersion;
import com.viaversion.viaversion.libs.fastutil.objects.ObjectLinkedOpenHashSet;
import java.util.SortedSet;

public record ServerProtocolVersionSingleton(ProtocolVersion protocolVersion) implements ServerProtocolVersion
{
    public SortedSet<ProtocolVersion> supportedProtocolVersions() {
        ObjectLinkedOpenHashSet set = new ObjectLinkedOpenHashSet();
        set.add(this.protocolVersion);
        return set;
    }

    public ProtocolVersion highestSupportedProtocolVersion() {
        return this.protocolVersion;
    }

    public ProtocolVersion lowestSupportedProtocolVersion() {
        return this.protocolVersion;
    }
}

