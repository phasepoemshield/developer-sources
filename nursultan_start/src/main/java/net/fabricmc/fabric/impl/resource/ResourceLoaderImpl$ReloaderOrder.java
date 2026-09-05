/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01894
 */
package net.fabricmc.fabric.impl.resource;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class01894;

final class ResourceLoaderImpl$ReloaderOrder
extends Record {
    final class01894 first;
    final class01894 second;

    ResourceLoaderImpl$ReloaderOrder(class01894 class018942, class01894 class018943) {
        this.first = class018942;
        this.second = class018943;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ResourceLoaderImpl$ReloaderOrder.class, "first;second", "first", "second"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ResourceLoaderImpl$ReloaderOrder.class, "first;second", "first", "second"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ResourceLoaderImpl$ReloaderOrder.class, "first;second", "first", "second"}, this);
    }

    public class01894 first() {
        return this.first;
    }

    public class01894 second() {
        return this.second;
    }
}

