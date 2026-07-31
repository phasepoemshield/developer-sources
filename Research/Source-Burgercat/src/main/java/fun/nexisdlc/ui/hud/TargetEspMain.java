package fun.nexisdlc.ui.hud;

import fun.nexisdlc.Nexis;
import fun.nexisdlc.client.ClientColors;
import fun.nexisdlc.client.events.impl.render.EventRender;
import fun.nexisdlc.client.utils.render.animations.impl.SimpleLinearAnimation;
import fun.nexisdlc.client.utils.render.color.basic.ColorUtils;
import fun.nexisdlc.client.utils.render.main.world.WorldGeometryEmitter;
import fun.nexisdlc.client.utils.render.main.world.WorldRenderLayers;
import fun.nexisdlc.client.utils.render.main.world.WorldRenderer;
import fun.nexisdlc.mixins.accessors.GameRendererAccessor;
import fun.nexisdlc.modules.api.settings.impl.ModeSetting;
import fun.nexisdlc.modules.api.settings.impl.SliderSetting;
import fun.nexisdlc.modules.impl.combat.AimBot;
import fun.nexisdlc.modules.impl.combat.AuraModule;
import fun.nexisdlc.modules.impl.combat.ThrowableAim;
import fun.nexisdlc.modules.impl.render.TargetESP;
import fun.nexisdlc.ui.hud.api.HudElement;
import net.minecraft.client.render.Camera;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.RotationAxis;
import net.minecraft.util.math.Vec3d;
import org.joml.Matrix4f;
import org.joml.Vector4f;

