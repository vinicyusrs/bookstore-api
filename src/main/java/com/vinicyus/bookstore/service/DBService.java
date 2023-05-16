package com.vinicyus.bookstore.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vinicyus.bookstore.domain.Categoria;
import com.vinicyus.bookstore.domain.Livro;
import com.vinicyus.bookstore.repositories.CategoriaRepository;
import com.vinicyus.bookstore.repositories.LivroRepository;

@Service
public class DBService {

	@Autowired
	private CategoriaRepository categoriaRepository;
	@Autowired
	private LivroRepository livroRepository;

	public void instanciaBaseDeDados() {
		Categoria cat1 = new Categoria(null, "informática", "Livros de TI");
		Categoria cat2 = new Categoria(null, "Ficção Cientifica", "Livros de Ficção Cientifica");
		Categoria cat3 = new Categoria(null, "Biografias", "Livros de Biografias");
		Categoria cat4 = new Categoria(null, "vinicyusteste", "Livros depara delete");

		Livro l1 = new Livro(null, "Clean code", "Robert Martin", "Loren ipsun", cat1);
		Livro l2 = new Livro(null, "Eng de Software", "Louis V. Gerstner", "Loren ipsun", cat1);
		Livro l3 = new Livro(null, "The time Machine", "H.G. Wells", "Loren ipsun", cat2);
		Livro l4 = new Livro(null, "The War of the Worlds", "H.G. Wells", "Loren ipsun", cat2);
		Livro l5 = new Livro(null, "I, Robot", "Isaac Asimov", "Loren ipsun", cat3);

		cat1.getLivros().addAll(Arrays.asList(l1, l2));
		cat2.getLivros().addAll(Arrays.asList(l3, l4));
		cat3.getLivros().addAll(Arrays.asList(l5));

		this.categoriaRepository.saveAll(Arrays.asList(cat1, cat2, cat3, cat4));
		this.livroRepository.saveAll(Arrays.asList(l1, l2, l3, l4, l5));
	}

}
