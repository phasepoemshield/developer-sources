/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.arguments.StringArgumentType
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00390
 *  minecraft.class00392
 *  minecraft.class00395
 *  minecraft.class00401
 *  minecraft.class01283
 *  minecraft.class06541
 */
package minecraft;

import com.mojang.brigadier.arguments.StringArgumentType;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class00390;
import minecraft.class00392;
import minecraft.class00395;
import minecraft.class00401;
import minecraft.class01283;
import minecraft.class02298;
import minecraft.class06541;

public final class class02267
extends Record {
    private final String id;
    private final class00392 title;
    private final class01283 source;
    private final Optional<class02298> knownPackInfo;

    public class01283 L() {
        return this.source;
    }

    public class02267(String string, class00392 class003922, class01283 class012832, Optional<class02298> optional) {
        this.id = string;
        this.title = class003922;
        this.source = class012832;
        this.knownPackInfo = optional;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02267.class, "id;title;source;knownPackInfo", "id", "title", "source", "knownPackInfo"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02267.class, "id;title;source;knownPackInfo", "id", "title", "source", "knownPackInfo"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02267.class, "id;title;source;knownPackInfo", "id", "title", "source", "knownPackInfo"}, this);
    }

    public Optional<class02298> u() {
        return this.knownPackInfo;
    }

    public class00392 y() {
        return this.title;
    }

    public String N() {
        return this.id;
    }

    public class00392 N(boolean bl, class00392 class003922) {
        return class00390.N((class00392)this.source.method_45282((class00392)class00392.y((String)this.id))).N(class004052 -> class004052.N(bl ? class06541.field_1060 : class06541.field_1061).N(StringArgumentType.escapeIfRequired((String)this.id)).N((class00395)new class00401((class00392)class00392.i().y(this.title).i("\n").y(class003922))));
    }
}

