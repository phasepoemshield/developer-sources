package fun.nexisdlc.ui.hud;

import fun.nexisdlc.Nexis;
import fun.nexisdlc.client.ClientColors;
import fun.nexisdlc.client.events.impl.render.EventRender;
import fun.nexisdlc.client.utils.globals.GlobalsInventoryItem;
import fun.nexisdlc.client.utils.globals.GlobalsManager;
import fun.nexisdlc.client.utils.globals.GlobalsMember;
import fun.nexisdlc.client.utils.globals.GlobalsParty;
import fun.nexisdlc.client.utils.render.drag.DraggingManager;
import fun.nexisdlc.client.utils.render.drag.api.Dragging;
import fun.nexisdlc.client.utils.render.main.core.Renderer2D;
import fun.nexisdlc.client.utils.render.main.text.FontRegistry;
import fun.nexisdlc.modules.impl.render.Interface;
import fun.nexisdlc.ui.hud.api.HudElement;
import lombok.RequiredArgsConstructor;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ChatScreen;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Vec3d;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

@RequiredArgsConstructor
public class GlobalsInventoryHud implements HudElement {
    public static final String SETTINGS_SCOPE = "GlobalsInventoryHud";
    public static final String ELEMENT_NAME = "Инвентарь Globals";
    public static final String SETTING_ALWAYS_SHOW = "alwaysShow";
    public static final String SETTING_SLOT_RECTS = "slotRects";
    public static final String SETTING_SHOW_HOTBAR = "showHotbar";

    private static final int INVENTORY_COLUMNS = 9;
    private static final int INVENTORY_ROWS = 3;
    private static final int HOTBAR_SIZE = 9;

    private static final float ELEMENT_SCALE = 1.25f;
    private static final float SLOT_SIZE = 15.5f * ELEMENT_SCALE;
    private static final float SLOT_GAP = 2.5f * ELEMENT_SCALE;
    private static final float PADDING_X = 8.5f * ELEMENT_SCALE;
    private static final float PADDING_Y = 7.5f * ELEMENT_SCALE;
    private static final float HEADER_HEIGHT = 18f * ELEMENT_SCALE;
    private static final float MEMBER_HEADER_HEIGHT = 14f * ELEMENT_SCALE;
    private static final float TITLE_SIZE = 9.25f * ELEMENT_SCALE;
    private static final float MEMBER_TEXT_SIZE = 8.75f * ELEMENT_SCALE;
    private static final float MEMBER_META_SIZE = 7.75f * ELEMENT_SCALE;
    private static final float HOTBAR_GAP = 4.0f * ELEMENT_SCALE;
    private static final float MEMBER_GAP = 6.0f * ELEMENT_SCALE;

    private final Dragging dragging;

    @Override
    public void render(EventRender.Screen.Hud event) {
        MinecraftClient mc = MinecraftClient.getInstance();
        if (mc.player == null || mc.world == null) {
            resetSize();
            return;
        }

        DrawContext context = Nexis.getInstance().testRender.getDrawContext();
        if (context == null) {
            resetSize();
            return;
        }

        boolean chatOpen = mc.currentScreen instanceof ChatScreen;
        boolean alwaysShow = DraggingManager.getHudBoolean(SETTINGS_SCOPE, SETTING_ALWAYS_SHOW, false);
        if (mc.options.hudHidden && !chatOpen && !alwaysShow) {
            resetSize();
            return;
        }

        List<GlobalsMember> members = members(mc);
        if (members.isEmpty() && !chatOpen && !alwaysShow) {
            resetSize();
            return;
        }

        boolean showSlotRects = DraggingManager.getHudBoolean(SETTINGS_SCOPE, SETTING_SLOT_RECTS, true);
        boolean showHotbar = DraggingManager.getHudBoolean(SETTINGS_SCOPE, SETTING_SHOW_HOTBAR, true);

        float scaleFactor = Interface.getHudScale(SETTINGS_SCOPE);
        float x = Interface.scalePos(SETTINGS_SCOPE, dragging.getX());
        float y = Interface.scalePos(SETTINGS_SCOPE, dragging.getY());

        float gridWidth = INVENTORY_COLUMNS * SLOT_SIZE + (INVENTORY_COLUMNS - 1) * SLOT_GAP;
        float invGridHeight = INVENTORY_ROWS * SLOT_SIZE + (INVENTORY_ROWS - 1) * SLOT_GAP;
        float memberHeight = MEMBER_HEADER_HEIGHT + invGridHeight + (showHotbar ? HOTBAR_GAP + SLOT_SIZE : 0f);
        float totalWidth = gridWidth + PADDING_X * 2f;
        float totalHeight = HEADER_HEIGHT + PADDING_Y * 2f;
        if (!members.isEmpty()) {
            totalHeight += members.size() * memberHeight + Math.max(0, members.size() - 1) * MEMBER_GAP;
        }
        int rounding = Interface.getHudRoundedInt(SETTINGS_SCOPE, 9.5f * ELEMENT_SCALE);

        Renderer2D renderer = event.getRenderer();
        renderer.blur(x, y, totalWidth, totalHeight, rounding, 1f);
        renderer.rect(x, y, totalWidth, totalHeight, rounding, ClientColors.applyAlpha(ClientColors.BACKGROUND.getRGB(), 0.94f));
        renderer.rectOutline(x, y, totalWidth, totalHeight, rounding, ClientColors.applyAlpha(Color.WHITE.getRGB(), 0.12f), 1f);

        float titleY = y + centeredTextY(HEADER_HEIGHT, TITLE_SIZE, FontRegistry.SF_SEMIBOLD) + 5f;
        renderer.text(FontRegistry.SF_SEMIBOLD, x + 10f * ELEMENT_SCALE, titleY, TITLE_SIZE, "Инвентарь Globals", ClientColors.TEXT.getRGB());

        float separatorY = y + HEADER_HEIGHT + 4f;
        renderer.rect(x + 8f * ELEMENT_SCALE, separatorY, totalWidth - 16f * ELEMENT_SCALE, 1f, 0f, ClientColors.applyAlpha(Color.WHITE.getRGB(), 1f));

        float cursorY = y + HEADER_HEIGHT + PADDING_Y;
        for (GlobalsMember member : members) {
            renderMember(renderer, context, mc, member, x + PADDING_X, cursorY, gridWidth, invGridHeight, showHotbar, showSlotRects);
            cursorY += memberHeight + MEMBER_GAP;
        }

        dragging.setWidth(totalWidth * scaleFactor);
        dragging.setHeight(totalHeight * scaleFactor);
    }

