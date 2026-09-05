/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  minecraft.class01894
 *  minecraft.class08299
 *  minecraft.class08329
 *  net.fabricmc.fabric.api.attachment.v1.AttachmentType
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package net.fabricmc.fabric.impl.attachment;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import minecraft.class01894;
import minecraft.class08299;
import minecraft.class08329;
import net.fabricmc.fabric.api.attachment.v1.AttachmentType;
import net.fabricmc.fabric.impl.attachment.AttachmentRegistryImpl;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AttachmentSerializingImpl {
    private static final Logger LOGGER = LoggerFactory.getLogger((String)"fabric-data-attachment-api-v1");
    private static final Codec<AttachmentType<?>> TYPE_CODEC = class01894.N.comapFlatMap(class018942 -> {
        AttachmentType<?> attachmentType = AttachmentRegistryImpl.get(class018942);
        return attachmentType == null ? DataResult.error(() -> "Found unknown attachment type " + String.valueOf(class018942)) : (attachmentType.persistenceCodec() == null ? DataResult.error(() -> "Found non-permanent attachment type " + String.valueOf(class018942)) : DataResult.success(attachmentType));
    }, AttachmentType::identifier);
    private static final Codec<IdentityHashMap<AttachmentType<?>, Object>> CODEC = Codec.dispatchedMap(TYPE_CODEC, AttachmentType::persistenceCodec).promotePartial(string -> LOGGER.warn("Skipping invalid attachments: {}", string)).xmap(IdentityHashMap::new, Function.identity());

    public static @Nullable IdentityHashMap<AttachmentType<?>, Object> deserializeAttachmentData(@Nullable class08299 class082992) {
        return class082992 == null ? null : (IdentityHashMap)class082992.N("fabric:attachments", CODEC).filter(identityHashMap -> !identityHashMap.isEmpty()).orElse(null);
    }

    public static void serializeAttachmentData(class08329 class083292, @Nullable IdentityHashMap<AttachmentType<?>, Object> identityHashMap) {
        if (identityHashMap == null || identityHashMap.isEmpty()) {
            return;
        }
        IdentityHashMap identityHashMap2 = identityHashMap.entrySet().stream().filter(entry -> ((AttachmentType)entry.getKey()).persistenceCodec() != null).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (object, object2) -> object, IdentityHashMap::new));
        if (identityHashMap2.isEmpty()) {
            return;
        }
        class083292.N("fabric:attachments", CODEC, (Object)identityHashMap2);
    }

    public static boolean hasPersistentAttachments(@Nullable IdentityHashMap<AttachmentType<?>, ?> identityHashMap) {
        if (identityHashMap == null) {
            return false;
        }
        for (AttachmentType<?> attachmentType : identityHashMap.keySet()) {
            if (!attachmentType.isPersistent()) continue;
            return true;
        }
        return false;
    }
}

