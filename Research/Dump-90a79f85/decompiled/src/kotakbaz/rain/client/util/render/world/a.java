/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_238
 *  net.minecraft.class_4587
 *  net.minecraft.class_4587$class_4665
 *  net.minecraft.class_4588
 *  net.minecraft.class_9974
 */
package kotakbaz.rain.client.util.render.world;

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
import kotakbaz.rain.event.events.B;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import net.minecraft.class_238;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import net.minecraft.class_9974;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003Ja\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011\u00a2\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\b\u0017\u0010\u0018J_\u0010!\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\b!\u0010\"Jg\u0010#\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\b#\u0010$Jg\u0010%\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\b%\u0010$J_\u0010&\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\b&\u0010\"JW\u0010'\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\b'\u0010(J\u0087\u0001\u0010/\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u00112\u0006\u0010)\u001a\u00020\u00112\u0006\u0010*\u001a\u00020\u00112\u0006\u0010+\u001a\u00020\u00112\u0006\u0010,\u001a\u00020\u00112\u0006\u0010-\u001a\u00020\u00112\u0006\u0010.\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\b/\u00100R\u0014\u00101\u001a\u00020\u00118\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b1\u00102R\u0014\u00103\u001a\u00020\u00118\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b3\u00102R\u0014\u00104\u001a\u00020\u00118\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b4\u00102\u00a8\u00065"}, d2={"Lkotakbaz/rain/client/util/render/world/CustomHitBoxRenderer;", "", "<init>", "()V", "Lkotakbaz/rain/event/events/Render3DEvent;", "event", "Lnet/minecraft/class_4588;", "buffer", "lineBuffer", "Lnet/minecraft/class_238;", "box", "Ljava/awt/Color;", "color", "", "filled", "outlined", "striped", "", "lineWidth", "gapDistance", "", "draw", "(Lkotakbaz/rain/event/events/Render3DEvent;Lnet/minecraft/class_4588;Lnet/minecraft/class_4588;Lnet/minecraft/class_238;Ljava/awt/Color;ZZZFF)V", "drawLineBox", "(Lkotakbaz/rain/event/events/Render3DEvent;Lnet/minecraft/class_4588;Lnet/minecraft/class_238;Ljava/awt/Color;)V", "Lnet/minecraft/class_4587$class_4665;", "entry", "x1", "y1", "z1", "x2", "y2", "z2", "emitOutline", "(Lnet/minecraft/class_4588;Lnet/minecraft/class_4587$class_4665;FFFFFFLjava/awt/Color;F)V", "emitStriped", "(Lnet/minecraft/class_4588;Lnet/minecraft/class_4587$class_4665;FFFFFFLjava/awt/Color;FF)V", "emitStripedLine", "emitLine", "emitSolidBox", "(Lnet/minecraft/class_4588;Lnet/minecraft/class_4587$class_4665;FFFFFFLjava/awt/Color;)V", "x3", "y3", "z3", "x4", "y4", "z4", "vertexQuad", "(Lnet/minecraft/class_4588;Lnet/minecraft/class_4587$class_4665;FFFFFFFFFFFFLjava/awt/Color;)V", "MIN_SEGMENT_LENGTH", "F", "MIN_THICKNESS", "THICKNESS_SCALE", "rain-visuals"})
@SourceDebugExtension(value={"SMAP\nCustomHitBoxRenderer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomHitBoxRenderer.kt\nkotakbaz/rain/client/util/render/world/CustomHitBoxRenderer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,262:1\n1#2:263\n*E\n"})
public final class a {
    @NotNull
    public static final a INSTANCE;
    private static final float a = 0.001f;
    private static final float A = 0.002f;
    private static final float b = 0.005f;
    private static Object[] B;
    private static Object C;
    private static Object[] d;
    private static Object[] c;
    private static Object[] D;
    public static int[] e;

    private a() {
        super();
    }

    public final void draw(@NotNull B b2, @NotNull class_4588 class_45882, @Nullable class_4588 class_45883, @NotNull class_238 class_2382, @NotNull Color color, boolean bl, boolean bl2, boolean bl3, float f2, float f3) {
        long l = -5206582071761003406L;
        long l2 = -7613565338873262587L;
        int n = e[0];
        n ^= e[1];
        Intrinsics.checkNotNullParameter(b2, (String)B[n -= e[2]]);
        int n2 = e[3];
        n2 -= e[4];
        Intrinsics.checkNotNullParameter(class_45882, (String)B[n2 += e[5]]);
        int n3 = e[6];
        n3 += e[7];
        Intrinsics.checkNotNullParameter(class_2382, (String)B[n3 += e[8]]);
        int n4 = e[9];
        n4 ^= e[10];
        Intrinsics.checkNotNullParameter(color, (String)B[n4 ^= e[11]]);
        if (color.getAlpha() <= 0) {
            return;
        }
        class_4587.class_4665 class_46652 = b2.getMatrices().method_23760();
        float f4 = (float)class_2382.field_1323;
        float f5 = (float)class_2382.field_1322;
        float f6 = (float)class_2382.field_1321;
        float f7 = (float)class_2382.field_1320;
        float f8 = (float)class_2382.field_1325;
        float f9 = (float)class_2382.field_1324;
        if (bl) {
            int n5;
            int n6 = e[12];
            n6 += e[13];
            int n7 = color.getAlpha() / (n6 ^= e[14]);
            if (color.getAlpha() > 0) {
                int n8 = e[15];
                n8 ^= e[16];
                n5 = n8 -= e[17];
            } else {
                int n9 = e[18];
                n9 += e[19];
                n5 = n9 += e[20];
            }
            int n10 = e[21];
            n10 -= e[22];
            long l3 = l;
            int n11 = e[24];
            n11 -= e[25];
            l = l3 ^ ((long)RangesKt.coerceAtLeast(n7, n5) << (n10 -= e[23]) ^ l3) & -1L << (n11 ^= e[26]);
            Intrinsics.checkNotNull(class_46652);
            int n12 = e[27];
            n12 -= e[28];
            this.emitSolidBox(class_45882, class_46652, f4, f5, f6, f7, f8, f9, new Color(color.getRed(), color.getGreen(), color.getBlue(), (int)(l >>> (n12 -= e[29]))));
        }
        if (bl2) {
            class_4588 class_45884 = class_45883;
            if (class_45884 != null) {
                class_4588 class_45885 = class_45884;
                long l4 = l2;
                int n13 = e[30];
                n13 ^= e[31];
                l2 = l4 ^ (0L ^ l4) & -1L << (n13 -= e[32]);
                INSTANCE.drawLineBox(b2, class_45885, class_2382, color);
            } else {
                Intrinsics.checkNotNull(class_46652);
                this.emitOutline(class_45882, class_46652, f4, f5, f6, f7, f8, f9, color, f2);
            }
        }
        if (bl3) {
            Intrinsics.checkNotNull(class_46652);
            this.emitStriped(class_45882, class_46652, f4, f5, f6, f7, f8, f9, color, f2, f3);
        }
    }

    public static /* synthetic */ void draw$default(a a2, B b2, class_4588 class_45882, class_4588 class_45883, class_238 class_2382, Color color, boolean bl, boolean bl2, boolean bl3, float f2, float f3, int n, Object object) {
        int n2 = e[33];
        n2 -= e[34];
        if ((n & (n2 -= e[35])) != 0) {
            class_45883 = null;
        }
        a2.draw(b2, class_45882, class_45883, class_2382, color, bl, bl2, bl3, f2, f3);
    }

    private final void drawLineBox(B b2, class_4588 class_45882, class_238 class_2382, Color color) {
        class_9974.method_62295((class_4587)b2.getMatrices(), (class_4588)class_45882, (class_238)class_2382, (float)((float)color.getRed() / 255.0f), (float)((float)color.getGreen() / 255.0f), (float)((float)color.getBlue() / 255.0f), (float)((float)color.getAlpha() / 255.0f));
    }

    private final void emitOutline(class_4588 class_45882, class_4587.class_4665 class_46652, float f2, float f3, float f4, float f5, float f6, float f7, Color color, float f8) {
        this.emitLine(class_45882, class_46652, f2, f3, f4, f5, f3, f4, color, f8);
        this.emitLine(class_45882, class_46652, f5, f3, f4, f5, f3, f7, color, f8);
        this.emitLine(class_45882, class_46652, f5, f3, f7, f2, f3, f7, color, f8);
        this.emitLine(class_45882, class_46652, f2, f3, f7, f2, f3, f4, color, f8);
        this.emitLine(class_45882, class_46652, f2, f6, f4, f5, f6, f4, color, f8);
        this.emitLine(class_45882, class_46652, f5, f6, f4, f5, f6, f7, color, f8);
        this.emitLine(class_45882, class_46652, f5, f6, f7, f2, f6, f7, color, f8);
        this.emitLine(class_45882, class_46652, f2, f6, f7, f2, f6, f4, color, f8);
        this.emitLine(class_45882, class_46652, f2, f3, f4, f2, f6, f4, color, f8);
        this.emitLine(class_45882, class_46652, f5, f3, f4, f5, f6, f4, color, f8);
        this.emitLine(class_45882, class_46652, f2, f3, f7, f2, f6, f7, color, f8);
        this.emitLine(class_45882, class_46652, f5, f3, f7, f5, f6, f7, color, f8);
    }

    private final void emitStriped(class_4588 class_45882, class_4587.class_4665 class_46652, float f2, float f3, float f4, float f5, float f6, float f7, Color color, float f8, float f9) {
        this.emitStripedLine(class_45882, class_46652, f2, f3, f4, f5, f3, f4, color, f8, f9);
        this.emitStripedLine(class_45882, class_46652, f5, f3, f4, f5, f3, f7, color, f8, f9);
        this.emitStripedLine(class_45882, class_46652, f5, f3, f7, f2, f3, f7, color, f8, f9);
        this.emitStripedLine(class_45882, class_46652, f2, f3, f7, f2, f3, f4, color, f8, f9);
        this.emitStripedLine(class_45882, class_46652, f2, f6, f4, f5, f6, f4, color, f8, f9);
        this.emitStripedLine(class_45882, class_46652, f5, f6, f4, f5, f6, f7, color, f8, f9);
        this.emitStripedLine(class_45882, class_46652, f5, f6, f7, f2, f6, f7, color, f8, f9);
        this.emitStripedLine(class_45882, class_46652, f2, f6, f7, f2, f6, f4, color, f8, f9);
        this.emitStripedLine(class_45882, class_46652, f2, f3, f4, f2, f6, f4, color, f8, f9);
        this.emitStripedLine(class_45882, class_46652, f5, f3, f4, f5, f6, f4, color, f8, f9);
        this.emitStripedLine(class_45882, class_46652, f2, f3, f7, f2, f6, f7, color, f8, f9);
        this.emitStripedLine(class_45882, class_46652, f5, f3, f7, f5, f6, f7, color, f8, f9);
    }

    private final void emitStripedLine(class_4588 class_45882, class_4587.class_4665 class_46652, float f2, float f3, float f4, float f5, float f6, float f7, Color color, float f8, float f9) {
        if (f9 <= 0.0f) {
            this.emitLine(class_45882, class_46652, f2, f3, f4, f5, f6, f7, color, f8);
            return;
        }
        float f10 = f5 - f2;
        float f11 = f6 - f3;
        float f12 = f7 - f4;
        float f13 = (float)Math.sqrt(f10 * f10 + f11 * f11 + f12 * f12);
        if (f13 < 0.001f) {
            return;
        }
        float f14 = RangesKt.coerceAtLeast(f9, 0.01f);
        float f15 = f14 / f13;
        float f16 = 0.0f;
        while (f16 < 1.0f) {
            float f17 = Math.min(f16 + f15, 1.0f);
            if (f17 > f16) {
                this.emitLine(class_45882, class_46652, f2 + f10 * f16, f3 + f11 * f16, f4 + f12 * f16, f2 + f10 * f17, f3 + f11 * f17, f4 + f12 * f17, color, f8);
            }
            f16 = Math.min(f17 + f15, 1.0f);
        }
    }

