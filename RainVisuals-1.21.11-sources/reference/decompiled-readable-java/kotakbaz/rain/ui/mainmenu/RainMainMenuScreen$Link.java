/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.screen.ChatScreen
 *  net.minecraft.client.gui.screen.ConfirmLinkScreen
 *  net.minecraft.client.gui.screen.Screen
 *  net.minecraft.client.sound.PositionedSoundInstance
 *  net.minecraft.client.sound.SoundInstance
 *  net.minecraft.sound.SoundEvent
 *  net.minecraft.sound.SoundEvents
 *  net.minecraft.text.MutableText
 *  net.minecraft.text.Style
 *  net.minecraft.text.Text
 *  net.minecraft.text.TextColor
 */
package kotakbaz.rain.ui.mainmenu;

import java.awt.Color;
import java.lang.invoke.LambdaMetafactory;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotakbaz.rain.client.draggable.Draggable;
import kotakbaz.rain.client.draggable.animation.Easing;
import kotakbaz.rain.client.util.animations.AnimationUtil;
import kotakbaz.rain.client.util.render.engine.controls.ClientRenderPipeline;
import kotakbaz.rain.client.util.render.font.Font;
import kotakbaz.rain.event.events.OverlayRenderEvent;
import kotakbaz.rain.module.Module;
import kotakbaz.rain.module.modules.hud.MediaPlayerInfoModule;
import kotakbaz.rain.module.modules.hud.NotifyModule;
import kotakbaz.rain.module.modules.hud.WatermarkModule;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import net.minecraft.client.gui.screen.ChatScreen;
import net.minecraft.client.gui.screen.ConfirmLinkScreen;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.sound.PositionedSoundInstance;
import net.minecraft.client.sound.SoundInstance;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.MutableText;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.text.TextColor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import oxxxde.\u0628\u062d;
import oxxxde.\u0628\u0637;
import oxxxde.\u0628\u0641;
import oxxxde.\u062a\u0623;
import oxxxde.\u062c\u0633;
import oxxxde.\u062f\u0625;
import oxxxde.\u0630\u0631;
import oxxxde.\u0631\u064e;
import oxxxde.\u0633\u0623;
import oxxxde.\u0636\u0643;
import oxxxde.\u0637\u063a;
import oxxxde.\u0638\u0646;
import sweetie.evaware.flora.api.Commando;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u00c6\u0002\u0018\u00002\u00020\u0001:\b\u0095\u0001\u0096\u0001\u0097\u0001\u0098\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\t\u0010\bJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\n\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u0012\u00a2\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u00122\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017\u00a2\u0006\u0004\b\u0014\u0010\u001aJE\u0010\"\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u00122\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\u0004\b\"\u0010#J%\u0010(\u001a\u00020\n2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020$2\u0006\u0010'\u001a\u00020$\u00a2\u0006\u0004\b(\u0010)J\u001d\u0010*\u001a\u00020\u00062\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0002\u00a2\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\b,\u0010\u0003J'\u00102\u001a\u00020/2\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/2\u0006\u00101\u001a\u00020/H\u0002\u00a2\u0006\u0004\b2\u00103J'\u00105\u001a\u00020/2\u0006\u0010.\u001a\u0002042\u0006\u00100\u001a\u00020/2\u0006\u00101\u001a\u00020/H\u0002\u00a2\u0006\u0004\b5\u00106J1\u00109\u001a\u00020/2\u0006\u0010.\u001a\u0002072\u0006\u00100\u001a\u00020/2\u0006\u00101\u001a\u00020/2\b\b\u0002\u00108\u001a\u00020/H\u0002\u00a2\u0006\u0004\b9\u0010:J\u001f\u0010<\u001a\u00020\u00062\u0006\u00101\u001a\u00020/2\u0006\u0010;\u001a\u00020/H\u0002\u00a2\u0006\u0004\b<\u0010=J\u001f\u0010?\u001a\u00020/2\u0006\u0010.\u001a\u00020-2\u0006\u0010>\u001a\u00020\u001bH\u0002\u00a2\u0006\u0004\b?\u0010@J7\u0010C\u001a\u00020\u00062\u0006\u0010.\u001a\u0002042\u0006\u0010A\u001a\u00020/2\u0006\u00101\u001a\u00020/2\u0006\u0010B\u001a\u00020/2\u0006\u0010;\u001a\u00020/H\u0002\u00a2\u0006\u0004\bC\u0010DJ\u0017\u0010E\u001a\u00020/2\u0006\u0010.\u001a\u000204H\u0002\u00a2\u0006\u0004\bE\u0010FJ7\u0010G\u001a\u00020\u00062\u0006\u0010.\u001a\u0002072\u0006\u0010A\u001a\u00020/2\u0006\u00101\u001a\u00020/2\u0006\u0010B\u001a\u00020/2\u0006\u0010;\u001a\u00020/H\u0002\u00a2\u0006\u0004\bG\u0010HJ\u0017\u0010I\u001a\u00020/2\u0006\u0010.\u001a\u000207H\u0002\u00a2\u0006\u0004\bI\u0010JJE\u0010K\u001a\u00020\u00062\u0006\u0010.\u001a\u0002072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010A\u001a\u00020/2\u0006\u00101\u001a\u00020/2\u0006\u0010B\u001a\u00020/2\u0006\u0010;\u001a\u00020/H\u0002\u00a2\u0006\u0004\bK\u0010LJ%\u0010M\u001a\u00020/2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010B\u001a\u00020/H\u0002\u00a2\u0006\u0004\bM\u0010NJ\u001f\u0010P\u001a\u00020/2\u0006\u0010.\u001a\u00020-2\u0006\u0010O\u001a\u00020/H\u0002\u00a2\u0006\u0004\bP\u0010QJ\u001f\u0010R\u001a\u00020/2\u0006\u0010.\u001a\u00020-2\u0006\u0010O\u001a\u00020/H\u0002\u00a2\u0006\u0004\bR\u0010QJ\u001f\u0010S\u001a\u00020\u00062\u0006\u0010.\u001a\u00020-2\u0006\u0010>\u001a\u00020\u001bH\u0002\u00a2\u0006\u0004\bS\u0010TJ\u0017\u0010U\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\nH\u0002\u00a2\u0006\u0004\bU\u0010VJ\u001f\u0010Y\u001a\u00020X2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010W\u001a\u00020/H\u0002\u00a2\u0006\u0004\bY\u0010ZJ\u0017\u0010[\u001a\u00020X2\u0006\u0010\u001f\u001a\u00020\u0012H\u0002\u00a2\u0006\u0004\b[\u0010\\J\u0017\u0010^\u001a\u00020X2\u0006\u0010]\u001a\u00020\nH\u0002\u00a2\u0006\u0004\b^\u0010_J7\u0010c\u001a\u00020\u00062\u0006\u0010.\u001a\u0002072\u0006\u0010`\u001a\u00020/2\u0006\u0010a\u001a\u00020/2\u0006\u0010b\u001a\u00020/2\u0006\u0010;\u001a\u00020/H\u0002\u00a2\u0006\u0004\bc\u0010HJ1\u0010g\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0012\u0018\u00010f2\b\u0010d\u001a\u0004\u0018\u00010\u00122\b\u0010e\u001a\u0004\u0018\u00010\u0012H\u0002\u00a2\u0006\u0004\bg\u0010hJ\u001b\u0010j\u001a\u0004\u0018\u00010i2\b\u0010e\u001a\u0004\u0018\u00010\u0012H\u0002\u00a2\u0006\u0004\bj\u0010kJ\u001f\u0010n\u001a\u00020\u00122\u0006\u0010l\u001a\u00020\u00122\u0006\u0010m\u001a\u00020$H\u0002\u00a2\u0006\u0004\bn\u0010oJ\u000f\u0010p\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\bp\u0010\u0003J\u001f\u0010s\u001a\u00020X2\u0006\u0010q\u001a\u00020X2\u0006\u0010r\u001a\u00020/H\u0002\u00a2\u0006\u0004\bs\u0010tJ\u000f\u0010u\u001a\u00020/H\u0002\u00a2\u0006\u0004\bu\u0010vR\u0014\u0010w\u001a\u00020\u00128\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bw\u0010xR\u0014\u0010y\u001a\u00020\u00128\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\by\u0010xR\u0014\u0010z\u001a\u00020\u001b8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bz\u0010{R\u0014\u0010|\u001a\u00020\u001b8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b|\u0010{R\u0014\u0010}\u001a\u00020\u001b8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b}\u0010{R\u0014\u0010~\u001a\u00020\u001b8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b~\u0010{R\u0014\u0010\u007f\u001a\u00020\u001b8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u007f\u0010{R\u0016\u0010\u0080\u0001\u001a\u00020\u001b8\u0002X\u0082T\u00a2\u0006\u0007\n\u0005\b\u0080\u0001\u0010{R\u0016\u0010\u0081\u0001\u001a\u00020\u001b8\u0002X\u0082T\u00a2\u0006\u0007\n\u0005\b\u0081\u0001\u0010{R\u0017\u0010\u0082\u0001\u001a\u00020$8\u0002X\u0082T\u00a2\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0016\u0010\u0084\u0001\u001a\u00020\u00128\u0002X\u0082T\u00a2\u0006\u0007\n\u0005\b\u0084\u0001\u0010xR\u0018\u0010\u0086\u0001\u001a\u00030\u0085\u00018\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R\u0017\u0010\u0088\u0001\u001a\u00020X8\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R\u0017\u0010\u008a\u0001\u001a\u00020X8\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u008a\u0001\u0010\u0089\u0001R\u0017\u0010\u008b\u0001\u001a\u00020X8\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u008b\u0001\u0010\u0089\u0001R\u001e\u0010\u008d\u0001\u001a\t\u0012\u0004\u0012\u00020-0\u008c\u00018\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001R\u001e\u0010\u008f\u0001\u001a\t\u0012\u0004\u0012\u0002070\u008c\u00018\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u008f\u0001\u0010\u008e\u0001R\u001a\u0010\u0091\u0001\u001a\u00030\u0090\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u0091\u0001\u0010\u0092\u0001R\u0019\u0010\u0093\u0001\u001a\u00020\n8\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001\u00a8\u0006\u0099\u0001"}, d2={"Loxxxde/\u0633\u0650;", "Loxxxde/\u062f\u0650;", "<init>", "()V", "Loxxxde/\u062b\u0622;", "event", "", "onOverlayRender", "(Lkotakbaz/rain/event/events/OverlayRenderEvent;)V", "renderRemoteNotifications", "", "showPreview", "renderOverlay", "(Z)V", "module", "state", "showModuleState", "(Lkotakbaz/rain/module/Module;Z)V", "", "text", "showMessage", "(Lkotakbaz/rain/module/Module;Ljava/lang/String;)V", "icon", "", "Loxxxde/\u0637\u0625;", "segments", "(Lkotakbaz/rain/module/Module;Ljava/lang/String;Ljava/util/List;)V", "", "id", "title", "message", "level", "actionLabel", "actionUrl", "showRemoteNotification", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "mouseX", "mouseY", "button", "onRemoteNotificationClick", "(III)Z", "sendChatFallback", "(Ljava/util/List;)V", "onDisable", "Loxxxde/\u0638\u0636;", "notification", "", "progress", "y", "renderNotification", "(Lkotakbaz/rain/module/modules/hud/NotifyModule$NotificationEntry;FF)F", "Loxxxde/\u0631\u062e;", "renderModuleStateNotification", "(Lkotakbaz/rain/module/modules/hud/NotifyModule$ModuleStateNotification;FF)F", "Loxxxde/\u0631\u0646;", "centerX", "renderMessageNotification", "(Lkotakbaz/rain/module/modules/hud/NotifyModule$MessageNotification;FFF)F", "visibility", "renderPreview", "(FF)V", "now", "animationProgress", "(Lkotakbaz/rain/module/modules/hud/NotifyModule$NotificationEntry;J)F", "x", "size", "drawStatus", "(Lkotakbaz/rain/module/modules/hud/NotifyModule$ModuleStateNotification;FFFF)V", "statusTransitionProgress", "(Lkotakbaz/rain/module/modules/hud/NotifyModule$ModuleStateNotification;)F", "drawMessageText", "(Lkotakbaz/rain/module/modules/hud/NotifyModule$MessageNotification;FFFF)V", "messageTransitionProgress", "(Lkotakbaz/rain/module/modules/hud/NotifyModule$MessageNotification;)F", "drawMessageSegments", "(Lkotakbaz/rain/module/modules/hud/NotifyModule$MessageNotification;Ljava/util/List;FFFF)V", "messageWidth", "(Ljava/util/List;F)F", "target", "animatedWidth", "(Lkotakbaz/rain/module/modules/hud/NotifyModule$NotificationEntry;F)F", "animatedStackOffset", "refreshNotification", "(Lkotakbaz/rain/module/modules/hud/NotifyModule$NotificationEntry;J)V", "statusText", "(Z)Ljava/lang/String;", "alpha", "Ljava/awt/Color;", "stateColor", "(ZF)Ljava/awt/Color;", "remoteLevelColor", "(Ljava/lang/String;)Ljava/awt/Color;", "hovered", "remoteActionColor", "(Z)Ljava/awt/Color;", "textX", "textY", "textSize", "updateRemoteActionState", "label", "url", "Lkotlin/Pair;", "validatedRemoteAction", "(Ljava/lang/String;Ljava/lang/String;)Lkotlin/Pair;", "Ljava/net/URI;", "validatedRemoteUri", "(Ljava/lang/String;)Ljava/net/URI;", "value", "maximumLength", "compactText", "(Ljava/lang/String;I)Ljava/lang/String;", "resolveDefaultPosition", "color", "factor", "withAlpha", "(Ljava/awt/Color;F)Ljava/awt/Color;", "notificationHeight", "()F", "PREVIEW_TEXT", "Ljava/lang/String;", "TIME_ICON", "ENTER_DURATION_MS", "J", "VISIBLE_DURATION_MS", "EXIT_DURATION_MS", "CONTENT_ANIMATION_MS", "STACK_MOVE_DURATION_MS", "REMOTE_VISIBLE_DURATION_MS", "REMOTE_ACTION_VISIBLE_DURATION_MS", "MAX_REMOTE_NOTIFICATIONS", "I", "REMOTE_NOTIFICATION_PREFIX", "Loxxxde/\u0638\u0630;", "draggable", "Loxxxde/\u0638\u0630;", "dividerColor", "Ljava/awt/Color;", "enabledColor", "disabledColor", "", "notifications", "Ljava/util/List;", "remoteNotifications", "Loxxxde/\u0631\u064a;", "previewAnimation", "Loxxxde/\u0631\u064a;", "defaultPositionResolved", "Z", "MessageSegment", "NotificationEntry", "ModuleStateNotification", "MessageNotification", "rain-visuals"})
public final class RainMainMenuScreen$Link
extends Module {
    @NotNull
    private static final Color enabledColor;
    private static final long ENTER_DURATION_MS = 360L;
    @NotNull
    private static final String TIME_ICON = "S";
    private static final long VISIBLE_DURATION_MS = 2000L;
    private static final long EXIT_DURATION_MS = 260L;
    @NotNull
    private static final String REMOTE_NOTIFICATION_PREFIX = "RemoteNotification:";
    private static final long REMOTE_ACTION_VISIBLE_DURATION_MS = 10000L;
    private static boolean defaultPositionResolved;
    @NotNull
    private static final List<NotifyModule.NotificationEntry> notifications;
    private static final long REMOTE_VISIBLE_DURATION_MS = 6000L;
    private static final int MAX_REMOTE_NOTIFICATIONS = 5;
    private static final long STACK_MOVE_DURATION_MS = 260L;
    @NotNull
    private static final Draggable draggable;
    @NotNull
    private static final List<NotifyModule.MessageNotification> remoteNotifications;
    @NotNull
    private static final String PREVIEW_TEXT = "\u041f\u0440\u0438\u043c\u0435\u0440 \u0443\u0432\u0435\u0434\u043e\u043c\u043b\u0435\u043d\u0438\u044f";
    @NotNull
    private static AnimationUtil previewAnimation;
    private static final long CONTENT_ANIMATION_MS = 220L;
    @NotNull
    public static final RainMainMenuScreen$Link INSTANCE;
    @NotNull
    private static final Color disabledColor;
    @NotNull
    private static final Color dividerColor;

    private final float animationProgress(NotifyModule.NotificationEntry notification, long now) {
        float f;
        long enterElapsed = now - notification.getShownAt();
        if (enterElapsed < 0L) {
            f = 0.0f;
        } else if (enterElapsed < 360L) {
            f = \u0628\u0641.INSTANCE.standard((float)enterElapsed / 360.0f);
        } else if (now < notification.getHideAt()) {
            f = 1.0f;
        } else if (now < notification.getHideAt() + 260L) {
            long exitElapsed = now - notification.getHideAt();
            f = 1.0f - \u0628\u0641.INSTANCE.standardAccelerate((float)exitElapsed / 260.0f);
        } else {
            f = 0.0f;
        }
        return f;
    }

    private final String compactText(String value, int maximumLength) {
        CharSequence charSequence = value;
        Regex regex = new Regex("\\s+");
        String string = " ";
        String normalized = ((Object)StringsKt.trim((CharSequence)regex.replace(charSequence, string))).toString();
        if (normalized.length() <= maximumLength) {
            return normalized;
        }
        return ((Object)StringsKt.trimEnd((CharSequence)StringsKt.take(normalized, RangesKt.coerceAtLeast(maximumLength + -1, 1)))).toString() + "\u2026";
    }

    private final Color remoteLevelColor(String level) {
        String string = level.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(string, "toLowerCase(...)");
        return switch (string) {
            case "success" -> new Color(85, 255, 125);
            case "warning" -> new Color(255, 190, 70);
            case "error" -> new Color(255, 90, 90);
            default -> new Color(100, 180, 255);
        };
    }

    private final void drawMessageSegments(NotifyModule.MessageNotification notification, List<NotifyModule.MessageSegment> segments, float x, float y, float size, float visibility) {
        float segmentX = 0.0f;
        segmentX = x;
        Iterable $this$forEach$iv = segments;
        boolean $i$f$forEach = false;
        for (Object element$iv : $this$forEach$iv) {
            Color color;
            NotifyModule.MessageSegment segment = (NotifyModule.MessageSegment)element$iv;
            boolean bl = false;
            if (segment.isAction()) {
                color = INSTANCE.remoteActionColor(notification.getActionHovered());
            } else {
                color = segment.getColor();
                if (color == null) {
                    color = \u0637\u063a.INSTANCE.getTITLE_COLOR();
                }
            }
            Color segmentColor = color;
            \u0631\u064e.INSTANCE.getGS_MEDIUM().priority(ClientRenderPipeline.HUD_TEXT).size(size).color(INSTANCE.withAlpha(segmentColor, visibility)).drawText(segment.getText(), segmentX, y);
            segmentX += Font.getWidth$default(\u0631\u064e.INSTANCE.getGS_MEDIUM(), segment.getText(), size, 0.0f, 4, null);
        }
    }

    private final float renderNotification(NotifyModule.NotificationEntry notification, float progress, float y) {
        float f;
        NotifyModule.NotificationEntry notificationEntry = notification;
        if (notificationEntry instanceof NotifyModule.ModuleStateNotification) {
            f = this.renderModuleStateNotification((NotifyModule.ModuleStateNotification)notification, progress, y);
        } else if (notificationEntry instanceof NotifyModule.MessageNotification) {
            f = RainMainMenuScreen$Link.renderMessageNotification$default(this, (NotifyModule.MessageNotification)notification, progress, y, 0.0f, 8, null);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return f;
    }

    private static final boolean renderRemoteNotifications$lambda$0(long $now, NotifyModule.MessageNotification it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return $now >= it.getHideAt() + 260L;
    }

    @Override
    public void onDisable() {
        notifications.clear();
        previewAnimation = new AnimationUtil(0.0f);
        draggable.setWidth(0.0f);
        draggable.setHeight(0.0f);
    }

    private final void sendChatFallback(List<NotifyModule.MessageSegment> segments) {
        MutableText mutableText = Text.empty();
        Intrinsics.checkNotNullExpressionValue(mutableText, "empty(...)");
        MutableText message = mutableText;
        Iterable $this$forEach$iv = segments;
        boolean $i$f$forEach = false;
        for (Object element$iv : $this$forEach$iv) {
            MutableText part;
            NotifyModule.MessageSegment segment = (NotifyModule.MessageSegment)element$iv;
            boolean bl = false;
            Intrinsics.checkNotNullExpressionValue(Text.literal((String)segment.getText()), "literal(...)");
            if (segment.getColor() != null) {
                Color color;
                boolean bl2 = false;
                part.setStyle(Style.EMPTY.withColor(TextColor.fromRgb((int)(color.getRGB() & 0xFFFFFF))));
            }
            message.append((Text)part);
        }
        \u062f\u0625.INSTANCE.sendClientMessage((Text)message);
    }

    static /* synthetic */ float renderMessageNotification$default(RainMainMenuScreen$Link rainMainMenuScreen$Link, NotifyModule.MessageNotification messageNotification, float f, float f2, float f3, int n, Object object) {
        if ((n & 8) != 0) {
            f3 = (float)\u0636\u0643.getMc().getWindow().getScaledWidth() / 2.0f;
        }
        return rainMainMenuScreen$Link.renderMessageNotification(messageNotification, f, f2, f3);
    }

    /*
     * WARNING - void declaration
     */
    public final void showMessage(@NotNull Module module, @NotNull String icon, @NotNull List<NotifyModule.MessageSegment> segments) {
        Object v2;
        long now;
        block13: {
            block15: {
                block14: {
                    boolean bl;
                    block12: {
                        Intrinsics.checkNotNullParameter(module, "module");
                        Intrinsics.checkNotNullParameter(icon, "icon");
                        Intrinsics.checkNotNullParameter(segments, "segments");
                        if (segments.isEmpty()) break block14;
                        Iterable $this$all$iv = segments;
                        boolean $i$f$all = false;
                        if ($this$all$iv instanceof Collection && ((Collection)$this$all$iv).isEmpty()) {
                            bl = true;
                        } else {
                            for (Object element$iv : $this$all$iv) {
                                NotifyModule.MessageSegment it = (NotifyModule.MessageSegment)element$iv;
                                boolean bl2 = false;
                                if (((CharSequence)it.getText()).length() == 0) continue;
                                bl = false;
                                break block12;
                            }
                            bl = true;
                        }
                    }
                    if (!bl) break block15;
                }
                return;
            }
            if (!this.isEnabled()) {
                this.sendChatFallback(segments);
                return;
            }
            now = System.currentTimeMillis();
            Iterable $this$filterIsInstance$iv = CollectionsKt.asReversedMutable(notifications);
            boolean $i$f$filterIsInstance = false;
            Iterable $this$filterIsInstanceTo$iv$iv = $this$filterIsInstance$iv;
            Collection destination$iv$iv = new ArrayList();
            boolean $i$f$filterIsInstanceTo = false;
            for (Object element$iv$iv : $this$filterIsInstanceTo$iv$iv) {
                void var13_18;
                if (!(element$iv$iv instanceof NotifyModule.MessageNotification)) continue;
                destination$iv$iv.add(var13_18);
            }
            Iterable $this$firstOrNull$iv = (List)destination$iv$iv;
            boolean $i$f$firstOrNull = false;
            for (Object element$iv : $this$firstOrNull$iv) {
                void var10_13;
                NotifyModule.MessageNotification it = (NotifyModule.MessageNotification)element$iv;
                boolean bl = false;
                boolean bl3 = Intrinsics.areEqual(it.getModuleName(), module.getName()) && now < it.getHideAt() + 260L;
                if (!bl3) continue;
                v2 = var10_13;
                break block13;
            }
            v2 = null;
        }
        NotifyModule.MessageNotification existing = v2;
        if (existing != null) {
            if (!Intrinsics.areEqual(existing.getSegments(), segments)) {
                existing.setPreviousSegments(existing.getSegments());
                existing.setSegments(CollectionsKt.toList((Iterable)segments));
                existing.setTextTransitionStartedAt(now);
            }
            this.refreshNotification(existing, now);
            return;
        }
        ((Collection)notifications).add(new NotifyModule.MessageNotification(module.getName(), icon, CollectionsKt.toList((Iterable)segments), CollectionsKt.toList((Iterable)segments), now, now + 360L + 2000L, 0L, null, null, 448, null));
    }

    private RainMainMenuScreen$Link() {
        super("Notify", \u0638\u0646.getHUD(), "\u041e\u0442\u043e\u0431\u0440\u0430\u0436\u0435\u043d\u0438\u0435 \u0443\u0432\u0435\u0434\u043e\u043c\u043b\u0435\u043d\u0438\u0439 \u043a\u043b\u0438\u0435\u043d\u0442\u0430");
    }

    public final void showMessage(@NotNull Module module, @NotNull String text) {
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(text, "text");
        this.showMessage(module, module.getCategory().getIcon(), CollectionsKt.listOf(new NotifyModule.MessageSegment(text, null, false, 6, null)));
    }

    private final void resolveDefaultPosition() {
        if (defaultPositionResolved) {
            return;
        }
        if (!draggable.getHasStoredPosition()) {
            draggable.snapTo(0.0f, (float)\u0636\u0643.getMc().getWindow().getScaledHeight() / 2.0f + \u0637\u063a.INSTANCE.scaled(20.0f));
        }
        defaultPositionResolved = true;
    }

    /*
     * WARNING - void declaration
     */
    private final void renderOverlay(boolean showPreview) {
        void var6_6;
        this.resolveDefaultPosition();
        \u0628\u0641 \u0628\u06412 = \u0628\u0641.INSTANCE;
        float previewProgress = previewAnimation.animate(showPreview && \u0636\u0643.getMc().currentScreen instanceof ChatScreen ? 1.0f : 0.0f, 80.0f, new \u062c\u0633(\u0628\u06412));
        if (showPreview && previewProgress > 0.01f) {
            this.renderPreview(draggable.getY(), previewProgress);
            return;
        }
        long now = System.currentTimeMillis();
        CollectionsKt.removeAll(notifications, arg_0 -> RainMainMenuScreen$Link.renderOverlay$lambda$0(now, arg_0));
        if (notifications.isEmpty()) {
            draggable.setWidth(0.0f);
            draggable.setHeight(0.0f);
            return;
        }
        float height = this.notificationHeight();
        float gap = \u0637\u063a.INSTANCE.scaled(4.0f);
        float enterOffset = \u0637\u063a.INSTANCE.scaled(15.0f);
        float maxWidth = 0.0f;
        Iterable $this$forEachIndexed$iv = notifications;
        boolean $i$f$forEachIndexed = false;
        int index$iv = 0;
        for (Object item$iv : $this$forEachIndexed$iv) {
            int n;
            if ((n = index$iv++) < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            NotifyModule.NotificationEntry notification = (NotifyModule.NotificationEntry)item$iv;
            int index = n;
            boolean bl = false;
            float progress = INSTANCE.animationProgress(notification, now);
            float targetOffset = (float)index * (height + gap);
            float stackOffset = INSTANCE.animatedStackOffset(notification, targetOffset);
            float y = draggable.getY() + stackOffset + enterOffset * (1.0f - progress);
            maxWidth = Math.max(maxWidth, INSTANCE.renderNotification(notification, progress, y));
        }
        draggable.setWidth(maxWidth);
        draggable.setHeight((float)notifications.size() * height + (float)(notifications.size() - 1) * var6_6);
    }

    static {
        INSTANCE = new RainMainMenuScreen$Link();
        draggable = INSTANCE.draggable(INSTANCE.getName(), 0.0f, 0.0f).lockHorizontalCenter();
        dividerColor = new Color(255, 255, 255, 100);
        enabledColor = new Color(85, 255, 85);
        disabledColor = new Color(255, 85, 85);
        notifications = new ArrayList();
        remoteNotifications = new ArrayList();
        previewAnimation = new AnimationUtil(0.0f);
    }

    /*
     * WARNING - void declaration
     */
    private final Pair<String, String> validatedRemoteAction(String label, String url) {
        void var3_9;
        Object object;
        String string;
        block5: {
            block4: {
                CharSequence charSequence;
                CharSequence charSequence2;
                if (label == null || (string = ((Regex)(object = new Regex("\\s+"))).replace(charSequence2 = (CharSequence)label, (String)(charSequence = " "))) == null) break block4;
                charSequence2 = ((Object)StringsKt.trim((CharSequence)string)).toString();
                if (charSequence2 == null) break block4;
                CharSequence it = charSequence = charSequence2;
                boolean bl = false;
                object = ((CharSequence)it).length() > 0 && ((String)it).length() <= 32 ? charSequence : null;
                if (object != null) break block5;
            }
            return null;
        }
        Object normalizedLabel = object;
        URI uRI = this.validatedRemoteUri(url);
        if (uRI == null) {
            return null;
        }
        URI uri = uRI;
        return TuplesKt.to(var3_9, ((URI)((Object)string)).toASCIIString());
    }

    private final Color withAlpha(Color color, float factor) {
        return \u0628\u062d.INSTANCE.multiplyAlpha(color, RangesKt.coerceIn(factor, 0.0f, 1.0f));
    }

    private static final boolean showRemoteNotification$lambda$1(long $now, NotifyModule.MessageNotification it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return $now >= it.getHideAt() + 260L;
    }

    @Commando
    public final void onOverlayRender(@NotNull OverlayRenderEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.renderOverlay(true);
    }

    private final float animatedStackOffset(NotifyModule.NotificationEntry notification, float target) {
        if (!notification.getStackOffsetInitialized()) {
            notification.getStackOffsetAnimation().snap(target);
            notification.setStackOffsetInitialized(true);
        } else if (Math.abs(notification.getStackOffsetAnimation().getToValue() - (double)target) > 0.01) {
            notification.getStackOffsetAnimation().update();
            notification.getStackOffsetAnimation().run((double)target, 260L, Easing.SINE_OUT);
        }
        notification.getStackOffsetAnimation().update();
        return notification.getStackOffsetAnimation().get();
    }

    private final String statusText(boolean state) {
        return state ? "\u0432\u043a\u043b\u044e\u0447\u0435\u043d\u0430" : "\u043e\u0442\u043a\u043b\u044e\u0447\u0435\u043d\u0430";
    }

    private static final boolean renderOverlay$lambda$0(long $now, NotifyModule.NotificationEntry it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return $now >= it.getHideAt() + 260L;
    }

    /*
     * Unable to fully structure code
     */
    public final boolean onRemoteNotificationClick(int mouseX, int mouseY, int button) {
        block8: {
            block10: {
                block9: {
                    if (button != 0) break block9;
                    if (\u0636\u0643.getMc().currentScreen instanceof ChatScreen) break block10;
                }
                return false;
            }
            now = System.currentTimeMillis();
            $this$firstOrNull$iv = CollectionsKt.asReversedMutable(RainMainMenuScreen$Link.remoteNotifications);
            $i$f$firstOrNull = false;
            for (T element$iv : $this$firstOrNull$iv) {
                it = (NotifyModule.MessageNotification)element$iv;
                $i$a$-firstOrNull-NotifyModule$onRemoteNotificationClick$notification$1 = false;
                if (now >= it.getHideAt() || it.getActionUrl() == null) ** GOTO lbl-1000
                if (!(it.getActionWidth() > 0.0f) || !((float)mouseX >= it.getActionX()) || !((float)mouseX <= it.getActionX() + it.getActionWidth())) ** GOTO lbl-1000
                if (!((float)mouseY >= it.getActionY())) ** GOTO lbl-1000
                if ((float)mouseY <= it.getActionY() + it.getActionHeight()) {
                    v0 = true;
                } else lbl-1000:
                // 4 sources

                {
                    v0 = false;
                }
                if (!v0) continue;
                v1 = var11_8;
                break block8;
            }
            v1 = null;
        }
        v2 = v1;
        if (v2 == null) {
            return false;
        }
        notification = v2;
        v3 = this.validatedRemoteUri(notification.getActionUrl());
        if (v3 == null) {
            return false;
        }
        uri = v3;
        \u0636\u0643.getMc().execute((Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, onRemoteNotificationClick$lambda$1(java.net.URI ), ()V)((URI)var7_12));
        return true;
    }

    private final void updateRemoteActionState(NotifyModule.MessageNotification notification, float textX, float textY, float textSize, float visibility) {
        String label = notification.getActionLabel();
        if (label == null || notification.getActionUrl() == null) {
            notification.clearActionBounds();
            return;
        }
        float actionWidth = Font.getWidth$default(\u0631\u064e.INSTANCE.getGS_MEDIUM(), label, textSize, 0.0f, 4, null);
        float totalWidth = this.messageWidth(notification.getSegments(), textSize);
        notification.setActionX(textX + totalWidth - actionWidth);
        notification.setActionY(textY);
        notification.setActionWidth(actionWidth);
        notification.setActionHeight(\u0631\u064e.INSTANCE.getGS_MEDIUM().getMetrics().getLineHeight() * textSize);
        long now = System.currentTimeMillis();
        float mouseX = (float)(\u0636\u0643.getMc().mouse.getX() / (double)\u0636\u0643.getMc().getWindow().getScaleFactor());
        float mouseY = (float)(\u0636\u0643.getMc().mouse.getY() / (double)\u0636\u0643.getMc().getWindow().getScaleFactor());
        notification.setActionHovered(\u0636\u0643.getMc().currentScreen instanceof ChatScreen && visibility > 0.4f && now < notification.getHideAt() && mouseX >= notification.getActionX() && mouseX <= notification.getActionX() + notification.getActionWidth() && mouseY >= notification.getActionY() && mouseY <= notification.getActionY() + notification.getActionHeight());
        if (notification.getActionHovered()) {
            notification.setHideAt(Math.max(notification.getHideAt(), now + 500L));
        }
    }

    /*
     * WARNING - void declaration
     */
    private final void renderPreview(float y, float visibility) {
        void var5_5;
        float textSize = \u0637\u063a.INSTANCE.scaled(7.5f);
        float iconSize = \u0637\u063a.INSTANCE.scaled(7.0f);
        float height = \u0637\u063a.INSTANCE.headerTextSize() + \u0637\u063a.INSTANCE.margin() * 2.2f;
        float horizontalPadding = \u0637\u063a.INSTANCE.scaled(8.0f);
        float dividerGap = \u0637\u063a.INSTANCE.scaled(5.0f);
        float dividerWidth = \u0637\u063a.INSTANCE.scaled(1.2f);
        float iconWidth = Font.getWidth$default(\u0631\u064e.INSTANCE.getICON(), TIME_ICON, iconSize, 0.0f, 4, null);
        float textWidth = Font.getWidth$default(\u0631\u064e.INSTANCE.getGS_MEDIUM(), PREVIEW_TEXT, textSize, 0.0f, 4, null);
        float width = horizontalPadding * 2.0f + iconWidth + dividerGap * 2.0f + dividerWidth + textWidth;
        float x = ((float)\u0636\u0643.getMc().getWindow().getScaledWidth() - width) / 2.0f;
        float corner = \u0637\u063a.INSTANCE.scaled(6.0f);
        \u0630\u0631.INSTANCE.getBLURRED_RECT().priority(ClientRenderPipeline.HUD_RECT).color(this.withAlpha(\u0637\u063a.INSTANCE.getPANEL_COLOR(), visibility)).mix(0.9f).round(corner).draw(x, y, width, height);
        float iconY = y + (height - \u0631\u064e.INSTANCE.getICON().getMetrics().getLineHeight() * iconSize) / 2.0f;
        \u0631\u064e.INSTANCE.getICON().priority(ClientRenderPipeline.HUD_TEXT).size(iconSize).color(this.withAlpha(\u0637\u063a.INSTANCE.getTITLE_COLOR(), visibility)).drawText(TIME_ICON, x + horizontalPadding, iconY);
        float dividerX = x + horizontalPadding + iconWidth + dividerGap;
        float dividerHeight = height / 3.5f;
        \u0630\u0631.INSTANCE.getBLURRED_RECT().priority(ClientRenderPipeline.HUD_RECT).color(this.withAlpha(dividerColor, visibility)).mix(0.9f).round(0.0f).draw(dividerX, y + (height - dividerHeight) / 2.0f, dividerWidth, dividerHeight);
        float textY = y + (height - \u0631\u064e.INSTANCE.getGS_MEDIUM().getMetrics().getLineHeight() * textSize) / 2.0f;
        \u0631\u064e.INSTANCE.getGS_MEDIUM().priority(ClientRenderPipeline.HUD_TEXT).size(textSize).color(this.withAlpha(\u0637\u063a.INSTANCE.getTITLE_COLOR(), visibility)).drawText(PREVIEW_TEXT, dividerX + dividerWidth + dividerGap, textY);
        draggable.setWidth(width);
        draggable.setHeight((float)var5_5);
    }

    private final Color stateColor(boolean state, float alpha) {
        return \u0628\u062d.INSTANCE.multiplyAlpha(state ? enabledColor : disabledColor, RangesKt.coerceIn(alpha, 0.0f, 1.0f));
    }

    /*
     * WARNING - void declaration
     */
    private final float renderMessageNotification(NotifyModule.MessageNotification notification, float progress, float y, float centerX) {
        void var14_14;
        void var2_2;
        void var5_5;
        float textSize = \u0637\u063a.INSTANCE.scaled(7.5f);
        float iconSize = \u0637\u063a.INSTANCE.scaled(7.0f);
        float height = this.notificationHeight();
        float horizontalPadding = \u0637\u063a.INSTANCE.scaled(8.0f);
        float dividerGap = \u0637\u063a.INSTANCE.scaled(5.0f);
        float dividerWidth = \u0637\u063a.INSTANCE.scaled(1.2f);
        float iconWidth = Font.getWidth$default(\u0631\u064e.INSTANCE.getICON(), notification.getIcon(), iconSize, 0.0f, 4, null);
        float textWidth = this.messageWidth(notification.getSegments(), textSize);
        float targetWidth = horizontalPadding * 2.0f + iconWidth + dividerGap * 2.0f + dividerWidth + textWidth;
        float width = this.animatedWidth(notification, targetWidth);
        float x = centerX - width / 2.0f;
        float corner = \u0637\u063a.INSTANCE.scaled(6.0f);
        \u0630\u0631.INSTANCE.getBLURRED_RECT().priority(ClientRenderPipeline.HUD_RECT).color(this.withAlpha(\u0637\u063a.INSTANCE.getPANEL_COLOR(), progress)).mix(0.9f).round(corner).draw(x, y, width, height);
        float iconY = y + (height - \u0631\u064e.INSTANCE.getICON().getMetrics().getLineHeight() * iconSize) / 2.0f;
        \u0631\u064e.INSTANCE.getICON().priority(ClientRenderPipeline.HUD_TEXT).size(iconSize).color(this.withAlpha(\u0637\u063a.INSTANCE.getTITLE_COLOR(), progress)).drawText(notification.getIcon(), x + horizontalPadding, iconY);
        float dividerX = x + horizontalPadding + iconWidth + dividerGap;
        float dividerHeight = height / 3.5f;
        \u0630\u0631.INSTANCE.getBLURRED_RECT().priority(ClientRenderPipeline.HUD_RECT).color(this.withAlpha(dividerColor, progress)).mix(0.9f).round(0.0f).draw(dividerX, y + (height - dividerHeight) / 2.0f, dividerWidth, dividerHeight);
        float textX = dividerX + dividerWidth + dividerGap;
        float textY = y + (height - \u0631\u064e.INSTANCE.getGS_MEDIUM().getMetrics().getLineHeight() * textSize) / 2.0f;
        this.updateRemoteActionState(notification, textX, textY, textSize, progress);
        this.drawMessageText(notification, textX, textY, (float)var5_5, (float)var2_2);
        return (float)var14_14;
    }

    /*
     * WARNING - void declaration
     */
    public final void renderRemoteNotifications(@NotNull OverlayRenderEvent event) {
        float f;
        float f2;
        MediaPlayerInfoModule.Bounds mediaBounds;
        Intrinsics.checkNotNullParameter(event, "event");
        long now = System.currentTimeMillis();
        CollectionsKt.removeAll(remoteNotifications, arg_0 -> RainMainMenuScreen$Link.renderRemoteNotifications$lambda$0(now, arg_0));
        if (remoteNotifications.isEmpty()) {
            return;
        }
        float height = this.notificationHeight();
        float gap = \u0637\u063a.INSTANCE.scaled(4.0f);
        float travel = \u0637\u063a.INSTANCE.scaled(14.0f);
        WatermarkModule.Bounds watermarkBounds = \u062a\u0623.INSTANCE.currentBounds();
        MediaPlayerInfoModule.Bounds bounds = mediaBounds = \u0628\u0637.INSTANCE.attachedBounds();
        if (bounds != null) {
            f2 = bounds.getCenterX();
        } else {
            Float f3 = Float.valueOf(watermarkBounds.getCenterX());
            float it = ((Number)f3).floatValue();
            boolean bl = false;
            Float f4 = \u062a\u0623.INSTANCE.isEnabled() ? f3 : null;
            f2 = f4 != null ? f4.floatValue() : (float)\u0636\u0643.getMc().getWindow().getScaledWidth() / 2.0f;
        }
        float centerX = f2;
        MediaPlayerInfoModule.Bounds bounds2 = mediaBounds;
        if (bounds2 != null) {
            it = bounds2;
            boolean bl = false;
            f = ((MediaPlayerInfoModule.Bounds)it).getY() + ((MediaPlayerInfoModule.Bounds)it).getHeight();
        } else {
            it = Float.valueOf(watermarkBounds.getY() + watermarkBounds.getHeight());
            float it = ((Number)it).floatValue();
            boolean bl = false;
            Object object = \u062a\u0623.INSTANCE.isEnabled() ? it : null;
            f = object != null ? ((Float)object).floatValue() : 0.0f;
        }
        float anchorBottom = f;
        float baseY = anchorBottom + \u0637\u063a.INSTANCE.scaled(5.0f);
        Iterable $this$forEachIndexed$iv = remoteNotifications;
        boolean $i$f$forEachIndexed = false;
        int index$iv = 0;
        for (Object item$iv : $this$forEachIndexed$iv) {
            void var24_28;
            void var21_25;
            int n;
            if ((n = index$iv++) < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            NotifyModule.MessageNotification notification = (NotifyModule.MessageNotification)item$iv;
            int index = n;
            boolean bl = false;
            float progress = INSTANCE.animationProgress(notification, now);
            float targetOffset = (float)index * (height + gap);
            float stackOffset = INSTANCE.animatedStackOffset(notification, targetOffset);
            float y = baseY + stackOffset - travel * (1.0f - progress);
            INSTANCE.renderMessageNotification(notification, (float)var21_25, (float)var24_28, centerX);
        }
    }

    /*
     * WARNING - void declaration
     */
    private final float messageTransitionProgress(NotifyModule.MessageNotification notification) {
        void var4_3;
        if (notification.getTextTransitionStartedAt() == 0L) {
            return 1.0f;
        }
        long elapsed = System.currentTimeMillis() - notification.getTextTransitionStartedAt();
        float linear = RangesKt.coerceIn((float)elapsed / 220.0f, 0.0f, 1.0f);
        if (linear >= 1.0f) {
            notification.setTextTransitionStartedAt(0L);
            notification.setPreviousSegments(notification.getSegments());
            return 1.0f;
        }
        return \u0628\u0641.INSTANCE.standard((float)var4_3);
    }

    public static /* synthetic */ void showRemoteNotification$default(RainMainMenuScreen$Link rainMainMenuScreen$Link, long l, String string, String string2, String string3, String string4, String string5, int n, Object object) {
        if ((n & 0x10) != 0) {
            string4 = null;
        }
        if ((n & 0x20) != 0) {
            string5 = null;
        }
        rainMainMenuScreen$Link.showRemoteNotification(l, string, string2, string3, string4, string5);
    }

    private final float notificationHeight() {
        return \u0637\u063a.INSTANCE.headerTextSize() + \u0637\u063a.INSTANCE.margin() * 2.2f;
    }

    private static final void onRemoteNotificationClick$lambda$1(URI $uri) {
        Screen screen = \u0636\u0643.getMc().currentScreen;
        if (screen == null) {
            return;
        }
        Screen parent = screen;
        ConfirmLinkScreen.open((Screen)parent, (URI)$uri);
    }

    private final void refreshNotification(NotifyModule.NotificationEntry notification, long now) {
        if (now >= notification.getHideAt()) {
            notification.setShownAt(now - 360L);
        }
        notification.setHideAt(Math.max(now + 2000L, notification.getShownAt() + 360L + 2000L));
    }

    private final Color remoteActionColor(boolean hovered) {
        return hovered ? new Color(150, 215, 255) : new Color(100, 180, 255);
    }

    private final void drawStatus(NotifyModule.ModuleStateNotification notification, float x, float y, float size, float visibility) {
        float transition = this.statusTransitionProgress(notification);
        float shift = \u0637\u063a.INSTANCE.scaled(2.0f);
        if (transition < 0.999f) {
            \u0631\u064e.INSTANCE.getGS_MEDIUM().priority(ClientRenderPipeline.HUD_TEXT).size(size).color(this.stateColor(notification.getPreviousEnabled(), visibility * (1.0f - transition))).drawText(this.statusText(notification.getPreviousEnabled()), x, y - shift * transition);
        }
        \u0631\u064e.INSTANCE.getGS_MEDIUM().priority(ClientRenderPipeline.HUD_TEXT).size(size).color(this.stateColor(notification.getEnabled(), visibility * transition)).drawText(this.statusText(notification.getEnabled()), x, y + shift * (1.0f - transition));
    }

    private final float animatedWidth(NotifyModule.NotificationEntry notification, float target) {
        if (!notification.getWidthInitialized()) {
            notification.getWidthAnimation().snap(target);
            notification.setWidthInitialized(true);
        } else if (Math.abs(notification.getWidthAnimation().getToValue() - (double)target) > 0.01) {
            notification.getWidthAnimation().update();
            notification.getWidthAnimation().run((double)target, 220L, Easing.SINE_OUT);
        }
        notification.getWidthAnimation().update();
        return RangesKt.coerceAtLeast(notification.getWidthAnimation().get(), \u0637\u063a.INSTANCE.scaled(1.0f));
    }

    /*
     * WARNING - void declaration
     */
    private final float renderModuleStateNotification(NotifyModule.ModuleStateNotification notification, float progress, float y) {
        void var17_17;
        void var2_2;
        void var4_4;
        void var24_24;
        void var14_14;
        void var25_25;
        void var1_1;
        float textSize = \u0637\u063a.INSTANCE.scaled(7.5f);
        float height = this.notificationHeight();
        float horizontalPadding = \u0637\u063a.INSTANCE.scaled(8.0f);
        float dividerGap = \u0637\u063a.INSTANCE.scaled(5.0f);
        float dividerWidth = \u0637\u063a.INSTANCE.scaled(1.2f);
        float toggleHeight = height * 0.38f;
        float toggleWidth = toggleHeight * 1.7f;
        float toggleContainerHeight = toggleHeight / 0.55f;
        String prefix = "\u0424\u0443\u043d\u043a\u0446\u0438\u044f " + notification.getModuleName() + " ";
        String status = this.statusText(notification.getEnabled());
        float prefixWidth = Font.getWidth$default(\u0631\u064e.INSTANCE.getGS_MEDIUM(), prefix, textSize, 0.0f, 4, null);
        float statusWidth = Font.getWidth$default(\u0631\u064e.INSTANCE.getGS_MEDIUM(), status, textSize, 0.0f, 4, null);
        float targetWidth = horizontalPadding * 2.0f + toggleWidth + dividerGap * 2.0f + dividerWidth + prefixWidth + statusWidth;
        float width = this.animatedWidth(notification, targetWidth);
        float x = ((float)\u0636\u0643.getMc().getWindow().getScaledWidth() - width) / 2.0f;
        float corner = \u0637\u063a.INSTANCE.scaled(6.0f);
        Color panelColor = this.withAlpha(\u0637\u063a.INSTANCE.getPANEL_COLOR(), progress);
        Color textColor = this.withAlpha(\u0637\u063a.INSTANCE.getTITLE_COLOR(), progress);
        \u0630\u0631.INSTANCE.getBLURRED_RECT().priority(ClientRenderPipeline.HUD_RECT).color(panelColor).mix(0.9f).round(corner).draw(x, y, width, height);
        notification.getToggleAnimation().update();
        \u0633\u0623.INSTANCE.render(x + horizontalPadding, y + (height - toggleContainerHeight) / 2.0f, toggleWidth, toggleContainerHeight, 0.0f, RangesKt.coerceIn(notification.getToggleAnimation().get(), 0.0f, 1.0f), progress, 1.0f, ClientRenderPipeline.HUD_RECT);
        float dividerX = x + horizontalPadding + toggleWidth + dividerGap;
        float dividerHeight = height / 3.5f;
        \u0630\u0631.INSTANCE.getBLURRED_RECT().priority(ClientRenderPipeline.HUD_RECT).color(this.withAlpha(dividerColor, progress)).mix(0.9f).round(0.0f).draw(dividerX, y + (height - dividerHeight) / 2.0f, dividerWidth, dividerHeight);
        float textY = y + (height - \u0631\u064e.INSTANCE.getGS_MEDIUM().getMetrics().getLineHeight() * textSize) / 2.0f;
        float textX = dividerX + dividerWidth + dividerGap;
        \u0631\u064e.INSTANCE.getGS_MEDIUM().priority(ClientRenderPipeline.HUD_TEXT).size(textSize).color(textColor).drawText(prefix, textX, textY);
        this.drawStatus((NotifyModule.ModuleStateNotification)var1_1, (float)(var25_25 + var14_14), (float)var24_24, (float)var4_4, (float)var2_2);
        return (float)var17_17;
    }

    /*
     * WARNING - void declaration
     */
    private final float statusTransitionProgress(NotifyModule.ModuleStateNotification notification) {
        void var4_3;
        if (notification.getStatusTransitionStartedAt() == 0L) {
            return 1.0f;
        }
        long elapsed = System.currentTimeMillis() - notification.getStatusTransitionStartedAt();
        float linear = RangesKt.coerceIn((float)elapsed / 220.0f, 0.0f, 1.0f);
        if (linear >= 1.0f) {
            notification.setStatusTransitionStartedAt(0L);
            notification.setPreviousEnabled(notification.getEnabled());
            return 1.0f;
        }
        return \u0628\u0641.INSTANCE.standard((float)var4_3);
    }

    private final void drawMessageText(NotifyModule.MessageNotification notification, float x, float y, float size, float visibility) {
        float transition = this.messageTransitionProgress(notification);
        float shift = \u0637\u063a.INSTANCE.scaled(2.0f);
        if (transition < 0.999f) {
            this.drawMessageSegments(notification, notification.getPreviousSegments(), x, y - shift * transition, size, visibility * (1.0f - transition));
        }
        this.drawMessageSegments(notification, notification.getSegments(), x, y + shift * (1.0f - transition), size, visibility * transition);
    }

    private final URI validatedRemoteUri(String url) {
        Object object;
        block9: {
            block8: {
                if (url == null) break block8;
                if (url.length() <= 2048) break block9;
            }
            return null;
        }
        Object object2 = this;
        try {
            URI uRI;
            RainMainMenuScreen$Link $this$validatedRemoteUri_u24lambda_u240 = object2;
            boolean bl = false;
            URI uri = uRI = URI.create(url);
            boolean bl2 = false;
            if (!StringsKt.equals(uri.getScheme(), "https", true)) {
                String string = "Failed requirement.";
                throw new IllegalArgumentException(string.toString());
            }
            CharSequence charSequence = uri.getHost();
            boolean bl3 = charSequence == null || StringsKt.isBlank(charSequence);
            if (!(!bl3)) {
                String string = "Failed requirement.";
                throw new IllegalArgumentException(string.toString());
            }
            if (!(uri.getUserInfo() == null)) {
                String string = "Failed requirement.";
                throw new IllegalArgumentException(string.toString());
            }
            object = Result.constructor-impl(uRI);
        }
        catch (Throwable throwable) {
            object = Result.constructor-impl(ResultKt.createFailure(throwable));
        }
        object2 = object;
        return (URI)(Result.isFailure-impl(object2) ? null : object2);
    }

    private final float messageWidth(List<NotifyModule.MessageSegment> segments, float size) {
        Iterable iterable = segments;
        double d = 0.0;
        for (Object t : iterable) {
            NotifyModule.MessageSegment it = (NotifyModule.MessageSegment)t;
            double d2 = d;
            boolean bl = false;
            double d3 = Font.getWidth$default(\u0631\u064e.INSTANCE.getGS_MEDIUM(), it.getText(), size, 0.0f, 4, null);
            d = d2 + d3;
        }
        return (float)d;
    }

    /*
     * WARNING - void declaration
     */
    public final void showModuleState(@NotNull Module module, boolean state) {
        void var2_2;
        kotakbaz.rain.client.draggable.animation.AnimationUtil animationUtil;
        Object v1;
        Iterable iterable;
        long now;
        block4: {
            Iterator $this$filterIsInstanceTo$iv$iv;
            void $this$filterIsInstance$iv;
            Intrinsics.checkNotNullParameter(module, "module");
            if (!this.isEnabled()) {
                return;
            }
            now = System.currentTimeMillis();
            iterable = CollectionsKt.asReversedMutable(notifications);
            boolean $i$f$filterIsInstance = false;
            void var8_7 = $this$filterIsInstance$iv;
            Collection destination$iv$iv = new ArrayList();
            boolean $i$f$filterIsInstanceTo = false;
            Iterator iterator2 = $this$filterIsInstanceTo$iv$iv.iterator();
            while (iterator2.hasNext()) {
                Object element$iv$iv = iterator2.next();
                if (!(element$iv$iv instanceof NotifyModule.ModuleStateNotification)) continue;
                destination$iv$iv.add(element$iv$iv);
            }
            Iterable $this$firstOrNull$iv = (List)destination$iv$iv;
            boolean $i$f$firstOrNull = false;
            for (Object element$iv : $this$firstOrNull$iv) {
                NotifyModule.ModuleStateNotification it = (NotifyModule.ModuleStateNotification)element$iv;
                boolean bl = false;
                boolean bl2 = Intrinsics.areEqual(it.getModuleName(), module.getName()) && now < it.getHideAt() + 260L;
                if (!bl2) continue;
                v1 = element$iv;
                break block4;
            }
            v1 = null;
        }
        NotifyModule.ModuleStateNotification existing = v1;
        if (existing != null) {
            existing.getToggleAnimation().update();
            existing.setPreviousEnabled(existing.getEnabled());
            existing.setEnabled(state);
            existing.setStatusTransitionStartedAt(now);
            this.refreshNotification(existing, now);
            existing.getToggleAnimation().run(state ? 1.0 : 0.0, 220L, Easing.SINE_OUT);
            return;
        }
        kotakbaz.rain.client.draggable.animation.AnimationUtil $this$showModuleState_u24lambda_u241 = animationUtil = new kotakbaz.rain.client.draggable.animation.AnimationUtil();
        boolean bl = false;
        $this$showModuleState_u24lambda_u241.snap(state ? 0.0 : 1.0);
        $this$showModuleState_u24lambda_u241.run(state ? 1.0 : 0.0, 220L, Easing.SINE_OUT);
        kotakbaz.rain.client.draggable.animation.AnimationUtil toggleAnimation = animationUtil;
        ((Collection)notifications).add(new NotifyModule.ModuleStateNotification(module.getName(), state, now, now + 360L + 2000L, (kotakbaz.rain.client.draggable.animation.AnimationUtil)((Object)iterable), (boolean)var2_2, 0L, 64, null));
    }

    /*
     * WARNING - void declaration
     */
    public final void showRemoteNotification(long id, @NotNull String title, @NotNull String message, @NotNull String level, @Nullable String actionLabel, @Nullable String actionUrl) {
        void var9_8;
        List<NotifyModule.MessageSegment> list;
        String normalizedMessage;
        Pair<String, String> action;
        String normalizedTitle;
        block6: {
            block5: {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(message, "message");
                Intrinsics.checkNotNullParameter(level, "level");
                normalizedTitle = this.compactText(title, 28);
                action = this.validatedRemoteAction(actionLabel, actionUrl);
                Pair<String, String> pair = action;
                int actionLength = pair != null && (pair = pair.getFirst()) != null ? ((String)((Object)pair)).length() + 3 : 0;
                int messageLimit = RangesKt.coerceAtLeast(96 - normalizedTitle.length() - actionLength, 32);
                normalizedMessage = this.compactText(message, messageLimit);
                if (((CharSequence)normalizedTitle).length() == 0) break block5;
                boolean bl = ((CharSequence)normalizedMessage).length() == 0;
                if (!bl) break block6;
            }
            return;
        }
        List<NotifyModule.MessageSegment> $this$showRemoteNotification_u24lambda_u240 = list = CollectionsKt.createListBuilder();
        boolean bl = false;
        $this$showRemoteNotification_u24lambda_u240.add(new NotifyModule.MessageSegment(normalizedTitle, INSTANCE.remoteLevelColor(level), false, 4, null));
        $this$showRemoteNotification_u24lambda_u240.add(new NotifyModule.MessageSegment(": ", null, false, 6, null));
        $this$showRemoteNotification_u24lambda_u240.add(new NotifyModule.MessageSegment(normalizedMessage, null, false, 6, null));
        if (action != null) {
            $this$showRemoteNotification_u24lambda_u240.add(new NotifyModule.MessageSegment(" \u00b7 ", null, false, 6, null));
            $this$showRemoteNotification_u24lambda_u240.add(new NotifyModule.MessageSegment(action.getFirst(), null, true, 2, null));
        }
        List segments = CollectionsKt.build(list);
        \u0636\u0643.getMc().getSoundManager().play((SoundInstance)PositionedSoundInstance.ui((SoundEvent)SoundEvents.ENTITY_EXPERIENCE_ORB_PICKUP, (float)1.0f, (float)1.0f));
        long now = System.currentTimeMillis();
        CollectionsKt.removeAll(remoteNotifications, arg_0 -> RainMainMenuScreen$Link.showRemoteNotification$lambda$1(now, arg_0));
        while (remoteNotifications.size() >= 5) {
            remoteNotifications.removeFirst();
        }
        Pair<String, String> pair = action;
        void v3 = var9_8;
        ((Collection)remoteNotifications).add(new NotifyModule.MessageNotification(REMOTE_NOTIFICATION_PREFIX + id, TIME_ICON, segments, segments, now, now + 360L + (action == null ? 6000L : 10000L), 0L, pair != null ? pair.getFirst() : null, v3 != null ? (String)v3.getSecond() : null, 64, null));
    }
}

