package it.fabrik.spring.conto.model;

import lombok.Data;

public class Bonifico {

    private String transactionId;
    private String operationId;
    private String accountingDate;
    private String valueDate;
    private Tipo type;
    private String amount;
    private String currency;
    private String description;


    public class Tipo {
        private String enumaration;
        private String value;

        public String getEnumaration() {
            return enumaration;
        }

        public void setEnumaration(String enumaration) {
            this.enumaration = enumaration;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Tipo{" +
                    "enumaration='" + enumaration + '\'' +
                    ", value='" + value + '\'' +
                    '}';
        }
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getOperationId() {
        return operationId;
    }

    public void setOperationId(String operationId) {
        this.operationId = operationId;
    }

    public String getAccountingDate() {
        return accountingDate;
    }

    public void setAccountingDate(String accountingDate) {
        this.accountingDate = accountingDate;
    }

    public String getValueDate() {
        return valueDate;
    }

    public void setValueDate(String valueDate) {
        this.valueDate = valueDate;
    }

    public Tipo getType() {
        return type;
    }

    public void setType(Tipo type) {
        this.type = type;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Bonifico{" +
                "transactionId='" + transactionId + '\'' +
                ", operationId='" + operationId + '\'' +
                ", accountingDate='" + accountingDate + '\'' +
                ", valueDate='" + valueDate + '\'' +
                ", type=" + type +
                ", amount='" + amount + '\'' +
                ", currency='" + currency + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
