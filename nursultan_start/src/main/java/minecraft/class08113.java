/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01028
 *  minecraft.class01583
 *  net.irisshaders.iris.mixinterface.ModelStorage
 *  net.irisshaders.iris.uniforms.CapturedRenderingState
 *  net.irisshaders.iris.vertices.ImmediateState
 *  org.joml.Matrix4f
 */
package minecraft;

import java.util.Objects;
import minecraft.class01028;
import minecraft.class01583;
import net.irisshaders.iris.mixinterface.ModelStorage;
import net.irisshaders.iris.uniforms.CapturedRenderingState;
import net.irisshaders.iris.vertices.ImmediateState;
import org.joml.Matrix4f;

/*
 * Signature claims super is java.lang.Record, not java.lang.Object - discarding signature.
 */
public final class class08113
implements ModelStorage {
    private Matrix4f pose;
    private float x;
    private float y;
    private class01028 string;
    private boolean dropShadow;
    private class01583 displayMode;
    private int lightCoords;
    private int color;
    private int backgroundColor;
    private int outlineColor;
    private int U;
    private int E;
    private int W;
    private boolean m;

    public float L() {
        return this.y;
    }

    public int M() {
        return this.lightCoords;
    }

    public void iris$capture() {
        this.U = CapturedRenderingState.INSTANCE.getCurrentRenderedEntity();
        this.E = CapturedRenderingState.INSTANCE.getCurrentRenderedBlockEntity();
        this.W = CapturedRenderingState.INSTANCE.getCurrentRenderedItem();
        this.m = ImmediateState.isRenderingBEs;
    }

    public class08113(Matrix4f matrix4f, float f, float f2, class01028 class010282, boolean bl, class01583 class015832, int n, int n2, int n3, int n4) {
        this.pose = matrix4f;
        this.x = f;
        this.y = f2;
        this.string = class010282;
        this.dropShadow = bl;
        this.displayMode = class015832;
        this.lightCoords = n;
        this.color = n2;
        this.backgroundColor = n3;
        this.outlineColor = n4;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        return object instanceof class08113 && Objects.equals(this.pose, ((class08113)object).pose) && Float.compare(this.x, ((class08113)object).x) == 0 && Float.compare(this.y, ((class08113)object).y) == 0 && Objects.equals(this.string, ((class08113)object).string) && this.dropShadow == ((class08113)object).dropShadow && Objects.equals(this.displayMode, ((class08113)object).displayMode) && this.lightCoords == ((class08113)object).lightCoords && this.color == ((class08113)object).color && this.backgroundColor == ((class08113)object).backgroundColor && this.outlineColor == ((class08113)object).outlineColor;
    }

    public final String toString() {
        return "class08113[pose=" + Objects.toString(this.pose) + ", x=" + Float.toString(this.x) + ", y=" + Float.toString(this.y) + ", string=" + Objects.toString(this.string) + ", dropShadow=" + Boolean.toString(this.dropShadow) + ", displayMode=" + Objects.toString(this.displayMode) + ", lightCoords=" + Integer.toString(this.lightCoords) + ", color=" + Integer.toString(this.color) + ", backgroundColor=" + Integer.toString(this.backgroundColor) + ", outlineColor=" + Integer.toString(this.outlineColor) + "]";
    }

    public final int hashCode() {
        return (((((((((0 * 31 + Objects.hashCode(this.pose)) * 31 + Float.hashCode(this.x)) * 31 + Float.hashCode(this.y)) * 31 + Objects.hashCode(this.string)) * 31 + Boolean.hashCode(this.dropShadow)) * 31 + Objects.hashCode(this.displayMode)) * 31 + Integer.hashCode(this.lightCoords)) * 31 + Integer.hashCode(this.color)) * 31 + Integer.hashCode(this.backgroundColor)) * 31 + Integer.hashCode(this.outlineColor);
    }

    public int B() {
        return this.color;
    }

    public int Z() {
        return this.backgroundColor;
    }

    public boolean i() {
        return this.dropShadow;
    }

    public int z() {
        return this.outlineColor;
    }

    public class01028 u() {
        return this.string;
    }

    public float y() {
        return this.x;
    }

    public Matrix4f N() {
        return this.pose;
    }

    public class01583 R() {
        return this.displayMode;
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

