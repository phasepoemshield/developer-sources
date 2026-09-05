/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.api.OptionDescription
 *  dev.isxander.yacl3.api.OptionDescription$Builder
 *  dev.isxander.yacl3.api.OptionGroup
 *  dev.isxander.yacl3.dsl.OptionRegistrar
 *  kotlin.Metadata
 *  kotlin.Unit
 *  kotlin.jvm.functions.Function0
 *  kotlin.jvm.functions.Function1
 *  kotlin.jvm.internal.Intrinsics
 *  minecraft.class00392
 */
package dev.isxander.yacl3.dsl;

import dev.isxander.yacl3.api.OptionDescription;
import dev.isxander.yacl3.api.OptionGroup;
import dev.isxander.yacl3.dsl.Buildable;
import dev.isxander.yacl3.dsl.ExtensionsKt;
import dev.isxander.yacl3.dsl.OptionRegistrar;
import java.util.concurrent.CompletableFuture;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import minecraft.class00392;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H&\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\bH&\u00a2\u0006\u0004\b\u0006\u0010\nJ\u0017\u0010\f\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH&\u00a2\u0006\u0004\b\f\u0010\rJ(\u0010\u0011\u001a\u00020\u00052\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\u000e\u00a2\u0006\u0002\b\u0010H&\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\u0005*\u00020\u000f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0017H&\u00a2\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001a8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u001a8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001e\u0010\u001cR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020 8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b%\u0010&R\u001c\u0010\u0018\u001a\u00020\u00178&@&X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b(\u0010)\"\u0004\b*\u0010\u0019\u00a8\u0006+\u00c0\u0006\u0003"}, d2={"Ldev/isxander/yacl3/dsl/GroupDsl;", "Ldev/isxander/yacl3/dsl/Buildable;", "Ldev/isxander/yacl3/api/OptionGroup;", "Lnet/minecraft/class_2561;", "component", "", "name", "(Lnet/minecraft/class_2561;)V", "Lkotlin/Function0;", "block", "(Lkotlin/jvm/functions/Function0;)V", "Ldev/isxander/yacl3/api/OptionDescription;", "description", "(Ldev/isxander/yacl3/api/OptionDescription;)V", "Lkotlin/Function1;", "Ldev/isxander/yacl3/api/OptionDescription$Builder;", "Lkotlin/ExtensionFunctionType;", "descriptionBuilder", "(Lkotlin/jvm/functions/Function1;)V", "", "lines", "addDefaultText", "(Ldev/isxander/yacl3/api/OptionDescription$Builder;Ljava/lang/Integer;)V", "", "collapsed", "(Z)V", "", "getGroupKey", "()Ljava/lang/String;", "groupKey", "getGroupId", "groupId", "Ljava/util/concurrent/CompletableFuture;", "getThisGroup", "()Ljava/util/concurrent/CompletableFuture;", "thisGroup", "Ldev/isxander/yacl3/dsl/OptionRegistrar;", "getOptions", "()Ldev/isxander/yacl3/dsl/OptionRegistrar;", "options", "getCollapsed", "()Z", "setCollapsed", "yet_another_config_lib_v3"})
public interface GroupDsl
extends Buildable<OptionGroup> {
    public void description(OptionDescription var1);

    public OptionRegistrar getOptions();

    public void name(Function0<? extends class00392> var1);

    public void name(class00392 var1);

    public static /* synthetic */ void access$addDefaultText$jd(GroupDsl groupDsl, OptionDescription.Builder builder, Integer n) {
        groupDsl.addDefaultText(builder, n);
    }

    public static /* synthetic */ void addDefaultText$default(GroupDsl groupDsl, OptionDescription.Builder builder, Integer n, int n2, Object object) {
        if (object != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addDefaultText");
        }
        if ((n2 & 1) != 0) {
            n = null;
        }
        groupDsl.addDefaultText(builder, n);
    }

    public void collapsed(boolean var1);

    public String getGroupId();

    public void descriptionBuilder(Function1<? super OptionDescription.Builder, Unit> var1);

    public String getGroupKey();

    public CompletableFuture<OptionGroup> getThisGroup();

    public boolean getCollapsed();

    public void setCollapsed(boolean var1);

    default public void addDefaultText(OptionDescription.Builder builder, Integer n) {
        Intrinsics.checkNotNullParameter((Object)builder, (String)"");
        ExtensionsKt.addDefaultText(builder, this.getGroupKey() + ".description", n);
    }
}

