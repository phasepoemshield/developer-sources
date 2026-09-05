/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kroppeb.stareval.function.FunctionReturn
 *  kroppeb.stareval.function.Type
 */
package net.irisshaders.iris.parsing;

import java.util.Objects;
import kroppeb.stareval.function.FunctionReturn;
import kroppeb.stareval.function.Type;
import net.irisshaders.iris.parsing.VectorType;
import net.irisshaders.iris.parsing.VectorType$ArrayVector$IntObjectObjectObjectConsumer;

public class VectorType$ArrayVector
extends VectorType {
    private final Type inner;
    private final int size;

    public VectorType$ArrayVector(Type type, int n) {
        this.inner = type;
        this.size = n;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof VectorType$ArrayVector)) {
            return false;
        }
        VectorType$ArrayVector vectorType$ArrayVector = (VectorType$ArrayVector)((Object)object);
        return this.size == vectorType$ArrayVector.size && this.inner.equals(vectorType$ArrayVector.inner);
    }

    public String toString() {
        String string = this.inner.equals(Type.Float) ? "" : this.inner.toString().substring(0, 1);
        return "__" + string + "vec" + this.size;
    }

    public int hashCode() {
        return Objects.hash(this.inner, this.size);
    }

    public void getValue(Object object, int n, FunctionReturn functionReturn) {
        this.inner.getValueFromArray(object, n, functionReturn);
    }

    public <T1, T2> void map(T1 T1, T2 T2, FunctionReturn functionReturn, VectorType$ArrayVector$IntObjectObjectObjectConsumer<T1, T2, FunctionReturn> vectorType$ArrayVector$IntObjectObjectObjectConsumer) {
        Object object = this.createObject();
        for (int i = 0; i < this.size; ++i) {
            vectorType$ArrayVector$IntObjectObjectObjectConsumer.accept(i, T1, T2, functionReturn);
            this.setValue(object, i, functionReturn);
        }
        functionReturn.objectReturn = object;
    }

    public void setValue(Object object, int n, FunctionReturn functionReturn) {
        this.inner.setValueFromReturn(object, n, functionReturn);
    }

    public Object createObject() {
        return this.inner.createArray(this.size);
    }
}

