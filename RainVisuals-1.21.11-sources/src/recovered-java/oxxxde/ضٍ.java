/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.font.TextRenderer
 *  net.minecraft.client.gl.RenderPipelines
 *  net.minecraft.client.gui.DrawContext
 *  net.minecraft.client.gui.tooltip.TooltipComponent
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.Identifier
 */
package oxxxde;

import java.util.List;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gl.RenderPipelines;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.tooltip.TooltipComponent;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import oxxxde.\u062f\u0624;

public final class \u0636\u064d
implements TooltipComponent {
    private static final int SLOT_SIZE = 18;
    private static final int WIDTH = 162;
    private final List<ItemStack> items;
    private static final Identifier SLOT_SPRITE = Identifier.ofVanilla((String)"container/slot");
    private static final int ROWS = 3;
    private static final int COLUMNS = 9;
    private static final int HEIGHT = 54;

    public int getHeight(TextRenderer font) {
        return 54;
    }

    public int getWidth(TextRenderer font) {
        return 162;
    }

    public \u0636\u064d(\u062f\u0624 component) {
        this.items = component.items();
    }

    /*
     * WARNING - void declaration
     */
    public void drawItems(TextRenderer font, int x, int y, int tooltipWidth, int tooltipHeight, DrawContext graphics) {
        int startX = x + Math.max(0, (tooltipWidth - 162) / 2);
        int slot = 0;
        while (slot < 27) {
            void var8_8;
            ItemStack stack;
            int slotX = startX + slot % 9 * 18;
            int slotY = y + slot / 9 * 18;
            graphics.drawGuiTexture(RenderPipelines.GUI_TEXTURED, SLOT_SPRITE, slotX, slotY, 18, 18);
            if (slot < this.items.size() && !(stack = this.items.get(slot)).isEmpty()) {
                void var10_10;
                graphics.drawItem(stack, slotX + 1, slotY + 1);
                graphics.drawStackOverlay(font, stack, slotX + 1, (int)(var10_10 + true));
            }
            ++var8_8;
        }
    }
}

