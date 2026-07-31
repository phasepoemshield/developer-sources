package fun.nexisdlc.client.utils.render.main.world;

import net.minecraft.util.math.Box;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;

public final class WorldCausticOverlayRenderer {
    private WorldCausticOverlayRenderer() {
    }

    public static void renderFace(WorldGeometryEmitter emitter,
                                  Box worldBox,
                                  Direction face,
                                  Vec3d cameraPos,
                                  int accentColor,
                                  float alpha,
                                  float speed,
                                  long timeMs) {
        FacePlane plane = facePlane(worldBox, face);
        emitCausticField(emitter, plane, cameraPos, accentColor, alpha, speed, timeMs, 26);
    }

    private static void emitCausticField(WorldGeometryEmitter emitter,
                                         FacePlane plane,
                                         Vec3d cameraPos,
                                         int accentColor,
                                         float alpha,
                                         float speed,
                                         long timeMs,
                                         int segments) {
        float step = 1.0f / segments;
        float seed = planeSeed(plane);
        for (int iy = 0; iy < segments; iy++) {
            float v0 = iy * step;
            float v1 = (iy + 1) * step;
            for (int ix = 0; ix < segments; ix++) {
                float u0 = ix * step;
                float u1 = (ix + 1) * step;

                Vec3d p00w = planePoint(plane, u0, v0).add(plane.normal().multiply(0.0016));
                Vec3d p10w = planePoint(plane, u1, v0).add(plane.normal().multiply(0.0016));
                Vec3d p11w = planePoint(plane, u1, v1).add(plane.normal().multiply(0.0016));
                Vec3d p01w = planePoint(plane, u0, v1).add(plane.normal().multiply(0.0016));

                int c00 = causticColor(plane, p00w, cameraPos, u0, v0, accentColor, alpha, speed, timeMs, seed);
                int c10 = causticColor(plane, p10w, cameraPos, u1, v0, accentColor, alpha, speed, timeMs, seed);
                int c11 = causticColor(plane, p11w, cameraPos, u1, v1, accentColor, alpha, speed, timeMs, seed);
                int c01 = causticColor(plane, p01w, cameraPos, u0, v1, accentColor, alpha, speed, timeMs, seed);

                emitter.emitQuad(
                        p00w.subtract(cameraPos),
                        p10w.subtract(cameraPos),
                        p11w.subtract(cameraPos),
                        p01w.subtract(cameraPos),
                        c00, c10, c11, c01);
            }
        }
    }

    private static int causticColor(FacePlane plane,
                                    Vec3d worldPos,
                                    Vec3d cameraPos,
                                    float u,
                                    float v,
                                    int accentColor,
                                    float alpha,
                                    float speed,
                                    long timeMs,
                                    float seed) {
        float t = timeMs * 0.001f * speed;
        float scale = 7.2f;
        float x = (float) (u * scale + seed * 3.1f);
        float y = (float) (v * scale + seed * 5.7f);

        float waveA = ridge((float) Math.sin(x * 1.35f + t * 1.10f + Math.cos(y * 0.92f - t * 0.74f)));
        float waveB = ridge((float) Math.sin(y * 1.58f - t * 0.96f + Math.cos(x * 0.84f + t * 0.62f)));
        float waveC = ridge((float) Math.sin((x + y) * 1.08f + t * 0.72f + seed * 4.0f));
        float lines = smoothstep(0.58f, 0.98f, waveA * 0.46f + waveB * 0.38f + waveC * 0.30f);

        float shimmer = 0.5f + 0.5f * (float) Math.sin((worldPos.x * 1.7 + worldPos.y * 1.1 + worldPos.z * 1.3) + t * 1.4f);
        float power = clamp01(lines * (0.72f + shimmer * 0.38f));

        Vec3d toCamera = cameraPos.subtract(worldPos);
        double lenSq = toCamera.lengthSquared();
        float view = 1.0f;
        if (lenSq > 1.0E-7) {
            view = (float) Math.abs(plane.normal().dotProduct(toCamera) / Math.sqrt(lenSq));
        }
        float viewBoost = 0.70f + 0.30f * (1.0f - view);

        int base = mixColor(0xFFDDF9FF, accentColor, 0.42f + 0.36f * power);
        float glow = 1.04f + 0.55f * power;
        int r = clamp((int) (((base >> 16) & 0xFF) * glow), 0, 255);
        int g = clamp((int) (((base >> 8) & 0xFF) * glow), 0, 255);
        int b = clamp((int) ((base & 0xFF) * glow), 0, 255);

        double dist = worldPos.distanceTo(cameraPos);
        float distFade = clamp01(1.0f - (float) ((dist - 2.0) / 24.0));
        int a = clamp((int) (alpha * 255.0f * (0.10f + power * 0.62f) * viewBoost * distFade), 0, 255);
        return (a << 24) | (r << 16) | (g << 8) | b;
    }

