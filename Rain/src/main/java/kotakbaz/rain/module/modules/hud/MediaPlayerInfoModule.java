/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.module.modules.hud;

import com.mojang.blaze3d.textures.GpuTexture;
import java.awt.Color;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import kotakbaz.rain.client.draggable.animation.AnimationUtil;
import kotakbaz.rain.client.draggable.animation.Easing;
import kotakbaz.rain.client.draggable.c;
import kotakbaz.rain.client.extensions.a_0;
import kotakbaz.rain.client.util.color.ColorUtil;
import kotakbaz.rain.client.util.render.RenderUtils;
import kotakbaz.rain.client.util.render.ScissorUtil;
import kotakbaz.rain.client.util.render.display.TextureRectRenderer;
import kotakbaz.rain.client.util.render.engine.controls.ClientRenderPipeline;
import kotakbaz.rain.client.util.render.font.E;
import kotakbaz.rain.client.util.render.font.Font;
import kotakbaz.rain.event.events.OverlayRenderEvent;
import kotakbaz.rain.module.Module;
import kotakbaz.rain.module.modules.hud.F;
import kotakbaz.rain.module.modules.hud.WatermarkModule;
import kotakbaz.rain.module.modules.hud.a;
import kotakbaz.rain.module.modules.hud.b;
import kotakbaz.rain.module.modules.hud.container.HudStyle;
import kotakbaz.rain.module.modules.hud.f_0;
import kotakbaz.rain.module.modules.render.BetterHudModule;
import kotakbaz.rain.module.setting.ModeSetting;
import kotakbaz.rain.ui.menu.misc.TextScroller;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import net.minecraft.client.gui.screen.ChatScreen;
import net.minecraft.client.texture.GlTexture;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joml.Vector4f;
import sweetie.evaware.flora.api.Commando;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0002jkB\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\b\n\u0010\u0003J\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\b\u0013\u0010\u0014J/\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\b\u0019\u0010\u001aJO\u0010 \u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\b \u0010!J\u001f\u0010&\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$H\u0002\u00a2\u0006\u0004\b&\u0010'J_\u0010,\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020\u000f2\u0006\u0010*\u001a\u00020\u000f2\u0006\u0010+\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\b,\u0010-J%\u00101\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020$2\u0006\u0010/\u001a\u00020$2\u0006\u00100\u001a\u00020$\u00a2\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\b3\u00104J\u0019\u00106\u001a\u00020\u00062\b\b\u0002\u00105\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\b6\u0010\u000eJ\u000f\u00108\u001a\u000207H\u0002\u00a2\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u000207H\u0002\u00a2\u0006\u0004\b:\u00109J!\u0010=\u001a\u0002072\b\u0010;\u001a\u0004\u0018\u0001072\u0006\u0010<\u001a\u000207H\u0002\u00a2\u0006\u0004\b=\u0010>J\u000f\u0010?\u001a\u000207H\u0002\u00a2\u0006\u0004\b?\u00109J\u0017\u0010B\u001a\u0002072\u0006\u0010A\u001a\u00020@H\u0002\u00a2\u0006\u0004\bB\u0010CJ'\u0010G\u001a\u00020\u000f2\u0006\u0010E\u001a\u00020D2\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010F\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\bG\u0010HJ\u001f\u0010L\u001a\u00020I2\u0006\u0010J\u001a\u00020I2\u0006\u0010K\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\bL\u0010MJ\u000f\u0010N\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\bN\u0010OJ\u000f\u0010P\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\bP\u0010\u0003R\u0014\u0010Q\u001a\u00020@8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010S\u001a\u00020@8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bS\u0010RR\u0014\u0010T\u001a\u00020$8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010V\u001a\u00020$8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bV\u0010UR\u0014\u0010X\u001a\u00020W8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010[\u001a\u00020Z8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010^\u001a\u00020]8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010`\u001a\u00020]8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b`\u0010_R\u0014\u0010b\u001a\u00020a8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bb\u0010cR\u0016\u0010d\u001a\u00020@8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bd\u0010RR\u0018\u0010f\u001a\u0004\u0018\u00010e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bf\u0010gR\u0018\u0010h\u001a\u0004\u0018\u00010e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bh\u0010gR\u0018\u0010i\u001a\u0004\u0018\u00010e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bi\u0010g\u00a8\u0006l"}, d2={"Lkotakbaz/rain/module/modules/hud/MediaPlayerInfoModule;", "Lkotakbaz/rain/module/Module;", "<init>", "()V", "Lkotakbaz/rain/event/events/OverlayRenderEvent;", "event", "", "onOverlayRender", "(Lkotakbaz/rain/event/events/OverlayRenderEvent;)V", "onEnable", "onDisable", "", "preview", "renderHud", "(Z)V", "", "width", "height", "Lkotakbaz/rain/module/modules/hud/MediaPlayerInfoModule$HudPosition;", "resolvePosition", "(FF)Lkotakbaz/rain/module/modules/hud/MediaPlayerInfoModule$HudPosition;", "x", "y", "size", "alpha", "drawArtwork", "(FFFF)V", "barWidth", "gap", "minHeight", "maxHeight", "playing", "drawBars", "(FFFFFFFZ)V", "", "time", "", "index", "animatedEnergy", "(DI)F", "drawerHeight", "drawerOverlap", "drawerLift", "progress", "renderChatDrawer", "(FFFFFFFFFZ)V", "mouseX", "mouseY", "button", "onChatClick", "(III)Z", "currentDrawerProgress", "(Z)F", "force", "maybeRefreshTrackInfo", "", "currentTitle", "()Ljava/lang/String;", "currentArtist", "value", "fallback", "sanitize", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "remainingTimeText", "", "totalSeconds", "formatTrackTime", "(J)Ljava/lang/String;", "Lkotakbaz/rain/client/util/render/font/Font;", "font", "containerHeight", "centeredTopOffset", "(Lkotakbaz/rain/client/util/render/font/Font;FF)F", "Ljava/awt/Color;", "color", "factor", "withAlpha", "(Ljava/awt/Color;F)Ljava/awt/Color;", "tabAlpha", "()F", "clearControlBounds", "REFRESH_INTERVAL_MS", "J", "CHAT_DRAWER_ANIMATION_MILLIS", "MODE_FREE", "I", "MODE_STATIC", "Lkotakbaz/rain/client/draggable/Draggable;", "draggable", "Lkotakbaz/rain/client/draggable/Draggable;", "Lkotakbaz/rain/module/setting/ModeSetting;", "mode", "Lkotakbaz/rain/module/setting/ModeSetting;", "Lkotakbaz/rain/ui/menu/misc/TextScroller;", "titleScroller", "Lkotakbaz/rain/ui/menu/misc/TextScroller;", "artistScroller", "Lkotakbaz/rain/client/draggable/animation/AnimationUtil;", "chatDrawerAnimation", "Lkotakbaz/rain/client/draggable/animation/AnimationUtil;", "lastRefreshAt", "Lkotakbaz/rain/module/modules/hud/MediaPlayerInfoModule$ClickBounds;", "previousControlBounds", "Lkotakbaz/rain/module/modules/hud/MediaPlayerInfoModule$ClickBounds;", "playPauseControlBounds", "nextControlBounds", "HudPosition", "ClickBounds", "rain-visuals"})
public final class MediaPlayerInfoModule
extends Module {
    @NotNull
    public static final MediaPlayerInfoModule INSTANCE;
    private static final long a = 400L;
    private static final long A = 180L;
    private static final int b = 0;
    private static final int B = 1;
    @NotNull
    private static final c c;
    @NotNull
    private static final ModeSetting C;
    @NotNull
    private static final TextScroller d;
    @NotNull
    private static final TextScroller D;
    @NotNull
    private static final AnimationUtil e;
    private static long E;
    @Nullable
    private static f_0 f;
    @Nullable
    private static f_0 F;
    @Nullable
    private static f_0 g;
    private static Object[] G;
    private static Object H;
    private static Object[] i;
    private static Object[] h;
    private static Object[] I;
    public static int[] j;

    private MediaPlayerInfoModule() {
        int n2 = j[0];
        n2 += j[1];
        int n3 = j[3];
        n3 += j[4];
        int n4 = j[6];
        n4 -= j[7];
        super((String)G[n2 -= j[2]], a_0.getHUD(), (String)G[n3 -= j[5]] + (String)G[n4 += j[8]]);
    }

    @Commando
    public final void onOverlayRender(@NotNull OverlayRenderEvent event) {
        long l2 = 7717437718778297242L;
        long l3 = 961005295466465107L;
        int n2 = j[9];
        n2 += j[10];
        Intrinsics.checkNotNullParameter(event, (String)G[n2 ^= j[11]]);
        boolean bl = j[12];
        bl ^= j[13];
        int n3 = j[15];
        n3 += j[16];
        MediaPlayerInfoModule.maybeRefreshTrackInfo$default(this, bl -= j[14], n3 += j[17], null);
        int n4 = j[18];
        n4 += j[19];
        long l4 = l3;
        int n5 = j[21];
        n5 -= j[22];
        l3 = l4 ^ ((long)(kotakbaz.rain.client.extensions.b.getMc().currentScreen instanceof ChatScreen) << (n4 += j[20]) ^ l4) & -1L << (n5 -= j[23]);
        if (kotakbaz.rain.client.extensions.b.getMc().player == null) {
            int n6 = j[24];
            n6 ^= j[25];
            if ((int)(l3 >>> (n6 ^= j[26])) == 0) {
                c.setWidth(0.0f);
                c.setHeight(0.0f);
                return;
            }
        }
        int n7 = j[27];
        n7 += j[28];
        this.renderHud((boolean)(l3 >>> (n7 += j[29])));
    }

    @Override
    public void onEnable() {
        boolean bl = j[30];
        bl ^= j[31];
        this.maybeRefreshTrackInfo(bl += j[32]);
        e.snap(kotakbaz.rain.client.extensions.b.getMc().currentScreen instanceof ChatScreen ? 1.0 : 0.0);
    }

    @Override
    public void onDisable() {
        c.setWidth(0.0f);
        c.setHeight(0.0f);
        e.snap(0.0);
        this.clearControlBounds();
    }

    /*
     * Unable to fully structure code
     */
    private final void renderHud(boolean preview) {
        block20: {
            block19: {
                var49_2 = -5226173604734708417L;
                var51_3 = 6219004607341834246L;
                var53_4 = 4392198867509880233L;
                var55_5 = -6380058189737820410L;
                var57_6 = -2425458757321464477L;
                var59_7 = 1603666046314070177L;
                var61_8 = -1930666387990564909L;
                var2_9 = HudStyle.INSTANCE.margin();
                var3_10 = HudStyle.INSTANCE.scaled(111.0f);
                var4_11 = HudStyle.INSTANCE.headerTextSize() + var2_9 * 2.2f;
                var5_12 = this.tabAlpha();
                if (var5_12 <= 0.0f) {
                    this.clearControlBounds();
                    MediaPlayerInfoModule.c.setWidth(0.0f);
                    MediaPlayerInfoModule.c.setHeight(0.0f);
                    return;
                }
                var6_13 = this.resolvePosition(var3_10, var4_11);
                var7_14 = var6_13.getX();
                var8_15 = var6_13.getY();
                var9_16 = this.currentDrawerProgress(preview);
                var10_17 = HudStyle.INSTANCE.scaled(6.0f);
                var11_18 = new Vector4f(var10_17, var10_17, var10_17 * (1.0f - var9_16), var10_17 * (1.0f - var9_16));
                var12_19 = HudStyle.INSTANCE.scaled(4.0f);
                var13_20 = HudStyle.INSTANCE.scaled(2.0f);
                var14_21 = var4_11 + var12_19 + var13_20;
                var15_22 = var4_11 - var2_9 * 1.45f;
                var16_23 = HudStyle.INSTANCE.scaled(5.0f);
                var17_24 = var7_14 + var2_9 / 1.5f;
                var18_25 = var8_15 + (var4_11 - var15_22) / 2.0f;
                var19_26 = HudStyle.INSTANCE.scaled(18.0f);
                var20_27 = HudStyle.INSTANCE.scaled(1.8f);
                var21_28 = HudStyle.INSTANCE.scaled(2.0f);
                var22_29 = var15_22 - var2_9 / 2.0f;
                var23_30 = HudStyle.INSTANCE.scaled(2.2f);
                var24_31 = HudStyle.INSTANCE.scaled(6.0f);
                var25_32 = HudStyle.INSTANCE.scaled(6.0f);
                var26_33 = var17_24 + var15_22 + var16_23;
                var27_34 = var7_14 + var3_10 - var19_26 - HudStyle.INSTANCE.scaled(5.0f);
                var28_35 = RangesKt.coerceAtLeast(var27_34 - var26_33, HudStyle.INSTANCE.scaled(20.0f));
                var64_36 = MediaPlayerInfoModule.j[33];
                var64_36 -= MediaPlayerInfoModule.j[34];
                v0 = var61_8;
                var66_37 = MediaPlayerInfoModule.j[36];
                var66_37 += MediaPlayerInfoModule.j[37];
                var61_8 = v0 ^ ((long)kotakbaz.rain.client.util.media.a.getPlaing() << (var64_36 += MediaPlayerInfoModule.j[35]) ^ v0) & -1L << (var66_37 ^= MediaPlayerInfoModule.j[38]);
                var68_38 = MediaPlayerInfoModule.j[39];
                var68_38 ^= MediaPlayerInfoModule.j[40];
                var30_39 = this.withAlpha((int)(var61_8 >>> (var68_38 ^= MediaPlayerInfoModule.j[41])) != 0 ? HudStyle.INSTANCE.getTITLE_COLOR() : ColorUtil.INSTANCE.setAlpha(HudStyle.INSTANCE.getTITLE_COLOR(), 0.72f), var5_12);
                var70_40 = MediaPlayerInfoModule.j[42];
                var70_40 -= MediaPlayerInfoModule.j[43];
                var31_41 = this.withAlpha((int)(var61_8 >>> (var70_40 += MediaPlayerInfoModule.j[44])) != 0 ? HudStyle.INSTANCE.getVALUE_COLOR() : ColorUtil.INSTANCE.setAlpha(HudStyle.INSTANCE.getVALUE_COLOR(), 0.82f), var5_12);
                var32_42 = this.currentArtist();
                var33_43 = StringsKt.isBlank(var32_42) != false ? 0.0f : var2_9 / 1.5f;
                var34_44 = this.currentTitle();
                var35_45 = Font.INSTANCE.getGS_MEDIUM().priority(ClientRenderPipeline.HUD_TEXT);
                var36_46 = Font.INSTANCE.getGS_REGULAR().priority(ClientRenderPipeline.HUD_TEXT);
                var37_47 = RangesKt.coerceAtLeast(var28_35 - var33_43, 0.0f);
                var38_48 = var37_47 / 2.0f;
                var72_49 = MediaPlayerInfoModule.j[45];
                var72_49 -= MediaPlayerInfoModule.j[46];
                var39_50 = kotakbaz.rain.client.util.render.font.E.getWidth$default(var35_45, var34_44, var24_31, 0.0f, var72_49 ^= MediaPlayerInfoModule.j[47], null);
                if (StringsKt.isBlank(var32_42)) {
                    v1 = 0.0f;
                } else {
                    var74_51 = MediaPlayerInfoModule.j[48];
                    var74_51 += MediaPlayerInfoModule.j[49];
                    v1 = var40_52 = kotakbaz.rain.client.util.render.font.E.getWidth$default(var36_46, var32_42, var25_32, 0.0f, var74_51 += MediaPlayerInfoModule.j[50], null);
                }
                if (var39_50 > var38_48) {
                    var76_53 = MediaPlayerInfoModule.j[51];
                    var76_53 -= MediaPlayerInfoModule.j[52];
                    v2 = var76_53 ^= MediaPlayerInfoModule.j[53];
                } else {
                    var78_54 = MediaPlayerInfoModule.j[54];
                    var78_54 += MediaPlayerInfoModule.j[55];
                    v2 = var78_54 -= MediaPlayerInfoModule.j[56];
                }
                v3 = var55_5;
                var80_55 = MediaPlayerInfoModule.j[57];
                var80_55 ^= MediaPlayerInfoModule.j[58];
                var55_5 = v3 ^ ((long)v2 ^ v3) & -1L >>> (var80_55 += MediaPlayerInfoModule.j[59]);
                if (var40_52 > var38_48) {
                    var82_56 = MediaPlayerInfoModule.j[60];
                    var82_56 += MediaPlayerInfoModule.j[61];
                    v4 = var82_56 ^= MediaPlayerInfoModule.j[62];
                } else {
                    var84_57 = MediaPlayerInfoModule.j[63];
                    var84_57 += MediaPlayerInfoModule.j[64];
                    v4 = var84_57 -= MediaPlayerInfoModule.j[65];
                }
                var86_58 = MediaPlayerInfoModule.j[66];
                var86_58 ^= MediaPlayerInfoModule.j[67];
                v5 = var55_5;
                var88_59 = MediaPlayerInfoModule.j[69];
                var88_59 ^= MediaPlayerInfoModule.j[70];
                var55_5 = v5 ^ ((long)v4 << (var86_58 += MediaPlayerInfoModule.j[68]) ^ v5) & -1L << (var88_59 -= MediaPlayerInfoModule.j[71]);
                if (!StringsKt.isBlank(var32_42)) break block19;
                v6 = var28_35;
                break block20;
            }
            if ((int)var55_5 == 0) ** GOTO lbl-1000
            var90_60 = MediaPlayerInfoModule.j[72];
            var90_60 -= MediaPlayerInfoModule.j[73];
            if ((int)(var55_5 >>> (var90_60 ^= MediaPlayerInfoModule.j[74])) != 0) {
                v6 = var38_48;
            } else lbl-1000:
            // 2 sources

            {
                v6 = var40_52 <= 0.0f ? var28_35 : ((int)var55_5 != 0 ? RangesKt.coerceAtLeast(var37_47 - var40_52, HudStyle.INSTANCE.scaled(12.0f)) : RangesKt.coerceAtLeast(var39_50, HudStyle.INSTANCE.scaled(12.0f)));
            }
        }
        var43_61 = RangesKt.coerceAtMost(v6, var28_35);
        var44_62 = var8_15 + this.centeredTopOffset(Font.INSTANCE.getGS_MEDIUM(), var24_31, var4_11) - HudStyle.INSTANCE.scaled(0.1f);
        var45_63 = var8_15 + this.centeredTopOffset(Font.INSTANCE.getGS_REGULAR(), var25_32, var4_11);
        this.clearControlBounds();
        if (var9_16 > 0.001f) {
            var92_64 = MediaPlayerInfoModule.j[75];
            var92_64 ^= MediaPlayerInfoModule.j[76];
            this.renderChatDrawer(var7_14, var8_15, var3_10, var4_11, var14_21, var12_19, var13_20, var9_16, var5_12, (boolean)(var61_8 >>> (var92_64 += MediaPlayerInfoModule.j[77])));
        }
        RenderUtils.INSTANCE.getBLURRED_RECT().priority(ClientRenderPipeline.HUD_RECT).color(this.withAlpha(HudStyle.INSTANCE.getPANEL_COLOR(), var5_12)).mix(0.9f).round(var11_18).draw(var7_14, var8_15, var3_10, var4_11);
        RenderUtils.INSTANCE.getBLURRED_RECT().priority(ClientRenderPipeline.HUD_RECT).color(this.withAlpha(HudStyle.INSTANCE.getHEADER_COLOR(), var5_12)).mix(0.9f).round(new Vector4f(HudStyle.INSTANCE.scaled(6.0f), HudStyle.INSTANCE.scaled(4.5f), HudStyle.INSTANCE.scaled(6.0f), HudStyle.INSTANCE.scaled(4.5f))).draw(var17_24, var18_25, var15_22, var15_22);
        this.drawArtwork(var17_24, var18_25, var15_22, var5_12);
        if (var39_50 <= var43_61) {
            var94_65 = MediaPlayerInfoModule.j[78];
            var94_65 -= MediaPlayerInfoModule.j[79];
            v7 = var94_65 ^= MediaPlayerInfoModule.j[80];
        } else {
            var96_66 = MediaPlayerInfoModule.j[81];
            var96_66 ^= MediaPlayerInfoModule.j[82];
            v7 = var96_66 ^= MediaPlayerInfoModule.j[83];
        }
        var98_67 = MediaPlayerInfoModule.j[84];
        var98_67 ^= MediaPlayerInfoModule.j[85];
        v8 = var59_7;
        var100_68 = MediaPlayerInfoModule.j[87];
        var100_68 -= MediaPlayerInfoModule.j[88];
        var59_7 = v8 ^ ((long)v7 << (var98_67 -= MediaPlayerInfoModule.j[86]) ^ v8) & -1L << (var100_68 ^= MediaPlayerInfoModule.j[89]);
        var102_69 = MediaPlayerInfoModule.j[90];
        var102_69 ^= MediaPlayerInfoModule.j[91];
        if ((int)(var59_7 >>> (var102_69 -= MediaPlayerInfoModule.j[92])) != 0) {
            var104_70 = MediaPlayerInfoModule.j[93];
            var104_70 ^= MediaPlayerInfoModule.j[94];
            var106_71 = MediaPlayerInfoModule.j[96];
            var106_71 ^= MediaPlayerInfoModule.j[97];
            kotakbaz.rain.client.util.render.font.E.drawText$default(var35_45, var34_44, var26_33, var44_62, var24_31, var30_39, 0.0f, 0.0f, 0.0f, var104_70 -= MediaPlayerInfoModule.j[95], 0.0f, var106_71 -= MediaPlayerInfoModule.j[98], null);
        } else {
            var108_72 = MediaPlayerInfoModule.j[99];
            var108_72 -= MediaPlayerInfoModule.j[100];
            var110_73 = MediaPlayerInfoModule.j[102];
            var110_73 += MediaPlayerInfoModule.j[103];
            TextScroller.draw$default(MediaPlayerInfoModule.d, var35_45, var34_44, var26_33, var44_62, var24_31, var30_39, var43_61, var108_72 ^= MediaPlayerInfoModule.j[101], 0.0f, var110_73 ^= MediaPlayerInfoModule.j[104], null);
        }
        if (!StringsKt.isBlank(var32_42)) {
            var112_74 = MediaPlayerInfoModule.j[105];
            var112_74 += MediaPlayerInfoModule.j[106];
            v9 = var112_74 += MediaPlayerInfoModule.j[107];
        } else {
            var114_75 = MediaPlayerInfoModule.j[108];
            var114_75 += MediaPlayerInfoModule.j[109];
            v9 = var114_75 ^= MediaPlayerInfoModule.j[110];
        }
        if (v9 != 0) {
            var116_76 = MediaPlayerInfoModule.j[111];
            var116_76 ^= MediaPlayerInfoModule.j[112];
            var47_77 = (int)(var59_7 >>> (var116_76 ^= MediaPlayerInfoModule.j[113])) != 0 ? var26_33 + var39_50 + var33_43 : var26_33 + var43_61 + var33_43;
            var48_78 = RangesKt.coerceAtLeast(var27_34 - var47_77, 0.0f);
            var118_79 = MediaPlayerInfoModule.j[114];
            var118_79 += MediaPlayerInfoModule.j[115];
            var120_80 = MediaPlayerInfoModule.j[117];
            var120_80 -= MediaPlayerInfoModule.j[118];
            TextScroller.draw$default(MediaPlayerInfoModule.D, var36_46, var32_42, var47_77, var45_63, var25_32, var31_41, var48_78, var118_79 ^= MediaPlayerInfoModule.j[116], 0.0f, var120_80 -= MediaPlayerInfoModule.j[119], null);
        }
        var122_81 = MediaPlayerInfoModule.j[120];
        var122_81 += MediaPlayerInfoModule.j[121];
        this.drawBars(var7_14 + var3_10 - var19_26, var18_25 + var2_9 / 4.0f, var21_28, var20_27, var23_30, var22_29, var5_12, (boolean)(var61_8 >>> (var122_81 ^= MediaPlayerInfoModule.j[122])));
        if (MediaPlayerInfoModule.C.getSelectedIndex() == 0) {
            MediaPlayerInfoModule.c.setWidth(var3_10);
            MediaPlayerInfoModule.c.setHeight(var4_11 + RangesKt.coerceAtLeast(var14_21 - var12_19 - var13_20, 0.0f) * var9_16);
        } else {
            MediaPlayerInfoModule.c.setWidth(0.0f);
            MediaPlayerInfoModule.c.setHeight(0.0f);
        }
    }

    private final a resolvePosition(float width2, float height) {
        a a2;
        int n2 = j[123];
        n2 -= j[124];
        if (C.getSelectedIndex() != (n2 += j[125])) {
            return new a(c.getX(), c.getY());
        }
        float f2 = kotakbaz.rain.client.extensions.b.getMc().getWindow().getScaledWidth();
        float f3 = kotakbaz.rain.client.extensions.b.getMc().getWindow().getScaledHeight();
        float f4 = 3.0f;
        float f5 = 3.0f;
        float f6 = RangesKt.coerceAtLeast(f2 - width2 - f4, f4);
        float f7 = RangesKt.coerceAtLeast(f3 - height - f5, f5);
        if (WatermarkModule.INSTANCE.isEnabled()) {
            b b2 = WatermarkModule.INSTANCE.currentLogoBounds();
            a2 = new a(RangesKt.coerceIn(b2.getCenterX() - width2 / 2.0f, f4, f6), RangesKt.coerceIn(b2.getY() + b2.getHeight() + HudStyle.INSTANCE.scaled(4.0f), f5, f7));
        } else {
            a2 = new a(RangesKt.coerceIn((f2 - width2) / 2.0f, f4, f6), RangesKt.coerceIn(WatermarkModule.INSTANCE.anchorTopY(), f5, f7));
        }
        return a2;
    }

    private final void drawArtwork(float x, float y, float size, float alpha2) {
        Color color;
        Identifier identifier = kotakbaz.rain.client.util.media.a.getTextureId();
        if (identifier != null && kotakbaz.rain.client.util.media.a.getTextureWidth() > 0 && kotakbaz.rain.client.util.media.a.getTextureHeight() > 0) {
            GpuTexture gpuTexture = kotakbaz.rain.client.extensions.b.getMc().getTextureManager().getTexture(identifier).getGlTexture();
            Object object = color = gpuTexture instanceof GlTexture ? (GlTexture)gpuTexture : null;
            if (color != null) {
                TextureRectRenderer textureRectRenderer = RenderUtils.INSTANCE.getTEXTURE_RECT().priority(ClientRenderPipeline.HUD_SPECIAL).texture(color.getGlId());
                Color color2 = Color.WHITE;
                int n2 = j[126];
                n2 += j[127];
                Intrinsics.checkNotNullExpressionValue(color2, (String)G[n2 -= j[128]]);
                textureRectRenderer.draw(x, y, size, size, color2, size * 0.2f, 0.0f, 0.0f, 1.0f, 1.0f, -1.0f, alpha2);
                return;
            }
        }
        color = this.withAlpha(HudStyle.INSTANCE.getTITLE_COLOR(), 0.12f * alpha2);
        RenderUtils.INSTANCE.getBLURRED_RECT().priority(ClientRenderPipeline.HUD_RECT).color(color).mix(0.9f).round(HudStyle.INSTANCE.scaled(4.0f)).draw(x + HudStyle.INSTANCE.scaled(2.0f), y + HudStyle.INSTANCE.scaled(2.0f), size - HudStyle.INSTANCE.scaled(4.0f), size - HudStyle.INSTANCE.scaled(4.0f));
        int n3 = j[129];
        n3 -= j[130];
        int n4 = j[132];
        n4 += j[133];
        kotakbaz.rain.client.util.render.font.E.drawCenteredText$default(Font.INSTANCE.getGS_MEDIUM().priority(ClientRenderPipeline.HUD_TEXT), (String)G[n3 -= j[131]], x + size / 2.0f, y + this.centeredTopOffset(Font.INSTANCE.getGS_MEDIUM(), HudStyle.INSTANCE.scaled(6.5f), size) - HudStyle.INSTANCE.scaled(0.5f), HudStyle.INSTANCE.scaled(6.5f), this.withAlpha(HudStyle.INSTANCE.getTITLE_COLOR(), alpha2), 0.0f, n4 -= j[134], null);
    }

    private final void drawBars(float x, float y, float barWidth, float gap, float minHeight, float maxHeight, float alpha2, boolean playing) {
        long l2 = 6931167495496648504L;
        long l3 = -7510407273069770250L;
        long l4 = 3139132951937413902L;
        double d2 = (double)System.nanoTime() / Double.longBitsToDouble(0xECACED02BD271FB2L ^ 0xAD612067BD271FB2L);
        Color color = this.withAlpha(playing ? HudStyle.INSTANCE.getTITLE_COLOR() : ColorUtil.INSTANCE.setAlpha(HudStyle.INSTANCE.getTITLE_COLOR(), 0.45f), alpha2);
        Color color2 = this.withAlpha(playing ? ColorUtil.INSTANCE.setAlpha(HudStyle.INSTANCE.getTITLE_COLOR(), 0.16f) : ColorUtil.INSTANCE.setAlpha(HudStyle.INSTANCE.getTITLE_COLOR(), 0.08f), alpha2);
        long l5 = l4;
        int n2 = j[135];
        n2 ^= j[136];
        l4 = l5 ^ (0L ^ l5) & -1L << (n2 -= j[137]);
        while (true) {
            float f2;
            int n3 = j[138];
            n3 += j[139];
            int n4 = j[141];
            n4 ^= j[142];
            if ((int)(l4 >>> (n3 += j[140])) >= (n4 -= j[143])) break;
            if (playing) {
                int n5 = j[144];
                n5 ^= j[145];
                f2 = this.animatedEnergy(d2, (int)(l4 >>> (n5 += j[146])));
            } else {
                int n6 = j[147];
                n6 += j[148];
                f2 = 0.18f + (float)((int)(l4 >>> (n6 += j[149]))) * 0.03f;
            }
            float f3 = f2;
            float f4 = minHeight + (maxHeight - minHeight) * f3;
            int n7 = j[150];
            n7 ^= j[151];
            float f5 = x + (float)((int)(l4 >>> (n7 ^= j[152]))) * barWidth;
            float f6 = y;
            float f7 = y + (maxHeight - f4);
            RenderUtils.INSTANCE.getBLURRED_RECT().priority(ClientRenderPipeline.HUD_RECT).color(color2).mix(0.9f).round(barWidth / 2.0f).draw(f5, f6, barWidth, maxHeight);
            RenderUtils.INSTANCE.getBLURRED_RECT().priority(ClientRenderPipeline.HUD_RECT).color(color).mix(0.9f).round(barWidth / 2.0f).draw(f5, f7, barWidth, f4);
            l4 += 0x100000000L;
        }
    }

    private final float animatedEnergy(double time, int index) {
        double d2 = Math.sin(time * Double.longBitsToDouble(0xA0B69CCE9151081L ^ 0x4A13A50025D9DC4CL) + (double)index * Double.longBitsToDouble(0xA6E36141A653BE6FL ^ 0x990FAD8D6A9F72A2L));
        double d3 = Math.sin(time * Double.longBitsToDouble(0x8333A4F75CA2CF1FL ^ 0xC311683B906E03D2L) + (double)index * Double.longBitsToDouble(0x2A838E1889C70F6EL ^ 0x1578BD2BBAF43C5DL) + Double.longBitsToDouble(0x2E5828D2456F8DD3L ^ 0x11ACE41E89A3411EL));
        double d4 = Math.sin(time * Double.longBitsToDouble(0xEB7AA2C8D7172584L ^ 0xAB533B514E8EBC1EL) + (double)index * Double.longBitsToDouble(0x1AB931DB03CC5FD5L ^ 0x5AB9FD17CF009318L) + Double.longBitsToDouble(0xCA9EA1BD236D8E9FL ^ 0x8A9A6D71EFA14252L));
        double d5 = Math.abs(d2 * Double.longBitsToDouble(0x65DA45CD3B6C5984L ^ 0x5A3BDC54A2F5C01EL) + d3 * Double.longBitsToDouble(0x1158B51AF6911093L ^ 0x2E8B8629C5A223A0L) + d4 * Double.longBitsToDouble(0xADF268D39976F2D9L ^ 0x92315BE0AA45C1EAL));
        return RangesKt.coerceIn((float)(Double.longBitsToDouble(0x4D50EEA9B8306BA1L ^ 0x7297E494C893BCABL) + d5 * Double.longBitsToDouble(0x3A83E7C62B8C0425L ^ 0x569DAB6885B0E18L)), 0.0f, 1.0f);
    }

    private final void renderChatDrawer(float x, float y, float width2, float height, float drawerHeight, float drawerOverlap, float drawerLift, float progress2, float alpha2, boolean playing) {
        String string;
        float f2 = x;
        float f3 = y + height - drawerOverlap - drawerLift;
        float f4 = RangesKt.coerceAtLeast(width2, 0.0f);
        float f5 = drawerHeight * progress2;
        if (f4 <= 0.0f || f5 <= 0.5f) {
            return;
        }
        float f6 = f3 + drawerOverlap + drawerLift;
        float f7 = RangesKt.coerceAtLeast(drawerHeight - drawerOverlap - drawerLift, 0.0f);
        Color color = this.withAlpha(HudStyle.INSTANCE.getPANEL_COLOR(), progress2 * alpha2);
        Color color2 = this.withAlpha(HudStyle.INSTANCE.getHEADER_COLOR(), progress2 * alpha2 * 0.9f);
        float f8 = HudStyle.INSTANCE.scaled(5.0f);
        Vector4f vector4f = new Vector4f(f8 * (1.0f - progress2), f8 * (1.0f - progress2), f8, f8);
        Color color3 = this.withAlpha(HudStyle.INSTANCE.getTITLE_COLOR(), 0.12f * progress2 * alpha2);
        Color color4 = this.withAlpha(HudStyle.INSTANCE.getTITLE_COLOR(), 0.92f * progress2 * alpha2);
        Color color5 = playing ? this.withAlpha(HudStyle.INSTANCE.getTITLE_COLOR(), progress2 * alpha2) : this.withAlpha(HudStyle.INSTANCE.getTITLE_COLOR(), 0.72f * progress2 * alpha2);
        Color color6 = playing ? this.withAlpha(HudStyle.INSTANCE.getVALUE_COLOR(), progress2 * alpha2) : this.withAlpha(HudStyle.INSTANCE.getVALUE_COLOR(), 0.82f * progress2 * alpha2);
        float f9 = HudStyle.INSTANCE.scaled(5.1f);
        float f10 = HudStyle.INSTANCE.scaled(5.6f);
        float f11 = HudStyle.INSTANCE.scaled(6.0f);
        float f12 = (1.0f - progress2) * HudStyle.INSTANCE.scaled(4.0f);
        E e2 = Font.INSTANCE.getGS_MEDIUM().priority(ClientRenderPipeline.HUD_TEXT);
        E e3 = Font.INSTANCE.getGS_MEDIUM().priority(ClientRenderPipeline.HUD_TEXT);
        E e4 = Font.INSTANCE.getICON().priority(ClientRenderPipeline.HUD_TEXT);
        String string2 = kotakbaz.rain.client.util.media.a.getTrackTime();
        String string3 = this.remainingTimeText();
        int n2 = j[153];
        n2 ^= j[154];
        String string4 = (String)G[n2 += j[155]] + string3;
        int n3 = j[156];
        n3 += j[157];
        String string5 = (String)G[n3 += j[158]];
        if (playing) {
            int n4 = j[159];
            n4 ^= j[160];
            string = (String)G[n4 ^= j[161]];
        } else {
            int n5 = j[162];
            n5 ^= j[163];
            string = (String)G[n5 -= j[164]];
        }
        String string6 = string;
        int n6 = j[165];
        n6 += j[166];
        String string7 = (String)G[n6 += j[167]];
        E e5 = e4;
        E e6 = e4;
        E e7 = e4;
        float f13 = HudStyle.INSTANCE.scaled(3.0f);
        int n7 = j[168];
        n7 -= j[169];
        float f14 = kotakbaz.rain.client.util.render.font.E.getWidth$default(e5, string5, f10, 0.0f, n7 -= j[170], null);
        int n8 = j[171];
        n8 -= j[172];
        float f15 = kotakbaz.rain.client.util.render.font.E.getWidth$default(e6, string6, f10, 0.0f, n8 -= j[173], null);
        int n9 = j[174];
        n9 ^= j[175];
        float f16 = kotakbaz.rain.client.util.render.font.E.getWidth$default(e7, string7, f10, 0.0f, n9 -= j[176], null);
        float f17 = f14 + f15 + f16 + f13 * 2.0f;
        float f18 = f2 + f4 - f11 - f17;
        int n10 = j[177];
        n10 -= j[178];
        float f19 = kotakbaz.rain.client.util.render.font.E.getWidth$default(e2, string4, f9, 0.0f, n10 += j[179], null);
        float f20 = f18 - HudStyle.INSTANCE.scaled(6.0f) - f19;
        float f21 = f2 + f11;
        Intrinsics.checkNotNull(string2);
        int n11 = j[180];
        n11 ^= j[181];
        float f22 = kotakbaz.rain.client.util.render.font.E.getWidth$default(e2, string2, f9, 0.0f, n11 += j[182], null);
        float f23 = f21 + f22 + HudStyle.INSTANCE.scaled(6.0f);
        float f24 = RangesKt.coerceAtLeast(f20 - HudStyle.INSTANCE.scaled(6.0f), f23);
        float f25 = RangesKt.coerceAtLeast(f24 - f23, HudStyle.INSTANCE.scaled(12.0f));
        float f26 = HudStyle.INSTANCE.scaled(1.8f);
        float f27 = f6 + f7 / 2.0f - f26 / 2.0f + f12;
        float f28 = f6 + this.centeredTopOffset(Font.INSTANCE.getGS_MEDIUM(), f9, f7) + f12;
        float f29 = f6 + this.centeredTopOffset(Font.INSTANCE.getICON(), f10, f7) + f12;
        float f30 = f6 + this.centeredTopOffset(Font.INSTANCE.getICON(), f10, f7) + f12;
        float f31 = f6 + this.centeredTopOffset(Font.INSTANCE.getICON(), f10, f7) + f12;
        float f32 = HudStyle.INSTANCE.scaled(2.5f);
        RenderUtils.INSTANCE.getBLURRED_RECT().priority(ClientRenderPipeline.HUD_RECT).color(color).mix(0.9f).round(vector4f).draw(f2, f3, f4, f5);
        RenderUtils.INSTANCE.getBLURRED_RECT().priority(ClientRenderPipeline.HUD_RECT).color(color2).mix(0.9f).round(vector4f).draw(f2, f3, f4, f5);
        ScissorUtil.INSTANCE.start(f2, f3, f4, f5);
        int n12 = j[183];
        n12 += j[184];
        int n13 = j[186];
        n13 -= j[187];
        kotakbaz.rain.client.util.render.font.E.drawText$default(e2, string2, f21, f28, f9, color5, 0.0f, 0.0f, 0.0f, n12 += j[185], 0.0f, n13 += j[188], null);
        int n14 = j[189];
        n14 += j[190];
        int n15 = j[192];
        n15 ^= j[193];
        kotakbaz.rain.client.util.render.font.E.drawText$default(e2, string4, f20, f28, f9, color6, 0.0f, 0.0f, 0.0f, n14 -= j[191], 0.0f, n15 -= j[194], null);
        RenderUtils.INSTANCE.getBLURRED_RECT().priority(ClientRenderPipeline.HUD_RECT).color(color3).mix(0.9f).round(f26 / 2.0f).draw(f23, f27, f25, f26);
        RenderUtils.INSTANCE.getBLURRED_RECT().priority(ClientRenderPipeline.HUD_RECT).color(color4).mix(0.9f).round(f26 / 2.0f).draw(f23, f27, f25 * RangesKt.coerceIn(kotakbaz.rain.client.util.media.a.getProgress(), 0.0f, 1.0f), f26);
        float f33 = f18;
        f = new F(f33 - f32, f6, f14 + f32 * 2.0f, f7);
        int n16 = j[195];
        n16 += j[196];
        int n17 = j[198];
        n17 -= j[199];
        kotakbaz.rain.client.util.render.font.E.drawText$default(e5, string5, f33, f29, f10, color5, 0.0f, 0.0f, 0.0f, n16 -= j[197], 0.0f, n17 ^= j[200], null);
        F = new F((f33 += f14 + f13) - f32, f6, f15 + f32 * 2.0f, f7);
        int n18 = j[201];
        n18 -= j[202];
        int n19 = j[204];
        n19 ^= j[205];
        kotakbaz.rain.client.util.render.font.E.drawText$default(e6, string6, f33, f30, f10, color5, 0.0f, 0.0f, 0.0f, n18 -= j[203], 0.0f, n19 -= j[206], null);
        g = new F((f33 += f15 + f13) - f32, f6, f16 + f32 * 2.0f, f7);
        int n20 = j[207];
        n20 -= j[208];
        int n21 = j[210];
        n21 ^= j[211];
        kotakbaz.rain.client.util.render.font.E.drawText$default(e7, string7, f33, f31, f10, color5, 0.0f, 0.0f, 0.0f, n20 += j[209], 0.0f, n21 += j[212], null);
        ScissorUtil.INSTANCE.end();
    }

    public final boolean onChatClick(int mouseX, int mouseY, int button) {
        int n2;
        int n3;
        int n4;
        if (button != 0) {
            boolean bl = j[213];
            bl ^= j[214];
            return bl += j[215];
        }
        if (!this.isEnabled()) {
            boolean bl = j[216];
            bl += j[217];
            return bl -= j[218];
        }
        if (!(kotakbaz.rain.client.extensions.b.getMc().currentScreen instanceof ChatScreen)) {
            boolean bl = j[219];
            bl -= j[220];
            return bl -= j[221];
        }
        float f2 = mouseX;
        float f3 = mouseY;
        f_0 f_02 = f;
        if (f_02 != null) {
            int n5 = j[222];
            n5 -= j[223];
            if (f_02.contains(f2, f3) == (n5 ^= j[224])) {
                int n6 = j[225];
                n6 ^= j[226];
                n4 = n6 ^= j[227];
            } else {
                int n7 = j[228];
                n7 += j[229];
                n4 = n7 -= j[230];
            }
        } else {
            int n8 = j[231];
            n8 ^= j[232];
            n4 = n8 -= j[233];
        }
        if (n4 != 0) {
            kotakbaz.rain.client.util.media.a.previousTrack();
            boolean bl = j[234];
            bl ^= j[235];
            return bl ^= j[236];
        }
        f_0 f_03 = F;
        if (f_03 != null) {
            int n9 = j[237];
            n9 ^= j[238];
            if (f_03.contains(f2, f3) == (n9 ^= j[239])) {
                int n10 = j[240];
                n10 ^= j[241];
                n3 = n10 ^= j[242];
            } else {
                int n11 = j[243];
                n11 -= j[244];
                n3 = n11 ^= j[245];
            }
        } else {
            int n12 = j[246];
            n12 += j[247];
            n3 = n12 ^= j[248];
        }
        if (n3 != 0) {
            kotakbaz.rain.client.util.media.a.playpauseTrack();
            boolean bl = j[249];
            bl ^= j[250];
            return bl -= j[251];
        }
        f_0 f_04 = g;
        if (f_04 != null) {
            int n13 = j[252];
            n13 -= j[253];
            if (f_04.contains(f2, f3) == (n13 -= j[254])) {
                int n14 = j[255];
                n14 += j[256];
                n2 = n14 += j[257];
            } else {
                int n15 = j[258];
                n15 ^= j[259];
                n2 = n15 -= j[260];
            }
        } else {
            int n16 = j[261];
            n16 += j[262];
            n2 = n16 ^= j[263];
        }
        if (n2 != 0) {
            kotakbaz.rain.client.util.media.a.nextTrack();
            boolean bl = j[264];
            bl += j[265];
            return bl += j[266];
        }
        boolean bl = j[267];
        bl -= j[268];
        return bl ^= j[269];
    }

    private final float currentDrawerProgress(boolean preview) {
        boolean bl = j[270];
        bl ^= j[271];
        e.run(preview ? 1.0 : 0.0, 180L, Easing.b, bl -= j[272]);
        e.update();
        return RangesKt.coerceIn(e.get(), 0.0f, 1.0f);
    }

    private final void maybeRefreshTrackInfo(boolean force) {
        long l2 = System.currentTimeMillis();
        if (!force && l2 - E < 400L) {
            return;
        }
        E = l2;
        kotakbaz.rain.client.util.media.a.updateTrackInfo();
    }

    /*
     * WARNING - void declaration
     */
    static /* synthetic */ void maybeRefreshTrackInfo$default(MediaPlayerInfoModule mediaPlayerInfoModule, boolean bl, int n2, Object object) {
        int n3;
        void var2_3;
        int n4 = j[273];
        n4 ^= j[274];
        if ((var2_3 & (n4 += j[275])) != 0) {
            int n5 = j[276];
            n5 -= j[277];
            n3 = n5 -= j[278];
        }
        mediaPlayerInfoModule.maybeRefreshTrackInfo(n3 != 0);
    }

    private final String currentTitle() {
        int n2 = j[279];
        n2 -= j[280];
        return this.sanitize(kotakbaz.rain.client.util.media.a.getTrackTitle(), (String)G[n2 ^= j[281]]);
    }

    private final String currentArtist() {
        int n2 = j[282];
        n2 ^= j[283];
        int n3 = j[285];
        n3 -= j[286];
        return this.sanitize(kotakbaz.rain.client.util.media.a.getArtist(), (String)G[n2 ^= j[284]] + (String)G[n3 += j[287]]);
    }

    private final String sanitize(String value2, String fallback) {
        if (value2 == null) {
            return fallback;
        }
        if (StringsKt.isBlank(value2)) {
            return fallback;
        }
        int n2 = j[288];
        n2 += j[289];
        boolean bl = j[291];
        bl ^= j[292];
        if (StringsKt.equals(value2, (String)G[n2 -= j[290]], bl -= j[293])) {
            return fallback;
        }
        return value2;
    }

    private final String remainingTimeText() {
        long l2 = RangesKt.coerceAtLeast(kotakbaz.rain.client.util.media.a.getDuration(), 0L);
        long l3 = RangesKt.coerceAtLeast(kotakbaz.rain.client.util.media.a.getPosition(), 0L);
        return this.formatTrackTime(RangesKt.coerceAtLeast(l2 - l3, 0L));
    }

    private final String formatTrackTime(long totalSeconds) {
        String string;
        long l2 = totalSeconds / 60L;
        long l3 = totalSeconds % 60L;
        if (l3 < 10L) {
            int n2 = j[294];
            n2 -= j[295];
            string = (String)G[n2 -= j[296]];
        } else {
            string = "";
        }
        long l4 = l3;
        String string2 = string;
        long l5 = l2;
        int n3 = j[297];
        n3 -= j[298];
        return l5 + (String)G[n3 += j[299]] + string2 + l4;
    }

    private final float centeredTopOffset(E font, float size, float containerHeight) {
        return (containerHeight - font.getMetrics().getLineHeight() * size) * 0.5f;
    }

    private final Color withAlpha(Color color, float factor) {
        return ColorUtil.INSTANCE.setAlpha(color, (float)color.getAlpha() / 255.0f * factor);
    }

    private final float tabAlpha() {
        return RangesKt.coerceIn(1.0f - BetterHudModule.INSTANCE.getTabProgress(), 0.0f, 1.0f);
    }

    private final void clearControlBounds() {
        f = null;
        F = null;
        g = null;
    }

    static {
        MediaPlayerInfoModule.b();
        long l2 = -2769111698932457393L;
        long l3 = 8451249651970810721L;
        long l4 = -4393949565758279652L;
        long l5 = 5565292769438704830L;
        long l6 = 3043625070248841163L;
        long l7 = -8697132431441743727L;
        long l8 = 6752668214803663531L;
        long l9 = -5961515322350906885L;
        long l10 = -3744425023722159130L;
        long l11 = 4304325583314568168L;
        long l12 = -9012728814464199505L;
        long l13 = 2633699122496904287L;
        long l14 = -7524171581552256585L;
        long l15 = 3574283441969584412L;
        int n2 = j[300];
        n2 ^= j[301];
        G = new Object[n2 += j[302]];
        long l16 = l15;
        int n3 = j[303];
        n3 -= j[304];
        l15 = l16 ^ (0L ^ l16) & -1L << (n3 -= j[305]);
        Object[] objectArray = new Object[j[306]];
        objectArray[MediaPlayerInfoModule.j[307]] = h;
        objectArray[MediaPlayerInfoModule.j[308]] = j[309];
        int n4 = j[310];
        Object object = MediaPlayerInfoModule.A()[j[311]];
        if (object == null) {
            char[] cArray = "\ud118\ud104\ufca3\ufcc2\ufcc9\ufcc6\ufccb\ud11c\ud10b\ufc6a\ufccc\ufc65\ufcb0\ufcb0\ud10a\ufcb6\ud114\ud118\ufcbc\ufcd3\ud10b\ufcb0\ud10c\ufcb7\ud11a\ufc65\ufc62\ufc73\ufc69\ufc6d\ud10f\ud10f\ufc73\ufcb6\ud10f\ufcb5\ufc6a\ufcca\ud117\ufc6d\ufcc4\ud10a\ud116\ud105\ud110\ufcb4\ufc6b\ufcc9\ufcc2\ud119\ufcc3\ud11e\ufc61\ufcb9\ufc5f\ufc65\ufcc6\ufcc3\ufcd3\ud117\ud117\ud116\ud106\ud117\ufc61\ufcbc\ufc78\ud102\ud0ff\ufcbf\ud108\ud101\ufcba\ufcbd\ufc5f\ud113\ufcc6\ud118\ud11e\ufc65\ud101\ufcb4\ud115\ud104\ufcc4\ud10f\ufcba\ud118\ud106\ufcc5\ud113\ufcc5\ufc61\ud104\ufcc5\ud0ff\ud118\ud10f\ud11d\ud11a\ud0ff\ufcb8\ufcb9\ud11a\ud109\ufc65\ufc73\ud110\ufc6b\ufca3\ufcbf\ufc6a\ufcc2\ufc5f\ufcb8\ufcc6\ufc64\ufcbf\ufcc4\ud10d\ud0ff\ud10d\ud10a\ufcc3\ufcbc\ud105\ud10d\ufcc5\ufcbe\ufcba\ufc62\ufcc5\ufc69\ud110\ufcba\ud118\ufc5f\ufcb7\ud11d\ufcba\ud11c\ud101\ud105\ufc66\ufcc5\ud108\ufcbe\ud10d\ufcc4\ufccc\ufcbd\ud101\ufc6d\ufca8\ufcb0\ufc5f\ufccb\ud11e\ufcbe\ufc69\ufccb\ud0ff\ufcca\ufcbc\ufcbe\ud102\ufcc5\ufca8\ud11c\ufc6b\ufc5f\ufcbd\ufc78\ud10f\ud106\ufcb5\ufc65\ud116\ufcbc\ufcd3\ufcbd\ufcb7\ud11d\ud109\ufc5f\ufcc4\ud105\ud11c\ufcd3\ufc66\ud108\ufcbd\ufc64\ufc6b\ufc5f\ufc73\ud113\ufc73\ufcb7\ufcc5\ud118\ufcb9\ufc62\ufcd3\ufcb4\ud10a\ufc6b\ufc5f\ufcbc\ufc64\ufcb4\ufca8\ufcaf\ufc66\ud108\ufcbe\ufcb8\ud0ff\ufc66\ud118\ud0ff\ufc61\ufca3\ud109\ud106\ufcba\ufc6b\ud10c\ud101\ufc78\ufcd3\ud11c\ufc6b\ud117\ufcb5\ufc61\ufcb0\ufcb7\ufcc6\ud10f\ufccb\ufc64\ufcb4\ud118\ufcc5\ufc5f\ufcc2\ufc66\ufc6b\ud118\ufc6c\ud108\ufc66\ufc6a\ufcb6\ud115\ufcbe\ufcba\ufc73\ufc61\ufc69\ud11d\ud105\ud119\ud11d\ufcaf\ufc7e\ufcb0\ufcd3\ufcb0\ufcb4\ufcc9\ufccb\ufcbf\ud119\ud116\ufcc6\ufc66\ufc6c\ud11c\ufcc3\ufcc3\ufcaf\ud118\ufcc3\ufcb5\ud102\ufccc\ufcd3\ufcbc\ufcbe\ud108\ufc7e\ud119\ud114\ufca8\ufc61\ud110\ud116\ud10a\ud114\ud10b\ud106\ud108\ufcb8\ud109\ud105\ufccc\ud10f\ufcc5\ufca8\ufc6b\ufc69\ufcca\ufca3\ud116\ud116\ud115\ufccc\ufcb0\ud104\ud109\ud101\ufcbe\ud104\ud115\ufccc\ufcb5\ufc6d\ufcbd\ud117\ud101\ud10a\ud0ff\ufc69\ud110\ud10a\ufc6d\ud117\ud116\ud10b\ufcd3\ufcbf\ud104\ud11c\ud10b\ud119\ud113\ufca8\ufc7e\ufcb0\ufc65\ud101\ufcbe\ufcb5\ufcc9\ufcbc\ufcc9\ud11a\ufc61\ud118\ufc65\ud11c\ufc6d\ufc6a\ud10b\ufcb6\ud115\ufca3\ud115\ufc61\ufcd3\ufcc4\ud0ff\ufcd3\ud119\ufc6a\ud116\ud109\ud0ff\ufc64\ud105\ufcbc\ufc6b".toCharArray();
            for (int i2 = j[312]; i2 < j[313]; ++i2) {
                int n5 = cArray[i2];
                n5 += j[314];
                n5 += j[315];
                n5 ^= j[316];
                n5 ^= j[317];
                n5 -= j[318];
                n5 += j[319];
                n5 += j[320];
                n5 -= j[321];
                n5 ^= j[322];
                n5 ^= j[323];
                n5 -= j[324];
                n5 ^= j[325];
                n5 += j[326];
                cArray[i2] = (char)(n5 -= j[327]);
            }
            object = MediaPlayerInfoModule.A()[MediaPlayerInfoModule.j[328]] = new String(cArray);
        }
        objectArray[n4] = (String)object;
        char[] cArray = ((String)MediaPlayerInfoModule.a(objectArray)).toCharArray();
        long l17 = l6;
        int n6 = j[329];
        n6 += j[330];
        l6 = l17 ^ (0xAA00000000L ^ l17) & -1L << (n6 ^= j[331]);
        long l18 = l13;
        int n7 = j[332];
        n7 ^= j[333];
        l13 = l18 ^ (0L ^ l18) & -1L >>> (n7 += j[334]);
        while (true) {
            int n8 = j[335];
            n8 += j[336];
            if ((int)l13 >= (int)(l6 >>> (n8 ^= j[337]))) break;
            int n9 = (int)l13;
            long l19 = l13;
            int n10 = j[338];
            n10 ^= j[339];
            int n11 = j[341];
            n11 += j[342];
            l13 = l19 ^ (l19 ^ l19 + (long)(n10 ^= j[340])) & -1L >>> (n11 ^= j[343]);
            long l20 = l9;
            int n12 = j[344];
            n12 -= j[345];
            l9 = l20 ^ ((long)cArray[n9] ^ l20) & -1L >>> (n12 += j[346]);
            int n13 = (int)l13;
            long l21 = l13;
            int n14 = j[347];
            n14 += j[348];
            int n15 = j[350];
            n15 ^= j[351];
            l13 = l21 ^ (l21 ^ l21 + (long)(n14 += j[349])) & -1L >>> (n15 += j[352]);
            int n16 = j[353];
            n16 ^= j[354];
            long l22 = l10;
            int n17 = j[356];
            n17 -= j[357];
            l10 = l22 ^ ((long)cArray[n13] << (n16 ^= j[355]) ^ l22) & -1L << (n17 ^= j[358]);
            int n18 = j[359];
            n18 ^= j[360];
            n18 -= j[361];
            int n19 = j[362];
            n19 -= j[363];
            long l23 = l12;
            int n20 = j[365];
            n20 += j[366];
            l12 = l23 ^ ((long)((int)l9 << n18 | (int)(l10 >>> (n19 ^= j[364]))) ^ l23) & -1L >>> (n20 -= j[367]);
            char[] cArray2 = new char[(int)l12];
            long l24 = l14;
            int n21 = j[368];
            n21 += j[369];
            l14 = l24 ^ (0L ^ l24) & -1L << (n21 -= j[370]);
            while (true) {
                int n22 = j[371];
                n22 += j[372];
                if ((int)(l14 >>> (n22 -= j[373])) >= (int)l12) break;
                int n23 = j[374];
                n23 -= j[375];
                int n24 = j[377];
                n24 += j[378];
                cArray2[(int)(l14 >>> (n23 -= MediaPlayerInfoModule.j[376]))] = cArray[(int)l13 + (int)(l14 >>> (n24 += j[379]))];
                l14 += 0x100000000L;
            }
            int n25 = j[380];
            n25 += j[381];
            int n26 = (int)(l15 >>> (n25 ^= j[382]));
            l15 += 0x100000000L;
            MediaPlayerInfoModule.G[n26] = new String(cArray2);
            long l25 = l13;
            int n27 = j[383];
            n27 -= j[384];
            l13 = l25 ^ ((long)((int)l13 + (int)l12) ^ l25) & -1L >>> (n27 -= j[385]);
        }
        INSTANCE = new MediaPlayerInfoModule();
        c = INSTANCE.draggable(INSTANCE.getName(), 210.0f, 120.0f);
        int n28 = j[386];
        n28 ^= j[387];
        n28 -= j[388];
        int n29 = j[389];
        n29 -= j[390];
        String[] stringArray = new String[n29 -= j[391]];
        int n30 = j[392];
        n30 ^= j[393];
        int n31 = j[395];
        n31 ^= j[396];
        stringArray[n30 += MediaPlayerInfoModule.j[394]] = (String)G[n31 ^= j[397]];
        int n32 = j[398];
        n32 -= j[399];
        int n33 = 94;
        n33 -= -24;
        stringArray[n32 += 124] = (String)G[n33 += -107];
        int n34 = 5;
        n34 -= 85;
        int n35 = 47;
        n35 += -83;
        C = Module.mode$default(INSTANCE, (String)G[n28], CollectionsKt.listOf(stringArray), n34 -= -80, n35 += 40, null);
        int n36 = 57;
        n36 -= -55;
        d = new TextScroller(0L, n36 -= 111, null);
        int n37 = -20;
        n37 += 32;
        D = new TextScroller(0L, n37 += -11, null);
        e = new AnimationUtil();
    }

    public static Object a(Object[] object) {
        Object object2;
        int n2 = (Integer)object[1];
        String string = (String)object[2];
        object = object[0];
        Object[] objectArray = i;
        if (i == null) {
            objectArray = i = new Object[1];
        }
        if ((object2 = objectArray[n2]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[1];
                h = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[0x3A45 ^ 0x3A55];
                byArray[0xBED6 ^ 0xBED4] = 0xBEAF ^ 0xBED4;
                byArray[0x90EA ^ 0x90E9] = 0x90B5 ^ 0x90E9;
                byArray[0xC0F6 ^ 0xC0FB] = 0xC09A ^ 0xC0FB;
                byArray[0xAE6 ^ 0xAEF] = 0xFFFFF56B ^ 0xAEF;
                byArray[0x3ABE ^ 0x3AB9] = 0xFFFFC53B ^ 0x3AB9;
                byArray[0x6D8C ^ 0x6D80] = 0x6DBD ^ 0x6D80;
                byArray[0x5275 ^ 0x527A] = 0xFFFFADB9 ^ 0x527A;
                byArray[0x5F06 ^ 0x5F07] = 0xFFFFA0C2 ^ 0x5F07;
                byArray[0xC921 ^ 0xC92A] = 0xFFFF36D1 ^ 0xC92A;
                byArray[0x819D ^ 0x8193] = 0xFFFF7E5A ^ 0x8193;
                byArray[0x20A ^ 0x20C] = 0x275 ^ 0x20C;
                byArray[0x4166 ^ 0x4162] = 0x416D ^ 0x4162;
                byArray[0x63B7 ^ 0x63B7] = 0xFFFF9C3E ^ 0x63B7;
                byArray[0x93D9 ^ 0x93DC] = 0x9389 ^ 0x93DC;
                byArray[0x10DBA ^ 0x10DB2] = 0x10D86 ^ 0x10DB2;
                byArray[0x10283 ^ 0x10289] = 0xFFFEFD66 ^ 0x10289;
                objectArray2[0] = byArray;
            }
            byte[] byArray = (byte[])object3[0];
            if (H == null) {
                byte[] byArray2 = new byte[0x7CCF ^ 0x7CEF];
                byArray2[0x3BBF ^ 0x3BA5] = 0x3BE8 ^ 0x3BA5;
                byArray2[0x54D9 ^ 0x54CB] = 0x54F0 ^ 0x54CB;
                byArray2[0x45D4 ^ 0x45C7] = 0xFFFFBA65 ^ 0x45C7;
                byArray2[0xE3A6 ^ 0xE3BE] = 0xFFFF1C2D ^ 0xE3BE;
                byArray2[0x9C67 ^ 0x9C6E] = 0x9C72 ^ 0x9C6E;
                byArray2[0x3220 ^ 0x3226] = 0xFFFFCDBA ^ 0x3226;
                byArray2[0xA407 ^ 0xA405] = 0xA40D ^ 0xA405;
                byArray2[0x4495 ^ 0x4481] = 0x44AB ^ 0x4481;
                byArray2[0x2255 ^ 0x225D] = 0x2211 ^ 0x225D;
                byArray2[0x6665 ^ 0x6668] = 0x6643 ^ 0x6668;
                byArray2[0x10C55 ^ 0x10C4E] = 0x10C1D ^ 0x10C4E;
                byArray2[0x10B68 ^ 0x10B71] = 0xFFFEF4E7 ^ 0x10B71;
                byArray2[0x3A1B ^ 0x3A04] = 0x3A5C ^ 0x3A04;
                byArray2[0xCC75 ^ 0xCC69] = 0xCC3B ^ 0xCC69;
                byArray2[0x7590 ^ 0x7585] = 0x75BB ^ 0x7585;
                byArray2[0x103EF ^ 0x103EE] = 0x103E9 ^ 0x103EE;
                byArray2[0xB3D7 ^ 0xB3C6] = 0xFFFF4C18 ^ 0xB3C6;
                byArray2[0x7ACD ^ 0x7ADB] = 0x7A8B ^ 0x7ADB;
                byArray2[0xAD13 ^ 0xAD18] = 0xAD7E ^ 0xAD18;
                byArray2[0xEA3D ^ 0xEA31] = 0xEA72 ^ 0xEA31;
                byArray2[0xDFB4 ^ 0xDFBA] = 0xDFD0 ^ 0xDFBA;
                byArray2[0x9DE2 ^ 0x9DE5] = 0xFFFF6214 ^ 0x9DE5;
                byArray2[0x308F ^ 0x308F] = 0x3081 ^ 0x308F;
                byArray2[0x83AA ^ 0x83B7] = 0x83C5 ^ 0x83B7;
                byArray2[0x303C ^ 0x302B] = 0xFFFFCFEE ^ 0x302B;
                byArray2[0x13A8 ^ 0x13A7] = 0x13F1 ^ 0x13A7;
                byArray2[0x80E4 ^ 0x80FA] = 0x80DC ^ 0x80FA;
                byArray2[0x7A8B ^ 0x7A9B] = 0x7AA4 ^ 0x7A9B;
                byArray2[0xE05C ^ 0xE059] = 0xE02E ^ 0xE059;
                byArray2[0xF8FC ^ 0xF8FF] = 0xFFFF0734 ^ 0xF8FF;
                byArray2[0xBE8E ^ 0xBE84] = 0xFFFF412A ^ 0xBE84;
                byArray2[0x79C0 ^ 0x79C4] = 0x79B0 ^ 0x79C4;
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, 0, byArray3, 0, byArray.length);
                System.arraycopy(byArray2, 0, byArray3, byArray.length, byArray2.length);
                Object object4 = MediaPlayerInfoModule.A()[1];
                if (object4 == null) {
                    char[] cArray = "\ufdb1\u040f\ufdb6\ufdcd\ufdcb\ufddf\ufdba\ufd28\ufe9d\ufd29\ufdc9\ufe94\ufea0\ufe6e\ufdbe\ufdc9\ufdc0\ufdd0".toCharArray();
                    for (int i2 = 0; i2 < 18; ++i2) {
                        int n3 = cArray[i2];
                        n3 += 21862;
                        n3 -= 51783;
                        n3 ^= 0x7E0B;
                        n3 ^= 0xED4B;
                        n3 -= 46349;
                        n3 ^= 0x49AF;
                        n3 ^= 0xD5CF;
                        n3 += 42386;
                        n3 -= 59092;
                        n3 ^= 0x9D57;
                        n3 += 24570;
                        n3 += 443;
                        cArray[i2] = (char)(n3 -= 34395);
                    }
                    object4 = MediaPlayerInfoModule.A()[1] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[16];
                byArray4[7] = -34;
                byArray4[14] = 0;
                byArray4[0] = 120;
                byArray4[9] = -77;
                byArray4[1] = 51;
                byArray4[12] = 29;
                byArray4[5] = -96;
                byArray4[4] = -114;
                byArray4[11] = -78;
                byArray4[8] = -56;
                byArray4[3] = 69;
                byArray4[13] = -1;
                byArray4[15] = 77;
                byArray4[6] = -22;
                byArray4[2] = 125;
                byArray4[10] = -68;
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, 1, 256);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = MediaPlayerInfoModule.A()[2];
                if (object5 == null) {
                    char[] cArray = "\u2a57\u2a53\u2a49".toCharArray();
                    for (int i3 = 0; i3 < 3; ++i3) {
                        int n4 = cArray[i3];
                        n4 -= 59296;
                        n4 += 1139;
                        n4 -= 8916;
                        n4 -= 2468;
                        n4 -= 18085;
                        n4 += 34759;
                        n4 ^= 0x32F7;
                        n4 ^= 0x9D8;
                        n4 += 55578;
                        n4 -= 14619;
                        cArray[i3] = (char)(n4 ^= 0xBB);
                    }
                    object5 = MediaPlayerInfoModule.A()[2] = new String(cArray);
                }
                H = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, 0, 16);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, 16, byArray6.length);
            Object object6 = MediaPlayerInfoModule.A()[3];
            if (object6 == null) {
                char[] cArray = "\u98e4\u98e8\u98b6\u98d2\u98e6\u98e9\u98e6\u98d2\u98b7\u98ce\u98e6\u98b6\u98d8\u98b7\u98c4\u98cb\u98cb\u988c\u9895\u98ca".toCharArray();
                for (int i4 = 0; i4 < 20; ++i4) {
                    int n5 = cArray[i4];
                    n5 += 528;
                    n5 ^= 0x2351;
                    n5 += 41729;
                    n5 ^= 0xC751;
                    n5 += 41986;
                    n5 ^= 0x1157;
                    n5 ^= 0x737;
                    n5 -= 45672;
                    n5 -= 62745;
                    n5 += 5866;
                    n5 += 3595;
                    cArray[i4] = (char)(n5 -= 42700);
                }
                object6 = MediaPlayerInfoModule.A()[3] = new String(cArray);
            }
            Cipher cipher = Cipher.getInstance((String)object6);
            cipher.init(2, (Key)((SecretKey)H), new IvParameterSpec(byArray7));
            byte[] byArray9 = cipher.doFinal(byArray8);
            object2 = new String(byArray9, StandardCharsets.UTF_8);
        }
        return object2;
    }

    private static Object[] A() {
        Object[] objectArray = I;
        if (I == null) {
            I = new Object[4];
            objectArray = I;
        }
        return objectArray;
    }

    public static void b() {
        j = new int[0x7B1F ^ 0x7A8F];
        MediaPlayerInfoModule.j[0xF00 ^ 0xF64] = 0xFFFFF0AD ^ 0xF64;
        MediaPlayerInfoModule.j[0x8BB ^ 0x8A5] = 0xFFFFF724 ^ 0x8A5;
        MediaPlayerInfoModule.j[0xEB49 ^ 0xEBB3] = 0xEBDB ^ 0xEBB3;
        MediaPlayerInfoModule.j[0x8A6A ^ 0x8B61] = 0x8B71 ^ 0x8B61;
        MediaPlayerInfoModule.j[0x5E1 ^ 0x4BD] = 0x4D0 ^ 0x4BD;
        MediaPlayerInfoModule.j[0x7D02 ^ 0x7DBC] = 0xFFFF8210 ^ 0x7DBC;
        MediaPlayerInfoModule.j[0x57A7 ^ 0x562B] = 0xFFFFA9C4 ^ 0x562B;
        MediaPlayerInfoModule.j[0x6DDC ^ 0x6DC3] = 0x6DE5 ^ 0x6DC3;
        MediaPlayerInfoModule.j[0xA128 ^ 0xA045] = 0xA005 ^ 0xA045;
        MediaPlayerInfoModule.j[0x7DA8 ^ 0x7CB5] = 0x7C8D ^ 0x7CB5;
        MediaPlayerInfoModule.j[0x463B ^ 0x476F] = 0x4730 ^ 0x476F;
        MediaPlayerInfoModule.j[0x4D11 ^ 0x4C4F] = 0xFFFFB3BF ^ 0x4C4F;
        MediaPlayerInfoModule.j[0x9EA ^ 0x90C] = 0xFFFFF684 ^ 0x90C;
        MediaPlayerInfoModule.j[0xC19 ^ 0xD0A] = 0xD74 ^ 0xD0A;
        MediaPlayerInfoModule.j[0x84F6 ^ 0x85C6] = 0xFFFF7A6D ^ 0x85C6;
        MediaPlayerInfoModule.j[0x89E3 ^ 0x88F2] = 0xFFFF771C ^ 0x88F2;
        MediaPlayerInfoModule.j[0x4AE ^ 0x43C] = 0x43D ^ 0x43C;
        MediaPlayerInfoModule.j[0x6EFF ^ 0x6EEF] = 0x6EBE ^ 0x6EEF;
        MediaPlayerInfoModule.j[0x4333 ^ 0x422A] = 0xFFFFBDB1 ^ 0x422A;
        MediaPlayerInfoModule.j[0x102D6 ^ 0x10269] = 0x10202 ^ 0x10269;
        MediaPlayerInfoModule.j[0x3D78 ^ 0x3D8C] = 0xFFFFC202 ^ 0x3D8C;
        MediaPlayerInfoModule.j[0x92E7 ^ 0x922D] = 0xFFFF6D95 ^ 0x922D;
        MediaPlayerInfoModule.j[0xEF19 ^ 0xEE20] = 0xEFA0 ^ 0xEE20;
        MediaPlayerInfoModule.j[0xC708 ^ 0xC677] = 0xC600 ^ 0xC677;
        MediaPlayerInfoModule.j[0x84A1 ^ 0x85F0] = 0xFFFF7A48 ^ 0x85F0;
        MediaPlayerInfoModule.j[0x7390 ^ 0x7365] = 0x7314 ^ 0x7365;
        MediaPlayerInfoModule.j[0xF069 ^ 0xF07A] = 0xF04D ^ 0xF07A;
        MediaPlayerInfoModule.j[0xE22F ^ 0xE3A0] = 0xE39A ^ 0xE3A0;
        MediaPlayerInfoModule.j[0x4207 ^ 0x426C] = 0x4223 ^ 0x426C;
        MediaPlayerInfoModule.j[0x9FF0 ^ 0x9F4D] = 0x9FF2 ^ 0x9F4D;
        MediaPlayerInfoModule.j[0xD123 ^ 0xD04A] = 0xFFFF2FD9 ^ 0xD04A;
        MediaPlayerInfoModule.j[0x79D5 ^ 0x78AB] = 0x7894 ^ 0x78AB;
        MediaPlayerInfoModule.j[0x104DC ^ 0x10431] = 0xFFFEFB8A ^ 0x10431;
        MediaPlayerInfoModule.j[0x6976 ^ 0x69D9] = 0x69AB ^ 0x69D9;
        MediaPlayerInfoModule.j[0x10852 ^ 0x1097A] = 0x1095D ^ 0x1097A;
        MediaPlayerInfoModule.j[0x2434 ^ 0x24B5] = 0x2484 ^ 0x24B5;
        MediaPlayerInfoModule.j[0xAB0D ^ 0xAB6E] = 0xFFFF54F3 ^ 0xAB6E;
        MediaPlayerInfoModule.j[0x9F54 ^ 0x9E10] = 0x2D41 ^ 0x9E10;
        MediaPlayerInfoModule.j[0x8F60 ^ 0x8F1E] = 0xFFFF70F1 ^ 0x8F1E;
        MediaPlayerInfoModule.j[0x3D57 ^ 0x3C4B] = 0x3C32 ^ 0x3C4B;
        MediaPlayerInfoModule.j[0x4806 ^ 0x4988] = 0xFFFFB637 ^ 0x4988;
        MediaPlayerInfoModule.j[0xF0C6 ^ 0xF1E1] = 0xF1F3 ^ 0xF1E1;
        MediaPlayerInfoModule.j[0xAD43 ^ 0xAD25] = 0xFFFF53EB ^ 0xAD25;
        MediaPlayerInfoModule.j[0x5D7A ^ 0x5D30] = 0xFFFFA287 ^ 0x5D30;
        MediaPlayerInfoModule.j[0xA277 ^ 0xA233] = 0xFFFF5DF5 ^ 0xA233;
        MediaPlayerInfoModule.j[0x100B ^ 0x10CB] = 0x1497 ^ 0x10CB;
        MediaPlayerInfoModule.j[0x65AB ^ 0x64F3] = 0xFFFF9B33 ^ 0x64F3;
        MediaPlayerInfoModule.j[0x7D0 ^ 0x76B] = 0xFFFFF8B7 ^ 0x76B;
        MediaPlayerInfoModule.j[0xC2BC ^ 0xC2AB] = 0xFFFF3D08 ^ 0xC2AB;
        MediaPlayerInfoModule.j[0x598 ^ 0x4DA] = 0x6D7 ^ 0x4DA;
        MediaPlayerInfoModule.j[0x1020B ^ 0x10324] = 0x10324 ^ 0x10324;
        MediaPlayerInfoModule.j[0x2D3C ^ 0x2D49] = 0x2C39 ^ 0x2D49;
        MediaPlayerInfoModule.j[0x22ED ^ 0x23FD] = 0x23E9 ^ 0x23FD;
        MediaPlayerInfoModule.j[0x1E28 ^ 0x1F36] = 0xFFFFE08A ^ 0x1F36;
        MediaPlayerInfoModule.j[0x1051C ^ 0x1045F] = 0x1508E ^ 0x1045F;
        MediaPlayerInfoModule.j[0x1ACB ^ 0x1A66] = 0x1A49 ^ 0x1A66;
        MediaPlayerInfoModule.j[0x7D10 ^ 0x7C18] = 0x7C63 ^ 0x7C18;
        MediaPlayerInfoModule.j[0xB58A ^ 0xB5AB] = 0xFFFF4AED ^ 0xB5AB;
        MediaPlayerInfoModule.j[0xA20F ^ 0xA267] = 0xFFFF5DE0 ^ 0xA267;
        MediaPlayerInfoModule.j[0x381B ^ 0x38AC] = 0xFFFFC766 ^ 0x38AC;
        MediaPlayerInfoModule.j[0xCCEF ^ 0xCCC7] = 0xFFFF334B ^ 0xCCC7;
        MediaPlayerInfoModule.j[0x8C44 ^ 0x8DC5] = 0xFFFF7220 ^ 0x8DC5;
        MediaPlayerInfoModule.j[0xB39D ^ 0xB3D6] = 0xFFFF4C76 ^ 0xB3D6;
        MediaPlayerInfoModule.j[0x465 ^ 0x506] = 0xFFFFFAE0 ^ 0x506;
        MediaPlayerInfoModule.j[0xEAD8 ^ 0xEBD5] = 0xEBF1 ^ 0xEBD5;
        MediaPlayerInfoModule.j[0xEA11 ^ 0xEB2E] = 0x7289 ^ 0xEB2E;
        MediaPlayerInfoModule.j[0x3DFA ^ 0x3D34] = 0xFFFFC2C5 ^ 0x3D34;
        MediaPlayerInfoModule.j[0xDD42 ^ 0xDDC0] = 0xDD90 ^ 0xDDC0;
        MediaPlayerInfoModule.j[0xFAEF ^ 0xFAA8] = 0xFAB3 ^ 0xFAA8;
        MediaPlayerInfoModule.j[0x51A9 ^ 0x5121] = 0x5179 ^ 0x5121;
        MediaPlayerInfoModule.j[0xA136 ^ 0xA176] = 0xFFFF5EFB ^ 0xA176;
        MediaPlayerInfoModule.j[0xC97B ^ 0xC83B] = 0x2331 ^ 0xC83B;
        MediaPlayerInfoModule.j[0x6C3 ^ 0x64E] = 0x658 ^ 0x64E;
        MediaPlayerInfoModule.j[0xF5D3 ^ 0xF55D] = 0xF554 ^ 0xF55D;
        MediaPlayerInfoModule.j[0x7C3E ^ 0x7C4F] = 0x7C62 ^ 0x7C4F;
        MediaPlayerInfoModule.j[0x1235 ^ 0x12E0] = 0x12CC ^ 0x12E0;
        MediaPlayerInfoModule.j[0x94A9 ^ 0x9497] = 0x94B8 ^ 0x9497;
        MediaPlayerInfoModule.j[0x6FFE ^ 0x6E8C] = 0xFFFF915D ^ 0x6E8C;
        MediaPlayerInfoModule.j[0x9506 ^ 0x9456] = 0x9472 ^ 0x9456;
        MediaPlayerInfoModule.j[0x9251 ^ 0x9360] = 0x9355 ^ 0x9360;
        MediaPlayerInfoModule.j[0x6A9F ^ 0x6BB4] = 0xFFFF9401 ^ 0x6BB4;
        MediaPlayerInfoModule.j[0xCE50 ^ 0xCE06] = 0xFFFF31F4 ^ 0xCE06;
        MediaPlayerInfoModule.j[0x3A93 ^ 0x3A3B] = 0xFFFFC5D0 ^ 0x3A3B;
        MediaPlayerInfoModule.j[0x682B ^ 0x6891] = 0x6B34 ^ 0x6891;
        MediaPlayerInfoModule.j[0xBB78 ^ 0xBB49] = 0xBB19 ^ 0xBB49;
        MediaPlayerInfoModule.j[0x3DB6 ^ 0x3DEC] = 0x3DD8 ^ 0x3DEC;
        MediaPlayerInfoModule.j[0x47A4 ^ 0x4620] = 0x463C ^ 0x4620;
        MediaPlayerInfoModule.j[0x7E03 ^ 0x7E9D] = 0xFFFF8175 ^ 0x7E9D;
        MediaPlayerInfoModule.j[0x327C ^ 0x3292] = 0xFFFFCD06 ^ 0x3292;
        MediaPlayerInfoModule.j[0x9CBC ^ 0x9CD5] = 0xFFFF6376 ^ 0x9CD5;
        MediaPlayerInfoModule.j[0x6F93 ^ 0x6F68] = 0xFFFF90AE ^ 0x6F68;
        MediaPlayerInfoModule.j[0x2910 ^ 0x29C9] = 0xFFFFD643 ^ 0x29C9;
        MediaPlayerInfoModule.j[0xF6BA ^ 0xF6F8] = 0xFFFF091F ^ 0xF6F8;
        MediaPlayerInfoModule.j[0x272E ^ 0x2761] = 0x2711 ^ 0x2761;
        MediaPlayerInfoModule.j[0x5EF4 ^ 0x5EBA] = 0x5ED0 ^ 0x5EBA;
        MediaPlayerInfoModule.j[0x66B9 ^ 0x66BB] = 0x66D0 ^ 0x66BB;
        MediaPlayerInfoModule.j[0x103CF ^ 0x1037F] = 0xFFFEFCD3 ^ 0x1037F;
        MediaPlayerInfoModule.j[0xD9A3 ^ 0xD88E] = 0xFFFF2750 ^ 0xD88E;
        MediaPlayerInfoModule.j[0x1CD2 ^ 0x1C3A] = 0xFFFFE395 ^ 0x1C3A;
        MediaPlayerInfoModule.j[0x24C ^ 0x311] = 0x37F ^ 0x311;
        MediaPlayerInfoModule.j[0x657D ^ 0x65BA] = 0x658D ^ 0x65BA;
        MediaPlayerInfoModule.j[0x12D3 ^ 0x12AB] = 0x12F6 ^ 0x12AB;
        MediaPlayerInfoModule.j[0xEB9F ^ 0xEBC3] = 0xEB94 ^ 0xEBC3;
        MediaPlayerInfoModule.j[0xD67D ^ 0xD63B] = 0xD67F ^ 0xD63B;
        MediaPlayerInfoModule.j[0x84E ^ 0x89E] = 0x8C6 ^ 0x89E;
        MediaPlayerInfoModule.j[0x1B14 ^ 0x1BA1] = 0xFFFFE464 ^ 0x1BA1;
        MediaPlayerInfoModule.j[0xFFB9 ^ 0xFF95] = 0xFFC9 ^ 0xFF95;
        MediaPlayerInfoModule.j[0x545E ^ 0x54C2] = 0x54C5 ^ 0x54C2;
        MediaPlayerInfoModule.j[0x8BFE ^ 0x8AD4] = 0x8AF1 ^ 0x8AD4;
        MediaPlayerInfoModule.j[0xA78D ^ 0xA76A] = 0xFFFF58E2 ^ 0xA76A;
        MediaPlayerInfoModule.j[0xCC4 ^ 0xC97] = 0xCF4 ^ 0xC97;
        MediaPlayerInfoModule.j[0xFA8B ^ 0xFA6A] = 0xFA08 ^ 0xFA6A;
        MediaPlayerInfoModule.j[0x7997 ^ 0x78AF] = 0x78AF ^ 0x78AF;
        MediaPlayerInfoModule.j[0x4402 ^ 0x454D] = 0xFFFFBA39 ^ 0x454D;
        MediaPlayerInfoModule.j[0x87D3 ^ 0x87F8] = 0x87DE ^ 0x87F8;
        MediaPlayerInfoModule.j[0xF028 ^ 0xF171] = 0xFFFF0EB8 ^ 0xF171;
        MediaPlayerInfoModule.j[0x8D9A ^ 0x8DE3] = 0xFFFF726E ^ 0x8DE3;
        MediaPlayerInfoModule.j[0x1E2D ^ 0x1F59] = 0x1F5B ^ 0x1F59;
        MediaPlayerInfoModule.j[0x1C71 ^ 0x1C65] = 0xFFFFE396 ^ 0x1C65;
        MediaPlayerInfoModule.j[0x704C ^ 0x7021] = 0x7005 ^ 0x7021;
        MediaPlayerInfoModule.j[0x1DD8 ^ 0x1D06] = 0x1DE7 ^ 0x1D06;
        MediaPlayerInfoModule.j[0xF474 ^ 0xF4F4] = 0xF4DB ^ 0xF4F4;
        MediaPlayerInfoModule.j[0x676F ^ 0x67FF] = 0xFFFF983F ^ 0x67FF;
        MediaPlayerInfoModule.j[0xDDDC ^ 0xDDB2] = 0xDDDE ^ 0xDDB2;
        MediaPlayerInfoModule.j[0xD513 ^ 0xD47F] = 0xD454 ^ 0xD47F;
        MediaPlayerInfoModule.j[0x1C7E ^ 0x1CA5] = 0x1CD9 ^ 0x1CA5;
        MediaPlayerInfoModule.j[0xA18D ^ 0xA0D8] = 0xA0F3 ^ 0xA0D8;
        MediaPlayerInfoModule.j[0xC83D ^ 0xC966] = 0xFFFF3640 ^ 0xC966;
        MediaPlayerInfoModule.j[0x75EC ^ 0x74D1] = 0xAB94 ^ 0x74D1;
        MediaPlayerInfoModule.j[0xF1A9 ^ 0xF0D9] = 0xF095 ^ 0xF0D9;
        MediaPlayerInfoModule.j[0xECD0 ^ 0xEDC6] = 0xEDE8 ^ 0xEDC6;
        MediaPlayerInfoModule.j[0xDA17 ^ 0xDAFC] = 0xFFFF2553 ^ 0xDAFC;
        MediaPlayerInfoModule.j[0x192E ^ 0x199C] = 0xFFFFE603 ^ 0x199C;
        MediaPlayerInfoModule.j[0xFC2E ^ 0xFDA3] = 0xFDD6 ^ 0xFDA3;
        MediaPlayerInfoModule.j[0x8A22 ^ 0x8AE6] = 0xFFFF7529 ^ 0x8AE6;
        MediaPlayerInfoModule.j[0x5B1A ^ 0x5B4F] = 0xFFFFA4DA ^ 0x5B4F;
        MediaPlayerInfoModule.j[0x10B01 ^ 0x10B00] = 0xFFFEF4A8 ^ 0x10B00;
        MediaPlayerInfoModule.j[0xC2FA ^ 0xC3C8] = 0xC3CB ^ 0xC3C8;
        MediaPlayerInfoModule.j[0x2588 ^ 0x2521] = 0x2560 ^ 0x2521;
        MediaPlayerInfoModule.j[0x5DAD ^ 0x5CCA] = 0xFFFFA32E ^ 0x5CCA;
        MediaPlayerInfoModule.j[0xE5FF ^ 0xE5FC] = 0xE55F ^ 0xE5FC;
        MediaPlayerInfoModule.j[0xE0F8 ^ 0xE030] = 0xE00D ^ 0xE030;
        MediaPlayerInfoModule.j[0xC8B6 ^ 0xC833] = 0xC834 ^ 0xC833;
        MediaPlayerInfoModule.j[0x99D5 ^ 0x98D3] = 0xFFFF674C ^ 0x98D3;
        MediaPlayerInfoModule.j[0xD203 ^ 0xD2B2] = 0xFFFF2D82 ^ 0xD2B2;
        MediaPlayerInfoModule.j[0x64F3 ^ 0x6404] = 0x6465 ^ 0x6404;
        MediaPlayerInfoModule.j[0xADD3 ^ 0xAC95] = 0x306E ^ 0xAC95;
        MediaPlayerInfoModule.j[0xB012 ^ 0xB15A] = 0xB15A ^ 0xB15A;
        MediaPlayerInfoModule.j[0x19B0 ^ 0x18E6] = 0x18C7 ^ 0x18E6;
        MediaPlayerInfoModule.j[0x123E ^ 0x129E] = 0xFFFFED7B ^ 0x129E;
        MediaPlayerInfoModule.j[0xC524 ^ 0xC5B5] = 0xFFFF3A6A ^ 0xC5B5;
        MediaPlayerInfoModule.j[0x950E ^ 0x9485] = 0xFFFF6B0F ^ 0x9485;
        MediaPlayerInfoModule.j[0xCCB9 ^ 0xCDA1] = 0xCDF3 ^ 0xCDA1;
        MediaPlayerInfoModule.j[0x2F0B ^ 0x2FD6] = 0x2F90 ^ 0x2FD6;
        MediaPlayerInfoModule.j[0xC4CC ^ 0xC458] = 0xFFFF3BFF ^ 0xC458;
        MediaPlayerInfoModule.j[0xC2BB ^ 0xC22E] = 0xFFFF3D9C ^ 0xC22E;
        MediaPlayerInfoModule.j[0x10617 ^ 0x10668] = 0x10639 ^ 0x10668;
        MediaPlayerInfoModule.j[0x895F ^ 0x89C7] = 0x89AD ^ 0x89C7;
        MediaPlayerInfoModule.j[0xB4BC ^ 0xB45C] = 0xB431 ^ 0xB45C;
        MediaPlayerInfoModule.j[0x50FC ^ 0x517C] = 0x510E ^ 0x517C;
        MediaPlayerInfoModule.j[0xEBA1 ^ 0xEB0D] = 0xEB48 ^ 0xEB0D;
        MediaPlayerInfoModule.j[0xCAF6 ^ 0xCBDF] = 0xCBA6 ^ 0xCBDF;
        MediaPlayerInfoModule.j[0x2132 ^ 0x216C] = 0xFFFFDED0 ^ 0x216C;
        MediaPlayerInfoModule.j[0xFE6B ^ 0xFE07] = 0xFE4F ^ 0xFE07;
        MediaPlayerInfoModule.j[0x23A4 ^ 0x22AD] = 0xFFFFDD39 ^ 0x22AD;
        MediaPlayerInfoModule.j[0x10FFC ^ 0x10F10] = 0x10F23 ^ 0x10F10;
        MediaPlayerInfoModule.j[0xA1CE ^ 0xA0CE] = 0xFFFF5F63 ^ 0xA0CE;
        MediaPlayerInfoModule.j[0x4103 ^ 0x4089] = 0x40E5 ^ 0x4089;
        MediaPlayerInfoModule.j[0x58B1 ^ 0x58D6] = 0xFFFFA76F ^ 0x58D6;
        MediaPlayerInfoModule.j[0x6055 ^ 0x6037] = 0x6030 ^ 0x6037;
        MediaPlayerInfoModule.j[0xC6AE ^ 0xC6AA] = 0xFFFF3967 ^ 0xC6AA;
        MediaPlayerInfoModule.j[0x590E ^ 0x595E] = 0xFFFFA6A5 ^ 0x595E;
        MediaPlayerInfoModule.j[0x4E52 ^ 0x4F21] = 0x4F45 ^ 0x4F21;
        MediaPlayerInfoModule.j[0xE6F0 ^ 0xE621] = 0xFFFF19E5 ^ 0xE621;
        MediaPlayerInfoModule.j[0x78AB ^ 0x7827] = 0xFFFF87DC ^ 0x7827;
        MediaPlayerInfoModule.j[0x9E03 ^ 0x9E0A] = 0x9E31 ^ 0x9E0A;
        MediaPlayerInfoModule.j[0x3792 ^ 0x3745] = 0xFFFFC8A1 ^ 0x3745;
        MediaPlayerInfoModule.j[0x1B7F ^ 0x1BE9] = 0x1BB0 ^ 0x1BE9;
        MediaPlayerInfoModule.j[0xE101 ^ 0xE1A7] = 0xFFFF1E0D ^ 0xE1A7;
        MediaPlayerInfoModule.j[0xA6A1 ^ 0xA653] = 0xA66F ^ 0xA653;
        MediaPlayerInfoModule.j[0x9775 ^ 0x9608] = 0x9664 ^ 0x9608;
        MediaPlayerInfoModule.j[0x6E ^ 0xD2] = 0xC5 ^ 0xD2;
        MediaPlayerInfoModule.j[0x4446 ^ 0x44F5] = 0x4486 ^ 0x44F5;
        MediaPlayerInfoModule.j[0x9347 ^ 0x93BA] = 0x93A3 ^ 0x93BA;
        MediaPlayerInfoModule.j[0xCD07 ^ 0xCD55] = 0xCD55 ^ 0xCD55;
        MediaPlayerInfoModule.j[0xB58E ^ 0xB513] = 0xB507 ^ 0xB513;
        MediaPlayerInfoModule.j[0xB3B7 ^ 0xB348] = 0xFFFF4C90 ^ 0xB348;
        MediaPlayerInfoModule.j[0xA9C5 ^ 0xA98C] = 0xFFFF5672 ^ 0xA98C;
        MediaPlayerInfoModule.j[0x8E47 ^ 0x8F2F] = 0x8F68 ^ 0x8F2F;
        MediaPlayerInfoModule.j[0x6A7F ^ 0x6BF7] = 0x6BD6 ^ 0x6BF7;
        MediaPlayerInfoModule.j[0x1340 ^ 0x1308] = 0xFFFFEC9D ^ 0x1308;
        MediaPlayerInfoModule.j[0xC857 ^ 0xC8AB] = 0xFFFF3734 ^ 0xC8AB;
        MediaPlayerInfoModule.j[0x44F8 ^ 0x4492] = 0x449D ^ 0x4492;
        MediaPlayerInfoModule.j[0xD9B8 ^ 0xD8EF] = 0xD883 ^ 0xD8EF;
        MediaPlayerInfoModule.j[0x665D ^ 0x6746] = 0x6722 ^ 0x6746;
        MediaPlayerInfoModule.j[0x90ED ^ 0x9008] = 0x9038 ^ 0x9008;
        MediaPlayerInfoModule.j[0x667C ^ 0x6643] = 0x664C ^ 0x6643;
        MediaPlayerInfoModule.j[0xEE92 ^ 0xEE9F] = 0xFFFF1126 ^ 0xEE9F;
        MediaPlayerInfoModule.j[0x92D5 ^ 0x9274] = 0x924F ^ 0x9274;
        MediaPlayerInfoModule.j[0xE637 ^ 0xE70C] = 0xBC8D ^ 0xE70C;
        MediaPlayerInfoModule.j[0x690 ^ 0x617] = 0xFFFFF9FC ^ 0x617;
        MediaPlayerInfoModule.j[0x1E00 ^ 0x1E84] = 0x1EC6 ^ 0x1E84;
        MediaPlayerInfoModule.j[0xCDD2 ^ 0xCD3B] = 0xCD1C ^ 0xCD3B;
        MediaPlayerInfoModule.j[0xD2E9 ^ 0xD22A] = 0xD28D ^ 0xD22A;
        MediaPlayerInfoModule.j[0x6CFE ^ 0x6CDC] = 0xFFFF937F ^ 0x6CDC;
        MediaPlayerInfoModule.j[0x53C0 ^ 0x52E0] = 0xFFFFAD12 ^ 0x52E0;
        MediaPlayerInfoModule.j[0x89DA ^ 0x892A] = 0xFFFF76C0 ^ 0x892A;
        MediaPlayerInfoModule.j[0xA617 ^ 0xA6B2] = 0xA6E3 ^ 0xA6B2;
        MediaPlayerInfoModule.j[0x6AB1 ^ 0x6BC4] = 0x6B82 ^ 0x6BC4;
        MediaPlayerInfoModule.j[0xE020 ^ 0xE106] = 0xE145 ^ 0xE106;
        MediaPlayerInfoModule.j[0xCBB8 ^ 0xCAFF] = 0x5622 ^ 0xCAFF;
        MediaPlayerInfoModule.j[0x179B ^ 0x175A] = 0x171C ^ 0x175A;
        MediaPlayerInfoModule.j[0x24FD ^ 0x24D4] = 0xFFFFDB4C ^ 0x24D4;
        MediaPlayerInfoModule.j[0x506C ^ 0x5148] = 0xFFFFAEA7 ^ 0x5148;
        MediaPlayerInfoModule.j[0x49B9 ^ 0x49CA] = 0x49DA ^ 0x49CA;
        MediaPlayerInfoModule.j[0x9DED ^ 0x9C97] = 0xFFFF6373 ^ 0x9C97;
        MediaPlayerInfoModule.j[0x479C ^ 0x4796] = 0xFFFFB842 ^ 0x4796;
        MediaPlayerInfoModule.j[0xF83E ^ 0xF802] = 0xF88A ^ 0xF802;
        MediaPlayerInfoModule.j[0x42EF ^ 0x42E4] = 0x42F8 ^ 0x42E4;
        MediaPlayerInfoModule.j[0x2008 ^ 0x2068] = 0xFFFFDC02 ^ 0x2068;
        MediaPlayerInfoModule.j[0x1DEB ^ 0x1D29] = 0x1D13 ^ 0x1D29;
        MediaPlayerInfoModule.j[0x9CCB ^ 0x9D8E] = 0x1596 ^ 0x9D8E;
        MediaPlayerInfoModule.j[0x139A ^ 0x12EC] = 0x12A1 ^ 0x12EC;
        MediaPlayerInfoModule.j[0x1F04 ^ 0x1F1D] = 0xFFFFE0E3 ^ 0x1F1D;
        MediaPlayerInfoModule.j[0x33E7 ^ 0x332A] = 0xFFFFCCBE ^ 0x332A;
        MediaPlayerInfoModule.j[0xBCD9 ^ 0xBDBC] = 0xFFFF4267 ^ 0xBDBC;
        MediaPlayerInfoModule.j[0x9FD2 ^ 0x9FA4] = 0x9F82 ^ 0x9FA4;
        MediaPlayerInfoModule.j[0xA267 ^ 0xA35D] = 0x3EFD ^ 0xA35D;
        MediaPlayerInfoModule.j[0xFE02 ^ 0xFE8B] = 0xFFFF0118 ^ 0xFE8B;
        MediaPlayerInfoModule.j[0x6E2E ^ 0x6EE1] = 0x6E75 ^ 0x6EE1;
        MediaPlayerInfoModule.j[0x100E8 ^ 0x100DE] = 0x100A2 ^ 0x100DE;
        MediaPlayerInfoModule.j[0x4043 ^ 0x4122] = 0xFFFFBEA7 ^ 0x4122;
        MediaPlayerInfoModule.j[0xEDC4 ^ 0xED81] = 0xEDFE ^ 0xED81;
        MediaPlayerInfoModule.j[0xDCF9 ^ 0xDC2A] = 0xFFFF23EC ^ 0xDC2A;
        MediaPlayerInfoModule.j[0xD31D ^ 0xD21A] = 0xD24E ^ 0xD21A;
        MediaPlayerInfoModule.j[0x5FB ^ 0x514] = 0x53A ^ 0x514;
        MediaPlayerInfoModule.j[0xF93A ^ 0xF9D0] = 0xFFFF064D ^ 0xF9D0;
        MediaPlayerInfoModule.j[0x3B1D ^ 0x3BD6] = 0x3BFD ^ 0x3BD6;
        MediaPlayerInfoModule.j[0xD005 ^ 0xD09A] = 0xFFFF2F45 ^ 0xD09A;
        MediaPlayerInfoModule.j[0x10B25 ^ 0x10BDD] = 0x10BA7 ^ 0x10BDD;
        MediaPlayerInfoModule.j[0xE738 ^ 0xE7E0] = 0xE78B ^ 0xE7E0;
        MediaPlayerInfoModule.j[0x1EAF ^ 0x1FC1] = 0xFFFFE013 ^ 0x1FC1;
        MediaPlayerInfoModule.j[0xDA29 ^ 0xDA9F] = 0xFFFF254B ^ 0xDA9F;
        MediaPlayerInfoModule.j[0x900A ^ 0x9091] = 0x90C8 ^ 0x9091;
        MediaPlayerInfoModule.j[0xEFD7 ^ 0xEEB7] = 0xFFFF1176 ^ 0xEEB7;
        MediaPlayerInfoModule.j[0x4ADC ^ 0x4AF8] = 0xFFFFB546 ^ 0x4AF8;
        MediaPlayerInfoModule.j[0x6EC1 ^ 0x6FED] = 0x6FAA ^ 0x6FED;
        MediaPlayerInfoModule.j[0x10CB7 ^ 0x10C61] = 0x10C51 ^ 0x10C61;
        MediaPlayerInfoModule.j[0xCD9C ^ 0xCD6A] = 0xCD73 ^ 0xCD6A;
        MediaPlayerInfoModule.j[0xCF4E ^ 0xCF03] = 0xFFFF30D3 ^ 0xCF03;
        MediaPlayerInfoModule.j[0x88F5 ^ 0x89E0] = 0xFFFF760E ^ 0x89E0;
        MediaPlayerInfoModule.j[0xDCA3 ^ 0xDDEA] = 0xFFFF2276 ^ 0xDDEA;
        MediaPlayerInfoModule.j[0x2751 ^ 0x2650] = 0x262C ^ 0x2650;
        MediaPlayerInfoModule.j[0xCB9D ^ 0xCA18] = 0xFFFF3544 ^ 0xCA18;
        MediaPlayerInfoModule.j[0x240A ^ 0x2477] = 0xFFFFDBC7 ^ 0x2477;
        MediaPlayerInfoModule.j[0xAB1B ^ 0xAA35] = 0xAA4E ^ 0xAA35;
        MediaPlayerInfoModule.j[0x3B2F ^ 0x3B12] = 0xFFFFC4B4 ^ 0x3B12;
        MediaPlayerInfoModule.j[0xCA8B ^ 0xCA7A] = 0xFFFF35AD ^ 0xCA7A;
        MediaPlayerInfoModule.j[0x625C ^ 0x624A] = 0x627C ^ 0x624A;
        MediaPlayerInfoModule.j[0x9FB3 ^ 0x9E34] = 0xFFFF6189 ^ 0x9E34;
        MediaPlayerInfoModule.j[0xDC04 ^ 0xDC33] = 0xFFFF2391 ^ 0xDC33;
        MediaPlayerInfoModule.j[0x2459 ^ 0x2457] = 0x246A ^ 0x2457;
        MediaPlayerInfoModule.j[0xF784 ^ 0xF6E0] = 0xF6F8 ^ 0xF6E0;
        MediaPlayerInfoModule.j[0x81E0 ^ 0x81CE] = 0xFFFF7E68 ^ 0x81CE;
        MediaPlayerInfoModule.j[0x7A8D ^ 0x7A9F] = 0xFFFF8569 ^ 0x7A9F;
        MediaPlayerInfoModule.j[0x66D0 ^ 0x66F3] = 0x668E ^ 0x66F3;
        MediaPlayerInfoModule.j[0x7B69 ^ 0x7B38] = 0x7B5B ^ 0x7B38;
        MediaPlayerInfoModule.j[0xC477 ^ 0xC4E4] = 0xC423 ^ 0xC4E4;
        MediaPlayerInfoModule.j[0x8DCD ^ 0x8CBC] = 0xFFFF7319 ^ 0x8CBC;
        MediaPlayerInfoModule.j[0x10AA7 ^ 0x10AFE] = 0xFFFEF55C ^ 0x10AFE;
        MediaPlayerInfoModule.j[0x9A4A ^ 0x9AE9] = 0x9ADD ^ 0x9AE9;
        MediaPlayerInfoModule.j[0xA9D2 ^ 0xA8B0] = 0xA8F3 ^ 0xA8B0;
        MediaPlayerInfoModule.j[0xD235 ^ 0xD301] = 0xD300 ^ 0xD301;
        MediaPlayerInfoModule.j[0xFBA9 ^ 0xFB65] = 0xFFFF0720 ^ 0xFB65;
        MediaPlayerInfoModule.j[0x2137 ^ 0x202D] = 0x2036 ^ 0x202D;
        MediaPlayerInfoModule.j[0xD3A1 ^ 0xD29D] = 0x981C ^ 0xD29D;
        MediaPlayerInfoModule.j[0xCBED ^ 0xCBCB] = 0xFFFF3477 ^ 0xCBCB;
        MediaPlayerInfoModule.j[0xF371 ^ 0xF376] = 0xFFFF0CE8 ^ 0xF376;
        MediaPlayerInfoModule.j[0xCB21 ^ 0xCB39] = 0xFFFF34A1 ^ 0xCB39;
        MediaPlayerInfoModule.j[0x10097 ^ 0x10194] = 0xFFFEFE37 ^ 0x10194;
        MediaPlayerInfoModule.j[0x267C ^ 0x2716] = 0xFFFFD8B6 ^ 0x2716;
        MediaPlayerInfoModule.j[0x101DB ^ 0x101A9] = 0xFFFEFED9 ^ 0x101A9;
        MediaPlayerInfoModule.j[0x5D74 ^ 0x5D2B] = 0xFFFFA2F0 ^ 0x5D2B;
        MediaPlayerInfoModule.j[0x103F2 ^ 0x10320] = 0xFFFEF8BA ^ 0x10320;
        MediaPlayerInfoModule.j[0x1C5D ^ 0x1D24] = 0x1D8E ^ 0x1D24;
        MediaPlayerInfoModule.j[0x101A6 ^ 0x100AC] = 0xFFFEFF5E ^ 0x100AC;
        MediaPlayerInfoModule.j[0x20A5 ^ 0x20BF] = 0x20F9 ^ 0x20BF;
        MediaPlayerInfoModule.j[0x4A9C ^ 0x4A40] = 0x4A76 ^ 0x4A40;
        MediaPlayerInfoModule.j[0x95A9 ^ 0x9526] = 0x953C ^ 0x9526;
        MediaPlayerInfoModule.j[0xB34B ^ 0xB247] = 0xFFFF4DAB ^ 0xB247;
        MediaPlayerInfoModule.j[0x4CA1 ^ 0x4CBC] = 0xFFFFB335 ^ 0x4CBC;
        MediaPlayerInfoModule.j[0xB5C6 ^ 0xB4A0] = 0xB4BD ^ 0xB4A0;
        MediaPlayerInfoModule.j[0x8290 ^ 0x83DD] = 0xFFFF7C53 ^ 0x83DD;
        MediaPlayerInfoModule.j[0xE567 ^ 0xE526] = 0xFFFF1ABA ^ 0xE526;
        MediaPlayerInfoModule.j[0x7143 ^ 0x7054] = 0xFFFF8FA5 ^ 0x7054;
        MediaPlayerInfoModule.j[0x49C9 ^ 0x48CB] = 0xFFFFB707 ^ 0x48CB;
        MediaPlayerInfoModule.j[0x1045 ^ 0x1075] = 0xFFFFEF31 ^ 0x1075;
        MediaPlayerInfoModule.j[0xDBAB ^ 0xDB8B] = 0xDBD1 ^ 0xDB8B;
        MediaPlayerInfoModule.j[0x4336 ^ 0x4214] = 0xFFFFBDF7 ^ 0x4214;
        MediaPlayerInfoModule.j[0x5A24 ^ 0x5B65] = 0xFD09 ^ 0x5B65;
        MediaPlayerInfoModule.j[0x53EF ^ 0x5393] = 0xFFFFAC2B ^ 0x5393;
        MediaPlayerInfoModule.j[0xCCBE ^ 0xCDA1] = 0xFFFF322A ^ 0xCDA1;
        MediaPlayerInfoModule.j[0x9D84 ^ 0x9D20] = 0xFFFF6290 ^ 0x9D20;
        MediaPlayerInfoModule.j[0x1397 ^ 0x1215] = 0xFFFFED9F ^ 0x1215;
        MediaPlayerInfoModule.j[0x8A6 ^ 0x8F2] = 0xFFFFF775 ^ 0x8F2;
        MediaPlayerInfoModule.j[0xCE77 ^ 0xCF00] = 0xCF7A ^ 0xCF00;
        MediaPlayerInfoModule.j[0x1F4A ^ 0x1F95] = 0x1FE0 ^ 0x1F95;
        MediaPlayerInfoModule.j[0x85AB ^ 0x85DF] = 0xFFFF7A5E ^ 0x85DF;
        MediaPlayerInfoModule.j[0x85 ^ 0x31] = 0xFFFFFFC4 ^ 0x31;
        MediaPlayerInfoModule.j[0xE5B5 ^ 0xE52C] = 0xFFFF1AAC ^ 0xE52C;
        MediaPlayerInfoModule.j[0x3F2B ^ 0x3F06] = 0xFFFFC07D ^ 0x3F06;
        MediaPlayerInfoModule.j[0xDDE7 ^ 0xDCC2] = 0xDCA9 ^ 0xDCC2;
        MediaPlayerInfoModule.j[0x3955 ^ 0x390D] = 0xFFFFC6EB ^ 0x390D;
        MediaPlayerInfoModule.j[0x3FFB ^ 0x3F05] = 0xFFFFC080 ^ 0x3F05;
        MediaPlayerInfoModule.j[0xB542 ^ 0xB475] = 0xB475 ^ 0xB475;
        MediaPlayerInfoModule.j[0x6E25 ^ 0x6E34] = 0x6E38 ^ 0x6E34;
        MediaPlayerInfoModule.j[0x7305 ^ 0x73AE] = 0x73D6 ^ 0x73AE;
        MediaPlayerInfoModule.j[0xFB91 ^ 0xFB9E] = 0xFFFF043A ^ 0xFB9E;
        MediaPlayerInfoModule.j[0x8E9 ^ 0x9ED] = 0x982 ^ 0x9ED;
        MediaPlayerInfoModule.j[0xF0A0 ^ 0xF098] = 0xF086 ^ 0xF098;
        MediaPlayerInfoModule.j[0xACED ^ 0xAC96] = 0xAC9F ^ 0xAC96;
        MediaPlayerInfoModule.j[0xBEF2 ^ 0xBFC7] = 0xBFC7 ^ 0xBFC7;
        MediaPlayerInfoModule.j[0xD7C8 ^ 0xD72C] = 0xFFFF2874 ^ 0xD72C;
        MediaPlayerInfoModule.j[0x1098D ^ 0x109B6] = 0x109A4 ^ 0x109B6;
        MediaPlayerInfoModule.j[0x507F ^ 0x5073] = 0xFFFFAFF7 ^ 0x5073;
        MediaPlayerInfoModule.j[0xEE65 ^ 0xEF71] = 0xEF6D ^ 0xEF71;
        MediaPlayerInfoModule.j[0xB81D ^ 0xB951] = 0xB92A ^ 0xB951;
        MediaPlayerInfoModule.j[0x16A4 ^ 0x160E] = 0xFFFFE9A8 ^ 0x160E;
        MediaPlayerInfoModule.j[0x931 ^ 0x9EB] = 0xFFFFF61E ^ 0x9EB;
        MediaPlayerInfoModule.j[0x93BA ^ 0x92D5] = 0xFFFF6D27 ^ 0x92D5;
        MediaPlayerInfoModule.j[0x52FA ^ 0x52CE] = 0xFFFFAD77 ^ 0x52CE;
        MediaPlayerInfoModule.j[0x4308 ^ 0x43CE] = 0x47DA ^ 0x43CE;
        MediaPlayerInfoModule.j[0xE446 ^ 0xE508] = 0xE523 ^ 0xE508;
        MediaPlayerInfoModule.j[0xBC09 ^ 0xBCEB] = 0xFFFF4329 ^ 0xBCEB;
        MediaPlayerInfoModule.j[0x7931 ^ 0x78B2] = 0xFFFF8711 ^ 0x78B2;
        MediaPlayerInfoModule.j[0x81DF ^ 0x81C3] = 0xFFFF7E5D ^ 0x81C3;
        MediaPlayerInfoModule.j[0x1A50 ^ 0x1AE9] = 0x1A83 ^ 0x1AE9;
        MediaPlayerInfoModule.j[0xA673 ^ 0xA740] = 0xA740 ^ 0xA740;
        MediaPlayerInfoModule.j[0x4243 ^ 0x4264] = 0x4250 ^ 0x4264;
        MediaPlayerInfoModule.j[0x61A3 ^ 0x602A] = 0xFFFF9F9F ^ 0x602A;
        MediaPlayerInfoModule.j[0x4AAB ^ 0x4A58] = 0xFFFFB5A7 ^ 0x4A58;
        MediaPlayerInfoModule.j[0xA8AC ^ 0xA836] = 0xA800 ^ 0xA836;
        MediaPlayerInfoModule.j[0x835A ^ 0x8208] = 0xFFFF7DB1 ^ 0x8208;
        MediaPlayerInfoModule.j[0xFC46 ^ 0xFC40] = 0xFFFF0380 ^ 0xFC40;
        MediaPlayerInfoModule.j[0x7405 ^ 0x740D] = 0xFFFF8BED ^ 0x740D;
        MediaPlayerInfoModule.j[0xD4B4 ^ 0xD5FF] = 0xFFFF2A6F ^ 0xD5FF;
        MediaPlayerInfoModule.j[0xFE91 ^ 0xFF9F] = 0xFF9B ^ 0xFF9F;
        MediaPlayerInfoModule.j[0x5A98 ^ 0x5A12] = 0xFFFFA5D0 ^ 0x5A12;
        MediaPlayerInfoModule.j[0x97F9 ^ 0x96CF] = 0x96CD ^ 0x96CF;
        MediaPlayerInfoModule.j[0xA0B2 ^ 0xA097] = 0xFFFF5F49 ^ 0xA097;
        MediaPlayerInfoModule.j[0x881 ^ 0x993] = 0x9FE ^ 0x993;
        MediaPlayerInfoModule.j[0x8434 ^ 0x84D7] = 0xFFFF7B76 ^ 0x84D7;
        MediaPlayerInfoModule.j[0x6164 ^ 0x6157] = 0xFFFF9EA1 ^ 0x6157;
        MediaPlayerInfoModule.j[0x8EA2 ^ 0x8FAD] = 0x8FBC ^ 0x8FAD;
        MediaPlayerInfoModule.j[0xFF2 ^ 0xFBE] = 0xFFFFF04E ^ 0xFBE;
        MediaPlayerInfoModule.j[0x1922 ^ 0x19A4] = 0x198D ^ 0x19A4;
        MediaPlayerInfoModule.j[0x33BE ^ 0x338B] = 0x33B7 ^ 0x338B;
        MediaPlayerInfoModule.j[0x8CC7 ^ 0x8C44] = 0xFFFF7398 ^ 0x8C44;
        MediaPlayerInfoModule.j[0x1661 ^ 0x163C] = 0x165B ^ 0x163C;
        MediaPlayerInfoModule.j[0x7416 ^ 0x756A] = 0xFFFF8AD9 ^ 0x756A;
        MediaPlayerInfoModule.j[0x3DA ^ 0x374] = 0xFFFFFCB6 ^ 0x374;
        MediaPlayerInfoModule.j[0xCF74 ^ 0xCF6F] = 0xCF96 ^ 0xCF6F;
        MediaPlayerInfoModule.j[0x58B6 ^ 0x59E9] = 0xFFFFA646 ^ 0x59E9;
        MediaPlayerInfoModule.j[0xCA1F ^ 0xCA0A] = 0xFFFF35F3 ^ 0xCA0A;
        MediaPlayerInfoModule.j[0x6727 ^ 0x6770] = 0xFFFF9818 ^ 0x6770;
        MediaPlayerInfoModule.j[0xA37E ^ 0xA31F] = 0xFFFF5C92 ^ 0xA31F;
        MediaPlayerInfoModule.j[0xCA8 ^ 0xD8B] = 0xFFFFF208 ^ 0xD8B;
        MediaPlayerInfoModule.j[0xB7F2 ^ 0xB750] = 0xFFFF48D8 ^ 0xB750;
        MediaPlayerInfoModule.j[0xD416 ^ 0xD590] = 0xFFFF2A0D ^ 0xD590;
        MediaPlayerInfoModule.j[0x10503 ^ 0x105BB] = 0xFFFEFA77 ^ 0x105BB;
        MediaPlayerInfoModule.j[0xF9D ^ 0xFC6] = 0xF85 ^ 0xFC6;
        MediaPlayerInfoModule.j[0x15A9 ^ 0x1590] = 0x15FF ^ 0x1590;
        MediaPlayerInfoModule.j[0x7B88 ^ 0x7AD2] = 0x7AFB ^ 0x7AD2;
        MediaPlayerInfoModule.j[0xFF15 ^ 0xFFEC] = 0xFFFF0043 ^ 0xFFEC;
        MediaPlayerInfoModule.j[0xCFBD ^ 0xCFCA] = 0xCF80 ^ 0xCFCA;
        MediaPlayerInfoModule.j[0x1ED0 ^ 0x1EB5] = 0xFFFFE160 ^ 0x1EB5;
        MediaPlayerInfoModule.j[0x9033 ^ 0x9043] = 0xFFFF6FC1 ^ 0x9043;
        MediaPlayerInfoModule.j[0xA229 ^ 0xA2BE] = 0xA2AD ^ 0xA2BE;
        MediaPlayerInfoModule.j[0xAC2 ^ 0xA81] = 0xFFFFF53C ^ 0xA81;
        MediaPlayerInfoModule.j[0x10F1A ^ 0x10E61] = 0xFFFEF1F3 ^ 0x10E61;
        MediaPlayerInfoModule.j[0xC25B ^ 0xC365] = 0x1383 ^ 0xC365;
        MediaPlayerInfoModule.j[0xCBCA ^ 0xCBB0] = 0xFFFF347A ^ 0xCBB0;
        MediaPlayerInfoModule.j[0xAD9E ^ 0xAD9B] = 0xADC5 ^ 0xAD9B;
        MediaPlayerInfoModule.j[0x1002A ^ 0x10018] = 0x10068 ^ 0x10018;
        MediaPlayerInfoModule.j[0xF4D5 ^ 0xF410] = 0xF466 ^ 0xF410;
        MediaPlayerInfoModule.j[0xC3D1 ^ 0xC2D4] = 0xC261 ^ 0xC2D4;
        MediaPlayerInfoModule.j[0xC3E4 ^ 0xC2AE] = 0xC2BA ^ 0xC2AE;
        MediaPlayerInfoModule.j[0x2455 ^ 0x2506] = 0xFFFFDAE1 ^ 0x2506;
        MediaPlayerInfoModule.j[0xA6B2 ^ 0xA698] = 0xFFFF5972 ^ 0xA698;
        MediaPlayerInfoModule.j[0x3085 ^ 0x3022] = 0x3027 ^ 0x3022;
        MediaPlayerInfoModule.j[0x7110 ^ 0x717F] = 0xFFFF8EF0 ^ 0x717F;
        MediaPlayerInfoModule.j[0xDFBB ^ 0xDF30] = 0xDF53 ^ 0xDF30;
        MediaPlayerInfoModule.j[0x7994 ^ 0x79BB] = 0xFFFF866A ^ 0x79BB;
        MediaPlayerInfoModule.j[0x106ED ^ 0x10639] = 0xFFFEF9BD ^ 0x10639;
        MediaPlayerInfoModule.j[0x6B93 ^ 0x6AF8] = 0xFFFF956D ^ 0x6AF8;
        MediaPlayerInfoModule.j[0xB00E ^ 0xB00E] = 0xB0DF ^ 0xB00E;
        MediaPlayerInfoModule.j[0x227E ^ 0x235F] = 0xFFFFDCA6 ^ 0x235F;
        MediaPlayerInfoModule.j[0xF1B ^ 0xE63] = 0xFFFFF1D0 ^ 0xE63;
        MediaPlayerInfoModule.j[0x703D ^ 0x70F4] = 0xFFFF8F17 ^ 0x70F4;
        MediaPlayerInfoModule.j[0x68E7 ^ 0x68DD] = 0x68BC ^ 0x68DD;
    }
}

