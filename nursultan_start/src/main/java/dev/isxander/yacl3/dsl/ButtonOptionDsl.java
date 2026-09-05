/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.api.ButtonOption
 *  dev.isxander.yacl3.api.ButtonOption$Builder
 *  dev.isxander.yacl3.api.OptionDescription$Builder
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 */
package dev.isxander.yacl3.dsl;

import dev.isxander.yacl3.api.ButtonOption;
import dev.isxander.yacl3.api.OptionDescription;
import dev.isxander.yacl3.dsl.Buildable;
import dev.isxander.yacl3.dsl.ExtensionsKt;
import java.util.concurrent.CompletableFuture;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002J\u001f\u0010\b\u001a\u00020\u0007*\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016\u00a2\u0006\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\n8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00108&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0014\u00c0\u0006\u0003"}, d2={"Ldev/isxander/yacl3/dsl/ButtonOptionDsl;", "Ldev/isxander/yacl3/api/ButtonOption$Builder;", "Ldev/isxander/yacl3/dsl/Buildable;", "Ldev/isxander/yacl3/api/ButtonOption;", "Ldev/isxander/yacl3/api/OptionDescription$Builder;", "", "lines", "", "addDefaultText", "(Ldev/isxander/yacl3/api/OptionDescription$Builder;Ljava/lang/Integer;)V", "", "getOptionKey", "()Ljava/lang/String;", "optionKey", "getOptionId", "optionId", "Ljava/util/concurrent/CompletableFuture;", "getThisOption", "()Ljava/util/concurrent/CompletableFuture;", "thisOption", "yet_another_config_lib_v3"})
public interface ButtonOptionDsl
extends ButtonOption.Builder,
Buildable<ButtonOption> {
    public static /* synthetic */ void access$addDefaultText$jd(ButtonOptionDsl buttonOptionDsl, OptionDescription.Builder builder, Integer n) {
        buttonOptionDsl.addDefaultText(builder, n);
    }

    public static /* synthetic */ void addDefaultText$default(ButtonOptionDsl buttonOptionDsl, OptionDescription.Builder builder, Integer n, int n2, Object object) {
        if (object != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addDefaultText");
        }
        if ((n2 & 1) != 0) {
            n = null;
        }
        buttonOptionDsl.addDefaultText(builder, n);
    }

    public String getOptionKey();

    public String getOptionId();

    public CompletableFuture<ButtonOption> getThisOption();

    default public void addDefaultText(OptionDescription.Builder builder, Integer n) {
        Intrinsics.checkNotNullParameter((Object)builder, (String)"");
        ExtensionsKt.addDefaultText(builder, this.getOptionKey() + ".description", n);
    }
}

