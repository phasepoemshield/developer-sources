package fun.nexisdlc.client.utils.render.main.world;

import fun.nexisdlc.client.utils.render.main.utils.Color;
import net.minecraft.client.render.Camera;
import net.minecraft.client.render.LightmapTextureManager;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.Vec3d;
import org.joml.Matrix3f;
import org.joml.Matrix4f;
import org.joml.Vector3f;

import java.util.Objects;

/**
 * Emits world-space geometry for world overlay rendering while accounting for camera-relative transforms.
 *
 * <p>When an Iris shader pack is active, {@link WorldRenderLayers} routes every quad/textured layer to a
 * compat {@code entityTranslucent} layer whose vertex format is
 * {@code POSITION_COLOR_TEXTURE_OVERLAY_LIGHT_NORMAL}. That format requires UV0 (texture), UV1 (overlay),
 * UV2 (light) and a normal on every vertex. The minimal {@code POSITION_COLOR} /
 * {@code POSITION_TEXTURE_COLOR} writes used without shaders are not enough and the draw fails with
 * "Missing elements in vertex: UV1, UV2, Normal". In compat mode this emitter therefore writes the full
 * entity vertex set. Line geometry is unaffected: under shaders it goes to {@code RenderLayers.lines()}
 * ({@code POSITION_COLOR_NORMAL}), which the line path already satisfies.</p>
 */
public final class WorldGeometryEmitter {

    private static final float EPSILON = 1.0E-6f;
    /**
     * Full-bright lightmap coordinate (block=15, sky=15).
     */
    private static final int FULL_BRIGHT_LIGHT = LightmapTextureManager.MAX_LIGHT_COORDINATE;

    private final Matrix4f positionMatrix;
    private final Matrix3f normalMatrix;
    private final VertexConsumer consumer;
    /**
     * True when the bound layer uses the full entity vertex format (shader compat path).
     */
    private final boolean compat;

    public WorldGeometryEmitter(WorldRenderer renderer, MatrixStack.Entry entry, VertexConsumer consumer) {
        this(Objects.requireNonNull(renderer, "renderer").camera(), entry, consumer);
    }

    public WorldGeometryEmitter(Camera camera, MatrixStack.Entry entry, VertexConsumer consumer) {
        Objects.requireNonNull(entry, "entry");
        this.consumer = Objects.requireNonNull(consumer, "consumer");

        this.positionMatrix = new Matrix4f(entry.getPositionMatrix());
        this.normalMatrix = new Matrix3f(entry.getNormalMatrix());
        this.compat = false; // late post-Iris pass: native nexis pipelines use POSITION_COLOR / POSITION_TEXTURE_COLOR, not entityTranslucent
    }

    public void emitQuad(Vec3d v0, Vec3d v1, Vec3d v2, Vec3d v3, int rgbaColor) {
        emitQuad(v0, v1, v2, v3, rgbaColor, rgbaColor, rgbaColor, rgbaColor);
    }

    public void emitQuad(Vec3d v0, Vec3d v1, Vec3d v2, Vec3d v3,
                         int rgbaColor0, int rgbaColor1, int rgbaColor2, int rgbaColor3) {
        Objects.requireNonNull(v0, "v0");
        Objects.requireNonNull(v1, "v1");
        Objects.requireNonNull(v2, "v2");
        Objects.requireNonNull(v3, "v3");

        Vector3f normal = compat ? faceNormal(v0, v1, v2) : null;
        writeColorVertex(v0, rgbaColor0, normal);
        writeColorVertex(v1, rgbaColor1, normal);
        writeColorVertex(v2, rgbaColor2, normal);
        writeColorVertex(v3, rgbaColor3, normal);
    }

