/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client.util.render.display;

import java.awt.Color;
import java.util.Arrays;
import kotakbaz.rain.client.render.main.vertex.mesh.a_0;
import kotakbaz.rain.client.util.color.QuadColor;
import kotakbaz.rain.client.util.render.engine.Renderable;
import kotakbaz.rain.client.util.render.engine.controls.ClientRenderPipeline;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joml.Vector4f;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003JS\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\n\u0010\u000f\u001a\u00020\u000e\"\u00020\u0006H$\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0013\u00a2\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0004\u00a2\u0006\u0004\b\u0018\u0010\u0019JK\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00172\n\u0010\u000f\u001a\u00020\u000e\"\u00020\u0006H\u0004\u00a2\u0006\u0004\b\u001a\u0010\u001bR\"\u0010\u001c\u001a\u00020\u00138\u0004@\u0004X\u0084\u000e\u00a2\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020\u00178\u0004X\u0084\u0004\u00a2\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010'\u001a\u00020&8\u0004X\u0084\u0004\u00a2\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010+\u001a\u00020\u00178\u0004X\u0084\u0004\u00a2\u0006\f\n\u0004\b+\u0010#\u001a\u0004\b,\u0010%\u00a8\u0006-"}, d2={"Lkotakbaz/rain/client/util/render/display/RectRenderer;", "Lkotakbaz/rain/client/util/render/engine/Renderable;", "<init>", "()V", "Lkotakbaz/rain/client/render/main/vertex/mesh/MeshBuilder;", "builder", "", "x", "y", "width", "height", "radius", "", "index", "", "extra", "", "uploadVertex", "(Lkotakbaz/rain/client/render/main/vertex/mesh/MeshBuilder;FFFFFI[F)V", "Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;", "pipeline", "priority", "(Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;)Lkotakbaz/rain/client/util/render/display/RectRenderer;", "Lorg/joml/Vector4f;", "calcSmoothness", "(FFFF)Lorg/joml/Vector4f;", "buildQuad", "(Lkotakbaz/rain/client/render/main/vertex/mesh/MeshBuilder;FFFFLorg/joml/Vector4f;[F)V", "currentPipeline", "Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;", "getCurrentPipeline", "()Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;", "setCurrentPipeline", "(Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;)V", "cachedRadius", "Lorg/joml/Vector4f;", "getCachedRadius", "()Lorg/joml/Vector4f;", "Lkotakbaz/rain/client/util/color/QuadColor;", "cachedColor", "Lkotakbaz/rain/client/util/color/QuadColor;", "getCachedColor", "()Lkotakbaz/rain/client/util/color/QuadColor;", "cachedCoords", "getCachedCoords", "rain-visuals"})
public abstract class RectRenderer
extends Renderable {
    @NotNull
    private ClientRenderPipeline C = ClientRenderPipeline.LOW;
    @NotNull
    private final Vector4f d = new Vector4f();
    @NotNull
    private final QuadColor D;
    @NotNull
    private final Vector4f e;
    private static Object[] a;

    public RectRenderer() {
        Color color = Color.WHITE;
        int n2 = -47;
        n2 += 4;
        Intrinsics.checkNotNullExpressionValue(color, (String)a[n2 -= -46]);
        this.D = new QuadColor(color);
        this.e = new Vector4f();
    }

    @NotNull
    protected final ClientRenderPipeline getCurrentPipeline() {
        return this.C;
    }

    protected final void setCurrentPipeline(@NotNull ClientRenderPipeline clientRenderPipeline) {
        int n2 = -149;
        n2 += 119;
        Intrinsics.checkNotNullParameter((Object)clientRenderPipeline, (String)a[n2 ^= 0xFFFFFFE6]);
        this.C = clientRenderPipeline;
    }

    @NotNull
    protected final Vector4f getCachedRadius() {
        return this.d;
    }

    @NotNull
    protected final QuadColor getCachedColor() {
        return this.D;
    }

    @NotNull
    protected final Vector4f getCachedCoords() {
        return this.e;
    }

    protected abstract void uploadVertex(@NotNull a_0 var1, float var2, float var3, float var4, float var5, float var6, int var7, float ... var8);

    @NotNull
    public final RectRenderer priority(@NotNull ClientRenderPipeline pipeline) {
        int n2 = 91;
        n2 ^= 0xFFFFFF8D;
        Intrinsics.checkNotNullParameter((Object)pipeline, (String)a[n2 -= -42]);
        this.C = pipeline;
        return this;
    }

    @NotNull
    protected final Vector4f calcSmoothness(float x2, float y, float width2, float height) {
        Vector4f vector4f = this.e.set(x2, y, width2, height);
        int n2 = 36;
        n2 += -33;
        Intrinsics.checkNotNullExpressionValue(vector4f, (String)a[n2 -= -3]);
        return vector4f;
    }

    protected final void buildQuad(@NotNull a_0 builder, float x2, float y, float width2, float height, @NotNull Vector4f radius, float ... extra) {
        int n2 = -31;
        n2 += -10;
        Intrinsics.checkNotNullParameter(builder, (String)a[n2 += 43]);
        int n3 = -169;
        n3 -= -111;
        Intrinsics.checkNotNullParameter(radius, (String)a[n3 += 63]);
        int n4 = -132;
        n4 -= -23;
        Intrinsics.checkNotNullParameter(extra, (String)a[n4 += 110]);
        int n5 = -18;
        n5 += -100;
        this.uploadVertex(builder, x2, y, width2, height, radius.x, n5 ^= 0xFFFFFF8A, Arrays.copyOf(extra, extra.length));
        int n6 = -203;
        n6 -= -86;
        this.uploadVertex(builder, x2, y + height, width2, height, radius.z, n6 += 118, Arrays.copyOf(extra, extra.length));
        int n7 = 76;
        n7 ^= 0x7C;
        this.uploadVertex(builder, x2 + width2, y + height, width2, height, radius.w, n7 += -46, Arrays.copyOf(extra, extra.length));
        int n8 = 202;
        n8 += -91;
        this.uploadVertex(builder, x2 + width2, y, width2, height, radius.y, n8 += -108, Arrays.copyOf(extra, extra.length));
    }

    static {
        long l2 = -8815464803747328146L;
        long l3 = -8475561390327818013L;
        long l4 = -4027484109693656644L;
        long l5 = 2604529140419341180L;
        long l6 = -1069901097411596812L;
        long l7 = -6560060152632108280L;
        long l8 = 7152128602892568431L;
        long l9 = -3772006488631063057L;
        long l10 = 4327868448195088860L;
        long l11 = -7096876197343869211L;
        long l12 = 4796069590222399351L;
        long l13 = -222970155771455429L;
        long l14 = -5055846788893069701L;
        long l15 = 8380335310739814514L;
        int n2 = -4;
        n2 ^= 0x53;
        a = new Object[n2 += 88];
        long l16 = l15;
        int n3 = -29;
        n3 ^= 0xFFFFFFBB;
        l15 = l16 ^ (0L ^ l16) & -1L << (n3 -= 56);
        char[] cArray = "\u0000\bpipeline\u0000\u0005extra\u0000\u0007builder\u0000\u0005WHITE\u0000\u0007<set-?>\u0000\u0006radius\u0000\bset(...)".toCharArray();
        long l17 = l6;
        int n4 = 37;
        n4 += 24;
        l6 = l17 ^ (0x3C00000000L ^ l17) & -1L << (n4 += -29);
        long l18 = l13;
        int n5 = -2;
        n5 ^= 0xFFFFFFB5;
        l13 = l18 ^ (0L ^ l18) & -1L >>> (n5 += -43);
        while (true) {
            int n6 = 176;
            n6 -= 49;
            if ((int)l13 >= (int)(l6 >>> (n6 += -95))) break;
            int n7 = (int)l13;
            long l19 = l13;
            int n8 = 107;
            n8 -= 100;
            int n9 = 66;
            n9 -= -68;
            l13 = l19 ^ (l19 ^ l19 + (long)(n8 -= 6)) & -1L >>> (n9 += -102);
            long l20 = l9;
            int n10 = 193;
            n10 -= 66;
            l9 = l20 ^ ((long)cArray[n7] ^ l20) & -1L >>> (n10 -= 95);
            int n11 = (int)l13;
            long l21 = l13;
            int n12 = 126;
            n12 += -95;
            int n13 = 167;
            n13 -= 113;
            l13 = l21 ^ (l21 ^ l21 + (long)(n12 ^= 0x1E)) & -1L >>> (n13 += -22);
            int n14 = 190;
            n14 += -95;
            long l22 = l10;
            int n15 = 45;
            n15 ^= 0xFFFFFFEE;
            l10 = l22 ^ ((long)cArray[n11] << (n14 -= 63) ^ l22) & -1L << (n15 ^= 0xFFFFFFE3);
            int n16 = 127;
            n16 += -20;
            n16 ^= 0x7B;
            int n17 = -24;
            n17 += -54;
            long l23 = l12;
            int n18 = -142;
            n18 -= -119;
            l12 = l23 ^ ((long)((int)l9 << n16 | (int)(l10 >>> (n17 ^= 0xFFFFFF92))) ^ l23) & -1L >>> (n18 -= -55);
            char[] cArray2 = new char[(int)l12];
            long l24 = l14;
            int n19 = -153;
            n19 -= -51;
            l14 = l24 ^ (0L ^ l24) & -1L << (n19 ^= 0xFFFFFFBA);
            while (true) {
                int n20 = 96;
                n20 -= -40;
                if ((int)(l14 >>> (n20 -= 104)) >= (int)l12) break;
                int n21 = -176;
                n21 ^= 0xFFFFFFDB;
                int n22 = -102;
                n22 ^= 0xFFFFFFE5;
                cArray2[(int)(l14 >>> (n21 -= 107))] = cArray[(int)l13 + (int)(l14 >>> (n22 -= 95))];
                l14 += 0x100000000L;
            }
            int n23 = -72;
            n23 ^= 0x70;
            int n24 = (int)(l15 >>> (n23 -= -88));
            l15 += 0x100000000L;
            RectRenderer.a[n24] = new String(cArray2);
            long l25 = l13;
            int n25 = -180;
            n25 ^= 0xFFFFFFCB;
            l13 = l25 ^ ((long)((int)l13 + (int)l12) ^ l25) & -1L >>> (n25 += -103);
        }
    }
}

