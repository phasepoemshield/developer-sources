package fun.nexisdlc.ui.hud.targethud;

import fun.nexisdlc.ClientContainer;
import fun.nexisdlc.Nexis;
import fun.nexisdlc.client.ClientColors;
import fun.nexisdlc.client.utils.client.IMinecraft;
import fun.nexisdlc.client.utils.client.tweaks.crosshair.DrawContextFloatDrawTexture;
import fun.nexisdlc.client.utils.player.PlayerUtils;
import fun.nexisdlc.client.utils.render.EntityTextureTracker;
import fun.nexisdlc.client.utils.render.animations.impl.SimpleLinearAnimation;
import fun.nexisdlc.client.utils.render.drag.api.Dragging;
import fun.nexisdlc.client.utils.render.easy.RenderUtil;
import fun.nexisdlc.client.utils.render.main.core.Renderer2D;
import fun.nexisdlc.client.utils.render.main.text.FontRegistry;
import fun.nexisdlc.modules.impl.combat.AimBot;
import fun.nexisdlc.modules.impl.combat.AuraModule;
import fun.nexisdlc.modules.impl.combat.ThrowableAim;
import fun.nexisdlc.modules.impl.render.Interface;
import fun.nexisdlc.modules.impl.utils.StreamerMode;
import net.minecraft.client.gui.screen.ChatScreen;
import net.minecraft.client.texture.NativeImage;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;
import org.jetbrains.annotations.Nullable;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

import java.awt.*;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import static fun.nexisdlc.client.ClientColors.applyAlpha;

public abstract class TargetHudBase implements IMinecraft {
    private static final String CULLING_OWNER = "TargetHud";
    public static final String SETTINGS_SCOPE = "TargetHud";
    public static final String SETTING_ADAPTIVE_BAR = "adaptiveBarColor";
    public static final String SETTING_SHOW_ON_HOVER = "showOnHover";
    public static final String SETTING_MODE = "mode";
    public static final String MODE_DEFAULT = "Дефолт";
    public static final String MODE_ROUND = "Кругляш";
    private static final double HOVER_DISTANCE = 5.0;
    private static final double HOVER_XZ_EXPAND = 0.6;
    public static float width;
    public static float height;
    final Dragging dragging;

    LivingEntity lastTarget;
    final SimpleLinearAnimation animation = new SimpleLinearAnimation();

    static Color headColor = new Color(255, 255, 255, 255);
    static Color initialColor = new Color(255, 255, 255, 255);
    static float damageAnimationProgress = 0f;
    static long lastDamageTime = 0;
    static final float RED_DURATION = 0.19f;
    static long lastTime = System.nanoTime();
    private static final Map<Identifier, TextureSize> TEXTURE_SIZE_CACHE = new ConcurrentHashMap<>();
    float healthBarAnim = -1f;
    float healthBarTailAnim = 0f;
    float lastHealthPercentage = -1f;
    float roundHealthSegmentsAnim = 0f;
    float roundAbsorptionSegmentsAnim = 0f;
    float roundHealthTextAnim = 20f;
    int roundHealthTextEntityId = Integer.MIN_VALUE;
    float absorptionTextAlpha = 0f;
    float baseHpYellowProgress = 0f;
    String lastAbsorptionText = "";

    protected TargetHudBase(Dragging dragging) {
        this.dragging = dragging;
    }

