/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.data.Mappings
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 */
package com.viaversion.viaversion.rewriter;

import com.viaversion.viaversion.api.data.Mappings;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;

public class AttributeRewriter<C extends ClientboundPacketType> {
    private final Protocol<C, ?, ?, ?> protocol;

    public AttributeRewriter(Protocol<C, ?, ?, ?> protocol) {
        this.protocol = protocol;
    }

    public void register1_21(C packetType) {
        if (this.protocol.getMappingData() == null || Mappings.isIntIdIdentity((Mappings)this.protocol.getMappingData().getAttributeMappings())) {
            return;
        }
        this.protocol.registerClientbound(packetType, wrapper -> {
            int size;
            wrapper.passthrough((Type)Types.VAR_INT);
            int newSize = size = ((Integer)wrapper.passthrough((Type)Types.VAR_INT)).intValue();
            for (int i = 0; i < size; ++i) {
                int j;
                int modifierSize;
                int attributeId = (Integer)wrapper.read((Type)Types.VAR_INT);
                int mappedId = this.protocol.getMappingData().getNewAttributeId(attributeId);
                if (mappedId == -1) {
                    --newSize;
                    wrapper.read((Type)Types.DOUBLE);
                    modifierSize = (Integer)wrapper.read((Type)Types.VAR_INT);
                    for (j = 0; j < modifierSize; ++j) {
                        wrapper.read(Types.STRING);
                        wrapper.read((Type)Types.DOUBLE);
                        wrapper.read((Type)Types.BYTE);
                    }
                    continue;
                }
                wrapper.write((Type)Types.VAR_INT, (Object)mappedId);
                wrapper.passthrough((Type)Types.DOUBLE);
                modifierSize = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
                for (j = 0; j < modifierSize; ++j) {
                    wrapper.passthrough(Types.STRING);
                    wrapper.passthrough((Type)Types.DOUBLE);
                    wrapper.passthrough((Type)Types.BYTE);
                }
            }
            if (size != newSize) {
                wrapper.set((Type)Types.VAR_INT, 1, (Object)newSize);
            }
        });
    }
}

