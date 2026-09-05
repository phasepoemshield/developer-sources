/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00381
 *  minecraft.class00667
 *  minecraft.class02362
 *  minecraft.class02897
 *  minecraft.class04167
 *  minecraft.class04227
 *  minecraft.class04247
 *  minecraft.class04248
 *  minecraft.class05946
 *  minecraft.class07280
 *  minecraft.class07299
 */
package minecraft;

import com.google.common.collect.Sets;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Set;
import minecraft.class00381;
import minecraft.class00667;
import minecraft.class02362;
import minecraft.class02897;
import minecraft.class04167;
import minecraft.class04227;
import minecraft.class04247;
import minecraft.class04248;
import minecraft.class05946;
import minecraft.class07280;
import minecraft.class07299;

public final class class00482
extends Record
implements class00381<class07280> {
    private final int playerId;
    private final boolean hardcore;
    private final Set<class05946<class07299>> levels;
    private final int maxPlayers;
    private final int chunkRadius;
    private final int simulationDistance;
    private final boolean reducedDebugInfo;
    private final boolean showDeathScreen;
    private final boolean doLimitedCrafting;
    private final class04167 commonPlayerSpawnInfo;
    private final boolean enforcesSecureChat;
    public static final class02362<class04247, class00482> N = class00381.N(class00482::N, class00482::new);

    public Set<class05946<class07299>> L() {
        return this.levels;
    }

    public int M() {
        return this.chunkRadius;
    }

    public class00482(int n, boolean bl, Set<class05946<class07299>> set, int n2, int n3, int n4, boolean bl2, boolean bl3, boolean bl4, class04167 class041672, boolean bl5) {
        this.playerId = n;
        this.hardcore = bl;
        this.levels = set;
        this.maxPlayers = n2;
        this.chunkRadius = n3;
        this.simulationDistance = n4;
        this.reducedDebugInfo = bl2;
        this.showDeathScreen = bl3;
        this.doLimitedCrafting = bl4;
        this.commonPlayerSpawnInfo = class041672;
        this.enforcesSecureChat = bl5;
    }

    private class00482(class04247 class042472) {
        this(class042472.readInt(), class042472.readBoolean(), (Set)class042472.N_15(Sets::newHashSetWithExpectedSize, class006672 -> class006672.N(class04227.yg)), class042472.E(), class042472.E(), class042472.E(), class042472.readBoolean(), class042472.readBoolean(), class042472.readBoolean(), new class04167(class042472), class042472.readBoolean());
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00482.class, "playerId;hardcore;levels;maxPlayers;chunkRadius;simulationDistance;reducedDebugInfo;showDeathScreen;doLimitedCrafting;commonPlayerSpawnInfo;enforcesSecureChat", "playerId", "hardcore", "levels", "maxPlayers", "chunkRadius", "simulationDistance", "reducedDebugInfo", "showDeathScreen", "doLimitedCrafting", "commonPlayerSpawnInfo", "enforcesSecureChat"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00482.class, "playerId;hardcore;levels;maxPlayers;chunkRadius;simulationDistance;reducedDebugInfo;showDeathScreen;doLimitedCrafting;commonPlayerSpawnInfo;enforcesSecureChat", "playerId", "hardcore", "levels", "maxPlayers", "chunkRadius", "simulationDistance", "reducedDebugInfo", "showDeathScreen", "doLimitedCrafting", "commonPlayerSpawnInfo", "enforcesSecureChat"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00482.class, "playerId;hardcore;levels;maxPlayers;chunkRadius;simulationDistance;reducedDebugInfo;showDeathScreen;doLimitedCrafting;commonPlayerSpawnInfo;enforcesSecureChat", "playerId", "hardcore", "levels", "maxPlayers", "chunkRadius", "simulationDistance", "reducedDebugInfo", "showDeathScreen", "doLimitedCrafting", "commonPlayerSpawnInfo", "enforcesSecureChat"}, this);
    }

    public int B() {
        return this.simulationDistance;
    }

    public boolean Z() {
        return this.reducedDebugInfo;
    }

    public boolean U() {
        return this.doLimitedCrafting;
    }

    public boolean z() {
        return this.showDeathScreen;
    }

    public int u() {
        return this.maxPlayers;
    }

    public boolean y() {
        return this.hardcore;
    }

    public class04167 E() {
        return this.commonPlayerSpawnInfo;
    }

    private void N(class04247 class042472) {
        class042472.writeInt(this.playerId);
        class042472.writeBoolean(this.hardcore);
        class042472.N_12(this.levels, class00667::y);
        class042472.L(this.maxPlayers);
        class042472.L(this.chunkRadius);
        class042472.L(this.simulationDistance);
        class042472.writeBoolean(this.reducedDebugInfo);
        class042472.writeBoolean(this.showDeathScreen);
        class042472.writeBoolean(this.doLimitedCrafting);
        this.commonPlayerSpawnInfo.N(class042472);
        class042472.writeBoolean(this.enforcesSecureChat);
    }

    public void method_65081(class07280 class072802) {
        class072802.N(this);
    }

    public int N() {
        return this.playerId;
    }

    public boolean W() {
        return this.enforcesSecureChat;
    }

    public class02897<class00482> method_65080() {
        return class04248.f;
    }
}

