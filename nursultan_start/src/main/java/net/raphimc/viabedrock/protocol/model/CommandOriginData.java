/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.CommandOriginType
 */
package net.raphimc.viabedrock.protocol.model;

import java.util.UUID;
import net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.CommandOriginType;

public record CommandOriginData(CommandOriginType type, UUID uuid, String requestId, long uniquePlayerId) {
    public CommandOriginData(CommandOriginType type, UUID uuid, String requestId) {
        this(type, uuid, requestId, 0L);
    }
}

