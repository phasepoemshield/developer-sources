/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.module.modules.hud;

import java.awt.Color;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import kotakbaz.rain.client.draggable.animation.AnimationUtil;
import kotakbaz.rain.client.draggable.animation.Easing;
import kotakbaz.rain.client.extensions.a_0;
import kotakbaz.rain.client.util.render.RenderUtils;
import kotakbaz.rain.client.util.render.engine.controls.ClientRenderPipeline;
import kotakbaz.rain.client.util.render.font.E;
import kotakbaz.rain.client.util.render.font.Font;
import kotakbaz.rain.event.events.OverlayRenderEvent;
import kotakbaz.rain.mixin.BossBarHudAccessor;
import kotakbaz.rain.module.Module;
import kotakbaz.rain.module.modules.hud.b;
import kotakbaz.rain.module.modules.hud.container.HudStyle;
import kotakbaz.rain.module.modules.hud.f;
import kotakbaz.rain.module.modules.hud.g;
import kotakbaz.rain.module.modules.render.BetterHudModule;
import kotakbaz.rain.module.modules.render.RenderTweaksModule;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.text.CharsKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import net.minecraft.client.gui.hud.BossBarHud;
import net.minecraft.client.network.ClientPlayNetworkHandler;
import org.jetbrains.annotations.NotNull;
import sweetie.evaware.flora.api.Commando;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0003MNOB\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t\u00a2\u0006\u0004\b\f\u0010\u000bJ\r\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\rH\u0002\u00a2\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002\u00a2\u0006\u0004\b\u0017\u0010\u0018J\u0011\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002\u00a2\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\rH\u0002\u00a2\u0006\u0004\b\u001c\u0010\u000fJ\u000f\u0010\u001d\u001a\u00020\rH\u0002\u00a2\u0006\u0004\b\u001d\u0010\u000fJ\u000f\u0010\u001e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\b\u001e\u0010\u000fJ\u0017\u0010!\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001fH\u0002\u00a2\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0002\u00a2\u0006\u0004\b$\u0010%J\u001d\u0010)\u001a\u00020\r2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020'0&H\u0002\u00a2\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0016H\u0002\u00a2\u0006\u0004\b+\u0010\u0018J5\u0010.\u001a\u00020\u00062\f\u0010(\u001a\b\u0012\u0004\u0012\u00020'0&2\u0006\u0010,\u001a\u00020\r2\u0006\u0010-\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\rH\u0002\u00a2\u0006\u0004\b.\u0010/J'\u00104\u001a\u00020\r2\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u00020\r2\u0006\u00103\u001a\u00020\rH\u0002\u00a2\u0006\u0004\b4\u00105J\u001f\u00109\u001a\u0002062\u0006\u00107\u001a\u0002062\u0006\u00108\u001a\u00020\rH\u0002\u00a2\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\b;\u0010\u0003J\u000f\u0010<\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\b<\u0010\u0003R\u0014\u0010=\u001a\u00020\u00168\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010?\u001a\u00020\u00168\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b?\u0010>R\u0014\u0010@\u001a\u00020\u00168\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b@\u0010>R\u0014\u0010A\u001a\u00020\u00168\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bA\u0010>R\u0014\u0010B\u001a\u00020\u00168\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bB\u0010>R\u0014\u0010C\u001a\u00020\r8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010E\u001a\u00020\r8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bE\u0010DR\u0014\u0010F\u001a\u00020\r8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bF\u0010DR\u0014\u0010H\u001a\u00020G8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010K\u001a\u00020J8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bK\u0010L\u00a8\u0006P"}, d2={"Lkotakbaz/rain/module/modules/hud/WatermarkModule;", "Lkotakbaz/rain/module/Module;", "<init>", "()V", "Lkotakbaz/rain/event/events/OverlayRenderEvent;", "event", "", "onRender", "(Lkotakbaz/rain/event/events/OverlayRenderEvent;)V", "Lkotakbaz/rain/module/modules/hud/WatermarkModule$Bounds;", "currentBounds", "()Lkotakbaz/rain/module/modules/hud/WatermarkModule$Bounds;", "currentLogoBounds", "", "anchorTopY", "()F", "x", "y", "height", "alpha", "drawDivider", "(FFFF)V", "", "getPingText", "()Ljava/lang/String;", "Ljava/util/UUID;", "sessionUuid", "()Ljava/util/UUID;", "animatedTopY", "desiredTopY", "bossBarBottom", "", "totalBossBars", "visibleBossBarCount", "(I)I", "Lkotakbaz/rain/module/modules/hud/WatermarkModule$WatermarkLayout;", "buildLayout", "()Lkotakbaz/rain/module/modules/hud/WatermarkModule$WatermarkLayout;", "", "Lkotakbaz/rain/module/modules/hud/WatermarkModule$WatermarkPart;", "parts", "measure", "(Ljava/util/List;)F", "formattedRole", "startX", "topY", "drawParts", "(Ljava/util/List;FFF)V", "Lkotakbaz/rain/client/util/render/font/Font;", "font", "size", "containerHeight", "centeredTopOffset", "(Lkotakbaz/rain/client/util/render/font/Font;FF)F", "Ljava/awt/Color;", "color", "factor", "withAlpha", "(Ljava/awt/Color;F)Ljava/awt/Color;", "onEnable", "onDisable", "CLIENT_ICON", "Ljava/lang/String;", "USER_ICON", "PING_ICON", "FPS_ICON", "TIME_ICON", "BOSS_BAR_START_Y", "F", "BOSS_BAR_STEP", "BOSS_BAR_HEIGHT", "", "BOSS_BAR_ANIMATION_MILLIS", "J", "Lkotakbaz/rain/client/draggable/animation/AnimationUtil;", "bossBarOffsetAnimation", "Lkotakbaz/rain/client/draggable/animation/AnimationUtil;", "Bounds", "WatermarkPart", "WatermarkLayout", "rain-visuals"})
@SourceDebugExtension(value={"SMAP\nWatermarkModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WatermarkModule.kt\nkotakbaz/rain/module/modules/hud/WatermarkModule\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,336:1\n1#2:337\n777#3:338\n873#3,2:339\n*S KotlinDebug\n*F\n+ 1 WatermarkModule.kt\nkotakbaz/rain/module/modules/hud/WatermarkModule\n*L\n296#1:338\n296#1:339,2\n*E\n"})
public final class WatermarkModule
extends Module {
    @NotNull
    public static final WatermarkModule INSTANCE;
    @NotNull
    private static final String a = "a";
    @NotNull
    private static final String A = "w";
    @NotNull
    private static final String b = "k";
    @NotNull
    private static final String B = "j";
    @NotNull
    private static final String c = "l";
    private static final float C = 12.0f;
    private static final float d = 19.0f;
    private static final float D = 10.0f;
    private static final long e = 180L;
    @NotNull
    private static final AnimationUtil E;
    private static Object[] f;
    private static Object g;
    private static Object[] G;
    private static Object[] F;
    private static Object[] h;
    public static int[] H;

    private WatermarkModule() {
        int n2 = H[0];
        n2 += H[1];
        int n3 = H[3];
        n3 ^= H[4];
        int n4 = H[6];
        n4 ^= H[7];
        super((String)f[n2 -= H[2]], a_0.getHUD(), (String)f[n3 -= H[5]] + (String)f[n4 ^= H[8]]);
    }

    @Commando
    public final void onRender(@NotNull OverlayRenderEvent event) {
        int n2 = H[9];
        n2 ^= H[10];
        Intrinsics.checkNotNullParameter(event, (String)f[n2 -= H[11]]);
        float f2 = RangesKt.coerceIn(1.0f - BetterHudModule.INSTANCE.getTabProgress(), 0.0f, 1.0f);
        if (f2 <= 0.0f) {
            return;
        }
        g g2 = this.buildLayout();
        Color color = this.withAlpha(HudStyle.INSTANCE.getPANEL_COLOR(), f2);
        Color color2 = this.withAlpha(HudStyle.INSTANCE.getHEADER_COLOR(), f2 * 0.9f);
        RenderUtils.INSTANCE.getBLURRED_RECT().priority(ClientRenderPipeline.HUD_RECT).color(color).mix(0.9f).round(HudStyle.INSTANCE.scaled(6.0f)).draw(g2.getX(), g2.getY(), g2.getWidth(), g2.getHeight());
        RenderUtils.INSTANCE.getBLURRED_RECT().priority(ClientRenderPipeline.HUD_RECT).color(color2).mix(0.9f).round(0.0f).draw(g2.getCenterBackgroundX(), g2.getY(), g2.getCenterWidth(), g2.getHeight());
        this.drawParts(g2.getLeftParts(), g2.getLeftX(), g2.getY(), f2);
        this.drawParts(g2.getCenterParts(), g2.getCenterX(), g2.getY(), f2);
        this.drawParts(g2.getRightParts(), g2.getRightX(), g2.getY(), f2);
        int n3 = H[12];
        n3 ^= H[13];
        float f3 = g2.getLeftX() + this.measure(CollectionsKt.take((Iterable)g2.getLeftParts(), n3 -= H[14])) + HudStyle.INSTANCE.scaled(4.5f);
        this.drawDivider(f3, g2.getY(), g2.getHeight(), f2);
        int n4 = H[15];
        n4 -= H[16];
        float f4 = g2.getRightX() + this.measure(CollectionsKt.take((Iterable)g2.getRightParts(), n4 += H[17])) + HudStyle.INSTANCE.scaled(4.5f);
        this.drawDivider(f4, g2.getY(), g2.getHeight(), f2);
    }

    @NotNull
    public final b currentBounds() {
        g g2 = this.buildLayout();
        return new b(g2.getX(), g2.getY(), g2.getWidth(), g2.getHeight());
    }

    @NotNull
    public final b currentLogoBounds() {
        g g2 = this.buildLayout();
        return new b(g2.getCenterBackgroundX(), g2.getY(), g2.getCenterWidth(), g2.getHeight());
    }

    public final float anchorTopY() {
        return this.animatedTopY();
    }

    private final void drawDivider(float x2, float y, float height, float alpha2) {
        float f2 = HudStyle.INSTANCE.scaled(1.2f);
        float f3 = height / 3.5f;
        int n2 = H[18];
        n2 += H[19];
        n2 ^= H[20];
        int n3 = H[21];
        n3 -= H[22];
        int n4 = H[24];
        n4 += H[25];
        int n5 = H[27];
        n5 -= H[28];
        RenderUtils.INSTANCE.getBLURRED_RECT().priority(ClientRenderPipeline.HUD_RECT).color(this.withAlpha(new Color(n2, n3 ^= H[23], n4 -= H[26], n5 += H[29]), alpha2)).mix(0.9f).round(0.0f).draw(x2, y + height / 2.0f - f3 / 2.0f, f2, f3);
    }

    private final String getPingText() {
        long l2 = 792919801798613428L;
        Object object = kotakbaz.rain.client.extensions.b.getMc().player;
        if ((object == null || (object = object.getUuid()) == null) && (object = this.sessionUuid()) == null) {
            int n2 = H[30];
            n2 -= H[31];
            return (String)f[n2 += H[32]];
        }
        Object object2 = object;
        ClientPlayNetworkHandler clientPlayNetworkHandler = kotakbaz.rain.client.extensions.b.getMc().getNetworkHandler();
        if (clientPlayNetworkHandler == null || (clientPlayNetworkHandler = clientPlayNetworkHandler.getPlayerListEntry((UUID)object2)) == null) {
            int n3 = H[33];
            n3 ^= H[34];
            return (String)f[n3 -= H[35]];
        }
        int n4 = H[36];
        n4 -= H[37];
        long l3 = l2;
        int n5 = H[39];
        n5 ^= H[40];
        l2 = l3 ^ ((long)clientPlayNetworkHandler.getLatency() << (n4 ^= H[38]) ^ l3) & -1L << (n5 ^= H[41]);
        int n6 = H[42];
        n6 -= H[43];
        int n7 = H[45];
        n7 += H[46];
        return String.valueOf(RangesKt.coerceAtLeast((int)(l2 >>> (n6 += H[44])), n7 -= H[47]));
    }

    private final UUID sessionUuid() {
        Object object;
        long l2 = -4991321924879402399L;
        Object object2 = this;
        try {
            object = object2;
            long l3 = l2;
            int n2 = H[48];
            n2 += H[49];
            l2 = l3 ^ (0L ^ l3) & -1L << (n2 += H[50]);
            object = Result.cfr_renamed_1(kotakbaz.rain.client.extensions.b.getMc().getSession().getUuidOrNull());
        }
        catch (Throwable throwable) {
            object = Result.cfr_renamed_1(ResultKt.createFailure(throwable));
        }
        object2 = object;
        return (UUID)(Result.cfr_renamed_3(object2) ? null : object2);
    }

    private final float animatedTopY() {
        float f2 = HudStyle.INSTANCE.scaled(5.0f);
        float f3 = this.desiredTopY();
        boolean bl = H[51];
        bl ^= H[52];
        E.run(f3, 180L, Easing.b, bl -= H[53]);
        E.update();
        return Math.max(f2, E.get());
    }

    private final float desiredTopY() {
        float f2 = HudStyle.INSTANCE.scaled(5.0f);
        return Math.max(f2, this.bossBarBottom() + HudStyle.INSTANCE.scaled(4.0f));
    }

    private final float bossBarBottom() {
        Object object;
        long l2 = 8719076339869173314L;
        long l3 = 6141303029359413742L;
        if (RenderTweaksModule.INSTANCE.isEnabled() && ((Boolean)RenderTweaksModule.INSTANCE.getNoBossBar().getValue()).booleanValue()) {
            return 0.0f;
        }
        Object object2 = this;
        try {
            object = object2;
            long l4 = l2;
            int n2 = H[54];
            n2 ^= H[55];
            l2 = l4 ^ (0L ^ l4) & -1L << (n2 -= H[56]);
            BossBarHud bossBarHud = kotakbaz.rain.client.extensions.b.getMc().inGameHud.getBossBarHud();
            BossBarHudAccessor bossBarHudAccessor = bossBarHud instanceof BossBarHudAccessor ? (BossBarHudAccessor)bossBarHud : null;
            object = Result.cfr_renamed_1(bossBarHudAccessor != null ? bossBarHudAccessor.rain$getBossBars() : null);
        }
        catch (Throwable throwable) {
            object = Result.cfr_renamed_1(ResultKt.createFailure(throwable));
        }
        object2 = object;
        Map map = (Map)(Result.cfr_renamed_3(object2) ? null : object2);
        if (map == null) {
            return 0.0f;
        }
        Map map2 = map;
        if (map2.isEmpty()) {
            return 0.0f;
        }
        int n3 = H[57];
        n3 ^= H[58];
        long l5 = l3;
        int n4 = H[60];
        n4 ^= H[61];
        l3 = l5 ^ ((long)this.visibleBossBarCount(map2.size()) << (n3 ^= H[59]) ^ l5) & -1L << (n4 ^= H[62]);
        int n5 = H[63];
        n5 ^= H[64];
        if ((int)(l3 >>> (n5 += H[65])) <= 0) {
            return 0.0f;
        }
        int n6 = H[66];
        n6 += H[67];
        int n7 = H[69];
        n7 += H[70];
        return 12.0f + (float)((int)(l3 >>> (n6 += H[68])) - (n7 -= H[71])) * 19.0f + 10.0f;
    }

    private final int visibleBossBarCount(int totalBossBars) {
        long l2 = 4295550937813831202L;
        long l3 = -4852146338241513397L;
        long l4 = 7926562942076949206L;
        long l5 = 2679497571101595469L;
        long l6 = -7747616367386396790L;
        if (totalBossBars <= 0) {
            int n2 = H[72];
            n2 += H[73];
            return n2 ^= H[74];
        }
        int n3 = H[75];
        n3 += H[76];
        long l7 = l5;
        int n4 = H[78];
        n4 -= H[79];
        l5 = l7 ^ ((long)(kotakbaz.rain.client.extensions.b.getMc().getWindow().getScaledHeight() / (n3 -= H[77])) ^ l7) & -1L >>> (n4 += H[80]);
        long l8 = l6;
        int n5 = H[81];
        n5 -= H[82];
        l6 = l8 ^ (0L ^ l8) & -1L << (n5 -= H[83]);
        long l9 = l5;
        int n6 = H[84];
        n6 ^= H[85];
        l5 = l9 ^ (0xC00000000L ^ l9) & -1L << (n6 ^= H[86]);
        do {
            int n7 = H[87];
            n7 -= H[88];
            if ((int)(l6 >>> (n7 += H[89])) >= totalBossBars) break;
            l6 += 0x100000000L;
            int n8 = H[90];
            n8 += H[91];
        } while ((int)((l5 += 0x1300000000L) >>> (n8 -= H[92])) < (int)l5);
        int n9 = H[93];
        n9 += H[94];
        return (int)(l6 >>> (n9 += H[95]));
    }

    private final g buildLayout() {
        float f2 = HudStyle.INSTANCE.margin();
        float f3 = HudStyle.INSTANCE.headerTextSize() + f2 * 2.2f;
        float f4 = this.animatedTopY();
        float f5 = HudStyle.INSTANCE.scaled(7.0f);
        float f6 = HudStyle.INSTANCE.scaled(5.0f);
        float f7 = HudStyle.INSTANCE.scaled(7.0f);
        float f8 = HudStyle.INSTANCE.scaled(12.0f);
        float f9 = f8 * 0.8f;
        Color color = HudStyle.INSTANCE.getTITLE_COLOR();
        Color color2 = HudStyle.INSTANCE.getTITLE_COLOR();
        Color color3 = HudStyle.INSTANCE.getVALUE_COLOR();
        float f10 = this.centeredTopOffset(Font.INSTANCE.getGS_MEDIUM(), f5, f3);
        float f11 = this.centeredTopOffset(Font.INSTANCE.getGS_REGULAR(), f6, f3) + HudStyle.INSTANCE.scaled(1.0f);
        float f12 = this.centeredTopOffset(Font.INSTANCE.getICON(), f7, f3);
        float f13 = this.centeredTopOffset(Font.INSTANCE.getICON(), f9, f3);
        String string = this.formattedRole();
        String string2 = this.getPingText();
        int n2 = H[96];
        n2 ^= H[97];
        String string3 = String.valueOf(RangesKt.coerceAtLeast(kotakbaz.rain.client.extensions.b.getMc().getCurrentFps(), n2 ^= H[98]));
        int n3 = H[99];
        n3 -= H[100];
        String string4 = LocalTime.now().format(DateTimeFormatter.ofPattern((String)f[n3 -= H[101]]));
        int n4 = H[102];
        n4 -= H[103];
        Object object = new f[n4 -= H[104]];
        int n5 = H[105];
        n5 -= H[106];
        int n6 = H[108];
        n6 ^= H[109];
        object[n5 ^= WatermarkModule.H[107]] = new f((String)f[n6 -= H[110]], Font.INSTANCE.getICON(), f7, color2, f12, HudStyle.INSTANCE.scaled(3.2f));
        int n7 = H[111];
        n7 ^= H[112];
        object[n7 -= WatermarkModule.H[113]] = new f(string, Font.INSTANCE.getGS_MEDIUM(), f5, color, f10, HudStyle.INSTANCE.scaled(10.0f));
        int n8 = H[114];
        n8 -= H[115];
        int n9 = H[117];
        n9 += H[118];
        object[n8 += WatermarkModule.H[116]] = new f((String)f[n9 += H[119]], Font.INSTANCE.getICON(), f7, color2, f12, HudStyle.INSTANCE.scaled(3.2f));
        int n10 = H[120];
        n10 -= H[121];
        object[n10 ^= WatermarkModule.H[122]] = new f(string2, Font.INSTANCE.getGS_MEDIUM(), f5, color, f10, HudStyle.INSTANCE.scaled(0.5f));
        int n11 = H[123];
        n11 -= H[124];
        int n12 = H[126];
        n12 += H[127];
        object[n11 += WatermarkModule.H[125]] = new f((String)f[n12 -= H[128]], Font.INSTANCE.getGS_REGULAR(), f6, color3, f11, 0.0f);
        List<f> list = CollectionsKt.listOf(object);
        int n13 = H[129];
        n13 += H[130];
        object = CollectionsKt.listOf(new f((String)f[n13 += H[131]], Font.INSTANCE.getICON(), f9, color, f13, 0.0f));
        int n14 = H[132];
        n14 -= H[133];
        f[] fArray = new f[n14 += H[134]];
        int n15 = H[135];
        n15 += H[136];
        int n16 = H[138];
        n16 ^= H[139];
        fArray[n15 += WatermarkModule.H[137]] = new f((String)f[n16 -= H[140]], Font.INSTANCE.getICON(), f7, color2, f12, HudStyle.INSTANCE.scaled(3.2f));
        int n17 = H[141];
        n17 -= H[142];
        fArray[n17 ^= WatermarkModule.H[143]] = new f(string3, Font.INSTANCE.getGS_MEDIUM(), f5, color, f10, HudStyle.INSTANCE.scaled(0.5f));
        int n18 = H[144];
        n18 -= H[145];
        int n19 = H[147];
        n19 ^= H[148];
        fArray[n18 += WatermarkModule.H[146]] = new f((String)f[n19 -= H[149]], Font.INSTANCE.getGS_REGULAR(), f6, color3, f11, HudStyle.INSTANCE.scaled(10.0f));
        int n20 = H[150];
        n20 -= H[151];
        int n21 = H[153];
        n21 += H[154];
        fArray[n20 -= WatermarkModule.H[152]] = new f((String)f[n21 += H[155]], Font.INSTANCE.getICON(), f7, color2, f12, HudStyle.INSTANCE.scaled(3.2f));
        int n22 = H[156];
        n22 += H[157];
        Intrinsics.checkNotNull(string4);
        fArray[n22 ^= WatermarkModule.H[158]] = new f(string4, Font.INSTANCE.getGS_MEDIUM(), f5, color, f10, 0.0f);
        List<f> list2 = CollectionsKt.listOf(fArray);
        float f14 = this.measure(list);
        float f15 = this.measure(list2);
        float f16 = this.measure((List<f>)object);
        float f17 = f16 + f2 * 2.0f;
        float f18 = (float)kotakbaz.rain.client.extensions.b.getMc().getWindow().getScaledWidth() / 2.0f;
        float f19 = f18 - f17 / 2.0f;
        float f20 = f18 - f16 / 2.5f;
        float f21 = f19 - f2 * 1.5f - f14;
        float f22 = f19 + f17 + f2 * 1.5f;
        float f23 = f21 - f2 * 1.5f;
        float f24 = f2 * 2.0f + f14 + f15 + f17 + f2 * 4.0f;
        return new g(f23, f4, f24, f3, f21, f22, f20, f19, f17, list, (List<f>)object, list2);
    }

    private final float measure(List<f> parts) {
        long l2 = 1847430468867364998L;
        long l3 = -1058624661948446580L;
        long l4 = 388868150407168987L;
        long l5 = 7232228415431534076L;
        float f2 = 0.0f;
        long l6 = l5;
        int n2 = H[159];
        n2 += H[160];
        l5 = l6 ^ (0L ^ l6) & -1L << (n2 += H[161]);
        long l7 = l3;
        int n3 = H[162];
        n3 -= H[163];
        l3 = l7 ^ ((long)((Collection)parts).size() ^ l7) & -1L >>> (n3 += H[164]);
        while (true) {
            int n4 = H[165];
            n4 -= H[166];
            if ((int)(l5 >>> (n4 -= H[167])) >= (int)l3) break;
            int n5 = H[168];
            n5 ^= H[169];
            f f3 = parts.get((int)(l5 >>> (n5 += H[170])));
            int n6 = H[171];
            n6 ^= H[172];
            f2 += kotakbaz.rain.client.util.render.font.E.getWidth$default(f3.getFont(), f3.getText(), f3.getSize(), 0.0f, n6 += H[173], null);
            int n7 = H[174];
            n7 += H[175];
            if ((int)(l5 >>> (n7 -= H[176])) != CollectionsKt.getLastIndex(parts)) {
                f2 += f3.getSpacingAfter();
            }
            l5 += 0x100000000L;
        }
        return f2;
    }

    private final String formattedRole() {
        Object object;
        long l2 = 3742005266949620564L;
        long l3 = -6219953744476052033L;
        long l4 = 1162874392431712307L;
        String string = kotakbaz.rain.guard.a_0.role();
        int n2 = H[177];
        n2 += H[178];
        Intrinsics.checkNotNullExpressionValue(string, (String)f[n2 -= H[179]]);
        String string2 = ((Object)StringsKt.trim((CharSequence)string)).toString();
        if (StringsKt.isBlank(string2)) {
            int n3 = H[180];
            n3 ^= H[181];
            return (String)f[n3 -= H[182]];
        }
        char c2 = H[183];
        c2 += H[184];
        c2 -= H[185];
        char c3 = H[186];
        c3 -= H[187];
        c3 -= H[188];
        boolean bl = H[189];
        bl -= H[190];
        bl += H[191];
        int n4 = H[192];
        n4 -= H[193];
        n4 ^= H[194];
        char c4 = H[195];
        c4 -= H[196];
        c4 += H[197];
        char c5 = H[198];
        c5 -= H[199];
        boolean bl2 = H[201];
        bl2 ^= H[202];
        int n5 = H[204];
        n5 += H[205];
        Object object2 = StringsKt.replace$default(StringsKt.replace$default(string2, c2, c3, bl, n4, null), c4, c5 += H[200], bl2 ^= H[203], n5 ^= H[206], null);
        int n6 = H[207];
        n6 += H[208];
        Regex regex = new Regex((String)f[n6 ^= H[209]]);
        long l5 = l2;
        int n7 = H[210];
        n7 -= H[211];
        l2 = l5 ^ (0L ^ l5) & -1L << (n7 ^= H[212]);
        int n8 = H[213];
        n8 -= H[214];
        object2 = regex.split((CharSequence)object2, (int)(l2 >>> (n8 += H[215])));
        long l6 = l4;
        int n9 = H[216];
        n9 -= H[217];
        l4 = l6 ^ (0L ^ l6) & -1L >>> (n9 += H[218]);
        Object object3 = object2;
        Collection collection = new ArrayList();
        long l7 = l3;
        int n10 = H[219];
        n10 -= H[220];
        l3 = l7 ^ (0L ^ l7) & -1L >>> (n10 += H[221]);
        Iterator iterator2 = object3.iterator();
        while (iterator2.hasNext()) {
            int n11;
            Object t2 = iterator2.next();
            String string3 = (String)t2;
            long l8 = l4;
            int n12 = H[222];
            n12 += H[223];
            l4 = l8 ^ (0L ^ l8) & -1L << (n12 += H[224]);
            if (!StringsKt.isBlank(string3)) {
                int n13 = H[225];
                n13 += H[226];
                n11 = n13 += H[227];
            } else {
                int n14 = H[228];
                n14 += H[229];
                n11 = n14 += H[230];
            }
            if (n11 == 0) continue;
            collection.add(t2);
        }
        int n15 = H[231];
        n15 += H[232];
        n15 ^= H[233];
        int n16 = H[234];
        n16 += H[235];
        int n17 = H[237];
        n17 += H[238];
        object2 = CollectionsKt.joinToString$default((List)collection, (String)f[n15], null, null, n16 -= H[236], null, WatermarkModule::formattedRole$lambda$0, n17 ^= H[239], null);
        if (StringsKt.isBlank((CharSequence)object2)) {
            long l9 = l4;
            int n18 = H[240];
            n18 += H[241];
            l4 = l9 ^ (0L ^ l9) & -1L >>> (n18 += H[242]);
            int n19 = H[243];
            n19 += H[244];
            object = (String)f[n19 -= H[245]];
        } else {
            object = object2;
        }
        return (String)object;
    }

    private final void drawParts(List<f> parts, float startX, float topY, float alpha2) {
        long l2 = -3703198729340985159L;
        long l3 = -6352170092730364601L;
        long l4 = 1944648191922528058L;
        long l5 = -3053432365507757439L;
        float f2 = startX;
        long l6 = l5;
        int n2 = H[246];
        n2 -= H[247];
        l5 = l6 ^ (0L ^ l6) & -1L << (n2 -= H[248]);
        long l7 = l3;
        int n3 = H[249];
        n3 += H[250];
        l3 = l7 ^ ((long)((Collection)parts).size() ^ l7) & -1L >>> (n3 -= H[251]);
        while (true) {
            int n4 = H[252];
            n4 -= H[253];
            if ((int)(l5 >>> (n4 += H[254])) >= (int)l3) break;
            int n5 = H[255];
            n5 -= H[256];
            f f3 = parts.get((int)(l5 >>> (n5 += H[257])));
            int n6 = H[258];
            n6 ^= H[259];
            int n7 = H[261];
            n7 += H[262];
            kotakbaz.rain.client.util.render.font.E.drawText$default(f3.getFont().priority(ClientRenderPipeline.HUD_TEXT), f3.getText(), f2, topY + f3.getTopOffset(), f3.getSize(), this.withAlpha(f3.getColor(), alpha2), 0.0f, 0.0f, 0.0f, n6 -= H[260], 0.0f, n7 -= H[263], null);
            int n8 = H[264];
            n8 ^= H[265];
            f2 += kotakbaz.rain.client.util.render.font.E.getWidth$default(f3.getFont(), f3.getText(), f3.getSize(), 0.0f, n8 -= H[266], null);
            int n9 = H[267];
            n9 += H[268];
            if ((int)(l5 >>> (n9 ^= H[269])) != CollectionsKt.getLastIndex(parts)) {
                f2 += f3.getSpacingAfter();
            }
            l5 += 0x100000000L;
        }
    }

    private final float centeredTopOffset(E font, float size, float containerHeight) {
        return (containerHeight - font.getMetrics().getLineHeight() * size) * 0.5f;
    }

    private final Color withAlpha(Color color, float factor) {
        int n2 = H[270];
        n2 ^= H[271];
        int n3 = H[273];
        n3 -= H[274];
        return new Color(color.getRed(), color.getGreen(), color.getBlue(), RangesKt.coerceIn((int)((float)color.getAlpha() * factor), n2 -= H[272], n3 -= H[275]));
    }

    @Override
    public void onEnable() {
        E.snap(this.desiredTopY());
    }

    @Override
    public void onDisable() {
        E.snap(this.desiredTopY());
    }

    private static final CharSequence formattedRole$lambda$0(String part) {
        String string;
        int n2;
        long l2 = -4246019252425451336L;
        long l3 = 5075886587903700423L;
        long l4 = -2241334694381454657L;
        int n3 = H[276];
        n3 += H[277];
        Intrinsics.checkNotNullParameter(part, (String)f[n3 ^= H[278]]);
        String string2 = part.toLowerCase(Locale.ROOT);
        int n4 = H[279];
        n4 -= H[280];
        int n5 = H[282];
        n5 ^= H[283];
        Intrinsics.checkNotNullExpressionValue(string2, (String)f[n4 ^= H[281]] + (String)f[n5 -= H[284]]);
        String string3 = string2;
        if (((CharSequence)string3).length() > 0) {
            int n6 = H[285];
            n6 ^= H[286];
            n2 = n6 += H[287];
        } else {
            int n7 = H[288];
            n7 ^= H[289];
            n2 = n7 -= H[290];
        }
        if (n2 != 0) {
            int n8 = H[291];
            n8 ^= H[292];
            n8 += H[293];
            int n9 = H[294];
            n9 -= H[295];
            long l5 = l3;
            int n10 = H[297];
            n10 ^= H[298];
            l3 = l5 ^ ((long)string3.charAt(n8) << (n9 ^= H[296]) ^ l5) & -1L << (n10 -= H[299]);
            StringBuilder stringBuilder = new StringBuilder();
            long l6 = l4;
            int n11 = H[300];
            n11 -= H[301];
            l4 = l6 ^ (0L ^ l6) & -1L << (n11 ^= H[302]);
            int n12 = H[303];
            n12 -= H[304];
            StringBuilder stringBuilder2 = stringBuilder.append((Object)CharsKt.titlecase((char)(l3 >>> (n12 += H[305]))));
            String string4 = string3;
            long l7 = l4;
            int n13 = H[306];
            n13 ^= H[307];
            l4 = l7 ^ (0x100000000L ^ l7) & -1L << (n13 -= H[308]);
            int n14 = H[309];
            n14 -= H[310];
            String string5 = string4.substring((int)(l4 >>> (n14 -= H[311])));
            int n15 = H[312];
            n15 ^= H[313];
            Intrinsics.checkNotNullExpressionValue(string5, (String)f[n15 += H[314]]);
            string = stringBuilder2.append(string5).toString();
        } else {
            string = string3;
        }
        return string;
    }

    static {
        WatermarkModule.b();
        long l2 = 1149207699045338376L;
        long l3 = 8788387586594351909L;
        long l4 = 1269966564551607696L;
        long l5 = 3846776539757967745L;
        long l6 = -6571952657155760996L;
        long l7 = 7383168866681058268L;
        long l8 = -8070828529627810511L;
        long l9 = 380519939807154857L;
        long l10 = 1114302454811303721L;
        long l11 = 2279086688141979634L;
        long l12 = 8725554617305727885L;
        long l13 = 2971958604940426708L;
        long l14 = 6623568723782058538L;
        long l15 = 1948885563251617837L;
        int n2 = H[315];
        n2 -= H[316];
        f = new Object[n2 -= H[317]];
        long l16 = l15;
        int n3 = H[318];
        n3 -= H[319];
        l15 = l16 ^ (0L ^ l16) & -1L << (n3 += H[320]);
        Object[] objectArray = new Object[H[321]];
        objectArray[WatermarkModule.H[322]] = F;
        objectArray[WatermarkModule.H[323]] = H[324];
        int n4 = H[325];
        Object object = WatermarkModule.A()[H[326]];
        if (object == null) {
            char[] cArray = "\u7e9e\u7fb5\u7fb2\u7f25\u7fe2\u7e69\u7faf\u7ace\u7ad5\u7e78\u7fbb\u7e6b\u7e97\u7e82\u7fbb\u7ac8\u7ac1\u7ad5\u8050\u7fba\u7f25\u805e\u805f\u7e9f\u7e70\u7e23\u7f9a\u7adb\u805e\u7e97\u8050\u7fa1\u7e7d\u7e90\u7fae\u805f\u7ac9\u805f\u7fa0\u7ac8\u7e78\u7ac1\u7ad2\u7fb5\u7e9f\u7f9a\u7e7d\u7f9a\u7e71\u7ad4\u7acd\u7e91\u805e\u7e71\u7fa1\u7e91\u7fa1\u7fe2\u7e83\u7e9c\u7e6b\u7ac1\u7e9e\u7e71\u7e98\u7e90\u7fb2\u7ad2\u7acf\u7ac4\u7fb2\u7fb5\u7e22\u8050\u7e96\u7acb\u7f25\u7e64\u7e82\u7ac4\u7fba\u7e76\u7ac8\u7ace\u7e6b\u7fa0\u7e76\u7fa1\u7fb2\u7e91\u7e68\u7e91\u7f9a\u7f24\u7e98\u805f\u7e9c\u7ada\u7e69\u7e97\u7fb2\u7ac8\u7e9d\u805e\u7e98\u7ac0\u7e9d\u7e9f\u8050\u7e65\u7e7e\u7e9d\u7e70\u7fe2\u805f\u7e97\u7e9f\u7e70\u7f24\u7e22\u7fb5\u7fbb\u7acd\u8056\u7f25\u7e71\u7e9d\u7e78\u7e9c\u7e70\u7ac8\u7e7f\u7e65\u7ac5\u7e22\u7e71\u7fb5\u7f25\u7e22\u7faf\u7adb\u7adb\u7ac0\u7e77\u7e96\u7e83\u7fb4\u7e22\u7e76\u7ace\u7e96\u7e7e\u7ad5\u7e7c\u7e9d\u7e76\u7fe2\u805e\u7e9d\u7e22\u7e98\u7fa0\u7fa1\u805f\u8051\u805e\u7f2b\u7e6b\u7f25\u7e23\u7e83\u7ac9\u7fb2\u7f2b\u7ac4\u7acf\u7f24\u7e9c\u7ad2\u7ac4\u7ac8\u7fbb\u7ad2\u7ad4\u7ac9\u7fe2\u7e9e\u7e68\u7ac8\u7fe3\u7e70\u7fb4\u7ac4\u7e9f\u7e7c\u7fae\u8050\u7e64\u7e91\u7ac1\u7e97\u7ac8\u7e90\u7fed\u805e\u7e96\u7e7d\u7ad4\u7f28\u7fb5\u7e70\u8051\u7e91\u7ada\u8050\u7fb4\u7e96\u7ac4\u7acd\u7f28\u7f24\u7e7c\u805e\u7acb\u7e78\u7e70\u7ac1\u7e22\u7e70\u7e7e\u7fe3\u7fae\u7e77\u7acf\u7f28\u7e7f\u7ac9\u7acf\u7fb5\u7fae\u7e98\u7adb\u7e97\u7f25\u7e77\u8051\u7fae\u7fe3\u8050\u7e7c\u7e91\u7fe3\u7adb\u7e22\u7e7c\u7f24\u7f2b\u7e23\u7f9a\u7fa1\u7fe2\u7ac9\u7fe3\u7e83\u7e7e\u7ac5\u7ac1\u7f2b\u7e76\u7ac5\u7faf\u805e\u7fbb\u7fbb\u7f9a\u7f2b\u7e71\u7e77\u805e\u7adb\u7e9f\u7e91\u7fb2\u7ac0\u7e78\u7fb4\u7ace\u7ac4\u7ada\u8056\u7adb\u7ac4\u7e76\u7e9d\u7e91\u7f2b\u7e91\u7e83\u7ace\u7fac".toCharArray();
            for (int i2 = H[327]; i2 < H[328]; ++i2) {
                int n5 = cArray[i2];
                n5 -= H[329];
                n5 ^= H[330];
                n5 -= H[331];
                n5 ^= H[332];
                n5 ^= H[333];
                n5 -= H[334];
                n5 += H[335];
                n5 += H[336];
                n5 ^= H[337];
                n5 -= H[338];
                n5 ^= H[339];
                n5 ^= H[340];
                n5 ^= H[341];
                n5 -= H[342];
                cArray[i2] = (char)(n5 ^= H[343]);
            }
            object = WatermarkModule.A()[WatermarkModule.H[344]] = new String(cArray);
        }
        objectArray[n4] = (String)object;
        char[] cArray = ((String)WatermarkModule.a(objectArray)).toCharArray();
        long l17 = l6;
        int n6 = H[345];
        n6 ^= H[346];
        l6 = l17 ^ (0xA500000000L ^ l17) & -1L << (n6 += H[347]);
        long l18 = l13;
        int n7 = H[348];
        n7 ^= H[349];
        l13 = l18 ^ (0L ^ l18) & -1L >>> (n7 += H[350]);
        while (true) {
            int n8 = H[351];
            n8 ^= H[352];
            if ((int)l13 >= (int)(l6 >>> (n8 ^= H[353]))) break;
            int n9 = (int)l13;
            long l19 = l13;
            int n10 = H[354];
            n10 += H[355];
            int n11 = H[357];
            n11 -= H[358];
            l13 = l19 ^ (l19 ^ l19 + (long)(n10 ^= H[356])) & -1L >>> (n11 -= H[359]);
            long l20 = l9;
            int n12 = H[360];
            n12 -= H[361];
            l9 = l20 ^ ((long)cArray[n9] ^ l20) & -1L >>> (n12 ^= H[362]);
            int n13 = (int)l13;
            long l21 = l13;
            int n14 = H[363];
            n14 ^= H[364];
            int n15 = H[366];
            n15 += H[367];
            l13 = l21 ^ (l21 ^ l21 + (long)(n14 ^= H[365])) & -1L >>> (n15 += H[368]);
            int n16 = H[369];
            n16 += H[370];
            long l22 = l10;
            int n17 = H[372];
            n17 += H[373];
            l10 = l22 ^ ((long)cArray[n13] << (n16 -= H[371]) ^ l22) & -1L << (n17 ^= H[374]);
            int n18 = H[375];
            n18 -= H[376];
            n18 += H[377];
            int n19 = H[378];
            n19 ^= H[379];
            long l23 = l12;
            int n20 = H[381];
            n20 ^= H[382];
            l12 = l23 ^ ((long)((int)l9 << n18 | (int)(l10 >>> (n19 += H[380]))) ^ l23) & -1L >>> (n20 += H[383]);
            char[] cArray2 = new char[(int)l12];
            long l24 = l14;
            int n21 = H[384];
            n21 -= H[385];
            l14 = l24 ^ (0L ^ l24) & -1L << (n21 ^= H[386]);
            while (true) {
                int n22 = H[387];
                n22 += H[388];
                if ((int)(l14 >>> (n22 ^= H[389])) >= (int)l12) break;
                int n23 = H[390];
                n23 += H[391];
                int n24 = H[393];
                n24 += H[394];
                cArray2[(int)(l14 >>> (n23 += WatermarkModule.H[392]))] = cArray[(int)l13 + (int)(l14 >>> (n24 -= H[395]))];
                l14 += 0x100000000L;
            }
            int n25 = H[396];
            n25 -= H[397];
            int n26 = (int)(l15 >>> (n25 ^= H[398]));
            l15 += 0x100000000L;
            WatermarkModule.f[n26] = new String(cArray2);
            long l25 = l13;
            int n27 = H[399];
            n27 ^= 0x64;
            l13 = l25 ^ ((long)((int)l13 + (int)l12) ^ l25) & -1L >>> (n27 -= -78);
        }
        INSTANCE = new WatermarkModule();
        E = new AnimationUtil();
    }

    public static Object a(Object[] object) {
        Object object2;
        int n2 = (Integer)object[1];
        String string = (String)object[2];
        object = object[0];
        Object[] objectArray = G;
        if (G == null) {
            objectArray = G = new Object[1];
        }
        if ((object2 = objectArray[n2]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[1];
                F = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[0x3DEA ^ 0x3DFA];
                byArray[0x3A74 ^ 0x3A7C] = 0x3A1B ^ 0x3A7C;
                byArray[0xE771 ^ 0xE771] = 0xE711 ^ 0xE771;
                byArray[0x26CA ^ 0x26C1] = 0xFFFFD921 ^ 0x26C1;
                byArray[0xC83 ^ 0xC8D] = 0xFFFFF34F ^ 0xC8D;
                byArray[0xB2BC ^ 0xB2B5] = 0xB2F1 ^ 0xB2B5;
                byArray[0xD ^ 7] = 0x6B ^ 7;
                byArray[0x4A0E ^ 0x4A08] = 0x4A59 ^ 0x4A08;
                byArray[0x6B6C ^ 0x6B61] = 0xFFFF9497 ^ 0x6B61;
                byArray[0xECF5 ^ 0xECFA] = 0xFFFF1363 ^ 0xECFA;
                byArray[0xD876 ^ 0xD872] = 0xD879 ^ 0xD872;
                byArray[0x6C97 ^ 0x6C9B] = 0x6C88 ^ 0x6C9B;
                byArray[0x57FF ^ 0x57FD] = 0x57DB ^ 0x57FD;
                byArray[0x10DA0 ^ 0x10DA7] = 0xFFFEF27F ^ 0x10DA7;
                byArray[0xDA6F ^ 0xDA6E] = 0xFFFF25EC ^ 0xDA6E;
                byArray[0xD621 ^ 0xD622] = 0xD673 ^ 0xD622;
                byArray[0xF8B4 ^ 0xF8B1] = 0xFFFF0702 ^ 0xF8B1;
                objectArray2[0] = byArray;
            }
            byte[] byArray = (byte[])object3[0];
            if (g == null) {
                byte[] byArray2 = new byte[0xCB9A ^ 0xCBBA];
                byArray2[0x6998 ^ 0x6995] = 0xFFFF9670 ^ 0x6995;
                byArray2[0x6290 ^ 0x6298] = 0xFFFF9D09 ^ 0x6298;
                byArray2[0xEBB ^ 0xEA4] = 0xFFFFF178 ^ 0xEA4;
                byArray2[0x10708 ^ 0x1071C] = 0x1076A ^ 0x1071C;
                byArray2[0x74F5 ^ 0x74EC] = 0x74CE ^ 0x74EC;
                byArray2[0x2C1D ^ 0x2C08] = 0x2C60 ^ 0x2C08;
                byArray2[0x995A ^ 0x9942] = 0x9912 ^ 0x9942;
                byArray2[0x1FAB ^ 0x1FB7] = 0xFFFFE000 ^ 0x1FB7;
                byArray2[0x85DE ^ 0x85CE] = 0xFFFF7A3E ^ 0x85CE;
                byArray2[0x34FB ^ 0x34E1] = 0xFFFFCB34 ^ 0x34E1;
                byArray2[0x19A9 ^ 0x19AB] = 0x1982 ^ 0x19AB;
                byArray2[0x2D39 ^ 0x2D3F] = 0x2D19 ^ 0x2D3F;
                byArray2[0x533C ^ 0x5333] = 0x5370 ^ 0x5333;
                byArray2[0xE95E ^ 0xE954] = 0xE936 ^ 0xE954;
                byArray2[0x69DB ^ 0x69DA] = 0xFFFF963C ^ 0x69DA;
                byArray2[0x3F1E ^ 0x3F17] = 0x3F3F ^ 0x3F17;
                byArray2[0x8124 ^ 0x812A] = 0x8124 ^ 0x812A;
                byArray2[0x53DB ^ 0x53DF] = 0x53B6 ^ 0x53DF;
                byArray2[0xADDB ^ 0xADC9] = 0xFFFF5279 ^ 0xADC9;
                byArray2[0x9BE5 ^ 0x9BF8] = 0x9B81 ^ 0x9BF8;
                byArray2[0x44C6 ^ 0x44CD] = 0xFFFFBB43 ^ 0x44CD;
                byArray2[0x15CF ^ 0x15DE] = 0xFFFFEA2D ^ 0x15DE;
                byArray2[0x9E5F ^ 0x9E5A] = 0xFFFF61F4 ^ 0x9E5A;
                byArray2[0x74FA ^ 0x74F6] = 0xFFFF8B1B ^ 0x74F6;
                byArray2[0xC47E ^ 0xC468] = 0xFFFF3BEF ^ 0xC468;
                byArray2[0x2033 ^ 0x2030] = 0x2079 ^ 0x2030;
                byArray2[0xA7A1 ^ 0xA7B6] = 0xFFFF584A ^ 0xA7B6;
                byArray2[0x911D ^ 0x9103] = 0xFFFF6EEF ^ 0x9103;
                byArray2[0x397A ^ 0x3969] = 0x3935 ^ 0x3969;
                byArray2[0xF856 ^ 0xF856] = 0xFFFF07F9 ^ 0xF856;
                byArray2[0x8AF8 ^ 0x8AFF] = 0xFFFF756B ^ 0x8AFF;
                byArray2[0x7ABE ^ 0x7AA5] = 0xFFFF8519 ^ 0x7AA5;
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, 0, byArray3, 0, byArray.length);
                System.arraycopy(byArray2, 0, byArray3, byArray.length, byArray2.length);
                Object object4 = WatermarkModule.A()[1];
                if (object4 == null) {
                    char[] cArray = "\u2b98\u2b9e\u2baf\u2bac\u2ba2\u2b6e\u2b9b\u2c09\u2bfc\u2c10\u2bb0\u2c2d\u2c01\u2c07\u2b97\u2bb0\u2ba1\u2b31".toCharArray();
                    for (int i2 = 0; i2 < 18; ++i2) {
                        int n3 = cArray[i2];
                        n3 += 54592;
                        n3 -= 47649;
                        n3 ^= 0x2AF2;
                        n3 -= 11826;
                        n3 ^= 0x9752;
                        n3 += 22052;
                        n3 ^= 0xFF74;
                        n3 ^= 0x5424;
                        n3 += 51815;
                        n3 -= 26826;
                        n3 ^= 0xD44C;
                        cArray[i2] = (char)(n3 ^= 0x61CE);
                    }
                    object4 = WatermarkModule.A()[1] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[16];
                byArray4[7] = 62;
                byArray4[6] = -40;
                byArray4[8] = 81;
                byArray4[15] = -124;
                byArray4[4] = 3;
                byArray4[9] = 21;
                byArray4[1] = 108;
                byArray4[12] = 116;
                byArray4[10] = 99;
                byArray4[0] = -14;
                byArray4[14] = -10;
                byArray4[3] = 76;
                byArray4[2] = 62;
                byArray4[11] = 36;
                byArray4[13] = -28;
                byArray4[5] = -41;
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, 14, 256);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = WatermarkModule.A()[2];
                if (object5 == null) {
                    char[] cArray = "AM\uf2cf".toCharArray();
                    for (int i3 = 0; i3 < 3; ++i3) {
                        int n4 = cArray[i3];
                        n4 += 13506;
                        n4 -= 7202;
                        n4 += 18050;
                        n4 ^= 0x68E5;
                        n4 -= 26422;
                        n4 += 2026;
                        n4 ^= 0xE13A;
                        n4 -= 61404;
                        n4 ^= 0xA53D;
                        n4 -= 36429;
                        cArray[i3] = (char)(n4 ^= 0x5D8D);
                    }
                    object5 = WatermarkModule.A()[2] = new String(cArray);
                }
                g = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, 0, 16);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, 16, byArray6.length);
            Object object6 = WatermarkModule.A()[3];
            if (object6 == null) {
                char[] cArray = "\u53dd\u53d9\u540b\u53ff\u53db\u53da\u53db\u53ff\u540c\u5403\u53db\u540b\u53a9\u540c\u523d\u5238\u5238\u53e5\u523e\u5237".toCharArray();
                for (int i4 = 0; i4 < 20; ++i4) {
                    int n5 = cArray[i4];
                    n5 += 6640;
                    n5 ^= 0x4950;
                    n5 ^= 0x7B81;
                    n5 += 48594;
                    n5 -= 23539;
                    n5 -= 37811;
                    n5 -= 39076;
                    n5 += 63205;
                    n5 += 1797;
                    n5 ^= 0x18E7;
                    n5 += 48314;
                    cArray[i4] = (char)(n5 += 47390);
                }
                object6 = WatermarkModule.A()[3] = new String(cArray);
            }
            Cipher cipher = Cipher.getInstance((String)object6);
            cipher.init(2, (Key)((SecretKey)g), new IvParameterSpec(byArray7));
            byte[] byArray9 = cipher.doFinal(byArray8);
            object2 = new String(byArray9, StandardCharsets.UTF_8);
        }
        return object2;
    }

    private static Object[] A() {
        Object[] objectArray = h;
        if (h == null) {
            h = new Object[4];
            objectArray = h;
        }
        return objectArray;
    }

    public static void b() {
        H = new int[0x9CB4 ^ 0x9D24];
        WatermarkModule.H[0x3204 ^ 0x337F] = 0xFFFFCCA4 ^ 0x337F;
        WatermarkModule.H[0x826B ^ 0x82E9] = 0xFFFF7D55 ^ 0x82E9;
        WatermarkModule.H[0x3512 ^ 0x3549] = 0xFFFFCA95 ^ 0x3549;
        WatermarkModule.H[0xAED7 ^ 0xAEAF] = 0xAEAB ^ 0xAEAF;
        WatermarkModule.H[0xCD2 ^ 0xCE7] = 0xC8D ^ 0xCE7;
        WatermarkModule.H[0x6EC3 ^ 0x6E76] = 0x6E05 ^ 0x6E76;
        WatermarkModule.H[0x35A9 ^ 0x35A1] = 0xFFFFCA32 ^ 0x35A1;
        WatermarkModule.H[0x552E ^ 0x5558] = 0x5520 ^ 0x5558;
        WatermarkModule.H[0xFA4D ^ 0xFA9D] = 0xFAED ^ 0xFA9D;
        WatermarkModule.H[0xA59D ^ 0xA5BE] = 0xFFFF5A23 ^ 0xA5BE;
        WatermarkModule.H[0xA024 ^ 0xA149] = 0xA144 ^ 0xA149;
        WatermarkModule.H[0x9DFB ^ 0x9C91] = 0xFFFF6307 ^ 0x9C91;
        WatermarkModule.H[0x86F9 ^ 0x8613] = 0x8608 ^ 0x8613;
        WatermarkModule.H[0xB776 ^ 0xB7EE] = 0xFFFF483A ^ 0xB7EE;
        WatermarkModule.H[0x6191 ^ 0x61AB] = 0x61F8 ^ 0x61AB;
        WatermarkModule.H[0xA82D ^ 0xA842] = 0xFFFF57B5 ^ 0xA842;
        WatermarkModule.H[0xA694 ^ 0xA6A0] = 0xFFFF594B ^ 0xA6A0;
        WatermarkModule.H[0x8333 ^ 0x8335] = 0xFFFF7CBF ^ 0x8335;
        WatermarkModule.H[0x49DD ^ 0x49E5] = 0x49FC ^ 0x49E5;
        WatermarkModule.H[0xB739 ^ 0xB655] = 0xB650 ^ 0xB655;
        WatermarkModule.H[0x2593 ^ 0x25E3] = 0x25D0 ^ 0x25E3;
        WatermarkModule.H[0x149B ^ 0x159D] = 0xFFFFEA2B ^ 0x159D;
        WatermarkModule.H[0xE565 ^ 0xE414] = 0xE44E ^ 0xE414;
        WatermarkModule.H[0x48EE ^ 0x4879] = 0xFFFFB7A3 ^ 0x4879;
        WatermarkModule.H[0x7F77 ^ 0x7FEE] = 0x7F98 ^ 0x7FEE;
        WatermarkModule.H[0x3D27 ^ 0x3D50] = 0xFFFFC296 ^ 0x3D50;
        WatermarkModule.H[0xE0A3 ^ 0xE1E6] = 0xE1E4 ^ 0xE1E6;
        WatermarkModule.H[0x106F6 ^ 0x1062B] = 0xFFFEF9A1 ^ 0x1062B;
        WatermarkModule.H[0xA89 ^ 0xBE8] = 0xFFFFF433 ^ 0xBE8;
        WatermarkModule.H[0x92A2 ^ 0x9291] = 0xFFFF6D11 ^ 0x9291;
        WatermarkModule.H[0xFA73 ^ 0xFB59] = 0xFFFF04EC ^ 0xFB59;
        WatermarkModule.H[0x1EE ^ 0x11B] = 0xFFFFFE99 ^ 0x11B;
        WatermarkModule.H[0xEACA ^ 0xEAFA] = 0xEA35 ^ 0xEAFA;
        WatermarkModule.H[0x6154 ^ 0x604E] = 0x600C ^ 0x604E;
        WatermarkModule.H[0x87E4 ^ 0x87F4] = 0xFFFF7809 ^ 0x87F4;
        WatermarkModule.H[0x2219 ^ 0x2250] = 0x2200 ^ 0x2250;
        WatermarkModule.H[0x35F2 ^ 0x354A] = 0x350F ^ 0x354A;
        WatermarkModule.H[0x1132 ^ 0x11B7] = 0x1184 ^ 0x11B7;
        WatermarkModule.H[0xDD52 ^ 0xDDA2] = 0xDDA4 ^ 0xDDA2;
        WatermarkModule.H[0x1806 ^ 0x1951] = 0xF3AF ^ 0x1951;
        WatermarkModule.H[0x2A38 ^ 0x2A88] = 0xFFFFD56B ^ 0x2A88;
        WatermarkModule.H[0xE997 ^ 0xE99C] = 0xFFFF1666 ^ 0xE99C;
        WatermarkModule.H[0x9DCD ^ 0x9CEB] = 0x9CC0 ^ 0x9CEB;
        WatermarkModule.H[0xCBD8 ^ 0xCA85] = 0xCAC1 ^ 0xCA85;
        WatermarkModule.H[0x12A8 ^ 0x1291] = 0xFFFFED14 ^ 0x1291;
        WatermarkModule.H[0xE986 ^ 0xE974] = 0xE972 ^ 0xE974;
        WatermarkModule.H[0xCA91 ^ 0xCA07] = 0xFFFF35B6 ^ 0xCA07;
        WatermarkModule.H[0xD798 ^ 0xD6BC] = 0xFFFF2912 ^ 0xD6BC;
        WatermarkModule.H[0x8CF7 ^ 0x8DCC] = 0x8DCD ^ 0x8DCC;
        WatermarkModule.H[0x2C71 ^ 0x2C4A] = 0xFFFFD3BC ^ 0x2C4A;
        WatermarkModule.H[0x22C8 ^ 0x229E] = 0x22A2 ^ 0x229E;
        WatermarkModule.H[0x5D2B ^ 0x5D6C] = 0x5D40 ^ 0x5D6C;
        WatermarkModule.H[0xBC14 ^ 0xBCE9] = 0xBC9F ^ 0xBCE9;
        WatermarkModule.H[0xF295 ^ 0xF22A] = 0xF201 ^ 0xF22A;
        WatermarkModule.H[0xD859 ^ 0xD8BF] = 0xD8B5 ^ 0xD8BF;
        WatermarkModule.H[0x8E7E ^ 0x8E74] = 0x8E37 ^ 0x8E74;
        WatermarkModule.H[0xE599 ^ 0xE488] = 0xE54C ^ 0xE488;
        WatermarkModule.H[0x83E0 ^ 0x8354] = 0x8328 ^ 0x8354;
        WatermarkModule.H[0xFE89 ^ 0xFF00] = 0xFF0B ^ 0xFF00;
        WatermarkModule.H[0xB777 ^ 0xB72F] = 0xFFFF48A5 ^ 0xB72F;
        WatermarkModule.H[0xFA48 ^ 0xFB35] = 0xFFFF04EA ^ 0xFB35;
        WatermarkModule.H[0x76DC ^ 0x7697] = 0x768E ^ 0x7697;
        WatermarkModule.H[0xF287 ^ 0xF2AD] = 0xFFFF0D43 ^ 0xF2AD;
        WatermarkModule.H[0xC027 ^ 0xC008] = 0xFFFF3FDC ^ 0xC008;
        WatermarkModule.H[0xD234 ^ 0xD34C] = 0xD31F ^ 0xD34C;
        WatermarkModule.H[0xD414 ^ 0xD51A] = 0xFFFF2AF6 ^ 0xD51A;
        WatermarkModule.H[0x41CB ^ 0x40C9] = 0x40A4 ^ 0x40C9;
        WatermarkModule.H[0xFDA7 ^ 0xFCAE] = 0xFCC9 ^ 0xFCAE;
        WatermarkModule.H[0xC836 ^ 0xC9BC] = 0xFFFF3644 ^ 0xC9BC;
        WatermarkModule.H[0x3152 ^ 0x3183] = 0x31A4 ^ 0x3183;
        WatermarkModule.H[0x3E43 ^ 0x3EC0] = 0xFFFFC149 ^ 0x3EC0;
        WatermarkModule.H[0xCF4F ^ 0xCE38] = 0xCE00 ^ 0xCE38;
        WatermarkModule.H[0x7EC5 ^ 0x7EB1] = 0xFFFF810D ^ 0x7EB1;
        WatermarkModule.H[0x7215 ^ 0x7372] = 0xFFFF8C8B ^ 0x7372;
        WatermarkModule.H[0xCF26 ^ 0xCEA6] = 0xCEE9 ^ 0xCEA6;
        WatermarkModule.H[0xE019 ^ 0xE191] = 0xE1EB ^ 0xE191;
        WatermarkModule.H[0xCDD7 ^ 0xCD7B] = 0xFFFF32B0 ^ 0xCD7B;
        WatermarkModule.H[0x3CBB ^ 0x3DAB] = 0x3DD9 ^ 0x3DAB;
        WatermarkModule.H[0x3C59 ^ 0x3D1D] = 0x3D1D ^ 0x3D1D;
        WatermarkModule.H[0xE4D8 ^ 0xE5EE] = 0xFFFF1A51 ^ 0xE5EE;
        WatermarkModule.H[0xF3C7 ^ 0xF2A1] = 0xF2A0 ^ 0xF2A1;
        WatermarkModule.H[0x8C38 ^ 0x8D7B] = 0x8D7A ^ 0x8D7B;
        WatermarkModule.H[0x104FF ^ 0x10480] = 0x104A5 ^ 0x10480;
        WatermarkModule.H[0xF7E2 ^ 0xF6AF] = 0xF28B ^ 0xF6AF;
        WatermarkModule.H[0xEC7D ^ 0xECAF] = 0xFFFF1359 ^ 0xECAF;
        WatermarkModule.H[0xBB9E ^ 0xBBA2] = 0xFFFF4406 ^ 0xBBA2;
        WatermarkModule.H[0x6D8B ^ 0x6DDE] = 0xFFFF925A ^ 0x6DDE;
        WatermarkModule.H[0x9809 ^ 0x98E2] = 0x98C6 ^ 0x98E2;
        WatermarkModule.H[0xCE76 ^ 0xCF4A] = 0xCF13 ^ 0xCF4A;
        WatermarkModule.H[0x3126 ^ 0x3187] = 0x31E8 ^ 0x3187;
        WatermarkModule.H[0xCEE4 ^ 0xCE9A] = 0xFFFF31E6 ^ 0xCE9A;
        WatermarkModule.H[0x9394 ^ 0x9314] = 0xFFFF6C8D ^ 0x9314;
        WatermarkModule.H[0xA11C ^ 0xA193] = 0xFFFF5E45 ^ 0xA193;
        WatermarkModule.H[0xCA85 ^ 0xCA19] = 0xFFFF35E2 ^ 0xCA19;
        WatermarkModule.H[0x7A69 ^ 0x7A3B] = 0xFFFF85F5 ^ 0x7A3B;
        WatermarkModule.H[0x1084B ^ 0x108BF] = 0xFFFEF721 ^ 0x108BF;
        WatermarkModule.H[0xE562 ^ 0xE461] = 0xE414 ^ 0xE461;
        WatermarkModule.H[0xAD35 ^ 0xAD65] = 0xAD0F ^ 0xAD65;
        WatermarkModule.H[0xAA88 ^ 0xAAB6] = 0xFFFF5514 ^ 0xAAB6;
        WatermarkModule.H[0x13DB ^ 0x12F3] = 0x128F ^ 0x12F3;
        WatermarkModule.H[0x7094 ^ 0x701C] = 0xFFFF8FD0 ^ 0x701C;
        WatermarkModule.H[0x2310 ^ 0x2202] = 0x2250 ^ 0x2202;
        WatermarkModule.H[0x936C ^ 0x9239] = 0xF242 ^ 0x9239;
        WatermarkModule.H[0x3EF0 ^ 0x3E54] = 0xFFFFC1C5 ^ 0x3E54;
        WatermarkModule.H[0xEB0D ^ 0xEB64] = 0xEB7D ^ 0xEB64;
        WatermarkModule.H[0xDD13 ^ 0xDC94] = 0xDC83 ^ 0xDC94;
        WatermarkModule.H[0xDE0E ^ 0xDECC] = 0xFFFF211F ^ 0xDECC;
        WatermarkModule.H[0x64AD ^ 0x64CB] = 0x64D2 ^ 0x64CB;
        WatermarkModule.H[0xBAFC ^ 0xBA2A] = 0xFFFF458D ^ 0xBA2A;
        WatermarkModule.H[0x5FF8 ^ 0x5ECF] = 0xFFFFA114 ^ 0x5ECF;
        WatermarkModule.H[0xC51B ^ 0xC5B9] = 0xC569 ^ 0xC5B9;
        WatermarkModule.H[0xD2A3 ^ 0xD239] = 0xFFFF2DFD ^ 0xD239;
        WatermarkModule.H[0x1557 ^ 0x152E] = 0xFFFFEAF8 ^ 0x152E;
        WatermarkModule.H[0x7E66 ^ 0x7EBD] = 0x7E98 ^ 0x7EBD;
        WatermarkModule.H[0x10892 ^ 0x109B9] = 0xFFFEF64B ^ 0x109B9;
        WatermarkModule.H[0x85A4 ^ 0x84A4] = 0x84B5 ^ 0x84A4;
        WatermarkModule.H[0x8DDB ^ 0x8D8C] = 0xFFFF720E ^ 0x8D8C;
        WatermarkModule.H[0x48AC ^ 0x49BA] = 0xFFFFB673 ^ 0x49BA;
        WatermarkModule.H[0x6423 ^ 0x64D4] = 0xFFFF9B6F ^ 0x64D4;
        WatermarkModule.H[0x10B4E ^ 0x10A0E] = 0x10A64 ^ 0x10A0E;
        WatermarkModule.H[0xFC2E ^ 0xFCE6] = 0xFFFF0364 ^ 0xFCE6;
        WatermarkModule.H[0xDCF8 ^ 0xDCEA] = 0xDDDF ^ 0xDCEA;
        WatermarkModule.H[0xE23B ^ 0xE2EE] = 0xFFFF1D84 ^ 0xE2EE;
        WatermarkModule.H[0x2C1 ^ 0x28D] = 0xFFFFFD56 ^ 0x28D;
        WatermarkModule.H[0xE6C2 ^ 0xE633] = 0xE627 ^ 0xE633;
        WatermarkModule.H[0x6110 ^ 0x610A] = 0xFFFF9ED0 ^ 0x610A;
        WatermarkModule.H[0xA58F ^ 0xA514] = 0xFFFF5AC7 ^ 0xA514;
        WatermarkModule.H[0x279B ^ 0x2786] = 0x27F0 ^ 0x2786;
        WatermarkModule.H[0x916 ^ 0x94F] = 0x967 ^ 0x94F;
        WatermarkModule.H[0x25E1 ^ 0x250C] = 0xFFFFDA51 ^ 0x250C;
        WatermarkModule.H[0x3B87 ^ 0x3B8A] = 0x3BAA ^ 0x3B8A;
        WatermarkModule.H[0x4831 ^ 0x48A5] = 0xFFFFB71D ^ 0x48A5;
        WatermarkModule.H[0x4AE1 ^ 0x4AEF] = 0x4ABB ^ 0x4AEF;
        WatermarkModule.H[0xECE ^ 0xE74] = 0xE29 ^ 0xE74;
        WatermarkModule.H[0xE26D ^ 0xE237] = 0xE20B ^ 0xE237;
        WatermarkModule.H[0xA076 ^ 0xA119] = 0xFFFF5E9C ^ 0xA119;
        WatermarkModule.H[0x9DF6 ^ 0x9D05] = 0xFFFF62F6 ^ 0x9D05;
        WatermarkModule.H[0x9378 ^ 0x922B] = 0x8D9C ^ 0x922B;
        WatermarkModule.H[0x677A ^ 0x67DC] = 0xFFFF9872 ^ 0x67DC;
        WatermarkModule.H[0x7C3B ^ 0x7C66] = 0xFFFF83BB ^ 0x7C66;
        WatermarkModule.H[0x2F2 ^ 0x371] = 0xFFFFFC18 ^ 0x371;
        WatermarkModule.H[0x144F ^ 0x142E] = 0xFFFFEB90 ^ 0x142E;
        WatermarkModule.H[0x7A03 ^ 0x7A40] = 0xFFFF85DB ^ 0x7A40;
        WatermarkModule.H[0x6695 ^ 0x662C] = 0x663B ^ 0x662C;
        WatermarkModule.H[0x8E4C ^ 0x8E8C] = 0xFFFF7112 ^ 0x8E8C;
        WatermarkModule.H[0xF62C ^ 0xF73B] = 0xF728 ^ 0xF73B;
        WatermarkModule.H[0xE5FD ^ 0xE4C8] = 0xFFFF1B72 ^ 0xE4C8;
        WatermarkModule.H[0x10698 ^ 0x106AE] = 0x10685 ^ 0x106AE;
        WatermarkModule.H[0x6E2F ^ 0x6FA1] = 0x6FC9 ^ 0x6FA1;
        WatermarkModule.H[0x55B4 ^ 0x55D0] = 0x55F1 ^ 0x55D0;
        WatermarkModule.H[0x10327 ^ 0x1026F] = 0x10343 ^ 0x1026F;
        WatermarkModule.H[0x9D0B ^ 0x9DF5] = 0xFFFF6215 ^ 0x9DF5;
        WatermarkModule.H[0x6351 ^ 0x63B1] = 0x63BB ^ 0x63B1;
        WatermarkModule.H[0xC1CC ^ 0xC18C] = 0xFFFF3E13 ^ 0xC18C;
        WatermarkModule.H[0x9DAE ^ 0x9DE4] = 0x9D9D ^ 0x9DE4;
        WatermarkModule.H[0xF8BD ^ 0xF871] = 0xFFFF0704 ^ 0xF871;
        WatermarkModule.H[0x4885 ^ 0x490A] = 0xFFFFB6BC ^ 0x490A;
        WatermarkModule.H[0xC7BB ^ 0xC6C2] = 0xC6E9 ^ 0xC6C2;
        WatermarkModule.H[0x73DE ^ 0x7337] = 0x731A ^ 0x7337;
        WatermarkModule.H[0x43C1 ^ 0x4376] = 0x4347 ^ 0x4376;
        WatermarkModule.H[0xD094 ^ 0xD1EA] = 0xD1DD ^ 0xD1EA;
        WatermarkModule.H[0xC563 ^ 0xC43D] = 0xFFFF3BEC ^ 0xC43D;
        WatermarkModule.H[0x2E9D ^ 0x2F98] = 0x2B0E ^ 0x2F98;
        WatermarkModule.H[0x9FD4 ^ 0x9E96] = 0x9E96 ^ 0x9E96;
        WatermarkModule.H[0xFFF8 ^ 0xFFB5] = 0xFFFF0044 ^ 0xFFB5;
        WatermarkModule.H[0xF4F5 ^ 0xF5ED] = 0xF5BC ^ 0xF5ED;
        WatermarkModule.H[0x7867 ^ 0x7858] = 0x7802 ^ 0x7858;
        WatermarkModule.H[0xB375 ^ 0xB319] = 0xB30D ^ 0xB319;
        WatermarkModule.H[0x3FA0 ^ 0x3EE7] = 0x3EE7 ^ 0x3EE7;
        WatermarkModule.H[0x7E17 ^ 0x7ED6] = 0xFFFF8111 ^ 0x7ED6;
        WatermarkModule.H[0xFFF3 ^ 0xFF29] = 0xFFFF00DD ^ 0xFF29;
        WatermarkModule.H[0x6EE0 ^ 0x6FD0] = 0x6F89 ^ 0x6FD0;
        WatermarkModule.H[0x144E ^ 0x14A1] = 0xFFFFEB20 ^ 0x14A1;
        WatermarkModule.H[0x3535 ^ 0x3404] = 0x3438 ^ 0x3404;
        WatermarkModule.H[0xB48D ^ 0xB4E8] = 0xFFFF4B4C ^ 0xB4E8;
        WatermarkModule.H[0x6A02 ^ 0x6A7F] = 0x6A0A ^ 0x6A7F;
        WatermarkModule.H[0x2EB1 ^ 0x2E1E] = 0x2E1A ^ 0x2E1E;
        WatermarkModule.H[0x5F55 ^ 0x5E7B] = 0xFFFFA1E9 ^ 0x5E7B;
        WatermarkModule.H[0x10704 ^ 0x10708] = 0x1077E ^ 0x10708;
        WatermarkModule.H[0xCCB7 ^ 0xCDD2] = 0xCDC8 ^ 0xCDD2;
        WatermarkModule.H[0x202F ^ 0x20C8] = 0x20EF ^ 0x20C8;
        WatermarkModule.H[0x9D06 ^ 0x9D6D] = 0x9D37 ^ 0x9D6D;
        WatermarkModule.H[0xD1F6 ^ 0xD0FE] = 0xD0B8 ^ 0xD0FE;
        WatermarkModule.H[0x2297 ^ 0x23C6] = 0x92D ^ 0x23C6;
        WatermarkModule.H[0xC8B4 ^ 0xC9BE] = 0xC9A3 ^ 0xC9BE;
        WatermarkModule.H[0x6609 ^ 0x66C0] = 0x66AE ^ 0x66C0;
        WatermarkModule.H[0xD502 ^ 0xD525] = 0xD53F ^ 0xD525;
        WatermarkModule.H[0x7279 ^ 0x72C5] = 0xFFFF8D14 ^ 0x72C5;
        WatermarkModule.H[0x8CEB ^ 0x8CCD] = 0x8CE6 ^ 0x8CCD;
        WatermarkModule.H[0xFE97 ^ 0xFE21] = 0xFFFF01D8 ^ 0xFE21;
        WatermarkModule.H[0xB2C4 ^ 0xB3C9] = 0xB3D1 ^ 0xB3C9;
        WatermarkModule.H[0x6705 ^ 0x665A] = 0xFFFF99D2 ^ 0x665A;
        WatermarkModule.H[0xB888 ^ 0xB9BA] = 0xFFFF4678 ^ 0xB9BA;
        WatermarkModule.H[0x6FFD ^ 0x6F60] = 0x6F52 ^ 0x6F60;
        WatermarkModule.H[0x1C41 ^ 0x1DCA] = 0xFFFFE229 ^ 0x1DCA;
        WatermarkModule.H[0x443F ^ 0x4533] = 0xFFFFBA8D ^ 0x4533;
        WatermarkModule.H[0x79D5 ^ 0x7885] = 0x72EF ^ 0x7885;
        WatermarkModule.H[0x7F19 ^ 0x7F00] = 0xFFFF808C ^ 0x7F00;
        WatermarkModule.H[0xCBF0 ^ 0xCB59] = 0xFFFF34F3 ^ 0xCB59;
        WatermarkModule.H[0x10F81 ^ 0x10EBB] = 0x10EAD ^ 0x10EBB;
        WatermarkModule.H[0x2FA ^ 0x212] = 0x21A ^ 0x212;
        WatermarkModule.H[0x3D63 ^ 0x3C7E] = 0x3C32 ^ 0x3C7E;
        WatermarkModule.H[0x4668 ^ 0x477C] = 0xFFFFB882 ^ 0x477C;
        WatermarkModule.H[0xFB4B ^ 0xFB42] = 0xFFFF04FC ^ 0xFB42;
        WatermarkModule.H[0x10523 ^ 0x1053D] = 0x10511 ^ 0x1053D;
        WatermarkModule.H[0xCF6A ^ 0xCF7B] = 0xFFFF3080 ^ 0xCF7B;
        WatermarkModule.H[0x23F8 ^ 0x23F8] = 0x2333 ^ 0x23F8;
        WatermarkModule.H[0x3F67 ^ 0x3F12] = 0xFFFFC0DE ^ 0x3F12;
        WatermarkModule.H[0x10212 ^ 0x10271] = 0xFFFEFDB7 ^ 0x10271;
        WatermarkModule.H[0xE5E9 ^ 0xE55A] = 0xFFFF1ABB ^ 0xE55A;
        WatermarkModule.H[0x8585 ^ 0x8592] = 0xFFFF7A1B ^ 0x8592;
        WatermarkModule.H[0xA3F9 ^ 0xA2E2] = 0xFFFF5D58 ^ 0xA2E2;
        WatermarkModule.H[0xA3DF ^ 0xA375] = 0xA359 ^ 0xA375;
        WatermarkModule.H[0xDDC6 ^ 0xDD6E] = 0xDD30 ^ 0xDD6E;
        WatermarkModule.H[0xCA82 ^ 0xCBC9] = 0x5DAB ^ 0xCBC9;
        WatermarkModule.H[0x2572 ^ 0x25E7] = 0x25B0 ^ 0x25E7;
        WatermarkModule.H[0x2A9A ^ 0x2A3A] = 0xFFFFD580 ^ 0x2A3A;
        WatermarkModule.H[0x9B84 ^ 0x9A8F] = 0x9AF5 ^ 0x9A8F;
        WatermarkModule.H[0xC223 ^ 0xC26C] = 0xC215 ^ 0xC26C;
        WatermarkModule.H[0xB2BB ^ 0xB23D] = 0xFFFF4D8C ^ 0xB23D;
        WatermarkModule.H[0x10B29 ^ 0x10B41] = 0x10B5C ^ 0x10B41;
        WatermarkModule.H[0x1B6A ^ 0x1BF4] = 0x1BDD ^ 0x1BF4;
        WatermarkModule.H[0x238B ^ 0x2389] = 0x23C2 ^ 0x2389;
        WatermarkModule.H[0x8BBD ^ 0x8BEC] = 0xFFFF740B ^ 0x8BEC;
        WatermarkModule.H[0xF31F ^ 0xF3B2] = 0xF3D5 ^ 0xF3B2;
        WatermarkModule.H[0x815B ^ 0x8029] = 0xFFFF7F96 ^ 0x8029;
        WatermarkModule.H[0x30EC ^ 0x3038] = 0x3035 ^ 0x3038;
        WatermarkModule.H[0xBBB8 ^ 0xBAE1] = 0xBAC0 ^ 0xBAE1;
        WatermarkModule.H[0x3DC8 ^ 0x3CA1] = 0x3C90 ^ 0x3CA1;
        WatermarkModule.H[0xF005 ^ 0xF127] = 0xFFFF0EDD ^ 0xF127;
        WatermarkModule.H[0xD6F3 ^ 0xD6FC] = 0xD6F9 ^ 0xD6FC;
        WatermarkModule.H[0x1F09 ^ 0x1F20] = 0x1F2B ^ 0x1F20;
        WatermarkModule.H[0xCED4 ^ 0xCE8B] = 0xCED6 ^ 0xCE8B;
        WatermarkModule.H[0xFD23 ^ 0xFD12] = 0xFFFF02DE ^ 0xFD12;
        WatermarkModule.H[0x4169 ^ 0x4066] = 0xFFFFBFF8 ^ 0x4066;
        WatermarkModule.H[0x4937 ^ 0x49FD] = 0x49A8 ^ 0x49FD;
        WatermarkModule.H[0x519 ^ 0x5E1] = 0x5E4 ^ 0x5E1;
        WatermarkModule.H[0x6845 ^ 0x68C1] = 0x6846 ^ 0x68C1;
        WatermarkModule.H[0x9BFB ^ 0x9AB4] = 0xAF92 ^ 0x9AB4;
        WatermarkModule.H[0xFFDF ^ 0xFF62] = 0xFFFF00D6 ^ 0xFF62;
        WatermarkModule.H[0xD4ED ^ 0xD58D] = 0xD5FE ^ 0xD58D;
        WatermarkModule.H[0x34CD ^ 0x35B2] = 0x358A ^ 0x35B2;
        WatermarkModule.H[0x635F ^ 0x627C] = 0xFFFF9DB2 ^ 0x627C;
        WatermarkModule.H[0x2F3E ^ 0x2FAD] = 0xFFFFD07D ^ 0x2FAD;
        WatermarkModule.H[0x672F ^ 0x675C] = 0xFFFF98B0 ^ 0x675C;
        WatermarkModule.H[0xBE4E ^ 0xBF15] = 0xBF68 ^ 0xBF15;
        WatermarkModule.H[0xC9A6 ^ 0xC960] = 0xC93B ^ 0xC960;
        WatermarkModule.H[0x71B ^ 0x791] = 0x7C1 ^ 0x791;
        WatermarkModule.H[0x6959 ^ 0x695A] = 0x69DF ^ 0x695A;
        WatermarkModule.H[0x6B5C ^ 0x6B3C] = 0x6B46 ^ 0x6B3C;
        WatermarkModule.H[0x72BF ^ 0x73F9] = 0x73F9 ^ 0x73F9;
        WatermarkModule.H[0x359C ^ 0x34D2] = 0x8C56 ^ 0x34D2;
        WatermarkModule.H[0xCA5C ^ 0xCA3E] = 0xFFFF35FA ^ 0xCA3E;
        WatermarkModule.H[0xFD25 ^ 0xFC36] = 0xFC45 ^ 0xFC36;
        WatermarkModule.H[0xFF25 ^ 0xFFEB] = 0xFFFF0079 ^ 0xFFEB;
        WatermarkModule.H[0x88B0 ^ 0x88A5] = 0xFFFF77EA ^ 0x88A5;
        WatermarkModule.H[0xF62F ^ 0xF6D5] = 0xF69C ^ 0xF6D5;
        WatermarkModule.H[0x104A8 ^ 0x104FB] = 0xFFFEFB02 ^ 0x104FB;
        WatermarkModule.H[0xEDA ^ 0xE15] = 0xFFFFF1AC ^ 0xE15;
        WatermarkModule.H[0xDB58 ^ 0xDB29] = 0xFFFF24EA ^ 0xDB29;
        WatermarkModule.H[0xFBF6 ^ 0xFBDD] = 0xFB9A ^ 0xFBDD;
        WatermarkModule.H[0x72ED ^ 0x73CD] = 0x7388 ^ 0x73CD;
        WatermarkModule.H[0x6339 ^ 0x63EA] = 0xFFFF9C23 ^ 0x63EA;
        WatermarkModule.H[0x644C ^ 0x6493] = 0x64B7 ^ 0x6493;
        WatermarkModule.H[0x4304 ^ 0x4239] = 0xFFFFBDA8 ^ 0x4239;
        WatermarkModule.H[0xE2C2 ^ 0xE2E7] = 0xFFFF1D51 ^ 0xE2E7;
        WatermarkModule.H[0xB18 ^ 0xA6D] = 0xA28 ^ 0xA6D;
        WatermarkModule.H[0x4BBC ^ 0x4AF6] = 0x1B34 ^ 0x4AF6;
        WatermarkModule.H[0x72BB ^ 0x729A] = 0xFFFF8D4B ^ 0x729A;
        WatermarkModule.H[0x4C70 ^ 0x4C63] = 0xFFFFB3CC ^ 0x4C63;
        WatermarkModule.H[0x4C18 ^ 0x4C91] = 0x4CAA ^ 0x4C91;
        WatermarkModule.H[0x2E54 ^ 0x2FD0] = 0x2FF9 ^ 0x2FD0;
        WatermarkModule.H[0xBFC9 ^ 0xBE48] = 0xBE4A ^ 0xBE48;
        WatermarkModule.H[0x481A ^ 0x48CD] = 0x4890 ^ 0x48CD;
        WatermarkModule.H[0x339D ^ 0x3345] = 0xFFFFCC8C ^ 0x3345;
        WatermarkModule.H[0xDDC7 ^ 0xDC45] = 0xDC28 ^ 0xDC45;
        WatermarkModule.H[0xF462 ^ 0xF4CC] = 0xFFFF0B33 ^ 0xF4CC;
        WatermarkModule.H[0x6DBF ^ 0x6CB8] = 0x6CD4 ^ 0x6CB8;
        WatermarkModule.H[0x9014 ^ 0x90B1] = 0x90AC ^ 0x90B1;
        WatermarkModule.H[0x7B94 ^ 0x7B91] = 0x7BEF ^ 0x7B91;
        WatermarkModule.H[0xFB7E ^ 0xFA53] = 0xFFFF05CA ^ 0xFA53;
        WatermarkModule.H[0xF56 ^ 0xF57] = 0xFFFFF0DB ^ 0xF57;
        WatermarkModule.H[0xBF7A ^ 0xBE56] = 0xFFFF411D ^ 0xBE56;
        WatermarkModule.H[0xC151 ^ 0xC113] = 0xC168 ^ 0xC113;
        WatermarkModule.H[0xDC1 ^ 0xCF5] = 0xCDB ^ 0xCF5;
        WatermarkModule.H[0x4B8D ^ 0x4BA9] = 0xFFFFB468 ^ 0x4BA9;
        WatermarkModule.H[0x3290 ^ 0x322B] = 0x3247 ^ 0x322B;
        WatermarkModule.H[0xE102 ^ 0xE11E] = 0xE10F ^ 0xE11E;
        WatermarkModule.H[0xCF3C ^ 0xCE04] = 0xCE34 ^ 0xCE04;
        WatermarkModule.H[0x7AE ^ 0x76B] = 0x703 ^ 0x76B;
        WatermarkModule.H[0x4F47 ^ 0x4F06] = 0x4F5D ^ 0x4F06;
        WatermarkModule.H[0x1FE8 ^ 0x1EC9] = 0xFFFFE176 ^ 0x1EC9;
        WatermarkModule.H[0x8EEE ^ 0x8FEA] = 0x8FF2 ^ 0x8FEA;
        WatermarkModule.H[0x5BA0 ^ 0x5B44] = 0xFFFFA439 ^ 0x5B44;
        WatermarkModule.H[0x836A ^ 0x8347] = 0x8302 ^ 0x8347;
        WatermarkModule.H[0x96BB ^ 0x9670] = 0x964B ^ 0x9670;
        WatermarkModule.H[0x27C8 ^ 0x2714] = 0xFFFFD89B ^ 0x2714;
        WatermarkModule.H[0x8334 ^ 0x831A] = 0xFFFF7C95 ^ 0x831A;
        WatermarkModule.H[0xD51E ^ 0xD540] = 0xFFFF2AA6 ^ 0xD540;
        WatermarkModule.H[0xAD66 ^ 0xAC59] = 0xAC71 ^ 0xAC59;
        WatermarkModule.H[0x376A ^ 0x3757] = 0x3771 ^ 0x3757;
        WatermarkModule.H[0x10AB1 ^ 0x10A5D] = 0x10A62 ^ 0x10A5D;
        WatermarkModule.H[0x1C0D ^ 0x1D66] = 0x1D6F ^ 0x1D66;
        WatermarkModule.H[0x5B4C ^ 0x5B53] = 0xFFFFA4BF ^ 0x5B53;
        WatermarkModule.H[0x60E9 ^ 0x61CC] = 0xFFFF9E6C ^ 0x61CC;
        WatermarkModule.H[0x7F18 ^ 0x7E7A] = 0x7E72 ^ 0x7E7A;
        WatermarkModule.H[0x1967 ^ 0x1973] = 0x1968 ^ 0x1973;
        WatermarkModule.H[0x29FB ^ 0x29CC] = 0x29DE ^ 0x29CC;
        WatermarkModule.H[0x6E2D ^ 0x6F75] = 0x6F75 ^ 0x6F75;
        WatermarkModule.H[0xB75B ^ 0xB779] = 0xB709 ^ 0xB779;
        WatermarkModule.H[0x279F ^ 0x2760] = 0x276D ^ 0x2760;
        WatermarkModule.H[0xC294 ^ 0xC293] = 0xC281 ^ 0xC293;
        WatermarkModule.H[0xA8B ^ 0xBFB] = 0xFFFFF478 ^ 0xBFB;
        WatermarkModule.H[0x37FA ^ 0x36D5] = 0x36E8 ^ 0x36D5;
        WatermarkModule.H[0xDE11 ^ 0xDF62] = 0xFFFF209B ^ 0xDF62;
        WatermarkModule.H[0xA75D ^ 0xA674] = 0xFFFF59D3 ^ 0xA674;
        WatermarkModule.H[0xCFD8 ^ 0xCEB0] = 0xFFFF3157 ^ 0xCEB0;
        WatermarkModule.H[0x1095C ^ 0x10838] = 0x10857 ^ 0x10838;
        WatermarkModule.H[0xBBE3 ^ 0xBB00] = 0xFFFF4499 ^ 0xBB00;
        WatermarkModule.H[0x6CEF ^ 0x6CAA] = 0x6CC9 ^ 0x6CAA;
        WatermarkModule.H[0xB881 ^ 0xB9DD] = 0xB9D6 ^ 0xB9DD;
        WatermarkModule.H[0x1081A ^ 0x10836] = 0x1084F ^ 0x10836;
        WatermarkModule.H[0x1034F ^ 0x10334] = 0xFFFEFCEB ^ 0x10334;
        WatermarkModule.H[0x32DC ^ 0x3252] = 0xFFFFCDAB ^ 0x3252;
        WatermarkModule.H[0x4CCF ^ 0x4CCB] = 0x4CC9 ^ 0x4CCB;
        WatermarkModule.H[0x8109 ^ 0x81D0] = 0xFFFF7E4D ^ 0x81D0;
        WatermarkModule.H[0x6C52 ^ 0x6D06] = 0xC87E ^ 0x6D06;
        WatermarkModule.H[0x33B5 ^ 0x3339] = 0x3327 ^ 0x3339;
        WatermarkModule.H[0x56F4 ^ 0x5688] = 0x56D8 ^ 0x5688;
        WatermarkModule.H[0x11A9 ^ 0x10DF] = 0xFFFFEF3D ^ 0x10DF;
        WatermarkModule.H[0x10D9 ^ 0x1154] = 0x1100 ^ 0x1154;
        WatermarkModule.H[0xC057 ^ 0xC156] = 0xC172 ^ 0xC156;
        WatermarkModule.H[0xA43C ^ 0xA50F] = 0xFFFF5A83 ^ 0xA50F;
        WatermarkModule.H[0x1373 ^ 0x13B0] = 0x13A9 ^ 0x13B0;
        WatermarkModule.H[0x652 ^ 0x74C] = 0x74F ^ 0x74C;
        WatermarkModule.H[0x790E ^ 0x794A] = 0x7940 ^ 0x794A;
        WatermarkModule.H[0x4AE3 ^ 0x4A8D] = 0xFFFFB559 ^ 0x4A8D;
        WatermarkModule.H[0xECBF ^ 0xED39] = 0xFFFF12B6 ^ 0xED39;
        WatermarkModule.H[0x8797 ^ 0x87D9] = 0x87F6 ^ 0x87D9;
        WatermarkModule.H[0x32B8 ^ 0x3209] = 0x3219 ^ 0x3209;
        WatermarkModule.H[0x45CB ^ 0x4529] = 0xFFFFBAB3 ^ 0x4529;
        WatermarkModule.H[0x6825 ^ 0x68DC] = 0xFFFF972E ^ 0x68DC;
        WatermarkModule.H[0x3C20 ^ 0x3CB0] = 0xFFFFC376 ^ 0x3CB0;
        WatermarkModule.H[0x7A8 ^ 0x6FA] = 0x3DC8 ^ 0x6FA;
        WatermarkModule.H[0xBC3D ^ 0xBDB8] = 0xFFFF420A ^ 0xBDB8;
        WatermarkModule.H[0x7D4F ^ 0x7DDE] = 0xFFFF8231 ^ 0x7DDE;
        WatermarkModule.H[0xC102 ^ 0xC1A5] = 0xC1EA ^ 0xC1A5;
        WatermarkModule.H[0xB2A9 ^ 0xB3CA] = 0xB3AC ^ 0xB3CA;
        WatermarkModule.H[0xE57D ^ 0xE521] = 0xFFFF1AD9 ^ 0xE521;
        WatermarkModule.H[0x10F4D ^ 0x10F19] = 0xFFFEF081 ^ 0x10F19;
        WatermarkModule.H[0x4DCC ^ 0x4C80] = 0x28C3 ^ 0x4C80;
        WatermarkModule.H[0x3912 ^ 0x3835] = 0xFFFFC7FA ^ 0x3835;
        WatermarkModule.H[0xC5F7 ^ 0xC4AD] = 0xFFFF3B2F ^ 0xC4AD;
        WatermarkModule.H[0xD446 ^ 0xD510] = 0x78AB ^ 0xD510;
        WatermarkModule.H[0x90A8 ^ 0x90DA] = 0x90E8 ^ 0x90DA;
        WatermarkModule.H[0x4879 ^ 0x4947] = 0xFFFFB699 ^ 0x4947;
        WatermarkModule.H[0x7074 ^ 0x703C] = 0x7015 ^ 0x703C;
        WatermarkModule.H[0x3286 ^ 0x320B] = 0xFFFFCDDB ^ 0x320B;
        WatermarkModule.H[0xF764 ^ 0xF7EF] = 0xF79B ^ 0xF7EF;
        WatermarkModule.H[0x8A43 ^ 0x8ADC] = 0xFFFF752B ^ 0x8ADC;
        WatermarkModule.H[0x4161 ^ 0x41DF] = 0xFFFFBE00 ^ 0x41DF;
        WatermarkModule.H[0xB9BC ^ 0xB8C6] = 0xB8E5 ^ 0xB8C6;
        WatermarkModule.H[0x5256 ^ 0x524E] = 0x5303 ^ 0x524E;
        WatermarkModule.H[0x2BDF ^ 0x2BC4] = 0xFFFFD43B ^ 0x2BC4;
        WatermarkModule.H[0x7998 ^ 0x7814] = 0x7888 ^ 0x7814;
        WatermarkModule.H[0xF19C ^ 0xF083] = 0xFFFF0F31 ^ 0xF083;
        WatermarkModule.H[0x5AFA ^ 0x5A24] = 0xFFFFA5D6 ^ 0x5A24;
        WatermarkModule.H[0xE1F4 ^ 0xE0E8] = 0xFFFF1F0B ^ 0xE0E8;
        WatermarkModule.H[0x5D82 ^ 0x5D21] = 0x5D60 ^ 0x5D21;
        WatermarkModule.H[0x10647 ^ 0x106F5] = 0xFFFEF92D ^ 0x106F5;
        WatermarkModule.H[0x10BE ^ 0x1042] = 0x10F4 ^ 0x1042;
        WatermarkModule.H[0x375 ^ 0x3F4] = 0x34F ^ 0x3F4;
        WatermarkModule.H[0x5BDD ^ 0x5A9C] = 0x5A9F ^ 0x5A9C;
        WatermarkModule.H[0xC5E6 ^ 0xC49A] = 0xC4B2 ^ 0xC49A;
        WatermarkModule.H[0x6B1F ^ 0x6B75] = 0xFFFF94CA ^ 0x6B75;
        WatermarkModule.H[0x3C87 ^ 0x3C71] = 0xFFFFC391 ^ 0x3C71;
        WatermarkModule.H[0x15EF ^ 0x150E] = 0x15C0 ^ 0x150E;
        WatermarkModule.H[0xC494 ^ 0xC4BC] = 0xC48D ^ 0xC4BC;
        WatermarkModule.H[0xD3EB ^ 0xD38C] = 0xFFFF2C7B ^ 0xD38C;
        WatermarkModule.H[0xBF1B ^ 0xBE0E] = 0xFFFF41D3 ^ 0xBE0E;
        WatermarkModule.H[0xAF77 ^ 0xAF45] = 0xFFFF50C0 ^ 0xAF45;
        WatermarkModule.H[0xE0A0 ^ 0xE05B] = 0xE040 ^ 0xE05B;
        WatermarkModule.H[0x40C0 ^ 0x4086] = 0xFFFFBF4C ^ 0x4086;
        WatermarkModule.H[0xD029 ^ 0xD044] = 0xFFFF2FB8 ^ 0xD044;
        WatermarkModule.H[0xF59C ^ 0xF4F2] = 0xF5EA ^ 0xF4F2;
        WatermarkModule.H[0x93A4 ^ 0x929D] = 0xFFFF6D42 ^ 0x929D;
        WatermarkModule.H[0x665F ^ 0x66BA] = 0x66C3 ^ 0x66BA;
        WatermarkModule.H[0x62C6 ^ 0x638F] = 0xB2F ^ 0x638F;
        WatermarkModule.H[0xE838 ^ 0xE94C] = 0xFFFF1631 ^ 0xE94C;
        WatermarkModule.H[0x321C ^ 0x320A] = 0xFFFFCDD3 ^ 0x320A;
        WatermarkModule.H[0x6569 ^ 0x65EE] = 0xFFFF9A17 ^ 0x65EE;
        WatermarkModule.H[0x739D ^ 0x735A] = 0xFFFF8CE7 ^ 0x735A;
        WatermarkModule.H[0x21CC ^ 0x2167] = 0x2131 ^ 0x2167;
        WatermarkModule.H[0xECE4 ^ 0xEDFD] = 0xFFFF122C ^ 0xEDFD;
        WatermarkModule.H[0x874E ^ 0x87A0] = 0x87E2 ^ 0x87A0;
        WatermarkModule.H[0xCE09 ^ 0xCECD] = 0xCE99 ^ 0xCECD;
        WatermarkModule.H[0x527 ^ 0x55D] = 0x570 ^ 0x55D;
        WatermarkModule.H[0xE04D ^ 0xE080] = 0xE0A1 ^ 0xE080;
        WatermarkModule.H[0x10A1B ^ 0x10A89] = 0x10AA2 ^ 0x10A89;
        WatermarkModule.H[0x2BA5 ^ 0x2B85] = 0xFFFFD455 ^ 0x2B85;
    }
}

