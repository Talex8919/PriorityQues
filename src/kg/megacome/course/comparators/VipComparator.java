package kg.megacome.course.comparators;



import kg.megacome.course.models.Tickets;

import java.util.Comparator;

public  class VipComparator implements Comparator<Tickets> {


    @Override
    public int compare(Tickets o1, Tickets o2) {
        return Boolean.compare(o2.isVip(),o1.isVip()) ;
    }


}



