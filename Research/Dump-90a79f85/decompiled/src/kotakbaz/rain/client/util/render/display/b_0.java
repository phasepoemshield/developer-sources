/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Vector4f
 */
package kotakbaz.rain.client.util.render.display;

import java.awt.Color;
import java.util.Arrays;
import kotakbaz.rain.client.util.color.A;
import kotakbaz.rain.client.util.render.engine.a_0;
import kotakbaz.rain.client.util.render.engine.controls.ClientRenderPipeline;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joml.Vector4f;

/*
 * Renamed from kotakbaz.rain.client.util.render.display.b
 */
@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003JS\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\n\u0010\u000f\u001a\u00020\u000e\"\u00020\u0006H$\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0013\u00a2\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0004\u00a2\u0006\u0004\b\u0018\u0010\u0019JK\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00172\n\u0010\u000f\u001a\u00020\u000e\"\u00020\u0006H\u0004\u00a2\u0006\u0004\b\u001a\u0010\u001bR\"\u0010\u001c\u001a\u00020\u00138\u0004@\u0004X\u0084\u000e\u00a2\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020\u00178\u0004X\u0084\u0004\u00a2\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010'\u001a\u00020&8\u0004X\u0084\u0004\u00a2\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010+\u001a\u00020\u00178\u0004X\u0084\u0004\u00a2\u0006\f\n\u0004\b+\u0010#\u001a\u0004\b,\u0010%\u00a8\u0006-"}, d2={"Lkotakbaz/rain/client/util/render/display/RectRenderer;", "Lkotakbaz/rain/client/util/render/engine/Renderable;", "<init>", "()V", "Lkotakbaz/rain/client/render/main/vertex/mesh/MeshBuilder;", "builder", "", "x", "y", "width", "height", "radius", "", "index", "", "extra", "", "uploadVertex", "(Lkotakbaz/rain/client/render/main/vertex/mesh/MeshBuilder;FFFFFI[F)V", "Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;", "pipeline", "priority", "(Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;)Lkotakbaz/rain/client/util/render/display/RectRenderer;", "Lorg/joml/Vector4f;", "calcSmoothness", "(FFFF)Lorg/joml/Vector4f;", "buildQuad", "(Lkotakbaz/rain/client/render/main/vertex/mesh/MeshBuilder;FFFFLorg/joml/Vector4f;[F)V", "currentPipeline", "Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;", "getCurrentPipeline", "()Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;", "setCurrentPipeline", "(Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;)V", "cachedRadius", "Lorg/joml/Vector4f;", "getCachedRadius", "()Lorg/joml/Vector4f;", "Lkotakbaz/rain/client/util/color/QuadColor;", "cachedColor", "Lkotakbaz/rain/client/util/color/QuadColor;", "getCachedColor", "()Lkotakbaz/rain/client/util/color/QuadColor;", "cachedCoords", "getCachedCoords", "rain-visuals"})
public abstract class b_0
extends a_0 {
    @NotNull
    private ClientRenderPipeline C = ClientRenderPipeline.LOW;
    @NotNull
    private final Vector4f d = new Vector4f();
    @NotNull
    private final A D;
    @NotNull
    private final Vector4f e;
    private static Object[] a;

    public b_0() {
        super();
        Color color = Color.WHITE;
        int n = -47;
        n += 4;
        Intrinsics.checkNotNullExpressionValue(color, (String)a[n -= -46]);
        this.D = new A(color);
        this.e = new Vector4f();
    }

    @NotNull
    protected final ClientRenderPipeline getCurrentPipeline() {
        return this.C;
    }

    protected final void setCurrentPipeline(@NotNull ClientRenderPipeline clientRenderPipeline) {
        int n = -149;
        n += 119;
        Intrinsics.checkNotNullParameter((Object)clientRenderPipeline, (String)a[n ^= 0xFFFFFFE6]);
        this.C = clientRenderPipeline;
    }

    @NotNull
    protected final Vector4f getCachedRadius() {
        return this.d;
    }

    @NotNull
    protected final A getCachedColor() {
        return this.D;
    }

    @NotNull
    protected final Vector4f getCachedCoords() {
        return this.e;
    }

    protected abstract void uploadVertex(@NotNull kotakbaz.rain.client.render.main.vertex.mesh.A var1, float var2, float var3, float var4, float var5, float var6, int var7, float ... var8);

    @NotNull
    public final b_0 priority(@NotNull ClientRenderPipeline clientRenderPipeline) {
        int n = 91;
        n ^= 0xFFFFFF8D;
        Intrinsics.checkNotNullParameter((Object)clientRenderPipeline, (String)a[n -= -42]);
        this.C = clientRenderPipeline;
        return this;
    }

    @NotNull
    protected final Vector4f calcSmoothness(float f2, float f3, float f4, float f5) {
        Vector4f vector4f = this.e.set(f2, f3, f4, f5);
        int n = 36;
        n += -33;
        Intrinsics.checkNotNullExpressionValue(vector4f, (String)a[n -= -3]);
        return vector4f;
    }

    protected final void buildQuad(@NotNull kotakbaz.rain.client.render.main.vertex.mesh.A a2, float f2, float f3, float f4, float f5, @NotNull Vector4f vector4f, float ... fArray) {
        int n = -31;
        n += -10;
        Intrinsics.checkNotNullParameter(a2, (String)a[n += 43]);
        int n2 = -169;
        n2 -= -111;
        Intrinsics.checkNotNullParameter(vector4f, (String)a[n2 += 63]);
        int n3 = -132;
        n3 -= -23;
        Intrinsics.checkNotNullParameter(fArray, (String)a[n3 += 110]);
        int n4 = -18;
        n4 += -100;
        this.uploadVertex(a2, f2, f3, f4, f5, vector4f.x, n4 ^= 0xFFFFFF8A, Arrays.copyOf(fArray, fArray.length));
        int n5 = -203;
        n5 -= -86;
        this.uploadVertex(a2, f2, f3 + f5, f4, f5, vector4f.z, n5 += 118, Arrays.copyOf(fArray, fArray.length));
        int n6 = 76;
        n6 ^= 0x7C;
        this.uploadVertex(a2, f2 + f4, f3 + f5, f4, f5, vector4f.w, n6 += -46, Arrays.copyOf(fArray, fArray.length));
        int n7 = 202;
        n7 += -91;
        this.uploadVertex(a2, f2 + f4, f3, f4, f5, vector4f.y, n7 += -108, Arrays.copyOf(fArray, fArray.length));
    }

    static {
        long l = -8815464803747328146L;
        long l2 = -8475561390327818013L;
        long l3 = -4027484109693656644L;
        long l4 = 2604529140419341180L;
        long l5 = -1069901097411596812L;
        long l6 = -6560060152632108280L;
        long l7 = 7152128602892568431L;
        long l8 = -3772006488631063057L;
        long l9 = 4327868448195088860L;
        long l10 = -7096876197343869211L;
        long l11 = 4796069590222399351L;
        long l12 = -222970155771455429L;
        long l13 = -5055846788893069701L;
        long l14 = 8380335310739814514L;
        int n = -4;
        n ^= 0x53;
        a = new Object[n += 88];
        long l15 = l14;
        int n2 = -29;
        n2 ^= 0xFFFFFFBB;
        l14 = l15 ^ (0L ^ l15) & -1L << (n2 -= 56);
        char[] cArray = "\u0000\bpipeline\u0000\u0005extra\u0000\u0007builder\u0000\u0005WHITE\u0000\u0007<set-?>\u0000\u0006radius\u0000\bset(...)".toCharArray();
        long l16 = l5;
        int n3 = 37;
        n3 += 24;
        l5 = l16 ^ (0x3C00000000L ^ l16) & -1L << (n3 += -29);
        long l17 = l12;
        int n4 = -2;
        n4 ^= 0xFFFFFFB5;
        l12 = l17 ^ (0L ^ l17) & -1L >>> (n4 += -43);
        while (true) {
            int n5 = 176;
            n5 -= 49;
            if ((int)l12 >= (int)(l5 >>> (n5 += -95))) break;
            int n6 = (int)l12;
            long l18 = l12;
            int n7 = 107;
            n7 -= 100;
            int n8 = 66;
            n8 -= -68;
            l12 = l18 ^ (l18 ^ l18 + (long)(n7 -= 6)) & -1L >>> (n8 += -102);
            long l19 = l8;
            int n9 = 193;
            n9 -= 66;
            l8 = l19 ^ ((long)cArray[n6] ^ l19) & -1L >>> (n9 -= 95);
            int n10 = (int)l12;
            long l20 = l12;
            int n11 = 126;
            n11 += -95;
            int n12 = 167;
            n12 -= 113;
            l12 = l20 ^ (l20 ^ l20 + (long)(n11 ^= 0x1E)) & -1L >>> (n12 += -22);
            int n13 = 190;
            n13 += -95;
            long l21 = l9;
            int n14 = 45;
            n14 ^= 0xFFFFFFEE;
            l9 = l21 ^ ((long)cArray[n10] << (n13 -= 63) ^ l21) & -1L << (n14 ^= 0xFFFFFFE3);
            int n15 = 127;
            n15 += -20;
            n15 ^= 0x7B;
            int n16 = -24;
            n16 += -54;
            long l22 = l11;
            int n17 = -142;
            n17 -= -119;
            l11 = l22 ^ ((long)((int)l8 << n15 | (int)(l9 >>> (n16 ^= 0xFFFFFF92))) ^ l22) & -1L >>> (n17 -= -55);
            char[] cArray2 = new char[(int)l11];
            long l23 = l13;
            int n18 = -153;
            n18 -= -51;
            l13 = l23 ^ (0L ^ l23) & -1L << (n18 ^= 0xFFFFFFBA);
            while (true) {
                int n19 = 96;
                n19 -= -40;
                if ((int)(l13 >>> (n19 -= 104)) >= (int)l11) break;
                int n20 = -176;
                n20 ^= 0xFFFFFFDB;
                int n21 = -102;
                n21 ^= 0xFFFFFFE5;
                cArray2[(int)(l13 >>> (n20 -= 107))] = cArray[(int)l12 + (int)(l13 >>> (n21 -= 95))];
                l13 += 0x100000000L;
            }
            int n22 = -72;
            n22 ^= 0x70;
            int n23 = (int)(l14 >>> (n22 -= -88));
            l14 += 0x100000000L;
            b_0.a[n23] = new String(cArray2);
            long l24 = l12;
            int n24 = -180;
            n24 ^= 0xFFFFFFCB;
            l12 = l24 ^ ((long)((int)l12 + (int)l11) ^ l24) & -1L >>> (n24 += -103);
        }
    }
}

