package fun.nexisdlc.client.events.impl.render;

import fun.nexisdlc.client.events.api.Event;
import fun.nexisdlc.client.utils.render.main.core.Renderer2D;
import fun.nexisdlc.client.utils.render.main.text.FontObject;
import net.minecraft.client.util.math.MatrixStack;

public class EventRender extends Event {

    public static class World extends EventRender {
        private final MatrixStack matrices;
        private final float tickDelta;

        public World(MatrixStack matrices, float tickDelta) {
            this.matrices = matrices;
            this.tickDelta = tickDelta;
        }

        public MatrixStack getMatrices() {
            return matrices;
        }

        public MatrixStack getMatrixStack() {
            return matrices;
        }

        public float getTickDelta() {
            return tickDelta;
        }

        public float getTicks() {
            return tickDelta;
        }
    }

    // Фон неба. Постится на AFTER_SETUP — до энтити/ESP, чтобы не перекрывать их.
    public static class WorldBackground extends EventRender {
        private final float tickDelta;

        public WorldBackground(float tickDelta) {
            this.tickDelta = tickDelta;
        }

        public float getTickDelta() {
            return tickDelta;
        }

        public float getTicks() {
            return tickDelta;
        }
    }

    public static class Screen extends EventRender {
        private Renderer2D renderer;
        private FontObject defaultFont;
        private int viewportWidth;
        private int viewportHeight;

        protected Screen() {
        }

        public Screen set(Renderer2D renderer, FontObject defaultFont, int viewportWidth, int viewportHeight) {
            this.renderer = renderer;
            this.defaultFont = defaultFont;
            this.viewportWidth = viewportWidth;
            this.viewportHeight = viewportHeight;
            return this;
        }

        public Renderer2D getRenderer() {
            return renderer;
        }

        public FontObject getDefaultFont() {
            return defaultFont;
        }

        public int getViewportWidth() {
            return viewportWidth;
        }

        public int getViewportHeight() {
            return viewportHeight;
        }

        public static class UnderHud extends Screen {
            public UnderHud() {
            }
        }

        public static class Hud extends Screen {
            public Hud() {
            }
        }

        public static class Notifications extends Screen {
            public Notifications() {
            }
        }

        public static class Gui extends Screen {
            public Gui() {
            }
        }

        public static class OverGui extends Screen {
            public OverGui() {
            }
        }
    }
}