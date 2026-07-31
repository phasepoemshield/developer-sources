package fun.nexisdlc.modules.impl.render;

import fun.nexisdlc.client.ClientColors;
import fun.nexisdlc.client.events.impl.client.EventPacket;
import fun.nexisdlc.client.events.impl.entity.EventAttack;
import fun.nexisdlc.client.events.impl.entity.EventJump;
import fun.nexisdlc.client.events.impl.client.UpdateEvent;
import fun.nexisdlc.client.events.impl.render.EventRender;
import fun.nexisdlc.client.utils.eventbus.EventHandler;
import fun.nexisdlc.client.utils.player.PlayerUtils;
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
import net.minecraft.client.render.Camera;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket;
import net.minecraft.network.packet.s2c.play.EntityStatusS2CPacket;
import net.minecraft.network.packet.s2c.play.ParticleS2CPacket;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.util.Identifier;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RotationAxis;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.random.Random;
import org.joml.Matrix4f;
import org.joml.Vector4f;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@FunctionAdd(name = "Particles", alias = "Particles", category = Category.Render, description = "Кастомные партиклы при тотеме, ударе и прыжке")
public class Particles extends Function {
    public BooleanSetting onTotem = new BooleanSetting("При тотеме", true);

    public SliderSetting countPerTrigger = new SliderSetting("Кол-во за триггер", 3, 1, 10, 1);
    public SliderSetting size = new SliderSetting("Размер", 0.5f, 0.3f, 0.7f, 0.1f);
    public SliderSetting totemCount = new SliderSetting("Кол-во при тотеме", 35, 1, 60, 1)
            .setVisible(() -> onTotem.get());
    public SliderSetting totemSize = new SliderSetting("Размер при тотеме", 0.3f, 0.1f, 0.9f, 0.1f)
            .setVisible(() -> onTotem.get());
    public ModeSetting texture = new ModeSetting("Текстура", "Глоу", "Глоу", "Звезда", "Доллар", "Снежинка", "Сердце", "Корона", "Молния");
    public static ModeSetting colorMode = new ModeSetting("Цвет", "Клиент", "Клиент", "Свой", "Гирлянда", "Рандомный");
    public static ColorSetting customColor = new ColorSetting("Свой цвет", ColorUtils.rgb(255, 255, 150))
            .setVisible(() -> colorMode.is("Свой"));

    public BooleanSetting onAttack = new BooleanSetting("При ударе", true);
    public BooleanSetting onMove = new BooleanSetting("При движении", true);
    public BooleanSetting onDrop = new BooleanSetting("При выбросе", true);
    public BooleanSetting onJump = new BooleanSetting("При прыжке", true);
    public BooleanSetting onUse = new BooleanSetting("При использовании", true);
    public BooleanSetting onBreak = new BooleanSetting("При ломке блока", true);

    private static final Random random = Random.create();
    private static final int[] RANDOM_PALETTE = {
            ColorUtils.rgb(20, 115, 255),   // electric blue
            ColorUtils.rgb(35, 230, 70),    // vivid green
            ColorUtils.rgb(255, 200, 0),    // rich yellow
            ColorUtils.rgb(255, 120, 20),   // vivid orange
            ColorUtils.rgb(255, 45, 45),    // vivid red
            ColorUtils.rgb(255, 35, 150),   // saturated pink
            ColorUtils.rgb(160, 60, 255)    // vibrant purple
    };
    private final List<Particle> particles = new ArrayList<>();
    private final Object particleLock = new Object();

    private long lastMoveParticleTime = 0L;
    private long lastUseParticleTime = 0L;
    private static final long PARTICLE_INTERVAL = 100L;
    private long lastAttackTime = 0;
    private long lastDropTime = 0;
    private static final int DEFAULT_LIFETIME_MS = 950;
    private static final int TOTEM_LIFETIME_MS = 3000;
    private static final byte TOTEM_STATUS = 35;

    public Particles() {
        addSettings(countPerTrigger, size, totemCount, totemSize, texture, colorMode, customColor,
                onAttack, onMove, onDrop, onJump, onUse, onBreak, onTotem);
    }

    @Override
    public void onEnable() {
        super.onEnable();
        synchronized (particleLock) {
            particles.clear();
        }
        resetStates();
    }

    @Override
    public void onDisable() {
        super.onDisable();
        synchronized (particleLock) {
            particles.clear();
        }
    }

    private void resetStates() {
        lastMoveParticleTime = 0;
        lastUseParticleTime = 0;
        lastAttackTime = 0;
        lastDropTime = 0;
    }

