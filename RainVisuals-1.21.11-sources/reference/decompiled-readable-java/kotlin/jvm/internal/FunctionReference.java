/*
 * Decompiled with CFR 0.152.
 */
package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionBase;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KCallable;
import kotlin.reflect.KFunction;

public class FunctionReference
extends CallableReference
implements FunctionBase,
KFunction {
    @SinceKotlin(version="1.4")
    private final int flags;
    private final int arity;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FunctionReference) {
            FunctionReference other = (FunctionReference)obj;
            if (!this.getName().equals(other.getName())) return false;
            if (!this.getSignature().equals(other.getSignature())) return false;
            if (this.flags != other.flags) return false;
            if (this.arity != other.arity) return false;
            if (!Intrinsics.areEqual(this.getBoundReceiver(), other.getBoundReceiver())) return false;
            if (!Intrinsics.areEqual(this.getOwner(), other.getOwner())) return false;
            return true;
        }
        if (!(obj instanceof KFunction)) return false;
        return obj.equals(this.compute());
    }

    @Override
    @SinceKotlin(version="1.1")
    public boolean isOperator() {
        return this.getReflected().isOperator();
    }

    @Override
    @SinceKotlin(version="1.1")
    protected KFunction getReflected() {
        return (KFunction)super.getReflected();
    }

    public String toString() {
        KCallable reflected = this.compute();
        if (reflected != this) {
            return reflected.toString();
        }
        return "<init>".equals(this.getName()) ? "constructor (Kotlin reflection is not available)" : "function " + this.getName() + " (Kotlin reflection is not available)";
    }

    @Override
    @SinceKotlin(version="1.1")
    public boolean isSuspend() {
        return this.getReflected().isSuspend();
    }

    @SinceKotlin(version="1.1")
    public FunctionReference(int arity, Object receiver) {
        this(arity, receiver, null, null, null, 0);
    }

    @SinceKotlin(version="1.4")
    public FunctionReference(int arity, Object receiver, Class owner, String name, String signature, int flags) {
        super(receiver, owner, name, signature, (flags & 1) == 1);
        this.arity = arity;
        this.flags = flags >> 1;
    }

    @Override
    @SinceKotlin(version="1.1")
    public boolean isExternal() {
        return this.getReflected().isExternal();
    }

    public FunctionReference(int arity) {
        this(arity, NO_RECEIVER, null, null, null, 0);
    }

    @Override
    @SinceKotlin(version="1.1")
    public boolean isInfix() {
        return this.getReflected().isInfix();
    }

    @Override
    public int getArity() {
        return this.arity;
    }

    @Override
    @SinceKotlin(version="1.1")
    public boolean isInline() {
        return this.getReflected().isInline();
    }

    public int hashCode() {
        return ((this.getOwner() == null ? 0 : this.getOwner().hashCode() * 31) + this.getName().hashCode()) * 31 + this.getSignature().hashCode();
    }

    @Override
    @SinceKotlin(version="1.1")
    protected KCallable computeReflected() {
        return Reflection.function(this);
    }
}

