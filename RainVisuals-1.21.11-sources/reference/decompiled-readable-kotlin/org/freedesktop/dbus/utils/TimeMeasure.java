package org.freedesktop.dbus.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.TimeZone;

// $VF: Compiled from TimeMeasure.java
public class TimeMeasure {
   private volatile long startTm;
   private final TimeMeasure.ITimeMeasureFormat tmf;

   String getElapsedFormatted(DateFormat _elapsedTime, long _dateFormat) {
      Date elapsedTime = new Date(_elapsedTime);
      DateFormat sdf = _dateFormat;
      if (_dateFormat == null) {
         sdf = new SimpleDateFormat("HH:mm:ss.SSS");
      }

      sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
      return sdf.format(elapsedTime);
   }

   public long getStartTime() {
      return this.startTm;
   }

   @Override
   public String toString() {
      return this.tmf == null ? String.valueOf(this.getElapsed()) : this.tmf.format(this.getElapsed());
   }

   public long getElapsed() {
      return Duration.ofNanos(System.nanoTime() - this.startTm).toMillis();
   }

   public TimeMeasure(TimeMeasure.ITimeMeasureFormat _formatter) {
      this.tmf = _formatter;
      this.reset();
   }

   public TimeMeasure() {
      this(new TimeMeasure.ITimeMeasureFormat()      // $VF: Compiled from TimeMeasure.java
 {
         @Override
         public String format(long _durationInMillis) {
            return _durationInMillis >= 5000L ? (long)(_durationInMillis / 1000.0 * 10.0) / 10.0 + "s" : _durationInMillis + "ms";
         }
      });
   }

   public long getElapsedSeconds() {
      return Duration.ofNanos(System.nanoTime() - this.startTm).toSeconds();
   }

   public String getElapsedFormatted(DateFormat _dateFormat) {
      return this.getElapsedFormatted(_dateFormat, this.getElapsed());
   }

   public long getElapsedAndReset() {
      long elapsed = this.getElapsed();
      this.reset();
      return elapsed;
   }

   void setStartTm(long _tm) {
      this.startTm = _tm;
   }

   public final TimeMeasure reset() {
      this.startTm = System.nanoTime();
      return this;
   }

   // $VF: Compiled from TimeMeasure.java
   public interface ITimeMeasureFormat {
      String format(long var1);
   }
}
