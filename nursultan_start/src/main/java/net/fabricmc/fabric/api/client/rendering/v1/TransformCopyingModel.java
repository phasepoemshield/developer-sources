/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Pair
 *  minecraft.class06271
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package net.fabricmc.fabric.api.client.rendering.v1;

import com.mojang.datafixers.util.Pair;
import minecraft.class06271;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(value=EnvType.CLIENT)
public final class TransformCopyingModel<S, D>
extends class06271<Pair<S, D>> {
    private final class06271<? super S> source;
    private final class06271<? super D> delegate;
    private final boolean setDelegateAngles;

    public static <S, D> TransformCopyingModel<S, D> create(class06271<? super S> class062712, class06271<? super D> class062713, boolean bl) {
        return new TransformCopyingModel<S, D>(class062712, class062713, bl);
    }

    private TransformCopyingModel(class06271<? super S> class062712, class06271<? super D> class062713, boolean bl) {
        super(class062713.method_63512(), arg_0 -> class062713.method_23500(arg_0));
        this.source = class062712;
        this.delegate = class062713;
        this.setDelegateAngles = bl;
    }

    public void setupAnim(Pair<S, D> pair) {
        this.method_63514();
        this.source.method_2819(pair.getFirst());
        this.delegate.copyTransforms(this.source);
        if (this.setDelegateAngles) {
            this.delegate.method_2819(pair.getSecond());
        }
    }

    public /* synthetic */ void method_2819(Object object) {
        this.setupAnim((Pair)object);
    }
}

