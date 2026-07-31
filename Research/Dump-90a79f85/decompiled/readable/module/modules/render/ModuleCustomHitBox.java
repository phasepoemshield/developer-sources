/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_1308
 *  net.minecraft.class_1309
 *  net.minecraft.class_1429
 *  net.minecraft.class_1657
 *  net.minecraft.class_238
 *  net.minecraft.class_243
 *  net.minecraft.class_4588
 *  net.minecraft.class_4597
 *  net.minecraft.class_4597$class_4598
 *  net.minecraft.class_638
 *  net.minecraft.class_746
 *  net.minecraft.class_9799
 */
package kotakbaz.rain.module.modules.render;

import java.awt.Color;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import kotakbaz.rain.client.extensions.b_0;
import kotakbaz.rain.client.util.render.world.a;
import kotakbaz.rain.event.events.B;
import kotakbaz.rain.module.a_0;
import kotakbaz.rain.module.modules.render.C;
import kotakbaz.rain.module.modules.render.P;
import kotakbaz.rain.module.setting.settings.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jdk7.AutoCloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import net.minecraft.class_1297;
import net.minecraft.class_1308;
import net.minecraft.class_1309;
import net.minecraft.class_1429;
import net.minecraft.class_1657;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_4588;
import net.minecraft.class_4597;
import net.minecraft.class_638;
import net.minecraft.class_746;
import net.minecraft.class_9799;
import net.minecraft.client.render.RainRenderLayers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sweetie.evaware.flora.api.Commando;

/*
 * Renamed from kotakbaz.rain.module.modules.render.q
 */
