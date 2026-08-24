/*
 * Decompiled with CFR 0.152.
 */
package org.slf4j.helpers;

import java.io.PrintStream;

public class Reporter {
    private static final Level INTERNAL_VERBOSITY;
    private static final String[] SYSOUT_KEYS;
    static final String SLF4J_WARN_PREFIX = "SLF4J(W): ";
    public static final String SLF4J_INTERNAL_REPORT_STREAM_KEY = "slf4j.internal.report.stream";
    public static final String SLF4J_INTERNAL_VERBOSITY_KEY = "slf4j.internal.verbosity";
    static final String SLF4J_INFO_PREFIX = "SLF4J(I): ";
    private static final TargetChoice TARGET_CHOICE;
    static final String SLF4J_ERROR_PREFIX = "SLF4J(E): ";

    static boolean isEnabledFor(Level level) {
        return level.levelInt >= Reporter.INTERNAL_VERBOSITY.levelInt;
    }

    private static Level initVerbosity() {
        String verbosityStr = System.getProperty(SLF4J_INTERNAL_VERBOSITY_KEY);
        if (verbosityStr == null || verbosityStr.isEmpty()) {
            return Level.INFO;
        }
        if (verbosityStr.equalsIgnoreCase("ERROR")) {
            return Level.ERROR;
        }
        if (verbosityStr.equalsIgnoreCase("WARN")) {
            return Level.WARN;
        }
        return Level.INFO;
    }

    public static final void warn(String msg) {
        if (Reporter.isEnabledFor(Level.WARN)) {
            Reporter.getTarget().println(SLF4J_WARN_PREFIX + msg);
        }
    }

    public static void info(String msg) {
        if (Reporter.isEnabledFor(Level.INFO)) {
            Reporter.getTarget().println(SLF4J_INFO_PREFIX + msg);
        }
    }

    private static TargetChoice initTargetChoice() {
        String reportStreamStr = System.getProperty(SLF4J_INTERNAL_REPORT_STREAM_KEY);
        if (reportStreamStr == null || reportStreamStr.isEmpty()) {
            return TargetChoice.Stderr;
        }
        String[] stringArray = SYSOUT_KEYS;
        int n = stringArray.length;
        for (int i = 0; i < n; ++i) {
            String s = stringArray[i];
            if (!s.equalsIgnoreCase(reportStreamStr)) continue;
            return TargetChoice.Stdout;
        }
        return TargetChoice.Stderr;
    }

    public static final void error(String msg, Throwable t) {
        Reporter.getTarget().println(SLF4J_ERROR_PREFIX + msg);
        Reporter.getTarget().println("SLF4J(E): Reported exception:");
        t.printStackTrace(Reporter.getTarget());
    }

    static {
        String[] stringArray = new String[3];
        stringArray[0] = "System.out";
        stringArray[1] = "stdout";
        stringArray[2] = "sysout";
        SYSOUT_KEYS = stringArray;
        TARGET_CHOICE = Reporter.initTargetChoice();
        INTERNAL_VERBOSITY = Reporter.initVerbosity();
    }

    private static PrintStream getTarget() {
        switch (TARGET_CHOICE.ordinal()) {
            case 1: {
                return System.out;
            }
        }
        return System.err;
    }

    public static final void error(String msg) {
        Reporter.getTarget().println(SLF4J_ERROR_PREFIX + msg);
    }

    private static final class Level
    extends Enum<Level> {
        public static final /* enum */ Level ERROR;
        public static final /* enum */ Level WARN;
        public static final /* enum */ Level INFO;
        int levelInt;
        private static final /* synthetic */ Level[] $VALUES;

        private int getLevelInt() {
            return this.levelInt;
        }

        public static Level valueOf(String name) {
            return Enum.valueOf(Level.class, name);
        }

        private static /* synthetic */ Level[] $values() {
            Level[] levelArray = new Level[3];
            levelArray[0] = INFO;
            levelArray[1] = WARN;
            levelArray[2] = ERROR;
            return levelArray;
        }

        public static Level[] values() {
            return (Level[])$VALUES.clone();
        }

        static {
            INFO = new Level(1);
            WARN = new Level(2);
            ERROR = new Level(3);
            $VALUES = Level.$values();
        }

        private Level(int levelInt) {
            this.levelInt = levelInt;
        }
    }

    private static final class TargetChoice
    extends Enum<TargetChoice> {
        private static final /* synthetic */ TargetChoice[] $VALUES;
        public static final /* enum */ TargetChoice Stdout;
        public static final /* enum */ TargetChoice Stderr;

        public static TargetChoice[] values() {
            return (TargetChoice[])$VALUES.clone();
        }

        public static TargetChoice valueOf(String name) {
            return Enum.valueOf(TargetChoice.class, name);
        }

        private static /* synthetic */ TargetChoice[] $values() {
            TargetChoice[] targetChoiceArray = new TargetChoice[2];
            targetChoiceArray[0] = Stderr;
            targetChoiceArray[1] = Stdout;
            return targetChoiceArray;
        }

        static {
            Stderr = new TargetChoice();
            Stdout = new TargetChoice();
            $VALUES = TargetChoice.$values();
        }
    }
}

