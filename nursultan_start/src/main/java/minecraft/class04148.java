/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00751
 *  minecraft.class01225
 *  minecraft.class01929
 *  minecraft.class01996
 *  minecraft.class03530
 *  minecraft.class05946
 *  minecraft.class07028
 *  minecraft.class07034
 *  minecraft.class08292
 */
package minecraft;

import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import minecraft.class00751;
import minecraft.class01225;
import minecraft.class01929;
import minecraft.class01996;
import minecraft.class03530;
import minecraft.class05946;
import minecraft.class07028;
import minecraft.class07034;
import minecraft.class08292;

public abstract class class04148<T>
extends class07028<T> {
    private final Function<T, class05946<T>> N;

    public class04148(class01996 class019962, class05946<? extends class00751<T>> class059462, CompletableFuture<class01929> completableFuture, Function<T, class05946<T>> function) {
        super(class019962, class059462, completableFuture);
        this.N = function;
    }

    public class04148(class01996 class019962, class05946<? extends class00751<T>> class059462, CompletableFuture<class01929> completableFuture, CompletableFuture<class07034<T>> completableFuture2, Function<T, class05946<T>> function) {
        super(class019962, class059462, completableFuture, completableFuture2);
        this.N = function;
    }

    public class08292<T, T> N(class03530<T> class035302) {
        return class08292.N((class01225)this.method_27169(class035302)).N(this.N);
    }
}

