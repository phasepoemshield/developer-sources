/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00042
 *  minecraft.class00690
 *  minecraft.class00695
 *  minecraft.class01109
 *  minecraft.class01178
 *  minecraft.class04770
 *  minecraft.class04782
 *  minecraft.class07049
 *  minecraft.class07079
 *  minecraft.class07536
 *  minecraft.class07623
 *  net.caffeinemc.mods.lithium.common.entity.NavigatingEntity
 *  net.caffeinemc.mods.lithium.common.world.ServerWorldExtended
 *  net.fabricmc.fabric.api.event.lifecycle.v1.ServerEntityEvents
 *  net.fabricmc.fabric.api.event.lifecycle.v1.ServerEntityEvents$Load
 *  net.fabricmc.fabric.api.event.lifecycle.v1.ServerEntityEvents$Unload
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package Nursultan;

import java.util.Set;
import minecraft.class00042;
import minecraft.class00690;
import minecraft.class00695;
import minecraft.class01109;
import minecraft.class01178;
import minecraft.class04770;
import minecraft.class04782;
import minecraft.class07049;
import minecraft.class07079;
import minecraft.class07536;
import minecraft.class07623;
import net.caffeinemc.mods.lithium.common.entity.NavigatingEntity;
import net.caffeinemc.mods.lithium.common.world.ServerWorldExtended;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerEntityEvents;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public final class class10465
implements class01109<class07049> {
    final /* synthetic */ class04782 N;
    private class04782 y;

    public void L(class07049 class070492) {
        this.N.field_26934.N(class070492);
    }

    public void M(class07049 class070492) {
        class070492.method_42147(class01178::L);
    }

    public class10465(class04782 class047822) {
        this.N = class047822;
        this.N(class047822, null);
    }

    public void i(class07049 class070492) {
        class04770 class047702;
        this.N.method_14178().y(class070492);
        if (class070492 instanceof class04770) {
            class047702 = (class04770)class070492;
            this.N.field_18261.add(class047702);
            if (class047702.method_70637()) {
                this.N.method_70636().N(class047702);
            }
            this.N.method_8448();
        }
        if (class070492 instanceof class00042 && (class047702 = (class00042)class070492).method_70674()) {
            this.N.method_70636().N((class00042)class047702);
        }
        if (class070492 instanceof class07079) {
            class047702 = (class07079)class070492;
            if (this.N.field_36317) {
                class00695[] class00695Array = "onTrackingStart called during navigation iteration";
                class07536.N((String)"onTrackingStart called during navigation iteration", (Throwable)new IllegalStateException("onTrackingStart called during navigation iteration"));
            }
            class04770 class047703 = class047702;
            Set var7 = this.N.field_26932;
            this.N(var7, class047703);
        }
        if (class070492 instanceof class00690) {
            class047702 = (class00690)class070492;
            for (class00695 class006952 : class047702.E()) {
                this.N.field_26933.put(class006952.method_5628(), (Object)class006952);
            }
        }
        class070492.method_42147(class01178::N);
        this.N(class070492, null);
    }

    public void u(class07049 class070492) {
        this.N.field_26934.y(class070492);
    }

    private boolean y(Set set, Object object) {
        class07079 class070792 = (class07079)object;
        NavigatingEntity navigatingEntity = (NavigatingEntity)class070792;
        if (navigatingEntity.lithium$isRegisteredToWorld()) {
            if (navigatingEntity.lithium$getRegisteredNavigation().Z() != null) {
                ((ServerWorldExtended)this.y).lithium$setNavigationInactive(class070792);
            }
            navigatingEntity.lithium$setRegisteredToWorld(null);
        }
        return set.remove(class070792);
    }

    private void y(class07049 class070492, CallbackInfo callbackInfo) {
        ((ServerEntityEvents.Unload)ServerEntityEvents.ENTITY_UNLOAD.invoker()).onUnload(class070492, this.N);
    }

    public void y(class07049 class070492) {
        if (class070492 instanceof class00042) {
            class00042 class000422 = (class00042)class070492;
            this.N.method_70636().L(class000422);
        }
        this.N.method_14170().N(class070492);
    }

    private void N(class04782 class047822, CallbackInfo callbackInfo) {
        this.y = class047822;
    }

    private boolean N(Set set, Object object) {
        class07079 class070792 = (class07079)object;
        class07623 class076232 = class070792.f();
        ((NavigatingEntity)class070792).lithium$setRegisteredToWorld(class076232);
        if (class076232.Z() != null) {
            ((ServerWorldExtended)this.y).lithium$setNavigationActive(class070792);
        }
        return set.add(class070792);
    }

    private void N(class07049 class070492, CallbackInfo callbackInfo) {
        ((ServerEntityEvents.Load)ServerEntityEvents.ENTITY_LOAD.invoker()).onLoad(class070492, this.N);
    }

    public void N(class07049 class070492) {
        class00042 class000422;
        if (class070492 instanceof class00042 && (class000422 = (class00042)class070492).method_70674()) {
            this.N.method_70636().N(class000422);
        }
    }

    public void R(class07049 class070492) {
        class04770 class047702;
        this.y(class070492, null);
        this.N.method_14178().N(class070492);
        if (class070492 instanceof class04770) {
            class047702 = (class04770)class070492;
            this.N.field_18261.remove(class047702);
            this.N.method_70636().L(class047702);
            this.N.method_8448();
        }
        if (class070492 instanceof class07079) {
            class047702 = (class07079)class070492;
            if (this.N.field_36317) {
                class00695[] class00695Array = "onTrackingStart called during navigation iteration";
                class07536.N((String)"onTrackingStart called during navigation iteration", (Throwable)new IllegalStateException("onTrackingStart called during navigation iteration"));
            }
            class04770 class047703 = class047702;
            Set var7 = this.N.field_26932;
            this.y(var7, class047703);
        }
        if (class070492 instanceof class00690) {
            class047702 = (class00690)class070492;
            for (class00695 class006952 : class047702.E()) {
                this.N.field_26933.remove(class006952.method_5628());
            }
        }
        class070492.method_42147(class01178::y);
        this.N.field_62841.y(class070492);
    }
}