    private final void emitLine(class_4588 class_45882, class_4587.class_4665 class_46652, float f2, float f3, float f4, float f5, float f6, float f7, Color color, float f8) {
        if (f8 <= 0.0f) {
            return;
        }
        float f9 = Math.abs(f5 - f2);
        float f10 = Math.abs(f6 - f3);
        float f11 = Math.abs(f7 - f4);
        if (f9 <= 0.001f && f10 <= 0.001f && f11 <= 0.001f) {
            return;
        }
        float f12 = Math.max(f8 * 0.005f, 0.002f);
        this.emitSolidBox(class_45882, class_46652, Math.min(f2, f5) - (f9 <= 0.001f ? f12 : 0.0f), Math.min(f3, f6) - (f10 <= 0.001f ? f12 : 0.0f), Math.min(f4, f7) - (f11 <= 0.001f ? f12 : 0.0f), Math.max(f2, f5) + (f9 <= 0.001f ? f12 : 0.0f), Math.max(f3, f6) + (f10 <= 0.001f ? f12 : 0.0f), Math.max(f4, f7) + (f11 <= 0.001f ? f12 : 0.0f), color);
    }

    private final void emitSolidBox(class_4588 class_45882, class_4587.class_4665 class_46652, float f2, float f3, float f4, float f5, float f6, float f7, Color color) {
        this.vertexQuad(class_45882, class_46652, f2, f3, f4, f5, f3, f4, f5, f6, f4, f2, f6, f4, color);
        this.vertexQuad(class_45882, class_46652, f2, f3, f7, f5, f3, f7, f5, f6, f7, f2, f6, f7, color);
        this.vertexQuad(class_45882, class_46652, f2, f3, f4, f2, f3, f7, f2, f6, f7, f2, f6, f4, color);
        this.vertexQuad(class_45882, class_46652, f5, f3, f4, f5, f3, f7, f5, f6, f7, f5, f6, f4, color);
        this.vertexQuad(class_45882, class_46652, f2, f3, f4, f5, f3, f4, f5, f3, f7, f2, f3, f7, color);
        this.vertexQuad(class_45882, class_46652, f2, f6, f4, f5, f6, f4, f5, f6, f7, f2, f6, f7, color);
    }

