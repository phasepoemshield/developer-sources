package fun.wonderful.client.modules.impl.render.base.implement;

import com.mojang.blaze3d.systems.RenderSystem;
import fun.wonderful.Wonderful;
import fun.wonderful.api.events.implement.EventRender;
import fun.wonderful.api.storages.implement.helpertstorages.enumvar.ModuleClass;
import fun.wonderful.api.utils.animation.AnimationUtils;
import fun.wonderful.api.utils.animation.Easings;
import fun.wonderful.api.utils.color.ColorUtils;
import fun.wonderful.api.utils.draggable.Draggable;
import fun.wonderful.api.utils.render.RenderUtils;
import fun.wonderful.api.utils.render.fonts.msdf.Font;
import fun.wonderful.api.utils.render.fonts.msdf.Fonts;
import fun.wonderful.client.modules.impl.combat.Aura;
import fun.wonderful.client.modules.impl.misc.NameProtect;
import fun.wonderful.client.modules.impl.misc.ScoreboardHP;
import fun.wonderful.client.modules.impl.render.base.InterfaceProcessing;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.client.gl.ShaderProgramKeys;
import net.minecraft.client.gl.ShaderProgramKey;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.client.render.BufferRenderer;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.render.Tessellator;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.render.VertexFormat;
import net.minecraft.util.math.MathHelper;
import net.minecraft.client.gui.screen.ChatScreen;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.render.BuiltBuffer;
import org.joml.Matrix4f;

