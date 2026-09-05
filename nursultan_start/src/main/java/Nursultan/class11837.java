/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public class class11837
extends Record {
    public int iconColor;
    public Runnable onClick;
    public boolean disabled;
    public String iconPath;
    public String text;

    public boolean L() {
        return this.disabled;
    }

    public class11837(String string, int n, String string2, Runnable runnable) {
        this(string, n, string2, runnable, false);
    }

    public class11837(String string, int n, String string2, Runnable runnable, boolean bl) {
        this.iconPath = string;
        this.iconColor = n;
        this.text = string2;
        this.onClick = runnable;
        this.disabled = bl;
    }

    public class11837(String string, int n, Runnable runnable) {
        this(string, n, null, runnable, false);
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class11837.class, "iconPath;iconColor;text;onClick;disabled", "iconPath", "iconColor", "text", "onClick", "disabled"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class11837.class, "iconPath;iconColor;text;onClick;disabled", "iconPath", "iconColor", "text", "onClick", "disabled"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class11837.class, "iconPath;iconColor;text;onClick;disabled", "iconPath", "iconColor", "text", "onClick", "disabled"}, this);
    }

    public Runnable i() {
        return this.onClick;
    }

    public String u() {
        return this.iconPath;
    }

    public int y() {
        return this.iconColor;
    }

    public String N() {
        return this.text;
    }
}

