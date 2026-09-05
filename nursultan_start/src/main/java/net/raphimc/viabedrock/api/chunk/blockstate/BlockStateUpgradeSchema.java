/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.IntTag
 */
package net.raphimc.viabedrock.api.chunk.blockstate;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.IntTag;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public abstract class BlockStateUpgradeSchema {
    private final int version;
    protected final List<Consumer<CompoundTag>> actions = new ArrayList<Consumer<CompoundTag>>();

    public BlockStateUpgradeSchema(int version) {
        this.version = version;
    }

    public BlockStateUpgradeSchema(int majorVersion, int minorVersion, int patchVersion, int revisionVersion) {
        this.version = majorVersion << 24 | minorVersion << 16 | patchVersion << 8 | revisionVersion;
    }

    public int version() {
        return this.version;
    }

    public void upgrade(CompoundTag tag) {
        IntTag version = tag.getIntTag("version");
        if (version != null && (version.asInt() > this.version || version.asInt() < 0)) {
            return;
        }
        try {
            for (Consumer<CompoundTag> action : this.actions) {
                action.accept(tag);
            }
        }
        catch (StopUpgrade stopUpgrade) {
            // empty catch block
        }
        tag.putInt("version", this.version);
    }

    protected static final class StopUpgrade
    extends RuntimeException {
        public static final StopUpgrade INSTANCE = new StopUpgrade();

        StopUpgrade() {
        }

        @Override
        public String toString() {
            return "";
        }

        @Override
        public Throwable fillInStackTrace() {
            return this;
        }
    }
}

