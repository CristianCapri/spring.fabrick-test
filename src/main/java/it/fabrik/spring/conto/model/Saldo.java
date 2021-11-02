package it.fabrik.spring.conto.model;

import java.util.List;

public class Saldo {
    private Long accountId;
    private String iban;
    private String abiCode;
    private String cabCode;
    private String countryCode;
    private String internationalCin;
    private String nationalCin;
    private String account;
    private String alias;
    private String productName;
    private String holderName;
    private String activatedDate;
    private String currency;
    private List<Bonifico> bonifici;

    public Saldo() {
    }

    public Saldo(Long accountId, String iban, String abiCode, String cabCode, String countryCode, String internationalCin, String nationalCin, String account, String alias, String productName, String holderName, String activatedDate, String currency, List<Bonifico> bonifici) {
        this.accountId = accountId;
        this.iban = iban;
        this.abiCode = abiCode;
        this.cabCode = cabCode;
        this.countryCode = countryCode;
        this.internationalCin = internationalCin;
        this.nationalCin = nationalCin;
        this.account = account;
        this.alias = alias;
        this.productName = productName;
        this.holderName = holderName;
        this.activatedDate = activatedDate;
        this.currency = currency;
        this.bonifici = bonifici;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getAbiCode() {
        return abiCode;
    }

    public void setAbiCode(String abiCode) {
        this.abiCode = abiCode;
    }

    public String getCabCode() {
        return cabCode;
    }

    public void setCabCode(String cabCode) {
        this.cabCode = cabCode;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getInternationalCin() {
        return internationalCin;
    }

    public void setInternationalCin(String internationalCin) {
        this.internationalCin = internationalCin;
    }

    public String getNationalCin() {
        return nationalCin;
    }

    public void setNationalCin(String nationalCin) {
        this.nationalCin = nationalCin;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public String getActivatedDate() {
        return activatedDate;
    }

    public void setActivatedDate(String activatedDate) {
        this.activatedDate = activatedDate;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public List<Bonifico> getBonifici() {
        return bonifici;
    }

    public void setBonifici(List<Bonifico> bonifici) {
        this.bonifici = bonifici;
    }

    @Override
    public String toString() {
        return "Saldo{" +
                "accountId=" + accountId +
                ", iban='" + iban + '\'' +
                ", abiCode='" + abiCode + '\'' +
                ", cabCode='" + cabCode + '\'' +
                ", countryCode='" + countryCode + '\'' +
                ", internationalCin='" + internationalCin + '\'' +
                ", nationalCin='" + nationalCin + '\'' +
                ", account='" + account + '\'' +
                ", alias='" + alias + '\'' +
                ", productName='" + productName + '\'' +
                ", holderName='" + holderName + '\'' +
                ", activatedDate='" + activatedDate + '\'' +
                ", currency='" + currency + '\'' +
                '}';
    }

    public void saveBonifico(Bonifico bonifico) {
        bonifici.add(bonifico);
    }
}