    public void emitCube(Vec3d min, Vec3d max, int rgbaColor) {
        Objects.requireNonNull(min, "min");
        Objects.requireNonNull(max, "max");
        if (min.x > max.x || min.y > max.y || min.z > max.z) {
            throw new IllegalArgumentException("Minimum corner must be less than or equal to maximum corner.");
        }

        Vec3d p000 = new Vec3d(min.x, min.y, min.z);
        Vec3d p001 = new Vec3d(min.x, min.y, max.z);
        Vec3d p010 = new Vec3d(min.x, max.y, min.z);
        Vec3d p011 = new Vec3d(min.x, max.y, max.z);
        Vec3d p100 = new Vec3d(max.x, min.y, min.z);
        Vec3d p101 = new Vec3d(max.x, min.y, max.z);
        Vec3d p110 = new Vec3d(max.x, max.y, min.z);
        Vec3d p111 = new Vec3d(max.x, max.y, max.z);

        emitQuad(p000, p100, p110, p010, rgbaColor); // -Z
        emitQuad(p001, p011, p111, p101, rgbaColor); // +Z
        emitQuad(p000, p001, p101, p100, rgbaColor); // -Y
        emitQuad(p010, p110, p111, p011, rgbaColor); // +Y
        emitQuad(p000, p010, p011, p001, rgbaColor); // -X
        emitQuad(p100, p101, p111, p110, rgbaColor); // +X
    }

    public void emitLine(Vec3d start, Vec3d end, int rgbaColor) {
        emitLine(start, end, rgbaColor, rgbaColor);
    }

    public void emitLine(Vec3d start, Vec3d end, int startColor, int endColor) {
        Objects.requireNonNull(start, "start");
        Objects.requireNonNull(end, "end");

        emitLine(start.x, start.y, start.z, end.x, end.y, end.z, startColor, endColor);
    }

    public void emitLine(double startX, double startY, double startZ,
                         double endX, double endY, double endZ,
                         int rgbaColor) {
        emitLine(startX, startY, startZ, endX, endY, endZ, rgbaColor, rgbaColor);
    }

    public void emitLine(double startX, double startY, double startZ,
                         double endX, double endY, double endZ,
                         int startColor, int endColor) {
        Vector3f normal = computeLineNormal(startX, startY, startZ, endX, endY, endZ);
        writeLineVertex(startX, startY, startZ, startColor, normal);
        writeLineVertex(endX, endY, endZ, endColor, normal);
    }

    public void emitTexturedQuad(Vec3d v0, Vec3d v1, Vec3d v2, Vec3d v3,
                                 float u0, float v0Coord,
                                 float u1, float v1Coord,
                                 float u2, float v2Coord,
                                 float u3, float v3Coord,
                                 int rgbaColor) {
        emitTexturedQuad(v0, v1, v2, v3,
                u0, v0Coord,
                u1, v1Coord,
                u2, v2Coord,
                u3, v3Coord,
                rgbaColor, rgbaColor, rgbaColor, rgbaColor);
    }

    public void emitTexturedQuad(Vec3d v0, Vec3d v1, Vec3d v2, Vec3d v3,
                                 float u0, float v0Coord,
                                 float u1, float v1Coord,
                                 float u2, float v2Coord,
                                 float u3, float v3Coord,
                                 int color0, int color1, int color2, int color3) {
        Objects.requireNonNull(v0, "v0");
        Objects.requireNonNull(v1, "v1");
        Objects.requireNonNull(v2, "v2");
        Objects.requireNonNull(v3, "v3");

        Vector3f normal = compat ? faceNormal(v0, v1, v2) : null;
        writeTexturedVertex(v0, u0, v0Coord, color0, normal);
        writeTexturedVertex(v1, u1, v1Coord, color1, normal);
        writeTexturedVertex(v2, u2, v2Coord, color2, normal);
        writeTexturedVertex(v3, u3, v3Coord, color3, normal);
    }

