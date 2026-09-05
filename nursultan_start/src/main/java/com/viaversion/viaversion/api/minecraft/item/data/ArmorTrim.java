/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.Holder
 *  com.viaversion.viaversion.api.minecraft.codec.Ops
 *  com.viaversion.viaversion.api.minecraft.item.data.ArmorTrimPattern
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.util.Rewritable
 *  io.netty.buffer.ByteBuf
 */
package com.viaversion.viaversion.api.minecraft.item.data;

import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.Holder;
import com.viaversion.viaversion.api.minecraft.codec.Ops;
import com.viaversion.viaversion.api.minecraft.item.data.ArmorTrimMaterial;
import com.viaversion.viaversion.api.minecraft.item.data.ArmorTrimPattern;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.util.Rewritable;
import io.netty.buffer.ByteBuf;

public record ArmorTrim(Holder<ArmorTrimMaterial> material, Holder<ArmorTrimPattern> pattern, boolean showInTooltip) implements Rewritable
{
    public static final Type<ArmorTrim> TYPE1_20_5 = new Type<ArmorTrim>(ArmorTrim.class){

        public void write(ByteBuf buffer, ArmorTrim value) {
            ArmorTrimMaterial.TYPE1_20_5.write(buffer, value.material);
            ArmorTrimPattern.TYPE1_20_5.write(buffer, value.pattern);
            buffer.writeBoolean(value.showInTooltip);
        }

        public ArmorTrim read(ByteBuf buffer) {
            Holder material = ArmorTrimMaterial.TYPE1_20_5.read(buffer);
            Holder pattern = ArmorTrimPattern.TYPE1_20_5.read(buffer);
            boolean showInTooltip = buffer.readBoolean();
            return new ArmorTrim((Holder<ArmorTrimMaterial>)material, (Holder<ArmorTrimPattern>)pattern, showInTooltip);
        }
    };
    public static final Type<ArmorTrim> TYPE1_21_2 = new Type<ArmorTrim>(ArmorTrim.class){

        public void write(ByteBuf buffer, ArmorTrim value) {
            ArmorTrimMaterial.TYPE1_21_2.write(buffer, value.material);
            ArmorTrimPattern.TYPE1_20_5.write(buffer, value.pattern);
            buffer.writeBoolean(value.showInTooltip);
        }

        public ArmorTrim read(ByteBuf buffer) {
            Holder material = ArmorTrimMaterial.TYPE1_21_2.read(buffer);
            Holder pattern = ArmorTrimPattern.TYPE1_20_5.read(buffer);
            boolean showInTooltip = buffer.readBoolean();
            return new ArmorTrim((Holder<ArmorTrimMaterial>)material, (Holder<ArmorTrimPattern>)pattern, showInTooltip);
        }
    };
    public static final Type<ArmorTrim> TYPE1_21_4 = new Type<ArmorTrim>(ArmorTrim.class){

        public void write(ByteBuf buffer, ArmorTrim value) {
            ArmorTrimMaterial.TYPE1_21_4.write(buffer, value.material);
            ArmorTrimPattern.TYPE1_20_5.write(buffer, value.pattern);
            buffer.writeBoolean(value.showInTooltip);
        }

        public ArmorTrim read(ByteBuf buffer) {
            Holder material = ArmorTrimMaterial.TYPE1_21_4.read(buffer);
            Holder pattern = ArmorTrimPattern.TYPE1_20_5.read(buffer);
            boolean showInTooltip = buffer.readBoolean();
            return new ArmorTrim((Holder<ArmorTrimMaterial>)material, (Holder<ArmorTrimPattern>)pattern, showInTooltip);
        }
    };
    public static final Type<ArmorTrim> TYPE1_21_5 = new Type<ArmorTrim>(ArmorTrim.class){

        public void write(Ops ops, ArmorTrim value) {
            ops.writeMap(map -> map.write("material", ArmorTrimMaterial.TYPE1_21_5, value.material).write("pattern", (Type)ArmorTrimPattern.TYPE1_21_5, value.pattern));
        }

        public void write(ByteBuf buffer, ArmorTrim value) {
            ArmorTrimMaterial.TYPE1_21_5.write(buffer, value.material);
            ArmorTrimPattern.TYPE1_21_5.write(buffer, value.pattern);
        }

        public ArmorTrim read(ByteBuf buffer) {
            Holder material = ArmorTrimMaterial.TYPE1_21_5.read(buffer);
            Holder pattern = ArmorTrimPattern.TYPE1_21_5.read(buffer);
            return new ArmorTrim((Holder<ArmorTrimMaterial>)material, (Holder<ArmorTrimPattern>)pattern);
        }
    };

    public ArmorTrim(Holder<ArmorTrimMaterial> material, Holder<ArmorTrimPattern> pattern) {
        this(material, pattern, true);
    }

    public ArmorTrim rewrite(UserConnection connection, Protocol<?, ?, ?, ?> protocol, boolean clientbound) {
        Holder pattern;
        Holder material = this.material;
        if (material.isDirect()) {
            material = Holder.of((Object)((Object)((ArmorTrimMaterial)((Object)material.value())).rewrite(connection, protocol, clientbound)));
        }
        if ((pattern = this.pattern).isDirect()) {
            pattern = Holder.of((Object)((ArmorTrimPattern)pattern.value()).rewrite(connection, protocol, clientbound));
        }
        return new ArmorTrim((Holder<ArmorTrimMaterial>)material, pattern, this.showInTooltip);
    }
}

