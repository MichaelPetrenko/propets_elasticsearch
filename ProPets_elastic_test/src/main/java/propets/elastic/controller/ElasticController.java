package propets.elastic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import propets.elastic.dao.PostRepository;
import propets.elastic.domain.entities.Post;

@RestController
public class ElasticController {
	
	@Autowired
	PostRepository repo;
	
	@PostMapping("/")
	public void addPost(@RequestBody Post post) {
		repo.save(post);
	}

	@GetMapping("/{id}")
	public Post getPost(@PathVariable String id) {
		return repo.findById(id).get();
	}

}
