/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.extensions.compactnotation;

import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.extensions.compactnotation.CompactConstructor;

public class PackageCompactConstructor
extends CompactConstructor {
    private String packageName;

    public PackageCompactConstructor(String string) {
        this.packageName = string;
    }

    public Class<?> getClassForName(String string) throws ClassNotFoundException {
        if (string.indexOf(46) < 0) {
            try {
                Class<?> clazz = Class.forName(this.packageName + "." + string);
                return clazz;
            }
            catch (ClassNotFoundException classNotFoundException) {
                // empty catch block
            }
        }
        return super.getClassForName(string);
    }
}

