/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime
 *  java.lang.MatchException
 *  minecraft.class00305
 *  minecraft.class00743
 *  minecraft.class02903
 *  minecraft.class03762
 *  minecraft.class06222
 *  minecraft.class06514
 *  minecraft.class06521
 *  minecraft.class06581
 *  minecraft.class06584
 *  net.fabricmc.fabric.impl.item.RecipeRemainderHandler
 */
package minecraft;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import minecraft.class00305;
import minecraft.class00743;
import minecraft.class02903;
import minecraft.class03762;
import minecraft.class05838;
import minecraft.class06222;
import minecraft.class06514;
import minecraft.class06521;
import minecraft.class06581;
import minecraft.class06584;
import net.fabricmc.fabric.impl.item.RecipeRemainderHandler;

public interface class05857
extends class06521<class02903> {
    default public class00305 i() {
        return switch (this.method_45441()) {
            default -> throw new MatchException(null, null);
            case class03762.field_40248 -> class06222.N;
            case class03762.field_40250 -> class06222.L;
            case class03762.field_40249 -> class06222.y;
            case class03762.field_40251 -> class06222.u;
        };
    }

    default public class05838<class05857> u() {
        return class05838.N;
    }

    public static class00743<class06584> y(class02903 class029032) {
        class00743 class007432 = class00743.method_10213((int)class029032.N(), (Object)class06584.E);
        for (int i = 0; i < class007432.size(); ++i) {
            class06584 class065842 = class029032.N(i);
            class06581 class065812 = class05857.N(class065842, objectArray -> {
                WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)1, (String)"[net.minecraft.class_1799]");
                return ((class06584)objectArray[0]).B();
            });
            class065842 = class065812;
            class007432.set(i, (Object)class05857.N((class06581)class065842));
        }
        return class007432;
    }

    private static class06584 N(class06581 class065812) {
        class06584 class065842 = (class06584)RecipeRemainderHandler.REMAINDER_STACK.get();
        RecipeRemainderHandler.REMAINDER_STACK.remove();
        return class065842;
    }

    private static class06581 N(class06584 class065842, Operation operation) {
        RecipeRemainderHandler.REMAINDER_STACK.set(class065842.getRecipeRemainder());
        return (class06581)operation.call(new Object[]{class065842});
    }

    default public class00743<class06584> N(class02903 class029032) {
        return class05857.y(class029032);
    }

    public class06514<? extends class05857> method_8119();

    public class03762 method_45441();
}

