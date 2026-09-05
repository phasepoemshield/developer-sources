/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.api.ConfigCategory
 *  dev.isxander.yacl3.api.OptionGroup
 *  dev.isxander.yacl3.api.YetAnotherConfigLib
 *  dev.isxander.yacl3.dsl.CategoryDsl
 *  dev.isxander.yacl3.dsl.GroupDsl
 *  kotlin.Metadata
 *  kotlin.Unit
 *  kotlin.jvm.functions.Function0
 *  minecraft.class00392
 */
package dev.isxander.yacl3.dsl;

import dev.isxander.yacl3.api.ConfigCategory;
import dev.isxander.yacl3.api.OptionGroup;
import dev.isxander.yacl3.api.YetAnotherConfigLib;
import dev.isxander.yacl3.dsl.CategoryDsl;
import dev.isxander.yacl3.dsl.GroupDsl;
import dev.isxander.yacl3.dsl.OptionRegistrar;
import dev.isxander.yacl3.dsl.ParentRegistrar;
import java.util.concurrent.CompletableFuture;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import minecraft.class00392;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H&\u00a2\u0006\u0004\b\u0005\u0010\tJ\u001d\u0010\n\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007H&\u00a2\u0006\u0004\b\n\u0010\tJ\u001d\u0010\u000b\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007H&\u00a2\u0006\u0004\b\u000b\u0010\tR\u0014\u0010\u000f\u001a\u00020\f8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\f8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R@\u0010!\u001a.\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0019\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u0017j\u0002`\u001d0\u0017j\u0002`\u001e8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001f\u0010 \u00a8\u0006\"\u00c0\u0006\u0003"}, d2={"Ldev/isxander/yacl3/dsl/RootDsl;", "", "Lnet/minecraft/class_2561;", "component", "", "title", "(Lnet/minecraft/class_2561;)V", "Lkotlin/Function0;", "block", "(Lkotlin/jvm/functions/Function0;)V", "screenInit", "save", "", "getRootKey", "()Ljava/lang/String;", "rootKey", "getRootId", "rootId", "Ljava/util/concurrent/CompletableFuture;", "Ldev/isxander/yacl3/api/YetAnotherConfigLib;", "getThisRoot", "()Ljava/util/concurrent/CompletableFuture;", "thisRoot", "Ldev/isxander/yacl3/dsl/ParentRegistrar;", "Ldev/isxander/yacl3/api/ConfigCategory;", "Ldev/isxander/yacl3/dsl/CategoryDsl;", "Ldev/isxander/yacl3/api/OptionGroup;", "Ldev/isxander/yacl3/dsl/GroupDsl;", "Ldev/isxander/yacl3/dsl/OptionRegistrar;", "Ldev/isxander/yacl3/dsl/GroupRegistrar;", "Ldev/isxander/yacl3/dsl/CategoryRegistrar;", "getCategories", "()Ldev/isxander/yacl3/dsl/ParentRegistrar;", "categories", "yet_another_config_lib_v3"})
public interface RootDsl {
    public void save(Function0<Unit> var1);

    public ParentRegistrar<ConfigCategory, CategoryDsl, ParentRegistrar<OptionGroup, GroupDsl, OptionRegistrar>> getCategories();

    public void title(Function0<? extends class00392> var1);

    public void title(class00392 var1);

    public void screenInit(Function0<Unit> var1);

    public String getRootKey();

    public String getRootId();

    public CompletableFuture<YetAnotherConfigLib> getThisRoot();
}

