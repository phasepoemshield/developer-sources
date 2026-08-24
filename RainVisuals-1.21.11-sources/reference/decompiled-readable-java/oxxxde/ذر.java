/*
 * Decompiled with CFR 0.152.
 */
package oxxxde;

import kotakbaz.rain.client.util.render.display.AdvancedRectRenderer;
import kotakbaz.rain.client.util.render.display.BasicRectRenderer;
import kotakbaz.rain.client.util.render.display.BlurredRectRenderer;
import kotakbaz.rain.client.util.render.display.KawaseRenderer;
import kotakbaz.rain.client.util.render.display.TextureRectRenderer;
import kotakbaz.rain.client.util.render.engine.dispatcher.RenderDispatcher;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import oxxxde.\u0638\u0642;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\n\u001a\u00020\t8\u0006\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006\u00a2\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0019\u001a\u00020\u00188\u0006\u00a2\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u001e\u001a\u00020\u001d8\u0006\u00a2\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\u00a8\u0006\""}, d2={"Loxxxde/\u0630\u0631;", "", "<init>", "()V", "Loxxxde/\u0628\u0626;", "DISPATCHER", "Loxxxde/\u0628\u0626;", "getDISPATCHER", "()Lkotakbaz/rain/client/util/render/engine/dispatcher/RenderDispatcher;", "Loxxxde/\u0632\u062c;", "ADVANCED_RECT", "Loxxxde/\u0632\u062c;", "getADVANCED_RECT", "()Lkotakbaz/rain/client/util/render/display/AdvancedRectRenderer;", "Loxxxde/\u0627\u0652;", "KAWASE", "Loxxxde/\u0627\u0652;", "getKAWASE", "()Lkotakbaz/rain/client/util/render/display/KawaseRenderer;", "Loxxxde/\u0636\u0650;", "BASIC_RECT", "Loxxxde/\u0636\u0650;", "getBASIC_RECT", "()Lkotakbaz/rain/client/util/render/display/BasicRectRenderer;", "Loxxxde/\u062c\u062b;", "TEXTURE_RECT", "Loxxxde/\u062c\u062b;", "getTEXTURE_RECT", "()Lkotakbaz/rain/client/util/render/display/TextureRectRenderer;", "Loxxxde/\u062c\u0621;", "BLURRED_RECT", "Loxxxde/\u062c\u0621;", "getBLURRED_RECT", "()Lkotakbaz/rain/client/util/render/display/BlurredRectRenderer;", "rain-visuals"})
public final class \u0630\u0631 {
    @NotNull
    private static final RenderDispatcher DISPATCHER;
    @NotNull
    public static final \u0630\u0631 INSTANCE;
    @NotNull
    private static final BasicRectRenderer BASIC_RECT;
    @NotNull
    private static final AdvancedRectRenderer ADVANCED_RECT;
    @NotNull
    private static final KawaseRenderer KAWASE;
    @NotNull
    private static final BlurredRectRenderer BLURRED_RECT;
    @NotNull
    private static final TextureRectRenderer TEXTURE_RECT;

    @NotNull
    public final BlurredRectRenderer getBLURRED_RECT() {
        return BLURRED_RECT;
    }

    @NotNull
    public final AdvancedRectRenderer getADVANCED_RECT() {
        return ADVANCED_RECT;
    }

    @NotNull
    public final RenderDispatcher getDISPATCHER() {
        return DISPATCHER;
    }

    private \u0630\u0631() {
    }

    @NotNull
    public final TextureRectRenderer getTEXTURE_RECT() {
        return TEXTURE_RECT;
    }

    @NotNull
    public final KawaseRenderer getKAWASE() {
        return KAWASE;
    }

    static {
        INSTANCE = new \u0630\u0631();
        DISPATCHER = \u0638\u0642.INSTANCE.getDispatcher();
        ADVANCED_RECT = new AdvancedRectRenderer();
        KAWASE = new KawaseRenderer();
        BASIC_RECT = new BasicRectRenderer(ADVANCED_RECT);
        TEXTURE_RECT = new TextureRectRenderer(ADVANCED_RECT);
        BLURRED_RECT = new BlurredRectRenderer(TEXTURE_RECT, KAWASE);
    }

    @NotNull
    public final BasicRectRenderer getBASIC_RECT() {
        return BASIC_RECT;
    }
}

