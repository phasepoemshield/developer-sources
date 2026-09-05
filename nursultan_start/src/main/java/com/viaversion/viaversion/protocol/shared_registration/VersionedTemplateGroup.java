/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 */
package com.viaversion.viaversion.protocol.shared_registration;

import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import com.viaversion.viaversion.protocol.shared_registration.SharedRegistrations;

record VersionedTemplateGroup(SharedRegistrations.RegistrationAction<?, ?> action, ProtocolVersion min, ProtocolVersion max) {
    public boolean contains(ProtocolVersion version) {
        return version.newerThanOrEqualTo(this.min) && (this.max == null || version.olderThan(this.max));
    }
}

