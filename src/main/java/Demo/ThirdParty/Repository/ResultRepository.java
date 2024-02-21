package Demo.ThirdParty.Repository;

import Demo.ThirdParty.Entity.Result;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResultRepository extends JpaRepository<Result ,Long> {
}
