package kg.megacome.course.comparators;



import kg.megacome.course.models.Tickets;

import java.util.Comparator;



    public class CostComparator implements Comparator<Tickets> {
        @Override
        public int compare(Tickets o1, Tickets o2) {
            return o2.getPrice()- o1.getPrice() ;
        }


    }