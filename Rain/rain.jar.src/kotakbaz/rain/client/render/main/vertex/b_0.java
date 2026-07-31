/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client.render.main.vertex;

import it.unimi.dsi.fastutil.ints.IntConsumer;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import kotakbaz.rain.client.render.main.buffer.A;
import kotakbaz.rain.client.render.main.buffer.a_0;
import kotakbaz.rain.client.render.main.vertex.a;
import kotakbaz.rain.client.render.main.vertex.b;
import lombok.Generated;
import net.minecraft.util.math.MathHelper;
import org.lwjgl.system.MemoryUtil;

/*
 * Renamed from kotakbaz.rain.client.render.main.vertex.B
 */
public final class b_0 {
    private final int a;
    private final int A;
    private final b b;
    private kotakbaz.rain.client.render.main.buffer.b B;
    private a c = kotakbaz.rain.client.render.main.vertex.a.a;
    private int C;
    public static int[] D;

    public boolean isLargeEnough(int requiredSize) {
        boolean bl;
        if (requiredSize <= this.C) {
            boolean bl2 = D[0];
            bl2 += D[1];
            bl = bl2 ^= D[2];
        } else {
            boolean bl3 = D[3];
            bl3 ^= D[4];
            bl = bl3 += D[5];
        }
        return bl;
    }

