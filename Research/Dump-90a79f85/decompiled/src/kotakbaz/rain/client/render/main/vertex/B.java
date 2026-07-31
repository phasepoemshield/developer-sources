/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.IntConsumer
 *  lombok.Generated
 *  net.minecraft.class_3532
 *  org.lwjgl.system.MemoryUtil
 */
package kotakbaz.rain.client.render.main.vertex;

import it.unimi.dsi.fastutil.ints.IntConsumer;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import kotakbaz.rain.client.render.main.buffer.A;
import kotakbaz.rain.client.render.main.buffer.b;
import kotakbaz.rain.client.render.main.vertex.a_0;
import kotakbaz.rain.client.render.main.vertex.b_0;
import lombok.Generated;
import net.minecraft.class_3532;
import org.lwjgl.system.MemoryUtil;

public final class B {
    private final int a;
    private final int A;
    private final b_0 b;
    private b B;
    private a_0 c = a_0.a;
    private int C;
    public static int[] D;

    public boolean isLargeEnough(int n) {
        boolean bl;
        if (n <= this.C) {
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

    public b getIndexBuffer(int n, boolean bl) {
        if (bl) {
            return this.generateIndexBuffer(n);
        }
        if (!this.isLargeEnough(n)) {
            if (this.B != null) {
                this.B.close();
            }
            this.B = this.generateIndexBuffer(n);
            this.C = n;
        }
        return this.B;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private b generateIndexBuffer(int n) {
        long l = 7624600591616510352L;
        long l2 = 153605887866000862L;
        long l3 = 1051838552226485370L;
        long l4 = -4326994073566638462L;
        int n2 = D[6];
        n2 ^= D[7];
        n = class_3532.method_28139((int)(n * (n2 += D[8])), (int)this.A);
        int n3 = D[9];
        n3 += D[10];
        long l5 = l;
        int n4 = D[12];
        n4 += D[13];
        l = l5 ^ ((long)(n / this.A) << (n3 += D[11]) ^ l5) & -1L << (n4 += D[14]);
        int n5 = D[15];
        n5 ^= D[16];
        a_0 a_02 = a_0.smallestFor((int)(l >>> (n5 ^= D[17])) * this.a);
        int n6 = D[18];
        n6 += D[19];
        ByteBuffer byteBuffer = MemoryUtil.memAlloc((int)class_3532.method_28139((int)(n * a_02.b), (int)(n6 -= D[20])));
        try {
            this.c = a_02;
            IntConsumer intConsumer = this.getIndexConsumer(byteBuffer);
            long l6 = l4;
            int n7 = D[21];
            n7 += D[22];
            l4 = l6 ^ (0L ^ l6) & -1L << (n7 += D[23]);
            while (true) {
                int n8 = D[24];
                n8 += D[25];
                if ((int)(l4 >>> (n8 -= D[26])) >= n) break;
                int n9 = D[27];
                n9 ^= D[28];
                this.b.accept(intConsumer, (int)(l4 >>> (n9 += D[29])) * this.a / this.A);
                int n10 = D[30];
                n10 ^= D[31];
                n10 ^= D[32];
                int n11 = D[33];
                n11 += D[34];
                long l7 = l4;
                int n12 = D[36];
                n12 += D[37];
                l4 = l7 ^ ((long)((int)(l4 >>> n10) + this.A) << (n11 -= D[35]) ^ l7) & -1L << (n12 ^= D[38]);
            }
            byteBuffer.flip();
            b b2 = new b(byteBuffer, kotakbaz.rain.client.render.main.buffer.A.A, kotakbaz.rain.client.render.main.buffer.a_0.A);
            return b2;
        }
        finally {
            MemoryUtil.memFree((Buffer)byteBuffer);
        }
    }

    private IntConsumer getIndexConsumer(ByteBuffer byteBuffer) {
        if (this.c == a_0.a) {
            return n -> byteBuffer.putShort((short)n);
        }
        return byteBuffer::putInt;
    }

    @Generated
    public B(int n, int n2, b_0 b_02) {
        super();
        this.a = n;
        this.A = n2;
        this.b = b_02;
    }

    @Generated
    public a_0 getIndexType() {
        return this.c;
    }

    static {
        kotakbaz.rain.client.render.main.vertex.B.a();
    }

    public static void a() {
        D = new int[0xE952 ^ 0xE975];
        kotakbaz.rain.client.render.main.vertex.B.D[0xDD39 ^ 0xDD29] = 0xDD1B ^ 0xDD29;
        kotakbaz.rain.client.render.main.vertex.B.D[0x36CB ^ 0x36CF] = 0xFFFFC91C ^ 0x36CF;
        kotakbaz.rain.client.render.main.vertex.B.D[0x2348 ^ 0x2342] = 0x2312 ^ 0x2342;
        kotakbaz.rain.client.render.main.vertex.B.D[0xFF81 ^ 0xFFA5] = 0xFFB9 ^ 0xFFA5;
        kotakbaz.rain.client.render.main.vertex.B.D[0x8F47 ^ 0x8F45] = 0x8F5E ^ 0x8F45;
        kotakbaz.rain.client.render.main.vertex.B.D[0x54B4 ^ 0x54BA] = 0xFFFFAB7C ^ 0x54BA;
        kotakbaz.rain.client.render.main.vertex.B.D[0x535B ^ 0x537D] = 0xFFFFACEE ^ 0x537D;
        kotakbaz.rain.client.render.main.vertex.B.D[0x8F10 ^ 0x8F13] = 0xFFFF70FE ^ 0x8F13;
        kotakbaz.rain.client.render.main.vertex.B.D[0x5FD2 ^ 0x5FDD] = 0x5FC2 ^ 0x5FDD;
        kotakbaz.rain.client.render.main.vertex.B.D[0xC0D7 ^ 0xC0C2] = 0xC0C7 ^ 0xC0C2;
        kotakbaz.rain.client.render.main.vertex.B.D[0xC655 ^ 0xC674] = 0xC690 ^ 0xC674;
        kotakbaz.rain.client.render.main.vertex.B.D[0xAAF0 ^ 0xAAE2] = 0xFFFF5517 ^ 0xAAE2;
        kotakbaz.rain.client.render.main.vertex.B.D[0xA1F4 ^ 0xA1EA] = 0xFFFF5E6A ^ 0xA1EA;
        kotakbaz.rain.client.render.main.vertex.B.D[0xDB18 ^ 0xDB09] = 0xDB04 ^ 0xDB09;
        kotakbaz.rain.client.render.main.vertex.B.D[0xD30C ^ 0xD30A] = 0xD33C ^ 0xD30A;
        kotakbaz.rain.client.render.main.vertex.B.D[0x2B5E ^ 0x2B55] = 0x2B1B ^ 0x2B55;
        kotakbaz.rain.client.render.main.vertex.B.D[0x7698 ^ 0x76BA] = 0xFFFF8931 ^ 0x76BA;
        kotakbaz.rain.client.render.main.vertex.B.D[0x6986 ^ 0x698F] = 0xFFFF960D ^ 0x698F;
        kotakbaz.rain.client.render.main.vertex.B.D[0xA12B ^ 0xA13D] = 0xA11C ^ 0xA13D;
        kotakbaz.rain.client.render.main.vertex.B.D[0xC8E5 ^ 0xC8FF] = 0xFFFF3736 ^ 0xC8FF;
        kotakbaz.rain.client.render.main.vertex.B.D[0xFAB3 ^ 0xFAA0] = 0xFAE7 ^ 0xFAA0;
        kotakbaz.rain.client.render.main.vertex.B.D[0xC500 ^ 0xC507] = 0xFFFF3AF9 ^ 0xC507;
        kotakbaz.rain.client.render.main.vertex.B.D[0x97DB ^ 0x97DB] = 0x978B ^ 0x97DB;
        kotakbaz.rain.client.render.main.vertex.B.D[0x3031 ^ 0x3026] = 0xFFFFCFDC ^ 0x3026;
        kotakbaz.rain.client.render.main.vertex.B.D[0x2D7D ^ 0x2D5E] = 0x2D11 ^ 0x2D5E;
        kotakbaz.rain.client.render.main.vertex.B.D[0x3DB9 ^ 0x3DB1] = 0x3D8B ^ 0x3DB1;
        kotakbaz.rain.client.render.main.vertex.B.D[0x6D62 ^ 0x6D6F] = 0xFFFF92F2 ^ 0x6D6F;
        kotakbaz.rain.client.render.main.vertex.B.D[0xFF15 ^ 0xFF0A] = 0xFF2E ^ 0xFF0A;
        kotakbaz.rain.client.render.main.vertex.B.D[0xF9DD ^ 0xF9F8] = 0xFFFF066F ^ 0xF9F8;
        kotakbaz.rain.client.render.main.vertex.B.D[0x4E0D ^ 0x4E11] = 0xFFFFB1AC ^ 0x4E11;
        kotakbaz.rain.client.render.main.vertex.B.D[0xCA04 ^ 0xCA19] = 0xFFFF35EA ^ 0xCA19;
        kotakbaz.rain.client.render.main.vertex.B.D[0x7719 ^ 0x771C] = 0xFFFF88DE ^ 0x771C;
        kotakbaz.rain.client.render.main.vertex.B.D[0xDF78 ^ 0xDF60] = 0xFFFF2017 ^ 0xDF60;
        kotakbaz.rain.client.render.main.vertex.B.D[0x8999 ^ 0x8980] = 0x89F2 ^ 0x8980;
        kotakbaz.rain.client.render.main.vertex.B.D[0x2B12 ^ 0x2B1E] = 0x2BA3 ^ 0x2B1E;
        kotakbaz.rain.client.render.main.vertex.B.D[0x12C8 ^ 0x12D3] = 0xFFFFED43 ^ 0x12D3;
        kotakbaz.rain.client.render.main.vertex.B.D[0x27F7 ^ 0x27E3] = 0x27DB ^ 0x27E3;
        kotakbaz.rain.client.render.main.vertex.B.D[0x2B8 ^ 0x298] = 0xFFFFFD1C ^ 0x298;
        kotakbaz.rain.client.render.main.vertex.B.D[0x102A8 ^ 0x102A9] = 0xFFFEFD63 ^ 0x102A9;
    }
}

