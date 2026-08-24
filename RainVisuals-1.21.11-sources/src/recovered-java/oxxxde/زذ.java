/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.system.MemoryStack
 *  org.lwjgl.system.MemoryUtil
 */
package oxxxde;

import java.io.IOException;
import java.io.InputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.SeekableByteChannel;
import java.util.function.Consumer;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;

public class \u0632\u0630 {
    /*
     * WARNING - void declaration
     */
    public static ByteBuffer readChannel(ReadableByteChannel channel, int bufSize) throws IOException {
        ByteBuffer byteBuffer = MemoryUtil.memAlloc((int)bufSize);
        try {
            while (channel.read(byteBuffer) != -1) {
                if (byteBuffer.hasRemaining()) continue;
                byteBuffer = MemoryUtil.memRealloc((ByteBuffer)byteBuffer, (int)(byteBuffer.capacity() * 2));
            }
            return byteBuffer;
        }
        catch (IOException iOException) {
            void var2_2;
            MemoryUtil.memFree((Buffer)var2_2);
            throw iOException;
        }
    }

    public static byte getRed(int rgba) {
        return (byte)(rgba >> 16 & 0xFF);
    }

    public static byte getAlpha(int rgba) {
        return (byte)(rgba >> 24 & 0xFF);
    }

    public static byte getBlue(int rgba) {
        return (byte)(rgba & 0xFF);
    }

    public static ByteBuffer readStream(InputStream stream) throws IOException {
        ReadableByteChannel rbChannel = Channels.newChannel(stream);
        if (rbChannel instanceof SeekableByteChannel) {
            SeekableByteChannel sbChannel = (SeekableByteChannel)rbChannel;
            return \u0632\u0630.readChannel(rbChannel, (int)sbChannel.size() + 1);
        }
        return \u0632\u0630.readChannel(rbChannel, 8192);
    }

    public static byte getGreen(int rgba) {
        return (byte)(rgba >> 8 & 0xFF);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    public static void tryGenerate(ByteBuffer buffer, InputStream stream, Consumer<MemoryStack> consumer) throws IOException {
        block9: {
            try {
                void var3_3;
                MemoryStack memoryStack = MemoryStack.stackPush();
                try {
                    consumer.accept(memoryStack);
                }
                catch (Throwable var9) {
                    void var4_4;
                    if (memoryStack != null) {
                        try {
                            memoryStack.close();
                        }
                        catch (Throwable var8) {
                            var9.addSuppressed(var8);
                        }
                    }
                    throw var4_4;
                }
                if (memoryStack == null) break block9;
                var3_3.close();
            }
            catch (Throwable throwable) {
                MemoryUtil.memFree((Buffer)buffer);
                if (stream != null) {
                    void var1_1;
                    var1_1.close();
                }
                throw throwable;
            }
        }
        MemoryUtil.memFree((Buffer)buffer);
        if (stream != null) {
            stream.close();
        }
    }
}

