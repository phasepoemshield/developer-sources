/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ru.ocz.protection.annotation.Compile
 */
package kotakbaz.rain.config;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import java.awt.Color;
import java.io.Closeable;
import java.io.File;
import java.io.InputStream;
import java.io.Serializable;
import java.math.BigDecimal;
import java.nio.file.AtomicMoveNotSupportedException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.FileAttribute;
import java.security.MessageDigest;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.HexFormat;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;
import kotakbaz.rain.config.CloudConfigOrigin;
import kotakbaz.rain.config.ConfigInfo;
import kotakbaz.rain.module.Module;
import kotakbaz.rain.module.setting.ModeSetting;
import kotakbaz.rain.module.setting.Setting;
import kotakbaz.rain.module.setting.settings.BindSetting;
import kotakbaz.rain.module.setting.settings.BooleanSetting;
import kotakbaz.rain.module.setting.settings.ColorSetting;
import kotakbaz.rain.module.setting.settings.SliderSetting;
import kotakbaz.rain.module.setting.settings.TextSetting;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.collections.SetsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.io.CloseableKt;
import kotlin.jdk7.AutoCloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KFunction;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import oxxxde.\u0627\u0622;
import oxxxde.\u0627\u062f;
import oxxxde.\u062a\u0625;
import oxxxde.\u062b\u0632;
import oxxxde.\u062e\u064b;
import oxxxde.\u0631\u063a;
import oxxxde.\u0633\u0625;
import oxxxde.\u0633\u0631;
import oxxxde.\u0633\u0651;
import ru.ocz.protection.annotation.Compile;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\u00d4\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b:\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u00c6\u0002\u0018\u00002\u00020\u0001:\f\u00fe\u0001\u00ff\u0001\u0080\u0002\u0081\u0002\u0082\u0002\u0083\u0002B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0004\b\b\u0010\u0007J\u0013\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u00a2\u0006\u0004\b\n\u0010\u0007J\u000f\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0014\u00a2\u0006\u0004\b\u0015\u0010\u0003J\u0017\u0010\u0016\u001a\u00020\u00142\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0005H\u0007\u00a2\u0006\u0004\b\u0018\u0010\u0013J\u0015\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0019\u0010\u0013J\r\u0010\u001a\u001a\u00020\u0014\u00a2\u0006\u0004\b\u001a\u0010\u0003J\r\u0010\u001b\u001a\u00020\u0011\u00a2\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0011\u00a2\u0006\u0004\b\u001d\u0010\u001cJ\r\u0010\u001e\u001a\u00020\u0011\u00a2\u0006\u0004\b\u001e\u0010\u001cJ\u0015\u0010 \u001a\u00020\u001f2\u0006\u0010\u0010\u001a\u00020\u0005\u00a2\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0005H\u0007\u00a2\u0006\u0004\b\"\u0010\u0013J\u0015\u0010#\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0005\u00a2\u0006\u0004\b#\u0010\u0013J\u001d\u0010'\u001a\u00020&2\u0006\u0010$\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u0005\u00a2\u0006\u0004\b'\u0010(J\u0015\u0010)\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0005\u00a2\u0006\u0004\b)\u0010\u0013J\u0015\u0010*\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0005\u00a2\u0006\u0004\b*\u0010\u0013J\u0015\u0010+\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0005\u00a2\u0006\u0004\b+\u0010,J\u0017\u0010/\u001a\u00020\u00052\u0006\u0010.\u001a\u00020-H\u0002\u00a2\u0006\u0004\b/\u00100J\u0015\u00101\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0005\u00a2\u0006\u0004\b1\u0010\u0013J\u0017\u00103\u001a\u0004\u0018\u0001022\u0006\u0010\u0010\u001a\u00020\u0005\u00a2\u0006\u0004\b3\u00104J\u0015\u00105\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0005\u00a2\u0006\u0004\b5\u0010,J\u0017\u00106\u001a\u0004\u0018\u0001022\u0006\u0010\u0010\u001a\u00020\u0005\u00a2\u0006\u0004\b6\u00104J\u001d\u00108\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u00107\u001a\u00020\u0011\u00a2\u0006\u0004\b8\u00109J\u0015\u0010:\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0005\u00a2\u0006\u0004\b:\u0010\u0013J\u0017\u0010<\u001a\u0004\u0018\u00010;2\u0006\u0010\u0010\u001a\u00020\u0005\u00a2\u0006\u0004\b<\u0010=J\u0017\u0010>\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0010\u001a\u00020\u0005\u00a2\u0006\u0004\b>\u0010,J\u0015\u0010@\u001a\u00020\u00052\u0006\u0010?\u001a\u00020;\u00a2\u0006\u0004\b@\u0010AJ\u001d\u0010C\u001a\u00020\u00112\u0006\u0010?\u001a\u00020;2\u0006\u0010B\u001a\u00020\u0005\u00a2\u0006\u0004\bC\u0010DJ7\u0010I\u001a\u0004\u0018\u00010\u00052\u0006\u0010E\u001a\u00020\u00052\u0006\u0010F\u001a\u00020\u00052\u0006\u0010G\u001a\u00020\u00052\u0006\u0010H\u001a\u00020\u00052\u0006\u0010?\u001a\u00020;\u00a2\u0006\u0004\bI\u0010JJK\u0010M\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010G\u001a\u00020\u00052\u0006\u0010F\u001a\u00020\u00052\u0006\u0010H\u001a\u00020\u00052\u0006\u0010K\u001a\u00020\r2\b\b\u0002\u0010L\u001a\u00020\u00052\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\u0004\bM\u0010NJG\u0010O\u001a\u0004\u0018\u00010\u00052\u0006\u0010E\u001a\u00020\u00052\u0006\u0010F\u001a\u00020\u00052\u0006\u0010G\u001a\u00020\u00052\u0006\u0010H\u001a\u00020\u00052\u0006\u0010K\u001a\u00020\r2\u0006\u00107\u001a\u00020\u00112\u0006\u0010?\u001a\u00020;\u00a2\u0006\u0004\bO\u0010PJ7\u0010Q\u001a\u0004\u0018\u00010\u00052\u0006\u0010E\u001a\u00020\u00052\u0006\u0010F\u001a\u00020\u00052\u0006\u0010G\u001a\u00020\u00052\u0006\u0010H\u001a\u00020\u00052\u0006\u0010?\u001a\u00020;\u00a2\u0006\u0004\bQ\u0010JJ\u0017\u0010/\u001a\u00020\u00052\u0006\u0010R\u001a\u00020;H\u0002\u00a2\u0006\u0004\b/\u0010AJ\u0019\u0010S\u001a\u0004\u0018\u0001022\u0006\u0010.\u001a\u00020-H\u0002\u00a2\u0006\u0004\bS\u0010TJ\u0019\u0010S\u001a\u0004\u0018\u0001022\u0006\u0010R\u001a\u00020;H\u0002\u00a2\u0006\u0004\bS\u0010UJ\u0017\u0010W\u001a\u00020;2\u0006\u0010V\u001a\u000202H\u0002\u00a2\u0006\u0004\bW\u0010XJ\u0017\u0010[\u001a\u00020\u00052\u0006\u0010Z\u001a\u00020YH\u0002\u00a2\u0006\u0004\b[\u0010\\J\u0017\u0010]\u001a\u00020\u00052\u0006\u0010E\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\b]\u0010,J\u0017\u0010`\u001a\u00020;2\u0006\u0010_\u001a\u00020^H\u0002\u00a2\u0006\u0004\b`\u0010aJ!\u0010d\u001a\u00020;2\u0010\u0010c\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030b0\u0004H\u0002\u00a2\u0006\u0004\bd\u0010eJ#\u0010h\u001a\u00020;2\u0006\u0010f\u001a\u00020\u00052\n\b\u0002\u0010g\u001a\u0004\u0018\u000102H\u0002\u00a2\u0006\u0004\bh\u0010iJ\u001b\u0010k\u001a\u00020Y2\n\u0010j\u001a\u0006\u0012\u0002\b\u00030bH\u0002\u00a2\u0006\u0004\bk\u0010lJ\u0017\u0010n\u001a\u00020m2\u0006\u0010.\u001a\u00020-H\u0002\u00a2\u0006\u0004\bn\u0010oJ\u0017\u0010p\u001a\u00020\u00052\u0006\u0010.\u001a\u00020-H\u0002\u00a2\u0006\u0004\bp\u00100J\u0017\u0010q\u001a\u00020m2\u0006\u0010R\u001a\u00020;H\u0002\u00a2\u0006\u0004\bq\u0010rJ\u001f\u0010t\u001a\u00020\u00142\u0006\u0010.\u001a\u00020-2\u0006\u0010s\u001a\u00020mH\u0002\u00a2\u0006\u0004\bt\u0010uJ\u0019\u0010w\u001a\u0004\u0018\u00010;2\u0006\u0010v\u001a\u00020;H\u0002\u00a2\u0006\u0004\bw\u0010xJ!\u0010y\u001a\u0004\u0018\u00010;2\u0006\u0010v\u001a\u00020;2\u0006\u0010_\u001a\u00020^H\u0002\u00a2\u0006\u0004\by\u0010zJ'\u0010~\u001a\u00020}2\u0006\u0010_\u001a\u00020^2\u0006\u0010{\u001a\u00020;2\u0006\u0010|\u001a\u00020\rH\u0002\u00a2\u0006\u0004\b~\u0010\u007fJE\u0010\u0081\u0001\u001a\t\u0012\u0005\u0012\u00030\u0080\u00010\u00042\u0010\u0010c\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030b0\u00042\u0006\u0010{\u001a\u00020;2\u0006\u0010|\u001a\u00020\r2\b\u0010_\u001a\u0004\u0018\u00010^H\u0002\u00a2\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001JU\u0010\u0084\u0001\u001a\u0004\u0018\u00010Y2\u0010\u0010c\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030b0\u00042\n\u0010j\u001a\u0006\u0012\u0002\b\u00030b2\u0007\u0010\u0083\u0001\u001a\u00020\r2\u0006\u0010{\u001a\u00020;2\u0006\u0010|\u001a\u00020\r2\b\u0010_\u001a\u0004\u0018\u00010^H\u0002\u00a2\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J-\u0010\u0086\u0001\u001a\u00020\r2\b\u0010_\u001a\u0004\u0018\u00010^2\u0007\u0010\u0083\u0001\u001a\u00020\r2\u0006\u0010{\u001a\u00020;H\u0002\u00a2\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J.\u0010\u0088\u0001\u001a\u00020\u00012\n\u0010j\u001a\u0006\u0012\u0002\b\u00030b2\u0006\u0010Z\u001a\u00020Y2\u0006\u0010|\u001a\u00020\rH\u0002\u00a2\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J+\u0010\u008b\u0001\u001a\u00020\u00052\u0007\u0010j\u001a\u00030\u008a\u00012\u0006\u0010Z\u001a\u00020Y2\u0006\u0010|\u001a\u00020\rH\u0002\u00a2\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001J&\u0010\u0090\u0001\u001a\u00030\u008e\u00012\u0007\u0010j\u001a\u00030\u008d\u00012\b\u0010\u008f\u0001\u001a\u00030\u008e\u0001H\u0002\u00a2\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001J\u001a\u0010\u0092\u0001\u001a\u00020\u00112\u0006\u0010Z\u001a\u00020YH\u0002\u00a2\u0006\u0006\b\u0092\u0001\u0010\u0093\u0001J\u001a\u0010\u0094\u0001\u001a\u00020\r2\u0006\u0010Z\u001a\u00020YH\u0002\u00a2\u0006\u0006\b\u0094\u0001\u0010\u0095\u0001J\u001b\u0010\u0096\u0001\u001a\u00030\u008e\u00012\u0006\u0010Z\u001a\u00020YH\u0002\u00a2\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001J\u0019\u0010\u0098\u0001\u001a\u00020\u00052\u0006\u0010Z\u001a\u00020YH\u0002\u00a2\u0006\u0005\b\u0098\u0001\u0010\\J\u001b\u0010\u009a\u0001\u001a\u00030\u0099\u00012\u0006\u0010Z\u001a\u00020YH\u0002\u00a2\u0006\u0006\b\u009a\u0001\u0010\u009b\u0001J$\u0010\u009c\u0001\u001a\u00020;2\b\u0010Z\u001a\u0004\u0018\u00010Y2\u0006\u0010\u0010\u001a\u00020\u0005H\u0002\u00a2\u0006\u0006\b\u009c\u0001\u0010\u009d\u0001J&\u0010\u00a0\u0001\u001a\u0004\u0018\u00010;2\u0007\u0010\u009e\u0001\u001a\u00020;2\u0007\u0010\u009f\u0001\u001a\u00020\u0005H\u0002\u00a2\u0006\u0006\b\u00a0\u0001\u0010\u00a1\u0001J\u001a\u0010\u00a2\u0001\u001a\u00020\u00142\u0006\u0010s\u001a\u00020mH\u0002\u00a2\u0006\u0006\b\u00a2\u0001\u0010\u00a3\u0001J\u0013\u0010\u00a5\u0001\u001a\u00030\u00a4\u0001H\u0002\u00a2\u0006\u0006\b\u00a5\u0001\u0010\u00a6\u0001J\u001c\u0010\u00a8\u0001\u001a\u00020\u00142\b\u0010\u00a7\u0001\u001a\u00030\u00a4\u0001H\u0002\u00a2\u0006\u0006\b\u00a8\u0001\u0010\u00a9\u0001J\u001e\u0010\u00aa\u0001\u001a\u00020\u00012\n\u0010j\u001a\u0006\u0012\u0002\b\u00030bH\u0002\u00a2\u0006\u0006\b\u00aa\u0001\u0010\u00ab\u0001J\u001c\u0010\u00ad\u0001\u001a\u00020\u00142\b\u0010\u00ac\u0001\u001a\u00030\u0080\u0001H\u0002\u00a2\u0006\u0006\b\u00ad\u0001\u0010\u00ae\u0001J\u0011\u0010\u00af\u0001\u001a\u00020\u0014H\u0002\u00a2\u0006\u0005\b\u00af\u0001\u0010\u0003J-\u0010\u00b1\u0001\u001a\u00020\u00142\u0007\u0010\u00b0\u0001\u001a\u00020\u00052\u0010\u0010c\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030b0\u0004H\u0002\u00a2\u0006\u0006\b\u00b1\u0001\u0010\u00b2\u0001J\u001a\u0010\u00b3\u0001\u001a\u00020\u00052\u0006\u0010_\u001a\u00020^H\u0002\u00a2\u0006\u0006\b\u00b3\u0001\u0010\u00b4\u0001J\u001b\u0010\u00b5\u0001\u001a\u00020\u00052\u0007\u0010\u0083\u0001\u001a\u00020\rH\u0002\u00a2\u0006\u0006\b\u00b5\u0001\u0010\u00b6\u0001J\u0011\u0010\u00b7\u0001\u001a\u00020\u0014H\u0002\u00a2\u0006\u0005\b\u00b7\u0001\u0010\u0003J#\u0010\u00b9\u0001\u001a\u00020\u00142\u0007\u0010\u00b8\u0001\u001a\u00020-2\u0006\u0010v\u001a\u00020\u0005H\u0002\u00a2\u0006\u0006\b\u00b9\u0001\u0010\u00ba\u0001J-\u0010\u00bd\u0001\u001a\u00020\u00142\u0007\u0010\u00bb\u0001\u001a\u00020-2\u0007\u0010\u00b8\u0001\u001a\u00020-2\u0007\u0010\u00bc\u0001\u001a\u00020\u0011H\u0002\u00a2\u0006\u0006\b\u00bd\u0001\u0010\u00be\u0001J\u0011\u0010\u00bf\u0001\u001a\u00020\u0014H\u0002\u00a2\u0006\u0005\b\u00bf\u0001\u0010\u0003J\u001b\u0010\u00c1\u0001\u001a\u00020\u00142\u0007\u0010\u00c0\u0001\u001a\u00020\u0011H\u0002\u00a2\u0006\u0006\b\u00c1\u0001\u0010\u00c2\u0001J\u0017\u0010\u00c3\u0001\u001a\b\u0012\u0004\u0012\u00020\t0\u0004H\u0002\u00a2\u0006\u0005\b\u00c3\u0001\u0010\u0007J\u0011\u0010\u00c4\u0001\u001a\u00020\u0014H\u0002\u00a2\u0006\u0005\b\u00c4\u0001\u0010\u0003J\u001a\u0010\u00c6\u0001\u001a\u00020\u00112\u0007\u0010\u00c5\u0001\u001a\u00020\u0005H\u0002\u00a2\u0006\u0005\b\u00c6\u0001\u0010\u0013J\u0011\u0010\u00c7\u0001\u001a\u00020\u0014H\u0002\u00a2\u0006\u0005\b\u00c7\u0001\u0010\u0003J\u0013\u0010\u00c8\u0001\u001a\u0004\u0018\u00010\u0005H\u0002\u00a2\u0006\u0005\b\u00c8\u0001\u0010\fJ\u0011\u0010\u00c9\u0001\u001a\u00020\u0005H\u0002\u00a2\u0006\u0005\b\u00c9\u0001\u0010\fJ\u0011\u0010\u00ca\u0001\u001a\u00020\u0014H\u0002\u00a2\u0006\u0005\b\u00ca\u0001\u0010\u0003J\u001a\u0010\u00cb\u0001\u001a\u00020\u00142\u0007\u0010\u00c5\u0001\u001a\u00020\u0005H\u0002\u00a2\u0006\u0005\b\u00cb\u0001\u0010\u0017J\u0011\u0010\u00cc\u0001\u001a\u00020\u0014H\u0002\u00a2\u0006\u0005\b\u00cc\u0001\u0010\u0003R\u0017\u0010\u00cd\u0001\u001a\u00020\u00058\u0006X\u0086T\u00a2\u0006\b\n\u0006\b\u00cd\u0001\u0010\u00ce\u0001R\u0017\u0010\u00cf\u0001\u001a\u00020\r8\u0002X\u0082T\u00a2\u0006\b\n\u0006\b\u00cf\u0001\u0010\u00d0\u0001R\u0017\u0010\u00d1\u0001\u001a\u00020\r8\u0002X\u0082T\u00a2\u0006\b\n\u0006\b\u00d1\u0001\u0010\u00d0\u0001R\u0017\u0010\u00d2\u0001\u001a\u00020\u00058\u0002X\u0082T\u00a2\u0006\b\n\u0006\b\u00d2\u0001\u0010\u00ce\u0001R\u0017\u0010\u00d3\u0001\u001a\u00020\u00058\u0002X\u0082T\u00a2\u0006\b\n\u0006\b\u00d3\u0001\u0010\u00ce\u0001R\u0017\u0010\u00d4\u0001\u001a\u00020\u00058\u0002X\u0082T\u00a2\u0006\b\n\u0006\b\u00d4\u0001\u0010\u00ce\u0001R\u0017\u0010\u00d5\u0001\u001a\u00020\u00058\u0002X\u0082T\u00a2\u0006\b\n\u0006\b\u00d5\u0001\u0010\u00ce\u0001R\u0017\u0010\u00d6\u0001\u001a\u00020\u00058\u0002X\u0082T\u00a2\u0006\b\n\u0006\b\u00d6\u0001\u0010\u00ce\u0001R\u0017\u0010\u00d7\u0001\u001a\u00020\u00058\u0002X\u0082T\u00a2\u0006\b\n\u0006\b\u00d7\u0001\u0010\u00ce\u0001R\u0017\u0010\u00d8\u0001\u001a\u00020\u00058\u0002X\u0082T\u00a2\u0006\b\n\u0006\b\u00d8\u0001\u0010\u00ce\u0001R\u0017\u0010\u00d9\u0001\u001a\u00020\u00058\u0002X\u0082T\u00a2\u0006\b\n\u0006\b\u00d9\u0001\u0010\u00ce\u0001R\u0017\u0010\u00da\u0001\u001a\u00020\u00058\u0002X\u0082T\u00a2\u0006\b\n\u0006\b\u00da\u0001\u0010\u00ce\u0001R\u0017\u0010\u00db\u0001\u001a\u00020\u00058\u0002X\u0082T\u00a2\u0006\b\n\u0006\b\u00db\u0001\u0010\u00ce\u0001R\u0017\u0010\u00dc\u0001\u001a\u00020\u00058\u0002X\u0082T\u00a2\u0006\b\n\u0006\b\u00dc\u0001\u0010\u00ce\u0001R\u0017\u0010\u00dd\u0001\u001a\u00020\u00058\u0002X\u0082T\u00a2\u0006\b\n\u0006\b\u00dd\u0001\u0010\u00ce\u0001R\u0017\u0010\u00de\u0001\u001a\u00020\u00058\u0002X\u0082T\u00a2\u0006\b\n\u0006\b\u00de\u0001\u0010\u00ce\u0001R\u0018\u0010\u00e0\u0001\u001a\u00030\u00df\u00018\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u00e0\u0001\u0010\u00e1\u0001R\u001e\u0010\u00e3\u0001\u001a\t\u0012\u0004\u0012\u00020\u00050\u00e2\u00018\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u00e3\u0001\u0010\u00e4\u0001R\"\u0010\u00e7\u0001\u001a\r \u00e6\u0001*\u0005\u0018\u00010\u00e5\u00010\u00e5\u00018\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u00e7\u0001\u0010\u00e8\u0001R\"\u0010\u00ea\u0001\u001a\r \u00e6\u0001*\u0005\u0018\u00010\u00e9\u00010\u00e9\u00018\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u00ea\u0001\u0010\u00eb\u0001R\u0017\u0010\u00ec\u0001\u001a\u00020-8\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u00ec\u0001\u0010\u00ed\u0001R\u001c\u0010\u00ee\u0001\u001a\u00020-8\u0006\u00a2\u0006\u0010\n\u0006\b\u00ee\u0001\u0010\u00ed\u0001\u001a\u0006\b\u00ef\u0001\u0010\u00f0\u0001R\u0017\u0010\u00f1\u0001\u001a\u00020-8\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u00f1\u0001\u0010\u00ed\u0001R\u001b\u0010\u00f2\u0001\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u00f2\u0001\u0010\u00ce\u0001R\u001f\u0010\u00f3\u0001\u001a\b\u0012\u0004\u0012\u00020\t0\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u00f3\u0001\u0010\u00f4\u0001R\u001f\u0010\u00f5\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u00f5\u0001\u0010\u00f4\u0001R\u0019\u0010\u00f6\u0001\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u00f6\u0001\u0010\u00f7\u0001R\u0019\u0010\u00f8\u0001\u001a\u00020\r8\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u00f8\u0001\u0010\u00d0\u0001R\u001b\u0010\u00f9\u0001\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u00f9\u0001\u0010\u00ce\u0001R\u001b\u0010\u00fa\u0001\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u00fa\u0001\u0010\u00fb\u0001R\u001c\u0010\u00fc\u0001\u001a\u0005\u0018\u00010\u00a4\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u00fc\u0001\u0010\u00fd\u0001\u00a8\u0006\u0084\u0002"}, d2={"Loxxxde/\u0627\u0643;", "", "<init>", "()V", "", "", "getConfigNames", "()Ljava/util/List;", "getVisibleConfigNames", "Loxxxde/\u0635\u064c;", "getVisibleConfigs", "getSelectedVisibleConfigName", "()Ljava/lang/String;", "", "getStateVersion", "()I", "name", "", "isConfigActive", "(Ljava/lang/String;)Z", "", "refreshVisibleConfigsNow", "setSelectedConfigName", "(Ljava/lang/String;)V", "save", "canCreate", "captureCleanRuntimeSnapshot", "isCloudConfigActive", "()Z", "canCreateFromCurrent", "unloadActiveCloudConfig", "Loxxxde/\u062f\u0635;", "create", "(Ljava/lang/String;)Lkotakbaz/rain/config/ConfigManager$CreateResult;", "load", "remove", "oldName", "newName", "Loxxxde/\u0628;", "rename", "(Ljava/lang/String;Ljava/lang/String;)Lkotakbaz/rain/config/ConfigManager$RenameResult;", "isValidName", "isManualConfigName", "getAuthor", "(Ljava/lang/String;)Ljava/lang/String;", "Ljava/nio/file/Path;", "file", "readAuthor", "(Ljava/nio/file/Path;)Ljava/lang/String;", "isCloudConfig", "Loxxxde/\u062f\u0629;", "getCloudOrigin", "(Ljava/lang/String;)Lkotakbaz/rain/config/CloudConfigOrigin;", "getCloudDisplayName", "findOwnedCloudOriginByName", "shared", "setCloudConfigShared", "(Ljava/lang/String;Z)Z", "isImportedCloudConfig", "Lcom/google/gson/JsonObject;", "exportCloudPayload", "(Ljava/lang/String;)Lcom/google/gson/JsonObject;", "cloudPayloadHash", "payload", "hashCloudPayload", "(Lcom/google/gson/JsonObject;)Ljava/lang/String;", "expectedHash", "verifyCloudPayloadHash", "(Lcom/google/gson/JsonObject;Ljava/lang/String;)Z", "preferredName", "ownerName", "configId", "contentHash", "importCloudConfig", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/gson/JsonObject;)Ljava/lang/String;", "revision", "cloudName", "markOwnedCloudConfig", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Boolean;)Z", "syncOwnedCloudConfig", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZLcom/google/gson/JsonObject;)Ljava/lang/String;", "syncReceivedCloudConfig", "root", "readCloudOrigin", "(Ljava/nio/file/Path;)Lkotakbaz/rain/config/CloudConfigOrigin;", "(Lcom/google/gson/JsonObject;)Lkotakbaz/rain/config/CloudConfigOrigin;", "origin", "serializeCloudOrigin", "(Lkotakbaz/rain/config/CloudConfigOrigin;)Lcom/google/gson/JsonObject;", "Lcom/google/gson/JsonElement;", "element", "canonicalJson", "(Lcom/google/gson/JsonElement;)Ljava/lang/String;", "availableCloudConfigName", "Loxxxde/\u062f\u0650;", "module", "serializeModule", "(Lkotakbaz/rain/module/Module;)Lcom/google/gson/JsonObject;", "Loxxxde/\u0631\u0641;", "settings", "serializeSettings", "(Ljava/util/List;)Lcom/google/gson/JsonObject;", "author", "cloudOrigin", "serializeConfig", "(Ljava/lang/String;Lkotakbaz/rain/config/CloudConfigOrigin;)Lcom/google/gson/JsonObject;", "setting", "serializeSettingValue", "(Lkotakbaz/rain/module/setting/Setting;)Lcom/google/gson/JsonElement;", "Loxxxde/\u062e\u064c;", "parseConfig", "(Ljava/nio/file/Path;)Lkotakbaz/rain/config/ConfigManager$ParsedConfig;", "readConfigText", "parseConfigRoot", "(Lcom/google/gson/JsonObject;)Lkotakbaz/rain/config/ConfigManager$ParsedConfig;", "config", "migrateLoadedConfig", "(Ljava/nio/file/Path;Lkotakbaz/rain/config/ConfigManager$ParsedConfig;)V", "content", "findClickGuiSettings", "(Lcom/google/gson/JsonObject;)Lcom/google/gson/JsonObject;", "findModuleJson", "(Lcom/google/gson/JsonObject;Lkotakbaz/rain/module/Module;)Lcom/google/gson/JsonObject;", "json", "formatVersion", "Loxxxde/\u062f\u0621;", "parseModule", "(Lkotakbaz/rain/module/Module;Lcom/google/gson/JsonObject;I)Lkotakbaz/rain/config/ConfigManager$ModuleUpdate;", "Loxxxde/\u0625;", "parseSettings", "(Ljava/util/List;Lcom/google/gson/JsonObject;ILkotakbaz/rain/module/Module;)Ljava/util/List;", "index", "findSettingElement", "(Ljava/util/List;Lkotakbaz/rain/module/setting/Setting;ILcom/google/gson/JsonObject;ILkotakbaz/rain/module/Module;)Lcom/google/gson/JsonElement;", "legacySettingIndex", "(Lkotakbaz/rain/module/Module;ILcom/google/gson/JsonObject;)I", "parseSettingValue", "(Lkotakbaz/rain/module/setting/Setting;Lcom/google/gson/JsonElement;I)Ljava/lang/Object;", "Loxxxde/\u0638\u064a;", "parseMode", "(Lkotakbaz/rain/module/setting/ModeSetting;Lcom/google/gson/JsonElement;I)Ljava/lang/String;", "Loxxxde/\u0637\u064f;", "", "raw", "normalizeSlider", "(Lkotakbaz/rain/module/setting/settings/SliderSetting;F)F", "parseBoolean", "(Lcom/google/gson/JsonElement;)Z", "parseInt", "(Lcom/google/gson/JsonElement;)I", "parseFloat", "(Lcom/google/gson/JsonElement;)F", "parseString", "Lcom/google/gson/JsonPrimitive;", "requirePrimitive", "(Lcom/google/gson/JsonElement;)Lcom/google/gson/JsonPrimitive;", "requireObject", "(Lcom/google/gson/JsonElement;Ljava/lang/String;)Lcom/google/gson/JsonObject;", "parent", "key", "optionalObject", "(Lcom/google/gson/JsonObject;Ljava/lang/String;)Lcom/google/gson/JsonObject;", "applyConfig", "(Lkotakbaz/rain/config/ConfigManager$ParsedConfig;)V", "Loxxxde/\u0636\u062c;", "captureRuntimeSnapshot", "()Lkotakbaz/rain/config/ConfigManager$RuntimeSnapshot;", "snapshot", "restoreRuntimeSnapshot", "(Lkotakbaz/rain/config/ConfigManager$RuntimeSnapshot;)V", "settingValue", "(Lkotakbaz/rain/module/setting/Setting;)Ljava/lang/Object;", "update", "applySettingUpdate", "(Lkotakbaz/rain/config/ConfigManager$SettingUpdate;)V", "validateConfigKeys", "owner", "validateSettingKeys", "(Ljava/lang/String;Ljava/util/List;)V", "moduleConfigKey", "(Lkotakbaz/rain/module/Module;)Ljava/lang/String;", "settingConfigKey", "(I)Ljava/lang/String;", "ensureConfigDirectory", "target", "writeAtomically", "(Ljava/nio/file/Path;Ljava/lang/String;)V", "source", "caseOnlyRename", "moveConfigFile", "(Ljava/nio/file/Path;Ljava/nio/file/Path;Z)V", "ensureVisibleConfigsCache", "force", "rebuildVisibleConfigs", "(Z)V", "loadVisibleConfigs", "markVisibleConfigsDirty", "fileName", "isInternalConfigFile", "persistSelectedConfigName", "readSelectedConfigName", "currentAuthor", "restoreMisplacedInternalFiles", "restoreMisplacedInternalFile", "migrateLegacyConfigs", "AUTO_LOAD_CONFIG", "Ljava/lang/String;", "CURRENT_FORMAT_VERSION", "I", "MAX_LOCAL_CONFIG_BYTES", "DRAGS_FILE_NAME", "WAYPOINT_FILE_NAME", "CLOUD_IDENTITY_FILE_NAME", "SELECTED_CONFIG_FILE_NAME", "AUTHOR_KEY", "LEGACY_AUTHOR_KEY", "FORMAT_VERSION_KEY", "CONTENT_KEY", "CLOUD_ORIGIN_KEY", "CLICK_GUI_SETTINGS_KEY", "LEGACY_CLICK_GUI_MODULE_KEY", "LEGACY_CLICK_GUI_MODULE_NAME", "UNKNOWN_AUTHOR", "Lkotlin/text/Regex;", "manualConfigNameRegex", "Lkotlin/text/Regex;", "", "reservedWindowsNames", "Ljava/util/Set;", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "logger", "Lorg/slf4j/Logger;", "Lcom/google/gson/Gson;", "gson", "Lcom/google/gson/Gson;", "legacyConfigPath", "Ljava/nio/file/Path;", "configPath", "getConfigPath", "()Ljava/nio/file/Path;", "selectedConfigPath", "selectedConfigName", "visibleConfigsCache", "Ljava/util/List;", "visibleConfigNamesCache", "visibleConfigsDirty", "Z", "stateVersion", "activeConfigName", "activeCloudOrigin", "Loxxxde/\u062f\u0629;", "cleanRuntimeSnapshot", "Loxxxde/\u0636\u062c;", "ParsedConfig", "ModuleUpdate", "SettingUpdate", "RuntimeSnapshot", "RenameResult", "CreateResult", "rain-visuals"})
public final class ConfigManager {
    @NotNull
    private static final String UNKNOWN_AUTHOR = "Unknown";
    @NotNull
    private static final Regex manualConfigNameRegex;
    @NotNull
    private static List<ConfigInfo> visibleConfigsCache;
    @NotNull
    private static final String LEGACY_CLICK_GUI_MODULE_NAME = "ClickGui";
    @NotNull
    private static final Path selectedConfigPath;
    private static final Logger logger;
    @NotNull
    private static final String FORMAT_VERSION_KEY = "FormatVersion";
    @Nullable
    private static RuntimeSnapshot cleanRuntimeSnapshot;
    @Nullable
    private static String selectedConfigName;
    private static final Gson gson;
    @NotNull
    private static final Path legacyConfigPath;
    @NotNull
    private static final Set<String> reservedWindowsNames;
    @NotNull
    private static final Path configPath;
    @NotNull
    public static final String AUTO_LOAD_CONFIG = "AutoLoad";
    private static int stateVersion;
    @NotNull
    private static final String CLICK_GUI_SETTINGS_KEY = "ClickGuiSettings";
    @NotNull
    private static final String CLOUD_IDENTITY_FILE_NAME = "cloud_identity.json";
    @Nullable
    private static String activeConfigName;
    @NotNull
    public static final ConfigManager INSTANCE;
    @NotNull
    private static final String SELECTED_CONFIG_FILE_NAME = "selected_config.txt";
    @NotNull
    private static final String LEGACY_AUTHOR_KEY = "Author";
    private static final int CURRENT_FORMAT_VERSION = 2;
    @NotNull
    private static final String CLOUD_ORIGIN_KEY = "CloudOrigin";
    @NotNull
    private static final String DRAGS_FILE_NAME = "drags.json";
    private static final int MAX_LOCAL_CONFIG_BYTES = 524288;
    @NotNull
    private static List<String> visibleConfigNamesCache;
    @Nullable
    private static CloudConfigOrigin activeCloudOrigin;
    @NotNull
    private static final String LEGACY_CLICK_GUI_MODULE_KEY = "ClickGuiModule";
    @NotNull
    private static final String AUTHOR_KEY = "Author";
    @NotNull
    private static final String WAYPOINT_FILE_NAME = "way.json";
    private static boolean visibleConfigsDirty;
    @NotNull
    private static final String CONTENT_KEY = "Content";

