/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.MapMaker
 *  minecraft.class00500
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class05836
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07299
 *  minecraft.class08092
 *  net.fabricmc.fabric.api.transfer.v1.item.ItemVariant
 *  net.fabricmc.fabric.api.transfer.v1.storage.Storage
 *  net.fabricmc.fabric.api.transfer.v1.transaction.base.SnapshotParticipant
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.impl.transfer.item;

import com.google.common.collect.MapMaker;
import java.util.Map;
import minecraft.class00500;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class05836;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07299;
import minecraft.class08092;
import net.fabricmc.fabric.api.transfer.v1.item.ItemVariant;
import net.fabricmc.fabric.api.transfer.v1.storage.Storage;
import net.fabricmc.fabric.api.transfer.v1.transaction.base.SnapshotParticipant;
import net.fabricmc.fabric.impl.transfer.item.ComposterWrapper$BottomStorage;
import net.fabricmc.fabric.impl.transfer.item.ComposterWrapper$TopStorage;
import net.fabricmc.fabric.impl.transfer.item.ComposterWrapper$WorldLocation;
import org.jspecify.annotations.Nullable;

public class ComposterWrapper
extends SnapshotParticipant<Float> {
    private static final Map<ComposterWrapper$WorldLocation, ComposterWrapper> COMPOSTERS = new MapMaker().concurrencyLevel(1).weakValues().makeMap();
    private static final float DO_NOTHING = 0.0f;
    private static final float EXTRACT_BONEMEAL = -1.0f;
    final ComposterWrapper$WorldLocation location;
    Float increaseProbability = Float.valueOf(0.0f);
    private final ComposterWrapper$TopStorage upStorage = new ComposterWrapper$TopStorage(this);
    private final ComposterWrapper$BottomStorage downStorage = new ComposterWrapper$BottomStorage(this);

    private ComposterWrapper(ComposterWrapper$WorldLocation composterWrapper$WorldLocation) {
        this.location = composterWrapper$WorldLocation;
    }

    public static @Nullable Storage<ItemVariant> get(class07299 class072992, class07209 class072092, @Nullable class07211 class072112) {
        if (class072112 != null && class072112.z().y()) {
            ComposterWrapper$WorldLocation composterWrapper$WorldLocation = new ComposterWrapper$WorldLocation(class072992, class072092.method_10062());
            ComposterWrapper composterWrapper = COMPOSTERS.computeIfAbsent(composterWrapper$WorldLocation, ComposterWrapper::new);
            return class072112 == class07211.field_11036 ? composterWrapper.upStorage : composterWrapper.downStorage;
        }
        return null;
    }

    public void onFinalCommit() {
        if (this.increaseProbability.floatValue() == -1.0f) {
            this.location.setBlockState((class00500)this.location.getBlockState().y((class08092)class05836.i, (Comparable)Integer.valueOf(0)));
            this.location.world.method_8396(null, this.location.pos, class04909.Rf, class04911.field_15245, 1.0f, 1.0f);
        } else if (this.increaseProbability.floatValue() > 0.0f) {
            boolean bl;
            class00500 class005002 = this.location.getBlockState();
            boolean bl2 = bl = (Integer)class005002.L((class08092)class05836.i) == 0 || this.location.world.method_8409().U() < (double)this.increaseProbability.floatValue();
            if (bl) {
                int n = (Integer)class005002.L((class08092)class05836.i) + 1;
                class00500 class005003 = (class00500)class005002.y((class08092)class05836.i, (Comparable)Integer.valueOf(n));
                this.location.setBlockState(class005003);
                if (n == 7) {
                    this.location.world.N(this.location.pos, class005002.i(), 20);
                }
            }
            this.location.world.N(1500, this.location.pos, bl ? 1 : 0);
        }
        this.increaseProbability = Float.valueOf(0.0f);
    }

    protected void readSnapshot(Float f) {
        this.increaseProbability = f;
    }

    protected Float createSnapshot() {
        return this.increaseProbability;
    }
}

