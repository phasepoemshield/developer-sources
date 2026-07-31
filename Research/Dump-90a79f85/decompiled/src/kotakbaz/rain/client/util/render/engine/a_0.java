/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client.util.render.engine;

import kotakbaz.rain.client.render.main.B;
import kotakbaz.rain.client.render.main.ChromaRenderer;
import kotakbaz.rain.client.render.main.builders.b;
import kotakbaz.rain.client.render.main.vertex.mesh.b_0;
import kotakbaz.rain.client.util.render.engine.A;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from kotakbaz.rain.client.util.render.engine.a
 */
@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b&\u0018\u0000 ,2\u00020\u0001:\u0001,B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&\u00a2\u0006\u0004\b\u0007\u0010\u0006J\u0011\u0010\t\u001a\u0004\u0018\u00010\bH&\u00a2\u0006\u0004\b\t\u0010\nJ\u0011\u0010\f\u001a\u0004\u0018\u00010\u000bH&\u00a2\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH&\u00a2\u0006\u0004\b\u000f\u0010\u0003J#\u0010\u0013\u001a\u00020\u00122\b\u0010\u0010\u001a\u0004\u0018\u00010\u00012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0016\u00a2\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0000H\u0016\u00a2\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u001b\u001a\u00020\u000e2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u0016\u00a2\u0006\u0004\b\u001b\u0010\u001cJ/\u0010 \u001a\u0006\u0012\u0002\b\u00030\u001f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\u000e\u00a2\u0006\u0004\b\"\u0010\u0003J\u0017\u0010%\u001a\u00020\u000e2\b\u0010$\u001a\u0004\u0018\u00010#\u00a2\u0006\u0004\b%\u0010&R$\u0010'\u001a\u0004\u0018\u00010#8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010&\u00a8\u0006-"}, d2={"Lkotakbaz/rain/client/util/render/engine/Renderable;", "", "<init>", "()V", "", "name", "()Ljava/lang/String;", "shader", "Lkotakbaz/rain/client/render/main/vertex/DrawMode;", "drawMode", "()Lkotakbaz/rain/client/render/main/vertex/DrawMode;", "Lkotakbaz/rain/client/render/main/vertex/format/VertexFormat;", "vertexFormat", "()Lkotakbaz/rain/client/render/main/vertex/format/VertexFormat;", "", "load", "oldState", "newState", "", "isBatchCompatible", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "other", "canBatchWith", "(Lkotakbaz/rain/client/util/render/engine/Renderable;)Z", "Lkotakbaz/rain/client/render/main/vertex/mesh/IMesh;", "mesh", "state", "renderBatch", "(Lkotakbaz/rain/client/render/main/vertex/mesh/IMesh;Ljava/lang/Object;)V", "fsh", "vsh", "Lkotakbaz/rain/client/render/main/builders/GlProgramBuilder;", "createShaderBuilder", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lkotakbaz/rain/client/render/main/builders/GlProgramBuilder;", "initMatrix", "Lkotakbaz/rain/client/render/main/program/GlProgram;", "globalProgram", "setGlobalProgram", "(Lkotakbaz/rain/client/render/main/program/GlProgram;)V", "glProgram", "Lkotakbaz/rain/client/render/main/program/GlProgram;", "getGlProgram", "()Lkotakbaz/rain/client/render/main/program/GlProgram;", "setGlProgram", "Companion", "rain-visuals"})
public abstract class a_0 {
    @NotNull
    public static final A h;
    @Nullable
    private kotakbaz.rain.client.render.main.program.A H;
    @NotNull
    private static final String i;
    @NotNull
    private static final String I;
    @NotNull
    private static final String j;
    private static Object[] a;

    public a_0() {
        super();
    }

    @NotNull
    public abstract String name();

    @NotNull
    public abstract String shader();

    @Nullable
    public abstract kotakbaz.rain.client.render.main.vertex.A drawMode();

    @Nullable
    public abstract kotakbaz.rain.client.render.main.vertex.format.a_0 vertexFormat();

    public abstract void load();

