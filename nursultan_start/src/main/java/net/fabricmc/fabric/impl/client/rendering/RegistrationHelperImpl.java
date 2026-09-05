/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class06078
 *  minecraft.class06249
 *  minecraft.class08800
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.rendering.v1.LivingEntityFeatureRendererRegistrationCallback$RegistrationHelper
 */
package net.fabricmc.fabric.impl.client.rendering;

import java.util.Objects;
import java.util.function.Function;
import minecraft.class06078;
import minecraft.class06249;
import minecraft.class08800;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.LivingEntityFeatureRendererRegistrationCallback;

@Environment(value=EnvType.CLIENT)
public final class RegistrationHelperImpl
implements LivingEntityFeatureRendererRegistrationCallback.RegistrationHelper {
    private final Function<class06249<?, ?>, Boolean> delegate;

    public RegistrationHelperImpl(Function<class06249<?, ?>, Boolean> function) {
        this.delegate = function;
    }

    public <T extends class08800> void register(class06249<T, ? extends class06078<T>> class062492) {
        Objects.requireNonNull(class062492, "Feature renderer cannot be null");
        this.delegate.apply(class062492);
    }
}

