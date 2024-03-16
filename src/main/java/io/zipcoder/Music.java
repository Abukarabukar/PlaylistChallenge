package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList) {
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection) {
            int forward = 0;
            int backward = 0;
            //Forward
        for (int i = startIndex; i < playList.length; i++) {
            if (selection.equals(playList[i])) {
                 forward = i - startIndex;
                break;

            }
        }
        //backward
        for (int j = startIndex; j >= 0 ; j--) {
            if (selection.equals(playList[j])) {
//                backward = startIndex - j;
                break;
            }
            backward++;
            //1
            if (j == 0) {

                j = playList.length;
            }

        }
       if (backward > forward){
           return forward;
       }
       return backward;
    }

}


//d