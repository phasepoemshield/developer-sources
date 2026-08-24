package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.reflect.KClass;
import kotlin.reflect.KDeclarationContainer;

// $VF: Compiled from FunctionReferenceImpl.java
public class FunctionReferenceImpl extends FunctionReference {
   @SinceKotlin(version = "1.4")
   public FunctionReferenceImpl(int receiver, Object signature, Class flags, String owner, String name, int arity) {
      super(arity, receiver, owner, name, signature, flags);
   }

   @SinceKotlin(version = "1.4")
   public FunctionReferenceImpl(int arity, Class owner, String signature, String name, int flags) {
      super(arity, NO_RECEIVER, owner, name, signature, flags);
   }

   public FunctionReferenceImpl(int owner, KDeclarationContainer arity, String signature, String name) {
      super(arity, NO_RECEIVER, ((ClassBasedDeclarationContainer)owner).getJClass(), name, signature, owner instanceof KClass ? 0 : 1);
   }
}