    @Nullable
    public final kotakbaz.rain.client.render.main.program.A getGlProgram() {
        return this.H;
    }

    public final void setGlProgram(@Nullable kotakbaz.rain.client.render.main.program.A a2) {
        this.H = a2;
    }

    public boolean isBatchCompatible(@Nullable Object object, @Nullable Object object2) {
        return Intrinsics.areEqual(object, object2);
    }

    public boolean canBatchWith(@NotNull a_0 a_02) {
        boolean bl;
        int n = 22;
        n ^= 0xFFFFFF88;
        Intrinsics.checkNotNullParameter(a_02, (String)a[n += 104]);
        if (this == a_02) {
            boolean bl2;
            int n2 = -1;
            n2 = n2 + -23;
            bl = bl2 = n2 + 25;
        } else {
            boolean bl3;
            int n4 = 122;
            n4 = n4 + 0;
            bl = bl3 = n4 ^ 0x7A;
        }
        return bl;
    }

    public void renderBatch(@Nullable b_0 b_02, @Nullable Object object) {
        this.setGlobalProgram(this.H);
        this.initMatrix();
        ChromaRenderer.draw(b_02);
    }

    @NotNull
    public final b<?> createShaderBuilder(@Nullable String string, @Nullable String string2, @Nullable String string3) {
        int n = 120;
        n += -82;
        kotakbaz.rain.client.render.main.program.a_0[] a_0Array = new kotakbaz.rain.client.render.main.program.a_0[n -= 37];
        int n2 = -7;
        n2 ^= 0xFFFFFFB4;
        a_0Array[n2 -= 77] = ChromaRenderer.matrixSnippet;
        String string4 = string;
        int n3 = -76;
        n3 -= -13;
        n3 += 63;
        String string5 = string3;
        String string6 = I;
        int n4 = 92;
        n4 ^= 0xFFFFFF8B;
        n4 -= -43;
        String string7 = string;
        int n5 = 70;
        n5 ^= 0xFFFFFFB5;
        String string8 = string2;
        String string9 = I;
        int n6 = 85;
        n6 -= 7;
        b<String> b2 = B.a.createProgramBuilder(a_0Array).name(string).shader(B.a.createGlslFileEntry(string4 + (String)a[n3], string6 + string5 + (String)a[n4]), kotakbaz.rain.client.render.main.program.shader.a_0.a).shader(B.a.createGlslFileEntry(string7 + (String)a[n5 -= -14], string9 + string8 + (String)a[n6 ^= 0x49]), kotakbaz.rain.client.render.main.program.shader.a_0.A);
        int n7 = 26;
        n7 += 104;
        Intrinsics.checkNotNullExpressionValue(b2, (String)a[n7 += -125]);
        return b2;
    }

    public final void initMatrix() {
        ChromaRenderer.initMatrix();
    }

    public final void setGlobalProgram(@Nullable kotakbaz.rain.client.render.main.program.A a2) {
        ChromaRenderer.setGlobalProgram(a2);
    }

    public static final /* synthetic */ String access$getSHADER_PATH$cp() {
        return i;
    }

    public static final /* synthetic */ String access$getSHADER_CORE_PATH$cp() {
        return I;
    }

    public static final /* synthetic */ String access$getSHADER_INCLUDE_PATH$cp() {
        return j;
    }