    @EventHandler
    public void onAttack(EventAttack.Hurt event) {
        if (!onAttack.get()) return;
        if (nullCheck()) return;
        if (event.getTarget() == null) return;

        if (System.currentTimeMillis() - lastAttackTime > 200) {
            lastAttackTime = System.currentTimeMillis();
            spawnAroundEntity(event.getTarget(), (int) (countPerTrigger.get().intValue() * 1.75f));
        }
    }

    @EventHandler
    public void onUpdate(UpdateEvent event) {
        if (nullCheck()) return;

        long now = System.currentTimeMillis();
        synchronized (particleLock) {
            particles.removeIf(p -> now - p.spawnTime >= p.lifetimeMs);
        }

        if (onMove.get()) {
            if (PlayerUtils.isMoving()) {
                long currentTime = System.currentTimeMillis();

                if (currentTime - lastMoveParticleTime >= PARTICLE_INTERVAL) {
                    spawnAroundPlayer(new Vec3d(mc.player.getX(), mc.player.getY(), mc.player.getZ()), (int) (countPerTrigger.get().intValue() * 0.75f));
                    lastMoveParticleTime = currentTime;
                }
            } else {
                lastMoveParticleTime = 0L;
            }
        }

        if (onUse.get()) {
            if (mc.player.isUsingItem()) {
                long currentTime = System.currentTimeMillis();

                if (currentTime - lastUseParticleTime >= PARTICLE_INTERVAL) {
                    spawnAroundPlayer(new Vec3d(mc.player.getX(), mc.player.getY(), mc.player.getZ()), (int) (countPerTrigger.get().intValue() * 0.75f));
                    lastUseParticleTime = currentTime;
                }
            } else {
                lastUseParticleTime = 0L;
            }
        }

        if (onBreak.get() && mc.crosshairTarget instanceof BlockHitResult hit) {
            if (mc.options.attackKey.isPressed()) {
                Vec3d blockPos = hit.getPos();
                spawnAroundPos(blockPos, (int) (countPerTrigger.get().intValue() * 0.2f), false, true);
            }
        }

        synchronized (particleLock) {
            Iterator<Particle> iterator = particles.iterator();
            while (iterator.hasNext()) {
                iterator.next().tick();
            }
        }
    }

    @EventHandler
    public void onJump(EventJump event) {
        if (nullCheck()) return;

        if (onJump.get()) {
            spawnAroundPlayer(new Vec3d(mc.player.getX(), mc.player.getY(), mc.player.getZ()).add(0, 0.1, 0), (int) (countPerTrigger.get().intValue() * 1.75f));
        }
    }

    @EventHandler
    public void onPacket(EventPacket event) {
        if (!event.isSend() || nullCheck()) return;

        if (onDrop.get() && event.getPacket() instanceof PlayerActionC2SPacket packet) {
            if (packet.getAction() == PlayerActionC2SPacket.Action.DROP_ITEM
                    && System.currentTimeMillis() - lastDropTime > 300) {
                lastDropTime = System.currentTimeMillis();
                spawnAroundPlayer(mc.player.getEyePos(), (int) (countPerTrigger.get().intValue() * 1.75f));
            }
        }
    }

    @EventHandler
    public void onPacketReceive(EventPacket event) {
        if (!event.isReceive() || nullCheck()) return;
        if (event.getPacket() instanceof EntityStatusS2CPacket packet) {
            if (packet.getStatus() == TOTEM_STATUS && onTotem.get()) {
                var entity = packet.getEntity(mc.world);
                if (entity != null) {
                    int count = totemCount.get().intValue();
                    spawnAroundPos(new Vec3d(entity.getX(), entity.getY(), entity.getZ()).add(0, entity.getHeight() * 0.5, 0), count, true);
                }
            }
        }
        if (event.getPacket() instanceof ParticleS2CPacket particles && onAttack.get()) {
            var type = particles.getParameters().getType();
            if (type == ParticleTypes.DAMAGE_INDICATOR || type == ParticleTypes.CRIT || type == ParticleTypes.ENCHANTED_HIT) {
                event.cancel();
            }
        }
    }

    private void spawnAroundEntity(net.minecraft.entity.Entity entity, int count) {
        Vec3d pos = new Vec3d(entity.getX(), entity.getY(), entity.getZ()).add(0, entity.getHeight() * 0.5, 0);
        spawnAroundPos(pos, count);
    }

    private void spawnAroundPos(Vec3d center, int count) {
        spawnAroundPos(center, count, false, false);
    }

    private void spawnAroundPos(Vec3d center, int count, boolean totemColors) {
        spawnAroundPos(center, count, totemColors, false);
    }

