/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Vector3f
 *  org.joml.Vector4f
 */
package oxxxde;

import kotakbaz.rain.client.render.main.ChromaRenderer;
import kotakbaz.rain.client.render.main.scissor.A;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.joml.Vector3f;
import org.joml.Vector4f;
import oxxxde.\u0628\u062f;
import oxxxde.\u0636\u0643;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J-\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004\u00a2\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t\u00a2\u0006\u0004\b\f\u0010\u0003J\r\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0016\u0010\u0015\u00a8\u0006\u0017"}, d2={"Loxxxde/\u062c\u0650;", "", "<init>", "()V", "", "x", "y", "width", "height", "", "start", "(FFFF)V", "end", "Lorg/joml/Vector4f;", "getCurrentScissorValues", "()Lorg/joml/Vector4f;", "NO_SCISSOR", "Lorg/joml/Vector4f;", "CACHE_SCISSOR", "Lorg/joml/Vector3f;", "START_POS", "Lorg/joml/Vector3f;", "END_POS", "rain-visuals"})
public final class \u062c\u0650 {
    @NotNull
    private static final Vector4f NO_SCISSOR;
    @NotNull
    private static final Vector4f CACHE_SCISSOR;
    @NotNull
    private static final Vector3f START_POS;
    @NotNull
    public static final \u062c\u0650 INSTANCE;
    @NotNull
    private static final Vector3f END_POS;

    public final void start(float x, float y, float width, float height) {
        START_POS.set(x, y, 0.0f);
        END_POS.set(x + width, y + height, 0.0f);
        \u0628\u062f.INSTANCE.transformPosition(START_POS);
        \u0628\u062f.INSTANCE.transformPosition(END_POS);
        float transformedX = Math.min(\u062c\u0650.START_POS.x, \u062c\u0650.END_POS.x);
        float transformedY = Math.min(\u062c\u0650.START_POS.y, \u062c\u0650.END_POS.y);
        float transformedW = Math.abs(\u062c\u0650.END_POS.x - \u062c\u0650.START_POS.x);
        float transformedH = Math.abs(\u062c\u0650.END_POS.y - \u062c\u0650.START_POS.y);
        ChromaRenderer.scissorStack.push(new A(transformedX, transformedY, transformedW, transformedH));
    }

    @NotNull
    public final Vector4f getCurrentScissorValues() {
        if (ChromaRenderer.scissorStack.current == null) {
            return NO_SCISSOR;
        }
        A rect = ChromaRenderer.scissorStack.current;
        float scale = \u0636\u0643.getMc().getWindow().getScaleFactor();
        float h = \u0636\u0643.getMc().getWindow().getFramebufferHeight();
        float realX = rect.x() * scale;
        float realY = rect.y() * scale;
        float realW = rect.width() * scale;
        float realH = rect.height() * scale;
        float glMinY = h - (realY + realH);
        float glMaxY = h - realY;
        float glMinX = realX;
        float glMaxX = realX + realW;
        CACHE_SCISSOR.set(glMinX, glMinY, glMaxX, glMaxY);
        return CACHE_SCISSOR;
    }

    public final void end() {
        ChromaRenderer.scissorStack.pop();
    }

    static {
        INSTANCE = new \u062c\u0650();
        NO_SCISSOR = new Vector4f(-100000.0f, -100000.0f, 100000.0f, 100000.0f);
        CACHE_SCISSOR = new Vector4f(-1.0f);
        START_POS = new Vector3f();
        END_POS = new Vector3f();
    }

    private \u062c\u0650() {
    }
}

