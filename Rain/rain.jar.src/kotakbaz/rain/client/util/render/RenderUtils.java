/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client.util.render;

import kotakbaz.rain.client.util.render.display.AdvancedRectRenderer;
import kotakbaz.rain.client.util.render.display.BasicRectRenderer;
import kotakbaz.rain.client.util.render.display.BlurredRectRenderer;
import kotakbaz.rain.client.util.render.display.KawaseRenderer;
import kotakbaz.rain.client.util.render.display.TextureRectRenderer;
import kotakbaz.rain.client.util.render.engine.controls.LayerControl;
import kotakbaz.rain.client.util.render.engine.dispatcher.RenderDispatcher;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\n\u001a\u00020\t8\u0006\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006\u00a2\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0019\u001a\u00020\u00188\u0006\u00a2\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u001e\u001a\u00020\u001d8\u0006\u00a2\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\u00a8\u0006\""}, d2={"Lkotakbaz/rain/client/util/render/RenderUtils;", "", "<init>", "()V", "Lkotakbaz/rain/client/util/render/engine/dispatcher/RenderDispatcher;", "DISPATCHER", "Lkotakbaz/rain/client/util/render/engine/dispatcher/RenderDispatcher;", "getDISPATCHER", "()Lkotakbaz/rain/client/util/render/engine/dispatcher/RenderDispatcher;", "Lkotakbaz/rain/client/util/render/display/AdvancedRectRenderer;", "ADVANCED_RECT", "Lkotakbaz/rain/client/util/render/display/AdvancedRectRenderer;", "getADVANCED_RECT", "()Lkotakbaz/rain/client/util/render/display/AdvancedRectRenderer;", "Lkotakbaz/rain/client/util/render/display/KawaseRenderer;", "KAWASE", "Lkotakbaz/rain/client/util/render/display/KawaseRenderer;", "getKAWASE", "()Lkotakbaz/rain/client/util/render/display/KawaseRenderer;", "Lkotakbaz/rain/client/util/render/display/BasicRectRenderer;", "BASIC_RECT", "Lkotakbaz/rain/client/util/render/display/BasicRectRenderer;", "getBASIC_RECT", "()Lkotakbaz/rain/client/util/render/display/BasicRectRenderer;", "Lkotakbaz/rain/client/util/render/display/TextureRectRenderer;", "TEXTURE_RECT", "Lkotakbaz/rain/client/util/render/display/TextureRectRenderer;", "getTEXTURE_RECT", "()Lkotakbaz/rain/client/util/render/display/TextureRectRenderer;", "Lkotakbaz/rain/client/util/render/display/BlurredRectRenderer;", "BLURRED_RECT", "Lkotakbaz/rain/client/util/render/display/BlurredRectRenderer;", "getBLURRED_RECT", "()Lkotakbaz/rain/client/util/render/display/BlurredRectRenderer;", "rain-visuals"})
public final class RenderUtils {
    @NotNull
    public static final RenderUtils INSTANCE = new RenderUtils();
    @NotNull
    private static final RenderDispatcher a = LayerControl.INSTANCE.getDispatcher();
    @NotNull
    private static final AdvancedRectRenderer A = new AdvancedRectRenderer();
    @NotNull
    private static final KawaseRenderer b = new KawaseRenderer();
    @NotNull
    private static final BasicRectRenderer B = new BasicRectRenderer(A);
    @NotNull
    private static final TextureRectRenderer c = new TextureRectRenderer(A);
    @NotNull
    private static final BlurredRectRenderer C = new BlurredRectRenderer(c, b);

    private RenderUtils() {
    }

    @NotNull
    public final RenderDispatcher getDISPATCHER() {
        return a;
    }

    @NotNull
    public final AdvancedRectRenderer getADVANCED_RECT() {
        return A;
    }

    @NotNull
    public final KawaseRenderer getKAWASE() {
        return b;
    }

    @NotNull
    public final BasicRectRenderer getBASIC_RECT() {
        return B;
    }

    @NotNull
    public final TextureRectRenderer getTEXTURE_RECT() {
        return c;
    }

    @NotNull
    public final BlurredRectRenderer getBLURRED_RECT() {
        return C;
    }
}

