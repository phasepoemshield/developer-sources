package fun.nexisdlc.modules.impl.render;

import fun.nexisdlc.Nexis;
import fun.nexisdlc.client.ClientColors;
import fun.nexisdlc.client.events.impl.render.EventRender;
import fun.nexisdlc.client.utils.eventbus.EventHandler;
import fun.nexisdlc.client.utils.render.color.basic.ColorUtils;
import fun.nexisdlc.client.utils.render.main.world.WorldGeometryEmitter;
import fun.nexisdlc.client.utils.render.main.world.WorldLineRenderer;
import fun.nexisdlc.client.utils.render.main.world.WorldRenderLayers;
import fun.nexisdlc.client.utils.render.main.world.WorldRenderer;
import fun.nexisdlc.mixins.accessors.GameRendererAccessor;
import fun.nexisdlc.modules.api.Category;
import fun.nexisdlc.modules.api.Function;
import fun.nexisdlc.modules.api.FunctionAdd;
import fun.nexisdlc.modules.api.settings.impl.BooleanSetting;
import fun.nexisdlc.modules.api.settings.impl.SliderSetting;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.render.Camera;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.player.PlayerSkinType;
import net.minecraft.util.Arm;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RotationAxis;
import net.minecraft.util.math.Vec3d;
import org.joml.Matrix4f;
import org.joml.Vector4f;

@FunctionAdd(name = "OutlineChams", alias = "Outline Chams", category = Category.Render,
        description = "Рисует shader2-обводку игроков без скрытия ванильной модели")
public class OutlineChams extends Function {
    private static final int FRIEND_COLOR = ColorUtils.rgba(35, 255, 70, 255);
    private static final int HURT_COLOR = ColorUtils.rgba(255, 35, 35, 255);

    private final SliderSetting alpha = new SliderSetting("Прозрачность", 0.95f, 0.05f, 1.0f, 0.05f);
    private final SliderSetting lineWidth = new SliderSetting("Толщина линий", 3.25f, 0.1f, 8.0f, 0.05f);
    private final BooleanSetting throughWalls = new BooleanSetting("Сквозь стены", true);
    private final BooleanSetting glow = new BooleanSetting("Свечение", true);
    private final SliderSetting glowIntensity = new SliderSetting("Сила свечения", 2.2f, 0.2f, 5.0f, 0.1f).setVisible(glow::get);
    private final SliderSetting glowLayers = new SliderSetting("Слои свечения", 5.0f, 1.0f, 8.0f, 1.0f).setVisible(glow::get);
    private final SliderSetting shaderSpeed = new SliderSetting("Скорость", 0.85f, 0.1f, 4.0f, 0.05f);
    private final SliderSetting waveStrength = new SliderSetting("Волны", 1.35f, 0.0f, 3.0f, 0.05f);
    private final BooleanSetting renderSelf = new BooleanSetting("Рендерить себя", false);
    private double currentLinePx;
    private float currentLighten;

    public OutlineChams() {
        addSettings(alpha, lineWidth, throughWalls, glow, glowIntensity, glowLayers, shaderSpeed, waveStrength, renderSelf);
    }

