package com.epam.springaop.concert;

import java.util.HashMap;
import java.util.Map;

//@Aspect
public class TrackCounter {
    Map<String, Integer> trackTimes = new HashMap<>();
    
    //@Pointcut("execution(** com.epam.springaop.concert.BlankDisc.play(String)) && args(fuck)")
    public void trackPlayed(String fuck) {}
    
    //@Before("trackPlayed(track)")
    public void count(String track) {
       if (trackTimes.containsKey(track)) {
           trackTimes.put(track, 1 + trackTimes.get(track));
       } else {
           trackTimes.put(track, 1);
       }       
    }
    
    public int getCounts(String track) {
        return trackTimes.get(track) == null ? 0 : trackTimes.get(track);
    }
}
