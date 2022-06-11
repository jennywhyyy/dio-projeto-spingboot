package me.dio.academia.digital.controller;

import me.dio.academia.digital.entity.form.AvaliacaoFisicaForm;
import me.dio.academia.digital.service.Impl.AlunoServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    private AlunoServiceImpl service;

    @GetMapping
    public list<Aluno> getAll(){
        return service.getAll()
    }

    @PostMapping
    public Aluno create(@RequestBody AlunoForm form){return service.create(form);}

    @GetMapping("/avaliacoes/{id}")
    public list<AvaliacaoFisica> getAllAvaliacaoFisicaId(@PathVariable long id){
        return service.getAllAvaliacaoFisicaId(id);
    }
}


