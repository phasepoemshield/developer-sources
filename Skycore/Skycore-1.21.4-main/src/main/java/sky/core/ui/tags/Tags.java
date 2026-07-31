package sky.core.ui.tags;

import com.mojang.blaze3d.systems.RenderSystem;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.component.type.ItemEnchantmentsComponent;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import org.joml.Vector4d;
import sky.core.module.impl.visuals.TagsModule;
import sky.core.util.ServerUtil;
import sky.core.util.render.ProjectionUtil;
import sky.core.util.render.RenderUtil;
import sky.core.util.render.font.FontManager;
import sky.core.util.render.font.FontRenderer;

public final class Tags {
    private static final int FONT_SIZE = 13;
    private static final int EFFECT_FONT_SIZE = 11;
    private static final int ENCHANT_FONT_SIZE = 8;
    private static final float RECT_HEIGHT = 12.0F;
    private static final float PADDING = 3.0F;
    private static final float TEXT_GAP = 1.5F;
    private static final float ITEM_SLOT_STEP = 10.5F;
    private static final float ITEM_SLOT_SIZE = 8.0F;
    private static final float ENCHANT_LINE_STEP = 5.0F;
    private static final double MAX_DISTANCE = 128.0;
    private static final Color BACKGROUND = new Color(0, 0, 0, 85);
    private static final Color HP_COLOR = new Color(255, 68, 68, 255);
    private static final Color TEXT_COLOR = Color.WHITE;

    private final MinecraftClient client = MinecraftClient.getInstance();

    public void render(DrawContext context, MatrixStack matrices, float screenWidth, float screenHeight, float delta) {
        TagsModule module = TagsModule.INSTANCE;
        if (!module.isEnabled() || this.client.world == null || this.client.player == null) {
            return;
        }

        RenderUtil renderer = RenderUtil.get();
        FontRenderer font = FontManager.getMedium(FONT_SIZE);
        if (renderer == null || font == null) {
            return;
        }

        for (Entity entity : this.client.world.getEntities()) {
            if (!this.isInRange(entity)) {
                continue;
            }

            if (module.show.is("Items") && entity instanceof ItemEntity itemEntity) {
                float[] anchor = this.projectEntity(entity, delta);
                if (anchor != null) {
                    this.renderItemTag(context, matrices, renderer, font, module, itemEntity, anchor);
                }
                continue;
            }

            if (!(entity instanceof LivingEntity living) || !living.isAlive() || !TagsUtil.isEntityTarget(living, module)) {
                continue;
            }

            float[] anchor = this.projectEntity(living, delta);
            if (anchor != null) {
                this.renderEntityTag(context, matrices, renderer, font, module, living, anchor);
            }
        }
    }

    private boolean isInRange(Entity entity) {
        return this.client.player.squaredDistanceTo(entity) <= MAX_DISTANCE * MAX_DISTANCE;
    }

    private float[] projectEntity(Entity entity, float tickDelta) {
        Vector4d bounds = ProjectionUtil.getVector4D(entity, tickDelta);
        if (bounds == null) {
            return null;
        }

        float centerX = (float) ((bounds.x + bounds.z) / 2.0D);
        float topY = (float) bounds.y;
        float bottomY = (float) bounds.w;
        return new float[] { centerX, topY, bottomY };
    }

