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
import net.minecraft.screen.GenericContainerScreenHandler;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.Text;
import oxxxde.\u0628\u0645;

public final class \u0636\u0644
extends ClickableWidget {
    private static final int DOT_COLOR = -921103;
    private static final int ACTIVE_DOT_COLOR = -38037;
    private static final int RIGHT_MARGIN = 4;
    private static final int HEIGHT = 9;
    private static final int EDGE_SHADOW_COLOR = -7631989;
    private static final int ACTIVE_HOVERED_BACKGROUND_COLOR = -3618616;
    private static final int ACTIVE_EDGE_HIGHLIGHT_COLOR = -1447447;
    private static final int TOP_MARGIN = 4;
    private static final int ACTIVE_BACKGROUND_COLOR = -4671304;
    private static final int WIDTH = 9;
    private static final int BACKGROUND_COLOR = -3750202;
    private static final int ACTIVE_EDGE_SHADOW_COLOR = -8947849;
    private long lastFrameNanos = System.nanoTime();
    private static final int BORDER_COLOR = -13158601;
    private static final int HOVERED_BACKGROUND_COLOR = -2697514;
    private float activeProgress;
    private static final int EDGE_HIGHLIGHT_COLOR = -1;

    public \u0636\u0644() {
        super(0, 0, 9, 9, (Text)Text.literal((String)"\u041d\u0430\u0439\u0442\u0438 \u0430\u043d\u0430\u0440\u0445\u0438\u044e \u0441 \u043c\u0438\u043d\u0438\u043c\u0430\u043b\u044c\u043d\u044b\u043c \u043e\u043d\u043b\u0430\u0439\u043d\u043e\u043c"));
    }

    private void renderDot(DrawContext graphics, int left, int top) {
        int centerX = left + 4;
        int centerY = top + 4;
        int color = this.interpolate(-921103, -38037, this.activeProgress);
        graphics.fill(centerX - 1, centerY - 1, centerX + 2, centerY + 2, color);
    }

    /*
     * WARNING - void declaration
     */
    protected void renderWidget(DrawContext graphics, int mouseX, int mouseY, float partialTick) {
        this.updateAnimation();
        this.setMessage((Text)Text.literal((String)\u0628\u0645.INSTANCE.getStatusText()));
        int left = this.getX();
        int top = this.getY();
        int right = this.getRight();
        int bottom = this.getBottom();
        int idleBackground = this.isSelected() ? -2697514 : -3750202;
        int activeBackground = this.isSelected() ? -3618616 : -4671304;
        int backgroundColor = this.interpolate(idleBackground, activeBackground, this.activeProgress);
        int highlightColor = this.interpolate(-1, -1447447, this.activeProgress);
        int shadowColor = this.interpolate(-7631989, -8947849, this.activeProgress);
        graphics.fill(left, top, right, bottom, -13158601);
        graphics.fill(left + 1, top + 1, right - 1, bottom - 1, backgroundColor);
        graphics.fill(left + 1, top + 1, right - 1, top + 2, highlightColor);
        graphics.fill(left + 1, top + 1, left + 2, bottom - 1, highlightColor);
        graphics.fill(right - 2, top + 2, right - 1, bottom - 1, shadowColor);
        graphics.fill(left + 2, bottom - 2, right - 1, bottom - 1, shadowColor);
        this.renderDot(graphics, left, top);
        if (this.isHovered()) {
            void var3_3;
            void var2_2;
            void var1_1;
            var1_1.drawTooltip(this.getMessage(), (int)var2_2, (int)var3_3);
        }
    }

    private int channel(int color, int shift) {
        return color >> shift & 0xFF;
    }

    private void updateAnimation() {
        long now = System.nanoTime();
        float elapsedSeconds = Math.min((float)(now - this.lastFrameNanos) / 1.0E9f, 0.1f);
        this.lastFrameNanos = now;
        float target = \u0628\u0645.INSTANCE.isRunning() ? 1.0f : 0.0f;
        float blend = 1.0f - (float)Math.exp(-elapsedSeconds * 9.0f);
        this.activeProgress += (target - this.activeProgress) * blend;
        if (Math.abs(target - this.activeProgress) < 0.002f) {
            this.activeProgress = target;
        }
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

    protected void appendClickableNarrations(NarrationMessageBuilder output) {
        this.appendDefaultNarrations(output);
    }

    public void attachToContainer(int containerLeft, int containerTop, int containerWidth) {
        this.setX(containerLeft + containerWidth - 9 - 4);
        this.setY(containerTop + 4);
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
        \u0628\u0645.INSTANCE.toggle(menu, screen2.getTitle());
        this.setFocused(false);
    }
}

