/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.exception.InformativeException
 */
package com.viaversion.viaversion.api.protocol.remapper;

import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.remapper.ValueReader;
import com.viaversion.viaversion.api.protocol.remapper.ValueWriter;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.exception.InformativeException;

public record TypeRemapper<T>(Type<T> type) implements ValueReader<T>,
ValueWriter<T>
{
    @Override
    public void write(PacketWrapper output, T inputValue) throws InformativeException {
        output.write(this.type, inputValue);
    }

    @Override
    public T read(PacketWrapper wrapper) throws InformativeException {
        return wrapper.read(this.type);
    }
}

