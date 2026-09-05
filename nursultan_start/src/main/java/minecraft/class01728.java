/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01878
 *  minecraft.class01894
 *  minecraft.class07001
 *  minecraft.class07684
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.brigadier.CommandDispatcher;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import minecraft.class01716;
import minecraft.class01747;
import minecraft.class01878;
import minecraft.class01894;
import minecraft.class07001;
import minecraft.class07684;
import org.jspecify.annotations.Nullable;

public final class class01728<T>
extends Record
implements class01747<T>,
class07684<T> {
    private final class01894 id;
    private final List<class01716<T>> entries;

    public class01728(class01894 class018942, List<class01716<T>> list) {
        this.id = class018942;
        this.entries = list;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class01728.class, "id;entries", "id", "entries"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class01728.class, "id;entries", "id", "entries"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class01728.class, "id;entries", "id", "entries"}, this);
    }

    @Override
    public List<class01716<T>> y() {
        return this.entries;
    }

    @Override
    public class01894 N() {
        return this.id;
    }

    public class01747<T> N(@Nullable class07001 class070012, CommandDispatcher<T> commandDispatcher) throws class01878 {
        return this;
    }
}

