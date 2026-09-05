/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.api.ConfigCategory
 *  dev.isxander.yacl3.api.OptionGroup
 *  dev.isxander.yacl3.dsl.OptionRegistrar
 *  dev.isxander.yacl3.dsl.ParentRegistrar
 *  dev.isxander.yacl3.dsl.TextLineBuilderDsl
 *  kotlin.Metadata
 *  kotlin.Unit
 *  kotlin.jvm.functions.Function0
 *  kotlin.jvm.functions.Function1
 *  minecraft.class00392
 */
package dev.isxander.yacl3.dsl;

import dev.isxander.yacl3.api.ConfigCategory;
import dev.isxander.yacl3.api.OptionGroup;
import dev.isxander.yacl3.dsl.Buildable;
import dev.isxander.yacl3.dsl.GroupDsl;
import dev.isxander.yacl3.dsl.OptionRegistrar;
import dev.isxander.yacl3.dsl.ParentRegistrar;
import dev.isxander.yacl3.dsl.TextLineBuilderDsl;
import java.util.concurrent.CompletableFuture;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import minecraft.class00392;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H&\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\bH&\u00a2\u0006\u0004\b\u0006\u0010\nJ#\u0010\f\u001a\u00020\u00052\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u000b\"\u00020\u0003H&\u00a2\u0006\u0004\b\f\u0010\rJ(\u0010\f\u001a\u00020\u00052\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\u000e\u00a2\u0006\u0002\b\u0010H&\u00a2\u0006\u0004\b\f\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00128&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00188&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR*\u0010#\u001a\u0018\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001cj\u0002` 8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010&\u001a\u00020\u001f8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b$\u0010%\u00a8\u0006'\u00c0\u0006\u0003"}, d2={"Ldev/isxander/yacl3/dsl/CategoryDsl;", "Ldev/isxander/yacl3/dsl/Buildable;", "Ldev/isxander/yacl3/api/ConfigCategory;", "Lnet/minecraft/class_2561;", "component", "", "name", "(Lnet/minecraft/class_2561;)V", "Lkotlin/Function0;", "block", "(Lkotlin/jvm/functions/Function0;)V", "", "tooltip", "([Lnet/minecraft/class_2561;)V", "Lkotlin/Function1;", "Ldev/isxander/yacl3/dsl/TextLineBuilderDsl;", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function1;)V", "", "getCategoryKey", "()Ljava/lang/String;", "categoryKey", "getCategoryId", "categoryId", "Ljava/util/concurrent/CompletableFuture;", "getThisCategory", "()Ljava/util/concurrent/CompletableFuture;", "thisCategory", "Ldev/isxander/yacl3/dsl/ParentRegistrar;", "Ldev/isxander/yacl3/api/OptionGroup;", "Ldev/isxander/yacl3/dsl/GroupDsl;", "Ldev/isxander/yacl3/dsl/OptionRegistrar;", "Ldev/isxander/yacl3/dsl/GroupRegistrar;", "getGroups", "()Ldev/isxander/yacl3/dsl/ParentRegistrar;", "groups", "getRootOptions", "()Ldev/isxander/yacl3/dsl/OptionRegistrar;", "rootOptions", "yet_another_config_lib_v3"})
public interface CategoryDsl
extends Buildable<ConfigCategory> {
    public void name(class00392 var1);

    public void name(Function0<? extends class00392> var1);

    public void tooltip(Function1<? super TextLineBuilderDsl, Unit> var1);

    public void tooltip(class00392 ... var1);

    public ParentRegistrar<OptionGroup, GroupDsl, OptionRegistrar> getGroups();

    public String getCategoryId();

    public String getCategoryKey();

    public CompletableFuture<ConfigCategory> getThisCategory();

    public OptionRegistrar getRootOptions();
}

