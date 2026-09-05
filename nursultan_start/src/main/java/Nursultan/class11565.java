/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00500
 *  minecraft.class00891
 */
package Nursultan;

import Nursultan.class11556;
import Nursultan.class11579;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Arrays;
import java.util.List;
import minecraft.class00500;
import minecraft.class00891;

public class class11565
extends Record
implements class11579 {
    public int durationTicks;
    public class00891[] blocks;
    public String name;

    public class00891[] L() {
        return this.blocks;
    }

    public class11565(String string, class00891 ... class00891Array) {
        this(string, 300, class00891Array);
    }

    public class11565(String string, int n, class00891 ... class00891Array) {
        this.name = string;
        this.durationTicks = n;
        this.blocks = class00891Array;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class11565.class, "name;durationTicks;blocks", "name", "durationTicks", "blocks"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class11565.class, "name;durationTicks;blocks", "name", "durationTicks", "blocks"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class11565.class, "name;durationTicks;blocks", "name", "durationTicks", "blocks"}, this);
    }

    @Override
    public int y() {
        return this.durationTicks;
    }

    public boolean N(List<class11556> list) {
        List list2 = list.stream().map(class115562 -> class115562.y().i()).toList();
        return Arrays.stream(this.blocks).allMatch(list2::contains);
    }

    public boolean N(class00500 class005002) {
        return Arrays.stream(this.blocks).anyMatch(arg_0 -> ((class00500)class005002).N(arg_0));
    }

    @Override
    public String N() {
        return this.name;
    }
}