    private final void persistSelectedConfigName() {
        ConfigManager configManager = this;
        try {
            Object object;
            ConfigManager $this$persistSelectedConfigName_u24lambda_u240 = configManager;
            boolean bl = false;
            Files.createDirectories(selectedConfigPath.getParent(), new FileAttribute[0]);
            String selected = selectedConfigName;
            if (selected == null) {
                object = Files.deleteIfExists(selectedConfigPath);
            } else {
                $this$persistSelectedConfigName_u24lambda_u240.writeAtomically(selectedConfigPath, selected);
                object = Unit.INSTANCE;
            }
            Object object2 = Result.constructor-impl(object);
        }
        catch (Throwable throwable) {
            Object object = Result.constructor-impl(ResultKt.createFailure(throwable));
        }
    }

    /*
     * Unable to fully structure code
     */
    private final String availableCloudConfigName(String preferredName) {
        var4_2 = StringsKt.trim((CharSequence)preferredName).toString();
        var5_4 = new Regex("[\\\\/:*?\"<>|\\p{Cntrl}]");
        var6_7 = "";
        v0 = var5_4.replace((CharSequence)var4_2, var6_7);
        var4_2 = new char[2];
        var4_2[0] = 46;
        var4_2[1] = 32;
        it = var4_2 = StringsKt.take(StringsKt.trimEnd(v0, (char[])var4_2), 48);
        $i$a$-takeIf-ConfigManager$availableCloudConfigName$sanitized$1 = false;
        if (!ConfigManager.INSTANCE.isValidName((String)it)) ** GOTO lbl-1000
        if (!StringsKt.equals((String)it, "AutoLoad", true)) {
            v1 = true;
        } else lbl-1000:
        // 2 sources

        {
            v1 = false;
        }
        v2 = v1 ? var4_2 : null;
        v3 = v2;
        if (v2 == null) {
            v3 = "CloudConfig";
        }
        sanitized = v3;
        $this$map$iv = this.getConfigNames();
        $i$f$map = false;
        $i$a$-takeIf-ConfigManager$availableCloudConfigName$sanitized$1 = $this$map$iv;
        destination$iv$iv = new ArrayList<E>(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        $i$f$mapTo = false;
        for (T item$iv$iv : $this$mapTo$iv$iv) {
            p0 = (String)item$iv$iv;
            var13_17 = destination$iv$iv;
            $i$a$-map-ConfigManager$availableCloudConfigName$existing$1 = false;
            v4 = p0.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(v4, "toLowerCase(...)");
            var13_17.add(v4);
        }
        existing = CollectionsKt.toHashSet((List)var7_11);
        v5 = sanitized.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(v5, "toLowerCase(...)");
        if (!existing.contains(v5)) {
            return sanitized;
        }
        suffix = 2;
        while (suffix < 1000) {
            candidate = StringsKt.take((String)sanitized, RangesKt.coerceAtLeast(48 - String.valueOf(suffix).length(), 1)) + suffix;
            v6 = candidate.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(v6, "toLowerCase(...)");
            if (!existing.contains(v6) && this.isValidName((String)var5_6)) {
                return var5_6;
            }
            ++var4_3;
        }
        return "Cloud" + System.currentTimeMillis();
    }

    @NotNull
    public final Path getConfigPath() {
        return configPath;
    }

    public final void captureCleanRuntimeSnapshot() {
        if (cleanRuntimeSnapshot != null) {
            return;
        }
        this.validateConfigKeys();
        cleanRuntimeSnapshot = this.captureRuntimeSnapshot();
    }

    @Nullable
    public final CloudConfigOrigin getCloudOrigin(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (!this.isValidName(name)) {
            return null;
        }
        Path path = configPath.resolve(name + ".json");
        Intrinsics.checkNotNullExpressionValue(path, "resolve(...)");
        return this.readCloudOrigin(path);
    }

    @NotNull
    public final String hashCloudPayload(@NotNull JsonObject payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] byArray = this.canonicalJson(payload).getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(byArray, "getBytes(...)");
        byte[] digest = messageDigest.digest(byArray);
        String string = HexFormat.of().formatHex(digest);
        Intrinsics.checkNotNullExpressionValue(string, "formatHex(...)");
        return string;
    }

    /*
     * WARNING - void declaration
     */
    private final void rebuildVisibleConfigs(boolean force) {
        void var6_7;
        void $this$mapTo$iv$iv;
        if (!force && !visibleConfigsDirty) {
            return;
        }
        List<ConfigInfo> refreshedConfigs = this.loadVisibleConfigs();
        visibleConfigsDirty = false;
        if (Intrinsics.areEqual(refreshedConfigs, visibleConfigsCache)) {
            return;
        }
        visibleConfigsCache = refreshedConfigs;
        Iterable $this$map$iv = refreshedConfigs;
        boolean $i$f$map = false;
        Iterable iterable = $this$map$iv;
        Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        boolean $i$f$mapTo = false;
        for (Object item$iv$iv : $this$mapTo$iv$iv) {
            void var10_11;
            ConfigInfo p0 = (ConfigInfo)item$iv$iv;
            Collection collection = destination$iv$iv;
            boolean bl = false;
            collection.add(var10_11.getName());
        }
        visibleConfigNamesCache = (List)var6_7;
        int n = stateVersion;
        stateVersion = n + 1;
    }

    public final boolean isCloudConfig(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (!this.isValidName(name)) {
            return false;
        }
        Path path = configPath.resolve(name + ".json");
        Intrinsics.checkNotNullExpressionValue(path, "resolve(...)");
        return this.readCloudOrigin(path) != null;
    }

    /*
     * WARNING - void declaration
     */
    private final ModuleUpdate parseModule(Module module, JsonObject json, int formatVersion) {
        void var6_12;
        void var5_10;
        void var4_7;
        void var1_1;
        List<Object> list;
        Boolean bl;
        Integer n;
        JsonElement jsonElement = json.get("key");
        if (jsonElement != null) {
            JsonElement p0 = jsonElement;
            boolean bl2 = false;
            n = this.parseInt(p0);
        } else {
            n = null;
        }
        Integer key = n;
        JsonElement jsonElement2 = json.get("enabled");
        if (jsonElement2 != null) {
            void var8_6;
            JsonElement p0 = jsonElement2;
            boolean bl3 = false;
            bl = this.parseBoolean((JsonElement)var8_6);
        } else {
            bl = null;
        }
        Boolean enabled = bl;
        JsonObject jsonObject = this.optionalObject(json, "Settings");
        if (jsonObject != null) {
            void var9_9;
            JsonObject it = jsonObject;
            boolean bl4 = false;
            list = INSTANCE.parseSettings(module.getSettings(), (JsonObject)var9_9, formatVersion, module);
        } else {
            list = null;
        }
        List list2 = list;
        if (list == null) {
            list2 = CollectionsKt.emptyList();
        }
        List settings = list2;
        return new ModuleUpdate((Module)var1_1, (Integer)var4_7, (Boolean)var5_10, (List<SettingUpdate>)var6_12);
    }

    static /* synthetic */ JsonObject serializeConfig$default(ConfigManager configManager, String string, CloudConfigOrigin cloudConfigOrigin, int n, Object object) {
        if ((n & 2) != 0) {
            cloudConfigOrigin = null;
        }
        return configManager.serializeConfig(string, cloudConfigOrigin);
    }

