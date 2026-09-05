/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.loader.api.metadata.CustomValue
 *  net.fabricmc.loader.api.metadata.CustomValue$CvArray
 *  net.fabricmc.loader.api.metadata.CustomValue$CvObject
 *  net.fabricmc.loader.api.metadata.CustomValue$CvType
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import net.fabricmc.loader.api.metadata.CustomValue;

abstract class NurCv
implements CustomValue {
    NurCv() {
    }

    public CustomValue.CvObject getAsObject() {
        throw new ClassCastException("not an object");
    }

    public CustomValue.CvArray getAsArray() {
        throw new ClassCastException("not an array");
    }

    public String getAsString() {
        throw new ClassCastException("not a string");
    }

    public Number getAsNumber() {
        throw new ClassCastException("not a number");
    }

    public boolean getAsBoolean() {
        throw new ClassCastException("not a boolean");
    }

    static Map<String, CustomValue> emptyMap() {
        return new LinkedHashMap<String, CustomValue>();
    }

    static List<CustomValue> emptyList() {
        return new ArrayList<CustomValue>();
    }

    static final class Nil
    extends NurCv {
        static final Nil INSTANCE = new Nil();

        Nil() {
        }

        public CustomValue.CvType getType() {
            return CustomValue.CvType.NULL;
        }
    }

    static final class Bool
    extends NurCv {
        private final boolean value;

        Bool(boolean bl) {
            this.value = bl;
        }

        public CustomValue.CvType getType() {
            return CustomValue.CvType.BOOLEAN;
        }

        @Override
        public boolean getAsBoolean() {
            return this.value;
        }
    }

    static final class Num
    extends NurCv {
        private final Number value;

        Num(Number number) {
            this.value = number;
        }

        public CustomValue.CvType getType() {
            return CustomValue.CvType.NUMBER;
        }

        @Override
        public Number getAsNumber() {
            return this.value;
        }
    }

    static final class Str
    extends NurCv {
        private final String value;

        Str(String string) {
            this.value = string;
        }

        public CustomValue.CvType getType() {
            return CustomValue.CvType.STRING;
        }

        @Override
        public String getAsString() {
            return this.value;
        }
    }

    static final class Arr
    extends NurCv
    implements CustomValue.CvArray {
        private final List<CustomValue> list;

        Arr(List<CustomValue> list) {
            this.list = list;
        }

        public CustomValue.CvType getType() {
            return CustomValue.CvType.ARRAY;
        }

        @Override
        public CustomValue.CvArray getAsArray() {
            return this;
        }

        public int size() {
            return this.list.size();
        }

        public CustomValue get(int n) {
            return this.list.get(n);
        }

        public Iterator<CustomValue> iterator() {
            return this.list.iterator();
        }
    }

    static final class Obj
    extends NurCv
    implements CustomValue.CvObject {
        private final Map<String, CustomValue> map;

        Obj(Map<String, CustomValue> map) {
            this.map = map;
        }

        public CustomValue.CvType getType() {
            return CustomValue.CvType.OBJECT;
        }

        @Override
        public CustomValue.CvObject getAsObject() {
            return this;
        }

        public int size() {
            return this.map.size();
        }

        public boolean containsKey(String string) {
            return this.map.containsKey(string);
        }

        public CustomValue get(String string) {
            return this.map.get(string);
        }

        public Iterator<Map.Entry<String, CustomValue>> iterator() {
            return this.map.entrySet().iterator();
        }
    }
}

