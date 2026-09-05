/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.DumperOptions$FlowStyle
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.error.YAMLException
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.Node
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.Tag
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.representer.Represent
 */
package me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.representer;

import java.util.ArrayList;
import java.util.List;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.DumperOptions;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.error.YAMLException;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.Node;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.Tag;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.representer.Represent;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.representer.SafeRepresenter;

public class SafeRepresenter$RepresentPrimitiveArray
implements Represent {
    final /* synthetic */ SafeRepresenter this$0;

    protected SafeRepresenter$RepresentPrimitiveArray(SafeRepresenter safeRepresenter) {
        this.this$0 = safeRepresenter;
    }

    private List<Short> asShortList(Object object) {
        short[] sArray = (short[])object;
        ArrayList<Short> arrayList = new ArrayList<Short>(sArray.length);
        for (int i = 0; i < sArray.length; ++i) {
            arrayList.add(sArray[i]);
        }
        return arrayList;
    }

    private List<Double> asDoubleList(Object object) {
        double[] dArray = (double[])object;
        ArrayList<Double> arrayList = new ArrayList<Double>(dArray.length);
        for (int i = 0; i < dArray.length; ++i) {
            arrayList.add(dArray[i]);
        }
        return arrayList;
    }

    private List<Float> asFloatList(Object object) {
        float[] fArray = (float[])object;
        ArrayList<Float> arrayList = new ArrayList<Float>(fArray.length);
        for (int i = 0; i < fArray.length; ++i) {
            arrayList.add(Float.valueOf(fArray[i]));
        }
        return arrayList;
    }

    private List<Boolean> asBooleanList(Object object) {
        boolean[] blArray = (boolean[])object;
        ArrayList<Boolean> arrayList = new ArrayList<Boolean>(blArray.length);
        for (int i = 0; i < blArray.length; ++i) {
            arrayList.add(blArray[i]);
        }
        return arrayList;
    }

    public Node representData(Object object) {
        Class<?> clazz = object.getClass().getComponentType();
        if (Byte.TYPE == clazz) {
            return this.this$0.representSequence(Tag.SEQ, this.asByteList(object), DumperOptions.FlowStyle.AUTO);
        }
        if (Short.TYPE == clazz) {
            return this.this$0.representSequence(Tag.SEQ, this.asShortList(object), DumperOptions.FlowStyle.AUTO);
        }
        if (Integer.TYPE == clazz) {
            return this.this$0.representSequence(Tag.SEQ, this.asIntList(object), DumperOptions.FlowStyle.AUTO);
        }
        if (Long.TYPE == clazz) {
            return this.this$0.representSequence(Tag.SEQ, this.asLongList(object), DumperOptions.FlowStyle.AUTO);
        }
        if (Float.TYPE == clazz) {
            return this.this$0.representSequence(Tag.SEQ, this.asFloatList(object), DumperOptions.FlowStyle.AUTO);
        }
        if (Double.TYPE == clazz) {
            return this.this$0.representSequence(Tag.SEQ, this.asDoubleList(object), DumperOptions.FlowStyle.AUTO);
        }
        if (Character.TYPE == clazz) {
            return this.this$0.representSequence(Tag.SEQ, this.asCharList(object), DumperOptions.FlowStyle.AUTO);
        }
        if (Boolean.TYPE == clazz) {
            return this.this$0.representSequence(Tag.SEQ, this.asBooleanList(object), DumperOptions.FlowStyle.AUTO);
        }
        throw new YAMLException("Unexpected primitive '" + clazz.getCanonicalName() + "'");
    }

    private List<Byte> asByteList(Object object) {
        byte[] byArray = (byte[])object;
        ArrayList<Byte> arrayList = new ArrayList<Byte>(byArray.length);
        for (int i = 0; i < byArray.length; ++i) {
            arrayList.add(byArray[i]);
        }
        return arrayList;
    }

    private List<Long> asLongList(Object object) {
        long[] lArray = (long[])object;
        ArrayList<Long> arrayList = new ArrayList<Long>(lArray.length);
        for (int i = 0; i < lArray.length; ++i) {
            arrayList.add(lArray[i]);
        }
        return arrayList;
    }

    private List<Character> asCharList(Object object) {
        char[] cArray = (char[])object;
        ArrayList<Character> arrayList = new ArrayList<Character>(cArray.length);
        for (int i = 0; i < cArray.length; ++i) {
            arrayList.add(Character.valueOf(cArray[i]));
        }
        return arrayList;
    }

    private List<Integer> asIntList(Object object) {
        int[] nArray = (int[])object;
        ArrayList<Integer> arrayList = new ArrayList<Integer>(nArray.length);
        for (int i = 0; i < nArray.length; ++i) {
            arrayList.add(nArray[i]);
        }
        return arrayList;
    }
}

