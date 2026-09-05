/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.type.Type
 *  io.netty.buffer.ByteBuf
 *  net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.CommandOriginType
 *  net.raphimc.viabedrock.protocol.model.CommandOriginData
 */
package net.raphimc.viabedrock.protocol.types.model;

import com.viaversion.viaversion.api.type.Type;
import io.netty.buffer.ByteBuf;
import java.util.Locale;
import java.util.UUID;
import net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.CommandOriginType;
import net.raphimc.viabedrock.protocol.model.CommandOriginData;
import net.raphimc.viabedrock.protocol.types.BedrockTypes;

public class CommandOriginDataType
extends Type<CommandOriginData> {
    public CommandOriginDataType() {
        super(CommandOriginData.class);
    }

    public void write(ByteBuf buffer, CommandOriginData value) {
        BedrockTypes.STRING.write(buffer, (Object)value.type().name().toLowerCase(Locale.ROOT));
        BedrockTypes.UUID.write(buffer, (Object)value.uuid());
        BedrockTypes.STRING.write(buffer, (Object)value.requestId());
        buffer.writeLongLE(value.uniquePlayerId());
    }

    public CommandOriginData read(ByteBuf buffer) {
        String rawType = (String)BedrockTypes.STRING.read(buffer);
        CommandOriginType type = CommandOriginType.getByName((String)rawType);
        if (type == null) {
            throw new IllegalStateException("Unknown CommandOriginType: " + rawType);
        }
        UUID uuid = (UUID)BedrockTypes.UUID.read(buffer);
        String requestId = (String)BedrockTypes.STRING.read(buffer);
        long uniquePlayerId = buffer.readLongLE();
        return new CommandOriginData(type, uuid, requestId, uniquePlayerId);
    }
}

