package l;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class Helper200 implements Helper219 {
   private final Helper129 manager;
   private final Helper276 context;
   private final LinkedList<Helper204> args;
   private final Deque<Helper204> consumed;

   private Helper200(Helper129 var1, Deque<Helper204> var2, Deque<Helper204> var3) {
      this.manager = var1;
      this.context = new Helper199(this);
      this.args = new LinkedList<>(var2);
      this.consumed = new LinkedList<>(var3);
   }

   public Helper200(Helper129 var1, List<Helper204> var2) {
      this(var1, new LinkedList<>(var2), new LinkedList<>());
   }

   @Override
   public LinkedList<Helper204> method1687() {
      return this.args;
   }

   @Override
   public Deque<Helper204> method1688() {
      return this.consumed;
   }

   @Override
   public boolean method1689(int var1) {
      return this.args.size() >= var1;
   }

   @Override
   public boolean method1690() {
      return this.method1689(1);
   }

   @Override
   public boolean method1691(int var1) {
      return this.args.size() <= var1;
   }

   @Override
   public boolean method1692() {
      return this.method1691(1);
   }

   @Override
   public boolean method1693(int var1) {
      return this.args.size() == var1;
   }

   @Override
   public boolean method1694() {
      return this.method1693(1);
   }

   @Override
   public Helper204 method1695(int var1) {
      this.method1738(var1 + 1);
      return this.args.get(var1);
   }

   @Override
   public Helper204 method1696() {
      return this.method1695(0);
   }

   @Override
   public boolean method1697(Class<?> var1, int var2) {
      return this.method1695(var2).method397(var1);
   }

   @Override
   public boolean method1698(Class<?> var1) {
      return this.method1697(var1, 0);
   }

   @Override
   public String method1699(int var1) {
      return this.method1695(var1).method393();
   }

   @Override
   public String method1700() {
      return this.method1699(0);
   }

   @Override
   public <E extends Enum<?>> E method1701(Class<E> var1, int var2) {
      return this.method1695(var2).method395(var1);
   }

   @Override
   public <E extends Enum<?>> E method1702(Class<E> var1) {
      return this.method1701(var1, 0);
   }

   @Override
   public <E extends Enum<?>> E method1703(Class<E> var1, int var2) {
      try {
         return this.method1701(var1, var2);
      } catch (Helper93 var4) {
         return null;
      }
   }

   @Override
   public <E extends Enum<?>> E method1704(Class<E> var1) {
      return this.method1703(var1, 0);
   }

   @Override
   public <T> T method1705(Class<T> var1, int var2) {
      return this.method1695(var2).method396(var1);
   }

   @Override
   public <T> T method1706(Class<T> var1) {
      return this.method1705(var1, 0);
   }

   @Override
   public <T> T method1707(Class<T> var1, T var2, int var3) {
      try {
         return this.method1705(var1, var3);
      } catch (Helper93 var5) {
         return (T)var2;
      }
   }

   @Override
   public <T> T method1708(Class<T> var1, T var2) {
      return this.method1707(var1, (T)var2, 0);
   }

   @Override
   public <T> T method1709(Class<T> var1, int var2) {
      return this.method1707(var1, null, var2);
   }

   @Override
   public <T> T method1710(Class<T> var1) {
      return this.method1709(var1, 0);
   }

   @Override
   public <T> T method1711(Helper278<T> var1) {
      return this.method1745().method1733(var1);
   }

   @Override
   public <T, O> T method1712(Helper268<T, O> var1) {
      return this.method1713(var1, null);
   }

   @Override
   public <T, O> T method1713(Helper268<T, O> var1, O var2) {
      return this.method1745().method1730(var1, var2);
   }

   @Override
   public <T> T method1714(Helper278<T> var1) {
      return this.method1745().method1735(var1);
   }

   @Override
   public <T, O> T method1715(Helper268<T, O> var1) {
      return this.method1745().method1732(var1, null);
   }

   @Override
   public <T, O, D extends Helper268<T, O>> T method1716(D var1, O var2) {
      return this.method1745().method1730((D)var1, var2);
   }

   @Override
   public <T, O, D extends Helper268<T, O>> T method1717(D var1, O var2, T var3) {
      return this.method1745().method1731((D)var1, var2, (T)var3);
   }

   @Override
   public <T, O, D extends Helper268<T, O>> T method1718(D var1, O var2) {
      return this.method1717((D)var1, var2, null);
   }

   @Override
   public <T, D extends Helper278<T>> T method1719(Class<D> var1) {
      return this.method1745().method1719(var1);
   }

   @Override
   public <T, D extends Helper278<T>> T method1720(Class<D> var1, T var2) {
      return this.method1745().method1720(var1, (T)var2);
   }

   @Override
   public <T, D extends Helper278<T>> T method1721(Class<D> var1) {
      return this.method1720(var1, null);
   }

   @Override
   public Helper204 method1722() {
      this.method1738(1);
      Helper204 var1 = this.args.removeFirst();
      this.consumed.add(var1);
      return var1;
   }

   @Override
   public String method1723() {
      return this.method1722().method393();
   }

   @Override
   public <E extends Enum<?>> E method1724(Class<E> var1) {
      return this.method1722().method395(var1);
   }

   @Override
   public <E extends Enum<?>> E method1725(Class<E> var1, E var2) {
      try {
         this.method1702(var1);
         return this.method1724(var1);
      } catch (Helper93 var4) {
         return (E)var2;
      }
   }

   @Override
   public <E extends Enum<?>> E method1726(Class<E> var1) {
      return this.method1725(var1, null);
   }

   @Override
   public <T> T method1727(Class<T> var1) {
      return this.method1722().method396(var1);
   }

   @Override
   public <T> T method1728(Class<T> var1, T var2) {
      try {
         Object var3 = this.method1696().method396(var1);
         this.method1722();
         return (T)var3;
      } catch (Helper93 var4) {
         return (T)var2;
      }
   }

   @Override
   public <T> T method1729(Class<T> var1) {
      return this.method1728(var1, null);
   }

   @Override
   public <T, O, D extends Helper268<T, O>> T method1730(D var1, O var2) throws Helper93 {
      try {
         return (T)var1.method2733(this.context, var2);
      } catch (Exception var4) {
         var4.printStackTrace();
         throw new Helper93(this.method1690() ? this.method1696() : this.method1742(), var1.getClass().getSimpleName(), var4);
      }
   }

   @Override
   public <T, O, D extends Helper268<T, O>> T method1731(D var1, O var2, T var3) {
      ArrayList var4 = new ArrayList<>(this.args);
      ArrayList var5 = new ArrayList<>(this.consumed);

      try {
         return this.method1730((D)var1, var2);
      } catch (Exception var7) {
         this.args.clear();
         this.args.addAll(var4);
         this.consumed.clear();
         this.consumed.addAll(var5);
         return (T)var3;
      }
   }

   @Override
   public <T, O, D extends Helper268<T, O>> T method1732(D var1, O var2) {
      return this.method1731((D)var1, var2, null);
   }

   @Override
   public <T, D extends Helper278<T>> T method1733(D var1) throws Helper93 {
      try {
         return (T)var1.method2018(this.context);
      } catch (Exception var3) {
         var3.printStackTrace();
         throw new Helper93(this.method1690() ? this.method1696() : this.method1742(), var1.getClass().getSimpleName(), var3);
      }
   }

   @Override
   public <T, D extends Helper278<T>> T method1734(D var1, T var2) {
      ArrayList var3 = new ArrayList<>(this.args);
      ArrayList var4 = new ArrayList<>(this.consumed);

      try {
         return this.method1733((D)var1);
      } catch (Exception var6) {
         this.args.clear();
         this.args.addAll(var3);
         this.consumed.clear();
         this.consumed.addAll(var4);
         return (T)var2;
      }
   }

   @Override
   public <T, D extends Helper278<T>> T method1735(D var1) {
      return this.method1734((D)var1, null);
   }

   @Override
   public <T extends Helper277> Stream<String> method1736(T var1) {
      try {
         return var1.method2013(this.context);
      } catch (Exception1 var3) {
      } catch (Exception var4) {
         var4.printStackTrace();
      }

      return Stream.empty();
   }

   @Override
   public String method1737() {
      return this.args.size() > 0 ? this.args.getFirst().method394() : "";
   }

   @Override
   public void method1738(int var1) throws Helper106 {
      if (this.args.size() < var1) {
         throw new Helper106(var1 + this.consumed.size());
      }
   }

   @Override
   public void method1739(int var1) throws Helper107 {
      if (this.args.size() > var1) {
         throw new Helper107(var1 + this.consumed.size());
      }
   }

   @Override
   public void method1740(int var1) {
      this.method1738(var1);
      this.method1739(var1);
   }

   @Override
   public boolean method1741() {
      return !this.consumed.isEmpty();
   }

   @Override
   public Helper204 method1742() {
      return (Helper204)(!this.consumed.isEmpty() ? this.consumed.getLast() : Helper299.method2949());
   }

   @Override
   public String method1743() {
      return this.method1742().method393();
   }

   public Helper200 method1745() {
      return new Helper200(this.manager, this.args, this.consumed);
   }
}
