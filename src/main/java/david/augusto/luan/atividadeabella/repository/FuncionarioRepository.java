package david.augusto.luan.atividadeabella.repository;

import david.augusto.luan.atividadeabella.domain.Funcionario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public interface FuncionarioRepository extends CrudRepository<Funcionario, Long> {

    List<Funcionario> findAll();
}
