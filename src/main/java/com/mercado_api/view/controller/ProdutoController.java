    package com.mercado_api.view.controller;

    import com.mercado_api.model.Produto;
    import com.mercado_api.services.ProdutoService;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.web.bind.annotation.*;

    import java.util.List;
    import java.util.Optional;

    @RestController
    @RequestMapping("/api/produtos")
    public class ProdutoController {

        @Autowired
        private ProdutoService produtoService;

        @GetMapping
        public List<Produto> obterTodos(){
            return produtoService.obterTodos();
        }

        @GetMapping("/{id}")
        public Optional<Produto> obterPorId(@PathVariable Integer id){
            return produtoService.obterPorId(id);
        }

        @PostMapping
            public Produto adicionar(@RequestBody Produto produto){
                return produtoService.adicionar(produto);
            }


        @DeleteMapping("/{id}")
        public void deletar(@PathVariable Integer id){
            produtoService.deletar(id);
        }
    }
