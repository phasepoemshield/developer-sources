/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.Unit
 *  kotlin.jvm.functions.Function0
 *  kotlin.jvm.functions.Function1
 *  kotlin.jvm.internal.Intrinsics
 *  minecraft.class00392
 */
package dev.isxander.yacl3.dsl;

import dev.isxander.yacl3.dsl.TextLineBuilderDsl;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import minecraft.class00392;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\b\t\u0010\nJ\u001d\u0010\t\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bH\u0016\u00a2\u0006\u0004\b\t\u0010\rJ\u0014\u0010\u000e\u001a\u00020\u0004*\u00020\u0003H\u0096\u0002\u00a2\u0006\u0004\b\u000e\u0010\nR \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0005\u0010\u000f\u00a8\u0006\u0010"}, d2={"Ldev/isxander/yacl3/dsl/TextLineBuilderDsl$Delegate;", "Ldev/isxander/yacl3/dsl/TextLineBuilderDsl;", "Lkotlin/Function1;", "Lnet/minecraft/class_2561;", "", "tooltipFunction", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "component", "text", "(Lnet/minecraft/class_2561;)V", "Lkotlin/Function0;", "block", "(Lkotlin/jvm/functions/Function0;)V", "unaryPlus", "Lkotlin/jvm/functions/Function1;", "yet_another_config_lib_v3"})
public final class TextLineBuilderDsl$Delegate
implements TextLineBuilderDsl {
    private final Function1<class00392, Unit> tooltipFunction;

    public TextLineBuilderDsl$Delegate(Function1<? super class00392, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, (String)"");
        this.tooltipFunction = function1;
    }

    @Override
    public void text(Function0<? extends class00392> function0) {
        Intrinsics.checkNotNullParameter(function0, (String)"");
        this.text((class00392)function0.invoke());
    }

    @Override
    public void text(class00392 class003922) {
        Intrinsics.checkNotNullParameter((Object)class003922, (String)"");
        this.tooltipFunction.invoke((Object)class003922);
    }

    @Override
    public void unaryPlus(class00392 class003922) {
        Intrinsics.checkNotNullParameter((Object)class003922, (String)"");
        this.text(class003922);
    }
}

