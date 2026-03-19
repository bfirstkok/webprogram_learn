package rmuti.api.service;

import org.springframework.data.mongodb.repository.MongoRepository;
import rmuti.api.table.UserProfile;
public interface BookRepository extends JpaRepository <Book , Integer >{
}
