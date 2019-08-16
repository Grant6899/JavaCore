package generic;

import generic.pair1.Pair;

import java.util.Date;

public class DateInterval extends Pair<Date> {

    @Override
    public void setSecond(Date second) {
        if(second.compareTo(getFirst()) >= 0)
            super.setSecond(second);
    }


}