    protected void updateTarget() {
        LivingEntity auraTarget = AuraModule.getTarget();
        var functionManager = Nexis.getFunctionManager();
        AuraModule auraModule = functionManager != null ? functionManager.getAttackAura() : null;
        AimBot aimBotModule = functionManager != null ? functionManager.getAimBot() : null;
        LivingEntity aimBotTarget = aimBotModule != null ? AimBot.getTarget() : null;
        ThrowableAim throwableAimModule = functionManager != null ? functionManager.getThrowableAim() : null;
        LivingEntity throwableAimTarget = throwableAimModule != null ? ThrowableAim.target : null;

        boolean hasAuraTarget = auraModule != null && auraModule.isState() && auraTarget != null
                && auraTarget.isAlive();
        boolean hasAimBotTarget = aimBotModule != null && aimBotModule.isState() && aimBotTarget != null
                && aimBotTarget.isAlive();
        boolean hasThrowableAimTarget = throwableAimModule != null && throwableAimModule.isState() && throwableAimTarget != null
                && throwableAimTarget.isAlive();
        boolean showOnHover = fun.nexisdlc.client.utils.render.drag.DraggingManager.getHudBoolean(SETTINGS_SCOPE, SETTING_SHOW_ON_HOVER, false);
        LivingEntity hoverTarget = showOnHover ? getHoveredTarget(HOVER_DISTANCE, HOVER_XZ_EXPAND) : null;

        if (hasAuraTarget) {
            setTarget(auraTarget);
        } else if (hasAimBotTarget) {
            setTarget(aimBotTarget);
        } else if (hasThrowableAimTarget) {
            setTarget(throwableAimTarget);
        } else if (hoverTarget != null) {
            setTarget(hoverTarget);
        } else if (mc.currentScreen instanceof ChatScreen) {
            setTarget(mc.player);
        } else {
            animation.hide();
        }
    }

    protected void setTarget(LivingEntity target) {
        if (lastTarget != target) {
            roundHealthSegmentsAnim = 0f;
            roundAbsorptionSegmentsAnim = 0f;
            roundHealthTextAnim = PlayerUtils.getHealthFloat(target) + Math.max(0f, target.getAbsorptionAmount());
            roundHealthTextEntityId = target.getId();
            float abs = Math.max(0f, target.getAbsorptionAmount());
            absorptionTextAlpha = abs > 0f ? 1f : 0f;
            baseHpYellowProgress = abs > 0f ? 1f : 0f;
            lastAbsorptionText = abs > 0f ? " (+" + formatHealthValue(abs) + ")" : "";
        }
        lastTarget = target;
        animation.show();
    }

    protected LivingEntity getHoveredTarget(double maxDistance, double xzExpand) {
        if (mc.player == null || mc.world == null) {
            return null;
        }

        Entity camera = mc.getCameraEntity();
        if (camera == null) {
            camera = mc.player;
        }

        Vec3d start = camera.getEyePos();
        Vec3d look = camera.getRotationVec(1.0f);
        Vec3d end = start.add(look.multiply(maxDistance));
        Box scanBox = camera.getBoundingBox()
                .stretch(look.multiply(maxDistance))
                .expand(1.0 + xzExpand, 1.0, 1.0 + xzExpand);

        LivingEntity best = null;
        double bestDistance = maxDistance;

        for (Entity entity : mc.world.getOtherEntities(camera, scanBox)) {
            if (!(entity instanceof LivingEntity living)) {
                continue;
            }
            if (!isValidHoverTarget(living)) {
                continue;
            }

            Box hoverBox = living.getBoundingBox().expand(xzExpand, 0.0, xzExpand);
            boolean intersectsNow = camera.getBoundingBox().intersects(hoverBox) || hoverBox.contains(start);
            if (intersectsNow) {
                if (0.0 <= bestDistance) {
                    bestDistance = 0.0;
                    best = living;
                }
                continue;
            }
            var hit = hoverBox.raycast(start, end);
            if (hit.isEmpty()) {
                continue;
            }

            double hitDistance = start.distanceTo(hit.get());
            if (hitDistance <= bestDistance) {
                bestDistance = hitDistance;
                best = living;
            }
        }

        return best;
    }

    protected boolean isValidHoverTarget(LivingEntity entity) {
        return entity != null
                && entity.isAlive()
                && entity != mc.player
                && !entity.isSpectator()
                && entity.canHit();
    }

    protected StreamerMode getStreamerMode() {
        return ClientContainer.getNexisInstance().getFunctionManager().getStreamerMode();
    }

    protected boolean shouldProtectName(LivingEntity target) {
        StreamerMode streamerMode = getStreamerMode();
        if (streamerMode == null || !streamerMode.isState())
            return false;
        if (!streamerMode.nameProtect.get())
            return false;

        String targetName = target.getName().getString();

        if (target == mc.player || targetName.equals(mc.getSession().getUsername())) {
            return true;
        }

        if (streamerMode.nameProtectReplaceFriendNicknames.get()) {
            if (target instanceof PlayerEntity) {
                return ClientContainer.getNexisInstance().getFriendStorage().isFriend(targetName);
            }
        }

        return false;
    }

