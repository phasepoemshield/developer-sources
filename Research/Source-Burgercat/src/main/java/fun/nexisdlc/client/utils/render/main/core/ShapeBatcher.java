package fun.nexisdlc.client.utils.render.main.core;

import fun.nexisdlc.client.utils.render.main.gl.GlBackend;

final class ShapeBatcher {
    private final GlBackend backend;

    ShapeBatcher(GlBackend backend) {
        this.backend = backend;
    }

    void enqueueRect(float x, float y, float w, float h,
                     float roundTopLeft, float roundTopRight,
                     float roundBottomRight, float roundBottomLeft,
                     int color, float[] transform) {
        backend.enqueueRect(x, y, w, h,
                roundTopLeft, roundTopRight, roundBottomRight, roundBottomLeft,
                color, transform);
    }

    void enqueueRectOutline(float x, float y, float w, float h,
                            float roundTopLeft, float roundTopRight,
                            float roundBottomRight, float roundBottomLeft,
                            int color, float thickness, float[] transform) {
        backend.enqueueRectOutline(x, y, w, h,
                roundTopLeft, roundTopRight, roundBottomRight, roundBottomLeft,
                color, thickness, transform);
    }

    void enqueueGradient(float x, float y, float w, float h,
                         float roundTopLeft, float roundTopRight,
                         float roundBottomRight, float roundBottomLeft,
                         int c00, int c10, int c11, int c01, float[] transform) {
        backend.enqueueGradient(x, y, w, h,
                roundTopLeft, roundTopRight, roundBottomRight, roundBottomLeft,
                c00, c10, c11, c01, transform);
    }

    void enqueueCircle(float cx, float cy, float radius, float startDeg, float pct, int color, float[] transform) {
        backend.enqueueCircle(cx, cy, radius, startDeg, pct, color, transform);
    }

    void enqueueTexturedQuad(int texture, float x, float y, float w, float h,
                             float u0, float v0, float u1, float v1,
                             int color, float[] transform, boolean preservePremultipliedColor) {
        backend.drawRgbaTexturedQuad(texture, x, y, w, h, u0, v0, u1, v1,
                color, transform, preservePremultipliedColor);
    }

    void enqueueTexturedQuadRounded(int texture, float x, float y, float w, float h,
                                    float u0, float v0, float u1, float v1,
                                    float rounding, int color, float[] transform,
                                    boolean preservePremultipliedColor) {
        backend.drawRgbaTexturedQuadRounded(texture, x, y, w, h, u0, v0, u1, v1,
                rounding, color, transform, preservePremultipliedColor);
    }

    void flush() {
        backend.flush();
    }
}
