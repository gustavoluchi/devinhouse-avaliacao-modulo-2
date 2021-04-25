package br.com.devinhouse.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.stereotype.Repository;

import br.com.devinhouse.model.Processo;

public interface ProcessoRepository extends JpaRepository<Processo, Long>{

  Optional<Processo> findByChaveProcesso(String chaveProcesso);
  
}
