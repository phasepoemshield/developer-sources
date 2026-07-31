package fun.wonderful.api.utils.render.fonts.msdf;

import net.minecraft.client.render.VertexConsumer;
import org.joml.Matrix4f;

public final class MsdfGlyph {
    private final int code;
    private final float minU;
    private final float maxU;
    private final float minV;
    private final float maxV;
    private final float advance;
    private final float topPosition;
    private final float width;
    private final float height;

    public MsdfGlyph(int unicode, float advance, float planeLeft, float planeTop, float planeRight, float planeBottom, float atlasLeft, float atlasTop, float atlasRight, float atlasBottom, float atlasWidth, float atlasHeight) {
        this.code = unicode;
        this.advance = advance;
        if (atlasLeft != 0.0f || atlasRight != 0.0f || atlasTop != 0.0f || atlasBottom != 0.0f) {
            this.minU = atlasLeft / atlasWidth;
            this.maxU = atlasRight / atlasWidth;
            this.minV = 1.0f - atlasTop / atlasHeight;
            this.maxV = 1.0f - atlasBottom / atlasHeight;
        } else {
            this.minU = 0.0f;
            this.maxU = 0.0f;
            this.minV = 0.0f;
            this.maxV = 0.0f;
        }
        if (planeLeft != 0.0f || planeRight != 0.0f || planeTop != 0.0f || planeBottom != 0.0f) {
            this.width = planeRight - planeLeft;
            this.height = planeTop - planeBottom;
            this.topPosition = planeTop;
        } else {
            this.width = 0.0f;
            this.height = 0.0f;
            this.topPosition = 0.0f;
        }
    }

    public float apply(Matrix4f matrix, VertexConsumer consumer, float size, float x2, float y2, float z2, int red, int green, int blue, int alpha) {
        y2 -= this.topPosition * size;
        float w2 = this.width * size;
        float h2 = this.height * size;
        y2 -= 1.0f;
        consumer.vertex(matrix, x2, y2, z2).texture(this.minU, this.minV).color(red, green, blue, alpha);
        consumer.vertex(matrix, x2, y2 + h2, z2).texture(this.minU, this.maxV).color(red, green, blue, alpha);
        consumer.vertex(matrix, x2 + w2, y2 + h2, z2).texture(this.maxU, this.maxV).color(red, green, blue, alpha);
        consumer.vertex(matrix, x2 + w2, y2, z2).texture(this.maxU, this.minV).color(red, green, blue, alpha);
        return this.advance * size;
    }

    public float getWidth(float size) {
        return this.advance * size;
    }

    public int getCharCode() {
        return this.code;
    }
}