/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class03556
 *  minecraft.class03927
 *  minecraft.class05369
 *  minecraft.class06637
 *  minecraft.class07789
 *  minecraft.class08092
 */
package net.caffeinemc.mods.lithium.common.util;

import minecraft.class00500;
import minecraft.class00869;
import minecraft.class03556;
import minecraft.class03927;
import minecraft.class05369;
import minecraft.class06637;
import minecraft.class07789;
import minecraft.class08092;

public class POIRegistryEntries {
    public static final class03556<class05369> NETHER_PORTAL_ENTRY = (class03556)class03927.N((class00500)class00869.iq.W()).orElseThrow(() -> new IllegalStateException("Nether portal poi type not found"));
    public static final class03556<class05369> HOME_ENTRY = (class03556)class03927.N((class00500)((class00500)class00869.yn.W().y((class08092)class07789.y, (Comparable)class06637.field_12560))).orElseThrow(() -> new IllegalStateException("Home poi type not found"));
}

