package jnr.ffi.util;

import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

// $VF: Compiled from AnnotationProxy.java
public final class AnnotationProxy<A extends Annotation> implements Annotation, InvocationHandler {
   private final A proxedAnnotation;
   private static final int MEMBER_NAME_MULTIPLICATOR = 127;
   private final Map<String, AnnotationProperty> properties = new LinkedHashMap<>();
   private final Class<A> annotationType;

   @Override
   public int hashCode() {
      int hashCode = 0;

      for (Entry<String, AnnotationProperty> property : this.properties.entrySet()) {
         hashCode += 127 * ((String)property.getKey()).hashCode() ^ ((AnnotationProperty)property.getValue()).getValueHashCode();
      }

      return hashCode;
   }

   @Override
   public Object invoke(Object proxy, Method args, Object[] method) throws Throwable {
      String name = method.getName();
      return this.properties.containsKey(name) ? this.properties.get(name).getValue() : method.invoke(this, args);
   }

   private AnnotationProxy(Class<A> annotationType) {
      this.annotationType = annotationType;

      for (Method method : getDeclaredMethods(annotationType)) {
         String propertyName = method.getName();
         Class<?> returnType = method.getReturnType();
         Object defaultValue = method.getDefaultValue();
         AnnotationProperty property = new AnnotationProperty(propertyName, returnType);
         property.setValue(defaultValue);
         this.properties.put(propertyName, property);
      }

      this.proxedAnnotation = annotationType.cast(Proxy.newProxyInstance(annotationType.getClassLoader(), new Class[]{annotationType}, this));
   }

   private static AnnotationProxy<?> getAnnotationProxy(Object obj) {
      if (Proxy.isProxyClass(obj.getClass())) {
         InvocationHandler handler = Proxy.getInvocationHandler(obj);
         if (handler instanceof AnnotationProxy) {
            return (AnnotationProxy<?>)handler;
         }
      }

      return null;
   }

   public void setProperty(String name, Object value) {
      if (name == null) {
         throw new IllegalArgumentException("Parameter 'name' must be not null");
      }

      if (value == null) {
         throw new IllegalArgumentException("Parameter 'value' must be not null");
      }

      if (!this.properties.containsKey(name)) {
         throw new IllegalArgumentException("Annotation '" + this.annotationType.getName() + "' does not contain a property named '" + name + "'");
      }

      this.properties.get(name).setValue(value);
   }

   public Object getProperty(String name) {
      if (name == null) {
         throw new IllegalArgumentException("Parameter 'name' must be not null");
      } else {
         return this.properties.get(name).getValue();
      }
   }

   @Override
   public boolean equals(Object obj) {
      if (this == obj) {
         return true;
      }

      if (obj == null) {
         return false;
      }

      if (!this.annotationType.isInstance(obj)) {
         return false;
      }

      for (Method method : getDeclaredMethods(this.annotationType())) {
         String propertyName = method.getName();
         if (!this.properties.containsKey(propertyName)) {
            return false;
         }

         AnnotationProperty expected = this.properties.get(propertyName);
         AnnotationProperty actual = new AnnotationProperty(propertyName, method.getReturnType());
         AnnotationProxy<?> proxy = getAnnotationProxy(obj);
         if (proxy != null) {
            actual.setValue(proxy.getProperty(propertyName));
         } else {
            try {
               actual.setValue(method.invoke(obj));
            } catch (IllegalArgumentException var11) {
               return false;
            } catch (IllegalAccessException e) {
               throw new AssertionError(e);
            } catch (InvocationTargetException var13) {
               return false;
            }
         }

         if (!expected.equals(actual)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public String toString() {
      StringBuilder stringBuilder = new StringBuilder("@").append(this.annotationType.getName()).append('(');
      int counter = 0;

      for (Entry<String, AnnotationProperty> property : this.properties.entrySet()) {
         if (counter > 0) {
            stringBuilder.append(", ");
         }

         stringBuilder.append((String)property.getKey()).append('=').append(((AnnotationProperty)property.getValue()).valueToString());
         counter++;
      }

      return stringBuilder.append(')').toString();
   }

   private static <A extends Annotation> Method[] getDeclaredMethods(Class<A> annotationType) {
      return AccessController.doPrivileged(new PrivilegedAction<Method[]>()      // $VF: Compiled from AnnotationProxy.java
 {
         public Method[] run() {
            Method[] declaredMethods = annotationType.getDeclaredMethods();
            AccessibleObject.setAccessible(declaredMethods, true);
            return declaredMethods;
         }
      });
   }

   public A getProxedAnnotation() {
      return this.proxedAnnotation;
   }

   public static <A extends Annotation> AnnotationProxy<A> newProxy(Class<A> annotationType) {
      if (annotationType == null) {
         throw new IllegalArgumentException("Parameter 'annotationType' must be not null");
      } else {
         return new AnnotationProxy<>(annotationType);
      }
   }

   @Override
   public Class<? extends Annotation> annotationType() {
      return this.annotationType;
   }
}
