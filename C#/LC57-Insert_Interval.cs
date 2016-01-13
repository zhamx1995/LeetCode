/**
 * Definition for an interval.
 * public class Interval {
 *     public int start;
 *     public int end;
 *     public Interval() { start = 0; end = 0; }
 *     public Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {
    public IList<Interval> Insert(IList<Interval> intervals, Interval newInterval) {
        IList<Interval> result = new List<Interval>();
        if(intervals.Count == 0){
            result.Add(newInterval);
            return result; 
        }
        bool first = true;
        for(int i=0; i<intervals.Count; i++){
            if(intervals[i].end<newInterval.start){
                result.Add(intervals[i]);
            }
            else if(intervals[i].start>newInterval.end){
                if(first){
                    result.Add(newInterval);
                    first = false;
                }
                result.Add(intervals[i]);
            }
            else{
                newInterval = new Interval(Math.Min(newInterval.start, intervals[i].start), Math.Max(newInterval.end, intervals[i].end));
            }
        }
            
            if(first){
                result.Add(newInterval);
                first = false;
            }
        return result;
    }
}