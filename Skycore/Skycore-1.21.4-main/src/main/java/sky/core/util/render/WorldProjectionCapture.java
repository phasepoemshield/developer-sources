package sky.core.util.render;

import org.joml.Matrix4f;

public final class WorldProjectionCapture {
    private static Matrix4f projection = new Matrix4f();
    private static Matrix4f worldSpace = new Matrix4f();
    private static boolean captured;

    private WorldProjectionCapture() {
    }

    public static void capture(Matrix4f projectionMatrix, Matrix4f worldSpaceMatrix) {
        projection.set(projectionMatrix);
        worldSpace.set(worldSpaceMatrix);
        captured = true;
    }

    public static Matrix4f getProjection() {
        return projection;
    }

    public static Matrix4f getWorldSpace() {
        return worldSpace;
    }

    public static boolean isCaptured() {
        return captured;
    }
}
