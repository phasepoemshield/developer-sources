/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00751
 *  minecraft.class01921
 *  minecraft.class01929
 *  minecraft.class05946
 */
package Nursultan;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;
import minecraft.class00751;
import minecraft.class01921;
import minecraft.class01929;
import minecraft.class05946;

public class class09547
implements class01929 {
    final /* synthetic */ Map N;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public class09547(Map map) {
        this.N = map;
    }

    public Stream<class05946<? extends class00751<?>>> y() {
        return this.N.keySet().stream();
    }

    public <T> Optional<class01921<T>> method_46759(class05946<? extends class00751<? extends T>> class059462) {
        return Optional.ofNullable((class01921)this.N.get(class059462));
    }
}

