/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  com.viaversion.viaversion.api.protocol.version.SubVersionRange
 *  com.viaversion.viaversion.api.protocol.version.VersionType
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package com.viaversion.viaversion.protocol;

import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import com.viaversion.viaversion.api.protocol.version.SubVersionRange;
import com.viaversion.viaversion.api.protocol.version.VersionType;
import java.util.Comparator;
import org.checkerframework.checker.nullness.qual.Nullable;

public class SpecialProtocolVersion
extends ProtocolVersion {
    private final ProtocolVersion delegate;

    public ProtocolVersion getDelegate() {
        return this.delegate;
    }

    public SpecialProtocolVersion(int version, String name, ProtocolVersion delegate) {
        this(version, -1, name, null, delegate);
    }

    public SpecialProtocolVersion(int version, int snapshotVersion, String name, @Nullable SubVersionRange versionRange, ProtocolVersion delegate) {
        super(VersionType.SPECIAL, version, snapshotVersion, name, versionRange);
        this.delegate = delegate;
    }

    public @Nullable ProtocolVersion getBaseProtocolVersion() {
        return this.delegate;
    }

    protected @Nullable Comparator<ProtocolVersion> customComparator() {
        return (o1, o2) -> {
            if (o1 == this) {
                o1 = this.delegate;
            }
            if (o2 == this) {
                o2 = this.delegate;
            }
            return o1.compareTo(o2);
        };
    }
}

