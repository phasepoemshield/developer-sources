/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml;

public enum DumperOptions$LineBreak {
    WIN("\r\n"),
    MAC("\r"),
    UNIX("\n");

    private String lineBreak;

    public String getString() {
        return this.lineBreak;
    }

    private DumperOptions$LineBreak(String string2) {
        this.lineBreak = string2;
    }

    public String toString() {
        return "Line break: " + this.name();
    }

    public static DumperOptions$LineBreak getPlatformLineBreak() {
        String string = System.getProperty("line.separator");
        for (DumperOptions$LineBreak dumperOptions$LineBreak : DumperOptions$LineBreak.values()) {
            if (!dumperOptions$LineBreak.lineBreak.equals(string)) continue;
            return dumperOptions$LineBreak;
        }
        return UNIX;
    }
}

