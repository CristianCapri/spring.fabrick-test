package it.fabrik.spring.conto.model;

import java.util.List;

public class RisGetMovimenti {
    private String status;
    private List<String> error;
    private List<Bonifico> bonifici;

    public RisGetMovimenti(String status, List<String> error, List<Bonifico> bonifici) {
        this.status = status;
        this.error = error;
        this.bonifici = bonifici;
    }

    public RisGetMovimenti() {
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

    public List<Bonifico> getBonifici() {
        return bonifici;
    }

    public void setBonifici(List<Bonifico> bonifici) {
        this.bonifici = bonifici;
    }

    @Override
    public String toString() {
        return "RisGetMovimenti{" +
                "status='" + status + '\'' +
                ", error=" + error +
                ", bonifici=" + bonifici +
                '}';
    }
}
