package jnr.ffi.util;

import java.util.Arrays;

// $VF: Compiled from AnnotationProperty.java
final class AnnotationProperty {
   private Object value;
   private final String name;
   private final Class<?> type;

   @Override
   public boolean equals(Object obj) {
      if (this == obj) {
         return true;
      }

      if (obj == null) {
         return false;
      }

      if (this.getClass() != obj.getClass()) {
         return false;
      }

      AnnotationProperty other = (AnnotationProperty)obj;
      if (this.name == null) {
         if (other.getName() != null) {
            return false;
         }
      } else if (!this.name.equals(other.getName())) {
         return false;
      }

      if (this.type == null) {
         if (other.getType() != null) {
            return false;
         }
      } else if (!this.type.equals(other.getType())) {
         return false;
      }

      if (this.value == null) {
         if (other.getValue() != null) {
            return false;
         }
      } else {
         if (!this.type.isArray()) {
            return this.value.equals(other.getValue());
         }

         if (this.value instanceof Object[] && other.getValue() instanceof Object[]) {
            Arrays.equals((Object[])this.value, (Object[])other.getValue());
         }

         if (this.type == byte[].class) {
            return Arrays.equals((byte[])this.value, (byte[])other.getValue());
         }

         if (this.type == char[].class) {
            return Arrays.equals((char[])this.value, (char[])other.getValue());
         }

         if (this.type == double[].class) {
            return Arrays.equals((double[])this.value, (double[])other.getValue());
         }

         if (this.type == float[].class) {
            return Arrays.equals((float[])this.value, (float[])other.getValue());
         }

         if (this.type == int[].class) {
            return Arrays.equals((int[])this.value, (int[])other.getValue());
         }

         if (this.type == long[].class) {
            return Arrays.equals((long[])this.value, (long[])other.getValue());
         }

         if (this.type == short[].class) {
            return Arrays.equals((short[])this.value, (short[])other.getValue());
         }

         if (this.type == boolean[].class) {
            return Arrays.equals((boolean[])this.value, (boolean[])other.getValue());
         }
      }

      return false;
   }

   public Object getValue() {
      return this.value;
   }

   public void setValue(Object value) {
      if (value == null
         || this.type.isAssignableFrom(value.getClass())
         || this.type == boolean.class && value.getClass() == Boolean.class
         || this.type == byte.class && value.getClass() == Byte.class
         || this.type == char.class && value.getClass() == Character.class
         || this.type == double.class && value.getClass() == Double.class
         || this.type == float.class && value.getClass() == Float.class
         || this.type == int.class && value.getClass() == Integer.class
         || this.type == long.class && value.getClass() == Long.class
         || this.type == short.class && value.getClass() == Short.class) {
         this.value = value;
      } else {
         throw new IllegalArgumentException(
            "Cannot assign value of type '" + value.getClass().getName() + "' to property '" + this.name + "' of type '" + this.type.getName() + "'"
         );
      }
   }

   @Override
   public int hashCode() {
      int prime = 31;
      int result = 1;
      result = 31 * result + this.name.hashCode();
      result = 31 * result + this.type.hashCode();
      return 31 * result + this.getValueHashCode();
   }

   public AnnotationProperty(String type, Class<?> name) {
      this.name = name;
      this.type = type;
   }

   protected String valueToString() {
      if (!this.type.isArray()) {
         return String.valueOf(this.value);
      } else {
         Class<?> arrayType = this.type.getComponentType();
         if (arrayType == boolean.class) {
            return Arrays.toString((boolean[])this.value);
         } else if (arrayType == byte.class) {
            return Arrays.toString((byte[])this.value);
         } else if (arrayType == char.class) {
            return Arrays.toString((char[])this.value);
         } else if (arrayType == double.class) {
            return Arrays.toString((double[])this.value);
         } else if (arrayType == float.class) {
            return Arrays.toString((float[])this.value);
         } else if (arrayType == int.class) {
            return Arrays.toString((int[])this.value);
         } else if (arrayType == long.class) {
            return Arrays.toString((long[])this.value);
         } else {
            return arrayType == short.class ? Arrays.toString((short[])this.value) : Arrays.toString((Object[])this.value);
         }
      }
   }

   @Override
   public String toString() {
      return "(name="
         + this.name
         + ", type="
         + (this.type.isArray() ? this.type.getComponentType().getName() + "[]" : this.type.getName())
         + ", value="
         + this.valueToString()
         + ")";
   }

   public String getName() {
      return this.name;
   }

   protected int getValueHashCode() {
      if (this.value == null) {
         return 0;
      } else if (!this.type.isArray()) {
         return this.value.hashCode();
      } else if (this.type == byte[].class) {
         return Arrays.hashCode((byte[])this.value);
      } else if (this.type == char[].class) {
         return Arrays.hashCode((char[])this.value);
      } else if (this.type == double[].class) {
         return Arrays.hashCode((double[])this.value);
      } else if (this.type == float[].class) {
         return Arrays.hashCode((float[])this.value);
      } else if (this.type == int[].class) {
         return Arrays.hashCode((int[])this.value);
      } else if (this.type == long[].class) {
         return Arrays.hashCode((long[])this.value);
      } else if (this.type == short[].class) {
         return Arrays.hashCode((short[])this.value);
      } else {
         return this.type == boolean[].class ? Arrays.hashCode((boolean[])this.value) : Arrays.hashCode((Object[])this.value);
      }
   }

   public Class<?> getType() {
      return this.type;
   }
}
