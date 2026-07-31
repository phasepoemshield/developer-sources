/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client.render.main.vertex;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.function.Function;
import kotakbaz.rain.client.render.main.vertex.b_0;

/*
 * Renamed from kotakbaz.rain.client.render.main.vertex.A
 */
public final class a_0
extends Record {
    private final int a;
    private final boolean A;
    private final b_0 b;
    private final Function<Integer, Integer> B;
    public static final a_0 c;
    public static final a_0 C;
    public static final a_0 d;
    public static final a_0 D;
    public static final a_0 e;
    public static final a_0 E;
    public static int[] F;

    public a_0(int glId, boolean useIndexBuffer, b_0 indexBufferGenerator, Function<Integer, Integer> indexCountFunction) {
        this.a = glId;
        this.A = useIndexBuffer;
        this.b = indexBufferGenerator;
        this.B = indexCountFunction;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{a_0.class, "glId;useIndexBuffer;indexBufferGenerator;indexCountFunction", "a", "A", "b", "B"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a_0.class, "glId;useIndexBuffer;indexBufferGenerator;indexCountFunction", "a", "A", "b", "B"}, this);
    }

    @Override
    public final boolean equals(Object o2) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a_0.class, "glId;useIndexBuffer;indexBufferGenerator;indexCountFunction", "a", "A", "b", "B"}, this, o2);
    }

    public int glId() {
        return this.a;
    }

    public boolean useIndexBuffer() {
        return this.A;
    }

    public b_0 indexBufferGenerator() {
        return this.b;
    }

    public Function<Integer, Integer> indexCountFunction() {
        return this.B;
    }

    static {
        a_0.a();
        int n2 = F[33];
        n2 ^= F[34];
        boolean bl = F[36];
        bl += F[37];
        c = new a_0(n2 -= F[35], bl ^= F[38], null, vertices -> {
            int n2 = F[30];
            n2 ^= F[31];
            return n2 ^= F[32];
        });
        int n3 = F[39];
        n3 += F[40];
        boolean bl2 = F[42];
        bl2 ^= F[43];
        C = new a_0(n3 -= F[41], bl2 -= F[44], null, vertices -> {
            int n2 = F[27];
            n2 ^= F[28];
            return n2 -= F[29];
        });
        int n4 = F[45];
        n4 -= F[46];
        boolean bl3 = F[48];
        bl3 ^= F[49];
        d = new a_0(n4 -= F[47], bl3 ^= F[50], null, vertices -> {
            int n2 = F[24];
            n2 ^= F[25];
            return n2 -= F[26];
        });
        int n5 = F[51];
        n5 -= F[52];
        boolean bl4 = F[54];
        bl4 -= F[55];
        D = new a_0(n5 ^= F[53], bl4 ^= F[56], null, vertices -> {
            int n2 = F[21];
            n2 ^= F[22];
            return n2 += F[23];
        });
        int n6 = F[57];
        n6 ^= F[58];
        boolean bl5 = F[60];
        bl5 -= F[61];
        e = new a_0(n6 -= F[59], bl5 += F[62], null, vertices -> {
            int n2 = F[18];
            n2 ^= F[19];
            return n2 -= F[20];
        });
        int n7 = F[63];
        n7 -= F[64];
        n7 ^= F[65];
        boolean bl6 = F[66];
        bl6 += F[67];
        int n8 = F[69];
        n8 ^= F[70];
        int n9 = F[72];
        n9 ^= F[73];
        E = new a_0(n7, bl6 ^= F[68], new b_0(n8 -= F[71], n9 += F[74], (indexConsumer, firstVertexIndex) -> {
            indexConsumer.accept(firstVertexIndex);
            int n2 = F[6];
            n2 += F[7];
            indexConsumer.accept(firstVertexIndex + (n2 ^= F[8]));
            int n3 = F[9];
            n3 += F[10];
            indexConsumer.accept(firstVertexIndex + (n3 += F[11]));
            int n4 = F[12];
            n4 -= F[13];
            indexConsumer.accept(firstVertexIndex + (n4 -= F[14]));
            int n5 = F[15];
            n5 += F[16];
            indexConsumer.accept(firstVertexIndex + (n5 -= F[17]));
            indexConsumer.accept(firstVertexIndex);
        }), vertices -> {
            int n2 = F[0];
            n2 -= F[1];
            int n3 = F[3];
            n3 += F[4];
            return vertices / (n2 -= F[2]) * (n3 += F[5]);
        });
    }

    public static void a() {
        F = new int[0x16AD ^ 0x16E6];
        a_0.F[0x37DC ^ 0x37DE] = 0x3785 ^ 0x37DE;
        a_0.F[0x4FA6 ^ 0x4FAE] = 0xFFFFB006 ^ 0x4FAE;
        a_0.F[0x9E59 ^ 0x9E73] = 0xFFFF618D ^ 0x9E73;
        a_0.F[0x483 ^ 0x4BB] = 0xFFFFFB5B ^ 0x4BB;
        a_0.F[0xD0D6 ^ 0xD0DB] = 0xD0EE ^ 0xD0DB;
        a_0.F[0x436B ^ 0x4376] = 0x431E ^ 0x4376;
        a_0.F[0xFDC3 ^ 0xFDCD] = 0xFDFB ^ 0xFDCD;
        a_0.F[0x48BE ^ 0x489B] = 0xFFFFB77D ^ 0x489B;
        a_0.F[0xA9FE ^ 0xA9CF] = 0xA99E ^ 0xA9CF;
        a_0.F[0x856B ^ 0x855B] = 0x8520 ^ 0x855B;
        a_0.F[0xBF76 ^ 0xBF4C] = 0xBF58 ^ 0xBF4C;
        a_0.F[0xB84D ^ 0xB870] = 0xFFFF47EA ^ 0xB870;
        a_0.F[0x12B9 ^ 0x12A2] = 0x12AF ^ 0x12A2;
        a_0.F[0x6E0A ^ 0x6E0A] = 0xFFFF91F1 ^ 0x6E0A;
        a_0.F[0x7944 ^ 0x790D] = 0x790F ^ 0x790D;
        a_0.F[0xEF1A ^ 0xEF0C] = 0xEF6F ^ 0xEF0C;
        a_0.F[0xC62A ^ 0xC639] = 0xC63E ^ 0xC639;
        a_0.F[0x95AC ^ 0x9587] = 0xFFFF6A2C ^ 0x9587;
        a_0.F[0x106FA ^ 0x106FC] = 0x106FC ^ 0x106FC;
        a_0.F[0xEA89 ^ 0xEABE] = 0xFFFF150B ^ 0xEABE;
        a_0.F[0x13B2 ^ 0x13F0] = 0x13CA ^ 0x13F0;
        a_0.F[0xAC0A ^ 0xAC26] = 0xAC73 ^ 0xAC26;
        a_0.F[0xAF66 ^ 0xAF40] = 0xFFFF50F4 ^ 0xAF40;
        a_0.F[0xC6DB ^ 0xC6E9] = 0xC6C3 ^ 0xC6E9;
        a_0.F[0xF716 ^ 0xF707] = 0xF77D ^ 0xF707;
        a_0.F[0x3C05 ^ 0x3C00] = 0xFFFFC3D8 ^ 0x3C00;
        a_0.F[0xF97A ^ 0xF968] = 0xF972 ^ 0xF968;
        a_0.F[0x537 ^ 0x517] = 0x52B ^ 0x517;
        a_0.F[0xA81 ^ 0xACB] = 0xFFFFF573 ^ 0xACB;
        a_0.F[0xF9B ^ 0xFAE] = 0xFFFFF070 ^ 0xFAE;
        a_0.F[0xDD40 ^ 0xDD07] = 0xFFFF22B0 ^ 0xDD07;
        a_0.F[0x9E3C ^ 0x9E37] = 0xFFFF61B1 ^ 0x9E37;
        a_0.F[0xBFF7 ^ 0xBFB4] = 0xBF84 ^ 0xBFB4;
        a_0.F[0x4CE ^ 0x4F5] = 0xFFFFFB47 ^ 0x4F5;
        a_0.F[0xCE97 ^ 0xCE90] = 0xFFFF3139 ^ 0xCE90;
        a_0.F[0xF3E3 ^ 0xF3F3] = 0xF380 ^ 0xF3F3;
        a_0.F[0x7E22 ^ 0x7E16] = 0xFFFF8199 ^ 0x7E16;
        a_0.F[0x8B9C ^ 0x8BA5] = 0xFFFF7409 ^ 0x8BA5;
        a_0.F[0xFFB3 ^ 0xFFFB] = 0xFFB7 ^ 0xFFFB;
        a_0.F[0xB2D9 ^ 0xB2FA] = 0xB2C7 ^ 0xB2FA;
        a_0.F[0x9D16 ^ 0x9D1F] = 0x9DF9 ^ 0x9D1F;
        a_0.F[0x3661 ^ 0x367B] = 0x3645 ^ 0x367B;
        a_0.F[0xE68A ^ 0xE6A5] = 0xE6BC ^ 0xE6A5;
        a_0.F[0x813B ^ 0x8107] = 0xFFFF7E7B ^ 0x8107;
        a_0.F[0x307E ^ 0x303A] = 0x3051 ^ 0x303A;
        a_0.F[0x6E8C ^ 0x6ECC] = 0xFFFF9111 ^ 0x6ECC;
        a_0.F[0x2EC6 ^ 0x2EDE] = 0xFFFFD13D ^ 0x2EDE;
        a_0.F[0x2515 ^ 0x2519] = 0x2574 ^ 0x2519;
        a_0.F[0x7FD3 ^ 0x7FD7] = 0x7FF1 ^ 0x7FD7;
        a_0.F[0x13D5 ^ 0x13F1] = 0xFFFFEC3F ^ 0x13F1;
        a_0.F[0x40A8 ^ 0x40A2] = 0xFFFFBF34 ^ 0x40A2;
        a_0.F[0xC4F6 ^ 0xC4E2] = 0xC4FF ^ 0xC4E2;
        a_0.F[0x7518 ^ 0x755E] = 0xFFFF8A97 ^ 0x755E;
        a_0.F[0x5B50 ^ 0x5B7D] = 0x5B5B ^ 0x5B7D;
        a_0.F[0xBE0D ^ 0xBE2C] = 0xBE14 ^ 0xBE2C;
        a_0.F[0x34FF ^ 0x34FC] = 0x34F4 ^ 0x34FC;
        a_0.F[0xC949 ^ 0xC956] = 0xC90E ^ 0xC956;
        a_0.F[0xD8A5 ^ 0xD8B9] = 0xD8DC ^ 0xD8B9;
        a_0.F[0xA876 ^ 0xA837] = 0xA85E ^ 0xA837;
        a_0.F[0x107DC ^ 0x107D3] = 0x107D9 ^ 0x107D3;
        a_0.F[0x5A11 ^ 0x5A27] = 0xFFFFA5B2 ^ 0x5A27;
        a_0.F[0xF9E1 ^ 0xF9DE] = 0xF994 ^ 0xF9DE;
        a_0.F[0x6847 ^ 0x6865] = 0x6863 ^ 0x6865;
        a_0.F[0x4736 ^ 0x471F] = 0xFFFFB887 ^ 0x471F;
        a_0.F[0x7A4D ^ 0x7A6A] = 0xFFFF853D ^ 0x7A6A;
        a_0.F[0xBBD0 ^ 0xBBF8] = 0xBBBC ^ 0xBBF8;
        a_0.F[0xD5B6 ^ 0xD5F3] = 0xD581 ^ 0xD5F3;
        a_0.F[0x3725 ^ 0x370B] = 0x3702 ^ 0x370B;
        a_0.F[0x149D ^ 0x148A] = 0xFFFFEB13 ^ 0x148A;
        a_0.F[0x268B ^ 0x268A] = 0xFFFFD916 ^ 0x268A;
        a_0.F[0x9A97 ^ 0x9A82] = 0x9A86 ^ 0x9A82;
        a_0.F[0xC4C7 ^ 0xC4F4] = 0xFFFF3B9E ^ 0xC4F4;
        a_0.F[0x74EB ^ 0x74F2] = 0xFFFF8B2F ^ 0x74F2;
        a_0.F[0x9B7D ^ 0x9B63] = 0x9B07 ^ 0x9B63;
        a_0.F[0xD6DF ^ 0xD6E1] = 0xD6FF ^ 0xD6E1;
    }
}

