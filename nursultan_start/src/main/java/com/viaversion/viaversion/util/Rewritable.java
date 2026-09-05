/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.data.FullMappings
 *  com.viaversion.viaversion.api.data.MappingData
 *  com.viaversion.viaversion.api.data.Mappings
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.libs.fastutil.ints.Int2IntFunction
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package com.viaversion.viaversion.util;

import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.data.FullMappings;
import com.viaversion.viaversion.api.data.MappingData;
import com.viaversion.viaversion.api.data.Mappings;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.libs.fastutil.ints.Int2IntFunction;
import org.checkerframework.checker.nullness.qual.Nullable;

public interface Rewritable {
    public static @Nullable String unmappedIdentifier(FullMappings mappings, String mappedIdentifier) {
        if (mappings.mappedId(mappedIdentifier) == -1) {
            return mappedIdentifier;
        }
        return mappings.identifier(mappedIdentifier);
    }

    public static @Nullable String mappedIdentifier(FullMappings mappings, String identifier) {
        if (mappings.id(identifier) == -1) {
            return identifier;
        }
        return mappings.mappedIdentifier(identifier);
    }

    public Object rewrite(UserConnection var1, Protocol<?, ?, ?, ?> var2, boolean var3);

    public static Int2IntFunction blockRewriteFunction(Protocol<?, ?, ?, ?> protocol, boolean clientbound) {
        return protocol.getMappingData().getBlockMappings() == null ? Int2IntFunction.identity() : (clientbound ? arg_0 -> ((MappingData)protocol.getMappingData()).getNewBlockId(arg_0) : arg_0 -> ((MappingData)protocol.getMappingData()).getOldBlockId(arg_0));
    }

    public static Int2IntFunction soundRewriteFunction(Protocol<?, ?, ?, ?> protocol, boolean clientbound) {
        return protocol.getMappingData().getSoundMappings() == null ? Int2IntFunction.identity() : (clientbound ? arg_0 -> ((Mappings)protocol.getMappingData().getSoundMappings()).getNewId(arg_0) : arg_0 -> ((MappingData)protocol.getMappingData()).getOldSoundId(arg_0));
    }

    public static int rewriteDataComponentType(Protocol<?, ?, ?, ?> protocol, boolean clientbound, int typeId) {
        FullMappings mappings = protocol.getMappingData().getDataComponentSerializerMappings();
        return mappings == null ? typeId : (clientbound ? mappings.getNewId(typeId) : mappings.inverse().getNewId(typeId));
    }

    public static Int2IntFunction entityRewriteFunction(Protocol<?, ?, ?, ?> protocol, boolean clientbound) {
        return protocol.getMappingData().getEntityMappings() == null ? Int2IntFunction.identity() : (clientbound ? arg_0 -> ((FullMappings)protocol.getMappingData().getEntityMappings()).getNewId(arg_0) : arg_0 -> ((FullMappings)protocol.getMappingData().getEntityMappings().inverse()).getNewId(arg_0));
    }

    public static Int2IntFunction itemRewriteFunction(Protocol<?, ?, ?, ?> protocol, boolean clientbound) {
        return protocol.getMappingData().getItemMappings() == null ? Int2IntFunction.identity() : (clientbound ? arg_0 -> ((MappingData)protocol.getMappingData()).getNewItemId(arg_0) : arg_0 -> ((MappingData)protocol.getMappingData()).getOldItemId(arg_0));
    }

    public static int rewriteSound(Protocol<?, ?, ?, ?> protocol, boolean clientbound, int soundId) {
        return protocol.getMappingData().getSoundMappings() == null ? soundId : (clientbound ? protocol.getMappingData().getNewSoundId(soundId) : protocol.getMappingData().getOldSoundId(soundId));
    }

    public static String rewriteItem(Protocol<?, ?, ?, ?> protocol, boolean clientbound, String itemId) {
        FullMappings mappings = protocol.getMappingData().getFullItemMappings();
        return mappings == null ? itemId : (clientbound ? Rewritable.mappedIdentifier(mappings, itemId) : Rewritable.unmappedIdentifier(mappings, itemId));
    }

    public static int rewriteItem(Protocol<?, ?, ?, ?> protocol, boolean clientbound, int itemId) {
        return protocol.getMappingData().getItemMappings() == null ? itemId : (clientbound ? protocol.getMappingData().getNewItemId(itemId) : protocol.getMappingData().getOldItemId(itemId));
    }
}

