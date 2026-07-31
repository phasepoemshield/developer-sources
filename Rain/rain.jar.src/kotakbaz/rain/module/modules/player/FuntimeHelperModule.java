/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.module.modules.player;

import java.awt.Color;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import kotakbaz.rain.client.extensions.a_0;
import kotakbaz.rain.client.extensions.b;
import kotakbaz.rain.client.util.render.world.CustomHitBoxRenderer;
import kotakbaz.rain.event.events.Render3DEvent;
import kotakbaz.rain.module.Module;
import kotakbaz.rain.module.restrict.FuntimeRestrict;
import kotakbaz.rain.module.setting.settings.BooleanSetting;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jdk7.AutoCloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.render.RainRenderLayers;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.util.BufferAllocator;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;
import org.jetbrains.annotations.NotNull;
import sweetie.evaware.flora.api.Commando;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\b\u0007\u0010\bJ?\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\fH\u0002\u00a2\u0006\u0004\b\u0010\u0010\u0011J?\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\fH\u0002\u00a2\u0006\u0004\b\u0012\u0010\u0011J7\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0002\u00a2\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0002\u00a2\u0006\u0004\b\u001e\u0010\u001fJ'\u0010$\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u00162\u0006\u0010#\u001a\u00020\u0016H\u0002\u00a2\u0006\u0004\b$\u0010%J-\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u00162\u0006\u0010#\u001a\u00020\u0016H\u0002\u00a2\u0006\u0004\b&\u0010'J#\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160)2\u0006\u0010(\u001a\u00020\u0018H\u0002\u00a2\u0006\u0004\b*\u0010+J\u0017\u0010/\u001a\u00020.2\u0006\u0010-\u001a\u00020,H\u0002\u00a2\u0006\u0004\b/\u00100J\u001d\u00102\u001a\u00020.2\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0002\u00a2\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u00020.2\u0006\u0010\u0015\u001a\u00020\fH\u0002\u00a2\u0006\u0004\b4\u00105R\u0014\u00106\u001a\u00020\u00188\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b6\u00107R\u0014\u00108\u001a\u00020\u00188\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b8\u00107R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010<\u001a\u0002098\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b<\u0010;R\u0014\u0010=\u001a\u0002098\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b=\u0010;R\u0014\u0010>\u001a\u0002098\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b>\u0010;R\u0014\u0010?\u001a\u0002098\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b?\u0010;R\u0014\u0010@\u001a\u0002098\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b@\u0010;R\u0014\u0010A\u001a\u0002098\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bA\u0010;R\u0014\u0010B\u001a\u0002098\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bB\u0010;\u00a8\u0006C"}, d2={"Lkotakbaz/rain/module/modules/player/FuntimeHelperModule;", "Lkotakbaz/rain/module/Module;", "<init>", "()V", "Lkotakbaz/rain/event/events/Render3DEvent;", "event", "", "onRender3D", "(Lkotakbaz/rain/event/events/Render3DEvent;)V", "Lnet/minecraft/class_4588;", "quadBuffer", "lineBuffer", "", "cameraX", "cameraY", "cameraZ", "renderTrapkaCube", "(Lkotakbaz/rain/event/events/Render3DEvent;Lnet/minecraft/class_4588;Lnet/minecraft/class_4588;DDD)V", "renderPlastPreview", "Lnet/minecraft/class_4597$class_4598;", "consumers", "radius", "", "segments", "", "lineWidth", "renderCircle", "(Lkotakbaz/rain/event/events/Render3DEvent;Lnet/minecraft/class_4597$class_4598;DIF)V", "", "Lnet/minecraft/class_238;", "collectPlastPreviewBoxes", "()Ljava/util/List;", "Lnet/minecraft/class_2338;", "blockPos", "dirX", "dirZ", "createCardinalPlastBox", "(Lnet/minecraft/class_2338;II)Lnet/minecraft/class_238;", "createDiagonalPlastBoxes", "(Lnet/minecraft/class_2338;II)Ljava/util/List;", "yaw", "Lkotlin/Pair;", "directionFromYaw", "(F)Lkotlin/Pair;", "Lnet/minecraft/class_1792;", "item", "", "isHolding", "(Lnet/minecraft/class_1792;)Z", "boxes", "hasPlayerInBoxes", "(Ljava/util/List;)Z", "hasPlayerInRadius", "(D)Z", "PLAST_PITCH_THRESHOLD", "F", "PREVIEW_OUTLINE_WIDTH", "Lkotakbaz/rain/module/setting/settings/BooleanSetting;", "trapka", "Lkotakbaz/rain/module/setting/settings/BooleanSetting;", "plast", "dragonTrap", "greenInTarget", "enderEyeCircle", "sugarDustCircle", "fireTornadoCircle", "godsAura", "rain-visuals"})
@SourceDebugExtension(value={"SMAP\nFuntimeHelperModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FuntimeHelperModule.kt\nkotakbaz/rain/module/modules/player/FuntimeHelperModule\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,332:1\n1586#2:333\n1661#2,3:334\n1807#2,2:337\n1807#2,3:339\n1809#2:342\n1807#2,3:343\n*S KotlinDebug\n*F\n+ 1 FuntimeHelperModule.kt\nkotakbaz/rain/module/modules/player/FuntimeHelperModule\n*L\n278#1:333\n278#1:334,3\n317#1:337,2\n318#1:339,3\n317#1:342\n327#1:343,3\n*E\n"})
public final class FuntimeHelperModule
extends Module {
    @NotNull
    public static final FuntimeHelperModule INSTANCE;
    private static final float a = 45.0f;
    private static final float A = 1.0f;
    @NotNull
    private static final BooleanSetting b;
    @NotNull
    private static final BooleanSetting B;
    @NotNull
    private static final BooleanSetting c;
    @NotNull
    private static final BooleanSetting C;
    @NotNull
    private static final BooleanSetting d;
    @NotNull
    private static final BooleanSetting D;
    @NotNull
    private static final BooleanSetting e;
    @NotNull
    private static final BooleanSetting E;
    private static Object[] f;
    private static Object g;
    private static Object[] G;
    private static Object[] F;
    private static Object[] h;
    public static int[] H;

    private FuntimeHelperModule() {
        int n2 = H[0];
        n2 -= H[1];
        int n3 = H[3];
        n3 -= H[4];
        int n4 = H[6];
        n4 += H[7];
        super((String)f[n2 -= H[2]], a_0.getPLAYER(), (String)f[n3 += H[5]] + (String)f[n4 += H[8]]);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Commando
    public final void onRender3D(@NotNull Render3DEvent event) {
        var33_2 = 381666022697767049L;
        var35_3 = -3026811718112127485L;
        var37_4 = 6171647735463627865L;
        var39_5 = 8320781800565080585L;
        var41_6 = -378373828636047353L;
        var43_7 = -2506148732523214185L;
        var45_8 = -6304415035570750057L;
        var21_9 = 781435875762099664L;
        var23_10 = 7681770308839667714L;
        var25_11 = 8647283963440949187L;
        var27_12 = 1985354008662319982L;
        var29_13 = -6492403906131144776L;
        var31_14 = 1059257090192977055L;
        var48_15 = FuntimeHelperModule.H[9];
        var48_15 -= FuntimeHelperModule.H[10];
        Intrinsics.checkNotNullParameter(event, (String)FuntimeHelperModule.f[var48_15 += FuntimeHelperModule.H[11]]);
        if (!this.isEnabled()) {
            return;
        }
        if (kotakbaz.rain.client.extensions.b.getMc().player == null) {
            return;
        }
        var2_16 = kotakbaz.rain.client.extensions.b.getMc().gameRenderer.getCamera().getPos();
        if (!((Boolean)FuntimeHelperModule.b.getValue()).booleanValue()) ** GOTO lbl-1000
        v0 = Items.NETHERITE_SCRAP;
        var50_17 = FuntimeHelperModule.H[12];
        var50_17 ^= FuntimeHelperModule.H[13];
        Intrinsics.checkNotNullExpressionValue(v0, (String)FuntimeHelperModule.f[var50_17 -= FuntimeHelperModule.H[14]]);
        if (this.isHolding(v0)) {
            var52_18 = FuntimeHelperModule.H[15];
            var52_18 += FuntimeHelperModule.H[16];
            v1 = var52_18 -= FuntimeHelperModule.H[17];
        } else lbl-1000:
        // 2 sources

        {
            var54_19 = FuntimeHelperModule.H[18];
            var54_19 ^= FuntimeHelperModule.H[19];
            v1 = var54_19 -= FuntimeHelperModule.H[20];
        }
        var56_20 = FuntimeHelperModule.H[21];
        var56_20 += FuntimeHelperModule.H[22];
        v2 = var27_12;
        var58_21 = FuntimeHelperModule.H[24];
        var58_21 += FuntimeHelperModule.H[25];
        var27_12 = v2 ^ ((long)v1 << (var56_20 -= FuntimeHelperModule.H[23]) ^ v2) & -1L << (var58_21 -= FuntimeHelperModule.H[26]);
        if (!((Boolean)FuntimeHelperModule.B.getValue()).booleanValue()) ** GOTO lbl-1000
        v3 = Items.DRIED_KELP;
        var60_22 = FuntimeHelperModule.H[27];
        var60_22 += FuntimeHelperModule.H[28];
        Intrinsics.checkNotNullExpressionValue(v3, (String)FuntimeHelperModule.f[var60_22 += FuntimeHelperModule.H[29]]);
        if (this.isHolding(v3)) {
            var62_23 = FuntimeHelperModule.H[30];
            var62_23 += FuntimeHelperModule.H[31];
            v4 = var62_23 ^= FuntimeHelperModule.H[32];
        } else lbl-1000:
        // 2 sources

        {
            var64_24 = FuntimeHelperModule.H[33];
            var64_24 -= FuntimeHelperModule.H[34];
            v4 = var64_24 ^= FuntimeHelperModule.H[35];
        }
        v5 = var27_12;
        var66_25 = FuntimeHelperModule.H[36];
        var66_25 += FuntimeHelperModule.H[37];
        var27_12 = v5 ^ ((long)v4 ^ v5) & -1L >>> (var66_25 ^= FuntimeHelperModule.H[38]);
        if (!((Boolean)FuntimeHelperModule.d.getValue()).booleanValue()) ** GOTO lbl-1000
        v6 = Items.ENDER_EYE;
        var68_26 = FuntimeHelperModule.H[39];
        var68_26 -= FuntimeHelperModule.H[40];
        Intrinsics.checkNotNullExpressionValue(v6, (String)FuntimeHelperModule.f[var68_26 -= FuntimeHelperModule.H[41]]);
        if (this.isHolding(v6)) {
            var70_27 = FuntimeHelperModule.H[42];
            var70_27 -= FuntimeHelperModule.H[43];
            v7 = var70_27 -= FuntimeHelperModule.H[44];
        } else lbl-1000:
        // 2 sources

        {
            var72_28 = FuntimeHelperModule.H[45];
            var72_28 += FuntimeHelperModule.H[46];
            v7 = var72_28 += FuntimeHelperModule.H[47];
        }
        var74_29 = FuntimeHelperModule.H[48];
        var74_29 -= FuntimeHelperModule.H[49];
        v8 = var29_13;
        var76_30 = FuntimeHelperModule.H[51];
        var76_30 ^= FuntimeHelperModule.H[52];
        var29_13 = v8 ^ ((long)v7 << (var74_29 ^= FuntimeHelperModule.H[50]) ^ v8) & -1L << (var76_30 ^= FuntimeHelperModule.H[53]);
        if (!((Boolean)FuntimeHelperModule.D.getValue()).booleanValue()) ** GOTO lbl-1000
        v9 = Items.SUGAR;
        var78_31 = FuntimeHelperModule.H[54];
        var78_31 -= FuntimeHelperModule.H[55];
        Intrinsics.checkNotNullExpressionValue(v9, (String)FuntimeHelperModule.f[var78_31 -= FuntimeHelperModule.H[56]]);
        if (this.isHolding(v9)) {
            var80_32 = FuntimeHelperModule.H[57];
            var80_32 += FuntimeHelperModule.H[58];
            v10 = var80_32 -= FuntimeHelperModule.H[59];
        } else lbl-1000:
        // 2 sources

        {
            var82_33 = FuntimeHelperModule.H[60];
            var82_33 ^= FuntimeHelperModule.H[61];
            v10 = var82_33 += FuntimeHelperModule.H[62];
        }
        v11 = var29_13;
        var84_34 = FuntimeHelperModule.H[63];
        var84_34 ^= FuntimeHelperModule.H[64];
        var29_13 = v11 ^ ((long)v10 ^ v11) & -1L >>> (var84_34 ^= FuntimeHelperModule.H[65]);
        if (!((Boolean)FuntimeHelperModule.e.getValue()).booleanValue()) ** GOTO lbl-1000
        v12 = Items.FIRE_CHARGE;
        var86_35 = FuntimeHelperModule.H[66];
        var86_35 -= FuntimeHelperModule.H[67];
        Intrinsics.checkNotNullExpressionValue(v12, (String)FuntimeHelperModule.f[var86_35 ^= FuntimeHelperModule.H[68]]);
        if (this.isHolding(v12)) {
            var88_36 = FuntimeHelperModule.H[69];
            var88_36 += FuntimeHelperModule.H[70];
            v13 = var88_36 ^= FuntimeHelperModule.H[71];
        } else lbl-1000:
        // 2 sources

        {
            var90_37 = FuntimeHelperModule.H[72];
            var90_37 ^= FuntimeHelperModule.H[73];
            v13 = var90_37 += FuntimeHelperModule.H[74];
        }
        var92_38 = FuntimeHelperModule.H[75];
        var92_38 += FuntimeHelperModule.H[76];
        v14 = var31_14;
        var94_39 = FuntimeHelperModule.H[78];
        var94_39 ^= FuntimeHelperModule.H[79];
        var31_14 = v14 ^ ((long)v13 << (var92_38 += FuntimeHelperModule.H[77]) ^ v14) & -1L << (var94_39 += FuntimeHelperModule.H[80]);
        if (!((Boolean)FuntimeHelperModule.E.getValue()).booleanValue()) ** GOTO lbl-1000
        v15 = Items.PHANTOM_MEMBRANE;
        var96_40 = FuntimeHelperModule.H[81];
        var96_40 += FuntimeHelperModule.H[82];
        var98_41 = FuntimeHelperModule.H[84];
        var98_41 += FuntimeHelperModule.H[85];
        Intrinsics.checkNotNullExpressionValue(v15, (String)FuntimeHelperModule.f[var96_40 ^= FuntimeHelperModule.H[83]] + (String)FuntimeHelperModule.f[var98_41 -= FuntimeHelperModule.H[86]]);
        if (this.isHolding(v15)) {
            var100_42 = FuntimeHelperModule.H[87];
            var100_42 ^= FuntimeHelperModule.H[88];
            v16 = var100_42 -= FuntimeHelperModule.H[89];
        } else lbl-1000:
        // 2 sources

        {
            var102_43 = FuntimeHelperModule.H[90];
            var102_43 ^= FuntimeHelperModule.H[91];
            v16 = var102_43 ^= FuntimeHelperModule.H[92];
        }
        v17 = var31_14;
        var104_44 = FuntimeHelperModule.H[93];
        var104_44 -= FuntimeHelperModule.H[94];
        var31_14 = v17 ^ ((long)v16 ^ v17) & -1L >>> (var104_44 += FuntimeHelperModule.H[95]);
        var106_45 = FuntimeHelperModule.H[96];
        var106_45 ^= FuntimeHelperModule.H[97];
        if ((int)(var27_12 >>> (var106_45 ^= FuntimeHelperModule.H[98])) == 0 && (int)var27_12 == 0) {
            var108_46 = FuntimeHelperModule.H[99];
            var108_46 += FuntimeHelperModule.H[100];
            if ((int)(var29_13 >>> (var108_46 ^= FuntimeHelperModule.H[101])) == 0 && (int)var29_13 == 0) {
                var110_47 = FuntimeHelperModule.H[102];
                var110_47 += FuntimeHelperModule.H[103];
                if ((int)(var31_14 >>> (var110_47 ^= FuntimeHelperModule.H[104])) == 0 && (int)var31_14 == 0) {
                    return;
                }
            }
        }
        var112_48 = FuntimeHelperModule.H[105];
        var112_48 -= FuntimeHelperModule.H[106];
        var9_49 = (AutoCloseable)new BufferAllocator(var112_48 += FuntimeHelperModule.H[107]);
        var10_50 = null;
        try {
            var11_51 /* !! */  = (BufferAllocator)var9_49;
            v18 = var33_2;
            var114_52 = FuntimeHelperModule.H[108];
            var114_52 ^= FuntimeHelperModule.H[109];
            var33_2 = v18 ^ (0L ^ v18) & -1L << (var114_52 ^= FuntimeHelperModule.H[110]);
            var13_53 = VertexConsumerProvider.immediate((BufferAllocator)var11_51 /* !! */ );
            var116_54 = FuntimeHelperModule.H[111];
            var116_54 -= FuntimeHelperModule.H[112];
            var14_55 = var13_53.getBuffer(RainRenderLayers.getHitBoxQuad((boolean)(var116_54 ^= FuntimeHelperModule.H[113])));
            var118_56 = FuntimeHelperModule.H[114];
            var118_56 ^= FuntimeHelperModule.H[115];
            if ((int)(var27_12 >>> (var118_56 -= FuntimeHelperModule.H[116])) != 0 || (int)var27_12 != 0) {
                var120_57 = FuntimeHelperModule.H[117];
                var120_57 ^= FuntimeHelperModule.H[118];
                var15_58 = (AutoCloseable)new BufferAllocator(var120_57 += FuntimeHelperModule.H[119]);
                var16_59 = null;
                try {
                    var17_60 /* !! */  = (BufferAllocator)var15_58;
                    v19 = var35_3;
                    var122_61 = FuntimeHelperModule.H[120];
                    var122_61 += FuntimeHelperModule.H[121];
                    var35_3 = v19 ^ (0L ^ v19) & -1L >>> (var122_61 += FuntimeHelperModule.H[122]);
                    var19_62 = VertexConsumerProvider.immediate((BufferAllocator)var17_60 /* !! */ );
                    var20_63 = var19_62.getBuffer(RainRenderLayers.getHitBoxLine((double)1.0));
                    var124_64 = FuntimeHelperModule.H[123];
                    var124_64 -= FuntimeHelperModule.H[124];
                    if ((int)(var27_12 >>> (var124_64 -= FuntimeHelperModule.H[125])) != 0) {
                        Intrinsics.checkNotNull(var14_55);
                        Intrinsics.checkNotNull(var20_63);
                        FuntimeHelperModule.INSTANCE.renderTrapkaCube(event, var14_55, var20_63, var2_16.x, var2_16.y, var2_16.z);
                    }
                    if ((int)var27_12 != 0) {
                        Intrinsics.checkNotNull(var14_55);
                        Intrinsics.checkNotNull(var20_63);
                        FuntimeHelperModule.INSTANCE.renderPlastPreview(event, var14_55, var20_63, var2_16.x, var2_16.y, var2_16.z);
                    }
                    var126_65 = FuntimeHelperModule.H[126];
                    var126_65 ^= FuntimeHelperModule.H[127];
                    v20 = (int)(var29_13 >>> (var126_65 -= FuntimeHelperModule.H[128]));
                    v21 = (int)var29_13;
                    var128_66 = FuntimeHelperModule.H[129];
                    var128_66 += FuntimeHelperModule.H[130];
                    v22 = (int)(var31_14 >>> (var128_66 -= FuntimeHelperModule.H[131]));
                    v23 = (int)var31_14;
                    Intrinsics.checkNotNull(var13_53);
                    FuntimeHelperModule.onRender3D$renderCircles((boolean)v20, event, (boolean)v21, (boolean)v22, (boolean)v23, var13_53);
                    var13_53.draw();
                    var19_62.draw();
                    var17_60 /* !! */  = Unit.INSTANCE;
                }
                catch (Throwable var18_67) {
                    var16_59 = var18_67;
                    throw var18_67;
                }
                finally {
                    AutoCloseableKt.closeFinally(var15_58, var16_59);
                }
            } else {
                var130_69 = FuntimeHelperModule.H[132];
                var130_69 += FuntimeHelperModule.H[133];
                v24 = (int)(var29_13 >>> (var130_69 ^= FuntimeHelperModule.H[134]));
                v25 = (int)var29_13;
                var132_70 = FuntimeHelperModule.H[135];
                var132_70 += FuntimeHelperModule.H[136];
                v26 = (int)(var31_14 >>> (var132_70 += FuntimeHelperModule.H[137]));
                v27 = (int)var31_14;
                Intrinsics.checkNotNull(var13_53);
                FuntimeHelperModule.onRender3D$renderCircles((boolean)v24, event, (boolean)v25, (boolean)v26, (boolean)v27, var13_53);
                var13_53.draw();
            }
            var11_51 /* !! */  = Unit.INSTANCE;
        }
        catch (Throwable var12_71) {
            var10_50 = var12_71;
            throw var12_71;
        }
        finally {
            AutoCloseableKt.closeFinally(var9_49, var10_50);
        }
    }

    private final void renderTrapkaCube(Render3DEvent event, VertexConsumer quadBuffer, VertexConsumer lineBuffer, double cameraX, double cameraY, double cameraZ) {
        Color color;
        int n2;
        long l2 = -8950963691490404660L;
        ClientPlayerEntity clientPlayerEntity = kotakbaz.rain.client.extensions.b.getMc().player;
        if (clientPlayerEntity == null) {
            return;
        }
        ClientPlayerEntity clientPlayerEntity2 = clientPlayerEntity;
        BlockPos blockPos = BlockPos.ofFloored((double)clientPlayerEntity2.getX(), (double)clientPlayerEntity2.getY(), (double)clientPlayerEntity2.getZ());
        double d2 = (Boolean)c.getValue() != false ? Double.longBitsToDouble(0x601F3CE75EDF4311L ^ 0x201F3CE75EDF4311L) : 0.0;
        double d3 = (Boolean)c.getValue() != false ? 1.0 : 0.0;
        double d4 = (double)blockPos.getX() - Double.longBitsToDouble(0x7DA00369A4C94E41L ^ 0x3DA00369A4C94E41L) - d3;
        double d5 = (double)blockPos.getY() - Double.longBitsToDouble(0xF844C291EFFC3811L ^ 0xB844C291EFFC3811L) + Double.longBitsToDouble(0xE30F19F0E3DD783EL ^ 0xA30F0D8A029AD62AL);
        double d6 = (double)blockPos.getZ() - Double.longBitsToDouble(0x626CCD6F60209061L ^ 0x226CCD6F60209061L) - d3;
        double d7 = d4 + Double.longBitsToDouble(0x8E6B5C021ED111C4L ^ 0xCE7F563F6E72C6CEL) + d2;
        double d8 = d5 + Double.longBitsToDouble(0xA59929974538956EL ^ 0xE58923AA359B4264L) + d2;
        double d9 = d6 + Double.longBitsToDouble(0x5DE821B9191228FDL ^ 0x1DFC21B9191228FDL) + d2;
        if (((Boolean)C.getValue()).booleanValue() && this.hasPlayerInRadius(Double.longBitsToDouble(0xC960D17EDC3F24DFL ^ 0x89681DB210F3E812L))) {
            int n3 = H[138];
            n3 -= H[139];
            n2 = n3 ^= H[140];
        } else {
            int n4 = H[141];
            n4 -= H[142];
            n2 = n4 ^= H[143];
        }
        int n5 = H[144];
        n5 ^= H[145];
        long l3 = l2;
        int n6 = H[147];
        n6 += H[148];
        l2 = l3 ^ ((long)n2 << (n5 -= H[146]) ^ l3) & -1L << (n6 ^= H[149]);
        int n7 = H[150];
        n7 ^= H[151];
        if ((int)(l2 >>> (n7 ^= H[152])) != 0) {
            int n8 = H[153];
            n8 -= H[154];
            n8 += H[155];
            int n9 = H[156];
            n9 ^= H[157];
            int n10 = H[159];
            n10 -= H[160];
            int n11 = H[162];
            n11 -= H[163];
            Color color2 = new Color(n8, n9 ^= H[158], n10 ^= H[161], n11 += H[164]);
            color = color2;
        } else {
            int n12 = H[165];
            n12 += H[166];
            n12 -= H[167];
            int n13 = H[168];
            n13 ^= H[169];
            int n14 = H[171];
            n14 ^= H[172];
            int n15 = H[174];
            n15 -= H[175];
            Color color3 = new Color(n12, n13 += H[170], n14 -= H[173], n15 ^= H[176]);
            color = color3;
        }
        Color color4 = color;
        int n16 = H[177];
        n16 += H[178];
        Color color5 = new Color(color4.getRed(), color4.getGreen(), color4.getBlue(), n16 -= H[179]);
        Box box = new Box(d4, d5, d6, d7, d8, d9).offset(-cameraX, -cameraY, -cameraZ);
        Intrinsics.checkNotNull(box);
        boolean bl = H[180];
        bl ^= H[181];
        bl ^= H[182];
        boolean bl2 = H[183];
        bl2 ^= H[184];
        boolean bl3 = H[186];
        bl3 -= H[187];
        int n17 = H[189];
        n17 -= H[190];
        CustomHitBoxRenderer.draw$default(CustomHitBoxRenderer.INSTANCE, event, quadBuffer, null, box, color5, bl, bl2 -= H[185], bl3 ^= H[188], 0.0f, 0.0f, n17 -= H[191], null);
        boolean bl4 = H[192];
        bl4 -= H[193];
        boolean bl5 = H[195];
        bl5 ^= H[196];
        boolean bl6 = H[198];
        bl6 ^= H[199];
        CustomHitBoxRenderer.INSTANCE.draw(event, quadBuffer, lineBuffer, box, color4, bl4 += H[194], bl5 += H[197], bl6 ^= H[200], 1.0f, 0.0f);
    }

    private final void renderPlastPreview(Render3DEvent event, VertexConsumer quadBuffer, VertexConsumer lineBuffer, double cameraX, double cameraY, double cameraZ) {
        Color color;
        int n2;
        long l2 = 564428121943106476L;
        List<Box> list = this.collectPlastPreviewBoxes();
        if (list.isEmpty()) {
            return;
        }
        if (((Boolean)C.getValue()).booleanValue() && this.hasPlayerInBoxes(list)) {
            int n3 = H[201];
            n3 += H[202];
            n2 = n3 ^= H[203];
        } else {
            int n4 = H[204];
            n4 += H[205];
            n2 = n4 += H[206];
        }
        int n5 = H[207];
        n5 -= H[208];
        long l3 = l2;
        int n6 = H[210];
        n6 += H[211];
        l2 = l3 ^ ((long)n2 << (n5 ^= H[209]) ^ l3) & -1L << (n6 -= H[212]);
        int n7 = H[213];
        n7 ^= H[214];
        if ((int)(l2 >>> (n7 -= H[215])) != 0) {
            int n8 = H[216];
            n8 ^= H[217];
            n8 ^= H[218];
            int n9 = H[219];
            n9 += H[220];
            int n10 = H[222];
            n10 += H[223];
            int n11 = H[225];
            n11 += H[226];
            Color color2 = new Color(n8, n9 -= H[221], n10 -= H[224], n11 += H[227]);
            color = color2;
        } else {
            int n12 = H[228];
            n12 += H[229];
            n12 += H[230];
            int n13 = H[231];
            n13 ^= H[232];
            int n14 = H[234];
            n14 ^= H[235];
            int n15 = H[237];
            n15 += H[238];
            Color color3 = new Color(n12, n13 ^= H[233], n14 ^= H[236], n15 += H[239]);
            color = color3;
        }
        Color color4 = color;
        int n16 = H[240];
        n16 += H[241];
        Color color5 = new Color(color4.getRed(), color4.getGreen(), color4.getBlue(), n16 -= H[242]);
        for (Box box : list) {
            Box box2 = box.offset(-cameraX, -cameraY, -cameraZ);
            Intrinsics.checkNotNull(box2);
            boolean bl = H[243];
            bl ^= H[244];
            bl += H[245];
            boolean bl2 = H[246];
            bl2 -= H[247];
            boolean bl3 = H[249];
            bl3 += H[250];
            int n17 = H[252];
            n17 ^= H[253];
            CustomHitBoxRenderer.draw$default(CustomHitBoxRenderer.INSTANCE, event, quadBuffer, null, box2, color5, bl, bl2 -= H[248], bl3 ^= H[251], 0.0f, 0.0f, n17 += H[254], null);
            boolean bl4 = H[255];
            bl4 ^= H[256];
            boolean bl5 = H[258];
            bl5 -= H[259];
            boolean bl6 = H[261];
            bl6 += H[262];
            CustomHitBoxRenderer.INSTANCE.draw(event, quadBuffer, lineBuffer, box2, color4, bl4 += H[257], bl5 -= H[260], bl6 -= H[263], 1.0f, 0.0f);
        }
    }

    private final void renderCircle(Render3DEvent event, VertexConsumerProvider.Immediate consumers, double radius, int segments, float lineWidth) {
        Color color;
        long l2 = -7788276859322727488L;
        long l3 = -3263211371395557899L;
        long l4 = -2799868718149154803L;
        long l5 = 6645032816701641556L;
        ClientPlayerEntity clientPlayerEntity = kotakbaz.rain.client.extensions.b.getMc().player;
        if (clientPlayerEntity == null) {
            return;
        }
        ClientPlayerEntity clientPlayerEntity2 = clientPlayerEntity;
        Vec3d vec3d = kotakbaz.rain.client.extensions.b.getMc().gameRenderer.getCamera().getPos();
        Vec3d vec3d2 = clientPlayerEntity2.getLerpedPos(event.getPartialTicks());
        double d2 = vec3d2.x - vec3d.x;
        double d3 = vec3d2.y - vec3d.y + Double.longBitsToDouble(0xDD7DA3EB02E59561L ^ 0xE28E90D831D6A652L);
        double d4 = vec3d2.z - vec3d.z;
        double d5 = Math.sqrt(d2 * d2 + d3 * d3 + d4 * d4);
        float f2 = RangesKt.coerceIn((float)((double)lineWidth / Math.max(1.0, d5 / Double.longBitsToDouble(0x14419C4670E54DABL ^ 0x54759C4670E54DABL))), 1.0f, lineWidth);
        VertexConsumer vertexConsumer = consumers.getBuffer(RenderLayer.getDebugLineStrip((double)f2));
        int n2 = H[264];
        n2 -= H[265];
        long l6 = l5;
        int n3 = H[267];
        n3 += H[268];
        l5 = l6 ^ ((long)this.hasPlayerInRadius(radius) << (n2 += H[266]) ^ l6) & -1L << (n3 -= H[269]);
        int n4 = H[270];
        n4 += H[271];
        if ((int)(l5 >>> (n4 += H[272])) != 0) {
            int n5 = H[273];
            n5 -= H[274];
            n5 += H[275];
            int n6 = H[276];
            n6 -= H[277];
            int n7 = H[279];
            n7 += H[280];
            int n8 = H[282];
            n8 -= H[283];
            Color color2 = new Color(n5, n6 -= H[278], n7 += H[281], n8 += H[284]);
            color = color2;
        } else {
            int n9 = H[285];
            n9 -= H[286];
            n9 -= H[287];
            int n10 = H[288];
            n10 += H[289];
            int n11 = H[291];
            n11 += H[292];
            int n12 = H[294];
            n12 -= H[295];
            Color color3 = new Color(n9, n10 ^= H[290], n11 -= H[293], n12 ^= H[296]);
            color = color3;
        }
        Color color4 = color;
        MatrixStack.Entry entry = event.getMatrices().peek();
        long l7 = l4;
        int n13 = H[297];
        n13 ^= H[298];
        l4 = l7 ^ (0L ^ l7) & -1L << (n13 -= H[299]);
        int n14 = H[300];
        n14 -= H[301];
        if ((int)(l4 >>> (n14 += H[302])) <= segments) {
            while (true) {
                int n15 = H[303];
                n15 -= H[304];
                double d6 = Double.longBitsToDouble(0xBA3E76C5A9765A1CL ^ 0xFA27573EFD327704L) * (double)((int)(l4 >>> (n15 -= H[305]))) / (double)segments;
                double d7 = d2 + Math.cos(d6) * radius;
                double d8 = d4 + Math.sin(d6) * radius;
                vertexConsumer.vertex(entry, (float)d7, (float)d3, (float)d8).color(color4.getRed(), color4.getGreen(), color4.getBlue(), color4.getAlpha()).normal(entry, 0.0f, 1.0f, 0.0f);
                int n16 = H[306];
                n16 -= H[307];
                if ((int)(l4 >>> (n16 -= H[308])) == segments) break;
                l4 += 0x100000000L;
            }
        }
    }

    private final List<Box> collectPlastPreviewBoxes() {
        List<Box> list;
        long l2 = -2521684955522700741L;
        long l3 = -8524605724444945774L;
        long l4 = -7083905548694027918L;
        long l5 = -6179402526683207396L;
        ClientPlayerEntity clientPlayerEntity = kotakbaz.rain.client.extensions.b.getMc().player;
        if (clientPlayerEntity == null) {
            return CollectionsKt.emptyList();
        }
        ClientPlayerEntity clientPlayerEntity2 = clientPlayerEntity;
        BlockPos blockPos = BlockPos.ofFloored((double)clientPlayerEntity2.getX(), (double)clientPlayerEntity2.getY(), (double)clientPlayerEntity2.getZ());
        float f2 = clientPlayerEntity2.getPitch();
        if (Math.abs(f2) > 45.0f) {
            double d2 = f2 > 0.0f ? Double.longBitsToDouble(0x4082B710820E2AC7L ^ 0x808AB710820E2AC7L) : Double.longBitsToDouble(0xDBDFB8AD06633B97L ^ 0x9BDFB8AD06633B97L);
            return CollectionsKt.listOf(new Box((double)blockPos.getX() - Double.longBitsToDouble(0x71471CE69D37E21CL ^ 0x31471CE69D37E21CL), (double)blockPos.getY() + d2, (double)blockPos.getZ() - Double.longBitsToDouble(0x83992FC9E82FB1B8L ^ 0xC3992FC9E82FB1B8L), (double)blockPos.getX() + Double.longBitsToDouble(0x379191EDD5174307L ^ 0x779991EDD5174307L), (double)blockPos.getY() + d2 + Double.longBitsToDouble(0x9CC9926EA695F66AL ^ 0xDCC9926EA695F66AL), (double)blockPos.getZ() + Double.longBitsToDouble(0xE58C3216DE72FBDBL ^ 0xA5843216DE72FBDBL)));
        }
        Pair<Integer, Integer> pair = this.directionFromYaw(clientPlayerEntity2.getYaw());
        int n2 = H[309];
        n2 += H[310];
        long l6 = l5;
        int n3 = H[312];
        n3 -= H[313];
        long l7 = l5 = l6 ^ ((long)((Number)pair.component1()).intValue() << (n2 ^= H[311]) ^ l6) & -1L << (n3 -= H[314]);
        int n4 = H[315];
        n4 -= H[316];
        l5 = l7 ^ ((long)((Number)pair.component2()).intValue() ^ l7) & -1L >>> (n4 -= H[317]);
        int n5 = H[318];
        n5 -= H[319];
        if ((int)(l5 >>> (n5 += H[320])) == 0 || (int)l5 == 0) {
            Intrinsics.checkNotNull(blockPos);
            int n6 = H[321];
            n6 += H[322];
            list = CollectionsKt.listOf(this.createCardinalPlastBox(blockPos, (int)(l5 >>> (n6 += H[323])), (int)l5));
        } else {
            Intrinsics.checkNotNull(blockPos);
            int n7 = H[324];
            n7 += H[325];
            list = this.createDiagonalPlastBoxes(blockPos, (int)(l5 >>> (n7 -= H[326])), (int)l5);
        }
        return list;
    }

    private final Box createCardinalPlastBox(BlockPos blockPos, int dirX, int dirZ) {
        Box box;
        double d2 = blockPos.getX();
        double d3 = blockPos.getY();
        double d4 = blockPos.getZ();
        int n2 = H[327];
        n2 -= H[328];
        if (dirZ == (n2 ^= H[329])) {
            box = new Box(d2 - Double.longBitsToDouble(0x8591F329360DAFCL ^ 0x48591F329360DAFCL), d3 - 1.0, d4 + Double.longBitsToDouble(0x80B3731D4B58D9E1L ^ 0xC0B3731D4B58D9E1L), d2 + Double.longBitsToDouble(0x710B459891CB46E2L ^ 0x3103459891CB46E2L), d3 + Double.longBitsToDouble(0x70E92B2B1800C762L ^ 0x30F92B2B1800C762L), d4 + Double.longBitsToDouble(0x19962216A459C479L ^ 0x59862216A459C479L));
        } else {
            int n3 = H[330];
            n3 += H[331];
            if (dirZ == (n3 ^= H[332])) {
                box = new Box(d2 - Double.longBitsToDouble(0x13F1F658B5719653L ^ 0x53F1F658B5719653L), d3 - 1.0, d4 - Double.longBitsToDouble(0xF48BD03798E7A0E5L ^ 0xB483D03798E7A0E5L), d2 + Double.longBitsToDouble(0x2C60455415FED889L ^ 0x6C68455415FED889L), d3 + Double.longBitsToDouble(0x93075DEAF636260CL ^ 0xD3175DEAF636260CL), d4 - 1.0);
            } else {
                int n4 = H[333];
                n4 += H[334];
                box = dirX == (n4 -= H[335]) ? new Box(d2 + Double.longBitsToDouble(0xF0AACB8B17023792L ^ 0xB0AACB8B17023792L), d3 - 1.0, d4 - Double.longBitsToDouble(0xB6DC9E41D491E47EL ^ 0xF6DC9E41D491E47EL), d2 + Double.longBitsToDouble(0xD64C841DF55F0905L ^ 0x965C841DF55F0905L), d3 + Double.longBitsToDouble(0x3B2C4B721D021D4EL ^ 0x7B3C4B721D021D4EL), d4 + Double.longBitsToDouble(0xE278222285743528L ^ 0xA270222285743528L)) : new Box(d2 - Double.longBitsToDouble(0x513F929E99D0E44FL ^ 0x1137929E99D0E44FL), d3 - 1.0, d4 - Double.longBitsToDouble(0xC7C720F4E47CCC02L ^ 0x87C720F4E47CCC02L), d2 - 1.0, d3 + Double.longBitsToDouble(0x23531EF4679C61C5L ^ 0x63431EF4679C61C5L), d4 + Double.longBitsToDouble(0x5165744CA8DF8CD1L ^ 0x116D744CA8DF8CD1L));
            }
        }
        return box;
    }

    private final List<Box> createDiagonalPlastBoxes(BlockPos blockPos, int dirX, int dirZ) {
        long l2 = -4616105105273448879L;
        long l3 = -227907364752438795L;
        long l4 = -5638914569986327299L;
        long l5 = -6473919155089834002L;
        long l6 = 6465512113037261949L;
        long l7 = -7679892399911741675L;
        long l8 = -5026497618610104507L;
        long l9 = 5276318435849349482L;
        long l10 = 8742016434356160784L;
        long l11 = 8083993412562879192L;
        long l12 = 5570018324195298802L;
        long l13 = -3053737838214475677L;
        long l14 = -3741345442381642067L;
        int n2 = H[336];
        n2 += H[337];
        long l15 = l14;
        int n3 = H[339];
        n3 += H[340];
        l14 = l15 ^ ((long)(blockPos.getX() + dirX * (n2 ^= H[338])) ^ l15) & -1L >>> (n3 += H[341]);
        int n4 = H[342];
        n4 += H[343];
        long l16 = l9;
        int n5 = H[345];
        n5 -= H[346];
        l9 = l16 ^ ((long)(blockPos.getZ() + dirZ * (n4 += H[344])) ^ l16) & -1L >>> (n5 ^= H[347]);
        int n6 = H[348];
        n6 += H[349];
        long l17 = l10;
        int n7 = H[351];
        n7 += H[352];
        long l18 = l10 = l17 ^ ((long)(-dirZ) << (n6 += H[350]) ^ l17) & -1L << (n7 += H[353]);
        int n8 = H[354];
        n8 -= H[355];
        l10 = l18 ^ ((long)dirX ^ l18) & -1L >>> (n8 -= H[356]);
        int n9 = H[357];
        n9 ^= H[358];
        n9 ^= H[359];
        int n10 = H[360];
        n10 += H[361];
        long l19 = l11;
        int n11 = H[363];
        n11 ^= H[364];
        l11 = l19 ^ ((long)(blockPos.getY() + n9) << (n10 += H[362]) ^ l19) & -1L << (n11 += H[365]);
        int n12 = H[366];
        n12 += H[367];
        int n13 = H[369];
        n13 -= H[370];
        Iterable iterable = new IntRange(n12 -= H[368], n13 -= H[371]);
        long l20 = l11;
        int n14 = H[372];
        n14 -= H[373];
        l11 = l20 ^ (0L ^ l20) & -1L >>> (n14 ^= H[374]);
        Iterable iterable2 = iterable;
        int n15 = H[375];
        n15 ^= H[376];
        Collection collection = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, n15 -= H[377]));
        long l21 = l12;
        int n16 = H[378];
        n16 ^= H[379];
        l12 = l21 ^ (0L ^ l21) & -1L << (n16 += H[380]);
        Iterator iterator2 = iterable2.iterator();
        while (iterator2.hasNext()) {
            int n17 = H[381];
            n17 += H[382];
            long l22 = l13;
            int n18 = H[384];
            n18 += H[385];
            l13 = l22 ^ ((long)((IntIterator)iterator2).nextInt() << (n17 -= H[383]) ^ l22) & -1L << (n18 += H[386]);
            int n19 = H[387];
            n19 += H[388];
            long l23 = l13;
            int n20 = H[390];
            n20 ^= H[391];
            l13 = l23 ^ ((long)((int)(l13 >>> (n19 += H[389]))) ^ l23) & -1L >>> (n20 ^= H[392]);
            Collection collection2 = collection;
            long l24 = l14;
            int n21 = H[393];
            n21 += H[394];
            l14 = l24 ^ (0L ^ l24) & -1L << (n21 += H[395]);
            int n22 = H[396];
            n22 += H[397];
            n22 += H[398];
            int n23 = H[399];
            n23 ^= 0x78;
            long l25 = l7;
            int n24 = -46;
            n24 -= -69;
            l7 = l25 ^ ((long)((int)l14 + (int)l13 * (int)(l10 >>> n22)) << (n23 -= 108) ^ l25) & -1L << (n24 ^= 0x37);
            int n25 = -15;
            n25 += 53;
            long l26 = l8;
            int n26 = -33;
            n26 ^= 0xFFFFFF86;
            l8 = l26 ^ ((long)((int)l9 + (int)l13 * (int)l10) << (n25 -= 6) ^ l26) & -1L << (n26 -= 57);
            int n27 = -26;
            n27 += 33;
            n27 += 25;
            int n28 = 88;
            n28 ^= 0xFFFFFFEB;
            n28 -= -109;
            int n29 = 92;
            n29 += -115;
            n29 -= -25;
            int n30 = 47;
            n30 += -21;
            n30 ^= 0x3A;
            int n31 = 8;
            n31 += 35;
            n31 -= 11;
            int n32 = 186;
            n32 -= 98;
            n32 += -87;
            int n33 = -56;
            n33 -= -57;
            n33 += 31;
            int n34 = 154;
            n34 += -43;
            n34 ^= 0x6C;
            int n35 = -61;
            n35 -= -114;
            int n36 = 23;
            n36 += 41;
            collection2.add(new Box((double)((int)(l7 >>> n27)), (double)((int)(l11 >>> n28) - n29), (double)((int)(l8 >>> n30)), (double)((int)(l7 >>> n31) + n32), (double)((int)(l11 >>> n33) + n34), (double)((int)(l8 >>> (n35 -= 21)) + (n36 += -63))));
        }
        return (List)collection;
    }

    private final Pair<Integer, Integer> directionFromYaw(float yaw) {
        Pair<Integer, Integer> pair;
        float f2 = (yaw % 360.0f + 360.0f) % 360.0f;
        if (f2 >= 337.5f || f2 < 22.5f) {
            int n2 = -126;
            n2 += 78;
            int n3 = -62;
            n3 -= -105;
            pair = TuplesKt.to(n2 ^= 0xFFFFFFD0, n3 ^= 0x2A);
        } else if (f2 < 67.5f) {
            int n4 = 8;
            n4 -= 71;
            int n5 = -87;
            n5 += 113;
            pair = TuplesKt.to(n4 += 62, n5 ^= 0x1B);
        } else if (f2 < 112.5f) {
            int n6 = -61;
            n6 -= -4;
            int n7 = 1;
            n7 -= -40;
            pair = TuplesKt.to(n6 ^= 0x38, n7 -= 41);
        } else if (f2 < 157.5f) {
            int n8 = -58;
            n8 -= -42;
            int n9 = -31;
            n9 += 84;
            pair = TuplesKt.to(n8 -= -15, n9 ^= 0xFFFFFFCA);
        } else if (f2 < 202.5f) {
            int n10 = -31;
            n10 += 99;
            int n11 = -96;
            n11 -= -3;
            pair = TuplesKt.to(n10 -= 68, n11 ^= 0x5C);
        } else if (f2 < 247.5f) {
            int n12 = 116;
            n12 ^= 0xFFFFFFCF;
            int n13 = 169;
            n13 += -97;
            pair = TuplesKt.to(n12 += 70, n13 += -73);
        } else if (f2 < 292.5f) {
            int n14 = 8;
            n14 -= 70;
            int n15 = 17;
            n15 -= 80;
            pair = TuplesKt.to(n14 += 63, n15 ^= 0xFFFFFFC1);
        } else {
            int n16 = 35;
            n16 ^= 0x7D;
            int n17 = 188;
            n17 -= 116;
            pair = TuplesKt.to(n16 ^= 0x5F, n17 += -71);
        }
        return pair;
    }

    private final boolean isHolding(Item item) {
        int n2;
        ClientPlayerEntity clientPlayerEntity = kotakbaz.rain.client.extensions.b.getMc().player;
        if (clientPlayerEntity == null) {
            int n3 = 112;
            n3 = n3 - 37;
            boolean bl2 = n3 - 75;
            return bl2;
        }
        ClientPlayerEntity clientPlayerEntity2 = clientPlayerEntity;
        if (clientPlayerEntity2.getMainHandStack().isOf(item) || clientPlayerEntity2.getOffHandStack().isOf(item)) {
            int n4 = -100;
            n4 -= -73;
            n2 = n4 += 28;
        } else {
            int n5 = -21;
            n5 += -57;
            n2 = n5 -= -78;
        }
        return n2 != 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    private final boolean hasPlayerInBoxes(List<? extends Box> boxes) {
        int n2;
        int n3;
        long l2 = 8973229578945711773L;
        long l3 = 6209622307677326914L;
        ClientPlayerEntity clientPlayerEntity = kotakbaz.rain.client.extensions.b.getMc().player;
        if (clientPlayerEntity == null) {
            int n5 = 63;
            n5 = n5 ^ 0xFFFFFFDC;
            return n5 - -29;
        }
        ClientPlayerEntity clientPlayerEntity2 = clientPlayerEntity;
        ClientWorld clientWorld = kotakbaz.rain.client.extensions.b.getMc().world;
        if (clientWorld == null) {
            return 0 != 0;
        }
        ClientWorld clientWorld2 = clientWorld;
        List list = clientWorld2.getPlayers();
        int n6 = 46;
        n6 ^= 0x73;
        Intrinsics.checkNotNullExpressionValue(list, (String)f[n6 += -88]);
        Iterable iterable = list;
        long l4 = l2;
        int n7 = 43;
        n7 += -65;
        l2 = l4 ^ (0L ^ l4) & -1L << (n7 += 54);
        if (iterable instanceof Collection && ((Collection)iterable).isEmpty()) {
            int n8 = 79;
            n8 -= 21;
            n3 = n8 ^= 0x3A;
            return n3 != 0;
        }
        Iterator iterator2 = iterable.iterator();
        do {
            if (!iterator2.hasNext()) {
                int n9 = -31;
                n9 += 40;
                n3 = n9 -= 9;
                return n3 != 0;
            }
            Object t2 = iterator2.next();
            AbstractClientPlayerEntity abstractClientPlayerEntity = (AbstractClientPlayerEntity)t2;
            long l5 = l2;
            int n10 = -90;
            n10 += 11;
            l2 = l5 ^ (0L ^ l5) & -1L >>> (n10 ^= 0xFFFFFF91);
            if (!Intrinsics.areEqual(abstractClientPlayerEntity, clientPlayerEntity2)) {
                int n11;
                block10: {
                    Iterable iterable2 = boxes;
                    long l6 = l3;
                    int n12 = -102;
                    n12 -= -42;
                    l3 = l6 ^ (0L ^ l6) & -1L << (n12 += 92);
                    if (iterable2 instanceof Collection && ((Collection)iterable2).isEmpty()) {
                        int n13 = -28;
                        n13 -= -115;
                        n11 = n13 -= 87;
                    } else {
                        for (Object t3 : iterable2) {
                            Box box = (Box)t3;
                            long l7 = l3;
                            int n14 = 95;
                            n14 -= 85;
                            l3 = l7 ^ (0L ^ l7) & -1L >>> (n14 -= -22);
                            if (!box.intersects(abstractClientPlayerEntity.getBoundingBox())) continue;
                            int n15 = 48;
                            n15 -= 49;
                            n11 = n15 ^= 0xFFFFFFFE;
                            break block10;
                        }
                        int n16 = 61;
                        n16 ^= 0x66;
                        n11 = n16 -= 91;
                    }
                }
                if (n11 != 0) {
                    int n17 = -85;
                    n17 ^= 0xFFFFFFEF;
                    n2 = n17 -= 67;
                    continue;
                }
            }
            int n18 = 27;
            n18 -= 97;
            n2 = n18 -= -70;
        } while (n2 == 0);
        int n19 = -39;
        n19 -= -114;
        n3 = n19 -= 74;
        return n3 != 0;
    }

    private final boolean hasPlayerInRadius(double radius) {
        int n2;
        block7: {
            long l2 = -3208467646870901922L;
            ClientPlayerEntity clientPlayerEntity = kotakbaz.rain.client.extensions.b.getMc().player;
            if (clientPlayerEntity == null) {
                int n3 = -166;
                n3 = n3 + 56;
                boolean bl2 = n3 ^ 0xFFFFFF92;
                return bl2;
            }
            ClientPlayerEntity clientPlayerEntity2 = clientPlayerEntity;
            ClientWorld clientWorld = kotakbaz.rain.client.extensions.b.getMc().world;
            if (clientWorld == null) {
                int n5 = 5;
                n5 = n5 + 70;
                boolean bl = n5 - 75;
                return bl;
            }
            ClientWorld clientWorld2 = clientWorld;
            float f2 = (float)radius;
            List list = clientWorld2.getPlayers();
            int n6 = 3;
            n6 += 8;
            Intrinsics.checkNotNullExpressionValue(list, (String)f[n6 += 9]);
            Iterable iterable = list;
            long l3 = l2;
            int n7 = -97;
            n7 -= -99;
            l2 = l3 ^ (0L ^ l3) & -1L << (n7 += 30);
            if (iterable instanceof Collection && ((Collection)iterable).isEmpty()) {
                int n8 = -10;
                n8 ^= 7;
                n2 = n8 ^= 0xFFFFFFF1;
            } else {
                for (Object t2 : iterable) {
                    int n9;
                    AbstractClientPlayerEntity abstractClientPlayerEntity = (AbstractClientPlayerEntity)t2;
                    long l4 = l2;
                    int n10 = 139;
                    n10 += -11;
                    l2 = l4 ^ (0L ^ l4) & -1L >>> (n10 += -96);
                    if (!Intrinsics.areEqual(abstractClientPlayerEntity, clientPlayerEntity2) && abstractClientPlayerEntity.distanceTo((Entity)clientPlayerEntity2) <= f2) {
                        int n11 = -88;
                        n11 += 64;
                        n9 = n11 += 25;
                    } else {
                        int n12 = -57;
                        n12 += 82;
                        n9 = n12 -= 25;
                    }
                    if (n9 == 0) continue;
                    int n13 = 149;
                    n13 -= 112;
                    n2 = n13 += -36;
                    break block7;
                }
                int n14 = -66;
                n14 += 24;
                n2 = n14 += 42;
            }
        }
        return n2 != 0;
    }

    private static final boolean dragonTrap$lambda$0() {
        return (Boolean)b.getValue();
    }

    private static final boolean greenInTarget$lambda$0() {
        int n2;
        if (((Boolean)b.getValue()).booleanValue() || ((Boolean)B.getValue()).booleanValue()) {
            int n3 = 34;
            n3 -= -38;
            n2 = n3 -= 71;
        } else {
            int n4 = -89;
            n4 -= 17;
            n2 = n4 -= -106;
        }
        return n2 != 0;
    }

    private static final void onRender3D$renderCircles(boolean shouldRenderEnderEye, Render3DEvent $event, boolean shouldRenderSugarDust, boolean shouldRenderFireTornado, boolean shouldRenderGodsAura, VertexConsumerProvider.Immediate consumers) {
        if (shouldRenderEnderEye) {
            int n2 = -71;
            n2 -= -8;
            INSTANCE.renderCircle($event, consumers, Double.longBitsToDouble(0xAC21D5F004798BC2L ^ 0xEC05D5F004798BC2L), n2 ^= 0xFFFFFF81, 2.0f);
        }
        if (shouldRenderSugarDust) {
            int n3 = 106;
            n3 -= 3;
            INSTANCE.renderCircle($event, consumers, Double.longBitsToDouble(0xFF81081F288B14D4L ^ 0xBFA5081F288B14D4L), n3 -= 39, 2.0f);
        }
        if (shouldRenderFireTornado) {
            int n4 = -5;
            n4 -= 88;
            INSTANCE.renderCircle($event, consumers, Double.longBitsToDouble(0x4E5C07415A8C3742L ^ 0xE7807415A8C3742L), n4 ^= 0xFFFFFFE3, 2.0f);
        }
        if (shouldRenderGodsAura) {
            int n5 = 119;
            n5 += -73;
            INSTANCE.renderCircle($event, consumers, Double.longBitsToDouble(0x12689AD8DEB019F5L ^ 0x52689AD8DEB019F5L), n5 -= 14, 3.0f);
        }
    }

    static {
        FuntimeHelperModule.b();
        long l2 = -4475423947563084597L;
        long l3 = 7364164923291406003L;
        long l4 = -2615854243346508920L;
        long l5 = -4692973627895873770L;
        long l6 = -4462601805105861066L;
        long l7 = 7819784193585861855L;
        long l8 = -983268913927416409L;
        long l9 = -8724113323335503622L;
        long l10 = -8329531753343697009L;
        long l11 = -701778244558247206L;
        long l12 = -3920144801945483365L;
        long l13 = 3329076159235058093L;
        long l14 = -1439399552904540729L;
        long l15 = -6513402644166697775L;
        int n2 = -2;
        n2 += 0;
        f = new Object[n2 ^= 0xFFFFFFE9];
        long l16 = l15;
        int n3 = 81;
        n3 -= -22;
        l15 = l16 ^ (0L ^ l16) & -1L << (n3 ^= 0x47);
        Object[] objectArray = new Object[3];
        objectArray[0] = F;
        objectArray[1] = 0;
        Object object = FuntimeHelperModule.A()[0];
        if (object == null) {
            char[] cArray = "\u4cd7\u4cd8\u4cb7\u4cf0\u4cc5\u4cd8\u4c2f\u4cee\u4cd4\u4cf0\u4cd4\u4cbf\u4ca9\u4cd8\u4cf2\u4cca\u4c27\u4c21\u4cfc\u4cd2\u4ccb\u4c8c\u4cbc\u4cc5\u4cb5\u4c8c\u4cb1\u4c8f\u4c27\u4cd2\u4cf2\u4cd2\u4cd7\u4cb2\u4cbf\u4c8f\u4c21\u4cdc\u4cbc\u4cfc\u4cbc\u4ca9\u4cb2\u4ce8\u4cd4\u4cab\u4c26\u4cc7\u4cbd\u4365\u4cdf\u4cc9\u4cfc\u4cd8\u4c2f\u4cdc\u4c23\u4365\u4ca9\u4cb1\u4cb5\u4cae\u4cd7\u4cf6\u4ca8\u4c80\u4365\u4cd5\u4cb1\u4c86\u4c80\u4cfc\u4cb5\u4365\u4cdc\u4cf1\u4c25\u4cf6\u4cfd\u4cd3\u4cff\u4cb4\u4c81\u4cb0\u4c2f\u4cb3\u4ca8\u4cbd\u4cb2\u4ca8\u4caa\u4365\u4cd8\u4cbd\u4cd7\u4cb0\u4cd1\u4cff\u4cb5\u4c23\u4c22\u4ccb\u4cc7\u4c80\u4cd2\u4cf1\u4365\u4cf1\u4c8c\u4365\u4cbd\u4c25\u4cb0\u4cce\u4cd7\u4cd5\u4cc8\u4cdc\u4cbf\u4cb4\u4cb0\u4ce8\u4cf0\u4cb2\u4cea\u4cb8\u4cc5\u4cea\u4c22\u4cd3\u4cdf\u4cfd\u4c8c\u4cce\u4cdf\u4c82\u4ca8\u4cfd\u4c23\u4c25\u4c21\u4caa\u4c2f\u4cbc\u4cf2\u4ca8\u4cbc\u4cd4\u4cdd\u4cd1\u4cf3\u4c83\u4c2f\u4cd5\u4cfd\u4c8f\u4cf6\u4cf2\u4cb5\u4cfc\u4c27\u4cbc\u4c25\u4caa\u4cc9\u4cdc\u4c26\u4cea\u4cb5\u4cb7\u4cd3\u4cbf\u4cb0\u4365\u4cc8\u4c22\u4c25\u4caa\u4c80\u4cfd\u4cf6\u4c22\u4caa\u4c26\u4c21\u4cab\u4c23\u4cc5\u4c21\u4cb8\u4cd0\u4c2f\u4cd1\u4cd5\u4cab\u4cd2\u4cd3\u4cdd\u4cf1\u4cee\u4c2f\u4cc8\u4cb5\u4cc7\u4cd0\u4cb4\u4c21\u4cd8\u4c22\u4cf2\u4c20\u4cbc\u4cbc\u4cbc\u4c22\u4c80\u4cbc\u4cce\u4cbc\u4cf6\u4cf0\u4caa\u4ca8\u4cd4\u4cbc\u4ca9\u4cb0\u4cd8\u4cdf\u4cd8\u4cd1\u4cf3\u4cea\u4cd4\u4cd8\u4ca9\u4c27\u4cd8\u4cd2\u4cb3\u4cb2\u4365\u4caa\u4cd8\u4c82\u4c23\u4cf0\u4cce\u4cdd\u4c86\u4cfd\u4cfd\u4ca9\u4cc5\u4c80\u4ca8\u4c20\u4c81\u4cfc\u4ca9\u4cc8\u4cea\u4cce\u4cd2\u4cce\u4cc8\u4cdd\u4cf6\u4cd1\u4cf0\u4cfc\u4cd0\u4c86\u4c27\u4cf6\u4cb7\u4ca9\u4cbc\u4cb5\u4c2f\u4ca9\u4c80\u4cea\u4cf3\u4cb1\u4c2f\u4cc9\u4cdc\u4c2c\u4c20\u4ca8\u4cdf\u4cc5\u4cff\u4cca\u4c22\u4cfd\u4cb4\u4c22\u4cd3\u4cd7\u4cbc\u4cb1\u4cb7\u4c27\u4cd5\u4cf6\u4cf2\u4cf6\u4cb8\u4c2c\u4cb5\u4365\u4cb3\u4cd4\u4cea\u4cee\u4c21\u4cbf\u4cdf\u4cd8\u4c20\u4cfc\u4c80\u4cb3\u4cae\u4cb6\u4cbf\u4cee\u4cd2\u4cb8\u4cce\u4c25\u4cee\u4ce8\u4cbc\u4c26\u4ca9\u4cb4\u4c20\u4c82\u4c20\u4ce8\u4c23\u4c86\u4cb8\u4cf1\u4caa\u4ca8\u4cb0\u4c83\u4cc5\u4cd5\u4cd7\u4cb7\u4c22\u4cb3\u4cbd\u4c86\u4cff\u4c2c\u4cc9\u4c26\u4cb7\u4caa\u4cee\u4cbd\u4cc7\u4c22\u4cc5\u4cd3\u4cb7\u4cc5\u4cee\u4ce8\u4cb3\u4cc9\u4cdf\u4cb2\u4cd4\u4cab\u4cff\u4c83\u4cf1\u4c2f\u4cb2\u4c80\u4cbd\u4cf1\u4c86\u4cab\u4cd5\u4cd4\u4cce\u4c22\u4cb1\u4cf0\u4caa\u4c81\u4c8f\u4365\u4365\u4cf2\u4cb4\u4c80\u4c26\u4c8c\u4ca9\u4c8c\u4cc8\u4c26\u4cd1\u4cc9\u4cd7\u4cf2\u4cab\u4cd6\u4cce\u4cd1\u4c22\u4cc7\u4cfd\u4cb5\u4cd8\u4cc7\u4cfd\u4c25\u4cbc\u4ce8\u4cb1\u4cdc\u4cc9\u4c86\u4cb0\u4c81\u4ca9\u4cf2\u4cd1\u4cfd\u4ca9\u4cce\u4cbd\u4cce\u4cb1\u4cb6\u4cbc\u4c82\u4cea\u4cb5\u4ce8\u4cb1\u4c83\u4cc7\u4365\u4cca\u4c22\u4cd0\u4cff\u4cd5\u4cf6\u4cd5\u4cd6\u4cf0\u4c26\u4c2c\u4cd4\u4cf1\u4cd0\u4c2c\u4365\u4cf3\u4c8f\u4cf2\u4c8c\u4cc7\u4caa\u4cd6\u4cd5\u4c23\u4cf1\u4c23\u4cb0\u4cb4\u4cb6\u4c80\u4cae\u4cf2\u4cbd\u4caa\u4cf2\u4c22\u4c80\u4cae\u4cbf\u4cea\u4c26\u4c25\u4cbc\u4cab\u4cd4\u4cfd\u4ca8\u4c2c\u4c25\u4c2c\u4c86\u4c83\u4365\u4cd0\u4c27\u4ca9\u4c80\u4cc7\u4cf3\u4c83\u4c8c\u4c82\u4c86\u4cb0\u4cca\u4cc9\u4cab\u4cd8\u4cd4\u4cf0\u4cb7\u4c2c\u4cfd\u4cd7\u4cd5\u4cab\u4cd2\u4cb2\u4cb4\u4cff\u4cdd\u4c25\u4c8f\u4cd0\u4ce8\u4ccb\u4cfc\u4c25\u4c8f\u4cdd\u4c80\u4cbc\u4c86\u4cd0\u4cf2\u4cd1\u4cb7\u4c25\u4cc8\u4cb0\u4c2c\u4c8c\u4c2c\u4cf1\u4cce\u4cd3\u4cff\u4c25\u4cab\u4cb4\u4c82\u4cee\u4cdf\u4c2c\u4c27\u4cd7\u4cb2\u4cb5\u4cb4\u4cee\u4c2c\u4cae\u4cbf\u4cc8\u4cb1\u4cc8\u4cfc\u4c2c\u4cf1\u4cbc\u4cb2\u4c2c\u4cff\u4cb1\u4cb8\u4cc9\u4cf6\u4cce\u4cbc\u4cdc\u4cae\u4cb1\u4cd8\u4364\u4364".toCharArray();
            for (int i2 = 0; i2 < 600; ++i2) {
                int n4 = cArray[i2];
                n4 ^= 0xD4A5;
                n4 -= 13127;
                n4 += 13256;
                n4 += 26057;
                n4 -= 51146;
                n4 += 1770;
                n4 += 23563;
                n4 ^= 0xE4D;
                n4 += 38928;
                n4 ^= 0x2111;
                n4 ^= 0xF696;
                n4 += 1019;
                n4 += 58780;
                cArray[i2] = (char)(n4 ^= 0xE19E);
            }
            object = FuntimeHelperModule.A()[0] = new String(cArray);
        }
        objectArray[2] = (String)object;
        char[] cArray = ((String)FuntimeHelperModule.a(objectArray)).toCharArray();
        long l17 = l6;
        int n5 = 51;
        n5 -= -33;
        l6 = l17 ^ (0x12C00000000L ^ l17) & -1L << (n5 -= 52);
        long l18 = l13;
        int n6 = -44;
        n6 ^= 0xFFFFFFEE;
        l13 = l18 ^ (0L ^ l18) & -1L >>> (n6 += -26);
        while (true) {
            int n7 = 11;
            n7 ^= 0xFFFFFFDF;
            if ((int)l13 >= (int)(l6 >>> (n7 -= -76))) break;
            int n4 = (int)l13;
            long l19 = l13;
            int n9 = 9;
            n9 -= 37;
            int n10 = 28;
            n10 -= 104;
            l13 = l19 ^ (l19 ^ l19 + (long)(n9 ^= 0xFFFFFFE5)) & -1L >>> (n10 ^= 0xFFFFFF94);
            long l20 = l9;
            int n11 = 75;
            n11 ^= 0xFFFFFFEF;
            l9 = l20 ^ ((long)cArray[n4] ^ l20) & -1L >>> (n11 ^= 0xFFFFFF84);
            int n8 = (int)l13;
            long l21 = l13;
            int n13 = -73;
            n13 ^= 0xFFFFFF9C;
            int n14 = -90;
            n14 += -18;
            l13 = l21 ^ (l21 ^ l21 + (long)(n13 += -42)) & -1L >>> (n14 ^= 0xFFFFFFB4);
            int n15 = -117;
            n15 += 96;
            long l22 = l10;
            int n16 = 38;
            n16 -= 48;
            l10 = l22 ^ ((long)cArray[n8] << (n15 ^= 0xFFFFFFCB) ^ l22) & -1L << (n16 -= -42);
            int n17 = 21;
            n17 += 52;
            n17 -= 57;
            int n18 = -127;
            n18 ^= 0xFFFFFFCB;
            long l23 = l12;
            int n19 = 122;
            n19 -= 32;
            l12 = l23 ^ ((long)((int)l9 << n17 | (int)(l10 >>> (n18 -= 42))) ^ l23) & -1L >>> (n19 += -58);
            char[] cArray2 = new char[(int)l12];
            long l24 = l14;
            int n20 = 166;
            n20 ^= 0x32;
            l14 = l24 ^ (0L ^ l24) & -1L << (n20 += -116);
            while (true) {
                int n21 = 190;
                n21 -= 82;
                if ((int)(l14 >>> (n21 ^= 0x4C)) >= (int)l12) break;
                int n22 = 73;
                n22 += -35;
                int n23 = 120;
                n23 ^= 0x22;
                cArray2[(int)(l14 >>> (n22 += -6))] = cArray[(int)l13 + (int)(l14 >>> (n23 -= 58))];
                l14 += 0x100000000L;
            }
            int n24 = 4;
            n24 ^= 0x33;
            int n12 = (int)(l15 >>> (n24 -= 23));
            l15 += 0x100000000L;
            FuntimeHelperModule.f[n12] = new String(cArray2);
            long l25 = l13;
            int n26 = 111;
            n26 ^= 0xFFFFFFE8;
            l13 = l25 ^ ((long)((int)l13 + (int)l12) ^ l25) & -1L >>> (n26 ^= 0xFFFFFFA7);
        }
        INSTANCE = new FuntimeHelperModule();
        int n27 = 194;
        n27 -= 87;
        int n13 = -121;
        n13 = n13 ^ 0x70;
        boolean bl2 = n13 ^ 0xFFFFFFF6;
        b = INSTANCE.cfr_renamed_0((String)f[n27 += -90], bl2);
        int n14 = 124;
        --n14;
        int n16 = -117;
        n16 = n16 ^ 0xFFFFFFFB;
        boolean bl3 = n16 - 111;
        B = INSTANCE.cfr_renamed_0((String)f[n14 -= 101], bl3);
        int n17 = -63;
        n17 ^= 0;
        n17 -= -82;
        int n18 = 17;
        n18 -= -86;
        int n20 = 95;
        n20 = n20 + -66;
        boolean bl4 = n20 - 28;
        c = INSTANCE.cfr_renamed_0((String)f[n17] + (String)f[n18 -= 88], bl4).setVisible(FuntimeHelperModule::dragonTrap$lambda$0);
        int n21 = -86;
        n21 ^= 0xFFFFFFAA;
        n21 ^= 0xD;
        int n22 = 114;
        n22 ^= 0xFFFFFFE6;
        int n24 = 42;
        n24 = n24 - 1;
        boolean bl5 = n24 + -40;
        C = INSTANCE.cfr_renamed_0((String)f[n21] + (String)f[n22 += 126], bl5).setVisible(FuntimeHelperModule::greenInTarget$lambda$0);
        int n25 = -233;
        n25 -= -115;
        int n28 = -37;
        n28 = n28 ^ 1;
        boolean bl6 = n28 + 39;
        d = INSTANCE.cfr_renamed_0((String)f[n25 -= -124], bl6);
        int n29 = -35;
        n29 ^= 0xFFFFFF8C;
        int n31 = 4;
        n31 = n31 ^ 0x2B;
        boolean bl7 = n31 - 46;
        D = INSTANCE.cfr_renamed_0((String)f[n29 += -79], bl7);
        int n32 = 2;
        n32 -= 37;
        int n34 = 189;
        n34 = n34 + -126;
        boolean bl8 = n34 ^ 0x3E;
        e = INSTANCE.cfr_renamed_0((String)f[n32 += 46], bl8);
        int n35 = -203;
        n35 -= -123;
        int n37 = 70;
        n37 = n37 - 101;
        boolean bl9 = n37 - -32;
        E = INSTANCE.cfr_renamed_0((String)f[n35 += 90], bl9);
        int n38 = -71;
        n38 -= -104;
        FuntimeRestrict.moduleOnFuntime$default(FuntimeRestrict.INSTANCE, INSTANCE, null, n38 -= 31, null);
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
                byte[] byArray = new byte[0xEFF1 ^ 0xEFE1];
                byArray[0x75EC ^ 0x75E5] = 0x75A0 ^ 0x75E5;
                byArray[0xF0A1 ^ 0xF0AC] = 0xF09B ^ 0xF0AC;
                byArray[0xBAEF ^ 0xBAE9] = 0xFFFF4548 ^ 0xBAE9;
                byArray[0x1AAF ^ 0x1AAB] = 0x1ADB ^ 0x1AAB;
                byArray[0x347A ^ 0x3471] = 0xFFFFCBEB ^ 0x3471;
                byArray[0x302D ^ 0x3021] = 0x303C ^ 0x3021;
                byArray[0xBFE6 ^ 0xBFEE] = 0xBF9E ^ 0xBFEE;
                byArray[0x5ED3 ^ 0x5EDC] = 0x5EFB ^ 0x5EDC;
                byArray[0xEDAD ^ 0xEDA8] = 0xEDAF ^ 0xEDA8;
                byArray[0x76D5 ^ 0x76D6] = 0x76BA ^ 0x76D6;
                byArray[0xEE8F ^ 0xEE88] = 0xEEB2 ^ 0xEE88;
                byArray[0xB1C2 ^ 0xB1C2] = 0xFFFF4E2F ^ 0xB1C2;
                byArray[0xB43B ^ 0xB435] = 0xB445 ^ 0xB435;
                byArray[0x4EC8 ^ 0x4EC9] = 0x4EEA ^ 0x4EC9;
                byArray[0x3AB4 ^ 0x3AB6] = 0x3A9D ^ 0x3AB6;
                byArray[0x70B4 ^ 0x70BE] = 0x70CE ^ 0x70BE;
                objectArray2[0] = byArray;
            }
            byte[] byArray = (byte[])object3[0];
            if (g == null) {
                byte[] byArray2 = new byte[0x7E0D ^ 0x7E2D];
                byArray2[0x254D ^ 0x2553] = 0x2556 ^ 0x2553;
                byArray2[0xFE6F ^ 0xFE67] = 0xFE50 ^ 0xFE67;
                byArray2[0xA2E3 ^ 0xA2E3] = 0xA2CC ^ 0xA2E3;
                byArray2[0xC55F ^ 0xC542] = 0xC50B ^ 0xC542;
                byArray2[0x2ACF ^ 0x2AC3] = 0x2AA0 ^ 0x2AC3;
                byArray2[0x6C75 ^ 0x6C62] = 0x6C19 ^ 0x6C62;
                byArray2[0x3E45 ^ 0x3E4C] = 0xFFFFC182 ^ 0x3E4C;
                byArray2[0x6EA7 ^ 0x6EAD] = 0x6ED1 ^ 0x6EAD;
                byArray2[0xCC3 ^ 0xCD2] = 0xCE0 ^ 0xCD2;
                byArray2[0xC728 ^ 0xC737] = 0xFFFF38B3 ^ 0xC737;
                byArray2[0x5BBE ^ 0x5BB1] = 0x5BFF ^ 0x5BB1;
                byArray2[0x1597 ^ 0x1593] = 0xFFFFEA65 ^ 0x1593;
                byArray2[0xC646 ^ 0xC644] = 0xC602 ^ 0xC644;
                byArray2[0x8D1D ^ 0x8D06] = 0xFFFF72D6 ^ 0x8D06;
                byArray2[0xAF4E ^ 0xAF56] = 0xAF5E ^ 0xAF56;
                byArray2[0x769D ^ 0x768D] = 0x76DA ^ 0x768D;
                byArray2[0x2E87 ^ 0x2E91] = 0x2EAE ^ 0x2E91;
                byArray2[0x9348 ^ 0x9349] = 0x9374 ^ 0x9349;
                byArray2[0x666A ^ 0x6664] = 0xFFFF99C1 ^ 0x6664;
                byArray2[0x10A7 ^ 0x10BE] = 0xFFFFEF0C ^ 0x10BE;
                byArray2[0xAF8 ^ 0xAE4] = 0xFFFFF523 ^ 0xAE4;
                byArray2[0x30A2 ^ 0x30B7] = 0x30B5 ^ 0x30B7;
                byArray2[0x8036 ^ 0x8025] = 0x805B ^ 0x8025;
                byArray2[0xFFB7 ^ 0xFFB0] = 0xFFFF005A ^ 0xFFB0;
                byArray2[0x72DA ^ 0x72DF] = 0xFFFF8D09 ^ 0x72DF;
                byArray2[0x10027 ^ 0x1003D] = 0x1004A ^ 0x1003D;
                byArray2[0x5B77 ^ 0x5B65] = 0x5B55 ^ 0x5B65;
                byArray2[0x2739 ^ 0x2732] = 0xFFFFD8A1 ^ 0x2732;
                byArray2[0x2A8E ^ 0x2A8D] = 0xFFFFD566 ^ 0x2A8D;
                byArray2[0x4DC1 ^ 0x4DD5] = 0x4DA6 ^ 0x4DD5;
                byArray2[0xCE21 ^ 0xCE27] = 0xCE71 ^ 0xCE27;
                byArray2[0x8074 ^ 0x8079] = 0x804E ^ 0x8079;
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, 0, byArray3, 0, byArray.length);
                System.arraycopy(byArray2, 0, byArray3, byArray.length, byArray2.length);
                Object object4 = FuntimeHelperModule.A()[1];
                if (object4 == null) {
                    char[] cArray = "\u608f\u60b9\u6082\u60bb\u6085\u60a9\u6096\u60e0\u60eb\u60e7\u6087\u60ec\u6098\u609a\u608a\u6087\u60b8\u60a8".toCharArray();
                    for (int i2 = 0; i2 < 18; ++i2) {
                        int n3 = cArray[i2];
                        n3 ^= 0xF724;
                        n3 -= 52679;
                        n3 -= 42828;
                        n3 += 28269;
                        n3 -= 15568;
                        n3 += 25200;
                        n3 -= 22419;
                        n3 += 36787;
                        n3 += 60244;
                        n3 -= 52084;
                        n3 += 23061;
                        n3 += 55323;
                        cArray[i2] = (char)(n3 += 49019);
                    }
                    object4 = FuntimeHelperModule.A()[1] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[16];
                byArray4[12] = 80;
                byArray4[6] = -105;
                byArray4[2] = -120;
                byArray4[0] = -43;
                byArray4[9] = 52;
                byArray4[4] = -95;
                byArray4[11] = 38;
                byArray4[15] = 111;
                byArray4[7] = -67;
                byArray4[3] = 32;
                byArray4[8] = 17;
                byArray4[5] = 66;
                byArray4[10] = -61;
                byArray4[14] = -114;
                byArray4[13] = 21;
                byArray4[1] = 64;
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, 26, 256);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = FuntimeHelperModule.A()[2];
                if (object5 == null) {
                    char[] cArray = "\u952c\u9510\u9522".toCharArray();
                    for (int i3 = 0; i3 < 3; ++i3) {
                        int n4 = cArray[i3];
                        n4 += 46064;
                        n4 ^= 0x5385;
                        n4 ^= 0x8A89;
                        n4 += 28105;
                        n4 -= 29801;
                        n4 += 41514;
                        n4 -= 36140;
                        n4 -= 34541;
                        n4 += 29390;
                        cArray[i3] = (char)(n4 ^= 0x8A0E);
                    }
                    object5 = FuntimeHelperModule.A()[2] = new String(cArray);
                }
                g = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, 0, 16);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, 16, byArray6.length);
            Object object6 = FuntimeHelperModule.A()[3];
            if (object6 == null) {
                char[] cArray = "\ue594\ue598\ue5b6\ue562\ue586\ue597\ue586\ue562\ue585\ue58e\ue586\ue5b6\ue5a8\ue585\ue5b4\ue5b9\ue5b9\ue5bc\ue5a3\ue5ba".toCharArray();
                for (int i4 = 0; i4 < 20; ++i4) {
                    int n5 = cArray[i4];
                    n5 += 26576;
                    n5 -= 59600;
                    n5 ^= 0x7FC2;
                    n5 ^= 0xF0F4;
                    n5 += 37176;
                    n5 -= 9784;
                    n5 -= 10169;
                    n5 ^= 0xBC5A;
                    n5 += 38316;
                    n5 ^= 0xC7FD;
                    cArray[i4] = (char)(n5 += 4255);
                }
                object6 = FuntimeHelperModule.A()[3] = new String(cArray);
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
        H = new int[0xEA01 ^ 0xEB91];
        FuntimeHelperModule.H[0x400E ^ 0x4016] = 0x40E3 ^ 0x4016;
        FuntimeHelperModule.H[0x348A ^ 0x342F] = 0x34C1 ^ 0x342F;
        FuntimeHelperModule.H[0x92E6 ^ 0x93EB] = 0xFFFF6C51 ^ 0x93EB;
        FuntimeHelperModule.H[0xB929 ^ 0xB8A6] = 0xB852 ^ 0xB8A6;
        FuntimeHelperModule.H[0x57FF ^ 0x56D7] = 0x56E5 ^ 0x56D7;
        FuntimeHelperModule.H[0x4302 ^ 0x43A6] = 0xFFFFBC16 ^ 0x43A6;
        FuntimeHelperModule.H[0xFFB1 ^ 0xFFA1] = 0xFFFF0076 ^ 0xFFA1;
        FuntimeHelperModule.H[0x662 ^ 0x741] = 0x62F ^ 0x741;
        FuntimeHelperModule.H[0x10BCB ^ 0x10B14] = 0xFFFEF4BB ^ 0x10B14;
        FuntimeHelperModule.H[0xBBB5 ^ 0xBB0D] = 0xFFFF448F ^ 0xBB0D;
        FuntimeHelperModule.H[0x97DE ^ 0x9698] = 0xFFFF6907 ^ 0x9698;
        FuntimeHelperModule.H[0x423A ^ 0x4285] = 0x42F9 ^ 0x4285;
        FuntimeHelperModule.H[0x2BCD ^ 0x2ACD] = 0x2A81 ^ 0x2ACD;
        FuntimeHelperModule.H[0xC382 ^ 0xC2C7] = 0xC287 ^ 0xC2C7;
        FuntimeHelperModule.H[0x6172 ^ 0x602C] = 0x6073 ^ 0x602C;
        FuntimeHelperModule.H[0xC6CA ^ 0xC63E] = 0xFFFF39A7 ^ 0xC63E;
        FuntimeHelperModule.H[0x522E ^ 0x5231] = 0x5227 ^ 0x5231;
        FuntimeHelperModule.H[0x4FD2 ^ 0x4FE6] = 0xFFFFB01F ^ 0x4FE6;
        FuntimeHelperModule.H[0x10E8E ^ 0x10E4C] = 0x10E65 ^ 0x10E4C;
        FuntimeHelperModule.H[0x10542 ^ 0x1057A] = 0xFFFEFA8B ^ 0x1057A;
        FuntimeHelperModule.H[0x129F ^ 0x13B6] = 0x1399 ^ 0x13B6;
        FuntimeHelperModule.H[0x10B56 ^ 0x10A35] = 0x10A10 ^ 0x10A35;
        FuntimeHelperModule.H[0x2E59 ^ 0x2E85] = 0x2ED6 ^ 0x2E85;
        FuntimeHelperModule.H[0x56DF ^ 0x5787] = 0x57B3 ^ 0x5787;
        FuntimeHelperModule.H[0x5956 ^ 0x58D3] = 0xFFFFA754 ^ 0x58D3;
        FuntimeHelperModule.H[0xAE1C ^ 0xAF49] = 0xAF12 ^ 0xAF49;
        FuntimeHelperModule.H[0x3CB4 ^ 0x3C6E] = 0x3C26 ^ 0x3C6E;
        FuntimeHelperModule.H[0x30AD ^ 0x304B] = 0x3077 ^ 0x304B;
        FuntimeHelperModule.H[0x3F9D ^ 0x3EAE] = 0xFFFFC10B ^ 0x3EAE;
        FuntimeHelperModule.H[0xCCB8 ^ 0xCC4E] = 0xCC5E ^ 0xCC4E;
        FuntimeHelperModule.H[0x78DD ^ 0x7887] = 0xFFFF877C ^ 0x7887;
        FuntimeHelperModule.H[0x6712 ^ 0x6659] = 0xFFFF9997 ^ 0x6659;
        FuntimeHelperModule.H[0xC3C0 ^ 0xC38B] = 0xC3E9 ^ 0xC38B;
        FuntimeHelperModule.H[0x4547 ^ 0x4536] = 0x4560 ^ 0x4536;
        FuntimeHelperModule.H[0x7FC7 ^ 0x7FD3] = 0x7F9C ^ 0x7FD3;
        FuntimeHelperModule.H[0xB886 ^ 0xB9F6] = 0xB98A ^ 0xB9F6;
        FuntimeHelperModule.H[0x7AF0 ^ 0x7A8D] = 0x7AC8 ^ 0x7A8D;
        FuntimeHelperModule.H[0x65B4 ^ 0x6482] = 0xFFFF9B21 ^ 0x6482;
        FuntimeHelperModule.H[0xEDD8 ^ 0xED59] = 0xEC5C ^ 0xED59;
        FuntimeHelperModule.H[0x5578 ^ 0x553D] = 0x557E ^ 0x553D;
        FuntimeHelperModule.H[0xE1E8 ^ 0xE08E] = 0xFFFF1F52 ^ 0xE08E;
        FuntimeHelperModule.H[0x8836 ^ 0x888C] = 0xFFFF7774 ^ 0x888C;
        FuntimeHelperModule.H[0xDC9D ^ 0xDC4F] = 0xDC27 ^ 0xDC4F;
        FuntimeHelperModule.H[0x420A ^ 0x438B] = 0x43DB ^ 0x438B;
        FuntimeHelperModule.H[0x4630 ^ 0x475E] = 0x471A ^ 0x475E;
        FuntimeHelperModule.H[0x7071 ^ 0x7035] = 0x7032 ^ 0x7035;
        FuntimeHelperModule.H[0xE324 ^ 0xE37A] = 0xFFFF1C95 ^ 0xE37A;
        FuntimeHelperModule.H[0x6739 ^ 0x6735] = 0x6721 ^ 0x6735;
        FuntimeHelperModule.H[0xDA84 ^ 0xDA01] = 0xFFFF25FE ^ 0xDA01;
        FuntimeHelperModule.H[0x8E0E ^ 0x8E83] = 0x8EE8 ^ 0x8E83;
        FuntimeHelperModule.H[0x1055A ^ 0x1042B] = 0xFFFEFBDD ^ 0x1042B;
        FuntimeHelperModule.H[0xE375 ^ 0xE30F] = 0xE324 ^ 0xE30F;
        FuntimeHelperModule.H[0xA0F3 ^ 0xA1D3] = 0xFFFF5EDB ^ 0xA1D3;
        FuntimeHelperModule.H[0x29BE ^ 0x28DF] = 0x28D1 ^ 0x28DF;
        FuntimeHelperModule.H[0xFBA5 ^ 0xFAD1] = 0xFFFF05AD ^ 0xFAD1;
        FuntimeHelperModule.H[0x73D6 ^ 0x737A] = 0xFFFF8CD1 ^ 0x737A;
        FuntimeHelperModule.H[0x57FA ^ 0x579E] = 0x57BC ^ 0x579E;
        FuntimeHelperModule.H[0xC46F ^ 0xC526] = 0xFFFF3A9B ^ 0xC526;
        FuntimeHelperModule.H[0xCBCF ^ 0xCB57] = 0xCB3F ^ 0xCB57;
        FuntimeHelperModule.H[0xF5B8 ^ 0xF4CD] = 0xFFFF0B42 ^ 0xF4CD;
        FuntimeHelperModule.H[0xA98 ^ 0xAFB] = 0xAA7 ^ 0xAFB;
        FuntimeHelperModule.H[0x6BE5 ^ 0x6B75] = 0xFFFF94D9 ^ 0x6B75;
        FuntimeHelperModule.H[0xD4C1 ^ 0xD5F1] = 0xFFFF2A55 ^ 0xD5F1;
        FuntimeHelperModule.H[0x86E9 ^ 0x87DB] = 0xFFFF780B ^ 0x87DB;
        FuntimeHelperModule.H[0x9F2D ^ 0x9F03] = 0xFFFF60EA ^ 0x9F03;
        FuntimeHelperModule.H[0x2566 ^ 0x257F] = 0xFFFFDAD8 ^ 0x257F;
        FuntimeHelperModule.H[0x6FF1 ^ 0x6F09] = 0x6F17 ^ 0x6F09;
        FuntimeHelperModule.H[0xC422 ^ 0xC53B] = 0xFFFF3A81 ^ 0xC53B;
        FuntimeHelperModule.H[0x454A ^ 0x458A] = 0xFFFFBA58 ^ 0x458A;
        FuntimeHelperModule.H[0x6E3A ^ 0x6EB4] = 0xFFFF915B ^ 0x6EB4;
        FuntimeHelperModule.H[0x6288 ^ 0x6277] = 0xFFFF9D89 ^ 0x6277;
        FuntimeHelperModule.H[0x4700 ^ 0x47FB] = 0xFFFFB83E ^ 0x47FB;
        FuntimeHelperModule.H[0x66A4 ^ 0x66F2] = 0xFFFF9933 ^ 0x66F2;
        FuntimeHelperModule.H[0x2F1A ^ 0x2F92] = 0x2FBA ^ 0x2F92;
        FuntimeHelperModule.H[0xB9D4 ^ 0xB9BB] = 0xB9C3 ^ 0xB9BB;
        FuntimeHelperModule.H[0x85F9 ^ 0x84F8] = 0x84B6 ^ 0x84F8;
        FuntimeHelperModule.H[0xCC4D ^ 0xCCB7] = 0xFFFF3370 ^ 0xCCB7;
        FuntimeHelperModule.H[0xAD57 ^ 0xAC68] = 0xFFFF53E7 ^ 0xAC68;
        FuntimeHelperModule.H[0x7C77 ^ 0x7CC6] = 0x7C97 ^ 0x7CC6;
        FuntimeHelperModule.H[0xD4A5 ^ 0xD4EF] = 0xFFFF2B6B ^ 0xD4EF;
        FuntimeHelperModule.H[0xBC06 ^ 0xBC8C] = 0xBCBE ^ 0xBC8C;
        FuntimeHelperModule.H[0xAF37 ^ 0xAF4F] = 0xFFFF50F2 ^ 0xAF4F;
        FuntimeHelperModule.H[0xB430 ^ 0xB438] = 0xFFFF4BEB ^ 0xB438;
        FuntimeHelperModule.H[0x76C1 ^ 0x77E3] = 0xFFFF8830 ^ 0x77E3;
        FuntimeHelperModule.H[0x44FD ^ 0x45EC] = 0xFFFFBA69 ^ 0x45EC;
        FuntimeHelperModule.H[0x10A84 ^ 0x10BFC] = 0xFFFEF420 ^ 0x10BFC;
        FuntimeHelperModule.H[0x7CAF ^ 0x7DF5] = 0x7DF2 ^ 0x7DF5;
        FuntimeHelperModule.H[0x39B9 ^ 0x398F] = 0xFFFFC609 ^ 0x398F;
        FuntimeHelperModule.H[0x55F3 ^ 0x5512] = 0x5541 ^ 0x5512;
        FuntimeHelperModule.H[0x62AF ^ 0x63E3] = 0x63C2 ^ 0x63E3;
        FuntimeHelperModule.H[0xC101 ^ 0xC1B4] = 0xC1F1 ^ 0xC1B4;
        FuntimeHelperModule.H[0x20B0 ^ 0x21AF] = 0xFFFFDE08 ^ 0x21AF;
        FuntimeHelperModule.H[0x23D8 ^ 0x2299] = 0x22FF ^ 0x2299;
        FuntimeHelperModule.H[0x4E4A ^ 0x4EBA] = 0x4E33 ^ 0x4EBA;
        FuntimeHelperModule.H[0x7D7E ^ 0x7D47] = 0x7DDB ^ 0x7D47;
        FuntimeHelperModule.H[0x912 ^ 0x953] = 0x92F ^ 0x953;
        FuntimeHelperModule.H[0xA2C2 ^ 0xA2A5] = 0xFFFF5D0B ^ 0xA2A5;
        FuntimeHelperModule.H[0x5C6E ^ 0x5CF5] = 0xFFFFA325 ^ 0x5CF5;
        FuntimeHelperModule.H[0x9764 ^ 0x97AB] = 0xFFFF6817 ^ 0x97AB;
        FuntimeHelperModule.H[0x10A85 ^ 0x10A4B] = 0xFFFEF58C ^ 0x10A4B;
        FuntimeHelperModule.H[0x4253 ^ 0x4372] = 0x4356 ^ 0x4372;
        FuntimeHelperModule.H[0xA1E3 ^ 0xA09E] = 0xA08C ^ 0xA09E;
        FuntimeHelperModule.H[0x9A31 ^ 0x9A06] = 0xFFFF658A ^ 0x9A06;
        FuntimeHelperModule.H[0x104E5 ^ 0x1042C] = 0x10427 ^ 0x1042C;
        FuntimeHelperModule.H[0x330F ^ 0x33A1] = 0x329F ^ 0x33A1;
        FuntimeHelperModule.H[0xE388 ^ 0xE3CF] = 0xE398 ^ 0xE3CF;
        FuntimeHelperModule.H[0xFFFE ^ 0xFF0B] = 0xFF20 ^ 0xFF0B;
        FuntimeHelperModule.H[0x9CD0 ^ 0x9DE9] = 0xFFFF6200 ^ 0x9DE9;
        FuntimeHelperModule.H[0x664 ^ 0x681] = 0xFFFFF93A ^ 0x681;
        FuntimeHelperModule.H[0x3934 ^ 0x39EF] = 0x3925 ^ 0x39EF;
        FuntimeHelperModule.H[0xA91C ^ 0xA878] = 0xFFFF578F ^ 0xA878;
        FuntimeHelperModule.H[0xFB20 ^ 0xFA79] = 0xFA68 ^ 0xFA79;
        FuntimeHelperModule.H[0x576E ^ 0x5765] = 0xFFFFA881 ^ 0x5765;
        FuntimeHelperModule.H[0x476E ^ 0x4747] = 0xFFFFB8D6 ^ 0x4747;
        FuntimeHelperModule.H[0x3C21 ^ 0x3CF9] = 0x3CE0 ^ 0x3CF9;
        FuntimeHelperModule.H[0x3D09 ^ 0x3C2C] = 0x3C21 ^ 0x3C2C;
        FuntimeHelperModule.H[0x8778 ^ 0x87A6] = 0x8785 ^ 0x87A6;
        FuntimeHelperModule.H[0xCD6D ^ 0xCC01] = 0xCC7D ^ 0xCC01;
        FuntimeHelperModule.H[0xAF2A ^ 0xAF78] = 0xAF45 ^ 0xAF78;
        FuntimeHelperModule.H[0x1085B ^ 0x108DB] = 0xFFFEF76B ^ 0x108DB;
        FuntimeHelperModule.H[0x4E76 ^ 0x4E65] = 0x4E31 ^ 0x4E65;
        FuntimeHelperModule.H[0xF751 ^ 0xF7EA] = 0xF7BB ^ 0xF7EA;
        FuntimeHelperModule.H[0x85F5 ^ 0x84AE] = 0x8484 ^ 0x84AE;
        FuntimeHelperModule.H[0x141B ^ 0x14D0] = 0x149D ^ 0x14D0;
        FuntimeHelperModule.H[0xC5D2 ^ 0xC5D6] = 0xC5FF ^ 0xC5D6;
        FuntimeHelperModule.H[0xA7F2 ^ 0xA674] = 0xA657 ^ 0xA674;
        FuntimeHelperModule.H[0x88EF ^ 0x885B] = 0x8836 ^ 0x885B;
        FuntimeHelperModule.H[0xBD3D ^ 0xBD19] = 0xFFFF4262 ^ 0xBD19;
        FuntimeHelperModule.H[0xBB08 ^ 0xBBBB] = 0xBB9D ^ 0xBBBB;
        FuntimeHelperModule.H[0x32F9 ^ 0x327E] = 0xFFFFCDE2 ^ 0x327E;
        FuntimeHelperModule.H[0x1679 ^ 0x1685] = 0xFFFFE975 ^ 0x1685;
        FuntimeHelperModule.H[0x83A7 ^ 0x832C] = 0xFFFF7CC3 ^ 0x832C;
        FuntimeHelperModule.H[0x1EA4 ^ 0x1F82] = 0x1F5C ^ 0x1F82;
        FuntimeHelperModule.H[0xC978 ^ 0xC95B] = 0xC955 ^ 0xC95B;
        FuntimeHelperModule.H[0x4661 ^ 0x4631] = 0x4678 ^ 0x4631;
        FuntimeHelperModule.H[0xEF6A ^ 0xEFB7] = 0xEFA9 ^ 0xEFB7;
        FuntimeHelperModule.H[0x4FCB ^ 0x4EB4] = 0xFFFFB124 ^ 0x4EB4;
        FuntimeHelperModule.H[0x906C ^ 0x90BB] = 0x90A5 ^ 0x90BB;
        FuntimeHelperModule.H[0xCB37 ^ 0xCB38] = 0xCB32 ^ 0xCB38;
        FuntimeHelperModule.H[0x60BD ^ 0x606D] = 0x604F ^ 0x606D;
        FuntimeHelperModule.H[0xFBD1 ^ 0xFAEF] = 0xFAEE ^ 0xFAEF;
        FuntimeHelperModule.H[0x4524 ^ 0x4418] = 0x4419 ^ 0x4418;
        FuntimeHelperModule.H[0xB2A4 ^ 0xB281] = 0xB291 ^ 0xB281;
        FuntimeHelperModule.H[0xF674 ^ 0xF7F3] = 0xF7BE ^ 0xF7F3;
        FuntimeHelperModule.H[0x9444 ^ 0x94B7] = 0x94F8 ^ 0x94B7;
        FuntimeHelperModule.H[0x1380 ^ 0x1397] = 0x13AE ^ 0x1397;
        FuntimeHelperModule.H[0x6E1F ^ 0x6F72] = 0xFFFF90E0 ^ 0x6F72;
        FuntimeHelperModule.H[0x1F72 ^ 0x1FE6] = 0xFFFFE00E ^ 0x1FE6;
        FuntimeHelperModule.H[0x3AF5 ^ 0x3BBA] = 0xFFFFC41C ^ 0x3BBA;
        FuntimeHelperModule.H[0x1051C ^ 0x10431] = 0x10440 ^ 0x10431;
        FuntimeHelperModule.H[0x10046 ^ 0x10148] = 0x101DE ^ 0x10148;
        FuntimeHelperModule.H[0x6F37 ^ 0x6FD3] = 0x6EDB ^ 0x6FD3;
        FuntimeHelperModule.H[0x107C2 ^ 0x107A9] = 0xFFFEF86A ^ 0x107A9;
        FuntimeHelperModule.H[0x8B1C ^ 0x8BC9] = 0xFFFF7463 ^ 0x8BC9;
        FuntimeHelperModule.H[0xF8FC ^ 0xF9A1] = 0xFFFF0604 ^ 0xF9A1;
        FuntimeHelperModule.H[0x9DA3 ^ 0x9D30] = 0x9D67 ^ 0x9D30;
        FuntimeHelperModule.H[0x8FD2 ^ 0x8E95] = 0xFFFF710F ^ 0x8E95;
        FuntimeHelperModule.H[0xBDFD ^ 0xBDF4] = 0xBD7D ^ 0xBDF4;
        FuntimeHelperModule.H[0x8DEF ^ 0x8D79] = 0xFFFF72B9 ^ 0x8D79;
        FuntimeHelperModule.H[0xDC9B ^ 0xDDEC] = 0xFFFF2260 ^ 0xDDEC;
        FuntimeHelperModule.H[0x6697 ^ 0x66FF] = 0x66E4 ^ 0x66FF;
        FuntimeHelperModule.H[0x6532 ^ 0x6561] = 0x653E ^ 0x6561;
        FuntimeHelperModule.H[0xC918 ^ 0xC81C] = 0xC806 ^ 0xC81C;
        FuntimeHelperModule.H[0x747B ^ 0x7423] = 0xFFFF8BE8 ^ 0x7423;
        FuntimeHelperModule.H[0x5DEC ^ 0x5D5B] = 0x5D79 ^ 0x5D5B;
        FuntimeHelperModule.H[0xA857 ^ 0xA8FF] = 0xFFFF564E ^ 0xA8FF;
        FuntimeHelperModule.H[0x25CA ^ 0x25A8] = 0x25E7 ^ 0x25A8;
        FuntimeHelperModule.H[0xF29F ^ 0xF3F6] = 0xF390 ^ 0xF3F6;
        FuntimeHelperModule.H[0xD58A ^ 0xD58D] = 0xD59C ^ 0xD58D;
        FuntimeHelperModule.H[0x1799 ^ 0x16AE] = 0xFFFFE95D ^ 0x16AE;
        FuntimeHelperModule.H[0x3413 ^ 0x34C5] = 0xFFFFCB51 ^ 0x34C5;
        FuntimeHelperModule.H[0xF476 ^ 0xF47C] = 0xF419 ^ 0xF47C;
        FuntimeHelperModule.H[0x6787 ^ 0x6789] = 0x67D7 ^ 0x6789;
        FuntimeHelperModule.H[0xD73E ^ 0xD741] = 0xD745 ^ 0xD741;
        FuntimeHelperModule.H[0x6C21 ^ 0x6D5A] = 0xFFFF92A0 ^ 0x6D5A;
        FuntimeHelperModule.H[0xF36 ^ 0xEBB] = 0xFFFFF160 ^ 0xEBB;
        FuntimeHelperModule.H[0x5F9A ^ 0x5E9D] = 0x5EE1 ^ 0x5E9D;
        FuntimeHelperModule.H[0xFE4A ^ 0xFF60] = 0xFF77 ^ 0xFF60;
        FuntimeHelperModule.H[0x42AF ^ 0x4392] = 0xFFFFBC24 ^ 0x4392;
        FuntimeHelperModule.H[0x19CA ^ 0x18AA] = 0x18EC ^ 0x18AA;
        FuntimeHelperModule.H[0xF28D ^ 0xF293] = 0xF290 ^ 0xF293;
        FuntimeHelperModule.H[0x103CF ^ 0x10360] = 0x1032A ^ 0x10360;
        FuntimeHelperModule.H[0x7CB0 ^ 0x7C91] = 0xFFFF8340 ^ 0x7C91;
        FuntimeHelperModule.H[0xC59C ^ 0xC5BC] = 0xC5A4 ^ 0xC5BC;
        FuntimeHelperModule.H[0x1E1E ^ 0x1F0C] = 0xFFFFE0A0 ^ 0x1F0C;
        FuntimeHelperModule.H[0xF63F ^ 0xF75A] = 0xF715 ^ 0xF75A;
        FuntimeHelperModule.H[0x1BE7 ^ 0x1B9E] = 0x1BA6 ^ 0x1B9E;
        FuntimeHelperModule.H[0x5A7B ^ 0x5A1E] = 0x5A40 ^ 0x5A1E;
        FuntimeHelperModule.H[0xDAA8 ^ 0xDA1A] = 0xFFFF25E1 ^ 0xDA1A;
        FuntimeHelperModule.H[0x29AE ^ 0x289A] = 0x2891 ^ 0x289A;
        FuntimeHelperModule.H[0x107BB ^ 0x1072E] = 0x10731 ^ 0x1072E;
        FuntimeHelperModule.H[0x440F ^ 0x458F] = 0xFFFFBA11 ^ 0x458F;
        FuntimeHelperModule.H[0xF649 ^ 0xF762] = 0xF77A ^ 0xF762;
        FuntimeHelperModule.H[0x1B4B ^ 0x1B8A] = 0xFFFFE471 ^ 0x1B8A;
        FuntimeHelperModule.H[0x1055D ^ 0x1040B] = 0xFFFEFBD4 ^ 0x1040B;
        FuntimeHelperModule.H[0x65CC ^ 0x644E] = 0x647C ^ 0x644E;
        FuntimeHelperModule.H[0xB5EA ^ 0xB58A] = 0xFFFF4A73 ^ 0xB58A;
        FuntimeHelperModule.H[0x461E ^ 0x4760] = 0xFFFFB8FE ^ 0x4760;
        FuntimeHelperModule.H[0x4973 ^ 0x49BE] = 0x4988 ^ 0x49BE;
        FuntimeHelperModule.H[0xF5C3 ^ 0xF4D6] = 0xF4CD ^ 0xF4D6;
        FuntimeHelperModule.H[0x10E8B ^ 0x10EA1] = 0x10EFE ^ 0x10EA1;
        FuntimeHelperModule.H[0x837B ^ 0x83E5] = 0x83E8 ^ 0x83E5;
        FuntimeHelperModule.H[0x765E ^ 0x7765] = 0xFFFF88B2 ^ 0x7765;
        FuntimeHelperModule.H[0x36F0 ^ 0x37FF] = 0xFFFFC866 ^ 0x37FF;
        FuntimeHelperModule.H[0x31F ^ 0x217] = 0x228 ^ 0x217;
        FuntimeHelperModule.H[0xC3B5 ^ 0xC2E4] = 0xC297 ^ 0xC2E4;
        FuntimeHelperModule.H[0x9656 ^ 0x96BF] = 0xFFFF692D ^ 0x96BF;
        FuntimeHelperModule.H[0x82E9 ^ 0x8266] = 0x821A ^ 0x8266;
        FuntimeHelperModule.H[0xDD26 ^ 0xDD3D] = 0xFFFF224E ^ 0xDD3D;
        FuntimeHelperModule.H[0x1879 ^ 0x1895] = 0x18DB ^ 0x1895;
        FuntimeHelperModule.H[0xB60F ^ 0xB67F] = 0xB65E ^ 0xB67F;
        FuntimeHelperModule.H[0x60CC ^ 0x60AD] = 0xFFFF9F3B ^ 0x60AD;
        FuntimeHelperModule.H[0x3465 ^ 0x3566] = 0x356E ^ 0x3566;
        FuntimeHelperModule.H[0xD91E ^ 0xD981] = 0xFFFF262A ^ 0xD981;
        FuntimeHelperModule.H[0xBAC1 ^ 0xBAB5] = 0xFFFF4574 ^ 0xBAB5;
        FuntimeHelperModule.H[0x10E77 ^ 0x10F04] = 0x10F13 ^ 0x10F04;
        FuntimeHelperModule.H[0xFEE6 ^ 0xFEB9] = 0xFFFF014F ^ 0xFEB9;
        FuntimeHelperModule.H[0xFC96 ^ 0xFC7E] = 0xFFFF03B5 ^ 0xFC7E;
        FuntimeHelperModule.H[0xAC76 ^ 0xAD52] = 0xFFFF52CC ^ 0xAD52;
        FuntimeHelperModule.H[0xEEFE ^ 0xEEC2] = 0xEE87 ^ 0xEEC2;
        FuntimeHelperModule.H[0x258A ^ 0x2577] = 0x2501 ^ 0x2577;
        FuntimeHelperModule.H[0xAFD0 ^ 0xAFA7] = 0xFFFF5051 ^ 0xAFA7;
        FuntimeHelperModule.H[0x4C51 ^ 0x4C88] = 0x4CD9 ^ 0x4C88;
        FuntimeHelperModule.H[0xC63D ^ 0xC67E] = 0xFFFF3987 ^ 0xC67E;
        FuntimeHelperModule.H[0x110C ^ 0x1165] = 0x3EEBD ^ 0x1165;
        FuntimeHelperModule.H[0x6041 ^ 0x6113] = 0xFFFF9EF0 ^ 0x6113;
        FuntimeHelperModule.H[0xF51E ^ 0xF521] = 0xF567 ^ 0xF521;
        FuntimeHelperModule.H[0x3757 ^ 0x373A] = 0x3760 ^ 0x373A;
        FuntimeHelperModule.H[0x42B ^ 0x57F] = 0xFFFFFAEA ^ 0x57F;
        FuntimeHelperModule.H[0xA70E ^ 0xA721] = 0xFFFF58F6 ^ 0xA721;
        FuntimeHelperModule.H[0x817A ^ 0x8183] = 0xFFFF7E7D ^ 0x8183;
        FuntimeHelperModule.H[0xB4DB ^ 0xB4A5] = 0xFFFF4B71 ^ 0xB4A5;
        FuntimeHelperModule.H[0x27EB ^ 0x273A] = 0xFFFFD880 ^ 0x273A;
        FuntimeHelperModule.H[0x7D94 ^ 0x7DD4] = 0x7DCE ^ 0x7DD4;
        FuntimeHelperModule.H[0xE98 ^ 0xE28] = 0xE23 ^ 0xE28;
        FuntimeHelperModule.H[0x7C82 ^ 0x7C04] = 0xFFFF83DC ^ 0x7C04;
        FuntimeHelperModule.H[0xDC2A ^ 0xDC96] = 0xFFFF2331 ^ 0xDC96;
        FuntimeHelperModule.H[0x3312 ^ 0x33C6] = 0xFFFFCC25 ^ 0x33C6;
        FuntimeHelperModule.H[0x2C81 ^ 0x2C70] = 0x2C79 ^ 0x2C70;
        FuntimeHelperModule.H[0x1217 ^ 0x130C] = 0xFFFFECFB ^ 0x130C;
        FuntimeHelperModule.H[0xF09E ^ 0xF088] = 0xF0CF ^ 0xF088;
        FuntimeHelperModule.H[0x23CB ^ 0x2351] = 0xFFFFDCA6 ^ 0x2351;
        FuntimeHelperModule.H[0xC1CC ^ 0xC1DE] = 0xC1C5 ^ 0xC1DE;
        FuntimeHelperModule.H[0x524C ^ 0x5219] = 0xFFFFADEB ^ 0x5219;
        FuntimeHelperModule.H[0x4207 ^ 0x422F] = 0x424C ^ 0x422F;
        FuntimeHelperModule.H[0x91C1 ^ 0x912C] = 0x9057 ^ 0x912C;
        FuntimeHelperModule.H[0x61F6 ^ 0x60E8] = 0xFFFF9F3F ^ 0x60E8;
        FuntimeHelperModule.H[0x7946 ^ 0x78CA] = 0xFFFF872C ^ 0x78CA;
        FuntimeHelperModule.H[0x9E2D ^ 0x9F7A] = 0xFFFF6095 ^ 0x9F7A;
        FuntimeHelperModule.H[0xA18A ^ 0xA096] = 0xA0BD ^ 0xA096;
        FuntimeHelperModule.H[0x5306 ^ 0x534A] = 0x5346 ^ 0x534A;
        FuntimeHelperModule.H[0x7743 ^ 0x771E] = 0x7707 ^ 0x771E;
        FuntimeHelperModule.H[0xF176 ^ 0xF16A] = 0xF158 ^ 0xF16A;
        FuntimeHelperModule.H[0x58A ^ 0x49C] = 0x4A3 ^ 0x49C;
        FuntimeHelperModule.H[0xA6E ^ 0xA7F] = 0xFFFFF59F ^ 0xA7F;
        FuntimeHelperModule.H[0x17CA ^ 0x16D2] = 0xFFFFE92E ^ 0x16D2;
        FuntimeHelperModule.H[0x7C26 ^ 0x7CC1] = 0x7C67 ^ 0x7CC1;
        FuntimeHelperModule.H[0x3ABF ^ 0x3ABC] = 0x3A2C ^ 0x3ABC;
        FuntimeHelperModule.H[0x36C5 ^ 0x36F6] = 0xFFFFC903 ^ 0x36F6;
        FuntimeHelperModule.H[0x4536 ^ 0x4426] = 0xFFFFBBD7 ^ 0x4426;
        FuntimeHelperModule.H[0x1D37 ^ 0x1CB9] = 0x1CE6 ^ 0x1CB9;
        FuntimeHelperModule.H[0x107C3 ^ 0x1078A] = 0x107DD ^ 0x1078A;
        FuntimeHelperModule.H[0x10636 ^ 0x10603] = 0x1062F ^ 0x10603;
        FuntimeHelperModule.H[0x324E ^ 0x320C] = 0xFFFFCDF0 ^ 0x320C;
        FuntimeHelperModule.H[0x2C3A ^ 0x2C97] = 0xFFFFD341 ^ 0x2C97;
        FuntimeHelperModule.H[0x7D68 ^ 0x7D31] = 0x7D56 ^ 0x7D31;
        FuntimeHelperModule.H[0x8E50 ^ 0x8E77] = 0xFFFF7182 ^ 0x8E77;
        FuntimeHelperModule.H[0x9479 ^ 0x953D] = 0xFFFF6A42 ^ 0x953D;
        FuntimeHelperModule.H[0x74B0 ^ 0x741A] = 0xFFFF8BBA ^ 0x741A;
        FuntimeHelperModule.H[0x7130 ^ 0x71DF] = 0xFFFF8E0F ^ 0x71DF;
        FuntimeHelperModule.H[0x2F87 ^ 0x2FC8] = 0x2FC1 ^ 0x2FC8;
        FuntimeHelperModule.H[0x1012C ^ 0x10031] = 0x1004C ^ 0x10031;
        FuntimeHelperModule.H[0x1CDB ^ 0x1D9B] = 0xFFFFE235 ^ 0x1D9B;
        FuntimeHelperModule.H[0x4087 ^ 0x40B7] = 0x40E0 ^ 0x40B7;
        FuntimeHelperModule.H[0xE266 ^ 0xE2EA] = 0xE2A8 ^ 0xE2EA;
        FuntimeHelperModule.H[0x10043 ^ 0x10046] = 0xFFFEFFE6 ^ 0x10046;
        FuntimeHelperModule.H[0x9BC3 ^ 0x9BDE] = 0x9BB9 ^ 0x9BDE;
        FuntimeHelperModule.H[0x7EDC ^ 0x7FBE] = 0x7F82 ^ 0x7FBE;
        FuntimeHelperModule.H[0x475 ^ 0x57F] = 0x569 ^ 0x57F;
        FuntimeHelperModule.H[0x26E7 ^ 0x27F4] = 0x27D3 ^ 0x27F4;
        FuntimeHelperModule.H[0x50A3 ^ 0x51A8] = 0xFFFFAE47 ^ 0x51A8;
        FuntimeHelperModule.H[0x4B31 ^ 0x4A48] = 0x4A0E ^ 0x4A48;
        FuntimeHelperModule.H[0xE63B ^ 0xE6B8] = 0xE6C4 ^ 0xE6B8;
        FuntimeHelperModule.H[0xD230 ^ 0xD212] = 0xFFFF2DD1 ^ 0xD212;
        FuntimeHelperModule.H[0x10BBC ^ 0x10BC7] = 0x10BA4 ^ 0x10BC7;
        FuntimeHelperModule.H[0xBF1E ^ 0xBE9D] = 0xBE20 ^ 0xBE9D;
        FuntimeHelperModule.H[0x27ED ^ 0x269F] = 0xFFFFD942 ^ 0x269F;
        FuntimeHelperModule.H[0x19DB ^ 0x1899] = 0x18AE ^ 0x1899;
        FuntimeHelperModule.H[0xF33D ^ 0xF2B4] = 0xFFFF0D1A ^ 0xF2B4;
        FuntimeHelperModule.H[0xBB9 ^ 0xBBF] = 0xB93 ^ 0xBBF;
        FuntimeHelperModule.H[0xD59C ^ 0xD5AD] = 0xFFFF2A57 ^ 0xD5AD;
        FuntimeHelperModule.H[0x32F8 ^ 0x32F8] = 0xFFFFCD33 ^ 0x32F8;
        FuntimeHelperModule.H[0xB084 ^ 0xB10E] = 0xB146 ^ 0xB10E;
        FuntimeHelperModule.H[0x651E ^ 0x65CD] = 0xFFFF9A56 ^ 0x65CD;
        FuntimeHelperModule.H[0xA3DC ^ 0xA2D5] = 0xA2E0 ^ 0xA2D5;
        FuntimeHelperModule.H[0x269E ^ 0x27CE] = 0xFFFFD8A0 ^ 0x27CE;
        FuntimeHelperModule.H[0x7323 ^ 0x7336] = 0x7324 ^ 0x7336;
        FuntimeHelperModule.H[0x8CF6 ^ 0x8C54] = 0x8C8D ^ 0x8C54;
        FuntimeHelperModule.H[0x9E2F ^ 0x9EC5] = 0xFFFF618B ^ 0x9EC5;
        FuntimeHelperModule.H[0x1882 ^ 0x18B0] = 0x18CD ^ 0x18B0;
        FuntimeHelperModule.H[0x933D ^ 0x936A] = 0xFFFF6CC9 ^ 0x936A;
        FuntimeHelperModule.H[0x6D97 ^ 0x6D75] = 0x6D16 ^ 0x6D75;
        FuntimeHelperModule.H[0x1351 ^ 0x122B] = 0xFFFFED49 ^ 0x122B;
        FuntimeHelperModule.H[0x501F ^ 0x508D] = 0xFFFFAF44 ^ 0x508D;
        FuntimeHelperModule.H[0xA534 ^ 0xA5F7] = 0xA5C0 ^ 0xA5F7;
        FuntimeHelperModule.H[0xD8DB ^ 0xD8AE] = 0x4D8C7 ^ 0xD8AE;
        FuntimeHelperModule.H[0xC77E ^ 0xC70C] = 0xC71E ^ 0xC70C;
        FuntimeHelperModule.H[0xB9AA ^ 0xB96E] = 0xB948 ^ 0xB96E;
        FuntimeHelperModule.H[0x7032 ^ 0x7128] = 0x719A ^ 0x7128;
        FuntimeHelperModule.H[0x2BD2 ^ 0x2BA1] = 0xFFFFD452 ^ 0x2BA1;
        FuntimeHelperModule.H[0xC9AC ^ 0xC90D] = 0xC910 ^ 0xC90D;
        FuntimeHelperModule.H[0x9256 ^ 0x9315] = 0xFFFF6C96 ^ 0x9315;
        FuntimeHelperModule.H[0x531A ^ 0x5346] = 0x5372 ^ 0x5346;
        FuntimeHelperModule.H[0x4998 ^ 0x481C] = 0xFFFFB7C0 ^ 0x481C;
        FuntimeHelperModule.H[0xF665 ^ 0xF771] = 0xF628 ^ 0xF771;
        FuntimeHelperModule.H[0x28E9 ^ 0x28BD] = 0xFFFFD759 ^ 0x28BD;
        FuntimeHelperModule.H[0x7CAB ^ 0x7D84] = 0x7DC4 ^ 0x7D84;
        FuntimeHelperModule.H[0xDD38 ^ 0xDDA1] = 0xDD86 ^ 0xDDA1;
        FuntimeHelperModule.H[0x1452 ^ 0x14A0] = 0x14CC ^ 0x14A0;
        FuntimeHelperModule.H[0x73A7 ^ 0x7289] = 0xFFFF8D0B ^ 0x7289;
        FuntimeHelperModule.H[0xD3EE ^ 0xD266] = 0xD228 ^ 0xD266;
        FuntimeHelperModule.H[0x1745 ^ 0x1747] = 0xFFFFE895 ^ 0x1747;
        FuntimeHelperModule.H[0x234B ^ 0x2327] = 0x2343 ^ 0x2327;
        FuntimeHelperModule.H[0xFE43 ^ 0xFF0D] = 0xFFFF0091 ^ 0xFF0D;
        FuntimeHelperModule.H[0xC237 ^ 0xC341] = 0xFFFF3C8C ^ 0xC341;
        FuntimeHelperModule.H[0x88A7 ^ 0x886D] = 0x882C ^ 0x886D;
        FuntimeHelperModule.H[0xEC1C ^ 0xED40] = 0xED5C ^ 0xED40;
        FuntimeHelperModule.H[0x4345 ^ 0x43D9] = 0xFFFFBCAC ^ 0x43D9;
        FuntimeHelperModule.H[0x5B94 ^ 0x5BA9] = 0xFFFFA43F ^ 0x5BA9;
        FuntimeHelperModule.H[0x7D89 ^ 0x7DC7] = 0xFFFF8219 ^ 0x7DC7;
        FuntimeHelperModule.H[0x2653 ^ 0x2615] = 0x2606 ^ 0x2615;
        FuntimeHelperModule.H[0x194C ^ 0x1806] = 0x1816 ^ 0x1806;
        FuntimeHelperModule.H[0x769B ^ 0x7665] = 0x761B ^ 0x7665;
        FuntimeHelperModule.H[0x4E97 ^ 0x4EA9] = 0x4E84 ^ 0x4EA9;
        FuntimeHelperModule.H[0xFCF2 ^ 0xFCDE] = 0xFC97 ^ 0xFCDE;
        FuntimeHelperModule.H[0x2E20 ^ 0x2F18] = 0x2F30 ^ 0x2F18;
        FuntimeHelperModule.H[0x832C ^ 0x83B1] = 0xFFFF7C36 ^ 0x83B1;
        FuntimeHelperModule.H[0x13F4 ^ 0x12CE] = 0x12D1 ^ 0x12CE;
        FuntimeHelperModule.H[0x3D33 ^ 0x3D8D] = 0xFFFFC267 ^ 0x3D8D;
        FuntimeHelperModule.H[0x1EF3 ^ 0x1E4E] = 0x1E24 ^ 0x1E4E;
        FuntimeHelperModule.H[0x2320 ^ 0x2389] = 0xFFFFDC67 ^ 0x2389;
        FuntimeHelperModule.H[0x8266 ^ 0x8200] = 0x828D ^ 0x8200;
        FuntimeHelperModule.H[0xF255 ^ 0xF2E3] = 0xF2CA ^ 0xF2E3;
        FuntimeHelperModule.H[0x7011 ^ 0x705C] = 0xFFFF8FEE ^ 0x705C;
        FuntimeHelperModule.H[0x10DDE ^ 0x10D3E] = 0xFFFEF2EC ^ 0x10D3E;
        FuntimeHelperModule.H[0x52F7 ^ 0x523B] = 0x5238 ^ 0x523B;
        FuntimeHelperModule.H[0xC5AE ^ 0xC517] = 0xFFFF3AB7 ^ 0xC517;
        FuntimeHelperModule.H[0xB68F ^ 0xB7DC] = 0xB7EC ^ 0xB7DC;
        FuntimeHelperModule.H[0x3581 ^ 0x34DE] = 0xFFFFCB12 ^ 0x34DE;
        FuntimeHelperModule.H[0x579C ^ 0x568B] = 0x56C1 ^ 0x568B;
        FuntimeHelperModule.H[0x9BDC ^ 0x9AB4] = 0xFFFF651B ^ 0x9AB4;
        FuntimeHelperModule.H[0xC47E ^ 0xC455] = 0xC440 ^ 0xC455;
        FuntimeHelperModule.H[0x8AD5 ^ 0x8BBA] = 0x8B8C ^ 0x8BBA;
        FuntimeHelperModule.H[0x2EE6 ^ 0x2F81] = 0xFFFFD013 ^ 0x2F81;
        FuntimeHelperModule.H[0x70DE ^ 0x71EF] = 0x7193 ^ 0x71EF;
        FuntimeHelperModule.H[0x4C74 ^ 0x4C1E] = 0xFFFFB385 ^ 0x4C1E;
        FuntimeHelperModule.H[0xB270 ^ 0xB287] = 0xFFFF4D75 ^ 0xB287;
        FuntimeHelperModule.H[0x6A6F ^ 0x6A81] = 0xFFFF9535 ^ 0x6A81;
        FuntimeHelperModule.H[0x4E19 ^ 0x4E23] = 0xFFFFB1FD ^ 0x4E23;
        FuntimeHelperModule.H[0x1FB3 ^ 0x1F74] = 0x1F32 ^ 0x1F74;
        FuntimeHelperModule.H[0xCBC2 ^ 0xCB69] = 0xFFFF3417 ^ 0xCB69;
        FuntimeHelperModule.H[0xDDFA ^ 0xDC71] = 0xDC5B ^ 0xDC71;
        FuntimeHelperModule.H[0x8D0F ^ 0x8DAF] = 0xFFFF7221 ^ 0x8DAF;
        FuntimeHelperModule.H[0xB25F ^ 0xB2BC] = 0xB2F5 ^ 0xB2BC;
        FuntimeHelperModule.H[0xE62C ^ 0xE761] = 0xE76A ^ 0xE761;
        FuntimeHelperModule.H[0xD1DF ^ 0xD17C] = 0xFFFF2EF6 ^ 0xD17C;
        FuntimeHelperModule.H[0x12F4 ^ 0x12D2] = 0xFFFFED79 ^ 0x12D2;
        FuntimeHelperModule.H[0x3679 ^ 0x3755] = 0x365A ^ 0x3755;
        FuntimeHelperModule.H[0xAF4 ^ 0xABC] = 0xA97 ^ 0xABC;
        FuntimeHelperModule.H[0x8F59 ^ 0x8F37] = 0x8F29 ^ 0x8F37;
        FuntimeHelperModule.H[0x3013 ^ 0x3084] = 0xFFFFCF0C ^ 0x3084;
        FuntimeHelperModule.H[0x8A01 ^ 0x8A90] = 0x8AD5 ^ 0x8A90;
        FuntimeHelperModule.H[0x91F0 ^ 0x9172] = 0xFFFF6EE5 ^ 0x9172;
        FuntimeHelperModule.H[0x94CA ^ 0x94CB] = 0xFFFF6B20 ^ 0x94CB;
        FuntimeHelperModule.H[0xBD0E ^ 0xBD23] = 0xBD63 ^ 0xBD23;
        FuntimeHelperModule.H[0x4289 ^ 0x42D8] = 0x42FA ^ 0x42D8;
        FuntimeHelperModule.H[0x1ADD ^ 0x1BB7] = 0x1BBC ^ 0x1BB7;
        FuntimeHelperModule.H[0x5ED5 ^ 0x5FD3] = 0xFFFFA04A ^ 0x5FD3;
        FuntimeHelperModule.H[0xEC8A ^ 0xEDAD] = 0xEDBC ^ 0xEDAD;
        FuntimeHelperModule.H[0x54D4 ^ 0x541C] = 0x5430 ^ 0x541C;
        FuntimeHelperModule.H[0x3BB ^ 0x350] = 0xFFFFFCAF ^ 0x350;
        FuntimeHelperModule.H[0xCA17 ^ 0xCB12] = 0xCBF1 ^ 0xCB12;
        FuntimeHelperModule.H[0xECC1 ^ 0xEC66] = 0xFFFF13EC ^ 0xEC66;
        FuntimeHelperModule.H[0xEDBB ^ 0xED3F] = 0xFFFF12C6 ^ 0xED3F;
        FuntimeHelperModule.H[0x17AC ^ 0x1769] = 0xFFFFE899 ^ 0x1769;
        FuntimeHelperModule.H[0x6A46 ^ 0x6A1D] = 0xFFFF95D2 ^ 0x6A1D;
        FuntimeHelperModule.H[0xA636 ^ 0xA703] = 0xA733 ^ 0xA703;
        FuntimeHelperModule.H[0xB6A6 ^ 0xB62F] = 0xB673 ^ 0xB62F;
        FuntimeHelperModule.H[0xBFF2 ^ 0xBEFE] = 0xFFFF4115 ^ 0xBEFE;
        FuntimeHelperModule.H[0x615D ^ 0x6147] = 0x613B ^ 0x6147;
        FuntimeHelperModule.H[0xCEE2 ^ 0xCE9E] = 0xFFFF3160 ^ 0xCE9E;
        FuntimeHelperModule.H[0x1A32 ^ 0x1B59] = 0x1BAB ^ 0x1B59;
        FuntimeHelperModule.H[0x3D02 ^ 0x3D74] = 0x3D17 ^ 0x3D74;
        FuntimeHelperModule.H[0x3F2B ^ 0x3F10] = 0x3F69 ^ 0x3F10;
        FuntimeHelperModule.H[0xBB42 ^ 0xBB84] = 0xBBEE ^ 0xBB84;
        FuntimeHelperModule.H[0x21E0 ^ 0x21ED] = 0x2198 ^ 0x21ED;
        FuntimeHelperModule.H[0xE45B ^ 0xE527] = 0xFFFF1AAF ^ 0xE527;
        FuntimeHelperModule.H[0x3382 ^ 0x32CA] = 0xFFFFCD14 ^ 0x32CA;
        FuntimeHelperModule.H[0x585F ^ 0x58F9] = 0xFFFFA762 ^ 0x58F9;
        FuntimeHelperModule.H[0x5A7B ^ 0x5B79] = 0x5B5A ^ 0x5B79;
    }
}

