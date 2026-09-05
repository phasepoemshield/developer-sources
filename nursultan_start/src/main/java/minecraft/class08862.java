/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.shaders.ShaderType
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01894
 *  minecraft.class08227
 */
package minecraft;

import com.mojang.blaze3d.shaders.ShaderType;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class01894;
import minecraft.class08227;

final class class08862
extends Record {
    final class01894 id;
    final ShaderType type;
    final class08227 defines;

    public class08227 L() {
        return this.defines;
    }

    class08862(class01894 class018942, ShaderType shaderType, class08227 class082272) {
        this.id = class018942;
        this.type = shaderType;
        this.defines = class082272;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08862.class, "id;type;defines", "id", "type", "defines"}, this, object);
    }

    public String toString() {
        String string = String.valueOf(this.id) + " (" + String.valueOf(this.type) + ")";
        if (!this.defines.L()) {
            return string + " with " + String.valueOf(this.defines);
        }
        return string;
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08862.class, "id;type;defines", "id", "type", "defines"}, this);
    }

    public ShaderType y() {
        return this.type;
    }

    public class01894 N() {
        return this.id;
    }
}

