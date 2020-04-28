package example;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SkillRepository extends CrudRepository<Skill, Long> {
    List<Skill> findByLabel(String label);
}
