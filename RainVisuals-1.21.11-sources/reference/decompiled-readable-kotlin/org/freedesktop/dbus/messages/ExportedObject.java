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
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Queue;
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
import org.freedesktop.dbus.propertyref.PropertyRef;
import org.freedesktop.dbus.utils.DBusNamingUtil;
import org.freedesktop.dbus.utils.Util;
import org.slf4j.LoggerFactory;

// $VF: Compiled from ExportedObject.java
public class ExportedObject {
   private final Reference<DBusInterface> object;
   private final String introspectionData;
   private final Map<MethodTuple, Method> methods;
   private final Map<PropertyRef, Method> propertyMethods;

   public Reference<DBusInterface> getObject() {
      return this.object;
   }

   public ExportedObject(DBusInterface _object, boolean _weakreferences) throws DBusException {
      this.object = _weakreferences ? new WeakReference<>(_object) : new StrongReference<>(_object);
      this.methods = new HashMap<>();
      this.propertyMethods = new HashMap<>();
      Set<Class<?>> implementedInterfaces = this.getDBusInterfaces(_object.getClass());
      implementedInterfaces.add(Introspectable.class);
      implementedInterfaces.add(Peer.class);
      this.introspectionData = this.generateIntrospectionXml(implementedInterfaces);
   }

   protected String generatePropertyXml(String _propertyName, Class<?> _propertyTypeClass, DBusProperty.Access _access) throws DBusException {
      String propertyTypeString;
      if (TypeRef.class.isAssignableFrom(_propertyTypeClass)) {
         Type access = Optional.ofNullable(Util.unwrapTypeRef(_propertyTypeClass))
            .orElseThrow(() -> new DBusException("Could not read TypeRef type for property '" + _propertyName + "'"));
         propertyTypeString = Marshalling.getDBusType(new Type[]{access});
      } else if (List.class.equals(_propertyTypeClass)) {
         propertyTypeString = "av";
      } else if (Map.class.equals(_propertyTypeClass)) {
         propertyTypeString = "a{vv}";
      } else {
         propertyTypeString = Marshalling.getDBusType(new Type[]{_propertyTypeClass});
      }

      String var6 = _access.getAccessName();
      return "<property name=\"" + _propertyName + "\" type=\"" + propertyTypeString + "\" access=\"" + var6 + "\" />";
   }

   protected String generateMethodsXml(Class<?> _clz) throws DBusException {
      StringBuilder sb = new StringBuilder();

      for (Method meth : _clz.getDeclaredMethods()) {
         if (!isExcluded(meth)) {
            String methodName = DBusNamingUtil.getMethodName(meth);
            if (methodName.length() > 255) {
               throw new DBusException("Introspected method name exceeds 255 characters. Cannot export objects with method " + methodName);
            }

            sb.append("  <method name=\"").append(methodName).append("\" >\n");
            sb.append(this.generateAnnotationsXml(meth));

            for (Class<?> ex : meth.getExceptionTypes()) {
               if (DBusExecutionException.class.isAssignableFrom(ex)) {
                  sb.append("   <annotation name=\"org.freedesktop.DBus.Method.Error\" value=\"")
                     .append(AbstractConnection.DOLLAR_PATTERN.matcher(ex.getName()).replaceAll("."))
                     .append("\" />\n");
               }
            }

            StringBuilder var19 = new StringBuilder();

            for (Type s : meth.getGenericParameterTypes()) {
               for (String sx : Marshalling.getDBusType(s)) {
                  sb.append("   <arg type=\"").append(sx).append("\" direction=\"in\"/>\n");
                  var19.append(sx);
               }
            }

            if (!void.class.equals(meth.getGenericReturnType())) {
               if (Tuple.class.isAssignableFrom(meth.getReturnType())) {
                  ParameterizedType var21 = (ParameterizedType)meth.getGenericReturnType();
                  Type[] var24 = var21.getActualTypeArguments();

                  for (Type var32 : var24) {
                     if (var32 != null) {
                        for (String s : Marshalling.getDBusType(var32)) {
                           sb.append("   <arg type=\"").append(s).append("\" direction=\"out\"/>\n");
                        }
                     }
                  }
               } else {
                  if (Object[].class.equals(meth.getGenericReturnType())) {
                     throw new DBusException("Return type of Object[] cannot be introspected properly");
                  }

                  for (String var30 : Marshalling.getDBusType(meth.getGenericReturnType())) {
                     sb.append("   <arg type=\"").append(var30).append("\" direction=\"out\"/>\n");
                  }
               }
            }

            sb.append("  </method>\n");
            this.methods.putIfAbsent(new MethodTuple(methodName, var19.toString()), meth);
         }
      }

      return sb.toString();
   }

   public Map<MethodTuple, Method> getMethods() {
      return this.methods;
   }

   @Override
   public String toString() {
      return this.getClass().getSimpleName()
         + " [methodCount="
         + this.methods.size()
         + ", propertyMethodCount="
         + this.propertyMethods.size()
         + ", object="
         + (this.object.get() != null ? Objects.toString(this.object) : "<no object referenced>")
         + "]";
   }

   public String getIntrospectiondata() {
      return this.introspectionData;
   }

   public Map<PropertyRef, Method> getPropertyMethods() {
      return this.propertyMethods;
   }

