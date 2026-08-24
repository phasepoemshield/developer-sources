/*
 * Decompiled with CFR 0.152.
 */
package jnr.ffi.util;

import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import jnr.ffi.util.AnnotationProperty;

public final class AnnotationProxy<A extends Annotation>
implements Annotation,
InvocationHandler {
    private final A proxedAnnotation;
    private static final int MEMBER_NAME_MULTIPLICATOR = 127;
    private final Map<String, AnnotationProperty> properties = new LinkedHashMap<String, AnnotationProperty>();
    private final Class<A> annotationType;

    @Override
    public int hashCode() {
        int n;
        int hashCode = 0;
        Iterator<Map.Entry<String, AnnotationProperty>> iterator2 = this.properties.entrySet().iterator();
        while (iterator2.hasNext()) {
            Map.Entry<String, AnnotationProperty> property = iterator2.next();
            n = hashCode + (127 * property.getKey().hashCode() ^ property.getValue().getValueHashCode());
        }
        return n;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args2) throws Throwable {
        String name = method.getName();
        if (this.properties.containsKey(name)) {
            return this.properties.get(name).getValue();
        }
        return method.invoke((Object)this, args2);
    }

    private AnnotationProxy(Class<A> annotationType) {
        this.annotationType = annotationType;
        Method[] methodArray = AnnotationProxy.getDeclaredMethods(annotationType);
        int n = methodArray.length;
        for (int i = 0; i < n; ++i) {
            Method method = methodArray[i];
            String propertyName = method.getName();
            Class<?> returnType = method.getReturnType();
            Object defaultValue = method.getDefaultValue();
            AnnotationProperty property = new AnnotationProperty(propertyName, returnType);
            property.setValue(defaultValue);
            this.properties.put(propertyName, property);
        }
        Class[] classArray = new Class[1];
        classArray[0] = annotationType;
        this.proxedAnnotation = (Annotation)annotationType.cast(Proxy.newProxyInstance(annotationType.getClassLoader(), classArray, (InvocationHandler)this));
    }

    private static AnnotationProxy<?> getAnnotationProxy(Object obj) {
        InvocationHandler handler;
        if (Proxy.isProxyClass(obj.getClass()) && (handler = Proxy.getInvocationHandler(obj)) instanceof AnnotationProxy) {
            return (AnnotationProxy)handler;
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
        }
        return this.properties.get(name).getValue();
    }

    /*
     * WARNING - void declaration
     */
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
        Method[] methodArray = AnnotationProxy.getDeclaredMethods(this.annotationType());
        int n = methodArray.length;
        for (int i = 0; i < n; ++i) {
            void var8_8;
            Method method = methodArray[i];
            String propertyName = method.getName();
            if (!this.properties.containsKey(propertyName)) {
                return false;
            }
            AnnotationProperty expected = this.properties.get(propertyName);
            AnnotationProperty actual = new AnnotationProperty(propertyName, method.getReturnType());
            AnnotationProxy<?> proxy = AnnotationProxy.getAnnotationProxy(obj);
            if (proxy != null) {
                actual.setValue(proxy.getProperty(propertyName));
            } else {
                try {
                    actual.setValue(method.invoke(obj, new Object[0]));
                }
                catch (IllegalArgumentException e) {
                    return false;
                }
                catch (IllegalAccessException e) {
                    void var10_11;
                    throw new AssertionError(var10_11);
                }
                catch (InvocationTargetException invocationTargetException) {
                    return false;
                }
            }
            if (expected.equals(var8_8)) continue;
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("@").append(this.annotationType.getName()).append('(');
        int counter = 0;
        Iterator<Map.Entry<String, AnnotationProperty>> iterator2 = this.properties.entrySet().iterator();
        while (iterator2.hasNext()) {
            Map.Entry<String, AnnotationProperty> property = iterator2.next();
            if (counter > 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(property.getKey()).append('=').append(property.getValue().valueToString());
            ++counter;
        }
        return stringBuilder.append(')').toString();
    }

    private static <A extends Annotation> Method[] getDeclaredMethods(final Class<A> annotationType) {
        return AccessController.doPrivileged(new PrivilegedAction<Method[]>(){

            /*
             * WARNING - void declaration
             */
            @Override
            public Method[] run() {
                void var1_1;
                AccessibleObject[] declaredMethods = annotationType.getDeclaredMethods();
                AccessibleObject.setAccessible(declaredMethods, true);
                return var1_1;
            }
        });
    }

    public A getProxedAnnotation() {
        return this.proxedAnnotation;
    }

    public static <A extends Annotation> AnnotationProxy<A> newProxy(Class<A> annotationType) {
        if (annotationType == null) {
            throw new IllegalArgumentException("Parameter 'annotationType' must be not null");
        }
        return new AnnotationProxy<A>(annotationType);
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        return this.annotationType;
    }
}

