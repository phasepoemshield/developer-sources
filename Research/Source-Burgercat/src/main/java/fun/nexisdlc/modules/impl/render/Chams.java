package fun.nexisdlc.modules.impl.render;

import fun.nexisdlc.Nexis;
import fun.nexisdlc.client.ClientColors;
import fun.nexisdlc.client.events.impl.render.EventRender;
import fun.nexisdlc.client.utils.eventbus.EventHandler;
import fun.nexisdlc.client.utils.render.color.basic.ColorUtils;
import fun.nexisdlc.client.utils.render.main.world.WorldGeometryEmitter;
import fun.nexisdlc.client.utils.render.main.world.WorldRenderLayers;
import fun.nexisdlc.client.utils.render.main.world.WorldRenderer;
import fun.nexisdlc.mixins.accessors.GameRendererAccessor;
import fun.nexisdlc.modules.api.Category;
import fun.nexisdlc.modules.api.Function;
import fun.nexisdlc.modules.api.FunctionAdd;
import fun.nexisdlc.modules.api.settings.impl.BooleanSetting;
import fun.nexisdlc.modules.api.settings.impl.ColorSetting;
import fun.nexisdlc.modules.api.settings.impl.ModeSetting;
import fun.nexisdlc.modules.api.settings.impl.SliderSetting;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.render.Camera;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerSkinType;
import net.minecraft.util.Arm;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RotationAxis;
import net.minecraft.util.math.Vec3d;
import org.joml.Matrix4f;
import org.joml.Vector4f;

import java.awt.Color;

@FunctionAdd(name = "Chams", alias = "Chams", category = Category.Render, description = "Подсвечивает игроков сквозь стены")
public class Chams extends Function {
    private static final String MODE_DEFAULT = "Обычный";
    private static final String MODE_GLOW = "Glow";
    private static final String MODE_SHADER = "Shader";
    private static final String MODE_SHADER2 = "Shader2";

    private final ModeSetting mode = new ModeSetting("Режим", MODE_DEFAULT, MODE_DEFAULT, MODE_GLOW, MODE_SHADER, MODE_SHADER2);
    private final ModeSetting colorMode = new ModeSetting("Цвет", "Из темы", "Из темы", "Свой");
    private final ColorSetting customColor = new ColorSetting("Свой цвет", new Color(133, 166, 255, 255).getRGB()).setVisible(() -> colorMode.is("Свой"));
    private final SliderSetting alpha = new SliderSetting("Прозрачность", 0.55f, 0.05f, 1.0f, 0.05f);
    private final SliderSetting brightness = new SliderSetting("Яркость", 0.85f, 0.1f, 1.5f, 0.05f);
    private final SliderSetting lineWidth = new SliderSetting("Толщина линий", 1.25f, 0.1f, 5.0f, 0.05f);
    private final BooleanSetting throughWalls = new BooleanSetting("Сквозь стены", true);
    private final BooleanSetting fill = new BooleanSetting("Заливка", true);
    private final BooleanSetting outline = new BooleanSetting("Обводка", true);
    private final BooleanSetting glow = new BooleanSetting("Свечение", true);
    private final SliderSetting glowIntensity = new SliderSetting("Сила свечения", 1.35f, 0.2f, 4.0f, 0.1f).setVisible(() -> glow.get() || mode.is(MODE_GLOW));
    private final SliderSetting glowLayers = new SliderSetting("Слои свечения", 3.0f, 1.0f, 6.0f, 1.0f).setVisible(() -> glow.get() || mode.is(MODE_GLOW));
    private final SliderSetting shaderSpeed = new SliderSetting("Скорость", 1.0f, 0.1f, 4.0f, 0.05f).setVisible(() -> mode.is(MODE_SHADER) || mode.is(MODE_SHADER2));
    private final SliderSetting distortion = new SliderSetting("Искажение", 1.0f, 0.0f, 3.0f, 0.05f).setVisible(() -> mode.is(MODE_SHADER2));
    private final BooleanSetting renderSelf = new BooleanSetting("Рендерить себя", false);