    private final void vertexQuad(class_4588 class_45882, class_4587.class_4665 class_46652, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, Color color) {
        class_45882.method_56824(class_46652, f2, f3, f4).method_1336(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
        class_45882.method_56824(class_46652, f5, f6, f7).method_1336(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
        class_45882.method_56824(class_46652, f8, f9, f10).method_1336(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
        class_45882.method_56824(class_46652, f11, f12, f13).method_1336(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
    }

    static {
        kotakbaz.rain.client.util.render.world.a.b();
        long l = -7407120648472891074L;
        long l2 = 5199259522558718181L;
        long l3 = -1629635273295525611L;
        long l4 = 7104063033076805044L;
        long l5 = 7424386484927041257L;
        long l6 = -8030242009575350368L;
        long l7 = -8922173954030439065L;
        long l8 = 7208067412985404964L;
        long l9 = 5857470061824536430L;
        long l10 = -522330423819490148L;
        long l11 = 3882748680941435838L;
        long l12 = 7283789088980406043L;
        long l13 = 8644771865959069680L;
        long l14 = -5985922660875609988L;
        int n = e[36];
        n ^= e[37];
        B = new Object[n += e[38]];
        long l15 = l14;
        int n2 = e[39];
        n2 -= e[40];
        l14 = l15 ^ (0L ^ l15) & -1L << (n2 += e[41]);
        Object[] objectArray = new Object[e[42]];
        objectArray[kotakbaz.rain.client.util.render.world.a.e[43]] = c;
        objectArray[kotakbaz.rain.client.util.render.world.a.e[44]] = e[45];
        int n3 = e[46];
        Object object = kotakbaz.rain.client.util.render.world.a.A()[e[47]];
        if (object == null) {
            char[] cArray = "\u697d\u7191\u71b1\u71e3\u6940\u71df\u7194\u71e2\u7195\u7185\u7190\u7196\u71e7\u697c\u7197\u719b\u6944\u71e9\u71e6\u7193\u71f9\u7186\u697b\u7180\u719d\u7185\u71e9\u6971\u7195\u718f\u719a\u7184\u71e5\u6972\u6949\u695a\u7194\u6974\u7183\u693f\u71e7\u6949\u71e9\u719d\u6947\u71e7\u6957\u71e9\u71e4\u6957\u6946\u6949\u697b\u71bd\u6973\u71e2\u6944\u697e\u71fa\u6946\u6970\u6957\u71e9\u6943".toCharArray();
            for (int i = e[48]; i < e[49]; ++i) {
                int n4 = cArray[i];
                n4 -= e[50];
                n4 += e[51];
                n4 ^= e[52];
                n4 += e[53];
                n4 ^= e[54];
                n4 ^= e[55];
                n4 ^= e[56];
                n4 -= e[57];
                n4 += e[58];
                n4 += e[59];
                n4 += e[60];
                n4 += e[61];
                cArray[i] = (char)(n4 += e[62]);
            }
            object = kotakbaz.rain.client.util.render.world.a.A()[kotakbaz.rain.client.util.render.world.a.e[63]] = new String(cArray);
        }
        objectArray[n3] = (String)object;
        char[] cArray = ((String)kotakbaz.rain.client.util.render.world.a.a(objectArray)).toCharArray();
        long l16 = l5;
        int n5 = e[64];
        n5 ^= e[65];
        l5 = l16 ^ (0x1B00000000L ^ l16) & -1L << (n5 -= e[66]);
        long l17 = l12;
        int n6 = e[67];
        n6 ^= e[68];
        l12 = l17 ^ (0L ^ l17) & -1L >>> (n6 += e[69]);
        while (true) {
            int n7 = e[70];
            n7 -= e[71];
            if ((int)l12 >= (int)(l5 >>> (n7 -= e[72]))) break;
            int n8 = (int)l12;
            long l18 = l12;
            int n9 = e[73];
            n9 += e[74];
            int n10 = e[76];
            n10 += e[77];
            l12 = l18 ^ (l18 ^ l18 + (long)(n9 -= e[75])) & -1L >>> (n10 += e[78]);
            long l19 = l8;
            int n11 = e[79];
            n11 -= e[80];
            l8 = l19 ^ ((long)cArray[n8] ^ l19) & -1L >>> (n11 -= e[81]);
            int n12 = (int)l12;
            long l20 = l12;
            int n13 = e[82];
            n13 ^= e[83];
            int n14 = e[85];
            n14 ^= e[86];
            l12 = l20 ^ (l20 ^ l20 + (long)(n13 += e[84])) & -1L >>> (n14 ^= e[87]);
            int n15 = e[88];
            n15 -= e[89];
            long l21 = l9;
            int n16 = e[91];
            n16 ^= e[92];
            l9 = l21 ^ ((long)cArray[n12] << (n15 -= e[90]) ^ l21) & -1L << (n16 ^= e[93]);
            int n17 = e[94];
            n17 ^= e[95];
            n17 -= e[96];
            int n18 = e[97];
            n18 ^= e[98];
            long l22 = l11;
            int n19 = e[100];
            n19 ^= e[101];
            l11 = l22 ^ ((long)((int)l8 << n17 | (int)(l9 >>> (n18 += e[99]))) ^ l22) & -1L >>> (n19 -= e[102]);
            char[] cArray2 = new char[(int)l11];
            long l23 = l13;
            int n20 = e[103];
            n20 ^= e[104];
            l13 = l23 ^ (0L ^ l23) & -1L << (n20 ^= e[105]);
            while (true) {
                int n21 = e[106];
                n21 ^= e[107];
                if ((int)(l13 >>> (n21 -= e[108])) >= (int)l11) break;
                int n22 = e[109];
                n22 -= e[110];
                int n23 = e[112];
                n23 += e[113];
                cArray2[(int)(l13 >>> (n22 ^= kotakbaz.rain.client.util.render.world.a.e[111]))] = cArray[(int)l12 + (int)(l13 >>> (n23 -= e[114]))];
                l13 += 0x100000000L;
            }
            int n24 = e[115];
            n24 -= e[116];
            int n25 = (int)(l14 >>> (n24 += e[117]));
            l14 += 0x100000000L;
            kotakbaz.rain.client.util.render.world.a.B[n25] = new String(cArray2);
            long l24 = l12;
            int n26 = e[118];
            n26 -= e[119];
            l12 = l24 ^ ((long)((int)l12 + (int)l11) ^ l24) & -1L >>> (n26 ^= e[120]);
        }
        INSTANCE = new a();
    }

    public static Object a(Object[] object) {
        Object object2;
        int n = (Integer)object[e[121]];
        String string = (String)object[e[122]];
        object = object[e[123]];
        Object[] objectArray = d;
        if (d == null) {
            objectArray = d = new Object[e[124]];
        }
        if ((object2 = objectArray[n]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[e[125]];
                c = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[e[127] ^ e[128]];
                byArray[kotakbaz.rain.client.util.render.world.a.e[129] ^ kotakbaz.rain.client.util.render.world.a.e[130]] = e[131] ^ e[132];
                byArray[kotakbaz.rain.client.util.render.world.a.e[133] ^ kotakbaz.rain.client.util.render.world.a.e[134]] = e[135] ^ e[136];
                byArray[kotakbaz.rain.client.util.render.world.a.e[137] ^ kotakbaz.rain.client.util.render.world.a.e[138]] = e[139] ^ e[140];
                byArray[kotakbaz.rain.client.util.render.world.a.e[141] ^ kotakbaz.rain.client.util.render.world.a.e[142]] = e[143] ^ e[144];
                byArray[kotakbaz.rain.client.util.render.world.a.e[145] ^ kotakbaz.rain.client.util.render.world.a.e[146]] = e[147] ^ e[148];
                byArray[kotakbaz.rain.client.util.render.world.a.e[149] ^ kotakbaz.rain.client.util.render.world.a.e[150]] = e[151] ^ e[152];
                byArray[kotakbaz.rain.client.util.render.world.a.e[153] ^ kotakbaz.rain.client.util.render.world.a.e[154]] = e[155] ^ e[156];
                byArray[kotakbaz.rain.client.util.render.world.a.e[157] ^ kotakbaz.rain.client.util.render.world.a.e[158]] = e[159] ^ e[160];
                byArray[kotakbaz.rain.client.util.render.world.a.e[161] ^ kotakbaz.rain.client.util.render.world.a.e[162]] = e[163] ^ e[164];
                byArray[kotakbaz.rain.client.util.render.world.a.e[165] ^ kotakbaz.rain.client.util.render.world.a.e[166]] = e[167] ^ e[168];
                byArray[kotakbaz.rain.client.util.render.world.a.e[169] ^ kotakbaz.rain.client.util.render.world.a.e[170]] = e[171] ^ e[172];
                byArray[kotakbaz.rain.client.util.render.world.a.e[173] ^ kotakbaz.rain.client.util.render.world.a.e[174]] = e[175] ^ e[176];
                byArray[kotakbaz.rain.client.util.render.world.a.e[177] ^ kotakbaz.rain.client.util.render.world.a.e[178]] = e[179] ^ e[180];
                byArray[kotakbaz.rain.client.util.render.world.a.e[181] ^ kotakbaz.rain.client.util.render.world.a.e[182]] = e[183] ^ e[184];
                byArray[kotakbaz.rain.client.util.render.world.a.e[185] ^ kotakbaz.rain.client.util.render.world.a.e[186]] = e[187] ^ e[188];
                byArray[kotakbaz.rain.client.util.render.world.a.e[189] ^ kotakbaz.rain.client.util.render.world.a.e[190]] = e[191] ^ e[192];
                objectArray2[kotakbaz.rain.client.util.render.world.a.e[126]] = byArray;
            }
            byte[] byArray = (byte[])object3[e[193]];
            if (C == null) {
                byte[] byArray2 = new byte[e[194] ^ e[195]];
                byArray2[kotakbaz.rain.client.util.render.world.a.e[196] ^ kotakbaz.rain.client.util.render.world.a.e[197]] = e[198] ^ e[199];
                byArray2[kotakbaz.rain.client.util.render.world.a.e[200] ^ kotakbaz.rain.client.util.render.world.a.e[201]] = e[202] ^ e[203];
                byArray2[kotakbaz.rain.client.util.render.world.a.e[204] ^ kotakbaz.rain.client.util.render.world.a.e[205]] = e[206] ^ e[207];
                byArray2[kotakbaz.rain.client.util.render.world.a.e[208] ^ kotakbaz.rain.client.util.render.world.a.e[209]] = e[210] ^ e[211];
                byArray2[kotakbaz.rain.client.util.render.world.a.e[212] ^ kotakbaz.rain.client.util.render.world.a.e[213]] = e[214] ^ e[215];
                byArray2[kotakbaz.rain.client.util.render.world.a.e[216] ^ kotakbaz.rain.client.util.render.world.a.e[217]] = e[218] ^ e[219];
                byArray2[kotakbaz.rain.client.util.render.world.a.e[220] ^ kotakbaz.rain.client.util.render.world.a.e[221]] = e[222] ^ e[223];
                byArray2[kotakbaz.rain.client.util.render.world.a.e[224] ^ kotakbaz.rain.client.util.render.world.a.e[225]] = e[226] ^ e[227];
                byArray2[kotakbaz.rain.client.util.render.world.a.e[228] ^ kotakbaz.rain.client.util.render.world.a.e[229]] = e[230] ^ e[231];
                byArray2[kotakbaz.rain.client.util.render.world.a.e[232] ^ kotakbaz.rain.client.util.render.world.a.e[233]] = e[234] ^ e[235];
                byArray2[kotakbaz.rain.client.util.render.world.a.e[236] ^ kotakbaz.rain.client.util.render.world.a.e[237]] = e[238] ^ e[239];
                byArray2[kotakbaz.rain.client.util.render.world.a.e[240] ^ kotakbaz.rain.client.util.render.world.a.e[241]] = e[242] ^ e[243];
                byArray2[kotakbaz.rain.client.util.render.world.a.e[244] ^ kotakbaz.rain.client.util.render.world.a.e[245]] = e[246] ^ e[247];
                byArray2[kotakbaz.rain.client.util.render.world.a.e[248] ^ kotakbaz.rain.client.util.render.world.a.e[249]] = e[250] ^ e[251];
                byArray2[kotakbaz.rain.client.util.render.world.a.e[252] ^ kotakbaz.rain.client.util.render.world.a.e[253]] = e[254] ^ e[255];
                byArray2[kotakbaz.rain.client.util.render.world.a.e[256] ^ kotakbaz.rain.client.util.render.world.a.e[257]] = e[258] ^ e[259];
                byArray2[kotakbaz.rain.client.util.render.world.a.e[260] ^ kotakbaz.rain.client.util.render.world.a.e[261]] = e[262] ^ e[263];
                byArray2[kotakbaz.rain.client.util.render.world.a.e[264] ^ kotakbaz.rain.client.util.render.world.a.e[265]] = e[266] ^ e[267];
                byArray2[kotakbaz.rain.client.util.render.world.a.e[268] ^ kotakbaz.rain.client.util.render.world.a.e[269]] = e[270] ^ e[271];
                byArray2[kotakbaz.rain.client.util.render.world.a.e[272] ^ kotakbaz.rain.client.util.render.world.a.e[273]] = e[274] ^ e[275];
                byArray2[kotakbaz.rain.client.util.render.world.a.e[276] ^ kotakbaz.rain.client.util.render.world.a.e[277]] = e[278] ^ e[279];
                byArray2[kotakbaz.rain.client.util.render.world.a.e[280] ^ kotakbaz.rain.client.util.render.world.a.e[281]] = e[282] ^ e[283];
                byArray2[kotakbaz.rain.client.util.render.world.a.e[284] ^ kotakbaz.rain.client.util.render.world.a.e[285]] = e[286] ^ e[287];
                byArray2[kotakbaz.rain.client.util.render.world.a.e[288] ^ kotakbaz.rain.client.util.render.world.a.e[289]] = e[290] ^ e[291];
                byArray2[kotakbaz.rain.client.util.render.world.a.e[292] ^ kotakbaz.rain.client.util.render.world.a.e[293]] = e[294] ^ e[295];
                byArray2[kotakbaz.rain.client.util.render.world.a.e[296] ^ kotakbaz.rain.client.util.render.world.a.e[297]] = e[298] ^ e[299];
                byArray2[kotakbaz.rain.client.util.render.world.a.e[300] ^ kotakbaz.rain.client.util.render.world.a.e[301]] = e[302] ^ e[303];
                byArray2[kotakbaz.rain.client.util.render.world.a.e[304] ^ kotakbaz.rain.client.util.render.world.a.e[305]] = e[306] ^ e[307];
                byArray2[kotakbaz.rain.client.util.render.world.a.e[308] ^ kotakbaz.rain.client.util.render.world.a.e[309]] = e[310] ^ e[311];
                byArray2[kotakbaz.rain.client.util.render.world.a.e[312] ^ kotakbaz.rain.client.util.render.world.a.e[313]] = e[314] ^ e[315];
                byArray2[kotakbaz.rain.client.util.render.world.a.e[316] ^ kotakbaz.rain.client.util.render.world.a.e[317]] = e[318] ^ e[319];
                byArray2[kotakbaz.rain.client.util.render.world.a.e[320] ^ kotakbaz.rain.client.util.render.world.a.e[321]] = e[322] ^ e[323];
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, e[324], byArray3, e[325], byArray.length);
                System.arraycopy(byArray2, e[326], byArray3, byArray.length, byArray2.length);
                Object object4 = kotakbaz.rain.client.util.render.world.a.A()[e[327]];
                if (object4 == null) {
                    char[] cArray = "\u08d1\u0907\u08fc\u0905\u08fb\u08f7\u08d8\u08de\u0835\u08d9\u08f9\u0832\u08e6\u08e4\u08d4\u08f9\u0906\u08f6".toCharArray();
                    for (int i = e[328]; i < e[329]; ++i) {
                        int n2 = cArray[i];
                        n2 -= e[330];
                        n2 += e[331];
                        n2 -= e[332];
                        n2 -= e[333];
                        n2 ^= e[334];
                        n2 -= e[335];
                        n2 ^= e[336];
                        n2 ^= e[337];
                        n2 += e[338];
                        n2 -= e[339];
                        n2 += e[340];
                        n2 -= e[341];
                        cArray[i] = (char)(n2 += e[342]);
                    }
                    object4 = kotakbaz.rain.client.util.render.world.a.A()[kotakbaz.rain.client.util.render.world.a.e[343]] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[e[344]];
                byArray4[kotakbaz.rain.client.util.render.world.a.e[345]] = e[346];
                byArray4[kotakbaz.rain.client.util.render.world.a.e[347]] = e[348];
                byArray4[kotakbaz.rain.client.util.render.world.a.e[349]] = e[350];
                byArray4[kotakbaz.rain.client.util.render.world.a.e[351]] = e[352];
                byArray4[kotakbaz.rain.client.util.render.world.a.e[353]] = e[354];
                byArray4[kotakbaz.rain.client.util.render.world.a.e[355]] = e[356];
                byArray4[kotakbaz.rain.client.util.render.world.a.e[357]] = e[358];
                byArray4[kotakbaz.rain.client.util.render.world.a.e[359]] = e[360];
                byArray4[kotakbaz.rain.client.util.render.world.a.e[361]] = e[362];
                byArray4[kotakbaz.rain.client.util.render.world.a.e[363]] = e[364];
                byArray4[kotakbaz.rain.client.util.render.world.a.e[365]] = e[366];
                byArray4[kotakbaz.rain.client.util.render.world.a.e[367]] = e[368];
                byArray4[kotakbaz.rain.client.util.render.world.a.e[369]] = e[370];
                byArray4[kotakbaz.rain.client.util.render.world.a.e[371]] = e[372];
                byArray4[kotakbaz.rain.client.util.render.world.a.e[373]] = e[374];
                byArray4[kotakbaz.rain.client.util.render.world.a.e[375]] = e[376];
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, e[377], e[378]);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = kotakbaz.rain.client.util.render.world.a.A()[e[379]];
                if (object5 == null) {
                    char[] cArray = "\ufff1\ufc5d\ufc5f".toCharArray();
                    for (int i = e[380]; i < e[381]; ++i) {
                        int n3 = cArray[i];
                        n3 ^= e[382];
                        n3 += e[383];
                        n3 += e[384];
                        n3 ^= e[385];
                        n3 -= e[386];
                        n3 ^= e[387];
                        n3 ^= e[388];
                        n3 += e[389];
                        n3 ^= e[390];
                        n3 += e[391];
                        n3 += e[392];
                        n3 += e[393];
                        cArray[i] = (char)(n3 -= e[394]);
                    }
                    object5 = kotakbaz.rain.client.util.render.world.a.A()[kotakbaz.rain.client.util.render.world.a.e[395]] = new String(cArray);
                }
                C = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, e[396], e[397]);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, e[398], byArray6.length);
            Object object6 = kotakbaz.rain.client.util.render.world.a.A()[e[399]];
            if (object6 == null) {
                char[] cArray = "\uf9f2\uf9e6\uf994\uf990\uf9e4\uf9e7\uf9e4\uf990\uf9e5\uf9ec\uf9e4\uf994\ufe36\uf9e5\ufe52\uf9c9\uf9c9\ufe5a\ufe53\uf9c8".toCharArray();
                for (int i = 0; i < 20; ++i) {
                    int n4 = cArray[i];
                    n4 ^= 0x7221;
                    n4 += 49363;
                    n4 ^= 0x5154;
                    n4 ^= 0x8F45;
                    n4 ^= 0x6657;
                    n4 -= 50696;
                    n4 += 17801;
                    n4 -= 28683;
                    n4 ^= 0x1BAB;
                    n4 ^= 0xECBB;
                    n4 ^= 0xF3FB;
                    cArray[i] = (char)(n4 ^= 0xFC);
                }
                object6 = kotakbaz.rain.client.util.render.world.a.A()[3] = new String(cArray);
            }
            Cipher cipher = Cipher.getInstance((String)object6);
            cipher.init(2, (Key)((SecretKey)C), new IvParameterSpec(byArray7));
            byte[] byArray9 = cipher.doFinal(byArray8);
            object2 = new String(byArray9, StandardCharsets.UTF_8);
        }
        return object2;
    }

    private static Object[] A() {
        Object[] objectArray = D;
        if (D == null) {
            D = new Object[4];
            objectArray = D;
        }
        return objectArray;
    }

    public static void b() {
        e = new int[0x3148 ^ 0x30D8];
        kotakbaz.rain.client.util.render.world.a.e[0xDD15 ^ 0xDDD7] = 0xBCE0 ^ 0xDDD7;
        kotakbaz.rain.client.util.render.world.a.e[0xACAC ^ 0xACCD] = 0xFFFF5312 ^ 0xACCD;
        kotakbaz.rain.client.util.render.world.a.e[0xEA74 ^ 0xEA1C] = 0xFFFF1583 ^ 0xEA1C;
        kotakbaz.rain.client.util.render.world.a.e[0x9A1F ^ 0x9A67] = 0xFFFF65CF ^ 0x9A67;
        kotakbaz.rain.client.util.render.world.a.e[0xEE6F ^ 0xEEC4] = 0xB05E ^ 0xEEC4;
        kotakbaz.rain.client.util.render.world.a.e[0x480B ^ 0x48E8] = 0x3A46 ^ 0x48E8;
        kotakbaz.rain.client.util.render.world.a.e[0x4718 ^ 0x4637] = 0x7D3C ^ 0x4637;
        kotakbaz.rain.client.util.render.world.a.e[0x6719 ^ 0x676E] = 0xFFFF9893 ^ 0x676E;
        kotakbaz.rain.client.util.render.world.a.e[0x24C1 ^ 0x2411] = 0x8462 ^ 0x2411;
        kotakbaz.rain.client.util.render.world.a.e[0x44E5 ^ 0x441E] = 0x7DB1 ^ 0x441E;
        kotakbaz.rain.client.util.render.world.a.e[0x8DDC ^ 0x8D85] = 0x8DAC ^ 0x8D85;
        kotakbaz.rain.client.util.render.world.a.e[0xD481 ^ 0xD4B8] = 0x3A8C ^ 0xD4B8;
        kotakbaz.rain.client.util.render.world.a.e[0xFC1B ^ 0xFCF3] = 0xD802 ^ 0xFCF3;
        kotakbaz.rain.client.util.render.world.a.e[0x9B04 ^ 0x9BE6] = 0xE932 ^ 0x9BE6;
        kotakbaz.rain.client.util.render.world.a.e[0xC680 ^ 0xC630] = 0x9CC6 ^ 0xC630;
        kotakbaz.rain.client.util.render.world.a.e[0x1071D ^ 0x107B3] = 0x15D45 ^ 0x107B3;
        kotakbaz.rain.client.util.render.world.a.e[0x13A5 ^ 0x12FA] = 0x12FE ^ 0x12FA;
        kotakbaz.rain.client.util.render.world.a.e[0x3938 ^ 0x3860] = 0x3870 ^ 0x3860;
        kotakbaz.rain.client.util.render.world.a.e[0xEC20 ^ 0xEC0B] = 0xEC0B ^ 0xEC0B;
        kotakbaz.rain.client.util.render.world.a.e[0x6ECB ^ 0x6FA5] = 0x6FC9 ^ 0x6FA5;
        kotakbaz.rain.client.util.render.world.a.e[0xC71D ^ 0xC727] = 0x79D3 ^ 0xC727;
        kotakbaz.rain.client.util.render.world.a.e[0x6B61 ^ 0x6A5D] = 0x13DB ^ 0x6A5D;
        kotakbaz.rain.client.util.render.world.a.e[0xA27A ^ 0xA335] = 0x3A1E ^ 0xA335;
        kotakbaz.rain.client.util.render.world.a.e[0x10110 ^ 0x101D8] = 0x351 ^ 0x101D8;
        kotakbaz.rain.client.util.render.world.a.e[0x1346 ^ 0x1207] = 0x75CD ^ 0x1207;
        kotakbaz.rain.client.util.render.world.a.e[0xAEF3 ^ 0xAE1F] = 0x1D82 ^ 0xAE1F;
        kotakbaz.rain.client.util.render.world.a.e[0x6EB1 ^ 0x6E33] = 0xE351 ^ 0x6E33;
        kotakbaz.rain.client.util.render.world.a.e[0x45ED ^ 0x4485] = 0x448D ^ 0x4485;
        kotakbaz.rain.client.util.render.world.a.e[0xEA28 ^ 0xEABA] = 0xBFD6 ^ 0xEABA;
        kotakbaz.rain.client.util.render.world.a.e[0x8D89 ^ 0x8CB8] = 0xBD6C ^ 0x8CB8;
        kotakbaz.rain.client.util.render.world.a.e[0x102A1 ^ 0x1026F] = 0xFFFE2EDB ^ 0x1026F;
        kotakbaz.rain.client.util.render.world.a.e[0x5E56 ^ 0x5F01] = 0x5F00 ^ 0x5F01;
        kotakbaz.rain.client.util.render.world.a.e[0xB37 ^ 0xB24] = 0xB3A ^ 0xB24;
        kotakbaz.rain.client.util.render.world.a.e[0x650B ^ 0x6475] = 0xFD97 ^ 0x6475;
        kotakbaz.rain.client.util.render.world.a.e[0x6C98 ^ 0x6D1F] = 0x7124 ^ 0x6D1F;
        kotakbaz.rain.client.util.render.world.a.e[0xE460 ^ 0xE4D8] = 0x8DA3 ^ 0xE4D8;
        kotakbaz.rain.client.util.render.world.a.e[0x644F ^ 0x65C5] = 0x5A18 ^ 0x65C5;
        kotakbaz.rain.client.util.render.world.a.e[0xA3DB ^ 0xA2A9] = 0xA287 ^ 0xA2A9;
        kotakbaz.rain.client.util.render.world.a.e[0xE897 ^ 0xE8DC] = 0xFFFF1755 ^ 0xE8DC;
        kotakbaz.rain.client.util.render.world.a.e[0x9E1B ^ 0x9E88] = 0xCBAB ^ 0x9E88;
        kotakbaz.rain.client.util.render.world.a.e[0x601F ^ 0x60C7] = 0x670A ^ 0x60C7;
        kotakbaz.rain.client.util.render.world.a.e[0xCE01 ^ 0xCF09] = 0xD493 ^ 0xCF09;
        kotakbaz.rain.client.util.render.world.a.e[0x133D ^ 0x134D] = 0xFFFFEC99 ^ 0x134D;
        kotakbaz.rain.client.util.render.world.a.e[0x9348 ^ 0x92C4] = 0x92C4 ^ 0x92C4;
        kotakbaz.rain.client.util.render.world.a.e[0xF968 ^ 0xF852] = 0xC975 ^ 0xF852;
        kotakbaz.rain.client.util.render.world.a.e[0x4627 ^ 0x46F3] = 0x14AA0 ^ 0x46F3;
        kotakbaz.rain.client.util.render.world.a.e[0xE126 ^ 0xE04D] = 0xE04B ^ 0xE04D;
        kotakbaz.rain.client.util.render.world.a.e[0x5894 ^ 0x59B4] = 0xEB71 ^ 0x59B4;
        kotakbaz.rain.client.util.render.world.a.e[0x3243 ^ 0x32F9] = 0x2E07 ^ 0x32F9;
        kotakbaz.rain.client.util.render.world.a.e[0xBEAF ^ 0xBFD5] = 0xBED5 ^ 0xBFD5;
        kotakbaz.rain.client.util.render.world.a.e[0x26CA ^ 0x269C] = 0xFFFFD912 ^ 0x269C;
        kotakbaz.rain.client.util.render.world.a.e[0x1070B ^ 0x10626] = 0x13D2D ^ 0x10626;
        kotakbaz.rain.client.util.render.world.a.e[0x455C ^ 0x447F] = 0xF6B4 ^ 0x447F;
        kotakbaz.rain.client.util.render.world.a.e[0x9408 ^ 0x9455] = 0xFFFF6BD4 ^ 0x9455;
        kotakbaz.rain.client.util.render.world.a.e[0x2B99 ^ 0x2AFC] = 0x2AF7 ^ 0x2AFC;
        kotakbaz.rain.client.util.render.world.a.e[0x2E94 ^ 0x2EFB] = 0x2ED6 ^ 0x2EFB;
        kotakbaz.rain.client.util.render.world.a.e[0xBED6 ^ 0xBEC9] = 0xBECB ^ 0xBEC9;
        kotakbaz.rain.client.util.render.world.a.e[0x4800 ^ 0x491C] = 0xDA5D ^ 0x491C;
        kotakbaz.rain.client.util.render.world.a.e[0x8DD5 ^ 0x8DC1] = 0xFFFF7201 ^ 0x8DC1;
        kotakbaz.rain.client.util.render.world.a.e[0xF2B ^ 0xF9C] = 0xFFFF9906 ^ 0xF9C;
        kotakbaz.rain.client.util.render.world.a.e[0x69ED ^ 0x692A] = 0xE2 ^ 0x692A;
        kotakbaz.rain.client.util.render.world.a.e[0x4C80 ^ 0x4C5C] = 0x8EB2 ^ 0x4C5C;
        kotakbaz.rain.client.util.render.world.a.e[0xEF4D ^ 0xEF50] = 0xEF75 ^ 0xEF50;
        kotakbaz.rain.client.util.render.world.a.e[0x682A ^ 0x687B] = 0xFFFF978F ^ 0x687B;
        kotakbaz.rain.client.util.render.world.a.e[0x9367 ^ 0x9381] = 0xFFFF9C53 ^ 0x9381;
        kotakbaz.rain.client.util.render.world.a.e[0xC828 ^ 0xC928] = 0x4D3C ^ 0xC928;
        kotakbaz.rain.client.util.render.world.a.e[0xB7A1 ^ 0xB75C] = 0x800D ^ 0xB75C;
        kotakbaz.rain.client.util.render.world.a.e[0x8756 ^ 0x86D3] = 0x8F07 ^ 0x86D3;
        kotakbaz.rain.client.util.render.world.a.e[0xE9AF ^ 0xE9E3] = 0xE9D9 ^ 0xE9E3;
        kotakbaz.rain.client.util.render.world.a.e[0xB31C ^ 0xB360] = 0xB361 ^ 0xB360;
        kotakbaz.rain.client.util.render.world.a.e[0xFEE3 ^ 0xFFE7] = 0x56DC ^ 0xFFE7;
        kotakbaz.rain.client.util.render.world.a.e[0x47F7 ^ 0x473B] = 0x9415 ^ 0x473B;
        kotakbaz.rain.client.util.render.world.a.e[0x52C2 ^ 0x53BA] = 0x53D2 ^ 0x53BA;
        kotakbaz.rain.client.util.render.world.a.e[0x4933 ^ 0x49A9] = 0x1CA1 ^ 0x49A9;
        kotakbaz.rain.client.util.render.world.a.e[0xF6D7 ^ 0xF641] = 0xD9DE ^ 0xF641;
        kotakbaz.rain.client.util.render.world.a.e[0x73E2 ^ 0x72FD] = 0xE1B1 ^ 0x72FD;
        kotakbaz.rain.client.util.render.world.a.e[0xF3E0 ^ 0xF370] = 0xD40D ^ 0xF370;
        kotakbaz.rain.client.util.render.world.a.e[0xBA6B ^ 0xBAA6] = 0x6995 ^ 0xBAA6;
        kotakbaz.rain.client.util.render.world.a.e[0x9187 ^ 0x91A4] = 0x91EF ^ 0x91A4;
        kotakbaz.rain.client.util.render.world.a.e[0x2337 ^ 0x22BF] = 0xED04 ^ 0x22BF;
        kotakbaz.rain.client.util.render.world.a.e[0x6325 ^ 0x63F6] = 0xC391 ^ 0x63F6;
        kotakbaz.rain.client.util.render.world.a.e[0xF64C ^ 0xF60B] = 0xF611 ^ 0xF60B;
        kotakbaz.rain.client.util.render.world.a.e[0x1D12 ^ 0x1DFB] = 0x390F ^ 0x1DFB;
        kotakbaz.rain.client.util.render.world.a.e[0xAF19 ^ 0xAE43] = 0xFFFF51D5 ^ 0xAE43;
        kotakbaz.rain.client.util.render.world.a.e[0x1C43 ^ 0x1D52] = 0x1E80 ^ 0x1D52;
        kotakbaz.rain.client.util.render.world.a.e[0xC13F ^ 0xC164] = 0xFFFF3EDC ^ 0xC164;
        kotakbaz.rain.client.util.render.world.a.e[0x27B0 ^ 0x27FE] = 0x27B2 ^ 0x27FE;
        kotakbaz.rain.client.util.render.world.a.e[0xAB4F ^ 0xAA2B] = 0xFFFF55F9 ^ 0xAA2B;
        kotakbaz.rain.client.util.render.world.a.e[0x106DD ^ 0x10670] = 0x15C81 ^ 0x10670;
        kotakbaz.rain.client.util.render.world.a.e[0xF7B4 ^ 0xF76B] = 0x3595 ^ 0xF76B;
        kotakbaz.rain.client.util.render.world.a.e[0x1025B ^ 0x1036B] = 0x132BC ^ 0x1036B;
        kotakbaz.rain.client.util.render.world.a.e[0x8264 ^ 0x8361] = 0x2A5B ^ 0x8361;
        kotakbaz.rain.client.util.render.world.a.e[0xFFBE ^ 0xFFB8] = 0xFFFF0010 ^ 0xFFB8;
        kotakbaz.rain.client.util.render.world.a.e[0x45E1 ^ 0x4561] = 0x66BD ^ 0x4561;
        kotakbaz.rain.client.util.render.world.a.e[0xA402 ^ 0xA54C] = 0xABE4 ^ 0xA54C;
        kotakbaz.rain.client.util.render.world.a.e[0xC2EF ^ 0xC3AC] = 0xA466 ^ 0xC3AC;
        kotakbaz.rain.client.util.render.world.a.e[0xBE94 ^ 0xBE54] = 0x3ED ^ 0xBE54;
        kotakbaz.rain.client.util.render.world.a.e[0x8BB2 ^ 0x8A95] = 0x790E ^ 0x8A95;
        kotakbaz.rain.client.util.render.world.a.e[0x23E7 ^ 0x23D2] = 0x76FE ^ 0x23D2;
        kotakbaz.rain.client.util.render.world.a.e[0x8003 ^ 0x8182] = 0xF649 ^ 0x8182;
        kotakbaz.rain.client.util.render.world.a.e[0x2FC0 ^ 0x2FB9] = 0x2FB8 ^ 0x2FB9;
        kotakbaz.rain.client.util.render.world.a.e[0xCE73 ^ 0xCFFD] = 0xCFED ^ 0xCFFD;
        kotakbaz.rain.client.util.render.world.a.e[0x1053B ^ 0x104B4] = 0x104B7 ^ 0x104B4;
        kotakbaz.rain.client.util.render.world.a.e[0x7CEB ^ 0x7DE0] = 0x667E ^ 0x7DE0;
        kotakbaz.rain.client.util.render.world.a.e[0x9BB3 ^ 0x9A9A] = 0x19671 ^ 0x9A9A;
        kotakbaz.rain.client.util.render.world.a.e[0x109FC ^ 0x10976] = 0x10BB0 ^ 0x10976;
        kotakbaz.rain.client.util.render.world.a.e[0x7904 ^ 0x7844] = 0x1F92 ^ 0x7844;
        kotakbaz.rain.client.util.render.world.a.e[0x894C ^ 0x897C] = 0x897C ^ 0x897C;
        kotakbaz.rain.client.util.render.world.a.e[0x9AD4 ^ 0x9AD9] = 0x9ADD ^ 0x9AD9;
        kotakbaz.rain.client.util.render.world.a.e[0x6A11 ^ 0x6AD4] = 0x31C ^ 0x6AD4;
        kotakbaz.rain.client.util.render.world.a.e[0xE6D5 ^ 0xE658] = 0xC120 ^ 0xE658;
        kotakbaz.rain.client.util.render.world.a.e[0xF446 ^ 0xF40E] = 0xF473 ^ 0xF40E;
        kotakbaz.rain.client.util.render.world.a.e[0x24E6 ^ 0x2430] = 0x12822 ^ 0x2430;
        kotakbaz.rain.client.util.render.world.a.e[0xC9B3 ^ 0xC838] = 0xC83A ^ 0xC838;
        kotakbaz.rain.client.util.render.world.a.e[0x9ADB ^ 0x9A14] = 0x4927 ^ 0x9A14;
        kotakbaz.rain.client.util.render.world.a.e[0x2B2C ^ 0x2A51] = 0x2A52 ^ 0x2A51;
        kotakbaz.rain.client.util.render.world.a.e[0x856A ^ 0x85C5] = 0xDF07 ^ 0x85C5;
        kotakbaz.rain.client.util.render.world.a.e[0x2997 ^ 0x28AA] = 0x513F ^ 0x28AA;
        kotakbaz.rain.client.util.render.world.a.e[0x10B18 ^ 0x10A16] = 0xFFFE4A99 ^ 0x10A16;
        kotakbaz.rain.client.util.render.world.a.e[0x4098 ^ 0x40EB] = 0x40CE ^ 0x40EB;
        kotakbaz.rain.client.util.render.world.a.e[0xDA8D ^ 0xDA34] = 0xC6CB ^ 0xDA34;
        kotakbaz.rain.client.util.render.world.a.e[0x96FF ^ 0x97C7] = 0xA69C ^ 0x97C7;
        kotakbaz.rain.client.util.render.world.a.e[0x22DF ^ 0x2234] = 0x6C0 ^ 0x2234;
        kotakbaz.rain.client.util.render.world.a.e[0xD3E2 ^ 0xD2CC] = 0xFFFF1679 ^ 0xD2CC;
        kotakbaz.rain.client.util.render.world.a.e[0x59DC ^ 0x59DD] = 0x59FC ^ 0x59DD;
        kotakbaz.rain.client.util.render.world.a.e[0x9970 ^ 0x996A] = 0xFFFF66AB ^ 0x996A;
        kotakbaz.rain.client.util.render.world.a.e[0xA53F ^ 0xA4BB] = 0x6088 ^ 0xA4BB;
        kotakbaz.rain.client.util.render.world.a.e[0xE597 ^ 0xE5C3] = 0xFFFF1A07 ^ 0xE5C3;
        kotakbaz.rain.client.util.render.world.a.e[0xF46D ^ 0xF53F] = 0x4CEC ^ 0xF53F;
        kotakbaz.rain.client.util.render.world.a.e[0x10807 ^ 0x10971] = 0x1096E ^ 0x10971;
        kotakbaz.rain.client.util.render.world.a.e[0xD4E0 ^ 0xD494] = 0xFFFF2B71 ^ 0xD494;
        kotakbaz.rain.client.util.render.world.a.e[0x105BB ^ 0x10480] = 0x135CD ^ 0x10480;
        kotakbaz.rain.client.util.render.world.a.e[0x5B7C ^ 0x5B3F] = 0xFFFFA47E ^ 0x5B3F;
        kotakbaz.rain.client.util.render.world.a.e[0x4953 ^ 0x486C] = 0x31F9 ^ 0x486C;
        kotakbaz.rain.client.util.render.world.a.e[0x71C1 ^ 0x70B8] = 0x70B9 ^ 0x70B8;
        kotakbaz.rain.client.util.render.world.a.e[0xE895 ^ 0xE8C6] = 0xE8C5 ^ 0xE8C6;
        kotakbaz.rain.client.util.render.world.a.e[0x19FE ^ 0x1976] = 0x1C25 ^ 0x1976;
        kotakbaz.rain.client.util.render.world.a.e[0x1653 ^ 0x16E8] = 0xFFFFF5E5 ^ 0x16E8;
        kotakbaz.rain.client.util.render.world.a.e[0x1AA1 ^ 0x1A17] = 0x736C ^ 0x1A17;
        kotakbaz.rain.client.util.render.world.a.e[0xE97D ^ 0xE80D] = 0xE871 ^ 0xE80D;
        kotakbaz.rain.client.util.render.world.a.e[0xB594 ^ 0xB562] = 0xFFFFFF9E ^ 0xB562;
        kotakbaz.rain.client.util.render.world.a.e[0x1D46 ^ 0x1D85] = 0x7C92 ^ 0x1D85;
        kotakbaz.rain.client.util.render.world.a.e[0x28E6 ^ 0x28E9] = 0xFFFFD771 ^ 0x28E9;
        kotakbaz.rain.client.util.render.world.a.e[0x85B ^ 0x86A] = 0x82A ^ 0x86A;
        kotakbaz.rain.client.util.render.world.a.e[0x2330 ^ 0x2372] = 0xFFFFDC84 ^ 0x2372;
        kotakbaz.rain.client.util.render.world.a.e[0x1EE1 ^ 0x1FE3] = 0x9B89 ^ 0x1FE3;
        kotakbaz.rain.client.util.render.world.a.e[0xEFFA ^ 0xEF14] = 0xFFFFA301 ^ 0xEF14;
        kotakbaz.rain.client.util.render.world.a.e[0xA93C ^ 0xA829] = 0x569A ^ 0xA829;
        kotakbaz.rain.client.util.render.world.a.e[0xBDC9 ^ 0xBD39] = 0xD5BF ^ 0xBD39;
        kotakbaz.rain.client.util.render.world.a.e[0x8F7E ^ 0x8F03] = 0x8F02 ^ 0x8F03;
        kotakbaz.rain.client.util.render.world.a.e[0x8A83 ^ 0x8BB6] = 0x8BD5 ^ 0x8BB6;
        kotakbaz.rain.client.util.render.world.a.e[0xE7F9 ^ 0xE765] = 0xB26D ^ 0xE765;
        kotakbaz.rain.client.util.render.world.a.e[0x352D ^ 0x3434] = 0x4731 ^ 0x3434;
        kotakbaz.rain.client.util.render.world.a.e[0x95A8 ^ 0x9589] = 0x95E1 ^ 0x9589;
        kotakbaz.rain.client.util.render.world.a.e[0x12A5 ^ 0x138E] = 0x11F65 ^ 0x138E;
        kotakbaz.rain.client.util.render.world.a.e[0xE553 ^ 0xE426] = 0xE42C ^ 0xE426;
        kotakbaz.rain.client.util.render.world.a.e[0x3248 ^ 0x3302] = 0x743 ^ 0x3302;
        kotakbaz.rain.client.util.render.world.a.e[0x54 ^ 0xE6] = 0x474B ^ 0xE6;
        kotakbaz.rain.client.util.render.world.a.e[0xFAFC ^ 0xFBC2] = 0xFFFF7D90 ^ 0xFBC2;
        kotakbaz.rain.client.util.render.world.a.e[0xBD1C ^ 0xBC71] = 0xBC7E ^ 0xBC71;
        kotakbaz.rain.client.util.render.world.a.e[0x17C6 ^ 0x1680] = 0x1680 ^ 0x1680;
        kotakbaz.rain.client.util.render.world.a.e[0x4E75 ^ 0x4F38] = 0xEDDE ^ 0x4F38;
        kotakbaz.rain.client.util.render.world.a.e[0xC078 ^ 0xC165] = 0x5229 ^ 0xC165;
        kotakbaz.rain.client.util.render.world.a.e[0xD139 ^ 0xD10F] = 0xDBA2 ^ 0xD10F;
        kotakbaz.rain.client.util.render.world.a.e[0x12BE ^ 0x13AE] = 0x106B ^ 0x13AE;
        kotakbaz.rain.client.util.render.world.a.e[0x4CFC ^ 0x4D7A] = 0xCD8C ^ 0x4D7A;
        kotakbaz.rain.client.util.render.world.a.e[0x9079 ^ 0x903D] = 0xFFFF6FE0 ^ 0x903D;
        kotakbaz.rain.client.util.render.world.a.e[0x65ED ^ 0x64AA] = 0x64AB ^ 0x64AA;
        kotakbaz.rain.client.util.render.world.a.e[0x10CF7 ^ 0x10CA5] = 0x10C9B ^ 0x10CA5;
        kotakbaz.rain.client.util.render.world.a.e[0x6B43 ^ 0x6BE5] = 0x950C ^ 0x6BE5;
        kotakbaz.rain.client.util.render.world.a.e[0x9443 ^ 0x944A] = 0xFFFF6BD9 ^ 0x944A;
        kotakbaz.rain.client.util.render.world.a.e[0x609A ^ 0x60DA] = 0xFFFF9F67 ^ 0x60DA;
        kotakbaz.rain.client.util.render.world.a.e[0xE640 ^ 0xE67B] = 0x2A6D ^ 0xE67B;
        kotakbaz.rain.client.util.render.world.a.e[0x423B ^ 0x4241] = 0x4243 ^ 0x4241;
        kotakbaz.rain.client.util.render.world.a.e[0x5516 ^ 0x55A5] = 0x1256 ^ 0x55A5;
        kotakbaz.rain.client.util.render.world.a.e[0xA716 ^ 0xA611] = 0xF2B ^ 0xA611;
        kotakbaz.rain.client.util.render.world.a.e[0x566D ^ 0x566A] = 0x560A ^ 0x566A;
        kotakbaz.rain.client.util.render.world.a.e[0xFBE7 ^ 0xFB43] = 0x1F89F ^ 0xFB43;
        kotakbaz.rain.client.util.render.world.a.e[0x2808 ^ 0x2857] = 0xFFFFD7C9 ^ 0x2857;
        kotakbaz.rain.client.util.render.world.a.e[0xCB2F ^ 0xCB62] = 0xFFFF34F8 ^ 0xCB62;
        kotakbaz.rain.client.util.render.world.a.e[0x8CCD ^ 0x8C5C] = 0xD933 ^ 0x8C5C;
        kotakbaz.rain.client.util.render.world.a.e[0xD4E4 ^ 0xD5F0] = 0x2B59 ^ 0xD5F0;
        kotakbaz.rain.client.util.render.world.a.e[0xB6DE ^ 0xB6F2] = 0xB6F3 ^ 0xB6F2;
        kotakbaz.rain.client.util.render.world.a.e[0x2904 ^ 0x2953] = 0x2921 ^ 0x2953;
        kotakbaz.rain.client.util.render.world.a.e[0x9F4E ^ 0x9FB0] = 0xFFFF573F ^ 0x9FB0;
        kotakbaz.rain.client.util.render.world.a.e[0x402 ^ 0x487] = 0x1D9 ^ 0x487;
        kotakbaz.rain.client.util.render.world.a.e[0xED09 ^ 0xEDF0] = 0xD45F ^ 0xEDF0;
        kotakbaz.rain.client.util.render.world.a.e[0xFF0B ^ 0xFE61] = 0xFE44 ^ 0xFE61;
        kotakbaz.rain.client.util.render.world.a.e[0x10446 ^ 0x10456] = 0xFFFEFBC9 ^ 0x10456;
        kotakbaz.rain.client.util.render.world.a.e[0xC498 ^ 0xC4D9] = 0xFFFF3B72 ^ 0xC4D9;
        kotakbaz.rain.client.util.render.world.a.e[0x11E4 ^ 0x114E] = 0x4F9C ^ 0x114E;
        kotakbaz.rain.client.util.render.world.a.e[0x164D ^ 0x1656] = 0x1647 ^ 0x1656;
        kotakbaz.rain.client.util.render.world.a.e[0x8098 ^ 0x8034] = 0xDEE6 ^ 0x8034;
        kotakbaz.rain.client.util.render.world.a.e[0x560D ^ 0x56AF] = 0x15573 ^ 0x56AF;
        kotakbaz.rain.client.util.render.world.a.e[0x43FD ^ 0x4305] = 0x7AA3 ^ 0x4305;
        kotakbaz.rain.client.util.render.world.a.e[0xDBC1 ^ 0xDA89] = 0xDA89 ^ 0xDA89;
        kotakbaz.rain.client.util.render.world.a.e[0xC908 ^ 0xC942] = 0xFFFF36CF ^ 0xC942;
        kotakbaz.rain.client.util.render.world.a.e[0x86AD ^ 0x872E] = 0x907C ^ 0x872E;
        kotakbaz.rain.client.util.render.world.a.e[0xB54 ^ 0xA2F] = 0xA2D ^ 0xA2F;
        kotakbaz.rain.client.util.render.world.a.e[0xF758 ^ 0xF783] = 0xF046 ^ 0xF783;
        kotakbaz.rain.client.util.render.world.a.e[0x6602 ^ 0x6661] = 0x6637 ^ 0x6661;
        kotakbaz.rain.client.util.render.world.a.e[0x194D ^ 0x19EE] = 0x11A11 ^ 0x19EE;
        kotakbaz.rain.client.util.render.world.a.e[0xC608 ^ 0xC6AF] = 0x3864 ^ 0xC6AF;
        kotakbaz.rain.client.util.render.world.a.e[0x5BFC ^ 0x5BC4] = 0x4DB5 ^ 0x5BC4;
        kotakbaz.rain.client.util.render.world.a.e[0x84CA ^ 0x84BC] = 0xFFFF7B39 ^ 0x84BC;
        kotakbaz.rain.client.util.render.world.a.e[0x3DFD ^ 0x3CA8] = 0xDC1D ^ 0x3CA8;
        kotakbaz.rain.client.util.render.world.a.e[0x4A7A ^ 0x4A7E] = 0xFFFFB583 ^ 0x4A7E;
        kotakbaz.rain.client.util.render.world.a.e[0x8313 ^ 0x8306] = 0xFFFF7CF4 ^ 0x8306;
        kotakbaz.rain.client.util.render.world.a.e[0x6EB8 ^ 0x6EA4] = 0xFFFF9168 ^ 0x6EA4;
        kotakbaz.rain.client.util.render.world.a.e[0x1EAC ^ 0x1E4C] = 0x6CEE ^ 0x1E4C;
        kotakbaz.rain.client.util.render.world.a.e[0x9CB ^ 0x900] = 0x10B92 ^ 0x900;
        kotakbaz.rain.client.util.render.world.a.e[0x9759 ^ 0x9747] = 0x9755 ^ 0x9747;
        kotakbaz.rain.client.util.render.world.a.e[0x6D5B ^ 0x6DC5] = 0x168BE ^ 0x6DC5;
        kotakbaz.rain.client.util.render.world.a.e[0xF90A ^ 0xF83E] = 0xF84C ^ 0xF83E;
        kotakbaz.rain.client.util.render.world.a.e[0xD8F6 ^ 0xD976] = 0xDBDF ^ 0xD976;
        kotakbaz.rain.client.util.render.world.a.e[0x69F4 ^ 0x68A2] = 0x8B78 ^ 0x68A2;
        kotakbaz.rain.client.util.render.world.a.e[0x4F15 ^ 0x4FCC] = 0x4809 ^ 0x4FCC;
        kotakbaz.rain.client.util.render.world.a.e[0xD5CA ^ 0xD4FD] = 0xD49E ^ 0xD4FD;
        kotakbaz.rain.client.util.render.world.a.e[0x982D ^ 0x982F] = 0xFFFF6796 ^ 0x982F;
        kotakbaz.rain.client.util.render.world.a.e[0x6259 ^ 0x630A] = 0xCD59 ^ 0x630A;
        kotakbaz.rain.client.util.render.world.a.e[0xF3BE ^ 0xF2A9] = 0xC1A ^ 0xF2A9;
        kotakbaz.rain.client.util.render.world.a.e[0xE402 ^ 0xE4A7] = 0x1A41 ^ 0xE4A7;
        kotakbaz.rain.client.util.render.world.a.e[0xF1E9 ^ 0xF1EA] = 0xFFFF0E57 ^ 0xF1EA;
        kotakbaz.rain.client.util.render.world.a.e[0x29B8 ^ 0x299D] = 0xFFFFD60A ^ 0x299D;
        kotakbaz.rain.client.util.render.world.a.e[0x1098E ^ 0x10895] = 0x17B90 ^ 0x10895;
        kotakbaz.rain.client.util.render.world.a.e[0x5CDA ^ 0x5CD0] = 0xFFFFA329 ^ 0x5CD0;
        kotakbaz.rain.client.util.render.world.a.e[0xE945 ^ 0xE95D] = 0xE911 ^ 0xE95D;
        kotakbaz.rain.client.util.render.world.a.e[0x5D04 ^ 0x5DF5] = 0x356A ^ 0x5DF5;
        kotakbaz.rain.client.util.render.world.a.e[0x70F0 ^ 0x7069] = 0x2568 ^ 0x7069;
        kotakbaz.rain.client.util.render.world.a.e[0x92FC ^ 0x9289] = 0xFFFF6D69 ^ 0x9289;
        kotakbaz.rain.client.util.render.world.a.e[0xB34B ^ 0xB38F] = 0xDA48 ^ 0xB38F;
        kotakbaz.rain.client.util.render.world.a.e[0x936E ^ 0x93EA] = 0x1E88 ^ 0x93EA;
        kotakbaz.rain.client.util.render.world.a.e[0x10BE2 ^ 0x10BF4] = 0x10BF4 ^ 0x10BF4;
        kotakbaz.rain.client.util.render.world.a.e[0x112A ^ 0x11F4] = 0xFFFF2CA3 ^ 0x11F4;
        kotakbaz.rain.client.util.render.world.a.e[0x9559 ^ 0x947F] = 0x67B2 ^ 0x947F;
        kotakbaz.rain.client.util.render.world.a.e[0x103A3 ^ 0x10383] = 0xFFFEFC73 ^ 0x10383;
        kotakbaz.rain.client.util.render.world.a.e[0x235D ^ 0x2314] = 0xFFFFDCE9 ^ 0x2314;
        kotakbaz.rain.client.util.render.world.a.e[0x10D3F ^ 0x10DD0] = 0x1BE46 ^ 0x10DD0;
        kotakbaz.rain.client.util.render.world.a.e[0xB18D ^ 0xB139] = 0xF694 ^ 0xB139;
        kotakbaz.rain.client.util.render.world.a.e[0x91F7 ^ 0x909E] = 0x9092 ^ 0x909E;
        kotakbaz.rain.client.util.render.world.a.e[0xCDF7 ^ 0xCDDF] = 0xFFFF3223 ^ 0xCDDF;
        kotakbaz.rain.client.util.render.world.a.e[0xFD32 ^ 0xFD67] = 0xFFFF02BB ^ 0xFD67;
        kotakbaz.rain.client.util.render.world.a.e[0x7CC9 ^ 0x7DE5] = 0x46F0 ^ 0x7DE5;
        kotakbaz.rain.client.util.render.world.a.e[0x9ABD ^ 0x9BE1] = 0xFFFF642A ^ 0x9BE1;
        kotakbaz.rain.client.util.render.world.a.e[0x41EB ^ 0x417E] = 0x6EEF ^ 0x417E;
        kotakbaz.rain.client.util.render.world.a.e[0x4401 ^ 0x44B4] = 0x2DCD ^ 0x44B4;
        kotakbaz.rain.client.util.render.world.a.e[0x8C63 ^ 0x8C54] = 0xD9C5 ^ 0x8C54;
        kotakbaz.rain.client.util.render.world.a.e[0x104EA ^ 0x1058B] = 0x10583 ^ 0x1058B;
        kotakbaz.rain.client.util.render.world.a.e[0xCFEB ^ 0xCF4A] = 0x1CC9E ^ 0xCF4A;
        kotakbaz.rain.client.util.render.world.a.e[0x56B ^ 0x50D] = 0x554 ^ 0x50D;
        kotakbaz.rain.client.util.render.world.a.e[0x9816 ^ 0x9924] = 0xA88A ^ 0x9924;
        kotakbaz.rain.client.util.render.world.a.e[0x8FF6 ^ 0x8ED2] = 0x7D49 ^ 0x8ED2;
        kotakbaz.rain.client.util.render.world.a.e[0x31A5 ^ 0x316C] = 0x133FE ^ 0x316C;
        kotakbaz.rain.client.util.render.world.a.e[0x3B08 ^ 0x3B90] = 0x140F ^ 0x3B90;
        kotakbaz.rain.client.util.render.world.a.e[0x1856 ^ 0x1959] = 0xA67C ^ 0x1959;
        kotakbaz.rain.client.util.render.world.a.e[0xF9AF ^ 0xF8A5] = 0xE340 ^ 0xF8A5;
        kotakbaz.rain.client.util.render.world.a.e[0x1BB ^ 0x126] = 0x1045B ^ 0x126;
        kotakbaz.rain.client.util.render.world.a.e[0x4B23 ^ 0x4BC6] = 0xBBCB ^ 0x4BC6;
        kotakbaz.rain.client.util.render.world.a.e[0xEA3A ^ 0xEA5A] = 0xFFFF15FE ^ 0xEA5A;
        kotakbaz.rain.client.util.render.world.a.e[0xA843 ^ 0xA8CF] = 0xAA09 ^ 0xA8CF;
        kotakbaz.rain.client.util.render.world.a.e[0xE70B ^ 0xE689] = 0x4A47 ^ 0xE689;
        kotakbaz.rain.client.util.render.world.a.e[0xCAF7 ^ 0xCA9A] = 0xFFFF357C ^ 0xCA9A;
        kotakbaz.rain.client.util.render.world.a.e[0x7343 ^ 0x7348] = 0x7323 ^ 0x7348;
        kotakbaz.rain.client.util.render.world.a.e[0xBEF8 ^ 0xBEF4] = 0xBED3 ^ 0xBEF4;
        kotakbaz.rain.client.util.render.world.a.e[0x242F ^ 0x25A6] = 0x82BA ^ 0x25A6;
        kotakbaz.rain.client.util.render.world.a.e[0xD4BD ^ 0xD5E0] = 0xD5EE ^ 0xD5E0;
        kotakbaz.rain.client.util.render.world.a.e[0x5889 ^ 0x586E] = 0xA863 ^ 0x586E;
        kotakbaz.rain.client.util.render.world.a.e[0xD455 ^ 0xD510] = 0xD510 ^ 0xD510;
        kotakbaz.rain.client.util.render.world.a.e[0x6AD5 ^ 0x6BEC] = 0x5AA1 ^ 0x6BEC;
        kotakbaz.rain.client.util.render.world.a.e[0xA8B2 ^ 0xA8FD] = 0xA8E1 ^ 0xA8FD;
        kotakbaz.rain.client.util.render.world.a.e[0x8DD6 ^ 0x8D23] = 0x387D ^ 0x8D23;
        kotakbaz.rain.client.util.render.world.a.e[0xC698 ^ 0xC64D] = 0x1CA0B ^ 0xC64D;
        kotakbaz.rain.client.util.render.world.a.e[0xE1F4 ^ 0xE100] = 0x545C ^ 0xE100;
        kotakbaz.rain.client.util.render.world.a.e[0x5F4 ^ 0x485] = 0x480 ^ 0x485;
        kotakbaz.rain.client.util.render.world.a.e[0x1F55 ^ 0x1FB8] = 0xAC2E ^ 0x1FB8;
        kotakbaz.rain.client.util.render.world.a.e[0xD313 ^ 0xD378] = 0xFFFF2CE6 ^ 0xD378;
        kotakbaz.rain.client.util.render.world.a.e[0x38F ^ 0x2AD] = 0xFFFF4F8D ^ 0x2AD;
        kotakbaz.rain.client.util.render.world.a.e[0x11BC ^ 0x10AA] = 0xEE60 ^ 0x10AA;
        kotakbaz.rain.client.util.render.world.a.e[0x9286 ^ 0x92A2] = 0xFFFF6D3A ^ 0x92A2;
        kotakbaz.rain.client.util.render.world.a.e[0xFE33 ^ 0xFE0D] = 0xA210 ^ 0xFE0D;
        kotakbaz.rain.client.util.render.world.a.e[0x2970 ^ 0x291E] = 0xFFFFD6C7 ^ 0x291E;
        kotakbaz.rain.client.util.render.world.a.e[0x436A ^ 0x432F] = 0xFFFFBCAB ^ 0x432F;
        kotakbaz.rain.client.util.render.world.a.e[0x5570 ^ 0x55D0] = 0x150AB ^ 0x55D0;
        kotakbaz.rain.client.util.render.world.a.e[0xFEA8 ^ 0xFE57] = 0xC906 ^ 0xFE57;
        kotakbaz.rain.client.util.render.world.a.e[0x5D09 ^ 0x5C6B] = 0xFFFFA3B6 ^ 0x5C6B;
        kotakbaz.rain.client.util.render.world.a.e[0x1B39 ^ 0x1A46] = 0x7164 ^ 0x1A46;
        kotakbaz.rain.client.util.render.world.a.e[0x1081C ^ 0x10887] = 0x15DBC ^ 0x10887;
        kotakbaz.rain.client.util.render.world.a.e[0x9345 ^ 0x93ED] = 0x6D04 ^ 0x93ED;
        kotakbaz.rain.client.util.render.world.a.e[0xF53 ^ 0xF92] = 0xF92 ^ 0xF92;
        kotakbaz.rain.client.util.render.world.a.e[0xB57D ^ 0xB41E] = 0xB419 ^ 0xB41E;
        kotakbaz.rain.client.util.render.world.a.e[0xBE63 ^ 0xBF33] = 0x42C2 ^ 0xBF33;
        kotakbaz.rain.client.util.render.world.a.e[0xF670 ^ 0xF6E7] = 0xD93B ^ 0xF6E7;
        kotakbaz.rain.client.util.render.world.a.e[0xB1A3 ^ 0xB1F3] = 0xB1FB ^ 0xB1F3;
        kotakbaz.rain.client.util.render.world.a.e[0xB9CD ^ 0xB8CE] = 0x3CC5 ^ 0xB8CE;
        kotakbaz.rain.client.util.render.world.a.e[0xCD0D ^ 0xCD2F] = 0xCD36 ^ 0xCD2F;
        kotakbaz.rain.client.util.render.world.a.e[0x9C9C ^ 0x9D8E] = 0xFFFF619A ^ 0x9D8E;
        kotakbaz.rain.client.util.render.world.a.e[0xEF3C ^ 0xEE6D] = 0xA11E ^ 0xEE6D;
        kotakbaz.rain.client.util.render.world.a.e[0xEAAD ^ 0xEBAC] = 0x6FA7 ^ 0xEBAC;
        kotakbaz.rain.client.util.render.world.a.e[0xFBC5 ^ 0xFB9D] = 0xFB08 ^ 0xFB9D;
        kotakbaz.rain.client.util.render.world.a.e[0x3773 ^ 0x371A] = 0x3732 ^ 0x371A;
        kotakbaz.rain.client.util.render.world.a.e[0x9D4D ^ 0x9DA7] = 0xFFFF4690 ^ 0x9DA7;
        kotakbaz.rain.client.util.render.world.a.e[0xC714 ^ 0xC79D] = 0xC551 ^ 0xC79D;
        kotakbaz.rain.client.util.render.world.a.e[0xB3AF ^ 0xB35C] = 0xDBC3 ^ 0xB35C;
        kotakbaz.rain.client.util.render.world.a.e[0xB632 ^ 0xB6B9] = 0xB444 ^ 0xB6B9;
        kotakbaz.rain.client.util.render.world.a.e[0xAFF5 ^ 0xAF8B] = 0xAF8B ^ 0xAF8B;
        kotakbaz.rain.client.util.render.world.a.e[0x1F53 ^ 0x1E2F] = 0x1E2F ^ 0x1E2F;
        kotakbaz.rain.client.util.render.world.a.e[0x101F7 ^ 0x10193] = 0x101B8 ^ 0x10193;
        kotakbaz.rain.client.util.render.world.a.e[0x495A ^ 0x4980] = 0x4E1C ^ 0x4980;
        kotakbaz.rain.client.util.render.world.a.e[0x42E9 ^ 0x4389] = 0xFFFFBC4C ^ 0x4389;
        kotakbaz.rain.client.util.render.world.a.e[0x361D ^ 0x3618] = 0x365B ^ 0x3618;
        kotakbaz.rain.client.util.render.world.a.e[0xA1AC ^ 0xA111] = 0x1CAC ^ 0xA111;
        kotakbaz.rain.client.util.render.world.a.e[0xA580 ^ 0xA4AA] = 0xFFFE57E5 ^ 0xA4AA;
        kotakbaz.rain.client.util.render.world.a.e[0xEAAE ^ 0xEBB6] = 0x98AB ^ 0xEBB6;
        kotakbaz.rain.client.util.render.world.a.e[0x42ED ^ 0x423A] = 0x14E7C ^ 0x423A;
        kotakbaz.rain.client.util.render.world.a.e[0xE315 ^ 0xE27A] = 0xE27B ^ 0xE27A;
        kotakbaz.rain.client.util.render.world.a.e[0x45F4 ^ 0x45D9] = 0x45D9 ^ 0x45D9;
        kotakbaz.rain.client.util.render.world.a.e[0xD276 ^ 0xD242] = 0xB66A ^ 0xD242;
        kotakbaz.rain.client.util.render.world.a.e[0xEDBB ^ 0xED84] = 0xED84 ^ 0xED84;
        kotakbaz.rain.client.util.render.world.a.e[0x3B45 ^ 0x3A0E] = 0x954C ^ 0x3A0E;
        kotakbaz.rain.client.util.render.world.a.e[0x7E9B ^ 0x7EFE] = 0x7EAC ^ 0x7EFE;
        kotakbaz.rain.client.util.render.world.a.e[0x9D97 ^ 0x9C9A] = 0x23BF ^ 0x9C9A;
        kotakbaz.rain.client.util.render.world.a.e[0xED92 ^ 0xED1D] = 0xFFFF3581 ^ 0xED1D;
        kotakbaz.rain.client.util.render.world.a.e[0x1EB8 ^ 0x1E2C] = 0x4B40 ^ 0x1E2C;
        kotakbaz.rain.client.util.render.world.a.e[0x5CDD ^ 0x5C62] = 0xFFFF1E2F ^ 0x5C62;
        kotakbaz.rain.client.util.render.world.a.e[0xFD35 ^ 0xFD06] = 0x97A3 ^ 0xFD06;
        kotakbaz.rain.client.util.render.world.a.e[0xFD1B ^ 0xFC52] = 0xFC40 ^ 0xFC52;
        kotakbaz.rain.client.util.render.world.a.e[0x5EEC ^ 0x5EAA] = 0x5E1D ^ 0x5EAA;
        kotakbaz.rain.client.util.render.world.a.e[0xDDE8 ^ 0xDD77] = 0xFFFE27C6 ^ 0xDD77;
        kotakbaz.rain.client.util.render.world.a.e[0xCF1B ^ 0xCF32] = 0xCF6C ^ 0xCF32;
        kotakbaz.rain.client.util.render.world.a.e[0x404D ^ 0x4139] = 0x4167 ^ 0x4139;
        kotakbaz.rain.client.util.render.world.a.e[0xC716 ^ 0xC7AA] = 0xDB54 ^ 0xC7AA;
        kotakbaz.rain.client.util.render.world.a.e[0x46A5 ^ 0x462B] = 0x6156 ^ 0x462B;
        kotakbaz.rain.client.util.render.world.a.e[0x5F0C ^ 0x5F52] = 0x5F78 ^ 0x5F52;
        kotakbaz.rain.client.util.render.world.a.e[0x10B71 ^ 0x10A28] = 0x10A2A ^ 0x10A28;
        kotakbaz.rain.client.util.render.world.a.e[0x9C50 ^ 0x9C81] = 0x3CE6 ^ 0x9C81;
        kotakbaz.rain.client.util.render.world.a.e[0xE9E3 ^ 0xE964] = 0xEC37 ^ 0xE964;
        kotakbaz.rain.client.util.render.world.a.e[0x61CD ^ 0x6081] = 0xEEA5 ^ 0x6081;
        kotakbaz.rain.client.util.render.world.a.e[0x7BDB ^ 0x7BD5] = 0x7BFA ^ 0x7BD5;
        kotakbaz.rain.client.util.render.world.a.e[0x6052 ^ 0x6008] = 0x6044 ^ 0x6008;
        kotakbaz.rain.client.util.render.world.a.e[0xCE83 ^ 0xCE74] = 0x7B2A ^ 0xCE74;
        kotakbaz.rain.client.util.render.world.a.e[0x1524 ^ 0x1437] = 0x17E5 ^ 0x1437;
        kotakbaz.rain.client.util.render.world.a.e[0xF808 ^ 0xF854] = 0xF84D ^ 0xF854;
        kotakbaz.rain.client.util.render.world.a.e[0xC34E ^ 0xC3BC] = 0xAB06 ^ 0xC3BC;
        kotakbaz.rain.client.util.render.world.a.e[0x4B75 ^ 0x4B91] = 0xBB9A ^ 0x4B91;
        kotakbaz.rain.client.util.render.world.a.e[0xCB21 ^ 0xCA28] = 0xD1B6 ^ 0xCA28;
        kotakbaz.rain.client.util.render.world.a.e[0xA86A ^ 0xA856] = 0x840 ^ 0xA856;
        kotakbaz.rain.client.util.render.world.a.e[0x56B9 ^ 0x57D5] = 0x57B4 ^ 0x57D5;
        kotakbaz.rain.client.util.render.world.a.e[0xB0CE ^ 0xB0CE] = 0xFFFF4F54 ^ 0xB0CE;
        kotakbaz.rain.client.util.render.world.a.e[0x7F9 ^ 0x68E] = 0x68D ^ 0x68E;
        kotakbaz.rain.client.util.render.world.a.e[0x5CA7 ^ 0x5C8D] = 0x5C8E ^ 0x5C8D;
        kotakbaz.rain.client.util.render.world.a.e[0x8FA5 ^ 0x8E28] = 0x8E38 ^ 0x8E28;
        kotakbaz.rain.client.util.render.world.a.e[0x10277 ^ 0x1021B] = 0x10246 ^ 0x1021B;
        kotakbaz.rain.client.util.render.world.a.e[0x3C86 ^ 0x3CF7] = 0x3CF2 ^ 0x3CF7;
        kotakbaz.rain.client.util.render.world.a.e[0x43B2 ^ 0x431B] = 0x1DC2 ^ 0x431B;
        kotakbaz.rain.client.util.render.world.a.e[0x9169 ^ 0x91EA] = 0xFFFFE33A ^ 0x91EA;
        kotakbaz.rain.client.util.render.world.a.e[0xF766 ^ 0xF754] = 0x1770 ^ 0xF754;
        kotakbaz.rain.client.util.render.world.a.e[0xDAA2 ^ 0xDBD1] = 0xDBD1 ^ 0xDBD1;
        kotakbaz.rain.client.util.render.world.a.e[0xD176 ^ 0xD1BC] = 0xFFFE2CDA ^ 0xD1BC;
        kotakbaz.rain.client.util.render.world.a.e[0xDEE3 ^ 0xDEC5] = 0xFFFF2130 ^ 0xDEC5;
        kotakbaz.rain.client.util.render.world.a.e[0xD1FE ^ 0xD0A0] = 0xFFFF2F20 ^ 0xD0A0;
        kotakbaz.rain.client.util.render.world.a.e[0x41A0 ^ 0x4081] = 0xF24A ^ 0x4081;
        kotakbaz.rain.client.util.render.world.a.e[0x484C ^ 0x4918] = 0x36EC ^ 0x4918;
        kotakbaz.rain.client.util.render.world.a.e[0x7D53 ^ 0x7DE2] = 0x3A43 ^ 0x7DE2;
        kotakbaz.rain.client.util.render.world.a.e[0xF74D ^ 0xF67E] = 0xC7AA ^ 0xF67E;
        kotakbaz.rain.client.util.render.world.a.e[0x6018 ^ 0x60E4] = 0x57BF ^ 0x60E4;
        kotakbaz.rain.client.util.render.world.a.e[0x2AE1 ^ 0x2AF6] = 0xFFFFD524 ^ 0x2AF6;
        kotakbaz.rain.client.util.render.world.a.e[0xFFEF ^ 0xFE88] = 0xFE81 ^ 0xFE88;
        kotakbaz.rain.client.util.render.world.a.e[0xE16E ^ 0xE153] = 0x2244 ^ 0xE153;
        kotakbaz.rain.client.util.render.world.a.e[0x1833 ^ 0x1977] = 0x1977 ^ 0x1977;
        kotakbaz.rain.client.util.render.world.a.e[0x4216 ^ 0x4290] = 0x47C3 ^ 0x4290;
        kotakbaz.rain.client.util.render.world.a.e[0xA7F4 ^ 0xA78F] = 0xA78F ^ 0xA78F;
        kotakbaz.rain.client.util.render.world.a.e[0x13F4 ^ 0x13DB] = 0x13DB ^ 0x13DB;
        kotakbaz.rain.client.util.render.world.a.e[0xBF6C ^ 0xBF8D] = 0xCD23 ^ 0xBF8D;
        kotakbaz.rain.client.util.render.world.a.e[0xB52E ^ 0xB5AF] = 0x38CD ^ 0xB5AF;
        kotakbaz.rain.client.util.render.world.a.e[0xF571 ^ 0xF55F] = 0xF55D ^ 0xF55F;
        kotakbaz.rain.client.util.render.world.a.e[0x176F ^ 0x177E] = 0x1778 ^ 0x177E;
        kotakbaz.rain.client.util.render.world.a.e[0x961F ^ 0x9701] = 0xFFFFFB8E ^ 0x9701;
        kotakbaz.rain.client.util.render.world.a.e[0x1C72 ^ 0x1C6B] = 0x1C00 ^ 0x1C6B;
        kotakbaz.rain.client.util.render.world.a.e[0xB7A7 ^ 0xB6A1] = 0xFFFFE007 ^ 0xB6A1;
        kotakbaz.rain.client.util.render.world.a.e[0x3192 ^ 0x3140] = 0xFFFF6ECA ^ 0x3140;
        kotakbaz.rain.client.util.render.world.a.e[0xA1C3 ^ 0xA0EB] = 0x1AC12 ^ 0xA0EB;
        kotakbaz.rain.client.util.render.world.a.e[0x352E ^ 0x3448] = 0x3458 ^ 0x3448;
        kotakbaz.rain.client.util.render.world.a.e[0x37E3 ^ 0x379C] = 0x1450 ^ 0x379C;
        kotakbaz.rain.client.util.render.world.a.e[0x7F41 ^ 0x7E4D] = 0xC16F ^ 0x7E4D;
        kotakbaz.rain.client.util.render.world.a.e[0xB423 ^ 0xB4FE] = 0x7600 ^ 0xB4FE;
        kotakbaz.rain.client.util.render.world.a.e[0x4775 ^ 0x4712] = 0xFFFFB885 ^ 0x4712;
        kotakbaz.rain.client.util.render.world.a.e[0x5DC2 ^ 0x5D7C] = 0xE0C5 ^ 0x5D7C;
        kotakbaz.rain.client.util.render.world.a.e[0x6C2A ^ 0x6D30] = 0x1E64 ^ 0x6D30;
        kotakbaz.rain.client.util.render.world.a.e[0x8E5C ^ 0x8E4E] = 0x8E6C ^ 0x8E4E;
        kotakbaz.rain.client.util.render.world.a.e[0x4B45 ^ 0x4B62] = 0xFFFFB4DC ^ 0x4B62;
        kotakbaz.rain.client.util.render.world.a.e[0xE2E2 ^ 0xE3C7] = 0x105C ^ 0xE3C7;
        kotakbaz.rain.client.util.render.world.a.e[0x66DC ^ 0x66AE] = 0xFFFF9917 ^ 0x66AE;
        kotakbaz.rain.client.util.render.world.a.e[0x1F39 ^ 0x1E7B] = 0xFFFF8638 ^ 0x1E7B;
        kotakbaz.rain.client.util.render.world.a.e[0xC8D8 ^ 0xC983] = 0xC98E ^ 0xC983;
        kotakbaz.rain.client.util.render.world.a.e[0x5B4F ^ 0x5BB5] = 0xFFFF9DB6 ^ 0x5BB5;
        kotakbaz.rain.client.util.render.world.a.e[0x1CFA ^ 0x1DCC] = 0x1DDB ^ 0x1DCC;
        kotakbaz.rain.client.util.render.world.a.e[0x8E81 ^ 0x8EE3] = 0x8EF6 ^ 0x8EE3;
        kotakbaz.rain.client.util.render.world.a.e[0xB2FD ^ 0xB2F5] = 0xFFFF4D0D ^ 0xB2F5;
        kotakbaz.rain.client.util.render.world.a.e[0xAB3E ^ 0xABF8] = 0xFFFF3DA3 ^ 0xABF8;
        kotakbaz.rain.client.util.render.world.a.e[0x104F6 ^ 0x1049C] = 0xFFFEFB7F ^ 0x1049C;
    }
}

