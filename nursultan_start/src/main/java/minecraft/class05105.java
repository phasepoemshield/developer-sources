/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 */
package minecraft;

import com.google.gson.annotations.SerializedName;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public abstract class class05105 {
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("{");
        for (Field field : this.getClass().getFields()) {
            if (class05105.y(field)) continue;
            try {
                stringBuilder.append(class05105.N(field)).append("=").append(field.get(this)).append(" ");
            }
            catch (IllegalAccessException illegalAccessException) {
                // empty catch block
            }
        }
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    private static boolean y(Field field) {
        return Modifier.isStatic(field.getModifiers());
    }

    private static String N(Field field) {
        SerializedName serializedName = field.getAnnotation(SerializedName.class);
        return serializedName != null ? serializedName.value() : field.getName();
    }
}

