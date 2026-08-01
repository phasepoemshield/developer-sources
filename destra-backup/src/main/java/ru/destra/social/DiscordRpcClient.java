package ru.destra.social;

import java.io.Closeable;
import java.io.IOException;

public class DiscordRpcClient implements Closeable {
    public static final String PIPE_PATH_PREFIX = "\\\\.\\pipe\\discord-ipc-";
    public static final String LOG_PREFIX = "DiscordRPC: ";
    public static final String LOG_DISABLED_PREFIX = "DiscordRPC disabled: ";

    public static boolean isDiscordRunning() {
        return false;
    }

    public static void init() {
    }

    public static void connect() {
    }

    public static void disconnect() {
    }

    @Override
    public void close() throws IOException {
    }
}
