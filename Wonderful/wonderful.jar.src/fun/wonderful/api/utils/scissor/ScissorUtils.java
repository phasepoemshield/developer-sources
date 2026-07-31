package fun.wonderful.api.utils.scissor;

import com.google.common.collect.Lists;
import java.awt.Rectangle;
import java.util.List;
import net.minecraft.client.util.Window;
import net.minecraft.client.MinecraftClient;
import org.lwjgl.opengl.GL30;

public class ScissorUtils {
    private static State state = new State();
    private static final List<State> stateStack = Lists.newArrayList();
    private static float guiScale = 1.0f;
    private static float guiCenterX = 0.0f;
    private static float guiCenterY = 0.0f;

    public static void setGlobalScale(float scale, float centerX, float centerY) {
        guiScale = scale;
        guiCenterX = centerX;
        guiCenterY = centerY;
    }

    public static void resetGlobalScale() {
        guiScale = 1.0f;
        guiCenterX = 0.0f;
        guiCenterY = 0.0f;
    }

    public static void push() {
        stateStack.add(state.clone());
    }

    public static void pop() {
        if (stateStack.isEmpty()) {
            return;
        }
        state = stateStack.remove(stateStack.size() - 1);
        if (ScissorUtils.state.enabled) {
            GL30.glEnable((int)3089);
            GL30.glScissor((int)ScissorUtils.state.x, (int)ScissorUtils.state.y, (int)ScissorUtils.state.width, (int)ScissorUtils.state.height);
        } else {
            GL30.glDisable((int)3089);
        }
    }

    public static void unset() {
        GL30.glDisable((int)3089);
        ScissorUtils.state.enabled = false;
    }

    private static Window getWindow() {
        MinecraftClient client = MinecraftClient.getInstance();
        return client == null ? null : client.getWindow();
    }

    private static double getScaleFactor() {
        Window window = ScissorUtils.getWindow();
        return window == null ? 1.0 : window.getScaleFactor();
    }

    public static void setFromComponentCoordinates(int x2, int y2, int width, int height) {
        Window window = ScissorUtils.getWindow();
        if (window == null) {
            return;
        }
        double scaleFactor = ScissorUtils.getScaleFactor();
        double tx = ((float)x2 - guiCenterX) * guiScale + guiCenterX;
        double ty = ((float)y2 - guiCenterY) * guiScale + guiCenterY;
        double tw = (float)width * guiScale;
        double th = (float)height * guiScale;
        int leftPx = (int)Math.floor(tx * scaleFactor);
        int topPx = (int)Math.floor(ty * scaleFactor);
        int rightPx = (int)Math.ceil((tx + tw) * scaleFactor);
        int bottomPx = (int)Math.ceil((ty + th) * scaleFactor);
        int screenX = leftPx;
        int screenWidth = rightPx - leftPx;
        int screenHeight = bottomPx - topPx;
        int screenY = window.getHeight() - bottomPx;
        ScissorUtils.set(screenX, screenY, screenWidth, screenHeight);
    }

    public static void setFromComponentCoordinates(double x2, double y2, double width, double height) {
        Window window = ScissorUtils.getWindow();
        if (window == null) {
            return;
        }
        double scaleFactor = ScissorUtils.getScaleFactor();
        double tx = (x2 - (double)guiCenterX) * (double)guiScale + (double)guiCenterX;
        double ty = (y2 - (double)guiCenterY) * (double)guiScale + (double)guiCenterY;
        double tw = width * (double)guiScale;
        double th = height * (double)guiScale;
        int leftPx = (int)Math.floor(tx * scaleFactor);
        int topPx = (int)Math.floor(ty * scaleFactor);
        int rightPx = (int)Math.ceil((tx + tw) * scaleFactor);
        int bottomPx = (int)Math.ceil((ty + th) * scaleFactor);
        int screenX = leftPx;
        int screenWidth = rightPx - leftPx;
        int screenHeight = bottomPx - topPx;
        int screenY = window.getHeight() - bottomPx;
        ScissorUtils.set(screenX, screenY, screenWidth, screenHeight);
    }

    public static void setFromComponentCoordinates(double x2, double y2, double width, double height, float scale) {
        Window window = ScissorUtils.getWindow();
        if (window == null) {
            return;
        }
        double scaleFactor = ScissorUtils.getScaleFactor();
        float animationValue = scale;
        float halfAnimationValueRest = (1.0f - animationValue) / 2.0f;
        double testX = x2 + width * (double)halfAnimationValueRest;
        double testY = y2 + height * (double)halfAnimationValueRest;
        double testW = width * (double)animationValue;
        double testH = height * (double)animationValue;
        testX = testX * (double)animationValue + ((double)window.getScaledWidth() - testW) * (double)halfAnimationValueRest;
        int leftPx = (int)Math.floor(testX * scaleFactor);
        int topPx = (int)Math.floor(testY * scaleFactor);
        int rightPx = (int)Math.ceil((testX + testW) * scaleFactor);
        int bottomPx = (int)Math.ceil((testY + testH) * scaleFactor);
        int screenX = leftPx;
        int screenWidth = rightPx - leftPx;
        int screenHeight = bottomPx - topPx;
        int screenY = window.getHeight() - bottomPx;
        ScissorUtils.set(screenX, screenY, screenWidth, screenHeight);
    }

    public static void set(int x2, int y2, int width, int height) {
        Window window = ScissorUtils.getWindow();
        if (window == null) {
            return;
        }
        Rectangle screen = new Rectangle(0, 0, window.getWidth(), window.getHeight());
        Rectangle current = ScissorUtils.state.enabled ? new Rectangle(ScissorUtils.state.x, ScissorUtils.state.y, ScissorUtils.state.width, ScissorUtils.state.height) : screen;
        Rectangle target = new Rectangle(x2 + ScissorUtils.state.transX, y2 + ScissorUtils.state.transY, width, height);
        Rectangle result = current.intersection(target);
        result = result.intersection(screen);
        if (result.width < 0) {
            result.width = 0;
        }
        if (result.height < 0) {
            result.height = 0;
        }
        ScissorUtils.state.enabled = true;
        ScissorUtils.state.x = result.x;
        ScissorUtils.state.y = result.y;
        ScissorUtils.state.width = result.width;
        ScissorUtils.state.height = result.height;
        GL30.glEnable((int)3089);
        GL30.glScissor((int)result.x, (int)result.y, (int)result.width, (int)result.height);
    }

    public static void translate(int x2, int y2) {
        ScissorUtils.state.transX = x2;
        ScissorUtils.state.transY = y2;
    }

    public static void translateFromComponentCoordinates(int x2, int y2) {
        Window window = ScissorUtils.getWindow();
        if (window == null) {
            return;
        }
        int totalHeight = window.getScaledHeight();
        double scaleFactor = ScissorUtils.getScaleFactor();
        int screenX = (int)((double)x2 * scaleFactor);
        int screenY = (int)((double)y2 * scaleFactor);
        screenY = (int)((double)totalHeight * scaleFactor) - screenY;
        ScissorUtils.translate(screenX, screenY);
    }

    private static class State
    implements Cloneable {
        public boolean enabled;
        public int transX;
        public int transY;
        public int x;
        public int y;
        public int width;
        public int height;

        private State() {
        }

        public State clone() {
            try {
                return (State)super.clone();
            }
            catch (CloneNotSupportedException e2) {
                throw new AssertionError((Object)e2);
            }
        }
    }
}