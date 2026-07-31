package fun.nexisdlc.ui.gui;

import fun.nexisdlc.ClientContainer;
import fun.nexisdlc.client.events.impl.render.EventRender;
import fun.nexisdlc.client.utils.eventbus.EventHandler;
import fun.nexisdlc.client.utils.render.CursorHelper;
import fun.nexisdlc.client.utils.render.animations.Easings;
import fun.nexisdlc.client.utils.render.animations.impl.SimpleLinearAnimation;
import fun.nexisdlc.client.utils.render.color.ColorUtils;
import fun.nexisdlc.client.utils.render.main.core.Renderer2D;
import fun.nexisdlc.modules.impl.render.ClickGui;
import net.minecraft.client.gui.Click;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.input.KeyInput;
import net.minecraft.text.Text;
import org.lwjgl.glfw.GLFW;

import static fun.nexisdlc.client.utils.client.IMinecraft.mc;

public abstract class BaseClickGui extends Screen {
    protected static BaseClickGui INSTANCE = null;

    protected final SimpleLinearAnimation guiOpenAnimation = new SimpleLinearAnimation(240);
    protected boolean closing = false;
    protected long openStartMs = System.currentTimeMillis();
    protected long closeStartMs = 0L;
    protected double lastMouseX = 0;
    protected double lastMouseY = 0;
    protected boolean rightShiftCloseGuard = false;

    protected BaseClickGui() {
        super(Text.literal("ClickGui"));
        guiOpenAnimation.setEasing(Easings.EASE_OUT_CUBIC);
        guiOpenAnimation.show();
        CursorHelper.init();

        if (mc != null && mc.getWindow() != null) {
            rightShiftCloseGuard = GLFW.glfwGetKey(mc.getWindow().getHandle(), GLFW.GLFW_KEY_RIGHT_SHIFT) == GLFW.GLFW_PRESS;
        }
    }

    @EventHandler
    public static void onGuiRender(EventRender.Screen.Gui event) {
        if (!(mc.currentScreen instanceof BaseClickGui gui)) return;
        gui.render(event.getRenderer(), gui.width, gui.height);
    }

    private void render(Renderer2D r, int vw, int vh) {
        CursorHelper.ensureVisible();

        if (rightShiftCloseGuard && mc.getWindow() != null
                && GLFW.glfwGetKey(mc.getWindow().getHandle(), GLFW.GLFW_KEY_RIGHT_SHIFT) == GLFW.GLFW_RELEASE) {
            rightShiftCloseGuard = false;
        }

        if (closing) {
            guiOpenAnimation.hide();
            if (guiOpenAnimation.isFinished()) {
                mc.setScreen(null);
                return;
            }
        }
        renderGui(r, vw, vh);
    }

    protected abstract void renderGui(Renderer2D r, int vw, int vh);

    @Override
    public void render(DrawContext context, int mouseX, int mouseY, float deltaTicks) {
        this.lastMouseX = mouseX;
        this.lastMouseY = mouseY;
        super.render(context, mouseX, mouseY, deltaTicks);
    }

    @Override
    public void renderBackground(DrawContext context, int mouseX, int mouseY, float deltaTicks) {}

    @Override
    public boolean shouldPause() { return false; }

    @Override
    public void close() { startClosing(); }

    protected void startClosing() {
        if (closing) return;
        closing = true;
        closeStartMs = System.currentTimeMillis();
        guiOpenAnimation.hide();
    }

    @Override
    public boolean keyPressed(KeyInput keyInput) {
        int keyCode = keyInput.key();
        if (keyCode == GLFW.GLFW_KEY_ESCAPE || keyCode == GLFW.GLFW_KEY_RIGHT_SHIFT) {
            if (keyCode == GLFW.GLFW_KEY_RIGHT_SHIFT && rightShiftCloseGuard) return true;
            startClosing();
            return true;
        }
        return super.keyPressed(keyInput);
    }

    @Override
    public boolean mouseClicked(Click click, boolean isRepeated) {
        double scale = mc.getWindow().getScaleFactor();
        double mouseX = click.x() * scale;
        double mouseY = click.y() * scale;
        int button = click.button();
        if (handleMouseClicked(mouseX, mouseY, button)) return true;
        return super.mouseClicked(click, isRepeated);
    }

    protected abstract boolean handleMouseClicked(double mouseX, double mouseY, int button);

    public static void open() {
        if (ClientContainer.isHide()) return;

        String mode = ClickGui.guiMode != null ? ClickGui.guiMode.get() : "DropDown";

        boolean needsNew = false;
        if (INSTANCE == null) {
            needsNew = true;
        } else if ("CS-GUI".equals(mode) && !(INSTANCE instanceof CsGui)) {
            needsNew = true;
        } else if ("DropDown".equals(mode) && !(INSTANCE instanceof DropDownGui)) {
            needsNew = true;
        }

        if (needsNew) {
            if ("CS-GUI".equals(mode)) {
                INSTANCE = new CsGui();
            } else {
                INSTANCE = new DropDownGui();
            }
        } else {
            INSTANCE.resetAnimations();
        }

        mc.setScreen(INSTANCE);
    }

    protected void resetAnimations() {
        closing = false;
        openStartMs = System.currentTimeMillis();
        closeStartMs = 0L;
        guiOpenAnimation.show();

        if (mc != null && mc.getWindow() != null) {
            rightShiftCloseGuard = GLFW.glfwGetKey(mc.getWindow().getHandle(), GLFW.GLFW_KEY_RIGHT_SHIFT) == GLFW.GLFW_PRESS;
        }
    }

    protected int scaledMouseX() {
        return (int) Math.round(lastMouseX * mc.getWindow().getScaleFactor());
    }

    protected int scaledMouseY() {
        return (int) Math.round(lastMouseY * mc.getWindow().getScaleFactor());
    }

    protected static int fadeColor(int color, int alpha) {
        return ColorUtils.multAlpha(color, Math.max(0f, Math.min(1f, alpha / 255f)));
    }

    protected static int fadeColor(int color, float alphaProgress) {
        return ColorUtils.multAlpha(color, Math.max(0f, Math.min(1f, alphaProgress)));
    }
}
