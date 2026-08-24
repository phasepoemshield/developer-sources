/*
 * Decompiled with CFR 0.152.
 */
package kotlin.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.BuilderInference;
import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.WasExperimental;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=5, xi=49, d1={"\u0000\u0088\u0001\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010&\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\u0010'\n\u0002\b\n\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\u001ag\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0003\u001a\u00020\u00022%\b\u0001\u0010\b\u001a\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u00a2\u0006\u0002\b\u0007H\u0087\b\u00f8\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001\u00a2\u0006\u0004\b\n\u0010\u000b\u001a_\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012%\b\u0001\u0010\b\u001a\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u00a2\u0006\u0002\b\u0007H\u0087\b\u00f8\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\u00a2\u0006\u0004\b\n\u0010\f\u001a%\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\u00a2\u0006\u0004\b\r\u0010\u000e\u001a8\u0010\u0011\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000fj\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u0010\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001H\u0087\b\u00a2\u0006\u0004\b\u0011\u0010\u0012\u001aa\u0010\u0011\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000fj\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u0010\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012*\u0010\u0015\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00140\u0013\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0014\u00a2\u0006\u0004\b\u0011\u0010\u0016\u001a8\u0010\u0019\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0017j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u0018\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001H\u0087\b\u00a2\u0006\u0004\b\u0019\u0010\u001a\u001aa\u0010\u0019\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0017j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u0018\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012*\u0010\u0015\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00140\u0013\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0014\u00a2\u0006\u0004\b\u0019\u0010\u001b\u001a(\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001H\u0087\b\u00a2\u0006\u0004\b\u001c\u0010\u000e\u001aQ\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012*\u0010\u0015\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00140\u0013\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0014\u00a2\u0006\u0004\b\u001c\u0010\u001d\u001a(\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001H\u0087\b\u00a2\u0006\u0004\b\u001e\u0010\u000e\u001aQ\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012*\u0010\u0015\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00140\u0013\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0014\u00a2\u0006\u0004\b\u001e\u0010\u001d\u001a,\u0010 \u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001fH\u0087\n\u00a2\u0006\u0004\b \u0010!\u001a,\u0010\"\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001fH\u0087\n\u00a2\u0006\u0004\b\"\u0010!\u001a;\u0010&\u001a\u00020%\"\t\b\u0000\u0010\u0000\u00a2\u0006\u0002\b#\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t2\u0006\u0010$\u001a\u00028\u0000H\u0087\n\u00a2\u0006\u0004\b&\u0010'\u001a3\u0010(\u001a\u00020%\"\t\b\u0000\u0010\u0000\u00a2\u0006\u0002\b#*\u000e\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0002\b\u00030\t2\u0006\u0010$\u001a\u00028\u0000H\u0087\b\u00a2\u0006\u0004\b(\u0010'\u001a9\u0010*\u001a\u00020%\"\u0004\b\u0000\u0010\u0000\"\t\b\u0001\u0010\u0001\u00a2\u0006\u0002\b#*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t2\u0006\u0010)\u001a\u00028\u0001H\u0087\b\u00a2\u0006\u0004\b*\u0010'\u001a]\u0010,\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t2\u001e\u0010+\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001f\u0012\u0004\u0012\u00020%0\u0004H\u0086\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b,\u0010-\u001aQ\u0010.\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020%0\u0004H\u0086\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b.\u0010-\u001a]\u0010/\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t2\u001e\u0010+\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001f\u0012\u0004\u0012\u00020%0\u0004H\u0086\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b/\u0010-\u001as\u00102\u001a\u00028\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0018\b\u0002\u00100*\u0012\u0012\u0006\b\u0000\u0012\u00028\u0000\u0012\u0006\b\u0000\u0012\u00028\u00010\u0005*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t2\u0006\u00101\u001a\u00028\u00022\u001e\u0010+\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001f\u0012\u0004\u0012\u00020%0\u0004H\u0086\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b2\u00103\u001as\u00104\u001a\u00028\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0018\b\u0002\u00100*\u0012\u0012\u0006\b\u0000\u0012\u00028\u0000\u0012\u0006\b\u0000\u0012\u00028\u00010\u0005*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t2\u0006\u00101\u001a\u00028\u00022\u001e\u0010+\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001f\u0012\u0004\u0012\u00020%0\u0004H\u0086\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b4\u00103\u001aQ\u00105\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020%0\u0004H\u0086\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b5\u0010-\u001a=\u00106\u001a\u0004\u0018\u00018\u0001\"\t\b\u0000\u0010\u0000\u00a2\u0006\u0002\b#\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t2\u0006\u0010$\u001a\u00028\u0000H\u0087\n\u00a2\u0006\u0004\b6\u00107\u001aE\u0010:\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t2\u0006\u0010$\u001a\u00028\u00002\f\u00109\u001a\b\u0012\u0004\u0012\u00028\u000108H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b:\u0010;\u001aE\u0010<\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t2\u0006\u0010$\u001a\u00028\u00002\f\u00109\u001a\b\u0012\u0004\u0012\u00028\u000108H\u0080\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b<\u0010;\u001aE\u0010=\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00052\u0006\u0010$\u001a\u00028\u00002\f\u00109\u001a\b\u0012\u0004\u0012\u00028\u000108H\u0086\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b=\u0010;\u001a3\u0010>\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t2\u0006\u0010$\u001a\u00028\u0000H\u0007\u00a2\u0006\u0004\b>\u00107\u001aA\u0010@\u001a\u00028\u0001\"\u0014\b\u0000\u00100*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\t*\u00028\u0001\"\u0004\b\u0001\u0010?*\u00028\u00002\f\u00109\u001a\b\u0012\u0004\u0012\u00028\u000108H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b@\u0010A\u001a.\u0010B\u001a\u00020%\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\tH\u0087\b\u00a2\u0006\u0004\bB\u0010C\u001aA\u0010D\u001a\u00020%\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0012\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\tH\u0087\b\u0082\u0002\u000e\n\f\b\u0000\u0012\u0002\u0018\u0001\u001a\u0004\b\u0003\u0010\u0000\u00a2\u0006\u0004\bD\u0010C\u001a@\u0010F\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001f0E\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\tH\u0087\n\u00a2\u0006\u0004\bF\u0010G\u001a>\u0010F\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010I0H\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005H\u0087\n\u00a2\u0006\u0004\bJ\u0010G\u001ac\u0010L\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00010\t\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010?*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t2\u001e\u0010K\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001f\u0012\u0004\u0012\u00028\u00020\u0004H\u0086\b\u00f8\u0001\u0000\u00a2\u0006\u0004\bL\u0010-\u001ay\u0010M\u001a\u00028\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010?\"\u0018\b\u0003\u00100*\u0012\u0012\u0006\b\u0000\u0012\u00028\u0002\u0012\u0006\b\u0000\u0012\u00028\u00010\u0005*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t2\u0006\u00101\u001a\u00028\u00032\u001e\u0010K\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001f\u0012\u0004\u0012\u00028\u00020\u0004H\u0086\b\u00f8\u0001\u0000\u00a2\u0006\u0004\bM\u00103\u001ac\u0010N\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\t\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010?*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t2\u001e\u0010K\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001f\u0012\u0004\u0012\u00028\u00020\u0004H\u0086\b\u00f8\u0001\u0000\u00a2\u0006\u0004\bN\u0010-\u001ay\u0010O\u001a\u00028\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010?\"\u0018\b\u0003\u00100*\u0012\u0012\u0006\b\u0000\u0012\u00028\u0000\u0012\u0006\b\u0000\u0012\u00028\u00020\u0005*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t2\u0006\u00101\u001a\u00028\u00032\u001e\u0010K\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001f\u0012\u0004\u0012\u00028\u00020\u0004H\u0086\b\u00f8\u0001\u0000\u00a2\u0006\u0004\bO\u00103\u001aB\u0010P\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t2\u0006\u0010$\u001a\u00028\u0000H\u0087\u0002\u00a2\u0006\u0004\bP\u0010Q\u001aJ\u0010P\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t2\u000e\u0010R\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0013H\u0087\u0002\u00a2\u0006\u0004\bP\u0010S\u001aH\u0010P\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t2\f\u0010R\u001a\b\u0012\u0004\u0012\u00028\u00000TH\u0087\u0002\u00a2\u0006\u0004\bP\u0010U\u001aH\u0010P\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t2\f\u0010R\u001a\b\u0012\u0004\u0012\u00028\u00000VH\u0087\u0002\u00a2\u0006\u0004\bP\u0010W\u001a4\u0010X\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00052\u0006\u0010$\u001a\u00028\u0000H\u0087\n\u00a2\u0006\u0004\bX\u0010Y\u001a<\u0010X\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00052\u000e\u0010R\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0013H\u0087\n\u00a2\u0006\u0004\bX\u0010Z\u001a:\u0010X\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00052\f\u0010R\u001a\b\u0012\u0004\u0012\u00028\u00000TH\u0087\n\u00a2\u0006\u0004\bX\u0010[\u001a:\u0010X\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00052\f\u0010R\u001a\b\u0012\u0004\u0012\u00028\u00000VH\u0087\n\u00a2\u0006\u0004\bX\u0010\\\u001a7\u0010]\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\tH\u0000\u00a2\u0006\u0004\b]\u0010^\u001a:\u0010_\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\tH\u0087\b\u00a2\u0006\u0004\b_\u0010^\u001aV\u0010`\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t2\u001a\u0010\u0015\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00140\u0013H\u0086\u0002\u00a2\u0006\u0004\b`\u0010a\u001aN\u0010`\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t2\u0012\u0010b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0014H\u0086\u0002\u00a2\u0006\u0004\b`\u0010c\u001aT\u0010`\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t2\u0018\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00140TH\u0086\u0002\u00a2\u0006\u0004\b`\u0010U\u001aP\u0010`\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t2\u0014\u0010d\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\tH\u0086\u0002\u00a2\u0006\u0004\b`\u0010e\u001aT\u0010`\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t2\u0018\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00140VH\u0086\u0002\u00a2\u0006\u0004\b`\u0010W\u001aL\u0010f\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0012\u0012\u0006\b\u0000\u0012\u00028\u0000\u0012\u0006\b\u0000\u0012\u00028\u00010\u00052\u001a\u0010\u0015\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00140\u0013H\u0087\n\u00a2\u0006\u0004\bf\u0010g\u001aD\u0010f\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0012\u0012\u0006\b\u0000\u0012\u00028\u0000\u0012\u0006\b\u0000\u0012\u00028\u00010\u00052\u0012\u0010b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0014H\u0087\n\u00a2\u0006\u0004\bf\u0010h\u001aJ\u0010f\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0012\u0012\u0006\b\u0000\u0012\u00028\u0000\u0012\u0006\b\u0000\u0012\u00028\u00010\u00052\u0018\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00140TH\u0087\n\u00a2\u0006\u0004\bf\u0010[\u001aD\u0010f\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0012\u0012\u0006\b\u0000\u0012\u00028\u0000\u0012\u0006\b\u0000\u0012\u00028\u00010\u00052\u0012\u0010d\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\tH\u0087\n\u00a2\u0006\u0004\bf\u0010i\u001aJ\u0010f\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0012\u0012\u0006\b\u0000\u0012\u00028\u0000\u0012\u0006\b\u0000\u0012\u00028\u00010\u00052\u0018\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00140VH\u0087\n\u00a2\u0006\u0004\bf\u0010\\\u001aI\u0010j\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0012\u0012\u0006\b\u0000\u0012\u00028\u0000\u0012\u0006\b\u0000\u0012\u00028\u00010\u00052\u001a\u0010\u0015\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00140\u0013\u00a2\u0006\u0004\bj\u0010g\u001aG\u0010j\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0012\u0012\u0006\b\u0000\u0012\u00028\u0000\u0012\u0006\b\u0000\u0012\u00028\u00010\u00052\u0018\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00140T\u00a2\u0006\u0004\bj\u0010[\u001aG\u0010j\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0012\u0012\u0006\b\u0000\u0012\u00028\u0000\u0012\u0006\b\u0000\u0012\u00028\u00010\u00052\u0018\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00140V\u00a2\u0006\u0004\bj\u0010\\\u001a=\u0010k\u001a\u0004\u0018\u00018\u0001\"\t\b\u0000\u0010\u0000\u00a2\u0006\u0002\b#\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00052\u0006\u0010$\u001a\u00028\u0000H\u0087\b\u00a2\u0006\u0004\bk\u00107\u001a<\u0010l\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00052\u0006\u0010$\u001a\u00028\u00002\u0006\u0010)\u001a\u00028\u0001H\u0087\n\u00a2\u0006\u0004\bl\u0010m\u001a=\u0010n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00140\u0013\u00a2\u0006\u0004\bn\u0010\u001d\u001aS\u0010n\u001a\u00028\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0018\b\u0002\u00100*\u0012\u0012\u0006\b\u0000\u0012\u00028\u0000\u0012\u0006\b\u0000\u0012\u00028\u00010\u0005*\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00140\u00132\u0006\u00101\u001a\u00028\u0002\u00a2\u0006\u0004\bn\u0010o\u001a;\u0010n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00140T\u00a2\u0006\u0004\bn\u0010p\u001aQ\u0010n\u001a\u00028\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0018\b\u0002\u00100*\u0012\u0012\u0006\b\u0000\u0012\u00028\u0000\u0012\u0006\b\u0000\u0012\u00028\u00010\u0005*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00140T2\u0006\u00101\u001a\u00028\u0002\u00a2\u0006\u0004\bn\u0010q\u001a9\u0010n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\tH\u0007\u00a2\u0006\u0004\bn\u0010^\u001aO\u0010n\u001a\u00028\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0018\b\u0002\u00100*\u0012\u0012\u0006\b\u0000\u0012\u00028\u0000\u0012\u0006\b\u0000\u0012\u00028\u00010\u0005*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t2\u0006\u00101\u001a\u00028\u0002H\u0007\u00a2\u0006\u0004\bn\u0010e\u001a;\u0010n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00140V\u00a2\u0006\u0004\bn\u0010r\u001aQ\u0010n\u001a\u00028\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0018\b\u0002\u00100*\u0012\u0012\u0006\b\u0000\u0012\u00028\u0000\u0012\u0006\b\u0000\u0012\u00028\u00010\u0005*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00140V2\u0006\u00101\u001a\u00028\u0002\u00a2\u0006\u0004\bn\u0010s\u001a9\u0010t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\tH\u0007\u00a2\u0006\u0004\bt\u0010^\u001a8\u0010u\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0014\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001fH\u0087\b\u00a2\u0006\u0004\bu\u0010v\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006w"}, d2={"K", "V", "", "capacity", "Lkotlin/Function1;", "", "", "Lkotlin/ExtensionFunctionType;", "builderAction", "", "buildMap", "(ILkotlin/jvm/functions/Function1;)Ljava/util/Map;", "(Lkotlin/jvm/functions/Function1;)Ljava/util/Map;", "emptyMap", "()Ljava/util/Map;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "hashMapOf", "()Ljava/util/HashMap;", "", "Lkotlin/Pair;", "pairs", "([Lkotlin/Pair;)Ljava/util/HashMap;", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/LinkedHashMap;", "linkedMapOf", "()Ljava/util/LinkedHashMap;", "([Lkotlin/Pair;)Ljava/util/LinkedHashMap;", "mapOf", "([Lkotlin/Pair;)Ljava/util/Map;", "mutableMapOf", "", "component1", "(Ljava/util/Map$Entry;)Ljava/lang/Object;", "component2", "Lkotlin/internal/OnlyInputTypes;", "key", "", "contains", "(Ljava/util/Map;Ljava/lang/Object;)Z", "containsKey", "value", "containsValue", "predicate", "filter", "(Ljava/util/Map;Lkotlin/jvm/functions/Function1;)Ljava/util/Map;", "filterKeys", "filterNot", "M", "destination", "filterNotTo", "(Ljava/util/Map;Ljava/util/Map;Lkotlin/jvm/functions/Function1;)Ljava/util/Map;", "filterTo", "filterValues", "get", "(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlin/Function0;", "defaultValue", "getOrElse", "(Ljava/util/Map;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "getOrElseNullable", "getOrPut", "getValue", "R", "ifEmpty", "(Ljava/util/Map;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "isNotEmpty", "(Ljava/util/Map;)Z", "isNullOrEmpty", "", "iterator", "(Ljava/util/Map;)Ljava/util/Iterator;", "", "", "mutableIterator", "transform", "mapKeys", "mapKeysTo", "mapValues", "mapValuesTo", "minus", "(Ljava/util/Map;Ljava/lang/Object;)Ljava/util/Map;", "keys", "(Ljava/util/Map;[Ljava/lang/Object;)Ljava/util/Map;", "", "(Ljava/util/Map;Ljava/lang/Iterable;)Ljava/util/Map;", "Lkotlin/sequences/Sequence;", "(Ljava/util/Map;Lkotlin/sequences/Sequence;)Ljava/util/Map;", "minusAssign", "(Ljava/util/Map;Ljava/lang/Object;)V", "(Ljava/util/Map;[Ljava/lang/Object;)V", "(Ljava/util/Map;Ljava/lang/Iterable;)V", "(Ljava/util/Map;Lkotlin/sequences/Sequence;)V", "optimizeReadOnlyMap", "(Ljava/util/Map;)Ljava/util/Map;", "orEmpty", "plus", "(Ljava/util/Map;[Lkotlin/Pair;)Ljava/util/Map;", "pair", "(Ljava/util/Map;Lkotlin/Pair;)Ljava/util/Map;", "map", "(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;", "plusAssign", "(Ljava/util/Map;[Lkotlin/Pair;)V", "(Ljava/util/Map;Lkotlin/Pair;)V", "(Ljava/util/Map;Ljava/util/Map;)V", "putAll", "remove", "set", "(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)V", "toMap", "([Lkotlin/Pair;Ljava/util/Map;)Ljava/util/Map;", "(Ljava/lang/Iterable;)Ljava/util/Map;", "(Ljava/lang/Iterable;Ljava/util/Map;)Ljava/util/Map;", "(Lkotlin/sequences/Sequence;)Ljava/util/Map;", "(Lkotlin/sequences/Sequence;Ljava/util/Map;)Ljava/util/Map;", "toMutableMap", "toPair", "(Ljava/util/Map$Entry;)Lkotlin/Pair;", "kotlin-stdlib"}, xs="kotlin/collections/MapsKt")
class MapsKt__MapsKt
extends MapsKt__MapsJVMKt {
    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M toMap(@NotNull Pair<? extends K, ? extends V>[] $this$toMap, @NotNull M destination) {
        Intrinsics.checkNotNullParameter($this$toMap, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        M m = destination;
        M $this$toMap_u24lambda_u248 = m;
        boolean bl = false;
        MapsKt.putAll($this$toMap_u24lambda_u248, $this$toMap);
        return m;
    }

    /*
     * WARNING - void declaration
     */
    public static final <K, V> V getOrPut(@NotNull Map<K, V> $this$getOrPut, K key, @NotNull Function0<? extends V> defaultValue) {
        void v0;
        Intrinsics.checkNotNullParameter($this$getOrPut, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        boolean $i$f$getOrPut = false;
        V value = $this$getOrPut.get(key);
        if (value == null) {
            void var5_5;
            V answer = defaultValue.invoke();
            $this$getOrPut.put(key, answer);
            v0 = var5_5;
        } else {
            void var4_4;
            v0 = var4_4;
        }
        return v0;
    }

    public static final <K, V> void putAll(@NotNull Map<? super K, ? super V> $this$putAll, @NotNull Pair<? extends K, ? extends V>[] pairs) {
        Intrinsics.checkNotNullParameter($this$putAll, "<this>");
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        int n = pairs.length;
        for (int i = 0; i < n; ++i) {
            Pair<K, V> pair = pairs[i];
            K key = pair.component1();
            V value = pair.component2();
            $this$putAll.put(key, value);
        }
    }

    @NotNull
    public static final <K, V> Map<K, V> plus(@NotNull Map<? extends K, ? extends V> $this$plus, @NotNull Iterable<? extends Pair<? extends K, ? extends V>> pairs) {
        Map map;
        Intrinsics.checkNotNullParameter($this$plus, "<this>");
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        if ($this$plus.isEmpty()) {
            map = MapsKt.toMap(pairs);
        } else {
            LinkedHashMap<? extends K, ? extends V> linkedHashMap = new LinkedHashMap<K, V>($this$plus);
            LinkedHashMap<? extends K, ? extends V> $this$plus_u24lambda_u2412 = linkedHashMap;
            boolean bl = false;
            MapsKt.putAll((Map)$this$plus_u24lambda_u2412, pairs);
            map = linkedHashMap;
        }
        return map;
    }

    /*
     * WARNING - void declaration
     */
    public static final <K, V> V getOrElseNullable(@NotNull Map<K, ? extends V> $this$getOrElseNullable, K key, @NotNull Function0<? extends V> defaultValue) {
        void var4_4;
        Intrinsics.checkNotNullParameter($this$getOrElseNullable, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        boolean $i$f$getOrElseNullable = false;
        V value = $this$getOrElseNullable.get(key);
        if (value == null && !$this$getOrElseNullable.containsKey(key)) {
            return defaultValue.invoke();
        }
        return var4_4;
    }

    @NotNull
    public static final <K, V> Map<K, V> optimizeReadOnlyMap(@NotNull Map<K, ? extends V> $this$optimizeReadOnlyMap) {
        Map<K, Object> map;
        Intrinsics.checkNotNullParameter($this$optimizeReadOnlyMap, "<this>");
        switch ($this$optimizeReadOnlyMap.size()) {
            case 0: {
                map = MapsKt.emptyMap();
                break;
            }
            case 1: {
                map = MapsKt.toSingletonMap($this$optimizeReadOnlyMap);
                break;
            }
            default: {
                map = $this$optimizeReadOnlyMap;
            }
        }
        return map;
    }

    public static final <K, V> void putAll(@NotNull Map<? super K, ? super V> $this$putAll, @NotNull Sequence<? extends Pair<? extends K, ? extends V>> pairs) {
        Intrinsics.checkNotNullParameter($this$putAll, "<this>");
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        Iterator<Pair<K, V>> iterator2 = pairs.iterator();
        while (iterator2.hasNext()) {
            Pair<K, V> pair = iterator2.next();
            K key = pair.component1();
            V value = pair.component2();
            $this$putAll.put(key, value);
        }
    }

    @InlineOnly
    @JvmName(name="mutableIterator")
    private static final <K, V> Iterator<Map.Entry<K, V>> mutableIterator(Map<K, V> $this$iterator) {
        Intrinsics.checkNotNullParameter($this$iterator, "<this>");
        return $this$iterator.entrySet().iterator();
    }

    @InlineOnly
    private static final <K, V> Map<K, V> mapOf() {
        return MapsKt.emptyMap();
    }

    @InlineOnly
    private static final <K, V> boolean contains(Map<? extends K, ? extends V> $this$contains, K key) {
        Intrinsics.checkNotNullParameter($this$contains, "<this>");
        return $this$contains.containsKey(key);
    }

    /*
     * WARNING - void declaration
     */
    @NotNull
    public static final <K, V> Map<K, V> filter(@NotNull Map<? extends K, ? extends V> $this$filter, @NotNull Function1<? super Map.Entry<? extends K, ? extends V>, Boolean> predicate) {
        void var4_4;
        void $this$filterTo$iv;
        Intrinsics.checkNotNullParameter($this$filter, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        boolean $i$f$filter = false;
        Map<? extends K, ? extends V> map = $this$filter;
        Map destination$iv = new LinkedHashMap();
        boolean $i$f$filterTo = false;
        for (Map.Entry element$iv : $this$filterTo$iv.entrySet()) {
            if (!predicate.invoke(element$iv).booleanValue()) continue;
            destination$iv.put(element$iv.getKey(), element$iv.getValue());
        }
        return var4_4;
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M toMap(@NotNull Iterable<? extends Pair<? extends K, ? extends V>> $this$toMap, @NotNull M destination) {
        Intrinsics.checkNotNullParameter($this$toMap, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        M m = destination;
        M $this$toMap_u24lambda_u247 = m;
        boolean bl = false;
        MapsKt.putAll($this$toMap_u24lambda_u247, $this$toMap);
        return m;
    }

    @InlineOnly
    private static final <K, V> void plusAssign(Map<? super K, ? super V> $this$plusAssign, Pair<? extends K, ? extends V> pair) {
        Intrinsics.checkNotNullParameter($this$plusAssign, "<this>");
        Intrinsics.checkNotNullParameter(pair, "pair");
        $this$plusAssign.put(pair.getFirst(), pair.getSecond());
    }

    @InlineOnly
    private static final <K, V> Pair<K, V> toPair(Map.Entry<? extends K, ? extends V> $this$toPair) {
        Intrinsics.checkNotNullParameter($this$toPair, "<this>");
        return new Pair<K, V>($this$toPair.getKey(), $this$toPair.getValue());
    }

    @InlineOnly
    private static final <K, V> Iterator<Map.Entry<K, V>> iterator(Map<? extends K, ? extends V> $this$iterator) {
        Intrinsics.checkNotNullParameter($this$iterator, "<this>");
        return $this$iterator.entrySet().iterator();
    }

    @InlineOnly
    private static final <K, V> V get(Map<? extends K, ? extends V> $this$get, K key) {
        Intrinsics.checkNotNullParameter($this$get, "<this>");
        return $this$get.get(key);
    }

    @SinceKotlin(version="1.1")
    @InlineOnly
    private static final <K, V> void minusAssign(Map<K, V> $this$minusAssign, K[] keys2) {
        Intrinsics.checkNotNullParameter($this$minusAssign, "<this>");
        Intrinsics.checkNotNullParameter(keys2, "keys");
        CollectionsKt.removeAll((Collection)$this$minusAssign.keySet(), keys2);
    }

    @NotNull
    public static final <K, V> Map<K, V> plus(@NotNull Map<? extends K, ? extends V> $this$plus, @NotNull Sequence<? extends Pair<? extends K, ? extends V>> pairs) {
        Intrinsics.checkNotNullParameter($this$plus, "<this>");
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        LinkedHashMap<? extends K, ? extends V> linkedHashMap = new LinkedHashMap<K, V>($this$plus);
        LinkedHashMap<? extends K, ? extends V> $this$plus_u24lambda_u2414 = linkedHashMap;
        boolean bl = false;
        MapsKt.putAll((Map)$this$plus_u24lambda_u2414, pairs);
        return MapsKt.optimizeReadOnlyMap((Map)linkedHashMap);
    }

    /*
     * WARNING - void declaration
     */
    @NotNull
    public static final <K, V> Map<K, V> filterNot(@NotNull Map<? extends K, ? extends V> $this$filterNot, @NotNull Function1<? super Map.Entry<? extends K, ? extends V>, Boolean> predicate) {
        void var4_4;
        void $this$filterNotTo$iv;
        Intrinsics.checkNotNullParameter($this$filterNot, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        boolean $i$f$filterNot = false;
        Map<? extends K, ? extends V> map = $this$filterNot;
        Map destination$iv = new LinkedHashMap();
        boolean $i$f$filterNotTo = false;
        for (Map.Entry element$iv : $this$filterNotTo$iv.entrySet()) {
            if (predicate.invoke(element$iv).booleanValue()) continue;
            destination$iv.put(element$iv.getKey(), element$iv.getValue());
        }
        return var4_4;
    }

    @WasExperimental(markerClass={ExperimentalStdlibApi.class})
    @InlineOnly
    @SinceKotlin(version="1.6")
    private static final <K, V> Map<K, V> buildMap(int capacity, @BuilderInference Function1<? super Map<K, V>, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        Map map = MapsKt.createMapBuilder(capacity);
        builderAction.invoke(map);
        return MapsKt.build(map);
    }

    /*
     * WARNING - void declaration
     */
    @NotNull
    public static final <K, V, R> Map<K, R> mapValues(@NotNull Map<? extends K, ? extends V> $this$mapValues, @NotNull Function1<? super Map.Entry<? extends K, ? extends V>, ? extends R> transform) {
        void var4_4;
        void $this$mapValuesTo$iv;
        Intrinsics.checkNotNullParameter($this$mapValues, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        boolean $i$f$mapValues = false;
        Map<K, V> map = $this$mapValues;
        Map destination$iv = new LinkedHashMap(MapsKt.mapCapacity($this$mapValues.size()));
        boolean $i$f$mapValuesTo = false;
        Iterable $this$associateByTo$iv$iv = $this$mapValuesTo$iv.entrySet();
        boolean $i$f$associateByTo = false;
        for (Object element$iv$iv : $this$associateByTo$iv$iv) {
            Map.Entry it$iv = (Map.Entry)element$iv$iv;
            Map map2 = destination$iv;
            boolean bl = false;
            map2.put(it$iv.getKey(), transform.invoke((Map.Entry<K, V>)element$iv$iv));
        }
        return var4_4;
    }

    @WasExperimental(markerClass={ExperimentalStdlibApi.class})
    @InlineOnly
    @SinceKotlin(version="1.6")
    private static final <K, V> Map<K, V> buildMap(@BuilderInference Function1<? super Map<K, V>, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        Map map = MapsKt.createMapBuilder();
        builderAction.invoke(map);
        return MapsKt.build(map);
    }

    @NotNull
    public static final <K, V> Map<K, V> toMap(@NotNull Pair<? extends K, ? extends V>[] $this$toMap) {
        Map<Object, Object> map;
        Intrinsics.checkNotNullParameter($this$toMap, "<this>");
        switch ($this$toMap.length) {
            case 0: {
                map = MapsKt.emptyMap();
                break;
            }
            case 1: {
                map = MapsKt.mapOf($this$toMap[0]);
                break;
            }
            default: {
                map = MapsKt.toMap($this$toMap, (Map)new LinkedHashMap(MapsKt.mapCapacity($this$toMap.length)));
            }
        }
        return map;
    }

    @NotNull
    public static final <K, V> Map<K, V> mutableMapOf(Pair<? extends K, ? extends V> ... pairs) {
        LinkedHashMap linkedHashMap;
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        LinkedHashMap $this$mutableMapOf_u24lambda_u240 = linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(pairs.length));
        boolean bl = false;
        MapsKt.putAll((Map)$this$mutableMapOf_u24lambda_u240, pairs);
        return linkedHashMap;
    }

    @NotNull
    @SinceKotlin(version="1.1")
    public static final <K, V> Map<K, V> toMap(@NotNull Map<? extends K, ? extends V> $this$toMap) {
        Map<Object, Object> map;
        Intrinsics.checkNotNullParameter($this$toMap, "<this>");
        switch ($this$toMap.size()) {
            case 0: {
                map = MapsKt.emptyMap();
                break;
            }
            case 1: {
                map = MapsKt.toSingletonMap($this$toMap);
                break;
            }
            default: {
                map = MapsKt.toMutableMap($this$toMap);
            }
        }
        return map;
    }

    @NotNull
    public static final <K, V> Map<K, V> toMap(@NotNull Iterable<? extends Pair<? extends K, ? extends V>> $this$toMap) {
        Intrinsics.checkNotNullParameter($this$toMap, "<this>");
        if ($this$toMap instanceof Collection) {
            Map map;
            switch (((Collection)$this$toMap).size()) {
                case 0: {
                    map = MapsKt.emptyMap();
                    break;
                }
                case 1: {
                    map = MapsKt.mapOf($this$toMap instanceof List ? (Pair)((List)$this$toMap).get(0) : $this$toMap.iterator().next());
                    break;
                }
                default: {
                    map = MapsKt.toMap($this$toMap, (Map)new LinkedHashMap(MapsKt.mapCapacity(((Collection)$this$toMap).size())));
                }
            }
            return map;
        }
        return MapsKt.optimizeReadOnlyMap(MapsKt.toMap($this$toMap, (Map)new LinkedHashMap()));
    }

    @NotNull
    public static final <K, V> Map<K, V> plus(@NotNull Map<? extends K, ? extends V> $this$plus, @NotNull Pair<? extends K, ? extends V> pair) {
        Map map;
        Intrinsics.checkNotNullParameter($this$plus, "<this>");
        Intrinsics.checkNotNullParameter(pair, "pair");
        if ($this$plus.isEmpty()) {
            map = MapsKt.mapOf(pair);
        } else {
            LinkedHashMap<K, V> linkedHashMap = new LinkedHashMap<K, V>($this$plus);
            LinkedHashMap<K, V> $this$plus_u24lambda_u2411 = linkedHashMap;
            boolean bl = false;
            $this$plus_u24lambda_u2411.put(pair.getFirst(), pair.getSecond());
            map = linkedHashMap;
        }
        return map;
    }

    @InlineOnly
    private static final <K, V> void plusAssign(Map<? super K, ? super V> $this$plusAssign, Iterable<? extends Pair<? extends K, ? extends V>> pairs) {
        Intrinsics.checkNotNullParameter($this$plusAssign, "<this>");
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        MapsKt.putAll($this$plusAssign, pairs);
    }

    @SinceKotlin(version="1.3")
    @InlineOnly
    private static final <K, V> boolean isNullOrEmpty(Map<? extends K, ? extends V> $this$isNullOrEmpty) {
        return $this$isNullOrEmpty == null || $this$isNullOrEmpty.isEmpty();
    }

    @InlineOnly
    private static final <K, V> V remove(Map<? extends K, V> $this$remove, K key) {
        Intrinsics.checkNotNullParameter($this$remove, "<this>");
        return TypeIntrinsics.asMutableMap($this$remove).remove(key);
    }

    public static final <K, V> void putAll(@NotNull Map<? super K, ? super V> $this$putAll, @NotNull Iterable<? extends Pair<? extends K, ? extends V>> pairs) {
        Intrinsics.checkNotNullParameter($this$putAll, "<this>");
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        Iterator<Pair<K, V>> iterator2 = pairs.iterator();
        while (iterator2.hasNext()) {
            Pair<K, V> pair = iterator2.next();
            K key = pair.component1();
            V value = pair.component2();
            $this$putAll.put(key, value);
        }
    }

    @InlineOnly
    @SinceKotlin(version="1.1")
    private static final <K, V> void minusAssign(Map<K, V> $this$minusAssign, K key) {
        Intrinsics.checkNotNullParameter($this$minusAssign, "<this>");
        $this$minusAssign.remove(key);
    }

    @SinceKotlin(version="1.1")
    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M toMap(@NotNull Map<? extends K, ? extends V> $this$toMap, @NotNull M destination) {
        Intrinsics.checkNotNullParameter($this$toMap, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        M m = destination;
        M $this$toMap_u24lambda_u2410 = m;
        boolean bl = false;
        $this$toMap_u24lambda_u2410.putAll($this$toMap);
        return m;
    }

    @InlineOnly
    private static final <K, V> Map<K, V> orEmpty(Map<K, ? extends V> $this$orEmpty) {
        Map<K, Object> map = $this$orEmpty;
        if (map == null) {
            map = MapsKt.emptyMap();
        }
        return map;
    }

    /*
     * WARNING - void declaration
     */
    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M filterNotTo(@NotNull Map<? extends K, ? extends V> $this$filterNotTo, @NotNull M destination, @NotNull Function1<? super Map.Entry<? extends K, ? extends V>, Boolean> predicate) {
        void var1_1;
        Intrinsics.checkNotNullParameter($this$filterNotTo, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        boolean $i$f$filterNotTo = false;
        for (Map.Entry<K, V> element : $this$filterNotTo.entrySet()) {
            if (predicate.invoke(element).booleanValue()) continue;
            destination.put(element.getKey(), element.getValue());
        }
        return var1_1;
    }

    @InlineOnly
    private static final <K, V> void set(Map<K, V> $this$set, K key, V value) {
        Intrinsics.checkNotNullParameter($this$set, "<this>");
        $this$set.put(key, value);
    }

    @NotNull
    public static final <K, V> Map<K, V> filterValues(@NotNull Map<? extends K, ? extends V> $this$filterValues, @NotNull Function1<? super V, Boolean> predicate) {
        Intrinsics.checkNotNullParameter($this$filterValues, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        boolean $i$f$filterValues = false;
        LinkedHashMap<K, V> result = new LinkedHashMap<K, V>();
        for (Map.Entry<K, V> entry : $this$filterValues.entrySet()) {
            if (!predicate.invoke(entry.getValue()).booleanValue()) continue;
            result.put(entry.getKey(), entry.getValue());
        }
        return result;
    }

    @SinceKotlin(version="1.3")
    @InlineOnly
    private static final <M extends Map<?, ?> & R, R> R ifEmpty(M $this$ifEmpty, Function0<? extends R> defaultValue) {
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return (R)($this$ifEmpty.isEmpty() ? defaultValue.invoke() : $this$ifEmpty);
    }

    @InlineOnly
    private static final <K, V> V component2(Map.Entry<? extends K, ? extends V> $this$component2) {
        Intrinsics.checkNotNullParameter($this$component2, "<this>");
        return $this$component2.getValue();
    }

    @InlineOnly
    @SinceKotlin(version="1.1")
    private static final <K, V> Map<K, V> mutableMapOf() {
        return new LinkedHashMap();
    }

    @NotNull
    public static final <K, V> Map<K, V> plus(@NotNull Map<? extends K, ? extends V> $this$plus, @NotNull Map<? extends K, ? extends V> map) {
        Intrinsics.checkNotNullParameter($this$plus, "<this>");
        Intrinsics.checkNotNullParameter(map, "map");
        LinkedHashMap<? extends K, ? extends V> linkedHashMap = new LinkedHashMap<K, V>($this$plus);
        LinkedHashMap<? extends K, ? extends V> $this$plus_u24lambda_u2415 = linkedHashMap;
        boolean bl = false;
        $this$plus_u24lambda_u2415.putAll(map);
        return linkedHashMap;
    }

    @InlineOnly
    private static final <K, V> V getOrElse(Map<K, ? extends V> $this$getOrElse, K key, Function0<? extends V> defaultValue) {
        Intrinsics.checkNotNullParameter($this$getOrElse, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        V v = $this$getOrElse.get(key);
        if (v == null) {
            v = defaultValue.invoke();
        }
        return v;
    }

    @InlineOnly
    private static final <K, V> boolean containsValue(Map<K, ? extends V> $this$containsValue, V value) {
        Intrinsics.checkNotNullParameter($this$containsValue, "<this>");
        return $this$containsValue.containsValue(value);
    }

    @SinceKotlin(version="1.1")
    public static final <K, V> V getValue(@NotNull Map<K, ? extends V> $this$getValue, K key) {
        Intrinsics.checkNotNullParameter($this$getValue, "<this>");
        return MapsKt.getOrImplicitDefaultNullable($this$getValue, key);
    }

    @NotNull
    public static final <K, V> LinkedHashMap<K, V> linkedMapOf(Pair<? extends K, ? extends V> ... pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        return (LinkedHashMap)MapsKt.toMap(pairs, (Map)new LinkedHashMap(MapsKt.mapCapacity(pairs.length)));
    }

    @SinceKotlin(version="1.1")
    @InlineOnly
    private static final <K, V> HashMap<K, V> hashMapOf() {
        return new HashMap();
    }

    @InlineOnly
    @SinceKotlin(version="1.1")
    private static final <K, V> void minusAssign(Map<K, V> $this$minusAssign, Sequence<? extends K> keys2) {
        Intrinsics.checkNotNullParameter($this$minusAssign, "<this>");
        Intrinsics.checkNotNullParameter(keys2, "keys");
        CollectionsKt.removeAll((Collection)$this$minusAssign.keySet(), keys2);
    }

    @NotNull
    public static final <K, V> HashMap<K, V> hashMapOf(Pair<? extends K, ? extends V> ... pairs) {
        HashMap hashMap;
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        HashMap $this$hashMapOf_u24lambda_u241 = hashMap = new HashMap(MapsKt.mapCapacity(pairs.length));
        boolean bl = false;
        MapsKt.putAll((Map)$this$hashMapOf_u24lambda_u241, pairs);
        return hashMap;
    }

    @InlineOnly
    @SinceKotlin(version="1.1")
    private static final <K, V> LinkedHashMap<K, V> linkedMapOf() {
        return new LinkedHashMap();
    }

    @InlineOnly
    private static final <K, V> void plusAssign(Map<? super K, ? super V> $this$plusAssign, Map<K, ? extends V> map) {
        Intrinsics.checkNotNullParameter($this$plusAssign, "<this>");
        Intrinsics.checkNotNullParameter(map, "map");
        $this$plusAssign.putAll(map);
    }

    @InlineOnly
    private static final <K, V> boolean isNotEmpty(Map<? extends K, ? extends V> $this$isNotEmpty) {
        Intrinsics.checkNotNullParameter($this$isNotEmpty, "<this>");
        return !$this$isNotEmpty.isEmpty();
    }

    @NotNull
    public static final <K, V> Map<K, V> filterKeys(@NotNull Map<? extends K, ? extends V> $this$filterKeys, @NotNull Function1<? super K, Boolean> predicate) {
        Intrinsics.checkNotNullParameter($this$filterKeys, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        boolean $i$f$filterKeys = false;
        LinkedHashMap<K, V> result = new LinkedHashMap<K, V>();
        for (Map.Entry<K, V> entry : $this$filterKeys.entrySet()) {
            if (!predicate.invoke(entry.getKey()).booleanValue()) continue;
            result.put(entry.getKey(), entry.getValue());
        }
        return result;
    }

    @SinceKotlin(version="1.1")
    @NotNull
    public static final <K, V> Map<K, V> minus(@NotNull Map<? extends K, ? extends V> $this$minus, K key) {
        Intrinsics.checkNotNullParameter($this$minus, "<this>");
        Map<K, V> map = MapsKt.toMutableMap($this$minus);
        Map<K, V> $this$minus_u24lambda_u2416 = map;
        boolean bl = false;
        $this$minus_u24lambda_u2416.remove(key);
        return MapsKt.optimizeReadOnlyMap(map);
    }

    @NotNull
    @SinceKotlin(version="1.1")
    public static final <K, V> Map<K, V> minus(@NotNull Map<? extends K, ? extends V> $this$minus, @NotNull K[] keys2) {
        Intrinsics.checkNotNullParameter($this$minus, "<this>");
        Intrinsics.checkNotNullParameter(keys2, "keys");
        Map<K, V> map = MapsKt.toMutableMap($this$minus);
        Map<K, V> $this$minus_u24lambda_u2418 = map;
        boolean bl = false;
        CollectionsKt.removeAll((Collection)$this$minus_u24lambda_u2418.keySet(), keys2);
        return MapsKt.optimizeReadOnlyMap(map);
    }

    @NotNull
    @SinceKotlin(version="1.1")
    public static final <K, V> Map<K, V> minus(@NotNull Map<? extends K, ? extends V> $this$minus, @NotNull Iterable<? extends K> keys2) {
        Intrinsics.checkNotNullParameter($this$minus, "<this>");
        Intrinsics.checkNotNullParameter(keys2, "keys");
        Map<K, V> map = MapsKt.toMutableMap($this$minus);
        Map<K, V> $this$minus_u24lambda_u2417 = map;
        boolean bl = false;
        CollectionsKt.removeAll((Collection)$this$minus_u24lambda_u2417.keySet(), keys2);
        return MapsKt.optimizeReadOnlyMap(map);
    }

    @SinceKotlin(version="1.1")
    @NotNull
    public static final <K, V> Map<K, V> toMutableMap(@NotNull Map<? extends K, ? extends V> $this$toMutableMap) {
        Intrinsics.checkNotNullParameter($this$toMutableMap, "<this>");
        return new LinkedHashMap<K, V>($this$toMutableMap);
    }

    @NotNull
    public static final <K, V> Map<K, V> toMap(@NotNull Sequence<? extends Pair<? extends K, ? extends V>> $this$toMap) {
        Intrinsics.checkNotNullParameter($this$toMap, "<this>");
        return MapsKt.optimizeReadOnlyMap(MapsKt.toMap($this$toMap, (Map)new LinkedHashMap()));
    }

    @InlineOnly
    private static final <K, V> K component1(Map.Entry<? extends K, ? extends V> $this$component1) {
        Intrinsics.checkNotNullParameter($this$component1, "<this>");
        return $this$component1.getKey();
    }

    @NotNull
    public static final <K, V> Map<K, V> mapOf(Pair<? extends K, ? extends V> ... pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        return pairs.length > 0 ? MapsKt.toMap(pairs, (Map)new LinkedHashMap(MapsKt.mapCapacity(pairs.length))) : MapsKt.emptyMap();
    }

    @SinceKotlin(version="1.1")
    @InlineOnly
    private static final <K, V> void minusAssign(Map<K, V> $this$minusAssign, Iterable<? extends K> keys2) {
        Intrinsics.checkNotNullParameter($this$minusAssign, "<this>");
        Intrinsics.checkNotNullParameter(keys2, "keys");
        CollectionsKt.removeAll((Collection)$this$minusAssign.keySet(), keys2);
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M toMap(@NotNull Sequence<? extends Pair<? extends K, ? extends V>> $this$toMap, @NotNull M destination) {
        Intrinsics.checkNotNullParameter($this$toMap, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        M m = destination;
        M $this$toMap_u24lambda_u249 = m;
        boolean bl = false;
        MapsKt.putAll($this$toMap_u24lambda_u249, $this$toMap);
        return m;
    }

    /*
     * WARNING - void declaration
     */
    @NotNull
    public static final <K, V, R> Map<R, V> mapKeys(@NotNull Map<? extends K, ? extends V> $this$mapKeys, @NotNull Function1<? super Map.Entry<? extends K, ? extends V>, ? extends R> transform) {
        void var4_4;
        void $this$mapKeysTo$iv;
        Intrinsics.checkNotNullParameter($this$mapKeys, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        boolean $i$f$mapKeys = false;
        Map<K, V> map = $this$mapKeys;
        Map destination$iv = new LinkedHashMap(MapsKt.mapCapacity($this$mapKeys.size()));
        boolean $i$f$mapKeysTo = false;
        Iterable $this$associateByTo$iv$iv = $this$mapKeysTo$iv.entrySet();
        boolean $i$f$associateByTo = false;
        for (Object element$iv$iv : $this$associateByTo$iv$iv) {
            Map.Entry it$iv = (Map.Entry)element$iv$iv;
            R r = transform.invoke((Map.Entry<K, V>)element$iv$iv);
            Map map2 = destination$iv;
            boolean bl = false;
            Object v = it$iv.getValue();
            map2.put(r, v);
        }
        return var4_4;
    }

    @NotNull
    public static final <K, V> Map<K, V> emptyMap() {
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        Intrinsics.checkNotNull(emptyMap, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return emptyMap;
    }

    @InlineOnly
    private static final <K, V> void plusAssign(Map<? super K, ? super V> $this$plusAssign, Sequence<? extends Pair<? extends K, ? extends V>> pairs) {
        Intrinsics.checkNotNullParameter($this$plusAssign, "<this>");
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        MapsKt.putAll($this$plusAssign, pairs);
    }

    @InlineOnly
    private static final <K, V> void plusAssign(Map<? super K, ? super V> $this$plusAssign, Pair<? extends K, ? extends V>[] pairs) {
        Intrinsics.checkNotNullParameter($this$plusAssign, "<this>");
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        MapsKt.putAll($this$plusAssign, pairs);
    }

    @NotNull
    public static final <K, V> Map<K, V> plus(@NotNull Map<? extends K, ? extends V> $this$plus, @NotNull Pair<? extends K, ? extends V>[] pairs) {
        Map map;
        Intrinsics.checkNotNullParameter($this$plus, "<this>");
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        if ($this$plus.isEmpty()) {
            map = MapsKt.toMap(pairs);
        } else {
            LinkedHashMap<? extends K, ? extends V> linkedHashMap = new LinkedHashMap<K, V>($this$plus);
            LinkedHashMap<? extends K, ? extends V> $this$plus_u24lambda_u2413 = linkedHashMap;
            boolean bl = false;
            MapsKt.putAll((Map)$this$plus_u24lambda_u2413, pairs);
            map = linkedHashMap;
        }
        return map;
    }

    @InlineOnly
    private static final <K> boolean containsKey(Map<? extends K, ?> $this$containsKey, K key) {
        Intrinsics.checkNotNullParameter($this$containsKey, "<this>");
        return $this$containsKey.containsKey(key);
    }

    /*
     * WARNING - void declaration
     */
    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M filterTo(@NotNull Map<? extends K, ? extends V> $this$filterTo, @NotNull M destination, @NotNull Function1<? super Map.Entry<? extends K, ? extends V>, Boolean> predicate) {
        void var1_1;
        Intrinsics.checkNotNullParameter($this$filterTo, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        boolean $i$f$filterTo = false;
        for (Map.Entry<K, V> element : $this$filterTo.entrySet()) {
            if (!predicate.invoke(element).booleanValue()) continue;
            destination.put(element.getKey(), element.getValue());
        }
        return var1_1;
    }

    /*
     * WARNING - void declaration
     */
    @NotNull
    public static final <K, V, R, M extends Map<? super R, ? super V>> M mapKeysTo(@NotNull Map<? extends K, ? extends V> $this$mapKeysTo, @NotNull M destination, @NotNull Function1<? super Map.Entry<? extends K, ? extends V>, ? extends R> transform) {
        void var1_1;
        Intrinsics.checkNotNullParameter($this$mapKeysTo, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        boolean $i$f$mapKeysTo = false;
        Iterable $this$associateByTo$iv = $this$mapKeysTo.entrySet();
        boolean $i$f$associateByTo = false;
        for (Object element$iv : $this$associateByTo$iv) {
            Map.Entry it = (Map.Entry)element$iv;
            R r = transform.invoke((Map.Entry<K, V>)element$iv);
            M m = destination;
            boolean bl = false;
            Object v = it.getValue();
            m.put(r, v);
        }
        return var1_1;
    }

    /*
     * WARNING - void declaration
     */
    @NotNull
    public static final <K, V, R, M extends Map<? super K, ? super R>> M mapValuesTo(@NotNull Map<? extends K, ? extends V> $this$mapValuesTo, @NotNull M destination, @NotNull Function1<? super Map.Entry<? extends K, ? extends V>, ? extends R> transform) {
        void var1_1;
        Intrinsics.checkNotNullParameter($this$mapValuesTo, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        boolean $i$f$mapValuesTo = false;
        Iterable $this$associateByTo$iv = $this$mapValuesTo.entrySet();
        boolean $i$f$associateByTo = false;
        for (Object element$iv : $this$associateByTo$iv) {
            Map.Entry it = (Map.Entry)element$iv;
            M m = destination;
            boolean bl = false;
            m.put(it.getKey(), transform.invoke((Map.Entry<K, V>)element$iv));
        }
        return var1_1;
    }

    @SinceKotlin(version="1.1")
    @NotNull
    public static final <K, V> Map<K, V> minus(@NotNull Map<? extends K, ? extends V> $this$minus, @NotNull Sequence<? extends K> keys2) {
        Intrinsics.checkNotNullParameter($this$minus, "<this>");
        Intrinsics.checkNotNullParameter(keys2, "keys");
        Map<K, V> map = MapsKt.toMutableMap($this$minus);
        Map<K, V> $this$minus_u24lambda_u2419 = map;
        boolean bl = false;
        CollectionsKt.removeAll((Collection)$this$minus_u24lambda_u2419.keySet(), keys2);
        return MapsKt.optimizeReadOnlyMap(map);
    }
}

