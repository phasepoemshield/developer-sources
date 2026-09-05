/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

public interface class11686 {
    default public boolean y(String string) {
        for (String string2 : this.N()) {
            if (!string.contains(string2)) continue;
            return true;
        }
        return false;
    }

    public String[] N();

    public void N(String var1);
}

