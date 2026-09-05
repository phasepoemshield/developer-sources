/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.libs.fastutil.ints.IntCollection
 *  com.viaversion.viaversion.libs.fastutil.ints.IntLinkedOpenHashSet
 *  com.viaversion.viaversion.libs.fastutil.ints.IntSortedSet
 */
package com.viaversion.viaversion.api.protocol.version;

import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import com.viaversion.viaversion.libs.fastutil.ints.IntCollection;
import com.viaversion.viaversion.libs.fastutil.ints.IntLinkedOpenHashSet;
import com.viaversion.viaversion.libs.fastutil.ints.IntSortedSet;
import java.util.SortedSet;

public interface ServerProtocolVersion {
    default public boolean isKnown() {
        return this.lowestSupportedProtocolVersion().isKnown() && this.highestSupportedProtocolVersion().isKnown();
    }

    @Deprecated
    default public IntSortedSet supportedVersions() {
        return (IntSortedSet)this.supportedProtocolVersions().stream().mapToInt(ProtocolVersion::getVersion).collect(IntLinkedOpenHashSet::new, IntCollection::add, IntCollection::addAll);
    }

    public SortedSet<ProtocolVersion> supportedProtocolVersions();

    @Deprecated
    default public int lowestSupportedVersion() {
        return this.lowestSupportedProtocolVersion().getVersion();
    }

    @Deprecated
    default public int highestSupportedVersion() {
        return this.highestSupportedProtocolVersion().getVersion();
    }

    public ProtocolVersion highestSupportedProtocolVersion();

    public ProtocolVersion lowestSupportedProtocolVersion();
}

