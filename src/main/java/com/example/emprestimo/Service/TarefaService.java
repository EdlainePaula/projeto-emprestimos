package com.example.emprestimo.Service;

import com.example.emprestimo.Model.Tarefa;
import com.example.emprestimo.Repository.TarefaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TarefaService {

    private final TarefaRepository tarefaRepository;

    public TarefaService(TarefaRepository tarefaRepository) {
        this.tarefaRepository = tarefaRepository;
    }

    public List<Tarefa> listarTarefas() {
        return tarefaRepository.findAll();
    }

    public Tarefa cadastrarTarefa(Tarefa tarefa) {
        return tarefaRepository.save(tarefa);
    }
}