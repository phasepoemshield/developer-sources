/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson;

import com.google.gson.FieldNamingStrategy;
import java.lang.reflect.Field;
import java.util.Locale;

public abstract class FieldNamingPolicy
extends Enum<FieldNamingPolicy>
implements FieldNamingStrategy {
    public static final /* enum */ FieldNamingPolicy UPPER_CAMEL_CASE;
    public static final /* enum */ FieldNamingPolicy LOWER_CASE_WITH_DOTS;
    public static final /* enum */ FieldNamingPolicy IDENTITY;
    public static final /* enum */ FieldNamingPolicy UPPER_CAMEL_CASE_WITH_SPACES;
    private static final /* synthetic */ FieldNamingPolicy[] $VALUES;
    public static final /* enum */ FieldNamingPolicy UPPER_CASE_WITH_UNDERSCORES;
    public static final /* enum */ FieldNamingPolicy LOWER_CASE_WITH_DASHES;
    public static final /* enum */ FieldNamingPolicy LOWER_CASE_WITH_UNDERSCORES;

    /*
     * WARNING - void declaration
     */
    static String upperCaseFirstLetter(String s) {
        String string;
        int length = s.length();
        int i = 0;
        while (i < length) {
            void var2_2;
            char c = s.charAt(i);
            if (Character.isLetter(c)) {
                if (Character.isUpperCase(c)) {
                    return s;
                }
                char uppercased = Character.toUpperCase(c);
                if (i == 0) {
                    return uppercased + s.substring(1);
                }
                return s.substring(0, i) + uppercased + s.substring(i + 1);
            }
            ++var2_2;
        }
        return string;
    }

    public static FieldNamingPolicy valueOf(String name) {
        return Enum.valueOf(FieldNamingPolicy.class, name);
    }

    public static FieldNamingPolicy[] values() {
        return (FieldNamingPolicy[])$VALUES.clone();
    }

    static {
        IDENTITY = new FieldNamingPolicy(){

            @Override
            public String translateName(Field f) {
                return f.getName();
            }
        };
        UPPER_CAMEL_CASE = new FieldNamingPolicy(){

            @Override
            public String translateName(Field f) {
                return 2.upperCaseFirstLetter(f.getName());
            }
        };
        UPPER_CAMEL_CASE_WITH_SPACES = new FieldNamingPolicy(){

            @Override
            public String translateName(Field f) {
                return 3.upperCaseFirstLetter(3.separateCamelCase(f.getName(), ' '));
            }
        };
        UPPER_CASE_WITH_UNDERSCORES = new FieldNamingPolicy(){

            @Override
            public String translateName(Field f) {
                return 4.separateCamelCase(f.getName(), '_').toUpperCase(Locale.ENGLISH);
            }
        };
        LOWER_CASE_WITH_UNDERSCORES = new FieldNamingPolicy(){

            @Override
            public String translateName(Field f) {
                return 5.separateCamelCase(f.getName(), '_').toLowerCase(Locale.ENGLISH);
            }
        };
        LOWER_CASE_WITH_DASHES = new FieldNamingPolicy(){

            @Override
            public String translateName(Field f) {
                return 6.separateCamelCase(f.getName(), '-').toLowerCase(Locale.ENGLISH);
            }
        };
        LOWER_CASE_WITH_DOTS = new FieldNamingPolicy(){

            @Override
            public String translateName(Field f) {
                return 7.separateCamelCase(f.getName(), '.').toLowerCase(Locale.ENGLISH);
            }
        };
        FieldNamingPolicy[] fieldNamingPolicyArray = new FieldNamingPolicy[7];
        fieldNamingPolicyArray[0] = IDENTITY;
        fieldNamingPolicyArray[1] = UPPER_CAMEL_CASE;
        fieldNamingPolicyArray[2] = UPPER_CAMEL_CASE_WITH_SPACES;
        fieldNamingPolicyArray[3] = UPPER_CASE_WITH_UNDERSCORES;
        fieldNamingPolicyArray[4] = LOWER_CASE_WITH_UNDERSCORES;
        fieldNamingPolicyArray[5] = LOWER_CASE_WITH_DASHES;
        fieldNamingPolicyArray[6] = LOWER_CASE_WITH_DOTS;
        $VALUES = fieldNamingPolicyArray;
    }

    /*
     * WARNING - void declaration
     */
    static String separateCamelCase(String name, char separator) {
        void var2_2;
        StringBuilder translation = new StringBuilder();
        int i = 0;
        int length = name.length();
        while (i < length) {
            void var3_3;
            void var5_5;
            char character = name.charAt(i);
            if (Character.isUpperCase(character)) {
                if (translation.length() != 0) {
                    translation.append(separator);
                }
            }
            translation.append((char)var5_5);
            ++var3_3;
        }
        return var2_2.toString();
    }
}

