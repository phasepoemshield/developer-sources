package fun.wonderful.client.modules.impl.render;

import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import fun.wonderful.api.events.EventLink;
import fun.wonderful.api.events.implement.Event3DRender;
import fun.wonderful.api.events.implement.EventAttackEntity;
import fun.wonderful.api.events.implement.EventUpdate;
import fun.wonderful.api.utils.color.ColorUtils;
import fun.wonderful.client.modules.Module;
import fun.wonderful.client.modules.settings.implement.ModeSetting;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import net.minecraft.client.gl.ShaderProgramKeys;
import net.minecraft.client.gl.ShaderProgramKey;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.LightningEntity;
import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.block.BlockState;
import net.minecraft.client.render.BufferRenderer;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.render.Tessellator;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.render.VertexFormat;
import net.minecraft.util.Identifier;
import net.minecraft.sound.SoundEvents;
import net.minecraft.sound.SoundCategory;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.RaycastContext;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.util.math.RotationAxis;
import net.minecraft.client.render.BuiltBuffer;

public class KillEffect
extends Module {
    public static KillEffect INSTANCE = new KillEffect();
    private static final Identifier BLOOM = Identifier.of((String)"wonderful", (String)"textures/particle/bloom.png");
    private static final long LIFE_TIME = 9200L;
    private static final long DROP_TIME = 7260L;
    private static final long HIT_MEMORY = 10000L;
    private static final double GROUND_Y_OFFSET = 0.0;
    private static final float BEAM_MIN_HEIGHT = 0.0f;
    private static final float BEAM_HEIGHT_PADDING = 3.7f;
    private final ModeSetting mode = new ModeSetting("Режим", "Молния", "Молния", "Луч света");
    private final Map<UUID, TrackedTarget> trackedTargets = new HashMap<UUID, TrackedTarget>();
    private final Map<UUID, Fx> effects = new HashMap<UUID, Fx>();
    private int nextLightningId = -20000;
    private ClientWorld lastWorld;

    public KillEffect() {
        super("KillEffect", "Эффект при убийстве цели", Module.ModuleCategory.RENDER);
        this.addSettings(this.mode);
    }

    @Override
    public void onDisable() {
        for (Fx fx : this.effects.values()) {
            this.removeLightning(fx);
        }
        this.trackedTargets.clear();
        this.effects.clear();
        this.lastWorld = null;
        super.onDisable();
    }

    @EventLink
    public void onAttack(EventAttackEntity event) {
        LivingEntity living;
        block5: {
            block4: {
                if (KillEffect.mc.player == null || KillEffect.mc.world == null || event == null) {
                    return;
                }
                Entity target = event.getTarget();
                if (!(target instanceof LivingEntity)) break block4;
                living = (LivingEntity)target;
                if (target != KillEffect.mc.player) break block5;
            }
            return;
        }
        this.trackedTargets.put(living.getUuid(), new TrackedTarget(living, System.currentTimeMillis()));
    }

    @EventLink
    public void onUpdate(EventUpdate event) {
        if (KillEffect.mc.player == null || KillEffect.mc.world == null) {
            this.clearAll();
            return;
        }
        if (this.lastWorld != KillEffect.mc.world) {
            this.clearAll();
            this.lastWorld = KillEffect.mc.world;
        }
        long now = System.currentTimeMillis();
        Iterator<Map.Entry<UUID, TrackedTarget>> iterator = this.trackedTargets.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<UUID, TrackedTarget> entry = iterator.next();
            TrackedTarget tracked = entry.getValue();
            if (now - tracked.time > 10000L || tracked.entity.getWorld() != KillEffect.mc.world) {
                iterator.remove();
                continue;
            }
            if (!this.isDead(tracked.entity)) continue;
            this.createEffect(tracked.entity);
            iterator.remove();
        }
        if (!this.mode.is("Молния")) {
            for (Fx fx : this.effects.values()) {
                this.removeLightning(fx);
            }
        }
    }

    @EventLink
    public void onRender3D(Event3DRender event) {
        if (KillEffect.mc.player == null || KillEffect.mc.world == null || event == null) {
            return;
        }
        long now = System.currentTimeMillis();
        Iterator<Map.Entry<UUID, Fx>> iterator = this.effects.entrySet().iterator();
        while (iterator.hasNext()) {
            Fx fx = iterator.next().getValue();
            if (now - fx.time > 9200L) {
                this.removeLightning(fx);
                iterator.remove();
                continue;
            }
            if (this.mode.is("Молния")) {
                this.spawnLightning(fx);
                continue;
            }
            this.removeLightning(fx);
            this.renderBeam(event, fx, now);
        }
    }

    private void clearAll() {
        for (Fx fx : this.effects.values()) {
            this.removeLightning(fx);
        }
        this.trackedTargets.clear();
        this.effects.clear();
        this.lastWorld = null;
    }

    private void createEffect(LivingEntity entity) {
        if (KillEffect.mc.player == null || KillEffect.mc.world == null || entity == KillEffect.mc.player) {
            return;
        }
        UUID id = entity.getUuid();
        if (this.effects.containsKey(id)) {
            return;
        }
        this.effects.put(id, new Fx(System.currentTimeMillis(), this.landing((Entity)entity).add(0.0, 0.0, 0.0), entity.getHeight(), entity.getWidth()));
        Vec3d pos = entity.getPos();
        KillEffect.mc.world.playSound(pos.x, pos.y, pos.z, SoundEvents.ENTITY_LIGHTNING_BOLT_IMPACT, SoundCategory.BLOCKS, 1.0f, 1.0f, false);
    }

    private void spawnLightning(Fx fx) {
        if (fx.spawned || KillEffect.mc.world == null) {
            return;
        }
        LightningEntity lightning = new LightningEntity(EntityType.LIGHTNING_BOLT, (World)KillEffect.mc.world);
        lightning.setCosmetic(true);
        lightning.setId(this.nextLightningId--);
        lightning.setPosition(fx.ground.x, fx.ground.y, fx.ground.z);
        KillEffect.mc.world.addEntity((Entity)lightning);
        fx.spawned = true;
        fx.lightningEntityId = lightning.getId();
    }

    private void removeLightning(Fx fx) {
        if (!fx.spawned || fx.lightningEntityId == Integer.MIN_VALUE || KillEffect.mc.world == null) {
            return;
        }
        KillEffect.mc.world.removeEntity(fx.lightningEntityId, Entity.RemovalReason.DISCARDED);
        fx.spawned = false;
        fx.lightningEntityId = Integer.MIN_VALUE;
    }

    private boolean isDead(LivingEntity entity) {
        return entity.deathTime > 0 || entity.isDead() || !entity.isAlive() || entity.getHealth() <= 0.0f;
    }

    private Vec3d landing(Entity entity) {
        double x2 = entity.getX();
        double y2 = entity.getY();
        double z2 = entity.getZ();
        double radius = Math.max(0.15, (double)entity.getWidth() * 0.35);
        Vec3d[] probes = new Vec3d[]{new Vec3d(x2, y2, z2), new Vec3d(x2 + radius, y2, z2), new Vec3d(x2 - radius, y2, z2), new Vec3d(x2, y2, z2 + radius), new Vec3d(x2, y2, z2 - radius)};
        Vec3d ceilingHit = null;
        for (Vec3d probe : probes) {
            Vec3d hit = this.ceiling(probe.x, probe.z, entity.getEyePos().y);
            if (hit == null || ceilingHit != null && !(hit.y < ceilingHit.y)) continue;
            ceilingHit = hit;
        }
        if (ceilingHit != null) {
            return ceilingHit;
        }
        Vec3d floorHit = this.floor(x2, z2, y2);
        for (int i2 = 1; i2 < probes.length; ++i2) {
            Vec3d hit = this.floor(probes[i2].x, probes[i2].z, y2);
            if (!(hit.y > floorHit.y)) continue;
            floorHit = hit;
        }
        return floorHit;
    }

    private Vec3d ceiling(double x2, double z2, double fromY) {
        if (KillEffect.mc.world == null) {
            return null;
        }
        BlockPos.Mutable pos = new BlockPos.Mutable();
        int minY = Math.max(KillEffect.mc.world.getBottomY(), MathHelper.floor((double)(fromY + 0.1)));
        int maxY = Math.min(KillEffect.mc.world.getTopYInclusive(), MathHelper.floor((double)(fromY + 16.0)));
        int blockX = MathHelper.floor((double)x2);
        int blockZ = MathHelper.floor((double)z2);
        for (int y2 = minY; y2 <= maxY; ++y2) {
            pos.set(blockX, y2, blockZ);
            BlockState state = KillEffect.mc.world.getBlockState((BlockPos)pos);
            if (state.isAir()) continue;
            return new Vec3d(x2, (double)y2 + 1.02, z2);
        }
        return null;
    }

    private Vec3d floor(double x2, double z2, double fromY) {
        if (KillEffect.mc.world == null || KillEffect.mc.player == null) {
            return new Vec3d(x2, fromY, z2);
        }
        Vec3d from = new Vec3d(x2, fromY + 12.0, z2);
        Vec3d to = new Vec3d(x2, fromY - 24.0, z2);
        BlockHitResult hit = KillEffect.mc.world.raycast(new RaycastContext(from, to, RaycastContext.ShapeType.COLLIDER, RaycastContext.FluidHandling.NONE, (Entity)KillEffect.mc.player));
        return hit.getType() == HitResult.Type.BLOCK ? hit.getPos().add(0.0, 0.02, 0.0) : new Vec3d(x2, fromY, z2);
    }

    private void renderBeam(Event3DRender event, Fx fx, long now) {
        Vec3d camera = event.getCamera().getPos();
        long elapsed = now - fx.time;
        float fade = 1.0f - MathHelper.clamp((float)((float)elapsed / 9200.0f), (float)0.0f, (float)1.0f);
        float poolFade = 1.0f - MathHelper.clamp((float)((float)elapsed / 6171.0f), (float)0.0f, (float)1.0f);
        float drop = this.ease(MathHelper.clamp((float)((float)elapsed / 7260.0f), (float)0.0f, (float)1.0f));
        float vanish = this.ease(MathHelper.clamp((float)((float)(elapsed - 7260L) / 1940.0f), (float)0.0f, (float)1.0f));
        float height = Math.max(0.0f, fx.height + 3.7f);
        float top = MathHelper.lerp((float)vanish, (float)height, (float)0.0f);
        float width = (1.15f - 0.5f * vanish) * (0.92f + 0.08f * (float)Math.sin(((float)elapsed + event.getTickDelta() * 50.0f) * 0.03f));
        float start = MathHelper.lerp((float)(1.0f - drop), (float)height, (float)0.0f);
        if (top <= start + 0.02f) {
            start = Math.max(0.0f, top - 0.02f);
        }
        int client = ColorUtils.getThemeColor();
        int clientDark = ColorUtils.darken(client, 0.45f);
        int clientLight = ColorUtils.interpolateColor(client, ColorUtils.rgba(255, 255, 255, 255), 0.35f);
        int clientCore = ColorUtils.interpolateColor(client, ColorUtils.rgba(255, 255, 255, 255), 0.55f);
        MatrixStack matrices = event.getMatrices();
        matrices.push();
        matrices.translate(fx.ground.x - camera.x, fx.ground.y - camera.y, fx.ground.z - camera.z);
        RenderSystem.enableBlend();
        RenderSystem.disableCull();
        RenderSystem.enableDepthTest();
        RenderSystem.depthMask((boolean)false);
        RenderSystem.setShader((ShaderProgramKey)ShaderProgramKeys.POSITION_TEX_COLOR);
        RenderSystem.setShaderTexture((int)0, (Identifier)BLOOM);
        RenderSystem.blendFunc((GlStateManager.SrcFactor)GlStateManager.SrcFactor.SRC_ALPHA, (GlStateManager.DstFactor)GlStateManager.DstFactor.ONE);
        this.drawBeamLayer(matrices, start, top, width, ColorUtils.setAlphaColor(clientLight, (int)(120.0f * fade)), 0, (float)elapsed * 0.08f);
        this.drawBeamLayer(matrices, start, top, width * 0.45f, ColorUtils.setAlphaColor(clientCore, (int)(230.0f * fade)), (int)(65.0f * fade), (float)elapsed * 0.08f + 45.0f);
        this.drawPool(matrices, poolFade, vanish, fx.width, elapsed, clientDark, client, clientCore);
        this.drawHead(event, matrices, fade, top, fx.width, clientCore);
        RenderSystem.defaultBlendFunc();
        RenderSystem.enableCull();
        RenderSystem.depthMask((boolean)true);
        RenderSystem.disableBlend();
        matrices.pop();
    }

    private void drawBeamLayer(MatrixStack matrices, float y0, float y1, float width, int bottomColor, int topAlpha, float spin) {
        for (int i2 = 0; i2 < 3; ++i2) {
            matrices.push();
            matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(spin + (float)i2 * 60.0f));
            this.drawVerticalQuad(matrices, -width * 0.5f, y0, width * 0.5f, y1, bottomColor, topAlpha);
            matrices.pop();
        }
    }

    private void drawVerticalQuad(MatrixStack matrices, float x0, float y0, float x1, float y1, int bottomColor, int topAlpha) {
        int red = ColorUtils.red(bottomColor);
        int green = ColorUtils.green(bottomColor);
        int blue = ColorUtils.blue(bottomColor);
        int alpha = ColorUtils.getAlpha(bottomColor);
        BufferBuilder buffer = Tessellator.getInstance().begin(VertexFormat.DrawMode.QUADS, VertexFormats.POSITION_TEXTURE_COLOR);
        buffer.vertex(matrices.peek().getPositionMatrix(), x0, y0, 0.0f).texture(0.0f, 1.0f).color(red, green, blue, alpha);
        buffer.vertex(matrices.peek().getPositionMatrix(), x1, y0, 0.0f).texture(1.0f, 1.0f).color(red, green, blue, alpha);
        buffer.vertex(matrices.peek().getPositionMatrix(), x1, y1, 0.0f).texture(1.0f, 0.0f).color(red, green, blue, topAlpha);
        buffer.vertex(matrices.peek().getPositionMatrix(), x0, y1, 0.0f).texture(0.0f, 0.0f).color(red, green, blue, topAlpha);
        BufferRenderer.drawWithGlobalProgram((BuiltBuffer)buffer.end());
    }

    private void drawPool(MatrixStack matrices, float fade, float vanish, float entityWidth, long elapsed, int outerColor, int midColor, int coreColor) {
        float size = Math.max(3.2f, entityWidth * 6.4f) * (1.0f - 0.12f * vanish);
        float core = size * 0.62f;
        float halo = size * 1.22f;
        float wobble = 0.2f * (float)Math.sin((float)elapsed * 0.01f);
        this.drawFlatQuad(matrices, 0.02f, halo + wobble, ColorUtils.setAlphaColor(outerColor, (int)(80.0f * fade)));
        this.drawFlatQuad(matrices, 0.03f, size, ColorUtils.setAlphaColor(midColor, (int)(125.0f * fade)));
        this.drawFlatQuad(matrices, 0.04f, core, ColorUtils.setAlphaColor(coreColor, (int)(210.0f * fade)));
    }

    private void drawFlatQuad(MatrixStack matrices, float y2, float size, int color) {
        float half = size * 0.5f;
        int red = ColorUtils.red(color);
        int green = ColorUtils.green(color);
        int blue = ColorUtils.blue(color);
        int alpha = ColorUtils.getAlpha(color);
        BufferBuilder buffer = Tessellator.getInstance().begin(VertexFormat.DrawMode.QUADS, VertexFormats.POSITION_TEXTURE_COLOR);
        buffer.vertex(matrices.peek().getPositionMatrix(), -half, y2, -half).texture(0.0f, 0.0f).color(red, green, blue, alpha);
        buffer.vertex(matrices.peek().getPositionMatrix(), half, y2, -half).texture(1.0f, 0.0f).color(red, green, blue, alpha);
        buffer.vertex(matrices.peek().getPositionMatrix(), half, y2, half).texture(1.0f, 1.0f).color(red, green, blue, alpha);
        buffer.vertex(matrices.peek().getPositionMatrix(), -half, y2, half).texture(0.0f, 1.0f).color(red, green, blue, alpha);
        BufferRenderer.drawWithGlobalProgram((BuiltBuffer)buffer.end());
    }

    private void drawHead(Event3DRender event, MatrixStack matrices, float fade, float top, float width, int color) {
        float size = Math.max(0.8f, width * 2.2f);
        float half = size * 0.5f;
        int headColor = ColorUtils.setAlphaColor(color, (int)(110.0f * fade));
        int red = ColorUtils.red(headColor);
        int green = ColorUtils.green(headColor);
        int blue = ColorUtils.blue(headColor);
        int alpha = ColorUtils.getAlpha(headColor);
        matrices.push();
        matrices.translate(0.0f, Math.max(0.5f, top), 0.0f);
        matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(-event.getCamera().getYaw()));
        matrices.multiply(RotationAxis.POSITIVE_X.rotationDegrees(event.getCamera().getPitch()));
        BufferBuilder buffer = Tessellator.getInstance().begin(VertexFormat.DrawMode.QUADS, VertexFormats.POSITION_TEXTURE_COLOR);
        buffer.vertex(matrices.peek().getPositionMatrix(), -half, -half, 0.0f).texture(0.0f, 1.0f).color(red, green, blue, alpha);
        buffer.vertex(matrices.peek().getPositionMatrix(), -half, half, 0.0f).texture(0.0f, 0.0f).color(red, green, blue, alpha);
        buffer.vertex(matrices.peek().getPositionMatrix(), half, half, 0.0f).texture(1.0f, 0.0f).color(red, green, blue, alpha);
        buffer.vertex(matrices.peek().getPositionMatrix(), half, -half, 0.0f).texture(1.0f, 1.0f).color(red, green, blue, alpha);
        BufferRenderer.drawWithGlobalProgram((BuiltBuffer)buffer.end());
        matrices.pop();
    }

    private float ease(float value) {
        float inverted = 1.0f - value;
        return 1.0f - inverted * inverted * inverted;
    }

    private static final class Fx {
        private final long time;
        private final Vec3d ground;
        private final float height;
        private final float width;
        private boolean spawned;
        private int lightningEntityId = Integer.MIN_VALUE;

        private Fx(long time, Vec3d ground, float height, float width) {
            this.time = time;
            this.ground = ground;
            this.height = height;
            this.width = width;
        }
    }

    private static final class TrackedTarget {
        private final LivingEntity entity;
        private final long time;

        private TrackedTarget(LivingEntity entity, long time) {
            this.entity = entity;
            this.time = time;
        }
    }
}