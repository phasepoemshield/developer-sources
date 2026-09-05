/*
 * Decompiled with CFR 0.152.
 */
package wrench_wrapper.relocated.org.quiltmc.parsers.json;

public abstract class JsonToken$EnumUnboxingLocalUtility {
    public static /* synthetic */ String stringValueOf(int n) {
        switch (n) {
            default: {
                return "null";
            }
            case 10: {
                return "END_DOCUMENT";
            }
            case 9: {
                return "NULL";
            }
            case 8: {
                return "BOOLEAN";
            }
            case 7: {
                return "NUMBER";
            }
            case 6: {
                return "STRING";
            }
            case 5: {
                return "NAME";
            }
            case 4: {
                return "END_OBJECT";
            }
            case 3: {
                return "BEGIN_OBJECT";
            }
            case 2: {
                return "END_ARRAY";
            }
            case 1: 
        }
        return "BEGIN_ARRAY";
    }
}

