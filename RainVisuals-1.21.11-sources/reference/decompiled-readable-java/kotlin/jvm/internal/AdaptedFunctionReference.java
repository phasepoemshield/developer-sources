/*
 * Decompiled with CFR 0.152.
 */
package kotlin.jvm.internal;

import java.io.Serializable;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionBase;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;

@SinceKotlin(version="1.4")
public class AdaptedFunctionReference
implements Serializable,
FunctionBase {
    private final boolean isTopLevel;
    private final Class owner;
    private final int arity;
    private final int flags;
    protected final Object receiver;
    private final String signature;
    private final String name;

    public AdaptedFunctionReference(int arity, Class owner, String name, String signature, int flags) {
        this(arity, CallableReference.NO_RECEIVER, owner, name, signature, flags);
    }

    public KDeclarationContainer getOwner() {
        return this.owner == null ? null : (this.isTopLevel ? Reflection.getOrCreateKotlinPackage(this.owner) : Reflection.getOrCreateKotlinClass(this.owner));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AdaptedFunctionReference)) {
            return false;
        }
        AdaptedFunctionReference other = (AdaptedFunctionReference)o;
        if (this.isTopLevel != other.isTopLevel) return false;
        if (this.arity != other.arity) return false;
        if (this.flags != other.flags) return false;
        if (!Intrinsics.areEqual(this.receiver, other.receiver)) return false;
        if (!Intrinsics.areEqual(this.owner, other.owner)) return false;
        if (!this.name.equals(other.name)) return false;
        if (!this.signature.equals(other.signature)) return false;
        return true;
    }

    @Override
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        return Reflection.renderLambdaToString(this);
    }

    public AdaptedFunctionReference(int arity, Object receiver, Class owner, String name, String signature, int flags) {
        this.receiver = receiver;
        this.owner = owner;
        this.name = name;
        this.signature = signature;
        this.isTopLevel = (flags & 1) == 1;
        this.arity = arity;
        this.flags = flags >> 1;
    }

    public int hashCode() {
        int result = this.receiver != null ? this.receiver.hashCode() : 0;
        result = result * 31 + (this.owner != null ? this.owner.hashCode() : 0);
        result = result * 31 + this.name.hashCode();
        result = result * 31 + this.signature.hashCode();
        result = result * 31 + (this.isTopLevel ? 1231 : 1237);
        result = result * 31 + this.arity;
        int n = result * 31 + this.flags;
        return n;
    }
}

