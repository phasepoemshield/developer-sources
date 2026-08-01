package sky.core.ui.hud.target;

import java.awt.Color;
import java.util.Locale;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.Vec3d;
import com.mojang.blaze3d.systems.RenderSystem;
import org.joml.Quaternionf;
import org.joml.Vector3f;
import sky.core.util.animation.Animation;
import sky.core.util.drag.DragController;
import sky.core.util.drag.HudLayoutMode;
import sky.core.util.drag.TargetHudDrag;
import sky.core.ui.gui.click.ClickGuiTheme;
import sky.core.module.impl.visuals.InterfaceModule;
import sky.core.util.ServerUtil;
import sky.core.util.render.RenderUtil;
import sky.core.util.render.font.FontManager;
import sky.core.util.render.font.FontRenderer;
import sky.core.util.ColorUtil;

public final class TargetHud {
    private static final float WIDTH = 96.0F;
    private static final float HEIGHT = 32.0F;
    private static final float RADIUS = 11.5F;
    private static final float PADDING = 5.0F;
    private static final float HEAD_SIZE = 18.0F;
    private static final float BAR_HEIGHT = 3.0F;
    private static final float BAR_RADIUS = 2.0F;
    private static final int NAME_FONT = 14;
    private static final long SHOW_HIDE_ANIM_MS = 420L;
    private static final float MIN_SCALE = 0.72F;
    private static final long HP_ANIM_LIGHT_MS = 360L;
    private static final long HP_ANIM_HEAVY_MS = 720L;
    private static final float HP_ANIM_HEAVY_AT = 0.30F;
    private static final float FOLLOW_PROJECTION_RATE = 8.0F;
    private static final float FOLLOW_DISPLAY_RATE = 5.0F;

    private final MinecraftClient client = MinecraftClient.getInstance();
    private final Animation visibility = new Animation();
    private LivingEntity displayTarget;
    private float animatedHealth = -1.0F;
    private float lastTargetProgress = -1.0F;
    private float animFrom;
    private float animTo;
    private long animStartMs;
    private long animDurationMs;
    private boolean healthAnimating;
    private float followX = Float.NaN;
    private float followY = Float.NaN;
    private float smoothProjX = Float.NaN;
    private float smoothProjY = Float.NaN;
    private long lastFollowRenderNs;
    private long hideAfterMs;
    private boolean chatWasActive;
    private boolean chatDismissAnimating;
    private boolean chatLayoutRendering;

    public void tick() {
        boolean chatActive = HudLayoutMode.isActive();

        if (chatActive) {
            this.chatDismissAnimating = false;
            this.updateVisibility(this.resolveDesiredTarget());
            this.visibility.update();
            this.cleanupIfClosed();
            this.chatWasActive = true;
            return;
        }

        if (this.chatWasActive) {
            this.chatWasActive = false;
            this.beginChatDismissIfNeeded();
        }

        if (this.chatDismissAnimating) {
            this.visibility.update();
            if (!this.visibility.isVisible()) {
                this.chatDismissAnimating = false;
                this.cleanupIfClosed();
            }
            return;
        }

        this.updateVisibility(this.resolveDesiredTarget());
        this.visibility.update();
        this.cleanupIfClosed();
    }

