/*
 * Decompiled with CFR 0.152.
 */
package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KCallable;
import kotlin.reflect.KProperty;

public abstract class PropertyReference
extends CallableReference
implements KProperty {
    private final boolean syntheticJavaProperty;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PropertyReference) {
            PropertyReference other = (PropertyReference)obj;
            if (!this.getOwner().equals(other.getOwner())) return false;
            if (!this.getName().equals(other.getName())) return false;
            if (!this.getSignature().equals(other.getSignature())) return false;
            if (!Intrinsics.areEqual(this.getBoundReceiver(), other.getBoundReceiver())) return false;
            return true;
        }
        if (!(obj instanceof KProperty)) return false;
        return obj.equals(this.compute());
    }

    @Override
    @SinceKotlin(version="1.1")
    public boolean isConst() {
        return this.getReflected().isConst();
    }

    public int hashCode() {
        return (this.getOwner().hashCode() * 31 + this.getName().hashCode()) * 31 + this.getSignature().hashCode();
    }

    @Override
    @SinceKotlin(version="1.1")
    protected KProperty getReflected() {
        if (this.syntheticJavaProperty) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties");
        }
        return (KProperty)super.getReflected();
    }

    public String toString() {
        KCallable reflected = this.compute();
        if (reflected != this) {
            return reflected.toString();
        }
        return "property " + this.getName() + " (Kotlin reflection is not available)";
    }

    @Override
    @SinceKotlin(version="1.1")
    public boolean isLateinit() {
        return this.getReflected().isLateinit();
    }

    public PropertyReference() {
        this.syntheticJavaProperty = false;
    }

    @Override
    public KCallable compute() {
        return this.syntheticJavaProperty ? this : super.compute();
    }

    @SinceKotlin(version="1.4")
    public PropertyReference(Object receiver, Class owner, String name, String signature, int flags) {
        super(receiver, owner, name, signature, (flags & 1) == 1);
        this.syntheticJavaProperty = (flags & 2) == 2;
    }

    @SinceKotlin(version="1.1")
    public PropertyReference(Object receiver) {
        super(receiver);
        this.syntheticJavaProperty = false;
    }
}

