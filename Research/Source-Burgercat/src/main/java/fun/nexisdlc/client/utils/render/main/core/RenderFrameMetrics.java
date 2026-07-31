package fun.nexisdlc.client.utils.render.main.core;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Collects renderer frame statistics for debugging overlays and diagnostics.
 * The tracker records draw calls and timing for the UI renderer so modules can
 * display averaged performance metrics without touching low-level GL state.
 */
public final class RenderFrameMetrics {

    private static final RenderFrameMetrics INSTANCE = new RenderFrameMetrics();

    private final AtomicLong frameStartNanos = new AtomicLong();
    private final AtomicLong lastFrameDurationNanos = new AtomicLong();
    private final AtomicInteger currentDrawCalls = new AtomicInteger();
    private final AtomicInteger currentTriangles = new AtomicInteger();
    private final AtomicInteger lastFrameDrawCalls = new AtomicInteger();
    private final AtomicInteger lastFrameTriangles = new AtomicInteger();

    private RenderFrameMetrics() {
    }

    public static RenderFrameMetrics getInstance() {
        return INSTANCE;
    }

    /**
     * Marks the beginning of a new renderer frame and resets accumulators.
     *
     * @param width  viewport width in pixels (unused for now but validated)
     * @param height viewport height in pixels (unused for now but validated)
     */
    public void beginFrame(int width, int height) {
        if (width <= 0 || height <= 0) {
            return;
        }
        long now = System.nanoTime();
        frameStartNanos.set(now);
        currentDrawCalls.set(0);
        currentTriangles.set(0);
    }

    /**
     * Records a single draw call for the active frame.
     *
     * @param triangleCount number of triangles emitted by the draw call
     */
    public void recordDrawCall(int triangleCount) {
        if (triangleCount < 0) {
            triangleCount = 0;
        }
        currentDrawCalls.incrementAndGet();
        currentTriangles.addAndGet(triangleCount);
    }

    /**
     * Marks the end of the active renderer frame and stores the collected metrics.
     */
    public void endFrame() {
        long now = System.nanoTime();
        long started = frameStartNanos.get();
        int drawCalls = currentDrawCalls.getAndSet(0);
        int triangles = currentTriangles.getAndSet(0);
        if (started <= 0L) {
            frameStartNanos.set(now);
            lastFrameDurationNanos.set(0L);
            lastFrameDrawCalls.set(drawCalls);
            lastFrameTriangles.set(triangles);
            return;
        }
        lastFrameDurationNanos.set(Math.max(0L, now - started));
        lastFrameDrawCalls.set(drawCalls);
        lastFrameTriangles.set(triangles);
        frameStartNanos.set(now);
    }

    /**
     * Returns a snapshot of the most recently completed frame metrics.
     */
    public FrameMetricsSnapshot snapshot() {
        return new FrameMetricsSnapshot(
                lastFrameDurationNanos.get(),
                lastFrameDrawCalls.get(),
                lastFrameTriangles.get());
    }

    public record FrameMetricsSnapshot(long frameDurationNanos, int drawCalls, int triangles) {
        public FrameMetricsSnapshot {
            frameDurationNanos = Math.max(0L, frameDurationNanos);
            drawCalls = Math.max(0, drawCalls);
            triangles = Math.max(0, triangles);
        }

        public double frameTimeMillis() {
            return frameDurationNanos / 1_000_000.0;
        }

        public double framesPerSecond() {
            return frameDurationNanos > 0L ? 1_000_000_000.0 / frameDurationNanos : 0.0;
        }
    }
}