    /*
     * WARNING - void declaration
     */
    private final JsonObject serializeCloudOrigin(CloudConfigOrigin origin) {
        void var1_1;
        void var3_3;
        JsonObject jsonObject = new JsonObject();
        JsonObject cloud = jsonObject;
        boolean bl = false;
        cloud.addProperty("ConfigId", origin.getConfigId());
        cloud.addProperty("OwnerName", origin.getOwnerName());
        cloud.addProperty("ContentHash", origin.getContentHash());
        cloud.addProperty("ImportedAt", origin.getImportedAt());
        cloud.addProperty("Owned", origin.getOwned());
        cloud.addProperty("Revision", origin.getRevision());
        String string = origin.getCloudName();
        if (string != null) {
            String string2;
            String p0 = string2 = string;
            boolean bl2 = false;
            String string3 = !StringsKt.isBlank(p0) ? string2 : null;
            if (string3 != null) {
                void var7_7;
                String it = string3;
                boolean bl3 = false;
                cloud.addProperty("Name", (String)var7_7);
            }
        }
        cloud.addProperty("Shared", origin.getShared());
        var3_3.addProperty("AccountSynced", var1_1.getAccountSynced());
        return jsonObject;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean canCreate(@NotNull String name) {
        void var7_7;
        Intrinsics.checkNotNullParameter(name, "name");
        String normalized = ((Object)StringsKt.trim((CharSequence)name)).toString();
        if (!this.isValidName(normalized)) return false;
        if (StringsKt.equals(normalized, AUTO_LOAD_CONFIG, true)) {
            return false;
        }
        Iterable $this$none$iv = this.getConfigNames();
        boolean $i$f$none = false;
        if ($this$none$iv instanceof Collection) {
            if (((Collection)$this$none$iv).isEmpty()) {
                return true;
            }
        }
        Iterator iterator2 = $this$none$iv.iterator();
        do {
            if (!iterator2.hasNext()) return true;
            Object element$iv = iterator2.next();
            String it = (String)element$iv;
            boolean bl = false;
        } while (!StringsKt.equals((String)var7_7, normalized, true));
        return false;
    }

    private static final Unit migrateLegacyConfigs$lambda$0$2(Ref.BooleanRef $migrated, Path legacyFile) {
        block6: {
            Object object;
            String fileName = ((Object)legacyFile.getFileName()).toString();
            if (INSTANCE.isInternalConfigFile(fileName)) {
                return Unit.INSTANCE;
            }
            Path targetFile = configPath.resolve(fileName);
            if (Files.exists(targetFile, new LinkOption[0])) {
                return Unit.INSTANCE;
            }
            Object object2 = INSTANCE;
            try {
                ConfigManager $this$migrateLegacyConfigs_u24lambda_u240_u242_u240 = object2;
                boolean bl = false;
                Files.move(legacyFile, targetFile, new CopyOption[0]);
                $migrated.element = true;
                object = Result.constructor-impl(Unit.INSTANCE);
            }
            catch (Throwable bl) {
                object = Result.constructor-impl(ResultKt.createFailure(bl));
            }
            object2 = object;
            Throwable throwable = Result.exceptionOrNull-impl(object2);
            if (throwable == null) break block6;
            Object it = object = throwable;
            boolean bl = false;
            ConfigManager configManager = INSTANCE;
            try {
                ConfigManager $this$migrateLegacyConfigs_u24lambda_u240_u242_u241_u240 = configManager;
                boolean bl2 = false;
                Files.copy(legacyFile, targetFile, new CopyOption[0]);
                $migrated.element = true;
                Object object3 = Result.constructor-impl(Unit.INSTANCE);
            }
            catch (Throwable throwable2) {
                Object object4 = Result.constructor-impl(ResultKt.createFailure(throwable2));
            }
        }
        return Unit.INSTANCE;
    }

    private final void validateSettingKeys(String owner, List<? extends Setting<?>> settings) {
        HashSet<String> keys2 = new HashSet<String>();
        Iterable $this$forEach$iv = settings;
        boolean $i$f$forEach = false;
        for (Object element$iv : $this$forEach$iv) {
            Setting setting = (Setting)element$iv;
            boolean bl = false;
            if (keys2.add(setting.getConfigKey())) continue;
            boolean bl2 = false;
            String string = "Duplicate setting config key '" + setting.getConfigKey() + "' in " + owner;
            throw new IllegalArgumentException(string.toString());
        }
    }

    private final void restoreRuntimeSnapshot(RuntimeSnapshot snapshot) {
        String string;
        ModuleUpdate update;
        ConfigManager configManager;
        Iterable $this$forEach$iv = snapshot.getClickGuiSettings();
        boolean $i$f$forEach = false;
        for (Object element$iv : $this$forEach$iv) {
            Object $this$restoreRuntimeSnapshot_u24lambda_u240_u240;
            SettingUpdate it = (SettingUpdate)element$iv;
            boolean bl = false;
            configManager = INSTANCE;
            try {
                $this$restoreRuntimeSnapshot_u24lambda_u240_u240 = configManager;
                boolean bl2 = false;
                super.applySettingUpdate(it);
                $this$restoreRuntimeSnapshot_u24lambda_u240_u240 = Result.constructor-impl(Unit.INSTANCE);
            }
            catch (Throwable bl2) {
                $this$restoreRuntimeSnapshot_u24lambda_u240_u240 = Result.constructor-impl(ResultKt.createFailure(bl2));
            }
        }
        $this$forEach$iv = snapshot.getModules();
        $i$f$forEach = false;
        for (Object element$iv : $this$forEach$iv) {
            Object $this$restoreRuntimeSnapshot_u24lambda_u241_u240;
            update = (ModuleUpdate)element$iv;
            boolean bl = false;
            configManager = INSTANCE;
            try {
                $this$restoreRuntimeSnapshot_u24lambda_u241_u240 = configManager;
                boolean bl3 = false;
                Integer n = update.getKey();
                if (n == null) {
                    string = "Required value was null.";
                    throw new IllegalArgumentException(string.toString());
                }
                update.getModule().setKey(((Number)n).intValue());
                $this$restoreRuntimeSnapshot_u24lambda_u241_u240 = Result.constructor-impl(Unit.INSTANCE);
            }
            catch (Throwable bl3) {
                $this$restoreRuntimeSnapshot_u24lambda_u241_u240 = Result.constructor-impl(ResultKt.createFailure(bl3));
            }
            Iterable $this$forEach$iv2 = update.getSettings();
            boolean $i$f$forEach2 = false;
            for (Object element$iv2 : $this$forEach$iv2) {
                Object object;
                SettingUpdate it = (SettingUpdate)element$iv2;
                boolean bl4 = false;
                ConfigManager configManager2 = INSTANCE;
                try {
                    ConfigManager $this$restoreRuntimeSnapshot_u24lambda_u241_u241_u240 = configManager2;
                    boolean bl5 = false;
                    super.applySettingUpdate(it);
                    object = Result.constructor-impl(Unit.INSTANCE);
                }
                catch (Throwable throwable) {
                    object = Result.constructor-impl(ResultKt.createFailure(throwable));
                }
            }
        }
        $this$forEach$iv = snapshot.getModules();
        $i$f$forEach = false;
        for (Object element$iv : $this$forEach$iv) {
            Object object;
            update = (ModuleUpdate)element$iv;
            boolean bl = false;
            configManager = INSTANCE;
            try {
                ConfigManager $this$restoreRuntimeSnapshot_u24lambda_u242_u240 = configManager;
                boolean bl6 = false;
                Boolean bl7 = update.getEnabled();
                if (bl7 == null) {
                    string = "Required value was null.";
                    throw new IllegalArgumentException(string.toString());
                }
                update.getModule().setEnabled(bl7);
                object = Result.constructor-impl(Unit.INSTANCE);
            }
            catch (Throwable throwable) {
                object = Result.constructor-impl(ResultKt.createFailure(throwable));
            }
        }
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final void moveConfigFile(Path source, Path target, boolean caseOnlyRename) {
        if (!caseOnlyRename) {
            try {
                CopyOption[] copyOptionArray = new CopyOption[1];
                copyOptionArray[0] = StandardCopyOption.ATOMIC_MOVE;
                Files.move(source, target, copyOptionArray);
                return;
            }
            catch (AtomicMoveNotSupportedException atomicMoveNotSupportedException) {
                Files.move(source, target, new CopyOption[0]);
            }
            return;
        }
        Path temporary = Files.createTempFile(configPath, ".rename-", ".tmp", new FileAttribute[0]);
        boolean movedToTemporary = false;
        try {
            CopyOption[] copyOptionArray = new CopyOption[1];
            copyOptionArray[0] = StandardCopyOption.REPLACE_EXISTING;
            Files.move(source, temporary, copyOptionArray);
            movedToTemporary = true;
            try {
                CopyOption[] copyOptionArray2 = new CopyOption[1];
                copyOptionArray2[0] = StandardCopyOption.ATOMIC_MOVE;
                Path path = Files.move(temporary, target, copyOptionArray2);
                return;
            }
            catch (AtomicMoveNotSupportedException atomicMoveNotSupportedException) {
                Path path = Files.move(temporary, target, new CopyOption[0]);
            }
            return;
        }
        catch (Throwable error) {
            void var4_5;
            void var5_7;
            void var7_13;
            if (movedToTemporary) {
                if (Files.exists(temporary, new LinkOption[0])) {
                    if (!Files.exists(source, new LinkOption[0])) {
                        Object object;
                        Object object2 = this;
                        try {
                            object = object2;
                            boolean bl = false;
                            object = Result.constructor-impl(Files.move(temporary, source, new CopyOption[0]));
                        }
                        catch (Throwable bl) {
                            object = Result.constructor-impl(ResultKt.createFailure(bl));
                        }
                        object2 = object;
                        Throwable throwable = Result.exceptionOrNull-impl(object2);
                        if (throwable == null) throw var7_13;
                        Object object3 = object = throwable;
                        boolean bl = false;
                        ExceptionsKt.addSuppressed(error, (Throwable)object3);
                        throw var7_13;
                    }
                }
            }
            if (var5_7 != false) throw var7_13;
            Files.deleteIfExists((Path)var4_5);
            throw var7_13;
        }
    }

    public final boolean isImportedCloudConfig(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        CloudConfigOrigin cloudConfigOrigin = this.getCloudOrigin(name);
        return cloudConfigOrigin != null ? !cloudConfigOrigin.getOwned() : false;
    }

    private static final CharSequence canonicalJson$lambda$0(Map.Entry entry) {
        Intrinsics.checkNotNull(entry);
        String key = (String)entry.getKey();
        JsonElement value = (JsonElement)entry.getValue();
        String string = gson.toJson(key);
        Intrinsics.checkNotNull(value);
        return string + ":" + INSTANCE.canonicalJson(value);
    }

    /*
     * WARNING - void declaration
     */
    private final JsonObject serializeModule(Module module) {
        void var2_2;
        JsonObject json = new JsonObject();
        json.addProperty("enabled", module.isPreferredEnabled());
        json.addProperty("key", module.getKey());
        json.add("Settings", this.serializeSettings(module.getSettings()));
        return var2_2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private final void migrateLegacyConfigs() {
        block11: {
            block10: {
                if (Intrinsics.areEqual(legacyConfigPath, configPath)) break block10;
                if (Files.isDirectory(legacyConfigPath, new LinkOption[0])) break block11;
            }
            return;
        }
        Ref.BooleanRef migrated = new Ref.BooleanRef();
        AutoCloseable autoCloseable = Files.list(legacyConfigPath);
        Throwable throwable = null;
        try {
            Stream files = (Stream)autoCloseable;
            boolean bl = false;
            files.filter(arg_0 -> ConfigManager.migrateLegacyConfigs$lambda$0$1(ConfigManager::migrateLegacyConfigs$lambda$0$0, arg_0)).forEach(arg_0 -> ConfigManager.migrateLegacyConfigs$lambda$0$3(arg_0 -> ConfigManager.migrateLegacyConfigs$lambda$0$2(migrated, arg_0), arg_0));
            Unit unit = Unit.INSTANCE;
        }
        catch (Throwable throwable2) {
            throwable = throwable2;
            throw throwable2;
        }
        finally {
            AutoCloseableKt.closeFinally(autoCloseable, throwable);
        }
        if (migrated.element) {
            this.markVisibleConfigsDirty();
        }
    }

    /*
     * Unable to fully structure code
     */
    public final boolean markOwnedCloudConfig(@NotNull String name, @NotNull String configId, @NotNull String ownerName, @NotNull String contentHash, int revision, @NotNull String cloudName, @Nullable Boolean shared) {
        block30: {
            block29: {
                block28: {
                    Intrinsics.checkNotNullParameter(name, "name");
                    Intrinsics.checkNotNullParameter(configId, "configId");
                    Intrinsics.checkNotNullParameter(ownerName, "ownerName");
                    Intrinsics.checkNotNullParameter(contentHash, "contentHash");
                    Intrinsics.checkNotNullParameter(cloudName, "cloudName");
                    if (!this.isValidName(name)) break block28;
                    if (StringsKt.isBlank(configId) || !new Regex("^[0-9a-f]{64}$").matches(var8_8 = (CharSequence)contentHash)) break block28;
                    if (revision >= 1) break block29;
                }
                return false;
            }
            source = ConfigManager.configPath.resolve(name + ".json");
            if (!Files.isRegularFile(source, new LinkOption[0])) {
                return false;
            }
            var9_9 = this;
            try {
                block27: {
                    $this$markOwnedCloudConfig_u24lambda_u240 = var9_9;
                    $i$a$-runCatching-ConfigManager$markOwnedCloudConfig$1 = false;
                    Intrinsics.checkNotNull(source);
                    v0 = ConfigManager.gson.fromJson($this$markOwnedCloudConfig_u24lambda_u240.readConfigText(source), JsonObject.class);
                    if (v0 == null) {
                        throw new IllegalStateException("Config root is missing".toString());
                    }
                    root = v0;
                    previousOrigin = $this$markOwnedCloudConfig_u24lambda_u240.readCloudOrigin(root);
                    if (!(previousOrigin == null || previousOrigin.getOwned())) {
                        $i$a$-require-ConfigManager$markOwnedCloudConfig$1$1 = false;
                        $i$a$-require-ConfigManager$markOwnedCloudConfig$1$1 = "Imported cloud configs cannot become owned configs";
                        throw new IllegalArgumentException($i$a$-require-ConfigManager$markOwnedCloudConfig$1$1.toString());
                    }
                    $this$markOwnedCloudConfig_u24lambda_u240.parseConfigRoot(root);
                    $this$markOwnedCloudConfig_u24lambda_u240.refreshVisibleConfigsNow();
                    $this$firstOrNull$iv = ConfigManager.visibleConfigsCache;
                    $i$f$firstOrNull = false;
                    var16_22 = $this$firstOrNull$iv.iterator();
                    while (var16_22.hasNext()) {
                        element$iv = var16_22.next();
                        it = (ConfigInfo)element$iv;
                        $i$a$-firstOrNull-ConfigManager$markOwnedCloudConfig$1$existingOwned$1 = false;
                        v1 = it.getCloudOrigin();
                        v2 = v1 != null ? v1.getOwned() : false;
                        if (!v2) ** GOTO lbl-1000
                        if (Intrinsics.areEqual(it.getCloudOrigin().getConfigId(), configId)) {
                            v3 = true;
                        } else lbl-1000:
                        // 2 sources

                        {
                            v3 = false;
                        }
                        if (!v3) continue;
                        v4 = var17_23;
                        break block27;
                    }
                    v4 = null;
                }
                existingOwned = v4;
                v5 = configId;
                v6 = StringsKt.take(ownerName, 64);
                v7 = contentHash;
                v8 = previousOrigin;
                if (v8 == null) ** GOTO lbl-1000
                it = v8.getImportedAt();
                var21_29 = ((Number)it).longValue();
                var23_30 = v7;
                var24_31 = v6;
                var25_32 = v5;
                var26_33 = false;
                var27_34 = var21_29 > 0L;
                v5 = var25_32;
                v6 = var24_31;
                v7 = var23_30;
                v9 = var27_34 ? it : null;
                v8 = v9;
                if (v9 != null) {
                    v10 = v8.longValue();
                } else lbl-1000:
                // 2 sources

                {
                    if ((v11 = existingOwned) != null && (v11 = v11.getCloudOrigin()) != null) {
                        var28_35 = v11.getImportedAt();
                        var29_36 = ((Number)var28_35).longValue();
                        var23_30 = v7;
                        var24_31 = v6;
                        var25_32 = v5;
                        var31_37 = false;
                        var27_34 = var29_36 > 0L;
                        v5 = var25_32;
                        v6 = var24_31;
                        v7 = var23_30;
                        v12 = var27_34 ? var28_35 : null;
                    } else {
                        v12 = null;
                    }
                    v10 = v12 != null ? v12.longValue() : Instant.now().toEpochMilli();
                }
                v13 = shared;
                if (v13 != null) {
                    v14 = v13;
                } else {
                    v15 = previousOrigin;
                    v16 = v15 != null ? Boolean.valueOf(v15.getShared()) : null;
                    if (v16 != null) {
                        v14 = v16;
                    } else {
                        v17 = existingOwned;
                        v18 = v17 != null && (v17 = v17.getCloudOrigin()) != null ? Boolean.valueOf(v17.getShared()) : null;
                        v14 = v18 != null ? v18 : false;
                    }
                }
                var32_38 = null;
                var33_39 = 256;
                var34_40 = false;
                var35_41 = v14;
                var36_42 = cloudName;
                var37_43 = revision;
                var38_44 = true;
                var39_45 = v10;
                var41_46 = v7;
                var42_47 = v6;
                var43_48 = v5;
                origin = new CloudConfigOrigin(var43_48, var42_47, var41_46, var39_45, var38_44, var37_43, var36_42, var35_41, var34_40, var33_39, var32_38);
                root.add("CloudOrigin", $this$markOwnedCloudConfig_u24lambda_u240.serializeCloudOrigin(origin));
                v19 = previousOrigin;
                v20 = v19 != null ? v19.getOwned() : false;
                if (v20) {
                    v21 = name;
                } else {
                    v22 = existingOwned;
                    v21 = v22 != null ? v22.getName() : $this$markOwnedCloudConfig_u24lambda_u240.availableCloudConfigName(cloudName);
                }
                targetName = v21;
                target = ConfigManager.configPath.resolve(targetName + ".json");
                Intrinsics.checkNotNull(target);
                v23 = ConfigManager.gson.toJson(root);
                Intrinsics.checkNotNullExpressionValue(v23, "toJson(...)");
                $this$markOwnedCloudConfig_u24lambda_u240.writeAtomically(target, v23);
                var17_23 = $this$markOwnedCloudConfig_u24lambda_u240;
                try {
                    $this$markOwnedCloudConfig_u24lambda_u240_u244 = var17_23;
                    $i$a$-runCatching-ConfigManager$markOwnedCloudConfig$1$2 = false;
                    validationError = Result.constructor-impl($this$markOwnedCloudConfig_u24lambda_u240_u244.parseConfig(target));
                }
                catch (Throwable $i$a$-getOrElse-ConfigManager$markOwnedCloudConfig$1$3) {
                    validationError = Result.constructor-impl(ResultKt.createFailure($i$a$-getOrElse-ConfigManager$markOwnedCloudConfig$1$3));
                }
                var17_23 = validationError;
                v24 = Result.exceptionOrNull-impl(var17_23);
                if (v24 != null) {
                    var18_24 = v24;
                    var19_27 = false;
                    if (!target.equals(source) && var20_28 == null) {
                        Files.deleteIfExists(var16_22);
                    }
                    throw var18_24;
                }
                if (var16_22.equals(source)) {
                    if (StringsKt.equals(ConfigManager.activeConfigName, name, true)) {
                        ConfigManager.activeCloudOrigin = var14_19;
                    }
                }
                super.markVisibleConfigsDirty();
                var10_10 = Result.constructor-impl(Unit.INSTANCE);
            }
            catch (Throwable error) {
                var10_10 = Result.constructor-impl(ResultKt.createFailure(error));
            }
            var9_9 = var10_10;
            v25 = Result.exceptionOrNull-impl(var9_9);
            if (v25 == null) break block30;
            var11_13 = var10_10 = v25;
            var12_15 = false;
            ConfigManager.logger.error("Failed to mark '" + (String)var1_1 + "' as an owned cloud config", (Throwable)var11_13);
        }
        return Result.isSuccess-impl(var9_9);
    }

    /*
     * WARNING - void declaration
     */
    @Nullable
    public final String importCloudConfig(@NotNull String preferredName, @NotNull String ownerName, @NotNull String configId, @NotNull String contentHash, @NotNull JsonObject payload) {
        Object object;
        block11: {
            block10: {
                Intrinsics.checkNotNullParameter(preferredName, "preferredName");
                Intrinsics.checkNotNullParameter(ownerName, "ownerName");
                Intrinsics.checkNotNullParameter(configId, "configId");
                Intrinsics.checkNotNullParameter(contentHash, "contentHash");
                Intrinsics.checkNotNullParameter(payload, "payload");
                if (StringsKt.isBlank(configId)) break block10;
                if (this.verifyCloudPayloadHash(payload, contentHash)) break block11;
            }
            return null;
        }
        Object object2 = this;
        try {
            void validationError;
            Object $this$importCloudConfig_u24lambda_u240_u242;
            String targetName;
            JsonElement jsonElement;
            ConfigManager $this$importCloudConfig_u24lambda_u240 = object2;
            boolean bl = false;
            if (!(!payload.has(CLOUD_ORIGIN_KEY))) {
                boolean $i$a$-require-ConfigManager$importCloudConfig$1$22 = false;
                String $i$a$-require-ConfigManager$importCloudConfig$1$22 = "Cloud payload already has provenance";
                throw new IllegalArgumentException($i$a$-require-ConfigManager$importCloudConfig$1$22.toString());
            }
            $this$importCloudConfig_u24lambda_u240.parseConfigRoot(payload);
            $this$importCloudConfig_u24lambda_u240.ensureConfigDirectory();
            CloudConfigOrigin origin = new CloudConfigOrigin(configId, StringsKt.take(ownerName, 64), contentHash, Instant.now().toEpochMilli(), false, 0, preferredName, false, true, 128, null);
            JsonElement root = jsonElement = payload.deepCopy();
            boolean bl2 = false;
            ((JsonObject)root).add(CLOUD_ORIGIN_KEY, $this$importCloudConfig_u24lambda_u240.serializeCloudOrigin(origin));
            void imported = targetName;
            targetName = $this$importCloudConfig_u24lambda_u240.availableCloudConfigName(preferredName);
            Path target = configPath.resolve(targetName + ".json");
            Intrinsics.checkNotNull(target);
            String string = gson.toJson((JsonElement)imported);
            Intrinsics.checkNotNullExpressionValue(string, "toJson(...)");
            $this$importCloudConfig_u24lambda_u240.writeAtomically(target, string);
            ConfigManager configManager = $this$importCloudConfig_u24lambda_u240;
            try {
                $this$importCloudConfig_u24lambda_u240_u242 = configManager;
                boolean bl3 = false;
                $this$importCloudConfig_u24lambda_u240_u242 = Result.constructor-impl(super.parseConfig(target));
            }
            catch (Throwable bl3) {
                $this$importCloudConfig_u24lambda_u240_u242 = Result.constructor-impl(ResultKt.createFailure(bl3));
            }
            configManager = validationError;
            Throwable throwable = Result.exceptionOrNull-impl(configManager);
            if (throwable != null) {
                void var12_17;
                Throwable throwable2 = throwable;
                boolean bl4 = false;
                Files.deleteIfExists((Path)var12_17);
                throw throwable2;
            }
            super.markVisibleConfigsDirty();
            object = Result.constructor-impl(jsonElement);
        }
        catch (Throwable bl) {
            object = Result.constructor-impl(ResultKt.createFailure(bl));
        }
        object2 = object;
        Throwable throwable = Result.exceptionOrNull-impl(object2);
        if (throwable != null) {
            void var8_10;
            Object error = object = throwable;
            boolean bl = false;
            logger.error("Failed to import cloud config '" + preferredName + "'", (Throwable)var8_10);
        }
        return (String)(Result.isFailure-impl(object2) ? null : object2);
    }

    private final float parseFloat(JsonElement element) {
        Float f;
        block5: {
            JsonPrimitive primitive;
            block4: {
                primitive = this.requirePrimitive(element);
                if (!primitive.isNumber()) {
                    boolean bl = false;
                    String string = "Expected number value";
                    throw new IllegalArgumentException(string.toString());
                }
                String string = primitive.getAsString();
                Intrinsics.checkNotNullExpressionValue(string, "getAsString(...)");
                Float f2 = StringsKt.toFloatOrNull(string);
                if (f2 == null) break block4;
                Float f3 = f2;
                float it = ((Number)f3).floatValue();
                boolean bl = false;
                f = Math.abs(it) <= Float.MAX_VALUE ? f3 : null;
                if (f != null) break block5;
            }
            throw new IllegalStateException(("Invalid number value: " + primitive.getAsString()).toString());
        }
        return f.floatValue();
    }

    /*
     * Unable to fully structure code
     */
    @Nullable
    public final String getSelectedVisibleConfigName() {
        block9: {
            block11: {
                block10: {
                    this.ensureVisibleConfigsCache();
                    v0 = ConfigManager.selectedConfigName;
                    if (v0 == null) {
                        return null;
                    }
                    selected = v0;
                    if (!this.isValidName(selected)) break block10;
                    if (!StringsKt.equals(selected, "AutoLoad", true)) break block11;
                }
                this.setSelectedConfigName(null);
                return null;
            }
            $this$none$iv = ConfigManager.visibleConfigNamesCache;
            $i$f$none = false;
            if (!($this$none$iv instanceof Collection)) ** GOTO lbl-1000
            if (((Collection)$this$none$iv).isEmpty()) {
                v1 = true;
            } else lbl-1000:
            // 3 sources

            {
                for (T element$iv : $this$none$iv) {
                    it = (String)element$iv;
                    var7_7 = false;
                    if (!StringsKt.equals((String)var6_6, selected, true)) continue;
                    v1 = false;
                    break block9;
                }
                v1 = true;
            }
        }
        if (v1) {
            this.setSelectedConfigName(null);
            return null;
        }
        return var1_1;
    }

    public final boolean unloadActiveCloudConfig() {
        return true;
    }

    private final int parseInt(JsonElement element) {
        JsonPrimitive primitive = this.requirePrimitive(element);
        if (!primitive.isNumber()) {
            boolean bl = false;
            String string = "Expected integer value";
            throw new IllegalArgumentException(string.toString());
        }
        String string = primitive.getAsString();
        Intrinsics.checkNotNullExpressionValue(string, "getAsString(...)");
        Integer n = StringsKt.toIntOrNull(string);
        if (n == null) {
            throw new IllegalStateException(("Invalid integer value: " + primitive.getAsString()).toString());
        }
        return n;
    }

    /*
     * WARNING - void declaration
     */
    public final boolean setCloudConfigShared(@NotNull String name, boolean shared) {
        Object object;
        block11: {
            void var6_8;
            void var1_1;
            Object object2;
            Intrinsics.checkNotNullParameter(name, "name");
            if (!this.isValidName(name)) {
                return false;
            }
            Path target = configPath.resolve(name + ".json");
            if (!Files.isRegularFile(target, new LinkOption[0])) {
                return false;
            }
            object = this;
            try {
                CloudConfigOrigin cloudConfigOrigin;
                JsonObject root;
                ConfigManager $this$setCloudConfigShared_u24lambda_u240;
                block10: {
                    block9: {
                        void var10_13;
                        CloudConfigOrigin cloudConfigOrigin2;
                        $this$setCloudConfigShared_u24lambda_u240 = object;
                        boolean bl = false;
                        Intrinsics.checkNotNull(target);
                        JsonObject jsonObject = gson.fromJson($this$setCloudConfigShared_u24lambda_u240.readConfigText(target), JsonObject.class);
                        if (jsonObject == null) {
                            throw new IllegalStateException("Config root is missing".toString());
                        }
                        root = jsonObject;
                        CloudConfigOrigin cloudConfigOrigin3 = $this$setCloudConfigShared_u24lambda_u240.readCloudOrigin(root);
                        if (cloudConfigOrigin3 == null) break block9;
                        CloudConfigOrigin it = cloudConfigOrigin2 = cloudConfigOrigin3;
                        boolean bl2 = false;
                        cloudConfigOrigin = var10_13.getOwned() ? cloudConfigOrigin2 : null;
                        if (cloudConfigOrigin != null) break block10;
                    }
                    throw new IllegalStateException("Owned cloud origin is missing".toString());
                }
                CloudConfigOrigin origin = cloudConfigOrigin;
                if (origin.getShared() != shared) {
                    root.add(CLOUD_ORIGIN_KEY, $this$setCloudConfigShared_u24lambda_u240.serializeCloudOrigin(CloudConfigOrigin.copy$default(origin, null, null, null, 0L, false, 0, null, shared, false, 383, null)));
                    String string = gson.toJson(root);
                    Intrinsics.checkNotNullExpressionValue(string, "toJson(...)");
                    $this$setCloudConfigShared_u24lambda_u240.writeAtomically(target, string);
                    super.markVisibleConfigsDirty();
                }
                object2 = Result.constructor-impl(Unit.INSTANCE);
            }
            catch (Throwable bl) {
                object2 = Result.constructor-impl(ResultKt.createFailure(bl));
            }
            object = object2;
            Throwable throwable = Result.exceptionOrNull-impl(object);
            if (throwable == null) break block11;
            Object error = object2 = throwable;
            boolean bl = false;
            logger.error("Failed to update shared state for '" + (String)var1_1 + "'", (Throwable)var6_8);
        }
        return Result.isSuccess-impl(object);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final JsonObject findModuleJson(JsonObject content, Module module) {
        JsonObject jsonObject = this.optionalObject(content, this.moduleConfigKey(module));
        if (jsonObject != null) {
            return jsonObject;
        }
        Iterable $this$count$iv = \u062e\u064b.INSTANCE.getModules();
        boolean $i$f$count = false;
        if ($this$count$iv instanceof Collection) {
            if (((Collection)$this$count$iv).isEmpty()) {
                return null;
            }
        }
        int count$iv = 0;
        for (Object element$iv : $this$count$iv) {
            Module it = (Module)element$iv;
            boolean bl = false;
            if (!Intrinsics.areEqual(it.getName(), module.getName()) || ++count$iv >= 0) continue;
            CollectionsKt.throwCountOverflow();
        }
        int n = count$iv;
        if (n != true) return null;
        jsonObject = this.optionalObject(content, module.getName());
        if (jsonObject == null) return null;
        return jsonObject;
    }

    /*
     * WARNING - void declaration
     */
    private final RuntimeSnapshot captureRuntimeSnapshot() {
        void var1_16;
        void var6_8;
        void $this$mapTo$iv$iv;
        Collection collection;
        void $this$mapTo$iv$iv2;
        Iterable $this$map$iv = \u0633\u0631.INSTANCE.getSettings();
        boolean $i$f$map = false;
        Iterable iterable = $this$map$iv;
        Iterable destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        boolean $i$f$mapTo = false;
        for (Object item$iv$iv : $this$mapTo$iv$iv2) {
            Setting it = (Setting)item$iv$iv;
            collection = destination$iv$iv;
            boolean bl = false;
            collection.add(new SettingUpdate(it, INSTANCE.settingValue(it)));
        }
        List clickGuiSettings = (List)destination$iv$iv;
        Iterable $this$map$iv2 = \u062e\u064b.INSTANCE.getModules();
        boolean $i$f$map2 = false;
        destination$iv$iv = $this$map$iv2;
        Collection destination$iv$iv2 = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv2, 10));
        boolean $i$f$mapTo2 = false;
        for (Object item$iv$iv : $this$mapTo$iv$iv) {
            void var18_24;
            Collection<SettingUpdate> collection2;
            void $this$mapTo$iv$iv3;
            Module module = (Module)item$iv$iv;
            collection = destination$iv$iv2;
            boolean bl = false;
            Iterable $this$map$iv3 = module.getSettings();
            Boolean bl2 = module.isPreferredEnabled();
            Integer n = module.getKey();
            Module module2 = module;
            boolean $i$f$map3 = false;
            Iterable iterable2 = $this$map$iv3;
            Collection destination$iv$iv3 = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv3, 10));
            boolean $i$f$mapTo3 = false;
            for (Object item$iv$iv2 : $this$mapTo$iv$iv3) {
                void var22_28;
                Setting it = (Setting)item$iv$iv2;
                collection2 = destination$iv$iv3;
                boolean bl3 = false;
                collection2.add(new SettingUpdate((Setting<?>)var22_28, INSTANCE.settingValue((Setting<?>)var22_28)));
            }
            Collection<SettingUpdate> collection3 = collection2 = (List)var18_24;
            Boolean bl4 = bl2;
            Integer n2 = n;
            Module module3 = module2;
            collection.add(new ModuleUpdate(module3, n2, bl4, (List<SettingUpdate>)collection3));
        }
        List list = (List)var6_8;
        return new RuntimeSnapshot((List<SettingUpdate>)var1_16, list);
    }