    private void spawnAroundPos(Vec3d center, int count, boolean totemColors, boolean allowInBlock) {
        for (int i = 0; i < count; i++) {
            double offsetX = random.nextGaussian() * 0.1;
            double offsetY = random.nextGaussian() * 0.1;
            double offsetZ = random.nextGaussian() * 0.1;

            float x = (float) (center.x + offsetX);
            float y = (float) (center.y + 0.2f + offsetY);
            float z = (float) (center.z + offsetZ);

            float motionX = random.nextFloat() * 0.3f - 0.15f;
            float motionY = random.nextFloat() * 0.2f;
            float motionZ = random.nextFloat() * 0.3f - 0.15f;

            int lifeMs = totemColors ? TOTEM_LIFETIME_MS : DEFAULT_LIFETIME_MS;
            float particleSize = totemColors ? totemSize.get().floatValue() : size.get().floatValue();
            synchronized (particleLock) {
                particles.add(new Particle(x, y, z, motionX, motionY, motionZ, System.currentTimeMillis(), lifeMs, totemColors, particleSize, allowInBlock));
            }
        }
    }

    private void spawnAroundPlayer(Vec3d center, int count) {
        spawnAroundPos(center, count);
    }

    @EventHandler
    public void onRender3D(EventRender.World event) {
        if (nullCheck()) return;
        List<Particle> snapshot;
        synchronized (particleLock) {
            if (particles.isEmpty()) return;
            snapshot = new ArrayList<>(particles);
        }

        Camera camera = mc.gameRenderer.getCamera();
        Vec3d cameraPos = camera.getCameraPos();
        float tickDelta = event.getTicks();

        float fov = ((GameRendererAccessor) mc.gameRenderer).invokeGetFov(camera, tickDelta, true);

        try (WorldRenderer renderer = WorldRenderer.begin(mc, mc.getRenderTickCounter(), camera,
                event.getMatrixStack().peek().getPositionMatrix(), mc.gameRenderer.getBasicProjectionMatrix(fov))) {
            Identifier textureId = getTexture();
            VertexConsumer consumer = renderer.getBuffer(WorldRenderLayers.TEXTURED_QUADS_ADDITIVE(textureId));
            MatrixStack identity = new MatrixStack();
            WorldGeometryEmitter emitter = new WorldGeometryEmitter(camera, identity.peek(), consumer);

            int rendered = 0;
            int maxRender = 220;
            float maxDist = 64.0f; // максимальная дистанция видимости частиц
            for (Particle p : snapshot) {
                float x = p.prevPosX + (p.posX - p.prevPosX) * tickDelta;
                float y = p.prevPosY + (p.posY - p.prevPosY) * tickDelta;
                float z = p.prevPosZ + (p.posZ - p.prevPosZ) * tickDelta;
                float s = p.size;

                if (!p.allowInBlock && !mc.world.isAir(BlockPos.ofFloored(x, y, z))) {
                    continue;
                }

                // Дистанционная проверка вместо Frustum (Frustum ломается в F5)
                double dx = x - cameraPos.x;
                double dy = y - cameraPos.y;
                double dz = z - cameraPos.z;
                double distSq = dx * dx + dy * dy + dz * dz;
                if (distSq <= maxDist * maxDist) {
                    p.render(emitter, camera, s, tickDelta);
                    rendered++;
                    if (rendered >= maxRender) {
                        break;
                    }
                }
            }

            if (rendered > 0) {
                renderer.flush();
            }
        }
    }


    private Identifier getTexture() {
        return switch (texture.get()) {
            case "Глоу" -> Identifier.of("nexis", "images/etc/bloom.png");
            case "Звезда" -> Identifier.of("nexis", "images/etc/star.png");
            case "Доллар" -> Identifier.of("nexis", "images/etc/dollar.png");
            case "Снежинка" -> Identifier.of("nexis", "images/etc/snow.png");
            case "Сердце" -> Identifier.of("nexis", "images/etc/heart.png");
            case "Корона" -> Identifier.of("nexis", "images/etc/crown.png");
            case "Молния" -> Identifier.of("nexis", "images/etc/lightning.png");
            default -> Identifier.of("nexis", "images/etc/glow.png");
        };
    }

    private static class Particle {
        private float posX, posY, posZ;
        private float prevPosX, prevPosY, prevPosZ;
        private float motionX, motionY, motionZ;
        private final long spawnTime;
        private final int lifetimeMs;
        private final float rotationSpeed;
        private final int color;
        private final boolean totemColors;
        private final float size;
        private final boolean allowInBlock;
        private final Matrix4f scratchMatrix = new Matrix4f();
        private final Vector4f scratch0 = new Vector4f();
        private final Vector4f scratch1 = new Vector4f();
        private final Vector4f scratch2 = new Vector4f();
        private final Vector4f scratch3 = new Vector4f();