    public void render(DrawContext context, float screenWidth, float screenHeight, float delta) {
        MatrixStack matrices = context.getMatrices();
        boolean chatActive = HudLayoutMode.isActive();
        if (chatActive) {
            this.chatLayoutRendering = true;
        } else if (this.chatLayoutRendering) {
            this.chatLayoutRendering = false;
            this.beginChatDismissIfNeeded();
        }

        if (!this.visibility.isVisible() || this.displayTarget == null) {
            return;
        }

        RenderUtil renderer = RenderUtil.get();
        if (renderer == null) {
            return;
        }

        boolean dead = this.isDead(this.displayTarget);
        float alpha = this.visibility.getAlpha();
        float scaleProgress = easeOutBack(alpha);
        float scale = MIN_SCALE + (1.0F - MIN_SCALE) * scaleProgress;
        float drawWidth = WIDTH * scale;
        float drawHeight = HEIGHT * scale - 4;

        float[] anchor = this.resolveAnchorCenter(screenWidth, screenHeight, delta);
        float anchorCenterX = anchor[0];
        float anchorCenterY = anchor[1];
        float x = anchorCenterX - drawWidth / 2.0F;
        float y = anchorCenterY - drawHeight / 2.0F;

        ClickGuiTheme theme = ClickGuiTheme.theme;
        float headSizeScaled = HEAD_SIZE * scale;
        float paddingScaled = PADDING * scale;
        float barHeightScaled = BAR_HEIGHT * scale;

        renderer.drawVerticalGradientRoundedRect(
                x,
                y,
                drawWidth,
                drawHeight,
                RADIUS * scale,
                ColorUtil.withAlpha(theme.getPanelTop(), alpha),
                ColorUtil.withAlpha(theme.getPanelBottom(), alpha),
                matrices
        );

        float headX = x + paddingScaled;
        float headY = y + (drawHeight - headSizeScaled) / 2.0F;

        FontRenderer font = FontManager.getRegular(NAME_FONT);
        String name = this.getName(this.displayTarget);
        float textX = headX + headSizeScaled + 5.0F * scale;
        float textY = y + 4.0F * scale;
        font.draw(name, textX, textY + 1, ColorUtil.withAlpha(theme.getText(), alpha), matrices);
        float nameWidth = font.getWidth(name);
        String hpText = this.formatHealth(this.displayTarget);
        font.draw(hpText, textX + nameWidth + 4.0F * scale, textY + 1, ColorUtil.withAlpha(theme.getAccent(), alpha), matrices);

        this.renderHead(renderer, matrices, this.displayTarget, headX, headY, headSizeScaled, alpha, theme);

        this.renderArmorIcons(context, matrices, x, y, drawWidth, scale, alpha);

        float barX = textX;
        float barY = y + drawHeight - paddingScaled - barHeightScaled - 1;
        float barWidth = drawWidth - (barX - x) - paddingScaled;
        renderer.drawRoundedRect(
                barX,
                barY,
                barWidth,
                barHeightScaled,
                BAR_RADIUS * scale,
                ColorUtil.withAlpha(theme.getTextDim(), (int) (85 * alpha)),
                matrices
        );

        float targetProgress = dead ? 0.0F : this.getHealthProgress(this.displayTarget);
        this.stepHealthAnimation(targetProgress);

        if (this.animatedHealth > 0.008F) {
            float fillWidth = Math.max(barHeightScaled, barWidth * this.animatedHealth);
            float fillX = barX + barWidth - fillWidth;
            renderer.drawRoundedRect(
                    fillX,
                    barY,
                    fillWidth,
                    barHeightScaled,
                    BAR_RADIUS * scale,
                    ColorUtil.withAlpha(theme.getAccent(), alpha),
                    matrices
            );
        }
    }

    private LivingEntity resolveDesiredTarget() {
        if (HudLayoutMode.isActive() && this.client.player != null) {
            // В чате всегда показываем себя, но Follow там отключён через useFollowMode/resolveAnchorCenter.
            return this.client.player;
        }

        HitResult hit = this.client.crosshairTarget;
        if (hit instanceof EntityHitResult entityHit) {
            Entity entity = entityHit.getEntity();
            if (entity instanceof LivingEntity living && !this.isDead(living) && living != this.client.player) {
                return living;
            }
        }
        return null;
    }

    private void updateVisibility(LivingEntity desired) {
        if (desired != null) {
            if (desired != this.displayTarget) {
                this.resetHealthAnimation();
                this.resetFollowSmoothing();
            }
            this.displayTarget = desired;
            this.hideAfterMs = 0L;
            this.visibility.fadeIn(SHOW_HIDE_ANIM_MS);
            return;
        }

        if (this.displayTarget == null) {
            return;
        }

        if (this.visibility.isOpen()) {
            boolean followMode = this.useFollowMode();
            long delayMs = followMode ? 1500L : 0L;

            if (delayMs <= 0L) {
                this.visibility.fadeOut(SHOW_HIDE_ANIM_MS);
                return;
            }

            long now = System.currentTimeMillis();
            if (this.hideAfterMs == 0L) {
                this.hideAfterMs = now + delayMs;
                return;
            }

            if (now >= this.hideAfterMs) {
                this.visibility.fadeOut(SHOW_HIDE_ANIM_MS);
            }
        }
    }

