package assignment4_observer.model;

import assignment4_observer.view.Observers;
import java.util.ArrayList;

public class WheatherObservable {
    private ArrayList<Observers> observersArryList = new ArrayList<>();

    public void addObservers(Observers observers){
        observersArryList.add(observers);
    }

    public void removeObservers(Observers observers){
        observersArryList.remove(observers);
    }

    public void notifyObservers(){
        for(Observers observers : observersArryList){
            observers.update();
        }
    }




}
