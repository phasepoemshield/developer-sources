/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.data.FullMappings
 *  com.viaversion.viaversion.api.minecraft.codec.Ops
 *  com.viaversion.viaversion.api.minecraft.item.data.AttributeModifiers1_21$AttributeModifier
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.libs.fastutil.ints.Int2IntFunction
 *  com.viaversion.viaversion.util.Copyable
 *  com.viaversion.viaversion.util.Rewritable
 *  io.netty.buffer.ByteBuf
 */
package com.viaversion.viaversion.api.minecraft.item.data;

import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.data.FullMappings;
import com.viaversion.viaversion.api.minecraft.codec.Ops;
import com.viaversion.viaversion.api.minecraft.item.data.AttributeModifiers1_21;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.libs.fastutil.ints.Int2IntFunction;
import com.viaversion.viaversion.util.Copyable;
import com.viaversion.viaversion.util.Rewritable;
import io.netty.buffer.ByteBuf;
import java.util.ArrayList;

public record AttributeModifiers1_21(AttributeModifier[] modifiers, boolean showInTooltip) implements Copyable,
Rewritable
{
    public static final Type<AttributeModifiers1_21> TYPE1_21 = new Type<AttributeModifiers1_21>(AttributeModifiers1_21.class){

        public void write(ByteBuf buffer, AttributeModifiers1_21 value) {
            AttributeModifier.ARRAY_TYPE1_21.write(buffer, (Object)value.modifiers());
            buffer.writeBoolean(value.showInTooltip());
        }

        public AttributeModifiers1_21 read(ByteBuf buffer) {
            AttributeModifier[] modifiers = (AttributeModifier[])AttributeModifier.ARRAY_TYPE1_21.read(buffer);
            boolean showInTooltip = buffer.readBoolean();
            return new AttributeModifiers1_21(modifiers, showInTooltip);
        }
    };
    public static final Type<AttributeModifiers1_21> TYPE1_21_5 = new Type<AttributeModifiers1_21>(AttributeModifiers1_21.class){

        public void write(Ops ops, AttributeModifiers1_21 value) {
            ops.write(AttributeModifier.ARRAY_TYPE1_21, (Object)value.modifiers);
        }

        public void write(ByteBuf buffer, AttributeModifiers1_21 value) {
            AttributeModifier.ARRAY_TYPE1_21.write(buffer, (Object)value.modifiers());
        }

        public AttributeModifiers1_21 read(ByteBuf buffer) {
            AttributeModifier[] modifiers = (AttributeModifier[])AttributeModifier.ARRAY_TYPE1_21.read(buffer);
            return new AttributeModifiers1_21(modifiers);
        }
    };
    public static final Type<AttributeModifiers1_21> TYPE1_21_6 = new Type<AttributeModifiers1_21>(AttributeModifiers1_21.class){

        public void write(Ops ops, AttributeModifiers1_21 value) {
            ops.write(AttributeModifier.ARRAY_TYPE1_21_6, (Object)value.modifiers);
        }

        public void write(ByteBuf buffer, AttributeModifiers1_21 value) {
            AttributeModifier.ARRAY_TYPE1_21_6.write(buffer, (Object)value.modifiers());
        }

        public AttributeModifiers1_21 read(ByteBuf buffer) {
            AttributeModifier[] modifiers = (AttributeModifier[])AttributeModifier.ARRAY_TYPE1_21_6.read(buffer);
            return new AttributeModifiers1_21(modifiers);
        }
    };

    public AttributeModifiers1_21(AttributeModifier[] modifiers) {
        this(modifiers, true);
    }

    public AttributeModifiers1_21 rewrite(Int2IntFunction rewriteFunction) {
        AttributeModifier[] modifiers = new AttributeModifier[this.modifiers.length];
        for (int i = 0; i < this.modifiers.length; ++i) {
            AttributeModifier modifier = this.modifiers[i];
            modifiers[i] = new AttributeModifier(rewriteFunction.applyAsInt(modifier.attribute()), modifier.modifier(), modifier.slotType(), modifier.display());
        }
        return new AttributeModifiers1_21(modifiers, this.showInTooltip);
    }

    public AttributeModifiers1_21 copy() {
        return new AttributeModifiers1_21((AttributeModifier[])Copyable.copy((Object)this.modifiers), this.showInTooltip);
    }

    public AttributeModifiers1_21 rewrite(UserConnection connection, Protocol<?, ?, ?, ?> protocol, boolean clientbound) {
        FullMappings mappings = protocol.getMappingData().getAttributeMappings();
        if (mappings == null) {
            return this;
        }
        ArrayList<AttributeModifier> modifiers = new ArrayList<AttributeModifier>(this.modifiers.length);
        for (AttributeModifier modifier : this.modifiers) {
            int mappedId;
            int n = mappedId = clientbound ? mappings.getNewId(modifier.attribute()) : mappings.inverse().getNewId(modifier.attribute());
            if (mappedId == -1) continue;
            modifiers.add(new AttributeModifier(mappedId, modifier.modifier(), modifier.slotType(), modifier.display()));
        }
        return new AttributeModifiers1_21((AttributeModifier[])modifiers.toArray(AttributeModifier[]::new), this.showInTooltip);
    }
}

