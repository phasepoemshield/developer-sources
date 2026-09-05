/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.data.FullMappings
 *  com.viaversion.viaversion.api.minecraft.item.data.AttributeModifiers1_20_5$AttributeModifier
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.util.Copyable
 *  com.viaversion.viaversion.util.Rewritable
 *  io.netty.buffer.ByteBuf
 */
package com.viaversion.viaversion.api.minecraft.item.data;

import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.data.FullMappings;
import com.viaversion.viaversion.api.minecraft.item.data.AttributeModifiers1_20_5;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.util.Copyable;
import com.viaversion.viaversion.util.Rewritable;
import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.UUID;

public record AttributeModifiers1_20_5(AttributeModifier[] modifiers, boolean showInTooltip) implements Copyable,
Rewritable
{
    public static final Type<AttributeModifiers1_20_5> TYPE = new Type<AttributeModifiers1_20_5>(AttributeModifiers1_20_5.class){

        public void write(ByteBuf buffer, AttributeModifiers1_20_5 value) {
            AttributeModifier.ARRAY_TYPE.write(buffer, (Object)value.modifiers());
            buffer.writeBoolean(value.showInTooltip());
        }

        public AttributeModifiers1_20_5 read(ByteBuf buffer) {
            AttributeModifier[] modifiers = (AttributeModifier[])AttributeModifier.ARRAY_TYPE.read(buffer);
            boolean showInTooltip = buffer.readBoolean();
            return new AttributeModifiers1_20_5(modifiers, showInTooltip);
        }
    };

    public AttributeModifiers1_20_5 copy() {
        return new AttributeModifiers1_20_5((AttributeModifier[])Copyable.copy((Object)this.modifiers), this.showInTooltip);
    }

    public AttributeModifiers1_20_5 rewrite(UserConnection connection, Protocol<?, ?, ?, ?> protocol, boolean clientbound) {
        FullMappings mappings = protocol.getMappingData().getAttributeMappings();
        if (mappings == null) {
            return this;
        }
        ArrayList<AttributeModifier> modifiers = new ArrayList<AttributeModifier>(this.modifiers.length);
        for (AttributeModifier modifier : this.modifiers) {
            int mappedId;
            int n = mappedId = clientbound ? mappings.getNewId(modifier.attribute()) : mappings.inverse().getNewId(modifier.attribute());
            if (mappedId == -1) continue;
            modifiers.add(new AttributeModifier(mappedId, modifier.modifier(), modifier.slotType()));
        }
        return new AttributeModifiers1_20_5((AttributeModifier[])modifiers.toArray(AttributeModifier[]::new), this.showInTooltip);
    }

    public record ModifierData(UUID uuid, String name, double amount, int operation) {
        public static final Type<ModifierData> TYPE = new Type<ModifierData>(ModifierData.class){

            public void write(ByteBuf buffer, ModifierData value) {
                Types.UUID.write(buffer, (Object)value.uuid);
                Types.STRING.write(buffer, (Object)value.name);
                buffer.writeDouble(value.amount);
                Types.VAR_INT.writePrimitive(buffer, value.operation);
            }

            public ModifierData read(ByteBuf buffer) {
                UUID uuid = (UUID)Types.UUID.read(buffer);
                String name = (String)Types.STRING.read(buffer);
                double amount = buffer.readDouble();
                int operation = Types.VAR_INT.readPrimitive(buffer);
                return new ModifierData(uuid, name, amount, operation);
            }
        };
    }
}

