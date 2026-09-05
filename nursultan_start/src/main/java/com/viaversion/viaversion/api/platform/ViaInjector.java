/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.libs.fastutil.objects.ObjectLinkedOpenHashSet
 *  com.viaversion.viaversion.libs.gson.JsonObject
 */
package com.viaversion.viaversion.api.platform;

import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import com.viaversion.viaversion.libs.fastutil.objects.ObjectLinkedOpenHashSet;
import com.viaversion.viaversion.libs.gson.JsonObject;
import java.util.SortedSet;

public interface ViaInjector {
    default public String getDecoderName() {
        return "via-decoder";
    }

    default public String getEncoderName() {
        return "via-encoder";
    }

    public JsonObject getDump();

    public void uninject() throws Exception;

    public void inject() throws Exception;

    default public SortedSet<ProtocolVersion> getServerProtocolVersions() throws Exception {
        ObjectLinkedOpenHashSet versions = new ObjectLinkedOpenHashSet();
        versions.add(this.getServerProtocolVersion());
        return versions;
    }

    default public boolean lateProtocolVersionSetting() {
        return false;
    }

    public ProtocolVersion getServerProtocolVersion() throws Exception;
}

