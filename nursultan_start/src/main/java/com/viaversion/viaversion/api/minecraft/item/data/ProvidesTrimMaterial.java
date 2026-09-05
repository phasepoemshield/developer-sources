/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.EitherHolder
 *  com.viaversion.viaversion.api.minecraft.Holder
 *  com.viaversion.viaversion.api.minecraft.codec.Ops
 *  com.viaversion.viaversion.api.minecraft.item.data.ArmorTrimMaterial
 *  com.viaversion.viaversion.api.type.types.misc.EitherHolderType
 *  com.viaversion.viaversion.api.type.types.misc.HolderType
 *  com.viaversion.viaversion.util.Rewritable
 *  io.netty.buffer.ByteBuf
 */
package com.viaversion.viaversion.api.minecraft.item.data;

import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.EitherHolder;
import com.viaversion.viaversion.api.minecraft.Holder;
import com.viaversion.viaversion.api.minecraft.codec.Ops;
import com.viaversion.viaversion.api.minecraft.item.data.ArmorTrimMaterial;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.types.misc.EitherHolderType;
import com.viaversion.viaversion.api.type.types.misc.HolderType;
import com.viaversion.viaversion.util.Rewritable;
import io.netty.buffer.ByteBuf;

public record ProvidesTrimMaterial(EitherHolder<ArmorTrimMaterial> material) implements Rewritable
{
    public static final Type<ProvidesTrimMaterial> TYPE = new Type<ProvidesTrimMaterial>(ProvidesTrimMaterial.class){

        @Override
        public void write(Ops ops, ProvidesTrimMaterial value) {
            EitherHolderType.write((Ops)ops, value.material, (HolderType)ArmorTrimMaterial.TYPE1_21_5);
        }

        @Override
        public void write(ByteBuf buffer, ProvidesTrimMaterial value) {
            EitherHolderType.write((ByteBuf)buffer, value.material, (HolderType)ArmorTrimMaterial.TYPE1_21_5);
        }

        @Override
        public ProvidesTrimMaterial read(ByteBuf buffer) {
            EitherHolder position = EitherHolderType.read((ByteBuf)buffer, (HolderType)ArmorTrimMaterial.TYPE1_21_5);
            return new ProvidesTrimMaterial((EitherHolder<ArmorTrimMaterial>)position);
        }
    };

    public ProvidesTrimMaterial rewrite(UserConnection connection, Protocol<?, ?, ?, ?> protocol, boolean clientbound) {
        if (this.material.hasKey() || this.material.holder().hasId()) {
            return this;
        }
        ArmorTrimMaterial trimMaterial = (ArmorTrimMaterial)this.material.holder().value();
        return new ProvidesTrimMaterial((EitherHolder<ArmorTrimMaterial>)EitherHolder.of((Holder)Holder.of((Object)trimMaterial.rewrite(connection, protocol, clientbound))));
    }
}

