/*
 * Decompiled with CFR 0.152.
 */
package kotlin.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.OverloadResolutionByLambdaReturnType;
import kotlin.Pair;
import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt___MapsJvmKt;
import kotlin.internal.HidesMembers;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Metadata(mv={1, 9, 0}, k=5, xi=49, d1={"\u0000\u0086\u0001\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u001f\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000f\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aQ\u0010\u0007\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u001e\u0010\u0006\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0086\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u0007\u0010\b\u001a+\u0010\t\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\u00a2\u0006\u0004\b\t\u0010\n\u001aQ\u0010\t\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u001e\u0010\u0006\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0086\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b\t\u0010\b\u001a@\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u000b\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0087\b\u00a2\u0006\u0004\b\f\u0010\r\u001a=\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u000e\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\u00a2\u0006\u0004\b\u000f\u0010\u0010\u001a.\u0010\u0012\u001a\u00020\u0011\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0087\b\u00a2\u0006\u0004\b\u0012\u0010\u0013\u001aQ\u0010\u0012\u001a\u00020\u0011\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u001e\u0010\u0006\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0086\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u0012\u0010\u0014\u001a]\u0010\u0018\u001a\u00028\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\b\b\u0002\u0010\u0016*\u00020\u0015*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022 \u0010\u0017\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00018\u00020\u0003H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u0018\u0010\u0019\u001a_\u0010\u001a\u001a\u0004\u0018\u00018\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\b\b\u0002\u0010\u0016*\u00020\u0015*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022 \u0010\u0017\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00018\u00020\u0003H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u001a\u0010\u0019\u001ac\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00020\u001b\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0016*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022$\u0010\u0017\u001a \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u000b0\u0003H\u0086\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u001c\u0010\u001d\u001ac\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00020\u001b\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0016*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022$\u0010\u0017\u001a \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u000e0\u0003H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u001e\u0010\u001d\u001aw\u0010\"\u001a\u00028\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0016\"\u0010\b\u0003\u0010 *\n\u0012\u0006\b\u0000\u0012\u00028\u00020\u001f*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010!\u001a\u00028\u00032$\u0010\u0017\u001a \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u000b0\u0003H\u0086\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b\"\u0010#\u001aw\u0010\"\u001a\u00028\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0016\"\u0010\b\u0003\u0010 *\n\u0012\u0006\b\u0000\u0012\u00028\u00020\u001f*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010!\u001a\u00028\u00032$\u0010\u0017\u001a \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u000e0\u0003H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b$\u0010#\u001aQ\u0010'\u001a\u00020%\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u001e\u0010&\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0004\u0012\u00020%0\u0003H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b'\u0010(\u001a]\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00020\u001b\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0016*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u001e\u0010\u0017\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0004\u0012\u00028\u00020\u0003H\u0086\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b)\u0010\u001d\u001ac\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00020\u001b\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\b\b\u0002\u0010\u0016*\u00020\u0015*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022 \u0010\u0017\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00018\u00020\u0003H\u0086\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b*\u0010\u001d\u001aw\u0010+\u001a\u00028\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\b\b\u0002\u0010\u0016*\u00020\u0015\"\u0010\b\u0003\u0010 *\n\u0012\u0006\b\u0000\u0012\u00028\u00020\u001f*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010!\u001a\u00028\u00032 \u0010\u0017\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00018\u00020\u0003H\u0086\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b+\u0010#\u001aq\u0010,\u001a\u00028\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0016\"\u0010\b\u0003\u0010 *\n\u0012\u0006\b\u0000\u0012\u00028\u00020\u001f*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010!\u001a\u00028\u00032\u001e\u0010\u0017\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0004\u0012\u00028\u00020\u0003H\u0086\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b,\u0010#\u001am\u00101\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u000e\b\u0002\u0010\u0016*\b\u0012\u0004\u0012\u00028\u00020-*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u001e\u0010.\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0004\u0012\u00028\u00020\u0003H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b/\u00100\u001ao\u00102\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u000e\b\u0002\u0010\u0016*\b\u0012\u0004\u0012\u00028\u00020-*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u001e\u0010.\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0004\u0012\u00028\u00020\u0003H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b2\u00100\u001aa\u00103\u001a\u00028\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u000e\b\u0002\u0010\u0016*\b\u0012\u0004\u0012\u00028\u00020-*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u001e\u0010.\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0004\u0012\u00028\u00020\u0003H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b3\u00104\u001aQ\u00103\u001a\u000205\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u001e\u0010.\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0004\u0012\u0002050\u0003H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b3\u00106\u001aQ\u00103\u001a\u000207\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u001e\u0010.\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0004\u0012\u0002070\u0003H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b3\u00108\u001ac\u00109\u001a\u0004\u0018\u00018\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u000e\b\u0002\u0010\u0016*\b\u0012\u0004\u0012\u00028\u00020-*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u001e\u0010.\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0004\u0012\u00028\u00020\u0003H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b9\u00104\u001aS\u00109\u001a\u0004\u0018\u000105\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u001e\u0010.\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0004\u0012\u0002050\u0003H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b9\u0010:\u001aS\u00109\u001a\u0004\u0018\u000107\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u001e\u0010.\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0004\u0012\u0002070\u0003H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b9\u0010;\u001as\u0010?\u001a\u00028\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0016*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u001a\u0010>\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00020<j\n\u0012\u0006\b\u0000\u0012\u00028\u0002`=2\u001e\u0010.\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0004\u0012\u00028\u00020\u0003H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b?\u0010@\u001au\u0010A\u001a\u0004\u0018\u00018\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0016*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u001a\u0010>\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00020<j\n\u0012\u0006\b\u0000\u0012\u00028\u0002`=2\u001e\u0010.\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0004\u0012\u00028\u00020\u0003H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\bA\u0010@\u001an\u0010D\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000222\u0010>\u001a.\u0012\u0012\b\u0000\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040<j\u0016\u0012\u0012\b\u0000\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004`=H\u0087\b\u00a2\u0006\u0004\bB\u0010C\u001ap\u0010E\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000222\u0010>\u001a.\u0012\u0012\b\u0000\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040<j\u0016\u0012\u0012\b\u0000\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004`=H\u0087\b\u00a2\u0006\u0004\bE\u0010C\u001am\u0010G\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u000e\b\u0002\u0010\u0016*\b\u0012\u0004\u0012\u00028\u00020-*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u001e\u0010.\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0004\u0012\u00028\u00020\u0003H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\bF\u00100\u001ao\u0010H\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u000e\b\u0002\u0010\u0016*\b\u0012\u0004\u0012\u00028\u00020-*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u001e\u0010.\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0004\u0012\u00028\u00020\u0003H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\bH\u00100\u001aa\u0010I\u001a\u00028\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u000e\b\u0002\u0010\u0016*\b\u0012\u0004\u0012\u00028\u00020-*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u001e\u0010.\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0004\u0012\u00028\u00020\u0003H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\bI\u00104\u001aQ\u0010I\u001a\u000205\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u001e\u0010.\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0004\u0012\u0002050\u0003H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\bI\u00106\u001aQ\u0010I\u001a\u000207\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u001e\u0010.\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0004\u0012\u0002070\u0003H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\bI\u00108\u001ac\u0010J\u001a\u0004\u0018\u00018\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u000e\b\u0002\u0010\u0016*\b\u0012\u0004\u0012\u00028\u00020-*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u001e\u0010.\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0004\u0012\u00028\u00020\u0003H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\bJ\u00104\u001aS\u0010J\u001a\u0004\u0018\u000105\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u001e\u0010.\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0004\u0012\u0002050\u0003H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\bJ\u0010:\u001aS\u0010J\u001a\u0004\u0018\u000107\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u001e\u0010.\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0004\u0012\u0002070\u0003H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\bJ\u0010;\u001as\u0010K\u001a\u00028\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0016*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u001a\u0010>\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00020<j\n\u0012\u0006\b\u0000\u0012\u00028\u0002`=2\u001e\u0010.\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0004\u0012\u00028\u00020\u0003H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\bK\u0010@\u001au\u0010L\u001a\u0004\u0018\u00018\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0016*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u001a\u0010>\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00020<j\n\u0012\u0006\b\u0000\u0012\u00028\u0002`=2\u001e\u0010.\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0004\u0012\u00028\u00020\u0003H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\bL\u0010@\u001an\u0010N\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000222\u0010>\u001a.\u0012\u0012\b\u0000\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040<j\u0016\u0012\u0012\b\u0000\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004`=H\u0087\b\u00a2\u0006\u0004\bM\u0010C\u001ap\u0010O\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000222\u0010>\u001a.\u0012\u0012\b\u0000\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040<j\u0016\u0012\u0012\b\u0000\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004`=H\u0087\b\u00a2\u0006\u0004\bO\u0010C\u001a+\u0010P\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\u00a2\u0006\u0004\bP\u0010\n\u001aQ\u0010P\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u001e\u0010\u0006\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0086\b\u00f8\u0001\u0000\u00a2\u0006\u0004\bP\u0010\b\u001a[\u0010R\u001a\u00028\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0016\b\u0002\u0010Q*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002*\u00028\u00022\u001e\u0010&\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0004\u0012\u00020%0\u0003H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\bR\u0010S\u001ap\u0010X\u001a\u00028\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0016\b\u0002\u0010Q*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002*\u00028\u000223\u0010&\u001a/\u0012\u0013\u0012\u00110\u0011\u00a2\u0006\f\bU\u0012\b\bV\u0012\u0004\b\b(W\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0004\u0012\u00020%0TH\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\bX\u0010Y\u001a=\u0010[\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010Z0\u001b\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\u00a2\u0006\u0004\b[\u0010\\\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006]"}, d2={"K", "V", "", "Lkotlin/Function1;", "", "", "predicate", "all", "(Ljava/util/Map;Lkotlin/jvm/functions/Function1;)Z", "any", "(Ljava/util/Map;)Z", "", "asIterable", "(Ljava/util/Map;)Ljava/lang/Iterable;", "Lkotlin/sequences/Sequence;", "asSequence", "(Ljava/util/Map;)Lkotlin/sequences/Sequence;", "", "count", "(Ljava/util/Map;)I", "(Ljava/util/Map;Lkotlin/jvm/functions/Function1;)I", "", "R", "transform", "firstNotNullOf", "(Ljava/util/Map;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "firstNotNullOfOrNull", "", "flatMap", "(Ljava/util/Map;Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "flatMapSequence", "", "C", "destination", "flatMapTo", "(Ljava/util/Map;Ljava/util/Collection;Lkotlin/jvm/functions/Function1;)Ljava/util/Collection;", "flatMapSequenceTo", "", "action", "forEach", "(Ljava/util/Map;Lkotlin/jvm/functions/Function1;)V", "map", "mapNotNull", "mapNotNullTo", "mapTo", "", "selector", "maxByOrThrow", "(Ljava/util/Map;Lkotlin/jvm/functions/Function1;)Ljava/util/Map$Entry;", "maxBy", "maxByOrNull", "maxOf", "(Ljava/util/Map;Lkotlin/jvm/functions/Function1;)Ljava/lang/Comparable;", "", "(Ljava/util/Map;Lkotlin/jvm/functions/Function1;)D", "", "(Ljava/util/Map;Lkotlin/jvm/functions/Function1;)F", "maxOfOrNull", "(Ljava/util/Map;Lkotlin/jvm/functions/Function1;)Ljava/lang/Double;", "(Ljava/util/Map;Lkotlin/jvm/functions/Function1;)Ljava/lang/Float;", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "maxOfWith", "(Ljava/util/Map;Ljava/util/Comparator;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "maxOfWithOrNull", "maxWithOrThrow", "(Ljava/util/Map;Ljava/util/Comparator;)Ljava/util/Map$Entry;", "maxWith", "maxWithOrNull", "minByOrThrow", "minBy", "minByOrNull", "minOf", "minOfOrNull", "minOfWith", "minOfWithOrNull", "minWithOrThrow", "minWith", "minWithOrNull", "none", "M", "onEach", "(Ljava/util/Map;Lkotlin/jvm/functions/Function1;)Ljava/util/Map;", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "index", "onEachIndexed", "(Ljava/util/Map;Lkotlin/jvm/functions/Function2;)Ljava/util/Map;", "Lkotlin/Pair;", "toList", "(Ljava/util/Map;)Ljava/util/List;", "kotlin-stdlib"}, xs="kotlin/collections/MapsKt")
class MapsKt___MapsKt
extends MapsKt___MapsJvmKt {
    public static final <K, V> boolean none(@NotNull Map<? extends K, ? extends V> $this$none) {
        Intrinsics.checkNotNullParameter($this$none, "<this>");
        return $this$none.isEmpty();
    }

    public static final <K, V> boolean none(@NotNull Map<? extends K, ? extends V> $this$none, @NotNull Function1<? super Map.Entry<? extends K, ? extends V>, Boolean> predicate) {
        Intrinsics.checkNotNullParameter($this$none, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        boolean $i$f$none = false;
        if ($this$none.isEmpty()) {
            return true;
        }
        Iterator<Map.Entry<K, V>> iterator2 = $this$none.entrySet().iterator();
        while (iterator2.hasNext()) {
            Map.Entry<? extends K, ? extends V> element = iterator2.next();
            if (!predicate.invoke(element).booleanValue()) continue;
            return false;
        }
        return true;
    }

    /*
     * WARNING - void declaration
     */
    @NotNull
    public static final <K, V, R> List<R> map(@NotNull Map<? extends K, ? extends V> $this$map, @NotNull Function1<? super Map.Entry<? extends K, ? extends V>, ? extends R> transform) {
        void var4_4;
        void $this$mapTo$iv;
        Intrinsics.checkNotNullParameter($this$map, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        boolean $i$f$map = false;
        Map<K, V> map = $this$map;
        Collection destination$iv = new ArrayList($this$map.size());
        boolean $i$f$mapTo = false;
        for (Map.Entry item$iv : $this$mapTo$iv.entrySet()) {
            destination$iv.add(transform.invoke(item$iv));
        }
        return (List)var4_4;
    }

    @OverloadResolutionByLambdaReturnType
    @SinceKotlin(version="1.4")
    @InlineOnly
    private static final <K, V, R extends Comparable<? super R>> R maxOf(Map<? extends K, ? extends V> $this$maxOf, Function1<? super Map.Entry<? extends K, ? extends V>, ? extends R> selector) {
        Intrinsics.checkNotNullParameter($this$maxOf, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator iterator2 = ((Iterable)$this$maxOf.entrySet()).iterator();
        if (!iterator2.hasNext()) {
            throw new NoSuchElementException();
        }
        Comparable comparable = (Comparable)selector.invoke((Map.Entry<K, V>)iterator2.next());
        while (iterator2.hasNext()) {
            Comparable comparable2 = (Comparable)selector.invoke((Map.Entry<K, V>)iterator2.next());
            if (comparable.compareTo(comparable2) >= 0) continue;
            comparable = comparable2;
        }
        return (R)comparable;
    }

    /*
     * WARNING - void declaration
     */
    @NotNull
    public static final <K, V, R> List<R> flatMap(@NotNull Map<? extends K, ? extends V> $this$flatMap, @NotNull Function1<? super Map.Entry<? extends K, ? extends V>, ? extends Iterable<? extends R>> transform) {
        void var4_4;
        void $this$flatMapTo$iv;
        Intrinsics.checkNotNullParameter($this$flatMap, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        boolean $i$f$flatMap = false;
        Map<? extends K, ? extends V> map = $this$flatMap;
        Collection destination$iv = new ArrayList();
        boolean $i$f$flatMapTo = false;
        for (Map.Entry element$iv : $this$flatMapTo$iv.entrySet()) {
            Iterable<? extends R> list$iv = transform.invoke(element$iv);
            CollectionsKt.addAll(destination$iv, list$iv);
        }
        return (List)var4_4;
    }

    @InlineOnly
    @SinceKotlin(version="1.4")
    @OverloadResolutionByLambdaReturnType
    private static final <K, V, R extends Comparable<? super R>> R maxOfOrNull(Map<? extends K, ? extends V> $this$maxOfOrNull, Function1<? super Map.Entry<? extends K, ? extends V>, ? extends R> selector) {
        Comparable comparable;
        Intrinsics.checkNotNullParameter($this$maxOfOrNull, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator iterator2 = ((Iterable)$this$maxOfOrNull.entrySet()).iterator();
        if (!iterator2.hasNext()) {
            comparable = null;
        } else {
            Comparable comparable2 = (Comparable)selector.invoke((Map.Entry<K, V>)iterator2.next());
            while (iterator2.hasNext()) {
                Comparable comparable3 = (Comparable)selector.invoke((Map.Entry<K, V>)iterator2.next());
                if (comparable2.compareTo(comparable3) >= 0) continue;
                comparable2 = comparable3;
            }
            comparable = comparable2;
        }
        return (R)comparable;
    }

    @NotNull
    @SinceKotlin(version="1.1")
    public static final <K, V, M extends Map<? extends K, ? extends V>> M onEach(@NotNull M $this$onEach, @NotNull Function1<? super Map.Entry<? extends K, ? extends V>, Unit> action) {
        Intrinsics.checkNotNullParameter($this$onEach, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        boolean $i$f$onEach = false;
        M m = $this$onEach;
        M $this$onEach_u24lambda_u242 = m;
        boolean bl = false;
        for (Map.Entry<? extends K, ? extends V> entry : $this$onEach_u24lambda_u242.entrySet()) {
            action.invoke(entry);
        }
        return m;
    }

    /*
     * WARNING - void declaration
     */
    @SinceKotlin(version="1.4")
    @NotNull
    @OverloadResolutionByLambdaReturnType
    @JvmName(name="flatMapSequenceTo")
    public static final <K, V, R, C extends Collection<? super R>> C flatMapSequenceTo(@NotNull Map<? extends K, ? extends V> $this$flatMapTo, @NotNull C destination, @NotNull Function1<? super Map.Entry<? extends K, ? extends V>, ? extends Sequence<? extends R>> transform) {
        void var1_1;
        Intrinsics.checkNotNullParameter($this$flatMapTo, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        boolean $i$f$flatMapSequenceTo = false;
        for (Map.Entry<K, V> entry : $this$flatMapTo.entrySet()) {
            Sequence<R> list = transform.invoke(entry);
            CollectionsKt.addAll(destination, list);
        }
        return var1_1;
    }

    @OverloadResolutionByLambdaReturnType
    @SinceKotlin(version="1.4")
    @InlineOnly
    private static final <K, V> float minOf(Map<? extends K, ? extends V> $this$minOf, Function1<? super Map.Entry<? extends K, ? extends V>, Float> selector) {
        Intrinsics.checkNotNullParameter($this$minOf, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator iterator2 = ((Iterable)$this$minOf.entrySet()).iterator();
        if (!iterator2.hasNext()) {
            throw new NoSuchElementException();
        }
        float f = ((Number)selector.invoke((Map.Entry<K, V>)iterator2.next())).floatValue();
        while (iterator2.hasNext()) {
            float f2 = ((Number)selector.invoke((Map.Entry<K, V>)iterator2.next())).floatValue();
            f = Math.min(f, f2);
        }
        return f;
    }

    /*
     * WARNING - void declaration
     */
    @NotNull
    public static final <K, V> List<Pair<K, V>> toList(@NotNull Map<? extends K, ? extends V> $this$toList) {
        void var3_4;
        Intrinsics.checkNotNullParameter($this$toList, "<this>");
        if ($this$toList.size() == 0) {
            return CollectionsKt.emptyList();
        }
        Iterator<Map.Entry<K, V>> iterator2 = $this$toList.entrySet().iterator();
        if (!iterator2.hasNext()) {
            return CollectionsKt.emptyList();
        }
        Map.Entry<K, V> first = iterator2.next();
        if (!iterator2.hasNext()) {
            Map.Entry<K, V> entry = first;
            return CollectionsKt.listOf(new Pair<K, V>(entry.getKey(), entry.getValue()));
        }
        ArrayList<Pair<K, V>> result = new ArrayList<Pair<K, V>>($this$toList.size());
        Map.Entry<K, V> entry = first;
        result.add(new Pair<K, V>(entry.getKey(), entry.getValue()));
        do {
            entry = iterator2.next();
            result.add(new Pair<K, V>(entry.getKey(), entry.getValue()));
        } while (iterator2.hasNext());
        return (List)var3_4;
    }

    @InlineOnly
    @SinceKotlin(version="1.4")
    private static final <K, V> Map.Entry<K, V> minWithOrNull(Map<? extends K, ? extends V> $this$minWithOrNull, Comparator<? super Map.Entry<? extends K, ? extends V>> comparator) {
        Intrinsics.checkNotNullParameter($this$minWithOrNull, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return CollectionsKt.minWithOrNull((Iterable)$this$minWithOrNull.entrySet(), comparator);
    }

    /*
     * WARNING - void declaration
     */
    public static final <K, V> int count(@NotNull Map<? extends K, ? extends V> $this$count, @NotNull Function1<? super Map.Entry<? extends K, ? extends V>, Boolean> predicate) {
        void var3_3;
        Intrinsics.checkNotNullParameter($this$count, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        boolean $i$f$count = false;
        if ($this$count.isEmpty()) {
            return 0;
        }
        int count = 0;
        for (Map.Entry<K, V> entry : $this$count.entrySet()) {
            if (!predicate.invoke(entry).booleanValue()) continue;
            ++count;
        }
        return (int)var3_3;
    }

    /*
     * WARNING - void declaration
     */
    @SinceKotlin(version="1.5")
    @InlineOnly
    private static final <K, V, R> R firstNotNullOfOrNull(Map<? extends K, ? extends V> $this$firstNotNullOfOrNull, Function1<? super Map.Entry<? extends K, ? extends V>, ? extends R> transform) {
        Intrinsics.checkNotNullParameter($this$firstNotNullOfOrNull, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        Iterator<Map.Entry<K, V>> iterator2 = $this$firstNotNullOfOrNull.entrySet().iterator();
        while (iterator2.hasNext()) {
            void var4_4;
            Map.Entry<? extends K, ? extends V> element = iterator2.next();
            R result = transform.invoke(element);
            if (result == null) continue;
            return var4_4;
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    @SinceKotlin(version="1.7")
    @InlineOnly
    @JvmName(name="maxByOrThrow")
    private static final <K, V, R extends Comparable<? super R>> Map.Entry<K, V> maxByOrThrow(Map<? extends K, ? extends V> $this$maxBy, Function1<? super Map.Entry<? extends K, ? extends V>, ? extends R> selector) {
        Object t;
        Intrinsics.checkNotNullParameter($this$maxBy, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterable $this$maxBy$iv = $this$maxBy.entrySet();
        boolean $i$f$maxByOrThrow = false;
        Iterator iterator$iv = $this$maxBy$iv.iterator();
        if (!iterator$iv.hasNext()) {
            throw new NoSuchElementException();
        }
        Object maxElem$iv = iterator$iv.next();
        if (!iterator$iv.hasNext()) {
            t = maxElem$iv;
        } else {
            void var5_5;
            Comparable maxValue$iv = (Comparable)selector.invoke((Map.Entry<K, V>)maxElem$iv);
            do {
                Object e$iv;
                Comparable v$iv;
                if (maxValue$iv.compareTo(v$iv = (Comparable)selector.invoke((Map.Entry<K, V>)(e$iv = iterator$iv.next()))) >= 0) continue;
                maxElem$iv = e$iv;
                maxValue$iv = v$iv;
            } while (iterator$iv.hasNext());
            t = var5_5;
        }
        return (Map.Entry)t;
    }

    @SinceKotlin(version="1.7")
    @JvmName(name="maxWithOrThrow")
    @InlineOnly
    private static final <K, V> Map.Entry<K, V> maxWithOrThrow(Map<? extends K, ? extends V> $this$maxWith, Comparator<? super Map.Entry<? extends K, ? extends V>> comparator) {
        Intrinsics.checkNotNullParameter($this$maxWith, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return CollectionsKt.maxWithOrThrow((Iterable)$this$maxWith.entrySet(), comparator);
    }

    /*
     * WARNING - void declaration
     */
    @InlineOnly
    @SinceKotlin(version="1.4")
    private static final <K, V, R extends Comparable<? super R>> Map.Entry<K, V> minByOrNull(Map<? extends K, ? extends V> $this$minByOrNull, Function1<? super Map.Entry<? extends K, ? extends V>, ? extends R> selector) {
        Object v0;
        Intrinsics.checkNotNullParameter($this$minByOrNull, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterable $this$minByOrNull$iv = $this$minByOrNull.entrySet();
        boolean $i$f$minByOrNull = false;
        Iterator iterator$iv = $this$minByOrNull$iv.iterator();
        if (!iterator$iv.hasNext()) {
            v0 = null;
        } else {
            Object minElem$iv = iterator$iv.next();
            if (!iterator$iv.hasNext()) {
                v0 = minElem$iv;
            } else {
                void var5_5;
                Comparable minValue$iv = (Comparable)selector.invoke((Map.Entry<K, V>)minElem$iv);
                do {
                    Object e$iv;
                    Comparable v$iv;
                    if (minValue$iv.compareTo(v$iv = (Comparable)selector.invoke((Map.Entry<K, V>)(e$iv = iterator$iv.next()))) <= 0) continue;
                    minElem$iv = e$iv;
                    minValue$iv = v$iv;
                } while (iterator$iv.hasNext());
                v0 = var5_5;
            }
        }
        return v0;
    }

    /*
     * WARNING - void declaration
     */
    @SinceKotlin(version="1.7")
    @JvmName(name="minByOrThrow")
    @InlineOnly
    private static final <K, V, R extends Comparable<? super R>> Map.Entry<K, V> minByOrThrow(Map<? extends K, ? extends V> $this$minBy, Function1<? super Map.Entry<? extends K, ? extends V>, ? extends R> selector) {
        Object t;
        Intrinsics.checkNotNullParameter($this$minBy, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterable $this$minBy$iv = $this$minBy.entrySet();
        boolean $i$f$minByOrThrow = false;
        Iterator iterator$iv = $this$minBy$iv.iterator();
        if (!iterator$iv.hasNext()) {
            throw new NoSuchElementException();
        }
        Object minElem$iv = iterator$iv.next();
        if (!iterator$iv.hasNext()) {
            t = minElem$iv;
        } else {
            void var5_5;
            Comparable minValue$iv = (Comparable)selector.invoke((Map.Entry<K, V>)minElem$iv);
            do {
                Object e$iv;
                Comparable v$iv;
                if (minValue$iv.compareTo(v$iv = (Comparable)selector.invoke((Map.Entry<K, V>)(e$iv = iterator$iv.next()))) <= 0) continue;
                minElem$iv = e$iv;
                minValue$iv = v$iv;
            } while (iterator$iv.hasNext());
            t = var5_5;
        }
        return (Map.Entry)t;
    }

    /*
     * WARNING - void declaration
     */
    @NotNull
    public static final <K, V, R, C extends Collection<? super R>> C mapTo(@NotNull Map<? extends K, ? extends V> $this$mapTo, @NotNull C destination, @NotNull Function1<? super Map.Entry<? extends K, ? extends V>, ? extends R> transform) {
        void var1_1;
        Intrinsics.checkNotNullParameter($this$mapTo, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        boolean $i$f$mapTo = false;
        for (Map.Entry<K, V> entry : $this$mapTo.entrySet()) {
            destination.add(transform.invoke(entry));
        }
        return var1_1;
    }

    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    @SinceKotlin(version="1.4")
    private static final <K, V, R> R minOfWithOrNull(Map<? extends K, ? extends V> $this$minOfWithOrNull, Comparator<? super R> comparator, Function1<? super Map.Entry<? extends K, ? extends V>, ? extends R> selector) {
        R r;
        Intrinsics.checkNotNullParameter($this$minOfWithOrNull, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator iterator2 = ((Iterable)$this$minOfWithOrNull.entrySet()).iterator();
        if (!iterator2.hasNext()) {
            r = null;
        } else {
            R r2 = selector.invoke((Map.Entry<K, V>)iterator2.next());
            while (iterator2.hasNext()) {
                R r3 = selector.invoke((Map.Entry<K, V>)iterator2.next());
                if (comparator.compare(r2, r3) <= 0) continue;
                r2 = r3;
            }
            r = r2;
        }
        return r;
    }

    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    @SinceKotlin(version="1.4")
    private static final <K, V> double minOf(Map<? extends K, ? extends V> $this$minOf, Function1<? super Map.Entry<? extends K, ? extends V>, Double> selector) {
        Intrinsics.checkNotNullParameter($this$minOf, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator iterator2 = ((Iterable)$this$minOf.entrySet()).iterator();
        if (!iterator2.hasNext()) {
            throw new NoSuchElementException();
        }
        double d = ((Number)selector.invoke((Map.Entry<K, V>)iterator2.next())).doubleValue();
        while (iterator2.hasNext()) {
            double d2 = ((Number)selector.invoke((Map.Entry<K, V>)iterator2.next())).doubleValue();
            d = Math.min(d, d2);
        }
        return d;
    }

    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    @SinceKotlin(version="1.4")
    private static final <K, V, R extends Comparable<? super R>> R minOf(Map<? extends K, ? extends V> $this$minOf, Function1<? super Map.Entry<? extends K, ? extends V>, ? extends R> selector) {
        Intrinsics.checkNotNullParameter($this$minOf, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator iterator2 = ((Iterable)$this$minOf.entrySet()).iterator();
        if (!iterator2.hasNext()) {
            throw new NoSuchElementException();
        }
        Comparable comparable = (Comparable)selector.invoke((Map.Entry<K, V>)iterator2.next());
        while (iterator2.hasNext()) {
            Comparable comparable2 = (Comparable)selector.invoke((Map.Entry<K, V>)iterator2.next());
            if (comparable.compareTo(comparable2) <= 0) continue;
            comparable = comparable2;
        }
        return (R)comparable;
    }

    @InlineOnly
    @SinceKotlin(version="1.4")
    @OverloadResolutionByLambdaReturnType
    private static final <K, V> float maxOf(Map<? extends K, ? extends V> $this$maxOf, Function1<? super Map.Entry<? extends K, ? extends V>, Float> selector) {
        Intrinsics.checkNotNullParameter($this$maxOf, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator iterator2 = ((Iterable)$this$maxOf.entrySet()).iterator();
        if (!iterator2.hasNext()) {
            throw new NoSuchElementException();
        }
        float f = ((Number)selector.invoke((Map.Entry<K, V>)iterator2.next())).floatValue();
        while (iterator2.hasNext()) {
            float f2 = ((Number)selector.invoke((Map.Entry<K, V>)iterator2.next())).floatValue();
            f = Math.max(f, f2);
        }
        return f;
    }

    @InlineOnly
    @SinceKotlin(version="1.7")
    @JvmName(name="minWithOrThrow")
    private static final <K, V> Map.Entry<K, V> minWithOrThrow(Map<? extends K, ? extends V> $this$minWith, Comparator<? super Map.Entry<? extends K, ? extends V>> comparator) {
        Intrinsics.checkNotNullParameter($this$minWith, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return CollectionsKt.minWithOrThrow((Iterable)$this$minWith.entrySet(), comparator);
    }

    @InlineOnly
    @SinceKotlin(version="1.5")
    private static final <K, V, R> R firstNotNullOf(Map<? extends K, ? extends V> $this$firstNotNullOf, Function1<? super Map.Entry<? extends K, ? extends V>, ? extends R> transform) {
        R r;
        block3: {
            Intrinsics.checkNotNullParameter($this$firstNotNullOf, "<this>");
            Intrinsics.checkNotNullParameter(transform, "transform");
            Iterator<Map.Entry<K, V>> iterator2 = $this$firstNotNullOf.entrySet().iterator();
            while (iterator2.hasNext()) {
                R r2 = transform.invoke(iterator2.next());
                r = r2;
                if (r2 == null) {
                    continue;
                }
                break block3;
            }
            r = null;
        }
        if (r == null) {
            throw new NoSuchElementException("No element of the map was transformed to a non-null value.");
        }
        return r;
    }

    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    @SinceKotlin(version="1.4")
    private static final <K, V> Float minOfOrNull(Map<? extends K, ? extends V> $this$minOfOrNull, Function1<? super Map.Entry<? extends K, ? extends V>, Float> selector) {
        Float f;
        Intrinsics.checkNotNullParameter($this$minOfOrNull, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator iterator2 = ((Iterable)$this$minOfOrNull.entrySet()).iterator();
        if (!iterator2.hasNext()) {
            f = null;
        } else {
            float f2 = ((Number)selector.invoke((Map.Entry<K, V>)iterator2.next())).floatValue();
            while (iterator2.hasNext()) {
                float f3 = ((Number)selector.invoke((Map.Entry<K, V>)iterator2.next())).floatValue();
                f2 = Math.min(f2, f3);
            }
            f = Float.valueOf(f2);
        }
        return f;
    }

    @InlineOnly
    private static final <K, V> Iterable<Map.Entry<K, V>> asIterable(Map<? extends K, ? extends V> $this$asIterable) {
        Intrinsics.checkNotNullParameter($this$asIterable, "<this>");
        return $this$asIterable.entrySet();
    }

    public static final <K, V> boolean all(@NotNull Map<? extends K, ? extends V> $this$all, @NotNull Function1<? super Map.Entry<? extends K, ? extends V>, Boolean> predicate) {
        Intrinsics.checkNotNullParameter($this$all, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        boolean $i$f$all = false;
        if ($this$all.isEmpty()) {
            return true;
        }
        Iterator<Map.Entry<K, V>> iterator2 = $this$all.entrySet().iterator();
        while (iterator2.hasNext()) {
            Map.Entry<? extends K, ? extends V> element = iterator2.next();
            if (predicate.invoke(element).booleanValue()) continue;
            return false;
        }
        return true;
    }

    @OverloadResolutionByLambdaReturnType
    @SinceKotlin(version="1.4")
    @InlineOnly
    private static final <K, V, R> R minOfWith(Map<? extends K, ? extends V> $this$minOfWith, Comparator<? super R> comparator, Function1<? super Map.Entry<? extends K, ? extends V>, ? extends R> selector) {
        Intrinsics.checkNotNullParameter($this$minOfWith, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator iterator2 = ((Iterable)$this$minOfWith.entrySet()).iterator();
        if (!iterator2.hasNext()) {
            throw new NoSuchElementException();
        }
        R r = selector.invoke((Map.Entry<K, V>)iterator2.next());
        while (iterator2.hasNext()) {
            R r2 = selector.invoke((Map.Entry<K, V>)iterator2.next());
            if (comparator.compare(r, r2) <= 0) continue;
            r = r2;
        }
        return r;
    }

    @InlineOnly
    @SinceKotlin(version="1.4")
    @OverloadResolutionByLambdaReturnType
    private static final <K, V, R> R maxOfWithOrNull(Map<? extends K, ? extends V> $this$maxOfWithOrNull, Comparator<? super R> comparator, Function1<? super Map.Entry<? extends K, ? extends V>, ? extends R> selector) {
        R r;
        Intrinsics.checkNotNullParameter($this$maxOfWithOrNull, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator iterator2 = ((Iterable)$this$maxOfWithOrNull.entrySet()).iterator();
        if (!iterator2.hasNext()) {
            r = null;
        } else {
            R r2 = selector.invoke((Map.Entry<K, V>)iterator2.next());
            while (iterator2.hasNext()) {
                R r3 = selector.invoke((Map.Entry<K, V>)iterator2.next());
                if (comparator.compare(r2, r3) >= 0) continue;
                r2 = r3;
            }
            r = r2;
        }
        return r;
    }

    @InlineOnly
    @SinceKotlin(version="1.4")
    @OverloadResolutionByLambdaReturnType
    private static final <K, V, R extends Comparable<? super R>> R minOfOrNull(Map<? extends K, ? extends V> $this$minOfOrNull, Function1<? super Map.Entry<? extends K, ? extends V>, ? extends R> selector) {
        Comparable comparable;
        Intrinsics.checkNotNullParameter($this$minOfOrNull, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator iterator2 = ((Iterable)$this$minOfOrNull.entrySet()).iterator();
        if (!iterator2.hasNext()) {
            comparable = null;
        } else {
            Comparable comparable2 = (Comparable)selector.invoke((Map.Entry<K, V>)iterator2.next());
            while (iterator2.hasNext()) {
                Comparable comparable3 = (Comparable)selector.invoke((Map.Entry<K, V>)iterator2.next());
                if (comparable2.compareTo(comparable3) <= 0) continue;
                comparable2 = comparable3;
            }
            comparable = comparable2;
        }
        return (R)comparable;
    }

    @OverloadResolutionByLambdaReturnType
    @SinceKotlin(version="1.4")
    @InlineOnly
    private static final <K, V> Double maxOfOrNull(Map<? extends K, ? extends V> $this$maxOfOrNull, Function1<? super Map.Entry<? extends K, ? extends V>, Double> selector) {
        Double d;
        Intrinsics.checkNotNullParameter($this$maxOfOrNull, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator iterator2 = ((Iterable)$this$maxOfOrNull.entrySet()).iterator();
        if (!iterator2.hasNext()) {
            d = null;
        } else {
            double d2 = ((Number)selector.invoke((Map.Entry<K, V>)iterator2.next())).doubleValue();
            while (iterator2.hasNext()) {
                double d3 = ((Number)selector.invoke((Map.Entry<K, V>)iterator2.next())).doubleValue();
                d2 = Math.max(d2, d3);
            }
            d = d2;
        }
        return d;
    }

    @SinceKotlin(version="1.4")
    @InlineOnly
    private static final <K, V> Map.Entry<K, V> maxWithOrNull(Map<? extends K, ? extends V> $this$maxWithOrNull, Comparator<? super Map.Entry<? extends K, ? extends V>> comparator) {
        Intrinsics.checkNotNullParameter($this$maxWithOrNull, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return CollectionsKt.maxWithOrNull((Iterable)$this$maxWithOrNull.entrySet(), comparator);
    }

    /*
     * WARNING - void declaration
     */
    @NotNull
    public static final <K, V, R> List<R> mapNotNull(@NotNull Map<? extends K, ? extends V> $this$mapNotNull, @NotNull Function1<? super Map.Entry<? extends K, ? extends V>, ? extends R> transform) {
        void var4_4;
        void $this$mapNotNullTo$iv;
        Intrinsics.checkNotNullParameter($this$mapNotNull, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        boolean $i$f$mapNotNull = false;
        Map<? extends K, ? extends V> map = $this$mapNotNull;
        Collection destination$iv = new ArrayList();
        boolean $i$f$mapNotNullTo = false;
        void $this$forEach$iv$iv = $this$mapNotNullTo$iv;
        boolean $i$f$forEach = false;
        Iterator iterator2 = $this$forEach$iv$iv.entrySet().iterator();
        while (iterator2.hasNext()) {
            R r;
            Map.Entry element$iv$iv;
            Map.Entry element$iv = element$iv$iv = iterator2.next();
            boolean bl = false;
            if (transform.invoke(element$iv) == null) continue;
            R it$iv = r;
            boolean bl2 = false;
            destination$iv.add(it$iv);
        }
        return (List)var4_4;
    }

    @HidesMembers
    public static final <K, V> void forEach(@NotNull Map<? extends K, ? extends V> $this$forEach, @NotNull Function1<? super Map.Entry<? extends K, ? extends V>, Unit> action) {
        Intrinsics.checkNotNullParameter($this$forEach, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        boolean $i$f$forEach = false;
        Iterator<Map.Entry<K, V>> iterator2 = $this$forEach.entrySet().iterator();
        while (iterator2.hasNext()) {
            Map.Entry<? extends K, ? extends V> element = iterator2.next();
            action.invoke(element);
        }
    }

    @NotNull
    public static final <K, V> Sequence<Map.Entry<K, V>> asSequence(@NotNull Map<? extends K, ? extends V> $this$asSequence) {
        Intrinsics.checkNotNullParameter($this$asSequence, "<this>");
        return CollectionsKt.asSequence((Iterable)$this$asSequence.entrySet());
    }

    @InlineOnly
    @SinceKotlin(version="1.4")
    @OverloadResolutionByLambdaReturnType
    private static final <K, V> Double minOfOrNull(Map<? extends K, ? extends V> $this$minOfOrNull, Function1<? super Map.Entry<? extends K, ? extends V>, Double> selector) {
        Double d;
        Intrinsics.checkNotNullParameter($this$minOfOrNull, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator iterator2 = ((Iterable)$this$minOfOrNull.entrySet()).iterator();
        if (!iterator2.hasNext()) {
            d = null;
        } else {
            double d2 = ((Number)selector.invoke((Map.Entry<K, V>)iterator2.next())).doubleValue();
            while (iterator2.hasNext()) {
                double d3 = ((Number)selector.invoke((Map.Entry<K, V>)iterator2.next())).doubleValue();
                d2 = Math.min(d2, d3);
            }
            d = d2;
        }
        return d;
    }

    public static final <K, V> boolean any(@NotNull Map<? extends K, ? extends V> $this$any, @NotNull Function1<? super Map.Entry<? extends K, ? extends V>, Boolean> predicate) {
        Intrinsics.checkNotNullParameter($this$any, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        boolean $i$f$any = false;
        if ($this$any.isEmpty()) {
            return false;
        }
        Iterator<Map.Entry<K, V>> iterator2 = $this$any.entrySet().iterator();
        while (iterator2.hasNext()) {
            Map.Entry<? extends K, ? extends V> element = iterator2.next();
            if (!predicate.invoke(element).booleanValue()) continue;
            return true;
        }
        return false;
    }

    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    @SinceKotlin(version="1.4")
    private static final <K, V> Float maxOfOrNull(Map<? extends K, ? extends V> $this$maxOfOrNull, Function1<? super Map.Entry<? extends K, ? extends V>, Float> selector) {
        Float f;
        Intrinsics.checkNotNullParameter($this$maxOfOrNull, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator iterator2 = ((Iterable)$this$maxOfOrNull.entrySet()).iterator();
        if (!iterator2.hasNext()) {
            f = null;
        } else {
            float f2 = ((Number)selector.invoke((Map.Entry<K, V>)iterator2.next())).floatValue();
            while (iterator2.hasNext()) {
                float f3 = ((Number)selector.invoke((Map.Entry<K, V>)iterator2.next())).floatValue();
                f2 = Math.max(f2, f3);
            }
            f = Float.valueOf(f2);
        }
        return f;
    }

    @InlineOnly
    @SinceKotlin(version="1.4")
    @OverloadResolutionByLambdaReturnType
    private static final <K, V> double maxOf(Map<? extends K, ? extends V> $this$maxOf, Function1<? super Map.Entry<? extends K, ? extends V>, Double> selector) {
        Intrinsics.checkNotNullParameter($this$maxOf, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator iterator2 = ((Iterable)$this$maxOf.entrySet()).iterator();
        if (!iterator2.hasNext()) {
            throw new NoSuchElementException();
        }
        double d = ((Number)selector.invoke((Map.Entry<K, V>)iterator2.next())).doubleValue();
        while (iterator2.hasNext()) {
            double d2 = ((Number)selector.invoke((Map.Entry<K, V>)iterator2.next())).doubleValue();
            d = Math.max(d, d2);
        }
        return d;
    }

    @InlineOnly
    private static final <K, V> int count(Map<? extends K, ? extends V> $this$count) {
        Intrinsics.checkNotNullParameter($this$count, "<this>");
        return $this$count.size();
    }

    /*
     * WARNING - void declaration
     */
    @InlineOnly
    @SinceKotlin(version="1.4")
    private static final <K, V, R extends Comparable<? super R>> Map.Entry<K, V> maxByOrNull(Map<? extends K, ? extends V> $this$maxByOrNull, Function1<? super Map.Entry<? extends K, ? extends V>, ? extends R> selector) {
        Object v0;
        Intrinsics.checkNotNullParameter($this$maxByOrNull, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterable $this$maxByOrNull$iv = $this$maxByOrNull.entrySet();
        boolean $i$f$maxByOrNull = false;
        Iterator iterator$iv = $this$maxByOrNull$iv.iterator();
        if (!iterator$iv.hasNext()) {
            v0 = null;
        } else {
            Object maxElem$iv = iterator$iv.next();
            if (!iterator$iv.hasNext()) {
                v0 = maxElem$iv;
            } else {
                void var5_5;
                Comparable maxValue$iv = (Comparable)selector.invoke((Map.Entry<K, V>)maxElem$iv);
                do {
                    Object e$iv;
                    Comparable v$iv;
                    if (maxValue$iv.compareTo(v$iv = (Comparable)selector.invoke((Map.Entry<K, V>)(e$iv = iterator$iv.next()))) >= 0) continue;
                    maxElem$iv = e$iv;
                    maxValue$iv = v$iv;
                } while (iterator$iv.hasNext());
                v0 = var5_5;
            }
        }
        return v0;
    }

    @SinceKotlin(version="1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <K, V, R> R maxOfWith(Map<? extends K, ? extends V> $this$maxOfWith, Comparator<? super R> comparator, Function1<? super Map.Entry<? extends K, ? extends V>, ? extends R> selector) {
        Intrinsics.checkNotNullParameter($this$maxOfWith, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator iterator2 = ((Iterable)$this$maxOfWith.entrySet()).iterator();
        if (!iterator2.hasNext()) {
            throw new NoSuchElementException();
        }
        R r = selector.invoke((Map.Entry<K, V>)iterator2.next());
        while (iterator2.hasNext()) {
            R r2 = selector.invoke((Map.Entry<K, V>)iterator2.next());
            if (comparator.compare(r, r2) >= 0) continue;
            r = r2;
        }
        return r;
    }

    @SinceKotlin(version="1.4")
    @NotNull
    public static final <K, V, M extends Map<? extends K, ? extends V>> M onEachIndexed(@NotNull M $this$onEachIndexed, @NotNull Function2<? super Integer, ? super Map.Entry<? extends K, ? extends V>, Unit> action) {
        Intrinsics.checkNotNullParameter($this$onEachIndexed, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        boolean $i$f$onEachIndexed = false;
        M m = $this$onEachIndexed;
        M $this$onEachIndexed_u24lambda_u243 = m;
        boolean bl = false;
        Iterable $this$forEachIndexed$iv = $this$onEachIndexed_u24lambda_u243.entrySet();
        boolean $i$f$forEachIndexed = false;
        int index$iv = 0;
        for (Object item$iv : $this$forEachIndexed$iv) {
            int n;
            if ((n = index$iv++) < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            action.invoke((Integer)((Integer)Integer.valueOf(n)), (Map.Entry<K, V>)item$iv);
        }
        return m;
    }

    /*
     * WARNING - void declaration
     */
    @NotNull
    @JvmName(name="flatMapSequence")
    @OverloadResolutionByLambdaReturnType
    @SinceKotlin(version="1.4")
    public static final <K, V, R> List<R> flatMapSequence(@NotNull Map<? extends K, ? extends V> $this$flatMap, @NotNull Function1<? super Map.Entry<? extends K, ? extends V>, ? extends Sequence<? extends R>> transform) {
        void var4_4;
        void $this$flatMapTo$iv;
        Intrinsics.checkNotNullParameter($this$flatMap, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        boolean $i$f$flatMapSequence = false;
        Map<? extends K, ? extends V> map = $this$flatMap;
        Collection destination$iv = new ArrayList();
        boolean $i$f$flatMapSequenceTo = false;
        for (Map.Entry element$iv : $this$flatMapTo$iv.entrySet()) {
            Sequence<? extends R> list$iv = transform.invoke(element$iv);
            CollectionsKt.addAll(destination$iv, list$iv);
        }
        return (List)var4_4;
    }

    /*
     * WARNING - void declaration
     */
    @NotNull
    public static final <K, V, R, C extends Collection<? super R>> C mapNotNullTo(@NotNull Map<? extends K, ? extends V> $this$mapNotNullTo, @NotNull C destination, @NotNull Function1<? super Map.Entry<? extends K, ? extends V>, ? extends R> transform) {
        void var1_1;
        Intrinsics.checkNotNullParameter($this$mapNotNullTo, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        boolean $i$f$mapNotNullTo = false;
        Map<K, V> $this$forEach$iv = $this$mapNotNullTo;
        boolean $i$f$forEach = false;
        Iterator<Map.Entry<K, V>> iterator2 = $this$forEach$iv.entrySet().iterator();
        while (iterator2.hasNext()) {
            R r;
            Map.Entry<? extends K, ? extends V> element$iv;
            Map.Entry<? extends K, ? extends V> element = element$iv = iterator2.next();
            boolean bl = false;
            if (transform.invoke(element) == null) continue;
            R it = r;
            boolean bl2 = false;
            destination.add(it);
        }
        return var1_1;
    }

    public static final <K, V> boolean any(@NotNull Map<? extends K, ? extends V> $this$any) {
        Intrinsics.checkNotNullParameter($this$any, "<this>");
        return !$this$any.isEmpty();
    }

    /*
     * WARNING - void declaration
     */
    @NotNull
    public static final <K, V, R, C extends Collection<? super R>> C flatMapTo(@NotNull Map<? extends K, ? extends V> $this$flatMapTo, @NotNull C destination, @NotNull Function1<? super Map.Entry<? extends K, ? extends V>, ? extends Iterable<? extends R>> transform) {
        void var1_1;
        Intrinsics.checkNotNullParameter($this$flatMapTo, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        boolean $i$f$flatMapTo = false;
        for (Map.Entry<K, V> entry : $this$flatMapTo.entrySet()) {
            Iterable<R> list = transform.invoke(entry);
            CollectionsKt.addAll(destination, list);
        }
        return var1_1;
    }
}

