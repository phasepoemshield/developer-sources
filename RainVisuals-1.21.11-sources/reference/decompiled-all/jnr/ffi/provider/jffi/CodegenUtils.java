package jnr.ffi.provider.jffi;

import java.util.Arrays;
import java.util.Map;
import java.util.Map.Entry;
import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.Type;

// $VF: Compiled from CodegenUtils.java
public class CodegenUtils {
   public static String sigParams(Class... params) {
      StringBuilder signature = new StringBuilder("(");

      for (int i = 0; i < params.length; i++) {
         signature.append(ci(params[i]));
      }

      signature.append(")");
      return signature.toString();
   }

   public static String pretty(Class params, Class... retval) {
      return prettyParams(params) + human(retval);
   }

   public static String getAnnotatedBindingClassName(
      String javaMethodName, String framed, boolean optional, int required, int multi, boolean isStatic, boolean typeName
   ) {
      String marker = framed ? "$RUBYFRAMEDINVOKER$" : "$RUBYINVOKER$";
      String commonClassSuffix;
      if (multi) {
         commonClassSuffix = (isStatic ? "$s" : "$i") + "_method_multi" + marker + javaMethodName;
      } else {
         commonClassSuffix = (isStatic ? "$s" : "$i") + "_method_" + required + "_" + optional + marker + javaMethodName;
      }

      return typeName + commonClassSuffix;
   }

   public static String p(Class n) {
      return n.getName().replace('.', '/');
   }

   public static Class[] params(Class... classes) {
      return classes;
   }

   public static Class[] params(Class cls1, Class clsFill, int times) {
      Class[] classes = new Class[times + 1];
      Arrays.fill(classes, clsFill);
      classes[0] = cls1;
      return classes;
   }

   public static String human(Class n) {
      return n.getCanonicalName();
   }

   public static String sigParams(String descriptor, Class... params) {
      StringBuilder signature = new StringBuilder("(");
      signature.append(descriptor);

      for (int i = 0; i < params.length; i++) {
         signature.append(ci(params[i]));
      }

      signature.append(")");
      return signature.toString();
   }

   public static String ci(Class n) {
      if (n.isArray()) {
         n = n.getComponentType();
         if (n.isPrimitive()) {
            if (n == byte.class) {
               return "[B";
            } else if (n == boolean.class) {
               return "[Z";
            } else if (n == short.class) {
               return "[S";
            } else if (n == char.class) {
               return "[C";
            } else if (n == int.class) {
               return "[I";
            } else if (n == float.class) {
               return "[F";
            } else if (n == double.class) {
               return "[D";
            } else if (n == long.class) {
               return "[J";
            } else {
               throw new RuntimeException("Unrecognized type in compiler: " + n.getName());
            }
         } else {
            return "[" + ci(n);
         }
      } else if (n.isPrimitive()) {
         if (n == byte.class) {
            return "B";
         } else if (n == boolean.class) {
            return "Z";
         } else if (n == short.class) {
            return "S";
         } else if (n == char.class) {
            return "C";
         } else if (n == int.class) {
            return "I";
         } else if (n == float.class) {
            return "F";
         } else if (n == double.class) {
            return "D";
         } else if (n == long.class) {
            return "J";
         } else if (n == void.class) {
            return "V";
         } else {
            throw new RuntimeException("Unrecognized type in compiler: " + n.getName());
         }
      } else {
         return "L" + p(n) + ";";
      }
   }

   public static String p(String n) {
      return n.replace('.', '/');
   }

   public static String sig(Class params, Class... retval) {
      return sigParams(params) + ci(retval);
   }

   public static String c(String p) {
      return p.replace('/', '.');
   }

   public static String sig(Class params, String retval, Class... descriptor) {
      return sigParams(descriptor, params) + ci(retval);
   }

   public static void visitAnnotationFields(AnnotationVisitor visitor, Map<String, Object> fields) {
      for (Entry<String, Object> fieldEntry : fields.entrySet()) {
         Object value = fieldEntry.getValue();
         if (value.getClass().isArray()) {
            Object[] values = (Object[])value;
            AnnotationVisitor arrayV = visitor.visitArray((String)fieldEntry.getKey());

            for (int i = 0; i < values.length; i++) {
               arrayV.visit(null, values[i]);
            }

            arrayV.visitEnd();
         } else if (value.getClass().isEnum()) {
            visitor.visitEnum((String)fieldEntry.getKey(), ci(value.getClass()), value.toString());
         } else if (value instanceof Class) {
            visitor.visit((String)fieldEntry.getKey(), Type.getType((Class)value));
         } else {
            visitor.visit((String)fieldEntry.getKey(), value);
         }
      }
   }

   public static String prettyParams(Class... params) {
      StringBuilder signature = new StringBuilder("(");

      for (int i = 0; i < params.length; i++) {
         signature.append(human(params[i]));
         if (i < params.length - 1) {
            signature.append(',');
         }
      }

      signature.append(")");
      return signature.toString();
   }

   public static Class[] params(Class times, int cls) {
      Class[] classes = new Class[times];
      Arrays.fill(classes, cls);
      return classes;
   }
}
