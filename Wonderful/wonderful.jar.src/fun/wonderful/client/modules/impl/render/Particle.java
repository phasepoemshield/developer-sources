package fun.wonderful.client.modules.impl.render;

import com.mojang.blaze3d.systems.RenderSystem;
import fun.wonderful.api.events.EventLink;
import fun.wonderful.api.events.implement.Event3DRender;
import fun.wonderful.api.events.implement.EventAttackEntity;
import fun.wonderful.api.events.implement.EventPacket;
import fun.wonderful.api.events.implement.EventUpdate;
import fun.wonderful.api.utils.color.ColorUtils;
import fun.wonderful.client.modules.Module;
import fun.wonderful.client.modules.settings.implement.BooleanSetting;
import fun.wonderful.client.modules.settings.implement.FloatSetting;
import fun.wonderful.client.modules.settings.implement.ListSetting;
import fun.wonderful.client.modules.settings.implement.ModeSetting;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import net.minecraft.client.gl.ShaderProgramKeys;
import net.minecraft.client.gl.ShaderProgramKey;
import net.minecraft.entity.Entity;
import net.minecraft.entity.projectile.thrown.EnderPearlEntity;
import net.minecraft.entity.projectile.TridentEntity;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Position;
import net.minecraft.util.math.Box;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.EntityStatusS2CPacket;
import net.minecraft.block.BlockState;
import net.minecraft.client.render.BufferRenderer;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.render.Tessellator;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.render.VertexFormat;
import net.minecraft.util.Identifier;
import net.minecraft.client.MinecraftClient;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.RaycastContext;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.RotationAxis;
import net.minecraft.client.render.BuiltBuffer;
import org.joml.Matrix4f;