    protected String getProtectedName() {
        StreamerMode streamerMode = getStreamerMode();
        if (streamerMode != null) {
            return streamerMode.nameProtectName.get();
        }
        return "Protected";
    }

    protected String getDisplayName(LivingEntity target, int maxLen) {
        String name;

        if (shouldProtectName(target)) {
            name = getProtectedName();
        } else {
            name = target.getName().getString();
        }

        return truncateName(name, maxLen);
    }

    protected static String truncateName(String name, int maxLen) {
        if (name == null || maxLen <= 0) {
            return "";
        }
        if (name.length() <= maxLen) {
            return name;
        }
        return name.substring(0, maxLen);
    }

    static float lerp(float current, float target, float speed) {
        return current + (target - current) * Math.min(speed, 1f);
    }

    static Color lerpColorWithAlpha(Color start, Color end, float progress) {
        progress = Math.max(0, Math.min(1, progress));
        int r = (int) (start.getRed() + (end.getRed() - start.getRed()) * progress);
        int g = (int) (start.getGreen() + (end.getGreen() - start.getGreen()) * progress);
        int b = (int) (start.getBlue() + (end.getBlue() - start.getBlue()) * progress);
        int a = (int) (start.getAlpha() + (end.getAlpha() - start.getAlpha()) * progress);
        return new Color(r, g, b, a);
    }

    protected static int adjustBrightness(int color, float factor) {
        int r = Math.min(255, Math.max(0, (int) ((color >> 16 & 0xFF) * factor)));
        int g = Math.min(255, Math.max(0, (int) ((color >> 8 & 0xFF) * factor)));
        int b = Math.min(255, Math.max(0, (int) ((color & 0xFF) * factor)));
        return (r << 16) | (g << 8) | b;
    }

    protected static int withAlpha(int rgb) {
        return 0xFF000000 | (rgb & 0x00FFFFFF);
    }

    protected static void beginScaledScissor(float x, float y, float w, float h, float centerX, float centerY,
                                             float scale) {
        float sx = centerX + (x - centerX) * scale;
        float sy = centerY + (y - centerY) * scale;
        float sw = w * scale;
        float sh = h * scale;

        double sf = mc.getWindow().getScaleFactor();
        int scX = (int) Math.floor(sx * sf);
        int scY = (int) Math.floor((mc.getWindow().getScaledHeight() - (sy + sh)) * sf);
        int scW = Math.max(1, (int) Math.ceil(sw * sf));
        int scH = Math.max(1, (int) Math.ceil(sh * sf));

        RenderUtil.enableScissor();
        RenderUtil.scissor(scX, scY, scW, scH);
    }

    protected static void endScissor() {
        RenderUtil.disableScissor();
    }

    protected Identifier resolveEntityTexture(LivingEntity entity) {
        return EntityTextureTracker.get(entity);
    }

    protected FaceUv resolveMobFaceUv(Identifier texture) {
        TextureSize size = getTextureSize(texture);
        if (size == null) {
            return null;
        }
        if (size.width() < 16 || size.height() < 16) {
            return null;
        }

        return new FaceUv(
                8f / size.width(),
                8f / size.height(),
                16f / size.width(),
                16f / size.height());
    }

    protected @Nullable TextureSize getTextureSize(Identifier texture) {
        TextureSize cached = TEXTURE_SIZE_CACHE.get(texture);
        if (cached != null) {
            return cached;
        }
        try {
            var optionalResource = mc.getResourceManager().getResource(texture);
            if (optionalResource.isEmpty()) {
                return null;
            }
            try (InputStream inputStream = optionalResource.get().getInputStream();
                 NativeImage image = NativeImage.read(inputStream)) {
                TextureSize size = new TextureSize(image.getWidth(), image.getHeight());
                TEXTURE_SIZE_CACHE.put(texture, size);
                return size;
            }
        } catch (Throwable ignored) {
            return null;
        }
    }

    protected List<ItemStack> getTargetItems(LivingEntity target) {
        List<ItemStack> items = new ArrayList<>();
        items.add(target.getMainHandStack());
        items.add(target.getOffHandStack());
        items.add(target.getEquippedStack(EquipmentSlot.HEAD));
        items.add(target.getEquippedStack(EquipmentSlot.CHEST));
        items.add(target.getEquippedStack(EquipmentSlot.LEGS));
        items.add(target.getEquippedStack(EquipmentSlot.FEET));
        return items;
    }

