/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 */
package com.terraformersmc.modmenu.util;

import com.google.gson.annotations.SerializedName;
import com.terraformersmc.modmenu.api.UpdateChannel;
import java.util.Collection;
import java.util.Set;

public class UpdateCheckerUtil$LatestVersionsFromHashesBody {
    public Collection<String> hashes;
    public String algorithm = "sha512";
    public Collection<String> loaders;
    @SerializedName(value="game_versions")
    public Collection<String> gameVersions;
    @SerializedName(value="version_types")
    public Collection<String> versionTypes;

    public UpdateCheckerUtil$LatestVersionsFromHashesBody(Collection<String> collection, Collection<String> collection2, String string, Collection<UpdateChannel> collection3) {
        this.hashes = collection;
        this.loaders = collection2;
        this.gameVersions = Set.of(string);
        this.versionTypes = collection3.stream().map(updateChannel -> updateChannel.toString().toLowerCase()).toList();
    }
}

