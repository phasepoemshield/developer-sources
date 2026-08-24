/*
 * Decompiled with CFR 0.152.
 */
package kotlin.ranges;

import java.util.NoSuchElementException;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.random.RandomKt;
import kotlin.ranges.CharProgression;
import kotlin.ranges.CharRange;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.ClosedRange;
import kotlin.ranges.IntProgression;
import kotlin.ranges.IntRange;
import kotlin.ranges.LongProgression;
import kotlin.ranges.LongRange;
import kotlin.ranges.OpenEndRange;
import kotlin.ranges.RangesKt;
import kotlin.ranges.RangesKt__RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=5, xi=49, d1={"\u0000\u0088\u0001\n\u0002\u0010\u000f\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\n\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b9\u001a)\u0010\u0003\u001a\u00028\u0000\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\u00028\u00002\u0006\u0010\u0002\u001a\u00028\u0000\u00a2\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0003\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0003\u0010\u0006\u001a\u0019\u0010\u0003\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u0007\u00a2\u0006\u0004\b\u0003\u0010\b\u001a\u0019\u0010\u0003\u001a\u00020\t*\u00020\t2\u0006\u0010\u0002\u001a\u00020\t\u00a2\u0006\u0004\b\u0003\u0010\n\u001a\u0019\u0010\u0003\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u000b\u00a2\u0006\u0004\b\u0003\u0010\f\u001a\u0019\u0010\u0003\u001a\u00020\r*\u00020\r2\u0006\u0010\u0002\u001a\u00020\r\u00a2\u0006\u0004\b\u0003\u0010\u000e\u001a\u0019\u0010\u0003\u001a\u00020\u000f*\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u000f\u00a2\u0006\u0004\b\u0003\u0010\u0010\u001a)\u0010\u0012\u001a\u00028\u0000\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u0000\u00a2\u0006\u0004\b\u0012\u0010\u0004\u001a\u0019\u0010\u0012\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0012\u0010\u0006\u001a\u0019\u0010\u0012\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0007\u00a2\u0006\u0004\b\u0012\u0010\b\u001a\u0019\u0010\u0012\u001a\u00020\t*\u00020\t2\u0006\u0010\u0011\u001a\u00020\t\u00a2\u0006\u0004\b\u0012\u0010\n\u001a\u0019\u0010\u0012\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000b\u00a2\u0006\u0004\b\u0012\u0010\f\u001a\u0019\u0010\u0012\u001a\u00020\r*\u00020\r2\u0006\u0010\u0011\u001a\u00020\r\u00a2\u0006\u0004\b\u0012\u0010\u000e\u001a\u0019\u0010\u0012\u001a\u00020\u000f*\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f\u00a2\u0006\u0004\b\u0012\u0010\u0010\u001a5\u0010\u0013\u001a\u00028\u0000\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\u00028\u00002\b\u0010\u0002\u001a\u0004\u0018\u00018\u00002\b\u0010\u0011\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\u0004\b\u0013\u0010\u0014\u001a1\u0010\u0013\u001a\u00028\u0000\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\u00028\u00002\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0007\u00a2\u0006\u0004\b\u0013\u0010\u0017\u001a/\u0010\u0013\u001a\u00028\u0000\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\u00028\u00002\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018\u00a2\u0006\u0004\b\u0013\u0010\u0019\u001a!\u0010\u0013\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0013\u0010\u001a\u001a!\u0010\u0013\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0007\u00a2\u0006\u0004\b\u0013\u0010\u001b\u001a!\u0010\u0013\u001a\u00020\t*\u00020\t2\u0006\u0010\u0002\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\t\u00a2\u0006\u0004\b\u0013\u0010\u001c\u001a!\u0010\u0013\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000b\u00a2\u0006\u0004\b\u0013\u0010\u001d\u001a\u001f\u0010\u0013\u001a\u00020\u000b*\u00020\u000b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0018\u00a2\u0006\u0004\b\u0013\u0010\u001e\u001a!\u0010\u0013\u001a\u00020\r*\u00020\r2\u0006\u0010\u0002\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\r\u00a2\u0006\u0004\b\u0013\u0010\u001f\u001a\u001f\u0010\u0013\u001a\u00020\r*\u00020\r2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\u0018\u00a2\u0006\u0004\b\u0013\u0010 \u001a!\u0010\u0013\u001a\u00020\u000f*\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f\u00a2\u0006\u0004\b\u0013\u0010!\u001a\u001e\u0010&\u001a\u00020%*\u00020\"2\b\u0010$\u001a\u0004\u0018\u00010#H\u0087\n\u00a2\u0006\u0004\b&\u0010'\u001a\"\u0010&\u001a\u00020%*\b\u0012\u0004\u0012\u00020\u00050\u00182\u0006\u0010(\u001a\u00020\u0007H\u0087\u0002\u00a2\u0006\u0004\b)\u0010*\u001a\"\u0010&\u001a\u00020%*\b\u0012\u0004\u0012\u00020\u00050\u00182\u0006\u0010(\u001a\u00020\tH\u0087\u0002\u00a2\u0006\u0004\b)\u0010+\u001a\"\u0010&\u001a\u00020%*\b\u0012\u0004\u0012\u00020\u00050\u00182\u0006\u0010(\u001a\u00020\u000bH\u0087\u0002\u00a2\u0006\u0004\b)\u0010,\u001a\"\u0010&\u001a\u00020%*\b\u0012\u0004\u0012\u00020\u00050\u00182\u0006\u0010(\u001a\u00020\rH\u0087\u0002\u00a2\u0006\u0004\b)\u0010-\u001a\"\u0010&\u001a\u00020%*\b\u0012\u0004\u0012\u00020\u00050\u00182\u0006\u0010(\u001a\u00020\u000fH\u0087\u0002\u00a2\u0006\u0004\b)\u0010.\u001a\"\u0010&\u001a\u00020%*\b\u0012\u0004\u0012\u00020\u00070\u00182\u0006\u0010(\u001a\u00020\u0005H\u0087\u0002\u00a2\u0006\u0004\b/\u00100\u001a\"\u0010&\u001a\u00020%*\b\u0012\u0004\u0012\u00020\u00070\u00182\u0006\u0010(\u001a\u00020\tH\u0087\u0002\u00a2\u0006\u0004\b/\u0010+\u001a\"\u0010&\u001a\u00020%*\b\u0012\u0004\u0012\u00020\u00070\u00182\u0006\u0010(\u001a\u00020\u000bH\u0087\u0002\u00a2\u0006\u0004\b/\u0010,\u001a\"\u0010&\u001a\u00020%*\b\u0012\u0004\u0012\u00020\u00070\u00182\u0006\u0010(\u001a\u00020\rH\u0087\u0002\u00a2\u0006\u0004\b/\u0010-\u001a\"\u0010&\u001a\u00020%*\b\u0012\u0004\u0012\u00020\u00070\u00182\u0006\u0010(\u001a\u00020\u000fH\u0087\u0002\u00a2\u0006\u0004\b/\u0010.\u001a\"\u0010&\u001a\u00020%*\b\u0012\u0004\u0012\u00020\t0\u00182\u0006\u0010(\u001a\u00020\u0005H\u0087\u0002\u00a2\u0006\u0004\b1\u00100\u001a\"\u0010&\u001a\u00020%*\b\u0012\u0004\u0012\u00020\t0\u00182\u0006\u0010(\u001a\u00020\u0007H\u0087\u0002\u00a2\u0006\u0004\b1\u0010*\u001a\"\u0010&\u001a\u00020%*\b\u0012\u0004\u0012\u00020\t0\u00182\u0006\u0010(\u001a\u00020\u000bH\u0087\u0002\u00a2\u0006\u0004\b1\u0010,\u001a\"\u0010&\u001a\u00020%*\b\u0012\u0004\u0012\u00020\t0\u00182\u0006\u0010(\u001a\u00020\rH\u0087\u0002\u00a2\u0006\u0004\b1\u0010-\u001a\"\u0010&\u001a\u00020%*\b\u0012\u0004\u0012\u00020\t0\u00182\u0006\u0010(\u001a\u00020\u000fH\u0087\u0002\u00a2\u0006\u0004\b1\u0010.\u001a\"\u0010&\u001a\u00020%*\b\u0012\u0004\u0012\u00020\u000b0\u00182\u0006\u0010(\u001a\u00020\u0005H\u0087\u0002\u00a2\u0006\u0004\b2\u00100\u001a\"\u0010&\u001a\u00020%*\b\u0012\u0004\u0012\u00020\u000b0\u00182\u0006\u0010(\u001a\u00020\u0007H\u0087\u0002\u00a2\u0006\u0004\b2\u0010*\u001a\"\u0010&\u001a\u00020%*\b\u0012\u0004\u0012\u00020\u000b0\u00182\u0006\u0010(\u001a\u00020\tH\u0087\u0002\u00a2\u0006\u0004\b2\u0010+\u001a\"\u0010&\u001a\u00020%*\b\u0012\u0004\u0012\u00020\u000b0\u00182\u0006\u0010(\u001a\u00020\rH\u0087\u0002\u00a2\u0006\u0004\b2\u0010-\u001a\"\u0010&\u001a\u00020%*\b\u0012\u0004\u0012\u00020\u000b0\u00182\u0006\u0010(\u001a\u00020\u000fH\u0087\u0002\u00a2\u0006\u0004\b2\u0010.\u001a\"\u0010&\u001a\u00020%*\b\u0012\u0004\u0012\u00020\r0\u00182\u0006\u0010(\u001a\u00020\u0005H\u0087\u0002\u00a2\u0006\u0004\b3\u00100\u001a\"\u0010&\u001a\u00020%*\b\u0012\u0004\u0012\u00020\r0\u00182\u0006\u0010(\u001a\u00020\u0007H\u0087\u0002\u00a2\u0006\u0004\b3\u0010*\u001a\"\u0010&\u001a\u00020%*\b\u0012\u0004\u0012\u00020\r0\u00182\u0006\u0010(\u001a\u00020\tH\u0087\u0002\u00a2\u0006\u0004\b3\u0010+\u001a\"\u0010&\u001a\u00020%*\b\u0012\u0004\u0012\u00020\r0\u00182\u0006\u0010(\u001a\u00020\u000bH\u0087\u0002\u00a2\u0006\u0004\b3\u0010,\u001a\"\u0010&\u001a\u00020%*\b\u0012\u0004\u0012\u00020\r0\u00182\u0006\u0010(\u001a\u00020\u000fH\u0087\u0002\u00a2\u0006\u0004\b3\u0010.\u001a\"\u0010&\u001a\u00020%*\b\u0012\u0004\u0012\u00020\u000f0\u00182\u0006\u0010(\u001a\u00020\u0005H\u0087\u0002\u00a2\u0006\u0004\b4\u00100\u001a\"\u0010&\u001a\u00020%*\b\u0012\u0004\u0012\u00020\u000f0\u00182\u0006\u0010(\u001a\u00020\u0007H\u0087\u0002\u00a2\u0006\u0004\b4\u0010*\u001a\"\u0010&\u001a\u00020%*\b\u0012\u0004\u0012\u00020\u000f0\u00182\u0006\u0010(\u001a\u00020\tH\u0087\u0002\u00a2\u0006\u0004\b4\u0010+\u001a\"\u0010&\u001a\u00020%*\b\u0012\u0004\u0012\u00020\u000f0\u00182\u0006\u0010(\u001a\u00020\u000bH\u0087\u0002\u00a2\u0006\u0004\b4\u0010,\u001a\"\u0010&\u001a\u00020%*\b\u0012\u0004\u0012\u00020\u000f0\u00182\u0006\u0010(\u001a\u00020\rH\u0087\u0002\u00a2\u0006\u0004\b4\u0010-\u001a\u001c\u0010&\u001a\u00020%*\u0002052\u0006\u0010(\u001a\u00020\u0005H\u0087\n\u00a2\u0006\u0004\b&\u00106\u001a\u001e\u0010&\u001a\u00020%*\u0002052\b\u0010$\u001a\u0004\u0018\u00010\u000bH\u0087\n\u00a2\u0006\u0004\b&\u00107\u001a\u001c\u0010&\u001a\u00020%*\u0002052\u0006\u0010(\u001a\u00020\rH\u0087\n\u00a2\u0006\u0004\b&\u00108\u001a\u001c\u0010&\u001a\u00020%*\u0002052\u0006\u0010(\u001a\u00020\u000fH\u0087\n\u00a2\u0006\u0004\b&\u00109\u001a\u001c\u0010&\u001a\u00020%*\u00020:2\u0006\u0010(\u001a\u00020\u0005H\u0087\n\u00a2\u0006\u0004\b&\u0010;\u001a\u001c\u0010&\u001a\u00020%*\u00020:2\u0006\u0010(\u001a\u00020\u000bH\u0087\n\u00a2\u0006\u0004\b&\u0010<\u001a\u001e\u0010&\u001a\u00020%*\u00020:2\b\u0010$\u001a\u0004\u0018\u00010\rH\u0087\n\u00a2\u0006\u0004\b&\u0010=\u001a\u001c\u0010&\u001a\u00020%*\u00020:2\u0006\u0010(\u001a\u00020\u000fH\u0087\n\u00a2\u0006\u0004\b&\u0010>\u001a\"\u0010&\u001a\u00020%*\b\u0012\u0004\u0012\u00020\u00050?2\u0006\u0010(\u001a\u00020\u000bH\u0087\u0002\u00a2\u0006\u0004\b)\u0010@\u001a\"\u0010&\u001a\u00020%*\b\u0012\u0004\u0012\u00020\u00050?2\u0006\u0010(\u001a\u00020\rH\u0087\u0002\u00a2\u0006\u0004\b)\u0010A\u001a\"\u0010&\u001a\u00020%*\b\u0012\u0004\u0012\u00020\u00050?2\u0006\u0010(\u001a\u00020\u000fH\u0087\u0002\u00a2\u0006\u0004\b)\u0010B\u001a\"\u0010&\u001a\u00020%*\b\u0012\u0004\u0012\u00020\u00070?2\u0006\u0010(\u001a\u00020\tH\u0087\u0002\u00a2\u0006\u0004\b/\u0010C\u001a\"\u0010&\u001a\u00020%*\b\u0012\u0004\u0012\u00020\u000b0?2\u0006\u0010(\u001a\u00020\u0005H\u0087\u0002\u00a2\u0006\u0004\b2\u0010D\u001a\"\u0010&\u001a\u00020%*\b\u0012\u0004\u0012\u00020\u000b0?2\u0006\u0010(\u001a\u00020\rH\u0087\u0002\u00a2\u0006\u0004\b2\u0010A\u001a\"\u0010&\u001a\u00020%*\b\u0012\u0004\u0012\u00020\u000b0?2\u0006\u0010(\u001a\u00020\u000fH\u0087\u0002\u00a2\u0006\u0004\b2\u0010B\u001a\"\u0010&\u001a\u00020%*\b\u0012\u0004\u0012\u00020\r0?2\u0006\u0010(\u001a\u00020\u0005H\u0087\u0002\u00a2\u0006\u0004\b3\u0010D\u001a\"\u0010&\u001a\u00020%*\b\u0012\u0004\u0012\u00020\r0?2\u0006\u0010(\u001a\u00020\u000bH\u0087\u0002\u00a2\u0006\u0004\b3\u0010@\u001a\"\u0010&\u001a\u00020%*\b\u0012\u0004\u0012\u00020\r0?2\u0006\u0010(\u001a\u00020\u000fH\u0087\u0002\u00a2\u0006\u0004\b3\u0010B\u001a\"\u0010&\u001a\u00020%*\b\u0012\u0004\u0012\u00020\u000f0?2\u0006\u0010(\u001a\u00020\u0005H\u0087\u0002\u00a2\u0006\u0004\b4\u0010D\u001a\"\u0010&\u001a\u00020%*\b\u0012\u0004\u0012\u00020\u000f0?2\u0006\u0010(\u001a\u00020\u000bH\u0087\u0002\u00a2\u0006\u0004\b4\u0010@\u001a\"\u0010&\u001a\u00020%*\b\u0012\u0004\u0012\u00020\u000f0?2\u0006\u0010(\u001a\u00020\rH\u0087\u0002\u00a2\u0006\u0004\b4\u0010A\u001a\u001c\u0010G\u001a\u00020F*\u00020\u00052\u0006\u0010E\u001a\u00020\u0005H\u0086\u0004\u00a2\u0006\u0004\bG\u0010H\u001a\u001c\u0010G\u001a\u00020F*\u00020\u00052\u0006\u0010E\u001a\u00020\u000bH\u0086\u0004\u00a2\u0006\u0004\bG\u0010I\u001a\u001c\u0010G\u001a\u00020J*\u00020\u00052\u0006\u0010E\u001a\u00020\rH\u0086\u0004\u00a2\u0006\u0004\bG\u0010K\u001a\u001c\u0010G\u001a\u00020F*\u00020\u00052\u0006\u0010E\u001a\u00020\u000fH\u0086\u0004\u00a2\u0006\u0004\bG\u0010L\u001a\u001c\u0010G\u001a\u00020M*\u00020#2\u0006\u0010E\u001a\u00020#H\u0086\u0004\u00a2\u0006\u0004\bG\u0010N\u001a\u001c\u0010G\u001a\u00020F*\u00020\u000b2\u0006\u0010E\u001a\u00020\u0005H\u0086\u0004\u00a2\u0006\u0004\bG\u0010O\u001a\u001c\u0010G\u001a\u00020F*\u00020\u000b2\u0006\u0010E\u001a\u00020\u000bH\u0086\u0004\u00a2\u0006\u0004\bG\u0010P\u001a\u001c\u0010G\u001a\u00020J*\u00020\u000b2\u0006\u0010E\u001a\u00020\rH\u0086\u0004\u00a2\u0006\u0004\bG\u0010Q\u001a\u001c\u0010G\u001a\u00020F*\u00020\u000b2\u0006\u0010E\u001a\u00020\u000fH\u0086\u0004\u00a2\u0006\u0004\bG\u0010R\u001a\u001c\u0010G\u001a\u00020J*\u00020\r2\u0006\u0010E\u001a\u00020\u0005H\u0086\u0004\u00a2\u0006\u0004\bG\u0010S\u001a\u001c\u0010G\u001a\u00020J*\u00020\r2\u0006\u0010E\u001a\u00020\u000bH\u0086\u0004\u00a2\u0006\u0004\bG\u0010T\u001a\u001c\u0010G\u001a\u00020J*\u00020\r2\u0006\u0010E\u001a\u00020\rH\u0086\u0004\u00a2\u0006\u0004\bG\u0010U\u001a\u001c\u0010G\u001a\u00020J*\u00020\r2\u0006\u0010E\u001a\u00020\u000fH\u0086\u0004\u00a2\u0006\u0004\bG\u0010V\u001a\u001c\u0010G\u001a\u00020F*\u00020\u000f2\u0006\u0010E\u001a\u00020\u0005H\u0086\u0004\u00a2\u0006\u0004\bG\u0010W\u001a\u001c\u0010G\u001a\u00020F*\u00020\u000f2\u0006\u0010E\u001a\u00020\u000bH\u0086\u0004\u00a2\u0006\u0004\bG\u0010X\u001a\u001c\u0010G\u001a\u00020J*\u00020\u000f2\u0006\u0010E\u001a\u00020\rH\u0086\u0004\u00a2\u0006\u0004\bG\u0010Y\u001a\u001c\u0010G\u001a\u00020F*\u00020\u000f2\u0006\u0010E\u001a\u00020\u000fH\u0086\u0004\u00a2\u0006\u0004\bG\u0010Z\u001a\u0013\u0010[\u001a\u00020#*\u00020MH\u0007\u00a2\u0006\u0004\b[\u0010\\\u001a\u0013\u0010[\u001a\u00020\u000b*\u00020FH\u0007\u00a2\u0006\u0004\b[\u0010]\u001a\u0013\u0010[\u001a\u00020\r*\u00020JH\u0007\u00a2\u0006\u0004\b[\u0010^\u001a\u0015\u0010_\u001a\u0004\u0018\u00010#*\u00020MH\u0007\u00a2\u0006\u0004\b_\u0010`\u001a\u0015\u0010_\u001a\u0004\u0018\u00010\u000b*\u00020FH\u0007\u00a2\u0006\u0004\b_\u0010a\u001a\u0015\u0010_\u001a\u0004\u0018\u00010\r*\u00020JH\u0007\u00a2\u0006\u0004\b_\u0010b\u001a\u0013\u0010c\u001a\u00020#*\u00020MH\u0007\u00a2\u0006\u0004\bc\u0010\\\u001a\u0013\u0010c\u001a\u00020\u000b*\u00020FH\u0007\u00a2\u0006\u0004\bc\u0010]\u001a\u0013\u0010c\u001a\u00020\r*\u00020JH\u0007\u00a2\u0006\u0004\bc\u0010^\u001a\u0015\u0010d\u001a\u0004\u0018\u00010#*\u00020MH\u0007\u00a2\u0006\u0004\bd\u0010`\u001a\u0015\u0010d\u001a\u0004\u0018\u00010\u000b*\u00020FH\u0007\u00a2\u0006\u0004\bd\u0010a\u001a\u0015\u0010d\u001a\u0004\u0018\u00010\r*\u00020JH\u0007\u00a2\u0006\u0004\bd\u0010b\u001a\u0014\u0010e\u001a\u00020#*\u00020\"H\u0087\b\u00a2\u0006\u0004\be\u0010f\u001a\u001b\u0010e\u001a\u00020#*\u00020\"2\u0006\u0010e\u001a\u00020gH\u0007\u00a2\u0006\u0004\be\u0010h\u001a\u0014\u0010e\u001a\u00020\u000b*\u000205H\u0087\b\u00a2\u0006\u0004\be\u0010i\u001a\u001b\u0010e\u001a\u00020\u000b*\u0002052\u0006\u0010e\u001a\u00020gH\u0007\u00a2\u0006\u0004\be\u0010j\u001a\u0014\u0010e\u001a\u00020\r*\u00020:H\u0087\b\u00a2\u0006\u0004\be\u0010k\u001a\u001b\u0010e\u001a\u00020\r*\u00020:2\u0006\u0010e\u001a\u00020gH\u0007\u00a2\u0006\u0004\be\u0010l\u001a\u0016\u0010m\u001a\u0004\u0018\u00010#*\u00020\"H\u0087\b\u00a2\u0006\u0004\bm\u0010n\u001a\u001d\u0010m\u001a\u0004\u0018\u00010#*\u00020\"2\u0006\u0010e\u001a\u00020gH\u0007\u00a2\u0006\u0004\bm\u0010o\u001a\u0016\u0010m\u001a\u0004\u0018\u00010\u000b*\u000205H\u0087\b\u00a2\u0006\u0004\bm\u0010p\u001a\u001d\u0010m\u001a\u0004\u0018\u00010\u000b*\u0002052\u0006\u0010e\u001a\u00020gH\u0007\u00a2\u0006\u0004\bm\u0010q\u001a\u0016\u0010m\u001a\u0004\u0018\u00010\r*\u00020:H\u0087\b\u00a2\u0006\u0004\bm\u0010r\u001a\u001d\u0010m\u001a\u0004\u0018\u00010\r*\u00020:2\u0006\u0010e\u001a\u00020gH\u0007\u00a2\u0006\u0004\bm\u0010s\u001a\u0011\u0010t\u001a\u00020M*\u00020M\u00a2\u0006\u0004\bt\u0010u\u001a\u0011\u0010t\u001a\u00020F*\u00020F\u00a2\u0006\u0004\bt\u0010v\u001a\u0011\u0010t\u001a\u00020J*\u00020J\u00a2\u0006\u0004\bt\u0010w\u001a\u001c\u0010x\u001a\u00020M*\u00020M2\u0006\u0010x\u001a\u00020\u000bH\u0086\u0004\u00a2\u0006\u0004\bx\u0010y\u001a\u001c\u0010x\u001a\u00020F*\u00020F2\u0006\u0010x\u001a\u00020\u000bH\u0086\u0004\u00a2\u0006\u0004\bx\u0010z\u001a\u001c\u0010x\u001a\u00020J*\u00020J2\u0006\u0010x\u001a\u00020\rH\u0086\u0004\u00a2\u0006\u0004\bx\u0010{\u001a\u0015\u0010|\u001a\u0004\u0018\u00010\u0005*\u00020\u0007H\u0000\u00a2\u0006\u0004\b|\u0010}\u001a\u0015\u0010|\u001a\u0004\u0018\u00010\u0005*\u00020\tH\u0000\u00a2\u0006\u0004\b|\u0010~\u001a\u0015\u0010|\u001a\u0004\u0018\u00010\u0005*\u00020\u000bH\u0000\u00a2\u0006\u0004\b|\u0010\u007f\u001a\u0016\u0010|\u001a\u0004\u0018\u00010\u0005*\u00020\rH\u0000\u00a2\u0006\u0005\b|\u0010\u0080\u0001\u001a\u0016\u0010|\u001a\u0004\u0018\u00010\u0005*\u00020\u000fH\u0000\u00a2\u0006\u0005\b|\u0010\u0081\u0001\u001a\u0018\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u000b*\u00020\u0007H\u0000\u00a2\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001\u001a\u0018\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u000b*\u00020\tH\u0000\u00a2\u0006\u0006\b\u0082\u0001\u0010\u0084\u0001\u001a\u0018\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u000b*\u00020\rH\u0000\u00a2\u0006\u0006\b\u0082\u0001\u0010\u0085\u0001\u001a\u0018\u0010\u0086\u0001\u001a\u0004\u0018\u00010\r*\u00020\u0007H\u0000\u00a2\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001\u001a\u0018\u0010\u0086\u0001\u001a\u0004\u0018\u00010\r*\u00020\tH\u0000\u00a2\u0006\u0006\b\u0086\u0001\u0010\u0088\u0001\u001a\u0018\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u000f*\u00020\u0007H\u0000\u00a2\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001\u001a\u0018\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u000f*\u00020\tH\u0000\u00a2\u0006\u0006\b\u0089\u0001\u0010\u008b\u0001\u001a\u0018\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u000f*\u00020\u000bH\u0000\u00a2\u0006\u0006\b\u0089\u0001\u0010\u008c\u0001\u001a\u0018\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u000f*\u00020\rH\u0000\u00a2\u0006\u0006\b\u0089\u0001\u0010\u008d\u0001\u001a\u001f\u0010\u008e\u0001\u001a\u000205*\u00020\u00052\u0006\u0010E\u001a\u00020\u0005H\u0086\u0004\u00a2\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001\u001a\u001f\u0010\u008e\u0001\u001a\u000205*\u00020\u00052\u0006\u0010E\u001a\u00020\u000bH\u0086\u0004\u00a2\u0006\u0006\b\u008e\u0001\u0010\u0090\u0001\u001a\u001f\u0010\u008e\u0001\u001a\u00020:*\u00020\u00052\u0006\u0010E\u001a\u00020\rH\u0086\u0004\u00a2\u0006\u0006\b\u008e\u0001\u0010\u0091\u0001\u001a\u001f\u0010\u008e\u0001\u001a\u000205*\u00020\u00052\u0006\u0010E\u001a\u00020\u000fH\u0086\u0004\u00a2\u0006\u0006\b\u008e\u0001\u0010\u0092\u0001\u001a\u001f\u0010\u008e\u0001\u001a\u00020\"*\u00020#2\u0006\u0010E\u001a\u00020#H\u0086\u0004\u00a2\u0006\u0006\b\u008e\u0001\u0010\u0093\u0001\u001a\u001f\u0010\u008e\u0001\u001a\u000205*\u00020\u000b2\u0006\u0010E\u001a\u00020\u0005H\u0086\u0004\u00a2\u0006\u0006\b\u008e\u0001\u0010\u0094\u0001\u001a\u001f\u0010\u008e\u0001\u001a\u000205*\u00020\u000b2\u0006\u0010E\u001a\u00020\u000bH\u0086\u0004\u00a2\u0006\u0006\b\u008e\u0001\u0010\u0095\u0001\u001a\u001f\u0010\u008e\u0001\u001a\u00020:*\u00020\u000b2\u0006\u0010E\u001a\u00020\rH\u0086\u0004\u00a2\u0006\u0006\b\u008e\u0001\u0010\u0096\u0001\u001a\u001f\u0010\u008e\u0001\u001a\u000205*\u00020\u000b2\u0006\u0010E\u001a\u00020\u000fH\u0086\u0004\u00a2\u0006\u0006\b\u008e\u0001\u0010\u0097\u0001\u001a\u001f\u0010\u008e\u0001\u001a\u00020:*\u00020\r2\u0006\u0010E\u001a\u00020\u0005H\u0086\u0004\u00a2\u0006\u0006\b\u008e\u0001\u0010\u0098\u0001\u001a\u001f\u0010\u008e\u0001\u001a\u00020:*\u00020\r2\u0006\u0010E\u001a\u00020\u000bH\u0086\u0004\u00a2\u0006\u0006\b\u008e\u0001\u0010\u0099\u0001\u001a\u001f\u0010\u008e\u0001\u001a\u00020:*\u00020\r2\u0006\u0010E\u001a\u00020\rH\u0086\u0004\u00a2\u0006\u0006\b\u008e\u0001\u0010\u009a\u0001\u001a\u001f\u0010\u008e\u0001\u001a\u00020:*\u00020\r2\u0006\u0010E\u001a\u00020\u000fH\u0086\u0004\u00a2\u0006\u0006\b\u008e\u0001\u0010\u009b\u0001\u001a\u001f\u0010\u008e\u0001\u001a\u000205*\u00020\u000f2\u0006\u0010E\u001a\u00020\u0005H\u0086\u0004\u00a2\u0006\u0006\b\u008e\u0001\u0010\u009c\u0001\u001a\u001f\u0010\u008e\u0001\u001a\u000205*\u00020\u000f2\u0006\u0010E\u001a\u00020\u000bH\u0086\u0004\u00a2\u0006\u0006\b\u008e\u0001\u0010\u009d\u0001\u001a\u001f\u0010\u008e\u0001\u001a\u00020:*\u00020\u000f2\u0006\u0010E\u001a\u00020\rH\u0086\u0004\u00a2\u0006\u0006\b\u008e\u0001\u0010\u009e\u0001\u001a\u001f\u0010\u008e\u0001\u001a\u000205*\u00020\u000f2\u0006\u0010E\u001a\u00020\u000fH\u0086\u0004\u00a2\u0006\u0006\b\u008e\u0001\u0010\u009f\u0001\u00a8\u0006\u00a0\u0001"}, d2={"", "T", "minimumValue", "coerceAtLeast", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;", "", "(BB)B", "", "(DD)D", "", "(FF)F", "", "(II)I", "", "(JJ)J", "", "(SS)S", "maximumValue", "coerceAtMost", "coerceIn", "(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;", "Lkotlin/ranges/ClosedFloatingPointRange;", "range", "(Ljava/lang/Comparable;Lkotlin/ranges/ClosedFloatingPointRange;)Ljava/lang/Comparable;", "Lkotlin/ranges/ClosedRange;", "(Ljava/lang/Comparable;Lkotlin/ranges/ClosedRange;)Ljava/lang/Comparable;", "(BBB)B", "(DDD)D", "(FFF)F", "(III)I", "(ILkotlin/ranges/ClosedRange;)I", "(JJJ)J", "(JLkotlin/ranges/ClosedRange;)J", "(SSS)S", "Lkotlin/ranges/CharRange;", "", "element", "", "contains", "(Lkotlin/ranges/CharRange;Ljava/lang/Character;)Z", "value", "byteRangeContains", "(Lkotlin/ranges/ClosedRange;D)Z", "(Lkotlin/ranges/ClosedRange;F)Z", "(Lkotlin/ranges/ClosedRange;I)Z", "(Lkotlin/ranges/ClosedRange;J)Z", "(Lkotlin/ranges/ClosedRange;S)Z", "doubleRangeContains", "(Lkotlin/ranges/ClosedRange;B)Z", "floatRangeContains", "intRangeContains", "longRangeContains", "shortRangeContains", "Lkotlin/ranges/IntRange;", "(Lkotlin/ranges/IntRange;B)Z", "(Lkotlin/ranges/IntRange;Ljava/lang/Integer;)Z", "(Lkotlin/ranges/IntRange;J)Z", "(Lkotlin/ranges/IntRange;S)Z", "Lkotlin/ranges/LongRange;", "(Lkotlin/ranges/LongRange;B)Z", "(Lkotlin/ranges/LongRange;I)Z", "(Lkotlin/ranges/LongRange;Ljava/lang/Long;)Z", "(Lkotlin/ranges/LongRange;S)Z", "Lkotlin/ranges/OpenEndRange;", "(Lkotlin/ranges/OpenEndRange;I)Z", "(Lkotlin/ranges/OpenEndRange;J)Z", "(Lkotlin/ranges/OpenEndRange;S)Z", "(Lkotlin/ranges/OpenEndRange;F)Z", "(Lkotlin/ranges/OpenEndRange;B)Z", "to", "Lkotlin/ranges/IntProgression;", "downTo", "(BB)Lkotlin/ranges/IntProgression;", "(BI)Lkotlin/ranges/IntProgression;", "Lkotlin/ranges/LongProgression;", "(BJ)Lkotlin/ranges/LongProgression;", "(BS)Lkotlin/ranges/IntProgression;", "Lkotlin/ranges/CharProgression;", "(CC)Lkotlin/ranges/CharProgression;", "(IB)Lkotlin/ranges/IntProgression;", "(II)Lkotlin/ranges/IntProgression;", "(IJ)Lkotlin/ranges/LongProgression;", "(IS)Lkotlin/ranges/IntProgression;", "(JB)Lkotlin/ranges/LongProgression;", "(JI)Lkotlin/ranges/LongProgression;", "(JJ)Lkotlin/ranges/LongProgression;", "(JS)Lkotlin/ranges/LongProgression;", "(SB)Lkotlin/ranges/IntProgression;", "(SI)Lkotlin/ranges/IntProgression;", "(SJ)Lkotlin/ranges/LongProgression;", "(SS)Lkotlin/ranges/IntProgression;", "first", "(Lkotlin/ranges/CharProgression;)C", "(Lkotlin/ranges/IntProgression;)I", "(Lkotlin/ranges/LongProgression;)J", "firstOrNull", "(Lkotlin/ranges/CharProgression;)Ljava/lang/Character;", "(Lkotlin/ranges/IntProgression;)Ljava/lang/Integer;", "(Lkotlin/ranges/LongProgression;)Ljava/lang/Long;", "last", "lastOrNull", "random", "(Lkotlin/ranges/CharRange;)C", "Lkotlin/random/Random;", "(Lkotlin/ranges/CharRange;Lkotlin/random/Random;)C", "(Lkotlin/ranges/IntRange;)I", "(Lkotlin/ranges/IntRange;Lkotlin/random/Random;)I", "(Lkotlin/ranges/LongRange;)J", "(Lkotlin/ranges/LongRange;Lkotlin/random/Random;)J", "randomOrNull", "(Lkotlin/ranges/CharRange;)Ljava/lang/Character;", "(Lkotlin/ranges/CharRange;Lkotlin/random/Random;)Ljava/lang/Character;", "(Lkotlin/ranges/IntRange;)Ljava/lang/Integer;", "(Lkotlin/ranges/IntRange;Lkotlin/random/Random;)Ljava/lang/Integer;", "(Lkotlin/ranges/LongRange;)Ljava/lang/Long;", "(Lkotlin/ranges/LongRange;Lkotlin/random/Random;)Ljava/lang/Long;", "reversed", "(Lkotlin/ranges/CharProgression;)Lkotlin/ranges/CharProgression;", "(Lkotlin/ranges/IntProgression;)Lkotlin/ranges/IntProgression;", "(Lkotlin/ranges/LongProgression;)Lkotlin/ranges/LongProgression;", "step", "(Lkotlin/ranges/CharProgression;I)Lkotlin/ranges/CharProgression;", "(Lkotlin/ranges/IntProgression;I)Lkotlin/ranges/IntProgression;", "(Lkotlin/ranges/LongProgression;J)Lkotlin/ranges/LongProgression;", "toByteExactOrNull", "(D)Ljava/lang/Byte;", "(F)Ljava/lang/Byte;", "(I)Ljava/lang/Byte;", "(J)Ljava/lang/Byte;", "(S)Ljava/lang/Byte;", "toIntExactOrNull", "(D)Ljava/lang/Integer;", "(F)Ljava/lang/Integer;", "(J)Ljava/lang/Integer;", "toLongExactOrNull", "(D)Ljava/lang/Long;", "(F)Ljava/lang/Long;", "toShortExactOrNull", "(D)Ljava/lang/Short;", "(F)Ljava/lang/Short;", "(I)Ljava/lang/Short;", "(J)Ljava/lang/Short;", "until", "(BB)Lkotlin/ranges/IntRange;", "(BI)Lkotlin/ranges/IntRange;", "(BJ)Lkotlin/ranges/LongRange;", "(BS)Lkotlin/ranges/IntRange;", "(CC)Lkotlin/ranges/CharRange;", "(IB)Lkotlin/ranges/IntRange;", "(II)Lkotlin/ranges/IntRange;", "(IJ)Lkotlin/ranges/LongRange;", "(IS)Lkotlin/ranges/IntRange;", "(JB)Lkotlin/ranges/LongRange;", "(JI)Lkotlin/ranges/LongRange;", "(JJ)Lkotlin/ranges/LongRange;", "(JS)Lkotlin/ranges/LongRange;", "(SB)Lkotlin/ranges/IntRange;", "(SI)Lkotlin/ranges/IntRange;", "(SJ)Lkotlin/ranges/LongRange;", "(SS)Lkotlin/ranges/IntRange;", "kotlin-stdlib"}, xs="kotlin/ranges/RangesKt")
class RangesKt___RangesKt
extends RangesKt__RangesKt {
    @Nullable
    public static final Short toShortExactOrNull(float $this$toShortExactOrNull) {
        return (-32768.0f <= $this$toShortExactOrNull ? $this$toShortExactOrNull <= 32767.0f : false) ? Short.valueOf((short)$this$toShortExactOrNull) : null;
    }

    @SinceKotlin(version="1.9")
    @JvmName(name="byteRangeContains")
    @WasExperimental(markerClass={ExperimentalStdlibApi.class})
    public static final boolean byteRangeContains(@NotNull OpenEndRange<Byte> $this$contains, short value) {
        Intrinsics.checkNotNullParameter($this$contains, "<this>");
        Byte by = RangesKt.toByteExactOrNull(value);
        Byte it = by;
        boolean bl = false;
        Byte by2 = it;
        return by2 != null ? $this$contains.contains((Byte)((Comparable)by2)) : false;
    }

    @Deprecated(message="This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(warningSince="1.3", errorSince="1.4", hiddenSince="1.5")
    @JvmName(name="intRangeContains")
    public static final /* synthetic */ boolean intRangeContains(ClosedRange $this$contains, double value) {
        Intrinsics.checkNotNullParameter($this$contains, "<this>");
        Integer n = RangesKt.toIntExactOrNull(value);
        Integer it = n;
        boolean bl = false;
        Integer n2 = it;
        return n2 != null ? $this$contains.contains((Comparable)n2) : false;
    }

    @DeprecatedSinceKotlin(warningSince="1.3", errorSince="1.4", hiddenSince="1.5")
    @Deprecated(message="This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @JvmName(name="floatRangeContains")
    public static final /* synthetic */ boolean floatRangeContains(ClosedRange $this$contains, short value) {
        Intrinsics.checkNotNullParameter($this$contains, "<this>");
        return $this$contains.contains((Comparable)Float.valueOf(value));
    }

    @SinceKotlin(version="1.9")
    @JvmName(name="shortRangeContains")
    @WasExperimental(markerClass={ExperimentalStdlibApi.class})
    public static final boolean shortRangeContains(@NotNull OpenEndRange<Short> $this$contains, int value) {
        Intrinsics.checkNotNullParameter($this$contains, "<this>");
        Short s = RangesKt.toShortExactOrNull(value);
        Short it = s;
        boolean bl = false;
        Short s2 = it;
        return s2 != null ? $this$contains.contains((Short)((Comparable)s2)) : false;
    }

    @NotNull
    public static final IntProgression downTo(byte $this$downTo, byte to) {
        return IntProgression.Companion.fromClosedRange($this$downTo, to, -1);
    }

    @SinceKotlin(version="1.9")
    @WasExperimental(markerClass={ExperimentalStdlibApi.class})
    @JvmName(name="byteRangeContains")
    public static final boolean byteRangeContains(@NotNull OpenEndRange<Byte> $this$contains, long value) {
        Intrinsics.checkNotNullParameter($this$contains, "<this>");
        Byte by = RangesKt.toByteExactOrNull(value);
        Byte it = by;
        boolean bl = false;
        Byte by2 = it;
        return by2 != null ? $this$contains.contains((Byte)((Comparable)by2)) : false;
    }

    @NotNull
    public static final LongRange until(byte $this$until, long to) {
        if (to <= Long.MIN_VALUE) {
            return LongRange.Companion.getEMPTY();
        }
        return new LongRange($this$until, to - 1L);
    }

    @WasExperimental(markerClass={ExperimentalStdlibApi.class})
    @JvmName(name="doubleRangeContains")
    @SinceKotlin(version="1.9")
    public static final boolean doubleRangeContains(@NotNull OpenEndRange<Double> $this$contains, float value) {
        Intrinsics.checkNotNullParameter($this$contains, "<this>");
        return $this$contains.contains((Double)((Comparable)Double.valueOf(value)));
    }

    @SinceKotlin(version="1.7")
    public static final char first(@NotNull CharProgression $this$first) {
        Intrinsics.checkNotNullParameter($this$first, "<this>");
        if ($this$first.isEmpty()) {
            throw new NoSuchElementException("Progression " + $this$first + " is empty.");
        }
        return $this$first.getFirst();
    }

    @SinceKotlin(version="1.3")
    @InlineOnly
    private static final boolean contains(LongRange $this$contains, Long element) {
        Intrinsics.checkNotNullParameter($this$contains, "<this>");
        return element != null && $this$contains.contains(element);
    }

    @WasExperimental(markerClass={ExperimentalStdlibApi.class})
    @JvmName(name="intRangeContains")
    @SinceKotlin(version="1.9")
    public static final boolean intRangeContains(@NotNull OpenEndRange<Integer> $this$contains, byte value) {
        Intrinsics.checkNotNullParameter($this$contains, "<this>");
        return $this$contains.contains((Integer)((Comparable)Integer.valueOf(value)));
    }

    @NotNull
    public static final IntProgression downTo(int $this$downTo, int to) {
        return IntProgression.Companion.fromClosedRange($this$downTo, to, -1);
    }

    @JvmName(name="longRangeContains")
    public static final boolean longRangeContains(@NotNull ClosedRange<Long> $this$contains, int value) {
        Intrinsics.checkNotNullParameter($this$contains, "<this>");
        return $this$contains.contains((Long)((Comparable)Long.valueOf(value)));
    }

    @NotNull
    public static final LongProgression downTo(long $this$downTo, int to) {
        return LongProgression.Companion.fromClosedRange($this$downTo, to, -1L);
    }

    @InlineOnly
    @SinceKotlin(version="1.3")
    private static final int random(IntRange $this$random) {
        Intrinsics.checkNotNullParameter($this$random, "<this>");
        return RangesKt.random($this$random, (Random)Random.Default);
    }

    public static final float coerceIn(float $this$coerceIn, float minimumValue, float maximumValue) {
        if (minimumValue > maximumValue) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + maximumValue + " is less than minimum " + minimumValue + '.');
        }
        if ($this$coerceIn < minimumValue) {
            return minimumValue;
        }
        if ($this$coerceIn > maximumValue) {
            return maximumValue;
        }
        return $this$coerceIn;
    }

    @NotNull
    public static final CharRange until(char $this$until, char to) {
        if (Intrinsics.compare(to, 0) <= 0) {
            return CharRange.Companion.getEMPTY();
        }
        return new CharRange($this$until, (char)(to + -1));
    }

    @NotNull
    public static final IntProgression step(@NotNull IntProgression $this$step, int step) {
        Intrinsics.checkNotNullParameter($this$step, "<this>");
        RangesKt.checkStepIsPositive(step > 0, step);
        return IntProgression.Companion.fromClosedRange($this$step.getFirst(), $this$step.getLast(), $this$step.getStep() > 0 ? step : -step);
    }

    @JvmName(name="shortRangeContains")
    @SinceKotlin(version="1.9")
    @WasExperimental(markerClass={ExperimentalStdlibApi.class})
    public static final boolean shortRangeContains(@NotNull OpenEndRange<Short> $this$contains, byte value) {
        Intrinsics.checkNotNullParameter($this$contains, "<this>");
        return $this$contains.contains((Short)((Comparable)Short.valueOf(value)));
    }

    @DeprecatedSinceKotlin(warningSince="1.3", errorSince="1.4", hiddenSince="1.5")
    @Deprecated(message="This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @JvmName(name="doubleRangeContains")
    public static final /* synthetic */ boolean doubleRangeContains(ClosedRange $this$contains, int value) {
        Intrinsics.checkNotNullParameter($this$contains, "<this>");
        return $this$contains.contains((Comparable)Double.valueOf(value));
    }

    @InlineOnly
    private static final boolean contains(IntRange $this$contains, short value) {
        Intrinsics.checkNotNullParameter($this$contains, "<this>");
        return RangesKt.intRangeContains((ClosedRange<Integer>)$this$contains, value);
    }

    @DeprecatedSinceKotlin(warningSince="1.3", errorSince="1.4", hiddenSince="1.5")
    @Deprecated(message="This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @JvmName(name="doubleRangeContains")
    public static final /* synthetic */ boolean doubleRangeContains(ClosedRange $this$contains, byte value) {
        Intrinsics.checkNotNullParameter($this$contains, "<this>");
        return $this$contains.contains((Comparable)Double.valueOf(value));
    }

    @NotNull
    public static final <T extends Comparable<? super T>> T coerceAtMost(@NotNull T $this$coerceAtMost, @NotNull T maximumValue) {
        Intrinsics.checkNotNullParameter($this$coerceAtMost, "<this>");
        Intrinsics.checkNotNullParameter(maximumValue, "maximumValue");
        return $this$coerceAtMost.compareTo(maximumValue) > 0 ? maximumValue : $this$coerceAtMost;
    }

    @SinceKotlin(version="1.4")
    @InlineOnly
    @WasExperimental(markerClass={ExperimentalStdlibApi.class})
    private static final Long randomOrNull(LongRange $this$randomOrNull) {
        Intrinsics.checkNotNullParameter($this$randomOrNull, "<this>");
        return RangesKt.randomOrNull($this$randomOrNull, (Random)Random.Default);
    }

    @DeprecatedSinceKotlin(warningSince="1.3", errorSince="1.4", hiddenSince="1.5")
    @Deprecated(message="This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @JvmName(name="doubleRangeContains")
    public static final /* synthetic */ boolean doubleRangeContains(ClosedRange $this$contains, long value) {
        Intrinsics.checkNotNullParameter($this$contains, "<this>");
        return $this$contains.contains((Comparable)Double.valueOf(value));
    }

    @SinceKotlin(version="1.7")
    public static final int last(@NotNull IntProgression $this$last) {
        Intrinsics.checkNotNullParameter($this$last, "<this>");
        if ($this$last.isEmpty()) {
            throw new NoSuchElementException("Progression " + $this$last + " is empty.");
        }
        return $this$last.getLast();
    }

    @Nullable
    @SinceKotlin(version="1.4")
    @WasExperimental(markerClass={ExperimentalStdlibApi.class})
    public static final Character randomOrNull(@NotNull CharRange $this$randomOrNull, @NotNull Random random) {
        Intrinsics.checkNotNullParameter($this$randomOrNull, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if ($this$randomOrNull.isEmpty()) {
            return null;
        }
        return Character.valueOf((char)random.nextInt($this$randomOrNull.getFirst(), $this$randomOrNull.getLast() + '\u0001'));
    }

    @Nullable
    public static final Byte toByteExactOrNull(long $this$toByteExactOrNull) {
        return new LongRange(-128L, 127L).contains($this$toByteExactOrNull) ? Byte.valueOf((byte)$this$toByteExactOrNull) : null;
    }

    @SinceKotlin(version="1.9")
    @JvmName(name="longRangeContains")
    @WasExperimental(markerClass={ExperimentalStdlibApi.class})
    public static final boolean longRangeContains(@NotNull OpenEndRange<Long> $this$contains, byte value) {
        Intrinsics.checkNotNullParameter($this$contains, "<this>");
        return $this$contains.contains((Long)((Comparable)Long.valueOf(value)));
    }

    @NotNull
    public static final IntRange until(int $this$until, byte to) {
        return new IntRange($this$until, to + -1);
    }

    @JvmName(name="longRangeContains")
    public static final boolean longRangeContains(@NotNull ClosedRange<Long> $this$contains, byte value) {
        Intrinsics.checkNotNullParameter($this$contains, "<this>");
        return $this$contains.contains((Long)((Comparable)Long.valueOf(value)));
    }

    @JvmName(name="shortRangeContains")
    public static final boolean shortRangeContains(@NotNull ClosedRange<Short> $this$contains, byte value) {
        Intrinsics.checkNotNullParameter($this$contains, "<this>");
        return $this$contains.contains((Short)((Comparable)Short.valueOf(value)));
    }

    @NotNull
    public static final <T extends Comparable<? super T>> T coerceIn(@NotNull T $this$coerceIn, @NotNull ClosedRange<T> range) {
        Intrinsics.checkNotNullParameter($this$coerceIn, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        if (range instanceof ClosedFloatingPointRange) {
            return RangesKt.coerceIn($this$coerceIn, (ClosedFloatingPointRange)range);
        }
        if (range.isEmpty()) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
        }
        return (T)($this$coerceIn.compareTo(range.getStart()) < 0 ? range.getStart() : ($this$coerceIn.compareTo(range.getEndInclusive()) > 0 ? range.getEndInclusive() : $this$coerceIn));
    }

    @JvmName(name="byteRangeContains")
    public static final boolean byteRangeContains(@NotNull ClosedRange<Byte> $this$contains, long value) {
        Intrinsics.checkNotNullParameter($this$contains, "<this>");
        Byte by = RangesKt.toByteExactOrNull(value);
        Byte it = by;
        boolean bl = false;
        Byte by2 = it;
        return by2 != null ? $this$contains.contains((Byte)((Comparable)by2)) : false;
    }

    public static final long coerceAtLeast(long $this$coerceAtLeast, long minimumValue) {
        return $this$coerceAtLeast < minimumValue ? minimumValue : $this$coerceAtLeast;
    }

    @NotNull
    public static final LongRange until(long $this$until, byte to) {
        return new LongRange($this$until, (long)to - 1L);
    }

    @Nullable
    @SinceKotlin(version="1.7")
    public static final Character lastOrNull(@NotNull CharProgression $this$lastOrNull) {
        Intrinsics.checkNotNullParameter($this$lastOrNull, "<this>");
        return $this$lastOrNull.isEmpty() ? null : Character.valueOf($this$lastOrNull.getLast());
    }

    @NotNull
    public static final LongRange until(long $this$until, int to) {
        return new LongRange($this$until, (long)to - 1L);
    }

    public static final double coerceIn(double $this$coerceIn, double minimumValue, double maximumValue) {
        if (minimumValue > maximumValue) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + maximumValue + " is less than minimum " + minimumValue + '.');
        }
        if ($this$coerceIn < minimumValue) {
            return minimumValue;
        }
        if ($this$coerceIn > maximumValue) {
            return maximumValue;
        }
        return $this$coerceIn;
    }

    @NotNull
    public static final IntRange until(int $this$until, int to) {
        if (to <= Integer.MIN_VALUE) {
            return IntRange.Companion.getEMPTY();
        }
        return new IntRange($this$until, to + -1);
    }

    @NotNull
    public static final IntProgression downTo(int $this$downTo, short to) {
        return IntProgression.Companion.fromClosedRange($this$downTo, to, -1);
    }

    @Nullable
    public static final Byte toByteExactOrNull(int $this$toByteExactOrNull) {
        return new IntRange(-128, 127).contains($this$toByteExactOrNull) ? Byte.valueOf((byte)$this$toByteExactOrNull) : null;
    }

    @NotNull
    public static final IntProgression reversed(@NotNull IntProgression $this$reversed) {
        Intrinsics.checkNotNullParameter($this$reversed, "<this>");
        return IntProgression.Companion.fromClosedRange($this$reversed.getLast(), $this$reversed.getFirst(), -$this$reversed.getStep());
    }

    @NotNull
    public static final IntRange until(short $this$until, short to) {
        return new IntRange($this$until, to + -1);
    }

    @SinceKotlin(version="1.3")
    public static final char random(@NotNull CharRange $this$random, @NotNull Random random) {
        Intrinsics.checkNotNullParameter($this$random, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        try {
            return (char)random.nextInt($this$random.getFirst(), $this$random.getLast() + '\u0001');
        }
        catch (IllegalArgumentException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    @Deprecated(message="This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(warningSince="1.3", errorSince="1.4", hiddenSince="1.5")
    @JvmName(name="shortRangeContains")
    public static final /* synthetic */ boolean shortRangeContains(ClosedRange $this$contains, float value) {
        Intrinsics.checkNotNullParameter($this$contains, "<this>");
        Short s = RangesKt.toShortExactOrNull(value);
        Short it = s;
        boolean bl = false;
        Short s2 = it;
        return s2 != null ? $this$contains.contains((Comparable)s2) : false;
    }

    public static final long coerceAtMost(long $this$coerceAtMost, long maximumValue) {
        return $this$coerceAtMost > maximumValue ? maximumValue : $this$coerceAtMost;
    }

    @WasExperimental(markerClass={ExperimentalStdlibApi.class})
    @JvmName(name="intRangeContains")
    @SinceKotlin(version="1.9")
    public static final boolean intRangeContains(@NotNull OpenEndRange<Integer> $this$contains, short value) {
        Intrinsics.checkNotNullParameter($this$contains, "<this>");
        return $this$contains.contains((Integer)((Comparable)Integer.valueOf(value)));
    }

    @NotNull
    public static final LongRange until(int $this$until, long to) {
        if (to <= Long.MIN_VALUE) {
            return LongRange.Companion.getEMPTY();
        }
        return new LongRange($this$until, to - 1L);
    }

    @Deprecated(message="This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(warningSince="1.3", errorSince="1.4", hiddenSince="1.5")
    @JvmName(name="doubleRangeContains")
    public static final /* synthetic */ boolean doubleRangeContains(ClosedRange $this$contains, short value) {
        Intrinsics.checkNotNullParameter($this$contains, "<this>");
        return $this$contains.contains((Comparable)Double.valueOf(value));
    }

    @DeprecatedSinceKotlin(warningSince="1.3", errorSince="1.4", hiddenSince="1.5")
    @Deprecated(message="This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @JvmName(name="intRangeContains")
    public static final /* synthetic */ boolean intRangeContains(ClosedRange $this$contains, float value) {
        Intrinsics.checkNotNullParameter($this$contains, "<this>");
        Integer n = RangesKt.toIntExactOrNull(value);
        Integer it = n;
        boolean bl = false;
        Integer n2 = it;
        return n2 != null ? $this$contains.contains((Comparable)n2) : false;
    }

    @NotNull
    public static final IntRange until(byte $this$until, int to) {
        if (to <= Integer.MIN_VALUE) {
            return IntRange.Companion.getEMPTY();
        }
        return new IntRange($this$until, to + -1);
    }

    @JvmName(name="longRangeContains")
    public static final boolean longRangeContains(@NotNull ClosedRange<Long> $this$contains, short value) {
        Intrinsics.checkNotNullParameter($this$contains, "<this>");
        return $this$contains.contains((Long)((Comparable)Long.valueOf(value)));
    }

    /*
     * WARNING - void declaration
     */
    public static final short coerceIn(short $this$coerceIn, short minimumValue, short maximumValue) {
        short s;
        if (minimumValue > maximumValue) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + maximumValue + " is less than minimum " + minimumValue + '.');
        }
        if ($this$coerceIn < minimumValue) {
            return minimumValue;
        }
        if ($this$coerceIn > maximumValue) {
            void var2_2;
            return (short)var2_2;
        }
        return s;
    }

    @NotNull
    public static final LongProgression downTo(long $this$downTo, byte to) {
        return LongProgression.Companion.fromClosedRange($this$downTo, to, -1L);
    }

    @JvmName(name="doubleRangeContains")
    public static final boolean doubleRangeContains(@NotNull ClosedRange<Double> $this$contains, float value) {
        Intrinsics.checkNotNullParameter($this$contains, "<this>");
        return $this$contains.contains((Double)((Comparable)Double.valueOf(value)));
    }

    @NotNull
    public static final LongProgression downTo(long $this$downTo, long to) {
        return LongProgression.Companion.fromClosedRange($this$downTo, to, -1L);
    }

    @Nullable
    public static final Integer toIntExactOrNull(float $this$toIntExactOrNull) {
        return (-2.1474836E9f <= $this$toIntExactOrNull ? $this$toIntExactOrNull <= 2.1474836E9f : false) ? Integer.valueOf((int)$this$toIntExactOrNull) : null;
    }

    @NotNull
    @SinceKotlin(version="1.1")
    public static final <T extends Comparable<? super T>> T coerceIn(@NotNull T $this$coerceIn, @NotNull ClosedFloatingPointRange<T> range) {
        Intrinsics.checkNotNullParameter($this$coerceIn, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        if (range.isEmpty()) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
        }
        return range.lessThanOrEquals($this$coerceIn, range.getStart()) && !range.lessThanOrEquals(range.getStart(), $this$coerceIn) ? range.getStart() : (range.lessThanOrEquals(range.getEndInclusive(), $this$coerceIn) && !range.lessThanOrEquals($this$coerceIn, range.getEndInclusive()) ? range.getEndInclusive() : $this$coerceIn);
    }

    @WasExperimental(markerClass={ExperimentalStdlibApi.class})
    @SinceKotlin(version="1.4")
    @InlineOnly
    private static final Integer randomOrNull(IntRange $this$randomOrNull) {
        Intrinsics.checkNotNullParameter($this$randomOrNull, "<this>");
        return RangesKt.randomOrNull($this$randomOrNull, (Random)Random.Default);
    }

    @JvmName(name="byteRangeContains")
    public static final boolean byteRangeContains(@NotNull ClosedRange<Byte> $this$contains, int value) {
        Intrinsics.checkNotNullParameter($this$contains, "<this>");
        Byte by = RangesKt.toByteExactOrNull(value);
        Byte it = by;
        boolean bl = false;
        Byte by2 = it;
        return by2 != null ? $this$contains.contains((Byte)((Comparable)by2)) : false;
    }

    @JvmName(name="intRangeContains")
    public static final boolean intRangeContains(@NotNull ClosedRange<Integer> $this$contains, byte value) {
        Intrinsics.checkNotNullParameter($this$contains, "<this>");
        return $this$contains.contains((Integer)((Comparable)Integer.valueOf(value)));
    }

    public static final short coerceAtLeast(short $this$coerceAtLeast, short minimumValue) {
        return $this$coerceAtLeast < minimumValue ? minimumValue : $this$coerceAtLeast;
    }

    @SinceKotlin(version="1.7")
    public static final int first(@NotNull IntProgression $this$first) {
        Intrinsics.checkNotNullParameter($this$first, "<this>");
        if ($this$first.isEmpty()) {
            throw new NoSuchElementException("Progression " + $this$first + " is empty.");
        }
        return $this$first.getFirst();
    }

    @Deprecated(message="This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(warningSince="1.3", errorSince="1.4", hiddenSince="1.5")
    @JvmName(name="longRangeContains")
    public static final /* synthetic */ boolean longRangeContains(ClosedRange $this$contains, double value) {
        Intrinsics.checkNotNullParameter($this$contains, "<this>");
        Long l = RangesKt.toLongExactOrNull(value);
        Long it = l;
        boolean bl = false;
        Long l2 = it;
        return l2 != null ? $this$contains.contains((Comparable)l2) : false;
    }

    @JvmName(name="intRangeContains")
    @SinceKotlin(version="1.9")
    @WasExperimental(markerClass={ExperimentalStdlibApi.class})
    public static final boolean intRangeContains(@NotNull OpenEndRange<Integer> $this$contains, long value) {
        Intrinsics.checkNotNullParameter($this$contains, "<this>");
        Integer n = RangesKt.toIntExactOrNull(value);
        Integer it = n;
        boolean bl = false;
        Integer n2 = it;
        return n2 != null ? $this$contains.contains((Integer)((Comparable)n2)) : false;
    }

    @Deprecated(message="This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(warningSince="1.3", errorSince="1.4", hiddenSince="1.5")
    @JvmName(name="byteRangeContains")
    public static final /* synthetic */ boolean byteRangeContains(ClosedRange $this$contains, double value) {
        Intrinsics.checkNotNullParameter($this$contains, "<this>");
        Byte by = RangesKt.toByteExactOrNull(value);
        Byte it = by;
        boolean bl = false;
        Byte by2 = it;
        return by2 != null ? $this$contains.contains((Comparable)by2) : false;
    }

    @NotNull
    public static final LongRange until(long $this$until, long to) {
        if (to <= Long.MIN_VALUE) {
            return LongRange.Companion.getEMPTY();
        }
        return new LongRange($this$until, to - 1L);
    }

    @SinceKotlin(version="1.3")
    @InlineOnly
    private static final char random(CharRange $this$random) {
        Intrinsics.checkNotNullParameter($this$random, "<this>");
        return RangesKt.random($this$random, (Random)Random.Default);
    }

    @SinceKotlin(version="1.9")
    @WasExperimental(markerClass={ExperimentalStdlibApi.class})
    @JvmName(name="shortRangeContains")
    public static final boolean shortRangeContains(@NotNull OpenEndRange<Short> $this$contains, long value) {
        Intrinsics.checkNotNullParameter($this$contains, "<this>");
        Short s = RangesKt.toShortExactOrNull(value);
        Short it = s;
        boolean bl = false;
        Short s2 = it;
        return s2 != null ? $this$contains.contains((Short)((Comparable)s2)) : false;
    }

    @JvmName(name="shortRangeContains")
    public static final boolean shortRangeContains(@NotNull ClosedRange<Short> $this$contains, long value) {
        Intrinsics.checkNotNullParameter($this$contains, "<this>");
        Short s = RangesKt.toShortExactOrNull(value);
        Short it = s;
        boolean bl = false;
        Short s2 = it;
        return s2 != null ? $this$contains.contains((Short)((Comparable)s2)) : false;
    }

    public static final short coerceAtMost(short $this$coerceAtMost, short maximumValue) {
        return $this$coerceAtMost > maximumValue ? maximumValue : $this$coerceAtMost;
    }

    @JvmName(name="intRangeContains")
    public static final boolean intRangeContains(@NotNull ClosedRange<Integer> $this$contains, long value) {
        Intrinsics.checkNotNullParameter($this$contains, "<this>");
        Integer n = RangesKt.toIntExactOrNull(value);
        Integer it = n;
        boolean bl = false;
        Integer n2 = it;
        return n2 != null ? $this$contains.contains((Integer)((Comparable)n2)) : false;
    }

    @NotNull
    public static final IntRange until(byte $this$until, short to) {
        return new IntRange($this$until, to + -1);
    }

    public static final byte coerceAtLeast(byte $this$coerceAtLeast, byte minimumValue) {
        return $this$coerceAtLeast < minimumValue ? minimumValue : $this$coerceAtLeast;
    }

    @SinceKotlin(version="1.3")
    public static final long random(@NotNull LongRange $this$random, @NotNull Random random) {
        Intrinsics.checkNotNullParameter($this$random, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        try {
            return RandomKt.nextLong(random, $this$random);
        }
        catch (IllegalArgumentException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    @NotNull
    public static final LongProgression reversed(@NotNull LongProgression $this$reversed) {
        Intrinsics.checkNotNullParameter($this$reversed, "<this>");
        return LongProgression.Companion.fromClosedRange($this$reversed.getLast(), $this$reversed.getFirst(), -$this$reversed.getStep());
    }

    @NotNull
    public static final IntProgression downTo(byte $this$downTo, int to) {
        return IntProgression.Companion.fromClosedRange($this$downTo, to, -1);
    }

    @Nullable
    @SinceKotlin(version="1.7")
    public static final Character firstOrNull(@NotNull CharProgression $this$firstOrNull) {
        Intrinsics.checkNotNullParameter($this$firstOrNull, "<this>");
        return $this$firstOrNull.isEmpty() ? null : Character.valueOf($this$firstOrNull.getFirst());
    }

    @SinceKotlin(version="1.3")
    @InlineOnly
    private static final long random(LongRange $this$random) {
        Intrinsics.checkNotNullParameter($this$random, "<this>");
        return RangesKt.random($this$random, (Random)Random.Default);
    }

    public static final double coerceAtLeast(double $this$coerceAtLeast, double minimumValue) {
        return $this$coerceAtLeast < minimumValue ? minimumValue : $this$coerceAtLeast;
    }

    @Nullable
    public static final Short toShortExactOrNull(long $this$toShortExactOrNull) {
        return new LongRange(-32768L, 32767L).contains($this$toShortExactOrNull) ? Short.valueOf((short)$this$toShortExactOrNull) : null;
    }

    @Deprecated(message="This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(warningSince="1.3", errorSince="1.4", hiddenSince="1.5")
    @JvmName(name="longRangeContains")
    public static final /* synthetic */ boolean longRangeContains(ClosedRange $this$contains, float value) {
        Intrinsics.checkNotNullParameter($this$contains, "<this>");
        Long l = RangesKt.toLongExactOrNull(value);
        Long it = l;
        boolean bl = false;
        Long l2 = it;
        return l2 != null ? $this$contains.contains((Comparable)l2) : false;
    }

    @Nullable
    public static final Byte toByteExactOrNull(float $this$toByteExactOrNull) {
        return (-128.0f <= $this$toByteExactOrNull ? $this$toByteExactOrNull <= 127.0f : false) ? Byte.valueOf((byte)$this$toByteExactOrNull) : null;
    }

    @NotNull
    public static final IntProgression downTo(short $this$downTo, int to) {
        return IntProgression.Companion.fromClosedRange($this$downTo, to, -1);
    }

    @Nullable
    public static final Integer toIntExactOrNull(long $this$toIntExactOrNull) {
        return new LongRange(Integer.MIN_VALUE, Integer.MAX_VALUE).contains($this$toIntExactOrNull) ? Integer.valueOf((int)$this$toIntExactOrNull) : null;
    }

    @DeprecatedSinceKotlin(warningSince="1.3", errorSince="1.4", hiddenSince="1.5")
    @Deprecated(message="This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @JvmName(name="floatRangeContains")
    public static final /* synthetic */ boolean floatRangeContains(ClosedRange $this$contains, long value) {
        Intrinsics.checkNotNullParameter($this$contains, "<this>");
        return $this$contains.contains((Comparable)Float.valueOf(value));
    }

    @Nullable
    @SinceKotlin(version="1.7")
    public static final Integer lastOrNull(@NotNull IntProgression $this$lastOrNull) {
        Intrinsics.checkNotNullParameter($this$lastOrNull, "<this>");
        return $this$lastOrNull.isEmpty() ? null : Integer.valueOf($this$lastOrNull.getLast());
    }

    @NotNull
    public static final IntProgression downTo(byte $this$downTo, short to) {
        return IntProgression.Companion.fromClosedRange($this$downTo, to, -1);
    }

    @WasExperimental(markerClass={ExperimentalStdlibApi.class})
    @JvmName(name="byteRangeContains")
    @SinceKotlin(version="1.9")
    public static final boolean byteRangeContains(@NotNull OpenEndRange<Byte> $this$contains, int value) {
        Intrinsics.checkNotNullParameter($this$contains, "<this>");
        Byte by = RangesKt.toByteExactOrNull(value);
        Byte it = by;
        boolean bl = false;
        Byte by2 = it;
        return by2 != null ? $this$contains.contains((Byte)((Comparable)by2)) : false;
    }

    @Nullable
    public static final Long toLongExactOrNull(float $this$toLongExactOrNull) {
        return (-9.223372E18f <= $this$toLongExactOrNull ? $this$toLongExactOrNull <= 9.223372E18f : false) ? Long.valueOf((long)$this$toLongExactOrNull) : null;
    }

    @NotNull
    public static final LongProgression downTo(int $this$downTo, long to) {
        return LongProgression.Companion.fromClosedRange($this$downTo, to, -1L);
    }

    public static final long coerceIn(long $this$coerceIn, @NotNull ClosedRange<Long> range) {
        long l;
        Intrinsics.checkNotNullParameter(range, "range");
        if (range instanceof ClosedFloatingPointRange) {
            return ((Number)((Object)RangesKt.coerceIn((Comparable)Long.valueOf($this$coerceIn), (ClosedFloatingPointRange)range))).longValue();
        }
        if (range.isEmpty()) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
        }
        return $this$coerceIn < ((Number)range.getStart()).longValue() ? ((Number)range.getStart()).longValue() : ($this$coerceIn > ((Number)range.getEndInclusive()).longValue() ? ((Number)range.getEndInclusive()).longValue() : l);
    }

    @InlineOnly
    private static final boolean contains(IntRange $this$contains, byte value) {
        Intrinsics.checkNotNullParameter($this$contains, "<this>");
        return RangesKt.intRangeContains((ClosedRange<Integer>)$this$contains, value);
    }

    @JvmName(name="floatRangeContains")
    public static final boolean floatRangeContains(@NotNull ClosedRange<Float> $this$contains, double value) {
        Intrinsics.checkNotNullParameter($this$contains, "<this>");
        return $this$contains.contains((Float)((Comparable)Float.valueOf((float)value)));
    }

    public static final int coerceAtLeast(int $this$coerceAtLeast, int minimumValue) {
        return $this$coerceAtLeast < minimumValue ? minimumValue : $this$coerceAtLeast;
    }

    @SinceKotlin(version="1.7")
    public static final long last(@NotNull LongProgression $this$last) {
        Intrinsics.checkNotNullParameter($this$last, "<this>");
        if ($this$last.isEmpty()) {
            throw new NoSuchElementException("Progression " + $this$last + " is empty.");
        }
        return $this$last.getLast();
    }

    @NotNull
    public static final LongProgression step(@NotNull LongProgression $this$step, long step) {
        Intrinsics.checkNotNullParameter($this$step, "<this>");
        RangesKt.checkStepIsPositive(step > 0L, step);
        return LongProgression.Companion.fromClosedRange($this$step.getFirst(), $this$step.getLast(), $this$step.getStep() > 0L ? step : -step);
    }

    @InlineOnly
    private static final boolean contains(LongRange $this$contains, byte value) {
        Intrinsics.checkNotNullParameter($this$contains, "<this>");
        return RangesKt.longRangeContains((ClosedRange<Long>)$this$contains, value);
    }

    @SinceKotlin(version="1.4")
    @WasExperimental(markerClass={ExperimentalStdlibApi.class})
    @Nullable
    public static final Long randomOrNull(@NotNull LongRange $this$randomOrNull, @NotNull Random random) {
        Intrinsics.checkNotNullParameter($this$randomOrNull, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if ($this$randomOrNull.isEmpty()) {
            return null;
        }
        return RandomKt.nextLong(random, $this$randomOrNull);
    }

    @SinceKotlin(version="1.7")
    public static final char last(@NotNull CharProgression $this$last) {
        Intrinsics.checkNotNullParameter($this$last, "<this>");
        if ($this$last.isEmpty()) {
            throw new NoSuchElementException("Progression " + $this$last + " is empty.");
        }
        return $this$last.getLast();
    }

    @SinceKotlin(version="1.7")
    @Nullable
    public static final Long firstOrNull(@NotNull LongProgression $this$firstOrNull) {
        Intrinsics.checkNotNullParameter($this$firstOrNull, "<this>");
        return $this$firstOrNull.isEmpty() ? null : Long.valueOf($this$firstOrNull.getFirst());
    }

    @InlineOnly
    private static final boolean contains(IntRange $this$contains, long value) {
        Intrinsics.checkNotNullParameter($this$contains, "<this>");
        return RangesKt.intRangeContains((ClosedRange<Integer>)$this$contains, value);
    }

    @NotNull
    public static final IntRange until(short $this$until, byte to) {
        return new IntRange($this$until, to + -1);
    }

    @SinceKotlin(version="1.7")
    public static final long first(@NotNull LongProgression $this$first) {
        Intrinsics.checkNotNullParameter($this$first, "<this>");
        if ($this$first.isEmpty()) {
            throw new NoSuchElementException("Progression " + $this$first + " is empty.");
        }
        return $this$first.getFirst();
    }

    @NotNull
    public static final LongRange until(long $this$until, short to) {
        return new LongRange($this$until, (long)to - 1L);
    }

    @DeprecatedSinceKotlin(warningSince="1.3", errorSince="1.4", hiddenSince="1.5")
    @Deprecated(message="This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @JvmName(name="byteRangeContains")
    public static final /* synthetic */ boolean byteRangeContains(ClosedRange $this$contains, float value) {
        Intrinsics.checkNotNullParameter($this$contains, "<this>");
        Byte by = RangesKt.toByteExactOrNull(value);
        Byte it = by;
        boolean bl = false;
        Byte by2 = it;
        return by2 != null ? $this$contains.contains((Comparable)by2) : false;
    }

    @Nullable
    public static final Integer toIntExactOrNull(double $this$toIntExactOrNull) {
        return (-2.147483648E9 <= $this$toIntExactOrNull ? $this$toIntExactOrNull <= 2.147483647E9 : false) ? Integer.valueOf((int)$this$toIntExactOrNull) : null;
    }

    @SinceKotlin(version="1.3")
    public static final int random(@NotNull IntRange $this$random, @NotNull Random random) {
        Intrinsics.checkNotNullParameter($this$random, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        try {
            return RandomKt.nextInt(random, $this$random);
        }
        catch (IllegalArgumentException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public static final double coerceAtMost(double $this$coerceAtMost, double maximumValue) {
        return $this$coerceAtMost > maximumValue ? maximumValue : $this$coerceAtMost;
    }

    @JvmName(name="intRangeContains")
    public static final boolean intRangeContains(@NotNull ClosedRange<Integer> $this$contains, short value) {
        Intrinsics.checkNotNullParameter($this$contains, "<this>");
        return $this$contains.contains((Integer)((Comparable)Integer.valueOf(value)));
    }

    @NotNull
    public static final LongProgression downTo(byte $this$downTo, long to) {
        return LongProgression.Companion.fromClosedRange($this$downTo, to, -1L);
    }

    @NotNull
    public static final LongProgression downTo(long $this$downTo, short to) {
        return LongProgression.Companion.fromClosedRange($this$downTo, to, -1L);
    }

    public static final int coerceIn(int $this$coerceIn, @NotNull ClosedRange<Integer> range) {
        Intrinsics.checkNotNullParameter(range, "range");
        if (range instanceof ClosedFloatingPointRange) {
            return ((Number)((Object)RangesKt.coerceIn((Comparable)Integer.valueOf($this$coerceIn), (ClosedFloatingPointRange)range))).intValue();
        }
        if (range.isEmpty()) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
        }
        return $this$coerceIn < ((Number)range.getStart()).intValue() ? ((Number)range.getStart()).intValue() : ($this$coerceIn > ((Number)range.getEndInclusive()).intValue() ? ((Number)range.getEndInclusive()).intValue() : $this$coerceIn);
    }

    @Nullable
    @SinceKotlin(version="1.7")
    public static final Integer firstOrNull(@NotNull IntProgression $this$firstOrNull) {
        Intrinsics.checkNotNullParameter($this$firstOrNull, "<this>");
        return $this$firstOrNull.isEmpty() ? null : Integer.valueOf($this$firstOrNull.getFirst());
    }

    @DeprecatedSinceKotlin(warningSince="1.3", errorSince="1.4", hiddenSince="1.5")
    @Deprecated(message="This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @JvmName(name="floatRangeContains")
    public static final /* synthetic */ boolean floatRangeContains(ClosedRange $this$contains, int value) {
        Intrinsics.checkNotNullParameter($this$contains, "<this>");
        return $this$contains.contains((Comparable)Float.valueOf(value));
    }

    @JvmName(name="byteRangeContains")
    public static final boolean byteRangeContains(@NotNull ClosedRange<Byte> $this$contains, short value) {
        Intrinsics.checkNotNullParameter($this$contains, "<this>");
        Byte by = RangesKt.toByteExactOrNull(value);
        Byte it = by;
        boolean bl = false;
        Byte by2 = it;
        return by2 != null ? $this$contains.contains((Byte)((Comparable)by2)) : false;
    }

    @NotNull
    public static final IntRange until(byte $this$until, byte to) {
        return new IntRange($this$until, to + -1);
    }

    @SinceKotlin(version="1.3")
    @InlineOnly
    private static final boolean contains(CharRange $this$contains, Character element) {
        Intrinsics.checkNotNullParameter($this$contains, "<this>");
        return element != null && $this$contains.contains(element.charValue());
    }

    @Nullable
    public static final Byte toByteExactOrNull(short $this$toByteExactOrNull) {
        return RangesKt.intRangeContains((ClosedRange<Integer>)new IntRange(-128, 127), $this$toByteExactOrNull) ? Byte.valueOf((byte)$this$toByteExactOrNull) : null;
    }

    public static final int coerceAtMost(int $this$coerceAtMost, int maximumValue) {
        return $this$coerceAtMost > maximumValue ? maximumValue : $this$coerceAtMost;
    }

    @Nullable
    public static final Byte toByteExactOrNull(double $this$toByteExactOrNull) {
        return (-128.0 <= $this$toByteExactOrNull ? $this$toByteExactOrNull <= 127.0 : false) ? Byte.valueOf((byte)$this$toByteExactOrNull) : null;
    }

    @DeprecatedSinceKotlin(warningSince="1.3", errorSince="1.4", hiddenSince="1.5")
    @Deprecated(message="This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @JvmName(name="shortRangeContains")
    public static final /* synthetic */ boolean shortRangeContains(ClosedRange $this$contains, double value) {
        Intrinsics.checkNotNullParameter($this$contains, "<this>");
        Short s = RangesKt.toShortExactOrNull(value);
        Short it = s;
        boolean bl = false;
        Short s2 = it;
        return s2 != null ? $this$contains.contains((Comparable)s2) : false;
    }

    @JvmName(name="longRangeContains")
    @SinceKotlin(version="1.9")
    @WasExperimental(markerClass={ExperimentalStdlibApi.class})
    public static final boolean longRangeContains(@NotNull OpenEndRange<Long> $this$contains, int value) {
        Intrinsics.checkNotNullParameter($this$contains, "<this>");
        return $this$contains.contains((Long)((Comparable)Long.valueOf(value)));
    }

    @InlineOnly
    private static final boolean contains(LongRange $this$contains, short value) {
        Intrinsics.checkNotNullParameter($this$contains, "<this>");
        return RangesKt.longRangeContains((ClosedRange<Long>)$this$contains, value);
    }

    @NotNull
    public static final CharProgression downTo(char $this$downTo, char to) {
        return CharProgression.Companion.fromClosedRange($this$downTo, to, -1);
    }

    @SinceKotlin(version="1.4")
    @WasExperimental(markerClass={ExperimentalStdlibApi.class})
    @InlineOnly
    private static final Character randomOrNull(CharRange $this$randomOrNull) {
        Intrinsics.checkNotNullParameter($this$randomOrNull, "<this>");
        return RangesKt.randomOrNull($this$randomOrNull, (Random)Random.Default);
    }

    @NotNull
    public static final <T extends Comparable<? super T>> T coerceAtLeast(@NotNull T $this$coerceAtLeast, @NotNull T minimumValue) {
        Intrinsics.checkNotNullParameter($this$coerceAtLeast, "<this>");
        Intrinsics.checkNotNullParameter(minimumValue, "minimumValue");
        return $this$coerceAtLeast.compareTo(minimumValue) < 0 ? minimumValue : $this$coerceAtLeast;
    }

    public static final long coerceIn(long $this$coerceIn, long minimumValue, long maximumValue) {
        if (minimumValue > maximumValue) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + maximumValue + " is less than minimum " + minimumValue + '.');
        }
        if ($this$coerceIn < minimumValue) {
            return minimumValue;
        }
        if ($this$coerceIn > maximumValue) {
            return maximumValue;
        }
        return $this$coerceIn;
    }

    @NotNull
    public static final IntProgression downTo(short $this$downTo, byte to) {
        return IntProgression.Companion.fromClosedRange($this$downTo, to, -1);
    }

    @NotNull
    public static final LongRange until(short $this$until, long to) {
        if (to <= Long.MIN_VALUE) {
            return LongRange.Companion.getEMPTY();
        }
        return new LongRange($this$until, to - 1L);
    }

    @Nullable
    @SinceKotlin(version="1.7")
    public static final Long lastOrNull(@NotNull LongProgression $this$lastOrNull) {
        Intrinsics.checkNotNullParameter($this$lastOrNull, "<this>");
        return $this$lastOrNull.isEmpty() ? null : Long.valueOf($this$lastOrNull.getLast());
    }

    @WasExperimental(markerClass={ExperimentalStdlibApi.class})
    @SinceKotlin(version="1.9")
    @JvmName(name="longRangeContains")
    public static final boolean longRangeContains(@NotNull OpenEndRange<Long> $this$contains, short value) {
        Intrinsics.checkNotNullParameter($this$contains, "<this>");
        return $this$contains.contains((Long)((Comparable)Long.valueOf(value)));
    }

    @SinceKotlin(version="1.3")
    @InlineOnly
    private static final boolean contains(IntRange $this$contains, Integer element) {
        Intrinsics.checkNotNullParameter($this$contains, "<this>");
        return element != null && $this$contains.contains(element);
    }

    @NotNull
    public static final IntRange until(short $this$until, int to) {
        if (to <= Integer.MIN_VALUE) {
            return IntRange.Companion.getEMPTY();
        }
        return new IntRange($this$until, to + -1);
    }

    @JvmName(name="shortRangeContains")
    public static final boolean shortRangeContains(@NotNull ClosedRange<Short> $this$contains, int value) {
        Intrinsics.checkNotNullParameter($this$contains, "<this>");
        Short s = RangesKt.toShortExactOrNull(value);
        Short it = s;
        boolean bl = false;
        Short s2 = it;
        return s2 != null ? $this$contains.contains((Short)((Comparable)s2)) : false;
    }

    @Nullable
    public static final Short toShortExactOrNull(double $this$toShortExactOrNull) {
        return (-32768.0 <= $this$toShortExactOrNull ? $this$toShortExactOrNull <= 32767.0 : false) ? Short.valueOf((short)$this$toShortExactOrNull) : null;
    }

    /*
     * WARNING - void declaration
     */
    public static final byte coerceIn(byte $this$coerceIn, byte minimumValue, byte maximumValue) {
        byte by;
        if (minimumValue > maximumValue) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + maximumValue + " is less than minimum " + minimumValue + '.');
        }
        if ($this$coerceIn < minimumValue) {
            return minimumValue;
        }
        if ($this$coerceIn > maximumValue) {
            void var2_2;
            return (byte)var2_2;
        }
        return by;
    }

    @DeprecatedSinceKotlin(warningSince="1.3", errorSince="1.4", hiddenSince="1.5")
    @Deprecated(message="This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @JvmName(name="floatRangeContains")
    public static final /* synthetic */ boolean floatRangeContains(ClosedRange $this$contains, byte value) {
        Intrinsics.checkNotNullParameter($this$contains, "<this>");
        return $this$contains.contains((Comparable)Float.valueOf(value));
    }

    @Nullable
    public static final Long toLongExactOrNull(double $this$toLongExactOrNull) {
        return (-9.223372036854776E18 <= $this$toLongExactOrNull ? $this$toLongExactOrNull <= 9.223372036854776E18 : false) ? Long.valueOf((long)$this$toLongExactOrNull) : null;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @NotNull
    public static final <T extends Comparable<? super T>> T coerceIn(@NotNull T $this$coerceIn, @Nullable T minimumValue, @Nullable T maximumValue) {
        void var2_2;
        T t;
        Intrinsics.checkNotNullParameter($this$coerceIn, "<this>");
        if (minimumValue != null) {
            if (maximumValue != null) {
                if (minimumValue.compareTo(maximumValue) > 0) {
                    throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + maximumValue + " is less than minimum " + minimumValue + '.');
                }
                if ($this$coerceIn.compareTo(minimumValue) < 0) {
                    return minimumValue;
                }
                if ($this$coerceIn.compareTo(maximumValue) <= 0) return t;
                return maximumValue;
            }
        }
        if (minimumValue != null && $this$coerceIn.compareTo(minimumValue) < 0) {
            return minimumValue;
        }
        if (maximumValue == null) return t;
        if ($this$coerceIn.compareTo(maximumValue) <= 0) return t;
        return var2_2;
    }

    public static final float coerceAtMost(float $this$coerceAtMost, float maximumValue) {
        return $this$coerceAtMost > maximumValue ? maximumValue : $this$coerceAtMost;
    }

    public static final float coerceAtLeast(float $this$coerceAtLeast, float minimumValue) {
        return $this$coerceAtLeast < minimumValue ? minimumValue : $this$coerceAtLeast;
    }

    @NotNull
    public static final LongProgression downTo(short $this$downTo, long to) {
        return LongProgression.Companion.fromClosedRange($this$downTo, to, -1L);
    }

    /*
     * WARNING - void declaration
     */
    public static final int coerceIn(int $this$coerceIn, int minimumValue, int maximumValue) {
        int n;
        if (minimumValue > maximumValue) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + maximumValue + " is less than minimum " + minimumValue + '.');
        }
        if ($this$coerceIn < minimumValue) {
            return minimumValue;
        }
        if ($this$coerceIn > maximumValue) {
            void var2_2;
            return (int)var2_2;
        }
        return n;
    }

    @NotNull
    public static final IntProgression downTo(int $this$downTo, byte to) {
        return IntProgression.Companion.fromClosedRange($this$downTo, to, -1);
    }

    @NotNull
    public static final CharProgression reversed(@NotNull CharProgression $this$reversed) {
        Intrinsics.checkNotNullParameter($this$reversed, "<this>");
        return CharProgression.Companion.fromClosedRange($this$reversed.getLast(), $this$reversed.getFirst(), -$this$reversed.getStep());
    }

    @SinceKotlin(version="1.4")
    @Nullable
    @WasExperimental(markerClass={ExperimentalStdlibApi.class})
    public static final Integer randomOrNull(@NotNull IntRange $this$randomOrNull, @NotNull Random random) {
        Intrinsics.checkNotNullParameter($this$randomOrNull, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if ($this$randomOrNull.isEmpty()) {
            return null;
        }
        return RandomKt.nextInt(random, $this$randomOrNull);
    }

    @NotNull
    public static final CharProgression step(@NotNull CharProgression $this$step, int step) {
        Intrinsics.checkNotNullParameter($this$step, "<this>");
        RangesKt.checkStepIsPositive(step > 0, step);
        return CharProgression.Companion.fromClosedRange($this$step.getFirst(), $this$step.getLast(), $this$step.getStep() > 0 ? step : -step);
    }

    @NotNull
    public static final IntProgression downTo(short $this$downTo, short to) {
        return IntProgression.Companion.fromClosedRange($this$downTo, to, -1);
    }

    public static final byte coerceAtMost(byte $this$coerceAtMost, byte maximumValue) {
        return $this$coerceAtMost > maximumValue ? maximumValue : $this$coerceAtMost;
    }

    @InlineOnly
    private static final boolean contains(LongRange $this$contains, int value) {
        Intrinsics.checkNotNullParameter($this$contains, "<this>");
        return RangesKt.longRangeContains((ClosedRange<Long>)$this$contains, value);
    }

    @Nullable
    public static final Short toShortExactOrNull(int $this$toShortExactOrNull) {
        return new IntRange(Short.MIN_VALUE, Short.MAX_VALUE).contains($this$toShortExactOrNull) ? Short.valueOf((short)$this$toShortExactOrNull) : null;
    }

    @NotNull
    public static final IntRange until(int $this$until, short to) {
        return new IntRange($this$until, to + -1);
    }
}

