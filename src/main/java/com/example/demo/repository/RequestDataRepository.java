package main.java.com.example.demo.repository;

import com.example.demo.model.RequestData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RequestDataRepository extends JpaRepository<RequestData, Long> {
}