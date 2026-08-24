/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.text.Text
 */
package kotakbaz.rain.client.util.render.font;

import java.awt.Color;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotakbaz.rain.client.render.main.ChromaRenderer;
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
import kotakbaz.rain.client.util.render.engine.Renderable;
import kotakbaz.rain.client.util.render.engine.controls.ClientRenderPipeline;
import kotakbaz.rain.client.util.render.font.FontData;
import kotakbaz.rain.client.util.render.font.MsdfGlyph;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import net.minecraft.text.Text;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import oxxxde.\u062a\u062a;
import oxxxde.\u062d\u0641;
import oxxxde.\u0630\u0621;
import oxxxde.\u0630\u0631;
import oxxxde.\u0630\u064c;
import oxxxde.\u0632\u0636;
import oxxxde.\u0633\u0646;
import oxxxde.\u0633\u064b;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\u00c8\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\b\u0007*\u0002\u00ab\u0001\u0018\u0000 \u00ae\u00012\u00020\u0001:\u0006\u00ae\u0001\u00af\u0001\u00b0\u0001B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n\u0012\u001e\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\u000b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000e0\n0\n\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0017\u001a\n \u0016*\u0004\u0018\u00010\u00150\u0015H\u0016\u00a2\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016\u00a2\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c\u00a2\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\u00020\u00002\u0006\u0010!\u001a\u00020 \u00a2\u0006\u0004\b!\u0010\"J\u0015\u0010$\u001a\u00020\u00002\u0006\u0010$\u001a\u00020#\u00a2\u0006\u0004\b$\u0010%J\u0015\u0010&\u001a\u00020\u00002\u0006\u0010$\u001a\u00020#\u00a2\u0006\u0004\b&\u0010%J\u001d\u0010(\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020#\u00a2\u0006\u0004\b(\u0010)J\u0015\u0010(\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u000e\u00a2\u0006\u0004\b(\u0010*J\u0015\u0010+\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\u000e\u00a2\u0006\u0004\b+\u0010*J\u0015\u0010-\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u000e\u00a2\u0006\u0004\b-\u0010*J\u0015\u0010.\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u000e\u00a2\u0006\u0004\b.\u0010*J\u0015\u0010/\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u000e\u00a2\u0006\u0004\b/\u0010*J\u000f\u00101\u001a\u000200H\u0016\u00a2\u0006\u0004\b1\u00102J#\u00107\u001a\u0002002\b\u00104\u001a\u0004\u0018\u0001032\b\u00106\u001a\u0004\u0018\u000105H\u0016\u00a2\u0006\u0004\b7\u00108J-\u0010=\u001a\u00020\u00002\u0006\u00109\u001a\u00020\u000e2\u0006\u0010:\u001a\u00020\u000e2\u0006\u0010;\u001a\u00020\u000e2\u0006\u0010<\u001a\u00020\u000e\u00a2\u0006\u0004\b=\u0010>J\r\u0010?\u001a\u00020\u0000\u00a2\u0006\u0004\b?\u0010@J%\u0010D\u001a\u0002002\u0006\u0010A\u001a\u00020\u00022\u0006\u0010B\u001a\u00020\u000e2\u0006\u0010C\u001a\u00020\u000e\u00a2\u0006\u0004\bD\u0010EJ%\u0010D\u001a\u0002002\u0006\u0010A\u001a\u00020F2\u0006\u0010B\u001a\u00020\u000e2\u0006\u0010C\u001a\u00020\u000e\u00a2\u0006\u0004\bD\u0010GJ%\u0010H\u001a\u0002002\u0006\u0010A\u001a\u00020\u00022\u0006\u0010B\u001a\u00020\u000e2\u0006\u0010C\u001a\u00020\u000e\u00a2\u0006\u0004\bH\u0010EJ%\u0010H\u001a\u0002002\u0006\u0010A\u001a\u00020F2\u0006\u0010B\u001a\u00020\u000e2\u0006\u0010C\u001a\u00020\u000e\u00a2\u0006\u0004\bH\u0010GJ?\u0010D\u001a\u0002002\u0006\u0010A\u001a\u00020F2\u0006\u0010B\u001a\u00020\u000e2\u0006\u0010C\u001a\u00020\u000e2\u0006\u0010+\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020#2\b\b\u0002\u0010(\u001a\u00020\u000e\u00a2\u0006\u0004\bD\u0010IJg\u0010D\u001a\u0002002\u0006\u0010A\u001a\u00020\u00022\u0006\u0010B\u001a\u00020\u000e2\u0006\u0010C\u001a\u00020\u000e2\u0006\u0010+\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020#2\b\b\u0002\u0010(\u001a\u00020\u000e2\b\b\u0002\u0010-\u001a\u00020\u000e2\b\b\u0002\u0010.\u001a\u00020\u000e2\b\b\u0002\u0010J\u001a\u00020\u000b2\b\b\u0002\u0010K\u001a\u00020\u000e\u00a2\u0006\u0004\bD\u0010LJw\u0010P\u001a\u0002002\u0006\u0010A\u001a\u00020\u00022\u0006\u0010B\u001a\u00020\u000e2\u0006\u0010C\u001a\u00020\u000e2\u0006\u0010+\u001a\u00020\u000e2\u0006\u0010M\u001a\u00020#2\u0006\u0010N\u001a\u00020#2\u0006\u0010O\u001a\u00020\u000e2\b\b\u0002\u0010(\u001a\u00020\u000e2\b\b\u0002\u0010-\u001a\u00020\u000e2\b\b\u0002\u0010.\u001a\u00020\u000e2\b\b\u0002\u0010J\u001a\u00020\u000b2\b\b\u0002\u0010K\u001a\u00020\u000e\u00a2\u0006\u0004\bP\u0010QJ_\u0010R\u001a\u0002002\u0006\u0010A\u001a\u00020\u00022\u0006\u0010B\u001a\u00020\u000e2\u0006\u0010C\u001a\u00020\u000e2\u0006\u0010+\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020\u000e2\u0006\u0010.\u001a\u00020\u000e2\u0006\u0010J\u001a\u00020\u000b2\u0006\u0010K\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\bR\u0010SJ]\u0010W\u001a\u0002002\f\u0010V\u001a\b\u0012\u0004\u0012\u00020U0T2\u0006\u0010B\u001a\u00020\u000e2\u0006\u0010C\u001a\u00020\u000e2\u0006\u0010+\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020\u000e2\u0006\u0010.\u001a\u00020\u000e2\u0006\u0010J\u001a\u00020\u000b2\u0006\u0010K\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\bW\u0010XJo\u0010Y\u001a\u0002002\u0006\u0010A\u001a\u00020\u00022\u0006\u0010B\u001a\u00020\u000e2\u0006\u0010C\u001a\u00020\u000e2\u0006\u0010+\u001a\u00020\u000e2\u0006\u0010M\u001a\u00020\u000b2\u0006\u0010N\u001a\u00020\u000b2\u0006\u0010O\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020\u000e2\u0006\u0010.\u001a\u00020\u000e2\u0006\u0010J\u001a\u00020\u000b2\u0006\u0010K\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\bY\u0010ZJw\u0010a\u001a\u0002002\u0006\u0010\\\u001a\u00020[2\u0006\u0010A\u001a\u00020\u00022\u0006\u0010+\u001a\u00020\u000e2\u0006\u0010]\u001a\u00020\u000e2\u0006\u0010.\u001a\u00020\u000e2\u0006\u0010^\u001a\u00020\u000e2\u0006\u0010_\u001a\u00020\u000e2\u0006\u0010`\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020\u000e2\u0006\u0010K\u001a\u00020\u000e2\u0006\u0010J\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\ba\u0010bJ'\u0010c\u001a\u00020\u000e2\u0006\u0010A\u001a\u00020F2\u0006\u0010+\u001a\u00020\u000e2\b\b\u0002\u0010(\u001a\u00020\u000e\u00a2\u0006\u0004\bc\u0010dJ-\u0010c\u001a\u00020\u000e2\f\u0010A\u001a\b\u0012\u0004\u0012\u00020U0T2\u0006\u0010+\u001a\u00020\u000e2\b\b\u0002\u0010(\u001a\u00020\u000e\u00a2\u0006\u0004\bc\u0010eJ'\u0010c\u001a\u00020\u000e2\u0006\u0010A\u001a\u00020\u00022\u0006\u0010+\u001a\u00020\u000e2\b\b\u0002\u0010(\u001a\u00020\u000e\u00a2\u0006\u0004\bc\u0010fJ\u0015\u0010g\u001a\u00020\u000e2\u0006\u0010+\u001a\u00020\u000e\u00a2\u0006\u0004\bg\u0010hJ?\u0010i\u001a\u0002002\u0006\u0010A\u001a\u00020\u00022\u0006\u0010B\u001a\u00020\u000e2\u0006\u0010C\u001a\u00020\u000e2\u0006\u0010+\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020#2\b\b\u0002\u0010(\u001a\u00020\u000e\u00a2\u0006\u0004\bi\u0010jJO\u0010k\u001a\u0002002\u0006\u0010A\u001a\u00020\u00022\u0006\u0010B\u001a\u00020\u000e2\u0006\u0010C\u001a\u00020\u000e2\u0006\u0010+\u001a\u00020\u000e2\u0006\u0010M\u001a\u00020#2\u0006\u0010N\u001a\u00020#2\u0006\u0010O\u001a\u00020\u000e2\b\b\u0002\u0010(\u001a\u00020\u000e\u00a2\u0006\u0004\bk\u0010lJ'\u0010p\u001a\u00020\u000b2\u0006\u0010m\u001a\u00020\u000b2\u0006\u0010n\u001a\u00020\u000b2\u0006\u0010o\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\bp\u0010qJ\r\u0010r\u001a\u00020\u0002\u00a2\u0006\u0004\br\u0010\u0013J\u001f\u0010t\u001a\u00020s2\u0006\u0010+\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\bt\u0010uJ\u0019\u0010w\u001a\u0004\u0018\u00010\f2\u0006\u0010v\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\bw\u0010xJ+\u0010{\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0z2\u0012\u0010y\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0002\u00a2\u0006\u0004\b{\u0010|R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0003\u0010}R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0005\u0010~R\u0019\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000e\n\u0004\b\u0007\u0010\u007f\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001R\u001a\u0010\t\u001a\u00020\b8\u0006\u00a2\u0006\u000f\n\u0005\b\t\u0010\u0082\u0001\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R\u001a\u0010\u0086\u0001\u001a\u00030\u0085\u00018\u0002@\u0002X\u0082.\u00a2\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R\u001a\u0010\u0088\u0001\u001a\u00030\u0085\u00018\u0002@\u0002X\u0082.\u00a2\u0006\b\n\u0006\b\u0088\u0001\u0010\u0087\u0001R\u001a\u0010\u0089\u0001\u001a\u00030\u0085\u00018\u0002@\u0002X\u0082.\u00a2\u0006\b\n\u0006\b\u0089\u0001\u0010\u0087\u0001R\u001a\u0010\u008a\u0001\u001a\u00030\u0085\u00018\u0002@\u0002X\u0082.\u00a2\u0006\b\n\u0006\b\u008a\u0001\u0010\u0087\u0001R\u001a\u0010\u008b\u0001\u001a\u00030\u0085\u00018\u0002@\u0002X\u0082.\u00a2\u0006\b\n\u0006\b\u008b\u0001\u0010\u0087\u0001R\u001a\u0010\u008c\u0001\u001a\u00030\u0085\u00018\u0002@\u0002X\u0082.\u00a2\u0006\b\n\u0006\b\u008c\u0001\u0010\u0087\u0001R\u001a\u0010\u008e\u0001\u001a\u00030\u008d\u00018\u0002@\u0002X\u0082.\u00a2\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001R\u001a\u0010\u0091\u0001\u001a\u00030\u0090\u00018\u0002@\u0002X\u0082.\u00a2\u0006\b\n\u0006\b\u0091\u0001\u0010\u0092\u0001R\u001f\u0010\u0093\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0z8\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001R\u0018\u0010\u0096\u0001\u001a\u00030\u0095\u00018\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u0096\u0001\u0010\u0097\u0001R\u0019\u0010\u0098\u0001\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u0098\u0001\u0010\u0099\u0001R\u0019\u0010\u009a\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u009a\u0001\u0010\u009b\u0001R\u0019\u0010\u009c\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u009c\u0001\u0010\u009b\u0001R\u0019\u0010\u009d\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u009d\u0001\u0010\u009b\u0001R\u0019\u0010\u009e\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u009e\u0001\u0010\u009b\u0001R\u0019\u0010\u009f\u0001\u001a\u00020 8\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u009f\u0001\u0010\u00a0\u0001R\u0019\u0010\u00a1\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u00a1\u0001\u0010\u00a2\u0001R\u0019\u0010\u00a3\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u00a3\u0001\u0010\u00a2\u0001R\u0019\u0010\u00a4\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u00a4\u0001\u0010\u009b\u0001R\u0019\u0010\u00a5\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u00a5\u0001\u0010\u009b\u0001R\u0019\u0010\u00a6\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u00a6\u0001\u0010\u009b\u0001R\u0019\u0010\u00a7\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u00a7\u0001\u0010\u009b\u0001R\u0019\u0010\u00a8\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u00a8\u0001\u0010\u009b\u0001R\u0019\u0010\u00a9\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u00a9\u0001\u0010\u00a2\u0001R\u0019\u0010\u00aa\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u00aa\u0001\u0010\u009b\u0001R\u0018\u0010\u00ac\u0001\u001a\u00030\u00ab\u00018\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u00ac\u0001\u0010\u00ad\u0001\u00a8\u0006\u00b1\u0001"}, d2={"Loxxxde/\u062c\u064b;", "Loxxxde/\u0637\u0621;", "", "fontName", "Loxxxde/\u0637\u062c;", "texture", "Loxxxde/\u0627\u0644;", "atlas", "Loxxxde/\u0635\u0643;", "metrics", "", "", "Loxxxde/\u0634\u064f;", "glyphs", "", "kernings", "<init>", "(Ljava/lang/String;Lkotakbaz/rain/client/render/texture/GlTex;Lkotakbaz/rain/client/util/render/font/FontData$AtlasData;Lkotakbaz/rain/client/util/render/font/FontData$MetricsData;Ljava/util/Map;Ljava/util/Map;)V", "name", "()Ljava/lang/String;", "shader", "Loxxxde/\u0634\u0645;", "kotlin.jvm.PlatformType", "drawMode", "()Lkotakbaz/rain/client/render/main/vertex/DrawMode;", "Loxxxde/\u0633\u0627;", "vertexFormat", "()Lkotakbaz/rain/client/render/main/vertex/format/VertexFormat;", "Loxxxde/\u0635\u0624;", "pipeline", "priority", "(Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;)Lkotakbaz/rain/client/util/render/font/Font;", "", "centered", "(Z)Lkotakbaz/rain/client/util/render/font/Font;", "Ljava/awt/Color;", "color", "(Ljava/awt/Color;)Lkotakbaz/rain/client/util/render/font/Font;", "gradientColor", "width", "thickness", "(FLjava/awt/Color;)Lkotakbaz/rain/client/util/render/font/Font;", "(F)Lkotakbaz/rain/client/util/render/font/Font;", "size", "value", "smoothness", "spacing", "gradientOffset", "", "load", "()V", "Loxxxde/\u0637\u0623;", "mesh", "", "state", "renderBatch", "(Lkotakbaz/rain/client/render/main/vertex/mesh/IMesh;Ljava/lang/Object;)V", "minX", "maxX", "leftWidth", "rightWidth", "setFade", "(FFFF)Lkotakbaz/rain/client/util/render/font/Font;", "resetFade", "()Lkotakbaz/rain/client/util/render/font/Font;", "text", "x", "y", "drawText", "(Ljava/lang/String;FF)V", "Lnet/minecraft/class_2561;", "(Lnet/minecraft/class_2561;FF)V", "drawGradient", "(Lnet/minecraft/class_2561;FFFLjava/awt/Color;F)V", "outlineColor", "outlineThickness", "(Ljava/lang/String;FFFLjava/awt/Color;FFFIF)V", "first", "second", "offset", "drawGradientText", "(Ljava/lang/String;FFFLjava/awt/Color;Ljava/awt/Color;FFFFIF)V", "drawRawString", "(Ljava/lang/String;FFFIFFFIF)V", "", "Loxxxde/\u063a;", "glyphsData", "drawColoredGlyphs", "(Ljava/util/List;FFFFFFIF)V", "drawGradientRaw", "(Ljava/lang/String;FFFIIFFFFIF)V", "Loxxxde/\u0627\u0646;", "builder", "thicknessPadding", "startX", "startY", "z", "applyGlyphs", "(Lkotakbaz/rain/client/render/main/vertex/mesh/MeshBuilder;Ljava/lang/String;FFFFFFIFFFI)V", "getWidth", "(Lnet/minecraft/class_2561;FF)F", "(Ljava/util/List;FF)F", "(Ljava/lang/String;FF)F", "getHeight", "(F)F", "drawCenteredText", "(Ljava/lang/String;FFFLjava/awt/Color;F)V", "drawCenteredGradientText", "(Ljava/lang/String;FFFLjava/awt/Color;Ljava/awt/Color;FF)V", "a", "b", "t", "lerpArgb", "(IIF)I", "id", "", "widthCacheKey", "(FF)J", "code", "glyph", "(I)Lkotakbaz/rain/client/util/render/font/MsdfGlyph;", "source", "", "buildGlyphLookup", "(Ljava/util/Map;)[Lkotakbaz/rain/client/util/render/font/MsdfGlyph;", "Ljava/lang/String;", "Loxxxde/\u0637\u062c;", "Loxxxde/\u0627\u0644;", "getAtlas", "()Lkotakbaz/rain/client/util/render/font/FontData$AtlasData;", "Loxxxde/\u0635\u0643;", "getMetrics", "()Lkotakbaz/rain/client/util/render/font/FontData$MetricsData;", "Loxxxde/\u0633\u0626;", "eTexture", "Loxxxde/\u0633\u0626;", "eColor", "eStyle", "eOutlineColor", "eFade", "eScissor", "Loxxxde/\u0630\u0621;", "rangeUniform", "Loxxxde/\u0630\u0621;", "Loxxxde/\u062e\u0629;", "textureUniform", "Loxxxde/\u062e\u0629;", "glyphLookup", "[Loxxxde/\u0634\u064f;", "Loxxxde/\u0630\u064c;", "kerningLookup", "Loxxxde/\u0630\u064c;", "currentPipeline", "Loxxxde/\u0635\u0624;", "fadeMinX", "F", "fadeMaxX", "fadeLeftWidth", "fadeRightWidth", "stateCentered", "Z", "stateColorArgb", "I", "stateGradientArgb", "stateSize", "stateThickness", "stateSmoothness", "stateSpacing", "stateOutlineThickness", "stateOutlineColorArgb", "stateGradientOffset", "oxxxde/\u062d\u0641", "widthCache", "Loxxxde/\u062d\u0641;", "Companion", "KerningLookup", "WidthCacheEntry", "rain-visuals"})
public final class Font
extends Renderable {
    private static final int WIDTH_CACHE_LIMIT = 2048;
    @NotNull
    private final String fontName;
    private VertexElement eOutlineColor;
    @NotNull
    public static final \u0632\u0636 Companion = new \u0632\u0636(null);
    @NotNull
    private final GlTex texture;
    private float fadeMinX;
    @NotNull
    private final FontData.AtlasData atlas;
    private float stateThickness;
    private float fadeLeftWidth;
    private static final VertexFormat VERTEX_FORMAT = VertexFormat.builder().element("Texture", A.FLOAT, 2).element("Color", A.FLOAT, 4).element("Style", A.FLOAT, 3).element("OutlineColor", A.FLOAT, 4).element("Fade", A.FLOAT, 4).element("Scissor", A.FLOAT, 4).build();
    private float fadeRightWidth;
    private int stateColorArgb;
    private SamplerUniform textureUniform;
    private VertexElement eScissor;
    @Nullable
    private static GlProgram sharedProgram;
    private VertexElement eTexture;
    private static final float INFINITY = 1000000.0f;
    private boolean stateCentered;
    private float stateSmoothness;
    private int stateOutlineColorArgb;
    private float stateSize;
    private VertexElement eColor;
    @NotNull
    private final FontData.MetricsData metrics;
    private float stateOutlineThickness;
    private float stateSpacing;
    private \u0630\u0621 rangeUniform;
    @NotNull
    private ClientRenderPipeline currentPipeline;
    @NotNull
    private final MsdfGlyph[] glyphLookup;
    private static final int WIDTH_VARIANTS_PER_TEXT = 4;
    private VertexElement eFade;
    @NotNull
    private final \u0630\u064c kerningLookup;
    private VertexElement eStyle;
    private float stateGradientOffset;
    @NotNull
    private final \u062d\u0641 widthCache;
    private float fadeMaxX;
    private int stateGradientArgb;

    public final void drawText(@NotNull Text text, float x, float y) {
        Intrinsics.checkNotNullParameter(text, "text");
        List<MsdfGlyph.ColoredGlyph> parsed = \u0633\u064b.INSTANCE.parseTextToColoredGlyphs(\u0633\u0646.INSTANCE.replaceSymbols(text));
        if (parsed.isEmpty()) {
            return;
        }
        float actualX = this.stateCentered ? x - this.getWidth(parsed, this.stateSize, this.stateThickness) * 0.5f : x;
        this.drawColoredGlyphs(parsed, actualX, y, this.stateSize, this.stateThickness, this.stateSmoothness, this.stateSpacing, this.stateOutlineColorArgb, this.stateOutlineThickness);
    }

    @NotNull
    public final Font priority(@NotNull ClientRenderPipeline pipeline) {
        Intrinsics.checkNotNullParameter((Object)pipeline, "pipeline");
        this.currentPipeline = pipeline;
        return this;
    }

    public final void drawCenteredText(@NotNull String text, float x, float y, float size, @NotNull Color color, float thickness) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(color, "color");
        boolean previousCentered = this.stateCentered;
        this.centered(true).size(size).color(color).thickness(thickness).drawText(text, x, y);
        this.stateCentered = previousCentered;
    }

    public static /* synthetic */ void drawText$default(Font font, String string, float f, float f2, float f3, Color color, float f4, float f5, float f6, int n, float f7, int n2, Object object) {
        if ((n2 & 0x20) != 0) {
            f4 = 0.0f;
        }
        if ((n2 & 0x40) != 0) {
            f5 = 0.7f;
        }
        if ((n2 & 0x80) != 0) {
            f6 = 0.0f;
        }
        if ((n2 & 0x100) != 0) {
            n = -1;
        }
        if ((n2 & 0x200) != 0) {
            f7 = f4;
        }
        font.drawText(string, f, f2, f3, color, f4, f5, f6, n, f7);
    }

    /*
     * WARNING - void declaration
     */
    private final MsdfGlyph[] buildGlyphLookup(Map<Integer, MsdfGlyph> source) {
        int maxCode = -1;
        Iterator<Integer> iterator2 = source.keySet().iterator();
        while (iterator2.hasNext()) {
            void var4_4;
            int code = ((Number)iterator2.next()).intValue();
            boolean bl = 0 <= code ? code < 65536 : false;
            if (!bl) continue;
            if (code <= maxCode) continue;
            maxCode = var4_4;
        }
        if (maxCode < 0) {
            return new MsdfGlyph[0];
        }
        MsdfGlyph[] lookup = new MsdfGlyph[maxCode + 1];
        for (Map.Entry<Integer, MsdfGlyph> entry : source.entrySet()) {
            void var7_8;
            int code = ((Number)entry.getKey()).intValue();
            MsdfGlyph glyph = entry.getValue();
            if (code < 0) continue;
            if (code >= lookup.length) continue;
            iterator2[var6_7] = var7_8;
        }
        return iterator2;
    }

    public Font(@NotNull String fontName, @NotNull GlTex texture, @NotNull FontData.AtlasData atlas, @NotNull FontData.MetricsData metrics, @NotNull Map<Integer, MsdfGlyph> glyphs, @NotNull Map<Integer, ? extends Map<Integer, Float>> kernings) {
        Intrinsics.checkNotNullParameter(fontName, "fontName");
        Intrinsics.checkNotNullParameter(texture, "texture");
        Intrinsics.checkNotNullParameter(atlas, "atlas");
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        Intrinsics.checkNotNullParameter(glyphs, "glyphs");
        Intrinsics.checkNotNullParameter(kernings, "kernings");
        this.fontName = fontName;
        this.texture = texture;
        this.atlas = atlas;
        this.metrics = metrics;
        this.glyphLookup = this.buildGlyphLookup(glyphs);
        this.kerningLookup = new \u0630\u064c(kernings);
        this.currentPipeline = ClientRenderPipeline.LOW;
        this.fadeMinX = -1000000.0f;
        this.fadeMaxX = 1000000.0f;
        this.stateColorArgb = Color.WHITE.getRGB();
        this.stateGradientArgb = Color.WHITE.getRGB();
        this.stateSize = 1.0f;
        this.stateSmoothness = 0.5f;
        this.stateOutlineColorArgb = -1;
        this.widthCache = new \u062d\u0641();
    }

    @NotNull
    public final String id() {
        return this.fontName;
    }

    @Override
    public DrawMode drawMode() {
        return DrawMode.QUADS;
    }

    @Override
    @NotNull
    public VertexFormat vertexFormat() {
        VertexFormat vertexFormat = VERTEX_FORMAT;
        Intrinsics.checkNotNullExpressionValue(vertexFormat, "VERTEX_FORMAT");
        return vertexFormat;
    }

    public static /* synthetic */ void drawGradientText$default(Font font, String string, float f, float f2, float f3, Color color, Color color2, float f4, float f5, float f6, float f7, int n, float f8, int n2, Object object) {
        if ((n2 & 0x80) != 0) {
            f5 = 0.0f;
        }
        if ((n2 & 0x100) != 0) {
            f6 = 0.5f;
        }
        if ((n2 & 0x200) != 0) {
            f7 = 0.0f;
        }
        if ((n2 & 0x400) != 0) {
            n = -1;
        }
        if ((n2 & 0x800) != 0) {
            f8 = f5;
        }
        font.drawGradientText(string, f, f2, f3, color, color2, f4, f5, f6, f7, n, f8);
    }

    @NotNull
    public final Font gradientColor(@NotNull Color color) {
        Intrinsics.checkNotNullParameter(color, "color");
        this.stateGradientArgb = color.getRGB();
        return this;
    }

    public static /* synthetic */ void drawCenteredGradientText$default(Font font, String string, float f, float f2, float f3, Color color, Color color2, float f4, float f5, int n, Object object) {
        if ((n & 0x80) != 0) {
            f5 = 0.0f;
        }
        font.drawCenteredGradientText(string, f, f2, f3, color, color2, f4, f5);
    }

    @NotNull
    public final FontData.MetricsData getMetrics() {
        return this.metrics;
    }

    @Override
    public void load() {
        if (sharedProgram == null) {
            sharedProgram = this.createShaderBuilder(this.name(), this.shader(), this.shader()).uniform("uRange", a.FLOAT).sampler("uTexture").build();
        }
        this.setGlProgram(sharedProgram);
        GlProgram glProgram = this.getGlProgram();
        Intrinsics.checkNotNull(glProgram);
        \u0630\u0621 \u0630\u06212 = glProgram.getUniform("uRange", a.FLOAT);
        Intrinsics.checkNotNullExpressionValue(\u0630\u06212, "getUniform(...)");
        this.rangeUniform = \u0630\u06212;
        GlProgram glProgram2 = this.getGlProgram();
        Intrinsics.checkNotNull(glProgram2);
        SamplerUniform samplerUniform = glProgram2.getUniform("uTexture", a.SAMPLER);
        Intrinsics.checkNotNullExpressionValue(samplerUniform, "getUniform(...)");
        this.textureUniform = samplerUniform;
        VertexFormat vf = VERTEX_FORMAT;
        VertexElement vertexElement = vf.getVertexElement("Texture");
        Intrinsics.checkNotNullExpressionValue(vertexElement, "getVertexElement(...)");
        this.eTexture = vertexElement;
        VertexElement vertexElement2 = vf.getVertexElement("Color");
        Intrinsics.checkNotNullExpressionValue(vertexElement2, "getVertexElement(...)");
        this.eColor = vertexElement2;
        VertexElement vertexElement3 = vf.getVertexElement("Style");
        Intrinsics.checkNotNullExpressionValue(vertexElement3, "getVertexElement(...)");
        this.eStyle = vertexElement3;
        VertexElement vertexElement4 = vf.getVertexElement("OutlineColor");
        Intrinsics.checkNotNullExpressionValue(vertexElement4, "getVertexElement(...)");
        this.eOutlineColor = vertexElement4;
        VertexElement vertexElement5 = vf.getVertexElement("Fade");
        Intrinsics.checkNotNullExpressionValue(vertexElement5, "getVertexElement(...)");
        this.eFade = vertexElement5;
        VertexElement vertexElement6 = vf.getVertexElement("Scissor");
        Intrinsics.checkNotNullExpressionValue(vertexElement6, "getVertexElement(...)");
        this.eScissor = vertexElement6;
    }

    @NotNull
    public final Font size(float size) {
        this.stateSize = size;
        return this;
    }

    public final void drawCenteredGradientText(@NotNull String text, float x, float y, float size, @NotNull Color first, @NotNull Color second, float offset, float thickness) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(second, "second");
        boolean previousCentered = this.stateCentered;
        this.centered(true).size(size).color(first).gradientColor(second).gradientOffset(offset).thickness(thickness).drawGradient(text, x, y);
        this.stateCentered = previousCentered;
    }

    @NotNull
    public final Font thickness(float width) {
        this.stateThickness = width;
        this.stateOutlineThickness = width;
        return this;
    }

    /*
     * WARNING - void declaration
     */
    private final void drawGradientRaw(String text, float x, float y, float size, int first, int second, float offset, float thickness, float smoothness, float spacing, int outlineColor, float outlineThickness) {
        float width = RangesKt.coerceAtLeast(this.getWidth(text, size, thickness), 1.0f);
        float start = x + offset;
        float end = start + width;
        MeshBuilder meshBuilder = \u0630\u0631.INSTANCE.getDISPATCHER().getBuilder(this.currentPipeline, this, null);
        if (meshBuilder == null) {
            return;
        }
        MeshBuilder builder = meshBuilder;
        float cursor = x;
        float baselineY = y + this.metrics.baselineHeight() * size;
        int prevChar = -1;
        float fadeMin = this.fadeMinX;
        float fadeMax = this.fadeMaxX;
        float fadeLeft = this.fadeLeftWidth;
        float fadeRight = this.fadeRightWidth;
        int i = 0;
        int n = ((CharSequence)text).length();
        while (i < n) {
            void var24_24;
            char charCode = text.charAt(i);
            if (this.glyph(charCode) != null) {
                void var26_26;
                MsdfGlyph glyph;
                VertexElement vertexElement;
                VertexElement vertexElement2;
                VertexElement vertexElement3;
                VertexElement vertexElement4;
                VertexElement vertexElement5;
                float t = RangesKt.coerceIn(((cursor += this.kerningLookup.get(prevChar, charCode) * size) - start) / (end - start), 0.0f, 1.0f);
                int color = this.lerpArgb(first, second, t);
                VertexElement vertexElement6 = this.eTexture;
                if (vertexElement6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("eTexture");
                    vertexElement6 = null;
                }
                if ((vertexElement5 = this.eColor) == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("eColor");
                    vertexElement5 = null;
                }
                if ((vertexElement4 = this.eStyle) == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("eStyle");
                    vertexElement4 = null;
                }
                if ((vertexElement3 = this.eOutlineColor) == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("eOutlineColor");
                    vertexElement3 = null;
                }
                if ((vertexElement2 = this.eFade) == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("eFade");
                    vertexElement2 = null;
                }
                if ((vertexElement = this.eScissor) == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("eScissor");
                    vertexElement = null;
                }
                float f = cursor + (glyph.apply(builder, cursor, baselineY, 0.0f, size, color, thickness, smoothness, outlineThickness, outlineColor, fadeMin, fadeMax, fadeLeft, fadeRight, vertexElement6, vertexElement5, vertexElement4, vertexElement3, vertexElement2, vertexElement) + spacing);
                void var19_19 = var26_26;
            }
            ++var24_24;
        }
    }

    @NotNull
    public final Font thickness(float width, @NotNull Color color) {
        Intrinsics.checkNotNullParameter(color, "color");
        this.stateThickness = width;
        this.stateOutlineThickness = width;
        this.stateOutlineColorArgb = color.getRGB();
        return this;
    }

    public final void drawText(@NotNull String text, float x, float y, float size, @NotNull Color color, float thickness, float smoothness, float spacing, int outlineColor, float outlineThickness) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(color, "color");
        this.centered(false).size(size).color(color).smoothness(smoothness).spacing(spacing).thickness(thickness);
        this.stateOutlineColorArgb = outlineColor;
        this.stateOutlineThickness = outlineThickness;
        this.drawText(text, x, y);
    }

    @Override
    @NotNull
    public String shader() {
        return "font/text";
    }

    public final float getHeight(float size) {
        return size;
    }

    /*
     * WARNING - void declaration
     */
    private final int lerpArgb(int a2, int b2, float t) {
        void var16_16;
        float clamped = RangesKt.coerceIn(t, 0.0f, 1.0f);
        int aA = a2 >>> 24 & 0xFF;
        int aR = a2 >>> 16 & 0xFF;
        int aG = a2 >>> 8 & 0xFF;
        int aB = a2 & 0xFF;
        int bA = b2 >>> 24 & 0xFF;
        int bR = b2 >>> 16 & 0xFF;
        int bG = b2 >>> 8 & 0xFF;
        int bB = b2 & 0xFF;
        int oA = (int)((float)aA + (float)(bA - aA) * clamped);
        int oR = (int)((float)aR + (float)(bR - aR) * clamped);
        int oG = (int)((float)aG + (float)(bG - aG) * clamped);
        int oB = (int)((float)aB + (float)(bB - aB) * clamped);
        return oA << 24 | oR << 16 | oG << 8 | var16_16;
    }

    @NotNull
    public final Font centered(boolean centered) {
        this.stateCentered = centered;
        return this;
    }

    /*
     * WARNING - void declaration
     */
    private final void applyGlyphs(MeshBuilder builder, String text, float size, float thicknessPadding, float spacing, float startX, float startY, float z, int color, float thickness, float smoothness, float outlineThickness, int outlineColor) {
        float x = startX;
        int prevChar = -1;
        float fadeMin = this.fadeMinX;
        float fadeMax = this.fadeMaxX;
        float fadeLeft = this.fadeLeftWidth;
        float fadeRight = this.fadeRightWidth;
        int i = 0;
        int n = ((CharSequence)text).length();
        while (i < n) {
            void var20_20;
            char charCode = text.charAt(i);
            if (this.glyph(charCode) != null) {
                void var22_22;
                MsdfGlyph glyph;
                VertexElement vertexElement;
                VertexElement vertexElement2;
                VertexElement vertexElement3;
                VertexElement vertexElement4;
                VertexElement vertexElement5;
                x += this.kerningLookup.get(prevChar, charCode) * size;
                VertexElement vertexElement6 = this.eTexture;
                if (vertexElement6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("eTexture");
                    vertexElement6 = null;
                }
                if ((vertexElement5 = this.eColor) == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("eColor");
                    vertexElement5 = null;
                }
                if ((vertexElement4 = this.eStyle) == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("eStyle");
                    vertexElement4 = null;
                }
                if ((vertexElement3 = this.eOutlineColor) == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("eOutlineColor");
                    vertexElement3 = null;
                }
                if ((vertexElement2 = this.eFade) == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("eFade");
                    vertexElement2 = null;
                }
                if ((vertexElement = this.eScissor) == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("eScissor");
                    vertexElement = null;
                }
                x += glyph.apply(builder, x, startY, z, size, color, thickness, smoothness, outlineThickness, outlineColor, fadeMin, fadeMax, fadeLeft, fadeRight, vertexElement6, vertexElement5, vertexElement4, vertexElement3, vertexElement2, vertexElement) + thicknessPadding + spacing;
                void var15_15 = var22_22;
            }
            ++var20_20;
        }
    }

    public static /* synthetic */ float getWidth$default(Font font, String string, float f, float f2, int n, Object object) {
        if ((n & 4) != 0) {
            f2 = 0.0f;
        }
        return font.getWidth(string, f, f2);
    }

    public final void drawText(@NotNull String text, float x, float y) {
        Intrinsics.checkNotNullParameter(text, "text");
        String replaced = \u0633\u0646.INSTANCE.replaceSymbols(text);
        boolean bl = ((CharSequence)replaced).length() == 0;
        if (bl) {
            return;
        }
        float actualX = this.stateCentered ? x - this.getWidth(replaced, this.stateSize, this.stateThickness) * 0.5f : x;
        this.drawRawString(replaced, actualX, y, this.stateSize, this.stateColorArgb, this.stateThickness, this.stateSmoothness, this.stateSpacing, this.stateOutlineColorArgb, this.stateOutlineThickness);
    }

    public static /* synthetic */ float getWidth$default(Font font, List list, float f, float f2, int n, Object object) {
        if ((n & 4) != 0) {
            f2 = 0.0f;
        }
        return font.getWidth(list, f, f2);
    }

    private final long widthCacheKey(float size, float thickness) {
        return (long)Float.floatToRawIntBits(size) << 32 | (long)Float.floatToRawIntBits(thickness) & 0xFFFFFFFFL;
    }

    @NotNull
    public final FontData.AtlasData getAtlas() {
        return this.atlas;
    }

    @NotNull
    public final Font setFade(float minX, float maxX, float leftWidth, float rightWidth) {
        this.fadeMinX = minX;
        this.fadeMaxX = maxX;
        this.fadeLeftWidth = leftWidth;
        this.fadeRightWidth = rightWidth;
        return this;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void renderBatch(@Nullable IMesh mesh, @Nullable Object state) {
        void var1_1;
        GlProgram glProgram = this.getGlProgram();
        if (glProgram == null) {
            return;
        }
        GlProgram program = glProgram;
        \u0630\u0621 \u0630\u06212 = this.rangeUniform;
        if (\u0630\u06212 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rangeUniform");
            \u0630\u06212 = null;
        }
        \u0630\u06212.set(this.atlas.getRange());
        SamplerUniform samplerUniform = this.textureUniform;
        if (samplerUniform == null) {
            Intrinsics.throwUninitializedPropertyAccessException("textureUniform");
            samplerUniform = null;
        }
        samplerUniform.set(this.texture);
        ChromaRenderer.setGlobalProgram(program);
        ChromaRenderer.initMatrix();
        ChromaRenderer.draw((IMesh)var1_1);
    }

    public static /* synthetic */ void drawText$default(Font font, Text text, float f, float f2, float f3, Color color, float f4, int n, Object object) {
        if ((n & 0x20) != 0) {
            f4 = 0.0f;
        }
        font.drawText(text, f, f2, f3, color, f4);
    }

    @NotNull
    public final Font spacing(float value) {
        this.stateSpacing = value;
        return this;
    }

    /*
     * WARNING - void declaration
     */
    public final float getWidth(@NotNull String text, float size, float thickness) {
        void var8_8;
        float cached;
        Intrinsics.checkNotNullParameter(text, "text");
        boolean bl = ((CharSequence)text).length() == 0;
        if (bl) {
            return 0.0f;
        }
        long cacheKey = this.widthCacheKey(size, thickness);
        \u062a\u062a cacheEntry = (\u062a\u062a)this.widthCache.get((Object)text);
        if (cacheEntry != null && !Float.isNaN(cached = cacheEntry.get(cacheKey))) {
            return cached;
        }
        int prevChar = -1;
        float width = 0.0f;
        int i = 0;
        int n = ((CharSequence)text).length();
        while (i < n) {
            void var9_9;
            char charCode = text.charAt(i);
            if (this.glyph(charCode) != null) {
                MsdfGlyph glyph;
                width += this.kerningLookup.get(prevChar, charCode) * size * (1.0f + thickness);
                width += glyph.width(size) * (1.0f + thickness);
                prevChar = charCode;
            }
            ++var9_9;
        }
        \u062a\u062a \u062a\u062a2 = cacheEntry;
        if (\u062a\u062a2 == null) {
            void var10_12;
            \u062a\u062a \u062a\u062a3;
            \u062a\u062a it = \u062a\u062a3 = new \u062a\u062a();
            boolean bl2 = false;
            ((Map)this.widthCache).put(text, var10_12);
            \u062a\u062a2 = \u062a\u062a3;
        }
        \u062a\u062a2.put(cacheKey, (float)var8_8);
        return (float)var8_8;
    }

    @NotNull
    public final Font color(@NotNull Color color) {
        Intrinsics.checkNotNullParameter(color, "color");
        this.stateColorArgb = color.getRGB();
        return this;
    }

    public static /* synthetic */ void drawCenteredText$default(Font font, String string, float f, float f2, float f3, Color color, float f4, int n, Object object) {
        if ((n & 0x20) != 0) {
            f4 = 0.0f;
        }
        font.drawCenteredText(string, f, f2, f3, color, f4);
    }

    @NotNull
    public final Font smoothness(float value) {
        this.stateSmoothness = value;
        return this;
    }

    /*
     * WARNING - void declaration
     */
    public final float getWidth(@NotNull List<MsdfGlyph.ColoredGlyph> text, float size, float thickness) {
        void var5_5;
        Intrinsics.checkNotNullParameter(text, "text");
        int prevChar = -1;
        float width = 0.0f;
        for (MsdfGlyph.ColoredGlyph glyphData : text) {
            void var8_8;
            MsdfGlyph glyph;
            char charCode = glyphData.getC();
            if (this.glyph(charCode) == null) continue;
            width += this.kerningLookup.get(prevChar, charCode) * size * (1.0f + thickness);
            width += glyph.width(size) * (1.0f + thickness);
            prevChar = var8_8;
        }
        return (float)var5_5;
    }

    @Override
    @NotNull
    public String name() {
        return "font";
    }

    public final float getWidth(@NotNull Text text, float size, float thickness) {
        Intrinsics.checkNotNullParameter(text, "text");
        return this.getWidth(\u0633\u064b.INSTANCE.parseTextToColoredGlyphs(text), size, thickness);
    }

    /*
     * WARNING - void declaration
     */
    private final void drawColoredGlyphs(List<MsdfGlyph.ColoredGlyph> glyphsData, float x, float y, float size, float thickness, float smoothness, float spacing, int outlineColor, float outlineThickness) {
        MeshBuilder meshBuilder = \u0630\u0631.INSTANCE.getDISPATCHER().getBuilder(this.currentPipeline, this, null);
        if (meshBuilder == null) {
            return;
        }
        MeshBuilder builder = meshBuilder;
        float cursor = x;
        float baselineY = y + this.metrics.baselineHeight() * size;
        float fadeMin = this.fadeMinX;
        float fadeMax = this.fadeMaxX;
        float fadeLeft = this.fadeLeftWidth;
        float fadeRight = this.fadeRightWidth;
        float thicknessPadding = (thickness + outlineThickness * 0.5f) * 0.5f * size;
        int prevChar = -1;
        for (MsdfGlyph.ColoredGlyph glyphData : glyphsData) {
            void var21_21;
            MsdfGlyph glyph;
            VertexElement vertexElement;
            VertexElement vertexElement2;
            VertexElement vertexElement3;
            VertexElement vertexElement4;
            VertexElement vertexElement5;
            char charCode = glyphData.getC();
            if (this.glyph(charCode) == null) continue;
            cursor += this.kerningLookup.get(prevChar, charCode) * size;
            int n = glyphData.getColor();
            VertexElement vertexElement6 = this.eTexture;
            if (vertexElement6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("eTexture");
                vertexElement6 = null;
            }
            if ((vertexElement5 = this.eColor) == null) {
                Intrinsics.throwUninitializedPropertyAccessException("eColor");
                vertexElement5 = null;
            }
            if ((vertexElement4 = this.eStyle) == null) {
                Intrinsics.throwUninitializedPropertyAccessException("eStyle");
                vertexElement4 = null;
            }
            if ((vertexElement3 = this.eOutlineColor) == null) {
                Intrinsics.throwUninitializedPropertyAccessException("eOutlineColor");
                vertexElement3 = null;
            }
            if ((vertexElement2 = this.eFade) == null) {
                Intrinsics.throwUninitializedPropertyAccessException("eFade");
                vertexElement2 = null;
            }
            if ((vertexElement = this.eScissor) == null) {
                Intrinsics.throwUninitializedPropertyAccessException("eScissor");
                vertexElement = null;
            }
            cursor += glyph.apply(builder, cursor, baselineY, 0.0f, size, n, thickness, smoothness, outlineThickness, outlineColor, fadeMin, fadeMax, fadeLeft, fadeRight, vertexElement6, vertexElement5, vertexElement4, vertexElement3, vertexElement2, vertexElement) + thicknessPadding + spacing;
            void var18_18 = var21_21;
        }
    }

    @NotNull
    public final Font gradientOffset(float value) {
        this.stateGradientOffset = value;
        return this;
    }

    public final void drawGradient(@NotNull Text text, float x, float y) {
        Intrinsics.checkNotNullParameter(text, "text");
        String string = text.getString();
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        this.drawGradient(string, x, y);
    }

    public static /* synthetic */ float getWidth$default(Font font, Text text, float f, float f2, int n, Object object) {
        if ((n & 4) != 0) {
            f2 = 0.0f;
        }
        return font.getWidth(text, f, f2);
    }

    public final void drawGradient(@NotNull String text, float x, float y) {
        Intrinsics.checkNotNullParameter(text, "text");
        String replaced = \u0633\u0646.INSTANCE.replaceSymbols(text);
        boolean bl = ((CharSequence)replaced).length() == 0;
        if (bl) {
            return;
        }
        float actualX = this.stateCentered ? x - this.getWidth(replaced, this.stateSize, this.stateThickness) * 0.5f : x;
        this.drawGradientRaw(replaced, actualX, y, this.stateSize, this.stateColorArgb, this.stateGradientArgb, this.stateGradientOffset, this.stateThickness, this.stateSmoothness, this.stateSpacing, this.stateOutlineColorArgb, this.stateOutlineThickness);
    }

    private final void drawRawString(String text, float x, float y, float size, int color, float thickness, float smoothness, float spacing, int outlineColor, float outlineThickness) {
        MeshBuilder meshBuilder = \u0630\u0631.INSTANCE.getDISPATCHER().getBuilder(this.currentPipeline, this, null);
        if (meshBuilder == null) {
            return;
        }
        MeshBuilder builder = meshBuilder;
        float baselineY = y + this.metrics.baselineHeight() * size;
        this.applyGlyphs(builder, text, size, (thickness + outlineThickness * 0.5f) * 0.5f * size, spacing, x, baselineY, 0.0f, color, thickness, smoothness, outlineThickness, outlineColor);
    }

    public final void drawGradientText(@NotNull String text, float x, float y, float size, @NotNull Color first, @NotNull Color second, float offset, float thickness, float smoothness, float spacing, int outlineColor, float outlineThickness) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(second, "second");
        this.centered(false).size(size).color(first).gradientColor(second).gradientOffset(offset).smoothness(smoothness).spacing(spacing).thickness(thickness);
        this.stateOutlineColorArgb = outlineColor;
        this.stateOutlineThickness = outlineThickness;
        this.drawGradient(text, x, y);
    }

    @NotNull
    public final Font resetFade() {
        return this.setFade(-1000000.0f, 1000000.0f, 0.0f, 0.0f);
    }

    public final void drawText(@NotNull Text text, float x, float y, float size, @NotNull Color color, float thickness) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(color, "color");
        this.centered(false).size(size).color(color).thickness(thickness).drawText(text, x, y);
    }

    private final MsdfGlyph glyph(int code) {
        return code >= 0 && code < this.glyphLookup.length ? this.glyphLookup[code] : null;
    }
}

