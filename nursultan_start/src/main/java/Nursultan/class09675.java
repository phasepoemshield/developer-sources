/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

import Nursultan.class09664;
import Nursultan.class09684;
import Nursultan.class09688;

class class09675 {
    static final /* synthetic */ int[] N;
    static final /* synthetic */ int[] y;
    static final /* synthetic */ int[] L;

    static {
        L = new int[class09684.values().length];
        try {
            class09675.L[class09684.FIRST_TO_LAST.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            class09675.L[class09684.LAST_TO_FIRST.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        y = new int[class09664.values().length];
        try {
            class09675.y[class09664.NORMAL.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            class09675.y[class09664.INVERTED.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            class09675.y[class09664.INVENTORY_POSITION_AWARE.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            class09675.y[class09664.INVENTORY_POSITION_AWARE_INVERTED.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        N = new int[class09688.values().length];
        try {
            class09675.N[class09688.PROPORTIONAL.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            class09675.N[class09688.ALWAYS_ONE.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

