/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime
 *  minecraft.class00743
 *  minecraft.class06584
 *  minecraft.class06686
 *  minecraft.class06695
 *  net.fabricmc.fabric.impl.transfer.item.SpecialLogicAccess
 */
package minecraft;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import java.util.function.Predicate;
import minecraft.class00743;
import minecraft.class06584;
import minecraft.class06686;
import minecraft.class06695;
import net.fabricmc.fabric.impl.transfer.item.SpecialLogicAccess;

public interface class08974
extends class06695,
SpecialLogicAccess {
    default public int y() {
        return (int)this.N().stream().filter(Predicate.not(class06584::R)).count();
    }

    default public boolean N(class06584 class065842) {
        return true;
    }

    default public void N(int n, class06584 class065842) {
        this.N().set(n, (Object)class065842);
        class065842.R(this.a_(class065842));
    }

    private void N(class08974 class089742, Operation operation) {
        if (!this.fabric_shouldSuppressSpecialLogic()) {
            operation.call(new Object[]{class089742});
        }
    }

    public class00743<class06584> N();

    default public void method_5448() {
        this.N().clear();
    }

    default public boolean method_5437(int n, class06584 class065842) {
        return this.N(class065842) && (this.method_5438(n).R() || this.method_5438(n).c() < this.a_(class065842));
    }

    default public void method_5447(int n, class06584 class065842) {
        this.N(n, class065842);
        class08974 class089742 = this;
        this.N(class089742, objectArray -> {
            WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)1, (String)"[net.minecraft.class_11596]");
            ((class08974)objectArray[0]).method_5431();
            return null;
        });
    }

    default public class06584 method_5434(int n, int n2) {
        class06584 class065842 = class06686.N(this.N(), (int)n, (int)n2);
        if (!class065842.R()) {
            this.method_5431();
        }
        return class065842;
    }

    default public class06584 method_5441(int n) {
        return class06686.N(this.N(), (int)n, (int)this.method_5444());
    }

    default public boolean method_5442() {
        return this.N().stream().allMatch(class06584::R);
    }

    default public class06584 method_5438(int n) {
        return (class06584)this.N().get(n);
    }

    default public int method_5439() {
        return this.N().size();
    }
}

