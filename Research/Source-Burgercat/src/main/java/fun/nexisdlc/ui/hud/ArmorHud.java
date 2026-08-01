package fun.nexisdlc.ui.hud;

import fun.nexisdlc.Nexis;
import fun.nexisdlc.client.events.impl.render.EventRender;
import fun.nexisdlc.client.utils.client.tweaks.crosshair.DrawContextFloatDrawTexture;
import fun.nexisdlc.client.utils.render.drag.api.Dragging;
import fun.nexisdlc.client.utils.render.main.core.Renderer2D;
import fun.nexisdlc.modules.impl.render.Interface;
import fun.nexisdlc.ui.hud.api.HudElement;
import lombok.RequiredArgsConstructor;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ChatScreen;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Arm;
import net.minecraft.util.Identifier;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
public class ArmorHud implements HudElement {
    private static final String CULLING_OWNER = "ArmorHud";
    private static final Identifier HOTBAR_TEXTURE = Identifier.ofVanilla("hud/hotbar");

    private static final float ELEMENT_WIDTH = 82f;
    private static final float ELEMENT_HEIGHT = 22f;
    private static final float CLIP_HALF_WIDTH = 41f;
    private static final float ITEM_SIZE = 32f;
    private static final float ITEM_STEP = 32f;

    public static float width;
    public static float height;

    private final Dragging dragging;

    public void render(EventRender.Screen.Hud event) {
        MinecraftClient mc = MinecraftClient.getInstance();
        if (mc.player == null || mc.world == null) {
            dragging.setWidth(0f);
            dragging.setHeight(0f);
            return;
        }

        if (CustomHotbarHud.shouldUseCustomHotbar()) {
            width = 0f;
            height = 0f;
            dragging.setWidth(0f);
            dragging.setHeight(0f);
            return;
        }

        List<ItemStack> armorItems = getArmorItems();
        if (armorItems.isEmpty()) {
            width = ELEMENT_WIDTH;
            height = ELEMENT_HEIGHT;
            dragging.setWidth(width * Interface.getInterfaceScale());
            dragging.setHeight(height * Interface.getInterfaceScale());
            return;
        }

        DrawContext context = Nexis.getInstance().testRender.getDrawContext();
        if (context == null) {
            dragging.setWidth(0f);
            dragging.setHeight(0f);
            return;
        }

        Renderer2D renderer = event.getRenderer();
        float scale = Math.max(0.01f, Interface.getInterfaceScale());
        float x = Interface.scalePos(dragging.getX());
        float y = Interface.scalePos(dragging.getY());

        if (CustomHotbarHud.shouldUseCustomHotbar()) {
            float viewportWidth = event.getViewportWidth() / scale;
            float viewportHeight = event.getViewportHeight() / scale;
            boolean chatOpen = mc.currentScreen instanceof ChatScreen;
            int handOffset = mc.player.getMainArm() == Arm.RIGHT ? 100 : -182;
            x = viewportWidth * 0.5f + handOffset;
            y = viewportHeight - ELEMENT_HEIGHT - 8f - (chatOpen ? 15f : 0f);
        }

        List<DeferredArmorDraw> deferredDraws = new ArrayList<>();

        float itemX = x + 3f;
        float itemY = y + 3f;
        for (ItemStack stack : armorItems) {
            queueArmorItem(renderer, deferredDraws, stack, itemX, itemY, ITEM_SIZE);
            itemX += ITEM_STEP;
        }

        renderer.flush();
        renderDeferredArmorItems(renderer, deferredDraws);

        width = ELEMENT_WIDTH;
        height = ELEMENT_HEIGHT;
        dragging.setWidth(width * scale);
        dragging.setHeight(height * scale);
    }

    private List<ItemStack> getArmorItems() {
        List<ItemStack> armor = new ArrayList<>(4);
        EquipmentSlot[] slots = {
                EquipmentSlot.HEAD,
                EquipmentSlot.CHEST,
                EquipmentSlot.LEGS,
                EquipmentSlot.FEET
        };

        for (EquipmentSlot slot : slots) {
            ItemStack stack = mc.player.getEquippedStack(slot);
            if (!stack.isEmpty()) {
                armor.add(stack);
            }
        }
        return armor;
    }

    private void queueArmorItem(Renderer2D renderer, List<DeferredArmorDraw> deferredDraws, ItemStack stack, float x, float y, float size) {
        float absX = x;
        float absY = y;
        float absSize = size;

        var transform = renderer.getTransformStack().current();
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

        deferredDraws.add(new DeferredArmorDraw(stack.copy(), absX, absY, absSize));
    }

    private void renderDeferredArmorItems(Renderer2D renderer, List<DeferredArmorDraw> deferredDraws) {
        if (deferredDraws.isEmpty()) {
            return;
        }

        DrawContext context = Nexis.getInstance().testRender.getDrawContext();
        if (context == null) {
            return;
        }

        double scaleFactor = mc.getWindow().getScaleFactor();
        if (scaleFactor <= 0.0) {
            return;
        }

        var matrices = context.getMatrices();
        for (DeferredArmorDraw queued : deferredDraws) {
            float guiX = (float) (queued.absX() / scaleFactor);
            float guiY = (float) (queued.absY() / scaleFactor);
            float guiScale = (float) (queued.absSize() / (16f * scaleFactor));
            if (!Float.isFinite(guiX) || !Float.isFinite(guiY) || !Float.isFinite(guiScale) || guiScale <= 0f) {
                continue;
            }

            matrices.pushMatrix();
            matrices.translate(guiX, guiY);
            matrices.scale(guiScale, guiScale);
            ((DrawContextFloatDrawTexture) context).nexis$drawItem(queued.stack(), 0, 0, true, CULLING_OWNER);
            context.drawStackOverlay(mc.textRenderer, queued.stack(), 0, 0);
            matrices.popMatrix();
        }

        renderer.resetPipelineState();
    }

    private record DeferredArmorDraw(ItemStack stack, float absX, float absY, float absSize) {
    }
}
