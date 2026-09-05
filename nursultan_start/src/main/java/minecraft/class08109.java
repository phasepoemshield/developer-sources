/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01423
 *  minecraft.class02022
 *  minecraft.class03662
 *  minecraft.class07311
 *  minecraft.class08915
 *  net.irisshaders.iris.mixinterface.ModelStorage
 *  net.irisshaders.iris.uniforms.CapturedRenderingState
 *  net.irisshaders.iris.vertices.ImmediateState
 */
package minecraft;

import java.util.List;
import java.util.Objects;
import minecraft.class01423;
import minecraft.class02022;
import minecraft.class03662;
import minecraft.class07311;
import minecraft.class08915;
import net.irisshaders.iris.mixinterface.ModelStorage;
import net.irisshaders.iris.uniforms.CapturedRenderingState;
import net.irisshaders.iris.vertices.ImmediateState;

/*
 * Signature claims super is java.lang.Record, not java.lang.Object - discarding signature.
 */
public final class class08109
implements ModelStorage {
    private class01423 pose;
    private class03662 displayContext;
    private int lightCoords;
    private int overlayCoords;
    private int outlineColor;
    private int[] tintLayers;
    private List<class02022> quads;
    private class07311 renderType;
    private class08915 foilType;
    private int z;
    private int U;
    private int E;
    private boolean W;

    public int L() {
        return this.lightCoords;
    }

    public List<class02022> M() {
        return this.quads;
    }

    public void iris$capture() {
        this.z = CapturedRenderingState.INSTANCE.getCurrentRenderedEntity();
        this.U = CapturedRenderingState.INSTANCE.getCurrentRenderedBlockEntity();
        this.E = CapturedRenderingState.INSTANCE.getCurrentRenderedItem();
        this.W = ImmediateState.isRenderingBEs;
    }

    public class08109(class01423 class014232, class03662 class036622, int n, int n2, int n3, int[] nArray, List<class02022> list, class07311 class073112, class08915 class089152) {
        this.pose = class014232;
        this.displayContext = class036622;
        this.lightCoords = n;
        this.overlayCoords = n2;
        this.outlineColor = n3;
        this.tintLayers = nArray;
        this.quads = list;
        this.renderType = class073112;
        this.foilType = class089152;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        return object instanceof class08109 && Objects.equals(this.pose, ((class08109)object).pose) && Objects.equals(this.displayContext, ((class08109)object).displayContext) && this.lightCoords == ((class08109)object).lightCoords && this.overlayCoords == ((class08109)object).overlayCoords && this.outlineColor == ((class08109)object).outlineColor && Objects.equals(this.tintLayers, ((class08109)object).tintLayers) && Objects.equals(this.quads, ((class08109)object).quads) && Objects.equals(this.renderType, ((class08109)object).renderType) && Objects.equals(this.foilType, ((class08109)object).foilType);
    }

    public final String toString() {
        return "class08109[pose=" + Objects.toString(this.pose) + ", displayContext=" + Objects.toString(this.displayContext) + ", lightCoords=" + Integer.toString(this.lightCoords) + ", overlayCoords=" + Integer.toString(this.overlayCoords) + ", outlineColor=" + Integer.toString(this.outlineColor) + ", tintLayers=" + Objects.toString(this.tintLayers) + ", quads=" + Objects.toString(this.quads) + ", renderType=" + Objects.toString(this.renderType) + ", foilType=" + Objects.toString(this.foilType) + "]";
    }

    public final int hashCode() {
        return ((((((((0 * 31 + Objects.hashCode(this.pose)) * 31 + Objects.hashCode(this.displayContext)) * 31 + Integer.hashCode(this.lightCoords)) * 31 + Integer.hashCode(this.overlayCoords)) * 31 + Integer.hashCode(this.outlineColor)) * 31 + Objects.hashCode(this.tintLayers)) * 31 + Objects.hashCode(this.quads)) * 31 + Objects.hashCode(this.renderType)) * 31 + Objects.hashCode(this.foilType);
    }

    public class07311 B() {
        return this.renderType;
    }

    public class08915 Z() {
        return this.foilType;
    }

    public int i() {
        return this.outlineColor;
    }

    public int u() {
        return this.overlayCoords;
    }

    public class03662 y() {
        return this.displayContext;
    }

    public class01423 N() {
        return this.pose;
    }

    public int[] R() {
        return this.tintLayers;
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

