package ru.sterford;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public final class DebugLog {

    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("HH:mm:ss.SSS");

    private DebugLog() {
    }

    public static void info(String stage, String message) {
        //System.out.println("[AUTH][" + FORMATTER.format(LocalDateTime.now()) + "][" + stage + "] " + message);
    }

    public static void error(String stage, String message, Throwable throwable) {
        //System.out.println("[AUTH][" + FORMATTER.format(LocalDateTime.now()) + "][" + stage + "] ERROR: " + message);
        if (throwable != null) {
            //throwable.printStackTrace(System.out);
        }
    }
}
