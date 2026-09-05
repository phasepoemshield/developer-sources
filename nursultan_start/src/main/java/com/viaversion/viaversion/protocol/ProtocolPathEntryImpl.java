/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.ProtocolPathEntry
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 */
package com.viaversion.viaversion.protocol;

import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.ProtocolPathEntry;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;

public record ProtocolPathEntryImpl(ProtocolVersion outputProtocolVersion, Protocol<?, ?, ?, ?> protocol) implements ProtocolPathEntry
{
}

