/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.math.BlockPos
 *  org.lwjgl.glfw.GLFW
 */
package oxxxde;

import java.awt.Color;
import java.lang.invoke.LambdaMetafactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import kotakbaz.rain.client.util.animations.AnimationUtil;
import kotakbaz.rain.client.util.other.ScrollUtil;
import kotakbaz.rain.client.util.render.engine.controls.ClientRenderPipeline;
import kotakbaz.rain.client.util.render.font.Font;
import kotakbaz.rain.client.waypoint.WayPointManager;
import kotakbaz.rain.module.modules.render.WayPointModule;
import kotakbaz.rain.module.setting.Setting;
import kotakbaz.rain.ui.api.PipelinedRender;
import kotakbaz.rain.ui.menu.PointsCategoryComponent;
import kotakbaz.rain.ui.menu.misc.AnimatedListTracker;
import kotakbaz.rain.ui.menu.settings.ModuleSettingComponent;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.lwjgl.glfw.GLFW;
import oxxxde.\u0627\u0638;
import oxxxde.\u0627\u064d;
import oxxxde.\u0628\u062d;
import oxxxde.\u0628\u0636;
import oxxxde.\u0628\u0641;
import oxxxde.\u062a\u0651;
import oxxxde.\u062b\u0633;
import oxxxde.\u062b\u0651;
import oxxxde.\u062b\u0652;
import oxxxde.\u062c\u0650;
import oxxxde.\u062c\u0652;
import oxxxde.\u062e\u0634;
import oxxxde.\u0630\u0631;
import oxxxde.\u0631\u064e;
import oxxxde.\u0632\u0637;
import oxxxde.\u0635\u0641;
import oxxxde.\u0636\u0633;
import oxxxde.\u0636\u0643;
import oxxxde.\u0637\u062a;
import oxxxde.\u0637\u062d;
import oxxxde.\u0637\u0645;
import oxxxde.\u0637\u0651;
import oxxxde.\u0638\u0641;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\bI\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002:\u0006\u00d3\u0001\u00d4\u0001\u00d5\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016\u00a2\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016\u00a2\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0016\u00a2\u0006\u0004\b\f\u0010\nJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u000f\u00a2\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000f\u00a2\u0006\u0004\b\u0014\u0010\u0013J\r\u0010\u0016\u001a\u00020\u0015\u00a2\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\b\u001c\u0010\u001dJ'\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u0018H\u0016\u00a2\u0006\u0004\b\u001f\u0010 J'\u0010\"\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010!\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\b\"\u0010\u001dJ'\u0010#\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u0018H\u0016\u00a2\u0006\u0004\b#\u0010 J'\u0010$\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u0018H\u0016\u00a2\u0006\u0004\b$\u0010 J\u0015\u0010%\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\u0003\u00a2\u0006\u0004\b%\u0010&J\u001f\u0010)\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020\u00032\b\b\u0002\u0010(\u001a\u00020\u0015\u00a2\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020\u0003\u00a2\u0006\u0004\b+\u0010,J\r\u0010-\u001a\u00020\u0003\u00a2\u0006\u0004\b-\u0010,J\r\u0010.\u001a\u00020\u0003\u00a2\u0006\u0004\b.\u0010,JK\u00107\u001a\u00020\u000f2\u0006\u00100\u001a\u00020/2\u0012\u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020302012\u0006\u00105\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u00106\u001a\u00020\u0003H\u0002\u00a2\u0006\u0004\b7\u00108JG\u0010>\u001a\u00020\u000f2\u0006\u00109\u001a\u0002032\u0006\u0010:\u001a\u00020\u00032\u0006\u0010;\u001a\u00020\u00032\u0006\u0010<\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010=\u001a\u00020\u0003H\u0002\u00a2\u0006\u0004\b>\u0010?J7\u0010@\u001a\u00020\u000f2\u0006\u00100\u001a\u00020/2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u00032\u0006\u00106\u001a\u00020\u0003H\u0002\u00a2\u0006\u0004\b@\u0010AJ'\u0010B\u001a\u00020\u000f2\u0006\u00100\u001a\u00020/2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018H\u0002\u00a2\u0006\u0004\bB\u0010CJ/\u0010I\u001a\u00020\u000f2\u0006\u0010E\u001a\u00020D2\u0006\u0010F\u001a\u00020\r2\u0006\u0010G\u001a\u00020\r2\u0006\u0010H\u001a\u00020\u0015H\u0002\u00a2\u0006\u0004\bI\u0010JJ\u001f\u0010L\u001a\u00020\u000f2\u0006\u0010E\u001a\u00020/2\u0006\u0010K\u001a\u00020\u0003H\u0002\u00a2\u0006\u0004\bL\u0010MJ'\u0010N\u001a\u00020\u000f2\u0006\u0010E\u001a\u00020/2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018H\u0002\u00a2\u0006\u0004\bN\u0010CJ'\u0010O\u001a\u00020\u000f2\u0006\u0010E\u001a\u00020/2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018H\u0002\u00a2\u0006\u0004\bO\u0010CJ\u001f\u0010P\u001a\u00020\u000f2\u0006\u00100\u001a\u00020/2\u0006\u0010'\u001a\u00020\u0003H\u0002\u00a2\u0006\u0004\bP\u0010MJ\u000f\u0010Q\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\bQ\u0010\u0013J\u000f\u0010R\u001a\u00020\u0015H\u0002\u00a2\u0006\u0004\bR\u0010\u0017J\u0017\u0010S\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u0018H\u0002\u00a2\u0006\u0004\bS\u0010TJ\u000f\u0010U\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\bU\u0010\u0013J\u0017\u0010V\u001a\u00020\u000f2\u0006\u00109\u001a\u000203H\u0002\u00a2\u0006\u0004\bV\u0010WJ\u000f\u0010X\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\bX\u0010\u0013J\u0017\u0010Y\u001a\u00020\u00152\u0006\u00109\u001a\u000203H\u0002\u00a2\u0006\u0004\bY\u0010ZJ\u001f\u0010]\u001a\u00020\u00152\u0006\u0010[\u001a\u00020\r2\u0006\u0010\\\u001a\u00020\rH\u0002\u00a2\u0006\u0004\b]\u0010^J\u001f\u0010b\u001a\u00020\u000f2\u0006\u0010`\u001a\u00020_2\u0006\u0010a\u001a\u00020\rH\u0002\u00a2\u0006\u0004\bb\u0010cJ\u001f\u0010d\u001a\u00020\u000f2\u0006\u0010`\u001a\u00020_2\u0006\u0010F\u001a\u00020\rH\u0002\u00a2\u0006\u0004\bd\u0010cJ\u0017\u0010e\u001a\u00020\u000f2\u0006\u0010F\u001a\u00020\rH\u0002\u00a2\u0006\u0004\be\u0010\u0011J\u0019\u0010f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u001e\u001a\u00020\u0018H\u0002\u00a2\u0006\u0004\bf\u0010gJ\u000f\u0010h\u001a\u00020\u0015H\u0002\u00a2\u0006\u0004\bh\u0010\u0017J'\u0010l\u001a\u00020\r2\u0006\u0010i\u001a\u00020\r2\u0006\u0010j\u001a\u00020\u00032\u0006\u0010k\u001a\u00020\u0003H\u0002\u00a2\u0006\u0004\bl\u0010mJ\u0017\u0010n\u001a\u00020\u00152\u0006\u0010a\u001a\u00020\rH\u0002\u00a2\u0006\u0004\bn\u0010oJ\u001f\u0010r\u001a\u00020\u00152\u0006\u0010p\u001a\u00020\r2\u0006\u0010q\u001a\u00020\rH\u0002\u00a2\u0006\u0004\br\u0010^J\u0017\u0010s\u001a\u00020\r2\u0006\u0010`\u001a\u00020_H\u0002\u00a2\u0006\u0004\bs\u0010tJ\u001f\u0010u\u001a\u00020\u000f2\u0006\u0010`\u001a\u00020_2\u0006\u0010F\u001a\u00020\rH\u0002\u00a2\u0006\u0004\bu\u0010cJ\u0015\u0010v\u001a\b\u0012\u0004\u0012\u00020301H\u0002\u00a2\u0006\u0004\bv\u0010wJ\u0017\u0010x\u001a\u00020\u00032\u0006\u0010k\u001a\u00020\u0018H\u0002\u00a2\u0006\u0004\bx\u0010yJ7\u0010}\u001a\u00020\u00152\u0006\u0010z\u001a\u00020\u00032\u0006\u0010{\u001a\u00020\u00032\u0006\u0010|\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0003H\u0002\u00a2\u0006\u0004\b}\u0010~J7\u0010\u007f\u001a\u00020\u00152\u0006\u0010z\u001a\u00020\u00032\u0006\u0010{\u001a\u00020\u00032\u0006\u0010|\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0003H\u0002\u00a2\u0006\u0004\b\u007f\u0010~J*\u0010\u0080\u0001\u001a\u00020/2\u0006\u0010z\u001a\u00020\u00032\u0006\u0010{\u001a\u00020\u00032\u0006\u0010|\u001a\u00020\u0003H\u0002\u00a2\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J*\u0010\u0082\u0001\u001a\u00020/2\u0006\u0010z\u001a\u00020\u00032\u0006\u0010{\u001a\u00020\u00032\u0006\u0010|\u001a\u00020\u0003H\u0002\u00a2\u0006\u0006\b\u0082\u0001\u0010\u0081\u0001J*\u0010\u0083\u0001\u001a\u00020/2\u0006\u0010z\u001a\u00020\u00032\u0006\u0010{\u001a\u00020\u00032\u0006\u0010|\u001a\u00020\u0003H\u0002\u00a2\u0006\u0006\b\u0083\u0001\u0010\u0081\u0001J*\u0010\u0084\u0001\u001a\u00020\u00152\u0006\u00100\u001a\u00020/2\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0003H\u0002\u00a2\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J*\u0010\u0086\u0001\u001a\u00020\u00152\u0006\u00100\u001a\u00020/2\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0003H\u0002\u00a2\u0006\u0006\b\u0086\u0001\u0010\u0085\u0001J\u001a\u0010\u0087\u0001\u001a\u00020/2\u0006\u00100\u001a\u00020/H\u0002\u00a2\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J \u0010\u0089\u0001\u001a\b\u0012\u0004\u0012\u00020D012\u0006\u00100\u001a\u00020/H\u0002\u00a2\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J\u001a\u0010\u008b\u0001\u001a\u00020/2\u0006\u00100\u001a\u00020/H\u0002\u00a2\u0006\u0006\b\u008b\u0001\u0010\u0088\u0001J\u001a\u0010\u008c\u0001\u001a\u00020/2\u0006\u00100\u001a\u00020/H\u0002\u00a2\u0006\u0006\b\u008c\u0001\u0010\u0088\u0001J\u001a\u0010\u008d\u0001\u001a\u00020\u00032\u0006\u00100\u001a\u00020/H\u0002\u00a2\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001J\u0012\u0010\u008f\u0001\u001a\u00020/H\u0002\u00a2\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J\u001a\u0010\u0091\u0001\u001a\u00020/2\u0006\u00100\u001a\u00020/H\u0002\u00a2\u0006\u0006\b\u0091\u0001\u0010\u0088\u0001J#\u0010\u0093\u0001\u001a\u00020/2\u0006\u00100\u001a\u00020/2\u0007\u0010\u0092\u0001\u001a\u00020/H\u0002\u00a2\u0006\u0006\b\u0093\u0001\u0010\u0094\u0001J*\u0010\u0095\u0001\u001a\u00020\u00152\u0006\u00100\u001a\u00020/2\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0003H\u0002\u00a2\u0006\u0006\b\u0095\u0001\u0010\u0085\u0001JC\u0010\u0095\u0001\u001a\u00020\u00152\u0006\u0010:\u001a\u00020\u00032\u0006\u0010;\u001a\u00020\u00032\u0006\u0010<\u001a\u00020\u00032\u0007\u0010\u0096\u0001\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0003H\u0002\u00a2\u0006\u0006\b\u0095\u0001\u0010\u0097\u0001R\u0015\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\b\u0004\u0010\u0098\u0001R\u0015\u0010\u0005\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\b\u0005\u0010\u0098\u0001R\u0017\u0010\u0099\u0001\u001a\u00020\u00038\u0002X\u0082D\u00a2\u0006\b\n\u0006\b\u0099\u0001\u0010\u0098\u0001R\u0017\u0010\u009a\u0001\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u009a\u0001\u0010\u0098\u0001R\u0017\u0010\u009b\u0001\u001a\u00020\u00038\u0002X\u0082D\u00a2\u0006\b\n\u0006\b\u009b\u0001\u0010\u0098\u0001R\u0017\u0010\u009c\u0001\u001a\u00020\u00038\u0002X\u0082D\u00a2\u0006\b\n\u0006\b\u009c\u0001\u0010\u0098\u0001R\u0017\u0010\u009d\u0001\u001a\u00020\u00038\u0002X\u0082D\u00a2\u0006\b\n\u0006\b\u009d\u0001\u0010\u0098\u0001R\u0017\u0010\u009e\u0001\u001a\u00020\u00038\u0002X\u0082D\u00a2\u0006\b\n\u0006\b\u009e\u0001\u0010\u0098\u0001R\u0017\u0010\u009f\u0001\u001a\u00020\u00038\u0002X\u0082D\u00a2\u0006\b\n\u0006\b\u009f\u0001\u0010\u0098\u0001R\u0017\u0010\u00a0\u0001\u001a\u00020\u00038\u0002X\u0082D\u00a2\u0006\b\n\u0006\b\u00a0\u0001\u0010\u0098\u0001R\u0017\u0010\u00a1\u0001\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u00a1\u0001\u0010\u0098\u0001R\u0017\u0010\u00a2\u0001\u001a\u00020\u00038\u0002X\u0082D\u00a2\u0006\b\n\u0006\b\u00a2\u0001\u0010\u0098\u0001R\u0017\u0010\u00a3\u0001\u001a\u00020\u00038\u0002X\u0082D\u00a2\u0006\b\n\u0006\b\u00a3\u0001\u0010\u0098\u0001R\u0017\u0010\u00a4\u0001\u001a\u00020\u00038\u0002X\u0082D\u00a2\u0006\b\n\u0006\b\u00a4\u0001\u0010\u0098\u0001R\u0017\u0010\u00a5\u0001\u001a\u00020\u00038\u0002X\u0082D\u00a2\u0006\b\n\u0006\b\u00a5\u0001\u0010\u0098\u0001R\u0017\u0010\u00a6\u0001\u001a\u00020\u00188\u0002X\u0082D\u00a2\u0006\b\n\u0006\b\u00a6\u0001\u0010\u00a7\u0001R\u0017\u0010\u00a8\u0001\u001a\u00020\u00188\u0002X\u0082D\u00a2\u0006\b\n\u0006\b\u00a8\u0001\u0010\u00a7\u0001R7\u0010\u00ac\u0001\u001a\"\u0012\u0004\u0012\u00020\r\u0012\u0005\u0012\u00030\u00aa\u00010\u00a9\u0001j\u0010\u0012\u0004\u0012\u00020\r\u0012\u0005\u0012\u00030\u00aa\u0001`\u00ab\u00018\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u00ac\u0001\u0010\u00ad\u0001R7\u0010\u00ae\u0001\u001a\"\u0012\u0004\u0012\u00020\r\u0012\u0005\u0012\u00030\u00aa\u00010\u00a9\u0001j\u0010\u0012\u0004\u0012\u00020\r\u0012\u0005\u0012\u00030\u00aa\u0001`\u00ab\u00018\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u00ae\u0001\u0010\u00ad\u0001R7\u0010\u00af\u0001\u001a\"\u0012\u0004\u0012\u00020\r\u0012\u0005\u0012\u00030\u00aa\u00010\u00a9\u0001j\u0010\u0012\u0004\u0012\u00020\r\u0012\u0005\u0012\u00030\u00aa\u0001`\u00ab\u00018\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u00af\u0001\u0010\u00ad\u0001R$\u0010\u00b1\u0001\u001a\u000f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u0002030\u00b0\u00018\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u00b1\u0001\u0010\u00b2\u0001R7\u0010\u00b3\u0001\u001a\"\u0012\u0004\u0012\u00020_\u0012\u0005\u0012\u00030\u00aa\u00010\u00a9\u0001j\u0010\u0012\u0004\u0012\u00020_\u0012\u0005\u0012\u00030\u00aa\u0001`\u00ab\u00018\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u00b3\u0001\u0010\u00ad\u0001R\u0018\u0010\u00b4\u0001\u001a\u00030\u00aa\u00018\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u00b4\u0001\u0010\u00b5\u0001R\u0018\u0010\u00b6\u0001\u001a\u00030\u00aa\u00018\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u00b6\u0001\u0010\u00b5\u0001R\u0018\u0010\u00b7\u0001\u001a\u00030\u00aa\u00018\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u00b7\u0001\u0010\u00b5\u0001R\u0018\u0010\u00b8\u0001\u001a\u00030\u00aa\u00018\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u00b8\u0001\u0010\u00b5\u0001R\u0018\u0010\u00b9\u0001\u001a\u00030\u00aa\u00018\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u00b9\u0001\u0010\u00b5\u0001R\u0018\u0010\u00ba\u0001\u001a\u00030\u00aa\u00018\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u00ba\u0001\u0010\u00b5\u0001R\u0018\u0010\u00bb\u0001\u001a\u00030\u00aa\u00018\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u00bb\u0001\u0010\u00b5\u0001R\"\u0010\u00bd\u0001\u001a\r\u0012\t\u0012\u0007\u0012\u0002\b\u00030\u00bc\u0001018\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u00bd\u0001\u0010\u00be\u0001R\u001a\u0010\u00c0\u0001\u001a\u00030\u00bf\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u00c0\u0001\u0010\u00c1\u0001R\u0019\u0010\u00c2\u0001\u001a\u00020\r8\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u00c2\u0001\u0010\u00c3\u0001R\u001b\u0010\u00c4\u0001\u001a\u0004\u0018\u00010_8\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u00c4\u0001\u0010\u00c5\u0001R\u0019\u0010\u00c6\u0001\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u00c6\u0001\u0010\u0098\u0001R\u0019\u0010\u00c7\u0001\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u00c7\u0001\u0010\u0098\u0001R\u0019\u0010\u00c8\u0001\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u00c8\u0001\u0010\u00c9\u0001R\u001b\u0010\u00ca\u0001\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u00ca\u0001\u0010\u00c3\u0001R\u0019\u0010\u00cb\u0001\u001a\u00020\r8\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u00cb\u0001\u0010\u00c3\u0001R\u0019\u0010\u00cc\u0001\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u00cc\u0001\u0010\u0098\u0001R\u0019\u0010\u00cd\u0001\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u00cd\u0001\u0010\u0098\u0001R%\u0010\u00ce\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020302018\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u00ce\u0001\u0010\u00be\u0001R\u0019\u0010\u00cf\u0001\u001a\u00020\r8\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u00cf\u0001\u0010\u00c3\u0001R\u0019\u0010\u00d0\u0001\u001a\u00020\r8\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u00d0\u0001\u0010\u00c3\u0001R\u0019\u0010\u00d1\u0001\u001a\u00020\r8\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u00d1\u0001\u0010\u00c3\u0001R\u0019\u0010\u00d2\u0001\u001a\u00020\r8\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u00d2\u0001\u0010\u00c3\u0001\u00a8\u0006\u00d6\u0001"}, d2={"Loxxxde/\u0631\u0650;", "Loxxxde/\u0627\u0638;", "Loxxxde/\u0627\u0633;", "", "panelWidth", "contentTopOffset", "<init>", "(FF)V", "Loxxxde/\u0635\u0624;", "rectPipeline", "()Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;", "textPipeline", "iconsPipeline", "", "query", "", "setSearchQuery", "(Ljava/lang/String;)V", "resetScroll", "()V", "clearInputFocus", "", "isSettingsPageOpen", "()Z", "", "mouseX", "mouseY", "partialTicks", "render", "(IIF)V", "button", "onMouseClick", "(III)V", "vertical", "onMouseScroll", "onMouseRelease", "onKeyPress", "scrollWheel", "(F)V", "progress", "instant", "setScrollProgress", "(FZ)V", "scrollOffsetValue", "()F", "scrollContentHeight", "scrollViewHeight", "Loxxxde/\u0634\u0630;", "area", "", "Loxxxde/\u062c\u0629;", "Loxxxde/\u062a\u0641;", "visibleWayPoints", "scrollOffset", "pageProgress", "renderList", "(Lkotakbaz/rain/ui/menu/PointsCategoryComponent$PanelArea;Ljava/util/List;FIIF)V", "wayPoint", "x", "y", "width", "presence", "renderRow", "(Lkotakbaz/rain/client/waypoint/WayPointManager$WayPoint;FFFIIF)V", "renderSettingsPage", "(Lkotakbaz/rain/ui/menu/PointsCategoryComponent$PanelArea;IIFF)V", "renderFooter", "(Lkotakbaz/rain/ui/menu/PointsCategoryComponent$PanelArea;II)V", "Loxxxde/\u062a\u0643;", "bounds", "value", "placeholder", "focused", "renderInputBox", "(Lkotakbaz/rain/ui/menu/PointsCategoryComponent$FieldBounds;Ljava/lang/String;Ljava/lang/String;Z)V", "editorAlpha", "renderRowNameEditor", "(Lkotakbaz/rain/ui/menu/PointsCategoryComponent$PanelArea;F)V", "renderCreateButton", "renderActionButton", "renderEmptyState", "createWaypoint", "canCreateWaypoint", "handleWaypointRenameKey", "(I)V", "saveWaypointRename", "startWaypointRename", "(Lkotakbaz/rain/client/waypoint/WayPointManager$WayPoint;)V", "cancelWaypointRename", "isRenamingWaypoint", "(Lkotakbaz/rain/client/waypoint/WayPointManager$WayPoint;)Z", "originalName", "candidateName", "canRenameWaypoint", "(Ljava/lang/String;Ljava/lang/String;)Z", "Loxxxde/\u0632\u064b;", "field", "keyName", "appendKeyName", "(Lkotakbaz/rain/ui/menu/PointsCategoryComponent$InputField;Ljava/lang/String;)V", "appendToField", "appendToWaypointRename", "resolveTypedKey", "(I)Ljava/lang/String;", "isShiftDown", "text", "maxWidth", "size", "trimTextToFit", "(Ljava/lang/String;FF)Ljava/lang/String;", "isAllowedWaypointNameKey", "(Ljava/lang/String;)Z", "first", "second", "sameWaypointName", "fieldValue", "(Lkotakbaz/rain/ui/menu/PointsCategoryComponent$InputField;)Ljava/lang/String;", "updateField", "filteredWayPoints", "()Ljava/util/List;", "contentHeight", "(I)F", "rowX", "rowY", "rowWidth", "insideDelete", "(FFFFF)Z", "insideRename", "deleteButtonBounds", "(FFF)Lkotakbaz/rain/ui/menu/PointsCategoryComponent$PanelArea;", "renameButtonBounds", "rowNameEditorBounds", "insideCreateButton", "(Lkotakbaz/rain/ui/menu/PointsCategoryComponent$PanelArea;FF)Z", "insideActionButton", "settingsPageBounds", "(Lkotakbaz/rain/ui/menu/PointsCategoryComponent$PanelArea;)Lkotakbaz/rain/ui/menu/PointsCategoryComponent$PanelArea;", "inputBounds", "(Lkotakbaz/rain/ui/menu/PointsCategoryComponent$PanelArea;)Ljava/util/List;", "actionButtonBounds", "createButtonBounds", "inputRowTop", "(Lkotakbaz/rain/ui/menu/PointsCategoryComponent$PanelArea;)F", "contentArea", "()Lkotakbaz/rain/ui/menu/PointsCategoryComponent$PanelArea;", "footerArea", "footer", "listArea", "(Lkotakbaz/rain/ui/menu/PointsCategoryComponent$PanelArea;Lkotakbaz/rain/ui/menu/PointsCategoryComponent$PanelArea;)Lkotakbaz/rain/ui/menu/PointsCategoryComponent$PanelArea;", "inside", "height", "(FFFFFF)Z", "F", "rowHeight", "rowNameEditorHeight", "rowNameEditorTextSize", "rowNameEditorBoxTextPadding", "rowNameEditorSelectedExpand", "rowNameEditorMinWidth", "inputHeight", "footerReservedHeight", "actionButtonSize", "createButtonWidth", "rowActionAreaSize", "rowActionButtonGap", "rowActionIconSize", "nameFieldMaxLength", "I", "coordinateFieldMaxLength", "Ljava/util/HashMap;", "Loxxxde/\u0631\u064a;", "Lkotlin/collections/HashMap;", "deleteHoverAnimation", "Ljava/util/HashMap;", "renameHoverAnimation", "rowHoverAnimation", "Loxxxde/\u062b\u0651;", "listAnimations", "Loxxxde/\u062b\u0651;", "inputFocusAnimations", "createButtonAnimation", "Loxxxde/\u0631\u064a;", "createButtonHoverAnimation", "settingsPageAnimation", "actionButtonHoverAnimation", "emptyStateAnimation", "renameWidthAnim", "renameFocusAnim", "Loxxxde/\u0622;", "settingComponents", "Ljava/util/List;", "Loxxxde/\u0632\u0639;", "scroll", "Loxxxde/\u0632\u0639;", "normalizedSearch", "Ljava/lang/String;", "focusedField", "Loxxxde/\u0632\u064b;", "cachedTotalHeight", "cachedViewHeight", "settingsPageOpen", "Z", "renamingWaypointName", "renamingWaypointText", "lastRenameInputWidth", "lastRenameMaxInputWidth", "renderedWayPoints", "nameText", "xText", "yText", "zText", "InputField", "FieldBounds", "PanelArea", "rain-visuals"})
public final class \u0631\u0650
extends \u0627\u0638
implements PipelinedRender {
    @NotNull
    private final HashMap<PointsCategoryComponent.InputField, AnimationUtil> inputFocusAnimations;
    private final float rowNameEditorMinWidth;
    @NotNull
    private String yText;
    @NotNull
    private String zText;
    @Nullable
    private String renamingWaypointName;
    private final int coordinateFieldMaxLength;
    @NotNull
    private String nameText;
    private final float rowNameEditorSelectedExpand;
    @NotNull
    private List<AnimatedListTracker.Item<WayPointManager.WayPoint>> renderedWayPoints;
    private final float rowNameEditorHeight;
    private float cachedViewHeight;
    private final int nameFieldMaxLength;
    private final float createButtonWidth;
    @NotNull
    private ScrollUtil scroll;
    @NotNull
    private String xText;
    private final float rowNameEditorTextSize;
    @NotNull
    private String renamingWaypointText;
    private final float rowNameEditorBoxTextPadding;
    @NotNull
    private final AnimationUtil actionButtonHoverAnimation;
    @NotNull
    private final HashMap<String, AnimationUtil> deleteHoverAnimation;
    private final float inputHeight;
    @NotNull
    private final HashMap<String, AnimationUtil> rowHoverAnimation;
    private final float rowActionButtonGap;
    @Nullable
    private PointsCategoryComponent.InputField focusedField;
    private final float rowActionIconSize;
    private float lastRenameMaxInputWidth;
    @NotNull
    private final AnimationUtil createButtonHoverAnimation;
    @NotNull
    private String normalizedSearch;
    @NotNull
    private final AnimationUtil renameFocusAnim;
    @NotNull
    private final HashMap<String, AnimationUtil> renameHoverAnimation;
    private final float rowActionAreaSize;
    @NotNull
    private final AnimationUtil createButtonAnimation;
    @NotNull
    private final List<ModuleSettingComponent<?>> settingComponents;
    private final float panelWidth;
    @NotNull
    private final AnimationUtil emptyStateAnimation;
    @NotNull
    private final AnimationUtil settingsPageAnimation;
    @NotNull
    private final \u062b\u0651<String, WayPointManager.WayPoint> listAnimations;
    private final float actionButtonSize;
    private final float rowHeight;
    @NotNull
    private final AnimationUtil renameWidthAnim;
    private final float footerReservedHeight;
    private float lastRenameInputWidth;
    private boolean settingsPageOpen;
    private float cachedTotalHeight;
    private final float contentTopOffset;

    public final void resetScroll() {
        this.scroll = new ScrollUtil(0.0f, 1, null);
    }

    private final float contentHeight(int size) {
        if (size <= 0) {
            return 0.0f;
        }
        return (float)size * this.rowHeight + (float)(size + -1) * this.getPadding();
    }

    @Override
    public void onMouseRelease(int mouseX, int mouseY, int button) {
        super.onMouseRelease(mouseX, mouseY, button);
        if (!this.settingsPageOpen) {
            return;
        }
        Iterable $this$forEach$iv = this.settingComponents;
        boolean $i$f$forEach = false;
        for (Object element$iv : $this$forEach$iv) {
            ModuleSettingComponent it = (ModuleSettingComponent)element$iv;
            boolean bl = false;
            it.onMouseRelease(mouseX, mouseY, button);
        }
    }

    /*
     * Unable to fully structure code
     */
    private final List<WayPointManager.WayPoint> filteredWayPoints() {
        if (StringsKt.isBlank(this.normalizedSearch)) {
            return WayPointManager.INSTANCE.getWayPoints();
        }
        $this$filter$iv = WayPointManager.INSTANCE.getWayPoints();
        $i$f$filter = false;
        var3_3 = $this$filter$iv;
        destination$iv$iv = new ArrayList<E>();
        $i$f$filterTo = false;
        for (T element$iv$iv : $this$filterTo$iv$iv) {
            wayPoint = (WayPointManager.WayPoint)element$iv$iv;
            $i$a$-filter-PointsCategoryComponent$filteredWayPoints$1 = false;
            v0 = wayPoint.getName().toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(v0, "toLowerCase(...)");
            if (StringsKt.contains$default((CharSequence)v0, this.normalizedSearch, false, 2, null)) ** GOTO lbl-1000
            if (StringsKt.contains$default((CharSequence)(wayPoint.getX() + " " + wayPoint.getY() + " " + wayPoint.getZ()), this.normalizedSearch, false, 2, null)) ** GOTO lbl-1000
            if (StringsKt.contains$default((CharSequence)("x " + wayPoint.getX() + " y " + wayPoint.getY() + " z " + wayPoint.getZ()), this.normalizedSearch, false, 2, null)) lbl-1000:
            // 3 sources

            {
                v1 = true;
            } else {
                v1 = false;
            }
            if (!v1) continue;
            var4_4.add(var7_7);
        }
        return (List)var4_4;
    }

    /*
     * WARNING - void declaration
     */
    private final void renderRow(WayPointManager.WayPoint wayPoint, float x, float y, float width, int mouseX, int mouseY, float presence) {
        void var24_36;
        void var32_44;
        void var31_43;
        float metaY;
        void rowAlpha22;
        void editing22;
        Object object;
        Object answer$iv32;
        Object object2;
        Object object3;
        void $this$getOrPut$iv;
        boolean hovered = this.inside(x, y, width, this.rowHeight, mouseX, mouseY);
        boolean deleteHovered = hovered && this.insideDelete(x, y, width, mouseX, mouseY);
        boolean renameHovered = hovered && this.insideRename(x, y, width, mouseX, mouseY);
        Map map = this.deleteHoverAnimation;
        String key$iv = wayPoint.getName();
        boolean $i$f$getOrPut = false;
        Object value$iv = $this$getOrPut$iv.get(key$iv);
        if (value$iv == null) {
            boolean bl = false;
            AnimationUtil answer$iv = new AnimationUtil(0.0f, 1, null);
            $this$getOrPut$iv.put(key$iv, answer$iv);
            object3 = answer$iv;
        } else {
            object3 = value$iv;
        }
        AnimationUtil deleteAnimation = (AnimationUtil)object3;
        Map $this$getOrPut$iv2 = this.renameHoverAnimation;
        String key$iv2 = wayPoint.getName();
        boolean $i$f$getOrPut2 = false;
        Object value$iv2 = $this$getOrPut$iv2.get(key$iv2);
        if (value$iv2 == null) {
            boolean answer$iv22 = false;
            AnimationUtil answer$iv22 = new AnimationUtil(0.0f, 1, null);
            $this$getOrPut$iv2.put(key$iv2, answer$iv22);
            object2 = answer$iv22;
        } else {
            object2 = value$iv2;
        }
        AnimationUtil renameAnimation = (AnimationUtil)object2;
        Map $this$getOrPut$iv3 = this.rowHoverAnimation;
        Object key$iv3 = wayPoint.getName();
        boolean $i$f$getOrPut3 = false;
        Object value$iv3 = $this$getOrPut$iv3.get(key$iv3);
        if (value$iv3 == null) {
            boolean answer$iv32 = false;
            answer$iv32 = new AnimationUtil(0.0f, 1, null);
            $this$getOrPut$iv3.put(key$iv3, answer$iv32);
            object = answer$iv32;
        } else {
            object = value$iv3;
        }
        AnimationUtil hoverAnimation = (AnimationUtil)object;
        key$iv3 = \u0628\u0641.INSTANCE;
        float deleteProgress = deleteAnimation.animate(deleteHovered ? 1.0f : 0.0f, 180.0f, new \u0627\u064d((\u0628\u0641)editing22));
        boolean editing22 = this.isRenamingWaypoint(wayPoint);
        value$iv3 = \u0628\u0641.INSTANCE;
        float renameProgress = renameAnimation.animate(renameHovered || editing22 ? 1.0f : 0.0f, 180.0f, new \u0637\u0651((\u0628\u0641)value$iv3));
        answer$iv32 = \u0628\u0641.INSTANCE;
        float hoverProgress = RangesKt.coerceIn(hoverAnimation.animate(hovered ? 1.0f : 0.0f, 180.0f, new \u0637\u062d((\u0628\u0641)rowAlpha22)), 0.0f, 1.0f);
        float rowAlpha22 = this.getAlpha() * presence;
        Color backgroundColor = \u062b\u0652.INSTANCE.surface(rowAlpha22 * (0.03f + 0.02f * hoverProgress));
        Color borderColor = \u062b\u0652.INSTANCE.title(rowAlpha22 * (0.06f + 0.06f * hoverProgress));
        Color titleColor = \u062b\u0652.INSTANCE.title(rowAlpha22 * 0.78f);
        Color valueColor = \u062b\u0652.INSTANCE.value(rowAlpha22 * 0.48f);
        Color renameColor = \u0628\u062d.INSTANCE.interpolateColor(\u062b\u0652.INSTANCE.icon(rowAlpha22 * 0.35f), \u062b\u0652.INSTANCE.title(rowAlpha22 * 0.72f), renameProgress);
        Color deleteColor = \u0628\u062d.INSTANCE.interpolateColor(\u062b\u0652.INSTANCE.icon(rowAlpha22 * 0.35f), \u062b\u0652.INSTANCE.title(rowAlpha22 * 0.72f), deleteProgress);
        \u0630\u0631.INSTANCE.getBLURRED_RECT().priority(this.rectPipeline()).color(backgroundColor).round(4.0f).mix(0.95f).border(1.0f, borderColor).draw(x, y, width, this.rowHeight);
        \u0630\u0631.INSTANCE.getBASIC_RECT().priority(this.rectPipeline()).color(\u062b\u0652.INSTANCE.title(rowAlpha22 * 0.72f)).round(0.3f).draw(x + width - this.getPadding() * 1.5f, y + this.getPadding(), 2.5f, 2.5f);
        float nameSize = 8.0f;
        float metaSize = 5.6f;
        float textX = x + this.getPadding() * 1.5f;
        float nameY = y + this.getPadding() * 1.5f;
        float f = metaY = editing22 ? this.rowNameEditorBounds(x, y, width).getTop() + this.rowNameEditorHeight + 4.0f : nameY + this.getDefaultFont().getHeight(nameSize) + this.getPadding() / 1.5f;
        if (editing22) {
            this.renderRowNameEditor(this.rowNameEditorBounds(x, y, width), rowAlpha22);
        } else {
            Font.drawText$default(this.getDefaultFont().priority(this.textPipeline()), wayPoint.getName(), textX, nameY, nameSize, titleColor, 0.0f, 0.0f, 0.0f, 0, 0.0f, 992, null);
        }
        Font.drawText$default(this.getDefaultFont().priority(this.textPipeline()), "X " + wayPoint.getX() + "  Y " + wayPoint.getY() + "  Z " + wayPoint.getZ(), textX, metaY, metaSize, valueColor, 0.0f, 0.0f, 0.0f, 0, 0.0f, 992, null);
        PointsCategoryComponent.PanelArea renameBounds = this.renameButtonBounds(x, y, width);
        PointsCategoryComponent.PanelArea deleteBounds = this.deleteButtonBounds(x, y, width);
        float actionCenterY = y + this.rowHeight * 0.5f - this.rowActionIconSize * 0.5f;
        Font.drawCenteredText$default(this.getIconFont().priority(this.iconsPipeline()), "J", renameBounds.getLeft() + renameBounds.getWidth() * 0.5f, actionCenterY, this.rowActionIconSize, renameColor, 0.0f, 32, null);
        Font.drawCenteredText$default(this.getIconFont().priority(this.iconsPipeline()), "i", var31_43.getLeft() + var31_43.getWidth() * 0.5f, (float)var32_44, this.rowActionIconSize, (Color)var24_36, 0.0f, 32, null);
    }

    private final boolean insideCreateButton(PointsCategoryComponent.PanelArea area, float mouseX, float mouseY) {
        PointsCategoryComponent.PanelArea bounds = this.createButtonBounds(area);
        return this.inside(bounds.getLeft(), bounds.getTop(), bounds.getWidth(), bounds.getHeight(), mouseX, mouseY);
    }

    private final PointsCategoryComponent.PanelArea renameButtonBounds(float rowX, float rowY, float rowWidth) {
        PointsCategoryComponent.PanelArea deleteBounds = this.deleteButtonBounds(rowX, rowY, rowWidth);
        return new PointsCategoryComponent.PanelArea(deleteBounds.getLeft() - this.rowActionButtonGap - this.rowActionAreaSize, deleteBounds.getTop(), this.rowActionAreaSize, this.rowActionAreaSize);
    }

    /*
     * Unable to fully structure code
     */
    private final void appendKeyName(PointsCategoryComponent.InputField field, String keyName) {
        switch (\u062c\u0652.$EnumSwitchMapping$1[field.ordinal()]) {
            case 1: {
                if (!this.isAllowedWaypointNameKey(keyName)) {
                    return;
                }
                this.appendToField(field, keyName);
                break;
            }
            case 2: 
            case 3: 
            case 4: {
                $this$all$iv = keyName;
                $i$f$all = false;
                for (var5_5 = 0; var5_5 < $this$all$iv.length(); ++var5_5) {
                    p0 = element$iv = $this$all$iv.charAt(var5_5);
                    $i$a$-all-PointsCategoryComponent$appendKeyName$1 = false;
                    if (Character.isDigit(p0)) continue;
                    v0 = false;
                    ** GOTO lbl18
                }
                v0 = true;
lbl18:
                // 2 sources

                if (v0) {
                    this.appendToField(field, keyName);
                    return;
                }
                if (!Intrinsics.areEqual(keyName, "-") || !(((CharSequence)this.fieldValue(field)).length() == 0)) break;
                this.appendToField(field, keyName);
                break;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    private final void startWaypointRename(WayPointManager.WayPoint wayPoint) {
        this.focusedField = null;
        if (Intrinsics.areEqual(this.renamingWaypointName, wayPoint.getName())) {
            return;
        }
        this.renamingWaypointName = wayPoint.getName();
        this.renamingWaypointText = wayPoint.getName();
    }

    private final void renderList(PointsCategoryComponent.PanelArea area, List<AnimatedListTracker.Item<WayPointManager.WayPoint>> visibleWayPoints, float scrollOffset, int mouseX, int mouseY, float pageProgress) {
        block5: {
            block4: {
                if (area.getWidth() <= 0.0f) break block4;
                if (!(area.getHeight() <= 0.0f)) break block5;
            }
            return;
        }
        \u062c\u0650.INSTANCE.start(area.getLeft(), area.getTop(), area.getWidth(), area.getHeight());
        float clipBottom = area.getTop() + area.getHeight();
        Iterable $this$forEach$iv = visibleWayPoints;
        boolean $i$f$forEach = false;
        for (Object element$iv : $this$forEach$iv) {
            AnimatedListTracker.Item animatedWayPoint = (AnimatedListTracker.Item)element$iv;
            boolean bl = false;
            float rowY = area.getTop() - scrollOffset + animatedWayPoint.getPosition() * (this.rowHeight + this.getPadding()) + (1.0f - animatedWayPoint.getPresence()) * 4.0f;
            float rowBottom = rowY + this.rowHeight;
            boolean bl2 = rowBottom > area.getTop() && rowY < clipBottom;
            boolean visible = bl2;
            if (!visible) continue;
            this.renderRow((WayPointManager.WayPoint)animatedWayPoint.getValue(), area.getLeft(), rowY, area.getWidth(), mouseX, mouseY, animatedWayPoint.getPresence() * pageProgress);
        }
        \u062c\u0650.INSTANCE.end();
    }

    private final PointsCategoryComponent.PanelArea listArea(PointsCategoryComponent.PanelArea area, PointsCategoryComponent.PanelArea footer) {
        float height = RangesKt.coerceAtLeast(footer.getTop() - area.getTop() - this.getPadding(), 0.0f);
        return new PointsCategoryComponent.PanelArea(area.getLeft(), area.getTop(), area.getWidth(), height);
    }

    private final void renderEmptyState(PointsCategoryComponent.PanelArea area, float progress) {
        String text = "\u041d\u0438\u0447\u0435\u0433\u043e \u043d\u0435 \u043d\u0430\u0439\u0434\u0435\u043d\u043e :(";
        float textSize = 11.0f;
        Font.drawCenteredText$default(this.getDefaultFont().priority(this.textPipeline()), text, area.getLeft() + area.getWidth() * 0.5f, area.getTop() + (area.getHeight() - textSize) * 0.46f, textSize, \u062b\u0652.INSTANCE.value(this.getAlpha() * 0.5f * progress), 0.0f, 32, null);
    }

    /*
     * WARNING - void declaration
     */
    private final void renderFooter(PointsCategoryComponent.PanelArea area, int mouseX, int mouseY) {
        void var10_16;
        void var3_3;
        void var2_2;
        void var9_13;
        void var12_21;
        PointsCategoryComponent.FieldBounds yBounds;
        PointsCategoryComponent.FieldBounds xBounds;
        PointsCategoryComponent.FieldBounds nameBounds;
        block10: {
            Iterator iterator2;
            List<PointsCategoryComponent.FieldBounds> inputBounds;
            block9: {
                Object element$iv3;
                block8: {
                    Object element$iv22;
                    block7: {
                        block12: {
                            block11: {
                                if (area.getWidth() <= 0.0f) break block11;
                                if (!(area.getHeight() <= 0.0f)) break block12;
                            }
                            return;
                        }
                        inputBounds = this.inputBounds(area);
                        Iterable $this$first$iv = inputBounds;
                        boolean $i$f$first = false;
                        for (Object element$iv22 : $this$first$iv) {
                            PointsCategoryComponent.FieldBounds it = (PointsCategoryComponent.FieldBounds)element$iv22;
                            boolean bl = false;
                            boolean bl2 = it.getField() == PointsCategoryComponent.InputField.NAME;
                            if (!bl2) continue;
                            break block7;
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                    nameBounds = (PointsCategoryComponent.FieldBounds)element$iv22;
                    Iterable $this$first$iv = inputBounds;
                    boolean $i$f$first = false;
                    for (Object element$iv3 : $this$first$iv) {
                        PointsCategoryComponent.FieldBounds it = (PointsCategoryComponent.FieldBounds)element$iv3;
                        boolean bl = false;
                        boolean bl3 = it.getField() == PointsCategoryComponent.InputField.X;
                        if (!bl3) continue;
                        break block8;
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
                xBounds = (PointsCategoryComponent.FieldBounds)element$iv3;
                Iterable $this$first$iv = inputBounds;
                boolean $i$f$first = false;
                for (Object element$iv4 : $this$first$iv) {
                    PointsCategoryComponent.FieldBounds it = (PointsCategoryComponent.FieldBounds)element$iv4;
                    boolean bl = false;
                    boolean bl4 = it.getField() == PointsCategoryComponent.InputField.Y;
                    if (!bl4) continue;
                    break block9;
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            yBounds = (PointsCategoryComponent.FieldBounds)((Object)iterator2);
            Iterable $this$first$iv = inputBounds;
            boolean $i$f$first = false;
            for (Object element$iv : $this$first$iv) {
                void var13_23;
                PointsCategoryComponent.FieldBounds it = (PointsCategoryComponent.FieldBounds)element$iv;
                boolean bl = false;
                boolean bl5 = var13_23.getField() == PointsCategoryComponent.InputField.Z;
                if (!bl5) continue;
                break block10;
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        PointsCategoryComponent.FieldBounds zBounds = (PointsCategoryComponent.FieldBounds)var12_21;
        PointsCategoryComponent.PanelArea actionBounds = this.actionButtonBounds(area);
        PointsCategoryComponent.PanelArea createBounds = this.createButtonBounds(area);
        this.renderInputBox(nameBounds, this.nameText, "\u041d\u0430\u0437\u0432\u0430\u043d\u0438\u0435", this.focusedField == PointsCategoryComponent.InputField.NAME);
        this.renderInputBox(xBounds, this.xText, "X", this.focusedField == PointsCategoryComponent.InputField.X);
        this.renderInputBox(yBounds, this.yText, "Y", this.focusedField == PointsCategoryComponent.InputField.Y);
        this.renderInputBox(zBounds, this.zText, "Z", this.focusedField == PointsCategoryComponent.InputField.Z);
        this.renderActionButton((PointsCategoryComponent.PanelArea)var9_13, (int)var2_2, (int)var3_3);
        this.renderCreateButton((PointsCategoryComponent.PanelArea)var10_16, (int)var2_2, (int)var3_3);
    }

    private final boolean insideActionButton(PointsCategoryComponent.PanelArea area, float mouseX, float mouseY) {
        PointsCategoryComponent.PanelArea bounds = this.actionButtonBounds(area);
        return this.inside(bounds.getLeft(), bounds.getTop(), bounds.getWidth(), bounds.getHeight(), mouseX, mouseY);
    }

    private final List<PointsCategoryComponent.FieldBounds> inputBounds(PointsCategoryComponent.PanelArea area) {
        float rowY = this.inputRowTop(area);
        float availableWidth = RangesKt.coerceAtLeast(area.getWidth() - this.createButtonWidth - this.actionButtonSize - this.getPadding() * 5.0f, 0.0f);
        float nameWidth = RangesKt.coerceAtLeast(availableWidth * 0.42f, 0.0f);
        float coordWidth = RangesKt.coerceAtLeast((availableWidth - nameWidth) / 3.0f, 0.0f);
        float xX = area.getLeft() + nameWidth + this.getPadding();
        float yX = xX + coordWidth + this.getPadding();
        float zX = yX + coordWidth + this.getPadding();
        PointsCategoryComponent.FieldBounds[] fieldBoundsArray = new PointsCategoryComponent.FieldBounds[4];
        fieldBoundsArray[0] = new PointsCategoryComponent.FieldBounds(PointsCategoryComponent.InputField.NAME, area.getLeft(), rowY, nameWidth, this.inputHeight);
        fieldBoundsArray[1] = new PointsCategoryComponent.FieldBounds(PointsCategoryComponent.InputField.X, xX, rowY, coordWidth, this.inputHeight);
        fieldBoundsArray[2] = new PointsCategoryComponent.FieldBounds(PointsCategoryComponent.InputField.Y, yX, rowY, coordWidth, this.inputHeight);
        fieldBoundsArray[3] = new PointsCategoryComponent.FieldBounds(PointsCategoryComponent.InputField.Z, zX, rowY, coordWidth, this.inputHeight);
        return CollectionsKt.listOf(fieldBoundsArray);
    }

    private final boolean insideRename(float rowX, float rowY, float rowWidth, float mouseX, float mouseY) {
        PointsCategoryComponent.PanelArea bounds = this.renameButtonBounds(rowX, rowY, rowWidth);
        return this.inside(bounds.getLeft(), bounds.getTop(), bounds.getWidth(), bounds.getHeight(), mouseX, mouseY);
    }

    @Override
    @NotNull
    public ClientRenderPipeline iconsPipeline() {
        return ClientRenderPipeline.GUI_SPECIAL;
    }

    /*
     * WARNING - void declaration
     */
    private final void renderActionButton(PointsCategoryComponent.PanelArea bounds, int mouseX, int mouseY) {
        void var4_6;
        \u0628\u0641 \u0628\u06412 = \u0628\u0641.INSTANCE;
        float activeProgress = RangesKt.coerceIn(this.settingsPageAnimation.animate(this.settingsPageOpen ? 1.0f : 0.0f, 240.0f, new \u0628\u0636(\u0628\u06412)), 0.0f, 1.0f);
        boolean hovered = this.inside(bounds, mouseX, mouseY);
        \u0628\u0641 \u0628\u06413 = \u0628\u0641.INSTANCE;
        float hover = RangesKt.coerceIn(this.actionButtonHoverAnimation.animate(hovered ? 1.0f : 0.0f, 170.0f, new \u0636\u0633(\u0628\u06413)), 0.0f, 1.0f);
        Color backgroundColor = \u062b\u0652.INSTANCE.surface((0.01f + 0.04f * Math.max(activeProgress, hover)) * this.getAlpha());
        Color borderColor = \u062b\u0652.INSTANCE.title((0.07f + 0.04f * activeProgress + 0.03f * hover) * this.getAlpha());
        Color iconColor = \u0628\u062d.INSTANCE.interpolateColor(\u062b\u0652.INSTANCE.icon(0.55f * this.getAlpha()), \u062b\u0652.INSTANCE.title(0.78f * this.getAlpha()), Math.max(activeProgress, hover));
        float iconSize = this.inputHeight * 0.32f;
        float iconX = bounds.getLeft() + bounds.getWidth() * 0.5f;
        float iconY = bounds.getTop() + (bounds.getHeight() - iconSize) * 0.5f;
        \u0630\u0631.INSTANCE.getBASIC_RECT().priority(this.rectPipeline()).color(backgroundColor).round(4.0f).border(1.0f, borderColor).draw(bounds.getLeft(), bounds.getTop(), bounds.getWidth(), bounds.getHeight());
        Font.drawCenteredText$default(this.getIconFont().priority(this.iconsPipeline()), "x", iconX, iconY + activeProgress * 0.5f, iconSize * (1.0f - 0.08f * activeProgress), \u0628\u062d.INSTANCE.setAlpha(iconColor, this.getAlpha() * (1.0f - activeProgress)), 0.0f, 32, null);
        Font.drawCenteredText$default(this.getIconFont().priority(this.iconsPipeline()), "U", iconX, iconY - (1.0f - activeProgress) * 0.5f, iconSize * (0.92f + 0.08f * activeProgress), \u0628\u062d.INSTANCE.setAlpha(iconColor, this.getAlpha() * var4_6), 0.0f, 32, null);
    }

    private static final String render$lambda$0(WayPointManager.WayPoint it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String string = it.getName().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(string, "toLowerCase(...)");
        return string;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void onMouseClick(int mouseX, int mouseY, int button) {
        Object v0;
        PointsCategoryComponent.PanelArea listArea;
        PointsCategoryComponent.PanelArea footerArea;
        block16: {
            super.onMouseClick(mouseX, mouseY, button);
            if (button != 0) {
                return;
            }
            PointsCategoryComponent.PanelArea area = this.contentArea();
            if (!this.inside(area, mouseX, mouseY)) {
                this.clearInputFocus();
                if (this.settingsPageOpen) {
                    Iterable $this$forEach$iv = this.settingComponents;
                    boolean $i$f$forEach = false;
                    for (Object element$iv : $this$forEach$iv) {
                        ModuleSettingComponent it = (ModuleSettingComponent)element$iv;
                        boolean bl = false;
                        it.onMouseClick(mouseX, mouseY, button);
                    }
                }
                return;
            }
            footerArea = this.footerArea(area);
            listArea = this.listArea(area, footerArea);
            Iterable $this$firstOrNull$iv = this.inputBounds(footerArea);
            boolean $i$f$firstOrNull = false;
            for (Object element$iv : $this$firstOrNull$iv) {
                PointsCategoryComponent.FieldBounds bounds = (PointsCategoryComponent.FieldBounds)element$iv;
                boolean bl = false;
                if (!this.inside(bounds.getX(), bounds.getY(), bounds.getWidth(), bounds.getHeight(), mouseX, mouseY)) continue;
                v0 = element$iv;
                break block16;
            }
            v0 = null;
        }
        PointsCategoryComponent.FieldBounds clickedField = v0;
        if (clickedField != null) {
            this.cancelWaypointRename();
            this.focusedField = clickedField.getField();
            return;
        }
        if (this.insideCreateButton(footerArea, mouseX, mouseY)) {
            this.cancelWaypointRename();
            this.createWaypoint();
            return;
        }
        if (this.insideActionButton(footerArea, mouseX, mouseY)) {
            this.settingsPageOpen = !this.settingsPageOpen;
            this.clearInputFocus();
            return;
        }
        this.focusedField = null;
        if (this.settingsPageOpen) {
            this.cancelWaypointRename();
            Iterable $this$forEach$iv = this.settingComponents;
            boolean $i$f$forEach = false;
            for (Object element$iv : $this$forEach$iv) {
                ModuleSettingComponent it = (ModuleSettingComponent)element$iv;
                boolean bl = false;
                it.onMouseClick(mouseX, mouseY, button);
            }
            return;
        }
        if (!this.inside(listArea, mouseX, mouseY)) {
            return;
        }
        float rowX = listArea.getLeft();
        Iterable $this$filter$iv = this.renderedWayPoints;
        boolean $i$f$filter = false;
        Iterable $this$filterTo$iv$iv = $this$filter$iv;
        Collection destination$iv$iv = new ArrayList();
        boolean $i$f$filterTo = false;
        for (Object element$iv$iv : $this$filterTo$iv$iv) {
            AnimatedListTracker.Item it = (AnimatedListTracker.Item)element$iv$iv;
            boolean bl = false;
            if (!it.getPresent()) continue;
            destination$iv$iv.add(element$iv$iv);
        }
        Iterable $this$forEach$iv = (List)destination$iv$iv;
        boolean $i$f$forEach = false;
        for (Object element$iv : $this$forEach$iv) {
            void var2_2;
            void var1_1;
            void var16_28;
            AnimatedListTracker.Item animatedWayPoint = (AnimatedListTracker.Item)element$iv;
            boolean bl = false;
            WayPointManager.WayPoint wayPoint = (WayPointManager.WayPoint)animatedWayPoint.getValue();
            float rowY = listArea.getTop() - this.scroll.value() + animatedWayPoint.getPosition() * (this.rowHeight + this.getPadding());
            float rowBottom = rowY + this.rowHeight;
            if (!(rowBottom > listArea.getTop()) || !(rowY < listArea.getTop() + listArea.getHeight())) continue;
            if (this.insideDelete(rowX, rowY, listArea.getWidth(), mouseX, mouseY) && WayPointManager.INSTANCE.remove(wayPoint.getName()) == WayPointManager.RemoveResult.REMOVED) {
                this.deleteHoverAnimation.remove(wayPoint.getName());
                this.renameHoverAnimation.remove(wayPoint.getName());
                this.rowHoverAnimation.remove(wayPoint.getName());
                if (Intrinsics.areEqual(this.renamingWaypointName, wayPoint.getName())) {
                    this.cancelWaypointRename();
                }
                return;
            }
            if (this.insideRename(rowX, rowY, listArea.getWidth(), mouseX, mouseY)) {
                this.startWaypointRename(wayPoint);
                return;
            }
            if (!this.isRenamingWaypoint(wayPoint)) continue;
            if (!this.inside(this.rowNameEditorBounds(rowX, (float)var16_28, listArea.getWidth()), (float)var1_1, (float)var2_2)) continue;
            return;
        }
        this.cancelWaypointRename();
    }

    /*
     * WARNING - void declaration
     */
    private final void renderSettingsPage(PointsCategoryComponent.PanelArea area, int mouseX, int mouseY, float partialTicks, float pageProgress) {
        Iterator iterator2;
        void $this$filterTo$iv$iv;
        PointsCategoryComponent.PanelArea pageBounds;
        float pageAlpha;
        block8: {
            block7: {
                pageAlpha = this.getAlpha() * pageProgress;
                pageBounds = this.settingsPageBounds(area);
                if (pageBounds.getWidth() <= 0.0f) break block7;
                if (!(pageBounds.getHeight() <= 0.0f)) break block8;
            }
            return;
        }
        \u0630\u0631.INSTANCE.getBASIC_RECT().priority(this.rectPipeline()).color(\u062b\u0652.INSTANCE.surface(0.01f * pageAlpha)).round(4.0f).border(1.0f, \u062b\u0652.INSTANCE.surface(0.06f * pageAlpha)).draw(pageBounds.getLeft(), pageBounds.getTop(), pageBounds.getWidth(), pageBounds.getHeight());
        float sideInset = this.getPadding() * 0.95f;
        float topInset = this.getPadding() * 0.75f;
        float gap = this.getPadding() * 0.45f;
        float componentX = pageBounds.getLeft() + sideInset;
        float componentWidth = RangesKt.coerceAtLeast(pageBounds.getWidth() - sideInset * 2.0f, 0.0f);
        float currentY = 0.0f;
        currentY = pageBounds.getTop() + topInset;
        Iterable $this$filter$iv = this.settingComponents;
        boolean $i$f$filter = false;
        Iterable iterable = $this$filter$iv;
        Collection destination$iv$iv = new ArrayList();
        boolean $i$f$filterTo = false;
        for (Object element$iv$iv : $this$filterTo$iv$iv) {
            ModuleSettingComponent it = (ModuleSettingComponent)element$iv$iv;
            boolean bl = false;
            if (!((Setting)it.getSetting()).isVisible()) continue;
            destination$iv$iv.add(element$iv$iv);
        }
        Iterable $this$forEachIndexed$iv = (List)((Object)iterator2);
        boolean $i$f$forEachIndexed = false;
        int index$iv = 0;
        for (Object item$iv : $this$forEachIndexed$iv) {
            void var20_23;
            int n;
            if ((n = index$iv++) < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            ModuleSettingComponent component = (ModuleSettingComponent)item$iv;
            int index = n;
            boolean bl = false;
            if (index > 0) {
                currentY += gap;
            }
            component.setAlpha(pageAlpha);
            component.setEnableProgress(1.0f);
            component.setParentOpenProgress(1.0f);
            component.setX(componentX);
            component.setY(currentY);
            component.setWidth(componentWidth);
            component.setHeight(component.getComponentHeight());
            component.render(mouseX, mouseY, partialTicks);
            float f = currentY + var20_23.getComponentHeight();
        }
    }

    @Override
    @NotNull
    public ClientRenderPipeline textPipeline() {
        return ClientRenderPipeline.GUI_TEXT;
    }

    private final void saveWaypointRename() {
        String string = this.renamingWaypointName;
        if (string == null) {
            return;
        }
        String oldName = string;
        String newName = ((Object)StringsKt.trim((CharSequence)this.renamingWaypointText)).toString();
        switch (\u062c\u0652.$EnumSwitchMapping$0[WayPointManager.INSTANCE.rename(oldName, newName).ordinal()]) {
            case 1: 
            case 2: {
                this.deleteHoverAnimation.remove(oldName);
                this.renameHoverAnimation.remove(oldName);
                this.cancelWaypointRename();
                break;
            }
            case 3: {
                this.cancelWaypointRename();
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

    private final String fieldValue(PointsCategoryComponent.InputField field) {
        return switch (\u062c\u0652.$EnumSwitchMapping$1[field.ordinal()]) {
            case 1 -> this.nameText;
            case 2 -> this.xText;
            case 3 -> this.yText;
            case 4 -> this.zText;
            default -> throw new NoWhenBranchMatchedException();
        };
    }

    private final PointsCategoryComponent.PanelArea createButtonBounds(PointsCategoryComponent.PanelArea area) {
        return new PointsCategoryComponent.PanelArea(area.getLeft() + area.getWidth() - this.createButtonWidth, this.inputRowTop(area), this.createButtonWidth, this.inputHeight);
    }

    private final boolean isAllowedWaypointNameKey(String keyName) {
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

    private final void cancelWaypointRename() {
        this.renamingWaypointName = null;
        this.renamingWaypointText = "";
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
        this.scroll = new ScrollUtil(0.0f, 1, null);
    }

    public final float scrollContentHeight() {
        return this.cachedTotalHeight;
    }

    /*
     * WARNING - void declaration
     */
    private final void renderCreateButton(PointsCategoryComponent.PanelArea bounds, int mouseX, int mouseY) {
        void var11_13;
        void var12_14;
        void var15_17;
        \u0628\u0641 \u0628\u06412 = \u0628\u0641.INSTANCE;
        boolean enabled = this.canCreateWaypoint();
        float enabledProgress = RangesKt.coerceIn(this.createButtonAnimation.animate(enabled ? 1.0f : 0.0f, 220.0f, new \u062e\u0634(\u0628\u06412)), 0.0f, 1.0f);
        \u0628\u0641 \u0628\u06413 = \u0628\u0641.INSTANCE;
        float hoverProgress = RangesKt.coerceIn(this.createButtonHoverAnimation.animate(this.inside(bounds, mouseX, mouseY) ? 1.0f : 0.0f, 170.0f, new \u0638\u0641(\u0628\u06413)), 0.0f, 1.0f);
        int uiAlpha = RangesKt.coerceIn((int)(this.getAlpha() * 255.0f), 0, 255);
        int whiteLevel = RangesKt.coerceIn((int)(255.0f - 10.0f * hoverProgress), 0, 255);
        Color backgroundColor = \u0628\u062d.INSTANCE.interpolateColor(\u062b\u0652.INSTANCE.surface((0.01f + 0.025f * hoverProgress) * this.getAlpha()), new Color(whiteLevel, whiteLevel, whiteLevel, uiAlpha), enabledProgress);
        Color borderColor = \u0628\u062d.INSTANCE.interpolateColor(\u062b\u0652.INSTANCE.surface((0.07f + 0.05f * hoverProgress) * this.getAlpha()), new Color(whiteLevel, whiteLevel, whiteLevel, uiAlpha), enabledProgress);
        Color textColor = \u0628\u062d.INSTANCE.interpolateColor(\u062b\u0652.INSTANCE.value(0.48f * this.getAlpha()), new Color(0, 0, 0, uiAlpha), enabledProgress);
        float textSize = this.inputHeight * 0.27f;
        String text = "\u0421\u043e\u0437\u0434\u0430\u0442\u044c";
        float textX = bounds.getLeft() + (bounds.getWidth() - Font.getWidth$default(\u0631\u064e.INSTANCE.getGS_MEDIUM(), text, textSize, 0.0f, 4, null)) * 0.5f;
        float textY = bounds.getTop() + (bounds.getHeight() - textSize) * 0.46f;
        \u0630\u0631.INSTANCE.getBASIC_RECT().priority(this.rectPipeline()).color(backgroundColor).round(4.0f).border(1.0f, borderColor).draw(bounds.getLeft(), bounds.getTop(), bounds.getWidth(), bounds.getHeight());
        Font.drawText$default(\u0631\u064e.INSTANCE.getGS_MEDIUM().priority(this.textPipeline()), text, textX, (float)var15_17, (float)var12_14, (Color)var11_13, 0.0f, 0.0f, 0.0f, 0, 0.0f, 992, null);
    }

    /*
     * WARNING - void declaration
     */
    public \u0631\u0650(float panelWidth, float contentTopOffset) {
        void var7_8;
        this.panelWidth = panelWidth;
        this.contentTopOffset = contentTopOffset;
        this.rowHeight = 33.0f;
        this.rowNameEditorHeight = 10.8f;
        this.rowNameEditorTextSize = 5.9f;
        this.rowNameEditorBoxTextPadding = 4.0f;
        this.rowNameEditorSelectedExpand = 6.0f;
        this.rowNameEditorMinWidth = 26.0f;
        this.inputHeight = 22.0f;
        this.footerReservedHeight = 30.0f;
        this.actionButtonSize = this.inputHeight;
        this.createButtonWidth = 80.0f;
        this.rowActionAreaSize = 14.0f;
        this.rowActionButtonGap = 4.0f;
        this.rowActionIconSize = 6.2f;
        this.nameFieldMaxLength = 24;
        this.coordinateFieldMaxLength = 9;
        this.deleteHoverAnimation = new HashMap();
        this.renameHoverAnimation = new HashMap();
        this.rowHoverAnimation = new HashMap();
        this.listAnimations = new \u062b\u0651(0.0f, 0.0f, 3, null);
        this.inputFocusAnimations = new HashMap();
        this.createButtonAnimation = new AnimationUtil(0.0f, 1, null);
        this.createButtonHoverAnimation = new AnimationUtil(0.0f, 1, null);
        this.settingsPageAnimation = new AnimationUtil(0.0f, 1, null);
        this.actionButtonHoverAnimation = new AnimationUtil(0.0f, 1, null);
        this.emptyStateAnimation = new AnimationUtil(0.0f, 1, null);
        this.renameWidthAnim = new AnimationUtil(0.0f, 1, null);
        this.renameFocusAnim = new AnimationUtil(0.0f, 1, null);
        Iterable $this$mapNotNull$iv = WayPointModule.INSTANCE.getSettings();
        \u062b\u0633 \u062b\u06332 = \u062b\u0633.INSTANCE;
        \u0631\u0650 \u0631\u06502 = this;
        boolean $i$f$mapNotNull = false;
        Iterable $this$mapNotNullTo$iv$iv = $this$mapNotNull$iv;
        Collection destination$iv$iv = new ArrayList();
        boolean $i$f$mapNotNullTo = false;
        Iterable $this$forEach$iv$iv$iv = $this$mapNotNullTo$iv$iv;
        boolean $i$f$forEach = false;
        Iterator iterator2 = $this$forEach$iv$iv$iv.iterator();
        while (iterator2.hasNext()) {
            ModuleSettingComponent<?> moduleSettingComponent;
            Object element$iv$iv$iv;
            Object element$iv$iv = element$iv$iv$iv = iterator2.next();
            boolean bl = false;
            Setting setting = (Setting)element$iv$iv;
            boolean bl2 = false;
            if (\u062b\u06332.create(setting) == null) continue;
            boolean bl3 = false;
            var7_8.add(moduleSettingComponent);
        }
        \u0631\u06502.settingComponents = (List)var7_8;
        this.scroll = new ScrollUtil(0.0f, 1, null);
        this.normalizedSearch = "";
        this.renamingWaypointText = "";
        this.lastRenameInputWidth = this.rowNameEditorMinWidth;
        this.lastRenameMaxInputWidth = this.rowNameEditorMinWidth;
        this.renderedWayPoints = CollectionsKt.emptyList();
        this.nameText = "";
        this.xText = "";
        this.yText = "";
        this.zText = "";
    }

    @Override
    @NotNull
    public ClientRenderPipeline rectPipeline() {
        return ClientRenderPipeline.GUI_RECT;
    }

    /*
     * WARNING - void declaration
     */
    private final PointsCategoryComponent.PanelArea rowNameEditorBounds(float rowX, float rowY, float rowWidth) {
        void var14_17;
        float width;
        CharSequence charSequence;
        PointsCategoryComponent.PanelArea renameBounds = this.renameButtonBounds(rowX, rowY, rowWidth);
        float left = rowX + this.getPadding() * 1.5f;
        float hardMax = RangesKt.coerceAtLeast(renameBounds.getLeft() - left - this.getPadding() * 0.8f, 0.0f);
        CharSequence charSequence2 = this.renamingWaypointText;
        boolean bl = charSequence2.length() == 0;
        if (bl) {
            boolean bl2 = false;
            charSequence = "Text..";
        } else {
            charSequence = charSequence2;
        }
        String displayText = (String)charSequence;
        float contentWidth = Font.getWidth$default(this.getDefaultFont(), displayText, this.rowNameEditorTextSize, 0.0f, 4, null);
        float baseWidth = contentWidth + this.rowNameEditorBoxTextPadding * 2.0f;
        float desiredWidth = baseWidth + this.rowNameEditorSelectedExpand;
        float minAllowed = RangesKt.coerceAtMost(this.rowNameEditorMinWidth, hardMax);
        float targetWidth = hardMax <= 0.0f ? 0.0f : RangesKt.coerceIn(desiredWidth, minAllowed, hardMax);
        float duration = targetWidth > this.lastRenameInputWidth ? 70.0f : 240.0f;
        \u0628\u0641 \u0628\u06412 = \u0628\u0641.INSTANCE;
        this.lastRenameInputWidth = width = this.renameWidthAnim.animate(targetWidth, duration, new \u0637\u062a(\u0628\u06412));
        this.lastRenameMaxInputWidth = hardMax;
        return new PointsCategoryComponent.PanelArea(left, rowY + this.getPadding() * 1.5f - 1.8f, (float)var14_17, this.rowNameEditorHeight);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final void renderInputBox(PointsCategoryComponent.FieldBounds bounds, String value, String placeholder, boolean focused) {
        CharSequence charSequence;
        Object object;
        \u0628\u0641 $this$getOrPut$iv;
        Map map = this.inputFocusAnimations;
        PointsCategoryComponent.InputField key$iv = bounds.getField();
        boolean $i$f$getOrPut = false;
        Object value$iv = $this$getOrPut$iv.get((Object)key$iv);
        if (value$iv == null) {
            boolean bl = false;
            AnimationUtil answer$iv = new AnimationUtil(0.0f, 1, null);
            $this$getOrPut$iv.put(key$iv, answer$iv);
            object = answer$iv;
        } else {
            object = value$iv;
        }
        $this$getOrPut$iv = \u0628\u0641.INSTANCE;
        float focus = RangesKt.coerceIn(((AnimationUtil)object).animate(focused ? 1.0f : 0.0f, 190.0f, new \u0637\u0645($this$getOrPut$iv)), 0.0f, 1.0f);
        Color backgroundColor = \u062b\u0652.INSTANCE.surface((0.01f + 0.03f * focus) * this.getAlpha());
        Color borderColor = \u062b\u0652.INSTANCE.title((0.07f + 0.04f * focus) * this.getAlpha());
        Color textColor = StringsKt.isBlank(value) ? \u062b\u0652.INSTANCE.value(0.45f * this.getAlpha()) : \u062b\u0652.INSTANCE.title(0.76f * this.getAlpha());
        float textSize = this.inputHeight * 0.27f;
        CharSequence charSequence2 = value;
        if (StringsKt.isBlank(charSequence2)) {
            boolean bl = false;
            charSequence = focused ? " " : placeholder;
        } else {
            charSequence = charSequence2;
        }
        String drawText = (String)charSequence;
        float textX = bounds.getX() + this.getPadding() * 1.2f;
        float textY = bounds.getY() + (bounds.getHeight() - textSize) * 0.46f;
        Font font = \u0631\u064e.INSTANCE.getGS_MEDIUM().priority(this.textPipeline());
        \u0630\u0631.INSTANCE.getBASIC_RECT().priority(this.rectPipeline()).color(backgroundColor).round(4.0f).border(1.0f, borderColor).draw(bounds.getX(), bounds.getY(), bounds.getWidth(), bounds.getHeight());
        Font.drawText$default(font, drawText, textX, textY, textSize, textColor, 0.0f, 0.0f, 0.0f, 0, 0.0f, 992, null);
        if (!focused) return;
        if (System.currentTimeMillis() / 450L % 2L != 0L) return;
        boolean bl = true;
        boolean showCaret = bl;
        if (!showCaret) {
            return;
        }
        float caretX = textX + Font.getWidth$default(\u0631\u064e.INSTANCE.getGS_MEDIUM(), drawText, textSize, 0.0f, 4, null) + 1.0f;
        Font.drawText$default(font, "|", caretX, textY, textSize, \u062b\u0652.INSTANCE.title(0.86f * this.getAlpha()), 0.0f, 0.0f, 0.0f, 0, 0.0f, 992, null);
    }

    private final boolean canCreateWaypoint() {
        block4: {
            block3: {
                String name = ((Object)StringsKt.trim((CharSequence)this.nameText)).toString();
                if (!WayPointManager.INSTANCE.isValidName(name)) break block3;
                if (!WayPointManager.INSTANCE.hasWaypoint(name)) break block4;
            }
            return false;
        }
        return StringsKt.toIntOrNull(this.xText) != null && StringsKt.toIntOrNull(this.yText) != null && StringsKt.toIntOrNull(this.zText) != null;
    }

    private final boolean inside(PointsCategoryComponent.PanelArea area, float mouseX, float mouseY) {
        return this.inside(area.getLeft(), area.getTop(), area.getWidth(), area.getHeight(), mouseX, mouseY);
    }

    private final boolean sameWaypointName(String first, String second) {
        return StringsKt.equals(((Object)StringsKt.trim((CharSequence)first)).toString(), ((Object)StringsKt.trim((CharSequence)second)).toString(), true);
    }

    public final float scrollOffsetValue() {
        return this.scroll.value();
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

    /*
     * WARNING - void declaration
     */
    private final PointsCategoryComponent.PanelArea settingsPageBounds(PointsCategoryComponent.PanelArea area) {
        void var7_12;
        void var1_1;
        void var10_18;
        void $this$filterTo$iv$iv;
        Iterable $this$filter$iv = this.settingComponents;
        boolean $i$f$filter = false;
        Iterable iterable = $this$filter$iv;
        Collection destination$iv$iv = new ArrayList();
        boolean $i$f$filterTo = false;
        for (Object element$iv$iv : $this$filterTo$iv$iv) {
            ModuleSettingComponent it = (ModuleSettingComponent)element$iv$iv;
            boolean bl = false;
            if (!((Setting)it.getSetting()).isVisible()) continue;
            destination$iv$iv.add(element$iv$iv);
        }
        List visibleComponents = (List)destination$iv$iv;
        float gap = this.getPadding() * 0.45f;
        float topInset = this.getPadding() * 0.75f;
        float bottomInset = this.getPadding() * 0.75f;
        Iterable $this$fold$iv = visibleComponents;
        float initial$iv = 0.0f;
        boolean $i$f$fold = false;
        float accumulator$iv = initial$iv;
        for (Object element$iv : $this$fold$iv) {
            void var13_23;
            void var14_24;
            ModuleSettingComponent component = (ModuleSettingComponent)element$iv;
            float acc = accumulator$iv;
            boolean bl = false;
            var10_18 = var14_24 + var13_23.getComponentHeight();
        }
        void contentHeight = var10_18 + gap * (float)RangesKt.coerceAtLeast(visibleComponents.size() - 1, 0);
        float height = RangesKt.coerceAtMost(topInset + contentHeight + bottomInset, area.getHeight());
        return new PointsCategoryComponent.PanelArea(area.getLeft(), area.getTop(), var1_1.getWidth(), (float)var7_12);
    }

    @Override
    public void onKeyPress(int mouseX, int mouseY, int button) {
        super.onKeyPress(mouseX, mouseY, button);
        if (this.settingsPageOpen && this.focusedField == null && this.renamingWaypointName == null) {
            Iterable $this$forEach$iv = this.settingComponents;
            boolean $i$f$forEach = false;
            for (Object element$iv : $this$forEach$iv) {
                ModuleSettingComponent it = (ModuleSettingComponent)element$iv;
                boolean bl = false;
                it.onKeyPress(mouseX, mouseY, button);
            }
            return;
        }
        if (this.renamingWaypointName != null) {
            this.handleWaypointRenameKey(button);
            return;
        }
        PointsCategoryComponent.InputField inputField = this.focusedField;
        if (inputField == null) {
            return;
        }
        PointsCategoryComponent.InputField field = inputField;
        switch (button) {
            case 257: 
            case 335: {
                this.createWaypoint();
                return;
            }
            case 258: {
                this.focusedField = field.next();
                return;
            }
            case 259: {
                this.updateField(field, StringsKt.dropLast(this.fieldValue(field), 1));
                return;
            }
            case 261: {
                this.updateField(field, "");
                return;
            }
            case 32: {
                if (field == PointsCategoryComponent.InputField.NAME) {
                    this.appendToField(field, " ");
                }
                return;
            }
        }
        String string = this.resolveTypedKey(button);
        if (string == null) {
            return;
        }
        String keyName = string;
        this.appendKeyName(field, keyName);
    }

    public final boolean isSettingsPageOpen() {
        return this.settingsPageOpen;
    }

    private final PointsCategoryComponent.PanelArea deleteButtonBounds(float rowX, float rowY, float rowWidth) {
        return new PointsCategoryComponent.PanelArea(rowX + rowWidth - this.getPadding() - this.rowActionAreaSize, rowY + (this.rowHeight - this.rowActionAreaSize) * 0.5f, this.rowActionAreaSize, this.rowActionAreaSize);
    }

    private final boolean isRenamingWaypoint(WayPointManager.WayPoint wayPoint) {
        return Intrinsics.areEqual(this.renamingWaypointName, wayPoint.getName());
    }

    private final void createWaypoint() {
        if (!this.canCreateWaypoint()) {
            return;
        }
        Integer n = StringsKt.toIntOrNull(this.xText);
        if (n == null) {
            return;
        }
        int x = n;
        Integer n2 = StringsKt.toIntOrNull(this.yText);
        if (n2 == null) {
            return;
        }
        int y = n2;
        Integer n3 = StringsKt.toIntOrNull(this.zText);
        if (n3 == null) {
            return;
        }
        int z = n3;
        WayPointManager.AddResult result = WayPointManager.INSTANCE.add(((Object)StringsKt.trim((CharSequence)this.nameText)).toString(), false, new BlockPos(x, y, z));
        if (result != WayPointManager.AddResult.ADDED) {
            return;
        }
        this.nameText = "";
        this.xText = "";
        this.yText = "";
        this.zText = "";
        this.focusedField = null;
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

    private final boolean inside(float x, float y, float width, float height, float mouseX, float mouseY) {
        return mouseX >= x && mouseX <= x + width && mouseY >= y && mouseY <= y + height;
    }

    @Override
    public void onMouseScroll(int mouseX, int mouseY, float vertical) {
        super.onMouseScroll(mouseX, mouseY, vertical);
        PointsCategoryComponent.PanelArea area = this.contentArea();
        PointsCategoryComponent.PanelArea footerArea = this.footerArea(area);
        PointsCategoryComponent.PanelArea listArea = this.listArea(area, footerArea);
        if (!this.inside(listArea, mouseX, mouseY)) {
            return;
        }
        if (this.settingsPageOpen) {
            return;
        }
        this.scrollWheel(vertical);
    }

    public final void clearInputFocus() {
        this.focusedField = null;
        this.cancelWaypointRename();
    }

    private final void handleWaypointRenameKey(int button) {
        switch (button) {
            case 257: 
            case 335: {
                this.saveWaypointRename();
                return;
            }
            case 256: {
                this.cancelWaypointRename();
                return;
            }
            case 259: {
                this.renamingWaypointText = StringsKt.dropLast(this.renamingWaypointText, 1);
                return;
            }
            case 261: {
                this.renamingWaypointText = "";
                return;
            }
            case 32: {
                this.appendToWaypointRename(" ");
                return;
            }
        }
        String string = this.resolveTypedKey(button);
        if (string == null) {
            return;
        }
        String keyName = string;
        if (!this.isAllowedWaypointNameKey(keyName)) {
            return;
        }
        this.appendToWaypointRename(keyName);
    }

    public static /* synthetic */ void setScrollProgress$default(\u0631\u0650 \u0631\u06502, float f, boolean bl, int n, Object object) {
        if ((n & 2) != 0) {
            bl = false;
        }
        \u0631\u06502.setScrollProgress(f, bl);
    }

    private final PointsCategoryComponent.PanelArea actionButtonBounds(PointsCategoryComponent.PanelArea area) {
        PointsCategoryComponent.PanelArea createBounds = this.createButtonBounds(area);
        return new PointsCategoryComponent.PanelArea(createBounds.getLeft() - this.getPadding() - this.actionButtonSize, this.inputRowTop(area), this.actionButtonSize, this.inputHeight);
    }

    private final boolean insideDelete(float rowX, float rowY, float rowWidth, float mouseX, float mouseY) {
        PointsCategoryComponent.PanelArea bounds = this.deleteButtonBounds(rowX, rowY, rowWidth);
        return this.inside(bounds.getLeft(), bounds.getTop(), bounds.getWidth(), bounds.getHeight(), mouseX, mouseY);
    }

    private final void appendToWaypointRename(String value) {
        boolean bl = ((CharSequence)value).length() == 0;
        if (bl) {
            return;
        }
        if (this.renamingWaypointText.length() >= this.nameFieldMaxLength) {
            return;
        }
        this.renamingWaypointText = StringsKt.take(this.renamingWaypointText + value, this.nameFieldMaxLength);
    }

    private final PointsCategoryComponent.PanelArea contentArea() {
        float left = this.getX() + this.panelWidth + this.getPadding();
        float right = this.getX() + this.getWidth() - this.panelWidth / 3.0f;
        float top = this.getY() + this.contentTopOffset;
        float areaWidth = RangesKt.coerceAtLeast(right - left, 0.0f);
        float areaHeight = RangesKt.coerceAtLeast(this.getY() + this.getHeight() - top - this.getPadding(), 0.0f);
        return new PointsCategoryComponent.PanelArea(left, top, areaWidth, areaHeight);
    }

    private final float inputRowTop(PointsCategoryComponent.PanelArea area) {
        return area.getTop() + (area.getHeight() - this.inputHeight) * 0.5f;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final boolean canRenameWaypoint(String originalName, String candidateName) {
        String sanitizedCandidate = ((Object)StringsKt.trim((CharSequence)candidateName)).toString();
        if (!WayPointManager.INSTANCE.isValidName(sanitizedCandidate)) {
            return false;
        }
        if (this.sameWaypointName(originalName, sanitizedCandidate)) return true;
        if (WayPointManager.INSTANCE.hasWaypoint(sanitizedCandidate)) return false;
        return true;
    }

    public final float scrollViewHeight() {
        return this.cachedViewHeight;
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

    /*
     * WARNING - void declaration
     */
    private final void renderRowNameEditor(PointsCategoryComponent.PanelArea bounds, float editorAlpha) {
        void var15_17;
        void var8_8;
        void var19_21;
        void var16_18;
        void var18_20;
        String renderText;
        CharSequence charSequence;
        block7: {
            block6: {
                if (bounds.getWidth() <= 0.0f) break block6;
                if (!(bounds.getHeight() <= 0.0f)) break block7;
            }
            return;
        }
        \u0628\u0641 \u0628\u06412 = \u0628\u0641.INSTANCE;
        float focus = this.renameFocusAnim.animate(1.0f, 220.0f, new \u0635\u0641(\u0628\u06412));
        Color rowColor = \u062b\u0652.INSTANCE.surface(editorAlpha * 0.05f);
        Color rowBorder = \u062b\u0652.INSTANCE.title(editorAlpha * 0.08f);
        Color placeholderColor = \u062b\u0652.INSTANCE.value(editorAlpha * 0.42f);
        Color valueColor = \u062b\u0652.INSTANCE.value(editorAlpha * (0.82f + 0.1f * focus));
        float textSize = this.rowNameEditorTextSize;
        CharSequence charSequence2 = this.renamingWaypointText;
        boolean bl = charSequence2.length() == 0;
        if (bl) {
            boolean bl2 = false;
            charSequence = "";
        } else {
            charSequence = charSequence2;
        }
        String rawText = (String)charSequence;
        boolean caretVisible = System.currentTimeMillis() / 450L % 2L == 0L;
        float caretReserve = Font.getWidth$default(this.getDefaultFont(), "|", textSize, 0.0f, 4, null) + 0.5f;
        float textMaxWidth = RangesKt.coerceAtLeast(bounds.getWidth() - this.rowNameEditorBoxTextPadding * 2.0f - 1.0f, 0.0f);
        boolean nearLimit = bounds.getWidth() >= this.lastRenameMaxInputWidth - 1.0f;
        String string = renderText = nearLimit ? this.trimTextToFit(rawText, textMaxWidth, textSize) : rawText;
        Color textColor = ((CharSequence)this.renamingWaypointText).length() > 0 ? valueColor : placeholderColor;
        float textWidth = Font.getWidth$default(this.getDefaultFont(), renderText, textSize, 0.0f, 4, null);
        float layoutWidth = textWidth + caretReserve;
        float textX = bounds.getLeft() + (bounds.getWidth() - layoutWidth) * 0.5f;
        float textY = bounds.getTop() + 1.8f;
        Font font = \u0631\u064e.INSTANCE.getGS_MEDIUM().priority(this.textPipeline());
        \u0630\u0631.INSTANCE.getBLURRED_RECT().priority(this.rectPipeline()).color(rowColor).round(2.2f).mix(0.95f).border(1.0f, rowBorder).draw(bounds.getLeft(), bounds.getTop(), bounds.getWidth(), bounds.getHeight());
        Font.drawText$default(font, renderText, textX, textY, textSize, textColor, 0.0f, 0.0f, 0.0f, 0, 0.0f, 992, null);
        if (!caretVisible) {
            return;
        }
        Font.drawText$default(font, "|", (float)(var18_20 + var16_18 + 0.5f), (float)var19_21, (float)var8_8, (Color)var15_17, 0.0f, 0.0f, 0.0f, 0, 0.0f, 992, null);
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void render(int mouseX, int mouseY, float partialTicks) {
        super.render(mouseX, mouseY, partialTicks);
        area = this.contentArea();
        footerArea = this.footerArea(area);
        listArea = this.listArea(area, footerArea);
        this.cachedViewHeight = listArea.getHeight();
        visibleWayPoints = this.filteredWayPoints();
        this.renderedWayPoints = this.listAnimations.update(visibleWayPoints, (Function1<WayPointManager.WayPoint, String>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, render$lambda$0(kotakbaz.rain.client.waypoint.WayPointManager$WayPoint ), (Lkotakbaz/rain/client/waypoint/WayPointManager$WayPoint;)Ljava/lang/String;)());
        var9_8 = \u0628\u0641.INSTANCE;
        pageProgress = RangesKt.coerceIn(this.settingsPageAnimation.animate(this.settingsPageOpen ? 1.0f : 0.0f, 240.0f, new \u0632\u0637(var9_8)), 0.0f, 1.0f);
        listProgress = 1.0f - pageProgress;
        this.cachedTotalHeight = this.contentHeight(visibleWayPoints.size()) * listProgress;
        this.scroll.setMax(RangesKt.coerceAtLeast(this.cachedTotalHeight - this.cachedViewHeight, 0.0f));
        this.scroll.update();
        if (listProgress > 0.001f) {
            this.renderList(PointsCategoryComponent.PanelArea.copy$default(listArea, listArea.getLeft() - pageProgress * 8.0f, 0.0f, 0.0f, 0.0f, 14, null), this.renderedWayPoints, this.scroll.value(), mouseX, mouseY, listProgress);
        }
        if (pageProgress > 0.001f) {
            this.renderSettingsPage(PointsCategoryComponent.PanelArea.copy$default(listArea, listArea.getLeft() + (1.0f - pageProgress) * 8.0f, 0.0f, 0.0f, 0.0f, 14, null), mouseX, mouseY, partialTicks, pageProgress);
        }
        if (!visibleWayPoints.isEmpty()) ** GOTO lbl-1000
        v0 = !StringsKt.isBlank(this.normalizedSearch);
        if (v0 && !this.settingsPageOpen) {
            v1 = true;
        } else lbl-1000:
        // 2 sources

        {
            v1 = false;
        }
        showEmpty = v1;
        var12_12 = \u0628\u0641.INSTANCE;
        emptyProgress = RangesKt.coerceIn(this.emptyStateAnimation.animate(showEmpty ? 1.0f : 0.0f, 190.0f, new \u062a\u0651(var12_12)), 0.0f, 1.0f);
        if (var11_13 > 0.001f) {
            this.renderEmptyState((PointsCategoryComponent.PanelArea)var6_6, (float)var11_13);
        }
        this.renderFooter((PointsCategoryComponent.PanelArea)var5_5, (int)var1_1, (int)var2_2);
    }

    private final void updateField(PointsCategoryComponent.InputField field, String value) {
        switch (\u062c\u0652.$EnumSwitchMapping$1[field.ordinal()]) {
            case 1: {
                this.nameText = value;
                break;
            }
            case 2: {
                this.xText = value;
                break;
            }
            case 3: {
                this.yText = value;
                break;
            }
            case 4: {
                this.zText = value;
                break;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public final void scrollWheel(float vertical) {
        this.scroll.scroll(vertical * 2.5f);
    }

    private final PointsCategoryComponent.PanelArea footerArea(PointsCategoryComponent.PanelArea area) {
        float footerHeight = RangesKt.coerceAtMost(this.footerReservedHeight, area.getHeight());
        return new PointsCategoryComponent.PanelArea(area.getLeft(), area.getTop() + area.getHeight() - footerHeight, area.getWidth(), footerHeight);
    }

    private final void appendToField(PointsCategoryComponent.InputField field, String value) {
        boolean bl = ((CharSequence)value).length() == 0;
        if (bl) {
            return;
        }
        String current = this.fieldValue(field);
        int maxLength = field == PointsCategoryComponent.InputField.NAME ? this.nameFieldMaxLength : this.coordinateFieldMaxLength;
        if (current.length() >= maxLength) {
            return;
        }
        this.updateField(field, StringsKt.take(current + value, maxLength));
    }

    /*
     * WARNING - void declaration
     */
    private final String trimTextToFit(String text, float maxWidth, float size) {
        void var4_4;
        if (maxWidth <= 0.0f) {
            return "";
        }
        String candidate = text;
        while (true) {
            boolean bl = ((CharSequence)candidate).length() > 0;
            if (!bl) break;
            if (!(Font.getWidth$default(this.getDefaultFont(), candidate, size, 0.0f, 4, null) > maxWidth)) break;
            candidate = StringsKt.dropLast(candidate, 1);
        }
        return var4_4;
    }
}

