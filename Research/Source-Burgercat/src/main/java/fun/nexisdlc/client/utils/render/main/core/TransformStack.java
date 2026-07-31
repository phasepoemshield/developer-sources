package fun.nexisdlc.client.utils.render.main.core;

import java.util.ArrayDeque;

public final class TransformStack {
    private final ArrayDeque<float[]> stack = new ArrayDeque<>();
    private final ArrayDeque<float[]> pool = new ArrayDeque<>();

    public TransformStack() {
        pushIdentity();
    }

    public void clear() {
        while (!stack.isEmpty()) {
            releaseMatrix(stack.pop());
        }
        stack.clear();
        pushIdentity();
    }

    public void pushIdentity() {
        float[] matrix = obtainMatrix();
        setIdentity(matrix);
        stack.push(matrix);
    }

    public void pushRotation(float degrees) {
        float rad = (float) Math.toRadians(degrees);
        float c = (float) Math.cos(rad);
        float s = (float) Math.sin(rad);
        float[] top = stack.peek();
        float[] next = obtainMatrix();
        mulAffine(top, c, -s, 0f, s, c, 0f, next);
        stack.push(next);
    }

    public void pushTranslation(float tx, float ty) {
        float[] top = stack.peek();
        float[] next = obtainMatrix();
        mulAffine(top, 1f, 0f, tx, 0f, 1f, ty, next);
        stack.push(next);
    }

    public void pushTranslationInv(float tx, float ty) {
        pushTranslation(-tx, -ty);
    }

    public void pushScale(float sx, float sy, float originX, float originY) {
        float translateX = originX - originX * sx;
        float translateY = originY - originY * sy;
        float[] top = stack.peek();
        float[] next = obtainMatrix();
        mulAffine(top, sx, 0f, translateX, 0f, sy, translateY, next);
        stack.push(next);
    }

    public void pushScale(float scale, float originX, float originY) {
        pushScale(scale, scale, originX, originY);
    }

    public void replaceTop(float[] matrix) {
        if (matrix == null) {
            throw new IllegalArgumentException("matrix must not be null");
        }
        if (matrix.length != 9) {
            throw new IllegalArgumentException("matrix must have length 9");
        }
        for (float value : matrix) {
            if (!Float.isFinite(value)) {
                throw new IllegalArgumentException("matrix entries must be finite");
            }
        }
        if (stack.isEmpty()) {
            throw new IllegalStateException("cannot replace top matrix on an empty stack");
        }
        float[] copy = obtainMatrix();
        System.arraycopy(matrix, 0, copy, 0, matrix.length);
        releaseMatrix(stack.pop());
        stack.push(copy);
    }

    public void pop() {
        if (stack.size() > 1) {
            releaseMatrix(stack.pop());
        }
    }

    public void popN(int count) {
        for (int i = 0; i < count; i++) {
            if (stack.size() > 1) {
                releaseMatrix(stack.pop());
            }
        }
    }

    public float[] current() {
        return stack.peek();
    }

    private float[] obtainMatrix() {
        float[] matrix = pool.pollFirst();
        return matrix != null ? matrix : new float[9];
    }

    private void releaseMatrix(float[] matrix) {
        if (matrix != null && matrix.length == 9) {
            pool.offerFirst(matrix);
        }
    }

    private static void setIdentity(float[] matrix) {
        matrix[0] = 1f;
        matrix[1] = 0f;
        matrix[2] = 0f;
        matrix[3] = 0f;
        matrix[4] = 1f;
        matrix[5] = 0f;
        matrix[6] = 0f;
        matrix[7] = 0f;
        matrix[8] = 1f;
    }

    private static void mulAffine(float[] a,
                                  float b00,
                                  float b01,
                                  float b02,
                                  float b10,
                                  float b11,
                                  float b12,
                                  float[] out) {
        out[0] = a[0] * b00 + a[1] * b10;
        out[1] = a[0] * b01 + a[1] * b11;
        out[2] = a[0] * b02 + a[1] * b12 + a[2];

        out[3] = a[3] * b00 + a[4] * b10;
        out[4] = a[3] * b01 + a[4] * b11;
        out[5] = a[3] * b02 + a[4] * b12 + a[5];

        out[6] = a[6] * b00 + a[7] * b10;
        out[7] = a[6] * b01 + a[7] * b11;
        out[8] = a[6] * b02 + a[7] * b12 + a[8];
    }
}