   protected Set<Class<?>> getDBusInterfaces(Class<?> _inputClazz) {
      Objects.requireNonNull(_inputClazz, "inputClazz must not be null");
      Set<Class<?>> result = new LinkedHashSet<>();
      Set<Class<?>> checked = new LinkedHashSet<>();
      Queue<Class<?>> toCheck = new LinkedList<>();
      toCheck.add(_inputClazz);

      while (!toCheck.isEmpty()) {
         Class<?> clazz = toCheck.poll();
         checked.add(clazz);
         Class<?> superClass = clazz.getSuperclass();
         if (superClass != null && DBusInterface.class.isAssignableFrom(superClass)) {
            toCheck.add(superClass);
         }

         List<Class<?>> interfaces = Arrays.asList(clazz.getInterfaces());
         if (interfaces.contains(DBusInterface.class)) {
            result.add(clazz);
         }

         interfaces.stream()
            .filter(DBusInterface.class::isAssignableFrom)
            .filter(i -> i != DBusInterface.class)
            .filter(i -> !checked.contains(i))
            .forEach(toCheck::add);
      }

      return result;
   }

   protected String generateAnnotationsXml(AnnotatedElement _c) {
      StringBuilder ans = new StringBuilder();

      for (Annotation a : _c.getDeclaredAnnotations()) {
         if (a.annotationType().isAnnotationPresent(DBusInterfaceName.class)) {
            Class<? extends Annotation> t = a.annotationType();
            String value = "";

            try {
               Method name = t.getMethod("value");
               if (name != null) {
                  value = name.invoke(a).toString();
               }
            } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException var10) {
               LoggerFactory.getLogger(this.getClass()).trace("Could not find value", var10);
            }

            String var11 = DBusNamingUtil.getAnnotationName(t);
            ans.append("  <annotation name=\"").append(var11).append("\" value=\"").append(value).append("\" />\n");
         }
      }

      return ans.toString();
   }

   private String generateIntrospectionXml(Set<Class<?>> _interfaces) throws DBusException {
      StringBuilder sb = new StringBuilder();

      for (Class<?> iface : _interfaces) {
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

      return sb.toString();
   }

   public static boolean isExcluded(Method _meth) {
      return _meth == null
         || !Modifier.isPublic(_meth.getModifiers())
         || _meth.isSynthetic()
         || _meth.isDefault()
         || _meth.isBridge()
         || _meth.getAnnotation(DBusIgnore.class) != null
         || _meth.getAnnotation(DBusBoundProperty.class) != null
         || _meth.getName().equals("getObjectPath") && _meth.getReturnType().equals(String.class) && _meth.getParameterCount() == 0;
   }

   protected String generateSignalsXml(Class<?> _clz) throws DBusException {
      StringBuilder sb = new StringBuilder();

      for (Class<?> sig : _clz.getDeclaredClasses()) {
         if (DBusSignal.class.isAssignableFrom(sig)) {
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

            for (int j = 1; j < ts.length; j++) {
               for (String s : Marshalling.getDBusType(ts[j])) {
                  sb.append("   <arg type=\"").append(s).append("\" direction=\"out\" />\n");
               }
            }

            sb.append(this.generateAnnotationsXml(sig));
            sb.append("  </signal>\n");
         }
      }

      return sb.toString();
   }

   protected String generatePropertyXml(DBusProperty _property) throws DBusException {
      return this.generatePropertyXml(_property.name(), _property.type(), _property.access());
   }

   protected String generatePropertiesXml(Class<?> _clz) throws DBusException {
      StringBuilder xml = new StringBuilder();
      Map<String, PropertyRef> map = new HashMap<>();
      DBusProperties properties = _clz.getAnnotation(DBusProperties.class);
      if (properties != null) {
         for (DBusProperty property : properties.value()) {
            if (map.containsKey(property.name())) {
               throw new DBusException(MessageFormat.format("Property ''{0}'' defined multiple times.", property.name()));
            }

            map.put(property.name(), new PropertyRef(property));
         }
      }

      DBusProperty var16 = _clz.getAnnotation(DBusProperty.class);
      if (var16 != null) {
         if (map.containsKey(var16.name())) {
            throw new DBusException(MessageFormat.format("Property ''{0}'' defined multiple times.", var16.name()));
         }

         map.put(var16.name(), new PropertyRef(var16));
      }

      for (Method method : _clz.getDeclaredMethods()) {
         DBusBoundProperty propertyAnnot = method.getAnnotation(DBusBoundProperty.class);
         if (propertyAnnot != null) {
            String name = DBusNamingUtil.getPropertyName(method);
            DBusProperty.Access access = PropertyRef.accessForMethod(method);
            PropertyRef.checkMethod(method);
            Class<?> type = PropertyRef.typeForMethod(method);
            PropertyRef ref = new PropertyRef(name, type, access);
            this.propertyMethods.put(ref, method);
            if (map.containsKey(name)) {
               PropertyRef existing = map.get(name);
               if (access.equals(existing.getAccess())) {
                  throw new DBusException(MessageFormat.format("Property ''{0}'' has access mode ''{1}'' defined multiple times.", name, access));
               }

               map.put(name, new PropertyRef(name, type, DBusProperty.Access.READ_WRITE));
            } else {
               map.put(name, ref);
            }
         }
      }

      for (PropertyRef var20 : map.values()) {
         xml.append("  ").append(this.generatePropertyXml(var20.getName(), var20.getType(), var20.getAccess())).append("\n");
      }

      return xml.toString();
   }
}
