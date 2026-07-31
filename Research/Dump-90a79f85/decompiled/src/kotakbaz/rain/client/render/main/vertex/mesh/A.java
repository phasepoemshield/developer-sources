/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  net.minecraft.class_9799
 *  net.minecraft.class_9799$class_9800
 *  org.joml.Matrix4f
 *  org.joml.Vector3f
 *  org.lwjgl.system.MemoryUtil
 */
package kotakbaz.rain.client.render.main.vertex.mesh;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import java.util.Base64;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import kotakbaz.rain.client.render.main.exceptions.impl.vertex.b_0;
import kotakbaz.rain.client.render.main.vertex.mesh.B;
import kotakbaz.rain.client.render.main.vertex.mesh.a_0;
import lombok.Generated;
import net.minecraft.class_9799;
import org.joml.Matrix4f;
import org.joml.Vector3f;
import org.lwjgl.system.MemoryUtil;

public class A
implements a_0<A, B> {
    public static final int a = 0xFFFFFF;
    private class_9799 A;
    private kotakbaz.rain.client.render.main.vertex.A b;
    private kotakbaz.rain.client.render.main.vertex.format.a_0 B;
    private int c;
    private int[] C;
    private int d;
    private boolean D;
    private Consumer<class_9799> e;
    private long E = -1L;
    private int f;
    private int F;
    private boolean g;
    private final Vector3f G;
    private static Object[] h;
    private static Object i;
    private static Object[] I;
    private static Object[] H;
    private static Object[] j;
    public static int[] J;

    public A(class_9799 class_97992, kotakbaz.rain.client.render.main.vertex.A a2, kotakbaz.rain.client.render.main.vertex.format.a_0 a_02, boolean bl) {
        this(class_97992, a2, a_02, bl, null);
    }

    public A(class_9799 class_97992, kotakbaz.rain.client.render.main.vertex.A a2, kotakbaz.rain.client.render.main.vertex.format.a_0 a_02, boolean bl, Consumer<class_9799> consumer) {
        super();
        int n = J[0];
        n ^= J[1];
        this.g = n -= J[2];
        this.G = new Vector3f();
        this.A = class_97992;
        this.b = a2;
        this.B = a_02;
        this.c = a_02.getVertexSize();
        this.C = a_02.getElementOffsets();
        int n2 = J[3];
        n2 -= J[4];
        this.d = a_02.getElementsMask() & (n2 ^= J[5]);
        this.D = bl;
        this.e = consumer;
    }

    public A set(class_9799 class_97992, kotakbaz.rain.client.render.main.vertex.A a2, kotakbaz.rain.client.render.main.vertex.format.a_0 a_02, boolean bl) {
        return this.set(class_97992, a2, a_02, bl, null);
    }

    public A set(class_9799 class_97992, kotakbaz.rain.client.render.main.vertex.A a2, kotakbaz.rain.client.render.main.vertex.format.a_0 a_02, boolean bl, Consumer<class_9799> consumer) {
        this.A = class_97992;
        this.b = a2;
        this.B = a_02;
        this.c = a_02.getVertexSize();
        this.C = a_02.getElementOffsets();
        int n = J[6];
        n += J[7];
        this.d = a_02.getElementsMask() & (n -= J[8]);
        this.D = bl;
        this.e = consumer;
        int n2 = J[9];
        n2 += J[10];
        this.g = n2 -= J[11];
        int n3 = J[12];
        n3 += J[13];
        this.f = n3 -= J[14];
        this.E = -1L;
        int n4 = J[15];
        n4 -= J[16];
        this.F = n4 += J[17];
        return this;
    }

    private void ensureBuilding() {
        if (this.g) {
            int n = J[18];
            n -= J[19];
            n ^= J[20];
            int n2 = J[21];
            n2 += J[22];
            n2 += J[23];
            int n3 = J[24];
            n3 += J[25];
            String[] stringArray = new String[n3 ^= J[26]];
            int n4 = J[27];
            n4 ^= J[28];
            int n5 = J[30];
            n5 -= J[31];
            int n6 = J[33];
            n6 -= J[34];
            stringArray[n4 -= kotakbaz.rain.client.render.main.vertex.mesh.A.J[29]] = (String)h[n5 ^= J[32]] + (String)h[n6 += J[35]];
            int n7 = J[36];
            n7 ^= J[37];
            String[] stringArray2 = new String[n7 += J[38]];
            int n8 = J[39];
            n8 -= J[40];
            int n9 = J[42];
            n9 -= J[43];
            int n10 = J[45];
            n10 += J[46];
            stringArray2[n8 += kotakbaz.rain.client.render.main.vertex.mesh.A.J[41]] = (String)h[n9 += J[44]] + (String)h[n10 ^= J[47]];
            kotakbaz.rain.client.render.main.exceptions.A.printAndExit(new b_0((String)h[n] + (String)h[n2], stringArray, stringArray2));
        }
    }

    @Override
    public B buildNullable() {
        B b2;
        this.ensureBuilding();
        try {
            this.endVertex();
            b2 = this.build();
            this.finishAllocator();
        }
        catch (Throwable throwable) {
            this.finishAllocator();
            int n = J[51];
            n ^= J[52];
            this.g = n += J[53];
            this.E = -1L;
            throw throwable;
        }
        int n = J[48];
        n ^= J[49];
        this.g = n -= J[50];
        this.E = -1L;
        return b2;
    }

    @Override
    public B buildOrThrow() {
        B b2 = this.buildNullable();
        if (b2 == null) {
            int n = J[54];
            n ^= J[55];
            n ^= J[56];
            int n2 = J[57];
            n2 += J[58];
            n2 ^= J[59];
            int n3 = J[60];
            n3 += J[61];
            String[] stringArray = new String[n3 += J[62]];
            int n4 = J[63];
            n4 -= J[64];
            int n5 = J[66];
            n5 -= J[67];
            int n6 = J[69];
            n6 += J[70];
            stringArray[n4 += kotakbaz.rain.client.render.main.vertex.mesh.A.J[65]] = (String)h[n5 ^= J[68]] + (String)h[n6 += J[71]];
            int n7 = J[72];
            n7 ^= J[73];
            String[] stringArray2 = new String[n7 -= J[74]];
            int n8 = J[75];
            n8 ^= J[76];
            int n9 = J[78];
            n9 -= J[79];
            int n10 = J[81];
            n10 += J[82];
            stringArray2[n8 += kotakbaz.rain.client.render.main.vertex.mesh.A.J[77]] = (String)h[n9 ^= J[80]] + (String)h[n10 -= J[83]];
            kotakbaz.rain.client.render.main.exceptions.A.printAndExit(new b_0((String)h[n] + (String)h[n2], stringArray, stringArray2));
            return null;
        }
        return b2;
    }

    private B build() {
        long l = 4612695422729831790L;
        if (this.f == 0) {
            return null;
        }
        class_9799.class_9800 class_98002 = this.A.method_60807();
        if (class_98002 == null) {
            return null;
        }
        try (class_9799.class_9800 class_98003 = class_98002;){
            int n = J[84];
            n += J[85];
            long l2 = l;
            int n2 = J[87];
            n2 ^= J[88];
            l = l2 ^ ((long)this.b.indexCountFunction().apply(this.f).intValue() << (n += J[86]) ^ l2) & -1L << (n2 ^= J[89]);
            int n3 = J[90];
            n3 -= J[91];
            B b2 = new B(class_98002.method_60817(), this.B, this.f, (int)(l >>> (n3 -= J[92])), this.b, () -> {});
            return b2;
        }
    }

    private void finishAllocator() {
        if (this.A == null) {
            return;
        }
        if (this.e != null) {
            this.e.accept(this.A);
        } else if (this.D) {
            this.A.close();
        }
    }

    private long beginVertex() {
        long l;
        this.ensureBuilding();
        this.endVertex();
        int n = J[93];
        n += J[94];
        if (this.f >= (n -= J[95])) {
            kotakbaz.rain.client.render.main.exceptions.A.printAndExit(new kotakbaz.rain.client.render.main.exceptions.impl.vertex.B());
            return -1L;
        }
        int n2 = J[96];
        n2 -= J[97];
        this.f += (n2 ^= J[98]);
        this.E = l = this.A.method_60808(this.c);
        return l;
    }

    private void endVertex() {
        if (this.f != 0 && this.F != 0) {
            int n = J[99];
            n -= J[100];
            String string = this.B.getElementsFromMask(this.F).map(this.B::getVertexElementName).collect(Collectors.joining((String)h[n ^= J[101]]));
            kotakbaz.rain.client.render.main.exceptions.A.printAndExit(new kotakbaz.rain.client.render.main.exceptions.impl.vertex.a_0(string));
        }
    }

    private long beginElement(kotakbaz.rain.client.render.main.vertex.element.a_0 a_02) {
        long l = 5230172899903334314L;
        long l2 = -5841129610187046698L;
        long l3 = -1489945701639376067L;
        int n = J[102];
        n -= J[103];
        long l4 = l3;
        int n2 = J[105];
        n2 += J[106];
        l3 = l4 ^ ((long)this.F << (n += J[104]) ^ l4) & -1L << (n2 -= J[107]);
        int n3 = J[108];
        n3 -= J[109];
        n3 -= J[110];
        int n4 = J[111];
        n4 -= J[112];
        long l5 = l3;
        int n5 = J[114];
        n5 += J[115];
        l3 = l5 ^ ((long)((int)(l3 >>> n3) & (a_02.mask() ^ (n4 += J[113]))) ^ l5) & -1L >>> (n5 += J[116]);
        int n6 = J[117];
        n6 -= J[118];
        if ((int)l3 == (int)(l3 >>> (n6 -= J[119]))) {
            return -1L;
        }
        this.F = (int)l3;
        long l6 = this.E;
        if (l6 == -1L) {
            int n7 = J[120];
            n7 ^= J[121];
            n7 += J[122];
            int n8 = J[123];
            n8 ^= J[124];
            n8 += J[125];
            int n9 = J[126];
            n9 += J[127];
            String[] stringArray = new String[n9 -= J[128]];
            int n10 = J[129];
            n10 -= J[130];
            int n11 = J[132];
            n11 += J[133];
            int n12 = J[135];
            n12 ^= J[136];
            stringArray[n10 += kotakbaz.rain.client.render.main.vertex.mesh.A.J[131]] = (String)h[n11 += J[134]] + (String)h[n12 ^= J[137]];
            int n13 = J[138];
            n13 -= J[139];
            String[] stringArray2 = new String[n13 ^= J[140]];
            int n14 = J[141];
            n14 ^= J[142];
            int n15 = J[144];
            n15 += J[145];
            int n16 = J[147];
            n16 -= J[148];
            stringArray2[n14 ^= kotakbaz.rain.client.render.main.vertex.mesh.A.J[143]] = (String)h[n15 += J[146]] + (String)h[n16 -= J[149]];
            kotakbaz.rain.client.render.main.exceptions.A.printAndExit(new b_0((String)h[n7] + (String)h[n8], stringArray, stringArray2));
            return -1L;
        }
        return l6 + (long)this.C[a_02.getId()];
    }

    @Override
    public A vertex(float f2, float f3, float f4) {
        int n = J[150];
        n -= J[151];
        long l = this.beginVertex() + (long)this.C[n += J[152]];
        this.F = this.d;
        MemoryUtil.memPutFloat((long)l, (float)f2);
        MemoryUtil.memPutFloat((long)(l + 4L), (float)f3);
        MemoryUtil.memPutFloat((long)(l + 8L), (float)f4);
        return this;
    }

    @Override
    public A vertex(Matrix4f matrix4f, float f2, float f3, float f4) {
        matrix4f.transformPosition(f2, f3, f4, this.G);
        return this.vertex(this.G.x, this.G.y, this.G.z);
    }

    @Override
    public <T> A element(String string, kotakbaz.rain.client.render.main.vertex.element.A<T> a2, T ... TArray) {
        return this.element(this.B.getVertexElement(string), a2, TArray);
    }

    public <T> A element(kotakbaz.rain.client.render.main.vertex.element.a_0 a_02, kotakbaz.rain.client.render.main.vertex.element.A<T> a2, T ... TArray) {
        long l = this.beginElement(a_02);
        if (l != -1L) {
            a2.uploadConsumer().accept(l, TArray);
        }
        return this;
    }

    @Generated
    public class_9799 getBufferAllocator() {
        return this.A;
    }

    static {
        kotakbaz.rain.client.render.main.vertex.mesh.A.b();
        long l = -5854705560712592190L;
        long l2 = -440791428575077764L;
        long l3 = 5469890254310395363L;
        long l4 = -4199437467730596990L;
        long l5 = 2765970126872264324L;
        long l6 = -2663182684816526951L;
        long l7 = 6389135519475537154L;
        long l8 = -6074084364693318964L;
        long l9 = -3685900669150096005L;
        long l10 = 1051381215420592826L;
        long l11 = -1038573845200790843L;
        long l12 = -8957370106932957524L;
        long l13 = -848811813047434590L;
        long l14 = -6282304271105390870L;
        int n = J[153];
        n ^= J[154];
        h = new Object[n ^= J[155]];
        long l15 = l14;
        int n2 = J[156];
        n2 += J[157];
        l14 = l15 ^ (0L ^ l15) & -1L << (n2 ^= J[158]);
        Object[] objectArray = new Object[J[159]];
        objectArray[kotakbaz.rain.client.render.main.vertex.mesh.A.J[160]] = H;
        objectArray[kotakbaz.rain.client.render.main.vertex.mesh.A.J[161]] = J[162];
        int n3 = J[163];
        Object object = kotakbaz.rain.client.render.main.vertex.mesh.A.A()[J[164]];
        if (object == null) {
            char[] cArray = "\u4afa\u4adb\u4af6\u4e0a\u4ac1\u4ae0\u4d39\u4abd\u4aad\u4aae\u4d37\u4e1e\u4aad\u4ad7\u4abc\u4e03\u4ac1\u4aa4\u4ad6\u4aff\u4e0e\u4ae2\u4abc\u4adb\u4ae2\u4e07\u4e1c\u4ada\u4aa3\u4ad4\u4af6\u4e04\u4ae0\u4e08\u4e21\u4d37\u4af4\u4aa9\u4aa6\u4d36\u4d3f\u4aa5\u4af7\u4af5\u4abd\u4abb\u4aaa\u4aae\u4e05\u4ad5\u4d39\u4d37\u4aff\u4acd\u4af6\u4ad6\u4ada\u4acd\u4af6\u4adf\u4d3f\u4adb\u4aae\u4ae0\u4d40\u4e07\u4e06\u4aff\u4d33\u4aa9\u4aaa\u4d35\u4b00\u4e05\u4ad3\u4af5\u4d3a\u4d42\u4ada\u4b00\u4e03\u4ad3\u4aff\u4b00\u4abc\u4e05\u4abc\u4abe\u4e1d\u4abd\u4ad7\u4d38\u4e0d\u4e1b\u4e0a\u4af7\u4d40\u4e07\u4aa7\u4d40\u4af4\u4d36\u4d37\u4ada\u4ad9\u4d3f\u4e1e\u4ad9\u4ad5\u4d3a\u4ad3\u4e0d\u4abe\u4d35\u4d39\u4e09\u4aa8\u4af9\u4e21\u4ad3\u4aaa\u4b00\u4af4\u4af9\u4e0a\u4aff\u4abc\u4af8\u4e1b\u4af8\u4aa4\u4d3f\u4aa9\u4af9\u4d3f\u4ad9\u4e09\u4aa3\u4d42\u4aa6\u4aa6\u4abb\u4ad8\u4aa8\u4e0d\u4ad6\u4e08\u4d3a\u4af7\u4e1c\u4e1b\u4e1e\u4e1d\u4af4\u4ae2\u4aa5\u4e09\u4af6\u4d3a\u4af5\u4aa4\u4afa\u4abd\u4adb\u4adf\u4e1b\u4e06\u4ad7\u4d36\u4aa3\u4e0e\u4aa4\u4e0d\u4af9\u4ae0\u4afa\u4af6\u4d3f\u4e08\u4ad8\u4aa8\u4aa7\u4e1d\u4ad4\u4aa4\u4adb\u4d39\u4aa4\u4e04\u4ada\u4ad3\u4e0d\u4e0e\u4d35\u4ad3\u4e08\u4e0d\u4d40\u4e08\u4d34\u4e1b\u4e0a\u4d38\u4d39\u4e0d\u4e07\u4e04\u4aa6\u4e06\u4af8\u4d38\u4d42\u4d35\u4e08\u4af8\u4aa5\u4e1d\u4d42\u4e08\u4d39\u4aa6\u4e1e\u4ad7\u4adf\u4af9\u4e09\u4ad6\u4aae\u4af4\u4d42\u4af9\u4ada\u4af3\u4d3a\u4d35\u4ad6\u4e21\u4d38\u4ae2\u4d3f\u4abc\u4ae0\u4e07\u4aad\u4adf\u4af6\u4ad4\u4adb\u4aa7\u4af8\u4ae0\u4ae0\u4d40\u4adb\u4aa8\u4d3f\u4e1c\u4aa4\u4ad6\u4d40\u4abb\u4e09\u4d3f\u4af6\u4aaa\u4d38\u4ad3\u4af3\u4aa7\u4e1c\u4ae2\u4e06\u4aa7\u4ac1\u4adb\u4d36\u4e03\u4e09\u4aa6\u4d33\u4d36\u4e1b\u4acd\u4d34\u4d37\u4af5\u4abd\u4d3f\u4adb\u4e05\u4aa8\u4aa7\u4d38\u4e1d\u4ae2\u4d37\u4ac1\u4aa8\u4abe\u4ad4\u4d38\u4af9\u4b00\u4af4\u4d42\u4d35\u4e21\u4d33\u4e1b\u4d37\u4abe\u4e21\u4d38\u4ad3\u4e1d\u4e04\u4e09\u4af3\u4d35\u4d3f\u4e0e\u4abe\u4af7\u4aa8\u4d36\u4e1e\u4ad6\u4ad7\u4aa4\u4ad6\u4e04\u4b00\u4d36\u4adb\u4aaa\u4adb\u4d39\u4abc\u4ad5\u4e09\u4aa4\u4ad4\u4d38\u4aa9\u4ad6\u4b00\u4d34\u4d36\u4ada\u4e1e\u4d37\u4d42\u4ad9\u4adb\u4ac1\u4af9\u4e05\u4aa6\u4d42\u4af3\u4af4\u4aa9\u4ac1\u4aa4\u4af8\u4abc\u4d40\u4d3a\u4ad6\u4d34\u4af4\u4e07\u4e09\u4acd\u4aae\u4ad7\u4acd\u4b00\u4b00\u4ad7\u4ada\u4e06\u4af3\u4d36\u4e1c\u4e0d\u4e0a\u4ac1\u4aa7\u4abc\u4e08\u4d37\u4d39\u4aa4\u4af3\u4aa6\u4d42\u4af9\u4adf\u4d37\u4e08\u4e0d\u4af8\u4ad5\u4e04\u4aa4\u4adf\u4e03\u4adf\u4aa5\u4aa8\u4af3\u4e07\u4e04\u4d33\u4ad3\u4acd\u4adf\u4aad\u4ada\u4aaa\u4adb\u4aff\u4ad3\u4ae0\u4e03\u4b00\u4ad4\u4aae\u4d42\u4af3\u4aa8\u4aa9\u4abb\u4aa7\u4d40\u4abe\u4abd\u4aa3\u4af9\u4e03\u4ad5\u4e1b\u4d34\u4aae\u4ada\u4e04\u4ad9\u4d36\u4aa5\u4af6\u4e06\u4ad8\u4e0d\u4ae2\u4abb\u4aae\u4d39\u4ad4\u4e1e\u4ad3\u4af7\u4e1c\u4aa6\u4ad8\u4aa3\u4af4\u4d34\u4d35\u4aae\u4afa\u4ae0\u4af3\u4e07\u4aa4\u4e03\u4d35\u4d38\u4af6\u4e09\u4d33\u4abe\u4e1b\u4ada\u4ad9\u4d36\u4abe\u4d33\u4e04\u4d40\u4ad3\u4e07\u4b00\u4af3\u4e1d\u4aa8\u4b00\u4adf\u4d35\u4af4\u4d35\u4d38\u4acd\u4ac1\u4e09\u4ad8\u4af4\u4afa\u4e0e\u4af5\u4e07\u4e07\u4abc\u4e0a\u4af4\u4abd\u4ad4\u4af8\u4aae\u4ada\u4adf\u4ad5\u4aad\u4ac1\u4ae2\u4ad9\u4e09\u4ad7\u4e07\u4e03\u4e1b\u4ada\u4e04\u4adf\u4d38\u4e0d\u4aa4\u4e21\u4e1d\u4af4\u4aff\u4abe\u4aad\u4aff\u4aaa\u4af3\u4adf\u4ada\u4aaa\u4e06\u4ad6\u4aaa\u4ad3\u4ad6\u4ad8\u4aaa\u4e04\u4aa6\u4e08\u4ada\u4abd\u4ad9\u4d34\u4e03\u4e0d\u4af9\u4d3a\u4d42\u4e21\u4abe\u4d3f\u4abe\u4e0e\u4af6\u4af9\u4af5\u4abc\u4e0a\u4e04\u4aad\u4d42\u4af8\u4afa\u4ad5\u4ad5\u4e03\u4ad8\u4e0e\u4e09\u4af9\u4af6\u4afa\u4e08\u4d35\u4ae0\u4abb\u4ae0\u4e07\u4d38\u4e0d\u4aa9\u4e1d\u4ae2\u4abc\u4d35\u4adb\u4d35\u4abc\u4aa6\u4ad5\u4af5\u4e07\u4aa9\u4d34\u4adf\u4e05\u4e0e\u4d37\u4d3f\u4af3\u4aae\u4d38\u4ad3\u4aff\u4ada\u4afa\u4aa7\u4aa9\u4ad5\u4af5\u4af4\u4ad5\u4e08\u4abe\u4ad6\u4abb\u4e1d\u4aa7\u4d40\u4af6\u4e0e\u4d38\u4aff\u4ad6\u4e1d\u4af8\u4adf\u4aa3\u4af8\u4aad\u4afa\u4ad4\u4e21\u4e07\u4abe\u4ad7\u4ad3\u4d37\u4e0a\u4aa8\u4ad5\u4b00\u4e07\u4aa3\u4e0d\u4e06\u4ad5\u4e1e\u4e09\u4ad7\u4ada\u4ae0\u4ae2\u4aa6\u4af4\u4d33\u4aa5\u4aff\u4b00\u4d36\u4aff\u4af3\u4af4\u4aaa\u4adb\u4e1b\u4ac1\u4d34\u4b00\u4af8\u4e06\u4e03\u4af4\u4adb\u4acd\u4e04\u4af3\u4e09\u4d3a\u4e06\u4e05\u4d37\u4ad5\u4ad5\u4ad8\u4aa4\u4aa3\u4d36\u4aa9\u4d38\u4e03\u4aa6\u4ad5\u4aa3\u4abd\u4af4\u4afa\u4e1d\u4e05\u4e05\u4abd\u4ad5\u4aa5\u4ad9\u4ad7\u4ad3\u4d37\u4aff\u4e0a\u4e1d\u4af3\u4ac1\u4e04\u4ad4\u4d38\u4ad3\u4e1b\u4abe\u4ad4\u4e05\u4aa4\u4ad3\u4d38\u4ad8\u4aa6\u4af7\u4d34\u4adb\u4abe\u4e1b\u4ad8\u4d35\u4ad6\u4e05\u4aad\u4aa7\u4e04\u4e04\u4d3f\u4d39\u4e0e\u4ad8\u4aa5\u4ad8\u4aa3\u4e0a\u4aa9\u4ada\u4d38\u4af7\u4e04\u4af9\u4e1e\u4ac1\u4e07\u4aff\u4b00\u4d39\u4e07\u4d40\u4acd\u4abc\u4af9\u4d3a\u4d39\u4e1e\u4d34\u4aa6\u4ad8\u4ad9\u4aff\u4d36\u4e1c\u4acd\u4ad8\u4af8\u4d42\u4ad9\u4af7\u4abc\u4ad9\u4af3\u4ada\u4e1b\u4aa7\u4aa8\u4af3\u4ac1\u4abb\u4e1e\u4ae0\u4e07\u4e04\u4af6\u4e09\u4ac1\u4af4\u4e0a\u4ae2\u4d3a\u4af6\u4acd\u4aa4\u4adb\u4d42\u4ad8\u4d3a\u4aa3\u4aa8\u4abc\u4e1d\u4d38\u4aad\u4e09\u4ae0\u4ad9\u4adb\u4e1d\u4af7\u4aa6\u4ad5\u4e06\u4e1b\u4af3\u4b00\u4ad5\u4ad7\u4aa3\u4ad7\u4e07\u4d42\u4abb\u4af7\u4ada\u4ad4\u4d40\u4d3a\u4aa5\u4aad\u4d3f\u4abc\u4abb\u4aa6\u4ad5\u4ad9\u4aa5\u4d42\u4abc\u4af8\u4e1b\u4ae2\u4d3a\u4ad6\u4ae0\u4d39\u4aa7\u4d38\u4e1b\u4d33\u4e07\u4e1e\u4d42\u4e09\u4e0e\u4e08\u4aa7\u4e07\u4ae0\u4ad4\u4af7\u4aa6\u4e1e\u4ae0\u4af7\u4ad8\u4af8\u4e04\u4abb\u4d3a\u4af6\u4afa\u4d42\u4e1e\u4ae2\u4b00\u4aae\u4e0a\u4ad7\u4abd\u4ae2\u4ada\u4d40\u4aad\u4d37\u4e08\u4e03\u4ae2\u4adb\u4e1b\u4e1d\u4aa4\u4af3\u4e03\u4ae2\u4af4\u4e03\u4e06\u4ad7\u4ad7\u4ad3\u4ae2\u4aff\u4d36\u4aae\u4e04\u4e04\u4e03\u4af6\u4ad3\u4aa9\u4abc\u4acd\u4e0e\u4aa4\u4aa5\u4ad3\u4e21\u4e09\u4d34\u4af7\u4aae\u4aa5\u4e04\u4e21\u4aa8\u4aa3\u4ae2\u4ac1\u4e05\u4ad3".toCharArray();
            for (int i = J[165]; i < J[166]; ++i) {
                int n4 = cArray[i];
                n4 -= J[167];
                n4 += J[168];
                n4 += J[169];
                n4 += J[170];
                n4 -= J[171];
                n4 -= J[172];
                n4 += J[173];
                n4 += J[174];
                n4 ^= J[175];
                n4 += J[176];
                n4 ^= J[177];
                n4 ^= J[178];
                n4 -= J[179];
                n4 += J[180];
                n4 += J[181];
                n4 -= J[182];
                cArray[i] = (char)(n4 += J[183]);
            }
            object = kotakbaz.rain.client.render.main.vertex.mesh.A.A()[kotakbaz.rain.client.render.main.vertex.mesh.A.J[184]] = new String(cArray);
        }
        objectArray[n3] = (String)object;
        char[] cArray = ((String)kotakbaz.rain.client.render.main.vertex.mesh.A.a(objectArray)).toCharArray();
        long l16 = l5;
        int n5 = J[185];
        n5 += J[186];
        l5 = l16 ^ (0x2BA00000000L ^ l16) & -1L << (n5 += J[187]);
        long l17 = l12;
        int n6 = J[188];
        n6 += J[189];
        l12 = l17 ^ (0L ^ l17) & -1L >>> (n6 += J[190]);
        while (true) {
            int n7 = J[191];
            n7 -= J[192];
            if ((int)l12 >= (int)(l5 >>> (n7 -= J[193]))) break;
            int n8 = (int)l12;
            long l18 = l12;
            int n9 = J[194];
            n9 -= J[195];
            int n10 = J[197];
            n10 ^= J[198];
            l12 = l18 ^ (l18 ^ l18 + (long)(n9 -= J[196])) & -1L >>> (n10 += J[199]);
            long l19 = l8;
            int n11 = J[200];
            n11 ^= J[201];
            l8 = l19 ^ ((long)cArray[n8] ^ l19) & -1L >>> (n11 -= J[202]);
            int n12 = (int)l12;
            long l20 = l12;
            int n13 = J[203];
            n13 += J[204];
            int n14 = J[206];
            n14 -= J[207];
            l12 = l20 ^ (l20 ^ l20 + (long)(n13 += J[205])) & -1L >>> (n14 ^= J[208]);
            int n15 = J[209];
            n15 ^= J[210];
            long l21 = l9;
            int n16 = J[212];
            n16 -= J[213];
            l9 = l21 ^ ((long)cArray[n12] << (n15 += J[211]) ^ l21) & -1L << (n16 -= J[214]);
            int n17 = J[215];
            n17 -= J[216];
            n17 -= J[217];
            int n18 = J[218];
            n18 += J[219];
            long l22 = l11;
            int n19 = J[221];
            n19 -= J[222];
            l11 = l22 ^ ((long)((int)l8 << n17 | (int)(l9 >>> (n18 += J[220]))) ^ l22) & -1L >>> (n19 -= J[223]);
            char[] cArray2 = new char[(int)l11];
            long l23 = l13;
            int n20 = J[224];
            n20 += J[225];
            l13 = l23 ^ (0L ^ l23) & -1L << (n20 -= J[226]);
            while (true) {
                int n21 = J[227];
                n21 ^= J[228];
                if ((int)(l13 >>> (n21 += J[229])) >= (int)l11) break;
                int n22 = J[230];
                n22 += J[231];
                int n23 = J[233];
                n23 ^= J[234];
                cArray2[(int)(l13 >>> (n22 -= kotakbaz.rain.client.render.main.vertex.mesh.A.J[232]))] = cArray[(int)l12 + (int)(l13 >>> (n23 -= J[235]))];
                l13 += 0x100000000L;
            }
            int n24 = J[236];
            n24 ^= J[237];
            int n25 = (int)(l14 >>> (n24 ^= J[238]));
            l14 += 0x100000000L;
            kotakbaz.rain.client.render.main.vertex.mesh.A.h[n25] = new String(cArray2);
            long l24 = l12;
            int n26 = J[239];
            n26 -= J[240];
            l12 = l24 ^ ((long)((int)l12 + (int)l11) ^ l24) & -1L >>> (n26 ^= J[241]);
        }
    }

    public static Object a(Object[] object) {
        Object object2;
        int n = (Integer)object[J[242]];
        String string = (String)object[J[243]];
        object = object[J[244]];
        Object[] objectArray = I;
        if (I == null) {
            objectArray = I = new Object[J[245]];
        }
        if ((object2 = objectArray[n]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[J[246]];
                H = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[J[248] ^ J[249]];
                byArray[kotakbaz.rain.client.render.main.vertex.mesh.A.J[250] ^ kotakbaz.rain.client.render.main.vertex.mesh.A.J[251]] = J[252] ^ J[253];
                byArray[kotakbaz.rain.client.render.main.vertex.mesh.A.J[254] ^ kotakbaz.rain.client.render.main.vertex.mesh.A.J[255]] = J[256] ^ J[257];
                byArray[kotakbaz.rain.client.render.main.vertex.mesh.A.J[258] ^ kotakbaz.rain.client.render.main.vertex.mesh.A.J[259]] = J[260] ^ J[261];
                byArray[kotakbaz.rain.client.render.main.vertex.mesh.A.J[262] ^ kotakbaz.rain.client.render.main.vertex.mesh.A.J[263]] = J[264] ^ J[265];
                byArray[kotakbaz.rain.client.render.main.vertex.mesh.A.J[266] ^ kotakbaz.rain.client.render.main.vertex.mesh.A.J[267]] = J[268] ^ J[269];
                byArray[kotakbaz.rain.client.render.main.vertex.mesh.A.J[270] ^ kotakbaz.rain.client.render.main.vertex.mesh.A.J[271]] = J[272] ^ J[273];
                byArray[kotakbaz.rain.client.render.main.vertex.mesh.A.J[274] ^ kotakbaz.rain.client.render.main.vertex.mesh.A.J[275]] = J[276] ^ J[277];
                byArray[kotakbaz.rain.client.render.main.vertex.mesh.A.J[278] ^ kotakbaz.rain.client.render.main.vertex.mesh.A.J[279]] = J[280] ^ J[281];
                byArray[kotakbaz.rain.client.render.main.vertex.mesh.A.J[282] ^ kotakbaz.rain.client.render.main.vertex.mesh.A.J[283]] = J[284] ^ J[285];
                byArray[kotakbaz.rain.client.render.main.vertex.mesh.A.J[286] ^ kotakbaz.rain.client.render.main.vertex.mesh.A.J[287]] = J[288] ^ J[289];
                byArray[kotakbaz.rain.client.render.main.vertex.mesh.A.J[290] ^ kotakbaz.rain.client.render.main.vertex.mesh.A.J[291]] = J[292] ^ J[293];
                byArray[kotakbaz.rain.client.render.main.vertex.mesh.A.J[294] ^ kotakbaz.rain.client.render.main.vertex.mesh.A.J[295]] = J[296] ^ J[297];
                byArray[kotakbaz.rain.client.render.main.vertex.mesh.A.J[298] ^ kotakbaz.rain.client.render.main.vertex.mesh.A.J[299]] = J[300] ^ J[301];
                byArray[kotakbaz.rain.client.render.main.vertex.mesh.A.J[302] ^ kotakbaz.rain.client.render.main.vertex.mesh.A.J[303]] = J[304] ^ J[305];
                byArray[kotakbaz.rain.client.render.main.vertex.mesh.A.J[306] ^ kotakbaz.rain.client.render.main.vertex.mesh.A.J[307]] = J[308] ^ J[309];
                byArray[kotakbaz.rain.client.render.main.vertex.mesh.A.J[310] ^ kotakbaz.rain.client.render.main.vertex.mesh.A.J[311]] = J[312] ^ J[313];
                objectArray2[kotakbaz.rain.client.render.main.vertex.mesh.A.J[247]] = byArray;
            }
            byte[] byArray = (byte[])object3[J[314]];
            if (i == null) {
                byte[] byArray2 = new byte[J[315] ^ J[316]];
                byArray2[kotakbaz.rain.client.render.main.vertex.mesh.A.J[317] ^ kotakbaz.rain.client.render.main.vertex.mesh.A.J[318]] = J[319] ^ J[320];
                byArray2[kotakbaz.rain.client.render.main.vertex.mesh.A.J[321] ^ kotakbaz.rain.client.render.main.vertex.mesh.A.J[322]] = J[323] ^ J[324];
                byArray2[kotakbaz.rain.client.render.main.vertex.mesh.A.J[325] ^ kotakbaz.rain.client.render.main.vertex.mesh.A.J[326]] = J[327] ^ J[328];
                byArray2[kotakbaz.rain.client.render.main.vertex.mesh.A.J[329] ^ kotakbaz.rain.client.render.main.vertex.mesh.A.J[330]] = J[331] ^ J[332];
                byArray2[kotakbaz.rain.client.render.main.vertex.mesh.A.J[333] ^ kotakbaz.rain.client.render.main.vertex.mesh.A.J[334]] = J[335] ^ J[336];
                byArray2[kotakbaz.rain.client.render.main.vertex.mesh.A.J[337] ^ kotakbaz.rain.client.render.main.vertex.mesh.A.J[338]] = J[339] ^ J[340];
                byArray2[kotakbaz.rain.client.render.main.vertex.mesh.A.J[341] ^ kotakbaz.rain.client.render.main.vertex.mesh.A.J[342]] = J[343] ^ J[344];
                byArray2[kotakbaz.rain.client.render.main.vertex.mesh.A.J[345] ^ kotakbaz.rain.client.render.main.vertex.mesh.A.J[346]] = J[347] ^ J[348];
                byArray2[kotakbaz.rain.client.render.main.vertex.mesh.A.J[349] ^ kotakbaz.rain.client.render.main.vertex.mesh.A.J[350]] = J[351] ^ J[352];
                byArray2[kotakbaz.rain.client.render.main.vertex.mesh.A.J[353] ^ kotakbaz.rain.client.render.main.vertex.mesh.A.J[354]] = J[355] ^ J[356];
                byArray2[kotakbaz.rain.client.render.main.vertex.mesh.A.J[357] ^ kotakbaz.rain.client.render.main.vertex.mesh.A.J[358]] = J[359] ^ J[360];
                byArray2[kotakbaz.rain.client.render.main.vertex.mesh.A.J[361] ^ kotakbaz.rain.client.render.main.vertex.mesh.A.J[362]] = J[363] ^ J[364];
                byArray2[kotakbaz.rain.client.render.main.vertex.mesh.A.J[365] ^ kotakbaz.rain.client.render.main.vertex.mesh.A.J[366]] = J[367] ^ J[368];
                byArray2[kotakbaz.rain.client.render.main.vertex.mesh.A.J[369] ^ kotakbaz.rain.client.render.main.vertex.mesh.A.J[370]] = J[371] ^ J[372];
                byArray2[kotakbaz.rain.client.render.main.vertex.mesh.A.J[373] ^ kotakbaz.rain.client.render.main.vertex.mesh.A.J[374]] = J[375] ^ J[376];
                byArray2[kotakbaz.rain.client.render.main.vertex.mesh.A.J[377] ^ kotakbaz.rain.client.render.main.vertex.mesh.A.J[378]] = J[379] ^ J[380];
                byArray2[kotakbaz.rain.client.render.main.vertex.mesh.A.J[381] ^ kotakbaz.rain.client.render.main.vertex.mesh.A.J[382]] = J[383] ^ J[384];
                byArray2[kotakbaz.rain.client.render.main.vertex.mesh.A.J[385] ^ kotakbaz.rain.client.render.main.vertex.mesh.A.J[386]] = J[387] ^ J[388];
                byArray2[kotakbaz.rain.client.render.main.vertex.mesh.A.J[389] ^ kotakbaz.rain.client.render.main.vertex.mesh.A.J[390]] = J[391] ^ J[392];
                byArray2[kotakbaz.rain.client.render.main.vertex.mesh.A.J[393] ^ kotakbaz.rain.client.render.main.vertex.mesh.A.J[394]] = J[395] ^ J[396];
                byArray2[kotakbaz.rain.client.render.main.vertex.mesh.A.J[397] ^ kotakbaz.rain.client.render.main.vertex.mesh.A.J[398]] = J[399] ^ 0x75B;
                byArray2[0xC8F1 ^ 0xC8E6] = 0xFFFF3771 ^ 0xC8E6;
                byArray2[0x1832 ^ 0x1839] = 0xFFFFE7C4 ^ 0x1839;
                byArray2[0x4F09 ^ 0x4F13] = 0xFFFFB0B9 ^ 0x4F13;
                byArray2[0x1088A ^ 0x10892] = 0xFFFEF744 ^ 0x10892;
                byArray2[0x5C5F ^ 0x5C41] = 0x5C22 ^ 0x5C41;
                byArray2[0xAC9A ^ 0xAC94] = 0xACFB ^ 0xAC94;
                byArray2[0x6F29 ^ 0x6F2D] = 0x6F13 ^ 0x6F2D;
                byArray2[0x73AC ^ 0x73AF] = 0xFFFF8C54 ^ 0x73AF;
                byArray2[0x10A56 ^ 0x10A51] = 0xFFFEF5F2 ^ 0x10A51;
                byArray2[0x1B37 ^ 0x1B3B] = 0x1B4B ^ 0x1B3B;
                byArray2[0x6EF0 ^ 0x6EEC] = 0xFFFF9100 ^ 0x6EEC;
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, 0, byArray3, 0, byArray.length);
                System.arraycopy(byArray2, 0, byArray3, byArray.length, byArray2.length);
                Object object4 = kotakbaz.rain.client.render.main.vertex.mesh.A.A()[1];
                if (object4 == null) {
                    char[] cArray = "\u33e6\u3630\u361f\u33e2\u362c\u3680\u3613\u3305\u3332\u33ce\u362e\u3301\u33cd\u3307\u3617\u362e\u362d\u367d".toCharArray();
                    for (int i = 0; i < 18; ++i) {
                        int n2 = cArray[i];
                        n2 -= 51168;
                        n2 += 33763;
                        n2 -= 29444;
                        n2 ^= 0x4AE5;
                        n2 -= 17415;
                        n2 ^= 0x5668;
                        n2 ^= 0x75CA;
                        n2 += 52817;
                        n2 -= 1746;
                        n2 -= 47510;
                        n2 += 29752;
                        n2 += 64377;
                        n2 ^= 0x4B9A;
                        n2 += 21980;
                        n2 -= 43069;
                        cArray[i] = (char)(n2 -= 45502);
                    }
                    object4 = kotakbaz.rain.client.render.main.vertex.mesh.A.A()[1] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[16];
                byArray4[7] = 77;
                byArray4[11] = 33;
                byArray4[3] = 17;
                byArray4[6] = 105;
                byArray4[14] = -80;
                byArray4[0] = 60;
                byArray4[12] = 116;
                byArray4[4] = 9;
                byArray4[15] = -68;
                byArray4[9] = 90;
                byArray4[1] = -76;
                byArray4[10] = 45;
                byArray4[8] = 22;
                byArray4[5] = -72;
                byArray4[2] = -49;
                byArray4[13] = 89;
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, 10, 256);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = kotakbaz.rain.client.render.main.vertex.mesh.A.A()[2];
                if (object5 == null) {
                    char[] cArray = "\ud1a9\ud1ad\ud05b".toCharArray();
                    for (int i = 0; i < 3; ++i) {
                        int n3 = cArray[i];
                        n3 ^= 0x9150;
                        n3 -= 8835;
                        n3 ^= 0x1F93;
                        n3 ^= 0xA224;
                        n3 ^= 0x5715;
                        n3 ^= 0x4E87;
                        n3 ^= 0x98DA;
                        n3 -= 30411;
                        n3 += 14907;
                        n3 -= 9723;
                        cArray[i] = (char)(n3 ^= 0xBFBF);
                    }
                    object5 = kotakbaz.rain.client.render.main.vertex.mesh.A.A()[2] = new String(cArray);
                }
                i = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, 0, 16);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, 16, byArray6.length);
            Object object6 = kotakbaz.rain.client.render.main.vertex.mesh.A.A()[3];
            if (object6 == null) {
                char[] cArray = "\u516f\u516b\u51c1\u5e45\u5171\u5170\u5171\u5e45\u5166\u5169\u5171\u51c1\u519b\u5166\u518f\u5192\u5192\u5187\u5184\u518d".toCharArray();
                for (int i = 0; i < 20; ++i) {
                    int n4 = cArray[i];
                    n4 -= 10705;
                    n4 += 40499;
                    n4 -= 51046;
                    n4 += 24776;
                    n4 += 57945;
                    n4 ^= 9;
                    n4 ^= 0x699B;
                    n4 += 25707;
                    n4 -= 50269;
                    n4 -= 4446;
                    n4 ^= 0xB51E;
                    cArray[i] = (char)(n4 -= 911);
                }
                object6 = kotakbaz.rain.client.render.main.vertex.mesh.A.A()[3] = new String(cArray);
            }
            Cipher cipher = Cipher.getInstance((String)object6);
            cipher.init(2, (Key)((SecretKey)i), new IvParameterSpec(byArray7));
            byte[] byArray9 = cipher.doFinal(byArray8);
            object2 = new String(byArray9, StandardCharsets.UTF_8);
        }
        return object2;
    }

    private static Object[] A() {
        Object[] objectArray = j;
        if (j == null) {
            j = new Object[4];
            objectArray = j;
        }
        return objectArray;
    }

    public static void b() {
        J = new int[0x747C ^ 0x75EC];
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x10DE2 ^ 0x10D9F] = 0xFFFEF26B ^ 0x10D9F;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xCBF8 ^ 0xCA99] = 0x1B9C ^ 0xCA99;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x4052 ^ 0x4044] = 0x4017 ^ 0x4044;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x2E02 ^ 0x2E5A] = 0xFFFFD1FD ^ 0x2E5A;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xB061 ^ 0xB0EA] = 0xFFFF4F42 ^ 0xB0EA;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xB8AF ^ 0xB988] = 0x95F1 ^ 0xB988;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x109DD ^ 0x10998] = 0x109AD ^ 0x10998;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x63D1 ^ 0x62DC] = 0x8369 ^ 0x62DC;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xE74E ^ 0xE73D] = 0xE747 ^ 0xE73D;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x92D1 ^ 0x9250] = 0x9211 ^ 0x9250;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xD05E ^ 0xD069] = 0xD061 ^ 0xD069;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x190D ^ 0x194F] = 0x198B ^ 0x194F;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x10D0C ^ 0x10C52] = 0x16F ^ 0x10C52;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x63D9 ^ 0x63B2] = 0xFFFF9C79 ^ 0x63B2;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xCAC8 ^ 0xCA07] = 0xCA56 ^ 0xCA07;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xBF5E ^ 0xBF26] = 0xBF34 ^ 0xBF26;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x5500 ^ 0x546E] = 0xD5D0 ^ 0x546E;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x3D2C ^ 0x3D7E] = 0x3D0E ^ 0x3D7E;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x3B88 ^ 0x3BB7] = 0x3BE7 ^ 0x3BB7;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x61CC ^ 0x6163] = 0x61F6 ^ 0x6163;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xEAA2 ^ 0xEA7C] = 0xEA57 ^ 0xEA7C;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x879E ^ 0x86A7] = 0x1B00 ^ 0x86A7;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x7F0A ^ 0x7FFD] = 0x7FFD ^ 0x7FFD;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x6906 ^ 0x6941] = 0x6966 ^ 0x6941;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xF06A ^ 0xF17C] = 0xD856 ^ 0xF17C;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x33EA ^ 0x337F] = 0xFFFFCCEC ^ 0x337F;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xA623 ^ 0xA6DF] = 0xA5C9 ^ 0xA6DF;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x6EF5 ^ 0x6ED9] = 0xFFFF914B ^ 0x6ED9;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x5003 ^ 0x50F7] = 0x50F7 ^ 0x50F7;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xB759 ^ 0xB63A] = 0xFFFF9882 ^ 0xB63A;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x43E7 ^ 0x434E] = 0xAD48 ^ 0x434E;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x6203 ^ 0x62B5] = 0x11C9 ^ 0x62B5;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x579 ^ 0x581] = 0x9F10 ^ 0x581;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xDA4C ^ 0xDA4A] = 0xFFFF250A ^ 0xDA4A;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x5A1E ^ 0x5A24] = 0xFFFFA5E9 ^ 0x5A24;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xE7FA ^ 0xE747] = 0xE77F ^ 0xE747;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x5F75 ^ 0x5F49] = 0xFFFFA0A2 ^ 0x5F49;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xBCE5 ^ 0xBDFB] = 0x71BE ^ 0xBDFB;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[6 ^ 0x111] = 0x283C ^ 0x111;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xB9DB ^ 0xB9BF] = 0xB9A7 ^ 0xB9BF;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xF8A2 ^ 0xF82B] = 0xFFFF07D8 ^ 0xF82B;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xFFC ^ 0xE80] = 0x375F ^ 0xE80;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xE7CA ^ 0xE7BE] = 0xFFFF187A ^ 0xE7BE;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xE9DD ^ 0xE9CA] = 0xFFFF167E ^ 0xE9CA;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x62D9 ^ 0x620A] = 0x6206 ^ 0x620A;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xEA89 ^ 0xEA79] = 0xEA7D ^ 0xEA79;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xEB1A ^ 0xEBA5] = 0xFFFF1413 ^ 0xEBA5;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xC59B ^ 0xC56D] = 0xC56C ^ 0xC56D;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xB403 ^ 0xB571] = 0x4F1B ^ 0xB571;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x59AC ^ 0x5951] = 0x5A4E ^ 0x5951;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xE387 ^ 0xE2A1] = 0xCED7 ^ 0xE2A1;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xD302 ^ 0xD391] = 0xFFFF2C08 ^ 0xD391;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xE0ED ^ 0xE027] = 0xE03D ^ 0xE027;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x1608 ^ 0x171A] = 0x1A68 ^ 0x171A;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xA09E ^ 0xA0DA] = 0xA0A1 ^ 0xA0DA;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xFECD ^ 0xFE2C] = 0xFFFF01E3 ^ 0xFE2C;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xBC3F ^ 0xBCD3] = 0xBCD4 ^ 0xBCD3;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xD979 ^ 0xD9C2] = 0xD9CB ^ 0xD9C2;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x136 ^ 0x1A] = 0xFFFFB47C ^ 0x1A;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xC762 ^ 0xC625] = 0xFFFFEE63 ^ 0xC625;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xB03D ^ 0xB012] = 0xFFFF4FB3 ^ 0xB012;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xC08D ^ 0xC10B] = 0x5937 ^ 0xC10B;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x109AC ^ 0x10949] = 0x1097C ^ 0x10949;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xBC37 ^ 0xBD5A] = 0x3CF5 ^ 0xBD5A;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xB41E ^ 0xB488] = 0xFFFF4B23 ^ 0xB488;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xE025 ^ 0xE083] = 0xE343 ^ 0xE083;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x42EB ^ 0x43DB] = 0xB934 ^ 0x43DB;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x1D86 ^ 0x1D6F] = 0x1D0E ^ 0x1D6F;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x107C6 ^ 0x10705] = 0x10745 ^ 0x10705;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x359A ^ 0x353F] = 0x353F ^ 0x353F;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x6C20 ^ 0x6D0E] = 0x97AC ^ 0x6D0E;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x34BF ^ 0x35C7] = 0x8CA0 ^ 0x35C7;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xE935 ^ 0xE874] = 0x3186 ^ 0xE874;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xD2C1 ^ 0xD3B8] = 0xEA72 ^ 0xD3B8;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xEB5B ^ 0xEBCB] = 0xEBFA ^ 0xEBCB;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x101F7 ^ 0x101FF] = 0xFFFEFE7C ^ 0x101FF;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x10C83 ^ 0x10CE6] = 0x10CCC ^ 0x10CE6;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x88F5 ^ 0x8880] = 0x8886 ^ 0x8880;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x5411 ^ 0x550B] = 0x1BC8 ^ 0x550B;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x3A50 ^ 0x3A09] = 0x3A36 ^ 0x3A09;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x5ABD ^ 0x5AD4] = 0xFFFFA50F ^ 0x5AD4;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x6F0B ^ 0x6E87] = 0xC47F ^ 0x6E87;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x17CB ^ 0x16F3] = 0x8B22 ^ 0x16F3;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xEAF ^ 0xE44] = 0xE67 ^ 0xE44;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x66D4 ^ 0x67D6] = 0x1EE3 ^ 0x67D6;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x50C9 ^ 0x51AC] = 0xD96A ^ 0x51AC;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xA6AB ^ 0xA7E9] = 0x7E08 ^ 0xA7E9;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x3540 ^ 0x3433] = 0xFFFF31D2 ^ 0x3433;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x3326 ^ 0x32A6] = 0xB1E9 ^ 0x32A6;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x1077C ^ 0x107E2] = 0xFFFEF852 ^ 0x107E2;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xAD72 ^ 0xAC15] = 0x24AD ^ 0xAC15;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xCB16 ^ 0xCBA5] = 0xAF7C ^ 0xCBA5;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x978B ^ 0x973F] = 0x7E5 ^ 0x973F;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xD07A ^ 0xD07B] = 0xFFFF2F80 ^ 0xD07B;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x10C74 ^ 0x10CA2] = 0xFFFEF30B ^ 0x10CA2;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xFA51 ^ 0xFA55] = 0xFA14 ^ 0xFA55;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x7283 ^ 0x7207] = 0xFFFF8D68 ^ 0x7207;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xD74 ^ 0xCFB] = 0xBE6 ^ 0xCFB;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x6805 ^ 0x681F] = 0xFFFF97BE ^ 0x681F;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xFC90 ^ 0xFCC4] = 0xFCA5 ^ 0xFCC4;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x55F0 ^ 0x54F9] = 0xA4E7 ^ 0x54F9;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xA0A8 ^ 0xA1B8] = 0xFFFFF0D6 ^ 0xA1B8;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x8F46 ^ 0x8EC7] = 0xADB2 ^ 0x8EC7;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xB20E ^ 0xB248] = 0xFFFF4DE4 ^ 0xB248;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x9143 ^ 0x914A] = 0x91C8 ^ 0x914A;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x7255 ^ 0x72C8] = 0xFFFF8D60 ^ 0x72C8;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x76E3 ^ 0x7699] = 0xFFFF8939 ^ 0x7699;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xD51E ^ 0xD5FC] = 0xD58F ^ 0xD5FC;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x2DED ^ 0x2D3D] = 0xFFFFD284 ^ 0x2D3D;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x7787 ^ 0x76A8] = 0x8C08 ^ 0x76A8;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x1184 ^ 0x1110] = 0x1115 ^ 0x1110;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xB7C9 ^ 0xB6DD] = 0xFFFF4418 ^ 0xB6DD;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xBEE8 ^ 0xBFEF] = 0x4FF1 ^ 0xBFEF;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xCE5B ^ 0xCF2C] = 0x762B ^ 0xCF2C;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x84D8 ^ 0x8452] = 0xFFFF7BCD ^ 0x8452;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x1DB4 ^ 0x1D66] = 0x1D34 ^ 0x1D66;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x3D08 ^ 0x3D94] = 0xFFFFC27C ^ 0x3D94;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xF05B ^ 0xF143] = 0xFFFF27D3 ^ 0xF143;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x5286 ^ 0x522E] = 0xF1EA ^ 0x522E;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x6236 ^ 0x629A] = 0xCA35 ^ 0x629A;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x720F ^ 0x7342] = 0x17648 ^ 0x7342;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xCA8 ^ 0xD89] = 0xC1CD ^ 0xD89;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xF013 ^ 0xF0F5] = 0xFFFF0F9E ^ 0xF0F5;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x1026 ^ 0x1021] = 0x1060 ^ 0x1021;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x9EF0 ^ 0x9E0E] = 0x3D19 ^ 0x9E0E;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x495C ^ 0x4812] = 0x14D07 ^ 0x4812;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x471E ^ 0x460B] = 0x4B79 ^ 0x460B;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x110 ^ 0x4F] = 0x10D73 ^ 0x4F;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x4D58 ^ 0x4C54] = 0xADC5 ^ 0x4C54;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x4EB7 ^ 0x4E9F] = 0xFFFFB128 ^ 0x4E9F;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x81B9 ^ 0x8109] = 0x253C ^ 0x8109;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x7167 ^ 0x7012] = 0xC97C ^ 0x7012;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x5FF ^ 0x5B5] = 0xFFFFFA6D ^ 0x5B5;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x6DCE ^ 0x6D57] = 0x6D5C ^ 0x6D57;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xAE95 ^ 0xAFFD] = 0x272B ^ 0xAFFD;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x27E9 ^ 0x2701] = 0xFFFFD8B5 ^ 0x2701;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x2789 ^ 0x2787] = 0xFFFFD852 ^ 0x2787;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x3E2E ^ 0x3F18] = 0xA2BA ^ 0x3F18;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xBDCE ^ 0xBD00] = 0xFFFF42EA ^ 0xBD00;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x2F7C ^ 0x2E37] = 0x73C4 ^ 0x2E37;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x26A0 ^ 0x264D] = 0x260D ^ 0x264D;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x3293 ^ 0x321D] = 0xFFFFCDD0 ^ 0x321D;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x4DFA ^ 0x4DDD] = 0xFFFFB23C ^ 0x4DDD;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xCB11 ^ 0xCB58] = 0xCB2B ^ 0xCB58;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x4BA8 ^ 0x4A8A] = 0x68D ^ 0x4A8A;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xA126 ^ 0xA125] = 0xFFFF5EF4 ^ 0xA125;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xFC0F ^ 0xFD40] = 0x1F835 ^ 0xFD40;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x44DD ^ 0x44F8] = 0x448E ^ 0x44F8;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x9F77 ^ 0x9E45] = 0x4B4D ^ 0x9E45;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x2A65 ^ 0x2BEE] = 0xFFFF7EC4 ^ 0x2BEE;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x8512 ^ 0x855A] = 0xFFFF7AF0 ^ 0x855A;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xBFED ^ 0xBFDF] = 0xBFD6 ^ 0xBFDF;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xB5DA ^ 0xB579] = 0xB57B ^ 0xB579;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x72FA ^ 0x7294] = 0x72DF ^ 0x7294;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xA41D ^ 0xA571] = 0xF385 ^ 0xA571;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x681A ^ 0x689A] = 0xFFFF977F ^ 0x689A;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xDD65 ^ 0xDD28] = 0xFFFF22EF ^ 0xDD28;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xEB57 ^ 0xEA28] = 0xFFFF96F8 ^ 0xEA28;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x90BF ^ 0x918A] = 0x448F ^ 0x918A;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x1E1E ^ 0x1ED8] = 0x1E83 ^ 0x1ED8;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x6554 ^ 0x65A1] = 0x65A0 ^ 0x65A1;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xBB36 ^ 0xBB47] = 0xFFFF44D2 ^ 0xBB47;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xDEEF ^ 0xDFEE] = 0x7CF5 ^ 0xDFEE;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x3688 ^ 0x37D5] = 0x13AE7 ^ 0x37D5;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x8FD0 ^ 0x8FB2] = 0xFFFF7046 ^ 0x8FB2;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xB4DA ^ 0xB4B6] = 0xB4D4 ^ 0xB4B6;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xE44A ^ 0xE425] = 0xE49B ^ 0xE425;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xFF23 ^ 0xFE30] = 0xF342 ^ 0xFE30;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x109E5 ^ 0x108EA] = 0x1A673 ^ 0x108EA;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x5302 ^ 0x53DB] = 0x53A3 ^ 0x53DB;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xACF1 ^ 0xAC24] = 0xFFFF53AE ^ 0xAC24;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x6E1F ^ 0x6E32] = 0xFFFF9103 ^ 0x6E32;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xFC54 ^ 0xFC17] = 0xFC43 ^ 0xFC17;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x4F5E ^ 0x4F97] = 0x4FBF ^ 0x4F97;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x777F ^ 0x7717] = 0x770B ^ 0x7717;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x2DFA ^ 0x2D2D] = 0x2D84 ^ 0x2D2D;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x5481 ^ 0x55BC] = 0x15BCD ^ 0x55BC;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xE2A4 ^ 0xE29D] = 0xE2C0 ^ 0xE29D;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x3142 ^ 0x3109] = 0x3172 ^ 0x3109;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x97F9 ^ 0x979E] = 0xFFFF6850 ^ 0x979E;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xF130 ^ 0xF01D] = 0xBBE7 ^ 0xF01D;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x849D ^ 0x85A6] = 0x70C0 ^ 0x85A6;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xE8CF ^ 0xE98F] = 0x1E7FC ^ 0xE98F;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xA8CD ^ 0xA8BB] = 0xFFFF5766 ^ 0xA8BB;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x3F33 ^ 0x3F82] = 0x84F5 ^ 0x3F82;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x102E2 ^ 0x103E4] = 0x1F3FC ^ 0x103E4;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x8039 ^ 0x8150] = 0xD7BF ^ 0x8150;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x69E1 ^ 0x69E1] = 0x69B8 ^ 0x69E1;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x583D ^ 0x58C4] = 0xC245 ^ 0x58C4;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x73C6 ^ 0x73DB] = 0x73F2 ^ 0x73DB;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xC6AC ^ 0xC629] = 0xC66B ^ 0xC629;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xA636 ^ 0xA64A] = 0xFFFF5982 ^ 0xA64A;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x3E4E ^ 0x3F55] = 0x7198 ^ 0x3F55;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x9977 ^ 0x9926] = 0xFFFF66FD ^ 0x9926;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xA64B ^ 0xA690] = 0xA6B7 ^ 0xA690;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xA795 ^ 0xA727] = 0xEDFF ^ 0xA727;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xCD7 ^ 0xD94] = 0xD45F ^ 0xD94;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xB63A ^ 0xB730] = 0x568F ^ 0xB730;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x10987 ^ 0x10993] = 0xFFFEF644 ^ 0x10993;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x102C7 ^ 0x102F2] = 0x102BE ^ 0x102F2;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xE30C ^ 0xE3C0] = 0xFFFF1C14 ^ 0xE3C0;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x77DD ^ 0x7765] = 0x7765 ^ 0x7765;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xF7D3 ^ 0xF6A3] = 0x771D ^ 0xF6A3;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x1719 ^ 0x1737] = 0x1746 ^ 0x1737;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x7301 ^ 0x723F] = 0x17C4C ^ 0x723F;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xEB8D ^ 0xEA90] = 0xA45D ^ 0xEA90;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x976F ^ 0x9752] = 0x9706 ^ 0x9752;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x373E ^ 0x37EF] = 0x37A9 ^ 0x37EF;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x67F8 ^ 0x6686] = 0xE5C9 ^ 0x6686;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xE922 ^ 0xE937] = 0xE935 ^ 0xE937;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x8416 ^ 0x8469] = 0x8453 ^ 0x8469;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x382F ^ 0x3907] = 0x153A ^ 0x3907;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x9BFA ^ 0x9B19] = 0xFFFF6481 ^ 0x9B19;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x3755 ^ 0x37A6] = 0x37A4 ^ 0x37A6;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x5579 ^ 0x550E] = 0x5507 ^ 0x550E;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x2CFE ^ 0x2CB2] = 0x2CF0 ^ 0x2CB2;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x3512 ^ 0x352C] = 0xFFFFCAEE ^ 0x352C;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x18F0 ^ 0x18A7] = 0xFFFFE71F ^ 0x18A7;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x852C ^ 0x8433] = 0x4877 ^ 0x8433;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xBAE6 ^ 0xBA41] = 0x7341 ^ 0xBA41;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x2C49 ^ 0x2C37] = 0xFFFFD39B ^ 0x2C37;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x3009 ^ 0x3054] = 0x100303B ^ 0x3054;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x1F66 ^ 0x1F82] = 0x1FF1 ^ 0x1F82;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xF58B ^ 0xF529] = 0xF529 ^ 0xF529;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x2203 ^ 0x2306] = 0x5A3B ^ 0x2306;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x4788 ^ 0x475C] = 0xFFFFB80F ^ 0x475C;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x148C ^ 0x15FD] = 0xEF9D ^ 0x15FD;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x19F0 ^ 0x1961] = 0x1927 ^ 0x1961;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x55B8 ^ 0x5501] = 0xFFFFAAFE ^ 0x5501;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x362 ^ 0x230] = 0x9CC9 ^ 0x230;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x99ED ^ 0x98BC] = 0x64D ^ 0x98BC;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x52 ^ 0x34] = 0xFFFFFFE6 ^ 0x34;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xB982 ^ 0xB80C] = 0xBF57 ^ 0xB80C;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x8672 ^ 0x86B2] = 0xFFFF796E ^ 0x86B2;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xD8FE ^ 0xD97A] = 0xFA02 ^ 0xD97A;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x9841 ^ 0x98C3] = 0xFFFF672A ^ 0x98C3;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xBCD5 ^ 0xBCF3] = 0xFFFF4320 ^ 0xBCF3;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x2E08 ^ 0x2E69] = 0x2E21 ^ 0x2E69;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x6C44 ^ 0x6D4F] = 0x8CFA ^ 0x6D4F;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x4A36 ^ 0x4B5C] = 0x1DA8 ^ 0x4B5C;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x108A0 ^ 0x1080E] = 0x1D41D ^ 0x1080E;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xFD1 ^ 0xF66] = 0x60B9 ^ 0xF66;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x52B7 ^ 0x53B7] = 0xFFFF0F71 ^ 0x53B7;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xF930 ^ 0xF850] = 0x1F56D ^ 0xF850;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x92E0 ^ 0x92D3] = 0x92C2 ^ 0x92D3;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x5ED1 ^ 0x5FBA] = 0xFFFFF6AD ^ 0x5FBA;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x1ACE ^ 0x1BAA] = 0xCABD ^ 0x1BAA;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x61A0 ^ 0x609F] = 0xFFFE9146 ^ 0x609F;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xCCB4 ^ 0xCC1F] = 0x9FD7 ^ 0xCC1F;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x811A ^ 0x8196] = 0xFFFF7E60 ^ 0x8196;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xEB0B ^ 0xEBC3] = 0xEBD1 ^ 0xEBC3;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x27B3 ^ 0x2749] = 0x245D ^ 0x2749;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x1C7C ^ 0x1D1A] = 0x95CC ^ 0x1D1A;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x24ED ^ 0x242A] = 0x2466 ^ 0x242A;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xBAE5 ^ 0xBA77] = 0xFFFF45E1 ^ 0xBA77;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xBB83 ^ 0xBA00] = 0xFFFF66D9 ^ 0xBA00;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x1833 ^ 0x1964] = 0xE810 ^ 0x1964;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x9DF8 ^ 0x9CA2] = 0xCE7F ^ 0x9CA2;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xB373 ^ 0xB235] = 0x658F ^ 0xB235;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x10532 ^ 0x1058C] = 0xFFFEFA79 ^ 0x1058C;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x6723 ^ 0x663F] = 0x2885 ^ 0x663F;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x90BF ^ 0x90BA] = 0x90D4 ^ 0x90BA;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x1064C ^ 0x10719] = 0x1F608 ^ 0x10719;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x87CF ^ 0x8720] = 0xFFFF78E6 ^ 0x8720;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xDA71 ^ 0xDA5A] = 0xDA4C ^ 0xDA5A;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x837E ^ 0x8375] = 0x834B ^ 0x8375;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x61B3 ^ 0x61E9] = 0x6157 ^ 0x61E9;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x336B ^ 0x324F] = 0xFFFF8195 ^ 0x324F;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x10ACC ^ 0x10BCF] = 0x172F2 ^ 0x10BCF;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x376 ^ 0x39C] = 0x3BE ^ 0x39C;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x98AC ^ 0x98C6] = 0x98D6 ^ 0x98C6;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xAE1E ^ 0xAF35] = 0xE4CF ^ 0xAF35;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x2DBC ^ 0x2DCE] = 0xFFFFD22C ^ 0x2DCE;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xE5F3 ^ 0xE56C] = 0xE56F ^ 0xE56C;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xF287 ^ 0xF28B] = 0xFFFF0D6D ^ 0xF28B;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x6150 ^ 0x6106] = 0xFFFF9E82 ^ 0x6106;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x6548 ^ 0x65C0] = 0x6587 ^ 0x65C0;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x86D5 ^ 0x8791] = 0x5E70 ^ 0x8791;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x944C ^ 0x9514] = 0x6400 ^ 0x9514;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x3278 ^ 0x332E] = 0xC23A ^ 0x332E;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xA15 ^ 0xA4B] = 0xFFFFF5E0 ^ 0xA4B;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x280C ^ 0x298E] = 0xAF6 ^ 0x298E;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x6FD4 ^ 0x6F4C] = 0x6F01 ^ 0x6F4C;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xAA10 ^ 0xAB9D] = 0xACDB ^ 0xAB9D;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xC512 ^ 0xC49A] = 0x5CA6 ^ 0xC49A;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x32CF ^ 0x329A] = 0x32A1 ^ 0x329A;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x7BBE ^ 0x7A39] = 0xFFFF1DE6 ^ 0x7A39;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x5C11 ^ 0x5CEE] = 0xFFF5 ^ 0x5CEE;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x15EE ^ 0x1561] = 0x156E ^ 0x1561;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xC69 ^ 0xC77] = 0xFFFFF3C1 ^ 0xC77;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x9799 ^ 0x972C] = 0x56D6 ^ 0x972C;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x105F1 ^ 0x104F5] = 0xFFFE827A ^ 0x104F5;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x7FD2 ^ 0x7EE1] = 0xABE4 ^ 0x7EE1;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x1FBF ^ 0x1ED0] = 0xFFFF6083 ^ 0x1ED0;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x12AE ^ 0x1229] = 0xFFFFED9F ^ 0x1229;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xE752 ^ 0xE7EE] = 0xFFFF181D ^ 0xE7EE;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x102CC ^ 0x103B8] = 0x1F9D2 ^ 0x103B8;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xA493 ^ 0xA4E8] = 0xFFFF5B3B ^ 0xA4E8;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x8B41 ^ 0x8BE5] = 0x8BE5 ^ 0x8BE5;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xADAB ^ 0xAC81] = 0xE778 ^ 0xAC81;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x824E ^ 0x82BF] = 0xFFFF7D5D ^ 0x82BF;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x5850 ^ 0x5811] = 0xFFFFA7A7 ^ 0x5811;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x6140 ^ 0x6069] = 0x4C10 ^ 0x6069;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x35F ^ 0x265] = 0x265 ^ 0x265;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xD5DF ^ 0xD4A9] = 0x6DCE ^ 0xD4A9;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x3B04 ^ 0x3A50] = 0xA4A9 ^ 0x3A50;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x2D14 ^ 0x2DD6] = 0x2DDD ^ 0x2DD6;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xEA36 ^ 0xEB54] = 0x3A43 ^ 0xEB54;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x6FF9 ^ 0x6F89] = 0x6FDD ^ 0x6F89;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xB4F2 ^ 0xB4FD] = 0xFFFF4B66 ^ 0xB4FD;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xA5C3 ^ 0xA54E] = 0xFFFF5A8C ^ 0xA54E;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x3470 ^ 0x34AA] = 0x34DB ^ 0x34AA;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x87C4 ^ 0x8700] = 0xFFFF78CA ^ 0x8700;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x315 ^ 0x3DE] = 0x342 ^ 0x3DE;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x5D6 ^ 0x45C] = 0xAEA4 ^ 0x45C;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x4730 ^ 0x470B] = 0x4724 ^ 0x470B;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xE1B9 ^ 0xE157] = 0xE130 ^ 0xE157;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x355C ^ 0x3468] = 0xE142 ^ 0x3468;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x516F ^ 0x5176] = 0xFFFFAEEE ^ 0x5176;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x830D ^ 0x823A] = 0x1F9D ^ 0x823A;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x445F ^ 0x4483] = 0xFFFFBB0B ^ 0x4483;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x2259 ^ 0x22F8] = 0x22F9 ^ 0x22F8;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x7CD8 ^ 0x7DA2] = 0x447D ^ 0x7DA2;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x4FD9 ^ 0x4E91] = 0x992B ^ 0x4E91;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xD00F ^ 0xD041] = 0xD00D ^ 0xD041;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x3EDE ^ 0x3FC7] = 0x16EA ^ 0x3FC7;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xF7E8 ^ 0xF713] = 0xF40C ^ 0xF713;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x93F8 ^ 0x92B4] = 0xCF1D ^ 0x92B4;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xFA8F ^ 0xFA9F] = 0xFA8E ^ 0xFA9F;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xCF9A ^ 0xCF7A] = 0xCFBE ^ 0xCF7A;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xFE3B ^ 0xFE1B] = 0xFFFF01AB ^ 0xFE1B;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x3D2E ^ 0x3D4D] = 0x3D08 ^ 0x3D4D;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xCFEC ^ 0xCFFD] = 0xCF8B ^ 0xCFFD;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x8FF9 ^ 0x8FC9] = 0x8FC1 ^ 0x8FC9;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x7958 ^ 0x787D] = 0x3473 ^ 0x787D;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xB5B ^ 0xA00] = 0xFFFFA720 ^ 0xA00;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xA20 ^ 0xA33] = 0xFFFFF59A ^ 0xA33;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x7DFC ^ 0x7DE7] = 0xFFFF8234 ^ 0x7DE7;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x357B ^ 0x3527] = 0x351B ^ 0x3527;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xFBC5 ^ 0xFB9E] = 0xFBFC ^ 0xFB9E;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xBDFA ^ 0xBDCB] = 0xBDC9 ^ 0xBDCB;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x9AAD ^ 0x9AE2] = 0x9A83 ^ 0x9AE2;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x10A7 ^ 0x10A5] = 0xFFFFEF07 ^ 0x10A5;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x3133 ^ 0x312C] = 0xFFFFCED4 ^ 0x312C;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x50CE ^ 0x50F6] = 0x50C8 ^ 0x50F6;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x781B ^ 0x7862] = 0x7816 ^ 0x7862;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xD9F5 ^ 0xD8A5] = 0x1DDB0 ^ 0xD8A5;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xDF4 ^ 0xCE5] = 0xA27C ^ 0xCE5;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x5873 ^ 0x5845] = 0x5862 ^ 0x5845;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x3CDF ^ 0x3C75] = 0x48D3 ^ 0x3C75;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x9277 ^ 0x925E] = 0xFFFF6D88 ^ 0x925E;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x601D ^ 0x613D] = 0xFFFF52BA ^ 0x613D;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x9113 ^ 0x902F] = 0x6569 ^ 0x902F;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xF7C4 ^ 0xF701] = 0xFFFF088E ^ 0xF701;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xDA50 ^ 0xDB61] = 0x21C1 ^ 0xDB61;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x2270 ^ 0x222F] = 0x2234 ^ 0x222F;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x63B4 ^ 0x6395] = 0x63D0 ^ 0x6395;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xB489 ^ 0xB49B] = 0xFFFF4BEB ^ 0xB49B;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xE8B1 ^ 0xE826] = 0xFFFF17DE ^ 0xE826;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x2A38 ^ 0x2AE0] = 0x2AC1 ^ 0x2AE0;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x4D30 ^ 0x4C4D] = 0xCF04 ^ 0x4C4D;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x5D83 ^ 0x5D18] = 0xFFFFA2C8 ^ 0x5D18;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xD3CA ^ 0xD32D] = 0xD344 ^ 0xD32D;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xAE27 ^ 0xAE13] = 0xFFFF51B7 ^ 0xAE13;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x6FCB ^ 0x6EB0] = 0x570F ^ 0x6EB0;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x2BB5 ^ 0x2A3C] = 0x80DD ^ 0x2A3C;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xB803 ^ 0xB95F] = 0xEB82 ^ 0xB95F;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xA44E ^ 0xA464] = 0xA4F2 ^ 0xA464;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x9A8D ^ 0x9A4C] = 0xFFFF65F6 ^ 0x9A4C;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xB783 ^ 0xB6DA] = 0xE411 ^ 0xB6DA;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xA16E ^ 0xA0EB] = 0x38C3 ^ 0xA0EB;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xCEB2 ^ 0xCE7F] = 0xFFFF31EE ^ 0xCE7F;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x4B96 ^ 0x4B9C] = 0xFFFFB420 ^ 0x4B9C;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x196 ^ 0x12C] = 0x134 ^ 0x12C;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x91B5 ^ 0x90FF] = 0xCD56 ^ 0x90FF;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xCD8E ^ 0xCD96] = 0xCD9E ^ 0xCD96;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x90DD ^ 0x902F] = 0x902E ^ 0x902F;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x4E52 ^ 0x4E32] = 0x4E0F ^ 0x4E32;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xFC25 ^ 0xFC75] = 0xFFFF039E ^ 0xFC75;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xBDAB ^ 0xBDB7] = 0xFFFF424D ^ 0xBDB7;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x95D8 ^ 0x949D] = 0x4327 ^ 0x949D;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x2539 ^ 0x2579] = 0x257F ^ 0x2579;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xC622 ^ 0xC771] = 0xFFFFA62D ^ 0xC771;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x76F7 ^ 0x76D5] = 0x76E6 ^ 0x76D5;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x77F3 ^ 0x76D0] = 0x3ADE ^ 0x76D0;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x6287 ^ 0x638F] = 0x93C4 ^ 0x638F;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x10148 ^ 0x1016C] = 0x10134 ^ 0x1016C;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xDD4E ^ 0xDC40] = 0x72DD ^ 0xDC40;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x3A81 ^ 0x3A5E] = 0xFFFFC5CD ^ 0x3A5E;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x3E02 ^ 0x3E81] = 0xFFFFC129 ^ 0x3E81;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xF551 ^ 0xF418] = 0xA9B0 ^ 0xF418;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x6442 ^ 0x642F] = 0xFFFF9BD8 ^ 0x642F;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x5979 ^ 0x5974] = 0xFFFFA69B ^ 0x5974;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xABA ^ 0xA17] = 0xD2C6 ^ 0xA17;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x8EE1 ^ 0x8E3C] = 0xFFFF71E2 ^ 0x8E3C;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x2F3B ^ 0x2F18] = 0xFFFFD0E0 ^ 0x2F18;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0xB105 ^ 0xB183] = 0xB1D8 ^ 0xB183;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x1034C ^ 0x103D6] = 0xFFFEFC1E ^ 0x103D6;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x1F62 ^ 0x1FC2] = 0x1FC2 ^ 0x1FC2;
        kotakbaz.rain.client.render.main.vertex.mesh.A.J[0x7EB8 ^ 0x7EEB] = 0x7EAC ^ 0x7EEB;
    }
}

