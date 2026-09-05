/*
 * Decompiled with CFR 0.152.
 */
package baritone.process.elytra;

import java.util.Objects;

final class ElytraBehavior$FireworkBoost {
    private final Integer fireworkTicksExisted;
    private final int minimumBoostTicks;
    private final int maximumBoostTicks;

    public ElytraBehavior$FireworkBoost(Integer n, int n2) {
        this.fireworkTicksExisted = n;
        this.minimumBoostTicks = n2;
        this.maximumBoostTicks = n2 + 11;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || object.getClass() != ElytraBehavior$FireworkBoost.class) {
            return false;
        }
        ElytraBehavior$FireworkBoost elytraBehavior$FireworkBoost = (ElytraBehavior$FireworkBoost)object;
        if (!this.isBoosted() && !elytraBehavior$FireworkBoost.isBoosted()) {
            return true;
        }
        return Objects.equals(this.fireworkTicksExisted, elytraBehavior$FireworkBoost.fireworkTicksExisted) && this.minimumBoostTicks == elytraBehavior$FireworkBoost.minimumBoostTicks && this.maximumBoostTicks == elytraBehavior$FireworkBoost.maximumBoostTicks;
    }

    public boolean isBoosted() {
        return this.fireworkTicksExisted != null;
    }

    public int getGuaranteedBoostTicks() {
        return this.isBoosted() ? Math.max(0, this.minimumBoostTicks - this.fireworkTicksExisted) : 0;
    }

    public int getMaximumBoostTicks() {
        return this.isBoosted() ? Math.max(0, this.maximumBoostTicks - this.fireworkTicksExisted) : 0;
    }
}

