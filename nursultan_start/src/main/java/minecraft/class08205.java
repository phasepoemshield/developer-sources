/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.shaders.ShaderType
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01894
 */
package minecraft;

import com.mojang.blaze3d.shaders.ShaderType;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class01894;

final class class08205
extends Record {
    private final class01894 id;
    private final ShaderType type;

    class08205(class01894 class018942, ShaderType shaderType) {
        this.id = class018942;
        this.type = shaderType;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08205.class, "id;type", "id", "type"}, this, object);
    }

    public String toString() {
        return String.valueOf(this.id) + " (" + String.valueOf(this.type) + ")";
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08205.class, "id;type", "id", "type"}, this);
    }

    public ShaderType y() {
        return this.type;
    }

    public class01894 N() {
        return this.id;
    }
}

