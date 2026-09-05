/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00751
 *  minecraft.class01012
 *  minecraft.class01022
 *  minecraft.class05946
 */
package Nursultan;

import java.util.Optional;
import java.util.stream.Stream;
import minecraft.class00751;
import minecraft.class01012;
import minecraft.class01022;
import minecraft.class05946;

public class class09431
implements class01022 {
    final /* synthetic */ class00751 L;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public class09431(class00751 class007512) {
        this.L = class007512;
    }

    public <T> Optional<class00751<T>> method_46759(class05946<? extends class00751<? extends T>> class059462) {
        return this.L.M(class059462);
    }

    public Stream<class01012<?>> method_40311() {
        return this.L.Z().stream().map(class01012::N);
    }

    public class01022 method_40316() {
        return this;
    }
}

