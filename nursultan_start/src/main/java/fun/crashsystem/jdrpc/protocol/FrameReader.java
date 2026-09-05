/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  fun.crashsystem.jdrpc.libs.com.google.gson.JsonObject
 */
package fun.crashsystem.jdrpc.protocol;

import fun.crashsystem.jdrpc.libs.com.google.gson.JsonObject;
import fun.crashsystem.jdrpc.protocol.Frame;
import fun.crashsystem.jdrpc.protocol.FrameSupport;
import fun.crashsystem.jdrpc.protocol.OpCode;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class FrameReader {
    private FrameReader() {
    }

    public static Frame read(InputStream input) throws IOException {
        byte[] header = FrameReader.readExact(input, 8);
        ByteBuffer headerBuf = ByteBuffer.wrap(header).order(ByteOrder.LITTLE_ENDIAN);
        int opCode = headerBuf.getInt();
        int length = headerBuf.getInt();
        OpCode op = OpCode.fromCode(opCode);
        if (op == null) {
            throw new IllegalArgumentException("Unknown opcode: " + opCode);
        }
        JsonObject data = null;
        try {
            FrameSupport.validatePayloadLength(length);
            if (length > 0) {
                byte[] payload = FrameReader.readExact(input, length);
                data = FrameSupport.parseJsonObject(payload);
            }
        }
        catch (FrameSupport.FrameFormatException e) {
            throw new IOException("Invalid frame payload", e);
        }
        return new Frame(op, data);
    }

    private static byte[] readExact(InputStream input, int count) throws IOException {
        int read;
        byte[] buffer = new byte[count];
        for (int offset = 0; offset < count; offset += read) {
            read = input.read(buffer, offset, count - offset);
            if (read != -1) continue;
            throw new EOFException("Unexpected end of stream after " + offset + "/" + count + " bytes");
        }
        return buffer;
    }
}

