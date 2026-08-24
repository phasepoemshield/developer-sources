/*
 * Decompiled with CFR 0.152.
 */
package kotlin.text;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Deprecated;
import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.OverloadResolutionByLambdaReturnType;
import kotlin.Pair;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import kotlin.TuplesKt;
import kotlin.WasExperimental;
import kotlin.collections.ArraysKt;
import kotlin.collections.CharIterator;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgression;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlin.text.CharsKt;
import kotlin.text.DelimitedRangesSequence;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=5, xi=49, d1={"\u0000\u0084\u0001\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0019\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\bB\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u00a2\u0006\u0004\b\u0003\u0010\u0004\u001a#\u0010\n\u001a\u00020\t*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007\u00a2\u0006\u0004\b\n\u0010\u000b\u001a#\u0010\f\u001a\u00020\t*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007\u00a2\u0006\u0004\b\f\u0010\u000b\u001a&\u0010\u000f\u001a\u00020\u0007*\u00020\u00052\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0086\u0002\u00a2\u0006\u0004\b\u000f\u0010\u0010\u001a&\u0010\u000f\u001a\u00020\u0007*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0086\u0002\u00a2\u0006\u0004\b\u000f\u0010\u0011\u001a\u001c\u0010\u000f\u001a\u00020\u0007*\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0012H\u0087\n\u00a2\u0006\u0004\b\u000f\u0010\u0014\u001a\u001f\u0010\u0015\u001a\u00020\u0007*\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0000\u00a2\u0006\u0004\b\u0015\u0010\u0016\u001a\u001f\u0010\u0017\u001a\u00020\u0007*\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0000\u00a2\u0006\u0004\b\u0017\u0010\u0016\u001a#\u0010\u0018\u001a\u00020\u0007*\u00020\u00052\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\b\u001a\u00020\u0007\u00a2\u0006\u0004\b\u0018\u0010\u0010\u001a#\u0010\u0018\u001a\u00020\u0007*\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007\u00a2\u0006\u0004\b\u0018\u0010\u0011\u001aA\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\t\u0018\u00010\u001d*\u00020\u00052\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\t0\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u0007\u00a2\u0006\u0004\b\u001e\u0010\u001f\u001aG\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\t\u0018\u00010\u001d*\u00020\u00052\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\t0\u001a2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\b!\u0010\"\u001aA\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\t\u0018\u00010\u001d*\u00020\u00052\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\t0\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u0007\u00a2\u0006\u0004\b#\u0010\u001f\u001a\u0019\u0010%\u001a\u00020\u0007*\u00020\u00052\u0006\u0010$\u001a\u00020\u0000\u00a2\u0006\u0004\b%\u0010&\u001a9\u0010+\u001a\u00028\u0001\"\f\b\u0000\u0010'*\u00020\u0005*\u00028\u0001\"\u0004\b\u0001\u0010(*\u00028\u00002\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00010)H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b+\u0010,\u001a9\u0010-\u001a\u00028\u0001\"\f\b\u0000\u0010'*\u00020\u0005*\u00028\u0001\"\u0004\b\u0001\u0010(*\u00028\u00002\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00010)H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b-\u0010,\u001a-\u0010.\u001a\u00020\u0000*\u00020\u00052\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u0007\u00a2\u0006\u0004\b.\u0010/\u001a=\u0010.\u001a\u00020\u0000*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u00100\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010 \u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\b1\u00102\u001a-\u0010.\u001a\u00020\u0000*\u00020\u00052\u0006\u00103\u001a\u00020\t2\b\b\u0002\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u0007\u00a2\u0006\u0004\b.\u00104\u001a-\u00107\u001a\u00020\u0000*\u00020\u00052\u0006\u00106\u001a\u0002052\b\b\u0002\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u0007\u00a2\u0006\u0004\b7\u00108\u001a3\u00107\u001a\u00020\u0000*\u00020\u00052\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\t0\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u0007\u00a2\u0006\u0004\b7\u00109\u001a\u0014\u0010:\u001a\u00020\u0007*\u00020\u0005H\u0087\b\u00a2\u0006\u0004\b:\u0010;\u001a\u0014\u0010<\u001a\u00020\u0007*\u00020\u0005H\u0087\b\u00a2\u0006\u0004\b<\u0010;\u001a\u0014\u0010=\u001a\u00020\u0007*\u00020\u0005H\u0087\b\u00a2\u0006\u0004\b=\u0010;\u001a'\u0010>\u001a\u00020\u0007*\u0004\u0018\u00010\u0005H\u0087\b\u0082\u0002\u000e\n\f\b\u0000\u0012\u0002\u0018\u0001\u001a\u0004\b\u0003\u0010\u0000\u00a2\u0006\u0004\b>\u0010;\u001a'\u0010?\u001a\u00020\u0007*\u0004\u0018\u00010\u0005H\u0087\b\u0082\u0002\u000e\n\f\b\u0000\u0012\u0002\u0018\u0001\u001a\u0004\b\u0003\u0010\u0000\u00a2\u0006\u0004\b?\u0010;\u001a\u0014\u0010A\u001a\u00020@*\u00020\u0005H\u0086\u0002\u00a2\u0006\u0004\bA\u0010B\u001a-\u0010C\u001a\u00020\u0000*\u00020\u00052\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u0007\u00a2\u0006\u0004\bC\u0010/\u001a-\u0010C\u001a\u00020\u0000*\u00020\u00052\u0006\u00103\u001a\u00020\t2\b\b\u0002\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u0007\u00a2\u0006\u0004\bC\u00104\u001a-\u0010D\u001a\u00020\u0000*\u00020\u00052\u0006\u00106\u001a\u0002052\b\b\u0002\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u0007\u00a2\u0006\u0004\bD\u00108\u001a3\u0010D\u001a\u00020\u0000*\u00020\u00052\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\t0\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u0007\u00a2\u0006\u0004\bD\u00109\u001a\u0017\u0010F\u001a\b\u0012\u0004\u0012\u00020\t0E*\u00020\u0005\u00a2\u0006\u0004\bF\u0010G\u001a\u0017\u0010I\u001a\b\u0012\u0004\u0012\u00020\t0H*\u00020\u0005\u00a2\u0006\u0004\bI\u0010J\u001a\u001c\u0010K\u001a\u00020\u0007*\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0012H\u0087\f\u00a2\u0006\u0004\bK\u0010\u0014\u001a\u0016\u0010L\u001a\u00020\t*\u0004\u0018\u00010\tH\u0087\b\u00a2\u0006\u0004\bL\u0010M\u001a#\u0010P\u001a\u00020\u0005*\u00020\u00052\u0006\u0010N\u001a\u00020\u00002\b\b\u0002\u0010O\u001a\u00020\r\u00a2\u0006\u0004\bP\u0010Q\u001a#\u0010P\u001a\u00020\t*\u00020\t2\u0006\u0010N\u001a\u00020\u00002\b\b\u0002\u0010O\u001a\u00020\r\u00a2\u0006\u0004\bP\u0010R\u001a#\u0010S\u001a\u00020\u0005*\u00020\u00052\u0006\u0010N\u001a\u00020\u00002\b\b\u0002\u0010O\u001a\u00020\r\u00a2\u0006\u0004\bS\u0010Q\u001a#\u0010S\u001a\u00020\t*\u00020\t2\u0006\u0010N\u001a\u00020\u00002\b\b\u0002\u0010O\u001a\u00020\r\u00a2\u0006\u0004\bS\u0010R\u001aG\u0010Y\u001a\b\u0012\u0004\u0012\u00020V0E*\u00020\u00052\u000e\u0010U\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0T2\b\b\u0002\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0002\u00a2\u0006\u0004\bW\u0010X\u001a?\u0010Y\u001a\b\u0012\u0004\u0012\u00020V0E*\u00020\u00052\u0006\u0010U\u001a\u0002052\b\b\u0002\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0002\u00a2\u0006\u0004\bW\u0010Z\u001a;\u0010]\u001a\u00020\u0007*\u00020\u00052\u0006\u0010[\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\\\u001a\u00020\u00002\u0006\u0010N\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0000\u00a2\u0006\u0004\b]\u0010^\u001a\u0019\u0010`\u001a\u00020\u0005*\u00020\u00052\u0006\u0010_\u001a\u00020\u0005\u00a2\u0006\u0004\b`\u0010a\u001a\u0019\u0010`\u001a\u00020\t*\u00020\t2\u0006\u0010_\u001a\u00020\u0005\u00a2\u0006\u0004\b`\u0010b\u001a!\u0010c\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u00100\u001a\u00020\u0000\u00a2\u0006\u0004\bc\u0010d\u001a\u0019\u0010c\u001a\u00020\u0005*\u00020\u00052\u0006\u0010e\u001a\u00020V\u00a2\u0006\u0004\bc\u0010f\u001a$\u0010c\u001a\u00020\t*\u00020\t2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u00100\u001a\u00020\u0000H\u0087\b\u00a2\u0006\u0004\bc\u0010g\u001a\u001c\u0010c\u001a\u00020\t*\u00020\t2\u0006\u0010e\u001a\u00020VH\u0087\b\u00a2\u0006\u0004\bc\u0010h\u001a\u0019\u0010i\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0005\u00a2\u0006\u0004\bi\u0010a\u001a\u0019\u0010i\u001a\u00020\t*\u00020\t2\u0006\u0010\u0019\u001a\u00020\u0005\u00a2\u0006\u0004\bi\u0010b\u001a\u0019\u0010k\u001a\u00020\u0005*\u00020\u00052\u0006\u0010j\u001a\u00020\u0005\u00a2\u0006\u0004\bk\u0010a\u001a!\u0010k\u001a\u00020\u0005*\u00020\u00052\u0006\u0010_\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0005\u00a2\u0006\u0004\bk\u0010l\u001a\u0019\u0010k\u001a\u00020\t*\u00020\t2\u0006\u0010j\u001a\u00020\u0005\u00a2\u0006\u0004\bk\u0010b\u001a!\u0010k\u001a\u00020\t*\u00020\t2\u0006\u0010_\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0005\u00a2\u0006\u0004\bk\u0010m\u001a5\u0010q\u001a\u00020\t*\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00122\u0014\b\b\u0010p\u001a\u000e\u0012\u0004\u0012\u00020o\u0012\u0004\u0012\u00020\u00050nH\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\bq\u0010r\u001a$\u0010q\u001a\u00020\t*\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010s\u001a\u00020\tH\u0087\b\u00a2\u0006\u0004\bq\u0010t\u001a+\u0010v\u001a\u00020\t*\u00020\t2\u0006\u0010j\u001a\u00020\r2\u0006\u0010s\u001a\u00020\t2\b\b\u0002\u0010u\u001a\u00020\t\u00a2\u0006\u0004\bv\u0010w\u001a+\u0010v\u001a\u00020\t*\u00020\t2\u0006\u0010j\u001a\u00020\t2\u0006\u0010s\u001a\u00020\t2\b\b\u0002\u0010u\u001a\u00020\t\u00a2\u0006\u0004\bv\u0010x\u001a+\u0010y\u001a\u00020\t*\u00020\t2\u0006\u0010j\u001a\u00020\r2\u0006\u0010s\u001a\u00020\t2\b\b\u0002\u0010u\u001a\u00020\t\u00a2\u0006\u0004\by\u0010w\u001a+\u0010y\u001a\u00020\t*\u00020\t2\u0006\u0010j\u001a\u00020\t2\u0006\u0010s\u001a\u00020\t2\b\b\u0002\u0010u\u001a\u00020\t\u00a2\u0006\u0004\by\u0010x\u001a+\u0010z\u001a\u00020\t*\u00020\t2\u0006\u0010j\u001a\u00020\r2\u0006\u0010s\u001a\u00020\t2\b\b\u0002\u0010u\u001a\u00020\t\u00a2\u0006\u0004\bz\u0010w\u001a+\u0010z\u001a\u00020\t*\u00020\t2\u0006\u0010j\u001a\u00020\t2\u0006\u0010s\u001a\u00020\t2\b\b\u0002\u0010u\u001a\u00020\t\u00a2\u0006\u0004\bz\u0010x\u001a+\u0010{\u001a\u00020\t*\u00020\t2\u0006\u0010j\u001a\u00020\r2\u0006\u0010s\u001a\u00020\t2\b\b\u0002\u0010u\u001a\u00020\t\u00a2\u0006\u0004\b{\u0010w\u001a+\u0010{\u001a\u00020\t*\u00020\t2\u0006\u0010j\u001a\u00020\t2\u0006\u0010s\u001a\u00020\t2\b\b\u0002\u0010u\u001a\u00020\t\u00a2\u0006\u0004\b{\u0010x\u001a$\u0010|\u001a\u00020\t*\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010s\u001a\u00020\tH\u0087\b\u00a2\u0006\u0004\b|\u0010t\u001a+\u0010\u007f\u001a\u00020\t*\u00020\t2\u0012\u0010p\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0nH\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b}\u0010~\u001a,\u0010\u007f\u001a\u00020\t*\u00020\t2\u0012\u0010p\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050nH\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0005\b\u0080\u0001\u0010~\u001a,\u0010\u0081\u0001\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u00100\u001a\u00020\u00002\u0006\u0010s\u001a\u00020\u0005\u00a2\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001\u001a$\u0010\u0081\u0001\u001a\u00020\u0005*\u00020\u00052\u0006\u0010e\u001a\u00020V2\u0006\u0010s\u001a\u00020\u0005\u00a2\u0006\u0006\b\u0081\u0001\u0010\u0083\u0001\u001a/\u0010\u0081\u0001\u001a\u00020\t*\u00020\t2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u00100\u001a\u00020\u00002\u0006\u0010s\u001a\u00020\u0005H\u0087\b\u00a2\u0006\u0006\b\u0081\u0001\u0010\u0084\u0001\u001a'\u0010\u0081\u0001\u001a\u00020\t*\u00020\t2\u0006\u0010e\u001a\u00020V2\u0006\u0010s\u001a\u00020\u0005H\u0087\b\u00a2\u0006\u0006\b\u0081\u0001\u0010\u0085\u0001\u001aB\u0010\u0086\u0001\u001a\b\u0012\u0004\u0012\u00020\t0H*\u00020\u00052\u0012\u0010U\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0T\"\u00020\t2\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0001\u001a\u00020\u0000\u00a2\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001\u001a:\u0010\u0086\u0001\u001a\b\u0012\u0004\u0012\u00020\t0H*\u00020\u00052\n\u0010U\u001a\u000205\"\u00020\r2\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0001\u001a\u00020\u0000\u00a2\u0006\u0006\b\u0086\u0001\u0010\u0088\u0001\u001a4\u0010\u0086\u0001\u001a\b\u0012\u0004\u0012\u00020\t0H*\u00020\u00052\u0006\u0010j\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u0000H\u0002\u00a2\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001\u001a/\u0010\u0086\u0001\u001a\b\u0012\u0004\u0012\u00020\t0H*\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0087\b\u00a2\u0006\u0006\b\u0086\u0001\u0010\u008b\u0001\u001aB\u0010\u008c\u0001\u001a\b\u0012\u0004\u0012\u00020\t0E*\u00020\u00052\u0012\u0010U\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0T\"\u00020\t2\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0001\u001a\u00020\u0000\u00a2\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001\u001a:\u0010\u008c\u0001\u001a\b\u0012\u0004\u0012\u00020\t0E*\u00020\u00052\n\u0010U\u001a\u000205\"\u00020\r2\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0001\u001a\u00020\u0000\u00a2\u0006\u0006\b\u008c\u0001\u0010\u008e\u0001\u001a/\u0010\u008c\u0001\u001a\b\u0012\u0004\u0012\u00020\t0E*\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0087\b\u00a2\u0006\u0006\b\u008c\u0001\u0010\u008f\u0001\u001a%\u0010\u0090\u0001\u001a\u00020\u0007*\u00020\u00052\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\b\u001a\u00020\u0007\u00a2\u0006\u0005\b\u0090\u0001\u0010\u0010\u001a%\u0010\u0090\u0001\u001a\u00020\u0007*\u00020\u00052\u0006\u0010_\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007\u00a2\u0006\u0005\b\u0090\u0001\u0010\u0011\u001a.\u0010\u0090\u0001\u001a\u00020\u0007*\u00020\u00052\u0006\u0010_\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u0007\u00a2\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001\u001a\u001b\u0010\u0092\u0001\u001a\u00020\u0005*\u00020\u00052\u0006\u0010e\u001a\u00020V\u00a2\u0006\u0005\b\u0092\u0001\u0010f\u001a)\u0010\u0092\u0001\u001a\u00020\u0005*\u00020\t2\u0007\u0010\u0093\u0001\u001a\u00020\u00002\u0007\u0010\u0094\u0001\u001a\u00020\u0000H\u0087\b\u00a2\u0006\u0006\b\u0092\u0001\u0010\u0095\u0001\u001a)\u0010\u0096\u0001\u001a\u00020\t*\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u00100\u001a\u00020\u0000H\u0087\b\u00a2\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001\u001a\u001c\u0010\u0096\u0001\u001a\u00020\t*\u00020\u00052\u0006\u0010e\u001a\u00020V\u00a2\u0006\u0006\b\u0096\u0001\u0010\u0098\u0001\u001a\u001b\u0010\u0096\u0001\u001a\u00020\t*\u00020\t2\u0006\u0010e\u001a\u00020V\u00a2\u0006\u0005\b\u0096\u0001\u0010h\u001a&\u0010\u0099\u0001\u001a\u00020\t*\u00020\t2\u0006\u0010j\u001a\u00020\r2\b\b\u0002\u0010u\u001a\u00020\t\u00a2\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001\u001a&\u0010\u0099\u0001\u001a\u00020\t*\u00020\t2\u0006\u0010j\u001a\u00020\t2\b\b\u0002\u0010u\u001a\u00020\t\u00a2\u0006\u0006\b\u0099\u0001\u0010\u009b\u0001\u001a&\u0010\u009c\u0001\u001a\u00020\t*\u00020\t2\u0006\u0010j\u001a\u00020\r2\b\b\u0002\u0010u\u001a\u00020\t\u00a2\u0006\u0006\b\u009c\u0001\u0010\u009a\u0001\u001a&\u0010\u009c\u0001\u001a\u00020\t*\u00020\t2\u0006\u0010j\u001a\u00020\t2\b\b\u0002\u0010u\u001a\u00020\t\u00a2\u0006\u0006\b\u009c\u0001\u0010\u009b\u0001\u001a&\u0010\u009d\u0001\u001a\u00020\t*\u00020\t2\u0006\u0010j\u001a\u00020\r2\b\b\u0002\u0010u\u001a\u00020\t\u00a2\u0006\u0006\b\u009d\u0001\u0010\u009a\u0001\u001a&\u0010\u009d\u0001\u001a\u00020\t*\u00020\t2\u0006\u0010j\u001a\u00020\t2\b\b\u0002\u0010u\u001a\u00020\t\u00a2\u0006\u0006\b\u009d\u0001\u0010\u009b\u0001\u001a&\u0010\u009e\u0001\u001a\u00020\t*\u00020\t2\u0006\u0010j\u001a\u00020\r2\b\b\u0002\u0010u\u001a\u00020\t\u00a2\u0006\u0006\b\u009e\u0001\u0010\u009a\u0001\u001a&\u0010\u009e\u0001\u001a\u00020\t*\u00020\t2\u0006\u0010j\u001a\u00020\t2\b\b\u0002\u0010u\u001a\u00020\t\u00a2\u0006\u0006\b\u009e\u0001\u0010\u009b\u0001\u001a\u0016\u0010\u009f\u0001\u001a\u00020\u0007*\u00020\tH\u0007\u00a2\u0006\u0006\b\u009f\u0001\u0010\u00a0\u0001\u001a\u0018\u0010\u00a1\u0001\u001a\u0004\u0018\u00010\u0007*\u00020\tH\u0007\u00a2\u0006\u0006\b\u00a1\u0001\u0010\u00a2\u0001\u001a\u0014\u0010\u00a3\u0001\u001a\u00020\u0005*\u00020\u0005\u00a2\u0006\u0006\b\u00a3\u0001\u0010\u00a4\u0001\u001a/\u0010\u00a3\u0001\u001a\u00020\u0005*\u00020\u00052\u0013\u0010\u00a5\u0001\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00070nH\u0086\b\u00f8\u0001\u0000\u00a2\u0006\u0006\b\u00a3\u0001\u0010\u00a6\u0001\u001a \u0010\u00a3\u0001\u001a\u00020\u0005*\u00020\u00052\n\u00106\u001a\u000205\"\u00020\r\u00a2\u0006\u0006\b\u00a3\u0001\u0010\u00a7\u0001\u001a\u0016\u0010\u00a3\u0001\u001a\u00020\t*\u00020\tH\u0087\b\u00a2\u0006\u0005\b\u00a3\u0001\u0010M\u001a.\u0010\u00a3\u0001\u001a\u00020\t*\u00020\t2\u0013\u0010\u00a5\u0001\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00070nH\u0086\b\u00f8\u0001\u0000\u00a2\u0006\u0005\b\u00a3\u0001\u0010~\u001a \u0010\u00a3\u0001\u001a\u00020\t*\u00020\t2\n\u00106\u001a\u000205\"\u00020\r\u00a2\u0006\u0006\b\u00a3\u0001\u0010\u00a8\u0001\u001a\u0014\u0010\u00a9\u0001\u001a\u00020\u0005*\u00020\u0005\u00a2\u0006\u0006\b\u00a9\u0001\u0010\u00a4\u0001\u001a/\u0010\u00a9\u0001\u001a\u00020\u0005*\u00020\u00052\u0013\u0010\u00a5\u0001\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00070nH\u0086\b\u00f8\u0001\u0000\u00a2\u0006\u0006\b\u00a9\u0001\u0010\u00a6\u0001\u001a \u0010\u00a9\u0001\u001a\u00020\u0005*\u00020\u00052\n\u00106\u001a\u000205\"\u00020\r\u00a2\u0006\u0006\b\u00a9\u0001\u0010\u00a7\u0001\u001a\u0016\u0010\u00a9\u0001\u001a\u00020\t*\u00020\tH\u0087\b\u00a2\u0006\u0005\b\u00a9\u0001\u0010M\u001a.\u0010\u00a9\u0001\u001a\u00020\t*\u00020\t2\u0013\u0010\u00a5\u0001\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00070nH\u0086\b\u00f8\u0001\u0000\u00a2\u0006\u0005\b\u00a9\u0001\u0010~\u001a \u0010\u00a9\u0001\u001a\u00020\t*\u00020\t2\n\u00106\u001a\u000205\"\u00020\r\u00a2\u0006\u0006\b\u00a9\u0001\u0010\u00a8\u0001\u001a\u0014\u0010\u00aa\u0001\u001a\u00020\u0005*\u00020\u0005\u00a2\u0006\u0006\b\u00aa\u0001\u0010\u00a4\u0001\u001a/\u0010\u00aa\u0001\u001a\u00020\u0005*\u00020\u00052\u0013\u0010\u00a5\u0001\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00070nH\u0086\b\u00f8\u0001\u0000\u00a2\u0006\u0006\b\u00aa\u0001\u0010\u00a6\u0001\u001a \u0010\u00aa\u0001\u001a\u00020\u0005*\u00020\u00052\n\u00106\u001a\u000205\"\u00020\r\u00a2\u0006\u0006\b\u00aa\u0001\u0010\u00a7\u0001\u001a\u0016\u0010\u00aa\u0001\u001a\u00020\t*\u00020\tH\u0087\b\u00a2\u0006\u0005\b\u00aa\u0001\u0010M\u001a.\u0010\u00aa\u0001\u001a\u00020\t*\u00020\t2\u0013\u0010\u00a5\u0001\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00070nH\u0086\b\u00f8\u0001\u0000\u00a2\u0006\u0005\b\u00aa\u0001\u0010~\u001a \u0010\u00aa\u0001\u001a\u00020\t*\u00020\t2\n\u00106\u001a\u000205\"\u00020\r\u00a2\u0006\u0006\b\u00aa\u0001\u0010\u00a8\u0001\"\u0018\u0010\u00ad\u0001\u001a\u00020V*\u00020\u00058F\u00a2\u0006\b\u001a\u0006\b\u00ab\u0001\u0010\u00ac\u0001\"\u0018\u0010\u00b0\u0001\u001a\u00020\u0000*\u00020\u00058F\u00a2\u0006\b\u001a\u0006\b\u00ae\u0001\u0010\u00af\u0001\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006\u00b1\u0001"}, d2={"", "limit", "", "requireNonNegativeLimit", "(I)V", "", "other", "", "ignoreCase", "", "commonPrefixWith", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Ljava/lang/String;", "commonSuffixWith", "", "char", "contains", "(Ljava/lang/CharSequence;CZ)Z", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z", "Lkotlin/text/Regex;", "regex", "(Ljava/lang/CharSequence;Lkotlin/text/Regex;)Z", "contentEqualsIgnoreCaseImpl", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z", "contentEqualsImpl", "endsWith", "suffix", "", "strings", "startIndex", "Lkotlin/Pair;", "findAnyOf", "(Ljava/lang/CharSequence;Ljava/util/Collection;IZ)Lkotlin/Pair;", "last", "findAnyOf$StringsKt__StringsKt", "(Ljava/lang/CharSequence;Ljava/util/Collection;IZZ)Lkotlin/Pair;", "findLastAnyOf", "index", "hasSurrogatePairAt", "(Ljava/lang/CharSequence;I)Z", "C", "R", "Lkotlin/Function0;", "defaultValue", "ifBlank", "(Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "ifEmpty", "indexOf", "(Ljava/lang/CharSequence;CIZ)I", "endIndex", "indexOf$StringsKt__StringsKt", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;IIZZ)I", "string", "(Ljava/lang/CharSequence;Ljava/lang/String;IZ)I", "", "chars", "indexOfAny", "(Ljava/lang/CharSequence;[CIZ)I", "(Ljava/lang/CharSequence;Ljava/util/Collection;IZ)I", "isEmpty", "(Ljava/lang/CharSequence;)Z", "isNotBlank", "isNotEmpty", "isNullOrBlank", "isNullOrEmpty", "Lkotlin/collections/CharIterator;", "iterator", "(Ljava/lang/CharSequence;)Lkotlin/collections/CharIterator;", "lastIndexOf", "lastIndexOfAny", "Lkotlin/sequences/Sequence;", "lineSequence", "(Ljava/lang/CharSequence;)Lkotlin/sequences/Sequence;", "", "lines", "(Ljava/lang/CharSequence;)Ljava/util/List;", "matches", "orEmpty", "(Ljava/lang/String;)Ljava/lang/String;", "length", "padChar", "padEnd", "(Ljava/lang/CharSequence;IC)Ljava/lang/CharSequence;", "(Ljava/lang/String;IC)Ljava/lang/String;", "padStart", "", "delimiters", "Lkotlin/ranges/IntRange;", "rangesDelimitedBy$StringsKt__StringsKt", "(Ljava/lang/CharSequence;[Ljava/lang/String;IZI)Lkotlin/sequences/Sequence;", "rangesDelimitedBy", "(Ljava/lang/CharSequence;[CIZI)Lkotlin/sequences/Sequence;", "thisOffset", "otherOffset", "regionMatchesImpl", "(Ljava/lang/CharSequence;ILjava/lang/CharSequence;IIZ)Z", "prefix", "removePrefix", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/CharSequence;", "(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;", "removeRange", "(Ljava/lang/CharSequence;II)Ljava/lang/CharSequence;", "range", "(Ljava/lang/CharSequence;Lkotlin/ranges/IntRange;)Ljava/lang/CharSequence;", "(Ljava/lang/String;II)Ljava/lang/String;", "(Ljava/lang/String;Lkotlin/ranges/IntRange;)Ljava/lang/String;", "removeSuffix", "delimiter", "removeSurrounding", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/CharSequence;", "(Ljava/lang/String;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;", "Lkotlin/Function1;", "Lkotlin/text/MatchResult;", "transform", "replace", "(Ljava/lang/CharSequence;Lkotlin/text/Regex;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;", "replacement", "(Ljava/lang/CharSequence;Lkotlin/text/Regex;Ljava/lang/String;)Ljava/lang/String;", "missingDelimiterValue", "replaceAfter", "(Ljava/lang/String;CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replaceAfterLast", "replaceBefore", "replaceBeforeLast", "replaceFirst", "replaceFirstCharWithChar", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;", "replaceFirstChar", "replaceFirstCharWithCharSequence", "replaceRange", "(Ljava/lang/CharSequence;IILjava/lang/CharSequence;)Ljava/lang/CharSequence;", "(Ljava/lang/CharSequence;Lkotlin/ranges/IntRange;Ljava/lang/CharSequence;)Ljava/lang/CharSequence;", "(Ljava/lang/String;IILjava/lang/CharSequence;)Ljava/lang/String;", "(Ljava/lang/String;Lkotlin/ranges/IntRange;Ljava/lang/CharSequence;)Ljava/lang/String;", "split", "(Ljava/lang/CharSequence;[Ljava/lang/String;ZI)Ljava/util/List;", "(Ljava/lang/CharSequence;[CZI)Ljava/util/List;", "split$StringsKt__StringsKt", "(Ljava/lang/CharSequence;Ljava/lang/String;ZI)Ljava/util/List;", "(Ljava/lang/CharSequence;Lkotlin/text/Regex;I)Ljava/util/List;", "splitToSequence", "(Ljava/lang/CharSequence;[Ljava/lang/String;ZI)Lkotlin/sequences/Sequence;", "(Ljava/lang/CharSequence;[CZI)Lkotlin/sequences/Sequence;", "(Ljava/lang/CharSequence;Lkotlin/text/Regex;I)Lkotlin/sequences/Sequence;", "startsWith", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;IZ)Z", "subSequence", "start", "end", "(Ljava/lang/String;II)Ljava/lang/CharSequence;", "substring", "(Ljava/lang/CharSequence;II)Ljava/lang/String;", "(Ljava/lang/CharSequence;Lkotlin/ranges/IntRange;)Ljava/lang/String;", "substringAfter", "(Ljava/lang/String;CLjava/lang/String;)Ljava/lang/String;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "substringAfterLast", "substringBefore", "substringBeforeLast", "toBooleanStrict", "(Ljava/lang/String;)Z", "toBooleanStrictOrNull", "(Ljava/lang/String;)Ljava/lang/Boolean;", "trim", "(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;", "predicate", "(Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/CharSequence;", "(Ljava/lang/CharSequence;[C)Ljava/lang/CharSequence;", "(Ljava/lang/String;[C)Ljava/lang/String;", "trimEnd", "trimStart", "getIndices", "(Ljava/lang/CharSequence;)Lkotlin/ranges/IntRange;", "indices", "getLastIndex", "(Ljava/lang/CharSequence;)I", "lastIndex", "kotlin-stdlib"}, xs="kotlin/text/StringsKt")
class StringsKt__StringsKt
extends StringsKt__StringsJVMKt {
    /*
     * WARNING - void declaration
     */
    public static final int indexOfAny(@NotNull CharSequence $this$indexOfAny, @NotNull char[] chars, int startIndex, boolean ignoreCase) {
        Intrinsics.checkNotNullParameter($this$indexOfAny, "<this>");
        Intrinsics.checkNotNullParameter(chars, "chars");
        if (!ignoreCase) {
            if (chars.length == 1 && $this$indexOfAny instanceof String) {
                char c = ArraysKt.single(chars);
                return ((String)$this$indexOfAny).indexOf(c, startIndex);
            }
        }
        IntIterator intIterator = new IntRange(RangesKt.coerceAtLeast(startIndex, 0), StringsKt.getLastIndex($this$indexOfAny)).iterator();
        while (intIterator.hasNext()) {
            void var5_6;
            boolean bl;
            block4: {
                int index = intIterator.nextInt();
                char charAtIndex = $this$indexOfAny.charAt(index);
                char[] $this$any$iv = chars;
                boolean $i$f$any = false;
                int n = $this$any$iv.length;
                for (int i = 0; i < n; ++i) {
                    void var12_13;
                    char element$iv;
                    char it = element$iv = $this$any$iv[i];
                    boolean bl2 = false;
                    if (!CharsKt.equals((char)var12_13, charAtIndex, ignoreCase)) continue;
                    bl = true;
                    break block4;
                }
                bl = false;
            }
            if (!bl) continue;
            return (int)var5_6;
        }
        return -1;
    }

    @SinceKotlin(version="1.5")
    @Nullable
    public static final Boolean toBooleanStrictOrNull(@NotNull String $this$toBooleanStrictOrNull) {
        Intrinsics.checkNotNullParameter($this$toBooleanStrictOrNull, "<this>");
        String string = $this$toBooleanStrictOrNull;
        return Intrinsics.areEqual(string, "true") ? Boolean.valueOf(true) : (Intrinsics.areEqual(string, "false") ? Boolean.valueOf(false) : null);
    }

    @InlineOnly
    private static final String orEmpty(String $this$orEmpty) {
        String string = $this$orEmpty;
        if (string == null) {
            string = "";
        }
        return string;
    }

    /*
     * WARNING - void declaration
     */
    @NotNull
    public static final CharSequence padEnd(@NotNull CharSequence $this$padEnd, int length, char padChar) {
        void var3_3;
        Intrinsics.checkNotNullParameter($this$padEnd, "<this>");
        if (length < 0) {
            throw new IllegalArgumentException("Desired length " + length + " is less than zero.");
        }
        if (length <= $this$padEnd.length()) {
            return $this$padEnd.subSequence(0, $this$padEnd.length());
        }
        StringBuilder sb = new StringBuilder(length);
        sb.append($this$padEnd);
        IntIterator intIterator = new IntRange(1, length - $this$padEnd.length()).iterator();
        while (intIterator.hasNext()) {
            int i = intIterator.nextInt();
            sb.append(padChar);
        }
        return (CharSequence)var3_3;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public static final int lastIndexOf(@NotNull CharSequence $this$lastIndexOf, @NotNull String string, int startIndex, boolean ignoreCase) {
        int n;
        Intrinsics.checkNotNullParameter($this$lastIndexOf, "<this>");
        Intrinsics.checkNotNullParameter(string, "string");
        if (!ignoreCase && $this$lastIndexOf instanceof String) {
            void var2_2;
            void var1_1;
            n = ((String)$this$lastIndexOf).lastIndexOf((String)var1_1, (int)var2_2);
            return n;
        }
        n = StringsKt__StringsKt.indexOf$StringsKt__StringsKt($this$lastIndexOf, string, startIndex, 0, ignoreCase, true);
        return n;
    }

    public static /* synthetic */ String replaceAfter$default(String string, String string2, String string3, String string4, int n, Object object) {
        if ((n & 4) != 0) {
            string4 = string;
        }
        return StringsKt.replaceAfter(string, string2, string3, string4);
    }

    public static /* synthetic */ String substringAfterLast$default(String string, char c, String string2, int n, Object object) {
        if ((n & 2) != 0) {
            string2 = string;
        }
        return StringsKt.substringAfterLast(string, c, string2);
    }

    public static /* synthetic */ boolean endsWith$default(CharSequence charSequence, char c, boolean bl, int n, Object object) {
        if ((n & 2) != 0) {
            bl = false;
        }
        return StringsKt.endsWith(charSequence, c, bl);
    }

    @NotNull
    public static final String commonPrefixWith(@NotNull CharSequence $this$commonPrefixWith, @NotNull CharSequence other, boolean ignoreCase) {
        int i;
        block4: {
            block3: {
                Intrinsics.checkNotNullParameter($this$commonPrefixWith, "<this>");
                Intrinsics.checkNotNullParameter(other, "other");
                int shortestLength = Math.min($this$commonPrefixWith.length(), other.length());
                for (i = 0; i < shortestLength; ++i) {
                    if (!CharsKt.equals($this$commonPrefixWith.charAt(i), other.charAt(i), ignoreCase)) break;
                }
                if (StringsKt.hasSurrogatePairAt($this$commonPrefixWith, i - 1)) break block3;
                if (!StringsKt.hasSurrogatePairAt(other, i - 1)) break block4;
            }
            --i;
        }
        return ((Object)$this$commonPrefixWith.subSequence(0, i)).toString();
    }

    /*
     * WARNING - void declaration
     */
    public static final boolean startsWith(@NotNull CharSequence $this$startsWith, @NotNull CharSequence prefix, boolean ignoreCase) {
        void var2_2;
        Intrinsics.checkNotNullParameter($this$startsWith, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        if (!ignoreCase && $this$startsWith instanceof String && prefix instanceof String) {
            return StringsKt.startsWith$default((String)$this$startsWith, (String)prefix, false, 2, null);
        }
        return StringsKt.regionMatchesImpl($this$startsWith, 0, prefix, 0, prefix.length(), (boolean)var2_2);
    }

    @InlineOnly
    private static final String replaceFirst(CharSequence $this$replaceFirst, Regex regex, String replacement) {
        Intrinsics.checkNotNullParameter($this$replaceFirst, "<this>");
        Intrinsics.checkNotNullParameter(regex, "regex");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        return regex.replaceFirst($this$replaceFirst, replacement);
    }

    @InlineOnly
    private static final String removeRange(String $this$removeRange, int startIndex, int endIndex) {
        Intrinsics.checkNotNullParameter($this$removeRange, "<this>");
        return ((Object)StringsKt.removeRange((CharSequence)$this$removeRange, startIndex, endIndex)).toString();
    }

    public static final boolean contains(@NotNull CharSequence $this$contains, @NotNull CharSequence other, boolean ignoreCase) {
        Intrinsics.checkNotNullParameter($this$contains, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return other instanceof String ? StringsKt.indexOf$default($this$contains, (String)other, 0, ignoreCase, 2, null) >= 0 : StringsKt__StringsKt.indexOf$StringsKt__StringsKt$default($this$contains, other, 0, $this$contains.length(), ignoreCase, false, 16, null) >= 0;
    }

    @NotNull
    public static final String substringBefore(@NotNull String $this$substringBefore, char delimiter, @NotNull String missingDelimiterValue) {
        String string;
        Intrinsics.checkNotNullParameter($this$substringBefore, "<this>");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int index = StringsKt.indexOf$default((CharSequence)$this$substringBefore, delimiter, 0, false, 6, null);
        if (index == -1) {
            string = missingDelimiterValue;
        } else {
            String string2 = $this$substringBefore;
            int n = 0;
            String string3 = string2.substring(n, index);
            string = string3;
            Intrinsics.checkNotNullExpressionValue(string3, "substring(...)");
        }
        return string;
    }

    /*
     * WARNING - void declaration
     */
    @NotNull
    public static final CharSequence trimStart(@NotNull CharSequence $this$trimStart, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter($this$trimStart, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        boolean $i$f$trimStart = false;
        int index = 0;
        int n = $this$trimStart.length();
        while (index < n) {
            void var3_3;
            if (!predicate.invoke(Character.valueOf($this$trimStart.charAt(index))).booleanValue()) {
                return $this$trimStart.subSequence(index, $this$trimStart.length());
            }
            ++var3_3;
        }
        return "";
    }

    @NotNull
    public static final String substringAfterLast(@NotNull String $this$substringAfterLast, char delimiter, @NotNull String missingDelimiterValue) {
        String string;
        Intrinsics.checkNotNullParameter($this$substringAfterLast, "<this>");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int index = StringsKt.lastIndexOf$default((CharSequence)$this$substringAfterLast, delimiter, 0, false, 6, null);
        if (index == -1) {
            string = missingDelimiterValue;
        } else {
            String string2 = $this$substringAfterLast;
            int n = index + 1;
            int n2 = $this$substringAfterLast.length();
            String string3 = string2.substring(n, n2);
            string = string3;
            Intrinsics.checkNotNullExpressionValue(string3, "substring(...)");
        }
        return string;
    }

    public static /* synthetic */ String substringAfter$default(String string, char c, String string2, int n, Object object) {
        if ((n & 2) != 0) {
            string2 = string;
        }
        return StringsKt.substringAfter(string, c, string2);
    }

    /*
     * WARNING - void declaration
     */
    @NotNull
    public static final CharSequence trimStart(@NotNull CharSequence $this$trimStart, char ... chars) {
        CharSequence charSequence;
        block2: {
            Intrinsics.checkNotNullParameter($this$trimStart, "<this>");
            Intrinsics.checkNotNullParameter(chars, "chars");
            CharSequence $this$trimStart$iv = $this$trimStart;
            boolean $i$f$trimStart = false;
            int index$iv = 0;
            int n = $this$trimStart$iv.length();
            while (index$iv < n) {
                void var4_4;
                void var6_6;
                char it = $this$trimStart$iv.charAt(index$iv);
                boolean bl = false;
                if (!ArraysKt.contains(chars, (char)var6_6)) {
                    charSequence = $this$trimStart$iv.subSequence(index$iv, $this$trimStart$iv.length());
                    break block2;
                }
                ++var4_4;
            }
            charSequence = "";
        }
        return charSequence;
    }

    public static /* synthetic */ String replaceAfter$default(String string, char c, String string2, String string3, int n, Object object) {
        if ((n & 4) != 0) {
            string3 = string;
        }
        return StringsKt.replaceAfter(string, c, string2, string3);
    }

    /*
     * WARNING - void declaration
     */
    @NotNull
    public static final CharSequence removeRange(@NotNull CharSequence $this$removeRange, int startIndex, int endIndex) {
        void var3_3;
        Intrinsics.checkNotNullParameter($this$removeRange, "<this>");
        if (endIndex < startIndex) {
            throw new IndexOutOfBoundsException("End index (" + endIndex + ") is less than start index (" + startIndex + ").");
        }
        if (endIndex == startIndex) {
            return $this$removeRange.subSequence(0, $this$removeRange.length());
        }
        StringBuilder sb = new StringBuilder($this$removeRange.length() - (endIndex - startIndex));
        Intrinsics.checkNotNullExpressionValue(sb.append($this$removeRange, 0, startIndex), "append(...)");
        Intrinsics.checkNotNullExpressionValue(sb.append($this$removeRange, endIndex, $this$removeRange.length()), "append(...)");
        return (CharSequence)var3_3;
    }

    @NotNull
    public static final String removeSuffix(@NotNull String $this$removeSuffix, @NotNull CharSequence suffix) {
        String string;
        Intrinsics.checkNotNullParameter($this$removeSuffix, "<this>");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        if (StringsKt.endsWith$default((CharSequence)$this$removeSuffix, suffix, false, 2, null)) {
            String string2 = $this$removeSuffix;
            int n = 0;
            int n2 = $this$removeSuffix.length() - suffix.length();
            String string3 = string2.substring(n, n2);
            Intrinsics.checkNotNullExpressionValue(string3, "substring(...)");
            return string3;
        }
        return string;
    }

    public static final int getLastIndex(@NotNull CharSequence $this$lastIndex) {
        Intrinsics.checkNotNullParameter($this$lastIndex, "<this>");
        return $this$lastIndex.length() - 1;
    }

    @InlineOnly
    private static final boolean isNullOrBlank(CharSequence $this$isNullOrBlank) {
        return $this$isNullOrBlank == null || StringsKt.isBlank($this$isNullOrBlank);
    }

    /*
     * WARNING - void declaration
     */
    @NotNull
    public static final CharSequence trimEnd(@NotNull CharSequence $this$trimEnd) {
        CharSequence charSequence;
        block2: {
            Intrinsics.checkNotNullParameter($this$trimEnd, "<this>");
            CharSequence $this$trimEnd$iv = $this$trimEnd;
            boolean $i$f$trimEnd = false;
            int n = $this$trimEnd$iv.length() + -1;
            if (0 <= n) {
                do {
                    void var5_5;
                    int index$iv = n--;
                    char p0 = $this$trimEnd$iv.charAt(index$iv);
                    boolean bl = false;
                    if (CharsKt.isWhitespace((char)var5_5)) continue;
                    charSequence = $this$trimEnd$iv.subSequence(0, index$iv + 1);
                    break block2;
                } while (0 <= n);
            }
            charSequence = "";
        }
        return charSequence;
    }

    @NotNull
    public static final CharSequence trimEnd(@NotNull CharSequence $this$trimEnd, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter($this$trimEnd, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        boolean $i$f$trimEnd = false;
        int n = $this$trimEnd.length() + -1;
        if (0 <= n) {
            do {
                int index;
                if (predicate.invoke(Character.valueOf($this$trimEnd.charAt(index = n--))).booleanValue()) continue;
                return $this$trimEnd.subSequence(0, index + 1);
            } while (0 <= n);
        }
        return "";
    }

    @NotNull
    public static final String substringBefore(@NotNull String $this$substringBefore, @NotNull String delimiter, @NotNull String missingDelimiterValue) {
        String string;
        Intrinsics.checkNotNullParameter($this$substringBefore, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int index = StringsKt.indexOf$default((CharSequence)$this$substringBefore, delimiter, 0, false, 6, null);
        if (index == -1) {
            string = missingDelimiterValue;
        } else {
            String string2 = $this$substringBefore;
            int n = 0;
            String string3 = string2.substring(n, index);
            string = string3;
            Intrinsics.checkNotNullExpressionValue(string3, "substring(...)");
        }
        return string;
    }

    public static /* synthetic */ int indexOfAny$default(CharSequence charSequence, char[] cArray, int n, boolean bl, int n2, Object object) {
        if ((n2 & 2) != 0) {
            n = 0;
        }
        if ((n2 & 4) != 0) {
            bl = false;
        }
        return StringsKt.indexOfAny(charSequence, cArray, n, bl);
    }

    public static /* synthetic */ String commonSuffixWith$default(CharSequence charSequence, CharSequence charSequence2, boolean bl, int n, Object object) {
        if ((n & 2) != 0) {
            bl = false;
        }
        return StringsKt.commonSuffixWith(charSequence, charSequence2, bl);
    }

    /*
     * WARNING - void declaration
     */
    public static final boolean contentEqualsImpl(@Nullable CharSequence $this$contentEqualsImpl, @Nullable CharSequence other) {
        block8: {
            block7: {
                if ($this$contentEqualsImpl instanceof String && other instanceof String) {
                    return Intrinsics.areEqual($this$contentEqualsImpl, other);
                }
                if ($this$contentEqualsImpl == other) {
                    return true;
                }
                if ($this$contentEqualsImpl == null || other == null) break block7;
                if ($this$contentEqualsImpl.length() == other.length()) break block8;
            }
            return false;
        }
        int i = 0;
        int n = $this$contentEqualsImpl.length();
        while (i < n) {
            void var2_2;
            if ($this$contentEqualsImpl.charAt(i) != other.charAt(i)) {
                return false;
            }
            ++var2_2;
        }
        return true;
    }

    public static /* synthetic */ String substringBefore$default(String string, String string2, String string3, int n, Object object) {
        if ((n & 2) != 0) {
            string3 = string;
        }
        return StringsKt.substringBefore(string, string2, string3);
    }

    @NotNull
    public static final String substringAfter(@NotNull String $this$substringAfter, char delimiter, @NotNull String missingDelimiterValue) {
        String string;
        Intrinsics.checkNotNullParameter($this$substringAfter, "<this>");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int index = StringsKt.indexOf$default((CharSequence)$this$substringAfter, delimiter, 0, false, 6, null);
        if (index == -1) {
            string = missingDelimiterValue;
        } else {
            String string2 = $this$substringAfter;
            int n = index + 1;
            int n2 = $this$substringAfter.length();
            String string3 = string2.substring(n, n2);
            string = string3;
            Intrinsics.checkNotNullExpressionValue(string3, "substring(...)");
        }
        return string;
    }

    /*
     * WARNING - void declaration
     */
    public static final boolean endsWith(@NotNull CharSequence $this$endsWith, @NotNull CharSequence suffix, boolean ignoreCase) {
        void var2_2;
        Intrinsics.checkNotNullParameter($this$endsWith, "<this>");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        if (!ignoreCase && $this$endsWith instanceof String && suffix instanceof String) {
            return StringsKt.endsWith$default((String)$this$endsWith, (String)suffix, false, 2, null);
        }
        return StringsKt.regionMatchesImpl($this$endsWith, $this$endsWith.length() - suffix.length(), suffix, 0, suffix.length(), (boolean)var2_2);
    }

    @InlineOnly
    private static final String trim(String $this$trim) {
        Intrinsics.checkNotNullParameter($this$trim, "<this>");
        return ((Object)StringsKt.trim((CharSequence)$this$trim)).toString();
    }

    @Deprecated(message="Use parameters named startIndex and endIndex.", replaceWith=@ReplaceWith(expression="subSequence(startIndex = start, endIndex = end)", imports={}))
    @InlineOnly
    private static final CharSequence subSequence(String $this$subSequence, int start, int end) {
        Intrinsics.checkNotNullParameter($this$subSequence, "<this>");
        return $this$subSequence.subSequence(start, end);
    }

    @InlineOnly
    private static final String substring(CharSequence $this$substring, int startIndex, int endIndex) {
        Intrinsics.checkNotNullParameter($this$substring, "<this>");
        return ((Object)$this$substring.subSequence(startIndex, endIndex)).toString();
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public static final int indexOf(@NotNull CharSequence $this$indexOf, char c, int startIndex, boolean ignoreCase) {
        int n;
        Intrinsics.checkNotNullParameter($this$indexOf, "<this>");
        if (!ignoreCase && $this$indexOf instanceof String) {
            void var2_2;
            void var1_1;
            n = ((String)$this$indexOf).indexOf((int)var1_1, (int)var2_2);
            return n;
        }
        char[] cArray = new char[1];
        cArray[0] = c;
        n = StringsKt.indexOfAny($this$indexOf, cArray, startIndex, ignoreCase);
        return n;
    }

    @InlineOnly
    @SinceKotlin(version="1.3")
    private static final <C extends CharSequence & R, R> R ifEmpty(C $this$ifEmpty, Function0<? extends R> defaultValue) {
        C c;
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return (R)($this$ifEmpty.length() == 0 ? defaultValue.invoke() : c);
    }

    public static final int indexOfAny(@NotNull CharSequence $this$indexOfAny, @NotNull Collection<String> strings, int startIndex, boolean ignoreCase) {
        Intrinsics.checkNotNullParameter($this$indexOfAny, "<this>");
        Intrinsics.checkNotNullParameter(strings, "strings");
        Pair<Integer, String> pair = StringsKt__StringsKt.findAnyOf$StringsKt__StringsKt($this$indexOfAny, strings, startIndex, ignoreCase, false);
        return pair != null ? ((Number)pair.getFirst()).intValue() : -1;
    }

    public static /* synthetic */ String replaceBefore$default(String string, String string2, String string3, String string4, int n, Object object) {
        if ((n & 4) != 0) {
            string4 = string;
        }
        return StringsKt.replaceBefore(string, string2, string3, string4);
    }

    public static /* synthetic */ CharSequence padEnd$default(CharSequence charSequence, int n, char c, int n2, Object object) {
        if ((n2 & 2) != 0) {
            c = (char)32;
        }
        return StringsKt.padEnd(charSequence, n, c);
    }

    /*
     * WARNING - void declaration
     */
    @NotNull
    public static final List<String> split(@NotNull CharSequence $this$split, @NotNull String[] delimiters, boolean ignoreCase, int limit) {
        void var7_7;
        void $this$mapTo$iv$iv;
        Intrinsics.checkNotNullParameter($this$split, "<this>");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        if (delimiters.length == 1) {
            String delimiter = delimiters[0];
            if (!(((CharSequence)delimiter).length() == 0)) {
                return StringsKt__StringsKt.split$StringsKt__StringsKt($this$split, delimiter, ignoreCase, limit);
            }
        }
        Iterable $this$map$iv = SequencesKt.asIterable(StringsKt__StringsKt.rangesDelimitedBy$StringsKt__StringsKt$default($this$split, delimiters, 0, ignoreCase, limit, 2, null));
        boolean $i$f$map = false;
        Iterable iterable = $this$map$iv;
        Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        boolean $i$f$mapTo = false;
        for (Object item$iv$iv : $this$mapTo$iv$iv) {
            IntRange intRange = (IntRange)item$iv$iv;
            Collection collection = destination$iv$iv;
            boolean bl = false;
            collection.add(StringsKt.substring($this$split, intRange));
        }
        return (List)var7_7;
    }

    @InlineOnly
    private static final boolean isNotBlank(CharSequence $this$isNotBlank) {
        Intrinsics.checkNotNullParameter($this$isNotBlank, "<this>");
        return !StringsKt.isBlank($this$isNotBlank);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final boolean startsWith(@NotNull CharSequence $this$startsWith, char c, boolean ignoreCase) {
        Intrinsics.checkNotNullParameter($this$startsWith, "<this>");
        if ($this$startsWith.length() <= 0) return false;
        if (!CharsKt.equals($this$startsWith.charAt(0), c, ignoreCase)) return false;
        return true;
    }

    @NotNull
    public static final String substringBeforeLast(@NotNull String $this$substringBeforeLast, char delimiter, @NotNull String missingDelimiterValue) {
        String string;
        Intrinsics.checkNotNullParameter($this$substringBeforeLast, "<this>");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int index = StringsKt.lastIndexOf$default((CharSequence)$this$substringBeforeLast, delimiter, 0, false, 6, null);
        if (index == -1) {
            string = missingDelimiterValue;
        } else {
            String string2 = $this$substringBeforeLast;
            int n = 0;
            String string3 = string2.substring(n, index);
            string = string3;
            Intrinsics.checkNotNullExpressionValue(string3, "substring(...)");
        }
        return string;
    }

    /*
     * WARNING - void declaration
     */
    private static final List<String> split$StringsKt__StringsKt(CharSequence $this$split, String delimiter, boolean ignoreCase, int limit) {
        void var7_7;
        int nextIndex;
        int currentOffset;
        block6: {
            block5: {
                StringsKt.requireNonNegativeLimit(limit);
                currentOffset = 0;
                nextIndex = StringsKt.indexOf($this$split, delimiter, currentOffset, ignoreCase);
                if (nextIndex == -1) break block5;
                if (limit != 1) break block6;
            }
            return CollectionsKt.listOf(((Object)$this$split).toString());
        }
        boolean isLimited = limit > 0;
        ArrayList<String> result = new ArrayList<String>(isLimited ? RangesKt.coerceAtMost(limit, 10) : 10);
        do {
            result.add(((Object)$this$split.subSequence(currentOffset, nextIndex)).toString());
            currentOffset = nextIndex + delimiter.length();
            if (isLimited) {
                if (result.size() == limit + -1) break;
            }
            nextIndex = StringsKt.indexOf($this$split, delimiter, currentOffset, ignoreCase);
        } while (nextIndex != -1);
        result.add(((Object)$this$split.subSequence(currentOffset, $this$split.length())).toString());
        return (List)var7_7;
    }

    public static /* synthetic */ int indexOfAny$default(CharSequence charSequence, Collection collection, int n, boolean bl, int n2, Object object) {
        if ((n2 & 2) != 0) {
            n = 0;
        }
        if ((n2 & 4) != 0) {
            bl = false;
        }
        return StringsKt.indexOfAny(charSequence, collection, n, bl);
    }

    @NotNull
    public static final String trimEnd(@NotNull String $this$trimEnd, @NotNull Function1<? super Character, Boolean> predicate) {
        CharSequence charSequence;
        block2: {
            Intrinsics.checkNotNullParameter($this$trimEnd, "<this>");
            Intrinsics.checkNotNullParameter(predicate, "predicate");
            boolean $i$f$trimEnd = false;
            CharSequence $this$trimEnd$iv = $this$trimEnd;
            boolean $i$f$trimEnd2 = false;
            int n = $this$trimEnd$iv.length() + -1;
            if (0 <= n) {
                do {
                    int index$iv = n--;
                    if (predicate.invoke(Character.valueOf($this$trimEnd$iv.charAt(index$iv))).booleanValue()) continue;
                    charSequence = $this$trimEnd$iv.subSequence(0, index$iv + 1);
                    break block2;
                } while (0 <= n);
            }
            charSequence = "";
        }
        return ((Object)charSequence).toString();
    }

    public static final boolean contains(@NotNull CharSequence $this$contains, char c, boolean ignoreCase) {
        Intrinsics.checkNotNullParameter($this$contains, "<this>");
        return StringsKt.indexOf$default($this$contains, c, 0, ignoreCase, 2, null) >= 0;
    }

    static /* synthetic */ List split$default(CharSequence $this$split_u24default, Regex regex, int limit, int n, Object object) {
        if ((n & 2) != 0) {
            limit = 0;
        }
        Intrinsics.checkNotNullParameter($this$split_u24default, "<this>");
        Intrinsics.checkNotNullParameter(regex, "regex");
        return regex.split($this$split_u24default, limit);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public static final int indexOf(@NotNull CharSequence $this$indexOf, @NotNull String string, int startIndex, boolean ignoreCase) {
        int n;
        Intrinsics.checkNotNullParameter($this$indexOf, "<this>");
        Intrinsics.checkNotNullParameter(string, "string");
        if (!ignoreCase && $this$indexOf instanceof String) {
            void var2_2;
            void var1_1;
            n = ((String)$this$indexOf).indexOf((String)var1_1, (int)var2_2);
            return n;
        }
        n = StringsKt__StringsKt.indexOf$StringsKt__StringsKt$default($this$indexOf, string, startIndex, $this$indexOf.length(), ignoreCase, false, 16, null);
        return n;
    }

    public static /* synthetic */ String substringBeforeLast$default(String string, char c, String string2, int n, Object object) {
        if ((n & 2) != 0) {
            string2 = string;
        }
        return StringsKt.substringBeforeLast(string, c, string2);
    }

    public static /* synthetic */ boolean endsWith$default(CharSequence charSequence, CharSequence charSequence2, boolean bl, int n, Object object) {
        if ((n & 2) != 0) {
            bl = false;
        }
        return StringsKt.endsWith(charSequence, charSequence2, bl);
    }

    public static /* synthetic */ boolean startsWith$default(CharSequence charSequence, CharSequence charSequence2, boolean bl, int n, Object object) {
        if ((n & 2) != 0) {
            bl = false;
        }
        return StringsKt.startsWith(charSequence, charSequence2, bl);
    }

    /*
     * WARNING - void declaration
     */
    @NotNull
    public static final CharSequence trimEnd(@NotNull CharSequence $this$trimEnd, char ... chars) {
        CharSequence charSequence;
        block2: {
            Intrinsics.checkNotNullParameter($this$trimEnd, "<this>");
            Intrinsics.checkNotNullParameter(chars, "chars");
            CharSequence $this$trimEnd$iv = $this$trimEnd;
            boolean $i$f$trimEnd = false;
            int n = $this$trimEnd$iv.length() + -1;
            if (0 <= n) {
                do {
                    void var6_6;
                    int index$iv = n--;
                    char it = $this$trimEnd$iv.charAt(index$iv);
                    boolean bl = false;
                    if (ArraysKt.contains(chars, (char)var6_6)) continue;
                    charSequence = $this$trimEnd$iv.subSequence(0, index$iv + 1);
                    break block2;
                } while (0 <= n);
            }
            charSequence = "";
        }
        return charSequence;
    }

    /*
     * WARNING - void declaration
     */
    @NotNull
    public static final CharSequence trim(@NotNull CharSequence $this$trim, char ... chars) {
        void var5_5;
        Intrinsics.checkNotNullParameter($this$trim, "<this>");
        Intrinsics.checkNotNullParameter(chars, "chars");
        CharSequence $this$trim$iv = $this$trim;
        boolean $i$f$trim = false;
        int startIndex$iv = 0;
        int endIndex$iv = $this$trim$iv.length() - 1;
        boolean startFound$iv = false;
        while (startIndex$iv <= endIndex$iv) {
            boolean match$iv;
            int index$iv = !startFound$iv ? startIndex$iv : endIndex$iv;
            char it = $this$trim$iv.charAt(index$iv);
            boolean bl = false;
            match$iv = ArraysKt.contains(chars, (char)(match$iv ? 1 : 0));
            if (!startFound$iv) {
                if (!match$iv) {
                    startFound$iv = true;
                    continue;
                }
                ++startIndex$iv;
                continue;
            }
            if (!match$iv) break;
            --endIndex$iv;
        }
        return $this$trim$iv.subSequence(startIndex$iv, (int)(var5_5 + true));
    }

    @NotNull
    public static final CharSequence removeSurrounding(@NotNull CharSequence $this$removeSurrounding, @NotNull CharSequence delimiter) {
        Intrinsics.checkNotNullParameter($this$removeSurrounding, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        return StringsKt.removeSurrounding($this$removeSurrounding, delimiter, delimiter);
    }

    /*
     * WARNING - void declaration
     */
    @NotNull
    public static final String trimStart(@NotNull String $this$trimStart, char ... chars) {
        CharSequence charSequence;
        block2: {
            Intrinsics.checkNotNullParameter($this$trimStart, "<this>");
            Intrinsics.checkNotNullParameter(chars, "chars");
            String $this$trimStart$iv = $this$trimStart;
            boolean $i$f$trimStart = false;
            CharSequence $this$trimStart$iv$iv = $this$trimStart$iv;
            boolean $i$f$trimStart2 = false;
            int index$iv$iv = 0;
            int n = $this$trimStart$iv$iv.length();
            while (index$iv$iv < n) {
                void var6_6;
                void var8_8;
                char it = $this$trimStart$iv$iv.charAt(index$iv$iv);
                boolean bl = false;
                if (!ArraysKt.contains(chars, (char)var8_8)) {
                    charSequence = $this$trimStart$iv$iv.subSequence(index$iv$iv, $this$trimStart$iv$iv.length());
                    break block2;
                }
                ++var6_6;
            }
            charSequence = "";
        }
        return ((Object)charSequence).toString();
    }

    @NotNull
    public static final CharSequence subSequence(@NotNull CharSequence $this$subSequence, @NotNull IntRange range) {
        Intrinsics.checkNotNullParameter($this$subSequence, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        return $this$subSequence.subSequence(range.getStart(), (Integer)range.getEndInclusive() + 1);
    }

    @InlineOnly
    private static final boolean matches(CharSequence $this$matches, Regex regex) {
        Intrinsics.checkNotNullParameter($this$matches, "<this>");
        Intrinsics.checkNotNullParameter(regex, "regex");
        return regex.matches($this$matches);
    }

    public static /* synthetic */ List split$default(CharSequence charSequence, String[] stringArray, boolean bl, int n, int n2, Object object) {
        if ((n2 & 2) != 0) {
            bl = false;
        }
        if ((n2 & 4) != 0) {
            n = 0;
        }
        return StringsKt.split(charSequence, stringArray, bl, n);
    }

    @NotNull
    public static final String replaceBefore(@NotNull String $this$replaceBefore, @NotNull String delimiter, @NotNull String replacement, @NotNull String missingDelimiterValue) {
        String string;
        Intrinsics.checkNotNullParameter($this$replaceBefore, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int index = StringsKt.indexOf$default((CharSequence)$this$replaceBefore, delimiter, 0, false, 6, null);
        if (index == -1) {
            string = missingDelimiterValue;
        } else {
            String string2 = $this$replaceBefore;
            int n = 0;
            string = ((Object)StringsKt.replaceRange((CharSequence)string2, n, index, (CharSequence)replacement)).toString();
        }
        return string;
    }

    @SinceKotlin(version="1.3")
    @InlineOnly
    private static final <C extends CharSequence & R, R> R ifBlank(C $this$ifBlank, Function0<? extends R> defaultValue) {
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return (R)(StringsKt.isBlank($this$ifBlank) ? defaultValue.invoke() : $this$ifBlank);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final boolean endsWith(@NotNull CharSequence $this$endsWith, char c, boolean ignoreCase) {
        Intrinsics.checkNotNullParameter($this$endsWith, "<this>");
        if ($this$endsWith.length() <= 0) return false;
        if (!CharsKt.equals($this$endsWith.charAt(StringsKt.getLastIndex($this$endsWith)), c, ignoreCase)) return false;
        return true;
    }

    @NotNull
    public static final CharIterator iterator(@NotNull CharSequence $this$iterator) {
        Intrinsics.checkNotNullParameter($this$iterator, "<this>");
        return new CharIterator($this$iterator){
            private int index;
            final /* synthetic */ CharSequence $this_iterator;

            public char nextChar() {
                int n = this.index;
                this.index = n + 1;
                return this.$this_iterator.charAt(n);
            }
            {
                this.$this_iterator = $receiver;
            }

            public boolean hasNext() {
                return this.index < this.$this_iterator.length();
            }
        };
    }

    @WasExperimental(markerClass={ExperimentalStdlibApi.class})
    @JvmName(name="replaceFirstCharWithCharSequence")
    @SinceKotlin(version="1.5")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final String replaceFirstCharWithCharSequence(String $this$replaceFirstChar, Function1<? super Character, ? extends CharSequence> transform) {
        String string;
        Intrinsics.checkNotNullParameter($this$replaceFirstChar, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        boolean bl = ((CharSequence)$this$replaceFirstChar).length() > 0;
        if (bl) {
            StringBuilder stringBuilder = new StringBuilder().append((Object)transform.invoke(Character.valueOf($this$replaceFirstChar.charAt(0))));
            String string2 = $this$replaceFirstChar;
            int n = 1;
            String string3 = string2.substring(n);
            Intrinsics.checkNotNullExpressionValue(string3, "substring(...)");
            string = stringBuilder.append(string3).toString();
        } else {
            String string4;
            string = string4;
        }
        return string;
    }

    @NotNull
    public static final String substringAfter(@NotNull String $this$substringAfter, @NotNull String delimiter, @NotNull String missingDelimiterValue) {
        String string;
        Intrinsics.checkNotNullParameter($this$substringAfter, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int index = StringsKt.indexOf$default((CharSequence)$this$substringAfter, delimiter, 0, false, 6, null);
        if (index == -1) {
            string = missingDelimiterValue;
        } else {
            String string2 = $this$substringAfter;
            int n = index + delimiter.length();
            int n2 = $this$substringAfter.length();
            String string3 = string2.substring(n, n2);
            string = string3;
            Intrinsics.checkNotNullExpressionValue(string3, "substring(...)");
        }
        return string;
    }

    @NotNull
    public static final String replaceBeforeLast(@NotNull String $this$replaceBeforeLast, char delimiter, @NotNull String replacement, @NotNull String missingDelimiterValue) {
        String string;
        Intrinsics.checkNotNullParameter($this$replaceBeforeLast, "<this>");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int index = StringsKt.lastIndexOf$default((CharSequence)$this$replaceBeforeLast, delimiter, 0, false, 6, null);
        if (index == -1) {
            string = missingDelimiterValue;
        } else {
            String string2 = $this$replaceBeforeLast;
            int n = 0;
            string = ((Object)StringsKt.replaceRange((CharSequence)string2, n, index, (CharSequence)replacement)).toString();
        }
        return string;
    }

    @NotNull
    public static final String substring(@NotNull CharSequence $this$substring, @NotNull IntRange range) {
        Intrinsics.checkNotNullParameter($this$substring, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        return ((Object)$this$substring.subSequence(range.getStart(), (Integer)range.getEndInclusive() + 1)).toString();
    }

    public static /* synthetic */ boolean startsWith$default(CharSequence charSequence, CharSequence charSequence2, int n, boolean bl, int n2, Object object) {
        if ((n2 & 4) != 0) {
            bl = false;
        }
        return StringsKt.startsWith(charSequence, charSequence2, n, bl);
    }

    /*
     * WARNING - void declaration
     */
    @NotNull
    public static final List<String> split(@NotNull CharSequence $this$split, @NotNull char[] delimiters, boolean ignoreCase, int limit) {
        void var7_7;
        void $this$mapTo$iv$iv;
        Intrinsics.checkNotNullParameter($this$split, "<this>");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        if (delimiters.length == 1) {
            return StringsKt__StringsKt.split$StringsKt__StringsKt($this$split, String.valueOf(delimiters[0]), ignoreCase, limit);
        }
        Iterable $this$map$iv = SequencesKt.asIterable(StringsKt__StringsKt.rangesDelimitedBy$StringsKt__StringsKt$default($this$split, delimiters, 0, ignoreCase, limit, 2, null));
        boolean $i$f$map = false;
        Iterable iterable = $this$map$iv;
        Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        boolean $i$f$mapTo = false;
        for (Object item$iv$iv : $this$mapTo$iv$iv) {
            void var11_11;
            IntRange it = (IntRange)item$iv$iv;
            Collection collection = destination$iv$iv;
            boolean bl = false;
            collection.add(StringsKt.substring($this$split, (IntRange)var11_11));
        }
        return (List)var7_7;
    }

    @NotNull
    public static final String replaceAfterLast(@NotNull String $this$replaceAfterLast, @NotNull String delimiter, @NotNull String replacement, @NotNull String missingDelimiterValue) {
        String string;
        Intrinsics.checkNotNullParameter($this$replaceAfterLast, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int index = StringsKt.lastIndexOf$default((CharSequence)$this$replaceAfterLast, delimiter, 0, false, 6, null);
        if (index == -1) {
            string = missingDelimiterValue;
        } else {
            String string2 = $this$replaceAfterLast;
            int n = index + delimiter.length();
            int n2 = $this$replaceAfterLast.length();
            string = ((Object)StringsKt.replaceRange((CharSequence)string2, n, n2, (CharSequence)replacement)).toString();
        }
        return string;
    }

    @NotNull
    public static final String substringAfterLast(@NotNull String $this$substringAfterLast, @NotNull String delimiter, @NotNull String missingDelimiterValue) {
        String string;
        Intrinsics.checkNotNullParameter($this$substringAfterLast, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int index = StringsKt.lastIndexOf$default((CharSequence)$this$substringAfterLast, delimiter, 0, false, 6, null);
        if (index == -1) {
            string = missingDelimiterValue;
        } else {
            String string2 = $this$substringAfterLast;
            int n = index + delimiter.length();
            int n2 = $this$substringAfterLast.length();
            String string3 = string2.substring(n, n2);
            string = string3;
            Intrinsics.checkNotNullExpressionValue(string3, "substring(...)");
        }
        return string;
    }

    /*
     * WARNING - void declaration
     */
    @NotNull
    public static final CharSequence trimStart(@NotNull CharSequence $this$trimStart) {
        CharSequence charSequence;
        block2: {
            Intrinsics.checkNotNullParameter($this$trimStart, "<this>");
            CharSequence $this$trimStart$iv = $this$trimStart;
            boolean $i$f$trimStart = false;
            int index$iv = 0;
            int n = $this$trimStart$iv.length();
            while (index$iv < n) {
                void var3_3;
                void var5_5;
                char p0 = $this$trimStart$iv.charAt(index$iv);
                boolean bl = false;
                if (!CharsKt.isWhitespace((char)var5_5)) {
                    charSequence = $this$trimStart$iv.subSequence(index$iv, $this$trimStart$iv.length());
                    break block2;
                }
                ++var3_3;
            }
            charSequence = "";
        }
        return charSequence;
    }

    public static final /* synthetic */ Pair access$findAnyOf(CharSequence $receiver, Collection strings, int startIndex, boolean ignoreCase, boolean last) {
        return StringsKt__StringsKt.findAnyOf$StringsKt__StringsKt($receiver, strings, startIndex, ignoreCase, last);
    }

    @NotNull
    public static final CharSequence removePrefix(@NotNull CharSequence $this$removePrefix, @NotNull CharSequence prefix) {
        Intrinsics.checkNotNullParameter($this$removePrefix, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        if (StringsKt.startsWith$default($this$removePrefix, prefix, false, 2, null)) {
            return $this$removePrefix.subSequence(prefix.length(), $this$removePrefix.length());
        }
        return $this$removePrefix.subSequence(0, $this$removePrefix.length());
    }

    @NotNull
    public static final String replaceBeforeLast(@NotNull String $this$replaceBeforeLast, @NotNull String delimiter, @NotNull String replacement, @NotNull String missingDelimiterValue) {
        String string;
        Intrinsics.checkNotNullParameter($this$replaceBeforeLast, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int index = StringsKt.lastIndexOf$default((CharSequence)$this$replaceBeforeLast, delimiter, 0, false, 6, null);
        if (index == -1) {
            string = missingDelimiterValue;
        } else {
            String string2 = $this$replaceBeforeLast;
            int n = 0;
            string = ((Object)StringsKt.replaceRange((CharSequence)string2, n, index, (CharSequence)replacement)).toString();
        }
        return string;
    }

    public static /* synthetic */ String replaceBeforeLast$default(String string, char c, String string2, String string3, int n, Object object) {
        if ((n & 4) != 0) {
            string3 = string;
        }
        return StringsKt.replaceBeforeLast(string, c, string2, string3);
    }

    public static /* synthetic */ boolean contains$default(CharSequence charSequence, CharSequence charSequence2, boolean bl, int n, Object object) {
        if ((n & 2) != 0) {
            bl = false;
        }
        return StringsKt.contains(charSequence, charSequence2, bl);
    }

    @NotNull
    public static final CharSequence removeSuffix(@NotNull CharSequence $this$removeSuffix, @NotNull CharSequence suffix) {
        Intrinsics.checkNotNullParameter($this$removeSuffix, "<this>");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        if (StringsKt.endsWith$default($this$removeSuffix, suffix, false, 2, null)) {
            return $this$removeSuffix.subSequence(0, $this$removeSuffix.length() - suffix.length());
        }
        return $this$removeSuffix.subSequence(0, $this$removeSuffix.length());
    }

    public static /* synthetic */ int indexOf$default(CharSequence charSequence, String string, int n, boolean bl, int n2, Object object) {
        if ((n2 & 2) != 0) {
            n = 0;
        }
        if ((n2 & 4) != 0) {
            bl = false;
        }
        return StringsKt.indexOf(charSequence, string, n, bl);
    }

    @InlineOnly
    private static final String replaceRange(String $this$replaceRange, IntRange range, CharSequence replacement) {
        Intrinsics.checkNotNullParameter($this$replaceRange, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        return ((Object)StringsKt.replaceRange((CharSequence)$this$replaceRange, range, replacement)).toString();
    }

    public static final int lastIndexOfAny(@NotNull CharSequence $this$lastIndexOfAny, @NotNull Collection<String> strings, int startIndex, boolean ignoreCase) {
        Intrinsics.checkNotNullParameter($this$lastIndexOfAny, "<this>");
        Intrinsics.checkNotNullParameter(strings, "strings");
        Pair<Integer, String> pair = StringsKt__StringsKt.findAnyOf$StringsKt__StringsKt($this$lastIndexOfAny, strings, startIndex, ignoreCase, true);
        return pair != null ? ((Number)pair.getFirst()).intValue() : -1;
    }

    @InlineOnly
    private static final boolean isEmpty(CharSequence $this$isEmpty) {
        Intrinsics.checkNotNullParameter($this$isEmpty, "<this>");
        return $this$isEmpty.length() == 0;
    }

    @NotNull
    public static final String replaceAfter(@NotNull String $this$replaceAfter, char delimiter, @NotNull String replacement, @NotNull String missingDelimiterValue) {
        String string;
        Intrinsics.checkNotNullParameter($this$replaceAfter, "<this>");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int index = StringsKt.indexOf$default((CharSequence)$this$replaceAfter, delimiter, 0, false, 6, null);
        if (index == -1) {
            string = missingDelimiterValue;
        } else {
            String string2 = $this$replaceAfter;
            int n = index + 1;
            int n2 = $this$replaceAfter.length();
            string = ((Object)StringsKt.replaceRange((CharSequence)string2, n, n2, (CharSequence)replacement)).toString();
        }
        return string;
    }

    public static /* synthetic */ CharSequence padStart$default(CharSequence charSequence, int n, char c, int n2, Object object) {
        if ((n2 & 2) != 0) {
            c = (char)32;
        }
        return StringsKt.padStart(charSequence, n, c);
    }

    public static /* synthetic */ String padStart$default(String string, int n, char c, int n2, Object object) {
        if ((n2 & 2) != 0) {
            c = (char)32;
        }
        return StringsKt.padStart(string, n, c);
    }

    @NotNull
    public static final String replaceAfter(@NotNull String $this$replaceAfter, @NotNull String delimiter, @NotNull String replacement, @NotNull String missingDelimiterValue) {
        String string;
        Intrinsics.checkNotNullParameter($this$replaceAfter, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int index = StringsKt.indexOf$default((CharSequence)$this$replaceAfter, delimiter, 0, false, 6, null);
        if (index == -1) {
            string = missingDelimiterValue;
        } else {
            String string2 = $this$replaceAfter;
            int n = index + delimiter.length();
            int n2 = $this$replaceAfter.length();
            string = ((Object)StringsKt.replaceRange((CharSequence)string2, n, n2, (CharSequence)replacement)).toString();
        }
        return string;
    }

    @NotNull
    public static final String substringBeforeLast(@NotNull String $this$substringBeforeLast, @NotNull String delimiter, @NotNull String missingDelimiterValue) {
        String string;
        Intrinsics.checkNotNullParameter($this$substringBeforeLast, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int index = StringsKt.lastIndexOf$default((CharSequence)$this$substringBeforeLast, delimiter, 0, false, 6, null);
        if (index == -1) {
            string = missingDelimiterValue;
        } else {
            String string2 = $this$substringBeforeLast;
            int n = 0;
            String string3 = string2.substring(n, index);
            string = string3;
            Intrinsics.checkNotNullExpressionValue(string3, "substring(...)");
        }
        return string;
    }

    /*
     * WARNING - void declaration
     */
    @NotNull
    public static final CharSequence padStart(@NotNull CharSequence $this$padStart, int length, char padChar) {
        void var3_3;
        Intrinsics.checkNotNullParameter($this$padStart, "<this>");
        if (length < 0) {
            throw new IllegalArgumentException("Desired length " + length + " is less than zero.");
        }
        if (length <= $this$padStart.length()) {
            return $this$padStart.subSequence(0, $this$padStart.length());
        }
        StringBuilder sb = new StringBuilder(length);
        IntIterator intIterator = new IntRange(1, length - $this$padStart.length()).iterator();
        while (intIterator.hasNext()) {
            int i = intIterator.nextInt();
            sb.append(padChar);
        }
        sb.append($this$padStart);
        return (CharSequence)var3_3;
    }

    public static /* synthetic */ int lastIndexOf$default(CharSequence charSequence, String string, int n, boolean bl, int n2, Object object) {
        if ((n2 & 2) != 0) {
            n = StringsKt.getLastIndex(charSequence);
        }
        if ((n2 & 4) != 0) {
            bl = false;
        }
        return StringsKt.lastIndexOf(charSequence, string, n, bl);
    }

    @InlineOnly
    private static final boolean contains(CharSequence $this$contains, Regex regex) {
        Intrinsics.checkNotNullParameter($this$contains, "<this>");
        Intrinsics.checkNotNullParameter(regex, "regex");
        return regex.containsMatchIn($this$contains);
    }

    static /* synthetic */ int indexOf$StringsKt__StringsKt$default(CharSequence charSequence, CharSequence charSequence2, int n, int n2, boolean bl, boolean bl2, int n3, Object object) {
        if ((n3 & 0x10) != 0) {
            bl2 = false;
        }
        return StringsKt__StringsKt.indexOf$StringsKt__StringsKt(charSequence, charSequence2, n, n2, bl, bl2);
    }

    public static /* synthetic */ String substringBeforeLast$default(String string, String string2, String string3, int n, Object object) {
        if ((n & 2) != 0) {
            string3 = string;
        }
        return StringsKt.substringBeforeLast(string, string2, string3);
    }

    /*
     * WARNING - void declaration
     */
    @NotNull
    public static final CharSequence trim(@NotNull CharSequence $this$trim) {
        void var4_4;
        Intrinsics.checkNotNullParameter($this$trim, "<this>");
        CharSequence $this$trim$iv = $this$trim;
        boolean $i$f$trim = false;
        int startIndex$iv = 0;
        int endIndex$iv = $this$trim$iv.length() - 1;
        boolean startFound$iv = false;
        while (startIndex$iv <= endIndex$iv) {
            boolean match$iv;
            int index$iv = !startFound$iv ? startIndex$iv : endIndex$iv;
            char p0 = $this$trim$iv.charAt(index$iv);
            boolean bl = false;
            match$iv = CharsKt.isWhitespace((char)(match$iv ? 1 : 0));
            if (!startFound$iv) {
                if (!match$iv) {
                    startFound$iv = true;
                    continue;
                }
                ++startIndex$iv;
                continue;
            }
            if (!match$iv) break;
            --endIndex$iv;
        }
        return $this$trim$iv.subSequence(startIndex$iv, (int)(var4_4 + true));
    }

    @NotNull
    public static final String substring(@NotNull String $this$substring, @NotNull IntRange range) {
        Intrinsics.checkNotNullParameter($this$substring, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        String string = $this$substring;
        int n = range.getStart();
        int n2 = (Integer)range.getEndInclusive() + 1;
        String string2 = string.substring(n, n2);
        Intrinsics.checkNotNullExpressionValue(string2, "substring(...)");
        return string2;
    }

    public static /* synthetic */ boolean contains$default(CharSequence charSequence, char c, boolean bl, int n, Object object) {
        if ((n & 2) != 0) {
            bl = false;
        }
        return StringsKt.contains(charSequence, c, bl);
    }

    @InlineOnly
    private static final String trimEnd(String $this$trimEnd) {
        Intrinsics.checkNotNullParameter($this$trimEnd, "<this>");
        return ((Object)StringsKt.trimEnd((CharSequence)$this$trimEnd)).toString();
    }

    private static final int indexOf$StringsKt__StringsKt(CharSequence $this$indexOf, CharSequence other, int startIndex, int endIndex, boolean ignoreCase, boolean last) {
        block12: {
            int n;
            int n2;
            int index;
            block15: {
                IntProgression indices;
                block13: {
                    int n3;
                    int n4;
                    int index2;
                    block14: {
                        IntProgression intProgression = !last ? (IntProgression)new IntRange(RangesKt.coerceAtLeast(startIndex, 0), RangesKt.coerceAtMost(endIndex, $this$indexOf.length())) : (indices = RangesKt.downTo(RangesKt.coerceAtMost(startIndex, StringsKt.getLastIndex($this$indexOf)), RangesKt.coerceAtLeast(endIndex, 0)));
                        if (!($this$indexOf instanceof String) || !(other instanceof String)) break block13;
                        index2 = indices.getFirst();
                        n4 = indices.getLast();
                        n3 = indices.getStep();
                        if (n3 > 0 && index2 <= n4) break block14;
                        if (n3 >= 0 || n4 > index2) break block12;
                    }
                    while (true) {
                        if (StringsKt.regionMatches((String)other, 0, (String)$this$indexOf, index2, other.length(), ignoreCase)) {
                            return index2;
                        }
                        if (index2 != n4) {
                            index2 += n3;
                            continue;
                        }
                        break block12;
                        break;
                    }
                }
                index = indices.getFirst();
                n2 = indices.getLast();
                n = indices.getStep();
                if (n > 0 && index <= n2) break block15;
                if (n >= 0 || n2 > index) break block12;
            }
            while (true) {
                if (StringsKt.regionMatchesImpl(other, 0, $this$indexOf, index, other.length(), ignoreCase)) {
                    return index;
                }
                if (index == n2) break;
                int n5 = index + n;
            }
        }
        return -1;
    }

    @NotNull
    public static final String removePrefix(@NotNull String $this$removePrefix, @NotNull CharSequence prefix) {
        String string;
        Intrinsics.checkNotNullParameter($this$removePrefix, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        if (StringsKt.startsWith$default((CharSequence)$this$removePrefix, prefix, false, 2, null)) {
            String string2 = $this$removePrefix;
            int n = prefix.length();
            String string3 = string2.substring(n);
            Intrinsics.checkNotNullExpressionValue(string3, "substring(...)");
            return string3;
        }
        return string;
    }

    /*
     * WARNING - void declaration
     */
    private static final Pair<Integer, String> findAnyOf$StringsKt__StringsKt(CharSequence $this$findAnyOf, Collection<String> strings, int startIndex, boolean ignoreCase, boolean last) {
        IntProgression indices;
        if (!ignoreCase) {
            if (strings.size() == 1) {
                int index;
                String string = (String)CollectionsKt.single((Iterable)strings);
                int n = !last ? StringsKt.indexOf$default($this$findAnyOf, string, startIndex, false, 4, null) : (index = StringsKt.lastIndexOf$default($this$findAnyOf, string, startIndex, false, 4, null));
                return index < 0 ? null : TuplesKt.to(index, string);
            }
        }
        IntProgression intProgression = !last ? (IntProgression)new IntRange(RangesKt.coerceAtLeast(startIndex, 0), $this$findAnyOf.length()) : (indices = RangesKt.downTo(RangesKt.coerceAtMost(startIndex, StringsKt.getLastIndex($this$findAnyOf)), 0));
        if ($this$findAnyOf instanceof String) {
            int index = indices.getFirst();
            int n = indices.getLast();
            int n2 = indices.getStep();
            if (n2 > 0 && index <= n || n2 < 0 && n <= index) {
                while (true) {
                    Object v2;
                    block13: {
                        Iterable $this$firstOrNull$iv = strings;
                        boolean $i$f$firstOrNull = false;
                        for (Object element$iv : $this$firstOrNull$iv) {
                            String it = (String)element$iv;
                            boolean bl = false;
                            if (!StringsKt.regionMatches(it, 0, (String)$this$findAnyOf, index, it.length(), ignoreCase)) continue;
                            v2 = element$iv;
                            break block13;
                        }
                        v2 = null;
                    }
                    String matchingString = v2;
                    if (matchingString != null) {
                        return TuplesKt.to(index, matchingString);
                    }
                    if (index != n) {
                        index += n2;
                        continue;
                    }
                    break;
                }
            }
        } else {
            int index = indices.getFirst();
            int n = indices.getLast();
            int n3 = indices.getStep();
            if (n3 > 0 && index <= n || n3 < 0 && n <= index) {
                while (true) {
                    void var6_9;
                    Object v3;
                    block15: {
                        Iterable $this$firstOrNull$iv = strings;
                        boolean $i$f$firstOrNull = false;
                        for (Object element$iv : $this$firstOrNull$iv) {
                            void var13_23;
                            void var14_25;
                            String it = (String)element$iv;
                            boolean bl = false;
                            if (!StringsKt.regionMatchesImpl((CharSequence)var14_25, 0, $this$findAnyOf, index, var14_25.length(), ignoreCase)) continue;
                            v3 = var13_23;
                            break block15;
                        }
                        v3 = null;
                    }
                    String string = v3;
                    if (string != null) {
                        return TuplesKt.to(index, string);
                    }
                    if (var6_9 == n) break;
                    var6_9 += n3;
                }
            }
        }
        return null;
    }

    @NotNull
    public static final Sequence<String> splitToSequence(@NotNull CharSequence $this$splitToSequence, @NotNull String[] delimiters, boolean ignoreCase, int limit) {
        Intrinsics.checkNotNullParameter($this$splitToSequence, "<this>");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        return SequencesKt.map(StringsKt__StringsKt.rangesDelimitedBy$StringsKt__StringsKt$default($this$splitToSequence, delimiters, 0, ignoreCase, limit, 2, null), (Function1)new Function1<IntRange, String>($this$splitToSequence){
            final /* synthetic */ CharSequence $this_splitToSequence;

            @NotNull
            public final String invoke(@NotNull IntRange it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return StringsKt.substring(this.$this_splitToSequence, it);
            }
            {
                this.$this_splitToSequence = $receiver;
                super(1);
            }
        });
    }

    static /* synthetic */ Sequence splitToSequence$default(CharSequence $this$splitToSequence_u24default, Regex regex, int limit, int n, Object object) {
        if ((n & 2) != 0) {
            limit = 0;
        }
        Intrinsics.checkNotNullParameter($this$splitToSequence_u24default, "<this>");
        Intrinsics.checkNotNullParameter(regex, "regex");
        return regex.splitToSequence($this$splitToSequence_u24default, limit);
    }

    /*
     * WARNING - void declaration
     */
    @NotNull
    public static final String trim(@NotNull String $this$trim, @NotNull Function1<? super Character, Boolean> predicate) {
        void var6_6;
        Intrinsics.checkNotNullParameter($this$trim, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        boolean $i$f$trim = false;
        CharSequence $this$trim$iv = $this$trim;
        boolean $i$f$trim2 = false;
        int startIndex$iv = 0;
        int endIndex$iv = $this$trim$iv.length() - 1;
        boolean startFound$iv = false;
        while (startIndex$iv <= endIndex$iv) {
            int index$iv = !startFound$iv ? startIndex$iv : endIndex$iv;
            boolean match$iv = predicate.invoke(Character.valueOf($this$trim$iv.charAt(index$iv)));
            if (!startFound$iv) {
                if (!match$iv) {
                    startFound$iv = true;
                    continue;
                }
                ++startIndex$iv;
                continue;
            }
            if (!match$iv) break;
            --endIndex$iv;
        }
        return ((Object)$this$trim$iv.subSequence(startIndex$iv, (int)(var6_6 + true))).toString();
    }

    private static final Sequence<IntRange> rangesDelimitedBy$StringsKt__StringsKt(CharSequence $this$rangesDelimitedBy, String[] delimiters, int startIndex, boolean ignoreCase, int limit) {
        StringsKt.requireNonNegativeLimit(limit);
        List<String> delimitersList = ArraysKt.asList(delimiters);
        return new DelimitedRangesSequence($this$rangesDelimitedBy, startIndex, limit, (Function2<? super CharSequence, ? super Integer, Pair<Integer, Integer>>)new Function2<CharSequence, Integer, Pair<? extends Integer, ? extends Integer>>(delimitersList, ignoreCase){
            final /* synthetic */ List<String> $delimitersList;
            final /* synthetic */ boolean $ignoreCase;
            {
                this.$delimitersList = $delimitersList;
                this.$ignoreCase = $ignoreCase;
                super(2);
            }

            @Nullable
            public final Pair<Integer, Integer> invoke(@NotNull CharSequence $this$$receiver, int currentIndex) {
                Pair<A, Integer> pair;
                Intrinsics.checkNotNullParameter($this$$receiver, "$this$$receiver");
                Pair pair2 = StringsKt__StringsKt.access$findAnyOf($this$$receiver, this.$delimitersList, currentIndex, this.$ignoreCase, false);
                if (pair2 != null) {
                    Pair pair3 = pair2;
                    Pair it = pair3;
                    boolean bl = false;
                    pair = TuplesKt.to(it.getFirst(), ((String)it.getSecond()).length());
                } else {
                    pair = null;
                }
                return pair;
            }
        });
    }

    /*
     * WARNING - void declaration
     */
    public static final int lastIndexOfAny(@NotNull CharSequence $this$lastIndexOfAny, @NotNull char[] chars, int startIndex, boolean ignoreCase) {
        Intrinsics.checkNotNullParameter($this$lastIndexOfAny, "<this>");
        Intrinsics.checkNotNullParameter(chars, "chars");
        if (!ignoreCase) {
            if (chars.length == 1 && $this$lastIndexOfAny instanceof String) {
                char c = ArraysKt.single(chars);
                return ((String)$this$lastIndexOfAny).lastIndexOf(c, startIndex);
            }
        }
        int index = RangesKt.coerceAtMost(startIndex, StringsKt.getLastIndex($this$lastIndexOfAny));
        while (-1 < index) {
            void var4_5;
            boolean bl;
            block5: {
                char charAtIndex = $this$lastIndexOfAny.charAt(index);
                char[] $this$any$iv = chars;
                boolean $i$f$any = false;
                int n = $this$any$iv.length;
                for (int i = 0; i < n; ++i) {
                    void var11_12;
                    char element$iv;
                    char it = element$iv = $this$any$iv[i];
                    boolean bl2 = false;
                    if (!CharsKt.equals((char)var11_12, charAtIndex, ignoreCase)) continue;
                    bl = true;
                    break block5;
                }
                bl = false;
            }
            if (bl) {
                return (int)var4_5;
            }
            --var4_5;
        }
        return -1;
    }

    @InlineOnly
    private static final boolean isNullOrEmpty(CharSequence $this$isNullOrEmpty) {
        return $this$isNullOrEmpty == null || $this$isNullOrEmpty.length() == 0;
    }

    public static final void requireNonNegativeLimit(int limit) {
        boolean bl = limit >= 0;
        if (!bl) {
            boolean bl2 = false;
            String string = "Limit must be non-negative, but was " + limit;
            throw new IllegalArgumentException(string.toString());
        }
    }

    public static /* synthetic */ String replaceBeforeLast$default(String string, String string2, String string3, String string4, int n, Object object) {
        if ((n & 4) != 0) {
            string4 = string;
        }
        return StringsKt.replaceBeforeLast(string, string2, string3, string4);
    }

    public static /* synthetic */ boolean startsWith$default(CharSequence charSequence, char c, boolean bl, int n, Object object) {
        if ((n & 2) != 0) {
            bl = false;
        }
        return StringsKt.startsWith(charSequence, c, bl);
    }

    @InlineOnly
    private static final List<String> split(CharSequence $this$split, Regex regex, int limit) {
        Intrinsics.checkNotNullParameter($this$split, "<this>");
        Intrinsics.checkNotNullParameter(regex, "regex");
        return regex.split($this$split, limit);
    }

    @SinceKotlin(version="1.5")
    public static final boolean toBooleanStrict(@NotNull String $this$toBooleanStrict) {
        boolean bl;
        Intrinsics.checkNotNullParameter($this$toBooleanStrict, "<this>");
        String string = $this$toBooleanStrict;
        if (Intrinsics.areEqual(string, "true")) {
            bl = true;
        } else if (Intrinsics.areEqual(string, "false")) {
            bl = false;
        } else {
            throw new IllegalArgumentException("The string doesn't represent a boolean value: " + $this$toBooleanStrict);
        }
        return bl;
    }

    @NotNull
    public static final IntRange getIndices(@NotNull CharSequence $this$indices) {
        Intrinsics.checkNotNullParameter($this$indices, "<this>");
        return new IntRange(0, $this$indices.length() - 1);
    }

    @InlineOnly
    private static final String replaceRange(String $this$replaceRange, int startIndex, int endIndex, CharSequence replacement) {
        Intrinsics.checkNotNullParameter($this$replaceRange, "<this>");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        return ((Object)StringsKt.replaceRange((CharSequence)$this$replaceRange, startIndex, endIndex, replacement)).toString();
    }

    public static /* synthetic */ String substringAfter$default(String string, String string2, String string3, int n, Object object) {
        if ((n & 2) != 0) {
            string3 = string;
        }
        return StringsKt.substringAfter(string, string2, string3);
    }

    @NotNull
    public static final Sequence<String> lineSequence(@NotNull CharSequence $this$lineSequence) {
        Intrinsics.checkNotNullParameter($this$lineSequence, "<this>");
        String[] stringArray = new String[3];
        stringArray[0] = "\r\n";
        stringArray[1] = "\n";
        stringArray[2] = "\r";
        return StringsKt.splitToSequence$default($this$lineSequence, stringArray, false, 0, 6, null);
    }

    @WasExperimental(markerClass={ExperimentalStdlibApi.class})
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    @SinceKotlin(version="1.5")
    @JvmName(name="replaceFirstCharWithChar")
    private static final String replaceFirstCharWithChar(String $this$replaceFirstChar, Function1<? super Character, Character> transform) {
        String string;
        Intrinsics.checkNotNullParameter($this$replaceFirstChar, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        boolean bl = ((CharSequence)$this$replaceFirstChar).length() > 0;
        if (bl) {
            char c = transform.invoke(Character.valueOf($this$replaceFirstChar.charAt(0))).charValue();
            String string2 = $this$replaceFirstChar;
            int n = 1;
            String string3 = string2.substring(n);
            Intrinsics.checkNotNullExpressionValue(string3, "substring(...)");
            string2 = string3;
            string = c + string2;
        } else {
            String string4;
            string = string4;
        }
        return string;
    }

    public static /* synthetic */ Sequence splitToSequence$default(CharSequence charSequence, String[] stringArray, boolean bl, int n, int n2, Object object) {
        if ((n2 & 2) != 0) {
            bl = false;
        }
        if ((n2 & 4) != 0) {
            n = 0;
        }
        return StringsKt.splitToSequence(charSequence, stringArray, bl, n);
    }

    @Nullable
    public static final Pair<Integer, String> findAnyOf(@NotNull CharSequence $this$findAnyOf, @NotNull Collection<String> strings, int startIndex, boolean ignoreCase) {
        Intrinsics.checkNotNullParameter($this$findAnyOf, "<this>");
        Intrinsics.checkNotNullParameter(strings, "strings");
        return StringsKt__StringsKt.findAnyOf$StringsKt__StringsKt($this$findAnyOf, strings, startIndex, ignoreCase, false);
    }

    @NotNull
    public static final String replaceBefore(@NotNull String $this$replaceBefore, char delimiter, @NotNull String replacement, @NotNull String missingDelimiterValue) {
        String string;
        Intrinsics.checkNotNullParameter($this$replaceBefore, "<this>");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int index = StringsKt.indexOf$default((CharSequence)$this$replaceBefore, delimiter, 0, false, 6, null);
        if (index == -1) {
            string = missingDelimiterValue;
        } else {
            String string2 = $this$replaceBefore;
            int n = 0;
            string = ((Object)StringsKt.replaceRange((CharSequence)string2, n, index, (CharSequence)replacement)).toString();
        }
        return string;
    }

    @NotNull
    public static final CharSequence removeRange(@NotNull CharSequence $this$removeRange, @NotNull IntRange range) {
        Intrinsics.checkNotNullParameter($this$removeRange, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        return StringsKt.removeRange($this$removeRange, (int)range.getStart(), (Integer)range.getEndInclusive() + 1);
    }

    public static /* synthetic */ String substringAfterLast$default(String string, String string2, String string3, int n, Object object) {
        if ((n & 2) != 0) {
            string3 = string;
        }
        return StringsKt.substringAfterLast(string, string2, string3);
    }

    public static /* synthetic */ List split$default(CharSequence charSequence, char[] cArray, boolean bl, int n, int n2, Object object) {
        if ((n2 & 2) != 0) {
            bl = false;
        }
        if ((n2 & 4) != 0) {
            n = 0;
        }
        return StringsKt.split(charSequence, cArray, bl, n);
    }

    @NotNull
    public static final CharSequence removeSurrounding(@NotNull CharSequence $this$removeSurrounding, @NotNull CharSequence prefix, @NotNull CharSequence suffix) {
        CharSequence charSequence;
        Intrinsics.checkNotNullParameter($this$removeSurrounding, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        if ($this$removeSurrounding.length() >= prefix.length() + suffix.length()) {
            if (StringsKt.startsWith$default($this$removeSurrounding, prefix, false, 2, null)) {
                if (StringsKt.endsWith$default($this$removeSurrounding, suffix, false, 2, null)) {
                    return $this$removeSurrounding.subSequence(prefix.length(), $this$removeSurrounding.length() - suffix.length());
                }
            }
        }
        return $this$removeSurrounding.subSequence(0, charSequence.length());
    }

    /*
     * WARNING - void declaration
     */
    @NotNull
    public static final String trimStart(@NotNull String $this$trimStart, @NotNull Function1<? super Character, Boolean> predicate) {
        CharSequence charSequence;
        block2: {
            Intrinsics.checkNotNullParameter($this$trimStart, "<this>");
            Intrinsics.checkNotNullParameter(predicate, "predicate");
            boolean $i$f$trimStart = false;
            CharSequence $this$trimStart$iv = $this$trimStart;
            boolean $i$f$trimStart2 = false;
            int index$iv = 0;
            int n = $this$trimStart$iv.length();
            while (index$iv < n) {
                void var5_5;
                if (!predicate.invoke(Character.valueOf($this$trimStart$iv.charAt(index$iv))).booleanValue()) {
                    charSequence = $this$trimStart$iv.subSequence(index$iv, $this$trimStart$iv.length());
                    break block2;
                }
                ++var5_5;
            }
            charSequence = "";
        }
        return ((Object)charSequence).toString();
    }

    public static /* synthetic */ int lastIndexOfAny$default(CharSequence charSequence, Collection collection, int n, boolean bl, int n2, Object object) {
        if ((n2 & 2) != 0) {
            n = StringsKt.getLastIndex(charSequence);
        }
        if ((n2 & 4) != 0) {
            bl = false;
        }
        return StringsKt.lastIndexOfAny(charSequence, collection, n, bl);
    }

    /*
     * WARNING - void declaration
     */
    @NotNull
    public static final CharSequence replaceRange(@NotNull CharSequence $this$replaceRange, int startIndex, int endIndex, @NotNull CharSequence replacement) {
        void var4_4;
        Intrinsics.checkNotNullParameter($this$replaceRange, "<this>");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        if (endIndex < startIndex) {
            throw new IndexOutOfBoundsException("End index (" + endIndex + ") is less than start index (" + startIndex + ").");
        }
        StringBuilder sb = new StringBuilder();
        Intrinsics.checkNotNullExpressionValue(sb.append($this$replaceRange, 0, startIndex), "append(...)");
        sb.append(replacement);
        Intrinsics.checkNotNullExpressionValue(sb.append($this$replaceRange, endIndex, $this$replaceRange.length()), "append(...)");
        return (CharSequence)var4_4;
    }

    public static final boolean hasSurrogatePairAt(@NotNull CharSequence $this$hasSurrogatePairAt, int index) {
        Intrinsics.checkNotNullParameter($this$hasSurrogatePairAt, "<this>");
        return new IntRange(0, $this$hasSurrogatePairAt.length() - 2).contains(index) && Character.isHighSurrogate($this$hasSurrogatePairAt.charAt(index)) && Character.isLowSurrogate($this$hasSurrogatePairAt.charAt(index + 1));
    }

    public static /* synthetic */ String replaceAfterLast$default(String string, String string2, String string3, String string4, int n, Object object) {
        if ((n & 4) != 0) {
            string4 = string;
        }
        return StringsKt.replaceAfterLast(string, string2, string3, string4);
    }

    public static /* synthetic */ Pair findAnyOf$default(CharSequence charSequence, Collection collection, int n, boolean bl, int n2, Object object) {
        if ((n2 & 2) != 0) {
            n = 0;
        }
        if ((n2 & 4) != 0) {
            bl = false;
        }
        return StringsKt.findAnyOf(charSequence, collection, n, bl);
    }

    @InlineOnly
    private static final String removeRange(String $this$removeRange, IntRange range) {
        Intrinsics.checkNotNullParameter($this$removeRange, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        return ((Object)StringsKt.removeRange((CharSequence)$this$removeRange, range)).toString();
    }

    public static /* synthetic */ int lastIndexOf$default(CharSequence charSequence, char c, int n, boolean bl, int n2, Object object) {
        if ((n2 & 2) != 0) {
            n = StringsKt.getLastIndex(charSequence);
        }
        if ((n2 & 4) != 0) {
            bl = false;
        }
        return StringsKt.lastIndexOf(charSequence, c, n, bl);
    }

    /*
     * WARNING - void declaration
     */
    @NotNull
    public static final String commonSuffixWith(@NotNull CharSequence $this$commonSuffixWith, @NotNull CharSequence other, boolean ignoreCase) {
        void var3_3;
        int i;
        int thisLength;
        block4: {
            block3: {
                Intrinsics.checkNotNullParameter($this$commonSuffixWith, "<this>");
                Intrinsics.checkNotNullParameter(other, "other");
                thisLength = $this$commonSuffixWith.length();
                int otherLength = other.length();
                int shortestLength = Math.min(thisLength, otherLength);
                for (i = 0; i < shortestLength; ++i) {
                    if (!CharsKt.equals($this$commonSuffixWith.charAt(thisLength - i - 1), other.charAt(otherLength - i - 1), ignoreCase)) break;
                }
                if (StringsKt.hasSurrogatePairAt($this$commonSuffixWith, thisLength - i - 1)) break block3;
                if (!StringsKt.hasSurrogatePairAt(other, otherLength - i - 1)) break block4;
            }
            --i;
        }
        return ((Object)$this$commonSuffixWith.subSequence(thisLength - i, (int)var3_3)).toString();
    }

    @InlineOnly
    private static final String replace(CharSequence $this$replace, Regex regex, String replacement) {
        Intrinsics.checkNotNullParameter($this$replace, "<this>");
        Intrinsics.checkNotNullParameter(regex, "regex");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        return regex.replace($this$replace, replacement);
    }

    @NotNull
    public static final String replaceAfterLast(@NotNull String $this$replaceAfterLast, char delimiter, @NotNull String replacement, @NotNull String missingDelimiterValue) {
        String string;
        Intrinsics.checkNotNullParameter($this$replaceAfterLast, "<this>");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int index = StringsKt.lastIndexOf$default((CharSequence)$this$replaceAfterLast, delimiter, 0, false, 6, null);
        if (index == -1) {
            string = missingDelimiterValue;
        } else {
            String string2 = $this$replaceAfterLast;
            int n = index + 1;
            int n2 = $this$replaceAfterLast.length();
            string = ((Object)StringsKt.replaceRange((CharSequence)string2, n, n2, (CharSequence)replacement)).toString();
        }
        return string;
    }

    public static /* synthetic */ String replaceBefore$default(String string, char c, String string2, String string3, int n, Object object) {
        if ((n & 4) != 0) {
            string3 = string;
        }
        return StringsKt.replaceBefore(string, c, string2, string3);
    }

    /*
     * WARNING - void declaration
     */
    @NotNull
    public static final String trimEnd(@NotNull String $this$trimEnd, char ... chars) {
        CharSequence charSequence;
        block2: {
            Intrinsics.checkNotNullParameter($this$trimEnd, "<this>");
            Intrinsics.checkNotNullParameter(chars, "chars");
            String $this$trimEnd$iv = $this$trimEnd;
            boolean $i$f$trimEnd = false;
            CharSequence $this$trimEnd$iv$iv = $this$trimEnd$iv;
            boolean $i$f$trimEnd2 = false;
            int n = $this$trimEnd$iv$iv.length() + -1;
            if (0 <= n) {
                do {
                    void var8_8;
                    int index$iv$iv = n--;
                    char it = $this$trimEnd$iv$iv.charAt(index$iv$iv);
                    boolean bl = false;
                    if (ArraysKt.contains(chars, (char)var8_8)) continue;
                    charSequence = $this$trimEnd$iv$iv.subSequence(0, index$iv$iv + 1);
                    break block2;
                } while (0 <= n);
            }
            charSequence = "";
        }
        return ((Object)charSequence).toString();
    }

    static /* synthetic */ String substring$default(CharSequence $this$substring_u24default, int startIndex, int endIndex, int n, Object object) {
        if ((n & 2) != 0) {
            endIndex = $this$substring_u24default.length();
        }
        Intrinsics.checkNotNullParameter($this$substring_u24default, "<this>");
        return ((Object)$this$substring_u24default.subSequence(startIndex, endIndex)).toString();
    }

    public static /* synthetic */ Sequence splitToSequence$default(CharSequence charSequence, char[] cArray, boolean bl, int n, int n2, Object object) {
        if ((n2 & 2) != 0) {
            bl = false;
        }
        if ((n2 & 4) != 0) {
            n = 0;
        }
        return StringsKt.splitToSequence(charSequence, cArray, bl, n);
    }

    @Nullable
    public static final Pair<Integer, String> findLastAnyOf(@NotNull CharSequence $this$findLastAnyOf, @NotNull Collection<String> strings, int startIndex, boolean ignoreCase) {
        Intrinsics.checkNotNullParameter($this$findLastAnyOf, "<this>");
        Intrinsics.checkNotNullParameter(strings, "strings");
        return StringsKt__StringsKt.findAnyOf$StringsKt__StringsKt($this$findLastAnyOf, strings, startIndex, ignoreCase, true);
    }

    @InlineOnly
    private static final String trimStart(String $this$trimStart) {
        Intrinsics.checkNotNullParameter($this$trimStart, "<this>");
        return ((Object)StringsKt.trimStart((CharSequence)$this$trimStart)).toString();
    }

    @NotNull
    public static final Sequence<String> splitToSequence(@NotNull CharSequence $this$splitToSequence, @NotNull char[] delimiters, boolean ignoreCase, int limit) {
        Intrinsics.checkNotNullParameter($this$splitToSequence, "<this>");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        return SequencesKt.map(StringsKt__StringsKt.rangesDelimitedBy$StringsKt__StringsKt$default($this$splitToSequence, delimiters, 0, ignoreCase, limit, 2, null), (Function1)new Function1<IntRange, String>($this$splitToSequence){
            final /* synthetic */ CharSequence $this_splitToSequence;

            @NotNull
            public final String invoke(@NotNull IntRange it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return StringsKt.substring(this.$this_splitToSequence, it);
            }
            {
                this.$this_splitToSequence = $receiver;
                super(1);
            }
        });
    }

    @InlineOnly
    private static final String replace(CharSequence $this$replace, Regex regex, Function1<? super MatchResult, ? extends CharSequence> transform) {
        Intrinsics.checkNotNullParameter($this$replace, "<this>");
        Intrinsics.checkNotNullParameter(regex, "regex");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return regex.replace($this$replace, transform);
    }

    public static /* synthetic */ Pair findLastAnyOf$default(CharSequence charSequence, Collection collection, int n, boolean bl, int n2, Object object) {
        if ((n2 & 2) != 0) {
            n = StringsKt.getLastIndex(charSequence);
        }
        if ((n2 & 4) != 0) {
            bl = false;
        }
        return StringsKt.findLastAnyOf(charSequence, collection, n, bl);
    }

    /*
     * WARNING - void declaration
     */
    public static final boolean regionMatchesImpl(@NotNull CharSequence $this$regionMatchesImpl, int thisOffset, @NotNull CharSequence other, int otherOffset, int length, boolean ignoreCase) {
        block6: {
            block5: {
                Intrinsics.checkNotNullParameter($this$regionMatchesImpl, "<this>");
                Intrinsics.checkNotNullParameter(other, "other");
                if (otherOffset < 0 || thisOffset < 0 || thisOffset > $this$regionMatchesImpl.length() - length) break block5;
                if (otherOffset <= other.length() - length) break block6;
            }
            return false;
        }
        int index = 0;
        while (index < length) {
            void var6_6;
            if (!CharsKt.equals($this$regionMatchesImpl.charAt(thisOffset + index), other.charAt(otherOffset + index), ignoreCase)) {
                return false;
            }
            ++var6_6;
        }
        return true;
    }

    @NotNull
    public static final String trim(@NotNull String $this$trim, char ... chars) {
        Intrinsics.checkNotNullParameter($this$trim, "<this>");
        Intrinsics.checkNotNullParameter(chars, "chars");
        String $this$trim$iv = $this$trim;
        boolean $i$f$trim = false;
        CharSequence $this$trim$iv$iv = $this$trim$iv;
        boolean $i$f$trim2 = false;
        int startIndex$iv$iv = 0;
        int endIndex$iv$iv = $this$trim$iv$iv.length() - 1;
        boolean startFound$iv$iv = false;
        while (startIndex$iv$iv <= endIndex$iv$iv) {
            boolean match$iv$iv;
            int index$iv$iv = !startFound$iv$iv ? startIndex$iv$iv : endIndex$iv$iv;
            char it = $this$trim$iv$iv.charAt(index$iv$iv);
            boolean bl = false;
            match$iv$iv = ArraysKt.contains(chars, (char)(match$iv$iv ? 1 : 0));
            if (!startFound$iv$iv) {
                if (!match$iv$iv) {
                    startFound$iv$iv = true;
                    continue;
                }
                ++startIndex$iv$iv;
                continue;
            }
            if (!match$iv$iv) break;
            --endIndex$iv$iv;
        }
        return ((Object)$this$trim$iv$iv.subSequence(startIndex$iv$iv, endIndex$iv$iv + 1)).toString();
    }

    public static /* synthetic */ String substringBefore$default(String string, char c, String string2, int n, Object object) {
        if ((n & 2) != 0) {
            string2 = string;
        }
        return StringsKt.substringBefore(string, c, string2);
    }

    public static /* synthetic */ int lastIndexOfAny$default(CharSequence charSequence, char[] cArray, int n, boolean bl, int n2, Object object) {
        if ((n2 & 2) != 0) {
            n = StringsKt.getLastIndex(charSequence);
        }
        if ((n2 & 4) != 0) {
            bl = false;
        }
        return StringsKt.lastIndexOfAny(charSequence, cArray, n, bl);
    }

    @NotNull
    public static final CharSequence trim(@NotNull CharSequence $this$trim, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter($this$trim, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        boolean $i$f$trim = false;
        int startIndex = 0;
        int endIndex = $this$trim.length() - 1;
        boolean startFound = false;
        while (startIndex <= endIndex) {
            int index = !startFound ? startIndex : endIndex;
            boolean match = predicate.invoke(Character.valueOf($this$trim.charAt(index)));
            if (!startFound) {
                if (!match) {
                    startFound = true;
                    continue;
                }
                ++startIndex;
                continue;
            }
            if (!match) break;
            --endIndex;
        }
        return $this$trim.subSequence(startIndex, endIndex + 1);
    }

    public static /* synthetic */ String commonPrefixWith$default(CharSequence charSequence, CharSequence charSequence2, boolean bl, int n, Object object) {
        if ((n & 2) != 0) {
            bl = false;
        }
        return StringsKt.commonPrefixWith(charSequence, charSequence2, bl);
    }

    static /* synthetic */ Sequence rangesDelimitedBy$StringsKt__StringsKt$default(CharSequence charSequence, char[] cArray, int n, boolean bl, int n2, int n3, Object object) {
        if ((n3 & 2) != 0) {
            n = 0;
        }
        if ((n3 & 4) != 0) {
            bl = false;
        }
        if ((n3 & 8) != 0) {
            n2 = 0;
        }
        return StringsKt__StringsKt.rangesDelimitedBy$StringsKt__StringsKt(charSequence, cArray, n, bl, n2);
    }

    /*
     * WARNING - void declaration
     */
    public static final boolean startsWith(@NotNull CharSequence $this$startsWith, @NotNull CharSequence prefix, int startIndex, boolean ignoreCase) {
        void var3_3;
        Intrinsics.checkNotNullParameter($this$startsWith, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        if (!ignoreCase && $this$startsWith instanceof String && prefix instanceof String) {
            return StringsKt.startsWith$default((String)$this$startsWith, (String)prefix, startIndex, false, 4, null);
        }
        return StringsKt.regionMatchesImpl($this$startsWith, startIndex, prefix, 0, prefix.length(), (boolean)var3_3);
    }

    public static /* synthetic */ String padEnd$default(String string, int n, char c, int n2, Object object) {
        if ((n2 & 2) != 0) {
            c = (char)32;
        }
        return StringsKt.padEnd(string, n, c);
    }

    @WasExperimental(markerClass={ExperimentalStdlibApi.class})
    @InlineOnly
    @SinceKotlin(version="1.6")
    private static final Sequence<String> splitToSequence(CharSequence $this$splitToSequence, Regex regex, int limit) {
        Intrinsics.checkNotNullParameter($this$splitToSequence, "<this>");
        Intrinsics.checkNotNullParameter(regex, "regex");
        return regex.splitToSequence($this$splitToSequence, limit);
    }

    @NotNull
    public static final String padStart(@NotNull String $this$padStart, int length, char padChar) {
        Intrinsics.checkNotNullParameter($this$padStart, "<this>");
        return ((Object)StringsKt.padStart((CharSequence)$this$padStart, length, padChar)).toString();
    }

    public static /* synthetic */ String replaceAfterLast$default(String string, char c, String string2, String string3, int n, Object object) {
        if ((n & 4) != 0) {
            string3 = string;
        }
        return StringsKt.replaceAfterLast(string, c, string2, string3);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public static final int lastIndexOf(@NotNull CharSequence $this$lastIndexOf, char c, int startIndex, boolean ignoreCase) {
        int n;
        Intrinsics.checkNotNullParameter($this$lastIndexOf, "<this>");
        if (!ignoreCase && $this$lastIndexOf instanceof String) {
            void var2_2;
            void var1_1;
            n = ((String)$this$lastIndexOf).lastIndexOf((int)var1_1, (int)var2_2);
            return n;
        }
        char[] cArray = new char[1];
        cArray[0] = c;
        n = StringsKt.lastIndexOfAny($this$lastIndexOf, cArray, startIndex, ignoreCase);
        return n;
    }

    @NotNull
    public static final List<String> lines(@NotNull CharSequence $this$lines) {
        Intrinsics.checkNotNullParameter($this$lines, "<this>");
        return SequencesKt.toList(StringsKt.lineSequence($this$lines));
    }

    static /* synthetic */ Sequence rangesDelimitedBy$StringsKt__StringsKt$default(CharSequence charSequence, String[] stringArray, int n, boolean bl, int n2, int n3, Object object) {
        if ((n3 & 2) != 0) {
            n = 0;
        }
        if ((n3 & 4) != 0) {
            bl = false;
        }
        if ((n3 & 8) != 0) {
            n2 = 0;
        }
        return StringsKt__StringsKt.rangesDelimitedBy$StringsKt__StringsKt(charSequence, stringArray, n, bl, n2);
    }

    @NotNull
    public static final CharSequence replaceRange(@NotNull CharSequence $this$replaceRange, @NotNull IntRange range, @NotNull CharSequence replacement) {
        Intrinsics.checkNotNullParameter($this$replaceRange, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        return StringsKt.replaceRange($this$replaceRange, (int)range.getStart(), (Integer)range.getEndInclusive() + 1, replacement);
    }

    @NotNull
    public static final String removeSurrounding(@NotNull String $this$removeSurrounding, @NotNull CharSequence delimiter) {
        Intrinsics.checkNotNullParameter($this$removeSurrounding, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        return StringsKt.removeSurrounding($this$removeSurrounding, delimiter, delimiter);
    }

    /*
     * WARNING - void declaration
     */
    public static final boolean contentEqualsIgnoreCaseImpl(@Nullable CharSequence $this$contentEqualsIgnoreCaseImpl, @Nullable CharSequence other) {
        block8: {
            block7: {
                if ($this$contentEqualsIgnoreCaseImpl instanceof String && other instanceof String) {
                    return StringsKt.equals((String)$this$contentEqualsIgnoreCaseImpl, (String)other, true);
                }
                if ($this$contentEqualsIgnoreCaseImpl == other) {
                    return true;
                }
                if ($this$contentEqualsIgnoreCaseImpl == null || other == null) break block7;
                if ($this$contentEqualsIgnoreCaseImpl.length() == other.length()) break block8;
            }
            return false;
        }
        int i = 0;
        int n = $this$contentEqualsIgnoreCaseImpl.length();
        while (i < n) {
            void var2_2;
            if (!CharsKt.equals($this$contentEqualsIgnoreCaseImpl.charAt(i), other.charAt(i), true)) {
                return false;
            }
            ++var2_2;
        }
        return true;
    }

    @InlineOnly
    private static final boolean isNotEmpty(CharSequence $this$isNotEmpty) {
        Intrinsics.checkNotNullParameter($this$isNotEmpty, "<this>");
        return $this$isNotEmpty.length() > 0;
    }

    public static /* synthetic */ int indexOf$default(CharSequence charSequence, char c, int n, boolean bl, int n2, Object object) {
        if ((n2 & 2) != 0) {
            n = 0;
        }
        if ((n2 & 4) != 0) {
            bl = false;
        }
        return StringsKt.indexOf(charSequence, c, n, bl);
    }

    @NotNull
    public static final String padEnd(@NotNull String $this$padEnd, int length, char padChar) {
        Intrinsics.checkNotNullParameter($this$padEnd, "<this>");
        return ((Object)StringsKt.padEnd((CharSequence)$this$padEnd, length, padChar)).toString();
    }

    private static final Sequence<IntRange> rangesDelimitedBy$StringsKt__StringsKt(CharSequence $this$rangesDelimitedBy, char[] delimiters, int startIndex, boolean ignoreCase, int limit) {
        StringsKt.requireNonNegativeLimit(limit);
        return new DelimitedRangesSequence($this$rangesDelimitedBy, startIndex, limit, (Function2<? super CharSequence, ? super Integer, Pair<Integer, Integer>>)new Function2<CharSequence, Integer, Pair<? extends Integer, ? extends Integer>>(delimiters, ignoreCase){
            final /* synthetic */ boolean $ignoreCase;
            final /* synthetic */ char[] $delimiters;

            @Nullable
            public final Pair<Integer, Integer> invoke(@NotNull CharSequence $this$$receiver, int currentIndex) {
                Intrinsics.checkNotNullParameter($this$$receiver, "$this$$receiver");
                int n = StringsKt.indexOfAny($this$$receiver, this.$delimiters, currentIndex, this.$ignoreCase);
                int it = n;
                boolean bl = false;
                return it < 0 ? null : TuplesKt.to(it, 1);
            }
            {
                this.$delimiters = $delimiters;
                this.$ignoreCase = $ignoreCase;
                super(2);
            }
        });
    }

    @NotNull
    public static final String removeSurrounding(@NotNull String $this$removeSurrounding, @NotNull CharSequence prefix, @NotNull CharSequence suffix) {
        String string;
        Intrinsics.checkNotNullParameter($this$removeSurrounding, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        if ($this$removeSurrounding.length() >= prefix.length() + suffix.length()) {
            if (StringsKt.startsWith$default((CharSequence)$this$removeSurrounding, prefix, false, 2, null)) {
                if (StringsKt.endsWith$default((CharSequence)$this$removeSurrounding, suffix, false, 2, null)) {
                    String string2 = $this$removeSurrounding;
                    int n = prefix.length();
                    int n2 = $this$removeSurrounding.length() - suffix.length();
                    String string3 = string2.substring(n, n2);
                    Intrinsics.checkNotNullExpressionValue(string3, "substring(...)");
                    return string3;
                }
            }
        }
        return string;
    }
}

