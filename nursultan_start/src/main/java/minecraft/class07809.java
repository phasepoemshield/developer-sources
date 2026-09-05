/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.mojang.serialization.Codec
 *  minecraft.class00500
 *  minecraft.class00780
 *  minecraft.class03322
 *  minecraft.class03460
 *  minecraft.class03556
 *  minecraft.class04389
 *  minecraft.class04684
 *  minecraft.class06034
 *  minecraft.class06069
 *  minecraft.class06080
 *  minecraft.class07209
 *  minecraft.class07218
 *  minecraft.class08050
 *  org.apache.commons.lang3.mutable.MutableBoolean
 */
package minecraft;

import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import minecraft.class00500;
import minecraft.class00780;
import minecraft.class03322;
import minecraft.class03460;
import minecraft.class03556;
import minecraft.class04389;
import minecraft.class04684;
import minecraft.class06034;
import minecraft.class06069;
import minecraft.class06080;
import minecraft.class07209;
import minecraft.class07218;
import minecraft.class07811;
import minecraft.class08050;
import org.apache.commons.lang3.mutable.MutableBoolean;

public class class07809
extends class07811 {
    public class07809(Codec<class04389> codec) {
        super(codec);
        this.B = ImmutableSet.of((Object)class04684.i, (Object)class04684.L);
    }

    @Override
    protected double y() {
        return 5.0;
    }

    protected boolean N(class06080 class060802, class04389 class043892, class08050 class080502, Function<class07209, class03556<class00780>> function, class03322 class033222, class07218 class072182, class07218 class072183, class03460 class034602, MutableBoolean mutableBoolean) {
        if (this.N((class06034)class043892, class080502.method_8320((class07209)class072182))) {
            class00500 class005002 = class072182.method_10264() <= class060802.i() + 31 ? M.B() : i;
            class080502.N((class07209)class072182, class005002);
            return true;
        }
        return false;
    }

    @Override
    protected int N() {
        return 10;
    }

    @Override
    protected float N(class06069 class060692) {
        return (class060692.z() * 2.0f + class060692.z()) * 2.0f;
    }
}

