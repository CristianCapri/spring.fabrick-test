package it.fabrik.spring.conto.model;

import java.util.List;

public class RisGetSaldo {

    private String status;
    private List<String> error;
    private Payload payload;

    public RisGetSaldo() {
    }

    public class Payload {

        private String date;
        private String balance;
        private String availableBalance;
        private String currency;

        public Payload() {
        }

        public Payload(String date, String balance, String availableBalance, String currency) {
            this.date = date;
            this.balance = balance;
            this.availableBalance = availableBalance;
            this.currency = currency;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getBalance() {
            return balance;
        }

        public void setBalance(String balance) {
            this.balance = balance;
        }

        public String getAvailableBalance() {
            return availableBalance;
        }

        public void setAvailableBalance(String availableBalance) {
            this.availableBalance = availableBalance;
        }

        public String getCurrency() {
            return currency;
        }

        public void setCurrency(String currency) {
            this.currency = currency;
        }

        @Override
        public String toString() {
            return "Payload{" +
                    "date='" + date + '\'' +
                    ", balance='" + balance + '\'' +
                    ", availableBalance='" + availableBalance + '\'' +
                    ", currency='" + currency + '\'' +
                    '}';
        }
    }

    public RisGetSaldo(String status, List<String> error, Payload payload) {
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
        return "RisGetSaldo{" +
                "status='" + status + '\'' +
                ", error=" + error +
                ", payload=" + payload +
                '}';
    }
}
