/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  fun.crashsystem.jdrpc.libs.com.google.gson.JsonObject
 */
package fun.crashsystem.jdrpc.protocol;

import fun.crashsystem.jdrpc.libs.com.google.gson.JsonObject;
import fun.crashsystem.jdrpc.protocol.FrameSupport;
import fun.crashsystem.jdrpc.protocol.OpCode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;

public record Frame(OpCode op, JsonObject data) {
    public static Frame decode(byte[] bytes) {
        if (bytes.length < 8) {
            throw new IllegalArgumentException("Frame must be at least 8 bytes, got " + bytes.length);
        }
        ByteBuffer buffer = ByteBuffer.wrap(bytes).order(ByteOrder.LITTLE_ENDIAN);
        int opCode = buffer.getInt();
        int length = buffer.getInt();
        OpCode op = OpCode.fromCode(opCode);
        if (op == null) {
            throw new IllegalArgumentException("Unknown opcode: " + opCode);
        }
        JsonObject data = null;
        try {
            FrameSupport.validatePayloadLength(length);
            if (length > 0) {
                FrameSupport.validateAvailablePayload(buffer.remaining(), length);
                byte[] jsonBytes = new byte[length];
                buffer.get(jsonBytes);
                data = FrameSupport.parseJsonObject(jsonBytes);
            }
        }
        catch (FrameSupport.FrameFormatException e) {
            throw new IllegalArgumentException("Invalid frame: " + e.getMessage(), e);
        }
        return new Frame(op, data);
    }

    public byte[] encode() {
        byte[] jsonBytes = this.data != null ? this.data.toString().getBytes(StandardCharsets.UTF_8) : new byte[]{};
        try {
            FrameSupport.validatePayloadLength(jsonBytes.length);
        }
        catch (FrameSupport.FrameFormatException e) {
            throw new IllegalArgumentException("Invalid frame payload length: " + e.getMessage(), e);
        }
        ByteBuffer buffer = ByteBuffer.allocate(8 + jsonBytes.length).order(ByteOrder.LITTLE_ENDIAN);
        buffer.putInt(this.op.code());
        buffer.putInt(jsonBytes.length);
        buffer.put(jsonBytes);
        return buffer.array();
    }
}

