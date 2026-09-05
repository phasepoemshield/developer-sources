/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.exception.InformativeException
 */
package com.viaversion.viaversion.api.protocol.remapper;

import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.exception.InformativeException;

@FunctionalInterface
public interface ValueReader<T> {
    public T read(PacketWrapper var1) throws InformativeException;
}

