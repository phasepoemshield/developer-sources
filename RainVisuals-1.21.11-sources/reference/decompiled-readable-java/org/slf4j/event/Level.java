/*
 * Decompiled with CFR 0.152.
 */
package org.slf4j.event;

public final class Level
extends Enum<Level> {
    private static final /* synthetic */ Level[] $VALUES;
    public static final /* enum */ Level TRACE;
    public static final /* enum */ Level DEBUG;
    public static final /* enum */ Level ERROR;
    public static final /* enum */ Level WARN;
    private final int levelInt;
    public static final /* enum */ Level INFO;
    private final String levelStr;

    public static Level[] values() {
        return (Level[])$VALUES.clone();
    }

    static {
        ERROR = new Level(40, "ERROR");
        WARN = new Level(30, "WARN");
        INFO = new Level(20, "INFO");
        DEBUG = new Level(10, "DEBUG");
        TRACE = new Level(0, "TRACE");
        $VALUES = Level.$values();
    }

    public static Level intToLevel(int levelInt) {
        switch (levelInt) {
            case 0: {
                return TRACE;
            }
            case 10: {
                return DEBUG;
            }
            case 20: {
                return INFO;
            }
            case 30: {
                return WARN;
            }
            case 40: {
                return ERROR;
            }
        }
        throw new IllegalArgumentException("Level integer [" + levelInt + "] not recognized.");
    }

    public int toInt() {
        return this.levelInt;
    }

    public static Level valueOf(String name) {
        return Enum.valueOf(Level.class, name);
    }

    private static /* synthetic */ Level[] $values() {
        Level[] levelArray = new Level[5];
        levelArray[0] = ERROR;
        levelArray[1] = WARN;
        levelArray[2] = INFO;
        levelArray[3] = DEBUG;
        levelArray[4] = TRACE;
        return levelArray;
    }

    private Level(int i, String s) {
        this.levelInt = i;
        this.levelStr = s;
    }

    public String toString() {
        return this.levelStr;
    }
}

