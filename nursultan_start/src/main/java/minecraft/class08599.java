/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime
 *  com.mojang.serialization.Codec
 *  minecraft.class02484
 *  minecraft.class02523
 *  minecraft.class02710
 *  minecraft.class03556
 *  minecraft.class06584
 *  minecraft.class07049
 *  minecraft.class07085
 *  minecraft.class07299
 *  minecraft.class07304
 *  minecraft.class07438
 *  net.caffeinemc.mods.lithium.common.entity.EquipmentInfo
 *  net.caffeinemc.mods.lithium.common.util.change_tracking.ChangePublisher
 *  net.caffeinemc.mods.lithium.common.util.change_tracking.ChangeSubscriber
 *  net.caffeinemc.mods.lithium.common.util.change_tracking.ChangeSubscriber$CountChangeSubscriber
 *  net.caffeinemc.mods.lithium.common.world.in_world_tracking.MaybeInLevelObject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.mojang.serialization.Codec;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import minecraft.class02484;
import minecraft.class02523;
import minecraft.class02710;
import minecraft.class03556;
import minecraft.class06584;
import minecraft.class07049;
import minecraft.class07085;
import minecraft.class07299;
import minecraft.class07304;
import minecraft.class07438;
import net.caffeinemc.mods.lithium.common.entity.EquipmentInfo;
import net.caffeinemc.mods.lithium.common.util.change_tracking.ChangePublisher;
import net.caffeinemc.mods.lithium.common.util.change_tracking.ChangeSubscriber;
import net.caffeinemc.mods.lithium.common.world.in_world_tracking.MaybeInLevelObject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class08599
implements EquipmentInfo,
ChangeSubscriber.CountChangeSubscriber,
MaybeInLevelObject {
    public static final Codec<class08599> N = Codec.unboundedMap((Codec)class07085.field_45739, (Codec)class06584.y).xmap(map -> {
        EnumMap<class07085, class06584> enumMap = new EnumMap<class07085, class06584>(class07085.class);
        enumMap.putAll((Map<class07085, class06584>)map);
        return new class08599(enumMap);
    }, class085992 -> {
        EnumMap<class07085, class06584> enumMap = new EnumMap<class07085, class06584>(class085992.R);
        enumMap.values().removeIf(class06584::R);
        return enumMap;
    });
    private final EnumMap<class07085, class06584> R;
    boolean y = false;
    class06584 L = null;
    boolean u = true;
    boolean i = false;

    private void L() {
        this.y = false;
        this.L = null;
        this.u = true;
        for (class06584 class065842 : this.R.values()) {
            if (class065842.R()) continue;
            ((ChangePublisher)class065842).lithium$unsubscribeWithData((ChangeSubscriber)this, 0);
        }
    }

    private class06584 L(class07085 class070852, class06584 class065842) {
        return Objects.requireNonNullElse(this.R.put(class070852, class065842), class06584.E);
    }

    private void L(class06584 class065842) {
        if (this.L != null && this.L != class065842) {
            this.y = class08599.N(this.L);
            this.L = null;
        }
    }

    private class08599(EnumMap<class07085, class06584> enumMap) {
        this.R = enumMap;
    }

    public class08599() {
        this(new EnumMap<class07085, class06584>(class07085.class));
    }

    private void u() {
        this.y = false;
        this.L = null;
        this.u = true;
        for (class06584 class065842 : this.R.values()) {
            if (class065842.R()) continue;
            if (!this.y) {
                this.y = class08599.N(class065842);
            }
            if (class065842.R()) continue;
            ((ChangePublisher)class065842).lithium$subscribe((ChangeSubscriber)this, 0);
        }
    }

    private void y(class08599 class085992, CallbackInfo callbackInfo) {
        if (this.i) {
            this.u();
        }
    }

    private void y(class06584 class065842) {
        this.L = class065842;
    }

    public void lithium$forceUnsubscribe(class06584 class065842, int n) {
        throw new UnsupportedOperationException();
    }

    public void y() {
        this.R.replaceAll((class070852, class065842) -> class06584.E);
        this.N((CallbackInfo)null);
    }

    private void N(CallbackInfo callbackInfo) {
        if (this.i) {
            this.L();
        }
    }

    private void N(class08599 class085992, CallbackInfo callbackInfo) {
        if (this.i) {
            this.L();
        }
    }

    private class06584 N(class07085 class070852, class06584 class065842, Operation operation) {
        class06584 class065843 = (class06584)operation.call(new Object[]{class070852, class065842});
        if (this.i) {
            this.N(class065843, class065842);
        }
        return class065843;
    }

    private static boolean N(class06584 class065842) {
        class02710 class027102;
        if (!class065842.R() && (class027102 = (class02710)class065842.method_58694(class02484.P)) != null && !class027102.u()) {
            Iterator var2 = class027102.N().iterator();
            while (var2.hasNext()) {
                if (((class07304)((class03556)var2.next()).N()).N(class02523.s).isEmpty()) continue;
                return true;
            }
        }
        return false;
    }

    public void lithium$notify(class06584 class065842, int n) {
        this.u = true;
        if (!this.y) {
            this.L(class065842);
            this.y(class065842);
        }
    }

    private void N(class06584 class065842, class06584 class065843) {
        if (!this.y) {
            if (this.L == class065842) {
                this.L = null;
            }
            this.y = class08599.N(class065843);
        }
        this.u = true;
        if (!class065842.R()) {
            ((ChangePublisher)class065842).lithium$unsubscribeWithData((ChangeSubscriber)this, 0);
        }
        if (!class065843.R()) {
            ((ChangePublisher)class065843).lithium$subscribe((ChangeSubscriber)this, 0);
        }
    }

    public void lithium$notifyCount(class06584 class065842, int n, int n2) {
        if (n2 == 0) {
            ((ChangePublisher)class065842).lithium$unsubscribeWithData((ChangeSubscriber)this, n);
        }
        this.N(class065842, class06584.E);
    }

    public void N(class07049 class070492) {
        for (Map.Entry<class07085, class06584> entry : this.R.entrySet()) {
            class06584 class065842 = entry.getValue();
            if (class065842.R()) continue;
            class065842.N(class070492.method_73183(), class070492, entry.getKey());
        }
    }

    public void N(class08599 class085992) {
        this.N(class085992, null);
        this.R.clear();
        this.R.putAll(class085992.R);
        this.y(class085992, null);
    }

    public void N(class07438 class074382) {
        for (class06584 class065842 : this.R.values()) {
            class074382.method_7329(class065842, true, false);
        }
        this.y();
    }

    public boolean N() {
        Iterator<class06584> var1 = this.R.values().iterator();
        while (var1.hasNext()) {
            if (var1.next().R()) continue;
            return false;
        }
        return true;
    }

    public class06584 N(class07085 class070852) {
        return this.R.getOrDefault(class070852, class06584.E);
    }

    public class06584 N(class07085 class070852, class06584 class065842) {
        return this.N(class070852, class065842, objectArray -> {
            WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)2, (String)"[net.minecraft.class_1304, net.minecraft.class_1799]");
            return this.L((class07085)objectArray[0], (class06584)objectArray[1]);
        });
    }

    public void lithium$handleAddedToLevel(class07299 class072992) {
        this.i = true;
        this.u();
        super.lithium$handleAddedToLevel(class072992);
    }

    public boolean lithium$isInLevel() {
        return this.i;
    }

    public void lithium$handleRemovedFromLevel(class07299 class072992) {
        this.i = false;
        this.L();
        super.lithium$handleRemovedFromLevel(class072992);
    }

    public void lithium$onEquipmentChangesSent() {
        if (!this.i) {
            return;
        }
        this.u = false;
    }

    public boolean lithium$shouldTickEnchantments() {
        if (!this.i) {
            return true;
        }
        this.L(null);
        return this.y;
    }

    public boolean lithium$hasUnsentEquipmentChanges() {
        if (!this.i) {
            return true;
        }
        return this.u;
    }
}