    private void renderItemTag(
            DrawContext context,
            MatrixStack matrices,
            RenderUtil renderer,
            FontRenderer font,
            TagsModule module,
            ItemEntity itemEntity,
            float[] anchor
    ) {
        ItemStack stack = itemEntity.getStack();
        Text nameText = module.show.is("Display name")
                ? stack.getName()
                : stack.getItem().getName(stack);
        String plainName = nameText.getString();
        int count = stack.getCount();

        float fontHeight = font.getLineHeight(plainName);
        float centerX = anchor[0];
        float iconSize = RECT_HEIGHT;

        float nameWidth = font.getWidth(plainName);
        boolean showCount = count > 1;
        String countText = "x" + count;
        float countWidth = showCount ? font.getWidth(countText) : 0.0F;

        float contentWidth = PADDING + iconSize + TEXT_GAP + nameWidth;
        if (showCount) {
            contentWidth += TEXT_GAP + countWidth;
        }
        contentWidth += PADDING;

        float startX = centerX - contentWidth / 2.0F;
        float tagY = anchor[1] - RECT_HEIGHT - 3.0F;

        renderer.drawRoundedRect(startX, tagY, contentWidth, RECT_HEIGHT, BACKGROUND, matrices);

        float cursorX = startX + PADDING - 2;
        float textY = tagY + (RECT_HEIGHT - fontHeight) / 2.0F;

        this.drawItemStack(context, matrices, stack, cursorX + 2, tagY + 2F, 0.5F);
        cursorX += iconSize + TEXT_GAP;

        font.draw(plainName, cursorX, textY, new Color(this.resolveTextColor(nameText), true), matrices);
        cursorX += nameWidth;

        if (showCount) {
            cursorX += TEXT_GAP;
            font.draw(countText, cursorX, textY, HP_COLOR, matrices);
        }
    }

    private void renderEntityTag(
            DrawContext context,
            MatrixStack matrices,
            RenderUtil renderer,
            FontRenderer font,
            TagsModule module,
            LivingEntity entity,
            float[] anchor
    ) {
        Text nameComponent = entity.getDisplayName();
        String plainName = Formatting.strip(nameComponent.getString());
        if (plainName == null) {
            plainName = nameComponent.getString();
        }

        float fontHeight = font.getLineHeight(plainName);
        float centerX = anchor[0];

        float nameWidth = font.getWidth(plainName);
        int healthValue = Math.max(0, Math.round(ServerUtil.getDisplayHealth(entity)));
        String hpText = "[" + healthValue + "]";
        float hpWidth = font.getWidth(hpText);

        float contentWidth = PADDING + nameWidth + TEXT_GAP + hpWidth + PADDING;
        float startX = centerX - contentWidth / 2.0F;
        float tagY = anchor[1] - RECT_HEIGHT - 3.0F;

        renderer.drawRoundedRect(startX, tagY, contentWidth, RECT_HEIGHT, BACKGROUND, matrices);

        float cursorX = startX + PADDING;
        float textY = tagY + (RECT_HEIGHT - fontHeight) / 2.0F;

        font.draw(plainName, cursorX, textY, TEXT_COLOR, matrices);
        font.draw(hpText, cursorX + nameWidth + TEXT_GAP, textY, HP_COLOR, matrices);

        if (module.show.is("Armor")) {
            this.drawArmorRow(context, matrices, entity, centerX, tagY, module);
        }

        if (module.show.is("Potions")) {
            this.drawEffects(matrices, entity, centerX, anchor[2] + 2.0F);
        }
    }

    private void drawArmorRow(
            DrawContext context,
            MatrixStack matrices,
            LivingEntity entity,
            float centerX,
            float baseY,
            TagsModule module
    ) {
        List<ItemStack> armor = new ArrayList<>(4);
        entity.getArmorItems().forEach(armor::add);

        ItemStack mainHand = entity.getMainHandStack();
        ItemStack offHand = entity.getOffHandStack();

        List<ItemStack> slots = new ArrayList<>(6);
        if (!offHand.isEmpty()) {
            slots.add(offHand);
        }
        for (int i = 3; i >= 0; i--) {
            if (!armor.get(i).isEmpty()) {
                slots.add(armor.get(i));
            }
        }
        if (!mainHand.isEmpty()) {
            slots.add(mainHand);
        }
        if (slots.isEmpty()) {
            return;
        }

        float y = baseY - 12.0F;
        float totalWidth = slots.size() * ITEM_SLOT_STEP - (ITEM_SLOT_STEP - ITEM_SLOT_SIZE);
        float startX = centerX - totalWidth / 2.0F;
        FontRenderer enchantFont = module.show.is("Enchants") ? FontManager.getMedium(ENCHANT_FONT_SIZE) : null;

        for (int i = 0; i < slots.size(); i++) {
            ItemStack stack = slots.get(i);
            float slotX = startX + i * ITEM_SLOT_STEP;
            float slotCenterX = slotX + ITEM_SLOT_SIZE / 2.0F;

            if (enchantFont != null) {
                float enchantY = y - 3.0F;
                for (String enchantment : this.getEnchantments(stack)) {
                    String plainText = Formatting.strip(enchantment);
                    if (plainText == null) {
                        plainText = enchantment;
                    }
                    float enchantWidth = enchantFont.getWidth(plainText);
                    enchantFont.draw(plainText, slotCenterX - enchantWidth / 2.0F, enchantY, TEXT_COLOR, matrices);
                    enchantY -= ENCHANT_LINE_STEP;
                }
            }

            this.drawItemStack(context, matrices, stack, slotX, y, 0.5F);
        }
    }

