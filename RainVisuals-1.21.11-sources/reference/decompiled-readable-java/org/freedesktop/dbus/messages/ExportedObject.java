/*
 * Decompiled with CFR 0.152.
 */
package org.freedesktop.dbus.messages;

import java.lang.annotation.Annotation;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.text.MessageFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import org.freedesktop.dbus.Marshalling;
import org.freedesktop.dbus.MethodTuple;
import org.freedesktop.dbus.StrongReference;
import org.freedesktop.dbus.Tuple;
import org.freedesktop.dbus.TypeRef;
import org.freedesktop.dbus.annotations.DBusBoundProperty;
import org.freedesktop.dbus.annotations.DBusIgnore;
import org.freedesktop.dbus.annotations.DBusInterfaceName;
import org.freedesktop.dbus.annotations.DBusMemberName;
import org.freedesktop.dbus.annotations.DBusProperties;
import org.freedesktop.dbus.annotations.DBusProperty;
import org.freedesktop.dbus.connections.AbstractConnection;
import org.freedesktop.dbus.exceptions.DBusException;
import org.freedesktop.dbus.exceptions.DBusExecutionException;
import org.freedesktop.dbus.interfaces.DBusInterface;
import org.freedesktop.dbus.interfaces.Introspectable;
import org.freedesktop.dbus.interfaces.Peer;
import org.freedesktop.dbus.messages.DBusSignal;
import org.freedesktop.dbus.propertyref.PropertyRef;
import org.freedesktop.dbus.utils.DBusNamingUtil;
import org.freedesktop.dbus.utils.Util;
import org.slf4j.LoggerFactory;

public class ExportedObject {
    private final Reference<DBusInterface> object;
    private final String introspectionData;
    private final Map<MethodTuple, Method> methods;
    private final Map<PropertyRef, Method> propertyMethods;

    public Reference<DBusInterface> getObject() {
        return this.object;
    }

    public ExportedObject(DBusInterface _object, boolean _weakreferences) throws DBusException {
        this.object = _weakreferences ? new WeakReference<DBusInterface>(_object) : new StrongReference<DBusInterface>(_object);
        this.methods = new HashMap<MethodTuple, Method>();
        this.propertyMethods = new HashMap<PropertyRef, Method>();
        Set<Class<?>> implementedInterfaces = this.getDBusInterfaces(_object.getClass());
        implementedInterfaces.add(Introspectable.class);
        implementedInterfaces.add(Peer.class);
        this.introspectionData = this.generateIntrospectionXml(implementedInterfaces);
    }

    /*
     * WARNING - void declaration
     */
    protected String generatePropertyXml(String _propertyName, Class<?> _propertyTypeClass, DBusProperty.Access _access) throws DBusException {
        void var5_4;
        void var4_5;
        void var1_1;
        if (TypeRef.class.isAssignableFrom(_propertyTypeClass)) {
            Type actualType = Optional.ofNullable(Util.unwrapTypeRef(_propertyTypeClass)).orElseThrow(() -> new DBusException("Could not read TypeRef type for property '" + _propertyName + "'"));
            Type[] typeArray = new Type[1];
            typeArray[0] = actualType;
            propertyTypeString = Marshalling.getDBusType(typeArray);
        } else if (List.class.equals(_propertyTypeClass)) {
            propertyTypeString = "av";
        } else if (Map.class.equals(_propertyTypeClass)) {
            propertyTypeString = "a{vv}";
        } else {
            Type[] typeArray = new Type[1];
            typeArray[0] = _propertyTypeClass;
            propertyTypeString = Marshalling.getDBusType(typeArray);
        }
        String access = _access.getAccessName();
        return "<property name=\"" + (String)var1_1 + "\" type=\"" + (String)var4_5 + "\" access=\"" + (String)var5_4 + "\" />";
    }

