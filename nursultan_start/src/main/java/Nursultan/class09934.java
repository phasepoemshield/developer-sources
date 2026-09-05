/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import Nursultan.class09926;
import Nursultan.class09935;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.Objects;

public final class class09934
extends Record
implements class09935 {
    private final class09926 mask;
    private final List<class09935> children;

    public class09934(class09926 class099262, List<class09935> list) {
        Objects.requireNonNull(class099262, "mask");
        Objects.requireNonNull(list, "children");
        this.mask = class099262;
        this.children = list;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09934.class, "mask;children", "mask", "children"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09934.class, "mask;children", "mask", "children"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09934.class, "mask;children", "mask", "children"}, this);
    }

    public List<class09935> y() {
        return this.children;
    }

    public class09926 N() {
        return this.mask;
    }
}

