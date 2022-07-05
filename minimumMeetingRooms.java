package Greedy;

import java.util.Arrays;

/*
 Given an array of meeting time Intervals
 where Interval =  [ start time, end time ]
 find the min no conference RoomS required.

 eg) {{0,30},{5,10},{15,20}}
 */
public class minimumMeetingRooms {
    static int minConferenceRooms(int[][] meetings){
        int requiredRooms = 0;
        int[] start = new int[meetings.length];
        int[] end = new int[meetings.length];
        int i=0;
        for(int[] meet: meetings){
            start[i] = meet[0];
            end[i] = meet[1];
            i++;
        }

        Arrays.sort(start);
        Arrays.sort(end);

        int s = 0,e = 0;

        while(s < start.length){

            if(start[s] >= end[e]){
                requiredRooms--;
                e++;
            }
            s++;
            requiredRooms++;
        }
        return  requiredRooms;
    }
    public static void main(String[] args) {
        int[][] meetings = new int[][]{{1,10},{2,7},{3,19},{8,12},{10,20},{11,30}};
        System.out.println(minConferenceRooms(meetings));
    }
}
