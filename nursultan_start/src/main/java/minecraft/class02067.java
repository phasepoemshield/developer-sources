/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02052
 *  minecraft.class07211
 *  minecraft.class08511
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class02052;
import minecraft.class07211;
import minecraft.class08511;
import org.jspecify.annotations.Nullable;

public final class class02067
extends Record {
    private final @Nullable class07211 cullForDirection;
    private final int tintIndex;
    private final String texture;
    private final @Nullable class02052 uvs;
    private final class08511 rotation;
    public static final int N = -1;

    public String L() {
        return this.texture;
    }

    public class02067(@Nullable class07211 class072112, int n, String string, @Nullable class02052 class020522, class08511 class085112) {
        this.cullForDirection = class072112;
        this.tintIndex = n;
        this.texture = string;
        this.uvs = class020522;
        this.rotation = class085112;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02067.class, "cullForDirection;tintIndex;texture;uvs;rotation", "cullForDirection", "tintIndex", "texture", "uvs", "rotation"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02067.class, "cullForDirection;tintIndex;texture;uvs;rotation", "cullForDirection", "tintIndex", "texture", "uvs", "rotation"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02067.class, "cullForDirection;tintIndex;texture;uvs;rotation", "cullForDirection", "tintIndex", "texture", "uvs", "rotation"}, this);
    }

    public class08511 i() {
        return this.rotation;
    }

    public @Nullable class02052 u() {
        return this.uvs;
    }

    public int y() {
        return this.tintIndex;
    }

    public static float y(class02052 class020522, class08511 class085112, int n) {
        return class020522.y(class085112.y(n)) / 16.0f;
    }

    public @Nullable class07211 N() {
        return this.cullForDirection;
    }

    public static float N(class02052 class020522, class08511 class085112, int n) {
        return class020522.N(class085112.y(n)) / 16.0f;
    }
}