    protected void renderTargetItemsRow(Renderer2D renderer, LivingEntity target, float x, float y, float alpha,
                                        boolean underName) {
        List<ItemStack> items = getTargetItems(target);
        float itemSize = underName ? 16f : 20f;
        float spacing = underName ? 1f : 2f;
        float itemX = x - 2;
        float itemY = underName ? y : y - itemSize - 4f;
        float itemSpacing = 1f;

        for (ItemStack stack : items) {
            if (MODE_ROUND.equalsIgnoreCase(fun.nexisdlc.client.utils.render.drag.DraggingManager.getHudMode(SETTINGS_SCOPE, SETTING_MODE, MODE_DEFAULT))) {
                renderer.rect(itemX, itemY, itemSize + 2, itemSize + 2, 4f, ClientColors.applyAlpha(new Color(255, 255, 255, 15).getRGB(), alpha));
            }

            if (stack == null || stack.isEmpty() && (MODE_ROUND.equalsIgnoreCase(fun.nexisdlc.client.utils.render.drag.DraggingManager.getHudMode(SETTINGS_SCOPE, SETTING_MODE, MODE_DEFAULT)))) {
                //    float dotSize = itemSize * 0.3f;
                //    float dotX = itemX + (itemSize + 2) / 2 - dotSize / 2;
                //    float dotY = itemY + (itemSize + 2) / 2 - dotSize / 2;
                //    renderer.rect(dotX, dotY, dotSize, dotSize, dotSize / 2,
                //            applyAlpha(new Color(173, 37, 37, 180).getRGB(), alpha));
            } else {
                renderItemViaContext(renderer, stack, itemX + 3, itemY + 3, itemSize - 4, alpha);
            }

            itemX += itemSize + 2 + itemSpacing;
        }
    }

    protected void renderItemViaContext(Renderer2D renderer, ItemStack stack, float x, float y, float size, float alpha) {
        if (stack == null || stack.isEmpty())
            return;
        var context = ClientContainer.getNexisInstance().testRender.getDrawContext();
        if (context == null)
            return;

        float alphaMul = Math.max(0f, Math.min(1f, alpha));
        if (alphaMul <= 0f)
            return;

        var transform = renderer.getTransformStack().current();
        float absX = x;
        float absY = y;
        float absSize = size;

        if (transform != null && transform.length >= 6) {
            float scaleX = (float) Math.sqrt(transform[0] * transform[0] + transform[3] * transform[3]);
            float scaleY = (float) Math.sqrt(transform[1] * transform[1] + transform[4] * transform[4]);
            absX = transform[0] * x + transform[1] * y + transform[2];
            absY = transform[3] * x + transform[4] * y + transform[5];
            absSize = size * Math.min(scaleX, scaleY);
        }
        if (!Float.isFinite(absX) || !Float.isFinite(absY) || !Float.isFinite(absSize) || absSize <= 0f)
            return;

        double windowScale = mc.getWindow().getScaleFactor();
        if (windowScale <= 0.0)
            return;

        float guiX = (float) (absX / windowScale);
        float guiY = (float) (absY / windowScale);
        float baseGuiScale = (float) (absSize / (16f * windowScale));
        float guiScale = baseGuiScale * alphaMul;
        if (!Float.isFinite(guiX) || !Float.isFinite(guiY) || !Float.isFinite(guiScale) || guiScale <= 0f)
            return;

        float baseSizeGui = 16f * baseGuiScale;
        float scaledSizeGui = 16f * guiScale;
        float centerOffset = (baseSizeGui - scaledSizeGui) * 0.5f;

        renderer.flush();
        var matrices = context.getMatrices();
        matrices.pushMatrix();
        matrices.translate(guiX + centerOffset, guiY + centerOffset);
        matrices.scale(guiScale, guiScale);
        ((DrawContextFloatDrawTexture) context).nexis$drawItem(stack, 0, 0, false, CULLING_OWNER);
        matrices.popMatrix();
        renderer.resetPipelineState();
    }