    @NotNull
    public final List<String> getConfigNames() {
        this.ensureConfigDirectory();
        File[] fileArray = configPath.toFile().listFiles(ConfigManager::getConfigNames$lambda$0);
        if (fileArray == null) {
            return CollectionsKt.emptyList();
        }
        File[] files = fileArray;
        Sequence<String> $this$sortedBy$iv = SequencesKt.map(SequencesKt.filterNot(SequencesKt.map(ArraysKt.asSequence(files), \u0627\u0622.INSTANCE), new \u0633\u0625(this)), ConfigManager::getConfigNames$lambda$1);
        boolean $i$f$sortedBy = false;
        return SequencesKt.toList(SequencesKt.sortedWith($this$sortedBy$iv, new \u062b\u0632()));
    }

    private final void ensureVisibleConfigsCache() {
        this.rebuildVisibleConfigs(false);
    }

    private final void restoreMisplacedInternalFile(String fileName) {
        block8: {
            Object object;
            Path actual;
            Path misplaced;
            block7: {
                block6: {
                    misplaced = configPath.resolve(fileName);
                    actual = legacyConfigPath.resolve(fileName);
                    if (!Files.exists(misplaced, new LinkOption[0])) break block6;
                    if (!Files.exists(actual, new LinkOption[0])) break block7;
                }
                return;
            }
            Object object2 = this;
            try {
                ConfigManager $this$restoreMisplacedInternalFile_u24lambda_u240 = object2;
                boolean bl = false;
                Files.createDirectories(actual.getParent(), new FileAttribute[0]);
                object = Result.constructor-impl(Files.move(misplaced, actual, new CopyOption[0]));
            }
            catch (Throwable bl) {
                object = Result.constructor-impl(ResultKt.createFailure(bl));
            }
            object2 = object;
            Throwable throwable = Result.exceptionOrNull-impl(object2);
            if (throwable == null) break block8;
            Object it = object = throwable;
            boolean bl = false;
            ConfigManager configManager = INSTANCE;
            try {
                ConfigManager $this$restoreMisplacedInternalFile_u24lambda_u241_u240 = configManager;
                boolean bl2 = false;
                Object object3 = Result.constructor-impl(Files.copy(misplaced, actual, new CopyOption[0]));
            }
            catch (Throwable throwable2) {
                Object object4 = Result.constructor-impl(ResultKt.createFailure(throwable2));
            }
        }
    }

    public final int getStateVersion() {
        return stateVersion;
    }

    private final JsonPrimitive requirePrimitive(JsonElement element) {
        if (!element.isJsonPrimitive()) {
            boolean bl = false;
            String string = "Expected primitive value";
            throw new IllegalArgumentException(string.toString());
        }
        JsonPrimitive jsonPrimitive = element.getAsJsonPrimitive();
        Intrinsics.checkNotNullExpressionValue(jsonPrimitive, "getAsJsonPrimitive(...)");
        return jsonPrimitive;
    }

    /*
     * WARNING - void declaration
     */
    private final ParsedConfig parseConfigRoot(JsonObject root) {
        void var4_9;
        void var1_1;
        void var2_6;
        void var9_14;
        List<Object> list;
        int n;
        JsonElement jsonElement = root.get(FORMAT_VERSION_KEY);
        if (jsonElement != null) {
            JsonElement p0 = jsonElement;
            boolean bl = false;
            n = this.parseInt(p0);
        } else {
            n = 1;
        }
        int formatVersion = n;
        if (!(1 <= formatVersion ? formatVersion < 3 : false)) {
            boolean $i$a$-require-ConfigManager$parseConfigRoot$22 = false;
            String $i$a$-require-ConfigManager$parseConfigRoot$22 = "Unsupported config format version: " + formatVersion;
            throw new IllegalArgumentException($i$a$-require-ConfigManager$parseConfigRoot$22.toString());
        }
        JsonObject content = this.requireObject(root.get(CONTENT_KEY), CONTENT_KEY);
        Object object = this.findClickGuiSettings(content);
        if (object != null) {
            JsonObject it = object;
            boolean bl = false;
            list = INSTANCE.parseSettings(\u0633\u0631.INSTANCE.getSettings(), it, formatVersion, null);
        } else {
            list = null;
        }
        List list2 = list;
        if (list == null) {
            list2 = CollectionsKt.emptyList();
        }
        List clickGuiSettings = list2;
        Iterable $this$mapNotNull$iv = \u062e\u064b.INSTANCE.getModules();
        boolean $i$f$mapNotNull = false;
        Iterable $this$mapNotNullTo$iv$iv = $this$mapNotNull$iv;
        Collection destination$iv$iv = new ArrayList();
        boolean $i$f$mapNotNullTo = false;
        Iterable $this$forEach$iv$iv$iv = $this$mapNotNullTo$iv$iv;
        boolean $i$f$forEach = false;
        Iterator iterator2 = $this$forEach$iv$iv$iv.iterator();
        while (iterator2.hasNext()) {
            ModuleUpdate moduleUpdate;
            JsonObject jsonObject;
            void var17_22;
            Object element$iv$iv$iv;
            Object element$iv$iv = element$iv$iv$iv = iterator2.next();
            boolean bl = false;
            Module module = (Module)element$iv$iv;
            boolean bl2 = false;
            if ((INSTANCE.findModuleJson(content, module) == null ? null : INSTANCE.parseModule((Module)var17_22, jsonObject, formatVersion)) == null) continue;
            moduleUpdate = moduleUpdate;
            boolean bl3 = false;
            var9_14.add(moduleUpdate);
        }
        object = (List)var9_14;
        return new ParsedConfig((int)var2_6, this.readAuthor((JsonObject)var1_1), this.readCloudOrigin((JsonObject)var1_1), (List<SettingUpdate>)var4_9, (List<ModuleUpdate>)object);
    }

    @NotNull
    public final List<String> getVisibleConfigNames() {
        this.ensureVisibleConfigsCache();
        return visibleConfigNamesCache;
    }

