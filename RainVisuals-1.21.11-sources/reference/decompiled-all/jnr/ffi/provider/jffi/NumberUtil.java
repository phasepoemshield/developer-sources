package jnr.ffi.provider.jffi;

import com.kenai.jffi.Type;
import jnr.ffi.NativeType;
import jnr.ffi.provider.SigType;
import org.objectweb.asm.Label;

// $VF: Compiled from NumberUtil.java
public final class NumberUtil {
   public static void widen(SkinnyMethodAdapter mv, Class to, Class from, NativeType nativeType) {
      if (isPrimitiveInt(from)) {
         if (nativeType == NativeType.UCHAR) {
            mv.pushInt(255);
            mv.iand();
         } else if (nativeType == NativeType.USHORT) {
            mv.pushInt(65535);
            mv.iand();
         }

         if (long.class == to) {
            mv.i2l();
            switch (nativeType) {
               case UINT:
               case ULONG:
               case ADDRESS:
                  if (sizeof(nativeType) < 8) {
                     mv.ldc(4294967295L);
                     mv.land();
                  }
            }
         }
      }
   }

   static Class getPrimitiveClass(Class c) {
      if (Void.class == c) {
         return void.class;
      } else if (Boolean.class == c) {
         return boolean.class;
      } else if (Byte.class == c) {
         return byte.class;
      } else if (Character.class == c) {
         return char.class;
      } else if (Short.class == c) {
         return short.class;
      } else if (Integer.class == c) {
         return int.class;
      } else if (Long.class == c) {
         return long.class;
      } else if (Float.class == c) {
         return float.class;
      } else if (Double.class == c) {
         return double.class;
      } else if (c.isPrimitive()) {
         return c;
      } else {
         throw new IllegalArgumentException("unsupported number class");
      }
   }

   public static boolean isPrimitiveInt(Class c) {
      return byte.class == c || char.class == c || short.class == c || int.class == c || boolean.class == c;
   }

   public static void narrow(SkinnyMethodAdapter to, Class from, Class mv) {
      if (!from.equals(to)) {
         if (byte.class != to && short.class != to && char.class != to && int.class != to) {
            if (boolean.class == to) {
               Label label_false_branch = new Label();
               Label label_end = new Label();
               if (long.class == from) {
                  mv.lconst_0();
                  mv.lcmp();
                  mv.ifeq(label_false_branch);
                  mv.iconst_1();
                  mv.go_to(label_end);
                  mv.label(label_false_branch);
                  mv.iconst_0();
                  mv.label(label_end);
               } else {
                  mv.ifeq(label_false_branch);
                  mv.iconst_1();
                  mv.go_to(label_end);
                  mv.label(label_false_branch);
                  mv.iconst_0();
                  mv.label(label_end);
               }
            }
         } else {
            if (long.class == from) {
               mv.l2i();
            }

            if (byte.class == to) {
               mv.i2b();
            } else if (short.class == to) {
               mv.i2s();
            } else if (char.class == to) {
               mv.i2c();
            }
         }
      }
   }

   static int sizeof(SigType type) {
      return sizeof(type.getNativeType());
   }

   public static void convertPrimitive(SkinnyMethodAdapter nativeType, Class from, Class mv, NativeType to) {
      if (boolean.class == to) {
         narrow(mv, from, to);
      } else {
         switch (nativeType) {
            case UINT:
            case ULONG:
            case ADDRESS:
               if (sizeof(nativeType) <= 4) {
                  narrow(mv, from, int.class);
                  if (long.class == to) {
                     mv.i2l();
                     mv.ldc(4294967295L);
                     mv.land();
                  }
               } else {
                  widen(mv, from, to);
               }
               break;
            case SCHAR:
               narrow(mv, from, byte.class);
               widen(mv, byte.class, to);
               break;
            case SSHORT:
               narrow(mv, from, short.class);
               widen(mv, short.class, to);
               break;
            case SINT:
               narrow(mv, from, int.class);
               widen(mv, int.class, to);
               break;
            case UCHAR:
               narrow(mv, from, int.class);
               mv.pushInt(255);
               mv.iand();
               widen(mv, int.class, to);
               break;
            case USHORT:
               narrow(mv, from, int.class);
               mv.pushInt(65535);
               mv.iand();
               widen(mv, int.class, to);
            case FLOAT:
            case DOUBLE:
               break;
            default:
               narrow(mv, from, to);
               widen(mv, from, to);
         }
      }
   }

   public static void convertPrimitive(SkinnyMethodAdapter to, Class mv, Class from) {
      narrow(mv, from, to);
      widen(mv, from, to);
   }

   public static void widen(SkinnyMethodAdapter to, Class from, Class mv) {
      if (long.class == to && long.class != from && isPrimitiveInt(from)) {
         mv.i2l();
      } else if (boolean.class == to && boolean.class != from && isPrimitiveInt(from)) {
         mv.iconst_1();
         mv.iand();
      }
   }

   private NumberUtil() {
   }

   static Class getBoxedClass(Class c) {
      if (!c.isPrimitive()) {
         return c;
      } else if (void.class == c) {
         return Void.class;
      } else if (byte.class == c) {
         return Byte.class;
      } else if (char.class == c) {
         return Character.class;
      } else if (short.class == c) {
         return Short.class;
      } else if (int.class == c) {
         return Integer.class;
      } else if (long.class == c) {
         return Long.class;
      } else if (float.class == c) {
         return Float.class;
      } else if (double.class == c) {
         return Double.class;
      } else if (boolean.class == c) {
         return Boolean.class;
      } else {
         throw new IllegalArgumentException("unknown primitive class");
      }
   }

   static int sizeof(NativeType nativeType) {
      switch (nativeType) {
         case UINT:
            return Type.UINT.size();
         case ULONG:
            return Type.ULONG.size();
         case ADDRESS:
            return Type.POINTER.size();
         case SCHAR:
            return Type.SCHAR.size();
         case SSHORT:
            return Type.SSHORT.size();
         case SINT:
            return Type.SINT.size();
         case UCHAR:
            return Type.UCHAR.size();
         case USHORT:
            return Type.USHORT.size();
         case FLOAT:
            return Type.FLOAT.size();
         case DOUBLE:
            return Type.DOUBLE.size();
         case SLONG:
            return Type.SLONG.size();
         case SLONGLONG:
            return Type.SLONG_LONG.size();
         case ULONGLONG:
            return Type.ULONG_LONG.size();
         case VOID:
            return 0;
         default:
            throw new UnsupportedOperationException("cannot determine size of " + nativeType);
      }
   }
}
