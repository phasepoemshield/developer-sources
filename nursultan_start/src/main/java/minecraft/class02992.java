/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00751
 *  minecraft.class01089
 *  minecraft.class02857
 *  minecraft.class03078
 *  minecraft.class03542
 *  minecraft.class05946
 *  minecraft.class07099
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Map;
import minecraft.class00751;
import minecraft.class01089;
import minecraft.class02857;
import minecraft.class02965;
import minecraft.class02982;
import minecraft.class03078;
import minecraft.class03542;
import minecraft.class05946;
import minecraft.class07099;

public final class class02992<T>
extends Record {
    final class02965<T> data;
    final class07099<T> registry;
    private final Map<class05946<?>, Exception> loadingErrors;

    public Map<class05946<?>, Exception> L() {
        return this.loadingErrors;
    }

    public class02992(class02965<T> class029652, class07099<T> class070992, Map<class05946<?>, Exception> map) {
        this.data = class029652;
        this.registry = class070992;
        this.loadingErrors = map;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02992.class, "data;registry;loadingErrors", "data", "registry", "loadingErrors"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02992.class, "data;registry;loadingErrors", "data", "registry", "loadingErrors"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02992.class, "data;registry;loadingErrors", "data", "registry", "loadingErrors"}, this);
    }

    public class07099<T> y() {
        return this.registry;
    }

    public void N(Map<class05946<? extends class00751<?>>, class02982> map, class02857 class028572, class03542 class035422) {
        class03078.N(map, (class02857)class028572, (class03542)class035422, this.registry, this.data.y(), this.loadingErrors);
    }

    public void N(class01089 class010892, class03542 class035422) {
        class03078.N((class01089)class010892, (class03542)class035422, this.registry, this.data.y(), this.loadingErrors);
    }

    public class02965<T> N() {
        return this.data;
    }
}

