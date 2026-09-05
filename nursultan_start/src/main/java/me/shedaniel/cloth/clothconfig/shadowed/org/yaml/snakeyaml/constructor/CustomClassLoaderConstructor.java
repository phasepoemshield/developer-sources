/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.constructor;

import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.constructor.Constructor;

public class CustomClassLoaderConstructor
extends Constructor {
    private ClassLoader loader = CustomClassLoaderConstructor.class.getClassLoader();

    public CustomClassLoaderConstructor(ClassLoader classLoader) {
        this(Object.class, classLoader);
    }

    public CustomClassLoaderConstructor(Class<? extends Object> clazz, ClassLoader classLoader) {
        super(clazz);
        if (classLoader == null) {
            throw new NullPointerException("Loader must be provided.");
        }
        this.loader = classLoader;
    }

    @Override
    protected Class<?> getClassForName(String string) throws ClassNotFoundException {
        return Class.forName(string, true, this.loader);
    }
}

