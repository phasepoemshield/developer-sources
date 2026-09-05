/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  org.joml.Vector2fc
 *  org.joml.Vector3fc
 *  org.joml.Vector4fc
 */
package Nursultan;

import java.nio.FloatBuffer;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import org.joml.Vector2fc;
import org.joml.Vector3fc;
import org.joml.Vector4fc;

public class class11169
extends Enum<class11169> {
    public static final /* enum */ class11169 FLOAT;
    public static final /* enum */ class11169 INT;
    public static final /* enum */ class11169 BOOL;
    public static final /* enum */ class11169 VEC2;
    public static final /* enum */ class11169 VEC3;
    public static final /* enum */ class11169 VEC4;
    public static final /* enum */ class11169 FLOAT_ARRAY;
    private static final /* synthetic */ class11169[] $VALUES;
    public String fields_07f967a3f78943be5b7036c4e47452c9b_0;
    public String fields_07f967a3f78943be5b7036c4e47452c9b_1;
    public Boolean fields_07f967a3f78943be5b7036c4e47452c9b_2;
    public boolean fields_07f967a3f78943be5b7036c4e47452c9b_init;

    private static boolean L(Object object) {
        Number number;
        int n;
        if (object instanceof Boolean) {
            Boolean bl = (Boolean)object;
            return bl;
        }
        if (object instanceof Number && ((n = class11169.y(number = (Number)object)) == 0 || n == 1)) {
            return n == 1;
        }
        throw new IllegalArgumentException("Expected boolean or 0/1 number, got " + class11169.i(object));
    }

    private static void L() {
    }

    private class11169(String string2, String string3, boolean bl) {
        this.u();
        this.fields_07f967a3f78943be5b7036c4e47452c9b_0 = string2;
        this.fields_07f967a3f78943be5b7036c4e47452c9b_1 = string3;
        this.fields_07f967a3f78943be5b7036c4e47452c9b_2 = bl;
    }

    static {
        class11169.L();
        FLOAT = new class11169("FLOAT", "float", false);
        INT = new class11169("INT", "int", false);
        BOOL = new class11169("BOOL", "bool", false);
        VEC2 = new class11169("VEC2", "vec2", false);
        VEC3 = new class11169("VEC3", "vec3", false);
        VEC4 = new class11169("VEC4", "vec4", false);
        FLOAT_ARRAY = new class11169("FLOAT_ARRAY", "float", true);
        $VALUES = class11169.R();
    }

    public static class11169[] values() {
        return (class11169[])$VALUES.clone();
    }

    public static class11169 valueOf(String string) {
        return Enum.valueOf(class11169.class, string);
    }

    private static String i(Object object) {
        return object == null ? "null" : object.getClass().getName();
    }

    private void u() {
        if (!this.fields_07f967a3f78943be5b7036c4e47452c9b_init) {
            this.fields_07f967a3f78943be5b7036c4e47452c9b_init = true;
            this.fields_07f967a3f78943be5b7036c4e47452c9b_2 = false;
        }
    }

    private static Number u(Object object) {
        if (object instanceof Number) {
            return (Number)object;
        }
        throw new IllegalArgumentException("Expected number, got " + class11169.i(object));
    }

    private static int y(Object object) {
        int n;
        Number number = class11169.u(object);
        double d = number.doubleValue();
        if (d != (double)(n = number.intValue())) {
            throw new IllegalArgumentException("Expected integer number, got " + String.valueOf(object));
        }
        return n;
    }

    public String y() {
        return this.fields_07f967a3f78943be5b7036c4e47452c9b_0;
    }

    private static String y(Object object, int n) {
        StringBuilder stringBuilder = new StringBuilder();
        class11169.N(stringBuilder, object, n);
        return stringBuilder.toString();
    }

    private static String y(String string, Object object, int n) {
        float[] fArray = class11169.N(object, n);
        StringBuilder stringBuilder = new StringBuilder(string).append('(');
        for (int i = 0; i < n; ++i) {
            if (i > 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(class11169.N(fArray[i]));
        }
        return stringBuilder.append(')').toString();
    }

    private static void N(StringBuilder stringBuilder, Object object, int n) {
        if (object instanceof FloatBuffer) {
            FloatBuffer floatBuffer = (FloatBuffer)object;
            int n2 = floatBuffer.limit();
            if (n2 != n) {
                throw new IllegalArgumentException("Expected float buffer with limit " + n + ", got " + n2);
            }
            for (int i = 0; i < n; ++i) {
                class11169.N(stringBuilder, i, floatBuffer.get(i));
            }
            return;
        }
        if (object instanceof float[]) {
            float[] fArray = (float[])object;
            if (fArray.length != n) {
                throw new IllegalArgumentException("Expected float array length " + n + ", got " + fArray.length);
            }
            for (int i = 0; i < n; ++i) {
                class11169.N(stringBuilder, i, fArray[i]);
            }
            return;
        }
        if (object instanceof double[]) {
            double[] dArray = (double[])object;
            if (dArray.length != n) {
                throw new IllegalArgumentException("Expected double array length " + n + ", got " + dArray.length);
            }
            for (int i = 0; i < n; ++i) {
                class11169.N(stringBuilder, i, (float)dArray[i]);
            }
            return;
        }
        if (object instanceof Collection) {
            Collection collection = (Collection)object;
            if (collection.size() != n) {
                throw new IllegalArgumentException("Expected collection size " + n + ", got " + collection.size());
            }
            int n3 = 0;
            for (Object e : collection) {
                class11169.N(stringBuilder, n3++, class11169.u(e).floatValue());
            }
            return;
        }
        throw new IllegalArgumentException("Expected float array, FloatBuffer, double array or number collection, got " + class11169.i(object));
    }

    private static void N(StringBuilder stringBuilder, int n, float f) {
        if (n > 0) {
            stringBuilder.append(", ");
        }
        stringBuilder.append(class11169.N(f));
    }

    public String N(String string, int n) {
        if (this.fields_07f967a3f78943be5b7036c4e47452c9b_2.booleanValue()) {
            if (n <= 0) {
                throw new IllegalArgumentException("Array template uniform needs a positive size: " + string);
            }
            return "uniform " + this.fields_07f967a3f78943be5b7036c4e47452c9b_1 + " " + string + "[" + n + "];";
        }
        return "uniform " + this.fields_07f967a3f78943be5b7036c4e47452c9b_1 + " " + string + ";";
    }

    public String N(Object object) {
        return switch (this.ordinal()) {
            default -> throw new MatchException(null, null);
            case 0 -> class11169.N(class11169.u(object));
            case 1 -> Integer.toString(class11169.y(object));
            case 2 -> {
                if (class11169.L(object)) {
                    yield "1";
                }
                yield "0";
            }
            case 3 -> class11169.y("vec2", object, 2);
            case 4 -> class11169.y("vec3", object, 3);
            case 5 -> class11169.y("vec4", object, 4);
            case 6 -> throw new IllegalArgumentException("FLOAT_ARRAY needs defineDeclaration with array size");
        };
    }

    private static String N(Number number) {
        return class11169.N(number.floatValue());
    }

    public boolean N() {
        return this.fields_07f967a3f78943be5b7036c4e47452c9b_2;
    }

    public String N(String string, Object object, int n) {
        if (this.fields_07f967a3f78943be5b7036c4e47452c9b_2.booleanValue()) {
            if (n <= 0) {
                throw new IllegalArgumentException("Array template define needs a positive size: " + string);
            }
            return "const " + this.fields_07f967a3f78943be5b7036c4e47452c9b_1 + " " + string + "[" + n + "] = " + this.fields_07f967a3f78943be5b7036c4e47452c9b_1 + "[" + n + "](" + class11169.y(object, n) + ");";
        }
        return "#define " + string + " " + this.N(object);
    }

    private static String N(float f) {
        if (!Float.isFinite(f)) {
            throw new IllegalArgumentException("GLSL float literal must be finite: " + f);
        }
        String string = String.format(Locale.ROOT, "%s", Float.valueOf(f));
        return string.indexOf(46) >= 0 || string.indexOf(69) >= 0 || string.indexOf(101) >= 0 ? string : string + ".0";
    }

    private static float[] N(Object object, int n) {
        Object object2;
        if (object instanceof Vector2fc) {
            object2 = (Vector2fc)object;
            if (n == 2) {
                return new float[]{object2.x(), object2.y()};
            }
        }
        if (object instanceof Vector3fc) {
            object2 = (Vector3fc)object;
            if (n == 3) {
                return new float[]{object2.x(), object2.y(), object2.z()};
            }
        }
        if (object instanceof Vector4fc) {
            object2 = (Vector4fc)object;
            if (n == 4) {
                return new float[]{object2.x(), object2.y(), object2.z(), object2.w()};
            }
        }
        if (object instanceof float[] && ((Vector2fc)(object2 = (Object)((float[])object))).length == n) {
            return (float[])object2.clone();
        }
        if (object instanceof double[] && ((Vector2fc)(object2 = (Object)((double[])object))).length == n) {
            float[] fArray = new float[n];
            for (int i = 0; i < n; ++i) {
                fArray[i] = (float)object2[i];
            }
            return fArray;
        }
        if (object instanceof Collection && (object2 = (Collection)object).size() == n) {
            float[] fArray = new float[n];
            Iterator iterator = object2.iterator();
            for (int i = 0; i < n; ++i) {
                fArray[i] = class11169.u(iterator.next()).floatValue();
            }
            return fArray;
        }
        throw new IllegalArgumentException("Expected " + n + " float values, got " + class11169.i(object));
    }

    public static class11169 N(String string) {
        for (class11169 class111692 : class11169.values()) {
            if (!class111692.fields_07f967a3f78943be5b7036c4e47452c9b_0.equals(string)) continue;
            return class111692;
        }
        throw new IllegalArgumentException("Unknown shader template marker type: " + string);
    }

    private static /* synthetic */ class11169[] R() {
        return new class11169[]{FLOAT, INT, BOOL, VEC2, VEC3, VEC4, FLOAT_ARRAY};
    }
}

