package jnr.ffi.provider.jffi;

// $VF: Compiled from Util.java
final class Util {
   static boolean getBooleanProperty(String propertyName, boolean defaultValue) {
      try {
         return Boolean.valueOf(System.getProperty(propertyName, Boolean.valueOf(defaultValue).toString()));
      } catch (SecurityException se) {
         return defaultValue;
      }
   }
}
