/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class00394
 *  minecraft.class05033
 *  minecraft.class05887
 *  minecraft.class05915
 *  minecraft.class05919
 *  minecraft.class06333
 *  minecraft.class06584
 *  minecraft.class07049
 *  minecraft.class07491
 */
package minecraft;

import com.mojang.serialization.Codec;
import java.util.function.Function;
import minecraft.class00394;
import minecraft.class05033;
import minecraft.class05887;
import minecraft.class05915;
import minecraft.class05919;
import minecraft.class06333;
import minecraft.class06584;
import minecraft.class06841;
import minecraft.class07049;
import minecraft.class07491;

public final class class06850<R> {
    private final class06333<String, class06841<R>> N = new class06333();

    public class06850<R> L(Function<? super class07491<? extends class06584>, ? extends class06841<R>> function) {
        return this.N((class05033[])class05915.values(), (T class059152) -> (class06841)function.apply((class07491<? extends class06584>)class059152.N()));
    }

    class06850() {
    }

    public class06850<R> y(Function<? super class07491<? extends class00394>, ? extends class06841<R>> function) {
        return this.N((class05033[])class05887.values(), (T class058872) -> (class06841)function.apply((class07491<? extends class00394>)class058872.N()));
    }

    Codec<class06841<R>> N() {
        return this.N.N((Codec)Codec.STRING);
    }

    public <T extends class05033> class06850<R> N(T[] TArray, Function<T, ? extends class06841<R>> function) {
        return this.N(TArray, class05033::method_15434, function);
    }

    public <T extends class05033 & class06841<? extends R>> class06850<R> N(T[] TArray) {
        return this.N((class05033[])TArray, (T object) -> class06841.N((class06841)object));
    }

    public class06850<R> N(Function<? super class07491<? extends class07049>, ? extends class06841<R>> function) {
        return this.N((class05033[])class05919.values(), (T class059192) -> (class06841)function.apply((class07491<? extends class07049>)class059192.N()));
    }

    public <T> class06850<R> N(T[] TArray, Function<T, String> function, Function<T, ? extends class06841<R>> function2) {
        for (T t : TArray) {
            this.N.N((Object)function.apply(t), function2.apply(t));
        }
        return this;
    }
}

