/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.configbuilder.entry.serializer.ValueSerializer
 */
package de.maxhenkel.voicechat.configbuilder.custom.serializer;

import de.maxhenkel.voicechat.configbuilder.entry.serializer.ValueSerializer;
import java.util.UUID;

public class UUIDSerializer
implements ValueSerializer<UUID> {
    public static final UUIDSerializer INSTANCE = new UUIDSerializer();

    public UUID deserialize(String string) {
        return UUID.fromString(string);
    }

    public String serialize(UUID uUID) {
        return uUID.toString();
    }
}

