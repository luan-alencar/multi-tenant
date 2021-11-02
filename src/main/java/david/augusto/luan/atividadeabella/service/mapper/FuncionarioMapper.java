package david.augusto.luan.atividadeabella.service.mapper;

import david.augusto.luan.atividadeabella.domain.Funcionario;
import david.augusto.luan.atividadeabella.service.dto.FuncionarioDTO;
import org.mapstruct.Mapper;

@Mapper
public interface FuncionarioMapper extends MapperEntityModel<Funcionario, FuncionarioDTO> {
}
