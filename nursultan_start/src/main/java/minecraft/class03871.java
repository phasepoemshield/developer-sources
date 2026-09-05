/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  java.lang.MatchException
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.logging.LogUtils;
import minecraft.class03877;
import minecraft.class03879;
import minecraft.class03892;
import minecraft.class03901;
import minecraft.class03907;
import minecraft.class03913;
import minecraft.class03979;
import org.slf4j.Logger;

interface class03871
extends class03877 {
    public static final Logger N = LogUtils.getLogger();

    @Override
    default public class03979<? extends class03877> L() {
        return this.u().field_37111;
    }

    public class03877 i();

    public class03892 u();

    public static class03871 N(class03892 class038922, class03877 class038772, class03877 class038773) {
        double d;
        double d2 = class038772.N();
        double d3 = class038773.N();
        double d4 = class038772.y();
        double d5 = class038773.y();
        if (class038922 == class03892.field_36546 || class038922 == class03892.field_36547) {
            boolean bl;
            boolean bl2 = d2 >= d5;
            boolean bl3 = bl = d3 >= d4;
            if (bl2 || bl) {
                N.warn("Creating a {} function between two non-overlapping inputs: {} and {}", new Object[]{class038922, class038772, class038773});
            }
        }
        double d6 = switch (class038922.ordinal()) {
            default -> throw new MatchException(null, null);
            case 0 -> d2 + d3;
            case 3 -> Math.max(d2, d3);
            case 2 -> Math.min(d2, d3);
            case 1 -> d2 > 0.0 && d3 > 0.0 ? d2 * d3 : (d4 < 0.0 && d5 < 0.0 ? d4 * d5 : Math.min(d2 * d5, d4 * d3));
        };
        switch (class038922.ordinal()) {
            default: {
                throw new MatchException(null, null);
            }
            case 0: {
                double d7 = d4 + d5;
                break;
            }
            case 3: {
                double d7 = Math.max(d4, d5);
                break;
            }
            case 2: {
                double d7 = Math.min(d4, d5);
                break;
            }
            case 1: {
                double d7 = d2 > 0.0 && d3 > 0.0 ? d4 * d5 : (d = d4 < 0.0 && d5 < 0.0 ? d2 * d3 : Math.max(d2 * d3, d4 * d5));
            }
        }
        if (class038922 == class03892.field_36545 || class038922 == class03892.field_36544) {
            if (class038772 instanceof class03879) {
                class03879 class038792 = (class03879)class038772;
                return new class03901(class038922 == class03892.field_36544 ? class03907.field_36569 : class03907.field_36568, class038773, d6, d, class038792.u());
            }
            if (class038773 instanceof class03879) {
                class03879 class038793 = (class03879)class038773;
                return new class03901(class038922 == class03892.field_36544 ? class03907.field_36569 : class03907.field_36568, class038772, d6, d, class038793.u());
            }
        }
        return new class03913(class038922, class038772, class038773, d6, d);
    }

    public class03877 W();
}

