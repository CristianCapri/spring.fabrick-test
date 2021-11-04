package it.fabrik.spring.conto.controller;

import it.fabrik.spring.conto.model.Bonifico;
import it.fabrik.spring.conto.model.RisGetMovimenti;
import it.fabrik.spring.conto.model.RisGetSaldo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

import java.util.*;

@RestController
public class ContoController {

    @Autowired
    private RestTemplate restTemplate;


    @GetMapping("/getSaldo")
    public Object getSaldo(@RequestParam("accountId") String accountId) {
        String url = "https://sandbox.platfr.io/api/gbs/banking/v4.0/accounts/{accountId}/balance";
        url = url.replace("{accountId}", accountId);

        HttpHeaders headers = new HttpHeaders();
        headers.set("Auth-Schema", "S2S");
        headers.set("Api-Key", "FXOVVXXHVCPVPBZXIJOBGUGSKHDNFRRQJP");
        // headers.set("accountId", "14537780");
        headers.set("X-Time-Zone", "Europe/Rome");

        HttpEntity<String> entity = new HttpEntity<>("", headers);

        ResponseEntity<RisGetSaldo> response = restTemplate.exchange(url, HttpMethod.GET, entity, RisGetSaldo.class);

        return response.getBody().getPayload().toString();
    }

    @GetMapping("/getMovimenti")
    public Object getMovimenti(@RequestParam("accountId") String accountId, @RequestParam("fromAccountingDate") String fromAccountingDate, @RequestParam("toAccountingDate") String toAccountingDate) {
        List<Object> bonifici = new ArrayList<>();
        String url ="https://sandbox.platfr.io/api/gbs/banking/v4.0/accounts?accountId={accountId}&fromAccountingDate={fromAccountingDate}&toAccountingDate={toAccountingDate}";
                //"https://sandbox.platfr.io/api/gbs/banking/v4.0/accounts?accountId={accountId}&fromAccountingDate={fromAccountingDate}&toAccountingDate={toAccountingDate}";
        url = url.replace("{accountId}", accountId);
        url = url.replace("{fromAccountingDate}", fromAccountingDate);
        url = url.replace("{toAccountingDate}", toAccountingDate);

        HttpHeaders headers = new HttpHeaders();
        headers.set("Auth-Schema", "S2S");
        headers.set("Api-Key", "FXOVVXXHVCPVPBZXIJOBGUGSKHDNFRRQJP");
        // headers.set("accountId", "14537780");
        headers.set("X-Time-Zone", "Europe/Rome");

        HttpEntity<String> entity = new HttpEntity<>("", headers);

        ResponseEntity<RisGetMovimenti> response = restTemplate.exchange(url, HttpMethod.GET, entity, RisGetMovimenti.class);

        return response.getBody().getPayload();

    }


}