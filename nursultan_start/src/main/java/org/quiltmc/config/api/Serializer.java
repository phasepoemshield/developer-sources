/*
 * Decompiled with CFR 0.152.
 */
package org.quiltmc.config.api;

import java.io.InputStream;
import java.io.OutputStream;
import org.quiltmc.config.api.Config;

public interface Serializer {
    public void deserialize(Config var1, InputStream var2);

    public String getFileExtension();

    public void serialize(Config var1, OutputStream var2);
}

