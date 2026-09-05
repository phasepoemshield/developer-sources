/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.protocol.AbstractProtocol
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  com.viaversion.viaversion.api.protocol.version.VersionType
 */
package com.viaversion.viaversion.protocol.shared_registration;

import com.viaversion.viaversion.api.protocol.AbstractProtocol;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import com.viaversion.viaversion.api.protocol.version.VersionType;
import com.viaversion.viaversion.protocol.shared_registration.RegistrationBuilder;
import com.viaversion.viaversion.protocol.shared_registration.RegistrationContext;
import com.viaversion.viaversion.protocol.shared_registration.VersionedTemplateGroup;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.List;

public final class SharedRegistrations {
    private static final SharedRegistrations DEFAULT_REGISTRATIONS = new SharedRegistrations();
    private final EnumMap<VersionType, List<VersionedTemplateGroup>> versionedTemplates = new EnumMap(VersionType.class);

    public static SharedRegistrations defaultRegistrations() {
        return DEFAULT_REGISTRATIONS;
    }

    public static SharedRegistrations create() {
        return new SharedRegistrations();
    }

    public RegistrationBuilder registrations() {
        return new RegistrationBuilder(this);
    }

    public void applyMatching(AbstractProtocol<?, ?, ?, ?> protocol) {
        if (protocol.isBaseProtocol()) {
            return;
        }
        ProtocolVersion version = protocol.getServerVersion();
        if (version.getVersionType() != protocol.getClientVersion().getVersionType()) {
            return;
        }
        List<VersionedTemplateGroup> groups = this.versionedTemplates.get(version.getVersionType());
        if (groups == null) {
            return;
        }
        for (VersionedTemplateGroup group : groups) {
            if (group.min().newerThan(version)) break;
            if (group.max() != null && version.newerThanOrEqualTo(group.max())) continue;
            RegistrationContext context = new RegistrationContext(protocol, group.min(), group.max());
            group.action().accept(context);
        }
    }

    void register(VersionType versionType, List<VersionedTemplateGroup> toAdd) {
        List groups = this.versionedTemplates.computeIfAbsent(versionType, $ -> new ArrayList());
        groups.addAll(toAdd);
        groups.sort(Comparator.comparing(VersionedTemplateGroup::min, Comparator.nullsFirst(Comparator.naturalOrder())));
    }

    @FunctionalInterface
    public static interface RegistrationAction<CU extends ClientboundPacketType, SU extends ServerboundPacketType> {
        public void accept(RegistrationContext<CU, SU> var1);
    }
}

