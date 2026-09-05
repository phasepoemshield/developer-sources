/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package com.terraformersmc.modmenu.util;

import com.terraformersmc.modmenu.api.UpdateChannel;
import com.terraformersmc.modmenu.api.UpdateInfo;
import com.terraformersmc.modmenu.util.mod.ModrinthUpdateInfo;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.time.Instant;

final class UpdateCheckerUtil$VersionUpdate
extends Record {
    private final String projectId;
    private final String versionId;
    final String versionNumber;
    final Instant releaseDate;
    private final UpdateChannel updateChannel;
    final String hash;

    UpdateCheckerUtil$VersionUpdate(String string, String string2, String string3, Instant instant, UpdateChannel updateChannel, String string4) {
        this.projectId = string;
        this.versionId = string2;
        this.versionNumber = string3;
        this.releaseDate = instant;
        this.updateChannel = updateChannel;
        this.hash = string4;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{UpdateCheckerUtil$VersionUpdate.class, "projectId;versionId;versionNumber;releaseDate;updateChannel;hash", "projectId", "versionId", "versionNumber", "releaseDate", "updateChannel", "hash"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{UpdateCheckerUtil$VersionUpdate.class, "projectId;versionId;versionNumber;releaseDate;updateChannel;hash", "projectId", "versionId", "versionNumber", "releaseDate", "updateChannel", "hash"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{UpdateCheckerUtil$VersionUpdate.class, "projectId;versionId;versionNumber;releaseDate;updateChannel;hash", "projectId", "versionId", "versionNumber", "releaseDate", "updateChannel", "hash"}, this);
    }

    public String hash() {
        return this.hash;
    }

    public String versionId() {
        return this.versionId;
    }

    public UpdateChannel updateChannel() {
        return this.updateChannel;
    }

    UpdateInfo asUpdateInfo() {
        return new ModrinthUpdateInfo(this.projectId, this.versionId, this.versionNumber, this.updateChannel);
    }

    public String versionNumber() {
        return this.versionNumber;
    }

    public String projectId() {
        return this.projectId;
    }

    public Instant releaseDate() {
        return this.releaseDate;
    }
}

