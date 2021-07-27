package designpatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class ScoreObservable {
    private String news;

    private List<NewsObserver> newsObserverList = new ArrayList<>();

    public void addObserver(NewsObserver newsObserver){
        this.newsObserverList.add(newsObserver);
    }

    public void removeObserver(NewsObserver newsObserver){
        this.newsObserverList.remove(newsObserver);
    }

    public void setNews(String news) {
        this.news = news;
        for (NewsObserver o : this.newsObserverList) {
            o.update(this.news);
        }
    }
}
