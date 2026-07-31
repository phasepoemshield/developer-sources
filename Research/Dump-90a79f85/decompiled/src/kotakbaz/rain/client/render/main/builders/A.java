/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client.render.main.builders;

import java.util.ArrayList;
import java.util.List;
import kotakbaz.rain.client.render.main.vertex.element.a_0;

public final class A {
    private final List<a_0> a = new ArrayList<a_0>();
    private final List<String> A = new ArrayList<String>();
    public static int[] B;

    public A() {
        super();
    }

    public A element(String string, kotakbaz.rain.client.render.main.vertex.element.A<?> a2, int n) {
        long l = -6900583573889587578L;
        int n2 = B[0];
        n2 -= B[1];
        long l2 = l;
        int n3 = B[3];
        n3 ^= B[4];
        l = l2 ^ ((long)this.a.size() << (n2 += B[2]) ^ l2) & -1L << (n3 ^= B[5]);
        this.A.add(string);
        int n4 = B[6];
        n4 ^= B[7];
        this.a.add(new a_0((int)(l >>> (n4 ^= B[8])), n, a2));
        return this;
    }

    public kotakbaz.rain.client.render.main.vertex.format.a_0 build() {
        return new kotakbaz.rain.client.render.main.vertex.format.a_0(this.a, this.A);
    }

    static {
        kotakbaz.rain.client.render.main.builders.A.a();
    }

    public static void a() {
        B = new int[0xCDB0 ^ 0xCDB9];
        kotakbaz.rain.client.render.main.builders.A.B[0xDE8B ^ 0xDE8A] = 0xFFFF2122 ^ 0xDE8A;
        kotakbaz.rain.client.render.main.builders.A.B[0xDD3C ^ 0xDD34] = 0xDD02 ^ 0xDD34;
        kotakbaz.rain.client.render.main.builders.A.B[0x1BB9 ^ 0x1BBF] = 0xFFFFE402 ^ 0x1BBF;
        kotakbaz.rain.client.render.main.builders.A.B[0xA9A0 ^ 0xA9A7] = 0xFFFF560C ^ 0xA9A7;
        kotakbaz.rain.client.render.main.builders.A.B[0x2C9F ^ 0x2C9F] = 0x2CDC ^ 0x2C9F;
        kotakbaz.rain.client.render.main.builders.A.B[0x2EE9 ^ 0x2EEC] = 0x2EEB ^ 0x2EEC;
        kotakbaz.rain.client.render.main.builders.A.B[0xCBCD ^ 0xCBCF] = 0xFFFF344A ^ 0xCBCF;
        kotakbaz.rain.client.render.main.builders.A.B[0x1EA1 ^ 0x1EA2] = 0x1ED2 ^ 0x1EA2;
        kotakbaz.rain.client.render.main.builders.A.B[0xE051 ^ 0xE055] = 0xE002 ^ 0xE055;
    }
}

