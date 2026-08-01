package fun.wonderful.client.modules.impl.render;

import fun.wonderful.Wonderful;
import fun.wonderful.api.events.EventLink;
import fun.wonderful.api.events.implement.EventRender;
import fun.wonderful.api.storages.implement.FreeLookStorage;
import fun.wonderful.api.utils.color.ColorUtils;
import fun.wonderful.api.utils.math.MathUtils;
import fun.wonderful.api.utils.render.RenderUtils;
import fun.wonderful.client.modules.Module;
import fun.wonderful.client.modules.impl.combat.AntiBot;
import fun.wonderful.client.modules.settings.implement.FloatSetting;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.option.Perspective;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.util.math.RotationAxis;

public class Arrows
extends Module {
    public static Arrows INSTANCE = new Arrows();
    private static final Identifier FIRST_ARROW_TEXTURE = Identifier.of((String)"wonderful", (String)"textures/arrows/arrow.png");
    private final FloatSetting radius = new FloatSetting("Радиус", 58.0f, 30.0f, 120.0f, 1.0f);
    private final FloatSetting size = new FloatSetting("Размер", 13.0f, 8.0f, 28.0f, 0.5f);
    private final FloatSetting glowRadius = new FloatSetting("Свечение", 7.5f, 0.0f, 20.0f, 0.5f);
    private final Map<UUID, ArrowState> states = new HashMap<UUID, ArrowState>();
    private final Set<UUID> seenPlayers = new HashSet<UUID>();

    public Arrows() {
        super("Arrows", "Красивые стрелочки на энтити", Module.ModuleCategory.RENDER);
        this.addSettings(this.radius, this.size, this.glowRadius);
    }

    @EventLink
    public void onRender(EventRender.Default event) {
        if (Arrows.mc.player == null || Arrows.mc.world == null || Arrows.mc.options.hudHidden) {
            this.states.clear();
            return;
        }
        if (Arrows.mc.options.getPerspective() != Perspective.FIRST_PERSON) {
            this.fadeAllStates();
            return;
        }
        float partialTicks = event.getPartialTicks();
        float centerX = (float)mc.getWindow().getScaledWidth() * 0.5f;
        float centerY = (float)mc.getWindow().getScaledHeight() * 0.5f;
        float arrowSize = this.size.get();
        float y2 = centerY - this.radius.get();
        float playerYaw = this.getReferenceYaw(partialTicks);
        Vec3d selfPos = this.getReferencePos(partialTicks);
        this.seenPlayers.clear();
        for (AbstractClientPlayerEntity player : Arrows.mc.world.getPlayers()) {
            if (player == Arrows.mc.player || !player.isAlive() || player.isSpectator() || this.isGhostPlayer(player) || AntiBot.checkBot((LivingEntity)player)) continue;
            UUID uuid = player.getUuid();
            ArrowState state = this.states.computeIfAbsent(uuid, id -> new ArrowState());
            this.seenPlayers.add(uuid);
            int color = this.getPlayerColor(player);
            float targetYaw = this.getRelativeYaw((Entity)player, partialTicks, playerYaw, selfPos);
            state.rotation = this.interpolateAngle(state.rotation, targetYaw, 0.18f);
            state.alpha = this.approach(state.alpha, 1.0f, 0.12f);
            float alpha = MathHelper.clamp((float)state.alpha, (float)0.0f, (float)1.0f);
            if (alpha <= 0.01f) continue;
            int drawColor = ColorUtils.applyAlpha(color, alpha);
            int shadowColor = ColorUtils.applyAlpha(ColorUtils.darken(color, 0.55f), alpha * 0.65f);
            this.renderArrow(event.getContext().getMatrices(), centerX, centerY, y2, arrowSize, state.rotation, drawColor, shadowColor);
        }
        this.states.entrySet().removeIf(entry -> {
            if (this.seenPlayers.contains(entry.getKey())) {
                return false;
            }
            ArrowState state = (ArrowState)entry.getValue();
            state.alpha = this.approach(state.alpha, 0.0f, 0.1f);
            return state.alpha <= 0.02f;
        });
    }

    private void renderArrow(MatrixStack matrices, float centerX, float centerY, float y2, float size, float rotation, int color, int shadowColor) {
        matrices.push();
        matrices.translate(centerX, centerY, 0.0f);
        matrices.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(rotation));
        matrices.translate(-centerX, -centerY, 0.0f);
        float x2 = centerX - size * 0.5f;
        RenderUtils.drawImage(matrices, FIRST_ARROW_TEXTURE, x2, y2 + size * 0.08f, size, size, shadowColor);
        RenderUtils.drawImage(matrices, FIRST_ARROW_TEXTURE, x2, y2, size, size, color);
        matrices.pop();
    }

    private void fadeAllStates() {
        this.states.entrySet().removeIf(entry -> {
            ArrowState state = (ArrowState)entry.getValue();
            state.alpha = this.approach(state.alpha, 0.0f, 0.1f);
            return state.alpha <= 0.02f;
        });
    }

    private float approach(float current, float target, float factor) {
        factor = MathHelper.clamp((float)factor, (float)0.0f, (float)1.0f);
        return MathHelper.lerp((float)factor, (float)current, (float)target);
    }

    private int getPlayerColor(AbstractClientPlayerEntity player) {
        String name = player.getName().getString();
        boolean isFriend = Wonderful.INSTANCE.friendStorage != null && Wonderful.INSTANCE.friendStorage.isFriend(name);
        return isFriend ? ColorUtils.rgb(80, 170, 255) : ColorUtils.getThemeColor();
    }

    private float getRelativeYaw(Entity entity, float partialTicks, float playerYaw, Vec3d selfPos) {
        Vec3d entityPos = MathUtils.interpolate(entity, partialTicks);
        double dx = entityPos.x - selfPos.x;
        double dz = entityPos.z - selfPos.z;
        float yaw = (float)(-Math.toDegrees(Math.atan2(dx, dz)));
        return MathHelper.wrapDegrees((float)(yaw - playerYaw));
    }

    private float getReferenceYaw(float partialTicks) {
        if (FreeLookStorage.isActive()) {
            return FreeLookStorage.getFreeYaw();
        }
        return MathHelper.lerp((float)partialTicks, (float)Arrows.mc.player.prevYaw, (float)Arrows.mc.player.getYaw());
    }

    private Vec3d getReferencePos(float partialTicks) {
        if (FreeLookStorage.isActive() && Arrows.mc.gameRenderer != null && Arrows.mc.gameRenderer.getCamera() != null) {
            return Arrows.mc.gameRenderer.getCamera().getPos();
        }
        return MathUtils.interpolate((Entity)Arrows.mc.player, partialTicks);
    }

    private float interpolateAngle(float current, float target, float factor) {
        float delta = MathHelper.wrapDegrees((float)(target - current));
        return current + delta * factor;
    }

    private boolean isGhostPlayer(AbstractClientPlayerEntity player) {
        String name;
        if (player.getCustomName() != null && (name = player.getCustomName().getString()) != null && name.startsWith("Ghost_")) {
            return true;
        }
        return "OtherClientPlayerEntity".equals(player.getClass().getSimpleName()) && player.getPitch() == -30.0f;
    }

    private static final class ArrowState {
        private float alpha;
        private float rotation;

        private ArrowState() {
        }
    }
}