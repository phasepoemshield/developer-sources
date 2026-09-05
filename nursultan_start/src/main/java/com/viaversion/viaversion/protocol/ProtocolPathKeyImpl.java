/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.protocol.ProtocolPathKey
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 */
package com.viaversion.viaversion.protocol;

import com.viaversion.viaversion.api.protocol.ProtocolPathKey;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;

public record ProtocolPathKeyImpl(ProtocolVersion clientProtocolVersion, ProtocolVersion serverProtocolVersion) implements ProtocolPathKey
{
}

