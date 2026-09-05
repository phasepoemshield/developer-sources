/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.Keyable
 *  minecraft.class05033
 */
package Nursultan;

import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Keyable;
import java.util.Arrays;
import java.util.stream.Stream;
import minecraft.class05033;

public class class10486
implements Keyable {
    final /* synthetic */ class05033[] N;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public class10486(class05033[] class05033Array) {
        this.N = class05033Array;
    }

    public <T> Stream<T> keys(DynamicOps<T> dynamicOps) {
        return Arrays.stream(this.N).map(class05033::method_15434).map(arg_0 -> dynamicOps.createString(arg_0));
    }
}

