package class101.foo.io;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface PostRepository extends ElasticsearchRepository<Post, Long> {
    List<Post> findByContent(String content);

}
