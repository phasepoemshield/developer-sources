/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client.render.main.vertex.format.uploader;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotakbaz.rain.client.render.main.buffer.b;
import kotakbaz.rain.client.render.main.vertex.element.a;
import kotakbaz.rain.client.render.main.vertex.format.A;
import kotakbaz.rain.client.render.main.vertex.format.a_0;
import org.lwjgl.opengl.GL30;

public class B
extends kotakbaz.rain.client.render.main.vertex.format.uploader.a_0 {
    public static int[] A;

    @Override
    public void applyFormatToBuffer(b vertexBuffer, a_0 vertexFormat) {
        A a2 = vertexFormat.getVertexFormatBufferOrCreate(() -> this.createVertexFormatBuffer(vertexFormat));
        GL30.glBindVertexArray((int)a2.glId());
        if (a2.buffer().get() != vertexBuffer) {
            vertexBuffer.bind();
            a2.buffer().set(vertexBuffer);
            boolean bl = A[0];
            bl -= A[1];
            this.setupBuffer(vertexFormat, bl ^= A[2]);
        }
    }

    @Override
    public A createVertexFormatBuffer(a_0 vertexFormat) {
        long l2 = -7270125825156690116L;
        long l3 = 9017446893835760287L;
        int n2 = A[3];
        n2 -= A[4];
        long l4 = l3;
        int n3 = A[6];
        n3 += A[7];
        l3 = l4 ^ ((long)GL30.glGenVertexArrays() << (n2 ^= A[5]) ^ l4) & -1L << (n3 -= A[8]);
        int n4 = A[9];
        n4 += A[10];
        GL30.glBindVertexArray((int)((int)(l3 >>> (n4 ^= A[11]))));
        boolean bl = A[12];
        bl ^= A[13];
        this.setupBuffer(vertexFormat, bl -= A[14]);
        int n5 = A[15];
        n5 ^= A[16];
        return new A((int)(l3 >>> (n5 ^= A[17])), vertexFormat, new AtomicReference<b>());
    }

    private void setupBuffer(a_0 format, boolean vbaIsNew) {
        long l2 = -3546223554555783962L;
        long l3 = -8466523554392485860L;
        long l4 = 869534826802765289L;
        long l5 = -5184445817006262294L;
        long l6 = 4606888611469345842L;
        int n2 = A[18];
        n2 += A[19];
        long l7 = l6;
        int n3 = A[21];
        n3 -= A[22];
        l6 = l7 ^ ((long)format.getVertexSize() << (n2 -= A[20]) ^ l7) & -1L << (n3 ^= A[23]);
        List<a> list = format.getVertexElements();
        long l8 = l6;
        int n4 = A[24];
        n4 += A[25];
        l6 = l8 ^ (0L ^ l8) & -1L >>> (n4 += A[26]);
        while ((int)l6 < list.size()) {
            a a2 = list.get((int)l6);
            if (vbaIsNew) {
                GL30.glEnableVertexAttribArray((int)((int)l6));
            }
            int n5 = A[27];
            n5 += A[28];
            if (a2.getType().glId() == (n5 -= A[29])) {
                boolean bl = A[30];
                bl += A[31];
                int n6 = A[33];
                n6 ^= A[34];
                GL30.glVertexAttribPointer((int)((int)l6), (int)a2.getCount(), (int)a2.getType().glId(), (boolean)(bl += A[32]), (int)((int)(l6 >>> (n6 -= A[35]))), (long)format.getElementOffset(a2));
            } else {
                int n7 = A[36];
                n7 -= A[37];
                GL30.glVertexAttribIPointer((int)((int)l6), (int)a2.getCount(), (int)a2.getType().glId(), (int)((int)(l6 >>> (n7 -= A[38]))), (long)format.getElementOffset(a2));
            }
            long l9 = l6;
            int n8 = A[39];
            n8 += A[40];
            int n9 = A[42];
            n9 += A[43];
            l6 = l9 ^ (l9 ^ l9 + (long)(n8 -= A[41])) & -1L >>> (n9 += A[44]);
        }
    }

    static {
        B.a();
    }

    public static void a() {
        A = new int[0x2243 ^ 0x226E];
        B.A[0xEFC7 ^ 0xEFC6] = 0xFFFF101D ^ 0xEFC6;
        B.A[0x5ED0 ^ 0x5EDD] = 0xFFFFA116 ^ 0x5EDD;
        B.A[0x105BA ^ 0x10598] = 0xFFFEFA1C ^ 0x10598;
        B.A[0x6B6A ^ 0x6B4A] = 0xFFFF94A6 ^ 0x6B4A;
        B.A[0xCD2B ^ 0xCD3A] = 0xCD15 ^ 0xCD3A;
        B.A[0x9177 ^ 0x9160] = 0xFFFF6EEB ^ 0x9160;
        B.A[0xC4A5 ^ 0xC481] = 0xFFFF3B19 ^ 0xC481;
        B.A[0xD144 ^ 0xD16E] = 0xFFFF2EB5 ^ 0xD16E;
        B.A[0xBC8A ^ 0xBC91] = 0xA8B5 ^ 0xBC91;
        B.A[0xA93F ^ 0xA93F] = 0xFFFF56CE ^ 0xA93F;
        B.A[0x4CB3 ^ 0x4C95] = 0xFFFFB33F ^ 0x4C95;
        B.A[0xEB12 ^ 0xEB0F] = 0xFFFF14C6 ^ 0xEB0F;
        B.A[0x691E ^ 0x6916] = 0xFFFF96C7 ^ 0x6916;
        B.A[0xA742 ^ 0xA76A] = 0xA701 ^ 0xA76A;
        B.A[0xFD07 ^ 0xFD12] = 0xFFFF02AF ^ 0xFD12;
        B.A[0xA5EB ^ 0xA5E1] = 0xFFFF5A6D ^ 0xA5E1;
        B.A[0xC431 ^ 0xC436] = 0xC420 ^ 0xC436;
        B.A[0x895A ^ 0x8949] = 0xFFFF7687 ^ 0x8949;
        B.A[0x553C ^ 0x5530] = 0x552E ^ 0x5530;
        B.A[0xB1BD ^ 0xB1A7] = 0xB1EB ^ 0xB1A7;
        B.A[0xA58B ^ 0xA599] = 0xA5DD ^ 0xA599;
        B.A[0x67BA ^ 0x67B9] = 0xFFFF9801 ^ 0x67B9;
        B.A[0xF7B2 ^ 0xF7AB] = 0xFFFF0854 ^ 0xF7AB;
        B.A[0x6FB6 ^ 0x6FAE] = 0xFFFF907B ^ 0x6FAE;
        B.A[0xBDD ^ 0xBD8] = 0xFFFFF46A ^ 0xBD8;
        B.A[0x8F45 ^ 0x8F5A] = 0xFFFF7094 ^ 0x8F5A;
        B.A[0x629D ^ 0x628D] = 0xFFFF9D55 ^ 0x628D;
        B.A[0xE25D ^ 0xE24B] = 0xE259 ^ 0xE24B;
        B.A[0x2E4 ^ 0x2C1] = 0xFFFFFD0F ^ 0x2C1;
        B.A[0x1C49 ^ 0x1C6A] = 0x1C16 ^ 0x1C6A;
        B.A[0xA7F8 ^ 0xA7D4] = 0xA7BC ^ 0xA7D4;
        B.A[0xF6A6 ^ 0xF68F] = 0xF6A3 ^ 0xF68F;
        B.A[0xB6B1 ^ 0xB6BF] = 0xFFFF496B ^ 0xB6BF;
        B.A[0x99FE ^ 0x99EA] = 0xFFFF6618 ^ 0x99EA;
        B.A[0xB4AB ^ 0xB4B7] = 0xFFFF4B1C ^ 0xB4B7;
        B.A[0x72D3 ^ 0x72CD] = 0x728B ^ 0x72CD;
        B.A[0xBFFB ^ 0xBFF4] = 0xFFFF4023 ^ 0xBFF4;
        B.A[0x4F5C ^ 0x4F58] = 0x4F7E ^ 0x4F58;
        B.A[0xA69F ^ 0xA699] = 0xFFFF5942 ^ 0xA699;
        B.A[0x9AD8 ^ 0x9AF3] = 0xFFFF652E ^ 0x9AF3;
        B.A[0x532B ^ 0x5329] = 0x533F ^ 0x5329;
        B.A[0xE175 ^ 0xE17E] = 0xFFFF1EAF ^ 0xE17E;
        B.A[0xA2F9 ^ 0xA2D8] = 0xFFFF5DC0 ^ 0xA2D8;
        B.A[0x79CB ^ 0x79EC] = 0xFFFF862E ^ 0x79EC;
        B.A[0xEDD9 ^ 0xEDD0] = 0xEDB5 ^ 0xEDD0;
    }
}