import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class TargetEspMain implements HudElement {
    private static final Identifier SOUL_TEXTURE = Identifier.of("nexis", "images/etc/bloom.png");
    private static final Identifier STAR_TEXTURE = Identifier.of("nexis", "images/etc/starnew.png");
    private static final Identifier CHAIN_TEXTURE = Identifier.of("nexis", "images/targetesp/chain.png");
    private static final long HURT_FLASH_HALF_MS = 150L;
    private static final long PRIV_COLOR_CYCLE_MS = 2000L;
    private static final long MODE_ERROR_LOG_INTERVAL_MS = 3000L;
    private static final float[] PRIV_BASE_ANGLES = {45f, 135f, 225f, 315f};
    private static final float HURT_PULSE_MAX_SCALE = 1.2f;
    private static final long HURT_PULSE_RISE_MS = 80L;
    private static final long HURT_PULSE_HOLD_MS = 250L;
    private static final long HURT_PULSE_FALL_MS = 80L;
    private static final java.util.Map<String, Long> MODE_ERROR_LOG_TIME = new java.util.concurrent.ConcurrentHashMap<>();
    private static final long KOLCO_STAR_LIFETIME_MS = 520L;
    private static final long KOLCO_STAR_SPAWN_INTERVAL_MS = 55L;
    private static final Random KOLCO_RANDOM = new Random();

    public static ModeSetting targetEspType = new ModeSetting("Target ESP", "Шейдер", "Шейдер", "Квадрат", "Цепи", "Кристалы", "Кристалы Новые");
    public static ModeSetting imageType = new ModeSetting("Image", "Нет", "Нет", "Квадрат", "Полу квадрат");
    public static ModeSetting shaderType = new ModeSetting("Shader", "Нет", "Нет", "Призраки", "Души", "Души 2", "Колечко");
    public static SliderSetting sizeDush = new SliderSetting("Size", 0.22f, 0.1f, 0.4f, 0.01f);
    public static SliderSetting dlinaDush = new SliderSetting("Length", 6f, 1f, 12f, 0.1f);
    public static SliderSetting factorDush = new SliderSetting("Factor", 12f, 0f, 22f, 0.1f);
    public static SliderSetting particleDensityDush = new SliderSetting("Density", 1.7f, 1f, 3f, 0.1f);
    public static SliderSetting chainSpeed = new SliderSetting("Chain Speed", 1.0f, 0.1f, 3.0f, 0.1f);

    private final SimpleLinearAnimation alphaAnim = new SimpleLinearAnimation(400);
    private float currentAlpha = 0.0f;
    private float targetAlpha = 0.0f;
    private long lastAlphaUpdate = 0;
    private static final float ALPHA_ANIMATION_SPEED = 2.0f;
    private float rotationAngle = 0.0f;
    private long lastRotationUpdate = 0;
    private float currentScale = 0.0f;
    private float targetScale = 0.0f;
    private Vec3d lastTargetPos = null;
    private float lastCircleStep;
    private float circleStep;
    private final List<KolcoStarParticle> kolcoStars = new ArrayList<>();
    private long lastKolcoStarSpawnMs;

    private LivingEntity lastTarget;
    private LivingEntity lastHurtTarget;
    private int lastHurtTime;
    private long lastHurtAt;
    private int lastHurtPulseHurtTime;
    private long hurtPulseAnimStartMs;
    private float hurtPulseIntensity;

    private Vec3d previousTargetPos = null;
    private Vec3d currentMovementDirection = null;
    private double movementSpeed = 0.0;
    private long lastMovementUpdate = 0;
    private static final double MOVEMENT_THRESHOLD = 0.01;
    private static final long MOVEMENT_UPDATE_INTERVAL = 50;

    private static boolean isAimBotActive() {
        var manager = Nexis.getFunctionManager();
        return manager != null && manager.getAimBot() != null && manager.getAimBot().isState();
    }

    private static boolean isAuraEspActive() {
        var manager = Nexis.getFunctionManager();
        return manager != null && manager.getAttackAura() != null && manager.getAttackAura().isState();
    }

    private static boolean isThrowableAimEspActive() {
        var manager = Nexis.getFunctionManager();
        return manager != null && manager.getThrowableAim() != null && manager.getThrowableAim().isState();
    }

    private static void syncActiveSettings() {
        var manager = Nexis.getFunctionManager();
        TargetESP settings = manager == null ? null : manager.getTargetESP();
        if (settings == null) {
            return;
        }

        targetEspType = settings.targetEspType;
        imageType = settings.imageType;
        shaderType = settings.shaderType;
        sizeDush = settings.sizeDush;
        dlinaDush = settings.dlinaDush;
        factorDush = settings.factorDush;
        particleDensityDush = settings.particleDensityDush;
        chainSpeed = settings.chainSpeed;
    }

    private LivingEntity getActiveTarget() {
        syncActiveSettings();

        if (isAimBotActive()) {
            LivingEntity aimbotTarget = AimBot.getTarget();
            if (aimbotTarget != null) {
                return aimbotTarget;
            }
        }

        if (isAuraEspActive()) {
            LivingEntity auraTarget = AuraModule.getTarget();
            if (auraTarget != null) {
                return auraTarget;
            }
        }

        if (isThrowableAimEspActive()) {
            var manager = Nexis.getFunctionManager();
            LivingEntity throwableAimTarget = manager != null && manager.getThrowableAim() != null ? ThrowableAim.target : null;
            if (throwableAimTarget != null) {
                return throwableAimTarget;
            }
        }

        return null;
    }

    @Override
    public void render(EventRender.Screen.Hud event) {
        if (mc.world == null)
            return;
    }

    public void renderWorld(EventRender.World event) {
        if (mc.world == null)
            return;

        LivingEntity currentTarget = getActiveTarget();
        updateTargetState(currentTarget, event.getTicks());
        updateAlpha();
        updateRotation();

        boolean shaderActive = targetEspType.is("Шейдер");
        boolean imageActive = targetEspType.is("Квадрат");
        boolean chainsActive = targetEspType.is("Цепи");
        boolean crystalsActive = targetEspType.is("Кристалы");
        boolean crystalsNewActive = targetEspType.is("Кристалы Новые");

        boolean hasImageMode = imageActive && !imageType.is("Нет");
        boolean hasGhostsMode = shaderActive && shaderType.is("Призраки");
        boolean hasPrivMode = shaderActive && shaderType.is("Души");
        boolean hasPriv2Mode = shaderActive && shaderType.is("Души 2");
        boolean hasKolcoMode = shaderActive && shaderType.is("Колечко");
        boolean hasChainsMode = chainsActive;
        boolean hasCrystalsMode = crystalsActive;
        boolean hasCrystalsNewMode = crystalsNewActive;

        boolean active = currentTarget != null && (hasImageMode || hasGhostsMode || hasPrivMode || hasPriv2Mode
                || hasKolcoMode || hasChainsMode || hasCrystalsMode || hasCrystalsNewMode);

        if (active) {
            alphaAnim.show();
            lastTarget = currentTarget;
        } else {
            alphaAnim.hide();
        }

        float alpha = alphaAnim.getProgress();
        if (alpha <= 0f) {
            lastTarget = null;
            return;
        }

        LivingEntity renderTarget = active ? currentTarget : lastTarget;
        if (renderTarget == null) {
            return;
        }

        if (hasGhostsMode) {
            safeRenderMode("ghosts", () -> renderGhostsWorld(event, renderTarget, alpha));
        }
        if (hasPrivMode) {
            safeRenderMode("souls", () -> renderPrivWorld(event, renderTarget, alpha));
        }
        if (hasPriv2Mode) {
            safeRenderMode("souls2", () -> renderCircleParticlesWorld(event, renderTarget, alpha));
        }
        if (hasKolcoMode) {
            safeRenderMode("ring", () -> renderKolcoWorld(event, renderTarget, alpha));
        }
        if (hasImageMode) {
            safeRenderMode("image", () -> renderTargetEspWorld(event, renderTarget, alpha));
        }
        if (hasChainsMode) {
            safeRenderMode("chains", () -> renderChainsWorld(event, renderTarget, alpha));
        }
        if (hasCrystalsMode) {
            safeRenderMode("crystals", () -> renderCrystalWorld(event, renderTarget, alpha, false));
        }
        if (hasCrystalsNewMode) {
            safeRenderMode("crystals_new", () -> renderCrystalWorld(event, renderTarget, alpha, true));
        }
    }

    private void safeRenderMode(String modeKey, Runnable renderCall) {
        try {
            renderCall.run();
        } catch (Throwable t) {
            logModeErrorThrottled(modeKey, t);
        }
    }

    private void logModeErrorThrottled(String modeKey, Throwable throwable) {
        long now = System.currentTimeMillis();
        Long lastLog = MODE_ERROR_LOG_TIME.get(modeKey);
        if (lastLog != null && now - lastLog < MODE_ERROR_LOG_INTERVAL_MS) {
            return;
        }
        MODE_ERROR_LOG_TIME.put(modeKey, now);
        String message = throwable.getMessage();
        System.err.println("[TargetEsp] Render mode '" + modeKey + "' failed: "
                + (message == null ? throwable.getClass().getSimpleName() : message));
    }

    public void onWorldChange() {
    }

    private void updateTargetState(LivingEntity target, float ticks) {
        if (target == null || mc.player.distanceTo(target) > 50) {
            targetAlpha = 0.0f;
            targetScale = 0.0f;
        } else {
            targetAlpha = 1.0f;
            targetScale = 1.0f;

            Vec3d newTargetPos = new Vec3d(
                    target.lastX + (target.getX() - target.lastX) * ticks,
                    target.lastY + (target.getY() - target.lastY) * ticks + target.getHeight() / 2,
                    target.lastZ + (target.getZ() - target.lastZ) * ticks);

            updateMovementTracking(newTargetPos);

            lastTargetPos = newTargetPos;
        }
    }

    private void updateMovementTracking(Vec3d currentPos) {
        long currentTime = System.currentTimeMillis();

        if (currentTime - lastMovementUpdate > MOVEMENT_UPDATE_INTERVAL) {
            if (previousTargetPos != null) {
                Vec3d movementVector = currentPos.subtract(previousTargetPos);

                movementSpeed = movementVector.length() / (MOVEMENT_UPDATE_INTERVAL / 1000.0);

                if (movementSpeed > MOVEMENT_THRESHOLD) {
                    currentMovementDirection = movementVector.normalize();
                } else {
                    if (currentMovementDirection == null) {
                        currentMovementDirection = new Vec3d(0, 0, 0);
                    }
                }
            }

            previousTargetPos = currentPos;
            lastMovementUpdate = currentTime;
        }
    }

    private void updateAlpha() {
        long currentTime = System.currentTimeMillis();
        float deltaTime = (currentTime - lastAlphaUpdate) / 1000.0f;
        lastAlphaUpdate = currentTime;

        float change = deltaTime * ALPHA_ANIMATION_SPEED;
        currentAlpha = Math.max(0.0f, Math.min(1.0f, currentAlpha + (currentAlpha < targetAlpha ? change : -change)));
        currentScale = Math.max(0.0f, Math.min(1.0f, currentScale + (currentScale < targetScale ? change : -change)));
    }

    private void updateRotation() {
        long currentTime = System.currentTimeMillis();
        float cycleProgress = (currentTime % 3660) / 3660.0f;
        boolean isRightPhase = cycleProgress < 0.5f;
        float phaseProgress = cycleProgress % 0.5f / 0.5f;

        float rotationPhase = 1.5f / 1.53f;
        float progress = phaseProgress > rotationPhase ? 1.0f : phaseProgress / rotationPhase;
        float easedProgress = 0.5f - 0.5f * (float) Math.cos(progress * Math.PI);

        rotationAngle = (isRightPhase ? easedProgress : 1.0f - easedProgress) * 720.0f;
        lastRotationUpdate = currentTime;
    }

    private void renderTargetEspWorld(EventRender.World event, LivingEntity target, float alpha) {
        if (imageType.is("Нет"))
            return;
        if (lastTargetPos == null)
            return;

        MatrixStack stack = event.getMatrixStack();
        Camera camera = mc.gameRenderer.getCamera();
        float tickDelta = event.getTicks();
        float fov = ((GameRendererAccessor) mc.gameRenderer).invokeGetFov(camera, tickDelta, true);

        int baseStart = ClientColors.ICON.getRGB();
        int baseEnd = ClientColors.ICON.getRGB();
        float flash = getHurtFlash(target);
        int tintStart = applyDamageTint(baseStart, flash);
        int tintEnd = applyDamageTint(baseEnd, flash);
        int a = Math.max(0, Math.min(255, Math.round(alpha * 255f)));
        int colorStart = ColorUtils.rgba(ColorUtils.red(tintStart), ColorUtils.green(tintStart),
                ColorUtils.blue(tintStart), a);
        int colorEnd = ColorUtils.rgba(ColorUtils.red(tintEnd), ColorUtils.green(tintEnd), ColorUtils.blue(tintEnd), a);
        int colorStartSoft = ColorUtils.rgba(ColorUtils.red(tintStart), ColorUtils.green(tintStart),
                ColorUtils.blue(tintStart), Math.max(0, Math.min(255, Math.round(a * 0.8f))));
        int colorEndSoft = ColorUtils.rgba(ColorUtils.red(tintEnd), ColorUtils.green(tintEnd), ColorUtils.blue(tintEnd),
                Math.max(0, Math.min(255, Math.round(a * 0.8f))));

        try (WorldRenderer renderer = WorldRenderer.begin(mc, mc.getRenderTickCounter(), camera,
                stack.peek().getPositionMatrix(), mc.gameRenderer.getBasicProjectionMatrix(fov))) {
            Identifier textureId = getImageIdentifier();
            VertexConsumer consumer = renderer.getBuffer(WorldRenderLayers.TEXTURED_QUADS_ADDITIVE_NO_DEPTH(textureId));
            MatrixStack identity = new MatrixStack();
            WorldGeometryEmitter emitter = new WorldGeometryEmitter(camera, identity.peek(), consumer);

            MatrixStack matrices = new MatrixStack();
            Vec3d cameraPos = camera.getCameraPos();
            double tX = lastTargetPos.x - cameraPos.x;
            double tY = lastTargetPos.y - cameraPos.y;
            double tZ = lastTargetPos.z - cameraPos.z;
            matrices.translate(tX, tY, tZ);
            matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(-camera.getYaw()));
            matrices.multiply(RotationAxis.POSITIVE_X.rotationDegrees(camera.getPitch()));
            matrices.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(rotationAngle));

            float hurtScale = getHurtPulseScale(target);
            float baseSize = imageType.is("Полу квадрат") ? 0.97f : 1.07f;
            float size = baseSize * hurtScale;
            matrices.scale(size, size, size);
            matrices.translate(-0.5f, -0.5f, 0f);

            Matrix4f localTransform = matrices.peek().getPositionMatrix();
            Vec3d v0 = transform(localTransform, 0, 1, 0);
            Vec3d v1 = transform(localTransform, 1, 1, 0);
            Vec3d v2 = transform(localTransform, 1, 0, 0);
            Vec3d v3 = transform(localTransform, 0, 0, 0);

            emitter.emitTexturedQuad(
                    v0, v1, v2, v3,
                    0f, 1f,
                    1f, 1f,
                    1f, 0f,
                    0f, 0f,
                    colorStart, colorEnd, colorStart, colorEnd);
            emitter.emitTexturedQuad(
                    v0, v1, v2, v3,
                    0f, 1f,
                    1f, 1f,
                    1f, 0f,
                    0f, 0f,
                    colorStartSoft, colorEndSoft, colorStartSoft, colorEndSoft);

            renderer.flush();
        }
    }

    private Identifier getImageIdentifier() {
        if (imageType.is("Квадрат")) {
            return Identifier.of("nexis", "images/targetesp/target2.png");
        } else if (imageType.is("Полу квадрат")) {
            return Identifier.of("nexis", "images/targetesp/target1.png");
        } else {
            return Identifier.of("nexis", "images/targetesp/target1.png");
        }
    }

    private Vec3d getTargetCenter(LivingEntity target) {
        float tickDelta = mc.getRenderTickCounter().getTickProgress(true);

        double x = lerp(target.lastX, target.getX(), tickDelta);
        double y = lerp(target.lastY, target.getY(), tickDelta) + target.getHeight() * 0.5f;
        double z = lerp(target.lastZ, target.getZ(), tickDelta);
        return new Vec3d(x, y, z);
    }

    private float getHurtFlash(LivingEntity target) {
        if (target == null) {
            return 0f;
        }
        if (target != lastHurtTarget) {
            lastHurtTarget = target;
            lastHurtTime = 0;
            lastHurtAt = 0L;
        }

        int currentHurt = target.hurtTime;
        if (currentHurt > lastHurtTime) {
            lastHurtAt = System.currentTimeMillis();
        }
        lastHurtTime = currentHurt;

        if (lastHurtAt <= 0L) {
            return 0f;
        }
        long elapsed = System.currentTimeMillis() - lastHurtAt;
        long total = HURT_FLASH_HALF_MS * 2L;
        if (elapsed < 0L || elapsed > total) {
            return 0f;
        }

        float t = elapsed / (float) total;
        float phase = t < 0.5f ? t / 0.5f : 1f - ((t - 0.5f) / 0.5f);
        return smoothstep(smoothstep(phase));
    }

    private int applyDamageTint(int baseColor, float factor) {
        if (factor <= 0f) {
            return baseColor;
        }
        int a = (baseColor >>> 24) & 0xFF;
        int r = (baseColor >>> 16) & 0xFF;
        int g = (baseColor >>> 8) & 0xFF;
        int b = baseColor & 0xFF;
        int nr = Math.min(255, (int) (r + (255 - r) * factor));
        int ng = Math.max(0, (int) (g * (1f - factor)));
        int nb = Math.max(0, (int) (b * (1f - factor)));
        return (a << 24) | (nr << 16) | (ng << 8) | nb;
    }

    private float getHurtPulseScale(LivingEntity target) {
        if (target == null) return 1.0f;

        int currentHurt = target.hurtTime;
        if (currentHurt > lastHurtPulseHurtTime && currentHurt > 0) {
            hurtPulseAnimStartMs = System.currentTimeMillis();
            hurtPulseIntensity = Math.min(currentHurt / 11f, 1.0f);
        }
        lastHurtPulseHurtTime = currentHurt;

        if (hurtPulseAnimStartMs == 0) return 1.0f;

        long elapsed = System.currentTimeMillis() - hurtPulseAnimStartMs;
        long riseEnd = HURT_PULSE_RISE_MS;
        long holdEnd = riseEnd + HURT_PULSE_HOLD_MS;
        long total = holdEnd + HURT_PULSE_FALL_MS;

        if (elapsed >= total) {
            hurtPulseAnimStartMs = 0L;
            return 1.0f;
        }

        if (elapsed < riseEnd) {
            float t = elapsed / (float) HURT_PULSE_RISE_MS;
            return 1.0f + (HURT_PULSE_MAX_SCALE - 1.0f) * t * hurtPulseIntensity;
        } else if (elapsed < holdEnd) {
            return 1.0f + (HURT_PULSE_MAX_SCALE - 1.0f) * hurtPulseIntensity;
        } else {
            float t = (elapsed - holdEnd) / (float) HURT_PULSE_FALL_MS;
            float animT = 1.0f - t;
            return 1.0f + (HURT_PULSE_MAX_SCALE - 1.0f) * animT * hurtPulseIntensity;
        }
    }

    private float smoothstep(float t) {
        if (t <= 0f) {
            return 0f;
        }
        if (t >= 1f) {
            return 1f;
        }
        return t * t * (3f - 2f * t);
    }

    private static double lerp(double start, double end, float t) {
        return start + (end - start) * t;
    }

    public void renderCircleParticles(EventRender.World event, LivingEntity target, float alpha) {

        float espLength = 5.5f;
        float factor = factorDush.get();
        float particleDensity = 10;

        MatrixStack stack = event.getMatrixStack();
        Camera camera = mc.gameRenderer.getCamera();
        float tickDelta = event.getTicks();
        float fov = ((GameRendererAccessor) mc.gameRenderer).invokeGetFov(camera, tickDelta, true);

        int baseAlpha = Math.max(0, Math.min(255, Math.round(alpha * 255f)));
        int rFirst = ClientColors.GRADIENT_START.getRGB() >> 16 & 0xFF;
        int gFirst = ClientColors.GRADIENT_START.getRGB() >> 8 & 0xFF;
        int bFirst = ClientColors.GRADIENT_START.getRGB() & 0xFF;
        int rTwin = ClientColors.GRADIENT_END.getRGB() >> 16 & 0xFF;
        int gTwin = ClientColors.GRADIENT_END.getRGB() >> 8 & 0xFF;
        int bTwin = ClientColors.GRADIENT_END.getRGB() & 0xFF;

        float time = (float) (System.currentTimeMillis() % 2000) / 2000.0f;
        float phaseShift = (float) (2.0 * Math.PI / 4.0);

        float fixedRadius = target.getWidth() * 0.8f;
        float verticalOffset = (float) (Math.sin(time * Math.PI * 2) * 0.5);
        float rotationAngle = time * (float) Math.PI * 2;

        try (WorldRenderer renderer = WorldRenderer.begin(mc, mc.getRenderTickCounter(), camera,
                stack.peek().getPositionMatrix(), mc.gameRenderer.getBasicProjectionMatrix(fov))) {

            VertexConsumer consumer = renderer
                    .getBuffer(WorldRenderLayers.TEXTURED_QUADS_ADDITIVE_NO_DEPTH(SOUL_TEXTURE));
            MatrixStack identity = new MatrixStack();
            WorldGeometryEmitter emitter = new WorldGeometryEmitter(camera, identity.peek(), consumer);

            double tPosX = lerp(target.lastX, target.getX(), tickDelta) - camera.getCameraPos().x;
            double tPosY = lerp(target.lastY, target.getY(), tickDelta) - camera.getCameraPos().y;
            double tPosZ = lerp(target.lastZ, target.getZ(), tickDelta) - camera.getCameraPos().z;
            float iAge = (float) lerp(target.age - 1, target.age, tickDelta);

            for (int j = 0; j < 4; j++) {
                float baseAngle = (j * 90f + rotationAngle * 180f / (float) Math.PI) % 360f;

                float colorLerp = (float) (Math.sin(2.0 * Math.PI * time + j * phaseShift) * 0.5 + 0.5);

                int r = (int) (rFirst + (rTwin - rFirst) * colorLerp);
                int g = (int) (gFirst + (gTwin - gFirst) * colorLerp);
                int b = (int) (bFirst + (bTwin - bFirst) * colorLerp);

                int particleCount = (int) (espLength * particleDensity);

                for (int i = 0; i < particleCount; i++) {
                    float offset = (float) i / particleCount;
                    double radians = Math.toRadians((baseAngle + (offset * espLength + iAge) * 9.5f) % 360);
                    double sinQuad = verticalOffset;

                    float alphaFactor = 1.0f - offset * 0.3f;
                    int gradientAlpha = (int) (baseAlpha * alphaFactor);

                    float scale = 1 * 0.11f;

                    MatrixStack matrices = new MatrixStack();
                    matrices.translate(
                            tPosX + Math.cos(radians) * fixedRadius,
                            tPosY + 1 + sinQuad,
                            tPosZ + Math.sin(radians) * fixedRadius);
                    matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(-camera.getYaw()));
                    matrices.multiply(RotationAxis.POSITIVE_X.rotationDegrees(camera.getPitch()));

                    int color = ColorUtils.rgba(r, g, b, gradientAlpha);
                    Matrix4f localTransform = matrices.peek().getPositionMatrix();
                    Vec3d v0 = transform(localTransform, -scale, scale, 0);
                    Vec3d v1 = transform(localTransform, scale, scale, 0);
                    Vec3d v2 = transform(localTransform, scale, -scale, 0);
                    Vec3d v3 = transform(localTransform, -scale, -scale, 0);

                    emitter.emitTexturedQuad(
                            v0, v1, v2, v3,
                            0f, 1f,
                            1f, 1f,
                            1f, 0f,
                            0f, 0f,
                            color);
                }
            }

            renderer.flush();
        }
    }

    private void renderGhostsWorld(EventRender.World event, Entity target, float alpha) {
        if (!shaderType.is("Призраки"))
            return;

        float espLength = dlinaDush.get();
        float factor = factorDush.get();
        float shaking = 1.32f;
        float amplitude = 3f;

        MatrixStack stack = event.getMatrixStack();
        Camera camera = mc.gameRenderer.getCamera();
        float tickDelta = event.getTicks();
        float fov = ((GameRendererAccessor) mc.gameRenderer).invokeGetFov(camera, tickDelta, true);
        double timeSeconds = System.currentTimeMillis() * 0.001;
        double iAge = timeSeconds * 20.0;

        int baseAlpha = Math.max(0, Math.min(255, Math.round(alpha * 255f)));
        int rFirst = ClientColors.GRADIENT_START.getRGB() >> 16 & 0xFF;
        int gFirst = ClientColors.GRADIENT_START.getRGB() >> 8 & 0xFF;
        int bFirst = ClientColors.GRADIENT_START.getRGB() & 0xFF;
        int rTwin = ClientColors.GRADIENT_END.getRGB() >> 16 & 0xFF;
        int gTwin = ClientColors.GRADIENT_END.getRGB() >> 8 & 0xFF;
        int bTwin = ClientColors.GRADIENT_END.getRGB() & 0xFF;

        float time = (float) (System.currentTimeMillis() % 2000) / 2000.0f;
        float phaseShift = (float) (2.0 * Math.PI / 4.0);
        float particleDensity = particleDensityDush.get();
        float[] angles = {45f, 135f, 225f, 315f};
        try (WorldRenderer renderer = WorldRenderer.begin(mc, mc.getRenderTickCounter(), camera,
                stack.peek().getPositionMatrix(), mc.gameRenderer.getBasicProjectionMatrix(fov))) {
            VertexConsumer consumer = renderer
                    .getBuffer(WorldRenderLayers.TEXTURED_QUADS_ADDITIVE_NO_DEPTH(SOUL_TEXTURE));
            MatrixStack identity = new MatrixStack();
            WorldGeometryEmitter emitter = new WorldGeometryEmitter(camera, identity.peek(), consumer);

            double tPosX = lerp(target.lastX, target.getX(), tickDelta) - camera.getCameraPos().x;
            double tPosY = lerp(target.lastY, target.getY(), tickDelta) - camera.getCameraPos().y;
            double tPosZ = lerp(target.lastZ, target.getZ(), tickDelta) - camera.getCameraPos().z;

            for (int j = 0; j < 4; j++) {
                float colorLerp = (float) (Math.sin(2.0 * Math.PI * time + j * phaseShift) * 0.5 + 0.5);

                int r = (int) (rFirst + (rTwin - rFirst) * colorLerp);
                int g = (int) (gFirst + (gTwin - gFirst) * colorLerp);
                int b = (int) (bFirst + (bTwin - bFirst) * colorLerp);
                int particleCount = (int) (espLength * particleDensity);

                for (int i = 0; i < particleCount; i++) {
                    float offset = (float) i / particleCount;
                    double radians = Math.toRadians((angles[j] + (offset * espLength + iAge) * factor) % 360);
                    double sinQuad = Math
                            .sin(Math.toRadians(iAge * 2.5 + offset * espLength * 2.0 + j * 90) * amplitude) / shaking;

                    float alphaFactor = 1.0f - offset * 0.3f;
                    int gradientAlpha = (int) (baseAlpha * alphaFactor);
                    float scale = sizeDush.get();

                    MatrixStack matrices = new MatrixStack();
                    matrices.translate(
                            tPosX + Math.cos(radians) * target.getWidth(),
                            tPosY + 1 + sinQuad,
                            tPosZ + Math.sin(radians) * target.getWidth());
                    matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(-camera.getYaw()));
                    matrices.multiply(RotationAxis.POSITIVE_X.rotationDegrees(camera.getPitch()));

                    int color = ColorUtils.rgba(r, g, b, gradientAlpha);
                    Matrix4f localTransform = matrices.peek().getPositionMatrix();
                    Vec3d v0 = transform(localTransform, -scale, scale, 0);
                    Vec3d v1 = transform(localTransform, scale, scale, 0);
                    Vec3d v2 = transform(localTransform, scale, -scale, 0);
                    Vec3d v3 = transform(localTransform, -scale, -scale, 0);

                    emitter.emitTexturedQuad(
                            v0, v1, v2, v3,
                            0f, 1f,
                            1f, 1f,
                            1f, 0f,
                            0f, 0f,
                            color);
                }
            }

            renderer.flush();
        }
    }

    private void renderPrivWorld(EventRender.World event, Entity target, float alpha) {
        if (!shaderType.is("Души"))
            return;

        float espLength = dlinaDush.get();
        float factor = factorDush.get();
        float shaking = 1.32f;
        float amplitude = 3f;

        MatrixStack stack = event.getMatrixStack();
        Camera camera = mc.gameRenderer.getCamera();
        float tickDelta = event.getTicks();
        float fov = ((GameRendererAccessor) mc.gameRenderer).invokeGetFov(camera, tickDelta, true);
        double tPosX = lerp(target.lastX, target.getX(), tickDelta) - camera.getCameraPos().x;
        double tPosY = lerp(target.lastY, target.getY(), tickDelta) - camera.getCameraPos().y;
        double tPosZ = lerp(target.lastZ, target.getZ(), tickDelta) - camera.getCameraPos().z;
        float iAge = (float) lerp(target.age - 1, target.age, tickDelta);

        int firstColor = ClientColors.GRADIENT_START.getRGB();
        int secondColor = ClientColors.GRADIENT_END.getRGB();
        int rFirst = ColorUtils.red(firstColor);
        int gFirst = ColorUtils.green(firstColor);
        int bFirst = ColorUtils.blue(firstColor);
        int rSecond = ColorUtils.red(secondColor);
        int gSecond = ColorUtils.green(secondColor);
        int bSecond = ColorUtils.blue(secondColor);
        int rDiff = rSecond - rFirst;
        int gDiff = gSecond - gFirst;
        int bDiff = bSecond - bFirst;

        float time = (System.currentTimeMillis() % PRIV_COLOR_CYCLE_MS) / (float) PRIV_COLOR_CYCLE_MS;
        float particleDensity = particleDensityDush.get();
        int particleCount = Math.max(1, (int) (espLength * particleDensity));
        float sizeBase = sizeDush.get();
        double targetWidth = target.getWidth();
        float invShaking = shaking == 0f ? 0f : 1f / shaking;
        float invParticleCount = 1f / particleCount;
        double orbitAngleStep = Math.toRadians(espLength * factor * invParticleCount);
        double waveAngleStep = Math.toRadians(espLength * 2.0f * invParticleCount) * amplitude;
        float alphaStep = alpha * 0.15f * invParticleCount;
        float scaleStep = sizeBase * 0.75f * invParticleCount;
        float baseScale = sizeBase * 0.25f;
        float flash = target instanceof LivingEntity living ? getHurtFlash(living) : 0f;

        try (WorldRenderer renderer = WorldRenderer.begin(mc, mc.getRenderTickCounter(), camera,
                stack.peek().getPositionMatrix(), mc.gameRenderer.getBasicProjectionMatrix(fov))) {
            VertexConsumer consumer = renderer
                    .getBuffer(WorldRenderLayers.TEXTURED_QUADS_ADDITIVE_NO_DEPTH(SOUL_TEXTURE));
            MatrixStack identity = new MatrixStack();
            WorldGeometryEmitter emitter = new WorldGeometryEmitter(camera, identity.peek(), consumer);

            for (int j = 0; j < PRIV_BASE_ANGLES.length; j++) {
                float colorLerp = (float) (Math.sin((Math.PI * 2.0) * time + j * (Math.PI * 0.5)) * 0.5 + 0.5);
                int r = rFirst + (int) (rDiff * colorLerp);
                int g = gFirst + (int) (gDiff * colorLerp);
                int b = bFirst + (int) (bDiff * colorLerp);

                int tinted = applyDamageTint(ColorUtils.rgba(r, g, b, 255), flash);
                r = ColorUtils.red(tinted);
                g = ColorUtils.green(tinted);
                b = ColorUtils.blue(tinted);

                double orbitAngle = Math.toRadians(PRIV_BASE_ANGLES[j] + iAge * factor);
                double waveAngle = Math.toRadians(iAge * 2.5f + j * 90f) * amplitude;
                float alphaFactor = alpha;
                float scale = baseScale;

                for (int i = 0; i < particleCount; i++) {
                    double sinQuad = Math.sin(waveAngle) * invShaking;
                    int particleAlpha = Math.max(0, Math.min(255, Math.round(alphaFactor * 255f)));
                    int color = ColorUtils.rgba(r, g, b, particleAlpha);

                    MatrixStack matrices = new MatrixStack();
                    matrices.translate(
                            tPosX + Math.cos(orbitAngle) * targetWidth,
                            tPosY + 1 + sinQuad,
                            tPosZ + Math.sin(orbitAngle) * targetWidth);
                    matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(-camera.getYaw()));
                    matrices.multiply(RotationAxis.POSITIVE_X.rotationDegrees(camera.getPitch()));

                    Matrix4f localTransform = matrices.peek().getPositionMatrix();
                    Vec3d v0 = transform(localTransform, -scale, scale, 0);
                    Vec3d v1 = transform(localTransform, scale, scale, 0);
                    Vec3d v2 = transform(localTransform, scale, -scale, 0);
                    Vec3d v3 = transform(localTransform, -scale, -scale, 0);

                    emitter.emitTexturedQuad(
                            v0, v1, v2, v3,
                            0f, 1f,
                            1f, 1f,
                            1f, 0f,
                            0f, 0f,
                            color);

                    orbitAngle += orbitAngleStep;
                    waveAngle += waveAngleStep;
                    alphaFactor = Math.max(0f, alphaFactor - alphaStep);
                    scale += scaleStep;
                }
            }

            renderer.flush();
        }
    }

    private void renderKolcoWorld(EventRender.World event, Entity target, float alpha) {
        if (!shaderType.is("Колечко") || mc.world == null) {
            return;
        }

        renderAnimatedRingPasses(event, target, alpha);
    }

    private void renderAnimatedRingPasses(EventRender.World event, Entity target, float alpha) {
        if (target == null || mc.world == null) {
            kolcoStars.clear();
            return;
        }

        MatrixStack stack = event.getMatrixStack();
        Camera camera = mc.gameRenderer.getCamera();
        float tickDelta = event.getTicks();
        float fov = ((GameRendererAccessor) mc.gameRenderer).invokeGetFov(camera, tickDelta, true);

        double timeSeconds = System.currentTimeMillis() * 0.001;
        double cs = timeSeconds * 2.2;
        double sinAnim = (Math.sin(cs) + 1.0) * 0.5;
        double sinAnimNext = (Math.sin(cs + 0.45) + 1.0) * 0.5;

        double baseY = lerp(target.lastY, target.getY(), tickDelta);
        double y = baseY + sinAnim * target.getHeight();
        double nextY = baseY + sinAnimNext * target.getHeight();

        double baseX = lerp(target.lastX, target.getX(), tickDelta);
        double baseZ = lerp(target.lastZ, target.getZ(), tickDelta);
        double radius = target.getWidth() * 0.8;
        int segments = 128;

        int baseStart = ClientColors.GRADIENT_START.getRGB();
        int baseEnd = ClientColors.GRADIENT_END.getRGB();
        int alphaValue = Math.max(0, Math.min(255, Math.round(alpha * 255f)));
        float time = (float) (System.currentTimeMillis() % 2500) / 2500.0f;

        Vec3d cameraPos = camera.getCameraPos();
        double tX = baseX - cameraPos.x;
        double tZ = baseZ - cameraPos.z;
        double tY = y - cameraPos.y;
        double tNextY = nextY - cameraPos.y;

        double outlineRadius = radius + 0.003;
        int outlineAlpha = Math.max(0, Math.min(255, Math.round(alpha * 255f)));
        int glowAlpha = Math.max(0, Math.min(255, Math.round(alpha * 240f)));
        int endColor = ColorUtils.rgba(
                ColorUtils.red(baseEnd),
                ColorUtils.green(baseEnd),
                ColorUtils.blue(baseEnd),
                outlineAlpha);
        int endGlow = ColorUtils.rgba(
                ColorUtils.red(baseEnd),
                ColorUtils.green(baseEnd),
                ColorUtils.blue(baseEnd),
                glowAlpha);

        Vec3d[] quad0 = new Vec3d[segments];
        Vec3d[] quad1 = new Vec3d[segments];
        Vec3d[] quad2 = new Vec3d[segments];
        Vec3d[] quad3 = new Vec3d[segments];
        Vec3d[] outlinePoints = new Vec3d[segments];
        int[] topColors = new int[segments];
        int[] lineColors = new int[segments];
        int[] glowColors = new int[segments];

        for (int i = 0; i < segments; i++) {
            double a0 = i * (Math.PI * 2.0) / segments;
            double a1 = (i + 1) * (Math.PI * 2.0) / segments;
            double x0 = tX + Math.cos(a0) * radius;
            double z0 = tZ + Math.sin(a0) * radius;
            double x1 = tX + Math.cos(a1) * radius;
            double z1 = tZ + Math.sin(a1) * radius;

            float colorLerp = (float) (Math.sin(a0 + 2.0 * Math.PI * time) * 0.5 + 0.5);
            int r = (int) (ColorUtils.red(baseStart)
                    + (ColorUtils.red(baseEnd) - ColorUtils.red(baseStart)) * colorLerp);
            int g = (int) (ColorUtils.green(baseStart)
                    + (ColorUtils.green(baseEnd) - ColorUtils.green(baseStart)) * colorLerp);
            int b = (int) (ColorUtils.blue(baseStart)
                    + (ColorUtils.blue(baseEnd) - ColorUtils.blue(baseStart)) * colorLerp);

            quad0[i] = new Vec3d(x0, tNextY, z0);
            quad1[i] = new Vec3d(x1, tNextY, z1);
            quad2[i] = new Vec3d(x1, tY, z1);
            quad3[i] = new Vec3d(x0, tY, z0);
            outlinePoints[i] = new Vec3d(tX + Math.cos(a0) * outlineRadius, tNextY, tZ + Math.sin(a0) * outlineRadius);
            topColors[i] = ColorUtils.rgba(r, g, b, alphaValue);
            lineColors[i] = ColorUtils.rgba(r, g, b, outlineAlpha);
            glowColors[i] = ColorUtils.rgba(r, g, b, glowAlpha);
        }

        try (WorldRenderer renderer = WorldRenderer.begin(mc, mc.getRenderTickCounter(), camera,
                stack.peek().getPositionMatrix(), mc.gameRenderer.getBasicProjectionMatrix(fov))) {
            MatrixStack identity = new MatrixStack();

            updateKolcoStars(baseX, y, baseZ, radius, baseStart, baseEnd, alpha);
            emitKolcoStars(renderer, camera, tickDelta);

            VertexConsumer consumer = renderer.getBuffer(WorldRenderLayers.POSITION_COLOR_QUADS_ADDITIVE());
            WorldGeometryEmitter emitter = new WorldGeometryEmitter(camera, identity.peek(), consumer);
            for (int i = 0; i < segments; i++) {
                int topColor = topColors[i];
                int bottomColor = ColorUtils.injectAlpha(topColor, 0);
                emitter.emitQuad(quad0[i], quad1[i], quad2[i], quad3[i], topColor, topColor, bottomColor, bottomColor);
            }

            VertexConsumer lineConsumer = renderer.getBuffer(WorldRenderLayers.LINES(1.0));
            WorldGeometryEmitter lineEmitter = new WorldGeometryEmitter(camera, identity.peek(), lineConsumer);
            for (int i = 1; i < segments; i++) {
                lineEmitter.emitLine(outlinePoints[i - 1], outlinePoints[i], lineColors[i]);
            }
            if (segments > 1) {
                lineEmitter.emitLine(outlinePoints[segments - 1], outlinePoints[0], endColor);
            }

            VertexConsumer glowLineConsumer = renderer.getBuffer(WorldRenderLayers.LINES_ADDITIVE_NO_DEPTH(1.5));
            WorldGeometryEmitter glowLineEmitter = new WorldGeometryEmitter(camera, identity.peek(), glowLineConsumer);
            for (int i = 1; i < segments; i++) {
                glowLineEmitter.emitLine(outlinePoints[i - 1], outlinePoints[i], glowColors[i]);
            }
            if (segments > 1) {
                glowLineEmitter.emitLine(outlinePoints[segments - 1], outlinePoints[0], endGlow);
            }

            renderer.flush();
        }
    }

    private void updateKolcoStars(double baseX, double ringY, double baseZ, double radius, int baseStart, int baseEnd, float alpha) {
        long now = System.currentTimeMillis();
        Iterator<KolcoStarParticle> iterator = kolcoStars.iterator();
        while (iterator.hasNext()) {
            KolcoStarParticle particle = iterator.next();
            if (now - particle.spawnMs >= KOLCO_STAR_LIFETIME_MS) {
                iterator.remove();
                continue;
            }
            particle.tick();
        }

        if (now - lastKolcoStarSpawnMs < KOLCO_STAR_SPAWN_INTERVAL_MS || alpha <= 0.05f) {
            return;
        }

        lastKolcoStarSpawnMs = now;
        int spawnCount = 2 + KOLCO_RANDOM.nextInt(2);
        for (int i = 0; i < spawnCount; i++) {
            double angle = KOLCO_RANDOM.nextDouble() * Math.PI * 2.0;
            double spread = radius * (0.78 + KOLCO_RANDOM.nextDouble() * 0.42);
            double x = baseX + Math.cos(angle) * spread;
            double z = baseZ + Math.sin(angle) * spread;
            double y = ringY - 0.08 - KOLCO_RANDOM.nextDouble() * 0.06;
            double motionX = (KOLCO_RANDOM.nextDouble() - 0.5) * 0.006;
            double motionZ = (KOLCO_RANDOM.nextDouble() - 0.5) * 0.006;
            double motionY = -0.00028 - KOLCO_RANDOM.nextDouble() * 0.0008;
            float size = 0.075f + KOLCO_RANDOM.nextFloat() * 0.025f;
            float colorLerp = KOLCO_RANDOM.nextFloat();
            int r = (int) (ColorUtils.red(baseStart) + (ColorUtils.red(baseEnd) - ColorUtils.red(baseStart)) * colorLerp);
            int g = (int) (ColorUtils.green(baseStart) + (ColorUtils.green(baseEnd) - ColorUtils.green(baseStart)) * colorLerp);
            int b = (int) (ColorUtils.blue(baseStart) + (ColorUtils.blue(baseEnd) - ColorUtils.blue(baseStart)) * colorLerp);
            int color = ColorUtils.rgba(r, g, b, Math.max(0, Math.min(255, Math.round(alpha * 255f))));
            kolcoStars.add(new KolcoStarParticle(x, y, z, motionX, motionY, motionZ, size, color, now,
                    KOLCO_RANDOM.nextFloat() * 360f, (KOLCO_RANDOM.nextFloat() - 0.5f) * 360f));
        }
    }

    private void emitKolcoStars(WorldRenderer renderer, Camera camera, float tickDelta) {
        if (kolcoStars.isEmpty()) {
            return;
        }

        VertexConsumer consumer = renderer.getBuffer(WorldRenderLayers.TEXTURED_QUADS_ADDITIVE_NO_DEPTH(STAR_TEXTURE));
        MatrixStack identity = new MatrixStack();
        WorldGeometryEmitter emitter = new WorldGeometryEmitter(camera, identity.peek(), consumer);
        Vec3d cameraPos = camera.getCameraPos();

        long now = System.currentTimeMillis();
        for (KolcoStarParticle particle : kolcoStars) {
            float age = Math.min(1f, (now - particle.spawnMs) / (float) KOLCO_STAR_LIFETIME_MS);
            float fade = 1f - smoothstep(age);
            int baseAlpha = (particle.color >>> 24) & 0xFF;
            int color = ColorUtils.injectAlpha(particle.color, Math.max(0, Math.min(255, Math.round(baseAlpha * fade))));
            if (((color >>> 24) & 0xFF) <= 2) {
                continue;
            }

            double x = lerp(particle.prevX, particle.x, tickDelta) - cameraPos.x;
            double y = lerp(particle.prevY, particle.y, tickDelta) - cameraPos.y;
            double z = lerp(particle.prevZ, particle.z, tickDelta) - cameraPos.z;
            float size = particle.size * (1 + 1f * fade);
            float rotation = particle.rotation + (now - particle.spawnMs) * 0.001f * particle.rotationSpeed;
            MatrixStack matrices = new MatrixStack();
            matrices.translate(x, y, z);
            matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(-camera.getYaw()));
            matrices.multiply(RotationAxis.POSITIVE_X.rotationDegrees(camera.getPitch()));
            matrices.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(rotation));

            Matrix4f localTransform = matrices.peek().getPositionMatrix();
            Vec3d v0 = transform(localTransform, -size, size, 0);
            Vec3d v1 = transform(localTransform, size, size, 0);
            Vec3d v2 = transform(localTransform, size, -size, 0);
            Vec3d v3 = transform(localTransform, -size, -size, 0);

            emitter.emitTexturedQuad(
                    v0, v1, v2, v3,
                    1f, 0f,
                    0f, 0f,
                    0f, 1f,
                    1f, 1f,
                    color);
        }
    }

    private static final class KolcoStarParticle {
        private double x, y, z;
        private double prevX, prevY, prevZ;
        private double motionX, motionY, motionZ;
        private final float size;
        private final int color;
        private final long spawnMs;
        private final float rotation;
        private final float rotationSpeed;

        private KolcoStarParticle(double x, double y, double z, double motionX, double motionY, double motionZ,
                                  float size, int color, long spawnMs, float rotation, float rotationSpeed) {
            this.x = this.prevX = x;
            this.y = this.prevY = y;
            this.z = this.prevZ = z;
            this.motionX = motionX;
            this.motionY = motionY;
            this.motionZ = motionZ;
            this.size = size;
            this.color = color;
            this.spawnMs = spawnMs;
            this.rotation = rotation;
            this.rotationSpeed = rotationSpeed;
        }

        private void tick() {
            prevX = x;
            prevY = y;
            prevZ = z;
            x += motionX;
            y += motionY;
            z += motionZ;
            motionX *= 0.92;
            motionZ *= 0.92;
            motionY -= 0.00001;

        }
    }

    private void renderCircleParticlesWorld(EventRender.World event, Entity target, float alpha) {
        if (!shaderType.is("Души 2"))
            return;

        float espLength = dlinaDush.get();
        float factor = factorDush.get();
        float shaking = 1.1f;
        float amplitude = 2.2f;

        MatrixStack stack = event.getMatrixStack();
        Camera camera = mc.gameRenderer.getCamera();
        float tickDelta = event.getTicks();
        float fov = ((GameRendererAccessor) mc.gameRenderer).invokeGetFov(camera, tickDelta, true);
        double tPosX = lerp(target.lastX, target.getX(), tickDelta) - camera.getCameraPos().x;
        double tPosY = lerp(target.lastY, target.getY(), tickDelta) - camera.getCameraPos().y;
        double tPosZ = lerp(target.lastZ, target.getZ(), tickDelta) - camera.getCameraPos().z;
        float iAge = (float) lerp(target.age - 1, target.age, tickDelta);

        int firstColor = ClientColors.GRADIENT_START.getRGB();
        int secondColor = ClientColors.GRADIENT_END.getRGB();
        int rFirst = ColorUtils.red(firstColor);
        int gFirst = ColorUtils.green(firstColor);
        int bFirst = ColorUtils.blue(firstColor);
        int rSecond = ColorUtils.red(secondColor);
        int gSecond = ColorUtils.green(secondColor);
        int bSecond = ColorUtils.blue(secondColor);
        int rDiff = rSecond - rFirst;
        int gDiff = gSecond - gFirst;
        int bDiff = bSecond - bFirst;

        float time = (System.currentTimeMillis() % PRIV_COLOR_CYCLE_MS) / (float) PRIV_COLOR_CYCLE_MS;
        float particleDensity = particleDensityDush.get() + 0.45f;
        int particleCount = Math.max(1, (int) (espLength * particleDensity));
        float sizeBase = sizeDush.get() * 1.25f;
        double targetWidth = target.getWidth() * 0.75 + 0.12;
        float invShaking = shaking == 0f ? 0f : 1f / shaking;
        float invParticleCount = 1f / particleCount;
        double orbitAngleStep = Math.toRadians(espLength * factor * invParticleCount);
        double waveAngleStep = Math.toRadians(espLength * 1.6f * invParticleCount) * amplitude;
        float alphaStep = alpha * 0.12f * invParticleCount;
        float scaleStep = sizeBase * 0.55f * invParticleCount;
        float baseScale = sizeBase * 0.2f;
        float flash = target instanceof LivingEntity living ? getHurtFlash(living) : 0f;

        try (WorldRenderer renderer = WorldRenderer.begin(mc, mc.getRenderTickCounter(), camera,
                stack.peek().getPositionMatrix(), mc.gameRenderer.getBasicProjectionMatrix(fov))) {
            VertexConsumer consumer = renderer
                    .getBuffer(WorldRenderLayers.TEXTURED_QUADS_ADDITIVE_NO_DEPTH(SOUL_TEXTURE));
            MatrixStack identity = new MatrixStack();
            WorldGeometryEmitter emitter = new WorldGeometryEmitter(camera, identity.peek(), consumer);

            for (int j = 0; j < PRIV_BASE_ANGLES.length; j++) {
                float colorLerp = (float) (Math.sin((Math.PI * 2.0) * time + j * (Math.PI * 0.5)) * 0.5 + 0.5);
                int r = rFirst + (int) (rDiff * colorLerp);
                int g = gFirst + (int) (gDiff * colorLerp);
                int b = bFirst + (int) (bDiff * colorLerp);

                int tinted = applyDamageTint(ColorUtils.rgba(r, g, b, 255), flash);
                r = ColorUtils.red(tinted);
                g = ColorUtils.green(tinted);
                b = ColorUtils.blue(tinted);

                double orbitAngle = Math.toRadians(PRIV_BASE_ANGLES[j] + iAge * factor);
                double waveAngle = Math.toRadians(iAge * 2.0f + j * 90f) * amplitude;
                float alphaFactor = alpha;
                float scale = baseScale;

                for (int i = 0; i < particleCount; i++) {
                    double sinQuad = Math.sin(waveAngle) * invShaking;
                    int particleAlpha = Math.max(0, Math.min(255, Math.round(alphaFactor * 255f)));
                    int color = ColorUtils.rgba(r, g, b, particleAlpha);

                    MatrixStack matrices = new MatrixStack();
                    matrices.translate(
                            tPosX + Math.cos(orbitAngle) * targetWidth,
                            tPosY + target.getHeight() * 0.5 + sinQuad,
                            tPosZ + Math.sin(orbitAngle) * targetWidth);
                    matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(-camera.getYaw()));
                    matrices.multiply(RotationAxis.POSITIVE_X.rotationDegrees(camera.getPitch()));

                    Matrix4f localTransform = matrices.peek().getPositionMatrix();
                    Vec3d v0 = transform(localTransform, -scale, scale, 0);
                    Vec3d v1 = transform(localTransform, scale, scale, 0);
                    Vec3d v2 = transform(localTransform, scale, -scale, 0);
                    Vec3d v3 = transform(localTransform, -scale, -scale, 0);

                    emitter.emitTexturedQuad(
                            v0, v1, v2, v3,
                            0f, 1f,
                            1f, 1f,
                            1f, 0f,
                            0f, 0f,
                            color);

                    orbitAngle += orbitAngleStep;
                    waveAngle += waveAngleStep;
                    alphaFactor = Math.max(0f, alphaFactor - alphaStep);
                    scale += scaleStep;
                }
            }

            renderer.flush();
        }
    }

    private void renderCrystalWorld(EventRender.World event, Entity target, float alpha, boolean modern) {
        if (target == null || mc.world == null) {
            return;
        }

        MatrixStack stack = event.getMatrixStack();
        Camera camera = mc.gameRenderer.getCamera();
        float tickDelta = event.getTicks();
        float fov = ((GameRendererAccessor) mc.gameRenderer).invokeGetFov(camera, tickDelta, true);

        double baseX = lerp(target.lastX, target.getX(), tickDelta) - camera.getCameraPos().x;
        double baseY = lerp(target.lastY, target.getY(), tickDelta) - camera.getCameraPos().y
                + target.getHeight() * (modern ? 0.55 : 0.5);
        double baseZ = lerp(target.lastZ, target.getZ(), tickDelta) - camera.getCameraPos().z;
        int crystalCount = modern ? 4 : 3;
        double orbitRadius = target.getWidth() * (modern ? 0.95 : 0.75);
        double yWave = modern ? 0.22 : 0.14;
        float crystalScale = modern ? 0.22f : 0.18f;
        double timeSeconds = System.nanoTime() * 1.0E-9;
        double orbitSpeedDegPerSec = modern ? 52.0 : 36.0;

        CrystalGeometry[] crystals = new CrystalGeometry[crystalCount];
        for (int i = 0; i < crystalCount; i++) {
            float progress = (float) i / (float) crystalCount;
            double angle = Math.toRadians(timeSeconds * orbitSpeedDegPerSec + 360.0 * progress);
            double x = baseX + Math.cos(angle) * orbitRadius;
            double z = baseZ + Math.sin(angle) * orbitRadius;
            double y = baseY + Math.sin(angle * (modern ? 1.7 : 1.25)) * yWave;
            Color color = ColorUtils.interpolateColor(ClientColors.GRADIENT_START, ClientColors.GRADIENT_END,
                    progress);
            int alphaColor = ColorUtils.injectAlpha(color.getRGB(),
                    Math.max(0, Math.min(255, (int) (alpha * (modern ? 210f : 180f)))));
            crystals[i] = createCrystalGeometry(x, y, z, crystalScale, alphaColor);
        }

        try (WorldRenderer renderer = WorldRenderer.begin(mc, mc.getRenderTickCounter(), camera,
                stack.peek().getPositionMatrix(), mc.gameRenderer.getBasicProjectionMatrix(fov))) {
            MatrixStack identity = new MatrixStack();

            VertexConsumer quadConsumer = renderer.getBuffer(WorldRenderLayers.POSITION_COLOR_QUADS_ADDITIVE());
            WorldGeometryEmitter quadEmitter = new WorldGeometryEmitter(camera, identity.peek(), quadConsumer);
            for (CrystalGeometry crystal : crystals) {
                emitCrystalQuads(quadEmitter, crystal);
            }

            VertexConsumer lineConsumer = renderer
                    .getBuffer(WorldRenderLayers.LINES_ADDITIVE_NO_DEPTH(modern ? 2.0 : 1.35));
            WorldGeometryEmitter lineEmitter = new WorldGeometryEmitter(camera, identity.peek(), lineConsumer);
            for (CrystalGeometry crystal : crystals) {
                emitCrystalLines(lineEmitter, crystal);
            }

            renderer.flush();
        }
    }

    private CrystalGeometry createCrystalGeometry(double x, double y, double z, float scale, int color) {
        Vec3d top = new Vec3d(x, y + scale, z);
        Vec3d bottom = new Vec3d(x, y - scale, z);
        Vec3d east = new Vec3d(x + scale * 0.55f, y, z);
        Vec3d west = new Vec3d(x - scale * 0.55f, y, z);
        Vec3d south = new Vec3d(x, y, z + scale * 0.55f);
        Vec3d north = new Vec3d(x, y, z - scale * 0.55f);
        int fade = ColorUtils.injectAlpha(color, Math.max(0, ColorUtils.alpha(color) / 5));
        return new CrystalGeometry(top, bottom, east, west, south, north, color, fade);
    }

    private void emitCrystalQuads(WorldGeometryEmitter emitter, CrystalGeometry crystal) {
        emitter.emitQuad(crystal.top, crystal.east, crystal.bottom, crystal.south, crystal.color, crystal.color,
                crystal.fade, crystal.fade);
        emitter.emitQuad(crystal.top, crystal.south, crystal.bottom, crystal.west, crystal.color, crystal.color,
                crystal.fade, crystal.fade);
        emitter.emitQuad(crystal.top, crystal.west, crystal.bottom, crystal.north, crystal.color, crystal.color,
                crystal.fade, crystal.fade);
        emitter.emitQuad(crystal.top, crystal.north, crystal.bottom, crystal.east, crystal.color, crystal.color,
                crystal.fade, crystal.fade);
    }

    private void emitCrystalLines(WorldGeometryEmitter lineEmitter, CrystalGeometry crystal) {
        lineEmitter.emitLine(crystal.top, crystal.east, crystal.color);
        lineEmitter.emitLine(crystal.top, crystal.south, crystal.color);
        lineEmitter.emitLine(crystal.top, crystal.west, crystal.color);
        lineEmitter.emitLine(crystal.top, crystal.north, crystal.color);
        lineEmitter.emitLine(crystal.bottom, crystal.east, crystal.color);
        lineEmitter.emitLine(crystal.bottom, crystal.south, crystal.color);
        lineEmitter.emitLine(crystal.bottom, crystal.west, crystal.color);
        lineEmitter.emitLine(crystal.bottom, crystal.north, crystal.color);
    }

    private static final class CrystalGeometry {
        private final Vec3d top;
        private final Vec3d bottom;
        private final Vec3d east;
        private final Vec3d west;
        private final Vec3d south;
        private final Vec3d north;
        private final int color;
        private final int fade;

        private CrystalGeometry(Vec3d top, Vec3d bottom, Vec3d east, Vec3d west, Vec3d south, Vec3d north, int color,
                                int fade) {
            this.top = top;
            this.bottom = bottom;
            this.east = east;
            this.west = west;
            this.south = south;
            this.north = north;
            this.color = color;
            this.fade = fade;
        }
    }

    private void renderChainsWorld(EventRender.World event, LivingEntity target, float alpha) {
        if (target == null || mc.world == null)
            return;

        MatrixStack stack = event.getMatrixStack();
        Camera camera = mc.gameRenderer.getCamera();
        float tickDelta = event.getTicks();
        float fov = ((GameRendererAccessor) mc.gameRenderer).invokeGetFov(camera, tickDelta, true);
        Vec3d cameraPos = camera.getCameraPos();

        double targetX = lerp(target.lastX, target.getX(), tickDelta);
        double targetY = lerp(target.lastY, target.getY(), tickDelta);
        double targetZ = lerp(target.lastZ, target.getZ(), tickDelta);

        double tX = targetX - cameraPos.x;
        double tY = targetY - cameraPos.y;
        double tZ = targetZ - cameraPos.z;

        float speed = chainSpeed.get();

        float movingValue = (float) (System.currentTimeMillis() % 360000L) * 0.15f * speed;
        float rotSpeed = 0.3f;
        float width = target.getWidth() * 1.2f;

        int baseAlpha = Math.max(0, Math.min(255, Math.round(alpha * 255f)));

        try (WorldRenderer renderer = WorldRenderer.begin(mc, mc.getRenderTickCounter(), camera,
                stack.peek().getPositionMatrix(), mc.gameRenderer.getBasicProjectionMatrix(fov))) {
            VertexConsumer consumer = renderer
                    .getBuffer(WorldRenderLayers.TEXTURED_QUADS_ADDITIVE_NO_DEPTH(CHAIN_TEXTURE));
            MatrixStack identity = new MatrixStack();
            WorldGeometryEmitter emitter = new WorldGeometryEmitter(camera, identity.peek(), consumer);

            for (int chain = 0; chain < 6; chain++) {
                float gradusX = 20.0f * Math.min(1.0f + (float) Math.sin(Math.toRadians(movingValue)), 1.0f);
                float gradusZ = 20.0f * (Math.min(1.0f + (float) Math.sin(Math.toRadians(movingValue)), 2.0f) - 1.0f);

                if (chain == 1) {
                    gradusX = -gradusX;
                    gradusZ = -gradusZ;
                }

                MatrixStack matrices = new MatrixStack();
                matrices.translate(tX, tY + target.getHeight() / 2.0, tZ);
                matrices.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(chain == 0 ? gradusX : -gradusX));
                matrices.multiply(RotationAxis.POSITIVE_X.rotationDegrees(chain == 0 ? gradusZ : -gradusZ));

                float val = 1.2f - 0.5f * alpha;
                float chainAlpha = baseAlpha * 0.65f;
                int color = ColorUtils.rgba(ClientColors.ICON.getRed(), ClientColors.ICON.getGreen(),
                        ClientColors.ICON.getBlue(), (int) chainAlpha);

                Matrix4f matrix = matrices.peek().getPositionMatrix();
                float down = 1f;
                float x = 0.0f;
                float y = -0.45f;
                float z = 0.0f;

                int modif = 22;
                for (int i = 0; i < 744; i += modif) {
                    float prevSin = x + (chain == 0 ? gradusX : -gradusX) / 100.0f
                            + (float) Math.sin(Math.toRadians((i - modif) + movingValue * rotSpeed)) * width * val;
                    float prevCos = z + (chain == 0 ? -gradusZ : gradusZ) / 100.0f
                            + (float) Math.cos(Math.toRadians((i - modif) + movingValue * rotSpeed)) * width * val;
                    float sin = x + (chain == 0 ? gradusX : -gradusX) / 100.0f
                            + (float) Math.sin(Math.toRadians(i + movingValue * rotSpeed)) * width * val;
                    float cos = z + (chain == 0 ? -gradusZ : gradusZ) / 100.0f
                            + (float) Math.cos(Math.toRadians(i + movingValue * rotSpeed)) * width * val;

                    Vec3d v0 = transform(matrix, prevSin, y, prevCos);
                    Vec3d v1 = transform(matrix, sin, y, cos);
                    Vec3d v2 = transform(matrix, sin, y + down, cos);
                    Vec3d v3 = transform(matrix, prevSin, y + down, prevCos);

                    float u0 = 0.0027777778f * (i - modif) * 4.0f;
                    float u1 = 0.0027777778f * i * 4.0f;
                    float v = 0.99f;

                    emitter.emitTexturedQuad(
                            v0, v1, v2, v3,
                            u0, 0.0f,
                            u1, 0.0f,
                            u1, v,
                            u0, v,
                            color);
                }
            }

            renderer.flush();
        }
    }

    private static Vec3d transform(Matrix4f matrix, double x, double y, double z) {
        Vector4f vec = new Vector4f((float) x, (float) y, (float) z, 1f);
        matrix.transform(vec);
        return new Vec3d(vec.x, vec.y, vec.z);
    }

    public void updateCircleESP() {
        lastCircleStep = circleStep;
        circleStep += 0.08f;
    }
}