    /*
     * WARNING - void declaration
     */
    protected String generateMethodsXml(Class<?> _clz) throws DBusException {
        void var2_2;
        StringBuilder sb = new StringBuilder();
        Method[] methodArray = _clz.getDeclaredMethods();
        int n = methodArray.length;
        for (int i = 0; i < n; ++i) {
            void var6_6;
            int n2;
            int n3;
            Method meth = methodArray[i];
            if (ExportedObject.isExcluded(meth)) continue;
            String methodName = DBusNamingUtil.getMethodName(meth);
            if (methodName.length() > 255) {
                throw new DBusException("Introspected method name exceeds 255 characters. Cannot export objects with method " + methodName);
            }
            sb.append("  <method name=\"").append(methodName).append("\" >\n");
            sb.append(this.generateAnnotationsXml(meth));
            Class<?>[] classArray = meth.getExceptionTypes();
            int n4 = classArray.length;
            for (n3 = 0; n3 < n4; ++n3) {
                Class<?> ex = classArray[n3];
                if (!DBusExecutionException.class.isAssignableFrom(ex)) continue;
                sb.append("   <annotation name=\"org.freedesktop.DBus.Method.Error\" value=\"").append(AbstractConnection.DOLLAR_PATTERN.matcher(ex.getName()).replaceAll(".")).append("\" />\n");
            }
            StringBuilder ms = new StringBuilder();
            Object[] objectArray = meth.getGenericParameterTypes();
            n3 = objectArray.length;
            for (n2 = 0; n2 < n3; ++n2) {
                Type pt = objectArray[n2];
                String[] stringArray = Marshalling.getDBusType(pt);
                int n5 = stringArray.length;
                for (int j = 0; j < n5; ++j) {
                    void var16_24;
                    String s = stringArray[j];
                    sb.append("   <arg type=\"").append(s).append("\" direction=\"in\"/>\n");
                    ms.append((String)var16_24);
                }
            }
            if (!Void.TYPE.equals(meth.getGenericReturnType())) {
                if (Tuple.class.isAssignableFrom(meth.getReturnType())) {
                    Type[] ts;
                    ParameterizedType tc = (ParameterizedType)meth.getGenericReturnType();
                    Type[] typeArray = ts = tc.getActualTypeArguments();
                    int pt = typeArray.length;
                    for (int j = 0; j < pt; ++j) {
                        Type t = typeArray[j];
                        if (t == null) continue;
                        String[] stringArray = Marshalling.getDBusType(t);
                        int n6 = stringArray.length;
                        for (int k = 0; k < n6; ++k) {
                            void var18_27;
                            String s = stringArray[k];
                            sb.append("   <arg type=\"").append((String)var18_27).append("\" direction=\"out\"/>\n");
                        }
                    }
                } else {
                    if (Object[].class.equals((Object)meth.getGenericReturnType())) {
                        throw new DBusException("Return type of Object[] cannot be introspected properly");
                    }
                    objectArray = Marshalling.getDBusType(meth.getGenericReturnType());
                    n3 = objectArray.length;
                    for (n2 = 0; n2 < n3; ++n2) {
                        void var12_16;
                        Object s = objectArray[n2];
                        sb.append("   <arg type=\"").append((String)var12_16).append("\" direction=\"out\"/>\n");
                    }
                }
            }
            sb.append("  </method>\n");
            this.methods.putIfAbsent(new MethodTuple(methodName, classArray.toString()), (Method)var6_6);
        }
        return var2_2.toString();
    }

    public Map<MethodTuple, Method> getMethods() {
        return this.methods;
    }

    public String toString() {
        return this.getClass().getSimpleName() + " [methodCount=" + this.methods.size() + ", propertyMethodCount=" + this.propertyMethods.size() + ", object=" + (this.object.get() != null ? Objects.toString(this.object) : "<no object referenced>") + "]";
    }

    public String getIntrospectiondata() {
        return this.introspectionData;
    }

    public Map<PropertyRef, Method> getPropertyMethods() {
        return this.propertyMethods;
    }