    @EventHandler
    public void onRender(EventRender.World event) {
        if (nullCheck() || mc.world == null || mc.player == null) return;

        Camera camera = mc.gameRenderer.getCamera();
        float tickDelta = event.getTicks();
        float fov = ((GameRendererAccessor) mc.gameRenderer).invokeGetFov(camera, tickDelta, true);
        Matrix4f positionMatrix = new Matrix4f(event.getMatrixStack().peek().getPositionMatrix());
        Matrix4f projectionMatrix = new Matrix4f(mc.gameRenderer.getBasicProjectionMatrix(fov));
        Vec3d cameraPos = camera.getCameraPos();

        try (WorldRenderer renderer = WorldRenderer.begin(mc, mc.getRenderTickCounter(), camera, positionMatrix, projectionMatrix)) {
            if (glow.get()) {
                WorldGeometryEmitter glowEmitter = new WorldGeometryEmitter(
                        camera, new MatrixStack().peek(),
                        renderer.getBuffer(WorldRenderLayers.POSITION_COLOR_QUADS_ALPHA_SRC_ONE_NO_DEPTH()));
                int layers = Math.max(1, Math.round(glowLayers.get()));
                for (int i = layers; i >= 1; i--) {
                    float expand = (0.18f + i * 0.22f) * glowIntensity.get();
                    currentLinePx = lineWidth.get() * (2.05 + i * 0.58);
                    currentLighten = 0.18f;
                    for (AbstractClientPlayerEntity player : mc.world.getPlayers()) {
                        if (shouldRender(player)) renderPlayer(glowEmitter, cameraPos, player, tickDelta, expand, true);
                    }
                }
                renderer.flush();
            }

            WorldGeometryEmitter lineEmitter = new WorldGeometryEmitter(
                    camera, new MatrixStack().peek(),
                    renderer.getBuffer(throughWalls.get()
                            ? WorldRenderLayers.POSITION_COLOR_QUADS_ALPHA_SRC_ONE_NO_DEPTH()
                            : WorldRenderLayers.POSITION_COLOR_QUADS_TRANSLUCENT()));
            currentLinePx = lineWidth.get() * 1.35;
            currentLighten = 0.08f;
            for (AbstractClientPlayerEntity player : mc.world.getPlayers()) {
                if (shouldRender(player)) renderPlayer(lineEmitter, cameraPos, player, tickDelta, 0f, false);
            }
            currentLinePx = Math.max(1.0, lineWidth.get() * 0.48);
            currentLighten = 0.42f;
            for (AbstractClientPlayerEntity player : mc.world.getPlayers()) {
                if (shouldRender(player)) renderPlayer(lineEmitter, cameraPos, player, tickDelta, 0f, false);
            }
            renderer.flush();
        }
    }

    private boolean shouldRender(AbstractClientPlayerEntity player) {
        if (player == null || !player.isAlive() || player.isSpectator()) return false;
        if (player == mc.player && (!renderSelf.get() || mc.options.getPerspective().isFirstPerson())) return false;
        return mc.player.squaredDistanceTo(player) <= 160.0 * 160.0;
    }

    private void renderPlayer(WorldGeometryEmitter emitter, Vec3d cam, AbstractClientPlayerEntity player,
                              float tickDelta, float expand, boolean glowPass) {
        PlayerPose pose = buildPose(cam, player, tickDelta, expand, glowPass);
        emitSilhouette(emitter, pose.matrices(), pose.slim(), pose.color(), expand);
    }

    private void emitSilhouette(WorldGeometryEmitter emitter, MatrixStack matrices, boolean slim, int color, float expand) {
        float u = 1f / 16f;
        float armOuter = (4f + (slim ? 3f : 4f)) * u;
        float ex = expand * u;
        float frontZ = -2f * u - ex * 0.55f;
        float backZ = 2f * u + ex * 0.55f;
        float legGap = 0.55f * u;

        Vec3d[] front = outlinePoints(u, armOuter, ex, frontZ, legGap);
        Vec3d[] back = outlinePoints(u, armOuter, ex, backZ, legGap);
        emitContinuousModelPath(emitter, matrices, color, front);
        emitContinuousModelPath(emitter, matrices, color, back);
        emitDepthWrap(emitter, matrices, color, front, back, 0, 2, 4, 6, 8, 10, 12, 14);
    }

