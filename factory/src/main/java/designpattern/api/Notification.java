package designpattern.api;

public interface Notification {
    void configure(String target);
    void send(String message);
}
