/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.reflect;

import com.google.gson.internal.$Gson$Types;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class TypeToken<T> {
    private final int hashCode;
    private final Type type;
    private final Class<? super T> rawType;

    /*
     * WARNING - void declaration
     */
    private static boolean typeEquals(ParameterizedType from, ParameterizedType to, Map<String, Type> typeVarMap) {
        if (from.getRawType().equals(to.getRawType())) {
            Type[] fromArgs = from.getActualTypeArguments();
            Type[] toArgs = to.getActualTypeArguments();
            int i = 0;
            while (i < fromArgs.length) {
                void var5_5;
                if (!TypeToken.matches(fromArgs[i], toArgs[i], typeVarMap)) {
                    return false;
                }
                ++var5_5;
            }
            return true;
        }
        return false;
    }

    private TypeToken(Type type) {
        this.type = $Gson$Types.canonicalize(Objects.requireNonNull(type));
        this.rawType = $Gson$Types.getRawType(this.type);
        this.hashCode = this.type.hashCode();
    }

    public final int hashCode() {
        return this.hashCode;
    }

    public static TypeToken<?> get(Type type) {
        return new TypeToken(type);
    }

    private Type getTypeTokenTypeArgument() {
        Type superclass = this.getClass().getGenericSuperclass();
        if (superclass instanceof ParameterizedType) {
            ParameterizedType parameterized = (ParameterizedType)superclass;
            if (parameterized.getRawType() == TypeToken.class) {
                return $Gson$Types.canonicalize(parameterized.getActualTypeArguments()[0]);
            }
        } else if (superclass == TypeToken.class) {
            throw new IllegalStateException("TypeToken must be created with a type argument: new TypeToken<...>() {}; When using code shrinkers (ProGuard, R8, ...) make sure that generic signatures are preserved.");
        }
        throw new IllegalStateException("Must only create direct subclasses of TypeToken");
    }

    /*
     * WARNING - void declaration
     */
    private static boolean isAssignableFrom(Type from, ParameterizedType to, Map<String, Type> typeVarMap) {
        void var2_2;
        void var1_1;
        int n;
        Type[] tArgs;
        if (from == null) {
            return false;
        }
        if (to.equals(from)) {
            return true;
        }
        Class<?> clazz = $Gson$Types.getRawType(from);
        ParameterizedType ptype = null;
        if (from instanceof ParameterizedType) {
            ptype = (ParameterizedType)from;
        }
        if (ptype != null) {
            tArgs = ptype.getActualTypeArguments();
            TypeVariable<Class<?>>[] tParams = clazz.getTypeParameters();
            int i = 0;
            while (i < tArgs.length) {
                Type arg = tArgs[i];
                TypeVariable<Class<?>> var = tParams[i];
                while (arg instanceof TypeVariable) {
                    TypeVariable v = (TypeVariable)arg;
                    arg = typeVarMap.get(v.getName());
                }
                typeVarMap.put(var.getName(), arg);
                ++n;
            }
            if (TypeToken.typeEquals(ptype, to, typeVarMap)) {
                return true;
            }
        }
        tArgs = clazz.getGenericInterfaces();
        int n2 = tArgs.length;
        for (n = 0; n < n2; ++n) {
            Type itype = tArgs[n];
            if (!TypeToken.isAssignableFrom(itype, to, new HashMap<String, Type>(typeVarMap))) continue;
            return true;
        }
        Type sType = clazz.getGenericSuperclass();
        return TypeToken.isAssignableFrom(sType, (ParameterizedType)var1_1, new HashMap<String, Type>((Map<String, Type>)var2_2));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean matches(Type from, Type to, Map<String, Type> typeMap) {
        if (to.equals(from)) return true;
        if (!(from instanceof TypeVariable)) return false;
        if (!to.equals(typeMap.get(((TypeVariable)from).getName()))) return false;
        return true;
    }

    public final boolean equals(Object o) {
        return o instanceof TypeToken && $Gson$Types.equals(this.type, ((TypeToken)o).type);
    }

    @Deprecated
    public boolean isAssignableFrom(Class<?> cls) {
        return this.isAssignableFrom((Type)cls);
    }

    /*
     * WARNING - void declaration
     */
    public static TypeToken<?> getParameterized(Type rawType, Type ... typeArguments) {
        void var1_1;
        Objects.requireNonNull(rawType);
        Objects.requireNonNull(typeArguments);
        if (!(rawType instanceof Class)) {
            throw new IllegalArgumentException("rawType must be of type Class, but was " + rawType);
        }
        Class rawClass = (Class)rawType;
        TypeVariable<Class<T>>[] typeVariables = rawClass.getTypeParameters();
        int actualArgsCount = typeArguments.length;
        int expectedArgsCount = typeVariables.length;
        if (actualArgsCount != expectedArgsCount) {
            throw new IllegalArgumentException(rawClass.getName() + " requires " + expectedArgsCount + " type arguments, but got " + actualArgsCount);
        }
        int i = 0;
        while (i < expectedArgsCount) {
            void var6_6;
            Type typeArgument = typeArguments[i];
            Class<?> rawTypeArgument = $Gson$Types.getRawType(typeArgument);
            TypeVariable typeVariable = typeVariables[i];
            Type[] typeArray = typeVariable.getBounds();
            int n = typeArray.length;
            for (int j = 0; j < n; ++j) {
                Type bound = typeArray[j];
                Class<?> rawBound = $Gson$Types.getRawType(bound);
                if (rawBound.isAssignableFrom(rawTypeArgument)) continue;
                throw new IllegalArgumentException("Type argument " + typeArgument + " does not satisfy bounds for type variable " + typeVariable + " declared by " + rawType);
            }
            ++var6_6;
        }
        return new TypeToken($Gson$Types.newParameterizedTypeWithOwner(null, rawType, (Type[])var1_1));
    }

    protected TypeToken() {
        this.type = this.getTypeTokenTypeArgument();
        this.rawType = $Gson$Types.getRawType(this.type);
        this.hashCode = this.type.hashCode();
    }

    public final String toString() {
        return $Gson$Types.typeToString(this.type);
    }

    public final Type getType() {
        return this.type;
    }

    public static <T> TypeToken<T> get(Class<T> type) {
        return new TypeToken<T>(type);
    }

    @Deprecated
    public boolean isAssignableFrom(TypeToken<?> token) {
        return this.isAssignableFrom(token.getType());
    }

    public static TypeToken<?> getArray(Type componentType) {
        return new TypeToken($Gson$Types.arrayOf(componentType));
    }

    public final Class<? super T> getRawType() {
        return this.rawType;
    }

    private static boolean isAssignableFrom(Type from, GenericArrayType to) {
        Type toGenericComponentType = to.getGenericComponentType();
        if (toGenericComponentType instanceof ParameterizedType) {
            Type t = from;
            if (from instanceof GenericArrayType) {
                t = ((GenericArrayType)from).getGenericComponentType();
            } else if (from instanceof Class) {
                Class<?> classType = (Class<?>)from;
                while (classType.isArray()) {
                    classType = classType.getComponentType();
                }
                t = classType;
            }
            return TypeToken.isAssignableFrom(t, (ParameterizedType)toGenericComponentType, new HashMap<String, Type>());
        }
        return true;
    }

    private static AssertionError buildUnexpectedTypeError(Type token, Class<?> ... expected) {
        StringBuilder exceptionMessage = new StringBuilder("Unexpected type. Expected one of: ");
        Class<?>[] classArray = expected;
        int n = classArray.length;
        for (int i = 0; i < n; ++i) {
            Class<?> clazz = classArray[i];
            exceptionMessage.append(clazz.getName()).append(", ");
        }
        exceptionMessage.append("but got: ").append(token.getClass().getName()).append(", for type token: ").append(token.toString()).append('.');
        return new AssertionError((Object)exceptionMessage.toString());
    }

    @Deprecated
    public boolean isAssignableFrom(Type from) {
        if (from == null) {
            return false;
        }
        if (this.type.equals(from)) {
            return true;
        }
        if (this.type instanceof Class) {
            return this.rawType.isAssignableFrom($Gson$Types.getRawType(from));
        }
        if (this.type instanceof ParameterizedType) {
            return TypeToken.isAssignableFrom(from, (ParameterizedType)this.type, new HashMap<String, Type>());
        }
        if (this.type instanceof GenericArrayType) {
            return this.rawType.isAssignableFrom($Gson$Types.getRawType(from)) && TypeToken.isAssignableFrom(from, (GenericArrayType)this.type);
        }
        Class[] classArray = new Class[3];
        classArray[0] = Class.class;
        classArray[1] = ParameterizedType.class;
        classArray[2] = GenericArrayType.class;
        throw TypeToken.buildUnexpectedTypeError(this.type, classArray);
    }
}

