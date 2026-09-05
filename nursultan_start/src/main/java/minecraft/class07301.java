/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01894
 *  minecraft.class02477
 *  minecraft.class02541
 *  minecraft.class02550
 *  minecraft.class02558
 *  minecraft.class02676
 *  minecraft.class02695
 *  minecraft.class02944
 *  minecraft.class03543
 *  minecraft.class03556
 *  minecraft.class05952
 *  minecraft.class06244
 *  minecraft.class07536
 *  net.fabricmc.fabric.impl.item.EnchantmentUtil$BuilderExtensions
 *  net.fabricmc.fabric.mixin.item.EnchantmentBuilderAccessor
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import minecraft.class00392;
import minecraft.class01894;
import minecraft.class02477;
import minecraft.class02541;
import minecraft.class02550;
import minecraft.class02558;
import minecraft.class02676;
import minecraft.class02695;
import minecraft.class02944;
import minecraft.class03543;
import minecraft.class03556;
import minecraft.class05952;
import minecraft.class06244;
import minecraft.class07286;
import minecraft.class07304;
import minecraft.class07536;
import net.fabricmc.fabric.impl.item.EnchantmentUtil;
import net.fabricmc.fabric.mixin.item.EnchantmentBuilderAccessor;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class07301
implements EnchantmentUtil.BuilderExtensions,
EnchantmentBuilderAccessor {
    private final class07286 N;
    private class03543<class07304> y = class03543.N((class03556[])new class03556[0]);
    private final Map<class02477<?>, List<?>> L = new HashMap();
    private final class02676 u = class02695.N();
    private boolean i = false;

    public /* synthetic */ class07286 getDefinition() {
        return this.N;
    }

    public class07301(class07286 class072862) {
        this.N = class072862;
    }

    public <E> class07301 y(class02477<E> class024772, E e) {
        this.u.N(class024772, e);
        class07301 class073012 = this;
        class07301 class073013 = class073012;
        class073013 = new CallbackInfoReturnable("", false, (Object)class073013);
        this.N((CallbackInfoReturnable)class073013);
        return class073012;
    }

    private <E> List<E> y(class02477<List<E>> class024772) {
        List var2 = (List)this.L.computeIfAbsent(class024772, class024773 -> {
            CallbackInfoReturnable callbackInfoReturnable = new ArrayList();
            this.u.N(class024772, callbackInfoReturnable);
            CallbackInfoReturnable callbackInfoReturnable2 = callbackInfoReturnable;
            CallbackInfoReturnable callbackInfoReturnable3 = callbackInfoReturnable2;
            callbackInfoReturnable3 = new CallbackInfoReturnable("", false, callbackInfoReturnable3);
            this.N(callbackInfoReturnable3);
            return callbackInfoReturnable2;
        });
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", false, (Object)var2);
        this.N(callbackInfoReturnable);
        return var2;
    }

    public <E> class07301 N(class02477<List<class02944<E>>> class024772, E e, class05952 class059522) {
        this.y(class024772).add(new class02944(e, Optional.of(class059522.build())));
        class07301 class073012 = this;
        class07301 class073013 = class073012;
        class073013 = new CallbackInfoReturnable("", false, (Object)class073013);
        this.N((CallbackInfoReturnable)class073013);
        return class073012;
    }

    public class07304 N(class01894 class018942) {
        class07304 class073042 = new class07304((class00392)class00392.L((String)class07536.N((String)"enchantment", (class01894)class018942)), this.N, this.y, this.u.N());
        class07304 class073043 = class073042;
        class073043 = new CallbackInfoReturnable("", false, (Object)class073043);
        this.N((CallbackInfoReturnable)class073043);
        return class073042;
    }

    private void N(CallbackInfoReturnable callbackInfoReturnable) {
        if (callbackInfoReturnable.getReturnValue() == this) {
            this.i = true;
        }
    }

    public class07301 N(class03543<class07304> class035432) {
        this.y = class035432;
        class07301 class073012 = this;
        class07301 class073013 = class073012;
        class073013 = new CallbackInfoReturnable("", false, (Object)class073013);
        this.N((CallbackInfoReturnable)class073013);
        return class073012;
    }

    public <E> class07301 N(class02477<List<class02550<E>>> class024772, class02558 class025582, class02558 class025583, E e, class05952 class059522) {
        this.y(class024772).add(new class02550(class025582, class025583, e, Optional.of(class059522.build())));
        class07301 class073012 = this;
        class07301 class073013 = class073012;
        class073013 = new CallbackInfoReturnable("", false, (Object)class073013);
        this.N((CallbackInfoReturnable)class073013);
        return class073012;
    }

    public <E> class07301 N(class02477<List<class02550<E>>> class024772, class02558 class025582, class02558 class025583, E e) {
        this.y(class024772).add(new class02550(class025582, class025583, e, Optional.empty()));
        class07301 class073012 = this;
        class07301 class073013 = class073012;
        class073013 = new CallbackInfoReturnable("", false, (Object)class073013);
        this.N((CallbackInfoReturnable)class073013);
        return class073012;
    }

    public class07301 N(class02477<List<class02541>> class024772, class02541 class025412) {
        this.y(class024772).add(class025412);
        class07301 class073012 = this;
        class07301 class073013 = class073012;
        class073013 = new CallbackInfoReturnable("", false, (Object)class073013);
        this.N((CallbackInfoReturnable)class073013);
        return class073012;
    }

    public <E> class07301 N(class02477<List<class02944<E>>> class024772, E e) {
        this.y(class024772).add(new class02944(e, Optional.empty()));
        class07301 class073012 = this;
        class07301 class073013 = class073012;
        class073013 = new CallbackInfoReturnable("", false, (Object)class073013);
        this.N((CallbackInfoReturnable)class073013);
        return class073012;
    }

    public class07301 N(class02477<class06244> class024772) {
        this.u.N(class024772, (Object)class06244.field_17274);
        class07301 class073012 = this;
        class07301 class073013 = class073012;
        class073013 = new CallbackInfoReturnable("", false, (Object)class073013);
        this.N((CallbackInfoReturnable)class073013);
        return class073012;
    }

    public /* synthetic */ class02676 getEffectMap() {
        return this.u;
    }

    public boolean fabric$didModify() {
        return this.i;
    }

    public /* synthetic */ class03543 getExclusiveSet() {
        return this.y;
    }

    public void fabric$resetModified() {
        this.i = false;
    }

    public /* synthetic */ List invokeGetEffectsList(class02477 class024772) {
        return this.y(class024772);
    }
}

