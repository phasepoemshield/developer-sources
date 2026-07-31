package pulse.gui.core;

import java.awt.Color;
import net.minecraft.util.Identifier;
import net.minecraft.client.util.math.MatrixStack;
import pulse.render.icons.IconTextureRegistry;
import pulse.render.Renderer2D;

public class PulseLogoOverlay implements ClickGuiOverlay {
    private static final float LOGO_TOP_PADDING = 2.0f;
    private static final float LOGO_HEIGHT = 35.0f;
    private static final float TEX_W = 225.0f;
    private static final float TEX_H = 87.0f;
    private static final float LOGO_WIDTH = LOGO_HEIGHT * (TEX_W / TEX_H);

    @Override
    public void a(MatrixStack MatrixStackVar, Renderer2D renderer2D, float f, float f2, int i, int i2) {
        Identifier IdentifierVarA = IconTextureRegistry.get("pulse_logo");
        float logoX = f + ((PulseClickGuiScreen.d() - LOGO_WIDTH) / 2.0f);
        float logoY = (f2 - LOGO_HEIGHT) - LOGO_TOP_PADDING;
        renderer2D.a(IdentifierVarA, logoX, logoY, LOGO_WIDTH, LOGO_HEIGHT, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, new Color(1.0f, 1.0f, 1.0f, 1.0f), MatrixStackVar);
    }

    @Override
    public void a(float f, float f2, int i, int i2) {
    }
}