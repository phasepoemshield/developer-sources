/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client.util.render.engine;

import kotakbaz.rain.client.render.main.ChromaRenderer;
import kotakbaz.rain.client.render.main.b_0;
import kotakbaz.rain.client.render.main.builders.b;
import kotakbaz.rain.client.render.main.program.a;
import kotakbaz.rain.client.render.main.program.a_0;
import kotakbaz.rain.client.util.render.engine.A;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b&\u0018\u0000 ,2\u00020\u0001:\u0001,B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&\u00a2\u0006\u0004\b\u0007\u0010\u0006J\u0011\u0010\t\u001a\u0004\u0018\u00010\bH&\u00a2\u0006\u0004\b\t\u0010\nJ\u0011\u0010\f\u001a\u0004\u0018\u00010\u000bH&\u00a2\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH&\u00a2\u0006\u0004\b\u000f\u0010\u0003J#\u0010\u0013\u001a\u00020\u00122\b\u0010\u0010\u001a\u0004\u0018\u00010\u00012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0016\u00a2\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0000H\u0016\u00a2\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u001b\u001a\u00020\u000e2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u0016\u00a2\u0006\u0004\b\u001b\u0010\u001cJ/\u0010 \u001a\u0006\u0012\u0002\b\u00030\u001f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\u000e\u00a2\u0006\u0004\b\"\u0010\u0003J\u0017\u0010%\u001a\u00020\u000e2\b\u0010$\u001a\u0004\u0018\u00010#\u00a2\u0006\u0004\b%\u0010&R$\u0010'\u001a\u0004\u0018\u00010#8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010&\u00a8\u0006-"}, d2={"Lkotakbaz/rain/client/util/render/engine/Renderable;", "", "<init>", "()V", "", "name", "()Ljava/lang/String;", "shader", "Lkotakbaz/rain/client/render/main/vertex/DrawMode;", "drawMode", "()Lkotakbaz/rain/client/render/main/vertex/DrawMode;", "Lkotakbaz/rain/client/render/main/vertex/format/VertexFormat;", "vertexFormat", "()Lkotakbaz/rain/client/render/main/vertex/format/VertexFormat;", "", "load", "oldState", "newState", "", "isBatchCompatible", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "other", "canBatchWith", "(Lkotakbaz/rain/client/util/render/engine/Renderable;)Z", "Lkotakbaz/rain/client/render/main/vertex/mesh/IMesh;", "mesh", "state", "renderBatch", "(Lkotakbaz/rain/client/render/main/vertex/mesh/IMesh;Ljava/lang/Object;)V", "fsh", "vsh", "Lkotakbaz/rain/client/render/main/builders/GlProgramBuilder;", "createShaderBuilder", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lkotakbaz/rain/client/render/main/builders/GlProgramBuilder;", "initMatrix", "Lkotakbaz/rain/client/render/main/program/GlProgram;", "globalProgram", "setGlobalProgram", "(Lkotakbaz/rain/client/render/main/program/GlProgram;)V", "glProgram", "Lkotakbaz/rain/client/render/main/program/GlProgram;", "getGlProgram", "()Lkotakbaz/rain/client/render/main/program/GlProgram;", "setGlProgram", "Companion", "rain-visuals"})
public abstract class Renderable {
    @NotNull
    public static final A h;
    @Nullable
    private a_0 H;
    @NotNull
    private static final String i;
    @NotNull
    private static final String I;
    @NotNull
    private static final String j;
    private static Object[] a;

    @NotNull
    public abstract String name();

    @NotNull
    public abstract String shader();

    @Nullable
    public abstract kotakbaz.rain.client.render.main.vertex.a_0 drawMode();

    @Nullable
    public abstract kotakbaz.rain.client.render.main.vertex.format.a_0 vertexFormat();

    public abstract void load();

    @Nullable
    public final a_0 getGlProgram() {
        return this.H;
    }

    public final void setGlProgram(@Nullable a_0 a_02) {
        this.H = a_02;
    }

    public boolean isBatchCompatible(@Nullable Object oldState, @Nullable Object newState) {
        return Intrinsics.areEqual(oldState, newState);
    }

    public boolean canBatchWith(@NotNull Renderable other) {
        boolean bl;
        int n2 = 22;
        n2 ^= 0xFFFFFF88;
        Intrinsics.checkNotNullParameter(other, (String)a[n2 += 104]);
        if (this == other) {
            boolean bl2;
            int n3 = -1;
            n3 = n3 + -23;
            bl = bl2 = n3 + 25;
        } else {
            boolean bl3;
            int n5 = 122;
            n5 = n5 + 0;
            bl = bl3 = n5 ^ 0x7A;
        }
        return bl;
    }

    public void renderBatch(@Nullable kotakbaz.rain.client.render.main.vertex.mesh.b mesh, @Nullable Object state2) {
        this.setGlobalProgram(this.H);
        this.initMatrix();
        ChromaRenderer.draw(mesh);
    }

    @NotNull
    public final b<?> createShaderBuilder(@Nullable String name, @Nullable String fsh, @Nullable String vsh) {
        int n2 = 120;
        n2 += -82;
        a[] aArray = new a[n2 -= 37];
        int n3 = -7;
        n3 ^= 0xFFFFFFB4;
        aArray[n3 -= 77] = ChromaRenderer.matrixSnippet;
        String string = name;
        int n4 = -76;
        n4 -= -13;
        n4 += 63;
        String string2 = vsh;
        String string3 = I;
        int n5 = 92;
        n5 ^= 0xFFFFFF8B;
        n5 -= -43;
        String string4 = name;
        int n6 = 70;
        n6 ^= 0xFFFFFFB5;
        String string5 = fsh;
        String string6 = I;
        int n7 = 85;
        n7 -= 7;
        b<String> b2 = b_0.a.createProgramBuilder(aArray).name(name).shader(b_0.a.createGlslFileEntry(string + (String)a[n4], string3 + string2 + (String)a[n5]), kotakbaz.rain.client.render.main.program.shader.a_0.a).shader(b_0.a.createGlslFileEntry(string4 + (String)a[n6 -= -14], string6 + string5 + (String)a[n7 ^= 0x49]), kotakbaz.rain.client.render.main.program.shader.a_0.A);
        int n8 = 26;
        n8 += 104;
        Intrinsics.checkNotNullExpressionValue(b2, (String)a[n8 += -125]);
        return b2;
    }

