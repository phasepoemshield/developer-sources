/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.api.ButtonOption
 *  dev.isxander.yacl3.api.ButtonOption$Builder
 *  dev.isxander.yacl3.api.OptionDescription
 *  dev.isxander.yacl3.api.OptionDescription$Builder
 *  dev.isxander.yacl3.gui.YACLScreen
 *  kotlin.Deprecated
 *  kotlin.Metadata
 *  kotlin.jvm.internal.DefaultConstructorMarker
 *  kotlin.jvm.internal.Intrinsics
 *  minecraft.class00392
 */
package dev.isxander.yacl3.dsl;

import dev.isxander.yacl3.api.ButtonOption;
import dev.isxander.yacl3.api.OptionDescription;
import dev.isxander.yacl3.dsl.ButtonOptionDsl;
import dev.isxander.yacl3.dsl.ExtensionsKt;
import dev.isxander.yacl3.gui.YACLScreen;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import minecraft.class00392;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f*\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016\u00a2\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\b\u0010\u0010\u0011JH\u0010\u0017\u001a\n \u0014*\u0004\u0018\u00010\u00020\u00022.\b\u0001\u0010\u0017\u001a(\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\u00130\u0013\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\u000f0\u000f0\u0012\u00a2\u0006\u0002\b\u0015\u00a2\u0006\u0002\b\u0016H\u0096\u0001\u00a2\u0006\u0004\b\u0017\u0010\u0018J:\u0010\u0017\u001a\n \u0014*\u0004\u0018\u00010\u00020\u00022 \b\u0001\u0010\u0017\u001a\u001a\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\u00130\u00130\u0019\u00a2\u0006\u0002\b\u0015\u00a2\u0006\u0002\b\u0016H\u0097\u0001\u00a2\u0006\u0004\b\u0017\u0010\u001aJ \u0010\u001c\u001a\n \u0014*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001bH\u0096\u0001\u00a2\u0006\u0004\b\u001c\u0010\u001dJ,\u0010\u001f\u001a\n \u0014*\u0004\u0018\u00010\u00020\u00022\u0012\b\u0001\u0010\u001f\u001a\f0\u001e\u00a2\u0006\u0002\b\u0015\u00a2\u0006\u0002\b\u0016H\u0096\u0001\u00a2\u0006\u0004\b\u001f\u0010 J,\u0010\"\u001a\n \u0014*\u0004\u0018\u00010\u00020\u00022\u0012\b\u0001\u0010\"\u001a\f0!\u00a2\u0006\u0002\b\u0015\u00a2\u0006\u0002\b\u0016H\u0096\u0001\u00a2\u0006\u0004\b\"\u0010#J,\u0010$\u001a\n \u0014*\u0004\u0018\u00010\u00020\u00022\u0012\b\u0001\u0010$\u001a\f0!\u00a2\u0006\u0002\b\u0015\u00a2\u0006\u0002\b\u0016H\u0096\u0001\u00a2\u0006\u0004\b$\u0010#R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b&\u0010'R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0006\u0010(R\u001a\u0010)\u001a\u00020\u00038\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b)\u0010%\u001a\u0004\b*\u0010'R \u0010,\u001a\b\u0012\u0004\u0012\u00020\u000f0+8\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R \u00100\u001a\b\u0012\u0004\u0012\u00020\u000f0+8\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b0\u0010-\u001a\u0004\b1\u0010/\u00a8\u00062"}, d2={"Ldev/isxander/yacl3/dsl/ButtonOptionDslImpl;", "Ldev/isxander/yacl3/dsl/ButtonOptionDsl;", "Ldev/isxander/yacl3/api/ButtonOption$Builder;", "", "optionId", "groupKey", "builder", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ldev/isxander/yacl3/api/ButtonOption$Builder;)V", "Ldev/isxander/yacl3/api/OptionDescription$Builder;", "", "lines", "", "addDefaultText", "(Ldev/isxander/yacl3/api/OptionDescription$Builder;Ljava/lang/Integer;)V", "Ldev/isxander/yacl3/api/ButtonOption;", "build", "()Ldev/isxander/yacl3/api/ButtonOption;", "Ljava/util/function/BiConsumer;", "Ldev/isxander/yacl3/gui/YACLScreen;", "kotlin.jvm.PlatformType", "Lorg/jetbrains/annotations/NotNull;", "Lkotlin/jvm/internal/EnhancedNullability;", "action", "(Ljava/util/function/BiConsumer;)Ldev/isxander/yacl3/api/ButtonOption$Builder;", "Ljava/util/function/Consumer;", "(Ljava/util/function/Consumer;)Ldev/isxander/yacl3/api/ButtonOption$Builder;", "", "available", "(Z)Ldev/isxander/yacl3/api/ButtonOption$Builder;", "Ldev/isxander/yacl3/api/OptionDescription;", "description", "(Ldev/isxander/yacl3/api/OptionDescription;)Ldev/isxander/yacl3/api/ButtonOption$Builder;", "Lnet/minecraft/class_2561;", "name", "(Lnet/minecraft/class_2561;)Ldev/isxander/yacl3/api/ButtonOption$Builder;", "text", "Ljava/lang/String;", "getOptionId", "()Ljava/lang/String;", "Ldev/isxander/yacl3/api/ButtonOption$Builder;", "optionKey", "getOptionKey", "Ljava/util/concurrent/CompletableFuture;", "thisOption", "Ljava/util/concurrent/CompletableFuture;", "getThisOption", "()Ljava/util/concurrent/CompletableFuture;", "built", "getBuilt", "yet_another_config_lib_v3"})
public final class ButtonOptionDslImpl
implements ButtonOption.Builder,
ButtonOptionDsl {
    private final String optionId;
    private final ButtonOption.Builder builder;
    private final String optionKey;
    private final CompletableFuture<ButtonOption> thisOption;
    private final CompletableFuture<ButtonOption> built;

    public ButtonOption.Builder description(OptionDescription optionDescription) {
        Intrinsics.checkNotNullParameter((Object)optionDescription, (String)"");
        return this.builder.description(optionDescription);
    }

    public ButtonOptionDslImpl(String string, String string2, ButtonOption.Builder builder) {
        Intrinsics.checkNotNullParameter((Object)string, (String)"");
        Intrinsics.checkNotNullParameter((Object)string2, (String)"");
        Intrinsics.checkNotNullParameter((Object)builder, (String)"");
        this.optionId = string;
        this.builder = builder;
        this.optionKey = string2 + ".option." + this.getOptionId();
        this.thisOption = new CompletableFuture();
        this.built = this.getThisOption();
        this.builder.name((class00392)class00392.L((String)this.getOptionKey()));
    }

    public /* synthetic */ ButtonOptionDslImpl(String string, String string2, ButtonOption.Builder builder, int n, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 4) != 0) {
            ButtonOption.Builder builder2 = ButtonOption.createBuilder();
            Intrinsics.checkNotNullExpressionValue((Object)builder2, (String)"");
            builder = builder2;
        }
        this(string, string2, builder);
    }

    public ButtonOption.Builder name(class00392 class003922) {
        Intrinsics.checkNotNullParameter((Object)class003922, (String)"");
        return this.builder.name(class003922);
    }

    @Deprecated(message="Deprecated in Java")
    public ButtonOption.Builder action(Consumer<YACLScreen> consumer) {
        Intrinsics.checkNotNullParameter(consumer, (String)"");
        return this.builder.action(consumer);
    }

    public ButtonOption.Builder action(BiConsumer<YACLScreen, ButtonOption> biConsumer) {
        Intrinsics.checkNotNullParameter(biConsumer, (String)"");
        return this.builder.action(biConsumer);
    }

    public ButtonOption.Builder available(boolean bl) {
        return this.builder.available(bl);
    }

    @Override
    public ButtonOption build() {
        ButtonOption buttonOption;
        ButtonOption buttonOption2 = buttonOption = this.builder.build();
        boolean bl = false;
        this.getThisOption().complete(buttonOption2);
        ButtonOption buttonOption3 = buttonOption;
        Intrinsics.checkNotNullExpressionValue((Object)buttonOption3, (String)"");
        return buttonOption3;
    }

    public ButtonOption.Builder text(class00392 class003922) {
        Intrinsics.checkNotNullParameter((Object)class003922, (String)"");
        return this.builder.text(class003922);
    }

    @Override
    public CompletableFuture<ButtonOption> getBuilt() {
        return this.built;
    }

    @Override
    public String getOptionKey() {
        return this.optionKey;
    }

    @Override
    public String getOptionId() {
        return this.optionId;
    }

    @Override
    public CompletableFuture<ButtonOption> getThisOption() {
        return this.thisOption;
    }

    @Override
    public void addDefaultText(OptionDescription.Builder builder, Integer n) {
        Intrinsics.checkNotNullParameter((Object)builder, (String)"");
        ExtensionsKt.addDefaultText(builder, this.getOptionKey() + ".description", n);
    }
}

