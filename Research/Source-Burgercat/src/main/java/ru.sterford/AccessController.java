package ru.sterford;

import fun.nexisdlc.ClientContainer;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

public final class AccessController {

    private static final AtomicReference<AuthContext> AUTH_CONTEXT = new AtomicReference<>();
    private static volatile boolean started;

    private AccessController() {
    }

    public static WriteToken issueWriteToken(Class<?> owner) {
        String className = owner == null ? "" : owner.getName();
        if (!isAllowedOwner(className)) {
            throw new SecurityException("[$] invalid access owner");
        }
        return new WriteToken(className);
    }

    public static void install(WriteToken token, AuthContext context) {
        requireToken(token);
        AUTH_CONTEXT.set(Objects.requireNonNull(context, "context"));
        ClientContainer.setUid(context.getUid());
        ClientContainer.setUser(context.getUser());
        ClientContainer.setRole(context.getRole());
        ClientContainer.setHwid(context.getHwid());
        ClientContainer.setSubscription(context.getSubscription());
        ClientContainer.setPremium(context.getPremium());
    }

    public static void markStarted(WriteToken token, boolean value) {
        requireToken(token);
        started = value;
        ClientContainer.setStarted(value);
    }

    public static boolean isStarted() {
        return started;
    }

    public static boolean hasValidContext() {
        AuthContext context = AUTH_CONTEXT.get();
        return context != null
                && context.hasIdentity()
                && !context.isExpired(System.currentTimeMillis());
    }

    private static void requireToken(WriteToken token) {
        if (token == null || token.owner == null || !isAllowedOwner(token.owner)) {
            throw new SecurityException("[$] invalid write token");
        }
    }

    private static boolean isAllowedOwner(String owner) {
        return Initializator.class.getName().equals(owner);
    }

    public static final class WriteToken {
        private final String owner;

        private WriteToken(String owner) {
            this.owner = owner;
        }
    }
}
