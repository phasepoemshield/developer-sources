/*
 * Decompiled with CFR 0.152.
 */
package kotlin.math;

import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.internal.InlineOnly;
import kotlin.math.Constants;
import kotlin.math.MathKt;
import kotlin.math.MathKt__MathHKt;

@Metadata(mv={1, 9, 0}, k=5, xi=49, d1={"\u0000\u001e\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\bE\u001a\u0018\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\b\u00a2\u0006\u0004\b\u0002\u0010\u0003\u001a\u0018\u0010\u0002\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0004H\u0087\b\u00a2\u0006\u0004\b\u0002\u0010\u0005\u001a\u0018\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0087\b\u00a2\u0006\u0004\b\u0002\u0010\b\u001a\u0018\u0010\u0002\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\tH\u0087\b\u00a2\u0006\u0004\b\u0002\u0010\n\u001a\u0018\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\b\u00a2\u0006\u0004\b\u000b\u0010\u0003\u001a\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0004H\u0087\b\u00a2\u0006\u0004\b\u000b\u0010\u0005\u001a\u0017\u0010\f\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\b\f\u0010\u0003\u001a\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0004H\u0087\b\u00a2\u0006\u0004\b\f\u0010\u0005\u001a\u0018\u0010\r\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\b\u00a2\u0006\u0004\b\r\u0010\u0003\u001a\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0004H\u0087\b\u00a2\u0006\u0004\b\r\u0010\u0005\u001a\u0017\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\b\u000e\u0010\u0003\u001a\u0018\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0004H\u0087\b\u00a2\u0006\u0004\b\u000e\u0010\u0005\u001a\u0018\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\b\u00a2\u0006\u0004\b\u000f\u0010\u0003\u001a\u0018\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0004H\u0087\b\u00a2\u0006\u0004\b\u000f\u0010\u0005\u001a \u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\b\u00a2\u0006\u0004\b\u0011\u0010\u0012\u001a \u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0004H\u0087\b\u00a2\u0006\u0004\b\u0011\u0010\u0013\u001a\u0017\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\b\u0014\u0010\u0003\u001a\u0018\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0004H\u0087\b\u00a2\u0006\u0004\b\u0014\u0010\u0005\u001a\u0018\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\b\u00a2\u0006\u0004\b\u0015\u0010\u0003\u001a\u0018\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0004H\u0087\b\u00a2\u0006\u0004\b\u0015\u0010\u0005\u001a\u0018\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\b\u00a2\u0006\u0004\b\u0016\u0010\u0003\u001a\u0018\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0004H\u0087\b\u00a2\u0006\u0004\b\u0016\u0010\u0005\u001a\u0018\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\b\u00a2\u0006\u0004\b\u0017\u0010\u0003\u001a\u0018\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0004H\u0087\b\u00a2\u0006\u0004\b\u0017\u0010\u0005\u001a\u0018\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\b\u00a2\u0006\u0004\b\u0018\u0010\u0003\u001a\u0018\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0004H\u0087\b\u00a2\u0006\u0004\b\u0018\u0010\u0005\u001a\u0018\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\b\u00a2\u0006\u0004\b\u0019\u0010\u0003\u001a\u0018\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0004H\u0087\b\u00a2\u0006\u0004\b\u0019\u0010\u0005\u001a\u0018\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\b\u00a2\u0006\u0004\b\u001a\u0010\u0003\u001a\u0018\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0004H\u0087\b\u00a2\u0006\u0004\b\u001a\u0010\u0005\u001a\u0018\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\b\u00a2\u0006\u0004\b\u001b\u0010\u0003\u001a\u0018\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0004H\u0087\b\u00a2\u0006\u0004\b\u001b\u0010\u0005\u001a \u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0000H\u0087\b\u00a2\u0006\u0004\b\u001c\u0010\u0012\u001a \u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0087\b\u00a2\u0006\u0004\b\u001c\u0010\u0013\u001a\u0018\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\b\u00a2\u0006\u0004\b\u001d\u0010\u0003\u001a\u0018\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0004H\u0087\b\u00a2\u0006\u0004\b\u001d\u0010\u0005\u001a\u0018\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\b\u00a2\u0006\u0004\b\u001e\u0010\u0003\u001a\u0018\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0004H\u0087\b\u00a2\u0006\u0004\b\u001e\u0010\u0005\u001a\u001f\u0010 \u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\b \u0010\u0012\u001a\u001f\u0010 \u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\b \u0010\u0013\u001a\u0018\u0010!\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\b\u00a2\u0006\u0004\b!\u0010\u0003\u001a\u0018\u0010!\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0004H\u0087\b\u00a2\u0006\u0004\b!\u0010\u0005\u001a\u0017\u0010\"\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\b\"\u0010\u0003\u001a\u0017\u0010\"\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\b\"\u0010\u0005\u001a \u0010%\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\u0000H\u0087\b\u00a2\u0006\u0004\b%\u0010\u0012\u001a \u0010%\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u0004H\u0087\b\u00a2\u0006\u0004\b%\u0010\u0013\u001a \u0010%\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u0006H\u0087\b\u00a2\u0006\u0004\b%\u0010&\u001a \u0010%\u001a\u00020\t2\u0006\u0010#\u001a\u00020\t2\u0006\u0010$\u001a\u00020\tH\u0087\b\u00a2\u0006\u0004\b%\u0010'\u001a \u0010(\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\u0000H\u0087\b\u00a2\u0006\u0004\b(\u0010\u0012\u001a \u0010(\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u0004H\u0087\b\u00a2\u0006\u0004\b(\u0010\u0013\u001a \u0010(\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u0006H\u0087\b\u00a2\u0006\u0004\b(\u0010&\u001a \u0010(\u001a\u00020\t2\u0006\u0010#\u001a\u00020\t2\u0006\u0010$\u001a\u00020\tH\u0087\b\u00a2\u0006\u0004\b(\u0010'\u001a\u0018\u0010)\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\b\u00a2\u0006\u0004\b)\u0010\u0003\u001a\u0018\u0010)\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0004H\u0087\b\u00a2\u0006\u0004\b)\u0010\u0005\u001a\u0018\u0010*\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\b\u00a2\u0006\u0004\b*\u0010\u0003\u001a\u0018\u0010*\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0004H\u0087\b\u00a2\u0006\u0004\b*\u0010\u0005\u001a\u0018\u0010+\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\b\u00a2\u0006\u0004\b+\u0010\u0003\u001a\u0018\u0010+\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0004H\u0087\b\u00a2\u0006\u0004\b+\u0010\u0005\u001a\u0018\u0010,\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\b\u00a2\u0006\u0004\b,\u0010\u0003\u001a\u0018\u0010,\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0004H\u0087\b\u00a2\u0006\u0004\b,\u0010\u0005\u001a\u0018\u0010-\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\b\u00a2\u0006\u0004\b-\u0010\u0003\u001a\u0018\u0010-\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0004H\u0087\b\u00a2\u0006\u0004\b-\u0010\u0005\u001a\u0018\u0010.\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\b\u00a2\u0006\u0004\b.\u0010\u0003\u001a\u0018\u0010.\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0004H\u0087\b\u00a2\u0006\u0004\b.\u0010\u0005\u001a\u0018\u0010/\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\b\u00a2\u0006\u0004\b/\u0010\u0003\u001a\u0018\u0010/\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0004H\u0087\b\u00a2\u0006\u0004\b/\u0010\u0005\u001a\u0017\u00100\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\b0\u0010\u0003\u001a\u0017\u00100\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\b0\u0010\u0005\u001a\u001c\u00102\u001a\u00020\u0000*\u00020\u00002\u0006\u00101\u001a\u00020\u0000H\u0087\b\u00a2\u0006\u0004\b2\u0010\u0012\u001a\u001c\u00102\u001a\u00020\u0004*\u00020\u00042\u0006\u00101\u001a\u00020\u0004H\u0087\b\u00a2\u0006\u0004\b2\u0010\u0013\u001a\u0014\u00103\u001a\u00020\u0000*\u00020\u0000H\u0087\b\u00a2\u0006\u0004\b3\u0010\u0003\u001a\u0014\u00103\u001a\u00020\u0004*\u00020\u0004H\u0087\b\u00a2\u0006\u0004\b3\u0010\u0005\u001a\u001c\u00105\u001a\u00020\u0000*\u00020\u00002\u0006\u00104\u001a\u00020\u0000H\u0087\b\u00a2\u0006\u0004\b5\u0010\u0012\u001a\u001c\u00105\u001a\u00020\u0004*\u00020\u00042\u0006\u00104\u001a\u00020\u0004H\u0087\b\u00a2\u0006\u0004\b5\u0010\u0013\u001a\u0014\u00106\u001a\u00020\u0000*\u00020\u0000H\u0087\b\u00a2\u0006\u0004\b6\u0010\u0003\u001a\u0014\u00106\u001a\u00020\u0004*\u00020\u0004H\u0087\b\u00a2\u0006\u0004\b6\u0010\u0005\u001a\u001c\u00107\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\b\u00a2\u0006\u0004\b7\u0010\u0012\u001a\u001c\u00107\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0087\b\u00a2\u0006\u0004\b7\u00108\u001a\u001c\u00107\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0004H\u0087\b\u00a2\u0006\u0004\b7\u0010\u0013\u001a\u001c\u00107\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0087\b\u00a2\u0006\u0004\b7\u00109\u001a\u0013\u0010:\u001a\u00020\u0006*\u00020\u0000H\u0007\u00a2\u0006\u0004\b:\u0010;\u001a\u0013\u0010:\u001a\u00020\u0006*\u00020\u0004H\u0007\u00a2\u0006\u0004\b:\u0010<\u001a\u0013\u0010=\u001a\u00020\t*\u00020\u0000H\u0007\u00a2\u0006\u0004\b=\u0010>\u001a\u0013\u0010=\u001a\u00020\t*\u00020\u0004H\u0007\u00a2\u0006\u0004\b=\u0010?\u001a\u001c\u0010@\u001a\u00020\u0000*\u00020\u00002\u0006\u0010*\u001a\u00020\u0000H\u0087\b\u00a2\u0006\u0004\b@\u0010\u0012\u001a\u001c\u0010@\u001a\u00020\u0000*\u00020\u00002\u0006\u0010*\u001a\u00020\u0006H\u0087\b\u00a2\u0006\u0004\b@\u00108\u001a\u001c\u0010@\u001a\u00020\u0004*\u00020\u00042\u0006\u0010*\u001a\u00020\u0004H\u0087\b\u00a2\u0006\u0004\b@\u0010\u0013\u001a\u001c\u0010@\u001a\u00020\u0004*\u00020\u00042\u0006\u0010*\u001a\u00020\u0006H\u0087\b\u00a2\u0006\u0004\b@\u00109\"\u001f\u0010D\u001a\u00020\u0000*\u00020\u00008\u00c6\u0002X\u0087\u0004\u00a2\u0006\f\u0012\u0004\bB\u0010C\u001a\u0004\bA\u0010\u0003\"\u001f\u0010D\u001a\u00020\u0004*\u00020\u00048\u00c6\u0002X\u0087\u0004\u00a2\u0006\f\u0012\u0004\bB\u0010E\u001a\u0004\bA\u0010\u0005\"\u001f\u0010D\u001a\u00020\u0006*\u00020\u00068\u00c6\u0002X\u0087\u0004\u00a2\u0006\f\u0012\u0004\bB\u0010F\u001a\u0004\bA\u0010\b\"\u001f\u0010D\u001a\u00020\t*\u00020\t8\u00c6\u0002X\u0087\u0004\u00a2\u0006\f\u0012\u0004\bB\u0010G\u001a\u0004\bA\u0010\n\"\u001f\u0010*\u001a\u00020\u0000*\u00020\u00008\u00c6\u0002X\u0087\u0004\u00a2\u0006\f\u0012\u0004\bI\u0010C\u001a\u0004\bH\u0010\u0003\"\u001f\u0010*\u001a\u00020\u0004*\u00020\u00048\u00c6\u0002X\u0087\u0004\u00a2\u0006\f\u0012\u0004\bI\u0010E\u001a\u0004\bH\u0010\u0005\"\u001e\u0010*\u001a\u00020\u0006*\u00020\u00068FX\u0087\u0004\u00a2\u0006\f\u0012\u0004\bI\u0010F\u001a\u0004\bH\u0010\b\"\u001e\u0010*\u001a\u00020\u0006*\u00020\t8FX\u0087\u0004\u00a2\u0006\f\u0012\u0004\bI\u0010G\u001a\u0004\bH\u0010J\"\u001f\u0010M\u001a\u00020\u0000*\u00020\u00008\u00c6\u0002X\u0087\u0004\u00a2\u0006\f\u0012\u0004\bL\u0010C\u001a\u0004\bK\u0010\u0003\"\u001f\u0010M\u001a\u00020\u0004*\u00020\u00048\u00c6\u0002X\u0087\u0004\u00a2\u0006\f\u0012\u0004\bL\u0010E\u001a\u0004\bK\u0010\u0005\u00a8\u0006N"}, d2={"", "x", "abs", "(D)D", "", "(F)F", "", "n", "(I)I", "", "(J)J", "acos", "acosh", "asin", "asinh", "atan", "y", "atan2", "(DD)D", "(FF)F", "atanh", "cbrt", "ceil", "cos", "cosh", "exp", "expm1", "floor", "hypot", "ln", "ln1p", "base", "log", "log10", "log2", "a", "b", "max", "(II)I", "(JJ)J", "min", "round", "sign", "sin", "sinh", "sqrt", "tan", "tanh", "truncate", "divisor", "IEEErem", "nextDown", "to", "nextTowards", "nextUp", "pow", "(DI)D", "(FI)F", "roundToInt", "(D)I", "(F)I", "roundToLong", "(D)J", "(F)J", "withSign", "getAbsoluteValue", "getAbsoluteValue$annotations", "(D)V", "absoluteValue", "(F)V", "(I)V", "(J)V", "getSign", "getSign$annotations", "(J)I", "getUlp", "getUlp$annotations", "ulp", "kotlin-stdlib"}, xs="kotlin/math/MathKt")
class MathKt__MathJVMKt
extends MathKt__MathHKt {
    @SinceKotlin(version="1.2")
    public static /* synthetic */ void getSign$annotations(long l) {
    }

    @InlineOnly
    @SinceKotlin(version="1.2")
    private static final double ln1p(double x) {
        return Math.log1p(x);
    }

    @InlineOnly
    @SinceKotlin(version="1.2")
    private static final float atanh(float x) {
        return (float)MathKt.atanh((double)x);
    }

    @InlineOnly
    @SinceKotlin(version="1.2")
    private static final float tanh(float x) {
        return (float)Math.tanh(x);
    }

    @InlineOnly
    @SinceKotlin(version="1.2")
    private static final float pow(float $this$pow, float x) {
        return (float)Math.pow($this$pow, x);
    }

    @InlineOnly
    @SinceKotlin(version="1.2")
    private static final float IEEErem(float $this$IEEErem, float divisor) {
        return (float)Math.IEEEremainder($this$IEEErem, divisor);
    }

    @SinceKotlin(version="1.2")
    @InlineOnly
    private static final double ln(double x) {
        return Math.log(x);
    }

    @SinceKotlin(version="1.2")
    public static final long roundToLong(float $this$roundToLong) {
        return MathKt.roundToLong((double)$this$roundToLong);
    }

    @SinceKotlin(version="1.2")
    public static final long roundToLong(double $this$roundToLong) {
        if (Double.isNaN($this$roundToLong)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round($this$roundToLong);
    }

    @InlineOnly
    @SinceKotlin(version="1.2")
    private static final double nextTowards(double $this$nextTowards, double to) {
        return Math.nextAfter($this$nextTowards, to);
    }

    @InlineOnly
    @SinceKotlin(version="1.2")
    private static final float floor(float x) {
        return (float)Math.floor(x);
    }

    @SinceKotlin(version="1.2")
    public static final float log(float x, float base) {
        block4: {
            block3: {
                if (base <= 0.0f) break block3;
                boolean bl = base == 1.0f;
                if (!bl) break block4;
            }
            return Float.NaN;
        }
        return (float)(Math.log(x) / Math.log(base));
    }

    @SinceKotlin(version="1.2")
    @InlineOnly
    private static final double IEEErem(double $this$IEEErem, double divisor) {
        return Math.IEEEremainder($this$IEEErem, divisor);
    }

    @SinceKotlin(version="1.2")
    public static final double log2(double x) {
        return Math.log(x) / Constants.LN2;
    }

    @InlineOnly
    @SinceKotlin(version="1.2")
    public static /* synthetic */ void getAbsoluteValue$annotations(float f) {
    }

    public static final int getSign(long $this$sign) {
        return $this$sign < 0L ? -1 : ($this$sign > 0L ? 1 : 0);
    }

    @InlineOnly
    @SinceKotlin(version="1.2")
    private static final double round(double x) {
        return Math.rint(x);
    }

    @SinceKotlin(version="1.2")
    public static final float log2(float x) {
        return (float)(Math.log(x) / Constants.LN2);
    }

    @SinceKotlin(version="1.2")
    @InlineOnly
    private static final int max(int a2, int b2) {
        return Math.max(a2, b2);
    }

    @SinceKotlin(version="1.2")
    @InlineOnly
    private static final double sin(double x) {
        return Math.sin(x);
    }

    @SinceKotlin(version="1.2")
    public static final double asinh(double x) {
        double d;
        if (x >= Constants.taylor_n_bound) {
            d = x > Constants.upper_taylor_n_bound ? (x > Constants.upper_taylor_2_bound ? Math.log(x) + Constants.LN2 : Math.log(x * (double)2 + 1.0 / (x * (double)2))) : Math.log(x + Math.sqrt(x * x + 1.0));
        } else if (x <= -Constants.taylor_n_bound) {
            d = -MathKt.asinh(-x);
        } else {
            double d2;
            double result = x;
            if (Math.abs(x) >= Constants.taylor_2_bound) {
                d2 = result - x * x * x / (double)6;
            }
            d = d2;
        }
        return d;
    }

    @InlineOnly
    @SinceKotlin(version="1.2")
    private static final double log10(double x) {
        return Math.log10(x);
    }

    private static final double getUlp(double $this$ulp) {
        return Math.ulp($this$ulp);
    }

    @SinceKotlin(version="1.2")
    @InlineOnly
    private static final float round(float x) {
        return (float)Math.rint(x);
    }

    @InlineOnly
    @SinceKotlin(version="1.2")
    private static final double tan(double x) {
        return Math.tan(x);
    }

    @SinceKotlin(version="1.2")
    @InlineOnly
    private static final double sqrt(double x) {
        return Math.sqrt(x);
    }

    @InlineOnly
    @SinceKotlin(version="1.2")
    private static final float hypot(float x, float y) {
        return (float)Math.hypot(x, y);
    }

    @InlineOnly
    @SinceKotlin(version="1.2")
    private static final float acosh(float x) {
        return (float)MathKt.acosh((double)x);
    }

    @SinceKotlin(version="1.2")
    public static final int roundToInt(float $this$roundToInt) {
        if (Float.isNaN($this$roundToInt)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round($this$roundToInt);
    }

    @SinceKotlin(version="1.2")
    @InlineOnly
    private static final double expm1(double x) {
        return Math.expm1(x);
    }

    @InlineOnly
    @SinceKotlin(version="1.2")
    private static final double exp(double x) {
        return Math.exp(x);
    }

    @SinceKotlin(version="1.2")
    @InlineOnly
    private static final double ceil(double x) {
        return Math.ceil(x);
    }

    @SinceKotlin(version="1.2")
    @InlineOnly
    private static final float nextTowards(float $this$nextTowards, float to) {
        return Math.nextAfter($this$nextTowards, (double)to);
    }

    @SinceKotlin(version="1.2")
    @InlineOnly
    private static final float ln(float x) {
        return (float)Math.log(x);
    }

    private static final double getAbsoluteValue(double $this$absoluteValue) {
        return Math.abs($this$absoluteValue);
    }

    @SinceKotlin(version="1.2")
    @InlineOnly
    public static /* synthetic */ void getAbsoluteValue$annotations(long l) {
    }

    @SinceKotlin(version="1.2")
    public static final float truncate(float x) {
        return Float.isNaN(x) || Float.isInfinite(x) ? x : (x > 0.0f ? (float)Math.floor(x) : (float)Math.ceil(x));
    }

    @SinceKotlin(version="1.2")
    @InlineOnly
    private static final float nextUp(float $this$nextUp) {
        return Math.nextUp($this$nextUp);
    }

    public static final int getSign(int $this$sign) {
        return $this$sign < 0 ? -1 : ($this$sign > 0 ? 1 : 0);
    }

    @InlineOnly
    @SinceKotlin(version="1.2")
    private static final double acos(double x) {
        return Math.acos(x);
    }

    @SinceKotlin(version="1.2")
    @InlineOnly
    private static final float log10(float x) {
        return (float)Math.log10(x);
    }

    @SinceKotlin(version="1.2")
    @InlineOnly
    private static final double max(double a2, double b2) {
        return Math.max(a2, b2);
    }

    @SinceKotlin(version="1.2")
    @InlineOnly
    private static final float atan(float x) {
        return (float)Math.atan(x);
    }

    @SinceKotlin(version="1.2")
    @InlineOnly
    private static final float nextDown(float $this$nextDown) {
        return Math.nextAfter($this$nextDown, Double.NEGATIVE_INFINITY);
    }

    @InlineOnly
    @SinceKotlin(version="1.2")
    private static final double nextUp(double $this$nextUp) {
        return Math.nextUp($this$nextUp);
    }

    @InlineOnly
    @SinceKotlin(version="1.2")
    private static final double withSign(double $this$withSign, int sign) {
        return Math.copySign($this$withSign, (double)sign);
    }

    private static final float getAbsoluteValue(float $this$absoluteValue) {
        return Math.abs($this$absoluteValue);
    }

    @InlineOnly
    @SinceKotlin(version="1.2")
    private static final float withSign(float $this$withSign, float sign) {
        return Math.copySign($this$withSign, sign);
    }

    @SinceKotlin(version="1.2")
    @InlineOnly
    public static /* synthetic */ void getSign$annotations(float f) {
    }

    @SinceKotlin(version="1.2")
    public static final int roundToInt(double $this$roundToInt) {
        if (Double.isNaN($this$roundToInt)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return $this$roundToInt > 2.147483647E9 ? Integer.MAX_VALUE : ($this$roundToInt < -2.147483648E9 ? Integer.MIN_VALUE : (int)Math.round($this$roundToInt));
    }

    @SinceKotlin(version="1.2")
    @InlineOnly
    private static final double atan(double x) {
        return Math.atan(x);
    }

    @InlineOnly
    @SinceKotlin(version="1.2")
    private static final long abs(long n) {
        return Math.abs(n);
    }

    @InlineOnly
    @SinceKotlin(version="1.2")
    private static final float pow(float $this$pow, int n) {
        return (float)Math.pow($this$pow, n);
    }

    @WasExperimental(markerClass={ExperimentalStdlibApi.class})
    @InlineOnly
    @SinceKotlin(version="1.8")
    private static final double cbrt(double x) {
        return Math.cbrt(x);
    }

    @InlineOnly
    @SinceKotlin(version="1.2")
    private static final double hypot(double x, double y) {
        return Math.hypot(x, y);
    }

    @SinceKotlin(version="1.2")
    @InlineOnly
    private static final float asinh(float x) {
        return (float)MathKt.asinh((double)x);
    }

    @InlineOnly
    @SinceKotlin(version="1.2")
    private static final double floor(double x) {
        return Math.floor(x);
    }

    @InlineOnly
    @SinceKotlin(version="1.2")
    private static final int min(int a2, int b2) {
        return Math.min(a2, b2);
    }

    /*
     * WARNING - void declaration
     */
    @SinceKotlin(version="1.2")
    public static final double log(double x, double base) {
        void var2_1;
        block4: {
            block3: {
                if (base <= 0.0) break block3;
                boolean bl = base == 1.0;
                if (!bl) break block4;
            }
            return Double.NaN;
        }
        return Math.log(x) / Math.log((double)var2_1);
    }

    /*
     * WARNING - void declaration
     */
    @SinceKotlin(version="1.2")
    public static final double atanh(double x) {
        if (Math.abs(x) < Constants.taylor_n_bound) {
            void var2_1;
            double result = x;
            if (Math.abs(x) > Constants.taylor_2_bound) {
                result += x * x * x / (double)3;
            }
            return (double)var2_1;
        }
        return Math.log((1.0 + x) / (1.0 - x)) / (double)2;
    }

    @InlineOnly
    @SinceKotlin(version="1.2")
    public static /* synthetic */ void getSign$annotations(double d) {
    }

    @InlineOnly
    @SinceKotlin(version="1.2")
    private static final float cos(float x) {
        return (float)Math.cos(x);
    }

    @SinceKotlin(version="1.2")
    @InlineOnly
    private static final float cosh(float x) {
        return (float)Math.cosh(x);
    }

    @SinceKotlin(version="1.2")
    @InlineOnly
    private static final float asin(float x) {
        return (float)Math.asin(x);
    }

    @InlineOnly
    @SinceKotlin(version="1.2")
    private static final double tanh(double x) {
        return Math.tanh(x);
    }

    @InlineOnly
    @SinceKotlin(version="1.2")
    private static final float min(float a2, float b2) {
        return Math.min(a2, b2);
    }

    @InlineOnly
    @SinceKotlin(version="1.2")
    private static final double cosh(double x) {
        return Math.cosh(x);
    }

    @SinceKotlin(version="1.2")
    @InlineOnly
    private static final long max(long a2, long b2) {
        return Math.max(a2, b2);
    }

    @SinceKotlin(version="1.2")
    @InlineOnly
    private static final double asin(double x) {
        return Math.asin(x);
    }

    @SinceKotlin(version="1.2")
    public static final double truncate(double x) {
        return Double.isNaN(x) || Double.isInfinite(x) ? x : (x > 0.0 ? Math.floor(x) : Math.ceil(x));
    }

    /*
     * WARNING - void declaration
     */
    @SinceKotlin(version="1.2")
    public static final double acosh(double x) {
        double d;
        if (x < 1.0) {
            d = Double.NaN;
        } else if (x > Constants.upper_taylor_2_bound) {
            d = Math.log(x) + Constants.LN2;
        } else if (x - 1.0 >= Constants.taylor_n_bound) {
            d = Math.log(x + Math.sqrt(x * x - 1.0));
        } else {
            void var4_2;
            double y;
            double result = y = Math.sqrt(x - 1.0);
            if (y >= Constants.taylor_2_bound) {
                result -= y * y * y / (double)12;
            }
            d = Math.sqrt(2.0) * var4_2;
        }
        return d;
    }

    @SinceKotlin(version="1.2")
    @InlineOnly
    private static final double abs(double x) {
        return Math.abs(x);
    }

    @SinceKotlin(version="1.2")
    @InlineOnly
    private static final double pow(double $this$pow, int n) {
        return Math.pow($this$pow, n);
    }

    @SinceKotlin(version="1.2")
    @InlineOnly
    public static /* synthetic */ void getUlp$annotations(double d) {
    }

    @SinceKotlin(version="1.2")
    @InlineOnly
    private static final float exp(float x) {
        return (float)Math.exp(x);
    }

    @SinceKotlin(version="1.2")
    @InlineOnly
    private static final int abs(int n) {
        return Math.abs(n);
    }

    @SinceKotlin(version="1.2")
    @InlineOnly
    private static final float atan2(float y, float x) {
        return (float)Math.atan2(y, x);
    }

    @WasExperimental(markerClass={ExperimentalStdlibApi.class})
    @SinceKotlin(version="1.8")
    @InlineOnly
    private static final float cbrt(float x) {
        return (float)Math.cbrt(x);
    }

    private static final float getUlp(float $this$ulp) {
        return Math.ulp($this$ulp);
    }

    @SinceKotlin(version="1.2")
    @InlineOnly
    private static final float withSign(float $this$withSign, int sign) {
        return Math.copySign($this$withSign, sign);
    }

    @InlineOnly
    @SinceKotlin(version="1.2")
    private static final double withSign(double $this$withSign, double sign) {
        return Math.copySign($this$withSign, sign);
    }

    @SinceKotlin(version="1.2")
    @InlineOnly
    private static final double sign(double x) {
        return Math.signum(x);
    }

    @SinceKotlin(version="1.2")
    @InlineOnly
    private static final double nextDown(double $this$nextDown) {
        return Math.nextAfter($this$nextDown, Double.NEGATIVE_INFINITY);
    }

    @SinceKotlin(version="1.2")
    @InlineOnly
    private static final float expm1(float x) {
        return (float)Math.expm1(x);
    }

    @InlineOnly
    @SinceKotlin(version="1.2")
    private static final float sign(float x) {
        return Math.signum(x);
    }

    @SinceKotlin(version="1.2")
    public static /* synthetic */ void getSign$annotations(int n) {
    }

    @InlineOnly
    @SinceKotlin(version="1.2")
    private static final float sinh(float x) {
        return (float)Math.sinh(x);
    }

    private static final long getAbsoluteValue(long $this$absoluteValue) {
        return Math.abs($this$absoluteValue);
    }

    @SinceKotlin(version="1.2")
    @InlineOnly
    private static final float max(float a2, float b2) {
        return Math.max(a2, b2);
    }

    @InlineOnly
    @SinceKotlin(version="1.2")
    private static final float acos(float x) {
        return (float)Math.acos(x);
    }

    @SinceKotlin(version="1.2")
    @InlineOnly
    private static final float tan(float x) {
        return (float)Math.tan(x);
    }

    @InlineOnly
    @SinceKotlin(version="1.2")
    private static final double pow(double $this$pow, double x) {
        return Math.pow($this$pow, x);
    }

    private static final int getAbsoluteValue(int $this$absoluteValue) {
        return Math.abs($this$absoluteValue);
    }

    private static final double getSign(double $this$sign) {
        return Math.signum($this$sign);
    }

    @InlineOnly
    @SinceKotlin(version="1.2")
    public static /* synthetic */ void getAbsoluteValue$annotations(double d) {
    }

    @SinceKotlin(version="1.2")
    @InlineOnly
    private static final double sinh(double x) {
        return Math.sinh(x);
    }

    @SinceKotlin(version="1.2")
    @InlineOnly
    private static final double cos(double x) {
        return Math.cos(x);
    }

    @SinceKotlin(version="1.2")
    @InlineOnly
    private static final long min(long a2, long b2) {
        return Math.min(a2, b2);
    }

    @InlineOnly
    @SinceKotlin(version="1.2")
    private static final double min(double a2, double b2) {
        return Math.min(a2, b2);
    }

    @SinceKotlin(version="1.2")
    @InlineOnly
    private static final double atan2(double y, double x) {
        return Math.atan2(y, x);
    }

    @InlineOnly
    @SinceKotlin(version="1.2")
    public static /* synthetic */ void getUlp$annotations(float f) {
    }

    @SinceKotlin(version="1.2")
    @InlineOnly
    private static final float ceil(float x) {
        return (float)Math.ceil(x);
    }

    private static final float getSign(float $this$sign) {
        return Math.signum($this$sign);
    }

    @SinceKotlin(version="1.2")
    @InlineOnly
    public static /* synthetic */ void getAbsoluteValue$annotations(int n) {
    }

    @InlineOnly
    @SinceKotlin(version="1.2")
    private static final float sin(float x) {
        return (float)Math.sin(x);
    }

    @InlineOnly
    @SinceKotlin(version="1.2")
    private static final float abs(float x) {
        return Math.abs(x);
    }

    @InlineOnly
    @SinceKotlin(version="1.2")
    private static final float ln1p(float x) {
        return (float)Math.log1p(x);
    }

    @InlineOnly
    @SinceKotlin(version="1.2")
    private static final float sqrt(float x) {
        return (float)Math.sqrt(x);
    }
}

