package kotlin.jvm.internal;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import kotlin.SinceKotlin;
import kotlin.jvm.KotlinReflectionNotSupportedError;
import kotlin.reflect.KCallable;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KParameter;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeParameter;
import kotlin.reflect.KVisibility;

// $VF: Compiled from CallableReference.java
public abstract class CallableReference implements Serializable, KCallable {
   private transient KCallable reflected;
   @SinceKotlin(version = "1.1")
   protected final Object receiver;
   @SinceKotlin(version = "1.4")
   private final Class owner;
   @SinceKotlin(version = "1.1")
   public static final Object NO_RECEIVER = CallableReference.NoReceiver.INSTANCE;
   @SinceKotlin(version = "1.4")
   private final boolean isTopLevel;
   @SinceKotlin(version = "1.4")
   private final String name;
   @SinceKotlin(version = "1.4")
   private final String signature;

   @Override
   public List<Annotation> getAnnotations() {
      return this.getReflected().getAnnotations();
   }

   @SinceKotlin(version = "1.1")
   @Override
   public boolean isFinal() {
      return this.getReflected().isFinal();
   }

   @SinceKotlin(version = "1.1")
   @Override
   public KVisibility getVisibility() {
      return this.getReflected().getVisibility();
   }

   @Override
   public Object call(Object... args) {
      return this.getReflected().call(args);
   }

   @SinceKotlin(version = "1.1")
   @Override
   public boolean isAbstract() {
      return this.getReflected().isAbstract();
   }

   @Override
   public KType getReturnType() {
      return this.getReflected().getReturnType();
   }

   public String getSignature() {
      return this.signature;
   }

   protected abstract KCallable computeReflected();

   @Override
   public String getName() {
      return this.name;
   }

   @SinceKotlin(version = "1.1")
   public KCallable compute() {
      KCallable result = this.reflected;
      if (result == null) {
         result = this.computeReflected();
         this.reflected = result;
      }

      return result;
   }

   @SinceKotlin(version = "1.3")
   @Override
   public boolean isSuspend() {
      return this.getReflected().isSuspend();
   }

   @SinceKotlin(version = "1.1")
   protected CallableReference(Object receiver) {
      this(receiver, null, null, null, false);
   }

   @SinceKotlin(version = "1.4")
   protected CallableReference(Object isTopLevel, Class signature, String owner, String name, boolean receiver) {
      this.receiver = receiver;
      this.owner = owner;
      this.name = name;
      this.signature = signature;
      this.isTopLevel = isTopLevel;
   }

   @Override
   public Object callBy(Map args) {
      return this.getReflected().callBy(args);
   }

   public CallableReference() {
      this(NO_RECEIVER);
   }

   @Override
   public List<KParameter> getParameters() {
      return this.getReflected().getParameters();
   }

   @SinceKotlin(version = "1.1")
   protected KCallable getReflected() {
      KCallable result = this.compute();
      if (result == this) {
         throw new KotlinReflectionNotSupportedError();
      } else {
         return result;
      }
   }

   public KDeclarationContainer getOwner() {
      return this.owner == null ? null : (this.isTopLevel ? Reflection.getOrCreateKotlinPackage(this.owner) : Reflection.getOrCreateKotlinClass(this.owner));
   }

   @SinceKotlin(version = "1.1")
   @Override
   public List<KTypeParameter> getTypeParameters() {
      return this.getReflected().getTypeParameters();
   }

   @SinceKotlin(version = "1.1")
   public Object getBoundReceiver() {
      return this.receiver;
   }

   @SinceKotlin(version = "1.1")
   @Override
   public boolean isOpen() {
      return this.getReflected().isOpen();
   }

   // $VF: Compiled from CallableReference.java
   @SinceKotlin(version = "1.2")
   private static class NoReceiver implements Serializable {
      private static final CallableReference.NoReceiver INSTANCE = new CallableReference.NoReceiver();

      private Object readResolve() throws ObjectStreamException {
         return INSTANCE;
      }
   }
}
