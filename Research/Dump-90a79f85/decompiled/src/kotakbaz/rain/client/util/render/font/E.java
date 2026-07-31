/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2561
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
import kotakbaz.rain.client.render.main.vertex.format.a_0;
import kotakbaz.rain.client.util.other.D;
import kotakbaz.rain.client.util.render.engine.controls.ClientRenderPipeline;
import kotakbaz.rain.client.util.render.font.A;
import kotakbaz.rain.client.util.render.font.F;
import kotakbaz.rain.client.util.render.font.b_0;
import kotakbaz.rain.client.util.render.font.e;
import kotakbaz.rain.client.util.render.font.e_0;
import kotakbaz.rain.client.util.render.font.f;
import kotakbaz.rain.client.util.render.font.f_0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import net.minecraft.class_2561;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u001c\u0018\u0000 \u0097\u00012\u00020\u0001:\u0002\u0097\u0001B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\n\u0012\u001e\u0010\u000e\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r0\n0\n\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0016\u001a\n \u0015*\u0004\u0018\u00010\u00140\u0014H\u0016\u00a2\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016\u00a2\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b\u00a2\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u001f\u00a2\u0006\u0004\b \u0010!J\u0015\u0010#\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\"\u00a2\u0006\u0004\b#\u0010$J\u0015\u0010%\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\"\u00a2\u0006\u0004\b%\u0010$J\u001d\u0010'\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\r2\u0006\u0010#\u001a\u00020\"\u00a2\u0006\u0004\b'\u0010(J\u0015\u0010'\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\r\u00a2\u0006\u0004\b'\u0010)J\u0015\u0010*\u001a\u00020\u00002\u0006\u0010*\u001a\u00020\r\u00a2\u0006\u0004\b*\u0010)J\u0015\u0010,\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\r\u00a2\u0006\u0004\b,\u0010)J\u0015\u0010-\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\r\u00a2\u0006\u0004\b-\u0010)J\u0015\u0010.\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\r\u00a2\u0006\u0004\b.\u0010)J\u000f\u00100\u001a\u00020/H\u0016\u00a2\u0006\u0004\b0\u00101J#\u00106\u001a\u00020/2\b\u00103\u001a\u0004\u0018\u0001022\b\u00105\u001a\u0004\u0018\u000104H\u0016\u00a2\u0006\u0004\b6\u00107J-\u0010<\u001a\u00020\u00002\u0006\u00108\u001a\u00020\r2\u0006\u00109\u001a\u00020\r2\u0006\u0010:\u001a\u00020\r2\u0006\u0010;\u001a\u00020\r\u00a2\u0006\u0004\b<\u0010=J\r\u0010>\u001a\u00020\u0000\u00a2\u0006\u0004\b>\u0010?J%\u0010C\u001a\u00020/2\u0006\u0010@\u001a\u00020\u00022\u0006\u0010A\u001a\u00020\r2\u0006\u0010B\u001a\u00020\r\u00a2\u0006\u0004\bC\u0010DJ%\u0010C\u001a\u00020/2\u0006\u0010@\u001a\u00020E2\u0006\u0010A\u001a\u00020\r2\u0006\u0010B\u001a\u00020\r\u00a2\u0006\u0004\bC\u0010FJ%\u0010G\u001a\u00020/2\u0006\u0010@\u001a\u00020\u00022\u0006\u0010A\u001a\u00020\r2\u0006\u0010B\u001a\u00020\r\u00a2\u0006\u0004\bG\u0010DJ%\u0010G\u001a\u00020/2\u0006\u0010@\u001a\u00020E2\u0006\u0010A\u001a\u00020\r2\u0006\u0010B\u001a\u00020\r\u00a2\u0006\u0004\bG\u0010FJ?\u0010C\u001a\u00020/2\u0006\u0010@\u001a\u00020E2\u0006\u0010A\u001a\u00020\r2\u0006\u0010B\u001a\u00020\r2\u0006\u0010*\u001a\u00020\r2\u0006\u0010#\u001a\u00020\"2\b\b\u0002\u0010'\u001a\u00020\r\u00a2\u0006\u0004\bC\u0010HJg\u0010C\u001a\u00020/2\u0006\u0010@\u001a\u00020\u00022\u0006\u0010A\u001a\u00020\r2\u0006\u0010B\u001a\u00020\r2\u0006\u0010*\u001a\u00020\r2\u0006\u0010#\u001a\u00020\"2\b\b\u0002\u0010'\u001a\u00020\r2\b\b\u0002\u0010,\u001a\u00020\r2\b\b\u0002\u0010-\u001a\u00020\r2\b\b\u0002\u0010J\u001a\u00020I2\b\b\u0002\u0010K\u001a\u00020\r\u00a2\u0006\u0004\bC\u0010LJw\u0010P\u001a\u00020/2\u0006\u0010@\u001a\u00020\u00022\u0006\u0010A\u001a\u00020\r2\u0006\u0010B\u001a\u00020\r2\u0006\u0010*\u001a\u00020\r2\u0006\u0010M\u001a\u00020\"2\u0006\u0010N\u001a\u00020\"2\u0006\u0010O\u001a\u00020\r2\b\b\u0002\u0010'\u001a\u00020\r2\b\b\u0002\u0010,\u001a\u00020\r2\b\b\u0002\u0010-\u001a\u00020\r2\b\b\u0002\u0010J\u001a\u00020I2\b\b\u0002\u0010K\u001a\u00020\r\u00a2\u0006\u0004\bP\u0010QJ_\u0010R\u001a\u00020/2\u0006\u0010@\u001a\u00020\u00022\u0006\u0010A\u001a\u00020\r2\u0006\u0010B\u001a\u00020\r2\u0006\u0010*\u001a\u00020\r2\u0006\u0010#\u001a\u00020I2\u0006\u0010'\u001a\u00020\r2\u0006\u0010,\u001a\u00020\r2\u0006\u0010-\u001a\u00020\r2\u0006\u0010J\u001a\u00020I2\u0006\u0010K\u001a\u00020\rH\u0002\u00a2\u0006\u0004\bR\u0010SJ]\u0010W\u001a\u00020/2\f\u0010V\u001a\b\u0012\u0004\u0012\u00020U0T2\u0006\u0010A\u001a\u00020\r2\u0006\u0010B\u001a\u00020\r2\u0006\u0010*\u001a\u00020\r2\u0006\u0010'\u001a\u00020\r2\u0006\u0010,\u001a\u00020\r2\u0006\u0010-\u001a\u00020\r2\u0006\u0010J\u001a\u00020I2\u0006\u0010K\u001a\u00020\rH\u0002\u00a2\u0006\u0004\bW\u0010XJo\u0010Y\u001a\u00020/2\u0006\u0010@\u001a\u00020\u00022\u0006\u0010A\u001a\u00020\r2\u0006\u0010B\u001a\u00020\r2\u0006\u0010*\u001a\u00020\r2\u0006\u0010M\u001a\u00020I2\u0006\u0010N\u001a\u00020I2\u0006\u0010O\u001a\u00020\r2\u0006\u0010'\u001a\u00020\r2\u0006\u0010,\u001a\u00020\r2\u0006\u0010-\u001a\u00020\r2\u0006\u0010J\u001a\u00020I2\u0006\u0010K\u001a\u00020\rH\u0002\u00a2\u0006\u0004\bY\u0010ZJw\u0010a\u001a\u00020/2\u0006\u0010\\\u001a\u00020[2\u0006\u0010@\u001a\u00020\u00022\u0006\u0010*\u001a\u00020\r2\u0006\u0010]\u001a\u00020\r2\u0006\u0010-\u001a\u00020\r2\u0006\u0010^\u001a\u00020\r2\u0006\u0010_\u001a\u00020\r2\u0006\u0010`\u001a\u00020\r2\u0006\u0010#\u001a\u00020I2\u0006\u0010'\u001a\u00020\r2\u0006\u0010,\u001a\u00020\r2\u0006\u0010K\u001a\u00020\r2\u0006\u0010J\u001a\u00020IH\u0002\u00a2\u0006\u0004\ba\u0010bJ'\u0010c\u001a\u00020\r2\u0006\u0010@\u001a\u00020E2\u0006\u0010*\u001a\u00020\r2\b\b\u0002\u0010'\u001a\u00020\r\u00a2\u0006\u0004\bc\u0010dJ-\u0010c\u001a\u00020\r2\f\u0010@\u001a\b\u0012\u0004\u0012\u00020U0T2\u0006\u0010*\u001a\u00020\r2\b\b\u0002\u0010'\u001a\u00020\r\u00a2\u0006\u0004\bc\u0010eJ'\u0010c\u001a\u00020\r2\u0006\u0010@\u001a\u00020\u00022\u0006\u0010*\u001a\u00020\r2\b\b\u0002\u0010'\u001a\u00020\r\u00a2\u0006\u0004\bc\u0010fJ\u0015\u0010g\u001a\u00020\r2\u0006\u0010*\u001a\u00020\r\u00a2\u0006\u0004\bg\u0010hJ?\u0010i\u001a\u00020/2\u0006\u0010@\u001a\u00020\u00022\u0006\u0010A\u001a\u00020\r2\u0006\u0010B\u001a\u00020\r2\u0006\u0010*\u001a\u00020\r2\u0006\u0010#\u001a\u00020\"2\b\b\u0002\u0010'\u001a\u00020\r\u00a2\u0006\u0004\bi\u0010jJO\u0010k\u001a\u00020/2\u0006\u0010@\u001a\u00020\u00022\u0006\u0010A\u001a\u00020\r2\u0006\u0010B\u001a\u00020\r2\u0006\u0010*\u001a\u00020\r2\u0006\u0010M\u001a\u00020\"2\u0006\u0010N\u001a\u00020\"2\u0006\u0010O\u001a\u00020\r2\b\b\u0002\u0010'\u001a\u00020\r\u00a2\u0006\u0004\bk\u0010lJ'\u0010p\u001a\u00020I2\u0006\u0010m\u001a\u00020I2\u0006\u0010n\u001a\u00020I2\u0006\u0010o\u001a\u00020\rH\u0002\u00a2\u0006\u0004\bp\u0010qJ\r\u0010r\u001a\u00020\u0002\u00a2\u0006\u0004\br\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0003\u0010sR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0005\u0010tR\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\f\n\u0004\b\u0007\u0010u\u001a\u0004\bv\u0010wR\u0017\u0010\t\u001a\u00020\b8\u0006\u00a2\u0006\f\n\u0004\b\t\u0010x\u001a\u0004\by\u0010zR \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\f\u0010{R,\u0010\u000e\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r0\n0\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u000e\u0010{R\u0016\u0010}\u001a\u00020|8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\b}\u0010~R\u0016\u0010\u007f\u001a\u00020|8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\b\u007f\u0010~R\u0018\u0010\u0080\u0001\u001a\u00020|8\u0002@\u0002X\u0082.\u00a2\u0006\u0007\n\u0005\b\u0080\u0001\u0010~R\u0018\u0010\u0081\u0001\u001a\u00020|8\u0002@\u0002X\u0082.\u00a2\u0006\u0007\n\u0005\b\u0081\u0001\u0010~R\u0018\u0010\u0082\u0001\u001a\u00020|8\u0002@\u0002X\u0082.\u00a2\u0006\u0007\n\u0005\b\u0082\u0001\u0010~R\u0018\u0010\u0083\u0001\u001a\u00020|8\u0002@\u0002X\u0082.\u00a2\u0006\u0007\n\u0005\b\u0083\u0001\u0010~R\u0019\u0010\u0084\u0001\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0019\u0010\u0086\u0001\u001a\u00020\r8\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R\u0019\u0010\u0088\u0001\u001a\u00020\r8\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u0088\u0001\u0010\u0087\u0001R\u0019\u0010\u0089\u0001\u001a\u00020\r8\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u0089\u0001\u0010\u0087\u0001R\u0019\u0010\u008a\u0001\u001a\u00020\r8\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u008a\u0001\u0010\u0087\u0001R\u0019\u0010\u008b\u0001\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0019\u0010\u008d\u0001\u001a\u00020I8\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001R\u0019\u0010\u008f\u0001\u001a\u00020I8\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u008f\u0001\u0010\u008e\u0001R\u0019\u0010\u0090\u0001\u001a\u00020\r8\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u0090\u0001\u0010\u0087\u0001R\u0019\u0010\u0091\u0001\u001a\u00020\r8\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u0091\u0001\u0010\u0087\u0001R\u0019\u0010\u0092\u0001\u001a\u00020\r8\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u0092\u0001\u0010\u0087\u0001R\u0019\u0010\u0093\u0001\u001a\u00020\r8\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u0093\u0001\u0010\u0087\u0001R\u0019\u0010\u0094\u0001\u001a\u00020\r8\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u0094\u0001\u0010\u0087\u0001R\u0019\u0010\u0095\u0001\u001a\u00020I8\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u0095\u0001\u0010\u008e\u0001R\u0019\u0010\u0096\u0001\u001a\u00020\r8\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u0096\u0001\u0010\u0087\u0001\u00a8\u0006\u0098\u0001"}, d2={"Lkotakbaz/rain/client/util/render/font/Font;", "Lkotakbaz/rain/client/util/render/engine/Renderable;", "", "fontName", "Lkotakbaz/rain/client/render/texture/GlTex;", "texture", "Lkotakbaz/rain/client/util/render/font/FontData$AtlasData;", "atlas", "Lkotakbaz/rain/client/util/render/font/FontData$MetricsData;", "metrics", "", "Lkotakbaz/rain/client/util/render/font/MsdfGlyph;", "glyphs", "", "kernings", "<init>", "(Ljava/lang/String;Lkotakbaz/rain/client/render/texture/GlTex;Lkotakbaz/rain/client/util/render/font/FontData$AtlasData;Lkotakbaz/rain/client/util/render/font/FontData$MetricsData;Ljava/util/Map;Ljava/util/Map;)V", "name", "()Ljava/lang/String;", "shader", "Lkotakbaz/rain/client/render/main/vertex/DrawMode;", "kotlin.jvm.PlatformType", "drawMode", "()Lkotakbaz/rain/client/render/main/vertex/DrawMode;", "Lkotakbaz/rain/client/render/main/vertex/format/VertexFormat;", "vertexFormat", "()Lkotakbaz/rain/client/render/main/vertex/format/VertexFormat;", "Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;", "pipeline", "priority", "(Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;)Lkotakbaz/rain/client/util/render/font/Font;", "", "centered", "(Z)Lkotakbaz/rain/client/util/render/font/Font;", "Ljava/awt/Color;", "color", "(Ljava/awt/Color;)Lkotakbaz/rain/client/util/render/font/Font;", "gradientColor", "width", "thickness", "(FLjava/awt/Color;)Lkotakbaz/rain/client/util/render/font/Font;", "(F)Lkotakbaz/rain/client/util/render/font/Font;", "size", "value", "smoothness", "spacing", "gradientOffset", "", "load", "()V", "Lkotakbaz/rain/client/render/main/vertex/mesh/IMesh;", "mesh", "", "state", "renderBatch", "(Lkotakbaz/rain/client/render/main/vertex/mesh/IMesh;Ljava/lang/Object;)V", "minX", "maxX", "leftWidth", "rightWidth", "setFade", "(FFFF)Lkotakbaz/rain/client/util/render/font/Font;", "resetFade", "()Lkotakbaz/rain/client/util/render/font/Font;", "text", "x", "y", "drawText", "(Ljava/lang/String;FF)V", "Lnet/minecraft/class_2561;", "(Lnet/minecraft/class_2561;FF)V", "drawGradient", "(Lnet/minecraft/class_2561;FFFLjava/awt/Color;F)V", "", "outlineColor", "outlineThickness", "(Ljava/lang/String;FFFLjava/awt/Color;FFFIF)V", "first", "second", "offset", "drawGradientText", "(Ljava/lang/String;FFFLjava/awt/Color;Ljava/awt/Color;FFFFIF)V", "drawRawString", "(Ljava/lang/String;FFFIFFFIF)V", "", "Lkotakbaz/rain/client/util/render/font/MsdfGlyph$ColoredGlyph;", "glyphsData", "drawColoredGlyphs", "(Ljava/util/List;FFFFFFIF)V", "drawGradientRaw", "(Ljava/lang/String;FFFIIFFFFIF)V", "Lkotakbaz/rain/client/render/main/vertex/mesh/MeshBuilder;", "builder", "thicknessPadding", "startX", "startY", "z", "applyGlyphs", "(Lkotakbaz/rain/client/render/main/vertex/mesh/MeshBuilder;Ljava/lang/String;FFFFFFIFFFI)V", "getWidth", "(Lnet/minecraft/class_2561;FF)F", "(Ljava/util/List;FF)F", "(Ljava/lang/String;FF)F", "getHeight", "(F)F", "drawCenteredText", "(Ljava/lang/String;FFFLjava/awt/Color;F)V", "drawCenteredGradientText", "(Ljava/lang/String;FFFLjava/awt/Color;Ljava/awt/Color;FF)V", "a", "b", "t", "lerpArgb", "(IIF)I", "id", "Ljava/lang/String;", "Lkotakbaz/rain/client/render/texture/GlTex;", "Lkotakbaz/rain/client/util/render/font/FontData$AtlasData;", "getAtlas", "()Lkotakbaz/rain/client/util/render/font/FontData$AtlasData;", "Lkotakbaz/rain/client/util/render/font/FontData$MetricsData;", "getMetrics", "()Lkotakbaz/rain/client/util/render/font/FontData$MetricsData;", "Ljava/util/Map;", "Lkotakbaz/rain/client/render/main/vertex/element/VertexElement;", "eTexture", "Lkotakbaz/rain/client/render/main/vertex/element/VertexElement;", "eColor", "eStyle", "eOutlineColor", "eFade", "eScissor", "currentPipeline", "Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;", "fadeMinX", "F", "fadeMaxX", "fadeLeftWidth", "fadeRightWidth", "stateCentered", "Z", "stateColorArgb", "I", "stateGradientArgb", "stateSize", "stateThickness", "stateSmoothness", "stateSpacing", "stateOutlineThickness", "stateOutlineColorArgb", "stateGradientOffset", "Companion", "rain-visuals"})
@SourceDebugExtension(value={"SMAP\nFont.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Font.kt\nkotakbaz/rain/client/util/render/font/Font\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,595:1\n1#2:596\n*E\n"})
public final class E
extends kotakbaz.rain.client.util.render.engine.a_0 {
    @NotNull
    public static final A h;
    @NotNull
    private final String a;
    @NotNull
    private final kotakbaz.rain.client.render.texture.A A;
    @NotNull
    private final F b;
    @NotNull
    private final b_0 B;
    @NotNull
    private final Map<String, e_0> c;
    @NotNull
    private final Map<String, Map<String, Float>> C;
    private kotakbaz.rain.client.render.main.vertex.element.a_0 d;
    private kotakbaz.rain.client.render.main.vertex.element.a_0 D;
    private kotakbaz.rain.client.render.main.vertex.element.a_0 e;
    private kotakbaz.rain.client.render.main.vertex.element.a_0 E;
    private kotakbaz.rain.client.render.main.vertex.element.a_0 f;
    private kotakbaz.rain.client.render.main.vertex.element.a_0 F;
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
    private static kotakbaz.rain.client.render.main.program.A o;
    private static final a_0 O;
    private static Object[] p;
    private static Object q;
    private static Object[] Q;
    private static Object[] P;
    private static Object[] r;
    public static int[] R;

    public E(@NotNull String string, @NotNull kotakbaz.rain.client.render.texture.A a2, @NotNull F f2, @NotNull b_0 b_02, @NotNull Map<String, e_0> map, @NotNull Map<String, ? extends Map<String, Float>> map2) {
        int n = R[0];
        n += R[1];
        Intrinsics.checkNotNullParameter(string, (String)p[n += R[2]]);
        int n2 = R[3];
        n2 += R[4];
        Intrinsics.checkNotNullParameter(a2, (String)p[n2 ^= R[5]]);
        int n3 = R[6];
        n3 -= R[7];
        Intrinsics.checkNotNullParameter(f2, (String)p[n3 -= R[8]]);
        int n4 = R[9];
        n4 += R[10];
        Intrinsics.checkNotNullParameter(b_02, (String)p[n4 ^= R[11]]);
        int n5 = R[12];
        n5 -= R[13];
        Intrinsics.checkNotNullParameter(map, (String)p[n5 += R[14]]);
        int n6 = R[15];
        n6 += R[16];
        Intrinsics.checkNotNullParameter(map2, (String)p[n6 -= R[17]]);
        super();
        this.a = string;
        this.A = a2;
        this.b = f2;
        this.B = b_02;
        this.c = map;
        this.C = map2;
        this.g = ClientRenderPipeline.LOW;
        this.G = -1000000.0f;
        this.h = 1000000.0f;
        this.j = Color.WHITE.getRGB();
        this.J = Color.WHITE.getRGB();
        this.k = 1.0f;
        this.l = 0.5f;
        int n7 = R[18];
        n7 += R[19];
        this.M = n7 += R[20];
    }

    @NotNull
    public final F getAtlas() {
        return this.b;
    }

    @NotNull
    public final b_0 getMetrics() {
        return this.B;
    }

    @Override
    @NotNull
    public String name() {
        int n = R[21];
        n += R[22];
        return (String)p[n ^= R[23]];
    }

    @Override
    @NotNull
    public String shader() {
        int n = R[24];
        n ^= R[25];
        return (String)p[n ^= R[26]];
    }

    @Override
    public kotakbaz.rain.client.render.main.vertex.A drawMode() {
        return kotakbaz.rain.client.render.main.vertex.A.E;
    }

    @Override
    @NotNull
    public a_0 vertexFormat() {
        a_0 a_02 = O;
        int n = R[27];
        n -= R[28];
        Intrinsics.checkNotNullExpressionValue(a_02, (String)p[n += R[29]]);
        return a_02;
    }

    @NotNull
    public final E priority(@NotNull ClientRenderPipeline clientRenderPipeline) {
        int n = R[30];
        n -= R[31];
        Intrinsics.checkNotNullParameter((Object)clientRenderPipeline, (String)p[n ^= R[32]]);
        this.g = clientRenderPipeline;
        return this;
    }

    @NotNull
    public final E centered(boolean bl) {
        this.I = bl;
        return this;
    }

    @NotNull
    public final E color(@NotNull Color color) {
        int n = R[33];
        n ^= R[34];
        Intrinsics.checkNotNullParameter(color, (String)p[n += R[35]]);
        this.j = color.getRGB();
        return this;
    }

    @NotNull
    public final E gradientColor(@NotNull Color color) {
        int n = R[36];
        n += R[37];
        Intrinsics.checkNotNullParameter(color, (String)p[n -= R[38]]);
        this.J = color.getRGB();
        return this;
    }

    @NotNull
    public final E thickness(float f2, @NotNull Color color) {
        int n = R[39];
        n ^= R[40];
        Intrinsics.checkNotNullParameter(color, (String)p[n -= R[41]]);
        this.K = f2;
        this.m = f2;
        this.M = color.getRGB();
        return this;
    }

    @NotNull
    public final E thickness(float f2) {
        this.K = f2;
        this.m = f2;
        return this;
    }

    @NotNull
    public final E size(float f2) {
        this.k = f2;
        return this;
    }

    @NotNull
    public final E smoothness(float f2) {
        this.l = f2;
        return this;
    }

    @NotNull
    public final E spacing(float f2) {
        this.L = f2;
        return this;
    }

    @NotNull
    public final E gradientOffset(float f2) {
        this.n = f2;
        return this;
    }

    @Override
    public void load() {
        if (o == null) {
            int n = R[42];
            n ^= R[43];
            int n2 = R[45];
            n2 += R[46];
            o = this.createShaderBuilder(this.name(), this.shader(), this.shader()).uniform((String)p[n -= R[44]], kotakbaz.rain.client.render.main.program.uniform.a_0.B).sampler((String)p[n2 += R[47]]).build();
        }
        this.setGlProgram(o);
        a_0 a_02 = O;
        int n = R[48];
        n += R[49];
        kotakbaz.rain.client.render.main.vertex.element.a_0 a_03 = a_02.getVertexElement((String)p[n += R[50]]);
        int n3 = R[51];
        n3 += R[52];
        int n4 = R[54];
        n4 -= R[55];
        Intrinsics.checkNotNullExpressionValue(a_03, (String)p[n3 ^= R[53]] + (String)p[n4 -= R[56]]);
        this.d = a_03;
        int n5 = R[57];
        n5 ^= R[58];
        kotakbaz.rain.client.render.main.vertex.element.a_0 a_04 = a_02.getVertexElement((String)p[n5 -= R[59]]);
        int n6 = R[60];
        n6 ^= R[61];
        int n7 = R[63];
        n7 -= R[64];
        Intrinsics.checkNotNullExpressionValue(a_04, (String)p[n6 -= R[62]] + (String)p[n7 ^= R[65]]);
        this.D = a_04;
        int n8 = R[66];
        n8 ^= R[67];
        kotakbaz.rain.client.render.main.vertex.element.a_0 a_05 = a_02.getVertexElement((String)p[n8 ^= R[68]]);
        int n9 = R[69];
        n9 ^= R[70];
        int n10 = R[72];
        n10 += R[73];
        Intrinsics.checkNotNullExpressionValue(a_05, (String)p[n9 -= R[71]] + (String)p[n10 -= R[74]]);
        this.e = a_05;
        int n11 = R[75];
        n11 += R[76];
        kotakbaz.rain.client.render.main.vertex.element.a_0 a_06 = a_02.getVertexElement((String)p[n11 += R[77]]);
        int n12 = R[78];
        n12 ^= R[79];
        int n13 = R[81];
        n13 ^= R[82];
        Intrinsics.checkNotNullExpressionValue(a_06, (String)p[n12 -= R[80]] + (String)p[n13 -= R[83]]);
        this.E = a_06;
        int n14 = R[84];
        n14 -= R[85];
        kotakbaz.rain.client.render.main.vertex.element.a_0 a_07 = a_02.getVertexElement((String)p[n14 += R[86]]);
        int n15 = R[87];
        n15 ^= R[88];
        int n16 = R[90];
        n16 -= R[91];
        Intrinsics.checkNotNullExpressionValue(a_07, (String)p[n15 -= R[89]] + (String)p[n16 += R[92]]);
        this.f = a_07;
        int n17 = R[93];
        n17 ^= R[94];
        kotakbaz.rain.client.render.main.vertex.element.a_0 a_08 = a_02.getVertexElement((String)p[n17 += R[95]]);
        int n18 = R[96];
        int n19 = R[98];
        n19 ^= R[99];
        Intrinsics.checkNotNullExpressionValue(a_08, (String)p[n18 += R[97]] + (String)p[n19 -= R[100]]);
        this.F = a_08;
    }

    @Override
    public void renderBatch(@Nullable kotakbaz.rain.client.render.main.vertex.mesh.b_0 b_02, @Nullable Object object) {
        kotakbaz.rain.client.render.main.program.A a2 = this.getGlProgram();
        if (a2 == null) {
            return;
        }
        kotakbaz.rain.client.render.main.program.A a3 = a2;
        int n = R[101];
        n -= R[102];
        a3.getUniform((String)p[n -= R[103]], kotakbaz.rain.client.render.main.program.uniform.a_0.B).set(Float.valueOf(this.b.getRange()));
        int n2 = R[104];
        n2 += R[105];
        a3.getUniform((String)p[n2 -= R[106]], kotakbaz.rain.client.render.main.program.uniform.a_0.h).set(this.A);
        ChromaRenderer.setGlobalProgram(a3);
        ChromaRenderer.initMatrix();
        ChromaRenderer.draw(b_02);
    }

    @NotNull
    public final E setFade(float f2, float f3, float f4, float f5) {
        this.G = f2;
        this.h = f3;
        this.H = f4;
        this.i = f5;
        return this;
    }

    @NotNull
    public final E resetFade() {
        return this.setFade(-1000000.0f, 1000000.0f, 0.0f, 0.0f);
    }

    public final void drawText(@NotNull String string, float f2, float f3) {
        int n;
        int n2 = R[107];
        n2 ^= R[108];
        Intrinsics.checkNotNullParameter(string, (String)p[n2 += R[109]]);
        String string2 = kotakbaz.rain.client.util.other.D.INSTANCE.replaceSymbols(string);
        if (((CharSequence)string2).length() == 0) {
            int n3 = R[110];
            n3 ^= R[111];
            n = n3 += R[112];
        } else {
            int n4 = R[113];
            n4 += R[114];
            n = n4 -= R[115];
        }
        if (n != 0) {
            return;
        }
        float f4 = this.I ? f2 - this.getWidth(string2, this.k, this.K) * 0.5f : f2;
        this.drawRawString(string2, f4, f3, this.k, this.j, this.K, this.l, this.L, this.M, this.m);
    }

    public final void drawText(@NotNull class_2561 class_25612, float f2, float f3) {
        int n = R[116];
        n -= R[117];
        Intrinsics.checkNotNullParameter(class_25612, (String)p[n -= R[118]]);
        List<f_0> list = kotakbaz.rain.client.util.other.A.INSTANCE.parseTextToColoredGlyphs(kotakbaz.rain.client.util.other.D.INSTANCE.replaceSymbols(class_25612));
        if (list.isEmpty()) {
            return;
        }
        float f4 = this.I ? f2 - this.getWidth(list, this.k, this.K) * 0.5f : f2;
        this.drawColoredGlyphs(list, f4, f3, this.k, this.K, this.l, this.L, this.M, this.m);
    }

    public final void drawGradient(@NotNull String string, float f2, float f3) {
        int n;
        int n2 = R[119];
        n2 -= R[120];
        Intrinsics.checkNotNullParameter(string, (String)p[n2 += R[121]]);
        String string2 = kotakbaz.rain.client.util.other.D.INSTANCE.replaceSymbols(string);
        if (((CharSequence)string2).length() == 0) {
            int n3 = R[122];
            n3 -= R[123];
            n = n3 -= R[124];
        } else {
            int n4 = R[125];
            n4 -= R[126];
            n = n4 -= R[127];
        }
        if (n != 0) {
            return;
        }
        float f4 = this.I ? f2 - this.getWidth(string2, this.k, this.K) * 0.5f : f2;
        this.drawGradientRaw(string2, f4, f3, this.k, this.j, this.J, this.n, this.K, this.l, this.L, this.M, this.m);
    }

    public final void drawGradient(@NotNull class_2561 class_25612, float f2, float f3) {
        int n = R[128];
        n += R[129];
        Intrinsics.checkNotNullParameter(class_25612, (String)p[n += R[130]]);
        String string = class_25612.getString();
        int n2 = R[131];
        n2 -= R[132];
        Intrinsics.checkNotNullExpressionValue(string, (String)p[n2 ^= R[133]]);
        this.drawGradient(string, f2, f3);
    }

    public final void drawText(@NotNull class_2561 class_25612, float f2, float f3, float f4, @NotNull Color color, float f5) {
        int n = R[134];
        n ^= R[135];
        Intrinsics.checkNotNullParameter(class_25612, (String)p[n -= R[136]]);
        int n2 = R[137];
        n2 -= R[138];
        Intrinsics.checkNotNullParameter(color, (String)p[n2 -= R[139]]);
        boolean bl = R[140];
        bl -= R[141];
        this.centered(bl ^= R[142]).size(f4).color(color).thickness(f5).drawText(class_25612, f2, f3);
    }

    public static /* synthetic */ void drawText$default(E e2, class_2561 class_25612, float f2, float f3, float f4, Color color, float f5, int n, Object object) {
        int n2 = R[143];
        n2 += R[144];
        if ((n & (n2 -= R[145])) != 0) {
            f5 = 0.0f;
        }
        e2.drawText(class_25612, f2, f3, f4, color, f5);
    }

    public final void drawText(@NotNull String string, float f2, float f3, float f4, @NotNull Color color, float f5, float f6, float f7, int n, float f8) {
        int n2 = R[146];
        n2 ^= R[147];
        Intrinsics.checkNotNullParameter(string, (String)p[n2 -= R[148]]);
        int n3 = R[149];
        n3 += R[150];
        Intrinsics.checkNotNullParameter(color, (String)p[n3 -= R[151]]);
        boolean bl = R[152];
        bl ^= R[153];
        this.centered(bl ^= R[154]).size(f4).color(color).smoothness(f6).spacing(f7).thickness(f5);
        this.M = n;
        this.m = f8;
        this.drawText(string, f2, f3);
    }

    public static /* synthetic */ void drawText$default(E e2, String string, float f2, float f3, float f4, Color color, float f5, float f6, float f7, int n, float f8, int n2, Object object) {
        int n3 = R[155];
        n3 += R[156];
        if ((n2 & (n3 -= R[157])) != 0) {
            f5 = 0.0f;
        }
        int n4 = R[158];
        n4 -= R[159];
        if ((n2 & (n4 -= R[160])) != 0) {
            f6 = 0.7f;
        }
        int n5 = R[161];
        n5 ^= R[162];
        if ((n2 & (n5 += R[163])) != 0) {
            f7 = 0.0f;
        }
        int n6 = R[164];
        n6 -= R[165];
        if ((n2 & (n6 += R[166])) != 0) {
            int n7 = R[167];
            n7 -= R[168];
            n = n7 -= R[169];
        }
        int n8 = R[170];
        n8 ^= R[171];
        if ((n2 & (n8 ^= R[172])) != 0) {
            f8 = f5;
        }
        e2.drawText(string, f2, f3, f4, color, f5, f6, f7, n, f8);
    }

    public final void drawGradientText(@NotNull String string, float f2, float f3, float f4, @NotNull Color color, @NotNull Color color2, float f5, float f6, float f7, float f8, int n, float f9) {
        int n2 = R[173];
        n2 ^= R[174];
        Intrinsics.checkNotNullParameter(string, (String)p[n2 -= R[175]]);
        int n3 = R[176];
        n3 += R[177];
        Intrinsics.checkNotNullParameter(color, (String)p[n3 += R[178]]);
        int n4 = R[179];
        n4 ^= R[180];
        Intrinsics.checkNotNullParameter(color2, (String)p[n4 ^= R[181]]);
        boolean bl = R[182];
        bl ^= R[183];
        this.centered(bl += R[184]).size(f4).color(color).gradientColor(color2).gradientOffset(f5).smoothness(f7).spacing(f8).thickness(f6);
        this.M = n;
        this.m = f9;
        this.drawGradient(string, f2, f3);
    }

    public static /* synthetic */ void drawGradientText$default(E e2, String string, float f2, float f3, float f4, Color color, Color color2, float f5, float f6, float f7, float f8, int n, float f9, int n2, Object object) {
        int n3 = R[185];
        n3 ^= R[186];
        if ((n2 & (n3 += R[187])) != 0) {
            f6 = 0.0f;
        }
        int n4 = R[188];
        n4 += R[189];
        if ((n2 & (n4 += R[190])) != 0) {
            f7 = 0.5f;
        }
        int n5 = R[191];
        n5 -= R[192];
        if ((n2 & (n5 ^= R[193])) != 0) {
            f8 = 0.0f;
        }
        int n6 = R[194];
        n6 += R[195];
        if ((n2 & (n6 -= R[196])) != 0) {
            int n7 = R[197];
            n7 += R[198];
            n = n7 -= R[199];
        }
        int n8 = R[200];
        n8 += R[201];
        if ((n2 & (n8 ^= R[202])) != 0) {
            f9 = f6;
        }
        e2.drawGradientText(string, f2, f3, f4, color, color2, f5, f6, f7, f8, n, f9);
    }

    private final void drawRawString(String string, float f2, float f3, float f4, int n, float f5, float f6, float f7, int n2, float f8) {
        kotakbaz.rain.client.render.main.vertex.mesh.A a2 = kotakbaz.rain.client.util.render.A.INSTANCE.getDISPATCHER().getBuilder(this.g, this, null);
        if (a2 == null) {
            return;
        }
        kotakbaz.rain.client.render.main.vertex.mesh.A a3 = a2;
        float f9 = f3 + this.B.baselineHeight() * f4;
        this.applyGlyphs(a3, string, f4, (f5 + f8 * 0.5f) * 0.5f * f4, f7, f2, f9, 0.0f, n, f5, f6, f8, n2);
    }

    private final void drawColoredGlyphs(List<f_0> list, float f2, float f3, float f4, float f5, float f6, float f7, int n, float f8) {
        long l = 8063396523143611282L;
        kotakbaz.rain.client.render.main.vertex.mesh.A a2 = kotakbaz.rain.client.util.render.A.INSTANCE.getDISPATCHER().getBuilder(this.g, this, null);
        if (a2 == null) {
            return;
        }
        kotakbaz.rain.client.render.main.vertex.mesh.A a3 = a2;
        float f9 = f2;
        float f10 = f3 + this.B.baselineHeight() * f4;
        float f11 = this.G;
        float f12 = this.h;
        float f13 = this.H;
        float f14 = this.i;
        float f15 = (f5 + f8 * 0.5f) * 0.5f * f4;
        String string = null;
        for (f f16 : list) {
            e e2;
            kotakbaz.rain.client.render.main.vertex.element.a_0 a_02;
            kotakbaz.rain.client.render.main.vertex.element.a_0 a_03;
            kotakbaz.rain.client.render.main.vertex.element.a_0 a_04;
            kotakbaz.rain.client.render.main.vertex.element.a_0 a_05;
            kotakbaz.rain.client.render.main.vertex.element.a_0 a_06;
            Map<String, Float> map;
            String string2 = String.valueOf(((f_0)f16).getC());
            if ((e)this.c.get(string2) == null) continue;
            if (string != null) {
                String string3;
                long l2 = l;
                int n2 = R[203];
                n2 -= R[204];
                l = l2 ^ (0L ^ l2) & -1L << (n2 -= R[205]);
                v2 = this.C.get(string3);
            } else {
                v2 = map = null;
            }
            if (map != null) {
                Float f17 = (Float)map.get(string2);
                f9 += (f17 != null ? f17.floatValue() : 0.0f) * f4;
            }
            int n2 = ((f_0)f16).getColor();
            kotakbaz.rain.client.render.main.vertex.element.a_0 a_07 = this.d;
            if (a_07 == null) {
                int n4 = R[206];
                n4 ^= R[207];
                Intrinsics.throwUninitializedPropertyAccessException((String)p[n4 -= R[208]]);
                a_07 = null;
            }
            if ((a_06 = this.D) == null) {
                int n5 = R[209];
                n5 -= R[210];
                Intrinsics.throwUninitializedPropertyAccessException((String)p[n5 += R[211]]);
                a_06 = null;
            }
            if ((a_05 = this.e) == null) {
                int n6 = R[212];
                n6 -= R[213];
                Intrinsics.throwUninitializedPropertyAccessException((String)p[n6 -= R[214]]);
                a_05 = null;
            }
            if ((a_04 = this.E) == null) {
                int n7 = R[215];
                n7 -= R[216];
                Intrinsics.throwUninitializedPropertyAccessException((String)p[n7 ^= R[217]]);
                a_04 = null;
            }
            if ((a_03 = this.f) == null) {
                int n8 = R[218];
                n8 ^= R[219];
                Intrinsics.throwUninitializedPropertyAccessException((String)p[n8 -= R[220]]);
                a_03 = null;
            }
            if ((a_02 = this.F) == null) {
                int n9 = R[221];
                n9 -= R[222];
                Intrinsics.throwUninitializedPropertyAccessException((String)p[n9 -= R[223]]);
                a_02 = null;
            }
            f9 += ((e_0)e2).apply(a3, f9, f10, 0.0f, f4, n2, f5, f6, f8, n, f11, f12, f13, f14, a_07, a_06, a_05, a_04, a_03, a_02) + f15 + f7;
            string = string2;
        }
    }

    private final void drawGradientRaw(String string, float f2, float f3, float f4, int n, int n2, float f5, float f6, float f7, float f8, int n3, float f9) {
        long l = 4045930967532419389L;
        long l2 = -4194377783757386465L;
        long l3 = -245064715581223411L;
        long l4 = 8517378953688942681L;
        long l5 = 8821589460760409173L;
        float f10 = RangesKt.coerceAtLeast(this.getWidth(string, f4, f6), 1.0f);
        float f11 = f2 + f5;
        float f12 = f11 + f10;
        kotakbaz.rain.client.render.main.vertex.mesh.A a2 = kotakbaz.rain.client.util.render.A.INSTANCE.getDISPATCHER().getBuilder(this.g, this, null);
        if (a2 == null) {
            return;
        }
        kotakbaz.rain.client.render.main.vertex.mesh.A a3 = a2;
        float f13 = f2;
        float f14 = f3 + this.B.baselineHeight() * f4;
        String string2 = null;
        float f15 = this.G;
        float f16 = this.h;
        float f17 = this.H;
        float f18 = this.i;
        long l6 = l5;
        int n4 = R[224];
        n4 -= R[225];
        l5 = l6 ^ (0L ^ l6) & -1L << (n4 -= R[226]);
        long l7 = l2;
        int n5 = R[227];
        n5 ^= R[228];
        l2 = l7 ^ ((long)((CharSequence)string).length() ^ l7) & -1L >>> (n5 -= R[229]);
        while (true) {
            int n6 = R[230];
            n6 -= R[231];
            if ((int)(l5 >>> (n6 += R[232])) >= (int)l2) break;
            int n7 = R[233];
            n7 += R[234];
            String string3 = String.valueOf(string.charAt((int)(l5 >>> (n7 ^= R[235]))));
            if ((e)this.c.get(string3) != null) {
                e e2;
                kotakbaz.rain.client.render.main.vertex.element.a_0 a_02;
                kotakbaz.rain.client.render.main.vertex.element.a_0 a_03;
                kotakbaz.rain.client.render.main.vertex.element.a_0 a_04;
                kotakbaz.rain.client.render.main.vertex.element.a_0 a_05;
                kotakbaz.rain.client.render.main.vertex.element.a_0 a_06;
                Map<String, Float> map;
                if (string2 != null) {
                    String string4;
                    long l8 = l3;
                    int n8 = R[236];
                    n8 -= R[237];
                    l3 = l8 ^ (0L ^ l8) & -1L >>> (n8 ^= R[238]);
                    v4 = this.C.get(string4);
                } else {
                    v4 = map = null;
                }
                if (map != null) {
                    Float f19 = (Float)map.get(string3);
                    f13 += (f19 != null ? f19.floatValue() : 0.0f) * f4;
                }
                float f20 = RangesKt.coerceIn((f13 - f11) / (f12 - f11), 0.0f, 1.0f);
                int n9 = R[239];
                n9 += R[240];
                long l9 = l4;
                int n10 = R[242];
                n10 += R[243];
                l4 = l9 ^ ((long)this.lerpArgb(n, n2, f20) << (n9 -= R[241]) ^ l9) & -1L << (n10 ^= R[244]);
                int n11 = R[245];
                n11 ^= R[246];
                int n12 = (int)(l4 >>> (n11 -= R[247]));
                kotakbaz.rain.client.render.main.vertex.element.a_0 a_07 = this.d;
                if (a_07 == null) {
                    int n13 = R[248];
                    n13 -= R[249];
                    Intrinsics.throwUninitializedPropertyAccessException((String)p[n13 -= R[250]]);
                    a_07 = null;
                }
                if ((a_06 = this.D) == null) {
                    int n14 = R[251];
                    n14 ^= R[252];
                    Intrinsics.throwUninitializedPropertyAccessException((String)p[n14 += R[253]]);
                    a_06 = null;
                }
                if ((a_05 = this.e) == null) {
                    int n15 = R[254];
                    n15 += R[255];
                    Intrinsics.throwUninitializedPropertyAccessException((String)p[n15 -= R[256]]);
                    a_05 = null;
                }
                if ((a_04 = this.E) == null) {
                    int n16 = R[257];
                    n16 -= R[258];
                    Intrinsics.throwUninitializedPropertyAccessException((String)p[n16 -= R[259]]);
                    a_04 = null;
                }
                if ((a_03 = this.f) == null) {
                    int n17 = R[260];
                    n17 += R[261];
                    Intrinsics.throwUninitializedPropertyAccessException((String)p[n17 -= R[262]]);
                    a_03 = null;
                }
                if ((a_02 = this.F) == null) {
                    int n18 = R[263];
                    n18 += R[264];
                    Intrinsics.throwUninitializedPropertyAccessException((String)p[n18 += R[265]]);
                    a_02 = null;
                }
                f13 += ((e_0)e2).apply(a3, f13, f14, 0.0f, f4, n12, f6, f7, f9, n3, f15, f16, f17, f18, a_07, a_06, a_05, a_04, a_03, a_02) + f8;
                string2 = string3;
            }
            l5 += 0x100000000L;
        }
    }

    private final void applyGlyphs(kotakbaz.rain.client.render.main.vertex.mesh.A a2, String string, float f2, float f3, float f4, float f5, float f6, float f7, int n, float f8, float f9, float f10, int n2) {
        long l = -1539925575355247477L;
        long l2 = 7462110013471110954L;
        long l3 = -9002899703516164729L;
        long l4 = -8390235880601420390L;
        float f11 = f5;
        String string2 = null;
        float f12 = this.G;
        float f13 = this.h;
        float f14 = this.H;
        float f15 = this.i;
        long l5 = l4;
        int n3 = R[266];
        n3 += R[267];
        l4 = l5 ^ (0L ^ l5) & -1L << (n3 -= R[268]);
        long l6 = l3;
        int n4 = R[269];
        n4 -= R[270];
        l3 = l6 ^ ((long)((CharSequence)string).length() ^ l6) & -1L >>> (n4 -= R[271]);
        while (true) {
            int n5 = R[272];
            n5 ^= R[273];
            if ((int)(l4 >>> (n5 ^= R[274])) >= (int)l3) break;
            int n6 = R[275];
            n6 -= R[276];
            String string3 = String.valueOf(string.charAt((int)(l4 >>> (n6 -= R[277]))));
            if ((e)this.c.get(string3) != null) {
                e e2;
                kotakbaz.rain.client.render.main.vertex.element.a_0 a_02;
                kotakbaz.rain.client.render.main.vertex.element.a_0 a_03;
                kotakbaz.rain.client.render.main.vertex.element.a_0 a_04;
                kotakbaz.rain.client.render.main.vertex.element.a_0 a_05;
                kotakbaz.rain.client.render.main.vertex.element.a_0 a_06;
                kotakbaz.rain.client.render.main.vertex.element.a_0 a_07;
                Map<String, Float> map;
                if (string2 != null) {
                    String string4;
                    long l7 = l4;
                    int n7 = R[278];
                    n7 ^= R[279];
                    l4 = l7 ^ (0L ^ l7) & -1L >>> (n7 -= R[280]);
                    v3 = this.C.get(string4);
                } else {
                    v3 = map = null;
                }
                if (map != null) {
                    Float f16 = (Float)map.get(string3);
                    f11 += (f16 != null ? f16.floatValue() : 0.0f) * f2;
                }
                if ((a_07 = this.d) == null) {
                    int n8 = R[281];
                    n8 -= R[282];
                    Intrinsics.throwUninitializedPropertyAccessException((String)p[n8 -= R[283]]);
                    a_07 = null;
                }
                if ((a_06 = this.D) == null) {
                    int n9 = R[284];
                    n9 ^= R[285];
                    Intrinsics.throwUninitializedPropertyAccessException((String)p[n9 -= R[286]]);
                    a_06 = null;
                }
                if ((a_05 = this.e) == null) {
                    int n10 = R[287];
                    n10 ^= R[288];
                    Intrinsics.throwUninitializedPropertyAccessException((String)p[n10 ^= R[289]]);
                    a_05 = null;
                }
                if ((a_04 = this.E) == null) {
                    int n11 = R[290];
                    n11 += R[291];
                    Intrinsics.throwUninitializedPropertyAccessException((String)p[n11 -= R[292]]);
                    a_04 = null;
                }
                if ((a_03 = this.f) == null) {
                    int n12 = R[293];
                    n12 += R[294];
                    Intrinsics.throwUninitializedPropertyAccessException((String)p[n12 ^= R[295]]);
                    a_03 = null;
                }
                if ((a_02 = this.F) == null) {
                    int n13 = R[296];
                    n13 += R[297];
                    Intrinsics.throwUninitializedPropertyAccessException((String)p[n13 += R[298]]);
                    a_02 = null;
                }
                f11 += ((e_0)e2).apply(a2, f11, f6, f7, f2, n, f8, f9, f10, n2, f12, f13, f14, f15, a_07, a_06, a_05, a_04, a_03, a_02) + f3 + f4;
                string2 = string3;
            }
            l4 += 0x100000000L;
        }
    }

    public final float getWidth(@NotNull class_2561 class_25612, float f2, float f3) {
        int n = R[299];
        n ^= R[300];
        Intrinsics.checkNotNullParameter(class_25612, (String)p[n -= R[301]]);
        return this.getWidth(kotakbaz.rain.client.util.other.A.INSTANCE.parseTextToColoredGlyphs(class_25612), f2, f3);
    }

    public static /* synthetic */ float getWidth$default(E e2, class_2561 class_25612, float f2, float f3, int n, Object object) {
        int n2 = R[302];
        n2 += R[303];
        if ((n & (n2 += R[304])) != 0) {
            f3 = 0.0f;
        }
        return e2.getWidth(class_25612, f2, f3);
    }

    public final float getWidth(@NotNull List<f_0> list, float f2, float f3) {
        long l = 3619442419646039260L;
        int n = R[305];
        n ^= R[306];
        Intrinsics.checkNotNullParameter(list, (String)p[n += R[307]]);
        String string = null;
        float f4 = 0.0f;
        for (f f5 : list) {
            e e2;
            Map<String, Float> map;
            String string2 = String.valueOf(((f_0)f5).getC());
            if ((e)this.c.get(string2) == null) continue;
            if (string != null) {
                String string3;
                long l2 = l;
                int n2 = R[308];
                n2 -= R[309];
                l = l2 ^ (0L ^ l2) & -1L << (n2 -= R[310]);
                v1 = this.C.get(string3);
            } else {
                v1 = map = null;
            }
            if (map != null) {
                Float f6 = (Float)map.get(string2);
                f4 += (f6 != null ? f6.floatValue() : 0.0f) * f2 * (1.0f + f3);
            }
            f4 += ((e_0)e2).width(f2) * (1.0f + f3);
            string = string2;
        }
        return f4;
    }

    public static /* synthetic */ float getWidth$default(E e2, List list, float f2, float f3, int n, Object object) {
        int n2 = R[311];
        n2 += R[312];
        if ((n & (n2 ^= R[313])) != 0) {
            f3 = 0.0f;
        }
        return e2.getWidth(list, f2, f3);
    }

    public final float getWidth(@NotNull String string, float f2, float f3) {
        long l = 4874011180415060223L;
        long l2 = 4361695619620428360L;
        long l3 = 6439336761508643992L;
        long l4 = 7476492421478770539L;
        int n = R[314];
        n -= R[315];
        Intrinsics.checkNotNullParameter(string, (String)p[n ^= R[316]]);
        String string2 = null;
        float f4 = 0.0f;
        long l5 = l4;
        int n2 = R[317];
        n2 -= R[318];
        long l6 = l4 = l5 ^ (0L ^ l5) & -1L << (n2 -= R[319]);
        int n3 = R[320];
        n3 ^= R[321];
        l4 = l6 ^ ((long)((CharSequence)string).length() ^ l6) & -1L >>> (n3 -= R[322]);
        while (true) {
            int n4 = R[323];
            n4 ^= R[324];
            if ((int)(l4 >>> (n4 -= R[325])) >= (int)l4) break;
            int n5 = R[326];
            n5 += R[327];
            String string3 = String.valueOf(string.charAt((int)(l4 >>> (n5 ^= R[328]))));
            if ((e)this.c.get(string3) != null) {
                e e2;
                Map<String, Float> map;
                if (string2 != null) {
                    String string4;
                    long l7 = l;
                    int n6 = R[329];
                    n6 += R[330];
                    l = l7 ^ (0L ^ l7) & -1L >>> (n6 ^= R[331]);
                    v3 = this.C.get(string4);
                } else {
                    v3 = map = null;
                }
                if (map != null) {
                    Float f5 = (Float)map.get(string3);
                    f4 += (f5 != null ? f5.floatValue() : 0.0f) * f2 * (1.0f + f3);
                }
                f4 += ((e_0)e2).width(f2) * (1.0f + f3);
                string2 = string3;
            }
            l4 += 0x100000000L;
        }
        return f4;
    }

    public static /* synthetic */ float getWidth$default(E e2, String string, float f2, float f3, int n, Object object) {
        int n2 = R[332];
        n2 -= R[333];
        if ((n & (n2 ^= R[334])) != 0) {
            f3 = 0.0f;
        }
        return e2.getWidth(string, f2, f3);
    }

    public final float getHeight(float f2) {
        return f2;
    }

    public final void drawCenteredText(@NotNull String string, float f2, float f3, float f4, @NotNull Color color, float f5) {
        long l = -6313952070271255979L;
        int n = R[335];
        n -= R[336];
        Intrinsics.checkNotNullParameter(string, (String)p[n ^= R[337]]);
        int n2 = R[338];
        n2 += R[339];
        Intrinsics.checkNotNullParameter(color, (String)p[n2 += R[340]]);
        int n3 = R[341];
        n3 ^= R[342];
        long l2 = l;
        int n4 = R[344];
        n4 ^= R[345];
        l = l2 ^ ((long)this.I << (n3 ^= R[343]) ^ l2) & -1L << (n4 ^= R[346]);
        boolean bl = R[347];
        bl += R[348];
        this.centered(bl -= R[349]).size(f4).color(color).thickness(f5).drawText(string, f2, f3);
        int n5 = R[350];
        n5 ^= R[351];
        this.I = (int)(l >>> (n5 -= R[352]));
    }

    public static /* synthetic */ void drawCenteredText$default(E e2, String string, float f2, float f3, float f4, Color color, float f5, int n, Object object) {
        int n2 = R[353];
        n2 ^= R[354];
        if ((n & (n2 ^= R[355])) != 0) {
            f5 = 0.0f;
        }
        e2.drawCenteredText(string, f2, f3, f4, color, f5);
    }

    public final void drawCenteredGradientText(@NotNull String string, float f2, float f3, float f4, @NotNull Color color, @NotNull Color color2, float f5, float f6) {
        long l = -5949050930324720963L;
        int n = R[356];
        n ^= R[357];
        Intrinsics.checkNotNullParameter(string, (String)p[n += R[358]]);
        int n2 = R[359];
        n2 ^= R[360];
        Intrinsics.checkNotNullParameter(color, (String)p[n2 -= R[361]]);
        int n3 = R[362];
        n3 -= R[363];
        Intrinsics.checkNotNullParameter(color2, (String)p[n3 += R[364]]);
        int n4 = R[365];
        n4 -= R[366];
        long l2 = l;
        int n5 = R[368];
        n5 += R[369];
        l = l2 ^ ((long)this.I << (n4 += R[367]) ^ l2) & -1L << (n5 -= R[370]);
        boolean bl = R[371];
        bl ^= R[372];
        this.centered(bl += R[373]).size(f4).color(color).gradientColor(color2).gradientOffset(f5).thickness(f6).drawGradient(string, f2, f3);
        int n6 = R[374];
        n6 += R[375];
        this.I = (int)(l >>> (n6 += R[376]));
    }

    public static /* synthetic */ void drawCenteredGradientText$default(E e2, String string, float f2, float f3, float f4, Color color, Color color2, float f5, float f6, int n, Object object) {
        int n2 = R[377];
        n2 += R[378];
        if ((n & (n2 ^= R[379])) != 0) {
            f6 = 0.0f;
        }
        e2.drawCenteredGradientText(string, f2, f3, f4, color, color2, f5, f6);
    }

    private final int lerpArgb(int n, int n2, float f2) {
        long l = -4729602311837237007L;
        long l2 = -8534190403326632510L;
        long l3 = -7945707200986220730L;
        long l4 = -8048781520277585285L;
        long l5 = 2089769429783257308L;
        long l6 = 6286062648848626719L;
        long l7 = 4693023293146249154L;
        long l8 = 9056453302770669323L;
        long l9 = -3601202963338934367L;
        long l10 = -3726839471955393546L;
        long l11 = 2363271450342778381L;
        long l12 = -3279258714754782616L;
        long l13 = -513818989868000226L;
        long l14 = -1079257673085852052L;
        float f3 = RangesKt.coerceIn(f2, 0.0f, 1.0f);
        int n3 = R[380];
        n3 -= R[381];
        n3 -= R[382];
        int n4 = R[383];
        n4 += R[384];
        n4 += R[385];
        int n5 = R[386];
        n5 += R[387];
        long l15 = l12;
        int n6 = R[389];
        n6 -= R[390];
        l12 = l15 ^ ((long)(n >>> n3 & n4) << (n5 ^= R[388]) ^ l15) & -1L << (n6 += R[391]);
        int n7 = R[392];
        n7 -= R[393];
        n7 ^= R[394];
        int n8 = R[395];
        n8 ^= R[396];
        n8 -= R[397];
        int n9 = R[398];
        n9 -= R[399];
        long l16 = l14;
        int n10 = 7;
        n10 -= 53;
        l14 = l16 ^ ((long)(n >>> n7 & n8) << (n9 -= -121) ^ l16) & -1L << (n10 -= -78);
        int n11 = 71;
        n11 += -2;
        n11 ^= 0x4D;
        int n12 = 128;
        n12 += 16;
        n12 -= -111;
        int n13 = -120;
        n13 -= -68;
        long l17 = l8;
        int n14 = 234;
        n14 += -124;
        l8 = l17 ^ ((long)(n >>> n11 & n12) << (n13 ^= 0xFFFFFFEC) ^ l17) & -1L << (n14 -= 78);
        int n15 = 346;
        n15 += -117;
        long l18 = l8;
        int n16 = 88;
        n16 += 33;
        l8 = l18 ^ ((long)(n & (n15 -= -26)) ^ l18) & -1L >>> (n16 += -89);
        int n17 = 14;
        n17 -= 64;
        n17 += 74;
        int n18 = -131;
        n18 ^= 0xFFFFFFF9;
        long l19 = l11;
        int n19 = 8;
        n19 ^= 0xFFFFFFEE;
        l11 = l19 ^ ((long)(n2 >>> n17 & (n18 -= -123)) ^ l19) & -1L >>> (n19 += 58);
        int n20 = -67;
        n20 ^= 0x54;
        n20 ^= 0xFFFFFFF9;
        int n21 = 340;
        n21 += -6;
        long l20 = l13;
        int n22 = -43;
        n22 -= -83;
        l13 = l20 ^ ((long)(n2 >>> n20 & (n21 += -79)) ^ l20) & -1L >>> (n22 += -8);
        int n23 = -81;
        n23 ^= 0xFFFFFFFD;
        n23 ^= 0x5A;
        int n24 = 288;
        n24 ^= 0x28;
        n24 -= 9;
        int n25 = 47;
        n25 ^= 0xFFFFFF9E;
        long l21 = l10;
        int n26 = 243;
        n26 += -116;
        l10 = l21 ^ ((long)(n2 >>> n23 & n24) << (n25 += 111) ^ l21) & -1L << (n26 ^= 0x5F);
        int n27 = -292;
        n27 ^= 0xFFFFFFCD;
        long l22 = l10;
        int n28 = 265;
        n28 -= 124;
        l10 = l22 ^ ((long)(n2 & (n27 -= 18)) ^ l22) & -1L >>> (n28 -= 109);
        int n29 = -58;
        n29 ^= 0x72;
        n29 -= -108;
        int n30 = -115;
        n30 ^= 0xFFFFFFE7;
        long l23 = l12;
        int n31 = -114;
        n31 -= -56;
        l12 = l23 ^ ((long)((int)((float)((int)(l12 >>> n29)) + (float)((int)l11 - (int)(l12 >>> (n30 += -74))) * f3)) ^ l23) & -1L >>> (n31 += 90);
        int n32 = 111;
        n32 ^= 0xFFFFFFCB;
        n32 ^= 0xFFFFFF84;
        int n33 = -27;
        n33 += 19;
        long l24 = l14;
        int n34 = 53;
        n34 -= 83;
        l14 = l24 ^ ((long)((int)((float)((int)(l14 >>> n32)) + (float)((int)l13 - (int)(l14 >>> (n33 ^= 0xFFFFFFD8))) * f3)) ^ l24) & -1L >>> (n34 -= -62);
        int n35 = 44;
        n35 -= 68;
        n35 += 56;
        int n36 = 68;
        n36 += -5;
        n36 ^= 0x1F;
        int n37 = -104;
        n37 -= -34;
        n37 += 102;
        int n38 = 28;
        n38 -= 39;
        long l25 = l6;
        int n39 = 188;
        n39 -= 84;
        long l26 = l6 = l25 ^ ((long)((int)((float)((int)(l8 >>> n35)) + (float)((int)(l10 >>> n36) - (int)(l8 >>> n37)) * f3)) << (n38 += 43) ^ l25) & -1L << (n39 ^= 0x48);
        int n40 = -116;
        n40 ^= 0xFFFFFFEE;
        l6 = l26 ^ ((long)((int)((float)((int)l8) + (float)((int)l10 - (int)l8) * f3)) ^ l26) & -1L >>> (n40 -= 66);
        int n41 = -9;
        n41 ^= 0x36;
        n41 += 87;
        int n42 = -20;
        n42 -= -2;
        int n43 = -67;
        n43 ^= 0x18;
        int n44 = -221;
        n44 += 119;
        return (int)l12 << n41 | (int)l14 << (n42 += 34) | (int)(l6 >>> (n43 -= -123)) << (n44 += 110) | (int)l6;
    }

    @NotNull
    public final String id() {
        return this.a;
    }

    static {
        kotakbaz.rain.client.util.render.font.E.b();
        long l = 3049715102356919615L;
        long l2 = 9138459497624944004L;
        long l3 = -4391512626252110011L;
        long l4 = 5444295771220342493L;
        long l5 = 5444147978276243395L;
        long l6 = -7899453790038506813L;
        long l7 = -6787258756124949860L;
        long l8 = -2106001513372375722L;
        long l9 = -4092130612351842856L;
        long l10 = 5158078240852482173L;
        long l11 = -39155148369652037L;
        long l12 = 3880310548799740187L;
        long l13 = 1792879370763240467L;
        long l14 = -9011107257240661119L;
        int n = -90;
        n ^= 0xFFFFFF8E;
        p = new Object[n -= -39];
        long l15 = l14;
        int n2 = -14;
        n2 -= -39;
        l14 = l15 ^ (0L ^ l15) & -1L << (n2 ^= 0x39);
        Object[] objectArray = new Object[3];
        objectArray[0] = P;
        objectArray[1] = 0;
        Object object = kotakbaz.rain.client.util.render.font.E.A()[0];
        if (object == null) {
            char[] cArray = "\uc247\uc25f\uc272\uc0e8\uc251\uc0fe\uc0fc\uc245\uc250\uc0f7\uc101\uc254\uc0e8\uc225\uc237\uc243\uc242\uc0f4\uc23e\uc0f7\uc0e6\uc246\uc0e7\uc245\uc252\uc24d\uc263\uc0f9\uc23f\uc241\uc0f7\uc25f\uc260\uc26e\uc251\uc234\uc243\uc22b\uc262\uc270\uc262\uc240\uc243\uc0e7\uc252\uc254\uc26e\uc270\uc259\uc25e\uc255\uc260\uc0e6\uc263\uc25c\uc0f6\uc259\uc24b\uc0ea\uc248\uc25e\uc270\uc0ea\uc0eb\uc245\uc0f6\uc225\uc26e\uc272\uc25e\uc255\uc235\uc0f9\uc273\uc0e9\uc257\uc250\uc0fc\uc0e6\uc246\uc0fe\uc257\uc26e\uc225\uc24a\uc250\uc239\uc240\uc0e5\uc23c\uc102\uc25c\uc24b\uc225\uc0f4\uc241\uc237\uc250\uc0ed\uc25c\uc243\uc237\uc234\uc246\uc0f6\uc0fe\uc0f9\uc261\uc24d\uc0f4\uc253\uc259\uc0eb\uc0e8\uc240\uc251\uc0e5\uc271\uc0e6\uc271\uc0e6\uc22b\uc24b\uc247\uc237\uc23c\uc248\uc101\uc0ea\uc0e9\uc252\uc22b\uc235\uc262\uc240\uc0f9\uc263\uc251\uc102\uc0e8\uc23e\uc252\uc24a\uc103\uc250\uc0ed\uc252\uc24b\uc225\uc24e\uc0f9\uc24a\uc239\uc24b\uc262\uc273\uc23e\uc242\uc0fe\uc244\uc0f4\uc24b\uc23f\uc25f\uc242\uc239\uc257\uc249\uc23e\uc100\uc103\uc257\uc24b\uc0f7\uc0f9\uc101\uc0eb\uc246\uc102\uc246\uc0fe\uc244\uc26e\uc0fc\uc225\uc0e8\uc24b\uc0e8\uc0e8\uc255\uc0f4\uc0e9\uc246\uc272\uc24e\uc271\uc256\uc271\uc262\uc0e9\uc0e5\uc255\uc0f4\uc225\uc23c\uc0f9\uc245\uc0e5\uc225\uc0f6\uc0ff\uc271\uc0e8\uc0f7\uc0f7\uc0e8\uc244\uc0f6\uc0fe\uc0e5\uc234\uc250\uc250\uc0e7\uc237\uc234\uc0e6\uc25f\uc0ea\uc0f4\uc272\uc239\uc241\uc0e7\uc240\uc255\uc0f4\uc257\uc251\uc0fc\uc237\uc24b\uc272\uc103\uc0ed\uc250\uc244\uc24b\uc254\uc23c\uc250\uc0e9\uc0ea\uc0eb\uc272\uc242\uc245\uc245\uc245\uc24b\uc246\uc23f\uc251\uc252\uc25c\uc25f\uc0ea\uc25c\uc241\uc23c\uc273\uc242\uc254\uc259\uc257\uc244\uc0ff\uc241\uc24b\uc239\uc0e8\uc0eb\uc263\uc257\uc247\uc0eb\uc0fc\uc260\uc245\uc23f\uc247\uc24d\uc0e7\uc23c\uc243\uc262\uc260\uc235\uc0f9\uc0ea\uc25f\uc0ea\uc0eb\uc272\uc0e5\uc249\uc271\uc0ea\uc0e4\uc23c\uc22b\uc244\uc23e\uc25c\uc25e\uc25e\uc260\uc0e5\uc259\uc246\uc0fe\uc263\uc24b\uc225\uc0f4\uc256\uc25e\uc103\uc0e8\uc270\uc250\uc25f\uc100\uc0f7\uc239\uc271\uc24d\uc0f4\uc257\uc256\uc241\uc101\uc24a\uc0ff\uc0fe\uc246\uc250\uc100\uc0ed\uc235\uc26e\uc271\uc23e\uc247\uc0e5\uc23c\uc0f7\uc225\uc0ed\uc237\uc0e9\uc260\uc0eb\uc234\uc0e7\uc247\uc25e\uc102\uc251\uc242\uc237\uc23f\uc0f7\uc259\uc234\uc252\uc0e5\uc0fc\uc256\uc244\uc255\uc0eb\uc234\uc0e5\uc0f6\uc239\uc240\uc103\uc270\uc0fe\uc237\uc103\uc0f4\uc0f6\uc257\uc234\uc260\uc0e5\uc239\uc0f7\uc100\uc254\uc254\uc0fe\uc250\uc22b\uc23e\uc247\uc26e\uc103\uc0ff\uc0fe\uc0ed\uc245\uc0e7\uc235\uc235\uc24d\uc25c\uc0e9\uc250\uc261\uc273\uc103\uc0e7\uc260\uc0e4\uc252\uc249\uc0ff\uc272\uc273\uc260\uc22b\uc254\uc255\uc25e\uc0e8\uc239\uc0f9\uc0f7\uc0ed\uc22b\uc240\uc23e\uc103\uc0e8\uc245\uc0e5\uc25f\uc25c\uc0e9\uc24d\uc0e7\uc254\uc256\uc243\uc251\uc243\uc241\uc240\uc270\uc0e6\uc25e\uc0fc\uc241\uc0fc\uc270\uc23c\uc263\uc101\uc250\uc235\uc101\uc0f4\uc0fe\uc245\uc272\uc253\uc24e\uc0fc\uc0ff\uc253\uc235\uc272\uc256\uc234\uc23c\uc253\uc25c\uc100\uc0ed\uc23f\uc225\uc255\uc24a\uc257\uc245\uc248\uc0e5\uc23e\uc24d\uc24e\uc23c\uc0e8\uc0f4\uc270\uc23c\uc0eb\uc24e\uc239\uc252\uc246\uc253\uc0e5\uc273\uc257\uc241\uc253\uc23c\uc0f4\uc0f9\uc273\uc25e\uc234\uc241\uc23f\uc235\uc25c\uc100\uc254\uc246\uc242\uc251\uc237\uc260\uc246\uc248\uc101\uc259\uc234\uc26e\uc0ff\uc0e9\uc100\uc0ea\uc0f4\uc25e\uc257\uc255\uc0e7\uc247\uc255\uc246\uc100\uc0e9\uc102\uc24e\uc239\uc0f6\uc247\uc248\uc24a\uc273\uc0ea\uc0ea\uc263\uc0ea\uc0f6\uc254\uc25f\uc251\uc253\uc0e9\uc248\uc225\uc0ea\uc0e7\uc103\uc24b\uc260\uc244\uc255\uc234\uc240\uc257\uc25c\uc0e6\uc0e4\uc239\uc101\uc0e9\uc246\uc0e6\uc245\uc26e\uc0fe\uc24a\uc262\uc24a\uc273\uc0e7\uc0e7\uc245\uc102\uc239\uc103\uc245\uc100\uc101\uc254\uc255\uc24e\uc271\uc0f7\uc25c\uc24e\uc245\uc263\uc24a\uc0f9\uc24b\uc0fe\uc0e7\uc234\uc0eb\uc0f4\uc270\uc251\uc24d\uc247\uc101\uc0e8\uc0ea\uc240\uc273\uc103\uc244\uc25e\uc24b\uc25c\uc249\uc0fe\uc25c\uc0f6\uc0ff\uc251\uc225\uc0e9\uc0fc\uc251\uc242\uc247\uc241\uc0f9\uc253\uc225\uc234\uc260\uc250\uc245\uc0e9\uc240\uc0e6\uc235\uc0f9\uc25c\uc23e\uc24a\uc0e7\uc22b\uc259\uc271\uc100\uc244\uc244\uc0f9\uc241\uc261\uc0ff\uc103\uc243\uc24e\uc234\uc0f7\uc270\uc0fe\uc263\uc0e7\uc252\uc241\uc256\uc0f7\uc0f6\uc0e5\uc0ea\uc253\uc103\uc0fe\uc243\uc25f\uc235\uc0ea\uc22b\uc241\uc255\uc241\uc246\uc271\uc251\uc23c\uc0e9\uc23f\uc237\uc271\uc255\uc262\uc102\uc25e\uc225\uc0ea\uc244\uc24a\uc0e7\uc259\uc259\uc0e7\uc246\uc0f4\uc255\uc100\uc252\uc0e8\uc271\uc24b\uc272\uc0f7\uc234\uc272\uc256\uc254\uc240\uc23e\uc246\uc102\uc23f\uc0e5\uc251\uc253\uc248\uc23f\uc270\uc0e9\uc273\uc0e6\uc0f9\uc248\uc0f7\uc255\uc245\uc22b\uc272\uc246\uc24a\uc259\uc22b\uc253\uc0f6\uc234\uc24b\uc0eb\uc273\uc242\uc246\uc235\uc100\uc0e5\uc0ff\uc101\uc0e7\uc249\uc256\uc244\uc25c\uc245\uc0eb\uc0ea\uc248\uc262\uc242\uc0fc\uc247\uc257\uc102\uc101\uc243\uc102\uc251\uc237\uc0f6\uc102\uc24a\uc271\uc247\uc235\uc24b\uc272\uc245\uc257\uc24e\uc23f\uc239\uc247\uc262\uc25e\uc240\uc255\uc23c\uc252\uc0f4\uc25f\uc240\uc0fc\uc239\uc24b\uc246\uc24d\uc101\uc253\uc249\uc100\uc102\uc25e\uc24e\uc0e6\uc273\uc25f\uc0fe\uc0f7\uc0ff\uc22b\uc270\uc259\uc272\uc101\uc271\uc103\uc255\uc240\uc235\uc0f7\uc24a\uc23c\uc0fc\uc235\uc250\uc251\uc0f4\uc0e9\uc100\uc100\uc254\uc257\uc242\uc0e6\uc257\uc248\uc250\uc0fe\uc24b\uc260\uc25f\uc0fc\uc262\uc24d\uc100\uc271\uc272\uc253\uc270\uc0ed\uc245\uc248\uc25e\uc248\uc24d\uc271\uc225\uc24e\uc24b\uc24b\uc254\uc256\uc237\uc237\uc23e\uc225\uc24b\uc260\uc272\uc0eb\uc261\uc234\uc24e\uc25f\uc103\uc270\uc271\uc0ea\uc253\uc263\uc256\uc254\uc0e4\uc0ed\uc24d\uc270\uc271\uc253\uc0e5\uc24a\uc250\uc0f7\uc253\uc100\uc0e9\uc237\uc242\uc0ff\uc237\uc251\uc23c\uc239\uc248\uc241\uc245\uc0fc\uc0e5\uc0e6\uc0e9\uc0ff\uc251\uc0ed\uc0ed\uc0e4\uc23e\uc263\uc0e9\uc25f\uc0e7\uc102\uc0e6\uc23f\uc246\uc100\uc23c\uc253\uc0e5\uc25e\uc225\uc0e9\uc251\uc23e\uc0e4\uc253\uc0e8\uc235\uc251\uc242\uc0e5\uc25c\uc102\uc244\uc262\uc243\uc0fe\uc240\uc0e9\uc0e8\uc237\uc24b\uc0e7\uc23d\uc23d".toCharArray();
            for (int i = 0; i < 984; ++i) {
                int n3 = cArray[i];
                n3 -= 2690;
                n3 -= 37427;
                n3 -= 1125;
                n3 += 51062;
                n3 ^= 0x8AC6;
                n3 ^= 0xD5B7;
                n3 -= 10809;
                n3 ^= 0x1EB9;
                n3 -= 29098;
                n3 -= 25035;
                cArray[i] = (char)(n3 += 16540);
            }
            object = kotakbaz.rain.client.util.render.font.E.A()[0] = new String(cArray);
        }
        objectArray[2] = (String)object;
        char[] cArray = ((String)kotakbaz.rain.client.util.render.font.E.a(objectArray)).toCharArray();
        long l16 = l5;
        int n4 = -149;
        n4 += 72;
        l5 = l16 ^ (0x2CF00000000L ^ l16) & -1L << (n4 ^= 0xFFFFFF93);
        long l17 = l12;
        int n5 = 64;
        n5 += -36;
        l12 = l17 ^ (0L ^ l17) & -1L >>> (n5 ^= 0x3C);
        while (true) {
            int n6 = 106;
            n6 ^= 0xFFFFFFB9;
            if ((int)l12 >= (int)(l5 >>> (n6 -= -77))) break;
            int n7 = (int)l12;
            long l18 = l12;
            int n8 = -43;
            n8 ^= 0xFFFFFF8E;
            int n9 = 244;
            n9 ^= 0x79;
            l12 = l18 ^ (l18 ^ l18 + (long)(n8 ^= 0x5A)) & -1L >>> (n9 -= 109);
            long l19 = l8;
            int n10 = 53;
            n10 ^= 0x72;
            l8 = l19 ^ ((long)cArray[n7] ^ l19) & -1L >>> (n10 ^= 0x67);
            int n11 = (int)l12;
            long l20 = l12;
            int n12 = 127;
            n12 += -97;
            int n13 = -74;
            n13 ^= 0x44;
            l12 = l20 ^ (l20 ^ l20 + (long)(n12 ^= 0x1F)) & -1L >>> (n13 -= -46);
            int n14 = 27;
            n14 += -17;
            long l21 = l9;
            int n15 = 29;
            n15 += -67;
            l9 = l21 ^ ((long)cArray[n11] << (n14 += 22) ^ l21) & -1L << (n15 -= -70);
            int n16 = 127;
            n16 ^= 0x21;
            n16 -= 78;
            int n17 = 8;
            n17 ^= 0xFFFFFFDD;
            long l22 = l11;
            int n18 = 152;
            n18 -= 112;
            l11 = l22 ^ ((long)((int)l8 << n16 | (int)(l9 >>> (n17 += 75))) ^ l22) & -1L >>> (n18 -= 8);
            char[] cArray2 = new char[(int)l11];
            long l23 = l13;
            int n19 = 68;
            n19 += -98;
            l13 = l23 ^ (0L ^ l23) & -1L << (n19 += 62);
            while (true) {
                int n20 = 7;
                n20 += 37;
                if ((int)(l13 >>> (n20 -= 12)) >= (int)l11) break;
                int n21 = -27;
                n21 += -18;
                int n22 = -52;
                n22 -= -81;
                cArray2[(int)(l13 >>> (n21 ^= 0xFFFFFFF3))] = cArray[(int)l12 + (int)(l13 >>> (n22 += 3))];
                l13 += 0x100000000L;
            }
            int n23 = -226;
            n23 += 99;
            int n24 = (int)(l14 >>> (n23 ^= 0xFFFFFFA1));
            l14 += 0x100000000L;
            kotakbaz.rain.client.util.render.font.E.p[n24] = new String(cArray2);
            long l24 = l12;
            int n25 = 195;
            n25 += -116;
            l12 = l24 ^ ((long)((int)l12 + (int)l11) ^ l24) & -1L >>> (n25 ^= 0x6F);
        }
        h = new A(null);
        int n26 = 5;
        n26 += -117;
        n26 ^= 0xFFFFFF93;
        int n27 = -63;
        n27 -= 27;
        n27 ^= 0xFFFFFFA4;
        int n28 = 14;
        n28 -= -94;
        n28 += -95;
        int n29 = 32;
        n29 -= -56;
        n29 ^= 0x5C;
        int n30 = 29;
        n30 += 48;
        n30 += -40;
        int n31 = 178;
        n31 += -52;
        n31 -= 123;
        int n32 = 122;
        n32 -= 51;
        n32 += -32;
        int n33 = 83;
        n33 ^= 0x13;
        n33 += -60;
        int n34 = -90;
        n34 -= -110;
        n34 += 30;
        int n35 = 12;
        n35 += 38;
        int n36 = 81;
        n36 -= 23;
        int n37 = -126;
        n37 ^= 0x62;
        O = a_0.builder().element((String)p[n26], kotakbaz.rain.client.render.main.vertex.element.A.C, n27).element((String)p[n28], kotakbaz.rain.client.render.main.vertex.element.A.C, n29).element((String)p[n30], kotakbaz.rain.client.render.main.vertex.element.A.C, n31).element((String)p[n32], kotakbaz.rain.client.render.main.vertex.element.A.C, n33).element((String)p[n34], kotakbaz.rain.client.render.main.vertex.element.A.C, n35 += -46).element((String)p[n36 += -44], kotakbaz.rain.client.render.main.vertex.element.A.C, n37 ^= 0xFFFFFFE4).build();
    }

    public static Object a(Object[] object) {
        Object object2;
        int n = (Integer)object[1];
        String string = (String)object[2];
        object = object[0];
        Object[] objectArray = Q;
        if (Q == null) {
            objectArray = Q = new Object[1];
        }
        if ((object2 = objectArray[n]) == null) {
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
                    for (int i = 0; i < 18; ++i) {
                        int n2 = cArray[i];
                        n2 ^= 0x5950;
                        n2 -= 50594;
                        n2 += 30962;
                        n2 ^= 0xF2F4;
                        n2 -= 37509;
                        n2 += 56486;
                        n2 += 45079;
                        n2 -= 4648;
                        n2 ^= 0xEE99;
                        n2 -= 17275;
                        n2 -= 3067;
                        cArray[i] = (char)(n2 ^= 0xBFBD);
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
                    for (int i = 0; i < 3; ++i) {
                        int n3 = cArray[i];
                        n3 += 22320;
                        n3 += 2947;
                        n3 -= 6964;
                        n3 += 30021;
                        n3 -= 31525;
                        n3 += 44534;
                        n3 ^= 0xBF37;
                        n3 ^= 0x36F7;
                        n3 -= 4312;
                        n3 ^= 0x759C;
                        cArray[i] = (char)(n3 ^= 0x21FD);
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
                for (int i = 0; i < 20; ++i) {
                    int n4 = cArray[i];
                    n4 -= 61921;
                    n4 += 39010;
                    n4 -= 17922;
                    n4 += 29090;
                    n4 -= 57091;
                    n4 -= 59498;
                    n4 -= 51916;
                    n4 ^= 0xF90C;
                    n4 += 2637;
                    n4 -= 48269;
                    n4 += 11885;
                    n4 -= 58804;
                    n4 += 3960;
                    n4 -= 5306;
                    n4 += 58267;
                    cArray[i] = (char)(n4 -= 45918);
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

