/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.api.OptionDescription$Builder
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 */
package dev.isxander.yacl3.dsl;

import dev.isxander.yacl3.api.OptionDescription;
import dev.isxander.yacl3.dsl.ButtonOptionDsl;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mv={2, 3, 0}, k=3, xi=48)
public final class ButtonOptionDsl$DefaultImpls {
    public static /* synthetic */ void addDefaultText$default(ButtonOptionDsl buttonOptionDsl, OptionDescription.Builder builder, Integer n, int n2, Object object) {
        ButtonOptionDsl.addDefaultText$default(buttonOptionDsl, builder, n, n2, object);
    }

    @Deprecated
    public static void addDefaultText(ButtonOptionDsl buttonOptionDsl, OptionDescription.Builder builder, Integer n) {
        Intrinsics.checkNotNullParameter((Object)builder, (String)"");
        ButtonOptionDsl.access$addDefaultText$jd(buttonOptionDsl, builder, n);
    }
}

