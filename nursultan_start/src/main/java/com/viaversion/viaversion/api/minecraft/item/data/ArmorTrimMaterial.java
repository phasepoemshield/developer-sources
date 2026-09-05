/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.codec.Ops
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.misc.HolderType
 *  com.viaversion.viaversion.libs.fastutil.objects.Object2ObjectArrayMap
 *  com.viaversion.viaversion.util.Copyable
 *  com.viaversion.viaversion.util.Key
 *  com.viaversion.viaversion.util.Rewritable
 *  io.netty.buffer.ByteBuf
 */
package com.viaversion.viaversion.api.minecraft.item.data;

import com.viaversion.nbt.tag.Tag;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.codec.Ops;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.misc.HolderType;
import com.viaversion.viaversion.libs.fastutil.objects.Object2ObjectArrayMap;
import com.viaversion.viaversion.util.Copyable;
import com.viaversion.viaversion.util.Key;
import com.viaversion.viaversion.util.Rewritable;
import io.netty.buffer.ByteBuf;
import java.util.Map;

public record ArmorTrimMaterial(String assetName, int itemId, float itemModelIndex, Map<String, String> overrideArmorMaterials, Tag description) implements Copyable,
Rewritable
{
    public static final HolderType<ArmorTrimMaterial> TYPE1_20_5 = new HolderType<ArmorTrimMaterial>(){

        public ArmorTrimMaterial readDirect(ByteBuf buffer) {
            String assetName = (String)Types.STRING.read(buffer);
            int item = Types.VAR_INT.readPrimitive(buffer);
            float itemModelIndex = buffer.readFloat();
            int overrideArmorMaterialsSize = Types.VAR_INT.readPrimitive(buffer);
            Object2ObjectArrayMap overrideArmorMaterials = new Object2ObjectArrayMap();
            for (int i = 0; i < overrideArmorMaterialsSize; ++i) {
                int key = Types.VAR_INT.readPrimitive(buffer);
                String value = (String)Types.STRING.read(buffer);
                overrideArmorMaterials.put(Integer.toString(key), value);
            }
            Tag description = (Tag)Types.TAG.read(buffer);
            return new ArmorTrimMaterial(assetName, item, itemModelIndex, (Map<String, String>)overrideArmorMaterials, description);
        }

        public void writeDirect(ByteBuf buffer, ArmorTrimMaterial value) {
            Types.STRING.write(buffer, (Object)value.assetName());
            Types.VAR_INT.writePrimitive(buffer, value.itemId());
            buffer.writeFloat(value.itemModelIndex());
            Types.VAR_INT.writePrimitive(buffer, value.overrideArmorMaterials().size());
            for (Map.Entry<String, String> entry : value.overrideArmorMaterials().entrySet()) {
                Types.VAR_INT.writePrimitive(buffer, Integer.parseInt(entry.getKey()));
                Types.STRING.write(buffer, (Object)entry.getValue());
            }
            Types.TAG.write(buffer, (Object)value.description());
        }
    };
    public static final HolderType<ArmorTrimMaterial> TYPE1_21_2 = new HolderType<ArmorTrimMaterial>(){

        public ArmorTrimMaterial readDirect(ByteBuf buffer) {
            String assetName = (String)Types.STRING.read(buffer);
            int item = Types.VAR_INT.readPrimitive(buffer);
            float itemModelIndex = buffer.readFloat();
            int overrideArmorMaterialsSize = Types.VAR_INT.readPrimitive(buffer);
            Object2ObjectArrayMap overrideArmorMaterials = new Object2ObjectArrayMap();
            for (int i = 0; i < overrideArmorMaterialsSize; ++i) {
                String key = (String)Types.STRING.read(buffer);
                String value = (String)Types.STRING.read(buffer);
                overrideArmorMaterials.put(key, value);
            }
            Tag description = (Tag)Types.TAG.read(buffer);
            return new ArmorTrimMaterial(assetName, item, itemModelIndex, (Map<String, String>)overrideArmorMaterials, description);
        }

        public void writeDirect(ByteBuf buffer, ArmorTrimMaterial value) {
            Types.STRING.write(buffer, (Object)value.assetName());
            Types.VAR_INT.writePrimitive(buffer, value.itemId());
            buffer.writeFloat(value.itemModelIndex());
            Types.VAR_INT.writePrimitive(buffer, value.overrideArmorMaterials().size());
            for (Map.Entry<String, String> entry : value.overrideArmorMaterials().entrySet()) {
                Types.STRING.write(buffer, (Object)entry.getKey());
                Types.STRING.write(buffer, (Object)entry.getValue());
            }
            Types.TAG.write(buffer, (Object)value.description());
        }
    };
    public static final HolderType<ArmorTrimMaterial> TYPE1_21_4 = new HolderType<ArmorTrimMaterial>(){

        public ArmorTrimMaterial readDirect(ByteBuf buffer) {
            String assetName = (String)Types.STRING.read(buffer);
            int item = Types.VAR_INT.readPrimitive(buffer);
            int overrideArmorMaterialsSize = Types.VAR_INT.readPrimitive(buffer);
            Object2ObjectArrayMap overrideArmorMaterials = new Object2ObjectArrayMap();
            for (int i = 0; i < overrideArmorMaterialsSize; ++i) {
                String key = (String)Types.STRING.read(buffer);
                String value = (String)Types.STRING.read(buffer);
                overrideArmorMaterials.put(key, value);
            }
            Tag description = (Tag)Types.TAG.read(buffer);
            return new ArmorTrimMaterial(assetName, item, (Map<String, String>)overrideArmorMaterials, description);
        }

        public void writeDirect(ByteBuf buffer, ArmorTrimMaterial value) {
            Types.STRING.write(buffer, (Object)value.assetName());
            Types.VAR_INT.writePrimitive(buffer, value.itemId());
            Types.VAR_INT.writePrimitive(buffer, value.overrideArmorMaterials().size());
            for (Map.Entry<String, String> entry : value.overrideArmorMaterials().entrySet()) {
                Types.STRING.write(buffer, (Object)entry.getKey());
                Types.STRING.write(buffer, (Object)entry.getValue());
            }
            Types.TAG.write(buffer, (Object)value.description());
        }
    };
    public static final HolderType<ArmorTrimMaterial> TYPE1_21_5 = new HolderType<ArmorTrimMaterial>(){

        public ArmorTrimMaterial readDirect(ByteBuf buffer) {
            String assetName = (String)Types.STRING.read(buffer);
            int overrideArmorMaterialsSize = Types.VAR_INT.readPrimitive(buffer);
            Object2ObjectArrayMap overrideArmorMaterials = new Object2ObjectArrayMap();
            for (int i = 0; i < overrideArmorMaterialsSize; ++i) {
                String key = (String)Types.STRING.read(buffer);
                String value = (String)Types.STRING.read(buffer);
                overrideArmorMaterials.put(key, value);
            }
            Tag description = (Tag)Types.TAG.read(buffer);
            return new ArmorTrimMaterial(assetName, (Map<String, String>)overrideArmorMaterials, description);
        }

        protected Key identifier(Ops ops, int id) {
            return ops.context().registryAccess().registryKey("trim_material", id);
        }

        public void writeDirect(ByteBuf buffer, ArmorTrimMaterial value) {
            Types.STRING.write(buffer, (Object)value.assetName());
            Types.VAR_INT.writePrimitive(buffer, value.overrideArmorMaterials().size());
            for (Map.Entry<String, String> entry : value.overrideArmorMaterials().entrySet()) {
                Types.STRING.write(buffer, (Object)entry.getKey());
                Types.STRING.write(buffer, (Object)entry.getValue());
            }
            Types.TAG.write(buffer, (Object)value.description());
        }

        public void writeDirect(Ops ops, ArmorTrimMaterial object) {
            ops.writeMap(map -> {
                map.write("asset_name", Types.STRING, (Object)object.assetName());
                if (!object.overrideArmorMaterials.isEmpty()) {
                    map.writeMap("override_armor_assets", materials -> {
                        for (Map.Entry<String, String> entry : object.overrideArmorMaterials.entrySet()) {
                            materials.write(Types.IDENTIFIER, (Object)Key.of((String)entry.getKey()), Types.STRING, (Object)entry.getValue());
                        }
                    });
                }
                map.write("description", Types.TEXT_COMPONENT_TAG, (Object)object.description());
            });
        }
    };

    public ArmorTrimMaterial(String assetName, int itemId, Map<String, String> overrideArmorMaterials, Tag description) {
        this(assetName, itemId, 0.0f, overrideArmorMaterials, description);
    }

    public ArmorTrimMaterial(String assetName, Map<String, String> overrideArmorMaterials, Tag description) {
        this(assetName, 0, 0.0f, overrideArmorMaterials, description);
    }

    public ArmorTrimMaterial rewrite(UserConnection connection, Protocol<?, ?, ?, ?> protocol, boolean clientbound) {
        return new ArmorTrimMaterial(this.assetName, Rewritable.rewriteItem(protocol, (boolean)clientbound, (int)this.itemId), this.itemModelIndex, this.overrideArmorMaterials, this.description);
    }

    public ArmorTrimMaterial copy() {
        return new ArmorTrimMaterial(this.assetName, this.itemId, this.itemModelIndex, (Map<String, String>)new Object2ObjectArrayMap(this.overrideArmorMaterials), this.description);
    }
}