    /*
     * WARNING - void declaration
     */
    protected Set<Class<?>> getDBusInterfaces(Class<?> _inputClazz) {
        void var2_2;
        Objects.requireNonNull(_inputClazz, "inputClazz must not be null");
        LinkedHashSet<Class> result = new LinkedHashSet<Class>();
        LinkedHashSet<Class> checked = new LinkedHashSet<Class>();
        LinkedList toCheck = new LinkedList();
        toCheck.add(_inputClazz);
        while (!toCheck.isEmpty()) {
            List<Class<?>> interfaces;
            Class clazz = (Class)toCheck.poll();
            checked.add(clazz);
            Class superClass = clazz.getSuperclass();
            if (superClass != null && DBusInterface.class.isAssignableFrom(superClass)) {
                toCheck.add(superClass);
            }
            if ((interfaces = Arrays.asList(clazz.getInterfaces())).contains(DBusInterface.class)) {
                result.add(clazz);
            }
            interfaces.stream().filter(DBusInterface.class::isAssignableFrom).filter(i -> i != DBusInterface.class).filter(i -> !checked.contains(i)).forEach(toCheck::add);
        }
        return var2_2;
    }

    /*
     * WARNING - void declaration
     */
    protected String generateAnnotationsXml(AnnotatedElement _c) {
        void var2_2;
        StringBuilder ans = new StringBuilder();
        Annotation[] annotationArray = _c.getDeclaredAnnotations();
        int n = annotationArray.length;
        for (int i = 0; i < n; ++i) {
            Annotation a2 = annotationArray[i];
            if (!a2.annotationType().isAnnotationPresent(DBusInterfaceName.class)) continue;
            Class<? extends Annotation> t = a2.annotationType();
            String value = "";
            try {
                Method m = t.getMethod("value", new Class[0]);
                if (m != null) {
                    value = m.invoke((Object)a2, new Object[0]).toString();
                }
            }
            catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException _ex) {
                LoggerFactory.getLogger(this.getClass()).trace("Could not find value", _ex);
            }
            String name = DBusNamingUtil.getAnnotationName(t);
            ans.append("  <annotation name=\"").append(name).append("\" value=\"").append(value).append("\" />\n");
        }
        return var2_2.toString();
    }

    /*
     * WARNING - void declaration
     */
    private String generateIntrospectionXml(Set<Class<?>> _interfaces) throws DBusException {
        void var2_2;
        StringBuilder sb = new StringBuilder();
        Iterator<Class<?>> iterator2 = _interfaces.iterator();
        while (iterator2.hasNext()) {
            Class<?> iface = iterator2.next();
            String ifaceName = DBusNamingUtil.getInterfaceName(iface);
            if (ifaceName.equals(iface.getSimpleName())) {
                throw new DBusException("DBusInterfaces cannot be declared outside a package");
            }
            if (ifaceName.length() > 255) {
                throw new DBusException("Introspected interface name exceeds 255 characters. Cannot export objects of type " + ifaceName);
            }
            if (iface.isAnnotationPresent(DBusInterfaceName.class)) {
                DBusSignal.addInterfaceMap(iface.getName(), ifaceName);
            }
            sb.append(" <interface name=\"").append(ifaceName).append("\">\n");
            sb.append(this.generateAnnotationsXml(iface));
            sb.append(this.generateMethodsXml(iface));
            sb.append(this.generatePropertiesXml(iface));
            sb.append(this.generateSignalsXml(iface));
            sb.append(" </interface>\n");
        }
        return var2_2.toString();
    }

    public static boolean isExcluded(Method _meth) {
        return _meth == null || !Modifier.isPublic(_meth.getModifiers()) || _meth.isSynthetic() || _meth.isDefault() || _meth.isBridge() || _meth.getAnnotation(DBusIgnore.class) != null || _meth.getAnnotation(DBusBoundProperty.class) != null || _meth.getName().equals("getObjectPath") && _meth.getReturnType().equals(String.class) && _meth.getParameterCount() == 0;
    }

    /*
     * WARNING - void declaration
     */
    protected String generateSignalsXml(Class<?> _clz) throws DBusException {
        void var2_2;
        StringBuilder sb = new StringBuilder();
        Class<?>[] classArray = _clz.getDeclaredClasses();
        int n = classArray.length;
        for (int i = 0; i < n; ++i) {
            Class<?> sig = classArray[i];
            if (!DBusSignal.class.isAssignableFrom(sig)) continue;
            String signalName = DBusNamingUtil.getSignalName(sig);
            if (sig.isAnnotationPresent(DBusMemberName.class)) {
                DBusSignal.addSignalMap(sig.getSimpleName(), signalName);
            }
            if (signalName.length() > 255) {
                throw new DBusException("Introspected signal name exceeds 255 characters. Cannot export objects with signals of type " + signalName);
            }
            sb.append("  <signal name=\"").append(signalName).append("\">\n");
            Constructor<?> con = sig.getConstructors()[0];
            Type[] ts = con.getGenericParameterTypes();
            int j = 1;
            while (j < ts.length) {
                void var10_10;
                String[] stringArray = Marshalling.getDBusType(ts[j]);
                int n2 = stringArray.length;
                for (int k = 0; k < n2; ++k) {
                    String s = stringArray[k];
                    sb.append("   <arg type=\"").append(s).append("\" direction=\"out\" />\n");
                }
                ++var10_10;
            }
            sb.append(this.generateAnnotationsXml(sig));
            sb.append("  </signal>\n");
        }
        return var2_2.toString();
    }

    protected String generatePropertyXml(DBusProperty _property) throws DBusException {
        return this.generatePropertyXml(_property.name(), _property.type(), _property.access());
    }

    /*
     * WARNING - void declaration
     */
    protected String generatePropertiesXml(Class<?> _clz) throws DBusException {
        void var2_2;
        DBusProperty property;
        int n;
        StringBuilder xml = new StringBuilder();
        HashMap<Object, Object> map = new HashMap<Object, Object>();
        DBusProperties properties = _clz.getAnnotation(DBusProperties.class);
        if (properties != null) {
            DBusProperty[] dBusPropertyArray = properties.value();
            int n2 = dBusPropertyArray.length;
            for (n = 0; n < n2; ++n) {
                DBusProperty property2 = dBusPropertyArray[n];
                if (map.containsKey(property2.name())) {
                    Object[] objectArray = new Object[1];
                    objectArray[0] = property2.name();
                    throw new DBusException(MessageFormat.format("Property ''{0}'' defined multiple times.", objectArray));
                }
                map.put(property2.name(), new PropertyRef(property2));
            }
        }
        if ((property = _clz.getAnnotation(DBusProperty.class)) != null) {
            if (map.containsKey(property.name())) {
                Object[] objectArray = new Object[1];
                objectArray[0] = property.name();
                throw new DBusException(MessageFormat.format("Property ''{0}'' defined multiple times.", objectArray));
            }
            map.put(property.name(), new PropertyRef(property));
        }
        Method[] methodArray = _clz.getDeclaredMethods();
        n = methodArray.length;
        for (int i = 0; i < n; ++i) {
            void var14_17;
            void var11_14;
            Method method = methodArray[i];
            DBusBoundProperty propertyAnnot = method.getAnnotation(DBusBoundProperty.class);
            if (propertyAnnot == null) continue;
            String name = DBusNamingUtil.getPropertyName(method);
            DBusProperty.Access access = PropertyRef.accessForMethod(method);
            PropertyRef.checkMethod(method);
            Class<?> type = PropertyRef.typeForMethod(method);
            PropertyRef ref = new PropertyRef(name, type, access);
            this.propertyMethods.put(ref, method);
            if (map.containsKey(name)) {
                PropertyRef existing = (PropertyRef)map.get(name);
                if (access.equals((Object)existing.getAccess())) {
                    Object[] objectArray = new Object[2];
                    objectArray[0] = name;
                    objectArray[1] = access;
                    throw new DBusException(MessageFormat.format("Property ''{0}'' has access mode ''{1}'' defined multiple times.", objectArray));
                }
                map.put(name, new PropertyRef(name, type, DBusProperty.Access.READ_WRITE));
                continue;
            }
            map.put(var11_14, var14_17);
        }
        for (PropertyRef ref : map.values()) {
            void var7_9;
            xml.append("  ").append(this.generatePropertyXml(ref.getName(), ref.getType(), var7_9.getAccess())).append("\n");
        }
        return var2_2.toString();
    }
}

