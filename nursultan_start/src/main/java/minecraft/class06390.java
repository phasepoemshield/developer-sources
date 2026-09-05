/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00392
 *  minecraft.class01028
 *  minecraft.class01590
 *  minecraft.class03054
 *  minecraft.class04469
 *  minecraft.class04923
 *  minecraft.class05936
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import minecraft.class00392;
import minecraft.class01028;
import minecraft.class01590;
import minecraft.class03054;
import minecraft.class04469;
import minecraft.class04923;
import minecraft.class05936;
import org.jspecify.annotations.Nullable;

public final class class06390
extends Record {
    private final int addedTime;
    private final class00392 content;
    private final @Nullable class04469 signature;
    private final @Nullable class03054 tag;
    private static final int i = 4;

    public @Nullable class04469 L() {
        return this.signature;
    }

    public class06390(int n, class00392 class003922, @Nullable class04469 class044692, @Nullable class03054 class030542) {
        this.addedTime = n;
        this.content = class003922;
        this.signature = class044692;
        this.tag = class030542;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class06390.class, "addedTime;content;signature;tag", "addedTime", "content", "signature", "tag"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class06390.class, "addedTime;content;signature;tag", "addedTime", "content", "signature", "tag"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class06390.class, "addedTime;content;signature;tag", "addedTime", "content", "signature", "tag"}, this);
    }

    public @Nullable class03054 u() {
        return this.tag;
    }

    public class00392 y() {
        return this.content;
    }

    public List<class01028> N(class01590 class015902, int n) {
        if (this.tag != null && this.tag.R() != null) {
            n -= this.tag.R().field_39766 + 4 + 2;
        }
        return class04923.N((class05936)this.content, (int)n, (class01590)class015902);
    }

    public int N() {
        return this.addedTime;
    }
}

