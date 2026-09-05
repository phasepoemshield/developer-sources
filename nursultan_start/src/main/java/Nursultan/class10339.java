/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00751
 *  minecraft.class01921
 *  minecraft.class01929
 *  minecraft.class03767
 *  minecraft.class04348
 *  minecraft.class05946
 */
package Nursultan;

import java.util.Optional;
import java.util.stream.Stream;
import minecraft.class00751;
import minecraft.class01921;
import minecraft.class01929;
import minecraft.class03767;
import minecraft.class04348;
import minecraft.class05946;

public class class10339
implements class04348 {
    final /* synthetic */ class01929 N;
    final /* synthetic */ class03767 y;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public class10339(class01929 class019292, class03767 class037672) {
        this.N = class019292;
        this.y = class037672;
    }

    public Stream<class05946<? extends class00751<?>>> y() {
        return this.N.y();
    }

    public class03767 N() {
        return this.y;
    }

    public <T> Optional<class01921<T>> method_46759(class05946<? extends class00751<? extends T>> class059462) {
        return this.N.method_46759(class059462).map(class019212 -> class019212.N(this.y));
    }
}