        public Particle(float x, float y, float z, float mx, float my, float mz, long spawnTime, int lifetimeMs,
                        boolean totemColors, float size, boolean allowInBlock) {
            this.posX = this.prevPosX = x;
            this.posY = this.prevPosY = y;
            this.posZ = this.prevPosZ = z;
            this.motionX = mx;
            this.motionY = my;
            this.motionZ = mz;
            this.spawnTime = spawnTime;
            this.lifetimeMs = Math.max(1, lifetimeMs);
            this.totemColors = totemColors;
            this.size = size;
            this.allowInBlock = allowInBlock;
            float baseSpeed = 40f + random.nextFloat() * 50f;
            this.rotationSpeed = random.nextBoolean() ? baseSpeed : -baseSpeed;

            if (totemColors) {
                this.color = random.nextBoolean() ? ColorUtils.rgb(90, 255, 90) : ColorUtils.rgb(255, 255, 90);
            } else if (colorMode.is("Гирлянда")) {
                int colorChoice = random.nextInt(3);
                if (colorChoice == 0) {
                    this.color = ColorUtils.rgb(255, 30, 30);
                } else if (colorChoice == 1) {
                    this.color = ColorUtils.rgb(30, 255, 30);
                } else {
                    this.color = ColorUtils.rgb(30, 120, 255);
                }
            } else if (colorMode.is("Рандомный")) {
                this.color = RANDOM_PALETTE[random.nextInt(RANDOM_PALETTE.length)];
            } else {
                this.color = ClientColors.ICON.getRGB();
            }
        }

        public void tick() {
            prevPosX = posX;
            prevPosY = posY;
            prevPosZ = posZ;

            posX += motionX;
            posY += motionY;
            posZ += motionZ;

            motionX *= 0.85f;
            motionY *= 0.85f;
            motionZ *= 0.85f;
            motionY -= 0.002f;
        }

        public void render(WorldGeometryEmitter emitter, Camera camera, float size, float tickDelta) {
            float x = prevPosX + (posX - prevPosX) * tickDelta;
            float y = prevPosY + (posY - prevPosY) * tickDelta;
            float z = prevPosZ + (posZ - prevPosZ) * tickDelta;

            if (!Float.isFinite(x) || !Float.isFinite(y) || !Float.isFinite(z)) {
                return;
            }

            Vec3d cameraPos = camera.getCameraPos();
            double tX = x - cameraPos.x;
            double tY = y - cameraPos.y;
            double tZ = z - cameraPos.z;

            float lifetime = (System.currentTimeMillis() - spawnTime) / 1000.0f;
            float rotation = lifetime * rotationSpeed;

            float scale = 1.1f * size;
            Matrix4f localTransform = scratchMatrix.identity()
                    .translate((float) tX, (float) tY, (float) tZ)
                    .rotate(RotationAxis.POSITIVE_Y.rotationDegrees(-camera.getYaw()))
                    .rotate(RotationAxis.POSITIVE_X.rotationDegrees(camera.getPitch()))
                    .rotate(RotationAxis.POSITIVE_Z.rotationDegrees(rotation))
                    .scale(scale, scale, scale)
                    .translate(-size / 2, -size / 2, 0f);

            float age = Math.min((System.currentTimeMillis() - spawnTime) / (float) lifetimeMs, 1.0f);
            float alpha = age < 0.3f ? age / 0.3f :
                    age > 0.7f ? (1.0f - (age - 0.7f) / 0.3f) : 1.0f;

            int finalColor;
            if (totemColors || colorMode.is("Клиент") || colorMode.is("Гирлянда") || colorMode.is("Рандомный")) {
                int r = color >> 16 & 0xFF;
                int g = color >> 8 & 0xFF;
                int b = color & 0xFF;

                finalColor = ColorUtils.rgba(r, g, b, (int) (alpha * 255));
            } else {
                int c = customColor.get();
                finalColor = ColorUtils.rgba(c >> 16 & 0xFF, c >> 8 & 0xFF, c & 0xFF, (int) (alpha * 255));
            }

            Vec3d v0 = transform(localTransform, scratch0, 0, size, 0);
            Vec3d v1 = transform(localTransform, scratch1, size, size, 0);
            Vec3d v2 = transform(localTransform, scratch2, size, 0, 0);
            Vec3d v3 = transform(localTransform, scratch3, 0, 0, 0);

            emitter.emitTexturedQuad(
                    v0, v1, v2, v3,
                    1f, 0f,
                    0f, 0f,
                    0f, 1f,
                    1f, 1f,
                    finalColor
            );
        }
    }

    private static Vec3d transform(Matrix4f matrix, Vector4f vec, double x, double y, double z) {
        vec.set((float) x, (float) y, (float) z, 1f);
        matrix.transform(vec);
        return new Vec3d(vec.x, vec.y, vec.z);
    }
}




