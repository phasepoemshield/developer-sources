/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.gui.Click
 *  net.minecraft.client.gui.DrawContext
 *  net.minecraft.client.gui.screen.Screen
 *  net.minecraft.client.gui.screen.ingame.HandledScreen
 *  net.minecraft.client.gui.screen.narration.NarrationMessageBuilder
 *  net.minecraft.client.gui.widget.ClickableWidget
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.Items
 *  net.minecraft.text.Text
 */
package oxxxde;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.Click;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.gui.screen.narration.NarrationMessageBuilder;
import net.minecraft.client.gui.widget.ClickableWidget;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.text.Text;
import oxxxde.\u0634\u062c;
import oxxxde.\u0635\u0635;

public final class \u062f\u064f
extends ClickableWidget {
    private static final int HEIGHT = 18;
    private static final ItemStack CHEST_ICON = Items.CHEST.getDefaultStack();
    private static final int BACKGROUND_COLOR = -3750202;
    private static final int ITEM_SIZE = 14;
    private static final int HOVERED_BACKGROUND_COLOR = -2697514;
    private static final int EDGE_SHADOW_COLOR = -7631989;
    private static final int WIDTH = 24;
    private static final int BORDER_COLOR = -13158601;
    private static final float ITEM_SCALE = 0.875f;
    private static final int EDGE_HIGHLIGHT_COLOR = -1;
    private static final int INVENTORY_GAP = 2;

    public void onClick(Click event, boolean doubled) {
        Screen screen = MinecraftClient.getInstance().currentScreen;
        if (screen instanceof HandledScreen) {
            HandledScreen screen2 = (HandledScreen)screen;
            screen2.endTouchDrag();
        }
        \u0635\u0635.INSTANCE.setCustomScreen(\u0634\u062c.INSTANCE);
    }

    /*
     * WARNING - void declaration
     */
    protected void renderWidget(DrawContext graphics, int mouseX, int mouseY, float partialTick) {
        int left = this.getX();
        int top = this.getY();
        int right = this.getRight();
        int bottom = this.getBottom();
        int backgroundColor = this.isSelected() ? -2697514 : -3750202;
        graphics.fill(left, top, right, bottom, -13158601);
        graphics.fill(left + 1, top + 1, right - 1, bottom - 1, backgroundColor);
        graphics.fill(left + 1, top + 1, right - 1, top + 2, -1);
        graphics.fill(left + 1, top + 1, left + 2, bottom - 1, -1);
        graphics.fill(right - 2, top + 2, right - 1, bottom - 1, -7631989);
        graphics.fill(left + 2, bottom - 2, right - 1, bottom - 1, -7631989);
        this.renderChestIcon(graphics, left, top);
        if (this.isHovered()) {
            void var3_3;
            void var2_2;
            void var1_1;
            var1_1.drawTooltip(this.getMessage(), (int)var2_2, (int)var3_3);
        }
    }

    public \u062f\u064f() {
        super(0, 0, 24, 18, (Text)Text.literal((String)"\u041c\u0435\u043d\u0435\u0434\u0436\u0435\u0440 \u0438\u043d\u0432\u0435\u043d\u0442\u0430\u0440\u0435\u0439 "));
    }

    protected void appendClickableNarrations(NarrationMessageBuilder output) {
        this.appendDefaultNarrations(output);
    }

    private void renderChestIcon(DrawContext graphics, int left, int top) {
        int iconX = left + 5;
        int iconY = top + 2;
        graphics.getMatrices().pushMatrix();
        graphics.getMatrices().translate((float)iconX, (float)iconY);
        graphics.getMatrices().scale(0.875f, 0.875f);
        graphics.drawItem(CHEST_ICON, 0, 0);
        graphics.getMatrices().popMatrix();
    }

    public void attachToInventory(int inventoryLeft, int inventoryTop, int inventoryWidth) {
        this.setX(inventoryLeft + inventoryWidth - 24);
        this.setY(inventoryTop - 18 - 2);
    }
}

