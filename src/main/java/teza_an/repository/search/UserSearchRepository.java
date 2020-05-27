package teza_an.repository.search;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import teza_an.domain.User;

/**
 * Spring Data Elasticsearch repository for the User entity.
 */
public interface UserSearchRepository extends ElasticsearchRepository<User, Long> {}