    private Vec3d[] outlinePoints(float u, float armOuter, float ex, float z, float legGap) {
        return new Vec3d[]{
                new Vec3d(-4f * u - ex, -8f * u - ex, z),
                new Vec3d(4f * u + ex, -8f * u - ex, z),
                new Vec3d(4f * u + ex, 0f, z),
                new Vec3d(armOuter + ex, 0f, z),
                new Vec3d(armOuter + ex, 12f * u + ex, z),
                new Vec3d(4f * u + ex, 12f * u + ex, z),
                new Vec3d(4f * u + ex, 24f * u + ex, z),
                new Vec3d(legGap, 24f * u + ex, z),
                new Vec3d(legGap, 12f * u + ex, z),
                new Vec3d(-legGap, 12f * u + ex, z),
                new Vec3d(-legGap, 24f * u + ex, z),
                new Vec3d(-4f * u - ex, 24f * u + ex, z),
                new Vec3d(-4f * u - ex, 12f * u + ex, z),
                new Vec3d(-armOuter - ex, 12f * u + ex, z),
                new Vec3d(-armOuter - ex, 0f, z),
                new Vec3d(-4f * u - ex, 0f, z),
                new Vec3d(-4f * u - ex, -8f * u - ex, z)
        };
    }

    private void emitContinuousModelPath(WorldGeometryEmitter emitter, MatrixStack matrices, int color, Vec3d[] points) {
        for (int i = 0; i < points.length - 1; i++) {
            emitModelLine(emitter, matrices, points[i], points[i + 1], color);
        }
    }

    private void emitDepthWrap(WorldGeometryEmitter emitter, MatrixStack matrices, int color, Vec3d[] front, Vec3d[] back, int... points) {
        for (int point : points) {
            emitModelLine(emitter, matrices, front[point], back[point], color);
        }
    }

    private void emitSilhouettePlane(WorldGeometryEmitter emitter, MatrixStack matrices, float z, float armOuter, float ex, int color) {
        float u = 1f / 16f;
        Vec3d[] points = new Vec3d[]{
                new Vec3d(-4f * u - ex, -8f * u - ex, z),
                new Vec3d(4f * u + ex, -8f * u - ex, z),
                new Vec3d(4f * u + ex, 0f, z),
                new Vec3d(armOuter + ex, 0f, z),
                new Vec3d(armOuter + ex, 12f * u + ex, z),
                new Vec3d(4f * u + ex, 12f * u + ex, z),
                new Vec3d(4f * u + ex, 24f * u + ex, z),
                new Vec3d(0.55f * u, 24f * u + ex, z),
                new Vec3d(0.55f * u, 12f * u + ex, z),
                new Vec3d(-0.55f * u, 12f * u + ex, z),
                new Vec3d(-0.55f * u, 24f * u + ex, z),
                new Vec3d(-4f * u - ex, 24f * u + ex, z),
                new Vec3d(-4f * u - ex, 12f * u + ex, z),
                new Vec3d(-armOuter - ex, 12f * u + ex, z),
                new Vec3d(-armOuter - ex, 0f, z),
                new Vec3d(-4f * u - ex, 0f, z),
                new Vec3d(-4f * u - ex, -8f * u - ex, z)
        };
        for (int i = 0; i < points.length - 1; i++) {
            emitModelLine(emitter, matrices, points[i], points[i + 1], color);
        }
    }

    private void emitSilhouetteConnector(WorldGeometryEmitter emitter, MatrixStack matrices, float x, float y, float z0, float z1, int color) {
        emitModelLine(emitter, matrices, new Vec3d(x, y, z0), new Vec3d(x, y, z1), color);
    }

    private void emitModelLine(WorldGeometryEmitter emitter, MatrixStack matrices, Vec3d localStart, Vec3d localEnd, int color) {
        WorldLineRenderer.line(emitter, transform(matrices, localStart.x, localStart.y, localStart.z),
                transform(matrices, localEnd.x, localEnd.y, localEnd.z), Vec3d.ZERO,
                shade(color, localStart), shade(color, localEnd), currentLinePx);
    }

