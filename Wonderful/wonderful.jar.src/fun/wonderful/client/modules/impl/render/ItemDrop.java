package fun.wonderful.client.modules.impl.render;

import com.mojang.blaze3d.systems.RenderSystem;
import fun.wonderful.Wonderful;
import fun.wonderful.api.events.EventLink;
import fun.wonderful.api.events.implement.Event3DRender;
import fun.wonderful.api.events.implement.EventUpdate;
import fun.wonderful.api.utils.color.ColorUtils;
import fun.wonderful.client.modules.Module;
import fun.wonderful.client.modules.settings.implement.BooleanSetting;
import fun.wonderful.client.modules.settings.implement.FloatSetting;
import fun.wonderful.client.modules.settings.implement.ListSetting;
import fun.wonderful.client.modules.settings.implement.ModeSetting;
import fun.wonderful.mixin.ItemEntityAccessor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import net.minecraft.client.gl.ShaderProgramKeys;
import net.minecraft.client.gl.ShaderProgramKey;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.Box;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.client.render.BufferRenderer;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.render.Tessellator;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.render.VertexFormat;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.RaycastContext;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.RotationAxis;
import net.minecraft.client.render.BuiltBuffer;
import org.joml.Matrix4f;

public class ItemDrop
extends Module {
    public static ItemDrop INSTANCE = new ItemDrop();
    private static final String COLOR_THEME = "Тема";
    private static final String COLOR_RAINBOW = "Радуга";
    private static final String TARGET_SELF = "Себя";
    private static final String TARGET_FRIENDS = "Друзей";
    private static final String TARGET_OTHERS = "Остальных";
    private static final Identifier CIRCLE_TEXTURE = Identifier.of((String)"wonderful", (String)"textures/jumpcircle/circle.png");
    private static final float BASE_LIFETIME_MS = 1450.0f;
    private static final int MAX_RIPPLES = 32;
    private static final int MAX_GROUP_COUNT = 32;
    private static final long GROUP_WINDOW_MS = 220L;
    private static final double GROUP_DISTANCE = 3.6;
    private static final double TRACK_DISTANCE = 96.0;
    private final FloatSetting radius = new FloatSetting("Радиус", 1.75f, 0.5f, 4.0f, 0.1f);
    private final FloatSetting speed = new FloatSetting("Скорость", 1.35f, 0.5f, 4.0f, 0.05f);
    private final FloatSetting fadeSpeed = new FloatSetting("Затухание", 1.15f, 0.5f, 3.0f, 0.05f);
    private final ModeSetting colorMode = new ModeSetting("Цвет", "Тема", "Тема", "Радуга");
    private final ListSetting targets = new ListSetting("Реагировать на", new BooleanSetting("Себя", true), new BooleanSetting("Друзей", true), new BooleanSetting("Остальных", true));
    private final Map<Integer, Boolean> groundedItems = new HashMap<Integer, Boolean>();
    private final Map<Integer, Long> lastRippleTime = new HashMap<Integer, Long>();
    private final List<Ripple> ripples = new ArrayList<Ripple>();

    public ItemDrop() {
        super("ItemDrop", "Создает круг при приземлении предмета", Module.ModuleCategory.RENDER);
        this.addSettings(this.radius, this.speed, this.fadeSpeed, this.colorMode, this.targets);
    }

    @Override
    public void onDisable() {
        this.groundedItems.clear();
        this.lastRippleTime.clear();
        this.ripples.clear();
        super.onDisable();
    }

    @EventLink
    public void onUpdate(EventUpdate event) {
        if (ItemDrop.mc.player == null || ItemDrop.mc.world == null) {
            this.groundedItems.clear();
            this.lastRippleTime.clear();
            this.ripples.clear();
            return;
        }
        long now = System.currentTimeMillis();
        HashSet<Integer> currentItems = new HashSet<Integer>();
        Box searchBox = ItemDrop.mc.player.getBoundingBox().expand(96.0);
        for (ItemEntity item : ItemDrop.mc.world.getEntitiesByClass(ItemEntity.class, searchBox, Entity::isAlive)) {
            int id2 = item.getId();
            currentItems.add(id2);
            boolean onGround = item.isOnGround();
            boolean wasOnGround = this.groundedItems.getOrDefault(id2, onGround);
            if (!wasOnGround && onGround && this.canSpawnRipple(id2, now) && this.shouldReactTo(item)) {
                this.spawnRipple(item, now);
            }
            this.groundedItems.put(id2, onGround);
        }
        this.groundedItems.keySet().removeIf(id -> !currentItems.contains(id));
        this.lastRippleTime.keySet().removeIf(id -> !currentItems.contains(id));
        this.ripples.removeIf(ripple -> (float)(now - ripple.startTimeMs) > this.getLifetimeMs());
        while (this.ripples.size() > 32) {
            this.ripples.remove(0);
        }
    }

    @EventLink
    public void onRender3D(Event3DRender event) {
        if (this.ripples.isEmpty() || ItemDrop.mc.player == null || ItemDrop.mc.world == null) {
            return;
        }
        long now = System.currentTimeMillis();
        Vec3d camera = event.getCamera().getPos();
        MatrixStack matrices = event.getMatrices();
        RenderSystem.enableBlend();
        RenderSystem.enableDepthTest();
        RenderSystem.depthMask((boolean)false);
        RenderSystem.disableCull();
        RenderSystem.blendFunc((int)770, (int)1);
        RenderSystem.setShader((ShaderProgramKey)ShaderProgramKeys.POSITION_TEX_COLOR);
        RenderSystem.setShaderTexture((int)0, (Identifier)CIRCLE_TEXTURE);
        Iterator<Ripple> iterator = this.ripples.iterator();
        while (iterator.hasNext()) {
            Ripple ripple = iterator.next();
            float progress = this.getProgress(now, ripple);
            if (progress >= 1.0f) {
                iterator.remove();
                continue;
            }
            this.renderRipple(matrices, camera, ripple, progress, now);
        }
        RenderSystem.enableCull();
        RenderSystem.depthMask((boolean)true);
        RenderSystem.enableDepthTest();
        RenderSystem.defaultBlendFunc();
        RenderSystem.disableBlend();
        RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
    }

    private boolean canSpawnRipple(int itemId, long now) {
        Long last = this.lastRippleTime.get(itemId);
        return last == null || now - last > 500L;
    }

    private void spawnRipple(ItemEntity item, long now) {
        this.lastRippleTime.put(item.getId(), now);
        Vec3d pos = this.landingPosition(item);
        Ripple ripple = this.getMergeTarget(pos, now);
        if (ripple != null) {
            ripple.merge(pos, item.getId(), now);
            return;
        }
        this.ripples.add(new Ripple(pos, now, item.getId()));
    }

    private Ripple getMergeTarget(Vec3d pos, long now) {
        Ripple best = null;
        double bestDistance = Double.MAX_VALUE;
        for (Ripple ripple : this.ripples) {
            double distance;
            if (now - ripple.lastMergeTimeMs > 220L || !((distance = ripple.pos.squaredDistanceTo(pos)) <= 12.96) || !(distance < bestDistance)) continue;
            best = ripple;
            bestDistance = distance;
        }
        return best;
    }

    private boolean shouldReactTo(ItemEntity item) {
        PlayerEntity player;
        Entity source = this.getSourceEntity(item);
        UUID owner = this.getOwnerUuid(item);
        if (ItemDrop.mc.player != null && (source == ItemDrop.mc.player || ItemDrop.mc.player.getUuid().equals(owner))) {
            return this.targets.is(TARGET_SELF);
        }
        if (source instanceof PlayerEntity && this.isFriend(player = (PlayerEntity)source)) {
            return this.targets.is(TARGET_FRIENDS);
        }
        PlayerEntity ownerPlayer = this.getPlayerByUuid(owner);
        if (ownerPlayer != null && this.isFriend(ownerPlayer)) {
            return this.targets.is(TARGET_FRIENDS);
        }
        return this.targets.is(TARGET_OTHERS);
    }

    private Entity getSourceEntity(ItemEntity item) {
        try {
            return ((ItemEntityAccessor)item).wonderful$getThrower();
        }
        catch (Throwable ignored) {
            return null;
        }
    }

    private UUID getOwnerUuid(ItemEntity item) {
        try {
            return ((ItemEntityAccessor)item).wonderful$getOwner();
        }
        catch (Throwable ignored) {
            return null;
        }
    }

    private PlayerEntity getPlayerByUuid(UUID uuid) {
        if (uuid == null || ItemDrop.mc.world == null) {
            return null;
        }
        for (PlayerEntity player : ItemDrop.mc.world.getPlayers()) {
            if (!uuid.equals(player.getUuid())) continue;
            return player;
        }
        return null;
    }

    private boolean isFriend(PlayerEntity player) {
        return player != null && Wonderful.INSTANCE.friendStorage != null && Wonderful.INSTANCE.friendStorage.isFriend(player.getName().getString());
    }

    private Vec3d landingPosition(ItemEntity item) {
        Vec3d to;
        if (ItemDrop.mc.world == null || ItemDrop.mc.player == null) {
            return item.getPos();
        }
        Vec3d from = new Vec3d(item.getX(), item.getY() + 0.35, item.getZ());
        BlockHitResult hit = ItemDrop.mc.world.raycast(new RaycastContext(from, to = new Vec3d(item.getX(), item.getY() - 1.35, item.getZ()), RaycastContext.class_3960.COLLIDER, RaycastContext.class_242.NONE, (Entity)ItemDrop.mc.player));
        return hit.getType() == HitResult.class_240.BLOCK ? hit.getPos().add(0.0, 0.026, 0.0) : item.getPos().add(0.0, 0.026, 0.0);
    }

    private float getLifetimeMs() {
        return 1450.0f / Math.max(0.25f, this.speed.get());
    }

    private float getProgress(long now, Ripple ripple) {
        return MathHelper.clamp((float)((float)(now - ripple.startTimeMs) / this.getLifetimeMs()), (float)0.0f, (float)1.0f);
    }

    private void renderRipple(MatrixStack matrices, Vec3d camera, Ripple ripple, float progress, long now) {
        float eased = ItemDrop.easeOutCubic(progress);
        float fade = 1.0f - MathHelper.clamp((float)(progress * this.fadeSpeed.get()), (float)0.0f, (float)1.0f);
        if (fade <= 0.01f) {
            return;
        }
        float timeSeconds = (float)(now - ripple.startTimeMs) / 1000.0f;
        float groupScale = this.getGroupScale(ripple.count);
        float baseSize = MathHelper.lerp((float)eased, (float)0.22f, (float)(this.radius.get() * groupScale));
        float spin = timeSeconds * 165.0f * this.speed.get();
        float wave = (float)Math.sin((double)progress * Math.PI * 2.0 + (double)((float)ripple.itemId * 0.35f));
        int theme = this.getEffectColor(ripple.itemId * 17);
        int second = this.getEffectColor(ripple.itemId * 17 + 160);
        int light = ColorUtils.interpolateColor(theme, ColorUtils.rgba(255, 255, 255, 255), 0.35f);
        int dark = ColorUtils.darken(second, 0.52f);
        matrices.push();
        matrices.translate(ripple.pos.x - camera.x, ripple.pos.y - camera.y, ripple.pos.z - camera.z);
        matrices.multiply(RotationAxis.POSITIVE_X.rotationDegrees(90.0f));
        BufferBuilder buffer = Tessellator.getInstance().begin(VertexFormat.class_5596.QUADS, VertexFormats.POSITION_TEXTURE_COLOR);
        matrices.push();
        matrices.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(spin));
        this.addLayer(buffer, matrices.peek().getPositionMatrix(), baseSize * (1.0f + wave * 0.045f), light, second, fade * 0.95f);
        matrices.pop();
        matrices.push();
        matrices.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(-spin * 0.62f + 35.0f));
        this.addLayer(buffer, matrices.peek().getPositionMatrix(), baseSize * 1.24f, theme, dark, fade * 0.55f);
        matrices.pop();
        float echoProgress = MathHelper.clamp((float)((progress - 0.2f) / 0.8f), (float)0.0f, (float)1.0f);
        if (echoProgress > 0.0f) {
            float echoFade = fade * (1.0f - echoProgress) * 0.45f;
            this.addLayer(buffer, matrices.peek().getPositionMatrix(), MathHelper.lerp((float)ItemDrop.easeOutCubic(echoProgress), (float)(baseSize * 0.9f), (float)(this.radius.get() * groupScale * 1.35f)), second, light, echoFade);
        }
        BufferRenderer.drawWithGlobalProgram((BuiltBuffer)buffer.end());
        matrices.pop();
    }

    private float getGroupScale(int count) {
        if (count <= 1) {
            return 1.0f;
        }
        return MathHelper.clamp((float)(1.0f + (float)Math.sqrt(Math.min(count - 1, 32)) * 0.24f), (float)1.0f, (float)2.45f);
    }

    private int getEffectColor(int offset) {
        if (this.colorMode.is(COLOR_RAINBOW)) {
            return ColorUtils.rainbow(8, offset, 0.85f, 1.0f, 1.0f);
        }
        return ColorUtils.getThemeColor(offset);
    }

    private void addLayer(BufferBuilder buffer, Matrix4f matrix, float size, int colorA, int colorB, float alpha) {
        int first = ColorUtils.setAlphaColor(colorA, (int)(255.0f * MathHelper.clamp((float)alpha, (float)0.0f, (float)1.0f)));
        int second = ColorUtils.setAlphaColor(colorB, (int)(210.0f * MathHelper.clamp((float)alpha, (float)0.0f, (float)1.0f)));
        float half = size * 0.5f;
        this.addVertex(buffer, matrix, -half, -half, 0.0f, 1.0f, first);
        this.addVertex(buffer, matrix, -half, half, 0.0f, 0.0f, second);
        this.addVertex(buffer, matrix, half, half, 1.0f, 0.0f, second);
        this.addVertex(buffer, matrix, half, -half, 1.0f, 1.0f, first);
    }

    private void addVertex(BufferBuilder buffer, Matrix4f matrix, float x2, float y2, float u2, float v2, int color) {
        buffer.vertex(matrix, x2, y2, 0.0f).texture(u2, v2).color(ColorUtils.red(color), ColorUtils.green(color), ColorUtils.blue(color), ColorUtils.getAlpha(color));
    }

    private static float easeOutCubic(float value) {
        float inverted = 1.0f - value;
        return 1.0f - inverted * inverted * inverted;
    }

    private static final class Ripple {
        private Vec3d pos;
        private final long startTimeMs;
        private int itemId;
        private int count = 1;
        private long lastMergeTimeMs;

        private Ripple(Vec3d pos, long startTimeMs, int itemId) {
            this.pos = pos;
            this.startTimeMs = startTimeMs;
            this.itemId = itemId;
            this.lastMergeTimeMs = startTimeMs;
        }

        private void merge(Vec3d nextPos, int nextItemId, long now) {
            int nextCount = Math.min(this.count + 1, 32);
            double currentWeight = Math.max(1, this.count);
            double totalWeight = currentWeight + 1.0;
            this.pos = new Vec3d((this.pos.x * currentWeight + nextPos.x) / totalWeight, Math.max(this.pos.y, nextPos.y), (this.pos.z * currentWeight + nextPos.z) / totalWeight);
            this.count = nextCount;
            this.itemId = nextItemId;
            this.lastMergeTimeMs = now;
        }
    }
}