    /*
     * WARNING - void declaration
     */
    private final List<SettingUpdate> parseSettings(List<? extends Setting<?>> settings, JsonObject json, int formatVersion, Module module) {
        void var8_8;
        void $this$mapIndexedNotNullTo$iv$iv;
        Iterable $this$mapIndexedNotNull$iv = settings;
        boolean $i$f$mapIndexedNotNull = false;
        Iterable iterable = $this$mapIndexedNotNull$iv;
        Collection destination$iv$iv = new ArrayList();
        boolean $i$f$mapIndexedNotNullTo = false;
        void $this$forEachIndexed$iv$iv$iv = $this$mapIndexedNotNullTo$iv$iv;
        boolean $i$f$forEachIndexed = false;
        int index$iv$iv$iv = 0;
        for (Object item$iv$iv$iv : $this$forEachIndexed$iv$iv$iv) {
            void var23_23;
            SettingUpdate it$iv$iv;
            void var22_22;
            int n;
            if ((n = index$iv$iv$iv++) < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Object element$iv$iv = item$iv$iv$iv;
            int index$iv$iv = n;
            boolean bl = false;
            Setting setting = (Setting)element$iv$iv;
            int index = index$iv$iv;
            boolean bl2 = false;
            if ((INSTANCE.findSettingElement(settings, setting, index, json, formatVersion, module) == null ? null : new SettingUpdate(setting, INSTANCE.parseSettingValue(setting, (JsonElement)var22_22, formatVersion))) == null) continue;
            it$iv$iv = it$iv$iv;
            boolean bl3 = false;
            destination$iv$iv.add(var23_23);
        }
        return (List)var8_8;
    }

    /*
     * Unable to fully structure code
     */
    private final int legacySettingIndex(Module module, int index, JsonObject json) {
        v0 = module;
        if (v0 != null) {
            p0 = v0;
            $i$a$-let-ConfigManager$legacySettingIndex$removedStatusEffectsSetting$1 = false;
            v1 = this.moduleConfigKey(p0);
        } else {
            v1 = null;
        }
        if (!Intrinsics.areEqual(v1, "RenderTweaksModule") || module.getSettings().size() != 8) ** GOTO lbl-1000
        if (!json.has(this.settingConfigKey(8))) ** GOTO lbl-1000
        if (!json.has(this.settingConfigKey(9))) {
            v2 = true;
        } else lbl-1000:
        // 3 sources

        {
            v2 = false;
        }
        removedStatusEffectsSetting = v2;
        if (!removedStatusEffectsSetting) ** GOTO lbl-1000
        if (index >= 2) {
            v3 = var2_2 + true;
        } else lbl-1000:
        // 2 sources

        {
            v3 = var2_2;
        }
        return (int)v3;
    }

    /*
     * WARNING - void declaration
     */
    private final JsonObject findClickGuiSettings(JsonObject content) {
        JsonObject module;
        JsonObject jsonObject = this.optionalObject(content, CLICK_GUI_SETTINGS_KEY);
        if (jsonObject != null) {
            JsonObject it = jsonObject;
            boolean bl = false;
            return it;
        }
        JsonObject jsonObject2 = this.optionalObject(content, LEGACY_CLICK_GUI_MODULE_KEY);
        if (jsonObject2 != null) {
            module = jsonObject2;
            boolean bl = false;
            JsonObject jsonObject3 = INSTANCE.optionalObject(module, "Settings");
            if (jsonObject3 != null) {
                JsonObject it = jsonObject3;
                boolean bl2 = false;
                return it;
            }
        }
        JsonObject jsonObject4 = this.optionalObject(content, LEGACY_CLICK_GUI_MODULE_NAME);
        if (jsonObject4 != null) {
            module = jsonObject4;
            boolean bl = false;
            JsonObject jsonObject5 = INSTANCE.optionalObject(module, "Settings");
            if (jsonObject5 != null) {
                void var4_7;
                JsonObject it = jsonObject5;
                boolean bl3 = false;
                return var4_7;
            }
        }
        return null;
    }

    private final void markVisibleConfigsDirty() {
        visibleConfigsDirty = true;
        int n = stateVersion;
        stateVersion = n + 1;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    private final String readConfigText(Path file) {
        void var2_14;
        byte[] byArray;
        if (!Files.isRegularFile(file, new LinkOption[0])) {
            boolean $i$a$-require-ConfigManager$readConfigText$22 = false;
            String $i$a$-require-ConfigManager$readConfigText$22 = "Config file is missing";
            throw new IllegalArgumentException($i$a$-require-ConfigManager$readConfigText$22.toString());
        }
        if (!(Files.size(file) <= 524288L)) {
            boolean bl = false;
            String string = "Config file exceeds the 524288 byte limit";
            throw new IllegalArgumentException(string.toString());
        }
        Closeable closeable = Files.newInputStream(file, new OpenOption[0]);
        Throwable throwable = null;
        try {
            InputStream input = (InputStream)closeable;
            boolean bl = false;
            byArray = byArray.readNBytes(524289);
        }
        catch (Throwable throwable2) {
            throwable = throwable2;
            throw throwable2;
        }
        finally {
            CloseableKt.closeFinally(closeable, throwable);
        }
        byte[] bytes = byArray;
        if (!(bytes.length <= 524288)) {
            boolean bl = false;
            String string = "Config file exceeds the 524288 byte limit";
            throw new IllegalArgumentException(string.toString());
        }
        Intrinsics.checkNotNull(var2_14);
        return new String((byte[])var2_14, Charsets.UTF_8);
    }

    private static final boolean loadVisibleConfigs$lambda$1(File it) {
        String string = it.getName();
        Intrinsics.checkNotNullExpressionValue(string, "getName(...)");
        return INSTANCE.isInternalConfigFile(string);
    }

    public final boolean remove(@NotNull String name) {
        Object $this$remove_u24lambda_u240;
        Intrinsics.checkNotNullParameter(name, "name");
        if (!this.isValidName(name)) {
            return false;
        }
        Object object = this;
        try {
            $this$remove_u24lambda_u240 = object;
            boolean bl = false;
            $this$remove_u24lambda_u240 = Result.constructor-impl(Files.deleteIfExists(configPath.resolve(name + ".json")));
        }
        catch (Throwable bl) {
            $this$remove_u24lambda_u240 = Result.constructor-impl(ResultKt.createFailure(bl));
        }
        object = $this$remove_u24lambda_u240;
        $this$remove_u24lambda_u240 = false;
        object = Result.isFailure-impl(object) ? $this$remove_u24lambda_u240 : object;
        boolean removed = (Boolean)object;
        boolean bl = false;
        if (removed) {
            INSTANCE.markVisibleConfigsDirty();
        }
        if (removed) {
            if (StringsKt.equals(selectedConfigName, name, true)) {
                INSTANCE.setSelectedConfigName(null);
            }
        }
        if (removed) {
            if (StringsKt.equals(activeConfigName, name, true)) {
                activeConfigName = null;
                activeCloudOrigin = null;
            }
        }
        return (Boolean)object;
    }

    private final String currentAuthor() {
        String string = \u0631\u063a.getUsername();
        Intrinsics.checkNotNullExpressionValue(string, "getUsername(...)");
        return string;
    }

    public final void refreshVisibleConfigsNow() {
        this.rebuildVisibleConfigs(true);
    }

    private ConfigManager() {
    }

    /*
     * WARNING - void declaration
     */
    private final CloudConfigOrigin readCloudOrigin(Path file) {
        Object object;
        if (!Files.isRegularFile(file, new LinkOption[0])) {
            return null;
        }
        Object object2 = this;
        try {
            void var5_6;
            ConfigManager $this$readCloudOrigin_u24lambda_u240 = object2;
            boolean bl = false;
            JsonObject jsonObject = gson.fromJson($this$readCloudOrigin_u24lambda_u240.readConfigText(file), JsonObject.class);
            if (jsonObject == null) {
                return null;
            }
            JsonObject root = jsonObject;
            object = Result.constructor-impl(super.readCloudOrigin((JsonObject)var5_6));
        }
        catch (Throwable throwable) {
            object = Result.constructor-impl(ResultKt.createFailure(throwable));
        }
        object2 = object;
        return (CloudConfigOrigin)(Result.isFailure-impl(object2) ? null : object2);
    }

    /*
     * Unable to fully structure code
     */
    private final CloudConfigOrigin readCloudOrigin(JsonObject root) {
        block28: {
            block27: {
                block26: {
                    block25: {
                        block24: {
                            block23: {
                                var3_2 = root.get("CloudOrigin");
                                if (var3_2 == null) break block23;
                                var5_3 = var3_2;
                                p0 = var5_3;
                                $i$a$-takeIf-ConfigManager$readCloudOrigin$cloud$1 = false;
                                var4_8 = p0.isJsonObject() ? var5_3 : null;
                                if (var4_8 != null && (var5_3 = var4_8.getAsJsonObject()) != null) break block24;
                            }
                            return null;
                        }
                        cloud = var5_3;
                        var4_8 = cloud.get("ConfigId");
                        if (var4_8 == null) break block25;
                        p0 = var4_8;
                        p0 = p0;
                        $i$a$-takeIf-ConfigManager$readCloudOrigin$configId$1 = false;
                        var5_3 = var7_7.isJsonPrimitive() ? p0 : null;
                        if (var5_3 == null || (p0 = var5_3.getAsString()) == null) break block25;
                        p0 = $i$a$-takeIf-ConfigManager$readCloudOrigin$configId$1 = p0;
                        $i$a$-takeIf-ConfigManager$readCloudOrigin$configId$2 = false;
                        var7_7 = !StringsKt.isBlank((CharSequence)p0) ? $i$a$-takeIf-ConfigManager$readCloudOrigin$configId$1 : null;
                        if (var7_7 != null) break block26;
                    }
                    return null;
                }
                configId = var7_7;
                var5_3 = cloud.get("OwnerName");
                if (var5_3 == null) ** GOTO lbl-1000
                p0 = var7_7 = var5_3;
                $i$a$-takeIf-ConfigManager$readCloudOrigin$ownerName$1 = false;
                p0 = p0.isJsonPrimitive() ? var7_7 : null;
                if (p0 == null || (var7_7 = p0.getAsString()) == null) ** GOTO lbl-1000
                p0 = $i$a$-takeIf-ConfigManager$readCloudOrigin$ownerName$1 = var7_7;
                $i$a$-takeIf-ConfigManager$readCloudOrigin$ownerName$2 = false;
                p0 = !StringsKt.isBlank((CharSequence)p0) ? $i$a$-takeIf-ConfigManager$readCloudOrigin$ownerName$1 : null;
                if (p0 != null) {
                    v0 = p0;
                } else lbl-1000:
                // 3 sources

                {
                    v0 = "Unknown";
                }
                ownerName = v0;
                p0 = cloud.get("ContentHash");
                if (p0 == null) break block27;
                p0 = p0 = p0;
                $i$a$-takeIf-ConfigManager$readCloudOrigin$contentHash$1 = false;
                var7_7 = p0.isJsonPrimitive() ? p0 : null;
                if (var7_7 == null || (p0 = var7_7.getAsString()) == null) break block27;
                p0 = $i$a$-takeIf-ConfigManager$readCloudOrigin$contentHash$1 = p0;
                $i$a$-takeIf-ConfigManager$readCloudOrigin$contentHash$2 = false;
                p0 = !StringsKt.isBlank((CharSequence)p0) ? $i$a$-takeIf-ConfigManager$readCloudOrigin$contentHash$1 : null;
                if (p0 != null) break block28;
            }
            return null;
        }
        contentHash = p0;
        p0 = cloud.get("ImportedAt");
        if (p0 == null) ** GOTO lbl-1000
        p0 = $i$a$-takeIf-ConfigManager$readCloudOrigin$contentHash$1 = p0;
        $i$a$-takeIf-ConfigManager$readCloudOrigin$importedAt$1 = false;
        p0 = p0.isJsonPrimitive() ? $i$a$-takeIf-ConfigManager$readCloudOrigin$contentHash$1 : null;
        if (p0 != null) {
            v1 = p0.getAsLong();
        } else lbl-1000:
        // 2 sources

        {
            v1 = 0L;
        }
        importedAt = v1;
        p0 = cloud.get("Owned");
        if (p0 == null) ** GOTO lbl-1000
        p0 = p0 = p0;
        $i$a$-takeIf-ConfigManager$readCloudOrigin$owned$1 = false;
        $i$a$-takeIf-ConfigManager$readCloudOrigin$contentHash$1 = p0.isJsonPrimitive() ? p0 : null;
        if ($i$a$-takeIf-ConfigManager$readCloudOrigin$contentHash$1 != null) {
            v2 = $i$a$-takeIf-ConfigManager$readCloudOrigin$contentHash$1.getAsBoolean();
        } else lbl-1000:
        // 2 sources

        {
            v2 = false;
        }
        owned = v2;
        $i$a$-takeIf-ConfigManager$readCloudOrigin$contentHash$1 = cloud.get("Revision");
        if ($i$a$-takeIf-ConfigManager$readCloudOrigin$contentHash$1 == null) ** GOTO lbl-1000
        var13_30 = p0 = $i$a$-takeIf-ConfigManager$readCloudOrigin$contentHash$1;
        $i$a$-takeIf-ConfigManager$readCloudOrigin$revision$1 = false;
        p0 = var13_30.isJsonPrimitive() ? p0 : null;
        if (p0 != null) {
            v3 = RangesKt.coerceAtLeast(p0.getAsInt(), 0);
        } else lbl-1000:
        // 2 sources

        {
            v3 = 0;
        }
        revision = v3;
        p0 = cloud.get("Name");
        if (p0 == null) ** GOTO lbl-1000
        var14_35 = var13_31 = p0;
        p0 = false;
        p0 = var14_35.isJsonPrimitive() ? var13_31 : null;
        if (p0 != null && (var13_31 = p0.getAsString()) != null) {
            p0 = var14_35 = var13_31;
            $i$a$-takeIf-ConfigManager$readCloudOrigin$cloudName$2 = false;
            v4 = !StringsKt.isBlank((CharSequence)p0) ? var14_35 : null;
        } else lbl-1000:
        // 2 sources

        {
            v4 = null;
        }
        cloudName = v4;
        p0 = cloud.get("Shared");
        if (p0 == null) ** GOTO lbl-1000
        var15_40 = var14_36 = p0;
        $i$a$-takeIf-ConfigManager$readCloudOrigin$shared$1 = false;
        var13_32 = var15_40.isJsonPrimitive() ? var14_36 : null;
        if (var13_32 != null) {
            v5 = var13_32.getAsBoolean();
        } else lbl-1000:
        // 2 sources

        {
            v5 = false;
        }
        shared = v5;
        var13_33 = cloud.get("AccountSynced");
        if (var13_33 == null) ** GOTO lbl-1000
        var16_43 = var15_41 = var13_33;
        var17_44 = false;
        var14_37 = var16_43.isJsonPrimitive() ? var15_41 : null;
        if (var14_37 != null) {
            v6 = var14_37.getAsBoolean();
        } else lbl-1000:
        // 2 sources

        {
            v6 = false;
        }
        var12_28 = v6;
        return new CloudConfigOrigin((String)var3_2, (String)var4_8, (String)var5_3, (long)var6_5, (boolean)var8_12, (int)var9_15, (String)var10_19, (boolean)var11_22, var12_28);
    }

    public final boolean isCloudConfigActive() {
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean isManualConfigName(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (!this.isValidName(name)) return false;
        if (!manualConfigNameRegex.matches(name)) return false;
        if (StringsKt.equals(name, AUTO_LOAD_CONFIG, true)) return false;
        return true;
    }

    /*
     * WARNING - void declaration
     */
    private final String moduleConfigKey(Module module) {
        String string = module.getClass().getSimpleName();
        String p0 = string;
        boolean bl = false;
        String string2 = !StringsKt.isBlank(p0) ? string : null;
        String string3 = string2;
        if (string2 == null) {
            void var1_1;
            string3 = var1_1.getName();
        }
        return string3;
    }

    /*
     * WARNING - void declaration
     */
    private final void migrateLoadedConfig(Path file, ParsedConfig config) {
        block3: {
            void var5_7;
            Object object;
            if (config.getFormatVersion() >= 2) {
                return;
            }
            Object object2 = this;
            try {
                ConfigManager $this$migrateLoadedConfig_u24lambda_u240 = object2;
                boolean bl = false;
                String string = gson.toJson($this$migrateLoadedConfig_u24lambda_u240.serializeConfig(config.getAuthor(), config.getCloudOrigin()));
                Intrinsics.checkNotNullExpressionValue(string, "toJson(...)");
                $this$migrateLoadedConfig_u24lambda_u240.writeAtomically(file, string);
                object = Result.constructor-impl(Unit.INSTANCE);
            }
            catch (Throwable bl) {
                object = Result.constructor-impl(ResultKt.createFailure(bl));
            }
            object2 = object;
            Throwable throwable = Result.exceptionOrNull-impl(object2);
            if (throwable == null) break block3;
            Object error = object = throwable;
            boolean bl = false;
            logger.error("Failed to migrate config '" + file.getFileName() + "'", (Throwable)var5_7);
        }
    }

    private final Object parseSettingValue(Setting<?> setting, JsonElement element, int formatVersion) {
        Serializable serializable;
        Setting<?> setting2 = setting;
        if (setting2 instanceof BooleanSetting) {
            serializable = Boolean.valueOf(this.parseBoolean(element));
        } else if (setting2 instanceof SliderSetting) {
            serializable = Float.valueOf(this.normalizeSlider((SliderSetting)setting, this.parseFloat(element)));
        } else if (setting2 instanceof ModeSetting) {
            serializable = (Serializable)((Object)this.parseMode((ModeSetting)setting, element, formatVersion));
        } else if (setting2 instanceof TextSetting) {
            String string;
            String value = string = ((TextSetting)setting).normalize(this.parseString(element));
            boolean bl = false;
            if (!((TextSetting)setting).accepts(value)) {
                boolean bl2 = false;
                String string2 = "Invalid text value for " + ((TextSetting)setting).getConfigKey();
                throw new IllegalArgumentException(string2.toString());
            }
            serializable = (Serializable)((Object)string);
        } else if (setting2 instanceof BindSetting) {
            serializable = Integer.valueOf(this.parseInt(element));
        } else if (setting2 instanceof ColorSetting) {
            serializable = new Color(this.parseInt(element), true);
        } else {
            throw new IllegalStateException(("Unsupported setting type: " + setting.getClass().getName()).toString());
        }
        return serializable;
    }

    private static final void migrateLegacyConfigs$lambda$0$3(Function1 $tmp0, Object p0) {
        $tmp0.invoke(p0);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final String readAuthor(JsonObject root) {
        Object object;
        Object object2;
        block4: {
            Object object3;
            JsonElement jsonElement;
            block3: {
                Object object4;
                JsonElement jsonElement2 = root.get("Author");
                if (jsonElement2 == null) break block3;
                Object object5 = jsonElement2;
                JsonElement p0 = object5;
                boolean bl = false;
                JsonElement jsonElement3 = p0.isJsonPrimitive() ? object5 : null;
                if (jsonElement3 == null) break block3;
                object5 = jsonElement3.getAsString();
                if (object5 == null) break block3;
                Object p02 = object4 = object5;
                boolean bl2 = false;
                object2 = !StringsKt.isBlank((CharSequence)p02) ? object4 : null;
                if (object2 != null) break block4;
            }
            if ((jsonElement = root.get("Author")) == null) return UNKNOWN_AUTHOR;
            Object object6 = object3 = jsonElement;
            boolean bl = false;
            if (!((JsonElement)object6).isJsonPrimitive()) return UNKNOWN_AUTHOR;
            JsonElement jsonElement4 = object3;
            JsonElement jsonElement5 = jsonElement4;
            if (jsonElement5 == null) return UNKNOWN_AUTHOR;
            object3 = jsonElement5.getAsString();
            if (object3 == null) return UNKNOWN_AUTHOR;
            Object p0 = object6 = object3;
            boolean bl3 = false;
            if (StringsKt.isBlank((CharSequence)p0)) return UNKNOWN_AUTHOR;
            boolean bl4 = true;
            if (!bl4) return UNKNOWN_AUTHOR;
            Object object7 = object6;
            object = object7;
            if (object7 != null) return object;
            return UNKNOWN_AUTHOR;
        }
        object = object2;
        return object;
    }

    private final void applySettingUpdate(SettingUpdate update) {
        Setting<?> setting = update.getSetting();
        if (setting instanceof BooleanSetting) {
            BooleanSetting booleanSetting = (BooleanSetting)setting;
            Object object = update.getValue();
            Intrinsics.checkNotNull(object, "null cannot be cast to non-null type kotlin.Boolean");
            booleanSetting.set((Boolean)object);
        } else if (setting instanceof SliderSetting) {
            SliderSetting sliderSetting = (SliderSetting)setting;
            Object object = update.getValue();
            Intrinsics.checkNotNull(object, "null cannot be cast to non-null type kotlin.Float");
            sliderSetting.setClamped(((Float)object).floatValue());
        } else if (setting instanceof ModeSetting) {
            ModeSetting modeSetting = (ModeSetting)setting;
            Object object = update.getValue();
            Intrinsics.checkNotNull(object, "null cannot be cast to non-null type kotlin.String");
            modeSetting.setMode((String)object);
        } else if (setting instanceof TextSetting) {
            TextSetting textSetting = (TextSetting)setting;
            Object object = update.getValue();
            Intrinsics.checkNotNull(object, "null cannot be cast to non-null type kotlin.String");
            textSetting.setText((String)object);
        } else if (setting instanceof BindSetting) {
            BindSetting bindSetting = (BindSetting)setting;
            Object object = update.getValue();
            Intrinsics.checkNotNull(object, "null cannot be cast to non-null type kotlin.Int");
            bindSetting.setKey((Integer)object);
        } else if (setting instanceof ColorSetting) {
            ColorSetting colorSetting = (ColorSetting)setting;
            Object object = update.getValue();
            Intrinsics.checkNotNull(object, "null cannot be cast to non-null type java.awt.Color");
            colorSetting.setColor((Color)object);
        } else {
            throw new IllegalStateException(("Unsupported setting type: " + setting.getClass().getName()).toString());
        }
    }

    private static final boolean loadVisibleConfigs$lambda$3(Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "<destruct>");
        String name = (String)pair.component1();
        return StringsKt.equals(name, AUTO_LOAD_CONFIG, true);
    }

    /*
     * WARNING - void declaration
     */
    public final boolean isValidName(@NotNull String name) {
        boolean bl;
        block11: {
            block15: {
                block14: {
                    block13: {
                        block12: {
                            Intrinsics.checkNotNullParameter(name, "name");
                            if (StringsKt.isBlank(name)) {
                                return false;
                            }
                            if (name.length() > 64) {
                                return false;
                            }
                            if (!Intrinsics.areEqual(name, ((Object)StringsKt.trim((CharSequence)name)).toString())) {
                                return false;
                            }
                            if (Intrinsics.areEqual(name, ".")) break block12;
                            if (!Intrinsics.areEqual(name, "..")) break block13;
                        }
                        return false;
                    }
                    if (StringsKt.endsWith$default((CharSequence)name, '.', false, 2, null)) break block14;
                    if (!StringsKt.endsWith$default((CharSequence)name, ' ', false, 2, null)) break block15;
                }
                return false;
            }
            String string = StringsKt.substringBefore$default(name, '.', null, 2, null).toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(string, "toUpperCase(...)");
            if (reservedWindowsNames.contains(string)) {
                return false;
            }
            CharSequence $this$none$iv = name;
            boolean $i$f$none = false;
            for (int i = 0; i < $this$none$iv.length(); ++i) {
                void var6_6;
                char element$iv;
                char it = element$iv = $this$none$iv.charAt(i);
                boolean bl2 = false;
                boolean bl3 = StringsKt.contains$default((CharSequence)"\\/:*?\"<>|", it, false, 2, null) || var6_6 < 32;
                if (!bl3) continue;
                bl = false;
                break block11;
            }
            bl = true;
        }
        return bl;
    }

    private final String parseString(JsonElement element) {
        JsonPrimitive primitive = this.requirePrimitive(element);
        if (!primitive.isString()) {
            boolean bl = false;
            String string = "Expected string value";
            throw new IllegalArgumentException(string.toString());
        }
        String string = primitive.getAsString();
        Intrinsics.checkNotNullExpressionValue(string, "getAsString(...)");
        return string;
    }

    public static final /* synthetic */ boolean access$isInternalConfigFile(ConfigManager $this, String fileName) {
        return $this.isInternalConfigFile(fileName);
    }

    /*
     * Unable to fully structure code
     */
    @Nullable
    public final String syncReceivedCloudConfig(@NotNull String preferredName, @NotNull String ownerName, @NotNull String configId, @NotNull String contentHash, @NotNull JsonObject payload) {
        block24: {
            block23: {
                Intrinsics.checkNotNullParameter(preferredName, "preferredName");
                Intrinsics.checkNotNullParameter(ownerName, "ownerName");
                Intrinsics.checkNotNullParameter(configId, "configId");
                Intrinsics.checkNotNullParameter(contentHash, "contentHash");
                Intrinsics.checkNotNullParameter(payload, "payload");
                if (StringsKt.isBlank(configId)) break block23;
                if (this.verifyCloudPayloadHash(payload, contentHash)) break block24;
            }
            return null;
        }
        var6_6 = this;
        try {
            block26: {
                block25: {
                    block22: {
                        $this$syncReceivedCloudConfig_u24lambda_u240 = var6_6;
                        $i$a$-runCatching-ConfigManager$syncReceivedCloudConfig$1 = false;
                        if (!(!payload.has("CloudOrigin"))) {
                            $i$a$-require-ConfigManager$syncReceivedCloudConfig$1$1 = false;
                            $i$a$-require-ConfigManager$syncReceivedCloudConfig$1$1 = "Cloud payload already has provenance";
                            throw new IllegalArgumentException($i$a$-require-ConfigManager$syncReceivedCloudConfig$1$1.toString());
                        }
                        $this$syncReceivedCloudConfig_u24lambda_u240.parseConfigRoot(payload);
                        $this$syncReceivedCloudConfig_u24lambda_u240.ensureConfigDirectory();
                        $this$syncReceivedCloudConfig_u24lambda_u240.refreshVisibleConfigsNow();
                        $this$firstOrNull$iv = ConfigManager.visibleConfigsCache;
                        $i$f$firstOrNull = false;
                        var11_19 = $this$firstOrNull$iv.iterator();
                        while (var11_19.hasNext()) {
                            element$iv = var11_19.next();
                            it = (ConfigInfo)element$iv;
                            $i$a$-firstOrNull-ConfigManager$syncReceivedCloudConfig$1$existing$1 = false;
                            v0 = it.getCloudOrigin();
                            v1 = v0 != null ? !v0.getOwned() : false;
                            if (!v1) ** GOTO lbl-1000
                            if (Intrinsics.areEqual(it.getCloudOrigin().getConfigId(), configId)) {
                                v2 = true;
                            } else lbl-1000:
                            // 2 sources

                            {
                                v2 = false;
                            }
                            if (!v2) continue;
                            v3 = element$iv;
                            break block22;
                        }
                        v3 = null;
                    }
                    existing = v3;
                    if (existing == null) break block25;
                    v4 = existing.getCloudOrigin();
                    Intrinsics.checkNotNull(v4);
                    previousOrigin = v4;
                    localHash = $this$syncReceivedCloudConfig_u24lambda_u240.cloudPayloadHash(existing.getName());
                    locallyChanged = localHash != null && !Intrinsics.areEqual(localHash, previousOrigin.getContentHash());
                    if (!locallyChanged) break block25;
                    if (!previousOrigin.getAccountSynced()) {
                        target = ConfigManager.configPath.resolve(existing.getName() + ".json");
                        Intrinsics.checkNotNull(target);
                        v5 = ConfigManager.gson.fromJson($this$syncReceivedCloudConfig_u24lambda_u240.readConfigText((Path)target), JsonObject.class);
                        if (v5 == null) {
                            throw new IllegalStateException("Config root is missing".toString());
                        }
                        root = v5;
                        root.add("CloudOrigin", $this$syncReceivedCloudConfig_u24lambda_u240.serializeCloudOrigin(CloudConfigOrigin.copy$default(previousOrigin, null, null, null, 0L, false, 0, null, false, true, 255, null)));
                        v6 = ConfigManager.gson.toJson((JsonElement)root);
                        Intrinsics.checkNotNullExpressionValue(v6, "toJson(...)");
                        $this$syncReceivedCloudConfig_u24lambda_u240.writeAtomically((Path)target, v6);
                        $this$syncReceivedCloudConfig_u24lambda_u240.markVisibleConfigsDirty();
                    }
                    v7 = existing.getName();
                    break block26;
                }
                v8 = configId;
                v9 = StringsKt.take(ownerName, 64);
                v10 = contentHash;
                v11 = existing;
                if (v11 == null || (v11 = v11.getCloudOrigin()) == null) ** GOTO lbl-1000
                $i$a$-firstOrNull-ConfigManager$syncReceivedCloudConfig$1$existing$1 = v11.getImportedAt();
                var16_30 = ((Number)$i$a$-firstOrNull-ConfigManager$syncReceivedCloudConfig$1$existing$1).longValue();
                var18_31 = v10;
                var19_32 = v9;
                var20_33 = v8;
                var21_34 = false;
                var22_35 = var16_30 > 0L;
                v8 = var20_33;
                v9 = var19_32;
                v10 = var18_31;
                v12 = var22_35 ? $i$a$-firstOrNull-ConfigManager$syncReceivedCloudConfig$1$existing$1 : null;
                v11 = v12;
                if (v12 != null) {
                    v13 = v11.longValue();
                } else lbl-1000:
                // 2 sources

                {
                    v13 = Instant.now().toEpochMilli();
                }
                v14 = false;
                v15 = 0;
                if (existing == null || (localHash = existing.getCloudOrigin()) == null || (locallyChanged = localHash.getCloudName()) == null) ** GOTO lbl-1000
                root = locallyChanged;
                p0 = root;
                var23_36 = v15;
                var24_37 = v14;
                var25_38 = v13;
                var18_31 = v10;
                var19_32 = v9;
                var20_33 = v8;
                $i$a$-takeIf-ConfigManager$syncReceivedCloudConfig$1$origin$2 = false;
                var28_42 = !StringsKt.isBlank(p0);
                v8 = var20_33;
                v9 = var19_32;
                v10 = var18_31;
                v13 = var25_38;
                v14 = var24_37;
                v15 = var23_36;
                target = var28_42 ? root : null;
                if (target != null) {
                    v16 = target;
                } else lbl-1000:
                // 2 sources

                {
                    v16 = preferredName;
                }
                var29_43 = null;
                var30_44 = 128;
                var31_45 = true;
                var32_46 = false;
                var33_47 = v16;
                var34_48 = v15;
                var35_49 = v14;
                var36_50 = v13;
                var38_51 = v10;
                var39_52 = v9;
                var40_53 = v8;
                origin = new CloudConfigOrigin(var40_53, var39_52, var38_51, var36_50, var35_49, var34_48, var33_47, var32_46, var31_45, var30_44, var29_43);
                root = locallyChanged = payload.deepCopy();
                var13_23 = false;
                root.add("CloudOrigin", $this$syncReceivedCloudConfig_u24lambda_u240.serializeCloudOrigin(origin));
                synchronized = targetName;
                v17 = existing;
                if (v17 == null || (v17 = v17.getName()) == null) {
                    v17 = $this$syncReceivedCloudConfig_u24lambda_u240.availableCloudConfigName(preferredName);
                }
                targetName = v17;
                target = ConfigManager.configPath.resolve((String)targetName + ".json");
                Intrinsics.checkNotNull(target);
                v18 = ConfigManager.gson.toJson((JsonElement)synchronized);
                Intrinsics.checkNotNullExpressionValue(v18, "toJson(...)");
                $this$syncReceivedCloudConfig_u24lambda_u240.writeAtomically((Path)target, v18);
                var13_24 = $this$syncReceivedCloudConfig_u24lambda_u240;
                try {
                    $this$syncReceivedCloudConfig_u24lambda_u240_u244 = var13_24;
                    $i$a$-runCatching-ConfigManager$syncReceivedCloudConfig$1$2 = false;
                    validationError = Result.constructor-impl($this$syncReceivedCloudConfig_u24lambda_u240_u244.parseConfig((Path)target));
                }
                catch (Throwable $i$a$-getOrElse-ConfigManager$syncReceivedCloudConfig$1$3) {
                    var14_28 = Result.constructor-impl(ResultKt.createFailure((Throwable)var27_40));
                }
                var13_24 = var14_28;
                v19 = Result.exceptionOrNull-impl(var13_24);
                if (v19 != null) {
                    var14_28 = v19;
                    var27_41 = false;
                    if (var15_29 == null) {
                        Files.deleteIfExists((Path)var12_21);
                    }
                    throw var14_28;
                }
                if (StringsKt.equals(ConfigManager.activeConfigName, var11_19, true)) {
                    ConfigManager.activeCloudOrigin = origin;
                }
                super.markVisibleConfigsDirty();
                v7 = var11_19;
            }
            var7_7 = Result.constructor-impl(v7);
        }
        catch (Throwable error) {
            var7_7 = Result.constructor-impl(ResultKt.createFailure((Throwable)var8_9));
        }
        var6_6 = var7_7;
        v20 = Result.exceptionOrNull-impl(var6_6);
        if (v20 != null) {
            var8_10 = var7_7 = v20;
            var9_14 = false;
            ConfigManager.logger.error("Failed to synchronize received cloud config '" + (String)var1_1 + "'", (Throwable)var8_10);
        }
        return (String)(Result.isFailure-impl(var6_6) ? null : var6_6);
    }

    private static final String getConfigNames$lambda$1(String it) {
        Intrinsics.checkNotNull(it);
        return StringsKt.removeSuffix(it, (CharSequence)".json");
    }

    /*
     * WARNING - void declaration
     */
    private final JsonObject optionalObject(JsonObject parent, String key) {
        void var3_3;
        JsonElement jsonElement = parent.get(key);
        if (jsonElement == null) {
            return null;
        }
        JsonElement element = jsonElement;
        if (!element.isJsonObject()) {
            boolean bl = false;
            String string = "Expected object: " + key;
            throw new IllegalArgumentException(string.toString());
        }
        return var3_3.getAsJsonObject();
    }

    private static final ConfigInfo loadVisibleConfigs$lambda$5(Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "<destruct>");
        String name = (String)pair.component1();
        Path path = (Path)pair.component2();
        Intrinsics.checkNotNull(path);
        return new ConfigInfo(name, INSTANCE.readAuthor(path), INSTANCE.readCloudOrigin(path));
    }

    @Compile
    public final boolean load(@NotNull String string) {
        Object object;
        Object object2;
        Path path;
        Intrinsics.checkNotNullParameter(string, "name");
        if (!this.isValidName(string) || !Files.exists(path = configPath.resolve(string + ".json"), new LinkOption[0])) {
            return false;
        }
        try {
            this.validateConfigKeys();
            Intrinsics.checkNotNull(path);
            object2 = this.parseConfig(path);
            this.applyConfig((ParsedConfig)object2);
            this.migrateLoadedConfig(path, (ParsedConfig)object2);
            if (!StringsKt__StringsJVMKt.equals(string, AUTO_LOAD_CONFIG, true)) {
                activeConfigName = string;
                activeCloudOrigin = ((ParsedConfig)object2).getCloudOrigin();
                this.setSelectedConfigName(string);
            }
            object = Result.constructor-impl(Unit.INSTANCE);
        }
        catch (Throwable throwable) {
            object = Result.constructor-impl(ResultKt.createFailure(throwable));
        }
        object2 = object;
        Throwable throwable = Result.exceptionOrNull-impl(object2);
        if (throwable != null) {
            logger.error("Failed to load config '" + string + "'", throwable);
        }
        return Result.isSuccess-impl(object2);
    }

    /*
     * Unable to fully structure code
     */
    @Nullable
    public final String syncOwnedCloudConfig(@NotNull String preferredName, @NotNull String ownerName, @NotNull String configId, @NotNull String contentHash, int revision, boolean shared, @NotNull JsonObject payload) {
        block20: {
            block19: {
                Intrinsics.checkNotNullParameter(preferredName, "preferredName");
                Intrinsics.checkNotNullParameter(ownerName, "ownerName");
                Intrinsics.checkNotNullParameter(configId, "configId");
                Intrinsics.checkNotNullParameter(contentHash, "contentHash");
                Intrinsics.checkNotNullParameter(payload, "payload");
                if (StringsKt.isBlank(configId)) break block19;
                if (revision < 1) break block19;
                if (this.verifyCloudPayloadHash(payload, contentHash)) break block20;
            }
            return null;
        }
        var8_8 = this;
        try {
            block22: {
                block21: {
                    block18: {
                        $this$syncOwnedCloudConfig_u24lambda_u240 = var8_8;
                        $i$a$-runCatching-ConfigManager$syncOwnedCloudConfig$1 = false;
                        if (!(!payload.has("CloudOrigin"))) {
                            $i$a$-require-ConfigManager$syncOwnedCloudConfig$1$1 = false;
                            $i$a$-require-ConfigManager$syncOwnedCloudConfig$1$1 = "Cloud payload already has provenance";
                            throw new IllegalArgumentException($i$a$-require-ConfigManager$syncOwnedCloudConfig$1$1.toString());
                        }
                        $this$syncOwnedCloudConfig_u24lambda_u240.parseConfigRoot(payload);
                        $this$syncOwnedCloudConfig_u24lambda_u240.ensureConfigDirectory();
                        $this$syncOwnedCloudConfig_u24lambda_u240.refreshVisibleConfigsNow();
                        $this$firstOrNull$iv = ConfigManager.visibleConfigsCache;
                        $i$f$firstOrNull = false;
                        var13_20 = $this$firstOrNull$iv.iterator();
                        while (var13_20.hasNext()) {
                            element$iv = var13_20.next();
                            it = (ConfigInfo)element$iv;
                            $i$a$-firstOrNull-ConfigManager$syncOwnedCloudConfig$1$existing$1 = false;
                            v0 = it.getCloudOrigin();
                            v1 = v0 != null ? v0.getOwned() : false;
                            if (!v1) ** GOTO lbl-1000
                            if (Intrinsics.areEqual(it.getCloudOrigin().getConfigId(), configId)) {
                                v2 = true;
                            } else lbl-1000:
                            // 2 sources

                            {
                                v2 = false;
                            }
                            if (!v2) continue;
                            v3 = element$iv;
                            break block18;
                        }
                        v3 = null;
                    }
                    existing = v3;
                    if (existing == null) break block21;
                    v4 = existing.getCloudOrigin();
                    Intrinsics.checkNotNull(v4);
                    origin = v4;
                    localHash = $this$syncOwnedCloudConfig_u24lambda_u240.cloudPayloadHash(existing.getName());
                    locallyChanged = localHash != null && !Intrinsics.areEqual(localHash, origin.getContentHash());
                    if (!locallyChanged) break block21;
                    $this$syncOwnedCloudConfig_u24lambda_u240.setCloudConfigShared(existing.getName(), shared);
                    v5 = existing.getName();
                    break block22;
                }
                v6 = configId;
                v7 = StringsKt.take(ownerName, 64);
                v8 = contentHash;
                v9 = existing;
                if (v9 == null || (v9 = v9.getCloudOrigin()) == null) ** GOTO lbl-1000
                $i$a$-firstOrNull-ConfigManager$syncOwnedCloudConfig$1$existing$1 = v9.getImportedAt();
                var18_30 = ((Number)$i$a$-firstOrNull-ConfigManager$syncOwnedCloudConfig$1$existing$1).longValue();
                var20_31 = v8;
                var21_32 = v7;
                var22_33 = v6;
                var23_34 = false;
                var24_35 = var18_30 > 0L;
                v6 = var22_33;
                v7 = var21_32;
                v8 = var20_31;
                v10 = var24_35 ? $i$a$-firstOrNull-ConfigManager$syncOwnedCloudConfig$1$existing$1 : null;
                v9 = v10;
                if (v10 != null) {
                    v11 = v9.longValue();
                } else lbl-1000:
                // 2 sources

                {
                    v11 = Instant.now().toEpochMilli();
                }
                var26_36 = null;
                var27_37 = 256;
                var28_38 = false;
                var29_39 = shared;
                var30_40 = preferredName;
                var31_41 = revision;
                var32_42 = true;
                var33_43 = v11;
                var35_44 = v8;
                var36_45 = v7;
                var37_46 = v6;
                origin = new CloudConfigOrigin(var37_46, var36_45, var35_44, var33_43, var32_42, var31_41, var30_40, var29_39, var28_38, var27_37, var26_36);
                root = locallyChanged = payload.deepCopy();
                var15_24 = false;
                root.add("CloudOrigin", $this$syncOwnedCloudConfig_u24lambda_u240.serializeCloudOrigin(origin));
                synchronized = targetName;
                v12 = existing;
                if (v12 == null || (v12 = v12.getName()) == null) {
                    v12 = $this$syncOwnedCloudConfig_u24lambda_u240.availableCloudConfigName(preferredName);
                }
                targetName = v12;
                target = ConfigManager.configPath.resolve((String)targetName + ".json");
                Intrinsics.checkNotNull(target);
                v13 = ConfigManager.gson.toJson((JsonElement)synchronized);
                Intrinsics.checkNotNullExpressionValue(v13, "toJson(...)");
                $this$syncOwnedCloudConfig_u24lambda_u240.writeAtomically(target, v13);
                var15_25 = $this$syncOwnedCloudConfig_u24lambda_u240;
                try {
                    $this$syncOwnedCloudConfig_u24lambda_u240_u244 = var15_25;
                    $i$a$-runCatching-ConfigManager$syncOwnedCloudConfig$1$2 = false;
                    $this$syncOwnedCloudConfig_u24lambda_u240_u244 = Result.constructor-impl($this$syncOwnedCloudConfig_u24lambda_u240_u244.parseConfig(target));
                }
                catch (Throwable $i$a$-runCatching-ConfigManager$syncOwnedCloudConfig$1$2) {
                    validationError = Result.constructor-impl(ResultKt.createFailure((Throwable)$i$a$-getOrElse-ConfigManager$syncOwnedCloudConfig$1$3));
                }
                var15_25 = validationError;
                v14 = Result.exceptionOrNull-impl(var15_25);
                if (v14 != null) {
                    var16_28 = v14;
                    var25_47 = false;
                    if (existing == null) {
                        Files.deleteIfExists((Path)var14_22);
                    }
                    throw var16_28;
                }
                if (StringsKt.equals(ConfigManager.activeConfigName, var13_20, true)) {
                    ConfigManager.activeCloudOrigin = origin;
                }
                super.markVisibleConfigsDirty();
                v5 = var13_20;
            }
            var9_9 = Result.constructor-impl(v5);
        }
        catch (Throwable error) {
            var9_9 = Result.constructor-impl(ResultKt.createFailure(error));
        }
        var8_8 = var9_9;
        v15 = Result.exceptionOrNull-impl(var8_8);
        if (v15 != null) {
            var10_12 = var9_9 = v15;
            var11_16 = false;
            ConfigManager.logger.error("Failed to synchronize cloud config '" + preferredName + "'", (Throwable)var10_12);
        }
        return (String)(Result.isFailure-impl(var8_8) ? null : var8_8);
    }

    private final List<ConfigInfo> loadVisibleConfigs() {
        this.ensureConfigDirectory();
        File[] fileArray = configPath.toFile().listFiles(ConfigManager::loadVisibleConfigs$lambda$0);
        if (fileArray == null) {
            return CollectionsKt.emptyList();
        }
        File[] files = fileArray;
        Sequence<Pair> $this$sortedBy$iv = SequencesKt.filterNot(SequencesKt.map(SequencesKt.filterNot(ArraysKt.asSequence(files), ConfigManager::loadVisibleConfigs$lambda$1), ConfigManager::loadVisibleConfigs$lambda$2), ConfigManager::loadVisibleConfigs$lambda$3);
        boolean $i$f$sortedBy = false;
        return SequencesKt.toList(SequencesKt.map(SequencesKt.sortedWith($this$sortedBy$iv, new \u0627\u062f()), ConfigManager::loadVisibleConfigs$lambda$5));
    }

    /*
     * WARNING - void declaration
     */
    @Nullable
    public final JsonObject exportCloudPayload(@NotNull String name) {
        Object object;
        block11: {
            block10: {
                Intrinsics.checkNotNullParameter(name, "name");
                if (!this.isValidName(name)) break block10;
                if (!StringsKt.equals(name, AUTO_LOAD_CONFIG, true)) break block11;
            }
            return null;
        }
        Path file = configPath.resolve(name + ".json");
        if (!Files.isRegularFile(file, new LinkOption[0])) {
            return null;
        }
        Object object2 = this;
        try {
            ConfigManager $this$exportCloudPayload_u24lambda_u240 = object2;
            boolean bl = false;
            Intrinsics.checkNotNull(file);
            JsonObject jsonObject = gson.fromJson($this$exportCloudPayload_u24lambda_u240.readConfigText(file), JsonObject.class);
            if (jsonObject == null) {
                return null;
            }
            JsonObject root = jsonObject;
            CloudConfigOrigin origin = $this$exportCloudPayload_u24lambda_u240.readCloudOrigin(root);
            if (!(origin == null || origin.getOwned())) {
                boolean bl2 = false;
                String string = "Imported cloud configs cannot be shared";
                throw new IllegalArgumentException(string.toString());
            }
            $this$exportCloudPayload_u24lambda_u240.parseConfigRoot(root);
            root.remove(CLOUD_ORIGIN_KEY);
            object = Result.constructor-impl(root);
        }
        catch (Throwable bl) {
            object = Result.constructor-impl(ResultKt.createFailure(bl));
        }
        object2 = object;
        Throwable throwable = Result.exceptionOrNull-impl(object2);
        if (throwable != null) {
            void var5_7;
            Object error = object = throwable;
            boolean bl = false;
            logger.warn("Config '" + name + "' cannot be exported to cloud", (Throwable)var5_7);
        }
        return (JsonObject)(Result.isFailure-impl(object2) ? null : object2);
    }

    private final JsonObject requireObject(JsonElement element, String name) {
        if (!(element != null && element.isJsonObject())) {
            boolean bl = false;
            String string = "Expected object: " + name;
            throw new IllegalArgumentException(string.toString());
        }
        JsonObject jsonObject = element.getAsJsonObject();
        Intrinsics.checkNotNullExpressionValue(jsonObject, "getAsJsonObject(...)");
        return jsonObject;
    }

    private static final boolean getConfigNames$lambda$0(File file, String name) {
        Intrinsics.checkNotNull(name);
        return StringsKt.endsWith$default(name, ".json", false, 2, null);
    }

    /*
     * WARNING - void declaration
     */
    private final float normalizeSlider(SliderSetting setting, float raw) {
        void var3_3;
        float normalized = RangesKt.coerceIn(raw, setting.getMin(), setting.getMax());
        if (setting.getStep() > 0.0f) {
            float steps = (float)Math.rint((normalized - setting.getMin()) / setting.getStep());
            normalized = RangesKt.coerceIn(setting.getMin() + steps * setting.getStep(), setting.getMin(), setting.getMax());
        }
        return (float)var3_3;
    }

    /*
     * WARNING - void declaration
     */
    private final String canonicalJson(JsonElement element) {
        String string;
        if (element.isJsonNull()) {
            string = "null";
        } else if (element.isJsonArray()) {
            JsonArray jsonArray = element.getAsJsonArray();
            Intrinsics.checkNotNullExpressionValue(jsonArray, "getAsJsonArray(...)");
            JsonArray jsonArray2 = jsonArray;
            KFunction kFunction = new \u062a\u0625(this);
            string = CollectionsKt.joinToString$default(jsonArray2, ",", "[", "]", 0, null, (Function1)((Object)kFunction), 24, null);
        } else if (element.isJsonObject()) {
            Set<Map.Entry<String, JsonElement>> set = element.getAsJsonObject().entrySet();
            Intrinsics.checkNotNullExpressionValue(set, "entrySet(...)");
            Iterable $this$sortedBy$iv = set;
            boolean $i$f$sortedBy = false;
            string = CollectionsKt.joinToString$default(CollectionsKt.sortedWith($this$sortedBy$iv, new \u0633\u0651()), ",", "{", "}", 0, null, ConfigManager::canonicalJson$lambda$0, 24, null);
        } else if (element.isJsonPrimitive() && element.getAsJsonPrimitive().isNumber()) {
            BigDecimal normalized = new BigDecimal(element.getAsJsonPrimitive().getAsString()).stripTrailingZeros();
            if (normalized.compareTo(BigDecimal.ZERO) == 0) {
                string = "0";
            } else {
                void var2_4;
                String string2 = var2_4.toPlainString();
                string = string2;
                Intrinsics.checkNotNullExpressionValue(string2, "toPlainString(...)");
            }
        } else {
            void var1_1;
            String string3 = var1_1.toString();
            string = string3;
            Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
        }
        return string;
    }

    /*
     * WARNING - void declaration
     */
    @Nullable
    public final String cloudPayloadHash(@NotNull String name) {
        Object object;
        block10: {
            block9: {
                Intrinsics.checkNotNullParameter(name, "name");
                if (!this.isValidName(name)) break block9;
                if (!StringsKt.equals(name, AUTO_LOAD_CONFIG, true)) break block10;
            }
            return null;
        }
        Path file = configPath.resolve(name + ".json");
        if (!Files.isRegularFile(file, new LinkOption[0])) {
            return null;
        }
        Object object2 = this;
        try {
            ConfigManager $this$cloudPayloadHash_u24lambda_u240 = object2;
            boolean bl = false;
            Intrinsics.checkNotNull(file);
            JsonObject jsonObject = gson.fromJson($this$cloudPayloadHash_u24lambda_u240.readConfigText(file), JsonObject.class);
            if (jsonObject == null) {
                return null;
            }
            JsonObject payload = jsonObject;
            $this$cloudPayloadHash_u24lambda_u240.parseConfigRoot(payload);
            payload.remove(CLOUD_ORIGIN_KEY);
            object = Result.constructor-impl(((ConfigManager)object).hashCloudPayload(payload));
        }
        catch (Throwable bl) {
            object = Result.constructor-impl(ResultKt.createFailure(bl));
        }
        object2 = object;
        Throwable throwable = Result.exceptionOrNull-impl(object2);
        if (throwable != null) {
            void var5_7;
            Object error = object = throwable;
            boolean bl = false;
            logger.warn("Config '" + name + "' cannot be hashed for Cloud synchronization", (Throwable)var5_7);
        }
        return (String)(Result.isFailure-impl(object2) ? null : object2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final boolean isInternalConfigFile(String fileName) {
        if (StringsKt.equals(fileName, DRAGS_FILE_NAME, true)) return true;
        if (StringsKt.equals(fileName, WAYPOINT_FILE_NAME, true)) return true;
        if (!StringsKt.equals(fileName, CLOUD_IDENTITY_FILE_NAME, true)) return false;
        return true;
    }

    @NotNull
    public final String getAuthor(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (!this.isValidName(name)) {
            return UNKNOWN_AUTHOR;
        }
        Path file = configPath.resolve(name + ".json");
        if (!Files.exists(file, new LinkOption[0])) {
            return UNKNOWN_AUTHOR;
        }
        Intrinsics.checkNotNull(file);
        return this.readAuthor(file);
    }

    private final String settingConfigKey(int index) {
        return "setting_" + index;
    }

    private static final boolean loadVisibleConfigs$lambda$0(File file, String name) {
        Intrinsics.checkNotNull(name);
        return StringsKt.endsWith$default(name, ".json", false, 2, null);
    }

    /*
     * WARNING - void declaration
     */
    static {
        void var3_5;
        void $this$flatMapTo$iv$iv;
        INSTANCE = new ConfigManager();
        manualConfigNameRegex = new Regex("^[A-Za-z]+$");
        String[] stringArray = new String[4];
        stringArray[0] = "CON";
        stringArray[1] = "PRN";
        stringArray[2] = "AUX";
        stringArray[3] = "NUL";
        Iterable $this$flatMap$iv = new IntRange(1, 9);
        Set<String> set = SetsKt.setOf(stringArray);
        boolean $i$f$flatMap = false;
        Iterable iterable = $this$flatMap$iv;
        Collection destination$iv$iv = new ArrayList();
        boolean $i$f$flatMapTo = false;
        Iterator iterator2 = $this$flatMapTo$iv$iv.iterator();
        while (iterator2.hasNext()) {
            int element$iv$iv;
            int it = element$iv$iv = ((IntIterator)iterator2).nextInt();
            boolean bl = false;
            String[] stringArray2 = new String[2];
            stringArray2[0] = "COM" + it;
            stringArray2[1] = "LPT" + it;
            Iterable iterable2 = CollectionsKt.listOf(stringArray2);
            CollectionsKt.addAll(var3_5, iterable2);
        }
        reservedWindowsNames = SetsKt.plus(set, (Iterable)((List)var3_5));
        logger = LoggerFactory.getLogger("Rain Config");
        gson = new GsonBuilder().setPrettyPrinting().create();
        String[] stringArray3 = new String[2];
        stringArray3[0] = "Rain";
        stringArray3[1] = "other";
        Path path = Paths.get(System.getProperty("user.dir"), stringArray3);
        Intrinsics.checkNotNullExpressionValue(path, "get(...)");
        legacyConfigPath = path;
        stringArray3 = new String[2];
        stringArray3[0] = "Rain";
        stringArray3[1] = "configs";
        Path path2 = Paths.get(System.getProperty("user.dir"), stringArray3);
        Intrinsics.checkNotNullExpressionValue(path2, "get(...)");
        configPath = path2;
        Path path3 = legacyConfigPath.resolve(SELECTED_CONFIG_FILE_NAME);
        Intrinsics.checkNotNullExpressionValue(path3, "resolve(...)");
        selectedConfigPath = path3;
        visibleConfigsCache = CollectionsKt.emptyList();
        visibleConfigNamesCache = CollectionsKt.emptyList();
        visibleConfigsDirty = true;
        INSTANCE.ensureConfigDirectory();
        INSTANCE.restoreMisplacedInternalFiles();
        INSTANCE.migrateLegacyConfigs();
        selectedConfigName = INSTANCE.readSelectedConfigName();
    }

    public final boolean verifyCloudPayloadHash(@NotNull JsonObject payload, @NotNull String expectedHash) {
        Object object;
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(expectedHash, "expectedHash");
        CharSequence charSequence = expectedHash;
        if (!new Regex("^[0-9a-f]{64}$").matches(charSequence)) {
            return false;
        }
        Object object2 = this;
        try {
            ConfigManager $this$verifyCloudPayloadHash_u24lambda_u240 = object2;
            boolean bl = false;
            object = Result.constructor-impl($this$verifyCloudPayloadHash_u24lambda_u240.hashCloudPayload(payload));
        }
        catch (Throwable throwable) {
            object = Result.constructor-impl(ResultKt.createFailure(throwable));
        }
        object2 = object;
        String string = (String)(Result.isFailure-impl(object2) ? null : object2);
        if (string == null) {
            return false;
        }
        String actualHash = string;
        byte[] byArray = actualHash.getBytes(Charsets.US_ASCII);
        Intrinsics.checkNotNullExpressionValue(byArray, "getBytes(...)");
        byte[] byArray2 = expectedHash.getBytes(Charsets.US_ASCII);
        Intrinsics.checkNotNullExpressionValue(byArray2, "getBytes(...)");
        return MessageDigest.isEqual(byArray, byArray2);
    }

    private final String readAuthor(Path file) {
        Object object;
        Object object2 = this;
        try {
            ConfigManager $this$readAuthor_u24lambda_u240 = object2;
            boolean bl = false;
            JsonObject jsonObject = gson.fromJson($this$readAuthor_u24lambda_u240.readConfigText(file), JsonObject.class);
            if (jsonObject == null) {
                return UNKNOWN_AUTHOR;
            }
            JsonObject root = jsonObject;
            object = Result.constructor-impl($this$readAuthor_u24lambda_u240.readAuthor(root));
        }
        catch (Throwable throwable) {
            object = Result.constructor-impl(ResultKt.createFailure(throwable));
        }
        object2 = object;
        object = UNKNOWN_AUTHOR;
        return (String)(Result.isFailure-impl(object2) ? object : object2);
    }

    public final boolean isConfigActive(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        String string = activeConfigName;
        return string != null ? StringsKt.equals(string, name, true) : false;
    }

    private final JsonElement serializeSettingValue(Setting<?> setting) {
        JsonElement jsonElement;
        Setting<?> setting2 = setting;
        if (setting2 instanceof BooleanSetting) {
            jsonElement = new JsonPrimitive((Boolean)((BooleanSetting)setting).getValue());
        } else if (setting2 instanceof SliderSetting) {
            jsonElement = new JsonPrimitive((Number)((SliderSetting)setting).getValue());
        } else if (setting2 instanceof ModeSetting) {
            jsonElement = new JsonPrimitive((String)((ModeSetting)setting).getValue());
        } else if (setting2 instanceof TextSetting) {
            jsonElement = new JsonPrimitive((String)((TextSetting)setting).getValue());
        } else if (setting2 instanceof BindSetting) {
            jsonElement = new JsonPrimitive((Number)((BindSetting)setting).getValue());
        } else if (setting2 instanceof ColorSetting) {
            jsonElement = new JsonPrimitive(((Color)((ColorSetting)setting).getValue()).getRGB());
        } else {
            throw new IllegalStateException(("Unsupported setting type: " + setting.getClass().getName()).toString());
        }
        return jsonElement;
    }

    /*
     * Unable to fully structure code
     */
    @NotNull
    public final CreateResult create(@NotNull String name) {
        block9: {
            block11: {
                block10: {
                    Intrinsics.checkNotNullParameter(name, "name");
                    normalized = StringsKt.trim((CharSequence)name).toString();
                    if (!this.isValidName(normalized)) break block10;
                    if (!StringsKt.equals(normalized, "AutoLoad", true)) break block11;
                }
                return CreateResult.INVALID_NAME;
            }
            $this$any$iv = this.getConfigNames();
            $i$f$any = false;
            if (!($this$any$iv instanceof Collection)) ** GOTO lbl-1000
            if (((Collection)$this$any$iv).isEmpty()) {
                v0 = false;
            } else lbl-1000:
            // 3 sources

            {
                for (T element$iv : $this$any$iv) {
                    it = (String)element$iv;
                    var8_8 = false;
                    if (!StringsKt.equals((String)var7_7, normalized, true)) continue;
                    v0 = true;
                    break block9;
                }
                v0 = false;
            }
        }
        if (v0) {
            return CreateResult.ALREADY_EXISTS;
        }
        if (!this.save(normalized)) {
            return CreateResult.SAVE_FAILED;
        }
        ConfigManager.activeConfigName = normalized;
        ConfigManager.activeCloudOrigin = null;
        this.setSelectedConfigName((String)var2_2);
        this.refreshVisibleConfigsNow();
        return CreateResult.CREATED;
    }

    private static final Pair loadVisibleConfigs$lambda$2(File file) {
        String string = file.getName();
        Intrinsics.checkNotNullExpressionValue(string, "getName(...)");
        return TuplesKt.to(StringsKt.removeSuffix(string, (CharSequence)".json"), file.toPath());
    }

    private final JsonElement findSettingElement(List<? extends Setting<?>> settings, Setting<?> setting, int index, JsonObject json, int formatVersion, Module module) {
        int n;
        Iterable $this$count$iv;
        if (formatVersion >= 2) {
            int n2;
            JsonElement jsonElement = json.get(setting.getConfigKey());
            if (jsonElement != null) {
                JsonElement it = jsonElement;
                boolean bl = false;
                return it;
            }
            Object $this$count$iv2 = settings;
            boolean $i$f$count = false;
            if ($this$count$iv2 instanceof Collection && ((Collection)$this$count$iv2).isEmpty()) {
                n2 = 0;
            } else {
                int count$iv = 0;
                Iterator bl = $this$count$iv2.iterator();
                while (bl.hasNext()) {
                    Object element$iv = bl.next();
                    Setting it = (Setting)element$iv;
                    boolean bl2 = false;
                    if (!Intrinsics.areEqual(it.getName(), setting.getName()) || ++count$iv >= 0) continue;
                    CollectionsKt.throwCountOverflow();
                }
                n2 = count$iv;
            }
            if (n2 == 1) {
                $this$count$iv2 = json.get(setting.getName());
                if ($this$count$iv2 != null) {
                    Object it = $this$count$iv2;
                    boolean bl = false;
                    return it;
                }
            }
            return null;
        }
        int legacyIndex = this.legacySettingIndex(module, index, json);
        JsonElement $i$f$count = json.get(this.settingConfigKey(legacyIndex));
        if ($i$f$count != null) {
            JsonElement it = $i$f$count;
            boolean bl = false;
            return it;
        }
        $i$f$count = json.get(setting.getConfigKey());
        if ($i$f$count != null) {
            void it = $this$count$iv;
            boolean bl = false;
            return it;
        }
        $this$count$iv = settings;
        boolean $i$f$count2 = false;
        if ($this$count$iv instanceof Collection && ((Collection)$this$count$iv).isEmpty()) {
            n = 0;
        } else {
            int count$iv = 0;
            for (Object element$iv : $this$count$iv) {
                Setting setting2 = (Setting)element$iv;
                boolean bl = false;
                if (!Intrinsics.areEqual(setting2.getName(), setting.getName()) || ++count$iv >= 0) continue;
                CollectionsKt.throwCountOverflow();
            }
            n = count$iv;
        }
        if (n == 1) {
            JsonElement jsonElement = json.get(setting.getName());
            if (jsonElement != null) {
                JsonElement jsonElement2 = jsonElement;
                boolean bl = false;
                return jsonElement2;
            }
        }
        return null;
    }

    private final void ensureConfigDirectory() {
        Files.createDirectories(configPath, new FileAttribute[0]);
    }

    private final boolean parseBoolean(JsonElement element) {
        JsonPrimitive primitive = this.requirePrimitive(element);
        if (!primitive.isBoolean()) {
            boolean bl = false;
            String string = "Expected boolean value";
            throw new IllegalArgumentException(string.toString());
        }
        return primitive.getAsBoolean();
    }

    @NotNull
    public final List<ConfigInfo> getVisibleConfigs() {
        this.ensureVisibleConfigsCache();
        return visibleConfigsCache;
    }

    /*
     * WARNING - void declaration
     */
    private final JsonObject serializeSettings(List<? extends Setting<?>> settings) {
        void var2_2;
        JsonObject json = new JsonObject();
        Iterable $this$forEach$iv = settings;
        boolean $i$f$forEach = false;
        for (Object element$iv : $this$forEach$iv) {
            Setting setting = (Setting)element$iv;
            boolean bl = false;
            if (!(!json.has(setting.getConfigKey()))) {
                boolean bl2 = false;
                String string = "Duplicate setting config key: " + setting.getConfigKey();
                throw new IllegalArgumentException(string.toString());
            }
            json.add(setting.getConfigKey(), INSTANCE.serializeSettingValue(setting));
        }
        return var2_2;
    }

    /*
     * Unable to fully structure code
     */
    public final void setSelectedConfigName(@Nullable String name) {
        if (name == null) ** GOTO lbl-1000
        var3_2 = StringsKt.trim((CharSequence)name).toString();
        if (var3_2 == null) ** GOTO lbl-1000
        p0 = var5_4 = var3_2;
        $i$a$-takeIf-ConfigManager$setSelectedConfigName$normalized$1 = false;
        var4_8 = ((CharSequence)p0).length() > 0 ? var5_4 : null;
        if (var4_8 == null) ** GOTO lbl-1000
        p0 = var6_5 = var4_8;
        $i$a$-takeIf-ConfigManager$setSelectedConfigName$normalized$2 = false;
        var5_4 = this.isValidName(p0) ? var6_5 : null;
        if (var5_4 != null) {
            it = var6_5 = var5_4;
            $i$a$-takeIf-ConfigManager$setSelectedConfigName$normalized$3 = false;
            v0 = !StringsKt.equals(it, "AutoLoad", true) ? var6_5 : null;
        } else lbl-1000:
        // 4 sources

        {
            v0 = null;
        }
        normalized = v0;
        if (Intrinsics.areEqual(ConfigManager.selectedConfigName, normalized)) {
            return;
        }
        ConfigManager.selectedConfigName = normalized;
        this.persistSelectedConfigName();
        var3_3 = ConfigManager.stateVersion;
        ConfigManager.stateVersion = var3_3 + 1;
    }

    /*
     * Unable to fully structure code
     */
    @Nullable
    public final CloudConfigOrigin findOwnedCloudOriginByName(@NotNull String name) {
        block5: {
            Intrinsics.checkNotNullParameter(name, "name");
            normalized = StringsKt.trim((CharSequence)name).toString();
            if (!this.isValidName(normalized)) {
                return null;
            }
            this.ensureVisibleConfigsCache();
            var3_3 = ((Iterable)ConfigManager.visibleConfigsCache).iterator();
            while (var3_3.hasNext()) {
                block7: {
                    block6: {
                        config = (ConfigInfo)var3_3.next();
                        $i$a$-firstNotNullOfOrNull-ConfigManager$findOwnedCloudOriginByName$1 = false;
                        var6_6 = config.getCloudOrigin();
                        if (var6_6 == null) break block6;
                        origin = var7_7 = var6_6;
                        $i$a$-takeIf-ConfigManager$findOwnedCloudOriginByName$1$1 = false;
                        if (!origin.getOwned()) ** GOTO lbl-1000
                        v0 = origin.getCloudName();
                        if (v0 == null) {
                            v0 = config.getName();
                        }
                        if (StringsKt.equals(v0, normalized, true)) {
                            v1 = true;
                        } else lbl-1000:
                        // 2 sources

                        {
                            v1 = false;
                        }
                        v2 = v1 ? var7_7 : null;
                        break block7;
                    }
                    v2 = null;
                }
                if ((var4_4 = v2) == null) continue;
                v3 = var4_4;
                break block5;
            }
            v3 = null;
        }
        return v3;
    }

    private final void validateConfigKeys() {
        this.validateSettingKeys(CLICK_GUI_SETTINGS_KEY, \u0633\u0631.INSTANCE.getSettings());
        HashSet<String> moduleKeys = new HashSet<String>();
        Iterable $this$forEach$iv = \u062e\u064b.INSTANCE.getModules();
        boolean $i$f$forEach = false;
        for (Object element$iv : $this$forEach$iv) {
            Module module = (Module)element$iv;
            boolean bl = false;
            String moduleKey = INSTANCE.moduleConfigKey(module);
            if (!moduleKeys.add(moduleKey)) {
                boolean bl2 = false;
                String string = "Duplicate module config key: " + moduleKey;
                throw new IllegalArgumentException(string.toString());
            }
            INSTANCE.validateSettingKeys(moduleKey, module.getSettings());
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    private final void writeAtomically(Path target, String content) {
        Files.createDirectories(target.getParent(), new FileAttribute[0]);
        Path temporary = Files.createTempFile(target.getParent(), target.getFileName() + ".", ".tmp", new FileAttribute[0]);
        try {
            Object object = new OpenOption[3];
            object[0] = StandardOpenOption.CREATE;
            object[1] = StandardOpenOption.TRUNCATE_EXISTING;
            object[2] = StandardOpenOption.WRITE;
            Files.writeString(temporary, (CharSequence)content, (OpenOption[])object);
            try {
                object = new CopyOption[2];
                object[0] = StandardCopyOption.ATOMIC_MOVE;
                object[1] = StandardCopyOption.REPLACE_EXISTING;
                object = Files.move(temporary, target, (CopyOption[])object);
            }
            catch (AtomicMoveNotSupportedException atomicMoveNotSupportedException) {
                CopyOption[] copyOptionArray = new CopyOption[1];
                copyOptionArray[0] = StandardCopyOption.REPLACE_EXISTING;
                object = Files.move(temporary, target, copyOptionArray);
            }
        }
        catch (Throwable throwable) {
            void var3_3;
            Files.deleteIfExists((Path)var3_3);
            throw throwable;
        }
        Files.deleteIfExists(temporary);
    }

    public static final /* synthetic */ String access$canonicalJson(ConfigManager $this, JsonElement element) {
        return $this.canonicalJson(element);
    }

    /*
     * Unable to fully structure code
     */
    private final String readSelectedConfigName() {
        if (!Files.exists(ConfigManager.selectedConfigPath, new LinkOption[0])) {
            return null;
        }
        var1_1 = this;
        try {
            $this$readSelectedConfigName_u24lambda_u240 = var1_1;
            $i$a$-runCatching-ConfigManager$readSelectedConfigName$1 = false;
            v0 = Files.readString(ConfigManager.selectedConfigPath);
            Intrinsics.checkNotNullExpressionValue(v0, "readString(...)");
            p0 = var4_5 = StringsKt.trim((CharSequence)v0).toString();
            $i$a$-takeIf-ConfigManager$readSelectedConfigName$1$1 = false;
            var7_9 = ((CharSequence)p0).length() > 0 ? var4_5 : null;
            if (var7_9 == null) ** GOTO lbl-1000
            p0 = var5_6 = var7_9;
            $i$a$-takeIf-ConfigManager$readSelectedConfigName$1$2 = false;
            var4_5 = $this$readSelectedConfigName_u24lambda_u240.isValidName(p0) ? var5_6 : null;
            if (var4_5 != null) {
                it = var5_6 = var4_5;
                $i$a$-takeIf-ConfigManager$readSelectedConfigName$1$3 = false;
                v1 = !StringsKt.equals(it, "AutoLoad", true) ? var5_6 : null;
            } else lbl-1000:
            // 2 sources

            {
                v1 = null;
            }
            var2_2 = Result.constructor-impl(v1);
        }
        catch (Throwable var3_4) {
            var2_2 = Result.constructor-impl(ResultKt.createFailure(var3_4));
        }
        var1_1 = var2_2;
        return (String)(Result.isFailure-impl(var1_1) ? null : var1_1);
    }

    /*
     * WARNING - void declaration
     */
    private final void restoreMisplacedInternalFiles() {
        String[] stringArray = new String[3];
        stringArray[0] = DRAGS_FILE_NAME;
        stringArray[1] = WAYPOINT_FILE_NAME;
        stringArray[2] = CLOUD_IDENTITY_FILE_NAME;
        Iterable $this$forEach$iv = CollectionsKt.listOf(stringArray);
        boolean $i$f$forEach = false;
        Iterator iterator2 = $this$forEach$iv.iterator();
        while (iterator2.hasNext()) {
            void var5_5;
            Object element$iv = iterator2.next();
            String p0 = (String)element$iv;
            boolean bl = false;
            this.restoreMisplacedInternalFile((String)var5_5);
        }
    }

    private final Object settingValue(Setting<?> setting) {
        Serializable serializable;
        Setting<?> setting2 = setting;
        if (setting2 instanceof BooleanSetting) {
            serializable = (Serializable)((BooleanSetting)setting).getValue();
        } else if (setting2 instanceof SliderSetting) {
            serializable = (Serializable)((SliderSetting)setting).getValue();
        } else if (setting2 instanceof ModeSetting) {
            serializable = (Serializable)((ModeSetting)setting).getValue();
        } else if (setting2 instanceof TextSetting) {
            serializable = (Serializable)((TextSetting)setting).getValue();
        } else if (setting2 instanceof BindSetting) {
            serializable = (Serializable)((BindSetting)setting).getValue();
        } else if (setting2 instanceof ColorSetting) {
            serializable = (Serializable)((ColorSetting)setting).getValue();
        } else {
            throw new IllegalStateException(("Unsupported setting type: " + setting.getClass().getName()).toString());
        }
        return serializable;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static final boolean migrateLegacyConfigs$lambda$0$0(Path path) {
        if (!Files.isRegularFile(path, new LinkOption[0])) return false;
        if (!StringsKt.endsWith$default(((Object)path.getFileName()).toString(), ".json", false, 2, null)) return false;
        return true;
    }

    /*
     * WARNING - void declaration
     */
    private final String parseMode(ModeSetting setting, JsonElement element, int formatVersion) {
        Object v0;
        String mode;
        block5: {
            JsonPrimitive primitive = this.requirePrimitive(element);
            if (primitive.isNumber()) {
                int index = this.parseInt(element);
                if (formatVersion >= 2) {
                    if (!(0 <= index ? index < ((Collection)setting.getModes()).size() : false)) {
                        boolean $i$a$-require-ConfigManager$parseMode$22 = false;
                        String $i$a$-require-ConfigManager$parseMode$22 = "Mode index is out of range for " + setting.getConfigKey();
                        throw new IllegalArgumentException($i$a$-require-ConfigManager$parseMode$22.toString());
                    }
                }
                return setting.getModes().get(RangesKt.coerceIn(index, CollectionsKt.getIndices((Collection)setting.getModes())));
            }
            mode = this.parseString(element);
            Iterable $this$firstOrNull$iv = setting.getModes();
            boolean $i$f$firstOrNull = false;
            for (Object element$iv : $this$firstOrNull$iv) {
                void var9_12;
                void var10_13;
                String it = (String)element$iv;
                boolean bl = false;
                if (!StringsKt.equals((String)var10_13, mode, true)) continue;
                v0 = var9_12;
                break block5;
            }
            v0 = null;
        }
        String string = v0;
        if (string == null) {
            throw new IllegalStateException(("Unknown mode '" + mode + "' for " + setting.getConfigKey()).toString());
        }
        return string;
    }

    public static /* synthetic */ boolean markOwnedCloudConfig$default(ConfigManager configManager, String string, String string2, String string3, String string4, int n, String string5, Boolean bl, int n2, Object object) {
        if ((n2 & 0x20) != 0) {
            string5 = string;
        }
        if ((n2 & 0x40) != 0) {
            bl = null;
        }
        return configManager.markOwnedCloudConfig(string, string2, string3, string4, n, string5, bl);
    }

    public final boolean canCreateFromCurrent() {
        return true;
    }

    /*
     * WARNING - void declaration
     */
    private final void applyConfig(ParsedConfig config) {
        RuntimeSnapshot snapshot = this.captureRuntimeSnapshot();
        try {
            Object object;
            ModuleUpdate update;
            Iterable $this$forEach$iv = config.getClickGuiSettings();
            boolean $i$f$forEach = false;
            for (Object element$iv : $this$forEach$iv) {
                SettingUpdate p0 = (SettingUpdate)element$iv;
                boolean bl = false;
                this.applySettingUpdate(p0);
            }
            $this$forEach$iv = config.getModules();
            $i$f$forEach = false;
            for (Object element$iv : $this$forEach$iv) {
                update = (ModuleUpdate)element$iv;
                boolean bl = false;
                Integer n = update.getKey();
                if (n != null) {
                    object = n;
                    Module module = update.getModule();
                    int p0 = ((Number)object).intValue();
                    boolean bl2 = false;
                    module.setKey(p0);
                }
                Iterable $this$forEach$iv2 = update.getSettings();
                object = INSTANCE;
                boolean $i$f$forEach2 = false;
                for (Object element$iv2 : $this$forEach$iv2) {
                    void var14_20;
                    SettingUpdate p0 = (SettingUpdate)element$iv2;
                    boolean bl3 = false;
                    super.applySettingUpdate((SettingUpdate)var14_20);
                }
            }
            $this$forEach$iv = config.getModules();
            $i$f$forEach = false;
            for (Object element$iv : $this$forEach$iv) {
                update = (ModuleUpdate)element$iv;
                boolean bl = false;
                if (update.getEnabled() == null) continue;
                Module module = update.getModule();
                boolean bl4 = (Boolean)object;
                boolean bl5 = false;
                module.setEnabled(bl4);
            }
        }
        catch (Throwable throwable) {
            void var2_2;
            this.restoreRuntimeSnapshot((RuntimeSnapshot)var2_2);
            throw throwable;
        }
    }

    @Compile
    public final boolean save(@NotNull String string) {
        boolean bl;
        Object object;
        Object object2;
        Object object3;
        Intrinsics.checkNotNullParameter(string, "name");
        if (!this.isValidName(string)) {
            return false;
        }
        try {
            this.ensureConfigDirectory();
            this.validateConfigKeys();
            object3 = configPath.resolve(string + ".json");
            if (StringsKt__StringsJVMKt.equals(string, AUTO_LOAD_CONFIG, true)) {
                object2 = null;
            } else {
                Intrinsics.checkNotNull(object3);
                object2 = this.readCloudOrigin((Path)object3);
            }
            Intrinsics.checkNotNull(object3);
            String string2 = gson.toJson(this.serializeConfig(this.currentAuthor(), (CloudConfigOrigin)object2));
            Intrinsics.checkNotNullExpressionValue(string2, "toJson(...)");
            String string3 = string2;
            this.writeAtomically((Path)object3, string3);
            object = Result.constructor-impl(Unit.INSTANCE);
        }
        catch (Throwable throwable) {
            object = Result.constructor-impl(ResultKt.createFailure(throwable));
        }
        object3 = object;
        object2 = Result.exceptionOrNull-impl(object3);
        if (object2 != null) {
            logger.error("Failed to save config '" + string + "'", (Throwable)object2);
        }
        if ((bl = Result.isSuccess-impl(object3)) && !StringsKt__StringsJVMKt.equals(string, AUTO_LOAD_CONFIG, true)) {
            INSTANCE.markVisibleConfigsDirty();
        }
        return bl;
    }

    /*
     * WARNING - void declaration
     */
    @NotNull
    public final RenameResult rename(@NotNull String oldName, @NotNull String newName) {
        void var6_15;
        void var4_4;
        Object object;
        ConfigManager configManager;
        ConfigManager configManager2;
        String actualOldName;
        String sanitizedNewName;
        block20: {
            Object v0;
            String it;
            boolean $i$f$firstOrNull;
            Iterable $this$firstOrNull$iv;
            List<String> configNames;
            block19: {
                String sanitizedOldName;
                block22: {
                    block21: {
                        Intrinsics.checkNotNullParameter(oldName, "oldName");
                        Intrinsics.checkNotNullParameter(newName, "newName");
                        sanitizedOldName = ((Object)StringsKt.trim((CharSequence)oldName)).toString();
                        sanitizedNewName = ((Object)StringsKt.trim((CharSequence)newName)).toString();
                        if (!this.isValidName(sanitizedOldName) || !this.isValidName(sanitizedNewName)) {
                            return RenameResult.INVALID_NAME;
                        }
                        if (StringsKt.equals(sanitizedOldName, AUTO_LOAD_CONFIG, true)) break block21;
                        if (!StringsKt.equals(sanitizedNewName, AUTO_LOAD_CONFIG, true)) break block22;
                    }
                    return RenameResult.INVALID_NAME;
                }
                this.ensureConfigDirectory();
                configNames = this.getConfigNames();
                $this$firstOrNull$iv = configNames;
                $i$f$firstOrNull = false;
                for (Object element$iv : $this$firstOrNull$iv) {
                    it = (String)element$iv;
                    boolean bl = false;
                    if (!StringsKt.equals(it, sanitizedOldName, true)) continue;
                    v0 = element$iv;
                    break block19;
                }
                v0 = null;
            }
            String string = v0;
            if (string == null) {
                return RenameResult.NOT_FOUND;
            }
            actualOldName = string;
            if (Intrinsics.areEqual(actualOldName, sanitizedNewName)) {
                return RenameResult.UNCHANGED;
            }
            $this$firstOrNull$iv = configNames;
            $i$f$firstOrNull = false;
            for (Object element$iv : $this$firstOrNull$iv) {
                it = (String)element$iv;
                boolean bl = false;
                boolean bl2 = StringsKt.equals(it, sanitizedNewName, true) && !Intrinsics.areEqual(it, actualOldName);
                if (!bl2) continue;
                configManager = configManager2;
                break block20;
            }
            configManager = null;
        }
        String conflictingName = (String)((Object)configManager);
        if (conflictingName != null) {
            return RenameResult.ALREADY_EXISTS;
        }
        Path source = configPath.resolve(actualOldName + ".json");
        Path target = configPath.resolve(sanitizedNewName + ".json");
        configManager2 = this;
        try {
            Unit unit;
            ConfigManager $this$rename_u24lambda_u242 = configManager2;
            boolean bl = false;
            Intrinsics.checkNotNull(source);
            Intrinsics.checkNotNull(target);
            $this$rename_u24lambda_u242.moveConfigFile(source, target, StringsKt.equals(actualOldName, sanitizedNewName, true));
            JsonObject jsonObject = gson.fromJson($this$rename_u24lambda_u242.readConfigText(target), JsonObject.class);
            if (jsonObject == null) {
                throw new IllegalStateException("Config root is missing".toString());
            }
            JsonObject root = jsonObject;
            CloudConfigOrigin cloudConfigOrigin = $this$rename_u24lambda_u242.readCloudOrigin(root);
            if (cloudConfigOrigin != null) {
                CloudConfigOrigin origin = cloudConfigOrigin;
                boolean bl3 = false;
                root.add(CLOUD_ORIGIN_KEY, $this$rename_u24lambda_u242.serializeCloudOrigin(CloudConfigOrigin.copy$default(origin, null, null, null, 0L, false, 0, sanitizedNewName, false, false, 447, null)));
                String string = gson.toJson(root);
                Intrinsics.checkNotNullExpressionValue(string, "toJson(...)");
                $this$rename_u24lambda_u242.writeAtomically(target, string);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            object = Result.constructor-impl(unit);
        }
        catch (Throwable error) {
            object = Result.constructor-impl(ResultKt.createFailure(error));
        }
        Object result = object;
        Throwable throwable = Result.exceptionOrNull-impl(result);
        if (throwable != null) {
            Throwable throwable2 = throwable;
            boolean bl = false;
            logger.error("Failed to rename config '" + actualOldName + "' to '" + sanitizedNewName + "'", throwable2);
        }
        if (Result.isFailure-impl(result)) {
            return RenameResult.SAVE_FAILED;
        }
        if (StringsKt.equals(selectedConfigName, actualOldName, true)) {
            this.setSelectedConfigName((String)var4_4);
        }
        if (StringsKt.equals(activeConfigName, (String)var6_15, true)) {
            activeConfigName = var4_4;
        }
        this.markVisibleConfigsDirty();
        return RenameResult.RENAMED;
    }

    private static final boolean migrateLegacyConfigs$lambda$0$1(Function1 $tmp0, Object p0) {
        return (Boolean)$tmp0.invoke(p0);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    @NotNull
    public final String getCloudDisplayName(@NotNull String name) {
        void var1_1;
        String string;
        Intrinsics.checkNotNullParameter(name, "name");
        CloudConfigOrigin cloudConfigOrigin = this.getCloudOrigin(name);
        if (cloudConfigOrigin != null) {
            String string2 = cloudConfigOrigin.getCloudName();
            if (string2 != null) {
                String string3;
                String p0 = string3 = string2;
                boolean bl = false;
                String string4 = !StringsKt.isBlank(p0) ? string3 : null;
                if (string4 != null) {
                    string = string4;
                    return string;
                }
            }
        }
        string = var1_1;
        return string;
    }

    private final JsonObject serializeConfig(String author, CloudConfigOrigin cloudOrigin) {
        JsonObject jsonObject;
        JsonObject content = new JsonObject();
        Iterable $this$forEach$iv = \u062e\u064b.INSTANCE.getModules();
        boolean $i$f$forEach = false;
        for (Object element$iv : $this$forEach$iv) {
            Module module = (Module)element$iv;
            boolean bl = false;
            content.add(INSTANCE.moduleConfigKey(module), INSTANCE.serializeModule(module));
        }
        content.add(CLICK_GUI_SETTINGS_KEY, this.serializeSettings(\u0633\u0631.INSTANCE.getSettings()));
        JsonObject root = jsonObject = new JsonObject();
        boolean bl = false;
        root.addProperty(FORMAT_VERSION_KEY, 2);
        root.addProperty("Author", author);
        root.add(CONTENT_KEY, content);
        if (cloudOrigin != null) {
            root.add(CLOUD_ORIGIN_KEY, INSTANCE.serializeCloudOrigin(cloudOrigin));
        }
        return jsonObject;
    }

    private final ParsedConfig parseConfig(Path file) {
        JsonObject jsonObject = gson.fromJson(this.readConfigText(file), JsonObject.class);
        if (jsonObject == null) {
            throw new IllegalStateException("Config root is missing".toString());
        }
        JsonObject root = jsonObject;
        return this.parseConfigRoot(root);
    }

    static /* synthetic */ String lamda$load$1_528ef230(String string) {
        return string + ".json";
    }

    static /* synthetic */ String lamda$load$2_ae85aad(String string) {
        return "Failed to load config '" + string + "'";
    }

    static /* synthetic */ String lamda$save$1_3687b83c(String string) {
        return string + ".json";
    }

    static /* synthetic */ String lamda$save$2_4cbd17b3(String string) {
        return "Failed to save config '" + string + "'";
    }

    @Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0082\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b\u00a2\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u00c6\u0003\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000b0\bH\u00c6\u0003\u00a2\u0006\u0004\b\u0017\u0010\u0016JP\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\bH\u00c6\u0001\u00a2\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004\u00a2\u0006\u0004\b\u001c\u0010\u001dJ\u0011\u0010\u001e\u001a\u00020\u0002H\u00d6\u0081\u0004\u00a2\u0006\u0004\b\u001e\u0010\u0010J\u0011\u0010\u001f\u001a\u00020\u0004H\u00d6\u0081\u0004\u00a2\u0006\u0004\b\u001f\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u0012R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010\u0014R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006\u00a2\u0006\f\n\u0004\b\n\u0010&\u001a\u0004\b'\u0010\u0016R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b8\u0006\u00a2\u0006\f\n\u0004\b\f\u0010&\u001a\u0004\b(\u0010\u0016\u00a8\u0006)"}, d2={"Loxxxde/\u062e\u064c;", "", "", "formatVersion", "", "author", "Loxxxde/\u062f\u0629;", "cloudOrigin", "", "Loxxxde/\u0625;", "clickGuiSettings", "Loxxxde/\u062f\u0621;", "modules", "<init>", "(ILjava/lang/String;Lkotakbaz/rain/config/CloudConfigOrigin;Ljava/util/List;Ljava/util/List;)V", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "()Lkotakbaz/rain/config/CloudConfigOrigin;", "component4", "()Ljava/util/List;", "component5", "copy", "(ILjava/lang/String;Lkotakbaz/rain/config/CloudConfigOrigin;Ljava/util/List;Ljava/util/List;)Lkotakbaz/rain/config/ConfigManager$ParsedConfig;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "I", "getFormatVersion", "Ljava/lang/String;", "getAuthor", "Loxxxde/\u062f\u0629;", "getCloudOrigin", "Ljava/util/List;", "getClickGuiSettings", "getModules", "rain-visuals"})
    private static final class ParsedConfig {
        @NotNull
        private final String author;
        @NotNull
        private final List<SettingUpdate> clickGuiSettings;
        @Nullable
        private final CloudConfigOrigin cloudOrigin;
        private final int formatVersion;
        @NotNull
        private final List<ModuleUpdate> modules;

        @NotNull
        public final ParsedConfig copy(int formatVersion, @NotNull String author, @Nullable CloudConfigOrigin cloudOrigin, @NotNull List<SettingUpdate> clickGuiSettings, @NotNull List<ModuleUpdate> modules) {
            Intrinsics.checkNotNullParameter(author, "author");
            Intrinsics.checkNotNullParameter(clickGuiSettings, "clickGuiSettings");
            Intrinsics.checkNotNullParameter(modules, "modules");
            return new ParsedConfig(formatVersion, author, cloudOrigin, clickGuiSettings, modules);
        }

        @NotNull
        public final List<ModuleUpdate> component5() {
            return this.modules;
        }

        public final int getFormatVersion() {
            return this.formatVersion;
        }

        @NotNull
        public final List<SettingUpdate> getClickGuiSettings() {
            return this.clickGuiSettings;
        }

        @NotNull
        public final List<ModuleUpdate> getModules() {
            return this.modules;
        }

        @NotNull
        public final String component2() {
            return this.author;
        }

        /*
         * WARNING - void declaration
         */
        public int hashCode() {
            void var1_1;
            int result = Integer.hashCode(this.formatVersion);
            result = result * 31 + this.author.hashCode();
            result = result * 31 + (this.cloudOrigin == null ? 0 : this.cloudOrigin.hashCode());
            result = result * 31 + ((Object)this.clickGuiSettings).hashCode();
            result = result * 31 + ((Object)this.modules).hashCode();
            return (int)var1_1;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ParsedConfig)) {
                return false;
            }
            ParsedConfig parsedConfig = (ParsedConfig)other;
            if (this.formatVersion != parsedConfig.formatVersion) {
                return false;
            }
            if (!Intrinsics.areEqual(this.author, parsedConfig.author)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.cloudOrigin, parsedConfig.cloudOrigin)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.clickGuiSettings, parsedConfig.clickGuiSettings)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.modules, parsedConfig.modules)) {
                return false;
            }
            return true;
        }

        public ParsedConfig(int formatVersion, @NotNull String author, @Nullable CloudConfigOrigin cloudOrigin, @NotNull List<SettingUpdate> clickGuiSettings, @NotNull List<ModuleUpdate> modules) {
            Intrinsics.checkNotNullParameter(author, "author");
            Intrinsics.checkNotNullParameter(clickGuiSettings, "clickGuiSettings");
            Intrinsics.checkNotNullParameter(modules, "modules");
            this.formatVersion = formatVersion;
            this.author = author;
            this.cloudOrigin = cloudOrigin;
            this.clickGuiSettings = clickGuiSettings;
            this.modules = modules;
        }

        @NotNull
        public final List<SettingUpdate> component4() {
            return this.clickGuiSettings;
        }

        @NotNull
        public String toString() {
            return "ParsedConfig(formatVersion=" + this.formatVersion + ", author=" + this.author + ", cloudOrigin=" + this.cloudOrigin + ", clickGuiSettings=" + this.clickGuiSettings + ", modules=" + this.modules + ")";
        }

        @Nullable
        public final CloudConfigOrigin getCloudOrigin() {
            return this.cloudOrigin;
        }

        public static /* synthetic */ ParsedConfig copy$default(ParsedConfig parsedConfig, int n, String string, CloudConfigOrigin cloudConfigOrigin, List list, List list2, int n2, Object object) {
            if ((n2 & 1) != 0) {
                n = parsedConfig.formatVersion;
            }
            if ((n2 & 2) != 0) {
                string = parsedConfig.author;
            }
            if ((n2 & 4) != 0) {
                cloudConfigOrigin = parsedConfig.cloudOrigin;
            }
            if ((n2 & 8) != 0) {
                list = parsedConfig.clickGuiSettings;
            }
            if ((n2 & 0x10) != 0) {
                list2 = parsedConfig.modules;
            }
            return parsedConfig.copy(n, string, cloudConfigOrigin, list, list2);
        }

        @Nullable
        public final CloudConfigOrigin component3() {
            return this.cloudOrigin;
        }

        public final int component1() {
            return this.formatVersion;
        }

        @NotNull
        public final String getAuthor() {
            return this.author;
        }
    }

    @Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0082\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u00c6\u0003\u00a2\u0006\u0004\b\u0013\u0010\u0014JB\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u00c6\u0001\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0018\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004\u00a2\u0006\u0004\b\u0018\u0010\u0019J\u0011\u0010\u001a\u001a\u00020\u0004H\u00d6\u0081\u0004\u00a2\u0006\u0004\b\u001a\u0010\u001bJ\u0011\u0010\u001d\u001a\u00020\u001cH\u00d6\u0081\u0004\u00a2\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u000eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\u0010R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010\u0012R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006\u00a2\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b&\u0010\u0014\u00a8\u0006'"}, d2={"Loxxxde/\u062f\u0621;", "", "Loxxxde/\u062f\u0650;", "module", "", "key", "", "enabled", "", "Loxxxde/\u0625;", "settings", "<init>", "(Lkotakbaz/rain/module/Module;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/util/List;)V", "component1", "()Lkotakbaz/rain/module/Module;", "component2", "()Ljava/lang/Integer;", "component3", "()Ljava/lang/Boolean;", "component4", "()Ljava/util/List;", "copy", "(Lkotakbaz/rain/module/Module;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/util/List;)Lkotakbaz/rain/config/ConfigManager$ModuleUpdate;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Loxxxde/\u062f\u0650;", "getModule", "Ljava/lang/Integer;", "getKey", "Ljava/lang/Boolean;", "getEnabled", "Ljava/util/List;", "getSettings", "rain-visuals"})
    private static final class ModuleUpdate {
        @Nullable
        private final Boolean enabled;
        @NotNull
        private final List<SettingUpdate> settings;
        @Nullable
        private final Integer key;
        @NotNull
        private final Module module;

        @Nullable
        public final Integer getKey() {
            return this.key;
        }

        @NotNull
        public final List<SettingUpdate> getSettings() {
            return this.settings;
        }

        @Nullable
        public final Boolean getEnabled() {
            return this.enabled;
        }

        @NotNull
        public final Module component1() {
            return this.module;
        }

        @NotNull
        public String toString() {
            return "ModuleUpdate(module=" + this.module + ", key=" + this.key + ", enabled=" + this.enabled + ", settings=" + this.settings + ")";
        }

        @NotNull
        public final Module getModule() {
            return this.module;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ModuleUpdate)) {
                return false;
            }
            ModuleUpdate moduleUpdate = (ModuleUpdate)other;
            if (!Intrinsics.areEqual(this.module, moduleUpdate.module)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.key, moduleUpdate.key)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.enabled, moduleUpdate.enabled)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.settings, moduleUpdate.settings)) {
                return false;
            }
            return true;
        }

