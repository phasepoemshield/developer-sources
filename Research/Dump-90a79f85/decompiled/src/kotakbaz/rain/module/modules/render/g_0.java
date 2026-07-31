/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.opengl.GlStateManager
 *  net.minecraft.class_1921
 *  net.minecraft.class_1922
 *  net.minecraft.class_2261
 *  net.minecraft.class_2338
 *  net.minecraft.class_2374
 *  net.minecraft.class_238
 *  net.minecraft.class_243
 *  net.minecraft.class_2680
 *  net.minecraft.class_4587
 *  net.minecraft.class_4587$class_4665
 *  net.minecraft.class_4588
 *  net.minecraft.class_4597
 *  net.minecraft.class_4597$class_4598
 *  net.minecraft.class_638
 *  net.minecraft.class_9799
 */
package kotakbaz.rain.module.modules.render;

import com.mojang.blaze3d.opengl.GlStateManager;
import java.awt.Color;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import kotakbaz.rain.client.extensions.b_0;
import kotakbaz.rain.event.events.B;
import kotakbaz.rain.event.events.d_0;
import kotakbaz.rain.module.a_0;
import kotakbaz.rain.module.modules.render.P;
import kotakbaz.rain.module.modules.render.Y;
import kotakbaz.rain.module.setting.settings.c;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import net.minecraft.class_1921;
import net.minecraft.class_1922;
import net.minecraft.class_2261;
import net.minecraft.class_2338;
import net.minecraft.class_2374;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_2680;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import net.minecraft.class_4597;
import net.minecraft.class_638;
import net.minecraft.class_9799;
import org.jetbrains.annotations.NotNull;
import sweetie.evaware.flora.api.Commando;

/*
 * Renamed from kotakbaz.rain.module.modules.render.g
 */
