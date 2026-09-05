/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class06889
 *  org.joml.Matrix4fc
 *  org.joml.Quaternionfc
 */
package minecraft;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import minecraft.class01423;
import minecraft.class06889;
import org.joml.Matrix4fc;
import org.joml.Quaternionfc;

public class class01421 {
    private final List<class01423> N = new ArrayList<class01423>(16);
    private int y;

    public class01423 L() {
        return this.N.get(this.y);
    }

    public class01421() {
        this.N.add(new class01423());
    }

    public void i() {
        this.L().L();
    }

    public boolean u() {
        return this.y == 0;
    }

    public void y() {
        if (this.y == 0) {
            throw new NoSuchElementException();
        }
        --this.y;
    }

    public void y(float f, float f2, float f3) {
        this.L().y(f, f2, f3);
    }

    public void N(Matrix4fc matrix4fc) {
        this.L().N(matrix4fc);
    }

    public void N() {
        class01423 class014232 = this.L();
        ++this.y;
        if (this.y >= this.N.size()) {
            this.N.add(class014232.u());
        } else {
            this.N.get(this.y).N(class014232);
        }
    }

    public void N(double d, double d2, double d3) {
        this.N((float)d, (float)d2, (float)d3);
    }

    public void N(float f, float f2, float f3) {
        this.L().N(f, f2, f3);
    }

    public void N(class06889 class068892) {
        this.N(class068892.M, class068892.B, class068892.Z);
    }

    public void N(Quaternionfc quaternionfc) {
        this.L().N(quaternionfc);
    }

    public void N(Quaternionfc quaternionfc, float f, float f2, float f3) {
        this.L().N(quaternionfc, f, f2, f3);
    }
}

