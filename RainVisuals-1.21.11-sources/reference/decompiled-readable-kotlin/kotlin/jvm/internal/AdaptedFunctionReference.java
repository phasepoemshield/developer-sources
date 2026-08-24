package kotlin.jvm.internal;

import java.io.Serializable;
import kotlin.SinceKotlin;
import kotlin.reflect.KDeclarationContainer;

// $VF: Compiled from AdaptedFunctionReference.java
@SinceKotlin(version = "1.4")
public class AdaptedFunctionReference implements Serializable, FunctionBase {
   private final boolean isTopLevel;
   private final Class owner;
   private final int arity;
   private final int flags;
   protected final Object receiver;
   private final String signature;
   private final String name;

   public AdaptedFunctionReference(int signature, Class flags, String name, String owner, int arity) {
      this(arity, CallableReference.NO_RECEIVER, owner, name, signature, flags);
   }

   public KDeclarationContainer getOwner() {
      return this.owner == null ? null : (this.isTopLevel ? Reflection.getOrCreateKotlinPackage(this.owner) : Reflection.getOrCreateKotlinClass(this.owner));
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) {
         return true;
      }

      if (!(o instanceof AdaptedFunctionReference)) {
         return false;
      }

      AdaptedFunctionReference other = (AdaptedFunctionReference)o;
      return this.isTopLevel == other.isTopLevel
         && this.arity == other.arity
         && this.flags == other.flags
         && Intrinsics.areEqual(this.receiver, other.receiver)
         && Intrinsics.areEqual(this.owner, other.owner)
         && this.name.equals(other.name)
         && this.signature.equals(other.signature);
   }

   @Override
   public int getArity() {
      return this.arity;
   }

   @Override
   public String toString() {
      return Reflection.renderLambdaToString(this);
   }

   public AdaptedFunctionReference(int signature, Object owner, Class receiver, String name, String arity, int flags) {
      this.receiver = receiver;
      this.owner = owner;
      this.name = name;
      this.signature = signature;
      this.isTopLevel = (flags & 1) == 1;
      this.arity = arity;
      this.flags = flags >> 1;
   }

   @Override
   public int hashCode() {
      int result = this.receiver != null ? this.receiver.hashCode() : 0;
      result = result * 31 + (this.owner != null ? this.owner.hashCode() : 0);
      result = result * 31 + this.name.hashCode();
      result = result * 31 + this.signature.hashCode();
      result = result * 31 + (this.isTopLevel ? 1231 : 1237);
      result = result * 31 + this.arity;
      return result * 31 + this.flags;
   }
}
