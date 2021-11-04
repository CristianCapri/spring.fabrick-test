package it.fabrik.spring.conto.model;

import lombok.Data;

import java.util.List;


public class RisGetMovimenti {
    private String status;
    private List<String> error;
    private Payload payload;

    @Data
    private static class Payload {
        private List<Bonifico> list;
    }

    public RisGetMovimenti() {
    }

    public RisGetMovimenti(String status, List<String> error,Payload payload) {
        this.status = status;
        this.error = error;
        this.payload = payload;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<String> getError() {
        return error;
    }

    public void setError(List<String> error) {
        this.error = error;
    }

    public Payload getPayload() {
        return payload;
    }

    public void setPayload(Payload payload) {
        this.payload = payload;
    }

    @Override
    public String toString() {
        return "RisGetMovimenti{" +
                "status='" + status + '\'' +
                ", error=" + error +
                ", bonifici=" + payload +
                '}';
    }
}