@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001=B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0006\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007\u00a2\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0014\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u001b\u001a\u00020\u00042\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002\u00a2\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020\u00168\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\u00168\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b%\u0010$R\u0014\u0010&\u001a\u00020\u00168\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b&\u0010$R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010-\u001a\u00020'8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b-\u0010)R\u0014\u0010.\u001a\u00020'8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b.\u0010)R\u0014\u0010/\u001a\u00020'8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b/\u0010)R\u0014\u00100\u001a\u00020'8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b0\u0010)R\u0014\u00101\u001a\u00020'8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b1\u0010)R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b3\u00104R\u0014\u00105\u001a\u0002028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b5\u00104R0\u00109\u001a\u001e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020706j\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u000207`88\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010;\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b;\u0010<\u00a8\u0006>"}, d2={"Lkotakbaz/rain/module/modules/render/ModuleCustomHitBox;", "Lkotakbaz/rain/module/Module;", "<init>", "()V", "", "onEnable", "onDisable", "Lkotakbaz/rain/event/events/Render3DEvent;", "event", "onRender3D", "(Lkotakbaz/rain/event/events/Render3DEvent;)V", "Lnet/minecraft/class_1309;", "entity", "", "shouldRender", "(Lnet/minecraft/class_1309;)Z", "Ljava/awt/Color;", "selectedColor", "()Ljava/awt/Color;", "baseColor", "resolveRenderColor", "(Lnet/minecraft/class_1309;Ljava/awt/Color;)Ljava/awt/Color;", "", "updateDamageAnimation", "(Lnet/minecraft/class_1309;)F", "Lnet/minecraft/class_638;", "world", "clearState", "(Lnet/minecraft/class_638;)V", "", "BUFFER_SIZE", "I", "", "BOX_EXPAND", "D", "DAMAGE_FADE_IN_SPEED", "F", "DAMAGE_FADE_OUT_SPEED", "DAMAGE_TINT_STRENGTH", "Lkotakbaz/rain/module/setting/settings/BooleanSetting;", "useClientColor", "Lkotakbaz/rain/module/setting/settings/BooleanSetting;", "Lkotakbaz/rain/module/setting/settings/ColorSetting;", "boxColor", "Lkotakbaz/rain/module/setting/settings/ColorSetting;", "onlyPlayers", "damageEffect", "filled", "outlined", "striped", "Lkotakbaz/rain/module/setting/settings/SliderSetting;", "lineWidth", "Lkotakbaz/rain/module/setting/settings/SliderSetting;", "stripedGap", "Ljava/util/HashMap;", "Lkotakbaz/rain/module/modules/render/ModuleCustomHitBox$DamageAnimation;", "Lkotlin/collections/HashMap;", "damageAnimations", "Ljava/util/HashMap;", "trackedWorld", "Lnet/minecraft/class_638;", "DamageAnimation", "rain-visuals"})
@SourceDebugExtension(value={"SMAP\nModuleCustomHitBox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModuleCustomHitBox.kt\nkotakbaz/rain/module/modules/render/ModuleCustomHitBox\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,206:1\n383#2,7:207\n1915#3,2:214\n*S KotlinDebug\n*F\n+ 1 ModuleCustomHitBox.kt\nkotakbaz/rain/module/modules/render/ModuleCustomHitBox\n*L\n174#1:207,7\n88#1:214,2\n*E\n"})
public final class q_0
extends a_0 {
    @NotNull
    public static final q_0 INSTANCE;
    private static final int a = 0x100000;
    private static final double A = 0.03;
    private static final float b = 14.0f;
    private static final float B = 11.0f;
    private static final float c = 0.78f;
    @NotNull
    private static final c C;
    @NotNull
    private static final kotakbaz.rain.module.setting.settings.B d;
    @NotNull
    private static final c D;
    @NotNull
    private static final c e;
    @NotNull
    private static final c E;
    @NotNull
    private static final c f;
    @NotNull
    private static final c F;
    @NotNull
    private static final kotakbaz.rain.module.setting.settings.a_0 g;
    @NotNull
    private static final kotakbaz.rain.module.setting.settings.a_0 G;
    @NotNull
    private static final HashMap<Integer, C> h;
    @Nullable
    private static class_638 H;
    private static Object[] i;
    private static Object j;
    private static Object[] J;
    private static Object[] I;
    private static Object[] k;
    public static int[] K;

    private q_0() {
        int n = K[0];
        n ^= K[1];
        int n2 = K[3];
        n2 ^= K[4];
        int n3 = K[6];
        n3 += K[7];
        super((String)i[n ^= K[2]], kotakbaz.rain.client.extensions.a_0.getRENDER(), (String)i[n2 -= K[5]] + (String)i[n3 += K[8]]);
    }

    @Override
    public void onEnable() {
        int n = K[9];
        n -= K[10];
        q_0.clearState$default(this, null, n ^= K[11], null);
    }

    @Override
    public void onDisable() {
        this.clearState(null);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Commando
    public final void onRender3D(@NotNull B b2) {
        long l = 5743739624986786468L;
        int n = K[12];
        n -= K[13];
        Intrinsics.checkNotNullParameter(b2, (String)i[n += K[14]]);
        if (!this.isEnabled()) {
            return;
        }
        if (!(((Boolean)E.getValue()).booleanValue() || ((Boolean)f.getValue()).booleanValue() || ((Boolean)F.getValue()).booleanValue())) {
            return;
        }
        class_638 class_6382 = b_0.getMc().field_1687;
        if (class_6382 == null) {
            return;
        }
        class_638 class_6383 = class_6382;
        if (H != class_6383) {
            this.clearState(class_6383);
        }
        class_243 class_2432 = b_0.getMc().field_1773.method_19418().method_19326();
        int n2 = K[15];
        n2 -= K[16];
        class_9799 class_97992 = new class_9799(n2 += K[17]);
        Color color = this.selectedColor();
        HashSet<Integer> hashSet = new HashSet<Integer>();
        AutoCloseable autoCloseable = (AutoCloseable)class_97992;
        Throwable throwable = null;
        try {
            Object object = (class_9799)autoCloseable;
            long l2 = l;
            int n3 = K[18];
            n3 ^= K[19];
            l = l2 ^ (0L ^ l2) & -1L << (n3 ^= K[20]);
            class_4597.class_4598 class_45982 = class_4597.method_22991((class_9799)object);
            boolean bl = K[21];
            bl -= K[22];
            class_4588 class_45882 = class_45982.getBuffer(RainRenderLayers.getHitBoxQuad(bl += K[23]));
            if (((Boolean)f.getValue()).booleanValue()) {
                int n4 = K[24];
                n4 ^= K[25];
                AutoCloseable autoCloseable2 = (AutoCloseable)new class_9799(n4 -= K[26]);
                Throwable throwable2 = null;
                try {
                    Object object2 = (class_9799)autoCloseable2;
                    long l3 = l;
                    int n5 = K[27];
                    n5 += K[28];
                    l = l3 ^ (0L ^ l3) & -1L >>> (n5 -= K[29]);
                    class_4597.class_4598 class_45983 = class_4597.method_22991((class_9799)object2);
                    class_4588 class_45883 = class_45983.getBuffer(RainRenderLayers.getHitBoxLine(((Number)g.getValue()).floatValue()));
                    Intrinsics.checkNotNull(class_45882);
                    q_0.onRender3D$renderBoxes(class_6383, hashSet, b2, class_2432, color, class_45882, class_45883);
                    class_45982.method_22993();
                    class_45983.method_22993();
                    object2 = Unit.INSTANCE;
                }
                catch (Throwable throwable3) {
                    throwable2 = throwable3;
                    throw throwable3;
                }
                finally {
                    AutoCloseableKt.closeFinally(autoCloseable2, throwable2);
                }
            } else {
                Intrinsics.checkNotNull(class_45882);
                q_0.onRender3D$renderBoxes(class_6383, hashSet, b2, class_2432, color, class_45882, null);
                class_45982.method_22993();
            }
            object = Unit.INSTANCE;
        }
        catch (Throwable throwable4) {
            throwable = throwable4;
            throw throwable4;
        }
        finally {
            AutoCloseableKt.closeFinally(autoCloseable, throwable);
        }
        h.keySet().retainAll((Collection)hashSet);
    }

    private final boolean shouldRender(class_1309 class_13092) {
        int n;
        if (!class_13092.method_5805() || class_13092.method_31481() || class_13092.method_5767()) {
            boolean bl = K[30];
            bl += K[31];
            return bl -= K[32];
        }
        class_746 class_7462 = b_0.getMc().field_1724;
        if (Intrinsics.areEqual(class_13092, class_7462)) {
            boolean bl;
            if (!b_0.getMc().field_1690.method_31044().method_31034()) {
                boolean bl2 = K[33];
                bl2 -= K[34];
                bl = bl2 += K[35];
            } else {
                boolean bl3 = K[36];
                bl3 += K[37];
                bl = bl3 ^= K[38];
            }
            return bl;
        }
        if (((Boolean)D.getValue()).booleanValue()) {
            int n2;
            if (class_13092 instanceof class_1657 && !((class_1657)class_13092).method_7325()) {
                int n3 = K[39];
                n3 += K[40];
                n2 = n3 += K[41];
            } else {
                int n4 = K[42];
                n4 ^= K[43];
                n2 = n4 ^= K[44];
            }
            return n2 != 0;
        }
        class_1309 class_13093 = class_13092;
        if (class_13093 instanceof class_1657) {
            if (!((class_1657)class_13092).method_7325()) {
                int n5 = K[45];
                n5 -= K[46];
                n = n5 -= K[47];
            } else {
                int n6 = K[48];
                n6 += K[49];
                n = n6 += K[50];
            }
        } else if (class_13093 instanceof class_1429) {
            int n7 = K[51];
            n7 -= K[52];
            n = n7 += K[53];
        } else if (class_13093 instanceof class_1308) {
            int n8 = K[54];
            n8 ^= K[55];
            n = n8 ^= K[56];
        } else {
            int n9 = K[57];
            n9 ^= K[58];
            n = n9 ^= K[59];
        }
        return n != 0;
    }

    private final Color selectedColor() {
        return (Boolean)C.getValue() != false && P.INSTANCE.isEnabled() ? P.INSTANCE.getClientColor() : (Color)d.getValue();
    }

    private final Color resolveRenderColor(class_1309 class_13092, Color color) {
        if (!((Boolean)e.getValue()).booleanValue()) {
            return color;
        }
        float f2 = this.updateDamageAnimation(class_13092) * 0.78f;
        if (f2 <= 0.0f) {
            return color;
        }
        int n = K[60];
        n -= K[61];
        int n2 = K[63];
        n2 -= K[64];
        int n3 = K[66];
        n3 -= K[67];
        Color color2 = new Color(n += K[62], n2 ^= K[65], n3 += K[68], color.getAlpha());
        return kotakbaz.rain.client.util.color.a_0.INSTANCE.interpolateColor(color, color2, f2);
    }

    private final float updateDamageAnimation(class_1309 class_13092) {
        Object object;
        long l = -1358995307811426105L;
        long l2 = System.currentTimeMillis();
        Map map = h;
        Integer n = class_13092.method_5628();
        long l3 = l;
        int n2 = K[69];
        n2 += K[70];
        l = l3 ^ (0L ^ l3) & -1L << (n2 += K[71]);
        Object v2 = map.get(n);
        if (v2 == null) {
            long l4 = l;
            int n3 = K[72];
            n3 += K[73];
            l = l4 ^ (0L ^ l4) & -1L >>> (n3 += K[74]);
            int n4 = K[75];
            n4 -= K[76];
            C c2 = new C(0.0f, l2, n4 += K[77], null);
            map.put(n, c2);
            object = c2;
        } else {
            object = v2;
        }
        C c3 = (C)object;
        float f2 = (float)RangesKt.coerceAtLeast(l2 - c3.getLastUpdateAt(), 0L) / 1000.0f;
        c3.setLastUpdateAt(l2);
        float f3 = class_13092.field_6235 > 0 || class_13092.field_6213 > 0 ? 1.0f : 0.0f;
        float f4 = f3 > c3.getProgress() ? 14.0f : 11.0f;
        float f5 = RangesKt.coerceIn(f2 * f4, 0.0f, 1.0f);
        c3.setProgress(c3.getProgress() + (f3 - c3.getProgress()) * f5);
        float f6 = RangesKt.coerceIn(c3.getProgress(), 0.0f, 1.0f);
        if (f6 <= 0.001f && f3 <= 0.0f) {
            h.remove(class_13092.method_5628());
            return 0.0f;
        }
        return f6;
    }

    private final void clearState(class_638 class_6382) {
        h.clear();
        H = class_6382;
    }

    static /* synthetic */ void clearState$default(q_0 q_02, class_638 class_6382, int n, Object object) {
        int n2 = K[78];
        n2 ^= K[79];
        if ((n & (n2 ^= K[80])) != 0) {
            class_6382 = b_0.getMc().field_1687;
        }
        q_02.clearState(class_6382);
    }

    private static final boolean useClientColor$lambda$0() {
        return P.INSTANCE.isEnabled();
    }

    private static final boolean boxColor$lambda$0() {
        int n;
        if (!((Boolean)C.getValue()).booleanValue() || !P.INSTANCE.isEnabled()) {
            int n2 = K[81];
            n2 ^= K[82];
            n = n2 += K[83];
        } else {
            int n3 = K[84];
            n3 -= K[85];
            n = n3 -= K[86];
        }
        return n != 0;
    }

    private static final boolean lineWidth$lambda$0() {
        int n;
        if (((Boolean)f.getValue()).booleanValue() || ((Boolean)F.getValue()).booleanValue()) {
            int n2 = K[87];
            n2 ^= K[88];
            n = n2 -= K[89];
        } else {
            int n3 = K[90];
            n3 += K[91];
            n = n3 += K[92];
        }
        return n != 0;
    }

    private static final boolean stripedGap$lambda$0() {
        return (Boolean)F.getValue();
    }

    private static final Unit _init_$lambda$0(boolean bl) {
        if (bl && ((Boolean)F.getValue()).booleanValue()) {
            boolean bl2 = K[93];
            bl2 ^= K[94];
            F.set(bl2 += K[95]);
        }
        return Unit.INSTANCE;
    }

    private static final Unit _init_$lambda$1(boolean bl) {
        if (bl && ((Boolean)f.getValue()).booleanValue()) {
            boolean bl2 = K[96];
            bl2 -= K[97];
            f.set(bl2 += K[98]);
        }
        return Unit.INSTANCE;
    }

    private static final void onRender3D$renderBoxes(class_638 class_6382, HashSet<Integer> hashSet, B b2, class_243 class_2432, Color color, class_4588 class_45882, class_4588 class_45883) {
        long l = -4066853461709819817L;
        Iterable iterable = class_6382.method_18112();
        int n = K[99];
        n -= K[100];
        int n2 = K[102];
        n2 ^= K[103];
        Intrinsics.checkNotNullExpressionValue(iterable, (String)i[n ^= K[101]] + (String)i[n2 -= K[104]]);
        Iterable iterable2 = iterable;
        long l2 = l;
        int n3 = K[105];
        n3 += K[106];
        l = l2 ^ (0L ^ l2) & -1L << (n3 += K[107]);
        for (Object t2 : iterable2) {
            class_1309 class_13092;
            class_1297 class_12972 = (class_1297)t2;
            long l3 = l;
            int n4 = K[108];
            n4 ^= K[109];
            l = l3 ^ (0L ^ l3) & -1L >>> (n4 -= K[110]);
            class_1309 class_13093 = class_12972 instanceof class_1309 ? (class_1309)class_12972 : null;
            if (class_13093 == null || !INSTANCE.shouldRender(class_13092 = class_13093)) continue;
            ((Collection)hashSet).add(class_13092.method_5628());
            class_243 class_2433 = class_13092.method_30950(b2.getPartialTicks());
            class_238 class_2382 = class_13092.method_5829().method_989(class_2433.field_1352 - class_13092.method_23317(), class_2433.field_1351 - class_13092.method_23318(), class_2433.field_1350 - class_13092.method_23321()).method_989(-class_2432.field_1352, -class_2432.field_1351, -class_2432.field_1350);
            Intrinsics.checkNotNull(class_2382);
            kotakbaz.rain.client.util.render.world.a.INSTANCE.draw(b2, class_45882, class_45883, class_2382, INSTANCE.resolveRenderColor(class_13092, color), (Boolean)E.getValue(), (Boolean)f.getValue(), (Boolean)F.getValue(), ((Number)g.getValue()).floatValue(), ((Number)G.getValue()).floatValue());
        }
    }

    static {
        q_0.b();
        long l = -527723109724319572L;
        long l2 = 7560070421340176886L;
        long l3 = 7768245030294279295L;
        long l4 = 4991737183052223094L;
        long l5 = -2228472916312071104L;
        long l6 = 9190514122302180007L;
        long l7 = 7210148632005549916L;
        long l8 = 2098878817433818025L;
        long l9 = 3131540141220847171L;
        long l10 = -6404540491536284514L;
        long l11 = 947995359714015542L;
        long l12 = 1533780042961270688L;
        long l13 = -7306475753338083227L;
        long l14 = -2797843972065494539L;
        int n = K[111];
        n += K[112];
        i = new Object[n -= K[113]];
        long l15 = l14;
        int n2 = K[114];
        n2 -= K[115];
        l14 = l15 ^ (0L ^ l15) & -1L << (n2 -= K[116]);
        Object[] objectArray = new Object[K[117]];
        objectArray[q_0.K[118]] = I;
        objectArray[q_0.K[119]] = K[120];
        int n3 = K[121];
        Object object = q_0.A()[K[122]];
        if (object == null) {
            char[] cArray = "\u6936\u6936\u690c\u6919\u697d\u6924\u6909\u692d\u6909\u691f\u6932\u6975\u692e\u696d\u692d\u6903\u6904\u6901\u691e\u691a\u6909\u691a\u6901\u6918\u6903\u6901\u697d\u6969\u6915\u697a\u697c\u692f\u692f\u696a\u6975\u6971\u6932\u6919\u690e\u697d\u6917\u6932\u6979\u6903\u6914\u690a\u6963\u6930\u6940\u697d\u691f\u6964\u692a\u6961\u697f\u697f\u6910\u690c\u6972\u690b\u6973\u696a\u6901\u690e\u6930\u690a\u690c\u696f\u6913\u692b\u6911\u6916\u696e\u697a\u696d\u692e\u690b\u692a\u6975\u6960\u6970\u6910\u697d\u691a\u697f\u696a\u691a\u6901\u6919\u6964\u6963\u6914\u696a\u692f\u697f\u6916\u6979\u692f\u692a\u6916\u6960\u692e\u692b\u697f\u6960\u6915\u6911\u690f\u6924\u6969\u696a\u690e\u692b\u6924\u692a\u6919\u691c\u697e\u6911\u6901\u690e\u6916\u6936\u6929\u690d\u6910\u6904\u6961\u6919\u690c\u690c\u6929\u6903\u6915\u6912\u6979\u6903\u6903\u690b\u6924\u6972\u691d\u6913\u692c\u692b\u697a\u6903\u692a\u6940\u6940\u6923\u697e\u6912\u6977\u6912\u6972\u6972\u696f\u6919\u6923\u6909\u6916\u692f\u696d\u6924\u6904\u692b\u6973\u6911\u697d\u6970\u696d\u6970\u6971\u6973\u6914\u6918\u6979\u691d\u696b\u6929\u692a\u691d\u6975\u6975\u6976\u691e\u697e\u6910\u6904\u6901\u6911\u6940\u697c\u6917\u691d\u697f\u6976\u696c\u6972\u6919\u697d\u6917\u6930\u692c\u696c\u692e\u6903\u6929\u6924\u6917\u697a\u6904\u696f\u6973\u696a\u692a\u691c\u692c\u6913\u6917\u6917\u6912\u696d\u690e\u6910\u6970\u690e\u6929\u696a\u6916\u6977\u6932\u6909\u6904\u6978\u6910\u6915\u6909\u6974\u6911\u690f\u6971\u6974\u6976\u692f\u697a\u690b\u690d\u6930\u6916\u6924\u690d\u6911\u696c\u696f\u692d\u6977\u690d\u6914\u6971\u6918\u690c\u6914\u6932\u692c\u697e\u690f\u6973\u6919\u690c\u6904\u6911\u696b\u6960\u6976\u6901\u692f\u6915\u692d\u6917\u692a\u697f\u692d\u692b\u690a\u6901\u692d\u6910\u696a\u696e\u6971\u691f\u6932\u6904\u6974\u6901\u696b\u691e\u6915\u6930\u6903\u6929\u690a\u691f\u690c\u6919\u6975\u692a\u697c\u692d\u697d\u697d\u6976\u6978\u696e\u692c\u692b\u6932\u691d\u697f\u6910\u6940\u6972\u6932\u6960\u696c\u6910\u6976\u697a\u697e\u6918\u690d\u697a\u6910\u6940\u6960\u6903\u696b\u6973\u6904\u692e\u696f\u690d\u691f\u6929\u690a\u6924\u690c\u6971\u692f\u6916\u697c\u6961\u696e\u6909\u697e\u6915\u690d\u696e\u692d\u6960\u690b\u690c\u6964\u690f\u690b\u692d\u697a\u6915\u6961\u690b\u692a\u6913\u6960\u6904\u690e\u6932\u6901\u690a\u691f\u691a\u6970\u6923\u6970\u6917\u692b\u6970\u696c\u6903\u6971\u6964\u6971\u6910\u691a\u6910\u6918\u690f\u6901\u690c\u697a\u692e\u690b\u6932\u6903\u691c\u6928\u6928".toCharArray();
            for (int i2 = K[123]; i2 < K[124]; ++i2) {
                int n4 = cArray[i2];
                n4 ^= K[125];
                n4 += K[126];
                n4 -= K[127];
                n4 += K[128];
                n4 -= K[129];
                n4 -= K[130];
                n4 -= K[131];
                n4 += K[132];
                n4 += K[133];
                n4 += K[134];
                n4 ^= K[135];
                n4 ^= K[136];
                cArray[i2] = (char)(n4 ^= K[137]);
            }
            object = q_0.A()[q_0.K[138]] = new String(cArray);
        }
        objectArray[n3] = (String)object;
        char[] cArray = ((String)q_0.a(objectArray)).toCharArray();
        long l16 = l5;
        int n5 = K[139];
        n5 ^= K[140];
        l5 = l16 ^ (0xB000000000L ^ l16) & -1L << (n5 ^= K[141]);
        long l17 = l12;
        int n6 = K[142];
        n6 ^= K[143];
        l12 = l17 ^ (0L ^ l17) & -1L >>> (n6 -= K[144]);
        while (true) {
            int n7 = K[145];
            n7 ^= K[146];
            if ((int)l12 >= (int)(l5 >>> (n7 -= K[147]))) break;
            int n8 = (int)l12;
            long l18 = l12;
            int n9 = K[148];
            n9 ^= K[149];
            int n10 = K[151];
            n10 += K[152];
            l12 = l18 ^ (l18 ^ l18 + (long)(n9 -= K[150])) & -1L >>> (n10 += K[153]);
            long l19 = l8;
            int n11 = K[154];
            n11 -= K[155];
            l8 = l19 ^ ((long)cArray[n8] ^ l19) & -1L >>> (n11 ^= K[156]);
            int n12 = (int)l12;
            long l20 = l12;
            int n13 = K[157];
            n13 -= K[158];
            int n14 = K[160];
            n14 -= K[161];
            l12 = l20 ^ (l20 ^ l20 + (long)(n13 -= K[159])) & -1L >>> (n14 += K[162]);
            int n15 = K[163];
            n15 += K[164];
            long l21 = l9;
            int n16 = K[166];
            n16 -= K[167];
            l9 = l21 ^ ((long)cArray[n12] << (n15 += K[165]) ^ l21) & -1L << (n16 += K[168]);
            int n17 = K[169];
            n17 -= K[170];
            n17 -= K[171];
            int n18 = K[172];
            n18 -= K[173];
            long l22 = l11;
            int n19 = K[175];
            n19 += K[176];
            l11 = l22 ^ ((long)((int)l8 << n17 | (int)(l9 >>> (n18 ^= K[174]))) ^ l22) & -1L >>> (n19 += K[177]);
            char[] cArray2 = new char[(int)l11];
            long l23 = l13;
            int n20 = K[178];
            n20 -= K[179];
            l13 = l23 ^ (0L ^ l23) & -1L << (n20 ^= K[180]);
            while (true) {
                int n21 = K[181];
                n21 ^= K[182];
                if ((int)(l13 >>> (n21 -= K[183])) >= (int)l11) break;
                int n22 = K[184];
                n22 += K[185];
                int n23 = K[187];
                n23 -= K[188];
                cArray2[(int)(l13 >>> (n22 += q_0.K[186]))] = cArray[(int)l12 + (int)(l13 >>> (n23 ^= K[189]))];
                l13 += 0x100000000L;
            }
            int n24 = K[190];
            n24 += K[191];
            int n25 = (int)(l14 >>> (n24 += K[192]));
            l14 += 0x100000000L;
            q_0.i[n25] = new String(cArray2);
            long l24 = l12;
            int n26 = K[193];
            n26 ^= K[194];
            l12 = l24 ^ ((long)((int)l12 + (int)l11) ^ l24) & -1L >>> (n26 += K[195]);
        }
        INSTANCE = new q_0();
        int n27 = K[196];
        n27 ^= K[197];
        boolean bl = K[199];
        bl -= K[200];
        C = INSTANCE.boolean((String)i[n27 -= K[198]], bl ^= K[201]).setVisible(q_0::useClientColor$lambda$0);
        int n28 = K[202];
        n28 += K[203];
        String string = (String)i[n28 ^= K[204]];
        Color color = Color.WHITE;
        int n29 = K[205];
        n29 -= K[206];
        Intrinsics.checkNotNullExpressionValue(color, (String)i[n29 -= K[207]]);
        d = INSTANCE.color(string, color).setVisible(q_0::boxColor$lambda$0);
        int n30 = K[208];
        n30 ^= K[209];
        boolean bl2 = K[211];
        bl2 -= K[212];
        D = INSTANCE.boolean((String)i[n30 += K[210]], bl2 -= K[213]);
        int n31 = K[214];
        n31 -= K[215];
        boolean bl3 = K[217];
        bl3 += K[218];
        e = INSTANCE.boolean((String)i[n31 += K[216]], bl3 += K[219]);
        int n32 = K[220];
        n32 += K[221];
        boolean bl4 = K[223];
        bl4 += K[224];
        E = INSTANCE.boolean((String)i[n32 -= K[222]], bl4 -= K[225]);
        int n33 = K[226];
        n33 -= K[227];
        boolean bl5 = K[229];
        bl5 += K[230];
        f = INSTANCE.boolean((String)i[n33 ^= K[228]], bl5 += K[231]);
        int n34 = K[232];
        n34 ^= K[233];
        boolean bl6 = K[235];
        bl6 += K[236];
        F = INSTANCE.boolean((String)i[n34 -= K[234]], bl6 += K[237]);
        int n35 = K[238];
        n35 -= K[239];
        g = INSTANCE.slider((String)i[n35 ^= K[240]], 1.0f, 1.0f, 3.5f, 0.1f).setVisible(q_0::lineWidth$lambda$0);
        int n36 = K[241];
        n36 ^= K[242];
        G = INSTANCE.slider((String)i[n36 += K[243]], 0.2f, 0.1f, 0.35f, 0.01f).setVisible(q_0::stripedGap$lambda$0);
        h = new HashMap();
        f.onChange(q_0::_init_$lambda$0);
        F.onChange(q_0::_init_$lambda$1);
    }

    public static Object a(Object[] object) {
        Object object2;
        int n = (Integer)object[K[244]];
        String string = (String)object[K[245]];
        object = object[K[246]];
        Object[] objectArray = J;
        if (J == null) {
            objectArray = J = new Object[K[247]];
        }
        if ((object2 = objectArray[n]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[K[248]];
                I = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[K[250] ^ K[251]];
                byArray[q_0.K[252] ^ q_0.K[253]] = K[254] ^ K[255];
                byArray[q_0.K[256] ^ q_0.K[257]] = K[258] ^ K[259];
                byArray[q_0.K[260] ^ q_0.K[261]] = K[262] ^ K[263];
                byArray[q_0.K[264] ^ q_0.K[265]] = K[266] ^ K[267];
                byArray[q_0.K[268] ^ q_0.K[269]] = K[270] ^ K[271];
                byArray[q_0.K[272] ^ q_0.K[273]] = K[274] ^ K[275];
                byArray[q_0.K[276] ^ q_0.K[277]] = K[278] ^ K[279];
                byArray[q_0.K[280] ^ q_0.K[281]] = K[282] ^ K[283];
                byArray[q_0.K[284] ^ q_0.K[285]] = K[286] ^ K[287];
                byArray[q_0.K[288] ^ q_0.K[289]] = K[290] ^ K[291];
                byArray[q_0.K[292] ^ q_0.K[293]] = K[294] ^ K[295];
                byArray[q_0.K[296] ^ q_0.K[297]] = K[298] ^ K[299];
                byArray[q_0.K[300] ^ q_0.K[301]] = K[302] ^ K[303];
                byArray[q_0.K[304] ^ q_0.K[305]] = K[306] ^ K[307];
                byArray[q_0.K[308] ^ q_0.K[309]] = K[310] ^ K[311];
                byArray[q_0.K[312] ^ q_0.K[313]] = K[314] ^ K[315];
                objectArray2[q_0.K[249]] = byArray;
            }
            byte[] byArray = (byte[])object3[K[316]];
            if (j == null) {
                byte[] byArray2 = new byte[K[317] ^ K[318]];
                byArray2[q_0.K[319] ^ q_0.K[320]] = K[321] ^ K[322];
                byArray2[q_0.K[323] ^ q_0.K[324]] = K[325] ^ K[326];
                byArray2[q_0.K[327] ^ q_0.K[328]] = K[329] ^ K[330];
                byArray2[q_0.K[331] ^ q_0.K[332]] = K[333] ^ K[334];
                byArray2[q_0.K[335] ^ q_0.K[336]] = K[337] ^ K[338];
                byArray2[q_0.K[339] ^ q_0.K[340]] = K[341] ^ K[342];
                byArray2[q_0.K[343] ^ q_0.K[344]] = K[345] ^ K[346];
                byArray2[q_0.K[347] ^ q_0.K[348]] = K[349] ^ K[350];
                byArray2[q_0.K[351] ^ q_0.K[352]] = K[353] ^ K[354];
                byArray2[q_0.K[355] ^ q_0.K[356]] = K[357] ^ K[358];
                byArray2[q_0.K[359] ^ q_0.K[360]] = K[361] ^ K[362];
                byArray2[q_0.K[363] ^ q_0.K[364]] = K[365] ^ K[366];
                byArray2[q_0.K[367] ^ q_0.K[368]] = K[369] ^ K[370];
                byArray2[q_0.K[371] ^ q_0.K[372]] = K[373] ^ K[374];
                byArray2[q_0.K[375] ^ q_0.K[376]] = K[377] ^ K[378];
                byArray2[q_0.K[379] ^ q_0.K[380]] = K[381] ^ K[382];
                byArray2[q_0.K[383] ^ q_0.K[384]] = K[385] ^ K[386];
                byArray2[q_0.K[387] ^ q_0.K[388]] = K[389] ^ K[390];
                byArray2[q_0.K[391] ^ q_0.K[392]] = K[393] ^ K[394];
                byArray2[q_0.K[395] ^ q_0.K[396]] = K[397] ^ K[398];
                byArray2[q_0.K[399] ^ 0x194F] = 0x1946 ^ 0x194F;
                byArray2[0x7BED ^ 0x7BEF] = 0x7B83 ^ 0x7BEF;
                byArray2[0x10308 ^ 0x1031A] = 0x10377 ^ 0x1031A;
                byArray2[0x1081D ^ 0x10801] = 0xFFFEF7C4 ^ 0x10801;
                byArray2[0x9860 ^ 0x987D] = 0x9826 ^ 0x987D;
                byArray2[0x1774 ^ 0x1777] = 0x1740 ^ 0x1777;
                byArray2[0xA147 ^ 0xA15F] = 0xA13C ^ 0xA15F;
                byArray2[0x2AC7 ^ 0x2AD6] = 0xFFFFD559 ^ 0x2AD6;
                byArray2[0x716E ^ 0x716B] = 0xFFFF8E9B ^ 0x716B;
                byArray2[0x8D71 ^ 0x8D7A] = 0x8D65 ^ 0x8D7A;
                byArray2[0x1F72 ^ 0x1F6C] = 0x1F3F ^ 0x1F6C;
                byArray2[0x109D2 ^ 0x109C4] = 0xFFFEF63B ^ 0x109C4;
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, 0, byArray3, 0, byArray.length);
                System.arraycopy(byArray2, 0, byArray3, byArray.length, byArray2.length);
                Object object4 = q_0.A()[1];
                if (object4 == null) {
                    char[] cArray = "\ua4b3\ua4b5\ua4ce\ua4b7\ua4b9\ua505\ua4aa\ua46c\ua3c7\ua3db\ua4bb\ua470\ua3d4\ua3d6\ua4a6\ua4bb\ua4b4\ua504".toCharArray();
                    for (int i2 = 0; i2 < 18; ++i2) {
                        int n2 = cArray[i2];
                        n2 += 7478;
                        n2 += 54054;
                        n2 ^= 0xD6B7;
                        n2 += 55528;
                        n2 ^= 0xA8C9;
                        n2 ^= 0x6849;
                        n2 += 13451;
                        n2 -= 14366;
                        n2 -= 47950;
                        cArray[i2] = (char)(n2 ^= 0x1D6F);
                    }
                    object4 = q_0.A()[1] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[16];
                byArray4[12] = -13;
                byArray4[6] = 105;
                byArray4[8] = -7;
                byArray4[14] = -78;
                byArray4[10] = 121;
                byArray4[15] = 29;
                byArray4[13] = -94;
                byArray4[1] = 38;
                byArray4[0] = -73;
                byArray4[9] = 82;
                byArray4[7] = 49;
                byArray4[3] = 1;
                byArray4[11] = 49;
                byArray4[4] = -81;
                byArray4[2] = -3;
                byArray4[5] = 46;
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, 7, 256);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = q_0.A()[2];
                if (object5 == null) {
                    char[] cArray = "\u12da\u12be\u12b8".toCharArray();
                    for (int i3 = 0; i3 < 3; ++i3) {
                        int n3 = cArray[i3];
                        n3 -= 62565;
                        n3 += 13383;
                        n3 += 25543;
                        n3 += 49067;
                        n3 -= 64651;
                        n3 -= 4843;
                        n3 += 49647;
                        n3 += 17488;
                        n3 ^= 0x3455;
                        n3 += 52982;
                        n3 ^= 0x15F6;
                        n3 += 12569;
                        cArray[i3] = (char)(n3 += 40122);
                    }
                    object5 = q_0.A()[2] = new String(cArray);
                }
                j = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, 0, 16);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, 16, byArray6.length);
            Object object6 = q_0.A()[3];
            if (object6 == null) {
                char[] cArray = "\uedd7\uede3\uede9\uee0d\uedd9\uedd8\uedd9\uee0d\uede6\uede1\uedd9\uede9\uf053\uede6\uedb7\uedc2\uedc2\uedbf\uedcc\uedc5".toCharArray();
                for (int i4 = 0; i4 < 20; ++i4) {
                    int n4 = cArray[i4];
                    n4 += 1746;
                    n4 ^= 0xDD2;
                    n4 ^= 0xFB09;
                    n4 -= 42889;
                    n4 += 59369;
                    n4 += 4874;
                    n4 -= 27310;
                    n4 -= 3102;
                    n4 += 61294;
                    cArray[i4] = (char)(n4 ^= 0xCE3F);
                }
                object6 = q_0.A()[3] = new String(cArray);
            }
            Cipher cipher = Cipher.getInstance((String)object6);
            cipher.init(2, (Key)((SecretKey)j), new IvParameterSpec(byArray7));
            byte[] byArray9 = cipher.doFinal(byArray8);
            object2 = new String(byArray9, StandardCharsets.UTF_8);
        }
        return object2;
    }

    private static Object[] A() {
        Object[] objectArray = k;
        if (k == null) {
            k = new Object[4];
            objectArray = k;
        }
        return objectArray;
    }

    public static void b() {
        K = new int[0xDE38 ^ 0xDFA8];
        q_0.K[0x3582 ^ 0x3566] = 0xFFFFCAB4 ^ 0x3566;
        q_0.K[0xB94C ^ 0xB840] = 0xFB58 ^ 0xB840;
        q_0.K[0xCB0C ^ 0xCA6E] = 0x1C26A ^ 0xCA6E;
        q_0.K[0x1B51 ^ 0x1A28] = 0x5F43 ^ 0x1A28;
        q_0.K[0xA6A4 ^ 0xA6CB] = 0xFFFF5952 ^ 0xA6CB;
        q_0.K[0xE1D3 ^ 0xE128] = 0x560 ^ 0xE128;
        q_0.K[0x2D3F ^ 0x2D22] = 0x2D0C ^ 0x2D22;
        q_0.K[0xEA7 ^ 0xEB8] = 0xE8E ^ 0xEB8;
        q_0.K[0x5D97 ^ 0x5D54] = 0xFFFFA297 ^ 0x5D54;
        q_0.K[0x89EC ^ 0x88DE] = 0xFFFF7198 ^ 0x88DE;
        q_0.K[0x30C9 ^ 0x31B2] = 0x3EA5 ^ 0x31B2;
        q_0.K[0x54E5 ^ 0x54B3] = 0xFFFFAB40 ^ 0x54B3;
        q_0.K[0x1BD3 ^ 0x1B83] = 0xFFFFE474 ^ 0x1B83;
        q_0.K[0xDF5F ^ 0xDF79] = 0xFFFF208E ^ 0xDF79;
        q_0.K[0x972B ^ 0x966C] = 0x85A2 ^ 0x966C;
        q_0.K[0xB048 ^ 0xB030] = 0xB030 ^ 0xB030;
        q_0.K[0x6254 ^ 0x6378] = 0x86A8 ^ 0x6378;
        q_0.K[0x5151 ^ 0x501F] = 0x1E89 ^ 0x501F;
        q_0.K[0x5460 ^ 0x540B] = 0x5478 ^ 0x540B;
        q_0.K[0xCA6 ^ 0xC0F] = 0xFFFFF3F0 ^ 0xC0F;
        q_0.K[0x101F1 ^ 0x10122] = 0xFFFEFED7 ^ 0x10122;
        q_0.K[0x9CCA ^ 0x9C66] = 0x9CD7 ^ 0x9C66;
        q_0.K[0x477C ^ 0x46FE] = 0x6999 ^ 0x46FE;
        q_0.K[0xF85B ^ 0xF912] = 0xFFFF155E ^ 0xF912;
        q_0.K[0xCEFB ^ 0xCEAC] = 0xCEBA ^ 0xCEAC;
        q_0.K[0xF33C ^ 0xF239] = 0x88C7 ^ 0xF239;
        q_0.K[0x163B ^ 0x1764] = 0x11F60 ^ 0x1764;
        q_0.K[0x1202 ^ 0x133A] = 0x2851 ^ 0x133A;
        q_0.K[0x6C52 ^ 0x6CD3] = 0x4FD5 ^ 0x6CD3;
        q_0.K[0x9BED ^ 0x9AE2] = 0xD9F6 ^ 0x9AE2;
        q_0.K[0x7020 ^ 0x7120] = 0xFAE2 ^ 0x7120;
        q_0.K[0x25F0 ^ 0x2541] = 0x251C ^ 0x2541;
        q_0.K[0x70D3 ^ 0x70F7] = 0xFFFF8F54 ^ 0x70F7;
        q_0.K[0x2C2E ^ 0x2C2E] = 0xFFFFD38B ^ 0x2C2E;
        q_0.K[0xED4D ^ 0xEDA2] = 0xEDA1 ^ 0xEDA2;
        q_0.K[0x3BDF ^ 0x3BAE] = 0xFFFFC407 ^ 0x3BAE;
        q_0.K[0x10F52 ^ 0x10F15] = 0xFFFEF0C4 ^ 0x10F15;
        q_0.K[0x10C91 ^ 0x10DF4] = 0x1BE88 ^ 0x10DF4;
        q_0.K[0x6F2 ^ 0x6E8] = 0x6A4 ^ 0x6E8;
        q_0.K[0xD4BF ^ 0xD449] = 0xD449 ^ 0xD449;
        q_0.K[0x10C19 ^ 0x10CC5] = 0x10CCC ^ 0x10CC5;
        q_0.K[0x7528 ^ 0x757C] = 0xFFFF8AA0 ^ 0x757C;
        q_0.K[0x215D ^ 0x2112] = 0xFFFFDECD ^ 0x2112;
        q_0.K[0x91EB ^ 0x9155] = 0x9156 ^ 0x9155;
        q_0.K[0xC109 ^ 0xC00D] = 0xBAF7 ^ 0xC00D;
        q_0.K[0x738B ^ 0x739C] = 0x73D5 ^ 0x739C;
        q_0.K[0x4A32 ^ 0x4A40] = 0x4A3E ^ 0x4A40;
        q_0.K[0x9831 ^ 0x990C] = 0x7338 ^ 0x990C;
        q_0.K[0x23FE ^ 0x23A0] = 0x23E8 ^ 0x23A0;
        q_0.K[0x4E1F ^ 0x4EAB] = 0x4EF5 ^ 0x4EAB;
        q_0.K[0xCA5A ^ 0xCB18] = 0x1C3 ^ 0xCB18;
        q_0.K[0x63AA ^ 0x6329] = 0x24C7 ^ 0x6329;
        q_0.K[0x1913 ^ 0x19E7] = 0x19E6 ^ 0x19E7;
        q_0.K[0xD3ED ^ 0xD2EE] = 0x5929 ^ 0xD2EE;
        q_0.K[0xAE8C ^ 0xAE6B] = 0xAE4C ^ 0xAE6B;
        q_0.K[0x2999 ^ 0x28C5] = 0x1AC9 ^ 0x28C5;
        q_0.K[0x8D6B ^ 0x8DFE] = 0x8DEF ^ 0x8DFE;
        q_0.K[0x182C ^ 0x1893] = 0x1891 ^ 0x1893;
        q_0.K[0xB07C ^ 0xB10F] = 0x8F99 ^ 0xB10F;
        q_0.K[0x62C2 ^ 0x6288] = 0xFFFF9D0D ^ 0x6288;
        q_0.K[0xEF1A ^ 0xEE71] = 0xE0D5 ^ 0xEE71;
        q_0.K[0x781B ^ 0x78DB] = 0x78C0 ^ 0x78DB;
        q_0.K[0x90FA ^ 0x91CB] = 0x971E ^ 0x91CB;
        q_0.K[0x50B6 ^ 0x5088] = 0xFFFFAF6B ^ 0x5088;
        q_0.K[0xFA1C ^ 0xFB42] = 0xC94E ^ 0xFB42;
        q_0.K[0x3D6E ^ 0x3C11] = 0x1377 ^ 0x3C11;
        q_0.K[0x10F10 ^ 0x10E1E] = 0xFFFEB2FC ^ 0x10E1E;
        q_0.K[0x8F99 ^ 0x8FF1] = 0x8FE2 ^ 0x8FF1;
        q_0.K[0xDDFE ^ 0xDCA3] = 0xFFFF115F ^ 0xDCA3;
        q_0.K[0x7397 ^ 0x737D] = 0x7320 ^ 0x737D;
        q_0.K[0x95E2 ^ 0x956B] = 0x7BB1 ^ 0x956B;
        q_0.K[0xA4C4 ^ 0xA544] = 0x8A23 ^ 0xA544;
        q_0.K[0x4699 ^ 0x465B] = 0x4629 ^ 0x465B;
        q_0.K[0xC49 ^ 0xC72] = 0xFFFFF3B6 ^ 0xC72;
        q_0.K[0xF679 ^ 0xF6F9] = 0xDE18 ^ 0xF6F9;
        q_0.K[0x23DB ^ 0x23CA] = 0x23C2 ^ 0x23CA;
        q_0.K[0xF225 ^ 0xF315] = 0xF5C6 ^ 0xF315;
        q_0.K[0xD375 ^ 0xD3D7] = 0xD3F1 ^ 0xD3D7;
        q_0.K[0x5140 ^ 0x50CD] = 0xFFFF5DE1 ^ 0x50CD;
        q_0.K[0x99B6 ^ 0x99AE] = 0x1099BA ^ 0x99AE;
        q_0.K[0x109F6 ^ 0x1093F] = 0x10919 ^ 0x1093F;
        q_0.K[0x10C89 ^ 0x10CEB] = 0xFFFEF33C ^ 0x10CEB;
        q_0.K[0x7E8E ^ 0x7F95] = 0x5FB6 ^ 0x7F95;
        q_0.K[0x9DD9 ^ 0x9D82] = 0xFFFF624A ^ 0x9D82;
        q_0.K[0x118A ^ 0x113D] = 0xFFFFEEF9 ^ 0x113D;
        q_0.K[0x1FAD ^ 0x1F5F] = 0x1F43 ^ 0x1F5F;
        q_0.K[0x29FC ^ 0x2983] = 0xD583 ^ 0x2983;
        q_0.K[0x9B0F ^ 0x9B6F] = 0x9B78 ^ 0x9B6F;
        q_0.K[0xD968 ^ 0xD9E6] = 0xD968 ^ 0xD9E6;
        q_0.K[0xE5B8 ^ 0xE5A6] = 0xFFFF1A41 ^ 0xE5A6;
        q_0.K[0x602B ^ 0x6077] = 0xFFFF9F97 ^ 0x6077;
        q_0.K[0x4AF0 ^ 0x4BA1] = 0xE7B ^ 0x4BA1;
        q_0.K[0xAFF6 ^ 0xAF08] = 0xFFFE54F8 ^ 0xAF08;
        q_0.K[0x105CF ^ 0x10553] = 0x10549 ^ 0x10553;
        q_0.K[0x69F ^ 0x666] = 0x666 ^ 0x666;
        q_0.K[0x3A4E ^ 0x3B27] = 0xFFFFD1AB ^ 0x3B27;
        q_0.K[0x625A ^ 0x6270] = 0xFFFF9DB8 ^ 0x6270;
        q_0.K[0xA926 ^ 0xA975] = 0xA92F ^ 0xA975;
        q_0.K[0xEAA9 ^ 0xEA41] = 0xFFFF1588 ^ 0xEA41;
        q_0.K[0xC00A ^ 0xC13C] = 0xFFFFC203 ^ 0xC13C;
        q_0.K[0xFB77 ^ 0xFA00] = 0xBF67 ^ 0xFA00;
        q_0.K[0xED42 ^ 0xEDFB] = 0xEDDA ^ 0xEDFB;
        q_0.K[0x7CE9 ^ 0x7CA5] = 0xFFFF8308 ^ 0x7CA5;
        q_0.K[0xF73E ^ 0xF71C] = 0xFFFF08B2 ^ 0xF71C;
        q_0.K[0x7E7B ^ 0x7EDE] = 0x7EA3 ^ 0x7EDE;
        q_0.K[0x2CF8 ^ 0x2CF3] = 0xFFFFD34B ^ 0x2CF3;
        q_0.K[0x6832 ^ 0x683E] = 0x68AB ^ 0x683E;
        q_0.K[0x9CCF ^ 0x9C60] = 0xFFFF6317 ^ 0x9C60;
        q_0.K[0xA979 ^ 0xA843] = 0x9343 ^ 0xA843;
        q_0.K[0xF070 ^ 0xF16E] = 0xFFFF9AE3 ^ 0xF16E;
        q_0.K[0x8D0B ^ 0x8D39] = 0xFFFF72AA ^ 0x8D39;
        q_0.K[0x3595 ^ 0x357B] = 0xFFFFCAD4 ^ 0x357B;
        q_0.K[0x1E9D ^ 0x1FDC] = 0xD50C ^ 0x1FDC;
        q_0.K[0x16F3 ^ 0x166D] = 0x160A ^ 0x166D;
        q_0.K[0x67FE ^ 0x67B3] = 0xFFFF9865 ^ 0x67B3;
        q_0.K[0xBBEE ^ 0xBAC7] = 0xBD49 ^ 0xBAC7;
        q_0.K[0x7D3C ^ 0x7DBA] = 0x8603 ^ 0x7DBA;
        q_0.K[0x73F2 ^ 0x732D] = 0xFFFF8CD7 ^ 0x732D;
        q_0.K[0x7646 ^ 0x770B] = 0x39BC ^ 0x770B;
        q_0.K[0x862E ^ 0x86E3] = 0xFFFF796E ^ 0x86E3;
        q_0.K[0xE0DF ^ 0xE008] = 0xE02E ^ 0xE008;
        q_0.K[0x982C ^ 0x9941] = 0x97D3 ^ 0x9941;
        q_0.K[0x251 ^ 0x2A9] = 0x2A8 ^ 0x2A9;
        q_0.K[0xC762 ^ 0xC7B6] = 0xFFFF384B ^ 0xC7B6;
        q_0.K[0xACA8 ^ 0xAC44] = 0xAC67 ^ 0xAC44;
        q_0.K[0xD596 ^ 0xD52A] = 0xFFFF2AD0 ^ 0xD52A;
        q_0.K[0xE25A ^ 0xE236] = 0xE23D ^ 0xE236;
        q_0.K[0xA6BF ^ 0xA66D] = 0xA636 ^ 0xA66D;
        q_0.K[0xE0E3 ^ 0xE000] = 0xFFFF1FF7 ^ 0xE000;
        q_0.K[0xFF72 ^ 0xFF06] = 0xFFFF00EA ^ 0xFF06;
        q_0.K[0x7A19 ^ 0x7AE6] = 0x17EF9 ^ 0x7AE6;
        q_0.K[0x10774 ^ 0x1065E] = 0x101DB ^ 0x1065E;
        q_0.K[0x1C18 ^ 0x1CC3] = 0xFFFFE341 ^ 0x1CC3;
        q_0.K[0x553B ^ 0x5454] = 0xC82 ^ 0x5454;
        q_0.K[0xCA29 ^ 0xCA5F] = 0xCA5F ^ 0xCA5F;
        q_0.K[0xEFD ^ 0xE90] = 0xFFFFF128 ^ 0xE90;
        q_0.K[0xE57D ^ 0xE5A0] = 0xFFFF1A4D ^ 0xE5A0;
        q_0.K[0xF4F9 ^ 0xF464] = 0xFFFF0B98 ^ 0xF464;
        q_0.K[0x3812 ^ 0x38A8] = 0xFFFFC725 ^ 0x38A8;
        q_0.K[0x61F8 ^ 0x61F7] = 0x1061E8 ^ 0x61F7;
        q_0.K[0x10FAA ^ 0x10E20] = 0x192AB ^ 0x10E20;
        q_0.K[0x47C ^ 0x55B] = 0x3015 ^ 0x55B;
        q_0.K[0x881A ^ 0x8934] = 0xFFFF9322 ^ 0x8934;
        q_0.K[0x1E10 ^ 0x1F06] = 0xF389 ^ 0x1F06;
        q_0.K[0x6027 ^ 0x6168] = 0x2491 ^ 0x6168;
        q_0.K[0xDD55 ^ 0xDD4C] = 0xDD14 ^ 0xDD4C;
        q_0.K[0x2451 ^ 0x247F] = 0xFFFFDB92 ^ 0x247F;
        q_0.K[0x9406 ^ 0x9499] = 0xFFFF6B0D ^ 0x9499;
        q_0.K[0x1C8A ^ 0x1C3A] = 0x1C76 ^ 0x1C3A;
        q_0.K[0x274C ^ 0x265F] = 0x866 ^ 0x265F;
        q_0.K[0x3FDE ^ 0x3F8F] = 0x3FE0 ^ 0x3F8F;
        q_0.K[0x146B ^ 0x147D] = 0x144D ^ 0x147D;
        q_0.K[0x7EB7 ^ 0x7EF9] = 0x7ED0 ^ 0x7EF9;
        q_0.K[0x31BF ^ 0x30AB] = 0xDC21 ^ 0x30AB;
        q_0.K[0xFCA7 ^ 0xFC1F] = 0xFC6D ^ 0xFC1F;
        q_0.K[0x9406 ^ 0x94AD] = 0xFFFF6B5E ^ 0x94AD;
        q_0.K[0x7107 ^ 0x71D9] = 0xFFFF8E2F ^ 0x71D9;
        q_0.K[0xA9D5 ^ 0xA9B0] = 0xA9FE ^ 0xA9B0;
        q_0.K[0xEE84 ^ 0xEEB7] = 0xEE96 ^ 0xEEB7;
        q_0.K[0xCA82 ^ 0xCAF9] = 0xCAF9 ^ 0xCAF9;
        q_0.K[0x167C ^ 0x1629] = 0xFFFFE9C0 ^ 0x1629;
        q_0.K[0xE61B ^ 0xE73D] = 0xD22D ^ 0xE73D;
        q_0.K[0x9D57 ^ 0x9D7B] = 0x9D7C ^ 0x9D7B;
        q_0.K[0xFF5 ^ 0xF9C] = 0xFFFFF0F7 ^ 0xF9C;
        q_0.K[0x73C9 ^ 0x73AD] = 0xFFFF8C38 ^ 0x73AD;
        q_0.K[0xB27F ^ 0xB29D] = 0xFFFF4D55 ^ 0xB29D;
        q_0.K[0x339A ^ 0x3308] = 0xFFFFCCD1 ^ 0x3308;
        q_0.K[0x109AE ^ 0x10961] = 0xFFFEF6F0 ^ 0x10961;
        q_0.K[0x1609 ^ 0x16CC] = 0xFFFFE900 ^ 0x16CC;
        q_0.K[0x1B30 ^ 0x1A45] = 0xFFFFDB56 ^ 0x1A45;
        q_0.K[0x39E3 ^ 0x392B] = 0x390A ^ 0x392B;
        q_0.K[0x9C78 ^ 0x9CAD] = 0xFFFF635A ^ 0x9CAD;
        q_0.K[0x7F4A ^ 0x7F08] = 0xFFFF8077 ^ 0x7F08;
        q_0.K[0x10716 ^ 0x10718] = 0xFFFEF8C0 ^ 0x10718;
        q_0.K[0x3F0D ^ 0x3E1D] = 0x1026 ^ 0x3E1D;
        q_0.K[0xAB19 ^ 0xAA98] = 0xFFFF7A27 ^ 0xAA98;
        q_0.K[0x1820 ^ 0x1824] = 0xFFFFE7AB ^ 0x1824;
        q_0.K[0xDB15 ^ 0xDBF4] = 0xFFFF2456 ^ 0xDBF4;
        q_0.K[0x10BF2 ^ 0x10B7A] = 0x17D00 ^ 0x10B7A;
        q_0.K[0x580B ^ 0x58A1] = 0xFFFFA75D ^ 0x58A1;
        q_0.K[0xBBD5 ^ 0xBAA7] = 0xE276 ^ 0xBAA7;
        q_0.K[0xC578 ^ 0xC59E] = 0xC5E9 ^ 0xC59E;
        q_0.K[0xEB9 ^ 0xE98] = 0xFFFFF129 ^ 0xE98;
        q_0.K[0x9F27 ^ 0x9F49] = 0xFFFF60DA ^ 0x9F49;
        q_0.K[0xF71 ^ 0xF6A] = 0xFF2 ^ 0xF6A;
        q_0.K[0x85C5 ^ 0x8556] = 0x857B ^ 0x8556;
        q_0.K[0x3552 ^ 0x35EF] = 0xFFFFCA45 ^ 0x35EF;
        q_0.K[0x5576 ^ 0x544A] = 0x544A ^ 0x544A;
        q_0.K[0x6D01 ^ 0x6C4D] = 0x22DB ^ 0x6C4D;
        q_0.K[0xA28F ^ 0xA257] = 0xFFFF5DC2 ^ 0xA257;
        q_0.K[0x1D9 ^ 0x15B] = 0x2111 ^ 0x15B;
        q_0.K[0xB565 ^ 0xB525] = 0xB541 ^ 0xB525;
        q_0.K[0xED13 ^ 0xED2F] = 0xEDCF ^ 0xED2F;
        q_0.K[0xE08D ^ 0xE1E5] = 0xF49C ^ 0xE1E5;
        q_0.K[0x1CEA ^ 0x1DDD] = 0xE12F ^ 0x1DDD;
        q_0.K[0x8F48 ^ 0x8F7E] = 0x8F22 ^ 0x8F7E;
        q_0.K[0x5C1B ^ 0x5D5F] = 0xC48B ^ 0x5D5F;
        q_0.K[0xA7A7 ^ 0xA6B2] = 0x4A31 ^ 0xA6B2;
        q_0.K[0x4081 ^ 0x40BE] = 0x4036 ^ 0x40BE;
        q_0.K[0xFFA5 ^ 0xFF06] = 0xFF26 ^ 0xFF06;
        q_0.K[0xCA1D ^ 0xCA54] = 0xFFFF35D8 ^ 0xCA54;
        q_0.K[0x46B1 ^ 0x473E] = 0x5E7F ^ 0x473E;
        q_0.K[0x1A8 ^ 0x1EB] = 0xFFFFFE10 ^ 0x1EB;
        q_0.K[0x10728 ^ 0x1062F] = 0x17CD1 ^ 0x1062F;
        q_0.K[0x226B ^ 0x22F3] = 0xFFFFDD5C ^ 0x22F3;
        q_0.K[0x14CF ^ 0x1495] = 0x14CD ^ 0x1495;
        q_0.K[0x5B5 ^ 0x59E] = 0xFFFFFA51 ^ 0x59E;
        q_0.K[0x8263 ^ 0x8262] = 0xFFFF7DBA ^ 0x8262;
        q_0.K[0xA5A0 ^ 0xA5AA] = 0xFFFF5A63 ^ 0xA5AA;
        q_0.K[0xBE75 ^ 0xBEE4] = 0xFFFF4170 ^ 0xBEE4;
        q_0.K[0x8118 ^ 0x81E9] = 0x8175 ^ 0x81E9;
        q_0.K[0x8EC ^ 0x88A] = 0xFFFFF767 ^ 0x88A;
        q_0.K[0x105 ^ 0xF] = 0xFFFFE561 ^ 0xF;
        q_0.K[0x56BF ^ 0x56B7] = 0xFFFFA947 ^ 0x56B7;
        q_0.K[0xB5C3 ^ 0xB539] = 0x5161 ^ 0xB539;
        q_0.K[0x272E ^ 0x2706] = 0xFFFFD8D8 ^ 0x2706;
        q_0.K[0x36CD ^ 0x3669] = 0xFFFFC9EA ^ 0x3669;
        q_0.K[0x9479 ^ 0x9522] = 0xA722 ^ 0x9522;
        q_0.K[0x9B ^ 0x1CC] = 0x1B3D ^ 0x1CC;
        q_0.K[0xE164 ^ 0xE1AE] = 0xFFFF1EFB ^ 0xE1AE;
        q_0.K[0x4A3F ^ 0x4AEE] = 0x4AA6 ^ 0x4AEE;
        q_0.K[0xC9BD ^ 0xC8C7] = 0x8DBB ^ 0xC8C7;
        q_0.K[0x3F93 ^ 0x3F08] = 0xFFFFC09F ^ 0x3F08;
        q_0.K[0x766B ^ 0x76CD] = 0xFFFF893C ^ 0x76CD;
        q_0.K[0x1BB2 ^ 0x1AA5] = 0xF626 ^ 0x1AA5;
        q_0.K[0x10C15 ^ 0x10CF0] = 0xFFFEF393 ^ 0x10CF0;
        q_0.K[0x77F9 ^ 0x77C1] = 0xFFFF8836 ^ 0x77C1;
        q_0.K[0xFD37 ^ 0xFD1E] = 0xFFFF02D7 ^ 0xFD1E;
        q_0.K[0xC4A0 ^ 0xC5A1] = 0x4E66 ^ 0xC5A1;
        q_0.K[0xEB05 ^ 0xEBCB] = 0xFFFF143D ^ 0xEBCB;
        q_0.K[0x10C60 ^ 0x10C73] = 0xFFFEF3AC ^ 0x10C73;
        q_0.K[0xFF15 ^ 0xFE08] = 0x6A7F ^ 0xFE08;
        q_0.K[0x12C1 ^ 0x13EE] = 0xF636 ^ 0x13EE;
        q_0.K[0xC296 ^ 0xC3BB] = 0x2663 ^ 0xC3BB;
        q_0.K[0x3E6F ^ 0x3E2B] = 0x3E57 ^ 0x3E2B;
        q_0.K[0xC10C ^ 0xC19B] = 0xFFFF3E6C ^ 0xC19B;
        q_0.K[0xB0EA ^ 0xB08B] = 0xFFFF4F65 ^ 0xB08B;
        q_0.K[0xB4A5 ^ 0xB422] = 0x918 ^ 0xB422;
        q_0.K[0xB927 ^ 0xB851] = 0x86CD ^ 0xB851;
        q_0.K[0x197 ^ 0xC7] = 0x452A ^ 0xC7;
        q_0.K[0x47B ^ 0x4EF] = 0x4CA ^ 0x4EF;
        q_0.K[0x4F98 ^ 0x4F2E] = 0xFFFFB099 ^ 0x4F2E;
        q_0.K[0x44D3 ^ 0x45B0] = 0xF6F2 ^ 0x45B0;
        q_0.K[0xF730 ^ 0xF71F] = 0xF71A ^ 0xF71F;
        q_0.K[0x4534 ^ 0x45AD] = 0x45D7 ^ 0x45AD;
        q_0.K[0xE632 ^ 0xE615] = 0xE64F ^ 0xE615;
        q_0.K[0x16DE ^ 0x1798] = 0x8E4C ^ 0x1798;
        q_0.K[0x1087F ^ 0x1094A] = 0x1F5B8 ^ 0x1094A;
        q_0.K[0xDB43 ^ 0xDA5F] = 0x4E2B ^ 0xDA5F;
        q_0.K[0xD18D ^ 0xD1B9] = 0xFFFF2E53 ^ 0xD1B9;
        q_0.K[0x10594 ^ 0x10586] = 0xFFFEFA1D ^ 0x10586;
        q_0.K[0xCF9F ^ 0xCF92] = 0xCFF3 ^ 0xCF92;
        q_0.K[0xDD5F ^ 0xDD4F] = 0xDD68 ^ 0xDD4F;
        q_0.K[0x22AF ^ 0x23CE] = 0x12BC6 ^ 0x23CE;
        q_0.K[0x70C6 ^ 0x71A6] = 0x179A2 ^ 0x71A6;
        q_0.K[0xE2D5 ^ 0xE251] = 0x2960 ^ 0xE251;
        q_0.K[0x82AA ^ 0x826B] = 0x8244 ^ 0x826B;
        q_0.K[0x281E ^ 0x28B6] = 0xFFFFD771 ^ 0x28B6;
        q_0.K[0x2A3F ^ 0x2AD6] = 0xFFFFD579 ^ 0x2AD6;
        q_0.K[0x3BE7 ^ 0x3B47] = 0x3B59 ^ 0x3B47;
        q_0.K[0x9BEC ^ 0x9BB1] = 0x9B99 ^ 0x9BB1;
        q_0.K[0x104BA ^ 0x105CA] = 0x15D1B ^ 0x105CA;
        q_0.K[0xD593 ^ 0xD520] = 0xD54B ^ 0xD520;
        q_0.K[0xFBBF ^ 0xFAFF] = 0x3024 ^ 0xFAFF;
        q_0.K[0x1004D ^ 0x101C8] = 0xFFFEF5E9 ^ 0x101C8;
        q_0.K[0x58 ^ 0x5A] = 0x22 ^ 0x5A;
        q_0.K[0xBC57 ^ 0xBCBA] = 0xBC86 ^ 0xBCBA;
        q_0.K[0x36E2 ^ 0x361E] = 0x13200 ^ 0x361E;
        q_0.K[0x6CAD ^ 0x6C37] = 0xFFFF93E6 ^ 0x6C37;
        q_0.K[0x69EC ^ 0x68EE] = 0xE323 ^ 0x68EE;
        q_0.K[0x5BD2 ^ 0x5ABE] = 0x5400 ^ 0x5ABE;
        q_0.K[0x6239 ^ 0x6320] = 0x4303 ^ 0x6320;
        q_0.K[0xD87A ^ 0xD939] = 0x40FE ^ 0xD939;
        q_0.K[0xFA4E ^ 0xFB24] = 0xEE5D ^ 0xFB24;
        q_0.K[0x4FAE ^ 0x4E9A] = 0xB267 ^ 0x4E9A;
        q_0.K[0x410C ^ 0x417C] = 0x415C ^ 0x417C;
        q_0.K[0x1FAB ^ 0x1EE3] = 0xD38 ^ 0x1EE3;
        q_0.K[0x9C6D ^ 0x9CCA] = 0xFFFF6352 ^ 0x9CCA;
        q_0.K[0xB5D4 ^ 0xB5F4] = 0xB5E9 ^ 0xB5F4;
        q_0.K[0xB731 ^ 0xB79C] = 0xB7AE ^ 0xB79C;
        q_0.K[0xCA39 ^ 0xCAA9] = 0xCAC6 ^ 0xCAA9;
        q_0.K[0x419C ^ 0x414C] = 0xFFFFBEA3 ^ 0x414C;
        q_0.K[0x266A ^ 0x274B] = 0x9EA1 ^ 0x274B;
        q_0.K[0xC65D ^ 0xC624] = 0xC626 ^ 0xC624;
        q_0.K[0x4A79 ^ 0x4A5A] = 0xFFFFB5A4 ^ 0x4A5A;
        q_0.K[0x724E ^ 0x721C] = 0xFFFF8DD4 ^ 0x721C;
        q_0.K[0xA311 ^ 0xA200] = 0x8C39 ^ 0xA200;
        q_0.K[0x889F ^ 0x88C7] = 0x8885 ^ 0x88C7;
        q_0.K[0x26D7 ^ 0x2611] = 0x2655 ^ 0x2611;
        q_0.K[0x207B ^ 0x2121] = 0x3BC7 ^ 0x2121;
        q_0.K[0x59C1 ^ 0x594A] = 0x596C ^ 0x594A;
        q_0.K[0xB992 ^ 0xB8C7] = 0xE17E ^ 0xB8C7;
        q_0.K[0x916E ^ 0x900A] = 0x234C ^ 0x900A;
        q_0.K[0x3F78 ^ 0x3E47] = 0xF483 ^ 0x3E47;
        q_0.K[0xE9CB ^ 0xE936] = 0x1ED29 ^ 0xE936;
        q_0.K[0x94A3 ^ 0x9527] = 0x9ECB ^ 0x9527;
        q_0.K[0xCA55 ^ 0xCB47] = 0xE568 ^ 0xCB47;
        q_0.K[0x391E ^ 0x397D] = 0xFFFFC6A6 ^ 0x397D;
        q_0.K[0x10E73 ^ 0x10E35] = 0xFFFEF1EC ^ 0x10E35;
        q_0.K[0xE42D ^ 0xE496] = 0xFFFF1B12 ^ 0xE496;
        q_0.K[0x4246 ^ 0x435E] = 0x6377 ^ 0x435E;
        q_0.K[0xD355 ^ 0xD2D2] = 0x4E56 ^ 0xD2D2;
        q_0.K[0x46EA ^ 0x47CA] = 0xFE2D ^ 0x47CA;
        q_0.K[0x56C8 ^ 0x5644] = 0x562E ^ 0x5644;
        q_0.K[0xDABF ^ 0xDB31] = 0x29E5 ^ 0xDB31;
        q_0.K[0xDEEA ^ 0xDE9D] = 0xDE9C ^ 0xDE9D;
        q_0.K[0x1F79 ^ 0x1E20] = 0xFFFFFB1D ^ 0x1E20;
        q_0.K[0x9F1 ^ 0x9BA] = 0xFFFFF662 ^ 0x9BA;
        q_0.K[0xD799 ^ 0xD6A2] = 0xEDCE ^ 0xD6A2;
        q_0.K[0x9958 ^ 0x9826] = 0x973C ^ 0x9826;
        q_0.K[0x262C ^ 0x2721] = 0x6435 ^ 0x2721;
        q_0.K[0x7A88 ^ 0x7BF9] = 0xFFFFDCBF ^ 0x7BF9;
        q_0.K[0x68EA ^ 0x6880] = 0x68C2 ^ 0x6880;
        q_0.K[0x10555 ^ 0x105A0] = 0x105A2 ^ 0x105A0;
        q_0.K[0xE646 ^ 0xE61F] = 0xE64C ^ 0xE61F;
        q_0.K[0xF082 ^ 0xF1DA] = 0xEB3C ^ 0xF1DA;
        q_0.K[0xC9E5 ^ 0xC998] = 0x3138 ^ 0xC998;
        q_0.K[0xC992 ^ 0xC959] = 0xC96E ^ 0xC959;
        q_0.K[0x8FBD ^ 0x8FDA] = 0xFFFF7016 ^ 0x8FDA;
        q_0.K[0xCFD6 ^ 0xCE93] = 0xFFFFA88A ^ 0xCE93;
        q_0.K[0x2C14 ^ 0x2C61] = 0x2C62 ^ 0x2C61;
        q_0.K[0xCB0F ^ 0xCA5B] = 0x938E ^ 0xCA5B;
        q_0.K[0xED1C ^ 0xEDA9] = 0xEDFA ^ 0xEDA9;
        q_0.K[0x7848 ^ 0x7884] = 0xFFFF8705 ^ 0x7884;
        q_0.K[0x1A27 ^ 0x1AAA] = 0x1AC6 ^ 0x1AAA;
        q_0.K[0x847C ^ 0x8558] = 0xB01D ^ 0x8558;
        q_0.K[0x1AC3 ^ 0x1B90] = 0x424D ^ 0x1B90;
        q_0.K[0xA706 ^ 0xA70F] = 0xFFFF588D ^ 0xA70F;
        q_0.K[0x10A8F ^ 0x10B95] = 0x12BEA ^ 0x10B95;
        q_0.K[0x10339 ^ 0x1038B] = 0x10362 ^ 0x1038B;
        q_0.K[0xB7D1 ^ 0xB6E2] = 0xB037 ^ 0xB6E2;
        q_0.K[0x1ABA ^ 0x1A35] = 0x1A34 ^ 0x1A35;
        q_0.K[0x2A5C ^ 0x2A22] = 0x10C2 ^ 0x2A22;
        q_0.K[0xA315 ^ 0xA21C] = 0xB8AC ^ 0xA21C;
        q_0.K[0x41C0 ^ 0x41F1] = 0xFFFFBE2C ^ 0x41F1;
        q_0.K[0xDAE7 ^ 0xDADD] = 0xDA89 ^ 0xDADD;
        q_0.K[0xD505 ^ 0xD479] = 0xDB63 ^ 0xD479;
        q_0.K[0x79DA ^ 0x79EF] = 0xFFFF8625 ^ 0x79EF;
        q_0.K[0x2597 ^ 0x2591] = 0xFFFFDA2D ^ 0x2591;
        q_0.K[0x5D12 ^ 0x5C40] = 0x19AD ^ 0x5C40;
        q_0.K[0x2763 ^ 0x2617] = 0x188B ^ 0x2617;
        q_0.K[0x233D ^ 0x23E7] = 0xFFFFDC0B ^ 0x23E7;
        q_0.K[0x3F30 ^ 0x3F9E] = 0x3FC1 ^ 0x3F9E;
        q_0.K[0xE14D ^ 0xE046] = 0xFAF6 ^ 0xE046;
        q_0.K[0x90CE ^ 0x9044] = 0x9044 ^ 0x9044;
        q_0.K[0x7323 ^ 0x7313] = 0x7383 ^ 0x7313;
        q_0.K[0xB8AF ^ 0xB98A] = 0x8CC4 ^ 0xB98A;
        q_0.K[0x1F50 ^ 0x1FF1] = 0x1FD5 ^ 0x1FF1;
        q_0.K[0x109A5 ^ 0x108AD] = 0x1121D ^ 0x108AD;
        q_0.K[0x60A6 ^ 0x6056] = 0xFFFF9FF1 ^ 0x6056;
        q_0.K[0x3B7C ^ 0x3AFA] = 0x3116 ^ 0x3AFA;
        q_0.K[0x1D85 ^ 0x1D6E] = 0xFFFFE2CF ^ 0x1D6E;
        q_0.K[0x10458 ^ 0x10461] = 0xFFFEFBF1 ^ 0x10461;
        q_0.K[0xF579 ^ 0xF505] = 0xF49D ^ 0xF505;
        q_0.K[0x463F ^ 0x46A9] = 0x469A ^ 0x46A9;
        q_0.K[0xDB3C ^ 0xDB29] = 0xFFFF24C1 ^ 0xDB29;
        q_0.K[0x9BDC ^ 0x9AF4] = 0x9D74 ^ 0x9AF4;
        q_0.K[0x24D2 ^ 0x25D4] = 0xFFFFA0F9 ^ 0x25D4;
        q_0.K[0x9A3E ^ 0x9B15] = 0x9C9B ^ 0x9B15;
        q_0.K[0x160C ^ 0x1747] = 0x59C1 ^ 0x1747;
        q_0.K[0x7078 ^ 0x707F] = 0x701C ^ 0x707F;
        q_0.K[0x3BEB ^ 0x3AF4] = 0xAE83 ^ 0x3AF4;
        q_0.K[0xBED9 ^ 0xBEF4] = 0xFFFF4107 ^ 0xBEF4;
        q_0.K[0x3174 ^ 0x3143] = 0xFFFFCEE9 ^ 0x3143;
        q_0.K[0xF317 ^ 0xF29C] = 0x41 ^ 0xF29C;
        q_0.K[0xDC16 ^ 0xDC02] = 0xDC66 ^ 0xDC02;
        q_0.K[0xB6B ^ 0xA0C] = 0x1F6C ^ 0xA0C;
        q_0.K[0xA568 ^ 0xA52D] = 0xA55B ^ 0xA52D;
        q_0.K[0x27C0 ^ 0x2781] = 0x27A5 ^ 0x2781;
        q_0.K[0xB3F5 ^ 0xB370] = 0x43C2 ^ 0xB370;
        q_0.K[0x7386 ^ 0x73F5] = 0x7387 ^ 0x73F5;
        q_0.K[0x43D0 ^ 0x42AD] = 0x4D8C ^ 0x42AD;
        q_0.K[0xEF4D ^ 0xEEC1] = 0x1C15 ^ 0xEEC1;
        q_0.K[0xE2D5 ^ 0xE35C] = 0xFFFF805A ^ 0xE35C;
        q_0.K[0x68F9 ^ 0x68FC] = 0x68D8 ^ 0x68FC;
        q_0.K[0xEBF6 ^ 0xEABC] = 0xF967 ^ 0xEABC;
        q_0.K[0xB0DB ^ 0xB028] = 0xFFFF4FA9 ^ 0xB028;
        q_0.K[0xF7A8 ^ 0xF76F] = 0xF728 ^ 0xF76F;
        q_0.K[0xE8D3 ^ 0xE9EA] = 0xD286 ^ 0xE9EA;
        q_0.K[0x926B ^ 0x9349] = 0xFFFFD55D ^ 0x9349;
        q_0.K[0xE105 ^ 0xE1E5] = 0xFFFF1E4D ^ 0xE1E5;
        q_0.K[0x1091D ^ 0x109C4] = 0x10956 ^ 0x109C4;
        q_0.K[0xAEC8 ^ 0xAE1E] = 0xAE8B ^ 0xAE1E;
        q_0.K[0xD78C ^ 0xD7B1] = 0xFFFF2875 ^ 0xD7B1;
        q_0.K[0x1745 ^ 0x1666] = 0xAF8C ^ 0x1666;
        q_0.K[0x4C3D ^ 0x4D03] = 0xA717 ^ 0x4D03;
        q_0.K[0xD16B ^ 0xD1AF] = 0xFFFF2E2D ^ 0xD1AF;
        q_0.K[0x6548 ^ 0x6517] = 0xFFFF9AB7 ^ 0x6517;
        q_0.K[0x2470 ^ 0x25F8] = 0xB973 ^ 0x25F8;
        q_0.K[0xA3D4 ^ 0xA323] = 0xA322 ^ 0xA323;
        q_0.K[0xB8E1 ^ 0xB98F] = 0xB731 ^ 0xB98F;
        q_0.K[0xFF51 ^ 0xFF19] = 0xFE16 ^ 0xFF19;
        q_0.K[0x5AD1 ^ 0x5BA9] = 0x1ED5 ^ 0x5BA9;
        q_0.K[0xA247 ^ 0xA3C4] = 0xA82E ^ 0xA3C4;
        q_0.K[0x3C27 ^ 0x3C24] = 0xFFFFC380 ^ 0x3C24;
        q_0.K[0xB8F1 ^ 0xB8ED] = 0xFFFF475B ^ 0xB8ED;
        q_0.K[0x4F08 ^ 0x4F2D] = 0x4F79 ^ 0x4F2D;
        q_0.K[0x1B3D ^ 0x1A6B] = 0x43BE ^ 0x1A6B;
        q_0.K[0x28F8 ^ 0x299E] = 0x9AD8 ^ 0x299E;
        q_0.K[0xAA54 ^ 0xAA2E] = 0xAA2E ^ 0xAA2E;
    }
}

