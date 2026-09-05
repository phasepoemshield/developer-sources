/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.Unit
 *  kotlin.jvm.functions.Function1
 *  kotlin.jvm.internal.Intrinsics
 *  kotlin.jvm.internal.Ref$BooleanRef
 *  minecraft.class00392
 *  minecraft.class05216
 *  minecraft.class05220
 */
package dev.isxander.yacl3.dsl;

import dev.isxander.yacl3.dsl.TextLineBuilderDsl;
import dev.isxander.yacl3.dsl.TextLineBuilderDsl$Delegate;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import minecraft.class00392;
import minecraft.class05216;
import minecraft.class05220;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J&\u0010\n\u001a\u00020\t2\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u00a2\u0006\u0002\b\u0007\u00a2\u0006\u0004\b\n\u0010\u000b\u00a8\u0006\f"}, d2={"Ldev/isxander/yacl3/dsl/TextLineBuilderDsl$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Ldev/isxander/yacl3/dsl/TextLineBuilderDsl;", "", "Lkotlin/ExtensionFunctionType;", "block", "Lnet/minecraft/class_2561;", "createText", "(Lkotlin/jvm/functions/Function1;)Lnet/minecraft/class_2561;", "yet_another_config_lib_v3"})
public final class TextLineBuilderDsl$Companion {
    static final /* synthetic */ TextLineBuilderDsl$Companion $$INSTANCE;

    private TextLineBuilderDsl$Companion() {
    }

    static {
        $$INSTANCE = new TextLineBuilderDsl$Companion();
    }

    private static final Unit createText$lambda$0(Ref.BooleanRef booleanRef, class05216 class052162, class00392 class003922) {
        Intrinsics.checkNotNullParameter((Object)class003922, (String)"");
        if (!booleanRef.element) {
            class052162.y(class05220.n);
        }
        class052162.y(class003922);
        booleanRef.element = false;
        return Unit.INSTANCE;
    }

    public final class00392 createText(Function1<? super TextLineBuilderDsl, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, (String)"");
        class05216 class052162 = class00392.i();
        Intrinsics.checkNotNullExpressionValue((Object)class052162, (String)"");
        class05216 class052163 = class052162;
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = true;
        TextLineBuilderDsl$Delegate textLineBuilderDsl$Delegate = new TextLineBuilderDsl$Delegate((Function1<? super class00392, Unit>)((Function1)arg_0 -> TextLineBuilderDsl$Companion.createText$lambda$0(booleanRef, class052163, arg_0)));
        function1.invoke((Object)textLineBuilderDsl$Delegate);
        return (class00392)class052163;
    }
}

