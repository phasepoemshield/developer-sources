/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.functions.Function0
 *  minecraft.class00392
 */
package dev.isxander.yacl3.dsl;

import dev.isxander.yacl3.dsl.TextLineBuilderDsl$Companion;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import minecraft.class00392;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u0000 \u000b2\u00020\u0001:\u0002\f\u000bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H&\u00a2\u0006\u0004\b\u0005\u0010\tJ\u0014\u0010\n\u001a\u00020\u0004*\u00020\u0002H\u00a6\u0002\u00a2\u0006\u0004\b\n\u0010\u0006\u00a8\u0006\r\u00c0\u0006\u0003"}, d2={"Ldev/isxander/yacl3/dsl/TextLineBuilderDsl;", "", "Lnet/minecraft/class_2561;", "component", "", "text", "(Lnet/minecraft/class_2561;)V", "Lkotlin/Function0;", "block", "(Lkotlin/jvm/functions/Function0;)V", "unaryPlus", "Companion", "Delegate", "yet_another_config_lib_v3"})
public interface TextLineBuilderDsl {
    public static final TextLineBuilderDsl$Companion Companion = TextLineBuilderDsl$Companion.$$INSTANCE;

    public void text(class00392 var1);

    public void text(Function0<? extends class00392> var1);

    public void unaryPlus(class00392 var1);
}

