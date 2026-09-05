/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class00500
 *  minecraft.class00753
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class02214
 *  minecraft.class03162
 *  minecraft.class03191
 *  minecraft.class03312
 *  minecraft.class03317
 *  minecraft.class03530
 *  minecraft.class03543
 *  minecraft.class04206
 *  minecraft.class04304
 *  minecraft.class04311
 *  minecraft.class04651
 *  minecraft.class04684
 *  minecraft.class05974
 *  minecraft.class07209
 *  minecraft.class07211
 */
package minecraft;

import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.BiPredicate;
import minecraft.class00500;
import minecraft.class00753;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class02214;
import minecraft.class03162;
import minecraft.class03191;
import minecraft.class03312;
import minecraft.class03317;
import minecraft.class03530;
import minecraft.class03543;
import minecraft.class04024;
import minecraft.class04029;
import minecraft.class04041;
import minecraft.class04046;
import minecraft.class04048;
import minecraft.class04052;
import minecraft.class04054;
import minecraft.class04206;
import minecraft.class04304;
import minecraft.class04311;
import minecraft.class04651;
import minecraft.class04684;
import minecraft.class05974;
import minecraft.class07209;
import minecraft.class07211;

public interface class04025
extends BiPredicate<class05974, class07209> {
    public static final Codec<class04025> y = class04206.H.T().dispatch(class04025::N, class04054::codec);
    public static final class04025 L = class04025.N(class00869.N);
    public static final class04025 u = class04025.N(class00869.N, class00869.K);

    public static class04025 L(List<class00891> list) {
        return class04025.N(class00753.field_11176, list);
    }

    public static class04025 L() {
        return class04025.y(class00753.field_11176);
    }

    public static class04025 L(class00753 class007532) {
        return class04025.N(class007532, class04684.N);
    }

    public static class04025 i(class00753 class007532) {
        return new class02214(class007532);
    }

    public static class04025 i() {
        return class04046.N;
    }

    public static class04025 u() {
        return class04025.L(class00753.field_11176);
    }

    public static class04025 u(class00753 class007532) {
        return new class04304(class007532);
    }

    public static class04025 y(class00753 class007532, List<class04651> list) {
        return new class04041(class007532, (class03543<class04651>)class03543.N(class04651::U, list));
    }

    public static class04025 y() {
        return class04025.N(class00753.field_11176);
    }

    public static class04025 y(class00753 class007532) {
        return new class04311(class007532);
    }

    public static class04025 y(List<class04025> list) {
        return new class03317(list);
    }

    public static class04025 y(class04025 ... class04025Array) {
        return class04025.y(List.of(class04025Array));
    }

    public static class04025 y(class04025 class040252, class04025 class040253) {
        return class04025.y(List.of(class040252, class040253));
    }

    public class04054<?> N();

    public static class04025 N(class00500 class005002, class00753 class007532) {
        return new class04048(class007532, class005002);
    }

    public static class04025 N(class00753 class007532, class07211 class072112) {
        return new class03162(class007532, class072112);
    }

    public static class04025 N(class07211 class072112) {
        return class04025.N(class00753.field_11176, class072112);
    }

    public static class04025 N(class00891 ... class00891Array) {
        return class04025.N(class00753.field_11176, class00891Array);
    }

    public static class04025 N(class00753 class007532, class00891 ... class00891Array) {
        return class04025.N(class007532, List.of(class00891Array));
    }

    public static class04025 N(class00753 class007532, List<class00891> list) {
        return new class04052(class007532, (class03543<class00891>)class03543.N(class00891::s, list));
    }

    public static class04025 N(class04025 class040252, class04025 class040253) {
        return class04025.N(List.of(class040252, class040253));
    }

    public static class04025 N(class04025 ... class04025Array) {
        return class04025.N(List.of(class04025Array));
    }

    public static class04025 N(List<class04025> list) {
        return new class03312(list);
    }

    public static class04025 N(class00753 class007532) {
        return new class04024(class007532);
    }

    public static class04025 N(class04025 class040252) {
        return new class04029(class040252);
    }

    public static class04025 N(class04651 ... class04651Array) {
        return class04025.N(class00753.field_11176, class04651Array);
    }

    public static class04025 N(class00753 class007532, class03530<class00891> class035302) {
        return new class03191(class007532, class035302);
    }

    public static class04025 N(class03530<class00891> class035302) {
        return class04025.N(class00753.field_11176, class035302);
    }

    public static class04025 N(class00753 class007532, class04651 ... class04651Array) {
        return class04025.y(class007532, List.of(class04651Array));
    }

    public static class04025 R() {
        return class04025.i(class00753.field_11176);
    }
}

