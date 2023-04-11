package com.geekText.geekText.Repository;
import java.util.Optional;
import com.geekText.geekText.Entity.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublisherRepo extends JpaRepository<Publisher, Integer> {
    Optional<Publisher> findByPublisher(String publisher);

}
