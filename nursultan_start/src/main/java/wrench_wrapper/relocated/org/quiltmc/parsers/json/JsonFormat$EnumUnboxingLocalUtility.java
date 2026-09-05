/*
 * Decompiled with CFR 0.152.
 */
package wrench_wrapper.relocated.org.quiltmc.parsers.json;

public abstract class JsonFormat$EnumUnboxingLocalUtility {
    public static /* synthetic */ String stringValueOf(int n) {
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    return "null";
                }
                return "JSON5";
            }
            return "JSONC";
        }
        return "JSON";
    }
}

