/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01894
 *  minecraft.class04891
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class01894;
import minecraft.class04891;

public final class class08963
extends Record {
    private final class04891 spinHeadSound;
    private final class04891 hurtSound;
    private final class04891 deathSound;
    private final class04891 stepSound;
    private final class01894 texture;
    private final class01894 eyeTexture;

    public class04891 L() {
        return this.deathSound;
    }

    public class08963(class04891 class048912, class04891 class048913, class04891 class048914, class04891 class048915, class01894 class018942, class01894 class018943) {
        this.spinHeadSound = class048912;
        this.hurtSound = class048913;
        this.deathSound = class048914;
        this.stepSound = class048915;
        this.texture = class018942;
        this.eyeTexture = class018943;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08963.class, "spinHeadSound;hurtSound;deathSound;stepSound;texture;eyeTexture", "spinHeadSound", "hurtSound", "deathSound", "stepSound", "texture", "eyeTexture"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08963.class, "spinHeadSound;hurtSound;deathSound;stepSound;texture;eyeTexture", "spinHeadSound", "hurtSound", "deathSound", "stepSound", "texture", "eyeTexture"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08963.class, "spinHeadSound;hurtSound;deathSound;stepSound;texture;eyeTexture", "spinHeadSound", "hurtSound", "deathSound", "stepSound", "texture", "eyeTexture"}, this);
    }

    public class01894 i() {
        return this.texture;
    }

    public class04891 u() {
        return this.stepSound;
    }

    public class04891 y() {
        return this.hurtSound;
    }

    public class04891 N() {
        return this.spinHeadSound;
    }

    public class01894 R() {
        return this.eyeTexture;
    }
}

