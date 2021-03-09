package kg.megacome.course.models;

import kg.megacome.course.comparators.CostComparator;
import kg.megacome.course.comparators.VipComparator;

import java.util.*;

public class Main implements Comparable<Tickets> {

    public Main() {
    }

    public static void main(String[] args) {

        Tickets rockTicket = new Tickets(1550, false, " RedHotChillyPapers ticket ");
        Tickets dramTicket = new Tickets(750, false, "Hamlet Play");
        Tickets cinemaTicket = new Tickets(250, false, "Avengers ");
        Tickets nightClubTicket = new Tickets(1700, false, "Nirvana Club Casual");
        Tickets metallicTicket = new Tickets(2550, false, "Metallica Casual Ticket");
        Tickets exhibitionTicket = new Tickets(600, false, "Modern Art Exhibition ");
        Tickets newFusionCinemaTicket = new Tickets(1000, false, " 4D Avengers ticket");

        Tickets zooTicket = new Tickets(1500, true, " African zoo  ");
        Tickets AquaParkTickets = new Tickets(1800, true, " Aqua Park  ");
        Tickets swimmingPoolTicket = new Tickets(5000, true, " Swimming Pool Vip type ");
        Tickets VrCinemaTicket = new Tickets(3500, true, " VR Ticket ");
        Tickets artExhibitionTicket = new Tickets(2570, true, " Egyptian Exhibition art ");
        Tickets rapConcertTicket = new Tickets(8000, true, " Eminem Concert Ticket");
        Tickets operaTicket = new Tickets(2549, true, "Bella Mamia");


        ArrayList<Tickets> ticketsArrayList = new ArrayList<>();

        ticketsArrayList.add(rockTicket);
        ticketsArrayList.add(dramTicket);
        ticketsArrayList.add(cinemaTicket);
        ticketsArrayList.add(nightClubTicket);
        ticketsArrayList.add(metallicTicket);
        ticketsArrayList.add(exhibitionTicket);
        ticketsArrayList.add(newFusionCinemaTicket);
        ticketsArrayList.add(AquaParkTickets);
        ticketsArrayList.add(swimmingPoolTicket);
        ticketsArrayList.add(VrCinemaTicket);
        ticketsArrayList.add(artExhibitionTicket);
        ticketsArrayList.add(rapConcertTicket);
        ticketsArrayList.add(operaTicket);
        ticketsArrayList.add(zooTicket);

        ArrayDeque<Tickets> listofTickets = new ArrayDeque<>();
        listofTickets.add(rockTicket);
        listofTickets.add(dramTicket);
        listofTickets.add(cinemaTicket);
        listofTickets.add(nightClubTicket);
        listofTickets.add(metallicTicket);
        listofTickets.add(exhibitionTicket);
        listofTickets.add(newFusionCinemaTicket);
        listofTickets.add(AquaParkTickets);
        listofTickets.add(swimmingPoolTicket);
        listofTickets.add(VrCinemaTicket);
        listofTickets.add(artExhibitionTicket);
        listofTickets.add(rapConcertTicket);
        listofTickets.add(operaTicket);
        listofTickets.add(zooTicket);

        System.out.println("Sorted by price ");
        PriorityQueue<Tickets> ticketsPriorityQueue = new PriorityQueue<>();
        ticketsPriorityQueue.add(rockTicket);
        ticketsPriorityQueue.add(dramTicket);
        ticketsPriorityQueue.add(cinemaTicket);
        ticketsPriorityQueue.add(nightClubTicket);
        ticketsPriorityQueue.add(metallicTicket);
        ticketsPriorityQueue.add(exhibitionTicket);
        ticketsPriorityQueue.add(newFusionCinemaTicket);
        ticketsPriorityQueue.add(AquaParkTickets);
        ticketsPriorityQueue.add(swimmingPoolTicket);
        ticketsPriorityQueue.add(VrCinemaTicket);
        ticketsPriorityQueue.add(artExhibitionTicket);
        ticketsPriorityQueue.add(rapConcertTicket);
        ticketsPriorityQueue.add(operaTicket);
        ticketsPriorityQueue.add(zooTicket);
 Collections.sort(ticketsArrayList, new CostComparator());
        for (Tickets cost : ticketsArrayList) {

            System.out.println( cost.getPrice() +" -is cost , "+ " for the  " + cost.getTicketName());
        }
        System.out.println("_________________");


        PriorityQueue<Tickets> ticketsPriorityQueue1 = new PriorityQueue<>();
        ticketsPriorityQueue1.add(rockTicket);
        ticketsPriorityQueue1.add(dramTicket);
        ticketsPriorityQueue1.add(cinemaTicket);
        ticketsPriorityQueue1.add(nightClubTicket);
        ticketsPriorityQueue1.add(metallicTicket);
        ticketsPriorityQueue1.add(exhibitionTicket);
        ticketsPriorityQueue1.add(newFusionCinemaTicket);
        ticketsPriorityQueue1.add(AquaParkTickets);
        ticketsPriorityQueue1.add(swimmingPoolTicket);
        ticketsPriorityQueue1.add(VrCinemaTicket);
        ticketsPriorityQueue1.add(artExhibitionTicket);
        ticketsPriorityQueue1.add(rapConcertTicket);
        ticketsPriorityQueue1.add(operaTicket);
        ticketsPriorityQueue1.add(zooTicket);


        System.out.println("Sorted  by VIP status");
        Collections.sort(ticketsArrayList, new VipComparator());
        for (Tickets ticketss: ticketsArrayList){
            System.out.println( ticketss.isVip()+" :is Vip " +" ticket name  is  "+ticketss.getTicketName() );
        }






        }

    @Override
    public int compareTo(Tickets o) {
        return 0;
    }
}