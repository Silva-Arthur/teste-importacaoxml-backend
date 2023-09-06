package com.devarthursilva.testeimportacaoxml.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devarthursilva.testeimportacaoxml.domain.Compra;
import com.devarthursilva.testeimportacaoxml.domain.Valor;

public interface ValorRepository extends JpaRepository<Valor, Long>{

}
