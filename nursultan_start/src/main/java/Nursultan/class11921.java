/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class12020
 *  minecraft.class00405
 *  minecraft.class01751
 *  minecraft.class04439
 *  minecraft.class05216
 *  minecraft.class05935
 *  minecraft.class05977
 */
package Nursultan;

import Nursultan.class12020;
import java.util.Optional;
import minecraft.class00405;
import minecraft.class01751;
import minecraft.class04439;
import minecraft.class05216;
import minecraft.class05935;
import minecraft.class05977;

public class class11921
implements class01751 {
    public Object N_0;

    private void L() {
    }

    private class11921(String string, Object ... objectArray) {
        this.L();
        this.N_0 = class12020.N((String)string).formatted(objectArray);
    }

    private class11921(String string) {
        this.L();
        this.N_0 = class12020.N((String)string);
    }

    public String toString() {
        return "clientTranslatableText{" + (String)this.N_0 + "}";
    }

    public static class05216 N(String string) {
        return class05216.N((class04439)new class11921(string));
    }

    public static class05216 N(String string, Object ... objectArray) {
        return class05216.N((class04439)new class11921(string, objectArray));
    }

    public String comp_737() {
        return (String)this.N_0;
    }

    public <T> Optional<T> method_27660(class05935<T> class059352, class00405 class004052) {
        return class059352.accept(class004052, (String)this.N_0);
    }

    public <T> Optional<T> method_27659(class05977<T> class059772) {
        return class059772.accept((String)this.N_0);
    }
}

