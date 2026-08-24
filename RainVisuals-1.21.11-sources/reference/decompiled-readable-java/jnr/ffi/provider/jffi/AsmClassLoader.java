/*
 * Decompiled with CFR 0.152.
 */
package jnr.ffi.provider.jffi;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

final class AsmClassLoader
extends ClassLoader {
    private final ConcurrentMap<String, Class> definedClasses = new ConcurrentHashMap<String, Class>();

    /*
     * WARNING - void declaration
     */
    public Class defineClass(String name, byte[] b2) {
        void var3_3;
        Class<?> klass = this.defineClass(name, b2, 0, b2.length);
        this.definedClasses.putIfAbsent(name, klass);
        this.resolveClass(klass);
        return var3_3;
    }

    public AsmClassLoader() {
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        Class klass = (Class)this.definedClasses.get(name);
        if (klass != null) {
            return klass;
        }
        return super.findClass(name);
    }

    public AsmClassLoader(ClassLoader parent) {
        super(parent);
    }
}