    private void drawEffects(MatrixStack matrices, LivingEntity entity, float centerX, float startY) {
        Collection<StatusEffectInstance> activeEffects = entity.getStatusEffects();
        if (activeEffects.isEmpty()) {
            return;
        }

        FontRenderer effectFont = FontManager.getMedium(EFFECT_FONT_SIZE);
        if (effectFont == null) {
            return;
        }

        List<EffectLine> lines = new ArrayList<>(activeEffects.size());
        for (StatusEffectInstance effect : activeEffects) {
            int durationTicks = effect.getDuration();
            if (durationTicks <= 20) {
                continue;
            }

            String name = effect.getEffectType().value().getName().getString();
            int amp = effect.getAmplifier() + 1;
            StringBuilder sb = new StringBuilder(name);
            if (amp > 1) {
                sb.append(' ').append(amp);
            }
            sb.append(' ').append(this.formatDuration(durationTicks));
            String text = sb.toString();
            lines.add(new EffectLine(text, effectFont.getWidth(text), TEXT_COLOR.getRGB()));
        }

        if (lines.size() > 1) {
            lines.sort(Comparator.comparingDouble(line -> line.width));
        }

        float lineStep = effectFont.getLineHeight("A") + 2.0F;
        for (int i = 0; i < lines.size(); i++) {
            EffectLine line = lines.get(i);
            effectFont.draw(line.text, centerX - line.width / 2.0F, startY + i * lineStep, new Color(line.color, true), matrices);
        }
    }

    private List<String> getEnchantments(ItemStack stack) {
        List<String> enchantments = new ArrayList<>();
        ItemEnchantmentsComponent component = EnchantmentHelper.getEnchantments(stack);
        for (RegistryEntry<Enchantment> enchantment : component.getEnchantments()) {
            String enchantName = enchantment.value().description().getString();
            String shortName = enchantName.length() >= 2 ? enchantName.substring(0, 2) : enchantName;
            int level = component.getLevel(enchantment);
            int maxLevel = enchantment.value().getMaxLevel();
            if (maxLevel == 1 && level == 1) {
                enchantments.add(shortName);
            } else {
                enchantments.add(shortName + level);
            }
        }
        return enchantments;
    }

    private void drawItemStack(DrawContext context, MatrixStack matrices, ItemStack stack, float x, float y, float scale) {
        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
        matrices.push();
        matrices.translate(x, y, 0.0F);
        matrices.scale(scale, scale, 1.0F);
        context.drawItem(stack, 0, 0);
        matrices.pop();
        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
    }

    private int resolveTextColor(Text text) {
        Integer color = text.getStyle().getColor() == null ? null : text.getStyle().getColor().getRgb();
        return color != null ? color | 0xFF000000 : TEXT_COLOR.getRGB();
    }

    private String formatDuration(int durationTicks) {
        int seconds = durationTicks / 20;
        int minutes = seconds / 60;
        seconds %= 60;
        if (minutes > 0) {
            return minutes + ":" + String.format("%02d", seconds);
        }
        return seconds + "s";
    }

    private static final class EffectLine {
        private final String text;
        private final float width;
        private final int color;

        private EffectLine(String text, float width, int color) {
            this.text = text;
            this.width = width;
            this.color = color;
        }
    }
}