        public static /* synthetic */ ModuleUpdate copy$default(ModuleUpdate moduleUpdate, Module module, Integer n, Boolean bl, List list, int n2, Object object) {
            if ((n2 & 1) != 0) {
                module = moduleUpdate.module;
            }
            if ((n2 & 2) != 0) {
                n = moduleUpdate.key;
            }
            if ((n2 & 4) != 0) {
                bl = moduleUpdate.enabled;
            }
            if ((n2 & 8) != 0) {
                list = moduleUpdate.settings;
            }
            return moduleUpdate.copy(module, n, bl, list);
        }

        public ModuleUpdate(@NotNull Module module, @Nullable Integer key, @Nullable Boolean enabled, @NotNull List<SettingUpdate> settings) {
            Intrinsics.checkNotNullParameter(module, "module");
            Intrinsics.checkNotNullParameter(settings, "settings");
            this.module = module;
            this.key = key;
            this.enabled = enabled;
            this.settings = settings;
        }

        public int hashCode() {
            int result = this.module.hashCode();
            result = result * 31 + (this.key == null ? 0 : ((Object)this.key).hashCode());
            result = result * 31 + (this.enabled == null ? 0 : ((Object)this.enabled).hashCode());
            int n = result * 31 + ((Object)this.settings).hashCode();
            return n;
        }

