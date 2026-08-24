package pulse.gui.core;

import java.awt.Color;
import org.joml.Matrix3x2fStack;
import pulse.render.Renderer2D;
import pulse.theme.Theme;

public class PanelFadeOverlay implements ClickGuiOverlay {
    private static final int c = 50;
    private static final float d = 5.0F;
    private static final float e = 25.0F;
    private int f = 50;
    private float g = 5.0F;
    private float h = 25.0F;
    private Color i = Theme.f;
    private boolean j = false;
    private float k;
    private float l;
    private float m;
    private float n;
    public static int keyCodec;
    public static boolean elementCodec;

    public PanelFadeOverlay() {
    }

    public PanelFadeOverlay(int i, float f, float f2) {
        this.f = i;
        this.g = f;
        this.h = f2;
    }

    public PanelFadeOverlay(int i, float f, float f2, Color color) {
        this.f = i;
        this.g = f;
        this.h = f2;
        this.i = color;
    }

    public void a(int i) {
        this.f = i;
    }

    public void a(float f) {
        this.g = f;
    }

    public void b(float f) {
        this.h = f;
    }

    public void a(Color color) {
        this.i = color;
    }

    public void a(float f, float f2, float f3, float f4) {
        this.j = true;
        this.k = f;
        this.l = f2;
        this.m = f3;
        this.n = f4;
    }

    public void a() {
        this.j = false;
    }

    @Override
    public void a(Matrix3x2fStack MatrixStackVar, Renderer2D renderer2D, float f, float f2, int i, int i2) {
    }

    public void a(Matrix3x2fStack MatrixStackVar, Renderer2D renderer2D, float f, float f2, float f3, float f4, float f5) {
        float x = f;
        float y = f2;
        float w = f3;
        float h = f4;
        int alpha = (int)Math.max(0.0F, Math.min(255.0F, 255.0F * f5));
        float fadeH = Math.min(this.g * 2.0F, h * 0.2F);
        if (!(fadeH <= 0.0F) && alpha > 0) {
            Color solid = Theme.a(this.i, alpha);
            Color transparent = Theme.a(this.i, 0);
            renderer2D.a(x, y, w, fadeH, 0.0F, solid, solid, transparent, transparent, MatrixStackVar);
            renderer2D.a(x, y + h - fadeH, w, fadeH, 0.0F, transparent, transparent, solid, solid, MatrixStackVar);
        }
    }

    @Override
    public void a(float f, float f2, int i, int i2) {
    }

    public static String b(String str, String str2, int i, int i2, int i3, int i4) {
        return null;
    }
}
