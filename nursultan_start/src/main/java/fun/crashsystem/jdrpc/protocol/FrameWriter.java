/*
 * Decompiled with CFR 0.152.
 */
package fun.crashsystem.jdrpc.protocol;

import fun.crashsystem.jdrpc.protocol.Frame;
import java.io.IOException;
import java.io.OutputStream;

public final class FrameWriter {
    private FrameWriter() {
    }

    public static void write(OutputStream output, Frame frame) throws IOException {
        byte[] bytes = frame.encode();
        output.write(bytes);
        output.flush();
    }
}

