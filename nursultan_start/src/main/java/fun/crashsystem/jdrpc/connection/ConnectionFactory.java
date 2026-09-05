/*
 * Decompiled with CFR 0.152.
 */
package fun.crashsystem.jdrpc.connection;

import fun.crashsystem.jdrpc.connection.Connection;
import java.io.IOException;

@FunctionalInterface
public interface ConnectionFactory {
    public Connection create(String var1) throws IOException;
}

