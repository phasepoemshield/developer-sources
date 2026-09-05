/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  minecraft.class01072
 *  minecraft.class01087
 *  minecraft.class04770
 *  minecraft.class05157
 *  minecraft.class06633
 *  minecraft.class06839
 *  minecraft.class08774
 */
package minecraft;

import com.google.common.collect.Lists;
import java.util.List;
import minecraft.class01072;
import minecraft.class01087;
import minecraft.class04770;
import minecraft.class05157;
import minecraft.class06633;
import minecraft.class06839;
import minecraft.class08774;

public class class06605
implements class06633 {
    private final List<class06633> N = Lists.newArrayList();

    public void L() {
        this.N.forEach(class06633::L);
    }

    public void L(class08774 class087742) {
        this.N.forEach(class066332 -> class066332.L(class087742));
    }

    public void i() {
        this.N.forEach(class06633::i);
    }

    public void u() {
        this.N.forEach(class06633::u);
    }

    public void y(class08774 class087742) {
        this.N.forEach(class066332 -> class066332.y(class087742));
    }

    public void y(class01087 class010872) {
        this.N.forEach(class066332 -> class066332.y(class010872));
    }

    public void y() {
        this.N.forEach(class06633::y);
    }

    public void y(class04770 class047702) {
        this.N.forEach(class066332 -> class066332.y(class047702));
    }

    public void N(class04770 class047702) {
        this.N.forEach(class066332 -> class066332.N(class047702));
    }

    public void N(class05157 class051572) {
        this.N.forEach(class066332 -> class066332.N(class051572));
    }

    public void N(class06633 class066332) {
        this.N.add(class066332);
    }

    public void N() {
        this.N.forEach(class06633::N);
    }

    public void N(String string) {
        this.N.forEach(class066332 -> class066332.N(string));
    }

    public void N(class01072 class010722) {
        this.N.forEach(class066332 -> class066332.N(class010722));
    }

    public void N(class01087 class010872) {
        this.N.forEach(class066332 -> class066332.N(class010872));
    }

    public void N(class08774 class087742) {
        this.N.forEach(class066332 -> class066332.N(class087742));
    }

    public <T> void N(class06839<T> class068392, T t) {
        this.N.forEach(class066332 -> class066332.N(class068392, t));
    }

    public void R() {
        this.N.forEach(class06633::R);
    }
}

