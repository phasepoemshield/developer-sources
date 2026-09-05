/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.platform.ViaInjector
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  com.viaversion.viaversion.libs.fastutil.objects.ObjectLinkedOpenHashSet
 *  com.viaversion.viaversion.libs.gson.JsonObject
 */
package com.viaversion.viaversion.platform;

import com.viaversion.viaversion.api.platform.ViaInjector;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import com.viaversion.viaversion.libs.fastutil.objects.ObjectLinkedOpenHashSet;
import com.viaversion.viaversion.libs.gson.JsonObject;
import java.util.SortedSet;

public class NoopInjector
implements ViaInjector {
    public JsonObject getDump() {
        return new JsonObject();
    }

    public void uninject() {
    }

    public void inject() {
    }

    public SortedSet<ProtocolVersion> getServerProtocolVersions() {
        ObjectLinkedOpenHashSet versions = new ObjectLinkedOpenHashSet();
        versions.addAll(ProtocolVersion.getProtocols());
        return versions;
    }

    public ProtocolVersion getServerProtocolVersion() throws Exception {
        return this.getServerProtocolVersions().first();
    }
}

