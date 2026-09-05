/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07185
 *  minecraft.class07536
 *  org.joml.Matrix3f
 *  org.joml.Matrix3fc
 *  org.joml.Vector3f
 *  org.joml.Vector3i
 */
package minecraft;

import java.util.Arrays;
import minecraft.class07185;
import minecraft.class07536;
import org.joml.Matrix3f;
import org.joml.Matrix3fc;
import org.joml.Vector3f;
import org.joml.Vector3i;

public final class class05285
extends Enum<class05285> {
    public static final /* enum */ class05285 field_23362 = new class05285(0, 1, 2);
    public static final /* enum */ class05285 field_23363 = new class05285(1, 0, 2);
    public static final /* enum */ class05285 field_23364 = new class05285(0, 2, 1);
    public static final /* enum */ class05285 field_23366 = new class05285(2, 0, 1);
    public static final /* enum */ class05285 field_23365 = new class05285(1, 2, 0);
    public static final /* enum */ class05285 field_23367 = new class05285(2, 1, 0);
    private final int field_63625;
    private final int field_63626;
    private final int field_63627;
    private final Matrix3fc field_23369;
    private static final class05285[][] field_57036;
    private static final class05285[] field_63628;
    private static final /* synthetic */ class05285[] field_23371;

    private class05285(int n2, int n3, int n4) {
        this.field_63625 = n2;
        this.field_63626 = n3;
        this.field_63627 = n4;
        this.field_23369 = new Matrix3f().zero().set(this.N(0), 0, 1.0f).set(this.N(1), 1, 1.0f).set(this.N(2), 2, 1.0f);
    }

    public static class05285[] values() {
        return (class05285[])field_23371.clone();
    }

    public static class05285 valueOf(String string) {
        return Enum.valueOf(class05285.class, string);
    }

    private static /* synthetic */ class05285[] i() {
        return new class05285[]{field_23362, field_23363, field_23364, field_23366, field_23365, field_23367};
    }

    public Matrix3fc y() {
        return this.field_23369;
    }

    public int N(int n) {
        return switch (n) {
            case 0 -> this.field_63625;
            case 1 -> this.field_63626;
            case 2 -> this.field_63627;
            default -> throw new IllegalArgumentException("Must be 0, 1 or 2, but got " + n);
        };
    }

    public class05285 N() {
        return field_63628[this.ordinal()];
    }

    public class05285 N(class05285 class052852) {
        return field_57036[this.ordinal()][class052852.ordinal()];
    }

    public Vector3i N(Vector3i vector3i) {
        int n = vector3i.get(this.field_63625);
        int n2 = vector3i.get(this.field_63626);
        int n3 = vector3i.get(this.field_63627);
        return vector3i.set(n, n2, n3);
    }

    public Vector3f N(Vector3f vector3f) {
        float f = vector3f.get(this.field_63625);
        float f2 = vector3f.get(this.field_63626);
        float f3 = vector3f.get(this.field_63627);
        return vector3f.set(f, f2, f3);
    }

    public class07185 N(class07185 class071852) {
        return class07185.field_23780[this.N(class071852.ordinal())];
    }

    static {
        field_23371 = class05285.i();
        field_57036 = (class05285[][])class07536.N(() -> {
            class05285[] class05285Array = class05285.values();
            class05285[][] class05285Array2 = new class05285[class05285Array.length][class05285Array.length];
            for (class05285 class052853 : class05285Array) {
                for (class05285 class052854 : class05285Array) {
                    class05285 class052855;
                    int n = class052853.N(class052854.field_63625);
                    int n2 = class052853.N(class052854.field_63626);
                    int n3 = class052853.N(class052854.field_63627);
                    class05285Array2[class052853.ordinal()][class052854.ordinal()] = class052855 = Arrays.stream(class05285Array).filter(class052852 -> class052852.field_63625 == n && class052852.field_63626 == n2 && class052852.field_63627 == n3).findFirst().get();
                }
            }
            return class05285Array2;
        });
        field_63628 = (class05285[])class07536.N(() -> (class05285[])Arrays.stream(class05285.values()).map(class052852 -> Arrays.stream(class05285.values()).filter(class052853 -> class052852.N((class05285)((Object)((Object)((Object)class052853)))) == field_23362).findAny().get()).toArray(class05285[]::new));
    }
}

