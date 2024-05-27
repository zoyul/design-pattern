package org.example.observer.weather3;

public interface Subject {
    public void registerObserver(Observer o);   // 옵저버 등록
    public void removeObserver(Observer o);     // 옵저버 제거
    public void notifyObservers();
}
