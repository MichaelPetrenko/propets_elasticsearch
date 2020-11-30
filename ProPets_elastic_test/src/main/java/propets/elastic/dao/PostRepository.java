package propets.elastic.dao;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import propets.elastic.domain.entities.Post;

public interface PostRepository extends ElasticsearchRepository<Post, String>{

}