    private void writeColorVertex(Vec3d worldPos, int rgbaColor, Vector3f normal) {
        VertexConsumer vertex = consumer.vertex(positionMatrix, (float) worldPos.x, (float) worldPos.y, (float) worldPos.z);
        vertex.color(Color.red(rgbaColor), Color.green(rgbaColor), Color.blue(rgbaColor), Color.alpha(rgbaColor));
        if (compat) {
            // Entity vertex format: layer texture is solid white, so any UV samples white and is tinted by color.
            vertex.texture(0.0f, 0.0f);
            vertex.overlay(OverlayTexture.DEFAULT_UV);
            vertex.light(FULL_BRIGHT_LIGHT);
            Vector3f n = normal != null ? normal : upNormal();
            vertex.normal(n.x, n.y, n.z);
        }
    }

    private void writeTexturedVertex(Vec3d worldPos, float u, float v, int rgbaColor, Vector3f normal) {
        VertexConsumer vertex = consumer.vertex(positionMatrix, (float) worldPos.x, (float) worldPos.y, (float) worldPos.z);
        vertex.color(Color.red(rgbaColor), Color.green(rgbaColor), Color.blue(rgbaColor), Color.alpha(rgbaColor));
        vertex.texture(u, v);
        if (compat) {
            vertex.overlay(OverlayTexture.DEFAULT_UV);
            vertex.light(FULL_BRIGHT_LIGHT);
            Vector3f n = normal != null ? normal : upNormal();
            vertex.normal(n.x, n.y, n.z);
        }
    }

    private void writeLineVertex(Vec3d worldPos, int rgbaColor, Vector3f normal) {
        writeLineVertex(worldPos.x, worldPos.y, worldPos.z, rgbaColor, normal);
    }

    private void writeLineVertex(double x, double y, double z, int rgbaColor, Vector3f normal) {
        VertexConsumer vertex = consumer.vertex(positionMatrix, (float) x, (float) y, (float) z);
        vertex.color(Color.red(rgbaColor), Color.green(rgbaColor), Color.blue(rgbaColor), Color.alpha(rgbaColor));
        vertex.normal(normal.x, normal.y, normal.z);
    }

    /**
     * Face normal for a quad, transformed into view space, for the entity-format compat path.
     */
    private Vector3f faceNormal(Vec3d a, Vec3d b, Vec3d c) {
        Vector3f edge1 = new Vector3f((float) (b.x - a.x), (float) (b.y - a.y), (float) (b.z - a.z));
        Vector3f edge2 = new Vector3f((float) (c.x - a.x), (float) (c.y - a.y), (float) (c.z - a.z));
        Vector3f normal = edge1.cross(edge2);
        if (normal.lengthSquared() <= EPSILON) {
            normal.set(0.0f, 1.0f, 0.0f);
        }
        normal.normalize();
        normalMatrix.transform(normal);
        if (normal.lengthSquared() <= EPSILON) {
            normal.set(0.0f, 1.0f, 0.0f);
        }
        normal.normalize();
        return normal;
    }

    private Vector3f upNormal() {
        Vector3f normal = new Vector3f(0.0f, 1.0f, 0.0f);
        normalMatrix.transform(normal);
        if (normal.lengthSquared() <= EPSILON) {
            normal.set(0.0f, 1.0f, 0.0f);
        }
        normal.normalize();
        return normal;
    }

    private Vector3f computeLineNormal(Vec3d start, Vec3d end) {
        return computeLineNormal(start.x, start.y, start.z, end.x, end.y, end.z);
    }

    private Vector3f computeLineNormal(double startX, double startY, double startZ,
                                       double endX, double endY, double endZ) {
        Vector3f normal = new Vector3f((float) (endX - startX), (float) (endY - startY), (float) (endZ - startZ));
        if (normal.lengthSquared() <= EPSILON) {
            normal.set(0.0f, 1.0f, 0.0f);
        }
        normal.normalize();
        normalMatrix.transform(normal);
        if (normal.lengthSquared() <= EPSILON) {
            normal.set(0.0f, 1.0f, 0.0f);
        }
        normal.normalize();
        return normal;
    }
}