        @Nullable
        public final Boolean component3() {
            return this.enabled;
        }

        @NotNull
        public final ModuleUpdate copy(@NotNull Module module, @Nullable Integer key, @Nullable Boolean enabled, @NotNull List<SettingUpdate> settings) {
            Intrinsics.checkNotNullParameter(module, "module");
            Intrinsics.checkNotNullParameter(settings, "settings");
            return new ModuleUpdate(module, key, enabled, settings);
        }

        @Nullable
        public final Integer component2() {
            return this.key;
        }

        @NotNull
        public final List<SettingUpdate> component4() {
            return this.settings;
        }
    }

    @Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0082\b\u0018\u00002\u00020\u0001B\u001b\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u0014\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0001H\u00c6\u0003\u00a2\u0006\u0004\b\t\u0010\nJ(\u0010\u000b\u001a\u00020\u00002\f\b\u0002\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0001H\u00c6\u0001\u00a2\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u0012\u001a\u00020\u0011H\u00d6\u0081\u0004\u00a2\u0006\u0004\b\u0012\u0010\u0013J\u0011\u0010\u0015\u001a\u00020\u0014H\u00d6\u0081\u0004\u00a2\u0006\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00018\u0006\u00a2\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\n\u00a8\u0006\u001b"}, d2={"Loxxxde/\u0625;", "", "Loxxxde/\u0631\u0641;", "setting", "value", "<init>", "(Lkotakbaz/rain/module/setting/Setting;Ljava/lang/Object;)V", "component1", "()Lkotakbaz/rain/module/setting/Setting;", "component2", "()Ljava/lang/Object;", "copy", "(Lkotakbaz/rain/module/setting/Setting;Ljava/lang/Object;)Lkotakbaz/rain/config/ConfigManager$SettingUpdate;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Loxxxde/\u0631\u0641;", "getSetting", "Ljava/lang/Object;", "getValue", "rain-visuals"})
    private static final class SettingUpdate {
        @NotNull
        private final Object value;
        @NotNull
        private final Setting<?> setting;

        @NotNull
        public String toString() {
            return "SettingUpdate(setting=" + this.setting + ", value=" + this.value + ")";
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SettingUpdate)) {
                return false;
            }
            SettingUpdate settingUpdate = (SettingUpdate)other;
            if (!Intrinsics.areEqual(this.setting, settingUpdate.setting)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.value, settingUpdate.value)) {
                return false;
            }
            return true;
        }

        @NotNull
        public final Setting<?> component1() {
            return this.setting;
        }

        public static /* synthetic */ SettingUpdate copy$default(SettingUpdate settingUpdate, Setting setting, Object object, int n, Object object2) {
            if ((n & 1) != 0) {
                setting = settingUpdate.setting;
            }
            if ((n & 2) != 0) {
                object = settingUpdate.value;
            }
            return settingUpdate.copy(setting, object);
        }

        @NotNull
        public final Object getValue() {
            return this.value;
        }

        @NotNull
        public final Setting<?> getSetting() {
            return this.setting;
        }

        public int hashCode() {
            int result = this.setting.hashCode();
            result = result * 31 + this.value.hashCode();
            return result;
        }

        public SettingUpdate(@NotNull Setting<?> setting, @NotNull Object value) {
            Intrinsics.checkNotNullParameter(setting, "setting");
            Intrinsics.checkNotNullParameter(value, "value");
            this.setting = setting;
            this.value = value;
        }

        @NotNull
        public final Object component2() {
            return this.value;
        }

        @NotNull
        public final SettingUpdate copy(@NotNull Setting<?> setting, @NotNull Object value) {
            Intrinsics.checkNotNullParameter(setting, "setting");
            Intrinsics.checkNotNullParameter(value, "value");
            return new SettingUpdate(setting, value);
        }
    }

    @Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b\u00a8\u0006\t"}, d2={"Loxxxde/\u062f\u0635;", "", "<init>", "(Ljava/lang/String;I)V", "CREATED", "ALREADY_EXISTS", "INVALID_NAME", "CLOUD_SOURCE", "SAVE_FAILED", "rain-visuals"})
    public static final class CreateResult
    extends Enum<CreateResult> {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        public static final /* enum */ CreateResult CREATED = new CreateResult();
        public static final /* enum */ CreateResult CLOUD_SOURCE;
        public static final /* enum */ CreateResult SAVE_FAILED;
        public static final /* enum */ CreateResult INVALID_NAME;
        public static final /* enum */ CreateResult ALREADY_EXISTS;
        private static final /* synthetic */ CreateResult[] $VALUES;

        public static CreateResult valueOf(String value) {
            return Enum.valueOf(CreateResult.class, value);
        }

        @NotNull
        public static EnumEntries<CreateResult> getEntries() {
            return $ENTRIES;
        }

        private static final /* synthetic */ CreateResult[] $values() {
            CreateResult[] createResultArray = new CreateResult[5];
            createResultArray[0] = CREATED;
            createResultArray[1] = ALREADY_EXISTS;
            createResultArray[2] = INVALID_NAME;
            createResultArray[3] = CLOUD_SOURCE;
            createResultArray[4] = SAVE_FAILED;
            return createResultArray;
        }

        public static CreateResult[] values() {
            return (CreateResult[])$VALUES.clone();
        }

        static {
            ALREADY_EXISTS = new CreateResult();
            INVALID_NAME = new CreateResult();
            CLOUD_SOURCE = new CreateResult();
            SAVE_FAILED = new CreateResult();
            $VALUES = CreateResult.$values();
            $ENTRIES = EnumEntriesKt.enumEntries((Enum[])$VALUES);
        }
    }

    @Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t\u00a8\u0006\n"}, d2={"Loxxxde/\u0628;", "", "<init>", "(Ljava/lang/String;I)V", "RENAMED", "UNCHANGED", "NOT_FOUND", "ALREADY_EXISTS", "INVALID_NAME", "SAVE_FAILED", "rain-visuals"})
    public static final class RenameResult
    extends Enum<RenameResult> {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        public static final /* enum */ RenameResult SAVE_FAILED;
        public static final /* enum */ RenameResult INVALID_NAME;
        public static final /* enum */ RenameResult NOT_FOUND;
        public static final /* enum */ RenameResult RENAMED;
        public static final /* enum */ RenameResult UNCHANGED;
        public static final /* enum */ RenameResult ALREADY_EXISTS;
        private static final /* synthetic */ RenameResult[] $VALUES;

        public static RenameResult[] values() {
            return (RenameResult[])$VALUES.clone();
        }

        private static final /* synthetic */ RenameResult[] $values() {
            RenameResult[] renameResultArray = new RenameResult[6];
            renameResultArray[0] = RENAMED;
            renameResultArray[1] = UNCHANGED;
            renameResultArray[2] = NOT_FOUND;
            renameResultArray[3] = ALREADY_EXISTS;
            renameResultArray[4] = INVALID_NAME;
            renameResultArray[5] = SAVE_FAILED;
            return renameResultArray;
        }

        public static RenameResult valueOf(String value) {
            return Enum.valueOf(RenameResult.class, value);
        }

        @NotNull
        public static EnumEntries<RenameResult> getEntries() {
            return $ENTRIES;
        }

        static {
            RENAMED = new RenameResult();
            UNCHANGED = new RenameResult();
            NOT_FOUND = new RenameResult();
            ALREADY_EXISTS = new RenameResult();
            INVALID_NAME = new RenameResult();
            SAVE_FAILED = new RenameResult();
            $VALUES = RenameResult.$values();
            $ENTRIES = EnumEntriesKt.enumEntries((Enum[])$VALUES);
        }
    }

    @Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0082\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u000b\u0010\nJ0\u0010\f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002H\u00c6\u0001\u00a2\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u0011\u0010\u0013\u001a\u00020\u0012H\u00d6\u0081\u0004\u00a2\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010\u0016\u001a\u00020\u0015H\u00d6\u0081\u0004\u00a2\u0006\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001a\u0010\n\u00a8\u0006\u001b"}, d2={"Loxxxde/\u0636\u062c;", "", "", "Loxxxde/\u0625;", "clickGuiSettings", "Loxxxde/\u062f\u0621;", "modules", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "component1", "()Ljava/util/List;", "component2", "copy", "(Ljava/util/List;Ljava/util/List;)Lkotakbaz/rain/config/ConfigManager$RuntimeSnapshot;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getClickGuiSettings", "getModules", "rain-visuals"})
    private static final class RuntimeSnapshot {
        @NotNull
        private final List<ModuleUpdate> modules;
        @NotNull
        private final List<SettingUpdate> clickGuiSettings;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RuntimeSnapshot)) {
                return false;
            }
            RuntimeSnapshot runtimeSnapshot = (RuntimeSnapshot)other;
            if (!Intrinsics.areEqual(this.clickGuiSettings, runtimeSnapshot.clickGuiSettings)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.modules, runtimeSnapshot.modules)) {
                return false;
            }
            return true;
        }

        @NotNull
        public final RuntimeSnapshot copy(@NotNull List<SettingUpdate> clickGuiSettings, @NotNull List<ModuleUpdate> modules) {
            Intrinsics.checkNotNullParameter(clickGuiSettings, "clickGuiSettings");
            Intrinsics.checkNotNullParameter(modules, "modules");
            return new RuntimeSnapshot(clickGuiSettings, modules);
        }

        @NotNull
        public final List<SettingUpdate> getClickGuiSettings() {
            return this.clickGuiSettings;
        }

        @NotNull
        public final List<ModuleUpdate> getModules() {
            return this.modules;
        }

        @NotNull
        public final List<SettingUpdate> component1() {
            return this.clickGuiSettings;
        }

        @NotNull
        public String toString() {
            return "RuntimeSnapshot(clickGuiSettings=" + this.clickGuiSettings + ", modules=" + this.modules + ")";
        }

        public int hashCode() {
            int result = ((Object)this.clickGuiSettings).hashCode();
            result = result * 31 + ((Object)this.modules).hashCode();
            return result;
        }

        public static /* synthetic */ RuntimeSnapshot copy$default(RuntimeSnapshot runtimeSnapshot, List list, List list2, int n, Object object) {
            if ((n & 1) != 0) {
                list = runtimeSnapshot.clickGuiSettings;
            }
            if ((n & 2) != 0) {
                list2 = runtimeSnapshot.modules;
            }
            return runtimeSnapshot.copy(list, list2);
        }

        public RuntimeSnapshot(@NotNull List<SettingUpdate> clickGuiSettings, @NotNull List<ModuleUpdate> modules) {
            Intrinsics.checkNotNullParameter(clickGuiSettings, "clickGuiSettings");
            Intrinsics.checkNotNullParameter(modules, "modules");
            this.clickGuiSettings = clickGuiSettings;
            this.modules = modules;
        }

        @NotNull
        public final List<ModuleUpdate> component2() {
            return this.modules;
        }
    }
}

