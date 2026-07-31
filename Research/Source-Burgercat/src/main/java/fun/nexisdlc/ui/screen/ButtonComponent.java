package fun.nexisdlc.ui.screen;

import fun.nexisdlc.client.utils.render.animations.impl.SimpleLinearAnimation;
import fun.nexisdlc.client.utils.render.main.core.Renderer2D;
import fun.nexisdlc.client.utils.render.main.text.FontObject;
import fun.nexisdlc.client.utils.render.main.text.FontRegistry;

public class ButtonComponent {
    public String text;
    public float x, y, w, h;
    public Runnable onClick;

    public int idleColor = rgba(145, 145, 150, 20);
    public int hoverColor = rgba(145    , 145, 150, 10);
    public int textColor = rgba(255, 255, 255, 255);

    private final SimpleLinearAnimation hoverAnim = new SimpleLinearAnimation(200);

    public ButtonComponent(String text, Runnable onClick) {
        this.text = text;
        this.onClick = onClick;
    }

    public void setBounds(float x, float y, float w, float h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }

    public void setColors(int idle, int hover) {
        this.idleColor = idle;
        this.hoverColor = hover;
    }

    public void render(Renderer2D renderer, FontObject font, float mx, float my) {
        boolean hovered = isHovered(mx, my);

        if (hovered) {
            hoverAnim.show();
        } else {
            hoverAnim.hide();
        }

        float t = hoverAnim.getProgress();

        int finalColor = interpolateColor(idleColor, hoverColor, t);

    //    renderer.blur(x,y,w,h,10,0.8f);
        renderer.rectOutline(x, y, w, h, 10f, finalColor, 1);
        renderer.rect(x, y, w, h, 10f, finalColor);

        float fontSize = h * 0.46f;
        float baseline = y + h * 0.5f;
        baseline += FontRegistry.centeredBaselineOffset(font, 'H', fontSize);
        renderer.centredText(font, x + w / 2f, baseline, fontSize, text, textColor);
    }

    public boolean isHovered(float mx, float my) {
        return mx >= x && mx <= x + w && my >= y && my <= y + h;
    }

    private int interpolateColor(int color1, int color2, float factor) {
        int a1 = (color1 >> 24) & 0xFF;
        int r1 = (color1 >> 16) & 0xFF;
        int g1 = (color1 >> 8) & 0xFF;
        int b1 = color1 & 0xFF;

        int a2 = (color2 >> 24) & 0xFF;
        int r2 = (color2 >> 16) & 0xFF;
        int g2 = (color2 >> 8) & 0xFF;
        int b2 = color2 & 0xFF;

        return rgba(
                lerp(r1, r2, factor),
                lerp(g1, g2, factor),
                lerp(b1, b2, factor),
                lerp(a1, a2, factor)
        );
    }

    public static int rgba(int r, int g, int b, int a) {
        return (a << 24) | (r << 16) | (g << 8) | b;
    }

    private static int lerp(int from, int to, float t) {
        return (int) (from + (to - from) * t);
    }
}