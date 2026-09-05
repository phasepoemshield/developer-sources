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
import dev.isxander.yacl3.dsl.OptionDsl;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mv={2, 3, 0}, k=3, xi=48)
public final class OptionDsl$DefaultImpls {
    public static /* synthetic */ void addDefaultText$default(OptionDsl optionDsl, OptionDescription.Builder builder, Integer n, int n2, Object object) {
        OptionDsl.addDefaultText$default(optionDsl, builder, n, n2, object);
    }

    @Deprecated
    public static <T> void addDefaultText(OptionDsl<T> optionDsl, OptionDescription.Builder builder, Integer n) {
        Intrinsics.checkNotNullParameter((Object)builder, (String)"");
        OptionDsl.access$addDefaultText$jd(optionDsl, builder, n);
    }
}

