package com.prits.repo;

import com.prits.entity.Post;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by priteshpatel on 4/27/19.
 */
@Repository
public interface PostRepository extends PagingAndSortingRepository<Post, Long> {
}
