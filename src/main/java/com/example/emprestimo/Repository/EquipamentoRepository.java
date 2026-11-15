package com.example.emprestimo.Repository;

import com.example.emprestimo.Model.Equipamento;
import com.example.emprestimo.Model.TipoEquipamento;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EquipamentoRepository extends JpaRepository<Equipamento, Long> {

    boolean existsByPatrimonio(String patrimonio);

    List<Equipamento> findByTipo(TipoEquipamento tipo);

}