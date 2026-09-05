/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Preconditions
 */
package com.viaversion.viaversion.api.protocol.version;

import com.google.common.base.Preconditions;

public record SubVersionRange(String baseVersion, int rangeFrom, int rangeTo) {
    public SubVersionRange {
        Preconditions.checkNotNull((Object)baseVersion);
        Preconditions.checkArgument((rangeFrom >= 0 ? 1 : 0) != 0);
        Preconditions.checkArgument((rangeTo > rangeFrom ? 1 : 0) != 0);
    }
}