    private Box getInterpolatedBoundingBox(AbstractClientPlayerEntity player, float tickDelta) {
        double x = player.lastRenderX + (player.getX() - player.lastRenderX) * tickDelta;
        double y = player.lastRenderY + (player.getY() - player.lastRenderY) * tickDelta;
        double z = player.lastRenderZ + (player.getZ() - player.lastRenderZ) * tickDelta;
        double halfWidth = player.getWidth() * 0.5;
        return new Box(
                x - halfWidth,
                y,
                z - halfWidth,
                x + halfWidth,
                y + player.getHeight(),
                z + halfWidth
        );
    }

    private void emitOutlineBox(WorldGeometryEmitter emitter, Box box, Vec3d cameraPos, int color) {
        Vec3d p000 = new Vec3d(box.minX, box.minY, box.minZ);
        Vec3d p001 = new Vec3d(box.minX, box.minY, box.maxZ);
        Vec3d p010 = new Vec3d(box.minX, box.maxY, box.minZ);
        Vec3d p011 = new Vec3d(box.minX, box.maxY, box.maxZ);
        Vec3d p100 = new Vec3d(box.maxX, box.minY, box.minZ);
        Vec3d p101 = new Vec3d(box.maxX, box.minY, box.maxZ);
        Vec3d p110 = new Vec3d(box.maxX, box.maxY, box.minZ);
        Vec3d p111 = new Vec3d(box.maxX, box.maxY, box.maxZ);

        Vec3d l000 = new Vec3d(0.0, 0.0, 0.0);
        Vec3d l001 = new Vec3d(0.0, 0.0, 1.0);
        Vec3d l010 = new Vec3d(0.0, 1.0, 0.0);
        Vec3d l011 = new Vec3d(0.0, 1.0, 1.0);
        Vec3d l100 = new Vec3d(1.0, 0.0, 0.0);
        Vec3d l101 = new Vec3d(1.0, 0.0, 1.0);
        Vec3d l110 = new Vec3d(1.0, 1.0, 0.0);
        Vec3d l111 = new Vec3d(1.0, 1.0, 1.0);

        emitBoxLine(emitter, p000, p100, cameraPos, l000, l100, color);
        emitBoxLine(emitter, p100, p101, cameraPos, l100, l101, color);
        emitBoxLine(emitter, p101, p001, cameraPos, l101, l001, color);
        emitBoxLine(emitter, p001, p000, cameraPos, l001, l000, color);

        emitBoxLine(emitter, p010, p110, cameraPos, l010, l110, color);
        emitBoxLine(emitter, p110, p111, cameraPos, l110, l111, color);
        emitBoxLine(emitter, p111, p011, cameraPos, l111, l011, color);
        emitBoxLine(emitter, p011, p010, cameraPos, l011, l010, color);

        emitBoxLine(emitter, p000, p010, cameraPos, l000, l010, color);
        emitBoxLine(emitter, p100, p110, cameraPos, l100, l110, color);
        emitBoxLine(emitter, p101, p111, cameraPos, l101, l111, color);
        emitBoxLine(emitter, p001, p011, cameraPos, l001, l011, color);
    }

    private void emitBoxLine(WorldGeometryEmitter emitter, Vec3d start, Vec3d end, Vec3d cameraPos,
                             Vec3d localStart, Vec3d localEnd, int color) {
        WorldLineRenderer.line(emitter, start, end, cameraPos, shade(color, localStart), shade(color, localEnd), currentLinePx);
    }

