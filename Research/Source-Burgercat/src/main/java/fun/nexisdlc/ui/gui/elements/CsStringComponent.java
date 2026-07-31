package fun.nexisdlc.ui.gui.elements;

import fun.nexisdlc.client.ClientColors;
import fun.nexisdlc.client.utils.render.animations.impl.SimpleLinearAnimation;
import fun.nexisdlc.client.utils.render.main.core.Renderer2D;
import fun.nexisdlc.modules.api.settings.impl.StringSetting;
import net.minecraft.client.MinecraftClient;
import org.lwjgl.glfw.GLFW;

public final class CsStringComponent extends CsSettingComponent<StringSetting> {
    public static CsStringComponent focusedStringComp = null;
    private final TextInputField input;
    private final SimpleLinearAnimation focusAnim = new SimpleLinearAnimation(150);

    CsStringComponent(StringSetting setting, float width) {
        super(setting, width, 41f);
        TextInputField field = new TextInputField()
                .setFontSize(11.5f)
                .setPadding(9f, 0f)
                .setMaxLength(256)
                .setText(setting.get());
        field.setOnChange(() -> setting.set(field.getText()));
        if (setting.isOnlyNumber()) {
            field.setCharFilter(c -> Character.isDigit(c) || c == '.' || c == '-');
        }
        this.input = field;
    }

    @Override
    public void draw(Renderer2D render, float x, float y, int mouseX, int mouseY, int alpha) {
        if (!input.getText().equals(setting.get()) && !input.isFocused()) {
            input.setText(setting.get());
        }
        float rowX = x + ROW_PAD_X;
        float rowW = width - ROW_PAD_X * 2f;
        drawAnimatedSettingText(render, rowX, y + 11f, rowW, 13f,
                setting.getName(), withAlpha(COLOR_NAME, alpha));
        float inputH = 20f;
        float inputX = rowX;
        float inputY = y + height - inputH;
        float inputW = rowW;
        if (input.isFocused()) focusAnim.show(); else focusAnim.hide();
        float fp = focusAnim.getProgress();
        int bgUnfocused = withAlpha(0xFFFFFF, (int) (alpha * 0.08f));
        int bgFocused = scaleAlpha(ClientColors.ICON.getRGB(), (int) (alpha * 0.16f));
        int borderUnfocused = withAlpha(0xFFFFFF, (int) (alpha * 0.14f));
        int borderFocused = scaleAlpha(ClientColors.ICON.getRGB(), (int) (alpha * 0.55f));
        int inputBg = blend(bgUnfocused, bgFocused, fp);
        int inputBorder = blend(borderUnfocused, borderFocused, fp);
        render.rect(inputX, inputY, inputW, inputH, 5.5f, inputBg);
        input.render(render, inputX, inputY, inputW, inputH, alpha / 255f);
    }

    @Override
    public void mouseClicked(double mx, double my, int button, float x, float y) {
        float rowX = x + ROW_PAD_X;
        float rowW = width - ROW_PAD_X * 2f;
        float inputH = 20f;
        float inputX = rowX;
        float inputY = y + height - inputH;
        float inputW = rowW;
        input.mouseClicked(mx, my, button, inputX, inputY, inputW, inputH);
        if (input.isFocused()) focusedStringComp = this;
        else if (focusedStringComp == this) focusedStringComp = null;
    }

    @Override
    public void keyPressed(int key) {
        if (key == GLFW.GLFW_KEY_ENTER || key == GLFW.GLFW_KEY_KP_ENTER || key == GLFW.GLFW_KEY_ESCAPE) {
            input.blur();
            if (focusedStringComp == this) focusedStringComp = null;
            return;
        }
        input.keyPressed(key, currentModifiers());
        if (!input.isFocused() && focusedStringComp == this) focusedStringComp = null;
    }

    @Override
    public void charTyped(char c) {
        input.charTyped(c);
    }

    private static int currentModifiers() {
        long handle = MinecraftClient.getInstance().getWindow().getHandle();
        int m = 0;
        if (GLFW.glfwGetKey(handle, GLFW.GLFW_KEY_LEFT_CONTROL) == GLFW.GLFW_PRESS
                || GLFW.glfwGetKey(handle, GLFW.GLFW_KEY_RIGHT_CONTROL) == GLFW.GLFW_PRESS) m |= GLFW.GLFW_MOD_CONTROL;
        if (GLFW.glfwGetKey(handle, GLFW.GLFW_KEY_LEFT_SHIFT) == GLFW.GLFW_PRESS
                || GLFW.glfwGetKey(handle, GLFW.GLFW_KEY_RIGHT_SHIFT) == GLFW.GLFW_PRESS) m |= GLFW.GLFW_MOD_SHIFT;
        if (GLFW.glfwGetKey(handle, GLFW.GLFW_KEY_LEFT_ALT) == GLFW.GLFW_PRESS
                || GLFW.glfwGetKey(handle, GLFW.GLFW_KEY_RIGHT_ALT) == GLFW.GLFW_PRESS) m |= GLFW.GLFW_MOD_ALT;
        return m;
    }
}
