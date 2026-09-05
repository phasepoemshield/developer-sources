/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.clothconfig2.gui.entries.DropdownBoxEntry$DefaultSelectionTopCellElement
 *  me.shedaniel.clothconfig2.gui.entries.DropdownBoxEntry$SelectionTopCellElement
 *  minecraft.class00392
 *  minecraft.class00891
 *  minecraft.class01894
 *  minecraft.class04206
 *  minecraft.class06570
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class07310
 */
package me.shedaniel.clothconfig2.impl.builders;

import java.util.function.Function;
import me.shedaniel.clothconfig2.gui.entries.DropdownBoxEntry;
import me.shedaniel.clothconfig2.impl.builders.DropdownMenuBuilder$TopCellElementBuilder$1;
import me.shedaniel.clothconfig2.impl.builders.DropdownMenuBuilder$TopCellElementBuilder$2;
import me.shedaniel.clothconfig2.impl.builders.DropdownMenuBuilder$TopCellElementBuilder$3;
import me.shedaniel.clothconfig2.impl.builders.DropdownMenuBuilder$TopCellElementBuilder$4;
import minecraft.class00392;
import minecraft.class00891;
import minecraft.class01894;
import minecraft.class04206;
import minecraft.class06570;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class07310;

public class DropdownMenuBuilder$TopCellElementBuilder {
    public static final Function<String, class01894> IDENTIFIER_FUNCTION = string -> {
        try {
            return class01894.N((String)string);
        }
        catch (NumberFormatException numberFormatException) {
            return null;
        }
    };
    public static final Function<String, class01894> ITEM_IDENTIFIER_FUNCTION = string -> {
        try {
            class01894 class018942 = class01894.N((String)string);
            if (class04206.B.y(class018942).isPresent()) {
                return class018942;
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        return null;
    };
    public static final Function<String, class01894> BLOCK_IDENTIFIER_FUNCTION = string -> {
        try {
            class01894 class018942 = class01894.N((String)string);
            if (class04206.i.y(class018942).isPresent()) {
                return class018942;
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        return null;
    };
    public static final Function<String, class06581> ITEM_FUNCTION = string -> {
        try {
            return class04206.B.y(class01894.N((String)string)).orElse(null);
        }
        catch (Exception exception) {
            return null;
        }
    };
    public static final Function<String, class00891> BLOCK_FUNCTION = string -> {
        try {
            return class04206.i.y(class01894.N((String)string)).orElse(null);
        }
        catch (Exception exception) {
            return null;
        }
    };
    static final class06584 BARRIER = new class06584((class07310)class06570.Zn);

    public static <T> DropdownBoxEntry.SelectionTopCellElement<T> of(T t, Function<String, T> function, Function<T, class00392> function2) {
        return new DropdownBoxEntry.DefaultSelectionTopCellElement(t, function, function2);
    }

    public static <T> DropdownBoxEntry.SelectionTopCellElement<T> of(T t, Function<String, T> function) {
        return DropdownMenuBuilder$TopCellElementBuilder.of(t, function, object -> class00392.y((String)object.toString()));
    }

    public static DropdownBoxEntry.SelectionTopCellElement<class06581> ofItemObject(class06581 class065813) {
        return new DropdownMenuBuilder$TopCellElementBuilder$3(class065813, ITEM_FUNCTION, class065812 -> class00392.y((String)class04206.B.y(class065812).toString()));
    }

    public static DropdownBoxEntry.SelectionTopCellElement<class00891> ofBlockObject(class00891 class008913) {
        return new DropdownMenuBuilder$TopCellElementBuilder$4(class008913, BLOCK_FUNCTION, class008912 -> class00392.y((String)class04206.i.y(class008912).toString()));
    }

    public static DropdownBoxEntry.SelectionTopCellElement<class01894> ofItemIdentifier(class06581 class065812) {
        return new DropdownMenuBuilder$TopCellElementBuilder$1(class04206.B.y((Object)class065812), ITEM_IDENTIFIER_FUNCTION, class018942 -> class00392.y((String)class018942.toString()));
    }

    public static DropdownBoxEntry.SelectionTopCellElement<class01894> ofBlockIdentifier(class00891 class008912) {
        return new DropdownMenuBuilder$TopCellElementBuilder$2(class04206.i.y((Object)class008912), BLOCK_IDENTIFIER_FUNCTION, class018942 -> class00392.y((String)class018942.toString()));
    }
}

