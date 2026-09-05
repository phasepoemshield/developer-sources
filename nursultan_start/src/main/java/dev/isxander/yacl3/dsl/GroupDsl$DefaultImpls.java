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
import dev.isxander.yacl3.dsl.GroupDsl;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mv={2, 3, 0}, k=3, xi=48)
public final class GroupDsl$DefaultImpls {
    public static /* synthetic */ void addDefaultText$default(GroupDsl groupDsl, OptionDescription.Builder builder, Integer n, int n2, Object object) {
        GroupDsl.addDefaultText$default(groupDsl, builder, n, n2, object);
    }

    @Deprecated
    public static void addDefaultText(GroupDsl groupDsl, OptionDescription.Builder builder, Integer n) {
        Intrinsics.checkNotNullParameter((Object)builder, (String)"");
        GroupDsl.access$addDefaultText$jd(groupDsl, builder, n);
    }
}