    private void cleanupIfClosed() {
        if (this.visibility.isVisible()) {
            return;
        }

        this.displayTarget = null;
        this.resetHealthAnimation();
        this.resetFollowSmoothing();
        this.hideAfterMs = 0L;
    }

    private void resetFollowSmoothing() {
        this.followX = Float.NaN;
        this.followY = Float.NaN;
        this.smoothProjX = Float.NaN;
        this.smoothProjY = Float.NaN;
        this.lastFollowRenderNs = 0L;
    }

    private void resetHealthAnimation() {
        this.animatedHealth = -1.0F;
        this.lastTargetProgress = -1.0F;
        this.healthAnimating = false;
        this.animStartMs = 0L;
        this.animDurationMs = 0L;
    }

    private void stepHealthAnimation(float targetProgress) {
        if (this.animatedHealth < 0.0F) {
            this.animatedHealth = targetProgress;
            this.lastTargetProgress = targetProgress;
            return;
        }

        if (this.lastTargetProgress >= 0.0F && targetProgress < this.lastTargetProgress - 0.004F) {
            float damage = this.lastTargetProgress - targetProgress;
            this.animFrom = this.animatedHealth;
            this.animTo = targetProgress;
            this.animStartMs = System.currentTimeMillis();
            this.animDurationMs = this.resolveHealthDuration(damage);
            this.healthAnimating = true;
        } else if (targetProgress > this.animatedHealth + 0.004F) {
            this.healthAnimating = false;
            this.animatedHealth = targetProgress;
        }

        this.lastTargetProgress = targetProgress;

        if (!this.healthAnimating) {
            if (Math.abs(targetProgress - this.animatedHealth) < 0.0005F) {
                this.animatedHealth = targetProgress;
            }
            return;
        }

        long elapsed = System.currentTimeMillis() - this.animStartMs;
        float progress = Math.min(1.0F, elapsed / (float) this.animDurationMs);
        float eased = easeOutCubic(progress);
        this.animatedHealth = this.animFrom + (this.animTo - this.animFrom) * eased;

        if (progress >= 1.0F) {
            this.animatedHealth = this.animTo;
            this.healthAnimating = false;
        }
    }

    private long resolveHealthDuration(float damage) {
        float heavyAt = Math.max(0.08F, HP_ANIM_HEAVY_AT);
        float t = Math.min(1.0F, damage / heavyAt);
        t = t * t * (3.0F - 2.0F * t);
        return Math.round(HP_ANIM_LIGHT_MS + (HP_ANIM_HEAVY_MS - HP_ANIM_LIGHT_MS) * t);
    }

    private static float easeOutCubic(float value) {
        float t = 1.0F - value;
        return 1.0F - t * t * t;
    }

    private void renderHead(
            RenderUtil renderer,
            MatrixStack matrices,
            LivingEntity entity,
            float x,
            float y,
            float size,
            float alpha,
            ClickGuiTheme theme
    ) {
        if (entity instanceof AbstractClientPlayerEntity player) {
            Identifier skin = player.getSkinTextures().texture();
            renderer.drawRoundedTexture(
                    skin,
                    x,
                    y,
                    size,
                    size,
                    4.0F,
                    8.0F / 64.0F,
                    8.0F / 64.0F,
                    8.0F / 64.0F,
                    8.0F / 64.0F,
                    ColorUtil.withAlpha(Color.WHITE, alpha),
                    matrices
            );
            return;
        }

        renderer.drawRoundedRect(x, y, size, size, 4.0F, ColorUtil.withAlpha(theme.getAccent(), (int) (145 * alpha)), matrices);
        FontRenderer font = FontManager.getRegular(12);
        String letter = this.getName(entity).substring(0, 1).toUpperCase();
        font.drawCentered(
                letter,
                x + size / 2.0F,
                y + (size - font.getLineHeight(letter)) / 2.0F,
                ColorUtil.withAlpha(theme.getText(), alpha),
                matrices
        );
    }

    private boolean isDead(LivingEntity entity) {
        return ServerUtil.getDisplayHealth(entity) <= 0.0F || entity.isDead();
    }

    private float getHealthProgress(LivingEntity entity) {
        float maxHealth = Math.max(1.0F, entity.getMaxHealth());
        return Math.max(0.0F, Math.min(1.0F, ServerUtil.getDisplayHealth(entity) / maxHealth));
    }

