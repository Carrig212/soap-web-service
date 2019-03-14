package me.william.soap.service;

import javax.xml.ws.Endpoint;

public class Publisher {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8000/services/Potato", new PotatoServiceImpl());
    }
}
