package com.google.gson.internal;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Properties;

// $VF: Compiled from $Gson$Types.java
public final class $Gson$Types {
   static final Type[] EMPTY_TYPE_ARRAY = new Type[0];

   public static Type[] getMapKeyAndValueTypes(Type contextRawType, Class<?> context) {
      if (context == Properties.class) {
         return new Type[]{String.class, String.class};
      } else {
         Type mapType = getSupertype(context, contextRawType, Map.class);
         if (mapType instanceof ParameterizedType) {
            ParameterizedType mapParameterizedType = (ParameterizedType)mapType;
            return mapParameterizedType.getActualTypeArguments();
         } else {
            return new Type[]{Object.class, Object.class};
         }
      }
   }

   public static Class<?> getRawType(Type type) {
      if (type instanceof Class) {
         return (Class<?>)type;
      }

      if (type instanceof ParameterizedType) {
         ParameterizedType parameterizedType = (ParameterizedType)type;
         Type rawType = parameterizedType.getRawType();
         $Gson$Preconditions.checkArgument(rawType instanceof Class);
         return (Class<?>)rawType;
      }

      if (type instanceof GenericArrayType) {
         Type var4 = ((GenericArrayType)type).getGenericComponentType();
         return Array.newInstance(getRawType(var4), 0).getClass();
      }

      if (type instanceof TypeVariable) {
         return Object.class;
      }

      if (type instanceof WildcardType) {
         Type[] var3 = ((WildcardType)type).getUpperBounds();
         if (!$assertionsDisabled && var3.length != 1) {
            throw new AssertionError();
         } else {
            return getRawType(var3[0]);
         }
      } else {
         String className = type == null ? "null" : type.getClass().getName();
         throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + className);
      }
   }

   private static Type resolve(Type visitedTypeVariables, Class<?> contextRawType, Type context, Map<TypeVariable<?>, Type> toResolve) {
      TypeVariable<?> resolving = null;

      while (true) {
         if (toResolve instanceof TypeVariable) {
            TypeVariable<?> original = (TypeVariable)toResolve;
            Type originalLowerBound = visitedTypeVariables.get(original);
            if (originalLowerBound != null) {
               return originalLowerBound == void.class ? toResolve : originalLowerBound;
            }

            visitedTypeVariables.put(original, void.class);
            if (resolving == null) {
               resolving = original;
            }

            toResolve = resolveTypeVariable(context, contextRawType, original);
            if (toResolve != original) {
               continue;
            }
         } else if (toResolve instanceof Class && ((Class)toResolve).isArray()) {
            Class<?> var16 = (Class)toResolve;
            Type var20 = var16.getComponentType();
            Type var23 = resolve(context, contextRawType, var20, visitedTypeVariables);
            toResolve = equal(var20, var23) ? var16 : arrayOf(var23);
         } else if (toResolve instanceof GenericArrayType) {
            GenericArrayType var13 = (GenericArrayType)toResolve;
            Type var17 = var13.getGenericComponentType();
            Type originalUpperBound = resolve(context, contextRawType, var17, visitedTypeVariables);
            toResolve = equal(var17, originalUpperBound) ? var13 : arrayOf(originalUpperBound);
         } else if (toResolve instanceof ParameterizedType) {
            ParameterizedType var14 = (ParameterizedType)toResolve;
            Type var18 = var14.getOwnerType();
            Type var21 = resolve(context, contextRawType, var18, visitedTypeVariables);
            boolean upperBound = !equal(var21, var18);
            Type[] args = var14.getActualTypeArguments();
            int t = 0;

            for (int length = args.length; t < length; t++) {
               Type resolvedTypeArgument = resolve(context, contextRawType, args[t], visitedTypeVariables);
               if (!equal(resolvedTypeArgument, args[t])) {
                  if (!upperBound) {
                     args = (Type[])args.clone();
                     upperBound = true;
                  }

                  args[t] = resolvedTypeArgument;
               }
            }

            toResolve = upperBound ? newParameterizedTypeWithOwner(var21, var14.getRawType(), args) : var14;
         } else {
            label83:
            if (toResolve instanceof WildcardType) {
               WildcardType var15 = (WildcardType)toResolve;
               Type[] var19 = var15.getLowerBounds();
               Type[] var22 = var15.getUpperBounds();
               if (var19.length == 1) {
                  Type upperBound = resolve(context, contextRawType, var19[0], visitedTypeVariables);
                  if (upperBound != var19[0]) {
                     toResolve = supertypeOf(upperBound);
                     break label83;
                  }
               } else if (var22.length == 1) {
                  Type var25 = resolve(context, contextRawType, var22[0], visitedTypeVariables);
                  if (var25 != var22[0]) {
                     toResolve = subtypeOf(var25);
                     break label83;
                  }
               }

               toResolve = var15;
            }
         }

         if (resolving != null) {
            visitedTypeVariables.put(resolving, toResolve);
         }

         return toResolve;
      }
   }

   public static GenericArrayType arrayOf(Type componentType) {
      return new $Gson$Types.GenericArrayTypeImpl(componentType);
   }

   public static WildcardType supertypeOf(Type bound) {
      Type[] lowerBounds;
      if (bound instanceof WildcardType) {
         lowerBounds = ((WildcardType)bound).getLowerBounds();
      } else {
         lowerBounds = new Type[]{bound};
      }

      return new $Gson$Types.WildcardTypeImpl(new Type[]{Object.class}, lowerBounds);
   }

   private $Gson$Types() {
      throw new UnsupportedOperationException();
   }

   private static Type getSupertype(Type supertype, Class<?> context, Class<?> contextRawType) {
      if (context instanceof WildcardType) {
         Type[] bounds = ((WildcardType)context).getUpperBounds();
         if (!$assertionsDisabled && bounds.length != 1) {
            throw new AssertionError();
         }

         context = bounds[0];
      }

      $Gson$Preconditions.checkArgument(supertype.isAssignableFrom(contextRawType));
      return resolve(context, contextRawType, getGenericSupertype(context, contextRawType, supertype));
   }

   public static Type canonicalize(Type type) {
      if (type instanceof Class) {
         Class<?> c = (Class<?>)type;
         return c.isArray() ? new $Gson$Types.GenericArrayTypeImpl(canonicalize(c.getComponentType())) : c;
      } else if (type instanceof ParameterizedType) {
         ParameterizedType p = (ParameterizedType)type;
         return new $Gson$Types.ParameterizedTypeImpl(p.getOwnerType(), p.getRawType(), p.getActualTypeArguments());
      } else if (type instanceof GenericArrayType) {
         GenericArrayType g = (GenericArrayType)type;
         return new $Gson$Types.GenericArrayTypeImpl(g.getGenericComponentType());
      } else if (type instanceof WildcardType) {
         WildcardType w = (WildcardType)type;
         return new $Gson$Types.WildcardTypeImpl(w.getUpperBounds(), w.getLowerBounds());
      } else {
         return type;
      }
   }

   public static boolean equals(Type b, Type a) {
      if (a == b) {
         return true;
      }

      if (a instanceof Class) {
         return a.equals(b);
      }

      if (a instanceof ParameterizedType) {
         if (!(b instanceof ParameterizedType)) {
            return false;
         }

         ParameterizedType var6 = (ParameterizedType)a;
         ParameterizedType var9 = (ParameterizedType)b;
         return equal(var6.getOwnerType(), var9.getOwnerType())
            && var6.getRawType().equals(var9.getRawType())
            && Arrays.equals(var6.getActualTypeArguments(), var9.getActualTypeArguments());
      } else if (a instanceof GenericArrayType) {
         if (!(b instanceof GenericArrayType)) {
            return false;
         }

         GenericArrayType var5 = (GenericArrayType)a;
         GenericArrayType var8 = (GenericArrayType)b;
         return equals(var5.getGenericComponentType(), var8.getGenericComponentType());
      } else if (a instanceof WildcardType) {
         if (!(b instanceof WildcardType)) {
            return false;
         }

         WildcardType var4 = (WildcardType)a;
         WildcardType var7 = (WildcardType)b;
         return Arrays.equals(var4.getUpperBounds(), var7.getUpperBounds()) && Arrays.equals(var4.getLowerBounds(), var7.getLowerBounds());
      } else if (a instanceof TypeVariable) {
         if (!(b instanceof TypeVariable)) {
            return false;
         }

         TypeVariable<?> va = (TypeVariable)a;
         TypeVariable<?> vb = (TypeVariable)b;
         return va.getGenericDeclaration() == vb.getGenericDeclaration() && va.getName().equals(vb.getName());
      } else {
         return false;
      }
   }

   private static int indexOf(Object[] array, Object toFind) {
      int i = 0;

      for (int length = array.length; i < length; i++) {
         if (toFind.equals(array[i])) {
            return i;
         }
      }

      throw new NoSuchElementException();
   }

   private static boolean equal(Object b, Object a) {
      return Objects.equals(a, b);
   }

   private static Type resolveTypeVariable(Type unknown, Class<?> context, TypeVariable<?> contextRawType) {
      Class<?> declaredByRaw = declaringClassOf(unknown);
      if (declaredByRaw == null) {
         return unknown;
      } else {
         Type declaredBy = getGenericSupertype(context, contextRawType, declaredByRaw);
         if (declaredBy instanceof ParameterizedType) {
            int index = indexOf(declaredByRaw.getTypeParameters(), unknown);
            return ((ParameterizedType)declaredBy).getActualTypeArguments()[index];
         } else {
            return unknown;
         }
      }
   }

   public static Type getCollectionElementType(Type contextRawType, Class<?> context) {
      Type collectionType = getSupertype(context, contextRawType, Collection.class);
      return collectionType instanceof ParameterizedType ? ((ParameterizedType)collectionType).getActualTypeArguments()[0] : Object.class;
   }

   static void checkNotPrimitive(Type type) {
      $Gson$Preconditions.checkArgument(!(type instanceof Class) || !((Class)type).isPrimitive());
   }

   public static ParameterizedType newParameterizedTypeWithOwner(Type ownerType, Type typeArguments, Type... rawType) {
      return new $Gson$Types.ParameterizedTypeImpl(ownerType, rawType, typeArguments);
   }

   private static Type getGenericSupertype(Type context, Class<?> rawType, Class<?> supertype) {
      if (supertype == rawType) {
         return context;
      }

      if (supertype.isInterface()) {
         Class<?>[] rawSupertype = rawType.getInterfaces();
         int i = 0;

         for (int length = rawSupertype.length; i < length; i++) {
            if (rawSupertype[i] == supertype) {
               return rawType.getGenericInterfaces()[i];
            }

            if (supertype.isAssignableFrom(rawSupertype[i])) {
               return getGenericSupertype(rawType.getGenericInterfaces()[i], rawSupertype[i], supertype);
            }
         }
      }

      if (!rawType.isInterface()) {
         while (rawType != Object.class) {
            Class<?> var6 = rawType.getSuperclass();
            if (var6 == supertype) {
               return rawType.getGenericSuperclass();
            }

            if (supertype.isAssignableFrom(var6)) {
               return getGenericSupertype(rawType.getGenericSuperclass(), var6, supertype);
            }

            rawType = var6;
         }
      }

      return supertype;
   }

   private static Class<?> declaringClassOf(TypeVariable<?> typeVariable) {
      GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
      return genericDeclaration instanceof Class ? (Class)genericDeclaration : null;
   }

   public static Type getArrayComponentType(Type array) {
      return array instanceof GenericArrayType ? ((GenericArrayType)array).getGenericComponentType() : ((Class)array).getComponentType();
   }

   public static Type resolve(Type context, Class<?> contextRawType, Type toResolve) {
      return resolve(context, contextRawType, toResolve, new HashMap<>());
   }

   public static String typeToString(Type type) {
      return type instanceof Class ? ((Class)type).getName() : type.toString();
   }

   public static WildcardType subtypeOf(Type bound) {
      Type[] upperBounds;
      if (bound instanceof WildcardType) {
         upperBounds = ((WildcardType)bound).getUpperBounds();
      } else {
         upperBounds = new Type[]{bound};
      }

      return new $Gson$Types.WildcardTypeImpl(upperBounds, EMPTY_TYPE_ARRAY);
   }

   // $VF: Compiled from $Gson$Types.java
   private static final class GenericArrayTypeImpl implements GenericArrayType, Serializable {
      private final Type componentType;
      private static final long serialVersionUID = 0L;

      @Override
      public boolean equals(Object o) {
         return o instanceof GenericArrayType && $Gson$Types.equals(this, (GenericArrayType)o);
      }

      public GenericArrayTypeImpl(Type componentType) {
         Objects.requireNonNull(componentType);
         this.componentType = $Gson$Types.canonicalize(componentType);
      }

      @Override
      public int hashCode() {
         return this.componentType.hashCode();
      }

      @Override
      public String toString() {
         return $Gson$Types.typeToString(this.componentType) + "[]";
      }

      @Override
      public Type getGenericComponentType() {
         return this.componentType;
      }
   }

   // $VF: Compiled from $Gson$Types.java
   private static final class ParameterizedTypeImpl implements Serializable, ParameterizedType {
      private final Type[] typeArguments;
      private final Type ownerType;
      private final Type rawType;
      private static final long serialVersionUID = 0L;

      @Override
      public Type getRawType() {
         return this.rawType;
      }

      @Override
      public String toString() {
         int length = this.typeArguments.length;
         if (length == 0) {
            return $Gson$Types.typeToString(this.rawType);
         }

         StringBuilder stringBuilder = new StringBuilder(30 * (length + 1));
         stringBuilder.append($Gson$Types.typeToString(this.rawType)).append("<").append($Gson$Types.typeToString(this.typeArguments[0]));

         for (int i = 1; i < length; i++) {
            stringBuilder.append(", ").append($Gson$Types.typeToString(this.typeArguments[i]));
         }

         return stringBuilder.append(">").toString();
      }

      @Override
      public Type[] getActualTypeArguments() {
         return (Type[])this.typeArguments.clone();
      }

      @Override
      public int hashCode() {
         return Arrays.hashCode(this.typeArguments) ^ this.rawType.hashCode() ^ hashCodeOrZero(this.ownerType);
      }

      private static int hashCodeOrZero(Object o) {
         return o != null ? o.hashCode() : 0;
      }

      @Override
      public boolean equals(Object other) {
         return other instanceof ParameterizedType && $Gson$Types.equals(this, (ParameterizedType)other);
      }

      @Override
      public Type getOwnerType() {
         return this.ownerType;
      }

      public ParameterizedTypeImpl(Type typeArguments, Type ownerType, Type... rawType) {
         Objects.requireNonNull(rawType);
         if (rawType instanceof Class) {
            Class<?> t = (Class)rawType;
            boolean length = Modifier.isStatic(t.getModifiers()) || t.getEnclosingClass() == null;
            $Gson$Preconditions.checkArgument(ownerType != null || length);
         }

         this.ownerType = ownerType == null ? null : $Gson$Types.canonicalize(ownerType);
         this.rawType = $Gson$Types.canonicalize(rawType);
         this.typeArguments = (Type[])typeArguments.clone();
         int var6 = 0;

         for (int var7 = this.typeArguments.length; var6 < var7; var6++) {
            Objects.requireNonNull(this.typeArguments[var6]);
            $Gson$Types.checkNotPrimitive(this.typeArguments[var6]);
            this.typeArguments[var6] = $Gson$Types.canonicalize(this.typeArguments[var6]);
         }
      }
   }

   // $VF: Compiled from $Gson$Types.java
   private static final class WildcardTypeImpl implements Serializable, WildcardType {
      private static final long serialVersionUID = 0L;
      private final Type upperBound;
      private final Type lowerBound;

      public WildcardTypeImpl(Type[] lowerBounds, Type[] upperBounds) {
         $Gson$Preconditions.checkArgument(lowerBounds.length <= 1);
         $Gson$Preconditions.checkArgument(upperBounds.length == 1);
         if (lowerBounds.length == 1) {
            Objects.requireNonNull(lowerBounds[0]);
            $Gson$Types.checkNotPrimitive(lowerBounds[0]);
            $Gson$Preconditions.checkArgument(upperBounds[0] == Object.class);
            this.lowerBound = $Gson$Types.canonicalize(lowerBounds[0]);
            this.upperBound = Object.class;
         } else {
            Objects.requireNonNull(upperBounds[0]);
            $Gson$Types.checkNotPrimitive(upperBounds[0]);
            this.lowerBound = null;
            this.upperBound = $Gson$Types.canonicalize(upperBounds[0]);
         }
      }

      @Override
      public String toString() {
         if (this.lowerBound != null) {
            return "? super " + $Gson$Types.typeToString(this.lowerBound);
         } else {
            return this.upperBound == Object.class ? "?" : "? extends " + $Gson$Types.typeToString(this.upperBound);
         }
      }

      @Override
      public Type[] getLowerBounds() {
         return this.lowerBound != null ? new Type[]{this.lowerBound} : $Gson$Types.EMPTY_TYPE_ARRAY;
      }

      @Override
      public int hashCode() {
         return (this.lowerBound != null ? 31 + this.lowerBound.hashCode() : 1) ^ 31 + this.upperBound.hashCode();
      }

      @Override
      public Type[] getUpperBounds() {
         return new Type[]{this.upperBound};
      }

      @Override
      public boolean equals(Object other) {
         return other instanceof WildcardType && $Gson$Types.equals(this, (WildcardType)other);
      }
   }
}
