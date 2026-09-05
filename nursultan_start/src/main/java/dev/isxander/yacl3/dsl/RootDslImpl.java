/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.api.ConfigCategory
 *  dev.isxander.yacl3.api.OptionGroup
 *  dev.isxander.yacl3.api.YetAnotherConfigLib
 *  dev.isxander.yacl3.api.YetAnotherConfigLib$Builder
 *  dev.isxander.yacl3.dsl.Buildable
 *  dev.isxander.yacl3.dsl.CategoryDsl
 *  dev.isxander.yacl3.dsl.CategoryDslImpl
 *  dev.isxander.yacl3.dsl.GroupDsl
 *  dev.isxander.yacl3.dsl.ImplKt
 *  kotlin.Metadata
 *  kotlin.Unit
 *  kotlin.jvm.functions.Function0
 *  kotlin.jvm.functions.Function1
 *  kotlin.jvm.internal.Intrinsics
 *  minecraft.class00392
 */
package dev.isxander.yacl3.dsl;

import dev.isxander.yacl3.api.ConfigCategory;
import dev.isxander.yacl3.api.OptionGroup;
import dev.isxander.yacl3.api.YetAnotherConfigLib;
import dev.isxander.yacl3.dsl.Buildable;
import dev.isxander.yacl3.dsl.CategoryDsl;
import dev.isxander.yacl3.dsl.CategoryDslImpl;
import dev.isxander.yacl3.dsl.GroupDsl;
import dev.isxander.yacl3.dsl.ImplKt;
import dev.isxander.yacl3.dsl.OptionRegistrar;
import dev.isxander.yacl3.dsl.ParentRegistrar;
import dev.isxander.yacl3.dsl.ParentRegistrarImpl;
import dev.isxander.yacl3.dsl.RootDsl;
import dev.isxander.yacl3.gui.YACLScreen;
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

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\b\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u0012H\u0016\u00a2\u0006\u0004\b\u0010\u0010\u0014J\u001d\u0010\u0015\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0012H\u0016\u00a2\u0006\u0004\b\u0015\u0010\u0014J\u001d\u0010\u0016\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0012H\u0016\u00a2\u0006\u0004\b\u0016\u0010\u0014J\u000f\u0010\u0017\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u00048\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR \u0010 \u001a\b\u0012\u0004\u0012\u00020\u00030\t8\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R \u0010$\u001a\b\u0012\u0004\u0012\u00020\u00030\t8\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010#R\u001c\u0010(\u001a\n '*\u0004\u0018\u00010&0&8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b(\u0010)R&\u0010+\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0*8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b+\u0010,RF\u00104\u001a.\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\n\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u0002010-j\u0002`20-j\u0002`38\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107\u00a8\u00068"}, d2={"Ldev/isxander/yacl3/dsl/RootDslImpl;", "Ldev/isxander/yacl3/dsl/RootDsl;", "Ldev/isxander/yacl3/dsl/Buildable;", "Ldev/isxander/yacl3/api/YetAnotherConfigLib;", "", "rootId", "<init>", "(Ljava/lang/String;)V", "id", "Ljava/util/concurrent/CompletableFuture;", "Ldev/isxander/yacl3/dsl/CategoryDsl;", "createFuture", "(Ljava/lang/String;)Ljava/util/concurrent/CompletableFuture;", "Lnet/minecraft/class_2561;", "component", "", "title", "(Lnet/minecraft/class_2561;)V", "Lkotlin/Function0;", "block", "(Lkotlin/jvm/functions/Function0;)V", "screenInit", "save", "build", "()Ldev/isxander/yacl3/api/YetAnotherConfigLib;", "checkUnresolvedFutures", "()V", "Ljava/lang/String;", "getRootId", "()Ljava/lang/String;", "rootKey", "getRootKey", "thisRoot", "Ljava/util/concurrent/CompletableFuture;", "getThisRoot", "()Ljava/util/concurrent/CompletableFuture;", "built", "getBuilt", "Ldev/isxander/yacl3/api/YetAnotherConfigLib$Builder;", "kotlin.jvm.PlatformType", "builder", "Ldev/isxander/yacl3/api/YetAnotherConfigLib$Builder;", "", "categoryFutures", "Ljava/util/Map;", "Ldev/isxander/yacl3/dsl/ParentRegistrar;", "Ldev/isxander/yacl3/api/ConfigCategory;", "Ldev/isxander/yacl3/api/OptionGroup;", "Ldev/isxander/yacl3/dsl/GroupDsl;", "Ldev/isxander/yacl3/dsl/OptionRegistrar;", "Ldev/isxander/yacl3/dsl/GroupRegistrar;", "Ldev/isxander/yacl3/dsl/CategoryRegistrar;", "categories", "Ldev/isxander/yacl3/dsl/ParentRegistrar;", "getCategories", "()Ldev/isxander/yacl3/dsl/ParentRegistrar;", "yet_another_config_lib_v3"})
public final class RootDslImpl
implements Buildable<YetAnotherConfigLib>,
RootDsl {
    private final String rootId;
    private final String rootKey;
    private final CompletableFuture<YetAnotherConfigLib> thisRoot;
    private final CompletableFuture<YetAnotherConfigLib> built;
    private final YetAnotherConfigLib.Builder builder;
    private final Map<String, CompletableFuture<CategoryDsl>> categoryFutures;
    private final ParentRegistrar<ConfigCategory, CategoryDsl, ParentRegistrar<OptionGroup, GroupDsl, OptionRegistrar>> categories;

    public RootDslImpl(String string) {
        Intrinsics.checkNotNullParameter((Object)string, (String)"");
        this.rootId = string;
        this.rootKey = "yacl3.config." + this.getRootId();
        this.thisRoot = new CompletableFuture();
        this.built = this.getThisRoot();
        this.builder = YetAnotherConfigLib.createBuilder();
        this.categoryFutures = new LinkedHashMap();
        this.builder.title((class00392)class00392.L((String)(this.getRootKey() + ".title")));
        this.categories = new ParentRegistrarImpl((arg_0, arg_1) -> RootDslImpl.categories$lambda$0(this, arg_0, arg_1), arg_0 -> RootDslImpl.categories$lambda$1(this, arg_0), arg_0 -> RootDslImpl.categories$lambda$2(this, arg_0), arg_0 -> RootDslImpl.categories$lambda$3(this, arg_0));
    }

    @Override
    public void save(Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, (String)"");
        this.builder.save(() -> RootDslImpl.save$lambda$0(function0));
    }

    public YetAnotherConfigLib build() {
        YetAnotherConfigLib yetAnotherConfigLib;
        YetAnotherConfigLib yetAnotherConfigLib2 = yetAnotherConfigLib = this.builder.build();
        boolean bl = false;
        this.getThisRoot().complete(yetAnotherConfigLib2);
        this.checkUnresolvedFutures();
        YetAnotherConfigLib yetAnotherConfigLib3 = yetAnotherConfigLib;
        Intrinsics.checkNotNullExpressionValue((Object)yetAnotherConfigLib3, (String)"");
        return yetAnotherConfigLib3;
    }

    @Override
    public ParentRegistrar<ConfigCategory, CategoryDsl, ParentRegistrar<OptionGroup, GroupDsl, OptionRegistrar>> getCategories() {
        return this.categories;
    }

    @Override
    public void title(class00392 class003922) {
        Intrinsics.checkNotNullParameter((Object)class003922, (String)"");
        this.builder.title(class003922);
    }

    @Override
    public void title(Function0<? extends class00392> function0) {
        Intrinsics.checkNotNullParameter(function0, (String)"");
        this.title((class00392)function0.invoke());
    }

    @Override
    public void screenInit(Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, (String)"");
        this.builder.screenInit(arg_0 -> RootDslImpl.screenInit$lambda$0(function0, arg_0));
    }

    private final void checkUnresolvedFutures() {
        Object object;
        Map map = this.categoryFutures;
        boolean bl = false;
        Object object2 = new LinkedHashMap();
        Object object3 = map.entrySet().iterator();
        while (object3.hasNext()) {
            object = object3.next();
            CompletableFuture<CategoryDsl> completableFuture = object.getValue();
            boolean bl2 = false;
            if (!(!completableFuture.isDone())) continue;
            ((HashMap)object2).put(object.getKey(), object.getValue());
        }
        map = (Map)object2;
        bl = false;
        object2 = map.entrySet().iterator();
        while (object2.hasNext()) {
            object = object3 = (Map.Entry)object2.next();
            boolean bl3 = false;
            ImplKt.access$getLOGGER$p().error("Future category " + object.getKey() + " was referenced but was never built.");
        }
    }

    private static final CompletableFuture createFuture$lambda$0(String string) {
        Intrinsics.checkNotNullParameter((Object)string, (String)"");
        return new CompletableFuture();
    }

    private static final void screenInit$lambda$0(Function0 function0, YACLScreen yACLScreen) {
        function0.invoke();
    }

    private static final CompletionStage categories$lambda$2$1(Function1 function1, Object object) {
        return (CompletionStage)function1.invoke(object);
    }

    private static final CompletableFuture categories$lambda$2(RootDslImpl rootDslImpl, String string) {
        Intrinsics.checkNotNullParameter((Object)string, (String)"");
        CompletionStage completionStage = rootDslImpl.createFuture(string).thenCompose(arg_0 -> RootDslImpl.categories$lambda$2$1(RootDslImpl::categories$lambda$2$0, arg_0));
        Intrinsics.checkNotNullExpressionValue((Object)completionStage, (String)"");
        return completionStage;
    }

    private static final ParentRegistrar categories$lambda$3$1(Function1 function1, Object object) {
        return (ParentRegistrar)function1.invoke(object);
    }

    private static final CompletionStage categories$lambda$2$0(CategoryDsl categoryDsl) {
        return categoryDsl.getBuilt();
    }

    private static final ParentRegistrar categories$lambda$3$0(CategoryDsl categoryDsl) {
        return categoryDsl.getGroups();
    }

    private static final Unit categories$lambda$0(RootDslImpl rootDslImpl, ConfigCategory configCategory, String string) {
        Intrinsics.checkNotNullParameter((Object)configCategory, (String)"");
        Intrinsics.checkNotNullParameter((Object)string, (String)"");
        rootDslImpl.builder.category(configCategory);
        return Unit.INSTANCE;
    }

    private static final CompletableFuture categories$lambda$3(RootDslImpl rootDslImpl, String string) {
        Intrinsics.checkNotNullParameter((Object)string, (String)"");
        CompletionStage completionStage = rootDslImpl.createFuture(string).thenApply(arg_0 -> RootDslImpl.categories$lambda$3$1(RootDslImpl::categories$lambda$3$0, arg_0));
        Intrinsics.checkNotNullExpressionValue((Object)completionStage, (String)"");
        return completionStage;
    }

    private static final CompletableFuture createFuture$lambda$1(Function1 function1, Object object) {
        return (CompletableFuture)function1.invoke(object);
    }

    private static final CategoryDsl categories$lambda$1(RootDslImpl rootDslImpl, String string) {
        CategoryDslImpl categoryDslImpl;
        Intrinsics.checkNotNullParameter((Object)string, (String)"");
        CategoryDslImpl categoryDslImpl2 = categoryDslImpl = new CategoryDslImpl(string, (RootDsl)rootDslImpl);
        boolean bl = false;
        rootDslImpl.createFuture(string).complete((CategoryDsl)categoryDslImpl2);
        return (CategoryDsl)categoryDslImpl;
    }

    @Override
    public String getRootKey() {
        return this.rootKey;
    }

    @Override
    public String getRootId() {
        return this.rootId;
    }

    public CompletableFuture<YetAnotherConfigLib> getBuilt() {
        return this.built;
    }

    private static final void save$lambda$0(Function0 function0) {
        function0.invoke();
    }

    @Override
    public CompletableFuture<YetAnotherConfigLib> getThisRoot() {
        return this.thisRoot;
    }

    private final CompletableFuture<CategoryDsl> createFuture(String string) {
        CompletableFuture completableFuture = this.categoryFutures.computeIfAbsent(string, arg_0 -> RootDslImpl.createFuture$lambda$1(RootDslImpl::createFuture$lambda$0, arg_0));
        Intrinsics.checkNotNullExpressionValue((Object)completableFuture, (String)"");
        return completableFuture;
    }
}

