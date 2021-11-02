package it.fabrik.spring.conto.dao;

import it.fabrik.spring.conto.model.Saldo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Dao extends JpaRepository<Saldo, Long> {



}
