package sg.ec;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.gl.ShaderProgramKeys;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.render.BufferRenderer;
import net.minecraft.client.render.Tessellator;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.render.VertexFormat.DrawMode;
import org.joml.Matrix4f;
import ru.destra.gui.CornerRadius;
import ru.destra.gui.Size;
import ru.destra.render.Renderable;

public class RoundedRectImpl implements Renderable {

    private final Size size;
    private final CornerRadius cornerRadius;
    private final int[] colors;
    private final float[] gradientStops;
    private final int baseColor;

    public RoundedRectImpl() {
        this.size = null;
        this.cornerRadius = null;
        this.colors = null;
        this.gradientStops = null;
        this.baseColor = 0;
    }

    public RoundedRectImpl(Size size, CornerRadius cornerRadius, int[] colors, float[] gradientStops, int color) {
        this.size = size;
        this.cornerRadius = cornerRadius;
        this.colors = colors;
        this.gradientStops = gradientStops;
        this.baseColor = color;
    }

    @Override
    public void render(Matrix4f matrix, float x, float y, float z) {
        if (size == null) return;

        float w = size.width();
        float h = size.height();

        if (w <= 0 || h <= 0) return;

        RenderSystem.enableBlend();
        RenderSystem.disableCull();
        RenderSystem.setShader(ShaderProgramKeys.POSITION_COLOR);

        if (colors == null || colors.length < 2 || gradientStops == null || gradientStops.length < 2) {
            float r = ((baseColor >> 16) & 0xFF) / 255.0F;
            float g = ((baseColor >> 8) & 0xFF) / 255.0F;
            float b = (baseColor & 0xFF) / 255.0F;
            float a = ((baseColor >> 24) & 0xFF) / 255.0F;

            BufferBuilder bb = Tessellator.getInstance().begin(DrawMode.QUADS, VertexFormats.POSITION_COLOR);
            bb.vertex(matrix, x, y, z).color(r, g, b, a);
            bb.vertex(matrix, x + w, y, z).color(r, g, b, a);
            bb.vertex(matrix, x + w, y + h, z).color(r, g, b, a);
            bb.vertex(matrix, x, y + h, z).color(r, g, b, a);
            BufferRenderer.drawWithGlobalProgram(bb.end());
        } else {
            BufferBuilder bb = Tessellator.getInstance().begin(DrawMode.QUADS, VertexFormats.POSITION_COLOR);
            for (int i = 0; i < colors.length - 1; i++) {
                float stop1 = gradientStops[i];
                float stop2 = gradientStops[i + 1];
                int c1 = colors[i];
                int c2 = colors[i + 1];

                float x1 = x + w * stop1;
                float x2 = x + w * stop2;

                float r1 = ((c1 >> 16) & 0xFF) / 255.0F;
                float g1 = ((c1 >> 8) & 0xFF) / 255.0F;
                float b1 = (c1 & 0xFF) / 255.0F;
                float a1 = ((c1 >> 24) & 0xFF) / 255.0F;

                float r2 = ((c2 >> 16) & 0xFF) / 255.0F;
                float g2 = ((c2 >> 8) & 0xFF) / 255.0F;
                float b2 = (c2 & 0xFF) / 255.0F;
                float a2 = ((c2 >> 24) & 0xFF) / 255.0F;

                bb.vertex(matrix, x1, y, z).color(r1, g1, b1, a1);
                bb.vertex(matrix, x2, y, z).color(r2, g2, b2, a2);
                bb.vertex(matrix, x2, y + h, z).color(r2, g2, b2, a2);
                bb.vertex(matrix, x1, y + h, z).color(r1, g1, b1, a1);
            }
            BufferRenderer.drawWithGlobalProgram(bb.end());
        }

        RenderSystem.enableCull();
        RenderSystem.defaultBlendFunc();
        RenderSystem.disableBlend();
    }
}