public class Particle
extends Module {
    public static Particle INSTANCE = new Particle();
    private static final Identifier STAR_TEXTURE = Identifier.of((String)"wonderful", (String)"textures/particle/star.png");
    private static final Identifier HEART_TEXTURE = Identifier.of((String)"wonderful", (String)"textures/particle/heart.png");
    private static final Identifier DOLLAR_TEXTURE = Identifier.of((String)"wonderful", (String)"textures/particle/dollar.png");
    private static final Identifier BLOOM_TEXTURE = Identifier.of((String)"wonderful", (String)"textures/particle/bloom.png");
    private static final Identifier SPARKLE_TEXTURE = Identifier.of((String)"wonderful", (String)"textures/particle/sparkle.png");
    private final ModeSetting type = new ModeSetting("Тип частиц", "Звездочки", "Звездочки", "Сердечки", "Доллары", "Блум", "Сияние");
    private final ListSetting reason = new ListSetting("Добавлять при", new BooleanSetting("Бездействии", false), new BooleanSetting("Беге", false), new BooleanSetting("Ударе", true), new BooleanSetting("Падении перла", false), new BooleanSetting("Падении трезубца", false), new BooleanSetting("Сносе тотема", true));
    private final FloatSetting count = new FloatSetting("Количество", 10.0f, 2.0f, 40.0f, 1.0f);
    private final BooleanSetting glow = new BooleanSetting("Свечение", true);
    private final ArrayList<ParticleData> particles = new ArrayList();
    private final Random rnd = new Random();

    public Particle() {
        super("Particles", "Партиклы при разных действиях", Module.ModuleCategory.RENDER);
        this.addSettings(this.type, this.reason, this.count, this.glow);
    }

    @Override
    public void onDisable() {
        this.particles.clear();
        super.onDisable();
    }

    private Identifier getTexture() {
        return switch (this.type.getIndex()) {
            case 1 -> HEART_TEXTURE;
            case 2 -> DOLLAR_TEXTURE;
            case 3 -> BLOOM_TEXTURE;
            case 4 -> SPARKLE_TEXTURE;
            default -> STAR_TEXTURE;
        };
    }

    private boolean isPositionInBlock(Vec3d position) {
        if (Particle.mc.world == null || Particle.mc.player == null) {
            return true;
        }
        BlockPos blockPos = BlockPos.ofFloored((Position)position);
        if (Particle.mc.world.getBlockState(blockPos).isSolidBlock((BlockView)Particle.mc.world, blockPos)) {
            return true;
        }
        RaycastContext context = new RaycastContext(new Vec3d(Particle.mc.player.getX(), Particle.mc.player.getY() + (double)Particle.mc.player.getStandingEyeHeight(), Particle.mc.player.getZ()), position, RaycastContext.class_3960.COLLIDER, RaycastContext.class_242.NONE, (Entity)Particle.mc.player);
        BlockHitResult result = Particle.mc.world.raycast(context);
        return result.getType() == HitResult.class_240.BLOCK;
    }

    private float random(float min, float max) {
        return min + this.rnd.nextFloat() * (max - min);
    }

    private boolean isMoving() {
        return Particle.mc.player != null && (Particle.mc.player.input.movementForward != 0.0f || Particle.mc.player.input.movementSideways != 0.0f);
    }

    @EventLink
    public void onAttack(EventAttackEntity event) {
        Entity target;
        if (Particle.mc.player == null || Particle.mc.world == null) {
            return;
        }
        if (this.reason.is("Ударе") && (target = event.getTarget()) != null) {
            for (int i2 = 0; i2 < 35; ++i2) {
                double targetZ;
                double targetY;
                double targetX = target.getX() + (double)this.random(-0.4f, 0.4f);
                if (this.isPositionInBlock(new Vec3d(targetX, targetY = target.getY() + (double)this.random(-0.4f, target.getHeight() + 0.4f), targetZ = target.getZ() + (double)this.random(-0.4f, 0.4f)))) continue;
                float baseMx = this.random(-0.8f, 0.8f) * 2.0f;
                float baseMy = this.random(-0.25f, 1.4f);
                float baseMz = this.random(-0.8f, 0.8f) * 2.0f;
                Vec3d velocity = new Vec3d((double)(baseMx * 0.075f), (double)(baseMy * 0.075f), (double)(baseMz * 0.075f));
                long life = (long)this.random(1000.0f, 1200.0f);
                this.addParticle(targetX, targetY, targetZ, velocity, ColorUtils.getThemeColor(), 0.3f, life, 0.5f, 7.0E-4f);
            }
        }
    }

    @EventLink
    public void onPacket(EventPacket e2) {
        Entity entity;
        EntityStatusS2CPacket packet;
        if (Particle.mc.world == null || Particle.mc.player == null) {
            return;
        }
        if (!this.reason.is("Сносе тотема")) {
            return;
        }
        Packet<?> class_25962 = e2.getPacket();
        if (class_25962 instanceof EntityStatusS2CPacket && (packet = (EntityStatusS2CPacket)class_25962).getStatus() == 35 && (entity = packet.getEntity((World)Particle.mc.world)) != null) {
            double centerX = entity.getX();
            double centerY = entity.getY() + (double)entity.getHeight() / 2.0;
            double centerZ = entity.getZ();
            for (int i2 = 0; i2 < 50; ++i2) {
                double spawnZ;
                double spawnY;
                double theta = this.rnd.nextDouble() * 2.0 * Math.PI;
                double phi = this.rnd.nextDouble() * Math.PI;
                double speed = (this.rnd.nextDouble() * 0.5 + 0.5) * 0.1;
                double vx = Math.sin(phi) * Math.cos(theta) * speed;
                double vy = Math.sin(phi) * Math.sin(theta) * speed;
                double vz = Math.cos(phi) * speed;
                double spawnX = centerX + (double)this.random(-0.3f, 0.3f);
                if (this.isPositionInBlock(new Vec3d(spawnX, spawnY = centerY + (double)this.random(-0.3f, 0.3f), spawnZ = centerZ + (double)this.random(-0.3f, 0.3f)))) continue;
                int color = this.rnd.nextDouble() < 0.7 ? -16711936 : -256;
                long life = (long)this.random(1500.0f, 2000.0f);
                this.addParticle(spawnX, spawnY, spawnZ, new Vec3d(vx, vy, vz), color, 0.3f, life, 2.0f, 5.0E-5f);
            }
        }
    }

    @EventLink
    public void onUpdate(EventUpdate e3) {
        if (Particle.mc.player == null || Particle.mc.world == null) {
            return;
        }
        int particleCount = (int)this.count.get();
        if (this.reason.is("Бездействии")) {
            Vec3d base = new Vec3d(Particle.mc.player.getX(), Particle.mc.player.getY() + (double)Particle.mc.player.getHeight() / 2.0, Particle.mc.player.getZ());
            for (int i2 = 0; i2 < particleCount; ++i2) {
                double spawnZ;
                double spawnY;
                double distance = this.random(7.0f, 35.0f);
                double angle = Math.toRadians(this.random(0.0f, 360.0f));
                double height = this.random(-7.0f, 25.0f);
                double spawnX = base.x + Math.cos(angle) * distance;
                Vec3d spawnPos = new Vec3d(spawnX, spawnY = base.y + height, spawnZ = base.z + Math.sin(angle) * distance);
                if (this.isPositionInBlock(spawnPos)) continue;
                long life = (long)this.random(1500.0f, 2000.0f);
                double speed = this.rnd.nextDouble() < 0.8 ? (double)this.random(0.015f, 0.03f) : 0.125;
                double phi = Math.toRadians(this.random(0.0f, 360.0f));
                Vec3d velocity = new Vec3d(Math.cos(phi) * speed, (double)this.random((float)(-speed * (double)0.1f), (float)(speed * (double)0.1f)), Math.sin(phi) * speed);
                this.addParticle(spawnX, spawnY, spawnZ, velocity, ColorUtils.getThemeColor(), 0.3f, life, 3.0f, 5.0E-5f);
            }
        }
        if (this.reason.is("Беге") && this.isMoving()) {
            double posZ;
            double posY;
            Vec3d motion = Particle.mc.player.getVelocity();
            double speed = Math.sqrt(motion.x * motion.x + motion.z * motion.z);
            Vec3d direction = speed < 0.01 ? Particle.mc.player.getRotationVector().multiply(-1.0) : (Particle.mc.player.isGliding() ? motion.normalize().multiply(-1.0) : new Vec3d(-motion.x / speed, 0.0, -motion.z / speed));
            double distanceBehind = (Particle.mc.player.isGliding() ? 1.2 : 0.5) + (speed > 0.1 ? speed * 1.5 : 0.0);
            double offsetX = this.random(-0.35f, 0.35f);
            double offsetZ = this.random(-0.35f, 0.35f);
            double posX = Particle.mc.player.getX() + direction.x * distanceBehind + offsetX;
            if (!this.isPositionInBlock(new Vec3d(posX, posY = Particle.mc.player.isGliding() ? Particle.mc.player.getY() + (double)Particle.mc.player.getHeight() / 2.0 + direction.y * distanceBehind + (double)this.random(-0.35f, 0.35f) : Particle.mc.player.getY() + (double)this.random(0.2f, Particle.mc.player.getHeight() + 0.1f), posZ = Particle.mc.player.getZ() + direction.z * distanceBehind + offsetZ))) {
                double baseSpeed = 0.075;
                Vec3d velocity = direction.multiply(baseSpeed).add((double)this.random(-0.01f, 0.01f), (double)this.random(-0.05f, 0.01f), (double)this.random(-0.01f, 0.01f)).multiply(0.1);
                long life = (long)this.random(1500.0f, 2000.0f);
                this.addParticle(posX, posY, posZ, velocity, ColorUtils.getThemeColor(), 0.3f, life, 3.0f, 5.0E-5f);
            }
        }
        boolean trackPearls = this.reason.is("Падении перла");
        boolean trackTridents = this.reason.is("Падении трезубца");
        if (trackPearls || trackTridents) {
            Box searchBox = Particle.mc.player.getBoundingBox().expand(100.0);
            List entities = Particle.mc.world.getOtherEntities(null, searchBox, e2 -> true);
            for (Entity entity : entities) {
                TridentEntity trident;
                EnderPearlEntity pearl;
                if (trackPearls && entity instanceof EnderPearlEntity && !(pearl = (EnderPearlEntity)entity).isOnGround()) {
                    this.createProjectileParticles(pearl.getPos(), 1);
                }
                if (!trackTridents || !(entity instanceof TridentEntity) || !((trident = (TridentEntity)entity).getVelocity().lengthSquared() > 0.01)) continue;
                this.createProjectileParticles(trident.getPos(), 1);
            }
        }
    }

    private void createProjectileParticles(Vec3d position, int cnt) {
        int particleColor = ColorUtils.getThemeColor();
        int i2 = 0;
        while ((double)i2 < (double)cnt * 2.5) {
            double dy = this.random(0.1f, 0.35f);
            Vec3d particlePos = new Vec3d(position.x, position.y + dy, position.z);
            if (!this.isPositionInBlock(particlePos)) {
                float speedMin = this.random(0.015f, 0.0375f);
                float speedMax = this.random(0.05f, 0.075f);
                double speedFinal = this.random(speedMin, speedMax);
                double speedFinalY = speedFinal * 0.4;
                double angleVel = Math.toRadians(this.random(0.0f, 360.0f));
                Vec3d velocity = new Vec3d(Math.cos(angleVel) * speedFinal, (double)this.random((float)(-speedFinalY), (float)speedFinalY), Math.sin(angleVel) * speedFinal);
                long life = (long)this.random(2400.0f, 2800.0f);
                this.addParticle(particlePos.x, particlePos.y, particlePos.z, velocity, particleColor, 0.25f, life, 2.0f, 5.0E-5f);
            }
            ++i2;
        }
    }

    private void addParticle(double x2, double y2, double z2, Vec3d velocity, int color, float size, long lifeTime, float smooth, double gravity) {
        if (ParticleData.checkCollision(x2, y2, z2, size, mc)) {
            ArrayList<ParticleData> arrayList = this.particles;
            synchronized (arrayList) {
                this.particles.add(new ParticleData(new Vec3d(x2, y2, z2), velocity, color, size, lifeTime, smooth, gravity));
            }
        }
    }

    @EventLink
    public void onRender3D(Event3DRender e2) {
        ArrayList<ParticleData> renderList;
        if (Particle.mc.player == null || Particle.mc.world == null) {
            return;
        }
        ArrayList<ParticleData> arrayList = this.particles;
        synchronized (arrayList) {
            this.particles.removeIf(ParticleData::isDead);
        }
        if (this.particles.isEmpty()) {
            return;
        }
        MatrixStack matrices = e2.getMatrices();
        Vec3d camera = Particle.mc.gameRenderer.getCamera().getPos();
        Identifier texture = this.getTexture();
        RenderSystem.enableBlend();
        RenderSystem.disableDepthTest();
        RenderSystem.depthMask((boolean)false);
        RenderSystem.disableCull();
        if (this.glow.isState()) {
            RenderSystem.blendFunc((int)770, (int)1);
        } else {
            RenderSystem.defaultBlendFunc();
        }
        RenderSystem.setShaderTexture((int)0, (Identifier)texture);
        RenderSystem.setShader((ShaderProgramKey)ShaderProgramKeys.POSITION_TEX_COLOR);
        ArrayList<ParticleData> arrayList2 = this.particles;
        synchronized (arrayList2) {
            renderList = new ArrayList<ParticleData>(this.particles);
        }
        for (ParticleData particle : renderList) {
            particle.update(mc);
            double x2 = particle.position.x - camera.x;
            double y2 = particle.position.y - camera.y;
            double z2 = particle.position.z - camera.z;
            matrices.push();
            matrices.translate((float)x2, (float)y2, (float)z2);
            matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(-Particle.mc.gameRenderer.getCamera().getYaw()));
            matrices.multiply(RotationAxis.POSITIVE_X.rotationDegrees(Particle.mc.gameRenderer.getCamera().getPitch()));
            Matrix4f matrix = matrices.peek().getPositionMatrix();
            float half = particle.size / 2.0f;
            int alpha = (int)(particle.alpha * 255.0f);
            int r2 = particle.color >> 16 & 0xFF;
            int g2 = particle.color >> 8 & 0xFF;
            int b2 = particle.color & 0xFF;
            BufferBuilder buffer = Tessellator.getInstance().begin(VertexFormat.class_5596.QUADS, VertexFormats.POSITION_TEXTURE_COLOR);
            buffer.vertex(matrix, -half, -half, 0.0f).texture(0.0f, 1.0f).color(r2, g2, b2, alpha);
            buffer.vertex(matrix, -half, half, 0.0f).texture(0.0f, 0.0f).color(r2, g2, b2, alpha);
            buffer.vertex(matrix, half, half, 0.0f).texture(1.0f, 0.0f).color(r2, g2, b2, alpha);
            buffer.vertex(matrix, half, -half, 0.0f).texture(1.0f, 1.0f).color(r2, g2, b2, alpha);
            BufferRenderer.drawWithGlobalProgram((BuiltBuffer)buffer.end());
            matrices.pop();
        }
        RenderSystem.enableCull();
        RenderSystem.depthMask((boolean)true);
        RenderSystem.enableDepthTest();
        RenderSystem.defaultBlendFunc();
        RenderSystem.disableBlend();
    }

    static class ParticleData {
        Vec3d position;
        Vec3d velocity;
        int color;
        float size;
        long lifeTime;
        long birthTime;
        float alpha = 1.0f;
        float smoothFactor;
        long lastUpdateNs;
        double gravity;

        ParticleData(Vec3d position, Vec3d velocity, int color, float size, long lifeTime, float smooth, double gravity) {
            this.position = position;
            this.velocity = velocity;
            this.color = color;
            this.size = size;
            this.lifeTime = lifeTime;
            this.birthTime = System.currentTimeMillis();
            this.lastUpdateNs = System.nanoTime();
            this.smoothFactor = smooth;
            this.gravity = gravity;
        }

        boolean isDead() {
            return System.currentTimeMillis() - this.birthTime >= this.lifeTime;
        }

        void update(MinecraftClient mc) {
            long nowNs = System.nanoTime();
            double deltaSec = (double)(nowNs - this.lastUpdateNs) / 1.0E9;
            this.lastUpdateNs = nowNs;
            float progress = Math.min(1.0f, (float)(System.currentTimeMillis() - this.birthTime) / (float)this.lifeTime);
            double factor = Math.pow(1.0 - (double)progress, this.smoothFactor);
            double vx = this.velocity.x;
            double vy = this.velocity.y;
            double vz = this.velocity.z;
            double newX = this.position.x;
            double newY = this.position.y;
            double newZ = this.position.z;
            if (!ParticleData.checkCollision(newX += vx * factor * (deltaSec * 60.0), this.position.y, this.position.z, this.size, mc)) {
                vx = -vx * 0.8;
                newX = this.position.x;
            }
            if (!ParticleData.checkCollision(newX, newY += vy * factor * (deltaSec * 60.0), this.position.z, this.size, mc)) {
                vy = -vy * 1.5;
                newY = this.position.y;
            }
            if (!ParticleData.checkCollision(newX, newY, newZ += vz * factor * (deltaSec * 60.0), this.size, mc)) {
                vz = -vz * 0.8;
                newZ = this.position.z;
            }
            this.position = new Vec3d(newX, newY, newZ);
            this.velocity = new Vec3d(vx * 0.9999, vy * 0.9999 - this.gravity, vz * 0.9999);
            this.alpha = 1.0f - progress;
        }

        static boolean checkCollision(double x2, double y2, double z2, float size, MinecraftClient mc) {
            if (mc.world == null) {
                return false;
            }
            double half = (double)size * 0.5;
            int minX = MathHelper.floor((double)(x2 - half));
            int maxX = MathHelper.floor((double)(x2 + half));
            int minY = MathHelper.floor((double)(y2 - half));
            int maxY = MathHelper.floor((double)(y2 + half));
            int minZ = MathHelper.floor((double)(z2 - half));
            int maxZ = MathHelper.floor((double)(z2 + half));
            BlockPos.class_2339 pos = new BlockPos.class_2339();
            for (int bx = minX; bx <= maxX; ++bx) {
                for (int by = minY; by <= maxY; ++by) {
                    for (int bz = minZ; bz <= maxZ; ++bz) {
                        pos.set(bx, by, bz);
                        BlockState state = mc.world.getBlockState((BlockPos)pos);
                        if (state.isAir() || !state.isSolidBlock((BlockView)mc.world, (BlockPos)pos)) continue;
                        return false;
                    }
                }
            }
            return true;
        }
    }
}