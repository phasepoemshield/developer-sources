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
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import kotakbaz.rain.client.extensions.a_0;
import kotakbaz.rain.client.extensions.b;
import kotakbaz.rain.event.events.AttackEvent;
import kotakbaz.rain.event.events.PlayerUpdateEvent;
import kotakbaz.rain.event.events.Render3DEvent;
import kotakbaz.rain.module.Module;
import kotakbaz.rain.module.modules.render.ClientColorModule;
import kotakbaz.rain.module.modules.render.V;
import kotakbaz.rain.module.setting.settings.BooleanSetting;
import kotakbaz.rain.module.setting.settings.ColorSetting;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jdk7.AutoCloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.random.Random;
import kotlin.ranges.RangesKt;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.render.RainRenderLayers;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.util.BufferAllocator;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.RotationAxis;
import net.minecraft.util.math.Vec3d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joml.Quaternionf;
import org.joml.Quaternionfc;
import sweetie.evaware.flora.api.Commando;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001?B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0006\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007\u00a2\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u000bH\u0007\u00a2\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u000eH\u0007\u00a2\u0006\u0004\b\u000f\u0010\u0010JG\u0010\u001b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0017H\u0002\u00a2\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001dH\u0002\u00a2\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001dH\u0002\u00a2\u0006\u0004\b!\u0010 J\u0017\u0010#\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020\u0017H\u0002\u00a2\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020\u0017H\u0002\u00a2\u0006\u0004\b%\u0010$J\u001f\u0010(\u001a\u00020\u00172\u0006\u0010&\u001a\u00020\u00172\u0006\u0010'\u001a\u00020\u0017H\u0002\u00a2\u0006\u0004\b(\u0010)J\u000f\u0010+\u001a\u00020*H\u0002\u00a2\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b-\u0010\u0003R\u001c\u00100\u001a\n /*\u0004\u0018\u00010.0.8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b0\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b3\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b6\u00107R$\u0010:\u001a\u0012\u0012\u0004\u0012\u00020\u001308j\b\u0012\u0004\u0012\u00020\u0013`98\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010=\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b=\u0010>\u00a8\u0006@"}, d2={"Lkotakbaz/rain/module/modules/render/HitBubblesModule;", "Lkotakbaz/rain/module/Module;", "<init>", "()V", "", "onEnable", "onDisable", "Lkotakbaz/rain/event/events/AttackEvent;", "event", "onAttack", "(Lkotakbaz/rain/event/events/AttackEvent;)V", "Lkotakbaz/rain/event/events/PlayerUpdateEvent;", "onUpdate", "(Lkotakbaz/rain/event/events/PlayerUpdateEvent;)V", "Lkotakbaz/rain/event/events/Render3DEvent;", "onRender3D", "(Lkotakbaz/rain/event/events/Render3DEvent;)V", "Lnet/minecraft/class_4588;", "buffer", "Lkotakbaz/rain/module/modules/render/HitBubblesModule$Particle;", "particle", "Lnet/minecraft/class_243;", "cameraPos", "", "scale", "alphaProgress", "rotationProgress", "renderParticle", "(Lkotakbaz/rain/event/events/Render3DEvent;Lnet/minecraft/class_4588;Lkotakbaz/rain/module/modules/render/HitBubblesModule$Particle;Lnet/minecraft/class_243;FFF)V", "", "age", "computeAlpha", "(J)F", "computeRotationProgress", "value", "expoOut", "(F)F", "expoIn", "min", "max", "randomRange", "(FF)F", "Ljava/awt/Color;", "selectedColor", "()Ljava/awt/Color;", "clearState", "Lnet/minecraft/class_2960;", "kotlin.jvm.PlatformType", "bubbleTexture", "Lnet/minecraft/class_2960;", "Lkotakbaz/rain/module/setting/settings/BooleanSetting;", "useClientColor", "Lkotakbaz/rain/module/setting/settings/BooleanSetting;", "Lkotakbaz/rain/module/setting/settings/ColorSetting;", "bubbleColor", "Lkotakbaz/rain/module/setting/settings/ColorSetting;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "particles", "Ljava/util/ArrayList;", "Lnet/minecraft/class_638;", "trackedWorld", "Lnet/minecraft/class_638;", "Particle", "rain-visuals"})
@SourceDebugExtension(value={"SMAP\nHitBubblesModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HitBubblesModule.kt\nkotakbaz/rain/module/modules/render/HitBubblesModule\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,226:1\n1915#2,2:227\n*S KotlinDebug\n*F\n+ 1 HitBubblesModule.kt\nkotakbaz/rain/module/modules/render/HitBubblesModule\n*L\n111#1:227,2\n*E\n"})
public final class HitBubblesModule
extends Module {
    @NotNull
    public static final HitBubblesModule INSTANCE;
    private static final Identifier a;
    @NotNull
    private static final BooleanSetting A;
    @NotNull
    private static final ColorSetting b;
    @NotNull
    private static final ArrayList<V> B;
    @Nullable
    private static ClientWorld c;
    private static Object[] C;
    private static Object D;
    private static Object[] e;
    private static Object[] d;
    private static Object[] E;
    public static int[] f;

    private HitBubblesModule() {
        int n2 = f[0];
        n2 += f[1];
        int n3 = f[3];
        n3 -= f[4];
        int n4 = f[6];
        n4 ^= f[7];
        super((String)C[n2 += f[2]], a_0.getRENDER(), (String)C[n3 += f[5]] + (String)C[n4 ^= f[8]]);
    }

    @Override
    public void onEnable() {
        this.clearState();
    }

    @Override
    public void onDisable() {
        this.clearState();
    }

    @Commando
    public final void onAttack(@NotNull AttackEvent event) {
        int n2 = f[9];
        n2 += f[10];
        Intrinsics.checkNotNullParameter(event, (String)C[n2 ^= f[11]]);
        if (!this.isEnabled()) {
            return;
        }
        ClientPlayerEntity clientPlayerEntity = kotakbaz.rain.client.extensions.b.getMc().player;
        if (clientPlayerEntity == null) {
            return;
        }
        ClientPlayerEntity clientPlayerEntity2 = clientPlayerEntity;
        Entity entity = event.getEntity();
        LivingEntity livingEntity = entity instanceof LivingEntity ? (LivingEntity)entity : null;
        if (livingEntity == null) {
            return;
        }
        LivingEntity livingEntity2 = livingEntity;
        if (Intrinsics.areEqual(livingEntity2, clientPlayerEntity2)) {
            return;
        }
        Vec3d vec3d = clientPlayerEntity2.getPos().subtract(livingEntity2.getPos());
        entity = vec3d.lengthSquared() > Double.longBitsToDouble(0xDE704D88240ECA01L ^ 0xE0C08B7F84BB278CL) ? vec3d.normalize() : new Vec3d(0.0, 0.0, 1.0);
        Vec3d vec3d2 = livingEntity2.getPos().add(0.0, (double)livingEntity2.getHeight() / Double.longBitsToDouble(0x42F201D9C6D0A76EL ^ 0x7D0ACD150A1C6BA3L), 0.0).add(entity.multiply((double)livingEntity2.getWidth() / Double.longBitsToDouble(0x4572DD52A8AECFCAL ^ 0x572DD52A8AECFCAL) + Double.longBitsToDouble(0xE2785ACD2E19392DL ^ 0xDDB1C354B780A0B7L)));
        long l2 = System.currentTimeMillis();
        Intrinsics.checkNotNull(vec3d2);
        B.add(new V(l2, vec3d2, new Quaternionf((Quaternionfc)kotakbaz.rain.client.extensions.b.getMc().gameRenderer.getCamera().getRotation()), Random.Default.nextFloat() * 20.0f - this.randomRange(-25.0f, 30.0f), Random.Default.nextFloat() * 20.0f - 10.0f, Random.Default.nextBoolean() ? 1.0f : -1.0f));
    }

    @Commando
    public final void onUpdate(@NotNull PlayerUpdateEvent event) {
        long l2 = 3939383177556409945L;
        int n2 = f[12];
        n2 += f[13];
        Intrinsics.checkNotNullParameter(event, (String)C[n2 += f[14]]);
        if (!this.isEnabled()) {
            return;
        }
        ClientWorld clientWorld = kotakbaz.rain.client.extensions.b.getMc().world;
        if (clientWorld == null) {
            HitBubblesModule hitBubblesModule = this;
            long l3 = l2;
            int n3 = f[15];
            n3 -= f[16];
            l2 = l3 ^ (0L ^ l3) & -1L << (n3 += f[17]);
            hitBubblesModule.clearState();
            return;
        }
        ClientWorld clientWorld2 = clientWorld;
        if (c != clientWorld2) {
            this.clearState();
            c = clientWorld2;
        }
        ClientPlayerEntity clientPlayerEntity = kotakbaz.rain.client.extensions.b.getMc().player;
        if (clientPlayerEntity == null) {
            return;
        }
        ClientPlayerEntity clientPlayerEntity2 = clientPlayerEntity;
        long l4 = System.currentTimeMillis();
        B.removeIf(arg_0 -> HitBubblesModule.onUpdate$lambda$2(arg_0 -> HitBubblesModule.onUpdate$lambda$1(l4, clientPlayerEntity2, arg_0), arg_0));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Commando
    public final void onRender3D(@NotNull Render3DEvent event) {
        long l2 = 2067363699228121309L;
        long l3 = 3499047506569425180L;
        int n2 = f[18];
        n2 += f[19];
        Intrinsics.checkNotNullParameter(event, (String)C[n2 += f[20]]);
        if (!this.isEnabled()) {
            return;
        }
        if (B.isEmpty()) {
            return;
        }
        Vec3d vec3d = kotakbaz.rain.client.extensions.b.getMc().gameRenderer.getCamera().getPos();
        int n3 = f[21];
        n3 += f[22];
        AutoCloseable autoCloseable = (AutoCloseable)new BufferAllocator(n3 -= f[23]);
        Throwable throwable = null;
        try {
            Object object = (BufferAllocator)autoCloseable;
            long l4 = l2;
            int n4 = f[24];
            n4 += f[25];
            l2 = l4 ^ (0L ^ l4) & -1L << (n4 ^= f[26]);
            VertexConsumerProvider.Immediate immediate = VertexConsumerProvider.immediate((BufferAllocator)object);
            RenderLayer renderLayer = RainRenderLayers.getTrailSprite((Identifier)a);
            VertexConsumer vertexConsumer = immediate.getBuffer(renderLayer);
            long l5 = System.currentTimeMillis();
            Iterable iterable = B;
            long l6 = l2;
            int n5 = f[27];
            n5 += f[28];
            l2 = l6 ^ (0L ^ l6) & -1L >>> (n5 ^= f[29]);
            for (Object t2 : iterable) {
                V v = (V)t2;
                long l7 = l3;
                int n6 = f[30];
                n6 ^= f[31];
                l3 = l7 ^ (0L ^ l7) & -1L << (n6 ^= f[32]);
                long l8 = l5 - v.getCreatedAt();
                float f2 = INSTANCE.computeAlpha(l8);
                if (f2 <= 0.0f) continue;
                float f3 = f2;
                float f4 = INSTANCE.computeRotationProgress(l8);
                Intrinsics.checkNotNull(vertexConsumer);
                Intrinsics.checkNotNull(vec3d);
                INSTANCE.renderParticle(event, vertexConsumer, v, vec3d, f3, f2, f4);
            }
            immediate.draw(renderLayer);
            object = Unit.INSTANCE;
        }
        catch (Throwable throwable2) {
            throwable = throwable2;
            throw throwable2;
        }
        finally {
            AutoCloseableKt.closeFinally(autoCloseable, throwable);
        }
    }

    private final void renderParticle(Render3DEvent event, VertexConsumer buffer, V particle, Vec3d cameraPos, float scale, float alphaProgress, float rotationProgress) {
        long l2 = -5401750386724044448L;
        long l3 = 5829457955162704367L;
        long l4 = -7843203381063329398L;
        long l5 = -8252984741015131141L;
        Color color = this.selectedColor();
        int n2 = f[33];
        n2 -= f[34];
        int n3 = f[36];
        n3 += f[37];
        Color color2 = new Color(color.getRed(), color.getGreen(), color.getBlue(), RangesKt.coerceIn((int)(alphaProgress * 255.0f), n2 -= f[35], n3 += f[38]));
        float f2 = scale / 1.5f;
        event.getMatrices().push();
        event.getMatrices().translate(particle.getPosition().x - cameraPos.x, particle.getPosition().y - cameraPos.y, particle.getPosition().z - cameraPos.z);
        event.getMatrices().multiply((Quaternionfc)particle.getSpawnRotation());
        event.getMatrices().multiply((Quaternionfc)RotationAxis.POSITIVE_X.rotationDegrees(particle.getRotX() * rotationProgress));
        event.getMatrices().multiply((Quaternionfc)RotationAxis.POSITIVE_Y.rotationDegrees(particle.getRotY() * rotationProgress));
        event.getMatrices().multiply((Quaternionfc)RotationAxis.POSITIVE_Z.rotationDegrees(rotationProgress * 360.0f * particle.getRotZDir()));
        MatrixStack.Entry entry = event.getMatrices().peek();
        long l6 = l3;
        int n4 = f[39];
        n4 -= f[40];
        l3 = l6 ^ (2L ^ l6) & -1L >>> (n4 -= f[41]);
        long l7 = l5;
        int n5 = f[42];
        n5 += f[43];
        l5 = l7 ^ (0L ^ l7) & -1L >>> (n5 ^= f[44]);
        while ((int)l5 < (int)l3) {
            long l8 = l4;
            int n6 = f[45];
            n6 -= f[46];
            l4 = l8 ^ ((long)((int)l5) ^ l8) & -1L >>> (n6 -= f[47]);
            long l9 = l5;
            int n7 = f[48];
            n7 -= f[49];
            l5 = l9 ^ (0L ^ l9) & -1L << (n7 += f[50]);
            buffer.vertex(entry, -f2, f2, 0.0f).color(color2.getRed(), color2.getGreen(), color2.getBlue(), color2.getAlpha()).texture(0.0f, 0.0f);
            buffer.vertex(entry, f2, f2, 0.0f).color(color2.getRed(), color2.getGreen(), color2.getBlue(), color2.getAlpha()).texture(1.0f, 0.0f);
            buffer.vertex(entry, f2, -f2, 0.0f).color(color2.getRed(), color2.getGreen(), color2.getBlue(), color2.getAlpha()).texture(1.0f, 1.0f);
            buffer.vertex(entry, -f2, -f2, 0.0f).color(color2.getRed(), color2.getGreen(), color2.getBlue(), color2.getAlpha()).texture(0.0f, 1.0f);
            long l10 = l5;
            int n8 = f[51];
            n8 ^= f[52];
            int n9 = f[54];
            n9 -= f[55];
            l5 = l10 ^ (l10 ^ l10 + (long)(n8 ^= f[53])) & -1L >>> (n9 ^= f[56]);
        }
        event.getMatrices().pop();
    }

    private final float computeAlpha(long age) {
        return age <= 1000L ? this.expoOut(RangesKt.coerceIn((float)age / 1000.0f, 0.0f, 1.0f)) : (age <= 1600L ? 1.0f - this.expoIn(RangesKt.coerceIn((float)(age - 1000L) / 600.0f, 0.0f, 1.0f)) : 0.0f);
    }

    private final float computeRotationProgress(long age) {
        return this.expoOut(RangesKt.coerceIn((float)age / 5000.0f, 0.0f, 1.0f)) * 2.0f;
    }

    private final float expoOut(float value2) {
        return value2 >= 1.0f ? 1.0f : 1.0f - (float)Math.pow(2.0f, -10.0f * value2);
    }

    private final float expoIn(float value2) {
        return value2 <= 0.0f ? 0.0f : (float)Math.pow(2.0f, 10.0f * value2 - 10.0f);
    }

    private final float randomRange(float min, float max) {
        return min + Random.Default.nextFloat() * (max - min);
    }

    private final Color selectedColor() {
        return (Boolean)A.getValue() != false && ClientColorModule.INSTANCE.isEnabled() ? ClientColorModule.INSTANCE.getClientColor() : (Color)b.getValue();
    }

    private final void clearState() {
        B.clear();
        c = kotakbaz.rain.client.extensions.b.getMc().world;
    }

    private static final boolean useClientColor$lambda$0() {
        return ClientColorModule.INSTANCE.isEnabled();
    }

    private static final boolean bubbleColor$lambda$0() {
        int n2;
        if (!((Boolean)A.getValue()).booleanValue() || !ClientColorModule.INSTANCE.isEnabled()) {
            int n3 = f[57];
            n3 += f[58];
            n2 = n3 -= f[59];
        } else {
            int n4 = f[60];
            n4 ^= f[61];
            n2 = n4 += f[62];
        }
        return n2 != 0;
    }

    private static final boolean onUpdate$lambda$1(long $now, ClientPlayerEntity $player, V particle) {
        int n2;
        int n3 = f[63];
        n3 ^= f[64];
        Intrinsics.checkNotNullParameter(particle, (String)C[n3 -= f[65]]);
        if ($now - particle.getCreatedAt() > 3500L || $player.getPos().distanceTo(particle.getPosition()) > Double.longBitsToDouble(0xEE7BEE463FB67BD8L ^ 0xAE22EE463FB67BD8L)) {
            int n4 = f[66];
            n4 -= f[67];
            n2 = n4 += f[68];
        } else {
            int n5 = f[69];
            n5 ^= f[70];
            n2 = n5 -= f[71];
        }
        return n2 != 0;
    }

    private static final boolean onUpdate$lambda$2(Function1 $tmp0, Object p0) {
        return (Boolean)$tmp0.invoke(p0);
    }

    static {
        HitBubblesModule.b();
        long l2 = 5681664655177853257L;
        long l3 = -2055079519025305784L;
        long l4 = 8150934704889026717L;
        long l5 = -6853245217827070094L;
        long l6 = -8075612540565416086L;
        long l7 = -1283835767603238501L;
        long l8 = -7995764282270650736L;
        long l9 = -1306275072820750941L;
        long l10 = -7817953219182768584L;
        long l11 = 5131386045225817750L;
        long l12 = 5054040197100612976L;
        long l13 = -3903121663006982554L;
        long l14 = -492878737677447430L;
        long l15 = 332809045672739033L;
        int n2 = f[72];
        n2 -= f[73];
        C = new Object[n2 += f[74]];
        long l16 = l15;
        int n3 = f[75];
        n3 += f[76];
        l15 = l16 ^ (0L ^ l16) & -1L << (n3 += f[77]);
        Object[] objectArray = new Object[f[78]];
        objectArray[HitBubblesModule.f[79]] = d;
        objectArray[HitBubblesModule.f[80]] = f[81];
        int n4 = f[82];
        Object object = HitBubblesModule.A()[f[83]];
        if (object == null) {
            char[] cArray = "\u6d2d\u6d92\u6d2e\u6dbf\u6d8d\u6d2a\u6dcc\u6dd1\u6c38\u6dd5\u6dc8\u6def\u6dfa\u6dc3\u6dc0\u6dd1\u6dca\u6dc1\u6dcc\u6dcb\u6d25\u6dc1\u6df7\u6c73\u6d34\u6dc8\u6dcb\u6dc8\u6dc3\u6d32\u6d97\u6dc5\u6dcd\u6c71\u6dce\u6d2d\u6dbf\u6d97\u6d8f\u6dbf\u6dc5\u6dc1\u6dd4\u6d98\u6dc6\u6d2a\u6d28\u6c71\u6d33\u6d20\u6d9a\u6d9a\u6d20\u6d34\u6d31\u6def\u6d2d\u6d8f\u6d1e\u6d34\u6def\u6d8d\u6dfc\u6d26\u6c6e\u6dd5\u6d20\u6dfa\u6dd5\u6d28\u6d2e\u6d34\u6d9a\u6def\u6d34\u6dc0\u6d21\u6d29\u6dc6\u6d1f\u6d2c\u6d8d\u6c75\u6d28\u6d2e\u6dc6\u6d34\u6c3a\u6dd3\u6d97\u6def\u6d32\u6d9c\u6d2e\u6c3c\u6dc5\u6df7\u6d21\u6df7\u6c3c\u6dc3\u6d2d\u6dfc\u6dd0\u6d21\u6d89\u6d8d\u6d89\u6d29\u6dbe\u6dcc\u6d32\u6d89\u6d9c\u6d26\u6dc6\u6d20\u6d25\u6d9c\u6d34\u6c75\u6d25\u6d9a\u6dd0\u6dd3\u6d2a\u6dfc\u6d28\u6d34\u6dc9\u6dc3\u6c38\u6d2e\u6d28\u6d2d\u6d97\u6d31\u6c71\u6d30\u6d27\u6dc1\u6d2d\u6dc5\u6c6e\u6d21\u6dc5\u6d21\u6d31\u6d8f\u6d1e\u6d26\u6d2d\u6dcc\u6d20\u6d98\u6d92\u6d98\u6dd3\u6dd2\u6dcd\u6d9c\u6d9a\u6d30\u6d20\u6dca\u6c73\u6dc1\u6d20\u6d21\u6dc5\u6d97\u6dca\u6d30\u6d2b\u6d32\u6d27\u6dc8\u6d98\u6d23\u6d30\u6d30\u6d27\u6dfa\u6dd1\u6c71\u6dc6\u6dce\u6d97\u6c73\u6c38\u6dc1\u6d21\u6d35\u6c38\u6d92\u6dc7\u6d8f\u6c3a\u6d25\u6dcb\u6dca\u6c73\u6dcb\u6d31\u6c2f\u6c6e\u6df7\u6d23\u6d31\u6c70\u6dce\u6d34\u6df7\u6d87\u6d21\u6c3c\u6d98\u6dc8\u6d2b\u6d2e\u6d2c\u6d2b\u6dc1\u6dc7\u6dcb\u6d1f\u6dbe\u6d34\u6dd4\u6d20\u6dc0\u6dc9\u6c3c\u6d28\u6c38\u6d29\u6d87\u6d2a\u6d33\u6d32\u6dc1\u6d35\u6c73\u6dcc\u6dc9\u6d89\u6c73\u6dca\u6c73\u6d23\u6d20\u6d33\u6c71\u6d2e\u6c3a\u6d2e".toCharArray();
            for (int i2 = f[84]; i2 < f[85]; ++i2) {
                int n5 = cArray[i2];
                n5 += f[86];
                n5 += f[87];
                n5 ^= f[88];
                n5 -= f[89];
                n5 ^= f[90];
                n5 ^= f[91];
                n5 -= f[92];
                n5 ^= f[93];
                n5 ^= f[94];
                cArray[i2] = (char)(n5 -= f[95]);
            }
            object = HitBubblesModule.A()[HitBubblesModule.f[96]] = new String(cArray);
        }
        objectArray[n4] = (String)object;
        char[] cArray = ((String)HitBubblesModule.a(objectArray)).toCharArray();
        long l17 = l6;
        int n6 = f[97];
        n6 ^= f[98];
        l6 = l17 ^ (0x8300000000L ^ l17) & -1L << (n6 -= f[99]);
        long l18 = l13;
        int n7 = f[100];
        n7 -= f[101];
        l13 = l18 ^ (0L ^ l18) & -1L >>> (n7 += f[102]);
        while (true) {
            int n8 = f[103];
            n8 -= f[104];
            if ((int)l13 >= (int)(l6 >>> (n8 -= f[105]))) break;
            int n9 = (int)l13;
            long l19 = l13;
            int n10 = f[106];
            n10 ^= f[107];
            int n11 = f[109];
            n11 ^= f[110];
            l13 = l19 ^ (l19 ^ l19 + (long)(n10 += f[108])) & -1L >>> (n11 += f[111]);
            long l20 = l9;
            int n12 = f[112];
            n12 -= f[113];
            l9 = l20 ^ ((long)cArray[n9] ^ l20) & -1L >>> (n12 += f[114]);
            int n13 = (int)l13;
            long l21 = l13;
            int n14 = f[115];
            n14 ^= f[116];
            int n15 = f[118];
            n15 -= f[119];
            l13 = l21 ^ (l21 ^ l21 + (long)(n14 ^= f[117])) & -1L >>> (n15 += f[120]);
            int n16 = f[121];
            n16 ^= f[122];
            long l22 = l10;
            int n17 = f[124];
            n17 += f[125];
            l10 = l22 ^ ((long)cArray[n13] << (n16 ^= f[123]) ^ l22) & -1L << (n17 += f[126]);
            int n18 = f[127];
            n18 += f[128];
            n18 += f[129];
            int n19 = f[130];
            n19 += f[131];
            long l23 = l12;
            int n20 = f[133];
            n20 -= f[134];
            l12 = l23 ^ ((long)((int)l9 << n18 | (int)(l10 >>> (n19 += f[132]))) ^ l23) & -1L >>> (n20 += f[135]);
            char[] cArray2 = new char[(int)l12];
            long l24 = l14;
            int n21 = f[136];
            n21 += f[137];
            l14 = l24 ^ (0L ^ l24) & -1L << (n21 += f[138]);
            while (true) {
                int n22 = f[139];
                n22 -= f[140];
                if ((int)(l14 >>> (n22 += f[141])) >= (int)l12) break;
                int n23 = f[142];
                n23 -= f[143];
                int n24 = f[145];
                n24 ^= f[146];
                cArray2[(int)(l14 >>> (n23 -= HitBubblesModule.f[144]))] = cArray[(int)l13 + (int)(l14 >>> (n24 += f[147]))];
                l14 += 0x100000000L;
            }
            int n25 = f[148];
            n25 ^= f[149];
            int n26 = (int)(l15 >>> (n25 += f[150]));
            l15 += 0x100000000L;
            HitBubblesModule.C[n26] = new String(cArray2);
            long l25 = l13;
            int n27 = f[151];
            n27 -= f[152];
            l13 = l25 ^ ((long)((int)l13 + (int)l12) ^ l25) & -1L >>> (n27 ^= f[153]);
        }
        INSTANCE = new HitBubblesModule();
        int n28 = f[154];
        n28 ^= f[155];
        int n29 = f[157];
        n29 += f[158];
        int n30 = f[160];
        n30 -= f[161];
        a = Identifier.of((String)((String)C[n28 -= f[156]]), (String)((String)C[n29 -= f[159]] + (String)C[n30 += f[162]]));
        int n31 = f[163];
        n31 -= f[164];
        boolean bl = f[166];
        bl -= f[167];
        A = INSTANCE.cfr_renamed_0((String)C[n31 += f[165]], bl ^= f[168]).setVisible(HitBubblesModule::useClientColor$lambda$0);
        int n32 = f[169];
        n32 += f[170];
        String string = (String)C[n32 += f[171]];
        Color color = Color.WHITE;
        int n33 = f[172];
        n33 += f[173];
        Intrinsics.checkNotNullExpressionValue(color, (String)C[n33 ^= f[174]]);
        b = INSTANCE.color(string, color).setVisible(HitBubblesModule::bubbleColor$lambda$0);
        B = new ArrayList();
    }

    public static Object a(Object[] object) {
        Object object2;
        int n2 = (Integer)object[f[175]];
        String string = (String)object[f[176]];
        object = object[f[177]];
        Object[] objectArray = e;
        if (e == null) {
            objectArray = e = new Object[f[178]];
        }
        if ((object2 = objectArray[n2]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[f[179]];
                d = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[f[181] ^ f[182]];
                byArray[HitBubblesModule.f[183] ^ HitBubblesModule.f[184]] = f[185] ^ f[186];
                byArray[HitBubblesModule.f[187] ^ HitBubblesModule.f[188]] = f[189] ^ f[190];
                byArray[HitBubblesModule.f[191] ^ HitBubblesModule.f[192]] = f[193] ^ f[194];
                byArray[HitBubblesModule.f[195] ^ HitBubblesModule.f[196]] = f[197] ^ f[198];
                byArray[HitBubblesModule.f[199] ^ HitBubblesModule.f[200]] = f[201] ^ f[202];
                byArray[HitBubblesModule.f[203] ^ HitBubblesModule.f[204]] = f[205] ^ f[206];
                byArray[HitBubblesModule.f[207] ^ HitBubblesModule.f[208]] = f[209] ^ f[210];
                byArray[HitBubblesModule.f[211] ^ HitBubblesModule.f[212]] = f[213] ^ f[214];
                byArray[HitBubblesModule.f[215] ^ HitBubblesModule.f[216]] = f[217] ^ f[218];
                byArray[HitBubblesModule.f[219] ^ HitBubblesModule.f[220]] = f[221] ^ f[222];
                byArray[HitBubblesModule.f[223] ^ HitBubblesModule.f[224]] = f[225] ^ f[226];
                byArray[HitBubblesModule.f[227] ^ HitBubblesModule.f[228]] = f[229] ^ f[230];
                byArray[HitBubblesModule.f[231] ^ HitBubblesModule.f[232]] = f[233] ^ f[234];
                byArray[HitBubblesModule.f[235] ^ HitBubblesModule.f[236]] = f[237] ^ f[238];
                byArray[HitBubblesModule.f[239] ^ HitBubblesModule.f[240]] = f[241] ^ f[242];
                byArray[HitBubblesModule.f[243] ^ HitBubblesModule.f[244]] = f[245] ^ f[246];
                objectArray2[HitBubblesModule.f[180]] = byArray;
            }
            byte[] byArray = (byte[])object3[f[247]];
            if (D == null) {
                byte[] byArray2 = new byte[f[248] ^ f[249]];
                byArray2[HitBubblesModule.f[250] ^ HitBubblesModule.f[251]] = f[252] ^ f[253];
                byArray2[HitBubblesModule.f[254] ^ HitBubblesModule.f[255]] = f[256] ^ f[257];
                byArray2[HitBubblesModule.f[258] ^ HitBubblesModule.f[259]] = f[260] ^ f[261];
                byArray2[HitBubblesModule.f[262] ^ HitBubblesModule.f[263]] = f[264] ^ f[265];
                byArray2[HitBubblesModule.f[266] ^ HitBubblesModule.f[267]] = f[268] ^ f[269];
                byArray2[HitBubblesModule.f[270] ^ HitBubblesModule.f[271]] = f[272] ^ f[273];
                byArray2[HitBubblesModule.f[274] ^ HitBubblesModule.f[275]] = f[276] ^ f[277];
                byArray2[HitBubblesModule.f[278] ^ HitBubblesModule.f[279]] = f[280] ^ f[281];
                byArray2[HitBubblesModule.f[282] ^ HitBubblesModule.f[283]] = f[284] ^ f[285];
                byArray2[HitBubblesModule.f[286] ^ HitBubblesModule.f[287]] = f[288] ^ f[289];
                byArray2[HitBubblesModule.f[290] ^ HitBubblesModule.f[291]] = f[292] ^ f[293];
                byArray2[HitBubblesModule.f[294] ^ HitBubblesModule.f[295]] = f[296] ^ f[297];
                byArray2[HitBubblesModule.f[298] ^ HitBubblesModule.f[299]] = f[300] ^ f[301];
                byArray2[HitBubblesModule.f[302] ^ HitBubblesModule.f[303]] = f[304] ^ f[305];
                byArray2[HitBubblesModule.f[306] ^ HitBubblesModule.f[307]] = f[308] ^ f[309];
                byArray2[HitBubblesModule.f[310] ^ HitBubblesModule.f[311]] = f[312] ^ f[313];
                byArray2[HitBubblesModule.f[314] ^ HitBubblesModule.f[315]] = f[316] ^ f[317];
                byArray2[HitBubblesModule.f[318] ^ HitBubblesModule.f[319]] = f[320] ^ f[321];
                byArray2[HitBubblesModule.f[322] ^ HitBubblesModule.f[323]] = f[324] ^ f[325];
                byArray2[HitBubblesModule.f[326] ^ HitBubblesModule.f[327]] = f[328] ^ f[329];
                byArray2[HitBubblesModule.f[330] ^ HitBubblesModule.f[331]] = f[332] ^ f[333];
                byArray2[HitBubblesModule.f[334] ^ HitBubblesModule.f[335]] = f[336] ^ f[337];
                byArray2[HitBubblesModule.f[338] ^ HitBubblesModule.f[339]] = f[340] ^ f[341];
                byArray2[HitBubblesModule.f[342] ^ HitBubblesModule.f[343]] = f[344] ^ f[345];
                byArray2[HitBubblesModule.f[346] ^ HitBubblesModule.f[347]] = f[348] ^ f[349];
                byArray2[HitBubblesModule.f[350] ^ HitBubblesModule.f[351]] = f[352] ^ f[353];
                byArray2[HitBubblesModule.f[354] ^ HitBubblesModule.f[355]] = f[356] ^ f[357];
                byArray2[HitBubblesModule.f[358] ^ HitBubblesModule.f[359]] = f[360] ^ f[361];
                byArray2[HitBubblesModule.f[362] ^ HitBubblesModule.f[363]] = f[364] ^ f[365];
                byArray2[HitBubblesModule.f[366] ^ HitBubblesModule.f[367]] = f[368] ^ f[369];
                byArray2[HitBubblesModule.f[370] ^ HitBubblesModule.f[371]] = f[372] ^ f[373];
                byArray2[HitBubblesModule.f[374] ^ HitBubblesModule.f[375]] = f[376] ^ f[377];
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, f[378], byArray3, f[379], byArray.length);
                System.arraycopy(byArray2, f[380], byArray3, byArray.length, byArray2.length);
                Object object4 = HitBubblesModule.A()[f[381]];
                if (object4 == null) {
                    char[] cArray = "\uffba\uffc4\uffcf\uffc6\uffc0\uff94\uffe3\uffed\uffd6\uffd2\uffb2\uffe9\uffe5\uffe7\uffb7\uffb2\uffc5\uff95".toCharArray();
                    for (int i2 = f[382]; i2 < f[383]; ++i2) {
                        int n3 = cArray[i2];
                        n3 += f[384];
                        n3 -= f[385];
                        n3 += f[386];
                        n3 ^= f[387];
                        n3 -= f[388];
                        n3 -= f[389];
                        n3 ^= f[390];
                        n3 -= f[391];
                        n3 -= f[392];
                        n3 += f[393];
                        n3 += f[394];
                        cArray[i2] = (char)(n3 += f[395]);
                    }
                    object4 = HitBubblesModule.A()[HitBubblesModule.f[396]] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[f[397]];
                byArray4[HitBubblesModule.f[398]] = f[399];
                byArray4[14] = 94;
                byArray4[9] = -84;
                byArray4[1] = -50;
                byArray4[2] = -123;
                byArray4[10] = 102;
                byArray4[13] = 69;
                byArray4[4] = -75;
                byArray4[15] = 71;
                byArray4[8] = 65;
                byArray4[6] = -29;
                byArray4[3] = -26;
                byArray4[7] = 107;
                byArray4[11] = -5;
                byArray4[12] = -4;
                byArray4[5] = -126;
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, 23, 256);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = HitBubblesModule.A()[2];
                if (object5 == null) {
                    char[] cArray = "\u9e71\u9e7d\u9e67".toCharArray();
                    for (int i3 = 0; i3 < 3; ++i3) {
                        int n4 = cArray[i3];
                        n4 += 46625;
                        n4 += 28803;
                        n4 -= 55973;
                        n4 += 22790;
                        n4 -= 23561;
                        n4 ^= 0x506F;
                        n4 -= 465;
                        n4 += 46643;
                        n4 ^= 0x67F4;
                        n4 += 9238;
                        n4 ^= 0xB3D7;
                        n4 ^= 0x13DA;
                        n4 += 29595;
                        n4 += 40285;
                        cArray[i3] = (char)(n4 += 24222);
                    }
                    object5 = HitBubblesModule.A()[2] = new String(cArray);
                }
                D = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, 0, 16);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, 16, byArray6.length);
            Object object6 = HitBubblesModule.A()[3];
            if (object6 == null) {
                char[] cArray = "\ua175\ua179\ua163\ua13f\ua173\ua170\ua173\ua13f\ua162\ua15b\ua173\ua163\ua149\ua162\ua195\ua196\ua196\ua17d\ua17c\ua197".toCharArray();
                for (int i4 = 0; i4 < 20; ++i4) {
                    int n5 = cArray[i4];
                    n5 += 36965;
                    n5 -= 60745;
                    n5 += 26794;
                    n5 ^= 0x9D8E;
                    n5 -= 12206;
                    n5 += 26257;
                    n5 += 5749;
                    n5 -= 62518;
                    n5 += 46519;
                    n5 -= 62103;
                    n5 -= 18459;
                    n5 ^= 0x76DD;
                    n5 ^= 0xCFF;
                    n5 ^= 0xB71F;
                    n5 ^= 0x701F;
                    cArray[i4] = (char)(n5 ^= 0xB9BF);
                }
                object6 = HitBubblesModule.A()[3] = new String(cArray);
            }
            Cipher cipher = Cipher.getInstance((String)object6);
            cipher.init(2, (Key)((SecretKey)D), new IvParameterSpec(byArray7));
            byte[] byArray9 = cipher.doFinal(byArray8);
            object2 = new String(byArray9, StandardCharsets.UTF_8);
        }
        return object2;
    }

    private static Object[] A() {
        Object[] objectArray = E;
        if (E == null) {
            E = new Object[4];
            objectArray = E;
        }
        return objectArray;
    }

    public static void b() {
        f = new int[0xD34B ^ 0xD2DB];
        HitBubblesModule.f[0xD6CA ^ 0xD7CA] = 0xFFFFD452 ^ 0xD7CA;
        HitBubblesModule.f[0x668C ^ 0x666E] = 0xEB3B ^ 0x666E;
        HitBubblesModule.f[0x432D ^ 0x4309] = 0x439D ^ 0x4309;
        HitBubblesModule.f[0xA2DF ^ 0xA3E2] = 0x3956 ^ 0xA3E2;
        HitBubblesModule.f[0x864A ^ 0x86CE] = 0x86DB ^ 0x86CE;
        HitBubblesModule.f[0x103C3 ^ 0x103E5] = 0x10389 ^ 0x103E5;
        HitBubblesModule.f[0x5263 ^ 0x536B] = 0xEF37 ^ 0x536B;
        HitBubblesModule.f[0x8E14 ^ 0x8F98] = 0x8F99 ^ 0x8F98;
        HitBubblesModule.f[0x8A11 ^ 0x8AC2] = 0x2EE2 ^ 0x8AC2;
        HitBubblesModule.f[0x45B2 ^ 0x45CD] = 0xFFFFBAB6 ^ 0x45CD;
        HitBubblesModule.f[0x5954 ^ 0x5959] = 0xFFFFA6B2 ^ 0x5959;
        HitBubblesModule.f[0x107C8 ^ 0x107AB] = 0xFFFEF82E ^ 0x107AB;
        HitBubblesModule.f[0xA38E ^ 0xA334] = 0xF074 ^ 0xA334;
        HitBubblesModule.f[0x7741 ^ 0x763D] = 0x763D ^ 0x763D;
        HitBubblesModule.f[0x10AF6 ^ 0x10AC7] = 0x10AA5 ^ 0x10AC7;
        HitBubblesModule.f[0x2AA0 ^ 0x2B84] = 0xC60C ^ 0x2B84;
        HitBubblesModule.f[0xF4C0 ^ 0xF44F] = 0xFFFF0BE7 ^ 0xF44F;
        HitBubblesModule.f[0x4460 ^ 0x44AF] = 0x2C00 ^ 0x44AF;
        HitBubblesModule.f[0xD706 ^ 0xD648] = 0xE3C6 ^ 0xD648;
        HitBubblesModule.f[0x43F ^ 0x4B8] = 0xFFFFFB7C ^ 0x4B8;
        HitBubblesModule.f[0xE452 ^ 0xE4A5] = 0xE4A5 ^ 0xE4A5;
        HitBubblesModule.f[0x99B9 ^ 0x98F5] = 0xFFFF46A4 ^ 0x98F5;
        HitBubblesModule.f[0x40EB ^ 0x405E] = 0x6839 ^ 0x405E;
        HitBubblesModule.f[0x7BE7 ^ 0x7B78] = 0x7B22 ^ 0x7B78;
        HitBubblesModule.f[0x1131 ^ 0x11C9] = 0xC333 ^ 0x11C9;
        HitBubblesModule.f[0x72BC ^ 0x72E3] = 0xF0ED ^ 0x72E3;
        HitBubblesModule.f[0xA89C ^ 0xA884] = 0xFFFF574F ^ 0xA884;
        HitBubblesModule.f[0x5A0A ^ 0x5A6A] = 0x5A6A ^ 0x5A6A;
        HitBubblesModule.f[0xEA22 ^ 0xEA74] = 0x35A4 ^ 0xEA74;
        HitBubblesModule.f[0x89F0 ^ 0x8999] = 0xFFFF7649 ^ 0x8999;
        HitBubblesModule.f[0x7F53 ^ 0x7F9B] = 0x17416 ^ 0x7F9B;
        HitBubblesModule.f[0x2000 ^ 0x2157] = 0xC7F8 ^ 0x2157;
        HitBubblesModule.f[0x21DE ^ 0x2128] = 0xE306 ^ 0x2128;
        HitBubblesModule.f[0xA2BC ^ 0xA27D] = 0x987E ^ 0xA27D;
        HitBubblesModule.f[0x10583 ^ 0x10535] = 0x12D42 ^ 0x10535;
        HitBubblesModule.f[0x5321 ^ 0x5356] = 0x530F ^ 0x5356;
        HitBubblesModule.f[0x7F23 ^ 0x7E0C] = 0xCA4E ^ 0x7E0C;
        HitBubblesModule.f[0xBE66 ^ 0xBE33] = 0xBF33 ^ 0xBE33;
        HitBubblesModule.f[0x3B58 ^ 0x3A37] = 0x6780 ^ 0x3A37;
        HitBubblesModule.f[0x107C1 ^ 0x10649] = 0x17423 ^ 0x10649;
        HitBubblesModule.f[0xB645 ^ 0xB736] = 0x5B0 ^ 0xB736;
        HitBubblesModule.f[0x10931 ^ 0x10928] = 0xFFFEF695 ^ 0x10928;
        HitBubblesModule.f[0x2F30 ^ 0x2FE2] = 0x4744 ^ 0x2FE2;
        HitBubblesModule.f[0x109E5 ^ 0x10990] = 0xFFFEF664 ^ 0x10990;
        HitBubblesModule.f[0x4742 ^ 0x47CA] = 0x47FF ^ 0x47CA;
        HitBubblesModule.f[0x2004 ^ 0x2061] = 0x2030 ^ 0x2061;
        HitBubblesModule.f[0x74AC ^ 0x75F5] = 0x935A ^ 0x75F5;
        HitBubblesModule.f[0x4A6B ^ 0x4B5B] = 0xFFFF008B ^ 0x4B5B;
        HitBubblesModule.f[0x4328 ^ 0x421E] = 0x16B3 ^ 0x421E;
        HitBubblesModule.f[0xED26 ^ 0xEDB2] = 0xED94 ^ 0xEDB2;
        HitBubblesModule.f[0x1707 ^ 0x179B] = 0x17F4 ^ 0x179B;
        HitBubblesModule.f[0xA500 ^ 0xA45F] = 0xEAA8 ^ 0xA45F;
        HitBubblesModule.f[0x4822 ^ 0x482A] = 0x4856 ^ 0x482A;
        HitBubblesModule.f[0xE45C ^ 0xE41F] = 0xE46C ^ 0xE41F;
        HitBubblesModule.f[0x5646 ^ 0x5717] = 0x628A ^ 0x5717;
        HitBubblesModule.f[0xCA58 ^ 0xCA92] = 0x1C11F ^ 0xCA92;
        HitBubblesModule.f[0xEB41 ^ 0xEB8C] = 0xFFFFF4B4 ^ 0xEB8C;
        HitBubblesModule.f[0x32F ^ 0x3CF] = 0x8E9A ^ 0x3CF;
        HitBubblesModule.f[0xC840 ^ 0xC95C] = 0xFFFF828E ^ 0xC95C;
        HitBubblesModule.f[0x38B9 ^ 0x382A] = 0xFFFFC799 ^ 0x382A;
        HitBubblesModule.f[0xEF96 ^ 0xEF72] = 0x70EB ^ 0xEF72;
        HitBubblesModule.f[0xE1F5 ^ 0xE0B6] = 0x99DB ^ 0xE0B6;
        HitBubblesModule.f[0x2C76 ^ 0x2C31] = 0x2C7A ^ 0x2C31;
        HitBubblesModule.f[0x6632 ^ 0x6670] = 0x665C ^ 0x6670;
        HitBubblesModule.f[0x4164 ^ 0x4030] = 0xFFFFD6A1 ^ 0x4030;
        HitBubblesModule.f[0xCEB8 ^ 0xCEE2] = 0x3A7A ^ 0xCEE2;
        HitBubblesModule.f[0xF865 ^ 0xF9E1] = 0xB724 ^ 0xF9E1;
        HitBubblesModule.f[0x8AD1 ^ 0x8AF6] = 0x8AAE ^ 0x8AF6;
        HitBubblesModule.f[0xC778 ^ 0xC612] = 0xCC7 ^ 0xC612;
        HitBubblesModule.f[0x39C9 ^ 0x38DF] = 0x9648 ^ 0x38DF;
        HitBubblesModule.f[0x156F ^ 0x158E] = 0x9881 ^ 0x158E;
        HitBubblesModule.f[0xDDE9 ^ 0xDD6B] = 0xDD15 ^ 0xDD6B;
        HitBubblesModule.f[0xD10C ^ 0xD124] = 0xD140 ^ 0xD124;
        HitBubblesModule.f[0x5F47 ^ 0x5F2D] = 0x5F7E ^ 0x5F2D;
        HitBubblesModule.f[0xCE62 ^ 0xCE41] = 0xFFFF31F2 ^ 0xCE41;
        HitBubblesModule.f[0xBCC4 ^ 0xBD9A] = 0xF37D ^ 0xBD9A;
        HitBubblesModule.f[0x5BD5 ^ 0x5AB0] = 0xC2C7 ^ 0x5AB0;
        HitBubblesModule.f[0x2B7B ^ 0x2BB9] = 0x11C5 ^ 0x2BB9;
        HitBubblesModule.f[0xB087 ^ 0xB18A] = 0xE620 ^ 0xB18A;
        HitBubblesModule.f[0xEDD1 ^ 0xED5C] = 0xFFFF129F ^ 0xED5C;
        HitBubblesModule.f[0x7278 ^ 0x73FA] = 0x23F9 ^ 0x73FA;
        HitBubblesModule.f[0xB75E ^ 0xB7CE] = 0xFFFF482C ^ 0xB7CE;
        HitBubblesModule.f[0x4D1 ^ 0x5C3] = 0xB96D ^ 0x5C3;
        HitBubblesModule.f[0x7C72 ^ 0x7D6D] = 0x281D ^ 0x7D6D;
        HitBubblesModule.f[0x12C1 ^ 0x13BF] = 0x13BF ^ 0x13BF;
        HitBubblesModule.f[0x6F34 ^ 0x6EB7] = 0xFB44 ^ 0x6EB7;
        HitBubblesModule.f[0x5C91 ^ 0x5C6E] = 0xA054 ^ 0x5C6E;
        HitBubblesModule.f[0xCB70 ^ 0xCBC0] = 0xCBC2 ^ 0xCBC0;
        HitBubblesModule.f[0x5D87 ^ 0x5D3B] = 0xC911 ^ 0x5D3B;
        HitBubblesModule.f[0xA031 ^ 0xA13A] = 0xF690 ^ 0xA13A;
        HitBubblesModule.f[0x6B8A ^ 0x6A90] = 0xDEAC ^ 0x6A90;
        HitBubblesModule.f[0xEB7E ^ 0xEB7C] = 0xFFFF14C9 ^ 0xEB7C;
        HitBubblesModule.f[0x3A0 ^ 0x397] = 0xFFFFFC59 ^ 0x397;
        HitBubblesModule.f[0xCA9C ^ 0xCBFB] = 0x7DC ^ 0xCBFB;
        HitBubblesModule.f[0x1E6A ^ 0x1E0C] = 0x1E54 ^ 0x1E0C;
        HitBubblesModule.f[0xDBE1 ^ 0xDAE5] = 0x15D3 ^ 0xDAE5;
        HitBubblesModule.f[0x230F ^ 0x2357] = 0x48F1 ^ 0x2357;
        HitBubblesModule.f[0x122F ^ 0x12D3] = 0x41D9 ^ 0x12D3;
        HitBubblesModule.f[0x4FA6 ^ 0x4F0A] = 0x4F60 ^ 0x4F0A;
        HitBubblesModule.f[0xC261 ^ 0xC303] = 0x5B72 ^ 0xC303;
        HitBubblesModule.f[0x10CF2 ^ 0x10C5B] = 0xFFFEF3A4 ^ 0x10C5B;
        HitBubblesModule.f[0x44CA ^ 0x44A4] = 0xFFFFBB6A ^ 0x44A4;
        HitBubblesModule.f[0xCB98 ^ 0xCBEA] = 0xCBC7 ^ 0xCBEA;
        HitBubblesModule.f[0x106D8 ^ 0x1078B] = 0x16EAD ^ 0x1078B;
        HitBubblesModule.f[0x9C1C ^ 0x9C8E] = 0xFFFF6377 ^ 0x9C8E;
        HitBubblesModule.f[0xBB86 ^ 0xBB22] = 0xBB00 ^ 0xBB22;
        HitBubblesModule.f[0x10F1 ^ 0x102C] = 0xFFFF2CDF ^ 0x102C;
        HitBubblesModule.f[0x7006 ^ 0x70B9] = 0x4ACB ^ 0x70B9;
        HitBubblesModule.f[0x8D15 ^ 0x8DF3] = 0x126A ^ 0x8DF3;
        HitBubblesModule.f[0x6E4C ^ 0x6E90] = 0xADF1 ^ 0x6E90;
        HitBubblesModule.f[0x8418 ^ 0x84E3] = 0xD7B9 ^ 0x84E3;
        HitBubblesModule.f[0xE22B ^ 0xE353] = 0x945D ^ 0xE353;
        HitBubblesModule.f[0xDE32 ^ 0xDE81] = 0xDE80 ^ 0xDE81;
        HitBubblesModule.f[0x1036E ^ 0x10277] = 0x1ACFB ^ 0x10277;
        HitBubblesModule.f[0xA23F ^ 0xA272] = 0xFFFF5D96 ^ 0xA272;
        HitBubblesModule.f[0x6A78 ^ 0x6A71] = 0xFFFF958E ^ 0x6A71;
        HitBubblesModule.f[0x1B4 ^ 0x147] = 0xC369 ^ 0x147;
        HitBubblesModule.f[0x7A98 ^ 0x7B9D] = 0xB4DF ^ 0x7B9D;
        HitBubblesModule.f[0x3769 ^ 0x364E] = 0x6BDC ^ 0x364E;
        HitBubblesModule.f[0x426 ^ 0x573] = 0x6C55 ^ 0x573;
        HitBubblesModule.f[0xB3AF ^ 0xB3E5] = 0xB3A0 ^ 0xB3E5;
        HitBubblesModule.f[0xF133 ^ 0xF0B2] = 0x221 ^ 0xF0B2;
        HitBubblesModule.f[0x214 ^ 0x294] = 0x2DE ^ 0x294;
        HitBubblesModule.f[0xFBD4 ^ 0xFB6F] = 0x6F4A ^ 0xFB6F;
        HitBubblesModule.f[0xF413 ^ 0xF408] = 0xFFFF0B94 ^ 0xF408;
        HitBubblesModule.f[0x879A ^ 0x875A] = 0xBD26 ^ 0x875A;
        HitBubblesModule.f[0x69F8 ^ 0x692F] = 0x2A18 ^ 0x692F;
        HitBubblesModule.f[0xA263 ^ 0xA308] = 0x69C9 ^ 0xA308;
        HitBubblesModule.f[0xE3F7 ^ 0xE346] = 0xE346 ^ 0xE346;
        HitBubblesModule.f[0xB26E ^ 0xB34E] = 0xFFFF19A7 ^ 0xB34E;
        HitBubblesModule.f[0x7825 ^ 0x782E] = 0xFFFF87C2 ^ 0x782E;
        HitBubblesModule.f[0x69ED ^ 0x69FD] = 0x69CD ^ 0x69FD;
        HitBubblesModule.f[0xC786 ^ 0xC732] = 0xC732 ^ 0xC732;
        HitBubblesModule.f[0xD792 ^ 0xD6D8] = 0xF708 ^ 0xD6D8;
        HitBubblesModule.f[0x3EF2 ^ 0x3E26] = 0x9A02 ^ 0x3E26;
        HitBubblesModule.f[0x64F9 ^ 0x64EE] = 0xFFFF9B3C ^ 0x64EE;
        HitBubblesModule.f[0x4CB6 ^ 0x4DFD] = 0x6C2C ^ 0x4DFD;
        HitBubblesModule.f[0xDC64 ^ 0xDD4C] = 0xFFFF7F41 ^ 0xDD4C;
        HitBubblesModule.f[0xB820 ^ 0xB957] = 0xCE23 ^ 0xB957;
        HitBubblesModule.f[0x4538 ^ 0x4529] = 0xFFFFBA92 ^ 0x4529;
        HitBubblesModule.f[0x8F36 ^ 0x8F4E] = 0xFFFF70DE ^ 0x8F4E;
        HitBubblesModule.f[0xFE15 ^ 0xFE90] = 0xFED9 ^ 0xFE90;
        HitBubblesModule.f[0x7BA7 ^ 0x7B1E] = 0xFFFFD7AE ^ 0x7B1E;
        HitBubblesModule.f[0x67DB ^ 0x671D] = 0x24C4 ^ 0x671D;
        HitBubblesModule.f[0x5805 ^ 0x5867] = 0x584F ^ 0x5867;
        HitBubblesModule.f[0x2574 ^ 0x25AF] = 0xE6C6 ^ 0x25AF;
        HitBubblesModule.f[0xD589 ^ 0xD48A] = 0x1BC8 ^ 0xD48A;
        HitBubblesModule.f[0xFA7C ^ 0xFA20] = 0x376B ^ 0xFA20;
        HitBubblesModule.f[0x90BA ^ 0x90F2] = 0x90CA ^ 0x90F2;
        HitBubblesModule.f[0x79DA ^ 0x7857] = 0x7847 ^ 0x7857;
        HitBubblesModule.f[0xF91F ^ 0xF95A] = 0xFFFF06FD ^ 0xF95A;
        HitBubblesModule.f[0xCC31 ^ 0xCC2D] = 0xCC1B ^ 0xCC2D;
        HitBubblesModule.f[0x34B3 ^ 0x35F2] = 0x6B77 ^ 0x35F2;
        HitBubblesModule.f[0xE9E2 ^ 0xE9CD] = 0xE9E7 ^ 0xE9CD;
        HitBubblesModule.f[0x581F ^ 0x5802] = 0xFFFFA7F0 ^ 0x5802;
        HitBubblesModule.f[0x1387 ^ 0x1329] = 0x1317 ^ 0x1329;
        HitBubblesModule.f[0x6961 ^ 0x6912] = 0x697A ^ 0x6912;
        HitBubblesModule.f[0x36C4 ^ 0x37BB] = 0x37A9 ^ 0x37BB;
        HitBubblesModule.f[0xBC54 ^ 0xBC52] = 0xFFFF43A5 ^ 0xBC52;
        HitBubblesModule.f[0xC942 ^ 0xC94E] = 0xFFFF36FB ^ 0xC94E;
        HitBubblesModule.f[0xB69D ^ 0xB66F] = 0x882B ^ 0xB66F;
        HitBubblesModule.f[0xC9D5 ^ 0xC924] = 0xF75C ^ 0xC924;
        HitBubblesModule.f[0x5783 ^ 0x57D2] = 0x57D2 ^ 0x57D2;
        HitBubblesModule.f[0x11E7 ^ 0x11ED] = 0xFFFFEE03 ^ 0x11ED;
        HitBubblesModule.f[0xE953 ^ 0xE949] = 0xFFFF16E1 ^ 0xE949;
        HitBubblesModule.f[0x7CD ^ 0x7B1] = 0xFFFFF80D ^ 0x7B1;
        HitBubblesModule.f[0xCAB4 ^ 0xCBA7] = 0x7704 ^ 0xCBA7;
        HitBubblesModule.f[0x5E7F ^ 0x5F7E] = 0xA344 ^ 0x5F7E;
        HitBubblesModule.f[0xC5EA ^ 0xC50D] = 0xC4E5 ^ 0xC50D;
        HitBubblesModule.f[0x6286 ^ 0x6221] = 0x6234 ^ 0x6221;
        HitBubblesModule.f[0xB865 ^ 0xB97B] = 0xEC03 ^ 0xB97B;
        HitBubblesModule.f[0x3DFD ^ 0x3C76] = 0x32A9 ^ 0x3C76;
        HitBubblesModule.f[0x9DB3 ^ 0x9DF3] = 0x9DE0 ^ 0x9DF3;
        HitBubblesModule.f[0xC0D ^ 0xC50] = 0xCD4C ^ 0xC50;
        HitBubblesModule.f[0x19E3 ^ 0x195B] = 0x4A1B ^ 0x195B;
        HitBubblesModule.f[0xEEF4 ^ 0xEEB5] = 0xFFFF1174 ^ 0xEEB5;
        HitBubblesModule.f[0x5C23 ^ 0x5C58] = 0x5C79 ^ 0x5C58;
        HitBubblesModule.f[0x8644 ^ 0x86A7] = 0x1935 ^ 0x86A7;
        HitBubblesModule.f[0xEEC5 ^ 0xEE3F] = 0xBD78 ^ 0xEE3F;
        HitBubblesModule.f[0x67AD ^ 0x66C3] = 0x3B68 ^ 0x66C3;
        HitBubblesModule.f[0x3D ^ 0x1B7] = 0xF759 ^ 0x1B7;
        HitBubblesModule.f[0xB931 ^ 0xB84C] = 0xB84D ^ 0xB84C;
        HitBubblesModule.f[0x4D32 ^ 0x4DAA] = 0xFFFFB201 ^ 0x4DAA;
        HitBubblesModule.f[0x3592 ^ 0x3579] = 0x59B9 ^ 0x3579;
        HitBubblesModule.f[0xE953 ^ 0xE915] = 0xFFFF16F9 ^ 0xE915;
        HitBubblesModule.f[0x4EFA ^ 0x4FE7] = 0xFBD5 ^ 0x4FE7;
        HitBubblesModule.f[0xF33A ^ 0xF3F9] = 0xB026 ^ 0xF3F9;
        HitBubblesModule.f[0x7FA3 ^ 0x7EEA] = 0x67E7 ^ 0x7EEA;
        HitBubblesModule.f[0x5B69 ^ 0x5A34] = 0xCA5E ^ 0x5A34;
        HitBubblesModule.f[0x7970 ^ 0x7995] = 0xFFFF19AD ^ 0x7995;
        HitBubblesModule.f[0xFA53 ^ 0xFAC9] = 0xFFFF0505 ^ 0xFAC9;
        HitBubblesModule.f[0xCB51 ^ 0xCB7C] = 0xCB4C ^ 0xCB7C;
        HitBubblesModule.f[0x26A7 ^ 0x27D1] = 0x50A0 ^ 0x27D1;
        HitBubblesModule.f[0xC695 ^ 0xC6AB] = 0xFFFF391A ^ 0xC6AB;
        HitBubblesModule.f[0x17E ^ 0x1A4] = 0x4292 ^ 0x1A4;
        HitBubblesModule.f[0xBE15 ^ 0xBF52] = 0xA65F ^ 0xBF52;
        HitBubblesModule.f[0x6D9C ^ 0x6D07] = 0xFFFF92B2 ^ 0x6D07;
        HitBubblesModule.f[0x47BB ^ 0x468A] = 0xF2C8 ^ 0x468A;
        HitBubblesModule.f[0x2D91 ^ 0x2DA7] = 0xFFFFD222 ^ 0x2DA7;
        HitBubblesModule.f[0x2BEC ^ 0x2B84] = 0xFFFFD40B ^ 0x2B84;
        HitBubblesModule.f[0x6DBF ^ 0x6DC9] = 0x6D20 ^ 0x6DC9;
        HitBubblesModule.f[0xAF8B ^ 0xAF28] = 0xAF11 ^ 0xAF28;
        HitBubblesModule.f[0x40A7 ^ 0x4186] = 0x14F6 ^ 0x4186;
        HitBubblesModule.f[0xD0A1 ^ 0xD1EC] = 0xF03D ^ 0xD1EC;
        HitBubblesModule.f[0xA1D9 ^ 0xA0F2] = 0x6B9D ^ 0xA0F2;
        HitBubblesModule.f[0xD84E ^ 0xD949] = 0x6514 ^ 0xD949;
        HitBubblesModule.f[0x8635 ^ 0x86F0] = 0xC538 ^ 0x86F0;
        HitBubblesModule.f[0xF072 ^ 0xF151] = 0x1CF6 ^ 0xF151;
        HitBubblesModule.f[0xFFC8 ^ 0xFE98] = 0xCB6A ^ 0xFE98;
        HitBubblesModule.f[0x353A ^ 0x34BC] = 0xB55A ^ 0x34BC;
        HitBubblesModule.f[0x6959 ^ 0x6863] = 0xF2D7 ^ 0x6863;
        HitBubblesModule.f[0xEEA1 ^ 0xEF84] = 0x223 ^ 0xEF84;
        HitBubblesModule.f[2 ^ 0x46] = 0xE ^ 0x46;
        HitBubblesModule.f[0xE28C ^ 0xE259] = 0xFFFFB9E6 ^ 0xE259;
        HitBubblesModule.f[0xE958 ^ 0xE82D] = 0x5AAB ^ 0xE82D;
        HitBubblesModule.f[0xFC10 ^ 0xFD5F] = 0xC8C2 ^ 0xFD5F;
        HitBubblesModule.f[0x60D7 ^ 0x6185] = 0x8A7 ^ 0x6185;
        HitBubblesModule.f[0x1062D ^ 0x10735] = 0xFFFE566B ^ 0x10735;
        HitBubblesModule.f[0x223E ^ 0x2255] = 0x2266 ^ 0x2255;
        HitBubblesModule.f[0x4D6 ^ 0x4EF] = 0xFFFFFB91 ^ 0x4EF;
        HitBubblesModule.f[0xCE6E ^ 0xCE61] = 0xCEF4 ^ 0xCE61;
        HitBubblesModule.f[0xAE03 ^ 0xAEAC] = 0xAEAD ^ 0xAEAC;
        HitBubblesModule.f[0xC5D0 ^ 0xC5D3] = 0xFFFF3A70 ^ 0xC5D3;
        HitBubblesModule.f[0x325C ^ 0x32B2] = 0x5E78 ^ 0x32B2;
        HitBubblesModule.f[0x9FE2 ^ 0x9FD9] = 0xFFFF601A ^ 0x9FD9;
        HitBubblesModule.f[0x3410 ^ 0x345F] = 0x345F ^ 0x345F;
        HitBubblesModule.f[0x155E ^ 0x1520] = 0x1543 ^ 0x1520;
        HitBubblesModule.f[0xED66 ^ 0xED12] = 0xFFFF128F ^ 0xED12;
        HitBubblesModule.f[0xF15D ^ 0xF019] = 0x893E ^ 0xF019;
        HitBubblesModule.f[0x33A0 ^ 0x33F4] = 0x33F4 ^ 0x33F4;
        HitBubblesModule.f[0x5B9B ^ 0x5B45] = 0x9824 ^ 0x5B45;
        HitBubblesModule.f[0x67C6 ^ 0x66A5] = 0xFED2 ^ 0x66A5;
        HitBubblesModule.f[0xEAEB ^ 0xEBC1] = 0x20AD ^ 0xEBC1;
        HitBubblesModule.f[0xB4DF ^ 0xB4DF] = 0xB484 ^ 0xB4DF;
        HitBubblesModule.f[0x451B ^ 0x4574] = 0x450E ^ 0x4574;
        HitBubblesModule.f[0x4647 ^ 0x475C] = 0xF36E ^ 0x475C;
        HitBubblesModule.f[0x980F ^ 0x9949] = 0x8051 ^ 0x9949;
        HitBubblesModule.f[0x7A68 ^ 0x7B30] = 0xFFFF622D ^ 0x7B30;
        HitBubblesModule.f[0x5419 ^ 0x542B] = 0x5435 ^ 0x542B;
        HitBubblesModule.f[0xD126 ^ 0xD112] = 0xD127 ^ 0xD112;
        HitBubblesModule.f[0xE3B3 ^ 0xE36A] = 0xA009 ^ 0xE36A;
        HitBubblesModule.f[0x610F ^ 0x6036] = 0x3483 ^ 0x6036;
        HitBubblesModule.f[0xDE3 ^ 0xDB0] = 0xDB0 ^ 0xDB0;
        HitBubblesModule.f[0x7362 ^ 0x7257] = 0x17113 ^ 0x7257;
        HitBubblesModule.f[0x1DE0 ^ 0x1DC2] = 0xFFFFE218 ^ 0x1DC2;
        HitBubblesModule.f[0x10081 ^ 0x101F1] = 0xFFFEA38E ^ 0x101F1;
        HitBubblesModule.f[0xF28B ^ 0xF2B6] = 0xF2C5 ^ 0xF2B6;
        HitBubblesModule.f[0x3898 ^ 0x391D] = 0x5F28 ^ 0x391D;
        HitBubblesModule.f[0xC804 ^ 0xC98D] = 0x9D96 ^ 0xC98D;
        HitBubblesModule.f[0xA4B8 ^ 0xA467] = 0x2935 ^ 0xA467;
        HitBubblesModule.f[0x4CF4 ^ 0x4DC3] = 0x1976 ^ 0x4DC3;
        HitBubblesModule.f[0x3FDF ^ 0x3EE1] = 0x606E ^ 0x3EE1;
        HitBubblesModule.f[0xFA54 ^ 0xFB02] = 0x1DAF ^ 0xFB02;
        HitBubblesModule.f[0xF7EC ^ 0xF775] = 0xFFFF08EF ^ 0xF775;
        HitBubblesModule.f[0xABDD ^ 0xAAC8] = 0x166B ^ 0xAAC8;
        HitBubblesModule.f[0x7D9 ^ 0x6EA] = 0x105AE ^ 0x6EA;
        HitBubblesModule.f[0xFB06 ^ 0xFBAB] = 0xFFFF0478 ^ 0xFBAB;
        HitBubblesModule.f[0x43C6 ^ 0x4308] = 0xA387 ^ 0x4308;
        HitBubblesModule.f[0x91E5 ^ 0x9166] = 0xFFFF6EEB ^ 0x9166;
        HitBubblesModule.f[0xDE26 ^ 0xDEBB] = 0xDE61 ^ 0xDEBB;
        HitBubblesModule.f[0xC8A4 ^ 0xC9DF] = 0xC9DF ^ 0xC9DF;
        HitBubblesModule.f[0x100D3 ^ 0x10193] = 0xFFFEA0CD ^ 0x10193;
        HitBubblesModule.f[0x7FD3 ^ 0x7F05] = 0xDB21 ^ 0x7F05;
        HitBubblesModule.f[0x975D ^ 0x9771] = 0xFFFF6882 ^ 0x9771;
        HitBubblesModule.f[0x745F ^ 0x74B0] = 0x4AF6 ^ 0x74B0;
        HitBubblesModule.f[0x181C ^ 0x18F1] = 0x740C ^ 0x18F1;
        HitBubblesModule.f[0x9320 ^ 0x9372] = 0x9370 ^ 0x9372;
        HitBubblesModule.f[0xE82A ^ 0xE861] = 0xE83E ^ 0xE861;
        HitBubblesModule.f[0x3E18 ^ 0x3E89] = 0xFFFFC11D ^ 0x3E89;
        HitBubblesModule.f[0xF6D8 ^ 0xF6CE] = 0xFFFF096A ^ 0xF6CE;
        HitBubblesModule.f[0x102EA ^ 0x103CC] = 0x15E49 ^ 0x103CC;
        HitBubblesModule.f[0x4293 ^ 0x4205] = 0xFFFFBDCC ^ 0x4205;
        HitBubblesModule.f[0x3D90 ^ 0x3DAF] = 0xFFFFC279 ^ 0x3DAF;
        HitBubblesModule.f[0x3FF0 ^ 0x3FA9] = 0xD07E ^ 0x3FA9;
        HitBubblesModule.f[0x10AD5 ^ 0x10AB4] = 0xFFFEF539 ^ 0x10AB4;
        HitBubblesModule.f[0x25F ^ 0x27E] = 0xFFFFFDF3 ^ 0x27E;
        HitBubblesModule.f[0x2064 ^ 0x2166] = 0xEE28 ^ 0x2166;
        HitBubblesModule.f[0xCFB5 ^ 0xCF22] = 0xFFFF3047 ^ 0xCF22;
        HitBubblesModule.f[0x2A73 ^ 0x2A56] = 0xFFFFD5A9 ^ 0x2A56;
        HitBubblesModule.f[0x925B ^ 0x9200] = 0xC79 ^ 0x9200;
        HitBubblesModule.f[0x3EB0 ^ 0x3EA3] = 0x3EA5 ^ 0x3EA3;
        HitBubblesModule.f[0xA464 ^ 0xA5E3] = 0xB104 ^ 0xA5E3;
        HitBubblesModule.f[0xB30E ^ 0xB340] = 0xB343 ^ 0xB340;
        HitBubblesModule.f[0xCE79 ^ 0xCEBE] = 0x1C53E ^ 0xCEBE;
        HitBubblesModule.f[0x5324 ^ 0x5349] = 0x5321 ^ 0x5349;
        HitBubblesModule.f[0xDD42 ^ 0xDC36] = 0x6EF5 ^ 0xDC36;
        HitBubblesModule.f[0x84A4 ^ 0x858D] = 0xD81F ^ 0x858D;
        HitBubblesModule.f[0x1ABB ^ 0x1AF7] = 0xFFFFE52A ^ 0x1AF7;
        HitBubblesModule.f[0xF548 ^ 0xF52C] = 0xF535 ^ 0xF52C;
        HitBubblesModule.f[0x9F01 ^ 0x9E16] = 0x309A ^ 0x9E16;
        HitBubblesModule.f[0xF4D8 ^ 0xF582] = 0x65EF ^ 0xF582;
        HitBubblesModule.f[0x27E3 ^ 0x270B] = 0x26EF ^ 0x270B;
        HitBubblesModule.f[0x1E5C ^ 0x1EF6] = 0xFFFFE15A ^ 0x1EF6;
        HitBubblesModule.f[0x8BD2 ^ 0x8ABB] = 0x469C ^ 0x8ABB;
        HitBubblesModule.f[0xBF74 ^ 0xBE7D] = 0x220 ^ 0xBE7D;
        HitBubblesModule.f[0x7316 ^ 0x7224] = 0x17176 ^ 0x7224;
        HitBubblesModule.f[0x23A9 ^ 0x2359] = 0x1D1D ^ 0x2359;
        HitBubblesModule.f[0x25C0 ^ 0x2509] = 0xFFFED11A ^ 0x2509;
        HitBubblesModule.f[0x924E ^ 0x9342] = 0xFFFF3B60 ^ 0x9342;
        HitBubblesModule.f[0x72C3 ^ 0x72F3] = 0x7297 ^ 0x72F3;
        HitBubblesModule.f[0x477B ^ 0x47F2] = 0x4796 ^ 0x47F2;
        HitBubblesModule.f[0x8617 ^ 0x863C] = 0x8677 ^ 0x863C;
        HitBubblesModule.f[0xE80 ^ 0xEB5] = 0xFFFFF171 ^ 0xEB5;
        HitBubblesModule.f[0xC51 ^ 0xD0D] = 0xFFFF62B7 ^ 0xD0D;
        HitBubblesModule.f[0x61E9 ^ 0x6100] = 0x60A0 ^ 0x6100;
        HitBubblesModule.f[0x1E74 ^ 0x1F0E] = 0x1F0E ^ 0x1F0E;
        HitBubblesModule.f[0xE1EF ^ 0xE1A6] = 0xE1D6 ^ 0xE1A6;
        HitBubblesModule.f[0x464C ^ 0x466C] = 0x4633 ^ 0x466C;
        HitBubblesModule.f[0xD0FE ^ 0xD187] = 0xA6F3 ^ 0xD187;
        HitBubblesModule.f[0xE79B ^ 0xE7A3] = 0xFFFF1834 ^ 0xE7A3;
        HitBubblesModule.f[0xE9D7 ^ 0xE949] = 0xFFFF16C1 ^ 0xE949;
        HitBubblesModule.f[0x7984 ^ 0x78F5] = 0x2542 ^ 0x78F5;
        HitBubblesModule.f[0x1DE3 ^ 0x1D62] = 0x1D29 ^ 0x1D62;
        HitBubblesModule.f[0xAB13 ^ 0xAB74] = 0xFFFF540B ^ 0xAB74;
        HitBubblesModule.f[0x8248 ^ 0x832C] = 0x1B3F ^ 0x832C;
        HitBubblesModule.f[0xFE81 ^ 0xFEDF] = 0xC092 ^ 0xFEDF;
        HitBubblesModule.f[0xAF5A ^ 0xAFFF] = 0xFFFF500A ^ 0xAFFF;
        HitBubblesModule.f[0x533C ^ 0x5279] = 0x2B14 ^ 0x5279;
        HitBubblesModule.f[0x6A61 ^ 0x6B6F] = 0x66FC ^ 0x6B6F;
        HitBubblesModule.f[0xCBA1 ^ 0xCAAB] = 0x9D0A ^ 0xCAAB;
        HitBubblesModule.f[0xDA67 ^ 0xDAC5] = 0xDAB6 ^ 0xDAC5;
        HitBubblesModule.f[0xA0CE ^ 0xA0DA] = 0xFFFF5F2B ^ 0xA0DA;
        HitBubblesModule.f[0xAB6A ^ 0xAA07] = 0x60C6 ^ 0xAA07;
        HitBubblesModule.f[0x6328 ^ 0x63D1] = 0xB10B ^ 0x63D1;
        HitBubblesModule.f[0xB369 ^ 0xB355] = 0xB369 ^ 0xB355;
        HitBubblesModule.f[0x1160 ^ 0x114A] = 0xFFFFEEC2 ^ 0x114A;
        HitBubblesModule.f[0xE03F ^ 0xE0D5] = 0xE131 ^ 0xE0D5;
        HitBubblesModule.f[0x4B2A ^ 0x4B46] = 0xFFFFB4E7 ^ 0x4B46;
        HitBubblesModule.f[0x4A65 ^ 0x4A32] = 0x6400 ^ 0x4A32;
        HitBubblesModule.f[0x108C3 ^ 0x10845] = 0xFFFEF7A8 ^ 0x10845;
        HitBubblesModule.f[0x62B2 ^ 0x6219] = 0x624C ^ 0x6219;
        HitBubblesModule.f[0xCAC2 ^ 0xCB4D] = 0xFFFF34F9 ^ 0xCB4D;
        HitBubblesModule.f[0x949F ^ 0x9590] = 0x9819 ^ 0x9590;
        HitBubblesModule.f[0x81A1 ^ 0x80C1] = 0xFFFF31AF ^ 0x80C1;
        HitBubblesModule.f[0x4A85 ^ 0x4A8B] = 0x4AE0 ^ 0x4A8B;
        HitBubblesModule.f[0xEDF ^ 0xECD] = 0xEC3 ^ 0xECD;
        HitBubblesModule.f[0xB108 ^ 0xB1AE] = 0xB1F2 ^ 0xB1AE;
        HitBubblesModule.f[0x144F ^ 0x14DA] = 0x14AB ^ 0x14DA;
        HitBubblesModule.f[0x9FBA ^ 0x9F08] = 0x9F09 ^ 0x9F08;
        HitBubblesModule.f[0x1DC8 ^ 0x1D60] = 0x1D27 ^ 0x1D60;
        HitBubblesModule.f[0x20E ^ 0x33A] = 0x1000D ^ 0x33A;
        HitBubblesModule.f[0xECE5 ^ 0xEDD9] = 0xFFFF88CF ^ 0xEDD9;
        HitBubblesModule.f[0x480 ^ 0x5BB] = 0x9F0F ^ 0x5BB;
        HitBubblesModule.f[0x29AF ^ 0x28BB] = 0xFFFF6BC7 ^ 0x28BB;
        HitBubblesModule.f[0xEF4A ^ 0xEFF4] = 0x7BDE ^ 0xEFF4;
        HitBubblesModule.f[0x8A25 ^ 0x8AE9] = 0x6A66 ^ 0x8AE9;
        HitBubblesModule.f[0xE42F ^ 0xE4C3] = 0x8809 ^ 0xE4C3;
        HitBubblesModule.f[0x2312 ^ 0x23EC] = 0xDFC8 ^ 0x23EC;
        HitBubblesModule.f[0x777F ^ 0x777B] = 0xFFFF888E ^ 0x777B;
        HitBubblesModule.f[0x8742 ^ 0x8743] = 0xFFFF78B5 ^ 0x8743;
        HitBubblesModule.f[0x834 ^ 0x8E4] = 0x6042 ^ 0x8E4;
        HitBubblesModule.f[0x2D02 ^ 0x2C20] = 0xC196 ^ 0x2C20;
        HitBubblesModule.f[0xCC80 ^ 0xCC44] = 0x8F9D ^ 0xCC44;
        HitBubblesModule.f[0xAAA2 ^ 0xAAA5] = 0xFFFF5529 ^ 0xAAA5;
        HitBubblesModule.f[0x6040 ^ 0x60E1] = 0xFFFF9F0C ^ 0x60E1;
        HitBubblesModule.f[0x5BD6 ^ 0x5B07] = 0xFFFFCC3A ^ 0x5B07;
        HitBubblesModule.f[0x61FC ^ 0x6090] = 0xFFFF55C0 ^ 0x6090;
        HitBubblesModule.f[0xDA19 ^ 0xDB21] = 0x8FA3 ^ 0xDB21;
        HitBubblesModule.f[0x78B3 ^ 0x784E] = 0x2B14 ^ 0x784E;
        HitBubblesModule.f[0xF1ED ^ 0xF166] = 0xFFFF0E8A ^ 0xF166;
        HitBubblesModule.f[0x668C ^ 0x66DC] = 0x66DD ^ 0x66DC;
        HitBubblesModule.f[0x2012 ^ 0x2021] = 0xFFFFDFD1 ^ 0x2021;
        HitBubblesModule.f[0x1CE4 ^ 0x1C44] = 0xFFFFE338 ^ 0x1C44;
        HitBubblesModule.f[0x7E86 ^ 0x7FDD] = 0xEFB7 ^ 0x7FDD;
        HitBubblesModule.f[0x1064C ^ 0x1072A] = 0x1CB14 ^ 0x1072A;
        HitBubblesModule.f[0x7F2 ^ 0x788] = 0x788 ^ 0x788;
        HitBubblesModule.f[0xEE23 ^ 0xEF51] = 0x5DD8 ^ 0xEF51;
        HitBubblesModule.f[0xA931 ^ 0xA9C5] = 0x6BEB ^ 0xA9C5;
        HitBubblesModule.f[0xED3B ^ 0xED4A] = 0xED03 ^ 0xED4A;
        HitBubblesModule.f[0xD681 ^ 0xD7C9] = 0xFFFF313D ^ 0xD7C9;
        HitBubblesModule.f[0x7C6A ^ 0x7C1A] = 0x7C26 ^ 0x7C1A;
        HitBubblesModule.f[0x108D9 ^ 0x10959] = 0x19ED9 ^ 0x10959;
        HitBubblesModule.f[0xCBF6 ^ 0xCB3D] = 0x2BB1 ^ 0xCB3D;
        HitBubblesModule.f[0xEF78 ^ 0xEF67] = 0xEF0F ^ 0xEF67;
        HitBubblesModule.f[0x10DAE ^ 0x10CCF] = 0x14238 ^ 0x10CCF;
        HitBubblesModule.f[0x3E90 ^ 0x3FBC] = 0xFFFF0B09 ^ 0x3FBC;
        HitBubblesModule.f[0x4824 ^ 0x4899] = 0xFFFF2355 ^ 0x4899;
        HitBubblesModule.f[0x2037 ^ 0x200D] = 0x204B ^ 0x200D;
        HitBubblesModule.f[0x4CCA ^ 0x4DA2] = 0x81DD ^ 0x4DA2;
        HitBubblesModule.f[0x181F ^ 0x1991] = 0x1991 ^ 0x1991;
        HitBubblesModule.f[0x10A1A ^ 0x10AEF] = 0x1C8A4 ^ 0x10AEF;
        HitBubblesModule.f[0x4E40 ^ 0x4E39] = 0x4E38 ^ 0x4E39;
        HitBubblesModule.f[0xF90 ^ 0xF48] = 0x4C7E ^ 0xF48;
        HitBubblesModule.f[0x38FF ^ 0x38FA] = 0x38A1 ^ 0x38FA;
        HitBubblesModule.f[0xF967 ^ 0xF849] = 0x4C02 ^ 0xF849;
        HitBubblesModule.f[0x478A ^ 0x4706] = 0xFFFFB889 ^ 0x4706;
        HitBubblesModule.f[0x6C77 ^ 0x6C59] = 0xFFFF93BF ^ 0x6C59;
        HitBubblesModule.f[0x71F1 ^ 0x70E1] = 0xFFFF82C2 ^ 0x70E1;
        HitBubblesModule.f[0x349E ^ 0x3598] = 0x89DA ^ 0x3598;
        HitBubblesModule.f[0xA958 ^ 0xA875] = 0x631A ^ 0xA875;
        HitBubblesModule.f[0x1FA0 ^ 0x1F2A] = 0xFFFFE0AD ^ 0x1F2A;
        HitBubblesModule.f[0x10FD ^ 0x1073] = 0xFFFFEFD9 ^ 0x1073;
        HitBubblesModule.f[0x8E8B ^ 0x8FB4] = 0xD131 ^ 0x8FB4;
        HitBubblesModule.f[0x9476 ^ 0x94C1] = 0xC784 ^ 0x94C1;
        HitBubblesModule.f[0x10956 ^ 0x10814] = 0x1716B ^ 0x10814;
        HitBubblesModule.f[0x7DC9 ^ 0x7DDC] = 0x47DF2 ^ 0x7DDC;
        HitBubblesModule.f[0xD0D9 ^ 0xD1C8] = 0xDC41 ^ 0xD1C8;
        HitBubblesModule.f[0xED5D ^ 0xED43] = 0xED54 ^ 0xED43;
        HitBubblesModule.f[0xE12A ^ 0xE103] = 0xFFFF1ED7 ^ 0xE103;
        HitBubblesModule.f[0x77E ^ 0x703] = 0x702 ^ 0x703;
    }
}

