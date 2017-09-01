package weatherORama.interfaces;

public interface Subject {

    public void registerObserver(Observer o);
    public void removeObserver(Observer O);
    public void notifyObservers();
}