    public kotakbaz.rain.client.render.main.buffer.b getIndexBuffer(int requiredSize, boolean standalone) {
        if (standalone) {
            return this.generateIndexBuffer(requiredSize);
        }
        if (!this.isLargeEnough(requiredSize)) {
            if (this.B != null) {
                this.B.close();
            }
            this.B = this.generateIndexBuffer(requiredSize);
            this.C = requiredSize;
        }
        return this.B;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private kotakbaz.rain.client.render.main.buffer.b generateIndexBuffer(int requiredSize) {
        long l2 = 7624600591616510352L;
        long l3 = 153605887866000862L;
        long l4 = 1051838552226485370L;
        long l5 = -4326994073566638462L;
        int n2 = D[6];
        n2 ^= D[7];
        requiredSize = MathHelper.roundUpToMultiple((int)(requiredSize * (n2 += D[8])), (int)this.A);
        int n3 = D[9];
        n3 += D[10];
        long l6 = l2;
        int n4 = D[12];
        n4 += D[13];
        l2 = l6 ^ ((long)(requiredSize / this.A) << (n3 += D[11]) ^ l6) & -1L << (n4 += D[14]);
        int n5 = D[15];
        n5 ^= D[16];
        a a2 = kotakbaz.rain.client.render.main.vertex.a.smallestFor((int)(l2 >>> (n5 ^= D[17])) * this.a);
        int n6 = D[18];
        n6 += D[19];
        ByteBuffer byteBuffer = MemoryUtil.memAlloc((int)MathHelper.roundUpToMultiple((int)(requiredSize * a2.b), (int)(n6 -= D[20])));
        try {
            this.c = a2;
            IntConsumer intConsumer = this.getIndexConsumer(byteBuffer);
            long l7 = l5;
            int n7 = D[21];
            n7 += D[22];
            l5 = l7 ^ (0L ^ l7) & -1L << (n7 += D[23]);
            while (true) {
                int n8 = D[24];
                n8 += D[25];
                if ((int)(l5 >>> (n8 -= D[26])) >= requiredSize) break;
                int n9 = D[27];
                n9 ^= D[28];
                this.b.accept(intConsumer, (int)(l5 >>> (n9 += D[29])) * this.a / this.A);
                int n10 = D[30];
                n10 ^= D[31];
                n10 ^= D[32];
                int n11 = D[33];
                n11 += D[34];
                long l8 = l5;
                int n12 = D[36];
                n12 += D[37];
                l5 = l8 ^ ((long)((int)(l5 >>> n10) + this.A) << (n11 -= D[35]) ^ l8) & -1L << (n12 ^= D[38]);
            }
            byteBuffer.flip();
            kotakbaz.rain.client.render.main.buffer.b b2 = new kotakbaz.rain.client.render.main.buffer.b(byteBuffer, kotakbaz.rain.client.render.main.buffer.A.A, a_0.A);
            return b2;
        }
        finally {
            MemoryUtil.memFree((Buffer)byteBuffer);
        }
    }

    private IntConsumer getIndexConsumer(ByteBuffer indexBuffer) {
        if (this.c == kotakbaz.rain.client.render.main.vertex.a.a) {
            return index -> indexBuffer.putShort((short)index);
        }
        return indexBuffer::putInt;
    }

    @Generated
    public b_0(int vertexCountInShape, int vertexCountInTriangulated, b triangulator) {
        this.a = vertexCountInShape;
        this.A = vertexCountInTriangulated;
        this.b = triangulator;
    }

    @Generated
    public a getIndexType() {
        return this.c;
    }

    static {
        b_0.a();
    }

    public static void a() {
        D = new int[0xE952 ^ 0xE975];
        b_0.D[0xDD39 ^ 0xDD29] = 0xDD1B ^ 0xDD29;
        b_0.D[0x36CB ^ 0x36CF] = 0xFFFFC91C ^ 0x36CF;
        b_0.D[0x2348 ^ 0x2342] = 0x2312 ^ 0x2342;
        b_0.D[0xFF81 ^ 0xFFA5] = 0xFFB9 ^ 0xFFA5;
        b_0.D[0x8F47 ^ 0x8F45] = 0x8F5E ^ 0x8F45;
        b_0.D[0x54B4 ^ 0x54BA] = 0xFFFFAB7C ^ 0x54BA;
        b_0.D[0x535B ^ 0x537D] = 0xFFFFACEE ^ 0x537D;
        b_0.D[0x8F10 ^ 0x8F13] = 0xFFFF70FE ^ 0x8F13;
        b_0.D[0x5FD2 ^ 0x5FDD] = 0x5FC2 ^ 0x5FDD;
        b_0.D[0xC0D7 ^ 0xC0C2] = 0xC0C7 ^ 0xC0C2;
        b_0.D[0xC655 ^ 0xC674] = 0xC690 ^ 0xC674;
        b_0.D[0xAAF0 ^ 0xAAE2] = 0xFFFF5517 ^ 0xAAE2;
        b_0.D[0xA1F4 ^ 0xA1EA] = 0xFFFF5E6A ^ 0xA1EA;
        b_0.D[0xDB18 ^ 0xDB09] = 0xDB04 ^ 0xDB09;
        b_0.D[0xD30C ^ 0xD30A] = 0xD33C ^ 0xD30A;
        b_0.D[0x2B5E ^ 0x2B55] = 0x2B1B ^ 0x2B55;
        b_0.D[0x7698 ^ 0x76BA] = 0xFFFF8931 ^ 0x76BA;
        b_0.D[0x6986 ^ 0x698F] = 0xFFFF960D ^ 0x698F;
        b_0.D[0xA12B ^ 0xA13D] = 0xA11C ^ 0xA13D;
        b_0.D[0xC8E5 ^ 0xC8FF] = 0xFFFF3736 ^ 0xC8FF;
        b_0.D[0xFAB3 ^ 0xFAA0] = 0xFAE7 ^ 0xFAA0;
        b_0.D[0xC500 ^ 0xC507] = 0xFFFF3AF9 ^ 0xC507;
        b_0.D[0x97DB ^ 0x97DB] = 0x978B ^ 0x97DB;
        b_0.D[0x3031 ^ 0x3026] = 0xFFFFCFDC ^ 0x3026;
        b_0.D[0x2D7D ^ 0x2D5E] = 0x2D11 ^ 0x2D5E;
        b_0.D[0x3DB9 ^ 0x3DB1] = 0x3D8B ^ 0x3DB1;
        b_0.D[0x6D62 ^ 0x6D6F] = 0xFFFF92F2 ^ 0x6D6F;
        b_0.D[0xFF15 ^ 0xFF0A] = 0xFF2E ^ 0xFF0A;
        b_0.D[0xF9DD ^ 0xF9F8] = 0xFFFF066F ^ 0xF9F8;
        b_0.D[0x4E0D ^ 0x4E11] = 0xFFFFB1AC ^ 0x4E11;
        b_0.D[0xCA04 ^ 0xCA19] = 0xFFFF35EA ^ 0xCA19;
        b_0.D[0x7719 ^ 0x771C] = 0xFFFF88DE ^ 0x771C;
        b_0.D[0xDF78 ^ 0xDF60] = 0xFFFF2017 ^ 0xDF60;
        b_0.D[0x8999 ^ 0x8980] = 0x89F2 ^ 0x8980;
        b_0.D[0x2B12 ^ 0x2B1E] = 0x2BA3 ^ 0x2B1E;
        b_0.D[0x12C8 ^ 0x12D3] = 0xFFFFED43 ^ 0x12D3;
        b_0.D[0x27F7 ^ 0x27E3] = 0x27DB ^ 0x27E3;
        b_0.D[0x2B8 ^ 0x298] = 0xFFFFFD1C ^ 0x298;
        b_0.D[0x102A8 ^ 0x102A9] = 0xFFFEFD63 ^ 0x102A9;
    }
}

