package org.freedesktop.dbus;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import org.freedesktop.dbus.annotations.Position;
import org.freedesktop.dbus.types.DBusStructType;
import org.freedesktop.dbus.types.Variant;

// $VF: Compiled from StructHelper.java
public final class StructHelper {
   public static <T extends Struct> List<T> convertToStructList(List<Object[]> _obj, Class<T> _structType) throws IllegalArgumentException, InvocationTargetException, InstantiationException, SecurityException, NoSuchMethodException, IllegalAccessException {
      List<T> result = new ArrayList<>();
      convertToStructCollection(_obj, _structType, result);
      return result;
   }

   private StructHelper() {
   }

   public static <T extends Struct> T createStruct(Class<?>[] _constructorArgs, Object _values, Class<T> _classToConstruct) throws IllegalArgumentException, InstantiationException, NoSuchMethodException, InvocationTargetException, SecurityException, IllegalAccessException {
      if (_constructorArgs != null && _classToConstruct != null && _values != null) {
         try {
            Constructor<T> _ex = _classToConstruct.getDeclaredConstructor(_constructorArgs);
            _ex.setAccessible(true);
            return (T)(_values instanceof Object[] var7 ? _ex.newInstance(var7) : _ex.newInstance(_values));
         } catch (NoSuchMethodException | SecurityException var6) {
            for (int i = 0; i < _constructorArgs.length; i++) {
               Class<?> class1 = _constructorArgs[i];
               if (ArrayFrob.getWrapperToPrimitiveTypes().containsKey(class1)) {
                  _constructorArgs[i] = ArrayFrob.getWrapperToPrimitiveTypes().get(class1);
                  return createStruct(_constructorArgs, _values, _classToConstruct);
               }
            }

            throw new NoSuchMethodException(
               "Cannot find suitable constructor for arguments " + Arrays.toString(_constructorArgs) + " in class " + _classToConstruct + "."
            );
         }
      } else {
         return null;
      }
   }

   public static <T extends Struct> void convertToStructCollection(Collection<Object[]> _structType, Class<T> _result, Collection<T> _input) throws InvocationTargetException, IllegalArgumentException, InstantiationException, NoSuchMethodException, SecurityException, IllegalAccessException {
      Objects.requireNonNull(_structType, "Struct class required");
      Objects.requireNonNull(_result, "Collection for result storage required");
      Objects.requireNonNull(_input, "Input data required");
      Class<?>[] constructorArgClasses = Arrays.stream(_structType.getDeclaredFields())
         .filter(f -> f.isAnnotationPresent(Position.class))
         .sorted((f1, f2) -> Integer.compare(f1.getAnnotation(Position.class).value(), f2.getAnnotation(Position.class).value()))
         .map(Field::getType)
         .toArray(Class[]::new);

      for (Object[] object : _input) {
         if (constructorArgClasses.length != object.length) {
            throw new IllegalArgumentException("Struct length does not match argument length");
         }

         T x = createStruct(constructorArgClasses, object, _structType);
         _result.add((T)x);
      }
   }

   public static <T extends Struct> T createStructFromVariant(Variant<?> _structClass, Class<T> _variant) throws NoSuchMethodException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException, SecurityException {
      if (_variant == null || _structClass == null) {
         return null;
      } else if (_variant.getType() instanceof DBusStructType && _variant.getValue() instanceof Object[]) {
         Class<?>[] argTypes = Arrays.stream((T[])((Object[])_variant.getValue())).map(Object::getClass).toArray(Class[]::new);
         return createStruct(argTypes, _variant.getValue(), _structClass);
      } else {
         return null;
      }
   }

   public static <T extends Struct> Set<T> convertToStructSet(Set<Object[]> _obj, Class<T> _structType) throws IllegalAccessException, SecurityException, IllegalArgumentException, NoSuchMethodException, InvocationTargetException, InstantiationException {
      Set<T> result = new LinkedHashSet<>();
      convertToStructCollection(_obj, _structType, result);
      return result;
   }
}
