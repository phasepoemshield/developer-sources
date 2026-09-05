/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap
 *  minecraft.class00494
 *  minecraft.class07209
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.rendering.v1.FabricRenderState
 *  net.fabricmc.fabric.api.client.rendering.v1.RenderStateDataKey
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap;
import java.util.Map;
import java.util.Objects;
import minecraft.class00494;
import minecraft.class07209;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.FabricRenderState;
import net.fabricmc.fabric.api.client.rendering.v1.RenderStateDataKey;
import org.jspecify.annotations.Nullable;

/*
 * Signature claims super is java.lang.Record, not java.lang.Object - discarding signature.
 */
@Environment(value=EnvType.CLIENT)
public final class class06973
implements FabricRenderState {
    private class07209 pos;
    private boolean isTranslucent;
    private boolean highContrast;
    private class00494 shape;
    private @Nullable class00494 collisionShape;
    private @Nullable class00494 occlusionShape;
    private @Nullable class00494 interactionShape;
    private @Nullable Map B;

    public boolean L() {
        return this.highContrast;
    }

    public @Nullable class00494 M() {
        return this.interactionShape;
    }

    public void setData(RenderStateDataKey renderStateDataKey, Object object) {
        if (this.B == null) {
            this.B = new Reference2ObjectOpenHashMap();
        }
        this.B.put(renderStateDataKey, object);
    }

    public class06973(class07209 class072092, boolean bl, boolean bl2, class00494 class004942, @Nullable class00494 class004943, @Nullable class00494 class004944, @Nullable class00494 class004945) {
        this.pos = class072092;
        this.isTranslucent = bl;
        this.highContrast = bl2;
        this.shape = class004942;
        this.collisionShape = class004943;
        this.occlusionShape = class004944;
        this.interactionShape = class004945;
    }

    public class06973(class07209 class072092, boolean bl, boolean bl2, class00494 class004942) {
        this(class072092, bl, bl2, class004942, null, null, null);
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        return object instanceof class06973 && Objects.equals(this.pos, ((class06973)object).pos) && this.isTranslucent == ((class06973)object).isTranslucent && this.highContrast == ((class06973)object).highContrast && Objects.equals(this.shape, ((class06973)object).shape) && Objects.equals(this.collisionShape, ((class06973)object).collisionShape) && Objects.equals(this.occlusionShape, ((class06973)object).occlusionShape) && Objects.equals(this.interactionShape, ((class06973)object).interactionShape);
    }

    public final String toString() {
        return "class06973[pos=" + Objects.toString(this.pos) + ", isTranslucent=" + Boolean.toString(this.isTranslucent) + ", highContrast=" + Boolean.toString(this.highContrast) + ", shape=" + Objects.toString(this.shape) + ", collisionShape=" + Objects.toString(this.collisionShape) + ", occlusionShape=" + Objects.toString(this.occlusionShape) + ", interactionShape=" + Objects.toString(this.interactionShape) + "]";
    }

    public final int hashCode() {
        return ((((((0 * 31 + Objects.hashCode(this.pos)) * 31 + Boolean.hashCode(this.isTranslucent)) * 31 + Boolean.hashCode(this.highContrast)) * 31 + Objects.hashCode(this.shape)) * 31 + Objects.hashCode(this.collisionShape)) * 31 + Objects.hashCode(this.occlusionShape)) * 31 + Objects.hashCode(this.interactionShape);
    }

    public @Nullable class00494 i() {
        return this.collisionShape;
    }

    public class00494 u() {
        return this.shape;
    }

    public boolean y() {
        return this.isTranslucent;
    }

    public class07209 N() {
        return this.pos;
    }

    public @Nullable Object getData(RenderStateDataKey renderStateDataKey) {
        return this.B == null ? null : this.B.get(renderStateDataKey);
    }

    public void clearExtraData() {
        if (this.B != null) {
            this.B.clear();
        }
    }

    public Object getDataOrDefault(RenderStateDataKey renderStateDataKey, Object object) {
        return this.B == null ? object : this.B.getOrDefault(renderStateDataKey, object);
    }

    public @Nullable class00494 R() {
        return this.occlusionShape;
    }
}