    private void renderMember(Renderer2D renderer,
                              DrawContext context,
                              MinecraftClient mc,
                              GlobalsMember member,
                              float startX,
                              float startY,
                              float gridWidth,
                              float invGridHeight,
                              boolean showHotbar,
                              boolean showSlotRects) {
        String name = trim(displayName(member), 22);
        String meta = meta(mc, member);
        float metaWidth = FontRegistry.SF_SEMIBOLD.getWidth(meta, MEMBER_META_SIZE);
        renderer.text(FontRegistry.SF_SEMIBOLD, startX, startY + centeredTextY(MEMBER_HEADER_HEIGHT, MEMBER_TEXT_SIZE, FontRegistry.SF_SEMIBOLD),
                MEMBER_TEXT_SIZE, name, ClientColors.TEXT.getRGB());
        renderer.text(FontRegistry.SF_SEMIBOLD, startX + gridWidth - metaWidth,
                startY + centeredTextY(MEMBER_HEADER_HEIGHT, MEMBER_META_SIZE, FontRegistry.SF_SEMIBOLD),
                MEMBER_META_SIZE, meta, ClientColors.applyAlpha(0xFFB8C0CC, 1f));

        Map<Integer, GlobalsInventoryItem> bySlot = inventoryBySlot(member);
        float gridY = startY + MEMBER_HEADER_HEIGHT;
        renderRowBlock(renderer, context, bySlot, 9, 36, startX, gridY, showSlotRects);

        if (showHotbar) {
            float hotbarY = gridY + invGridHeight + HOTBAR_GAP;
            renderRowBlock(renderer, context, bySlot, 0, HOTBAR_SIZE, startX, hotbarY, showSlotRects);
        }
    }

    private void renderRowBlock(Renderer2D renderer,
                                DrawContext context,
                                Map<Integer, GlobalsInventoryItem> bySlot,
                                int startIndex,
                                int endIndex,
                                float startX,
                                float startY,
                                boolean showSlotRects) {
        int count = Math.max(0, endIndex - startIndex);

        for (int local = 0; local < count; local++) {
            int slot = startIndex + local;
            int column = local % INVENTORY_COLUMNS;
            int row = local / INVENTORY_COLUMNS;

            float slotX = startX + column * (SLOT_SIZE + SLOT_GAP);
            float slotY = startY + row * (SLOT_SIZE + SLOT_GAP);

            if (showSlotRects) {
                renderer.rect(slotX, slotY, SLOT_SIZE, SLOT_SIZE, 4f * ELEMENT_SCALE, new Color(20, 20, 24, 130).getRGB());
                renderer.rectOutline(slotX, slotY, SLOT_SIZE, SLOT_SIZE, 4f * ELEMENT_SCALE, new Color(255, 255, 255, 24).getRGB(), 1f);
            }

            GlobalsInventoryItem item = bySlot.get(slot);
            if (item == null) {
                continue;
            }

            ItemStack stack = stackFor(item);
            if (stack.isEmpty()) {
                continue;
            }

            drawItem(renderer, context, stack, slotX + 1f, slotY + 1f, SLOT_SIZE - 2f);

            renderCooldown(renderer, item, slotX, slotY);
        }
    }

