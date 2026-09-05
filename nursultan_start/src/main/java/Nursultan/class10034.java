/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09900
 *  Nursultan.class09921
 *  Nursultan.class09933
 *  Nursultan.class09938
 *  java.lang.MatchException
 */
package Nursultan;

import Nursultan.class09900;
import Nursultan.class09921;
import Nursultan.class09933;
import Nursultan.class09938;
import Nursultan.class10042;
import Nursultan.class10049;
import Nursultan.class10059;
import Nursultan.class10065;

sealed interface class10034
permits class10059, class09933, class09900, class09921, class10042 {
    default public String L() {
        return "";
    }

    default public void L(String string) {
        throw this.u("textureSrc");
    }

    private IllegalStateException u(String string) {
        return new IllegalStateException("Element payload " + this.getClass().getSimpleName() + " does not support property '" + string + "'");
    }

    default public String u() {
        return "";
    }

    default public void y(String string) {
        throw this.u("placeholder");
    }

    default public String y() {
        return "";
    }

    default public void N(class09938 class099382) {
        throw this.u("canvasRenderer");
    }

    public static class10034 N(class10049 class100492) {
        if (class100492 == null) {
            return class10059.N;
        }
        return switch (class10065.N[class100492.ordinal()]) {
            default -> throw new MatchException(null, null);
            case 1 -> new class10042();
            case 2 -> new class09933();
            case 3 -> new class09900();
            case 4 -> new class09921();
            case 5 -> class10059.N;
        };
    }

    default public void N(String string) {
        throw this.u("text");
    }

    default public class09938 N() {
        return null;
    }
}

