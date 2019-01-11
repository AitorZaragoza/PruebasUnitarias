package kiosk;

/**
 * A class that represents the result in an election site
 */


import data.Party;

import java.util.Iterator;
import java.util.Set;
import  java.util.HashMap;

public class VoteCounter {
    HashMap<Party, Integer> partido = new HashMap<Party, Integer>();
    private int votosBlank = 0;
    private int votosNull = 0;
    private int todosvotos = 0;


    public VoteCounter(Set<Party> validParties) {

        Iterator<Party> it = validParties.iterator();
        while (it.hasNext()) {
            partido.put(it.next(), 0);
        }
    }

    public void countParty(Party party) {
        Integer counter = partido.get(party);
        counter += 1;
        partido.put(party, counter);
        todosvotos ++;

    }
    public void countNull() {
        votosNull ++;
        todosvotos ++;

    }
    public void countBlank() {
        votosBlank ++;
        todosvotos ++;

    }
    public void scrutinize(Party party) {
        if(party == null){
            countNull();
        }else if (party.getName().equals("")){
            countBlank();
        }else{
            countParty(party);
        }
    }
    public int getVotesFor(Party party) {
        return partido.get(party);

    }
    public int getNulls() {
        return votosNull;

    }
    public int getBlanks() {
        return votosBlank;

    }
    public int getTotal() {
        return todosvotos;

    }
}
