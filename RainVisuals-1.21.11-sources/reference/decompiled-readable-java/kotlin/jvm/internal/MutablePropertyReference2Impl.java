/*
 * Decompiled with CFR 0.152.
 */
package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.jvm.internal.ClassBasedDeclarationContainer;
import kotlin.jvm.internal.MutablePropertyReference2;
import kotlin.reflect.KClass;
import kotlin.reflect.KDeclarationContainer;

public class MutablePropertyReference2Impl
extends MutablePropertyReference2 {
    @Override
    public Object get(Object receiver1, Object receiver2) {
        Object[] objectArray = new Object[2];
        objectArray[0] = receiver1;
        objectArray[1] = receiver2;
        return this.getGetter().call(objectArray);
    }

    @SinceKotlin(version="1.4")
    public MutablePropertyReference2Impl(Class owner, String name, String signature, int flags) {
        super(owner, name, signature, flags);
    }

    public void set(Object receiver1, Object receiver2, Object value) {
        Object[] objectArray = new Object[3];
        objectArray[0] = receiver1;
        objectArray[1] = receiver2;
        objectArray[2] = value;
        this.getSetter().call(objectArray);
    }

    public MutablePropertyReference2Impl(KDeclarationContainer owner, String name, String signature) {
        super(((ClassBasedDeclarationContainer)owner).getJClass(), name, signature, owner instanceof KClass ? 0 : 1);
    }
}

