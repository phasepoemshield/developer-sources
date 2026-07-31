/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client.util.render.display;

import java.awt.Color;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import kotakbaz.rain.client.render.main.program.uniform.uniforms.sampler.A;
import kotakbaz.rain.client.render.main.vertex.element.a;
import kotakbaz.rain.client.render.main.vertex.format.a_0;
import kotakbaz.rain.client.render.main.vertex.mesh.b;
import kotakbaz.rain.client.util.color.ColorUtil;
import kotakbaz.rain.client.util.color.QuadColor;
import kotakbaz.rain.client.util.render.RenderUtils;
import kotakbaz.rain.client.util.render.ScissorUtil;
import kotakbaz.rain.client.util.render.display.RectRenderer;
import kotakbaz.rain.client.util.render.display.d;
import kotakbaz.rain.client.util.render.display.d_0;
import kotakbaz.rain.client.util.render.engine.controls.MatrixControl;
import kotakbaz.rain.client.util.render.engine.controls.RectType;
import kotakbaz.rain.client.util.render.engine.controls.TextureSampler;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joml.Vector3f;
import org.joml.Vector4f;
import org.joml.Vector4fc;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 s2\u00020\u0001:\u0001sB\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\n\u001a\n \t*\u0004\u0018\u00010\b0\bH\u0016\u00a2\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016\u00a2\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\b\u0010\u0010\u0003J#\u0010\u0015\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0017\u00a2\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00002\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u00a2\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001e\u00a2\u0006\u0004\b\u001c\u0010 J\u0015\u0010\u001c\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020!\u00a2\u0006\u0004\b\u001c\u0010#J\u0015\u0010%\u001a\u00020\u00002\u0006\u0010%\u001a\u00020$\u00a2\u0006\u0004\b%\u0010&J-\u0010%\u001a\u00020\u00002\u0006\u0010'\u001a\u00020$2\u0006\u0010(\u001a\u00020$2\u0006\u0010)\u001a\u00020$2\u0006\u0010*\u001a\u00020$\u00a2\u0006\u0004\b%\u0010+J\u0015\u0010.\u001a\u00020\u00002\u0006\u0010-\u001a\u00020,\u00a2\u0006\u0004\b.\u0010/J\u0015\u0010.\u001a\u00020\u00002\u0006\u0010-\u001a\u000200\u00a2\u0006\u0004\b.\u00101J\u0015\u00103\u001a\u00020\u00002\u0006\u00102\u001a\u00020,\u00a2\u0006\u0004\b3\u0010/J\u001d\u00105\u001a\u00020\u00002\u0006\u00104\u001a\u00020,2\u0006\u0010%\u001a\u00020$\u00a2\u0006\u0004\b5\u00106J\u0015\u00107\u001a\u00020\u00002\u0006\u00104\u001a\u00020,\u00a2\u0006\u0004\b7\u0010/J\u0015\u00108\u001a\u00020\u00002\u0006\u0010%\u001a\u00020$\u00a2\u0006\u0004\b8\u0010&J-\u0010<\u001a\u00020\u000f2\u0006\u00109\u001a\u00020,2\u0006\u0010:\u001a\u00020,2\u0006\u00104\u001a\u00020,2\u0006\u0010;\u001a\u00020,\u00a2\u0006\u0004\b<\u0010=J\u007f\u0010E\u001a\u00020\u000f2\u0006\u00109\u001a\u00020,2\u0006\u0010:\u001a\u00020,2\u0006\u00104\u001a\u00020,2\u0006\u0010;\u001a\u00020,2\u0006\u0010%\u001a\u00020>2\u0006\u0010?\u001a\u0002002\u0006\u0010@\u001a\u00020,2\u0006\u0010A\u001a\u00020,2\u0006\u0010B\u001a\u00020,2\u0006\u0010C\u001a\u00020,2\u0006\u0010D\u001a\u00020,2\u0006\u00103\u001a\u00020,2\u0006\u00107\u001a\u00020,2\u0006\u00108\u001a\u00020$H\u0002\u00a2\u0006\u0004\bE\u0010FJM\u0010G\u001a\u00020\u000f2\u0006\u00109\u001a\u00020,2\u0006\u0010:\u001a\u00020,2\u0006\u00104\u001a\u00020,2\u0006\u0010;\u001a\u00020,2\u0006\u0010%\u001a\u00020>2\u0006\u0010?\u001a\u0002002\u0006\u00107\u001a\u00020,2\u0006\u00108\u001a\u00020$\u00a2\u0006\u0004\bG\u0010HJ=\u0010G\u001a\u00020\u000f2\u0006\u00109\u001a\u00020,2\u0006\u0010:\u001a\u00020,2\u0006\u00104\u001a\u00020,2\u0006\u0010;\u001a\u00020,2\u0006\u0010%\u001a\u00020$2\u0006\u0010?\u001a\u000200\u00a2\u0006\u0004\bG\u0010IJ=\u0010G\u001a\u00020\u000f2\u0006\u00109\u001a\u00020,2\u0006\u0010:\u001a\u00020,2\u0006\u00104\u001a\u00020,2\u0006\u0010;\u001a\u00020,2\u0006\u0010%\u001a\u00020$2\u0006\u0010?\u001a\u00020,\u00a2\u0006\u0004\bG\u0010JJ=\u0010G\u001a\u00020\u000f2\u0006\u00109\u001a\u00020,2\u0006\u0010:\u001a\u00020,2\u0006\u00104\u001a\u00020,2\u0006\u0010;\u001a\u00020,2\u0006\u0010%\u001a\u00020>2\u0006\u0010?\u001a\u000200\u00a2\u0006\u0004\bG\u0010KJm\u0010L\u001a\u00020\u000f2\u0006\u00109\u001a\u00020,2\u0006\u0010:\u001a\u00020,2\u0006\u00104\u001a\u00020,2\u0006\u0010;\u001a\u00020,2\u0006\u0010%\u001a\u00020>2\u0006\u0010@\u001a\u00020,2\u0006\u00103\u001a\u00020,2\u0006\u0010A\u001a\u00020,2\u0006\u0010B\u001a\u00020,2\u0006\u0010C\u001a\u00020,2\u0006\u0010D\u001a\u00020,2\u0006\u0010?\u001a\u000200\u00a2\u0006\u0004\bL\u0010MJm\u0010L\u001a\u00020\u000f2\u0006\u00109\u001a\u00020,2\u0006\u0010:\u001a\u00020,2\u0006\u00104\u001a\u00020,2\u0006\u0010;\u001a\u00020,2\u0006\u0010%\u001a\u00020$2\u0006\u0010@\u001a\u00020,2\u0006\u00103\u001a\u00020,2\u0006\u0010A\u001a\u00020,2\u0006\u0010B\u001a\u00020,2\u0006\u0010C\u001a\u00020,2\u0006\u0010D\u001a\u00020,2\u0006\u0010?\u001a\u000200\u00a2\u0006\u0004\bL\u0010NJm\u0010L\u001a\u00020\u000f2\u0006\u00109\u001a\u00020,2\u0006\u0010:\u001a\u00020,2\u0006\u00104\u001a\u00020,2\u0006\u0010;\u001a\u00020,2\u0006\u0010%\u001a\u00020$2\u0006\u0010@\u001a\u00020,2\u0006\u00103\u001a\u00020,2\u0006\u0010A\u001a\u00020,2\u0006\u0010B\u001a\u00020,2\u0006\u0010C\u001a\u00020,2\u0006\u0010D\u001a\u00020,2\u0006\u0010?\u001a\u00020,\u00a2\u0006\u0004\bL\u0010OJS\u0010U\u001a\u00020\u000f2\u0006\u0010Q\u001a\u00020P2\u0006\u00109\u001a\u00020,2\u0006\u0010:\u001a\u00020,2\u0006\u00104\u001a\u00020,2\u0006\u0010;\u001a\u00020,2\u0006\u0010?\u001a\u00020,2\u0006\u0010R\u001a\u00020\u001e2\n\u0010T\u001a\u00020S\"\u00020,H\u0014\u00a2\u0006\u0004\bU\u0010VR\u0016\u0010W\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bW\u0010XR\u0016\u0010Y\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bY\u0010ZR\u0016\u0010@\u001a\u00020,8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b@\u0010[R\u0016\u00103\u001a\u00020,8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b3\u0010[R\u0016\u00107\u001a\u00020,8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b7\u0010[R\u0016\u00108\u001a\u00020$8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b8\u0010\\R\u0016\u0010^\u001a\u00020]8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\b^\u0010_R\u0016\u0010`\u001a\u00020]8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\b`\u0010_R\u0016\u0010a\u001a\u00020]8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\ba\u0010_R\u0016\u0010b\u001a\u00020]8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\bb\u0010_R\u0016\u0010c\u001a\u00020]8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\bc\u0010_R\u0016\u0010d\u001a\u00020]8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\bd\u0010_R\u0016\u0010e\u001a\u00020]8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\be\u0010_R\u0016\u0010f\u001a\u00020]8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\bf\u0010_R\u0016\u0010g\u001a\u00020]8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\bg\u0010_R\u0016\u0010h\u001a\u00020]8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\bh\u0010_R\u0016\u0010i\u001a\u00020]8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\bi\u0010_R\u0016\u0010j\u001a\u00020]8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\bj\u0010_R\u0016\u0010k\u001a\u00020]8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\bk\u0010_R\u0016\u0010l\u001a\u00020]8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\bl\u0010_R\u0014\u0010n\u001a\u00020m8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bn\u0010oR\u0014\u0010p\u001a\u00020S8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bp\u0010qR\u0014\u0010r\u001a\u00020S8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\br\u0010q\u00a8\u0006t"}, d2={"Lkotakbaz/rain/client/util/render/display/AdvancedRectRenderer;", "Lkotakbaz/rain/client/util/render/display/RectRenderer;", "<init>", "()V", "", "name", "()Ljava/lang/String;", "shader", "Lkotakbaz/rain/client/render/main/vertex/DrawMode;", "kotlin.jvm.PlatformType", "drawMode", "()Lkotakbaz/rain/client/render/main/vertex/DrawMode;", "Lkotakbaz/rain/client/render/main/vertex/format/VertexFormat;", "vertexFormat", "()Lkotakbaz/rain/client/render/main/vertex/format/VertexFormat;", "", "load", "Lkotakbaz/rain/client/render/main/vertex/mesh/IMesh;", "mesh", "", "state", "renderBatch", "(Lkotakbaz/rain/client/render/main/vertex/mesh/IMesh;Ljava/lang/Object;)V", "Lkotakbaz/rain/client/util/render/engine/controls/RectType;", "type", "(Lkotakbaz/rain/client/util/render/engine/controls/RectType;)Lkotakbaz/rain/client/util/render/display/AdvancedRectRenderer;", "Lkotakbaz/rain/client/util/render/engine/controls/TextureSampler;", "sampler", "texture", "(Lkotakbaz/rain/client/util/render/engine/controls/TextureSampler;)Lkotakbaz/rain/client/util/render/display/AdvancedRectRenderer;", "", "id", "(I)Lkotakbaz/rain/client/util/render/display/AdvancedRectRenderer;", "Lkotakbaz/rain/client/render/texture/GlTex;", "tex", "(Lkotakbaz/rain/client/render/texture/GlTex;)Lkotakbaz/rain/client/util/render/display/AdvancedRectRenderer;", "Ljava/awt/Color;", "color", "(Ljava/awt/Color;)Lkotakbaz/rain/client/util/render/display/AdvancedRectRenderer;", "c1", "c2", "c3", "c4", "(Ljava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;)Lkotakbaz/rain/client/util/render/display/AdvancedRectRenderer;", "", "r", "round", "(F)Lkotakbaz/rain/client/util/render/display/AdvancedRectRenderer;", "Lorg/joml/Vector4f;", "(Lorg/joml/Vector4f;)Lkotakbaz/rain/client/util/render/display/AdvancedRectRenderer;", "a", "alpha", "width", "border", "(FLjava/awt/Color;)Lkotakbaz/rain/client/util/render/display/AdvancedRectRenderer;", "borderWidth", "borderColor", "x", "y", "height", "draw", "(FFFF)V", "Lkotakbaz/rain/client/util/color/QuadColor;", "radius", "mix", "u", "v", "texW", "texH", "drawConst", "(FFFFLkotakbaz/rain/client/util/color/QuadColor;Lorg/joml/Vector4f;FFFFFFFLjava/awt/Color;)V", "drawRect", "(FFFFLkotakbaz/rain/client/util/color/QuadColor;Lorg/joml/Vector4f;FLjava/awt/Color;)V", "(FFFFLjava/awt/Color;Lorg/joml/Vector4f;)V", "(FFFFLjava/awt/Color;F)V", "(FFFFLkotakbaz/rain/client/util/color/QuadColor;Lorg/joml/Vector4f;)V", "drawTexture", "(FFFFLkotakbaz/rain/client/util/color/QuadColor;FFFFFFLorg/joml/Vector4f;)V", "(FFFFLjava/awt/Color;FFFFFFLorg/joml/Vector4f;)V", "(FFFFLjava/awt/Color;FFFFFFF)V", "Lkotakbaz/rain/client/render/main/vertex/mesh/MeshBuilder;", "builder", "index", "", "extra", "uploadVertex", "(Lkotakbaz/rain/client/render/main/vertex/mesh/MeshBuilder;FFFFFI[F)V", "rectType", "Lkotakbaz/rain/client/util/render/engine/controls/RectType;", "currentSampler", "Lkotakbaz/rain/client/util/render/engine/controls/TextureSampler;", "F", "Ljava/awt/Color;", "Lkotakbaz/rain/client/render/main/vertex/element/VertexElement;", "eTopRight", "Lkotakbaz/rain/client/render/main/vertex/element/VertexElement;", "eTopLeft", "eBotRight", "eBotLeft", "eTexture", "eSize", "eRadius", "eMix", "eAlpha", "eMode", "eBorderW", "eBorderC", "eType", "eScissor", "Lorg/joml/Vector3f;", "currentPos", "Lorg/joml/Vector3f;", "dataBuffer", "[F", "colorBuffer", "Companion", "rain-visuals"})
@SourceDebugExtension(value={"SMAP\nAdvancedRectRenderer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdvancedRectRenderer.kt\nkotakbaz/rain/client/util/render/display/AdvancedRectRenderer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,363:1\n1#2:364\n*E\n"})
public final class AdvancedRectRenderer
extends RectRenderer {
    @NotNull
    public static final d_0 h;
    @NotNull
    private RectType A = RectType.BASIC;
    @NotNull
    private TextureSampler b;
    private float B;
    private float c;
    private float C;
    @NotNull
    private Color d;
    private a D;
    private a e;
    private a E;
    private a f;
    private a F;
    private a g;
    private a G;
    private a h;
    private a H;
    private a i;
    private a I;
    private a j;
    private a J;
    private a k;
    @NotNull
    private final Vector3f K;
    @NotNull
    private final float[] l;
    @NotNull
    private final float[] L;
    @NotNull
    private static final Color m;
    private static final a_0 M;
    private static Object[] a;
    private static Object N;
    private static Object[] o;
    private static Object[] n;
    private static Object[] O;
    public static int[] p;

    public AdvancedRectRenderer() {
        int n2 = p[0];
        n2 -= p[1];
        this.b = new TextureSampler(n2 += p[2]);
        this.c = 1.0f;
        int n3 = p[3];
        n3 ^= p[4];
        n3 += p[5];
        int n4 = p[6];
        n4 -= p[7];
        int n5 = p[9];
        n5 += p[10];
        int n6 = p[12];
        n6 -= p[13];
        this.d = new Color(n3, n4 -= p[8], n5 ^= p[11], n6 ^= p[14]);
        this.K = new Vector3f();
        int n7 = p[15];
        n7 += p[16];
        this.l = new float[n7 -= p[17]];
        int n8 = p[18];
        n8 += p[19];
        this.L = new float[n8 += p[20]];
    }

    @Override
    @NotNull
    public String name() {
        int n2 = p[21];
        n2 -= p[22];
        return (String)a[n2 += p[23]];
    }

    @Override
    @NotNull
    public String shader() {
        int n2 = p[24];
        n2 += p[25];
        return (String)a[n2 += p[26]];
    }

    @Override
    public kotakbaz.rain.client.render.main.vertex.a_0 drawMode() {
        return kotakbaz.rain.client.render.main.vertex.a_0.E;
    }

    @Override
    @NotNull
    public a_0 vertexFormat() {
        a_0 a_02 = M;
        int n2 = p[27];
        n2 += p[28];
        Intrinsics.checkNotNullExpressionValue(a_02, (String)a[n2 -= p[29]]);
        return a_02;
    }

    @Override
    public void load() {
        if (this.getGlProgram() == null) {
            int n2 = p[30];
            n2 -= p[31];
            this.setGlProgram(this.createShaderBuilder(this.name(), this.shader(), this.shader()).sampler((String)a[n2 ^= p[32]]).build());
        }
        a_0 a_02 = M;
        int n3 = p[33];
        n3 += p[34];
        a a2 = a_02.getVertexElement((String)a[n3 += p[35]]);
        int n4 = p[36];
        n4 ^= p[37];
        int n5 = p[39];
        n5 += p[40];
        int n6 = p[42];
        n6 ^= p[43];
        Intrinsics.checkNotNullExpressionValue(a2, (String)a[n4 += p[38]] + (String)a[n5 += p[41]] + (String)a[n6 += p[44]]);
        this.D = a2;
        int n7 = p[45];
        n7 ^= p[46];
        a a3 = a_02.getVertexElement((String)a[n7 += p[47]]);
        int n8 = p[48];
        n8 += p[49];
        int n9 = p[51];
        n9 ^= p[52];
        Intrinsics.checkNotNullExpressionValue(a3, (String)a[n8 -= p[50]] + (String)a[n9 -= p[53]]);
        this.e = a3;
        int n10 = p[54];
        n10 += p[55];
        int n11 = p[57];
        n11 ^= p[58];
        a a4 = a_02.getVertexElement((String)a[n10 -= p[56]] + (String)a[n11 ^= p[59]]);
        int n12 = p[60];
        n12 -= p[61];
        int n13 = p[63];
        n13 ^= p[64];
        Intrinsics.checkNotNullExpressionValue(a4, (String)a[n12 ^= p[62]] + (String)a[n13 += p[65]]);
        this.E = a4;
        int n14 = p[66];
        n14 += p[67];
        a a5 = a_02.getVertexElement((String)a[n14 ^= p[68]]);
        int n15 = p[69];
        n15 -= p[70];
        int n16 = p[72];
        n16 += p[73];
        Intrinsics.checkNotNullExpressionValue(a5, (String)a[n15 ^= p[71]] + (String)a[n16 ^= p[74]]);
        this.f = a5;
        int n17 = p[75];
        n17 -= p[76];
        a a6 = a_02.getVertexElement((String)a[n17 ^= p[77]]);
        int n18 = p[78];
        n18 += p[79];
        int n19 = p[81];
        n19 -= p[82];
        Intrinsics.checkNotNullExpressionValue(a6, (String)a[n18 -= p[80]] + (String)a[n19 += p[83]]);
        this.F = a6;
        int n20 = p[84];
        n20 += p[85];
        a a7 = a_02.getVertexElement((String)a[n20 -= p[86]]);
        int n21 = p[87];
        n21 += p[88];
        int n22 = p[90];
        n22 -= p[91];
        Intrinsics.checkNotNullExpressionValue(a7, (String)a[n21 += p[89]] + (String)a[n22 -= p[92]]);
        this.g = a7;
        int n23 = p[93];
        n23 -= p[94];
        a a8 = a_02.getVertexElement((String)a[n23 ^= p[95]]);
        int n24 = p[96];
        n24 ^= p[97];
        int n25 = p[99];
        n25 ^= p[100];
        Intrinsics.checkNotNullExpressionValue(a8, (String)a[n24 ^= p[98]] + (String)a[n25 += p[101]]);
        this.G = a8;
        int n26 = p[102];
        n26 -= p[103];
        a a9 = a_02.getVertexElement((String)a[n26 -= p[104]]);
        int n27 = p[105];
        n27 += p[106];
        int n28 = p[108];
        n28 ^= p[109];
        Intrinsics.checkNotNullExpressionValue(a9, (String)a[n27 ^= p[107]] + (String)a[n28 += p[110]]);
        this.h = a9;
        int n29 = p[111];
        n29 ^= p[112];
        a a10 = a_02.getVertexElement((String)a[n29 ^= p[113]]);
        int n30 = p[114];
        n30 -= p[115];
        int n31 = p[117];
        n31 -= p[118];
        Intrinsics.checkNotNullExpressionValue(a10, (String)a[n30 -= p[116]] + (String)a[n31 ^= p[119]]);
        this.H = a10;
        int n32 = p[120];
        n32 += p[121];
        a a11 = a_02.getVertexElement((String)a[n32 -= p[122]]);
        int n33 = p[123];
        n33 += p[124];
        int n34 = p[126];
        n34 += p[127];
        Intrinsics.checkNotNullExpressionValue(a11, (String)a[n33 += p[125]] + (String)a[n34 -= p[128]]);
        this.i = a11;
        int n35 = p[129];
        n35 += p[130];
        a a12 = a_02.getVertexElement((String)a[n35 ^= p[131]]);
        int n36 = p[132];
        n36 -= p[133];
        int n37 = p[135];
        n37 ^= p[136];
        Intrinsics.checkNotNullExpressionValue(a12, (String)a[n36 -= p[134]] + (String)a[n37 += p[137]]);
        this.I = a12;
        int n38 = p[138];
        n38 ^= p[139];
        a a13 = a_02.getVertexElement((String)a[n38 += p[140]]);
        int n39 = p[141];
        n39 ^= p[142];
        int n40 = p[144];
        n40 ^= p[145];
        Intrinsics.checkNotNullExpressionValue(a13, (String)a[n39 -= p[143]] + (String)a[n40 += p[146]]);
        this.j = a13;
        int n41 = p[147];
        n41 += p[148];
        a a14 = a_02.getVertexElement((String)a[n41 += p[149]]);
        int n42 = p[150];
        n42 += p[151];
        int n43 = p[153];
        n43 += p[154];
        int n44 = p[156];
        n44 += p[157];
        Intrinsics.checkNotNullExpressionValue(a14, (String)a[n42 += p[152]] + (String)a[n43 ^= p[155]] + (String)a[n44 ^= p[158]]);
        this.J = a14;
        int n45 = p[159];
        n45 -= p[160];
        a a15 = a_02.getVertexElement((String)a[n45 += p[161]]);
        int n46 = p[162];
        n46 += p[163];
        int n47 = p[165];
        n47 ^= p[166];
        Intrinsics.checkNotNullExpressionValue(a15, (String)a[n46 -= p[164]] + (String)a[n47 ^= p[167]]);
        this.k = a15;
    }

    @Override
    public void renderBatch(@Nullable b mesh, @Nullable Object state2) {
        if (state2 instanceof TextureSampler) {
            TextureSampler textureSampler = (TextureSampler)state2;
            kotakbaz.rain.client.render.main.program.a_0 a_02 = this.getGlProgram();
            Intrinsics.checkNotNull(a_02);
            int n2 = p[168];
            n2 -= p[169];
            A a2 = a_02.getUniform((String)a[n2 += p[170]], kotakbaz.rain.client.render.main.program.uniform.a.h);
            int n3 = p[171];
            n3 -= p[172];
            Intrinsics.checkNotNullExpressionValue(a2, (String)a[n3 -= p[173]]);
            textureSampler.apply(a2);
        } else if (state2 instanceof Integer) {
            kotakbaz.rain.client.render.main.program.a_0 a_03 = this.getGlProgram();
            Intrinsics.checkNotNull(a_03);
            int n4 = p[174];
            n4 ^= p[175];
            a_03.getUniform((String)a[n4 += p[176]], kotakbaz.rain.client.render.main.program.uniform.a.h).set(((Number)state2).intValue());
        }
        super.renderBatch(mesh, state2);
    }

    @NotNull
    public final AdvancedRectRenderer type(@NotNull RectType type) {
        int n2 = p[177];
        n2 += p[178];
        Intrinsics.checkNotNullParameter((Object)type, (String)a[n2 -= p[179]]);
        this.A = type;
        return this;
    }

    @NotNull
    public final AdvancedRectRenderer texture(@Nullable TextureSampler sampler) {
        if (sampler == null) {
            int n2 = p[180];
            n2 -= p[181];
            if (!this.b.hasKey(n2 += p[182])) {
                int n3 = p[183];
                n3 += p[184];
                this.b = new TextureSampler(n3 -= p[185]);
            }
        } else if (!Intrinsics.areEqual(this.b, sampler)) {
            this.b = sampler;
        }
        this.A = RectType.TEXTURE;
        return this;
    }

    @NotNull
    public final AdvancedRectRenderer texture(int id) {
        if (!this.b.hasKey(id)) {
            this.b = new TextureSampler(id);
        }
        this.A = RectType.TEXTURE;
        return this;
    }

    @NotNull
    public final AdvancedRectRenderer texture(@NotNull kotakbaz.rain.client.render.texture.A tex) {
        int n2 = p[186];
        n2 += p[187];
        Intrinsics.checkNotNullParameter(tex, (String)a[n2 -= p[188]]);
        if (!this.b.hasKey(tex)) {
            this.b = new TextureSampler(tex);
        }
        this.A = RectType.TEXTURE;
        return this;
    }

    @NotNull
    public final AdvancedRectRenderer color(@NotNull Color color) {
        int n2 = p[189];
        n2 += p[190];
        Intrinsics.checkNotNullParameter(color, (String)a[n2 -= p[191]]);
        this.getCachedColor().set(color);
        return this;
    }

    @NotNull
    public final AdvancedRectRenderer color(@NotNull Color c1, @NotNull Color c2, @NotNull Color c3, @NotNull Color c4) {
        int n2 = p[192];
        Intrinsics.checkNotNullParameter(c1, (String)a[n2 ^= p[193]]);
        int n3 = p[194];
        n3 ^= p[195];
        Intrinsics.checkNotNullParameter(c2, (String)a[n3 -= p[196]]);
        int n4 = p[197];
        n4 -= p[198];
        Intrinsics.checkNotNullParameter(c3, (String)a[n4 -= p[199]]);
        int n5 = p[200];
        n5 -= p[201];
        Intrinsics.checkNotNullParameter(c4, (String)a[n5 ^= p[202]]);
        this.getCachedColor().set(c1, c2, c3, c4);
        return this;
    }

    @NotNull
    public final AdvancedRectRenderer round(float r) {
        this.getCachedRadius().set(r, r, r, r);
        return this;
    }

    @NotNull
    public final AdvancedRectRenderer round(@NotNull Vector4f r) {
        int n2 = p[203];
        n2 ^= p[204];
        Intrinsics.checkNotNullParameter(r, (String)a[n2 += p[205]]);
        this.getCachedRadius().set((Vector4fc)r);
        return this;
    }

    @NotNull
    public final AdvancedRectRenderer alpha(float a2) {
        this.c = a2;
        return this;
    }

    @NotNull
    public final AdvancedRectRenderer border(float width2, @NotNull Color color) {
        int n2 = p[206];
        n2 ^= p[207];
        Intrinsics.checkNotNullParameter(color, (String)a[n2 += p[208]]);
        this.C = width2;
        this.d = color;
        return this;
    }

    @NotNull
    public final AdvancedRectRenderer borderWidth(float width2) {
        this.C = width2;
        return this;
    }

    @NotNull
    public final AdvancedRectRenderer borderColor(@NotNull Color color) {
        int n2 = p[209];
        n2 -= p[210];
        Intrinsics.checkNotNullParameter(color, (String)a[n2 -= p[211]]);
        this.d = color;
        return this;
    }

    public final void draw(float x2, float y, float width2, float height) {
        if (this.A == RectType.TEXTURE) {
            this.drawTexture(x2, y, width2, height, this.getCachedColor(), this.B, this.c, 0.0f, 0.0f, 1.0f, 1.0f, this.getCachedRadius());
            return;
        }
        this.drawRect(x2, y, width2, height, this.getCachedColor(), this.getCachedRadius(), this.C, this.d);
    }

    private final void drawConst(float x2, float y, float width2, float height, QuadColor color, Vector4f radius, float mix, float u, float v, float texW, float texH, float alpha2, float borderWidth, Color borderColor) {
        kotakbaz.rain.client.render.main.vertex.mesh.a_0 a_02 = RenderUtils.INSTANCE.getDISPATCHER().getBuilder(this.getCurrentPipeline(), this, this.b);
        if (a_02 == null) {
            return;
        }
        kotakbaz.rain.client.render.main.vertex.mesh.a_0 a_03 = a_02;
        Vector4f vector4f = this.calcSmoothness(x2, y, width2, height);
        ColorUtil.INSTANCE.normalizeInto(color.getColor1(), this.L);
        int n2 = p[212];
        n2 += p[213];
        int n3 = p[215];
        n3 -= p[216];
        int n4 = p[218];
        n4 -= p[219];
        System.arraycopy(this.L, n2 -= p[214], this.l, n3 += p[217], n4 ^= p[220]);
        ColorUtil.INSTANCE.normalizeInto(color.getColor2(), this.L);
        int n5 = p[221];
        n5 -= p[222];
        int n6 = p[224];
        n6 ^= p[225];
        int n7 = p[227];
        n7 ^= p[228];
        System.arraycopy(this.L, n5 += p[223], this.l, n6 += p[226], n7 += p[229]);
        ColorUtil.INSTANCE.normalizeInto(color.getColor3(), this.L);
        int n8 = p[230];
        n8 += p[231];
        int n9 = p[233];
        n9 -= p[234];
        int n10 = p[236];
        n10 ^= p[237];
        System.arraycopy(this.L, n8 ^= p[232], this.l, n9 += p[235], n10 ^= p[238]);
        ColorUtil.INSTANCE.normalizeInto(color.getColor4(), this.L);
        int n11 = p[239];
        n11 ^= p[240];
        int n12 = p[242];
        n12 -= p[243];
        int n13 = p[245];
        n13 += p[246];
        System.arraycopy(this.L, n11 ^= p[241], this.l, n12 -= p[244], n13 ^= p[247]);
        ColorUtil.INSTANCE.normalizeInto(borderColor, this.L);
        int n14 = p[248];
        n14 -= p[249];
        int n15 = p[251];
        n15 ^= p[252];
        int n16 = p[254];
        n16 += p[255];
        System.arraycopy(this.L, n14 ^= p[250], this.l, n15 -= p[253], n16 ^= p[256]);
        int n17 = p[257];
        n17 += p[258];
        this.l[n17 ^= AdvancedRectRenderer.p[259]] = 0.0f;
        int n18 = p[260];
        n18 ^= p[261];
        this.l[n18 ^= AdvancedRectRenderer.p[262]] = mix;
        int n19 = p[263];
        n19 -= p[264];
        this.l[n19 += AdvancedRectRenderer.p[265]] = u;
        int n20 = p[266];
        n20 -= p[267];
        this.l[n20 ^= AdvancedRectRenderer.p[268]] = v;
        int n21 = p[269];
        n21 -= p[270];
        this.l[n21 += AdvancedRectRenderer.p[271]] = texW;
        int n22 = p[272];
        n22 += p[273];
        this.l[n22 -= AdvancedRectRenderer.p[274]] = texH;
        int n23 = p[275];
        n23 -= p[276];
        this.l[n23 -= AdvancedRectRenderer.p[277]] = alpha2;
        int n24 = p[278];
        n24 += p[279];
        this.l[n24 ^= AdvancedRectRenderer.p[280]] = borderWidth;
        int n25 = p[281];
        n25 -= p[282];
        this.l[n25 ^= AdvancedRectRenderer.p[283]] = radius.x;
        int n26 = p[284];
        n26 -= p[285];
        this.l[n26 += AdvancedRectRenderer.p[286]] = radius.y;
        int n27 = p[287];
        n27 += p[288];
        this.l[n27 ^= AdvancedRectRenderer.p[289]] = radius.z;
        int n28 = p[290];
        n28 ^= p[291];
        this.l[n28 -= AdvancedRectRenderer.p[292]] = radius.w;
        float[] fArray = this.l;
        this.buildQuad(a_03, vector4f.x, vector4f.y, vector4f.z, vector4f.w, radius, Arrays.copyOf(fArray, fArray.length));
    }

    public final void drawRect(float x2, float y, float width2, float height, @NotNull QuadColor color, @NotNull Vector4f radius, float borderWidth, @NotNull Color borderColor) {
        int n2 = p[293];
        n2 += p[294];
        Intrinsics.checkNotNullParameter(color, (String)a[n2 ^= p[295]]);
        int n3 = p[296];
        n3 ^= p[297];
        Intrinsics.checkNotNullParameter(radius, (String)a[n3 += p[298]]);
        int n4 = p[299];
        n4 += p[300];
        Intrinsics.checkNotNullParameter(borderColor, (String)a[n4 -= p[301]]);
        this.A = RectType.BASIC;
        int n5 = p[302];
        n5 += p[303];
        if (!this.b.hasKey(n5 ^= p[304])) {
            int n6 = p[305];
            n6 -= p[306];
            this.b = new TextureSampler(n6 ^= p[307]);
        }
        this.drawConst(x2, y, width2, height, color, radius, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, borderWidth, borderColor);
    }

    public final void drawRect(float x2, float y, float width2, float height, @NotNull Color color, @NotNull Vector4f radius) {
        QuadColor quadColor;
        long l2 = -4136383600025067878L;
        int n2 = p[308];
        n2 -= p[309];
        Intrinsics.checkNotNullParameter(color, (String)a[n2 ^= p[310]]);
        int n3 = p[311];
        n3 += p[312];
        Intrinsics.checkNotNullParameter(radius, (String)a[n3 += p[313]]);
        QuadColor quadColor2 = quadColor = this.getCachedColor();
        float f2 = height;
        float f3 = width2;
        float f4 = y;
        float f5 = x2;
        AdvancedRectRenderer advancedRectRenderer = this;
        long l3 = l2;
        int n4 = p[314];
        n4 -= p[315];
        l2 = l3 ^ (0L ^ l3) & -1L << (n4 -= p[316]);
        quadColor2.set(color);
        Unit unit = Unit.INSTANCE;
        advancedRectRenderer.drawRect(f5, f4, f3, f2, quadColor, radius, 0.0f, m);
    }

    public final void drawRect(float x2, float y, float width2, float height, @NotNull Color color, float radius) {
        int n2 = p[317];
        n2 -= p[318];
        Intrinsics.checkNotNullParameter(color, (String)a[n2 ^= p[319]]);
        this.getCachedColor().set(color);
        this.getCachedRadius().set(radius, radius, radius, radius);
        this.drawRect(x2, y, width2, height, this.getCachedColor(), this.getCachedRadius(), 0.0f, m);
    }

    public final void drawRect(float x2, float y, float width2, float height, @NotNull QuadColor color, @NotNull Vector4f radius) {
        int n2 = p[320];
        n2 ^= p[321];
        Intrinsics.checkNotNullParameter(color, (String)a[n2 -= p[322]]);
        int n3 = p[323];
        n3 += p[324];
        Intrinsics.checkNotNullParameter(radius, (String)a[n3 += p[325]]);
        this.drawRect(x2, y, width2, height, color, radius, 0.0f, m);
    }

    public final void drawTexture(float x2, float y, float width2, float height, @NotNull QuadColor color, float mix, float alpha2, float u, float v, float texW, float texH, @NotNull Vector4f radius) {
        int n2 = p[326];
        n2 ^= p[327];
        Intrinsics.checkNotNullParameter(color, (String)a[n2 ^= p[328]]);
        int n3 = p[329];
        n3 ^= p[330];
        Intrinsics.checkNotNullParameter(radius, (String)a[n3 ^= p[331]]);
        this.A = RectType.TEXTURE;
        this.drawConst(x2, y, width2, height, color, radius, mix, u, v, texW, texH, alpha2, this.C, this.d);
    }

    public final void drawTexture(float x2, float y, float width2, float height, @NotNull Color color, float mix, float alpha2, float u, float v, float texW, float texH, @NotNull Vector4f radius) {
        int n2 = p[332];
        n2 ^= p[333];
        Intrinsics.checkNotNullParameter(color, (String)a[n2 -= p[334]]);
        int n3 = p[335];
        n3 ^= p[336];
        Intrinsics.checkNotNullParameter(radius, (String)a[n3 -= p[337]]);
        this.getCachedColor().set(color);
        this.drawTexture(x2, y, width2, height, this.getCachedColor(), mix, alpha2, u, v, texW, texH, radius);
    }

    public final void drawTexture(float x2, float y, float width2, float height, @NotNull Color color, float mix, float alpha2, float u, float v, float texW, float texH, float radius) {
        int n2 = p[338];
        n2 += p[339];
        Intrinsics.checkNotNullParameter(color, (String)a[n2 += p[340]]);
        this.getCachedColor().set(color);
        this.getCachedRadius().set(radius, radius, radius, radius);
        this.drawTexture(x2, y, width2, height, this.getCachedColor(), mix, alpha2, u, v, texW, texH, this.getCachedRadius());
    }

    @Override
    protected void uploadVertex(@NotNull kotakbaz.rain.client.render.main.vertex.mesh.a_0 builder, float x2, float y, float width2, float height, float radius, int index, float ... extra) {
        int n2 = p[341];
        n2 ^= p[342];
        Intrinsics.checkNotNullParameter(builder, (String)a[n2 += p[343]]);
        int n3 = p[344];
        n3 -= p[345];
        Intrinsics.checkNotNullParameter(extra, (String)a[n3 += p[346]]);
        int n4 = p[347];
        n4 ^= p[348];
        float f2 = extra[n4 ^= p[349]];
        int n5 = p[350];
        n5 ^= p[351];
        float f3 = extra[n5 ^= p[352]];
        int n6 = p[353];
        n6 ^= p[354];
        float f4 = extra[n6 ^= p[355]];
        int n7 = p[356];
        n7 += p[357];
        float f5 = extra[n7 -= p[358]];
        int n8 = p[359];
        n8 ^= p[360];
        float f6 = extra[n8 ^= p[361]];
        int n9 = p[362];
        n9 -= p[363];
        float f7 = extra[n9 -= p[364]];
        int n10 = p[365];
        n10 += p[366];
        float f8 = extra[n10 ^= p[367]];
        int n11 = p[368];
        n11 -= p[369];
        float f9 = extra[n11 += p[370]];
        float f10 = f4 + f6;
        float f11 = f5 + f7;
        Pair<Float, Float> pair = switch (index) {
            case 0 -> TuplesKt.to(Float.valueOf(f4), Float.valueOf(f11));
            case 1 -> TuplesKt.to(Float.valueOf(f4), Float.valueOf(f5));
            case 2 -> TuplesKt.to(Float.valueOf(f10), Float.valueOf(f5));
            case 3 -> TuplesKt.to(Float.valueOf(f10), Float.valueOf(f11));
            default -> TuplesKt.to(Float.valueOf(0.0f), Float.valueOf(0.0f));
        };
        float f12 = ((Number)pair.component1()).floatValue();
        float f13 = ((Number)pair.component2()).floatValue();
        int n12 = p[371];
        n12 ^= p[372];
        float f14 = extra[n12 -= p[373]];
        int n13 = p[374];
        n13 ^= p[375];
        float f15 = extra[n13 ^= p[376]];
        int n14 = p[377];
        n14 -= p[378];
        float f16 = extra[n14 ^= p[379]];
        int n15 = p[380];
        n15 += p[381];
        float f17 = extra[n15 ^= p[382]];
        Vector4f vector4f = ScissorUtil.INSTANCE.getCurrentScissorValues();
        this.K.set(x2, y, 0.0f);
        MatrixControl.b.transformPosition(this.K);
        kotakbaz.rain.client.render.main.vertex.mesh.a_0 a_02 = builder.vertex(this.K.x, this.K.y, this.K.z);
        a a2 = this.D;
        if (a2 == null) {
            int n16 = p[383];
            n16 += p[384];
            Intrinsics.throwUninitializedPropertyAccessException((String)a[n16 -= p[385]]);
            a2 = null;
        }
        int n17 = p[386];
        n17 ^= p[387];
        Float[] floatArray = new Float[n17 += p[388]];
        int n18 = p[389];
        n18 ^= p[390];
        int n19 = p[392];
        n19 += p[393];
        floatArray[n18 -= AdvancedRectRenderer.p[391]] = Float.valueOf(extra[n19 += p[394]]);
        int n20 = p[395];
        n20 += p[396];
        int n21 = p[398];
        n21 -= p[399];
        floatArray[n20 ^= AdvancedRectRenderer.p[397]] = Float.valueOf(extra[n21 += 11]);
        int n22 = 100;
        n22 ^= 0xFFFFFFFE;
        int n23 = 18;
        n23 -= -56;
        floatArray[n22 ^= 0xFFFFFF98] = Float.valueOf(extra[n23 += -60]);
        int n24 = 16;
        n24 -= 19;
        int n25 = -150;
        n25 += 104;
        floatArray[n24 += 6] = Float.valueOf(extra[n25 += 61]);
        kotakbaz.rain.client.render.main.vertex.mesh.a_0 a_03 = a_02.element(a2, kotakbaz.rain.client.render.main.vertex.element.a_0.C, floatArray);
        a a3 = this.e;
        if (a3 == null) {
            int n26 = 78;
            n26 += -56;
            Intrinsics.throwUninitializedPropertyAccessException((String)a[n26 += 59]);
            a3 = null;
        }
        int n27 = -46;
        n27 += 80;
        floatArray = new Float[n27 ^= 0x26];
        int n28 = 71;
        n28 -= 24;
        int n29 = -172;
        n29 += 114;
        floatArray[n28 -= 47] = Float.valueOf(extra[n29 -= -74]);
        int n30 = -60;
        n30 -= -34;
        int n31 = 240;
        n31 += -114;
        floatArray[n30 ^= 0xFFFFFFE7] = Float.valueOf(extra[n31 += -109]);
        int n32 = 28;
        n32 ^= 0x43;
        int n33 = -138;
        n33 += 48;
        floatArray[n32 += -93] = Float.valueOf(extra[n33 ^= 0xFFFFFFB4]);
        int n34 = -143;
        n34 += 98;
        int n35 = 2;
        n35 -= -8;
        floatArray[n34 -= -48] = Float.valueOf(extra[n35 -= -9]);
        kotakbaz.rain.client.render.main.vertex.mesh.a_0 a_04 = a_03.element(a3, kotakbaz.rain.client.render.main.vertex.element.a_0.C, floatArray);
        a a4 = this.E;
        if (a4 == null) {
            int n36 = -199;
            n36 -= -111;
            Intrinsics.throwUninitializedPropertyAccessException((String)a[n36 ^= 0xFFFFFF90]);
            a4 = null;
        }
        int n37 = 85;
        n37 ^= 0x34;
        floatArray = new Float[n37 += -93];
        int n38 = 109;
        n38 -= 34;
        int n39 = 104;
        n39 ^= 0xFFFFFF8C;
        floatArray[n38 ^= 0x4B] = Float.valueOf(extra[n39 -= -48]);
        int n40 = 176;
        n40 += -70;
        int n41 = 105;
        n41 ^= 0xFFFFFFCE;
        floatArray[n40 -= 105] = Float.valueOf(extra[n41 += 110]);
        int n42 = -74;
        n42 += 117;
        int n43 = -47;
        n43 -= -99;
        floatArray[n42 -= 41] = Float.valueOf(extra[n43 += -30]);
        int n44 = 59;
        n44 -= -51;
        int n45 = 42;
        n45 ^= 0x1C;
        floatArray[n44 += -107] = Float.valueOf(extra[n45 += -31]);
        kotakbaz.rain.client.render.main.vertex.mesh.a_0 a_05 = a_04.element(a4, kotakbaz.rain.client.render.main.vertex.element.a_0.C, floatArray);
        a a5 = this.f;
        if (a5 == null) {
            int n46 = -37;
            n46 ^= 0x14;
            Intrinsics.throwUninitializedPropertyAccessException((String)a[n46 ^= 0xFFFFFFA9]);
            a5 = null;
        }
        int n47 = -97;
        n47 ^= 0xFFFFFFBD;
        floatArray = new Float[n47 -= 30];
        int n48 = -99;
        n48 ^= 0x38;
        int n49 = -2;
        n49 += -100;
        floatArray[n48 -= -91] = Float.valueOf(extra[n49 += 126]);
        int n50 = -66;
        n50 -= 22;
        int n51 = -92;
        n51 -= 10;
        floatArray[n50 += 89] = Float.valueOf(extra[n51 -= -127]);
        int n52 = 71;
        n52 += -42;
        int n53 = 20;
        n53 ^= 0x50;
        floatArray[n52 += -27] = Float.valueOf(extra[n53 -= 42]);
        int n54 = -69;
        n54 ^= 0xFFFFFFD8;
        int n55 = 23;
        n55 -= 96;
        floatArray[n54 += -96] = Float.valueOf(extra[n55 += 100]);
        kotakbaz.rain.client.render.main.vertex.mesh.a_0 a_06 = a_05.element(a5, kotakbaz.rain.client.render.main.vertex.element.a_0.C, floatArray);
        a a6 = this.F;
        if (a6 == null) {
            int n56 = 23;
            n56 -= 72;
            Intrinsics.throwUninitializedPropertyAccessException((String)a[n56 += 73]);
            a6 = null;
        }
        int n57 = 46;
        n57 -= -81;
        floatArray = new Float[n57 ^= 0x7D];
        int n58 = -87;
        n58 ^= 0xFFFFFF94;
        floatArray[n58 += -61] = Float.valueOf(f12);
        int n59 = 50;
        n59 += 9;
        floatArray[n59 ^= 0x3A] = Float.valueOf(f13);
        kotakbaz.rain.client.render.main.vertex.mesh.a_0 a_07 = a_06.element(a6, kotakbaz.rain.client.render.main.vertex.element.a_0.C, floatArray);
        a a7 = this.g;
        if (a7 == null) {
            int n60 = -2;
            n60 += -97;
            Intrinsics.throwUninitializedPropertyAccessException((String)a[n60 -= -126]);
            a7 = null;
        }
        int n61 = -44;
        n61 ^= 0xFFFFFF8E;
        floatArray = new Float[n61 += -88];
        int n62 = 76;
        n62 ^= 0xFFFFFFDC;
        floatArray[n62 -= -112] = Float.valueOf(width2);
        int n63 = 73;
        n63 -= 2;
        floatArray[n63 ^= 0x46] = Float.valueOf(height);
        kotakbaz.rain.client.render.main.vertex.mesh.a_0 a_08 = a_07.element(a7, kotakbaz.rain.client.render.main.vertex.element.a_0.C, floatArray);
        a a8 = this.G;
        if (a8 == null) {
            int n64 = 180;
            n64 ^= 7;
            Intrinsics.throwUninitializedPropertyAccessException((String)a[n64 -= 119]);
            a8 = null;
        }
        int n65 = 190;
        n65 += -113;
        floatArray = new Float[n65 ^= 0x49];
        int n66 = -20;
        n66 += -90;
        floatArray[n66 -= -110] = Float.valueOf(f14);
        int n67 = -78;
        n67 -= -87;
        floatArray[n67 ^= 8] = Float.valueOf(f16);
        int n68 = 34;
        n68 ^= 0x12;
        floatArray[n68 -= 46] = Float.valueOf(f15);
        int n69 = 84;
        n69 += 22;
        floatArray[n69 ^= 0x69] = Float.valueOf(f17);
        kotakbaz.rain.client.render.main.vertex.mesh.a_0 a_09 = a_08.element(a8, kotakbaz.rain.client.render.main.vertex.element.a_0.C, floatArray);
        a a9 = this.h;
        if (a9 == null) {
            int n70 = -69;
            n70 ^= 0x25;
            Intrinsics.throwUninitializedPropertyAccessException((String)a[n70 ^= 0xFFFFFFB3]);
            a9 = null;
        }
        int n71 = 92;
        n71 += -108;
        floatArray = new Float[n71 ^= 0xFFFFFFF1];
        int n72 = -59;
        n72 -= -49;
        floatArray[n72 -= -10] = Float.valueOf(f3);
        kotakbaz.rain.client.render.main.vertex.mesh.a_0 a_010 = a_09.element(a9, kotakbaz.rain.client.render.main.vertex.element.a_0.C, floatArray);
        a a10 = this.H;
        if (a10 == null) {
            int n73 = 46;
            n73 ^= 0x47;
            Intrinsics.throwUninitializedPropertyAccessException((String)a[n73 += -80]);
            a10 = null;
        }
        int n74 = 73;
        n74 ^= 0xFFFFFFFF;
        floatArray = new Float[n74 -= -75];
        int n75 = 17;
        n75 += 76;
        floatArray[n75 += -93] = Float.valueOf(f8);
        kotakbaz.rain.client.render.main.vertex.mesh.a_0 a_011 = a_010.element(a10, kotakbaz.rain.client.render.main.vertex.element.a_0.C, floatArray);
        a a11 = this.i;
        if (a11 == null) {
            int n76 = -48;
            n76 -= -38;
            Intrinsics.throwUninitializedPropertyAccessException((String)a[n76 += 76]);
            a11 = null;
        }
        int n77 = 41;
        floatArray = new Float[n77 -= 40];
        int n78 = -94;
        n78 ^= 0x74;
        floatArray[n78 += 42] = Float.valueOf(f2);
        kotakbaz.rain.client.render.main.vertex.mesh.a_0 a_012 = a_011.element(a11, kotakbaz.rain.client.render.main.vertex.element.a_0.C, floatArray);
        a a12 = this.I;
        if (a12 == null) {
            int n79 = 35;
            n79 -= 73;
            Intrinsics.throwUninitializedPropertyAccessException((String)a[n79 ^= 0xFFFFFFB3]);
            a12 = null;
        }
        int n80 = 35;
        n80 -= 114;
        floatArray = new Float[n80 ^= 0xFFFFFFB0];
        int n81 = 39;
        n81 += 69;
        floatArray[n81 += -108] = Float.valueOf(f9);
        kotakbaz.rain.client.render.main.vertex.mesh.a_0 a_013 = a_012.element(a12, kotakbaz.rain.client.render.main.vertex.element.a_0.C, floatArray);
        a a13 = this.j;
        if (a13 == null) {
            int n82 = 170;
            n82 += -100;
            Intrinsics.throwUninitializedPropertyAccessException((String)a[n82 += -32]);
            a13 = null;
        }
        int n83 = -125;
        n83 ^= 0x26;
        floatArray = new Float[n83 += 95];
        int n84 = -26;
        n84 += 17;
        int n85 = 27;
        n85 ^= 0xFFFFFFE2;
        floatArray[n84 += 9] = Float.valueOf(extra[n85 ^= 0xFFFFFFF1]);
        int n86 = 41;
        n86 -= 82;
        int n87 = 46;
        n87 ^= 0x7B;
        floatArray[n86 ^= 0xFFFFFFD6] = Float.valueOf(extra[n87 ^= 0x5C]);
        int n88 = 6;
        n88 += 9;
        int n89 = 10;
        n89 += 102;
        floatArray[n88 ^= 0xD] = Float.valueOf(extra[n89 ^= 0x7A]);
        int n90 = -129;
        n90 += 97;
        int n91 = 89;
        n91 ^= 0xFFFFFFF5;
        floatArray[n90 -= -35] = Float.valueOf(extra[n91 -= -95]);
        kotakbaz.rain.client.render.main.vertex.mesh.a_0 a_014 = a_013.element(a13, kotakbaz.rain.client.render.main.vertex.element.a_0.C, floatArray);
        a a14 = this.J;
        if (a14 == null) {
            int n92 = 17;
            n92 ^= 5;
            Intrinsics.throwUninitializedPropertyAccessException((String)a[n92 += 23]);
            a14 = null;
        }
        int n93 = -8;
        n93 += 40;
        floatArray = new Float[n93 += -31];
        int n94 = 5;
        n94 += 55;
        floatArray[n94 += -60] = Float.valueOf(this.A.getValue());
        kotakbaz.rain.client.render.main.vertex.mesh.a_0 a_015 = a_014.element(a14, kotakbaz.rain.client.render.main.vertex.element.a_0.C, floatArray);
        a a15 = this.k;
        if (a15 == null) {
            int n95 = -83;
            n95 ^= 0xFFFFFF9F;
            Intrinsics.throwUninitializedPropertyAccessException((String)a[n95 -= 34]);
            a15 = null;
        }
        int n96 = 62;
        n96 ^= 0x10;
        floatArray = new Float[n96 += -42];
        int n97 = -71;
        n97 ^= 0xFFFFFFC5;
        floatArray[n97 ^= 0x7C] = Float.valueOf(vector4f.x);
        int n98 = -16;
        n98 += -93;
        floatArray[n98 += 110] = Float.valueOf(vector4f.y);
        int n99 = -83;
        n99 ^= 0x3E;
        floatArray[n99 ^= 0xFFFFFF91] = Float.valueOf(vector4f.z);
        int n100 = 217;
        n100 -= 90;
        floatArray[n100 += -124] = Float.valueOf(vector4f.w);
        a_015.element(a15, kotakbaz.rain.client.render.main.vertex.element.a_0.C, floatArray);
    }

    static {
        AdvancedRectRenderer.b();
        long l2 = 5650068789967633359L;
        long l3 = 5939409821798407121L;
        long l4 = 3106558266483889581L;
        long l5 = -6098437033809501123L;
        long l6 = 1459548069129966518L;
        long l7 = -8888498234139905467L;
        long l8 = 5766665296872877997L;
        long l9 = -5432522319616210101L;
        long l10 = 8330261516059243746L;
        long l11 = 8318515117335260193L;
        long l12 = 7975886128229925829L;
        long l13 = -2765603877510772549L;
        long l14 = -4320574010306266437L;
        long l15 = -7267454037958208730L;
        int n2 = 172;
        n2 -= 55;
        a = new Object[n2 -= 11];
        long l16 = l15;
        int n3 = 142;
        n3 += -3;
        l15 = l16 ^ (0L ^ l16) & -1L << (n3 += -107);
        Object[] objectArray = new Object[3];
        objectArray[0] = n;
        objectArray[1] = 0;
        Object object = AdvancedRectRenderer.A()[0];
        if (object == null) {
            char[] cArray = "\udd63\udd4c\udd9a\udd64\udd5c\udd8b\udcc0\udd9a\udd5e\udd65\udd6b\udd5d\udd64\udd4f\udd8f\udd95\udd86\udcae\udd68\udcc0\udcb8\udcc0\udd5e\udcc2\udd51\udd85\udd86\udd5c\udd69\udd64\udd57\udd51\udd93\udd99\udcc2\udcaf\udcac\udd9d\udd51\udd5e\udd68\udd52\udd4f\udd99\udd71\udd5a\udd8c\udd4d\udcb8\udd71\udd66\udd8e\udd99\udd5a\udd4c\udda2\udd57\udcaf\udd67\udd57\udd58\udd87\udd7e\udcbd\udd57\udd8e\udcad\udcc2\udcc2\udd67\udd67\udda2\udcb8\udd4d\udcb0\udd85\udd5e\udcb7\udd83\udcac\uddcb\udd50\udcb8\udda2\udd8b\udd67\udd88\udd58\udd5a\uddcb\udd97\udd86\udd58\udd85\udd9d\udd85\udd88\udd4c\udd97\udd4d\udd53\udd85\udd67\udd84\udd50\udd59\udd88\udcaf\udd9d\udcb7\udd67\udd86\udd62\udd85\udd99\udd52\udd98\udd53\udd59\udd57\udd7c\udd98\udd5e\udd66\udd53\udd97\udcaf\udd8e\udd4f\udd7e\udcb2\udd99\udcb2\uddcb\udd5c\udd97\udd88\udd87\udd63\udcc0\udd69\udd4e\udd67\udd5d\udda2\udd84\udd58\udd68\udcae\udd65\udd5e\udd5c\udd66\udd52\udd83\udd88\udd59\udd69\udcac\udcb3\udcac\udd83\udd64\udd66\udd89\udd88\udd63\udcb7\udd71\udd9d\udd59\udd5c\udd98\udd89\udd68\udcb3\udd53\udcad\udd95\udd97\udd5d\udcb0\udd58\udd51\udda2\udcba\udcc0\udd93\udcb9\udd71\udd68\udd97\udd5c\udda2\udcae\udd88\udd97\udd50\udd9a\udda2\udd65\udcaf\udcb7\udd62\udd66\udd5c\udd55\udd95\udd83\udd4c\udd84\udcae\udd50\udd5d\udd4d\udd67\udcbd\udd4d\udd5d\udd52\udcb5\udd63\udd86\udda2\udd5e\udd60\udd7e\udd55\udd93\udcad\udd64\udd5c\udd68\udcbd\udcb8\udd59\udd60\udcb8\udd69\udcb9\udd84\udd5c\udd62\udd52\udd9d\udcad\udd9a\udd8c\udd98\udd9a\udd60\udd5e\udd65\udd71\udcac\udd50\udd8c\udcb3\udcac\udda2\udd95\udda2\udd5a\udd66\udcb3\udd97\udd4e\udd65\udd7e\udd6b\udcae\udcb7\udda2\udd8c\udcc0\udcb5\udd63\udd93\udcad\udd85\udd9d\udd7c\udd8f\udd50\udcb3\udd57\udd66\udd59\uddcb\udd68\udd62\udcb9\udd6b\udd6b\udcb9\udd7c\udd60\udcb3\udcb3\udcac\udd4c\udd66\udcb2\udcb2\udcb5\udd59\udcb9\udd71\udcbd\udd68\udd5a\udcc0\udcb0\udd52\udd93\udd68\udd53\udd9a\udd4f\udcac\udcb5\udd88\udcac\udd57\udd52\udcb7\udcaf\udd65\udd8e\udd89\udd5e\udd8f\udd98\udcc2\udd52\udd53\udd4d\udd99\udd62\udd69\udd8f\udcbd\udd51\udd4d\udd51\udd84\udd50\udcb2\udd9d\udd89\udd85\udd4c\udd5d\udd5a\udd5a\udcb3\udd8b\udd4e\udd60\udd53\udd66\uddcb\udd4e\udd97\udd53\udd5c\udcc2\udcae\udd62\udd52\udcc2\udd7c\udd59\udcb7\udd7c\udd5c\udd53\udd62\udd58\udd5a\udd84\udd69\udd5c\udd53\udd8f\udd88\udd87\udcbd\uddcb\udd7e\udd4f\udcae\udd88\udd5e\udd4c\udcb3\udd86\udd99\udcba\udd62\udd93\udcb8\udd65\udcb8\udcae\udd50\udd89\udd64\udd5c\udd95\udd4c\udd8b\udd60\udd5c\udd69\udd8f\udcb2\uddcb\udd71\udd7e\udd8f\udd57\udd64\udd64\udd60\udd4e\udd8b\udd98\udd5a\udd60\udcb3\udcb9\udd4e\udd65\udd5a\udd52\udd9a\udd83\udcb9\udd55\udd8e\udd97\udd98\udd71\udd8b\udd99\udcc0\udd87\udd4d\udd5a\udd7c\udcae\udd62\udd58\udd55\udd6b\udcb9\udd50\udd53\udd63\udd65\udd95\udd50\udcb9\udd4f\udda2\udd52\uddcb\udd5c\udd53\udd68\udd66\udd50\udcaf\udd87\udcc0\udcb0\udd93\udd60\udd5d\udd7c\udcb0\udcba\udd93\udcb2\udcc2\udd9d\udd88\udcb3\udd50\udd64\udcb7\udd57\udda2\udcb2\udd64\udd68\udd97\udd84\udd51\udd8c\udd6b\udd87\udd71\udd83\udd5a\udd4e\udd97\udcc2\udd5c\udd68\udcbd\udd6b\udd69\udd95\udd95\udd59\udd85\udd69\udcc2\udd68\udd4c\udd89\udd85\udcba\udd4c\udcc0\udcb5\udcb3\udd5c\udd9d\udd89\udd84\udd64\udd71\udd8c\udd55\udcb9\udd8c\udd66\udd87\udd97\udd9d\udd60\udd67\udd67\udcc0\udd87\udd8e\udd98\udcc0\udd4e\udd68\udd53\udcb3\udd8f\udd64\udd8c\udd7e\udd71\udd4e\udd63\udd8e\udd99\udd71\uddcb\udd50\udd5d\udd60\udd51\udd4d\udd83\udd58\udcb3\udd55\udcba\udd9a\udd5e\udd93\udd4c\udd89\udd7e\udcba\udd4e\udd95\udcaf\udd62\udd52\udd99\udd5c\udd4f\udd51\udd87\udd4d\udd8c\udd9a\udd57\udd4e\udcc2\udd83\udd52\udcb2\udcad\udd98\udd83\udd5e\udd62\udd8f\udcb5\uddcb\udd6b\udd60\udd51\udd53\udd68\udd9a\udd8c\udcaf\udd66\udd83\udcc2\udd4e\udd67\udcb7\udd59\udd5e\udd69\udd7c\udd4f\udd8c\udd62\udd52\udcb3\udd4c\udd97\udd5d\udcae\udd4f\udcb8\udcb3\udd67\udd60\udd71\udd4f\udcb9\udd68\udd69\udd85\udd93\udd62\udd8f\udd64\udd9d\udd8e\udd83\udcad\udd53\udcc2\udd52\udd93\udd8e\udd57\udcc2\udd7c\udd4e\udcac\uddcb\udcae\udd5d\udcb5\udcb7\udd68\udd8f\udcad\udd52\udd5d\udd57\udd9d\udd71\udd93\udd7c\udd5c\udd4e\udd84\udd7e\udcc2\udcb7\udd85\udcba\udd88\udd8f\udcad\udd5a\udd64\udd71\udd4d\udd59\udcb5\udd52\udd58\udcc0\udd55\udd84\udd8c\udd69\udcb5\udd84\udcbd\udd71\udcb0\udd8c\udd71\udd98\udd87\udd51\udcc2\udd8b\udd9d\udd8e\udd88\udcb9\udd9a\udd67\udd51\udd51\udd50\udd4c\udd84\udd4f\udd8e\udd4c\udd62\udd4f\udcb8\udd98\udcc2\udcb2\udd60\udd83\udcbd\udcb2\udd9d\udcae\udcbd\udd4d\udd4e\udd57\udd4d\udd97\udd86\udcb3\udd68\udd66\udd7c\udd98\udcb2\udd87\udd53\udd84\udd8f\udcc0\udd7e\udd53\udd89\udd51\udd85\udd4c\udd8c\udd85\udd59\udd85\udd86\udd95\udcb9\udcae\udd51\udcb9\udd83\udd93\udcad\udd55\udcb2\udd8c\udd65\udd83\udcb2\udd98\udd99\udda2\udd62\udd7c\udd97\udd55\udd67\udcb3\udd83\udd7c\udd8f\udcbd\udd9a\udcac\udd9d\udcac\udcc2\udd84\udcb9\udcac\udd52\udcc0\udd88\udd83\udd95\udcae\udcb2\udcb9\udcba\udd8e\udd8e\udd52\udd89\udd71\udd57\udcc0\udd86\udcaf\udcb3\udd50\udcad\udcad\udd8e\udd98\udd84\udd87\udd65\udd98\udcb2\udd4c\udd5e\udd7c\udcb7\udd53\udcba\udd65\udd98\udcb9\udd7e\udd71\udd51\udd9a\udd5e\udd9a\udd88\udcb8\udd63\udd4e\udd6b\udcb0\udd69\udd8c\udd83\udd58\udd8c\udd4d\udda2\udd8c\udd95\udd5e\udcb7\udcb7\udd93\udcac\udd52\udd66\udd67\udd9d\udd57\udd5a\udd7c\udd89\udcb5\udd85\udcaf\udd85\udd5a\udd66\udd5e\udd57\udd4d\udd68\udd99\udcaf\udcb7\udd69\udd5e\udd9a\udcaf\udcc0\udcc2\udd8f\udd8c\udd66\udd4c\udd69\udd67\udd93\udcb2\udd5c\udd5e\udd4f\udd52\udd99\udd6b\udd67\udd89\udcb7\udd68\udd5c\udd68\udd67\udd50\udd89\udda2\udcb2\udda2\udd64\udd4c\udd71\udd5a\udd63\udda2\udd83\udcb9\udcbd\udd88\udd4d\udd5a\udd85\udcb5\udd68\udcba\udd4e\udd83\udd97\udd71\udcb9\udd9d\udd8b\udd50\udd4c\udd53\udd62\udcba\udd89\udd9d\udcad\udd52\udd50\udd63\udcb3\udd8b\udd51\udcb0\udd85\udd63\udcb0\udd93\udd8f\udcae\udd4f\udd88\udd7e\udd8e\udd5d\udd5d\udd85\udd7c\udd50\udd87\udcc2\udd9a\udd67\udda2\udcaf\udd7c\udd86\udcb9\udcb7\udd69\udd6b\udd6b\udd98\udcb2\udcc2\udd4d\udd5c\udd99\udd71\udd97\udd98\udd9d\udd8b\udda2\udcc2\udd55\udd6b\udd53\udcae\udd5c\udd64\udd8b\udd88\udd83\udd4d\udd93\udcae\udd58\udd65\udd8c\udd8c\udd5c\udd83\udd63\udd98\udcac\udd57\udd71\udd66\udcc2\udcbd\udd50\udd98\udd8e\udd65\udd7c\udcb8\udd5e\udd63\udd9a\udcac\udcae\udd6b\udd97\udd66\udd8f\udcc0\udd6b\udd64\udd85\udd5c\udd99\udcb0\udcb0\udcae\udd95\udd88\udd8b\udd86\udd9d\udd59\udcb7\udda2\udd95\udd4c\udd98\udd4c\udd64\udd65\udcad\udd63\udcc0\udda2\udd7e\udd4f\udd97\udcae\udcbd\udd86\udcac\udd8f\udd88\udd8b\udd89\udcb8\udd58\udd63\udd7c\udd4d\udd84\udd84\udd64\udd4e\udd7c\udd64\udd98\udd5d\udda2\udd86\udd7e\udd85\udd52\udd93\udd66\udd9d\udd9d\udd97\udcb0\udd52\udd55\udd67\udd51\udd6b\udd95\udd89\udd5d\udd57\udd7c\udd4f\udcb9\udd8b\udd4e\udd8f\udd9a\udd59\udcc2\udd89\udd9d\udd67\udd83\udcc0\udd84\udcb2\udd50\udd93\udd71\udd71\udcac\udcbd\udcc0\udcb5\udd5e\udd63\udd4d\udd83\udcb3\udd5c\udd55\udd4e\udd66\udd85\udd85\udcbd\udd7c\udd87\udd55\udd63\udd57\udd7c\udd66\udcb2\udcb9\udd98\udd7c\udd5a\udd50\udd95\udd63\udd8e\udd8e\udcae\udd58\udd9a\udcad\udcbd\uddcb\udd64\udd53\udcb2\udd5a\udd58\udd5e\udd89\udcb9\udd67\udd83\udcc2\udd59\uddcb\udd51\udcc0\udcc0\udd57\udcae\udd60\udcbd\udd68\uddcb\udd89\udd95\udd57\udd4c\udd83\udd67\udd62\udcad\udd51\udd66\udd98\udd67\udd4e\udd71\udd58\udd87\uddcb\udcb3\udcc0\udd57\udcba\udcb5\udd89\udd86\udd51\udd7e\udd52\udcb7\udd5c\udd62\udd8c\udd99\udd87\udd97\udd52\udcbd\udcae\udd64\udd55\udcc2\udd71\udd71\udd8b\udcc0\udd67\udd66\udd60\udd9d\udd67\udd8f\udcba\udd8e\udcad\udcb9\udd64\udd7e\udd8b\udd8c\udd69\udd67\udd86\udd4c\udd95\udd5c\udd8e\udd52\udd65\udd71\udda2\udd99\udda2\udd84\udd62\udd66\udd86\udd95\udd65\udd88\udd59\udd98\udd5c\udcb2\udd69\udd71\udd5e\udd51\udd4e\udd6b\udd55\udcb0\udcad\udd5a\udd69\udcb2\udd8c\udd8e\udd55\udd5e\udd99\udd87\udd8c\udcac\udd64\udd68\udd7c\udd57\udd64\udcae\udd86\udd5d\udd66\udd6b\udd59\udcba\udcb3\udd64\udd7c\udd84\udd69\udd85\udcac\udd71\udd67\udcb3\udd5d\udd68\udd65\udd4d\udcaf\udd4f\udd8e\udd88\udd5a\udd95\udd63\udd7c\udd84\udd64\udd67\udcb5\udcb3\udd88\udd57\udd7e\udcad\udcbd\udd83\udcb8\udd4f\udd69\udd85\udcb5\udd52\udcae\udd65\udcb8\udd7c\udcb0\udd88\udd9a\udd7c\udcad\udcba\udd68\udd7c\udd8c\udcc0\udd67\udd66\udcad\udd8c\udd53\udd62\udd71\udd7e\udd50\udd62\udd7c\udcaf\udd62\udd63\udd85\udcac\udd60\udcb3\udd4d\udcb0\udcac\udd97\udd5e\uddcb\udd4e\udcad\udcb7\udd84\udd7e\udd67\udcaf\udd57\udd87\udd87\udcba\udd89\udd93\udd62\udd9d\udd5a\udd83\udcb2\udd62\udd6b\udd85".toCharArray();
            for (int i2 = 0; i2 < 1408; ++i2) {
                int n4 = cArray[i2];
                n4 += 62081;
                n4 -= 57601;
                n4 += 40837;
                n4 -= 23112;
                n4 -= 35401;
                n4 ^= 0x4C4A;
                n4 -= 19051;
                n4 += 20908;
                n4 ^= 0xCC92;
                n4 -= 29526;
                n4 -= 16471;
                n4 ^= 0x819B;
                cArray[i2] = (char)(n4 += 4927);
            }
            object = AdvancedRectRenderer.A()[0] = new String(cArray);
        }
        objectArray[2] = (String)object;
        char[] cArray = ((String)AdvancedRectRenderer.a(objectArray)).toCharArray();
        long l17 = l6;
        int n5 = -33;
        n5 -= -67;
        l6 = l17 ^ (0x40E00000000L ^ l17) & -1L << (n5 -= 2);
        long l18 = l13;
        int n6 = 77;
        n6 ^= 0x37;
        l13 = l18 ^ (0L ^ l18) & -1L >>> (n6 ^= 0x5A);
        while (true) {
            int n7 = 102;
            n7 ^= 0x33;
            if ((int)l13 >= (int)(l6 >>> (n7 -= 53))) break;
            int n8 = (int)l13;
            long l19 = l13;
            int n9 = 5;
            n9 += 40;
            int n10 = -60;
            n10 -= -13;
            l13 = l19 ^ (l19 ^ l19 + (long)(n9 -= 44)) & -1L >>> (n10 -= -79);
            long l20 = l9;
            int n11 = 142;
            n11 += -34;
            l9 = l20 ^ ((long)cArray[n8] ^ l20) & -1L >>> (n11 += -76);
            int n12 = (int)l13;
            long l21 = l13;
            int n13 = 113;
            n13 ^= 0x7C;
            int n14 = -82;
            n14 ^= 4;
            l13 = l21 ^ (l21 ^ l21 + (long)(n13 ^= 0xC)) & -1L >>> (n14 -= -118);
            int n15 = 51;
            n15 += 51;
            long l22 = l10;
            int n16 = 71;
            n16 += 40;
            l10 = l22 ^ ((long)cArray[n12] << (n15 += -70) ^ l22) & -1L << (n16 += -79);
            int n17 = -145;
            n17 -= -72;
            n17 += 89;
            int n18 = 189;
            n18 ^= 0x27;
            long l23 = l12;
            int n19 = -103;
            n19 += 56;
            l12 = l23 ^ ((long)((int)l9 << n17 | (int)(l10 >>> (n18 += -122))) ^ l23) & -1L >>> (n19 += 79);
            char[] cArray2 = new char[(int)l12];
            long l24 = l14;
            int n20 = 122;
            n20 += 33;
            l14 = l24 ^ (0L ^ l24) & -1L << (n20 -= 123);
            while (true) {
                int n21 = 88;
                n21 += 34;
                if ((int)(l14 >>> (n21 += -90)) >= (int)l12) break;
                int n22 = 30;
                n22 -= -49;
                int n23 = -191;
                n23 += 114;
                cArray2[(int)(l14 >>> (n22 ^= 0x6F))] = cArray[(int)l13 + (int)(l14 >>> (n23 -= -109))];
                l14 += 0x100000000L;
            }
            int n24 = -22;
            n24 ^= 0xFFFFFFDC;
            int n25 = (int)(l15 >>> (n24 ^= 0x16));
            l15 += 0x100000000L;
            AdvancedRectRenderer.a[n25] = new String(cArray2);
            long l25 = l13;
            int n26 = 63;
            n26 -= 113;
            l13 = l25 ^ ((long)((int)l13 + (int)l12) ^ l25) & -1L >>> (n26 ^= 0xFFFFFFEE);
        }
        h = new d(null);
        int n27 = 124;
        n27 -= 21;
        n27 += -103;
        int n28 = -78;
        n28 ^= 0x50;
        int n29 = 146;
        n29 += -88;
        int n30 = 115;
        n30 += -39;
        m = new Color(n27, n28 -= -30, n29 -= 58, n30 ^= 0x4C);
        int n31 = 131;
        n31 += 54;
        n31 -= 107;
        int n32 = -5;
        n32 ^= 0xFFFFFFC9;
        n32 += -46;
        int n33 = 222;
        n33 ^= 0x71;
        n33 += -123;
        int n34 = -74;
        n34 -= -90;
        n34 += -12;
        int n35 = -153;
        n35 += 93;
        n35 ^= 0xFFFFFFF1;
        int n36 = -3;
        n36 ^= 0xFFFFFFDD;
        n36 += -6;
        int n37 = 79;
        n37 ^= 0x52;
        n37 ^= 0x19;
        int n38 = -114;
        n38 ^= 0xFFFFFFFE;
        n38 += -29;
        int n39 = -105;
        n39 ^= 0x31;
        n39 ^= 0xFFFFFFA2;
        int n40 = -2;
        n40 -= -49;
        n40 ^= 0xF;
        int n41 = 39;
        n41 ^= 0x40;
        n41 -= 101;
        int n42 = 34;
        n42 ^= 0x77;
        n42 += -72;
        int n43 = -25;
        n43 += -1;
        n43 ^= 0xFFFFFFE4;
        int n44 = 219;
        n44 ^= 0x17;
        n44 -= 105;
        int n45 = 112;
        n45 -= 92;
        n45 += -16;
        int n46 = 119;
        n46 -= 25;
        n46 += -94;
        int n47 = 152;
        n47 += -59;
        n47 ^= 0x5C;
        int n48 = -19;
        n48 -= -57;
        n48 ^= 0x29;
        int n49 = 48;
        n49 -= 83;
        n49 += 36;
        int n50 = 39;
        n50 ^= 8;
        n50 ^= 0x19;
        int n51 = 41;
        n51 ^= 4;
        n51 ^= 0x2C;
        int n52 = 113;
        n52 += -52;
        n52 ^= 3;
        int n53 = -27;
        n53 ^= 0xFFFFFFF4;
        n53 += -16;
        int n54 = 59;
        n54 -= -53;
        n54 ^= 0x2A;
        int n55 = 101;
        n55 ^= 0x38;
        n55 -= 89;
        int n56 = -39;
        n56 -= -65;
        n56 -= -54;
        int n57 = -35;
        n57 -= 81;
        int n58 = 22;
        n58 ^= 0xFFFFFFFF;
        int n59 = 139;
        n59 += -106;
        M = a_0.builder().element((String)a[n31], kotakbaz.rain.client.render.main.vertex.element.a_0.C, n32).element((String)a[n33], kotakbaz.rain.client.render.main.vertex.element.a_0.C, n34).element((String)a[n35] + (String)a[n36], kotakbaz.rain.client.render.main.vertex.element.a_0.C, n37).element((String)a[n38], kotakbaz.rain.client.render.main.vertex.element.a_0.C, n39).element((String)a[n40], kotakbaz.rain.client.render.main.vertex.element.a_0.C, n41).element((String)a[n42], kotakbaz.rain.client.render.main.vertex.element.a_0.C, n43).element((String)a[n44], kotakbaz.rain.client.render.main.vertex.element.a_0.C, n45).element((String)a[n46], kotakbaz.rain.client.render.main.vertex.element.a_0.C, n47).element((String)a[n48], kotakbaz.rain.client.render.main.vertex.element.a_0.C, n49).element((String)a[n50], kotakbaz.rain.client.render.main.vertex.element.a_0.C, n51).element((String)a[n52], kotakbaz.rain.client.render.main.vertex.element.a_0.C, n53).element((String)a[n54], kotakbaz.rain.client.render.main.vertex.element.a_0.C, n55).element((String)a[n56], kotakbaz.rain.client.render.main.vertex.element.a_0.C, n57 += 117).element((String)a[n58 += 71], kotakbaz.rain.client.render.main.vertex.element.a_0.C, n59 -= 29).build();
    }

    public static Object a(Object[] object) {
        Object object2;
        int n2 = (Integer)object[1];
        String string = (String)object[2];
        object = object[0];
        Object[] objectArray = o;
        if (o == null) {
            objectArray = o = new Object[1];
        }
        if ((object2 = objectArray[n2]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[1];
                n = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[0x8B7F ^ 0x8B6F];
                byArray[0xC1A9 ^ 0xC1A1] = 0xFFFF3E2A ^ 0xC1A1;
                byArray[0x5B6E ^ 0x5B6A] = 0xFFFFA4D2 ^ 0x5B6A;
                byArray[0x31F2 ^ 0x31F1] = 0x31A0 ^ 0x31F1;
                byArray[0xD841 ^ 0xD841] = 0xD85E ^ 0xD841;
                byArray[0x7EF7 ^ 0x7EFA] = 0xFFFF813E ^ 0x7EFA;
                byArray[0xF9DA ^ 0xF9D1] = 0xF984 ^ 0xF9D1;
                byArray[0xDE2B ^ 0xDE2A] = 0xDE27 ^ 0xDE2A;
                byArray[0xE0B3 ^ 0xE0B1] = 0xE0CF ^ 0xE0B1;
                byArray[0xE19F ^ 0xE19A] = 0xE19E ^ 0xE19A;
                byArray[0x250F ^ 0x2509] = 0x256E ^ 0x2509;
                byArray[0xC45D ^ 0xC453] = 0xFFFF3BC3 ^ 0xC453;
                byArray[0xED22 ^ 0xED25] = 0xFFFF12D8 ^ 0xED25;
                byArray[0xD7B8 ^ 0xD7B7] = 0xFFFF2852 ^ 0xD7B7;
                byArray[0xD786 ^ 0xD78A] = 0xFFFF283F ^ 0xD78A;
                byArray[0x10632 ^ 0x1063B] = 0x10660 ^ 0x1063B;
                byArray[0x6A98 ^ 0x6A92] = 0xFFFF9505 ^ 0x6A92;
                objectArray2[0] = byArray;
            }
            byte[] byArray = (byte[])object3[0];
            if (N == null) {
                byte[] byArray2 = new byte[0xD535 ^ 0xD515];
                byArray2[0x9550 ^ 0x9549] = 0x953C ^ 0x9549;
                byArray2[0xA9A9 ^ 0xA9A8] = 0xA9F9 ^ 0xA9A8;
                byArray2[0xD49D ^ 0xD492] = 0xFFFF2B51 ^ 0xD492;
                byArray2[0x1044 ^ 0x105B] = 0xFFFFEFC5 ^ 0x105B;
                byArray2[0x10C56 ^ 0x10C5B] = 0x10C6E ^ 0x10C5B;
                byArray2[0xA16C ^ 0xA17E] = 0xA107 ^ 0xA17E;
                byArray2[0x313D ^ 0x312A] = 0x3170 ^ 0x312A;
                byArray2[0x7259 ^ 0x725A] = 0xFFFF8DF9 ^ 0x725A;
                byArray2[0xD281 ^ 0xD29B] = 0xFFFF2D1B ^ 0xD29B;
                byArray2[0xAB6A ^ 0xAB6D] = 0xFFFF54A8 ^ 0xAB6D;
                byArray2[0x9D9D ^ 0x9D91] = 0x9DF1 ^ 0x9D91;
                byArray2[0x9AF5 ^ 0x9AFC] = 0xFFFF6575 ^ 0x9AFC;
                byArray2[0x6F36 ^ 0x6F3D] = 0x6F1D ^ 0x6F3D;
                byArray2[0x7BE2 ^ 0x7BEC] = 0xFFFF845C ^ 0x7BEC;
                byArray2[0xC80B ^ 0xC81F] = 0xFFFF37C2 ^ 0xC81F;
                byArray2[0x4C06 ^ 0x4C1B] = 0xFFFFB384 ^ 0x4C1B;
                byArray2[0x5FA9 ^ 0x5FAF] = 0x5FA0 ^ 0x5FAF;
                byArray2[0x6A1B ^ 0x6A1B] = 0x6A0F ^ 0x6A1B;
                byArray2[0x1BF4 ^ 0x1BE8] = 0x1BA1 ^ 0x1BE8;
                byArray2[0x773F ^ 0x773D] = 0xFFFF88B8 ^ 0x773D;
                byArray2[0x8FE0 ^ 0x8FFB] = 0x8F83 ^ 0x8FFB;
                byArray2[0x2026 ^ 0x203E] = 0xFFFFDF84 ^ 0x203E;
                byArray2[0xA572 ^ 0xA561] = 0xA554 ^ 0xA561;
                byArray2[0x79F ^ 0x797] = 0x7CB ^ 0x797;
                byArray2[0x141B ^ 0x140D] = 0x1403 ^ 0x140D;
                byArray2[0xBC92 ^ 0xBC97] = 0xFFFF437D ^ 0xBC97;
                byArray2[0xC889 ^ 0xC89C] = 0xFFFF3762 ^ 0xC89C;
                byArray2[0xDABF ^ 0xDAA1] = 0xDAEA ^ 0xDAA1;
                byArray2[0x92D1 ^ 0x92C1] = 0x9287 ^ 0x92C1;
                byArray2[0xF55E ^ 0xF55A] = 0xFFFF0AA7 ^ 0xF55A;
                byArray2[0x326A ^ 0x3260] = 0x3208 ^ 0x3260;
                byArray2[0x1DA7 ^ 0x1DB6] = 0xFFFFE241 ^ 0x1DB6;
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, 0, byArray3, 0, byArray.length);
                System.arraycopy(byArray2, 0, byArray3, byArray.length, byArray2.length);
                Object object4 = AdvancedRectRenderer.A()[1];
                if (object4 == null) {
                    char[] cArray = "\ufd99\u0743\ufd30\ufd9d\ufd97\ufd33\ufd2c\ufd76\ufd8d\ufd81\ufda1\ufd8a\ufd3e\ufd78\ufd28\ufda1\u075e\ufd4e".toCharArray();
                    for (int i2 = 0; i2 < 18; ++i2) {
                        int n3 = cArray[i2];
                        n3 -= 24704;
                        n3 += 51938;
                        n3 -= 31876;
                        n3 ^= 0x1C7;
                        n3 ^= 0x1A0B;
                        n3 -= 1771;
                        n3 ^= 0x89EF;
                        n3 ^= 0x6111;
                        n3 -= 35666;
                        n3 -= 21170;
                        n3 += 11636;
                        n3 += 40473;
                        n3 += 24986;
                        n3 -= 38746;
                        n3 ^= 0x6C1A;
                        cArray[i2] = (char)(n3 -= 54429);
                    }
                    object4 = AdvancedRectRenderer.A()[1] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[16];
                byArray4[12] = -122;
                byArray4[9] = -31;
                byArray4[5] = 84;
                byArray4[1] = 44;
                byArray4[7] = 108;
                byArray4[13] = -20;
                byArray4[15] = -74;
                byArray4[8] = 83;
                byArray4[4] = 51;
                byArray4[6] = -123;
                byArray4[0] = -2;
                byArray4[2] = 30;
                byArray4[10] = -79;
                byArray4[11] = 20;
                byArray4[14] = 107;
                byArray4[3] = 106;
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, 23, 256);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = AdvancedRectRenderer.A()[2];
                if (object5 == null) {
                    char[] cArray = "\u5b85\u5b81\u5b93".toCharArray();
                    for (int i3 = 0; i3 < 3; ++i3) {
                        int n4 = cArray[i3];
                        n4 -= 33681;
                        n4 -= 17697;
                        n4 += 26129;
                        n4 += 8450;
                        n4 ^= 0x3AE5;
                        n4 -= 15481;
                        n4 ^= 0x450A;
                        n4 += 52330;
                        n4 -= 16875;
                        n4 -= 51839;
                        cArray[i3] = (char)(n4 -= 25407);
                    }
                    object5 = AdvancedRectRenderer.A()[2] = new String(cArray);
                }
                N = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, 0, 16);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, 16, byArray6.length);
            Object object6 = AdvancedRectRenderer.A()[3];
            if (object6 == null) {
                char[] cArray = "\uda5a\uda66\uda6c\uda40\uda5c\uda5d\uda5c\uda40\uda6b\uda54\uda5c\uda6c\uea96\uda6b\ud9fa\uda07\uda07\ud9f2\uda01\uda08".toCharArray();
                for (int i4 = 0; i4 < 20; ++i4) {
                    int n5 = cArray[i4];
                    n5 -= 23009;
                    n5 -= 39057;
                    n5 ^= 0xC824;
                    n5 += 22502;
                    n5 += 50166;
                    n5 ^= 0x60F6;
                    n5 ^= 0xB4A7;
                    n5 ^= 0x4C1B;
                    n5 ^= 0xC55C;
                    cArray[i4] = (char)(n5 ^= 0x16FF);
                }
                object6 = AdvancedRectRenderer.A()[3] = new String(cArray);
            }
            Cipher cipher = Cipher.getInstance((String)object6);
            cipher.init(2, (Key)((SecretKey)N), new IvParameterSpec(byArray7));
            byte[] byArray9 = cipher.doFinal(byArray8);
            object2 = new String(byArray9, StandardCharsets.UTF_8);
        }
        return object2;
    }

    private static Object[] A() {
        Object[] objectArray = O;
        if (O == null) {
            O = new Object[4];
            objectArray = O;
        }
        return objectArray;
    }

    public static void b() {
        p = new int[0x7BA4 ^ 0x7A34];
        AdvancedRectRenderer.p[0x8F34 ^ 0x8FCE] = 0xFFFF702E ^ 0x8FCE;
        AdvancedRectRenderer.p[0x4E2F ^ 0x4E21] = 0xFFFFB187 ^ 0x4E21;
        AdvancedRectRenderer.p[0x4658 ^ 0x474C] = 0xFFFFB883 ^ 0x474C;
        AdvancedRectRenderer.p[0x10B8 ^ 0x103C] = 0x1012 ^ 0x103C;
        AdvancedRectRenderer.p[0x103A5 ^ 0x1036F] = 0x10374 ^ 0x1036F;
        AdvancedRectRenderer.p[0x5C7B ^ 0x5D17] = 0xFFFFA2EE ^ 0x5D17;
        AdvancedRectRenderer.p[0x30C8 ^ 0x30B9] = 0x3097 ^ 0x30B9;
        AdvancedRectRenderer.p[0x3D5F ^ 0x3D02] = 0x3D0E ^ 0x3D02;
        AdvancedRectRenderer.p[0xA836 ^ 0xA915] = 0xFFFF56E2 ^ 0xA915;
        AdvancedRectRenderer.p[0xD353 ^ 0xD337] = 0xD32F ^ 0xD337;
        AdvancedRectRenderer.p[0xABAB ^ 0xAB1C] = 0xFFFF546E ^ 0xAB1C;
        AdvancedRectRenderer.p[0x1387 ^ 0x1207] = 0x1266 ^ 0x1207;
        AdvancedRectRenderer.p[0xC842 ^ 0xC848] = 0xC849 ^ 0xC848;
        AdvancedRectRenderer.p[0x1011D ^ 0x10159] = 0xFFFEFE93 ^ 0x10159;
        AdvancedRectRenderer.p[0x7A7E ^ 0x7A04] = 0xFFFF85E7 ^ 0x7A04;
        AdvancedRectRenderer.p[0x2B48 ^ 0x2BF9] = 0x2B68 ^ 0x2BF9;
        AdvancedRectRenderer.p[0x79FD ^ 0x799E] = 0x79D2 ^ 0x799E;
        AdvancedRectRenderer.p[0xF185 ^ 0xF1A6] = 0xFFFF0E15 ^ 0xF1A6;
        AdvancedRectRenderer.p[0x10EA2 ^ 0x10EBA] = 0xFFFEF124 ^ 0x10EBA;
        AdvancedRectRenderer.p[0xAC90 ^ 0xACFE] = 0xAC97 ^ 0xACFE;
        AdvancedRectRenderer.p[0x17F ^ 0x1DB] = 0xFFFFFE2D ^ 0x1DB;
        AdvancedRectRenderer.p[0xBBBB ^ 0xBB5C] = 0xBB5E ^ 0xBB5C;
        AdvancedRectRenderer.p[0x5224 ^ 0x5227] = 0xFFFFADF8 ^ 0x5227;
        AdvancedRectRenderer.p[0xC1B0 ^ 0xC0B8] = 0xC0CC ^ 0xC0B8;
        AdvancedRectRenderer.p[0xA7AE ^ 0xA757] = 0xFFFF58DA ^ 0xA757;
        AdvancedRectRenderer.p[0xAA8C ^ 0xAB99] = 0xFFFF542E ^ 0xAB99;
        AdvancedRectRenderer.p[0x3475 ^ 0x342C] = 0x3455 ^ 0x342C;
        AdvancedRectRenderer.p[0x869C ^ 0x871D] = 0x8753 ^ 0x871D;
        AdvancedRectRenderer.p[0x7EE1 ^ 0x7E0C] = 0xFFFF81F2 ^ 0x7E0C;
        AdvancedRectRenderer.p[0xE610 ^ 0xE776] = 0xFFFF189E ^ 0xE776;
        AdvancedRectRenderer.p[0x8140 ^ 0x81BC] = 0xFFFF7E03 ^ 0x81BC;
        AdvancedRectRenderer.p[0xE4F1 ^ 0xE45F] = 0xFFFF1B3B ^ 0xE45F;
        AdvancedRectRenderer.p[0xFE1E ^ 0xFF25] = 0xFFFF00A7 ^ 0xFF25;
        AdvancedRectRenderer.p[0x9A2F ^ 0x9AEB] = 0x9A85 ^ 0x9AEB;
        AdvancedRectRenderer.p[0x596E ^ 0x596B] = 0x5961 ^ 0x596B;
        AdvancedRectRenderer.p[0x2D15 ^ 0x2D2B] = 0xFFFFD2EA ^ 0x2D2B;
        AdvancedRectRenderer.p[0x9BC7 ^ 0x9B84] = 0xFFFF640A ^ 0x9B84;
        AdvancedRectRenderer.p[0x4352 ^ 0x424F] = 0xFFFFBD80 ^ 0x424F;
        AdvancedRectRenderer.p[0xB6B3 ^ 0xB735] = 0xFFFF489D ^ 0xB735;
        AdvancedRectRenderer.p[0x10ACD ^ 0x10B40] = 0xFFFEF494 ^ 0x10B40;
        AdvancedRectRenderer.p[0xF974 ^ 0xF80A] = 0xF841 ^ 0xF80A;
        AdvancedRectRenderer.p[0x99DA ^ 0x98F8] = 0x98AB ^ 0x98F8;
        AdvancedRectRenderer.p[0x3025 ^ 0x30FD] = 0xFFFFCF5A ^ 0x30FD;
        AdvancedRectRenderer.p[0xF76B ^ 0xF7AE] = 0xFFFF08F3 ^ 0xF7AE;
        AdvancedRectRenderer.p[0x9D61 ^ 0x9D9E] = 0x9DD7 ^ 0x9D9E;
        AdvancedRectRenderer.p[0xD22A ^ 0xD325] = 0xD30B ^ 0xD325;
        AdvancedRectRenderer.p[0x97C4 ^ 0x9743] = 0x970E ^ 0x9743;
        AdvancedRectRenderer.p[0xB828 ^ 0xB904] = 0xB91C ^ 0xB904;
        AdvancedRectRenderer.p[0xB9DA ^ 0xB88E] = 0xFFFF474F ^ 0xB88E;
        AdvancedRectRenderer.p[0xE26F ^ 0xE344] = 0xFFFF1CA2 ^ 0xE344;
        AdvancedRectRenderer.p[0x95DA ^ 0x94D7] = 0xFFFF6B03 ^ 0x94D7;
        AdvancedRectRenderer.p[0x4BFA ^ 0x4AE5] = 0xFFFFB532 ^ 0x4AE5;
        AdvancedRectRenderer.p[0xFB16 ^ 0xFBBD] = 0xFA8A ^ 0xFBBD;
        AdvancedRectRenderer.p[0x5C29 ^ 0x5D31] = 0x5D43 ^ 0x5D31;
        AdvancedRectRenderer.p[0xB79C ^ 0xB6E0] = 0xB6D1 ^ 0xB6E0;
        AdvancedRectRenderer.p[0x10321 ^ 0x10323] = 0x10328 ^ 0x10323;
        AdvancedRectRenderer.p[0xA1F5 ^ 0xA09D] = 0xFFFF5F28 ^ 0xA09D;
        AdvancedRectRenderer.p[0xD1BF ^ 0xD18A] = 0xD19D ^ 0xD18A;
        AdvancedRectRenderer.p[0x3318 ^ 0x3365] = 0xFFFFCC84 ^ 0x3365;
        AdvancedRectRenderer.p[0x7A70 ^ 0x7A95] = 0x7AD9 ^ 0x7A95;
        AdvancedRectRenderer.p[0x45E7 ^ 0x45F9] = 0x4592 ^ 0x45F9;
        AdvancedRectRenderer.p[0x3EAB ^ 0x3FDA] = 0x3FBE ^ 0x3FDA;
        AdvancedRectRenderer.p[0x6215 ^ 0x6234] = 0x6245 ^ 0x6234;
        AdvancedRectRenderer.p[0xCDA8 ^ 0xCCA1] = 0xFFFF3336 ^ 0xCCA1;
        AdvancedRectRenderer.p[0x104D7 ^ 0x105D3] = 0x105C9 ^ 0x105D3;
        AdvancedRectRenderer.p[0x3464 ^ 0x3442] = 0x345E ^ 0x3442;
        AdvancedRectRenderer.p[0x698A ^ 0x68AC] = 0xFFFF977C ^ 0x68AC;
        AdvancedRectRenderer.p[0x9DC3 ^ 0x9CE6] = 0x9C4E ^ 0x9CE6;
        AdvancedRectRenderer.p[0x78AE ^ 0x79ED] = 0xFFFF8651 ^ 0x79ED;
        AdvancedRectRenderer.p[0xD706 ^ 0xD633] = 0xD602 ^ 0xD633;
        AdvancedRectRenderer.p[0xC85E ^ 0xC893] = 0xC8B9 ^ 0xC893;
        AdvancedRectRenderer.p[0xE8B ^ 0xFD0] = 0xFE3 ^ 0xFD0;
        AdvancedRectRenderer.p[0xBCCB ^ 0xBC80] = 0xFFFF4370 ^ 0xBC80;
        AdvancedRectRenderer.p[0x40CD ^ 0x41E3] = 0x41C4 ^ 0x41E3;
        AdvancedRectRenderer.p[0xE8DE ^ 0xE864] = 0xE8BE ^ 0xE864;
        AdvancedRectRenderer.p[0xAB45 ^ 0xAB82] = 0xFFFF5410 ^ 0xAB82;
        AdvancedRectRenderer.p[0x9B19 ^ 0x9A13] = 0x9A45 ^ 0x9A13;
        AdvancedRectRenderer.p[0xD11 ^ 0xD15] = 0xD3C ^ 0xD15;
        AdvancedRectRenderer.p[0xE0FB ^ 0xE172] = 0xFFFF1EC8 ^ 0xE172;
        AdvancedRectRenderer.p[0xDF2 ^ 0xD2F] = 0xD6D ^ 0xD2F;
        AdvancedRectRenderer.p[0x3F44 ^ 0x3E65] = 0xFFFFC1BD ^ 0x3E65;
        AdvancedRectRenderer.p[0x20A2 ^ 0x20F1] = 0xFFFFDF57 ^ 0x20F1;
        AdvancedRectRenderer.p[0xB0DF ^ 0xB091] = 0xB0B6 ^ 0xB091;
        AdvancedRectRenderer.p[0x2D60 ^ 0x2C7B] = 0x2C21 ^ 0x2C7B;
        AdvancedRectRenderer.p[0x17DE ^ 0x17C2] = 0x17A1 ^ 0x17C2;
        AdvancedRectRenderer.p[0x664A ^ 0x6721] = 0x6777 ^ 0x6721;
        AdvancedRectRenderer.p[0x1034C ^ 0x1021F] = 0xFFFEFDEB ^ 0x1021F;
        AdvancedRectRenderer.p[0xD3BD ^ 0xD315] = 0xD218 ^ 0xD315;
        AdvancedRectRenderer.p[0xAC74 ^ 0xADF8] = 0xFFFF5260 ^ 0xADF8;
        AdvancedRectRenderer.p[0x754F ^ 0x75DE] = 0xFFFF8A45 ^ 0x75DE;
        AdvancedRectRenderer.p[0x6B41 ^ 0x6A57] = 0x6AD1 ^ 0x6A57;
        AdvancedRectRenderer.p[0x109DD ^ 0x10966] = 0xFFFEF6D2 ^ 0x10966;
        AdvancedRectRenderer.p[0x4357 ^ 0x43B9] = 0xFFFFBC0D ^ 0x43B9;
        AdvancedRectRenderer.p[0x3077 ^ 0x311E] = 0xFFFFCEEC ^ 0x311E;
        AdvancedRectRenderer.p[0x5D7A ^ 0x5DCC] = 0x5DE2 ^ 0x5DCC;
        AdvancedRectRenderer.p[0xE6FC ^ 0xE7B7] = 0xE7C9 ^ 0xE7B7;
        AdvancedRectRenderer.p[0xCA02 ^ 0xCB4F] = 0xCB1E ^ 0xCB4F;
        AdvancedRectRenderer.p[0xC15 ^ 0xC23] = 0xC00 ^ 0xC23;
        AdvancedRectRenderer.p[0xCF96 ^ 0xCFBF] = 0xCFF2 ^ 0xCFBF;
        AdvancedRectRenderer.p[0x96B0 ^ 0x9652] = 0x9638 ^ 0x9652;
        AdvancedRectRenderer.p[0xD10C ^ 0xD123] = 0xD13E ^ 0xD123;
        AdvancedRectRenderer.p[0x85FD ^ 0x84AC] = 0x84F2 ^ 0x84AC;
        AdvancedRectRenderer.p[0xAED7 ^ 0xAE52] = 0xAE76 ^ 0xAE52;
        AdvancedRectRenderer.p[0xC000 ^ 0xC155] = 0xC14D ^ 0xC155;
        AdvancedRectRenderer.p[0xE6CC ^ 0xE7F8] = 0xE799 ^ 0xE7F8;
        AdvancedRectRenderer.p[0xE356 ^ 0xE32E] = 0xE340 ^ 0xE32E;
        AdvancedRectRenderer.p[0x42C ^ 0x56E] = 0xFFFFFA8E ^ 0x56E;
        AdvancedRectRenderer.p[0x6506 ^ 0x647C] = 0x646F ^ 0x647C;
        AdvancedRectRenderer.p[0xE85E ^ 0xE82B] = 0xE82D ^ 0xE82B;
        AdvancedRectRenderer.p[0xEB31 ^ 0xEBEE] = 0xFFFF1479 ^ 0xEBEE;
        AdvancedRectRenderer.p[0x3685 ^ 0x36F3] = 0x36AA ^ 0x36F3;
        AdvancedRectRenderer.p[0x91A1 ^ 0x9121] = 0xFFFF6E91 ^ 0x9121;
        AdvancedRectRenderer.p[0x733D ^ 0x7244] = 0x7267 ^ 0x7244;
        AdvancedRectRenderer.p[0xAF2B ^ 0xAE5B] = 0xAECC ^ 0xAE5B;
        AdvancedRectRenderer.p[0x2CB6 ^ 0x2DF6] = 0xFFFFD217 ^ 0x2DF6;
        AdvancedRectRenderer.p[0x3F18 ^ 0x3F3D] = 0x3F14 ^ 0x3F3D;
        AdvancedRectRenderer.p[0x2FF2 ^ 0x2FB4] = 0x2F8E ^ 0x2FB4;
        AdvancedRectRenderer.p[0x3E0C ^ 0x3EA0] = 0x3EF6 ^ 0x3EA0;
        AdvancedRectRenderer.p[0x3E94 ^ 0x3F8E] = 0x3F94 ^ 0x3F8E;
        AdvancedRectRenderer.p[0x7B12 ^ 0x7B1F] = 0x7B1A ^ 0x7B1F;
        AdvancedRectRenderer.p[0xA043 ^ 0xA07E] = 0xA045 ^ 0xA07E;
        AdvancedRectRenderer.p[0xCD38 ^ 0xCD38] = 0xCD65 ^ 0xCD38;
        AdvancedRectRenderer.p[0x34ED ^ 0x34BA] = 0xFFFFCB70 ^ 0x34BA;
        AdvancedRectRenderer.p[0x4D54 ^ 0x4D1C] = 0x4DB1 ^ 0x4D1C;
        AdvancedRectRenderer.p[0xD56C ^ 0xD5CB] = 0xFFFF2A71 ^ 0xD5CB;
        AdvancedRectRenderer.p[0x450C ^ 0x45E4] = 0xFFFFBA41 ^ 0x45E4;
        AdvancedRectRenderer.p[0xB7A6 ^ 0xB696] = 0xB6CB ^ 0xB696;
        AdvancedRectRenderer.p[0xC1D2 ^ 0xC057] = 0xFFFF3FE3 ^ 0xC057;
        AdvancedRectRenderer.p[0xDDAD ^ 0xDCF7] = 0xFFFF235B ^ 0xDCF7;
        AdvancedRectRenderer.p[0xD26B ^ 0xD29F] = 0xD2A8 ^ 0xD29F;
        AdvancedRectRenderer.p[0x8C19 ^ 0x8D4B] = 0x8D15 ^ 0x8D4B;
        AdvancedRectRenderer.p[0xA15E ^ 0xA028] = 0xFFFF5FC8 ^ 0xA028;
        AdvancedRectRenderer.p[0xCE01 ^ 0xCEC9] = 0xCE6B ^ 0xCEC9;
        AdvancedRectRenderer.p[0x10558 ^ 0x10518] = 0x10508 ^ 0x10518;
        AdvancedRectRenderer.p[0x95DD ^ 0x9568] = 0xFFFF6AF6 ^ 0x9568;
        AdvancedRectRenderer.p[0x732C ^ 0x73FF] = 0xFFFF8C1D ^ 0x73FF;
        AdvancedRectRenderer.p[0xFFFA ^ 0xFF62] = 0xFF38 ^ 0xFF62;
        AdvancedRectRenderer.p[0x10DF0 ^ 0x10D2B] = 0x10D3C ^ 0x10D2B;
        AdvancedRectRenderer.p[0x255B ^ 0x25BF] = 0xFFFFDA53 ^ 0x25BF;
        AdvancedRectRenderer.p[0x9493 ^ 0x9436] = 0x9413 ^ 0x9436;
        AdvancedRectRenderer.p[0x8732 ^ 0x8601] = 0x862A ^ 0x8601;
        AdvancedRectRenderer.p[0xBFEA ^ 0xBE6D] = 0xBE71 ^ 0xBE6D;
        AdvancedRectRenderer.p[0x2BAB ^ 0x2AB7] = 0xFFFFD5CF ^ 0x2AB7;
        AdvancedRectRenderer.p[0x725A ^ 0x72A1] = 0xFFFF8D9D ^ 0x72A1;
        AdvancedRectRenderer.p[0x295 ^ 0x27C] = 0xFFFFFD3E ^ 0x27C;
        AdvancedRectRenderer.p[0x495E ^ 0x4873] = 0xFFFFB791 ^ 0x4873;
        AdvancedRectRenderer.p[0x557B ^ 0x5568] = 0x5519 ^ 0x5568;
        AdvancedRectRenderer.p[0x294 ^ 0x3BD] = 0x3C1 ^ 0x3BD;
        AdvancedRectRenderer.p[0x7984 ^ 0x780B] = 0xFFFF8782 ^ 0x780B;
        AdvancedRectRenderer.p[0x2926 ^ 0x2952] = 0x2959 ^ 0x2952;
        AdvancedRectRenderer.p[0xAD3C ^ 0xAD2C] = 0xAD6E ^ 0xAD2C;
        AdvancedRectRenderer.p[0x77E5 ^ 0x779E] = 0x770F ^ 0x779E;
        AdvancedRectRenderer.p[0xCEBA ^ 0xCFBA] = 0xCFF7 ^ 0xCFBA;
        AdvancedRectRenderer.p[0x3927 ^ 0x381F] = 0xFFFFC7B1 ^ 0x381F;
        AdvancedRectRenderer.p[0xC1C4 ^ 0xC1A8] = 0xFFFF3E41 ^ 0xC1A8;
        AdvancedRectRenderer.p[0x9894 ^ 0x98FE] = 0xFFFF6731 ^ 0x98FE;
        AdvancedRectRenderer.p[0xEA3E ^ 0xEB4B] = 0xEB16 ^ 0xEB4B;
        AdvancedRectRenderer.p[0x101A7 ^ 0x1002C] = 0x10011 ^ 0x1002C;
        AdvancedRectRenderer.p[0x9298 ^ 0x924A] = 0xFFFF6D86 ^ 0x924A;
        AdvancedRectRenderer.p[0x1781 ^ 0x16F9] = 0xFFFFE91C ^ 0x16F9;
        AdvancedRectRenderer.p[0x5A4F ^ 0x5A7F] = 0x5A45 ^ 0x5A7F;
        AdvancedRectRenderer.p[0xADDF ^ 0xADEC] = 0xADAD ^ 0xADEC;
        AdvancedRectRenderer.p[0xDFFD ^ 0xDED7] = 0xDED8 ^ 0xDED7;
        AdvancedRectRenderer.p[0xC2D4 ^ 0xC2EB] = 0xC2EE ^ 0xC2EB;
        AdvancedRectRenderer.p[0xFEF ^ 0xFD5] = 0xFA5 ^ 0xFD5;
        AdvancedRectRenderer.p[0x55AE ^ 0x5498] = 0x54F4 ^ 0x5498;
        AdvancedRectRenderer.p[0xC81C ^ 0xC882] = 0xC8EF ^ 0xC882;
        AdvancedRectRenderer.p[0xB29A ^ 0xB389] = 0xFFFF4C05 ^ 0xB389;
        AdvancedRectRenderer.p[0xE2E8 ^ 0xE3B7] = 0xFFFF1C55 ^ 0xE3B7;
        AdvancedRectRenderer.p[0x1725 ^ 0x178C] = 0x17AB ^ 0x178C;
        AdvancedRectRenderer.p[0xEBE0 ^ 0xEB2F] = 0xFFFF14E2 ^ 0xEB2F;
        AdvancedRectRenderer.p[0x10BC9 ^ 0x10B0F] = 0xFFFEF4B0 ^ 0x10B0F;
        AdvancedRectRenderer.p[0xA2E6 ^ 0xA3EA] = 0xA3BC ^ 0xA3EA;
        AdvancedRectRenderer.p[0x3801 ^ 0x3887] = 0xFFFFC74D ^ 0x3887;
        AdvancedRectRenderer.p[0xFAB0 ^ 0xFA7C] = 0xFFFF0593 ^ 0xFA7C;
        AdvancedRectRenderer.p[0xB1CA ^ 0xB1CC] = 0xFFFF4E5C ^ 0xB1CC;
        AdvancedRectRenderer.p[0xCEF4 ^ 0xCFAA] = 0xCF99 ^ 0xCFAA;
        AdvancedRectRenderer.p[0xD80B ^ 0xD8C9] = 0xD8E4 ^ 0xD8C9;
        AdvancedRectRenderer.p[0x10750 ^ 0x1065B] = 0x1065A ^ 0x1065B;
        AdvancedRectRenderer.p[0x3E2B ^ 0x3F39] = 0x3F57 ^ 0x3F39;
        AdvancedRectRenderer.p[0x2947 ^ 0x29E4] = 0x29B0 ^ 0x29E4;
        AdvancedRectRenderer.p[0x4569 ^ 0x4552] = 0x457D ^ 0x4552;
        AdvancedRectRenderer.p[0x68D3 ^ 0x69C4] = 0xFFFF962B ^ 0x69C4;
        AdvancedRectRenderer.p[0x132A ^ 0x1217] = 0x1218 ^ 0x1217;
        AdvancedRectRenderer.p[0x1C19 ^ 0x1C95] = 0xFFFFE327 ^ 0x1C95;
        AdvancedRectRenderer.p[0x5646 ^ 0x56A0] = 0xFFFFA903 ^ 0x56A0;
        AdvancedRectRenderer.p[0xB6CC ^ 0xB671] = 0xB6E9 ^ 0xB671;
        AdvancedRectRenderer.p[0xC6FD ^ 0xC603] = 0xC603 ^ 0xC603;
        AdvancedRectRenderer.p[0x2DEF ^ 0x2CD6] = 0x2CD5 ^ 0x2CD6;
        AdvancedRectRenderer.p[0x52DB ^ 0x53EC] = 0x53B8 ^ 0x53EC;
        AdvancedRectRenderer.p[0xA9C8 ^ 0xA9AA] = 0xA9D0 ^ 0xA9AA;
        AdvancedRectRenderer.p[0x5EE4 ^ 0x5E46] = 0xFFFFA1B2 ^ 0x5E46;
        AdvancedRectRenderer.p[0x9C58 ^ 0x9CF2] = 0xFFFF6373 ^ 0x9CF2;
        AdvancedRectRenderer.p[0xCDAC ^ 0xCDEE] = 0xCDBE ^ 0xCDEE;
        AdvancedRectRenderer.p[0x805D ^ 0x80D6] = 0xFFFF7F0F ^ 0x80D6;
        AdvancedRectRenderer.p[0x2929 ^ 0x29FC] = 0xFFFFD671 ^ 0x29FC;
        AdvancedRectRenderer.p[0x9194 ^ 0x9155] = 0xFFFF6EF6 ^ 0x9155;
        AdvancedRectRenderer.p[0x93E8 ^ 0x92F6] = 0x9282 ^ 0x92F6;
        AdvancedRectRenderer.p[0xF306 ^ 0xF347] = 0xF305 ^ 0xF347;
        AdvancedRectRenderer.p[0x37F8 ^ 0x37AE] = 0xFFFFC874 ^ 0x37AE;
        AdvancedRectRenderer.p[0x59FD ^ 0x592D] = 0xFFFFA684 ^ 0x592D;
        AdvancedRectRenderer.p[0x54D1 ^ 0x54D9] = 0xFFFFAB6D ^ 0x54D9;
        AdvancedRectRenderer.p[0x3272 ^ 0x3311] = 0xFFFFCCF9 ^ 0x3311;
        AdvancedRectRenderer.p[0x1E00 ^ 0x1E45] = 0xFFFFE18C ^ 0x1E45;
        AdvancedRectRenderer.p[0xF877 ^ 0xF816] = 0xF85F ^ 0xF816;
        AdvancedRectRenderer.p[0x45A3 ^ 0x4577] = 0x45ED ^ 0x4577;
        AdvancedRectRenderer.p[0x10AF8 ^ 0x10AD3] = 0x10AD6 ^ 0x10AD3;
        AdvancedRectRenderer.p[0x65AF ^ 0x65E2] = 0xFFFF9A04 ^ 0x65E2;
        AdvancedRectRenderer.p[0xEAC2 ^ 0xEA63] = 0xEA57 ^ 0xEA63;
        AdvancedRectRenderer.p[0x3791 ^ 0x373C] = 0x3740 ^ 0x373C;
        AdvancedRectRenderer.p[0x9932 ^ 0x9840] = 0xFFFF6794 ^ 0x9840;
        AdvancedRectRenderer.p[0x32B0 ^ 0x3281] = 0x32A8 ^ 0x3281;
        AdvancedRectRenderer.p[0xBAB3 ^ 0xBB9B] = 0xBBA2 ^ 0xBB9B;
        AdvancedRectRenderer.p[0x1C00 ^ 0x1D10] = 0x1DFF ^ 0x1D10;
        AdvancedRectRenderer.p[0x102D6 ^ 0x10268] = 0xFFFEFDB7 ^ 0x10268;
        AdvancedRectRenderer.p[0x23BE ^ 0x22DF] = 0xFFFFDD33 ^ 0x22DF;
        AdvancedRectRenderer.p[0x3CAF ^ 0x3CFB] = 0x3CA8 ^ 0x3CFB;
        AdvancedRectRenderer.p[0x5D30 ^ 0x5D90] = 0x5DD3 ^ 0x5D90;
        AdvancedRectRenderer.p[0xF622 ^ 0xF710] = 0xF765 ^ 0xF710;
        AdvancedRectRenderer.p[0x4DB9 ^ 0x4DC7] = 0xFFFFB250 ^ 0x4DC7;
        AdvancedRectRenderer.p[0x424D ^ 0x434B] = 0xFFFFBCD8 ^ 0x434B;
        AdvancedRectRenderer.p[0x27F1 ^ 0x2781] = 0xFFFFD829 ^ 0x2781;
        AdvancedRectRenderer.p[0x1BA4 ^ 0x1AFC] = 0x1AD9 ^ 0x1AFC;
        AdvancedRectRenderer.p[0x7DC1 ^ 0x7CB2] = 0x7CB1 ^ 0x7CB2;
        AdvancedRectRenderer.p[0xE9EA ^ 0xE887] = 0xFFFF1765 ^ 0xE887;
        AdvancedRectRenderer.p[0xC4E ^ 0xD74] = 0xFFFFF2F6 ^ 0xD74;
        AdvancedRectRenderer.p[0x614D ^ 0x618D] = 0xFFFF9E30 ^ 0x618D;
        AdvancedRectRenderer.p[0x774D ^ 0x77F5] = 0x77B4 ^ 0x77F5;
        AdvancedRectRenderer.p[0x10C84 ^ 0x10CEF] = 0x10CDB ^ 0x10CEF;
        AdvancedRectRenderer.p[0x36F6 ^ 0x3772] = 0xFFFFC8F5 ^ 0x3772;
        AdvancedRectRenderer.p[0x9F58 ^ 0x9F12] = 0x9F2A ^ 0x9F12;
        AdvancedRectRenderer.p[0x9DF3 ^ 0x9DE5] = 0x9D83 ^ 0x9DE5;
        AdvancedRectRenderer.p[0xBD74 ^ 0xBDF7] = 0xFFFF4234 ^ 0xBDF7;
        AdvancedRectRenderer.p[0x324D ^ 0x3297] = 0x32E2 ^ 0x3297;
        AdvancedRectRenderer.p[0xCEF0 ^ 0xCF94] = 0xCF85 ^ 0xCF94;
        AdvancedRectRenderer.p[0xE0A8 ^ 0xE1CA] = 0xE1CC ^ 0xE1CA;
        AdvancedRectRenderer.p[0xF9B5 ^ 0xF8E8] = 0xFFFF0775 ^ 0xF8E8;
        AdvancedRectRenderer.p[0xCE1A ^ 0xCF55] = 0xCFC5 ^ 0xCF55;
        AdvancedRectRenderer.p[0x654F ^ 0x65C6] = 0xFFFF9A40 ^ 0x65C6;
        AdvancedRectRenderer.p[0x9B42 ^ 0x9B3D] = 0x9B6F ^ 0x9B3D;
        AdvancedRectRenderer.p[0xA26F ^ 0xA35E] = 0xA3FE ^ 0xA35E;
        AdvancedRectRenderer.p[0x51ED ^ 0x50E3] = 0xFFFFAF1D ^ 0x50E3;
        AdvancedRectRenderer.p[0xFD78 ^ 0xFC2E] = 0xFC7A ^ 0xFC2E;
        AdvancedRectRenderer.p[0x9249 ^ 0x925C] = 0x9273 ^ 0x925C;
        AdvancedRectRenderer.p[0x28FD ^ 0x284D] = 0xFFFFD7E8 ^ 0x284D;
        AdvancedRectRenderer.p[0xD7A9 ^ 0xD68E] = 0xD6C1 ^ 0xD68E;
        AdvancedRectRenderer.p[0xC460 ^ 0xC479] = 0xC421 ^ 0xC479;
        AdvancedRectRenderer.p[0x63C2 ^ 0x63EA] = 0xFFFF9C63 ^ 0x63EA;
        AdvancedRectRenderer.p[0xDF8 ^ 0xD08] = 0xFFFFF2D1 ^ 0xD08;
        AdvancedRectRenderer.p[0x56C2 ^ 0x57ED] = 0x57DB ^ 0x57ED;
        AdvancedRectRenderer.p[0x8EE6 ^ 0x8EC6] = 0x8EC4 ^ 0x8EC6;
        AdvancedRectRenderer.p[0x1EDC ^ 0x1EDB] = 0xFFFFE107 ^ 0x1EDB;
        AdvancedRectRenderer.p[0x67C7 ^ 0x67AA] = 0x678B ^ 0x67AA;
        AdvancedRectRenderer.p[0x5C0F ^ 0x5CB3] = 0x5C9D ^ 0x5CB3;
        AdvancedRectRenderer.p[0x1903 ^ 0x197A] = 0xFFFFE6B4 ^ 0x197A;
        AdvancedRectRenderer.p[0xF6E1 ^ 0xF663] = 0xF61B ^ 0xF663;
        AdvancedRectRenderer.p[0xA0C7 ^ 0xA1DE] = 0xA1BE ^ 0xA1DE;
        AdvancedRectRenderer.p[0x1A3E ^ 0x1A8D] = 0x1AB1 ^ 0x1A8D;
        AdvancedRectRenderer.p[0x62FD ^ 0x6292] = 0xFFFF9D29 ^ 0x6292;
        AdvancedRectRenderer.p[0x3F0C ^ 0x3E63] = 0xFFFFC1F4 ^ 0x3E63;
        AdvancedRectRenderer.p[0x1058 ^ 0x1166] = 0xFFFFEEDC ^ 0x1166;
        AdvancedRectRenderer.p[0x10A02 ^ 0x10AF0] = 0x10AFE ^ 0x10AF0;
        AdvancedRectRenderer.p[0x6B52 ^ 0x6B8B] = 0xFFFF946F ^ 0x6B8B;
        AdvancedRectRenderer.p[0x4450 ^ 0x44B3] = 0x44E7 ^ 0x44B3;
        AdvancedRectRenderer.p[0x8387 ^ 0x8367] = 0xFFFF7C89 ^ 0x8367;
        AdvancedRectRenderer.p[0xC0D0 ^ 0xC097] = 0xFFFF3F37 ^ 0xC097;
        AdvancedRectRenderer.p[0x45F5 ^ 0x45CD] = 0x45D7 ^ 0x45CD;
        AdvancedRectRenderer.p[0x16DE ^ 0x1798] = 0x17F9 ^ 0x1798;
        AdvancedRectRenderer.p[0x69F3 ^ 0x696E] = 0xFFFF96E8 ^ 0x696E;
        AdvancedRectRenderer.p[0x7FF5 ^ 0x7F6C] = 0xFFFF8092 ^ 0x7F6C;
        AdvancedRectRenderer.p[0x178C ^ 0x17D3] = 0xFFFFE83B ^ 0x17D3;
        AdvancedRectRenderer.p[0x10691 ^ 0x106E2] = 0x106B3 ^ 0x106E2;
        AdvancedRectRenderer.p[0x3755 ^ 0x37DB] = 0x3782 ^ 0x37DB;
        AdvancedRectRenderer.p[0x984F ^ 0x9881] = 0xFFFF67CF ^ 0x9881;
        AdvancedRectRenderer.p[0x5984 ^ 0x58F9] = 0x58DA ^ 0x58F9;
        AdvancedRectRenderer.p[0xABED ^ 0xAABA] = 0xFFFF5558 ^ 0xAABA;
        AdvancedRectRenderer.p[0x921F ^ 0x9253] = 0xFFFF6DAE ^ 0x9253;
        AdvancedRectRenderer.p[0xC9B6 ^ 0xC889] = 0xC8D4 ^ 0xC889;
        AdvancedRectRenderer.p[0xA712 ^ 0xA793] = 0xFFFF5881 ^ 0xA793;
        AdvancedRectRenderer.p[0xD51E ^ 0xD494] = 0xD4C3 ^ 0xD494;
        AdvancedRectRenderer.p[0x5C97 ^ 0x5C40] = 0xFFFFA38F ^ 0x5C40;
        AdvancedRectRenderer.p[0xE434 ^ 0xE461] = 0xFFFF1BFC ^ 0xE461;
        AdvancedRectRenderer.p[0x3FC7 ^ 0x3F2D] = 0xFFFFC0A7 ^ 0x3F2D;
        AdvancedRectRenderer.p[0xF1F7 ^ 0xF079] = 0xFFFF0FF2 ^ 0xF079;
        AdvancedRectRenderer.p[0x7AC9 ^ 0x7AEB] = 0xFFFF8510 ^ 0x7AEB;
        AdvancedRectRenderer.p[0xA4C4 ^ 0xA41A] = 0xFFFF5BC3 ^ 0xA41A;
        AdvancedRectRenderer.p[0x5430 ^ 0x5531] = 0x556D ^ 0x5531;
        AdvancedRectRenderer.p[0x120E ^ 0x12C5] = 0xFFFFED06 ^ 0x12C5;
        AdvancedRectRenderer.p[0x51E ^ 0x5AA] = 0xFFFFFADA ^ 0x5AA;
        AdvancedRectRenderer.p[0x7F0D ^ 0x7E1C] = 0xFFFF8198 ^ 0x7E1C;
        AdvancedRectRenderer.p[0x3B25 ^ 0x3B77] = 0xFFFFC48B ^ 0x3B77;
        AdvancedRectRenderer.p[0x82D6 ^ 0x823A] = 0x8274 ^ 0x823A;
        AdvancedRectRenderer.p[0x4727 ^ 0x47BB] = 0x474F ^ 0x47BB;
        AdvancedRectRenderer.p[0x8F54 ^ 0x8F88] = 0x8FD2 ^ 0x8F88;
        AdvancedRectRenderer.p[0xA21D ^ 0xA2A4] = 0xFFFF5D17 ^ 0xA2A4;
        AdvancedRectRenderer.p[0x524F ^ 0x5328] = 0x536B ^ 0x5328;
        AdvancedRectRenderer.p[0x10316 ^ 0x10376] = 0x10304 ^ 0x10376;
        AdvancedRectRenderer.p[0xBB89 ^ 0xBA8E] = 0xBA51 ^ 0xBA8E;
        AdvancedRectRenderer.p[0xF3CE ^ 0xF3FC] = 0xF3E5 ^ 0xF3FC;
        AdvancedRectRenderer.p[0x1682 ^ 0x16A5] = 0x1622 ^ 0x16A5;
        AdvancedRectRenderer.p[0x927E ^ 0x93FC] = 0x93E2 ^ 0x93FC;
        AdvancedRectRenderer.p[0xB0AA ^ 0xB0BB] = 0xB0EF ^ 0xB0BB;
        AdvancedRectRenderer.p[0x8A5F ^ 0x8AC8] = 0x8A8B ^ 0x8AC8;
        AdvancedRectRenderer.p[0xDB8C ^ 0xDB1A] = 0xFFFF24A4 ^ 0xDB1A;
        AdvancedRectRenderer.p[0xC80 ^ 0xCAA] = 0xFFFFF35A ^ 0xCAA;
        AdvancedRectRenderer.p[0x10892 ^ 0x109C2] = 0x109FB ^ 0x109C2;
        AdvancedRectRenderer.p[0x10D2E ^ 0x10D3A] = 0x10D79 ^ 0x10D3A;
        AdvancedRectRenderer.p[0x10B1D ^ 0x10B74] = 0x10B04 ^ 0x10B74;
        AdvancedRectRenderer.p[0xFA3B ^ 0xFA3A] = 0xFA52 ^ 0xFA3A;
        AdvancedRectRenderer.p[0xE862 ^ 0xE82D] = 0xE818 ^ 0xE82D;
        AdvancedRectRenderer.p[0xF7B7 ^ 0xF6F2] = 0xF6FD ^ 0xF6F2;
        AdvancedRectRenderer.p[0xF38C ^ 0xF3F0] = 0xFFFF0C43 ^ 0xF3F0;
        AdvancedRectRenderer.p[0x9144 ^ 0x9000] = 0x9052 ^ 0x9000;
        AdvancedRectRenderer.p[0x20DE ^ 0x2194] = 0xFFFFDE6D ^ 0x2194;
        AdvancedRectRenderer.p[0x2CA5 ^ 0x2C5D] = 0xFFFFD330 ^ 0x2C5D;
        AdvancedRectRenderer.p[0xF0CB ^ 0xF097] = 0xFFFF0F34 ^ 0xF097;
        AdvancedRectRenderer.p[0x23D3 ^ 0x23D8] = 0xFFFFDC6C ^ 0x23D8;
        AdvancedRectRenderer.p[0x904F ^ 0x90DB] = 0x90DD ^ 0x90DB;
        AdvancedRectRenderer.p[0x62F7 ^ 0x6206] = 0x6210 ^ 0x6206;
        AdvancedRectRenderer.p[0x1AE1 ^ 0x1BDD] = 0xFFFFE43D ^ 0x1BDD;
        AdvancedRectRenderer.p[0xD40E ^ 0xD491] = 0xD4A6 ^ 0xD491;
        AdvancedRectRenderer.p[0xB967 ^ 0xB8EF] = 0xFFFF4714 ^ 0xB8EF;
        AdvancedRectRenderer.p[0x5FF2 ^ 0x5EBA] = 0xFFFFA179 ^ 0x5EBA;
        AdvancedRectRenderer.p[0xA530 ^ 0xA447] = 0xA45F ^ 0xA447;
        AdvancedRectRenderer.p[0x4979 ^ 0x487A] = 0x4833 ^ 0x487A;
        AdvancedRectRenderer.p[0x10D26 ^ 0x10DB5] = 0x10D9E ^ 0x10DB5;
        AdvancedRectRenderer.p[0xEA69 ^ 0xEA31] = 0xEA10 ^ 0xEA31;
        AdvancedRectRenderer.p[0x77DC ^ 0x7737] = 0x776B ^ 0x7737;
        AdvancedRectRenderer.p[0x10859 ^ 0x10844] = 0x1082D ^ 0x10844;
        AdvancedRectRenderer.p[0x45B6 ^ 0x45AC] = 0x4582 ^ 0x45AC;
        AdvancedRectRenderer.p[0xFF20 ^ 0xFF7E] = 0xFF6C ^ 0xFF7E;
        AdvancedRectRenderer.p[0x532A ^ 0x526B] = 0x527B ^ 0x526B;
        AdvancedRectRenderer.p[0x2624 ^ 0x2636] = 0xFFFFD966 ^ 0x2636;
        AdvancedRectRenderer.p[0x656D ^ 0x6449] = 0xFFFF9BCC ^ 0x6449;
        AdvancedRectRenderer.p[0xFEB3 ^ 0xFEAC] = 0xFE8D ^ 0xFEAC;
        AdvancedRectRenderer.p[0xB7B0 ^ 0xB6DA] = 0xB68E ^ 0xB6DA;
        AdvancedRectRenderer.p[0x8F83 ^ 0x8F40] = 0x8F19 ^ 0x8F40;
        AdvancedRectRenderer.p[0x6986 ^ 0x69AA] = 0x6987 ^ 0x69AA;
        AdvancedRectRenderer.p[0x1D8F ^ 0x1D7C] = 0xFFFFE2C3 ^ 0x1D7C;
        AdvancedRectRenderer.p[0x6093 ^ 0x61E8] = 0x61E6 ^ 0x61E8;
        AdvancedRectRenderer.p[0x5C7C ^ 0x5C45] = 0x5C55 ^ 0x5C45;
        AdvancedRectRenderer.p[0xA9FC ^ 0xA98E] = 0xA92F ^ 0xA98E;
        AdvancedRectRenderer.p[0xF86A ^ 0xF94A] = 0xFFFF06A5 ^ 0xF94A;
        AdvancedRectRenderer.p[0x3E9F ^ 0x3FD1] = 0xFFFFC052 ^ 0x3FD1;
        AdvancedRectRenderer.p[0x1FAD ^ 0x1EEA] = 0xFFFFE104 ^ 0x1EEA;
        AdvancedRectRenderer.p[0x1FC6 ^ 0x1F53] = 0xFFFFE083 ^ 0x1F53;
        AdvancedRectRenderer.p[0x8CA4 ^ 0x8C8A] = 0xFFFF7302 ^ 0x8C8A;
        AdvancedRectRenderer.p[0x2306 ^ 0x225A] = 0xFFFFDDF4 ^ 0x225A;
        AdvancedRectRenderer.p[0x28DA ^ 0x2857] = 0x288B ^ 0x2857;
        AdvancedRectRenderer.p[0x47BF ^ 0x47C8] = 0xFFFFB86B ^ 0x47C8;
        AdvancedRectRenderer.p[0x9BC ^ 0x949] = 0xFFFFF6F3 ^ 0x949;
        AdvancedRectRenderer.p[0x9883 ^ 0x9818] = 0x9853 ^ 0x9818;
        AdvancedRectRenderer.p[0xA14B ^ 0xA049] = 0xFFFF5FA4 ^ 0xA049;
        AdvancedRectRenderer.p[0x8A7C ^ 0x8B30] = 0xFFFF74CB ^ 0x8B30;
        AdvancedRectRenderer.p[0x990C ^ 0x9938] = 0x992B ^ 0x9938;
        AdvancedRectRenderer.p[0xB33B ^ 0xB36B] = 0xB350 ^ 0xB36B;
        AdvancedRectRenderer.p[0x699A ^ 0x6975] = 0xFFFF96BA ^ 0x6975;
        AdvancedRectRenderer.p[0x2EBB ^ 0x2EDE] = 0xFFFFD10B ^ 0x2EDE;
        AdvancedRectRenderer.p[0xEB ^ 0x8C] = 0xDD ^ 0x8C;
        AdvancedRectRenderer.p[0xE726 ^ 0xE7EF] = 0xE7AA ^ 0xE7EF;
        AdvancedRectRenderer.p[0x761A ^ 0x76E7] = 0x769C ^ 0x76E7;
        AdvancedRectRenderer.p[0x7CB8 ^ 0x7C59] = 0x7C11 ^ 0x7C59;
        AdvancedRectRenderer.p[0x8A7 ^ 0x8F6] = 0x8AB ^ 0x8F6;
        AdvancedRectRenderer.p[0x805A ^ 0x80D0] = 0xFFFF7F84 ^ 0x80D0;
        AdvancedRectRenderer.p[0xF8FA ^ 0xF82C] = 0xF80B ^ 0xF82C;
        AdvancedRectRenderer.p[0x73FD ^ 0x736D] = 0xFFFF8C85 ^ 0x736D;
        AdvancedRectRenderer.p[0x9C89 ^ 0x9C85] = 0xFFFF632E ^ 0x9C85;
        AdvancedRectRenderer.p[0x650 ^ 0x6EF] = 0x6C5 ^ 0x6EF;
        AdvancedRectRenderer.p[0x7D7B ^ 0x7D20] = 0x7D1A ^ 0x7D20;
        AdvancedRectRenderer.p[0xDC00 ^ 0xDC49] = 0xFFFF23F0 ^ 0xDC49;
        AdvancedRectRenderer.p[0xBDA7 ^ 0xBD8A] = 0xFFFF4204 ^ 0xBD8A;
        AdvancedRectRenderer.p[0xB7A9 ^ 0xB7B2] = 0xB7DC ^ 0xB7B2;
        AdvancedRectRenderer.p[0x3634 ^ 0x366E] = 0xFFFFC98F ^ 0x366E;
        AdvancedRectRenderer.p[0xE31D ^ 0xE3EB] = 0xFFFF1C15 ^ 0xE3EB;
        AdvancedRectRenderer.p[0xE525 ^ 0xE5BF] = 0xE5A9 ^ 0xE5BF;
        AdvancedRectRenderer.p[0x9E41 ^ 0x9FC2] = 0x9FA1 ^ 0x9FC2;
        AdvancedRectRenderer.p[0xB0B5 ^ 0xB1CA] = 0xB185 ^ 0xB1CA;
        AdvancedRectRenderer.p[0xA13F ^ 0xA1EE] = 0xFFFF5E1B ^ 0xA1EE;
        AdvancedRectRenderer.p[0x581F ^ 0x5890] = 0x58DB ^ 0x5890;
        AdvancedRectRenderer.p[0x32C4 ^ 0x3256] = 0xFFFFCDC6 ^ 0x3256;
        AdvancedRectRenderer.p[0x707A ^ 0x711F] = 0xFFFF8EC5 ^ 0x711F;
        AdvancedRectRenderer.p[0x48B5 ^ 0x4891] = 0x48B6 ^ 0x4891;
        AdvancedRectRenderer.p[0xCE28 ^ 0xCE3F] = 0xCE55 ^ 0xCE3F;
        AdvancedRectRenderer.p[0xB973 ^ 0xB9C1] = 0xB9C1 ^ 0xB9C1;
        AdvancedRectRenderer.p[0x688B ^ 0x69C2] = 0xFFFF964F ^ 0x69C2;
        AdvancedRectRenderer.p[0x3981 ^ 0x39E9] = 0x39ED ^ 0x39E9;
        AdvancedRectRenderer.p[0x9A0A ^ 0x9B7E] = 0x9B04 ^ 0x9B7E;
        AdvancedRectRenderer.p[0xC05C ^ 0xC055] = 0xFFFF3FE6 ^ 0xC055;
        AdvancedRectRenderer.p[0xD8F8 ^ 0xD870] = 0xD841 ^ 0xD870;
        AdvancedRectRenderer.p[0x5308 ^ 0x5307] = 0x5335 ^ 0x5307;
        AdvancedRectRenderer.p[0x6FED ^ 0x6FD1] = 0x6FD2 ^ 0x6FD1;
        AdvancedRectRenderer.p[0x161A ^ 0x1743] = 0xFFFFE8CD ^ 0x1743;
        AdvancedRectRenderer.p[0x22D8 ^ 0x22EF] = 0x22C6 ^ 0x22EF;
        AdvancedRectRenderer.p[0xDCF6 ^ 0xDC59] = 0xFFFF238E ^ 0xDC59;
        AdvancedRectRenderer.p[0xDD53 ^ 0xDC33] = 0xFFFF23E3 ^ 0xDC33;
        AdvancedRectRenderer.p[0x1EAE ^ 0x1FAB] = 0xFFFFE023 ^ 0x1FAB;
        AdvancedRectRenderer.p[0xF995 ^ 0xF8FB] = 0xFFFF0754 ^ 0xF8FB;
        AdvancedRectRenderer.p[0xE438 ^ 0xE45E] = 0xE4C7 ^ 0xE45E;
        AdvancedRectRenderer.p[0xFDBC ^ 0xFD1A] = 0xFFFF02E4 ^ 0xFD1A;
        AdvancedRectRenderer.p[0x1051F ^ 0x105E8] = 0xFFFEFA54 ^ 0x105E8;
    }
}