    private String getName(LivingEntity entity) {
        String text = entity instanceof PlayerEntity
                ? entity.getNameForScoreboard()
                : entity.getDisplayName().getString();
        if (text.length() > 12) {
            return text.substring(0, 12);
        }
        return text;
    }

    private String formatHealth(LivingEntity entity) {
        return String.format(Locale.US, "%.1f", Math.max(0.0F, ServerUtil.getDisplayHealth(entity)));
    }

    private float[] resolveAnchorCenter(float screenWidth, float screenHeight, float delta) {
        TargetHudDrag drag = DragController.getInstance().getTargetHud();
        drag.setSize(WIDTH, HEIGHT);
        drag.ensureInitialized(screenWidth, screenHeight);

        float fallbackX = drag.getX() + drag.getWidth() / 2.0F;
        float fallbackY = drag.getY() + drag.getHeight() / 2.0F;

        // В чате и при fade-out после чата — только drag-позиция, без Follow.
        if (HudLayoutMode.isActive() || this.chatDismissAnimating || this.isLocalPlayer(this.displayTarget)) {
            this.resetFollowSmoothing();
            return new float[] {fallbackX, fallbackY};
        }

        if (this.useFollowMode() && this.displayTarget != null) {
            float[] projected = this.projectEntityToHud(screenWidth, screenHeight, this.displayTarget);
            if (projected != null) {
                float frameDelta = this.getFollowFrameDeltaSeconds();
                if (Float.isNaN(this.smoothProjX) || Float.isNaN(this.smoothProjY)) {
                    this.smoothProjX = projected[0];
                    this.smoothProjY = projected[1];
                    this.followX = projected[0];
                    this.followY = projected[1];
                } else {
                    float projBlend = this.expSmoothFactor(FOLLOW_PROJECTION_RATE, frameDelta);
                    this.smoothProjX += (projected[0] - this.smoothProjX) * projBlend;
                    this.smoothProjY += (projected[1] - this.smoothProjY) * projBlend;

                    float displayBlend = this.expSmoothFactor(FOLLOW_DISPLAY_RATE, frameDelta);
                    this.followX += (this.smoothProjX - this.followX) * displayBlend;
                    this.followY += (this.smoothProjY - this.followY) * displayBlend;
                }
                return new float[] {this.followX, this.followY};
            }
            if (!Float.isNaN(this.followX) && !Float.isNaN(this.followY)) {
                return new float[] {this.followX, this.followY};
            }
        }
        if (!this.useFollowMode()) {
            this.resetFollowSmoothing();
        }

        return new float[] {fallbackX, fallbackY};
    }

    private boolean useFollowMode() {
        return InterfaceModule.INSTANCE.targetHudMode.is("Follow")
                && !HudLayoutMode.isActive()
                && !this.chatDismissAnimating;
    }

    private boolean isLocalPlayer(LivingEntity entity) {
        return entity != null && entity == this.client.player;
    }

    private void beginChatDismissIfNeeded() {
        if (this.chatDismissAnimating || this.displayTarget == null || !this.isLocalPlayer(this.displayTarget)) {
            return;
        }

        this.chatDismissAnimating = true;
        this.resetFollowSmoothing();
        this.hideAfterMs = 0L;
        this.visibility.fadeOut(SHOW_HIDE_ANIM_MS);
    }

    private float expSmoothFactor(float rate, float deltaSeconds) {
        return 1.0F - (float) Math.exp(-rate * deltaSeconds);
    }

    private float getFollowFrameDeltaSeconds() {
        long now = System.nanoTime();
        if (this.lastFollowRenderNs == 0L) {
            this.lastFollowRenderNs = now;
            return 0.016F;
        }

        float delta = (now - this.lastFollowRenderNs) / 1_000_000_000.0F;
        this.lastFollowRenderNs = now;
        return Math.max(0.001F, Math.min(0.05F, delta));
    }

