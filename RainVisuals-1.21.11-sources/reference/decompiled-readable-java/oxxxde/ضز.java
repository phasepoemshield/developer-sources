/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.glfw.GLFW
 */
package oxxxde;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import kotakbaz.rain.client.util.animations.AnimationUtil;
import kotakbaz.rain.client.util.other.ScrollUtil;
import kotakbaz.rain.client.util.render.engine.controls.ClientRenderPipeline;
import kotakbaz.rain.client.util.render.font.Font;
import kotakbaz.rain.config.CloudConfigOrigin;
import kotakbaz.rain.config.ConfigInfo;
import kotakbaz.rain.config.ConfigManager;
import kotakbaz.rain.ui.api.PipelinedRender;
import kotakbaz.rain.ui.menu.ConfigContentArea;
import kotakbaz.rain.ui.menu.ConfigEntryActionBounds;
import kotakbaz.rain.ui.menu.ConfigEntryComponent;
import kotakbaz.rain.ui.menu.ConfigPage;
import kotakbaz.rain.ui.menu.ConfigSettingsPopup;
import kotakbaz.rain.ui.menu.ConfigSettingsPopupBounds;
import kotakbaz.rain.ui.menu.misc.AnimatedListTracker;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.lwjgl.glfw.GLFW;
import oxxxde.\u0627\u062c;
import oxxxde.\u0627\u0638;
import oxxxde.\u0628\u062d;
import oxxxde.\u0628\u0638;
import oxxxde.\u0628\u0641;
import oxxxde.\u062b\u0651;
import oxxxde.\u062b\u0652;
import oxxxde.\u062c\u0650;
import oxxxde.\u062f\u062e;
import oxxxde.\u0630\u062f;
import oxxxde.\u0630\u0631;
import oxxxde.\u0630\u0634;
import oxxxde.\u0631\u064e;
import oxxxde.\u0633;
import oxxxde.\u0633\u0630;
import oxxxde.\u0635\u0627;
import oxxxde.\u0636\u0643;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\u00ac\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001d\u0018\u00002\u00020\u00012\u00020\u0002B\u0089\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u000b\u0012\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u000b\u0012\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\b0\u0006\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\b\u0016\u0010\u0014J\r\u0010\u0017\u001a\u00020\b\u00a2\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u000e\u00a2\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\b\u00a2\u0006\u0004\b\u001b\u0010\u0018J\r\u0010\u001c\u001a\u00020\b\u00a2\u0006\u0004\b\u001c\u0010\u0018J'\u0010!\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\b!\u0010\"J'\u0010$\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020\u001dH\u0016\u00a2\u0006\u0004\b$\u0010%J'\u0010&\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020\u001dH\u0016\u00a2\u0006\u0004\b&\u0010%J'\u0010'\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020\u001dH\u0016\u00a2\u0006\u0004\b'\u0010%J'\u0010)\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010(\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\b)\u0010\"J\u0015\u0010*\u001a\u00020\b2\u0006\u0010(\u001a\u00020\u0003\u00a2\u0006\u0004\b*\u0010+J\u001f\u0010.\u001a\u00020\b2\u0006\u0010,\u001a\u00020\u00032\b\b\u0002\u0010-\u001a\u00020\u000e\u00a2\u0006\u0004\b.\u0010/J\r\u00100\u001a\u00020\u0003\u00a2\u0006\u0004\b0\u00101J\r\u00102\u001a\u00020\u0003\u00a2\u0006\u0004\b2\u00101J\r\u00103\u001a\u00020\u0003\u00a2\u0006\u0004\b3\u00101J\u0019\u00105\u001a\u00020\b2\b\b\u0002\u00104\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\b5\u00106J\u0017\u0010:\u001a\u0002092\u0006\u00108\u001a\u000207H\u0002\u00a2\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020\u0003H\u0002\u00a2\u0006\u0004\b<\u00101J/\u0010B\u001a\u00020=2\u0006\u0010>\u001a\u00020=2\u0006\u0010?\u001a\u00020\u00032\u0006\u0010@\u001a\u00020\u00032\u0006\u0010A\u001a\u00020\u0003H\u0002\u00a2\u0006\u0004\bB\u0010CJ/\u0010E\u001a\u00020=2\u0006\u0010>\u001a\u00020=2\u0006\u0010D\u001a\u00020\u001d2\u0006\u0010@\u001a\u00020\u00032\u0006\u0010A\u001a\u00020\u0003H\u0002\u00a2\u0006\u0004\bE\u0010FJ'\u0010G\u001a\u00020\b2\u0006\u0010>\u001a\u00020=2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001dH\u0002\u00a2\u0006\u0004\bG\u0010HJ?\u0010K\u001a\u00020\b2\u0006\u0010>\u001a\u00020=2\u0006\u0010D\u001a\u00020\u001d2\u0006\u0010I\u001a\u00020\u00072\u0006\u0010J\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001dH\u0002\u00a2\u0006\u0004\bK\u0010LJ)\u0010M\u001a\u0004\u0018\u00010\u001d2\u0006\u0010>\u001a\u00020=2\u0006\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u0003H\u0002\u00a2\u0006\u0004\bM\u0010NJ/\u0010O\u001a\u00020\u000e2\u0006\u0010>\u001a\u00020=2\u0006\u0010D\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u0003H\u0002\u00a2\u0006\u0004\bO\u0010PJ\u0017\u0010Q\u001a\u00020\u00032\u0006\u0010>\u001a\u00020=H\u0002\u00a2\u0006\u0004\bQ\u0010RJ\u001f\u0010T\u001a\u00020\b2\u0006\u0010>\u001a\u00020=2\u0006\u0010S\u001a\u00020\u0003H\u0002\u00a2\u0006\u0004\bT\u0010UJ\u0017\u0010X\u001a\u00020\b2\u0006\u0010W\u001a\u00020VH\u0002\u00a2\u0006\u0004\bX\u0010YJ'\u0010Z\u001a\u00020\b2\u0006\u0010>\u001a\u00020=2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001dH\u0002\u00a2\u0006\u0004\bZ\u0010HJ?\u0010_\u001a\u00020\b2\u0006\u0010[\u001a\u00020\u00032\u0006\u0010\\\u001a\u00020\u00032\u0006\u0010]\u001a\u00020\u00032\u0006\u0010^\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001dH\u0002\u00a2\u0006\u0004\b_\u0010`J#\u0010b\u001a\u00020\u00032\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070aH\u0002\u00a2\u0006\u0004\bb\u0010cJ!\u0010e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070a0dH\u0002\u00a2\u0006\u0004\be\u0010fJ\u001f\u0010j\u001a\u00020i2\u0006\u0010h\u001a\u00020g2\u0006\u0010D\u001a\u00020\u001dH\u0002\u00a2\u0006\u0004\bj\u0010kJ\u001b\u0010l\u001a\u0004\u0018\u00010g2\b\b\u0002\u0010>\u001a\u00020=H\u0002\u00a2\u0006\u0004\bl\u0010mJ\u0017\u0010n\u001a\u00020\b2\u0006\u0010#\u001a\u00020\u001dH\u0002\u00a2\u0006\u0004\bn\u0010oJ\u000f\u0010p\u001a\u00020\bH\u0002\u00a2\u0006\u0004\bp\u0010\u0018J\u0017\u0010r\u001a\u00020\b2\u0006\u0010q\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\br\u0010sJ\u000f\u0010t\u001a\u00020\bH\u0002\u00a2\u0006\u0004\bt\u0010\u0018J\u0017\u0010v\u001a\u00020\b2\u0006\u0010u\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\bv\u0010sJ\u0019\u0010w\u001a\u0004\u0018\u00010\u00072\u0006\u0010#\u001a\u00020\u001dH\u0002\u00a2\u0006\u0004\bw\u0010xJ\u000f\u0010y\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\by\u0010\u001aJ\u0017\u0010{\u001a\u00020\u000e2\u0006\u0010z\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\b{\u0010|J\u0019\u0010~\u001a\u00020\b2\b\b\u0002\u0010}\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\b~\u00106J \u0010\u007f\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u0003H\u0002\u00a2\u0006\u0005\b\u007f\u0010\u0080\u0001J\u0012\u0010\u0081\u0001\u001a\u00020=H\u0002\u00a2\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J\u0012\u0010\u0083\u0001\u001a\u00020=H\u0002\u00a2\u0006\u0006\b\u0083\u0001\u0010\u0082\u0001J\u0012\u0010\u0084\u0001\u001a\u00020=H\u0002\u00a2\u0006\u0006\b\u0084\u0001\u0010\u0082\u0001R\u0015\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\b\u0004\u0010\u0085\u0001R\u0015\u0010\u0005\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\b\u0005\u0010\u0085\u0001R!\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\b\t\u0010\u0086\u0001R!\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\b\n\u0010\u0086\u0001R'\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\b\f\u0010\u0087\u0001R'\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\b\r\u0010\u0087\u0001R!\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\b\u000f\u0010\u0086\u0001R\u0017\u0010\u0088\u0001\u001a\u00020\u001d8\u0002X\u0082D\u00a2\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R\u0017\u0010\u008a\u0001\u001a\u00020\u00038\u0002X\u0082D\u00a2\u0006\b\n\u0006\b\u008a\u0001\u0010\u0085\u0001R\u0017\u0010\u008b\u0001\u001a\u00020\u00038\u0002X\u0082D\u00a2\u0006\b\n\u0006\b\u008b\u0001\u0010\u0085\u0001R\u0017\u0010\u008c\u0001\u001a\u00020\u00038\u0002X\u0082D\u00a2\u0006\b\n\u0006\b\u008c\u0001\u0010\u0085\u0001R\u0018\u0010\u008e\u0001\u001a\u00030\u008d\u00018\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001R\u0018\u0010\u0090\u0001\u001a\u00030\u008d\u00018\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u0090\u0001\u0010\u008f\u0001R\u001e\u0010\u0091\u0001\u001a\t\u0012\u0005\u0012\u00030\u008d\u00010d8\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u0091\u0001\u0010\u0092\u0001R)\u0010\u0095\u0001\u001a\u0014\u0012\u0004\u0012\u0002090\u0093\u0001j\t\u0012\u0004\u0012\u000209`\u0094\u00018\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u0095\u0001\u0010\u0096\u0001R$\u0010\u0098\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u0002090\u0097\u00018\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u0098\u0001\u0010\u0099\u0001R&\u0010\u009b\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0004\u0012\u0002090\u009a\u00010d8\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u009b\u0001\u0010\u0092\u0001R\u0018\u0010\u009c\u0001\u001a\u00030\u008d\u00018\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u009c\u0001\u0010\u008f\u0001R\u001f\u0010\u009d\u0001\u001a\b\u0012\u0004\u0012\u0002070d8\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u009d\u0001\u0010\u0092\u0001R\u0019\u0010\u009e\u0001\u001a\u00020V8\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u009e\u0001\u0010\u009f\u0001R\u0019\u0010\u00a0\u0001\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u00a0\u0001\u0010\u0085\u0001R\u0019\u0010\u00a1\u0001\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u00a1\u0001\u0010\u0089\u0001R\u001a\u0010\u00a3\u0001\u001a\u00030\u00a2\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u00a3\u0001\u0010\u00a4\u0001R\u0019\u0010\u00a5\u0001\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u00a5\u0001\u0010\u0085\u0001R\u0019\u0010\u00a6\u0001\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u00a6\u0001\u0010\u0085\u0001R\u001b\u0010\u00a7\u0001\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u00a7\u0001\u0010\u00a8\u0001R\u0019\u0010\u00a9\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u00a9\u0001\u0010\u00aa\u0001R\u0018\u0010\u00ab\u0001\u001a\u00030\u008d\u00018\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u00ab\u0001\u0010\u008f\u0001R\u001e\u0010\u00ac\u0001\u001a\t\u0012\u0005\u0012\u00030\u008d\u00010d8\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u00ac\u0001\u0010\u0092\u0001R\u0017\u0010\u00ad\u0001\u001a\u00020\u00038\u0002X\u0082D\u00a2\u0006\b\n\u0006\b\u00ad\u0001\u0010\u0085\u0001R\u0017\u0010\u00ae\u0001\u001a\u00020\u00038\u0002X\u0082D\u00a2\u0006\b\n\u0006\b\u00ae\u0001\u0010\u0085\u0001R\u0017\u0010\u00af\u0001\u001a\u00020\u00038\u0002X\u0082D\u00a2\u0006\b\n\u0006\b\u00af\u0001\u0010\u0085\u0001R\u0017\u0010\u00b0\u0001\u001a\u00020\u00038\u0002X\u0082D\u00a2\u0006\b\n\u0006\b\u00b0\u0001\u0010\u0085\u0001R\u0017\u0010\u00b1\u0001\u001a\u00020\u00038\u0002X\u0082D\u00a2\u0006\b\n\u0006\b\u00b1\u0001\u0010\u0085\u0001R\u0017\u0010\u00b2\u0001\u001a\u00020\u00038\u0002X\u0082D\u00a2\u0006\b\n\u0006\b\u00b2\u0001\u0010\u0085\u0001R\u0017\u0010\u00b3\u0001\u001a\u00020\u00038\u0002X\u0082D\u00a2\u0006\b\n\u0006\b\u00b3\u0001\u0010\u0085\u0001R\u0017\u0010\u00b4\u0001\u001a\u00020\u00038\u0002X\u0082D\u00a2\u0006\b\n\u0006\b\u00b4\u0001\u0010\u0085\u0001R\u0017\u0010\u00b5\u0001\u001a\u00020\u001d8\u0002X\u0082D\u00a2\u0006\b\n\u0006\b\u00b5\u0001\u0010\u0089\u0001R#\u0010\u00b6\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070a8\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u00b6\u0001\u0010\u00b7\u0001R#\u0010\u00b8\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070a8\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u00b8\u0001\u0010\u00b7\u0001R#\u0010\u00b9\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070a8\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u00b9\u0001\u0010\u00b7\u0001R\u0016\u0010\u00bb\u0001\u001a\u00020\u00038BX\u0082\u0004\u00a2\u0006\u0007\u001a\u0005\b\u00ba\u0001\u00101R\u0017\u0010\u00bc\u0001\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u00bc\u0001\u0010\u0085\u0001R\u001b\u0010\u00bd\u0001\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u00bd\u0001\u0010\u00a8\u0001R\u0019\u0010\u00be\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u00be\u0001\u0010\u00a8\u0001\u00a8\u0006\u00bf\u0001"}, d2={"Loxxxde/\u0636\u0632;", "Loxxxde/\u0627\u0638;", "Loxxxde/\u0627\u0633;", "", "panelWidth", "contentTopOffset", "Lkotlin/Function1;", "", "", "onShareConfig", "onSaveToCloud", "Lkotlin/Function2;", "onDeleteOwnedCloud", "onDeleteReceivedCloud", "", "onPageChanged", "<init>", "(FFLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)V", "Loxxxde/\u0635\u0624;", "rectPipeline", "()Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;", "textPipeline", "iconsPipeline", "resetScroll", "()V", "isCloudPage", "()Z", "showCloudPage", "clearInputFocus", "", "mouseX", "mouseY", "partialTicks", "render", "(IIF)V", "button", "onMouseClick", "(III)V", "onMouseRelease", "onKeyPress", "vertical", "onMouseScroll", "scrollWheel", "(F)V", "progress", "instant", "setScrollProgress", "(FZ)V", "scrollOffsetValue", "()F", "scrollContentHeight", "scrollViewHeight", "forceRefresh", "syncEntries", "(Z)V", "Loxxxde/\u0635\u064c;", "config", "Loxxxde/\u062d\u0645;", "createConfigEntry", "(Lkotakbaz/rain/config/ConfigInfo;)Lkotakbaz/rain/ui/menu/ConfigEntryComponent;", "contentHeight", "Loxxxde/\u0630\u0623;", "area", "position", "scrollOffset", "entryHeight", "configEntryBounds", "(Lkotakbaz/rain/ui/menu/ConfigContentArea;FFF)Lkotakbaz/rain/ui/menu/ConfigContentArea;", "index", "configEntryBoundsAtIndex", "(Lkotakbaz/rain/ui/menu/ConfigContentArea;IFF)Lkotakbaz/rain/ui/menu/ConfigContentArea;", "renderPageTabs", "(Lkotakbaz/rain/ui/menu/ConfigContentArea;II)V", "label", "activeProgress", "renderPageTab", "(Lkotakbaz/rain/ui/menu/ConfigContentArea;ILjava/lang/String;FII)V", "pageTabIndex", "(Lkotakbaz/rain/ui/menu/ConfigContentArea;FF)Ljava/lang/Integer;", "pageTabContains", "(Lkotakbaz/rain/ui/menu/ConfigContentArea;IFF)Z", "pageTabWidth", "(Lkotakbaz/rain/ui/menu/ConfigContentArea;)F", "pageProgress", "renderEmptyState", "(Lkotakbaz/rain/ui/menu/ConfigContentArea;F)V", "Loxxxde/\u0635\u0636;", "page", "selectPage", "(Lkotakbaz/rain/ui/menu/ConfigPage;)V", "renderSettingsPopup", "x", "y", "width", "popupAlpha", "renderSettingsPopupButtons", "(FFFFII)V", "Lkotlin/Pair;", "settingsPopupButtonContentWidth", "(Lkotlin/Pair;)F", "", "settingsPopupButtons", "()Ljava/util/List;", "Loxxxde/\u062f\u0631;", "popup", "Loxxxde/\u0628\u0644;", "settingsPopupButtonBounds", "(Lkotakbaz/rain/ui/menu/ConfigSettingsPopup;I)Lkotakbaz/rain/ui/menu/ConfigSettingsPopupBounds;", "activeSettingsPopup", "(Lkotakbaz/rain/ui/menu/ConfigContentArea;)Lkotakbaz/rain/ui/menu/ConfigSettingsPopup;", "handleConfigRenameKey", "(I)V", "saveConfigRename", "configName", "startConfigRename", "(Ljava/lang/String;)V", "cancelConfigRename", "value", "appendToConfigRename", "resolveTypedKey", "(I)Ljava/lang/String;", "isShiftDown", "keyName", "isAllowedConfigNameKey", "(Ljava/lang/String;)Z", "immediate", "closeSettingsPopup", "insideContent", "(FF)Z", "pageTabsArea", "()Lkotakbaz/rain/ui/menu/ConfigContentArea;", "contentArea", "baseContentArea", "F", "Lkotlin/jvm/functions/Function1;", "Lkotlin/jvm/functions/Function2;", "columnCount", "I", "pageTabsHeight", "pageTabButtonHeight", "pageTabsGap", "Loxxxde/\u0631\u064a;", "pageIndicatorAnimation", "Loxxxde/\u0631\u064a;", "pageContentAnimation", "pageTabHoverAnimations", "Ljava/util/List;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "configEntries", "Ljava/util/ArrayList;", "Loxxxde/\u062b\u0651;", "configListAnimations", "Loxxxde/\u062b\u0651;", "Loxxxde/\u062c\u0629;", "renderedConfigEntries", "emptyStateAnimation", "configs", "currentPage", "Loxxxde/\u0635\u0636;", "pageSlideDirection", "configStateVersion", "Loxxxde/\u0632\u0639;", "scroll", "Loxxxde/\u0632\u0639;", "cachedTotalHeight", "cachedViewHeight", "settingsPopupConfigName", "Ljava/lang/String;", "settingsPopupOpen", "Z", "settingsPopupAnimation", "settingsPopupButtonHoverAnimations", "settingsPopupInset", "settingsPopupButtonHeight", "settingsPopupButtonGap", "settingsPopupButtonHorizontalPadding", "settingsPopupTextSize", "settingsPopupTextOpticalOffset", "settingsPopupIconSize", "settingsPopupIconGap", "configNameMaxLength", "renameConfigButton", "Lkotlin/Pair;", "shareConfigButton", "saveCloudConfigButton", "getSettingsPopupWidth", "settingsPopupWidth", "settingsPopupHeight", "renamingConfigName", "renamingConfigText", "rain-visuals"})
public final class \u0636\u0632
extends \u0627\u0638
implements PipelinedRender {
    @NotNull
    private final ArrayList<ConfigEntryComponent> configEntries;
    private final float settingsPopupButtonGap;
    private final float pageTabsHeight;
    @NotNull
    private final Function1<String, Unit> onShareConfig;
    private final float contentTopOffset;
    @NotNull
    private final Function2<String, String, Unit> onDeleteOwnedCloud;
    @NotNull
    private String renamingConfigText;
    @NotNull
    private List<AnimatedListTracker.Item<ConfigEntryComponent>> renderedConfigEntries;
    private final float settingsPopupInset;
    private final float pageTabButtonHeight;
    private final float settingsPopupIconSize;
    private final float settingsPopupTextOpticalOffset;
    private final float pageTabsGap;
    private float pageSlideDirection;
    private final int configNameMaxLength;
    private boolean settingsPopupOpen;
    @NotNull
    private final Function1<String, Unit> onSaveToCloud;
    @NotNull
    private final Function2<String, String, Unit> onDeleteReceivedCloud;
    private float cachedTotalHeight;
    @NotNull
    private final Pair<String, String> saveCloudConfigButton;
    @NotNull
    private final AnimationUtil emptyStateAnimation;
    private int configStateVersion;
    private final float settingsPopupButtonHeight;
    @NotNull
    private final List<AnimationUtil> settingsPopupButtonHoverAnimations;
    private final float settingsPopupTextSize;
    @NotNull
    private final AnimationUtil pageIndicatorAnimation;
    private final float settingsPopupIconGap;
    @Nullable
    private String settingsPopupConfigName;
    @Nullable
    private String renamingConfigName;
    @NotNull
    private List<ConfigInfo> configs;
    @NotNull
    private final Pair<String, String> shareConfigButton;
    @NotNull
    private final List<AnimationUtil> pageTabHoverAnimations;
    @NotNull
    private ScrollUtil scroll;
    private final int columnCount;
    @NotNull
    private final Pair<String, String> renameConfigButton;
    private final float settingsPopupButtonHorizontalPadding;
    @NotNull
    private final AnimationUtil settingsPopupAnimation;
    private float cachedViewHeight;
    @NotNull
    private final Function1<Boolean, Unit> onPageChanged;
    private final float panelWidth;
    @NotNull
    private ConfigPage currentPage;
    private final float settingsPopupHeight;
    @NotNull
    private final AnimationUtil pageContentAnimation;
    @NotNull
    private final \u062b\u0651<String, ConfigEntryComponent> configListAnimations;

    private final void renderPageTab(ConfigContentArea area, int index, String label, float activeProgress, int mouseX, int mouseY) {
        float buttonWidth = this.pageTabWidth(area);
        float buttonX = area.getLeft() + (float)index * (buttonWidth + this.pageTabsGap);
        float buttonHeight = RangesKt.coerceAtMost(this.pageTabButtonHeight, area.getHeight());
        float buttonY = area.getTop() + (area.getHeight() - buttonHeight) * 0.5f;
        boolean hovered = this.pageTabContains(area, index, mouseX, mouseY);
        \u0628\u0641 \u0628\u06412 = \u0628\u0641.INSTANCE;
        float hoverProgress = RangesKt.coerceIn(this.pageTabHoverAnimations.get(index).animate(hovered ? 1.0f : 0.0f, 170.0f, new \u0633\u0630(\u0628\u06412)), 0.0f, 1.0f);
        Color backgroundColor = \u0628\u062d.INSTANCE.interpolateColor(\u062b\u0652.INSTANCE.surface((0.01f + 0.02f * hoverProgress) * this.getAlpha()), \u062b\u0652.INSTANCE.surface(0.05f * this.getAlpha()), activeProgress);
        Color borderColor = \u0628\u062d.INSTANCE.interpolateColor(\u062b\u0652.INSTANCE.surface((0.07f + 0.02f * hoverProgress) * this.getAlpha()), \u062b\u0652.INSTANCE.title(0.08f * this.getAlpha()), activeProgress);
        Color textColor = \u0628\u062d.INSTANCE.interpolateColor(\u062b\u0652.INSTANCE.value((0.48f + 0.14f * hoverProgress) * this.getAlpha()), \u062b\u0652.INSTANCE.title(this.getAlpha()), activeProgress);
        \u0630\u0631.INSTANCE.getBLURRED_RECT().priority(this.rectPipeline()).color(backgroundColor).round(4.0f).mix(0.95f).border(1.0f, borderColor).draw(buttonX, buttonY, buttonWidth, buttonHeight);
        float textSize = Math.min(buttonHeight * 0.31f, buttonWidth * 0.16f);
        float textY = buttonY + (buttonHeight - textSize) * 0.46f;
        Font.drawCenteredText$default(\u0631\u064e.INSTANCE.getGS_MEDIUM().priority(this.textPipeline()), label, buttonX + buttonWidth * 0.5f, textY, textSize, textColor, 0.0f, 32, null);
    }

    private final void renderEmptyState(ConfigContentArea area, float pageProgress) {
        float stateAlpha = this.getAlpha() * pageProgress;
        String title = this.currentPage == ConfigPage.LOCAL ? "\u041b\u043e\u043a\u0430\u043b\u044c\u043d\u044b\u0445 \u043a\u043e\u043d\u0444\u0438\u0433\u043e\u0432 \u043d\u0435\u0442" : "Cloud-\u043a\u043e\u043d\u0444\u0438\u0433\u043e\u0432 \u043d\u0435\u0442";
        String hint = this.currentPage == ConfigPage.LOCAL ? "\u0421\u043e\u0437\u0434\u0430\u0439 \u043f\u0435\u0440\u0432\u044b\u0439 \u043a\u043e\u043d\u0444\u0438\u0433 \u043a\u043d\u043e\u043f\u043a\u043e\u0439 \u0441\u0432\u0435\u0440\u0445\u0443" : "\u0410\u043a\u0442\u0438\u0432\u0438\u0440\u0443\u0439 \u043a\u043b\u044e\u0447 \u043a\u043d\u043e\u043f\u043a\u043e\u0439 \u0441\u0432\u0435\u0440\u0445\u0443";
        float titleSize = 7.2f;
        float hintSize = 5.8f;
        float centerX = area.getLeft() + area.getWidth() * 0.5f;
        float centerY = area.getTop() + area.getHeight() * 0.42f;
        Font.drawCenteredText$default(\u0631\u064e.INSTANCE.getGS_MEDIUM().priority(this.textPipeline()), title, centerX, centerY, titleSize, \u062b\u0652.INSTANCE.title(0.6f * stateAlpha), 0.0f, 32, null);
        Font.drawCenteredText$default(\u0631\u064e.INSTANCE.getGS_MEDIUM().priority(this.textPipeline()), hint, centerX, centerY + \u0631\u064e.INSTANCE.getGS_MEDIUM().getHeight(titleSize) + 4.0f, hintSize, \u062b\u0652.INSTANCE.value(0.38f * stateAlpha), 0.0f, 32, null);
    }

    public final void scrollWheel(float vertical) {
        this.scroll.scroll(vertical * 2.5f);
    }

    private final Integer pageTabIndex(ConfigContentArea area, float mouseX, float mouseY) {
        Object v0;
        block1: {
            Iterable $this$firstOrNull$iv = new IntRange(0, 1);
            boolean $i$f$firstOrNull = false;
            for (Object element$iv : $this$firstOrNull$iv) {
                int index = ((Number)element$iv).intValue();
                boolean bl = false;
                if (!this.pageTabContains(area, index, mouseX, mouseY)) continue;
                v0 = element$iv;
                break block1;
            }
            v0 = null;
        }
        return v0;
    }

    public final float scrollOffsetValue() {
        return this.scroll.value();
    }

    private static final Unit createConfigEntry$lambda$0(\u0636\u0632 this$0, String selectedConfig) {
        Intrinsics.checkNotNullParameter(selectedConfig, "selectedConfig");
        if (ConfigManager.INSTANCE.load(selectedConfig)) {
            \u0636\u0632.syncEntries$default(this$0, false, 1, null);
        }
        return Unit.INSTANCE;
    }

    public final float scrollViewHeight() {
        return this.cachedViewHeight;
    }

    static /* synthetic */ ConfigSettingsPopup activeSettingsPopup$default(\u0636\u0632 \u0636\u06322, ConfigContentArea configContentArea, int n, Object object) {
        if ((n & 1) != 0) {
            configContentArea = \u0636\u06322.contentArea();
        }
        return \u0636\u06322.activeSettingsPopup(configContentArea);
    }

    private final ConfigEntryComponent createConfigEntry(ConfigInfo config) {
        CloudConfigOrigin cloudConfigOrigin = config.getCloudOrigin();
        CloudConfigOrigin cloudConfigOrigin2 = config.getCloudOrigin();
        return new ConfigEntryComponent(config.getName(), config.getDisplayName(), config.getAuthor(), config.getCloudOrigin() != null, cloudConfigOrigin != null ? cloudConfigOrigin.getOwned() : false, cloudConfigOrigin2 != null ? cloudConfigOrigin2.getShared() : false, arg_0 -> \u0636\u0632.createConfigEntry$lambda$0(this, arg_0), arg_0 -> \u0636\u0632.createConfigEntry$lambda$1(this, arg_0), arg_0 -> \u0636\u0632.createConfigEntry$lambda$2(this, arg_0));
    }

    private final boolean pageTabContains(ConfigContentArea area, int index, float mouseX, float mouseY) {
        float buttonWidth = this.pageTabWidth(area);
        float buttonX = area.getLeft() + (float)index * (buttonWidth + this.pageTabsGap);
        float buttonHeight = RangesKt.coerceAtMost(this.pageTabButtonHeight, area.getHeight());
        float buttonY = area.getTop() + (area.getHeight() - buttonHeight) * 0.5f;
        return mouseX >= buttonX && mouseX <= buttonX + buttonWidth && mouseY >= buttonY && mouseY <= buttonY + buttonHeight;
    }

    private final void selectPage(ConfigPage page) {
        if (page == this.currentPage) {
            return;
        }
        this.pageSlideDirection = page.ordinal() > this.currentPage.ordinal() ? 1.0f : -1.0f;
        this.currentPage = page;
        AnimationUtil.animate$default(this.pageContentAnimation, 0.0f, 0.0f, null, 4, null);
        this.scroll = new ScrollUtil(0.0f, 1, null);
        this.closeSettingsPopup(true);
        this.cancelConfigRename();
        this.configs = CollectionsKt.emptyList();
        this.configEntries.clear();
        this.configStateVersion = Integer.MIN_VALUE;
        \u0636\u0632.syncEntries$default(this, false, 1, null);
        this.onPageChanged.invoke(this.currentPage == ConfigPage.CLOUD);
    }

    private final ConfigContentArea configEntryBoundsAtIndex(ConfigContentArea area, int index, float scrollOffset, float entryHeight) {
        float columnWidth = RangesKt.coerceAtLeast((area.getWidth() - this.getPadding() * (float)(this.columnCount - 1)) / (float)this.columnCount, 0.0f);
        int column = index % this.columnCount;
        int row = index / this.columnCount;
        return new ConfigContentArea(area.getLeft() + (float)column * (columnWidth + this.getPadding()), area.getTop() - scrollOffset + (float)row * (entryHeight + this.getPadding()), columnWidth, entryHeight);
    }

    public final void clearInputFocus() {
        \u0636\u0632.closeSettingsPopup$default(this, false, 1, null);
        this.cancelConfigRename();
    }

    private final ConfigSettingsPopup activeSettingsPopup(ConfigContentArea area) {
        ConfigEntryComponent component;
        String configName;
        block8: {
            block7: {
                Object v1;
                block6: {
                    String string = this.settingsPopupConfigName;
                    if (string == null) {
                        return null;
                    }
                    configName = string;
                    Iterable $this$firstOrNull$iv = this.configEntries;
                    boolean $i$f$firstOrNull = false;
                    for (Object element$iv : $this$firstOrNull$iv) {
                        ConfigEntryComponent it = (ConfigEntryComponent)element$iv;
                        boolean bl = false;
                        if (!Intrinsics.areEqual(it.getConfigName(), configName)) continue;
                        v1 = element$iv;
                        break block6;
                    }
                    v1 = null;
                }
                ConfigEntryComponent configEntryComponent = v1;
                if (configEntryComponent == null) {
                    return null;
                }
                component = configEntryComponent;
                float areaBottom = area.getTop() + area.getHeight();
                if (component.getY() + component.getHeight() <= area.getTop()) break block7;
                if (!(component.getY() >= areaBottom)) break block8;
            }
            return null;
        }
        ConfigEntryActionBounds settingsBounds = component.settingsButtonBounds();
        float popupTop = settingsBounds.getTop() + (settingsBounds.getHeight() - this.settingsPopupHeight) * 0.5f;
        return new ConfigSettingsPopup(configName, new ConfigSettingsPopupBounds(settingsBounds.getRight() + this.getPadding() * 0.4f, popupTop, this.getSettingsPopupWidth(), this.settingsPopupHeight));
    }

    /*
     * WARNING - void declaration
     */
    private final float getSettingsPopupWidth() {
        void var3_4;
        Object object = new Pair[3];
        object[0] = this.renameConfigButton;
        object[1] = this.shareConfigButton;
        object[2] = this.saveCloudConfigButton;
        object = CollectionsKt.listOf(object);
        float f = this.settingsPopupInset * 2.0f;
        Iterator iterator2 = object.iterator();
        if (!iterator2.hasNext()) {
            throw new NoSuchElementException();
        }
        Pair p0 = (Pair)iterator2.next();
        boolean bl = false;
        float f2 = this.settingsPopupButtonContentWidth((Pair<String, String>)var3_4);
        while (iterator2.hasNext()) {
            Pair pair = (Pair)iterator2.next();
            boolean bl2 = false;
            float f3 = this.settingsPopupButtonContentWidth(pair);
            f2 = Math.max(f2, f3);
        }
        float f4 = f2;
        return f + f4 + this.settingsPopupButtonHorizontalPadding * 2.0f;
    }

    /*
     * WARNING - void declaration
     */
    private final void saveConfigRename() {
        String currentDisplayName;
        Object v1;
        Object it;
        Object object;
        Object object2;
        String newName;
        String oldName;
        block8: {
            void $this$firstOrNull$iv;
            String string = this.renamingConfigName;
            if (string == null) {
                return;
            }
            oldName = string;
            newName = ((Object)StringsKt.trim((CharSequence)this.renamingConfigText)).toString();
            object2 = this.configEntries;
            boolean $i$f$firstOrNull = false;
            object = $this$firstOrNull$iv.iterator();
            while (object.hasNext()) {
                Object element$iv = object.next();
                it = (ConfigEntryComponent)element$iv;
                boolean bl = false;
                if (!Intrinsics.areEqual(((ConfigEntryComponent)it).getConfigName(), oldName)) continue;
                v1 = element$iv;
                break block8;
            }
            v1 = null;
        }
        ConfigEntryComponent configEntryComponent = v1;
        String string = currentDisplayName = configEntryComponent != null && (object2 = configEntryComponent.getDisplayName()) != null ? object2 : oldName;
        if (Intrinsics.areEqual(newName, currentDisplayName)) {
            this.cancelConfigRename();
            \u0636\u0632.syncEntries$default(this, false, 1, null);
            return;
        }
        switch (\u0628\u0638.$EnumSwitchMapping$1[ConfigManager.INSTANCE.rename(oldName, newName).ordinal()]) {
            case 1: 
            case 2: {
                CloudConfigOrigin cloudConfigOrigin;
                this.cancelConfigRename();
                \u0636\u0632.syncEntries$default(this, false, 1, null);
                if (this.currentPage != ConfigPage.CLOUD || (cloudConfigOrigin = ConfigManager.INSTANCE.getCloudOrigin(newName)) == null) break;
                CloudConfigOrigin cloudConfigOrigin2 = cloudConfigOrigin;
                it = cloudConfigOrigin2;
                boolean bl = false;
                Object object3 = object = ((CloudConfigOrigin)it).getOwned() ? cloudConfigOrigin2 : null;
                if (object == null) break;
                it = object;
                boolean bl2 = false;
                this.onSaveToCloud.invoke(newName);
                break;
            }
            case 3: {
                this.cancelConfigRename();
                this.syncEntries(true);
                break;
            }
            case 4: 
            case 5: 
            case 6: {
                break;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private final void syncEntries(boolean forceRefresh) {
        block17: {
            if (forceRefresh) {
                ConfigManager.INSTANCE.refreshVisibleConfigsNow();
            }
            stateVersion = ConfigManager.INSTANCE.getStateVersion();
            if (!forceRefresh && stateVersion == this.configStateVersion) {
                return;
            }
            visibleConfigs = ConfigManager.INSTANCE.getVisibleConfigs();
            $this$filter$iv = visibleConfigs;
            $i$f$filter = false;
            var7_8 = $this$filter$iv;
            destination$iv$iv = new ArrayList<E>();
            $i$f$filterTo = false;
            for (T element$iv$iv : $this$filterTo$iv$iv) {
                config = (ConfigInfo)element$iv$iv;
                $i$a$-filter-ConfigsCategoryComponent$syncEntries$pageConfigs$1 = false;
                switch (\u0628\u0638.$EnumSwitchMapping$0[this.currentPage.ordinal()]) {
                    case 1: {
                        if (config.getCloudOrigin() == null) {
                            v0 = true;
                            break;
                        }
                        v0 = false;
                        break;
                    }
                    case 2: {
                        if (config.getCloudOrigin() != null) {
                            v0 = true;
                            break;
                        }
                        v0 = false;
                        break;
                    }
                    default: {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                if (!v0) continue;
                destination$iv$iv.add(element$iv$iv);
            }
            pageConfigs = (List)destination$iv$iv;
            v1 = configsChanged = Intrinsics.areEqual(pageConfigs, this.configs) == false;
            if (!configsChanged) break block17;
            this.configs = pageConfigs;
            $this$associateBy$iv = this.configEntries;
            $i$f$associateBy = false;
            capacity$iv = RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault($this$associateBy$iv, 10)), 16);
            var10_13 = $this$associateBy$iv;
            destination$iv$iv = new LinkedHashMap<K, V>(capacity$iv);
            $i$f$associateByTo = false;
            for (T element$iv$iv : $this$associateByTo$iv$iv) {
                var15_23 = (ConfigEntryComponent)element$iv$iv /* !! */ ;
                var21_29 = destination$iv$iv;
                $i$a$-associateBy-ConfigsCategoryComponent$syncEntries$existingEntries$1 = false;
                var21_29.put(p0.getConfigName(), element$iv$iv /* !! */ );
            }
            existingEntries = destination$iv$iv;
            this.configEntries.clear();
            $this$associateBy$iv = pageConfigs;
            var21_29 = this.configEntries;
            $i$f$map = false;
            capacity$iv = $this$map$iv;
            destination$iv$iv = new ArrayList<E>(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
            $i$f$mapTo = false;
            for (T item$iv$iv : $this$mapTo$iv$iv) {
                element$iv$iv /* !! */  = (ConfigInfo)item$iv$iv;
                var22_34 = destination$iv$iv;
                $i$a$-map-ConfigsCategoryComponent$syncEntries$1 = false;
                var16_28 = (ConfigEntryComponent)existingEntries.get(config.getName());
                if (var16_28 == null) ** GOTO lbl-1000
                entry = var17_30 = var16_28;
                $i$a$-takeIf-ConfigsCategoryComponent$syncEntries$1$1 = false;
                v2 = config.getCloudOrigin();
                v3 = config.getCloudOrigin();
                v4 = var20_33 = entry.matchesMetadata(config.getDisplayName(), config.getAuthor(), config.getCloudOrigin() != null, v2 != null ? v2.getOwned() : false, v3 != null ? v3.getShared() : false) != false ? var17_30 : null;
                if (var20_33 != null) {
                    v5 = var20_33;
                } else lbl-1000:
                // 2 sources

                {
                    v5 = this.createConfigEntry(config);
                }
                var22_34.add(v5);
            }
            var21_29.addAll((List)destination$iv$iv);
            $this$map$iv = pageConfigs;
            $i$f$map = false;
            $this$mapTo$iv$iv = $this$map$iv;
            destination$iv$iv = new ArrayList<E>(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
            $i$f$mapTo = false;
            for (T item$iv$iv : $this$mapTo$iv$iv) {
                config = (ConfigInfo)item$iv$iv;
                var21_29 = destination$iv$iv;
                $i$a$-map-ConfigsCategoryComponent$syncEntries$2 = false;
                var21_29.add(p0.getName());
            }
            if (!CollectionsKt.contains((List)destination$iv$iv, this.settingsPopupConfigName)) {
                this.closeSettingsPopup(true);
            }
            $this$map$iv = pageConfigs;
            $i$f$map = false;
            $this$mapTo$iv$iv = $this$map$iv;
            destination$iv$iv = new ArrayList<E>(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
            $i$f$mapTo = false;
            for (T item$iv$iv : $this$mapTo$iv$iv) {
                p0 = (ConfigInfo)item$iv$iv;
                var21_29 = destination$iv$iv;
                $i$a$-map-ConfigsCategoryComponent$syncEntries$3 = false;
                var21_29.add(p0.getName());
            }
            if (!CollectionsKt.contains((List)destination$iv$iv, this.renamingConfigName)) {
                this.cancelConfigRename();
            }
        }
        this.configStateVersion = ConfigManager.INSTANCE.getStateVersion();
    }

    private final List<Pair<String, String>> settingsPopupButtons() {
        Pair[] pairArray = new Pair[2];
        pairArray[0] = this.renameConfigButton;
        pairArray[1] = this.currentPage == ConfigPage.CLOUD ? this.shareConfigButton : this.saveCloudConfigButton;
        return CollectionsKt.listOf(pairArray);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void render(int mouseX, int mouseY, float partialTicks) {
        void var4_4;
        void var2_2;
        void var1_1;
        super.render(mouseX, mouseY, partialTicks);
        \u0636\u0632.syncEntries$default(this, false, 1, null);
        this.renderedConfigEntries = this.configListAnimations.update((List<ConfigEntryComponent>)this.configEntries, \u0633.INSTANCE);
        ConfigContentArea area = this.contentArea();
        this.cachedTotalHeight = this.contentHeight();
        this.cachedViewHeight = area.getHeight();
        \u0628\u0641 \u0628\u06412 = \u0628\u0641.INSTANCE;
        float pageProgress = RangesKt.coerceIn(this.pageContentAnimation.animate(1.0f, 220.0f, new \u0635\u0627(\u0628\u06412)), 0.0f, 1.0f);
        this.scroll.setMax(RangesKt.coerceAtLeast(this.cachedTotalHeight - this.cachedViewHeight, 0.0f));
        this.scroll.update();
        float scrollOffset = this.scroll.value();
        \u062c\u0650.INSTANCE.start(area.getLeft(), area.getTop(), area.getWidth(), area.getHeight());
        float columnWidth = RangesKt.coerceAtLeast((area.getWidth() - this.getPadding() * (float)(this.columnCount - 1)) / (float)this.columnCount, 0.0f);
        float clipBottom = area.getTop() + area.getHeight();
        Iterable $this$forEach$iv = this.renderedConfigEntries;
        boolean $i$f$forEach = false;
        for (Object element$iv : $this$forEach$iv) {
            void var15_18;
            void var20_23;
            AnimatedListTracker.Item animatedEntry = (AnimatedListTracker.Item)element$iv;
            boolean bl = false;
            ConfigEntryComponent component = (ConfigEntryComponent)animatedEntry.getValue();
            float componentHeight = component.getDefaultHeight();
            ConfigContentArea bounds = this.configEntryBounds(area, animatedEntry.getPosition(), scrollOffset, componentHeight);
            float currentY = bounds.getTop() + (1.0f - animatedEntry.getPresence()) * 4.0f;
            float componentBottom = currentY + componentHeight;
            boolean visible = componentBottom > area.getTop() && currentY < clipBottom;
            component.setAlpha(this.getAlpha() * pageProgress * animatedEntry.getPresence());
            component.setX(bounds.getLeft() + (1.0f - pageProgress) * this.pageSlideDirection * 7.0f);
            component.setY(currentY);
            component.setWidth(columnWidth);
            component.setHeight(componentHeight);
            boolean loaded = ConfigManager.INSTANCE.isConfigActive(component.getConfigName());
            component.setSelected(loaded);
            component.setLoaded(loaded);
            component.setRenaming(Intrinsics.areEqual(component.getConfigName(), this.renamingConfigName));
            component.setRenameText(component.getRenaming() ? this.renamingConfigText : "");
            if (var20_23 == false) continue;
            var15_18.render(mouseX, mouseY, partialTicks);
        }
        \u0628\u0641 \u0628\u06413 = \u0628\u0641.INSTANCE;
        float emptyProgress = RangesKt.coerceIn(this.emptyStateAnimation.animate(this.configEntries.isEmpty() ? 1.0f : 0.0f, 190.0f, new \u0630\u0634(\u0628\u06413)), 0.0f, 1.0f);
        if (emptyProgress > 0.001f) {
            this.renderEmptyState(area, pageProgress * emptyProgress);
        }
        \u062c\u0650.INSTANCE.end();
        this.renderPageTabs(this.pageTabsArea(), (int)var1_1, (int)var2_2);
        this.renderSettingsPopup((ConfigContentArea)var4_4, (int)var1_1, (int)var2_2);
    }

    private static final Unit createConfigEntry$lambda$2(\u0636\u0632 this$0, String selectedConfig) {
        CloudConfigOrigin cloudOrigin;
        Intrinsics.checkNotNullParameter(selectedConfig, "selectedConfig");
        if (Intrinsics.areEqual(this$0.settingsPopupConfigName, selectedConfig)) {
            \u0636\u0632.closeSettingsPopup$default(this$0, false, 1, null);
        }
        CloudConfigOrigin cloudConfigOrigin = cloudOrigin = ConfigManager.INSTANCE.getCloudOrigin(selectedConfig);
        boolean bl = cloudConfigOrigin != null ? cloudConfigOrigin.getOwned() : false;
        if (bl) {
            this$0.onDeleteOwnedCloud.invoke(selectedConfig, cloudOrigin.getConfigId());
        } else {
            CloudConfigOrigin cloudConfigOrigin2 = cloudOrigin;
            boolean bl2 = cloudConfigOrigin2 != null ? cloudConfigOrigin2.getAccountSynced() : false;
            if (bl2) {
                this$0.onDeleteReceivedCloud.invoke(selectedConfig, cloudOrigin.getConfigId());
            } else if (ConfigManager.INSTANCE.remove(selectedConfig)) {
                \u0636\u0632 \u0636\u06322;
                \u0636\u0632.syncEntries$default(\u0636\u06322, false, 1, null);
            }
        }
        return Unit.INSTANCE;
    }

    static /* synthetic */ void syncEntries$default(\u0636\u0632 \u0636\u06322, boolean bl, int n, Object object) {
        if ((n & 1) != 0) {
            bl = false;
        }
        \u0636\u06322.syncEntries(bl);
    }

    private final void handleConfigRenameKey(int button) {
        switch (button) {
            case 257: 
            case 335: {
                this.saveConfigRename();
                return;
            }
            case 256: {
                this.cancelConfigRename();
                return;
            }
            case 259: {
                this.renamingConfigText = StringsKt.dropLast(this.renamingConfigText, 1);
                return;
            }
            case 261: {
                this.renamingConfigText = "";
                return;
            }
            case 32: {
                this.appendToConfigRename(" ");
                return;
            }
        }
        String string = this.resolveTypedKey(button);
        if (string == null) {
            return;
        }
        String keyName = string;
        if (!this.isAllowedConfigNameKey(keyName)) {
            return;
        }
        this.appendToConfigRename(keyName);
    }

    @Override
    public void onMouseRelease(int mouseX, int mouseY, int button) {
        super.onMouseRelease(mouseX, mouseY, button);
    }

    private static final Unit createConfigEntry$lambda$1(\u0636\u0632 this$0, String selectedConfig) {
        Intrinsics.checkNotNullParameter(selectedConfig, "selectedConfig");
        if (Intrinsics.areEqual(this$0.settingsPopupConfigName, selectedConfig) && this$0.settingsPopupOpen) {
            \u0636\u0632.closeSettingsPopup$default(this$0, false, 1, null);
        } else {
            if (!Intrinsics.areEqual(this$0.settingsPopupConfigName, selectedConfig)) {
                AnimationUtil.animate$default(this$0.settingsPopupAnimation, 0.0f, 0.0f, null, 4, null);
            }
            this$0.settingsPopupConfigName = selectedConfig;
            var0.settingsPopupOpen = true;
        }
        return Unit.INSTANCE;
    }

    @Override
    public void onKeyPress(int mouseX, int mouseY, int button) {
        super.onKeyPress(mouseX, mouseY, button);
        if (this.renamingConfigName != null) {
            this.handleConfigRenameKey(button);
        }
    }

    private final ConfigContentArea configEntryBounds(ConfigContentArea area, float position, float scrollOffset, float entryHeight) {
        int lowerIndex = RangesKt.coerceAtLeast((int)Math.floor(position), 0);
        float fraction = RangesKt.coerceIn(position - (float)lowerIndex, 0.0f, 1.0f);
        ConfigContentArea lower = this.configEntryBoundsAtIndex(area, lowerIndex, scrollOffset, entryHeight);
        ConfigContentArea upper = this.configEntryBoundsAtIndex(area, lowerIndex + 1, scrollOffset, entryHeight);
        return new ConfigContentArea(lower.getLeft() + (upper.getLeft() - lower.getLeft()) * fraction, lower.getTop() + (upper.getTop() - lower.getTop()) * fraction, lower.getWidth(), entryHeight);
    }

    public static /* synthetic */ void setScrollProgress$default(\u0636\u0632 \u0636\u06322, float f, boolean bl, int n, Object object) {
        if ((n & 2) != 0) {
            bl = false;
        }
        \u0636\u06322.setScrollProgress(f, bl);
    }

    public final boolean isCloudPage() {
        return this.currentPage == ConfigPage.CLOUD;
    }

    public final void resetScroll() {
        this.scroll = new ScrollUtil(0.0f, 1, null);
        this.closeSettingsPopup(true);
        this.cancelConfigRename();
        this.syncEntries(true);
    }

    private final ConfigSettingsPopupBounds settingsPopupButtonBounds(ConfigSettingsPopup popup, int index) {
        return new ConfigSettingsPopupBounds(popup.getBounds().getLeft() + this.settingsPopupInset, popup.getBounds().getTop() + this.settingsPopupInset + (float)index * (this.settingsPopupButtonHeight + this.settingsPopupButtonGap), RangesKt.coerceAtLeast(popup.getBounds().getWidth() - this.settingsPopupInset * 2.0f, 0.0f), this.settingsPopupButtonHeight);
    }

    @Override
    public void onMouseScroll(int mouseX, int mouseY, float vertical) {
        super.onMouseScroll(mouseX, mouseY, vertical);
        if (!this.insideContent(mouseX, mouseY)) {
            return;
        }
        this.scrollWheel(vertical);
    }

    private final boolean isAllowedConfigNameKey(String keyName) {
        boolean bl;
        block1: {
            CharSequence $this$all$iv = keyName;
            boolean $i$f$all = false;
            for (int i = 0; i < $this$all$iv.length(); ++i) {
                char element$iv;
                char it = element$iv = $this$all$iv.charAt(i);
                boolean bl2 = false;
                if (Character.isLetterOrDigit(it) || it == '-' || it == '_') continue;
                bl = false;
                break block1;
            }
            bl = true;
        }
        return bl;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void onMouseClick(int mouseX, int mouseY, int button) {
        boolean bl;
        block20: {
            ConfigEntryComponent it;
            super.onMouseClick(mouseX, mouseY, button);
            float mouseXF = mouseX;
            float mouseYF = mouseY;
            ConfigSettingsPopup popup = \u0636\u0632.activeSettingsPopup$default(this, null, 1, null);
            if (button == 0 && this.pageTabsArea().contains(mouseXF, mouseYF)) {
                ConfigContentArea tabs = this.pageTabsArea();
                Integer n = this.pageTabIndex(tabs, mouseXF, mouseYF);
                if (n != null) {
                    int index = ((Number)n).intValue();
                    boolean bl2 = false;
                    this.selectPage(index == 0 ? ConfigPage.LOCAL : ConfigPage.CLOUD);
                }
                return;
            }
            if (button == 0 && this.settingsPopupOpen) {
                Object object = popup;
                boolean bl3 = object != null && (object = ((ConfigSettingsPopup)object).getBounds()) != null ? ((ConfigSettingsPopupBounds)object).contains(mouseXF, mouseYF) : false;
                if (bl3) {
                    if (this.settingsPopupButtonBounds(popup, 0).contains(mouseXF, mouseYF)) {
                        this.startConfigRename(popup.getConfigName());
                        \u0636\u0632.closeSettingsPopup$default(this, false, 1, null);
                    } else if (this.settingsPopupButtonBounds(popup, 1).contains(mouseXF, mouseYF)) {
                        if (this.currentPage == ConfigPage.CLOUD) {
                            this.onShareConfig.invoke(popup.getConfigName());
                        } else {
                            this.onSaveToCloud.invoke(popup.getConfigName());
                        }
                        \u0636\u0632.closeSettingsPopup$default(this, false, 1, null);
                    }
                    return;
                }
            }
            if (button == 0 && this.renamingConfigName != null) {
                ConfigEntryComponent renamingEntry;
                Object v3;
                block19: {
                    Iterable $this$firstOrNull$iv = this.configEntries;
                    boolean $i$f$firstOrNull = false;
                    for (Object element$iv : $this$firstOrNull$iv) {
                        it = (ConfigEntryComponent)element$iv;
                        boolean bl4 = false;
                        if (!Intrinsics.areEqual(it.getConfigName(), this.renamingConfigName)) continue;
                        v3 = element$iv;
                        break block19;
                    }
                    v3 = null;
                }
                ConfigEntryComponent configEntryComponent = renamingEntry = (ConfigEntryComponent)v3;
                boolean bl5 = configEntryComponent != null ? configEntryComponent.isInsideRenameEditor(mouseXF, mouseYF) : false;
                if (bl5) {
                    return;
                }
                this.cancelConfigRename();
            }
            if (!this.insideContent(mouseXF, mouseYF)) {
                if (button == 0) {
                    \u0636\u0632.closeSettingsPopup$default(this, false, 1, null);
                }
                return;
            }
            Iterable $this$any$iv = this.configEntries;
            boolean $i$f$any = false;
            if ($this$any$iv instanceof Collection && ((Collection)$this$any$iv).isEmpty()) {
                bl = false;
            } else {
                for (Object element$iv : $this$any$iv) {
                    it = (ConfigEntryComponent)element$iv;
                    boolean bl6 = false;
                    if (!it.isInsideSettings(mouseXF, mouseYF)) continue;
                    bl = true;
                    break block20;
                }
                bl = false;
            }
        }
        boolean clickedSettings = bl;
        if (button == 0 && !clickedSettings) {
            \u0636\u0632.closeSettingsPopup$default(this, false, 1, null);
        }
        Iterable $this$forEach$iv = this.configEntries;
        boolean $i$f$forEach = false;
        for (Object t : $this$forEach$iv) {
            void var3_3;
            void var2_2;
            void var1_1;
            ConfigEntryComponent configEntryComponent = (ConfigEntryComponent)t;
            boolean bl7 = false;
            configEntryComponent.onMouseClick((int)var1_1, (int)var2_2, (int)var3_3);
        }
    }

    public final void setScrollProgress(float progress, boolean instant) {
        float max = this.scroll.max();
        if (max <= 0.0f) {
            this.scroll.setValue(0.0f).setTargetValue(0.0f);
            return;
        }
        float target = -max * RangesKt.coerceIn(progress, 0.0f, 1.0f);
        this.scroll.setTargetValue(target);
        if (instant) {
            this.scroll.setValue(target);
        }
    }

    @Override
    @NotNull
    public ClientRenderPipeline iconsPipeline() {
        return ClientRenderPipeline.GUI_SPECIAL;
    }

    /*
     * Unable to fully structure code
     */
    private final void startConfigRename(String configName) {
        block4: {
            if (Intrinsics.areEqual(this.renamingConfigName, configName)) {
                return;
            }
            this.renamingConfigName = configName;
            var3_2 = this.configEntries;
            var9_3 = this;
            $i$f$firstOrNull = false;
            for (T element$iv : $this$firstOrNull$iv) {
                it = (ConfigEntryComponent)element$iv;
                $i$a$-firstOrNull-ConfigsCategoryComponent$startConfigRename$1 = false;
                if (!Intrinsics.areEqual(it.getConfigName(), configName)) continue;
                v0 = element$iv;
                break block4;
            }
            v0 = null;
        }
        var2_9 = v0;
        if (var2_9 == null) ** GOTO lbl-1000
        var3_2 = var2_9.getDisplayName();
        if (var3_2 != null) {
            v1 = var3_2;
        } else lbl-1000:
        // 2 sources

        {
            v1 = var1_1;
        }
        var9_3.renamingConfigText = v1;
    }

    /*
     * WARNING - void declaration
     */
    private final void renderSettingsPopup(ConfigContentArea area, int mouseX, int mouseY) {
        void var3_3;
        void var2_2;
        void var6_6;
        ConfigSettingsPopup configSettingsPopup = this.activeSettingsPopup(area);
        if (configSettingsPopup == null) {
            return;
        }
        ConfigSettingsPopup popup = configSettingsPopup;
        \u0628\u0641 \u0628\u06412 = \u0628\u0641.INSTANCE;
        float progress = RangesKt.coerceIn(this.settingsPopupAnimation.animate(this.settingsPopupOpen ? 1.0f : 0.0f, 180.0f, new \u062f\u062e(\u0628\u06412)), 0.0f, 1.0f);
        if (progress <= 0.001f) {
            if (!this.settingsPopupOpen) {
                this.settingsPopupConfigName = null;
            }
            return;
        }
        float popupAlpha = this.getAlpha() * progress;
        float renderX = popup.getBounds().getLeft() - (1.0f - progress) * 4.0f;
        float selection = ConfigManager.INSTANCE.isConfigActive(popup.getConfigName()) ? 1.0f : 0.0f;
        float surfaceAlpha = 0.03f + 0.02f * selection;
        float borderAlpha = 0.05f + 0.03f * selection;
        \u0630\u0631.INSTANCE.getBASIC_RECT().priority(this.textPipeline()).color(\u062b\u0652.INSTANCE.panel(popupAlpha)).round(4.0f).draw(renderX, popup.getBounds().getTop(), popup.getBounds().getWidth(), popup.getBounds().getHeight());
        \u0630\u0631.INSTANCE.getBLURRED_RECT().priority(this.textPipeline()).color(\u062b\u0652.INSTANCE.surface(surfaceAlpha * popupAlpha)).round(4.0f).mix(0.95f).border(1.0f, \u062b\u0652.INSTANCE.title(borderAlpha * popupAlpha)).draw(renderX, popup.getBounds().getTop(), popup.getBounds().getWidth(), popup.getBounds().getHeight());
        this.renderSettingsPopupButtons(renderX + this.settingsPopupInset, popup.getBounds().getTop() + this.settingsPopupInset, popup.getBounds().getWidth() - this.settingsPopupInset * 2.0f, (float)var6_6, (int)var2_2, (int)var3_3);
    }

    /*
     * WARNING - void declaration
     */
    private final String resolveTypedKey(int button) {
        String string;
        boolean bl;
        String keyName;
        block6: {
            String string2 = GLFW.glfwGetKeyName((int)button, (int)0);
            if (string2 == null) {
                return null;
            }
            keyName = string2;
            if (!this.isShiftDown()) {
                return keyName;
            }
            if (Intrinsics.areEqual(keyName, "-")) {
                return "_";
            }
            CharSequence $this$all$iv = keyName;
            boolean $i$f$all = false;
            for (int i = 0; i < $this$all$iv.length(); ++i) {
                void var7_7;
                char element$iv;
                char p0 = element$iv = $this$all$iv.charAt(i);
                boolean bl2 = false;
                if (Character.isLetter((char)var7_7)) continue;
                bl = false;
                break block6;
            }
            bl = true;
        }
        if (bl) {
            String string3 = keyName.toUpperCase(Locale.ROOT);
            string = string3;
            Intrinsics.checkNotNullExpressionValue(string3, "toUpperCase(...)");
        } else {
            void var2_2;
            string = var2_2;
        }
        return string;
    }

    @Override
    @NotNull
    public ClientRenderPipeline rectPipeline() {
        return ClientRenderPipeline.GUI_RECT;
    }

    /*
     * WARNING - void declaration
     */
    private final void renderPageTabs(ConfigContentArea area, int mouseX, int mouseY) {
        void var3_3;
        void var2_2;
        void var4_5;
        block4: {
            block3: {
                if (area.getWidth() <= 0.0f) break block3;
                if (!(area.getHeight() <= 0.0f)) break block4;
            }
            return;
        }
        \u0628\u0641 \u0628\u06412 = \u0628\u0641.INSTANCE;
        float cloudSelection = RangesKt.coerceIn(this.pageIndicatorAnimation.animate(this.currentPage == ConfigPage.CLOUD ? 1.0f : 0.0f, 220.0f, new \u0630\u062f(\u0628\u06412)), 0.0f, 1.0f);
        this.renderPageTab(area, 0, "\u041b\u043e\u043a\u0430\u043b\u044c\u043d\u044b\u0435", 1.0f - cloudSelection, mouseX, mouseY);
        this.renderPageTab(area, 1, "\u041a\u043b\u0430\u0443\u0434", (float)var4_5, (int)var2_2, (int)var3_3);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final boolean insideContent(float mouseX, float mouseY) {
        ConfigContentArea area = this.contentArea();
        if (!(mouseX >= area.getLeft())) return false;
        if (!(mouseX <= area.getLeft() + area.getWidth())) return false;
        if (!(mouseY >= area.getTop())) return false;
        if (!(mouseY <= area.getTop() + area.getHeight())) return false;
        return true;
    }

    private final ConfigContentArea contentArea() {
        ConfigContentArea area = this.baseContentArea();
        ConfigContentArea footer = this.pageTabsArea();
        return new ConfigContentArea(area.getLeft(), area.getTop(), area.getWidth(), RangesKt.coerceAtLeast(footer.getTop() - area.getTop() - this.getPadding(), 0.0f));
    }

    private final ConfigContentArea baseContentArea() {
        float left = this.getX() + this.panelWidth + this.getPadding();
        float right = this.getX() + this.getWidth() - this.panelWidth / 3.0f;
        float top = this.getY() + this.contentTopOffset;
        float areaWidth = RangesKt.coerceAtLeast(right - left, 0.0f);
        float areaHeight = RangesKt.coerceAtLeast(this.getY() + this.getHeight() - top - this.getPadding(), 0.0f);
        return new ConfigContentArea(left, top, areaWidth, areaHeight);
    }

    private final void closeSettingsPopup(boolean immediate) {
        this.settingsPopupOpen = false;
        if (!immediate) {
            return;
        }
        AnimationUtil.animate$default(this.settingsPopupAnimation, 0.0f, 0.0f, null, 4, null);
        this.settingsPopupConfigName = null;
    }

    @Override
    @NotNull
    public ClientRenderPipeline textPipeline() {
        return ClientRenderPipeline.GUI_TEXT;
    }

    private final float contentHeight() {
        if (this.configEntries.isEmpty()) {
            return 0.0f;
        }
        int rowCount = (this.configEntries.size() + this.columnCount - 1) / this.columnCount;
        float rowHeight = ((ConfigEntryComponent)CollectionsKt.first((List)this.configEntries)).getDefaultHeight();
        return (float)rowCount * rowHeight + (float)(rowCount + -1) * this.getPadding();
    }

    private final float pageTabWidth(ConfigContentArea area) {
        return RangesKt.coerceAtLeast((area.getWidth() - this.pageTabsGap) * 0.5f, 0.0f);
    }

    private final void cancelConfigRename() {
        this.renamingConfigName = null;
        this.renamingConfigText = "";
    }

    public \u0636\u0632(float panelWidth, float contentTopOffset, @NotNull Function1<? super String, Unit> onShareConfig, @NotNull Function1<? super String, Unit> onSaveToCloud, @NotNull Function2<? super String, ? super String, Unit> onDeleteOwnedCloud, @NotNull Function2<? super String, ? super String, Unit> onDeleteReceivedCloud, @NotNull Function1<? super Boolean, Unit> onPageChanged) {
        ArrayList<AnimationUtil> arrayList;
        int n;
        Intrinsics.checkNotNullParameter(onShareConfig, "onShareConfig");
        Intrinsics.checkNotNullParameter(onSaveToCloud, "onSaveToCloud");
        Intrinsics.checkNotNullParameter(onDeleteOwnedCloud, "onDeleteOwnedCloud");
        Intrinsics.checkNotNullParameter(onDeleteReceivedCloud, "onDeleteReceivedCloud");
        Intrinsics.checkNotNullParameter(onPageChanged, "onPageChanged");
        this.panelWidth = panelWidth;
        this.contentTopOffset = contentTopOffset;
        this.onShareConfig = onShareConfig;
        this.onSaveToCloud = onSaveToCloud;
        this.onDeleteOwnedCloud = onDeleteOwnedCloud;
        this.onDeleteReceivedCloud = onDeleteReceivedCloud;
        this.onPageChanged = onPageChanged;
        this.columnCount = 2;
        this.pageTabsHeight = 30.0f;
        this.pageTabButtonHeight = 22.0f;
        this.pageTabsGap = 4.0f;
        this.pageIndicatorAnimation = new AnimationUtil(0.0f, 1, null);
        this.pageContentAnimation = new AnimationUtil(1.0f);
        int n2 = 2;
        \u0636\u0632 \u0636\u06322 = this;
        ArrayList<AnimationUtil> arrayList2 = new ArrayList<AnimationUtil>(n2);
        int n3 = 0;
        while (n3 < n2) {
            int it = n = n3++;
            arrayList = arrayList2;
            boolean bl = false;
            arrayList.add(new AnimationUtil(0.0f, 1, null));
        }
        \u0636\u06322.pageTabHoverAnimations = arrayList2;
        this.configEntries = new ArrayList();
        this.configListAnimations = new \u062b\u0651(0.0f, 0.0f, 3, null);
        this.renderedConfigEntries = CollectionsKt.emptyList();
        this.emptyStateAnimation = new AnimationUtil(0.0f, 1, null);
        this.configs = CollectionsKt.emptyList();
        this.currentPage = ConfigPage.LOCAL;
        this.pageSlideDirection = 1.0f;
        this.configStateVersion = Integer.MIN_VALUE;
        this.scroll = new ScrollUtil(0.0f, 1, null);
        this.settingsPopupAnimation = new AnimationUtil(0.0f, 1, null);
        n2 = 2;
        \u0636\u06322 = this;
        arrayList2 = new ArrayList(n2);
        n3 = 0;
        while (n3 < n2) {
            int n4 = n = n3++;
            arrayList = arrayList2;
            boolean bl = false;
            arrayList.add(new AnimationUtil(0.0f, 1, null));
        }
        \u0636\u06322.settingsPopupButtonHoverAnimations = arrayList2;
        this.settingsPopupInset = 4.0f;
        this.settingsPopupButtonHeight = 15.0f;
        this.settingsPopupButtonGap = 2.0f;
        this.settingsPopupButtonHorizontalPadding = 5.0f;
        this.settingsPopupTextSize = 6.2f;
        this.settingsPopupTextOpticalOffset = 0.8f;
        this.settingsPopupIconSize = 6.4f;
        this.settingsPopupIconGap = 3.0f;
        this.configNameMaxLength = 24;
        this.renameConfigButton = TuplesKt.to("1", "\u041f\u0435\u0440\u0435\u0438\u043c\u0435\u043d\u043e\u0432\u0430\u0442\u044c \u043a\u043e\u043d\u0444\u0438\u0433");
        this.shareConfigButton = TuplesKt.to("2", "\u041f\u043e\u0434\u0435\u043b\u0438\u0442\u0441\u044f \u043a\u043e\u043d\u0444\u0438\u0433\u043e\u043c");
        this.saveCloudConfigButton = TuplesKt.to("2", "\u0421\u043e\u0445\u0440\u0430\u043d\u0438\u0442\u044c \u0432 Cloud");
        this.settingsPopupHeight = this.settingsPopupInset * 2.0f + this.settingsPopupButtonHeight * 2.0f + this.settingsPopupButtonGap;
        this.renamingConfigText = "";
    }

    public final void showCloudPage() {
        if (this.currentPage != ConfigPage.CLOUD) {
            this.selectPage(ConfigPage.CLOUD);
            return;
        }
        this.pageSlideDirection = 1.0f;
        AnimationUtil.animate$default(this.pageContentAnimation, 0.0f, 0.0f, null, 4, null);
        this.scroll = new ScrollUtil(0.0f, 1, null);
        this.configStateVersion = Integer.MIN_VALUE;
        \u0636\u0632.syncEntries$default(this, false, 1, null);
    }

    private final ConfigContentArea pageTabsArea() {
        ConfigContentArea area = this.baseContentArea();
        float footerHeight = RangesKt.coerceAtMost(this.pageTabsHeight, area.getHeight());
        return new ConfigContentArea(area.getLeft(), area.getTop() + area.getHeight() - footerHeight, area.getWidth(), footerHeight);
    }

    public /* synthetic */ \u0636\u0632(float f, float f2, Function1 function1, Function1 function12, Function2 function2, Function2 function22, Function1 function13, int n, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 0x40) != 0) {
            function13 = \u0636\u0632::_init_$lambda$0;
        }
        this(f, f2, function1, function12, function2, function22, function13);
    }

    static /* synthetic */ void closeSettingsPopup$default(\u0636\u0632 \u0636\u06322, boolean bl, int n, Object object) {
        if ((n & 1) != 0) {
            bl = false;
        }
        \u0636\u06322.closeSettingsPopup(bl);
    }

    private final void renderSettingsPopupButtons(float x, float y, float width, float popupAlpha, int mouseX, int mouseY) {
        Iterable $this$forEachIndexed$iv = this.settingsPopupButtons();
        boolean $i$f$forEachIndexed = false;
        int index$iv = 0;
        for (Object item$iv : $this$forEachIndexed$iv) {
            int n;
            if ((n = index$iv++) < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Pair pair = (Pair)item$iv;
            int index = n;
            boolean bl = false;
            String icon = (String)pair.component1();
            String text = (String)pair.component2();
            float buttonY = y + (float)index * (this.settingsPopupButtonHeight + this.settingsPopupButtonGap);
            boolean hovered = (float)mouseX >= x && (float)mouseX <= x + width && (float)mouseY >= buttonY && (float)mouseY <= buttonY + this.settingsPopupButtonHeight;
            \u0628\u0641 \u0628\u06412 = \u0628\u0641.INSTANCE;
            float hover = RangesKt.coerceIn(this.settingsPopupButtonHoverAnimations.get(index).animate(hovered ? 1.0f : 0.0f, 170.0f, new \u0627\u062c(\u0628\u06412)), 0.0f, 1.0f);
            \u0630\u0631.INSTANCE.getBLURRED_RECT().priority(this.textPipeline()).color(\u062b\u0652.INSTANCE.surface((0.035f + 0.035f * hover) * popupAlpha)).mix(0.95f).round(3.0f).border(1.0f, \u062b\u0652.INSTANCE.title((0.06f + 0.06f * hover) * popupAlpha)).draw(x, buttonY, RangesKt.coerceAtLeast(width, 0.0f), this.settingsPopupButtonHeight);
            float iconWidth = Font.getWidth$default(\u0631\u064e.INSTANCE.getICON2(), icon, this.settingsPopupIconSize, 0.0f, 4, null);
            float contentX = x + this.settingsPopupButtonHorizontalPadding;
            Font.drawText$default(\u0631\u064e.INSTANCE.getICON2().priority(this.textPipeline()), icon, contentX, buttonY + (this.settingsPopupButtonHeight - \u0631\u064e.INSTANCE.getICON2().getHeight(this.settingsPopupIconSize)) * 0.5f, this.settingsPopupIconSize, \u062b\u0652.INSTANCE.title((0.82f + 0.18f * hover) * popupAlpha), 0.0f, 0.0f, 0.0f, 0, 0.0f, 992, null);
            Font.drawText$default(\u0631\u064e.INSTANCE.getGS_MEDIUM().priority(this.textPipeline()), text, contentX + iconWidth + this.settingsPopupIconGap, buttonY + (this.settingsPopupButtonHeight - \u0631\u064e.INSTANCE.getGS_MEDIUM().getHeight(this.settingsPopupTextSize)) * 0.5f - this.settingsPopupTextOpticalOffset, this.settingsPopupTextSize, \u062b\u0652.INSTANCE.title((0.82f + 0.18f * hover) * popupAlpha), 0.0f, 0.0f, 0.0f, 0, 0.0f, 992, null);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final boolean isShiftDown() {
        long handle = \u0636\u0643.getMc().getWindow().getHandle();
        if (GLFW.glfwGetKey((long)handle, (int)340) == 1) return true;
        if (GLFW.glfwGetKey((long)handle, (int)344) != 1) return false;
        return true;
    }

    private final float settingsPopupButtonContentWidth(Pair<String, String> button) {
        String icon = button.component1();
        String text = button.component2();
        return Font.getWidth$default(\u0631\u064e.INSTANCE.getICON2(), icon, this.settingsPopupIconSize, 0.0f, 4, null) + this.settingsPopupIconGap + Font.getWidth$default(\u0631\u064e.INSTANCE.getGS_MEDIUM(), text, this.settingsPopupTextSize, 0.0f, 4, null);
    }

    public final float scrollContentHeight() {
        return this.cachedTotalHeight;
    }

    private final void appendToConfigRename(String value) {
        boolean bl = ((CharSequence)value).length() == 0;
        if (bl || this.renamingConfigText.length() >= this.configNameMaxLength) {
            return;
        }
        this.renamingConfigText = StringsKt.take(this.renamingConfigText + value, this.configNameMaxLength);
    }

    private static final Unit _init_$lambda$0(boolean it) {
        return Unit.INSTANCE;
    }
}

