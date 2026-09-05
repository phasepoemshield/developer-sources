/*
 * Decompiled with CFR 0.152.
 */
package org.quiltmc.config.api.metadata;

import java.util.ArrayList;
import org.quiltmc.config.api.metadata.NamingScheme;
import org.quiltmc.config.api.metadata.NamingSchemes$1;
import org.quiltmc.config.api.metadata.NamingSchemes$2;
import org.quiltmc.config.api.metadata.NamingSchemes$3;
import org.quiltmc.config.api.metadata.NamingSchemes$4;
import org.quiltmc.config.api.metadata.NamingSchemes$5;
import org.quiltmc.config.api.metadata.NamingSchemes$6;
import org.quiltmc.config.api.metadata.NamingSchemes$7;
import org.quiltmc.config.api.metadata.NamingSchemes$8;

public abstract class NamingSchemes
extends Enum
implements NamingScheme {
    public static final /* enum */ NamingSchemes PASSTHROUGH = new NamingSchemes$1();
    public static final /* enum */ NamingSchemes UPPER_CAMEL_CASE = new NamingSchemes$2();
    public static final /* enum */ NamingSchemes LOWER_CAMEL_CASE = new NamingSchemes$3();
    public static final /* enum */ NamingSchemes KEBAB_CASE = new NamingSchemes$4();
    public static final /* enum */ NamingSchemes SNAKE_CASE = new NamingSchemes$5();
    public static final /* enum */ NamingSchemes SPACE_SEPARATED_LOWER_CASE = new NamingSchemes$6();
    public static final /* enum */ NamingSchemes SPACE_SEPARATED_LOWER_CASE_INITIAL_UPPER_CASE = new NamingSchemes$7();
    public static final /* enum */ NamingSchemes TITLE_CASE = new NamingSchemes$8();
    private static final /* synthetic */ NamingSchemes[] $VALUES;

    static /* synthetic */ String[] access$100(String string) {
        return NamingSchemes.extractWords(string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private NamingSchemes() {
        void var2_-1;
        void var1_-1;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    /* synthetic */ NamingSchemes(NamingSchemes$1 namingSchemes$1) {
        this((String)var1_-1, (int)var2_1);
        void var2_1;
        void var1_-1;
    }

    public static NamingSchemes[] values() {
        return (NamingSchemes[])$VALUES.clone();
    }

    public static NamingSchemes valueOf(String string) {
        return Enum.valueOf(NamingSchemes.class, string);
    }

    private static /* synthetic */ NamingSchemes[] $values() {
        return new NamingSchemes[]{PASSTHROUGH, UPPER_CAMEL_CASE, LOWER_CAMEL_CASE, KEBAB_CASE, SNAKE_CASE, SPACE_SEPARATED_LOWER_CASE, SPACE_SEPARATED_LOWER_CASE_INITIAL_UPPER_CASE, TITLE_CASE};
    }

    private static /* synthetic */ void lambda$extractWords$0(ArrayList serializable, StringBuilder[] stringBuilderArray, int[] nArray, int n) {
        if (n != 45 && n != 95 && n != 32) {
            if (Character.isUpperCase(n)) {
                if (nArray[0] == 2) {
                    StringBuilder stringBuilder;
                    ((ArrayList)serializable).add(stringBuilderArray[0].toString());
                    serializable = stringBuilder;
                    stringBuilder = new StringBuilder();
                    stringBuilderArray[0] = serializable;
                    nArray[0] = 0;
                } else {
                    nArray[0] = 1;
                }
            } else {
                nArray[0] = 2;
            }
            stringBuilderArray[0].appendCodePoint(Character.toLowerCase(n));
        } else {
            StringBuilder stringBuilder;
            ((ArrayList)serializable).add(stringBuilderArray[0].toString());
            serializable = stringBuilder;
            stringBuilder = new StringBuilder();
            stringBuilderArray[0] = serializable;
            nArray[0] = 0;
        }
    }

    private static String[] extractWords(String object) {
        StringBuilder stringBuilder;
        ArrayList<String> arrayList;
        ArrayList<String> arrayList2 = arrayList;
        arrayList = new ArrayList<String>();
        StringBuilder stringBuilder2 = stringBuilder;
        stringBuilder = new StringBuilder();
        StringBuilder[] stringBuilderArray = new StringBuilder[1];
        String string = object;
        stringBuilderArray[0] = stringBuilder2;
        int[] nArray = new int[1];
        object = nArray;
        nArray[0] = 0;
        string.codePoints().forEach(arg_0 -> NamingSchemes.lambda$extractWords$0(arrayList2, stringBuilderArray, (int[])object, arg_0));
        arrayList.add(stringBuilderArray[0].toString());
        return arrayList.toArray(new String[0]);
    }

    static {
        $VALUES = NamingSchemes.$values();
    }
}

