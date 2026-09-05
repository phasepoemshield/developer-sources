/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01423
 *  minecraft.class06271
 *  minecraft.class08388
 *  net.irisshaders.iris.mixinterface.ModelStorage
 *  net.irisshaders.iris.uniforms.CapturedRenderingState
 *  net.irisshaders.iris.vertices.ImmediateState
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.Objects;
import minecraft.class01423;
import minecraft.class06271;
import minecraft.class08141;
import minecraft.class08388;
import net.irisshaders.iris.mixinterface.ModelStorage;
import net.irisshaders.iris.uniforms.CapturedRenderingState;
import net.irisshaders.iris.vertices.ImmediateState;
import org.jspecify.annotations.Nullable;

/*
 * Signature claims super is java.lang.Record, not java.lang.Object - discarding signature.
 */
public final class class08107
implements ModelStorage {
    private class01423 pose;
    private class06271<? super S> model;
    private S state;
    private int lightCoords;
    private int overlayCoords;
    private int tintedColor;
    private @Nullable class08388 sprite;
    private int outlineColor;
    private @Nullable class08141 crumblingOverlay;
    private int z;
    private int U;
    private int E;
    private boolean W;

    public S L() {
        return this.state;
    }

    public @Nullable class08388 M() {
        return this.sprite;
    }

    public void iris$capture() {
        this.z = CapturedRenderingState.INSTANCE.getCurrentRenderedEntity();
        this.U = CapturedRenderingState.INSTANCE.getCurrentRenderedBlockEntity();
        this.E = CapturedRenderingState.INSTANCE.getCurrentRenderedItem();
        this.W = ImmediateState.isRenderingBEs;
    }

    public class08107(class01423 class014232, class06271<? super S> class062712, S s, int n, int n2, int n3, @Nullable class08388 class083882, int n4, @Nullable class08141 class081412) {
        this.pose = class014232;
        this.model = class062712;
        this.state = s;
        this.lightCoords = n;
        this.overlayCoords = n2;
        this.tintedColor = n3;
        this.sprite = class083882;
        this.outlineColor = n4;
        this.crumblingOverlay = class081412;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        return object instanceof class08107 && Objects.equals(this.pose, ((class08107)object).pose) && Objects.equals(this.model, ((class08107)object).model) && Objects.equals(this.state, ((class08107)object).state) && this.lightCoords == ((class08107)object).lightCoords && this.overlayCoords == ((class08107)object).overlayCoords && this.tintedColor == ((class08107)object).tintedColor && Objects.equals(this.sprite, ((class08107)object).sprite) && this.outlineColor == ((class08107)object).outlineColor && Objects.equals((Object)this.crumblingOverlay, (Object)((class08107)object).crumblingOverlay);
    }

    public final String toString() {
        return "class08107[pose=" + Objects.toString(this.pose) + ", model=" + Objects.toString(this.model) + ", state=" + Objects.toString(this.state) + ", lightCoords=" + Integer.toString(this.lightCoords) + ", overlayCoords=" + Integer.toString(this.overlayCoords) + ", tintedColor=" + Integer.toString(this.tintedColor) + ", sprite=" + Objects.toString(this.sprite) + ", outlineColor=" + Integer.toString(this.outlineColor) + ", crumblingOverlay=" + Objects.toString((Object)this.crumblingOverlay) + "]";
    }

    public final int hashCode() {
        return ((((((((0 * 31 + Objects.hashCode(this.pose)) * 31 + Objects.hashCode(this.model)) * 31 + Objects.hashCode(this.state)) * 31 + Integer.hashCode(this.lightCoords)) * 31 + Integer.hashCode(this.overlayCoords)) * 31 + Integer.hashCode(this.tintedColor)) * 31 + Objects.hashCode(this.sprite)) * 31 + Integer.hashCode(this.outlineColor)) * 31 + Objects.hashCode((Object)this.crumblingOverlay);
    }

    public int B() {
        return this.outlineColor;
    }

    public @Nullable class08141 Z() {
        return this.crumblingOverlay;
    }

    public int i() {
        return this.overlayCoords;
    }

    public int u() {
        return this.lightCoords;
    }

    public class06271<? super S> y() {
        return this.model;
    }

    public class01423 N() {
        return this.pose;
    }

    public int R() {
        return this.tintedColor;
    }

    public void iris$set() {
        CapturedRenderingState.INSTANCE.setCurrentEntity(this.z);
        CapturedRenderingState.INSTANCE.setCurrentBlockEntity(this.U);
        CapturedRenderingState.INSTANCE.setCurrentRenderedItem(this.E);
    }

    public boolean iris$wasBE() {
        return this.W;
    }
}