    private PlayerPose buildPose(Vec3d cam, AbstractClientPlayerEntity player, float tickDelta, float expand, boolean glowPass) {
        double x = player.lastRenderX + (player.getX() - player.lastRenderX) * tickDelta;
        double y = player.lastRenderY + (player.getY() - player.lastRenderY) * tickDelta;
        double z = player.lastRenderZ + (player.getZ() - player.lastRenderZ) * tickDelta;

        float bodyYaw = MathHelper.lerpAngleDegrees(tickDelta, player.lastBodyYaw, player.bodyYaw);
        float headYaw = MathHelper.lerpAngleDegrees(tickDelta, player.lastHeadYaw, player.headYaw);
        float pitch = MathHelper.lerp(tickDelta, player.lastPitch, player.getPitch());
        float limbPos = player.limbAnimator.getAnimationProgress(tickDelta);
        float limbSpeed = Math.min(player.limbAnimator.getAmplitude(tickDelta), 1.0f);
        float swing = MathHelper.sin(limbPos * 0.6662f) * 0.6f * limbSpeed;
        float handSwing = player.getHandSwingProgress(tickDelta);
        float swingAngle = -(float) (Math.sin(Math.sqrt(handSwing) * Math.PI) * 1.2f);
        boolean mainRight = player.getMainArm() == Arm.RIGHT;

        MatrixStack matrices = new MatrixStack();
        matrices.translate(x - cam.x, y - cam.y, z - cam.z);
        matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(180f - bodyYaw));
        if (player.isSwimming()) {
            matrices.multiply(RotationAxis.POSITIVE_X.rotationDegrees(player.isSubmergedInWater() ? -90f - pitch : -90f));
            matrices.translate(0, -1.0, 0.3);
        }
        matrices.scale(-1f, -1f, 1f);
        matrices.scale(0.9375f, 0.9375f, 0.9375f);
        matrices.translate(0, -1.501, 0);
        if (player.isInSneakingPose()) matrices.translate(0, 0.2, 0);

