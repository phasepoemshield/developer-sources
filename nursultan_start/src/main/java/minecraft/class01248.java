/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  minecraft.class00720
 *  minecraft.class01042
 *  minecraft.class01081
 *  minecraft.class01089
 *  minecraft.class01929
 *  minecraft.class02003
 *  minecraft.class02314
 *  minecraft.class02331
 *  minecraft.class02347
 *  minecraft.class02969
 *  minecraft.class03767
 *  minecraft.class04348
 *  minecraft.class04478
 *  minecraft.class05961
 *  minecraft.class06162
 *  minecraft.class06244
 *  minecraft.class06482
 *  minecraft.class07671
 *  minecraft.class07686
 *  minecraft.class08152
 *  net.fabricmc.fabric.api.event.lifecycle.v1.CommonLifecycleEvents
 *  net.fabricmc.fabric.api.event.lifecycle.v1.CommonLifecycleEvents$TagsLoaded
 *  net.fabricmc.fabric.api.resource.v1.DataResourceStore$Mutable
 *  net.fabricmc.fabric.impl.resource.DataResourceStoreImpl
 *  net.fabricmc.fabric.impl.resource.FabricDataResourceStoreHolder
 *  net.fabricmc.fabric.impl.resource.SetupMarkerResourceReloader
 *  net.fabricmc.fabric.impl.resource.conditions.ResourceConditionsImpl
 *  net.fabricmc.fabric.impl.tag.TagAliasLoader
 *  org.slf4j.Logger
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import minecraft.class00720;
import minecraft.class01042;
import minecraft.class01081;
import minecraft.class01089;
import minecraft.class01929;
import minecraft.class02003;
import minecraft.class02314;
import minecraft.class02331;
import minecraft.class02347;
import minecraft.class02969;
import minecraft.class03767;
import minecraft.class04348;
import minecraft.class04478;
import minecraft.class05961;
import minecraft.class06162;
import minecraft.class06244;
import minecraft.class06482;
import minecraft.class07671;
import minecraft.class07686;
import minecraft.class08152;
import net.fabricmc.fabric.api.event.lifecycle.v1.CommonLifecycleEvents;
import net.fabricmc.fabric.api.resource.v1.DataResourceStore;
import net.fabricmc.fabric.impl.resource.DataResourceStoreImpl;
import net.fabricmc.fabric.impl.resource.FabricDataResourceStoreHolder;
import net.fabricmc.fabric.impl.resource.SetupMarkerResourceReloader;
import net.fabricmc.fabric.impl.resource.conditions.ResourceConditionsImpl;
import net.fabricmc.fabric.impl.tag.TagAliasLoader;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class01248
implements FabricDataResourceStoreHolder {
    private static final Logger N = LogUtils.getLogger();
    private static final CompletableFuture<class06244> y = CompletableFuture.completedFuture(class06244.field_17274);
    private final class02331 L;
    private final class07686 u;
    private final class06482 i;
    private final class04478 R;
    private final class05961 M;
    private final List<class00720<?>> B;
    private class02003 Z;
    private class01042 z;
    private final DataResourceStore.Mutable U = new DataResourceStoreImpl();

    public class06482 L() {
        return this.i;
    }

    public void M() {
        this.B.forEach(class00720::u);
        this.N(null);
        this.y(null);
    }

    private class01248(class02003<class02969> class020032, class01929 class019292, class03767 class037672, class07671 class076712, List<class00720<?>> list, class08152 class081522) {
        this.L = new class02331((class01929)class020032.N());
        this.B = list;
        this.i = new class06482(class019292);
        this.u = new class07686(class076712, class04348.N((class01929)class019292, (class03767)class037672));
        this.R = new class04478(class019292);
        this.M = new class05961(class081522, this.u.N());
        this.N(class020032, class019292, class037672, class076712, list, class081522, null);
        this.y(class020032, class019292, class037672, class076712, list, class081522, null);
    }

    public class04478 i() {
        return this.R;
    }

    public class07686 u() {
        return this.u;
    }

    private void y(class02003 class020032, class01929 class019292, class03767 class037672, class07671 class076712, List list, class08152 class081522, CallbackInfo callbackInfo) {
        this.z = class020032.N();
    }

    private void y(CallbackInfo callbackInfo) {
        ((CommonLifecycleEvents.TagsLoaded)CommonLifecycleEvents.TAGS_LOADED.invoker()).onTagsLoaded(this.z, false);
    }

    public class02331 y() {
        return this.L;
    }

    private void N(CallbackInfo callbackInfo) {
        TagAliasLoader.applyToDynamicRegistries((class02003)this.Z, (Object)class02969.field_39972);
        TagAliasLoader.applyToDynamicRegistries((class02003)this.Z, (Object)class02969.field_39974);
    }

    private void N(class02003 class020032, class01929 class019292, class03767 class037672, class07671 class076712, List list, class08152 class081522, CallbackInfo callbackInfo) {
        this.Z = class020032;
    }

    private static void N(class01089 class010892, class02003 class020032, List list, class03767 class037672, class07671 class076712, class08152 class081522, Executor executor, Executor executor2, CallbackInfoReturnable callbackInfoReturnable) {
        ResourceConditionsImpl.currentFeatures = class037672;
    }

    private static List N(List list, class02347 class023472, class03767 class037672, class01248 class012482) {
        ArrayList arrayList = new ArrayList(list);
        arrayList.addFirst(new SetupMarkerResourceReloader(class012482, class023472.y(), class037672));
        return Collections.unmodifiableList(arrayList);
    }

    public class05961 N() {
        return this.M;
    }

    public static CompletableFuture<class01248> N(class01089 class010892, class02003<class02969> class020032, List<class00720<?>> list, class03767 class037672, class07671 class076712, class08152 class081522, Executor executor, Executor executor2) {
        class01248.N(class010892, class020032, list, class037672, class076712, class081522, executor, executor2, null);
        return class02314.N(class020032, list, (class01089)class010892, (Executor)executor).thenCompose(class023472 -> {
            class01248 class012482 = new class01248((class02003<class02969>)class023472.N(), class023472.y(), class037672, class076712, list, class081522);
            boolean bl = N.isDebugEnabled();
            CompletableFuture<class06244> var12 = y;
            Executor executor3 = executor2;
            Executor executor4 = executor;
            return class06162.N((class01089)class010892, (List)class01248.N(class012482.R(), class023472, class037672, class012482), (Executor)executor4, (Executor)executor3, var12, (boolean)bl).N().thenApply(object -> class012482);
        });
    }

    public List<class01081> R() {
        return List.of(this.i, this.M, this.R);
    }

    public DataResourceStore.Mutable fabric$getDataResourceStore() {
        return this.U;
    }
}