    private float[] projectEntityToHud(float screenWidth, float screenHeight, LivingEntity entity) {
        if (this.client.gameRenderer == null || this.client.world == null) {
            return null;
        }

        net.minecraft.client.render.Camera camera = this.client.gameRenderer.getCamera();
        if (camera == null) {
            return null;
        }

        float tickDelta = this.client.getRenderTickCounter().getLastFrameDuration();
        Vec3d cameraPos = camera.getPos();
        Vec3d targetPos = entity.getLerpedPos(tickDelta).add(0.0, entity.getHeight() * 0.45, 0.0);

        Vector3f relative = new Vector3f(
                (float) (targetPos.x - cameraPos.x),
                (float) (targetPos.y - cameraPos.y),
                (float) (targetPos.z - cameraPos.z)
        );
        relative.rotate(new Quaternionf(camera.getRotation()).conjugate());

        if (relative.z >= -0.01F) {
            return null;
        }

        float fov = (float) this.client.options.getFov().getValue().intValue();
        float tan = (float) Math.tan(Math.toRadians(fov) / 2.0);
        float aspect = Math.max(0.1F, screenWidth / Math.max(1.0F, screenHeight));
        float ndcX = (relative.x / -relative.z) / (tan * aspect);
        float ndcY = (relative.y / -relative.z) / tan;

        float x = screenWidth * 0.5F + ndcX * screenWidth * 0.5F;
        float y = screenHeight * 0.5F - ndcY * screenHeight * 0.5F - HEIGHT * 0.05F;
        return new float[] {x, y};
    }

    private static float easeOutBack(float value) {
        float clamped = Math.max(0.0F, Math.min(1.0F, value));
        float c1 = 1.70158F;
        float c3 = c1 + 1.0F;
        return 1.0F + c3 * (float) Math.pow(clamped - 1.0F, 3.0F) + c1 * (float) Math.pow(clamped - 1.0F, 2.0F);
    }

    private void renderArmorIcons(
            DrawContext context,
            MatrixStack matrices,
            float panelX,
            float panelY,
            float panelWidth,
            float hudScale,
            float alpha
    ) {
        if (this.displayTarget == null) {
            return;
        }

        ItemStack head = this.displayTarget.getEquippedStack(EquipmentSlot.HEAD);
        ItemStack chest = this.displayTarget.getEquippedStack(EquipmentSlot.CHEST);
        ItemStack legs = this.displayTarget.getEquippedStack(EquipmentSlot.LEGS);
        ItemStack feet = this.displayTarget.getEquippedStack(EquipmentSlot.FEET);
        ItemStack[] armorSlots = new ItemStack[] {head, chest, legs, feet};

        boolean isPlayer = this.displayTarget instanceof PlayerEntity;
        ItemStack mainHand = ItemStack.EMPTY;
        ItemStack offHand = ItemStack.EMPTY;
        if (isPlayer) {
            PlayerEntity player = (PlayerEntity) this.displayTarget;
            mainHand = player.getMainHandStack();
            offHand = player.getOffHandStack();
        }

        boolean hasHands = isPlayer && (!mainHand.isEmpty() || !offHand.isEmpty());
        int visibleArmor = 0;
        for (ItemStack stack : armorSlots) {
            if (stack != null && !stack.isEmpty()) {
                visibleArmor++;
            }
        }

        if (visibleArmor == 0 && !hasHands) {
            return;
        }

        float iconBase = 16.0F;
        float iconScale = Math.max(0.40F, Math.min(0.55F, hudScale * 0.50F));
        float iconSizeScaled = iconBase * iconScale;
        float gap = 2.0F;
        float rowY = panelY - iconSizeScaled - 2.0F * iconScale;

        float armorStartX = panelX + panelWidth;
        if (visibleArmor > 0) {
            armorStartX = panelX + panelWidth - visibleArmor * iconSizeScaled - (visibleArmor - 1) * gap;
        }

        // Hands next to armor row (left side).
        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, alpha);
        matrices.push();
        matrices.scale(iconScale, iconScale, 1.0F);

        if (hasHands) {
            float mainX = armorStartX - iconSizeScaled - gap;
            float offX = mainX - iconSizeScaled - gap;

            if (!offHand.isEmpty()) {
                context.drawItem(offHand, (int) (offX / iconScale), (int) (rowY / iconScale));
            }
            if (!mainHand.isEmpty()) {
                context.drawItem(mainHand, (int) (mainX / iconScale), (int) (rowY / iconScale));
            }
        }

        float cursorX = armorStartX;
        for (ItemStack stack : armorSlots) {
            if (stack == null || stack.isEmpty()) {
                continue;
            }
            context.drawItem(stack, (int) (cursorX / iconScale), (int) (rowY / iconScale));
            cursorX += iconSizeScaled + gap;
        }

        matrices.pop();
        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
    }
}