    static {
        long l = -7573239424398578097L;
        long l2 = 1765619677375697568L;
        long l3 = -1911408422925018517L;
        long l4 = -6256434379376888439L;
        long l5 = 9001648141646946973L;
        long l6 = 2508103093074699332L;
        long l7 = 9183905003865450667L;
        long l8 = 6469725980916682384L;
        long l9 = -7708200314730119693L;
        long l10 = -5156992204226451439L;
        long l11 = -8443094738621152938L;
        long l12 = -322257435448133274L;
        long l13 = -9063478336517445516L;
        long l14 = 160165363467366011L;
        int n = -78;
        n -= -76;
        a = new Object[n ^= 0xFFFFFFF4];
        long l15 = l14;
        int n2 = -243;
        n2 ^= 0xFFFFFF8E;
        l14 = l15 ^ (0L ^ l15) & -1L << (n2 += -99);
        Object object = "\u0000\u0007-vertex\u0000\t-fragment\u0000\u0004.vsh\u0000\t/shaders/\u0000\binclude/\u0000\u000bshader(...)\u0000\u0005other\u0000\u0004.fsh\u0000\u0005core/\u0000\u0007assets/".toCharArray();
        long l16 = l5;
        int n3 = -13;
        n3 += 19;
        l5 = l16 ^ (0x5900000000L ^ l16) & -1L << (n3 ^= 0x26);
        long l17 = l12;
        int n4 = 111;
        n4 += -84;
        l12 = l17 ^ (0L ^ l17) & -1L >>> (n4 ^= 0x3B);
        while (true) {
            int n5 = 52;
            n5 ^= 0xFFFFFF8D;
            if ((int)l12 >= (int)(l5 >>> (n5 += 103))) break;
            int n6 = (int)l12;
            long l18 = l12;
            int n7 = -127;
            n7 ^= 0x33;
            int n8 = 81;
            n8 += 7;
            l12 = l18 ^ (l18 ^ l18 + (long)(n7 -= -79)) & -1L >>> (n8 -= 56);
            long l19 = l8;
            int n9 = -24;
            n9 ^= 0xFFFFFF94;
            l8 = l19 ^ ((long)object[n6] ^ l19) & -1L >>> (n9 ^= 0x5C);
            int n10 = (int)l12;
            long l20 = l12;
            int n11 = 26;
            n11 += 3;
            int n12 = 151;
            n12 -= -6;
            l12 = l20 ^ (l20 ^ l20 + (long)(n11 += -28)) & -1L >>> (n12 -= 125);
            int n13 = 22;
            n13 ^= 0x12;
            long l21 = l9;
            int n14 = -40;
            n14 -= -115;
            l9 = l21 ^ ((long)object[n10] << (n13 -= -28) ^ l21) & -1L << (n14 += -43);
            int n15 = 241;
            n15 += -99;
            n15 += -126;
            int n16 = 9;
            n16 ^= 0x26;
            long l22 = l11;
            int n17 = 55;
            n17 -= 0;
            l11 = l22 ^ ((long)((int)l8 << n15 | (int)(l9 >>> (n16 -= 15))) ^ l22) & -1L >>> (n17 -= 23);
            char[] cArray = new char[(int)l11];
            long l23 = l13;
            int n18 = 253;
            n18 ^= 0x64;
            l13 = l23 ^ (0L ^ l23) & -1L << (n18 -= 121);
            while (true) {
                int n19 = -94;
                n19 ^= 0xFFFFFFDF;
                if ((int)(l13 >>> (n19 += -93)) >= (int)l11) break;
                int n20 = 190;
                n20 += -98;
                int n21 = -9;
                n21 ^= 0x32;
                cArray[(int)(l13 >>> (n20 += -60))] = object[(int)l12 + (int)(l13 >>> (n21 += 91))];
                l13 += 0x100000000L;
            }
            int n22 = 21;
            n22 += -50;
            int n23 = (int)(l14 >>> (n22 -= -61));
            l14 += 0x100000000L;
            a_0.a[n23] = new String(cArray);
            long l24 = l12;
            int n24 = -51;
            n24 += 3;
            l12 = l24 ^ ((long)((int)l12 + (int)l11) ^ l24) & -1L >>> (n24 ^= 0xFFFFFFF0);
        }
        h = new A(null);
        String string = kotakbaz.rain.client.extensions.A.getCLIENT_ID();
        int n25 = 47;
        n25 += -69;
        int n26 = 24;
        n26 ^= 0xFFFFFFA8;
        i = (String)a[n25 ^= 0xFFFFFFE3] + string + (String)a[n26 ^= 0xFFFFFFB3];
        object = i;
        int n27 = 64;
        n27 ^= 0x60;
        I = object + (String)a[n27 -= 24];
        String string2 = i;
        int n28 = -63;
        n28 -= -98;
        j = string2 + (String)a[n28 += -31];
    }
}