    public Chams() {
        addSettings(mode, colorMode, customColor, alpha, brightness, lineWidth, throughWalls, fill, outline, glow,
                glowIntensity, glowLayers, shaderSpeed, distortion, renderSelf);
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
            if (fill.get()) {
                RenderLayer fillLayer = throughWalls.get()
                        ? WorldRenderLayers.POSITION_COLOR_QUADS_TRANSLUCENT_NO_DEPTH()
                        : WorldRenderLayers.POSITION_COLOR_QUADS_TRANSLUCENT();
                WorldGeometryEmitter fillEmitter = new WorldGeometryEmitter(camera, new MatrixStack().peek(), renderer.getBuffer(fillLayer));
                for (AbstractClientPlayerEntity player : mc.world.getPlayers()) {
                    if (shouldRender(player)) renderPlayer(fillEmitter, cameraPos, player, tickDelta, false, 0f);
                }
                renderer.flush();
            }

            if (outline.get()) {
                RenderLayer lineLayer = throughWalls.get()
                        ? WorldRenderLayers.LINES_NO_DEPTH(lineWidth.get())
                        : WorldRenderLayers.LINES(lineWidth.get());
                WorldGeometryEmitter lineEmitter = renderer.lineEmitter(lineLayer);
                for (AbstractClientPlayerEntity player : mc.world.getPlayers()) {
                    if (shouldRender(player)) renderPlayer(lineEmitter, cameraPos, player, tickDelta, true, 0f);
                }
                renderer.flush();
            }

            if (glow.get() || mode.is(MODE_GLOW)) {
                RenderLayer glowLayer = throughWalls.get()
                        ? WorldRenderLayers.LINES_ADDITIVE_NO_DEPTH(lineWidth.get() + 0.35f)
                        : WorldRenderLayers.LINES_ADDITIVE(lineWidth.get() + 0.35f);
                WorldGeometryEmitter glowEmitter = renderer.lineEmitter(glowLayer);
                int layers = Math.max(1, Math.round(glowLayers.get()));
                for (int i = layers; i >= 1; i--) {
                    float expand = i * 0.45f * glowIntensity.get();
                    for (AbstractClientPlayerEntity player : mc.world.getPlayers()) {
                        if (shouldRender(player)) renderPlayer(glowEmitter, cameraPos, player, tickDelta, true, expand);
                    }
                }
                renderer.flush();
            }
        }
    }

    public boolean shouldCancelVanilla(LivingEntity entity) {
        return entity instanceof AbstractClientPlayerEntity player && shouldRender(player);
    }

    private boolean shouldRender(AbstractClientPlayerEntity player) {
        if (player == null || !player.isAlive() || player.isSpectator()) return false;
        if (player == mc.player && (!renderSelf.get() || mc.options.getPerspective().isFirstPerson())) return false;
        return mc.player.squaredDistanceTo(player) <= 160.0 * 160.0;
    }

    private void renderPlayer(WorldGeometryEmitter emitter, Vec3d cam, AbstractClientPlayerEntity player,
                              float tickDelta, boolean lines, float expand) {
        PlayerPose pose = buildPose(cam, player, tickDelta, lines, expand);
        emitBody(emitter, pose.matrices(), pose.swing(), pose.rightSwingX(), pose.leftSwingX(), pose.headYaw(), pose.pitch(),
                pose.slim(), pose.sneak(), pose.swim(), pose.limbPos(), pose.limbSpeed(), pose.idleTime(), pose.color(), lines, expand);
    }

    private PlayerPose buildPose(Vec3d cam, AbstractClientPlayerEntity player, float tickDelta, boolean lines, float expand) {
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

        int color = getPlayerColor(player, lines, expand);
        float rightSwingX = mainRight ? swingAngle : 0f;
        float leftSwingX = mainRight ? 0f : swingAngle;
        boolean slim = player.getSkin().model() == PlayerSkinType.SLIM;
        return new PlayerPose(matrices, swing, rightSwingX, leftSwingX, MathHelper.wrapDegrees(headYaw - bodyYaw), pitch,
                slim, player.isInSneakingPose(), player.isSwimming(), limbPos, limbSpeed, (player.age + tickDelta) * 0.05f, color);
    }

    private int getPlayerColor(AbstractClientPlayerEntity player, boolean lines, float expand) {
        int base = Nexis.getInstance().getFriendStorage().isFriend(player.getName().getString())
                ? new Color(27, 224, 27, 255).getRGB()
                : colorMode.is("Свой") ? customColor.get() : ClientColors.ICON.getRGB();
        if (mode.is(MODE_SHADER)) base = rainbow(player.age * 0.015f + player.getId() * 0.07f);
        if (mode.is(MODE_SHADER2)) base = fire(base, player.age * 0.03f + player.getId() * 0.11f);

        float bright = brightness.get();
        int r = Math.min(255, Math.round(ColorUtils.red(base) * bright));
        int g = Math.min(255, Math.round(ColorUtils.green(base) * bright));
        int b = Math.min(255, Math.round(ColorUtils.blue(base) * bright));
        int a = Math.max(1, Math.round(alpha.get() * 255f));
        if (lines) a = Math.min(255, Math.round((alpha.get() + 0.2f) * 255f));
        if (expand > 0f) a = Math.max(1, Math.round(alpha.get() * 70f / (expand + 1f)));
        return ColorUtils.rgba(r, g, b, a);
    }

    private int rainbow(float offset) {
        float hue = (System.currentTimeMillis() * 0.00012f * shaderSpeed.get() + offset) % 1.0f;
        return Color.HSBtoRGB(hue, 0.78f, 1.0f) | 0xFF000000;
    }

    private int fire(int base, float offset) {
        float wave = (MathHelper.sin(System.currentTimeMillis() * 0.004f * shaderSpeed.get() + offset) + 1f) * 0.5f;
        return ColorUtils.interpolate(ClientColors.GRADIENT_START.getRGB(), ClientColors.GRADIENT_END.getRGB(), wave);
    }

    private record PlayerPose(MatrixStack matrices, float swing, float rightSwingX, float leftSwingX, float headYaw,
                              float pitch, boolean slim, boolean sneak, boolean swim, float limbPos, float limbSpeed,
                              float idleTime, int color) {}

    private void emitBody(WorldGeometryEmitter emitter, MatrixStack m, float swing,
                          float rightSwingX, float leftSwingX,
                          float headYaw, float headPitch,
                          boolean slim, boolean sneak, boolean swim,
                          float limbPos, float limbSpeed, float idleTime,
                          int color, boolean lines, float expand) {
        float u = 1f / 16f;
        float armW = slim ? 3 : 4;
        float armSwayZ = MathHelper.sin(idleTime) * 0.04f + 0.03f * limbSpeed;
        float swimPhase = limbPos * 0.6662f;
        float swimCycle = MathHelper.sin(swimPhase) * limbSpeed;
        float swimKick = swim ? swimCycle * 0.4f : 0f;
        float ex = lines ? expand * u : 0f;

        MatrixStack part = cloneStack(m);
        if (sneak) {
            part.translate(0, 12 * u, 0);
            part.multiply(RotationAxis.POSITIVE_X.rotationDegrees(28.64f));
            part.translate(0, -12 * u, 0);
        }
        part.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(headYaw));
        part.multiply(RotationAxis.POSITIVE_X.rotationDegrees(headPitch));
        emitPart(emitter, part, -4 * u - ex, -8 * u - ex, -4 * u - ex, 8 * u + ex * 2, 8 * u + ex * 2, 8 * u + ex * 2, color, lines);

        part = cloneStack(m);
        if (sneak) {
            part.translate(0, 12 * u, 0);
            part.multiply(RotationAxis.POSITIVE_X.rotationDegrees(28.64f));
            part.translate(0, -12 * u, 0);
        }
        if (swim) {
            part.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(MathHelper.sin(limbPos * 0.3331f) * 3f * limbSpeed));
        }
        emitPart(emitter, part, -4 * u - ex, -ex, -2 * u - ex, 8 * u + ex * 2, 12 * u + ex * 2, 4 * u + ex * 2, color, lines);

        float swimArmX = swim ? swimCycle * 0.6f - (float) (Math.PI / 2f) : 0f;
        float rightArmX = swim ? swimArmX : swing;
        float leftArmX = swim ? swimArmX : -swing;
        float swimSpread = swim ? MathHelper.clamp(swimCycle, 0f, 1f) * (float) (Math.PI / 4f) : 0f;
        float rightArmZ = swim ? swimSpread : armSwayZ;
        float leftArmZ = swim ? -swimSpread : -armSwayZ;

        part = cloneStack(m);
        if (sneak) {
            part.translate(0, 12 * u, 0);
            part.multiply(RotationAxis.POSITIVE_X.rotationDegrees(28.64f));
            part.translate(0, -12 * u, 0);
        }
        part.translate(-4 * u, 0, 0);
        part.multiply(RotationAxis.POSITIVE_X.rotation(rightArmX + (swim ? 0 : rightSwingX)));
        part.multiply(RotationAxis.POSITIVE_Z.rotation(rightArmZ));
        emitPart(emitter, part, -armW * u - ex, -ex, -2 * u - ex, armW * u + ex * 2, 12 * u + ex * 2, 4 * u + ex * 2, color, lines);

        part = cloneStack(m);
        if (sneak) {
            part.translate(0, 12 * u, 0);
            part.multiply(RotationAxis.POSITIVE_X.rotationDegrees(28.64f));
            part.translate(0, -12 * u, 0);
        }
        part.translate(4 * u, 0, 0);
        part.multiply(RotationAxis.POSITIVE_X.rotation(leftArmX + (swim ? 0 : leftSwingX)));
        part.multiply(RotationAxis.POSITIVE_Z.rotation(leftArmZ));
        emitPart(emitter, part, -ex, -ex, -2 * u - ex, armW * u + ex * 2, 12 * u + ex * 2, 4 * u + ex * 2, color, lines);

        part = cloneStack(m);
        part.translate(-2 * u, 12 * u, 0);
        part.multiply(RotationAxis.POSITIVE_X.rotation(swim ? -swimKick : -swing));
        emitPart(emitter, part, -2 * u - ex, -ex, -2 * u - ex, 4 * u + ex * 2, 12 * u + ex * 2, 4 * u + ex * 2, color, lines);

        part = cloneStack(m);
        part.translate(2 * u, 12 * u, 0);
        part.multiply(RotationAxis.POSITIVE_X.rotation(swim ? swimKick : swing));
        emitPart(emitter, part, -2 * u - ex, -ex, -2 * u - ex, 4 * u + ex * 2, 12 * u + ex * 2, 4 * u + ex * 2, color, lines);
    }

    private void emitPart(WorldGeometryEmitter emitter, MatrixStack matrices,
                          float x, float y, float z, float sx, float sy, float sz, int color, boolean lines) {
        if (lines) {
            emitBoxLines(emitter, matrices, x, y, z, sx, sy, sz, color);
        } else {
            emitBox(emitter, matrices, x, y, z, sx, sy, sz, color);
        }
    }

    private static MatrixStack cloneStack(MatrixStack source) {
        MatrixStack copy = new MatrixStack();
        copy.multiplyPositionMatrix(new Matrix4f(source.peek().getPositionMatrix()));
        copy.peek().getNormalMatrix().set(source.peek().getNormalMatrix());
        return copy;
    }

    private void emitBox(WorldGeometryEmitter emitter, MatrixStack matrices,
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

        emitter.emitQuad(p000, p100, p110, p010, shade(color, l000), shade(color, l100), shade(color, l110), shade(color, l010));
        emitter.emitQuad(p001, p011, p111, p101, shade(color, l001), shade(color, l011), shade(color, l111), shade(color, l101));
        emitter.emitQuad(p000, p001, p101, p100, shade(color, l000), shade(color, l001), shade(color, l101), shade(color, l100));
        emitter.emitQuad(p010, p110, p111, p011, shade(color, l010), shade(color, l110), shade(color, l111), shade(color, l011));
        emitter.emitQuad(p000, p010, p011, p001, shade(color, l000), shade(color, l010), shade(color, l011), shade(color, l001));
        emitter.emitQuad(p100, p101, p111, p110, shade(color, l100), shade(color, l101), shade(color, l111), shade(color, l110));
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
        emitter.emitLine(start, end, shade(color, localStart), shade(color, localEnd));
    }

    private int shade(int color, Vec3d pos) {
        if (!mode.is(MODE_SHADER) && !mode.is(MODE_SHADER2)) {
            return color;
        }
        int alpha = ColorUtils.alpha(color);
        float time = System.currentTimeMillis() * 0.001f * shaderSpeed.get();
        if (mode.is(MODE_SHADER)) {
            float wave = (float) (Math.sin((pos.x * 1.7 + pos.y * 2.8 + pos.z * 1.3) + time * 1.8) * 0.5 + 0.5);
            float hue = (time * 0.08f + (float) pos.y * 0.22f + wave * 0.18f) % 1.0f;
            int rgb = Color.HSBtoRGB(hue, 0.78f, Math.min(1.0f, 0.55f + shaderSpeed.get() * 0.15f + wave * 0.35f));
            return ColorUtils.rgba(ColorUtils.red(rgb), ColorUtils.green(rgb), ColorUtils.blue(rgb), alpha);
        }

        float sea1 = (float) Math.sin(pos.y * 3.2 + pos.x * 1.6 + time * 1.15f);
        float sea2 = (float) Math.sin(pos.z * 4.1 - pos.y * 1.4 + time * 0.82f + sea1 * distortion.get());
        float wave = MathHelper.clamp((sea1 * 0.55f + sea2 * 0.45f) * 0.5f + 0.5f, 0.0f, 1.0f);
        int gradient = ColorUtils.interpolate(ClientColors.GRADIENT_START.getRGB(), ClientColors.GRADIENT_END.getRGB(), wave);
        return ColorUtils.rgba(ColorUtils.red(gradient), ColorUtils.green(gradient), ColorUtils.blue(gradient), alpha);
    }

    private static Vec3d transform(MatrixStack matrices, double x, double y, double z) {
        Matrix4f matrix = matrices.peek().getPositionMatrix();
        Vector4f vec = new Vector4f((float) x, (float) y, (float) z, 1f);
        matrix.transform(vec);
        return new Vec3d(vec.x, vec.y, vec.z);
    }
}