    protected void drawSkinRegionNearest(Renderer2D renderer, Identifier texture, float x, float y, float w, float h,
                                         float u0, float v0, float u1, float v1, int tint, float rounding) {
        int glId = renderer.getTextureGlIdDirect(texture);
        if (glId <= 0) {
            return; // скин ещё не готов — ждём след. кадр, мыльный дефолт не рисуем
        }
        GL11.glBindTexture(GL11.GL_TEXTURE_2D, glId);
        GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_MIN_FILTER, GL11.GL_NEAREST);
        GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_MAG_FILTER, GL11.GL_NEAREST);
        GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL12.GL_TEXTURE_BASE_LEVEL, 0);
        GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL12.GL_TEXTURE_MAX_LEVEL, 0);
        GL11.glBindTexture(GL11.GL_TEXTURE_2D, 0);

        renderer.drawTextureRegionRounded(texture, x, y, w, h, u0, v0, u1, v1, tint, rounding);
    }

    protected void renderRoundHealth(Renderer2D renderer, LivingEntity target, float faceX, float faceY, float faceSize,
                                     float alphaProgress, float deltaTime, float healthPercentage) {
        float maxHealth = Math.max(1f, target.getMaxHealth());
        float absorption = Math.max(0f, target.getAbsorptionAmount());
        float absorptionPercentage = Math.min(1f, absorption / maxHealth);

        int segments = 128;
        float radius = faceSize * 0.42f;
        float segmentSize = 4f;
        float angleStep = 360f / segments;
        float centerX = faceX + width - 40;
        float centerY = faceY + faceSize * 0.5f;

        boolean isInvisible = target.hasStatusEffect(StatusEffects.INVISIBILITY) ||
                (target instanceof PlayerEntity && ((PlayerEntity) target).isInvisible());

        float targetHealthSegments;
        float targetAbsorptionSegments;

        if (isInvisible) {
            long cycleMs = 6000L;
            long phase = System.currentTimeMillis() % cycleMs;
            float anim;
            if (phase < cycleMs / 2) {
                anim = 1f - (phase / (cycleMs / 2f));
            } else {
                anim = (phase - cycleMs / 2f) / (cycleMs / 2f);
            }
            targetHealthSegments = anim * segments;
            targetAbsorptionSegments = 0;
        } else {
            targetHealthSegments = healthPercentage * segments;
            targetAbsorptionSegments = Math.min(segments, (healthPercentage + absorptionPercentage) * segments);
        }

        roundHealthSegmentsAnim = lerp(roundHealthSegmentsAnim, targetHealthSegments, deltaTime * 6f);
        roundAbsorptionSegmentsAnim = lerp(roundAbsorptionSegmentsAnim, targetAbsorptionSegments, deltaTime * 6f);

        int healthSegments = Math.max(0, Math.min(segments, Math.round(roundHealthSegmentsAnim)));
        int totalSegments = Math.max(healthSegments, Math.min(segments, Math.round(roundAbsorptionSegmentsAnim)));

        int emptyColor = applyAlpha(ClientColors.BACKGROUND.getRGB(), alphaProgress * 0.35f);
        for (int i = 0; i < segments; i++) {
            float angle = i * angleStep - 90f;
            float radians = (float) Math.toRadians(angle);
            float posX = centerX + (float) Math.cos(radians) * radius - segmentSize * 0.5f;
            float posY = centerY + (float) Math.sin(radians) * radius - segmentSize * 0.5f;
            renderer.rect(posX, posY, segmentSize, segmentSize, Interface.getHudRounding(SETTINGS_SCOPE, segmentSize * 0.5f),
                    emptyColor);
        }

        if (!isInvisible) {
            int[] colors = resolveHealthColors(healthPercentage, alphaProgress, false);
            for (int i = 0; i < healthSegments; i++) {
                float angle = i * angleStep - 90f;
                float radians = (float) Math.toRadians(angle);
                float posX = centerX + (float) Math.cos(radians) * radius - segmentSize * 0.5f;
                float posY = centerY + (float) Math.sin(radians) * radius - segmentSize * 0.5f;
                renderer.gradient(posX, posY, segmentSize, segmentSize, Interface.getHudRounding(SETTINGS_SCOPE, segmentSize * 0.5f),
                        colors[0], colors[1], colors[0], colors[1]);
            }
        }

        String centerHealthText;

        if (isInvisible) {
            centerHealthText = "?";
            roundHealthTextAnim = -1;
        } else {
            float totalHealth = PlayerUtils.getHealthFloat(target) + absorption;
            if (roundHealthTextEntityId != target.getId()) {
                roundHealthTextEntityId = target.getId();
                roundHealthTextAnim = totalHealth;
            }
            roundHealthTextAnim = lerp(roundHealthTextAnim, totalHealth, deltaTime * 8f);
            centerHealthText = formatRoundHealthText(Math.max(0f, roundHealthTextAnim));
            if (absorption > 0f) {
                lastAbsorptionText = " (+" + formatHealthValue(absorption) + ")";
            }
        }

        float absorptionTarget = absorption > 0f ? 1f : 0f;
        absorptionTextAlpha = lerp(absorptionTextAlpha, absorptionTarget, deltaTime * 10f);
        baseHpYellowProgress = lerp(baseHpYellowProgress, absorptionTarget, deltaTime * 10f);

        float textSize = 15f;
        var baseMetrics = renderer.measureText(FontRegistry.SF_SEMIBOLD, centerHealthText, textSize);
        float textY = centerY - baseMetrics.height * 0.01f + 5;
        Color whiteHpColor = new Color(255, 255, 255, 255);
        Color yellowHpColor = new Color(255, 215, 0, 255);
        Color baseHpColor = lerpColorWithAlpha(whiteHpColor, yellowHpColor, baseHpYellowProgress);
        if (absorptionTextAlpha <= 0.01f || lastAbsorptionText.isEmpty()) {
            int hpTextColor = applyAlpha(baseHpColor.getRGB(), alphaProgress);
            renderer.centredText(FontRegistry.SF_SEMIBOLD, centerX, textY, textSize, centerHealthText, hpTextColor);
        } else {
            var absMetrics = renderer.measureText(FontRegistry.SF_SEMIBOLD, lastAbsorptionText, textSize);
            float totalWidth = baseMetrics.width + absMetrics.width;
            float startX = centerX - totalWidth * 0.5f;
            int hpTextColor = applyAlpha(baseHpColor.getRGB(), alphaProgress);
            int absColor = applyAlpha(yellowHpColor.getRGB(), alphaProgress * absorptionTextAlpha);
            renderer.text(FontRegistry.SF_SEMIBOLD, startX, textY, textSize, centerHealthText, hpTextColor);
            renderer.text(FontRegistry.SF_SEMIBOLD, startX + baseMetrics.width, textY, textSize, lastAbsorptionText, absColor);
        }
    }

    protected String formatRoundHealthText(float health) {
        int rounded = Math.round(health);
        if (Math.abs(health - rounded) < 0.05f) {
            return String.valueOf(rounded);
        }
        return String.format(Locale.US, "%.1f", health);
    }

    protected static String formatHealthValue(float health) {
        int rounded = Math.round(health);
        if (Math.abs(health - rounded) < 0.05f) {
            return String.valueOf(rounded);
        }
        return String.format(Locale.US, "%.1f", health);
    }

    protected int[] resolveHealthColors(float healthPercentage, float alphaProgress, boolean faded) {
        if (fun.nexisdlc.client.utils.render.drag.DraggingManager.getHudBoolean(SETTINGS_SCOPE, SETTING_ADAPTIVE_BAR, false)) {
            int r = (int) (255f * (1f - healthPercentage));
            int g = (int) (255f * healthPercentage);
            int base = new Color(r, g, 0).getRGB();
            float alphaMul = faded ? 0.5f : 1f;
            int darker = applyAlpha(withAlpha(adjustBrightness(base, 0.5f)), alphaProgress * alphaMul);
            int lighter = applyAlpha(withAlpha(adjustBrightness(base, 1.15f)), alphaProgress * alphaMul);
            return new int[]{darker, lighter};
        }

        float alphaMul = faded ? 0.5f : 1f;
        return new int[]{
                applyAlpha(ClientColors.GRADIENT_START.getRGB(), alphaProgress * alphaMul),
                applyAlpha(ClientColors.GRADIENT_END.getRGB(), alphaProgress * alphaMul)
        };
    }

    protected record TextureSize(int width, int height) {
    }

    protected record FaceUv(float u0, float v0, float u1, float v1) {
    }
}
