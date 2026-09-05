/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.libs.fastutil.ints.Int2IntMap
 *  com.viaversion.viaversion.libs.fastutil.ints.Int2IntMap$Entry
 *  com.viaversion.viaversion.libs.fastutil.ints.Int2IntOpenHashMap
 *  com.viaversion.viaversion.libs.fastutil.ints.Int2ObjectMap
 *  com.viaversion.viaversion.libs.fastutil.ints.Int2ObjectOpenHashMap
 *  io.netty.buffer.ByteBuf
 *  net.raphimc.viabedrock.protocol.model.EntityProperties
 */
package net.raphimc.viabedrock.protocol.types.entitydata;

import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.libs.fastutil.ints.Int2IntMap;
import com.viaversion.viaversion.libs.fastutil.ints.Int2IntOpenHashMap;
import com.viaversion.viaversion.libs.fastutil.ints.Int2ObjectMap;
import com.viaversion.viaversion.libs.fastutil.ints.Int2ObjectOpenHashMap;
import io.netty.buffer.ByteBuf;
import net.raphimc.viabedrock.protocol.model.EntityProperties;
import net.raphimc.viabedrock.protocol.types.BedrockTypes;

public class EntityPropertiesType
extends Type<EntityProperties> {
    public EntityPropertiesType() {
        super("EntityProperties", EntityProperties.class);
    }

    public void write(ByteBuf buffer, EntityProperties value) {
        BedrockTypes.UNSIGNED_VAR_INT.writePrimitive(buffer, value.intProperties().size());
        for (Int2IntMap.Entry entry : value.intProperties().int2IntEntrySet()) {
            BedrockTypes.UNSIGNED_VAR_INT.writePrimitive(buffer, entry.getIntKey());
            BedrockTypes.VAR_INT.writePrimitive(buffer, entry.getIntValue());
        }
        BedrockTypes.UNSIGNED_VAR_INT.writePrimitive(buffer, value.floatProperties().size());
        for (Int2IntMap.Entry entry : value.floatProperties().int2ObjectEntrySet()) {
            BedrockTypes.UNSIGNED_VAR_INT.writePrimitive(buffer, entry.getIntKey());
            BedrockTypes.FLOAT_LE.writePrimitive(buffer, ((Float)entry.getValue()).floatValue());
        }
    }

    public EntityProperties read(ByteBuf buffer) {
        int intPropertiesLength = BedrockTypes.UNSIGNED_VAR_INT.readPrimitive(buffer);
        Int2IntOpenHashMap intProperties = new Int2IntOpenHashMap(intPropertiesLength);
        for (int i = 0; i < intPropertiesLength; ++i) {
            int index = BedrockTypes.UNSIGNED_VAR_INT.readPrimitive(buffer);
            int value = BedrockTypes.VAR_INT.readPrimitive(buffer);
            intProperties.put(index, value);
        }
        int floatPropertiesLength = BedrockTypes.UNSIGNED_VAR_INT.readPrimitive(buffer);
        Int2ObjectOpenHashMap floatProperties = new Int2ObjectOpenHashMap(floatPropertiesLength);
        for (int i = 0; i < floatPropertiesLength; ++i) {
            int index = BedrockTypes.UNSIGNED_VAR_INT.readPrimitive(buffer);
            float value = BedrockTypes.FLOAT_LE.readPrimitive(buffer);
            floatProperties.put(index, (Object)Float.valueOf(value));
        }
        return new EntityProperties((Int2IntMap)intProperties, (Int2ObjectMap)floatProperties);
    }
}