    public final void initMatrix() {
        ChromaRenderer.initMatrix();
    }

    public final void setGlobalProgram(@Nullable a_0 globalProgram) {
        ChromaRenderer.setGlobalProgram(globalProgram);
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
        long l2 = -7573239424398578097L;
        long l3 = 1765619677375697568L;
        long l4 = -1911408422925018517L;
        long l5 = -6256434379376888439L;
        long l6 = 9001648141646946973L;
        long l7 = 2508103093074699332L;
        long l8 = 9183905003865450667L;
        long l9 = 6469725980916682384L;
        long l10 = -7708200314730119693L;
        long l11 = -5156992204226451439L;
        long l12 = -8443094738621152938L;
        long l13 = -322257435448133274L;
        long l14 = -9063478336517445516L;
        long l15 = 160165363467366011L;
        int n2 = -78;
        n2 -= -76;
        a = new Object[n2 ^= 0xFFFFFFF4];
        long l16 = l15;
        int n3 = -243;
        n3 ^= 0xFFFFFF8E;
        l15 = l16 ^ (0L ^ l16) & -1L << (n3 += -99);
        Object object = "\u0000\u0007-vertex\u0000\t-fragment\u0000\u0004.vsh\u0000\t/shaders/\u0000\binclude/\u0000\u000bshader(...)\u0000\u0005other\u0000\u0004.fsh\u0000\u0005core/\u0000\u0007assets/".toCharArray();
        long l17 = l6;
        int n4 = -13;
        n4 += 19;
        l6 = l17 ^ (0x5900000000L ^ l17) & -1L << (n4 ^= 0x26);
        long l18 = l13;
        int n5 = 111;
        n5 += -84;
        l13 = l18 ^ (0L ^ l18) & -1L >>> (n5 ^= 0x3B);
        while (true) {
            int n6 = 52;
            n6 ^= 0xFFFFFF8D;
            if ((int)l13 >= (int)(l6 >>> (n6 += 103))) break;
            int n7 = (int)l13;
            long l19 = l13;
            int n8 = -127;
            n8 ^= 0x33;
            int n9 = 81;
            n9 += 7;
            l13 = l19 ^ (l19 ^ l19 + (long)(n8 -= -79)) & -1L >>> (n9 -= 56);
            long l20 = l9;
            int n10 = -24;
            n10 ^= 0xFFFFFF94;
            l9 = l20 ^ ((long)object[n7] ^ l20) & -1L >>> (n10 ^= 0x5C);
            int n11 = (int)l13;
            long l21 = l13;
            int n12 = 26;
            n12 += 3;
            int n13 = 151;
            n13 -= -6;
            l13 = l21 ^ (l21 ^ l21 + (long)(n12 += -28)) & -1L >>> (n13 -= 125);
            int n14 = 22;
            n14 ^= 0x12;
            long l22 = l10;
            int n15 = -40;
            n15 -= -115;
            l10 = l22 ^ ((long)object[n11] << (n14 -= -28) ^ l22) & -1L << (n15 += -43);
            int n16 = 241;
            n16 += -99;
            n16 += -126;
            int n17 = 9;
            n17 ^= 0x26;
            long l23 = l12;
            int n18 = 55;
            n18 -= 0;
            l12 = l23 ^ ((long)((int)l9 << n16 | (int)(l10 >>> (n17 -= 15))) ^ l23) & -1L >>> (n18 -= 23);
            char[] cArray = new char[(int)l12];
            long l24 = l14;
            int n19 = 253;
            n19 ^= 0x64;
            l14 = l24 ^ (0L ^ l24) & -1L << (n19 -= 121);
            while (true) {
                int n20 = -94;
                n20 ^= 0xFFFFFFDF;
                if ((int)(l14 >>> (n20 += -93)) >= (int)l12) break;
                int n21 = 190;
                n21 += -98;
                int n22 = -9;
                n22 ^= 0x32;
                cArray[(int)(l14 >>> (n21 += -60))] = object[(int)l13 + (int)(l14 >>> (n22 += 91))];
                l14 += 0x100000000L;
            }
            int n23 = 21;
            n23 += -50;
            int n24 = (int)(l15 >>> (n23 -= -61));
            l15 += 0x100000000L;
            Renderable.a[n24] = new String(cArray);
            long l25 = l13;
            int n25 = -51;
            n25 += 3;
            l13 = l25 ^ ((long)((int)l13 + (int)l12) ^ l25) & -1L >>> (n25 ^= 0xFFFFFFF0);
        }
        h = new A(null);
        String string = kotakbaz.rain.client.extensions.A.getCLIENT_ID();
        int n26 = 47;
        n26 += -69;
        int n27 = 24;
        n27 ^= 0xFFFFFFA8;
        i = (String)a[n26 ^= 0xFFFFFFE3] + string + (String)a[n27 ^= 0xFFFFFFB3];
        object = i;
        int n28 = 64;
        n28 ^= 0x60;
        I = object + (String)a[n28 -= 24];
        String string2 = i;
        int n29 = -63;
        n29 -= -98;
        j = string2 + (String)a[n29 += -31];
    }
}

