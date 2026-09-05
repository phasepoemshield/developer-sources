/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.api.Option
 *  dev.isxander.yacl3.api.Option$Builder
 *  dev.isxander.yacl3.api.OptionDescription$Builder
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 */
package dev.isxander.yacl3.dsl;

import dev.isxander.yacl3.api.Option;
import dev.isxander.yacl3.api.OptionDescription;
import dev.isxander.yacl3.dsl.Buildable;
import dev.isxander.yacl3.dsl.ExtensionsKt;
import java.util.concurrent.CompletableFuture;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003J\u001f\u0010\t\u001a\u00020\b*\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016\u00a2\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000b8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\rR \u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00118&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006\u0015\u00c0\u0006\u0003"}, d2={"Ldev/isxander/yacl3/dsl/OptionDsl;", "T", "Ldev/isxander/yacl3/api/Option$Builder;", "Ldev/isxander/yacl3/dsl/Buildable;", "Ldev/isxander/yacl3/api/Option;", "Ldev/isxander/yacl3/api/OptionDescription$Builder;", "", "lines", "", "addDefaultText", "(Ldev/isxander/yacl3/api/OptionDescription$Builder;Ljava/lang/Integer;)V", "", "getOptionKey", "()Ljava/lang/String;", "optionKey", "getOptionId", "optionId", "Ljava/util/concurrent/CompletableFuture;", "getThisOption", "()Ljava/util/concurrent/CompletableFuture;", "thisOption", "yet_another_config_lib_v3"})
public interface OptionDsl<T>
extends Option.Builder<T>,
Buildable<Option<T>> {
    public static /* synthetic */ void access$addDefaultText$jd(OptionDsl optionDsl, OptionDescription.Builder builder, Integer n) {
        optionDsl.addDefaultText(builder, n);
    }

    public static /* synthetic */ void addDefaultText$default(OptionDsl optionDsl, OptionDescription.Builder builder, Integer n, int n2, Object object) {
        if (object != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addDefaultText");
        }
        if ((n2 & 1) != 0) {
            n = null;
        }
        optionDsl.addDefaultText(builder, n);
    }

    public String getOptionKey();

    public String getOptionId();

    public CompletableFuture<Option<T>> getThisOption();

    default public void addDefaultText(OptionDescription.Builder builder, Integer n) {
        Intrinsics.checkNotNullParameter((Object)builder, (String)"");
        ExtensionsKt.addDefaultText(builder, this.getOptionKey() + ".description", n);
    }
}

