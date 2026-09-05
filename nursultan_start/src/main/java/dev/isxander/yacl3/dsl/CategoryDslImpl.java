/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.api.ConfigCategory
 *  dev.isxander.yacl3.api.ConfigCategory$Builder
 *  dev.isxander.yacl3.api.Option
 *  dev.isxander.yacl3.api.OptionGroup
 *  dev.isxander.yacl3.dsl.OptionRegistrar
 *  dev.isxander.yacl3.dsl.OptionRegistrarImpl
 *  dev.isxander.yacl3.dsl.ParentRegistrar
 *  dev.isxander.yacl3.dsl.ParentRegistrarImpl
 *  dev.isxander.yacl3.dsl.RootDsl
 *  dev.isxander.yacl3.dsl.TextLineBuilderDsl
 *  kotlin.Metadata
 *  kotlin.Unit
 *  kotlin.jvm.functions.Function0
 *  kotlin.jvm.functions.Function1
 *  kotlin.jvm.internal.Intrinsics
 *  minecraft.class00392
 */
package dev.isxander.yacl3.dsl;

import dev.isxander.yacl3.api.ConfigCategory;
import dev.isxander.yacl3.api.Option;
import dev.isxander.yacl3.api.OptionGroup;
import dev.isxander.yacl3.dsl.CategoryDsl;
import dev.isxander.yacl3.dsl.GroupDsl;
import dev.isxander.yacl3.dsl.GroupDslImpl;
import dev.isxander.yacl3.dsl.ImplKt;
import dev.isxander.yacl3.dsl.OptionRegistrar;
import dev.isxander.yacl3.dsl.OptionRegistrarImpl;
import dev.isxander.yacl3.dsl.ParentRegistrar;
import dev.isxander.yacl3.dsl.ParentRegistrarImpl;
import dev.isxander.yacl3.dsl.RootDsl;
import dev.isxander.yacl3.dsl.TextLineBuilderDsl;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import minecraft.class00392;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\b\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000e\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r0\t2\u0006\u0010\b\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\b\u000e\u0010\fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0012\u001a\u00020\u00112\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0014H\u0016\u00a2\u0006\u0004\b\u0012\u0010\u0016J(\u0010\u001a\u001a\u00020\u00112\u0017\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00110\u0017\u00a2\u0006\u0002\b\u0019H\u0016\u00a2\u0006\u0004\b\u001a\u0010\u001bJ#\u0010\u001a\u001a\u00020\u00112\u0012\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\u001c\"\u00020\u000fH\u0016\u00a2\u0006\u0004\b\u001a\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016\u00a2\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\b!\u0010\"R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0005\u0010&R\u001a\u0010'\u001a\u00020\u00028\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b'\u0010#\u001a\u0004\b(\u0010%R \u0010)\u001a\b\u0012\u0004\u0012\u00020\u001e0\t8\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R \u0010-\u001a\b\u0012\u0004\u0012\u00020\u001e0\t8\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b-\u0010*\u001a\u0004\b.\u0010,R\u001c\u00101\u001a\n 0*\u0004\u0018\u00010/0/8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b1\u00102R&\u00104\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b4\u00105R*\u00106\u001a\u0018\u0012\u0004\u0012\u00020\u0002\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r0\t038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b6\u00105R0\u0010;\u001a\u0018\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020907j\u0002`:8\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u001a\u0010?\u001a\u0002098\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\u00a8\u0006C"}, d2={"Ldev/isxander/yacl3/dsl/CategoryDslImpl;", "Ldev/isxander/yacl3/dsl/CategoryDsl;", "", "categoryId", "Ldev/isxander/yacl3/dsl/RootDsl;", "parent", "<init>", "(Ljava/lang/String;Ldev/isxander/yacl3/dsl/RootDsl;)V", "id", "Ljava/util/concurrent/CompletableFuture;", "Ldev/isxander/yacl3/dsl/GroupDsl;", "createGroupFuture", "(Ljava/lang/String;)Ljava/util/concurrent/CompletableFuture;", "Ldev/isxander/yacl3/api/Option;", "createRootOptFuture", "Lnet/minecraft/class_2561;", "component", "", "name", "(Lnet/minecraft/class_2561;)V", "Lkotlin/Function0;", "block", "(Lkotlin/jvm/functions/Function0;)V", "Lkotlin/Function1;", "Ldev/isxander/yacl3/dsl/TextLineBuilderDsl;", "Lkotlin/ExtensionFunctionType;", "tooltip", "(Lkotlin/jvm/functions/Function1;)V", "", "([Lnet/minecraft/class_2561;)V", "Ldev/isxander/yacl3/api/ConfigCategory;", "build", "()Ldev/isxander/yacl3/api/ConfigCategory;", "checkUnresolvedFutures", "()V", "Ljava/lang/String;", "getCategoryId", "()Ljava/lang/String;", "Ldev/isxander/yacl3/dsl/RootDsl;", "categoryKey", "getCategoryKey", "thisCategory", "Ljava/util/concurrent/CompletableFuture;", "getThisCategory", "()Ljava/util/concurrent/CompletableFuture;", "built", "getBuilt", "Ldev/isxander/yacl3/api/ConfigCategory$Builder;", "kotlin.jvm.PlatformType", "builder", "Ldev/isxander/yacl3/api/ConfigCategory$Builder;", "", "groupFutures", "Ljava/util/Map;", "rootOptFutures", "Ldev/isxander/yacl3/dsl/ParentRegistrar;", "Ldev/isxander/yacl3/api/OptionGroup;", "Ldev/isxander/yacl3/dsl/OptionRegistrar;", "Ldev/isxander/yacl3/dsl/GroupRegistrar;", "groups", "Ldev/isxander/yacl3/dsl/ParentRegistrar;", "getGroups", "()Ldev/isxander/yacl3/dsl/ParentRegistrar;", "rootOptions", "Ldev/isxander/yacl3/dsl/OptionRegistrar;", "getRootOptions", "()Ldev/isxander/yacl3/dsl/OptionRegistrar;", "yet_another_config_lib_v3"})
public final class CategoryDslImpl
implements CategoryDsl {
    private final String categoryId;
    private final RootDsl parent;
    private final String categoryKey;
    private final CompletableFuture<ConfigCategory> thisCategory;
    private final CompletableFuture<ConfigCategory> built;
    private final ConfigCategory.Builder builder;
    private final Map<String, CompletableFuture<GroupDsl>> groupFutures;
    private final Map<String, CompletableFuture<Option<?>>> rootOptFutures;
    private final ParentRegistrar<OptionGroup, GroupDsl, OptionRegistrar> groups;
    private final OptionRegistrar rootOptions;

    public CategoryDslImpl(String string, RootDsl rootDsl) {
        Intrinsics.checkNotNullParameter((Object)string, (String)"");
        Intrinsics.checkNotNullParameter((Object)rootDsl, (String)"");
        this.categoryId = string;
        this.parent = rootDsl;
        this.categoryKey = this.parent.getRootKey() + ".category." + this.getCategoryId();
        this.thisCategory = new CompletableFuture();
        this.built = this.getThisCategory();
        this.builder = ConfigCategory.createBuilder();
        this.groupFutures = new LinkedHashMap();
        this.rootOptFutures = new LinkedHashMap();
        this.builder.name((class00392)class00392.L((String)this.getCategoryKey()));
        this.groups = (ParentRegistrar)new ParentRegistrarImpl((arg_0, arg_1) -> CategoryDslImpl.groups$lambda$0(this, arg_0, arg_1), arg_0 -> CategoryDslImpl.groups$lambda$1(this, arg_0), arg_0 -> CategoryDslImpl.groups$lambda$2(this, arg_0), arg_0 -> CategoryDslImpl.groups$lambda$3(this, arg_0));
        this.rootOptions = (OptionRegistrar)new OptionRegistrarImpl((arg_0, arg_1) -> CategoryDslImpl.rootOptions$lambda$0(this, arg_0, arg_1), arg_0 -> CategoryDslImpl.rootOptions$lambda$1(this, arg_0), this.getCategoryKey() + ".root");
    }

    @Override
    public void name(Function0<? extends class00392> function0) {
        Intrinsics.checkNotNullParameter(function0, (String)"");
        this.name((class00392)function0.invoke());
    }

    @Override
    public void name(class00392 class003922) {
        Intrinsics.checkNotNullParameter((Object)class003922, (String)"");
        this.builder.name(class003922);
    }

    @Override
    public ConfigCategory build() {
        ConfigCategory configCategory;
        ConfigCategory configCategory2 = configCategory = this.builder.build();
        boolean bl = false;
        this.getThisCategory().complete(configCategory2);
        this.checkUnresolvedFutures();
        ConfigCategory configCategory3 = configCategory;
        Intrinsics.checkNotNullExpressionValue((Object)configCategory3, (String)"");
        return configCategory3;
    }

    @Override
    public void tooltip(class00392 ... class00392Array) {
        Intrinsics.checkNotNullParameter((Object)class00392Array, (String)"");
        this.tooltip((Function1<? super TextLineBuilderDsl, Unit>)((Function1)arg_0 -> CategoryDslImpl.tooltip$lambda$0(class00392Array, arg_0)));
    }

    @Override
    public void tooltip(Function1<? super TextLineBuilderDsl, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, (String)"");
        class00392[] class00392Array = new class00392[]{TextLineBuilderDsl.Companion.createText(function1)};
        this.builder.tooltip(class00392Array);
    }

    @Override
    public ParentRegistrar<OptionGroup, GroupDsl, OptionRegistrar> getGroups() {
        return this.groups;
    }

    private final void checkUnresolvedFutures() {
        boolean bl;
        Object object;
        Map map = this.groupFutures;
        boolean bl2 = false;
        Object object2 = new LinkedHashMap();
        Object object3 = map.entrySet().iterator();
        while (object3.hasNext()) {
            object = object3.next();
            CompletableFuture<GroupDsl> completableFuture = object.getValue();
            bl = false;
            if (!(!completableFuture.isDone())) continue;
            ((HashMap)object2).put(object.getKey(), object.getValue());
        }
        map = (Map)object2;
        bl2 = false;
        object2 = map.entrySet().iterator();
        while (object2.hasNext()) {
            object = object3 = (Map.Entry)object2.next();
            boolean bl3 = false;
            ImplKt.access$getLOGGER$p().error("Future group " + this.getCategoryId() + "/" + object.getKey() + " was referenced but was never built.");
        }
        map = this.rootOptFutures;
        bl2 = false;
        object2 = new LinkedHashMap<String, CompletableFuture<GroupDsl>>();
        object3 = map.entrySet().iterator();
        while (object3.hasNext()) {
            object = object3.next();
            CompletableFuture<Option<?>> completableFuture = object.getValue();
            bl = false;
            if (!(!completableFuture.isDone())) continue;
            ((HashMap)object2).put(object.getKey(), object.getValue());
        }
        map = (Map)object2;
        bl2 = false;
        object2 = map.entrySet().iterator();
        while (object2.hasNext()) {
            object = object3 = (Map.Entry)object2.next();
            boolean bl4 = false;
            ImplKt.access$getLOGGER$p().error("Future option " + this.getCategoryId() + "/root/" + object.getKey() + " was referenced but was never built.");
        }
    }

    private static final Unit rootOptions$lambda$0(CategoryDslImpl categoryDslImpl, Option option, String string) {
        ConfigCategory.Builder builder;
        Intrinsics.checkNotNullParameter((Object)option, (String)"");
        Intrinsics.checkNotNullParameter((Object)string, (String)"");
        ConfigCategory.Builder builder2 = builder = categoryDslImpl.builder.option(option);
        boolean bl = false;
        categoryDslImpl.createRootOptFuture(string).complete(option);
        return Unit.INSTANCE;
    }

    private static final CompletableFuture rootOptions$lambda$1(CategoryDslImpl categoryDslImpl, String string) {
        Intrinsics.checkNotNullParameter((Object)string, (String)"");
        return categoryDslImpl.createRootOptFuture(string);
    }

    private static final CompletableFuture createGroupFuture$lambda$1(Function1 function1, Object object) {
        return (CompletableFuture)function1.invoke(object);
    }

    private final CompletableFuture<Option<?>> createRootOptFuture(String string) {
        CompletableFuture completableFuture = this.rootOptFutures.computeIfAbsent(string, arg_0 -> CategoryDslImpl.createRootOptFuture$lambda$1(CategoryDslImpl::createRootOptFuture$lambda$0, arg_0));
        Intrinsics.checkNotNullExpressionValue((Object)completableFuture, (String)"");
        return completableFuture;
    }

    private static final CompletableFuture createGroupFuture$lambda$0(String string) {
        Intrinsics.checkNotNullParameter((Object)string, (String)"");
        return new CompletableFuture();
    }

    @Override
    public CompletableFuture<ConfigCategory> getBuilt() {
        return this.built;
    }

    @Override
    public String getCategoryId() {
        return this.categoryId;
    }

    private static final CompletableFuture createRootOptFuture$lambda$0(String string) {
        Intrinsics.checkNotNullParameter((Object)string, (String)"");
        return new CompletableFuture();
    }

    private static final CompletableFuture createRootOptFuture$lambda$1(Function1 function1, Object object) {
        return (CompletableFuture)function1.invoke(object);
    }

    @Override
    public String getCategoryKey() {
        return this.categoryKey;
    }

    private static final Unit groups$lambda$0(CategoryDslImpl categoryDslImpl, OptionGroup optionGroup, String string) {
        Intrinsics.checkNotNullParameter((Object)optionGroup, (String)"");
        Intrinsics.checkNotNullParameter((Object)string, (String)"");
        categoryDslImpl.builder.group(optionGroup);
        return Unit.INSTANCE;
    }

    @Override
    public CompletableFuture<ConfigCategory> getThisCategory() {
        return this.thisCategory;
    }

    private static final GroupDsl groups$lambda$1(CategoryDslImpl categoryDslImpl, String string) {
        GroupDslImpl groupDslImpl;
        Intrinsics.checkNotNullParameter((Object)string, (String)"");
        GroupDslImpl groupDslImpl2 = groupDslImpl = new GroupDslImpl(string, categoryDslImpl);
        boolean bl = false;
        categoryDslImpl.createGroupFuture(string).complete(groupDslImpl2);
        return groupDslImpl;
    }

    private static final CompletableFuture groups$lambda$3(CategoryDslImpl categoryDslImpl, String string) {
        Intrinsics.checkNotNullParameter((Object)string, (String)"");
        CompletionStage completionStage = categoryDslImpl.createGroupFuture(string).thenApply(arg_0 -> CategoryDslImpl.groups$lambda$3$1(CategoryDslImpl::groups$lambda$3$0, arg_0));
        Intrinsics.checkNotNullExpressionValue((Object)completionStage, (String)"");
        return completionStage;
    }

    private static final Unit tooltip$lambda$0(class00392[] class00392Array, TextLineBuilderDsl textLineBuilderDsl) {
        Intrinsics.checkNotNullParameter((Object)textLineBuilderDsl, (String)"");
        class00392[] class00392Array2 = class00392Array;
        boolean bl = false;
        int n = class00392Array2.length;
        for (int i = 0; i < n; ++i) {
            class00392 class003922;
            class00392 class003923 = class003922 = class00392Array2[i];
            boolean bl2 = false;
            textLineBuilderDsl.unaryPlus(class003923);
        }
        return Unit.INSTANCE;
    }

    private static final CompletionStage groups$lambda$2$0(GroupDsl groupDsl) {
        return groupDsl.getBuilt();
    }

    private static final CompletableFuture groups$lambda$2(CategoryDslImpl categoryDslImpl, String string) {
        Intrinsics.checkNotNullParameter((Object)string, (String)"");
        CompletionStage completionStage = categoryDslImpl.createGroupFuture(string).thenCompose(arg_0 -> CategoryDslImpl.groups$lambda$2$1(CategoryDslImpl::groups$lambda$2$0, arg_0));
        Intrinsics.checkNotNullExpressionValue((Object)completionStage, (String)"");
        return completionStage;
    }

    private static final OptionRegistrar groups$lambda$3$0(GroupDsl groupDsl) {
        return groupDsl.getOptions();
    }

    @Override
    public OptionRegistrar getRootOptions() {
        return this.rootOptions;
    }

    private static final OptionRegistrar groups$lambda$3$1(Function1 function1, Object object) {
        return (OptionRegistrar)function1.invoke(object);
    }

    private static final CompletionStage groups$lambda$2$1(Function1 function1, Object object) {
        return (CompletionStage)function1.invoke(object);
    }

    private final CompletableFuture<GroupDsl> createGroupFuture(String string) {
        CompletableFuture completableFuture = this.groupFutures.computeIfAbsent(string, arg_0 -> CategoryDslImpl.createGroupFuture$lambda$1(CategoryDslImpl::createGroupFuture$lambda$0, arg_0));
        Intrinsics.checkNotNullExpressionValue((Object)completableFuture, (String)"");
        return completableFuture;
    }
}

