/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.impl.LabelOptionImpl
 *  dev.isxander.yacl3.impl.LabelOptionImpl$BuilderImpl
 *  minecraft.class00392
 */
package dev.isxander.yacl3.api;

import dev.isxander.yacl3.api.LabelOption$Builder;
import dev.isxander.yacl3.api.Option;
import dev.isxander.yacl3.impl.LabelOptionImpl;
import minecraft.class00392;

public interface LabelOption
extends Option<class00392> {
    public static LabelOption create(class00392 class003922) {
        return new LabelOptionImpl(class003922);
    }

    public class00392 label();

    public static LabelOption$Builder createBuilder() {
        return new LabelOptionImpl.BuilderImpl();
    }
}

