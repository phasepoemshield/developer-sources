/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml;

class Keys$Key {
    final String name;
    final int index;
    final String path;

    Keys$Key(String string, int n, Keys$Key keys$Key) {
        this.name = string;
        this.index = n;
        this.path = keys$Key != null ? string + "." + keys$Key.path : string;
    }
}

