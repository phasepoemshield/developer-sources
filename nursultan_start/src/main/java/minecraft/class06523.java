/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00265
 *  minecraft.class00299
 *  minecraft.class00302
 *  minecraft.class00315
 *  minecraft.class00330
 *  minecraft.class01929
 *  minecraft.class02754
 *  minecraft.class02903
 *  minecraft.class03762
 *  minecraft.class05857
 *  minecraft.class07299
 *  net.fabricmc.fabric.impl.recipe.ingredient.ShapelessMatch
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import minecraft.class00265;
import minecraft.class00299;
import minecraft.class00302;
import minecraft.class00315;
import minecraft.class00330;
import minecraft.class01929;
import minecraft.class02754;
import minecraft.class02903;
import minecraft.class03762;
import minecraft.class05857;
import minecraft.class06510;
import minecraft.class06514;
import minecraft.class06521;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class07299;
import net.fabricmc.fabric.impl.recipe.ingredient.ShapelessMatch;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class06523
implements class05857 {
    final String N;
    final class03762 y;
    final class06584 L;
    final List<class06510> u;
    private @Nullable class02754 i;
    private boolean Z = false;

    public class06523(String string, class03762 class037622, class06584 class065842, List<class06510> list) {
        this.N = string;
        this.y = class037622;
        this.L = class065842;
        this.u = list;
        this.N(string, class037622, class065842, list, null);
    }

    public String y() {
        return this.N;
    }

    public class06584 method_8116(class02903 class029032, class01929 class019292) {
        return this.L.t();
    }

    public List<class00265> N() {
        return List.of(new class00315(this.u.stream().map(class06510::method_64673).toList(), (class00299)new class00302(this.L), (class00299)new class00330(class06570.Rn)));
    }

    private void N(String string, class03762 class037622, class06584 class065842, List list, CallbackInfo callbackInfo) {
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            if (!((class06510)iterator.next()).requiresTesting()) continue;
            this.Z = true;
            break;
        }
    }

    public void N(class02903 class029032, class07299 class072992, CallbackInfoReturnable callbackInfoReturnable) {
        if (this.Z) {
            ArrayList<class06584> arrayList = new ArrayList<class06584>(class029032.i());
            for (int i = 0; i < class029032.N(); ++i) {
                class06584 class065842 = class029032.N(i);
                if (class065842.R()) continue;
                arrayList.add(class065842);
            }
            callbackInfoReturnable.setReturnValue((Object)ShapelessMatch.isMatch(arrayList, this.u));
        }
    }

    public boolean method_8115(class02903 class029032, class07299 class072992) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.N(class029032, class072992, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return callbackInfoReturnable.getReturnValueZ();
        }
        if (class029032.i() != this.u.size()) {
            return false;
        }
        if (class029032.N() == 1 && this.u.size() == 1) {
            return ((class06510)this.u.getFirst()).method_8093(class029032.N(0));
        }
        return class029032.L().N((class06521)((Object)this), null);
    }

    public class06514<class06523> method_8119() {
        return class06514.L;
    }

    public class02754 method_61671() {
        if (this.i == null) {
            this.i = class02754.y(this.u);
        }
        return this.i;
    }

    public class03762 method_45441() {
        return this.y;
    }
}

