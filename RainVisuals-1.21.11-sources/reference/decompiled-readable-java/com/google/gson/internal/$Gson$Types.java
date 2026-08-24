/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal;

import com.google.gson.internal.$Gson$Preconditions;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
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

public final class $Gson$Types {
    static final Type[] EMPTY_TYPE_ARRAY = new Type[0];

    public static Type[] getMapKeyAndValueTypes(Type context, Class<?> contextRawType) {
        if (context == Properties.class) {
            Type[] typeArray = new Type[2];
            typeArray[0] = String.class;
            typeArray[1] = String.class;
            return typeArray;
        }
        Type mapType = $Gson$Types.getSupertype(context, contextRawType, Map.class);
        if (mapType instanceof ParameterizedType) {
            ParameterizedType mapParameterizedType = (ParameterizedType)mapType;
            return mapParameterizedType.getActualTypeArguments();
        }
        Type[] typeArray = new Type[2];
        typeArray[0] = Object.class;
        typeArray[1] = Object.class;
        return typeArray;
    }

    public static Class<?> getRawType(Type type) {
        if (type instanceof Class) {
            return (Class)type;
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType)type;
            Type rawType = parameterizedType.getRawType();
            $Gson$Preconditions.checkArgument(rawType instanceof Class);
            return (Class)rawType;
        }
        if (type instanceof GenericArrayType) {
            Type componentType = ((GenericArrayType)type).getGenericComponentType();
            return Array.newInstance($Gson$Types.getRawType(componentType), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            Type[] bounds = ((WildcardType)type).getUpperBounds();
            assert (bounds.length == 1);
            return $Gson$Types.getRawType(bounds[0]);
        }
        String className = type == null ? "null" : type.getClass().getName();
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + className);
    }

    /*
     * Unable to fully structure code
     */
    private static Type resolve(Type context, Class<?> contextRawType, Type toResolve, Map<TypeVariable<?>, Type> visitedTypeVariables) {
        block9: {
            block13: {
                block12: {
                    block11: {
                        block10: {
                            resolving = null;
                            while (toResolve instanceof TypeVariable) {
                                typeVariable = (TypeVariable)toResolve;
                                previouslyResolved = visitedTypeVariables.get(typeVariable);
                                if (previouslyResolved != null) {
                                    return previouslyResolved == Void.TYPE ? toResolve : previouslyResolved;
                                }
                                visitedTypeVariables.put(typeVariable, Void.TYPE);
                                if (resolving == null) {
                                    resolving = typeVariable;
                                }
                                toResolve = $Gson$Types.resolveTypeVariable(context, contextRawType, typeVariable);
                                if (toResolve != typeVariable) continue;
                                break block9;
                            }
                            if (!(toResolve instanceof Class)) break block10;
                            if (!((Class)toResolve).isArray()) break block10;
                            original = (Class)toResolve;
                            componentType = original.getComponentType();
                            newComponentType = $Gson$Types.resolve(context, contextRawType, componentType, visitedTypeVariables);
                            toResolve = $Gson$Types.equal(componentType, newComponentType) != false ? original : $Gson$Types.arrayOf(newComponentType);
                            break block9;
                        }
                        if (!(toResolve instanceof GenericArrayType)) break block11;
                        original = (GenericArrayType)toResolve;
                        componentType = original.getGenericComponentType();
                        newComponentType = $Gson$Types.resolve(context, contextRawType, componentType, visitedTypeVariables);
                        toResolve = $Gson$Types.equal(componentType, newComponentType) != false ? original : $Gson$Types.arrayOf(newComponentType);
                        break block9;
                    }
                    if (!(toResolve instanceof ParameterizedType)) break block12;
                    original = (ParameterizedType)toResolve;
                    ownerType = original.getOwnerType();
                    newOwnerType = $Gson$Types.resolve(context, contextRawType, ownerType, visitedTypeVariables);
                    changed = !$Gson$Types.equal(newOwnerType, ownerType);
                    args = original.getActualTypeArguments();
                    t = 0;
                    length = args.length;
                    while (t < length) {
                        resolvedTypeArgument = $Gson$Types.resolve(context, contextRawType, args[t], visitedTypeVariables);
                        if (!$Gson$Types.equal(resolvedTypeArgument, args[t])) {
                            if (!changed) {
                                args = (Type[])args.clone();
                                changed = true;
                            }
                            args[var10_15] = var12_17;
                        }
                        ++var10_15;
                    }
                    toResolve = changed != false ? $Gson$Types.newParameterizedTypeWithOwner(newOwnerType, original.getRawType(), (Type[])var9_14) : original;
                    break block9;
                }
                if (!(toResolve instanceof WildcardType)) break block9;
                original = (WildcardType)toResolve;
                originalLowerBound = original.getLowerBounds();
                originalUpperBound = original.getUpperBounds();
                if (originalLowerBound.length != 1) break block13;
                lowerBound = $Gson$Types.resolve(context, contextRawType, originalLowerBound[0], visitedTypeVariables);
                if (lowerBound == originalLowerBound[0]) ** GOTO lbl-1000
                toResolve = $Gson$Types.supertypeOf((Type)upperBound);
                break block9;
            }
            if (originalUpperBound.length != 1) ** GOTO lbl-1000
            var8_13 = $Gson$Types.resolve(context, contextRawType, originalUpperBound[0], visitedTypeVariables);
            if (var8_13 != var7_10[0]) {
                var2_2 = $Gson$Types.subtypeOf(var8_13);
            } else lbl-1000:
            // 3 sources

            {
                var2_2 = var5_5;
            }
        }
        if (var4_4 != null) {
            var3_3.put(var4_4, var2_2);
        }
        return var2_2;
    }

    public static GenericArrayType arrayOf(Type componentType) {
        return new GenericArrayTypeImpl(componentType);
    }

    /*
     * WARNING - void declaration
     */
    public static WildcardType supertypeOf(Type bound) {
        void var1_1;
        Type[] lowerBounds;
        if (bound instanceof WildcardType) {
            lowerBounds = ((WildcardType)bound).getLowerBounds();
        } else {
            Type[] typeArray = new Type[1];
            typeArray[0] = bound;
            lowerBounds = typeArray;
        }
        Type[] typeArray = new Type[1];
        typeArray[0] = Object.class;
        return new WildcardTypeImpl(typeArray, (Type[])var1_1);
    }

    private $Gson$Types() {
        throw new UnsupportedOperationException();
    }

    private static Type getSupertype(Type context, Class<?> contextRawType, Class<?> supertype) {
        if (context instanceof WildcardType) {
            Type[] bounds = ((WildcardType)context).getUpperBounds();
            assert (bounds.length == 1);
            context = bounds[0];
        }
        $Gson$Preconditions.checkArgument(supertype.isAssignableFrom(contextRawType));
        return $Gson$Types.resolve(context, contextRawType, $Gson$Types.getGenericSupertype(context, contextRawType, supertype));
    }

    public static Type canonicalize(Type type) {
        if (type instanceof Class) {
            Class c = (Class)type;
            return c.isArray() ? new GenericArrayTypeImpl($Gson$Types.canonicalize(c.getComponentType())) : c;
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType p = (ParameterizedType)type;
            return new ParameterizedTypeImpl(p.getOwnerType(), p.getRawType(), p.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            GenericArrayType g = (GenericArrayType)type;
            return new GenericArrayTypeImpl(g.getGenericComponentType());
        }
        if (type instanceof WildcardType) {
            WildcardType w = (WildcardType)type;
            return new WildcardTypeImpl(w.getUpperBounds(), w.getLowerBounds());
        }
        return type;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean equals(Type a2, Type b2) {
        void var3_9;
        void var2_5;
        if (a2 == b2) {
            return true;
        }
        if (a2 instanceof Class) {
            return a2.equals(b2);
        }
        if (a2 instanceof ParameterizedType) {
            if (!(b2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType pa = (ParameterizedType)a2;
            ParameterizedType pb = (ParameterizedType)b2;
            if (!$Gson$Types.equal(pa.getOwnerType(), pb.getOwnerType())) return false;
            if (!pa.getRawType().equals(pb.getRawType())) return false;
            if (!Arrays.equals(pa.getActualTypeArguments(), pb.getActualTypeArguments())) return false;
            return true;
        }
        if (a2 instanceof GenericArrayType) {
            if (!(b2 instanceof GenericArrayType)) {
                return false;
            }
            GenericArrayType ga = (GenericArrayType)a2;
            GenericArrayType gb = (GenericArrayType)b2;
            return $Gson$Types.equals(ga.getGenericComponentType(), gb.getGenericComponentType());
        }
        if (a2 instanceof WildcardType) {
            if (!(b2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wa = (WildcardType)a2;
            WildcardType wb = (WildcardType)b2;
            if (!Arrays.equals(wa.getUpperBounds(), wb.getUpperBounds())) return false;
            if (!Arrays.equals(wa.getLowerBounds(), wb.getLowerBounds())) return false;
            return true;
        }
        if (!(a2 instanceof TypeVariable)) return false;
        if (!(b2 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable va = (TypeVariable)a2;
        TypeVariable vb = (TypeVariable)b2;
        if (va.getGenericDeclaration() != vb.getGenericDeclaration()) return false;
        if (!var2_5.getName().equals(var3_9.getName())) return false;
        return true;
    }

    /*
     * WARNING - void declaration
     */
    private static int indexOf(Object[] array, Object toFind) {
        int i = 0;
        int length = array.length;
        while (i < length) {
            void var2_2;
            if (toFind.equals(array[i])) {
                return i;
            }
            ++var2_2;
        }
        throw new NoSuchElementException();
    }

    private static boolean equal(Object a2, Object b2) {
        return Objects.equals(a2, b2);
    }

    /*
     * WARNING - void declaration
     */
    private static Type resolveTypeVariable(Type context, Class<?> contextRawType, TypeVariable<?> unknown) {
        void var2_2;
        Class<?> declaredByRaw = $Gson$Types.declaringClassOf(unknown);
        if (declaredByRaw == null) {
            return unknown;
        }
        Type declaredBy = $Gson$Types.getGenericSupertype(context, contextRawType, declaredByRaw);
        if (declaredBy instanceof ParameterizedType) {
            void var5_5;
            int index = $Gson$Types.indexOf(declaredByRaw.getTypeParameters(), unknown);
            return ((ParameterizedType)declaredBy).getActualTypeArguments()[var5_5];
        }
        return var2_2;
    }

    public static Type getCollectionElementType(Type context, Class<?> contextRawType) {
        Type collectionType = $Gson$Types.getSupertype(context, contextRawType, Collection.class);
        if (collectionType instanceof ParameterizedType) {
            return ((ParameterizedType)collectionType).getActualTypeArguments()[0];
        }
        return Object.class;
    }

    static void checkNotPrimitive(Type type) {
        $Gson$Preconditions.checkArgument(!(type instanceof Class) || !((Class)type).isPrimitive());
    }

    public static ParameterizedType newParameterizedTypeWithOwner(Type ownerType, Type rawType, Type ... typeArguments) {
        return new ParameterizedTypeImpl(ownerType, rawType, typeArguments);
    }

    /*
     * WARNING - void declaration
     */
    private static Type getGenericSupertype(Type context, Class<?> rawType, Class<?> supertype) {
        void var2_2;
        if (supertype == rawType) {
            return context;
        }
        if (supertype.isInterface()) {
            Class<?>[] interfaces = rawType.getInterfaces();
            int i = 0;
            int length = interfaces.length;
            while (i < length) {
                void var4_4;
                if (interfaces[i] == supertype) {
                    return rawType.getGenericInterfaces()[i];
                }
                if (supertype.isAssignableFrom(interfaces[i])) {
                    return $Gson$Types.getGenericSupertype(rawType.getGenericInterfaces()[i], interfaces[i], supertype);
                }
                ++var4_4;
            }
        }
        if (!rawType.isInterface()) {
            while (rawType != Object.class) {
                void var3_3;
                Class<?> rawSupertype = rawType.getSuperclass();
                if (rawSupertype == supertype) {
                    return rawType.getGenericSuperclass();
                }
                if (supertype.isAssignableFrom(rawSupertype)) {
                    return $Gson$Types.getGenericSupertype(rawType.getGenericSuperclass(), var3_3, var2_2);
                }
                void var1_1 = var3_3;
            }
        }
        return var2_2;
    }

    private static Class<?> declaringClassOf(TypeVariable<?> typeVariable) {
        Object genericDeclaration = typeVariable.getGenericDeclaration();
        return genericDeclaration instanceof Class ? (Class)genericDeclaration : null;
    }

    public static Type getArrayComponentType(Type array) {
        return array instanceof GenericArrayType ? ((GenericArrayType)array).getGenericComponentType() : ((Class)array).getComponentType();
    }

    public static Type resolve(Type context, Class<?> contextRawType, Type toResolve) {
        return $Gson$Types.resolve(context, contextRawType, toResolve, new HashMap());
    }

    public static String typeToString(Type type) {
        return type instanceof Class ? ((Class)type).getName() : type.toString();
    }

    public static WildcardType subtypeOf(Type bound) {
        Type[] upperBounds;
        if (bound instanceof WildcardType) {
            upperBounds = ((WildcardType)bound).getUpperBounds();
        } else {
            Type[] typeArray = new Type[1];
            typeArray[0] = bound;
            upperBounds = typeArray;
        }
        return new WildcardTypeImpl(upperBounds, EMPTY_TYPE_ARRAY);
    }

    private static final class WildcardTypeImpl
    implements Serializable,
    WildcardType {
        private static final long serialVersionUID = 0L;
        private final Type upperBound;
        private final Type lowerBound;

        /*
         * WARNING - void declaration
         */
        public WildcardTypeImpl(Type[] upperBounds, Type[] lowerBounds) {
            $Gson$Preconditions.checkArgument(lowerBounds.length <= 1);
            $Gson$Preconditions.checkArgument(upperBounds.length == 1);
            if (lowerBounds.length == 1) {
                Objects.requireNonNull(lowerBounds[0]);
                $Gson$Types.checkNotPrimitive(lowerBounds[0]);
                $Gson$Preconditions.checkArgument(upperBounds[0] == Object.class);
                this.lowerBound = $Gson$Types.canonicalize(lowerBounds[0]);
                this.upperBound = Object.class;
            } else {
                void var1_1;
                Objects.requireNonNull(upperBounds[0]);
                $Gson$Types.checkNotPrimitive(upperBounds[0]);
                this.lowerBound = null;
                this.upperBound = $Gson$Types.canonicalize((Type)var1_1[0]);
            }
        }

        public String toString() {
            if (this.lowerBound != null) {
                return "? super " + $Gson$Types.typeToString(this.lowerBound);
            }
            if (this.upperBound == Object.class) {
                return "?";
            }
            return "? extends " + $Gson$Types.typeToString(this.upperBound);
        }

        @Override
        public Type[] getLowerBounds() {
            Type[] typeArray;
            if (this.lowerBound != null) {
                Type[] typeArray2 = new Type[1];
                typeArray = typeArray2;
                typeArray2[0] = this.lowerBound;
            } else {
                typeArray = EMPTY_TYPE_ARRAY;
            }
            return typeArray;
        }

        public int hashCode() {
            return (this.lowerBound != null ? 31 + this.lowerBound.hashCode() : 1) ^ 31 + this.upperBound.hashCode();
        }

        @Override
        public Type[] getUpperBounds() {
            Type[] typeArray = new Type[1];
            typeArray[0] = this.upperBound;
            return typeArray;
        }

        public boolean equals(Object other) {
            return other instanceof WildcardType && $Gson$Types.equals(this, (WildcardType)other);
        }
    }

    private static final class GenericArrayTypeImpl
    implements GenericArrayType,
    Serializable {
        private final Type componentType;
        private static final long serialVersionUID = 0L;

        public boolean equals(Object o) {
            return o instanceof GenericArrayType && $Gson$Types.equals(this, (GenericArrayType)o);
        }

        public GenericArrayTypeImpl(Type componentType) {
            Objects.requireNonNull(componentType);
            this.componentType = $Gson$Types.canonicalize(componentType);
        }

        public int hashCode() {
            return this.componentType.hashCode();
        }

        public String toString() {
            return $Gson$Types.typeToString(this.componentType) + "[]";
        }

        @Override
        public Type getGenericComponentType() {
            return this.componentType;
        }
    }

    private static final class ParameterizedTypeImpl
    implements Serializable,
    ParameterizedType {
        private final Type[] typeArguments;
        private final Type ownerType;
        private final Type rawType;
        private static final long serialVersionUID = 0L;

        @Override
        public Type getRawType() {
            return this.rawType;
        }

        /*
         * WARNING - void declaration
         */
        public String toString() {
            int length = this.typeArguments.length;
            if (length == 0) {
                return $Gson$Types.typeToString(this.rawType);
            }
            StringBuilder stringBuilder = new StringBuilder(30 * (length + 1));
            stringBuilder.append($Gson$Types.typeToString(this.rawType)).append("<").append($Gson$Types.typeToString(this.typeArguments[0]));
            int i = 1;
            while (i < length) {
                void var3_3;
                stringBuilder.append(", ").append($Gson$Types.typeToString(this.typeArguments[i]));
                ++var3_3;
            }
            return stringBuilder.append(">").toString();
        }

        @Override
        public Type[] getActualTypeArguments() {
            return (Type[])this.typeArguments.clone();
        }

        public int hashCode() {
            return Arrays.hashCode(this.typeArguments) ^ this.rawType.hashCode() ^ ParameterizedTypeImpl.hashCodeOrZero(this.ownerType);
        }

        private static int hashCodeOrZero(Object o) {
            return o != null ? o.hashCode() : 0;
        }

        public boolean equals(Object other) {
            return other instanceof ParameterizedType && $Gson$Types.equals(this, (ParameterizedType)other);
        }

        @Override
        public Type getOwnerType() {
            return this.ownerType;
        }

        /*
         * WARNING - void declaration
         */
        public ParameterizedTypeImpl(Type ownerType, Type rawType, Type ... typeArguments) {
            Objects.requireNonNull(rawType);
            if (rawType instanceof Class) {
                Class rawTypeAsClass = (Class)rawType;
                boolean isStaticOrTopLevelClass = Modifier.isStatic(rawTypeAsClass.getModifiers()) || rawTypeAsClass.getEnclosingClass() == null;
                $Gson$Preconditions.checkArgument(ownerType != null || isStaticOrTopLevelClass);
            }
            this.ownerType = ownerType == null ? null : $Gson$Types.canonicalize(ownerType);
            this.rawType = $Gson$Types.canonicalize(rawType);
            this.typeArguments = (Type[])typeArguments.clone();
            int t = 0;
            int length = this.typeArguments.length;
            while (t < length) {
                void var4_5;
                Objects.requireNonNull(this.typeArguments[t]);
                $Gson$Types.checkNotPrimitive(this.typeArguments[t]);
                this.typeArguments[t] = $Gson$Types.canonicalize(this.typeArguments[t]);
                ++var4_5;
            }
        }
    }
}