        int color = getPlayerColor(player, expand, glowPass);
        boolean slim = player.getSkin().model() == PlayerSkinType.SLIM;
        return new PlayerPose(matrices, swing, mainRight ? swingAngle : 0f, mainRight ? 0f : swingAngle,
                MathHelper.wrapDegrees(headYaw - bodyYaw), pitch, slim, player.isInSneakingPose(), player.isSwimming(),
                limbPos, limbSpeed, (player.age + tickDelta) * 0.05f, color);
    }

    private int getPlayerColor(AbstractClientPlayerEntity player, float expand, boolean glowPass) {
        int alphaValue = Math.max(1, Math.round(alpha.get() * 255f));
        if (expand > 0f || glowPass) alphaValue = Math.max(1, Math.round(alpha.get() * 135f / (expand * 0.7f + 1f)));
        if (Nexis.getInstance().getFriendStorage().isFriend(player.getName().getString())) {
            return ColorUtils.injectAlpha(FRIEND_COLOR, alphaValue);
        }
        if (player.hurtTime > 0) {
            return ColorUtils.injectAlpha(HURT_COLOR, alphaValue);
        }
        return ColorUtils.injectAlpha(ClientColors.GRADIENT_START.getRGB(), alphaValue);
    }

    private record PlayerPose(MatrixStack matrices, float swing, float rightSwingX, float leftSwingX, float headYaw,
                              float pitch, boolean slim, boolean sneak, boolean swim, float limbPos, float limbSpeed,
                              float idleTime, int color) {
    }

    private void emitBody(WorldGeometryEmitter emitter, MatrixStack m, float swing,
                          float rightSwingX, float leftSwingX,
                          float headYaw, float headPitch,
                          boolean slim, boolean sneak, boolean swim,
                          float limbPos, float limbSpeed, float idleTime,
                          int color, float expand) {
        float u = 1f / 16f;
        float armW = slim ? 3 : 4;
        float armSwayZ = MathHelper.sin(idleTime) * 0.04f + 0.03f * limbSpeed;
        float swimPhase = limbPos * 0.6662f;
        float swimCycle = MathHelper.sin(swimPhase) * limbSpeed;
        float swimKick = swim ? swimCycle * 0.4f : 0f;
        float ex = expand * u;

        MatrixStack part = cloneStack(m);
        if (sneak) {
            part.translate(0, 12 * u, 0);
            part.multiply(RotationAxis.POSITIVE_X.rotationDegrees(28.64f));
            part.translate(0, -12 * u, 0);
        }
        part.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(headYaw));
        part.multiply(RotationAxis.POSITIVE_X.rotationDegrees(headPitch));
        emitBoxLines(emitter, part, -4 * u - ex, -8 * u - ex, -4 * u - ex, 8 * u + ex * 2, 8 * u + ex * 2, 8 * u + ex * 2, color);

        part = cloneStack(m);
        if (sneak) {
            part.translate(0, 12 * u, 0);
            part.multiply(RotationAxis.POSITIVE_X.rotationDegrees(28.64f));
            part.translate(0, -12 * u, 0);
        }
        if (swim) {
            part.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(MathHelper.sin(limbPos * 0.3331f) * 3f * limbSpeed));
        }
        emitBoxLines(emitter, part, -4 * u - ex, -ex, -2 * u - ex, 8 * u + ex * 2, 12 * u + ex * 2, 4 * u + ex * 2, color);

        float swimArmX = swim ? swimCycle * 0.6f - (float) (Math.PI / 2f) : 0f;
        float rightArmX = swim ? swimArmX : swing;
        float leftArmX = swim ? swimArmX : -swing;
        float swimSpread = swim ? MathHelper.clamp(swimCycle, 0f, 1f) * (float) (Math.PI / 4f) : 0f;

        part = cloneStack(m);
        if (sneak) {
            part.translate(0, 12 * u, 0);
            part.multiply(RotationAxis.POSITIVE_X.rotationDegrees(28.64f));
            part.translate(0, -12 * u, 0);
        }
        part.translate(-4 * u, 0, 0);
        part.multiply(RotationAxis.POSITIVE_X.rotation(rightArmX + (swim ? 0 : rightSwingX)));
        part.multiply(RotationAxis.POSITIVE_Z.rotation(swim ? swimSpread : armSwayZ));
        emitBoxLines(emitter, part, -armW * u - ex, -ex, -2 * u - ex, armW * u + ex * 2, 12 * u + ex * 2, 4 * u + ex * 2, color);

        part = cloneStack(m);
        if (sneak) {
            part.translate(0, 12 * u, 0);
            part.multiply(RotationAxis.POSITIVE_X.rotationDegrees(28.64f));
            part.translate(0, -12 * u, 0);
        }
        part.translate(4 * u, 0, 0);
        part.multiply(RotationAxis.POSITIVE_X.rotation(leftArmX + (swim ? 0 : leftSwingX)));
        part.multiply(RotationAxis.POSITIVE_Z.rotation(swim ? -swimSpread : -armSwayZ));
        emitBoxLines(emitter, part, -ex, -ex, -2 * u - ex, armW * u + ex * 2, 12 * u + ex * 2, 4 * u + ex * 2, color);

        part = cloneStack(m);
        part.translate(-2 * u, 12 * u, 0);
        part.multiply(RotationAxis.POSITIVE_X.rotation(swim ? -swimKick : -swing));
        emitBoxLines(emitter, part, -2 * u - ex, -ex, -2 * u - ex, 4 * u + ex * 2, 12 * u + ex * 2, 4 * u + ex * 2, color);

        part = cloneStack(m);
        part.translate(2 * u, 12 * u, 0);
        part.multiply(RotationAxis.POSITIVE_X.rotation(swim ? swimKick : swing));
        emitBoxLines(emitter, part, -2 * u - ex, -ex, -2 * u - ex, 4 * u + ex * 2, 12 * u + ex * 2, 4 * u + ex * 2, color);
    }

    private void emitBoxLines(WorldGeometryEmitter emitter, MatrixStack matrices,
                              float x, float y, float z, float sx, float sy, float sz, int color) {
        Vec3d p000 = transform(matrices, x, y, z);
        Vec3d p001 = transform(matrices, x, y, z + sz);
        Vec3d p010 = transform(matrices, x, y + sy, z);
        Vec3d p011 = transform(matrices, x, y + sy, z + sz);
        Vec3d p100 = transform(matrices, x + sx, y, z);
        Vec3d p101 = transform(matrices, x + sx, y, z + sz);
        Vec3d p110 = transform(matrices, x + sx, y + sy, z);
        Vec3d p111 = transform(matrices, x + sx, y + sy, z + sz);

        Vec3d l000 = new Vec3d(x, y, z);
        Vec3d l001 = new Vec3d(x, y, z + sz);
        Vec3d l010 = new Vec3d(x, y + sy, z);
        Vec3d l011 = new Vec3d(x, y + sy, z + sz);
        Vec3d l100 = new Vec3d(x + sx, y, z);
        Vec3d l101 = new Vec3d(x + sx, y, z + sz);
        Vec3d l110 = new Vec3d(x + sx, y + sy, z);
        Vec3d l111 = new Vec3d(x + sx, y + sy, z + sz);

        emitLine(emitter, p000, p100, l000, l100, color);
        emitLine(emitter, p100, p110, l100, l110, color);
        emitLine(emitter, p110, p010, l110, l010, color);
        emitLine(emitter, p010, p000, l010, l000, color);
        emitLine(emitter, p001, p101, l001, l101, color);
        emitLine(emitter, p101, p111, l101, l111, color);
        emitLine(emitter, p111, p011, l111, l011, color);
        emitLine(emitter, p011, p001, l011, l001, color);
        emitLine(emitter, p000, p001, l000, l001, color);
        emitLine(emitter, p100, p101, l100, l101, color);
        emitLine(emitter, p110, p111, l110, l111, color);
        emitLine(emitter, p010, p011, l010, l011, color);
    }

    private void emitLine(WorldGeometryEmitter emitter, Vec3d start, Vec3d end, Vec3d localStart, Vec3d localEnd, int color) {
        WorldLineRenderer.line(emitter, start, end, Vec3d.ZERO, shade(color, localStart), shade(color, localEnd), currentLinePx);
    }

    private int shade(int color, Vec3d pos) {
        int alphaValue = ColorUtils.alpha(color);
        if ((ColorUtils.green(color) > 220 && ColorUtils.red(color) < 80)
                || (ColorUtils.red(color) > 245 && ColorUtils.green(color) < 80)) {
            return ColorUtils.injectAlpha(color, alphaValue);
        }

        float time = System.currentTimeMillis() * 0.001f * shaderSpeed.get();
        float sea1 = (float) Math.sin(pos.y * 3.2 + pos.x * 1.6 + time * 1.15f);
        float sea2 = (float) Math.sin(pos.z * 4.1 - pos.y * 1.4 + time * 0.82f + sea1 * waveStrength.get());
        float wave = MathHelper.clamp((sea1 * 0.55f + sea2 * 0.45f) * 0.5f + 0.5f, 0.0f, 1.0f);
        int gradient = ColorUtils.interpolate(ClientColors.GRADIENT_START.getRGB(), ClientColors.GRADIENT_END.getRGB(), wave);
        int shaded = ColorUtils.rgba(ColorUtils.red(gradient), ColorUtils.green(gradient), ColorUtils.blue(gradient), alphaValue);
        return currentLighten > 0f ? ColorUtils.lightenWithAlpha(shaded, currentLighten) : shaded;
    }

    private static MatrixStack cloneStack(MatrixStack source) {
        MatrixStack copy = new MatrixStack();
        copy.multiplyPositionMatrix(new Matrix4f(source.peek().getPositionMatrix()));
        copy.peek().getNormalMatrix().set(source.peek().getNormalMatrix());
        return copy;
    }

    private static Vec3d transform(MatrixStack matrices, double x, double y, double z) {
        Matrix4f matrix = matrices.peek().getPositionMatrix();
        Vector4f vec = new Vector4f((float) x, (float) y, (float) z, 1f);
        matrix.transform(vec);
        return new Vec3d(vec.x, vec.y, vec.z);
    }
}