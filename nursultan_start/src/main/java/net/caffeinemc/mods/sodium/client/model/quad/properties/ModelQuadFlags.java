/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  minecraft.class07185
 *  minecraft.class07211
 */
package net.caffeinemc.mods.sodium.client.model.quad.properties;

import minecraft.class07185;
import minecraft.class07211;
import net.caffeinemc.mods.sodium.client.model.quad.ModelQuadView;

public class ModelQuadFlags {
    public static final int IS_PARTIAL = 1;
    public static final int IS_PARALLEL = 2;
    public static final int IS_ALIGNED = 4;
    public static final int FLAG_BIT_COUNT = 3;

    public static boolean contains(int n, int n2) {
        return (n & n2) != 0;
    }

    public static int getQuadFlags(ModelQuadView modelQuadView, class07211 class072112) {
        boolean bl;
        boolean bl2;
        int n;
        block32: {
            block31: {
                float f = 32.0f;
                float f2 = 32.0f;
                float f3 = 32.0f;
                float f4 = -32.0f;
                float f5 = -32.0f;
                float f6 = -32.0f;
                for (n = 0; n < 4; ++n) {
                    float f7 = modelQuadView.getX(n);
                    float f8 = modelQuadView.getY(n);
                    float f9 = modelQuadView.getZ(n);
                    f = Math.min(f, f7);
                    f2 = Math.min(f2, f8);
                    f3 = Math.min(f3, f9);
                    f4 = Math.max(f4, f7);
                    f5 = Math.max(f5, f8);
                    f6 = Math.max(f6, f9);
                }
                n = switch (class072112.z()) {
                    default -> throw new MatchException(null, null);
                    case class07185.field_11048 -> {
                        if (f2 >= 1.0E-4f || f3 >= 1.0E-4f || f5 <= 0.9999f || f6 <= 0.9999f) {
                            yield 1;
                        }
                        yield 0;
                    }
                    case class07185.field_11052 -> {
                        if (f >= 1.0E-4f || f3 >= 1.0E-4f || f4 <= 0.9999f || f6 <= 0.9999f) {
                            yield 1;
                        }
                        yield 0;
                    }
                    case class07185.field_11051 -> f >= 1.0E-4f || f2 >= 1.0E-4f || f4 <= 0.9999f || f5 <= 0.9999f ? 1 : 0;
                };
                switch (class072112.z()) {
                    default: {
                        throw new MatchException(null, null);
                    }
                    case field_11048: {
                        boolean bl3;
                        if (f == f4) {
                            bl3 = true;
                            break;
                        }
                        bl3 = false;
                        break;
                    }
                    case field_11052: {
                        boolean bl3;
                        if (f2 == f5) {
                            bl3 = true;
                            break;
                        }
                        bl3 = false;
                        break;
                    }
                    case field_11051: {
                        boolean bl3 = bl2 = f3 == f6;
                    }
                }
                if (!bl2) break block31;
                switch (class072112) {
                    default: {
                        throw new MatchException(null, null);
                    }
                    case field_11033: {
                        if (f2 < 1.0E-4f) {
                            break;
                        }
                        break block31;
                    }
                    case field_11036: {
                        if (f5 > 0.9999f) {
                            break;
                        }
                        break block31;
                    }
                    case field_11043: {
                        if (f3 < 1.0E-4f) {
                            break;
                        }
                        break block31;
                    }
                    case field_11035: {
                        if (f6 > 0.9999f) {
                            break;
                        }
                        break block31;
                    }
                    case field_11039: {
                        if (f < 1.0E-4f) {
                            break;
                        }
                        break block31;
                    }
                    case field_11034: {
                        if (!(f4 > 0.9999f)) break block31;
                    }
                }
                bl = true;
                break block32;
            }
            bl = false;
        }
        boolean bl4 = bl;
        int n2 = 0;
        if (n != 0) {
            n2 |= 1;
        }
        if (bl2) {
            n2 |= 2;
        }
        if (bl4) {
            n2 |= 4;
        }
        return n2;
    }
}

