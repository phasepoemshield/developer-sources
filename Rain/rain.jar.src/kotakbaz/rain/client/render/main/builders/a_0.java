/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client.render.main.builders;

import java.util.ArrayList;
import java.util.List;
import kotakbaz.rain.client.render.main.vertex.element.a;

/*
 * Renamed from kotakbaz.rain.client.render.main.builders.A
 */
public final class a_0 {
    private final List<a> a = new ArrayList<a>();
    private final List<String> A = new ArrayList<String>();
    public static int[] B;

    public a_0 element(String name, kotakbaz.rain.client.render.main.vertex.element.a_0<?> type, int count) {
        long l2 = -6900583573889587578L;
        int n2 = B[0];
        n2 -= B[1];
        long l3 = l2;
        int n3 = B[3];
        n3 ^= B[4];
        l2 = l3 ^ ((long)this.a.size() << (n2 += B[2]) ^ l3) & -1L << (n3 ^= B[5]);
        this.A.add(name);
        int n4 = B[6];
        n4 ^= B[7];
        this.a.add(new a((int)(l2 >>> (n4 ^= B[8])), count, type));
        return this;
    }

    public kotakbaz.rain.client.render.main.vertex.format.a_0 build() {
        return new kotakbaz.rain.client.render.main.vertex.format.a_0(this.a, this.A);
    }

    static {
        a_0.a();
    }

    public static void a() {
        B = new int[0xCDB0 ^ 0xCDB9];
        a_0.B[0xDE8B ^ 0xDE8A] = 0xFFFF2122 ^ 0xDE8A;
        a_0.B[0xDD3C ^ 0xDD34] = 0xDD02 ^ 0xDD34;
        a_0.B[0x1BB9 ^ 0x1BBF] = 0xFFFFE402 ^ 0x1BBF;
        a_0.B[0xA9A0 ^ 0xA9A7] = 0xFFFF560C ^ 0xA9A7;
        a_0.B[0x2C9F ^ 0x2C9F] = 0x2CDC ^ 0x2C9F;
        a_0.B[0x2EE9 ^ 0x2EEC] = 0x2EEB ^ 0x2EEC;
        a_0.B[0xCBCD ^ 0xCBCF] = 0xFFFF344A ^ 0xCBCF;
        a_0.B[0x1EA1 ^ 0x1EA2] = 0x1ED2 ^ 0x1EA2;
        a_0.B[0xE051 ^ 0xE055] = 0xE002 ^ 0xE055;
    }
}

