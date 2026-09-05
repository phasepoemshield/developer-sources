/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  fun.crashsystem.jdrpc.libs.com.google.gson.JsonElement
 *  fun.crashsystem.jdrpc.libs.com.google.gson.JsonObject
 *  fun.crashsystem.jdrpc.libs.com.google.gson.JsonParseException
 *  fun.crashsystem.jdrpc.libs.com.google.gson.JsonParser
 */
package fun.crashsystem.jdrpc.protocol;

import fun.crashsystem.jdrpc.libs.com.google.gson.JsonElement;
import fun.crashsystem.jdrpc.libs.com.google.gson.JsonObject;
import fun.crashsystem.jdrpc.libs.com.google.gson.JsonParseException;
import fun.crashsystem.jdrpc.libs.com.google.gson.JsonParser;
import fun.crashsystem.jdrpc.protocol.FrameSupport;
import java.nio.charset.StandardCharsets;

public final class FrameSupport {
    public static final int HEADER_SIZE = 8;
    public static final int MAX_FRAME_SIZE = 65536;

    private FrameSupport() {
    }

    public static void validateAvailablePayload(int available, int expected) throws FrameFormatException {
        if (available < expected) {
            throw new FrameFormatException("Frame payload truncated: expected " + expected + " bytes, got " + available);
        }
    }

    public static int validatePayloadLength(int length) throws FrameFormatException {
        if (length < 0) {
            throw new FrameFormatException("Frame payload length must be >= 0, got " + length);
        }
        if (length > 65536) {
            throw new FrameFormatException("Frame payload length exceeds limit 65536, got " + length);
        }
        return length;
    }

    public static JsonObject parseJsonObject(byte[] payload) throws FrameFormatException {
        try {
            JsonElement parsed = JsonParser.parseString((String)new String(payload, StandardCharsets.UTF_8));
            if (!parsed.isJsonObject()) {
                throw new FrameFormatException("Frame payload must be a JSON object");
            }
            return parsed.getAsJsonObject();
        }
        catch (JsonParseException | IllegalStateException e) {
            throw new FrameFormatException("Invalid frame JSON payload", e);
        }
    }
}

