/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime
 *  com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalRefImpl
 *  com.llamalad7.mixinextras.sugar.ref.LocalRef
 *  com.mojang.serialization.Codec
 *  minecraft.class00751
 *  minecraft.class01225
 *  minecraft.class01894
 *  minecraft.class01921
 *  minecraft.class01929
 *  minecraft.class01996
 *  minecraft.class01997
 *  minecraft.class02024
 *  minecraft.class03530
 *  minecraft.class03932
 *  minecraft.class04476
 *  minecraft.class05946
 *  minecraft.class07135
 *  minecraft.class07536
 *  net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider
 *  net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider$AliasGroupBuilder
 *  net.fabricmc.fabric.impl.datagen.FabricTagBuilder
 *  net.fabricmc.fabric.impl.datagen.TagAliasGenerator
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import com.google.common.collect.Maps;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalRefImpl;
import com.llamalad7.mixinextras.sugar.ref.LocalRef;
import com.mojang.serialization.Codec;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import minecraft.class00751;
import minecraft.class01225;
import minecraft.class01894;
import minecraft.class01921;
import minecraft.class01929;
import minecraft.class01996;
import minecraft.class01997;
import minecraft.class02024;
import minecraft.class03530;
import minecraft.class03932;
import minecraft.class04476;
import minecraft.class05946;
import minecraft.class07006;
import minecraft.class07034;
import minecraft.class07135;
import minecraft.class07536;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.fabricmc.fabric.impl.datagen.FabricTagBuilder;
import net.fabricmc.fabric.impl.datagen.TagAliasGenerator;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public abstract class class07028<T>
implements class07135 {
    protected final class01997 field_39380;
    private final CompletableFuture<class01929> field_43107;
    private final CompletableFuture<Void> field_43108 = new CompletableFuture();
    private final CompletableFuture<class07034<T>> field_43093;
    public final class05946<? extends class00751<T>> field_40957;
    public final Map<class01894, class01225> field_11481 = Maps.newLinkedHashMap();
    private class01997 tagAliasPathResolver;

    public class07028(class01996 class019962, class05946<? extends class00751<T>> class059462, CompletableFuture<class01929> completableFuture) {
        this(class019962, class059462, completableFuture, CompletableFuture.completedFuture(class07034.N()));
    }

    protected class07028(class01996 class019962, class05946<? extends class00751<T>> class059462, CompletableFuture<class01929> completableFuture, CompletableFuture<class07034<T>> completableFuture2) {
        this.field_39380 = class019962.method_60918(class059462);
        this.field_40957 = class059462;
        this.field_43093 = completableFuture2;
        this.field_43107 = completableFuture;
        this.m_handler$zdf000$fabric_data_generation_api_v1$initPathResolver_68(class019962, class059462, completableFuture, completableFuture2, null);
    }

    public String method_10321() {
        return "Tags for " + String.valueOf(this.field_40957.N());
    }

    public CompletableFuture<?> method_10319(class04476 class044762) {
        return ((CompletableFuture)((CompletableFuture)this.method_49651().thenApply(class019292 -> {
            this.field_43108.complete(null);
            return class019292;
        })).thenCombineAsync(this.field_43093, (class019292, class070342) -> new class07006((class01929)class019292, class070342), (Executor)class07536.B())).thenCompose(class070062 -> {
            class01921 class019212 = class070062.N().y(this.field_40957);
            Predicate<class01894> predicate = class018942 -> class019212.N(class05946.N(this.field_40957, (class01894)class018942)).isPresent();
            Predicate<class01894> predicate2 = class018942 -> this.field_11481.containsKey(class018942) || class070062.y().N(class03530.N(this.field_40957, (class01894)class018942));
            CompletableFuture[] completableFutureArray = (CompletableFuture[])this.field_11481.entrySet().stream().map(entry -> {
                class01894 class018942 = (class01894)entry.getKey();
                class01225 class012252 = (class01225)entry.getValue();
                List var8 = class012252.y();
                List var9 = var8.stream().filter(class012152 -> !class012152.method_32832(predicate, predicate2)).toList();
                if (!var9.isEmpty()) {
                    throw new IllegalArgumentException(String.format(Locale.ROOT, "Couldn't define tag %s as it is missing following references: %s", class018942, var9.stream().map(Objects::toString).collect(Collectors.joining(","))));
                }
                Path path = this.field_39380.N(class018942);
                boolean bl = false;
                return class07135.N((class04476)class044762, (class01929)class070062.N(), (Codec)class03932.N, (Object)new class03932(var8, this.m_modify$zdf000$fabric_data_generation_api_v1$addReplaced_66(bl, class012252)), (Path)path);
            }).toArray(CompletableFuture[]::new);
            Operation operation = objectArray -> {
                WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)1, (String)"[java.util.concurrent.CompletableFuture[]]");
                return CompletableFuture.allOf((CompletableFuture[])objectArray[0]);
            };
            LocalRefImpl localRefImpl = new LocalRefImpl();
            localRefImpl.init((Object)class044762);
            class044762 = (class04476)localRefImpl.dispose();
            return this.m_wrapOperation$zdf000$fabric_data_generation_api_v1$addTagAliasGroupBuilders$mixinextras$bridge$23_69(completableFutureArray, operation, (LocalRef)localRefImpl);
        });
    }

    private boolean m_modify$zdf000$fabric_data_generation_api_v1$addReplaced_66(boolean bl, class01225 class012252) {
        if (class012252 instanceof FabricTagBuilder) {
            return ((FabricTagBuilder)class012252).fabric_isReplaced();
        }
        return bl;
    }

    private CompletableFuture m_wrapOperation$zdf000$fabric_data_generation_api_v1$addTagAliasGroupBuilders_67(CompletableFuture[] completableFutureArray, Operation operation, class04476 class044762) {
        if (this instanceof FabricTagProvider) {
            Map map = ((FabricTagProvider)this).getAliasGroupBuilders();
            CompletableFuture[] completableFutureArray2 = Arrays.copyOf(completableFutureArray, completableFutureArray.length + map.size());
            int n = completableFutureArray.length;
            for (Map.Entry entry : map.entrySet()) {
                completableFutureArray2[n++] = TagAliasGenerator.writeTagAlias((class04476)class044762, (class01997)this.tagAliasPathResolver, this.field_40957, (class01894)((class01894)entry.getKey()), (List)((FabricTagProvider.AliasGroupBuilder)entry.getValue()).getTags());
            }
            return (CompletableFuture)operation.call(new Object[]{completableFutureArray2});
        }
        return (CompletableFuture)operation.call(new Object[]{completableFutureArray});
    }

    protected abstract void method_10514(class01929 var1);

    public class01225 method_27169(class03530<T> class035302) {
        return this.field_11481.computeIfAbsent(class035302.y(), class018942 -> class01225.N());
    }

    public CompletableFuture<class07034<T>> method_49662() {
        return this.field_43108.thenApply(void_ -> class035302 -> Optional.ofNullable(this.field_11481.get(class035302.y())));
    }

    protected CompletableFuture<class01929> method_49651() {
        return this.field_43107.thenApply(class019292 -> {
            this.field_11481.clear();
            this.method_10514((class01929)class019292);
            return class019292;
        });
    }

    private void m_handler$zdf000$fabric_data_generation_api_v1$initPathResolver_68(class01996 class019962, class05946 class059462, CompletableFuture completableFuture, CompletableFuture completableFuture2, CallbackInfo callbackInfo) {
        this.tagAliasPathResolver = class019962.method_45973(class02024.field_39367, TagAliasGenerator.getDirectory((class05946)class059462));
    }

    private CompletableFuture m_wrapOperation$zdf000$fabric_data_generation_api_v1$addTagAliasGroupBuilders$mixinextras$bridge$23_69(CompletableFuture[] completableFutureArray, Operation operation, LocalRef localRef) {
        return this.m_wrapOperation$zdf000$fabric_data_generation_api_v1$addTagAliasGroupBuilders_67(completableFutureArray, operation, (class04476)localRef.get());
    }
}

