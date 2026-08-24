/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Vector3f
 */
package oxxxde;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotakbaz.rain.client.util.animations.AnimationUtil;
import kotakbaz.rain.client.util.other.ScrollUtil;
import kotakbaz.rain.client.util.render.engine.controls.ClientRenderPipeline;
import kotakbaz.rain.client.util.render.font.Font;
import kotakbaz.rain.ui.api.PipelinedRender;
import kotakbaz.rain.ui.menu.EventsCategoryComponent;
import kotakbaz.rain.ui.menu.FunTimeEventsApi;
import kotakbaz.rain.ui.menu.misc.AnimatedListTracker;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.joml.Vector3f;
import oxxxde.\u0627\u0638;
import oxxxde.\u0628\u062d;
import oxxxde.\u0628\u062f;
import oxxxde.\u0628\u0641;
import oxxxde.\u062b\u0651;
import oxxxde.\u062b\u0652;
import oxxxde.\u062c\u0647;
import oxxxde.\u062c\u0650;
import oxxxde.\u062e\u0622;
import oxxxde.\u062e\u0645;
import oxxxde.\u0630\u0631;
import oxxxde.\u0630\u064d;
import oxxxde.\u0631\u064e;
import oxxxde.\u0632\u0646;
import oxxxde.\u0635\u0645;
import oxxxde.\u0636\u0641;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u0002:\b\u00a8\u0001\u00a9\u0001\u00aa\u0001\u00ab\u0001B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u00a2\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016\u00a2\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016\u00a2\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\fH\u0016\u00a2\u0006\u0004\b\u0010\u0010\u000eJ\u0015\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011\u00a2\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\b\u00a2\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\b\u001d\u0010\u001eJ'\u0010 \u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\b \u0010\u001bJ\u0015\u0010!\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u0003\u00a2\u0006\u0004\b!\u0010\"J\u001f\u0010&\u001a\u00020\b2\u0006\u0010#\u001a\u00020\u00032\b\b\u0002\u0010%\u001a\u00020$\u00a2\u0006\u0004\b&\u0010'J\r\u0010(\u001a\u00020\u0003\u00a2\u0006\u0004\b(\u0010)J\r\u0010*\u001a\u00020\u0003\u00a2\u0006\u0004\b*\u0010)J\r\u0010+\u001a\u00020\u0003\u00a2\u0006\u0004\b+\u0010)JC\u00103\u001a\u00020\b2\u0006\u0010-\u001a\u00020,2\u0012\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000/0.2\u0006\u00102\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\b3\u00104JG\u0010:\u001a\u00020\b2\u0006\u00105\u001a\u0002002\u0006\u00106\u001a\u00020\u00032\u0006\u00107\u001a\u00020\u00032\u0006\u00108\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u00109\u001a\u00020\u0003H\u0002\u00a2\u0006\u0004\b:\u0010;J'\u0010<\u001a\u00020\b2\u0006\u0010-\u001a\u00020,2\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\b<\u0010=J?\u0010@\u001a\u00020\b2\u0006\u00106\u001a\u00020\u00032\u0006\u00107\u001a\u00020\u00032\u0006\u00108\u001a\u00020\u00032\u0006\u0010?\u001a\u00020>2\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\b@\u0010AJ\u000f\u0010B\u001a\u00020\bH\u0002\u00a2\u0006\u0004\bB\u0010\u0016J\u0015\u0010C\u001a\b\u0012\u0004\u0012\u0002000.H\u0002\u00a2\u0006\u0004\bC\u0010DJ\u0017\u0010F\u001a\u00020\b2\u0006\u0010E\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\bF\u0010GJ\u001d\u0010H\u001a\u00020\u00112\f\u00101\u001a\b\u0012\u0004\u0012\u0002000.H\u0002\u00a2\u0006\u0004\bH\u0010IJ\u001f\u0010K\u001a\u00020\b2\u0006\u0010-\u001a\u00020,2\u0006\u0010J\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\bK\u0010LJ/\u0010O\u001a\u00020\b2\u0006\u0010-\u001a\u00020,2\u0006\u0010M\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u00032\u0006\u0010N\u001a\u00020\u0003H\u0002\u00a2\u0006\u0004\bO\u0010PJ'\u0010S\u001a\u00020\u00112\u0006\u0010M\u001a\u00020\u00112\u0006\u0010Q\u001a\u00020\u00032\u0006\u0010R\u001a\u00020\u0003H\u0002\u00a2\u0006\u0004\bS\u0010TJ'\u0010W\u001a\u00020\u00032\u0006\u0010?\u001a\u00020>2\u0006\u0010U\u001a\u00020$2\u0006\u0010V\u001a\u00020\u0003H\u0002\u00a2\u0006\u0004\bW\u0010XJ)\u0010Y\u001a\u0004\u0018\u00010\u00072\u0006\u0010-\u001a\u00020,2\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0003H\u0002\u00a2\u0006\u0004\bY\u0010ZJ\u0017\u0010\\\u001a\u00020[2\u0006\u0010-\u001a\u00020,H\u0002\u00a2\u0006\u0004\b\\\u0010]J\u0017\u0010_\u001a\u00020\u00032\u0006\u0010^\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\b_\u0010`J'\u0010b\u001a\u00020,2\u0006\u0010-\u001a\u00020,2\u0006\u0010a\u001a\u00020\u00032\u0006\u00102\u001a\u00020\u0003H\u0002\u00a2\u0006\u0004\bb\u0010cJ'\u0010e\u001a\u00020,2\u0006\u0010-\u001a\u00020,2\u0006\u0010d\u001a\u00020\u00072\u0006\u00102\u001a\u00020\u0003H\u0002\u00a2\u0006\u0004\be\u0010fJ'\u0010j\u001a\u00020,2\u0006\u0010g\u001a\u00020\u00032\u0006\u0010h\u001a\u00020\u00032\u0006\u0010i\u001a\u00020\u0003H\u0002\u00a2\u0006\u0004\bj\u0010kJ\u0017\u0010l\u001a\u00020\u00032\u0006\u00106\u001a\u00020\u0003H\u0002\u00a2\u0006\u0004\bl\u0010mJ\u000f\u0010n\u001a\u00020,H\u0002\u00a2\u0006\u0004\bn\u0010oJ\u0017\u0010p\u001a\u00020,2\u0006\u0010-\u001a\u00020,H\u0002\u00a2\u0006\u0004\bp\u0010qJ\u001f\u0010s\u001a\u00020,2\u0006\u0010-\u001a\u00020,2\u0006\u0010r\u001a\u00020,H\u0002\u00a2\u0006\u0004\bs\u0010tJ#\u0010u\u001a\u00020$*\u00020,2\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0003H\u0002\u00a2\u0006\u0004\bu\u0010vJ?\u0010x\u001a\u00020$2\u0006\u00106\u001a\u00020\u00032\u0006\u00107\u001a\u00020\u00032\u0006\u00108\u001a\u00020\u00032\u0006\u0010w\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0003H\u0002\u00a2\u0006\u0004\bx\u0010yR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0004\u0010zR\u0014\u0010\u0005\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0005\u0010zR \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\t\u0010{R\u0014\u0010|\u001a\u00020\u00038\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\b|\u0010zR\u0014\u0010}\u001a\u00020\u00038\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\b}\u0010zR\u0014\u0010~\u001a\u00020\u00038\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\b~\u0010zR\u0014\u0010\u007f\u001a\u00020\u00038\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\b\u007f\u0010zR\u0016\u0010\u0080\u0001\u001a\u00020\u00038\u0002X\u0082D\u00a2\u0006\u0007\n\u0005\b\u0080\u0001\u0010zR\u0016\u0010\u0081\u0001\u001a\u00020\u00038\u0002X\u0082D\u00a2\u0006\u0007\n\u0005\b\u0081\u0001\u0010zR\u0016\u0010\u0082\u0001\u001a\u00020\u00038\u0002X\u0082D\u00a2\u0006\u0007\n\u0005\b\u0082\u0001\u0010zR\u0016\u0010\u0083\u0001\u001a\u00020\u00038\u0002X\u0082D\u00a2\u0006\u0007\n\u0005\b\u0083\u0001\u0010zR\u0016\u0010\u0084\u0001\u001a\u00020\u00038\u0002X\u0082D\u00a2\u0006\u0007\n\u0005\b\u0084\u0001\u0010zR\u0018\u0010\u0086\u0001\u001a\u00030\u0085\u00018\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R\u001d\u0010\u0088\u0001\u001a\b\u0012\u0004\u0012\u00020>0.8\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R7\u0010\u008d\u0001\u001a\"\u0012\u0004\u0012\u00020\u0007\u0012\u0005\u0012\u00030\u008b\u00010\u008a\u0001j\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0005\u0012\u00030\u008b\u0001`\u008c\u00018\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001R7\u0010\u008f\u0001\u001a\"\u0012\u0004\u0012\u00020\u0007\u0012\u0005\u0012\u00030\u008b\u00010\u008a\u0001j\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0005\u0012\u00030\u008b\u0001`\u008c\u00018\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u008f\u0001\u0010\u008e\u0001R7\u0010\u0090\u0001\u001a\"\u0012\u0004\u0012\u00020\u0007\u0012\u0005\u0012\u00030\u008b\u00010\u008a\u0001j\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0005\u0012\u00030\u008b\u0001`\u008c\u00018\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u0090\u0001\u0010\u008e\u0001R$\u0010\u0092\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u0002000\u0091\u00018\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u0092\u0001\u0010\u0093\u0001R\u0018\u0010\u0094\u0001\u001a\u00030\u008b\u00018\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u0094\u0001\u0010\u0095\u0001R\u001f\u0010\u0096\u0001\u001a\b\u0012\u0004\u0012\u0002000.8\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u0096\u0001\u0010\u0089\u0001R%\u0010\u0097\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000/0.8\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u0097\u0001\u0010\u0089\u0001R\u0019\u0010\u0098\u0001\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u0098\u0001\u0010\u0099\u0001R\u0019\u0010\u009a\u0001\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u009a\u0001\u0010\u0099\u0001R\u0019\u0010\u009b\u0001\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u009b\u0001\u0010\u0099\u0001R\u001a\u0010\u009d\u0001\u001a\u00030\u009c\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u009d\u0001\u0010\u009e\u0001R\u001a\u0010\u009f\u0001\u001a\u00030\u009c\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u009f\u0001\u0010\u009e\u0001R\u0019\u0010\u00a0\u0001\u001a\u00020$8\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u00a0\u0001\u0010\u00a1\u0001R\u0019\u0010\u00a2\u0001\u001a\u00020$8\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u00a2\u0001\u0010\u00a1\u0001R\u001a\u0010\u00a4\u0001\u001a\u00030\u00a3\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u00a4\u0001\u0010\u00a5\u0001R\u0018\u0010\u00a6\u0001\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\b\u00a6\u0001\u0010zR\u0018\u0010\u00a7\u0001\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\b\u00a7\u0001\u0010z\u00a8\u0006\u00ac\u0001"}, d2={"Loxxxde/\u0637\u0643;", "Loxxxde/\u0627\u0638;", "Loxxxde/\u0627\u0633;", "", "panelWidth", "contentTopOffset", "Lkotlin/Function1;", "", "", "onJoinAnarchy", "<init>", "(FFLkotlin/jvm/functions/Function1;)V", "Loxxxde/\u0635\u0624;", "rectPipeline", "()Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;", "textPipeline", "iconsPipeline", "", "query", "setSearchQuery", "(Ljava/lang/String;)V", "resetScroll", "()V", "mouseX", "mouseY", "partialTicks", "render", "(IIF)V", "button", "onMouseClick", "(III)V", "vertical", "onMouseScroll", "scrollWheel", "(F)V", "progress", "", "instant", "setScrollProgress", "(FZ)V", "scrollOffsetValue", "()F", "scrollContentHeight", "scrollViewHeight", "Loxxxde/\u062b\u0621;", "area", "", "Loxxxde/\u062c\u0629;", "Loxxxde/\u0632;", "visibleItems", "scrollOffset", "renderList", "(Lkotakbaz/rain/ui/menu/EventsCategoryComponent$PanelArea;Ljava/util/List;FII)V", "item", "x", "y", "width", "presence", "renderCard", "(Lkotakbaz/rain/ui/menu/EventsCategoryComponent$EventEntry;FFFIIF)V", "renderButtons", "(Lkotakbaz/rain/ui/menu/EventsCategoryComponent$PanelArea;II)V", "Loxxxde/\u062b;", "filter", "renderButton", "(FFFLkotakbaz/rain/ui/menu/EventsCategoryComponent$EventFilter;II)V", "syncItems", "filteredItems", "()Ljava/util/List;", "selectedIndex", "selectFilter", "(I)V", "emptyStateText", "(Ljava/util/List;)Ljava/lang/String;", "targetText", "renderEmptyState", "(Lkotakbaz/rain/ui/menu/EventsCategoryComponent$PanelArea;Ljava/lang/String;)V", "text", "offsetY", "renderEmptyLabel", "(Lkotakbaz/rain/ui/menu/EventsCategoryComponent$PanelArea;Ljava/lang/String;FF)V", "maxWidth", "size", "trimToWidth", "(Ljava/lang/String;FF)Ljava/lang/String;", "hovered", "maxScrollOffset", "updateScrollOffset", "(Lkotakbaz/rain/ui/menu/EventsCategoryComponent$EventFilter;ZF)F", "buttonIndex", "(Lkotakbaz/rain/ui/menu/EventsCategoryComponent$PanelArea;FF)Ljava/lang/Integer;", "Loxxxde/\u0638\u064c;", "buttonLayout", "(Lkotakbaz/rain/ui/menu/EventsCategoryComponent$PanelArea;)Lkotakbaz/rain/ui/menu/EventsCategoryComponent$ButtonLayout;", "itemCount", "contentHeight", "(I)F", "position", "eventCardBounds", "(Lkotakbaz/rain/ui/menu/EventsCategoryComponent$PanelArea;FF)Lkotakbaz/rain/ui/menu/EventsCategoryComponent$PanelArea;", "index", "eventCardBoundsAtIndex", "(Lkotakbaz/rain/ui/menu/EventsCategoryComponent$PanelArea;IF)Lkotakbaz/rain/ui/menu/EventsCategoryComponent$PanelArea;", "cardX", "cardY", "cardWidth", "eventActionButtonBounds", "(FFF)Lkotakbaz/rain/ui/menu/EventsCategoryComponent$PanelArea;", "toTransformedX", "(F)F", "contentArea", "()Lkotakbaz/rain/ui/menu/EventsCategoryComponent$PanelArea;", "footerArea", "(Lkotakbaz/rain/ui/menu/EventsCategoryComponent$PanelArea;)Lkotakbaz/rain/ui/menu/EventsCategoryComponent$PanelArea;", "footer", "listArea", "(Lkotakbaz/rain/ui/menu/EventsCategoryComponent$PanelArea;Lkotakbaz/rain/ui/menu/EventsCategoryComponent$PanelArea;)Lkotakbaz/rain/ui/menu/EventsCategoryComponent$PanelArea;", "contains", "(Lkotakbaz/rain/ui/menu/EventsCategoryComponent$PanelArea;FF)Z", "height", "inside", "(FFFFFF)Z", "F", "Lkotlin/jvm/functions/Function1;", "rowHeight", "cardGap", "buttonHeight", "buttonGap", "footerHeight", "actionButtonSize", "actionIconSize", "hoverScrollDurationMs", "returnScrollDurationMs", "Lorg/joml/Vector3f;", "scratchPos", "Lorg/joml/Vector3f;", "filters", "Ljava/util/List;", "Ljava/util/HashMap;", "Loxxxde/\u0631\u064a;", "Lkotlin/collections/HashMap;", "itemAnimations", "Ljava/util/HashMap;", "cardHoverAnimations", "actionHoverAnimations", "Loxxxde/\u062b\u0651;", "listAnimations", "Loxxxde/\u062b\u0651;", "emptyTextAnimation", "Loxxxde/\u0631\u064a;", "items", "renderedItems", "emptyText", "Ljava/lang/String;", "previousEmptyText", "normalizedSearch", "", "apiGeneration", "J", "renderedSecond", "apiLoading", "Z", "apiFailed", "Loxxxde/\u0632\u0639;", "scroll", "Loxxxde/\u0632\u0639;", "cachedTotalHeight", "cachedViewHeight", "PanelArea", "ButtonLayout", "EventFilter", "EventEntry", "rain-visuals"})
public final class \u0637\u0643
extends \u0627\u0638
implements PipelinedRender {
    private long apiGeneration;
    private final float rowHeight;
    @NotNull
    private final Vector3f scratchPos;
    @NotNull
    private final HashMap<Integer, AnimationUtil> itemAnimations;
    private final float returnScrollDurationMs;
    @NotNull
    private final HashMap<Integer, AnimationUtil> actionHoverAnimations;
    private float cachedViewHeight;
    @NotNull
    private List<EventsCategoryComponent.EventEntry> items;
    @NotNull
    private final List<EventsCategoryComponent.EventFilter> filters;
    @NotNull
    private final HashMap<Integer, AnimationUtil> cardHoverAnimations;
    private final float panelWidth;
    private boolean apiLoading;
    @NotNull
    private final Function1<Integer, Unit> onJoinAnarchy;
    @NotNull
    private final AnimationUtil emptyTextAnimation;
    private long renderedSecond;
    private final float cardGap;
    private float cachedTotalHeight;
    private final float buttonHeight;
    @NotNull
    private String emptyText;
    private final float contentTopOffset;
    @NotNull
    private List<AnimatedListTracker.Item<EventsCategoryComponent.EventEntry>> renderedItems;
    @NotNull
    private final \u062b\u0651<Integer, EventsCategoryComponent.EventEntry> listAnimations;
    private boolean apiFailed;
    private final float footerHeight;
    private final float actionButtonSize;
    private final float actionIconSize;
    @NotNull
    private String previousEmptyText;
    @NotNull
    private ScrollUtil scroll;
    private final float buttonGap;
    private final float hoverScrollDurationMs;
    @NotNull
    private String normalizedSearch;

    private final EventsCategoryComponent.PanelArea eventCardBoundsAtIndex(EventsCategoryComponent.PanelArea area, int index, float scrollOffset) {
        float cardWidth = RangesKt.coerceAtLeast((area.getWidth() - this.cardGap) * 0.5f, 0.0f);
        int row = index / 2;
        int column = index % 2;
        return new EventsCategoryComponent.PanelArea(area.getLeft() + (float)column * (cardWidth + this.cardGap), area.getTop() - scrollOffset + (float)row * (this.rowHeight + this.getPadding()), cardWidth, this.rowHeight);
    }

    private final EventsCategoryComponent.PanelArea eventCardBounds(EventsCategoryComponent.PanelArea area, float position, float scrollOffset) {
        int lowerIndex = RangesKt.coerceAtLeast((int)Math.floor(position), 0);
        float fraction = RangesKt.coerceIn(position - (float)lowerIndex, 0.0f, 1.0f);
        EventsCategoryComponent.PanelArea lower = this.eventCardBoundsAtIndex(area, lowerIndex, scrollOffset);
        EventsCategoryComponent.PanelArea upper = this.eventCardBoundsAtIndex(area, lowerIndex + 1, scrollOffset);
        return new EventsCategoryComponent.PanelArea(lower.getLeft() + (upper.getLeft() - lower.getLeft()) * fraction, lower.getTop() + (upper.getTop() - lower.getTop()) * fraction, lower.getWidth(), this.rowHeight);
    }

    private final EventsCategoryComponent.PanelArea listArea(EventsCategoryComponent.PanelArea area, EventsCategoryComponent.PanelArea footer) {
        return new EventsCategoryComponent.PanelArea(area.getLeft(), area.getTop(), area.getWidth(), RangesKt.coerceAtLeast(footer.getTop() - area.getTop() - this.getPadding(), 0.0f));
    }

    private final EventsCategoryComponent.PanelArea contentArea() {
        float left = this.getX() + this.panelWidth + this.getPadding();
        float right = this.getX() + this.getWidth() - this.panelWidth / 3.0f;
        float top = this.getY() + this.contentTopOffset;
        return new EventsCategoryComponent.PanelArea(left, top, RangesKt.coerceAtLeast(right - left, 0.0f), RangesKt.coerceAtLeast(this.getY() + this.getHeight() - top - this.getPadding(), 0.0f));
    }

    private final EventsCategoryComponent.PanelArea eventActionButtonBounds(float cardX, float cardY, float cardWidth) {
        return new EventsCategoryComponent.PanelArea(cardX + cardWidth - this.getPadding() - this.actionButtonSize, cardY + (this.rowHeight - this.actionButtonSize) * 0.5f, this.actionButtonSize, this.actionButtonSize);
    }

    public static /* synthetic */ void setScrollProgress$default(\u0637\u0643 \u0637\u06432, float f, boolean bl, int n, Object object) {
        if ((n & 2) != 0) {
            bl = false;
        }
        \u0637\u06432.setScrollProgress(f, bl);
    }

    public final void scrollWheel(float vertical) {
        this.scroll.scroll(vertical * 2.5f);
    }

    /*
     * WARNING - void declaration
     */
    private final void renderCard(EventsCategoryComponent.EventEntry item, float x, float y, float width, int mouseX, int mouseY, float presence) {
        void var15_18;
        void var24_32;
        void var27_35;
        void var25_33;
        void var31_39;
        Object object;
        Object object2;
        \u0628\u0641 $this$getOrPut$iv;
        \u0628\u0641 \u0628\u06412 = \u0628\u0641.INSTANCE;
        float highlight = item.getSelectionAnimation().animate(item.getHighlighted() ? 1.0f : 0.0f, 220.0f, new \u0632\u0646(\u0628\u06412));
        boolean hovered = this.inside(x, y, width, this.rowHeight, mouseX, mouseY);
        Map map = this.cardHoverAnimations;
        Integer key$iv = item.getAnarchy();
        boolean $i$f$getOrPut = false;
        Object value$iv = $this$getOrPut$iv.get(key$iv);
        if (value$iv == null) {
            boolean bl = false;
            AnimationUtil answer$iv = new AnimationUtil(0.0f, 1, null);
            $this$getOrPut$iv.put(key$iv, answer$iv);
            object2 = answer$iv;
        } else {
            object2 = value$iv;
        }
        $this$getOrPut$iv = \u0628\u0641.INSTANCE;
        float hover = RangesKt.coerceIn(((AnimationUtil)object2).animate(hovered ? 1.0f : 0.0f, 180.0f, new \u062c\u0647($this$getOrPut$iv)), 0.0f, 1.0f);
        float cardAlpha = this.getAlpha() * presence;
        Color background = \u0628\u062d.INSTANCE.interpolateColor(\u062b\u0652.INSTANCE.surface(cardAlpha * (0.03f + 0.015f * hover)), \u062b\u0652.INSTANCE.surface(cardAlpha * (0.05f + 0.015f * hover)), highlight);
        Color border = \u0628\u062d.INSTANCE.interpolateColor(\u062b\u0652.INSTANCE.title(cardAlpha * (0.05f + 0.04f * hover)), \u062b\u0652.INSTANCE.title(cardAlpha * (0.08f + 0.04f * hover)), highlight);
        Color titleColor = \u0628\u062d.INSTANCE.interpolateColor(\u062b\u0652.INSTANCE.title(cardAlpha * (0.32f + 0.12f * hover)), \u062b\u0652.INSTANCE.title(cardAlpha), highlight);
        Color detailsColor = \u0628\u062d.INSTANCE.interpolateColor(\u062b\u0652.INSTANCE.value(cardAlpha * (0.16f + 0.1f * hover)), \u062b\u0652.INSTANCE.value(cardAlpha * 0.5f), highlight);
        EventsCategoryComponent.PanelArea actionBounds = this.eventActionButtonBounds(x, y, width);
        boolean actionHovered = this.contains(actionBounds, mouseX, mouseY);
        Object $this$getOrPut$iv2 = this.actionHoverAnimations;
        Integer key$iv2 = item.getAnarchy();
        boolean $i$f$getOrPut2 = false;
        Object value$iv2 = $this$getOrPut$iv2.get(key$iv2);
        if (value$iv2 == null) {
            boolean answer$iv22 = false;
            AnimationUtil answer$iv22 = new AnimationUtil(0.0f, 1, null);
            $this$getOrPut$iv2.put(key$iv2, answer$iv22);
            object = answer$iv22;
        } else {
            object = value$iv2;
        }
        $this$getOrPut$iv2 = \u0628\u0641.INSTANCE;
        float actionHover = RangesKt.coerceIn(((AnimationUtil)object).animate(actionHovered ? 1.0f : 0.0f, 170.0f, new \u0630\u064d((\u0628\u0641)$this$getOrPut$iv2)), 0.0f, 1.0f);
        Color actionIconColor = \u0628\u062d.INSTANCE.interpolateColor(\u062b\u0652.INSTANCE.value(cardAlpha * 0.48f), \u062b\u0652.INSTANCE.title(cardAlpha), actionHover);
        \u0630\u0631.INSTANCE.getBLURRED_RECT().priority(this.rectPipeline()).color(background).round(4.0f).mix(0.95f).border(1.0f, border).draw(x, y, width, this.rowHeight);
        String actionIcon = "p";
        float actionIconX = actionBounds.getLeft() + (actionBounds.getWidth() - Font.getWidth$default(\u0631\u064e.INSTANCE.getICON(), actionIcon, this.actionIconSize, 0.0f, 4, null)) * 0.5f;
        float actionIconY = actionBounds.getTop() + (actionBounds.getHeight() - \u0631\u064e.INSTANCE.getICON().getHeight(this.actionIconSize)) * 0.5f;
        Font.drawText$default(\u0631\u064e.INSTANCE.getICON().priority(this.iconsPipeline()), actionIcon, actionIconX, actionIconY, this.actionIconSize, actionIconColor, 0.0f, 0.0f, 0.0f, 0, 0.0f, 992, null);
        float titleSize = 8.0f;
        float detailsSize = 5.6f;
        float textX = x + this.getPadding() * 1.5f;
        float titleY = y + this.getPadding() * 1.5f;
        float detailsY = titleY + this.getDefaultFont().getHeight(titleSize) + this.getPadding() / 1.5f;
        String details = this.trimToWidth(item.getName() + "  \u2022  " + item.getStatus(), width - this.getPadding() * 3.0f, detailsSize);
        float availableTextWidth = RangesKt.coerceAtLeast(actionBounds.getLeft() - textX - this.getPadding(), 0.0f);
        String title = this.trimToWidth(item.getTitle(), availableTextWidth, titleSize);
        String clippedDetails = this.trimToWidth(details, availableTextWidth, detailsSize);
        Font.drawText$default(this.getDefaultFont().priority(this.textPipeline()), title, textX, titleY, titleSize, titleColor, 0.0f, 0.0f, 0.0f, 0, 0.0f, 992, null);
        Font.drawText$default(this.getDefaultFont().priority(this.textPipeline()), (String)var31_39, (float)var25_33, (float)var27_35, (float)var24_32, (Color)var15_18, 0.0f, 0.0f, 0.0f, 0, 0.0f, 992, null);
    }

    public final float scrollViewHeight() {
        return this.cachedViewHeight;
    }

    public final float scrollOffsetValue() {
        return this.scroll.value();
    }

    private final float contentHeight(int itemCount) {
        int rowCount = (itemCount + 1) / 2;
        return rowCount == 0 ? 0.0f : (float)rowCount * this.rowHeight + (float)(rowCount + -1) * this.getPadding();
    }

    @Override
    @NotNull
    public ClientRenderPipeline textPipeline() {
        return ClientRenderPipeline.GUI_TEXT;
    }

    private final Integer buttonIndex(EventsCategoryComponent.PanelArea area, float mouseX, float mouseY) {
        Object v0;
        block1: {
            EventsCategoryComponent.ButtonLayout layout = this.buttonLayout(area);
            Iterable $this$firstOrNull$iv = CollectionsKt.getIndices((Collection)this.filters);
            boolean $i$f$firstOrNull = false;
            for (Object element$iv : $this$firstOrNull$iv) {
                int index = ((Number)element$iv).intValue();
                boolean bl = false;
                float buttonX = layout.getStartX() + (float)index * (layout.getWidth() + this.buttonGap);
                if (!this.inside(buttonX, layout.getY(), layout.getWidth(), this.buttonHeight, mouseX, mouseY)) continue;
                v0 = element$iv;
                break block1;
            }
            v0 = null;
        }
        return v0;
    }

    private final void renderList(EventsCategoryComponent.PanelArea area, List<AnimatedListTracker.Item<EventsCategoryComponent.EventEntry>> visibleItems, float scrollOffset, int mouseX, int mouseY) {
        block4: {
            block3: {
                if (area.getWidth() <= 0.0f) break block3;
                if (area.getHeight() <= 0.0f) break block3;
                if (!visibleItems.isEmpty()) break block4;
            }
            return;
        }
        \u062c\u0650.INSTANCE.start(area.getLeft(), area.getTop(), area.getWidth(), area.getHeight());
        float bottom = area.getTop() + area.getHeight();
        Iterable $this$forEach$iv = visibleItems;
        boolean $i$f$forEach = false;
        for (Object element$iv : $this$forEach$iv) {
            AnimatedListTracker.Item animatedItem = (AnimatedListTracker.Item)element$iv;
            boolean bl = false;
            EventsCategoryComponent.PanelArea bounds = this.eventCardBounds(area, animatedItem.getPosition(), scrollOffset);
            float cardY = bounds.getTop() + (1.0f - animatedItem.getPresence()) * 4.0f;
            if (!(cardY + this.rowHeight > area.getTop()) || !(cardY < bottom)) continue;
            this.renderCard((EventsCategoryComponent.EventEntry)animatedItem.getValue(), bounds.getLeft(), cardY, bounds.getWidth(), mouseX, mouseY, animatedItem.getPresence());
        }
        \u062c\u0650.INSTANCE.end();
    }

    @Override
    public void render(int mouseX, int mouseY, float partialTicks) {
        super.render(mouseX, mouseY, partialTicks);
        this.syncItems();
        EventsCategoryComponent.PanelArea area = this.contentArea();
        EventsCategoryComponent.PanelArea footer = this.footerArea(area);
        EventsCategoryComponent.PanelArea listArea = this.listArea(area, footer);
        List<EventsCategoryComponent.EventEntry> visibleItems = this.filteredItems();
        this.renderedItems = this.listAnimations.update(visibleItems, \u0637\u0643::render$lambda$0);
        this.cachedTotalHeight = this.contentHeight(visibleItems.size());
        this.cachedViewHeight = listArea.getHeight();
        this.scroll.setMax(RangesKt.coerceAtLeast(this.cachedTotalHeight - this.cachedViewHeight, 0.0f));
        this.scroll.update();
        this.renderList(listArea, this.renderedItems, this.scroll.value(), mouseX, mouseY);
        this.renderEmptyState(listArea, this.emptyStateText(visibleItems));
        this.renderButtons(footer, mouseX, mouseY);
    }

    public final float scrollContentHeight() {
        return this.cachedTotalHeight;
    }

    private final boolean contains(EventsCategoryComponent.PanelArea $this$contains, float mouseX, float mouseY) {
        return this.inside($this$contains.getLeft(), $this$contains.getTop(), $this$contains.getWidth(), $this$contains.getHeight(), mouseX, mouseY);
    }

    @Override
    @NotNull
    public ClientRenderPipeline rectPipeline() {
        return ClientRenderPipeline.GUI_RECT;
    }

    private final void renderEmptyLabel(EventsCategoryComponent.PanelArea area, String text, float progress, float offsetY) {
        float size = 6.5f;
        Font.drawCenteredText$default(this.getDefaultFont().priority(this.textPipeline()), text, area.getLeft() + area.getWidth() * 0.5f, area.getTop() + area.getHeight() * 0.5f - size * 0.5f + offsetY, size, \u062b\u0652.INSTANCE.value(this.getAlpha() * 0.45f * progress), 0.0f, 32, null);
    }

    private final void renderButtons(EventsCategoryComponent.PanelArea area, int mouseX, int mouseY) {
        block6: {
            block5: {
                if (area.getWidth() <= 0.0f) break block5;
                if (!(area.getHeight() <= 0.0f) && !this.filters.isEmpty()) break block6;
            }
            return;
        }
        EventsCategoryComponent.ButtonLayout layout = this.buttonLayout(area);
        \u062c\u0650.INSTANCE.start(area.getLeft(), area.getTop(), area.getWidth(), area.getHeight());
        Iterable $this$forEachIndexed$iv = this.filters;
        boolean $i$f$forEachIndexed = false;
        int index$iv = 0;
        for (Object item$iv : $this$forEachIndexed$iv) {
            int n;
            if ((n = index$iv++) < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            EventsCategoryComponent.EventFilter filter = (EventsCategoryComponent.EventFilter)item$iv;
            int index = n;
            boolean bl = false;
            float buttonX = layout.getStartX() + (float)index * (layout.getWidth() + this.buttonGap);
            this.renderButton(buttonX, layout.getY(), layout.getWidth(), filter, mouseX, mouseY);
        }
        \u062c\u0650.INSTANCE.end();
    }

    public final void resetScroll() {
        this.scroll = new ScrollUtil(0.0f, 1, null);
    }

    private final String emptyStateText(List<EventsCategoryComponent.EventEntry> visibleItems) {
        boolean bl = !((Collection)visibleItems).isEmpty();
        if (bl) {
            return "";
        }
        return !((Collection)this.items).isEmpty() ? "\u041d\u0438\u0447\u0435\u0433\u043e \u043d\u0435 \u043d\u0430\u0439\u0434\u0435\u043d\u043e" : (this.apiLoading ? "\u0417\u0430\u0433\u0440\u0443\u0436\u0430\u044e \u0441\u043e\u0431\u044b\u0442\u0438\u044f..." : (this.apiFailed ? "\u041d\u0435 \u0443\u0434\u0430\u043b\u043e\u0441\u044c \u0437\u0430\u0433\u0440\u0443\u0437\u0438\u0442\u044c \u0441\u043e\u0431\u044b\u0442\u0438\u044f" : "\u0421\u043e\u0431\u044b\u0442\u0438\u0439 \u043f\u043e\u043a\u0430 \u043d\u0435\u0442"));
    }

    /*
     * WARNING - void declaration
     */
    private final float updateScrollOffset(EventsCategoryComponent.EventFilter filter, boolean hovered, float maxScrollOffset) {
        void var1_1;
        long nowNs = System.nanoTime();
        float deltaSec = filter.getLastUpdateNs() == 0L ? 0.0f : (float)((double)RangesKt.coerceAtLeast(nowNs - filter.getLastUpdateNs(), 0L) / 1.0E9);
        filter.setLastUpdateNs(nowNs);
        if (maxScrollOffset <= 0.0f) {
            filter.setScrollOffset(0.0f);
            return 0.0f;
        }
        float durationMs = hovered ? this.hoverScrollDurationMs : this.returnScrollDurationMs;
        float speed = durationMs <= 0.0f ? maxScrollOffset : maxScrollOffset / (durationMs / 1000.0f);
        filter.setScrollOffset(hovered ? RangesKt.coerceAtMost(filter.getScrollOffset() + speed * deltaSec, maxScrollOffset) : RangesKt.coerceAtLeast(filter.getScrollOffset() - speed * deltaSec, 0.0f));
        return var1_1.getScrollOffset();
    }

    private final float toTransformedX(float x) {
        this.scratchPos.set(x, 0.0f, 0.0f);
        \u0628\u062f.INSTANCE.transformPosition(this.scratchPos);
        return this.scratchPos.x;
    }

    public \u0637\u0643(float panelWidth, float contentTopOffset, @NotNull Function1<? super Integer, Unit> onJoinAnarchy) {
        Intrinsics.checkNotNullParameter(onJoinAnarchy, "onJoinAnarchy");
        this.panelWidth = panelWidth;
        this.contentTopOffset = contentTopOffset;
        this.onJoinAnarchy = onJoinAnarchy;
        this.rowHeight = 33.0f;
        this.cardGap = 5.0f;
        this.buttonHeight = 22.0f;
        this.buttonGap = 4.0f;
        this.footerHeight = 30.0f;
        this.actionButtonSize = 18.0f;
        this.actionIconSize = 5.6f;
        this.hoverScrollDurationMs = 900.0f;
        this.returnScrollDurationMs = 220.0f;
        this.scratchPos = new Vector3f();
        EventsCategoryComponent.EventFilter[] eventFilterArray = new EventsCategoryComponent.EventFilter[6];
        eventFilterArray[0] = new EventsCategoryComponent.EventFilter("\u0412\u0441\u0435", null, true, 0.0f, 0L, null, null, 122, null);
        eventFilterArray[1] = new EventsCategoryComponent.EventFilter("1x", CollectionsKt.listOf(new IntRange(101, 199)), false, 0.0f, 0L, null, null, 124, null);
        eventFilterArray[2] = new EventsCategoryComponent.EventFilter("2x", CollectionsKt.listOf(new IntRange(201, 299)), false, 0.0f, 0L, null, null, 124, null);
        eventFilterArray[3] = new EventsCategoryComponent.EventFilter("3x", CollectionsKt.listOf(new IntRange(301, 399)), false, 0.0f, 0L, null, null, 124, null);
        eventFilterArray[4] = new EventsCategoryComponent.EventFilter("5x", CollectionsKt.listOf(new IntRange(501, 599)), false, 0.0f, 0L, null, null, 124, null);
        eventFilterArray[5] = new EventsCategoryComponent.EventFilter("10x", CollectionsKt.listOf(new IntRange(901, 999)), false, 0.0f, 0L, null, null, 124, null);
        this.filters = CollectionsKt.listOf(eventFilterArray);
        this.itemAnimations = new HashMap();
        this.cardHoverAnimations = new HashMap();
        this.actionHoverAnimations = new HashMap();
        this.listAnimations = new \u062b\u0651(0.0f, 0.0f, 3, null);
        this.emptyTextAnimation = new AnimationUtil(1.0f);
        this.items = CollectionsKt.emptyList();
        this.renderedItems = CollectionsKt.emptyList();
        this.emptyText = "";
        this.previousEmptyText = "";
        this.normalizedSearch = "";
        this.apiGeneration = -1L;
        this.renderedSecond = -1L;
        this.scroll = new ScrollUtil(0.0f, 1, null);
    }

    private final EventsCategoryComponent.PanelArea footerArea(EventsCategoryComponent.PanelArea area) {
        float height = RangesKt.coerceAtMost(this.footerHeight, area.getHeight());
        return new EventsCategoryComponent.PanelArea(area.getLeft(), area.getTop() + area.getHeight() - height, area.getWidth(), height);
    }

    private final boolean inside(float x, float y, float width, float height, float mouseX, float mouseY) {
        return mouseX >= x && mouseX <= x + width && mouseY >= y && mouseY <= y + height;
    }

    @Override
    public void onMouseScroll(int mouseX, int mouseY, float vertical) {
        super.onMouseScroll(mouseX, mouseY, vertical);
        EventsCategoryComponent.PanelArea area = this.contentArea();
        if (this.contains(this.listArea(area, this.footerArea(area)), mouseX, mouseY)) {
            this.scrollWheel(vertical);
        }
    }

    /*
     * WARNING - void declaration
     */
    private final void syncItems() {
        void var11_13;
        void $this$mapTo$iv$iv;
        Object object;
        void $this$mapTo$iv;
        void $this$filterTo$iv$iv;
        FunTimeEventsApi.Snapshot snapshot = \u062e\u0645.INSTANCE.snapshot();
        long now = System.currentTimeMillis();
        long currentSecond = now / 1000L;
        if (snapshot.getGeneration() == this.apiGeneration && currentSecond == this.renderedSecond) {
            return;
        }
        this.apiGeneration = snapshot.getGeneration();
        this.renderedSecond = currentSecond;
        this.apiLoading = snapshot.getLoading();
        this.apiFailed = snapshot.getFailed();
        Iterable $this$filter$iv = snapshot.getEvents();
        boolean $i$f$filter22 = false;
        Iterable iterable = $this$filter$iv;
        Collection destination$iv$iv = new ArrayList();
        boolean $i$f$filterTo = false;
        for (Object element$iv$iv : $this$filterTo$iv$iv) {
            FunTimeEventsApi.Event it = (FunTimeEventsApi.Event)element$iv$iv;
            boolean bl = false;
            int n = it.getAnarchy();
            boolean bl2 = 100 <= n ? n < 1000 : false;
            if (!bl2) continue;
            destination$iv$iv.add(element$iv$iv);
        }
        List threeDigitEvents = (List)destination$iv$iv;
        Iterable $i$f$filter22 = threeDigitEvents;
        Collection destination$iv = new HashSet();
        boolean $i$f$mapTo22 = false;
        for (Object item$iv : $this$mapTo$iv) {
            Iterator iterator2;
            FunTimeEventsApi.Event p0 = (FunTimeEventsApi.Event)item$iv;
            object = destination$iv;
            boolean bl = false;
            object.add(((FunTimeEventsApi.Event)((Object)iterator2)).getAnarchy());
        }
        HashSet activeAnarchies = (HashSet)destination$iv;
        this.itemAnimations.keySet().retainAll(activeAnarchies);
        this.cardHoverAnimations.keySet().retainAll(activeAnarchies);
        this.actionHoverAnimations.keySet().retainAll(activeAnarchies);
        Iterable $this$map$iv = threeDigitEvents;
        object = this;
        boolean $i$f$map = false;
        Iterable $i$f$mapTo22 = $this$map$iv;
        Collection destination$iv$iv2 = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        boolean $i$f$mapTo = false;
        for (Object item$iv$iv : $this$mapTo$iv$iv) {
            AnimationUtil animationUtil;
            FunTimeEventsApi.Event event = (FunTimeEventsApi.Event)item$iv$iv;
            Collection collection = destination$iv$iv2;
            boolean bl = false;
            int n = event.getAnarchy();
            String string = "\u0410\u043d\u0430\u0440\u0445\u0438\u044f " + event.getAnarchy();
            String string2 = event.getName();
            String string3 = event.statusText(now);
            boolean bl3 = event.getKnown();
            Map $this$getOrPut$iv = this.itemAnimations;
            Integer key$iv = event.getAnarchy();
            boolean $i$f$getOrPut = false;
            Object value$iv = $this$getOrPut$iv.get(key$iv);
            if (value$iv == null) {
                boolean bl4 = bl3;
                String string4 = string3;
                String string5 = string2;
                String string6 = string;
                int n2 = n;
                boolean bl5 = false;
                AnimationUtil animationUtil2 = new AnimationUtil(0.0f, 1, null);
                n = n2;
                string = string6;
                string2 = string5;
                string3 = string4;
                bl3 = bl4;
                AnimationUtil animationUtil3 = animationUtil2;
                $this$getOrPut$iv.put(key$iv, animationUtil3);
                animationUtil = animationUtil3;
            } else {
                void var20_28;
                animationUtil = var20_28;
            }
            AnimationUtil animationUtil4 = animationUtil;
            boolean bl6 = bl3;
            String string7 = string3;
            String string8 = string2;
            String string9 = string;
            int n3 = n;
            collection.add(new EventsCategoryComponent.EventEntry(n3, string9, string8, string7, bl6, animationUtil4));
        }
        ((\u0637\u0643)object).items = (List)var11_13;
    }

    @Override
    public void onMouseClick(int mouseX, int mouseY, int button) {
        block5: {
            super.onMouseClick(mouseX, mouseY, button);
            if (button != 0) {
                return;
            }
            EventsCategoryComponent.PanelArea area = this.contentArea();
            if (!this.contains(area, mouseX, mouseY)) {
                return;
            }
            EventsCategoryComponent.PanelArea footer = this.footerArea(area);
            EventsCategoryComponent.PanelArea listArea = this.listArea(area, footer);
            if (this.contains(listArea, mouseX, mouseY)) {
                Iterator $this$filterTo$iv$iv;
                Iterable $this$filter$iv = CollectionsKt.asReversed(this.renderedItems);
                boolean $i$f$filter = false;
                Iterable iterable = $this$filter$iv;
                Collection destination$iv$iv = new ArrayList();
                boolean $i$f$filterTo = false;
                Iterator iterator2 = $this$filterTo$iv$iv.iterator();
                while (iterator2.hasNext()) {
                    Object element$iv$iv = iterator2.next();
                    AnimatedListTracker.Item it = (AnimatedListTracker.Item)element$iv$iv;
                    boolean bl = false;
                    if (!it.getPresent()) continue;
                    destination$iv$iv.add(element$iv$iv);
                }
                Iterable $this$forEach$iv = (List)destination$iv$iv;
                boolean $i$f$forEach = false;
                for (Object element$iv : $this$forEach$iv) {
                    AnimatedListTracker.Item animatedItem = (AnimatedListTracker.Item)element$iv;
                    boolean bl = false;
                    EventsCategoryComponent.PanelArea bounds = this.eventCardBounds(listArea, animatedItem.getPosition(), this.scroll.value());
                    float cardY = bounds.getTop() + (1.0f - animatedItem.getPresence()) * 4.0f;
                    if (!this.contains(this.eventActionButtonBounds(bounds.getLeft(), cardY, bounds.getWidth()), mouseX, mouseY)) continue;
                    this.onJoinAnarchy.invoke(((EventsCategoryComponent.EventEntry)animatedItem.getValue()).getAnarchy());
                    return;
                }
                return;
            }
            Integer n = this.buttonIndex(footer, mouseX, mouseY);
            if (n == null) break block5;
            int n2 = ((Number)n).intValue();
            boolean bl = false;
            this.selectFilter(n2);
        }
    }

    public final void setSearchQuery(@NotNull String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        String string = ((Object)StringsKt.trim((CharSequence)query)).toString().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(string, "toLowerCase(...)");
        String normalized = string;
        if (Intrinsics.areEqual(normalized, this.normalizedSearch)) {
            return;
        }
        this.normalizedSearch = normalized;
        this.resetScroll();
    }

    private final void selectFilter(int selectedIndex) {
        Iterable $this$forEachIndexed$iv = this.filters;
        boolean $i$f$forEachIndexed = false;
        int index$iv = 0;
        for (Object item$iv : $this$forEachIndexed$iv) {
            int n;
            if ((n = index$iv++) < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            EventsCategoryComponent.EventFilter filter = (EventsCategoryComponent.EventFilter)item$iv;
            int index = n;
            boolean bl = false;
            filter.setActive(index == selectedIndex);
        }
        this.resetScroll();
    }

    /*
     * WARNING - void declaration
     */
    private final String trimToWidth(String text, float maxWidth, float size) {
        void var4_4;
        if (maxWidth <= 0.0f) {
            return "";
        }
        if (Font.getWidth$default(this.getDefaultFont(), text, size, 0.0f, 4, null) <= maxWidth) {
            return text;
        }
        String suffix = "...";
        if (Font.getWidth$default(this.getDefaultFont(), suffix, size, 0.0f, 4, null) > maxWidth) {
            return "";
        }
        int end = text.length();
        while (end > 0) {
            void var5_5;
            String string = text.substring(0, end);
            Intrinsics.checkNotNullExpressionValue(string, "substring(...)");
            String candidate = ((Object)StringsKt.trimEnd((CharSequence)string)).toString() + suffix;
            if (Font.getWidth$default(this.getDefaultFont(), candidate, size, 0.0f, 4, null) <= maxWidth) {
                void var6_6;
                return var6_6;
            }
            --var5_5;
        }
        return var4_4;
    }

    private final EventsCategoryComponent.ButtonLayout buttonLayout(EventsCategoryComponent.PanelArea area) {
        int count = RangesKt.coerceAtLeast(this.filters.size(), 1);
        float width = RangesKt.coerceAtLeast((area.getWidth() - this.buttonGap * (float)(count + -1)) / (float)count, 20.0f);
        float rowWidth = (float)count * width + this.buttonGap * (float)(count + -1);
        return new EventsCategoryComponent.ButtonLayout(width, area.getLeft() + RangesKt.coerceAtLeast(area.getWidth() - rowWidth, 0.0f) * 0.5f, area.getTop() + (area.getHeight() - this.buttonHeight) * 0.5f);
    }

    /*
     * WARNING - void declaration
     */
    public final void setScrollProgress(float progress, boolean instant) {
        block3: {
            void var3_3;
            block2: {
                float target = -this.scroll.max() * RangesKt.coerceIn(progress, 0.0f, 1.0f);
                this.scroll.setTargetValue(target);
                if (instant) break block2;
                if (!(this.scroll.max() <= 0.0f)) break block3;
            }
            this.scroll.setValue((float)var3_3);
        }
    }

    @Override
    @NotNull
    public ClientRenderPipeline iconsPipeline() {
        return ClientRenderPipeline.GUI_SPECIAL;
    }

    /*
     * WARNING - void declaration
     */
    private final void renderEmptyState(EventsCategoryComponent.PanelArea area, String targetText) {
        void var3_4;
        block8: {
            block7: {
                if (area.getWidth() <= 0.0f) break block7;
                if (!(area.getHeight() <= 0.0f)) break block8;
            }
            return;
        }
        if (!Intrinsics.areEqual(targetText, this.emptyText)) {
            this.previousEmptyText = this.emptyText;
            this.emptyText = targetText;
            AnimationUtil.animate$default(this.emptyTextAnimation, 0.0f, 0.0f, null, 4, null);
        }
        \u0628\u0641 \u0628\u06412 = \u0628\u0641.INSTANCE;
        float progress = RangesKt.coerceIn(this.emptyTextAnimation.animate(1.0f, 190.0f, new \u062e\u0622(\u0628\u06412)), 0.0f, 1.0f);
        boolean bl = ((CharSequence)this.previousEmptyText).length() > 0;
        if (bl && progress < 0.999f) {
            this.renderEmptyLabel(area, this.previousEmptyText, 1.0f - progress, -2.0f * progress);
        }
        boolean bl2 = ((CharSequence)this.emptyText).length() > 0;
        if (bl2 && progress > 0.001f) {
            this.renderEmptyLabel(area, this.emptyText, progress, 2.0f * (1.0f - progress));
        }
        if (var3_4 >= 0.999f) {
            this.previousEmptyText = "";
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private final List<EventsCategoryComponent.EventEntry> filteredItems() {
        block11: {
            $this$firstOrNull$iv = this.filters;
            $i$f$firstOrNull = false;
            for (T element$iv : $this$firstOrNull$iv) {
                p0 = (EventsCategoryComponent.EventFilter)element$iv;
                $i$a$-firstOrNull-EventsCategoryComponent$filteredItems$ranges$1 = false;
                if (!p0.getActive()) continue;
                v0 = element$iv;
                break block11;
            }
            v0 = null;
        }
        v1 = v0;
        v2 = v1 != null ? v1.getAnarchyRanges() : null;
        v3 /* !! */  = v2;
        if (v2 == null) {
            v3 /* !! */  = CollectionsKt.emptyList();
        }
        ranges = v3 /* !! */ ;
        $this$filter$iv = this.items;
        $i$f$filter = false;
        var5_4 = $this$filter$iv;
        destination$iv$iv = new ArrayList<E>();
        $i$f$filterTo = false;
        for (T element$iv$iv : $this$filterTo$iv$iv) {
            block12: {
                item = (EventsCategoryComponent.EventEntry)element$iv$iv;
                $i$a$-filter-EventsCategoryComponent$filteredItems$matching$1 = false;
                if (ranges.isEmpty()) ** GOTO lbl-1000
                $this$any$iv = ranges;
                $i$f$any = false;
                if ($this$any$iv instanceof Collection && ((Collection)$this$any$iv).isEmpty()) {
                    v4 = false;
                } else {
                    for (T element$iv : $this$any$iv) {
                        it = (IntRange)element$iv;
                        $i$a$-any-EventsCategoryComponent$filteredItems$matching$1$matchesFilter$1 = false;
                        var18_24 = it.getFirst();
                        var19_25 = it.getLast();
                        var20_26 = item.getAnarchy();
                        v5 = var18_24 <= var20_26 ? var20_26 <= var19_25 : false;
                        if (!v5) continue;
                        v4 = true;
                        break block12;
                    }
                    v4 = false;
                }
            }
            if (v4) lbl-1000:
            // 2 sources

            {
                v6 = true;
            } else {
                v6 = false;
            }
            matchesFilter = v6;
            if (StringsKt.isBlank(this.normalizedSearch)) ** GOTO lbl-1000
            if (StringsKt.contains((CharSequence)item.getTitle(), this.normalizedSearch, true)) ** GOTO lbl-1000
            if (StringsKt.contains((CharSequence)item.getName(), this.normalizedSearch, true)) ** GOTO lbl-1000
            if (StringsKt.contains((CharSequence)item.getStatus(), this.normalizedSearch, true)) lbl-1000:
            // 4 sources

            {
                v7 = true;
            } else {
                v7 = false;
            }
            var12_17 = v7;
            v8 = var21_27 != false && var12_17;
            if (!v8) continue;
            destination$iv$iv.add(element$iv$iv);
        }
        matching = first$iv;
        $this$partition$iv = matching;
        $i$f$partition = false;
        first$iv = new ArrayList<void>();
        second$iv = new ArrayList<E>();
        for (T element$iv : $this$partition$iv) {
            var10_15 = (EventsCategoryComponent.EventEntry)element$iv;
            var11_16 = false;
            v9 = var10_15.getHighlighted() != false ? first$iv.add(var9_14) : var7_10.add(var9_14);
        }
        var3_1 = new Pair<void, void>(var6_7, var7_10);
        var4_3 = (List)var3_1.component1();
        var5_6 = (List)var3_1.component2();
        return CollectionsKt.plus((Collection)var4_3, (Iterable)var5_6);
    }

    private static final int render$lambda$0(EventsCategoryComponent.EventEntry it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getAnarchy();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    private final void renderButton(float x, float y, float width, EventsCategoryComponent.EventFilter filter, int mouseX, int mouseY) {
        boolean hovered = this.inside(x, y, width, this.buttonHeight, mouseX, mouseY);
        \u0628\u0641 \u0628\u06412 = \u0628\u0641.INSTANCE;
        float activeProgress = filter.getSelectionAnimation().animate(filter.getActive() ? 1.0f : 0.0f, 220.0f, new \u0636\u0641(\u0628\u06412));
        \u0628\u0641 \u0628\u06413 = \u0628\u0641.INSTANCE;
        float hoverProgress = RangesKt.coerceIn(filter.getHoverAnimation().animate(hovered ? 1.0f : 0.0f, 170.0f, new \u0635\u0645(\u0628\u06413)), 0.0f, 1.0f);
        Color backgroundColor = \u0628\u062d.INSTANCE.interpolateColor(\u062b\u0652.INSTANCE.surface((0.01f + 0.02f * hoverProgress) * this.getAlpha()), \u062b\u0652.INSTANCE.surface(0.05f * this.getAlpha()), activeProgress);
        Color borderColor = \u0628\u062d.INSTANCE.interpolateColor(\u062b\u0652.INSTANCE.surface((0.07f + 0.02f * hoverProgress) * this.getAlpha()), \u062b\u0652.INSTANCE.title(0.08f * this.getAlpha()), activeProgress);
        Color textColor = \u0628\u062d.INSTANCE.interpolateColor(\u062b\u0652.INSTANCE.value((0.48f + 0.14f * hoverProgress) * this.getAlpha()), \u062b\u0652.INSTANCE.title(this.getAlpha()), activeProgress);
        float textSize = Math.min(this.buttonHeight * 0.31f, width * 0.16f);
        float textPadding = 3.0f;
        Font font = \u0631\u064e.INSTANCE.getGS_MEDIUM().priority(this.textPipeline());
        float textWidth = Font.getWidth$default(font, filter.getLabel(), textSize, 0.0f, 4, null);
        float availableTextWidth = RangesKt.coerceAtLeast(width - textPadding * 2.0f, 0.0f);
        boolean overflowing = textWidth > availableTextWidth;
        float maxScrollOffset = RangesKt.coerceAtLeast(textWidth - availableTextWidth, 0.0f);
        float scrollOffset = this.updateScrollOffset(filter, hovered, maxScrollOffset);
        float textX = overflowing ? x + textPadding - scrollOffset : x + (width - textWidth) * 0.5f;
        float textY = y + (this.buttonHeight - textSize) * 0.46f;
        \u0630\u0631.INSTANCE.getBLURRED_RECT().priority(this.rectPipeline()).color(backgroundColor).round(4.0f).mix(0.95f).border(1.0f, borderColor).draw(x, y, width, this.buttonHeight);
        float fadeMin = this.toTransformedX(x + textPadding);
        float fadeMax = this.toTransformedX(x + width - textPadding);
        float left = Math.min(fadeMin, fadeMax);
        float right = Math.max(fadeMin, fadeMax);
        float fadeWidth = RangesKt.coerceIn((right - left) * 0.18f, 2.0f, 6.0f);
        try {
            Font font2 = overflowing ? font.setFade(left, right, 0.0f, fadeWidth) : font.resetFade();
            Font.drawText$default(font, filter.getLabel(), textX, textY, textSize, textColor, 0.0f, 0.0f, 0.0f, 0, 0.0f, 992, null);
        }
        finally {
            void var15_16;
            var15_16.resetFade();
        }
    }
}

