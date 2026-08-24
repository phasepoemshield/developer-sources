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
 *  net.minecraft.screen.GenericContainerScreenHandler
 *  net.minecraft.screen.ScreenHandler
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
import net.minecraft.screen.GenericContainerScreenHandler;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.Text;
import oxxxde.\u062b\u062b;

public final class \u062b\u0639
extends ClickableWidget {
    private static final int HOVERED_BACKGROUND_COLOR = -2697514;
    private static final ItemStack HOPPER_ICON = Items.HOPPER.getDefaultStack();
    private static final int WIDTH = 24;
    private static final int SORTING_EDGE_SHADOW_COLOR = -5738641;
    private static final int CONTAINER_GAP = 2;
    private long lastFrameNanos = System.nanoTime();
    private static final int SORTING_BACKGROUND_COLOR = -2647141;
    private static final int EDGE_SHADOW_COLOR = -7631989;
    private static final int SORTING_EDGE_HIGHLIGHT_COLOR = -11566;
    private static final int ITEM_SIZE = 14;
    private static final float ITEM_SCALE = 0.875f;
    private static final int BORDER_COLOR = -13158601;
    private static final int BACKGROUND_COLOR = -3750202;
    private static final int HEIGHT = 18;
    private static final int EDGE_HIGHLIGHT_COLOR = -1;
    private float sortingProgress;
    private static final int SORTING_HOVERED_BACKGROUND_COLOR = -1856854;

    private int channel(int color, int shift) {
        return color >> shift & 0xFF;
    }

    public \u062b\u0639() {
        super(0, 0, 24, 18, (Text)Text.literal((String)"\u0421\u043e\u0440\u0442\u0438\u0440\u043e\u0432\u043a\u0430 \u0441\u0443\u043d\u0434\u0443\u043a\u0430"));
    }

    private void updateAnimation() {
        long now = System.nanoTime();
        float elapsedSeconds = Math.min((float)(now - this.lastFrameNanos) / 1.0E9f, 0.1f);
        this.lastFrameNanos = now;
        float target = \u062b\u062b.INSTANCE.isSorting() ? 1.0f : 0.0f;
        float blend = 1.0f - (float)Math.exp(-elapsedSeconds * 9.0f);
        this.sortingProgress += (target - this.sortingProgress) * blend;
        if (Math.abs(target - this.sortingProgress) < 0.002f) {
            this.sortingProgress = target;
        }
    }

    /*
     * WARNING - void declaration
     */
    protected void renderWidget(DrawContext graphics, int mouseX, int mouseY, float partialTick) {
        this.updateAnimation();
        this.updateMessage();
        int left = this.getX();
        int top = this.getY();
        int right = this.getRight();
        int bottom = this.getBottom();
        int idleBackground = this.isSelected() ? -2697514 : -3750202;
        int sortingBackground = this.isSelected() ? -1856854 : -2647141;
        int backgroundColor = this.interpolate(idleBackground, sortingBackground, this.sortingProgress);
        int highlightColor = this.interpolate(-1, -11566, this.sortingProgress);
        int shadowColor = this.interpolate(-7631989, -5738641, this.sortingProgress);
        graphics.fill(left, top, right, bottom, -13158601);
        graphics.fill(left + 1, top + 1, right - 1, bottom - 1, backgroundColor);
        graphics.fill(left + 1, top + 1, right - 1, top + 2, highlightColor);
        graphics.fill(left + 1, top + 1, left + 2, bottom - 1, highlightColor);
        graphics.fill(right - 2, top + 2, right - 1, bottom - 1, shadowColor);
        graphics.fill(left + 2, bottom - 2, right - 1, bottom - 1, shadowColor);
        this.renderHopperIcon(graphics, left, top);
        if (this.isHovered()) {
            void var3_3;
            void var2_2;
            void var1_1;
            var1_1.drawTooltip(this.getMessage(), (int)var2_2, (int)var3_3);
        }
    }

    private void renderHopperIcon(DrawContext graphics, int left, int top) {
        int iconX = left + 5;
        int iconY = top + 2;
        graphics.getMatrices().pushMatrix();
        graphics.getMatrices().translate((float)iconX, (float)iconY);
        graphics.getMatrices().scale(0.875f, 0.875f);
        graphics.drawItem(HOPPER_ICON, 0, 0);
        graphics.getMatrices().popMatrix();
    }

    /*
     * WARNING - void declaration
     */
    private int interpolate(int from, int to, float progress) {
        void var7_7;
        int alpha = this.channel(from, 24) + Math.round((float)(this.channel(to, 24) - this.channel(from, 24)) * progress);
        int red = this.channel(from, 16) + Math.round((float)(this.channel(to, 16) - this.channel(from, 16)) * progress);
        int green = this.channel(from, 8) + Math.round((float)(this.channel(to, 8) - this.channel(from, 8)) * progress);
        int blue = this.channel(from, 0) + Math.round((float)(this.channel(to, 0) - this.channel(from, 0)) * progress);
        return alpha << 24 | red << 16 | green << 8 | var7_7;
    }

    public void attachToContainer(int containerLeft, int containerTop, int containerWidth) {
        this.setX(containerLeft + containerWidth - 24);
        this.setY(containerTop - 18 - 2);
    }

    public void onClick(Click event, boolean doubled) {
        Screen screen = MinecraftClient.getInstance().currentScreen;
        if (!(screen instanceof HandledScreen)) {
            return;
        }
        HandledScreen screen2 = (HandledScreen)screen;
        ScreenHandler screenHandler = screen2.getScreenHandler();
        if (!(screenHandler instanceof GenericContainerScreenHandler)) {
            return;
        }
        GenericContainerScreenHandler menu = (GenericContainerScreenHandler)screenHandler;
        screen2.endTouchDrag();
        \u062b\u062b.INSTANCE.toggle(menu);
        this.setFocused(false);
    }

    private void updateMessage() {
        if (\u062b\u062b.INSTANCE.isStopping()) {
            this.setMessage((Text)Text.literal((String)"\u0417\u0430\u0432\u0435\u0440\u0448\u0430\u044e \u0441\u043e\u0440\u0442\u0438\u0440\u043e\u0432\u043a\u0443..."));
        } else if (\u062b\u062b.INSTANCE.isSorting()) {
            this.setMessage((Text)Text.literal((String)"\u0421\u043e\u0440\u0442\u0438\u0440\u043e\u0432\u043a\u0430 \u0441\u0443\u043d\u0434\u0443\u043a\u0430... \u041d\u0430\u0436\u043c\u0438\u0442\u0435, \u0447\u0442\u043e\u0431\u044b \u043e\u0441\u0442\u0430\u043d\u043e\u0432\u0438\u0442\u044c"));
        } else {
            this.setMessage((Text)Text.literal((String)"\u0421\u043e\u0440\u0442\u0438\u0440\u043e\u0432\u043a\u0430 \u0441\u0443\u043d\u0434\u0443\u043a\u0430"));
        }
    }

    protected void appendClickableNarrations(NarrationMessageBuilder output) {
        this.appendDefaultNarrations(output);
    }
}

