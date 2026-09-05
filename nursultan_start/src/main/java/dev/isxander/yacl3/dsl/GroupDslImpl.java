/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.api.Option
 *  dev.isxander.yacl3.api.OptionDescription
 *  dev.isxander.yacl3.api.OptionDescription$Builder
 *  dev.isxander.yacl3.api.OptionGroup
 *  dev.isxander.yacl3.api.OptionGroup$Builder
 *  dev.isxander.yacl3.dsl.OptionRegistrar
 *  dev.isxander.yacl3.dsl.OptionRegistrarImpl
 *  kotlin.Metadata
 *  kotlin.Unit
 *  kotlin.jvm.functions.Function0
 *  kotlin.jvm.functions.Function1
 *  kotlin.jvm.internal.Intrinsics
 *  minecraft.class00392
 */
package dev.isxander.yacl3.dsl;

import dev.isxander.yacl3.api.Option;
import dev.isxander.yacl3.api.OptionDescription;
import dev.isxander.yacl3.api.OptionGroup;
import dev.isxander.yacl3.dsl.CategoryDsl;
import dev.isxander.yacl3.dsl.ExtensionsKt;
import dev.isxander.yacl3.dsl.GroupDsl;
import dev.isxander.yacl3.dsl.ImplKt;
import dev.isxander.yacl3.dsl.OptionRegistrar;
import dev.isxander.yacl3.dsl.OptionRegistrarImpl;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import minecraft.class00392;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0006\u0010\u0007J!\u0010\u000b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\t2\u0006\u0010\b\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u0012H\u0016\u00a2\u0006\u0004\b\u0010\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016\u00a2\u0006\u0004\b\u0016\u0010\u0017J(\u0010\u001b\u001a\u00020\u000f2\u0017\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u000f0\u0018\u00a2\u0006\u0002\b\u001aH\u0016\u00a2\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001f\u001a\u00020\u000f*\u00020\u00192\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016\u00a2\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020!H\u0016\u00a2\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0016\u00a2\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\b'\u0010(R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010+R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0005\u0010,R\u001a\u0010-\u001a\u00020\u00028\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b-\u0010)\u001a\u0004\b.\u0010+R \u0010/\u001a\b\u0012\u0004\u0012\u00020$0\t8\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R \u00103\u001a\b\u0012\u0004\u0012\u00020$0\t8\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b3\u00100\u001a\u0004\b4\u00102R\u001c\u00107\u001a\n 6*\u0004\u0018\u000105058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b7\u00108R*\u0010:\u001a\u0018\u0012\u0004\u0012\u00020\u0002\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\t098\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b:\u0010;R*\u0010\"\u001a\u00020!2\u0006\u0010<\u001a\u00020!8\u0016@VX\u0096\u000e\u00a2\u0006\u0012\n\u0004\b\"\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010#R\u001a\u0010B\u001a\u00020A8\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\u00a8\u0006F"}, d2={"Ldev/isxander/yacl3/dsl/GroupDslImpl;", "Ldev/isxander/yacl3/dsl/GroupDsl;", "", "groupId", "Ldev/isxander/yacl3/dsl/CategoryDsl;", "parent", "<init>", "(Ljava/lang/String;Ldev/isxander/yacl3/dsl/CategoryDsl;)V", "id", "Ljava/util/concurrent/CompletableFuture;", "Ldev/isxander/yacl3/api/Option;", "createOptionFuture", "(Ljava/lang/String;)Ljava/util/concurrent/CompletableFuture;", "Lnet/minecraft/class_2561;", "component", "", "name", "(Lnet/minecraft/class_2561;)V", "Lkotlin/Function0;", "block", "(Lkotlin/jvm/functions/Function0;)V", "Ldev/isxander/yacl3/api/OptionDescription;", "description", "(Ldev/isxander/yacl3/api/OptionDescription;)V", "Lkotlin/Function1;", "Ldev/isxander/yacl3/api/OptionDescription$Builder;", "Lkotlin/ExtensionFunctionType;", "descriptionBuilder", "(Lkotlin/jvm/functions/Function1;)V", "", "lines", "addDefaultText", "(Ldev/isxander/yacl3/api/OptionDescription$Builder;Ljava/lang/Integer;)V", "", "collapsed", "(Z)V", "Ldev/isxander/yacl3/api/OptionGroup;", "build", "()Ldev/isxander/yacl3/api/OptionGroup;", "checkUnresolvedFutures", "()V", "Ljava/lang/String;", "getGroupId", "()Ljava/lang/String;", "Ldev/isxander/yacl3/dsl/CategoryDsl;", "groupKey", "getGroupKey", "thisGroup", "Ljava/util/concurrent/CompletableFuture;", "getThisGroup", "()Ljava/util/concurrent/CompletableFuture;", "built", "getBuilt", "Ldev/isxander/yacl3/api/OptionGroup$Builder;", "kotlin.jvm.PlatformType", "builder", "Ldev/isxander/yacl3/api/OptionGroup$Builder;", "", "optionFutures", "Ljava/util/Map;", "value", "Z", "getCollapsed", "()Z", "setCollapsed", "Ldev/isxander/yacl3/dsl/OptionRegistrar;", "options", "Ldev/isxander/yacl3/dsl/OptionRegistrar;", "getOptions", "()Ldev/isxander/yacl3/dsl/OptionRegistrar;", "yet_another_config_lib_v3"})
public final class GroupDslImpl
implements GroupDsl {
    private final String groupId;
    private final CategoryDsl parent;
    private final String groupKey;
    private final CompletableFuture<OptionGroup> thisGroup;
    private final CompletableFuture<OptionGroup> built;
    private final OptionGroup.Builder builder;
    private final Map<String, CompletableFuture<Option<?>>> optionFutures;
    private boolean collapsed;
    private final OptionRegistrar options;

    @Override
    public void description(OptionDescription optionDescription) {
        Intrinsics.checkNotNullParameter((Object)optionDescription, (String)"");
        this.builder.description(optionDescription);
    }

    @Override
    public OptionRegistrar getOptions() {
        return this.options;
    }

    public GroupDslImpl(String string, CategoryDsl categoryDsl) {
        Intrinsics.checkNotNullParameter((Object)string, (String)"");
        Intrinsics.checkNotNullParameter((Object)categoryDsl, (String)"");
        this.groupId = string;
        this.parent = categoryDsl;
        this.groupKey = this.parent.getCategoryKey() + ".group." + this.getGroupId();
        this.thisGroup = new CompletableFuture();
        this.built = this.getThisGroup();
        this.builder = OptionGroup.createBuilder();
        this.optionFutures = new LinkedHashMap();
        this.builder.name((class00392)class00392.L((String)this.getGroupKey()));
        this.setCollapsed(false);
        this.options = (OptionRegistrar)new OptionRegistrarImpl((arg_0, arg_1) -> GroupDslImpl.options$lambda$0(this, arg_0, arg_1), arg_0 -> GroupDslImpl.options$lambda$1(this, arg_0), this.getGroupKey());
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
    public OptionGroup build() {
        OptionGroup optionGroup;
        OptionGroup optionGroup2 = optionGroup = this.builder.build();
        boolean bl = false;
        this.getThisGroup().complete(optionGroup2);
        this.checkUnresolvedFutures();
        OptionGroup optionGroup3 = optionGroup;
        Intrinsics.checkNotNullExpressionValue((Object)optionGroup3, (String)"");
        return optionGroup3;
    }

    private static final CompletableFuture createOptionFuture$lambda$0(String string) {
        Intrinsics.checkNotNullParameter((Object)string, (String)"");
        return new CompletableFuture();
    }

    private static final CompletableFuture createOptionFuture$lambda$1(Function1 function1, Object object) {
        return (CompletableFuture)function1.invoke(object);
    }

    private final void checkUnresolvedFutures() {
        Object object;
        Map map = this.optionFutures;
        boolean bl = false;
        Object object2 = new LinkedHashMap();
        Object object3 = map.entrySet().iterator();
        while (object3.hasNext()) {
            object = object3.next();
            CompletableFuture<Option<?>> completableFuture = object.getValue();
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
            ImplKt.access$getLOGGER$p().error("Future option " + this.parent.getCategoryId() + "/" + this.getGroupId() + "/" + object.getKey() + " was referenced but was never built.");
        }
    }

    @Override
    public CompletableFuture<OptionGroup> getBuilt() {
        return this.built;
    }

    @Override
    public void collapsed(boolean bl) {
        this.setCollapsed(bl);
    }

    @Override
    public String getGroupId() {
        return this.groupId;
    }

    @Override
    public void descriptionBuilder(Function1<? super OptionDescription.Builder, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, (String)"");
        OptionDescription.Builder builder = OptionDescription.createBuilder();
        function1.invoke((Object)builder);
        this.builder.description(builder.build());
    }

    @Override
    public String getGroupKey() {
        return this.groupKey;
    }

    @Override
    public CompletableFuture<OptionGroup> getThisGroup() {
        return this.thisGroup;
    }

    @Override
    public boolean getCollapsed() {
        return this.collapsed;
    }

    @Override
    public void setCollapsed(boolean bl) {
        this.collapsed = bl;
        this.builder.collapsed(bl);
    }

    private static final Unit options$lambda$0(GroupDslImpl groupDslImpl, Option option, String string) {
        OptionGroup.Builder builder;
        Intrinsics.checkNotNullParameter((Object)option, (String)"");
        Intrinsics.checkNotNullParameter((Object)string, (String)"");
        OptionGroup.Builder builder2 = builder = groupDslImpl.builder.option(option);
        boolean bl = false;
        groupDslImpl.createOptionFuture(string).complete(option);
        return Unit.INSTANCE;
    }

    private final CompletableFuture<Option<?>> createOptionFuture(String string) {
        CompletableFuture completableFuture = this.optionFutures.computeIfAbsent(string, arg_0 -> GroupDslImpl.createOptionFuture$lambda$1(GroupDslImpl::createOptionFuture$lambda$0, arg_0));
        Intrinsics.checkNotNullExpressionValue((Object)completableFuture, (String)"");
        return completableFuture;
    }

    private static final CompletableFuture options$lambda$1(GroupDslImpl groupDslImpl, String string) {
        Intrinsics.checkNotNullParameter((Object)string, (String)"");
        return groupDslImpl.createOptionFuture(string);
    }

    @Override
    public void addDefaultText(OptionDescription.Builder builder, Integer n) {
        Intrinsics.checkNotNullParameter((Object)builder, (String)"");
        ExtensionsKt.addDefaultText(builder, this.getGroupKey() + ".description", n);
    }
}

