/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.system.MemoryStack
 *  org.lwjgl.system.MemoryUtil
 */
package kotakbaz.rain.client.render.texture.utils;

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

public class a {
    public static int[] A;

    public a() {
        super();
    }

    public static ByteBuffer readStream(InputStream inputStream) {
        ReadableByteChannel readableByteChannel = Channels.newChannel(inputStream);
        if (readableByteChannel instanceof SeekableByteChannel) {
            SeekableByteChannel seekableByteChannel = (SeekableByteChannel)readableByteChannel;
            int n = A[0];
            n ^= A[1];
            return a.readChannel(readableByteChannel, (int)seekableByteChannel.size() + (n -= A[2]));
        }
        int n = A[3];
        n ^= A[4];
        return a.readChannel(readableByteChannel, n -= A[5]);
    }

    public static ByteBuffer readChannel(ReadableByteChannel readableByteChannel, int n) {
        ByteBuffer byteBuffer = MemoryUtil.memAlloc((int)n);
        try {
            while (true) {
                int n2 = A[6];
                n2 -= A[7];
                if (readableByteChannel.read(byteBuffer) == (n2 ^= A[8])) break;
                if (byteBuffer.hasRemaining()) continue;
                int n3 = A[9];
                n3 += A[10];
                byteBuffer = MemoryUtil.memRealloc((ByteBuffer)byteBuffer, (int)(byteBuffer.capacity() * (n3 ^= A[11])));
            }
            return byteBuffer;
        }
        catch (IOException iOException) {
            MemoryUtil.memFree((Buffer)byteBuffer);
            throw iOException;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void tryGenerate(ByteBuffer byteBuffer, InputStream inputStream, Consumer<MemoryStack> consumer) {
        try (MemoryStack memoryStack = MemoryStack.stackPush();){
            consumer.accept(memoryStack);
        }
        finally {
            MemoryUtil.memFree((Buffer)byteBuffer);
            if (inputStream != null) {
                inputStream.close();
            }
        }
    }

    public static byte getRed(int n) {
        int n2 = A[12];
        n2 -= A[13];
        int n3 = A[15];
        n3 -= A[16];
        return (byte)(n >> (n2 += A[14]) & (n3 ^= A[17]));
    }

    public static byte getGreen(int n) {
        int n2 = A[18];
        n2 ^= A[19];
        int n3 = A[21];
        n3 ^= A[22];
        return (byte)(n >> (n2 -= A[20]) & (n3 ^= A[23]));
    }

    public static byte getBlue(int n) {
        int n2 = A[24];
        n2 ^= A[25];
        return (byte)(n & (n2 -= A[26]));
    }

    public static byte getAlpha(int n) {
        int n2 = A[27];
        n2 += A[28];
        int n3 = A[30];
        n3 -= A[31];
        return (byte)(n >> (n2 -= A[29]) & (n3 ^= A[32]));
    }

    static {
        a.a();
    }

    public static void a() {
        A = new int[0xA2B6 ^ 0xA297];
        a.A[0x2AD5 ^ 0x2AC7] = 0x2A97 ^ 0x2AC7;
        a.A[0x4B19 ^ 0x4B15] = 0x4B73 ^ 0x4B15;
        a.A[0x5B1B ^ 0x5B19] = 0xFFFFA4D9 ^ 0x5B19;
        a.A[0x3F8D ^ 0x3F83] = 0xFFFFC028 ^ 0x3F83;
        a.A[0x107E4 ^ 0x107E1] = 0x107AB ^ 0x107E1;
        a.A[0x8811 ^ 0x8809] = 0xFFFF777C ^ 0x8809;
        a.A[0xB84F ^ 0xB847] = 0xFFFF4795 ^ 0xB847;
        a.A[0xA19B ^ 0xA181] = 0xFFFF5E21 ^ 0xA181;
        a.A[0xAEED ^ 0xAEF1] = 0xFFFF515F ^ 0xAEF1;
        a.A[0x3EB2 ^ 0x3EAC] = 0xFFFFC124 ^ 0x3EAC;
        a.A[0xB0B3 ^ 0xB0A4] = 0xFFFF4F51 ^ 0xB0A4;
        a.A[0x1274 ^ 0x126D] = 0xFFFFED87 ^ 0x126D;
        a.A[0x8206 ^ 0x820C] = 0xFFFF7DBB ^ 0x820C;
        a.A[0xB21C ^ 0xB211] = 0xB210 ^ 0xB211;
        a.A[0xF9F2 ^ 0xF9FB] = 0xF9A9 ^ 0xF9FB;
        a.A[0x641E ^ 0x6401] = 0x646D ^ 0x6401;
        a.A[0x109EF ^ 0x109E8] = 0xFFFEF66E ^ 0x109E8;
        a.A[0xE64B ^ 0xE66B] = 0xFFFF1988 ^ 0xE66B;
        a.A[0x10739 ^ 0x1073D] = 0x1077B ^ 0x1073D;
        a.A[0xBCAA ^ 0xBCBE] = 0xBC92 ^ 0xBCBE;
        a.A[0x6159 ^ 0x615A] = 0x4156 ^ 0x615A;
        a.A[0x98E ^ 0x99B] = 0xFFFFF686 ^ 0x99B;
        a.A[0x6D3B ^ 0x6D3A] = 0xFFFF92DD ^ 0x6D3A;
        a.A[0x6CF0 ^ 0x6CE0] = 0x6CD2 ^ 0x6CE0;
        a.A[0x5C95 ^ 0x5C86] = 0x5CE2 ^ 0x5C86;
        a.A[0xE543 ^ 0xE55E] = 0xE52D ^ 0xE55E;
        a.A[0x4CCA ^ 0x4CDB] = 0xFFFFB32D ^ 0x4CDB;
        a.A[0xDB10 ^ 0xDB10] = 0xDB36 ^ 0xDB10;
        a.A[0xD11A ^ 0xD101] = 0xD1DC ^ 0xD101;
        a.A[0x9E3A ^ 0x9E2C] = 0x9E3B ^ 0x9E2C;
        a.A[0xD037 ^ 0xD038] = 0xFFFF2F03 ^ 0xD038;
        a.A[0xAB3C ^ 0xAB37] = 0xAB3C ^ 0xAB37;
        a.A[0xCECE ^ 0xCEC8] = 0xFFFF317B ^ 0xCEC8;
    }
}

