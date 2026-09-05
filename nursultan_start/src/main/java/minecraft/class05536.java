/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00999
 *  minecraft.class01423
 *  net.irisshaders.iris.mixinterface.ModelStorage
 *  net.irisshaders.iris.uniforms.CapturedRenderingState
 *  net.irisshaders.iris.vertices.ImmediateState
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import java.util.Objects;
import minecraft.class00999;
import minecraft.class01423;
import net.irisshaders.iris.mixinterface.ModelStorage;
import net.irisshaders.iris.uniforms.CapturedRenderingState;
import net.irisshaders.iris.vertices.ImmediateState;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/*
 * Signature claims super is java.lang.Record, not java.lang.Object - discarding signature.
 */
public final class class05536
implements ModelStorage {
    private class01423 pose;
    private class00999 customGeometryRenderer;
    private int L;
    private int u;
    private int i;
    private boolean R;

    public void iris$capture() {
        this.L = CapturedRenderingState.INSTANCE.getCurrentRenderedEntity();
        this.u = CapturedRenderingState.INSTANCE.getCurrentRenderedBlockEntity();
        this.i = CapturedRenderingState.INSTANCE.getCurrentRenderedItem();
        this.R = ImmediateState.isRenderingBEs;
    }

    public class05536(class01423 class014232, class00999 class009992) {
        this.pose = class014232;
        this.customGeometryRenderer = class009992;
        this.N(class014232, class009992, null);
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        return object instanceof class05536 && Objects.equals(this.pose, ((class05536)object).pose) && Objects.equals(this.customGeometryRenderer, ((class05536)object).customGeometryRenderer);
    }

    public final String toString() {
        return "class05536[pose=" + Objects.toString(this.pose) + ", customGeometryRenderer=" + Objects.toString(this.customGeometryRenderer) + "]";
    }

    public final int hashCode() {
        return (0 * 31 + Objects.hashCode(this.pose)) * 31 + Objects.hashCode(this.customGeometryRenderer);
    }

    public class00999 y() {
        return this.customGeometryRenderer;
    }

    private void N(class01423 class014232, class00999 class009992, CallbackInfo callbackInfo) {
        this.iris$capture();
    }

    public class01423 N() {
        return this.pose;
    }

    public void iris$set() {
        CapturedRenderingState.INSTANCE.setCurrentEntity(this.L);
        CapturedRenderingState.INSTANCE.setCurrentBlockEntity(this.u);
        CapturedRenderingState.INSTANCE.setCurrentRenderedItem(this.i);
    }

    public boolean iris$wasBE() {
        return this.R;
    }
}

