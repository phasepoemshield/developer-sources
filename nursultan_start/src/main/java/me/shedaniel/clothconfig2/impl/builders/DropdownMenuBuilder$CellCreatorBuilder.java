/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.clothconfig2.gui.entries.DropdownBoxEntry$DefaultSelectionCellCreator
 *  me.shedaniel.clothconfig2.gui.entries.DropdownBoxEntry$SelectionCellCreator
 *  minecraft.class00392
 *  minecraft.class00891
 *  minecraft.class01894
 *  minecraft.class04206
 *  minecraft.class06581
 */
package me.shedaniel.clothconfig2.impl.builders;

import java.util.function.Function;
import me.shedaniel.clothconfig2.gui.entries.DropdownBoxEntry;
import me.shedaniel.clothconfig2.impl.builders.DropdownMenuBuilder$CellCreatorBuilder$1;
import me.shedaniel.clothconfig2.impl.builders.DropdownMenuBuilder$CellCreatorBuilder$10;
import me.shedaniel.clothconfig2.impl.builders.DropdownMenuBuilder$CellCreatorBuilder$11;
import me.shedaniel.clothconfig2.impl.builders.DropdownMenuBuilder$CellCreatorBuilder$12;
import me.shedaniel.clothconfig2.impl.builders.DropdownMenuBuilder$CellCreatorBuilder$2;
import me.shedaniel.clothconfig2.impl.builders.DropdownMenuBuilder$CellCreatorBuilder$3;
import me.shedaniel.clothconfig2.impl.builders.DropdownMenuBuilder$CellCreatorBuilder$4;
import me.shedaniel.clothconfig2.impl.builders.DropdownMenuBuilder$CellCreatorBuilder$5;
import me.shedaniel.clothconfig2.impl.builders.DropdownMenuBuilder$CellCreatorBuilder$6;
import me.shedaniel.clothconfig2.impl.builders.DropdownMenuBuilder$CellCreatorBuilder$7;
import me.shedaniel.clothconfig2.impl.builders.DropdownMenuBuilder$CellCreatorBuilder$8;
import me.shedaniel.clothconfig2.impl.builders.DropdownMenuBuilder$CellCreatorBuilder$9;
import minecraft.class00392;
import minecraft.class00891;
import minecraft.class01894;
import minecraft.class04206;
import minecraft.class06581;

public class DropdownMenuBuilder$CellCreatorBuilder {
    public static <T> DropdownBoxEntry.SelectionCellCreator<T> of(int n, int n2) {
        return new DropdownMenuBuilder$CellCreatorBuilder$5(n, n2);
    }

    public static <T> DropdownBoxEntry.SelectionCellCreator<T> of(int n, int n2, Function<T, class00392> function) {
        return new DropdownMenuBuilder$CellCreatorBuilder$6(function, n, n2);
    }

    public static <T> DropdownBoxEntry.SelectionCellCreator<T> of(int n, int n2, int n3) {
        return new DropdownMenuBuilder$CellCreatorBuilder$7(n, n2, n3);
    }

    public static <T> DropdownBoxEntry.SelectionCellCreator<T> of(int n, int n2, int n3, Function<T, class00392> function) {
        return new DropdownMenuBuilder$CellCreatorBuilder$8(function, n, n2, n3);
    }

    public static <T> DropdownBoxEntry.SelectionCellCreator<T> of(Function<T, class00392> function) {
        return new DropdownBoxEntry.DefaultSelectionCellCreator(function);
    }

    public static <T> DropdownBoxEntry.SelectionCellCreator<T> of() {
        return new DropdownBoxEntry.DefaultSelectionCellCreator();
    }

    public static <T> DropdownBoxEntry.SelectionCellCreator<T> ofWidth(int n) {
        return new DropdownMenuBuilder$CellCreatorBuilder$1(n);
    }

    public static <T> DropdownBoxEntry.SelectionCellCreator<T> ofWidth(int n, Function<T, class00392> function) {
        return new DropdownMenuBuilder$CellCreatorBuilder$2(function, n);
    }

    public static DropdownBoxEntry.SelectionCellCreator<class06581> ofItemObject(int n, int n2, int n3) {
        return new DropdownMenuBuilder$CellCreatorBuilder$11(class065812 -> class00392.y((String)class04206.B.y(class065812).toString()), n, n2, n3);
    }

    public static DropdownBoxEntry.SelectionCellCreator<class06581> ofItemObject() {
        return DropdownMenuBuilder$CellCreatorBuilder.ofItemObject(20, 146, 7);
    }

    public static DropdownBoxEntry.SelectionCellCreator<class06581> ofItemObject(int n) {
        return DropdownMenuBuilder$CellCreatorBuilder.ofItemObject(20, 146, n);
    }

    public static <T> DropdownBoxEntry.SelectionCellCreator<T> ofCellCount(int n) {
        return new DropdownMenuBuilder$CellCreatorBuilder$3(n);
    }

    public static <T> DropdownBoxEntry.SelectionCellCreator<T> ofCellCount(int n, Function<T, class00392> function) {
        return new DropdownMenuBuilder$CellCreatorBuilder$4(function, n);
    }

    public static DropdownBoxEntry.SelectionCellCreator<class00891> ofBlockObject(int n, int n2, int n3) {
        return new DropdownMenuBuilder$CellCreatorBuilder$12(class008912 -> class00392.y((String)class04206.i.y(class008912).toString()), n, n2, n3);
    }

    public static DropdownBoxEntry.SelectionCellCreator<class00891> ofBlockObject(int n) {
        return DropdownMenuBuilder$CellCreatorBuilder.ofBlockObject(20, 146, n);
    }

    public static DropdownBoxEntry.SelectionCellCreator<class00891> ofBlockObject() {
        return DropdownMenuBuilder$CellCreatorBuilder.ofBlockObject(20, 146, 7);
    }

    public static DropdownBoxEntry.SelectionCellCreator<class01894> ofItemIdentifier(int n, int n2, int n3) {
        return new DropdownMenuBuilder$CellCreatorBuilder$9(n, n2, n3);
    }

    public static DropdownBoxEntry.SelectionCellCreator<class01894> ofItemIdentifier() {
        return DropdownMenuBuilder$CellCreatorBuilder.ofItemIdentifier(20, 146, 7);
    }

    public static DropdownBoxEntry.SelectionCellCreator<class01894> ofItemIdentifier(int n) {
        return DropdownMenuBuilder$CellCreatorBuilder.ofItemIdentifier(20, 146, n);
    }

    public static DropdownBoxEntry.SelectionCellCreator<class01894> ofBlockIdentifier(int n, int n2, int n3) {
        return new DropdownMenuBuilder$CellCreatorBuilder$10(n, n2, n3);
    }

    public static DropdownBoxEntry.SelectionCellCreator<class01894> ofBlockIdentifier() {
        return DropdownMenuBuilder$CellCreatorBuilder.ofBlockIdentifier(20, 146, 7);
    }

    public static DropdownBoxEntry.SelectionCellCreator<class01894> ofBlockIdentifier(int n) {
        return DropdownMenuBuilder$CellCreatorBuilder.ofBlockIdentifier(20, 146, n);
    }
}

