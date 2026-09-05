/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01622
 */
package net.caffeinemc.mods.sodium.client.checks;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import minecraft.class01622;

final class ResourcePackScanner$ScannedResourcePack
extends Record {
    final class01622 resourcePack;
    final ArrayList<String> shaderPrograms;
    final ArrayList<String> shaderIncludes;

    ResourcePackScanner$ScannedResourcePack(class01622 class016222, ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        this.resourcePack = class016222;
        this.shaderPrograms = arrayList;
        this.shaderIncludes = arrayList2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ResourcePackScanner$ScannedResourcePack.class, "resourcePack;shaderPrograms;shaderIncludes", "resourcePack", "shaderPrograms", "shaderIncludes"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ResourcePackScanner$ScannedResourcePack.class, "resourcePack;shaderPrograms;shaderIncludes", "resourcePack", "shaderPrograms", "shaderIncludes"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ResourcePackScanner$ScannedResourcePack.class, "resourcePack;shaderPrograms;shaderIncludes", "resourcePack", "shaderPrograms", "shaderIncludes"}, this);
    }

    public class01622 resourcePack() {
        return this.resourcePack;
    }

    public ArrayList<String> shaderPrograms() {
        return this.shaderPrograms;
    }

    public ArrayList<String> shaderIncludes() {
        return this.shaderIncludes;
    }
}

