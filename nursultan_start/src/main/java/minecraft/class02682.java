/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime
 *  minecraft.class00500
 *  minecraft.class04425
 *  minecraft.class04782
 *  minecraft.class07079
 *  minecraft.class07209
 *  minecraft.class07218
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07322
 *  minecraft.class07955
 *  net.caffeinemc.mods.lithium.mixin.ai.pathing.PathfindingContextAccessor
 *  net.fabricmc.fabric.api.registry.LandPathNodeTypesRegistry
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import minecraft.class00500;
import minecraft.class02703;
import minecraft.class04425;
import minecraft.class04782;
import minecraft.class07079;
import minecraft.class07209;
import minecraft.class07218;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07322;
import minecraft.class07955;
import net.caffeinemc.mods.lithium.mixin.ai.pathing.PathfindingContextAccessor;
import net.fabricmc.fabric.api.registry.LandPathNodeTypesRegistry;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class02682
implements PathfindingContextAccessor {
    private final class07322 N;
    private final @Nullable class02703 y;
    private final class07209 L;
    private final class07218 u = new class07218();

    public class02682(class07322 class073222, class07079 class070792) {
        this.N = class073222;
        class07079 class070793 = class070792;
        class07299 class072992 = this.N(class070793, objectArray -> {
            WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)1, (String)"[net.minecraft.class_1308]");
            return ((class07079)objectArray[0]).method_73183();
        });
        if (class072992 instanceof class04782) {
            class04782 class047822 = (class04782)class072992;
            this.y = class047822.method_57133();
        } else {
            this.y = null;
        }
        class070793 = class070792;
        this.L = this.y(class070793, objectArray -> {
            WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)1, (String)"[net.minecraft.class_1308]");
            return ((class07079)objectArray[0]).method_24515();
        });
    }

    public class07209 y() {
        return this.L;
    }

    private class07209 y(class07079 class070792, Operation operation) {
        if (class070792 == null) {
            return null;
        }
        return (class07209)operation.call(new Object[]{class070792});
    }

    private void N(int n, int n2, int n3, CallbackInfoReturnable callbackInfoReturnable, class07209 class072092) {
        class04425 class044252 = LandPathNodeTypesRegistry.getPathNodeType((class00500)this.N(class072092), (class07290)this.N(), (class07209)class072092, (boolean)true);
        if (class044252 != null) {
            callbackInfoReturnable.setReturnValue((Object)class044252);
        }
    }

    public class04425 N(int n, int n2, int n3) {
        class07218 class072182 = this.u.N(n, n2, n3);
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.N(n, n2, n3, callbackInfoReturnable, (class07209)class072182);
        if (callbackInfoReturnable.isCancelled()) {
            return (class04425)callbackInfoReturnable.getReturnValue();
        }
        if (this.y == null) {
            return class07955.y((class07290)this.N, (class07209)class072182);
        }
        return this.y.N((class07290)this.N, (class07209)class072182);
    }

    public class07322 N() {
        return this.N;
    }

    public class00500 N(class07209 class072092) {
        return this.N.method_8320(class072092);
    }

    private class07299 N(class07079 class070792, Operation operation) {
        if (class070792 == null) {
            return null;
        }
        return (class07299)operation.call(new Object[]{class070792});
    }

    public /* synthetic */ class07218 getLastNodePos() {
        return this.u;
    }
}

