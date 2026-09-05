/*
 * Decompiled with CFR 0.152.
 */
package com.terraformersmc.modmenu.util;

import java.util.Collection;

public class UpdateCheckerUtil$CurrentVersionsFromHashes {
    public Collection<String> hashes;
    public String algorithm = "sha512";

    public UpdateCheckerUtil$CurrentVersionsFromHashes(Collection<String> collection) {
        this.hashes = collection;
    }
}

