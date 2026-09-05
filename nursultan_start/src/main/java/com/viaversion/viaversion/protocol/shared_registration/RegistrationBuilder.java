/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Preconditions
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  com.viaversion.viaversion.api.protocol.version.VersionType
 */
package com.viaversion.viaversion.protocol.shared_registration;

import com.google.common.base.Preconditions;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import com.viaversion.viaversion.api.protocol.version.VersionType;
import com.viaversion.viaversion.protocol.shared_registration.RegistrationContext;
import com.viaversion.viaversion.protocol.shared_registration.SharedRegistrations;
import com.viaversion.viaversion.protocol.shared_registration.VersionedTemplateGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public final class RegistrationBuilder {
    private final List<VersionedTemplateGroup> groups = new ArrayList<VersionedTemplateGroup>();
    private final SharedRegistrations registrations;
    private VersionType versionType;

    RegistrationBuilder(SharedRegistrations registrations) {
        this.registrations = registrations;
    }

    public RegistrationBuilder since(ProtocolVersion min, SharedRegistrations.RegistrationAction<?, ?> action) {
        this.checkVersionType(min);
        this.groups.add(new VersionedTemplateGroup(action, min, null));
        return this;
    }

    public void register() {
        this.registrations.register(this.versionType, this.groups);
    }

    public RegistrationBuilder range(ProtocolVersion min, ProtocolVersion max, SharedRegistrations.RegistrationAction<?, ?> action) {
        this.checkVersionType(min);
        this.checkVersionType(max);
        this.groups.add(new VersionedTemplateGroup(action, min, max));
        return this;
    }

    private void checkVersionType(ProtocolVersion version) {
        if (this.versionType == null) {
            this.versionType = version.getVersionType();
        } else if (this.versionType != version.getVersionType()) {
            throw new IllegalArgumentException("Cannot mix different version types in the same registration builder");
        }
    }

    public <CU extends ClientboundPacketType, SU extends ServerboundPacketType, R> RegistrationBuilder ranges(Function<RegistrationContext<CU, SU>, R> adapter, ProtocolVersion min, Consumer<TypedRangesBuilder<CU, SU, R>> consumer) {
        consumer.accept(new TypedRangesBuilder<CU, SU, R>(adapter, min));
        return this;
    }

    public <CU extends ClientboundPacketType, SU extends ServerboundPacketType> RegistrationBuilder ranges(ProtocolVersion min, Consumer<RangesBuilder<CU, SU>> consumer) {
        consumer.accept(new RangesBuilder(min));
        return this;
    }

    public class RangesBuilder<CU extends ClientboundPacketType, SU extends ServerboundPacketType> {
        private ProtocolVersion currentMin;
        private boolean completed;

        private RangesBuilder(ProtocolVersion min) {
            this.currentMin = min;
        }

        public RegistrationBuilder since(SharedRegistrations.RegistrationAction<CU, SU> action) {
            Preconditions.checkState((!this.completed ? 1 : 0) != 0, (Object)"Range chain already completed");
            this.completed = true;
            return RegistrationBuilder.this.since(this.currentMin, action);
        }

        public RangesBuilder<CU, SU> to(ProtocolVersion max, SharedRegistrations.RegistrationAction<CU, SU> action) {
            Preconditions.checkState((!this.completed ? 1 : 0) != 0, (Object)"Range chain already completed");
            RegistrationBuilder.this.range(this.currentMin, max, action);
            this.currentMin = max;
            return this;
        }
    }

    public final class TypedRangesBuilder<CU extends ClientboundPacketType, SU extends ServerboundPacketType, R>
    extends RangesBuilder<CU, SU> {
        private final Function<RegistrationContext<CU, SU>, R> adapter;

        private TypedRangesBuilder(Function<RegistrationContext<CU, SU>, R> adapter, ProtocolVersion min) {
            super(min);
            this.adapter = adapter;
        }

        public TypedRangesBuilder<CU, SU, R> since(TypedRegistrationAction<CU, SU, R> action) {
            this.since(this.wrapAction(action));
            return this;
        }

        public TypedRangesBuilder<CU, SU, R> to(ProtocolVersion max, TypedRegistrationAction<CU, SU, R> action) {
            this.to(max, this.wrapAction(action));
            return this;
        }

        private SharedRegistrations.RegistrationAction<CU, SU> wrapAction(TypedRegistrationAction<CU, SU, R> action) {
            return ctx -> {
                R rewriter = this.adapter.apply(ctx);
                if (rewriter != null) {
                    action.accept(ctx, rewriter);
                }
            };
        }
    }

    @FunctionalInterface
    public static interface TypedRegistrationAction<CU extends ClientboundPacketType, SU extends ServerboundPacketType, R> {
        public void accept(RegistrationContext<CU, SU> var1, R var2);
    }
}

