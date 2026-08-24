/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Vector3f
 *  org.joml.Vector4f
 *  org.joml.Vector4fc
 */
package kotakbaz.rain.client.util.render.display;

import java.awt.Color;
import kotakbaz.rain.client.render.main.program.GlProgram;
import kotakbaz.rain.client.render.main.program.uniform.a;
import kotakbaz.rain.client.render.main.program.uniform.uniforms.sampler.SamplerUniform;
import kotakbaz.rain.client.render.main.vertex.DrawMode;
import kotakbaz.rain.client.render.main.vertex.element.A;
import kotakbaz.rain.client.render.main.vertex.element.VertexElement;
import kotakbaz.rain.client.render.main.vertex.format.VertexFormat;
import kotakbaz.rain.client.render.main.vertex.mesh.IMesh;
import kotakbaz.rain.client.render.main.vertex.mesh.MeshBuilder;
import kotakbaz.rain.client.render.texture.GlTex;
import kotakbaz.rain.client.util.color.QuadColor;
import kotakbaz.rain.client.util.render.display.RectRenderer;
import kotakbaz.rain.client.util.render.engine.controls.RectType;
import kotakbaz.rain.client.util.render.engine.controls.TextureSampler;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joml.Vector3f;
import org.joml.Vector4f;
import org.joml.Vector4fc;
import oxxxde.\u0627\u0642;
import oxxxde.\u0628\u062d;
import oxxxde.\u0628\u062f;
import oxxxde.\u062c\u0650;
import oxxxde.\u0630\u0631;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\u00b0\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u0086\u00012\u00020\u0001:\u0002\u0086\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\n\u001a\n \t*\u0004\u0018\u00010\b0\bH\u0016\u00a2\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016\u00a2\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\b\u0010\u0010\u0003J#\u0010\u0015\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0017\u00a2\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00002\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u00a2\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001e\u00a2\u0006\u0004\b\u001c\u0010 J\u0015\u0010\u001c\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020!\u00a2\u0006\u0004\b\u001c\u0010#J\u0015\u0010%\u001a\u00020\u00002\u0006\u0010%\u001a\u00020$\u00a2\u0006\u0004\b%\u0010&J-\u0010%\u001a\u00020\u00002\u0006\u0010'\u001a\u00020$2\u0006\u0010(\u001a\u00020$2\u0006\u0010)\u001a\u00020$2\u0006\u0010*\u001a\u00020$\u00a2\u0006\u0004\b%\u0010+J\u0015\u0010.\u001a\u00020\u00002\u0006\u0010-\u001a\u00020,\u00a2\u0006\u0004\b.\u0010/J\u0015\u0010.\u001a\u00020\u00002\u0006\u0010-\u001a\u000200\u00a2\u0006\u0004\b.\u00101J\u0015\u00103\u001a\u00020\u00002\u0006\u00102\u001a\u00020,\u00a2\u0006\u0004\b3\u0010/J\u0015\u00105\u001a\u00020\u00002\u0006\u00104\u001a\u00020,\u00a2\u0006\u0004\b5\u0010/J\u001d\u00107\u001a\u00020\u00002\u0006\u00106\u001a\u00020,2\u0006\u0010%\u001a\u00020$\u00a2\u0006\u0004\b7\u00108J\u0015\u00109\u001a\u00020\u00002\u0006\u00106\u001a\u00020,\u00a2\u0006\u0004\b9\u0010/J\u0015\u0010:\u001a\u00020\u00002\u0006\u0010%\u001a\u00020$\u00a2\u0006\u0004\b:\u0010&J-\u0010>\u001a\u00020\u000f2\u0006\u0010;\u001a\u00020,2\u0006\u0010<\u001a\u00020,2\u0006\u00106\u001a\u00020,2\u0006\u0010=\u001a\u00020,\u00a2\u0006\u0004\b>\u0010?J\u007f\u0010G\u001a\u00020\u000f2\u0006\u0010;\u001a\u00020,2\u0006\u0010<\u001a\u00020,2\u0006\u00106\u001a\u00020,2\u0006\u0010=\u001a\u00020,2\u0006\u0010%\u001a\u00020@2\u0006\u0010A\u001a\u0002002\u0006\u0010B\u001a\u00020,2\u0006\u0010C\u001a\u00020,2\u0006\u0010D\u001a\u00020,2\u0006\u0010E\u001a\u00020,2\u0006\u0010F\u001a\u00020,2\u0006\u00103\u001a\u00020,2\u0006\u00109\u001a\u00020,2\u0006\u0010:\u001a\u00020$H\u0002\u00a2\u0006\u0004\bG\u0010HJM\u0010I\u001a\u00020\u000f2\u0006\u0010;\u001a\u00020,2\u0006\u0010<\u001a\u00020,2\u0006\u00106\u001a\u00020,2\u0006\u0010=\u001a\u00020,2\u0006\u0010%\u001a\u00020@2\u0006\u0010A\u001a\u0002002\u0006\u00109\u001a\u00020,2\u0006\u0010:\u001a\u00020$\u00a2\u0006\u0004\bI\u0010JJ\u0017\u0010L\u001a\u00020\u001a2\u0006\u0010K\u001a\u00020\u001eH\u0002\u00a2\u0006\u0004\bL\u0010MJ\u0017\u0010L\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020!H\u0002\u00a2\u0006\u0004\bL\u0010NJ=\u0010I\u001a\u00020\u000f2\u0006\u0010;\u001a\u00020,2\u0006\u0010<\u001a\u00020,2\u0006\u00106\u001a\u00020,2\u0006\u0010=\u001a\u00020,2\u0006\u0010%\u001a\u00020$2\u0006\u0010A\u001a\u000200\u00a2\u0006\u0004\bI\u0010OJ=\u0010I\u001a\u00020\u000f2\u0006\u0010;\u001a\u00020,2\u0006\u0010<\u001a\u00020,2\u0006\u00106\u001a\u00020,2\u0006\u0010=\u001a\u00020,2\u0006\u0010%\u001a\u00020$2\u0006\u0010A\u001a\u00020,\u00a2\u0006\u0004\bI\u0010PJ=\u0010I\u001a\u00020\u000f2\u0006\u0010;\u001a\u00020,2\u0006\u0010<\u001a\u00020,2\u0006\u00106\u001a\u00020,2\u0006\u0010=\u001a\u00020,2\u0006\u0010%\u001a\u00020@2\u0006\u0010A\u001a\u000200\u00a2\u0006\u0004\bI\u0010QJm\u0010R\u001a\u00020\u000f2\u0006\u0010;\u001a\u00020,2\u0006\u0010<\u001a\u00020,2\u0006\u00106\u001a\u00020,2\u0006\u0010=\u001a\u00020,2\u0006\u0010%\u001a\u00020@2\u0006\u0010B\u001a\u00020,2\u0006\u00103\u001a\u00020,2\u0006\u0010C\u001a\u00020,2\u0006\u0010D\u001a\u00020,2\u0006\u0010E\u001a\u00020,2\u0006\u0010F\u001a\u00020,2\u0006\u0010A\u001a\u000200\u00a2\u0006\u0004\bR\u0010SJm\u0010R\u001a\u00020\u000f2\u0006\u0010;\u001a\u00020,2\u0006\u0010<\u001a\u00020,2\u0006\u00106\u001a\u00020,2\u0006\u0010=\u001a\u00020,2\u0006\u0010%\u001a\u00020$2\u0006\u0010B\u001a\u00020,2\u0006\u00103\u001a\u00020,2\u0006\u0010C\u001a\u00020,2\u0006\u0010D\u001a\u00020,2\u0006\u0010E\u001a\u00020,2\u0006\u0010F\u001a\u00020,2\u0006\u0010A\u001a\u000200\u00a2\u0006\u0004\bR\u0010TJm\u0010R\u001a\u00020\u000f2\u0006\u0010;\u001a\u00020,2\u0006\u0010<\u001a\u00020,2\u0006\u00106\u001a\u00020,2\u0006\u0010=\u001a\u00020,2\u0006\u0010%\u001a\u00020$2\u0006\u0010B\u001a\u00020,2\u0006\u00103\u001a\u00020,2\u0006\u0010C\u001a\u00020,2\u0006\u0010D\u001a\u00020,2\u0006\u0010E\u001a\u00020,2\u0006\u0010F\u001a\u00020,2\u0006\u0010A\u001a\u00020,\u00a2\u0006\u0004\bR\u0010UJO\u0010[\u001a\u00020\u000f2\u0006\u0010W\u001a\u00020V2\u0006\u0010;\u001a\u00020,2\u0006\u0010<\u001a\u00020,2\u0006\u00106\u001a\u00020,2\u0006\u0010=\u001a\u00020,2\u0006\u0010A\u001a\u00020,2\u0006\u0010X\u001a\u00020\u001e2\u0006\u0010Z\u001a\u00020YH\u0014\u00a2\u0006\u0004\b[\u0010\\R\u0016\u0010]\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b]\u0010^R\u0014\u0010`\u001a\u00020_8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b`\u0010aR\u001c\u0010c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bc\u0010dR\u001c\u0010e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\be\u0010fR\u001c\u0010g\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bg\u0010dR\u0016\u0010h\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bh\u0010iR\u0016\u0010B\u001a\u00020,8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bB\u0010jR\u0016\u00103\u001a\u00020,8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b3\u0010jR\u0016\u00109\u001a\u00020,8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b9\u0010jR\u0016\u0010:\u001a\u00020$8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b:\u0010kR\u0016\u0010l\u001a\u00020,8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bl\u0010jR\u0016\u0010n\u001a\u00020m8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\bn\u0010oR\u0016\u0010p\u001a\u00020m8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\bp\u0010oR\u0016\u0010q\u001a\u00020m8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\bq\u0010oR\u0016\u0010r\u001a\u00020m8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\br\u0010oR\u0016\u0010s\u001a\u00020m8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\bs\u0010oR\u0016\u0010t\u001a\u00020m8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\bt\u0010oR\u0016\u0010u\u001a\u00020m8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\bu\u0010oR\u0016\u0010v\u001a\u00020m8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\bv\u0010oR\u0016\u0010w\u001a\u00020m8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\bw\u0010oR\u0016\u0010x\u001a\u00020m8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\bx\u0010oR\u0016\u0010y\u001a\u00020m8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\by\u0010oR\u0016\u0010z\u001a\u00020m8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\bz\u0010oR\u0016\u0010{\u001a\u00020m8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\b{\u0010oR\u0016\u0010|\u001a\u00020m8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\b|\u0010oR\u0016\u0010~\u001a\u00020}8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\b~\u0010\u007fR\u0018\u0010\u0081\u0001\u001a\u00030\u0080\u00018\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0017\u0010\u0083\u0001\u001a\u00020Y8\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0017\u0010\u0085\u0001\u001a\u00020Y8\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u0085\u0001\u0010\u0084\u0001\u00a8\u0006\u0087\u0001"}, d2={"Loxxxde/\u0632\u062c;", "Loxxxde/\u062c\u0628;", "<init>", "()V", "", "name", "()Ljava/lang/String;", "shader", "Loxxxde/\u0634\u0645;", "kotlin.jvm.PlatformType", "drawMode", "()Lkotakbaz/rain/client/render/main/vertex/DrawMode;", "Loxxxde/\u0633\u0627;", "vertexFormat", "()Lkotakbaz/rain/client/render/main/vertex/format/VertexFormat;", "", "load", "Loxxxde/\u0637\u0623;", "mesh", "", "state", "renderBatch", "(Lkotakbaz/rain/client/render/main/vertex/mesh/IMesh;Ljava/lang/Object;)V", "Loxxxde/\u0631\u0635;", "type", "(Lkotakbaz/rain/client/util/render/engine/controls/RectType;)Lkotakbaz/rain/client/util/render/display/AdvancedRectRenderer;", "Loxxxde/\u0638\u0628;", "sampler", "texture", "(Lkotakbaz/rain/client/util/render/engine/controls/TextureSampler;)Lkotakbaz/rain/client/util/render/display/AdvancedRectRenderer;", "", "id", "(I)Lkotakbaz/rain/client/util/render/display/AdvancedRectRenderer;", "Loxxxde/\u0637\u062c;", "tex", "(Lkotakbaz/rain/client/render/texture/GlTex;)Lkotakbaz/rain/client/util/render/display/AdvancedRectRenderer;", "Ljava/awt/Color;", "color", "(Ljava/awt/Color;)Lkotakbaz/rain/client/util/render/display/AdvancedRectRenderer;", "c1", "c2", "c3", "c4", "(Ljava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;)Lkotakbaz/rain/client/util/render/display/AdvancedRectRenderer;", "", "r", "round", "(F)Lkotakbaz/rain/client/util/render/display/AdvancedRectRenderer;", "Lorg/joml/Vector4f;", "(Lorg/joml/Vector4f;)Lkotakbaz/rain/client/util/render/display/AdvancedRectRenderer;", "a", "alpha", "gridSize", "pixelated", "width", "border", "(FLjava/awt/Color;)Lkotakbaz/rain/client/util/render/display/AdvancedRectRenderer;", "borderWidth", "borderColor", "x", "y", "height", "draw", "(FFFF)V", "Loxxxde/\u0633\u0629;", "radius", "mix", "u", "v", "texW", "texH", "drawConst", "(FFFFLkotakbaz/rain/client/util/color/QuadColor;Lorg/joml/Vector4f;FFFFFFFLjava/awt/Color;)V", "drawRect", "(FFFFLkotakbaz/rain/client/util/color/QuadColor;Lorg/joml/Vector4f;FLjava/awt/Color;)V", "textureId", "samplerFor", "(I)Lkotakbaz/rain/client/util/render/engine/controls/TextureSampler;", "(Lkotakbaz/rain/client/render/texture/GlTex;)Lkotakbaz/rain/client/util/render/engine/controls/TextureSampler;", "(FFFFLjava/awt/Color;Lorg/joml/Vector4f;)V", "(FFFFLjava/awt/Color;F)V", "(FFFFLkotakbaz/rain/client/util/color/QuadColor;Lorg/joml/Vector4f;)V", "drawTexture", "(FFFFLkotakbaz/rain/client/util/color/QuadColor;FFFFFFLorg/joml/Vector4f;)V", "(FFFFLjava/awt/Color;FFFFFFLorg/joml/Vector4f;)V", "(FFFFLjava/awt/Color;FFFFFFF)V", "Loxxxde/\u0627\u0646;", "builder", "index", "", "extra", "uploadVertex", "(Lkotakbaz/rain/client/render/main/vertex/mesh/MeshBuilder;FFFFFI[F)V", "rectType", "Loxxxde/\u0631\u0635;", "", "textureIdKeys", "[I", "", "textureIdSamplers", "[Loxxxde/\u0638\u0628;", "glTexKeys", "[Loxxxde/\u0637\u062c;", "glTexSamplers", "currentSampler", "Loxxxde/\u0638\u0628;", "F", "Ljava/awt/Color;", "pixelGridSize", "Loxxxde/\u0633\u0626;", "eTopRight", "Loxxxde/\u0633\u0626;", "eTopLeft", "eBotRight", "eBotLeft", "eTexture", "eSize", "eRadius", "eMix", "eAlpha", "eMode", "eBorderW", "eBorderC", "eType", "eScissor", "Loxxxde/\u062e\u0629;", "textureUniform", "Loxxxde/\u062e\u0629;", "Lorg/joml/Vector3f;", "currentPos", "Lorg/joml/Vector3f;", "dataBuffer", "[F", "colorBuffer", "Companion", "rain-visuals"})
public final class AdvancedRectRenderer
extends RectRenderer {
    private VertexElement eMix;
    @NotNull
    private final GlTex[] glTexKeys;
    @NotNull
    private final Vector3f currentPos;
    @NotNull
    private RectType rectType = RectType.BASIC;
    private VertexElement eBorderW;
    private VertexElement eBotRight;
    private VertexElement eBorderC;
    private VertexElement eType;
    private float borderWidth;
    private static final VertexFormat VERTEX_FORMAT;
    private VertexElement eTopLeft;
    private SamplerUniform textureUniform;
    @NotNull
    private static final Color TRANSPARENT;
    private VertexElement eScissor;
    @NotNull
    public static final \u0627\u0642 Companion;
    private VertexElement eRadius;
    @NotNull
    private final float[] dataBuffer;
    private VertexElement eTexture;
    private float alpha = 1.0f;
    @NotNull
    private final TextureSampler[] textureIdSamplers;
    private VertexElement eBotLeft;
    @NotNull
    private final int[] textureIdKeys = new int[64];
    private float mix;
    private VertexElement eTopRight;
    @NotNull
    private Color borderColor;
    private VertexElement eMode;
    private VertexElement eAlpha;
    @NotNull
    private final TextureSampler[] glTexSamplers;
    @NotNull
    private TextureSampler currentSampler;
    @NotNull
    private final float[] colorBuffer;
    private VertexElement eSize;
    private float pixelGridSize;

    @NotNull
    public final AdvancedRectRenderer borderColor(@NotNull Color color) {
        Intrinsics.checkNotNullParameter(color, "color");
        this.borderColor = color;
        return this;
    }

    /*
     * WARNING - void declaration
     */
    private final TextureSampler samplerFor(int textureId) {
        void var5_5;
        TextureSampler textureSampler;
        int index = (textureId ^ textureId >>> 16) & this.textureIdSamplers.length - 1;
        TextureSampler cached = this.textureIdSamplers[index];
        if (cached != null) {
            if (this.textureIdKeys[index] == textureId) {
                return cached;
            }
        }
        TextureSampler it = textureSampler = new TextureSampler(textureId);
        boolean bl = false;
        this.textureIdKeys[index] = textureId;
        this.textureIdSamplers[var2_2] = var5_5;
        return textureSampler;
    }

    @NotNull
    public final AdvancedRectRenderer round(@NotNull Vector4f r) {
        Intrinsics.checkNotNullParameter(r, "r");
        this.getCachedRadius().set((Vector4fc)r);
        return this;
    }

    @NotNull
    public final AdvancedRectRenderer color(@NotNull Color c1, @NotNull Color c2, @NotNull Color c3, @NotNull Color c4) {
        Intrinsics.checkNotNullParameter(c1, "c1");
        Intrinsics.checkNotNullParameter(c2, "c2");
        Intrinsics.checkNotNullParameter(c3, "c3");
        Intrinsics.checkNotNullParameter(c4, "c4");
        this.getCachedColor().set(c1, c2, c3, c4);
        return this;
    }

    @Override
    public DrawMode drawMode() {
        return DrawMode.QUADS;
    }

    @NotNull
    public final AdvancedRectRenderer color(@NotNull Color color) {
        Intrinsics.checkNotNullParameter(color, "color");
        this.getCachedColor().set(color);
        return this;
    }

    @NotNull
    public final AdvancedRectRenderer type(@NotNull RectType type) {
        Intrinsics.checkNotNullParameter((Object)type, "type");
        this.rectType = type;
        return this;
    }

    @NotNull
    public final AdvancedRectRenderer pixelated(float gridSize) {
        this.pixelGridSize = RangesKt.coerceAtLeast(gridSize, 0.0f);
        return this;
    }

    @Override
    @NotNull
    public String name() {
        return "advanced-rect";
    }

    @NotNull
    public final AdvancedRectRenderer border(float width, @NotNull Color color) {
        Intrinsics.checkNotNullParameter(color, "color");
        this.borderWidth = width;
        this.borderColor = color;
        return this;
    }

    @NotNull
    public final AdvancedRectRenderer texture(@Nullable TextureSampler sampler) {
        if (sampler == null) {
            if (!this.currentSampler.hasTextureId(0)) {
                this.currentSampler = this.samplerFor(0);
            }
        } else if (!Intrinsics.areEqual(this.currentSampler, sampler)) {
            this.currentSampler = sampler;
        }
        this.rectType = RectType.TEXTURE;
        return this;
    }

    public final void drawTexture(float x, float y, float width, float height, @NotNull QuadColor color, float mix, float alpha, float u, float v, float texW, float texH, @NotNull Vector4f radius) {
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(radius, "radius");
        this.rectType = RectType.TEXTURE;
        this.drawConst(x, y, width, height, color, radius, mix, u, v, texW, texH, alpha, this.borderWidth, this.borderColor);
    }

    /*
     * WARNING - void declaration
     */
    private final TextureSampler samplerFor(GlTex texture) {
        void var5_5;
        TextureSampler textureSampler;
        int index = System.identityHashCode(texture) & this.glTexSamplers.length - 1;
        TextureSampler cached = this.glTexSamplers[index];
        if (this.glTexKeys[index] == texture) {
            if (cached != null) {
                return cached;
            }
        }
        TextureSampler it = textureSampler = new TextureSampler(texture);
        boolean bl = false;
        this.glTexKeys[index] = texture;
        this.glTexSamplers[var2_2] = var5_5;
        return textureSampler;
    }

    @Override
    public void load() {
        if (this.getGlProgram() == null) {
            this.setGlProgram(this.createShaderBuilder(this.name(), this.shader(), this.shader()).sampler("uTexture").build());
        }
        VertexFormat vf = VERTEX_FORMAT;
        VertexElement vertexElement = vf.getVertexElement("TopRightColor");
        Intrinsics.checkNotNullExpressionValue(vertexElement, "getVertexElement(...)");
        this.eTopRight = vertexElement;
        VertexElement vertexElement2 = vf.getVertexElement("TopLeftColor");
        Intrinsics.checkNotNullExpressionValue(vertexElement2, "getVertexElement(...)");
        this.eTopLeft = vertexElement2;
        VertexElement vertexElement3 = vf.getVertexElement("BottomRightColor");
        Intrinsics.checkNotNullExpressionValue(vertexElement3, "getVertexElement(...)");
        this.eBotRight = vertexElement3;
        VertexElement vertexElement4 = vf.getVertexElement("BottomLeftColor");
        Intrinsics.checkNotNullExpressionValue(vertexElement4, "getVertexElement(...)");
        this.eBotLeft = vertexElement4;
        VertexElement vertexElement5 = vf.getVertexElement("Texture");
        Intrinsics.checkNotNullExpressionValue(vertexElement5, "getVertexElement(...)");
        this.eTexture = vertexElement5;
        VertexElement vertexElement6 = vf.getVertexElement("Size");
        Intrinsics.checkNotNullExpressionValue(vertexElement6, "getVertexElement(...)");
        this.eSize = vertexElement6;
        VertexElement vertexElement7 = vf.getVertexElement("Radius");
        Intrinsics.checkNotNullExpressionValue(vertexElement7, "getVertexElement(...)");
        this.eRadius = vertexElement7;
        VertexElement vertexElement8 = vf.getVertexElement("Mix");
        Intrinsics.checkNotNullExpressionValue(vertexElement8, "getVertexElement(...)");
        this.eMix = vertexElement8;
        VertexElement vertexElement9 = vf.getVertexElement("Alpha");
        Intrinsics.checkNotNullExpressionValue(vertexElement9, "getVertexElement(...)");
        this.eAlpha = vertexElement9;
        VertexElement vertexElement10 = vf.getVertexElement("Mode");
        Intrinsics.checkNotNullExpressionValue(vertexElement10, "getVertexElement(...)");
        this.eMode = vertexElement10;
        VertexElement vertexElement11 = vf.getVertexElement("BorderWidth");
        Intrinsics.checkNotNullExpressionValue(vertexElement11, "getVertexElement(...)");
        this.eBorderW = vertexElement11;
        VertexElement vertexElement12 = vf.getVertexElement("BorderColor");
        Intrinsics.checkNotNullExpressionValue(vertexElement12, "getVertexElement(...)");
        this.eBorderC = vertexElement12;
        VertexElement vertexElement13 = vf.getVertexElement("Type");
        Intrinsics.checkNotNullExpressionValue(vertexElement13, "getVertexElement(...)");
        this.eType = vertexElement13;
        VertexElement vertexElement14 = vf.getVertexElement("Scissor");
        Intrinsics.checkNotNullExpressionValue(vertexElement14, "getVertexElement(...)");
        this.eScissor = vertexElement14;
        GlProgram glProgram = this.getGlProgram();
        Intrinsics.checkNotNull(glProgram);
        SamplerUniform samplerUniform = glProgram.getUniform("uTexture", a.SAMPLER);
        Intrinsics.checkNotNullExpressionValue(samplerUniform, "getUniform(...)");
        this.textureUniform = samplerUniform;
    }

    public final void drawTexture(float x, float y, float width, float height, @NotNull Color color, float mix, float alpha, float u, float v, float texW, float texH, @NotNull Vector4f radius) {
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(radius, "radius");
        this.getCachedColor().set(color);
        this.drawTexture(x, y, width, height, this.getCachedColor(), mix, alpha, u, v, texW, texH, radius);
    }

    public final void drawTexture(float x, float y, float width, float height, @NotNull Color color, float mix, float alpha, float u, float v, float texW, float texH, float radius) {
        Intrinsics.checkNotNullParameter(color, "color");
        this.getCachedColor().set(color);
        this.getCachedRadius().set(radius, radius, radius, radius);
        this.drawTexture(x, y, width, height, this.getCachedColor(), mix, alpha, u, v, texW, texH, this.getCachedRadius());
    }

    @Override
    @NotNull
    public String shader() {
        return "rect/rectangle";
    }

    public final void drawRect(float x, float y, float width, float height, @NotNull Color color, float radius) {
        Intrinsics.checkNotNullParameter(color, "color");
        this.getCachedColor().set(color);
        this.getCachedRadius().set(radius, radius, radius, radius);
        this.drawRect(x, y, width, height, this.getCachedColor(), this.getCachedRadius(), 0.0f, TRANSPARENT);
    }

    @NotNull
    public final AdvancedRectRenderer texture(int id) {
        if (!this.currentSampler.hasTextureId(id)) {
            this.currentSampler = this.samplerFor(id);
        }
        this.rectType = RectType.TEXTURE;
        return this;
    }

    public final void drawRect(float x, float y, float width, float height, @NotNull QuadColor color, @NotNull Vector4f radius) {
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(radius, "radius");
        this.drawRect(x, y, width, height, color, radius, 0.0f, TRANSPARENT);
    }

    public AdvancedRectRenderer() {
        this.textureIdSamplers = new TextureSampler[64];
        this.glTexKeys = new GlTex[16];
        this.glTexSamplers = new TextureSampler[16];
        this.currentSampler = this.samplerFor(0);
        this.borderColor = new Color(0, 0, 0, 0);
        this.currentPos = new Vector3f();
        this.dataBuffer = new float[32];
        this.colorBuffer = new float[4];
    }

    @Override
    protected void uploadVertex(@NotNull MeshBuilder builder, float x, float y, float width, float height, float radius, int index, @NotNull float[] extra) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        Intrinsics.checkNotNullParameter(extra, "extra");
        float mode = extra[0];
        float mix = extra[1];
        float u = extra[2];
        float v = extra[3];
        float texW = extra[4];
        float texH = extra[5];
        float alpha = extra[6];
        float bw = extra[7];
        float u2 = u + texW;
        float v2 = v + texH;
        float curU = 0.0f;
        float curV = 0.0f;
        switch (index) {
            case 0: {
                curU = u;
                curV = v2;
                break;
            }
            case 1: {
                curU = u;
                curV = v;
                break;
            }
            case 2: {
                curU = u2;
                curV = v;
                break;
            }
            case 3: {
                curU = u2;
                curV = v2;
                break;
            }
            default: {
                curU = 0.0f;
                curV = 0.0f;
            }
        }
        float rx = extra[28];
        float ry = extra[29];
        float rz = extra[30];
        float rw = extra[31];
        Vector4f sc = \u062c\u0650.INSTANCE.getCurrentScissorValues();
        this.currentPos.set(x, y, 0.0f);
        \u0628\u062f.INSTANCE.transformPosition(this.currentPos);
        Object object = builder.vertex(this.currentPos.x, this.currentPos.y, this.currentPos.z);
        VertexElement vertexElement = this.eTopRight;
        if (vertexElement == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eTopRight");
            vertexElement = null;
        }
        MeshBuilder meshBuilder = ((MeshBuilder)object).elementFloat(vertexElement, extra[12], extra[13], extra[14], extra[15]);
        VertexElement vertexElement2 = this.eTopLeft;
        if (vertexElement2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eTopLeft");
            vertexElement2 = null;
        }
        MeshBuilder meshBuilder2 = meshBuilder.elementFloat(vertexElement2, extra[16], extra[17], extra[18], extra[19]);
        VertexElement vertexElement3 = this.eBotRight;
        if (vertexElement3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eBotRight");
            vertexElement3 = null;
        }
        MeshBuilder meshBuilder3 = meshBuilder2.elementFloat(vertexElement3, extra[20], extra[21], extra[22], extra[23]);
        VertexElement vertexElement4 = this.eBotLeft;
        if (vertexElement4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eBotLeft");
            vertexElement4 = null;
        }
        MeshBuilder meshBuilder4 = meshBuilder3.elementFloat(vertexElement4, extra[24], extra[25], extra[26], extra[27]);
        VertexElement vertexElement5 = this.eTexture;
        if (vertexElement5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eTexture");
            vertexElement5 = null;
        }
        MeshBuilder meshBuilder5 = meshBuilder4.elementFloat(vertexElement5, curU, curV);
        VertexElement vertexElement6 = this.eSize;
        if (vertexElement6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eSize");
            vertexElement6 = null;
        }
        MeshBuilder meshBuilder6 = meshBuilder5.elementFloat(vertexElement6, width, height);
        VertexElement vertexElement7 = this.eRadius;
        if (vertexElement7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eRadius");
            vertexElement7 = null;
        }
        MeshBuilder meshBuilder7 = meshBuilder6.elementFloat(vertexElement7, rx, rz, ry, rw);
        VertexElement vertexElement8 = this.eMix;
        if (vertexElement8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eMix");
            vertexElement8 = null;
        }
        MeshBuilder meshBuilder8 = meshBuilder7.elementFloat(vertexElement8, mix);
        VertexElement vertexElement9 = this.eAlpha;
        if (vertexElement9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eAlpha");
            vertexElement9 = null;
        }
        MeshBuilder meshBuilder9 = meshBuilder8.elementFloat(vertexElement9, alpha);
        VertexElement vertexElement10 = this.eMode;
        if (vertexElement10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eMode");
            vertexElement10 = null;
        }
        MeshBuilder meshBuilder10 = meshBuilder9.elementFloat(vertexElement10, mode);
        VertexElement vertexElement11 = this.eBorderW;
        if (vertexElement11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eBorderW");
            vertexElement11 = null;
        }
        MeshBuilder meshBuilder11 = meshBuilder10.elementFloat(vertexElement11, bw);
        VertexElement vertexElement12 = this.eBorderC;
        if (vertexElement12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eBorderC");
            vertexElement12 = null;
        }
        MeshBuilder meshBuilder12 = meshBuilder11.elementFloat(vertexElement12, extra[8], extra[9], extra[10], extra[11]);
        VertexElement vertexElement13 = this.eType;
        if (vertexElement13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eType");
            vertexElement13 = null;
        }
        MeshBuilder meshBuilder13 = meshBuilder12.elementFloat(vertexElement13, this.rectType.getValue());
        VertexElement vertexElement14 = this.eScissor;
        if (vertexElement14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eScissor");
            vertexElement14 = null;
        }
        meshBuilder13.elementFloat(vertexElement14, sc.x, sc.y, sc.z, sc.w);
    }

    public final void draw(float x, float y, float width, float height) {
        if (this.rectType == RectType.TEXTURE) {
            this.drawTexture(x, y, width, height, this.getCachedColor(), this.mix, this.alpha, 0.0f, 0.0f, 1.0f, 1.0f, this.getCachedRadius());
            return;
        }
        this.drawRect(x, y, width, height, this.getCachedColor(), this.getCachedRadius(), this.borderWidth, this.borderColor);
    }

    @NotNull
    public final AdvancedRectRenderer borderWidth(float width) {
        this.borderWidth = width;
        return this;
    }

    static {
        Companion = new \u0627\u0642(null);
        TRANSPARENT = new Color(0, 0, 0, 0);
        VERTEX_FORMAT = VertexFormat.builder().element("TopRightColor", A.FLOAT, 4).element("TopLeftColor", A.FLOAT, 4).element("BottomRightColor", A.FLOAT, 4).element("BottomLeftColor", A.FLOAT, 4).element("Texture", A.FLOAT, 2).element("Size", A.FLOAT, 2).element("Radius", A.FLOAT, 4).element("Mix", A.FLOAT, 1).element("Alpha", A.FLOAT, 1).element("Mode", A.FLOAT, 1).element("BorderWidth", A.FLOAT, 1).element("BorderColor", A.FLOAT, 4).element("Type", A.FLOAT, 1).element("Scissor", A.FLOAT, 4).build();
    }

    /*
     * WARNING - void declaration
     */
    public final void drawRect(float x, float y, float width, float height, @NotNull QuadColor color, @NotNull Vector4f radius, float borderWidth, @NotNull Color borderColor) {
        void var8_8;
        void var7_7;
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(radius, "radius");
        Intrinsics.checkNotNullParameter(borderColor, "borderColor");
        this.rectType = RectType.BASIC;
        if (!this.currentSampler.hasTextureId(0)) {
            this.currentSampler = this.samplerFor(0);
        }
        this.drawConst(x, y, width, height, color, radius, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, (float)var7_7, (Color)var8_8);
    }

    @NotNull
    public final AdvancedRectRenderer round(float r) {
        this.getCachedRadius().set(r, r, r, r);
        return this;
    }

    @NotNull
    public final AdvancedRectRenderer texture(@NotNull GlTex tex) {
        Intrinsics.checkNotNullParameter(tex, "tex");
        if (!this.currentSampler.hasGlTex(tex)) {
            this.currentSampler = this.samplerFor(tex);
        }
        this.rectType = RectType.TEXTURE;
        return this;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void renderBatch(@Nullable IMesh mesh, @Nullable Object state) {
        void var2_2;
        void var1_1;
        if (state instanceof TextureSampler) {
            TextureSampler textureSampler = (TextureSampler)state;
            SamplerUniform samplerUniform = this.textureUniform;
            if (samplerUniform == null) {
                Intrinsics.throwUninitializedPropertyAccessException("textureUniform");
                samplerUniform = null;
            }
            textureSampler.apply(samplerUniform);
        } else if (state instanceof Integer) {
            SamplerUniform samplerUniform = this.textureUniform;
            if (samplerUniform == null) {
                Intrinsics.throwUninitializedPropertyAccessException("textureUniform");
                samplerUniform = null;
            }
            samplerUniform.set(((Number)state).intValue());
        }
        super.renderBatch((IMesh)var1_1, var2_2);
    }

    @NotNull
    public final AdvancedRectRenderer alpha(float a2) {
        this.alpha = a2;
        return this;
    }

    /*
     * WARNING - void declaration
     */
    public final void drawRect(float x, float y, float width, float height, @NotNull Color color, @NotNull Vector4f radius) {
        void $this$drawRect_u24lambda_u240;
        QuadColor quadColor;
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(radius, "radius");
        QuadColor quadColor2 = quadColor = this.getCachedColor();
        float f = height;
        float f2 = width;
        float f3 = y;
        float f4 = x;
        AdvancedRectRenderer advancedRectRenderer = this;
        boolean bl = false;
        $this$drawRect_u24lambda_u240.set(color);
        Unit unit = Unit.INSTANCE;
        advancedRectRenderer.drawRect(f4, f3, f2, f, quadColor, radius, 0.0f, TRANSPARENT);
    }

    /*
     * WARNING - void declaration
     */
    private final void drawConst(float x, float y, float width, float height, QuadColor color, Vector4f radius, float mix, float u, float v, float texW, float texH, float alpha, float borderWidth, Color borderColor) {
        void var6_6;
        void var16_16;
        MeshBuilder meshBuilder = \u0630\u0631.INSTANCE.getDISPATCHER().getBuilder(this.getCurrentPipeline(), this, this.currentSampler);
        if (meshBuilder == null) {
            return;
        }
        MeshBuilder builder = meshBuilder;
        Vector4f coords = this.calcSmoothness(x, y, width, height);
        \u0628\u062d.INSTANCE.normalizeInto(color.getColor1(), this.colorBuffer);
        System.arraycopy(this.colorBuffer, 0, this.dataBuffer, 12, 4);
        \u0628\u062d.INSTANCE.normalizeInto(color.getColor2(), this.colorBuffer);
        System.arraycopy(this.colorBuffer, 0, this.dataBuffer, 16, 4);
        \u0628\u062d.INSTANCE.normalizeInto(color.getColor3(), this.colorBuffer);
        System.arraycopy(this.colorBuffer, 0, this.dataBuffer, 20, 4);
        \u0628\u062d.INSTANCE.normalizeInto(color.getColor4(), this.colorBuffer);
        System.arraycopy(this.colorBuffer, 0, this.dataBuffer, 24, 4);
        \u0628\u062d.INSTANCE.normalizeInto(borderColor, this.colorBuffer);
        System.arraycopy(this.colorBuffer, 0, this.dataBuffer, 8, 4);
        this.dataBuffer[0] = this.pixelGridSize;
        this.dataBuffer[1] = mix;
        this.dataBuffer[2] = u;
        this.dataBuffer[3] = v;
        this.dataBuffer[4] = texW;
        this.dataBuffer[5] = texH;
        this.dataBuffer[6] = alpha;
        this.dataBuffer[7] = borderWidth;
        this.dataBuffer[28] = radius.x;
        this.dataBuffer[29] = radius.y;
        this.dataBuffer[30] = radius.z;
        this.dataBuffer[31] = radius.w;
        this.buildQuad(builder, coords.x, coords.y, coords.z, var16_16.w, (Vector4f)var6_6, this.dataBuffer);
    }

    @Override
    @NotNull
    public VertexFormat vertexFormat() {
        VertexFormat vertexFormat = VERTEX_FORMAT;
        Intrinsics.checkNotNullExpressionValue(vertexFormat, "VERTEX_FORMAT");
        return vertexFormat;
    }
}

