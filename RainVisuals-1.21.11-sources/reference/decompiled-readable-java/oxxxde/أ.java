/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.network.ClientPlayerEntity
 *  net.minecraft.client.render.GameRenderer
 *  net.minecraft.client.render.RenderLayer
 *  net.minecraft.client.render.VertexConsumer
 *  net.minecraft.client.render.command.OrderedRenderCommandQueue
 *  net.minecraft.client.render.entity.state.LivingEntityRenderState
 *  net.minecraft.client.render.state.CameraRenderState
 *  net.minecraft.client.util.math.MatrixStack
 *  net.minecraft.client.util.math.MatrixStack$Entry
 *  net.minecraft.client.world.ClientWorld
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.util.Identifier
 *  net.minecraft.util.math.Vec3d
 *  org.joml.Vector3f
 *  ru.ocz.protection.virtualmachine.annotation.RecompileFormat
 */
package oxxxde;

import java.awt.Color;
import kotakbaz.rain.module.Module;
import kotakbaz.rain.module.setting.settings.BooleanSetting;
import kotakbaz.rain.module.setting.settings.ColorSetting;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.client.render.RainRenderLayers;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.command.OrderedRenderCommandQueue;
import net.minecraft.client.render.entity.state.LivingEntityRenderState;
import net.minecraft.client.render.state.CameraRenderState;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Vec3d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joml.Vector3f;
import oxxxde.\u0634\u0622;
import oxxxde.\u0636\u0643;
import oxxxde.\u0637\u062b;
import oxxxde.\u0638\u0646;
import ru.ocz.protection.virtualmachine.annotation.RecompileFormat;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c7\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\b\u0007\u0010\bJ5\u0010\u0014\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011\u00a2\u0006\u0004\b\u0014\u0010\u0015JW\u0010$\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u001dH\u0002\u00a2\u0006\u0004\b$\u0010%Jg\u0010*\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010&\u001a\u00020\u001d2\u0006\u0010'\u001a\u00020\u001d2\u0006\u0010(\u001a\u00020\u001d2\u0006\u0010)\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\tH\u0002\u00a2\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u001dH\u0002\u00a2\u0006\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b/\u00100R\u0014\u00101\u001a\u00020.8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b1\u00100R\u0014\u00102\u001a\u00020\u001d8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b2\u00103R\u0014\u00104\u001a\u00020\u001d8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b4\u00103R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b6\u00107R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010<\u001a\u00020;8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b<\u0010=\u00a8\u0006>"}, d2={"Loxxxde/\u0623;", "Loxxxde/\u062f\u0650;", "<init>", "()V", "Lnet/minecraft/class_1297;", "entity", "", "shouldRender", "(Lnet/minecraft/class_1297;)Z", "", "entityId", "Lnet/minecraft/class_10042;", "state", "Lnet/minecraft/class_4587;", "matrices", "Lnet/minecraft/class_11659;", "collector", "Lnet/minecraft/class_12075;", "cameraState", "", "submitAura", "(ILnet/minecraft/class_10042;Lnet/minecraft/class_4587;Lnet/minecraft/class_11659;Lnet/minecraft/class_12075;)V", "Lnet/minecraft/class_4588;", "buffer", "Lnet/minecraft/class_4587$class_4665;", "pose", "Lorg/joml/Vector3f;", "right", "up", "", "centerY", "width", "height", "Ljava/awt/Color;", "color", "alpha", "emitLayer", "(Lnet/minecraft/class_4588;Lnet/minecraft/class_4587$class_4665;Lorg/joml/Vector3f;Lorg/joml/Vector3f;FFFLjava/awt/Color;F)V", "horizontal", "vertical", "u", "v", "emitVertex", "(Lnet/minecraft/class_4588;Lnet/minecraft/class_4587$class_4665;Lorg/joml/Vector3f;Lorg/joml/Vector3f;FFFFFLjava/awt/Color;I)V", "glowPulse", "()F", "", "MAX_DISTANCE_SQUARED", "D", "DEPTH_OFFSET", "OUTER_ALPHA", "F", "INNER_ALPHA", "Lnet/minecraft/class_2960;", "glowTexture", "Lnet/minecraft/class_2960;", "Loxxxde/\u0631\u062a;", "glowColor", "Loxxxde/\u0631\u062a;", "Loxxxde/\u062e\u0630;", "showOtherPlayers", "Loxxxde/\u062e\u0630;", "rain-visuals"})
@RecompileFormat
public final class \u0623
extends Module {
    @NotNull
    private static final BooleanSetting showOtherPlayers;
    private static final float OUTER_ALPHA = 0.42f;
    @NotNull
    private static final ColorSetting glowColor;
    private static final double DEPTH_OFFSET = 0.012;
    @NotNull
    public static final \u0623 INSTANCE;
    @NotNull
    private static final Identifier glowTexture;
    private static final double MAX_DISTANCE_SQUARED = 9216.0;
    private static final float INNER_ALPHA = 0.28f;

    /*
     * WARNING - void declaration
     */
    public final void submitAura(int entityId, @NotNull LivingEntityRenderState state, @NotNull MatrixStack matrices, @NotNull OrderedRenderCommandQueue collector, @NotNull CameraRenderState cameraState) {
        void var3_3;
        Color color;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(matrices, "matrices");
        Intrinsics.checkNotNullParameter(collector, "collector");
        Intrinsics.checkNotNullParameter(cameraState, "cameraState");
        ClientWorld clientWorld = \u0636\u0643.getMc().world;
        if (clientWorld == null || (clientWorld = clientWorld.getEntityById(entityId)) == null) {
            return;
        }
        ClientWorld entity = clientWorld;
        if (!this.shouldRender((Entity)entity)) {
            return;
        }
        float bodyWidth = RangesKt.coerceAtLeast(state.width, 0.45f);
        float bodyHeight = RangesKt.coerceAtLeast(state.height, 1.2f);
        float centerY = bodyHeight * 0.46f;
        float outerWidth = Math.max(1.55f, bodyWidth * 2.65f);
        float outerHeight = Math.max(2.55f, bodyHeight * 1.42f);
        float innerWidth = outerWidth * 0.76f;
        float innerHeight = outerHeight * 0.78f;
        Vector3f right = new Vector3f(1.0f, 0.0f, 0.0f);
        Vector3f up = new Vector3f(0.0f, 1.0f, 0.0f);
        cameraState.orientation.transform(right);
        cameraState.orientation.transform(up);
        Vec3d center = new Vec3d(state.x, state.y + (double)centerY, state.z);
        Vec3d vec3d = center.subtract(cameraState.pos);
        Intrinsics.checkNotNullExpressionValue(vec3d, "subtract(...)");
        Vec3d cameraToEntity = vec3d;
        Vec3d vec3d2 = cameraToEntity.lengthSquared() > 1.0E-6 ? cameraToEntity.normalize().multiply(0.012) : Vec3d.ZERO;
        Intrinsics.checkNotNull(vec3d2);
        void depthOffset = color;
        color = (Color)glowColor.getValue();
        float pulse = this.glowPulse();
        float baseAlpha = (float)color.getAlpha() / 255.0f;
        RenderLayer layer = RainRenderLayers.getTrailSprite(glowTexture);
        matrices.push();
        matrices.translate(depthOffset.x, depthOffset.y, depthOffset.z);
        collector.submitCustom(matrices, layer, (arg_0, arg_1) -> \u0623.submitAura$lambda$0(right, up, centerY, outerWidth, outerHeight, color, baseAlpha, pulse, innerWidth, innerHeight, arg_0, arg_1));
        var3_3.pop();
    }

    /*
     * WARNING - void declaration
     */
    private final void emitLayer(VertexConsumer buffer, MatrixStack.Entry pose, Vector3f right, Vector3f up, float centerY, float width, float height, Color color, float alpha) {
        void var12_12;
        void var8_8;
        void var11_11;
        void var10_10;
        float halfWidth = width * 0.5f;
        float halfHeight = height * 0.5f;
        int packedAlpha = RangesKt.coerceIn((int)(alpha * 255.0f), 0, 255);
        this.emitVertex(buffer, pose, right, up, centerY, -halfWidth, -halfHeight, 0.0f, 1.0f, color, packedAlpha);
        this.emitVertex(buffer, pose, right, up, centerY, halfWidth, -halfHeight, 1.0f, 1.0f, color, packedAlpha);
        this.emitVertex(buffer, pose, right, up, centerY, halfWidth, halfHeight, 1.0f, 0.0f, color, packedAlpha);
        this.emitVertex(buffer, pose, right, up, centerY, (float)(-var10_10), (float)var11_11, 0.0f, 0.0f, (Color)var8_8, (int)var12_12);
    }

    private final float glowPulse() {
        float wave = ((float)Math.sin((double)System.nanoTime() * 1.8E-9) + 1.0f) * 0.5f;
        return 0.88f + wave * 0.12f;
    }

    public final boolean shouldRender(@Nullable Entity entity) {
        ClientPlayerEntity localPlayer;
        PlayerEntity player;
        block13: {
            block12: {
                block11: {
                    block10: {
                        if (!this.isEnabled()) break block10;
                        if (!\u0634\u0622.isRenderingPreview()) break block11;
                    }
                    return false;
                }
                if (((Color)glowColor.getValue()).getAlpha() <= 0) {
                    return false;
                }
                PlayerEntity playerEntity = entity instanceof PlayerEntity ? (PlayerEntity)entity : null;
                if (playerEntity == null) {
                    return false;
                }
                player = playerEntity;
                ClientPlayerEntity clientPlayerEntity = \u0636\u0643.getMc().player;
                if (clientPlayerEntity == null) {
                    return false;
                }
                localPlayer = clientPlayerEntity;
                if (!player.isAlive()) break block12;
                if (player.isInvisible()) break block12;
                if (!player.isSpectator()) break block13;
            }
            return false;
        }
        GameRenderer gameRenderer = \u0636\u0643.getMc().gameRenderer;
        Intrinsics.checkNotNullExpressionValue(gameRenderer, "gameRenderer");
        if (player.squaredDistanceTo(\u0637\u062b.getPos(\u0637\u062b.getCamera(gameRenderer))) > 9216.0) {
            return false;
        }
        return player == localPlayer ? !\u0636\u0643.getMc().options.getPerspective().isFirstPerson() : (Boolean)showOtherPlayers.getValue();
    }

    private \u0623() {
        super("BodyGlow", \u0638\u0646.getRENDER(), "\u041c\u044f\u0433\u043a\u0430\u044f \u0441\u0432\u0435\u0442\u043e\u0432\u0430\u044f \u0430\u0443\u0440\u0430 \u0432\u043e\u043a\u0440\u0443\u0433 \u043c\u043e\u0434\u0435\u043b\u0438 \u0438\u0433\u0440\u043e\u043a\u0430");
    }

    static {
        INSTANCE = new \u0623();
        Identifier identifier = Identifier.of((String)"rain", (String)"images/particles/glow.png");
        Intrinsics.checkNotNullExpressionValue(identifier, "fromNamespaceAndPath(...)");
        glowTexture = identifier;
        glowColor = INSTANCE.color("\u0426\u0432\u0435\u0442", new Color(255, 232, 96, 210), "glowColor");
        showOtherPlayers = INSTANCE.boolean("\u041e\u0442\u043e\u0431\u0440\u0430\u0436\u0430\u0442\u044c \u043d\u0430 \u0434\u0440\u0443\u0433\u0438\u0445 \u0438\u0433\u0440\u043e\u043a\u0430\u0445", false, "showOtherPlayers");
    }

    private static final void submitAura$lambda$0(Vector3f $right, Vector3f $up, float $centerY, float $outerWidth, float $outerHeight, Color $color, float $baseAlpha, float $pulse, float $innerWidth, float $innerHeight, MatrixStack.Entry pose, VertexConsumer buffer) {
        Intrinsics.checkNotNullParameter(pose, "pose");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        INSTANCE.emitLayer(buffer, pose, $right, $up, $centerY, $outerWidth, $outerHeight, $color, $baseAlpha * 0.42f * $pulse);
        INSTANCE.emitLayer(buffer, pose, $right, $up, $centerY, $innerWidth, $innerHeight, $color, $baseAlpha * 0.28f * $pulse);
    }

    private final void emitVertex(VertexConsumer buffer, MatrixStack.Entry pose, Vector3f right, Vector3f up, float centerY, float horizontal, float vertical, float u, float v, Color color, int alpha) {
        float x = right.x * horizontal + up.x * vertical;
        float y = centerY + right.y * horizontal + up.y * vertical;
        float z = right.z * horizontal + up.z * vertical;
        buffer.vertex(pose, x, y, z).texture(u, v).color(color.getRed(), color.getGreen(), color.getBlue(), alpha);
    }
}

