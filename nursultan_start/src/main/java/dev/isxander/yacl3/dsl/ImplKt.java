/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.impl.utils.YACLConstants
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  org.slf4j.Logger
 */
package dev.isxander.yacl3.dsl;

import dev.isxander.yacl3.impl.utils.YACLConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.slf4j.Logger;

@Metadata(mv={2, 3, 0}, k=2, xi=48, d1={"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0014\u0010\u0001\u001a\u00020\u00008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0001\u0010\u0002\u00a8\u0006\u0003"}, d2={"Lorg/slf4j/Logger;", "LOGGER", "Lorg/slf4j/Logger;", "yet_another_config_lib_v3"})
public final class ImplKt {
    private static final Logger LOGGER;

    static {
        Logger logger = YACLConstants.LOGGER;
        Intrinsics.checkNotNullExpressionValue((Object)logger, (String)"");
        LOGGER = logger;
    }

    public static final /* synthetic */ Logger access$getLOGGER$p() {
        return LOGGER;
    }
}

