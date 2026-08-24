/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.objectweb.asm.AnnotationVisitor
 *  org.objectweb.asm.Type
 */
package jnr.ffi.provider.jffi;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.Type;

public class CodegenUtils {
    /*
     * WARNING - void declaration
     */
    public static String sigParams(Class ... params) {
        void var1_1;
        StringBuilder signature = new StringBuilder("(");
        for (int i = 0; i < params.length; ++i) {
            signature.append(CodegenUtils.ci(params[i]));
        }
        signature.append(")");
        return var1_1.toString();
    }

    public static String pretty(Class retval, Class ... params) {
        return CodegenUtils.prettyParams(params) + CodegenUtils.human(retval);
    }

    public static String getAnnotatedBindingClassName(String javaMethodName, String typeName, boolean isStatic, int required, int optional, boolean multi, boolean framed) {
        String commonClassSuffix;
        block1: {
            String marker;
            block0: {
                String string = marker = framed ? "$RUBYFRAMEDINVOKER$" : "$RUBYINVOKER$";
                if (!multi) break block0;
                commonClassSuffix = (isStatic ? "$s" : "$i") + "_method_multi" + marker + javaMethodName;
                break block1;
            }
            commonClassSuffix = (isStatic ? "$s" : "$i") + "_method_" + required + "_" + optional + marker + javaMethodName;
        }
        return typeName + commonClassSuffix;
    }

    public static String p(Class n) {
        return n.getName().replace('.', '/');
    }

    public static Class[] params(Class ... classes) {
        return classes;
    }

    /*
     * WARNING - void declaration
     */
    public static Class[] params(Class cls1, Class clsFill, int times) {
        void var3_3;
        Class clazz;
        Object[] classes = new Class[times + 1];
        Arrays.fill(classes, clsFill);
        classes[0] = clazz;
        return var3_3;
    }

    public static String human(Class n) {
        return n.getCanonicalName();
    }

    /*
     * WARNING - void declaration
     */
    public static String sigParams(String descriptor2, Class ... params) {
        void var2_2;
        StringBuilder signature = new StringBuilder("(");
        signature.append(descriptor2);
        int i = 0;
        while (i < params.length) {
            void var3_3;
            signature.append(CodegenUtils.ci(params[i]));
            ++var3_3;
        }
        signature.append(")");
        return var2_2.toString();
    }

    public static String ci(Class n) {
        if (n.isArray()) {
            if ((n = n.getComponentType()).isPrimitive()) {
                if (n == Byte.TYPE) {
                    return "[B";
                }
                if (n == Boolean.TYPE) {
                    return "[Z";
                }
                if (n == Short.TYPE) {
                    return "[S";
                }
                if (n == Character.TYPE) {
                    return "[C";
                }
                if (n == Integer.TYPE) {
                    return "[I";
                }
                if (n == Float.TYPE) {
                    return "[F";
                }
                if (n == Double.TYPE) {
                    return "[D";
                }
                if (n == Long.TYPE) {
                    return "[J";
                }
                throw new RuntimeException("Unrecognized type in compiler: " + n.getName());
            }
            return "[" + CodegenUtils.ci(n);
        }
        if (n.isPrimitive()) {
            if (n == Byte.TYPE) {
                return "B";
            }
            if (n == Boolean.TYPE) {
                return "Z";
            }
            if (n == Short.TYPE) {
                return "S";
            }
            if (n == Character.TYPE) {
                return "C";
            }
            if (n == Integer.TYPE) {
                return "I";
            }
            if (n == Float.TYPE) {
                return "F";
            }
            if (n == Double.TYPE) {
                return "D";
            }
            if (n == Long.TYPE) {
                return "J";
            }
            if (n == Void.TYPE) {
                return "V";
            }
            throw new RuntimeException("Unrecognized type in compiler: " + n.getName());
        }
        return "L" + CodegenUtils.p(n) + ";";
    }

    public static String p(String n) {
        return n.replace('.', '/');
    }

    public static String sig(Class retval, Class ... params) {
        return CodegenUtils.sigParams(params) + CodegenUtils.ci(retval);
    }

    public static String c(String p) {
        return p.replace('/', '.');
    }

    public static String sig(Class retval, String descriptor2, Class ... params) {
        return CodegenUtils.sigParams(descriptor2, params) + CodegenUtils.ci(retval);
    }

    /*
     * WARNING - void declaration
     */
    public static void visitAnnotationFields(AnnotationVisitor visitor, Map<String, Object> fields) {
        Iterator<Map.Entry<String, Object>> iterator2 = fields.entrySet().iterator();
        while (iterator2.hasNext()) {
            void var4_4;
            Map.Entry<String, Object> fieldEntry = iterator2.next();
            Object value = fieldEntry.getValue();
            if (value.getClass().isArray()) {
                void var6_6;
                Object[] values2 = (Object[])value;
                AnnotationVisitor arrayV = visitor.visitArray(fieldEntry.getKey());
                int i = 0;
                while (i < values2.length) {
                    void var7_7;
                    arrayV.visit(null, values2[i]);
                    ++var7_7;
                }
                var6_6.visitEnd();
                continue;
            }
            if (value.getClass().isEnum()) {
                visitor.visitEnum(fieldEntry.getKey(), CodegenUtils.ci(value.getClass()), value.toString());
                continue;
            }
            if (value instanceof Class) {
                visitor.visit(fieldEntry.getKey(), (Object)Type.getType((Class)((Class)value)));
                continue;
            }
            visitor.visit(fieldEntry.getKey(), (Object)var4_4);
        }
    }

    /*
     * WARNING - void declaration
     */
    public static String prettyParams(Class ... params) {
        void var1_1;
        StringBuilder signature = new StringBuilder("(");
        int i = 0;
        while (i < params.length) {
            void var2_2;
            signature.append(CodegenUtils.human(params[i]));
            if (i < params.length - 1) {
                signature.append(',');
            }
            ++var2_2;
        }
        signature.append(")");
        return var1_1.toString();
    }

    /*
     * WARNING - void declaration
     */
    public static Class[] params(Class cls, int times) {
        void var2_2;
        Object[] classes = new Class[times];
        Arrays.fill(classes, cls);
        return var2_2;
    }
}

