/*
 * Decompiled with CFR 0.152.
 */
package net.lenni0451.reflect.stream.general;

import java.lang.reflect.Modifier;

public class ModifierWrapper {
    private final int modifier;

    public boolean isVolatile() {
        return Modifier.isVolatile(this.modifier);
    }

    public boolean isPrivate() {
        return Modifier.isPrivate(this.modifier);
    }

    public boolean isNative() {
        return Modifier.isNative(this.modifier);
    }

    public boolean isAbstract() {
        return Modifier.isAbstract(this.modifier);
    }

    public ModifierWrapper(int modifier) {
        this.modifier = modifier;
    }

    public boolean isFinal() {
        return Modifier.isFinal(this.modifier);
    }

    public boolean isStatic() {
        return Modifier.isStatic(this.modifier);
    }

    public boolean isPublic() {
        return Modifier.isPublic(this.modifier);
    }

    public boolean isProtected() {
        return Modifier.isProtected(this.modifier);
    }

    public boolean isSynchronized() {
        return Modifier.isSynchronized(this.modifier);
    }

    public boolean isTransient() {
        return Modifier.isTransient(this.modifier);
    }

    public boolean isStrict() {
        return Modifier.isStrict(this.modifier);
    }

    public int raw() {
        return this.modifier;
    }
}

