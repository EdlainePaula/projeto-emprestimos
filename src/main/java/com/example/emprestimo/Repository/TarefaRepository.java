package com.example.emprestimo.Repository;

import com.example.emprestimo.Model.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {

}