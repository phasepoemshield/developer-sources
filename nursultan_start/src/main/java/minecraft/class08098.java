/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01423
 *  minecraft.class01686
 *  minecraft.class08388
 *  net.irisshaders.iris.mixinterface.ModelStorage
 *  net.irisshaders.iris.uniforms.CapturedRenderingState
 *  net.irisshaders.iris.vertices.ImmediateState
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.Objects;
import minecraft.class01423;
import minecraft.class01686;
import minecraft.class08141;
import minecraft.class08388;
import net.irisshaders.iris.mixinterface.ModelStorage;
import net.irisshaders.iris.uniforms.CapturedRenderingState;
import net.irisshaders.iris.vertices.ImmediateState;
import org.jspecify.annotations.Nullable;

/*
 * Signature claims super is java.lang.Record, not java.lang.Object - discarding signature.
 */
public final class class08098
implements ModelStorage {
    private class01423 pose;
    private class01686 modelPart;
    private int lightCoords;
    private int overlayCoords;
    private @Nullable class08388 sprite;
    private boolean sheeted;
    private boolean hasFoil;
    private int tintedColor;
    private @Nullable class08141 crumblingOverlay;
    private int outlineColor;
    private int U;
    private int E;
    private int W;
    private boolean m;

    public int L() {
        return this.lightCoords;
    }

    public boolean M() {
        return this.hasFoil;
    }

    public void iris$capture() {
        this.U = CapturedRenderingState.INSTANCE.getCurrentRenderedEntity();
        this.E = CapturedRenderingState.INSTANCE.getCurrentRenderedBlockEntity();
        this.W = CapturedRenderingState.INSTANCE.getCurrentRenderedItem();
        this.m = ImmediateState.isRenderingBEs;
    }

    public class08098(class01423 class014232, class01686 class016862, int n, int n2, @Nullable class08388 class083882, boolean bl, boolean bl2, int n3, @Nullable class08141 class081412, int n4) {
        this.pose = class014232;
        this.modelPart = class016862;
        this.lightCoords = n;
        this.overlayCoords = n2;
        this.sprite = class083882;
        this.sheeted = bl;
        this.hasFoil = bl2;
        this.tintedColor = n3;
        this.crumblingOverlay = class081412;
        this.outlineColor = n4;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        return object instanceof class08098 && Objects.equals(this.pose, ((class08098)object).pose) && Objects.equals(this.modelPart, ((class08098)object).modelPart) && this.lightCoords == ((class08098)object).lightCoords && this.overlayCoords == ((class08098)object).overlayCoords && Objects.equals(this.sprite, ((class08098)object).sprite) && this.sheeted == ((class08098)object).sheeted && this.hasFoil == ((class08098)object).hasFoil && this.tintedColor == ((class08098)object).tintedColor && Objects.equals((Object)this.crumblingOverlay, (Object)((class08098)object).crumblingOverlay) && this.outlineColor == ((class08098)object).outlineColor;
    }

    public final String toString() {
        return "class08098[pose=" + Objects.toString(this.pose) + ", modelPart=" + Objects.toString(this.modelPart) + ", lightCoords=" + Integer.toString(this.lightCoords) + ", overlayCoords=" + Integer.toString(this.overlayCoords) + ", sprite=" + Objects.toString(this.sprite) + ", sheeted=" + Boolean.toString(this.sheeted) + ", hasFoil=" + Boolean.toString(this.hasFoil) + ", tintedColor=" + Integer.toString(this.tintedColor) + ", crumblingOverlay=" + Objects.toString((Object)this.crumblingOverlay) + ", outlineColor=" + Integer.toString(this.outlineColor) + "]";
    }

    public final int hashCode() {
        return (((((((((0 * 31 + Objects.hashCode(this.pose)) * 31 + Objects.hashCode(this.modelPart)) * 31 + Integer.hashCode(this.lightCoords)) * 31 + Integer.hashCode(this.overlayCoords)) * 31 + Objects.hashCode(this.sprite)) * 31 + Boolean.hashCode(this.sheeted)) * 31 + Boolean.hashCode(this.hasFoil)) * 31 + Integer.hashCode(this.tintedColor)) * 31 + Objects.hashCode((Object)this.crumblingOverlay)) * 31 + Integer.hashCode(this.outlineColor);
    }

    public int B() {
        return this.tintedColor;
    }

    public @Nullable class08141 Z() {
        return this.crumblingOverlay;
    }

    public @Nullable class08388 i() {
        return this.sprite;
    }

    public int z() {
        return this.outlineColor;
    }

    public int u() {
        return this.overlayCoords;
    }

    public class01686 y() {
        return this.modelPart;
    }

    public class01423 N() {
        return this.pose;
    }

    public boolean R() {
        return this.sheeted;
    }

    public void iris$set() {
        CapturedRenderingState.INSTANCE.setCurrentEntity(this.U);
        CapturedRenderingState.INSTANCE.setCurrentBlockEntity(this.E);
        CapturedRenderingState.INSTANCE.setCurrentRenderedItem(this.W);
    }

    public boolean iris$wasBE() {
        return this.m;
    }
}

