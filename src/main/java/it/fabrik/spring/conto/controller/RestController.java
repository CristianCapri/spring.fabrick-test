package it.fabrik.spring.conto.controller;

import it.fabrik.spring.conto.dao.Dao;
import it.fabrik.spring.conto.model.Bonifico;
import it.fabrik.spring.conto.model.Saldo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@org.springframework.web.bind.annotation.RestController
public class RestController {


    @Autowired
    private Dao dao;

    private Saldo saldo1 = new Saldo(Long.valueOf(14537780), "IT40L0326822311052923800661", "03268", "22311", "IT", "40", "L", "52923800661", "Test api", "Conto Websella", "LUCA TERRIBILE", "2016-12-14", "EUR", null);

    @GetMapping("getSaldo")
    public String getSaldo(@RequestHeader("accountId") String accountId) {
        if(accountId.equals("14537780")) {
            return saldo1.toString();
        }
        return null;
    }

    @PostMapping("newBonifico")
    public void newBonifico(@RequestParam("accountId") String accountId, @RequestBody Bonifico bonifico) {
        Saldo saldo = dao.getById(new Long(accountId));
        saldo.saveBonifico(bonifico);
    }

    @GetMapping("getTransazioni")
    public List<Bonifico> getTransazioni(@RequestParam("accountId") String accountId, @RequestParam("fromAccountingDate") String fromAccountingDate, @RequestParam("toAccountingDate") String toAccountingDate){
        Saldo saldo = dao.getById(new Long(accountId));
        List<Bonifico> bonifici = new ArrayList<>();
        for(Bonifico b : saldo.getBonifici()) {
            if(new Date(b.getExecutionDate()).getTime() >= new Date(fromAccountingDate).getTime() && new Date(b.getExecutionDate()).getTime() <= new Date(toAccountingDate).getTime()) {
                bonifici.add(b);
            }
        }
        return bonifici;
    }
}