@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\u00a2\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001[B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0006\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007\u00a2\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u000bH\u0007\u00a2\u0006\u0004\b\f\u0010\rJ/\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0002\u00a2\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\b\u001b\u0010\u001cJ%\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\b\u001f\u0010 J'\u0010&\u001a\u00020%2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020!2\u0006\u0010$\u001a\u00020\u001eH\u0002\u00a2\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0013H\u0002\u00a2\u0006\u0004\b(\u0010)JG\u00105\u001a\u00020\u00042\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u0002002\u0006\u00103\u001a\u0002002\u0006\u00104\u001a\u000200H\u0002\u00a2\u0006\u0004\b5\u00106JO\u00108\u001a\u00020\u00042\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.2\u0006\u00107\u001a\u00020\u00102\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u0002002\u0006\u00103\u001a\u0002002\u0006\u00104\u001a\u000200H\u0002\u00a2\u0006\u0004\b8\u00109Jo\u0010@\u001a\u00020\u00042\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,2\u0006\u0010:\u001a\u00020\u00102\u0006\u0010;\u001a\u00020\u00102\u0006\u0010<\u001a\u00020\u00102\u0006\u0010=\u001a\u00020\u00102\u0006\u0010>\u001a\u00020\u00102\u0006\u0010?\u001a\u00020\u00102\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u0002002\u0006\u00103\u001a\u0002002\u0006\u00104\u001a\u000200H\u0002\u00a2\u0006\u0004\b@\u0010AJW\u0010G\u001a\u00020\u00042\u0006\u0010-\u001a\u00020,2\u0006\u0010C\u001a\u00020B2\u0006\u0010D\u001a\u00020\u00102\u0006\u0010E\u001a\u00020\u00102\u0006\u0010F\u001a\u00020\u00102\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u0002002\u0006\u00103\u001a\u0002002\u0006\u00104\u001a\u000200H\u0002\u00a2\u0006\u0004\bG\u0010HR\u0014\u0010I\u001a\u0002008\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010K\u001a\u00020\u00108\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010M\u001a\u00020\u00108\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bM\u0010LR\u0014\u0010N\u001a\u00020\u00108\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bN\u0010LR\u0014\u0010\u0011\u001a\u00020O8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0011\u0010PR\u0014\u0010\u0012\u001a\u00020O8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0012\u0010PR\u0014\u0010R\u001a\u00020Q8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010U\u001a\u00020T8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bU\u0010VR$\u0010Y\u001a\u0012\u0012\u0004\u0012\u00020\u00170Wj\b\u0012\u0004\u0012\u00020\u0017`X8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bY\u0010Z\u00a8\u0006\\"}, d2={"Lkotakbaz/rain/module/modules/render/HitWavesModule;", "Lkotakbaz/rain/module/Module;", "<init>", "()V", "", "onDisable", "onEnable", "Lkotakbaz/rain/event/events/AttackEvent;", "event", "onAttack", "(Lkotakbaz/rain/event/events/AttackEvent;)V", "Lkotakbaz/rain/event/events/Render3DEvent;", "onRender3D", "(Lkotakbaz/rain/event/events/Render3DEvent;)V", "Lnet/minecraft/class_243;", "center", "", "radius", "speed", "Ljava/awt/Color;", "color", "spawnWave", "(Lnet/minecraft/class_243;FFLjava/awt/Color;)V", "Lkotakbaz/rain/module/modules/render/HitWavesModule$Wave;", "wave", "distance", "waveFront", "computeAlphaForBlock", "(Lkotakbaz/rain/module/modules/render/HitWavesModule$Wave;FF)F", "", "Lnet/minecraft/class_2338;", "collectSurfaceBlocks", "(Lnet/minecraft/class_243;F)Ljava/util/List;", "Lnet/minecraft/class_2680;", "aboveState", "state", "pos", "", "isSurfaceBlock", "(Lnet/minecraft/class_2680;Lnet/minecraft/class_2680;Lnet/minecraft/class_2338;)Z", "selectedColor", "()Ljava/awt/Color;", "Lnet/minecraft/class_4587;", "matrices", "Lnet/minecraft/class_4588;", "buffer", "Lnet/minecraft/class_238;", "box", "", "red", "green", "blue", "alpha", "drawSolidBox", "(Lnet/minecraft/class_4587;Lnet/minecraft/class_4588;Lnet/minecraft/class_238;IIII)V", "width", "drawWireframeBox", "(Lnet/minecraft/class_4587;Lnet/minecraft/class_4588;Lnet/minecraft/class_238;FIIII)V", "minX", "minY", "minZ", "maxX", "maxY", "maxZ", "addBoxVertices", "(Lnet/minecraft/class_4587;Lnet/minecraft/class_4588;FFFFFFIIII)V", "Lnet/minecraft/class_4587$class_4665;", "entry", "x", "y", "z", "addVertex", "(Lnet/minecraft/class_4588;Lnet/minecraft/class_4587$class_4665;FFFIIII)V", "BUFFER_SIZE", "I", "WAVE_THICKNESS", "F", "FILLED_ALPHA_SCALE", "OUTLINE_WIDTH", "Lkotakbaz/rain/module/setting/settings/SliderSetting;", "Lkotakbaz/rain/module/setting/settings/SliderSetting;", "Lkotakbaz/rain/module/setting/settings/BooleanSetting;", "useClientColor", "Lkotakbaz/rain/module/setting/settings/BooleanSetting;", "Lkotakbaz/rain/module/setting/settings/ColorSetting;", "waveColor", "Lkotakbaz/rain/module/setting/settings/ColorSetting;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "waves", "Ljava/util/ArrayList;", "Wave", "rain-visuals"})
public final class g_0
extends a_0 {
    @NotNull
    public static final g_0 INSTANCE;
    private static final int a = 262144;
    private static final float A = 1.0f;
    private static final float b = 0.35f;
    private static final float B = 0.015f;
    @NotNull
    private static final kotakbaz.rain.module.setting.settings.a_0 c;
    @NotNull
    private static final kotakbaz.rain.module.setting.settings.a_0 C;
    @NotNull
    private static final c d;
    @NotNull
    private static final kotakbaz.rain.module.setting.settings.B D;
    @NotNull
    private static final ArrayList<Y> e;
    private static Object[] E;
    private static Object F;
    private static Object[] g;
    private static Object[] f;
    private static Object[] G;
    public static int[] h;

    private g_0() {
        int n = h[0];
        n -= h[1];
        int n2 = h[3];
        n2 -= h[4];
        int n3 = h[6];
        n3 += h[7];
        super((String)E[n += h[2]], kotakbaz.rain.client.extensions.a_0.getRENDER(), (String)E[n2 ^= h[5]] + (String)E[n3 ^= h[8]]);
    }

    @Override
    public void onDisable() {
        e.clear();
    }

    @Override
    public void onEnable() {
        e.clear();
    }

    @Commando
    public final void onAttack(@NotNull d_0 d_02) {
        int n = h[9];
        n += h[10];
        Intrinsics.checkNotNullParameter(d_02, (String)E[n += h[11]]);
        if (!this.isEnabled()) {
            return;
        }
        if (b_0.getMc().field_1687 == null) {
            return;
        }
        class_243 class_2432 = d_02.getEntity().method_19538();
        int n2 = h[12];
        n2 -= h[13];
        Intrinsics.checkNotNullExpressionValue(class_2432, (String)E[n2 ^= h[14]]);
        this.spawnWave(class_2432, ((Number)c.getValue()).floatValue(), ((Number)C.getValue()).floatValue(), this.selectedColor());
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Commando
    public final void onRender3D(@NotNull B b2) {
        long l = -6250014773975959712L;
        long l2 = -8272296326283671488L;
        int n = h[15];
        n -= h[16];
        Intrinsics.checkNotNullParameter(b2, (String)E[n += h[17]]);
        if (!this.isEnabled() || e.isEmpty()) {
            return;
        }
        int n2 = h[18];
        n2 -= h[19];
        class_9799 class_97992 = new class_9799(n2 ^= h[20]);
        class_243 class_2432 = b_0.getMc().field_1773.method_19418().method_19326();
        long l3 = System.currentTimeMillis();
        GlStateManager._enableBlend();
        int n3 = h[21];
        n3 ^= h[22];
        n3 -= h[23];
        int n4 = h[24];
        n4 += h[25];
        int n5 = h[27];
        n5 += h[28];
        int n6 = h[30];
        n6 -= h[31];
        GlStateManager._blendFuncSeparate((int)n3, (int)(n4 += h[26]), (int)(n5 ^= h[29]), (int)(n6 ^= h[32]));
        GlStateManager._enableDepthTest();
        GlStateManager._disableCull();
        try {
            class_4597.class_4598 class_45982 = class_4597.method_22991((class_9799)class_97992);
            class_4588 class_45882 = class_45982.getBuffer(class_1921.method_49042());
            b2.getMatrices().method_22903();
            b2.getMatrices().method_22904(-class_2432.field_1352, -class_2432.field_1351, -class_2432.field_1350);
            Iterator<Y> iterator2 = e.iterator();
            int n7 = h[33];
            n7 -= h[34];
            Intrinsics.checkNotNullExpressionValue(iterator2, (String)E[n7 += h[35]]);
            Iterator<Y> iterator3 = iterator2;
            while (iterator3.hasNext()) {
                Y y2;
                int n8 = h[36];
                n8 ^= h[37];
                Intrinsics.checkNotNullExpressionValue(iterator3.next(), (String)E[n8 -= h[38]]);
                float f2 = (float)(l3 - y2.getStartTime()) / 1000.0f;
                if (f2 > y2.getDurationSeconds()) {
                    iterator3.remove();
                    continue;
                }
                float f3 = f2 * y2.getSpeed();
                for (class_2338 class_23382 : y2.getBlocks()) {
                    float f4;
                    class_243 class_2433 = new class_243((double)class_23382.method_10263() + Double.longBitsToDouble(0x102945AB71C755D2L ^ 0x2FC945AB71C755D2L), (double)class_23382.method_10264() + Double.longBitsToDouble(0x684B1898B92379B4L ^ 0x57AB1898B92379B4L), (double)class_23382.method_10260() + Double.longBitsToDouble(0xF894C7EAC87C17E7L ^ 0xC774C7EAC87C17E7L));
                    float f5 = (float)Math.sqrt(class_2433.method_1025(y2.getCenter()));
                    if (f5 > y2.getRadius() || (f4 = this.computeAlphaForBlock(y2, f5, f3)) <= 0.0f) continue;
                    int n9 = h[39];
                    n9 += h[40];
                    n9 ^= h[41];
                    int n10 = h[42];
                    n10 += h[43];
                    long l4 = l2;
                    int n11 = h[45];
                    n11 += h[46];
                    l2 = l4 ^ ((long)RangesKt.coerceIn((int)(150.0f * f4 * 0.35f), n9, n10 ^= h[44]) ^ l4) & -1L >>> (n11 ^= h[47]);
                    int n12 = h[48];
                    n12 ^= h[49];
                    n12 -= h[50];
                    int n13 = h[51];
                    n13 ^= h[52];
                    n13 -= h[53];
                    int n14 = h[54];
                    n14 -= h[55];
                    long l5 = l2;
                    int n15 = h[57];
                    n15 -= h[58];
                    l2 = l5 ^ ((long)RangesKt.coerceIn((int)(255.0f * f4), n12, n13) << (n14 += h[56]) ^ l5) & -1L << (n15 -= h[59]);
                    Color color = y2.getColor();
                    int n16 = h[60];
                    n16 -= h[61];
                    n16 += h[62];
                    int n17 = h[63];
                    n17 ^= h[64];
                    n17 ^= h[65];
                    int n18 = h[66];
                    n18 -= h[67];
                    n18 -= h[68];
                    int n19 = h[69];
                    n19 += h[70];
                    n19 -= h[71];
                    int n20 = h[72];
                    n20 += h[73];
                    int n21 = h[75];
                    n21 -= h[76];
                    int n22 = h[78];
                    n22 -= h[79];
                    Color color2 = new Color(RangesKt.coerceAtMost(color.getRed() + n16, n17), RangesKt.coerceAtMost(color.getGreen() + n18, n19), RangesKt.coerceAtMost(color.getBlue() + (n20 += h[74]), n21 -= h[77]), (int)(l2 >>> (n22 += h[80])));
                    class_238 class_2382 = new class_238(class_23382).method_1014(Double.longBitsToDouble(0x17EBDE028FB5BF6AL ^ 0x288BBC4F5D441696L));
                    class_238 class_2383 = new class_238(class_23382).method_1014(Double.longBitsToDouble(0x33C6329BD40AA538L ^ 0xCB2487A93A4B143L));
                    class_4587 class_45872 = b2.getMatrices();
                    Intrinsics.checkNotNull(class_45882);
                    Intrinsics.checkNotNull(class_2382);
                    this.drawSolidBox(class_45872, class_45882, class_2382, color.getRed(), color.getGreen(), color.getBlue(), (int)l2);
                    class_4587 class_45873 = b2.getMatrices();
                    Intrinsics.checkNotNull(class_2383);
                    this.drawWireframeBox(class_45873, class_45882, class_2383, 0.015f, color2.getRed(), color2.getGreen(), color2.getBlue(), color2.getAlpha());
                }
            }
            b2.getMatrices().method_22909();
            class_45982.method_22993();
        }
        finally {
            class_97992.close();
            GlStateManager._enableCull();
            GlStateManager._disableBlend();
        }
    }

    private final void spawnWave(class_243 class_2432, float f2, float f3, Color color) {
        List<class_2338> list = this.collectSurfaceBlocks(class_2432, f2);
        float f4 = (f2 + 2.0f) / Math.max(0.1f, f3);
        e.add(new Y(class_2432, f2, f3, f4, color, System.currentTimeMillis(), list));
    }

    private final float computeAlphaForBlock(Y y2, float f2, float f3) {
        float f4 = Math.min((float)y2.getColor().getAlpha() / 255.0f, 0.8f);
        float f5 = Math.abs(f2 - f3);
        if (f5 > 1.0f) {
            return 0.0f;
        }
        return f4 * (1.0f - f5 / 1.0f);
    }

    private final List<class_2338> collectSurfaceBlocks(class_243 class_2432, float f2) {
        long l = 6386907541040394724L;
        long l2 = -7720909288809051414L;
        long l3 = -7784206277783065669L;
        long l4 = 3743599740717936115L;
        long l5 = 1424383980697952285L;
        long l6 = -221393837346110909L;
        long l7 = -6215945298924026060L;
        long l8 = 1906557369041399651L;
        long l9 = -9199104977571746355L;
        long l10 = -6720146847800642480L;
        long l11 = -1848643584247376820L;
        long l12 = -8544883291631017583L;
        long l13 = -8779805685547022111L;
        class_638 class_6382 = b_0.getMc().field_1687;
        if (class_6382 == null) {
            return CollectionsKt.emptyList();
        }
        class_638 class_6383 = class_6382;
        ArrayList<class_2338> arrayList = new ArrayList<class_2338>();
        int n = h[81];
        n -= h[82];
        long l14 = l12;
        int n2 = h[84];
        n2 += h[85];
        l12 = l14 ^ ((long)((int)Math.ceil(f2)) << (n ^= h[83]) ^ l14) & -1L << (n2 -= h[86]);
        class_2338 class_23382 = class_2338.method_49638((class_2374)((class_2374)class_2432));
        float f3 = f2 * f2;
        int n3 = h[87];
        n3 += h[88];
        long l15 = l12;
        int n4 = h[90];
        n4 += h[91];
        l12 = l15 ^ ((long)(-((int)(l12 >>> (n3 += h[89])))) ^ l15) & -1L >>> (n4 ^= h[92]);
        int n5 = h[93];
        n5 -= h[94];
        if ((int)l12 <= (int)(l12 >>> (n5 ^= h[95]))) {
            while (true) {
                int n6 = h[96];
                n6 -= h[97];
                n6 ^= h[98];
                int n7 = h[99];
                n7 ^= h[100];
                long l16 = l13;
                int n8 = h[102];
                n8 += h[103];
                l13 = l16 ^ ((long)(-((int)(l12 >>> n6))) << (n7 += h[101]) ^ l16) & -1L << (n8 ^= h[104]);
                int n9 = h[105];
                n9 -= h[106];
                int n10 = h[108];
                n10 += h[109];
                if ((int)(l13 >>> (n9 ^= h[107])) <= (int)(l12 >>> (n10 -= h[110]))) {
                    while (true) {
                        int n11 = h[111];
                        n11 += h[112];
                        long l17 = l13;
                        int n12 = h[114];
                        n12 += h[115];
                        l13 = l17 ^ ((long)(-((int)(l12 >>> (n11 -= h[113])))) ^ l17) & -1L >>> (n12 += h[116]);
                        int n13 = h[117];
                        n13 += h[118];
                        if ((int)l13 <= (int)(l12 >>> (n13 += h[119]))) {
                            while (true) {
                                int n14 = h[120];
                                n14 -= h[121];
                                class_2338 class_23383 = class_23382.method_10069((int)l12, (int)(l13 >>> (n14 -= h[122])), (int)l13);
                                class_243 class_2433 = new class_243((double)class_23383.method_10263() + Double.longBitsToDouble(0xF4E005C18825560CL ^ 0xCB0005C18825560CL), (double)class_23383.method_10264() + Double.longBitsToDouble(0xF5DC4E7BEFDF84C1L ^ 0xCA3C4E7BEFDF84C1L), (double)class_23383.method_10260() + Double.longBitsToDouble(0x25503EC87CB47E5CL ^ 0x1AB03EC87CB47E5CL));
                                if (!(class_2433.method_1025(class_2432) > (double)f3)) {
                                    class_2338 class_23384;
                                    class_2680 class_26802;
                                    class_2338 class_23385 = class_23383;
                                    class_2680 class_26803 = class_6383.method_8320(class_23385);
                                    if (class_26803.method_26204() instanceof class_2261 && !(class_26802 = class_6383.method_8320(class_23384 = class_23385.method_10074())).method_26215()) {
                                        class_23385 = class_23384;
                                        class_26803 = class_26802;
                                    }
                                    class_2680 class_26804 = class_6383.method_8320(class_23385.method_10084());
                                    int n15 = h[123];
                                    n15 += h[124];
                                    int n16 = h[126];
                                    n16 += h[127];
                                    Intrinsics.checkNotNullExpressionValue(class_26804, (String)E[n15 += h[125]] + (String)E[n16 += h[128]]);
                                    class_23384 = class_26803;
                                    Intrinsics.checkNotNull(class_23384);
                                    class_2338 class_23386 = class_23384;
                                    class_23384 = class_23385;
                                    Intrinsics.checkNotNull(class_23384);
                                    if (this.isSurfaceBlock(class_26804, (class_2680)class_23386, class_23384)) {
                                        arrayList.add(class_23385);
                                    }
                                }
                                int n17 = h[129];
                                n17 ^= h[130];
                                if ((int)l13 == (int)(l12 >>> (n17 -= h[131]))) break;
                                long l18 = l13;
                                int n18 = h[132];
                                n18 -= h[133];
                                int n19 = h[135];
                                n19 += h[136];
                                l13 = l18 ^ (l18 ^ l18 + (long)(n18 -= h[134])) & -1L >>> (n19 += h[137]);
                            }
                        }
                        int n20 = h[138];
                        n20 ^= h[139];
                        int n21 = h[141];
                        n21 ^= h[142];
                        if ((int)(l13 >>> (n20 -= h[140])) == (int)(l12 >>> (n21 ^= h[143]))) break;
                        l13 += 0x100000000L;
                    }
                }
                int n22 = h[144];
                n22 += h[145];
                if ((int)l12 == (int)(l12 >>> (n22 += h[146]))) break;
                long l19 = l12;
                int n23 = h[147];
                n23 -= h[148];
                int n24 = h[150];
                n24 -= h[151];
                l12 = l19 ^ (l19 ^ l19 + (long)(n23 -= h[149])) & -1L >>> (n24 -= h[152]);
            }
        }
        return arrayList;
    }

    private final boolean isSurfaceBlock(class_2680 class_26802, class_2680 class_26803, class_2338 class_23382) {
        boolean bl;
        class_638 class_6382 = b_0.getMc().field_1687;
        if (class_6382 == null) {
            boolean bl2 = h[153];
            bl2 -= h[154];
            return bl2 -= h[155];
        }
        class_638 class_6383 = class_6382;
        if (class_26803.method_26215()) {
            boolean bl3 = h[156];
            bl3 += h[157];
            return bl3 += h[158];
        }
        if (!class_26802.method_26215()) {
            boolean bl4 = h[159];
            bl4 -= h[160];
            return bl4 ^= h[161];
        }
        if (!class_26803.method_26220((class_1922)class_6383, class_23382).method_1110()) {
            boolean bl5 = h[162];
            bl5 -= h[163];
            bl = bl5 -= h[164];
        } else {
            boolean bl6 = h[165];
            bl6 ^= h[166];
            bl = bl6 += h[167];
        }
        return bl;
    }

    private final Color selectedColor() {
        return (Boolean)d.getValue() != false && P.INSTANCE.isEnabled() ? P.INSTANCE.getClientColor() : (Color)D.getValue();
    }

    private final void drawSolidBox(class_4587 class_45872, class_4588 class_45882, class_238 class_2382, int n, int n2, int n3, int n4) {
        this.addBoxVertices(class_45872, class_45882, (float)class_2382.field_1323, (float)class_2382.field_1322, (float)class_2382.field_1321, (float)class_2382.field_1320, (float)class_2382.field_1325, (float)class_2382.field_1324, n, n2, n3, n4);
    }

    private final void drawWireframeBox(class_4587 class_45872, class_4588 class_45882, class_238 class_2382, float f2, int n, int n2, int n3, int n4) {
        float f3 = (float)class_2382.field_1323;
        float f4 = (float)class_2382.field_1322;
        float f5 = (float)class_2382.field_1321;
        float f6 = (float)class_2382.field_1320;
        float f7 = (float)class_2382.field_1325;
        float f8 = (float)class_2382.field_1324;
        this.addBoxVertices(class_45872, class_45882, f3 - f2, f4, f5 - f2, f3 + f2, f7, f5 + f2, n, n2, n3, n4);
        this.addBoxVertices(class_45872, class_45882, f6 - f2, f4, f5 - f2, f6 + f2, f7, f5 + f2, n, n2, n3, n4);
        this.addBoxVertices(class_45872, class_45882, f3 - f2, f4, f8 - f2, f3 + f2, f7, f8 + f2, n, n2, n3, n4);
        this.addBoxVertices(class_45872, class_45882, f6 - f2, f4, f8 - f2, f6 + f2, f7, f8 + f2, n, n2, n3, n4);
        this.addBoxVertices(class_45872, class_45882, f3, f4 - f2, f5 - f2, f6, f4 + f2, f5 + f2, n, n2, n3, n4);
        this.addBoxVertices(class_45872, class_45882, f3, f4 - f2, f8 - f2, f6, f4 + f2, f8 + f2, n, n2, n3, n4);
        this.addBoxVertices(class_45872, class_45882, f3, f7 - f2, f5 - f2, f6, f7 + f2, f5 + f2, n, n2, n3, n4);
        this.addBoxVertices(class_45872, class_45882, f3, f7 - f2, f8 - f2, f6, f7 + f2, f8 + f2, n, n2, n3, n4);
        this.addBoxVertices(class_45872, class_45882, f3 - f2, f4 - f2, f5, f3 + f2, f4 + f2, f8, n, n2, n3, n4);
        this.addBoxVertices(class_45872, class_45882, f6 - f2, f4 - f2, f5, f6 + f2, f4 + f2, f8, n, n2, n3, n4);
        this.addBoxVertices(class_45872, class_45882, f3 - f2, f7 - f2, f5, f3 + f2, f7 + f2, f8, n, n2, n3, n4);
        this.addBoxVertices(class_45872, class_45882, f6 - f2, f7 - f2, f5, f6 + f2, f7 + f2, f8, n, n2, n3, n4);
    }

    private final void addBoxVertices(class_4587 class_45872, class_4588 class_45882, float f2, float f3, float f4, float f5, float f6, float f7, int n, int n2, int n3, int n4) {
        class_4587.class_4665 class_46652 = class_45872.method_23760();
        Intrinsics.checkNotNull(class_46652);
        this.addVertex(class_45882, class_46652, f2, f3, f4, n, n2, n3, n4);
        this.addVertex(class_45882, class_46652, f5, f3, f4, n, n2, n3, n4);
        this.addVertex(class_45882, class_46652, f5, f3, f7, n, n2, n3, n4);
        this.addVertex(class_45882, class_46652, f2, f3, f7, n, n2, n3, n4);
        this.addVertex(class_45882, class_46652, f2, f6, f7, n, n2, n3, n4);
        this.addVertex(class_45882, class_46652, f5, f6, f7, n, n2, n3, n4);
        this.addVertex(class_45882, class_46652, f5, f6, f4, n, n2, n3, n4);
        this.addVertex(class_45882, class_46652, f2, f6, f4, n, n2, n3, n4);
        this.addVertex(class_45882, class_46652, f2, f3, f4, n, n2, n3, n4);
        this.addVertex(class_45882, class_46652, f2, f6, f4, n, n2, n3, n4);
        this.addVertex(class_45882, class_46652, f5, f6, f4, n, n2, n3, n4);
        this.addVertex(class_45882, class_46652, f5, f3, f4, n, n2, n3, n4);
        this.addVertex(class_45882, class_46652, f5, f3, f4, n, n2, n3, n4);
        this.addVertex(class_45882, class_46652, f5, f6, f4, n, n2, n3, n4);
        this.addVertex(class_45882, class_46652, f5, f6, f7, n, n2, n3, n4);
        this.addVertex(class_45882, class_46652, f5, f3, f7, n, n2, n3, n4);
        this.addVertex(class_45882, class_46652, f5, f3, f7, n, n2, n3, n4);
        this.addVertex(class_45882, class_46652, f5, f6, f7, n, n2, n3, n4);
        this.addVertex(class_45882, class_46652, f2, f6, f7, n, n2, n3, n4);
        this.addVertex(class_45882, class_46652, f2, f3, f7, n, n2, n3, n4);
        this.addVertex(class_45882, class_46652, f2, f3, f7, n, n2, n3, n4);
        this.addVertex(class_45882, class_46652, f2, f6, f7, n, n2, n3, n4);
        this.addVertex(class_45882, class_46652, f2, f6, f4, n, n2, n3, n4);
        this.addVertex(class_45882, class_46652, f2, f3, f4, n, n2, n3, n4);
    }

    private final void addVertex(class_4588 class_45882, class_4587.class_4665 class_46652, float f2, float f3, float f4, int n, int n2, int n3, int n4) {
        class_45882.method_56824(class_46652, f2, f3, f4).method_1336(n, n2, n3, n4);
    }

    private static final boolean useClientColor$lambda$0() {
        return P.INSTANCE.isEnabled();
    }

    private static final boolean waveColor$lambda$0() {
        int n;
        if (!((Boolean)d.getValue()).booleanValue() || !P.INSTANCE.isEnabled()) {
            int n2 = h[168];
            n2 -= h[169];
            n = n2 += h[170];
        } else {
            int n3 = h[171];
            n3 -= h[172];
            n = n3 -= h[173];
        }
        return n != 0;
    }

    static {
        g_0.b();
        long l = 858861803506458763L;
        long l2 = 8866141065401102584L;
        long l3 = 6713120271455362068L;
        long l4 = 8518234990469690870L;
        long l5 = -2481884254808940987L;
        long l6 = 6799921908555630881L;
        long l7 = 1808223647662454676L;
        long l8 = 6254956484513100511L;
        long l9 = 92086231508009761L;
        long l10 = 8886858533126021410L;
        long l11 = -5620852281165767601L;
        long l12 = 8380220114151696674L;
        long l13 = 8752721580684745110L;
        long l14 = 3358885325435924557L;
        int n = h[174];
        n ^= h[175];
        E = new Object[n -= h[176]];
        long l15 = l14;
        int n2 = h[177];
        n2 ^= h[178];
        l14 = l15 ^ (0L ^ l15) & -1L << (n2 -= h[179]);
        Object[] objectArray = new Object[h[180]];
        objectArray[g_0.h[181]] = f;
        objectArray[g_0.h[182]] = h[183];
        int n3 = h[184];
        Object object = g_0.A()[h[185]];
        if (object == null) {
            char[] cArray = "\u7490\u7494\u74c9\u74c7\u747e\u742c\u7471\u7491\u745d\u7466\u7476\u746e\u74cb\u7427\u7468\u74ca\u7427\u7469\u7480\u74c8\u7468\u742c\u7486\u7461\u7468\u7469\u746d\u7454\u7474\u74ca\u7490\u742c\u74cd\u7481\u7494\u742c\u7470\u7471\u7470\u74c9\u7495\u7474\u74cd\u7462\u746d\u746e\u7467\u7480\u7461\u7481\u7466\u7469\u746b\u746a\u7452\u747e\u7491\u74cb\u7467\u7453\u7473\u746b\u7454\u746c\u7493\u743e\u7472\u7496\u74ce\u7450\u7466\u7428\u747f\u7461\u7476\u7471\u746a\u74ce\u7484\u74cd\u7453\u7470\u7475\u7470\u746d\u7480\u7492\u746c\u7493\u746f\u7490\u747d\u742c\u7465\u745e\u7491\u7467\u7471\u74cb\u7468\u7451\u742c\u7469\u7461\u7463\u743e\u7492\u7491\u74cb\u7470\u7452\u7480\u7428\u74ca\u74cc\u7472\u7468\u7474\u7463\u7464\u7467\u7474\u746b\u7465\u7463\u7473\u7454\u7472\u7452\u7462\u7470\u748f\u746c\u74ca\u7482\u7496\u7484\u7470\u7490\u7483\u7468\u745f\u746b\u746e\u7453\u7471\u7471\u745d\u74cb\u743e\u7456\u7475\u7493\u746d\u74c7\u7427\u746d\u746e\u742c\u7494\u74cc\u7492\u7492\u7483\u7465\u7466\u7476\u746b\u745f\u7490\u743e\u7483\u7471\u7493\u74cb\u742c\u7474\u7472\u7460\u7486\u74cb\u7454\u7454\u746f\u7469\u74ca\u7492\u7427\u7473\u7492\u74c9\u746b\u7454\u74c9\u746f\u7461\u7483\u743e\u74cb\u7456\u7492\u7464\u7462\u7427\u7451\u7483\u7485\u7486\u7474\u7428\u7490\u748f\u7427\u746e\u7482\u7460\u746e\u743e\u7485\u7486\u746f\u7481\u7494\u7473\u7483\u7468\u7485\u746f\u7456\u7473\u7461\u7481\u7464\u746b\u746f\u7482\u7471\u747d\u7462\u7464\u742c\u7495\u7456\u74cc\u7480\u7456\u74cb\u7482\u7469\u7467\u7463\u7480\u7462\u7485\u744f\u7475\u74c7\u7466\u7460\u7492\u7471\u7474\u7482\u746e\u744f\u746b\u746f\u74c8\u7484\u7466\u746d\u7486\u7450\u747f\u7483\u7481\u7494\u747f\u746c\u7428\u7453\u746f\u7460\u7484\u746a\u7481\u7461\u7494\u7465\u7463\u7450\u7491\u7483\u746a\u7472\u742c\u74cd\u7454\u7485\u7474\u747f\u746d\u7467\u7481\u7464\u7496\u74cc\u74cc\u7480\u74c8\u747f\u7475\u746e\u7452\u7491\u747f\u746b\u744f\u743e\u7460".toCharArray();
            for (int i2 = h[186]; i2 < h[187]; ++i2) {
                int n4 = cArray[i2];
                n4 += h[188];
                n4 += h[189];
                n4 ^= h[190];
                n4 += h[191];
                n4 -= h[192];
                n4 += h[193];
                n4 += h[194];
                n4 ^= h[195];
                n4 += h[196];
                n4 ^= h[197];
                n4 ^= h[198];
                n4 ^= h[199];
                cArray[i2] = (char)(n4 ^= h[200]);
            }
            object = g_0.A()[g_0.h[201]] = new String(cArray);
        }
        objectArray[n3] = (String)object;
        char[] cArray = ((String)g_0.a(objectArray)).toCharArray();
        long l16 = l5;
        int n5 = h[202];
        n5 -= h[203];
        l5 = l16 ^ (0xA000000000L ^ l16) & -1L << (n5 -= h[204]);
        long l17 = l12;
        int n6 = h[205];
        n6 ^= h[206];
        l12 = l17 ^ (0L ^ l17) & -1L >>> (n6 ^= h[207]);
        while (true) {
            int n7 = h[208];
            n7 -= h[209];
            if ((int)l12 >= (int)(l5 >>> (n7 -= h[210]))) break;
            int n8 = (int)l12;
            long l18 = l12;
            int n9 = h[211];
            n9 ^= h[212];
            int n10 = h[214];
            n10 ^= h[215];
            l12 = l18 ^ (l18 ^ l18 + (long)(n9 -= h[213])) & -1L >>> (n10 -= h[216]);
            long l19 = l8;
            int n11 = h[217];
            n11 += h[218];
            l8 = l19 ^ ((long)cArray[n8] ^ l19) & -1L >>> (n11 -= h[219]);
            int n12 = (int)l12;
            long l20 = l12;
            int n13 = h[220];
            n13 ^= h[221];
            int n14 = h[223];
            n14 += h[224];
            l12 = l20 ^ (l20 ^ l20 + (long)(n13 ^= h[222])) & -1L >>> (n14 ^= h[225]);
            int n15 = h[226];
            n15 ^= h[227];
            long l21 = l9;
            int n16 = h[229];
            n16 -= h[230];
            l9 = l21 ^ ((long)cArray[n12] << (n15 += h[228]) ^ l21) & -1L << (n16 ^= h[231]);
            int n17 = h[232];
            n17 += h[233];
            n17 ^= h[234];
            int n18 = h[235];
            n18 -= h[236];
            long l22 = l11;
            int n19 = h[238];
            n19 += h[239];
            l11 = l22 ^ ((long)((int)l8 << n17 | (int)(l9 >>> (n18 += h[237]))) ^ l22) & -1L >>> (n19 ^= h[240]);
            char[] cArray2 = new char[(int)l11];
            long l23 = l13;
            int n20 = h[241];
            n20 += h[242];
            l13 = l23 ^ (0L ^ l23) & -1L << (n20 -= h[243]);
            while (true) {
                int n21 = h[244];
                n21 ^= h[245];
                if ((int)(l13 >>> (n21 ^= h[246])) >= (int)l11) break;
                int n22 = h[247];
                n22 ^= h[248];
                int n23 = h[250];
                n23 ^= h[251];
                cArray2[(int)(l13 >>> (n22 -= g_0.h[249]))] = cArray[(int)l12 + (int)(l13 >>> (n23 += h[252]))];
                l13 += 0x100000000L;
            }
            int n24 = h[253];
            n24 ^= h[254];
            int n25 = (int)(l14 >>> (n24 ^= h[255]));
            l14 += 0x100000000L;
            g_0.E[n25] = new String(cArray2);
            long l24 = l12;
            int n26 = h[256];
            n26 ^= h[257];
            l12 = l24 ^ ((long)((int)l12 + (int)l11) ^ l24) & -1L >>> (n26 += h[258]);
        }
        INSTANCE = new g_0();
        int n27 = h[259];
        n27 -= h[260];
        c = INSTANCE.slider((String)E[n27 += h[261]], 10.0f, 3.0f, 18.0f, 0.5f);
        int n28 = h[262];
        n28 ^= h[263];
        C = INSTANCE.slider((String)E[n28 += h[264]], 20.0f, 10.0f, 26.0f, 0.5f);
        int n29 = h[265];
        n29 -= h[266];
        boolean bl = h[268];
        bl += h[269];
        d = INSTANCE.boolean((String)E[n29 -= h[267]], bl += h[270]).setVisible(g_0::useClientColor$lambda$0);
        int n30 = h[271];
        n30 += h[272];
        String string = (String)E[n30 ^= h[273]];
        Color color = Color.WHITE;
        int n31 = h[274];
        n31 -= h[275];
        Intrinsics.checkNotNullExpressionValue(color, (String)E[n31 -= h[276]]);
        D = INSTANCE.color(string, color).setVisible(g_0::waveColor$lambda$0);
        e = new ArrayList();
    }

    public static Object a(Object[] object) {
        Object object2;
        int n = (Integer)object[h[277]];
        String string = (String)object[h[278]];
        object = object[h[279]];
        Object[] objectArray = g;
        if (g == null) {
            objectArray = g = new Object[h[280]];
        }
        if ((object2 = objectArray[n]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[h[281]];
                f = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[h[283] ^ h[284]];
                byArray[g_0.h[285] ^ g_0.h[286]] = h[287] ^ h[288];
                byArray[g_0.h[289] ^ g_0.h[290]] = h[291] ^ h[292];
                byArray[g_0.h[293] ^ g_0.h[294]] = h[295] ^ h[296];
                byArray[g_0.h[297] ^ g_0.h[298]] = h[299] ^ h[300];
                byArray[g_0.h[301] ^ g_0.h[302]] = h[303] ^ h[304];
                byArray[g_0.h[305] ^ g_0.h[306]] = h[307] ^ h[308];
                byArray[g_0.h[309] ^ g_0.h[310]] = h[311] ^ h[312];
                byArray[g_0.h[313] ^ g_0.h[314]] = h[315] ^ h[316];
                byArray[g_0.h[317] ^ g_0.h[318]] = h[319] ^ h[320];
                byArray[g_0.h[321] ^ g_0.h[322]] = h[323] ^ h[324];
                byArray[g_0.h[325] ^ g_0.h[326]] = h[327] ^ h[328];
                byArray[g_0.h[329] ^ g_0.h[330]] = h[331] ^ h[332];
                byArray[g_0.h[333] ^ g_0.h[334]] = h[335] ^ h[336];
                byArray[g_0.h[337] ^ g_0.h[338]] = h[339] ^ h[340];
                byArray[g_0.h[341] ^ g_0.h[342]] = h[343] ^ h[344];
                byArray[g_0.h[345] ^ g_0.h[346]] = h[347] ^ h[348];
                objectArray2[g_0.h[282]] = byArray;
            }
            byte[] byArray = (byte[])object3[h[349]];
            if (F == null) {
                byte[] byArray2 = new byte[h[350] ^ h[351]];
                byArray2[g_0.h[352] ^ g_0.h[353]] = h[354] ^ h[355];
                byArray2[g_0.h[356] ^ g_0.h[357]] = h[358] ^ h[359];
                byArray2[g_0.h[360] ^ g_0.h[361]] = h[362] ^ h[363];
                byArray2[g_0.h[364] ^ g_0.h[365]] = h[366] ^ h[367];
                byArray2[g_0.h[368] ^ g_0.h[369]] = h[370] ^ h[371];
                byArray2[g_0.h[372] ^ g_0.h[373]] = h[374] ^ h[375];
                byArray2[g_0.h[376] ^ g_0.h[377]] = h[378] ^ h[379];
                byArray2[g_0.h[380] ^ g_0.h[381]] = h[382] ^ h[383];
                byArray2[g_0.h[384] ^ g_0.h[385]] = h[386] ^ h[387];
                byArray2[g_0.h[388] ^ g_0.h[389]] = h[390] ^ h[391];
                byArray2[g_0.h[392] ^ g_0.h[393]] = h[394] ^ h[395];
                byArray2[g_0.h[396] ^ g_0.h[397]] = h[398] ^ h[399];
                byArray2[0x8B56 ^ 0x8B53] = 0x8B4F ^ 0x8B53;
                byArray2[0x8751 ^ 0x8752] = 0xFFFF788D ^ 0x8752;
                byArray2[0x5403 ^ 0x541A] = 0xFFFFAB8E ^ 0x541A;
                byArray2[0xC99C ^ 0xC986] = 0xC9C5 ^ 0xC986;
                byArray2[0x514C ^ 0x515B] = 0xFFFFAEB4 ^ 0x515B;
                byArray2[0x4B41 ^ 0x4B4D] = 0x4B01 ^ 0x4B4D;
                byArray2[0x7292 ^ 0x728C] = 0x72E0 ^ 0x728C;
                byArray2[0x9226 ^ 0x923B] = 0xFFFF6DDF ^ 0x923B;
                byArray2[0x99A9 ^ 0x99B6] = 0xFFFF660E ^ 0x99B6;
                byArray2[0xD45E ^ 0xD45C] = 0xD478 ^ 0xD45C;
                byArray2[0xD9CC ^ 0xD9C6] = 0xFFFF2626 ^ 0xD9C6;
                byArray2[0xAB28 ^ 0xAB20] = 0xAB02 ^ 0xAB20;
                byArray2[0x991C ^ 0x9917] = 0xFFFF66A5 ^ 0x9917;
                byArray2[0x1BA1 ^ 0x1BAE] = 0x1BE7 ^ 0x1BAE;
                byArray2[0x8370 ^ 0x8362] = 0xFFFF7CC4 ^ 0x8362;
                byArray2[0x64DD ^ 0x64C1] = 0x64E5 ^ 0x64C1;
                byArray2[0xA9B5 ^ 0xA9B1] = 0xA99F ^ 0xA9B1;
                byArray2[0x8C5E ^ 0x8C4E] = 0x8C76 ^ 0x8C4E;
                byArray2[0x8E7E ^ 0x8E6D] = 0x8E42 ^ 0x8E6D;
                byArray2[0xF737 ^ 0xF731] = 0xFFFF08AD ^ 0xF731;
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, 0, byArray3, 0, byArray.length);
                System.arraycopy(byArray2, 0, byArray3, byArray.length, byArray2.length);
                Object object4 = g_0.A()[1];
                if (object4 == null) {
                    char[] cArray = "\ua1ba\ua184\uae51\ua1ae\uae78\ua1f4\ua1ed\uaeb7\uae5e\ua1b2\uae52\ua19b\ua18f\ua189\uae79\uae52\ua1af\ua19f".toCharArray();
                    for (int i2 = 0; i2 < 18; ++i2) {
                        int n2 = cArray[i2];
                        n2 ^= 0xECA4;
                        n2 ^= 0xAC84;
                        n2 ^= 0xA605;
                        n2 -= 26438;
                        n2 ^= 0x420A;
                        n2 -= 47595;
                        n2 += 55179;
                        n2 -= 40300;
                        n2 ^= 0x774E;
                        n2 ^= 0x1D1;
                        n2 ^= 0x2511;
                        n2 -= 40531;
                        n2 ^= 0x3F94;
                        n2 -= 37780;
                        n2 ^= 0x55D5;
                        cArray[i2] = (char)(n2 += 62453);
                    }
                    object4 = g_0.A()[1] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[16];
                byArray4[3] = 56;
                byArray4[9] = 18;
                byArray4[2] = -48;
                byArray4[0] = -50;
                byArray4[13] = -111;
                byArray4[10] = -84;
                byArray4[4] = 105;
                byArray4[6] = 12;
                byArray4[15] = -71;
                byArray4[12] = -106;
                byArray4[7] = 64;
                byArray4[1] = 50;
                byArray4[5] = 26;
                byArray4[11] = -92;
                byArray4[14] = -48;
                byArray4[8] = 5;
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, 23, 256);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = g_0.A()[2];
                if (object5 == null) {
                    char[] cArray = "\ubf05\ubf11\ubf3b".toCharArray();
                    for (int i3 = 0; i3 < 3; ++i3) {
                        int n3 = cArray[i3];
                        n3 += 21632;
                        n3 ^= 0xF901;
                        n3 += 7233;
                        n3 ^= 0xA42;
                        n3 += 10310;
                        n3 ^= 0xEC46;
                        n3 ^= 0xACE7;
                        n3 -= 43689;
                        n3 -= 65075;
                        n3 ^= 0xDF75;
                        n3 += 28373;
                        n3 -= 16152;
                        cArray[i3] = (char)(n3 += 48031);
                    }
                    object5 = g_0.A()[2] = new String(cArray);
                }
                F = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, 0, 16);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, 16, byArray6.length);
            Object object6 = g_0.A()[3];
            if (object6 == null) {
                char[] cArray = "\u6b69\u6b75\u6b87\u6b5b\u6b77\u6b68\u6b77\u6b5b\u6b7a\u6b7f\u6b77\u6b87\u6b65\u6b7a\u6989\u6996\u6996\u6991\u699c\u6993".toCharArray();
                for (int i4 = 0; i4 < 20; ++i4) {
                    int n4 = cArray[i4];
                    n4 -= 1602;
                    n4 -= 48018;
                    n4 -= 49940;
                    n4 += 21621;
                    n4 -= 11029;
                    n4 ^= 0xEB07;
                    n4 -= 13451;
                    n4 -= 27691;
                    n4 += 29900;
                    n4 -= 61213;
                    cArray[i4] = (char)(n4 -= 51614);
                }
                object6 = g_0.A()[3] = new String(cArray);
            }
            Cipher cipher = Cipher.getInstance((String)object6);
            cipher.init(2, (Key)((SecretKey)F), new IvParameterSpec(byArray7));
            byte[] byArray9 = cipher.doFinal(byArray8);
            object2 = new String(byArray9, StandardCharsets.UTF_8);
        }
        return object2;
    }

    private static Object[] A() {
        Object[] objectArray = G;
        if (G == null) {
            G = new Object[4];
            objectArray = G;
        }
        return objectArray;
    }

    public static void b() {
        h = new int[0x2DB8 ^ 0x2C28];
        g_0.h[0x3550 ^ 0x354A] = 0x3513 ^ 0x354A;
        g_0.h[0x453C ^ 0x45C0] = 0xFFFFBA58 ^ 0x45C0;
        g_0.h[0x46C ^ 0x434] = 0x434 ^ 0x434;
        g_0.h[0xD839 ^ 0xD8C4] = 0xFFFF2710 ^ 0xD8C4;
        g_0.h[0xCFAC ^ 0xCF46] = 0xCF49 ^ 0xCF46;
        g_0.h[0x3819 ^ 0x3991] = 0x2D81 ^ 0x3991;
        g_0.h[0x1CB4 ^ 0x1CDF] = 0xFFFFE30D ^ 0x1CDF;
        g_0.h[0xD890 ^ 0xD8A6] = 0xFFFF2748 ^ 0xD8A6;
        g_0.h[0xFC36 ^ 0xFD50] = 0x8459 ^ 0xFD50;
        g_0.h[0x1AB1 ^ 0x1BC1] = 0x39F6 ^ 0x1BC1;
        g_0.h[0x2F85 ^ 0x2FDE] = 0x2FA7 ^ 0x2FDE;
        g_0.h[0x94DF ^ 0x9447] = 0x9403 ^ 0x9447;
        g_0.h[0xFA7E ^ 0xFA4E] = 0xFFFF0595 ^ 0xFA4E;
        g_0.h[0xD0FD ^ 0xD095] = 0xFFFF2F36 ^ 0xD095;
        g_0.h[0x5D39 ^ 0x5C25] = 0x806B ^ 0x5C25;
        g_0.h[0xE361 ^ 0xE2EC] = 0x3D00 ^ 0xE2EC;
        g_0.h[0x648A ^ 0x646E] = 0xFFFF9B87 ^ 0x646E;
        g_0.h[0x817C ^ 0x816D] = 0xFFFF7E94 ^ 0x816D;
        g_0.h[0x1425 ^ 0x1529] = 0x1568 ^ 0x1529;
        g_0.h[0x914C ^ 0x911F] = 0x9154 ^ 0x911F;
        g_0.h[0x789E ^ 0x79CF] = 0xE261 ^ 0x79CF;
        g_0.h[0x3242 ^ 0x3320] = 0xFFFFABD5 ^ 0x3320;
        g_0.h[0x6CAE ^ 0x6CFA] = 0x6CEF ^ 0x6CFA;
        g_0.h[0x8458 ^ 0x841B] = 0xFFFF7BA4 ^ 0x841B;
        g_0.h[0xBC23 ^ 0xBC82] = 0xFFFF4338 ^ 0xBC82;
        g_0.h[0x3877 ^ 0x381A] = 0xFFFFC7BC ^ 0x381A;
        g_0.h[0x9AF8 ^ 0x9BC6] = 0x7C4E ^ 0x9BC6;
        g_0.h[0x822E ^ 0x8226] = 0xFFFF7DEF ^ 0x8226;
        g_0.h[0xC3BE ^ 0xC33E] = 0xFFFF3C8F ^ 0xC33E;
        g_0.h[0xEA04 ^ 0xEAF2] = 0xFFFF1561 ^ 0xEAF2;
        g_0.h[0x21C2 ^ 0x21CD] = 0xFFFFDE00 ^ 0x21CD;
        g_0.h[0xB3CD ^ 0xB29D] = 0x7E31 ^ 0xB29D;
        g_0.h[0xFBB7 ^ 0xFA33] = 0xCE76 ^ 0xFA33;
        g_0.h[0x1044C ^ 0x10467] = 0xFFFEFBEC ^ 0x10467;
        g_0.h[0x7F8C ^ 0x7F7B] = 0x7F40 ^ 0x7F7B;
        g_0.h[0x2019 ^ 0x2104] = 0x8B29 ^ 0x2104;
        g_0.h[0x9B15 ^ 0x9BBE] = 0xFFFF64E5 ^ 0x9BBE;
        g_0.h[0xA15C ^ 0xA1F6] = 0xFFFF5E66 ^ 0xA1F6;
        g_0.h[0x7427 ^ 0x7507] = 0xDF24 ^ 0x7507;
        g_0.h[0x8BCE ^ 0x8B36] = 0x8B54 ^ 0x8B36;
        g_0.h[0x2D1 ^ 0x397] = 0x1DF0 ^ 0x397;
        g_0.h[0x98D3 ^ 0x99E1] = 0x19FD6 ^ 0x99E1;
        g_0.h[0x32AF ^ 0x33BB] = 0x33D9 ^ 0x33BB;
        g_0.h[0xF2E9 ^ 0xF3E3] = 0xFFFF0C10 ^ 0xF3E3;
        g_0.h[0xD2F6 ^ 0xD243] = 0xD243 ^ 0xD243;
        g_0.h[0x632 ^ 0x6B7] = 0x6B3 ^ 0x6B7;
        g_0.h[0x3F2F ^ 0x3F94] = 0x3ED4 ^ 0x3F94;
        g_0.h[0x98A5 ^ 0x99B3] = 0x99B1 ^ 0x99B3;
        g_0.h[0x918D ^ 0x9142] = 0xFFFF6E96 ^ 0x9142;
        g_0.h[0xA969 ^ 0xA90F] = 0xFFFF5650 ^ 0xA90F;
        g_0.h[0xD742 ^ 0xD70A] = 0xFFFF28B4 ^ 0xD70A;
        g_0.h[0x8E89 ^ 0x8ED4] = 0xFFFF716D ^ 0x8ED4;
        g_0.h[0x2961 ^ 0x298F] = 0xFFFFD67D ^ 0x298F;
        g_0.h[0x2789 ^ 0x2768] = 0x2756 ^ 0x2768;
        g_0.h[0x1C91 ^ 0x1D9C] = 0x1DBC ^ 0x1D9C;
        g_0.h[0xD5D9 ^ 0xD4B3] = 0x3AB7 ^ 0xD4B3;
        g_0.h[0x10CE4 ^ 0x10DFD] = 0x10DFC ^ 0x10DFD;
        g_0.h[0x852B ^ 0x8404] = 0x999F ^ 0x8404;
        g_0.h[0x5574 ^ 0x5434] = 0xB3BC ^ 0x5434;
        g_0.h[0xADDB ^ 0xADFA] = 0xFFFF5239 ^ 0xADFA;
        g_0.h[0x1FA2 ^ 0x1ED3] = 0x3CE4 ^ 0x1ED3;
        g_0.h[0xED8E ^ 0xEDEF] = 0xFFFF121A ^ 0xEDEF;
        g_0.h[0xBA3B ^ 0xBBBA] = 0x638A ^ 0xBBBA;
        g_0.h[0xECCB ^ 0xEC65] = 0xFFFF13D0 ^ 0xEC65;
        g_0.h[0xA540 ^ 0xA5C3] = 0xFFFF5A2B ^ 0xA5C3;
        g_0.h[0xEB0 ^ 0xEEE] = 0xEE6 ^ 0xEEE;
        g_0.h[0x6B1F ^ 0x6B4F] = 0xFFFF94ED ^ 0x6B4F;
        g_0.h[0x59DA ^ 0x59AD] = 0x5990 ^ 0x59AD;
        g_0.h[0x88EC ^ 0x89A8] = 0xF665 ^ 0x89A8;
        g_0.h[0xD17B ^ 0xD010] = 0x3E0B ^ 0xD010;
        g_0.h[0xE070 ^ 0xE160] = 0xE153 ^ 0xE160;
        g_0.h[0x4B9E ^ 0x4BB1] = 0xFFFFB438 ^ 0x4BB1;
        g_0.h[0xA636 ^ 0xA655] = 0xA6D7 ^ 0xA655;
        g_0.h[0x7976 ^ 0x793B] = 0x7946 ^ 0x793B;
        g_0.h[0x10EC ^ 0x119A] = 0xCF18 ^ 0x119A;
        g_0.h[0xA8D0 ^ 0xA8E3] = 0xFFFF57C8 ^ 0xA8E3;
        g_0.h[0x9599 ^ 0x95A7] = 0x95EA ^ 0x95A7;
        g_0.h[0x240 ^ 0x31C] = 0x19D7 ^ 0x31C;
        g_0.h[0xB4DF ^ 0xB5E6] = 0xFDEE ^ 0xB5E6;
        g_0.h[0xC078 ^ 0xC0F2] = 0xC0AA ^ 0xC0F2;
        g_0.h[0xAAAB ^ 0xAB90] = 0xE38B ^ 0xAB90;
        g_0.h[0x87FD ^ 0x8692] = 0xD459 ^ 0x8692;
        g_0.h[0xAD80 ^ 0xACE9] = 0x42F2 ^ 0xACE9;
        g_0.h[0x79E8 ^ 0x79FB] = 0xFFFF860F ^ 0x79FB;
        g_0.h[0x3251 ^ 0x32FE] = 0x329E ^ 0x32FE;
        g_0.h[0x10204 ^ 0x1034C] = 0x11D2B ^ 0x1034C;
        g_0.h[0x8B41 ^ 0x8A49] = 0x8A51 ^ 0x8A49;
        g_0.h[0x18E5 ^ 0x18C6] = 0xFFFFE71B ^ 0x18C6;
        g_0.h[0xC395 ^ 0xC34D] = 0xFFFF3CE7 ^ 0xC34D;
        g_0.h[0x9879 ^ 0x981B] = 0xFFFF679F ^ 0x981B;
        g_0.h[0xB39C ^ 0xB398] = 0xFFFF4C5C ^ 0xB398;
        g_0.h[0xDE25 ^ 0xDE99] = 0x993D ^ 0xDE99;
        g_0.h[0xAC62 ^ 0xADED] = 0x7201 ^ 0xADED;
        g_0.h[0x469D ^ 0x47E2] = 0xD21E ^ 0x47E2;
        g_0.h[0x36DF ^ 0x36A7] = 0x36DF ^ 0x36A7;
        g_0.h[0xA503 ^ 0xA567] = 0xA57B ^ 0xA567;
        g_0.h[0x2EC ^ 0x3EE] = 0x3A7 ^ 0x3EE;
        g_0.h[0x597B ^ 0x59D3] = 0x59DA ^ 0x59D3;
        g_0.h[0xA974 ^ 0xA8FD] = 0xBCF8 ^ 0xA8FD;
        g_0.h[0x2C68 ^ 0x2C22] = 0x2C5C ^ 0x2C22;
        g_0.h[0x5A9B ^ 0x5B17] = 0x84ED ^ 0x5B17;
        g_0.h[0x7816 ^ 0x7949] = 0x8641 ^ 0x7949;
        g_0.h[0x6324 ^ 0x633A] = 0xFFFF9CC1 ^ 0x633A;
        g_0.h[0xBD1D ^ 0xBC21] = 0xF42B ^ 0xBC21;
        g_0.h[0xEFC6 ^ 0xEF0F] = 0xEF0F ^ 0xEF0F;
        g_0.h[0x9547 ^ 0x940D] = 0x5621 ^ 0x940D;
        g_0.h[0x9922 ^ 0x9827] = 0x982D ^ 0x9827;
        g_0.h[0x768B ^ 0x770C] = 0x4351 ^ 0x770C;
        g_0.h[0x34E1 ^ 0x3410] = 0x3472 ^ 0x3410;
        g_0.h[0x3F ^ 0xB7] = 0xFFFFFF79 ^ 0xB7;
        g_0.h[0xEDD4 ^ 0xEC5A] = 0xFFFFCC43 ^ 0xEC5A;
        g_0.h[0xB174 ^ 0xB052] = 0xE7A0 ^ 0xB052;
        g_0.h[0xB3 ^ 0x1B5] = 0xFFFFFE17 ^ 0x1B5;
        g_0.h[0x4BA9 ^ 0x4BA7] = 0xFFFFB474 ^ 0x4BA7;
        g_0.h[0x522D ^ 0x5264] = 0xFFFFAD88 ^ 0x5264;
        g_0.h[0xE7A3 ^ 0xE704] = 0xFFFF1886 ^ 0xE704;
        g_0.h[0xCDC5 ^ 0xCDDE] = 0xCDCD ^ 0xCDDE;
        g_0.h[0x326F ^ 0x3331] = 0xCC19 ^ 0x3331;
        g_0.h[0x20F7 ^ 0x21D3] = 0x2D60 ^ 0x21D3;
        g_0.h[0xCD10 ^ 0xCD8D] = 0xFFFF322B ^ 0xCD8D;
        g_0.h[0x3224 ^ 0x3215] = 0xFFFFCD93 ^ 0x3215;
        g_0.h[0x6115 ^ 0x612E] = 0x6153 ^ 0x612E;
        g_0.h[0x3FD1 ^ 0x3FA1] = 0x3F83 ^ 0x3FA1;
        g_0.h[0xC9C9 ^ 0xC842] = 0xDC47 ^ 0xC842;
        g_0.h[0xA53B ^ 0xA441] = 0x826B ^ 0xA441;
        g_0.h[0xF372 ^ 0xF365] = 0xF33C ^ 0xF365;
        g_0.h[0x79DF ^ 0x78DE] = 0x789C ^ 0x78DE;
        g_0.h[0xF78D ^ 0xF6D9] = 0x6D78 ^ 0xF6D9;
        g_0.h[0xBCBC ^ 0xBCC9] = 0xFFFF4355 ^ 0xBCC9;
        g_0.h[0xD01 ^ 0xD24] = 0xFFFFF2CB ^ 0xD24;
        g_0.h[0x3489 ^ 0x35B4] = 0xD23F ^ 0x35B4;
        g_0.h[0xF363 ^ 0xF22A] = 0x300C ^ 0xF22A;
        g_0.h[0xAAF ^ 0xAC6] = 0xADA ^ 0xAC6;
        g_0.h[0x1FE8 ^ 0x1FD4] = 0xFFFFE063 ^ 0x1FD4;
        g_0.h[0xDABE ^ 0xDAEB] = 0xDA9A ^ 0xDAEB;
        g_0.h[0x2A8E ^ 0x2A4A] = 0x805B ^ 0x2A4A;
        g_0.h[0x9AB1 ^ 0x9BA9] = 0x9BA8 ^ 0x9BA9;
        g_0.h[0xB3F4 ^ 0xB289] = 0x2775 ^ 0xB289;
        g_0.h[0xDC39 ^ 0xDCFA] = 0x29F4 ^ 0xDCFA;
        g_0.h[0x9096 ^ 0x908E] = 0x923E ^ 0x908E;
        g_0.h[0xD137 ^ 0xD166] = 0xD1F9 ^ 0xD166;
        g_0.h[0xF4BB ^ 0xF4C0] = 0xF40E ^ 0xF4C0;
        g_0.h[0xBE31 ^ 0xBE03] = 0xBE5E ^ 0xBE03;
        g_0.h[0x2238 ^ 0x2239] = 0xFFFFDDDF ^ 0x2239;
        g_0.h[0x51B ^ 0x43E] = 0x53CB ^ 0x43E;
        g_0.h[0xCA1A ^ 0xCA5B] = 0xCA16 ^ 0xCA5B;
        g_0.h[0xF2D5 ^ 0xF399] = 0x31B5 ^ 0xF399;
        g_0.h[0x78AB ^ 0x79E5] = 0xB549 ^ 0x79E5;
        g_0.h[0xE4D9 ^ 0xE4ED] = 0xFFFF1B33 ^ 0xE4ED;
        g_0.h[0x3796 ^ 0x36BD] = 0xFFFF7B02 ^ 0x36BD;
        g_0.h[0x10EB2 ^ 0x10EB4] = 0xFFFEF162 ^ 0x10EB4;
        g_0.h[0xD6C4 ^ 0xD6CD] = 0xFFFF2960 ^ 0xD6CD;
        g_0.h[0x2FD0 ^ 0x2ECF] = 0xFFFF7B6F ^ 0x2ECF;
        g_0.h[0xD4D0 ^ 0xD4BE] = 0xFFFF2B7D ^ 0xD4BE;
        g_0.h[0xF654 ^ 0xF67D] = 0xFFFF09AD ^ 0xF67D;
        g_0.h[0xE073 ^ 0xE049] = 0xFFFF1FEC ^ 0xE049;
        g_0.h[0xAFA2 ^ 0xAF97] = 0xFFFF5061 ^ 0xAF97;
        g_0.h[0x3CBD ^ 0x3C39] = 0xFFFFC3D7 ^ 0x3C39;
        g_0.h[0x85EA ^ 0x85AC] = 0x85DD ^ 0x85AC;
        g_0.h[0xB197 ^ 0xB1BA] = 0xFFFF4E57 ^ 0xB1BA;
        g_0.h[0xBC55 ^ 0xBC11] = 0xFFFF439D ^ 0xBC11;
        g_0.h[0x898E ^ 0x89A2] = 0xFFFF7666 ^ 0x89A2;
        g_0.h[0x60EA ^ 0x6093] = 0x60B8 ^ 0x6093;
        g_0.h[0x671D ^ 0x678B] = 0x67D9 ^ 0x678B;
        g_0.h[0x8195 ^ 0x81D2] = 0x81C7 ^ 0x81D2;
        g_0.h[0xA422 ^ 0xA4B9] = 0xFFFF5B5B ^ 0xA4B9;
        g_0.h[0x467B ^ 0x46C1] = 0x46C1 ^ 0x46C1;
        g_0.h[0x7377 ^ 0x722D] = 0x68E6 ^ 0x722D;
        g_0.h[0x55BE ^ 0x548D] = 0xFFFEAD42 ^ 0x548D;
        g_0.h[0xFFA6 ^ 0xFF8C] = 0xFFFF003C ^ 0xFF8C;
        g_0.h[0x842 ^ 0x8DC] = 0x8C6 ^ 0x8DC;
        g_0.h[0xDAF8 ^ 0xDAB4] = 0xFFFF2563 ^ 0xDAB4;
        g_0.h[0xA4EB ^ 0xA5BE] = 0x533C ^ 0xA5BE;
        g_0.h[0xC37 ^ 0xC8F] = 0xC8D ^ 0xC8F;
        g_0.h[0x1C8F ^ 0x1C5A] = 0xFFFFE3F0 ^ 0x1C5A;
        g_0.h[0x1844 ^ 0x1889] = 0x18A6 ^ 0x1889;
        g_0.h[0x680E ^ 0x68C0] = 0xFFFF971B ^ 0x68C0;
        g_0.h[0x3F01 ^ 0x3E16] = 0x3E16 ^ 0x3E16;
        g_0.h[0x6FBE ^ 0x6F2B] = 0xFFFF90CF ^ 0x6F2B;
        g_0.h[0x10568 ^ 0x1041F] = 0x1DAD1 ^ 0x1041F;
        g_0.h[0x9C07 ^ 0x9D24] = 0xFFFF6E2D ^ 0x9D24;
        g_0.h[0x8E2 ^ 0x8DD] = 0xFFFFF7AC ^ 0x8DD;
        g_0.h[0x80F3 ^ 0x801C] = 0x8038 ^ 0x801C;
        g_0.h[0x90C ^ 0x99D] = 0xFFFFF673 ^ 0x99D;
        g_0.h[0xCE10 ^ 0xCF4B] = 0xFFFF2A35 ^ 0xCF4B;
        g_0.h[0x4253 ^ 0x420F] = 0x4211 ^ 0x420F;
        g_0.h[0xE4E8 ^ 0xE474] = 0xE434 ^ 0xE474;
        g_0.h[0x8861 ^ 0x8918] = 0xAF5F ^ 0x8918;
        g_0.h[0x6ADE ^ 0x6BCB] = 0x6BCA ^ 0x6BCB;
        g_0.h[0xCF51 ^ 0xCF99] = 0x9766 ^ 0xCF99;
        g_0.h[0x1098F ^ 0x108EB] = 0x171B6 ^ 0x108EB;
        g_0.h[0x567F ^ 0x573E] = 0x28FE ^ 0x573E;
        g_0.h[0x30E6 ^ 0x3040] = 0xFFFFCFCF ^ 0x3040;
        g_0.h[0xA613 ^ 0xA799] = 0xFFFF4C2D ^ 0xA799;
        g_0.h[0xF1C9 ^ 0xF159] = 0xF1F5 ^ 0xF159;
        g_0.h[0x78CB ^ 0x79C2] = 0xFFFF86B8 ^ 0x79C2;
        g_0.h[0xED55 ^ 0xEDE2] = 0xEDE2 ^ 0xEDE2;
        g_0.h[0x10B3C ^ 0x10B8D] = 0xFFFEF47B ^ 0x10B8D;
        g_0.h[0x789C ^ 0x7842] = 0xFFFF87C0 ^ 0x7842;
        g_0.h[0xEA60 ^ 0xEB4A] = 0x5973 ^ 0xEB4A;
        g_0.h[0x78A5 ^ 0x7873] = 0xFFFF8799 ^ 0x7873;
        g_0.h[0xE429 ^ 0xE497] = 0x1F5E ^ 0xE497;
        g_0.h[0xD007 ^ 0xD025] = 0xFFFF2FBA ^ 0xD025;
        g_0.h[0x2861 ^ 0x296F] = 0xFFFFD6F0 ^ 0x296F;
        g_0.h[0x23BE ^ 0x2364] = 0xFFFFDCB6 ^ 0x2364;
        g_0.h[0x4108 ^ 0x4007] = 0xFFFFBF98 ^ 0x4007;
        g_0.h[0x5F6A ^ 0x5E43] = 0xEC73 ^ 0x5E43;
        g_0.h[0xB035 ^ 0xB0BC] = 0xFFFF4F38 ^ 0xB0BC;
        g_0.h[0x109B5 ^ 0x108AE] = 0x1D4F0 ^ 0x108AE;
        g_0.h[0x10075 ^ 0x1008C] = 0x100B5 ^ 0x1008C;
        g_0.h[0x71BE ^ 0x70ED] = 0xFFFF14DE ^ 0x70ED;
        g_0.h[0xFD81 ^ 0xFCB5] = 0x1FA82 ^ 0xFCB5;
        g_0.h[0xAC3D ^ 0xAC67] = 0xFFFF53A2 ^ 0xAC67;
        g_0.h[0xEED ^ 0xE1F] = 0xE37 ^ 0xE1F;
        g_0.h[0x8E3C ^ 0x8EE0] = 0xFFFF7141 ^ 0x8EE0;
        g_0.h[0xE8FF ^ 0xE819] = 0xE84A ^ 0xE819;
        g_0.h[0x10641 ^ 0x106BF] = 0x106FC ^ 0x106BF;
        g_0.h[0xE592 ^ 0xE5FE] = 0xE5C3 ^ 0xE5FE;
        g_0.h[0x4C45 ^ 0x4C45] = 0xFFFFB333 ^ 0x4C45;
        g_0.h[0x9EC3 ^ 0x9E57] = 0x9E23 ^ 0x9E57;
        g_0.h[0x10FA5 ^ 0x10F27] = 0x10F77 ^ 0x10F27;
        g_0.h[0x7664 ^ 0x7676] = 0xFFFB89E0 ^ 0x7676;
        g_0.h[0x528 ^ 0x412] = 0x4C18 ^ 0x412;
        g_0.h[0x6B9D ^ 0x6ADF] = 0x1512 ^ 0x6ADF;
        g_0.h[0x8F73 ^ 0x8FD7] = 0x8FEB ^ 0x8FD7;
        g_0.h[0x2A92 ^ 0x2BEE] = 0xBE09 ^ 0x2BEE;
        g_0.h[0xA8F2 ^ 0xA9D5] = 0xFFFF0181 ^ 0xA9D5;
        g_0.h[0x534E ^ 0x531C] = 0x5328 ^ 0x531C;
        g_0.h[0xA0BD ^ 0xA19F] = 0xAD2C ^ 0xA19F;
        g_0.h[0xD43C ^ 0xD499] = 0xFFFF2B68 ^ 0xD499;
        g_0.h[0x5E88 ^ 0x5E65] = 0xFFFFA18C ^ 0x5E65;
        g_0.h[0xECF9 ^ 0xEDC9] = 0xF032 ^ 0xEDC9;
        g_0.h[0x4CE0 ^ 0x4C26] = 0x4791 ^ 0x4C26;
        g_0.h[0x2390 ^ 0x22FD] = 0x7036 ^ 0x22FD;
        g_0.h[0xC08D ^ 0xC08F] = 0xC0F2 ^ 0xC08F;
        g_0.h[0x1023F ^ 0x1024B] = 0xFFFEFDE2 ^ 0x1024B;
        g_0.h[0xB495 ^ 0xB472] = 0xB43F ^ 0xB472;
        g_0.h[0xEF4 ^ 0xFCB] = 0xE838 ^ 0xFCB;
        g_0.h[0x8BCF ^ 0x8A92] = 0x8A92 ^ 0x8A92;
        g_0.h[0x90DC ^ 0x90A1] = 0xFFFF6F33 ^ 0x90A1;
        g_0.h[0x9046 ^ 0x9026] = 0xFFFF6FBF ^ 0x9026;
        g_0.h[0x1C47 ^ 0x1C63] = 0x1C04 ^ 0x1C63;
        g_0.h[0xC04E ^ 0xC109] = 0xDF39 ^ 0xC109;
        g_0.h[0x10144 ^ 0x1003C] = 0x1267A ^ 0x1003C;
        g_0.h[0x8B63 ^ 0x8B54] = 0x8B1C ^ 0x8B54;
        g_0.h[0x4F4E ^ 0x4E30] = 0xFFFF2477 ^ 0x4E30;
        g_0.h[0x1460 ^ 0x1463] = 0xFFFFEB36 ^ 0x1463;
        g_0.h[0xFBD9 ^ 0xFBDC] = 0xFFFF044D ^ 0xFBDC;
        g_0.h[0xA5C7 ^ 0xA4FF] = 0xDE8B ^ 0xA4FF;
        g_0.h[0xB875 ^ 0xB8CC] = 0xB8CC ^ 0xB8CC;
        g_0.h[0xCC1D ^ 0xCC78] = 0xFFFF33FA ^ 0xCC78;
        g_0.h[0x461 ^ 0x522] = 0x7A9E ^ 0x522;
        g_0.h[0xAC53 ^ 0xACDE] = 0xFFFF5326 ^ 0xACDE;
        g_0.h[0x33EA ^ 0x3357] = 0xD612 ^ 0x3357;
        g_0.h[0x504A ^ 0x50E8] = 0x5080 ^ 0x50E8;
        g_0.h[0xF496 ^ 0xF5C0] = 0x343 ^ 0xF5C0;
        g_0.h[0xB275 ^ 0xB230] = 0xB293 ^ 0xB230;
        g_0.h[0x450A ^ 0x4524] = 0xFFFFBA98 ^ 0x4524;
        g_0.h[0x5B74 ^ 0x5BF2] = 0xFFFFA41B ^ 0x5BF2;
        g_0.h[0xCFA3 ^ 0xCFA9] = 0xCF83 ^ 0xCFA9;
        g_0.h[0x7868 ^ 0x7908] = 0x1E3D ^ 0x7908;
        g_0.h[0xA636 ^ 0xA678] = 0xA64C ^ 0xA678;
        g_0.h[0x10290 ^ 0x10244] = 0x10211 ^ 0x10244;
        g_0.h[0xF796 ^ 0xF7CF] = 0xF78B ^ 0xF7CF;
        g_0.h[0xD3 ^ 0xC7] = 0xFFFFFF65 ^ 0xC7;
        g_0.h[0x7EFD ^ 0x7EC5] = 0x7EBF ^ 0x7EC5;
        g_0.h[0xD239 ^ 0xD2C9] = 0xD2FF ^ 0xD2C9;
        g_0.h[0x74ED ^ 0x75FE] = 0x75FF ^ 0x75FE;
        g_0.h[0x913B ^ 0x91D2] = 0xFFFF6E3F ^ 0x91D2;
        g_0.h[0xBAF1 ^ 0xBBC7] = 0xC1B3 ^ 0xBBC7;
        g_0.h[0xE637 ^ 0xE6D2] = 0xE612 ^ 0xE6D2;
        g_0.h[0x86A4 ^ 0x8679] = 0x865B ^ 0x8679;
        g_0.h[0x26B ^ 0x291] = 0xFFFFFDB3 ^ 0x291;
        g_0.h[0x255F ^ 0x2520] = 0xFFFFDA8F ^ 0x2520;
        g_0.h[0xFEB8 ^ 0xFE22] = 0xFFFF01CA ^ 0xFE22;
        g_0.h[0xE3F ^ 0xF38] = 0xF6B ^ 0xF38;
        g_0.h[0xBA8C ^ 0xBAFF] = 0xBADD ^ 0xBAFF;
        g_0.h[0x7E1A ^ 0x7EC1] = 0x7E8E ^ 0x7EC1;
        g_0.h[0x56EC ^ 0x578B] = 0x2EC2 ^ 0x578B;
        g_0.h[0x9AE2 ^ 0x9BF8] = 0x9BF8 ^ 0x9BF8;
        g_0.h[0x1604 ^ 0x16EF] = 0x1643 ^ 0x16EF;
        g_0.h[0xD82E ^ 0xD8DA] = 0xFFFF276C ^ 0xD8DA;
        g_0.h[0x72ED ^ 0x7287] = 0x72AD ^ 0x7287;
        g_0.h[0x4888 ^ 0x488F] = 0xFFFFB762 ^ 0x488F;
        g_0.h[0xB6F6 ^ 0xB7A1] = 0xFFFFBE84 ^ 0xB7A1;
        g_0.h[0xABA3 ^ 0xAB7C] = 0xAB70 ^ 0xAB7C;
        g_0.h[0xBF8B ^ 0xBF27] = 0xFFFF4098 ^ 0xBF27;
        g_0.h[0x2DBF ^ 0x2CD1] = 0xFFFF81DA ^ 0x2CD1;
        g_0.h[0xC604 ^ 0xC624] = 0xFFFF39CF ^ 0xC624;
        g_0.h[0xC027 ^ 0xC16A] = 0xDCA ^ 0xC16A;
        g_0.h[0x3221 ^ 0x3373] = 0xA8D2 ^ 0x3373;
        g_0.h[0x3A45 ^ 0x3A80] = 0x2571 ^ 0x3A80;
        g_0.h[0xA7B5 ^ 0xA73E] = 0xFFFF5887 ^ 0xA73E;
        g_0.h[0x18CB ^ 0x19CB] = 0xFFFFE65E ^ 0x19CB;
        g_0.h[0x7D8F ^ 0x7CC4] = 0xFFFF4104 ^ 0x7CC4;
        g_0.h[0xA0F8 ^ 0xA061] = 0xFFFF5FAB ^ 0xA061;
        g_0.h[0xC063 ^ 0xC126] = 0xDF44 ^ 0xC126;
        g_0.h[0xBE2C ^ 0xBF00] = 0xD39 ^ 0xBF00;
        g_0.h[0x6125 ^ 0x6010] = 0x1A6C ^ 0x6010;
        g_0.h[0xD68B ^ 0xD649] = 0x5767 ^ 0xD649;
        g_0.h[0xAA8D ^ 0xAA24] = 0xFFFF55BC ^ 0xAA24;
        g_0.h[0xAC89 ^ 0xAC45] = 0xFFFF53D4 ^ 0xAC45;
        g_0.h[0x83CA ^ 0x8318] = 0xFFFF7CAA ^ 0x8318;
        g_0.h[0x9F94 ^ 0x9F76] = 0xFFFF609B ^ 0x9F76;
        g_0.h[0x46D8 ^ 0x4608] = 0x4610 ^ 0x4608;
        g_0.h[0x98B9 ^ 0x98CB] = 0x989E ^ 0x98CB;
        g_0.h[0x8069 ^ 0x8036] = 0xFFFF7FA7 ^ 0x8036;
        g_0.h[0x9808 ^ 0x98DB] = 0xFFFF6725 ^ 0x98DB;
        g_0.h[0x9849 ^ 0x9906] = 0x55CB ^ 0x9906;
        g_0.h[0x8AFF ^ 0x8BED] = 0x8B82 ^ 0x8BED;
        g_0.h[0x47F8 ^ 0x4797] = 0xFFFFB800 ^ 0x4797;
        g_0.h[0x230C ^ 0x2324] = 0x237F ^ 0x2324;
        g_0.h[0xB342 ^ 0xB37F] = 0xFFFF4CA3 ^ 0xB37F;
        g_0.h[0x9FAF ^ 0x9ECA] = 0xE783 ^ 0x9ECA;
        g_0.h[0xC034 ^ 0xC16D] = 0xDBA2 ^ 0xC16D;
        g_0.h[0x82C3 ^ 0x82D6] = 0xFFFF7E23 ^ 0x82D6;
        g_0.h[0x10CF7 ^ 0x10D9B] = 0x15F57 ^ 0x10D9B;
        g_0.h[0xC24B ^ 0xC246] = 0xFFFF3DB0 ^ 0xC246;
        g_0.h[0x80E ^ 0x841] = 0xFFFFF7F7 ^ 0x841;
        g_0.h[0x4BCA ^ 0x4BBC] = 0x4BFB ^ 0x4BBC;
        g_0.h[0x28F3 ^ 0x285E] = 0xFFFFD7C2 ^ 0x285E;
        g_0.h[0xC3E4 ^ 0xC317] = 0xC37D ^ 0xC317;
        g_0.h[0x39DD ^ 0x39C4] = 0xFFFFC63E ^ 0x39C4;
        g_0.h[0x5677 ^ 0x567C] = 0x5657 ^ 0x567C;
        g_0.h[0x740D ^ 0x74BE] = 0xFFFF8B29 ^ 0x74BE;
        g_0.h[0xF290 ^ 0xF3B8] = 0xA44A ^ 0xF3B8;
        g_0.h[0x719B ^ 0x7098] = 0x70AA ^ 0x7098;
        g_0.h[0x91D ^ 0x97A] = 0x95E ^ 0x97A;
        g_0.h[0xFC72 ^ 0xFCB5] = 0xD7CC ^ 0xFCB5;
        g_0.h[0x4ED8 ^ 0x4E59] = 0x4E01 ^ 0x4E59;
        g_0.h[0x98C6 ^ 0x980D] = 0xFFFF6780 ^ 0x980D;
        g_0.h[0xF41B ^ 0xF40D] = 0xFFFF0BA3 ^ 0xF40D;
        g_0.h[0x5FDC ^ 0x5EED] = 0x158DA ^ 0x5EED;
        g_0.h[0x62A7 ^ 0x6235] = 0xFFFF9DB3 ^ 0x6235;
        g_0.h[0x69CF ^ 0x684F] = 0xB076 ^ 0x684F;
        g_0.h[0x5724 ^ 0x57DF] = 0xFFFFA875 ^ 0x57DF;
        g_0.h[0xF962 ^ 0xF91E] = 0xFFFF06B9 ^ 0xF91E;
        g_0.h[0x3078 ^ 0x30CC] = 0x30CF ^ 0x30CC;
        g_0.h[0x9C5A ^ 0x9CE5] = 0x7BAC ^ 0x9CE5;
        g_0.h[0xB372 ^ 0xB3B8] = 0xFFFF4C86 ^ 0xB3B8;
        g_0.h[0x49E3 ^ 0x49B5] = 0x49D3 ^ 0x49B5;
        g_0.h[0x60DA ^ 0x61F7] = 0x7C0A ^ 0x61F7;
        g_0.h[0x7099 ^ 0x71EB] = 0x53B9 ^ 0x71EB;
        g_0.h[0x2753 ^ 0x2784] = 0x27A4 ^ 0x2784;
        g_0.h[0xBF08 ^ 0xBFD1] = 0xBF4C ^ 0xBFD1;
        g_0.h[0x2D07 ^ 0x2DD6] = 0x2D90 ^ 0x2DD6;
        g_0.h[0x70B6 ^ 0x7049] = 0xFFFF8FFE ^ 0x7049;
        g_0.h[0xA0F3 ^ 0xA187] = 0x7F47 ^ 0xA187;
        g_0.h[0xBCFD ^ 0xBD86] = 0x9BC1 ^ 0xBD86;
        g_0.h[0xBE67 ^ 0xBE19] = 0xBEBD ^ 0xBE19;
        g_0.h[0xC07 ^ 0xC8B] = 0xFFFFF34A ^ 0xC8B;
        g_0.h[0x3113 ^ 0x3135] = 0xFFFFCEB7 ^ 0x3135;
        g_0.h[0xA27B ^ 0xA2E4] = 0xFFFF5D81 ^ 0xA2E4;
        g_0.h[0xA8F3 ^ 0xA81B] = 0xA829 ^ 0xA81B;
        g_0.h[0x1EFD ^ 0x1E11] = 0x1E64 ^ 0x1E11;
        g_0.h[0x687 ^ 0x7E6] = 0x60C2 ^ 0x7E6;
        g_0.h[0x77B9 ^ 0x7709] = 0xFFFF88CF ^ 0x7709;
        g_0.h[0xCA3 ^ 0xCBE] = 0xCD3 ^ 0xCBE;
        g_0.h[0xA1BC ^ 0xA03A] = 0xFFFF6BED ^ 0xA03A;
        g_0.h[0x7280 ^ 0x73AE] = 0x6E55 ^ 0x73AE;
        g_0.h[0xFD19 ^ 0xFC12] = 0xFFFF0390 ^ 0xFC12;
        g_0.h[0x9CFD ^ 0x9DF9] = 0x9DC0 ^ 0x9DF9;
        g_0.h[0x6E43 ^ 0x6F1B] = 0x9998 ^ 0x6F1B;
        g_0.h[0x6831 ^ 0x6920] = 0xFFFF96FA ^ 0x6920;
        g_0.h[0x3A5E ^ 0x3B40] = 0x9163 ^ 0x3B40;
        g_0.h[0x8371 ^ 0x833A] = 0x8269 ^ 0x833A;
        g_0.h[0x9C64 ^ 0x9DE1] = 0xA9BC ^ 0x9DE1;
        g_0.h[0xDD7C ^ 0xDD60] = 0xDD39 ^ 0xDD60;
        g_0.h[0xBEB2 ^ 0xBFDA] = 0x51CC ^ 0xBFDA;
        g_0.h[0x44BD ^ 0x443A] = 0x44F4 ^ 0x443A;
        g_0.h[0x1052 ^ 0x1165] = 0xFFFF94B4 ^ 0x1165;
        g_0.h[0x7DF7 ^ 0x7DCE] = 0x7D8C ^ 0x7DCE;
        g_0.h[0x41F8 ^ 0x4158] = 0xFFFFBEF3 ^ 0x4158;
        g_0.h[0x6FD9 ^ 0x6EAA] = 0x4C9D ^ 0x6EAA;
        g_0.h[0x529D ^ 0x5291] = 0xFFFFAD42 ^ 0x5291;
        g_0.h[0x38D5 ^ 0x39A0] = 0xE76E ^ 0x39A0;
        g_0.h[0xD3CC ^ 0xD35F] = 0xD306 ^ 0xD35F;
        g_0.h[0x4639 ^ 0x4643] = 0x466E ^ 0x4643;
        g_0.h[0x5E9F ^ 0x5F1D] = 0xFFFF78C7 ^ 0x5F1D;
        g_0.h[0x3579 ^ 0x35B8] = 0xE2D3 ^ 0x35B8;
        g_0.h[0xDF65 ^ 0xDF32] = 0xFFFF20EE ^ 0xDF32;
        g_0.h[0xF3A1 ^ 0xF3D0] = 0xFFFF0C49 ^ 0xF3D0;
        g_0.h[0xC83 ^ 0xC14] = 0xFFFFF3FA ^ 0xC14;
        g_0.h[0xDCB5 ^ 0xDC75] = 0x8D9F ^ 0xDC75;
        g_0.h[0x731 ^ 0x610] = 0xAA8 ^ 0x610;
        g_0.h[0x1C39 ^ 0x1C8F] = 0x1C8E ^ 0x1C8F;
        g_0.h[0xC2FD ^ 0xC21D] = 0xC20F ^ 0xC21D;
        g_0.h[0x4AE9 ^ 0x4A0A] = 0xFFFFB5D0 ^ 0x4A0A;
        g_0.h[0x33F1 ^ 0x3304] = 0x3301 ^ 0x3304;
        g_0.h[0x29D6 ^ 0x2855] = 0xF065 ^ 0x2855;
        g_0.h[0x2A82 ^ 0x2A9D] = 0x2A8D ^ 0x2A9D;
        g_0.h[0x2681 ^ 0x2633] = 0x2672 ^ 0x2633;
        g_0.h[0x104C4 ^ 0x104E3] = 0xFFFEFB96 ^ 0x104E3;
        g_0.h[0x8DC8 ^ 0x8D47] = 0x8D41 ^ 0x8D47;
        g_0.h[0x3017 ^ 0x3007] = 0xFFFFCFBC ^ 0x3007;
        g_0.h[0xEE46 ^ 0xEE04] = 0xFFFF1177 ^ 0xEE04;
        g_0.h[0xE841 ^ 0xE922] = 0x8E06 ^ 0xE922;
        g_0.h[0x8253 ^ 0x82F0] = 0x82DB ^ 0x82F0;
        g_0.h[0x17B2 ^ 0x173C] = 0xFFFFE8E2 ^ 0x173C;
        g_0.h[0x2DFF ^ 0x2DBF] = 0xFFFFD27C ^ 0x2DBF;
    }
}

