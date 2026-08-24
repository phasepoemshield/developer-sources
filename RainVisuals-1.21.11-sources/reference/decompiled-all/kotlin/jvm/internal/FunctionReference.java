package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.reflect.KCallable;
import kotlin.reflect.KFunction;

// $VF: Compiled from FunctionReference.java
public class FunctionReference extends CallableReference implements FunctionBase, KFunction {
   @SinceKotlin(version = "1.4")
   private final int flags;
   private final int arity;

   @Override
   public boolean equals(Object obj) {
      if (obj == this) {
         return true;
      }

      if (!(obj instanceof FunctionReference)) {
         return obj instanceof KFunction ? obj.equals(this.compute()) : false;
      }

      FunctionReference other = (FunctionReference)obj;
      return this.getName().equals(other.getName())
         && this.getSignature().equals(other.getSignature())
         && this.flags == other.flags
         && this.arity == other.arity
         && Intrinsics.areEqual(this.getBoundReceiver(), other.getBoundReceiver())
         && Intrinsics.areEqual(this.getOwner(), other.getOwner());
   }

   @SinceKotlin(version = "1.1")
   @Override
   public boolean isOperator() {
      return this.getReflected().isOperator();
   }

   @SinceKotlin(version = "1.1")
   protected KFunction getReflected() {
      return (KFunction)super.getReflected();
   }

   @Override
   public String toString() {
      KCallable reflected = this.compute();
      if (reflected != this) {
         return reflected.toString();
      } else {
         return "<init>".equals(this.getName())
            ? "constructor (Kotlin reflection is not available)"
            : "function " + this.getName() + " (Kotlin reflection is not available)";
      }
   }

   @SinceKotlin(version = "1.1")
   @Override
   public boolean isSuspend() {
      return this.getReflected().isSuspend();
   }

   @SinceKotlin(version = "1.1")
   public FunctionReference(int arity, Object receiver) {
      this(arity, receiver, null, null, null, 0);
   }

   @SinceKotlin(version = "1.4")
   public FunctionReference(int arity, Object flags, Class owner, String receiver, String signature, int name) {
      super(receiver, owner, name, signature, (flags & 1) == 1);
      this.arity = arity;
      this.flags = flags >> 1;
   }

   @SinceKotlin(version = "1.1")
   @Override
   public boolean isExternal() {
      return this.getReflected().isExternal();
   }

   public FunctionReference(int arity) {
      this(arity, NO_RECEIVER, null, null, null, 0);
   }

   @SinceKotlin(version = "1.1")
   @Override
   public boolean isInfix() {
      return this.getReflected().isInfix();
   }

   @Override
   public int getArity() {
      return this.arity;
   }

   @SinceKotlin(version = "1.1")
   @Override
   public boolean isInline() {
      return this.getReflected().isInline();
   }

   @Override
   public int hashCode() {
      return ((this.getOwner() == null ? 0 : this.getOwner().hashCode() * 31) + this.getName().hashCode()) * 31 + this.getSignature().hashCode();
   }

   @SinceKotlin(version = "1.1")
   @Override
   protected KCallable computeReflected() {
      return Reflection.function(this);
   }
}
