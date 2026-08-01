/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client.util.render;

import kotakbaz.rain.client.extensions.b;
import kotakbaz.rain.client.render.main.ChromaRenderer;
import kotakbaz.rain.client.render.main.scissor.A;
import kotakbaz.rain.client.util.render.engine.controls.MatrixControl;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.joml.Vector3f;
import org.joml.Vector4f;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J-\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004\u00a2\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t\u00a2\u0006\u0004\b\f\u0010\u0003J\r\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0016\u0010\u0015\u00a8\u0006\u0017"}, d2={"Lkotakbaz/rain/client/util/render/ScissorUtil;", "", "<init>", "()V", "", "x", "y", "width", "height", "", "start", "(FFFF)V", "end", "Lorg/joml/Vector4f;", "getCurrentScissorValues", "()Lorg/joml/Vector4f;", "NO_SCISSOR", "Lorg/joml/Vector4f;", "CACHE_SCISSOR", "Lorg/joml/Vector3f;", "START_POS", "Lorg/joml/Vector3f;", "END_POS", "rain-visuals"})
public final class ScissorUtil {
    @NotNull
    public static final ScissorUtil INSTANCE = new ScissorUtil();
    @NotNull
    private static final Vector4f a = new Vector4f(-100000.0f, -100000.0f, 100000.0f, 100000.0f);
    @NotNull
    private static final Vector4f A = new Vector4f(-1.0f);
    @NotNull
    private static final Vector3f b = new Vector3f();
    @NotNull
    private static final Vector3f B = new Vector3f();

    private ScissorUtil() {
    }

    public final void start(float x2, float y, float width2, float height) {
        b.set(x2, y, 0.0f);
        B.set(x2 + width2, y + height, 0.0f);
        MatrixControl.b.transformPosition(b);
        MatrixControl.b.transformPosition(B);
        float f2 = Math.min(ScissorUtil.b.x, ScissorUtil.B.x);
        float f3 = Math.min(ScissorUtil.b.y, ScissorUtil.B.y);
        float f4 = Math.abs(ScissorUtil.B.x - ScissorUtil.b.x);
        float f5 = Math.abs(ScissorUtil.B.y - ScissorUtil.b.y);
        ChromaRenderer.scissorStack.push(new A(f2, f3, f4, f5));
    }

    public final void end() {
        ChromaRenderer.scissorStack.pop();
    }

    @NotNull
    public final Vector4f getCurrentScissorValues() {
        if (ChromaRenderer.scissorStack.A == null) {
            return a;
        }
        A a2 = ChromaRenderer.scissorStack.A;
        float f2 = kotakbaz.rain.client.extensions.b.getMc().getWindow().getScaleFactor();
        float f3 = kotakbaz.rain.client.extensions.b.getMc().getWindow().getHeight();
        float f4 = a2.x() * f2;
        float f5 = a2.y() * f2;
        float f6 = a2.width() * f2;
        float f7 = a2.height() * f2;
        float f8 = f3 - (f5 + f7);
        float f9 = f3 - f5;
        float f10 = f4;
        float f11 = f4 + f6;
        A.set(f10, f8, f11, f9);
        return A;
    }
}

