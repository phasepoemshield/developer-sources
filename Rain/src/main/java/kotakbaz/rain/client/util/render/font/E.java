/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client.util.render.font;

import java.awt.Color;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import kotakbaz.rain.client.render.main.ChromaRenderer;
import kotakbaz.rain.client.render.main.vertex.element.a;
import kotakbaz.rain.client.render.main.vertex.mesh.b;
import kotakbaz.rain.client.util.other.ReplaceUtil;
import kotakbaz.rain.client.util.other.TextUtil;
import kotakbaz.rain.client.util.render.RenderUtils;
import kotakbaz.rain.client.util.render.engine.Renderable;
import kotakbaz.rain.client.util.render.engine.controls.ClientRenderPipeline;
import kotakbaz.rain.client.util.render.font.A;
import kotakbaz.rain.client.util.render.font.MsdfGlyph;
import kotakbaz.rain.client.util.render.font.a_0;
import kotakbaz.rain.client.util.render.font.b_0;
import kotakbaz.rain.client.util.render.font.f;
import kotakbaz.rain.client.util.render.font.f_0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import net.minecraft.text.Text;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u001c\u0018\u0000 \u0097\u00012\u00020\u0001:\u0002\u0097\u0001B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\n\u0012\u001e\u0010\u000e\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r0\n0\n\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0016\u001a\n \u0015*\u0004\u0018\u00010\u00140\u0014H\u0016\u00a2\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016\u00a2\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b\u00a2\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u001f\u00a2\u0006\u0004\b \u0010!J\u0015\u0010#\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\"\u00a2\u0006\u0004\b#\u0010$J\u0015\u0010%\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\"\u00a2\u0006\u0004\b%\u0010$J\u001d\u0010'\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\r2\u0006\u0010#\u001a\u00020\"\u00a2\u0006\u0004\b'\u0010(J\u0015\u0010'\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\r\u00a2\u0006\u0004\b'\u0010)J\u0015\u0010*\u001a\u00020\u00002\u0006\u0010*\u001a\u00020\r\u00a2\u0006\u0004\b*\u0010)J\u0015\u0010,\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\r\u00a2\u0006\u0004\b,\u0010)J\u0015\u0010-\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\r\u00a2\u0006\u0004\b-\u0010)J\u0015\u0010.\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\r\u00a2\u0006\u0004\b.\u0010)J\u000f\u00100\u001a\u00020/H\u0016\u00a2\u0006\u0004\b0\u00101J#\u00106\u001a\u00020/2\b\u00103\u001a\u0004\u0018\u0001022\b\u00105\u001a\u0004\u0018\u000104H\u0016\u00a2\u0006\u0004\b6\u00107J-\u0010<\u001a\u00020\u00002\u0006\u00108\u001a\u00020\r2\u0006\u00109\u001a\u00020\r2\u0006\u0010:\u001a\u00020\r2\u0006\u0010;\u001a\u00020\r\u00a2\u0006\u0004\b<\u0010=J\r\u0010>\u001a\u00020\u0000\u00a2\u0006\u0004\b>\u0010?J%\u0010C\u001a\u00020/2\u0006\u0010@\u001a\u00020\u00022\u0006\u0010A\u001a\u00020\r2\u0006\u0010B\u001a\u00020\r\u00a2\u0006\u0004\bC\u0010DJ%\u0010C\u001a\u00020/2\u0006\u0010@\u001a\u00020E2\u0006\u0010A\u001a\u00020\r2\u0006\u0010B\u001a\u00020\r\u00a2\u0006\u0004\bC\u0010FJ%\u0010G\u001a\u00020/2\u0006\u0010@\u001a\u00020\u00022\u0006\u0010A\u001a\u00020\r2\u0006\u0010B\u001a\u00020\r\u00a2\u0006\u0004\bG\u0010DJ%\u0010G\u001a\u00020/2\u0006\u0010@\u001a\u00020E2\u0006\u0010A\u001a\u00020\r2\u0006\u0010B\u001a\u00020\r\u00a2\u0006\u0004\bG\u0010FJ?\u0010C\u001a\u00020/2\u0006\u0010@\u001a\u00020E2\u0006\u0010A\u001a\u00020\r2\u0006\u0010B\u001a\u00020\r2\u0006\u0010*\u001a\u00020\r2\u0006\u0010#\u001a\u00020\"2\b\b\u0002\u0010'\u001a\u00020\r\u00a2\u0006\u0004\bC\u0010HJg\u0010C\u001a\u00020/2\u0006\u0010@\u001a\u00020\u00022\u0006\u0010A\u001a\u00020\r2\u0006\u0010B\u001a\u00020\r2\u0006\u0010*\u001a\u00020\r2\u0006\u0010#\u001a\u00020\"2\b\b\u0002\u0010'\u001a\u00020\r2\b\b\u0002\u0010,\u001a\u00020\r2\b\b\u0002\u0010-\u001a\u00020\r2\b\b\u0002\u0010J\u001a\u00020I2\b\b\u0002\u0010K\u001a\u00020\r\u00a2\u0006\u0004\bC\u0010LJw\u0010P\u001a\u00020/2\u0006\u0010@\u001a\u00020\u00022\u0006\u0010A\u001a\u00020\r2\u0006\u0010B\u001a\u00020\r2\u0006\u0010*\u001a\u00020\r2\u0006\u0010M\u001a\u00020\"2\u0006\u0010N\u001a\u00020\"2\u0006\u0010O\u001a\u00020\r2\b\b\u0002\u0010'\u001a\u00020\r2\b\b\u0002\u0010,\u001a\u00020\r2\b\b\u0002\u0010-\u001a\u00020\r2\b\b\u0002\u0010J\u001a\u00020I2\b\b\u0002\u0010K\u001a\u00020\r\u00a2\u0006\u0004\bP\u0010QJ_\u0010R\u001a\u00020/2\u0006\u0010@\u001a\u00020\u00022\u0006\u0010A\u001a\u00020\r2\u0006\u0010B\u001a\u00020\r2\u0006\u0010*\u001a\u00020\r2\u0006\u0010#\u001a\u00020I2\u0006\u0010'\u001a\u00020\r2\u0006\u0010,\u001a\u00020\r2\u0006\u0010-\u001a\u00020\r2\u0006\u0010J\u001a\u00020I2\u0006\u0010K\u001a\u00020\rH\u0002\u00a2\u0006\u0004\bR\u0010SJ]\u0010W\u001a\u00020/2\f\u0010V\u001a\b\u0012\u0004\u0012\u00020U0T2\u0006\u0010A\u001a\u00020\r2\u0006\u0010B\u001a\u00020\r2\u0006\u0010*\u001a\u00020\r2\u0006\u0010'\u001a\u00020\r2\u0006\u0010,\u001a\u00020\r2\u0006\u0010-\u001a\u00020\r2\u0006\u0010J\u001a\u00020I2\u0006\u0010K\u001a\u00020\rH\u0002\u00a2\u0006\u0004\bW\u0010XJo\u0010Y\u001a\u00020/2\u0006\u0010@\u001a\u00020\u00022\u0006\u0010A\u001a\u00020\r2\u0006\u0010B\u001a\u00020\r2\u0006\u0010*\u001a\u00020\r2\u0006\u0010M\u001a\u00020I2\u0006\u0010N\u001a\u00020I2\u0006\u0010O\u001a\u00020\r2\u0006\u0010'\u001a\u00020\r2\u0006\u0010,\u001a\u00020\r2\u0006\u0010-\u001a\u00020\r2\u0006\u0010J\u001a\u00020I2\u0006\u0010K\u001a\u00020\rH\u0002\u00a2\u0006\u0004\bY\u0010ZJw\u0010a\u001a\u00020/2\u0006\u0010\\\u001a\u00020[2\u0006\u0010@\u001a\u00020\u00022\u0006\u0010*\u001a\u00020\r2\u0006\u0010]\u001a\u00020\r2\u0006\u0010-\u001a\u00020\r2\u0006\u0010^\u001a\u00020\r2\u0006\u0010_\u001a\u00020\r2\u0006\u0010`\u001a\u00020\r2\u0006\u0010#\u001a\u00020I2\u0006\u0010'\u001a\u00020\r2\u0006\u0010,\u001a\u00020\r2\u0006\u0010K\u001a\u00020\r2\u0006\u0010J\u001a\u00020IH\u0002\u00a2\u0006\u0004\ba\u0010bJ'\u0010c\u001a\u00020\r2\u0006\u0010@\u001a\u00020E2\u0006\u0010*\u001a\u00020\r2\b\b\u0002\u0010'\u001a\u00020\r\u00a2\u0006\u0004\bc\u0010dJ-\u0010c\u001a\u00020\r2\f\u0010@\u001a\b\u0012\u0004\u0012\u00020U0T2\u0006\u0010*\u001a\u00020\r2\b\b\u0002\u0010'\u001a\u00020\r\u00a2\u0006\u0004\bc\u0010eJ'\u0010c\u001a\u00020\r2\u0006\u0010@\u001a\u00020\u00022\u0006\u0010*\u001a\u00020\r2\b\b\u0002\u0010'\u001a\u00020\r\u00a2\u0006\u0004\bc\u0010fJ\u0015\u0010g\u001a\u00020\r2\u0006\u0010*\u001a\u00020\r\u00a2\u0006\u0004\bg\u0010hJ?\u0010i\u001a\u00020/2\u0006\u0010@\u001a\u00020\u00022\u0006\u0010A\u001a\u00020\r2\u0006\u0010B\u001a\u00020\r2\u0006\u0010*\u001a\u00020\r2\u0006\u0010#\u001a\u00020\"2\b\b\u0002\u0010'\u001a\u00020\r\u00a2\u0006\u0004\bi\u0010jJO\u0010k\u001a\u00020/2\u0006\u0010@\u001a\u00020\u00022\u0006\u0010A\u001a\u00020\r2\u0006\u0010B\u001a\u00020\r2\u0006\u0010*\u001a\u00020\r2\u0006\u0010M\u001a\u00020\"2\u0006\u0010N\u001a\u00020\"2\u0006\u0010O\u001a\u00020\r2\b\b\u0002\u0010'\u001a\u00020\r\u00a2\u0006\u0004\bk\u0010lJ'\u0010p\u001a\u00020I2\u0006\u0010m\u001a\u00020I2\u0006\u0010n\u001a\u00020I2\u0006\u0010o\u001a\u00020\rH\u0002\u00a2\u0006\u0004\bp\u0010qJ\r\u0010r\u001a\u00020\u0002\u00a2\u0006\u0004\br\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0003\u0010sR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0005\u0010tR\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\f\n\u0004\b\u0007\u0010u\u001a\u0004\bv\u0010wR\u0017\u0010\t\u001a\u00020\b8\u0006\u00a2\u0006\f\n\u0004\b\t\u0010x\u001a\u0004\by\u0010zR \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\f\u0010{R,\u0010\u000e\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r0\n0\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u000e\u0010{R\u0016\u0010}\u001a\u00020|8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\b}\u0010~R\u0016\u0010\u007f\u001a\u00020|8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\b\u007f\u0010~R\u0018\u0010\u0080\u0001\u001a\u00020|8\u0002@\u0002X\u0082.\u00a2\u0006\u0007\n\u0005\b\u0080\u0001\u0010~R\u0018\u0010\u0081\u0001\u001a\u00020|8\u0002@\u0002X\u0082.\u00a2\u0006\u0007\n\u0005\b\u0081\u0001\u0010~R\u0018\u0010\u0082\u0001\u001a\u00020|8\u0002@\u0002X\u0082.\u00a2\u0006\u0007\n\u0005\b\u0082\u0001\u0010~R\u0018\u0010\u0083\u0001\u001a\u00020|8\u0002@\u0002X\u0082.\u00a2\u0006\u0007\n\u0005\b\u0083\u0001\u0010~R\u0019\u0010\u0084\u0001\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0019\u0010\u0086\u0001\u001a\u00020\r8\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R\u0019\u0010\u0088\u0001\u001a\u00020\r8\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u0088\u0001\u0010\u0087\u0001R\u0019\u0010\u0089\u0001\u001a\u00020\r8\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u0089\u0001\u0010\u0087\u0001R\u0019\u0010\u008a\u0001\u001a\u00020\r8\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u008a\u0001\u0010\u0087\u0001R\u0019\u0010\u008b\u0001\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0019\u0010\u008d\u0001\u001a\u00020I8\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001R\u0019\u0010\u008f\u0001\u001a\u00020I8\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u008f\u0001\u0010\u008e\u0001R\u0019\u0010\u0090\u0001\u001a\u00020\r8\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u0090\u0001\u0010\u0087\u0001R\u0019\u0010\u0091\u0001\u001a\u00020\r8\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u0091\u0001\u0010\u0087\u0001R\u0019\u0010\u0092\u0001\u001a\u00020\r8\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u0092\u0001\u0010\u0087\u0001R\u0019\u0010\u0093\u0001\u001a\u00020\r8\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u0093\u0001\u0010\u0087\u0001R\u0019\u0010\u0094\u0001\u001a\u00020\r8\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u0094\u0001\u0010\u0087\u0001R\u0019\u0010\u0095\u0001\u001a\u00020I8\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u0095\u0001\u0010\u008e\u0001R\u0019\u0010\u0096\u0001\u001a\u00020\r8\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u0096\u0001\u0010\u0087\u0001\u00a8\u0006\u0098\u0001"}, d2={"Lkotakbaz/rain/client/util/render/font/Font;", "Lkotakbaz/rain/client/util/render/engine/Renderable;", "", "fontName", "Lkotakbaz/rain/client/render/texture/GlTex;", "texture", "Lkotakbaz/rain/client/util/render/font/FontData$AtlasData;", "atlas", "Lkotakbaz/rain/client/util/render/font/FontData$MetricsData;", "metrics", "", "Lkotakbaz/rain/client/util/render/font/MsdfGlyph;", "glyphs", "", "kernings", "<init>", "(Ljava/lang/String;Lkotakbaz/rain/client/render/texture/GlTex;Lkotakbaz/rain/client/util/render/font/FontData$AtlasData;Lkotakbaz/rain/client/util/render/font/FontData$MetricsData;Ljava/util/Map;Ljava/util/Map;)V", "name", "()Ljava/lang/String;", "shader", "Lkotakbaz/rain/client/render/main/vertex/DrawMode;", "kotlin.jvm.PlatformType", "drawMode", "()Lkotakbaz/rain/client/render/main/vertex/DrawMode;", "Lkotakbaz/rain/client/render/main/vertex/format/VertexFormat;", "vertexFormat", "()Lkotakbaz/rain/client/render/main/vertex/format/VertexFormat;", "Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;", "pipeline", "priority", "(Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;)Lkotakbaz/rain/client/util/render/font/Font;", "", "centered", "(Z)Lkotakbaz/rain/client/util/render/font/Font;", "Ljava/awt/Color;", "color", "(Ljava/awt/Color;)Lkotakbaz/rain/client/util/render/font/Font;", "gradientColor", "width", "thickness", "(FLjava/awt/Color;)Lkotakbaz/rain/client/util/render/font/Font;", "(F)Lkotakbaz/rain/client/util/render/font/Font;", "size", "value", "smoothness", "spacing", "gradientOffset", "", "load", "()V", "Lkotakbaz/rain/client/render/main/vertex/mesh/IMesh;", "mesh", "", "state", "renderBatch", "(Lkotakbaz/rain/client/render/main/vertex/mesh/IMesh;Ljava/lang/Object;)V", "minX", "maxX", "leftWidth", "rightWidth", "setFade", "(FFFF)Lkotakbaz/rain/client/util/render/font/Font;", "resetFade", "()Lkotakbaz/rain/client/util/render/font/Font;", "text", "x", "y", "drawText", "(Ljava/lang/String;FF)V", "Lnet/minecraft/class_2561;", "(Lnet/minecraft/class_2561;FF)V", "drawGradient", "(Lnet/minecraft/class_2561;FFFLjava/awt/Color;F)V", "", "outlineColor", "outlineThickness", "(Ljava/lang/String;FFFLjava/awt/Color;FFFIF)V", "first", "second", "offset", "drawGradientText", "(Ljava/lang/String;FFFLjava/awt/Color;Ljava/awt/Color;FFFFIF)V", "drawRawString", "(Ljava/lang/String;FFFIFFFIF)V", "", "Lkotakbaz/rain/client/util/render/font/MsdfGlyph$ColoredGlyph;", "glyphsData", "drawColoredGlyphs", "(Ljava/util/List;FFFFFFIF)V", "drawGradientRaw", "(Ljava/lang/String;FFFIIFFFFIF)V", "Lkotakbaz/rain/client/render/main/vertex/mesh/MeshBuilder;", "builder", "thicknessPadding", "startX", "startY", "z", "applyGlyphs", "(Lkotakbaz/rain/client/render/main/vertex/mesh/MeshBuilder;Ljava/lang/String;FFFFFFIFFFI)V", "getWidth", "(Lnet/minecraft/class_2561;FF)F", "(Ljava/util/List;FF)F", "(Ljava/lang/String;FF)F", "getHeight", "(F)F", "drawCenteredText", "(Ljava/lang/String;FFFLjava/awt/Color;F)V", "drawCenteredGradientText", "(Ljava/lang/String;FFFLjava/awt/Color;Ljava/awt/Color;FF)V", "a", "b", "t", "lerpArgb", "(IIF)I", "id", "Ljava/lang/String;", "Lkotakbaz/rain/client/render/texture/GlTex;", "Lkotakbaz/rain/client/util/render/font/FontData$AtlasData;", "getAtlas", "()Lkotakbaz/rain/client/util/render/font/FontData$AtlasData;", "Lkotakbaz/rain/client/util/render/font/FontData$MetricsData;", "getMetrics", "()Lkotakbaz/rain/client/util/render/font/FontData$MetricsData;", "Ljava/util/Map;", "Lkotakbaz/rain/client/render/main/vertex/element/VertexElement;", "eTexture", "Lkotakbaz/rain/client/render/main/vertex/element/VertexElement;", "eColor", "eStyle", "eOutlineColor", "eFade", "eScissor", "currentPipeline", "Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;", "fadeMinX", "F", "fadeMaxX", "fadeLeftWidth", "fadeRightWidth", "stateCentered", "Z", "stateColorArgb", "I", "stateGradientArgb", "stateSize", "stateThickness", "stateSmoothness", "stateSpacing", "stateOutlineThickness", "stateOutlineColorArgb", "stateGradientOffset", "Companion", "rain-visuals"})
@SourceDebugExtension(value={"SMAP\nFont.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Font.kt\nkotakbaz/rain/client/util/render/font/Font\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,595:1\n1#2:596\n*E\n"})
public final class E
extends Renderable {
    @NotNull
    public static final a_0 h;
    @NotNull
    private final String a;
    @NotNull
    private final kotakbaz.rain.client.render.texture.A A;
    @NotNull
    private final f_0 b;
    @NotNull
    private final b_0 B;
    @NotNull
    private final Map<String, MsdfGlyph> c;
    @NotNull
    private final Map<String, Map<String, Float>> C;
    private a d;
    private a D;
    private a e;
    private a E;
    private a f;
    private a F;
    @NotNull
    private ClientRenderPipeline g;
    private float G;
    private float h;
    private float H;
    private float i;
    private boolean I;
    private int j;
    private int J;
    private float k;
    private float K;
    private float l;
    private float L;
    private float m;
    private int M;
    private float n;
    private static final float N = 1000000.0f;
    @Nullable
    private static kotakbaz.rain.client.render.main.program.a_0 o;
    private static final kotakbaz.rain.client.render.main.vertex.format.a_0 O;
    private static Object[] p;
    private static Object q;
    private static Object[] Q;
    private static Object[] P;
    private static Object[] r;
    public static int[] R;

    public E(@NotNull String fontName, @NotNull kotakbaz.rain.client.render.texture.A texture, @NotNull f_0 atlas, @NotNull b_0 metrics, @NotNull Map<String, MsdfGlyph> glyphs, @NotNull Map<String, ? extends Map<String, Float>> kernings) {
        int n2 = R[0];
        n2 += R[1];
        Intrinsics.checkNotNullParameter(fontName, (String)p[n2 += R[2]]);
        int n3 = R[3];
        n3 += R[4];
        Intrinsics.checkNotNullParameter(texture, (String)p[n3 ^= R[5]]);
        int n4 = R[6];
        n4 -= R[7];
        Intrinsics.checkNotNullParameter(atlas, (String)p[n4 -= R[8]]);
        int n5 = R[9];
        n5 += R[10];
        Intrinsics.checkNotNullParameter(metrics, (String)p[n5 ^= R[11]]);
        int n6 = R[12];
        n6 -= R[13];
        Intrinsics.checkNotNullParameter(glyphs, (String)p[n6 += R[14]]);
        int n7 = R[15];
        n7 += R[16];
        Intrinsics.checkNotNullParameter(kernings, (String)p[n7 -= R[17]]);
        this.a = fontName;
        this.A = texture;
        this.b = atlas;
        this.B = metrics;
        this.c = glyphs;
        this.C = kernings;
        this.g = ClientRenderPipeline.LOW;
        this.G = -1000000.0f;
        this.h = 1000000.0f;
        this.j = Color.WHITE.getRGB();
        this.J = Color.WHITE.getRGB();
        this.k = 1.0f;
        this.l = 0.5f;
        int n8 = R[18];
        n8 += R[19];
        this.M = n8 += R[20];
    }

    @NotNull
    public final f_0 getAtlas() {
        return this.b;
    }

    @NotNull
    public final b_0 getMetrics() {
        return this.B;
    }

    @Override
    @NotNull
    public String name() {
        int n2 = R[21];
        n2 += R[22];
        return (String)p[n2 ^= R[23]];
    }

    @Override
    @NotNull
    public String shader() {
        int n2 = R[24];
        n2 ^= R[25];
        return (String)p[n2 ^= R[26]];
    }

    @Override
    public kotakbaz.rain.client.render.main.vertex.a_0 drawMode() {
        return kotakbaz.rain.client.render.main.vertex.a_0.E;
    }

    @Override
    @NotNull
    public kotakbaz.rain.client.render.main.vertex.format.a_0 vertexFormat() {
        kotakbaz.rain.client.render.main.vertex.format.a_0 a_02 = O;
        int n2 = R[27];
        n2 -= R[28];
        Intrinsics.checkNotNullExpressionValue(a_02, (String)p[n2 += R[29]]);
        return a_02;
    }

    @NotNull
    public final E priority(@NotNull ClientRenderPipeline pipeline) {
        int n2 = R[30];
        n2 -= R[31];
        Intrinsics.checkNotNullParameter((Object)pipeline, (String)p[n2 ^= R[32]]);
        this.g = pipeline;
        return this;
    }

    @NotNull
    public final E centered(boolean centered) {
        this.I = centered;
        return this;
    }

    @NotNull
    public final E color(@NotNull Color color) {
        int n2 = R[33];
        n2 ^= R[34];
        Intrinsics.checkNotNullParameter(color, (String)p[n2 += R[35]]);
        this.j = color.getRGB();
        return this;
    }

    @NotNull
    public final E gradientColor(@NotNull Color color) {
        int n2 = R[36];
        n2 += R[37];
        Intrinsics.checkNotNullParameter(color, (String)p[n2 -= R[38]]);
        this.J = color.getRGB();
        return this;
    }

    @NotNull
    public final E thickness(float width2, @NotNull Color color) {
        int n2 = R[39];
        n2 ^= R[40];
        Intrinsics.checkNotNullParameter(color, (String)p[n2 -= R[41]]);
        this.K = width2;
        this.m = width2;
        this.M = color.getRGB();
        return this;
    }

    @NotNull
    public final E thickness(float width2) {
        this.K = width2;
        this.m = width2;
        return this;
    }

    @NotNull
    public final E size(float size) {
        this.k = size;
        return this;
    }

    @NotNull
    public final E smoothness(float value2) {
        this.l = value2;
        return this;
    }

    @NotNull
    public final E spacing(float value2) {
        this.L = value2;
        return this;
    }

    @NotNull
    public final E gradientOffset(float value2) {
        this.n = value2;
        return this;
    }

    @Override
    public void load() {
        if (o == null) {
            int n2 = R[42];
            n2 ^= R[43];
            int n3 = R[45];
            n3 += R[46];
            o = this.createShaderBuilder(this.name(), this.shader(), this.shader()).uniform((String)p[n2 -= R[44]], kotakbaz.rain.client.render.main.program.uniform.a.B).sampler((String)p[n3 += R[47]]).build();
        }
        this.setGlProgram(o);
        kotakbaz.rain.client.render.main.vertex.format.a_0 a_02 = O;
        int n4 = R[48];
        n4 += R[49];
        a a2 = a_02.getVertexElement((String)p[n4 += R[50]]);
        int n5 = R[51];
        n5 += R[52];
        int n6 = R[54];
        n6 -= R[55];
        Intrinsics.checkNotNullExpressionValue(a2, (String)p[n5 ^= R[53]] + (String)p[n6 -= R[56]]);
        this.d = a2;
        int n7 = R[57];
        n7 ^= R[58];
        a a3 = a_02.getVertexElement((String)p[n7 -= R[59]]);
        int n8 = R[60];
        n8 ^= R[61];
        int n9 = R[63];
        n9 -= R[64];
        Intrinsics.checkNotNullExpressionValue(a3, (String)p[n8 -= R[62]] + (String)p[n9 ^= R[65]]);
        this.D = a3;
        int n10 = R[66];
        n10 ^= R[67];
        a a4 = a_02.getVertexElement((String)p[n10 ^= R[68]]);
        int n11 = R[69];
        n11 ^= R[70];
        int n12 = R[72];
        n12 += R[73];
        Intrinsics.checkNotNullExpressionValue(a4, (String)p[n11 -= R[71]] + (String)p[n12 -= R[74]]);
        this.e = a4;
        int n13 = R[75];
        n13 += R[76];
        a a5 = a_02.getVertexElement((String)p[n13 += R[77]]);
        int n14 = R[78];
        n14 ^= R[79];
        int n15 = R[81];
        n15 ^= R[82];
        Intrinsics.checkNotNullExpressionValue(a5, (String)p[n14 -= R[80]] + (String)p[n15 -= R[83]]);
        this.E = a5;
        int n16 = R[84];
        n16 -= R[85];
        a a6 = a_02.getVertexElement((String)p[n16 += R[86]]);
        int n17 = R[87];
        n17 ^= R[88];
        int n18 = R[90];
        n18 -= R[91];
        Intrinsics.checkNotNullExpressionValue(a6, (String)p[n17 -= R[89]] + (String)p[n18 += R[92]]);
        this.f = a6;
        int n19 = R[93];
        n19 ^= R[94];
        a a7 = a_02.getVertexElement((String)p[n19 += R[95]]);
        int n20 = R[96];
        int n21 = R[98];
        n21 ^= R[99];
        Intrinsics.checkNotNullExpressionValue(a7, (String)p[n20 += R[97]] + (String)p[n21 -= R[100]]);
        this.F = a7;
    }

    @Override
    public void renderBatch(@Nullable b mesh, @Nullable Object state2) {
        kotakbaz.rain.client.render.main.program.a_0 a_02 = this.getGlProgram();
        if (a_02 == null) {
            return;
        }
        kotakbaz.rain.client.render.main.program.a_0 a_03 = a_02;
        int n2 = R[101];
        n2 -= R[102];
        a_03.getUniform((String)p[n2 -= R[103]], kotakbaz.rain.client.render.main.program.uniform.a.B).set(Float.valueOf(this.b.getRange()));
        int n3 = R[104];
        n3 += R[105];
        a_03.getUniform((String)p[n3 -= R[106]], kotakbaz.rain.client.render.main.program.uniform.a.h).set(this.A);
        ChromaRenderer.setGlobalProgram(a_03);
        ChromaRenderer.initMatrix();
        ChromaRenderer.draw(mesh);
    }

    @NotNull
    public final E setFade(float minX, float maxX, float leftWidth, float rightWidth) {
        this.G = minX;
        this.h = maxX;
        this.H = leftWidth;
        this.i = rightWidth;
        return this;
    }

    @NotNull
    public final E resetFade() {
        return this.setFade(-1000000.0f, 1000000.0f, 0.0f, 0.0f);
    }

    public final void drawText(@NotNull String text, float x2, float y) {
        int n2;
        int n3 = R[107];
        n3 ^= R[108];
        Intrinsics.checkNotNullParameter(text, (String)p[n3 += R[109]]);
        String string = ReplaceUtil.INSTANCE.replaceSymbols(text);
        if (((CharSequence)string).length() == 0) {
            int n4 = R[110];
            n4 ^= R[111];
            n2 = n4 += R[112];
        } else {
            int n5 = R[113];
            n5 += R[114];
            n2 = n5 -= R[115];
        }
        if (n2 != 0) {
            return;
        }
        float f2 = this.I ? x2 - this.getWidth(string, this.k, this.K) * 0.5f : x2;
        this.drawRawString(string, f2, y, this.k, this.j, this.K, this.l, this.L, this.M, this.m);
    }

    public final void drawText(@NotNull Text text, float x2, float y) {
        int n2 = R[116];
        n2 -= R[117];
        Intrinsics.checkNotNullParameter(text, (String)p[n2 -= R[118]]);
        List<f> list = TextUtil.INSTANCE.parseTextToColoredGlyphs(ReplaceUtil.INSTANCE.replaceSymbols(text));
        if (list.isEmpty()) {
            return;
        }
        float f2 = this.I ? x2 - this.getWidth(list, this.k, this.K) * 0.5f : x2;
        this.drawColoredGlyphs(list, f2, y, this.k, this.K, this.l, this.L, this.M, this.m);
    }

    public final void drawGradient(@NotNull String text, float x2, float y) {
        int n2;
        int n3 = R[119];
        n3 -= R[120];
        Intrinsics.checkNotNullParameter(text, (String)p[n3 += R[121]]);
        String string = ReplaceUtil.INSTANCE.replaceSymbols(text);
        if (((CharSequence)string).length() == 0) {
            int n4 = R[122];
            n4 -= R[123];
            n2 = n4 -= R[124];
        } else {
            int n5 = R[125];
            n5 -= R[126];
            n2 = n5 -= R[127];
        }
        if (n2 != 0) {
            return;
        }
        float f2 = this.I ? x2 - this.getWidth(string, this.k, this.K) * 0.5f : x2;
        this.drawGradientRaw(string, f2, y, this.k, this.j, this.J, this.n, this.K, this.l, this.L, this.M, this.m);
    }

    public final void drawGradient(@NotNull Text text, float x2, float y) {
        int n2 = R[128];
        n2 += R[129];
        Intrinsics.checkNotNullParameter(text, (String)p[n2 += R[130]]);
        String string = text.getString();
        int n3 = R[131];
        n3 -= R[132];
        Intrinsics.checkNotNullExpressionValue(string, (String)p[n3 ^= R[133]]);
        this.drawGradient(string, x2, y);
    }

    public final void drawText(@NotNull Text text, float x2, float y, float size, @NotNull Color color, float thickness) {
        int n2 = R[134];
        n2 ^= R[135];
        Intrinsics.checkNotNullParameter(text, (String)p[n2 -= R[136]]);
        int n3 = R[137];
        n3 -= R[138];
        Intrinsics.checkNotNullParameter(color, (String)p[n3 -= R[139]]);
        boolean bl = R[140];
        bl -= R[141];
        this.centered(bl ^= R[142]).size(size).color(color).thickness(thickness).drawText(text, x2, y);
    }

    public static /* synthetic */ void drawText$default(E e2, Text text, float f2, float f3, float f4, Color color, float f5, int n2, Object object) {
        int n3 = R[143];
        n3 += R[144];
        if ((n2 & (n3 -= R[145])) != 0) {
            f5 = 0.0f;
        }
        e2.drawText(text, f2, f3, f4, color, f5);
    }

    public final void drawText(@NotNull String text, float x2, float y, float size, @NotNull Color color, float thickness, float smoothness, float spacing, int outlineColor, float outlineThickness) {
        int n2 = R[146];
        n2 ^= R[147];
        Intrinsics.checkNotNullParameter(text, (String)p[n2 -= R[148]]);
        int n3 = R[149];
        n3 += R[150];
        Intrinsics.checkNotNullParameter(color, (String)p[n3 -= R[151]]);
        boolean bl = R[152];
        bl ^= R[153];
        this.centered(bl ^= R[154]).size(size).color(color).smoothness(smoothness).spacing(spacing).thickness(thickness);
        this.M = outlineColor;
        this.m = outlineThickness;
        this.drawText(text, x2, y);
    }

    public static /* synthetic */ void drawText$default(E e2, String string, float f2, float f3, float f4, Color color, float f5, float f6, float f7, int n2, float f8, int n3, Object object) {
        int n4 = R[155];
        n4 += R[156];
        if ((n3 & (n4 -= R[157])) != 0) {
            f5 = 0.0f;
        }
        int n5 = R[158];
        n5 -= R[159];
        if ((n3 & (n5 -= R[160])) != 0) {
            f6 = 0.7f;
        }
        int n6 = R[161];
        n6 ^= R[162];
        if ((n3 & (n6 += R[163])) != 0) {
            f7 = 0.0f;
        }
        int n7 = R[164];
        n7 -= R[165];
        if ((n3 & (n7 += R[166])) != 0) {
            int n8 = R[167];
            n8 -= R[168];
            n2 = n8 -= R[169];
        }
        int n9 = R[170];
        n9 ^= R[171];
        if ((n3 & (n9 ^= R[172])) != 0) {
            f8 = f5;
        }
        e2.drawText(string, f2, f3, f4, color, f5, f6, f7, n2, f8);
    }

    public final void drawGradientText(@NotNull String text, float x2, float y, float size, @NotNull Color first, @NotNull Color second, float offset, float thickness, float smoothness, float spacing, int outlineColor, float outlineThickness) {
        int n2 = R[173];
        n2 ^= R[174];
        Intrinsics.checkNotNullParameter(text, (String)p[n2 -= R[175]]);
        int n3 = R[176];
        n3 += R[177];
        Intrinsics.checkNotNullParameter(first, (String)p[n3 += R[178]]);
        int n4 = R[179];
        n4 ^= R[180];
        Intrinsics.checkNotNullParameter(second, (String)p[n4 ^= R[181]]);
        boolean bl = R[182];
        bl ^= R[183];
        this.centered(bl += R[184]).size(size).color(first).gradientColor(second).gradientOffset(offset).smoothness(smoothness).spacing(spacing).thickness(thickness);
        this.M = outlineColor;
        this.m = outlineThickness;
        this.drawGradient(text, x2, y);
    }

    public static /* synthetic */ void drawGradientText$default(E e2, String string, float f2, float f3, float f4, Color color, Color color2, float f5, float f6, float f7, float f8, int n2, float f9, int n3, Object object) {
        int n4 = R[185];
        n4 ^= R[186];
        if ((n3 & (n4 += R[187])) != 0) {
            f6 = 0.0f;
        }
        int n5 = R[188];
        n5 += R[189];
        if ((n3 & (n5 += R[190])) != 0) {
            f7 = 0.5f;
        }
        int n6 = R[191];
        n6 -= R[192];
        if ((n3 & (n6 ^= R[193])) != 0) {
            f8 = 0.0f;
        }
        int n7 = R[194];
        n7 += R[195];
        if ((n3 & (n7 -= R[196])) != 0) {
            int n8 = R[197];
            n8 += R[198];
            n2 = n8 -= R[199];
        }
        int n9 = R[200];
        n9 += R[201];
        if ((n3 & (n9 ^= R[202])) != 0) {
            f9 = f6;
        }
        e2.drawGradientText(string, f2, f3, f4, color, color2, f5, f6, f7, f8, n2, f9);
    }

    private final void drawRawString(String text, float x2, float y, float size, int color, float thickness, float smoothness, float spacing, int outlineColor, float outlineThickness) {
        kotakbaz.rain.client.render.main.vertex.mesh.a_0 a_02 = RenderUtils.INSTANCE.getDISPATCHER().getBuilder(this.g, this, null);
        if (a_02 == null) {
            return;
        }
        kotakbaz.rain.client.render.main.vertex.mesh.a_0 a_03 = a_02;
        float f2 = y + this.B.baselineHeight() * size;
        this.applyGlyphs(a_03, text, size, (thickness + outlineThickness * 0.5f) * 0.5f * size, spacing, x2, f2, 0.0f, color, thickness, smoothness, outlineThickness, outlineColor);
    }

    private final void drawColoredGlyphs(List<f> glyphsData, float x2, float y, float size, float thickness, float smoothness, float spacing, int outlineColor, float outlineThickness) {
        long l2 = 8063396523143611282L;
        kotakbaz.rain.client.render.main.vertex.mesh.a_0 a_02 = RenderUtils.INSTANCE.getDISPATCHER().getBuilder(this.g, this, null);
        if (a_02 == null) {
            return;
        }
        kotakbaz.rain.client.render.main.vertex.mesh.a_0 a_03 = a_02;
        float f2 = x2;
        float f3 = y + this.B.baselineHeight() * size;
        float f4 = this.G;
        float f5 = this.h;
        float f6 = this.H;
        float f7 = this.i;
        float f8 = (thickness + outlineThickness * 0.5f) * 0.5f * size;
        String string = null;
        for (f f9 : glyphsData) {
            MsdfGlyph msdfGlyph;
            a a2;
            a a3;
            a a4;
            a a5;
            a a6;
            Map<String, Float> map;
            String string2 = String.valueOf(f9.getC());
            if (this.c.get(string2) == null) continue;
            if (string != null) {
                String string3;
                long l3 = l2;
                int n2 = R[203];
                n2 -= R[204];
                l2 = l3 ^ (0L ^ l3) & -1L << (n2 -= R[205]);
                v2 = this.C.get(string3);
            } else {
                v2 = map = null;
            }
            if (map != null) {
                Float f10 = (Float)map.get(string2);
                f2 += (f10 != null ? f10.floatValue() : 0.0f) * size;
            }
            int n3 = f9.getColor();
            a a7 = this.d;
            if (a7 == null) {
                int n4 = R[206];
                n4 ^= R[207];
                Intrinsics.throwUninitializedPropertyAccessException((String)p[n4 -= R[208]]);
                a7 = null;
            }
            if ((a6 = this.D) == null) {
                int n5 = R[209];
                n5 -= R[210];
                Intrinsics.throwUninitializedPropertyAccessException((String)p[n5 += R[211]]);
                a6 = null;
            }
            if ((a5 = this.e) == null) {
                int n6 = R[212];
                n6 -= R[213];
                Intrinsics.throwUninitializedPropertyAccessException((String)p[n6 -= R[214]]);
                a5 = null;
            }
            if ((a4 = this.E) == null) {
                int n7 = R[215];
                n7 -= R[216];
                Intrinsics.throwUninitializedPropertyAccessException((String)p[n7 ^= R[217]]);
                a4 = null;
            }
            if ((a3 = this.f) == null) {
                int n8 = R[218];
                n8 ^= R[219];
                Intrinsics.throwUninitializedPropertyAccessException((String)p[n8 -= R[220]]);
                a3 = null;
            }
            if ((a2 = this.F) == null) {
                int n9 = R[221];
                n9 -= R[222];
                Intrinsics.throwUninitializedPropertyAccessException((String)p[n9 -= R[223]]);
                a2 = null;
            }
            f2 += msdfGlyph.apply(a_03, f2, f3, 0.0f, size, n3, thickness, smoothness, outlineThickness, outlineColor, f4, f5, f6, f7, a7, a6, a5, a4, a3, a2) + f8 + spacing;
            string = string2;
        }
    }

    private final void drawGradientRaw(String text, float x2, float y, float size, int first, int second, float offset, float thickness, float smoothness, float spacing, int outlineColor, float outlineThickness) {
        long l2 = 4045930967532419389L;
        long l3 = -4194377783757386465L;
        long l4 = -245064715581223411L;
        long l5 = 8517378953688942681L;
        long l6 = 8821589460760409173L;
        float f2 = RangesKt.coerceAtLeast(this.getWidth(text, size, thickness), 1.0f);
        float f3 = x2 + offset;
        float f4 = f3 + f2;
        kotakbaz.rain.client.render.main.vertex.mesh.a_0 a_02 = RenderUtils.INSTANCE.getDISPATCHER().getBuilder(this.g, this, null);
        if (a_02 == null) {
            return;
        }
        kotakbaz.rain.client.render.main.vertex.mesh.a_0 a_03 = a_02;
        float f5 = x2;
        float f6 = y + this.B.baselineHeight() * size;
        String string = null;
        float f7 = this.G;
        float f8 = this.h;
        float f9 = this.H;
        float f10 = this.i;
        long l7 = l6;
        int n2 = R[224];
        n2 -= R[225];
        l6 = l7 ^ (0L ^ l7) & -1L << (n2 -= R[226]);
        long l8 = l3;
        int n3 = R[227];
        n3 ^= R[228];
        l3 = l8 ^ ((long)((CharSequence)text).length() ^ l8) & -1L >>> (n3 -= R[229]);
        while (true) {
            int n4 = R[230];
            n4 -= R[231];
            if ((int)(l6 >>> (n4 += R[232])) >= (int)l3) break;
            int n5 = R[233];
            n5 += R[234];
            String string2 = String.valueOf(text.charAt((int)(l6 >>> (n5 ^= R[235]))));
            if (this.c.get(string2) != null) {
                MsdfGlyph msdfGlyph;
                a a2;
                a a3;
                a a4;
                a a5;
                a a6;
                Map<String, Float> map;
                if (string != null) {
                    String string3;
                    long l9 = l4;
                    int n6 = R[236];
                    n6 -= R[237];
                    l4 = l9 ^ (0L ^ l9) & -1L >>> (n6 ^= R[238]);
                    v4 = this.C.get(string3);
                } else {
                    v4 = map = null;
                }
                if (map != null) {
                    Float f11 = (Float)map.get(string2);
                    f5 += (f11 != null ? f11.floatValue() : 0.0f) * size;
                }
                float f12 = RangesKt.coerceIn((f5 - f3) / (f4 - f3), 0.0f, 1.0f);
                int n7 = R[239];
                n7 += R[240];
                long l10 = l5;
                int n8 = R[242];
                n8 += R[243];
                l5 = l10 ^ ((long)this.lerpArgb(first, second, f12) << (n7 -= R[241]) ^ l10) & -1L << (n8 ^= R[244]);
                int n9 = R[245];
                n9 ^= R[246];
                int n10 = (int)(l5 >>> (n9 -= R[247]));
                a a7 = this.d;
                if (a7 == null) {
                    int n11 = R[248];
                    n11 -= R[249];
                    Intrinsics.throwUninitializedPropertyAccessException((String)p[n11 -= R[250]]);
                    a7 = null;
                }
                if ((a6 = this.D) == null) {
                    int n12 = R[251];
                    n12 ^= R[252];
                    Intrinsics.throwUninitializedPropertyAccessException((String)p[n12 += R[253]]);
                    a6 = null;
                }
                if ((a5 = this.e) == null) {
                    int n13 = R[254];
                    n13 += R[255];
                    Intrinsics.throwUninitializedPropertyAccessException((String)p[n13 -= R[256]]);
                    a5 = null;
                }
                if ((a4 = this.E) == null) {
                    int n14 = R[257];
                    n14 -= R[258];
                    Intrinsics.throwUninitializedPropertyAccessException((String)p[n14 -= R[259]]);
                    a4 = null;
                }
                if ((a3 = this.f) == null) {
                    int n15 = R[260];
                    n15 += R[261];
                    Intrinsics.throwUninitializedPropertyAccessException((String)p[n15 -= R[262]]);
                    a3 = null;
                }
                if ((a2 = this.F) == null) {
                    int n16 = R[263];
                    n16 += R[264];
                    Intrinsics.throwUninitializedPropertyAccessException((String)p[n16 += R[265]]);
                    a2 = null;
                }
                f5 += msdfGlyph.apply(a_03, f5, f6, 0.0f, size, n10, thickness, smoothness, outlineThickness, outlineColor, f7, f8, f9, f10, a7, a6, a5, a4, a3, a2) + spacing;
                string = string2;
            }
            l6 += 0x100000000L;
        }
    }

    private final void applyGlyphs(kotakbaz.rain.client.render.main.vertex.mesh.a_0 builder, String text, float size, float thicknessPadding, float spacing, float startX, float startY, float z, int color, float thickness, float smoothness, float outlineThickness, int outlineColor) {
        long l2 = -1539925575355247477L;
        long l3 = 7462110013471110954L;
        long l4 = -9002899703516164729L;
        long l5 = -8390235880601420390L;
        float f2 = startX;
        String string = null;
        float f3 = this.G;
        float f4 = this.h;
        float f5 = this.H;
        float f6 = this.i;
        long l6 = l5;
        int n2 = R[266];
        n2 += R[267];
        l5 = l6 ^ (0L ^ l6) & -1L << (n2 -= R[268]);
        long l7 = l4;
        int n3 = R[269];
        n3 -= R[270];
        l4 = l7 ^ ((long)((CharSequence)text).length() ^ l7) & -1L >>> (n3 -= R[271]);
        while (true) {
            int n4 = R[272];
            n4 ^= R[273];
            if ((int)(l5 >>> (n4 ^= R[274])) >= (int)l4) break;
            int n5 = R[275];
            n5 -= R[276];
            String string2 = String.valueOf(text.charAt((int)(l5 >>> (n5 -= R[277]))));
            if (this.c.get(string2) != null) {
                MsdfGlyph msdfGlyph;
                a a2;
                a a3;
                a a4;
                a a5;
                a a6;
                a a7;
                Map<String, Float> map;
                if (string != null) {
                    String string3;
                    long l8 = l5;
                    int n6 = R[278];
                    n6 ^= R[279];
                    l5 = l8 ^ (0L ^ l8) & -1L >>> (n6 -= R[280]);
                    v3 = this.C.get(string3);
                } else {
                    v3 = map = null;
                }
                if (map != null) {
                    Float f7 = (Float)map.get(string2);
                    f2 += (f7 != null ? f7.floatValue() : 0.0f) * size;
                }
                if ((a7 = this.d) == null) {
                    int n7 = R[281];
                    n7 -= R[282];
                    Intrinsics.throwUninitializedPropertyAccessException((String)p[n7 -= R[283]]);
                    a7 = null;
                }
                if ((a6 = this.D) == null) {
                    int n8 = R[284];
                    n8 ^= R[285];
                    Intrinsics.throwUninitializedPropertyAccessException((String)p[n8 -= R[286]]);
                    a6 = null;
                }
                if ((a5 = this.e) == null) {
                    int n9 = R[287];
                    n9 ^= R[288];
                    Intrinsics.throwUninitializedPropertyAccessException((String)p[n9 ^= R[289]]);
                    a5 = null;
                }
                if ((a4 = this.E) == null) {
                    int n10 = R[290];
                    n10 += R[291];
                    Intrinsics.throwUninitializedPropertyAccessException((String)p[n10 -= R[292]]);
                    a4 = null;
                }
                if ((a3 = this.f) == null) {
                    int n11 = R[293];
                    n11 += R[294];
                    Intrinsics.throwUninitializedPropertyAccessException((String)p[n11 ^= R[295]]);
                    a3 = null;
                }
                if ((a2 = this.F) == null) {
                    int n12 = R[296];
                    n12 += R[297];
                    Intrinsics.throwUninitializedPropertyAccessException((String)p[n12 += R[298]]);
                    a2 = null;
                }
                f2 += msdfGlyph.apply(builder, f2, startY, z, size, color, thickness, smoothness, outlineThickness, outlineColor, f3, f4, f5, f6, a7, a6, a5, a4, a3, a2) + thicknessPadding + spacing;
                string = string2;
            }
            l5 += 0x100000000L;
        }
    }

    public final float getWidth(@NotNull Text text, float size, float thickness) {
        int n2 = R[299];
        n2 ^= R[300];
        Intrinsics.checkNotNullParameter(text, (String)p[n2 -= R[301]]);
        return this.getWidth(TextUtil.INSTANCE.parseTextToColoredGlyphs(text), size, thickness);
    }

    public static /* synthetic */ float getWidth$default(E e2, Text text, float f2, float f3, int n2, Object object) {
        int n3 = R[302];
        n3 += R[303];
        if ((n2 & (n3 += R[304])) != 0) {
            f3 = 0.0f;
        }
        return e2.getWidth(text, f2, f3);
    }

    public final float getWidth(@NotNull List<f> text, float size, float thickness) {
        long l2 = 3619442419646039260L;
        int n2 = R[305];
        n2 ^= R[306];
        Intrinsics.checkNotNullParameter(text, (String)p[n2 += R[307]]);
        String string = null;
        float f2 = 0.0f;
        for (f f3 : text) {
            MsdfGlyph msdfGlyph;
            Map<String, Float> map;
            String string2 = String.valueOf(f3.getC());
            if (this.c.get(string2) == null) continue;
            if (string != null) {
                String string3;
                long l3 = l2;
                int n3 = R[308];
                n3 -= R[309];
                l2 = l3 ^ (0L ^ l3) & -1L << (n3 -= R[310]);
                v1 = this.C.get(string3);
            } else {
                v1 = map = null;
            }
            if (map != null) {
                Float f4 = (Float)map.get(string2);
                f2 += (f4 != null ? f4.floatValue() : 0.0f) * size * (1.0f + thickness);
            }
            f2 += msdfGlyph.width(size) * (1.0f + thickness);
            string = string2;
        }
        return f2;
    }

    public static /* synthetic */ float getWidth$default(E e2, List list, float f2, float f3, int n2, Object object) {
        int n3 = R[311];
        n3 += R[312];
        if ((n2 & (n3 ^= R[313])) != 0) {
            f3 = 0.0f;
        }
        return e2.getWidth(list, f2, f3);
    }

    public final float getWidth(@NotNull String text, float size, float thickness) {
        long l2 = 4874011180415060223L;
        long l3 = 4361695619620428360L;
        long l4 = 6439336761508643992L;
        long l5 = 7476492421478770539L;
        int n2 = R[314];
        n2 -= R[315];
        Intrinsics.checkNotNullParameter(text, (String)p[n2 ^= R[316]]);
        String string = null;
        float f2 = 0.0f;
        long l6 = l5;
        int n3 = R[317];
        n3 -= R[318];
        long l7 = l5 = l6 ^ (0L ^ l6) & -1L << (n3 -= R[319]);
        int n4 = R[320];
        n4 ^= R[321];
        l5 = l7 ^ ((long)((CharSequence)text).length() ^ l7) & -1L >>> (n4 -= R[322]);
        while (true) {
            int n5 = R[323];
            n5 ^= R[324];
            if ((int)(l5 >>> (n5 -= R[325])) >= (int)l5) break;
            int n6 = R[326];
            n6 += R[327];
            String string2 = String.valueOf(text.charAt((int)(l5 >>> (n6 ^= R[328]))));
            if (this.c.get(string2) != null) {
                MsdfGlyph msdfGlyph;
                Map<String, Float> map;
                if (string != null) {
                    String string3;
                    long l8 = l2;
                    int n7 = R[329];
                    n7 += R[330];
                    l2 = l8 ^ (0L ^ l8) & -1L >>> (n7 ^= R[331]);
                    v3 = this.C.get(string3);
                } else {
                    v3 = map = null;
                }
                if (map != null) {
                    Float f3 = (Float)map.get(string2);
                    f2 += (f3 != null ? f3.floatValue() : 0.0f) * size * (1.0f + thickness);
                }
                f2 += msdfGlyph.width(size) * (1.0f + thickness);
                string = string2;
            }
            l5 += 0x100000000L;
        }
        return f2;
    }

    public static /* synthetic */ float getWidth$default(E e2, String string, float f2, float f3, int n2, Object object) {
        int n3 = R[332];
        n3 -= R[333];
        if ((n2 & (n3 ^= R[334])) != 0) {
            f3 = 0.0f;
        }
        return e2.getWidth(string, f2, f3);
    }

    public final float getHeight(float size) {
        return size;
    }

    public final void drawCenteredText(@NotNull String text, float x2, float y, float size, @NotNull Color color, float thickness) {
        long l2 = -6313952070271255979L;
        int n2 = R[335];
        n2 -= R[336];
        Intrinsics.checkNotNullParameter(text, (String)p[n2 ^= R[337]]);
        int n3 = R[338];
        n3 += R[339];
        Intrinsics.checkNotNullParameter(color, (String)p[n3 += R[340]]);
        int n4 = R[341];
        n4 ^= R[342];
        long l3 = l2;
        int n5 = R[344];
        n5 ^= R[345];
        l2 = l3 ^ ((long)this.I << (n4 ^= R[343]) ^ l3) & -1L << (n5 ^= R[346]);
        boolean bl = R[347];
        bl += R[348];
        this.centered(bl -= R[349]).size(size).color(color).thickness(thickness).drawText(text, x2, y);
        int n6 = R[350];
        n6 ^= R[351];
        this.I = (int)(l2 >>> (n6 -= R[352]));
    }

    public static /* synthetic */ void drawCenteredText$default(E e2, String string, float f2, float f3, float f4, Color color, float f5, int n2, Object object) {
        int n3 = R[353];
        n3 ^= R[354];
        if ((n2 & (n3 ^= R[355])) != 0) {
            f5 = 0.0f;
        }
        e2.drawCenteredText(string, f2, f3, f4, color, f5);
    }

    public final void drawCenteredGradientText(@NotNull String text, float x2, float y, float size, @NotNull Color first, @NotNull Color second, float offset, float thickness) {
        long l2 = -5949050930324720963L;
        int n2 = R[356];
        n2 ^= R[357];
        Intrinsics.checkNotNullParameter(text, (String)p[n2 += R[358]]);
        int n3 = R[359];
        n3 ^= R[360];
        Intrinsics.checkNotNullParameter(first, (String)p[n3 -= R[361]]);
        int n4 = R[362];
        n4 -= R[363];
        Intrinsics.checkNotNullParameter(second, (String)p[n4 += R[364]]);
        int n5 = R[365];
        n5 -= R[366];
        long l3 = l2;
        int n6 = R[368];
        n6 += R[369];
        l2 = l3 ^ ((long)this.I << (n5 += R[367]) ^ l3) & -1L << (n6 -= R[370]);
        boolean bl = R[371];
        bl ^= R[372];
        this.centered(bl += R[373]).size(size).color(first).gradientColor(second).gradientOffset(offset).thickness(thickness).drawGradient(text, x2, y);
        int n7 = R[374];
        n7 += R[375];
        this.I = (int)(l2 >>> (n7 += R[376]));
    }

    public static /* synthetic */ void drawCenteredGradientText$default(E e2, String string, float f2, float f3, float f4, Color color, Color color2, float f5, float f6, int n2, Object object) {
        int n3 = R[377];
        n3 += R[378];
        if ((n2 & (n3 ^= R[379])) != 0) {
            f6 = 0.0f;
        }
        e2.drawCenteredGradientText(string, f2, f3, f4, color, color2, f5, f6);
    }

    private final int lerpArgb(int a2, int b2, float t2) {
        long l2 = -4729602311837237007L;
        long l3 = -8534190403326632510L;
        long l4 = -7945707200986220730L;
        long l5 = -8048781520277585285L;
        long l6 = 2089769429783257308L;
        long l7 = 6286062648848626719L;
        long l8 = 4693023293146249154L;
        long l9 = 9056453302770669323L;
        long l10 = -3601202963338934367L;
        long l11 = -3726839471955393546L;
        long l12 = 2363271450342778381L;
        long l13 = -3279258714754782616L;
        long l14 = -513818989868000226L;
        long l15 = -1079257673085852052L;
        float f2 = RangesKt.coerceIn(t2, 0.0f, 1.0f);
        int n2 = R[380];
        n2 -= R[381];
        n2 -= R[382];
        int n3 = R[383];
        n3 += R[384];
        n3 += R[385];
        int n4 = R[386];
        n4 += R[387];
        long l16 = l13;
        int n5 = R[389];
        n5 -= R[390];
        l13 = l16 ^ ((long)(a2 >>> n2 & n3) << (n4 ^= R[388]) ^ l16) & -1L << (n5 += R[391]);
        int n6 = R[392];
        n6 -= R[393];
        n6 ^= R[394];
        int n7 = R[395];
        n7 ^= R[396];
        n7 -= R[397];
        int n8 = R[398];
        n8 -= R[399];
        long l17 = l15;
        int n9 = 7;
        n9 -= 53;
        l15 = l17 ^ ((long)(a2 >>> n6 & n7) << (n8 -= -121) ^ l17) & -1L << (n9 -= -78);
        int n10 = 71;
        n10 += -2;
        n10 ^= 0x4D;
        int n11 = 128;
        n11 += 16;
        n11 -= -111;
        int n12 = -120;
        n12 -= -68;
        long l18 = l9;
        int n13 = 234;
        n13 += -124;
        l9 = l18 ^ ((long)(a2 >>> n10 & n11) << (n12 ^= 0xFFFFFFEC) ^ l18) & -1L << (n13 -= 78);
        int n14 = 346;
        n14 += -117;
        long l19 = l9;
        int n15 = 88;
        n15 += 33;
        l9 = l19 ^ ((long)(a2 & (n14 -= -26)) ^ l19) & -1L >>> (n15 += -89);
        int n16 = 14;
        n16 -= 64;
        n16 += 74;
        int n17 = -131;
        n17 ^= 0xFFFFFFF9;
        long l20 = l12;
        int n18 = 8;
        n18 ^= 0xFFFFFFEE;
        l12 = l20 ^ ((long)(b2 >>> n16 & (n17 -= -123)) ^ l20) & -1L >>> (n18 += 58);
        int n19 = -67;
        n19 ^= 0x54;
        n19 ^= 0xFFFFFFF9;
        int n20 = 340;
        n20 += -6;
        long l21 = l14;
        int n21 = -43;
        n21 -= -83;
        l14 = l21 ^ ((long)(b2 >>> n19 & (n20 += -79)) ^ l21) & -1L >>> (n21 += -8);
        int n22 = -81;
        n22 ^= 0xFFFFFFFD;
        n22 ^= 0x5A;
        int n23 = 288;
        n23 ^= 0x28;
        n23 -= 9;
        int n24 = 47;
        n24 ^= 0xFFFFFF9E;
        long l22 = l11;
        int n25 = 243;
        n25 += -116;
        l11 = l22 ^ ((long)(b2 >>> n22 & n23) << (n24 += 111) ^ l22) & -1L << (n25 ^= 0x5F);
        int n26 = -292;
        n26 ^= 0xFFFFFFCD;
        long l23 = l11;
        int n27 = 265;
        n27 -= 124;
        l11 = l23 ^ ((long)(b2 & (n26 -= 18)) ^ l23) & -1L >>> (n27 -= 109);
        int n28 = -58;
        n28 ^= 0x72;
        n28 -= -108;
        int n29 = -115;
        n29 ^= 0xFFFFFFE7;
        long l24 = l13;
        int n30 = -114;
        n30 -= -56;
        l13 = l24 ^ ((long)((int)((float)((int)(l13 >>> n28)) + (float)((int)l12 - (int)(l13 >>> (n29 += -74))) * f2)) ^ l24) & -1L >>> (n30 += 90);
        int n31 = 111;
        n31 ^= 0xFFFFFFCB;
        n31 ^= 0xFFFFFF84;
        int n32 = -27;
        n32 += 19;
        long l25 = l15;
        int n33 = 53;
        n33 -= 83;
        l15 = l25 ^ ((long)((int)((float)((int)(l15 >>> n31)) + (float)((int)l14 - (int)(l15 >>> (n32 ^= 0xFFFFFFD8))) * f2)) ^ l25) & -1L >>> (n33 -= -62);
        int n34 = 44;
        n34 -= 68;
        n34 += 56;
        int n35 = 68;
        n35 += -5;
        n35 ^= 0x1F;
        int n36 = -104;
        n36 -= -34;
        n36 += 102;
        int n37 = 28;
        n37 -= 39;
        long l26 = l7;
        int n38 = 188;
        n38 -= 84;
        long l27 = l7 = l26 ^ ((long)((int)((float)((int)(l9 >>> n34)) + (float)((int)(l11 >>> n35) - (int)(l9 >>> n36)) * f2)) << (n37 += 43) ^ l26) & -1L << (n38 ^= 0x48);
        int n39 = -116;
        n39 ^= 0xFFFFFFEE;
        l7 = l27 ^ ((long)((int)((float)((int)l9) + (float)((int)l11 - (int)l9) * f2)) ^ l27) & -1L >>> (n39 -= 66);
        int n40 = -9;
        n40 ^= 0x36;
        n40 += 87;
        int n41 = -20;
        n41 -= -2;
        int n42 = -67;
        n42 ^= 0x18;
        int n43 = -221;
        n43 += 119;
        return (int)l13 << n40 | (int)l15 << (n41 += 34) | (int)(l7 >>> (n42 -= -123)) << (n43 += 110) | (int)l7;
    }

    @NotNull
    public final String id() {
        return this.a;
    }

    static {
        kotakbaz.rain.client.util.render.font.E.b();
        long l2 = 3049715102356919615L;
        long l3 = 9138459497624944004L;
        long l4 = -4391512626252110011L;
        long l5 = 5444295771220342493L;
        long l6 = 5444147978276243395L;
        long l7 = -7899453790038506813L;
        long l8 = -6787258756124949860L;
        long l9 = -2106001513372375722L;
        long l10 = -4092130612351842856L;
        long l11 = 5158078240852482173L;
        long l12 = -39155148369652037L;
        long l13 = 3880310548799740187L;
        long l14 = 1792879370763240467L;
        long l15 = -9011107257240661119L;
        int n2 = -90;
        n2 ^= 0xFFFFFF8E;
        p = new Object[n2 -= -39];
        long l16 = l15;
        int n3 = -14;
        n3 -= -39;
        l15 = l16 ^ (0L ^ l16) & -1L << (n3 ^= 0x39);
        Object[] objectArray = new Object[3];
        objectArray[0] = P;
        objectArray[1] = 0;
        Object object = kotakbaz.rain.client.util.render.font.E.A()[0];
        if (object == null) {
            char[] cArray = "\uc247\uc25f\uc272\uc0e8\uc251\uc0fe\uc0fc\uc245\uc250\uc0f7\uc101\uc254\uc0e8\uc225\uc237\uc243\uc242\uc0f4\uc23e\uc0f7\uc0e6\uc246\uc0e7\uc245\uc252\uc24d\uc263\uc0f9\uc23f\uc241\uc0f7\uc25f\uc260\uc26e\uc251\uc234\uc243\uc22b\uc262\uc270\uc262\uc240\uc243\uc0e7\uc252\uc254\uc26e\uc270\uc259\uc25e\uc255\uc260\uc0e6\uc263\uc25c\uc0f6\uc259\uc24b\uc0ea\uc248\uc25e\uc270\uc0ea\uc0eb\uc245\uc0f6\uc225\uc26e\uc272\uc25e\uc255\uc235\uc0f9\uc273\uc0e9\uc257\uc250\uc0fc\uc0e6\uc246\uc0fe\uc257\uc26e\uc225\uc24a\uc250\uc239\uc240\uc0e5\uc23c\uc102\uc25c\uc24b\uc225\uc0f4\uc241\uc237\uc250\uc0ed\uc25c\uc243\uc237\uc234\uc246\uc0f6\uc0fe\uc0f9\uc261\uc24d\uc0f4\uc253\uc259\uc0eb\uc0e8\uc240\uc251\uc0e5\uc271\uc0e6\uc271\uc0e6\uc22b\uc24b\uc247\uc237\uc23c\uc248\uc101\uc0ea\uc0e9\uc252\uc22b\uc235\uc262\uc240\uc0f9\uc263\uc251\uc102\uc0e8\uc23e\uc252\uc24a\uc103\uc250\uc0ed\uc252\uc24b\uc225\uc24e\uc0f9\uc24a\uc239\uc24b\uc262\uc273\uc23e\uc242\uc0fe\uc244\uc0f4\uc24b\uc23f\uc25f\uc242\uc239\uc257\uc249\uc23e\uc100\uc103\uc257\uc24b\uc0f7\uc0f9\uc101\uc0eb\uc246\uc102\uc246\uc0fe\uc244\uc26e\uc0fc\uc225\uc0e8\uc24b\uc0e8\uc0e8\uc255\uc0f4\uc0e9\uc246\uc272\uc24e\uc271\uc256\uc271\uc262\uc0e9\uc0e5\uc255\uc0f4\uc225\uc23c\uc0f9\uc245\uc0e5\uc225\uc0f6\uc0ff\uc271\uc0e8\uc0f7\uc0f7\uc0e8\uc244\uc0f6\uc0fe\uc0e5\uc234\uc250\uc250\uc0e7\uc237\uc234\uc0e6\uc25f\uc0ea\uc0f4\uc272\uc239\uc241\uc0e7\uc240\uc255\uc0f4\uc257\uc251\uc0fc\uc237\uc24b\uc272\uc103\uc0ed\uc250\uc244\uc24b\uc254\uc23c\uc250\uc0e9\uc0ea\uc0eb\uc272\uc242\uc245\uc245\uc245\uc24b\uc246\uc23f\uc251\uc252\uc25c\uc25f\uc0ea\uc25c\uc241\uc23c\uc273\uc242\uc254\uc259\uc257\uc244\uc0ff\uc241\uc24b\uc239\uc0e8\uc0eb\uc263\uc257\uc247\uc0eb\uc0fc\uc260\uc245\uc23f\uc247\uc24d\uc0e7\uc23c\uc243\uc262\uc260\uc235\uc0f9\uc0ea\uc25f\uc0ea\uc0eb\uc272\uc0e5\uc249\uc271\uc0ea\uc0e4\uc23c\uc22b\uc244\uc23e\uc25c\uc25e\uc25e\uc260\uc0e5\uc259\uc246\uc0fe\uc263\uc24b\uc225\uc0f4\uc256\uc25e\uc103\uc0e8\uc270\uc250\uc25f\uc100\uc0f7\uc239\uc271\uc24d\uc0f4\uc257\uc256\uc241\uc101\uc24a\uc0ff\uc0fe\uc246\uc250\uc100\uc0ed\uc235\uc26e\uc271\uc23e\uc247\uc0e5\uc23c\uc0f7\uc225\uc0ed\uc237\uc0e9\uc260\uc0eb\uc234\uc0e7\uc247\uc25e\uc102\uc251\uc242\uc237\uc23f\uc0f7\uc259\uc234\uc252\uc0e5\uc0fc\uc256\uc244\uc255\uc0eb\uc234\uc0e5\uc0f6\uc239\uc240\uc103\uc270\uc0fe\uc237\uc103\uc0f4\uc0f6\uc257\uc234\uc260\uc0e5\uc239\uc0f7\uc100\uc254\uc254\uc0fe\uc250\uc22b\uc23e\uc247\uc26e\uc103\uc0ff\uc0fe\uc0ed\uc245\uc0e7\uc235\uc235\uc24d\uc25c\uc0e9\uc250\uc261\uc273\uc103\uc0e7\uc260\uc0e4\uc252\uc249\uc0ff\uc272\uc273\uc260\uc22b\uc254\uc255\uc25e\uc0e8\uc239\uc0f9\uc0f7\uc0ed\uc22b\uc240\uc23e\uc103\uc0e8\uc245\uc0e5\uc25f\uc25c\uc0e9\uc24d\uc0e7\uc254\uc256\uc243\uc251\uc243\uc241\uc240\uc270\uc0e6\uc25e\uc0fc\uc241\uc0fc\uc270\uc23c\uc263\uc101\uc250\uc235\uc101\uc0f4\uc0fe\uc245\uc272\uc253\uc24e\uc0fc\uc0ff\uc253\uc235\uc272\uc256\uc234\uc23c\uc253\uc25c\uc100\uc0ed\uc23f\uc225\uc255\uc24a\uc257\uc245\uc248\uc0e5\uc23e\uc24d\uc24e\uc23c\uc0e8\uc0f4\uc270\uc23c\uc0eb\uc24e\uc239\uc252\uc246\uc253\uc0e5\uc273\uc257\uc241\uc253\uc23c\uc0f4\uc0f9\uc273\uc25e\uc234\uc241\uc23f\uc235\uc25c\uc100\uc254\uc246\uc242\uc251\uc237\uc260\uc246\uc248\uc101\uc259\uc234\uc26e\uc0ff\uc0e9\uc100\uc0ea\uc0f4\uc25e\uc257\uc255\uc0e7\uc247\uc255\uc246\uc100\uc0e9\uc102\uc24e\uc239\uc0f6\uc247\uc248\uc24a\uc273\uc0ea\uc0ea\uc263\uc0ea\uc0f6\uc254\uc25f\uc251\uc253\uc0e9\uc248\uc225\uc0ea\uc0e7\uc103\uc24b\uc260\uc244\uc255\uc234\uc240\uc257\uc25c\uc0e6\uc0e4\uc239\uc101\uc0e9\uc246\uc0e6\uc245\uc26e\uc0fe\uc24a\uc262\uc24a\uc273\uc0e7\uc0e7\uc245\uc102\uc239\uc103\uc245\uc100\uc101\uc254\uc255\uc24e\uc271\uc0f7\uc25c\uc24e\uc245\uc263\uc24a\uc0f9\uc24b\uc0fe\uc0e7\uc234\uc0eb\uc0f4\uc270\uc251\uc24d\uc247\uc101\uc0e8\uc0ea\uc240\uc273\uc103\uc244\uc25e\uc24b\uc25c\uc249\uc0fe\uc25c\uc0f6\uc0ff\uc251\uc225\uc0e9\uc0fc\uc251\uc242\uc247\uc241\uc0f9\uc253\uc225\uc234\uc260\uc250\uc245\uc0e9\uc240\uc0e6\uc235\uc0f9\uc25c\uc23e\uc24a\uc0e7\uc22b\uc259\uc271\uc100\uc244\uc244\uc0f9\uc241\uc261\uc0ff\uc103\uc243\uc24e\uc234\uc0f7\uc270\uc0fe\uc263\uc0e7\uc252\uc241\uc256\uc0f7\uc0f6\uc0e5\uc0ea\uc253\uc103\uc0fe\uc243\uc25f\uc235\uc0ea\uc22b\uc241\uc255\uc241\uc246\uc271\uc251\uc23c\uc0e9\uc23f\uc237\uc271\uc255\uc262\uc102\uc25e\uc225\uc0ea\uc244\uc24a\uc0e7\uc259\uc259\uc0e7\uc246\uc0f4\uc255\uc100\uc252\uc0e8\uc271\uc24b\uc272\uc0f7\uc234\uc272\uc256\uc254\uc240\uc23e\uc246\uc102\uc23f\uc0e5\uc251\uc253\uc248\uc23f\uc270\uc0e9\uc273\uc0e6\uc0f9\uc248\uc0f7\uc255\uc245\uc22b\uc272\uc246\uc24a\uc259\uc22b\uc253\uc0f6\uc234\uc24b\uc0eb\uc273\uc242\uc246\uc235\uc100\uc0e5\uc0ff\uc101\uc0e7\uc249\uc256\uc244\uc25c\uc245\uc0eb\uc0ea\uc248\uc262\uc242\uc0fc\uc247\uc257\uc102\uc101\uc243\uc102\uc251\uc237\uc0f6\uc102\uc24a\uc271\uc247\uc235\uc24b\uc272\uc245\uc257\uc24e\uc23f\uc239\uc247\uc262\uc25e\uc240\uc255\uc23c\uc252\uc0f4\uc25f\uc240\uc0fc\uc239\uc24b\uc246\uc24d\uc101\uc253\uc249\uc100\uc102\uc25e\uc24e\uc0e6\uc273\uc25f\uc0fe\uc0f7\uc0ff\uc22b\uc270\uc259\uc272\uc101\uc271\uc103\uc255\uc240\uc235\uc0f7\uc24a\uc23c\uc0fc\uc235\uc250\uc251\uc0f4\uc0e9\uc100\uc100\uc254\uc257\uc242\uc0e6\uc257\uc248\uc250\uc0fe\uc24b\uc260\uc25f\uc0fc\uc262\uc24d\uc100\uc271\uc272\uc253\uc270\uc0ed\uc245\uc248\uc25e\uc248\uc24d\uc271\uc225\uc24e\uc24b\uc24b\uc254\uc256\uc237\uc237\uc23e\uc225\uc24b\uc260\uc272\uc0eb\uc261\uc234\uc24e\uc25f\uc103\uc270\uc271\uc0ea\uc253\uc263\uc256\uc254\uc0e4\uc0ed\uc24d\uc270\uc271\uc253\uc0e5\uc24a\uc250\uc0f7\uc253\uc100\uc0e9\uc237\uc242\uc0ff\uc237\uc251\uc23c\uc239\uc248\uc241\uc245\uc0fc\uc0e5\uc0e6\uc0e9\uc0ff\uc251\uc0ed\uc0ed\uc0e4\uc23e\uc263\uc0e9\uc25f\uc0e7\uc102\uc0e6\uc23f\uc246\uc100\uc23c\uc253\uc0e5\uc25e\uc225\uc0e9\uc251\uc23e\uc0e4\uc253\uc0e8\uc235\uc251\uc242\uc0e5\uc25c\uc102\uc244\uc262\uc243\uc0fe\uc240\uc0e9\uc0e8\uc237\uc24b\uc0e7\uc23d\uc23d".toCharArray();
            for (int i2 = 0; i2 < 984; ++i2) {
                int n4 = cArray[i2];
                n4 -= 2690;
                n4 -= 37427;
                n4 -= 1125;
                n4 += 51062;
                n4 ^= 0x8AC6;
                n4 ^= 0xD5B7;
                n4 -= 10809;
                n4 ^= 0x1EB9;
                n4 -= 29098;
                n4 -= 25035;
                cArray[i2] = (char)(n4 += 16540);
            }
            object = kotakbaz.rain.client.util.render.font.E.A()[0] = new String(cArray);
        }
        objectArray[2] = (String)object;
        char[] cArray = ((String)kotakbaz.rain.client.util.render.font.E.a(objectArray)).toCharArray();
        long l17 = l6;
        int n5 = -149;
        n5 += 72;
        l6 = l17 ^ (0x2CF00000000L ^ l17) & -1L << (n5 ^= 0xFFFFFF93);
        long l18 = l13;
        int n6 = 64;
        n6 += -36;
        l13 = l18 ^ (0L ^ l18) & -1L >>> (n6 ^= 0x3C);
        while (true) {
            int n7 = 106;
            n7 ^= 0xFFFFFFB9;
            if ((int)l13 >= (int)(l6 >>> (n7 -= -77))) break;
            int n8 = (int)l13;
            long l19 = l13;
            int n9 = -43;
            n9 ^= 0xFFFFFF8E;
            int n10 = 244;
            n10 ^= 0x79;
            l13 = l19 ^ (l19 ^ l19 + (long)(n9 ^= 0x5A)) & -1L >>> (n10 -= 109);
            long l20 = l9;
            int n11 = 53;
            n11 ^= 0x72;
            l9 = l20 ^ ((long)cArray[n8] ^ l20) & -1L >>> (n11 ^= 0x67);
            int n12 = (int)l13;
            long l21 = l13;
            int n13 = 127;
            n13 += -97;
            int n14 = -74;
            n14 ^= 0x44;
            l13 = l21 ^ (l21 ^ l21 + (long)(n13 ^= 0x1F)) & -1L >>> (n14 -= -46);
            int n15 = 27;
            n15 += -17;
            long l22 = l10;
            int n16 = 29;
            n16 += -67;
            l10 = l22 ^ ((long)cArray[n12] << (n15 += 22) ^ l22) & -1L << (n16 -= -70);
            int n17 = 127;
            n17 ^= 0x21;
            n17 -= 78;
            int n18 = 8;
            n18 ^= 0xFFFFFFDD;
            long l23 = l12;
            int n19 = 152;
            n19 -= 112;
            l12 = l23 ^ ((long)((int)l9 << n17 | (int)(l10 >>> (n18 += 75))) ^ l23) & -1L >>> (n19 -= 8);
            char[] cArray2 = new char[(int)l12];
            long l24 = l14;
            int n20 = 68;
            n20 += -98;
            l14 = l24 ^ (0L ^ l24) & -1L << (n20 += 62);
            while (true) {
                int n21 = 7;
                n21 += 37;
                if ((int)(l14 >>> (n21 -= 12)) >= (int)l12) break;
                int n22 = -27;
                n22 += -18;
                int n23 = -52;
                n23 -= -81;
                cArray2[(int)(l14 >>> (n22 ^= 0xFFFFFFF3))] = cArray[(int)l13 + (int)(l14 >>> (n23 += 3))];
                l14 += 0x100000000L;
            }
            int n24 = -226;
            n24 += 99;
            int n25 = (int)(l15 >>> (n24 ^= 0xFFFFFFA1));
            l15 += 0x100000000L;
            kotakbaz.rain.client.util.render.font.E.p[n25] = new String(cArray2);
            long l25 = l13;
            int n26 = 195;
            n26 += -116;
            l13 = l25 ^ ((long)((int)l13 + (int)l12) ^ l25) & -1L >>> (n26 ^= 0x6F);
        }
        h = new A(null);
        int n27 = 5;
        n27 += -117;
        n27 ^= 0xFFFFFF93;
        int n28 = -63;
        n28 -= 27;
        n28 ^= 0xFFFFFFA4;
        int n29 = 14;
        n29 -= -94;
        n29 += -95;
        int n30 = 32;
        n30 -= -56;
        n30 ^= 0x5C;
        int n31 = 29;
        n31 += 48;
        n31 += -40;
        int n32 = 178;
        n32 += -52;
        n32 -= 123;
        int n33 = 122;
        n33 -= 51;
        n33 += -32;
        int n34 = 83;
        n34 ^= 0x13;
        n34 += -60;
        int n35 = -90;
        n35 -= -110;
        n35 += 30;
        int n36 = 12;
        n36 += 38;
        int n37 = 81;
        n37 -= 23;
        int n38 = -126;
        n38 ^= 0x62;
        O = kotakbaz.rain.client.render.main.vertex.format.a_0.builder().element((String)p[n27], kotakbaz.rain.client.render.main.vertex.element.a_0.C, n28).element((String)p[n29], kotakbaz.rain.client.render.main.vertex.element.a_0.C, n30).element((String)p[n31], kotakbaz.rain.client.render.main.vertex.element.a_0.C, n32).element((String)p[n33], kotakbaz.rain.client.render.main.vertex.element.a_0.C, n34).element((String)p[n35], kotakbaz.rain.client.render.main.vertex.element.a_0.C, n36 += -46).element((String)p[n37 += -44], kotakbaz.rain.client.render.main.vertex.element.a_0.C, n38 ^= 0xFFFFFFE4).build();
    }

    public static Object a(Object[] object) {
        Object object2;
        int n2 = (Integer)object[1];
        String string = (String)object[2];
        object = object[0];
        Object[] objectArray = Q;
        if (Q == null) {
            objectArray = Q = new Object[1];
        }
        if ((object2 = objectArray[n2]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[1];
                P = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[0x2CFB ^ 0x2CEB];
                byArray[0xBD96 ^ 0xBD94] = 0xFFFF420F ^ 0xBD94;
                byArray[0x25BD ^ 0x25BC] = 0xFFFFDA4B ^ 0x25BC;
                byArray[0x660E ^ 0x6606] = 0xFFFF99A3 ^ 0x6606;
                byArray[0x95D ^ 0x95E] = 0x96C ^ 0x95E;
                byArray[0x6F7C ^ 0x6F72] = 0xFFFF90EC ^ 0x6F72;
                byArray[0xE98C ^ 0xE98A] = 0xE997 ^ 0xE98A;
                byArray[0xCE7B ^ 0xCE76] = 0xFFFF31E1 ^ 0xCE76;
                byArray[0xE6BC ^ 0xE6B5] = 0xFFFF1967 ^ 0xE6B5;
                byArray[0x5790 ^ 0x579A] = 0xFFFFA81D ^ 0x579A;
                byArray[0xC88B ^ 0xC887] = 0xFFFF377C ^ 0xC887;
                byArray[0xFF7E ^ 0xFF7E] = 0xFFFF00E9 ^ 0xFF7E;
                byArray[0xF1D4 ^ 0xF1D0] = 0xF1C0 ^ 0xF1D0;
                byArray[0xB88F ^ 0xB88A] = 0xB88E ^ 0xB88A;
                byArray[0x53C7 ^ 0x53C8] = 0xFFFFAC4A ^ 0x53C8;
                byArray[0x2B4 ^ 0x2B3] = 0x296 ^ 0x2B3;
                byArray[0x8957 ^ 0x895C] = 0xFFFF76CC ^ 0x895C;
                objectArray2[0] = byArray;
            }
            byte[] byArray = (byte[])object3[0];
            if (q == null) {
                byte[] byArray2 = new byte[0x6897 ^ 0x68B7];
                byArray2[0xB7CC ^ 0xB7DA] = 0xB791 ^ 0xB7DA;
                byArray2[0x1049E ^ 0x10483] = 0xFFFEFB70 ^ 0x10483;
                byArray2[0x10124 ^ 0x1012A] = 0x1015A ^ 0x1012A;
                byArray2[0x32D9 ^ 0x32D1] = 0x32B6 ^ 0x32D1;
                byArray2[0x9FB9 ^ 0x9FAD] = 0x9F9C ^ 0x9FAD;
                byArray2[0x87B4 ^ 0x87A6] = 0xFFFF785F ^ 0x87A6;
                byArray2[0x9FFD ^ 0x9FE3] = 0x9FD5 ^ 0x9FE3;
                byArray2[0x5C5B ^ 0x5C59] = 0x5C45 ^ 0x5C59;
                byArray2[0xF663 ^ 0xF67F] = 0xFFFF09C6 ^ 0xF67F;
                byArray2[0xA041 ^ 0xA046] = 0xFFFF5FE9 ^ 0xA046;
                byArray2[0xF742 ^ 0xF749] = 0xF76D ^ 0xF749;
                byArray2[0x21B2 ^ 0x21A1] = 0xFFFFDE40 ^ 0x21A1;
                byArray2[0xD7DA ^ 0xD7CD] = 0xD7D1 ^ 0xD7CD;
                byArray2[0x8145 ^ 0x814C] = 0xFFFF7ED0 ^ 0x814C;
                byArray2[0xD77B ^ 0xD764] = 0xD75D ^ 0xD764;
                byArray2[0x3858 ^ 0x3842] = 0xFFFFC7A9 ^ 0x3842;
                byArray2[0xD93B ^ 0xD92B] = 0xFFFF26D8 ^ 0xD92B;
                byArray2[0x4E6B ^ 0x4E6F] = 0x4E2F ^ 0x4E6F;
                byArray2[0x10987 ^ 0x10982] = 0xFFFEF672 ^ 0x10982;
                byArray2[0x4503 ^ 0x4518] = 0xFFFFBACF ^ 0x4518;
                byArray2[0x909E ^ 0x9091] = 0xFFFF6F16 ^ 0x9091;
                byArray2[0x9334 ^ 0x932C] = 0x9352 ^ 0x932C;
                byArray2[0x7A81 ^ 0x7A98] = 0xFFFF856B ^ 0x7A98;
                byArray2[0x9442 ^ 0x9457] = 0x947B ^ 0x9457;
                byArray2[0x504E ^ 0x5044] = 0x5068 ^ 0x5044;
                byArray2[0xE4F7 ^ 0xE4FA] = 0xE4EB ^ 0xE4FA;
                byArray2[0xD385 ^ 0xD385] = 0xD3DA ^ 0xD385;
                byArray2[0xC7EE ^ 0xC7FF] = 0xFFFF383E ^ 0xC7FF;
                byArray2[0x2B9B ^ 0x2B98] = 0x2BA8 ^ 0x2B98;
                byArray2[0xC741 ^ 0xC740] = 0xFFFF38AB ^ 0xC740;
                byArray2[0x2090 ^ 0x209C] = 0x2085 ^ 0x209C;
                byArray2[0x9574 ^ 0x9572] = 0xFFFF6AE5 ^ 0x9572;
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, 0, byArray3, 0, byArray.length);
                System.arraycopy(byArray2, 0, byArray3, byArray.length, byArray2.length);
                Object object4 = kotakbaz.rain.client.util.render.font.E.A()[1];
                if (object4 == null) {
                    char[] cArray = "\u0e9e\u0e88\u0e91\u0e92\u0e8c\u0178\u0e9d\u0eb7\u0142\u0eb6\u0e96\u0ebb\u0eaf\u0ea9\u0e99\u0e96\u0e8f\u017f".toCharArray();
                    for (int i2 = 0; i2 < 18; ++i2) {
                        int n3 = cArray[i2];
                        n3 ^= 0x5950;
                        n3 -= 50594;
                        n3 += 30962;
                        n3 ^= 0xF2F4;
                        n3 -= 37509;
                        n3 += 56486;
                        n3 += 45079;
                        n3 -= 4648;
                        n3 ^= 0xEE99;
                        n3 -= 17275;
                        n3 -= 3067;
                        cArray[i2] = (char)(n3 ^= 0xBFBD);
                    }
                    object4 = kotakbaz.rain.client.util.render.font.E.A()[1] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[16];
                byArray4[4] = -50;
                byArray4[14] = -106;
                byArray4[6] = -11;
                byArray4[10] = -61;
                byArray4[3] = 63;
                byArray4[8] = 113;
                byArray4[13] = -128;
                byArray4[11] = -63;
                byArray4[2] = 106;
                byArray4[15] = 65;
                byArray4[5] = 54;
                byArray4[7] = -81;
                byArray4[9] = 91;
                byArray4[0] = 81;
                byArray4[12] = -113;
                byArray4[1] = -112;
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, 26, 256);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = kotakbaz.rain.client.util.render.font.E.A()[2];
                if (object5 == null) {
                    char[] cArray = "\ufda3\ufda7\ufd35".toCharArray();
                    for (int i3 = 0; i3 < 3; ++i3) {
                        int n4 = cArray[i3];
                        n4 += 22320;
                        n4 += 2947;
                        n4 -= 6964;
                        n4 += 30021;
                        n4 -= 31525;
                        n4 += 44534;
                        n4 ^= 0xBF37;
                        n4 ^= 0x36F7;
                        n4 -= 4312;
                        n4 ^= 0x759C;
                        cArray[i3] = (char)(n4 ^= 0x21FD);
                    }
                    object5 = kotakbaz.rain.client.util.render.font.E.A()[2] = new String(cArray);
                }
                q = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, 0, 16);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, 16, byArray6.length);
            Object object6 = kotakbaz.rain.client.util.render.font.E.A()[3];
            if (object6 == null) {
                char[] cArray = "\u87d9\u87f5\u87eb\u87cf\u87db\u87da\u87db\u87cf\u87e8\u87f3\u87db\u87eb\u87e5\u87e8\u87f9\u8814\u8814\u8811\u880e\u8817".toCharArray();
                for (int i4 = 0; i4 < 20; ++i4) {
                    int n5 = cArray[i4];
                    n5 -= 61921;
                    n5 += 39010;
                    n5 -= 17922;
                    n5 += 29090;
                    n5 -= 57091;
                    n5 -= 59498;
                    n5 -= 51916;
                    n5 ^= 0xF90C;
                    n5 += 2637;
                    n5 -= 48269;
                    n5 += 11885;
                    n5 -= 58804;
                    n5 += 3960;
                    n5 -= 5306;
                    n5 += 58267;
                    cArray[i4] = (char)(n5 -= 45918);
                }
                object6 = kotakbaz.rain.client.util.render.font.E.A()[3] = new String(cArray);
            }
            Cipher cipher = Cipher.getInstance((String)object6);
            cipher.init(2, (Key)((SecretKey)q), new IvParameterSpec(byArray7));
            byte[] byArray9 = cipher.doFinal(byArray8);
            object2 = new String(byArray9, StandardCharsets.UTF_8);
        }
        return object2;
    }

    private static Object[] A() {
        Object[] objectArray = r;
        if (r == null) {
            r = new Object[4];
            objectArray = r;
        }
        return objectArray;
    }

    public static void b() {
        R = new int[0xE54A ^ 0xE4DA];
        kotakbaz.rain.client.util.render.font.E.R[0x8241 ^ 0x830B] = 0xFFFF7C8A ^ 0x830B;
        kotakbaz.rain.client.util.render.font.E.R[0x390 ^ 0x33D] = 0xFFFFFC38 ^ 0x33D;
        kotakbaz.rain.client.util.render.font.E.R[0x1689 ^ 0x16D4] = 0xFFFFE96C ^ 0x16D4;
        kotakbaz.rain.client.util.render.font.E.R[0xB230 ^ 0xB2C1] = 0xB2BC ^ 0xB2C1;
        kotakbaz.rain.client.util.render.font.E.R[0xFA8 ^ 0xFBC] = 0xFFFFF02E ^ 0xFBC;
        kotakbaz.rain.client.util.render.font.E.R[0x6923 ^ 0x69F0] = 0x69BF ^ 0x69F0;
        kotakbaz.rain.client.util.render.font.E.R[0xA811 ^ 0xA818] = 0xFFFF57CC ^ 0xA818;
        kotakbaz.rain.client.util.render.font.E.R[0x10973 ^ 0x1094B] = 0xFFFEF698 ^ 0x1094B;
        kotakbaz.rain.client.util.render.font.E.R[0x108EE ^ 0x109BC] = 0x10998 ^ 0x109BC;
        kotakbaz.rain.client.util.render.font.E.R[0x9A3 ^ 0x9F4] = 0xFFFFF646 ^ 0x9F4;
        kotakbaz.rain.client.util.render.font.E.R[0x9DE9 ^ 0x9CED] = 0xFFFF63BA ^ 0x9CED;
        kotakbaz.rain.client.util.render.font.E.R[0xAE33 ^ 0xAEA3] = 0xFFFF512D ^ 0xAEA3;
        kotakbaz.rain.client.util.render.font.E.R[0xFB38 ^ 0xFB1E] = 0xFB70 ^ 0xFB1E;
        kotakbaz.rain.client.util.render.font.E.R[0x9C2F ^ 0x9C32] = 0x9C5C ^ 0x9C32;
        kotakbaz.rain.client.util.render.font.E.R[0x90D6 ^ 0x90C0] = 0x90D6 ^ 0x90C0;
        kotakbaz.rain.client.util.render.font.E.R[0x561D ^ 0x5725] = 0xFFFFA8D9 ^ 0x5725;
        kotakbaz.rain.client.util.render.font.E.R[0xD7EC ^ 0xD720] = 0xD721 ^ 0xD720;
        kotakbaz.rain.client.util.render.font.E.R[0x5958 ^ 0x594B] = 0xFFFFA680 ^ 0x594B;
        kotakbaz.rain.client.util.render.font.E.R[0xDB43 ^ 0xDBA5] = 0xDB75 ^ 0xDBA5;
        kotakbaz.rain.client.util.render.font.E.R[0x9F37 ^ 0x9E6F] = 0xFFFF61F8 ^ 0x9E6F;
        kotakbaz.rain.client.util.render.font.E.R[0x605C ^ 0x60D6] = 0x6097 ^ 0x60D6;
        kotakbaz.rain.client.util.render.font.E.R[0xFB14 ^ 0xFA91] = 0xFA92 ^ 0xFA91;
        kotakbaz.rain.client.util.render.font.E.R[0x21D4 ^ 0x219C] = 0x21BB ^ 0x219C;
        kotakbaz.rain.client.util.render.font.E.R[0x73C1 ^ 0x72DC] = 0xFFFF8D17 ^ 0x72DC;
        kotakbaz.rain.client.util.render.font.E.R[0x17EB ^ 0x16AC] = 0xFFFFE90A ^ 0x16AC;
        kotakbaz.rain.client.util.render.font.E.R[0x89B1 ^ 0x8908] = 0x897D ^ 0x8908;
        kotakbaz.rain.client.util.render.font.E.R[0x3A55 ^ 0x3B3C] = 0xFFFFC4FC ^ 0x3B3C;
        kotakbaz.rain.client.util.render.font.E.R[0xB1A4 ^ 0xB0E4] = 0xB0E7 ^ 0xB0E4;
        kotakbaz.rain.client.util.render.font.E.R[0xB029 ^ 0xB0C0] = 0xFFFF4F7A ^ 0xB0C0;
        kotakbaz.rain.client.util.render.font.E.R[0xFDB5 ^ 0xFCFD] = 0xFC80 ^ 0xFCFD;
        kotakbaz.rain.client.util.render.font.E.R[0x739B ^ 0x729D] = 0xFFFF8D09 ^ 0x729D;
        kotakbaz.rain.client.util.render.font.E.R[0xA935 ^ 0xA93F] = 0xA969 ^ 0xA93F;
        kotakbaz.rain.client.util.render.font.E.R[0xF385 ^ 0xF3AB] = 0xF398 ^ 0xF3AB;
        kotakbaz.rain.client.util.render.font.E.R[0x2C38 ^ 0x2D4D] = 0x2D31 ^ 0x2D4D;
        kotakbaz.rain.client.util.render.font.E.R[0x2647 ^ 0x274C] = 0xFFFFD8A4 ^ 0x274C;
        kotakbaz.rain.client.util.render.font.E.R[0x14FF ^ 0x1478] = 0x147F ^ 0x1478;
        kotakbaz.rain.client.util.render.font.E.R[0x77D8 ^ 0x76EF] = 0x766F ^ 0x76EF;
        kotakbaz.rain.client.util.render.font.E.R[0x105 ^ 0x13] = 0xFFFFFFE0 ^ 0x13;
        kotakbaz.rain.client.util.render.font.E.R[0xE4D0 ^ 0xE4FF] = 0xFFFF1B4D ^ 0xE4FF;
        kotakbaz.rain.client.util.render.font.E.R[0xCC3 ^ 0xC84] = 0xFFFFF370 ^ 0xC84;
        kotakbaz.rain.client.util.render.font.E.R[0x8D04 ^ 0x8C6E] = 0xFFFF73B3 ^ 0x8C6E;
        kotakbaz.rain.client.util.render.font.E.R[0x8EDC ^ 0x8EDD] = 0xFFFF711B ^ 0x8EDD;
        kotakbaz.rain.client.util.render.font.E.R[0x56AC ^ 0x578F] = 0x57F3 ^ 0x578F;
        kotakbaz.rain.client.util.render.font.E.R[0xF062 ^ 0xF039] = 0xF038 ^ 0xF039;
        kotakbaz.rain.client.util.render.font.E.R[0xA538 ^ 0xA576] = 0xFFFF5AFB ^ 0xA576;
        kotakbaz.rain.client.util.render.font.E.R[0x9DB ^ 0x96D] = 0xFFFFF6C2 ^ 0x96D;
        kotakbaz.rain.client.util.render.font.E.R[0x9458 ^ 0x945D] = 0x9402 ^ 0x945D;
        kotakbaz.rain.client.util.render.font.E.R[0x365F ^ 0x36C7] = 0x36C4 ^ 0x36C7;
        kotakbaz.rain.client.util.render.font.E.R[0x3BC0 ^ 0x3A4C] = 0xFFFFC58B ^ 0x3A4C;
        kotakbaz.rain.client.util.render.font.E.R[0xA03 ^ 0xA3E] = 0xFFFFF587 ^ 0xA3E;
        kotakbaz.rain.client.util.render.font.E.R[0x7646 ^ 0x76EE] = 0x768E ^ 0x76EE;
        kotakbaz.rain.client.util.render.font.E.R[0xE0FB ^ 0xE05C] = 0xE09E ^ 0xE05C;
        kotakbaz.rain.client.util.render.font.E.R[0x2B7B ^ 0x2B34] = 0xFFFFD487 ^ 0x2B34;
        kotakbaz.rain.client.util.render.font.E.R[0x4FA4 ^ 0x4FAC] = 0x4FD0 ^ 0x4FAC;
        kotakbaz.rain.client.util.render.font.E.R[0xEE26 ^ 0xEF15] = 0xFFFF10E4 ^ 0xEF15;
        kotakbaz.rain.client.util.render.font.E.R[0x7AFA ^ 0x7BF6] = 0x7BDC ^ 0x7BF6;
        kotakbaz.rain.client.util.render.font.E.R[0x4D71 ^ 0x4C0D] = 0x4C5D ^ 0x4C0D;
        kotakbaz.rain.client.util.render.font.E.R[0x8862 ^ 0x880A] = 0xFFFF7799 ^ 0x880A;
        kotakbaz.rain.client.util.render.font.E.R[0xAEBE ^ 0xAE75] = 0xFFFF519E ^ 0xAE75;
        kotakbaz.rain.client.util.render.font.E.R[0xBB36 ^ 0xBA51] = 0xFFFF45C3 ^ 0xBA51;
        kotakbaz.rain.client.util.render.font.E.R[0x7D8 ^ 0x6DF] = 0x6AE ^ 0x6DF;
        kotakbaz.rain.client.util.render.font.E.R[0x5E00 ^ 0x5F13] = 0x5F8A ^ 0x5F13;
        kotakbaz.rain.client.util.render.font.E.R[0xDD51 ^ 0xDC35] = 0xDC76 ^ 0xDC35;
        kotakbaz.rain.client.util.render.font.E.R[0xCE64 ^ 0xCF6E] = 0xCF0C ^ 0xCF6E;
        kotakbaz.rain.client.util.render.font.E.R[0x2148 ^ 0x21C1] = 0x21BF ^ 0x21C1;
        kotakbaz.rain.client.util.render.font.E.R[0xE3EF ^ 0xE3BB] = 0xFFFF1C27 ^ 0xE3BB;
        kotakbaz.rain.client.util.render.font.E.R[0x6D7C ^ 0x6C0A] = 0x6D06 ^ 0x6C0A;
        kotakbaz.rain.client.util.render.font.E.R[0xBDD ^ 0xA9F] = 0xABD ^ 0xA9F;
        kotakbaz.rain.client.util.render.font.E.R[0x476F ^ 0x4651] = 0xFFFFB9B4 ^ 0x4651;
        kotakbaz.rain.client.util.render.font.E.R[0x775B ^ 0x7658] = 0x7641 ^ 0x7658;
        kotakbaz.rain.client.util.render.font.E.R[0xD1E9 ^ 0xD180] = 0xD1BA ^ 0xD180;
        kotakbaz.rain.client.util.render.font.E.R[0x33CD ^ 0x33A0] = 0xFFFFCC60 ^ 0x33A0;
        kotakbaz.rain.client.util.render.font.E.R[0x5FDC ^ 0x5F6D] = 0x5F65 ^ 0x5F6D;
        kotakbaz.rain.client.util.render.font.E.R[0x916A ^ 0x914F] = 0xFFFF6E8D ^ 0x914F;
        kotakbaz.rain.client.util.render.font.E.R[0x10972 ^ 0x109F2] = 0x109E3 ^ 0x109F2;
        kotakbaz.rain.client.util.render.font.E.R[0x3FC0 ^ 0x3EDA] = 0x3E9F ^ 0x3EDA;
        kotakbaz.rain.client.util.render.font.E.R[0xC561 ^ 0xC5A0] = 0xFFFF3A71 ^ 0xC5A0;
        kotakbaz.rain.client.util.render.font.E.R[0x48BD ^ 0x48CD] = 0xFFFFB728 ^ 0x48CD;
        kotakbaz.rain.client.util.render.font.E.R[0xFD5A ^ 0xFD78] = 0xFD08 ^ 0xFD78;
        kotakbaz.rain.client.util.render.font.E.R[0x350A ^ 0x3538] = 0xFFFFCAFA ^ 0x3538;
        kotakbaz.rain.client.util.render.font.E.R[0xCA0D ^ 0xCA94] = 0xCA9C ^ 0xCA94;
        kotakbaz.rain.client.util.render.font.E.R[0x78FC ^ 0x784F] = 0xFFFF87F1 ^ 0x784F;
        kotakbaz.rain.client.util.render.font.E.R[0x8449 ^ 0x8546] = 0x855D ^ 0x8546;
        kotakbaz.rain.client.util.render.font.E.R[0x2ECB ^ 0x2EB0] = 0xFFFFD14A ^ 0x2EB0;
        kotakbaz.rain.client.util.render.font.E.R[0x5AF8 ^ 0x5B7A] = 0xFFFFA4E7 ^ 0x5B7A;
        kotakbaz.rain.client.util.render.font.E.R[0x10BDE ^ 0x10BA8] = 0x10BF6 ^ 0x10BA8;
        kotakbaz.rain.client.util.render.font.E.R[0xCF13 ^ 0xCF81] = 0xCFF1 ^ 0xCF81;
        kotakbaz.rain.client.util.render.font.E.R[0xD9FF ^ 0xD990] = 0xFFFF260C ^ 0xD990;
        kotakbaz.rain.client.util.render.font.E.R[0x19DB ^ 0x194D] = 0xFFFFE6B0 ^ 0x194D;
        kotakbaz.rain.client.util.render.font.E.R[0x50EC ^ 0x51B8] = 0x51CD ^ 0x51B8;
        kotakbaz.rain.client.util.render.font.E.R[0xFD15 ^ 0xFD13] = 0xFD22 ^ 0xFD13;
        kotakbaz.rain.client.util.render.font.E.R[0x10498 ^ 0x10417] = 0x104F7 ^ 0x10417;
        kotakbaz.rain.client.util.render.font.E.R[0xEC24 ^ 0xECB5] = 0xECFB ^ 0xECB5;
        kotakbaz.rain.client.util.render.font.E.R[0x50B6 ^ 0x5069] = 0xFFFFAFDF ^ 0x5069;
        kotakbaz.rain.client.util.render.font.E.R[0x7004 ^ 0x70CB] = 0xFFFF8F0C ^ 0x70CB;
        kotakbaz.rain.client.util.render.font.E.R[0x82AD ^ 0x83C1] = 0x83DF ^ 0x83C1;
        kotakbaz.rain.client.util.render.font.E.R[0x7AE5 ^ 0x7B94] = 0xFFFF8455 ^ 0x7B94;
        kotakbaz.rain.client.util.render.font.E.R[0x9271 ^ 0x928C] = 0x9292 ^ 0x928C;
        kotakbaz.rain.client.util.render.font.E.R[0x6480 ^ 0x64AB] = 0xFFFF9B12 ^ 0x64AB;
        kotakbaz.rain.client.util.render.font.E.R[0xCB4 ^ 0xCAA] = 0xFFFFF37E ^ 0xCAA;
        kotakbaz.rain.client.util.render.font.E.R[0xAC2B ^ 0xAC06] = 0xAC63 ^ 0xAC06;
        kotakbaz.rain.client.util.render.font.E.R[0xA607 ^ 0xA6C3] = 0xFFFF5975 ^ 0xA6C3;
        kotakbaz.rain.client.util.render.font.E.R[0x1B36 ^ 0x1A70] = 0x1AC7 ^ 0x1A70;
        kotakbaz.rain.client.util.render.font.E.R[0x7596 ^ 0x74AF] = 0x74D7 ^ 0x74AF;
        kotakbaz.rain.client.util.render.font.E.R[0x7462 ^ 0x7460] = 0xFFFF8BA1 ^ 0x7460;
        kotakbaz.rain.client.util.render.font.E.R[0xB981 ^ 0xB8DE] = 0xB89A ^ 0xB8DE;
        kotakbaz.rain.client.util.render.font.E.R[0x2B0F ^ 0x2BBA] = 0xFFFFD44B ^ 0x2BBA;
        kotakbaz.rain.client.util.render.font.E.R[0x35BD ^ 0x3520] = 0x354B ^ 0x3520;
        kotakbaz.rain.client.util.render.font.E.R[0xD4AD ^ 0xD590] = 0xD5D0 ^ 0xD590;
        kotakbaz.rain.client.util.render.font.E.R[0x4BE8 ^ 0x4AED] = 0x4A84 ^ 0x4AED;
        kotakbaz.rain.client.util.render.font.E.R[0x7DD4 ^ 0x7D36] = 0x7D3A ^ 0x7D36;
        kotakbaz.rain.client.util.render.font.E.R[0xCC04 ^ 0xCD52] = 0xFFFF32D5 ^ 0xCD52;
        kotakbaz.rain.client.util.render.font.E.R[0x59FA ^ 0x5953] = 0x5930 ^ 0x5953;
        kotakbaz.rain.client.util.render.font.E.R[0x43F2 ^ 0x435C] = 0xFFFFBCC2 ^ 0x435C;
        kotakbaz.rain.client.util.render.font.E.R[0x61E2 ^ 0x60D6] = 0xFFFF9F41 ^ 0x60D6;
        kotakbaz.rain.client.util.render.font.E.R[0xD349 ^ 0xD2CD] = 0xFFFF2D69 ^ 0xD2CD;
        kotakbaz.rain.client.util.render.font.E.R[0x440D ^ 0x44F1] = 0xFFFFBB53 ^ 0x44F1;
        kotakbaz.rain.client.util.render.font.E.R[0xCB5A ^ 0xCA60] = 0xFFFF3574 ^ 0xCA60;
        kotakbaz.rain.client.util.render.font.E.R[0xE65F ^ 0xE692] = 0xFFFF1958 ^ 0xE692;
        kotakbaz.rain.client.util.render.font.E.R[0x6F35 ^ 0x6FCC] = 0x6FA6 ^ 0x6FCC;
        kotakbaz.rain.client.util.render.font.E.R[0xF388 ^ 0xF296] = 0xF2B0 ^ 0xF296;
        kotakbaz.rain.client.util.render.font.E.R[0x3F1C ^ 0x3E3E] = 0xFFFFC184 ^ 0x3E3E;
        kotakbaz.rain.client.util.render.font.E.R[0xCAFB ^ 0xCA59] = 0xCA78 ^ 0xCA59;
        kotakbaz.rain.client.util.render.font.E.R[0xAD50 ^ 0xAC78] = 0xACD3 ^ 0xAC78;
        kotakbaz.rain.client.util.render.font.E.R[0x97E8 ^ 0x97CB] = 0x97BC ^ 0x97CB;
        kotakbaz.rain.client.util.render.font.E.R[0xD546 ^ 0xD580] = 0xFFFF2A53 ^ 0xD580;
        kotakbaz.rain.client.util.render.font.E.R[0xC879 ^ 0xC803] = 0xC829 ^ 0xC803;
        kotakbaz.rain.client.util.render.font.E.R[0xE15 ^ 0xE57] = 0xE2A ^ 0xE57;
        kotakbaz.rain.client.util.render.font.E.R[0x658F ^ 0x6595] = 0x65E9 ^ 0x6595;
        kotakbaz.rain.client.util.render.font.E.R[0x583D ^ 0x5942] = 0x58CF ^ 0x5942;
        kotakbaz.rain.client.util.render.font.E.R[0x4775 ^ 0x47D6] = 0xFFFFB831 ^ 0x47D6;
        kotakbaz.rain.client.util.render.font.E.R[0x180C ^ 0x187E] = 0xFFFFE7B5 ^ 0x187E;
        kotakbaz.rain.client.util.render.font.E.R[0x6FF4 ^ 0x6F10] = 0xFFFF90CC ^ 0x6F10;
        kotakbaz.rain.client.util.render.font.E.R[0x10C44 ^ 0x10CD7] = 0xFFFEF318 ^ 0x10CD7;
        kotakbaz.rain.client.util.render.font.E.R[0x5730 ^ 0x5601] = 0x564C ^ 0x5601;
        kotakbaz.rain.client.util.render.font.E.R[0x6DF9 ^ 0x6C8B] = 0x6C95 ^ 0x6C8B;
        kotakbaz.rain.client.util.render.font.E.R[0x348 ^ 0x32B] = 0xFFFFFCBF ^ 0x32B;
        kotakbaz.rain.client.util.render.font.E.R[0xE45 ^ 0xEAF] = 0xEA5 ^ 0xEAF;
        kotakbaz.rain.client.util.render.font.E.R[0x3ABE ^ 0x3AE0] = 0x3A82 ^ 0x3AE0;
        kotakbaz.rain.client.util.render.font.E.R[0x7829 ^ 0x7951] = 0xFFFF86D8 ^ 0x7951;
        kotakbaz.rain.client.util.render.font.E.R[0xD0E0 ^ 0xD0A9] = 0xFFFF2F30 ^ 0xD0A9;
        kotakbaz.rain.client.util.render.font.E.R[0xB3E5 ^ 0xB3E6] = 0xB328 ^ 0xB3E6;
        kotakbaz.rain.client.util.render.font.E.R[0x9BC0 ^ 0x9AF2] = 0x9AE7 ^ 0x9AF2;
        kotakbaz.rain.client.util.render.font.E.R[0xCDB1 ^ 0xCC9B] = 0xFFFF336D ^ 0xCC9B;
        kotakbaz.rain.client.util.render.font.E.R[0xCEEC ^ 0xCF67] = 0xFFFF3022 ^ 0xCF67;
        kotakbaz.rain.client.util.render.font.E.R[0x8630 ^ 0x8731] = 0x87B6 ^ 0x8731;
        kotakbaz.rain.client.util.render.font.E.R[0x107CE ^ 0x10779] = 0x1071C ^ 0x10779;
        kotakbaz.rain.client.util.render.font.E.R[0x9809 ^ 0x996A] = 0x9945 ^ 0x996A;
        kotakbaz.rain.client.util.render.font.E.R[0x79A9 ^ 0x795A] = 0xFFFF8695 ^ 0x795A;
        kotakbaz.rain.client.util.render.font.E.R[0x84EF ^ 0x85DF] = 0x8595 ^ 0x85DF;
        kotakbaz.rain.client.util.render.font.E.R[0x891D ^ 0x89D8] = 0x89D4 ^ 0x89D8;
        kotakbaz.rain.client.util.render.font.E.R[0x848F ^ 0x8446] = 0xFFFF7BDD ^ 0x8446;
        kotakbaz.rain.client.util.render.font.E.R[0x32C6 ^ 0x3228] = 0x325E ^ 0x3228;
        kotakbaz.rain.client.util.render.font.E.R[0xD5CA ^ 0xD542] = 0xD568 ^ 0xD542;
        kotakbaz.rain.client.util.render.font.E.R[0x25E9 ^ 0x25C3] = 0x2583 ^ 0x25C3;
        kotakbaz.rain.client.util.render.font.E.R[0x106E5 ^ 0x10657] = 0x1065E ^ 0x10657;
        kotakbaz.rain.client.util.render.font.E.R[0x10DFE ^ 0x10D9C] = 0xFFFEF27D ^ 0x10D9C;
        kotakbaz.rain.client.util.render.font.E.R[0x11D6 ^ 0x111C] = 0xFFFFEE94 ^ 0x111C;
        kotakbaz.rain.client.util.render.font.E.R[0xB995 ^ 0xB8CF] = 0xFFFF472B ^ 0xB8CF;
        kotakbaz.rain.client.util.render.font.E.R[0xC52 ^ 0xC34] = 0xC17 ^ 0xC34;
        kotakbaz.rain.client.util.render.font.E.R[0x39A4 ^ 0x38B3] = 0x38B5 ^ 0x38B3;
        kotakbaz.rain.client.util.render.font.E.R[0x1BA5 ^ 0x1A9A] = 0x1AA1 ^ 0x1A9A;
        kotakbaz.rain.client.util.render.font.E.R[0xAC3C ^ 0xADBA] = 0xFFFF5225 ^ 0xADBA;
        kotakbaz.rain.client.util.render.font.E.R[0x3DDF ^ 0x3D3F] = 0x3D36 ^ 0x3D3F;
        kotakbaz.rain.client.util.render.font.E.R[0x16A7 ^ 0x1623] = 0x1640 ^ 0x1623;
        kotakbaz.rain.client.util.render.font.E.R[0x3723 ^ 0x3770] = 0xFFFFC8C2 ^ 0x3770;
        kotakbaz.rain.client.util.render.font.E.R[0x3A2A ^ 0x3B31] = 0xFFFFC483 ^ 0x3B31;
        kotakbaz.rain.client.util.render.font.E.R[0x6718 ^ 0x6673] = 0xFFFF99C6 ^ 0x6673;
        kotakbaz.rain.client.util.render.font.E.R[0x4385 ^ 0x436E] = 0xFFFFBC8A ^ 0x436E;
        kotakbaz.rain.client.util.render.font.E.R[0xE8D ^ 0xFCC] = 0xF8D ^ 0xFCC;
        kotakbaz.rain.client.util.render.font.E.R[0x6B0B ^ 0x6B5D] = 0x6B30 ^ 0x6B5D;
        kotakbaz.rain.client.util.render.font.E.R[0x5F54 ^ 0x5FD1] = 0xFFFFA044 ^ 0x5FD1;
        kotakbaz.rain.client.util.render.font.E.R[0x44A5 ^ 0x45F6] = 0xFFFFBA7C ^ 0x45F6;
        kotakbaz.rain.client.util.render.font.E.R[0x2154 ^ 0x2183] = 0x2117 ^ 0x2183;
        kotakbaz.rain.client.util.render.font.E.R[0x7D3E ^ 0x7DA4] = 0x7DAF ^ 0x7DA4;
        kotakbaz.rain.client.util.render.font.E.R[0x5894 ^ 0x59BB] = 0x59C9 ^ 0x59BB;
        kotakbaz.rain.client.util.render.font.E.R[0xE890 ^ 0xE866] = 0xFFFF17D8 ^ 0xE866;
        kotakbaz.rain.client.util.render.font.E.R[0x68E1 ^ 0x689E] = 0x68E2 ^ 0x689E;
        kotakbaz.rain.client.util.render.font.E.R[0xE103 ^ 0xE06B] = 0xE029 ^ 0xE06B;
        kotakbaz.rain.client.util.render.font.E.R[0x4117 ^ 0x41C9] = 0x4199 ^ 0x41C9;
        kotakbaz.rain.client.util.render.font.E.R[0xCF69 ^ 0xCF4D] = 0xCF83 ^ 0xCF4D;
        kotakbaz.rain.client.util.render.font.E.R[0xCF17 ^ 0xCF2C] = 0xFFFF30EA ^ 0xCF2C;
        kotakbaz.rain.client.util.render.font.E.R[0x5F7A ^ 0x5F10] = 0xFFFFA0D3 ^ 0x5F10;
        kotakbaz.rain.client.util.render.font.E.R[0x31E8 ^ 0x31A8] = 0xFFFFCE26 ^ 0x31A8;
        kotakbaz.rain.client.util.render.font.E.R[0xE69D ^ 0xE6FD] = 0xFFFF1931 ^ 0xE6FD;
        kotakbaz.rain.client.util.render.font.E.R[0x103DA ^ 0x1038F] = 0xFFFEFC42 ^ 0x1038F;
        kotakbaz.rain.client.util.render.font.E.R[0xAA78 ^ 0xAA90] = 0xFFFF5513 ^ 0xAA90;
        kotakbaz.rain.client.util.render.font.E.R[0xAB66 ^ 0xAA06] = 0xAA5E ^ 0xAA06;
        kotakbaz.rain.client.util.render.font.E.R[0x9AB1 ^ 0x9BB9] = 0x9B9E ^ 0x9BB9;
        kotakbaz.rain.client.util.render.font.E.R[0xFE81 ^ 0xFEFF] = 0xFFFF0117 ^ 0xFEFF;
        kotakbaz.rain.client.util.render.font.E.R[0x54BC ^ 0x54D0] = 0xFFFFAB3C ^ 0x54D0;
        kotakbaz.rain.client.util.render.font.E.R[0x805C ^ 0x817A] = 0x814E ^ 0x817A;
        kotakbaz.rain.client.util.render.font.E.R[0xAF90 ^ 0xAE90] = 0xAECA ^ 0xAE90;
        kotakbaz.rain.client.util.render.font.E.R[0xA68 ^ 0xA23] = 0xFFFFF5ED ^ 0xA23;
        kotakbaz.rain.client.util.render.font.E.R[0xE62 ^ 0xEE9] = 0xEF0 ^ 0xEE9;
        kotakbaz.rain.client.util.render.font.E.R[0x4457 ^ 0x44B6] = 0xFFFFBB6B ^ 0x44B6;
        kotakbaz.rain.client.util.render.font.E.R[0x1C3E ^ 0x1C4B] = 0x1C03 ^ 0x1C4B;
        kotakbaz.rain.client.util.render.font.E.R[0xF665 ^ 0xF649] = 0xFFFF09B1 ^ 0xF649;
        kotakbaz.rain.client.util.render.font.E.R[0x9D78 ^ 0x9D09] = 0x9D26 ^ 0x9D09;
        kotakbaz.rain.client.util.render.font.E.R[0x4EE6 ^ 0x4E1C] = 0xFFFFB188 ^ 0x4E1C;
        kotakbaz.rain.client.util.render.font.E.R[0xC61A ^ 0xC726] = 0xFFFF38B7 ^ 0xC726;
        kotakbaz.rain.client.util.render.font.E.R[0x2DDC ^ 0x2DE6] = 0xFFFFD23A ^ 0x2DE6;
        kotakbaz.rain.client.util.render.font.E.R[0x790 ^ 0x7F1] = 0x7A1 ^ 0x7F1;
        kotakbaz.rain.client.util.render.font.E.R[0x2BA4 ^ 0x2B53] = 0xFFFFD4E2 ^ 0x2B53;
        kotakbaz.rain.client.util.render.font.E.R[0x23F2 ^ 0x2386] = 0x2349 ^ 0x2386;
        kotakbaz.rain.client.util.render.font.E.R[0x78E5 ^ 0x7830] = 0xFFFF87E8 ^ 0x7830;
        kotakbaz.rain.client.util.render.font.E.R[0x1012 ^ 0x1016] = 0xFFFFEF81 ^ 0x1016;
        kotakbaz.rain.client.util.render.font.E.R[0x6F47 ^ 0x6FFD] = 0x6FC9 ^ 0x6FFD;
        kotakbaz.rain.client.util.render.font.E.R[0x2518 ^ 0x25FB] = 0x258C ^ 0x25FB;
        kotakbaz.rain.client.util.render.font.E.R[0x7131 ^ 0x707F] = 0xFFFF8FAA ^ 0x707F;
        kotakbaz.rain.client.util.render.font.E.R[0x1005C ^ 0x1001A] = 0xFFFEFFE3 ^ 0x1001A;
        kotakbaz.rain.client.util.render.font.E.R[0x10543 ^ 0x10506] = 0x10506 ^ 0x10506;
        kotakbaz.rain.client.util.render.font.E.R[0x66D9 ^ 0x6601] = 0x666B ^ 0x6601;
        kotakbaz.rain.client.util.render.font.E.R[0x10559 ^ 0x105F9] = 0x1058E ^ 0x105F9;
        kotakbaz.rain.client.util.render.font.E.R[0xCE24 ^ 0xCE05] = 0xFFFF31E4 ^ 0xCE05;
        kotakbaz.rain.client.util.render.font.E.R[0x10A8A ^ 0x10A67] = 0xFFFEF5BA ^ 0x10A67;
        kotakbaz.rain.client.util.render.font.E.R[0x80B ^ 0x8B7] = 0x844 ^ 0x8B7;
        kotakbaz.rain.client.util.render.font.E.R[0x9113 ^ 0x904D] = 0x9071 ^ 0x904D;
        kotakbaz.rain.client.util.render.font.E.R[0xFE8B ^ 0xFEA3] = 0xFED2 ^ 0xFEA3;
        kotakbaz.rain.client.util.render.font.E.R[0x8CFF ^ 0x8DA4] = 0x8DE7 ^ 0x8DA4;
        kotakbaz.rain.client.util.render.font.E.R[0xD3BD ^ 0xD2D8] = 0xD2F9 ^ 0xD2D8;
        kotakbaz.rain.client.util.render.font.E.R[0x1BD8 ^ 0x1ABA] = 0x1AC2 ^ 0x1ABA;
        kotakbaz.rain.client.util.render.font.E.R[0xBF27 ^ 0xBEA4] = 0xFFFF4143 ^ 0xBEA4;
        kotakbaz.rain.client.util.render.font.E.R[0x59CC ^ 0x598F] = 0xFFFFA62B ^ 0x598F;
        kotakbaz.rain.client.util.render.font.E.R[0xB4C2 ^ 0xB5B6] = 0xB5D0 ^ 0xB5B6;
        kotakbaz.rain.client.util.render.font.E.R[0x204 ^ 0x2A0] = 0x218 ^ 0x2A0;
        kotakbaz.rain.client.util.render.font.E.R[0xF29C ^ 0xF312] = 0xFFFF0C84 ^ 0xF312;
        kotakbaz.rain.client.util.render.font.E.R[0x9E17 ^ 0x9E9B] = 0xFFFF617D ^ 0x9E9B;
        kotakbaz.rain.client.util.render.font.E.R[0x5A52 ^ 0x5BD3] = 0xFFFFA442 ^ 0x5BD3;
        kotakbaz.rain.client.util.render.font.E.R[0xB3EB ^ 0xB3F3] = 0xFFFF4C51 ^ 0xB3F3;
        kotakbaz.rain.client.util.render.font.E.R[0x758 ^ 0x747] = 0xFFFFF891 ^ 0x747;
        kotakbaz.rain.client.util.render.font.E.R[0x20B8 ^ 0x2040] = 0x200A ^ 0x2040;
        kotakbaz.rain.client.util.render.font.E.R[0xA616 ^ 0xA665] = 0xFFFF599F ^ 0xA665;
        kotakbaz.rain.client.util.render.font.E.R[0x9089 ^ 0x919B] = 0x91F7 ^ 0x919B;
        kotakbaz.rain.client.util.render.font.E.R[0xA046 ^ 0xA028] = 0xFFFF5FA8 ^ 0xA028;
        kotakbaz.rain.client.util.render.font.E.R[0xCA14 ^ 0xCAB1] = 0xCA83 ^ 0xCAB1;
        kotakbaz.rain.client.util.render.font.E.R[0x1055A ^ 0x1056C] = 0xFFFEFAFE ^ 0x1056C;
        kotakbaz.rain.client.util.render.font.E.R[0x679A ^ 0x66CF] = 0xFFFF9951 ^ 0x66CF;
        kotakbaz.rain.client.util.render.font.E.R[0xEF8F ^ 0xEE9B] = 0xEEAB ^ 0xEE9B;
        kotakbaz.rain.client.util.render.font.E.R[0x2453 ^ 0x2546] = 0x250F ^ 0x2546;
        kotakbaz.rain.client.util.render.font.E.R[0xB398 ^ 0xB333] = 0xB361 ^ 0xB333;
        kotakbaz.rain.client.util.render.font.E.R[0x15EA ^ 0x1531] = 0xFFFFEA88 ^ 0x1531;
        kotakbaz.rain.client.util.render.font.E.R[0x7D43 ^ 0x7D3B] = 0x7D53 ^ 0x7D3B;
        kotakbaz.rain.client.util.render.font.E.R[0x32AA ^ 0x32E7] = 0x3289 ^ 0x32E7;
        kotakbaz.rain.client.util.render.font.E.R[0x7B29 ^ 0x7B7B] = 0x7B0A ^ 0x7B7B;
        kotakbaz.rain.client.util.render.font.E.R[0xAFF8 ^ 0xAFCF] = 0xFFFF5069 ^ 0xAFCF;
        kotakbaz.rain.client.util.render.font.E.R[0x60DE ^ 0x6066] = 0x6050 ^ 0x6066;
        kotakbaz.rain.client.util.render.font.E.R[0xAAD3 ^ 0xAA3F] = 0xAA0C ^ 0xAA3F;
        kotakbaz.rain.client.util.render.font.E.R[0x52F3 ^ 0x527E] = 0x525B ^ 0x527E;
        kotakbaz.rain.client.util.render.font.E.R[0x5442 ^ 0x54AD] = 0x540A ^ 0x54AD;
        kotakbaz.rain.client.util.render.font.E.R[0x804A ^ 0x8013] = 0xFFFF7FC1 ^ 0x8013;
        kotakbaz.rain.client.util.render.font.E.R[0x38C1 ^ 0x3811] = 0x381D ^ 0x3811;
        kotakbaz.rain.client.util.render.font.E.R[0xC825 ^ 0xC87D] = 0xC825 ^ 0xC87D;
        kotakbaz.rain.client.util.render.font.E.R[0x2FF ^ 0x386] = 0x3FF ^ 0x386;
        kotakbaz.rain.client.util.render.font.E.R[0xB683 ^ 0xB6BD] = 0xB691 ^ 0xB6BD;
        kotakbaz.rain.client.util.render.font.E.R[0xE0D8 ^ 0xE05A] = 0xE077 ^ 0xE05A;
        kotakbaz.rain.client.util.render.font.E.R[0xA0A1 ^ 0xA0B1] = 0xA0E7 ^ 0xA0B1;
        kotakbaz.rain.client.util.render.font.E.R[0x6EB3 ^ 0x6FDD] = 0xFFFF9059 ^ 0x6FDD;
        kotakbaz.rain.client.util.render.font.E.R[0xF3FB ^ 0xF351] = 0xFFFF0EDF ^ 0xF351;
        kotakbaz.rain.client.util.render.font.E.R[0xAD70 ^ 0xAC20] = 0xFFFF53BF ^ 0xAC20;
        kotakbaz.rain.client.util.render.font.E.R[0x401A ^ 0x40C6] = 0x40CE ^ 0x40C6;
        kotakbaz.rain.client.util.render.font.E.R[0xB0BE ^ 0xB137] = 0xFFFF4EB0 ^ 0xB137;
        kotakbaz.rain.client.util.render.font.E.R[0xDFD5 ^ 0xDF1B] = 0xFFFF20CB ^ 0xDF1B;
        kotakbaz.rain.client.util.render.font.E.R[0xBBF7 ^ 0xBAE8] = 0xFFFF4501 ^ 0xBAE8;
        kotakbaz.rain.client.util.render.font.E.R[0x84DA ^ 0x8444] = 0x8436 ^ 0x8444;
        kotakbaz.rain.client.util.render.font.E.R[0x2F23 ^ 0x2E67] = 0x2E04 ^ 0x2E67;
        kotakbaz.rain.client.util.render.font.E.R[0x9228 ^ 0x9278] = 0x9257 ^ 0x9278;
        kotakbaz.rain.client.util.render.font.E.R[0xE841 ^ 0xE964] = 0xE92E ^ 0xE964;
        kotakbaz.rain.client.util.render.font.E.R[0xBA6A ^ 0xBA94] = 0xFFFF4563 ^ 0xBA94;
        kotakbaz.rain.client.util.render.font.E.R[0x5120 ^ 0x5186] = 0x51FC ^ 0x5186;
        kotakbaz.rain.client.util.render.font.E.R[0x3DC0 ^ 0x3C99] = 0x3CCA ^ 0x3C99;
        kotakbaz.rain.client.util.render.font.E.R[0x73A6 ^ 0x7381] = 0x7388 ^ 0x7381;
        kotakbaz.rain.client.util.render.font.E.R[0xBD49 ^ 0xBDD5] = 0xFFFF421D ^ 0xBDD5;
        kotakbaz.rain.client.util.render.font.E.R[0xEE75 ^ 0xEF55] = 0xFFFF10EE ^ 0xEF55;
        kotakbaz.rain.client.util.render.font.E.R[0x57BB ^ 0x57E1] = 0x57D9 ^ 0x57E1;
        kotakbaz.rain.client.util.render.font.E.R[0xF878 ^ 0xF829] = 0xFFFF0791 ^ 0xF829;
        kotakbaz.rain.client.util.render.font.E.R[0x5A57 ^ 0x5A0B] = 0x5A1F ^ 0x5A0B;
        kotakbaz.rain.client.util.render.font.E.R[0xEFEC ^ 0xEE83] = 0xFFFF1163 ^ 0xEE83;
        kotakbaz.rain.client.util.render.font.E.R[0x10DA4 ^ 0x10CF3] = 0x10CCA ^ 0x10CF3;
        kotakbaz.rain.client.util.render.font.E.R[0x78F5 ^ 0x7890] = 0x78FD ^ 0x7890;
        kotakbaz.rain.client.util.render.font.E.R[0x8F4D ^ 0x8FAA] = 0x8F99 ^ 0x8FAA;
        kotakbaz.rain.client.util.render.font.E.R[0x80FB ^ 0x8174] = 0xFFFF7E9B ^ 0x8174;
        kotakbaz.rain.client.util.render.font.E.R[0x54BB ^ 0x55B2] = 0xFFFFAA04 ^ 0x55B2;
        kotakbaz.rain.client.util.render.font.E.R[0x56CC ^ 0x57B2] = 0x57B5 ^ 0x57B2;
        kotakbaz.rain.client.util.render.font.E.R[0xD7CC ^ 0xD74D] = 0xFFFF28B0 ^ 0xD74D;
        kotakbaz.rain.client.util.render.font.E.R[0x2543 ^ 0x2430] = 0xFFFFDBD3 ^ 0x2430;
        kotakbaz.rain.client.util.render.font.E.R[0x109BF ^ 0x10884] = 0xFFFEF702 ^ 0x10884;
        kotakbaz.rain.client.util.render.font.E.R[0x106D4 ^ 0x106CD] = 0xFFFEF933 ^ 0x106CD;
        kotakbaz.rain.client.util.render.font.E.R[0x8357 ^ 0x83FB] = 0xFFFF7C27 ^ 0x83FB;
        kotakbaz.rain.client.util.render.font.E.R[0xAF63 ^ 0xAF14] = 0xAF83 ^ 0xAF14;
        kotakbaz.rain.client.util.render.font.E.R[0xE146 ^ 0xE03D] = 0xE024 ^ 0xE03D;
        kotakbaz.rain.client.util.render.font.E.R[0x1D36 ^ 0x1DC2] = 0xFFFFE27F ^ 0x1DC2;
        kotakbaz.rain.client.util.render.font.E.R[0x62C9 ^ 0x634E] = 0xFFFF9CF2 ^ 0x634E;
        kotakbaz.rain.client.util.render.font.E.R[0xE96C ^ 0xE8E4] = 0xFFFF17EE ^ 0xE8E4;
        kotakbaz.rain.client.util.render.font.E.R[0x2129 ^ 0x21F8] = 0x21BD ^ 0x21F8;
        kotakbaz.rain.client.util.render.font.E.R[0xE006 ^ 0xE14B] = 0xFFFF1E90 ^ 0xE14B;
        kotakbaz.rain.client.util.render.font.E.R[0xF38D ^ 0xF2C2] = 0xFFFF0D52 ^ 0xF2C2;
        kotakbaz.rain.client.util.render.font.E.R[0x6ADE ^ 0x6A1C] = 0x6E36 ^ 0x6A1C;
        kotakbaz.rain.client.util.render.font.E.R[0xDF8D ^ 0xDF7F] = 0xFFFF20B1 ^ 0xDF7F;
        kotakbaz.rain.client.util.render.font.E.R[0x4DE8 ^ 0x4CC5] = 0x4C84 ^ 0x4CC5;
        kotakbaz.rain.client.util.render.font.E.R[0x3313 ^ 0x320B] = 0xFFFFCDDE ^ 0x320B;
        kotakbaz.rain.client.util.render.font.E.R[0xECFE ^ 0xED89] = 0xFFFF1202 ^ 0xED89;
        kotakbaz.rain.client.util.render.font.E.R[0xB8EA ^ 0xB9C6] = 0xB996 ^ 0xB9C6;
        kotakbaz.rain.client.util.render.font.E.R[0x9AFC ^ 0x9ABD] = 0xFFFF6520 ^ 0x9ABD;
        kotakbaz.rain.client.util.render.font.E.R[0xC359 ^ 0xC3F6] = 0xC38B ^ 0xC3F6;
        kotakbaz.rain.client.util.render.font.E.R[0x10765 ^ 0x107A5] = 0x107F7 ^ 0x107A5;
        kotakbaz.rain.client.util.render.font.E.R[0xC285 ^ 0xC21E] = 0xC2DD ^ 0xC21E;
        kotakbaz.rain.client.util.render.font.E.R[0xBBA4 ^ 0xBB19] = 0xBB24 ^ 0xBB19;
        kotakbaz.rain.client.util.render.font.E.R[0xA7DC ^ 0xA7C9] = 0xFFFF5815 ^ 0xA7C9;
        kotakbaz.rain.client.util.render.font.E.R[0x266C ^ 0x270A] = 0xFFFFD8EC ^ 0x270A;
        kotakbaz.rain.client.util.render.font.E.R[0xA3DE ^ 0xA3EA] = 0xFFFF5C56 ^ 0xA3EA;
        kotakbaz.rain.client.util.render.font.E.R[0xBD4D ^ 0xBD99] = 0xBDAF ^ 0xBD99;
        kotakbaz.rain.client.util.render.font.E.R[0x6DA1 ^ 0x6C88] = 0xFFFF9315 ^ 0x6C88;
        kotakbaz.rain.client.util.render.font.E.R[0xA195 ^ 0xA1F1] = 0xA1CD ^ 0xA1F1;
        kotakbaz.rain.client.util.render.font.E.R[0xE013 ^ 0xE084] = 0xE08B ^ 0xE084;
        kotakbaz.rain.client.util.render.font.E.R[0x409 ^ 0x415] = 0x46D ^ 0x415;
        kotakbaz.rain.client.util.render.font.E.R[0xBC79 ^ 0xBC00] = 0xFFFF43E3 ^ 0xBC00;
        kotakbaz.rain.client.util.render.font.E.R[0x29B4 ^ 0x28C9] = 0x28F8 ^ 0x28C9;
        kotakbaz.rain.client.util.render.font.E.R[0x546A ^ 0x5526] = 0xFFFFAA8A ^ 0x5526;
        kotakbaz.rain.client.util.render.font.E.R[0xAA20 ^ 0xAAD5] = 0xAABA ^ 0xAAD5;
        kotakbaz.rain.client.util.render.font.E.R[0xC30C ^ 0xC3F3] = 0xC384 ^ 0xC3F3;
        kotakbaz.rain.client.util.render.font.E.R[0x7E2 ^ 0x76C] = 0xFFFFF8AD ^ 0x76C;
        kotakbaz.rain.client.util.render.font.E.R[0x19DA ^ 0x18CA] = 0x18C0 ^ 0x18CA;
        kotakbaz.rain.client.util.render.font.E.R[0x810 ^ 0x82F] = 0xFFFFF717 ^ 0x82F;
        kotakbaz.rain.client.util.render.font.E.R[0x9B64 ^ 0x9A09] = 0xFFFF65CD ^ 0x9A09;
        kotakbaz.rain.client.util.render.font.E.R[0xFC8E ^ 0xFCF2] = 0xFCDD ^ 0xFCF2;
        kotakbaz.rain.client.util.render.font.E.R[0x261 ^ 0x29A] = 0x2D3 ^ 0x29A;
        kotakbaz.rain.client.util.render.font.E.R[0x1188 ^ 0x1152] = 0xFFFFEEF5 ^ 0x1152;
        kotakbaz.rain.client.util.render.font.E.R[0x5787 ^ 0x569B] = 0xFFFFA96B ^ 0x569B;
        kotakbaz.rain.client.util.render.font.E.R[0x2AD0 ^ 0x2B5A] = 0xFFFFD4C9 ^ 0x2B5A;
        kotakbaz.rain.client.util.render.font.E.R[0x6E10 ^ 0x6E30] = 0xFFFF9183 ^ 0x6E30;
        kotakbaz.rain.client.util.render.font.E.R[0x20F5 ^ 0x20F9] = 0xFFFFDF56 ^ 0x20F9;
        kotakbaz.rain.client.util.render.font.E.R[0x6F84 ^ 0x6E04] = 0xFFFF91E5 ^ 0x6E04;
        kotakbaz.rain.client.util.render.font.E.R[0x170A ^ 0x1649] = 0x16B1 ^ 0x1649;
        kotakbaz.rain.client.util.render.font.E.R[0xD490 ^ 0xD5F1] = 0xD586 ^ 0xD5F1;
        kotakbaz.rain.client.util.render.font.E.R[0x5AF2 ^ 0x5BE3] = 0x5BA5 ^ 0x5BE3;
        kotakbaz.rain.client.util.render.font.E.R[0x9214 ^ 0x930D] = 0x9337 ^ 0x930D;
        kotakbaz.rain.client.util.render.font.E.R[0xE624 ^ 0xE6F6] = 0xE6A4 ^ 0xE6F6;
        kotakbaz.rain.client.util.render.font.E.R[0xDCDA ^ 0xDCC1] = 0xDCF4 ^ 0xDCC1;
        kotakbaz.rain.client.util.render.font.E.R[0x919C ^ 0x90EC] = 0x9091 ^ 0x90EC;
        kotakbaz.rain.client.util.render.font.E.R[0x6D99 ^ 0x6CAF] = 0xFFFF934D ^ 0x6CAF;
        kotakbaz.rain.client.util.render.font.E.R[0xF7A2 ^ 0xF689] = 0xF68D ^ 0xF689;
        kotakbaz.rain.client.util.render.font.E.R[0xFDFF ^ 0xFD7C] = 0xFD75 ^ 0xFD7C;
        kotakbaz.rain.client.util.render.font.E.R[0xC9FE ^ 0xC90E] = 0xFFFF36F8 ^ 0xC90E;
        kotakbaz.rain.client.util.render.font.E.R[0x1E6C ^ 0x1ECD] = 0x1E75 ^ 0x1ECD;
        kotakbaz.rain.client.util.render.font.E.R[0x332 ^ 0x302] = 0x330 ^ 0x302;
        kotakbaz.rain.client.util.render.font.E.R[0xF2DF ^ 0xF2E3] = 0xFFFF0D69 ^ 0xF2E3;
        kotakbaz.rain.client.util.render.font.E.R[0x7EE2 ^ 0x7FEC] = 0x7FEB ^ 0x7FEC;
        kotakbaz.rain.client.util.render.font.E.R[0xA91E ^ 0xA975] = 0xFFFF56EF ^ 0xA975;
        kotakbaz.rain.client.util.render.font.E.R[0x6A98 ^ 0x6BDD] = 0x6BA6 ^ 0x6BDD;
        kotakbaz.rain.client.util.render.font.E.R[0x10BAC ^ 0x10B6B] = 0xFFFEF48B ^ 0x10B6B;
        kotakbaz.rain.client.util.render.font.E.R[0x2999 ^ 0x29A8] = 0x29EC ^ 0x29A8;
        kotakbaz.rain.client.util.render.font.E.R[0xC28F ^ 0xC281] = 0xC2A4 ^ 0xC281;
        kotakbaz.rain.client.util.render.font.E.R[0x8DBE ^ 0x8DAC] = 0x8D0E ^ 0x8DAC;
        kotakbaz.rain.client.util.render.font.E.R[0xA3B4 ^ 0xA3EB] = 0xA3C1 ^ 0xA3EB;
        kotakbaz.rain.client.util.render.font.E.R[0xD395 ^ 0xD321] = 0xD32A ^ 0xD321;
        kotakbaz.rain.client.util.render.font.E.R[0xDDCE ^ 0xDD84] = 0xFFFF2212 ^ 0xDD84;
        kotakbaz.rain.client.util.render.font.E.R[0x7897 ^ 0x79CB] = 0x79EA ^ 0x79CB;
        kotakbaz.rain.client.util.render.font.E.R[0x10BCC ^ 0x10B29] = 0xFFFEF4A2 ^ 0x10B29;
        kotakbaz.rain.client.util.render.font.E.R[0xB97C ^ 0xB930] = 0xB934 ^ 0xB930;
        kotakbaz.rain.client.util.render.font.E.R[0x1071 ^ 0x107E] = 0x105F ^ 0x107E;
        kotakbaz.rain.client.util.render.font.E.R[0x9860 ^ 0x994E] = 0xFFFF6606 ^ 0x994E;
        kotakbaz.rain.client.util.render.font.E.R[0xB64F ^ 0xB644] = 0xB643 ^ 0xB644;
        kotakbaz.rain.client.util.render.font.E.R[0xECAD ^ 0xED98] = 0xFFFF120D ^ 0xED98;
        kotakbaz.rain.client.util.render.font.E.R[0x1FDC ^ 0x1F5A] = 0x1F34 ^ 0x1F5A;
        kotakbaz.rain.client.util.render.font.E.R[0x16F ^ 0x15C] = 0xFFFFFE81 ^ 0x15C;
        kotakbaz.rain.client.util.render.font.E.R[0x7D9A ^ 0x7D8D] = 0xFFFF823A ^ 0x7D8D;
        kotakbaz.rain.client.util.render.font.E.R[0x5B16 ^ 0x5B6B] = 0x5B0F ^ 0x5B6B;
        kotakbaz.rain.client.util.render.font.E.R[0x5810 ^ 0x58D3] = 0xFFFFA75F ^ 0x58D3;
        kotakbaz.rain.client.util.render.font.E.R[0xD35A ^ 0xD3E5] = 0xFFFF2DC6 ^ 0xD3E5;
        kotakbaz.rain.client.util.render.font.E.R[0xFF52 ^ 0xFF6B] = 0xFFFF00B4 ^ 0xFF6B;
        kotakbaz.rain.client.util.render.font.E.R[0x634A ^ 0x62C7] = 0xFFFF9D44 ^ 0x62C7;
        kotakbaz.rain.client.util.render.font.E.R[0x105B2 ^ 0x105B5] = 0xFFFEFA1C ^ 0x105B5;
        kotakbaz.rain.client.util.render.font.E.R[0xA977 ^ 0xA933] = 0xFFFF56F1 ^ 0xA933;
        kotakbaz.rain.client.util.render.font.E.R[0xD5C0 ^ 0xD4E4] = 0xD4EA ^ 0xD4E4;
        kotakbaz.rain.client.util.render.font.E.R[0xE657 ^ 0xE75A] = 0xE718 ^ 0xE75A;
        kotakbaz.rain.client.util.render.font.E.R[0xE632 ^ 0xE748] = 0xE768 ^ 0xE748;
        kotakbaz.rain.client.util.render.font.E.R[0x988E ^ 0x98A7] = 0x98E0 ^ 0x98A7;
        kotakbaz.rain.client.util.render.font.E.R[0x107F7 ^ 0x10763] = 0xFFFEF8F3 ^ 0x10763;
        kotakbaz.rain.client.util.render.font.E.R[0x418 ^ 0x545] = 0x526 ^ 0x545;
        kotakbaz.rain.client.util.render.font.E.R[0xC659 ^ 0xC684] = 0xC688 ^ 0xC684;
        kotakbaz.rain.client.util.render.font.E.R[0x974C ^ 0x9605] = 0x965A ^ 0x9605;
        kotakbaz.rain.client.util.render.font.E.R[0xF5E3 ^ 0xF5EE] = 0xFFFF0A71 ^ 0xF5EE;
        kotakbaz.rain.client.util.render.font.E.R[0xC698 ^ 0xC689] = 0xC6D3 ^ 0xC689;
        kotakbaz.rain.client.util.render.font.E.R[0x2D85 ^ 0x2CA2] = 0x2C9D ^ 0x2CA2;
        kotakbaz.rain.client.util.render.font.E.R[0x2FD0 ^ 0x2E9B] = 0xFFFFD15B ^ 0x2E9B;
        kotakbaz.rain.client.util.render.font.E.R[0xC925 ^ 0xC9B0] = 0xC983 ^ 0xC9B0;
        kotakbaz.rain.client.util.render.font.E.R[0x3D37 ^ 0x3D8C] = 0x3DB3 ^ 0x3D8C;
        kotakbaz.rain.client.util.render.font.E.R[0x8C73 ^ 0x8CCD] = 0xFFFF731D ^ 0x8CCD;
        kotakbaz.rain.client.util.render.font.E.R[0x8245 ^ 0x8270] = 0xFFFF7DD9 ^ 0x8270;
        kotakbaz.rain.client.util.render.font.E.R[0xC059 ^ 0xC0C6] = 0xFFFF3F7D ^ 0xC0C6;
        kotakbaz.rain.client.util.render.font.E.R[0x6639 ^ 0x66E0] = 0x668D ^ 0x66E0;
        kotakbaz.rain.client.util.render.font.E.R[0x997A ^ 0x99CA] = 0x99D7 ^ 0x99CA;
        kotakbaz.rain.client.util.render.font.E.R[0x75D3 ^ 0x75D3] = 0x7559 ^ 0x75D3;
        kotakbaz.rain.client.util.render.font.E.R[0x34DB ^ 0x35FA] = 0x35B2 ^ 0x35FA;
        kotakbaz.rain.client.util.render.font.E.R[0xE25F ^ 0xE35D] = 0xE315 ^ 0xE35D;
        kotakbaz.rain.client.util.render.font.E.R[0xE5C5 ^ 0xE50D] = 0xFFFF12E0 ^ 0xE50D;
        kotakbaz.rain.client.util.render.font.E.R[0x3C38 ^ 0x3D69] = 0xFFFFC2AC ^ 0x3D69;
        kotakbaz.rain.client.util.render.font.E.R[0xF2D0 ^ 0xF206] = 0xF25A ^ 0xF206;
        kotakbaz.rain.client.util.render.font.E.R[0xD0EF ^ 0xD088] = 0xD0C2 ^ 0xD088;
    }
}