public class TargetHud
extends InterfaceProcessing {
    private static final int HUD_TEXT_COLOR = ColorUtils.rgb(245, 245, 245);
    private static final int HUD_SECONDARY_TEXT_COLOR = ColorUtils.rgb(185, 185, 215);
    private static final int HUD_ABSORPTION_TEXT_COLOR = ColorUtils.rgb(255, 230, 145);
    private static final int HUD_ABSORPTION_BAR_LEFT = ColorUtils.rgb(255, 218, 167);
    private static final int HUD_ABSORPTION_BAR_RIGHT = ColorUtils.rgb(107, 104, 87);
    private static final int HUD_WAVE_STROKE_COLOR = ColorUtils.rgba(185, 185, 185, 255);
    private static final float HUD_RADIUS = 3.0f;
    private static final float[] WHOLES_WAVE_POINTS_T = new float[]{0.0f, 0.26f, 0.64f, 0.84f, 1.0f};
    private static final float[] WHOLES_WAVE_POINTS_X = new float[]{0.58f, 0.65f, 0.55f, 0.58f, 0.49f};
    private static final int WAVE_MASK_SEGMENTS = 220;
    private static final int WAVE_DOT_SEGMENTS = 12;
    private static final float[] WAVE_DOT_COS = TargetHud.createDotTrigTable(true);
    private static final float[] WAVE_DOT_SIN = TargetHud.createDotTrigTable(false);
    private final AnimationUtils alphaAnimation = new AnimationUtils(0.0f, 9.0f, Easings.QUAD_OUT);
    private final AnimationUtils healthAnimation = new AnimationUtils(1.0f, 9.0f, Easings.QUAD_OUT);
    private final AnimationUtils absorptionAnimation = new AnimationUtils(0.0f, 9.0f, Easings.QUAD_OUT);
    private final ItemStack[] armorItems = new ItemStack[4];
    private final ItemStack[] armorScratch = new ItemStack[4];
    private final List<HeadParticle> headParticles = new ObjectArrayList();
    private LivingEntity lastTarget;
    private boolean headParticlesEnabled = true;
    private boolean healthBarStyleEnabled = false;
    private long lastParticleUpdateNs = System.nanoTime();
    private LivingEntity particleTarget;
    private int lastTargetHurtTime = 0;

    public TargetHud(Draggable draggable) {
        super(draggable);
    }

    private Font issue(int size) {
        return Fonts.getFont("sf_regular", size);
    }

    private String trimToWidth(Font font, String text, float maxWidth) {
        String next;
        if (text == null || text.isEmpty() || maxWidth <= 0.0f) {
            return "";
        }
        if (font.getWidth(text) <= maxWidth) {
            return text;
        }
        StringBuilder builder = new StringBuilder();
        for (int i2 = 0; i2 < text.length() && !(font.getWidth(next = builder.toString() + text.charAt(i2)) > maxWidth); ++i2) {
            builder.append(text.charAt(i2));
        }
        return builder.toString();
    }

    private String getProtectedName(String input) {
        NameProtect nameProtect;
        NameProtect nameProtect2 = ModuleClass.INSTANCE != null ? ModuleClass.nameProtect : (nameProtect = null);
        if (nameProtect == null || !nameProtect.isEnable()) {
            return input;
        }
        return nameProtect.patch(input);
    }

    public boolean isHeadParticlesEnabled() {
        return this.headParticlesEnabled;
    }

    public void setHeadParticlesEnabled(boolean headParticlesEnabled) {
        this.headParticlesEnabled = headParticlesEnabled;
        if (!headParticlesEnabled) {
            this.headParticles.clear();
        }
    }

    public boolean isHealthBarStyleEnabled() {
        return false;
    }

    public void setHealthBarStyleEnabled(boolean healthBarStyleEnabled) {
        this.healthBarStyleEnabled = false;
    }

    private int getHudThemeColor() {
        if (!Wonderful.INSTANCE.themeStorage.getThemes().getTheme().getName().equals("Rainbow")) {
            return Wonderful.INSTANCE.themeStorage.getThemes().getTheme().color[0];
        }
        return ColorUtils.getThemeColor();
    }

    private int collectArmorItems(LivingEntity target) {
        int i2;
        int armorCount = 0;
        for (ItemStack stack : target.getArmorItems()) {
            if (armorCount >= this.armorScratch.length) continue;
            this.armorScratch[armorCount++] = stack;
        }
        int count = 0;
        for (i2 = armorCount - 1; i2 >= 0; --i2) {
            if (this.armorScratch[i2].isEmpty()) continue;
            this.armorItems[count++] = this.armorScratch[i2];
        }
        for (i2 = count; i2 < this.armorItems.length; ++i2) {
            this.armorItems[i2] = ItemStack.EMPTY;
        }
        for (i2 = 0; i2 < this.armorScratch.length; ++i2) {
            this.armorScratch[i2] = ItemStack.EMPTY;
        }
        return count;
    }

    private void drawLegacyArmorItem(EventRender.Default eventRender, MatrixStack matrices, ItemStack stack, float slotX, float slotY, float scale) {
        if (stack.isEmpty()) {
            return;
        }
        matrices.push();
        matrices.translate(slotX + 4.0f, slotY + 4.0f, 0.0f);
        matrices.scale(scale, scale, 1.0f);
        matrices.translate(-4.0f, -4.0f, 0.0f);
        eventRender.getContext().drawItem(stack, 0, 0);
        matrices.pop();
    }

    private void updateAndRenderHeadParticles(MatrixStack matrices, LivingEntity target, float headX, float headY, float headSize, float alpha, int themeColor) {
        if (target == null || alpha <= 0.02f) {
            this.headParticles.clear();
            this.particleTarget = target;
            this.lastTargetHurtTime = 0;
            return;
        }
        long now = System.nanoTime();
        float deltaTicks = MathHelper.clamp((float)((float)(now - this.lastParticleUpdateNs) / 1.0E9f * 60.0f), (float)0.2f, (float)3.0f);
        this.lastParticleUpdateNs = now;
        if (this.particleTarget != target) {
            this.headParticles.clear();
            this.particleTarget = target;
            this.lastTargetHurtTime = Math.max(0, target.hurtTime);
        }
        ThreadLocalRandom random = ThreadLocalRandom.current();
        float centerX = headX + headSize * 0.5f;
        float centerY = headY + headSize * 0.5f;
        int hurtTime = Math.max(0, target.hurtTime);
        boolean spawnBurst = hurtTime > 0 && (hurtTime > this.lastTargetHurtTime || hurtTime % 3 == 0);
        this.lastTargetHurtTime = hurtTime;
        if (spawnBurst) {
            int burstCount = 1 + random.nextInt(2);
            for (int n2 = 0; n2 < burstCount && this.headParticles.size() < 14; ++n2) {
                float angle = (float)(random.nextDouble() * Math.PI * 2.0);
                float radius = random.nextFloat() * headSize * 0.24f;
                float spreadAngle = (float)(random.nextDouble() * Math.PI * 2.0);
                float speed = 0.58f + random.nextFloat() * 0.9f;
                HeadParticle p2 = new HeadParticle();
                p2.x = centerX + MathHelper.cos((float)angle) * radius;
                p2.y = centerY + MathHelper.sin((float)angle) * radius;
                p2.vx = MathHelper.cos((float)spreadAngle) * speed + (p2.x - centerX) * 0.025f;
                p2.vy = MathHelper.sin((float)spreadAngle) * speed + (p2.y - centerY) * 0.025f;
                p2.size = 3.8f + random.nextFloat() * 1.4f;
                p2.age = 0.0f;
                p2.maxAge = 74.0f + random.nextFloat() * 42.0f;
                this.headParticles.add(p2);
            }
        }
        for (int i2 = this.headParticles.size() - 1; i2 >= 0; --i2) {
            HeadParticle p3 = this.headParticles.get(i2);
            p3.age += deltaTicks;
            if (p3.age >= p3.maxAge) {
                this.headParticles.remove(i2);
                continue;
            }
            p3.x += p3.vx * deltaTicks;
            p3.y += p3.vy * deltaTicks;
            p3.vx *= (float)Math.pow(0.975f, deltaTicks);
            p3.vy *= (float)Math.pow(0.975f, deltaTicks);
            p3.vy += 0.0012f * deltaTicks;
            float life = 1.0f - p3.age / p3.maxAge;
            float smoothLife = life * life * (3.0f - 2.0f * life);
            float particleAlpha = alpha * smoothLife;
            if (particleAlpha <= 0.02f) continue;
            float drawX = p3.x - p3.size * 0.5f;
            float drawY = p3.y - p3.size * 0.5f;
            int coreColor = ColorUtils.applyAlpha(themeColor, particleAlpha * 0.58f);
            RenderUtils.drawRoundedRect(matrices, drawX, drawY, p3.size, p3.size, p3.size * 0.45f, coreColor);
        }
    }

    private void drawHead(MatrixStack matrices, LivingEntity target, float x2, float y2, float size, float alpha) {
        float drawX = (float)Math.floor(x2);
        float drawY = (float)Math.floor(y2);
        float drawSize = (float)Math.floor(size);
        float headRadius = 2.2f;
        if (target instanceof PlayerEntity) {
            PlayerEntity playerEntity = (PlayerEntity)target;
            RenderUtils.drawPlayerHead(matrices, playerEntity.getUuid(), drawX, drawY, drawSize, headRadius, alpha, 0.0f);
            return;
        }
        RenderUtils.drawRoundedRect(matrices, drawX, drawY, drawSize, drawSize, headRadius, ColorUtils.rgba(21, 21, 21, (int)(255.0f * alpha)));
        this.issue(21).drawCenteredString(matrices, "?", drawX + drawSize * 0.5f, drawY + drawSize * 0.5f - 4.0f, ColorUtils.rgba(230, 230, 230, (int)(255.0f * alpha)));
    }

    private void drawFigmaPanel(MatrixStack matrices, float x2, float y2, float width, float height, int themeColor, float alpha) {
        if (alpha <= 0.01f) {
            return;
        }
        int darkTop = ColorUtils.setAlphaColor(ColorUtils.darken(themeColor, 0.15f), 255);
        int darkBottom = ColorUtils.setAlphaColor(ColorUtils.darken(themeColor, 0.05f), 255);
        int lightTop = ColorUtils.setAlphaColor(ColorUtils.darken(themeColor, 0.13f), 255);
        int lightBottom = ColorUtils.setAlphaColor(ColorUtils.darken(themeColor, 0.12f), 255);
        float inset = 0.0f;
        float innerX = x2 + inset;
        float innerY = y2 + inset;
        float innerWidth = width - inset * 2.0f;
        float innerHeight = height - inset * 2.0f;
        RenderUtils.drawGradientRect(matrices, innerX, innerY, innerWidth, innerHeight, 3.0f, darkTop, darkBottom);
        this.drawLightWaveMask(matrices, innerX + 0.5f, innerY + 0.5f, innerWidth - 1.0f, innerHeight - 1.0f, lightTop, lightBottom);
        this.drawWaveStroke(matrices, innerX + 0.5f, innerY + 0.5f, innerWidth - 1.0f, innerHeight - 1.0f, alpha);
    }

    private void drawLightWaveMask(MatrixStack matrices, float x2, float y2, float width, float height, int topColor, int bottomColor) {
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.setShader((ShaderProgramKey)ShaderProgramKeys.POSITION_COLOR);
        Matrix4f matrix = matrices.peek().getPositionMatrix();
        BufferBuilder buffer = Tessellator.getInstance().begin(VertexFormat.class_5596.QUADS, VertexFormats.POSITION_COLOR);
        int segments = 220;
        for (int i2 = 0; i2 < segments; ++i2) {
            float t1 = (float)i2 / (float)segments;
            float t2 = (float)(i2 + 1) / (float)segments;
            float y1 = y2 + height * t1;
            float y22 = y2 + height * t2;
            float leftX1 = this.getRoundedLeftClipX(x2, y2, height, y1);
            float leftX2 = this.getRoundedLeftClipX(x2, y2, height, y22);
            float waveX1 = this.getWaveX(x2, width, t1);
            float waveX2 = this.getWaveX(x2, width, t2);
            int color1 = ColorUtils.interpolateColor(topColor, bottomColor, t1);
            int color2 = ColorUtils.interpolateColor(topColor, bottomColor, t2);
            buffer.vertex(matrix, leftX1, y1, 0.0f).color(color1);
            buffer.vertex(matrix, leftX2, y22, 0.0f).color(color2);
            buffer.vertex(matrix, waveX2, y22, 0.0f).color(color2);
            buffer.vertex(matrix, waveX1, y1, 0.0f).color(color1);
        }
        BufferRenderer.drawWithGlobalProgram((BuiltBuffer)buffer.end());
        RenderSystem.disableBlend();
    }

    private float getRoundedLeftClipX(float x2, float y2, float height, float currentY) {
        float localY = currentY - y2;
        float radius = 3.0f;
        if (localY < radius) {
            float dy = radius - localY;
            return x2 + radius - (float)Math.sqrt(Math.max(0.0f, radius * radius - dy * dy));
        }
        if (localY > height - radius) {
            float dy = localY - (height - radius);
            return x2 + radius - (float)Math.sqrt(Math.max(0.0f, radius * radius - dy * dy));
        }
        return x2;
    }

    private float getRoundedRightClipX(float x2, float y2, float width, float height, float currentY) {
        float localY = currentY - y2;
        float radius = 3.0f;
        if (localY < radius) {
            float dy = radius - localY;
            return x2 + width - radius + (float)Math.sqrt(Math.max(0.0f, radius * radius - dy * dy));
        }
        if (localY > height - radius) {
            float dy = localY - (height - radius);
            return x2 + width - radius + (float)Math.sqrt(Math.max(0.0f, radius * radius - dy * dy));
        }
        return x2 + width;
    }

    private float getWaveX(float x2, float width, float t2) {
        int point;
        t2 = MathHelper.clamp((float)t2, (float)0.0f, (float)1.0f);
        for (point = 0; point < WHOLES_WAVE_POINTS_T.length - 2 && t2 > WHOLES_WAVE_POINTS_T[point + 1]; ++point) {
        }
        int p1 = point;
        int p2 = Math.min(WHOLES_WAVE_POINTS_T.length - 1, point + 1);
        float span = WHOLES_WAVE_POINTS_T[p2] - WHOLES_WAVE_POINTS_T[p1];
        float local = span <= 1.0E-4f ? 0.0f : (t2 - WHOLES_WAVE_POINTS_T[p1]) / span;
        float x1 = WHOLES_WAVE_POINTS_X[p1];
        float x22 = WHOLES_WAVE_POINTS_X[p2];
        float smooth = local * local * local * (local * (local * 6.0f - 15.0f) + 10.0f);
        float wave = MathHelper.lerp((float)smooth, (float)x1, (float)x22);
        return x2 + width * wave;
    }

    private void drawWaveStroke(MatrixStack matrices, float x2, float y2, float width, float height, float alpha) {
        this.drawWaveSoftStroke(matrices, x2, y2, width, height, 1.75f, ColorUtils.rgba(185, 185, 185, 255), 150);
        this.drawWaveSoftStroke(matrices, x2, y2, width, height, 1.15f, ColorUtils.rgba(185, 185, 185, 255), 170);
        this.drawWaveSoftStroke(matrices, x2, y2, width, height, 0.7f, HUD_WAVE_STROKE_COLOR, 190);
    }

    private void drawWaveSoftStroke(MatrixStack matrices, float x2, float y2, float width, float height, float diameter, int color, int steps) {
        int alpha = ColorUtils.getAlpha(color);
        if (alpha <= 0 || diameter <= 0.0f || steps <= 0) {
            return;
        }
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.setShader((ShaderProgramKey)ShaderProgramKeys.POSITION_COLOR);
        Matrix4f matrix = matrices.peek().getPositionMatrix();
        BufferBuilder buffer = Tessellator.getInstance().begin(VertexFormat.class_5596.TRIANGLES, VertexFormats.POSITION_COLOR);
        float half = diameter * 0.5f;
        float red = ColorUtils.redf(color);
        float green = ColorUtils.greenf(color);
        float blue = ColorUtils.bluef(color);
        float alphaF = (float)alpha / 255.0f;
        for (int i2 = 0; i2 <= steps; ++i2) {
            float t2 = (float)i2 / (float)steps;
            float centerX = this.getWaveX(x2, width, t2);
            float centerY = y2 + height * t2;
            for (int segment = 0; segment < 12; ++segment) {
                int next = segment + 1;
                buffer.vertex(matrix, centerX, centerY, 0.0f).color(red, green, blue, alphaF);
                buffer.vertex(matrix, centerX + WAVE_DOT_COS[segment] * half, centerY + WAVE_DOT_SIN[segment] * half, 0.0f).color(red, green, blue, alphaF);
                buffer.vertex(matrix, centerX + WAVE_DOT_COS[next] * half, centerY + WAVE_DOT_SIN[next] * half, 0.0f).color(red, green, blue, alphaF);
            }
        }
        BufferRenderer.drawWithGlobalProgram((BuiltBuffer)buffer.end());
        RenderSystem.disableBlend();
    }

    private static float[] createDotTrigTable(boolean cos) {
        float[] table = new float[13];
        for (int i2 = 0; i2 <= 12; ++i2) {
            double angle = Math.PI * 2 * (double)i2 / 12.0;
            table[i2] = (float)(cos ? Math.cos(angle) : Math.sin(angle));
        }
        return table;
    }

    @Override
    public void onRender(EventRender.Default eventRender) {
        LivingEntity target;
        if (TargetHud.mc.player == null) {
            this.headParticles.clear();
            this.lastTargetHurtTime = 0;
            this.draggable.setWidth(0.0f);
            this.draggable.setHeight(0.0f);
            return;
        }
        Aura aura = ModuleClass.aura;
        boolean chatOpen = TargetHud.mc.currentScreen instanceof ChatScreen;
        LivingEntity auraTarget = aura != null ? aura.getTarget() : null;
        boolean visible = chatOpen || auraTarget != null;
        this.alphaAnimation.setSpeed(visible ? 9.0f : 5.5f);
        this.alphaAnimation.update(visible ? 1.0f : 0.0f);
        float alpha = MathHelper.clamp((float)this.alphaAnimation.getValue(), (float)0.0f, (float)1.0f);
        if (visible) {
            Object object = this.lastTarget = chatOpen ? TargetHud.mc.player : auraTarget;
        }
        Object object = visible ? (chatOpen ? TargetHud.mc.player : auraTarget) : (target = this.lastTarget);
        if (target == null || alpha <= 0.01f) {
            this.headParticles.clear();
            this.lastTargetHurtTime = 0;
            this.draggable.setWidth(0.0f);
            this.draggable.setHeight(0.0f);
            return;
        }
        float maxHealth = Math.max(1.0f, target.getMaxHealth());
        float rawHealth = visible ? ScoreboardHP.getHealth(target) : 0.0f;
        float rawAbsorption = visible ? target.getAbsorptionAmount() : 0.0f;
        this.healthAnimation.update(rawHealth);
        this.absorptionAnimation.update(rawAbsorption);
        float displayedHealth = MathHelper.clamp((float)this.healthAnimation.getValue(), (float)0.0f, (float)maxHealth);
        float displayedAbsorption = MathHelper.clamp((float)this.absorptionAnimation.getValue(), (float)0.0f, (float)maxHealth);
        float healthProgress = MathHelper.clamp((float)(displayedHealth / maxHealth), (float)0.0f, (float)1.0f);
        float absorptionProgress = MathHelper.clamp((float)(displayedAbsorption / maxHealth), (float)0.0f, (float)1.0f);
        float goldenAlpha = MathHelper.clamp((float)(rawAbsorption / Math.max(maxHealth * 0.35f, 1.0f)), (float)0.25f, (float)1.0f);
        float x2 = this.draggable.getX();
        float y2 = this.draggable.getY();
        int themeColor = this.getHudThemeColor();
        int themeColor2 = ColorUtils.darken(themeColor, 0.3f);
        int textColor = ColorUtils.applyAlpha(HUD_TEXT_COLOR, alpha);
        int secondaryTextColor = ColorUtils.applyAlpha(HUD_SECONDARY_TEXT_COLOR, alpha);
        int absorptionTextColor = ColorUtils.applyAlpha(HUD_ABSORPTION_TEXT_COLOR, alpha);
        int accentLeft = ColorUtils.setAlphaColor(themeColor2, 255);
        int accentRight = ColorUtils.setAlphaColor(themeColor, 255);
        int barBackgroundColor = ColorUtils.setAlphaColor(ColorUtils.darken(themeColor, 0.72f), 255);
        String name = this.getProtectedName(target.getName().getString());
        String healthNumberText = String.valueOf(Math.round(displayedHealth));
        String healthSuffixText = "HP";
        int roundedAbsorption = Math.round(displayedAbsorption);
        Object absorptionNumberText = roundedAbsorption > 0 ? "+" + roundedAbsorption : "";
        String absorptionSuffixText = roundedAbsorption > 0 ? "AB" : "";
        float cardHeight = 32.0f;
        float cardPadding = 4.5f;
        float headSize = 19.0f;
        float headOffsetX = 0.0f;
        float cardWidth = 92.0f;
        float cardX = Math.round(x2);
        float cardY = Math.round(y2);
        MatrixStack matrices = eventRender.getContext().getMatrices();
        matrices.push();
        this.drawFigmaPanel(matrices, cardX, cardY, cardWidth, cardHeight, themeColor, alpha);
        float headBaseX = cardX + cardPadding;
        float headX = headBaseX + headOffsetX;
        float headY = cardY + 4.0f;
        if (this.headParticlesEnabled) {
            this.updateAndRenderHeadParticles(matrices, target, headX, headY, headSize, alpha, themeColor);
        } else {
            this.headParticles.clear();
        }
        this.drawHead(matrices, target, headX, headY, headSize, alpha);
        float textX = headBaseX + headSize + 4.0f;
        float nameY = cardY + 5.7f;
        float absorptionWidth = ((String)absorptionNumberText).isEmpty() ? 0.0f : this.issue(12).getWidth((String)absorptionNumberText + absorptionSuffixText);
        float absorptionX = cardX + cardWidth - cardPadding - absorptionWidth;
        float nameMaxWidth = Math.max(8.0f, cardX + cardWidth - cardPadding - textX);
        String visibleName = this.trimToWidth(this.issue(14), name, nameMaxWidth);
        this.issue(14).draw(matrices, visibleName, textX, nameY, textColor);
        float healthTextX = textX + 0.5f;
        this.issue(12).draw(matrices, healthNumberText, healthTextX, cardY + 16.6f, accentRight);
        this.issue(12).draw(matrices, healthSuffixText, healthTextX + this.issue(12).getWidth(healthNumberText), cardY + 16.6f, ColorUtils.applyAlpha(ColorUtils.rgb(185, 185, 185), alpha));
        if (!((String)absorptionNumberText).isEmpty()) {
            this.issue(12).draw(matrices, (String)absorptionNumberText, absorptionX, cardY + 16.6f, absorptionTextColor);
            this.issue(12).draw(matrices, absorptionSuffixText, absorptionX + this.issue(12).getWidth((String)absorptionNumberText), cardY + 16.6f, ColorUtils.applyAlpha(ColorUtils.rgb(185, 185, 185), alpha));
        }
        float barX = cardX + cardPadding;
        float barY = cardY + cardHeight - 6.2f;
        float barWidth = cardWidth - cardPadding * 2.0f;
        float barHeight = 3.4f;
        float barRadius = barHeight - 2.5f;
        RenderUtils.drawRoundedRect(matrices, barX, barY, barWidth, barHeight, barRadius, barBackgroundColor);
        float healthFillWidth = barWidth * healthProgress;
        if (alpha > 0.04f && healthFillWidth > 1.2f) {
            float healthRadius = Math.min(barRadius, healthFillWidth * 0.5f);
            RenderUtils.drawGradientRect(matrices, barX, barY, healthFillWidth, barHeight, healthRadius, accentLeft, accentRight, true);
        }
        if (alpha > 0.04f && (rawAbsorption > 0.05f || displayedAbsorption > 0.05f) && absorptionProgress > 0.01f) {
            float absorptionBarWidth = barWidth * absorptionProgress;
            float absorptionRadius = Math.min(barRadius, absorptionBarWidth * 0.5f);
            RenderUtils.drawGradientRect(matrices, barX + barWidth - absorptionBarWidth, barY, absorptionBarWidth, barHeight, absorptionRadius, ColorUtils.applyAlpha(HUD_ABSORPTION_BAR_LEFT, alpha * goldenAlpha), ColorUtils.applyAlpha(HUD_ABSORPTION_BAR_RIGHT, alpha * goldenAlpha), true);
        }
        matrices.pop();
        this.draggable.setWidth(cardWidth);
        this.draggable.setHeight(cardHeight);
        super.onRender(eventRender);
    }

    private static final class HeadParticle {
        float x;
        float y;
        float vx;
        float vy;
        float size;
        float age;
        float maxAge;

        private HeadParticle() {
        }
    }
}