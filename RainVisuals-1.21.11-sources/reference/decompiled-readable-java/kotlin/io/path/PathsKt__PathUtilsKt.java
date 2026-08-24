/*
 * Decompiled with CFR 0.152.
 */
package kotlin.io.path;

import java.io.Closeable;
import java.io.IOException;
import java.net.URI;
import java.nio.file.CopyOption;
import java.nio.file.DirectoryStream;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.FileStore;
import java.nio.file.FileVisitOption;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.FileAttributeView;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.UserPrincipal;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.WasExperimental;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.internal.InlineOnly;
import kotlin.internal.PlatformImplementationsKt;
import kotlin.io.CloseableKt;
import kotlin.io.path.ExperimentalPathApi;
import kotlin.io.path.FileVisitorBuilder;
import kotlin.io.path.FileVisitorBuilderImpl;
import kotlin.io.path.PathRelativizer;
import kotlin.io.path.PathTreeWalk;
import kotlin.io.path.PathWalkOption;
import kotlin.io.path.PathsKt;
import kotlin.io.path.PathsKt__PathRecursiveFunctionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=5, xi=49, d1={"\u0000\u00d2\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0015\u001a\u0018\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\b\u00a2\u0006\u0004\b\u0003\u0010\u0004\u001a,\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00002\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u0006\"\u00020\u0000H\u0087\b\u00a2\u0006\u0004\b\u0003\u0010\b\u001aA\u0010\r\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00002\u001a\u0010\f\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u000b0\u0006\"\u0006\u0012\u0002\b\u00030\u000bH\u0007\u00a2\u0006\u0004\b\r\u0010\u000e\u001a8\u0010\r\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00002\u001a\u0010\f\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u000b0\u0006\"\u0006\u0012\u0002\b\u00030\u000bH\u0087\b\u00a2\u0006\u0004\b\r\u0010\u000f\u001aM\u0010\u0011\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00002\u001a\u0010\f\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u000b0\u0006\"\u0006\u0012\u0002\b\u00030\u000bH\u0007\u00a2\u0006\u0004\b\u0011\u0010\u0012\u001aD\u0010\u0011\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00002\u001a\u0010\f\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u000b0\u0006\"\u0006\u0012\u0002\b\u00030\u000bH\u0087\b\u00a2\u0006\u0004\b\u0011\u0010\u0013\u001a#\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0001\u001a\u00020\u00022\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u0014H\u0001\u00a2\u0006\u0004\b\u0017\u0010\u0018\u001a;\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u001e2\u0017\u0010\u001d\u001a\u0013\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u0019\u00a2\u0006\u0002\b\u001cH\u0007\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\u00a2\u0006\u0004\b\u001f\u0010 \u001a\u0014\u0010!\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u00a2\u0006\u0004\b!\u0010\"\u001a\u0014\u0010#\u001a\u00020\u0000*\u00020\u0002H\u0087\b\u00a2\u0006\u0004\b#\u0010$\u001a0\u0010(\u001a\u00020\u0002*\u00020\u00022\u0006\u0010%\u001a\u00020\u00022\u0012\u0010'\u001a\n\u0012\u0006\b\u0001\u0012\u00020&0\u0006\"\u00020&H\u0087\b\u00a2\u0006\u0004\b(\u0010)\u001a&\u0010(\u001a\u00020\u0002*\u00020\u00022\u0006\u0010%\u001a\u00020\u00022\b\b\u0002\u0010+\u001a\u00020*H\u0087\b\u00a2\u0006\u0004\b(\u0010,\u001a0\u0010-\u001a\u00020\u0002*\u00020\u00022\u001a\u0010\f\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u000b0\u0006\"\u0006\u0012\u0002\b\u00030\u000bH\u0087\b\u00a2\u0006\u0004\b-\u0010.\u001a0\u0010/\u001a\u00020\u0002*\u00020\u00022\u001a\u0010\f\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u000b0\u0006\"\u0006\u0012\u0002\b\u00030\u000bH\u0087\b\u00a2\u0006\u0004\b/\u0010.\u001a0\u00100\u001a\u00020\u0002*\u00020\u00022\u001a\u0010\f\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u000b0\u0006\"\u0006\u0012\u0002\b\u00030\u000bH\u0087\b\u00a2\u0006\u0004\b0\u0010.\u001a\u001c\u00101\u001a\u00020\u0002*\u00020\u00022\u0006\u0010%\u001a\u00020\u0002H\u0087\b\u00a2\u0006\u0004\b1\u00102\u001a/\u00103\u001a\u00020\u0002*\u00020\u00022\u001a\u0010\f\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u000b0\u0006\"\u0006\u0012\u0002\b\u00030\u000bH\u0007\u00a2\u0006\u0004\b3\u0010.\u001a8\u00104\u001a\u00020\u0002*\u00020\u00022\u0006\u0010%\u001a\u00020\u00022\u001a\u0010\f\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u000b0\u0006\"\u0006\u0012\u0002\b\u00030\u000bH\u0087\b\u00a2\u0006\u0004\b4\u00105\u001a\u0014\u00106\u001a\u00020\u001b*\u00020\u0002H\u0087\b\u00a2\u0006\u0004\b6\u00107\u001a\u0014\u00108\u001a\u00020**\u00020\u0002H\u0087\b\u00a2\u0006\u0004\b8\u00109\u001a\u001c\u0010;\u001a\u00020\u0002*\u00020\u00022\u0006\u0010:\u001a\u00020\u0002H\u0087\n\u00a2\u0006\u0004\b;\u00102\u001a\u001c\u0010;\u001a\u00020\u0002*\u00020\u00022\u0006\u0010:\u001a\u00020\u0000H\u0087\n\u00a2\u0006\u0004\b;\u0010<\u001a(\u0010>\u001a\u00020**\u00020\u00022\u0012\u0010'\u001a\n\u0012\u0006\b\u0001\u0012\u00020=0\u0006\"\u00020=H\u0087\b\u00a2\u0006\u0004\b>\u0010?\u001a4\u0010B\u001a\u00028\u0000\"\n\b\u0000\u0010A\u0018\u0001*\u00020@*\u00020\u00022\u0012\u0010'\u001a\n\u0012\u0006\b\u0001\u0012\u00020=0\u0006\"\u00020=H\u0087\b\u00a2\u0006\u0004\bB\u0010C\u001a6\u0010D\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010A\u0018\u0001*\u00020@*\u00020\u00022\u0012\u0010'\u001a\n\u0012\u0006\b\u0001\u0012\u00020=0\u0006\"\u00020=H\u0087\b\u00a2\u0006\u0004\bD\u0010C\u001a\u0014\u0010F\u001a\u00020E*\u00020\u0002H\u0087\b\u00a2\u0006\u0004\bF\u0010G\u001a\u0014\u0010I\u001a\u00020H*\u00020\u0002H\u0087\b\u00a2\u0006\u0004\bI\u0010J\u001a5\u0010M\u001a\u00020\u001b*\u00020\u00022\b\b\u0002\u0010K\u001a\u00020\u00002\u0012\u0010L\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u001b0\u0019H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\bM\u0010N\u001a2\u0010Q\u001a\u0004\u0018\u00010P*\u00020\u00022\u0006\u0010O\u001a\u00020\u00002\u0012\u0010'\u001a\n\u0012\u0006\b\u0001\u0012\u00020=0\u0006\"\u00020=H\u0087\b\u00a2\u0006\u0004\bQ\u0010R\u001a(\u0010T\u001a\u00020S*\u00020\u00022\u0012\u0010'\u001a\n\u0012\u0006\b\u0001\u0012\u00020=0\u0006\"\u00020=H\u0087\b\u00a2\u0006\u0004\bT\u0010U\u001a*\u0010W\u001a\u0004\u0018\u00010V*\u00020\u00022\u0012\u0010'\u001a\n\u0012\u0006\b\u0001\u0012\u00020=0\u0006\"\u00020=H\u0087\b\u00a2\u0006\u0004\bW\u0010X\u001a.\u0010[\u001a\b\u0012\u0004\u0012\u00020Z0Y*\u00020\u00022\u0012\u0010'\u001a\n\u0012\u0006\b\u0001\u0012\u00020=0\u0006\"\u00020=H\u0087\b\u00a2\u0006\u0004\b[\u0010\\\u001a(\u0010]\u001a\u00020**\u00020\u00022\u0012\u0010'\u001a\n\u0012\u0006\b\u0001\u0012\u00020=0\u0006\"\u00020=H\u0087\b\u00a2\u0006\u0004\b]\u0010?\u001a\u0014\u0010^\u001a\u00020**\u00020\u0002H\u0087\b\u00a2\u0006\u0004\b^\u00109\u001a\u0014\u0010_\u001a\u00020**\u00020\u0002H\u0087\b\u00a2\u0006\u0004\b_\u00109\u001a\u0014\u0010`\u001a\u00020**\u00020\u0002H\u0087\b\u00a2\u0006\u0004\b`\u00109\u001a(\u0010a\u001a\u00020**\u00020\u00022\u0012\u0010'\u001a\n\u0012\u0006\b\u0001\u0012\u00020=0\u0006\"\u00020=H\u0087\b\u00a2\u0006\u0004\ba\u0010?\u001a\u001c\u0010b\u001a\u00020**\u00020\u00022\u0006\u0010:\u001a\u00020\u0002H\u0087\b\u00a2\u0006\u0004\bb\u0010c\u001a\u0014\u0010d\u001a\u00020**\u00020\u0002H\u0087\b\u00a2\u0006\u0004\bd\u00109\u001a\u0014\u0010e\u001a\u00020**\u00020\u0002H\u0087\b\u00a2\u0006\u0004\be\u00109\u001a#\u0010g\u001a\b\u0012\u0004\u0012\u00020\u00020f*\u00020\u00022\b\b\u0002\u0010K\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\bg\u0010h\u001a0\u0010i\u001a\u00020\u0002*\u00020\u00022\u0006\u0010%\u001a\u00020\u00022\u0012\u0010'\u001a\n\u0012\u0006\b\u0001\u0012\u00020&0\u0006\"\u00020&H\u0087\b\u00a2\u0006\u0004\bi\u0010)\u001a&\u0010i\u001a\u00020\u0002*\u00020\u00022\u0006\u0010%\u001a\u00020\u00022\b\b\u0002\u0010+\u001a\u00020*H\u0087\b\u00a2\u0006\u0004\bi\u0010,\u001a(\u0010j\u001a\u00020**\u00020\u00022\u0012\u0010'\u001a\n\u0012\u0006\b\u0001\u0012\u00020=0\u0006\"\u00020=H\u0087\b\u00a2\u0006\u0004\bj\u0010?\u001a4\u0010m\u001a\u00028\u0000\"\n\b\u0000\u0010l\u0018\u0001*\u00020k*\u00020\u00022\u0012\u0010'\u001a\n\u0012\u0006\b\u0001\u0012\u00020=0\u0006\"\u00020=H\u0087\b\u00a2\u0006\u0004\bm\u0010n\u001a>\u0010m\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010P0o*\u00020\u00022\u0006\u0010\f\u001a\u00020\u00002\u0012\u0010'\u001a\n\u0012\u0006\b\u0001\u0012\u00020=0\u0006\"\u00020=H\u0087\b\u00a2\u0006\u0004\bm\u0010p\u001a\u0014\u0010q\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u00a2\u0006\u0004\bq\u0010\"\u001a\u001b\u0010r\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0007\u00a2\u0006\u0004\br\u00102\u001a\u001d\u0010s\u001a\u0004\u0018\u00010\u0002*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0007\u00a2\u0006\u0004\bs\u00102\u001a\u001b\u0010t\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0007\u00a2\u0006\u0004\bt\u00102\u001a:\u0010v\u001a\u00020\u0002*\u00020\u00022\u0006\u0010O\u001a\u00020\u00002\b\u0010u\u001a\u0004\u0018\u00010P2\u0012\u0010'\u001a\n\u0012\u0006\b\u0001\u0012\u00020=0\u0006\"\u00020=H\u0087\b\u00a2\u0006\u0004\bv\u0010w\u001a\u001c\u0010x\u001a\u00020\u0002*\u00020\u00022\u0006\u0010u\u001a\u00020SH\u0087\b\u00a2\u0006\u0004\bx\u0010y\u001a\u001c\u0010z\u001a\u00020\u0002*\u00020\u00022\u0006\u0010u\u001a\u00020VH\u0087\b\u00a2\u0006\u0004\bz\u0010{\u001a\"\u0010|\u001a\u00020\u0002*\u00020\u00022\f\u0010u\u001a\b\u0012\u0004\u0012\u00020Z0YH\u0087\b\u00a2\u0006\u0004\b|\u0010}\u001a\u0015\u0010\u007f\u001a\u00020\u0002*\u00020~H\u0087\b\u00a2\u0006\u0005\b\u007f\u0010\u0080\u0001\u001aG\u0010\u0084\u0001\u001a\u00028\u0000\"\u0005\b\u0000\u0010\u0081\u0001*\u00020\u00022\b\b\u0002\u0010K\u001a\u00020\u00002\u001a\u0010\u0083\u0001\u001a\u0015\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020\u00020\u0082\u0001\u0012\u0004\u0012\u00028\u00000\u0019H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001\u001a<\u0010\u008a\u0001\u001a\u00020\u001b*\u00020\u00022\r\u0010\u0086\u0001\u001a\b\u0012\u0004\u0012\u00020\u00020\u001e2\n\b\u0002\u0010\u0088\u0001\u001a\u00030\u0087\u00012\t\b\u0002\u0010\u0089\u0001\u001a\u00020*H\u0007\u00a2\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001\u001aS\u0010\u008a\u0001\u001a\u00020\u001b*\u00020\u00022\n\b\u0002\u0010\u0088\u0001\u001a\u00030\u0087\u00012\t\b\u0002\u0010\u0089\u0001\u001a\u00020*2\u0017\u0010\u001d\u001a\u0013\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u0019\u00a2\u0006\u0002\b\u001cH\u0007\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0003 \u0001\u00a2\u0006\u0006\b\u008a\u0001\u0010\u008c\u0001\u001a3\u0010\u008e\u0001\u001a\t\u0012\u0004\u0012\u00020\u00020\u0082\u0001*\u00020\u00022\u0014\u0010'\u001a\u000b\u0012\u0007\b\u0001\u0012\u00030\u008d\u00010\u0006\"\u00030\u008d\u0001H\u0007\u00a2\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001\"!\u0010\u0092\u0001\u001a\u00020\u0000*\u00020\u00028FX\u0087\u0004\u00a2\u0006\u000e\u0012\u0005\b\u0091\u0001\u00107\u001a\u0005\b\u0090\u0001\u0010$\"\"\u0010\u0095\u0001\u001a\u00020\u0000*\u00020\u00028\u00c6\u0002X\u0087\u0004\u00a2\u0006\u000e\u0012\u0005\b\u0094\u0001\u00107\u001a\u0005\b\u0093\u0001\u0010$\"!\u0010\u0098\u0001\u001a\u00020\u0000*\u00020\u00028FX\u0087\u0004\u00a2\u0006\u000e\u0012\u0005\b\u0097\u0001\u00107\u001a\u0005\b\u0096\u0001\u0010$\"!\u0010\u009b\u0001\u001a\u00020\u0000*\u00020\u00028FX\u0087\u0004\u00a2\u0006\u000e\u0012\u0005\b\u009a\u0001\u00107\u001a\u0005\b\u0099\u0001\u0010$\"!\u0010\u009e\u0001\u001a\u00020\u0000*\u00020\u00028FX\u0087\u0004\u00a2\u0006\u000e\u0012\u0005\b\u009d\u0001\u00107\u001a\u0005\b\u009c\u0001\u0010$\"\"\u0010\u00a1\u0001\u001a\u00020\u0000*\u00020\u00028\u00c6\u0002X\u0087\u0004\u00a2\u0006\u000e\u0012\u0005\b\u00a0\u0001\u00107\u001a\u0005\b\u009f\u0001\u0010$\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006\u00a2\u0001"}, d2={"", "path", "Ljava/nio/file/Path;", "Path", "(Ljava/lang/String;)Ljava/nio/file/Path;", "base", "", "subpaths", "(Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;", "directory", "prefix", "Ljava/nio/file/attribute/FileAttribute;", "attributes", "createTempDirectory", "(Ljava/nio/file/Path;Ljava/lang/String;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;", "(Ljava/lang/String;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;", "suffix", "createTempFile", "(Ljava/nio/file/Path;Ljava/lang/String;Ljava/lang/String;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;", "(Ljava/lang/String;Ljava/lang/String;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;", "Ljava/lang/Class;", "attributeViewClass", "", "fileAttributeViewNotAvailable", "(Ljava/nio/file/Path;Ljava/lang/Class;)Ljava/lang/Void;", "Lkotlin/Function1;", "Lkotlin/io/path/FileVisitorBuilder;", "", "Lkotlin/ExtensionFunctionType;", "builderAction", "Ljava/nio/file/FileVisitor;", "fileVisitor", "(Lkotlin/jvm/functions/Function1;)Ljava/nio/file/FileVisitor;", "absolute", "(Ljava/nio/file/Path;)Ljava/nio/file/Path;", "absolutePathString", "(Ljava/nio/file/Path;)Ljava/lang/String;", "target", "Ljava/nio/file/CopyOption;", "options", "copyTo", "(Ljava/nio/file/Path;Ljava/nio/file/Path;[Ljava/nio/file/CopyOption;)Ljava/nio/file/Path;", "", "overwrite", "(Ljava/nio/file/Path;Ljava/nio/file/Path;Z)Ljava/nio/file/Path;", "createDirectories", "(Ljava/nio/file/Path;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;", "createDirectory", "createFile", "createLinkPointingTo", "(Ljava/nio/file/Path;Ljava/nio/file/Path;)Ljava/nio/file/Path;", "createParentDirectories", "createSymbolicLinkPointingTo", "(Ljava/nio/file/Path;Ljava/nio/file/Path;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;", "deleteExisting", "(Ljava/nio/file/Path;)V", "deleteIfExists", "(Ljava/nio/file/Path;)Z", "other", "div", "(Ljava/nio/file/Path;Ljava/lang/String;)Ljava/nio/file/Path;", "Ljava/nio/file/LinkOption;", "exists", "(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z", "Ljava/nio/file/attribute/FileAttributeView;", "V", "fileAttributesView", "(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Ljava/nio/file/attribute/FileAttributeView;", "fileAttributesViewOrNull", "", "fileSize", "(Ljava/nio/file/Path;)J", "Ljava/nio/file/FileStore;", "fileStore", "(Ljava/nio/file/Path;)Ljava/nio/file/FileStore;", "glob", "action", "forEachDirectoryEntry", "(Ljava/nio/file/Path;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "attribute", "", "getAttribute", "(Ljava/nio/file/Path;Ljava/lang/String;[Ljava/nio/file/LinkOption;)Ljava/lang/Object;", "Ljava/nio/file/attribute/FileTime;", "getLastModifiedTime", "(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Ljava/nio/file/attribute/FileTime;", "Ljava/nio/file/attribute/UserPrincipal;", "getOwner", "(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Ljava/nio/file/attribute/UserPrincipal;", "", "Ljava/nio/file/attribute/PosixFilePermission;", "getPosixFilePermissions", "(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Ljava/util/Set;", "isDirectory", "isExecutable", "isHidden", "isReadable", "isRegularFile", "isSameFileAs", "(Ljava/nio/file/Path;Ljava/nio/file/Path;)Z", "isSymbolicLink", "isWritable", "", "listDirectoryEntries", "(Ljava/nio/file/Path;Ljava/lang/String;)Ljava/util/List;", "moveTo", "notExists", "Ljava/nio/file/attribute/BasicFileAttributes;", "A", "readAttributes", "(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Ljava/nio/file/attribute/BasicFileAttributes;", "", "(Ljava/nio/file/Path;Ljava/lang/String;[Ljava/nio/file/LinkOption;)Ljava/util/Map;", "readSymbolicLink", "relativeTo", "relativeToOrNull", "relativeToOrSelf", "value", "setAttribute", "(Ljava/nio/file/Path;Ljava/lang/String;Ljava/lang/Object;[Ljava/nio/file/LinkOption;)Ljava/nio/file/Path;", "setLastModifiedTime", "(Ljava/nio/file/Path;Ljava/nio/file/attribute/FileTime;)Ljava/nio/file/Path;", "setOwner", "(Ljava/nio/file/Path;Ljava/nio/file/attribute/UserPrincipal;)Ljava/nio/file/Path;", "setPosixFilePermissions", "(Ljava/nio/file/Path;Ljava/util/Set;)Ljava/nio/file/Path;", "Ljava/net/URI;", "toPath", "(Ljava/net/URI;)Ljava/nio/file/Path;", "T", "Lkotlin/sequences/Sequence;", "block", "useDirectoryEntries", "(Ljava/nio/file/Path;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "visitor", "", "maxDepth", "followLinks", "visitFileTree", "(Ljava/nio/file/Path;Ljava/nio/file/FileVisitor;IZ)V", "(Ljava/nio/file/Path;IZLkotlin/jvm/functions/Function1;)V", "Lkotlin/io/path/PathWalkOption;", "walk", "(Ljava/nio/file/Path;[Lkotlin/io/path/PathWalkOption;)Lkotlin/sequences/Sequence;", "getExtension", "getExtension$annotations", "extension", "getInvariantSeparatorsPath", "getInvariantSeparatorsPath$annotations", "invariantSeparatorsPath", "getInvariantSeparatorsPathString", "getInvariantSeparatorsPathString$annotations", "invariantSeparatorsPathString", "getName", "getName$annotations", "name", "getNameWithoutExtension", "getNameWithoutExtension$annotations", "nameWithoutExtension", "getPathString", "getPathString$annotations", "pathString", "kotlin-stdlib-jdk7"}, xs="kotlin/io/path/PathsKt")
class PathsKt__PathUtilsKt
extends PathsKt__PathRecursiveFunctionsKt {
    @WasExperimental(markerClass={ExperimentalPathApi.class})
    @InlineOnly
    @SinceKotlin(version="1.5")
    private static final Path createDirectories(Path $this$createDirectories, FileAttribute<?> ... attributes) throws IOException {
        Intrinsics.checkNotNullParameter($this$createDirectories, "<this>");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Path path = Files.createDirectories($this$createDirectories, Arrays.copyOf(attributes, attributes.length));
        Intrinsics.checkNotNullExpressionValue(path, "createDirectories(...)");
        return path;
    }

    public static /* synthetic */ Path createTempDirectory$default(Path path, String string, FileAttribute[] fileAttributeArray, int n, Object object) throws IOException {
        if ((n & 2) != 0) {
            string = null;
        }
        return PathsKt.createTempDirectory(path, string, fileAttributeArray);
    }

    public static /* synthetic */ List listDirectoryEntries$default(Path path, String string, int n, Object object) throws IOException {
        if ((n & 1) != 0) {
            string = "*";
        }
        return PathsKt.listDirectoryEntries(path, string);
    }

    @SinceKotlin(version="1.5")
    @WasExperimental(markerClass={ExperimentalPathApi.class})
    @InlineOnly
    private static final Path Path(String base, String ... subpaths) {
        Intrinsics.checkNotNullParameter(base, "base");
        Intrinsics.checkNotNullParameter(subpaths, "subpaths");
        Path path = Paths.get(base, Arrays.copyOf(subpaths, subpaths.length));
        Intrinsics.checkNotNullExpressionValue(path, "get(...)");
        return path;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    static /* synthetic */ Object useDirectoryEntries$default(Path $this$useDirectoryEntries_u24default, String glob, Function1 block, int n, Object object) throws IOException {
        Object r;
        if ((n & 1) != 0) {
            glob = "*";
        }
        Intrinsics.checkNotNullParameter($this$useDirectoryEntries_u24default, "<this>");
        Intrinsics.checkNotNullParameter(glob, "glob");
        Intrinsics.checkNotNullParameter(block, "block");
        Closeable closeable = Files.newDirectoryStream($this$useDirectoryEntries_u24default, glob);
        object = null;
        try {
            DirectoryStream it = (DirectoryStream)closeable;
            boolean bl = false;
            Intrinsics.checkNotNull(it);
            r = block.invoke(CollectionsKt.asSequence(it));
        }
        catch (Throwable throwable) {
            try {
                object = throwable;
                throw throwable;
            }
            catch (Throwable throwable2) {
                InlineMarker.finallyStart(1);
                if (PlatformImplementationsKt.apiVersionIsAtLeast(1, 1, 0)) {
                    CloseableKt.closeFinally(closeable, (Throwable)object);
                } else if (closeable != null) {
                    if (object == null) {
                        closeable.close();
                    } else {
                        try {
                            closeable.close();
                        }
                        catch (Throwable throwable3) {
                        }
                    }
                }
                InlineMarker.finallyEnd(1);
                throw throwable2;
            }
        }
        InlineMarker.finallyStart(1);
        if (PlatformImplementationsKt.apiVersionIsAtLeast(1, 1, 0)) {
            CloseableKt.closeFinally(closeable, (Throwable)object);
        } else if (closeable != null) {
            closeable.close();
        }
        InlineMarker.finallyEnd(1);
        return r;
    }

    @SinceKotlin(version="1.5")
    @InlineOnly
    @WasExperimental(markerClass={ExperimentalPathApi.class})
    private static final boolean isRegularFile(Path $this$isRegularFile, LinkOption ... options) {
        Intrinsics.checkNotNullParameter($this$isRegularFile, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        return Files.isRegularFile($this$isRegularFile, Arrays.copyOf(options, options.length));
    }

    private static final String getInvariantSeparatorsPath(Path $this$invariantSeparatorsPath) {
        Intrinsics.checkNotNullParameter($this$invariantSeparatorsPath, "<this>");
        return PathsKt.getInvariantSeparatorsPathString($this$invariantSeparatorsPath);
    }

    static /* synthetic */ Path createTempFile$default(String prefix, String suffix, FileAttribute[] attributes, int n, Object object) throws IOException {
        if ((n & 1) != 0) {
            prefix = null;
        }
        if ((n & 2) != 0) {
            suffix = null;
        }
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Path path = Files.createTempFile(prefix, suffix, Arrays.copyOf(attributes, attributes.length));
        Intrinsics.checkNotNullExpressionValue(path, "createTempFile(...)");
        return path;
    }

    public static /* synthetic */ void visitFileTree$default(Path path, FileVisitor fileVisitor, int n, boolean bl, int n2, Object object) {
        if ((n2 & 2) != 0) {
            n = Integer.MAX_VALUE;
        }
        if ((n2 & 4) != 0) {
            bl = false;
        }
        PathsKt.visitFileTree(path, fileVisitor, n, bl);
    }

    @InlineOnly
    @WasExperimental(markerClass={ExperimentalPathApi.class})
    @SinceKotlin(version="1.5")
    private static final Path createSymbolicLinkPointingTo(Path $this$createSymbolicLinkPointingTo, Path target, FileAttribute<?> ... attributes) throws IOException {
        Intrinsics.checkNotNullParameter($this$createSymbolicLinkPointingTo, "<this>");
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Path path = Files.createSymbolicLink($this$createSymbolicLinkPointingTo, target, Arrays.copyOf(attributes, attributes.length));
        Intrinsics.checkNotNullExpressionValue(path, "createSymbolicLink(...)");
        return path;
    }

    @WasExperimental(markerClass={ExperimentalPathApi.class})
    @SinceKotlin(version="1.5")
    @InlineOnly
    private static final Path toPath(URI $this$toPath) {
        Intrinsics.checkNotNullParameter($this$toPath, "<this>");
        Path path = Paths.get($this$toPath);
        Intrinsics.checkNotNullExpressionValue(path, "get(...)");
        return path;
    }

    @WasExperimental(markerClass={ExperimentalPathApi.class})
    @SinceKotlin(version="1.5")
    @InlineOnly
    private static final Path createDirectory(Path $this$createDirectory, FileAttribute<?> ... attributes) throws IOException {
        Intrinsics.checkNotNullParameter($this$createDirectory, "<this>");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Path path = Files.createDirectory($this$createDirectory, Arrays.copyOf(attributes, attributes.length));
        Intrinsics.checkNotNullExpressionValue(path, "createDirectory(...)");
        return path;
    }

    static /* synthetic */ Path createTempDirectory$default(String prefix, FileAttribute[] attributes, int n, Object object) throws IOException {
        if ((n & 1) != 0) {
            prefix = null;
        }
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Path path = Files.createTempDirectory(prefix, Arrays.copyOf(attributes, attributes.length));
        Intrinsics.checkNotNullExpressionValue(path, "createTempDirectory(...)");
        return path;
    }

    @WasExperimental(markerClass={ExperimentalPathApi.class})
    @SinceKotlin(version="1.5")
    @InlineOnly
    private static final Path div(Path $this$div, Path other) {
        Intrinsics.checkNotNullParameter($this$div, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Path path = $this$div.resolve(other);
        Intrinsics.checkNotNullExpressionValue(path, "resolve(...)");
        return path;
    }

    @WasExperimental(markerClass={ExperimentalPathApi.class})
    @SinceKotlin(version="1.5")
    @InlineOnly
    private static final boolean isSameFileAs(Path $this$isSameFileAs, Path other) throws IOException {
        Intrinsics.checkNotNullParameter($this$isSameFileAs, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return Files.isSameFile($this$isSameFileAs, other);
    }

    /*
     * WARNING - void declaration
     */
    static /* synthetic */ Path copyTo$default(Path $this$copyTo_u24default, Path target, boolean overwrite, int n, Object copyOptionArray) throws IOException {
        CopyOption[] copyOptionArray2;
        if ((n & 2) != 0) {
            overwrite = false;
        }
        Intrinsics.checkNotNullParameter($this$copyTo_u24default, "<this>");
        Intrinsics.checkNotNullParameter(target, "target");
        if (overwrite) {
            void $i$f$emptyArray;
            copyOptionArray = new CopyOption[1];
            copyOptionArray[0] = StandardCopyOption.REPLACE_EXISTING;
            copyOptionArray2 = $i$f$emptyArray;
        } else {
            boolean bl = false;
            copyOptionArray2 = new CopyOption[]{};
        }
        CopyOption[] options = copyOptionArray2;
        Path path = Files.copy($this$copyTo_u24default, target, Arrays.copyOf(options, options.length));
        Intrinsics.checkNotNullExpressionValue(path, "copy(...)");
        return path;
    }

    @InlineOnly
    @SinceKotlin(version="1.5")
    @WasExperimental(markerClass={ExperimentalPathApi.class})
    private static final Path copyTo(Path $this$copyTo, Path target, boolean overwrite) throws IOException {
        CopyOption[] copyOptionArray;
        Intrinsics.checkNotNullParameter($this$copyTo, "<this>");
        Intrinsics.checkNotNullParameter(target, "target");
        if (overwrite) {
            CopyOption[] copyOptionArray2 = new CopyOption[1];
            copyOptionArray2[0] = StandardCopyOption.REPLACE_EXISTING;
            copyOptionArray = copyOptionArray2;
        } else {
            boolean $i$f$emptyArray = false;
            copyOptionArray = new CopyOption[]{};
        }
        CopyOption[] options = copyOptionArray;
        Path path = Files.copy($this$copyTo, target, Arrays.copyOf(options, options.length));
        Intrinsics.checkNotNullExpressionValue(path, "copy(...)");
        return path;
    }

    @SinceKotlin(version="1.5")
    @WasExperimental(markerClass={ExperimentalPathApi.class})
    @InlineOnly
    private static final /* synthetic */ <V extends FileAttributeView> V fileAttributesView(Path $this$fileAttributesView, LinkOption ... options) {
        Intrinsics.checkNotNullParameter($this$fileAttributesView, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.reifiedOperationMarker(4, "V");
        FileAttributeView fileAttributeView = Files.getFileAttributeView($this$fileAttributesView, FileAttributeView.class, Arrays.copyOf(options, options.length));
        if (fileAttributeView == null) {
            Intrinsics.reifiedOperationMarker(4, "V");
            PathsKt.fileAttributeViewNotAvailable($this$fileAttributesView, FileAttributeView.class);
            throw new KotlinNothingValueException();
        }
        return (V)fileAttributeView;
    }

    @NotNull
    public static final String getInvariantSeparatorsPathString(@NotNull Path $this$invariantSeparatorsPathString) {
        String string;
        Intrinsics.checkNotNullParameter($this$invariantSeparatorsPathString, "<this>");
        String separator = $this$invariantSeparatorsPathString.getFileSystem().getSeparator();
        if (!Intrinsics.areEqual(separator, "/")) {
            String string2 = ((Object)$this$invariantSeparatorsPathString).toString();
            Intrinsics.checkNotNull(separator);
            string = StringsKt.replace$default(string2, separator, "/", false, 4, null);
        } else {
            Path path;
            string = ((Object)path).toString();
        }
        return string;
    }

    @InlineOnly
    @SinceKotlin(version="1.5")
    @WasExperimental(markerClass={ExperimentalPathApi.class})
    private static final Path createTempFile(String prefix, String suffix, FileAttribute<?> ... attributes) throws IOException {
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Path path = Files.createTempFile(prefix, suffix, Arrays.copyOf(attributes, attributes.length));
        Intrinsics.checkNotNullExpressionValue(path, "createTempFile(...)");
        return path;
    }

    @WasExperimental(markerClass={ExperimentalPathApi.class})
    @SinceKotlin(version="1.5")
    @InlineOnly
    private static final void deleteExisting(Path $this$deleteExisting) throws IOException {
        Intrinsics.checkNotNullParameter($this$deleteExisting, "<this>");
        Files.delete($this$deleteExisting);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @SinceKotlin(version="1.5")
    @InlineOnly
    @WasExperimental(markerClass={ExperimentalPathApi.class})
    private static final void forEachDirectoryEntry(Path $this$forEachDirectoryEntry, String glob, Function1<? super Path, Unit> action) throws IOException {
        Intrinsics.checkNotNullParameter($this$forEachDirectoryEntry, "<this>");
        Intrinsics.checkNotNullParameter(glob, "glob");
        Intrinsics.checkNotNullParameter(action, "action");
        Closeable closeable = Files.newDirectoryStream($this$forEachDirectoryEntry, glob);
        Throwable throwable = null;
        try {
            DirectoryStream it = (DirectoryStream)closeable;
            boolean bl = false;
            Intrinsics.checkNotNull(it);
            Iterable $this$forEach$iv = it;
            boolean $i$f$forEach = false;
            for (Object element$iv : $this$forEach$iv) {
                action.invoke((Path)element$iv);
            }
            Unit unit = Unit.INSTANCE;
        }
        catch (Throwable throwable2) {
            try {
                throwable = throwable2;
                throw throwable2;
            }
            catch (Throwable throwable3) {
                InlineMarker.finallyStart(1);
                if (PlatformImplementationsKt.apiVersionIsAtLeast(1, 1, 0)) {
                    CloseableKt.closeFinally(closeable, throwable);
                } else if (closeable != null) {
                    if (throwable == null) {
                        closeable.close();
                    } else {
                        try {
                            closeable.close();
                        }
                        catch (Throwable throwable4) {
                        }
                    }
                }
                InlineMarker.finallyEnd(1);
                throw throwable3;
            }
        }
        InlineMarker.finallyStart(1);
        if (PlatformImplementationsKt.apiVersionIsAtLeast(1, 1, 0)) {
            CloseableKt.closeFinally(closeable, throwable);
        } else if (closeable != null) {
            closeable.close();
        }
        InlineMarker.finallyEnd(1);
    }

    @WasExperimental(markerClass={ExperimentalPathApi.class})
    @InlineOnly
    @SinceKotlin(version="1.5")
    private static final boolean isHidden(Path $this$isHidden) throws IOException {
        Intrinsics.checkNotNullParameter($this$isHidden, "<this>");
        return Files.isHidden($this$isHidden);
    }

    /*
     * WARNING - void declaration
     */
    static /* synthetic */ Path moveTo$default(Path $this$moveTo_u24default, Path target, boolean overwrite, int n, Object copyOptionArray) throws IOException {
        CopyOption[] copyOptionArray2;
        if ((n & 2) != 0) {
            overwrite = false;
        }
        Intrinsics.checkNotNullParameter($this$moveTo_u24default, "<this>");
        Intrinsics.checkNotNullParameter(target, "target");
        if (overwrite) {
            void $i$f$emptyArray;
            copyOptionArray = new CopyOption[1];
            copyOptionArray[0] = StandardCopyOption.REPLACE_EXISTING;
            copyOptionArray2 = $i$f$emptyArray;
        } else {
            boolean bl = false;
            copyOptionArray2 = new CopyOption[]{};
        }
        CopyOption[] options = copyOptionArray2;
        Path path = Files.move($this$moveTo_u24default, target, Arrays.copyOf(options, options.length));
        Intrinsics.checkNotNullExpressionValue(path, "move(...)");
        return path;
    }

    public static /* synthetic */ Path createTempFile$default(Path path, String string, String string2, FileAttribute[] fileAttributeArray, int n, Object object) throws IOException {
        if ((n & 2) != 0) {
            string = null;
        }
        if ((n & 4) != 0) {
            string2 = null;
        }
        return PathsKt.createTempFile(path, string, string2, fileAttributeArray);
    }

    @WasExperimental(markerClass={ExperimentalPathApi.class})
    @SinceKotlin(version="1.5")
    @InlineOnly
    private static final Path Path(String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        Path path2 = Paths.get(path, new String[0]);
        Intrinsics.checkNotNullExpressionValue(path2, "get(...)");
        return path2;
    }

    @InlineOnly
    @WasExperimental(markerClass={ExperimentalPathApi.class})
    @SinceKotlin(version="1.5")
    private static final boolean deleteIfExists(Path $this$deleteIfExists) throws IOException {
        Intrinsics.checkNotNullParameter($this$deleteIfExists, "<this>");
        return Files.deleteIfExists($this$deleteIfExists);
    }

    @WasExperimental(markerClass={ExperimentalPathApi.class})
    @SinceKotlin(version="1.5")
    @InlineOnly
    private static final boolean isExecutable(Path $this$isExecutable) {
        Intrinsics.checkNotNullParameter($this$isExecutable, "<this>");
        return Files.isExecutable($this$isExecutable);
    }

    @WasExperimental(markerClass={ExperimentalPathApi.class})
    @SinceKotlin(version="1.5")
    public static /* synthetic */ void getNameWithoutExtension$annotations(Path path) {
    }

    @InlineOnly
    @SinceKotlin(version="1.5")
    @WasExperimental(markerClass={ExperimentalPathApi.class})
    private static final boolean isWritable(Path $this$isWritable) {
        Intrinsics.checkNotNullParameter($this$isWritable, "<this>");
        return Files.isWritable($this$isWritable);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @WasExperimental(markerClass={ExperimentalPathApi.class})
    @SinceKotlin(version="1.5")
    @InlineOnly
    private static final <T> T useDirectoryEntries(Path $this$useDirectoryEntries, String glob, Function1<? super Sequence<? extends Path>, ? extends T> block) throws IOException {
        T t;
        Intrinsics.checkNotNullParameter($this$useDirectoryEntries, "<this>");
        Intrinsics.checkNotNullParameter(glob, "glob");
        Intrinsics.checkNotNullParameter(block, "block");
        Closeable closeable = Files.newDirectoryStream($this$useDirectoryEntries, glob);
        Throwable throwable = null;
        try {
            DirectoryStream it = (DirectoryStream)closeable;
            boolean bl = false;
            Intrinsics.checkNotNull(it);
            t = block.invoke(CollectionsKt.asSequence(it));
        }
        catch (Throwable throwable2) {
            try {
                throwable = throwable2;
                throw throwable2;
            }
            catch (Throwable throwable3) {
                InlineMarker.finallyStart(1);
                if (PlatformImplementationsKt.apiVersionIsAtLeast(1, 1, 0)) {
                    CloseableKt.closeFinally(closeable, throwable);
                } else if (closeable != null) {
                    if (throwable == null) {
                        closeable.close();
                    } else {
                        try {
                            closeable.close();
                        }
                        catch (Throwable throwable4) {
                        }
                    }
                }
                InlineMarker.finallyEnd(1);
                throw throwable3;
            }
        }
        InlineMarker.finallyStart(1);
        if (PlatformImplementationsKt.apiVersionIsAtLeast(1, 1, 0)) {
            CloseableKt.closeFinally(closeable, throwable);
        } else if (closeable != null) {
            closeable.close();
        }
        InlineMarker.finallyEnd(1);
        return t;
    }

    @InlineOnly
    @WasExperimental(markerClass={ExperimentalPathApi.class})
    @SinceKotlin(version="1.5")
    private static final Path moveTo(Path $this$moveTo, Path target, boolean overwrite) throws IOException {
        CopyOption[] copyOptionArray;
        Intrinsics.checkNotNullParameter($this$moveTo, "<this>");
        Intrinsics.checkNotNullParameter(target, "target");
        if (overwrite) {
            CopyOption[] copyOptionArray2 = new CopyOption[1];
            copyOptionArray2[0] = StandardCopyOption.REPLACE_EXISTING;
            copyOptionArray = copyOptionArray2;
        } else {
            boolean $i$f$emptyArray = false;
            copyOptionArray = new CopyOption[]{};
        }
        CopyOption[] options = copyOptionArray;
        Path path = Files.move($this$moveTo, target, Arrays.copyOf(options, options.length));
        Intrinsics.checkNotNullExpressionValue(path, "move(...)");
        return path;
    }

    @SinceKotlin(version="1.7")
    @NotNull
    @ExperimentalPathApi
    public static final Sequence<Path> walk(@NotNull Path $this$walk, PathWalkOption ... options) {
        Intrinsics.checkNotNullParameter($this$walk, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        return new PathTreeWalk($this$walk, options);
    }

    @SinceKotlin(version="1.5")
    @WasExperimental(markerClass={ExperimentalPathApi.class})
    @InlineOnly
    private static final /* synthetic */ <A extends BasicFileAttributes> A readAttributes(Path $this$readAttributes, LinkOption ... options) throws IOException {
        Intrinsics.checkNotNullParameter($this$readAttributes, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.reifiedOperationMarker(4, "A");
        BasicFileAttributes basicFileAttributes = Files.readAttributes($this$readAttributes, BasicFileAttributes.class, Arrays.copyOf(options, options.length));
        Intrinsics.checkNotNullExpressionValue(basicFileAttributes, "readAttributes(...)");
        return (A)basicFileAttributes;
    }

    @WasExperimental(markerClass={ExperimentalPathApi.class})
    @NotNull
    @SinceKotlin(version="1.5")
    public static final Path relativeToOrSelf(@NotNull Path $this$relativeToOrSelf, @NotNull Path base) {
        Intrinsics.checkNotNullParameter($this$relativeToOrSelf, "<this>");
        Intrinsics.checkNotNullParameter(base, "base");
        Path path = PathsKt.relativeToOrNull($this$relativeToOrSelf, base);
        if (path == null) {
            path = $this$relativeToOrSelf;
        }
        return path;
    }

    /*
     * WARNING - void declaration
     */
    @NotNull
    @SinceKotlin(version="1.9")
    public static final Path createParentDirectories(@NotNull Path $this$createParentDirectories, FileAttribute<?> ... attributes) throws IOException {
        Path path;
        block4: {
            Intrinsics.checkNotNullParameter($this$createParentDirectories, "<this>");
            Intrinsics.checkNotNullParameter(attributes, "attributes");
            path = $this$createParentDirectories;
            Path it = path;
            boolean bl = false;
            Path parent = it.getParent();
            if (parent != null) {
                LinkOption[] linkOptionArray = new LinkOption[]{};
                if (!Files.isDirectory(parent, Arrays.copyOf(linkOptionArray, linkOptionArray.length))) {
                    try {
                        FileAttribute<?>[] fileAttributeArray = Arrays.copyOf(attributes, attributes.length);
                        Intrinsics.checkNotNullExpressionValue(Files.createDirectories(parent, Arrays.copyOf(fileAttributeArray, fileAttributeArray.length)), "createDirectories(...)");
                    }
                    catch (FileAlreadyExistsException e) {
                        void var6_6;
                        LinkOption[] linkOptionArray2 = new LinkOption[]{};
                        if (Files.isDirectory(parent, Arrays.copyOf(linkOptionArray2, linkOptionArray2.length))) break block4;
                        throw var6_6;
                    }
                }
            }
        }
        return path;
    }

    @InlineOnly
    @SinceKotlin(version="1.5")
    @WasExperimental(markerClass={ExperimentalPathApi.class})
    private static final Path setLastModifiedTime(Path $this$setLastModifiedTime, FileTime value) throws IOException {
        Intrinsics.checkNotNullParameter($this$setLastModifiedTime, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        Path path = Files.setLastModifiedTime($this$setLastModifiedTime, value);
        Intrinsics.checkNotNullExpressionValue(path, "setLastModifiedTime(...)");
        return path;
    }

    @InlineOnly
    @SinceKotlin(version="1.5")
    @WasExperimental(markerClass={ExperimentalPathApi.class})
    private static final Object getAttribute(Path $this$getAttribute, String attribute, LinkOption ... options) throws IOException {
        Intrinsics.checkNotNullParameter($this$getAttribute, "<this>");
        Intrinsics.checkNotNullParameter(attribute, "attribute");
        Intrinsics.checkNotNullParameter(options, "options");
        return Files.getAttribute($this$getAttribute, attribute, Arrays.copyOf(options, options.length));
    }

    @InlineOnly
    @SinceKotlin(version="1.5")
    @WasExperimental(markerClass={ExperimentalPathApi.class})
    private static final String absolutePathString(Path $this$absolutePathString) {
        Intrinsics.checkNotNullParameter($this$absolutePathString, "<this>");
        return ((Object)$this$absolutePathString.toAbsolutePath()).toString();
    }

    @ExperimentalPathApi
    @SinceKotlin(version="1.7")
    public static final void visitFileTree(@NotNull Path $this$visitFileTree, @NotNull FileVisitor<Path> visitor, int maxDepth, boolean followLinks) {
        Intrinsics.checkNotNullParameter($this$visitFileTree, "<this>");
        Intrinsics.checkNotNullParameter(visitor, "visitor");
        Set<FileVisitOption> options = followLinks ? SetsKt.setOf(FileVisitOption.FOLLOW_LINKS) : SetsKt.emptySet();
        Files.walkFileTree($this$visitFileTree, options, maxDepth, visitor);
    }

    @SinceKotlin(version="1.5")
    @InlineOnly
    @WasExperimental(markerClass={ExperimentalPathApi.class})
    private static final Path readSymbolicLink(Path $this$readSymbolicLink) throws IOException {
        Intrinsics.checkNotNullParameter($this$readSymbolicLink, "<this>");
        Path path = Files.readSymbolicLink($this$readSymbolicLink);
        Intrinsics.checkNotNullExpressionValue(path, "readSymbolicLink(...)");
        return path;
    }

    @InlineOnly
    @SinceKotlin(version="1.5")
    @WasExperimental(markerClass={ExperimentalPathApi.class})
    private static final boolean isSymbolicLink(Path $this$isSymbolicLink) {
        Intrinsics.checkNotNullParameter($this$isSymbolicLink, "<this>");
        return Files.isSymbolicLink($this$isSymbolicLink);
    }

    @NotNull
    public static final String getNameWithoutExtension(@NotNull Path $this$nameWithoutExtension) {
        Object object;
        block3: {
            block2: {
                Intrinsics.checkNotNullParameter($this$nameWithoutExtension, "<this>");
                object = $this$nameWithoutExtension.getFileName();
                if (object == null || (object = object.toString()) == null) break block2;
                if ((object = StringsKt.substringBeforeLast$default((String)object, ".", null, 2, null)) != null) break block3;
            }
            object = "";
        }
        return object;
    }

    @NotNull
    public static final String getName(@NotNull Path $this$name) {
        Intrinsics.checkNotNullParameter($this$name, "<this>");
        Path path = $this$name.getFileName();
        String string = path != null ? ((Object)path).toString() : null;
        String string2 = string;
        if (string == null) {
            string2 = "";
        }
        return string2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    static /* synthetic */ void forEachDirectoryEntry$default(Path $this$forEachDirectoryEntry_u24default, String glob, Function1 action, int n, Object object) throws IOException {
        if ((n & 1) != 0) {
            glob = "*";
        }
        Intrinsics.checkNotNullParameter($this$forEachDirectoryEntry_u24default, "<this>");
        Intrinsics.checkNotNullParameter(glob, "glob");
        Intrinsics.checkNotNullParameter(action, "action");
        Closeable closeable = Files.newDirectoryStream($this$forEachDirectoryEntry_u24default, glob);
        object = null;
        try {
            DirectoryStream it = (DirectoryStream)closeable;
            boolean bl = false;
            Intrinsics.checkNotNull(it);
            Iterable $this$forEach$iv = it;
            boolean $i$f$forEach = false;
            for (Object element$iv : $this$forEach$iv) {
                void var10_14;
                action.invoke(var10_14);
            }
            Unit unit = Unit.INSTANCE;
        }
        catch (Throwable throwable) {
            try {
                object = throwable;
                throw throwable;
            }
            catch (Throwable throwable2) {
                InlineMarker.finallyStart(1);
                if (PlatformImplementationsKt.apiVersionIsAtLeast(1, 1, 0)) {
                    CloseableKt.closeFinally(closeable, (Throwable)object);
                } else if (closeable != null) {
                    if (object == null) {
                        closeable.close();
                    } else {
                        try {
                            closeable.close();
                        }
                        catch (Throwable throwable3) {
                        }
                    }
                }
                InlineMarker.finallyEnd(1);
                throw throwable2;
            }
        }
        InlineMarker.finallyStart(1);
        if (PlatformImplementationsKt.apiVersionIsAtLeast(1, 1, 0)) {
            CloseableKt.closeFinally(closeable, (Throwable)object);
        } else if (closeable != null) {
            closeable.close();
        }
        InlineMarker.finallyEnd(1);
    }

    @WasExperimental(markerClass={ExperimentalPathApi.class})
    @SinceKotlin(version="1.5")
    @InlineOnly
    private static final Map<String, Object> readAttributes(Path $this$readAttributes, String attributes, LinkOption ... options) throws IOException {
        Intrinsics.checkNotNullParameter($this$readAttributes, "<this>");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Intrinsics.checkNotNullParameter(options, "options");
        Map<String, Object> map = Files.readAttributes($this$readAttributes, attributes, Arrays.copyOf(options, options.length));
        Intrinsics.checkNotNullExpressionValue(map, "readAttributes(...)");
        return map;
    }

    @SinceKotlin(version="1.5")
    @InlineOnly
    @WasExperimental(markerClass={ExperimentalPathApi.class})
    private static final Set<PosixFilePermission> getPosixFilePermissions(Path $this$getPosixFilePermissions, LinkOption ... options) throws IOException {
        Intrinsics.checkNotNullParameter($this$getPosixFilePermissions, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        Set<PosixFilePermission> set = Files.getPosixFilePermissions($this$getPosixFilePermissions, Arrays.copyOf(options, options.length));
        Intrinsics.checkNotNullExpressionValue(set, "getPosixFilePermissions(...)");
        return set;
    }

    @NotNull
    @WasExperimental(markerClass={ExperimentalPathApi.class})
    @SinceKotlin(version="1.5")
    public static final Path relativeTo(@NotNull Path $this$relativeTo, @NotNull Path base) {
        Path path;
        Intrinsics.checkNotNullParameter($this$relativeTo, "<this>");
        Intrinsics.checkNotNullParameter(base, "base");
        try {
            path = PathRelativizer.INSTANCE.tryRelativeTo($this$relativeTo, base);
        }
        catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(e.getMessage() + "\nthis path: " + $this$relativeTo + "\nbase path: " + base, e);
        }
        return path;
    }

    @NotNull
    public static final String getExtension(@NotNull Path $this$extension) {
        Intrinsics.checkNotNullParameter($this$extension, "<this>");
        Object object = $this$extension.getFileName();
        if (object == null || (object = object.toString()) == null || (object = StringsKt.substringAfterLast((String)object, '.', "")) == null) {
            object = "";
        }
        return object;
    }

    @WasExperimental(markerClass={ExperimentalPathApi.class})
    @SinceKotlin(version="1.5")
    @InlineOnly
    private static final UserPrincipal getOwner(Path $this$getOwner, LinkOption ... options) throws IOException {
        Intrinsics.checkNotNullParameter($this$getOwner, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        return Files.getOwner($this$getOwner, Arrays.copyOf(options, options.length));
    }

    @SinceKotlin(version="1.5")
    @WasExperimental(markerClass={ExperimentalPathApi.class})
    public static /* synthetic */ void getExtension$annotations(Path path) {
    }

    @InlineOnly
    @WasExperimental(markerClass={ExperimentalPathApi.class})
    @SinceKotlin(version="1.5")
    private static final Path createFile(Path $this$createFile, FileAttribute<?> ... attributes) throws IOException {
        Intrinsics.checkNotNullParameter($this$createFile, "<this>");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Path path = Files.createFile($this$createFile, Arrays.copyOf(attributes, attributes.length));
        Intrinsics.checkNotNullExpressionValue(path, "createFile(...)");
        return path;
    }

    @WasExperimental(markerClass={ExperimentalPathApi.class})
    @SinceKotlin(version="1.5")
    @InlineOnly
    private static final boolean isDirectory(Path $this$isDirectory, LinkOption ... options) {
        Intrinsics.checkNotNullParameter($this$isDirectory, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        return Files.isDirectory($this$isDirectory, Arrays.copyOf(options, options.length));
    }

    @SinceKotlin(version="1.5")
    @NotNull
    @WasExperimental(markerClass={ExperimentalPathApi.class})
    public static final Path createTempDirectory(@Nullable Path directory, @Nullable String prefix, FileAttribute<?> ... attributes) throws IOException {
        Path path;
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        if (directory != null) {
            Path path2 = Files.createTempDirectory(directory, prefix, Arrays.copyOf(attributes, attributes.length));
            path = path2;
            Intrinsics.checkNotNullExpressionValue(path2, "createTempDirectory(...)");
        } else {
            Path path3 = Files.createTempDirectory(prefix, Arrays.copyOf(attributes, attributes.length));
            path = path3;
            Intrinsics.checkNotNullExpressionValue(path3, "createTempDirectory(...)");
        }
        return path;
    }

    @InlineOnly
    @WasExperimental(markerClass={ExperimentalPathApi.class})
    @SinceKotlin(version="1.5")
    private static final Path setOwner(Path $this$setOwner, UserPrincipal value) throws IOException {
        Intrinsics.checkNotNullParameter($this$setOwner, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        Path path = Files.setOwner($this$setOwner, value);
        Intrinsics.checkNotNullExpressionValue(path, "setOwner(...)");
        return path;
    }

    public static /* synthetic */ void visitFileTree$default(Path path, int n, boolean bl, Function1 function1, int n2, Object object) {
        if ((n2 & 1) != 0) {
            n = Integer.MAX_VALUE;
        }
        if ((n2 & 2) != 0) {
            bl = false;
        }
        PathsKt.visitFileTree(path, n, bl, function1);
    }

    @SinceKotlin(version="1.5")
    @WasExperimental(markerClass={ExperimentalPathApi.class})
    @Nullable
    public static final Path relativeToOrNull(@NotNull Path $this$relativeToOrNull, @NotNull Path base) {
        Path path;
        Intrinsics.checkNotNullParameter($this$relativeToOrNull, "<this>");
        Intrinsics.checkNotNullParameter(base, "base");
        try {
            path = PathRelativizer.INSTANCE.tryRelativeTo($this$relativeToOrNull, base);
        }
        catch (IllegalArgumentException e) {
            path = null;
        }
        return path;
    }

    @InlineOnly
    @WasExperimental(markerClass={ExperimentalPathApi.class})
    @SinceKotlin(version="1.5")
    private static final Path moveTo(Path $this$moveTo, Path target, CopyOption ... options) throws IOException {
        Intrinsics.checkNotNullParameter($this$moveTo, "<this>");
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(options, "options");
        Path path = Files.move($this$moveTo, target, Arrays.copyOf(options, options.length));
        Intrinsics.checkNotNullExpressionValue(path, "move(...)");
        return path;
    }

    @WasExperimental(markerClass={ExperimentalPathApi.class})
    @InlineOnly
    @SinceKotlin(version="1.5")
    private static final Path absolute(Path $this$absolute) {
        Intrinsics.checkNotNullParameter($this$absolute, "<this>");
        Path path = $this$absolute.toAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(path, "toAbsolutePath(...)");
        return path;
    }

    @PublishedApi
    @NotNull
    public static final Void fileAttributeViewNotAvailable(@NotNull Path path, @NotNull Class<?> attributeViewClass) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(attributeViewClass, "attributeViewClass");
        throw new UnsupportedOperationException("The desired attribute view type " + attributeViewClass + " is not available for the file " + path + '.');
    }

    @WasExperimental(markerClass={ExperimentalPathApi.class})
    @SinceKotlin(version="1.5")
    @InlineOnly
    private static final long fileSize(Path $this$fileSize) throws IOException {
        Intrinsics.checkNotNullParameter($this$fileSize, "<this>");
        return Files.size($this$fileSize);
    }

    @SinceKotlin(version="1.5")
    @WasExperimental(markerClass={ExperimentalPathApi.class})
    @InlineOnly
    private static final Path setAttribute(Path $this$setAttribute, String attribute, Object value, LinkOption ... options) throws IOException {
        Intrinsics.checkNotNullParameter($this$setAttribute, "<this>");
        Intrinsics.checkNotNullParameter(attribute, "attribute");
        Intrinsics.checkNotNullParameter(options, "options");
        Path path = Files.setAttribute($this$setAttribute, attribute, value, Arrays.copyOf(options, options.length));
        Intrinsics.checkNotNullExpressionValue(path, "setAttribute(...)");
        return path;
    }

    @InlineOnly
    @SinceKotlin(version="1.5")
    @WasExperimental(markerClass={ExperimentalPathApi.class})
    private static final boolean isReadable(Path $this$isReadable) {
        Intrinsics.checkNotNullParameter($this$isReadable, "<this>");
        return Files.isReadable($this$isReadable);
    }

    @SinceKotlin(version="1.5")
    @WasExperimental(markerClass={ExperimentalPathApi.class})
    @NotNull
    public static final Path createTempFile(@Nullable Path directory, @Nullable String prefix, @Nullable String suffix, FileAttribute<?> ... attributes) throws IOException {
        Path path;
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        if (directory != null) {
            Path path2 = Files.createTempFile(directory, prefix, suffix, Arrays.copyOf(attributes, attributes.length));
            path = path2;
            Intrinsics.checkNotNullExpressionValue(path2, "createTempFile(...)");
        } else {
            Path path3 = Files.createTempFile(prefix, suffix, Arrays.copyOf(attributes, attributes.length));
            path = path3;
            Intrinsics.checkNotNullExpressionValue(path3, "createTempFile(...)");
        }
        return path;
    }

    @WasExperimental(markerClass={ExperimentalPathApi.class})
    @SinceKotlin(version="1.5")
    @InlineOnly
    public static /* synthetic */ void getPathString$annotations(Path path) {
    }

    @InlineOnly
    @SinceKotlin(version="1.5")
    @WasExperimental(markerClass={ExperimentalPathApi.class})
    private static final boolean notExists(Path $this$notExists, LinkOption ... options) {
        Intrinsics.checkNotNullParameter($this$notExists, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        return Files.notExists($this$notExists, Arrays.copyOf(options, options.length));
    }

    @SinceKotlin(version="1.5")
    @InlineOnly
    @WasExperimental(markerClass={ExperimentalPathApi.class})
    private static final FileStore fileStore(Path $this$fileStore) throws IOException {
        Intrinsics.checkNotNullParameter($this$fileStore, "<this>");
        FileStore fileStore = Files.getFileStore($this$fileStore);
        Intrinsics.checkNotNullExpressionValue(fileStore, "getFileStore(...)");
        return fileStore;
    }

    @WasExperimental(markerClass={ExperimentalPathApi.class})
    @InlineOnly
    @SinceKotlin(version="1.5")
    private static final Path div(Path $this$div, String other) {
        Intrinsics.checkNotNullParameter($this$div, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Path path = $this$div.resolve(other);
        Intrinsics.checkNotNullExpressionValue(path, "resolve(...)");
        return path;
    }

    @InlineOnly
    @SinceKotlin(version="1.5")
    @WasExperimental(markerClass={ExperimentalPathApi.class})
    private static final Path createLinkPointingTo(Path $this$createLinkPointingTo, Path target) throws IOException {
        Intrinsics.checkNotNullParameter($this$createLinkPointingTo, "<this>");
        Intrinsics.checkNotNullParameter(target, "target");
        Path path = Files.createLink($this$createLinkPointingTo, target);
        Intrinsics.checkNotNullExpressionValue(path, "createLink(...)");
        return path;
    }

    @InlineOnly
    @WasExperimental(markerClass={ExperimentalPathApi.class})
    @SinceKotlin(version="1.5")
    private static final FileTime getLastModifiedTime(Path $this$getLastModifiedTime, LinkOption ... options) throws IOException {
        Intrinsics.checkNotNullParameter($this$getLastModifiedTime, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        FileTime fileTime = Files.getLastModifiedTime($this$getLastModifiedTime, Arrays.copyOf(options, options.length));
        Intrinsics.checkNotNullExpressionValue(fileTime, "getLastModifiedTime(...)");
        return fileTime;
    }

    @ExperimentalPathApi
    @SinceKotlin(version="1.7")
    public static final void visitFileTree(@NotNull Path $this$visitFileTree, int maxDepth, boolean followLinks, @NotNull Function1<? super FileVisitorBuilder, Unit> builderAction) {
        Intrinsics.checkNotNullParameter($this$visitFileTree, "<this>");
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        PathsKt.visitFileTree($this$visitFileTree, PathsKt.fileVisitor(builderAction), maxDepth, followLinks);
    }

    @InlineOnly
    @WasExperimental(markerClass={ExperimentalPathApi.class})
    @SinceKotlin(version="1.5")
    private static final boolean exists(Path $this$exists, LinkOption ... options) {
        Intrinsics.checkNotNullParameter($this$exists, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        return Files.exists($this$exists, Arrays.copyOf(options, options.length));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @SinceKotlin(version="1.5")
    @WasExperimental(markerClass={ExperimentalPathApi.class})
    @NotNull
    public static final List<Path> listDirectoryEntries(@NotNull Path $this$listDirectoryEntries, @NotNull String glob) throws IOException {
        List<Path> list;
        Intrinsics.checkNotNullParameter($this$listDirectoryEntries, "<this>");
        Intrinsics.checkNotNullParameter(glob, "glob");
        Closeable closeable = Files.newDirectoryStream($this$listDirectoryEntries, glob);
        Throwable throwable = null;
        try {
            DirectoryStream it = (DirectoryStream)closeable;
            boolean bl = false;
            Intrinsics.checkNotNull(it);
            list = CollectionsKt.toList(it);
        }
        catch (Throwable throwable2) {
            throwable = throwable2;
            throw throwable2;
        }
        finally {
            CloseableKt.closeFinally(closeable, throwable);
        }
        return list;
    }

    @SinceKotlin(version="1.7")
    @NotNull
    @ExperimentalPathApi
    public static final FileVisitor<Path> fileVisitor(@NotNull Function1<? super FileVisitorBuilder, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        FileVisitorBuilderImpl fileVisitorBuilderImpl = new FileVisitorBuilderImpl();
        builderAction.invoke(fileVisitorBuilderImpl);
        return fileVisitorBuilderImpl.build();
    }

    private static final String getPathString(Path $this$pathString) {
        Intrinsics.checkNotNullParameter($this$pathString, "<this>");
        return ((Object)$this$pathString).toString();
    }

    @WasExperimental(markerClass={ExperimentalPathApi.class})
    @SinceKotlin(version="1.5")
    @InlineOnly
    private static final Path createTempDirectory(String prefix, FileAttribute<?> ... attributes) throws IOException {
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Path path = Files.createTempDirectory(prefix, Arrays.copyOf(attributes, attributes.length));
        Intrinsics.checkNotNullExpressionValue(path, "createTempDirectory(...)");
        return path;
    }

    @SinceKotlin(version="1.5")
    @WasExperimental(markerClass={ExperimentalPathApi.class})
    public static /* synthetic */ void getName$annotations(Path path) {
    }

    @SinceKotlin(version="1.5")
    @InlineOnly
    @WasExperimental(markerClass={ExperimentalPathApi.class})
    private static final /* synthetic */ <V extends FileAttributeView> V fileAttributesViewOrNull(Path $this$fileAttributesViewOrNull, LinkOption ... options) {
        Intrinsics.checkNotNullParameter($this$fileAttributesViewOrNull, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.reifiedOperationMarker(4, "V");
        return (V)Files.getFileAttributeView($this$fileAttributesViewOrNull, FileAttributeView.class, Arrays.copyOf(options, options.length));
    }

    @WasExperimental(markerClass={ExperimentalPathApi.class})
    @SinceKotlin(version="1.5")
    public static /* synthetic */ void getInvariantSeparatorsPathString$annotations(Path path) {
    }

    @WasExperimental(markerClass={ExperimentalPathApi.class})
    @InlineOnly
    @SinceKotlin(version="1.5")
    private static final Path copyTo(Path $this$copyTo, Path target, CopyOption ... options) throws IOException {
        Intrinsics.checkNotNullParameter($this$copyTo, "<this>");
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(options, "options");
        Path path = Files.copy($this$copyTo, target, Arrays.copyOf(options, options.length));
        Intrinsics.checkNotNullExpressionValue(path, "copy(...)");
        return path;
    }

    @SinceKotlin(version="1.5")
    @WasExperimental(markerClass={ExperimentalPathApi.class})
    @InlineOnly
    private static final Path setPosixFilePermissions(Path $this$setPosixFilePermissions, Set<? extends PosixFilePermission> value) throws IOException {
        Intrinsics.checkNotNullParameter($this$setPosixFilePermissions, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        Path path = Files.setPosixFilePermissions($this$setPosixFilePermissions, value);
        Intrinsics.checkNotNullExpressionValue(path, "setPosixFilePermissions(...)");
        return path;
    }

    @Deprecated(message="Use invariantSeparatorsPathString property instead.", replaceWith=@ReplaceWith(expression="invariantSeparatorsPathString", imports={}), level=DeprecationLevel.ERROR)
    @SinceKotlin(version="1.4")
    @ExperimentalPathApi
    @InlineOnly
    public static /* synthetic */ void getInvariantSeparatorsPath$annotations(Path path) {
    }
}

