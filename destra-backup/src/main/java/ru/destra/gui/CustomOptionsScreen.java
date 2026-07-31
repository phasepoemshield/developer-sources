package ru.destra.gui;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.Element;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.option.AccessibilityOptionsScreen;
import net.minecraft.client.gui.screen.option.ChatOptionsScreen;
import net.minecraft.client.gui.screen.option.ControlsOptionsScreen;
import net.minecraft.client.gui.screen.option.LanguageOptionsScreen;
import net.minecraft.client.gui.screen.option.SkinOptionsScreen;
import net.minecraft.client.gui.screen.option.SoundOptionsScreen;
import net.minecraft.client.gui.screen.option.VideoOptionsScreen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.client.gui.widget.ClickableWidget;
import net.minecraft.client.option.GameOptions;
import net.minecraft.client.option.SimpleOption;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

public class CustomOptionsScreen extends Screen {
    private static final Text TITLE = Text.translatable("options.title").copy().formatted(Formatting.BOLD);
    private final Screen parent;
    private final GameOptions gameOptions;
    private final List<ClickableWidget> optionButtons = new ArrayList<>();

    public CustomOptionsScreen(Screen parent, GameOptions gameOptions) {
        super(TITLE);
        this.parent = parent;
        this.gameOptions = gameOptions;
    }

    @Override
    protected void init() {
        this.optionButtons.clear();

        SimpleOption<Integer> fov = this.gameOptions.getFov();
        ClickableWidget fovSlider = fov.createWidget(this.gameOptions, 0, 0, 200);
        this.addDrawableChild(fovSlider);

        addOption(Text.translatable("options.accessibility"), btn ->
            this.client.setScreen(new AccessibilityOptionsScreen(this, this.gameOptions)));
        addOption(Text.translatable("options.skinCustomisation"), btn ->
            this.client.setScreen(new SkinOptionsScreen(this, this.gameOptions)));
        addOption(Text.translatable("options.sounds"), btn ->
            this.client.setScreen(new SoundOptionsScreen(this, this.gameOptions)));
        addOption(Text.translatable("options.video"), btn ->
            this.client.setScreen(new VideoOptionsScreen(this, this.client, this.gameOptions)));
        addOption(Text.translatable("options.controls"), btn ->
            this.client.setScreen(new ControlsOptionsScreen(this, this.gameOptions)));
        addOption(Text.translatable("options.language"), btn ->
            this.client.setScreen(new LanguageOptionsScreen(this, this.gameOptions, this.client.getLanguageManager())));
        addOption(Text.translatable("options.chat"), btn ->
            this.client.setScreen(new ChatOptionsScreen(this, this.gameOptions)));

        this.addDrawableChild(ButtonWidget.builder(Text.translatable("gui.done"), btn -> this.close())
            .dimensions(0, 0, 200, 20).build());

        this.refreshLayout();
    }

    @Override
    public void close() {
        if (this.client != null) {
            this.client.setScreen(this.parent);
        }
    }

    private void addOption(Text text, ButtonWidget.PressAction action) {
        ClickableWidget btn = ButtonWidget.builder(text, action)
            .dimensions(0, 0, 200, 20).build();
        this.optionButtons.add(btn);
        this.addDrawableChild(btn);
    }

    private void refreshLayout() {
        int centerX = this.width / 2;
        int leftCol = centerX - 204;
        int rightCol = centerX + 4;
        int startY = 40;

        if (!this.optionButtons.isEmpty()) {
            this.optionButtons.get(0).setDimensionsAndPosition(200, 20, leftCol, startY);
        }

        for (int i = 1; i < this.optionButtons.size(); i++) {
            boolean isRight = i % 2 == 0;
            int x = isRight ? rightCol : leftCol;
            int y = startY + ((i - 1) / 2) * 24;
            this.optionButtons.get(i).setDimensionsAndPosition(200, 20, x, y);
        }

        for (Element e : this.children()) {
            if (e instanceof ClickableWidget child && 
                child.getMessage().getString().contains(Text.translatable("gui.done").getString())) {
                child.setDimensionsAndPosition(200, 20, centerX - 100, this.height - 30);
                break;
            }
        }
    }

    @Override
    public void render(DrawContext context, int mouseX, int mouseY, float delta) {
        this.renderBackground(context, mouseX, mouseY, delta);
        super.render(context, mouseX, mouseY, delta);
        context.drawCenteredTextWithShadow(this.textRenderer, this.title, this.width / 2, 15, 0xFFFFFF);
    }
}
