package jnr.posix;

// $VF: Compiled from NanosecondFileStat.java
public interface NanosecondFileStat extends FileStat {
   long cTimeNanoSecs();

   long aTimeNanoSecs();

   long mTimeNanoSecs();
}
