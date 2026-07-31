/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.module.modules.render;

import java.awt.Color;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import kotakbaz.rain.client.extensions.a_0;
import kotakbaz.rain.client.extensions.b;
import kotakbaz.rain.event.events.JumpEvent;
import kotakbaz.rain.event.events.PlayerUpdateEvent;
import kotakbaz.rain.event.events.Render3DEvent;
import kotakbaz.rain.module.Module;
import kotakbaz.rain.module.modules.render.Q;
import kotakbaz.rain.module.modules.render.m;
import kotakbaz.rain.module.setting.ClientColorSetting;
import kotakbaz.rain.module.setting.ModeSetting;
import kotakbaz.rain.module.setting.settings.SliderSetting;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.render.RainRenderLayers;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.util.BufferAllocator;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.RotationAxis;
import net.minecraft.util.math.Vec3d;
import org.jetbrains.annotations.NotNull;
import org.joml.Quaternionfc;
import sweetie.evaware.flora.api.Commando;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001DB\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\tH\u0007\u00a2\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\b\f\u0010\u0003J\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\rH\u0007\u00a2\u0006\u0004\b\u000e\u0010\u000fJG\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u0018H\u0002\u00a2\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0002\u00a2\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u001eH\u0002\u00a2\u0006\u0004\b!\u0010 J\u000f\u0010\"\u001a\u00020\u001eH\u0002\u00a2\u0006\u0004\b\"\u0010 J'\u0010&\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u00182\u0006\u0010$\u001a\u00020\u00182\u0006\u0010%\u001a\u00020\u0018H\u0002\u00a2\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0002\u00a2\u0006\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010.\u001a\u00020+8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b.\u0010-R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b0\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b3\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b6\u00107R\u0014\u00108\u001a\u0002058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b8\u00107R\u0014\u00109\u001a\u0002058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b9\u00107R\u0014\u0010:\u001a\u0002058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b:\u00107R\u0014\u0010;\u001a\u00020+8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b;\u0010-R$\u0010>\u001a\u0012\u0012\u0004\u0012\u00020\u00100<j\b\u0012\u0004\u0012\u00020\u0010`=8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b>\u0010?R\u001c\u0010A\u001a\n @*\u0004\u0018\u00010(0(8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bA\u0010BR\u001c\u0010C\u001a\n @*\u0004\u0018\u00010(0(8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bC\u0010B\u00a8\u0006E"}, d2={"Lkotakbaz/rain/module/modules/render/JumpCircleModule;", "Lkotakbaz/rain/module/Module;", "<init>", "()V", "Lkotakbaz/rain/event/events/JumpEvent;", "event", "", "onJump", "(Lkotakbaz/rain/event/events/JumpEvent;)V", "Lkotakbaz/rain/event/events/PlayerUpdateEvent;", "onPlayerUpdate", "(Lkotakbaz/rain/event/events/PlayerUpdateEvent;)V", "onDisable", "Lkotakbaz/rain/event/events/Render3DEvent;", "onRender3D", "(Lkotakbaz/rain/event/events/Render3DEvent;)V", "Lkotakbaz/rain/module/modules/render/JumpCircleModule$Circle;", "circle", "Lnet/minecraft/class_4587;", "matrices", "Lnet/minecraft/class_4597$class_4598;", "consumers", "Lnet/minecraft/class_1921;", "layer", "", "cameraX", "cameraY", "cameraZ", "renderCircle", "(Lkotakbaz/rain/module/modules/render/JumpCircleModule$Circle;Lnet/minecraft/class_4587;Lnet/minecraft/class_4597$class_4598;Lnet/minecraft/class_1921;DDD)V", "", "lifeTimeMillis", "()J", "spawnDurationMillis", "dieDurationMillis", "x", "y", "z", "spawnCircle", "(DDD)V", "Lnet/minecraft/class_2960;", "selectedTexture", "()Lnet/minecraft/class_2960;", "", "STYLE_GLOWING", "I", "STYLE_RAIN", "Lkotakbaz/rain/module/setting/ClientColorSetting;", "circleColor", "Lkotakbaz/rain/module/setting/ClientColorSetting;", "Lkotakbaz/rain/module/setting/ModeSetting;", "style", "Lkotakbaz/rain/module/setting/ModeSetting;", "Lkotakbaz/rain/module/setting/settings/SliderSetting;", "size", "Lkotakbaz/rain/module/setting/settings/SliderSetting;", "lifeTime", "spawnDuration", "dieDuration", "BUFFER_SIZE", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "circles", "Ljava/util/ArrayList;", "kotlin.jvm.PlatformType", "glowingTexture", "Lnet/minecraft/class_2960;", "rainTexture", "Circle", "rain-visuals"})
@SourceDebugExtension(value={"SMAP\nJumpCircleModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JumpCircleModule.kt\nkotakbaz/rain/module/modules/render/JumpCircleModule\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,206:1\n1915#2,2:207\n*S KotlinDebug\n*F\n+ 1 JumpCircleModule.kt\nkotakbaz/rain/module/modules/render/JumpCircleModule\n*L\n73#1:207,2\n*E\n"})
public final class JumpCircleModule
extends Module {
    @NotNull
    public static final JumpCircleModule INSTANCE;
    private static final int a = 0;
    private static final int A = 1;
    @NotNull
    private static final ClientColorSetting b;
    @NotNull
    private static final ModeSetting B;
    @NotNull
    private static final SliderSetting c;
    @NotNull
    private static final SliderSetting C;
    @NotNull
    private static final SliderSetting d;
    @NotNull
    private static final SliderSetting D;
    private static final int e = 262144;
    @NotNull
    private static final ArrayList<Q> E;
    private static final Identifier f;
    private static final Identifier F;
    private static Object[] g;
    private static Object h;
    private static Object[] H;
    private static Object[] G;
    private static Object[] i;
    public static int[] I;

    private JumpCircleModule() {
        int n2 = I[0];
        n2 += I[1];
        int n3 = I[3];
        n3 ^= I[4];
        int n4 = I[6];
        n4 -= I[7];
        super((String)g[n2 -= I[2]], a_0.getRENDER(), (String)g[n3 -= I[5]] + (String)g[n4 -= I[8]]);
    }

    @Commando
    public final void onJump(@NotNull JumpEvent event) {
        int n2 = I[9];
        n2 -= I[10];
        Intrinsics.checkNotNullParameter(event, (String)g[n2 -= I[11]]);
        ClientPlayerEntity clientPlayerEntity = kotakbaz.rain.client.extensions.b.getMc().player;
        if (clientPlayerEntity != null) {
            this.spawnCircle(clientPlayerEntity.getX(), clientPlayerEntity.getY() + Double.longBitsToDouble(0xA3507C5E4CA6AB15L ^ 0x9C907C5E4CA6AB15L), clientPlayerEntity.getZ());
        }
    }

    @Commando
    public final void onPlayerUpdate(@NotNull PlayerUpdateEvent event) {
        int n2 = I[12];
        n2 -= I[13];
        Intrinsics.checkNotNullParameter(event, (String)g[n2 ^= I[14]]);
        if (E.isEmpty()) {
            return;
        }
        CollectionsKt.removeAll((List)E, (Function1)m.INSTANCE);
    }

    @Override
    public void onDisable() {
        E.clear();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Commando
    public final void onRender3D(@NotNull Render3DEvent event) {
        long l2 = -258855579323752459L;
        int n2 = I[15];
        n2 -= I[16];
        Intrinsics.checkNotNullParameter(event, (String)g[n2 ^= I[17]]);
        if (!this.isEnabled()) {
            return;
        }
        if (E.isEmpty()) {
            return;
        }
        int n3 = I[18];
        n3 ^= I[19];
        try (BufferAllocator bufferAllocator = new BufferAllocator(n3 ^= I[20]);){
            VertexConsumerProvider.Immediate immediate = VertexConsumerProvider.immediate((BufferAllocator)bufferAllocator);
            MatrixStack matrixStack = event.getMatrices();
            Vec3d vec3d = kotakbaz.rain.client.extensions.b.getMc().gameRenderer.getCamera().getPos();
            RenderLayer renderLayer = RainRenderLayers.getJumpCircle((Identifier)this.selectedTexture());
            Iterable iterable = E;
            long l3 = l2;
            int n4 = I[21];
            n4 += I[22];
            l2 = l3 ^ (0L ^ l3) & -1L << (n4 += I[23]);
            for (Object t2 : iterable) {
                Q q2 = (Q)t2;
                long l4 = l2;
                int n5 = I[24];
                n5 += I[25];
                l2 = l4 ^ (0L ^ l4) & -1L >>> (n5 ^= I[26]);
                Intrinsics.checkNotNull(immediate);
                Intrinsics.checkNotNull(renderLayer);
                INSTANCE.renderCircle(q2, matrixStack, immediate, renderLayer, vec3d.x, vec3d.y, vec3d.z);
            }
            immediate.draw();
        }
    }

    private final void renderCircle(Q circle, MatrixStack matrices, VertexConsumerProvider.Immediate consumers, RenderLayer layer, double cameraX, double cameraY, double cameraZ) {
        int n2;
        long l2 = 8633629636183773503L;
        long l3 = 4675616159489958902L;
        long l4 = -3549521431085578343L;
        long l5 = -2459329584504086395L;
        long l6 = 7245164677579090701L;
        long l7 = -945674969321448437L;
        long l8 = -1339641641678239641L;
        long l9 = 4419475918025985131L;
        long l10 = -284254651888743203L;
        long l11 = 3406864566382038834L;
        long l12 = 7339415323358894944L;
        long l13 = 8231951511856427277L;
        circle.updateAnimations();
        float f2 = circle.alpha();
        if (f2 <= 0.0f) {
            return;
        }
        float f3 = circle.scale();
        float f4 = circle.getSize() * f3;
        if (f4 <= 0.0f) {
            return;
        }
        float f5 = f4 * 0.5f;
        Color color = b.getValue();
        int n3 = I[27];
        n3 ^= I[28];
        n3 ^= I[29];
        int n4 = I[30];
        n4 += I[31];
        n4 ^= I[32];
        int n5 = I[33];
        n5 ^= I[34];
        long l14 = l13;
        int n6 = I[36];
        n6 -= I[37];
        l13 = l14 ^ ((long)RangesKt.coerceIn((int)(f2 * (float)color.getAlpha()), n3, n4) << (n5 ^= I[35]) ^ l14) & -1L << (n6 -= I[38]);
        long l15 = l12;
        int n7 = I[39];
        n7 += I[40];
        l12 = l15 ^ ((long)color.getRed() ^ l15) & -1L >>> (n7 += I[41]);
        int n8 = I[42];
        n8 -= I[43];
        long l16 = l11;
        int n9 = I[45];
        n9 -= I[46];
        long l17 = l11 = l16 ^ ((long)color.getGreen() << (n8 -= I[44]) ^ l16) & -1L << (n9 ^= I[47]);
        int n10 = I[48];
        n10 -= I[49];
        l11 = l17 ^ ((long)color.getBlue() ^ l17) & -1L >>> (n10 ^= I[50]);
        int n11 = I[51];
        n11 -= I[52];
        if (B.getSelectedIndex() == (n11 ^= I[53])) {
            int n12 = I[54];
            n12 -= I[55];
            n2 = n12 += I[56];
        } else {
            int n13 = I[57];
            n13 -= I[58];
            n2 = n13 += I[59];
        }
        int n14 = I[60];
        n14 -= I[61];
        long l18 = l12;
        int n15 = I[63];
        n15 += I[64];
        l12 = l18 ^ ((long)n2 << (n14 -= I[62]) ^ l18) & -1L << (n15 += I[65]);
        int n16 = I[66];
        n16 ^= I[67];
        float f6 = (int)(l12 >>> (n16 -= I[68])) != 0 ? 1.0f : 0.0f;
        int n17 = I[69];
        n17 ^= I[70];
        float f7 = (int)(l12 >>> (n17 += I[71])) != 0 ? 0.0f : 1.0f;
        matrices.push();
        matrices.translate(circle.getX() - cameraX, circle.getY() - cameraY, circle.getZ() - cameraZ);
        matrices.multiply((Quaternionfc)RotationAxis.POSITIVE_X.rotationDegrees(90.0f));
        matrices.translate(-((double)f5), -((double)f5), Double.longBitsToDouble(0xEC51C57FF6DD573L ^ 0x314166B6B8C3C108L));
        MatrixStack.Entry entry = matrices.peek();
        VertexConsumer vertexConsumer = consumers.getBuffer(layer);
        int n18 = I[72];
        n18 += I[73];
        int n19 = I[75];
        n19 += I[76];
        vertexConsumer.vertex(entry, 0.0f, 0.0f, 0.0f).color((int)l12, (int)(l11 >>> (n18 += I[74])), (int)l11, (int)(l13 >>> (n19 ^= I[77]))).texture(f6, 1.0f);
        int n20 = I[78];
        n20 -= I[79];
        int n21 = I[81];
        n21 -= I[82];
        vertexConsumer.vertex(entry, f4, 0.0f, 0.0f).color((int)l12, (int)(l11 >>> (n20 += I[80])), (int)l11, (int)(l13 >>> (n21 -= I[83]))).texture(f7, 1.0f);
        int n22 = I[84];
        n22 -= I[85];
        int n23 = I[87];
        n23 -= I[88];
        vertexConsumer.vertex(entry, f4, f4, 0.0f).color((int)l12, (int)(l11 >>> (n22 -= I[86])), (int)l11, (int)(l13 >>> (n23 ^= I[89]))).texture(f7, 0.0f);
        int n24 = I[90];
        n24 += I[91];
        int n25 = I[93];
        n25 ^= I[94];
        vertexConsumer.vertex(entry, 0.0f, f4, 0.0f).color((int)l12, (int)(l11 >>> (n24 += I[92])), (int)l11, (int)(l13 >>> (n25 ^= I[95]))).texture(f6, 0.0f);
        matrices.pop();
    }

    private final long lifeTimeMillis() {
        int n2 = I[96];
        n2 += I[97];
        return (long)RangesKt.coerceAtLeast((int)((Number)C.getValue()).floatValue(), n2 -= I[98]) * 50L;
    }

    private final long spawnDurationMillis() {
        int n2 = I[99];
        n2 += I[100];
        return (long)RangesKt.coerceAtLeast((int)((Number)d.getValue()).floatValue(), n2 ^= I[101]) * 50L;
    }

    private final long dieDurationMillis() {
        int n2 = I[102];
        n2 ^= I[103];
        return (long)RangesKt.coerceAtLeast((int)((Number)D.getValue()).floatValue(), n2 -= I[104]) * 50L;
    }

    private final void spawnCircle(double x2, double y, double z) {
        E.add(new Q(x2, y, z, ((Number)c.getValue()).floatValue(), this.lifeTimeMillis(), this.spawnDurationMillis(), this.dieDurationMillis()));
    }

    private final Identifier selectedTexture() {
        Identifier identifier;
        switch (B.getSelectedIndex()) {
            case 1: {
                Identifier identifier2 = F;
                identifier = identifier2;
                int n2 = I[105];
                n2 -= I[106];
                Intrinsics.checkNotNullExpressionValue(identifier2, (String)g[n2 ^= I[107]]);
                break;
            }
            case 0: {
                Identifier identifier3 = f;
                identifier = identifier3;
                int n3 = I[108];
                n3 -= I[109];
                Intrinsics.checkNotNullExpressionValue(identifier3, (String)g[n3 += I[110]]);
                break;
            }
            default: {
                Identifier identifier4 = f;
                identifier = identifier4;
                int n4 = I[111];
                n4 += I[112];
                Intrinsics.checkNotNullExpressionValue(identifier4, (String)g[n4 += I[113]]);
            }
        }
        return identifier;
    }

    static {
        JumpCircleModule.b();
        long l2 = 4258240343026836276L;
        long l3 = 8929896671187138682L;
        long l4 = 9163126528948571074L;
        long l5 = -4995108088588097598L;
        long l6 = 2274096563524553132L;
        long l7 = 2256392588581923366L;
        long l8 = 5836353048258982178L;
        long l9 = 6740533680712294488L;
        long l10 = 2711317619414292851L;
        long l11 = 1994300379902771244L;
        long l12 = 3515651651481642471L;
        long l13 = -5613107812028154993L;
        long l14 = -7354651430131759157L;
        long l15 = -3791162302366211401L;
        int n2 = I[114];
        n2 ^= I[115];
        g = new Object[n2 ^= I[116]];
        long l16 = l15;
        int n3 = I[117];
        n3 ^= I[118];
        l15 = l16 ^ (0L ^ l16) & -1L << (n3 += I[119]);
        Object[] objectArray = new Object[I[120]];
        objectArray[JumpCircleModule.I[121]] = G;
        objectArray[JumpCircleModule.I[122]] = I[123];
        int n4 = I[124];
        Object object = JumpCircleModule.A()[I[125]];
        if (object == null) {
            char[] cArray = "\u6e58\u6e64\u6e62\u6eb1\u6e51\u6e47\u6eb6\u6e6d\u6e71\u6e9f\u6e63\u6e4e\u6e39\u6e63\u6e65\u6e9f\u6e5d\u6e74\u6e76\u6e62\u6e74\u6e6e\u6eb7\u6e42\u6e5c\u6e53\u6e43\u6eb7\u6e61\u6e64\u6e72\u6e3d\u6e44\u6e6d\u6e58\u6e77\u6e9f\u6e74\u6e3e\u6e61\u6e52\u6e67\u6eb7\u6ead\u6e9b\u6e40\u6eb8\u6e5c\u6e44\u6e58\u6e42\u6eb7\u6e5b\u6e75\u6e45\u6e73\u6e52\u6e64\u6e5d\u6e45\u6e61\u6e5d\u6e3b\u6eb1\u6e5c\u6e5a\u6e9c\u6e41\u6e3f\u6e59\u6e43\u6e72\u6e60\u6e73\u6e71\u6e5a\u6e52\u6e3b\u6e55\u6e51\u6eb8\u6e54\u6e59\u6e6e\u6e9c\u6e6e\u6e45\u6e5d\u6e5c\u6e48\u6e5b\u6e61\u6e60\u6e39\u6eb2\u6e48\u6e73\u6e58\u6e4e\u6e41\u6e9f\u6e3b\u6e5b\u6e47\u6e53\u6e6d\u6e43\u6e5d\u6e76\u6eb4\u6e77\u6e41\u6e4d\u6e59\u6e57\u6e61\u6e3d\u6e4e\u6eb4\u6e59\u6e5c\u6e6d\u6e63\u6e78\u6e77\u6e39\u6eb8\u6e63\u6e61\u6e72\u6e48\u6eb4\u6e48\u6e60\u6e5d\u6e42\u6e71\u6e5b\u6e65\u6e4e\u6e73\u6e66\u6e73\u6e5e\u6e59\u6e5e\u6e78\u6e57\u6e9b\u6e63\u6e5e\u6e65\u6e53\u6e65\u6e67\u6e58\u6e6e\u6e3c\u6e63\u6e46\u6e43\u6eb3\u6e67\u6e77\u6e5f\u6e72\u6e46\u6e61\u6e54\u6e42\u6e3f\u6e53\u6eb2\u6e39\u6e57\u6e3b\u6e65\u6e67\u6e5f\u6e77\u6e45\u6e57\u6e40\u6e71\u6e40\u6e74\u6eb4\u6e54\u6e48\u6e9f\u6e3a\u6e5f\u6eb2\u6e5f\u6e57\u6e6d\u6e5f\u6eb4\u6e68\u6e68\u6e5c\u6e9b\u6e42\u6ead\u6e40\u6e44\u6e61\u6eb4\u6e58\u6e59\u6e5a\u6e64\u6ead\u6e5b\u6e41\u6e77\u6e60\u6e72\u6eb7\u6e41\u6e74\u6e74\u6e5d\u6e4e\u6e45\u6e5e\u6e55\u6e46\u6e59\u6eb3\u6e3c\u6e62\u6e40\u6e55\u6ead\u6eb3\u6e60\u6e59\u6e66\u6e3b\u6e3a\u6ead\u6e9b\u6e3a\u6e3b\u6e41\u6e9c\u6e3e\u6e5d\u6e3d\u6e55\u6e55\u6e4e\u6eb5\u6eb5\u6eb7\u6e76\u6e48\u6e76\u6e3f\u6e5b\u6e9b\u6e71\u6e67\u6e72\u6e5f\u6e62\u6eb5\u6e58\u6e5d\u6e73\u6e9b\u6e65\u6e40\u6e73\u6e57\u6e41\u6e5c\u6e6d\u6e72\u6e5c\u6e5c\u6e5f\u6e67\u6e56\u6e71\u6e42\u6e67\u6e56\u6e51\u6e39\u6e67\u6e53\u6e3f\u6e46\u6e44\u6e53\u6eb4\u6e60\u6e44\u6eb8\u6e53\u6e5f\u6e63\u6e3c\u6e3a\u6e3d\u6e6e\u6eb6\u6e43\u6eb5\u6e71\u6e60\u6e4d\u6e5e\u6e73\u6e5d\u6e5a\u6eb3\u6e41\u6e39\u6e65\u6e9b\u6e47\u6e6e\u6eb7\u6e45\u6e43\u6e6e\u6e41\u6e68\u6eb7\u6e45\u6e5a\u6e45\u6e5c\u6ead\u6e55\u6eb6\u6e65\u6ead\u6e5d\u6e76\u6e65\u6e55\u6e55\u6e71\u6e74\u6e6e\u6e57\u6e65\u6e6d\u6e74\u6e53\u6e9c\u6e68\u6e45\u6e67\u6e5e\u6e52\u6e45\u6e51\u6eb6\u6e67\u6e72\u6e42\u6e51\u6e78\u6e3a\u6e64\u6e39\u6e72\u6e9c\u6e3a\u6e48\u6eb6\u6eb7\u6e9b\u6eb8\u6e5a\u6e59\u6eb2\u6eb3\u6e5a\u6e9f\u6e3c\u6e71\u6e67\u6e55\u6e3f\u6e75\u6e5b\u6e65\u6eb4\u6e46\u6e59\u6e4d\u6e45\u6eb1\u6e77\u6e59\u6e3d\u6eb7\u6e41\u6e67\u6e6d\u6ead\u6e47\u6e5a\u6e76\u6eb3\u6e3f\u6e55\u6e5e\u6e3b\u6e76\u6e5d\u6e72\u6e72\u6e76\u6eb2\u6e42\u6e3c\u6eb5\u6e66\u6e5c\u6e56\u6e67\u6e5a\u6e53\u6e3a\u6e72\u6eb2\u6e6e\u6e41\u6e5e\u6e63\u6e6e\u6e73\u6e4e\u6e74\u6e73\u6e67\u6e68\u6e52\u6e40\u6eb8\u6e43\u6e68\u6e62\u6eb2\u6eb2\u6e5b\u6e3f\u6e9f\u6e3c\u6eb6\u6eb2\u6e71\u6e5a\u6ead\u6e44\u6e66\u6e62\u6e67\u6eb2\u6e4d\u6e9c\u6e59\u6e4d\u6e62\u6e40\u6e48\u6e39\u6e6d\u6e67\u6e9f\u6e62\u6e56\u6e5a\u6e71\u6e52\u6e39\u6eb6\u6e61\u6e67\u6e5c\u6eb5\u6e54\u6e5e\u6e45\u6ea9".toCharArray();
            for (int i2 = I[126]; i2 < I[127]; ++i2) {
                int n5 = cArray[i2];
                n5 += I[128];
                n5 += I[129];
                n5 -= I[130];
                n5 -= I[131];
                n5 += I[132];
                n5 += I[133];
                n5 ^= I[134];
                n5 ^= I[135];
                n5 ^= I[136];
                n5 ^= I[137];
                n5 ^= I[138];
                n5 ^= I[139];
                cArray[i2] = (char)(n5 -= I[140]);
            }
            object = JumpCircleModule.A()[JumpCircleModule.I[141]] = new String(cArray);
        }
        objectArray[n4] = (String)object;
        char[] cArray = ((String)JumpCircleModule.a(objectArray)).toCharArray();
        long l17 = l6;
        int n6 = I[142];
        n6 ^= I[143];
        l6 = l17 ^ (0x10A00000000L ^ l17) & -1L << (n6 ^= I[144]);
        long l18 = l13;
        int n7 = I[145];
        n7 ^= I[146];
        l13 = l18 ^ (0L ^ l18) & -1L >>> (n7 -= I[147]);
        while (true) {
            int n8 = I[148];
            n8 -= I[149];
            if ((int)l13 >= (int)(l6 >>> (n8 -= I[150]))) break;
            int n9 = (int)l13;
            long l19 = l13;
            int n10 = I[151];
            n10 ^= I[152];
            int n11 = I[154];
            n11 ^= I[155];
            l13 = l19 ^ (l19 ^ l19 + (long)(n10 -= I[153])) & -1L >>> (n11 ^= I[156]);
            long l20 = l9;
            int n12 = I[157];
            n12 -= I[158];
            l9 = l20 ^ ((long)cArray[n9] ^ l20) & -1L >>> (n12 -= I[159]);
            int n13 = (int)l13;
            long l21 = l13;
            int n14 = I[160];
            n14 -= I[161];
            int n15 = I[163];
            n15 += I[164];
            l13 = l21 ^ (l21 ^ l21 + (long)(n14 += I[162])) & -1L >>> (n15 -= I[165]);
            int n16 = I[166];
            n16 += I[167];
            long l22 = l10;
            int n17 = I[169];
            n17 += I[170];
            l10 = l22 ^ ((long)cArray[n13] << (n16 -= I[168]) ^ l22) & -1L << (n17 += I[171]);
            int n18 = I[172];
            n18 += I[173];
            n18 -= I[174];
            int n19 = I[175];
            n19 ^= I[176];
            long l23 = l12;
            int n20 = I[178];
            n20 ^= I[179];
            l12 = l23 ^ ((long)((int)l9 << n18 | (int)(l10 >>> (n19 -= I[177]))) ^ l23) & -1L >>> (n20 ^= I[180]);
            char[] cArray2 = new char[(int)l12];
            long l24 = l14;
            int n21 = I[181];
            n21 -= I[182];
            l14 = l24 ^ (0L ^ l24) & -1L << (n21 ^= I[183]);
            while (true) {
                int n22 = I[184];
                n22 -= I[185];
                if ((int)(l14 >>> (n22 -= I[186])) >= (int)l12) break;
                int n23 = I[187];
                n23 -= I[188];
                int n24 = I[190];
                n24 -= I[191];
                cArray2[(int)(l14 >>> (n23 -= JumpCircleModule.I[189]))] = cArray[(int)l13 + (int)(l14 >>> (n24 ^= I[192]))];
                l14 += 0x100000000L;
            }
            int n25 = I[193];
            n25 -= I[194];
            int n26 = (int)(l15 >>> (n25 += I[195]));
            l15 += 0x100000000L;
            JumpCircleModule.g[n26] = new String(cArray2);
            long l25 = l13;
            int n27 = I[196];
            n27 -= I[197];
            l13 = l25 ^ ((long)((int)l13 + (int)l12) ^ l25) & -1L >>> (n27 ^= I[198]);
        }
        INSTANCE = new JumpCircleModule();
        int n28 = I[199];
        n28 -= I[200];
        n28 -= I[201];
        int n29 = I[202];
        n29 -= I[203];
        n29 ^= I[204];
        int n30 = I[205];
        n30 += I[206];
        n30 += I[207];
        int n31 = I[208];
        n31 ^= I[209];
        int n32 = I[211];
        n32 += I[212];
        int n33 = I[214];
        n33 -= I[215];
        b = Module.clientColor$default(INSTANCE, (String)g[n28], new Color(n29, n30, n31 ^= I[210], n32 += I[213]), null, n33 ^= I[216], null);
        int n34 = I[217];
        n34 ^= I[218];
        n34 -= I[219];
        int n35 = I[220];
        n35 += I[221];
        String[] stringArray = new String[n35 -= I[222]];
        int n36 = I[223];
        n36 -= I[224];
        int n37 = I[226];
        n37 += I[227];
        stringArray[n36 += JumpCircleModule.I[225]] = (String)g[n37 -= I[228]];
        int n38 = I[229];
        n38 -= I[230];
        int n39 = I[232];
        n39 += I[233];
        stringArray[n38 += JumpCircleModule.I[231]] = (String)g[n39 -= I[234]];
        int n40 = I[235];
        n40 ^= I[236];
        int n41 = I[238];
        n41 += I[239];
        B = Module.mode$default(INSTANCE, (String)g[n34], CollectionsKt.listOf(stringArray), n40 += I[237], n41 += I[240], null);
        int n42 = I[241];
        n42 ^= I[242];
        c = INSTANCE.slider((String)g[n42 += I[243]], 2.0f, 1.0f, 6.0f, 0.1f);
        int n43 = I[244];
        n43 += I[245];
        C = INSTANCE.slider((String)g[n43 ^= I[246]], 5.0f, 1.0f, 20.0f, 1.0f);
        int n44 = I[247];
        n44 ^= I[248];
        d = INSTANCE.slider((String)g[n44 += I[249]], 5.0f, 1.0f, 20.0f, 1.0f);
        int n45 = I[250];
        n45 ^= I[251];
        D = INSTANCE.slider((String)g[n45 += I[252]], 5.0f, 1.0f, 20.0f, 1.0f);
        E = new ArrayList();
        int n46 = I[253];
        n46 += I[254];
        int n47 = I[256];
        n47 ^= I[257];
        int n48 = I[259];
        n48 += I[260];
        f = Identifier.of((String)((String)g[n46 += I[255]]), (String)((String)g[n47 ^= I[258]] + (String)g[n48 -= I[261]]));
        int n49 = I[262];
        n49 -= I[263];
        int n50 = I[265];
        n50 ^= I[266];
        int n51 = I[268];
        n51 ^= I[269];
        F = Identifier.of((String)((String)g[n49 ^= I[264]]), (String)((String)g[n50 -= I[267]] + (String)g[n51 -= I[270]]));
    }

    public static Object a(Object[] object) {
        Object object2;
        int n2 = (Integer)object[I[271]];
        String string = (String)object[I[272]];
        object = object[I[273]];
        Object[] objectArray = H;
        if (H == null) {
            objectArray = H = new Object[I[274]];
        }
        if ((object2 = objectArray[n2]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[I[275]];
                G = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[I[277] ^ I[278]];
                byArray[JumpCircleModule.I[279] ^ JumpCircleModule.I[280]] = I[281] ^ I[282];
                byArray[JumpCircleModule.I[283] ^ JumpCircleModule.I[284]] = I[285] ^ I[286];
                byArray[JumpCircleModule.I[287] ^ JumpCircleModule.I[288]] = I[289] ^ I[290];
                byArray[JumpCircleModule.I[291] ^ JumpCircleModule.I[292]] = I[293] ^ I[294];
                byArray[JumpCircleModule.I[295] ^ JumpCircleModule.I[296]] = I[297] ^ I[298];
                byArray[JumpCircleModule.I[299] ^ JumpCircleModule.I[300]] = I[301] ^ I[302];
                byArray[JumpCircleModule.I[303] ^ JumpCircleModule.I[304]] = I[305] ^ I[306];
                byArray[JumpCircleModule.I[307] ^ JumpCircleModule.I[308]] = I[309] ^ I[310];
                byArray[JumpCircleModule.I[311] ^ JumpCircleModule.I[312]] = I[313] ^ I[314];
                byArray[JumpCircleModule.I[315] ^ JumpCircleModule.I[316]] = I[317] ^ I[318];
                byArray[JumpCircleModule.I[319] ^ JumpCircleModule.I[320]] = I[321] ^ I[322];
                byArray[JumpCircleModule.I[323] ^ JumpCircleModule.I[324]] = I[325] ^ I[326];
                byArray[JumpCircleModule.I[327] ^ JumpCircleModule.I[328]] = I[329] ^ I[330];
                byArray[JumpCircleModule.I[331] ^ JumpCircleModule.I[332]] = I[333] ^ I[334];
                byArray[JumpCircleModule.I[335] ^ JumpCircleModule.I[336]] = I[337] ^ I[338];
                byArray[JumpCircleModule.I[339] ^ JumpCircleModule.I[340]] = I[341] ^ I[342];
                objectArray2[JumpCircleModule.I[276]] = byArray;
            }
            byte[] byArray = (byte[])object3[I[343]];
            if (h == null) {
                byte[] byArray2 = new byte[I[344] ^ I[345]];
                byArray2[JumpCircleModule.I[346] ^ JumpCircleModule.I[347]] = I[348] ^ I[349];
                byArray2[JumpCircleModule.I[350] ^ JumpCircleModule.I[351]] = I[352] ^ I[353];
                byArray2[JumpCircleModule.I[354] ^ JumpCircleModule.I[355]] = I[356] ^ I[357];
                byArray2[JumpCircleModule.I[358] ^ JumpCircleModule.I[359]] = I[360] ^ I[361];
                byArray2[JumpCircleModule.I[362] ^ JumpCircleModule.I[363]] = I[364] ^ I[365];
                byArray2[JumpCircleModule.I[366] ^ JumpCircleModule.I[367]] = I[368] ^ I[369];
                byArray2[JumpCircleModule.I[370] ^ JumpCircleModule.I[371]] = I[372] ^ I[373];
                byArray2[JumpCircleModule.I[374] ^ JumpCircleModule.I[375]] = I[376] ^ I[377];
                byArray2[JumpCircleModule.I[378] ^ JumpCircleModule.I[379]] = I[380] ^ I[381];
                byArray2[JumpCircleModule.I[382] ^ JumpCircleModule.I[383]] = I[384] ^ I[385];
                byArray2[JumpCircleModule.I[386] ^ JumpCircleModule.I[387]] = I[388] ^ I[389];
                byArray2[JumpCircleModule.I[390] ^ JumpCircleModule.I[391]] = I[392] ^ I[393];
                byArray2[JumpCircleModule.I[394] ^ JumpCircleModule.I[395]] = I[396] ^ I[397];
                byArray2[JumpCircleModule.I[398] ^ JumpCircleModule.I[399]] = 0x1F2C ^ 0x1F4A;
                byArray2[0xC209 ^ 0xC205] = 0xFFFF3DFE ^ 0xC205;
                byArray2[0x302F ^ 0x3033] = 0xFFFFCFBD ^ 0x3033;
                byArray2[0x8AA0 ^ 0x8AB3] = 0xFFFF7560 ^ 0x8AB3;
                byArray2[0x8820 ^ 0x8828] = 0xFFFF7798 ^ 0x8828;
                byArray2[0xA8BD ^ 0xA8BC] = 0xA8CA ^ 0xA8BC;
                byArray2[0x81E3 ^ 0x81F9] = 0x81B6 ^ 0x81F9;
                byArray2[0xCEBC ^ 0xCEB9] = 0xFFFF3156 ^ 0xCEB9;
                byArray2[0x6ACA ^ 0x6AD3] = 0xFFFF951D ^ 0x6AD3;
                byArray2[0x9907 ^ 0x9905] = 0xFFFF66B1 ^ 0x9905;
                byArray2[0x15D5 ^ 0x15DB] = 0xFFFFEA74 ^ 0x15DB;
                byArray2[0xBEEB ^ 0xBEEF] = 0xFFFF411D ^ 0xBEEF;
                byArray2[0x2203 ^ 0x2204] = 0x2214 ^ 0x2204;
                byArray2[0xC2D4 ^ 0xC2C3] = 0xC2B5 ^ 0xC2C3;
                byArray2[0x585C ^ 0x5851] = 0xFFFFA7EA ^ 0x5851;
                byArray2[0x109B0 ^ 0x109B0] = 0xFFFEF605 ^ 0x109B0;
                byArray2[0x9113 ^ 0x911C] = 0xFFFF6EC4 ^ 0x911C;
                byArray2[0xB8BC ^ 0xB8B5] = 0xB8F1 ^ 0xB8B5;
                byArray2[0x1403 ^ 0x1412] = 0xFFFFEBD9 ^ 0x1412;
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, 0, byArray3, 0, byArray.length);
                System.arraycopy(byArray2, 0, byArray3, byArray.length, byArray2.length);
                Object object4 = JumpCircleModule.A()[1];
                if (object4 == null) {
                    char[] cArray = "\u2ce4\u2cb2\u2ce9\u2cb0\u2cae\u2d02\u2d1d\u2d0b\u2d00\u2d0c\u2cac\u3347\u2d13\u2d11\u2d21\u2cac\u2cb3\u2d03".toCharArray();
                    for (int i2 = 0; i2 < 18; ++i2) {
                        int n3 = cArray[i2];
                        n3 -= 28881;
                        n3 += 36836;
                        n3 -= 35637;
                        n3 ^= 0x5B26;
                        n3 += 45240;
                        n3 ^= 0x3619;
                        n3 += 61818;
                        n3 -= 36955;
                        n3 -= 16108;
                        n3 += 36620;
                        n3 += 56446;
                        cArray[i2] = (char)(n3 += 63502);
                    }
                    object4 = JumpCircleModule.A()[1] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[16];
                byArray4[7] = -3;
                byArray4[10] = -35;
                byArray4[2] = 90;
                byArray4[15] = 77;
                byArray4[8] = -115;
                byArray4[9] = -27;
                byArray4[0] = 103;
                byArray4[5] = 51;
                byArray4[4] = -22;
                byArray4[3] = -43;
                byArray4[1] = 95;
                byArray4[13] = 99;
                byArray4[11] = -97;
                byArray4[14] = -100;
                byArray4[12] = 51;
                byArray4[6] = 11;
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, 28, 256);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = JumpCircleModule.A()[2];
                if (object5 == null) {
                    char[] cArray = "\u325d\u3239\u1963".toCharArray();
                    for (int i3 = 0; i3 < 3; ++i3) {
                        int n4 = cArray[i3];
                        n4 += 26336;
                        n4 ^= 0xAEC5;
                        n4 += 21574;
                        n4 ^= 0x436;
                        n4 -= 60488;
                        n4 ^= 0xCE9;
                        n4 += 699;
                        n4 ^= 0x6D6C;
                        n4 -= 3452;
                        n4 -= 27260;
                        n4 ^= 0x7B1E;
                        cArray[i3] = (char)(n4 ^= 0x7CF);
                    }
                    object5 = JumpCircleModule.A()[2] = new String(cArray);
                }
                h = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, 0, 16);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, 16, byArray6.length);
            Object object6 = JumpCircleModule.A()[3];
            if (object6 == null) {
                char[] cArray = "\ub2b7\ub2eb\ub2d9\ub785\ub2e9\ub2e8\ub2e9\ub785\ub2e6\ub2e1\ub2e9\ub2d9\ub77b\ub2e6\ub297\ub29a\ub29a\ub2cf\ub2c4\ub2cd".toCharArray();
                for (int i4 = 0; i4 < 20; ++i4) {
                    int n5 = cArray[i4];
                    n5 ^= 0xF1E2;
                    n5 -= 34915;
                    n5 ^= 0x72C6;
                    n5 ^= 0x762B;
                    n5 ^= 0x290C;
                    n5 += 10382;
                    n5 += 44176;
                    n5 += 12116;
                    n5 ^= 0xF419;
                    n5 -= 17403;
                    n5 ^= 0x65BC;
                    n5 -= 37822;
                    cArray[i4] = (char)(n5 ^= 0xBA1E);
                }
                object6 = JumpCircleModule.A()[3] = new String(cArray);
            }
            Cipher cipher = Cipher.getInstance((String)object6);
            cipher.init(2, (Key)((SecretKey)h), new IvParameterSpec(byArray7));
            byte[] byArray9 = cipher.doFinal(byArray8);
            object2 = new String(byArray9, StandardCharsets.UTF_8);
        }
        return object2;
    }

    private static Object[] A() {
        Object[] objectArray = i;
        if (i == null) {
            i = new Object[4];
            objectArray = i;
        }
        return objectArray;
    }

    public static void b() {
        I = new int[0x3F07 ^ 0x3E97];
        JumpCircleModule.I[0x1698 ^ 0x162D] = 0xFFFFE931 ^ 0x162D;
        JumpCircleModule.I[0x97AF ^ 0x96B2] = 0xFFFFEE3C ^ 0x96B2;
        JumpCircleModule.I[0xD5B0 ^ 0xD5CA] = 0xD5CB ^ 0xD5CA;
        JumpCircleModule.I[0x9298 ^ 0x93D9] = 0xFFFFF687 ^ 0x93D9;
        JumpCircleModule.I[0xCB3A ^ 0xCB8E] = 0xCB92 ^ 0xCB8E;
        JumpCircleModule.I[0x76CB ^ 0x774F] = 0xFFFF1A3F ^ 0x774F;
        JumpCircleModule.I[0xFAC0 ^ 0xFAEB] = 0xFADC ^ 0xFAEB;
        JumpCircleModule.I[0x9BA8 ^ 0x9A20] = 0xFFFFBE0F ^ 0x9A20;
        JumpCircleModule.I[0x7751 ^ 0x776C] = 0xFFFF8886 ^ 0x776C;
        JumpCircleModule.I[0x87AA ^ 0x8719] = 0xFFFF78AD ^ 0x8719;
        JumpCircleModule.I[0x5F53 ^ 0x5FA9] = 0xFFFFA07D ^ 0x5FA9;
        JumpCircleModule.I[0x10D3F ^ 0x10D9B] = 0xFFFEF255 ^ 0x10D9B;
        JumpCircleModule.I[0x1642 ^ 0x176F] = 0xFFFF6771 ^ 0x176F;
        JumpCircleModule.I[0xC009 ^ 0xC0DD] = 0xFFFF3F35 ^ 0xC0DD;
        JumpCircleModule.I[0x9CA1 ^ 0x9DC2] = 0xF43C ^ 0x9DC2;
        JumpCircleModule.I[0x8B0 ^ 0x980] = 0xE8B3 ^ 0x980;
        JumpCircleModule.I[0xD814 ^ 0xD85D] = 0xD84D ^ 0xD85D;
        JumpCircleModule.I[0x10907 ^ 0x1083F] = 0x1DCEB ^ 0x1083F;
        JumpCircleModule.I[0x470 ^ 0x52E] = 0xEABA ^ 0x52E;
        JumpCircleModule.I[0x4885 ^ 0x49F2] = 0x7CC4 ^ 0x49F2;
        JumpCircleModule.I[0x9310 ^ 0x93D4] = 0x9301 ^ 0x93D4;
        JumpCircleModule.I[0x53EC ^ 0x53A6] = 0xFFFFAC23 ^ 0x53A6;
        JumpCircleModule.I[0xFB52 ^ 0xFA51] = 0xFA65 ^ 0xFA51;
        JumpCircleModule.I[0xFDC2 ^ 0xFDEA] = 0xFDA8 ^ 0xFDEA;
        JumpCircleModule.I[0x593D ^ 0x5927] = 0x5908 ^ 0x5927;
        JumpCircleModule.I[0x58E4 ^ 0x5888] = 0x5893 ^ 0x5888;
        JumpCircleModule.I[0xB4C4 ^ 0xB593] = 0xB593 ^ 0xB593;
        JumpCircleModule.I[0x8FBF ^ 0x8F28] = 0xFFFF70AE ^ 0x8F28;
        JumpCircleModule.I[0x19FA ^ 0x19A4] = 0xFFFFE67B ^ 0x19A4;
        JumpCircleModule.I[0x10266 ^ 0x10235] = 0xFFFEFDB6 ^ 0x10235;
        JumpCircleModule.I[0x525F ^ 0x53D5] = 0x4B13 ^ 0x53D5;
        JumpCircleModule.I[0xB492 ^ 0xB420] = 0xFFFF4BA8 ^ 0xB420;
        JumpCircleModule.I[0x853A ^ 0x85B6] = 0xAB49 ^ 0x85B6;
        JumpCircleModule.I[0xA13D ^ 0xA074] = 0x76C2 ^ 0xA074;
        JumpCircleModule.I[0x4EF5 ^ 0x4EE7] = 0x44E8D ^ 0x4EE7;
        JumpCircleModule.I[0x2A71 ^ 0x2B35] = 0xF3EF ^ 0x2B35;
        JumpCircleModule.I[0xF025 ^ 0xF01D] = 0xF073 ^ 0xF01D;
        JumpCircleModule.I[0x2480 ^ 0x24C6] = 0xFFFFDB39 ^ 0x24C6;
        JumpCircleModule.I[0x6EBE ^ 0x6E3F] = 0xE3D ^ 0x6E3F;
        JumpCircleModule.I[0x347B ^ 0x3513] = 0xFFFFB418 ^ 0x3513;
        JumpCircleModule.I[0x22E5 ^ 0x23EB] = 0x238C ^ 0x23EB;
        JumpCircleModule.I[0x9AB2 ^ 0x9BBB] = 0x9B31 ^ 0x9BBB;
        JumpCircleModule.I[0xD844 ^ 0xD827] = 0xFFFF27EB ^ 0xD827;
        JumpCircleModule.I[0x83F5 ^ 0x82E7] = 0x82E6 ^ 0x82E7;
        JumpCircleModule.I[0x3315 ^ 0x3222] = 0xE6F6 ^ 0x3222;
        JumpCircleModule.I[0x41F5 ^ 0x40DB] = 0xCF4B ^ 0x40DB;
        JumpCircleModule.I[0x43EC ^ 0x439E] = 0x43D7 ^ 0x439E;
        JumpCircleModule.I[0xAE2 ^ 0xA80] = 0xAF4 ^ 0xA80;
        JumpCircleModule.I[0xA58F ^ 0xA527] = 0xA514 ^ 0xA527;
        JumpCircleModule.I[0xAB87 ^ 0xAB12] = 0xAB57 ^ 0xAB12;
        JumpCircleModule.I[0x3B6F ^ 0x3A33] = 0xFFFF0D0D ^ 0x3A33;
        JumpCircleModule.I[0xF9F8 ^ 0xF99C] = 0xFFFF0661 ^ 0xF99C;
        JumpCircleModule.I[0xA055 ^ 0xA150] = 0xA15B ^ 0xA150;
        JumpCircleModule.I[0xB462 ^ 0xB472] = 0xB45A ^ 0xB472;
        JumpCircleModule.I[0x101DA ^ 0x100BC] = 0x17E11 ^ 0x100BC;
        JumpCircleModule.I[0x64A8 ^ 0x65DE] = 0x50F7 ^ 0x65DE;
        JumpCircleModule.I[0x8592 ^ 0x84BB] = 0xA42B ^ 0x84BB;
        JumpCircleModule.I[0x10CF8 ^ 0x10DC5] = 0xFFFE8A87 ^ 0x10DC5;
        JumpCircleModule.I[0xC832 ^ 0xC81D] = 0xFFFF37C9 ^ 0xC81D;
        JumpCircleModule.I[0xB937 ^ 0xB9FC] = 0xFFFF4602 ^ 0xB9FC;
        JumpCircleModule.I[0xA20B ^ 0xA30A] = 0xFFFF5C8D ^ 0xA30A;
        JumpCircleModule.I[0x105C0 ^ 0x104B2] = 0xE47 ^ 0x104B2;
        JumpCircleModule.I[0x5968 ^ 0x5812] = 0x1C1 ^ 0x5812;
        JumpCircleModule.I[0xDDDE ^ 0xDCFE] = 0xAB01 ^ 0xDCFE;
        JumpCircleModule.I[0x5EED ^ 0x5EC4] = 0xFFFFA120 ^ 0x5EC4;
        JumpCircleModule.I[0x480F ^ 0x48E0] = 0x4885 ^ 0x48E0;
        JumpCircleModule.I[0x289E ^ 0x29F9] = 0x5741 ^ 0x29F9;
        JumpCircleModule.I[0x67E0 ^ 0x677E] = 0x6757 ^ 0x677E;
        JumpCircleModule.I[0x625D ^ 0x6342] = 0x14BE ^ 0x6342;
        JumpCircleModule.I[0x2C91 ^ 0x2CAB] = 0xFFFFD376 ^ 0x2CAB;
        JumpCircleModule.I[0x8AF3 ^ 0x8A7D] = 0xFFFF75F0 ^ 0x8A7D;
        JumpCircleModule.I[0x6E87 ^ 0x6EC4] = 0xFFFF915E ^ 0x6EC4;
        JumpCircleModule.I[0x161B ^ 0x163D] = 0xFFFFE98E ^ 0x163D;
        JumpCircleModule.I[0x9B4B ^ 0x9B41] = 0xFFFF64F5 ^ 0x9B41;
        JumpCircleModule.I[0x319A ^ 0x308F] = 0xAF68 ^ 0x308F;
        JumpCircleModule.I[0xCE6F ^ 0xCE2E] = 0xFFFF3188 ^ 0xCE2E;
        JumpCircleModule.I[0xE834 ^ 0xE974] = 0x73A2 ^ 0xE974;
        JumpCircleModule.I[0x9298 ^ 0x9389] = 0x9389 ^ 0x9389;
        JumpCircleModule.I[0x9055 ^ 0x910C] = 0x1774 ^ 0x910C;
        JumpCircleModule.I[0x10E21 ^ 0x10E2E] = 0x10E33 ^ 0x10E2E;
        JumpCircleModule.I[0xFFF2 ^ 0xFF95] = 0xFFF6 ^ 0xFF95;
        JumpCircleModule.I[0xFEF6 ^ 0xFFDE] = 0xDF4C ^ 0xFFDE;
        JumpCircleModule.I[0xF202 ^ 0xF217] = 0xFFFF0D60 ^ 0xF217;
        JumpCircleModule.I[0x608B ^ 0x60FB] = 0xFFFF9F04 ^ 0x60FB;
        JumpCircleModule.I[0x9960 ^ 0x9815] = 0x192F8 ^ 0x9815;
        JumpCircleModule.I[0x1FD7 ^ 0x1EF5] = 0x690A ^ 0x1EF5;
        JumpCircleModule.I[0x3FB5 ^ 0x3EDC] = 0x4064 ^ 0x3EDC;
        JumpCircleModule.I[0x9474 ^ 0x941E] = 0xFFFF6BA1 ^ 0x941E;
        JumpCircleModule.I[0x3FA5 ^ 0x3E83] = 0x9B3F ^ 0x3E83;
        JumpCircleModule.I[0x2C6C ^ 0x2D78] = 0x2D78 ^ 0x2D78;
        JumpCircleModule.I[0x9302 ^ 0x9327] = 0xFFFF6CCA ^ 0x9327;
        JumpCircleModule.I[0xF48C ^ 0xF5DD] = 0x95EE ^ 0xF5DD;
        JumpCircleModule.I[0x3281 ^ 0x33FD] = 0x6A17 ^ 0x33FD;
        JumpCircleModule.I[0x27F3 ^ 0x2768] = 0xFFFFD8D4 ^ 0x2768;
        JumpCircleModule.I[0xDA85 ^ 0xDBCB] = 0xDFF9 ^ 0xDBCB;
        JumpCircleModule.I[0x6A1E ^ 0x6A2C] = 0xFFFF95CA ^ 0x6A2C;
        JumpCircleModule.I[0x465B ^ 0x46B5] = 0xFFFFB984 ^ 0x46B5;
        JumpCircleModule.I[0x859 ^ 0x938] = 0xE6B2 ^ 0x938;
        JumpCircleModule.I[0xF263 ^ 0xF368] = 0xF316 ^ 0xF368;
        JumpCircleModule.I[0x1094F ^ 0x109A4] = 0xFFFEF66D ^ 0x109A4;
        JumpCircleModule.I[0xCAA8 ^ 0xCA65] = 0xCAB6 ^ 0xCA65;
        JumpCircleModule.I[0x84EF ^ 0x847E] = 0x842E ^ 0x847E;
        JumpCircleModule.I[0xC9B2 ^ 0xC982] = 0xFFFF3631 ^ 0xC982;
        JumpCircleModule.I[0x62A0 ^ 0x63E6] = 0xBB3C ^ 0x63E6;
        JumpCircleModule.I[0x85E8 ^ 0x858E] = 0x859D ^ 0x858E;
        JumpCircleModule.I[0x840F ^ 0x8487] = 0x6B14 ^ 0x8487;
        JumpCircleModule.I[0x82DA ^ 0x8232] = 0xFFFF7DC1 ^ 0x8232;
        JumpCircleModule.I[0x67D5 ^ 0x67BA] = 0xFFFF9847 ^ 0x67BA;
        JumpCircleModule.I[0xA568 ^ 0xA5AD] = 0xA5CC ^ 0xA5AD;
        JumpCircleModule.I[0x15B ^ 0x51] = 0x4A ^ 0x51;
        JumpCircleModule.I[0x223 ^ 0x215] = 0xFFFFFD77 ^ 0x215;
        JumpCircleModule.I[0x1DD ^ 0x1CB] = 0x1E7 ^ 0x1CB;
        JumpCircleModule.I[0x43CE ^ 0x42C1] = 0x42C0 ^ 0x42C1;
        JumpCircleModule.I[0x1651 ^ 0x1733] = 0x7ECB ^ 0x1733;
        JumpCircleModule.I[0xE9D4 ^ 0xE988] = 0xFFFF160A ^ 0xE988;
        JumpCircleModule.I[0xD946 ^ 0xD9E6] = 0xFFFF2655 ^ 0xD9E6;
        JumpCircleModule.I[0x72D3 ^ 0x72B6] = 0xFFFF8D7E ^ 0x72B6;
        JumpCircleModule.I[0x9DDC ^ 0x9D2C] = 0x9D42 ^ 0x9D2C;
        JumpCircleModule.I[0x2FBD ^ 0x2FE6] = 0x2F8D ^ 0x2FE6;
        JumpCircleModule.I[0xEFAE ^ 0xEFE6] = 0xEF6D ^ 0xEFE6;
        JumpCircleModule.I[0x98D6 ^ 0x981E] = 0xFFFF67B1 ^ 0x981E;
        JumpCircleModule.I[0xBC95 ^ 0xBCEB] = 0xBCEB ^ 0xBCEB;
        JumpCircleModule.I[0x5DC9 ^ 0x5D91] = 0xFFFFA22F ^ 0x5D91;
        JumpCircleModule.I[0x5AC9 ^ 0x5A54] = 0x5A5A ^ 0x5A54;
        JumpCircleModule.I[0x536F ^ 0x5201] = 0x989F ^ 0x5201;
        JumpCircleModule.I[0x958E ^ 0x94F6] = 0xFFFF5E4B ^ 0x94F6;
        JumpCircleModule.I[0xA498 ^ 0xA456] = 0xA42A ^ 0xA456;
        JumpCircleModule.I[0x961A ^ 0x96EC] = 0xFFFF693D ^ 0x96EC;
        JumpCircleModule.I[0x297E ^ 0x29F1] = 0xFFFFD61E ^ 0x29F1;
        JumpCircleModule.I[0x8F8 ^ 0x8E5] = 0x8F9 ^ 0x8E5;
        JumpCircleModule.I[0xE629 ^ 0xE65C] = 0xE60B ^ 0xE65C;
        JumpCircleModule.I[0x1E31 ^ 0x1E16] = 0xFFFFE1EC ^ 0x1E16;
        JumpCircleModule.I[0xB912 ^ 0xB931] = 0xFFFF46F6 ^ 0xB931;
        JumpCircleModule.I[0x5118 ^ 0x5115] = 0xFFFFAEB8 ^ 0x5115;
        JumpCircleModule.I[0x6BCD ^ 0x6BA6] = 0x6BD4 ^ 0x6BA6;
        JumpCircleModule.I[0xA52E ^ 0xA5D1] = 0xA5AF ^ 0xA5D1;
        JumpCircleModule.I[0xA4C1 ^ 0xA4C8] = 0xFFFF5B2B ^ 0xA4C8;
        JumpCircleModule.I[0x77FE ^ 0x77C1] = 0x77C2 ^ 0x77C1;
        JumpCircleModule.I[0xA37A ^ 0xA302] = 0xA301 ^ 0xA302;
        JumpCircleModule.I[0x6715 ^ 0x6714] = 0x671E ^ 0x6714;
        JumpCircleModule.I[0x8B1A ^ 0x8A63] = 0xBF55 ^ 0x8A63;
        JumpCircleModule.I[0x5277 ^ 0x5227] = 0x524A ^ 0x5227;
        JumpCircleModule.I[0x1EA8 ^ 0x1FDB] = 0x11536 ^ 0x1FDB;
        JumpCircleModule.I[0x21F6 ^ 0x215F] = 0x21CA ^ 0x215F;
        JumpCircleModule.I[0xD777 ^ 0xD60A] = 0x8FD2 ^ 0xD60A;
        JumpCircleModule.I[0x108C7 ^ 0x10949] = 0x11609 ^ 0x10949;
        JumpCircleModule.I[0x6422 ^ 0x644C] = 0xFFFF9BE9 ^ 0x644C;
        JumpCircleModule.I[0x7E03 ^ 0x7F4F] = 0x7B7D ^ 0x7F4F;
        JumpCircleModule.I[0xEB6A ^ 0xEBF5] = 0xFFFF1430 ^ 0xEBF5;
        JumpCircleModule.I[0xF9AD ^ 0xF956] = 0xF925 ^ 0xF956;
        JumpCircleModule.I[0xEDAB ^ 0xED3F] = 0xEDF1 ^ 0xED3F;
        JumpCircleModule.I[0x391E ^ 0x39ED] = 0x39D1 ^ 0x39ED;
        JumpCircleModule.I[0x108DC ^ 0x109EE] = 0x1E8DD ^ 0x109EE;
        JumpCircleModule.I[0xA8F8 ^ 0xA895] = 0xFFFF5728 ^ 0xA895;
        JumpCircleModule.I[0x257A ^ 0x2472] = 0x245C ^ 0x2472;
        JumpCircleModule.I[0x3C94 ^ 0x3D87] = 0x3D86 ^ 0x3D87;
        JumpCircleModule.I[0xA913 ^ 0xA94E] = 0xA93A ^ 0xA94E;
        JumpCircleModule.I[0xE526 ^ 0xE5BE] = 0xFFFF1A00 ^ 0xE5BE;
        JumpCircleModule.I[0xAD8A ^ 0xAD7D] = 0xFFFF52C7 ^ 0xAD7D;
        JumpCircleModule.I[0x4BBC ^ 0x4B20] = 0xFFFFB48B ^ 0x4B20;
        JumpCircleModule.I[0x47ED ^ 0x474F] = 0xFFFFB8AD ^ 0x474F;
        JumpCircleModule.I[0x71C2 ^ 0x70D9] = 0xF7CF ^ 0x70D9;
        JumpCircleModule.I[0xAA9D ^ 0xAA1F] = 0xE039 ^ 0xAA1F;
        JumpCircleModule.I[0x6C1F ^ 0x6C0C] = 0x6C5D ^ 0x6C0C;
        JumpCircleModule.I[0x824E ^ 0x8282] = 0xFFFF7D42 ^ 0x8282;
        JumpCircleModule.I[0x2209 ^ 0x224C] = 0x2244 ^ 0x224C;
        JumpCircleModule.I[0x9802 ^ 0x992D] = 0x7811 ^ 0x992D;
        JumpCircleModule.I[0x3D79 ^ 0x3D57] = 0xFFFFC2EE ^ 0x3D57;
        JumpCircleModule.I[0x816B ^ 0x8189] = 0xFFFF7E2B ^ 0x8189;
        JumpCircleModule.I[0x10423 ^ 0x1040E] = 0xFFFEFBA3 ^ 0x1040E;
        JumpCircleModule.I[0x8967 ^ 0x89FE] = 0x89C9 ^ 0x89FE;
        JumpCircleModule.I[0xBC15 ^ 0xBD19] = 0xBD15 ^ 0xBD19;
        JumpCircleModule.I[0x2D3B ^ 0x2D1A] = 0xFFFFD2EC ^ 0x2D1A;
        JumpCircleModule.I[0x453B ^ 0x4505] = 0x4570 ^ 0x4505;
        JumpCircleModule.I[0x719C ^ 0x7185] = 0x71E0 ^ 0x7185;
        JumpCircleModule.I[0x5C90 ^ 0x5DD2] = 0xC704 ^ 0x5DD2;
        JumpCircleModule.I[0x58DC ^ 0x58C0] = 0xFFFFA723 ^ 0x58C0;
        JumpCircleModule.I[0x7699 ^ 0x768E] = 0x76F3 ^ 0x768E;
        JumpCircleModule.I[0x2E06 ^ 0x2E57] = 0xFFFFD1EE ^ 0x2E57;
        JumpCircleModule.I[0x2DFD ^ 0x2D5C] = 0xFFFFD2C8 ^ 0x2D5C;
        JumpCircleModule.I[0xE0E8 ^ 0xE199] = 0x2B1C ^ 0xE199;
        JumpCircleModule.I[0x63B3 ^ 0x631D] = 0xFFFF9CCD ^ 0x631D;
        JumpCircleModule.I[0x1FF1 ^ 0x1F82] = 0x1FE0 ^ 0x1F82;
        JumpCircleModule.I[0xC259 ^ 0xC248] = 0xFFFF3DAD ^ 0xC248;
        JumpCircleModule.I[0xA278 ^ 0xA2B9] = 0xA2AB ^ 0xA2B9;
        JumpCircleModule.I[0x7744 ^ 0x77F5] = 0x77D8 ^ 0x77F5;
        JumpCircleModule.I[0xA549 ^ 0xA595] = 0xA506 ^ 0xA595;
        JumpCircleModule.I[0xB014 ^ 0xB025] = 0xFFFF4FC8 ^ 0xB025;
        JumpCircleModule.I[0xCDAC ^ 0xCDE0] = 0xCD9A ^ 0xCDE0;
        JumpCircleModule.I[0xB1F7 ^ 0xB0E9] = 0x37F2 ^ 0xB0E9;
        JumpCircleModule.I[0x55E2 ^ 0x548E] = 0x8A26 ^ 0x548E;
        JumpCircleModule.I[0x4DB9 ^ 0x4CE1] = 0xCAB9 ^ 0x4CE1;
        JumpCircleModule.I[0xAAF6 ^ 0xAAE2] = 0xAAD9 ^ 0xAAE2;
        JumpCircleModule.I[0xC7A4 ^ 0xC78E] = 0xFFFF3870 ^ 0xC78E;
        JumpCircleModule.I[0x321B ^ 0x3365] = 0x66CF ^ 0x3365;
        JumpCircleModule.I[0xD9EC ^ 0xD940] = 0xD90D ^ 0xD940;
        JumpCircleModule.I[0xBFA4 ^ 0xBFFB] = 0xFFFF4070 ^ 0xBFFB;
        JumpCircleModule.I[0xFAE6 ^ 0xFA1F] = 0xFA51 ^ 0xFA1F;
        JumpCircleModule.I[0xC5DC ^ 0xC4DE] = 0xC4A4 ^ 0xC4DE;
        JumpCircleModule.I[0x3C65 ^ 0x3D26] = 0xE5F2 ^ 0x3D26;
        JumpCircleModule.I[0x1DF4 ^ 0x1DFA] = 0x1D9F ^ 0x1DFA;
        JumpCircleModule.I[0xF171 ^ 0xF1E3] = 0xFFFF0E7A ^ 0xF1E3;
        JumpCircleModule.I[0x5D7C ^ 0x5C59] = 0xF996 ^ 0x5C59;
        JumpCircleModule.I[0x67E9 ^ 0x6780] = 0x67A5 ^ 0x6780;
        JumpCircleModule.I[0xF296 ^ 0xF3BC] = 0xD32E ^ 0xF3BC;
        JumpCircleModule.I[0x1DC3 ^ 0x1C40] = 0x8EC2 ^ 0x1C40;
        JumpCircleModule.I[0x5939 ^ 0x59E3] = 0x5983 ^ 0x59E3;
        JumpCircleModule.I[0x948B ^ 0x942C] = 0x942D ^ 0x942C;
        JumpCircleModule.I[0x86D5 ^ 0x861A] = 0xFFFF79AA ^ 0x861A;
        JumpCircleModule.I[0x3651 ^ 0x371B] = 0xE1F1 ^ 0x371B;
        JumpCircleModule.I[0xF3B3 ^ 0xF2AF] = 0x75B4 ^ 0xF2AF;
        JumpCircleModule.I[0x9595 ^ 0x95C2] = 0xFFFF6AB3 ^ 0x95C2;
        JumpCircleModule.I[0x1605 ^ 0x16F1] = 0xFFFFE918 ^ 0x16F1;
        JumpCircleModule.I[0x1030F ^ 0x10283] = 0xFFFEE5BD ^ 0x10283;
        JumpCircleModule.I[0x3861 ^ 0x3978] = 0x5CD3 ^ 0x3978;
        JumpCircleModule.I[0x8599 ^ 0x84D4] = 0xFFFF7F68 ^ 0x84D4;
        JumpCircleModule.I[0x6B12 ^ 0x6BD1] = 0xFFFF9413 ^ 0x6BD1;
        JumpCircleModule.I[0x99FA ^ 0x98EA] = 0x98E8 ^ 0x98EA;
        JumpCircleModule.I[0xD951 ^ 0xD9D8] = 0xD443 ^ 0xD9D8;
        JumpCircleModule.I[0x18F4 ^ 0x1857] = 0x187B ^ 0x1857;
        JumpCircleModule.I[0xD030 ^ 0xD17B] = 0xD543 ^ 0xD17B;
        JumpCircleModule.I[0x387F ^ 0x388D] = 0xFFFFC758 ^ 0x388D;
        JumpCircleModule.I[0xDA5F ^ 0xDA24] = 0xDA24 ^ 0xDA24;
        JumpCircleModule.I[0x5871 ^ 0x589C] = 0x58CA ^ 0x589C;
        JumpCircleModule.I[0x1248 ^ 0x12EE] = 0x12BC ^ 0x12EE;
        JumpCircleModule.I[0x3BF ^ 0x3A7] = 0xFFFFFC0D ^ 0x3A7;
        JumpCircleModule.I[0x76AD ^ 0x762D] = 0x708C ^ 0x762D;
        JumpCircleModule.I[0xA998 ^ 0xA8F2] = 0x766B ^ 0xA8F2;
        JumpCircleModule.I[0xF7BB ^ 0xF7C7] = 0xF7C5 ^ 0xF7C7;
        JumpCircleModule.I[0x1EFB ^ 0x1EC2] = 0x1E94 ^ 0x1EC2;
        JumpCircleModule.I[0x7AA9 ^ 0x7AAC] = 0x7AF4 ^ 0x7AAC;
        JumpCircleModule.I[0x7E72 ^ 0x7F4E] = 0x79C ^ 0x7F4E;
        JumpCircleModule.I[0xCDB9 ^ 0xCDD1] = 0xCDBE ^ 0xCDD1;
        JumpCircleModule.I[0x1003B ^ 0x1000F] = 0xFFFEFFAB ^ 0x1000F;
        JumpCircleModule.I[0x2A1C ^ 0x2B04] = 0x4EA6 ^ 0x2B04;
        JumpCircleModule.I[0x61E5 ^ 0x60D0] = 0x3EAD ^ 0x60D0;
        JumpCircleModule.I[0xB306 ^ 0xB35F] = 0xFFFF4CCC ^ 0xB35F;
        JumpCircleModule.I[0x5DA1 ^ 0x5CD1] = 0xFFFF69B9 ^ 0x5CD1;
        JumpCircleModule.I[0xCFD4 ^ 0xCF64] = 0xCF58 ^ 0xCF64;
        JumpCircleModule.I[0x75B1 ^ 0x750F] = 0x7564 ^ 0x750F;
        JumpCircleModule.I[0x4072 ^ 0x409E] = 0x40FD ^ 0x409E;
        JumpCircleModule.I[0x5BA6 ^ 0x5B5B] = 0xFFFFA47B ^ 0x5B5B;
        JumpCircleModule.I[0xA1FB ^ 0xA1B6] = 0xFFFF5E45 ^ 0xA1B6;
        JumpCircleModule.I[0x1607 ^ 0x168A] = 0x168A ^ 0x168A;
        JumpCircleModule.I[0xBC8B ^ 0xBD8D] = 0xFFFF4245 ^ 0xBD8D;
        JumpCircleModule.I[0x7485 ^ 0x75DA] = 0x9A50 ^ 0x75DA;
        JumpCircleModule.I[0xD648 ^ 0xD6AC] = 0xFFFF2902 ^ 0xD6AC;
        JumpCircleModule.I[0xA562 ^ 0xA465] = 0xFFFF5BE8 ^ 0xA465;
        JumpCircleModule.I[0xC971 ^ 0xC9C6] = 0xFFFF3675 ^ 0xC9C6;
        JumpCircleModule.I[0x10B9 ^ 0x10C4] = 0x10C4 ^ 0x10C4;
        JumpCircleModule.I[0xF16 ^ 0xE4B] = 0xC6A6 ^ 0xE4B;
        JumpCircleModule.I[0x7088 ^ 0x70BB] = 0xFFFF8FDF ^ 0x70BB;
        JumpCircleModule.I[0x9B6B ^ 0x9A2E] = 0xFFFFBD40 ^ 0x9A2E;
        JumpCircleModule.I[0x6F80 ^ 0x6E80] = 0xFFFF9178 ^ 0x6E80;
        JumpCircleModule.I[0x13DE ^ 0x1399] = 0x13B0 ^ 0x1399;
        JumpCircleModule.I[0xACC2 ^ 0xAC28] = 0xAC63 ^ 0xAC28;
        JumpCircleModule.I[0x35F2 ^ 0x34CD] = 0xAE1C ^ 0x34CD;
        JumpCircleModule.I[0xA681 ^ 0xA7AD] = 0x283D ^ 0xA7AD;
        JumpCircleModule.I[0x29F6 ^ 0x2966] = 0x2924 ^ 0x2966;
        JumpCircleModule.I[0x94C0 ^ 0x9542] = 0x7D0 ^ 0x9542;
        JumpCircleModule.I[0x36F9 ^ 0x377F] = 0xECE9 ^ 0x377F;
        JumpCircleModule.I[0xFA6C ^ 0xFAE6] = 0x7F8 ^ 0xFAE6;
        JumpCircleModule.I[0x9109 ^ 0x91A6] = 0x91D7 ^ 0x91A6;
        JumpCircleModule.I[0x8C35 ^ 0x8CCD] = 0x8CB6 ^ 0x8CCD;
        JumpCircleModule.I[0x4934 ^ 0x49B1] = 0xB78 ^ 0x49B1;
        JumpCircleModule.I[0x918C ^ 0x9188] = 0xFFFF6E61 ^ 0x9188;
        JumpCircleModule.I[0x4C73 ^ 0x4D45] = 0x1303 ^ 0x4D45;
        JumpCircleModule.I[0x1399 ^ 0x137A] = 0x136A ^ 0x137A;
        JumpCircleModule.I[0xCD26 ^ 0xCC4D] = 0x12C0 ^ 0xCC4D;
        JumpCircleModule.I[0x46CA ^ 0x462C] = 0xFFFFB9F7 ^ 0x462C;
        JumpCircleModule.I[0xB2BF ^ 0xB3A9] = 0x2C5E ^ 0xB3A9;
        JumpCircleModule.I[0xBA14 ^ 0xBB53] = 0x6DB0 ^ 0xBB53;
        JumpCircleModule.I[0x4ED6 ^ 0x4EB6] = 0x4ED3 ^ 0x4EB6;
        JumpCircleModule.I[0x945A ^ 0x9500] = 0x5DFB ^ 0x9500;
        JumpCircleModule.I[0x2D38 ^ 0x2C22] = 0x4980 ^ 0x2C22;
        JumpCircleModule.I[0x6A6A ^ 0x6AB7] = 0xFFFF957D ^ 0x6AB7;
        JumpCircleModule.I[0xD18E ^ 0xD14C] = 0xFFFF2EF8 ^ 0xD14C;
        JumpCircleModule.I[0xFAC2 ^ 0xFA14] = 0xFFFF056B ^ 0xFA14;
        JumpCircleModule.I[0x98E9 ^ 0x99DA] = 0xC794 ^ 0x99DA;
        JumpCircleModule.I[0x4087 ^ 0x40D5] = 0x40C3 ^ 0x40D5;
        JumpCircleModule.I[0x6949 ^ 0x6878] = 0x8961 ^ 0x6878;
        JumpCircleModule.I[0x2796 ^ 0x26C5] = 0x12FDC ^ 0x26C5;
        JumpCircleModule.I[0x5E5D ^ 0x5E84] = 0xFFFFA148 ^ 0x5E84;
        JumpCircleModule.I[0x4A6A ^ 0x4A48] = 0x4A59 ^ 0x4A48;
        JumpCircleModule.I[0x2C1C ^ 0x2D79] = 0x4487 ^ 0x2D79;
        JumpCircleModule.I[0x2E49 ^ 0x2E9E] = 0xFFFFD164 ^ 0x2E9E;
        JumpCircleModule.I[0x765C ^ 0x76F9] = 0xFFFF8923 ^ 0x76F9;
        JumpCircleModule.I[0x145E ^ 0x140A] = 0x1403 ^ 0x140A;
        JumpCircleModule.I[0xE5D0 ^ 0xE530] = 0xE55A ^ 0xE530;
        JumpCircleModule.I[0xB31B ^ 0xB253] = 0x64B9 ^ 0xB253;
        JumpCircleModule.I[0x5FA1 ^ 0x5EF1] = 0x3EDD ^ 0x5EF1;
        JumpCircleModule.I[0xE364 ^ 0xE32A] = 0xFFFF1CC2 ^ 0xE32A;
        JumpCircleModule.I[0xB475 ^ 0xB42F] = 0xB41C ^ 0xB42F;
        JumpCircleModule.I[0x2302 ^ 0x23A9] = 0xFFFFDC6A ^ 0x23A9;
        JumpCircleModule.I[0x670D ^ 0x67D6] = 0xFFFF9876 ^ 0x67D6;
        JumpCircleModule.I[0x4035 ^ 0x4063] = 0x4069 ^ 0x4063;
        JumpCircleModule.I[0xCB7 ^ 0xDBA] = 0xDD9 ^ 0xDBA;
        JumpCircleModule.I[0xF25A ^ 0xF2DC] = 0xAE16 ^ 0xF2DC;
        JumpCircleModule.I[0x455A ^ 0x455A] = 0x457C ^ 0x455A;
        JumpCircleModule.I[0x4D39 ^ 0x4D82] = 0x4DD8 ^ 0x4D82;
        JumpCircleModule.I[0xA7BD ^ 0xA76C] = 0xFFFF58A2 ^ 0xA76C;
        JumpCircleModule.I[0x5F77 ^ 0x5FB7] = 0x5F99 ^ 0x5FB7;
        JumpCircleModule.I[0xEF3 ^ 0xEB1] = 0xFFFFF175 ^ 0xEB1;
        JumpCircleModule.I[0xCFD1 ^ 0xCFA7] = 0xCFE4 ^ 0xCFA7;
        JumpCircleModule.I[0x10148 ^ 0x10107] = 0x10132 ^ 0x10107;
        JumpCircleModule.I[0xD4E0 ^ 0xD433] = 0xD572 ^ 0xD433;
        JumpCircleModule.I[0x4210 ^ 0x4391] = 0x1629 ^ 0x4391;
        JumpCircleModule.I[0x2D33 ^ 0x2D52] = 0x2D42 ^ 0x2D52;
        JumpCircleModule.I[0x9906 ^ 0x999C] = 0x99AB ^ 0x999C;
        JumpCircleModule.I[0x29C3 ^ 0x28FA] = 0xFC18 ^ 0x28FA;
        JumpCircleModule.I[0x5A59 ^ 0x5ADA] = 0xF832 ^ 0x5ADA;
        JumpCircleModule.I[0x6525 ^ 0x6421] = 0xFFFF9BC8 ^ 0x6421;
        JumpCircleModule.I[0x8C25 ^ 0x8C27] = 0x8C0D ^ 0x8C27;
        JumpCircleModule.I[0xADD ^ 0xA38] = 0xFFFFF5EC ^ 0xA38;
        JumpCircleModule.I[0x8C51 ^ 0x8C59] = 0xFFFF7390 ^ 0x8C59;
        JumpCircleModule.I[0x1BD4 ^ 0x1A5F] = 0x29A ^ 0x1A5F;
        JumpCircleModule.I[0x4B10 ^ 0x4B9B] = 0x8EA5 ^ 0x4B9B;
        JumpCircleModule.I[0xEDBF ^ 0xED06] = 0xED4A ^ 0xED06;
        JumpCircleModule.I[0x1B5F ^ 0x1BDB] = 0xCBB2 ^ 0x1BDB;
        JumpCircleModule.I[0x806B ^ 0x803E] = 0xFFFF7FE1 ^ 0x803E;
        JumpCircleModule.I[0xA834 ^ 0xA910] = 0xCAC ^ 0xA910;
        JumpCircleModule.I[0x8AC7 ^ 0x8A01] = 0x8A55 ^ 0x8A01;
        JumpCircleModule.I[0x10DEC ^ 0x10D3E] = 0xFFFEF2AA ^ 0x10D3E;
        JumpCircleModule.I[0x9862 ^ 0x9906] = 0xF0B2 ^ 0x9906;
        JumpCircleModule.I[0x5ACF ^ 0x5A79] = 0xFFFFA5F0 ^ 0x5A79;
        JumpCircleModule.I[0xD53A ^ 0xD468] = 0xB444 ^ 0xD468;
        JumpCircleModule.I[0x18B7 ^ 0x18CE] = 0x18CE ^ 0x18CE;
        JumpCircleModule.I[0x5EB ^ 0x5E8] = 0xFFFFFA58 ^ 0x5E8;
        JumpCircleModule.I[0x8814 ^ 0x88D3] = 0xFFFF7790 ^ 0x88D3;
        JumpCircleModule.I[0x167F ^ 0x1679] = 0xFFFFE992 ^ 0x1679;
        JumpCircleModule.I[0x2124 ^ 0x2199] = 0x21A5 ^ 0x2199;
        JumpCircleModule.I[0xA269 ^ 0xA31D] = 0x1A998 ^ 0xA31D;
        JumpCircleModule.I[0xE49A ^ 0xE473] = 0xE410 ^ 0xE473;
        JumpCircleModule.I[0x10545 ^ 0x104CA] = 0x11B80 ^ 0x104CA;
        JumpCircleModule.I[0x4690 ^ 0x463D] = 0xFFFFB9AE ^ 0x463D;
        JumpCircleModule.I[0x73B2 ^ 0x72E6] = 0x17BFD ^ 0x72E6;
        JumpCircleModule.I[0xA1B1 ^ 0xA16F] = 0xA134 ^ 0xA16F;
        JumpCircleModule.I[0x3318 ^ 0x3291] = 0xE91A ^ 0x3291;
        JumpCircleModule.I[0x7A81 ^ 0x7AB6] = 0xFFFF8579 ^ 0x7AB6;
        JumpCircleModule.I[0x6188 ^ 0x61AC] = 0xFFFF9E6C ^ 0x61AC;
        JumpCircleModule.I[0x5FBE ^ 0x5F42] = 0x5F25 ^ 0x5F42;
        JumpCircleModule.I[0xF970 ^ 0xF80B] = 0xA1D3 ^ 0xF80B;
        JumpCircleModule.I[0xB70D ^ 0xB7C4] = 0xFFFF484F ^ 0xB7C4;
        JumpCircleModule.I[0xBB5A ^ 0xBBAB] = 0xBBB0 ^ 0xBBAB;
        JumpCircleModule.I[0xBA78 ^ 0xBA44] = 0xBA3B ^ 0xBA44;
        JumpCircleModule.I[0x965E ^ 0x973E] = 0xFFFF8735 ^ 0x973E;
        JumpCircleModule.I[0x24DC ^ 0x244F] = 0xFFFFDBE6 ^ 0x244F;
        JumpCircleModule.I[0x2AFA ^ 0x2A85] = 0x2B69 ^ 0x2A85;
        JumpCircleModule.I[0x5B68 ^ 0x5BD2] = 0xFFFFA412 ^ 0x5BD2;
        JumpCircleModule.I[0x9B5F ^ 0x9B41] = 0x9A46 ^ 0x9B41;
        JumpCircleModule.I[0x6530 ^ 0x651C] = 0xFFFF9ABB ^ 0x651C;
        JumpCircleModule.I[0x9BD8 ^ 0x9B60] = 0x9B4C ^ 0x9B60;
        JumpCircleModule.I[0xCA20 ^ 0xCA1B] = 0xFFFF359C ^ 0xCA1B;
        JumpCircleModule.I[0x1DBF ^ 0x1C3A] = 0x8EB8 ^ 0x1C3A;
        JumpCircleModule.I[0x8290 ^ 0x83FD] = 0x5D70 ^ 0x83FD;
        JumpCircleModule.I[0x59DF ^ 0x588A] = 0x151E3 ^ 0x588A;
        JumpCircleModule.I[0xDE1C ^ 0xDEA3] = 0xDEFE ^ 0xDEA3;
        JumpCircleModule.I[0x5936 ^ 0x598A] = 0xFFFFA674 ^ 0x598A;
        JumpCircleModule.I[0x42E3 ^ 0x42A7] = 0x4299 ^ 0x42A7;
        JumpCircleModule.I[0xBA1D ^ 0xBA6C] = 0xBA67 ^ 0xBA6C;
        JumpCircleModule.I[0xFDB7 ^ 0xFD62] = 0xFFFF02B4 ^ 0xFD62;
        JumpCircleModule.I[0x7B ^ 0x4E] = 0xFFFFFF8F ^ 0x4E;
        JumpCircleModule.I[0x813F ^ 0x8001] = 0xF8D3 ^ 0x8001;
        JumpCircleModule.I[0x674B ^ 0x6754] = 0xFFFF988D ^ 0x6754;
        JumpCircleModule.I[0xDB29 ^ 0xDAA4] = 0xC261 ^ 0xDAA4;
        JumpCircleModule.I[0x1E39 ^ 0x1F62] = 0xD78F ^ 0x1F62;
        JumpCircleModule.I[0x7D6 ^ 0x699] = 0x66B9 ^ 0x699;
        JumpCircleModule.I[0x76AD ^ 0x7672] = 0x766E ^ 0x7672;
        JumpCircleModule.I[0xFA4F ^ 0xFA85] = 0xFFFF05B8 ^ 0xFA85;
        JumpCircleModule.I[0xDB02 ^ 0xDA25] = 0xFAB2 ^ 0xDA25;
        JumpCircleModule.I[0xC2EF ^ 0xC3D4] = 0xBB02 ^ 0xC3D4;
        JumpCircleModule.I[0x674D ^ 0x67CA] = 0x3564 ^ 0x67CA;
        JumpCircleModule.I[0xA68A ^ 0xA7A1] = 0x283A ^ 0xA7A1;
        JumpCircleModule.I[0x8F72 ^ 0x8E51] = 0x2BEC ^ 0x8E51;
        JumpCircleModule.I[0xD4E8 ^ 0xD4E3] = 0xD4CC ^ 0xD4E3;
        JumpCircleModule.I[0x12F0 ^ 0x13A6] = 0x11ABD ^ 0x13A6;
        JumpCircleModule.I[0x579F ^ 0x56E0] = 0x358 ^ 0x56E0;
        JumpCircleModule.I[0x4E53 ^ 0x4E8B] = 0xFFFFB10A ^ 0x4E8B;
        JumpCircleModule.I[0xD891 ^ 0xD88A] = 0xFFFF2775 ^ 0xD88A;
        JumpCircleModule.I[0xF5A0 ^ 0xF420] = 0xA1B8 ^ 0xF420;
        JumpCircleModule.I[0x13CB ^ 0x12A4] = 0xD821 ^ 0x12A4;
        JumpCircleModule.I[0xBCB1 ^ 0xBC44] = 0xFFFF43AE ^ 0xBC44;
        JumpCircleModule.I[0x179C ^ 0x170A] = 0x1763 ^ 0x170A;
        JumpCircleModule.I[0xC49C ^ 0xC490] = 0xC4B0 ^ 0xC490;
        JumpCircleModule.I[0xA409 ^ 0xA47E] = 0xA472 ^ 0xA47E;
        JumpCircleModule.I[0xD683 ^ 0xD684] = 0xD691 ^ 0xD684;
        JumpCircleModule.I[0xACE ^ 0xA8E] = 0xAF9 ^ 0xA8E;
        JumpCircleModule.I[0xFE3 ^ 0xF97] = 0xFAB ^ 0xF97;
        JumpCircleModule.I[0x2513 ^ 0x25C3] = 0x2566 ^ 0x25C3;
        JumpCircleModule.I[0xF85F ^ 0xF948] = 0x9CEC ^ 0xF948;
        JumpCircleModule.I[0xEC2A ^ 0xEC0A] = 0xEC15 ^ 0xEC0A;
        JumpCircleModule.I[0x2E8B ^ 0x2E6A] = 0x2E24 ^ 0x2E6A;
        JumpCircleModule.I[0xF7F6 ^ 0xF6CC] = 0x2218 ^ 0xF6CC;
        JumpCircleModule.I[0x10298 ^ 0x102D3] = 0xFFFEFD8A ^ 0x102D3;
        JumpCircleModule.I[0x395F ^ 0x39A1] = 0x39D2 ^ 0x39A1;
        JumpCircleModule.I[0xA849 ^ 0xA9CE] = 0x7245 ^ 0xA9CE;
        JumpCircleModule.I[0x19EF ^ 0x18DB] = 0x469D ^ 0x18DB;
        JumpCircleModule.I[0xEA64 ^ 0xEB45] = 0xFFFF6313 ^ 0xEB45;
        JumpCircleModule.I[0x7807 ^ 0x78E0] = 0x78E8 ^ 0x78E0;
        JumpCircleModule.I[0xD057 ^ 0xD0FD] = 0xFFFF2F35 ^ 0xD0FD;
    }
}