    private static float ridge(float value) {
        return 1.0f - Math.abs(value);
    }

    private static float planeSeed(FacePlane plane) {
        float n = (float) (plane.origin().x * 12.9898 + plane.origin().y * 78.233 + plane.origin().z * 37.719);
        return fract((float) Math.sin(n) * 43758.5453f);
    }

    private static float fract(float v) {
        return (float) (v - Math.floor(v));
    }

    private static FacePlane facePlane(Box box, Direction face) {
        Vec3d min = new Vec3d(box.minX, box.minY, box.minZ);
        Vec3d max = new Vec3d(box.maxX, box.maxY, box.maxZ);
        return switch (face) {
            case DOWN -> new FacePlane(new Vec3d(min.x, min.y, min.z), new Vec3d(max.x - min.x, 0.0, 0.0), new Vec3d(0.0, 0.0, max.z - min.z), new Vec3d(0.0, -1.0, 0.0));
            case UP -> new FacePlane(new Vec3d(min.x, max.y, min.z), new Vec3d(max.x - min.x, 0.0, 0.0), new Vec3d(0.0, 0.0, max.z - min.z), new Vec3d(0.0, 1.0, 0.0));
            case NORTH -> new FacePlane(new Vec3d(min.x, min.y, min.z), new Vec3d(max.x - min.x, 0.0, 0.0), new Vec3d(0.0, max.y - min.y, 0.0), new Vec3d(0.0, 0.0, -1.0));
            case SOUTH -> new FacePlane(new Vec3d(min.x, min.y, max.z), new Vec3d(max.x - min.x, 0.0, 0.0), new Vec3d(0.0, max.y - min.y, 0.0), new Vec3d(0.0, 0.0, 1.0));
            case WEST -> new FacePlane(new Vec3d(min.x, min.y, min.z), new Vec3d(0.0, 0.0, max.z - min.z), new Vec3d(0.0, max.y - min.y, 0.0), new Vec3d(-1.0, 0.0, 0.0));
            case EAST -> new FacePlane(new Vec3d(max.x, min.y, min.z), new Vec3d(0.0, 0.0, max.z - min.z), new Vec3d(0.0, max.y - min.y, 0.0), new Vec3d(1.0, 0.0, 0.0));
        };
    }

    private static Vec3d planePoint(FacePlane plane, float u, float v) {
        return plane.origin()
                .add(plane.axisU().multiply(u))
                .add(plane.axisV().multiply(v));
    }

    private static int mixColor(int from, int to, float t) {
        int fr = (from >> 16) & 0xFF;
        int fg = (from >> 8) & 0xFF;
        int fb = from & 0xFF;
        int tr = (to >> 16) & 0xFF;
        int tg = (to >> 8) & 0xFF;
        int tb = to & 0xFF;
        int r = mix(fr, tr, clamp01(t));
        int g = mix(fg, tg, clamp01(t));
        int b = mix(fb, tb, clamp01(t));
        return 0xFF000000 | (r << 16) | (g << 8) | b;
    }

    private static int mix(int from, int to, float t) {
        return clamp((int) (from + (to - from) * t), 0, 255);
    }

    private static int clamp(int value, int min, int max) {
        return Math.max(min, Math.min(max, value));
    }

    private static float clamp01(float value) {
        return Math.max(0.0f, Math.min(1.0f, value));
    }

    private static float smoothstep(float edge0, float edge1, float x) {
        float t = clamp01((x - edge0) / (edge1 - edge0));
        return t * t * (3.0f - 2.0f * t);
    }

    private record FacePlane(Vec3d origin, Vec3d axisU, Vec3d axisV, Vec3d normal) {
    }
}