    private void drawItem(Renderer2D renderer, DrawContext context, ItemStack stack, float x, float y, float size) {
        if (stack == null || stack.isEmpty()) {
            return;
        }

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
        if (!Float.isFinite(absX) || !Float.isFinite(absY) || !Float.isFinite(absSize) || absSize <= 0f) {
            return;
        }

        double windowScale = MinecraftClient.getInstance().getWindow().getScaleFactor();
        if (windowScale <= 0.0) {
            return;
        }

        float guiX = (float) (absX / windowScale);
        float guiY = (float) (absY / windowScale);
        float guiScale = (float) (absSize / (16f * windowScale));
        if (!Float.isFinite(guiX) || !Float.isFinite(guiY) || !Float.isFinite(guiScale) || guiScale <= 0f) {
            return;
        }

        renderer.flush();
        var matrices = context.getMatrices();
        matrices.pushMatrix();
        try {
            matrices.translate(guiX, guiY);
            matrices.scale(guiScale, guiScale);
            context.drawItemWithoutEntity(stack, 0, 0);
        } catch (Throwable ignored) {
        } finally {
            matrices.popMatrix();
            renderer.resetPipelineState();
        }
    }

    private void renderCooldown(Renderer2D renderer, GlobalsInventoryItem item, float slotX, float slotY) {
        if (item.cooldownSeconds() <= 0f) {
            return;
        }

        renderer.rect(slotX, slotY, SLOT_SIZE, SLOT_SIZE, 4f * ELEMENT_SCALE,
                ClientColors.applyAlpha(Color.WHITE.getRGB(), 0.55f));

        String text = formatCooldown(item.cooldownSeconds());
        float textSize = 7.0f * ELEMENT_SCALE;
        float textWidth = FontRegistry.SF_SEMIBOLD.getWidth(text, textSize);
        float textX = slotX + (SLOT_SIZE - textWidth) * 0.5f;
        float textY = slotY + centeredTextY(SLOT_SIZE, textSize, FontRegistry.SF_SEMIBOLD) + 15;
        renderer.text(FontRegistry.SF_SEMIBOLD, textX, textY, textSize, text, 0xFFFFFFFF);
    }

    private List<GlobalsMember> members(MinecraftClient mc) {
        GlobalsParty party = GlobalsManager.getInstance().getParty();
        if (party == null || mc.player == null) {
            return List.of();
        }

        String selfName = mc.player.getName().getString();
        List<GlobalsMember> result = new ArrayList<>();
        for (GlobalsMember member : party.members()) {
            if (member == null || !member.online() || member.inventory().isEmpty()) {
                continue;
            }
            String minecraftName = member.minecraftName();
            if (minecraftName != null && minecraftName.equalsIgnoreCase(selfName)) {
                continue;
            }
            result.add(member);
        }
        result.sort(Comparator.comparing(GlobalsInventoryHud::displayName, String.CASE_INSENSITIVE_ORDER));
        return result;
    }

    private Map<Integer, GlobalsInventoryItem> inventoryBySlot(GlobalsMember member) {
        Map<Integer, GlobalsInventoryItem> bySlot = new HashMap<>();
        for (GlobalsInventoryItem item : member.inventory()) {
            if (item != null) {
                bySlot.put(item.slot(), item);
            }
        }
        return bySlot;
    }

    private ItemStack stackFor(GlobalsInventoryItem item) {
        Identifier id = Identifier.tryParse(item.itemId());
        if (id == null) {
            return ItemStack.EMPTY;
        }
        Item itemType = Registries.ITEM.get(id);
        if (itemType == null || itemType == Items.AIR) {
            return ItemStack.EMPTY;
        }
        return new ItemStack(itemType);
    }

    private String meta(MinecraftClient mc, GlobalsMember member) {
        String hp = Math.round(member.health()) + "hp";
        if (mc.player == null || mc.world == null || member.worldKey() == null
                || !member.worldKey().equals(mc.world.getRegistryKey().getValue().toString())) {
            return hp;
        }
        double distance = mc.player.getEntityPos().distanceTo(new Vec3d(member.x(), member.y(), member.z()));
        return hp + " " + Math.round(distance) + "m";
    }

    private static String displayName(GlobalsMember member) {
        if (member == null) return "";
        if (member.username() != null && !member.username().isBlank()) return member.username();
        return member.minecraftName() == null ? "" : member.minecraftName();
    }

    private static String trim(String value, int max) {
        if (value == null) return "";
        if (value.length() <= max) return value;
        return value.substring(0, Math.max(0, max - 1)) + "...";
    }

    private static String formatCooldown(float seconds) {
        if (seconds >= 10f) {
            return String.format(Locale.US, "%.0f", seconds);
        }
        return String.format(Locale.US, "%.1f", seconds);
    }

    private void resetSize() {
        dragging.setWidth(0f);
        dragging.setHeight(0f);
    }

    private static float centeredTextY(float height,
                                       float size,
                                       fun.nexisdlc.client.utils.render.main.text.FontObject font) {
        if (font == null) {
            return height * 0.5f;
        }
        return FontRegistry.centeredBaselineOffset(font, 'H', size) + height * 0.5f;
    }
}
